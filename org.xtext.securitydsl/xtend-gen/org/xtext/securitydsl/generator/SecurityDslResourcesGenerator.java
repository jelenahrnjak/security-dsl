package org.xtext.securitydsl.generator;

import com.google.common.base.Objects;
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
    fsa.generateFile((resourcesDest + "application.properties"), SecurityDslResourcesGenerator.generateApplicationProperties(app));
    String _artifact_1 = app.getArtifact();
    String _plus = (_artifact_1 + "/pom.xml");
    fsa.generateFile(_plus, this.generatePomXml(app));
  }

  public String generatePomXml(final Application app) {
    String databaseDependency = "";
    Database _app_database = app.getApp_database();
    EDatabaseType _vendorName = null;
    if (_app_database!=null) {
      _vendorName=_app_database.getVendorName();
    }
    if (_vendorName != null) {
      switch (_vendorName) {
        case MY_SQL:
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("<dependency>");
          _builder.newLine();
          _builder.append("    ");
          _builder.append("<groupId>mysql</groupId>");
          _builder.newLine();
          _builder.append("    ");
          _builder.append("<artifactId>mysql-connector-java</artifactId>");
          _builder.newLine();
          _builder.append("</dependency>");
          _builder.newLine();
          databaseDependency = _builder.toString();
          break;
        case POSTGRE_SQL:
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("<dependency>");
          _builder_1.newLine();
          _builder_1.append("\t");
          _builder_1.append("<groupId>org.postgresql</groupId>");
          _builder_1.newLine();
          _builder_1.append("\t");
          _builder_1.append("<artifactId>postgresql</artifactId>");
          _builder_1.newLine();
          _builder_1.append("</dependency>");
          _builder_1.newLine();
          databaseDependency = _builder_1.toString();
          break;
        case ORACLE:
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("<dependency>");
          _builder_2.newLine();
          _builder_2.append("\t");
          _builder_2.append("<groupId>com.oracle.database.jdbc</groupId>");
          _builder_2.newLine();
          _builder_2.append("\t");
          _builder_2.append("<artifactId>ojdbc8</artifactId>");
          _builder_2.newLine();
          _builder_2.append("</dependency>");
          _builder_2.newLine();
          databaseDependency = _builder_2.toString();
          break;
        default:
          break;
      }
    }
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder_3.newLine();
    _builder_3.append("<project xmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.append("xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd\">");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.append("<modelVersion>4.0.0</modelVersion>");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.append("<parent>");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("<groupId>org.springframework.boot</groupId>");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("<artifactId>spring-boot-starter-parent</artifactId>");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("<version>2.5.2</version>");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("<relativePath/> <!-- lookup parent from repository -->");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.append("</parent>");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.append("<groupId>");
    String _group = app.getGroup();
    _builder_3.append(_group, "\t");
    _builder_3.append("</groupId>");
    _builder_3.newLineIfNotEmpty();
    _builder_3.append("\t");
    _builder_3.append("<artifactId>");
    String _artifact = app.getArtifact();
    _builder_3.append(_artifact, "\t");
    _builder_3.append("</artifactId>");
    _builder_3.newLineIfNotEmpty();
    _builder_3.append("\t");
    _builder_3.append("<version>0.0.1-SNAPSHOT</version>");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.append("<name>");
    String _name = app.getName();
    _builder_3.append(_name, "\t");
    _builder_3.append("</name>");
    _builder_3.newLineIfNotEmpty();
    _builder_3.append("\t");
    _builder_3.append("<description>");
    String _description = app.getDescription();
    _builder_3.append(_description, "\t");
    _builder_3.append("</description>");
    _builder_3.newLineIfNotEmpty();
    _builder_3.append("\t");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.append("<properties>");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("<java.version>11</java.version>");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.append("</properties>");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.append("<dependencies>");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("<dependency>");
    _builder_3.newLine();
    _builder_3.append("\t\t\t");
    _builder_3.append("<groupId>org.springframework.boot</groupId>");
    _builder_3.newLine();
    _builder_3.append("\t\t\t");
    _builder_3.append("<artifactId>spring-boot-starter-data-jpa</artifactId>");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("</dependency>");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("<dependency>");
    _builder_3.newLine();
    _builder_3.append("\t\t\t");
    _builder_3.append("<groupId>org.springframework.boot</groupId>");
    _builder_3.newLine();
    _builder_3.append("\t\t\t");
    _builder_3.append("<artifactId>spring-boot-starter-web</artifactId>");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("</dependency>");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("<dependency>");
    _builder_3.newLine();
    _builder_3.append("\t\t\t");
    _builder_3.append("<groupId>org.springframework.boot</groupId>");
    _builder_3.newLine();
    _builder_3.append("\t\t\t");
    _builder_3.append("<artifactId>spring-boot-devtools</artifactId>");
    _builder_3.newLine();
    _builder_3.append("\t\t\t");
    _builder_3.append("<scope>runtime</scope>");
    _builder_3.newLine();
    _builder_3.append("\t\t\t");
    _builder_3.append("<optional>true</optional>");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("</dependency>");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("<dependency>");
    _builder_3.newLine();
    _builder_3.append("\t\t\t");
    _builder_3.append("<groupId>org.projectlombok</groupId>");
    _builder_3.newLine();
    _builder_3.append("\t\t\t");
    _builder_3.append("<artifactId>lombok</artifactId>");
    _builder_3.newLine();
    _builder_3.append("\t\t\t");
    _builder_3.append("<optional>true</optional>");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("</dependency>");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("<dependency>");
    _builder_3.newLine();
    _builder_3.append("\t\t\t");
    _builder_3.append("<groupId>org.springframework.boot</groupId>");
    _builder_3.newLine();
    _builder_3.append("\t\t\t");
    _builder_3.append("<artifactId>spring-boot-starter-test</artifactId>");
    _builder_3.newLine();
    _builder_3.append("\t\t\t");
    _builder_3.append("<scope>test</scope>");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("</dependency>");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("<dependency>");
    _builder_3.newLine();
    _builder_3.append("\t\t\t");
    _builder_3.append("<groupId>org.modelmapper</groupId>");
    _builder_3.newLine();
    _builder_3.append("\t\t\t");
    _builder_3.append("<artifactId>modelmapper</artifactId>");
    _builder_3.newLine();
    _builder_3.append("\t\t\t");
    _builder_3.append("<version>2.4.4</version>");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("</dependency>");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append(databaseDependency, "\t\t");
    _builder_3.newLineIfNotEmpty();
    _builder_3.append("\t\t");
    _builder_3.append("<dependency>");
    _builder_3.newLine();
    _builder_3.append("\t\t\t");
    _builder_3.append("<groupId>org.springframework.boot</groupId>");
    _builder_3.newLine();
    _builder_3.append("\t\t\t");
    _builder_3.append("<artifactId>spring-boot-starter-security</artifactId>\t");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("</dependency>");
    _builder_3.newLine();
    {
      Security _app_security = app.getApp_security();
      if ((_app_security instanceof JWT)) {
        _builder_3.append("\t\t");
        _builder_3.append("<dependency>");
        _builder_3.newLine();
        _builder_3.append("\t\t");
        _builder_3.append("\t");
        _builder_3.append("<groupId>io.jsonwebtoken</groupId>");
        _builder_3.newLine();
        _builder_3.append("\t\t");
        _builder_3.append("\t");
        _builder_3.append("<artifactId>jjwt</artifactId>");
        _builder_3.newLine();
        _builder_3.append("\t\t");
        _builder_3.append("\t");
        _builder_3.append("<version>0.6.0</version>");
        _builder_3.newLine();
        _builder_3.append("\t\t");
        _builder_3.append("</dependency>");
        _builder_3.newLine();
        _builder_3.append("\t\t");
        _builder_3.append("<dependency>");
        _builder_3.newLine();
        _builder_3.append("\t\t");
        _builder_3.append("\t");
        _builder_3.append("<groupId>com.fasterxml.jackson.core</groupId>");
        _builder_3.newLine();
        _builder_3.append("\t\t");
        _builder_3.append("\t");
        _builder_3.append("<artifactId>jackson-databind</artifactId>");
        _builder_3.newLine();
        _builder_3.append("\t\t");
        _builder_3.append("</dependency>");
        _builder_3.newLine();
        _builder_3.append("\t\t");
        _builder_3.append("<dependency>");
        _builder_3.newLine();
        _builder_3.append("\t\t");
        _builder_3.append("\t");
        _builder_3.append("<groupId>com.fasterxml.jackson.core</groupId>");
        _builder_3.newLine();
        _builder_3.append("\t\t");
        _builder_3.append("\t");
        _builder_3.append("<artifactId>jackson-annotations</artifactId>");
        _builder_3.newLine();
        _builder_3.append("\t\t");
        _builder_3.append("</dependency>");
        _builder_3.newLine();
        _builder_3.append("\t\t");
        _builder_3.append("\t");
        _builder_3.newLine();
      }
    }
    _builder_3.append("\t");
    _builder_3.append("</dependencies>");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.append("<build>");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("<plugins>");
    _builder_3.newLine();
    _builder_3.append("\t\t\t");
    _builder_3.append("<plugin>");
    _builder_3.newLine();
    _builder_3.append("\t\t\t\t");
    _builder_3.append("<groupId>org.springframework.boot</groupId>");
    _builder_3.newLine();
    _builder_3.append("\t\t\t\t");
    _builder_3.append("<artifactId>spring-boot-maven-plugin</artifactId>");
    _builder_3.newLine();
    _builder_3.append("\t\t\t\t");
    _builder_3.append("<configuration>");
    _builder_3.newLine();
    _builder_3.append("\t\t\t\t\t");
    _builder_3.append("<excludes>");
    _builder_3.newLine();
    _builder_3.append("\t\t\t\t\t\t");
    _builder_3.append("<exclude>");
    _builder_3.newLine();
    _builder_3.append("\t\t\t\t\t\t\t");
    _builder_3.append("<groupId>org.projectlombok</groupId>");
    _builder_3.newLine();
    _builder_3.append("\t\t\t\t\t\t\t");
    _builder_3.append("<artifactId>lombok</artifactId>");
    _builder_3.newLine();
    _builder_3.append("\t\t\t\t\t\t");
    _builder_3.append("</exclude>");
    _builder_3.newLine();
    _builder_3.append("\t\t\t\t\t");
    _builder_3.append("</excludes>");
    _builder_3.newLine();
    _builder_3.append("\t\t\t\t");
    _builder_3.append("</configuration>");
    _builder_3.newLine();
    _builder_3.append("\t\t\t");
    _builder_3.append("</plugin>");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("</plugins>");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.append("</build>");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.newLine();
    _builder_3.append("</project>");
    _builder_3.newLine();
    _builder_3.newLine();
    String content = _builder_3.toString();
    return content;
  }

  public static String generateApplicationProperties(final Application app) {
    String databaseProperties = "";
    Database _app_database = app.getApp_database();
    boolean _tripleNotEquals = (_app_database != null);
    if (_tripleNotEquals) {
      Database database = app.getApp_database();
      EDatabaseType _vendorName = null;
      if (database!=null) {
        _vendorName=database.getVendorName();
      }
      boolean _equals = Objects.equal(_vendorName, EDatabaseType.POSTGRE_SQL);
      if (_equals) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("spring.datasource.driverClassName=org.postgresql.Driver");
        _builder.newLine();
        _builder.append("spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQL95Dialect");
        _builder.newLine();
        _builder.newLine();
        _builder.append("spring.datasource.initialization-mode=always");
        _builder.newLine();
        _builder.append("spring.datasource.url=jdbc:postgresql://");
        databaseProperties = _builder.toString();
      } else {
        EDatabaseType _vendorName_1 = null;
        if (database!=null) {
          _vendorName_1=database.getVendorName();
        }
        boolean _equals_1 = Objects.equal(_vendorName_1, EDatabaseType.MY_SQL);
        if (_equals_1) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver");
          _builder_1.newLine();
          _builder_1.append("spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialec");
          _builder_1.newLine();
          _builder_1.newLine();
          _builder_1.append("spring.datasource.initialization-mode=always");
          _builder_1.newLine();
          _builder_1.append("spring.datasource.url=jdbc:mysql://");
          databaseProperties = _builder_1.toString();
        } else {
          EDatabaseType _vendorName_2 = null;
          if (database!=null) {
            _vendorName_2=database.getVendorName();
          }
          boolean _equals_2 = Objects.equal(_vendorName_2, EDatabaseType.ORACLE);
          if (_equals_2) {
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("spring.datasource.driverClassName=oracle.jdbc.driver.OracleDriver");
            _builder_2.newLine();
            _builder_2.append("spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.Oracle12cDialect");
            _builder_2.newLine();
            _builder_2.newLine();
            _builder_2.append("spring.datasource.initialization-mode=always ");
            _builder_2.newLine();
            _builder_2.append("spring.datasource.url=jdbc:oracle:thin:@");
            databaseProperties = _builder_2.toString();
          }
        }
      }
      String _databaseProperties = databaseProperties;
      String _url = database.getUrl();
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.newLine();
      _builder_3.append("spring.datasource.username=");
      String _username = database.getUsername();
      _builder_3.append(_username);
      _builder_3.newLineIfNotEmpty();
      _builder_3.append("spring.datasource.password=");
      String _password = database.getPassword();
      _builder_3.append(_password);
      _builder_3.newLineIfNotEmpty();
      _builder_3.newLine();
      _builder_3.append("spring.jpa.show-sql=true");
      _builder_3.newLine();
      _builder_3.append("spring.jpa.hibernate.ddl-auto=create-drop");
      _builder_3.newLine();
      _builder_3.append("spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true");
      _builder_3.newLine();
      _builder_3.append("spring.jpa.properties.hibernate.format_sql=true ");
      _builder_3.newLine();
      _builder_3.append("spring.sql.init.mode=always");
      _builder_3.newLine();
      _builder_3.append("spring.jpa.defer-datasource-initialization=true   ");
      _builder_3.newLine();
      _builder_3.append("spring.jpa.open-in-view=false");
      _builder_3.newLine();
      String _plus = (_url + _builder_3);
      databaseProperties = (_databaseProperties + _plus);
    }
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append("sprint.application.name=");
    String _name = app.getName();
    _builder_4.append(_name);
    _builder_4.newLineIfNotEmpty();
    _builder_4.append("server.port=");
    Long _port = app.getPort();
    _builder_4.append(_port);
    _builder_4.newLineIfNotEmpty();
    _builder_4.append("server.hostname=");
    String _hostname = app.getHostname();
    _builder_4.append(_hostname);
    _builder_4.newLineIfNotEmpty();
    _builder_4.newLine();
    _builder_4.append(databaseProperties);
    _builder_4.newLineIfNotEmpty();
    _builder_4.newLine();
    {
      Security _app_security = app.getApp_security();
      if ((_app_security instanceof OAuth2)) {
        Security _app_security_1 = app.getApp_security();
        OAuth2 oauth = ((OAuth2) _app_security_1);
        _builder_4.newLineIfNotEmpty();
        {
          EList<Provider> _providers = oauth.getProviders();
          for(final Provider p : _providers) {
            _builder_4.append("spring.security.oauth2.client.registration.");
            String _lowerCase = p.getName().toString().toLowerCase();
            _builder_4.append(_lowerCase);
            _builder_4.append(".client-id=");
            String _clientId = p.getClientId();
            _builder_4.append(_clientId);
            _builder_4.newLineIfNotEmpty();
            _builder_4.append("spring.security.oauth2.client.registration.");
            String _lowerCase_1 = p.getName().toString().toLowerCase();
            _builder_4.append(_lowerCase_1);
            _builder_4.append(".secret=");
            String _clientSecret = p.getClientSecret();
            _builder_4.append(_clientSecret);
            _builder_4.newLineIfNotEmpty();
            {
              String _redirectUri = p.getRedirectUri();
              boolean _tripleNotEquals_1 = (_redirectUri != null);
              if (_tripleNotEquals_1) {
                _builder_4.append("spring.security.oauth2.client.registration.");
                String _lowerCase_2 = p.getName().toString().toLowerCase();
                _builder_4.append(_lowerCase_2);
                _builder_4.append(".client-id=");
                String _redirectUri_1 = p.getRedirectUri();
                _builder_4.append(_redirectUri_1);
                _builder_4.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    String propertiesContent = _builder_4.toString();
    return propertiesContent;
  }
}
