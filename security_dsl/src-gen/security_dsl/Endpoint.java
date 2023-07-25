/**
 */
package security_dsl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security_dsl.Endpoint#getUrl <em>Url</em>}</li>
 *   <li>{@link security_dsl.Endpoint#getFunctionName <em>Function Name</em>}</li>
 *   <li>{@link security_dsl.Endpoint#getMethod <em>Method</em>}</li>
 *   <li>{@link security_dsl.Endpoint#getType <em>Type</em>}</li>
 *   <li>{@link security_dsl.Endpoint#getRole_authorities <em>Role authorities</em>}</li>
 * </ul>
 *
 * @see security_dsl.Security_dslPackage#getEndpoint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueRoleAuthorities'"
 * @generated
 */
public interface Endpoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see security_dsl.Security_dslPackage#getEndpoint_Url()
	 * @model required="true"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link security_dsl.Endpoint#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Name</em>' attribute.
	 * @see #setFunctionName(String)
	 * @see security_dsl.Security_dslPackage#getEndpoint_FunctionName()
	 * @model
	 * @generated
	 */
	String getFunctionName();

	/**
	 * Sets the value of the '{@link security_dsl.Endpoint#getFunctionName <em>Function Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Name</em>' attribute.
	 * @see #getFunctionName()
	 * @generated
	 */
	void setFunctionName(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * The literals are from the enumeration {@link security_dsl.EEndpointMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see security_dsl.EEndpointMethod
	 * @see #setMethod(EEndpointMethod)
	 * @see security_dsl.Security_dslPackage#getEndpoint_Method()
	 * @model
	 * @generated
	 */
	EEndpointMethod getMethod();

	/**
	 * Sets the value of the '{@link security_dsl.Endpoint#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see security_dsl.EEndpointMethod
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(EEndpointMethod value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"OTHER"</code>.
	 * The literals are from the enumeration {@link security_dsl.EEndpointType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see security_dsl.EEndpointType
	 * @see #setType(EEndpointType)
	 * @see security_dsl.Security_dslPackage#getEndpoint_Type()
	 * @model default="OTHER"
	 * @generated
	 */
	EEndpointType getType();

	/**
	 * Sets the value of the '{@link security_dsl.Endpoint#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see security_dsl.EEndpointType
	 * @see #getType()
	 * @generated
	 */
	void setType(EEndpointType value);

	/**
	 * Returns the value of the '<em><b>Role authorities</b></em>' reference list.
	 * The list contents are of type {@link security_dsl.RoleInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role authorities</em>' reference list.
	 * @see security_dsl.Security_dslPackage#getEndpoint_Role_authorities()
	 * @model
	 * @generated
	 */
	EList<RoleInstance> getRole_authorities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.role_authorities -&gt; isUnique(r | r.name)'"
	 * @generated
	 */
	boolean uniqueRoleAuthorities(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Endpoint