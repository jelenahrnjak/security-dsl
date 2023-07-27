package uns.ftn.securityDsl.service.impl;

import  uns.ftn.securityDsl.model.User;
import uns.ftn.securityDsl.repository.UserRepository;
import uns.ftn.securityDsl.service.IUserService;
import uns.ftn.securityDsl.model.enumeration.Role;
import uns.ftn.securityDsl.dto.UserRequestDTO;

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
    	if (userRepository.findByUsername(newUser.getUsername()).isPresent()) {
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
		
        if(role.equals(Role.ADMIN)) {        return false;

    }

    	return true;
    }
			
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return userRepository.findByUsername(username)
			.orElseThrow(() ->
				new UsernameNotFoundException("User Not Found"));
	}
}
