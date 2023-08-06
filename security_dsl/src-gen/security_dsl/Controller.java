/**
 */
package security_dsl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security_dsl.Controller#getName <em>Name</em>}</li>
 *   <li>{@link security_dsl.Controller#getPath <em>Path</em>}</li>
 *   <li>{@link security_dsl.Controller#getController_endpoints <em>Controller endpoints</em>}</li>
 * </ul>
 *
 * @see security_dsl.Security_dslPackage#getController()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueEndpointMethodNames'"
 * @generated
 */
public interface Controller extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see security_dsl.Security_dslPackage#getController_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link security_dsl.Controller#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see security_dsl.Security_dslPackage#getController_Path()
	 * @model required="true"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link security_dsl.Controller#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Controller endpoints</b></em>' containment reference list.
	 * The list contents are of type {@link security_dsl.Endpoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller endpoints</em>' containment reference list.
	 * @see security_dsl.Security_dslPackage#getController_Controller_endpoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Endpoint> getController_endpoints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Endpoints of type \"OTHER\" must have a defined method!\',\n\tstatus : Boolean = \n\t        self.controller_endpoints -&gt; select(e | e.type = EEndpointType::OTHER) -&gt; forAll(e | e.method &lt;&gt; null)\n}.status'"
	 * @generated
	 */
	boolean methodRequiredForOtherType(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Controller path should start with \\\'/\\\'!\',\n\tstatus : Boolean = self.path.at(1) = \'/\'\n}.status'"
	 * @generated
	 */
	boolean controllerPath(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Controller paths should be unique and different from names!\',\n\tstatus : Boolean = \n\t        Controller.allInstances() -&gt; isUnique(c | c.path) and Controller.allInstances() -&gt; forAll(c | \'/\' + c.name.toLower() &lt;&gt; c.path.toLower())\n}.status'"
	 * @generated
	 */
	boolean uniqueControllerPath(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Endpoints within a controller must have unique URLs!\',\n\tstatus : Boolean = \n   \t\t \tself.controller_endpoints -&gt; isUnique(e | e.url)\n}.status'"
	 * @generated
	 */
	boolean uniqueEndpointURLs(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Controllers should have unique names!\',\n\tstatus : Boolean = Controller.allInstances() -&gt; isUnique(c | c.name)\n}.status'"
	 * @generated
	 */
	boolean uniqueControllerName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Endpoints within a controller must have unique method names!\',\n\tstatus : Boolean = \n   \t\t \tself.controller_endpoints -&gt; isUnique(e | e.methodName)\n}.status'"
	 * @generated
	 */
	boolean uniqueEndpointMethodNames(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Controllers of type other than \"Authentication\" should not have registration, login, or logout endpoints!\',\n\tstatus : Boolean = \n\t    \tnot self.oclIsTypeOf(Authentication) implies (\n\t\t        self.controller_endpoints -&gt; select(e | e.type = EEndpointType::REGISTRATION) -&gt; isEmpty()\n\t\t        and\n\t\t        self.controller_endpoints -&gt; select(e | e.type = EEndpointType::LOGIN) -&gt; isEmpty()\n\t\t        and\n\t\t        self.controller_endpoints -&gt; select(e | e.type = EEndpointType::LOGOUT) -&gt; isEmpty())\n}.status'"
	 * @generated
	 */
	boolean endpointLimits(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Controller names cannot be \"User\" or \"Role\"!\',\n\tstatus : Boolean = \n\t        not Controller.allInstances() -&gt; exists(c | c.name.toLower() = \'user\' or c.name.toLower() = \'role\')\n}.status'"
	 * @generated
	 */
	boolean controllerNotNamedUserRole(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Controller
