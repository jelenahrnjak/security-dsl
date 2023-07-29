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
import security_dsl.JWT

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
		package «packageName».controller;
		
		import «packageName».model.User;
		import «packageName».dto.UserRequestDTO;
		import «packageName».dto.AuthenticationRequestDTO;
		import «packageName».service.IUserService;
		'''
		
		if(security instanceof JWT){
			content += '''
			import «packageName».dto.UserTokenStateDTO;
			import «packageName».security.util.TokenUtils;
			
			import org.springframework.web.util.UriComponentsBuilder;
			'''
		}
		content += '''
		import lombok.RequiredArgsConstructor;
		import org.springframework.beans.factory.annotation.Autowired;
		import org.springframework.security.core.Authentication;
		import org.springframework.http.MediaType;
		import org.springframework.http.HttpStatus;
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
		@RequestMapping(value = "«authController.path»", produces = MediaType.APPLICATION_JSON_VALUE))
		@RestController
		public class AuthController {
		
		    private final IUserService userService;
		    
		   	private final AuthenticationManager  authenticationManager;
		'''
		
		var loginMethod = ''
		var loginRet = ''
		
		if(security instanceof JWT){
			content += '''    private final TokenUtils tokenUtils;'''
			
			loginMethod = '''
			String jwt = tokenUtils.generateToken(user.getUsername());
			int expiresIn = tokenUtils.getExpiredIn();
			return ResponseEntity.ok(new UserTokenStateDTO(jwt, expiresIn));
					'''
		 loginRet = 'UserTokenStateDTO'
					
		}else if (security instanceof BasicAuthentication){
			loginMethod = '''return ResponseEntity.ok(user);'''
			loginRet = 'User'
		}
		
		content += '''    @PostMapping("«regEndpoint»")
    public ResponseEntity<User> registration(@RequestBody UserRequestDTO request) {
        return ResponseEntity<>(userService.save(request), HttpStatus.CREATED);
    }
    
	@PostMapping("«loginEndpoint»")
	public ResponseEntity<«loginRet»> login(@RequestBody AuthenticationRequestDTO request) {

		Authentication authentication = new UsernamePasswordAuthenticationToken(request.get«credentialNameUser.toFirstUpper»(), request.getPassword());
		authentication = authenticationManager.authenticate(authentication);
		SecurityContextHolder.getContext().setAuthentication(authentication);
		User user = (User) authentication.getPrincipal();
		«loginMethod»}

	@GetMapping("«logoutEndpoint»")
	public ResponseEntity<Void> logout() {
		SecurityContextHolder.clearContext();
		return ResponseEntity.ok().build();
	}

}
		'''
	
		return content;
		}
}