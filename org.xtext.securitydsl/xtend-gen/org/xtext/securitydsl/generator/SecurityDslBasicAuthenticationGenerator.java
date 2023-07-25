package org.xtext.securitydsl.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import security_dsl.Application;
import security_dsl.Attribute;
import security_dsl.Authentication;
import security_dsl.Controller;
import security_dsl.EEndpointType;
import security_dsl.EType;
import security_dsl.Endpoint;
import security_dsl.User;

@SuppressWarnings("all")
public class SecurityDslBasicAuthenticationGenerator {
  public SecurityDslBasicAuthenticationGenerator(final Resource resource, final IFileSystemAccess2 fsa, final Application app, final String srcDestination) {
    Authentication authController = null;
    User user = Iterators.<User>filter(resource.getAllContents(), User.class).next();
    EList<Controller> _app_controllers = app.getApp_controllers();
    for (final Controller c : _app_controllers) {
      {
        if ((c instanceof Authentication)) {
          authController = ((Authentication)c);
        }
        fsa.generateFile((srcDestination + "/config/ApplicationSecurityConfig.java"), this.generateApplicationSecurityConfig(app.getPackageName(), authController));
      }
    }
    fsa.generateFile((srcDestination + "/dto/UserRequestDTO.java"), this.generateUserRequestDto(app.getPackageName(), user));
    fsa.generateFile((srcDestination + "/controller/AuthController.java"), this.generateAuthController(app.getPackageName(), authController));
    String _packageName = app.getPackageName();
    String _plus = (_packageName + ".config");
    fsa.generateFile((srcDestination + "/config/PasswordEncoder.java"), this.generatePassEncoder(_plus));
    fsa.generateFile((srcDestination + "/service/IUserService.java"), this.generateIUserService(app.getPackageName()));
    fsa.generateFile((srcDestination + "/service/impl/UserService.java"), this.generateUserServiceImpl(app.getPackageName()));
  }

