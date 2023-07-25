package org.xtext.securitydsl.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import security_dsl.Application

class SecurityDslControllerGenerator {
	
		new(IFileSystemAccess2 fsa, Application app, String srcDestination){}
	
		def GenerateUserCForBasicAuthentication(){
			
			var content = '''
			package com.example.Demo.Basic.Authentication.endpoint.impl;
			
			import com.example.Demo.Basic.Authentication.dto.RequestUserData;
			import com.example.Demo.Basic.Authentication.entity.User;
			import com.example.Demo.Basic.Authentication.service.IUserService;
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
			    @PostMapping("/register")
			    public ResponseEntity<User> registerUser(RequestUserData request) {
			        User user = new User();
			        BeanUtils.copyProperties(request, user);
			        return ResponseEntity.ok(userService.save(user));
			    }
			
			
			}
			'''
		
			return content;
		}
	
}