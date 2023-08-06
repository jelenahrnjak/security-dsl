/**
 */
package security_dsl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see security_dsl.Security_dslPackage#getUser()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noAttributeNamedPassword'"
 * @generated
 */
public interface User extends Entity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'User entity must have exactly one attribute of type String marked as a credential!\',\n\tstatus : Boolean = \n\t        self.entity_attributes -&gt; select(a | a.credential) -&gt; size() = 1\n\t        and\n\t        self.entity_attributes -&gt; select(a | a.credential) -&gt; forAll(a | a.type = EType::String)\n}.status'"
	 * @generated
	 */
	boolean oneCredentialForUser(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'User entity cannot have an attribute named \"password\"!\',\n\tstatus : Boolean = \n\t        self.entity_attributes -&gt; forAll(a | a.name.toLower() &lt;&gt; \'password\')\n}.status'"
	 * @generated
	 */
	boolean noAttributeNamedPassword(DiagnosticChain diagnostics, Map<Object, Object> context);

} // User
