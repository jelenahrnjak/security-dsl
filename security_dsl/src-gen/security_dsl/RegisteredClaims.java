/**
 */
package security_dsl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registered Claims</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security_dsl.RegisteredClaims#getExpirationTime <em>Expiration Time</em>}</li>
 *   <li>{@link security_dsl.RegisteredClaims#getIssuer <em>Issuer</em>}</li>
 *   <li>{@link security_dsl.RegisteredClaims#getAudience <em>Audience</em>}</li>
 * </ul>
 *
 * @see security_dsl.Security_dslPackage#getRegisteredClaims()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='expirationTimeGreaterThanZero'"
 * @generated
 */
public interface RegisteredClaims extends EObject {
	/**
	 * Returns the value of the '<em><b>Expiration Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiration Time</em>' attribute.
	 * @see #setExpirationTime(int)
	 * @see security_dsl.Security_dslPackage#getRegisteredClaims_ExpirationTime()
	 * @model required="true"
	 * @generated
	 */
	int getExpirationTime();

	/**
	 * Sets the value of the '{@link security_dsl.RegisteredClaims#getExpirationTime <em>Expiration Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Time</em>' attribute.
	 * @see #getExpirationTime()
	 * @generated
	 */
	void setExpirationTime(int value);

	/**
	 * Returns the value of the '<em><b>Issuer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issuer</em>' attribute.
	 * @see #setIssuer(String)
	 * @see security_dsl.Security_dslPackage#getRegisteredClaims_Issuer()
	 * @model
	 * @generated
	 */
	String getIssuer();

	/**
	 * Sets the value of the '{@link security_dsl.RegisteredClaims#getIssuer <em>Issuer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer</em>' attribute.
	 * @see #getIssuer()
	 * @generated
	 */
	void setIssuer(String value);

	/**
	 * Returns the value of the '<em><b>Audience</b></em>' attribute.
	 * The default value is <code>"WEB"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audience</em>' attribute.
	 * @see #setAudience(String)
	 * @see security_dsl.Security_dslPackage#getRegisteredClaims_Audience()
	 * @model default="WEB"
	 * @generated
	 */
	String getAudience();

	/**
	 * Sets the value of the '{@link security_dsl.RegisteredClaims#getAudience <em>Audience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audience</em>' attribute.
	 * @see #getAudience()
	 * @generated
	 */
	void setAudience(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.expirationTime &gt; 0'"
	 * @generated
	 */
	boolean expirationTimeGreaterThanZero(DiagnosticChain diagnostics, Map<Object, Object> context);

} // RegisteredClaims
