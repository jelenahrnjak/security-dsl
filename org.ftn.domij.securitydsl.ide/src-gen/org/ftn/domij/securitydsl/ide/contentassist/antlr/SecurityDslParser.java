/*
 * generated by Xtext 2.27.0
 */
package org.ftn.domij.securitydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.ftn.domij.securitydsl.ide.contentassist.antlr.internal.InternalSecurityDslParser;
import org.ftn.domij.securitydsl.services.SecurityDslGrammarAccess;

public class SecurityDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(SecurityDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, SecurityDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getModelAccess().getAlternatives(), "rule__Model__Alternatives");
			builder.put(grammarAccess.getControllerAccess().getAlternatives(), "rule__Controller__Alternatives");
			builder.put(grammarAccess.getClaimAccess().getAlternatives(), "rule__Claim__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getETypeAccess().getAlternatives(), "rule__EType__Alternatives");
			builder.put(grammarAccess.getEEndpointMethodAccess().getAlternatives(), "rule__EEndpointMethod__Alternatives");
			builder.put(grammarAccess.getEDatabaseTypeAccess().getAlternatives(), "rule__EDatabaseType__Alternatives");
			builder.put(grammarAccess.getApplicationAccess().getGroup(), "rule__Application__Group__0");
			builder.put(grammarAccess.getApplicationAccess().getGroup_4(), "rule__Application__Group_4__0");
			builder.put(grammarAccess.getApplicationAccess().getGroup_5(), "rule__Application__Group_5__0");
			builder.put(grammarAccess.getApplicationAccess().getGroup_6(), "rule__Application__Group_6__0");
			builder.put(grammarAccess.getApplicationAccess().getGroup_7(), "rule__Application__Group_7__0");
			builder.put(grammarAccess.getApplicationAccess().getGroup_7_1(), "rule__Application__Group_7_1__0");
			builder.put(grammarAccess.getApplicationAccess().getGroup_7_2(), "rule__Application__Group_7_2__0");
			builder.put(grammarAccess.getApplicationAccess().getGroup_7_3(), "rule__Application__Group_7_3__0");
			builder.put(grammarAccess.getApplicationAccess().getGroup_7_3_3(), "rule__Application__Group_7_3_3__0");
			builder.put(grammarAccess.getApplicationAccess().getGroup_8(), "rule__Application__Group_8__0");
			builder.put(grammarAccess.getApplicationAccess().getGroup_8_1(), "rule__Application__Group_8_1__0");
			builder.put(grammarAccess.getApplicationAccess().getGroup_8_2(), "rule__Application__Group_8_2__0");
			builder.put(grammarAccess.getApplicationAccess().getGroup_8_2_3(), "rule__Application__Group_8_2_3__0");
			builder.put(grammarAccess.getDatabaseAccess().getGroup(), "rule__Database__Group__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
			builder.put(grammarAccess.getUserAccess().getGroup(), "rule__User__Group__0");
			builder.put(grammarAccess.getUserAccess().getGroup_5(), "rule__User__Group_5__0");
			builder.put(grammarAccess.getUserAccess().getGroup_5_3(), "rule__User__Group_5_3__0");
			builder.put(grammarAccess.getOtherModelAccess().getGroup(), "rule__OtherModel__Group__0");
			builder.put(grammarAccess.getOtherModelAccess().getGroup_8(), "rule__OtherModel__Group_8__0");
			builder.put(grammarAccess.getOtherModelAccess().getGroup_8_3(), "rule__OtherModel__Group_8_3__0");
			builder.put(grammarAccess.getRoleAccess().getGroup(), "rule__Role__Group__0");
			builder.put(grammarAccess.getRoleAccess().getGroup_5(), "rule__Role__Group_5__0");
			builder.put(grammarAccess.getRoleAccess().getGroup_5_3(), "rule__Role__Group_5_3__0");
			builder.put(grammarAccess.getEndpointAccess().getGroup(), "rule__Endpoint__Group__0");
			builder.put(grammarAccess.getAuthEndpointAccess().getGroup(), "rule__AuthEndpoint__Group__0");
			builder.put(grammarAccess.getAuthenticationAccess().getGroup(), "rule__Authentication__Group__0");
			builder.put(grammarAccess.getAuthenticationAccess().getGroup_4(), "rule__Authentication__Group_4__0");
			builder.put(grammarAccess.getAuthenticationAccess().getGroup_5(), "rule__Authentication__Group_5__0");
			builder.put(grammarAccess.getAuthenticationAccess().getGroup_6(), "rule__Authentication__Group_6__0");
			builder.put(grammarAccess.getAuthenticationAccess().getGroup_7(), "rule__Authentication__Group_7__0");
			builder.put(grammarAccess.getAuthenticationAccess().getGroup_7_3(), "rule__Authentication__Group_7_3__0");
			builder.put(grammarAccess.getOtherControllerAccess().getGroup(), "rule__OtherController__Group__0");
			builder.put(grammarAccess.getOtherControllerAccess().getGroup_5(), "rule__OtherController__Group_5__0");
			builder.put(grammarAccess.getOtherControllerAccess().getGroup_5_3(), "rule__OtherController__Group_5_3__0");
			builder.put(grammarAccess.getJwtSecurityAccess().getGroup(), "rule__JwtSecurity__Group__0");
			builder.put(grammarAccess.getJwtSecurityAccess().getGroup_13(), "rule__JwtSecurity__Group_13__0");
			builder.put(grammarAccess.getJwtSecurityAccess().getGroup_13_3(), "rule__JwtSecurity__Group_13_3__0");
			builder.put(grammarAccess.getJwtSecurityAccess().getGroup_14(), "rule__JwtSecurity__Group_14__0");
			builder.put(grammarAccess.getJwtSecurityAccess().getGroup_14_3(), "rule__JwtSecurity__Group_14_3__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getPublicAccess().getGroup(), "rule__Public__Group__0");
			builder.put(grammarAccess.getPrivateAccess().getGroup(), "rule__Private__Group__0");
			builder.put(grammarAccess.getApplicationAccess().getNameAssignment_3(), "rule__Application__NameAssignment_3");
			builder.put(grammarAccess.getApplicationAccess().getDescriptionAssignment_4_1(), "rule__Application__DescriptionAssignment_4_1");
			builder.put(grammarAccess.getApplicationAccess().getApp_databaseAssignment_5_1(), "rule__Application__App_databaseAssignment_5_1");
			builder.put(grammarAccess.getApplicationAccess().getApp_securityAssignment_6_1(), "rule__Application__App_securityAssignment_6_1");
			builder.put(grammarAccess.getApplicationAccess().getApp_modelsAssignment_7_1_1(), "rule__Application__App_modelsAssignment_7_1_1");
			builder.put(grammarAccess.getApplicationAccess().getApp_modelsAssignment_7_2_1(), "rule__Application__App_modelsAssignment_7_2_1");
			builder.put(grammarAccess.getApplicationAccess().getApp_modelsAssignment_7_3_2(), "rule__Application__App_modelsAssignment_7_3_2");
			builder.put(grammarAccess.getApplicationAccess().getApp_modelsAssignment_7_3_3_1(), "rule__Application__App_modelsAssignment_7_3_3_1");
			builder.put(grammarAccess.getApplicationAccess().getApp_controllersAssignment_8_1_1(), "rule__Application__App_controllersAssignment_8_1_1");
			builder.put(grammarAccess.getApplicationAccess().getApp_controllersAssignment_8_2_2(), "rule__Application__App_controllersAssignment_8_2_2");
			builder.put(grammarAccess.getApplicationAccess().getApp_controllersAssignment_8_2_3_1(), "rule__Application__App_controllersAssignment_8_2_3_1");
			builder.put(grammarAccess.getDatabaseAccess().getVendorNameAssignment_1(), "rule__Database__VendorNameAssignment_1");
			builder.put(grammarAccess.getDatabaseAccess().getUrlAssignment_3(), "rule__Database__UrlAssignment_3");
			builder.put(grammarAccess.getDatabaseAccess().getUsernameAssignment_5(), "rule__Database__UsernameAssignment_5");
			builder.put(grammarAccess.getDatabaseAccess().getPasswordAssignment_7(), "rule__Database__PasswordAssignment_7");
			builder.put(grammarAccess.getAttributeAccess().getNameAssignment_2(), "rule__Attribute__NameAssignment_2");
			builder.put(grammarAccess.getAttributeAccess().getTypeAssignment_4(), "rule__Attribute__TypeAssignment_4");
			builder.put(grammarAccess.getUserAccess().getIdentifierNameAssignment_2(), "rule__User__IdentifierNameAssignment_2");
			builder.put(grammarAccess.getUserAccess().getIdentifierTypeAssignment_4(), "rule__User__IdentifierTypeAssignment_4");
			builder.put(grammarAccess.getUserAccess().getModel_attributesAssignment_5_2(), "rule__User__Model_attributesAssignment_5_2");
			builder.put(grammarAccess.getUserAccess().getModel_attributesAssignment_5_3_1(), "rule__User__Model_attributesAssignment_5_3_1");
			builder.put(grammarAccess.getOtherModelAccess().getNameAssignment_2(), "rule__OtherModel__NameAssignment_2");
			builder.put(grammarAccess.getOtherModelAccess().getIdentifierNameAssignment_5(), "rule__OtherModel__IdentifierNameAssignment_5");
			builder.put(grammarAccess.getOtherModelAccess().getIdentifierTypeAssignment_7(), "rule__OtherModel__IdentifierTypeAssignment_7");
			builder.put(grammarAccess.getOtherModelAccess().getModel_attributesAssignment_8_2(), "rule__OtherModel__Model_attributesAssignment_8_2");
			builder.put(grammarAccess.getOtherModelAccess().getModel_attributesAssignment_8_3_1(), "rule__OtherModel__Model_attributesAssignment_8_3_1");
			builder.put(grammarAccess.getRoleAccess().getIdentifierNameAssignment_2(), "rule__Role__IdentifierNameAssignment_2");
			builder.put(grammarAccess.getRoleAccess().getIdentifierTypeAssignment_4(), "rule__Role__IdentifierTypeAssignment_4");
			builder.put(grammarAccess.getRoleAccess().getModel_attributesAssignment_5_2(), "rule__Role__Model_attributesAssignment_5_2");
			builder.put(grammarAccess.getRoleAccess().getModel_attributesAssignment_5_3_1(), "rule__Role__Model_attributesAssignment_5_3_1");
			builder.put(grammarAccess.getEndpointAccess().getUrlAssignment_2(), "rule__Endpoint__UrlAssignment_2");
			builder.put(grammarAccess.getEndpointAccess().getFunction_nameAssignment_4(), "rule__Endpoint__Function_nameAssignment_4");
			builder.put(grammarAccess.getEndpointAccess().getMethodAssignment_6(), "rule__Endpoint__MethodAssignment_6");
			builder.put(grammarAccess.getAuthEndpointAccess().getUrlAssignment_1(), "rule__AuthEndpoint__UrlAssignment_1");
			builder.put(grammarAccess.getAuthEndpointAccess().getFunction_nameAssignment_3(), "rule__AuthEndpoint__Function_nameAssignment_3");
			builder.put(grammarAccess.getAuthEndpointAccess().getMethodAssignment_5(), "rule__AuthEndpoint__MethodAssignment_5");
			builder.put(grammarAccess.getAuthenticationAccess().getNameAssignment_1(), "rule__Authentication__NameAssignment_1");
			builder.put(grammarAccess.getAuthenticationAccess().getPathAssignment_3(), "rule__Authentication__PathAssignment_3");
			builder.put(grammarAccess.getAuthenticationAccess().getSignup_endpointAssignment_4_1(), "rule__Authentication__Signup_endpointAssignment_4_1");
			builder.put(grammarAccess.getAuthenticationAccess().getLogin_endpointAssignment_5_1(), "rule__Authentication__Login_endpointAssignment_5_1");
			builder.put(grammarAccess.getAuthenticationAccess().getLogout_endpointAssignment_6_1(), "rule__Authentication__Logout_endpointAssignment_6_1");
			builder.put(grammarAccess.getAuthenticationAccess().getController_endpointsAssignment_7_2(), "rule__Authentication__Controller_endpointsAssignment_7_2");
			builder.put(grammarAccess.getAuthenticationAccess().getController_endpointsAssignment_7_3_1(), "rule__Authentication__Controller_endpointsAssignment_7_3_1");
			builder.put(grammarAccess.getOtherControllerAccess().getNameAssignment_2(), "rule__OtherController__NameAssignment_2");
			builder.put(grammarAccess.getOtherControllerAccess().getPathAssignment_4(), "rule__OtherController__PathAssignment_4");
			builder.put(grammarAccess.getOtherControllerAccess().getController_endpointsAssignment_5_2(), "rule__OtherController__Controller_endpointsAssignment_5_2");
			builder.put(grammarAccess.getOtherControllerAccess().getController_endpointsAssignment_5_3_1(), "rule__OtherController__Controller_endpointsAssignment_5_3_1");
			builder.put(grammarAccess.getJwtSecurityAccess().getMechanismAssignment_1(), "rule__JwtSecurity__MechanismAssignment_1");
			builder.put(grammarAccess.getJwtSecurityAccess().getSignatureAlgorithmAssignment_5(), "rule__JwtSecurity__SignatureAlgorithmAssignment_5");
			builder.put(grammarAccess.getJwtSecurityAccess().getIssuerAssignment_8(), "rule__JwtSecurity__IssuerAssignment_8");
			builder.put(grammarAccess.getJwtSecurityAccess().getExpirationTimeAssignment_10(), "rule__JwtSecurity__ExpirationTimeAssignment_10");
			builder.put(grammarAccess.getJwtSecurityAccess().getAudienceAssignment_12(), "rule__JwtSecurity__AudienceAssignment_12");
			builder.put(grammarAccess.getJwtSecurityAccess().getSecurity_claimsAssignment_13_2(), "rule__JwtSecurity__Security_claimsAssignment_13_2");
			builder.put(grammarAccess.getJwtSecurityAccess().getSecurity_claimsAssignment_13_3_1(), "rule__JwtSecurity__Security_claimsAssignment_13_3_1");
			builder.put(grammarAccess.getJwtSecurityAccess().getSecurity_claimsAssignment_14_2(), "rule__JwtSecurity__Security_claimsAssignment_14_2");
			builder.put(grammarAccess.getJwtSecurityAccess().getSecurity_claimsAssignment_14_3_1(), "rule__JwtSecurity__Security_claimsAssignment_14_3_1");
			builder.put(grammarAccess.getJwtSecurityAccess().getSecretAssignment_17(), "rule__JwtSecurity__SecretAssignment_17");
			builder.put(grammarAccess.getPublicAccess().getNameAssignment_1(), "rule__Public__NameAssignment_1");
			builder.put(grammarAccess.getPrivateAccess().getNameAssignment_1(), "rule__Private__NameAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private SecurityDslGrammarAccess grammarAccess;

	@Override
	protected InternalSecurityDslParser createParser() {
		InternalSecurityDslParser result = new InternalSecurityDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SecurityDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SecurityDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
