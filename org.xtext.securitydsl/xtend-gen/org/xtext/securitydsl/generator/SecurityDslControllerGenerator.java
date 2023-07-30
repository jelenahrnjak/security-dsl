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
    _builder.newLine();
    {
      if ((security instanceof JWT)) {
        _builder.append("import ");
        _builder.append(packageName);
        _builder.append(".dto.UserTokenStateDTO;");
        _builder.newLineIfNotEmpty();
        _builder.append("import ");
        _builder.append(packageName);
        _builder.append(".util.TokenUtils;");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("import org.springframework.web.util.UriComponentsBuilder;");
        _builder.newLine();
      }
    }
    _builder.append("import lombok.RequiredArgsConstructor;");
    _builder.newLine();
    _builder.append("import org.springframework.beans.factory.annotation.Autowired;");
    _builder.newLine();
    _builder.append("import org.springframework.security.core.Authentication;");
    _builder.newLine();
    _builder.append("import org.springframework.http.MediaType;");
    _builder.newLine();
    _builder.append("import org.springframework.http.HttpStatus;");
    _builder.newLine();
    _builder.append("import org.springframework.http.ResponseEntity;");
    _builder.newLine();
    _builder.append("import org.springframework.security.authentication.AuthenticationManager;");
    _builder.newLine();
    _builder.append("import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;");
    _builder.newLine();
    _builder.append("import org.springframework.security.core.context.SecurityContextHolder;");
    _builder.newLine();
    _builder.append("import org.springframework.web.bind.annotation.RestController;");
    _builder.newLine();
    _builder.append("import org.springframework.web.bind.annotation.RequestBody;");
    _builder.newLine();
    _builder.append("import org.springframework.web.bind.annotation.RequestMapping;");
    _builder.newLine();
    _builder.append("import org.springframework.web.bind.annotation.GetMapping;");
    _builder.newLine();
    _builder.append("import org.springframework.web.bind.annotation.PostMapping;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@RequiredArgsConstructor(onConstructor = @__(@Autowired))");
    _builder.newLine();
    _builder.append("@RequestMapping(value = \"");
    String _path = authController.getPath();
    _builder.append(_path);
    _builder.append("\", produces = MediaType.APPLICATION_JSON_VALUE)");
    _builder.newLineIfNotEmpty();
    _builder.append("@RestController");
    _builder.newLine();
    _builder.append("public class AuthController {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private final IUserService userService;");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("   \t");
    _builder.append("private final AuthenticationManager  authenticationManager;");
    _builder.newLine();
    _builder.newLine();
    {
      if ((security instanceof JWT)) {
        _builder.append("\t");
        _builder.append("private final TokenUtils tokenUtils;");
        _builder.newLine();
      }
    }
    _builder.append("   ");
    _builder.append("@PostMapping(\"");
    _builder.append(regEndpoint, "   ");
    _builder.append("\")");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public ResponseEntity<User> registration(@RequestBody UserRequestDTO request) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return new ResponseEntity<>(userService.save(request), HttpStatus.CREATED);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@PostMapping(\"");
    _builder.append(loginEndpoint, "\t");
    _builder.append("\")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public ResponseEntity<");
    {
      if ((security instanceof JWT)) {
        _builder.append("UserTokenStateDTO");
      } else {
        if ((security instanceof BasicAuthentication)) {
          _builder.append("User");
        }
      }
    }
    _builder.append("> login(@RequestBody AuthenticationRequestDTO request) {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Authentication authentication = new UsernamePasswordAuthenticationToken(request.get");
    String _firstUpper = StringExtensions.toFirstUpper(credentialNameUser);
    _builder.append(_firstUpper, "\t\t");
    _builder.append("(), request.getPassword());");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("authentication = authenticationManager.authenticate(authentication);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("SecurityContextHolder.getContext().setAuthentication(authentication);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("User user = (User) authentication.getPrincipal();");
    _builder.newLine();
    {
      if ((security instanceof JWT)) {
        _builder.append("\t\t");
        _builder.append("String jwt = tokenUtils.generateToken(user.getUsername());");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("int expiresIn = tokenUtils.getExpiredIn();");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("return ResponseEntity.ok(new UserTokenStateDTO(jwt, expiresIn));");
        _builder.newLine();
      } else {
        if ((security instanceof BasicAuthentication)) {
          _builder.append("\t\t");
          _builder.append("return ResponseEntity.ok(user);\t");
          _builder.newLine();
        }
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@GetMapping(\"");
    _builder.append(logoutEndpoint, "\t");
    _builder.append("\")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public ResponseEntity<Void> logout() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("SecurityContextHolder.clearContext();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return ResponseEntity.ok().build();");
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
}
