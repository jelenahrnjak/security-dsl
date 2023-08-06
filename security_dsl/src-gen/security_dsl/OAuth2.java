/**
 */
package security_dsl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OAuth2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security_dsl.OAuth2#getProviders <em>Providers</em>}</li>
 * </ul>
 *
 * @see security_dsl.Security_dslPackage#getOAuth2()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='doesntHaveUserForOauth'"
 * @generated
 */
public interface OAuth2 extends Security {
	/**
	 * Returns the value of the '<em><b>Providers</b></em>' containment reference list.
	 * The list contents are of type {@link security_dsl.Provider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providers</em>' containment reference list.
	 * @see security_dsl.Security_dslPackage#getOAuth2_Providers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Provider> getProviders();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Providers must have unique names!\',\n\tstatus : Boolean = self.providers -&gt; isUnique(p | p.name)\n}.status'"
	 * @generated
	 */
	boolean uniqueProviders(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'OAuth2 authentication requires no Role entities!\',\n\tstatus : Boolean = \n\t\t    Entity.allInstances() -&gt; select(e | e.oclIsTypeOf(Role)) -&gt; size() = 0\n}.status'"
	 * @generated
	 */
	boolean doesntHaveRoleForOauth(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'OAuth2 authentication requires no Role entities!\',\n\tstatus : Boolean = \n\t\t    Controller.allInstances() -&gt; select(e | e.oclIsTypeOf(Authentication)) -&gt; size() = 0\n}.status'"
	 * @generated
	 */
	boolean doesntHaveAuthControllerForOauth(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'OAuth2 authentication requires no Role entities!\',\n\tstatus : Boolean = \n\t\t    Entity.allInstances() -&gt; select(e | e.oclIsTypeOf(User)) -&gt; size() = 0\n}.status'"
	 * @generated
	 */
	boolean doesntHaveUserForOauth(DiagnosticChain diagnostics, Map<Object, Object> context);

} // OAuth2
