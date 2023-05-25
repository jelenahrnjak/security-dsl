/**
 */
package security_dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security_dsl.Security#getMechanism <em>Mechanism</em>}</li>
 * </ul>
 *
 * @see security_dsl.Security_dslPackage#getSecurity()
 * @model abstract="true"
 * @generated
 */
public interface Security extends EObject {
	/**
	 * Returns the value of the '<em><b>Mechanism</b></em>' attribute.
	 * The default value is <code>"JWT"</code>.
	 * The literals are from the enumeration {@link security_dsl.ESecurityMechanism}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mechanism</em>' attribute.
	 * @see security_dsl.ESecurityMechanism
	 * @see #setMechanism(ESecurityMechanism)
	 * @see security_dsl.Security_dslPackage#getSecurity_Mechanism()
	 * @model default="JWT" required="true"
	 * @generated
	 */
	ESecurityMechanism getMechanism();

	/**
	 * Sets the value of the '{@link security_dsl.Security#getMechanism <em>Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mechanism</em>' attribute.
	 * @see security_dsl.ESecurityMechanism
	 * @see #getMechanism()
	 * @generated
	 */
	void setMechanism(ESecurityMechanism value);

} // Security
