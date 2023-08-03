/**
 */
package security_dsl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registered Claim</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security_dsl.RegisteredClaim#getExpirationTime <em>Expiration Time</em>}</li>
 *   <li>{@link security_dsl.RegisteredClaim#getAudience <em>Audience</em>}</li>
 *   <li>{@link security_dsl.RegisteredClaim#getIssuer <em>Issuer</em>}</li>
 * </ul>
 *
 * @see security_dsl.Security_dslPackage#getRegisteredClaim()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='expirationTimeGreaterThanZero'"
 * @generated
 */
public interface RegisteredClaim extends EObject {
	/**
	 * Returns the value of the '<em><b>Expiration Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiration Time</em>' attribute.
	 * @see #setExpirationTime(int)
	 * @see security_dsl.Security_dslPackage#getRegisteredClaim_ExpirationTime()
	 * @model required="true"
	 * @generated
	 */
	int getExpirationTime();

	/**
	 * Sets the value of the '{@link security_dsl.RegisteredClaim#getExpirationTime <em>Expiration Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Time</em>' attribute.
	 * @see #getExpirationTime()
	 * @generated
	 */
	void setExpirationTime(int value);

	/**
	 * Returns the value of the '<em><b>Audience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audience</em>' attribute.
	 * @see #setAudience(String)
	 * @see security_dsl.Security_dslPackage#getRegisteredClaim_Audience()
	 * @model required="true"
	 * @generated
	 */
	String getAudience();

	/**
	 * Sets the value of the '{@link security_dsl.RegisteredClaim#getAudience <em>Audience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audience</em>' attribute.
	 * @see #getAudience()
	 * @generated
	 */
	void setAudience(String value);

	/**
	 * Returns the value of the '<em><b>Issuer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issuer</em>' attribute.
	 * @see #setIssuer(String)
	 * @see security_dsl.Security_dslPackage#getRegisteredClaim_Issuer()
	 * @model
	 * @generated
	 */
	String getIssuer();

	/**
	 * Sets the value of the '{@link security_dsl.RegisteredClaim#getIssuer <em>Issuer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer</em>' attribute.
	 * @see #getIssuer()
	 * @generated
	 */
	void setIssuer(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.expirationTime &gt; 0'"
	 * @generated
	 */
	boolean expirationTimeGreaterThanZero(DiagnosticChain diagnostics, Map<Object, Object> context);

} // RegisteredClaim
