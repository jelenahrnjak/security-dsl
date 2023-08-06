package uns.ftn.securityDsl.service.impl;

import  uns.ftn.securityDsl.model.User;
import uns.ftn.securityDsl.repository.UserRepository;
import uns.ftn.securityDsl.service.IUserService;
import uns.ftn.securityDsl.dto.UserRequestDTO;
import uns.ftn.securityDsl.model.Role;
import uns.ftn.securityDsl.service.IRoleService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserDetailsService, IUserService {

	@Autowired
    private UserRepository userRepository;
    
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    
    @Autowired
    private IRoleService roleService;
    
    
    @Override
	public User save(UserRequestDTO request) {
		User newUser = new User();
		BeanUtils.copyProperties(request, newUser);
		newUser.setEnabled(true);

		List<Role> roles = roleService.findByName(request.getRole());
		newUser.setRoles(roles);

		if (userRepository.findByUsername(newUser.getUsername()).isPresent()) {
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

		if(role.equals("admin")) {
	 
	 		return false;
	
	    }
	    	
    	return true;
    }

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
 		return userRepository.findByUsername(username)
 			.orElseThrow(() ->
 				new UsernameNotFoundException("User Not Found"));
 	}
 }
