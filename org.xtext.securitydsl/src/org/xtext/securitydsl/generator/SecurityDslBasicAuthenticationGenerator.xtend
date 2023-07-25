package org.xtext.securitydsl.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import security_dsl.Application

class SecurityDslBasicAuthenticationGenerator {
	
		new(IFileSystemAccess2 fsa, Application app, String srcDestination){
			
			//fsa.generateFile(srcDestination + '/model/Role.java', generateRoleModel(app.packageName + '.config'));
			
		}
	
		def generateApplicationSecurityConfig()''''''
		
		def generatePassEncoder(String packageName){
		
		var content = ''
		content =  '''
		package ''' + packageName + ''';

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class PasswordEncoder {

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
		'''
		
		return content;
		}
}