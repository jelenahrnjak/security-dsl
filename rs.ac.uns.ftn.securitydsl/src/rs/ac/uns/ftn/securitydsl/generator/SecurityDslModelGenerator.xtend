package rs.ac.uns.ftn.securitydsl.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import security_dsl.Application
import security_dsl.User
import security_dsl.Role
import security_dsl.Attribute
import org.eclipse.emf.ecore.resource.Resource
import java.util.ArrayList
import java.util.List
import security_dsl.EType

class SecurityDslModelGenerator  {
	
	new(Resource resource, IFileSystemAccess2 fsa, Application app, String srcDestination){
		
	    var users = resource.allContents.filter(User) 
	    var roles = resource.allContents.filter(Role) 
	    
       	if (users.hasNext()) {
       		var user = users.next()
       		if(user.tableName === null) user.tableName = "users"
       		fsa.generateFile(srcDestination + '/model/User.java', generateUserModel(app.packageName, user));
       		
		}
        
       	if (roles.hasNext()) {
       		var role = roles.next()
       		if(role.tableName === null) role.tableName = "roles"
       		fsa.generateFile(srcDestination + '/model/Role.java', generateRoleModel(app.packageName, role));
       		
		}
	}
	
	def generateUserModel(String appMainPackage, User user) {
	
		var userContent =  '''
		package ''' + appMainPackage+ '''
		.model;
		
		import java.sql.Timestamp;
		import java.util.Collection;
		import java.util.Date;
		import java.util.List;
		
		import javax.persistence.Column;
		import javax.persistence.Entity;
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
		import org.springframework.security.core.userdetails.UserDetails;
		
		import com.fasterxml.jackson.annotation.JsonIgnore;
		
		@Getter
		@Setter
		@Entity
		@Table(name="''' + user.tableName + '''")
public class User implements UserDetails {
		
    private static final long serialVersionUID = 1L;
			
			'''
		
		userContent += generateAttributes(user.model_attributes)
		
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
    
		'''
		
		userContent += '''
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
		
		}
		'''
		
		return userContent;
	}
	
	def generateRoleModel(String appMainPackage, Role role) {
		var content = '''
		package ''' + appMainPackage+ '''
		.model;
		
		import lombok.Getter;
		import lombok.Setter;
		
		import com.fasterxml.jackson.annotation.JsonIgnore;
		import org.springframework.security.core.GrantedAuthority;
		
		import javax.persistence.*;
		
		@Getter
		@Setter
		@Entity
		@Table(name="''' + role.tableName + '''")
public class Role implements GrantedAuthority {
		
    private static final long serialVersionUID = 1L;
		
		    '''
		content += generateAttributes(role.model_attributes)
		    		
		var stringAttribute = getStringAttributeForRole(role.model_attributes)
		
		content += '''    @JsonIgnore
    @Override
    public String getAuthority() {
    	return ''' + stringAttribute.name + ''';
    }

}'''
		
		return content;
	}
	
	def getStringAttributeForRole(List<Attribute> unsortedAttributes){
		
		val ArrayList<Attribute> attributes = newArrayList	
		
		for (a : unsortedAttributes) {
		    if (a.isIsIdentifier) {
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
		    if (a.isIsIdentifier) {
		        attributes.add(0, a)
		    } else {
		        attributes.add(a)
		    }
		}
		
		var content = '''    @Id
		'''
		
		for (attribute : attributes) {
			if(attribute.collumnName !== null) content += '''    @Column(name = "'''+ attribute.collumnName + '''")
			'''
			
			content += '''    private '''+ (attribute.type.toString()).substring(0, 1).toUpperCase() + (attribute.type.toString()).substring(1).toLowerCase() + 
			     ' ' + attribute.name + '''
			;
			
			'''
		}
		
		return content;
	}
}