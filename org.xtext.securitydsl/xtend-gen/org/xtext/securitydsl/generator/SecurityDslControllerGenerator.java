package org.xtext.securitydsl.generator;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import security_dsl.Application;
import security_dsl.Authentication;
import security_dsl.BasicAuthentication;
import security_dsl.Controller;
import security_dsl.EEndpointType;
import security_dsl.Endpoint;
import security_dsl.Security;

@SuppressWarnings("all")
public class SecurityDslControllerGenerator {
  public SecurityDslControllerGenerator(final IFileSystemAccess2 fsa, final Application app, final String srcDestination) {
    EList<Controller> _app_controllers = app.getApp_controllers();
    for (final Controller c : _app_controllers) {
      if ((c instanceof Authentication)) {
        fsa.generateFile((srcDestination + "/controller/AuthController.java"), this.generateAuthController(app.getPackageName(), ((Authentication)c), app.getApp_security()));
      }
    }
  }

  public String generateAuthController(final String packageName, final Authentication authController, final Security security) {
    String regEndpoint = "";
    String loginEndpoint = "";
    String logoutEndpoint = "";
    EList<Endpoint> _controller_endpoints = authController.getController_endpoints();
    for (final Endpoint e : _controller_endpoints) {
      {
        EEndpointType _type = e.getType();
        boolean _equals = Objects.equal(_type, EEndpointType.REGISTRATION);
        if (_equals) {
          regEndpoint = e.getUrl();
        }
        EEndpointType _type_1 = e.getType();
        boolean _equals_1 = Objects.equal(_type_1, EEndpointType.LOGIN);
        if (_equals_1) {
          loginEndpoint = e.getUrl();
        }
        EEndpointType _type_2 = e.getType();
        boolean _equals_2 = Objects.equal(_type_2, EEndpointType.LOGOUT);
        if (_equals_2) {
          logoutEndpoint = e.getUrl();
        }
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
    _builder_4.append("import org.springframework.security.core.Authentication;");
    _builder_4.newLine();
    _builder_4.append("import org.springframework.http.ResponseEntity;");
    _builder_4.newLine();
    _builder_4.append("import org.springframework.security.authentication.AuthenticationManager;");
    _builder_4.newLine();
    _builder_4.append("import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;");
    _builder_4.newLine();
    _builder_4.append("import org.springframework.security.core.context.SecurityContextHolder;");
    _builder_4.newLine();
    _builder_4.append("import org.springframework.web.bind.annotation.RestController;");
    _builder_4.newLine();
    _builder_4.append("import org.springframework.web.bind.annotation.RequestBody;");
    _builder_4.newLine();
    _builder_4.append("import org.springframework.web.bind.annotation.RequestMapping;");
    _builder_4.newLine();
    _builder_4.append("import org.springframework.web.bind.annotation.GetMapping;");
    _builder_4.newLine();
    _builder_4.append("import org.springframework.web.bind.annotation.PostMapping;");
    _builder_4.newLine();
    _builder_4.newLine();
    _builder_4.append("@RequiredArgsConstructor(onConstructor = @__(@Autowired))");
    _builder_4.newLine();
    _builder_4.append("@RequestMapping(value = \"");
    String _plus_7 = (_plus_6 + _builder_4);
    String _path = authController.getPath();
    String _plus_8 = (_plus_7 + _path);
    StringConcatenation _builder_5 = new StringConcatenation();
    _builder_5.append("\")");
    _builder_5.newLine();
    _builder_5.append("@RestController");
    _builder_5.newLine();
    _builder_5.append("public class AuthController {");
    _builder_5.newLine();
    _builder_5.newLine();
    _builder_5.append("    ");
    _builder_5.append("private final IUserService userService;");
    _builder_5.newLine();
    String content = (_plus_8 + _builder_5);
    if ((security instanceof BasicAuthentication)) {
      String _content = content;
      StringConcatenation _builder_6 = new StringConcatenation();
      _builder_6.append("    ");
      _builder_6.append("private final AuthenticationManager  authenticationManager;");
      content = (_content + _builder_6);
    }
    String _content_1 = content;
    StringConcatenation _builder_7 = new StringConcatenation();
    _builder_7.append("    ");
    _builder_7.append("@PostMapping(\"");
    String _plus_9 = (_builder_7.toString() + regEndpoint);
    StringConcatenation _builder_8 = new StringConcatenation();
    _builder_8.append("\")");
    _builder_8.newLine();
    _builder_8.append("    ");
    _builder_8.append("public ResponseEntity<User> registration(@RequestBody UserRequestDTO request) {");
    _builder_8.newLine();
    _builder_8.append("        ");
    _builder_8.append("User user = new User();");
    _builder_8.newLine();
    _builder_8.append("        ");
    _builder_8.append("BeanUtils.copyProperties(request, user);");
    _builder_8.newLine();
    _builder_8.append("        ");
    _builder_8.append("return ResponseEntity.ok(userService.save(user));");
    _builder_8.newLine();
    _builder_8.append("    ");
    _builder_8.append("}");
    _builder_8.newLine();
    _builder_8.append("    ");
    _builder_8.newLine();
    _builder_8.append("\t");
    _builder_8.append("@PostMapping(\"");
    String _plus_10 = (_plus_9 + _builder_8);
    String _plus_11 = (_plus_10 + loginEndpoint);
    StringConcatenation _builder_9 = new StringConcatenation();
    _builder_9.append("\")");
    _builder_9.newLine();
    _builder_9.append("\t");
    _builder_9.append("public ResponseEntity<User> login(@RequestBody UserRequestDTO request) {");
    _builder_9.newLine();
    _builder_9.newLine();
    _builder_9.append("\t");
    _builder_9.append("Authentication authentication = new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword());");
    _builder_9.newLine();
    _builder_9.append("\t");
    _builder_9.append("authentication = authenticationManager.authenticate(authentication);");
    _builder_9.newLine();
    _builder_9.append("\t");
    _builder_9.append("SecurityContextHolder.getContext().setAuthentication(authentication);");
    _builder_9.newLine();
    _builder_9.append("\t");
    _builder_9.append("User user = (User) authentication.getPrincipal();");
    _builder_9.newLine();
    _builder_9.append("\t");
    _builder_9.append("return ResponseEntity.ok(user);");
    _builder_9.newLine();
    _builder_9.append("\t");
    _builder_9.append("}");
    _builder_9.newLine();
    _builder_9.newLine();
    _builder_9.append("\t");
    _builder_9.append("@GetMapping(\"");
    String _plus_12 = (_plus_11 + _builder_9);
    String _plus_13 = (_plus_12 + logoutEndpoint);
    StringConcatenation _builder_10 = new StringConcatenation();
    _builder_10.append("\")");
    _builder_10.newLine();
    _builder_10.append("\t");
    _builder_10.append("public ResponseEntity<Void> logout() {");
    _builder_10.newLine();
    _builder_10.append("\t");
    _builder_10.append("SecurityContextHolder.clearContext();");
    _builder_10.newLine();
    _builder_10.append("\t");
    _builder_10.append("return ResponseEntity.ok().build();");
    _builder_10.newLine();
    _builder_10.append("\t");
    _builder_10.append("}");
    _builder_10.newLine();
    _builder_10.newLine();
    _builder_10.newLine();
    _builder_10.append("}");
    _builder_10.newLine();
    String _plus_14 = (_plus_13 + _builder_10);
    content = (_content_1 + _plus_14);
    return content;
  }
}
