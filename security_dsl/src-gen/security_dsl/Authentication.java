/**
 */
package security_dsl;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authentication</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see security_dsl.Security_dslPackage#getAuthentication()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='authenticationLimits'"
 * @generated
 */
public interface Authentication extends Controller {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Authentication can have at most one registration, login, and logout endpoint!\',\n\tstatus : Boolean = \n\t        self.controller_endpoints -&gt; select(e | e.type = EEndpointType::REGISTRATION) -&gt; size() &lt;= 1\n\t        and\n\t        self.controller_endpoints -&gt; select(e | e.type = EEndpointType::LOGIN) -&gt; size() &lt;= 1\n\t        and\n\t        self.controller_endpoints -&gt; select(e | e.type = EEndpointType::LOGOUT) -&gt; size() &lt;= 1\n}.status'"
	 * @generated
	 */
	boolean authenticationLimits(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Logout endpoint requires a corresponding login endpoint!\',\n\tstatus : Boolean = \n\t        self.controller_endpoints -&gt; select(e | e.type = EEndpointType::LOGOUT) -&gt; size() = 1 implies\n\t        self.controller_endpoints -&gt; select(e | e.type = EEndpointType::LOGIN) -&gt; size() = 1\n}.status'"
	 * @generated
	 */
	boolean loginExistanceForLogout(DiagnosticChain diagnostics, Map<Object, Object> context);
} // Authentication
