package org.xtext.securitydsl.generator

import java.util.ArrayList
import java.util.List
import org.eclipse.xtext.generator.IFileSystemAccess2
import security_dsl.Attribute
import security_dsl.BasicAuthentication
import security_dsl.EType
import security_dsl.JWT
import security_dsl.Role
import security_dsl.RoleInstance
import security_dsl.Security
import security_dsl.User

class SecurityDslServiceGenerator {

	var String packageName;	
	var String userCredential;
	var String roleStringAttribute;
	
	new(IFileSystemAccess2 fsa, String packageName, String srcDestination, User user, Role role, Security security){
	    	 
	   	this.packageName = packageName
    	this.userCredential = SecurityDslGenerator.getCredential(user.model_attributes).name
	    	
	    fsa.generateFile(srcDestination + '/service/IUserService.java', generateIUserService());
    	fsa.generateFile(srcDestination + '/service/impl/UserServiceImpl.java', generateUserServiceImplBasic(security, getNotClienRoles(role.role_instances)));
    		
    	if(security instanceof JWT){
    		this.roleStringAttribute = getStringAttributeForRole(role.model_attributes).name
    		fsa.generateFile(srcDestination + '/service/impl/RoleServiceImpl.java', generateRoleServiceImpl());
    		fsa.generateFile(srcDestination + '/service/IRoleService.java', generateIRoleService());
	    }

	}
	
	def generateUserServiceImplBasic(Security sec, List<RoleInstance> notClientRoles)'''
		package «packageName».service.impl;
		
		import  «packageName».model.User;
		import «packageName».repository.UserRepository;
		import «packageName».service.IUserService;
		import «packageName».dto.UserRequestDTO;
		«IF sec instanceof JWT»
		import «packageName».model.Role;
		import «packageName».service.IRoleService;
		«ELSEIF sec instanceof BasicAuthentication»
		import «packageName».model.enumeration.Role;
		«ENDIF»
		
		import org.springframework.beans.BeanUtils;
		import org.springframework.beans.factory.annotation.Autowired;
		import org.springframework.security.core.userdetails.UserDetails;
		import org.springframework.security.core.userdetails.UserDetailsService;
		import org.springframework.security.core.userdetails.UsernameNotFoundException;
		import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
		
		import org.springframework.stereotype.Service;
		
		«IF sec instanceof JWT»
		import java.util.List;
		
		«ENDIF»
		@Service
		public class UserServiceImpl implements UserDetailsService, IUserService {
		
			@Autowired
		    private UserRepository userRepository;
		    
		    @Autowired
		    private BCryptPasswordEncoder bCryptPasswordEncoder;
		    
		    «IF sec instanceof JWT»
		    @Autowired
		    private IRoleService roleService;
		    
		    «ENDIF»
		    
		    @Override
			public User save(UserRequestDTO request) {
				User newUser = new User();
				BeanUtils.copyProperties(request, newUser);
				«IF sec instanceof JWT»
				newUser.setEnabled(true);

				List<Role> roles = roleService.findByName(request.getRole());
				newUser.setRoles(roles);
				«ELSEIF sec instanceof BasicAuthentication»
				newUser.setRole(Role.valueOf(request.getRole()));
				«ENDIF»
		
				if (userRepository.findBy«userCredential.toFirstUpper»(newUser.get«userCredential.toFirstUpper»()).isPresent()) {
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
		
				«IF notClientRoles.size > 0»
				if(«FOR r : notClientRoles»role.equals("«r.name»")«IF notClientRoles.indexOf(r) == notClientRoles.size - 1») {«ELSE» || «ENDIF»«ENDFOR»
				«ENDIF»       
			 
			 		return false;
			
			    }
			    	
		    	return true;
		    }
		
			@Override
			public UserDetails loadUserByUsername(String «userCredential») throws UsernameNotFoundException {
		 		return userRepository.findBy«userCredential.toFirstUpper»(«userCredential»)
		 			.orElseThrow(() ->
		 				new UsernameNotFoundException("User Not Found"));
		 	}
		 }
		'''

	def generateIUserService()'''
		package «packageName».service;
		
		import «packageName».model.User;
		import «packageName».dto.UserRequestDTO;
		
		public interface IUserService {
		
			User save(UserRequestDTO request);

		}
		'''
		
	def generateIRoleService()'''
		package «packageName».service;
		
		import «packageName».model.Role;
		
		import java.util.List;
		
		public interface IRoleService {
		
			List<Role> findBy«roleStringAttribute.toFirstUpper»(String «roleStringAttribute»);

		}
		'''
	
	def generateRoleServiceImpl()'''
		package «packageName».service.impl;
		
		import «packageName».model.Role;
		import «packageName».repository.RoleRepository;
		import «packageName».service.IRoleService;
		
		import java.util.List;
		
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
	
		def getNotClienRoles(List<RoleInstance> instances){
		
		var ArrayList<RoleInstance> notClients = newArrayList
		
		for (ri : instances) {
			if(!ri.client) notClients.add(ri)
		}
		
		return notClients;
	}
	
}