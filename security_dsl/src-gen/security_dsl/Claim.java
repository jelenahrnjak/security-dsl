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
 * </ul>
 *
 * @see security_dsl.Security_dslPackage#getClaim()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueClaimAttribute'"
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
	 * @model required="true"
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Claim.allInstances() -&gt; isUnique(c | c.claim_attribute)'"
	 * @generated
	 */
	boolean uniqueClaimAttribute(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Claim
