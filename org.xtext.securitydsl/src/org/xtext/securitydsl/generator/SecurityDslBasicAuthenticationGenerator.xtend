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
		
    	var roles = resource.allContents.filter(Role)
    	
    	for (c : app.app_controllers) {
    		if(c instanceof Authentication){
    		fsa.generateFile(srcDestination + '/config/ApplicationSecurityConfig.java', generateApplicationSecurityConfig(app.packageName, c))    	
    		}
    	}
    	
		//fsa.generateFile(srcDestination + '/config/PasswordEncoder.java', generatePassEncoder(app.packageName));
		fsa.generateFile(srcDestination + '/exception/ResourceConflictException.java', generateException(app.packageName))
		
		if(roles.hasNext()){
			var role = roles.next()
			fsa.generateFile(srcDestination + '/model/enumeration/Role.java', generateRoleEnumeration(app.packageName, role.role_instances));
		}
		
		
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
	
	def generateApplicationSecurityConfig(String packageName, Authentication authController)'''
		package «packageName».config;
		
		import «packageName».service.impl.UserServiceImpl;
		
		import uns.ftn.securityDsl.service.impl.UserServiceImpl;
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

		@Configuration
		@EnableWebSecurity
		public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {
		
			@Autowired
		    private  BCryptPasswordEncoder bCryptPasswordEncoder;
			@Autowired
		    private  UserServiceImpl userService;
		
		    @Bean
		    public BCryptPasswordEncoder bCryptPasswordEncoder() {
		        return new BCryptPasswordEncoder();
		    }
		
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
		
	def generateRoleEnumeration(String packageName, List<RoleInstance> roleInstances)'''
		package «packageName».model.enumeration;

		public enum Role {

			«FOR i : 0 .. (roleInstances.size - 1)»
			«roleInstances.get(i).name»
		«IF i != roleInstances.size - 1»
		,
		«ELSEIF i == roleInstances.size - 1 && roleInstances.size != 0»
		;
		«ENDIF»
			«ENDFOR»

		    public String getAuthority() {
				return this.name();
			}
		}
		'''
		
}