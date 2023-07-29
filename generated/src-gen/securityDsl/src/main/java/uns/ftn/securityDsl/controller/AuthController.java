package uns.ftn.securityDsl.controller;

import uns.ftn.securityDsl.model.User;
import uns.ftn.securityDsl.dto.UserRequestDTO;
import uns.ftn.securityDsl.dto.AuthenticationRequestDTO;
import uns.ftn.securityDsl.service.IUserService;
import uns.ftn.securityDsl.dto.UserTokenStateDTO;
import uns.ftn.securityDsl.security.util.TokenUtils;

import org.springframework.web.util.UriComponentsBuilder;
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
@RequestMapping(value = "/auth", produces = MediaType.APPLICATION_JSON_VALUE))
@RestController
public class AuthController {

    private final IUserService userService;
    
   	private final AuthenticationManager  authenticationManager;
    private final TokenUtils tokenUtils;    @PostMapping("/registration")
    public ResponseEntity<User> registration(@RequestBody UserRequestDTO request) {
        return ResponseEntity<>(userService.save(request), HttpStatus.CREATED);
    }
    
	@PostMapping("/login")
	public ResponseEntity<UserTokenStateDTO> login(@RequestBody AuthenticationRequestDTO request) {

		Authentication authentication = new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword());
		authentication = authenticationManager.authenticate(authentication);
		SecurityContextHolder.getContext().setAuthentication(authentication);
		User user = (User) authentication.getPrincipal();
		String jwt = tokenUtils.generateToken(user.getUsername());
		int expiresIn = tokenUtils.getExpiredIn();
		return ResponseEntity.ok(new UserTokenStateDTO(jwt, expiresIn));
		}

	@GetMapping("/logout")
	public ResponseEntity<Void> logout() {
		SecurityContextHolder.clearContext();
		return ResponseEntity.ok().build();
	}

}
