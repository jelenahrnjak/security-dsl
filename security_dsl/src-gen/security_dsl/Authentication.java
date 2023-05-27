/**
 */
package security_dsl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authentication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security_dsl.Authentication#getSignup_endpoint <em>Signup endpoint</em>}</li>
 *   <li>{@link security_dsl.Authentication#getLogin_endpoint <em>Login endpoint</em>}</li>
 *   <li>{@link security_dsl.Authentication#getLogout_endpoint <em>Logout endpoint</em>}</li>
 * </ul>
 *
 * @see security_dsl.Security_dslPackage#getAuthentication()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='methodsAllowedLogout'"
 * @generated
 */
public interface Authentication extends Controller {
	/**
	 * Returns the value of the '<em><b>Signup endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signup endpoint</em>' containment reference.
	 * @see #setSignup_endpoint(Endpoint)
	 * @see security_dsl.Security_dslPackage#getAuthentication_Signup_endpoint()
	 * @model containment="true"
	 * @generated
	 */
	Endpoint getSignup_endpoint();

	/**
	 * Sets the value of the '{@link security_dsl.Authentication#getSignup_endpoint <em>Signup endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signup endpoint</em>' containment reference.
	 * @see #getSignup_endpoint()
	 * @generated
	 */
	void setSignup_endpoint(Endpoint value);

	/**
	 * Returns the value of the '<em><b>Login endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login endpoint</em>' containment reference.
	 * @see #setLogin_endpoint(Endpoint)
	 * @see security_dsl.Security_dslPackage#getAuthentication_Login_endpoint()
	 * @model containment="true"
	 * @generated
	 */
	Endpoint getLogin_endpoint();

	/**
	 * Sets the value of the '{@link security_dsl.Authentication#getLogin_endpoint <em>Login endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login endpoint</em>' containment reference.
	 * @see #getLogin_endpoint()
	 * @generated
	 */
	void setLogin_endpoint(Endpoint value);

	/**
	 * Returns the value of the '<em><b>Logout endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logout endpoint</em>' containment reference.
	 * @see #setLogout_endpoint(Endpoint)
	 * @see security_dsl.Security_dslPackage#getAuthentication_Logout_endpoint()
	 * @model containment="true"
	 * @generated
	 */
	Endpoint getLogout_endpoint();

	/**
	 * Sets the value of the '{@link security_dsl.Authentication#getLogout_endpoint <em>Logout endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logout endpoint</em>' containment reference.
	 * @see #getLogout_endpoint()
	 * @generated
	 */
	void setLogout_endpoint(Endpoint value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.signup_endpoint = null or self.signup_endpoint.method = EEndpointMethod::POST'"
	 * @generated
	 */
	boolean methodsAllowedSignUp(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.login_endpoint = null or ( self.login_endpoint.method = EEndpointMethod::POST or self.login_endpoint.method = EEndpointMethod::GET)'"
	 * @generated
	 */
	boolean methodsAllowedLogin(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.signup_endpoint -&gt; forAll(e | e.url.at(1) = \'/\') and self.login_endpoint -&gt; forAll(e | e.url.at(1) = \'/\') and\n\t\t\tself.logout_endpoint -&gt; forAll(e | e.url.at(1) = \'/\')'"
	 * @generated
	 */
	boolean urlStartsWithForwardSlash(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.logout_endpoint = null or (self.logout_endpoint.method = EEndpointMethod::POST or self.logout_endpoint.method = EEndpointMethod::GET)'"
	 * @generated
	 */
	boolean methodsAllowedLogout(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Authentication
