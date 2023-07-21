/**
 */
package security_dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security_dsl.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link security_dsl.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link security_dsl.Attribute#isIsIdentifier <em>Is Identifier</em>}</li>
 *   <li>{@link security_dsl.Attribute#getCollumnName <em>Collumn Name</em>}</li>
 * </ul>
 *
 * @see security_dsl.Security_dslPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see security_dsl.Security_dslPackage#getAttribute_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link security_dsl.Attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link security_dsl.EType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see security_dsl.EType
	 * @see #setType(EType)
	 * @see security_dsl.Security_dslPackage#getAttribute_Type()
	 * @model required="true"
	 * @generated
	 */
	EType getType();

	/**
	 * Sets the value of the '{@link security_dsl.Attribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see security_dsl.EType
	 * @see #getType()
	 * @generated
	 */
	void setType(EType value);

	/**
	 * Returns the value of the '<em><b>Is Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Identifier</em>' attribute.
	 * @see #setIsIdentifier(boolean)
	 * @see security_dsl.Security_dslPackage#getAttribute_IsIdentifier()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsIdentifier();

	/**
	 * Sets the value of the '{@link security_dsl.Attribute#isIsIdentifier <em>Is Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Identifier</em>' attribute.
	 * @see #isIsIdentifier()
	 * @generated
	 */
	void setIsIdentifier(boolean value);

	/**
	 * Returns the value of the '<em><b>Collumn Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collumn Name</em>' attribute.
	 * @see #setCollumnName(String)
	 * @see security_dsl.Security_dslPackage#getAttribute_CollumnName()
	 * @model
	 * @generated
	 */
	String getCollumnName();

	/**
	 * Sets the value of the '{@link security_dsl.Attribute#getCollumnName <em>Collumn Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collumn Name</em>' attribute.
	 * @see #getCollumnName()
	 * @generated
	 */
	void setCollumnName(String value);

} // Attribute
