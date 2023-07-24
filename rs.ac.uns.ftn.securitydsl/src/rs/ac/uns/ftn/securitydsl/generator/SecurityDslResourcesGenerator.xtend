package rs.ac.uns.ftn.securitydsl.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import security_dsl.Application
import security_dsl.EDatabaseType
import security_dsl.Database

class SecurityDslResourcesGenerator {

	new(IFileSystemAccess2 fsa, Application app){

		var resourcesDest = app.artifact + '/src/main/resouces/'
		fsa.generateFile(resourcesDest + 'application.properties', generateApplicationProperties(app))

	}	
	
	
	def static generateApplicationProperties(Application app) {
         
      var propertiesContent = '''
      sprint.application.name''' +app.name + '''
      
      server.port=''' +app.port + '''
      
      server.hostname=''' +app.hostname + '''
      
      
      '''
      
      if (app.app_database !== null) { 
      
      var database = app.app_database;
       
      
      if(database?.vendorName == EDatabaseType::POSTGRE_SQL) { 
      	propertiesContent += '''
			spring.datasource.driverClassName=org.postgresql.Driver
			spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQL95Dialect
			
			spring.datasource.initialization-mode=always
			spring.datasource.url=jdbc:postgresql://'''
      }else if(database?.vendorName == EDatabaseType::MY_SQL) {
      	propertiesContent += '''
			spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
			spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialec
			
			spring.datasource.initialization-mode=always
			spring.datasource.url=jdbc:mysql://'''
      	
      }else if(database?.vendorName == EDatabaseType::ORACLE) {
      	propertiesContent += '''
	      	spring.datasource.driverClassName=oracle.jdbc.driver.OracleDriver
	      	spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.Oracle12cDialect
	      	
	      	spring.datasource.initialization-mode=always 
	      	spring.datasource.url=jdbc:oracle:thin:@'''
      }  
             propertiesContent += database.url + '''
            
            spring.datasource.username=''' + database.username + ''' 
            
            spring.datasource.password=''' + database.password + ''' 
            
            
            spring.jpa.show-sql=true
            spring.jpa.hibernate.ddl-auto=create-drop
            spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true
            '''
      }

      return propertiesContent;
    }
}