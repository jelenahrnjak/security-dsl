package uns.ftn.securityDsl.controller;

import uns.ftn.securityDsl.model.User;
import uns.ftn.securityDsl.dto.UserRequestDTO;
import uns.ftn.securityDsl.dto.AuthenticationRequestDTO;
import uns.ftn.securityDsl.service.IUserService;

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
@RequestMapping(value = "/auth", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
public class AuthController {

    private final IUserService userService;
    
   	private final AuthenticationManager  authenticationManager;

   @PostMapping("/registration")
    public ResponseEntity<User> registration(@RequestBody UserRequestDTO request) {
        return new ResponseEntity<>(userService.save(request), HttpStatus.CREATED);
    }
    
	@PostMapping("/login")
	public ResponseEntity<User> login(@RequestBody AuthenticationRequestDTO request) {

		Authentication authentication = new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword());
		authentication = authenticationManager.authenticate(authentication);
		SecurityContextHolder.getContext().setAuthentication(authentication);
		User user = (User) authentication.getPrincipal();
		return ResponseEntity.ok(user);	
	}

	@GetMapping("/logout")
	public ResponseEntity<Void> logout() {
		SecurityContextHolder.clearContext();
		return ResponseEntity.ok().build();
	}

}
