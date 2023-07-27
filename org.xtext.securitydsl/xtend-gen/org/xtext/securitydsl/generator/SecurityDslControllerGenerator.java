package org.xtext.securitydsl.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import security_dsl.Application;
import security_dsl.Attribute;
import security_dsl.Authentication;
import security_dsl.BasicAuthentication;
import security_dsl.Controller;
import security_dsl.EEndpointType;
import security_dsl.Endpoint;
import security_dsl.Security;
import security_dsl.User;

@SuppressWarnings("all")
public class SecurityDslControllerGenerator {
  public SecurityDslControllerGenerator(final Resource resource, final IFileSystemAccess2 fsa, final Application app, final String srcDestination) {
    User user = Iterators.<User>filter(resource.getAllContents(), User.class).next();
    String userCredentialName = this.getCredential(user.getModel_attributes()).getName();
    EList<Controller> _app_controllers = app.getApp_controllers();
    for (final Controller c : _app_controllers) {
      if ((c instanceof Authentication)) {
        fsa.generateFile((srcDestination + "/controller/AuthController.java"), this.generateAuthController(app.getPackageName(), ((Authentication)c), app.getApp_security(), userCredentialName));
      }
    }
  }

  public Attribute getCredential(final List<Attribute> attributes) {
    for (final Attribute a : attributes) {
      boolean _isCredential = a.isCredential();
      if (_isCredential) {
        return a;
      }
    }
    return null;
  }

