/**
 */
package security_dsl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jwt Security</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security_dsl.JwtSecurity#getSignatureAlgorithm <em>Signature Algorithm</em>}</li>
 *   <li>{@link security_dsl.JwtSecurity#getIssuer <em>Issuer</em>}</li>
 *   <li>{@link security_dsl.JwtSecurity#getExpirationTime <em>Expiration Time</em>}</li>
 *   <li>{@link security_dsl.JwtSecurity#getAudience <em>Audience</em>}</li>
 *   <li>{@link security_dsl.JwtSecurity#getSecret <em>Secret</em>}</li>
 *   <li>{@link security_dsl.JwtSecurity#getSecurity_claims <em>Security claims</em>}</li>
 * </ul>
 *
 * @see security_dsl.Security_dslPackage#getJwtSecurity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='expirationTimeGreaterThanZero'"
 * @generated
 */
public interface JwtSecurity extends Security {
	/**
	 * Returns the value of the '<em><b>Signature Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature Algorithm</em>' attribute.
	 * @see #setSignatureAlgorithm(String)
	 * @see security_dsl.Security_dslPackage#getJwtSecurity_SignatureAlgorithm()
	 * @model required="true"
	 * @generated
	 */
	String getSignatureAlgorithm();

	/**
	 * Sets the value of the '{@link security_dsl.JwtSecurity#getSignatureAlgorithm <em>Signature Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Algorithm</em>' attribute.
	 * @see #getSignatureAlgorithm()
	 * @generated
	 */
	void setSignatureAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Issuer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issuer</em>' attribute.
	 * @see #setIssuer(String)
	 * @see security_dsl.Security_dslPackage#getJwtSecurity_Issuer()
	 * @model required="true"
	 * @generated
	 */
	String getIssuer();

	/**
	 * Sets the value of the '{@link security_dsl.JwtSecurity#getIssuer <em>Issuer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer</em>' attribute.
	 * @see #getIssuer()
	 * @generated
	 */
	void setIssuer(String value);

	/**
	 * Returns the value of the '<em><b>Expiration Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiration Time</em>' attribute.
	 * @see #setExpirationTime(int)
	 * @see security_dsl.Security_dslPackage#getJwtSecurity_ExpirationTime()
	 * @model required="true"
	 * @generated
	 */
	int getExpirationTime();

	/**
	 * Sets the value of the '{@link security_dsl.JwtSecurity#getExpirationTime <em>Expiration Time</em>}' attribute.
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
	 * @see security_dsl.Security_dslPackage#getJwtSecurity_Audience()
	 * @model required="true"
	 * @generated
	 */
	String getAudience();

	/**
	 * Sets the value of the '{@link security_dsl.JwtSecurity#getAudience <em>Audience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audience</em>' attribute.
	 * @see #getAudience()
	 * @generated
	 */
	void setAudience(String value);

	/**
	 * Returns the value of the '<em><b>Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secret</em>' attribute.
	 * @see #setSecret(String)
	 * @see security_dsl.Security_dslPackage#getJwtSecurity_Secret()
	 * @model required="true"
	 * @generated
	 */
	String getSecret();

	/**
	 * Sets the value of the '{@link security_dsl.JwtSecurity#getSecret <em>Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secret</em>' attribute.
	 * @see #getSecret()
	 * @generated
	 */
	void setSecret(String value);

	/**
	 * Returns the value of the '<em><b>Security claims</b></em>' containment reference list.
	 * The list contents are of type {@link security_dsl.Claims}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security claims</em>' containment reference list.
	 * @see security_dsl.Security_dslPackage#getJwtSecurity_Security_claims()
	 * @model containment="true"
	 * @generated
	 */
	EList<Claims> getSecurity_claims();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.security_claims -&gt; isUnique(c | c.name)'"
	 * @generated
	 */
	boolean uniqueClaims(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.expirationTime &gt; 0'"
	 * @generated
	 */
	boolean expirationTimeGreaterThanZero(DiagnosticChain diagnostics, Map<Object, Object> context);

} // JwtSecurity
