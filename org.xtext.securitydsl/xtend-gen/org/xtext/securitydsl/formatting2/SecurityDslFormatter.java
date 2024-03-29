/**
 * generated by Xtext 2.27.0
 */
package org.xtext.securitydsl.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.securitydsl.services.SecurityDslGrammarAccess;
import security_dsl.Application;
import security_dsl.Attribute;
import security_dsl.Controller;
import security_dsl.Database;
import security_dsl.Entity;
import security_dsl.Role;
import security_dsl.RoleInstance;
import security_dsl.Security;

@SuppressWarnings("all")
public class SecurityDslFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private SecurityDslGrammarAccess _securityDslGrammarAccess;

  protected void _format(final Application application, @Extension final IFormattableDocument document) {
    document.<Database>format(application.getApp_database());
    EList<Entity> _app_entities = application.getApp_entities();
    for (final Entity model : _app_entities) {
      document.<Entity>format(model);
    }
    document.<Security>format(application.getApp_security());
    EList<Controller> _app_controllers = application.getApp_controllers();
    for (final Controller controller : _app_controllers) {
      document.<Controller>format(controller);
    }
  }

  protected void _format(final Role role, @Extension final IFormattableDocument document) {
    EList<Attribute> _entity_attributes = role.getEntity_attributes();
    for (final Attribute attribute : _entity_attributes) {
      document.<Attribute>format(attribute);
    }
    EList<RoleInstance> _role_instances = role.getRole_instances();
    for (final RoleInstance roleInstance : _role_instances) {
      document.<RoleInstance>format(roleInstance);
    }
  }

  public void format(final Object role, final IFormattableDocument document) {
    if (role instanceof XtextResource) {
      _format((XtextResource)role, document);
      return;
    } else if (role instanceof Role) {
      _format((Role)role, document);
      return;
    } else if (role instanceof Application) {
      _format((Application)role, document);
      return;
    } else if (role instanceof EObject) {
      _format((EObject)role, document);
      return;
    } else if (role == null) {
      _format((Void)null, document);
      return;
    } else if (role != null) {
      _format(role, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(role, document).toString());
    }
  }
}
