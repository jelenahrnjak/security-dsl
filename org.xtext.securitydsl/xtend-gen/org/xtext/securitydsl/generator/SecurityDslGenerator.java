package org.xtext.securitydsl.generator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import security_dsl.Application;
import security_dsl.BasicAuthentication;
import security_dsl.Security;

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
    new SecurityDslControllerGenerator(fsa, app, srcDestination);
    new SecurityDslModelRepoGenerator(resource, fsa, app, srcDestination);
    new SecurityDslJWTSpringGenerator(fsa, app, srcDestination);
    Security _app_security = app.getApp_security();
    if ((_app_security instanceof BasicAuthentication)) {
      new SecurityDslBasicAuthenticationGenerator(resource, fsa, app, srcDestination);
    }
  }
}
