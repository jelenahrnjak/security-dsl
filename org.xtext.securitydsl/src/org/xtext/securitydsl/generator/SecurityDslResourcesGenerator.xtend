package org.xtext.securitydsl.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import security_dsl.Application
import security_dsl.EDatabaseType
import security_dsl.JWT
import security_dsl.OAuth2
import security_dsl.Database

class SecurityDslResourcesGenerator {

	new(IFileSystemAccess2 fsa, Application app){

		var resourcesDest = app.artifact + '/src/main/resources/'
		fsa.generateFile(resourcesDest + 'application.properties', generateApplicationProperties(app))
		fsa.generateFile(app.artifact + '/pom.xml', generatePomXml(app))

	}
	
	def generatePomXml(Application app)'''
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
			
			<groupId>«app.group»</groupId>
			<artifactId>«app.artifact»</artifactId>
			<version>0.0.1-SNAPSHOT</version>
			
			<name>«app.name»</name>
			<description>«app.description»</description>
			
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
				<dependency>
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
				«IF app.app_database?.vendorName.equals(EDatabaseType::MY_SQL)»
				<dependency>
				    <groupId>mysql</groupId>
				    <artifactId>mysql-connector-java</artifactId>
				</dependency>
				«ELSEIF app.app_database?.vendorName.equals(EDatabaseType::POSTGRE_SQL)»	
				<dependency>
					<groupId>org.postgresql</groupId>
					<artifactId>postgresql</artifactId>
				</dependency>
				«ELSEIF app.app_database?.vendorName.equals(EDatabaseType::ORACLE)»
				<dependency>
					<groupId>com.oracle.database.jdbc</groupId>
					<artifactId>ojdbc8</artifactId>
				</dependency>
				«ENDIF»
				<dependency>
					<groupId>org.springframework.boot</groupId>
					<artifactId>spring-boot-starter-security</artifactId>	
				</dependency>
				«IF app.app_security instanceof JWT»
				<dependency>
					<groupId>io.jsonwebtoken</groupId>
					<artifactId>jjwt</artifactId>
					<version>0.6.0</version>
				</dependency>
				<dependency>
					<groupId>com.fasterxml.jackson.core</groupId>
					<artifactId>jackson-databind</artifactId>
				</dependency>
				<dependency>
					<groupId>com.fasterxml.jackson.core</groupId>
					<artifactId>jackson-annotations</artifactId>
				</dependency>
				«ELSEIF app.app_security instanceof OAuth2»
				<dependency>
				    <groupId>org.springframework.boot</groupId>
				    <artifactId>spring-boot-starter-oauth2-client</artifactId>
				</dependency>
				«ENDIF»
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
	
	def generateDatabaseProperties(Database database){
		
		if (database === null) return '' 
      	
		return '''
			«IF database.vendorName.equals(EDatabaseType::MY_SQL)»
			spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
			spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialec
			
			spring.datasource.initialization-mode=always
			spring.datasource.url=jdbc:mysql://«database.url»
			«ELSEIF database.vendorName.equals(EDatabaseType::POSTGRE_SQL)»	
			spring.datasource.driverClassName=org.postgresql.Driver
			spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQL95Dialect
			
			spring.datasource.initialization-mode=always
			spring.datasource.url=jdbc:postgresql://«database.url»
			«ELSEIF database.vendorName.equals(EDatabaseType::ORACLE)»
			spring.datasource.driverClassName=oracle.jdbc.driver.OracleDriver
			spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.Oracle12cDialect
			
			spring.datasource.initialization-mode=always 
			spring.datasource.url=jdbc:oracle:thin:@«database.url»
			«ENDIF»

			spring.datasource.username=«database.username»
			spring.datasource.password=«database.password»
			
			spring.jpa.show-sql=true
			spring.jpa.hibernate.ddl-auto=create-drop
			spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true
			spring.jpa.properties.hibernate.format_sql=true 
			spring.sql.init.mode=always
			spring.jpa.defer-datasource-initialization=true   
			spring.jpa.open-in-view=false
			
            '''
	}
	
	
	def generateApplicationProperties(Application app) '''
		sprint.application.name=«app.name»
		server.port=«app.port»
		server.hostname=«app.hostname»
		
		«generateDatabaseProperties(app.app_database)»
      	«IF app.app_security instanceof OAuth2»
		«var OAuth2 oauth = app.app_security as OAuth2»
      	«FOR p : oauth.providers»

		spring.security.oauth2.client.registration.«p.name.toString.toLowerCase».client-id=«p.clientId»
		spring.security.oauth2.client.registration.«p.name.toString.toLowerCase».client-secret=«p.clientSecret»
		«IF p.redirectUri !== null»
		spring.security.oauth2.client.registration.«p.name.toString.toLowerCase».redirect-uri=«p.redirectUri»
		«ENDIF»
      	«ENDFOR»
        «ENDIF»
      '''
}