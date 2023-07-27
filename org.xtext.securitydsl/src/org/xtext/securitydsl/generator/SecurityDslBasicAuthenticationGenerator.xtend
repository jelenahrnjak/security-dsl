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
import java.util.ArrayList

class SecurityDslBasicAuthenticationGenerator {

	new(Resource resource, IFileSystemAccess2 fsa, Application app, String srcDestination){
		
    	var user = resource.allContents.filter(User).next() 
    	var role = resource.allContents.filter(Role).next() 
    	
    	var credentialNameUser = getCredential(user.model_attributes).name
    	
    	for (c : app.app_controllers) {
    		if(c instanceof Authentication){
    		fsa.generateFile(srcDestination + '/config/ApplicationSecurityConfig.java', generateApplicationSecurityConfig(app.packageName, c))    	
    		}
    		
    	}
    	
    	
		fsa.generateFile(srcDestination + '/config/PasswordEncoder.java', generatePassEncoder(app.packageName));
		fsa.generateFile(srcDestination + '/service/IUserService.java', generateIUserService(app.packageName));
		fsa.generateFile(srcDestination + '/service/impl/UserServiceImpl.java', generateUserServiceImpl(app.packageName, credentialNameUser, getNotClienRoles(role.role_instances)));
		fsa.generateFile(srcDestination + '/model/enumeration/Role.java', generateRoleEnumeration(app.packageName, role.role_instances));
		fsa.generateFile(srcDestination + '/exception/ResourceConflictException.java', generateException(app.packageName))
		
		
	}
	
	def String generateException(String appMainPackage){
		var content = '''
		package ''' + appMainPackage+ '''
		.exception;
		
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
	
	def generateIUserService(String packageName) {
		
		var content = '''
		package '''+ packageName + '''
		.service;
		
		import '''+ packageName + '''
		.model.User;
		import '''+ packageName + '''
		.dto.UserRequestDTO;
		
		import java.util.List;
		
		public interface IUserService {
		
			User save(UserRequestDTO request);

			List<User> findAll();
		
		}
		'''
		return content
	}
	
	def getCredential(List<Attribute> attributes){
		
		for (a : attributes) {
		    if (a.isCredential) {
		        return a
		    } 
		}
		
	}
	
	def generateUserServiceImpl(String packageName, String credentialName, List<RoleInstance> notClientRoles){
		
		var content = '''
		package ''' + packageName + '''
		.service.impl;
		
		import  ''' + packageName + '''
		.model.User;
		import ''' + packageName + '''
		.repository.UserRepository;
		import ''' + packageName + '''
		.service.IUserService;
		import ''' + packageName + '''
		.model.enumeration.Role;
		import ''' + packageName + '''
		.dto.UserRequestDTO;
		
		import lombok.RequiredArgsConstructor;
		import org.springframework.beans.BeanUtils;
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
		    public User save(UserRequestDTO request) {
		    	User newUser = new User();
		    	BeanUtils.copyProperties(request, newUser);
		    	newUser.setRole(Role.valueOf(request.getRole()));
		    	if (userRepository.findBy''' + credentialName.toFirstUpper + '''
		(newUser.get''' + credentialName.toFirstUpper + '''
		()).isPresent()) {
		    		throw new RuntimeException("User already exists");

		    		}
		    		
				if(!checkRoleForRegistration(newUser.getRole())) { 
					throw new RuntimeException("Role not valid");
				}
		    	
		        String encoderPassword = bCryptPasswordEncoder.encode(newUser.getPassword());
		        newUser.setPassword(encoderPassword);
		    	return userRepository.saveAndFlush(newUser);
		    }
		
			private boolean checkRoleForRegistration(Role role) {
				
			'''
			if(notClientRoles.size > 0){
			content += '''        if('''
			
			for(var i = 0; i < notClientRoles.size ; i++){
				content += '''role.equals(Role.''' + notClientRoles.get(i).name.toUpperCase + '''
				)'''
				
				if(i == notClientRoles.size - 1){
					content+= ') {'
				}else{
					content += ' or '
				}
			}
			
    	content += '''        return false;

    }

		'''}
				
		content += '''    	return true;
    }
			
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
	}

	@Override
	public UserDetails loadUserByUsername(String '''+ credentialName + '''
 ) throws UsernameNotFoundException {
 		return userRepository.findBy''' + credentialName.toFirstUpper + '''
 (''' + credentialName +'''
 )
 			.orElseThrow(() ->
 				new UsernameNotFoundException("User Not Found"));
 	}
 }
'''

		return content
	}

	def getNotClienRoles(List<RoleInstance> instances){
		
		var ArrayList<RoleInstance> notClients = newArrayList
		
		for (ri : instances) {
			if(!ri.client) notClients.add(ri)
		}
		
		return notClients;
	}
	def generateApplicationSecurityConfig(String packageName, Authentication authController){
		
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
		                .authorizeRequests().antMatchers("''' + authController.path + '''
		/**").permitAll()
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
		package ''' + packageName + '''
		.config;

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