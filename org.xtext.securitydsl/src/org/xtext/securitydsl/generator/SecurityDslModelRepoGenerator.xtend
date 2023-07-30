package org.xtext.securitydsl.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import security_dsl.Application
import security_dsl.User
import security_dsl.Role
import security_dsl.Attribute
import org.eclipse.emf.ecore.resource.Resource
import java.util.ArrayList
import java.util.List
import security_dsl.EType
import security_dsl.Security
import security_dsl.JWT
import security_dsl.BasicAuthentication
import security_dsl.RoleInstance

class SecurityDslModelRepoGenerator  {
	
	new(Resource resource, IFileSystemAccess2 fsa, Application app, String srcDestination){
		
	    var users = resource.allContents.filter(User) 
	    var roles = resource.allContents.filter(Role) 
	    
       	if (users.hasNext()) {
       		var user = users.next()
			var credentialNameUser = getCredential(user.model_attributes).name
       		if(user.tableName === null) user.tableName = "users"
       		fsa.generateFile(srcDestination + '/model/User.java', generateUserModel(app.packageName, user, app.app_security, credentialNameUser));
       		fsa.generateFile(srcDestination + '/repository/UserRepository.java', generateUserRepository(app.packageName, user, credentialNameUser));
       	    fsa.generateFile(srcDestination + '/dto/UserRequestDTO.java', generateUserRequestDto(app.packageName, user));
       	    fsa.generateFile(srcDestination + '/dto/AuthenticationRequestDTO.java', generateAuthenticationRequestDTO(app.packageName, credentialNameUser))
       	    
		}
        
        
       	if (roles.hasNext() && app.app_security instanceof JWT) {
       		var role = roles.next()
       		if(role.tableName === null) role.tableName = "roles"
			var stringAttribute = getStringAttributeForRole(role.model_attributes).name
			var roleId = getIdentifier(role.model_attributes).name
       		fsa.generateFile(srcDestination + '/model/Role.java', generateRoleModel(app.packageName , role));
       		fsa.generateFile(srcDestination + "/repository/RoleRepository.java" ,  generateRoleRepository(app.getPackageName(), role, stringAttribute));
       		fsa.generateFile(app.artifact + '/src/main/resources/data.sql', generateSQLScript(role.tableName, stringAttribute, role.role_instances, roleId));
       		
		}
	}
	
	
	def String generateAuthenticationRequestDTO(String packageName, String credentialNameUser){
		var content = '''
		package «packageName».dto;
		
		public class AuthenticationRequestDTO {
			
		    private String «credentialNameUser»;
		    private String password;
		
		    public AuthenticationRequestDTO() {
		        super();
		    }
		
		    public AuthenticationRequestDTO(String «credentialNameUser», String password) {
		        this.set«credentialNameUser.toFirstUpper»(«credentialNameUser»);
		        this.setPassword(password);
		    }
		
		    public String get«credentialNameUser.toFirstUpper»() {
		        return this.«credentialNameUser»;
		    }
		
		    public void set«credentialNameUser.toFirstUpper»(String «credentialNameUser») {
		        this.«credentialNameUser»= «credentialNameUser»;
		    }
		
		    public String getPassword() {
		        return this.password;
		    }
		
		    public void setPassword(String password) {
		        this.password = password;
		    }
		}
		'''
		return content;
	}
	
	def generateUserRepository(String packageName, User user, String credentialName) {
		
		var content = '''
		package «packageName».repository;
		
		import java.util.Optional;
		import org.springframework.data.jpa.repository.JpaRepository;
		
		import «packageName».model.User;
		
		public interface UserRepository extends JpaRepository<User, «getIdentifier(user.model_attributes).type»> {
			
		    Optional<User> findBy«credentialName.toFirstUpper»(String «credentialName»);

		}
				'''
				return content;
	}
	
