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
        new SecurityDslControllerGenerator(resource, fsa, app, srcDestination)
        new SecurityDslModelRepoGenerator(resource,fsa, app, srcDestination)
       	new SecurityDslServiceGenerator(resource,fsa, app, srcDestination)
        
        
    	var user = resource.allContents.filter(User).next() 
        
        if(app.app_security instanceof BasicAuthentication){
       		new SecurityDslBasicAuthenticationGenerator(resource,fsa, app, srcDestination)
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
        	
       		new SecurityDslJWTGenerator(resource,fsa, app, srcDestination)
        	
        }else if(app.app_security instanceof OAuth2){
        	
       		new SecurityDslOAuth2Generator(fsa, app.packageName, srcDestination)
        }
        
	}
	
	def getCredential(List<Attribute> attributes){
		
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
}
