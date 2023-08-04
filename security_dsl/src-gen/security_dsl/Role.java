/**
 */
package security_dsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security_dsl.Role#getRole_instances <em>Role instances</em>}</li>
 * </ul>
 *
 * @see security_dsl.Security_dslPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends Entity {
	/**
	 * Returns the value of the '<em><b>Role instances</b></em>' containment reference list.
	 * The list contents are of type {@link security_dsl.RoleInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role instances</em>' containment reference list.
	 * @see security_dsl.Security_dslPackage#getRole_Role_instances()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoleInstance> getRole_instances();

} // Role
