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
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueProviders'"
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
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body=' self.providers -&gt; isUnique(p | p.name)'"
	 * @generated
	 */
	boolean uniqueProviders(DiagnosticChain diagnostics, Map<Object, Object> context);

} // OAuth2
