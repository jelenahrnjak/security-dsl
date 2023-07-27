package org.xtext.securitydsl.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import security_dsl.Application
import security_dsl.Authentication
import security_dsl.EEndpointType
import security_dsl.Security
import security_dsl.BasicAuthentication
import security_dsl.Attribute
import java.util.List
import security_dsl.User
import org.eclipse.emf.ecore.resource.Resource

class SecurityDslControllerGenerator {
	
		new(Resource resource, IFileSystemAccess2 fsa, Application app, String srcDestination){
			
	    	var user = resource.allContents.filter(User).next()
	    	
	    	var userCredentialName = getCredential(user.model_attributes).name
			for (c : app.app_controllers) {
    			if(c instanceof Authentication){
    			fsa.generateFile(srcDestination + '/controller/AuthController.java', generateAuthController(app.packageName, c, app.app_security, userCredentialName));
    			}
    		}
		}
	
	
	def getCredential(List<Attribute> attributes){
		
		for (a : attributes) {
		    if (a.isCredential) {
		        return a
		    } 
		}
		
	}
	
	def generateAuthController(String packageName, Authentication authController, Security security, String credentialNameUser){
			
		var regEndpoint = ''
		var loginEndpoint = ''
		var logoutEndpoint = ''
		
		for (e : authController.controller_endpoints) {
			if(e.type == EEndpointType::REGISTRATION) regEndpoint =  e.url
			if(e.type == EEndpointType::LOGIN) loginEndpoint = e.url
			if(e.type == EEndpointType::LOGOUT) logoutEndpoint = e.url
		}
		
	
		var content = '''
		package ''' + packageName + '''
		.controller;
		
		import ''' + packageName + '''
		.model.User;
		import ''' + packageName + '''
		.dto.UserRequestDTO;
		import ''' + packageName + '''
		.service.IUserService;
		'''
		content += '''
		import lombok.RequiredArgsConstructor;
		import org.springframework.beans.factory.annotation.Autowired;
		import org.springframework.security.core.Authentication;
		import org.springframework.http.ResponseEntity;
		import org.springframework.security.authentication.AuthenticationManager;
		import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
		import org.springframework.security.core.context.SecurityContextHolder;
		import org.springframework.web.bind.annotation.RestController;
		import org.springframework.web.bind.annotation.RequestBody;
		import org.springframework.web.bind.annotation.RequestMapping;
		import org.springframework.web.bind.annotation.GetMapping;
		import org.springframework.web.bind.annotation.PostMapping;
		
		@RequiredArgsConstructor(onConstructor = @__(@Autowired))
		@RequestMapping(value = "''' + authController.path + '''
		")
		@RestController
		public class AuthController {
		
		    private final IUserService userService;
		'''
		if(security instanceof BasicAuthentication){
			content += '''    private final AuthenticationManager  authenticationManager;'''
		}
		
		content += '''    @PostMapping("''' + regEndpoint + '''
		")
		    public ResponseEntity<User> registration(@RequestBody UserRequestDTO request) {
		        return ResponseEntity.ok(userService.save(request));
		    }
		    
			@PostMapping("''' + loginEndpoint + '''
		")
			public ResponseEntity<User> login(@RequestBody UserRequestDTO request) {
		
				Authentication authentication = new UsernamePasswordAuthenticationToken(request.get''' + credentialNameUser.toFirstUpper + '''
			(), request.getPassword());
				authentication = authenticationManager.authenticate(authentication);
				SecurityContextHolder.getContext().setAuthentication(authentication);
				User user = (User) authentication.getPrincipal();
				return ResponseEntity.ok(user);
			}
		
			@GetMapping("''' + logoutEndpoint + '''
		")
			public ResponseEntity<Void> logout() {
			SecurityContextHolder.clearContext();
			return ResponseEntity.ok().build();
			}
		
		
		}
		'''
	
		return content;
		}
}