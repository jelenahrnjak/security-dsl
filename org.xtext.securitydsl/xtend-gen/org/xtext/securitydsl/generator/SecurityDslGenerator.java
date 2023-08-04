package org.xtext.securitydsl.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import security_dsl.Application;
import security_dsl.Attribute;
import security_dsl.Authentication;
import security_dsl.BasicAuthentication;
import security_dsl.Claim;
import security_dsl.Controller;
import security_dsl.EClaimType;
import security_dsl.EEndpointType;
import security_dsl.Endpoint;
import security_dsl.JWT;
import security_dsl.OAuth2;
import security_dsl.RegisteredClaim;
import security_dsl.Role;
import security_dsl.RoleInstance;
import security_dsl.Security;
import security_dsl.User;

@SuppressWarnings("all")
public class SecurityDslGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    final Application app = ((Application) _head);
    String _name = app.getName();
    boolean _tripleEquals = (_name == null);
    if (_tripleEquals) {
      app.setName(app.getArtifact());
    }
    String _group = app.getGroup();
    String _plus = (_group + ".");
    String _name_1 = app.getName();
    String _plus_1 = (_plus + _name_1);
    app.setPackageName(_plus_1);
    String _upperCase = app.getName().substring(0, 1).toUpperCase();
    String _substring = app.getName().substring(1);
    String capitalizedName = (_upperCase + _substring);
    String _artifact = app.getArtifact();
    String _plus_2 = (_artifact + "/src/main/java/");
    String _replace = app.getPackageName().replace(".", "/");
    String _plus_3 = (_plus_2 + _replace);
    final String srcDestination = (_plus_3 + "/");
    new SecurityDslStaticFilesGenerator(fsa, app, capitalizedName, srcDestination);
    new SecurityDslResourcesGenerator(fsa, app);
    Security _app_security = app.getApp_security();
    if ((_app_security instanceof OAuth2)) {
      String _packageName = app.getPackageName();
      new SecurityDslOAuth2Generator(fsa, _packageName, srcDestination);
    } else {
      Authentication authController = null;
      Iterator<User> users = Iterators.<User>filter(resource.getAllContents(), User.class);
      User user = null;
      boolean _hasNext = users.hasNext();
      if (_hasNext) {
        user = users.next();
      }
      String credentialUser = SecurityDslGenerator.getCredential(user.getEntity_attributes()).getName();
      Iterator<Role> roles = Iterators.<Role>filter(resource.getAllContents(), Role.class);
      Role role = null;
      boolean _hasNext_1 = roles.hasNext();
      if (_hasNext_1) {
        role = roles.next();
      }
      String _tableName = role.getTableName();
      boolean _tripleEquals_1 = (_tableName == null);
      if (_tripleEquals_1) {
        role.setTableName("roles");
      }
      EList<Controller> _app_controllers = app.getApp_controllers();
      for (final Controller c : _app_controllers) {
        if ((c instanceof Authentication)) {
          authController = ((Authentication)c);
        }
      }
      new SecurityDslEntityRepoGenerator(fsa, app, srcDestination, user, role);
      String _packageName_1 = app.getPackageName();
      Security _app_security_1 = app.getApp_security();
      new SecurityDslServiceGenerator(fsa, _packageName_1, srcDestination, user, role, _app_security_1);
      String _packageName_2 = app.getPackageName();
      Security _app_security_2 = app.getApp_security();
      new SecurityDslControllerGenerator(fsa, _packageName_2, srcDestination, authController, _app_security_2, credentialUser);
      Security _app_security_3 = app.getApp_security();
      if ((_app_security_3 instanceof BasicAuthentication)) {
        String _packageName_3 = app.getPackageName();
        EList<RoleInstance> _role_instances = role.getRole_instances();
        new SecurityDslBasicAuthenticationGenerator(fsa, _packageName_3, srcDestination, authController, _role_instances);
      } else {
        Security _app_security_4 = app.getApp_security();
        if ((_app_security_4 instanceof JWT)) {
          Security _app_security_5 = app.getApp_security();
          JWT jwt = ((JWT) _app_security_5);
          String _issuer = jwt.getRegistered_claims().getIssuer();
          boolean _tripleEquals_2 = (_issuer == null);
          if (_tripleEquals_2) {
            RegisteredClaim _registered_claims = jwt.getRegistered_claims();
            _registered_claims.setIssuer(app.getName());
          }
          Claim _findSubjectClaim = this.findSubjectClaim(jwt.getClaims());
          boolean _tripleEquals_3 = (_findSubjectClaim == null);
          if (_tripleEquals_3) {
            Claim subjectClaim = null;
            subjectClaim.setName("subject");
            subjectClaim.setType(EClaimType.REGISTERED);
            subjectClaim.setClaim_attribute(SecurityDslGenerator.getCredential(user.getEntity_attributes()));
            jwt.getClaims().add(subjectClaim);
          }
          String _packageName_4 = app.getPackageName();
          Security _app_security_6 = app.getApp_security();
          new SecurityDslJWTGenerator(fsa, _packageName_4, srcDestination, authController, ((JWT) _app_security_6), credentialUser);
        }
      }
    }
  }

  public static Attribute getCredential(final List<Attribute> attributes) {
    for (final Attribute a : attributes) {
      boolean _isCredential = a.isCredential();
      if (_isCredential) {
        return a;
      }
    }
    return null;
  }

  public Claim findSubjectClaim(final List<Claim> claims) {
    for (final Claim c : claims) {
      if ((Objects.equal(c.getType(), EClaimType.REGISTERED) && Objects.equal(c.getName().toLowerCase(), "subject"))) {
        return c;
      }
    }
    return null;
  }

  public static String getLoginEndpoint(final Authentication authController) {
    EList<Endpoint> _controller_endpoints = authController.getController_endpoints();
    for (final Endpoint e : _controller_endpoints) {
      EEndpointType _type = e.getType();
      boolean _equals = Objects.equal(_type, EEndpointType.LOGIN);
      if (_equals) {
        return e.getUrl();
      }
    }
    return null;
  }
}
