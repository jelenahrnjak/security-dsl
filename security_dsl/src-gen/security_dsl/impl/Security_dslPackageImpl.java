/**
 */
package security_dsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import security_dsl.Application;
import security_dsl.Attribute;
import security_dsl.Authentication;
import security_dsl.BasicAuthentication;
import security_dsl.Claim;
import security_dsl.Controller;
import security_dsl.Database;
import security_dsl.EClaimType;
import security_dsl.EDatabaseType;
import security_dsl.EEndpointMethod;
import security_dsl.EEndpointType;
import security_dsl.EOAuthProvider;
import security_dsl.EType;
import security_dsl.Endpoint;
import security_dsl.Entity;
import security_dsl.OAuth2;
import security_dsl.Provider;
import security_dsl.Role;
import security_dsl.RoleInstance;
import security_dsl.Security;
import security_dsl.Security_dslFactory;
import security_dsl.Security_dslPackage;
import security_dsl.User;

import security_dsl.util.Security_dslValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Security_dslPackageImpl extends EPackageImpl implements Security_dslPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jwtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oAuth2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicAuthenticationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eDatabaseTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eEndpointMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eEndpointTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eClaimTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eoAuthProviderEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see security_dsl.Security_dslPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Security_dslPackageImpl() {
		super(eNS_URI, Security_dslFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Security_dslPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Security_dslPackage init() {
		if (isInited)
			return (Security_dslPackage) EPackage.Registry.INSTANCE.getEPackage(Security_dslPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSecurity_dslPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Security_dslPackageImpl theSecurity_dslPackage = registeredSecurity_dslPackage instanceof Security_dslPackageImpl
				? (Security_dslPackageImpl) registeredSecurity_dslPackage
				: new Security_dslPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSecurity_dslPackage.createPackageContents();

		// Initialize created meta-data
		theSecurity_dslPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theSecurity_dslPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return Security_dslValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theSecurity_dslPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Security_dslPackage.eNS_URI, theSecurity_dslPackage);
		return theSecurity_dslPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplication() {
		return applicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_App_database() {
		return (EReference) applicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_App_entities() {
		return (EReference) applicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_App_controllers() {
		return (EReference) applicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_App_security() {
		return (EReference) applicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_Artifact() {
		return (EAttribute) applicationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_Group() {
		return (EAttribute) applicationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_Name() {
		return (EAttribute) applicationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_PackageName() {
		return (EAttribute) applicationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_Description() {
		return (EAttribute) applicationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_Port() {
		return (EAttribute) applicationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_Hostname() {
		return (EAttribute) applicationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplication__ValidRegisteredPort__DiagnosticChain_Map() {
		return applicationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplication__HasDatabaseForEntity__DiagnosticChain_Map() {
		return applicationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Entity_attributes() {
		return (EReference) entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_TableName() {
		return (EAttribute) entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntity__UniqueTableName__DiagnosticChain_Map() {
		return entityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntity__UniqueCollumnName__DiagnosticChain_Map() {
		return entityEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntity__OtherEntitiesDoesntHaveCredential__DiagnosticChain_Map() {
		return entityEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntity__UniqueAttributeName__DiagnosticChain_Map() {
		return entityEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntity__OnlyOneIdentifier__DiagnosticChain_Map() {
		return entityEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getController() {
		return controllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getController_Name() {
		return (EAttribute) controllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getController_Path() {
		return (EAttribute) controllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getController_Controller_endpoints() {
		return (EReference) controllerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getController__ControllerPath__DiagnosticChain_Map() {
		return controllerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getController__ControllerNotNamedUserRole__DiagnosticChain_Map() {
		return controllerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getController__EndpointLimits__DiagnosticChain_Map() {
		return controllerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getController__UniqueControllerPath__DiagnosticChain_Map() {
		return controllerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getController__UniqueEndpointURLs__DiagnosticChain_Map() {
		return controllerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getController__MethodRequiredForOtherType__DiagnosticChain_Map() {
		return controllerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getController__UniqueControllerName__DiagnosticChain_Map() {
		return controllerEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getController__UniqueEndpointMethodNames__DiagnosticChain_Map() {
		return controllerEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurity() {
		return securityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabase() {
		return databaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_VendorName() {
		return (EAttribute) databaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_Url() {
		return (EAttribute) databaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_Username() {
		return (EAttribute) databaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_Password() {
		return (EAttribute) databaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Name() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Type() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Identifier() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Credential() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_CollumnName() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Role_instances() {
		return (EReference) roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRole__UniqueRoleEntity__DiagnosticChain_Map() {
		return roleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRole__UniqueRoleInstanceName__DiagnosticChain_Map() {
		return roleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUser__OneStringTypeCredentialForUser__DiagnosticChain_Map() {
		return userEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUser__UniqueUserEntity__DiagnosticChain_Map() {
		return userEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUser__NoAttributeNamedPassword__DiagnosticChain_Map() {
		return userEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleInstance() {
		return roleInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleInstance_Name() {
		return (EAttribute) roleInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleInstance_Client() {
		return (EAttribute) roleInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthentication() {
		return authenticationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAuthentication__AuthenticationLimits__DiagnosticChain_Map() {
		return authenticationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAuthentication__UniqueAuthenticationController__DiagnosticChain_Map() {
		return authenticationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAuthentication__LoginExistanceForLogout__DiagnosticChain_Map() {
		return authenticationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAuthentication__HasUserAndRoleForController__DiagnosticChain_Map() {
		return authenticationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndpoint() {
		return endpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpoint_Url() {
		return (EAttribute) endpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpoint_Type() {
		return (EAttribute) endpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpoint_MethodName() {
		return (EAttribute) endpointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpoint_Method() {
		return (EAttribute) endpointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndpoint_Role_authorities() {
		return (EReference) endpointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndpoint__UniqueRoleAuthorities__DiagnosticChain_Map() {
		return endpointEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndpoint__UrlStartsWithForwardSlash__DiagnosticChain_Map() {
		return endpointEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJWT() {
		return jwtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJWT_SignatureAlgorithm() {
		return (EAttribute) jwtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJWT_Secret() {
		return (EAttribute) jwtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJWT_Claims() {
		return (EReference) jwtEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJWT__RoleHasMaxTwoAttributes__DiagnosticChain_Map() {
		return jwtEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJWT__RoleHasStringAttribute__DiagnosticChain_Map() {
		return jwtEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaim() {
		return claimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClaim_Type() {
		return (EAttribute) claimEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Claim_attribute() {
		return (EReference) claimEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClaim_Name() {
		return (EAttribute) claimEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClaim_Value() {
		return (EAttribute) claimEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClaim__UniqueClaimNames__DiagnosticChain_Map() {
		return claimEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClaim__OtherClaimsNoValue__DiagnosticChain_Map() {
		return claimEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClaim__IssuerRegisteredClaim__DiagnosticChain_Map() {
		return claimEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClaim__UniqueClaimAttribute__DiagnosticChain_Map() {
		return claimEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClaim__SubjectRegisteredClaim__DiagnosticChain_Map() {
		return claimEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClaim__AudienceValueNotNull__DiagnosticChain_Map() {
		return claimEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClaim__ExpirationTimeValueIsPositiveNumeric__DiagnosticChain_Map() {
		return claimEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClaim__HasExpirationTimeClaim__DiagnosticChain_Map() {
		return claimEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClaim__HasAudienceClaim__DiagnosticChain_Map() {
		return claimEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClaim__ExpirationTimeValueNotNull__DiagnosticChain_Map() {
		return claimEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClaim__IssuerValueNotNull__DiagnosticChain_Map() {
		return claimEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOAuth2() {
		return oAuth2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOAuth2_Providers() {
		return (EReference) oAuth2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOAuth2__UniqueProviders__DiagnosticChain_Map() {
		return oAuth2EClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOAuth2__DoesntHaveRoleForOauth__DiagnosticChain_Map() {
		return oAuth2EClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOAuth2__DoesntHaveAuthControllerForOauth__DiagnosticChain_Map() {
		return oAuth2EClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOAuth2__DoesntHaveUserForOauth__DiagnosticChain_Map() {
		return oAuth2EClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicAuthentication() {
		return basicAuthenticationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBasicAuthentication__BasicAuthNoRoleAttributes__DiagnosticChain_Map() {
		return basicAuthenticationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvider() {
		return providerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvider_Name() {
		return (EAttribute) providerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvider_ClientId() {
		return (EAttribute) providerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvider_ClientSecret() {
		return (EAttribute) providerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvider_RedirectUri() {
		return (EAttribute) providerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEDatabaseType() {
		return eDatabaseTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEType() {
		return eTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEEndpointMethod() {
		return eEndpointMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEEndpointType() {
		return eEndpointTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEClaimType() {
		return eClaimTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEOAuthProvider() {
		return eoAuthProviderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Security_dslFactory getSecurity_dslFactory() {
		return (Security_dslFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		applicationEClass = createEClass(APPLICATION);
		createEReference(applicationEClass, APPLICATION__APP_DATABASE);
		createEReference(applicationEClass, APPLICATION__APP_ENTITIES);
		createEReference(applicationEClass, APPLICATION__APP_CONTROLLERS);
		createEReference(applicationEClass, APPLICATION__APP_SECURITY);
		createEAttribute(applicationEClass, APPLICATION__ARTIFACT);
		createEAttribute(applicationEClass, APPLICATION__GROUP);
		createEAttribute(applicationEClass, APPLICATION__NAME);
		createEAttribute(applicationEClass, APPLICATION__PACKAGE_NAME);
		createEAttribute(applicationEClass, APPLICATION__DESCRIPTION);
		createEAttribute(applicationEClass, APPLICATION__PORT);
		createEAttribute(applicationEClass, APPLICATION__HOSTNAME);
		createEOperation(applicationEClass, APPLICATION___VALID_REGISTERED_PORT__DIAGNOSTICCHAIN_MAP);
		createEOperation(applicationEClass, APPLICATION___HAS_DATABASE_FOR_ENTITY__DIAGNOSTICCHAIN_MAP);

		entityEClass = createEClass(ENTITY);
		createEReference(entityEClass, ENTITY__ENTITY_ATTRIBUTES);
		createEAttribute(entityEClass, ENTITY__TABLE_NAME);
		createEOperation(entityEClass, ENTITY___UNIQUE_TABLE_NAME__DIAGNOSTICCHAIN_MAP);
		createEOperation(entityEClass, ENTITY___UNIQUE_COLLUMN_NAME__DIAGNOSTICCHAIN_MAP);
		createEOperation(entityEClass, ENTITY___OTHER_ENTITIES_DOESNT_HAVE_CREDENTIAL__DIAGNOSTICCHAIN_MAP);
		createEOperation(entityEClass, ENTITY___UNIQUE_ATTRIBUTE_NAME__DIAGNOSTICCHAIN_MAP);
		createEOperation(entityEClass, ENTITY___ONLY_ONE_IDENTIFIER__DIAGNOSTICCHAIN_MAP);

		controllerEClass = createEClass(CONTROLLER);
		createEAttribute(controllerEClass, CONTROLLER__NAME);
		createEAttribute(controllerEClass, CONTROLLER__PATH);
		createEReference(controllerEClass, CONTROLLER__CONTROLLER_ENDPOINTS);
		createEOperation(controllerEClass, CONTROLLER___CONTROLLER_PATH__DIAGNOSTICCHAIN_MAP);
		createEOperation(controllerEClass, CONTROLLER___CONTROLLER_NOT_NAMED_USER_ROLE__DIAGNOSTICCHAIN_MAP);
		createEOperation(controllerEClass, CONTROLLER___ENDPOINT_LIMITS__DIAGNOSTICCHAIN_MAP);
		createEOperation(controllerEClass, CONTROLLER___UNIQUE_CONTROLLER_PATH__DIAGNOSTICCHAIN_MAP);
		createEOperation(controllerEClass, CONTROLLER___UNIQUE_ENDPOINT_UR_LS__DIAGNOSTICCHAIN_MAP);
		createEOperation(controllerEClass, CONTROLLER___METHOD_REQUIRED_FOR_OTHER_TYPE__DIAGNOSTICCHAIN_MAP);
		createEOperation(controllerEClass, CONTROLLER___UNIQUE_CONTROLLER_NAME__DIAGNOSTICCHAIN_MAP);
		createEOperation(controllerEClass, CONTROLLER___UNIQUE_ENDPOINT_METHOD_NAMES__DIAGNOSTICCHAIN_MAP);

		securityEClass = createEClass(SECURITY);

		databaseEClass = createEClass(DATABASE);
		createEAttribute(databaseEClass, DATABASE__VENDOR_NAME);
		createEAttribute(databaseEClass, DATABASE__URL);
		createEAttribute(databaseEClass, DATABASE__USERNAME);
		createEAttribute(databaseEClass, DATABASE__PASSWORD);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__NAME);
		createEAttribute(attributeEClass, ATTRIBUTE__TYPE);
		createEAttribute(attributeEClass, ATTRIBUTE__IDENTIFIER);
		createEAttribute(attributeEClass, ATTRIBUTE__CREDENTIAL);
		createEAttribute(attributeEClass, ATTRIBUTE__COLLUMN_NAME);

		roleEClass = createEClass(ROLE);
		createEReference(roleEClass, ROLE__ROLE_INSTANCES);
		createEOperation(roleEClass, ROLE___UNIQUE_ROLE_ENTITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(roleEClass, ROLE___UNIQUE_ROLE_INSTANCE_NAME__DIAGNOSTICCHAIN_MAP);

		userEClass = createEClass(USER);
		createEOperation(userEClass, USER___ONE_STRING_TYPE_CREDENTIAL_FOR_USER__DIAGNOSTICCHAIN_MAP);
		createEOperation(userEClass, USER___UNIQUE_USER_ENTITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(userEClass, USER___NO_ATTRIBUTE_NAMED_PASSWORD__DIAGNOSTICCHAIN_MAP);

		roleInstanceEClass = createEClass(ROLE_INSTANCE);
		createEAttribute(roleInstanceEClass, ROLE_INSTANCE__NAME);
		createEAttribute(roleInstanceEClass, ROLE_INSTANCE__CLIENT);

		authenticationEClass = createEClass(AUTHENTICATION);
		createEOperation(authenticationEClass, AUTHENTICATION___AUTHENTICATION_LIMITS__DIAGNOSTICCHAIN_MAP);
		createEOperation(authenticationEClass, AUTHENTICATION___UNIQUE_AUTHENTICATION_CONTROLLER__DIAGNOSTICCHAIN_MAP);
		createEOperation(authenticationEClass, AUTHENTICATION___LOGIN_EXISTANCE_FOR_LOGOUT__DIAGNOSTICCHAIN_MAP);
		createEOperation(authenticationEClass, AUTHENTICATION___HAS_USER_AND_ROLE_FOR_CONTROLLER__DIAGNOSTICCHAIN_MAP);

		endpointEClass = createEClass(ENDPOINT);
		createEAttribute(endpointEClass, ENDPOINT__URL);
		createEAttribute(endpointEClass, ENDPOINT__TYPE);
		createEAttribute(endpointEClass, ENDPOINT__METHOD_NAME);
		createEAttribute(endpointEClass, ENDPOINT__METHOD);
		createEReference(endpointEClass, ENDPOINT__ROLE_AUTHORITIES);
		createEOperation(endpointEClass, ENDPOINT___UNIQUE_ROLE_AUTHORITIES__DIAGNOSTICCHAIN_MAP);
		createEOperation(endpointEClass, ENDPOINT___URL_STARTS_WITH_FORWARD_SLASH__DIAGNOSTICCHAIN_MAP);

		jwtEClass = createEClass(JWT);
		createEAttribute(jwtEClass, JWT__SIGNATURE_ALGORITHM);
		createEAttribute(jwtEClass, JWT__SECRET);
		createEReference(jwtEClass, JWT__CLAIMS);
		createEOperation(jwtEClass, JWT___ROLE_HAS_MAX_TWO_ATTRIBUTES__DIAGNOSTICCHAIN_MAP);
		createEOperation(jwtEClass, JWT___ROLE_HAS_STRING_ATTRIBUTE__DIAGNOSTICCHAIN_MAP);

		claimEClass = createEClass(CLAIM);
		createEAttribute(claimEClass, CLAIM__TYPE);
		createEReference(claimEClass, CLAIM__CLAIM_ATTRIBUTE);
		createEAttribute(claimEClass, CLAIM__NAME);
		createEAttribute(claimEClass, CLAIM__VALUE);
		createEOperation(claimEClass, CLAIM___UNIQUE_CLAIM_NAMES__DIAGNOSTICCHAIN_MAP);
		createEOperation(claimEClass, CLAIM___OTHER_CLAIMS_NO_VALUE__DIAGNOSTICCHAIN_MAP);
		createEOperation(claimEClass, CLAIM___ISSUER_REGISTERED_CLAIM__DIAGNOSTICCHAIN_MAP);
		createEOperation(claimEClass, CLAIM___UNIQUE_CLAIM_ATTRIBUTE__DIAGNOSTICCHAIN_MAP);
		createEOperation(claimEClass, CLAIM___SUBJECT_REGISTERED_CLAIM__DIAGNOSTICCHAIN_MAP);
		createEOperation(claimEClass, CLAIM___AUDIENCE_VALUE_NOT_NULL__DIAGNOSTICCHAIN_MAP);
		createEOperation(claimEClass, CLAIM___EXPIRATION_TIME_VALUE_IS_POSITIVE_NUMERIC__DIAGNOSTICCHAIN_MAP);
		createEOperation(claimEClass, CLAIM___HAS_EXPIRATION_TIME_CLAIM__DIAGNOSTICCHAIN_MAP);
		createEOperation(claimEClass, CLAIM___HAS_AUDIENCE_CLAIM__DIAGNOSTICCHAIN_MAP);
		createEOperation(claimEClass, CLAIM___EXPIRATION_TIME_VALUE_NOT_NULL__DIAGNOSTICCHAIN_MAP);
		createEOperation(claimEClass, CLAIM___ISSUER_VALUE_NOT_NULL__DIAGNOSTICCHAIN_MAP);

		oAuth2EClass = createEClass(OAUTH2);
		createEReference(oAuth2EClass, OAUTH2__PROVIDERS);
		createEOperation(oAuth2EClass, OAUTH2___UNIQUE_PROVIDERS__DIAGNOSTICCHAIN_MAP);
		createEOperation(oAuth2EClass, OAUTH2___DOESNT_HAVE_ROLE_FOR_OAUTH__DIAGNOSTICCHAIN_MAP);
		createEOperation(oAuth2EClass, OAUTH2___DOESNT_HAVE_AUTH_CONTROLLER_FOR_OAUTH__DIAGNOSTICCHAIN_MAP);
		createEOperation(oAuth2EClass, OAUTH2___DOESNT_HAVE_USER_FOR_OAUTH__DIAGNOSTICCHAIN_MAP);

		basicAuthenticationEClass = createEClass(BASIC_AUTHENTICATION);
		createEOperation(basicAuthenticationEClass,
				BASIC_AUTHENTICATION___BASIC_AUTH_NO_ROLE_ATTRIBUTES__DIAGNOSTICCHAIN_MAP);

		providerEClass = createEClass(PROVIDER);
		createEAttribute(providerEClass, PROVIDER__NAME);
		createEAttribute(providerEClass, PROVIDER__CLIENT_ID);
		createEAttribute(providerEClass, PROVIDER__CLIENT_SECRET);
		createEAttribute(providerEClass, PROVIDER__REDIRECT_URI);

		// Create enums
		eDatabaseTypeEEnum = createEEnum(EDATABASE_TYPE);
		eTypeEEnum = createEEnum(ETYPE);
		eEndpointMethodEEnum = createEEnum(EENDPOINT_METHOD);
		eEndpointTypeEEnum = createEEnum(EENDPOINT_TYPE);
		eClaimTypeEEnum = createEEnum(ECLAIM_TYPE);
		eoAuthProviderEEnum = createEEnum(EO_AUTH_PROVIDER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		roleEClass.getESuperTypes().add(this.getEntity());
		userEClass.getESuperTypes().add(this.getEntity());
		authenticationEClass.getESuperTypes().add(this.getController());
		jwtEClass.getESuperTypes().add(this.getSecurity());
		oAuth2EClass.getESuperTypes().add(this.getSecurity());
		basicAuthenticationEClass.getESuperTypes().add(this.getSecurity());

		// Initialize classes, features, and operations; add parameters
		initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplication_App_database(), this.getDatabase(), null, "app_database", null, 0, 1,
				Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_App_entities(), this.getEntity(), null, "app_entities", null, 0, -1,
				Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_App_controllers(), this.getController(), null, "app_controllers", null, 0, -1,
				Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_App_security(), this.getSecurity(), null, "app_security", null, 0, 1,
				Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_Artifact(), ecorePackage.getEString(), "artifact", null, 1, 1, Application.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_Group(), ecorePackage.getEString(), "group", null, 1, 1, Application.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_Name(), ecorePackage.getEString(), "name", null, 0, 1, Application.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_PackageName(), ecorePackage.getEString(), "packageName", null, 0, 1,
				Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_Description(), ecorePackage.getEString(), "description",
				"Security dsl generated application", 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_Port(), ecorePackage.getELongObject(), "port", "8080", 0, 1, Application.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_Hostname(), ecorePackage.getEString(), "hostname", "localhost", 0, 1,
				Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getApplication__ValidRegisteredPort__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "validRegisteredPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApplication__HasDatabaseForEntity__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"hasDatabaseForEntity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntity_Entity_attributes(), this.getAttribute(), null, "entity_attributes", null, 0, -1,
				Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_TableName(), ecorePackage.getEString(), "tableName", null, 0, 1, Entity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getEntity__UniqueTableName__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"uniqueTableName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEntity__UniqueCollumnName__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"uniqueCollumnName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEntity__OtherEntitiesDoesntHaveCredential__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "otherEntitiesDoesntHaveCredential", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEntity__UniqueAttributeName__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"uniqueAttributeName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEntity__OnlyOneIdentifier__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"onlyOneIdentifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(controllerEClass, Controller.class, "Controller", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getController_Name(), ecorePackage.getEString(), "name", null, 1, 1, Controller.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getController_Path(), ecorePackage.getEString(), "path", null, 1, 1, Controller.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getController_Controller_endpoints(), this.getEndpoint(), null, "controller_endpoints", null, 0,
				-1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getController__ControllerPath__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"controllerPath", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getController__ControllerNotNamedUserRole__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "controllerNotNamedUserRole", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getController__EndpointLimits__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"endpointLimits", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getController__UniqueControllerPath__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"uniqueControllerPath", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getController__UniqueEndpointURLs__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"uniqueEndpointURLs", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getController__MethodRequiredForOtherType__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "methodRequiredForOtherType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getController__UniqueControllerName__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"uniqueControllerName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getController__UniqueEndpointMethodNames__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"uniqueEndpointMethodNames", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(securityEClass, Security.class, "Security", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(databaseEClass, Database.class, "Database", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabase_VendorName(), this.getEDatabaseType(), "vendorName", null, 1, 1, Database.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabase_Url(), ecorePackage.getEString(), "url", null, 1, 1, Database.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabase_Username(), ecorePackage.getEString(), "username", null, 1, 1, Database.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabase_Password(), ecorePackage.getEString(), "password", null, 1, 1, Database.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 1, 1, Attribute.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Type(), this.getEType(), "type", null, 1, 1, Attribute.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Identifier(), ecorePackage.getEBoolean(), "identifier", null, 1, 1, Attribute.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Credential(), ecorePackage.getEBoolean(), "credential", null, 1, 1, Attribute.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_CollumnName(), ecorePackage.getEString(), "collumnName", null, 0, 1,
				Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Role_instances(), this.getRoleInstance(), null, "role_instances", null, 0, -1,
				Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRole__UniqueRoleEntity__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"uniqueRoleEntity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRole__UniqueRoleInstanceName__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"uniqueRoleInstanceName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getUser__OneStringTypeCredentialForUser__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"oneStringTypeCredentialForUser", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUser__UniqueUserEntity__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"uniqueUserEntity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUser__NoAttributeNamedPassword__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"noAttributeNamedPassword", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(roleInstanceEClass, RoleInstance.class, "RoleInstance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoleInstance_Name(), ecorePackage.getEString(), "name", null, 1, 1, RoleInstance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleInstance_Client(), ecorePackage.getEBoolean(), "client", "false", 1, 1,
				RoleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(authenticationEClass, Authentication.class, "Authentication", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getAuthentication__AuthenticationLimits__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"authenticationLimits", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAuthentication__UniqueAuthenticationController__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "uniqueAuthenticationController", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAuthentication__LoginExistanceForLogout__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "loginExistanceForLogout", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAuthentication__HasUserAndRoleForController__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "hasUserAndRoleForController", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(endpointEClass, Endpoint.class, "Endpoint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEndpoint_Url(), ecorePackage.getEString(), "url", null, 1, 1, Endpoint.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndpoint_Type(), this.getEEndpointType(), "type", "OTHER", 1, 1, Endpoint.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndpoint_MethodName(), ecorePackage.getEString(), "methodName", null, 0, 1, Endpoint.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndpoint_Method(), this.getEEndpointMethod(), "method", null, 0, 1, Endpoint.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndpoint_Role_authorities(), this.getRoleInstance(), null, "role_authorities", null, 0, -1,
				Endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getEndpoint__UniqueRoleAuthorities__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"uniqueRoleAuthorities", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEndpoint__UrlStartsWithForwardSlash__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"urlStartsWithForwardSlash", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(jwtEClass, security_dsl.JWT.class, "JWT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJWT_SignatureAlgorithm(), ecorePackage.getEString(), "signatureAlgorithm", null, 1, 1,
				security_dsl.JWT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getJWT_Secret(), ecorePackage.getEString(), "secret", "somesecret", 0, 1, security_dsl.JWT.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJWT_Claims(), this.getClaim(), null, "claims", null, 0, -1, security_dsl.JWT.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getJWT__RoleHasMaxTwoAttributes__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"roleHasMaxTwoAttributes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getJWT__RoleHasStringAttribute__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"roleHasStringAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(claimEClass, Claim.class, "Claim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClaim_Type(), this.getEClaimType(), "type", null, 1, 1, Claim.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClaim_Claim_attribute(), this.getAttribute(), null, "claim_attribute", null, 0, 1,
				Claim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClaim_Name(), ecorePackage.getEString(), "name", null, 1, 1, Claim.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClaim_Value(), ecorePackage.getEString(), "value", null, 0, 1, Claim.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getClaim__UniqueClaimNames__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"uniqueClaimNames", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getClaim__OtherClaimsNoValue__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"otherClaimsNoValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getClaim__IssuerRegisteredClaim__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"issuerRegisteredClaim", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getClaim__UniqueClaimAttribute__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"uniqueClaimAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getClaim__SubjectRegisteredClaim__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"subjectRegisteredClaim", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getClaim__AudienceValueNotNull__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"audienceValueNotNull", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getClaim__ExpirationTimeValueIsPositiveNumeric__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "expirationTimeValueIsPositiveNumeric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getClaim__HasExpirationTimeClaim__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"hasExpirationTimeClaim", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getClaim__HasAudienceClaim__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"hasAudienceClaim", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getClaim__ExpirationTimeValueNotNull__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"expirationTimeValueNotNull", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getClaim__IssuerValueNotNull__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"issuerValueNotNull", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(oAuth2EClass, OAuth2.class, "OAuth2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOAuth2_Providers(), this.getProvider(), null, "providers", null, 1, -1, OAuth2.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getOAuth2__UniqueProviders__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"uniqueProviders", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOAuth2__DoesntHaveRoleForOauth__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"doesntHaveRoleForOauth", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOAuth2__DoesntHaveAuthControllerForOauth__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "doesntHaveAuthControllerForOauth", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOAuth2__DoesntHaveUserForOauth__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"doesntHaveUserForOauth", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(basicAuthenticationEClass, BasicAuthentication.class, "BasicAuthentication", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getBasicAuthentication__BasicAuthNoRoleAttributes__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "basicAuthNoRoleAttributes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(providerEClass, Provider.class, "Provider", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProvider_Name(), this.getEOAuthProvider(), "name", null, 1, 1, Provider.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProvider_ClientId(), ecorePackage.getEString(), "clientId", null, 1, 1, Provider.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProvider_ClientSecret(), ecorePackage.getEString(), "clientSecret", null, 1, 1,
				Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getProvider_RedirectUri(), ecorePackage.getEString(), "redirectUri", null, 0, 1, Provider.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eDatabaseTypeEEnum, EDatabaseType.class, "EDatabaseType");
		addEEnumLiteral(eDatabaseTypeEEnum, EDatabaseType.POSTGRE_SQL);
		addEEnumLiteral(eDatabaseTypeEEnum, EDatabaseType.ORACLE);
		addEEnumLiteral(eDatabaseTypeEEnum, EDatabaseType.MY_SQL);

		initEEnum(eTypeEEnum, EType.class, "EType");
		addEEnumLiteral(eTypeEEnum, EType.STRING);
		addEEnumLiteral(eTypeEEnum, EType.FLOAT);
		addEEnumLiteral(eTypeEEnum, EType.LONG);
		addEEnumLiteral(eTypeEEnum, EType.INTEGER);
		addEEnumLiteral(eTypeEEnum, EType.DOUBLE);
		addEEnumLiteral(eTypeEEnum, EType.DATE_TIME);
		addEEnumLiteral(eTypeEEnum, EType.DATE);

		initEEnum(eEndpointMethodEEnum, EEndpointMethod.class, "EEndpointMethod");
		addEEnumLiteral(eEndpointMethodEEnum, EEndpointMethod.GET);
		addEEnumLiteral(eEndpointMethodEEnum, EEndpointMethod.POST);
		addEEnumLiteral(eEndpointMethodEEnum, EEndpointMethod.PUT);
		addEEnumLiteral(eEndpointMethodEEnum, EEndpointMethod.DELETE);

		initEEnum(eEndpointTypeEEnum, EEndpointType.class, "EEndpointType");
		addEEnumLiteral(eEndpointTypeEEnum, EEndpointType.REGISTRATION);
		addEEnumLiteral(eEndpointTypeEEnum, EEndpointType.LOGIN);
		addEEnumLiteral(eEndpointTypeEEnum, EEndpointType.LOGOUT);
		addEEnumLiteral(eEndpointTypeEEnum, EEndpointType.OTHER);

		initEEnum(eClaimTypeEEnum, EClaimType.class, "EClaimType");
		addEEnumLiteral(eClaimTypeEEnum, EClaimType.PRIVATE);
		addEEnumLiteral(eClaimTypeEEnum, EClaimType.PUBLIC);
		addEEnumLiteral(eClaimTypeEEnum, EClaimType.REGISTERED);

		initEEnum(eoAuthProviderEEnum, EOAuthProvider.class, "EOAuthProvider");
		addEEnumLiteral(eoAuthProviderEEnum, EOAuthProvider.GOOGLE);
		addEEnumLiteral(eoAuthProviderEEnum, EOAuthProvider.GITHUB);
		addEEnumLiteral(eoAuthProviderEEnum, EOAuthProvider.FACEBOOK);
		addEEnumLiteral(eoAuthProviderEEnum, EOAuthProvider.AZURE);
		addEEnumLiteral(eoAuthProviderEEnum, EOAuthProvider.LINKEDIN);
		addEEnumLiteral(eoAuthProviderEEnum, EOAuthProvider.TWITTER);
		addEEnumLiteral(eoAuthProviderEEnum, EOAuthProvider.INSTAGRAM);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source, new String[] {});
		addAnnotation(applicationEClass, source, new String[] { "constraints", "hasDatabaseForEntity" });
		addAnnotation(entityEClass, source, new String[] { "constraints", "onlyOneIdentifier" });
		addAnnotation(controllerEClass, source, new String[] { "constraints", "uniqueEndpointMethodNames" });
		addAnnotation(roleEClass, source, new String[] { "constraints", "uniqueRoleInstanceName" });
		addAnnotation(userEClass, source, new String[] { "constraints", "noAttributeNamedPassword" });
		addAnnotation(authenticationEClass, source, new String[] { "constraints", "hasUserAndRoleForController" });
		addAnnotation(endpointEClass, source, new String[] { "constraints", "urlStartsWithForwardSlash" });
		addAnnotation(jwtEClass, source, new String[] { "constraints", "roleHasStringAttribute" });
		addAnnotation(claimEClass, source, new String[] { "constraints", "issuerValueNotNull" });
		addAnnotation(oAuth2EClass, source, new String[] { "constraints", "doesntHaveUserForOauth" });
		addAnnotation(basicAuthenticationEClass, source, new String[] { "constraints", "basicAuthNoRoleAttributes" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(getApplication__ValidRegisteredPort__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'Port must be in the valid range of 1024 to 49151!\',\n\tstatus : Boolean = self.port >= 1024 and self.port <= 49151\n}.status" });
		addAnnotation(getApplication__HasDatabaseForEntity__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'An application must have a database defined if it has entities!\',\n\tstatus : Boolean = self.app_entities -> isEmpty() or not self.app_database->isEmpty()\n}.status" });
		addAnnotation(getEntity__UniqueTableName__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'Table names must be unique!\',\n\tstatus : Boolean = \n\t        Entity.allInstances() -> select(e | e.tableName <> null) -> isUnique(e | e.tableName)\n}.status" });
		addAnnotation(getEntity__UniqueCollumnName__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'Column names must be unique if defined!\',\n\tstatus : Boolean = \n\t        self.entity_attributes -> exists(a | a.collumnName <> null) implies self.entity_attributes -> isUnique(a | a.collumnName)\n}.status" });
		addAnnotation(getEntity__OtherEntitiesDoesntHaveCredential__DiagnosticChain_Map(), source, new String[] {
				"body",
				"Tuple {\n\tmessage : String = \'Entities other than User cannot have a credential attribute!\',\n\tstatus : Boolean = \n\t        not self.oclIsTypeOf(User) implies self.entity_attributes -> select(a | a.credential) -> isEmpty()\n}.status" });
		addAnnotation(getEntity__UniqueAttributeName__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'Attribute names within an entity must be unique!\',\n\tstatus : Boolean = \n\t        self.entity_attributes -> isUnique(a | a.name)\n}.status" });
		addAnnotation(getEntity__OnlyOneIdentifier__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'Entity must have exactly one identifier attribute!\',\n\tstatus : Boolean = \n\t        self.entity_attributes -> size() > 0 implies self.entity_attributes -> select(a | a.identifier) -> size() = 1\n}.status" });
		addAnnotation(getController__ControllerPath__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'Controller path should start with \\\'/\\\'!\',\n\tstatus : Boolean = self.path.at(1) = \'/\'\n}.status" });
		addAnnotation(getController__ControllerNotNamedUserRole__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'Controller names cannot be \"User\" or \"Role\"!\',\n\tstatus : Boolean = \n\t        not Controller.allInstances() -> exists(c | c.name.toLower() = \'user\' or c.name.toLower() = \'role\')\n}.status" });
		addAnnotation(getController__EndpointLimits__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'Controllers of type other than \"Authentication\" should not have registration, login, or logout endpoints!\',\n\tstatus : Boolean = \n\t    \tnot self.oclIsTypeOf(Authentication) implies (\n\t\t        self.controller_endpoints -> select(e | e.type = EEndpointType::REGISTRATION) -> isEmpty()\n\t\t        and\n\t\t        self.controller_endpoints -> select(e | e.type = EEndpointType::LOGIN) -> isEmpty()\n\t\t        and\n\t\t        self.controller_endpoints -> select(e | e.type = EEndpointType::LOGOUT) -> isEmpty())\n}.status" });
		addAnnotation(getController__UniqueControllerPath__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'Controller paths should be unique and different from names!\',\n\tstatus : Boolean = \n\t        Controller.allInstances() -> isUnique(c | c.path) and Controller.allInstances() -> forAll(c | \'/\' + c.name.toLower() <> c.path.toLower())\n}.status" });
		addAnnotation(getController__UniqueEndpointURLs__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'Endpoints within a controller must have unique URLs!\',\n\tstatus : Boolean = \n   \t\t \tself.controller_endpoints -> isUnique(e | e.url)\n}.status" });
		addAnnotation(getController__MethodRequiredForOtherType__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'Endpoints of type \"OTHER\" must have a defined method!\',\n\tstatus : Boolean = \n\t        self.controller_endpoints -> select(e | e.type = EEndpointType::OTHER) -> forAll(e | e.method <> null)\n}.status" });
		addAnnotation(getController__UniqueControllerName__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'Controllers should have unique names!\',\n\tstatus : Boolean = Controller.allInstances() -> isUnique(c | c.name)\n}.status" });
		addAnnotation(getController__UniqueEndpointMethodNames__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'Endpoints within a controller must have unique method names!\',\n\tstatus : Boolean = \n   \t\t \tself.controller_endpoints -> isUnique(e | e.methodName)\n}.status" });
		addAnnotation(getRole__UniqueRoleEntity__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'There can be at most one entity of type \"Role\" in the model!\',\n\tstatus : Boolean = \n\t\t    Entity.allInstances() -> select(e | e.oclIsTypeOf(Role)) -> size() <= 1\n}.status" });
		addAnnotation(getRole__UniqueRoleInstanceName__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'Role instance names must be unique!\',\n\tstatus : Boolean = \n\t        self.role_instances -> isUnique(r | r.name)\n}.status" });
		addAnnotation(getUser__OneStringTypeCredentialForUser__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'User entity must have exactly one attribute of type String marked as a credential!\',\n\tstatus : Boolean = \n\t        self.entity_attributes -> select(a | a.credential) -> size() = 1\n\t        and\n\t        self.entity_attributes -> select(a | a.credential) -> forAll(a | a.type = EType::String)\n}.status" });
		addAnnotation(getUser__UniqueUserEntity__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'There can be at most one entity of type \"User\" in the model!\',\n\tstatus : Boolean = \n\t\t    Entity.allInstances() -> select(e | e.oclIsTypeOf(User)) -> size() <= 1\n}.status" });
		addAnnotation(getUser__NoAttributeNamedPassword__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'User entity cannot have an attribute named \"password\"!\',\n\tstatus : Boolean = \n\t        self.entity_attributes -> forAll(a | a.name.toLower() <> \'password\')\n}.status" });
		addAnnotation(getAuthentication__AuthenticationLimits__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'Authentication can have at most one registration, login, and logout endpoint!\',\n\tstatus : Boolean = \n\t        self.controller_endpoints -> select(e | e.type = EEndpointType::REGISTRATION) -> size() <= 1\n\t        and\n\t        self.controller_endpoints -> select(e | e.type = EEndpointType::LOGIN) -> size() <= 1\n\t        and\n\t        self.controller_endpoints -> select(e | e.type = EEndpointType::LOGOUT) -> size() <= 1\n}.status" });
		addAnnotation(getAuthentication__UniqueAuthenticationController__DiagnosticChain_Map(), source, new String[] {
				"body",
				"Tuple {\n\tmessage : String = \'There can be at most one controller of type \"Authentication\" in the model!\',\n\tstatus : Boolean = \n\t    \tController.allInstances() -> select(c | c.oclIsTypeOf(Authentication)) -> size() <= 1\n}.status" });
		addAnnotation(getAuthentication__LoginExistanceForLogout__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'Logout endpoint requires a corresponding login endpoint!\',\n\tstatus : Boolean = \n\t        self.controller_endpoints -> select(e | e.type = EEndpointType::LOGOUT) -> size() = 1 implies\n\t        self.controller_endpoints -> select(e | e.type = EEndpointType::LOGIN) -> size() = 1\n}.status" });
		addAnnotation(getAuthentication__HasUserAndRoleForController__DiagnosticChain_Map(), source, new String[] {
				"body",
				"Tuple {\n\tmessage : String = \'Authentication controller requires at least one User entity and one Role entity!\',\n\tstatus : Boolean = \n\t\t\t(\n\t\t\tEntity.allInstances() -> exists(e | e.oclIsTypeOf(User))\n\t\t\tand\n\t\t\tEntity.allInstances() -> exists(e | e.oclIsTypeOf(Role))\n\t\t\t)\n}.status" });
		addAnnotation(getEndpoint__UniqueRoleAuthorities__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'Role authorities must be unique for each endpoint!\',\n\tstatus : Boolean = \n\t        self.role_authorities -> isUnique(r | r.name)\n}.status" });
		addAnnotation(getEndpoint__UrlStartsWithForwardSlash__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'Endpoint URL should start with a forward slash!\',\n\tstatus : Boolean = \n\t        self.url.at(1) = \'/\'\n}.status" });
		addAnnotation(getJWT__RoleHasMaxTwoAttributes__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'Role entities can have at most two attributes!\',\n\tstatus : Boolean = \n\t\t    Entity.allInstances() -> select(e | e.oclIsTypeOf(Role)) -> forAll(role | role.entity_attributes -> size() <= 2)\n}.status" });
		addAnnotation(getJWT__RoleHasStringAttribute__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'Role entities must have either one identifier attribute of type String or both identifier and non-identifier attributes of type String!\',\n\tstatus : Boolean = \n\t\t    Entity.allInstances() -> select(e | e.oclIsTypeOf(Role)) -> forAll(role |\n\t\t        (role.entity_attributes -> select(a | a.identifier and a.type = EType::_\'String\') -> size() = 1 and role.entity_attributes -> select(a | a.type = EType::_\'String\') -> size() = 1)\n\t\t        or\n\t\t        (role.entity_attributes -> select(a | a.identifier and a.type <> EType::_\'String\') -> size() = 1 and role.entity_attributes -> select(a | a.type = EType::_\'String\') -> size() = 1)\n\t\t    )\n}.status" });
		addAnnotation(getClaim__UniqueClaimNames__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'Claims must have unique names\',\n\tstatus : Boolean = Claim.allInstances() -> isUnique(c | c.name)\n}.status" });
		addAnnotation(getClaim__OtherClaimsNoValue__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'Claim must be linked to an attribute\',\n\tstatus : Boolean = \n\t\t    Claim.allInstances() -> select(c | c.name <> \'issuer\' and c.name <> \'audience\' and c.name <> \'expirationTime\') -> forAll(sc | sc.value = null and sc.claim_attribute <> null)\n}.status" });
		addAnnotation(getClaim__IssuerRegisteredClaim__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'If claim name is \"issuer\", it must be of type REGISTERED\',\n\tstatus : Boolean = \n\t    \tClaim.allInstances() -> select(c | c.name = \'issuer\') -> forAll(sc | sc.type = EClaimType::REGISTERED)\n}.status" });
		addAnnotation(getClaim__UniqueClaimAttribute__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'Claim attributes must be unique!\',\n\tstatus : Boolean = \n\t\tClaim.allInstances() -> select(c | c.claim_attribute <> null) -> isUnique(c | c.claim_attribute)\n}.status" });
		addAnnotation(getClaim__SubjectRegisteredClaim__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'If claim name is \"subject\", it must be of type REGISTERED\',\n\tstatus : Boolean = \n\t    \tClaim.allInstances() -> select(c | c.name = \'subject\') -> forAll(sc | sc.type = EClaimType::REGISTERED)\n}.status" });
		addAnnotation(getClaim__AudienceValueNotNull__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'If the claim name is \"audience\", it must have value and must not be linked to an attribute\',\n\tstatus : Boolean = \n\t\t    Claim.allInstances() -> select(c | c.name = \'audience\') -> forAll(sc | sc.value <> null and sc.claim_attribute = null)\n}.status" });
		addAnnotation(getClaim__ExpirationTimeValueIsPositiveNumeric__DiagnosticChain_Map(), source, new String[] {
				"body",
				"Tuple {\n\tmessage : String = \'If the claim name is \"expirationTime\", the value must be a positive number\',\n\tstatus : Boolean = \n\t\t    Claim.allInstances() -> select(c | c.name = \'expirationTime\') -> forAll(sc | sc.value <> null and  sc.value.toInteger() > 0)\n}.status" });
		addAnnotation(getClaim__HasExpirationTimeClaim__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'The claim \"expirationTime\" must exist and be of type REGISTERED\',\n\tstatus : Boolean = \n    \t\t\tClaim.allInstances() -> exists(c | c.name = \'expirationTime\' and c.type = EClaimType::REGISTERED)\n}.status" });
		addAnnotation(getClaim__HasAudienceClaim__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'The claim \"audience\" must exist and be of type REGISTERED\',\n\tstatus : Boolean = \n\t\t    Claim.allInstances() -> exists(c | c.name = \'audience\' and c.type = EClaimType::REGISTERED)\n}.status" });
		addAnnotation(getClaim__ExpirationTimeValueNotNull__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'If the claim name is \"expirationTime\", it must have value and must not be linked to an attribute\',\n\tstatus : Boolean = \n\t\t    Claim.allInstances() -> select(c | c.name = \'expirationTime\') -> forAll(sc | sc.value <> null and sc.claim_attribute = null)\n}.status" });
		addAnnotation(getClaim__IssuerValueNotNull__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'If the claim name is \"issuer\", it must have value and must not be linked to an attribute\',\n\tstatus : Boolean = \n    \t\tClaim.allInstances() -> select(c | c.name = \'issuer\') -> forAll(sc | sc.value <> null and sc.claim_attribute = null)\n}.status" });
		addAnnotation(getOAuth2__UniqueProviders__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'Providers must have unique names!\',\n\tstatus : Boolean = self.providers -> isUnique(p | p.name)\n}.status" });
		addAnnotation(getOAuth2__DoesntHaveRoleForOauth__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'OAuth2 authentication requires no Role entities!\',\n\tstatus : Boolean = \n\t\t    Entity.allInstances() -> select(e | e.oclIsTypeOf(Role)) -> size() = 0\n}.status" });
		addAnnotation(getOAuth2__DoesntHaveAuthControllerForOauth__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'OAuth2 authentication requires no Role entities!\',\n\tstatus : Boolean = \n\t\t    Controller.allInstances() -> select(e | e.oclIsTypeOf(Authentication)) -> size() = 0\n}.status" });
		addAnnotation(getOAuth2__DoesntHaveUserForOauth__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'OAuth2 authentication requires no Role entities!\',\n\tstatus : Boolean = \n\t\t    Entity.allInstances() -> select(e | e.oclIsTypeOf(User)) -> size() = 0\n}.status" });
		addAnnotation(getBasicAuthentication__BasicAuthNoRoleAttributes__DiagnosticChain_Map(), source, new String[] {
				"body",
				"Tuple {\n\tmessage : String = \'Basic authentication cannot have role attributes!\',\n\tstatus : Boolean = \n\t        Entity.allInstances() -> select(e | e.oclIsTypeOf(Role))\n\t            -> forAll(role | role.entity_attributes -> size() = 0)\n}.status" });
	}

} //Security_dslPackageImpl
