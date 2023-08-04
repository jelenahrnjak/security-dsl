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
import security_dsl.RegisteredClaim;
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
	private EClass registeredClaimEClass = null;

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
	public EOperation getApplication__ControllerPath__DiagnosticChain_Map() {
		return applicationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplication__UniqueTableName__DiagnosticChain_Map() {
		return applicationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplication__ControllerNotNamedUserRole__DiagnosticChain_Map() {
		return applicationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplication__UniqueControllerPath__DiagnosticChain_Map() {
		return applicationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplication__HasUserAndRoleModelsForController__DiagnosticChain_Map() {
		return applicationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplication__HasDatabaseForModel__DiagnosticChain_Map() {
		return applicationEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplication__DoesntHaveModelAndControllerForOauth__DiagnosticChain_Map() {
		return applicationEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplication__UniqueControllerName__DiagnosticChain_Map() {
		return applicationEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplication__BasicAuthNoRoleAttributes__DiagnosticChain_Map() {
		return applicationEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplication__RoleMustHaveStringAttribute__DiagnosticChain_Map() {
		return applicationEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplication__ValidPort__DiagnosticChain_Map() {
		return applicationEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplication__RoleCanHaveIdAndStringAttribute__DiagnosticChain_Map() {
		return applicationEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplication__RoleCantHaveAdditionalAttributes__DiagnosticChain_Map() {
		return applicationEClass.getEOperations().get(12);
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
	public EOperation getEntity__OneCredential__DiagnosticChain_Map() {
		return entityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntity__OnlyOneIdentifier__DiagnosticChain_Map() {
		return entityEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntity__UniqueAttributeName__DiagnosticChain_Map() {
		return entityEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntity__UniqueCollumnName__DiagnosticChain_Map() {
		return entityEClass.getEOperations().get(3);
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
	public EOperation getController__MethodRequiredForOtherType__DiagnosticChain_Map() {
		return controllerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getController__AuthenticationLimits__DiagnosticChain_Map() {
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
	public EOperation getController__LoginExistanceForLogout__DiagnosticChain_Map() {
		return controllerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getController__UniqueEndpoints__DiagnosticChain_Map() {
		return controllerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getController__UrlStartsWithForwardSlash__DiagnosticChain_Map() {
		return controllerEClass.getEOperations().get(5);
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
	public EClass getUser() {
		return userEClass;
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
	public EAttribute getEndpoint_FunctionName() {
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
	public EReference getJWT_Registered_claims() {
		return (EReference) jwtEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJWT__UniqueClaims__DiagnosticChain_Map() {
		return jwtEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJWT__RegisteredClaimSubject__DiagnosticChain_Map() {
		return jwtEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJWT__SingleRegisteredClaim__DiagnosticChain_Map() {
		return jwtEClass.getEOperations().get(2);
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
	public EOperation getClaim__UniqueClaimAttribute__DiagnosticChain_Map() {
		return claimEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegisteredClaim() {
		return registeredClaimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisteredClaim_ExpirationTime() {
		return (EAttribute) registeredClaimEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisteredClaim_Audience() {
		return (EAttribute) registeredClaimEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisteredClaim_Issuer() {
		return (EAttribute) registeredClaimEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegisteredClaim__ExpirationTimeGreaterThanZero__DiagnosticChain_Map() {
		return registeredClaimEClass.getEOperations().get(0);
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
	public EClass getBasicAuthentication() {
		return basicAuthenticationEClass;
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
		createEOperation(applicationEClass, APPLICATION___CONTROLLER_PATH__DIAGNOSTICCHAIN_MAP);
		createEOperation(applicationEClass, APPLICATION___UNIQUE_TABLE_NAME__DIAGNOSTICCHAIN_MAP);
		createEOperation(applicationEClass, APPLICATION___CONTROLLER_NOT_NAMED_USER_ROLE__DIAGNOSTICCHAIN_MAP);
		createEOperation(applicationEClass, APPLICATION___UNIQUE_CONTROLLER_PATH__DIAGNOSTICCHAIN_MAP);
		createEOperation(applicationEClass, APPLICATION___HAS_USER_AND_ROLE_MODELS_FOR_CONTROLLER__DIAGNOSTICCHAIN_MAP);
		createEOperation(applicationEClass, APPLICATION___HAS_DATABASE_FOR_MODEL__DIAGNOSTICCHAIN_MAP);
		createEOperation(applicationEClass,
				APPLICATION___DOESNT_HAVE_MODEL_AND_CONTROLLER_FOR_OAUTH__DIAGNOSTICCHAIN_MAP);
		createEOperation(applicationEClass, APPLICATION___UNIQUE_CONTROLLER_NAME__DIAGNOSTICCHAIN_MAP);
		createEOperation(applicationEClass, APPLICATION___BASIC_AUTH_NO_ROLE_ATTRIBUTES__DIAGNOSTICCHAIN_MAP);
		createEOperation(applicationEClass, APPLICATION___ROLE_MUST_HAVE_STRING_ATTRIBUTE__DIAGNOSTICCHAIN_MAP);
		createEOperation(applicationEClass, APPLICATION___VALID_PORT__DIAGNOSTICCHAIN_MAP);
		createEOperation(applicationEClass, APPLICATION___ROLE_CAN_HAVE_ID_AND_STRING_ATTRIBUTE__DIAGNOSTICCHAIN_MAP);
		createEOperation(applicationEClass, APPLICATION___ROLE_CANT_HAVE_ADDITIONAL_ATTRIBUTES__DIAGNOSTICCHAIN_MAP);

		entityEClass = createEClass(ENTITY);
		createEReference(entityEClass, ENTITY__ENTITY_ATTRIBUTES);
		createEAttribute(entityEClass, ENTITY__TABLE_NAME);
		createEOperation(entityEClass, ENTITY___ONE_CREDENTIAL__DIAGNOSTICCHAIN_MAP);
		createEOperation(entityEClass, ENTITY___ONLY_ONE_IDENTIFIER__DIAGNOSTICCHAIN_MAP);
		createEOperation(entityEClass, ENTITY___UNIQUE_ATTRIBUTE_NAME__DIAGNOSTICCHAIN_MAP);
		createEOperation(entityEClass, ENTITY___UNIQUE_COLLUMN_NAME__DIAGNOSTICCHAIN_MAP);

		controllerEClass = createEClass(CONTROLLER);
		createEAttribute(controllerEClass, CONTROLLER__NAME);
		createEAttribute(controllerEClass, CONTROLLER__PATH);
		createEReference(controllerEClass, CONTROLLER__CONTROLLER_ENDPOINTS);
		createEOperation(controllerEClass, CONTROLLER___METHOD_REQUIRED_FOR_OTHER_TYPE__DIAGNOSTICCHAIN_MAP);
		createEOperation(controllerEClass, CONTROLLER___AUTHENTICATION_LIMITS__DIAGNOSTICCHAIN_MAP);
		createEOperation(controllerEClass, CONTROLLER___ENDPOINT_LIMITS__DIAGNOSTICCHAIN_MAP);
		createEOperation(controllerEClass, CONTROLLER___LOGIN_EXISTANCE_FOR_LOGOUT__DIAGNOSTICCHAIN_MAP);
		createEOperation(controllerEClass, CONTROLLER___UNIQUE_ENDPOINTS__DIAGNOSTICCHAIN_MAP);
		createEOperation(controllerEClass, CONTROLLER___URL_STARTS_WITH_FORWARD_SLASH__DIAGNOSTICCHAIN_MAP);

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

		userEClass = createEClass(USER);

		roleInstanceEClass = createEClass(ROLE_INSTANCE);
		createEAttribute(roleInstanceEClass, ROLE_INSTANCE__NAME);
		createEAttribute(roleInstanceEClass, ROLE_INSTANCE__CLIENT);

		authenticationEClass = createEClass(AUTHENTICATION);

		endpointEClass = createEClass(ENDPOINT);
		createEAttribute(endpointEClass, ENDPOINT__URL);
		createEAttribute(endpointEClass, ENDPOINT__TYPE);
		createEAttribute(endpointEClass, ENDPOINT__FUNCTION_NAME);
		createEAttribute(endpointEClass, ENDPOINT__METHOD);
		createEReference(endpointEClass, ENDPOINT__ROLE_AUTHORITIES);
		createEOperation(endpointEClass, ENDPOINT___UNIQUE_ROLE_AUTHORITIES__DIAGNOSTICCHAIN_MAP);

		jwtEClass = createEClass(JWT);
		createEAttribute(jwtEClass, JWT__SIGNATURE_ALGORITHM);
		createEAttribute(jwtEClass, JWT__SECRET);
		createEReference(jwtEClass, JWT__CLAIMS);
		createEReference(jwtEClass, JWT__REGISTERED_CLAIMS);
		createEOperation(jwtEClass, JWT___UNIQUE_CLAIMS__DIAGNOSTICCHAIN_MAP);
		createEOperation(jwtEClass, JWT___REGISTERED_CLAIM_SUBJECT__DIAGNOSTICCHAIN_MAP);
		createEOperation(jwtEClass, JWT___SINGLE_REGISTERED_CLAIM__DIAGNOSTICCHAIN_MAP);

		claimEClass = createEClass(CLAIM);
		createEAttribute(claimEClass, CLAIM__TYPE);
		createEReference(claimEClass, CLAIM__CLAIM_ATTRIBUTE);
		createEAttribute(claimEClass, CLAIM__NAME);
		createEOperation(claimEClass, CLAIM___UNIQUE_CLAIM_ATTRIBUTE__DIAGNOSTICCHAIN_MAP);

		registeredClaimEClass = createEClass(REGISTERED_CLAIM);
		createEAttribute(registeredClaimEClass, REGISTERED_CLAIM__EXPIRATION_TIME);
		createEAttribute(registeredClaimEClass, REGISTERED_CLAIM__AUDIENCE);
		createEAttribute(registeredClaimEClass, REGISTERED_CLAIM__ISSUER);
		createEOperation(registeredClaimEClass,
				REGISTERED_CLAIM___EXPIRATION_TIME_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);

		oAuth2EClass = createEClass(OAUTH2);
		createEReference(oAuth2EClass, OAUTH2__PROVIDERS);
		createEOperation(oAuth2EClass, OAUTH2___UNIQUE_PROVIDERS__DIAGNOSTICCHAIN_MAP);

		basicAuthenticationEClass = createEClass(BASIC_AUTHENTICATION);

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

		EOperation op = initEOperation(getApplication__ControllerPath__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "controllerPath", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApplication__UniqueTableName__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"uniqueTableName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApplication__ControllerNotNamedUserRole__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "controllerNotNamedUserRole", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApplication__UniqueControllerPath__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"uniqueControllerPath", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApplication__HasUserAndRoleModelsForController__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "hasUserAndRoleModelsForController", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApplication__HasDatabaseForModel__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"hasDatabaseForModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApplication__DoesntHaveModelAndControllerForOauth__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "doesntHaveModelAndControllerForOauth", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApplication__UniqueControllerName__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"uniqueControllerName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApplication__BasicAuthNoRoleAttributes__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "basicAuthNoRoleAttributes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApplication__RoleMustHaveStringAttribute__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "roleMustHaveStringAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApplication__ValidPort__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validPort",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApplication__RoleCanHaveIdAndStringAttribute__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "roleCanHaveIdAndStringAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApplication__RoleCantHaveAdditionalAttributes__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "roleCantHaveAdditionalAttributes", 0, 1, IS_UNIQUE, IS_ORDERED);
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

		op = initEOperation(getEntity__OneCredential__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"oneCredential", 0, 1, IS_UNIQUE, IS_ORDERED);
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

		op = initEOperation(getEntity__UniqueAttributeName__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"uniqueAttributeName", 0, 1, IS_UNIQUE, IS_ORDERED);
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

		initEClass(controllerEClass, Controller.class, "Controller", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getController_Name(), ecorePackage.getEString(), "name", null, 1, 1, Controller.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getController_Path(), ecorePackage.getEString(), "path", null, 1, 1, Controller.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getController_Controller_endpoints(), this.getEndpoint(), null, "controller_endpoints", null, 0,
				-1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getController__MethodRequiredForOtherType__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "methodRequiredForOtherType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getController__AuthenticationLimits__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"authenticationLimits", 0, 1, IS_UNIQUE, IS_ORDERED);
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

		op = initEOperation(getController__LoginExistanceForLogout__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"loginExistanceForLogout", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getController__UniqueEndpoints__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"uniqueEndpoints", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getController__UrlStartsWithForwardSlash__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"urlStartsWithForwardSlash", 0, 1, IS_UNIQUE, IS_ORDERED);
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

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleInstanceEClass, RoleInstance.class, "RoleInstance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoleInstance_Name(), ecorePackage.getEString(), "name", null, 1, 1, RoleInstance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleInstance_Client(), ecorePackage.getEBoolean(), "client", "false", 1, 1,
				RoleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(authenticationEClass, Authentication.class, "Authentication", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(endpointEClass, Endpoint.class, "Endpoint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEndpoint_Url(), ecorePackage.getEString(), "url", null, 1, 1, Endpoint.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndpoint_Type(), this.getEEndpointType(), "type", "OTHER", 1, 1, Endpoint.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndpoint_FunctionName(), ecorePackage.getEString(), "functionName", null, 0, 1,
				Endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
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

		initEClass(jwtEClass, security_dsl.JWT.class, "JWT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJWT_SignatureAlgorithm(), ecorePackage.getEString(), "signatureAlgorithm", null, 1, 1,
				security_dsl.JWT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getJWT_Secret(), ecorePackage.getEString(), "secret", "somesecret", 0, 1, security_dsl.JWT.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJWT_Claims(), this.getClaim(), null, "claims", null, 0, -1, security_dsl.JWT.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJWT_Registered_claims(), this.getRegisteredClaim(), null, "registered_claims", null, 1, 1,
				security_dsl.JWT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getJWT__UniqueClaims__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "uniqueClaims", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getJWT__RegisteredClaimSubject__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"registeredClaimSubject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getJWT__SingleRegisteredClaim__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"singleRegisteredClaim", 0, 1, IS_UNIQUE, IS_ORDERED);
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
		initEReference(getClaim_Claim_attribute(), this.getAttribute(), null, "claim_attribute", null, 1, 1,
				Claim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClaim_Name(), ecorePackage.getEString(), "name", null, 1, 1, Claim.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getClaim__UniqueClaimAttribute__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"uniqueClaimAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(registeredClaimEClass, RegisteredClaim.class, "RegisteredClaim", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegisteredClaim_ExpirationTime(), ecorePackage.getEInt(), "expirationTime", null, 1, 1,
				RegisteredClaim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegisteredClaim_Audience(), ecorePackage.getEString(), "audience", null, 1, 1,
				RegisteredClaim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegisteredClaim_Issuer(), ecorePackage.getEString(), "issuer", null, 0, 1,
				RegisteredClaim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRegisteredClaim__ExpirationTimeGreaterThanZero__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "expirationTimeGreaterThanZero", 0, 1, IS_UNIQUE, IS_ORDERED);
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

		initEClass(basicAuthenticationEClass, BasicAuthentication.class, "BasicAuthentication", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		addAnnotation(applicationEClass, source, new String[] { "constraints", "roleCantHaveAdditionalAttributes" });
		addAnnotation(entityEClass, source, new String[] { "constraints", "uniqueCollumnName" });
		addAnnotation(controllerEClass, source, new String[] { "constraints", "urlStartsWithForwardSlash" });
		addAnnotation(endpointEClass, source, new String[] { "constraints", "uniqueRoleAuthorities" });
		addAnnotation(jwtEClass, source, new String[] { "constraints", "singleRegisteredClaim" });
		addAnnotation(claimEClass, source, new String[] { "constraints", "uniqueClaimAttribute" });
		addAnnotation(registeredClaimEClass, source, new String[] { "constraints", "expirationTimeGreaterThanZero" });
		addAnnotation(oAuth2EClass, source, new String[] { "constraints", "uniqueProviders" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(getApplication__ControllerPath__DiagnosticChain_Map(), source,
				new String[] { "body", "self.app_controllers -> forAll(c | c.path.at(1) = \'/\')" });
		addAnnotation(getApplication__UniqueTableName__DiagnosticChain_Map(), source, new String[] { "body",
				"self.app_entities -> select(e | e.tableName <> null) -> isUnique(e | e.tableName.toLower())" });
		addAnnotation(getApplication__ControllerNotNamedUserRole__DiagnosticChain_Map(), source, new String[] { "body",
				"not self.app_controllers -> exists(c | c.name.toLower() = \'user\' or c.name.toLower() = \'role\' or c.name.toLower() = \'usercontroller\' or c.name.toLower() = \'rolecontroller\')" });
		addAnnotation(getApplication__UniqueControllerPath__DiagnosticChain_Map(), source, new String[] { "body",
				" self.app_controllers -> isUnique(c | c.path) and self.app_controllers -> forAll(c | c.name.toLower() <> c.path.toLower())" });
		addAnnotation(getApplication__HasUserAndRoleModelsForController__DiagnosticChain_Map(), source, new String[] {
				"body",
				"self.app_controllers -> isEmpty() or (\n\t        self.app_entities -> exists(e | e.oclIsTypeOf(User))\n\t        and\n\t        self.app_entities -> exists(e | e.oclIsTypeOf(Role))\n\t    )" });
		addAnnotation(getApplication__HasDatabaseForModel__DiagnosticChain_Map(), source,
				new String[] { "body", "self.app_entities -> isEmpty() or not self.app_database->isEmpty()" });
		addAnnotation(getApplication__DoesntHaveModelAndControllerForOauth__DiagnosticChain_Map(), source,
				new String[] { "body",
						"\n        \tself.app_security.oclIsTypeOf(OAuth2) implies\n        (\n\t        self.app_entities -> select(e | e.oclIsTypeOf(User)) -> size() = 0\n\t        and\n\t        self.app_entities -> select(e | e.oclIsTypeOf(Role)) -> size() = 0\n\t        and\n\t        self.app_controllers -> select(c | c.oclIsTypeOf(Authentication)) -> size() = 0\n        )" });
		addAnnotation(getApplication__UniqueControllerName__DiagnosticChain_Map(), source,
				new String[] { "body", "self.app_controllers -> isUnique(c | c.name)" });
		addAnnotation(getApplication__BasicAuthNoRoleAttributes__DiagnosticChain_Map(), source, new String[] { "body",
				"\n        \tself.app_security.oclIsTypeOf(BasicAuthentication) implies\n\t        self.app_entities -> select(e | e.oclIsTypeOf(Role))\n\t            -> forAll(role | role.entity_attributes -> size() = 0)" });
		addAnnotation(getApplication__RoleMustHaveStringAttribute__DiagnosticChain_Map(), source, new String[] { "body",
				"\n        \tself.app_security.oclIsTypeOf(JWT) implies\n\t        self.app_entities -> select(e | e.oclIsTypeOf(Role))\n\t            -> forAll(role | role.entity_attributes -> exists(a | a.type = EType::_\'String\'))" });
		addAnnotation(getApplication__ValidPort__DiagnosticChain_Map(), source,
				new String[] { "body", "self.port >= 1024 and self.port <= 49151" });
		addAnnotation(getApplication__RoleCanHaveIdAndStringAttribute__DiagnosticChain_Map(), source, new String[] {
				"body",
				"\n        \tself.app_security.oclIsTypeOf(JWT) implies\n        (\n            self.app_entities -> select(e | e.oclIsTypeOf(Role))\n                -> forAll(role | \n                    role.entity_attributes -> select(a | a.type = EType::_\'String\' and a.identifier = true) -> size() = 1 )\n            or\n            self.app_entities -> select(e | e.oclIsTypeOf(Role))\n                -> forAll(role |\n                    role.entity_attributes -> select(a | a.type = EType::_\'String\' and a.identifier = false) -> size() = 1\n                    and\n                    role.entity_attributes -> select(a | a.identifier = true) -> size() = 1\n                )\n        )" });
		addAnnotation(getApplication__RoleCantHaveAdditionalAttributes__DiagnosticChain_Map(), source, new String[] {
				"body",
				"\n        \tself.app_security.oclIsTypeOf(JWT) implies\n        \tself.app_entities -> select(e | e.oclIsTypeOf(Role)) -> forAll(role | role.entity_attributes -> size() <= 2)" });
		addAnnotation(getEntity__OneCredential__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\tself.oclIsTypeOf(User) implies\n\t\t\tself.entity_attributes -> select(a | a.credential) -> size() = 1" });
		addAnnotation(getEntity__OnlyOneIdentifier__DiagnosticChain_Map(), source, new String[] { "body",
				"self.entity_attributes -> size() > 0 implies self.entity_attributes -> select(a | a.identifier) -> size() = 1" });
		addAnnotation(getEntity__UniqueAttributeName__DiagnosticChain_Map(), source,
				new String[] { "body", "self.entity_attributes -> isUnique(a | a.name)" });
		addAnnotation(getEntity__UniqueCollumnName__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\t self.entity_attributes -> exists(a | a.collumnName <> null) implies self.entity_attributes -> isUnique(a | a.collumnName)" });
		addAnnotation(getController__MethodRequiredForOtherType__DiagnosticChain_Map(), source, new String[] { "body",
				"\n        \tself.controller_endpoints -> select(e | e.type = EEndpointType::OTHER) -> forAll(e | e.method <> null)" });
		addAnnotation(getController__AuthenticationLimits__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\tself.oclIsTypeOf(Authentication) implies\n\t\t    (\n\t\t        self.controller_endpoints -> select(e | e.type = EEndpointType::REGISTRATION) -> size() <= 1\n\t\t        and\n\t\t        self.controller_endpoints -> select(e | e.type = EEndpointType::LOGIN) -> size() <= 1\n\t\t        and\n\t\t        self.controller_endpoints -> select(e | e.type = EEndpointType::LOGOUT) -> size() <= 1\n\t\t    ) " });
		addAnnotation(getController__EndpointLimits__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\tnot self.oclIsTypeOf(Authentication) implies\n\t\t    (\n\t\t        self.controller_endpoints -> select(e | e.type = EEndpointType::REGISTRATION) -> isEmpty()\n\t\t        and\n\t\t        self.controller_endpoints -> select(e | e.type = EEndpointType::LOGIN) -> isEmpty()\n\t\t        and\n\t\t        self.controller_endpoints -> select(e | e.type = EEndpointType::LOGOUT) -> isEmpty()\n\t\t    )" });
		addAnnotation(getController__LoginExistanceForLogout__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t    self.controller_endpoints -> select(e | e.type = EEndpointType::LOGOUT) -> size() = 1 implies\n        \tself.controller_endpoints -> select(e | e.type = EEndpointType::LOGIN) -> size() = 1" });
		addAnnotation(getController__UniqueEndpoints__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\tself.controller_endpoints -> forAll(e1, e2 |  e1 <> e2 implies  (e1.functionName <> null and e2.functionName <> null implies e1.functionName <> e2.functionName) \n        and \n        (e1.url <> null and e2.url <> null implies e1.url <> e2.url))" });
		addAnnotation(getController__UrlStartsWithForwardSlash__DiagnosticChain_Map(), source,
				new String[] { "body", "self.controller_endpoints -> forAll(e | e.url.at(1) = \'/\')" });
		addAnnotation(getEndpoint__UniqueRoleAuthorities__DiagnosticChain_Map(), source,
				new String[] { "body", "self.role_authorities -> isUnique(r | r.name)" });
		addAnnotation(getJWT__UniqueClaims__DiagnosticChain_Map(), source,
				new String[] { "body", "self.claims -> isUnique(c | c.name)" });
		addAnnotation(getJWT__RegisteredClaimSubject__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t    self.claims -> forAll(c | c.name = \'subject\' implies c.type = EClaimType::REGISTERED)" });
		addAnnotation(getJWT__SingleRegisteredClaim__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t        self.claims -> select(c | c.type = EClaimType::REGISTERED and c.name = \'subject\') -> size() <= 1\n\t        and\n\t        self.claims -> select(c | c.type = EClaimType::REGISTERED) -> size() <= 1" });
		addAnnotation(getClaim__UniqueClaimAttribute__DiagnosticChain_Map(), source,
				new String[] { "body", "Claim.allInstances() -> isUnique(c | c.claim_attribute)" });
		addAnnotation(getRegisteredClaim__ExpirationTimeGreaterThanZero__DiagnosticChain_Map(), source,
				new String[] { "body", "self.expirationTime > 0" });
		addAnnotation(getOAuth2__UniqueProviders__DiagnosticChain_Map(), source,
				new String[] { "body", " self.providers -> isUnique(p | p.name)" });
	}

} //Security_dslPackageImpl
