/**
 */
package security_dsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see security_dsl.Security_dslFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface Security_dslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "security_dsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/security_dsl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "security_dsl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Security_dslPackage eINSTANCE = security_dsl.impl.Security_dslPackageImpl.init();

	/**
	 * The meta object id for the '{@link security_dsl.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.ApplicationImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>App database</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__APP_DATABASE = 0;

	/**
	 * The feature id for the '<em><b>App entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__APP_ENTITIES = 1;

	/**
	 * The feature id for the '<em><b>App controllers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__APP_CONTROLLERS = 2;

	/**
	 * The feature id for the '<em><b>App security</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__APP_SECURITY = 3;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ARTIFACT = 4;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__GROUP = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = 6;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__PACKAGE_NAME = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__DESCRIPTION = 8;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__PORT = 9;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__HOSTNAME = 10;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 11;

	/**
	 * The operation id for the '<em>Valid Registered Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___VALID_REGISTERED_PORT__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Has Database For Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___HAS_DATABASE_FOR_ENTITY__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link security_dsl.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.EntityImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Entity attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ENTITY_ATTRIBUTES = 0;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__TABLE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Unique Table Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___UNIQUE_TABLE_NAME__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Unique Collumn Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___UNIQUE_COLLUMN_NAME__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Other Entities Doesnt Have Credential</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___OTHER_ENTITIES_DOESNT_HAVE_CREDENTIAL__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>Unique Attribute Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___UNIQUE_ATTRIBUTE_NAME__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The operation id for the '<em>Only One Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___ONLY_ONE_IDENTIFIER__DIAGNOSTICCHAIN_MAP = 4;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link security_dsl.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.ControllerImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__PATH = 1;

	/**
	 * The feature id for the '<em><b>Controller endpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__CONTROLLER_ENDPOINTS = 2;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Controller Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER___CONTROLLER_PATH__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Controller Not Named User Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER___CONTROLLER_NOT_NAMED_USER_ROLE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Endpoint Limits</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER___ENDPOINT_LIMITS__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>Unique Controller Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER___UNIQUE_CONTROLLER_PATH__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The operation id for the '<em>Unique Endpoint UR Ls</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER___UNIQUE_ENDPOINT_UR_LS__DIAGNOSTICCHAIN_MAP = 4;

	/**
	 * The operation id for the '<em>Method Required For Other Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER___METHOD_REQUIRED_FOR_OTHER_TYPE__DIAGNOSTICCHAIN_MAP = 5;

	/**
	 * The operation id for the '<em>Unique Controller Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER___UNIQUE_CONTROLLER_NAME__DIAGNOSTICCHAIN_MAP = 6;

	/**
	 * The operation id for the '<em>Unique Endpoint Method Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER___UNIQUE_ENDPOINT_METHOD_NAMES__DIAGNOSTICCHAIN_MAP = 7;

	/**
	 * The number of operations of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link security_dsl.impl.SecurityImpl <em>Security</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.SecurityImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getSecurity()
	 * @generated
	 */
	int SECURITY = 3;

	/**
	 * The number of structural features of the '<em>Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link security_dsl.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.DatabaseImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 4;

	/**
	 * The feature id for the '<em><b>Vendor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__VENDOR_NAME = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__URL = 1;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__USERNAME = 2;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__PASSWORD = 3;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link security_dsl.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.AttributeImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IDENTIFIER = 2;

	/**
	 * The feature id for the '<em><b>Credential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CREDENTIAL = 3;

	/**
	 * The feature id for the '<em><b>Collumn Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__COLLUMN_NAME = 4;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link security_dsl.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.RoleImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 6;

	/**
	 * The feature id for the '<em><b>Entity attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ENTITY_ATTRIBUTES = ENTITY__ENTITY_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__TABLE_NAME = ENTITY__TABLE_NAME;

	/**
	 * The feature id for the '<em><b>Role instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ROLE_INSTANCES = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Unique Table Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___UNIQUE_TABLE_NAME__DIAGNOSTICCHAIN_MAP = ENTITY___UNIQUE_TABLE_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Unique Collumn Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___UNIQUE_COLLUMN_NAME__DIAGNOSTICCHAIN_MAP = ENTITY___UNIQUE_COLLUMN_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Other Entities Doesnt Have Credential</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___OTHER_ENTITIES_DOESNT_HAVE_CREDENTIAL__DIAGNOSTICCHAIN_MAP = ENTITY___OTHER_ENTITIES_DOESNT_HAVE_CREDENTIAL__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Unique Attribute Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___UNIQUE_ATTRIBUTE_NAME__DIAGNOSTICCHAIN_MAP = ENTITY___UNIQUE_ATTRIBUTE_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Only One Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___ONLY_ONE_IDENTIFIER__DIAGNOSTICCHAIN_MAP = ENTITY___ONLY_ONE_IDENTIFIER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Unique Role Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___UNIQUE_ROLE_ENTITY__DIAGNOSTICCHAIN_MAP = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Unique Role Instance Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___UNIQUE_ROLE_INSTANCE_NAME__DIAGNOSTICCHAIN_MAP = ENTITY_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link security_dsl.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.UserImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getUser()
	 * @generated
	 */
	int USER = 7;

	/**
	 * The feature id for the '<em><b>Entity attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ENTITY_ATTRIBUTES = ENTITY__ENTITY_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__TABLE_NAME = ENTITY__TABLE_NAME;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Unique Table Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___UNIQUE_TABLE_NAME__DIAGNOSTICCHAIN_MAP = ENTITY___UNIQUE_TABLE_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Unique Collumn Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___UNIQUE_COLLUMN_NAME__DIAGNOSTICCHAIN_MAP = ENTITY___UNIQUE_COLLUMN_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Other Entities Doesnt Have Credential</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___OTHER_ENTITIES_DOESNT_HAVE_CREDENTIAL__DIAGNOSTICCHAIN_MAP = ENTITY___OTHER_ENTITIES_DOESNT_HAVE_CREDENTIAL__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Unique Attribute Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___UNIQUE_ATTRIBUTE_NAME__DIAGNOSTICCHAIN_MAP = ENTITY___UNIQUE_ATTRIBUTE_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Only One Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___ONLY_ONE_IDENTIFIER__DIAGNOSTICCHAIN_MAP = ENTITY___ONLY_ONE_IDENTIFIER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>One String Type Credential For User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___ONE_STRING_TYPE_CREDENTIAL_FOR_USER__DIAGNOSTICCHAIN_MAP = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Unique User Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___UNIQUE_USER_ENTITY__DIAGNOSTICCHAIN_MAP = ENTITY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>No Attribute Named Password</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___NO_ATTRIBUTE_NAMED_PASSWORD__DIAGNOSTICCHAIN_MAP = ENTITY_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link security_dsl.impl.RoleInstanceImpl <em>Role Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.RoleInstanceImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getRoleInstance()
	 * @generated
	 */
	int ROLE_INSTANCE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INSTANCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Client</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INSTANCE__CLIENT = 1;

	/**
	 * The number of structural features of the '<em>Role Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Role Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link security_dsl.impl.AuthenticationImpl <em>Authentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.AuthenticationImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getAuthentication()
	 * @generated
	 */
	int AUTHENTICATION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__NAME = CONTROLLER__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__PATH = CONTROLLER__PATH;

	/**
	 * The feature id for the '<em><b>Controller endpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__CONTROLLER_ENDPOINTS = CONTROLLER__CONTROLLER_ENDPOINTS;

	/**
	 * The number of structural features of the '<em>Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_FEATURE_COUNT = CONTROLLER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Controller Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION___CONTROLLER_PATH__DIAGNOSTICCHAIN_MAP = CONTROLLER___CONTROLLER_PATH__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Controller Not Named User Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION___CONTROLLER_NOT_NAMED_USER_ROLE__DIAGNOSTICCHAIN_MAP = CONTROLLER___CONTROLLER_NOT_NAMED_USER_ROLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Endpoint Limits</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION___ENDPOINT_LIMITS__DIAGNOSTICCHAIN_MAP = CONTROLLER___ENDPOINT_LIMITS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Unique Controller Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION___UNIQUE_CONTROLLER_PATH__DIAGNOSTICCHAIN_MAP = CONTROLLER___UNIQUE_CONTROLLER_PATH__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Unique Endpoint UR Ls</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION___UNIQUE_ENDPOINT_UR_LS__DIAGNOSTICCHAIN_MAP = CONTROLLER___UNIQUE_ENDPOINT_UR_LS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Method Required For Other Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION___METHOD_REQUIRED_FOR_OTHER_TYPE__DIAGNOSTICCHAIN_MAP = CONTROLLER___METHOD_REQUIRED_FOR_OTHER_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Unique Controller Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION___UNIQUE_CONTROLLER_NAME__DIAGNOSTICCHAIN_MAP = CONTROLLER___UNIQUE_CONTROLLER_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Unique Endpoint Method Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION___UNIQUE_ENDPOINT_METHOD_NAMES__DIAGNOSTICCHAIN_MAP = CONTROLLER___UNIQUE_ENDPOINT_METHOD_NAMES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Authentication Limits</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION___AUTHENTICATION_LIMITS__DIAGNOSTICCHAIN_MAP = CONTROLLER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Unique Authentication Controller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION___UNIQUE_AUTHENTICATION_CONTROLLER__DIAGNOSTICCHAIN_MAP = CONTROLLER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Login Existance For Logout</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION___LOGIN_EXISTANCE_FOR_LOGOUT__DIAGNOSTICCHAIN_MAP = CONTROLLER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Has User And Role For Controller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION___HAS_USER_AND_ROLE_FOR_CONTROLLER__DIAGNOSTICCHAIN_MAP = CONTROLLER_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_OPERATION_COUNT = CONTROLLER_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link security_dsl.impl.EndpointImpl <em>Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.EndpointImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getEndpoint()
	 * @generated
	 */
	int ENDPOINT = 10;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__URL = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__METHOD_NAME = 2;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__METHOD = 3;

	/**
	 * The feature id for the '<em><b>Role authorities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__ROLE_AUTHORITIES = 4;

	/**
	 * The number of structural features of the '<em>Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Unique Role Authorities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT___UNIQUE_ROLE_AUTHORITIES__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Url Starts With Forward Slash</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT___URL_STARTS_WITH_FORWARD_SLASH__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link security_dsl.impl.JWTImpl <em>JWT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.JWTImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getJWT()
	 * @generated
	 */
	int JWT = 11;

	/**
	 * The feature id for the '<em><b>Signature Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT__SIGNATURE_ALGORITHM = SECURITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT__SECRET = SECURITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Claims</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT__CLAIMS = SECURITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>JWT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_FEATURE_COUNT = SECURITY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Role Has Max Two Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT___ROLE_HAS_MAX_TWO_ATTRIBUTES__DIAGNOSTICCHAIN_MAP = SECURITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Role Has String Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT___ROLE_HAS_STRING_ATTRIBUTE__DIAGNOSTICCHAIN_MAP = SECURITY_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>JWT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_OPERATION_COUNT = SECURITY_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link security_dsl.impl.ClaimImpl <em>Claim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.ClaimImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getClaim()
	 * @generated
	 */
	int CLAIM = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Claim attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__CLAIM_ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__NAME = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__VALUE = 3;

	/**
	 * The number of structural features of the '<em>Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Unique Claim Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM___UNIQUE_CLAIM_NAMES__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Other Claims No Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM___OTHER_CLAIMS_NO_VALUE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Issuer Registered Claim</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM___ISSUER_REGISTERED_CLAIM__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>Unique Claim Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM___UNIQUE_CLAIM_ATTRIBUTE__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The operation id for the '<em>Subject Registered Claim</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM___SUBJECT_REGISTERED_CLAIM__DIAGNOSTICCHAIN_MAP = 4;

	/**
	 * The operation id for the '<em>Audience Value Not Null</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM___AUDIENCE_VALUE_NOT_NULL__DIAGNOSTICCHAIN_MAP = 5;

	/**
	 * The operation id for the '<em>Expiration Time Value Is Positive Numeric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM___EXPIRATION_TIME_VALUE_IS_POSITIVE_NUMERIC__DIAGNOSTICCHAIN_MAP = 6;

	/**
	 * The operation id for the '<em>Has Expiration Time Claim</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM___HAS_EXPIRATION_TIME_CLAIM__DIAGNOSTICCHAIN_MAP = 7;

	/**
	 * The operation id for the '<em>Has Audience Claim</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM___HAS_AUDIENCE_CLAIM__DIAGNOSTICCHAIN_MAP = 8;

	/**
	 * The operation id for the '<em>Expiration Time Value Not Null</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM___EXPIRATION_TIME_VALUE_NOT_NULL__DIAGNOSTICCHAIN_MAP = 9;

	/**
	 * The operation id for the '<em>Issuer Value Not Null</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM___ISSUER_VALUE_NOT_NULL__DIAGNOSTICCHAIN_MAP = 10;

	/**
	 * The number of operations of the '<em>Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_OPERATION_COUNT = 11;

	/**
	 * The meta object id for the '{@link security_dsl.impl.OAuth2Impl <em>OAuth2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.OAuth2Impl
	 * @see security_dsl.impl.Security_dslPackageImpl#getOAuth2()
	 * @generated
	 */
	int OAUTH2 = 13;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2__PROVIDERS = SECURITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OAuth2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_FEATURE_COUNT = SECURITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Unique Providers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2___UNIQUE_PROVIDERS__DIAGNOSTICCHAIN_MAP = SECURITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Doesnt Have Role For Oauth</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2___DOESNT_HAVE_ROLE_FOR_OAUTH__DIAGNOSTICCHAIN_MAP = SECURITY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Doesnt Have Auth Controller For Oauth</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2___DOESNT_HAVE_AUTH_CONTROLLER_FOR_OAUTH__DIAGNOSTICCHAIN_MAP = SECURITY_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Doesnt Have User For Oauth</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2___DOESNT_HAVE_USER_FOR_OAUTH__DIAGNOSTICCHAIN_MAP = SECURITY_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>OAuth2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_OPERATION_COUNT = SECURITY_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link security_dsl.impl.BasicAuthenticationImpl <em>Basic Authentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.BasicAuthenticationImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getBasicAuthentication()
	 * @generated
	 */
	int BASIC_AUTHENTICATION = 14;

	/**
	 * The number of structural features of the '<em>Basic Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_AUTHENTICATION_FEATURE_COUNT = SECURITY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Basic Auth No Role Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_AUTHENTICATION___BASIC_AUTH_NO_ROLE_ATTRIBUTES__DIAGNOSTICCHAIN_MAP = SECURITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Basic Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_AUTHENTICATION_OPERATION_COUNT = SECURITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link security_dsl.impl.ProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.ProviderImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getProvider()
	 * @generated
	 */
	int PROVIDER = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Client Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__CLIENT_ID = 1;

	/**
	 * The feature id for the '<em><b>Client Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__CLIENT_SECRET = 2;

	/**
	 * The feature id for the '<em><b>Redirect Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__REDIRECT_URI = 3;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link security_dsl.EDatabaseType <em>EDatabase Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.EDatabaseType
	 * @see security_dsl.impl.Security_dslPackageImpl#getEDatabaseType()
	 * @generated
	 */
	int EDATABASE_TYPE = 16;

	/**
	 * The meta object id for the '{@link security_dsl.EType <em>EType</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.EType
	 * @see security_dsl.impl.Security_dslPackageImpl#getEType()
	 * @generated
	 */
	int ETYPE = 17;

	/**
	 * The meta object id for the '{@link security_dsl.EEndpointMethod <em>EEndpoint Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.EEndpointMethod
	 * @see security_dsl.impl.Security_dslPackageImpl#getEEndpointMethod()
	 * @generated
	 */
	int EENDPOINT_METHOD = 18;

	/**
	 * The meta object id for the '{@link security_dsl.EEndpointType <em>EEndpoint Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.EEndpointType
	 * @see security_dsl.impl.Security_dslPackageImpl#getEEndpointType()
	 * @generated
	 */
	int EENDPOINT_TYPE = 19;

	/**
	 * The meta object id for the '{@link security_dsl.EClaimType <em>EClaim Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.EClaimType
	 * @see security_dsl.impl.Security_dslPackageImpl#getEClaimType()
	 * @generated
	 */
	int ECLAIM_TYPE = 20;

	/**
	 * Returns the meta object for class '{@link security_dsl.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see security_dsl.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the containment reference '{@link security_dsl.Application#getApp_database <em>App database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>App database</em>'.
	 * @see security_dsl.Application#getApp_database()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_App_database();

	/**
	 * Returns the meta object for the containment reference list '{@link security_dsl.Application#getApp_entities <em>App entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>App entities</em>'.
	 * @see security_dsl.Application#getApp_entities()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_App_entities();

	/**
	 * Returns the meta object for the containment reference list '{@link security_dsl.Application#getApp_controllers <em>App controllers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>App controllers</em>'.
	 * @see security_dsl.Application#getApp_controllers()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_App_controllers();

	/**
	 * Returns the meta object for the containment reference '{@link security_dsl.Application#getApp_security <em>App security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>App security</em>'.
	 * @see security_dsl.Application#getApp_security()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_App_security();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Application#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact</em>'.
	 * @see security_dsl.Application#getArtifact()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Artifact();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Application#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see security_dsl.Application#getGroup()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Group();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Application#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see security_dsl.Application#getName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Name();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Application#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see security_dsl.Application#getPackageName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_PackageName();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Application#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see security_dsl.Application#getDescription()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Description();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Application#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see security_dsl.Application#getPort()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Port();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Application#getHostname <em>Hostname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hostname</em>'.
	 * @see security_dsl.Application#getHostname()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Hostname();

	/**
	 * Returns the meta object for the '{@link security_dsl.Application#validRegisteredPort(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Registered Port</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Registered Port</em>' operation.
	 * @see security_dsl.Application#validRegisteredPort(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getApplication__ValidRegisteredPort__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Application#hasDatabaseForEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Database For Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Database For Entity</em>' operation.
	 * @see security_dsl.Application#hasDatabaseForEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getApplication__HasDatabaseForEntity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link security_dsl.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see security_dsl.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link security_dsl.Entity#getEntity_attributes <em>Entity attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity attributes</em>'.
	 * @see security_dsl.Entity#getEntity_attributes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Entity_attributes();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Entity#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see security_dsl.Entity#getTableName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_TableName();

	/**
	 * Returns the meta object for the '{@link security_dsl.Entity#uniqueTableName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Table Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Table Name</em>' operation.
	 * @see security_dsl.Entity#uniqueTableName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEntity__UniqueTableName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Entity#uniqueCollumnName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Collumn Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Collumn Name</em>' operation.
	 * @see security_dsl.Entity#uniqueCollumnName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEntity__UniqueCollumnName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Entity#otherEntitiesDoesntHaveCredential(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Other Entities Doesnt Have Credential</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Other Entities Doesnt Have Credential</em>' operation.
	 * @see security_dsl.Entity#otherEntitiesDoesntHaveCredential(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEntity__OtherEntitiesDoesntHaveCredential__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Entity#uniqueAttributeName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Attribute Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Attribute Name</em>' operation.
	 * @see security_dsl.Entity#uniqueAttributeName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEntity__UniqueAttributeName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Entity#onlyOneIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Only One Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Only One Identifier</em>' operation.
	 * @see security_dsl.Entity#onlyOneIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEntity__OnlyOneIdentifier__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link security_dsl.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see security_dsl.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Controller#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see security_dsl.Controller#getName()
	 * @see #getController()
	 * @generated
	 */
	EAttribute getController_Name();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Controller#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see security_dsl.Controller#getPath()
	 * @see #getController()
	 * @generated
	 */
	EAttribute getController_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link security_dsl.Controller#getController_endpoints <em>Controller endpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controller endpoints</em>'.
	 * @see security_dsl.Controller#getController_endpoints()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Controller_endpoints();

	/**
	 * Returns the meta object for the '{@link security_dsl.Controller#controllerPath(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Controller Path</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Controller Path</em>' operation.
	 * @see security_dsl.Controller#controllerPath(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getController__ControllerPath__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Controller#controllerNotNamedUserRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Controller Not Named User Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Controller Not Named User Role</em>' operation.
	 * @see security_dsl.Controller#controllerNotNamedUserRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getController__ControllerNotNamedUserRole__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Controller#endpointLimits(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Endpoint Limits</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Endpoint Limits</em>' operation.
	 * @see security_dsl.Controller#endpointLimits(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getController__EndpointLimits__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Controller#uniqueControllerPath(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Controller Path</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Controller Path</em>' operation.
	 * @see security_dsl.Controller#uniqueControllerPath(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getController__UniqueControllerPath__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Controller#uniqueEndpointURLs(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Endpoint UR Ls</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Endpoint UR Ls</em>' operation.
	 * @see security_dsl.Controller#uniqueEndpointURLs(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getController__UniqueEndpointURLs__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Controller#methodRequiredForOtherType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Method Required For Other Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Method Required For Other Type</em>' operation.
	 * @see security_dsl.Controller#methodRequiredForOtherType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getController__MethodRequiredForOtherType__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Controller#uniqueControllerName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Controller Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Controller Name</em>' operation.
	 * @see security_dsl.Controller#uniqueControllerName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getController__UniqueControllerName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Controller#uniqueEndpointMethodNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Endpoint Method Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Endpoint Method Names</em>' operation.
	 * @see security_dsl.Controller#uniqueEndpointMethodNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getController__UniqueEndpointMethodNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link security_dsl.Security <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security</em>'.
	 * @see security_dsl.Security
	 * @generated
	 */
	EClass getSecurity();

	/**
	 * Returns the meta object for class '{@link security_dsl.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see security_dsl.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Database#getVendorName <em>Vendor Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor Name</em>'.
	 * @see security_dsl.Database#getVendorName()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_VendorName();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Database#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see security_dsl.Database#getUrl()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Url();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Database#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see security_dsl.Database#getUsername()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Username();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Database#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see security_dsl.Database#getPassword()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Password();

	/**
	 * Returns the meta object for class '{@link security_dsl.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see security_dsl.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see security_dsl.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see security_dsl.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Attribute#isIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see security_dsl.Attribute#isIdentifier()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Attribute#isCredential <em>Credential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credential</em>'.
	 * @see security_dsl.Attribute#isCredential()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Credential();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Attribute#getCollumnName <em>Collumn Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collumn Name</em>'.
	 * @see security_dsl.Attribute#getCollumnName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_CollumnName();

	/**
	 * Returns the meta object for class '{@link security_dsl.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see security_dsl.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the containment reference list '{@link security_dsl.Role#getRole_instances <em>Role instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role instances</em>'.
	 * @see security_dsl.Role#getRole_instances()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Role_instances();

	/**
	 * Returns the meta object for the '{@link security_dsl.Role#uniqueRoleEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Role Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Role Entity</em>' operation.
	 * @see security_dsl.Role#uniqueRoleEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRole__UniqueRoleEntity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Role#uniqueRoleInstanceName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Role Instance Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Role Instance Name</em>' operation.
	 * @see security_dsl.Role#uniqueRoleInstanceName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRole__UniqueRoleInstanceName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link security_dsl.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see security_dsl.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the '{@link security_dsl.User#oneStringTypeCredentialForUser(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>One String Type Credential For User</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>One String Type Credential For User</em>' operation.
	 * @see security_dsl.User#oneStringTypeCredentialForUser(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getUser__OneStringTypeCredentialForUser__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.User#uniqueUserEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique User Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique User Entity</em>' operation.
	 * @see security_dsl.User#uniqueUserEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getUser__UniqueUserEntity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.User#noAttributeNamedPassword(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Attribute Named Password</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Attribute Named Password</em>' operation.
	 * @see security_dsl.User#noAttributeNamedPassword(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getUser__NoAttributeNamedPassword__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link security_dsl.RoleInstance <em>Role Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Instance</em>'.
	 * @see security_dsl.RoleInstance
	 * @generated
	 */
	EClass getRoleInstance();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.RoleInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see security_dsl.RoleInstance#getName()
	 * @see #getRoleInstance()
	 * @generated
	 */
	EAttribute getRoleInstance_Name();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.RoleInstance#isClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client</em>'.
	 * @see security_dsl.RoleInstance#isClient()
	 * @see #getRoleInstance()
	 * @generated
	 */
	EAttribute getRoleInstance_Client();

	/**
	 * Returns the meta object for class '{@link security_dsl.Authentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication</em>'.
	 * @see security_dsl.Authentication
	 * @generated
	 */
	EClass getAuthentication();

	/**
	 * Returns the meta object for the '{@link security_dsl.Authentication#authenticationLimits(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Authentication Limits</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Authentication Limits</em>' operation.
	 * @see security_dsl.Authentication#authenticationLimits(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAuthentication__AuthenticationLimits__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Authentication#uniqueAuthenticationController(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Authentication Controller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Authentication Controller</em>' operation.
	 * @see security_dsl.Authentication#uniqueAuthenticationController(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAuthentication__UniqueAuthenticationController__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Authentication#loginExistanceForLogout(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Login Existance For Logout</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Login Existance For Logout</em>' operation.
	 * @see security_dsl.Authentication#loginExistanceForLogout(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAuthentication__LoginExistanceForLogout__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Authentication#hasUserAndRoleForController(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has User And Role For Controller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has User And Role For Controller</em>' operation.
	 * @see security_dsl.Authentication#hasUserAndRoleForController(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAuthentication__HasUserAndRoleForController__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link security_dsl.Endpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endpoint</em>'.
	 * @see security_dsl.Endpoint
	 * @generated
	 */
	EClass getEndpoint();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Endpoint#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see security_dsl.Endpoint#getUrl()
	 * @see #getEndpoint()
	 * @generated
	 */
	EAttribute getEndpoint_Url();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Endpoint#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see security_dsl.Endpoint#getType()
	 * @see #getEndpoint()
	 * @generated
	 */
	EAttribute getEndpoint_Type();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Endpoint#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see security_dsl.Endpoint#getMethodName()
	 * @see #getEndpoint()
	 * @generated
	 */
	EAttribute getEndpoint_MethodName();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Endpoint#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see security_dsl.Endpoint#getMethod()
	 * @see #getEndpoint()
	 * @generated
	 */
	EAttribute getEndpoint_Method();

	/**
	 * Returns the meta object for the reference list '{@link security_dsl.Endpoint#getRole_authorities <em>Role authorities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Role authorities</em>'.
	 * @see security_dsl.Endpoint#getRole_authorities()
	 * @see #getEndpoint()
	 * @generated
	 */
	EReference getEndpoint_Role_authorities();

	/**
	 * Returns the meta object for the '{@link security_dsl.Endpoint#uniqueRoleAuthorities(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Role Authorities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Role Authorities</em>' operation.
	 * @see security_dsl.Endpoint#uniqueRoleAuthorities(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEndpoint__UniqueRoleAuthorities__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Endpoint#urlStartsWithForwardSlash(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Url Starts With Forward Slash</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Url Starts With Forward Slash</em>' operation.
	 * @see security_dsl.Endpoint#urlStartsWithForwardSlash(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEndpoint__UrlStartsWithForwardSlash__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link security_dsl.JWT <em>JWT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JWT</em>'.
	 * @see security_dsl.JWT
	 * @generated
	 */
	EClass getJWT();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.JWT#getSignatureAlgorithm <em>Signature Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature Algorithm</em>'.
	 * @see security_dsl.JWT#getSignatureAlgorithm()
	 * @see #getJWT()
	 * @generated
	 */
	EAttribute getJWT_SignatureAlgorithm();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.JWT#getSecret <em>Secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secret</em>'.
	 * @see security_dsl.JWT#getSecret()
	 * @see #getJWT()
	 * @generated
	 */
	EAttribute getJWT_Secret();

	/**
	 * Returns the meta object for the containment reference list '{@link security_dsl.JWT#getClaims <em>Claims</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Claims</em>'.
	 * @see security_dsl.JWT#getClaims()
	 * @see #getJWT()
	 * @generated
	 */
	EReference getJWT_Claims();

	/**
	 * Returns the meta object for the '{@link security_dsl.JWT#roleHasMaxTwoAttributes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Role Has Max Two Attributes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Role Has Max Two Attributes</em>' operation.
	 * @see security_dsl.JWT#roleHasMaxTwoAttributes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getJWT__RoleHasMaxTwoAttributes__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.JWT#roleHasStringAttribute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Role Has String Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Role Has String Attribute</em>' operation.
	 * @see security_dsl.JWT#roleHasStringAttribute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getJWT__RoleHasStringAttribute__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link security_dsl.Claim <em>Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Claim</em>'.
	 * @see security_dsl.Claim
	 * @generated
	 */
	EClass getClaim();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Claim#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see security_dsl.Claim#getType()
	 * @see #getClaim()
	 * @generated
	 */
	EAttribute getClaim_Type();

	/**
	 * Returns the meta object for the reference '{@link security_dsl.Claim#getClaim_attribute <em>Claim attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Claim attribute</em>'.
	 * @see security_dsl.Claim#getClaim_attribute()
	 * @see #getClaim()
	 * @generated
	 */
	EReference getClaim_Claim_attribute();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Claim#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see security_dsl.Claim#getName()
	 * @see #getClaim()
	 * @generated
	 */
	EAttribute getClaim_Name();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Claim#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see security_dsl.Claim#getValue()
	 * @see #getClaim()
	 * @generated
	 */
	EAttribute getClaim_Value();

	/**
	 * Returns the meta object for the '{@link security_dsl.Claim#uniqueClaimNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Claim Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Claim Names</em>' operation.
	 * @see security_dsl.Claim#uniqueClaimNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getClaim__UniqueClaimNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Claim#otherClaimsNoValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Other Claims No Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Other Claims No Value</em>' operation.
	 * @see security_dsl.Claim#otherClaimsNoValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getClaim__OtherClaimsNoValue__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Claim#issuerRegisteredClaim(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Issuer Registered Claim</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Issuer Registered Claim</em>' operation.
	 * @see security_dsl.Claim#issuerRegisteredClaim(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getClaim__IssuerRegisteredClaim__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Claim#uniqueClaimAttribute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Claim Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Claim Attribute</em>' operation.
	 * @see security_dsl.Claim#uniqueClaimAttribute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getClaim__UniqueClaimAttribute__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Claim#subjectRegisteredClaim(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Subject Registered Claim</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Subject Registered Claim</em>' operation.
	 * @see security_dsl.Claim#subjectRegisteredClaim(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getClaim__SubjectRegisteredClaim__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Claim#audienceValueNotNull(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Audience Value Not Null</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Audience Value Not Null</em>' operation.
	 * @see security_dsl.Claim#audienceValueNotNull(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getClaim__AudienceValueNotNull__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Claim#expirationTimeValueIsPositiveNumeric(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Expiration Time Value Is Positive Numeric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Expiration Time Value Is Positive Numeric</em>' operation.
	 * @see security_dsl.Claim#expirationTimeValueIsPositiveNumeric(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getClaim__ExpirationTimeValueIsPositiveNumeric__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Claim#hasExpirationTimeClaim(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Expiration Time Claim</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Expiration Time Claim</em>' operation.
	 * @see security_dsl.Claim#hasExpirationTimeClaim(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getClaim__HasExpirationTimeClaim__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Claim#hasAudienceClaim(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Audience Claim</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Audience Claim</em>' operation.
	 * @see security_dsl.Claim#hasAudienceClaim(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getClaim__HasAudienceClaim__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Claim#expirationTimeValueNotNull(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Expiration Time Value Not Null</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Expiration Time Value Not Null</em>' operation.
	 * @see security_dsl.Claim#expirationTimeValueNotNull(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getClaim__ExpirationTimeValueNotNull__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Claim#issuerValueNotNull(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Issuer Value Not Null</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Issuer Value Not Null</em>' operation.
	 * @see security_dsl.Claim#issuerValueNotNull(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getClaim__IssuerValueNotNull__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link security_dsl.OAuth2 <em>OAuth2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OAuth2</em>'.
	 * @see security_dsl.OAuth2
	 * @generated
	 */
	EClass getOAuth2();

	/**
	 * Returns the meta object for the containment reference list '{@link security_dsl.OAuth2#getProviders <em>Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Providers</em>'.
	 * @see security_dsl.OAuth2#getProviders()
	 * @see #getOAuth2()
	 * @generated
	 */
	EReference getOAuth2_Providers();

	/**
	 * Returns the meta object for the '{@link security_dsl.OAuth2#uniqueProviders(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Providers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Providers</em>' operation.
	 * @see security_dsl.OAuth2#uniqueProviders(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getOAuth2__UniqueProviders__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.OAuth2#doesntHaveRoleForOauth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Doesnt Have Role For Oauth</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Doesnt Have Role For Oauth</em>' operation.
	 * @see security_dsl.OAuth2#doesntHaveRoleForOauth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getOAuth2__DoesntHaveRoleForOauth__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.OAuth2#doesntHaveAuthControllerForOauth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Doesnt Have Auth Controller For Oauth</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Doesnt Have Auth Controller For Oauth</em>' operation.
	 * @see security_dsl.OAuth2#doesntHaveAuthControllerForOauth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getOAuth2__DoesntHaveAuthControllerForOauth__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.OAuth2#doesntHaveUserForOauth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Doesnt Have User For Oauth</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Doesnt Have User For Oauth</em>' operation.
	 * @see security_dsl.OAuth2#doesntHaveUserForOauth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getOAuth2__DoesntHaveUserForOauth__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link security_dsl.BasicAuthentication <em>Basic Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Authentication</em>'.
	 * @see security_dsl.BasicAuthentication
	 * @generated
	 */
	EClass getBasicAuthentication();

	/**
	 * Returns the meta object for the '{@link security_dsl.BasicAuthentication#basicAuthNoRoleAttributes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Basic Auth No Role Attributes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Basic Auth No Role Attributes</em>' operation.
	 * @see security_dsl.BasicAuthentication#basicAuthNoRoleAttributes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getBasicAuthentication__BasicAuthNoRoleAttributes__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link security_dsl.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see security_dsl.Provider
	 * @generated
	 */
	EClass getProvider();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Provider#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see security_dsl.Provider#getName()
	 * @see #getProvider()
	 * @generated
	 */
	EAttribute getProvider_Name();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Provider#getClientId <em>Client Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Id</em>'.
	 * @see security_dsl.Provider#getClientId()
	 * @see #getProvider()
	 * @generated
	 */
	EAttribute getProvider_ClientId();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Provider#getClientSecret <em>Client Secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Secret</em>'.
	 * @see security_dsl.Provider#getClientSecret()
	 * @see #getProvider()
	 * @generated
	 */
	EAttribute getProvider_ClientSecret();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Provider#getRedirectUri <em>Redirect Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Redirect Uri</em>'.
	 * @see security_dsl.Provider#getRedirectUri()
	 * @see #getProvider()
	 * @generated
	 */
	EAttribute getProvider_RedirectUri();

	/**
	 * Returns the meta object for enum '{@link security_dsl.EDatabaseType <em>EDatabase Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EDatabase Type</em>'.
	 * @see security_dsl.EDatabaseType
	 * @generated
	 */
	EEnum getEDatabaseType();

	/**
	 * Returns the meta object for enum '{@link security_dsl.EType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EType</em>'.
	 * @see security_dsl.EType
	 * @generated
	 */
	EEnum getEType();

	/**
	 * Returns the meta object for enum '{@link security_dsl.EEndpointMethod <em>EEndpoint Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EEndpoint Method</em>'.
	 * @see security_dsl.EEndpointMethod
	 * @generated
	 */
	EEnum getEEndpointMethod();

	/**
	 * Returns the meta object for enum '{@link security_dsl.EEndpointType <em>EEndpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EEndpoint Type</em>'.
	 * @see security_dsl.EEndpointType
	 * @generated
	 */
	EEnum getEEndpointType();

	/**
	 * Returns the meta object for enum '{@link security_dsl.EClaimType <em>EClaim Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EClaim Type</em>'.
	 * @see security_dsl.EClaimType
	 * @generated
	 */
	EEnum getEClaimType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Security_dslFactory getSecurity_dslFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link security_dsl.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.impl.ApplicationImpl
		 * @see security_dsl.impl.Security_dslPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>App database</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__APP_DATABASE = eINSTANCE.getApplication_App_database();

		/**
		 * The meta object literal for the '<em><b>App entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__APP_ENTITIES = eINSTANCE.getApplication_App_entities();

		/**
		 * The meta object literal for the '<em><b>App controllers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__APP_CONTROLLERS = eINSTANCE.getApplication_App_controllers();

		/**
		 * The meta object literal for the '<em><b>App security</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__APP_SECURITY = eINSTANCE.getApplication_App_security();

		/**
		 * The meta object literal for the '<em><b>Artifact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__ARTIFACT = eINSTANCE.getApplication_Artifact();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__GROUP = eINSTANCE.getApplication_Group();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

		/**
		 * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__PACKAGE_NAME = eINSTANCE.getApplication_PackageName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__DESCRIPTION = eINSTANCE.getApplication_Description();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__PORT = eINSTANCE.getApplication_Port();

		/**
		 * The meta object literal for the '<em><b>Hostname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__HOSTNAME = eINSTANCE.getApplication_Hostname();

		/**
		 * The meta object literal for the '<em><b>Valid Registered Port</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION___VALID_REGISTERED_PORT__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getApplication__ValidRegisteredPort__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Has Database For Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION___HAS_DATABASE_FOR_ENTITY__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getApplication__HasDatabaseForEntity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link security_dsl.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.impl.EntityImpl
		 * @see security_dsl.impl.Security_dslPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Entity attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ENTITY_ATTRIBUTES = eINSTANCE.getEntity_Entity_attributes();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__TABLE_NAME = eINSTANCE.getEntity_TableName();

		/**
		 * The meta object literal for the '<em><b>Unique Table Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY___UNIQUE_TABLE_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getEntity__UniqueTableName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Collumn Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY___UNIQUE_COLLUMN_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getEntity__UniqueCollumnName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Other Entities Doesnt Have Credential</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY___OTHER_ENTITIES_DOESNT_HAVE_CREDENTIAL__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getEntity__OtherEntitiesDoesntHaveCredential__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Attribute Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY___UNIQUE_ATTRIBUTE_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getEntity__UniqueAttributeName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Only One Identifier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY___ONLY_ONE_IDENTIFIER__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getEntity__OnlyOneIdentifier__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link security_dsl.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.impl.ControllerImpl
		 * @see security_dsl.impl.Security_dslPackageImpl#getController()
		 * @generated
		 */
		EClass CONTROLLER = eINSTANCE.getController();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER__NAME = eINSTANCE.getController_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER__PATH = eINSTANCE.getController_Path();

		/**
		 * The meta object literal for the '<em><b>Controller endpoints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__CONTROLLER_ENDPOINTS = eINSTANCE.getController_Controller_endpoints();

		/**
		 * The meta object literal for the '<em><b>Controller Path</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLLER___CONTROLLER_PATH__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getController__ControllerPath__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Controller Not Named User Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLLER___CONTROLLER_NOT_NAMED_USER_ROLE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getController__ControllerNotNamedUserRole__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Endpoint Limits</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLLER___ENDPOINT_LIMITS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getController__EndpointLimits__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Controller Path</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLLER___UNIQUE_CONTROLLER_PATH__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getController__UniqueControllerPath__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Endpoint UR Ls</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLLER___UNIQUE_ENDPOINT_UR_LS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getController__UniqueEndpointURLs__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Method Required For Other Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLLER___METHOD_REQUIRED_FOR_OTHER_TYPE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getController__MethodRequiredForOtherType__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Controller Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLLER___UNIQUE_CONTROLLER_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getController__UniqueControllerName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Endpoint Method Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLLER___UNIQUE_ENDPOINT_METHOD_NAMES__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getController__UniqueEndpointMethodNames__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link security_dsl.impl.SecurityImpl <em>Security</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.impl.SecurityImpl
		 * @see security_dsl.impl.Security_dslPackageImpl#getSecurity()
		 * @generated
		 */
		EClass SECURITY = eINSTANCE.getSecurity();

		/**
		 * The meta object literal for the '{@link security_dsl.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.impl.DatabaseImpl
		 * @see security_dsl.impl.Security_dslPackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '<em><b>Vendor Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__VENDOR_NAME = eINSTANCE.getDatabase_VendorName();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__URL = eINSTANCE.getDatabase_Url();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__USERNAME = eINSTANCE.getDatabase_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__PASSWORD = eINSTANCE.getDatabase_Password();

		/**
		 * The meta object literal for the '{@link security_dsl.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.impl.AttributeImpl
		 * @see security_dsl.impl.Security_dslPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IDENTIFIER = eINSTANCE.getAttribute_Identifier();

		/**
		 * The meta object literal for the '<em><b>Credential</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__CREDENTIAL = eINSTANCE.getAttribute_Credential();

		/**
		 * The meta object literal for the '<em><b>Collumn Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__COLLUMN_NAME = eINSTANCE.getAttribute_CollumnName();

		/**
		 * The meta object literal for the '{@link security_dsl.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.impl.RoleImpl
		 * @see security_dsl.impl.Security_dslPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Role instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__ROLE_INSTANCES = eINSTANCE.getRole_Role_instances();

		/**
		 * The meta object literal for the '<em><b>Unique Role Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROLE___UNIQUE_ROLE_ENTITY__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getRole__UniqueRoleEntity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Role Instance Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROLE___UNIQUE_ROLE_INSTANCE_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getRole__UniqueRoleInstanceName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link security_dsl.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.impl.UserImpl
		 * @see security_dsl.impl.Security_dslPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>One String Type Credential For User</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___ONE_STRING_TYPE_CREDENTIAL_FOR_USER__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getUser__OneStringTypeCredentialForUser__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique User Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___UNIQUE_USER_ENTITY__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getUser__UniqueUserEntity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>No Attribute Named Password</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___NO_ATTRIBUTE_NAMED_PASSWORD__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getUser__NoAttributeNamedPassword__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link security_dsl.impl.RoleInstanceImpl <em>Role Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.impl.RoleInstanceImpl
		 * @see security_dsl.impl.Security_dslPackageImpl#getRoleInstance()
		 * @generated
		 */
		EClass ROLE_INSTANCE = eINSTANCE.getRoleInstance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_INSTANCE__NAME = eINSTANCE.getRoleInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_INSTANCE__CLIENT = eINSTANCE.getRoleInstance_Client();

		/**
		 * The meta object literal for the '{@link security_dsl.impl.AuthenticationImpl <em>Authentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.impl.AuthenticationImpl
		 * @see security_dsl.impl.Security_dslPackageImpl#getAuthentication()
		 * @generated
		 */
		EClass AUTHENTICATION = eINSTANCE.getAuthentication();

		/**
		 * The meta object literal for the '<em><b>Authentication Limits</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AUTHENTICATION___AUTHENTICATION_LIMITS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getAuthentication__AuthenticationLimits__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Authentication Controller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AUTHENTICATION___UNIQUE_AUTHENTICATION_CONTROLLER__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getAuthentication__UniqueAuthenticationController__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Login Existance For Logout</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AUTHENTICATION___LOGIN_EXISTANCE_FOR_LOGOUT__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getAuthentication__LoginExistanceForLogout__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Has User And Role For Controller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AUTHENTICATION___HAS_USER_AND_ROLE_FOR_CONTROLLER__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getAuthentication__HasUserAndRoleForController__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link security_dsl.impl.EndpointImpl <em>Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.impl.EndpointImpl
		 * @see security_dsl.impl.Security_dslPackageImpl#getEndpoint()
		 * @generated
		 */
		EClass ENDPOINT = eINSTANCE.getEndpoint();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT__URL = eINSTANCE.getEndpoint_Url();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT__TYPE = eINSTANCE.getEndpoint_Type();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT__METHOD_NAME = eINSTANCE.getEndpoint_MethodName();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT__METHOD = eINSTANCE.getEndpoint_Method();

		/**
		 * The meta object literal for the '<em><b>Role authorities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDPOINT__ROLE_AUTHORITIES = eINSTANCE.getEndpoint_Role_authorities();

		/**
		 * The meta object literal for the '<em><b>Unique Role Authorities</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENDPOINT___UNIQUE_ROLE_AUTHORITIES__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getEndpoint__UniqueRoleAuthorities__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Url Starts With Forward Slash</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENDPOINT___URL_STARTS_WITH_FORWARD_SLASH__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getEndpoint__UrlStartsWithForwardSlash__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link security_dsl.impl.JWTImpl <em>JWT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.impl.JWTImpl
		 * @see security_dsl.impl.Security_dslPackageImpl#getJWT()
		 * @generated
		 */
		EClass JWT = eINSTANCE.getJWT();

		/**
		 * The meta object literal for the '<em><b>Signature Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JWT__SIGNATURE_ALGORITHM = eINSTANCE.getJWT_SignatureAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Secret</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JWT__SECRET = eINSTANCE.getJWT_Secret();

		/**
		 * The meta object literal for the '<em><b>Claims</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JWT__CLAIMS = eINSTANCE.getJWT_Claims();

		/**
		 * The meta object literal for the '<em><b>Role Has Max Two Attributes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JWT___ROLE_HAS_MAX_TWO_ATTRIBUTES__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getJWT__RoleHasMaxTwoAttributes__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Role Has String Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JWT___ROLE_HAS_STRING_ATTRIBUTE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getJWT__RoleHasStringAttribute__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link security_dsl.impl.ClaimImpl <em>Claim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.impl.ClaimImpl
		 * @see security_dsl.impl.Security_dslPackageImpl#getClaim()
		 * @generated
		 */
		EClass CLAIM = eINSTANCE.getClaim();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIM__TYPE = eINSTANCE.getClaim_Type();

		/**
		 * The meta object literal for the '<em><b>Claim attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM__CLAIM_ATTRIBUTE = eINSTANCE.getClaim_Claim_attribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIM__NAME = eINSTANCE.getClaim_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIM__VALUE = eINSTANCE.getClaim_Value();

		/**
		 * The meta object literal for the '<em><b>Unique Claim Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLAIM___UNIQUE_CLAIM_NAMES__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getClaim__UniqueClaimNames__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Other Claims No Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLAIM___OTHER_CLAIMS_NO_VALUE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getClaim__OtherClaimsNoValue__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Issuer Registered Claim</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLAIM___ISSUER_REGISTERED_CLAIM__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getClaim__IssuerRegisteredClaim__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Claim Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLAIM___UNIQUE_CLAIM_ATTRIBUTE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getClaim__UniqueClaimAttribute__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Subject Registered Claim</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLAIM___SUBJECT_REGISTERED_CLAIM__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getClaim__SubjectRegisteredClaim__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Audience Value Not Null</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLAIM___AUDIENCE_VALUE_NOT_NULL__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getClaim__AudienceValueNotNull__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Expiration Time Value Is Positive Numeric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLAIM___EXPIRATION_TIME_VALUE_IS_POSITIVE_NUMERIC__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getClaim__ExpirationTimeValueIsPositiveNumeric__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Has Expiration Time Claim</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLAIM___HAS_EXPIRATION_TIME_CLAIM__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getClaim__HasExpirationTimeClaim__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Has Audience Claim</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLAIM___HAS_AUDIENCE_CLAIM__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getClaim__HasAudienceClaim__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Expiration Time Value Not Null</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLAIM___EXPIRATION_TIME_VALUE_NOT_NULL__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getClaim__ExpirationTimeValueNotNull__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Issuer Value Not Null</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLAIM___ISSUER_VALUE_NOT_NULL__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getClaim__IssuerValueNotNull__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link security_dsl.impl.OAuth2Impl <em>OAuth2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.impl.OAuth2Impl
		 * @see security_dsl.impl.Security_dslPackageImpl#getOAuth2()
		 * @generated
		 */
		EClass OAUTH2 = eINSTANCE.getOAuth2();

		/**
		 * The meta object literal for the '<em><b>Providers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OAUTH2__PROVIDERS = eINSTANCE.getOAuth2_Providers();

		/**
		 * The meta object literal for the '<em><b>Unique Providers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OAUTH2___UNIQUE_PROVIDERS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getOAuth2__UniqueProviders__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Doesnt Have Role For Oauth</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OAUTH2___DOESNT_HAVE_ROLE_FOR_OAUTH__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getOAuth2__DoesntHaveRoleForOauth__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Doesnt Have Auth Controller For Oauth</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OAUTH2___DOESNT_HAVE_AUTH_CONTROLLER_FOR_OAUTH__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getOAuth2__DoesntHaveAuthControllerForOauth__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Doesnt Have User For Oauth</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OAUTH2___DOESNT_HAVE_USER_FOR_OAUTH__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getOAuth2__DoesntHaveUserForOauth__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link security_dsl.impl.BasicAuthenticationImpl <em>Basic Authentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.impl.BasicAuthenticationImpl
		 * @see security_dsl.impl.Security_dslPackageImpl#getBasicAuthentication()
		 * @generated
		 */
		EClass BASIC_AUTHENTICATION = eINSTANCE.getBasicAuthentication();

		/**
		 * The meta object literal for the '<em><b>Basic Auth No Role Attributes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BASIC_AUTHENTICATION___BASIC_AUTH_NO_ROLE_ATTRIBUTES__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getBasicAuthentication__BasicAuthNoRoleAttributes__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link security_dsl.impl.ProviderImpl <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.impl.ProviderImpl
		 * @see security_dsl.impl.Security_dslPackageImpl#getProvider()
		 * @generated
		 */
		EClass PROVIDER = eINSTANCE.getProvider();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDER__NAME = eINSTANCE.getProvider_Name();

		/**
		 * The meta object literal for the '<em><b>Client Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDER__CLIENT_ID = eINSTANCE.getProvider_ClientId();

		/**
		 * The meta object literal for the '<em><b>Client Secret</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDER__CLIENT_SECRET = eINSTANCE.getProvider_ClientSecret();

		/**
		 * The meta object literal for the '<em><b>Redirect Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDER__REDIRECT_URI = eINSTANCE.getProvider_RedirectUri();

		/**
		 * The meta object literal for the '{@link security_dsl.EDatabaseType <em>EDatabase Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.EDatabaseType
		 * @see security_dsl.impl.Security_dslPackageImpl#getEDatabaseType()
		 * @generated
		 */
		EEnum EDATABASE_TYPE = eINSTANCE.getEDatabaseType();

		/**
		 * The meta object literal for the '{@link security_dsl.EType <em>EType</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.EType
		 * @see security_dsl.impl.Security_dslPackageImpl#getEType()
		 * @generated
		 */
		EEnum ETYPE = eINSTANCE.getEType();

		/**
		 * The meta object literal for the '{@link security_dsl.EEndpointMethod <em>EEndpoint Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.EEndpointMethod
		 * @see security_dsl.impl.Security_dslPackageImpl#getEEndpointMethod()
		 * @generated
		 */
		EEnum EENDPOINT_METHOD = eINSTANCE.getEEndpointMethod();

		/**
		 * The meta object literal for the '{@link security_dsl.EEndpointType <em>EEndpoint Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.EEndpointType
		 * @see security_dsl.impl.Security_dslPackageImpl#getEEndpointType()
		 * @generated
		 */
		EEnum EENDPOINT_TYPE = eINSTANCE.getEEndpointType();

		/**
		 * The meta object literal for the '{@link security_dsl.EClaimType <em>EClaim Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.EClaimType
		 * @see security_dsl.impl.Security_dslPackageImpl#getEClaimType()
		 * @generated
		 */
		EEnum ECLAIM_TYPE = eINSTANCE.getEClaimType();

	}

} //Security_dslPackage
