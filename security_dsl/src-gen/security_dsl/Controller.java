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
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='methodAllowedLogout'"
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
	 * @model
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
	 * @model
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
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n        \tself.controller_endpoints -&gt; select(e | e.type = EEndpointType::REGISTRATION and (e.method = EEndpointMethod::POST or e.method-&gt;isEmpty())) -&gt; size() &lt;= 1'"
	 * @generated
	 */
	boolean methodAllowedRegistration(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n        \tself.controller_endpoints -&gt; select(e | e.type = EEndpointType::OTHER) -&gt; forAll(e | e.method &lt;&gt; null)'"
	 * @generated
	 */
	boolean methodRequiredForOtherType(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tnot self.oclIsTypeOf(Authentication) implies\n\t\t    (\n\t\t        self.controller_endpoints -&gt; select(e | e.type = EEndpointType::REGISTRATION) -&gt; isEmpty()\n\t\t        and\n\t\t        self.controller_endpoints -&gt; select(e | e.type = EEndpointType::LOGIN) -&gt; isEmpty()\n\t\t        and\n\t\t        self.controller_endpoints -&gt; select(e | e.type = EEndpointType::LOGOUT) -&gt; isEmpty()\n\t\t    )'"
	 * @generated
	 */
	boolean endpointLimits(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n        \tself.controller_endpoints -&gt; select(e | e.type = EEndpointType::LOGIN and (e.method = EEndpointMethod::PUT or e.method = EEndpointMethod::DELETE)) -&gt; size() = 0'"
	 * @generated
	 */
	boolean methodAllowedLogin(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n        \tself.controller_endpoints -&gt; select(e | e.type = EEndpointType::LOGOUT and (e.method = EEndpointMethod::PUT or e.method = EEndpointMethod::DELETE)) -&gt; size() = 0'"
	 * @generated
	 */
	boolean methodAllowedLogout(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t    self.controller_endpoints -&gt; select(e | e.type = EEndpointType::LOGOUT) -&gt; size() = 1 implies\n        \tself.controller_endpoints -&gt; select(e | e.type = EEndpointType::LOGIN) -&gt; size() = 1'"
	 * @generated
	 */
	boolean loginExistanceForLogout(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.oclIsTypeOf(Authentication) implies\n\t\t    (\n\t\t        self.controller_endpoints -&gt; select(e | e.type = EEndpointType::REGISTRATION) -&gt; size() &lt;= 1\n\t\t        and\n\t\t        self.controller_endpoints -&gt; select(e | e.type = EEndpointType::LOGIN) -&gt; size() &lt;= 1\n\t\t        and\n\t\t        self.controller_endpoints -&gt; select(e | e.type = EEndpointType::LOGOUT) -&gt; size() &lt;= 1\n\t\t    ) '"
	 * @generated
	 */
	boolean authenticationLimits(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.controller_endpoints -&gt; forAll(e | e.url.at(1) = \'/\')'"
	 * @generated
	 */
	boolean urlStartsWithForwardSlash(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.controller_endpoints -&gt; forAll(e1, e2 |  e1 &lt;&gt; e2 implies  (e1.functionName &lt;&gt; null and e2.functionName &lt;&gt; null implies e1.functionName &lt;&gt; e2.functionName) \n        and \n        (e1.url &lt;&gt; null and e2.url &lt;&gt; null implies e1.url &lt;&gt; e2.url))'"
	 * @generated
	 */
	boolean uniqueEndpoints(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Controller