	def String generateRoleRepository(String packageName, Role role, String stringAttribute){
		
		
		var content = '''
		package «packageName».repository;
		
		import java.util.List;
		import org.springframework.data.jpa.repository.JpaRepository;
		
		import «packageName».model.Role;

		public interface RoleRepository extends JpaRepository<Role, «getIdentifier(role.model_attributes).type»> {
			
			List<Role> findBy«stringAttribute.toFirstUpper»(String «stringAttribute»);
		}
		'''
		return content;
	}
	
	def generateUserRequestDto(String packageName, User user){
		
		var content = '''
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
		
		return content;
	}
	
	def generateAttributesForDto(List<Attribute> attributes){
		var content = ''
		
		for(a : attributes){
			if(!a.isIdentifier){
			content += '''private «a.type» «a.name»;

			'''}
		}
		
		return content
	}
	
	def generateUserModel(String packageName, User user, Security security, String credentialName) {
		
		
		var userContent =  '''
		package «packageName».model;
		
		'''
		
		if(security instanceof BasicAuthentication){
			userContent +=  '''
			import «packageName».model.enumeration.Role;

			'''
		}
			
		
		userContent += '''
		import java.sql.Timestamp;
		import java.util.ArrayList;
		import java.util.Collection;
		import java.util.Date;
		import java.util.List;
		
		import javax.persistence.Column;
		import javax.persistence.Entity;
		import javax.persistence.EnumType;
		import javax.persistence.Enumerated;
		import javax.persistence.FetchType;
		import javax.persistence.GeneratedValue;
		import javax.persistence.GenerationType;
		import javax.persistence.Id;
		import javax.persistence.JoinColumn;
		import javax.persistence.JoinTable;
		import javax.persistence.ManyToMany;
		import javax.persistence.Table;
		import lombok.Getter;
		import lombok.Setter;
		
		import org.springframework.security.core.GrantedAuthority;
		import org.springframework.security.core.authority.SimpleGrantedAuthority;
		import org.springframework.security.core.userdetails.UserDetails;
		
		import com.fasterxml.jackson.annotation.JsonIgnore;
		
		@Getter
		@Setter
		@Entity
		@Table(name="«user.tableName»")
		public class User implements UserDetails {
		
		    private static final long serialVersionUID = 1L;
		
			'''
		
		userContent += generateAttributes(user.model_attributes)
		
		if(security instanceof JWT) {
		userContent += '''    @JsonIgnore
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

'''
}
		if (security instanceof BasicAuthentication){
			userContent += '''    private String password;
			
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
		return «credentialName»;
	}
			'''
		}
		userContent += '}'		
		return userContent;
	}
	
	def generateRoleModel(String packageName, Role role) {
		var content = '''
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
		
		    '''
		content += generateAttributes(role.model_attributes)
		    		
		var stringAttribute = getStringAttributeForRole(role.model_attributes)
		
		content += '''    @JsonIgnore
    @Override
    public String getAuthority() {
    	return «stringAttribute.name»;
    }

}'''
		
		return content;
	}
	
	def getIdentifier(List<Attribute> attributes){
		
		for (a : attributes) {
		    if (a.isIdentifier) {
		        return a
		    } 
		}
		
	}
	
	def getCredential(List<Attribute> attributes){
		
		for (a : attributes) {
		    if (a.isCredential) {
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
	
	def generateAttributes(List<Attribute> unsortedAttributes){
		
		val ArrayList<Attribute> attributes = newArrayList	
		
		for (a : unsortedAttributes) {
		    if (a.isIdentifier) {
		        attributes.add(0, a)
		    } else {
		        attributes.add(a)
		    }
		}
		
		var content = '''    @Id
    @GeneratedValue
		'''
		
		for (attribute : attributes) {
			if(attribute.collumnName !== null) content += '''    @Column(name = "«attribute.collumnName»")
			'''
			content += '''    private «attribute.type»  «attribute.name»;

			'''
		}
		
		return content;
	}
	
	
	def generateSQLScript(String tableName, String stringAttribute, List<RoleInstance> rInstances, String id)'''
		«FOR role : rInstances»
		INSERT INTO «tableName.toUpperCase» («id», «stringAttribute») VALUES («rInstances.indexOf(role) + 1», '«role.name»');
		«ENDFOR»
	'''
}