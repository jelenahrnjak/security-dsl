package org.xtext.securitydsl.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import security_dsl.Application
import org.eclipse.emf.ecore.resource.Resource
import security_dsl.Authentication
import security_dsl.EEndpointType
import security_dsl.User
import java.util.List
import security_dsl.Attribute

class SecurityDslBasicAuthenticationGenerator {

	new(Resource resource, IFileSystemAccess2 fsa, Application app, String srcDestination){
		
    	var Authentication authController = null;
    	var user = resource.allContents.filter(User).next() 
    	
    	for (c : app.app_controllers) {
    		if(c instanceof Authentication) authController = c
    		fsa.generateFile(srcDestination + '/config/ApplicationSecurityConfig.java', generateApplicationSecurityConfig(app.packageName, authController))
    	}
    	
    	fsa.generateFile(srcDestination + '/dto/UserRequestDTO.java', generateUserRequestDto(app.packageName, user));
    	fsa.generateFile(srcDestination + '/controller/AuthController.java', generateAuthController(app.packageName, authController));
    	
		fsa.generateFile(srcDestination + '/config/PasswordEncoder.java', generatePassEncoder(app.packageName + '.config'));
		fsa.generateFile(srcDestination + '/service/IUserService.java', generateIUserService(app.packageName));
		fsa.generateFile(srcDestination + '/service/impl/UserService.java', generateUserServiceImpl(app.packageName));
		
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
		
			User find(String username);

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
		    public User save(User user) {
		    	if (userRepository.find(newUser.getUsername()) != null) {
		    		throw new RuntimeException("User already exists");

		    		}
		    	newUser.setRole("user");
		        String encoderPassword = bCryptPasswordEncoder.encode(newUser.getPassword());
		        newUser.setPassword(encoderPassword);
		        
		    	return userRepository.saveAndFlush(newUser);
		    }
		
		    @Override
		    public List<User> findAll() {
		        return userRepository.findAll();
		    }
		    		
		    @Override
		    public User find(String username) {
		        return userRepository.findOneByUsername();
		 }
		  	@Override
		 	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		 	return userRepository.findByUsername(username)
		 		.orElseThrow(() ->
		 		new UsernameNotFoundException("User Not Found"));
		 	}
		'''

		return content
	}

	def generateApplicationSecurityConfig(String packageName, Authentication authController){
		
		var regEndpoint = ''
		
		for (e : authController.controller_endpoints) {
			if(e.type == EEndpointType::REGISTRATION) regEndpoint = authController.path + e.url
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
		").permitAll()
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
	
	def generateAuthController(String packageName, Authentication authController){
			
			var regEndpoint = ''
		
			for (e : authController.controller_endpoints) {
				if(e.type == EEndpointType::REGISTRATION) regEndpoint =  e.url
			}
		
			var content = '''
			package ''' + packageName + '''
			.controller;
			
			import ''' + packageName + '''
			.dto.UserRequestDTO;
			import ''' + packageName + '''
			.model.User;
			import ''' + packageName + '''
			.service.IUserService;
			import lombok.RequiredArgsConstructor;
			import org.springframework.beans.BeanUtils;
			import org.springframework.beans.factory.annotation.Autowired;
			import org.springframework.http.ResponseEntity;
			import org.springframework.http.MediaType;
			import org.springframework.security.access.prepost.PreAuthorize;
			import org.springframework.web.bind.annotation.RestController;
			import org.springframework.web.bind.annotation.RequestBody;
			import org.springframework.web.bind.annotation.RequestMapping;
			
			import java.util.List;
			
			@RequiredArgsConstructor(onConstructor = @__(@Autowired))
			@RequestMapping(value = "''' + authController.path + '''
			",
			        consumes = MediaType.APPLICATION_JSON_VALUE,
			        produces = MediaType.APPLICATION_JSON_VALUE)
			@RestController
			public class AuthController {
			
			    private final IUserService userService;
			
			    @Override
			    @GetMapping()
			    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
			    public ResponseEntity<List<User>> getDataUser() {
			        return ResponseEntity.ok(userService.findAll());
			    }
			
			    @Override
			    @PostMapping("''' + authController.path + regEndpoint + '''
			")
			    public ResponseEntity<User> registerUser(RequestUserData request) {
			        User user = new User();
			        BeanUtils.copyProperties(request, user);
			        return ResponseEntity.ok(userService.save(user));
			    }
			
			
			}
			'''
		
			return content;
		}
		
		def generateUserRequestDto(String packageName, User user){
			
			var content = '''
			package ''' + packageName + '''
			.dto;
			
			import lombok.*;
			
			@Getter
			@Setter
			@ToString
			@AllArgsConstructor
			@NoArgsConstructor
			public class RequestUserDTO {

			''' + generateAttributes(user.model_attributes) + 
			'''
			    private String role;
			}
			
			'''	
			return content;
		}
		
		def generateAttributes(List<Attribute> attributes){
			var content = ''
			
			for(a : attributes){
				content += '''    private ''' + a.type +  ''' ''' + a.name+ 
				'''

				'''
			}
			
			return content
		}
		
		
}