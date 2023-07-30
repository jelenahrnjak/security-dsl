package org.xtext.securitydsl.generator;

import com.google.common.collect.Iterators;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import security_dsl.Application;
import security_dsl.Authentication;
import security_dsl.Controller;
import security_dsl.Role;
import security_dsl.RoleInstance;

@SuppressWarnings("all")
public class SecurityDslBasicAuthenticationGenerator {
  public SecurityDslBasicAuthenticationGenerator(final Resource resource, final IFileSystemAccess2 fsa, final Application app, final String srcDestination) {
    Iterator<Role> roles = Iterators.<Role>filter(resource.getAllContents(), Role.class);
    EList<Controller> _app_controllers = app.getApp_controllers();
    for (final Controller c : _app_controllers) {
      if ((c instanceof Authentication)) {
        fsa.generateFile((srcDestination + "/config/ApplicationSecurityConfig.java"), this.generateApplicationSecurityConfig(app.getPackageName(), ((Authentication)c)));
      }
    }
    fsa.generateFile((srcDestination + "/exception/ResourceConflictException.java"), this.generateException(app.getPackageName()));
    boolean _hasNext = roles.hasNext();
    if (_hasNext) {
      Role role = roles.next();
      fsa.generateFile((srcDestination + "/model/enumeration/Role.java"), this.generateRoleEnumeration(app.getPackageName(), role.getRole_instances()));
    }
  }

  public String generateException(final String packageName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(packageName);
    _builder.append(".exception;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ResourceConflictException extends RuntimeException {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static final long serialVersionUID = 1791564636123821405L;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private Long resourceId;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ResourceConflictException(Long resourceId, String message) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("super(message);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.setResourceId(resourceId);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Long getResourceId() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return resourceId;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void setResourceId(Long resourceId) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.resourceId = resourceId;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    String content = _builder.toString();
    return content;
  }

  public CharSequence generateApplicationSecurityConfig(final String packageName, final Authentication authController) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(packageName);
    _builder.append(".config;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    _builder.append(packageName);
    _builder.append(".service.impl.UserServiceImpl;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import uns.ftn.securityDsl.service.impl.UserServiceImpl;");
    _builder.newLine();
    _builder.append("import org.springframework.beans.factory.annotation.Autowired;");
    _builder.newLine();
    _builder.append("import org.springframework.context.annotation.Bean;");
    _builder.newLine();
    _builder.append("import org.springframework.context.annotation.Configuration;");
    _builder.newLine();
    _builder.append("import org.springframework.security.authentication.AuthenticationManager;");
    _builder.newLine();
    _builder.append("import org.springframework.security.authentication.dao.DaoAuthenticationProvider;");
    _builder.newLine();
    _builder.append("import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;");
    _builder.newLine();
    _builder.append("import org.springframework.security.config.annotation.web.builders.HttpSecurity;");
    _builder.newLine();
    _builder.append("import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;");
    _builder.newLine();
    _builder.append("import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;");
    _builder.newLine();
    _builder.append("import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Configuration");
    _builder.newLine();
    _builder.append("@EnableWebSecurity");
    _builder.newLine();
    _builder.append("public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Autowired");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private  BCryptPasswordEncoder bCryptPasswordEncoder;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Autowired");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private  UserServiceImpl userService;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Bean");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public BCryptPasswordEncoder bCryptPasswordEncoder() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return new BCryptPasswordEncoder();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected void configure(HttpSecurity httpSecurity) throws Exception {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("httpSecurity.csrf().disable()");
    _builder.newLine();
    _builder.append("                ");
    _builder.append(".formLogin().disable()");
    _builder.newLine();
    _builder.append("                ");
    _builder.append(".logout().disable()");
    _builder.newLine();
    _builder.append("                ");
    _builder.append(".authorizeRequests().antMatchers(\"");
    String _path = authController.getPath();
    _builder.append(_path, "                ");
    _builder.append("/**\").permitAll()");
    _builder.newLineIfNotEmpty();
    _builder.append("                ");
    _builder.append(".anyRequest().authenticated()");
    _builder.newLine();
    _builder.append("                ");
    _builder.append(".and().httpBasic();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Autowired");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void config(AuthenticationManagerBuilder authentication)");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("throws Exception");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("{");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("authentication.authenticationProvider(daoAuthenticationProvider());");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Bean");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public AuthenticationManager authenticationManagerBean() throws Exception {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return super.authenticationManagerBean();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Bean");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public DaoAuthenticationProvider daoAuthenticationProvider(){");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("DaoAuthenticationProvider provider = new DaoAuthenticationProvider();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("provider.setPasswordEncoder(bCryptPasswordEncoder);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("provider.setUserDetailsService(userService);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return provider;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  public CharSequence generateRoleEnumeration(final String packageName, final List<RoleInstance> roleInstances) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(packageName);
    _builder.append(".model.enumeration;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public enum Role {");
    _builder.newLine();
    _builder.newLine();
    {
      int _size = roleInstances.size();
      int _minus = (_size - 1);
      IntegerRange _upTo = new IntegerRange(0, _minus);
      for(final Integer i : _upTo) {
        _builder.append("\t");
        String _name = roleInstances.get((i).intValue()).getName();
        _builder.append(_name, "\t");
        _builder.newLineIfNotEmpty();
        {
          int _size_1 = roleInstances.size();
          int _minus_1 = (_size_1 - 1);
          boolean _notEquals = ((i).intValue() != _minus_1);
          if (_notEquals) {
            _builder.append(",");
            _builder.newLine();
          } else {
            if ((((i).intValue() == (roleInstances.size() - 1)) && (roleInstances.size() != 0))) {
              _builder.append(";");
              _builder.newLine();
            }
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public String getAuthority() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return this.name();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
