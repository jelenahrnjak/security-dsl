package org.xtext.securitydsl.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import security_dsl.Application
import security_dsl.User
import security_dsl.Role
import security_dsl.Attribute
import java.util.ArrayList
import java.util.List
import security_dsl.EType
import security_dsl.Security
import security_dsl.JWT
import security_dsl.BasicAuthentication
import security_dsl.RoleInstance

class SecurityDslModelRepoGenerator  {
	
	var String packageName;
	var String credentialUser
	
	new(IFileSystemAccess2 fsa, Application app, String srcDestination, User user, Role role){
		
		this.packageName = app.packageName
		this.credentialUser = SecurityDslGenerator.getCredential(user.model_attributes).name
		
   		if(user.tableName === null) user.tableName = "users"
   		fsa.generateFile(srcDestination + '/model/User.java', generateUserModel(user, app.app_security));
   		fsa.generateFile(srcDestination + '/repository/UserRepository.java', generateUserRepository(user));
   	    fsa.generateFile(srcDestination + '/dto/UserRequestDTO.java', generateUserRequestDto(user));
   	    fsa.generateFile(srcDestination + '/dto/AuthenticationRequestDTO.java', generateAuthenticationRequestDTO())
       	  
       	if (app.app_security instanceof JWT) {
			var stringAttribute = getStringAttributeForRole(role.model_attributes).name
			var roleId = getIdentifier(role.model_attributes).name
       		fsa.generateFile(srcDestination + '/model/Role.java', generateRoleModel(role, stringAttribute));
       		fsa.generateFile(srcDestination + "/repository/RoleRepository.java" ,  generateRoleRepository(role, stringAttribute));
       		fsa.generateFile(app.artifact + '/src/main/resources/data.sql', generateSQLScript(role.tableName, stringAttribute, role.role_instances, roleId));
       		
		}
	}
	
	def String generateAuthenticationRequestDTO()'''
		package «packageName».dto;
		
		import lombok.*;
		
		@Getter
		@Setter
		@ToString
		@AllArgsConstructor
		@NoArgsConstructor
		
		public class AuthenticationRequestDTO {
			
		    private String «credentialUser»;
		    private String password;
		    
		}
		'''
	
	def generateUserRepository(User user)'''
		package «packageName».repository;
		
		import java.util.Optional;
		import org.springframework.data.jpa.repository.JpaRepository;
		
		import «packageName».model.User;
		
		public interface UserRepository extends JpaRepository<User, «getIdentifier(user.model_attributes).type»> {
			
		    Optional<User> findBy«credentialUser.toFirstUpper»(String «credentialUser»);

		}
		'''
	
	def String generateRoleRepository( Role role, String stringAttribute)'''
		package «packageName».repository;
		
		import java.util.List;
		import org.springframework.data.jpa.repository.JpaRepository;
		
		import «packageName».model.Role;

		public interface RoleRepository extends JpaRepository<Role, «getIdentifier(role.model_attributes).type»> {
			
			List<Role> findBy«stringAttribute.toFirstUpper»(String «stringAttribute»);
		}
		'''
	
	def generateUserRequestDto(User user)'''
		package «packageName».dto;
		
		import lombok.*;
		
		@Getter
		@Setter
		@ToString
		@AllArgsConstructor
		@NoArgsConstructor
		public class UserRequestDTO {

			«generateAttributesForDto(user.model_attributes)»
		    private String password;

			private String role;

		}
		'''	
	
	def generateAttributesForDto(List<Attribute> attributes)'''
		«FOR a : attributes»
			«IF !a.isIdentifier»
					private «a.type» «a.name»;
					
			«ENDIF»
		«ENDFOR»
		'''
	
