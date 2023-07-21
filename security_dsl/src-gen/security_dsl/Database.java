/**
 */
package security_dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security_dsl.Database#getVendorName <em>Vendor Name</em>}</li>
 *   <li>{@link security_dsl.Database#getUrl <em>Url</em>}</li>
 *   <li>{@link security_dsl.Database#getUsername <em>Username</em>}</li>
 *   <li>{@link security_dsl.Database#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @see security_dsl.Security_dslPackage#getDatabase()
 * @model
 * @generated
 */
public interface Database extends EObject {
	/**
	 * Returns the value of the '<em><b>Vendor Name</b></em>' attribute.
	 * The literals are from the enumeration {@link security_dsl.EDatabaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor Name</em>' attribute.
	 * @see security_dsl.EDatabaseType
	 * @see #setVendorName(EDatabaseType)
	 * @see security_dsl.Security_dslPackage#getDatabase_VendorName()
	 * @model required="true"
	 * @generated
	 */
	EDatabaseType getVendorName();

	/**
	 * Sets the value of the '{@link security_dsl.Database#getVendorName <em>Vendor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Name</em>' attribute.
	 * @see security_dsl.EDatabaseType
	 * @see #getVendorName()
	 * @generated
	 */
	void setVendorName(EDatabaseType value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see security_dsl.Security_dslPackage#getDatabase_Url()
	 * @model required="true"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link security_dsl.Database#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see security_dsl.Security_dslPackage#getDatabase_Username()
	 * @model required="true"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link security_dsl.Database#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see security_dsl.Security_dslPackage#getDatabase_Password()
	 * @model required="true"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link security_dsl.Database#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

} // Database
