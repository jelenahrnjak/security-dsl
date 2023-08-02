package org.xtext.securitydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import security_dsl.Application
import security_dsl.BasicAuthentication
import security_dsl.JWT
import security_dsl.Claim
import java.util.List
import security_dsl.EClaimType
import security_dsl.Attribute
import security_dsl.User
import security_dsl.OAuth2
import security_dsl.Role
import security_dsl.Authentication
import security_dsl.EEndpointType

class SecurityDslGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

	    val app = resource.contents.head as Application
	    if (app.name.length <= 0) {
			app.name = app.artifact
		}
		
		app.packageName = app.group + '.' + app.name
	
	   	var capitalizedName= (app.name).substring(0, 1).toUpperCase() + (app.name).substring(1);
	    
		val srcDestination = app.artifact +  "/src/main/java/" + (app.packageName).replace('.', '/') + '/';
		
        new SecurityDslStaticFilesGenerator(fsa, app, capitalizedName, srcDestination)
        new SecurityDslResourcesGenerator(fsa, app)
        
        if(app.app_security instanceof OAuth2){
        	
       		new SecurityDslOAuth2Generator(fsa, app.packageName, srcDestination)
        
        }else{
        	
        	var Authentication authController = null
        	
        	var users = resource.allContents.filter(User)
        	var User user = null
        	if(users.hasNext()) user = users.next()
        	var credentialUser = getCredential(user.model_attributes).name
        	
        	var roles = resource.allContents.filter(Role)
        	var Role role = null
        	if(roles.hasNext()) role = roles.next()
       		if(role.tableName === null) role.tableName = "roles"
        	
        	for (c : app.app_controllers) {
    			if(c instanceof Authentication) authController = c;
			}
	        new SecurityDslModelRepoGenerator(fsa, app, srcDestination, user, role)
	       	new SecurityDslServiceGenerator(fsa, app.packageName, srcDestination, user, role, app.app_security)
	       	
	        new SecurityDslControllerGenerator(fsa, app.packageName, srcDestination, authController, app.app_security, credentialUser)
        
	        if(app.app_security instanceof BasicAuthentication){
	        	
	       		new SecurityDslBasicAuthenticationGenerator(fsa, app.packageName, srcDestination, authController, role.role_instances)
	       		
	        }else if(app.app_security instanceof JWT){
	        	
	        	var JWT jwt = app.app_security as JWT
	        	
	        	if(jwt.registeredclaims.issuer === null){
	        		jwt.registeredclaims.issuer = app.name
	        	}
	        	
	        	if(findSubjectClaim(jwt.jwt_claims) === null){
	        		
	        		var Claim subjectClaim
	        		subjectClaim.name = 'subject'
	        		subjectClaim.type = EClaimType::REGISTERED
	        		subjectClaim.claim_attribute = getCredential(user.model_attributes)
	        		jwt.jwt_claims.add(subjectClaim)
	        	}
	        	
	       		new SecurityDslJWTGenerator(fsa, app.packageName, srcDestination, authController, app.app_security as JWT, credentialUser)
	        	
	        } 
        }
        
	}
	
	def static getCredential(List<Attribute> attributes){
		
		for (a : attributes) {
		    if (a.isCredential) {
		        return a
		    } 
		}
		
	}
	
	def findSubjectClaim(List<Claim> claims){
		
		for (c : claims) {
			if(c.type == EClaimType::REGISTERED && c.name.toLowerCase == 'subject') return c;
		}
		
		return null;
	}
	
	def static getLoginEndpoint(Authentication authController){
		 for (e : authController.controller_endpoints) {
			if(e.type == EEndpointType::LOGIN) return e.url
		}
	}

}
