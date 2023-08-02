package org.xtext.securitydsl.generator

import java.util.List
import org.eclipse.xtext.generator.IFileSystemAccess2
import security_dsl.Authentication
import security_dsl.RoleInstance

class SecurityDslBasicAuthenticationGenerator {

	var String packageName;
	
	new(IFileSystemAccess2 fsa, String packageName, String srcDestination, Authentication authController, List<RoleInstance> roleInstances){
		
		this.packageName = packageName
    	
    	fsa.generateFile(srcDestination + '/config/ApplicationSecurityConfig.java', generateApplicationSecurityConfig(authController))    
		fsa.generateFile(srcDestination + '/model/enumeration/Role.java', generateRoleEnumeration(roleInstances));
		
		
	}
	
	def generateApplicationSecurityConfig(Authentication authController)'''
		package «packageName».config;
		
		import «packageName».service.impl.UserServiceImpl;
		
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
		
	def generateRoleEnumeration(List<RoleInstance> roleInstances)'''
		package «packageName».model.enumeration;

		public enum Role {

		«FOR i : 0 .. (roleInstances.size - 1)»
			«roleInstances.get(i).name»
		«IF i != roleInstances.size - 1»,
		«ELSEIF i == roleInstances.size - 1 && roleInstances.size != 0»;
		«ENDIF»
		«ENDFOR»

		    public String getAuthority() {
				return this.name();
			}
		}
		'''
		
}