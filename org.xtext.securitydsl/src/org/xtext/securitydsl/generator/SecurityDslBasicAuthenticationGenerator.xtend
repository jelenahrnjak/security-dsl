package org.xtext.securitydsl.generator

import java.util.List
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import security_dsl.Application
import security_dsl.Authentication
import security_dsl.Role
import security_dsl.RoleInstance

class SecurityDslBasicAuthenticationGenerator {

	new(Resource resource, IFileSystemAccess2 fsa, Application app, String srcDestination){
		
    	var role = resource.allContents.filter(Role).next() 
    	
    	for (c : app.app_controllers) {
    		if(c instanceof Authentication){
    		fsa.generateFile(srcDestination + '/config/ApplicationSecurityConfig.java', generateApplicationSecurityConfig(app.packageName, c))    	
    		}
    		
    	}
    	
    	
		fsa.generateFile(srcDestination + '/config/PasswordEncoder.java', generatePassEncoder(app.packageName));
		fsa.generateFile(srcDestination + '/model/enumeration/Role.java', generateRoleEnumeration(app.packageName, role.role_instances));
		fsa.generateFile(srcDestination + '/exception/ResourceConflictException.java', generateException(app.packageName))
		
		
	}
	
	def String generateException(String packageName){
		var content = '''
		package «packageName».exception;
		
		public class ResourceConflictException extends RuntimeException {
			private static final long serialVersionUID = 1791564636123821405L;
		
			private Long resourceId;
		
			public ResourceConflictException(Long resourceId, String message) {
				super(message);
				this.setResourceId(resourceId);
			}
		
			public Long getResourceId() {
				return resourceId;
			}
		
			public void setResourceId(Long resourceId) {
				this.resourceId = resourceId;
			}
		
		}
		'''
		return content;
	}
	
	def generateApplicationSecurityConfig(String packageName, Authentication authController){
		
		var content = '''
		package «packageName».config;
		
		import «packageName».service.impl.UserServiceImpl;
		import lombok.RequiredArgsConstructor;
		import org.springframework.beans.factory.annotation.Autowired;
		import org.springframework.context.annotation.Bean;
		import org.springframework.context.annotation.Configuration;
		import org.springframework.security.authentication.AuthenticationManager;
		import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
		import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
		import org.springframework.security.config.annotation.web.builders.HttpSecurity;
		import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
		import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
		import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
		
		@RequiredArgsConstructor(onConstructor = @__(@Autowired))
		@Configuration
		@EnableWebSecurity
		public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {
		
		    private final BCryptPasswordEncoder bCryptPasswordEncoder;
		    private final UserServiceImpl userService;
		
		
		    @Override
		    protected void configure(HttpSecurity httpSecurity) throws Exception {
		        httpSecurity.csrf().disable()
		                .formLogin().disable()
		                .logout().disable()
		                .authorizeRequests().antMatchers("«authController.path»/**").permitAll()
		                .anyRequest().authenticated()
		                .and().httpBasic();
		
		    }
		
		    @Autowired
		    public void config(AuthenticationManagerBuilder authentication)
		            throws Exception
		    {
		        authentication.authenticationProvider(daoAuthenticationProvider());
		    }
		    
			@Bean
			@Override
			public AuthenticationManager authenticationManagerBean() throws Exception {
				return super.authenticationManagerBean();
			}

		    @Bean
		    public DaoAuthenticationProvider daoAuthenticationProvider(){
		        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		        provider.setPasswordEncoder(bCryptPasswordEncoder);
		        provider.setUserDetailsService(userService);
		        return provider;
		    }
		
		}
		'''
	
		return content;
	}
	
	def generatePassEncoder(String packageName){
	
		var content = ''
		content =  '''
		package «packageName».config;

		import org.springframework.context.annotation.Bean;
		import org.springframework.context.annotation.Configuration;
		import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
		
		@Configuration
		public class PasswordEncoder {
		
		    @Bean
		    public BCryptPasswordEncoder bCryptPasswordEncoder(){
		        return new BCryptPasswordEncoder();
		    }
		}
			'''
		
		return content;
	}
	
	def generateRoleEnumeration(String packageName, List<RoleInstance> roleInstances){
		var content = '''
		package «packageName».model.enumeration;
		
		public enum Role {
		
		''' 
		for (var  i = 0 ; i <roleInstances.size; i++) {
			
			content += '    ' + roleInstances.get(i).name.toUpperCase
			
			if(i != roleInstances.size - 1)
				content+= ''',
				'''
			
		}
		
		if(roleInstances.size != 0)
			content += ''';
			'''
		
		
		content += '''    public String getAuthority() {
    	return this.name();
    }
}
		'''
		
		return content
	}
		
}