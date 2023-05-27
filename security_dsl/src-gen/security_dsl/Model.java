/**
 */
package security_dsl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security_dsl.Model#getIdentifierName <em>Identifier Name</em>}</li>
 *   <li>{@link security_dsl.Model#getIdentifierType <em>Identifier Type</em>}</li>
 *   <li>{@link security_dsl.Model#getModel_attributes <em>Model attributes</em>}</li>
 * </ul>
 *
 * @see security_dsl.Security_dslPackage#getModel()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueAttributeName'"
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier Name</em>' attribute.
	 * @see #setIdentifierName(String)
	 * @see security_dsl.Security_dslPackage#getModel_IdentifierName()
	 * @model required="true"
	 * @generated
	 */
	String getIdentifierName();

	/**
	 * Sets the value of the '{@link security_dsl.Model#getIdentifierName <em>Identifier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier Name</em>' attribute.
	 * @see #getIdentifierName()
	 * @generated
	 */
	void setIdentifierName(String value);

	/**
	 * Returns the value of the '<em><b>Identifier Type</b></em>' attribute.
	 * The literals are from the enumeration {@link security_dsl.EType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier Type</em>' attribute.
	 * @see security_dsl.EType
	 * @see #setIdentifierType(EType)
	 * @see security_dsl.Security_dslPackage#getModel_IdentifierType()
	 * @model required="true"
	 * @generated
	 */
	EType getIdentifierType();

	/**
	 * Sets the value of the '{@link security_dsl.Model#getIdentifierType <em>Identifier Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier Type</em>' attribute.
	 * @see security_dsl.EType
	 * @see #getIdentifierType()
	 * @generated
	 */
	void setIdentifierType(EType value);

	/**
	 * Returns the value of the '<em><b>Model attributes</b></em>' containment reference list.
	 * The list contents are of type {@link security_dsl.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model attributes</em>' containment reference list.
	 * @see security_dsl.Security_dslPackage#getModel_Model_attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getModel_attributes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.model_attributes -&gt; isUnique(a | a.name) and not self.model_attributes -&gt; exists(a | a.name = self.identifierName)'"
	 * @generated
	 */
	boolean uniqueAttributeName(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Model
