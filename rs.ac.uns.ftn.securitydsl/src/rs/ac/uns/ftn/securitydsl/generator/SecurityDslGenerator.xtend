/*
 * generated by Xtext 2.27.0
 */
package rs.ac.uns.ftn.securitydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import security_dsl.Application
import security_dsl.Role
import security_dsl.User

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
        new SecurityDslControllerGenerator(fsa, app, srcDestination)
        new SecurityDslModelGenerator(fsa, app, srcDestination)
        new SecurityDslJWTSpringGenerator(fsa, app, srcDestination)
	}
}
