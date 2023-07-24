package rs.ac.uns.ftn.securitydsl.generator;

import com.google.common.base.Objects;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import security_dsl.Application;
import security_dsl.Database;
import security_dsl.EDatabaseType;

@SuppressWarnings("all")
public class SecurityDslResourcesGenerator {
  public SecurityDslResourcesGenerator(final IFileSystemAccess2 fsa, final Application app) {
    String _artifact = app.getArtifact();
    String resourcesDest = (_artifact + "/src/main/resouces/");
    fsa.generateFile((resourcesDest + "application.properties"), SecurityDslResourcesGenerator.generateApplicationProperties(app));
  }

  public static String generateApplicationProperties(final Application app) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sprint.application.name");
    String _name = app.getName();
    String _plus = (_builder.toString() + _name);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.newLine();
    _builder_1.append("server.port=");
    String _plus_1 = (_plus + _builder_1);
    Long _port = app.getPort();
    String _plus_2 = (_plus_1 + _port);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.newLine();
    _builder_2.append("server.hostname=");
    String _plus_3 = (_plus_2 + _builder_2);
    String _hostname = app.getHostname();
    String _plus_4 = (_plus_3 + _hostname);
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("      ");
    _builder_3.newLine();
    _builder_3.append("      ");
    _builder_3.newLine();
    String propertiesContent = (_plus_4 + _builder_3);
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
        String _propertiesContent = propertiesContent;
        StringConcatenation _builder_4 = new StringConcatenation();
        _builder_4.append("spring.datasource.driverClassName=org.postgresql.Driver");
        _builder_4.newLine();
        _builder_4.append("spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQL95Dialect");
        _builder_4.newLine();
        _builder_4.newLine();
        _builder_4.append("spring.datasource.initialization-mode=always");
        _builder_4.newLine();
        _builder_4.append("spring.datasource.url=jdbc:postgresql://");
        propertiesContent = (_propertiesContent + _builder_4);
      } else {
        EDatabaseType _vendorName_1 = null;
        if (database!=null) {
          _vendorName_1=database.getVendorName();
        }
        boolean _equals_1 = Objects.equal(_vendorName_1, EDatabaseType.MY_SQL);
        if (_equals_1) {
          String _propertiesContent_1 = propertiesContent;
          StringConcatenation _builder_5 = new StringConcatenation();
          _builder_5.append("spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver");
          _builder_5.newLine();
          _builder_5.append("spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialec");
          _builder_5.newLine();
          _builder_5.newLine();
          _builder_5.append("spring.datasource.initialization-mode=always");
          _builder_5.newLine();
          _builder_5.append("spring.datasource.url=jdbc:mysql://");
          propertiesContent = (_propertiesContent_1 + _builder_5);
        } else {
          EDatabaseType _vendorName_2 = null;
          if (database!=null) {
            _vendorName_2=database.getVendorName();
          }
          boolean _equals_2 = Objects.equal(_vendorName_2, EDatabaseType.ORACLE);
          if (_equals_2) {
            String _propertiesContent_2 = propertiesContent;
            StringConcatenation _builder_6 = new StringConcatenation();
            _builder_6.append("spring.datasource.driverClassName=oracle.jdbc.driver.OracleDriver");
            _builder_6.newLine();
            _builder_6.append("spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.Oracle12cDialect");
            _builder_6.newLine();
            _builder_6.newLine();
            _builder_6.append("spring.datasource.initialization-mode=always ");
            _builder_6.newLine();
            _builder_6.append("spring.datasource.url=jdbc:oracle:thin:@");
            propertiesContent = (_propertiesContent_2 + _builder_6);
          }
        }
      }
      String _propertiesContent_3 = propertiesContent;
      String _url = database.getUrl();
      StringConcatenation _builder_7 = new StringConcatenation();
      _builder_7.newLine();
      _builder_7.append("spring.datasource.username=");
      String _plus_5 = (_url + _builder_7);
      String _username = database.getUsername();
      String _plus_6 = (_plus_5 + _username);
      StringConcatenation _builder_8 = new StringConcatenation();
      _builder_8.newLine();
      _builder_8.append("spring.datasource.password=");
      String _plus_7 = (_plus_6 + _builder_8);
      String _password = database.getPassword();
      String _plus_8 = (_plus_7 + _password);
      StringConcatenation _builder_9 = new StringConcatenation();
      _builder_9.newLine();
      _builder_9.newLine();
      _builder_9.append("spring.jpa.show-sql=true");
      _builder_9.newLine();
      _builder_9.append("spring.jpa.hibernate.ddl-auto=create-drop");
      _builder_9.newLine();
      _builder_9.append("spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true");
      _builder_9.newLine();
      String _plus_9 = (_plus_8 + _builder_9);
      propertiesContent = (_propertiesContent_3 + _plus_9);
    }
    return propertiesContent;
  }
}
