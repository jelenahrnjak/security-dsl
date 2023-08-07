/**
 */
package security_dsl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security_dsl.Claim#getType <em>Type</em>}</li>
 *   <li>{@link security_dsl.Claim#getClaim_attribute <em>Claim attribute</em>}</li>
 *   <li>{@link security_dsl.Claim#getName <em>Name</em>}</li>
 *   <li>{@link security_dsl.Claim#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see security_dsl.Security_dslPackage#getClaim()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='issuerValueNotNull'"
 * @generated
 */
public interface Claim extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link security_dsl.EClaimType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see security_dsl.EClaimType
	 * @see #setType(EClaimType)
	 * @see security_dsl.Security_dslPackage#getClaim_Type()
	 * @model required="true"
	 * @generated
	 */
	EClaimType getType();

	/**
	 * Sets the value of the '{@link security_dsl.Claim#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see security_dsl.EClaimType
	 * @see #getType()
	 * @generated
	 */
	void setType(EClaimType value);

	/**
	 * Returns the value of the '<em><b>Claim attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claim attribute</em>' reference.
	 * @see #setClaim_attribute(Attribute)
	 * @see security_dsl.Security_dslPackage#getClaim_Claim_attribute()
	 * @model
	 * @generated
	 */
	Attribute getClaim_attribute();

	/**
	 * Sets the value of the '{@link security_dsl.Claim#getClaim_attribute <em>Claim attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim attribute</em>' reference.
	 * @see #getClaim_attribute()
	 * @generated
	 */
	void setClaim_attribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see security_dsl.Security_dslPackage#getClaim_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link security_dsl.Claim#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see security_dsl.Security_dslPackage#getClaim_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link security_dsl.Claim#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Claims must have unique names\',\n\tstatus : Boolean = Claim.allInstances() -&gt; isUnique(c | c.name)\n}.status'"
	 * @generated
	 */
	boolean uniqueClaimNames(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Claim must be linked to an attribute\',\n\tstatus : Boolean = \n\t\t    Claim.allInstances() -&gt; select(c | c.name &lt;&gt; \'issuer\' and c.name &lt;&gt; \'audience\' and c.name &lt;&gt; \'expirationTime\') -&gt; forAll(sc | sc.value = null and sc.claim_attribute &lt;&gt; null)\n}.status'"
	 * @generated
	 */
	boolean otherClaimsNoValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'If claim name is \"issuer\", it must be of type REGISTERED\',\n\tstatus : Boolean = \n\t    \tClaim.allInstances() -&gt; select(c | c.name = \'issuer\') -&gt; forAll(sc | sc.type = EClaimType::REGISTERED)\n}.status'"
	 * @generated
	 */
	boolean issuerRegisteredClaim(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Claim attributes must be unique!\',\n\tstatus : Boolean = \n\t\tClaim.allInstances() -&gt; select(c | c.claim_attribute &lt;&gt; null) -&gt; isUnique(c | c.claim_attribute)\n}.status'"
	 * @generated
	 */
	boolean uniqueClaimAttribute(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'If claim name is \"subject\", it must be of type REGISTERED\',\n\tstatus : Boolean = \n\t    \tClaim.allInstances() -&gt; select(c | c.name = \'subject\') -&gt; forAll(sc | sc.type = EClaimType::REGISTERED)\n}.status'"
	 * @generated
	 */
	boolean subjectRegisteredClaim(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'If the claim name is \"audience\", it must have value and must not be linked to an attribute\',\n\tstatus : Boolean = \n\t\t    Claim.allInstances() -&gt; select(c | c.name = \'audience\') -&gt; forAll(sc | sc.value &lt;&gt; null and sc.claim_attribute = null)\n}.status'"
	 * @generated
	 */
	boolean audienceValueNotNull(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'If the claim name is \"expirationTime\", the value must be a positive number\',\n\tstatus : Boolean = \n\t\t    Claim.allInstances() -&gt; select(c | c.name = \'expirationTime\') -&gt; forAll(sc | sc.value &lt;&gt; null and  sc.value.toInteger() &gt; 0)\n}.status'"
	 * @generated
	 */
	boolean expirationTimeValueIsPositiveNumeric(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'The claim \"expirationTime\" must exist and be of type REGISTERED\',\n\tstatus : Boolean = \n    \t\t\tClaim.allInstances() -&gt; exists(c | c.name = \'expirationTime\' and c.type = EClaimType::REGISTERED)\n}.status'"
	 * @generated
	 */
	boolean hasExpirationTimeClaim(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'The claim \"audience\" must exist and be of type REGISTERED\',\n\tstatus : Boolean = \n\t\t    Claim.allInstances() -&gt; exists(c | c.name = \'audience\' and c.type = EClaimType::REGISTERED)\n}.status'"
	 * @generated
	 */
	boolean hasAudienceClaim(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'If the claim name is \"expirationTime\", it must have value and must not be linked to an attribute\',\n\tstatus : Boolean = \n\t\t    Claim.allInstances() -&gt; select(c | c.name = \'expirationTime\') -&gt; forAll(sc | sc.value &lt;&gt; null and sc.claim_attribute = null)\n}.status'"
	 * @generated
	 */
	boolean expirationTimeValueNotNull(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'If the claim name is \"issuer\", it must have value and must not be linked to an attribute\',\n\tstatus : Boolean = \n    \t\tClaim.allInstances() -&gt; select(c | c.name = \'issuer\') -&gt; forAll(sc | sc.value &lt;&gt; null and sc.claim_attribute = null)\n}.status'"
	 * @generated
	 */
	boolean issuerValueNotNull(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Claim
