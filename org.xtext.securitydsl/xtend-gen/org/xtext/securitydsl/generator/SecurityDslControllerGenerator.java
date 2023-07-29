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
import security_dsl.JWT;
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
    _builder.append(packageName);
    _builder.append(".controller;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    _builder.append(packageName);
    _builder.append(".model.User;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    _builder.append(packageName);
    _builder.append(".dto.UserRequestDTO;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    _builder.append(packageName);
    _builder.append(".dto.AuthenticationRequestDTO;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    _builder.append(packageName);
    _builder.append(".service.IUserService;");
    _builder.newLineIfNotEmpty();
    String content = _builder.toString();
    if ((security instanceof JWT)) {
      String _content = content;
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("import ");
      _builder_1.append(packageName);
      _builder_1.append(".dto.UserTokenStateDTO;");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("import ");
      _builder_1.append(packageName);
      _builder_1.append(".security.util.TokenUtils;");
      _builder_1.newLineIfNotEmpty();
      _builder_1.newLine();
      _builder_1.append("import org.springframework.web.util.UriComponentsBuilder;");
      _builder_1.newLine();
      content = (_content + _builder_1);
    }
    String _content_1 = content;
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("import lombok.RequiredArgsConstructor;");
    _builder_2.newLine();
    _builder_2.append("import org.springframework.beans.factory.annotation.Autowired;");
    _builder_2.newLine();
    _builder_2.append("import org.springframework.security.core.Authentication;");
    _builder_2.newLine();
    _builder_2.append("import org.springframework.http.MediaType;");
    _builder_2.newLine();
    _builder_2.append("import org.springframework.http.HttpStatus;");
    _builder_2.newLine();
    _builder_2.append("import org.springframework.http.ResponseEntity;");
    _builder_2.newLine();
    _builder_2.append("import org.springframework.security.authentication.AuthenticationManager;");
    _builder_2.newLine();
    _builder_2.append("import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;");
    _builder_2.newLine();
    _builder_2.append("import org.springframework.security.core.context.SecurityContextHolder;");
    _builder_2.newLine();
    _builder_2.append("import org.springframework.web.bind.annotation.RestController;");
    _builder_2.newLine();
    _builder_2.append("import org.springframework.web.bind.annotation.RequestBody;");
    _builder_2.newLine();
    _builder_2.append("import org.springframework.web.bind.annotation.RequestMapping;");
    _builder_2.newLine();
    _builder_2.append("import org.springframework.web.bind.annotation.GetMapping;");
    _builder_2.newLine();
    _builder_2.append("import org.springframework.web.bind.annotation.PostMapping;");
    _builder_2.newLine();
    _builder_2.newLine();
    _builder_2.append("@RequiredArgsConstructor(onConstructor = @__(@Autowired))");
    _builder_2.newLine();
    _builder_2.append("@RequestMapping(value = \"");
    String _path = authController.getPath();
    _builder_2.append(_path);
    _builder_2.append("\", produces = MediaType.APPLICATION_JSON_VALUE))");
    _builder_2.newLineIfNotEmpty();
    _builder_2.append("@RestController");
    _builder_2.newLine();
    _builder_2.append("public class AuthController {");
    _builder_2.newLine();
    _builder_2.newLine();
    _builder_2.append("    ");
    _builder_2.append("private final IUserService userService;");
    _builder_2.newLine();
    _builder_2.append("    ");
    _builder_2.newLine();
    _builder_2.append("   \t");
    _builder_2.append("private final AuthenticationManager  authenticationManager;");
    _builder_2.newLine();
    content = (_content_1 + _builder_2);
    String loginMethod = "";
    String loginRet = "";
    if ((security instanceof JWT)) {
      String _content_2 = content;
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("    ");
      _builder_3.append("private final TokenUtils tokenUtils;");
      content = (_content_2 + _builder_3);
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("String jwt = tokenUtils.generateToken(user.getUsername());");
      _builder_4.newLine();
      _builder_4.append("int expiresIn = tokenUtils.getExpiredIn();");
      _builder_4.newLine();
      _builder_4.append("return ResponseEntity.ok(new UserTokenStateDTO(jwt, expiresIn));");
      _builder_4.newLine();
      loginMethod = _builder_4.toString();
      loginRet = "UserTokenStateDTO";
    } else {
      if ((security instanceof BasicAuthentication)) {
        StringConcatenation _builder_5 = new StringConcatenation();
        _builder_5.append("return ResponseEntity.ok(user);");
        loginMethod = _builder_5.toString();
        loginRet = "User";
      }
    }
    String _content_3 = content;
    StringConcatenation _builder_6 = new StringConcatenation();
    _builder_6.append("    ");
    _builder_6.append("@PostMapping(\"");
    _builder_6.append(regEndpoint, "    ");
    _builder_6.append("\")");
    _builder_6.newLineIfNotEmpty();
    _builder_6.append("    ");
    _builder_6.append("public ResponseEntity<User> registration(@RequestBody UserRequestDTO request) {");
    _builder_6.newLine();
    _builder_6.append("        ");
    _builder_6.append("return ResponseEntity<>(userService.save(request), HttpStatus.CREATED);");
    _builder_6.newLine();
    _builder_6.append("    ");
    _builder_6.append("}");
    _builder_6.newLine();
    _builder_6.append("    ");
    _builder_6.newLine();
    _builder_6.append("\t");
    _builder_6.append("@PostMapping(\"");
    _builder_6.append(loginEndpoint, "\t");
    _builder_6.append("\")");
    _builder_6.newLineIfNotEmpty();
    _builder_6.append("\t");
    _builder_6.append("public ResponseEntity<");
    _builder_6.append(loginRet, "\t");
    _builder_6.append("> login(@RequestBody AuthenticationRequestDTO request) {");
    _builder_6.newLineIfNotEmpty();
    _builder_6.newLine();
    _builder_6.append("\t\t");
    _builder_6.append("Authentication authentication = new UsernamePasswordAuthenticationToken(request.get");
    String _firstUpper = StringExtensions.toFirstUpper(credentialNameUser);
    _builder_6.append(_firstUpper, "\t\t");
    _builder_6.append("(), request.getPassword());");
    _builder_6.newLineIfNotEmpty();
    _builder_6.append("\t\t");
    _builder_6.append("authentication = authenticationManager.authenticate(authentication);");
    _builder_6.newLine();
    _builder_6.append("\t\t");
    _builder_6.append("SecurityContextHolder.getContext().setAuthentication(authentication);");
    _builder_6.newLine();
    _builder_6.append("\t\t");
    _builder_6.append("User user = (User) authentication.getPrincipal();");
    _builder_6.newLine();
    _builder_6.append("\t\t");
    _builder_6.append(loginMethod, "\t\t");
    _builder_6.append("}");
    _builder_6.newLineIfNotEmpty();
    _builder_6.newLine();
    _builder_6.append("\t");
    _builder_6.append("@GetMapping(\"");
    _builder_6.append(logoutEndpoint, "\t");
    _builder_6.append("\")");
    _builder_6.newLineIfNotEmpty();
    _builder_6.append("\t");
    _builder_6.append("public ResponseEntity<Void> logout() {");
    _builder_6.newLine();
    _builder_6.append("\t\t");
    _builder_6.append("SecurityContextHolder.clearContext();");
    _builder_6.newLine();
    _builder_6.append("\t\t");
    _builder_6.append("return ResponseEntity.ok().build();");
    _builder_6.newLine();
    _builder_6.append("\t");
    _builder_6.append("}");
    _builder_6.newLine();
    _builder_6.newLine();
    _builder_6.append("}");
    _builder_6.newLine();
    content = (_content_3 + _builder_6);
    return content;
  }
}
