/**
 */
package security_dsl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security_dsl.Application#getName <em>Name</em>}</li>
 *   <li>{@link security_dsl.Application#getDescription <em>Description</em>}</li>
 *   <li>{@link security_dsl.Application#getApp_models <em>App models</em>}</li>
 *   <li>{@link security_dsl.Application#getApp_controllers <em>App controllers</em>}</li>
 *   <li>{@link security_dsl.Application#getApp_security <em>App security</em>}</li>
 *   <li>{@link security_dsl.Application#getApp_database <em>App database</em>}</li>
 * </ul>
 *
 * @see security_dsl.Security_dslPackage#getApplication()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueControllerName'"
 * @generated
 */
public interface Application extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see security_dsl.Security_dslPackage#getApplication_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link security_dsl.Application#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see security_dsl.Security_dslPackage#getApplication_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link security_dsl.Application#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>App models</b></em>' containment reference list.
	 * The list contents are of type {@link security_dsl.Model}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App models</em>' containment reference list.
	 * @see security_dsl.Security_dslPackage#getApplication_App_models()
	 * @model containment="true"
	 * @generated
	 */
	EList<Model> getApp_models();

	/**
	 * Returns the value of the '<em><b>App controllers</b></em>' containment reference list.
	 * The list contents are of type {@link security_dsl.Controller}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App controllers</em>' containment reference list.
	 * @see security_dsl.Security_dslPackage#getApplication_App_controllers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Controller> getApp_controllers();

	/**
	 * Returns the value of the '<em><b>App security</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App security</em>' containment reference.
	 * @see #setApp_security(Security)
	 * @see security_dsl.Security_dslPackage#getApplication_App_security()
	 * @model containment="true"
	 * @generated
	 */
	Security getApp_security();

	/**
	 * Sets the value of the '{@link security_dsl.Application#getApp_security <em>App security</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App security</em>' containment reference.
	 * @see #getApp_security()
	 * @generated
	 */
	void setApp_security(Security value);

	/**
	 * Returns the value of the '<em><b>App database</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App database</em>' containment reference.
	 * @see #setApp_database(Database)
	 * @see security_dsl.Security_dslPackage#getApplication_App_database()
	 * @model containment="true"
	 * @generated
	 */
	Database getApp_database();

	/**
	 * Sets the value of the '{@link security_dsl.Application#getApp_database <em>App database</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App database</em>' containment reference.
	 * @see #getApp_database()
	 * @generated
	 */
	void setApp_database(Database value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='not self.app_controllers -&gt; exists(c | c.name.toLower() = \'user\' or c.name.toLower() = \'role\')'"
	 * @generated
	 */
	boolean controllerNotNamedUserRole(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='not self.app_models -&gt; select(m | m.oclIsTypeOf(OtherModel) and not m.oclAsType(OtherModel).oclIsKindOf(Role)) -&gt;\n    \t\t\texists(m | m.oclAsType(OtherModel).name.toLower() = \'user\' or m.oclAsType(OtherModel).name.toLower() = \'role\')'"
	 * @generated
	 */
	boolean modelNotNamedUserRole(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.app_controllers -&gt; forAll(c | not self.app_models -&gt; exists(m |  m.oclIsTypeOf(OtherModel) and \n\t\t        m.oclAsType(OtherModel).name.toLower() = c.name.toLower()))'"
	 * @generated
	 */
	boolean controllerModelNameUnique(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.app_controllers -&gt; forAll(c | c.path.at(1) = \'/\')'"
	 * @generated
	 */
	boolean controllerPath(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.app_models -&gt; select(m | m.oclIsTypeOf(OtherModel)) -&gt; isUnique(m | m.oclAsType(OtherModel).name)'"
	 * @generated
	 */
	boolean uniqueModelName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body=' self.app_controllers -&gt; isUnique(c | c.path) and self.app_controllers -&gt; forAll(c | c.name.toLower() &lt;&gt; c.path.toLower())'"
	 * @generated
	 */
	boolean uniqueControllerPath(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.app_controllers -&gt; isUnique(c | c.name)'"
	 * @generated
	 */
	boolean uniqueControllerName(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Application
