package org.xtext.securitydsl.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import security_dsl.Application;
import security_dsl.Attribute;
import security_dsl.BasicAuthentication;
import security_dsl.Claim;
import security_dsl.EClaimType;
import security_dsl.JWT;
import security_dsl.OAuth2;
import security_dsl.RegisteredClaims;
import security_dsl.Security;
import security_dsl.User;

@SuppressWarnings("all")
public class SecurityDslGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    final Application app = ((Application) _head);
    int _length = app.getName().length();
    boolean _lessEqualsThan = (_length <= 0);
    if (_lessEqualsThan) {
      app.setName(app.getArtifact());
    }
    String _group = app.getGroup();
    String _plus = (_group + ".");
    String _name = app.getName();
    String _plus_1 = (_plus + _name);
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
    new SecurityDslControllerGenerator(resource, fsa, app, srcDestination);
    new SecurityDslModelRepoGenerator(resource, fsa, app, srcDestination);
    new SecurityDslServiceGenerator(resource, fsa, app, srcDestination);
    User user = Iterators.<User>filter(resource.getAllContents(), User.class).next();
    Security _app_security = app.getApp_security();
    if ((_app_security instanceof BasicAuthentication)) {
      new SecurityDslBasicAuthenticationGenerator(resource, fsa, app, srcDestination);
    } else {
      Security _app_security_1 = app.getApp_security();
      if ((_app_security_1 instanceof JWT)) {
        Security _app_security_2 = app.getApp_security();
        JWT jwt = ((JWT) _app_security_2);
        String _issuer = jwt.getRegisteredclaims().getIssuer();
        boolean _tripleEquals = (_issuer == null);
        if (_tripleEquals) {
          RegisteredClaims _registeredclaims = jwt.getRegisteredclaims();
          _registeredclaims.setIssuer(app.getName());
        }
        Claim _findSubjectClaim = this.findSubjectClaim(jwt.getJwt_claims());
        boolean _tripleEquals_1 = (_findSubjectClaim == null);
        if (_tripleEquals_1) {
          Claim subjectClaim = null;
          subjectClaim.setName("subject");
          subjectClaim.setType(EClaimType.REGISTERED);
          subjectClaim.setClaim_attribute(this.getCredential(user.getModel_attributes()));
          jwt.getJwt_claims().add(subjectClaim);
        }
        new SecurityDslJWTGenerator(resource, fsa, app, srcDestination);
      } else {
        Security _app_security_3 = app.getApp_security();
        if ((_app_security_3 instanceof OAuth2)) {
          String _packageName = app.getPackageName();
          new SecurityDslOAuth2Generator(fsa, _packageName, srcDestination);
        }
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

  public Claim findSubjectClaim(final List<Claim> claims) {
    for (final Claim c : claims) {
      if ((Objects.equal(c.getType(), EClaimType.REGISTERED) && Objects.equal(c.getName().toLowerCase(), "subject"))) {
        return c;
      }
    }
    return null;
  }
}
