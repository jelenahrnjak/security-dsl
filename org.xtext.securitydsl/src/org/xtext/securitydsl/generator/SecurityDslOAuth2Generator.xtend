package org.xtext.securitydsl.generator

import org.eclipse.xtext.generator.IFileSystemAccess2

class SecurityDslOAuth2Generator {
	
	var packageName = ''
	
	new(IFileSystemAccess2 fsa, String packageName, String srcDestination){
		
		this.packageName = packageName

		fsa.generateFile(srcDestination + '/config/SecurityConfig.java', generateSecurityConfig())
		fsa.generateFile(srcDestination + '/controller/TestController.java', generateTestController())
		
	}
	
	def generateSecurityConfig()'''
		package «packageName».config;
		
		import org.springframework.context.annotation.Bean;
		import org.springframework.context.annotation.Configuration;
		import org.springframework.security.config.annotation.web.builders.HttpSecurity;
		import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
		import org.springframework.security.web.SecurityFilterChain;
		import static org.springframework.security.config.Customizer.withDefaults;
		
		@Configuration
		@EnableWebSecurity
		public class SecurityConfig {
		
		    @Bean
		    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		        return http
		                .authorizeHttpRequests(auth -> {
		                    auth.antMatchers("/").permitAll();
		                    auth.anyRequest().authenticated();
		                })
		                .oauth2Login(withDefaults())
		                .formLogin(withDefaults())                
		                .build();
		    }
		}
		'''	
		
	def generateTestController()'''
		package «packageName».controller;
		
		import org.springframework.web.bind.annotation.GetMapping;
		import org.springframework.web.bind.annotation.RestController;
		
		@RestController
		public class TestController{
		
		
			@GetMapping("/")
			public String home(){
				return "Hello, guest!";
			
			}	
			
			@GetMapping("/secured")
			public String secured(){
				return "Hello, user!";
			
			}
			
		}
	'''

}