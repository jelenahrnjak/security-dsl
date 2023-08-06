package org.xtext.securitydsl.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import security_dsl.Authentication
import security_dsl.BasicAuthentication
import security_dsl.EEndpointType
import security_dsl.JWT
import security_dsl.Security
import security_dsl.Endpoint

class SecurityDslControllerGenerator {
	
	var String packageName;
	
	new(IFileSystemAccess2 fsa, String packageName, String srcDestination, Authentication authC, Security security, String userCredential){
			
		this.packageName = packageName
    	fsa.generateFile(srcDestination + '/controller/AuthController.java', generateAuthController(authC, security, userCredential));
    		
	}
	
	def generateAuthController(Authentication authController, Security security, String credentialNameUser){
			
		var Endpoint regEndpoint;
		var Endpoint loginEndpoint;
		var Endpoint logoutEndpoint;
		
		for (e : authController.controller_endpoints) {
			if(e.type == EEndpointType::REGISTRATION) regEndpoint =  e
			if(e.type == EEndpointType::LOGIN) loginEndpoint = e
			if(e.type == EEndpointType::LOGOUT) logoutEndpoint = e
		}
	
		return '''
		package «packageName».controller;
		
		import «packageName».model.User;
		import «packageName».dto.UserRequestDTO;
		import «packageName».dto.AuthenticationRequestDTO;
		import «packageName».service.IUserService;
		
		«IF security instanceof JWT»
		import «packageName».dto.UserTokenStateDTO;
		import «packageName».util.TokenUtils;
		
		«ENDIF»
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
		@RequestMapping(value = "«authController.path»", produces = MediaType.APPLICATION_JSON_VALUE)
		@RestController
		public class AuthController {
		
		    private final IUserService userService;
		    
		   	private final AuthenticationManager  authenticationManager;
		
			«IF security instanceof JWT»
			private final TokenUtils tokenUtils;
			«ENDIF»
		   @PostMapping("«regEndpoint.url»")
		    public ResponseEntity<User> «regEndpoint.methodName»(@RequestBody UserRequestDTO request) {
		        return new ResponseEntity<>(userService.save(request), HttpStatus.CREATED);
		    }
		    
			@PostMapping("«loginEndpoint.url»")
			public ResponseEntity<«IF security instanceof JWT»UserTokenStateDTO«ELSEIF security instanceof BasicAuthentication»User«ENDIF»> «loginEndpoint.methodName»(@RequestBody AuthenticationRequestDTO request) {

				Authentication authentication = new UsernamePasswordAuthenticationToken(request.get«credentialNameUser.toFirstUpper»(), request.getPassword());
				authentication = authenticationManager.authenticate(authentication);
				SecurityContextHolder.getContext().setAuthentication(authentication);
				User user = (User) authentication.getPrincipal();
				«IF security instanceof JWT»
				String jwt = tokenUtils.generateToken(user.getUsername());
				int expiresIn = tokenUtils.getExpiredIn();
				return ResponseEntity.ok(new UserTokenStateDTO(jwt, expiresIn));
				«ELSEIF security instanceof BasicAuthentication»
				return ResponseEntity.ok(user);	
				«ENDIF»
			}

			@GetMapping("«logoutEndpoint.url»")
			public ResponseEntity<Void> «logoutEndpoint.methodName»() {
				SecurityContextHolder.clearContext();
				return ResponseEntity.ok().build();
			}

		}
		'''
		}
}