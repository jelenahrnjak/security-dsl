/**
 */
package security_dsl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security_dsl.Application#getApp_database <em>App database</em>}</li>
 *   <li>{@link security_dsl.Application#getApp_entities <em>App entities</em>}</li>
 *   <li>{@link security_dsl.Application#getApp_controllers <em>App controllers</em>}</li>
 *   <li>{@link security_dsl.Application#getApp_security <em>App security</em>}</li>
 *   <li>{@link security_dsl.Application#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link security_dsl.Application#getGroup <em>Group</em>}</li>
 *   <li>{@link security_dsl.Application#getName <em>Name</em>}</li>
 *   <li>{@link security_dsl.Application#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link security_dsl.Application#getDescription <em>Description</em>}</li>
 *   <li>{@link security_dsl.Application#getPort <em>Port</em>}</li>
 *   <li>{@link security_dsl.Application#getHostname <em>Hostname</em>}</li>
 * </ul>
 *
 * @see security_dsl.Security_dslPackage#getApplication()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasDatabaseForEntity'"
 * @generated
 */
public interface Application extends EObject {
	/**
	 * Returns the value of the '<em><b>App database</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App database</em>' containment reference.
	 * @see #setApp_database(Database)
	 * @see security_dsl.Security_dslPackage#getApplication_App_database()
	 * @model containment="true"
	 * @generated
	 */
	Database getApp_database();

	/**
	 * Sets the value of the '{@link security_dsl.Application#getApp_database <em>App database</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App database</em>' containment reference.
	 * @see #getApp_database()
	 * @generated
	 */
	void setApp_database(Database value);

	/**
	 * Returns the value of the '<em><b>App entities</b></em>' containment reference list.
	 * The list contents are of type {@link security_dsl.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App entities</em>' containment reference list.
	 * @see security_dsl.Security_dslPackage#getApplication_App_entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getApp_entities();

	/**
	 * Returns the value of the '<em><b>App controllers</b></em>' containment reference list.
	 * The list contents are of type {@link security_dsl.Controller}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App controllers</em>' containment reference list.
	 * @see security_dsl.Security_dslPackage#getApplication_App_controllers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Controller> getApp_controllers();

	/**
	 * Returns the value of the '<em><b>App security</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App security</em>' containment reference.
	 * @see #setApp_security(Security)
	 * @see security_dsl.Security_dslPackage#getApplication_App_security()
	 * @model containment="true"
	 * @generated
	 */
	Security getApp_security();

	/**
	 * Sets the value of the '{@link security_dsl.Application#getApp_security <em>App security</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App security</em>' containment reference.
	 * @see #getApp_security()
	 * @generated
	 */
	void setApp_security(Security value);

	/**
	 * Returns the value of the '<em><b>Artifact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact</em>' attribute.
	 * @see #setArtifact(String)
	 * @see security_dsl.Security_dslPackage#getApplication_Artifact()
	 * @model required="true"
	 * @generated
	 */
	String getArtifact();

	/**
	 * Sets the value of the '{@link security_dsl.Application#getArtifact <em>Artifact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact</em>' attribute.
	 * @see #getArtifact()
	 * @generated
	 */
	void setArtifact(String value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute.
	 * @see #setGroup(String)
	 * @see security_dsl.Security_dslPackage#getApplication_Group()
	 * @model required="true"
	 * @generated
	 */
	String getGroup();

	/**
	 * Sets the value of the '{@link security_dsl.Application#getGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' attribute.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see security_dsl.Security_dslPackage#getApplication_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link security_dsl.Application#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see security_dsl.Security_dslPackage#getApplication_PackageName()
	 * @model
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link security_dsl.Application#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>"Security dsl generated application"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see security_dsl.Security_dslPackage#getApplication_Description()
	 * @model default="Security dsl generated application"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link security_dsl.Application#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * The default value is <code>"8080"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(Long)
	 * @see security_dsl.Security_dslPackage#getApplication_Port()
	 * @model default="8080"
	 * @generated
	 */
	Long getPort();

	/**
	 * Sets the value of the '{@link security_dsl.Application#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Long value);

	/**
	 * Returns the value of the '<em><b>Hostname</b></em>' attribute.
	 * The default value is <code>"localhost"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hostname</em>' attribute.
	 * @see #setHostname(String)
	 * @see security_dsl.Security_dslPackage#getApplication_Hostname()
	 * @model default="localhost"
	 * @generated
	 */
	String getHostname();

	/**
	 * Sets the value of the '{@link security_dsl.Application#getHostname <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hostname</em>' attribute.
	 * @see #getHostname()
	 * @generated
	 */
	void setHostname(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'An application must have a database defined if it has entities!\',\n\tstatus : Boolean = self.app_entities -&gt; isEmpty() or not self.app_database-&gt;isEmpty()\n}.status'"
	 * @generated
	 */
	boolean hasDatabaseForEntity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Port must be in the valid range of 1024 to 49151!\',\n\tstatus : Boolean = self.port &gt;= 1024 and self.port &lt;= 49151\n}.status'"
	 * @generated
	 */
	boolean validRegisteredPort(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Application
