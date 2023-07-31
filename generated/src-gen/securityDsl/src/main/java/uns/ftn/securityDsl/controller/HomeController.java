package uns.ftn.securityDsl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


	@GetMapping("/")
	public String home(){
		return "Hello, caoo!";
	
	}	
	
	@GetMapping("/secured")
	public String secured(){
		return "Hello, ulogovani!";
	
	}
	@GetMapping("/secured2")
	public String secured2(){
		return "Hello, ulogovani 2!";
	
	}
	
}