  public String generateAuthController(final String packageName, final Authentication authController, final Security security, final String credentialNameUser) {
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
    _builder_2.append(".model.User;");
    _builder_2.newLine();
    _builder_2.append("import ");
    String _plus_3 = (_plus_2 + _builder_2);
    String _plus_4 = (_plus_3 + packageName);
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append(".dto.UserRequestDTO;");
    _builder_3.newLine();
    _builder_3.append("import ");
    String _plus_5 = (_plus_4 + _builder_3);
    String _plus_6 = (_plus_5 + packageName);
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append(".service.IUserService;");
    _builder_4.newLine();
    String content = (_plus_6 + _builder_4);
    String _content = content;
    StringConcatenation _builder_5 = new StringConcatenation();
    _builder_5.append("import lombok.RequiredArgsConstructor;");
    _builder_5.newLine();
    _builder_5.append("import org.springframework.beans.factory.annotation.Autowired;");
    _builder_5.newLine();
    _builder_5.append("import org.springframework.security.core.Authentication;");
    _builder_5.newLine();
    _builder_5.append("import org.springframework.http.ResponseEntity;");
    _builder_5.newLine();
    _builder_5.append("import org.springframework.security.authentication.AuthenticationManager;");
    _builder_5.newLine();
    _builder_5.append("import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;");
    _builder_5.newLine();
    _builder_5.append("import org.springframework.security.core.context.SecurityContextHolder;");
    _builder_5.newLine();
    _builder_5.append("import org.springframework.web.bind.annotation.RestController;");
    _builder_5.newLine();
    _builder_5.append("import org.springframework.web.bind.annotation.RequestBody;");
    _builder_5.newLine();
    _builder_5.append("import org.springframework.web.bind.annotation.RequestMapping;");
    _builder_5.newLine();
    _builder_5.append("import org.springframework.web.bind.annotation.GetMapping;");
    _builder_5.newLine();
    _builder_5.append("import org.springframework.web.bind.annotation.PostMapping;");
    _builder_5.newLine();
    _builder_5.newLine();
    _builder_5.append("@RequiredArgsConstructor(onConstructor = @__(@Autowired))");
    _builder_5.newLine();
    _builder_5.append("@RequestMapping(value = \"");
    String _path = authController.getPath();
    String _plus_7 = (_builder_5.toString() + _path);
    StringConcatenation _builder_6 = new StringConcatenation();
    _builder_6.append("\")");
    _builder_6.newLine();
    _builder_6.append("@RestController");
    _builder_6.newLine();
    _builder_6.append("public class AuthController {");
    _builder_6.newLine();
    _builder_6.newLine();
    _builder_6.append("    ");
    _builder_6.append("private final IUserService userService;");
    _builder_6.newLine();
    String _plus_8 = (_plus_7 + _builder_6);
    content = (_content + _plus_8);
    if ((security instanceof BasicAuthentication)) {
      String _content_1 = content;
      StringConcatenation _builder_7 = new StringConcatenation();
      _builder_7.append("    ");
      _builder_7.append("private final AuthenticationManager  authenticationManager;");
      content = (_content_1 + _builder_7);
    }
    String _content_2 = content;
    StringConcatenation _builder_8 = new StringConcatenation();
    _builder_8.append("    ");
    _builder_8.append("@PostMapping(\"");
    String _plus_9 = (_builder_8.toString() + regEndpoint);
    StringConcatenation _builder_9 = new StringConcatenation();
    _builder_9.append("\")");
    _builder_9.newLine();
    _builder_9.append("    ");
    _builder_9.append("public ResponseEntity<User> registration(@RequestBody UserRequestDTO request) {");
    _builder_9.newLine();
    _builder_9.append("        ");
    _builder_9.append("return ResponseEntity.ok(userService.save(request));");
    _builder_9.newLine();
    _builder_9.append("    ");
    _builder_9.append("}");
    _builder_9.newLine();
    _builder_9.append("    ");
    _builder_9.newLine();
    _builder_9.append("\t");
    _builder_9.append("@PostMapping(\"");
    String _plus_10 = (_plus_9 + _builder_9);
    String _plus_11 = (_plus_10 + loginEndpoint);
    StringConcatenation _builder_10 = new StringConcatenation();
    _builder_10.append("\")");
    _builder_10.newLine();
    _builder_10.append("\t");
    _builder_10.append("public ResponseEntity<User> login(@RequestBody UserRequestDTO request) {");
    _builder_10.newLine();
    _builder_10.newLine();
    _builder_10.append("\t\t");
    _builder_10.append("Authentication authentication = new UsernamePasswordAuthenticationToken(request.get");
    String _plus_12 = (_plus_11 + _builder_10);
    String _firstUpper = StringExtensions.toFirstUpper(credentialNameUser);
    String _plus_13 = (_plus_12 + _firstUpper);
    StringConcatenation _builder_11 = new StringConcatenation();
    _builder_11.append("(), request.getPassword());");
    _builder_11.newLine();
    _builder_11.append("\t");
    _builder_11.append("authentication = authenticationManager.authenticate(authentication);");
    _builder_11.newLine();
    _builder_11.append("\t");
    _builder_11.append("SecurityContextHolder.getContext().setAuthentication(authentication);");
    _builder_11.newLine();
    _builder_11.append("\t");
    _builder_11.append("User user = (User) authentication.getPrincipal();");
    _builder_11.newLine();
    _builder_11.append("\t");
    _builder_11.append("return ResponseEntity.ok(user);");
    _builder_11.newLine();
    _builder_11.append("}");
    _builder_11.newLine();
    _builder_11.append("\t\t");
    _builder_11.newLine();
    _builder_11.append("@GetMapping(\"");
    String _plus_14 = (_plus_13 + _builder_11);
    String _plus_15 = (_plus_14 + logoutEndpoint);
    StringConcatenation _builder_12 = new StringConcatenation();
    _builder_12.append("\")");
    _builder_12.newLine();
    _builder_12.append("\t");
    _builder_12.append("public ResponseEntity<Void> logout() {");
    _builder_12.newLine();
    _builder_12.append("\t");
    _builder_12.append("SecurityContextHolder.clearContext();");
    _builder_12.newLine();
    _builder_12.append("\t");
    _builder_12.append("return ResponseEntity.ok().build();");
    _builder_12.newLine();
    _builder_12.append("\t");
    _builder_12.append("}");
    _builder_12.newLine();
    _builder_12.newLine();
    _builder_12.newLine();
    _builder_12.append("}");
    _builder_12.newLine();
    String _plus_16 = (_plus_15 + _builder_12);
    content = (_content_2 + _plus_16);
    return content;
  }
}