	def generateUserModel(User user, Security security)'''
		package «packageName».model;
		
		«IF security instanceof BasicAuthentication»
		import «packageName».model.enumeration.Role;
		«ENDIF»
		
		«IF security instanceof JWT»
		import java.sql.Timestamp;
		import java.util.Date;
		import java.util.List;
		«ELSEIF security instanceof BasicAuthentication»
		import java.util.ArrayList;
		«ENDIF»
		import java.util.Collection;
		
		«IF security instanceof JWT»
		import javax.persistence.FetchType;
		import javax.persistence.JoinColumn;
		import javax.persistence.JoinTable;
		import javax.persistence.ManyToMany;
		«ELSEIF security instanceof BasicAuthentication»
		import javax.persistence.EnumType;
		import javax.persistence.Enumerated;
		«ENDIF»
		import javax.persistence.Column;
		import javax.persistence.Entity;
		import javax.persistence.GeneratedValue;
		import javax.persistence.Id;
		import javax.persistence.Table;
		import lombok.Getter;
		import lombok.Setter;
		
		import org.springframework.security.core.GrantedAuthority;
		«IF security instanceof BasicAuthentication»
		import org.springframework.security.core.authority.SimpleGrantedAuthority;
		«ENDIF»
		import org.springframework.security.core.userdetails.UserDetails;
		
		import com.fasterxml.jackson.annotation.JsonIgnore;
		
		@Getter
		@Setter
		@Entity
		@Table(name="«user.tableName»")
		public class User implements UserDetails {
		
		    private static final long serialVersionUID = 1L;
			
			«generateAttributes(user.model_attributes)»

			«IF security instanceof JWT»
			@JsonIgnore
			@Column(name = "password")
			private String password;
			
			@Column(name = "enabled")
			private boolean enabled;
			
			@Column(name = "last_password_reset_date")
			private Timestamp lastPasswordResetDate;
			
			@ManyToMany(fetch = FetchType.EAGER)
			@JoinTable(name = "user_role",
			        joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
			        inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
			private List<Role> roles;
			
			public void setPassword(String password) {
			    Timestamp now = new Timestamp(new Date().getTime());
			    this.setLastPasswordResetDate(now);
			    this.password = password;
			}
			
			@JsonIgnore
			@Override
			public Collection<? extends GrantedAuthority> getAuthorities() {
			    return this.roles;
			}
			
			@Override
			public boolean isEnabled() {
			    return enabled;
			}
			
			@JsonIgnore
			@Override
			public boolean isAccountNonExpired() {
			    return true;
			}
			
			@JsonIgnore
			@Override
			public boolean isAccountNonLocked() {
			    return true;
			}
			
			@JsonIgnore
			@Override
			public boolean isCredentialsNonExpired() {
			    return true;
			}
			«ELSEIF security instanceof BasicAuthentication»
			private String password;
					
			@Enumerated(EnumType.STRING)
			private Role role;
			
			@JsonIgnore
			@Override
			public boolean isEnabled() {
				return true;
			}
			
			@JsonIgnore
			@Override
			public boolean isCredentialsNonExpired() {
				return true;
			}
			
			@JsonIgnore
			@Override
			public boolean isAccountNonLocked() {
				return true;
			}
			
			@JsonIgnore
			@Override
			public boolean isAccountNonExpired() {
				return true;
			}
			
			@JsonIgnore
			@Override
			public Collection<? extends GrantedAuthority> getAuthorities() {
				Collection<GrantedAuthority> authorities = new ArrayList<>();
				authorities.add(new SimpleGrantedAuthority(role.getAuthority()));
				return authorities;
			}
			
			
			@Override
			public String getPassword() {
				// TODO Auto-generated method stub
				return password;
			}
			
			@Override
			public String getUsername() {
				// TODO Auto-generated method stub
				return «credentialUser»;
			}
		«ENDIF»
		}
		'''
	
	def generateRoleModel(Role role, String stringAttribute)'''
		package «packageName».model;
		
		import lombok.Getter;
		import lombok.Setter;
		
		import com.fasterxml.jackson.annotation.JsonIgnore;
		import org.springframework.security.core.GrantedAuthority;
		
		import javax.persistence.*;
		
		@Getter
		@Setter
		@Entity
		@Table(name="«role.tableName»")
		public class Role implements GrantedAuthority {
		
		    private static final long serialVersionUID = 1L;
		    
		    «generateAttributes(role.model_attributes)»
		    @JsonIgnore
		    @Override
		    public String getAuthority() {
		    	return «stringAttribute»;
		    }

		}
		'''
		
	def generateAttributes(List<Attribute> unsortedAttributes){
		
		val ArrayList<Attribute> attributes = newArrayList	
		
		for (a : unsortedAttributes) {
		    if (a.isIdentifier) {
		        attributes.add(0, a)
		    } else {
		        attributes.add(a)
		    }
		}
		
		return '''    
			@Id
			@GeneratedValue
    		«FOR a : attributes»
				«IF a.collumnName !== null»@Column(name = "«a.collumnName»")
    			«ENDIF»
				private «a.type» «a.name»;
				
    		«ENDFOR»
			'''
	}
	
	
	def generateSQLScript(String tableName, String stringAttribute, List<RoleInstance> rInstances, String id)'''
		«FOR role : rInstances»
		INSERT INTO «tableName.toUpperCase» («id», «stringAttribute») VALUES («rInstances.indexOf(role) + 1», '«role.name»');
		«ENDFOR»
	'''
	
	def getIdentifier(List<Attribute> attributes){
		
		for (a : attributes) {
		    if (a.isIdentifier) {
		        return a
		    } 
		}
		
	}
	
	def getStringAttributeForRole(List<Attribute> unsortedAttributes){
		
		val ArrayList<Attribute> attributes = newArrayList	
		
		for (a : unsortedAttributes) {
		    if (a.isIdentifier) {
		        attributes.add(0, a)
		    } else {
		        attributes.add(a)
		    }
		}
		
		for(a : attributes){
			if(a.type == EType::STRING)
			return a;
		}
	}
}