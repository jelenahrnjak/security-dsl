package org.xtext.securitydsl.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import security_dsl.Application
import org.eclipse.emf.ecore.resource.Resource
import security_dsl.Authentication
import security_dsl.EEndpointType
import security_dsl.User
import java.util.List
import security_dsl.Attribute
import security_dsl.Role
import security_dsl.RoleInstance

class SecurityDslBasicAuthenticationGenerator {

	new(Resource resource, IFileSystemAccess2 fsa, Application app, String srcDestination){
		
    	var user = resource.allContents.filter(User).next() 
    	var role = resource.allContents.filter(Role).next() 
    	
    	for (c : app.app_controllers) {
    		if(c instanceof Authentication){
    		fsa.generateFile(srcDestination + '/config/ApplicationSecurityConfig.java', generateApplicationSecurityConfig(app.packageName, c))    	
    		}
    		
    	}
    	
    	fsa.generateFile(srcDestination + '/dto/UserRequestDTO.java', generateUserRequestDto(app.packageName, user));
    	
		fsa.generateFile(srcDestination + '/config/PasswordEncoder.java', generatePassEncoder(app.packageName + '.config'));
		fsa.generateFile(srcDestination + '/service/IUserService.java', generateIUserService(app.packageName));
		fsa.generateFile(srcDestination + '/service/impl/UserServiceImpl.java', generateUserServiceImpl(app.packageName));
		fsa.generateFile(srcDestination + '/service/impl/UserServiceImpl.java', generateUserServiceImpl(app.packageName));
		fsa.generateFile(srcDestination + '/model/enumeration/Role.java', generateRoleEnumeration(app.packageName, role.role_instances));
		
	}
	
	def generateIUserService(String packageName) {
		
		var content = '''
		package '''+ packageName + '''
		.service;
		
		import '''+ packageName + '''
		.model.User;
		
		import java.util.List;
		
		public interface IUserService {
		
			User save(User user);

			List<User> findAll();
		
		}
		'''
		return content
	}
	
	def generateUserServiceImpl(String packageName){
		
		var content = '''
		package ''' + packageName + '''
		.service.impl;
		
		import  ''' + packageName + '''
		.model.User;
		import ''' + packageName + '''
		.repository.UserRepository;
		import ''' + packageName + '''
		.service.IUserService;
		
		import lombok.RequiredArgsConstructor;
		import org.springframework.beans.factory.annotation.Autowired;
		import org.springframework.security.core.userdetails.UserDetails;
		import org.springframework.security.core.userdetails.UserDetailsService;
		import org.springframework.security.core.userdetails.UsernameNotFoundException;
		import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
		import org.springframework.stereotype.Service;
		
		import java.util.List;
		
		@RequiredArgsConstructor(onConstructor = @__(@Autowired))
		@Service
		public class UserServiceImpl implements UserDetailsService, IUserService {
		
		    private final UserRepository userRepository;
		    private final BCryptPasswordEncoder bCryptPasswordEncoder;
			
			@Override
		    public User save(User newUser) {
		    	if (userRepository.findByUsername(newUser.getUsername()).isPresent()) {
		    		throw new RuntimeException("User already exists");

		    		}
		        String encoderPassword = bCryptPasswordEncoder.encode(newUser.getPassword());
		        newUser.setPassword(encoderPassword);
		        
		    	return userRepository.saveAndFlush(newUser);
		    }
		
		    @Override
		    public List<User> findAll() {
		        return userRepository.findAll();
		    }
		    
		  	@Override
		 	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		 	return userRepository.findByUsername(username)
		 		.orElseThrow(() ->
		 		new UsernameNotFoundException("User Not Found"));
		 	}
		 }
		'''

		return content
	}

	def generateApplicationSecurityConfig(String packageName, Authentication authController){
		
		var regEndpoint = ''
		var loginEndpoint = ''
		var logoutEndpoint = ''
		
		for (e : authController.controller_endpoints) {
			if(e.type == EEndpointType::REGISTRATION) regEndpoint = authController.path + e.url
			if(e.type == EEndpointType::LOGIN) loginEndpoint = authController.path + e.url
			if(e.type == EEndpointType::LOGOUT) logoutEndpoint = authController.path + e.url
		}
		
		var content = '''
		package ''' + packageName + '''
		.config;
		
		import ''' + packageName + '''
		.service.impl.UserServiceImpl;
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
		                .authorizeRequests().antMatchers("''' + regEndpoint + '''
		" , "''' + loginEndpoint  + '''", "''' + logoutEndpoint + '''").permitAll()
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
	package ''' + packageName + ''';

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
	
	def generateUserRequestDto(String packageName, User user){
		
		var content = '''
		package ''' + packageName + '''
		.dto;
		
		import ''' + packageName + '''
		.model.enumeration.Role;
		
		import lombok.*;
		
		@Getter
		@Setter
		@ToString
		@AllArgsConstructor
		@NoArgsConstructor
		public class UserRequestDTO {

		''' + generateAttributes(user.model_attributes) + 
		'''
			private String password;
		
		    private Role role;
		}
		
		'''	
		return content;
	}
	
	def generateAttributes(List<Attribute> attributes){
		var content = ''
		
		for(a : attributes){
			if(!a.isIdentifier){
			content += '''    private ''' + a.type +  ''' ''' + a.name+ 
			''';

			'''}
		}
		
		return content
	}
		
	def generateRoleEnumeration(String packageName, List<RoleInstance> roleInstances){
		var content = '''
		package ''' + packageName + '''
		.model.enumeration;
		
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