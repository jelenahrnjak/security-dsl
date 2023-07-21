/**
 */
package security_dsl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JWT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security_dsl.JWT#getSignatureAlgorithm <em>Signature Algorithm</em>}</li>
 *   <li>{@link security_dsl.JWT#getSecret <em>Secret</em>}</li>
 *   <li>{@link security_dsl.JWT#getJwt_claims <em>Jwt claims</em>}</li>
 *   <li>{@link security_dsl.JWT#getRegisteredclaims <em>Registeredclaims</em>}</li>
 * </ul>
 *
 * @see security_dsl.Security_dslPackage#getJWT()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='singleRegisteredClaim'"
 * @generated
 */
public interface JWT extends Security {
	/**
	 * Returns the value of the '<em><b>Signature Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature Algorithm</em>' attribute.
	 * @see #setSignatureAlgorithm(String)
	 * @see security_dsl.Security_dslPackage#getJWT_SignatureAlgorithm()
	 * @model required="true"
	 * @generated
	 */
	String getSignatureAlgorithm();

	/**
	 * Sets the value of the '{@link security_dsl.JWT#getSignatureAlgorithm <em>Signature Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Algorithm</em>' attribute.
	 * @see #getSignatureAlgorithm()
	 * @generated
	 */
	void setSignatureAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Secret</b></em>' attribute.
	 * The default value is <code>"somesecret"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secret</em>' attribute.
	 * @see #setSecret(String)
	 * @see security_dsl.Security_dslPackage#getJWT_Secret()
	 * @model default="somesecret"
	 * @generated
	 */
	String getSecret();

	/**
	 * Sets the value of the '{@link security_dsl.JWT#getSecret <em>Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secret</em>' attribute.
	 * @see #getSecret()
	 * @generated
	 */
	void setSecret(String value);

	/**
	 * Returns the value of the '<em><b>Jwt claims</b></em>' containment reference list.
	 * The list contents are of type {@link security_dsl.Claim}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jwt claims</em>' containment reference list.
	 * @see security_dsl.Security_dslPackage#getJWT_Jwt_claims()
	 * @model containment="true"
	 * @generated
	 */
	EList<Claim> getJwt_claims();

	/**
	 * Returns the value of the '<em><b>Registeredclaims</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registeredclaims</em>' containment reference.
	 * @see #setRegisteredclaims(RegisteredClaims)
	 * @see security_dsl.Security_dslPackage#getJWT_Registeredclaims()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RegisteredClaims getRegisteredclaims();

	/**
	 * Sets the value of the '{@link security_dsl.JWT#getRegisteredclaims <em>Registeredclaims</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registeredclaims</em>' containment reference.
	 * @see #getRegisteredclaims()
	 * @generated
	 */
	void setRegisteredclaims(RegisteredClaims value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.jwt_claims -&gt; isUnique(c | c.name)'"
	 * @generated
	 */
	boolean uniqueClaims(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t    self.jwt_claims -&gt; forAll(c | c.name = \'subject\' implies c.type = EClaimType::REGISTERED)'"
	 * @generated
	 */
	boolean registeredClaimSubject(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t        self.jwt_claims -&gt; select(c | c.type = EClaimType::REGISTERED and c.name = \'subject\') -&gt; size() &lt;= 1\n\t        and\n\t        self.jwt_claims -&gt; select(c | c.type = EClaimType::REGISTERED) -&gt; size() &lt;= 1'"
	 * @generated
	 */
	boolean singleRegisteredClaim(DiagnosticChain diagnostics, Map<Object, Object> context);

} // JWT
