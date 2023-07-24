package rs.ac.uns.ftn.securitydsl.generator

import security_dsl.Application
import org.eclipse.xtext.generator.IFileSystemAccess2

class SecurityDslStaticFilesGenerator {
	
	
	new(IFileSystemAccess2 fsa, Application app, String capitalizedName, String srcDestination){
				
		fsa.generateFile(srcDestination + capitalizedName + 'Application.java', mainClassGenerator(app.packageName, app.name));
		fsa.generateFile(app.artifact + '/README.md', app.description);
		fsa.generateFile(srcDestination.replace('main', 'test') + capitalizedName + 'ApplicationTests.java', generateTests(app.packageName, app.name + 'Tests'))
	}
	
	
	def static mainClassGenerator(String packageName, String appName){
		
		return '''
		package '''+ packageName +'''
		;
		
		import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.SpringBootApplication;
		import org.springframework.scheduling.annotation.EnableScheduling;
		
		@SpringBootApplication
		public class ''' + appName+''' 
		{
		
			public static void main(String[] args) {
				
				SpringApplication.run('''+appName+ '''
		.class, args);
		
			}
		
		}
		'''
		
	}
	
	def generateTests(String packageName, String appName) {
		return '''
		package '''+ packageName +'''
		;
		
		import org.junit.jupiter.api.Test;
		import org.springframework.boot.test.context.SpringBootTest;
		
		@SpringBootTest
		class ''' +appName+'''
		{
		
			@Test
			void contextLoads() {
			}
		
		}
		'''
	
	}
	
}
	
