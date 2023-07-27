/*
 * generated by Xtext 2.27.0
 */
package org.xtext.securitydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.securitydsl.ide.contentassist.antlr.internal.InternalSecurityDslParser;
import org.xtext.securitydsl.services.SecurityDslGrammarAccess;

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
			builder.put(grammarAccess.getSecurityAccess().getAlternatives(), "rule__Security__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
			builder.put(grammarAccess.getEDatabaseTypeAccess().getAlternatives(), "rule__EDatabaseType__Alternatives");
			builder.put(grammarAccess.getETypeAccess().getAlternatives(), "rule__EType__Alternatives");
			builder.put(grammarAccess.getEEndpointMethodAccess().getAlternatives(), "rule__EEndpointMethod__Alternatives");
			builder.put(grammarAccess.getEEndpointTypeAccess().getAlternatives(), "rule__EEndpointType__Alternatives");
			builder.put(grammarAccess.getEClaimTypeAccess().getAlternatives(), "rule__EClaimType__Alternatives");
			builder.put(grammarAccess.getApplicationAccess().getGroup(), "rule__Application__Group__0");
			builder.put(grammarAccess.getApplicationAccess().getGroup_2(), "rule__Application__Group_2__0");
			builder.put(grammarAccess.getApplicationAccess().getGroup_3(), "rule__Application__Group_3__0");
			builder.put(grammarAccess.getApplicationAccess().getGroup_4(), "rule__Application__Group_4__0");
			builder.put(grammarAccess.getApplicationAccess().getGroup_5(), "rule__Application__Group_5__0");
			builder.put(grammarAccess.getApplicationAccess().getGroup_6(), "rule__Application__Group_6__0");
			builder.put(grammarAccess.getApplicationAccess().getGroup_7(), "rule__Application__Group_7__0");
			builder.put(grammarAccess.getApplicationAccess().getGroup_8(), "rule__Application__Group_8__0");
			builder.put(grammarAccess.getApplicationAccess().getGroup_9(), "rule__Application__Group_9__0");
			builder.put(grammarAccess.getApplicationAccess().getGroup_10(), "rule__Application__Group_10__0");
			builder.put(grammarAccess.getApplicationAccess().getGroup_10_1(), "rule__Application__Group_10_1__0");
			builder.put(grammarAccess.getApplicationAccess().getGroup_10_2(), "rule__Application__Group_10_2__0");
			builder.put(grammarAccess.getApplicationAccess().getGroup_11(), "rule__Application__Group_11__0");
			builder.put(grammarAccess.getApplicationAccess().getGroup_12(), "rule__Application__Group_12__0");
			builder.put(grammarAccess.getApplicationAccess().getGroup_12_1(), "rule__Application__Group_12_1__0");
			builder.put(grammarAccess.getDatabaseAccess().getGroup(), "rule__Database__Group__0");
			builder.put(grammarAccess.getELongObjectAccess().getGroup(), "rule__ELongObject__Group__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup_7(), "rule__Attribute__Group_7__0");
			builder.put(grammarAccess.getRoleAccess().getGroup(), "rule__Role__Group__0");
			builder.put(grammarAccess.getRoleAccess().getGroup_1(), "rule__Role__Group_1__0");
			builder.put(grammarAccess.getRoleAccess().getGroup_2(), "rule__Role__Group_2__0");
			builder.put(grammarAccess.getRoleAccess().getGroup_2_3(), "rule__Role__Group_2_3__0");
			builder.put(grammarAccess.getRoleAccess().getGroup_3(), "rule__Role__Group_3__0");
			builder.put(grammarAccess.getRoleAccess().getGroup_3_3(), "rule__Role__Group_3_3__0");
			builder.put(grammarAccess.getUserAccess().getGroup(), "rule__User__Group__0");
			builder.put(grammarAccess.getUserAccess().getGroup_1(), "rule__User__Group_1__0");
			builder.put(grammarAccess.getUserAccess().getGroup_2(), "rule__User__Group_2__0");
			builder.put(grammarAccess.getUserAccess().getGroup_2_3(), "rule__User__Group_2_3__0");
			builder.put(grammarAccess.getRoleInstanceAccess().getGroup(), "rule__RoleInstance__Group__0");
			builder.put(grammarAccess.getEndpointAccess().getGroup(), "rule__Endpoint__Group__0");
			builder.put(grammarAccess.getEndpointAccess().getGroup_3(), "rule__Endpoint__Group_3__0");
			builder.put(grammarAccess.getEndpointAccess().getGroup_4(), "rule__Endpoint__Group_4__0");
			builder.put(grammarAccess.getEndpointAccess().getGroup_5(), "rule__Endpoint__Group_5__0");
			builder.put(grammarAccess.getEndpointAccess().getGroup_6(), "rule__Endpoint__Group_6__0");
			builder.put(grammarAccess.getEndpointAccess().getGroup_6_3(), "rule__Endpoint__Group_6_3__0");
			builder.put(grammarAccess.getAuthenticationAccess().getGroup(), "rule__Authentication__Group__0");
			builder.put(grammarAccess.getAuthenticationAccess().getGroup_5(), "rule__Authentication__Group_5__0");
			builder.put(grammarAccess.getAuthenticationAccess().getGroup_5_3(), "rule__Authentication__Group_5_3__0");
			builder.put(grammarAccess.getJWTAccess().getGroup(), "rule__JWT__Group__0");
			builder.put(grammarAccess.getJWTAccess().getGroup_8(), "rule__JWT__Group_8__0");
			builder.put(grammarAccess.getJWTAccess().getGroup_10(), "rule__JWT__Group_10__0");
			builder.put(grammarAccess.getClaimAccess().getGroup(), "rule__Claim__Group__0");
			builder.put(grammarAccess.getClaimAccess().getGroup_1(), "rule__Claim__Group_1__0");
			builder.put(grammarAccess.getRegisteredClaimsAccess().getGroup(), "rule__RegisteredClaims__Group__0");
			builder.put(grammarAccess.getRegisteredClaimsAccess().getGroup_5(), "rule__RegisteredClaims__Group_5__0");
			builder.put(grammarAccess.getRegisteredClaimsAccess().getGroup_6(), "rule__RegisteredClaims__Group_6__0");
			builder.put(grammarAccess.getOAuth2Access().getGroup(), "rule__OAuth2__Group__0");
			builder.put(grammarAccess.getBasicAuthenticationAccess().getGroup(), "rule__BasicAuthentication__Group__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getApplicationAccess().getArtifactAssignment_2_1(), "rule__Application__ArtifactAssignment_2_1");
			builder.put(grammarAccess.getApplicationAccess().getNameAssignment_3_1(), "rule__Application__NameAssignment_3_1");
			builder.put(grammarAccess.getApplicationAccess().getGroupAssignment_4_1(), "rule__Application__GroupAssignment_4_1");
			builder.put(grammarAccess.getApplicationAccess().getPackageNameAssignment_5_1(), "rule__Application__PackageNameAssignment_5_1");
			builder.put(grammarAccess.getApplicationAccess().getDescriptionAssignment_6_1(), "rule__Application__DescriptionAssignment_6_1");
			builder.put(grammarAccess.getApplicationAccess().getPortAssignment_7_1(), "rule__Application__PortAssignment_7_1");
			builder.put(grammarAccess.getApplicationAccess().getHostnameAssignment_8_1(), "rule__Application__HostnameAssignment_8_1");
			builder.put(grammarAccess.getApplicationAccess().getApp_databaseAssignment_9_1(), "rule__Application__App_databaseAssignment_9_1");
			builder.put(grammarAccess.getApplicationAccess().getApp_modelsAssignment_10_1_1(), "rule__Application__App_modelsAssignment_10_1_1");
			builder.put(grammarAccess.getApplicationAccess().getApp_modelsAssignment_10_2_1(), "rule__Application__App_modelsAssignment_10_2_1");
			builder.put(grammarAccess.getApplicationAccess().getApp_securityAssignment_11_1(), "rule__Application__App_securityAssignment_11_1");
			builder.put(grammarAccess.getApplicationAccess().getApp_controllersAssignment_12_1_1(), "rule__Application__App_controllersAssignment_12_1_1");
			builder.put(grammarAccess.getDatabaseAccess().getVendorNameAssignment_1(), "rule__Database__VendorNameAssignment_1");
			builder.put(grammarAccess.getDatabaseAccess().getUrlAssignment_3(), "rule__Database__UrlAssignment_3");
			builder.put(grammarAccess.getDatabaseAccess().getUsernameAssignment_5(), "rule__Database__UsernameAssignment_5");
			builder.put(grammarAccess.getDatabaseAccess().getPasswordAssignment_7(), "rule__Database__PasswordAssignment_7");
			builder.put(grammarAccess.getAttributeAccess().getIdentifierAssignment_1(), "rule__Attribute__IdentifierAssignment_1");
			builder.put(grammarAccess.getAttributeAccess().getCredentialAssignment_2(), "rule__Attribute__CredentialAssignment_2");
			builder.put(grammarAccess.getAttributeAccess().getNameAssignment_4(), "rule__Attribute__NameAssignment_4");
			builder.put(grammarAccess.getAttributeAccess().getTypeAssignment_6(), "rule__Attribute__TypeAssignment_6");
			builder.put(grammarAccess.getAttributeAccess().getCollumnNameAssignment_7_1(), "rule__Attribute__CollumnNameAssignment_7_1");
			builder.put(grammarAccess.getRoleAccess().getTableNameAssignment_1_1(), "rule__Role__TableNameAssignment_1_1");
			builder.put(grammarAccess.getRoleAccess().getModel_attributesAssignment_2_2(), "rule__Role__Model_attributesAssignment_2_2");
			builder.put(grammarAccess.getRoleAccess().getModel_attributesAssignment_2_3_1(), "rule__Role__Model_attributesAssignment_2_3_1");
			builder.put(grammarAccess.getRoleAccess().getRole_instancesAssignment_3_2(), "rule__Role__Role_instancesAssignment_3_2");
			builder.put(grammarAccess.getRoleAccess().getRole_instancesAssignment_3_3_1(), "rule__Role__Role_instancesAssignment_3_3_1");
			builder.put(grammarAccess.getUserAccess().getTableNameAssignment_1_1(), "rule__User__TableNameAssignment_1_1");
			builder.put(grammarAccess.getUserAccess().getModel_attributesAssignment_2_2(), "rule__User__Model_attributesAssignment_2_2");
			builder.put(grammarAccess.getUserAccess().getModel_attributesAssignment_2_3_1(), "rule__User__Model_attributesAssignment_2_3_1");
			builder.put(grammarAccess.getRoleInstanceAccess().getClientAssignment_1(), "rule__RoleInstance__ClientAssignment_1");
			builder.put(grammarAccess.getRoleInstanceAccess().getNameAssignment_2(), "rule__RoleInstance__NameAssignment_2");
			builder.put(grammarAccess.getEndpointAccess().getUrlAssignment_2(), "rule__Endpoint__UrlAssignment_2");
			builder.put(grammarAccess.getEndpointAccess().getFunctionNameAssignment_3_1(), "rule__Endpoint__FunctionNameAssignment_3_1");
			builder.put(grammarAccess.getEndpointAccess().getMethodAssignment_4_1(), "rule__Endpoint__MethodAssignment_4_1");
			builder.put(grammarAccess.getEndpointAccess().getTypeAssignment_5_1(), "rule__Endpoint__TypeAssignment_5_1");
			builder.put(grammarAccess.getEndpointAccess().getRole_authoritiesAssignment_6_2(), "rule__Endpoint__Role_authoritiesAssignment_6_2");
			builder.put(grammarAccess.getEndpointAccess().getRole_authoritiesAssignment_6_3_1(), "rule__Endpoint__Role_authoritiesAssignment_6_3_1");
			builder.put(grammarAccess.getAuthenticationAccess().getNameAssignment_2(), "rule__Authentication__NameAssignment_2");
			builder.put(grammarAccess.getAuthenticationAccess().getPathAssignment_4(), "rule__Authentication__PathAssignment_4");
			builder.put(grammarAccess.getAuthenticationAccess().getController_endpointsAssignment_5_2(), "rule__Authentication__Controller_endpointsAssignment_5_2");
			builder.put(grammarAccess.getAuthenticationAccess().getController_endpointsAssignment_5_3_1(), "rule__Authentication__Controller_endpointsAssignment_5_3_1");
			builder.put(grammarAccess.getJWTAccess().getSignatureAlgorithmAssignment_3(), "rule__JWT__SignatureAlgorithmAssignment_3");
			builder.put(grammarAccess.getJWTAccess().getRegisteredclaimsAssignment_7(), "rule__JWT__RegisteredclaimsAssignment_7");
			builder.put(grammarAccess.getJWTAccess().getJwt_claimsAssignment_8_1(), "rule__JWT__Jwt_claimsAssignment_8_1");
			builder.put(grammarAccess.getJWTAccess().getSecretAssignment_10_2(), "rule__JWT__SecretAssignment_10_2");
			builder.put(grammarAccess.getClaimAccess().getTypeAssignment_1_0(), "rule__Claim__TypeAssignment_1_0");
			builder.put(grammarAccess.getClaimAccess().getNameAssignment_2(), "rule__Claim__NameAssignment_2");
			builder.put(grammarAccess.getClaimAccess().getClaim_attributeAssignment_4(), "rule__Claim__Claim_attributeAssignment_4");
			builder.put(grammarAccess.getRegisteredClaimsAccess().getExpirationTimeAssignment_3(), "rule__RegisteredClaims__ExpirationTimeAssignment_3");
			builder.put(grammarAccess.getRegisteredClaimsAccess().getIssuerAssignment_5_4(), "rule__RegisteredClaims__IssuerAssignment_5_4");
			builder.put(grammarAccess.getRegisteredClaimsAccess().getAudienceAssignment_6_4(), "rule__RegisteredClaims__AudienceAssignment_6_4");
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
