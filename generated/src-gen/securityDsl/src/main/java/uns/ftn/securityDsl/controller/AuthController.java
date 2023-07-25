package uns.ftn.securityDsl.controller;

import uns.ftn.securityDsl.dto.UserRequestDTO;
import uns.ftn.securityDsl.model.User;
import uns.ftn.securityDsl.service.IUserService;
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
@RequestMapping(value = "/auth",
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
    @PostMapping("/auth/registration")
    public ResponseEntity<User> registerUser(RequestUserData request) {
        User user = new User();
        BeanUtils.copyProperties(request, user);
        return ResponseEntity.ok(userService.save(user));
    }


}
