package org.xtext.securitydsl.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import security_dsl.Application;
import security_dsl.Database;
import security_dsl.EDatabaseType;
import security_dsl.JWT;
import security_dsl.OAuth2;
import security_dsl.Provider;
import security_dsl.Security;

@SuppressWarnings("all")
public class SecurityDslResourcesGenerator {
  public SecurityDslResourcesGenerator(final IFileSystemAccess2 fsa, final Application app) {
    String _artifact = app.getArtifact();
    String resourcesDest = (_artifact + "/src/main/resources/");
    fsa.generateFile((resourcesDest + "application.properties"), this.generateApplicationProperties(app));
    String _artifact_1 = app.getArtifact();
    String _plus = (_artifact_1 + "/pom.xml");
    fsa.generateFile(_plus, this.generatePomXml(app));
  }

  public CharSequence generatePomXml(final Application app) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<project xmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<modelVersion>4.0.0</modelVersion>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<parent>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<groupId>org.springframework.boot</groupId>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<artifactId>spring-boot-starter-parent</artifactId>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<version>2.5.2</version>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<relativePath/> <!-- lookup parent from repository -->");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</parent>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<groupId>");
    String _group = app.getGroup();
    _builder.append(_group, "\t");
    _builder.append("</groupId>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<artifactId>");
    String _artifact = app.getArtifact();
    _builder.append(_artifact, "\t");
    _builder.append("</artifactId>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<version>0.0.1-SNAPSHOT</version>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<name>");
    String _name = app.getName();
    _builder.append(_name, "\t");
    _builder.append("</name>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<description>");
    String _description = app.getDescription();
    _builder.append(_description, "\t");
    _builder.append("</description>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<properties>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<java.version>11</java.version>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</properties>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<dependencies>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>org.springframework.boot</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>spring-boot-starter-data-jpa</artifactId>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>org.springframework.boot</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>spring-boot-starter-web</artifactId>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>org.springframework.boot</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>spring-boot-devtools</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<scope>runtime</scope>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<optional>true</optional>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>org.projectlombok</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>lombok</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<optional>true</optional>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>org.springframework.boot</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>spring-boot-starter-test</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<scope>test</scope>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>org.modelmapper</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>modelmapper</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<version>2.4.4</version>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</dependency>");
    _builder.newLine();
    {
      Database _app_database = app.getApp_database();
      EDatabaseType _vendorName = null;
      if (_app_database!=null) {
        _vendorName=_app_database.getVendorName();
      }
      boolean _equals = _vendorName.equals(EDatabaseType.MY_SQL);
      if (_equals) {
        _builder.append("\t\t");
        _builder.append("<dependency>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("    ");
        _builder.append("<groupId>mysql</groupId>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("    ");
        _builder.append("<artifactId>mysql-connector-java</artifactId>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("</dependency>");
        _builder.newLine();
      } else {
        Database _app_database_1 = app.getApp_database();
        EDatabaseType _vendorName_1 = null;
        if (_app_database_1!=null) {
          _vendorName_1=_app_database_1.getVendorName();
        }
        boolean _equals_1 = _vendorName_1.equals(EDatabaseType.POSTGRE_SQL);
        if (_equals_1) {
          _builder.append("\t\t");
          _builder.append("<dependency>");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("\t");
          _builder.append("<groupId>org.postgresql</groupId>");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("\t");
          _builder.append("<artifactId>postgresql</artifactId>");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("</dependency>");
          _builder.newLine();
        } else {
          Database _app_database_2 = app.getApp_database();
          EDatabaseType _vendorName_2 = null;
          if (_app_database_2!=null) {
            _vendorName_2=_app_database_2.getVendorName();
          }
          boolean _equals_2 = _vendorName_2.equals(EDatabaseType.ORACLE);
          if (_equals_2) {
            _builder.append("\t\t");
            _builder.append("<dependency>");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("<groupId>com.oracle.database.jdbc</groupId>");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("<artifactId>ojdbc8</artifactId>");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("</dependency>");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>org.springframework.boot</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>spring-boot-starter-security</artifactId>\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</dependency>");
    _builder.newLine();
    {
      Security _app_security = app.getApp_security();
      if ((_app_security instanceof JWT)) {
        _builder.append("\t\t");
        _builder.append("<dependency>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("<groupId>io.jsonwebtoken</groupId>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("<artifactId>jjwt</artifactId>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("<version>0.6.0</version>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("</dependency>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("<dependency>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("<groupId>com.fasterxml.jackson.core</groupId>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("<artifactId>jackson-databind</artifactId>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("</dependency>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("<dependency>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("<groupId>com.fasterxml.jackson.core</groupId>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("<artifactId>jackson-annotations</artifactId>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("</dependency>");
        _builder.newLine();
      } else {
        Security _app_security_1 = app.getApp_security();
        if ((_app_security_1 instanceof OAuth2)) {
          _builder.append("\t\t");
          _builder.append("<dependency>");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("    ");
          _builder.append("<groupId>org.springframework.boot</groupId>");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("    ");
          _builder.append("<artifactId>spring-boot-starter-oauth2-client</artifactId>");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("</dependency>");
          _builder.newLine();
        }
      }
    }
    _builder.append("\t");
    _builder.append("</dependencies>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<build>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<plugins>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<plugin>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<groupId>org.springframework.boot</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<artifactId>spring-boot-maven-plugin</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<configuration>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<excludes>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("<exclude>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("<groupId>org.projectlombok</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("<artifactId>lombok</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("</exclude>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("</excludes>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</configuration>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</plugin>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</plugins>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</build>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("</project>");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }

  public String generateDatabaseProperties(final Database database) {
    if ((database == null)) {
      return "";
    }
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _equals = database.getVendorName().equals(EDatabaseType.MY_SQL);
      if (_equals) {
        _builder.append("spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver");
        _builder.newLine();
        _builder.append("spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialec");
        _builder.newLine();
        _builder.newLine();
        _builder.append("spring.datasource.initialization-mode=always");
        _builder.newLine();
        _builder.append("spring.datasource.url=jdbc:mysql://");
        String _url = database.getUrl();
        _builder.append(_url);
        _builder.newLineIfNotEmpty();
      } else {
        boolean _equals_1 = database.getVendorName().equals(EDatabaseType.POSTGRE_SQL);
        if (_equals_1) {
          _builder.append("spring.datasource.driverClassName=org.postgresql.Driver");
          _builder.newLine();
          _builder.append("spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQL95Dialect");
          _builder.newLine();
          _builder.newLine();
          _builder.append("spring.datasource.initialization-mode=always");
          _builder.newLine();
          _builder.append("spring.datasource.url=jdbc:postgresql://");
          String _url_1 = database.getUrl();
          _builder.append(_url_1);
          _builder.newLineIfNotEmpty();
        } else {
          boolean _equals_2 = database.getVendorName().equals(EDatabaseType.ORACLE);
          if (_equals_2) {
            _builder.append("spring.datasource.driverClassName=oracle.jdbc.driver.OracleDriver");
            _builder.newLine();
            _builder.append("spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.Oracle12cDialect");
            _builder.newLine();
            _builder.newLine();
            _builder.append("spring.datasource.initialization-mode=always ");
            _builder.newLine();
            _builder.append("spring.datasource.url=jdbc:oracle:thin:@");
            String _url_2 = database.getUrl();
            _builder.append(_url_2);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("spring.datasource.username=");
    String _username = database.getUsername();
    _builder.append(_username);
    _builder.newLineIfNotEmpty();
    _builder.append("spring.datasource.password=");
    String _password = database.getPassword();
    _builder.append(_password);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("spring.jpa.show-sql=true");
    _builder.newLine();
    _builder.append("spring.jpa.hibernate.ddl-auto=create-drop");
    _builder.newLine();
    _builder.append("spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true");
    _builder.newLine();
    _builder.append("spring.jpa.properties.hibernate.format_sql=true ");
    _builder.newLine();
    _builder.append("spring.sql.init.mode=always");
    _builder.newLine();
    _builder.append("spring.jpa.defer-datasource-initialization=true   ");
    _builder.newLine();
    _builder.append("spring.jpa.open-in-view=false");
    _builder.newLine();
    _builder.newLine();
    return _builder.toString();
  }

  public CharSequence generateApplicationProperties(final Application app) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sprint.application.name=");
    String _name = app.getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
    _builder.append("server.port=");
    Long _port = app.getPort();
    _builder.append(_port);
    _builder.newLineIfNotEmpty();
    _builder.append("server.hostname=");
    String _hostname = app.getHostname();
    _builder.append(_hostname);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generateDatabaseProperties = this.generateDatabaseProperties(app.getApp_database());
    _builder.append(_generateDatabaseProperties);
    _builder.newLineIfNotEmpty();
    {
      Security _app_security = app.getApp_security();
      if ((_app_security instanceof OAuth2)) {
        Security _app_security_1 = app.getApp_security();
        OAuth2 oauth = ((OAuth2) _app_security_1);
        _builder.newLineIfNotEmpty();
        {
          EList<Provider> _providers = oauth.getProviders();
          for(final Provider p : _providers) {
            _builder.newLine();
            _builder.append("spring.security.oauth2.client.registration.");
            String _lowerCase = p.getName().toString().toLowerCase();
            _builder.append(_lowerCase);
            _builder.append(".client-id=");
            String _clientId = p.getClientId();
            _builder.append(_clientId);
            _builder.newLineIfNotEmpty();
            _builder.append("spring.security.oauth2.client.registration.");
            String _lowerCase_1 = p.getName().toString().toLowerCase();
            _builder.append(_lowerCase_1);
            _builder.append(".client-secret=");
            String _clientSecret = p.getClientSecret();
            _builder.append(_clientSecret);
            _builder.newLineIfNotEmpty();
            {
              String _redirectUri = p.getRedirectUri();
              boolean _tripleNotEquals = (_redirectUri != null);
              if (_tripleNotEquals) {
                _builder.append("spring.security.oauth2.client.registration.");
                String _lowerCase_2 = p.getName().toString().toLowerCase();
                _builder.append(_lowerCase_2);
                _builder.append(".redirect-uri=");
                String _redirectUri_1 = p.getRedirectUri();
                _builder.append(_redirectUri_1);
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    return _builder;
  }
}
