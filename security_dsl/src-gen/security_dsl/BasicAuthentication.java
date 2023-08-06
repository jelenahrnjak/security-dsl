/**
 */
package security_dsl;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Authentication</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see security_dsl.Security_dslPackage#getBasicAuthentication()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='basicAuthNoRoleAttributes'"
 * @generated
 */
public interface BasicAuthentication extends Security {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Basic authentication cannot have role attributes!\',\n\tstatus : Boolean = \n\t        Entity.allInstances() -&gt; select(e | e.oclIsTypeOf(Role))\n\t            -&gt; forAll(role | role.entity_attributes -&gt; size() = 0)\n}.status'"
	 * @generated
	 */
	boolean basicAuthNoRoleAttributes(DiagnosticChain diagnostics, Map<Object, Object> context);
} // BasicAuthentication