  public String generateIUserService(final String packageName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _plus = (_builder.toString() + packageName);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append(".service;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("import ");
    String _plus_1 = (_plus + _builder_1);
    String _plus_2 = (_plus_1 + packageName);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("\t\t");
    _builder_2.append(".model.User;");
    _builder_2.newLine();
    _builder_2.newLine();
    _builder_2.append("import java.util.List;");
    _builder_2.newLine();
    _builder_2.newLine();
    _builder_2.append("public interface IUserService {");
    _builder_2.newLine();
    _builder_2.newLine();
    _builder_2.append("\t");
    _builder_2.append("User save(User user);");
    _builder_2.newLine();
    _builder_2.newLine();
    _builder_2.append("\t");
    _builder_2.append("User find(String username);");
    _builder_2.newLine();
    _builder_2.newLine();
    _builder_2.append("\t");
    _builder_2.append("List<User> findAll();");
    _builder_2.newLine();
    _builder_2.newLine();
    _builder_2.append("}");
    _builder_2.newLine();
    String content = (_plus_2 + _builder_2);
    return content;
  }

  public String generateUserServiceImpl(final String packageName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _plus = (_builder.toString() + packageName);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append(".service.impl;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("import  ");
    String _plus_1 = (_plus + _builder_1);
    String _plus_2 = (_plus_1 + packageName);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append(".model.User;");
    _builder_2.newLine();
    _builder_2.append("import ");
    String _plus_3 = (_plus_2 + _builder_2);
    String _plus_4 = (_plus_3 + packageName);
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append(".repository.UserRepository;");
    _builder_3.newLine();
    _builder_3.append("import ");
    String _plus_5 = (_plus_4 + _builder_3);
    String _plus_6 = (_plus_5 + packageName);
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append(".service.IUserService;");
    _builder_4.newLine();
    _builder_4.newLine();
    _builder_4.append("import lombok.RequiredArgsConstructor;");
    _builder_4.newLine();
    _builder_4.append("import org.springframework.beans.factory.annotation.Autowired;");
    _builder_4.newLine();
    _builder_4.append("import org.springframework.security.core.userdetails.UserDetails;");
    _builder_4.newLine();
    _builder_4.append("import org.springframework.security.core.userdetails.UserDetailsService;");
    _builder_4.newLine();
    _builder_4.append("import org.springframework.security.core.userdetails.UsernameNotFoundException;");
    _builder_4.newLine();
    _builder_4.append("import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;");
    _builder_4.newLine();
    _builder_4.append("import org.springframework.stereotype.Service;");
    _builder_4.newLine();
    _builder_4.newLine();
    _builder_4.append("import java.util.List;");
    _builder_4.newLine();
    _builder_4.newLine();
    _builder_4.append("@RequiredArgsConstructor(onConstructor = @__(@Autowired))");
    _builder_4.newLine();
    _builder_4.append("@Service");
    _builder_4.newLine();
    _builder_4.append("public class UserServiceImpl implements UserDetailsService, IUserService {");
    _builder_4.newLine();
    _builder_4.newLine();
    _builder_4.append("    ");
    _builder_4.append("private final UserRepository userRepository;");
    _builder_4.newLine();
    _builder_4.append("    ");
    _builder_4.append("private final BCryptPasswordEncoder bCryptPasswordEncoder;");
    _builder_4.newLine();
    _builder_4.append("\t");
    _builder_4.newLine();
    _builder_4.append("\t");
    _builder_4.append("@Override");
    _builder_4.newLine();
    _builder_4.append("    ");
    _builder_4.append("public User save(User user) {");
    _builder_4.newLine();
    _builder_4.append("    \t");
    _builder_4.append("if (userRepository.find(newUser.getUsername()) != null) {");
    _builder_4.newLine();
    _builder_4.append("    \t\t");
    _builder_4.append("throw new RuntimeException(\"User already exists\");");
    _builder_4.newLine();
    _builder_4.newLine();
    _builder_4.append("    \t\t");
    _builder_4.append("}");
    _builder_4.newLine();
    _builder_4.append("    \t");
    _builder_4.append("newUser.setRole(\"user\");");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("String encoderPassword = bCryptPasswordEncoder.encode(newUser.getPassword());");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("newUser.setPassword(encoderPassword);");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.newLine();
    _builder_4.append("    \t");
    _builder_4.append("return userRepository.saveAndFlush(newUser);");
    _builder_4.newLine();
    _builder_4.append("    ");
    _builder_4.append("}");
    _builder_4.newLine();
    _builder_4.newLine();
    _builder_4.append("    ");
    _builder_4.append("@Override");
    _builder_4.newLine();
    _builder_4.append("    ");
    _builder_4.append("public List<User> findAll() {");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("return userRepository.findAll();");
    _builder_4.newLine();
    _builder_4.append("    ");
    _builder_4.append("}");
    _builder_4.newLine();
    _builder_4.append("    \t\t");
    _builder_4.newLine();
    _builder_4.append("    ");
    _builder_4.append("@Override");
    _builder_4.newLine();
    _builder_4.append("    ");
    _builder_4.append("public User find(String username) {");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("return userRepository.findOneByUsername();");
    _builder_4.newLine();
    _builder_4.append(" ");
    _builder_4.append("}");
    _builder_4.newLine();
    _builder_4.append("  \t");
    _builder_4.append("@Override");
    _builder_4.newLine();
    _builder_4.append(" \t");
    _builder_4.append("public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {");
    _builder_4.newLine();
    _builder_4.append(" \t");
    _builder_4.append("return userRepository.findByUsername(username)");
    _builder_4.newLine();
    _builder_4.append(" \t\t");
    _builder_4.append(".orElseThrow(() ->");
    _builder_4.newLine();
    _builder_4.append(" \t\t");
    _builder_4.append("new UsernameNotFoundException(\"User Not Found\"));");
    _builder_4.newLine();
    _builder_4.append(" \t");
    _builder_4.append("}");
    _builder_4.newLine();
    String content = (_plus_6 + _builder_4);
    return content;
  }

  public String generateApplicationSecurityConfig(final String packageName, final Authentication authController) {
    String regEndpoint = "";
    EList<Endpoint> _controller_endpoints = authController.getController_endpoints();
    for (final Endpoint e : _controller_endpoints) {
      EEndpointType _type = e.getType();
      boolean _equals = Objects.equal(_type, EEndpointType.REGISTRATION);
      if (_equals) {
        String _path = authController.getPath();
        String _url = e.getUrl();
        String _plus = (_path + _url);
        regEndpoint = _plus;
      }
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _plus_1 = (_builder.toString() + packageName);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append(".config;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("import ");
    String _plus_2 = (_plus_1 + _builder_1);
    String _plus_3 = (_plus_2 + packageName);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append(".service.impl.UserServiceImpl;");
    _builder_2.newLine();
    _builder_2.append("import lombok.RequiredArgsConstructor;");
    _builder_2.newLine();
    _builder_2.append("import org.springframework.beans.factory.annotation.Autowired;");
    _builder_2.newLine();
    _builder_2.append("import org.springframework.context.annotation.Bean;");
    _builder_2.newLine();
    _builder_2.append("import org.springframework.context.annotation.Configuration;");
    _builder_2.newLine();
    _builder_2.append("import org.springframework.security.authentication.dao.DaoAuthenticationProvider;");
    _builder_2.newLine();
    _builder_2.append("import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;");
    _builder_2.newLine();
    _builder_2.append("import org.springframework.security.config.annotation.web.builders.HttpSecurity;");
    _builder_2.newLine();
    _builder_2.append("import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;");
    _builder_2.newLine();
    _builder_2.append("import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;");
    _builder_2.newLine();
    _builder_2.append("import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;");
    _builder_2.newLine();
    _builder_2.newLine();
    _builder_2.append("@RequiredArgsConstructor(onConstructor = @__(@Autowired))");
    _builder_2.newLine();
    _builder_2.append("@Configuration");
    _builder_2.newLine();
    _builder_2.append("@EnableWebSecurity");
    _builder_2.newLine();
    _builder_2.append("public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {");
    _builder_2.newLine();
    _builder_2.newLine();
    _builder_2.append("    ");
    _builder_2.append("private final BCryptPasswordEncoder bCryptPasswordEncoder;");
    _builder_2.newLine();
    _builder_2.append("    ");
    _builder_2.append("private final UserServiceImpl userService;");
    _builder_2.newLine();
    _builder_2.newLine();
    _builder_2.newLine();
    _builder_2.append("    ");
    _builder_2.append("@Override");
    _builder_2.newLine();
    _builder_2.append("    ");
    _builder_2.append("protected void configure(HttpSecurity httpSecurity) throws Exception {");
    _builder_2.newLine();
    _builder_2.append("        ");
    _builder_2.append("httpSecurity.csrf().disable()");
    _builder_2.newLine();
    _builder_2.append("                ");
    _builder_2.append(".formLogin().disable()");
    _builder_2.newLine();
    _builder_2.append("                ");
    _builder_2.append(".logout().disable()");
    _builder_2.newLine();
    _builder_2.append("                ");
    _builder_2.append(".authorizeRequests().antMatchers(\"");
    String _plus_4 = (_plus_3 + _builder_2);
    String _plus_5 = (_plus_4 + regEndpoint);
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("\").permitAll()");
    _builder_3.newLine();
    _builder_3.append("                ");
    _builder_3.append(".anyRequest().authenticated()");
    _builder_3.newLine();
    _builder_3.append("                ");
    _builder_3.append(".and().httpBasic();");
    _builder_3.newLine();
    _builder_3.newLine();
    _builder_3.append("    ");
    _builder_3.append("}");
    _builder_3.newLine();
    _builder_3.newLine();
    _builder_3.append("    ");
    _builder_3.append("@Autowired");
    _builder_3.newLine();
    _builder_3.append("    ");
    _builder_3.append("public void config(AuthenticationManagerBuilder authentication)");
    _builder_3.newLine();
    _builder_3.append("            ");
    _builder_3.append("throws Exception");
    _builder_3.newLine();
    _builder_3.append("    ");
    _builder_3.append("{");
    _builder_3.newLine();
    _builder_3.append("        ");
    _builder_3.append("authentication.authenticationProvider(daoAuthenticationProvider());");
    _builder_3.newLine();
    _builder_3.append("    ");
    _builder_3.append("}");
    _builder_3.newLine();
    _builder_3.newLine();
    _builder_3.append("    ");
    _builder_3.append("@Bean");
    _builder_3.newLine();
    _builder_3.append("    ");
    _builder_3.append("public DaoAuthenticationProvider daoAuthenticationProvider(){");
    _builder_3.newLine();
    _builder_3.append("        ");
    _builder_3.append("DaoAuthenticationProvider provider = new DaoAuthenticationProvider();");
    _builder_3.newLine();
    _builder_3.append("        ");
    _builder_3.append("provider.setPasswordEncoder(bCryptPasswordEncoder);");
    _builder_3.newLine();
    _builder_3.append("        ");
    _builder_3.append("provider.setUserDetailsService(userService);");
    _builder_3.newLine();
    _builder_3.append("        ");
    _builder_3.append("return provider;");
    _builder_3.newLine();
    _builder_3.append("    ");
    _builder_3.append("}");
    _builder_3.newLine();
    _builder_3.newLine();
    _builder_3.append("}");
    _builder_3.newLine();
    String content = (_plus_5 + _builder_3);
    return content;
  }

  public String generatePassEncoder(final String packageName) {
    String content = "";
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _plus = (_builder.toString() + packageName);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append(";");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("import org.springframework.context.annotation.Bean;");
    _builder_1.newLine();
    _builder_1.append("import org.springframework.context.annotation.Configuration;");
    _builder_1.newLine();
    _builder_1.append("import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("@Configuration");
    _builder_1.newLine();
    _builder_1.append("public class PasswordEncoder {");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("@Bean");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("public BCryptPasswordEncoder bCryptPasswordEncoder(){");
    _builder_1.newLine();
    _builder_1.append("        ");
    _builder_1.append("return new BCryptPasswordEncoder();");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    String _plus_1 = (_plus + _builder_1);
    content = _plus_1;
    return content;
  }

  public String generateAuthController(final String packageName, final Authentication authController) {
    String regEndpoint = "";
    EList<Endpoint> _controller_endpoints = authController.getController_endpoints();
    for (final Endpoint e : _controller_endpoints) {
      EEndpointType _type = e.getType();
      boolean _equals = Objects.equal(_type, EEndpointType.REGISTRATION);
      if (_equals) {
        regEndpoint = e.getUrl();
      }
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _plus = (_builder.toString() + packageName);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append(".controller;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("import ");
    String _plus_1 = (_plus + _builder_1);
    String _plus_2 = (_plus_1 + packageName);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append(".dto.UserRequestDTO;");
    _builder_2.newLine();
    _builder_2.append("import ");
    String _plus_3 = (_plus_2 + _builder_2);
    String _plus_4 = (_plus_3 + packageName);
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append(".model.User;");
    _builder_3.newLine();
    _builder_3.append("import ");
    String _plus_5 = (_plus_4 + _builder_3);
    String _plus_6 = (_plus_5 + packageName);
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append(".service.IUserService;");
    _builder_4.newLine();
    _builder_4.append("import lombok.RequiredArgsConstructor;");
    _builder_4.newLine();
    _builder_4.append("import org.springframework.beans.BeanUtils;");
    _builder_4.newLine();
    _builder_4.append("import org.springframework.beans.factory.annotation.Autowired;");
    _builder_4.newLine();
    _builder_4.append("import org.springframework.http.ResponseEntity;");
    _builder_4.newLine();
    _builder_4.append("import org.springframework.http.MediaType;");
    _builder_4.newLine();
    _builder_4.append("import org.springframework.security.access.prepost.PreAuthorize;");
    _builder_4.newLine();
    _builder_4.append("import org.springframework.web.bind.annotation.RestController;");
    _builder_4.newLine();
    _builder_4.append("import org.springframework.web.bind.annotation.RequestBody;");
    _builder_4.newLine();
    _builder_4.append("import org.springframework.web.bind.annotation.RequestMapping;");
    _builder_4.newLine();
    _builder_4.newLine();
    _builder_4.append("import java.util.List;");
    _builder_4.newLine();
    _builder_4.newLine();
    _builder_4.append("@RequiredArgsConstructor(onConstructor = @__(@Autowired))");
    _builder_4.newLine();
    _builder_4.append("@RequestMapping(value = \"");
    String _plus_7 = (_plus_6 + _builder_4);
    String _path = authController.getPath();
    String _plus_8 = (_plus_7 + _path);
    StringConcatenation _builder_5 = new StringConcatenation();
    _builder_5.append("\",");
    _builder_5.newLine();
    _builder_5.append("        ");
    _builder_5.append("consumes = MediaType.APPLICATION_JSON_VALUE,");
    _builder_5.newLine();
    _builder_5.append("        ");
    _builder_5.append("produces = MediaType.APPLICATION_JSON_VALUE)");
    _builder_5.newLine();
    _builder_5.append("@RestController");
    _builder_5.newLine();
    _builder_5.append("public class AuthController {");
    _builder_5.newLine();
    _builder_5.newLine();
    _builder_5.append("    ");
    _builder_5.append("private final IUserService userService;");
    _builder_5.newLine();
    _builder_5.newLine();
    _builder_5.append("    ");
    _builder_5.append("@Override");
    _builder_5.newLine();
    _builder_5.append("    ");
    _builder_5.append("@GetMapping()");
    _builder_5.newLine();
    _builder_5.append("    ");
    _builder_5.append("@PreAuthorize(\"hasAuthority(\'ROLE_ADMIN\')\")");
    _builder_5.newLine();
    _builder_5.append("    ");
    _builder_5.append("public ResponseEntity<List<User>> getDataUser() {");
    _builder_5.newLine();
    _builder_5.append("        ");
    _builder_5.append("return ResponseEntity.ok(userService.findAll());");
    _builder_5.newLine();
    _builder_5.append("    ");
    _builder_5.append("}");
    _builder_5.newLine();
    _builder_5.newLine();
    _builder_5.append("    ");
    _builder_5.append("@Override");
    _builder_5.newLine();
    _builder_5.append("    ");
    _builder_5.append("@PostMapping(\"");
    String _plus_9 = (_plus_8 + _builder_5);
    String _path_1 = authController.getPath();
    String _plus_10 = (_plus_9 + _path_1);
    String _plus_11 = (_plus_10 + regEndpoint);
    StringConcatenation _builder_6 = new StringConcatenation();
    _builder_6.append("\")");
    _builder_6.newLine();
    _builder_6.append("    ");
    _builder_6.append("public ResponseEntity<User> registerUser(RequestUserData request) {");
    _builder_6.newLine();
    _builder_6.append("        ");
    _builder_6.append("User user = new User();");
    _builder_6.newLine();
    _builder_6.append("        ");
    _builder_6.append("BeanUtils.copyProperties(request, user);");
    _builder_6.newLine();
    _builder_6.append("        ");
    _builder_6.append("return ResponseEntity.ok(userService.save(user));");
    _builder_6.newLine();
    _builder_6.append("    ");
    _builder_6.append("}");
    _builder_6.newLine();
    _builder_6.newLine();
    _builder_6.newLine();
    _builder_6.append("}");
    _builder_6.newLine();
    String content = (_plus_11 + _builder_6);
    return content;
  }

  public String generateUserRequestDto(final String packageName, final User user) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _plus = (_builder.toString() + packageName);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append(".dto;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("import lombok.*;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("@Getter");
    _builder_1.newLine();
    _builder_1.append("@Setter");
    _builder_1.newLine();
    _builder_1.append("@ToString");
    _builder_1.newLine();
    _builder_1.append("@AllArgsConstructor");
    _builder_1.newLine();
    _builder_1.append("@NoArgsConstructor");
    _builder_1.newLine();
    _builder_1.append("public class RequestUserDTO {");
    _builder_1.newLine();
    _builder_1.newLine();
    String _plus_1 = (_plus + _builder_1);
    String _generateAttributes = this.generateAttributes(user.getModel_attributes());
    String _plus_2 = (_plus_1 + _generateAttributes);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("    ");
    _builder_2.append("private String role;");
    _builder_2.newLine();
    _builder_2.append("}");
    _builder_2.newLine();
    _builder_2.newLine();
    String content = (_plus_2 + _builder_2);
    return content;
  }

  public String generateAttributes(final List<Attribute> attributes) {
    String content = "";
    for (final Attribute a : attributes) {
      String _content = content;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("    ");
      _builder.append("private ");
      EType _type = a.getType();
      String _plus = (_builder.toString() + _type);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(" ");
      String _plus_1 = (_plus + _builder_1);
      String _name = a.getName();
      String _plus_2 = (_plus_1 + _name);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.newLine();
      String _plus_3 = (_plus_2 + _builder_2);
      content = (_content + _plus_3);
    }
    return content;
  }
}
