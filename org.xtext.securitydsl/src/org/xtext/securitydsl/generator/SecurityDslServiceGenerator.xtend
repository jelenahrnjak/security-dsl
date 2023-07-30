package org.xtext.securitydsl.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import security_dsl.Application
import security_dsl.BasicAuthentication
import security_dsl.Attribute
import java.util.List
import security_dsl.User
import org.eclipse.emf.ecore.resource.Resource
import security_dsl.JWT
import security_dsl.RoleInstance
import java.util.ArrayList
import security_dsl.Role
import security_dsl.EType
import security_dsl.Security

class SecurityDslServiceGenerator {
	
		new(Resource resource, IFileSystemAccess2 fsa, Application app, String srcDestination){
			
	    	var users = resource.allContents.filter(User)
    		var roles = resource.allContents.filter(Role)
	    	
	    	if(users.hasNext() && roles.hasNext()){
	    		var user = users.next()
	    		var role = roles.next()
		    	var userCredentialName = getCredential(user.model_attributes).name
		    	
		    	fsa.generateFile(srcDestination + '/service/IUserService.java', generateIUserService(app.packageName, userCredentialName));
	    		fsa.generateFile(srcDestination + '/service/impl/UserServiceImpl.java', generateUserServiceImplBasic(app.packageName, app.app_security, userCredentialName, getNotClienRoles(role.role_instances)));
	    		
	    		if(app.app_security instanceof JWT){
		    		var stringAttributeRole = getStringAttributeForRole(role.model_attributes).name
		    		fsa.generateFile(srcDestination + '/service/impl/RoleServiceImpl.java', generateRoleServiceImpl(app.packageName, stringAttributeRole));
		    		fsa.generateFile(srcDestination + '/service/IRoleService.java', generateIRoleService(app.packageName, stringAttributeRole));
		    	}
		    }
	    
	    	
	    	
		}
	
	
	def generateUserServiceImplBasic(String packageName, Security sec, String credentialName, List<RoleInstance> notClientRoles){
		
		var content = '''
		package «packageName».service.impl;
		
		import  «packageName».model.User;
		import «packageName».repository.UserRepository;
		import «packageName».service.IUserService;
		import «packageName».dto.UserRequestDTO;'''
		
		var endOfSave = ''
		
		if(sec instanceof JWT){
			content += '''
			import «packageName».model.Role;
			import «packageName».service.IRoleService;
			
			'''
			
			endOfSave = '''
		newUser.setEnabled(true);

		List<Role> roles = roleService.findByName(request.getRole());
		newUser.setRoles(roles);
		'''
		}else if(sec instanceof BasicAuthentication){
		
			content += '''
			import «packageName».model.enumeration.Role;
			'''
			endOfSave = '''newUser.setRole(Role.valueOf(request.getRole()));
			'''
		}
		
		content += '''
		
		import org.springframework.beans.BeanUtils;
		import org.springframework.beans.factory.annotation.Autowired;
		import org.springframework.security.core.userdetails.UserDetails;
		import org.springframework.security.core.userdetails.UserDetailsService;
		import org.springframework.security.core.userdetails.UsernameNotFoundException;
		import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;		
		import org.springframework.security.access.AccessDeniedException;
		
		import org.springframework.stereotype.Service;
		
		import java.util.List;
		
		@Service
		public class UserServiceImpl implements UserDetailsService, IUserService {
		
			@Autowired
		    private UserRepository userRepository;
		    
		    @Autowired
		    private BCryptPasswordEncoder bCryptPasswordEncoder;
		''' 
		
		if(sec instanceof JWT){
			content += '''	@Autowired
	private IRoleService roleService;

			'''
		}
		    
		content +=   '''    @Override
    public User save(UserRequestDTO request) {
    	User newUser = new User();
    	BeanUtils.copyProperties(request, newUser);
    	«endOfSave»
    	if (userRepository.findBy«credentialName.toFirstUpper»(newUser.get«credentialName.toFirstUpper»()).isPresent()) {
    		throw new RuntimeException("User already exists");

    		}
    		
		if(!checkRoleForRegistration(request.getRole())) { 
			throw new RuntimeException("Role not valid");
		}
    	
        String encoderPassword = bCryptPasswordEncoder.encode(newUser.getPassword());
        newUser.setPassword(encoderPassword);
    	return userRepository.saveAndFlush(newUser);
    }

	private boolean checkRoleForRegistration(String role) {
		
			'''
			if(notClientRoles.size > 0){
			content += '''        if('''
			
			for(var i = 0; i < notClientRoles.size ; i++){
				content += '''role.equals("«notClientRoles.get(i).name»")'''
				
				if(i == notClientRoles.size - 1){
					content+= ''') {
						'''
				}else{
					content += ' or '
				}
			}
			
    	content += '''        return false;

    	}

		'''}
				
		content += '''
		    	return true;
		    }
		
			@Override
			public UserDetails loadUserByUsername(String «credentialName») throws UsernameNotFoundException {
		 		return userRepository.findBy«credentialName.toFirstUpper»(«credentialName»)
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
	
	def getCredential(List<Attribute> attributes){
		
		for (a : attributes) {
		    if (a.isCredential) {
		        return a
		    } 
		}
		
	}
	
	
	def generateIUserService(String packageName, String credentialName) {
		
		var content = '''
		package «packageName».service;
		
		import «packageName».model.User;
		import «packageName».dto.UserRequestDTO;
		
		public interface IUserService {
		
			User save(UserRequestDTO request);

		}
		'''
		return content
	}
	
	def generateIRoleService(String packageName, String roleStringAttribute) {
		
		var content = '''
		package «packageName».service;
		
		import «packageName».model.Role;
		
		import java.util.List;
		
		public interface IRoleService {
		
			List<Role> findBy«roleStringAttribute.toFirstUpper»(String «roleStringAttribute»);

		}
		'''
		return content
	}
	
	def generateRoleServiceImpl(String packageName, String roleStringAttribute) {
		
		var content = '''
		package «packageName».service.impl;
		
		import «packageName».model.Role;
		import «packageName».repository.RoleRepository;
		import «packageName».service.IRoleService;
		
		import org.springframework.beans.factory.annotation.Autowired;
		import org.springframework.stereotype.Service;
		
		import lombok.RequiredArgsConstructor;
		
		@RequiredArgsConstructor(onConstructor = @__(@Autowired))
		@Service
		public class RoleServiceImpl implements IRoleService {

			private final RoleRepository roleRepository;
		
			@Override
			public List<Role> findBy«roleStringAttribute.toFirstUpper»(String «roleStringAttribute»){
				return this.roleRepository.findByName(name); 
			}

		}
		'''
		return content
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