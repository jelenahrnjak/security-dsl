/**
 */
package security_dsl;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
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
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueRoleInstanceName'"
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'There can be at most one entity of type \"Role\" in the model!\',\n\tstatus : Boolean = \n\t\t    Entity.allInstances() -&gt; select(e | e.oclIsTypeOf(Role)) -&gt; size() &lt;= 1\n}.status'"
	 * @generated
	 */
	boolean uniqueRoleEntity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Role instance names must be unique!\',\n\tstatus : Boolean = \n\t        self.role_instances -&gt; isUnique(r | r.name)\n}.status'"
	 * @generated
	 */
	boolean uniqueRoleInstanceName(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Role
