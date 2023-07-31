/**
 */
package security_dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security_dsl.Provider#getName <em>Name</em>}</li>
 *   <li>{@link security_dsl.Provider#getClientId <em>Client Id</em>}</li>
 *   <li>{@link security_dsl.Provider#getClientSecret <em>Client Secret</em>}</li>
 *   <li>{@link security_dsl.Provider#getRedirectUri <em>Redirect Uri</em>}</li>
 * </ul>
 *
 * @see security_dsl.Security_dslPackage#getProvider()
 * @model
 * @generated
 */
public interface Provider extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link security_dsl.EOAuthProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see security_dsl.EOAuthProvider
	 * @see #setName(EOAuthProvider)
	 * @see security_dsl.Security_dslPackage#getProvider_Name()
	 * @model required="true"
	 * @generated
	 */
	EOAuthProvider getName();

	/**
	 * Sets the value of the '{@link security_dsl.Provider#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see security_dsl.EOAuthProvider
	 * @see #getName()
	 * @generated
	 */
	void setName(EOAuthProvider value);

	/**
	 * Returns the value of the '<em><b>Client Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Id</em>' attribute.
	 * @see #setClientId(String)
	 * @see security_dsl.Security_dslPackage#getProvider_ClientId()
	 * @model required="true"
	 * @generated
	 */
	String getClientId();

	/**
	 * Sets the value of the '{@link security_dsl.Provider#getClientId <em>Client Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Id</em>' attribute.
	 * @see #getClientId()
	 * @generated
	 */
	void setClientId(String value);

	/**
	 * Returns the value of the '<em><b>Client Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Secret</em>' attribute.
	 * @see #setClientSecret(String)
	 * @see security_dsl.Security_dslPackage#getProvider_ClientSecret()
	 * @model required="true"
	 * @generated
	 */
	String getClientSecret();

	/**
	 * Sets the value of the '{@link security_dsl.Provider#getClientSecret <em>Client Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Secret</em>' attribute.
	 * @see #getClientSecret()
	 * @generated
	 */
	void setClientSecret(String value);

	/**
	 * Returns the value of the '<em><b>Redirect Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redirect Uri</em>' attribute.
	 * @see #setRedirectUri(String)
	 * @see security_dsl.Security_dslPackage#getProvider_RedirectUri()
	 * @model
	 * @generated
	 */
	String getRedirectUri();

	/**
	 * Sets the value of the '{@link security_dsl.Provider#getRedirectUri <em>Redirect Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redirect Uri</em>' attribute.
	 * @see #getRedirectUri()
	 * @generated
	 */
	void setRedirectUri(String value);

} // Provider
