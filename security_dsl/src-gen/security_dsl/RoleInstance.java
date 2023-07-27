/**
 */
package security_dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security_dsl.RoleInstance#getName <em>Name</em>}</li>
 *   <li>{@link security_dsl.RoleInstance#isClient <em>Client</em>}</li>
 * </ul>
 *
 * @see security_dsl.Security_dslPackage#getRoleInstance()
 * @model
 * @generated
 */
public interface RoleInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see security_dsl.Security_dslPackage#getRoleInstance_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link security_dsl.RoleInstance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Client</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' attribute.
	 * @see #setClient(boolean)
	 * @see security_dsl.Security_dslPackage#getRoleInstance_Client()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isClient();

	/**
	 * Sets the value of the '{@link security_dsl.RoleInstance#isClient <em>Client</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client</em>' attribute.
	 * @see #isClient()
	 * @generated
	 */
	void setClient(boolean value);

} // RoleInstance
