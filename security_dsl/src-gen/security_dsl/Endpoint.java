/**
 */
package security_dsl;

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
 *   <li>{@link security_dsl.Endpoint#getFunction_name <em>Function name</em>}</li>
 *   <li>{@link security_dsl.Endpoint#getMethod <em>Method</em>}</li>
 *   <li>{@link security_dsl.Endpoint#getRoles_authority <em>Roles authority</em>}</li>
 * </ul>
 *
 * @see security_dsl.Security_dslPackage#getEndpoint()
 * @model
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
	 * Returns the value of the '<em><b>Function name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function name</em>' attribute.
	 * @see #setFunction_name(String)
	 * @see security_dsl.Security_dslPackage#getEndpoint_Function_name()
	 * @model required="true"
	 * @generated
	 */
	String getFunction_name();

	/**
	 * Sets the value of the '{@link security_dsl.Endpoint#getFunction_name <em>Function name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function name</em>' attribute.
	 * @see #getFunction_name()
	 * @generated
	 */
	void setFunction_name(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * The literals are from the enumeration {@link security_dsl.EEndpointMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see security_dsl.EEndpointMethod
	 * @see #setMethod(EEndpointMethod)
	 * @see security_dsl.Security_dslPackage#getEndpoint_Method()
	 * @model required="true"
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
	 * Returns the value of the '<em><b>Roles authority</b></em>' reference list.
	 * The list contents are of type {@link security_dsl.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles authority</em>' reference list.
	 * @see security_dsl.Security_dslPackage#getEndpoint_Roles_authority()
	 * @model
	 * @generated
	 */
	EList<Role> getRoles_authority();

} // Endpoint
