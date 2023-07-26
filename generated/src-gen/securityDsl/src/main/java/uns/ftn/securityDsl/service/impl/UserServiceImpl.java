package uns.ftn.securityDsl.service.impl;

import  uns.ftn.securityDsl.model.User;
import uns.ftn.securityDsl.repository.UserRepository;
import uns.ftn.securityDsl.service.IUserService;

import lombok.RequiredArgsConstructor;
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
    public User save(User newUser) {
    	if (userRepository.findByUsername(newUser.getUsername()) != null) {
    		throw new RuntimeException("User already exists");

    		}
        String encoderPassword = bCryptPasswordEncoder.encode(newUser.getPassword());
        newUser.setPassword(encoderPassword);
        
    	return userRepository.saveAndFlush(newUser);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
    
  	@Override
 	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
  		User user = userRepository.findByUsername(username);
  		
		if(user == null) {
			throw new UsernameNotFoundException("User Not Found");
		}
 	
 		return user;
 		
 	}
 }
