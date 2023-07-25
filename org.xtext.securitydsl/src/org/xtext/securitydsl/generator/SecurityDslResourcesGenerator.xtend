package org.xtext.securitydsl.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import security_dsl.Application
import security_dsl.EDatabaseType
import security_dsl.Database

class SecurityDslResourcesGenerator {

	new(IFileSystemAccess2 fsa, Application app){

		var resourcesDest = app.artifact + '/src/main/resouces/'
		fsa.generateFile(resourcesDest + 'application.properties', generateApplicationProperties(app))
		fsa.generateFile(app.artifact + '/pom.xml', generatePomXml(app))

	}
	
	def generatePomXml(Application app) {
		var content = '''
		<?xml version="1.0" encoding="UTF-8"?>
		<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
			<modelVersion>4.0.0</modelVersion>
			<parent>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-starter-parent</artifactId>
				<version>2.5.2</version>
				<relativePath/> <!-- lookup parent from repository -->
			</parent>
			<groupId>''' + app.group + '''</groupId>
			'''
			
		content += '''	<artifactId>''' + app.artifact + '''</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>''' + app.name + '''</name>
	<description>''' + app.description + '''</description>
	<properties>
			<java.version>11</java.version>
		</properties>
		<dependencies>
			<dependency>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-starter-data-jpa</artifactId>
			</dependency>
			<dependency>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-starter-web</artifactId>
			</dependency>
			<dependency>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-devtools</artifactId>
				<scope>runtime</scope>
				<optional>true</optional>
			</dependency>
	'''
	
	var databaseDependency = ''
	switch (app.app_database?.vendorName) {
		case EDatabaseType::MY_SQL: {
			databaseDependency = '''			<dependency>
			    <groupId>mysql</groupId>
			    <artifactId>mysql-connector-java</artifactId>
			</dependency>'''
		}
		case EDatabaseType::POSTGRE_SQL : {
			databaseDependency = '''			<dependency>
							<groupId>org.postgresql</groupId>
							<artifactId>postgresql</artifactId>
			</dependency>'''
		}
		case EDatabaseType::ORACLE: {
			databaseDependency = '''			<dependency>
						    <groupId>com.oracle.database.jdbc</groupId>
						    <artifactId>ojdbc8</artifactId>
			</dependency>
			'''
		}
	}
	
	var securityDependency = ''
	
	
	content += databaseDependency
	
	content += '''			<dependency>
				<groupId>org.projectlombok</groupId>
				<artifactId>lombok</artifactId>
				<optional>true</optional>
			</dependency>
			<dependency>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-starter-test</artifactId>
				<scope>test</scope>
			</dependency>
			<dependency>
				<groupId>org.modelmapper</groupId>
				<artifactId>modelmapper</artifactId>
				<version>2.4.4</version>
			</dependency>
		</dependencies>
		<build>
			<plugins>
				<plugin>
					<groupId>org.springframework.boot</groupId>
					<artifactId>spring-boot-maven-plugin</artifactId>
					<configuration>
						<excludes>
							<exclude>
								<groupId>org.projectlombok</groupId>
								<artifactId>lombok</artifactId>
							</exclude>
						</excludes>
					</configuration>
				</plugin>
			</plugins>
		</build>
	
	</project>
	
		'''
		
		return content;
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