package org.xtext.securitydsl.generator;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import security_dsl.Application;
import security_dsl.Authentication;
import security_dsl.Controller;
import security_dsl.EEndpointType;
import security_dsl.Endpoint;

@SuppressWarnings("all")
public class SecurityDslControllerGenerator {
  public SecurityDslControllerGenerator(final IFileSystemAccess2 fsa, final Application app, final String srcDestination) {
    EList<Controller> _app_controllers = app.getApp_controllers();
    for (final Controller c : _app_controllers) {
      if ((c instanceof Authentication)) {
        fsa.generateFile((srcDestination + "/controller/AuthController.java"), this.generateAuthController(app.getPackageName(), ((Authentication)c)));
      }
    }
  }

  public String generateAuthController(final String packageName, final Authentication authController) {
    String regEndpoint = "";
    String loginEndpoint = "";
    String logoutEndpoint = "";
    EList<Endpoint> _controller_endpoints = authController.getController_endpoints();
    for (final Endpoint e : _controller_endpoints) {
      {
        EEndpointType _type = e.getType();
        boolean _equals = Objects.equal(_type, EEndpointType.REGISTRATION);
        if (_equals) {
          String _path = authController.getPath();
          String _url = e.getUrl();
          String _plus = (_path + _url);
          regEndpoint = _plus;
        }
        EEndpointType _type_1 = e.getType();
        boolean _equals_1 = Objects.equal(_type_1, EEndpointType.LOGIN);
        if (_equals_1) {
          String _path_1 = authController.getPath();
          String _url_1 = e.getUrl();
          String _plus_1 = (_path_1 + _url_1);
          loginEndpoint = _plus_1;
        }
        EEndpointType _type_2 = e.getType();
        boolean _equals_2 = Objects.equal(_type_2, EEndpointType.LOGOUT);
        if (_equals_2) {
          String _path_2 = authController.getPath();
          String _url_2 = e.getUrl();
          String _plus_2 = (_path_2 + _url_2);
          logoutEndpoint = _plus_2;
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
    _builder_5.append("@PostMapping(\"");
    String _plus_9 = (_plus_8 + _builder_5);
    String _plus_10 = (_plus_9 + regEndpoint);
    StringConcatenation _builder_6 = new StringConcatenation();
    _builder_6.append("\")");
    _builder_6.newLine();
    _builder_6.append("    ");
    _builder_6.append("public ResponseEntity<User> registration(@RequestBody UserRequestDTO request) {");
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
    _builder_6.append("    ");
    _builder_6.newLine();
    _builder_6.append("\t");
    _builder_6.append("@PostMapping(\"");
    String _plus_11 = (_plus_10 + _builder_6);
    String _plus_12 = (_plus_11 + loginEndpoint);
    StringConcatenation _builder_7 = new StringConcatenation();
    _builder_7.append("\")");
    _builder_7.newLine();
    _builder_7.append("\t");
    _builder_7.append("public ResponseEntity<User> login(@RequestBody UserRequestDTO request) {");
    _builder_7.newLine();
    _builder_7.newLine();
    _builder_7.append("\t");
    _builder_7.append("Authentication authentication = new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword());");
    _builder_7.newLine();
    _builder_7.append("\t");
    _builder_7.append("authentication = authenticationManager.authenticate(authentication);");
    _builder_7.newLine();
    _builder_7.append("\t");
    _builder_7.append("SecurityContextHolder.getContext().setAuthentication(authentication);");
    _builder_7.newLine();
    _builder_7.append("\t");
    _builder_7.append("User user = (User) authentication.getPrincipal();");
    _builder_7.newLine();
    _builder_7.append("\t");
    _builder_7.append("return ResponseEntity.ok(user);");
    _builder_7.newLine();
    _builder_7.append("\t");
    _builder_7.append("}");
    _builder_7.newLine();
    _builder_7.newLine();
    _builder_7.append("\t");
    _builder_7.append("@GetMapping(\"");
    String _plus_13 = (_plus_12 + _builder_7);
    String _plus_14 = (_plus_13 + logoutEndpoint);
    StringConcatenation _builder_8 = new StringConcatenation();
    _builder_8.append("\")");
    _builder_8.newLine();
    _builder_8.append("\t");
    _builder_8.append("public ResponseEntity<Void> logout() {");
    _builder_8.newLine();
    _builder_8.append("\t");
    _builder_8.append("SecurityContextHolder.clearContext();");
    _builder_8.newLine();
    _builder_8.append("\t");
    _builder_8.append("return ResponseEntity.ok().build();");
    _builder_8.newLine();
    _builder_8.append("\t");
    _builder_8.append("}");
    _builder_8.newLine();
    _builder_8.newLine();
    _builder_8.newLine();
    _builder_8.append("}");
    _builder_8.newLine();
    String content = (_plus_14 + _builder_8);
    return content;
  }
}
