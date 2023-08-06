package uns.ftn.securityDsl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController{


	@GetMapping("/")
	public String home(){
		return "Hello, guest!";
	
	}	
	
	@GetMapping("/secured")
	public String secured(){
		return "Hello, user!";
	
	}
	
}
