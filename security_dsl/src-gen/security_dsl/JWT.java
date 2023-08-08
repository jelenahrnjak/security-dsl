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
 *   <li>{@link security_dsl.JWT#getClaims <em>Claims</em>}</li>
 * </ul>
 *
 * @see security_dsl.Security_dslPackage#getJWT()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='roleHasStringAttribute'"
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secret</em>' attribute.
	 * @see #setSecret(String)
	 * @see security_dsl.Security_dslPackage#getJWT_Secret()
	 * @model required="true"
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
	 * Returns the value of the '<em><b>Claims</b></em>' containment reference list.
	 * The list contents are of type {@link security_dsl.Claim}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claims</em>' containment reference list.
	 * @see security_dsl.Security_dslPackage#getJWT_Claims()
	 * @model containment="true"
	 * @generated
	 */
	EList<Claim> getClaims();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Role entities can have at most two attributes!\',\n\tstatus : Boolean = \n\t\t    Entity.allInstances() -&gt; select(e | e.oclIsTypeOf(Role)) -&gt; forAll(role | role.entity_attributes -&gt; size() &lt;= 2)\n}.status'"
	 * @generated
	 */
	boolean roleHasMaxTwoAttributes(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Role entities must have either one identifier attribute of type String or both identifier and non-identifier attributes of type String!\',\n\tstatus : Boolean = \n\t\t    Entity.allInstances() -&gt; select(e | e.oclIsTypeOf(Role)) -&gt; forAll(role |\n\t\t        (role.entity_attributes -&gt; select(a | a.identifier and a.type = EType::_\'String\') -&gt; size() = 1 and role.entity_attributes -&gt; select(a | a.type = EType::_\'String\') -&gt; size() = 1)\n\t\t        or\n\t\t        (role.entity_attributes -&gt; select(a | a.identifier and a.type &lt;&gt; EType::_\'String\') -&gt; size() = 1 and role.entity_attributes -&gt; select(a | a.type = EType::_\'String\') -&gt; size() = 1)\n\t\t    )\n}.status'"
	 * @generated
	 */
	boolean roleHasStringAttribute(DiagnosticChain diagnostics, Map<Object, Object> context);

} // JWT
