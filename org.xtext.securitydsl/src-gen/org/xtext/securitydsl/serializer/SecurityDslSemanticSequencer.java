/*
 * generated by Xtext 2.27.0
 */
package org.xtext.securitydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.securitydsl.services.SecurityDslGrammarAccess;
import security_dsl.Application;
import security_dsl.Attribute;
import security_dsl.Authentication;
import security_dsl.BasicAuthentication;
import security_dsl.Claim;
import security_dsl.Database;
import security_dsl.Endpoint;
import security_dsl.JWT;
import security_dsl.OAuth2;
import security_dsl.Provider;
import security_dsl.RegisteredClaim;
import security_dsl.Role;
import security_dsl.RoleInstance;
import security_dsl.Security_dslPackage;
import security_dsl.User;

@SuppressWarnings("all")
public class SecurityDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SecurityDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == Security_dslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Security_dslPackage.APPLICATION:
				sequence_Application(context, (Application) semanticObject); 
				return; 
			case Security_dslPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case Security_dslPackage.AUTHENTICATION:
				sequence_Authentication(context, (Authentication) semanticObject); 
				return; 
			case Security_dslPackage.BASIC_AUTHENTICATION:
				sequence_BasicAuthentication(context, (BasicAuthentication) semanticObject); 
				return; 
			case Security_dslPackage.CLAIM:
				sequence_Claim(context, (Claim) semanticObject); 
				return; 
			case Security_dslPackage.DATABASE:
				sequence_Database(context, (Database) semanticObject); 
				return; 
			case Security_dslPackage.ENDPOINT:
				sequence_Endpoint(context, (Endpoint) semanticObject); 
				return; 
			case Security_dslPackage.JWT:
				sequence_JWT(context, (JWT) semanticObject); 
				return; 
			case Security_dslPackage.OAUTH2:
				sequence_OAuth2(context, (OAuth2) semanticObject); 
				return; 
			case Security_dslPackage.PROVIDER:
				sequence_Provider(context, (Provider) semanticObject); 
				return; 
			case Security_dslPackage.REGISTERED_CLAIM:
				sequence_RegisteredClaim(context, (RegisteredClaim) semanticObject); 
				return; 
			case Security_dslPackage.ROLE:
				sequence_Role(context, (Role) semanticObject); 
				return; 
			case Security_dslPackage.ROLE_INSTANCE:
				sequence_RoleInstance(context, (RoleInstance) semanticObject); 
				return; 
			case Security_dslPackage.USER:
				sequence_User(context, (User) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Application returns Application
	 *
	 * Constraint:
	 *     (
	 *         artifact=EString 
	 *         name=EString? 
	 *         group=EString 
	 *         packageName=EString? 
	 *         description=EString? 
	 *         port=ELongObject? 
	 *         hostname=EString? 
	 *         app_database=Database? 
	 *         app_entities+=User? 
	 *         app_entities+=Role? 
	 *         app_security=Security? 
	 *         app_controllers+=Authentication?
	 *     )
	 * </pre>
	 */
	protected void sequence_Application(ISerializationContext context, Application semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (identifier?='identifier'? credential?='credential'? name=EString type=EType collumnName=EString?)
	 * </pre>
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Controller returns Authentication
	 *     Authentication returns Authentication
	 *
	 * Constraint:
	 *     (name=EString path=EString (controller_endpoints+=Endpoint controller_endpoints+=Endpoint*)?)
	 * </pre>
	 */
	protected void sequence_Authentication(ISerializationContext context, Authentication semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Security returns BasicAuthentication
	 *     BasicAuthentication returns BasicAuthentication
	 *
	 * Constraint:
	 *     {BasicAuthentication}
	 * </pre>
	 */
	protected void sequence_BasicAuthentication(ISerializationContext context, BasicAuthentication semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Claim returns Claim
	 *
	 * Constraint:
	 *     (type=EClaimType? name=EString claim_attribute=[Attribute|EString])
	 * </pre>
	 */
	protected void sequence_Claim(ISerializationContext context, Claim semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Database returns Database
	 *
	 * Constraint:
	 *     (vendorName=EDatabaseType url=EString username=EString password=EString)
	 * </pre>
	 */
	protected void sequence_Database(ISerializationContext context, Database semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Security_dslPackage.Literals.DATABASE__VENDOR_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Security_dslPackage.Literals.DATABASE__VENDOR_NAME));
			if (transientValues.isValueTransient(semanticObject, Security_dslPackage.Literals.DATABASE__URL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Security_dslPackage.Literals.DATABASE__URL));
			if (transientValues.isValueTransient(semanticObject, Security_dslPackage.Literals.DATABASE__USERNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Security_dslPackage.Literals.DATABASE__USERNAME));
			if (transientValues.isValueTransient(semanticObject, Security_dslPackage.Literals.DATABASE__PASSWORD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Security_dslPackage.Literals.DATABASE__PASSWORD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDatabaseAccess().getVendorNameEDatabaseTypeEnumRuleCall_1_0(), semanticObject.getVendorName());
		feeder.accept(grammarAccess.getDatabaseAccess().getUrlEStringParserRuleCall_3_0(), semanticObject.getUrl());
		feeder.accept(grammarAccess.getDatabaseAccess().getUsernameEStringParserRuleCall_5_0(), semanticObject.getUsername());
		feeder.accept(grammarAccess.getDatabaseAccess().getPasswordEStringParserRuleCall_7_0(), semanticObject.getPassword());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Endpoint returns Endpoint
	 *
	 * Constraint:
	 *     (
	 *         type=EEndpointType 
	 *         url=EString 
	 *         methodName=EString? 
	 *         method=EEndpointMethod? 
	 *         (role_authorities+=[RoleInstance|EString] role_authorities+=[RoleInstance|EString]*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_Endpoint(ISerializationContext context, Endpoint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Security returns JWT
	 *     JWT returns JWT
	 *
	 * Constraint:
	 *     (signatureAlgorithm=EString registered_claims=RegisteredClaim claims+=Claim* secret=EString?)
	 * </pre>
	 */
	protected void sequence_JWT(ISerializationContext context, JWT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Security returns OAuth2
	 *     OAuth2 returns OAuth2
	 *
	 * Constraint:
	 *     (providers+=Provider providers+=Provider*)
	 * </pre>
	 */
	protected void sequence_OAuth2(ISerializationContext context, OAuth2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Provider returns Provider
	 *
	 * Constraint:
	 *     (name=EOAuthProvider clientId=EString clientSecret=EString redirectUri=EString?)
	 * </pre>
	 */
	protected void sequence_Provider(ISerializationContext context, Provider semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     RegisteredClaim returns RegisteredClaim
	 *
	 * Constraint:
	 *     (expirationTime=EInt issuer=EString? audience=EString?)
	 * </pre>
	 */
	protected void sequence_RegisteredClaim(ISerializationContext context, RegisteredClaim semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     RoleInstance returns RoleInstance
	 *
	 * Constraint:
	 *     (client?='client'? name=EString)
	 * </pre>
	 */
	protected void sequence_RoleInstance(ISerializationContext context, RoleInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Role
	 *     Role returns Role
	 *
	 * Constraint:
	 *     (tableName=EString? (entity_attributes+=Attribute entity_attributes+=Attribute*)? (role_instances+=RoleInstance role_instances+=RoleInstance*)?)
	 * </pre>
	 */
	protected void sequence_Role(ISerializationContext context, Role semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns User
	 *     User returns User
	 *
	 * Constraint:
	 *     (tableName=EString? (entity_attributes+=Attribute entity_attributes+=Attribute*)?)
	 * </pre>
	 */
	protected void sequence_User(ISerializationContext context, User semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
