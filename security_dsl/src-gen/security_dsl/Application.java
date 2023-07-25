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
 *   <li>{@link security_dsl.Application#getApp_database <em>App database</em>}</li>
 *   <li>{@link security_dsl.Application#getApp_models <em>App models</em>}</li>
 *   <li>{@link security_dsl.Application#getApp_controllers <em>App controllers</em>}</li>
 *   <li>{@link security_dsl.Application#getApp_security <em>App security</em>}</li>
 *   <li>{@link security_dsl.Application#getName <em>Name</em>}</li>
 *   <li>{@link security_dsl.Application#getDescription <em>Description</em>}</li>
 *   <li>{@link security_dsl.Application#getGroup <em>Group</em>}</li>
 *   <li>{@link security_dsl.Application#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link security_dsl.Application#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link security_dsl.Application#getPort <em>Port</em>}</li>
 *   <li>{@link security_dsl.Application#getHostname <em>Hostname</em>}</li>
 * </ul>
 *
 * @see security_dsl.Security_dslPackage#getApplication()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='validPort'"
 * @generated
 */
public interface Application extends EObject {
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
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see security_dsl.Security_dslPackage#getApplication_Name()
	 * @model default=""
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
	 * The default value is <code>"Security dsl generated application"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see security_dsl.Security_dslPackage#getApplication_Description()
	 * @model default="Security dsl generated application"
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
	 * Returns the value of the '<em><b>Group</b></em>' attribute.
	 * The default value is <code>"rs.ac.uns.ftn"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute.
	 * @see #setGroup(String)
	 * @see security_dsl.Security_dslPackage#getApplication_Group()
	 * @model default="rs.ac.uns.ftn"
	 * @generated
	 */
	String getGroup();

	/**
	 * Sets the value of the '{@link security_dsl.Application#getGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' attribute.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(String value);

	/**
	 * Returns the value of the '<em><b>Artifact</b></em>' attribute.
	 * The default value is <code>"demo"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact</em>' attribute.
	 * @see #setArtifact(String)
	 * @see security_dsl.Security_dslPackage#getApplication_Artifact()
	 * @model default="demo"
	 * @generated
	 */
	String getArtifact();

	/**
	 * Sets the value of the '{@link security_dsl.Application#getArtifact <em>Artifact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact</em>' attribute.
	 * @see #getArtifact()
	 * @generated
	 */
	void setArtifact(String value);

	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see security_dsl.Security_dslPackage#getApplication_PackageName()
	 * @model default=""
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link security_dsl.Application#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * The default value is <code>"8080"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(Long)
	 * @see security_dsl.Security_dslPackage#getApplication_Port()
	 * @model default="8080"
	 * @generated
	 */
	Long getPort();

	/**
	 * Sets the value of the '{@link security_dsl.Application#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Long value);

	/**
	 * Returns the value of the '<em><b>Hostname</b></em>' attribute.
	 * The default value is <code>"localhost"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hostname</em>' attribute.
	 * @see #setHostname(String)
	 * @see security_dsl.Security_dslPackage#getApplication_Hostname()
	 * @model default="localhost"
	 * @generated
	 */
	String getHostname();

	/**
	 * Sets the value of the '{@link security_dsl.Application#getHostname <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hostname</em>' attribute.
	 * @see #getHostname()
	 * @generated
	 */
	void setHostname(String value);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n        \tself.app_security.oclIsTypeOf(JWT) implies\n        (\n            self.app_models -&gt; select(m | m.oclIsTypeOf(Role))\n                -&gt; forAll(role | \n                    role.model_attributes -&gt; select(a | a.type = EType::_\'String\' and a.identifier = true) -&gt; size() = 1 )\n            or\n            self.app_models -&gt; select(m | m.oclIsTypeOf(Role))\n                -&gt; forAll(role |\n                    role.model_attributes -&gt; select(a | a.type = EType::_\'String\' and a.identifier = false) -&gt; size() = 1\n                    and\n                    role.model_attributes -&gt; select(a | a.identifier = true) -&gt; size() = 1\n                )\n        )'"
	 * @generated
	 */
	boolean roleCanHaveIdAndStringAttribute(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n        \tself.app_security.oclIsTypeOf(JWT) implies\n        \tself.app_models -&gt; select(m | m.oclIsTypeOf(Role)) -&gt; forAll(role | role.model_attributes -&gt; size() &lt;= 2)'"
	 * @generated
	 */
	boolean roleCantHaveAdditionalAttributes(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='not self.app_controllers -&gt; exists(c | c.name.toLower() = \'user\' or c.name.toLower() = \'role\' or c.name.toLower() = \'usercontroller\' or c.name.toLower() = \'rolecontroller\')'"
	 * @generated
	 */
	boolean controllerNotNamedUserRole(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.app_models -&gt; isEmpty() or not self.app_database-&gt;isEmpty()'"
	 * @generated
	 */
	boolean hasDatabaseForModel(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.app_models -&gt;  isUnique(m | m.tableName.toLower())'"
	 * @generated
	 */
	boolean uniqueTableName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.app_controllers -&gt; isEmpty() or (\n\t        self.app_models -&gt; exists(m | m.oclIsTypeOf(User))\n\t        and\n\t        self.app_models -&gt; exists(m | m.oclIsTypeOf(Role))\n\t    )'"
	 * @generated
	 */
	boolean hasUserAndRoleModelsForController(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n        \tself.app_security.oclIsTypeOf(JWT) implies\n\t        self.app_models -&gt; select(m | m.oclIsTypeOf(Role))\n\t            -&gt; forAll(role | role.model_attributes -&gt; exists(a | a.type = EType::_\'String\'))'"
	 * @generated
	 */
	boolean roleMustHaveStringAttribute(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n        \tself.app_security.oclIsTypeOf(BasicAuthentication) implies\n\t        self.app_models -&gt; select(m | m.oclIsTypeOf(User))\n\t            -&gt; forAll(user | user.model_attributes -&gt; exists(a |  a.name = \'username\' and a.credential = true))'"
	 * @generated
	 */
	boolean hasUsernameAttribute(DiagnosticChain diagnostics, Map<Object, Object> context);

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.port &gt;= 1024 and self.port &lt;= 49151'"
	 * @generated
	 */
	boolean validPort(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Application