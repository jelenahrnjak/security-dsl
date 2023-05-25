package org.ftn.domi.securitydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.ftn.domi.securitydsl.services.SecurityDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSecurityDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_NL", "RULE_TAB", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'JWT'", "'INT'", "'STRING'", "'FLOAT'", "'LONG'", "'CHAR'", "'BOOLEAN'", "'DOUBLE'", "'BYTE'", "'SHORT'", "'GET'", "'PUT'", "'POST'", "'DELETE'", "'POSTGRES'", "'ORACLE'", "'MYSQL'", "'application:'", "'name:'", "'description:'", "'database:'", "'security:'", "'vendorName:'", "'url:'", "'username:'", "'password:'", "'Attribute'", "'{'", "'type'", "'}'", "'User'", "'identifierName'", "'identifierType'", "'model_attributes'", "','", "'OtherModel'", "'Role'", "'Endpoint'", "'url'", "'function_name'", "'method'", "'roles_authority'", "'('", "')'", "'Authentication'", "'path'", "'controller_endpoints'", "'signup_endpoint'", "'login_endpoint'", "'logout_endpoint'", "'OtherController'", "'mechanism:'", "'jwt:'", "'header:'", "'signature-algorithm:'", "'payload:'", "'issuer:'", "'expiration-time:'", "'audience:'", "'signature:'", "'secret:'", "'public_claims:'", "'['", "']'", "'private_claims:'", "'-'", "'isPublic'"
    };
    public static final int T__50=50;
    public static final int RULE_TAB=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int RULE_NL=7;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSecurityDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSecurityDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSecurityDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSecurityDsl.g"; }


    	private SecurityDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(SecurityDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleApplication"
    // InternalSecurityDsl.g:53:1: entryRuleApplication : ruleApplication EOF ;
    public final void entryRuleApplication() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:54:1: ( ruleApplication EOF )
            // InternalSecurityDsl.g:55:1: ruleApplication EOF
            {
             before(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleApplication();

            state._fsp--;

             after(grammarAccess.getApplicationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // InternalSecurityDsl.g:62:1: ruleApplication : ( ( rule__Application__Group__0 ) ) ;
    public final void ruleApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:66:2: ( ( ( rule__Application__Group__0 ) ) )
            // InternalSecurityDsl.g:67:2: ( ( rule__Application__Group__0 ) )
            {
            // InternalSecurityDsl.g:67:2: ( ( rule__Application__Group__0 ) )
            // InternalSecurityDsl.g:68:3: ( rule__Application__Group__0 )
            {
             before(grammarAccess.getApplicationAccess().getGroup()); 
            // InternalSecurityDsl.g:69:3: ( rule__Application__Group__0 )
            // InternalSecurityDsl.g:69:4: rule__Application__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleSecurity"
    // InternalSecurityDsl.g:78:1: entryRuleSecurity : ruleSecurity EOF ;
    public final void entryRuleSecurity() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:79:1: ( ruleSecurity EOF )
            // InternalSecurityDsl.g:80:1: ruleSecurity EOF
            {
             before(grammarAccess.getSecurityRule()); 
            pushFollow(FOLLOW_1);
            ruleSecurity();

            state._fsp--;

             after(grammarAccess.getSecurityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSecurity"


    // $ANTLR start "ruleSecurity"
    // InternalSecurityDsl.g:87:1: ruleSecurity : ( ruleJwtSecurity ) ;
    public final void ruleSecurity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:91:2: ( ( ruleJwtSecurity ) )
            // InternalSecurityDsl.g:92:2: ( ruleJwtSecurity )
            {
            // InternalSecurityDsl.g:92:2: ( ruleJwtSecurity )
            // InternalSecurityDsl.g:93:3: ruleJwtSecurity
            {
             before(grammarAccess.getSecurityAccess().getJwtSecurityParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleJwtSecurity();

            state._fsp--;

             after(grammarAccess.getSecurityAccess().getJwtSecurityParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSecurity"


    // $ANTLR start "entryRuleEString"
    // InternalSecurityDsl.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:104:1: ( ruleEString EOF )
            // InternalSecurityDsl.g:105:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSecurityDsl.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSecurityDsl.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSecurityDsl.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalSecurityDsl.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSecurityDsl.g:119:3: ( rule__EString__Alternatives )
            // InternalSecurityDsl.g:119:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleDatabase"
    // InternalSecurityDsl.g:128:1: entryRuleDatabase : ruleDatabase EOF ;
    public final void entryRuleDatabase() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:129:1: ( ruleDatabase EOF )
            // InternalSecurityDsl.g:130:1: ruleDatabase EOF
            {
             before(grammarAccess.getDatabaseRule()); 
            pushFollow(FOLLOW_1);
            ruleDatabase();

            state._fsp--;

             after(grammarAccess.getDatabaseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDatabase"


    // $ANTLR start "ruleDatabase"
    // InternalSecurityDsl.g:137:1: ruleDatabase : ( ( rule__Database__Group__0 ) ) ;
    public final void ruleDatabase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:141:2: ( ( ( rule__Database__Group__0 ) ) )
            // InternalSecurityDsl.g:142:2: ( ( rule__Database__Group__0 ) )
            {
            // InternalSecurityDsl.g:142:2: ( ( rule__Database__Group__0 ) )
            // InternalSecurityDsl.g:143:3: ( rule__Database__Group__0 )
            {
             before(grammarAccess.getDatabaseAccess().getGroup()); 
            // InternalSecurityDsl.g:144:3: ( rule__Database__Group__0 )
            // InternalSecurityDsl.g:144:4: rule__Database__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Database__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDatabase"


    // $ANTLR start "entryRuleAttribute"
    // InternalSecurityDsl.g:153:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:154:1: ( ruleAttribute EOF )
            // InternalSecurityDsl.g:155:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalSecurityDsl.g:162:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:166:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalSecurityDsl.g:167:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalSecurityDsl.g:167:2: ( ( rule__Attribute__Group__0 ) )
            // InternalSecurityDsl.g:168:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalSecurityDsl.g:169:3: ( rule__Attribute__Group__0 )
            // InternalSecurityDsl.g:169:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleUser"
    // InternalSecurityDsl.g:178:1: entryRuleUser : ruleUser EOF ;
    public final void entryRuleUser() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:179:1: ( ruleUser EOF )
            // InternalSecurityDsl.g:180:1: ruleUser EOF
            {
             before(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_1);
            ruleUser();

            state._fsp--;

             after(grammarAccess.getUserRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // InternalSecurityDsl.g:187:1: ruleUser : ( ( rule__User__Group__0 ) ) ;
    public final void ruleUser() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:191:2: ( ( ( rule__User__Group__0 ) ) )
            // InternalSecurityDsl.g:192:2: ( ( rule__User__Group__0 ) )
            {
            // InternalSecurityDsl.g:192:2: ( ( rule__User__Group__0 ) )
            // InternalSecurityDsl.g:193:3: ( rule__User__Group__0 )
            {
             before(grammarAccess.getUserAccess().getGroup()); 
            // InternalSecurityDsl.g:194:3: ( rule__User__Group__0 )
            // InternalSecurityDsl.g:194:4: rule__User__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__User__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUser"


    // $ANTLR start "entryRuleOtherModel"
    // InternalSecurityDsl.g:203:1: entryRuleOtherModel : ruleOtherModel EOF ;
    public final void entryRuleOtherModel() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:204:1: ( ruleOtherModel EOF )
            // InternalSecurityDsl.g:205:1: ruleOtherModel EOF
            {
             before(grammarAccess.getOtherModelRule()); 
            pushFollow(FOLLOW_1);
            ruleOtherModel();

            state._fsp--;

             after(grammarAccess.getOtherModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOtherModel"


    // $ANTLR start "ruleOtherModel"
    // InternalSecurityDsl.g:212:1: ruleOtherModel : ( ( rule__OtherModel__Group__0 ) ) ;
    public final void ruleOtherModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:216:2: ( ( ( rule__OtherModel__Group__0 ) ) )
            // InternalSecurityDsl.g:217:2: ( ( rule__OtherModel__Group__0 ) )
            {
            // InternalSecurityDsl.g:217:2: ( ( rule__OtherModel__Group__0 ) )
            // InternalSecurityDsl.g:218:3: ( rule__OtherModel__Group__0 )
            {
             before(grammarAccess.getOtherModelAccess().getGroup()); 
            // InternalSecurityDsl.g:219:3: ( rule__OtherModel__Group__0 )
            // InternalSecurityDsl.g:219:4: rule__OtherModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OtherModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOtherModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOtherModel"


    // $ANTLR start "entryRuleRole"
    // InternalSecurityDsl.g:228:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:229:1: ( ruleRole EOF )
            // InternalSecurityDsl.g:230:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRoleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalSecurityDsl.g:237:1: ruleRole : ( ( rule__Role__Group__0 ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:241:2: ( ( ( rule__Role__Group__0 ) ) )
            // InternalSecurityDsl.g:242:2: ( ( rule__Role__Group__0 ) )
            {
            // InternalSecurityDsl.g:242:2: ( ( rule__Role__Group__0 ) )
            // InternalSecurityDsl.g:243:3: ( rule__Role__Group__0 )
            {
             before(grammarAccess.getRoleAccess().getGroup()); 
            // InternalSecurityDsl.g:244:3: ( rule__Role__Group__0 )
            // InternalSecurityDsl.g:244:4: rule__Role__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleEndpoint"
    // InternalSecurityDsl.g:253:1: entryRuleEndpoint : ruleEndpoint EOF ;
    public final void entryRuleEndpoint() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:254:1: ( ruleEndpoint EOF )
            // InternalSecurityDsl.g:255:1: ruleEndpoint EOF
            {
             before(grammarAccess.getEndpointRule()); 
            pushFollow(FOLLOW_1);
            ruleEndpoint();

            state._fsp--;

             after(grammarAccess.getEndpointRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEndpoint"


    // $ANTLR start "ruleEndpoint"
    // InternalSecurityDsl.g:262:1: ruleEndpoint : ( ( rule__Endpoint__Group__0 ) ) ;
    public final void ruleEndpoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:266:2: ( ( ( rule__Endpoint__Group__0 ) ) )
            // InternalSecurityDsl.g:267:2: ( ( rule__Endpoint__Group__0 ) )
            {
            // InternalSecurityDsl.g:267:2: ( ( rule__Endpoint__Group__0 ) )
            // InternalSecurityDsl.g:268:3: ( rule__Endpoint__Group__0 )
            {
             before(grammarAccess.getEndpointAccess().getGroup()); 
            // InternalSecurityDsl.g:269:3: ( rule__Endpoint__Group__0 )
            // InternalSecurityDsl.g:269:4: rule__Endpoint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEndpointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEndpoint"


    // $ANTLR start "entryRuleAuthentication"
    // InternalSecurityDsl.g:278:1: entryRuleAuthentication : ruleAuthentication EOF ;
    public final void entryRuleAuthentication() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:279:1: ( ruleAuthentication EOF )
            // InternalSecurityDsl.g:280:1: ruleAuthentication EOF
            {
             before(grammarAccess.getAuthenticationRule()); 
            pushFollow(FOLLOW_1);
            ruleAuthentication();

            state._fsp--;

             after(grammarAccess.getAuthenticationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAuthentication"


    // $ANTLR start "ruleAuthentication"
    // InternalSecurityDsl.g:287:1: ruleAuthentication : ( ( rule__Authentication__Group__0 ) ) ;
    public final void ruleAuthentication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:291:2: ( ( ( rule__Authentication__Group__0 ) ) )
            // InternalSecurityDsl.g:292:2: ( ( rule__Authentication__Group__0 ) )
            {
            // InternalSecurityDsl.g:292:2: ( ( rule__Authentication__Group__0 ) )
            // InternalSecurityDsl.g:293:3: ( rule__Authentication__Group__0 )
            {
             before(grammarAccess.getAuthenticationAccess().getGroup()); 
            // InternalSecurityDsl.g:294:3: ( rule__Authentication__Group__0 )
            // InternalSecurityDsl.g:294:4: rule__Authentication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Authentication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAuthenticationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAuthentication"


    // $ANTLR start "entryRuleOtherController"
    // InternalSecurityDsl.g:303:1: entryRuleOtherController : ruleOtherController EOF ;
    public final void entryRuleOtherController() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:304:1: ( ruleOtherController EOF )
            // InternalSecurityDsl.g:305:1: ruleOtherController EOF
            {
             before(grammarAccess.getOtherControllerRule()); 
            pushFollow(FOLLOW_1);
            ruleOtherController();

            state._fsp--;

             after(grammarAccess.getOtherControllerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOtherController"


    // $ANTLR start "ruleOtherController"
    // InternalSecurityDsl.g:312:1: ruleOtherController : ( ( rule__OtherController__Group__0 ) ) ;
    public final void ruleOtherController() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:316:2: ( ( ( rule__OtherController__Group__0 ) ) )
            // InternalSecurityDsl.g:317:2: ( ( rule__OtherController__Group__0 ) )
            {
            // InternalSecurityDsl.g:317:2: ( ( rule__OtherController__Group__0 ) )
            // InternalSecurityDsl.g:318:3: ( rule__OtherController__Group__0 )
            {
             before(grammarAccess.getOtherControllerAccess().getGroup()); 
            // InternalSecurityDsl.g:319:3: ( rule__OtherController__Group__0 )
            // InternalSecurityDsl.g:319:4: rule__OtherController__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OtherController__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOtherControllerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOtherController"


    // $ANTLR start "entryRuleJwtSecurity"
    // InternalSecurityDsl.g:328:1: entryRuleJwtSecurity : ruleJwtSecurity EOF ;
    public final void entryRuleJwtSecurity() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:329:1: ( ruleJwtSecurity EOF )
            // InternalSecurityDsl.g:330:1: ruleJwtSecurity EOF
            {
             before(grammarAccess.getJwtSecurityRule()); 
            pushFollow(FOLLOW_1);
            ruleJwtSecurity();

            state._fsp--;

             after(grammarAccess.getJwtSecurityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJwtSecurity"


    // $ANTLR start "ruleJwtSecurity"
    // InternalSecurityDsl.g:337:1: ruleJwtSecurity : ( ( rule__JwtSecurity__Group__0 ) ) ;
    public final void ruleJwtSecurity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:341:2: ( ( ( rule__JwtSecurity__Group__0 ) ) )
            // InternalSecurityDsl.g:342:2: ( ( rule__JwtSecurity__Group__0 ) )
            {
            // InternalSecurityDsl.g:342:2: ( ( rule__JwtSecurity__Group__0 ) )
            // InternalSecurityDsl.g:343:3: ( rule__JwtSecurity__Group__0 )
            {
             before(grammarAccess.getJwtSecurityAccess().getGroup()); 
            // InternalSecurityDsl.g:344:3: ( rule__JwtSecurity__Group__0 )
            // InternalSecurityDsl.g:344:4: rule__JwtSecurity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JwtSecurity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJwtSecurityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJwtSecurity"


    // $ANTLR start "entryRuleEInt"
    // InternalSecurityDsl.g:353:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:354:1: ( ruleEInt EOF )
            // InternalSecurityDsl.g:355:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalSecurityDsl.g:362:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:366:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalSecurityDsl.g:367:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalSecurityDsl.g:367:2: ( ( rule__EInt__Group__0 ) )
            // InternalSecurityDsl.g:368:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalSecurityDsl.g:369:3: ( rule__EInt__Group__0 )
            // InternalSecurityDsl.g:369:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRulePublicClaims"
    // InternalSecurityDsl.g:378:1: entryRulePublicClaims : rulePublicClaims EOF ;
    public final void entryRulePublicClaims() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:379:1: ( rulePublicClaims EOF )
            // InternalSecurityDsl.g:380:1: rulePublicClaims EOF
            {
             before(grammarAccess.getPublicClaimsRule()); 
            pushFollow(FOLLOW_1);
            rulePublicClaims();

            state._fsp--;

             after(grammarAccess.getPublicClaimsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePublicClaims"


    // $ANTLR start "rulePublicClaims"
    // InternalSecurityDsl.g:387:1: rulePublicClaims : ( ( rule__PublicClaims__Group__0 ) ) ;
    public final void rulePublicClaims() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:391:2: ( ( ( rule__PublicClaims__Group__0 ) ) )
            // InternalSecurityDsl.g:392:2: ( ( rule__PublicClaims__Group__0 ) )
            {
            // InternalSecurityDsl.g:392:2: ( ( rule__PublicClaims__Group__0 ) )
            // InternalSecurityDsl.g:393:3: ( rule__PublicClaims__Group__0 )
            {
             before(grammarAccess.getPublicClaimsAccess().getGroup()); 
            // InternalSecurityDsl.g:394:3: ( rule__PublicClaims__Group__0 )
            // InternalSecurityDsl.g:394:4: rule__PublicClaims__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PublicClaims__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPublicClaimsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePublicClaims"


    // $ANTLR start "entryRulePrivateClaims"
    // InternalSecurityDsl.g:403:1: entryRulePrivateClaims : rulePrivateClaims EOF ;
    public final void entryRulePrivateClaims() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:404:1: ( rulePrivateClaims EOF )
            // InternalSecurityDsl.g:405:1: rulePrivateClaims EOF
            {
             before(grammarAccess.getPrivateClaimsRule()); 
            pushFollow(FOLLOW_1);
            rulePrivateClaims();

            state._fsp--;

             after(grammarAccess.getPrivateClaimsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrivateClaims"


    // $ANTLR start "rulePrivateClaims"
    // InternalSecurityDsl.g:412:1: rulePrivateClaims : ( ( rule__PrivateClaims__Group__0 ) ) ;
    public final void rulePrivateClaims() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:416:2: ( ( ( rule__PrivateClaims__Group__0 ) ) )
            // InternalSecurityDsl.g:417:2: ( ( rule__PrivateClaims__Group__0 ) )
            {
            // InternalSecurityDsl.g:417:2: ( ( rule__PrivateClaims__Group__0 ) )
            // InternalSecurityDsl.g:418:3: ( rule__PrivateClaims__Group__0 )
            {
             before(grammarAccess.getPrivateClaimsAccess().getGroup()); 
            // InternalSecurityDsl.g:419:3: ( rule__PrivateClaims__Group__0 )
            // InternalSecurityDsl.g:419:4: rule__PrivateClaims__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrivateClaims__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrivateClaimsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrivateClaims"


    // $ANTLR start "ruleEType"
    // InternalSecurityDsl.g:428:1: ruleEType : ( ( rule__EType__Alternatives ) ) ;
    public final void ruleEType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:432:1: ( ( ( rule__EType__Alternatives ) ) )
            // InternalSecurityDsl.g:433:2: ( ( rule__EType__Alternatives ) )
            {
            // InternalSecurityDsl.g:433:2: ( ( rule__EType__Alternatives ) )
            // InternalSecurityDsl.g:434:3: ( rule__EType__Alternatives )
            {
             before(grammarAccess.getETypeAccess().getAlternatives()); 
            // InternalSecurityDsl.g:435:3: ( rule__EType__Alternatives )
            // InternalSecurityDsl.g:435:4: rule__EType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getETypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEType"


    // $ANTLR start "ruleEEndpointMethod"
    // InternalSecurityDsl.g:444:1: ruleEEndpointMethod : ( ( rule__EEndpointMethod__Alternatives ) ) ;
    public final void ruleEEndpointMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:448:1: ( ( ( rule__EEndpointMethod__Alternatives ) ) )
            // InternalSecurityDsl.g:449:2: ( ( rule__EEndpointMethod__Alternatives ) )
            {
            // InternalSecurityDsl.g:449:2: ( ( rule__EEndpointMethod__Alternatives ) )
            // InternalSecurityDsl.g:450:3: ( rule__EEndpointMethod__Alternatives )
            {
             before(grammarAccess.getEEndpointMethodAccess().getAlternatives()); 
            // InternalSecurityDsl.g:451:3: ( rule__EEndpointMethod__Alternatives )
            // InternalSecurityDsl.g:451:4: rule__EEndpointMethod__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EEndpointMethod__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEEndpointMethodAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEEndpointMethod"


    // $ANTLR start "ruleESecurityMechanism"
    // InternalSecurityDsl.g:460:1: ruleESecurityMechanism : ( ( 'JWT' ) ) ;
    public final void ruleESecurityMechanism() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:464:1: ( ( ( 'JWT' ) ) )
            // InternalSecurityDsl.g:465:2: ( ( 'JWT' ) )
            {
            // InternalSecurityDsl.g:465:2: ( ( 'JWT' ) )
            // InternalSecurityDsl.g:466:3: ( 'JWT' )
            {
             before(grammarAccess.getESecurityMechanismAccess().getJWTEnumLiteralDeclaration()); 
            // InternalSecurityDsl.g:467:3: ( 'JWT' )
            // InternalSecurityDsl.g:467:4: 'JWT'
            {
            match(input,13,FOLLOW_2); 

            }

             after(grammarAccess.getESecurityMechanismAccess().getJWTEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleESecurityMechanism"


    // $ANTLR start "ruleEDatabaseType"
    // InternalSecurityDsl.g:476:1: ruleEDatabaseType : ( ( rule__EDatabaseType__Alternatives ) ) ;
    public final void ruleEDatabaseType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:480:1: ( ( ( rule__EDatabaseType__Alternatives ) ) )
            // InternalSecurityDsl.g:481:2: ( ( rule__EDatabaseType__Alternatives ) )
            {
            // InternalSecurityDsl.g:481:2: ( ( rule__EDatabaseType__Alternatives ) )
            // InternalSecurityDsl.g:482:3: ( rule__EDatabaseType__Alternatives )
            {
             before(grammarAccess.getEDatabaseTypeAccess().getAlternatives()); 
            // InternalSecurityDsl.g:483:3: ( rule__EDatabaseType__Alternatives )
            // InternalSecurityDsl.g:483:4: rule__EDatabaseType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EDatabaseType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEDatabaseTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDatabaseType"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalSecurityDsl.g:491:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:495:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSecurityDsl.g:496:2: ( RULE_STRING )
                    {
                    // InternalSecurityDsl.g:496:2: ( RULE_STRING )
                    // InternalSecurityDsl.g:497:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:502:2: ( RULE_ID )
                    {
                    // InternalSecurityDsl.g:502:2: ( RULE_ID )
                    // InternalSecurityDsl.g:503:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EType__Alternatives"
    // InternalSecurityDsl.g:512:1: rule__EType__Alternatives : ( ( ( 'INT' ) ) | ( ( 'STRING' ) ) | ( ( 'FLOAT' ) ) | ( ( 'LONG' ) ) | ( ( 'CHAR' ) ) | ( ( 'BOOLEAN' ) ) | ( ( 'DOUBLE' ) ) | ( ( 'BYTE' ) ) | ( ( 'SHORT' ) ) );
    public final void rule__EType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:516:1: ( ( ( 'INT' ) ) | ( ( 'STRING' ) ) | ( ( 'FLOAT' ) ) | ( ( 'LONG' ) ) | ( ( 'CHAR' ) ) | ( ( 'BOOLEAN' ) ) | ( ( 'DOUBLE' ) ) | ( ( 'BYTE' ) ) | ( ( 'SHORT' ) ) )
            int alt2=9;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            case 17:
                {
                alt2=4;
                }
                break;
            case 18:
                {
                alt2=5;
                }
                break;
            case 19:
                {
                alt2=6;
                }
                break;
            case 20:
                {
                alt2=7;
                }
                break;
            case 21:
                {
                alt2=8;
                }
                break;
            case 22:
                {
                alt2=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSecurityDsl.g:517:2: ( ( 'INT' ) )
                    {
                    // InternalSecurityDsl.g:517:2: ( ( 'INT' ) )
                    // InternalSecurityDsl.g:518:3: ( 'INT' )
                    {
                     before(grammarAccess.getETypeAccess().getINTEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:519:3: ( 'INT' )
                    // InternalSecurityDsl.g:519:4: 'INT'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getINTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:523:2: ( ( 'STRING' ) )
                    {
                    // InternalSecurityDsl.g:523:2: ( ( 'STRING' ) )
                    // InternalSecurityDsl.g:524:3: ( 'STRING' )
                    {
                     before(grammarAccess.getETypeAccess().getSTRINGEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:525:3: ( 'STRING' )
                    // InternalSecurityDsl.g:525:4: 'STRING'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getSTRINGEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:529:2: ( ( 'FLOAT' ) )
                    {
                    // InternalSecurityDsl.g:529:2: ( ( 'FLOAT' ) )
                    // InternalSecurityDsl.g:530:3: ( 'FLOAT' )
                    {
                     before(grammarAccess.getETypeAccess().getFLOATEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:531:3: ( 'FLOAT' )
                    // InternalSecurityDsl.g:531:4: 'FLOAT'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getFLOATEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:535:2: ( ( 'LONG' ) )
                    {
                    // InternalSecurityDsl.g:535:2: ( ( 'LONG' ) )
                    // InternalSecurityDsl.g:536:3: ( 'LONG' )
                    {
                     before(grammarAccess.getETypeAccess().getLONGEnumLiteralDeclaration_3()); 
                    // InternalSecurityDsl.g:537:3: ( 'LONG' )
                    // InternalSecurityDsl.g:537:4: 'LONG'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getLONGEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSecurityDsl.g:541:2: ( ( 'CHAR' ) )
                    {
                    // InternalSecurityDsl.g:541:2: ( ( 'CHAR' ) )
                    // InternalSecurityDsl.g:542:3: ( 'CHAR' )
                    {
                     before(grammarAccess.getETypeAccess().getCHAREnumLiteralDeclaration_4()); 
                    // InternalSecurityDsl.g:543:3: ( 'CHAR' )
                    // InternalSecurityDsl.g:543:4: 'CHAR'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getCHAREnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSecurityDsl.g:547:2: ( ( 'BOOLEAN' ) )
                    {
                    // InternalSecurityDsl.g:547:2: ( ( 'BOOLEAN' ) )
                    // InternalSecurityDsl.g:548:3: ( 'BOOLEAN' )
                    {
                     before(grammarAccess.getETypeAccess().getBOOLEANEnumLiteralDeclaration_5()); 
                    // InternalSecurityDsl.g:549:3: ( 'BOOLEAN' )
                    // InternalSecurityDsl.g:549:4: 'BOOLEAN'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getBOOLEANEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSecurityDsl.g:553:2: ( ( 'DOUBLE' ) )
                    {
                    // InternalSecurityDsl.g:553:2: ( ( 'DOUBLE' ) )
                    // InternalSecurityDsl.g:554:3: ( 'DOUBLE' )
                    {
                     before(grammarAccess.getETypeAccess().getDOUBLEEnumLiteralDeclaration_6()); 
                    // InternalSecurityDsl.g:555:3: ( 'DOUBLE' )
                    // InternalSecurityDsl.g:555:4: 'DOUBLE'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getDOUBLEEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSecurityDsl.g:559:2: ( ( 'BYTE' ) )
                    {
                    // InternalSecurityDsl.g:559:2: ( ( 'BYTE' ) )
                    // InternalSecurityDsl.g:560:3: ( 'BYTE' )
                    {
                     before(grammarAccess.getETypeAccess().getBYTEEnumLiteralDeclaration_7()); 
                    // InternalSecurityDsl.g:561:3: ( 'BYTE' )
                    // InternalSecurityDsl.g:561:4: 'BYTE'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getBYTEEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSecurityDsl.g:565:2: ( ( 'SHORT' ) )
                    {
                    // InternalSecurityDsl.g:565:2: ( ( 'SHORT' ) )
                    // InternalSecurityDsl.g:566:3: ( 'SHORT' )
                    {
                     before(grammarAccess.getETypeAccess().getSHORTEnumLiteralDeclaration_8()); 
                    // InternalSecurityDsl.g:567:3: ( 'SHORT' )
                    // InternalSecurityDsl.g:567:4: 'SHORT'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getSHORTEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EType__Alternatives"


    // $ANTLR start "rule__EEndpointMethod__Alternatives"
    // InternalSecurityDsl.g:575:1: rule__EEndpointMethod__Alternatives : ( ( ( 'GET' ) ) | ( ( 'PUT' ) ) | ( ( 'POST' ) ) | ( ( 'DELETE' ) ) );
    public final void rule__EEndpointMethod__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:579:1: ( ( ( 'GET' ) ) | ( ( 'PUT' ) ) | ( ( 'POST' ) ) | ( ( 'DELETE' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt3=1;
                }
                break;
            case 24:
                {
                alt3=2;
                }
                break;
            case 25:
                {
                alt3=3;
                }
                break;
            case 26:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSecurityDsl.g:580:2: ( ( 'GET' ) )
                    {
                    // InternalSecurityDsl.g:580:2: ( ( 'GET' ) )
                    // InternalSecurityDsl.g:581:3: ( 'GET' )
                    {
                     before(grammarAccess.getEEndpointMethodAccess().getGETEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:582:3: ( 'GET' )
                    // InternalSecurityDsl.g:582:4: 'GET'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointMethodAccess().getGETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:586:2: ( ( 'PUT' ) )
                    {
                    // InternalSecurityDsl.g:586:2: ( ( 'PUT' ) )
                    // InternalSecurityDsl.g:587:3: ( 'PUT' )
                    {
                     before(grammarAccess.getEEndpointMethodAccess().getPUTEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:588:3: ( 'PUT' )
                    // InternalSecurityDsl.g:588:4: 'PUT'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointMethodAccess().getPUTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:592:2: ( ( 'POST' ) )
                    {
                    // InternalSecurityDsl.g:592:2: ( ( 'POST' ) )
                    // InternalSecurityDsl.g:593:3: ( 'POST' )
                    {
                     before(grammarAccess.getEEndpointMethodAccess().getPOSTEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:594:3: ( 'POST' )
                    // InternalSecurityDsl.g:594:4: 'POST'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointMethodAccess().getPOSTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:598:2: ( ( 'DELETE' ) )
                    {
                    // InternalSecurityDsl.g:598:2: ( ( 'DELETE' ) )
                    // InternalSecurityDsl.g:599:3: ( 'DELETE' )
                    {
                     before(grammarAccess.getEEndpointMethodAccess().getDELETEEnumLiteralDeclaration_3()); 
                    // InternalSecurityDsl.g:600:3: ( 'DELETE' )
                    // InternalSecurityDsl.g:600:4: 'DELETE'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointMethodAccess().getDELETEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EEndpointMethod__Alternatives"


    // $ANTLR start "rule__EDatabaseType__Alternatives"
    // InternalSecurityDsl.g:608:1: rule__EDatabaseType__Alternatives : ( ( ( 'POSTGRES' ) ) | ( ( 'ORACLE' ) ) | ( ( 'MYSQL' ) ) );
    public final void rule__EDatabaseType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:612:1: ( ( ( 'POSTGRES' ) ) | ( ( 'ORACLE' ) ) | ( ( 'MYSQL' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt4=1;
                }
                break;
            case 28:
                {
                alt4=2;
                }
                break;
            case 29:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSecurityDsl.g:613:2: ( ( 'POSTGRES' ) )
                    {
                    // InternalSecurityDsl.g:613:2: ( ( 'POSTGRES' ) )
                    // InternalSecurityDsl.g:614:3: ( 'POSTGRES' )
                    {
                     before(grammarAccess.getEDatabaseTypeAccess().getPOSTGRESEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:615:3: ( 'POSTGRES' )
                    // InternalSecurityDsl.g:615:4: 'POSTGRES'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getEDatabaseTypeAccess().getPOSTGRESEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:619:2: ( ( 'ORACLE' ) )
                    {
                    // InternalSecurityDsl.g:619:2: ( ( 'ORACLE' ) )
                    // InternalSecurityDsl.g:620:3: ( 'ORACLE' )
                    {
                     before(grammarAccess.getEDatabaseTypeAccess().getORACLEEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:621:3: ( 'ORACLE' )
                    // InternalSecurityDsl.g:621:4: 'ORACLE'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getEDatabaseTypeAccess().getORACLEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:625:2: ( ( 'MYSQL' ) )
                    {
                    // InternalSecurityDsl.g:625:2: ( ( 'MYSQL' ) )
                    // InternalSecurityDsl.g:626:3: ( 'MYSQL' )
                    {
                     before(grammarAccess.getEDatabaseTypeAccess().getMYSQLEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:627:3: ( 'MYSQL' )
                    // InternalSecurityDsl.g:627:4: 'MYSQL'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getEDatabaseTypeAccess().getMYSQLEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDatabaseType__Alternatives"


    // $ANTLR start "rule__Application__Group__0"
    // InternalSecurityDsl.g:635:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:639:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // InternalSecurityDsl.g:640:2: rule__Application__Group__0__Impl rule__Application__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Application__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__0"


    // $ANTLR start "rule__Application__Group__0__Impl"
    // InternalSecurityDsl.g:647:1: rule__Application__Group__0__Impl : ( () ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:651:1: ( ( () ) )
            // InternalSecurityDsl.g:652:1: ( () )
            {
            // InternalSecurityDsl.g:652:1: ( () )
            // InternalSecurityDsl.g:653:2: ()
            {
             before(grammarAccess.getApplicationAccess().getApplicationAction_0()); 
            // InternalSecurityDsl.g:654:2: ()
            // InternalSecurityDsl.g:654:3: 
            {
            }

             after(grammarAccess.getApplicationAccess().getApplicationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__0__Impl"


    // $ANTLR start "rule__Application__Group__1"
    // InternalSecurityDsl.g:662:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:666:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // InternalSecurityDsl.g:667:2: rule__Application__Group__1__Impl rule__Application__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Application__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__1"


    // $ANTLR start "rule__Application__Group__1__Impl"
    // InternalSecurityDsl.g:674:1: rule__Application__Group__1__Impl : ( 'application:' ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:678:1: ( ( 'application:' ) )
            // InternalSecurityDsl.g:679:1: ( 'application:' )
            {
            // InternalSecurityDsl.g:679:1: ( 'application:' )
            // InternalSecurityDsl.g:680:2: 'application:'
            {
             before(grammarAccess.getApplicationAccess().getApplicationKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getApplicationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__1__Impl"


    // $ANTLR start "rule__Application__Group__2"
    // InternalSecurityDsl.g:689:1: rule__Application__Group__2 : rule__Application__Group__2__Impl rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:693:1: ( rule__Application__Group__2__Impl rule__Application__Group__3 )
            // InternalSecurityDsl.g:694:2: rule__Application__Group__2__Impl rule__Application__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Application__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__2"


    // $ANTLR start "rule__Application__Group__2__Impl"
    // InternalSecurityDsl.g:701:1: rule__Application__Group__2__Impl : ( 'name:' ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:705:1: ( ( 'name:' ) )
            // InternalSecurityDsl.g:706:1: ( 'name:' )
            {
            // InternalSecurityDsl.g:706:1: ( 'name:' )
            // InternalSecurityDsl.g:707:2: 'name:'
            {
             before(grammarAccess.getApplicationAccess().getNameKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__2__Impl"


    // $ANTLR start "rule__Application__Group__3"
    // InternalSecurityDsl.g:716:1: rule__Application__Group__3 : rule__Application__Group__3__Impl rule__Application__Group__4 ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:720:1: ( rule__Application__Group__3__Impl rule__Application__Group__4 )
            // InternalSecurityDsl.g:721:2: rule__Application__Group__3__Impl rule__Application__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Application__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__3"


    // $ANTLR start "rule__Application__Group__3__Impl"
    // InternalSecurityDsl.g:728:1: rule__Application__Group__3__Impl : ( ( rule__Application__NameAssignment_3 ) ) ;
    public final void rule__Application__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:732:1: ( ( ( rule__Application__NameAssignment_3 ) ) )
            // InternalSecurityDsl.g:733:1: ( ( rule__Application__NameAssignment_3 ) )
            {
            // InternalSecurityDsl.g:733:1: ( ( rule__Application__NameAssignment_3 ) )
            // InternalSecurityDsl.g:734:2: ( rule__Application__NameAssignment_3 )
            {
             before(grammarAccess.getApplicationAccess().getNameAssignment_3()); 
            // InternalSecurityDsl.g:735:2: ( rule__Application__NameAssignment_3 )
            // InternalSecurityDsl.g:735:3: rule__Application__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Application__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__3__Impl"


    // $ANTLR start "rule__Application__Group__4"
    // InternalSecurityDsl.g:743:1: rule__Application__Group__4 : rule__Application__Group__4__Impl rule__Application__Group__5 ;
    public final void rule__Application__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:747:1: ( rule__Application__Group__4__Impl rule__Application__Group__5 )
            // InternalSecurityDsl.g:748:2: rule__Application__Group__4__Impl rule__Application__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Application__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__4"


    // $ANTLR start "rule__Application__Group__4__Impl"
    // InternalSecurityDsl.g:755:1: rule__Application__Group__4__Impl : ( ( rule__Application__Group_4__0 )? ) ;
    public final void rule__Application__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:759:1: ( ( ( rule__Application__Group_4__0 )? ) )
            // InternalSecurityDsl.g:760:1: ( ( rule__Application__Group_4__0 )? )
            {
            // InternalSecurityDsl.g:760:1: ( ( rule__Application__Group_4__0 )? )
            // InternalSecurityDsl.g:761:2: ( rule__Application__Group_4__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_4()); 
            // InternalSecurityDsl.g:762:2: ( rule__Application__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==32) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSecurityDsl.g:762:3: rule__Application__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Application__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__4__Impl"


    // $ANTLR start "rule__Application__Group__5"
    // InternalSecurityDsl.g:770:1: rule__Application__Group__5 : rule__Application__Group__5__Impl rule__Application__Group__6 ;
    public final void rule__Application__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:774:1: ( rule__Application__Group__5__Impl rule__Application__Group__6 )
            // InternalSecurityDsl.g:775:2: rule__Application__Group__5__Impl rule__Application__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Application__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__5"


    // $ANTLR start "rule__Application__Group__5__Impl"
    // InternalSecurityDsl.g:782:1: rule__Application__Group__5__Impl : ( ( rule__Application__Group_5__0 )? ) ;
    public final void rule__Application__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:786:1: ( ( ( rule__Application__Group_5__0 )? ) )
            // InternalSecurityDsl.g:787:1: ( ( rule__Application__Group_5__0 )? )
            {
            // InternalSecurityDsl.g:787:1: ( ( rule__Application__Group_5__0 )? )
            // InternalSecurityDsl.g:788:2: ( rule__Application__Group_5__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_5()); 
            // InternalSecurityDsl.g:789:2: ( rule__Application__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==33) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSecurityDsl.g:789:3: rule__Application__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Application__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__5__Impl"


    // $ANTLR start "rule__Application__Group__6"
    // InternalSecurityDsl.g:797:1: rule__Application__Group__6 : rule__Application__Group__6__Impl ;
    public final void rule__Application__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:801:1: ( rule__Application__Group__6__Impl )
            // InternalSecurityDsl.g:802:2: rule__Application__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__6"


    // $ANTLR start "rule__Application__Group__6__Impl"
    // InternalSecurityDsl.g:808:1: rule__Application__Group__6__Impl : ( ( rule__Application__Group_6__0 )? ) ;
    public final void rule__Application__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:812:1: ( ( ( rule__Application__Group_6__0 )? ) )
            // InternalSecurityDsl.g:813:1: ( ( rule__Application__Group_6__0 )? )
            {
            // InternalSecurityDsl.g:813:1: ( ( rule__Application__Group_6__0 )? )
            // InternalSecurityDsl.g:814:2: ( rule__Application__Group_6__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_6()); 
            // InternalSecurityDsl.g:815:2: ( rule__Application__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==34) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSecurityDsl.g:815:3: rule__Application__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Application__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__6__Impl"


    // $ANTLR start "rule__Application__Group_4__0"
    // InternalSecurityDsl.g:824:1: rule__Application__Group_4__0 : rule__Application__Group_4__0__Impl rule__Application__Group_4__1 ;
    public final void rule__Application__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:828:1: ( rule__Application__Group_4__0__Impl rule__Application__Group_4__1 )
            // InternalSecurityDsl.g:829:2: rule__Application__Group_4__0__Impl rule__Application__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Application__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_4__0"


    // $ANTLR start "rule__Application__Group_4__0__Impl"
    // InternalSecurityDsl.g:836:1: rule__Application__Group_4__0__Impl : ( 'description:' ) ;
    public final void rule__Application__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:840:1: ( ( 'description:' ) )
            // InternalSecurityDsl.g:841:1: ( 'description:' )
            {
            // InternalSecurityDsl.g:841:1: ( 'description:' )
            // InternalSecurityDsl.g:842:2: 'description:'
            {
             before(grammarAccess.getApplicationAccess().getDescriptionKeyword_4_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getDescriptionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_4__0__Impl"


    // $ANTLR start "rule__Application__Group_4__1"
    // InternalSecurityDsl.g:851:1: rule__Application__Group_4__1 : rule__Application__Group_4__1__Impl ;
    public final void rule__Application__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:855:1: ( rule__Application__Group_4__1__Impl )
            // InternalSecurityDsl.g:856:2: rule__Application__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_4__1"


    // $ANTLR start "rule__Application__Group_4__1__Impl"
    // InternalSecurityDsl.g:862:1: rule__Application__Group_4__1__Impl : ( ( rule__Application__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Application__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:866:1: ( ( ( rule__Application__DescriptionAssignment_4_1 ) ) )
            // InternalSecurityDsl.g:867:1: ( ( rule__Application__DescriptionAssignment_4_1 ) )
            {
            // InternalSecurityDsl.g:867:1: ( ( rule__Application__DescriptionAssignment_4_1 ) )
            // InternalSecurityDsl.g:868:2: ( rule__Application__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getApplicationAccess().getDescriptionAssignment_4_1()); 
            // InternalSecurityDsl.g:869:2: ( rule__Application__DescriptionAssignment_4_1 )
            // InternalSecurityDsl.g:869:3: rule__Application__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__DescriptionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getDescriptionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_4__1__Impl"


    // $ANTLR start "rule__Application__Group_5__0"
    // InternalSecurityDsl.g:878:1: rule__Application__Group_5__0 : rule__Application__Group_5__0__Impl rule__Application__Group_5__1 ;
    public final void rule__Application__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:882:1: ( rule__Application__Group_5__0__Impl rule__Application__Group_5__1 )
            // InternalSecurityDsl.g:883:2: rule__Application__Group_5__0__Impl rule__Application__Group_5__1
            {
            pushFollow(FOLLOW_7);
            rule__Application__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_5__0"


    // $ANTLR start "rule__Application__Group_5__0__Impl"
    // InternalSecurityDsl.g:890:1: rule__Application__Group_5__0__Impl : ( 'database:' ) ;
    public final void rule__Application__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:894:1: ( ( 'database:' ) )
            // InternalSecurityDsl.g:895:1: ( 'database:' )
            {
            // InternalSecurityDsl.g:895:1: ( 'database:' )
            // InternalSecurityDsl.g:896:2: 'database:'
            {
             before(grammarAccess.getApplicationAccess().getDatabaseKeyword_5_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getDatabaseKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_5__0__Impl"


    // $ANTLR start "rule__Application__Group_5__1"
    // InternalSecurityDsl.g:905:1: rule__Application__Group_5__1 : rule__Application__Group_5__1__Impl ;
    public final void rule__Application__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:909:1: ( rule__Application__Group_5__1__Impl )
            // InternalSecurityDsl.g:910:2: rule__Application__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_5__1"


    // $ANTLR start "rule__Application__Group_5__1__Impl"
    // InternalSecurityDsl.g:916:1: rule__Application__Group_5__1__Impl : ( ( rule__Application__App_databaseAssignment_5_1 ) ) ;
    public final void rule__Application__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:920:1: ( ( ( rule__Application__App_databaseAssignment_5_1 ) ) )
            // InternalSecurityDsl.g:921:1: ( ( rule__Application__App_databaseAssignment_5_1 ) )
            {
            // InternalSecurityDsl.g:921:1: ( ( rule__Application__App_databaseAssignment_5_1 ) )
            // InternalSecurityDsl.g:922:2: ( rule__Application__App_databaseAssignment_5_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_databaseAssignment_5_1()); 
            // InternalSecurityDsl.g:923:2: ( rule__Application__App_databaseAssignment_5_1 )
            // InternalSecurityDsl.g:923:3: rule__Application__App_databaseAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__App_databaseAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getApp_databaseAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_5__1__Impl"


    // $ANTLR start "rule__Application__Group_6__0"
    // InternalSecurityDsl.g:932:1: rule__Application__Group_6__0 : rule__Application__Group_6__0__Impl rule__Application__Group_6__1 ;
    public final void rule__Application__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:936:1: ( rule__Application__Group_6__0__Impl rule__Application__Group_6__1 )
            // InternalSecurityDsl.g:937:2: rule__Application__Group_6__0__Impl rule__Application__Group_6__1
            {
            pushFollow(FOLLOW_8);
            rule__Application__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_6__0"


    // $ANTLR start "rule__Application__Group_6__0__Impl"
    // InternalSecurityDsl.g:944:1: rule__Application__Group_6__0__Impl : ( 'security:' ) ;
    public final void rule__Application__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:948:1: ( ( 'security:' ) )
            // InternalSecurityDsl.g:949:1: ( 'security:' )
            {
            // InternalSecurityDsl.g:949:1: ( 'security:' )
            // InternalSecurityDsl.g:950:2: 'security:'
            {
             before(grammarAccess.getApplicationAccess().getSecurityKeyword_6_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getSecurityKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_6__0__Impl"


    // $ANTLR start "rule__Application__Group_6__1"
    // InternalSecurityDsl.g:959:1: rule__Application__Group_6__1 : rule__Application__Group_6__1__Impl ;
    public final void rule__Application__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:963:1: ( rule__Application__Group_6__1__Impl )
            // InternalSecurityDsl.g:964:2: rule__Application__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_6__1"


    // $ANTLR start "rule__Application__Group_6__1__Impl"
    // InternalSecurityDsl.g:970:1: rule__Application__Group_6__1__Impl : ( ( rule__Application__App_securityAssignment_6_1 ) ) ;
    public final void rule__Application__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:974:1: ( ( ( rule__Application__App_securityAssignment_6_1 ) ) )
            // InternalSecurityDsl.g:975:1: ( ( rule__Application__App_securityAssignment_6_1 ) )
            {
            // InternalSecurityDsl.g:975:1: ( ( rule__Application__App_securityAssignment_6_1 ) )
            // InternalSecurityDsl.g:976:2: ( rule__Application__App_securityAssignment_6_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_securityAssignment_6_1()); 
            // InternalSecurityDsl.g:977:2: ( rule__Application__App_securityAssignment_6_1 )
            // InternalSecurityDsl.g:977:3: rule__Application__App_securityAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__App_securityAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getApp_securityAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_6__1__Impl"


    // $ANTLR start "rule__Database__Group__0"
    // InternalSecurityDsl.g:986:1: rule__Database__Group__0 : rule__Database__Group__0__Impl rule__Database__Group__1 ;
    public final void rule__Database__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:990:1: ( rule__Database__Group__0__Impl rule__Database__Group__1 )
            // InternalSecurityDsl.g:991:2: rule__Database__Group__0__Impl rule__Database__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Database__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Database__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__0"


    // $ANTLR start "rule__Database__Group__0__Impl"
    // InternalSecurityDsl.g:998:1: rule__Database__Group__0__Impl : ( 'vendorName:' ) ;
    public final void rule__Database__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1002:1: ( ( 'vendorName:' ) )
            // InternalSecurityDsl.g:1003:1: ( 'vendorName:' )
            {
            // InternalSecurityDsl.g:1003:1: ( 'vendorName:' )
            // InternalSecurityDsl.g:1004:2: 'vendorName:'
            {
             before(grammarAccess.getDatabaseAccess().getVendorNameKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDatabaseAccess().getVendorNameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__0__Impl"


    // $ANTLR start "rule__Database__Group__1"
    // InternalSecurityDsl.g:1013:1: rule__Database__Group__1 : rule__Database__Group__1__Impl rule__Database__Group__2 ;
    public final void rule__Database__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1017:1: ( rule__Database__Group__1__Impl rule__Database__Group__2 )
            // InternalSecurityDsl.g:1018:2: rule__Database__Group__1__Impl rule__Database__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Database__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Database__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__1"


    // $ANTLR start "rule__Database__Group__1__Impl"
    // InternalSecurityDsl.g:1025:1: rule__Database__Group__1__Impl : ( ( rule__Database__VendorNameAssignment_1 ) ) ;
    public final void rule__Database__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1029:1: ( ( ( rule__Database__VendorNameAssignment_1 ) ) )
            // InternalSecurityDsl.g:1030:1: ( ( rule__Database__VendorNameAssignment_1 ) )
            {
            // InternalSecurityDsl.g:1030:1: ( ( rule__Database__VendorNameAssignment_1 ) )
            // InternalSecurityDsl.g:1031:2: ( rule__Database__VendorNameAssignment_1 )
            {
             before(grammarAccess.getDatabaseAccess().getVendorNameAssignment_1()); 
            // InternalSecurityDsl.g:1032:2: ( rule__Database__VendorNameAssignment_1 )
            // InternalSecurityDsl.g:1032:3: rule__Database__VendorNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Database__VendorNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getVendorNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__1__Impl"


    // $ANTLR start "rule__Database__Group__2"
    // InternalSecurityDsl.g:1040:1: rule__Database__Group__2 : rule__Database__Group__2__Impl rule__Database__Group__3 ;
    public final void rule__Database__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1044:1: ( rule__Database__Group__2__Impl rule__Database__Group__3 )
            // InternalSecurityDsl.g:1045:2: rule__Database__Group__2__Impl rule__Database__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Database__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Database__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__2"


    // $ANTLR start "rule__Database__Group__2__Impl"
    // InternalSecurityDsl.g:1052:1: rule__Database__Group__2__Impl : ( 'url:' ) ;
    public final void rule__Database__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1056:1: ( ( 'url:' ) )
            // InternalSecurityDsl.g:1057:1: ( 'url:' )
            {
            // InternalSecurityDsl.g:1057:1: ( 'url:' )
            // InternalSecurityDsl.g:1058:2: 'url:'
            {
             before(grammarAccess.getDatabaseAccess().getUrlKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDatabaseAccess().getUrlKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__2__Impl"


    // $ANTLR start "rule__Database__Group__3"
    // InternalSecurityDsl.g:1067:1: rule__Database__Group__3 : rule__Database__Group__3__Impl rule__Database__Group__4 ;
    public final void rule__Database__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1071:1: ( rule__Database__Group__3__Impl rule__Database__Group__4 )
            // InternalSecurityDsl.g:1072:2: rule__Database__Group__3__Impl rule__Database__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Database__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Database__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__3"


    // $ANTLR start "rule__Database__Group__3__Impl"
    // InternalSecurityDsl.g:1079:1: rule__Database__Group__3__Impl : ( ( rule__Database__UrlAssignment_3 ) ) ;
    public final void rule__Database__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1083:1: ( ( ( rule__Database__UrlAssignment_3 ) ) )
            // InternalSecurityDsl.g:1084:1: ( ( rule__Database__UrlAssignment_3 ) )
            {
            // InternalSecurityDsl.g:1084:1: ( ( rule__Database__UrlAssignment_3 ) )
            // InternalSecurityDsl.g:1085:2: ( rule__Database__UrlAssignment_3 )
            {
             before(grammarAccess.getDatabaseAccess().getUrlAssignment_3()); 
            // InternalSecurityDsl.g:1086:2: ( rule__Database__UrlAssignment_3 )
            // InternalSecurityDsl.g:1086:3: rule__Database__UrlAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Database__UrlAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getUrlAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__3__Impl"


    // $ANTLR start "rule__Database__Group__4"
    // InternalSecurityDsl.g:1094:1: rule__Database__Group__4 : rule__Database__Group__4__Impl rule__Database__Group__5 ;
    public final void rule__Database__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1098:1: ( rule__Database__Group__4__Impl rule__Database__Group__5 )
            // InternalSecurityDsl.g:1099:2: rule__Database__Group__4__Impl rule__Database__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Database__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Database__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__4"


    // $ANTLR start "rule__Database__Group__4__Impl"
    // InternalSecurityDsl.g:1106:1: rule__Database__Group__4__Impl : ( 'username:' ) ;
    public final void rule__Database__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1110:1: ( ( 'username:' ) )
            // InternalSecurityDsl.g:1111:1: ( 'username:' )
            {
            // InternalSecurityDsl.g:1111:1: ( 'username:' )
            // InternalSecurityDsl.g:1112:2: 'username:'
            {
             before(grammarAccess.getDatabaseAccess().getUsernameKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDatabaseAccess().getUsernameKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__4__Impl"


    // $ANTLR start "rule__Database__Group__5"
    // InternalSecurityDsl.g:1121:1: rule__Database__Group__5 : rule__Database__Group__5__Impl rule__Database__Group__6 ;
    public final void rule__Database__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1125:1: ( rule__Database__Group__5__Impl rule__Database__Group__6 )
            // InternalSecurityDsl.g:1126:2: rule__Database__Group__5__Impl rule__Database__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Database__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Database__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__5"


    // $ANTLR start "rule__Database__Group__5__Impl"
    // InternalSecurityDsl.g:1133:1: rule__Database__Group__5__Impl : ( ( rule__Database__UsernameAssignment_5 ) ) ;
    public final void rule__Database__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1137:1: ( ( ( rule__Database__UsernameAssignment_5 ) ) )
            // InternalSecurityDsl.g:1138:1: ( ( rule__Database__UsernameAssignment_5 ) )
            {
            // InternalSecurityDsl.g:1138:1: ( ( rule__Database__UsernameAssignment_5 ) )
            // InternalSecurityDsl.g:1139:2: ( rule__Database__UsernameAssignment_5 )
            {
             before(grammarAccess.getDatabaseAccess().getUsernameAssignment_5()); 
            // InternalSecurityDsl.g:1140:2: ( rule__Database__UsernameAssignment_5 )
            // InternalSecurityDsl.g:1140:3: rule__Database__UsernameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Database__UsernameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getUsernameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__5__Impl"


    // $ANTLR start "rule__Database__Group__6"
    // InternalSecurityDsl.g:1148:1: rule__Database__Group__6 : rule__Database__Group__6__Impl rule__Database__Group__7 ;
    public final void rule__Database__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1152:1: ( rule__Database__Group__6__Impl rule__Database__Group__7 )
            // InternalSecurityDsl.g:1153:2: rule__Database__Group__6__Impl rule__Database__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__Database__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Database__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__6"


    // $ANTLR start "rule__Database__Group__6__Impl"
    // InternalSecurityDsl.g:1160:1: rule__Database__Group__6__Impl : ( 'password:' ) ;
    public final void rule__Database__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1164:1: ( ( 'password:' ) )
            // InternalSecurityDsl.g:1165:1: ( 'password:' )
            {
            // InternalSecurityDsl.g:1165:1: ( 'password:' )
            // InternalSecurityDsl.g:1166:2: 'password:'
            {
             before(grammarAccess.getDatabaseAccess().getPasswordKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDatabaseAccess().getPasswordKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__6__Impl"


    // $ANTLR start "rule__Database__Group__7"
    // InternalSecurityDsl.g:1175:1: rule__Database__Group__7 : rule__Database__Group__7__Impl ;
    public final void rule__Database__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1179:1: ( rule__Database__Group__7__Impl )
            // InternalSecurityDsl.g:1180:2: rule__Database__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Database__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__7"


    // $ANTLR start "rule__Database__Group__7__Impl"
    // InternalSecurityDsl.g:1186:1: rule__Database__Group__7__Impl : ( ( rule__Database__PasswordAssignment_7 ) ) ;
    public final void rule__Database__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1190:1: ( ( ( rule__Database__PasswordAssignment_7 ) ) )
            // InternalSecurityDsl.g:1191:1: ( ( rule__Database__PasswordAssignment_7 ) )
            {
            // InternalSecurityDsl.g:1191:1: ( ( rule__Database__PasswordAssignment_7 ) )
            // InternalSecurityDsl.g:1192:2: ( rule__Database__PasswordAssignment_7 )
            {
             before(grammarAccess.getDatabaseAccess().getPasswordAssignment_7()); 
            // InternalSecurityDsl.g:1193:2: ( rule__Database__PasswordAssignment_7 )
            // InternalSecurityDsl.g:1193:3: rule__Database__PasswordAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Database__PasswordAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getPasswordAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__7__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalSecurityDsl.g:1202:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1206:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalSecurityDsl.g:1207:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalSecurityDsl.g:1214:1: rule__Attribute__Group__0__Impl : ( 'Attribute' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1218:1: ( ( 'Attribute' ) )
            // InternalSecurityDsl.g:1219:1: ( 'Attribute' )
            {
            // InternalSecurityDsl.g:1219:1: ( 'Attribute' )
            // InternalSecurityDsl.g:1220:2: 'Attribute'
            {
             before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalSecurityDsl.g:1229:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1233:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalSecurityDsl.g:1234:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalSecurityDsl.g:1241:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1245:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalSecurityDsl.g:1246:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalSecurityDsl.g:1246:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalSecurityDsl.g:1247:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalSecurityDsl.g:1248:2: ( rule__Attribute__NameAssignment_1 )
            // InternalSecurityDsl.g:1248:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalSecurityDsl.g:1256:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1260:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalSecurityDsl.g:1261:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalSecurityDsl.g:1268:1: rule__Attribute__Group__2__Impl : ( '{' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1272:1: ( ( '{' ) )
            // InternalSecurityDsl.g:1273:1: ( '{' )
            {
            // InternalSecurityDsl.g:1273:1: ( '{' )
            // InternalSecurityDsl.g:1274:2: '{'
            {
             before(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalSecurityDsl.g:1283:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1287:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalSecurityDsl.g:1288:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalSecurityDsl.g:1295:1: rule__Attribute__Group__3__Impl : ( 'type' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1299:1: ( ( 'type' ) )
            // InternalSecurityDsl.g:1300:1: ( 'type' )
            {
            // InternalSecurityDsl.g:1300:1: ( 'type' )
            // InternalSecurityDsl.g:1301:2: 'type'
            {
             before(grammarAccess.getAttributeAccess().getTypeKeyword_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // InternalSecurityDsl.g:1310:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1314:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalSecurityDsl.g:1315:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Attribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // InternalSecurityDsl.g:1322:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__TypeAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1326:1: ( ( ( rule__Attribute__TypeAssignment_4 ) ) )
            // InternalSecurityDsl.g:1327:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            {
            // InternalSecurityDsl.g:1327:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            // InternalSecurityDsl.g:1328:2: ( rule__Attribute__TypeAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_4()); 
            // InternalSecurityDsl.g:1329:2: ( rule__Attribute__TypeAssignment_4 )
            // InternalSecurityDsl.g:1329:3: rule__Attribute__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__5"
    // InternalSecurityDsl.g:1337:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1341:1: ( rule__Attribute__Group__5__Impl )
            // InternalSecurityDsl.g:1342:2: rule__Attribute__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__5"


    // $ANTLR start "rule__Attribute__Group__5__Impl"
    // InternalSecurityDsl.g:1348:1: rule__Attribute__Group__5__Impl : ( '}' ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1352:1: ( ( '}' ) )
            // InternalSecurityDsl.g:1353:1: ( '}' )
            {
            // InternalSecurityDsl.g:1353:1: ( '}' )
            // InternalSecurityDsl.g:1354:2: '}'
            {
             before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__5__Impl"


    // $ANTLR start "rule__User__Group__0"
    // InternalSecurityDsl.g:1364:1: rule__User__Group__0 : rule__User__Group__0__Impl rule__User__Group__1 ;
    public final void rule__User__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1368:1: ( rule__User__Group__0__Impl rule__User__Group__1 )
            // InternalSecurityDsl.g:1369:2: rule__User__Group__0__Impl rule__User__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__User__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__0"


    // $ANTLR start "rule__User__Group__0__Impl"
    // InternalSecurityDsl.g:1376:1: rule__User__Group__0__Impl : ( 'User' ) ;
    public final void rule__User__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1380:1: ( ( 'User' ) )
            // InternalSecurityDsl.g:1381:1: ( 'User' )
            {
            // InternalSecurityDsl.g:1381:1: ( 'User' )
            // InternalSecurityDsl.g:1382:2: 'User'
            {
             before(grammarAccess.getUserAccess().getUserKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getUserKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__0__Impl"


    // $ANTLR start "rule__User__Group__1"
    // InternalSecurityDsl.g:1391:1: rule__User__Group__1 : rule__User__Group__1__Impl rule__User__Group__2 ;
    public final void rule__User__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1395:1: ( rule__User__Group__1__Impl rule__User__Group__2 )
            // InternalSecurityDsl.g:1396:2: rule__User__Group__1__Impl rule__User__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__User__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__1"


    // $ANTLR start "rule__User__Group__1__Impl"
    // InternalSecurityDsl.g:1403:1: rule__User__Group__1__Impl : ( '{' ) ;
    public final void rule__User__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1407:1: ( ( '{' ) )
            // InternalSecurityDsl.g:1408:1: ( '{' )
            {
            // InternalSecurityDsl.g:1408:1: ( '{' )
            // InternalSecurityDsl.g:1409:2: '{'
            {
             before(grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__1__Impl"


    // $ANTLR start "rule__User__Group__2"
    // InternalSecurityDsl.g:1418:1: rule__User__Group__2 : rule__User__Group__2__Impl rule__User__Group__3 ;
    public final void rule__User__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1422:1: ( rule__User__Group__2__Impl rule__User__Group__3 )
            // InternalSecurityDsl.g:1423:2: rule__User__Group__2__Impl rule__User__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__User__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__2"


    // $ANTLR start "rule__User__Group__2__Impl"
    // InternalSecurityDsl.g:1430:1: rule__User__Group__2__Impl : ( 'identifierName' ) ;
    public final void rule__User__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1434:1: ( ( 'identifierName' ) )
            // InternalSecurityDsl.g:1435:1: ( 'identifierName' )
            {
            // InternalSecurityDsl.g:1435:1: ( 'identifierName' )
            // InternalSecurityDsl.g:1436:2: 'identifierName'
            {
             before(grammarAccess.getUserAccess().getIdentifierNameKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getIdentifierNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__2__Impl"


    // $ANTLR start "rule__User__Group__3"
    // InternalSecurityDsl.g:1445:1: rule__User__Group__3 : rule__User__Group__3__Impl rule__User__Group__4 ;
    public final void rule__User__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1449:1: ( rule__User__Group__3__Impl rule__User__Group__4 )
            // InternalSecurityDsl.g:1450:2: rule__User__Group__3__Impl rule__User__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__User__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__3"


    // $ANTLR start "rule__User__Group__3__Impl"
    // InternalSecurityDsl.g:1457:1: rule__User__Group__3__Impl : ( ( rule__User__IdentifierNameAssignment_3 ) ) ;
    public final void rule__User__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1461:1: ( ( ( rule__User__IdentifierNameAssignment_3 ) ) )
            // InternalSecurityDsl.g:1462:1: ( ( rule__User__IdentifierNameAssignment_3 ) )
            {
            // InternalSecurityDsl.g:1462:1: ( ( rule__User__IdentifierNameAssignment_3 ) )
            // InternalSecurityDsl.g:1463:2: ( rule__User__IdentifierNameAssignment_3 )
            {
             before(grammarAccess.getUserAccess().getIdentifierNameAssignment_3()); 
            // InternalSecurityDsl.g:1464:2: ( rule__User__IdentifierNameAssignment_3 )
            // InternalSecurityDsl.g:1464:3: rule__User__IdentifierNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__User__IdentifierNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getIdentifierNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__3__Impl"


    // $ANTLR start "rule__User__Group__4"
    // InternalSecurityDsl.g:1472:1: rule__User__Group__4 : rule__User__Group__4__Impl rule__User__Group__5 ;
    public final void rule__User__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1476:1: ( rule__User__Group__4__Impl rule__User__Group__5 )
            // InternalSecurityDsl.g:1477:2: rule__User__Group__4__Impl rule__User__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__User__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__4"


    // $ANTLR start "rule__User__Group__4__Impl"
    // InternalSecurityDsl.g:1484:1: rule__User__Group__4__Impl : ( 'identifierType' ) ;
    public final void rule__User__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1488:1: ( ( 'identifierType' ) )
            // InternalSecurityDsl.g:1489:1: ( 'identifierType' )
            {
            // InternalSecurityDsl.g:1489:1: ( 'identifierType' )
            // InternalSecurityDsl.g:1490:2: 'identifierType'
            {
             before(grammarAccess.getUserAccess().getIdentifierTypeKeyword_4()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getIdentifierTypeKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__4__Impl"


    // $ANTLR start "rule__User__Group__5"
    // InternalSecurityDsl.g:1499:1: rule__User__Group__5 : rule__User__Group__5__Impl rule__User__Group__6 ;
    public final void rule__User__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1503:1: ( rule__User__Group__5__Impl rule__User__Group__6 )
            // InternalSecurityDsl.g:1504:2: rule__User__Group__5__Impl rule__User__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__User__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__5"


    // $ANTLR start "rule__User__Group__5__Impl"
    // InternalSecurityDsl.g:1511:1: rule__User__Group__5__Impl : ( ( rule__User__IdentifierTypeAssignment_5 ) ) ;
    public final void rule__User__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1515:1: ( ( ( rule__User__IdentifierTypeAssignment_5 ) ) )
            // InternalSecurityDsl.g:1516:1: ( ( rule__User__IdentifierTypeAssignment_5 ) )
            {
            // InternalSecurityDsl.g:1516:1: ( ( rule__User__IdentifierTypeAssignment_5 ) )
            // InternalSecurityDsl.g:1517:2: ( rule__User__IdentifierTypeAssignment_5 )
            {
             before(grammarAccess.getUserAccess().getIdentifierTypeAssignment_5()); 
            // InternalSecurityDsl.g:1518:2: ( rule__User__IdentifierTypeAssignment_5 )
            // InternalSecurityDsl.g:1518:3: rule__User__IdentifierTypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__User__IdentifierTypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getIdentifierTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__5__Impl"


    // $ANTLR start "rule__User__Group__6"
    // InternalSecurityDsl.g:1526:1: rule__User__Group__6 : rule__User__Group__6__Impl rule__User__Group__7 ;
    public final void rule__User__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1530:1: ( rule__User__Group__6__Impl rule__User__Group__7 )
            // InternalSecurityDsl.g:1531:2: rule__User__Group__6__Impl rule__User__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__User__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__6"


    // $ANTLR start "rule__User__Group__6__Impl"
    // InternalSecurityDsl.g:1538:1: rule__User__Group__6__Impl : ( ( rule__User__Group_6__0 )? ) ;
    public final void rule__User__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1542:1: ( ( ( rule__User__Group_6__0 )? ) )
            // InternalSecurityDsl.g:1543:1: ( ( rule__User__Group_6__0 )? )
            {
            // InternalSecurityDsl.g:1543:1: ( ( rule__User__Group_6__0 )? )
            // InternalSecurityDsl.g:1544:2: ( rule__User__Group_6__0 )?
            {
             before(grammarAccess.getUserAccess().getGroup_6()); 
            // InternalSecurityDsl.g:1545:2: ( rule__User__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==46) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSecurityDsl.g:1545:3: rule__User__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__User__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUserAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__6__Impl"


    // $ANTLR start "rule__User__Group__7"
    // InternalSecurityDsl.g:1553:1: rule__User__Group__7 : rule__User__Group__7__Impl ;
    public final void rule__User__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1557:1: ( rule__User__Group__7__Impl )
            // InternalSecurityDsl.g:1558:2: rule__User__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__User__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__7"


    // $ANTLR start "rule__User__Group__7__Impl"
    // InternalSecurityDsl.g:1564:1: rule__User__Group__7__Impl : ( '}' ) ;
    public final void rule__User__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1568:1: ( ( '}' ) )
            // InternalSecurityDsl.g:1569:1: ( '}' )
            {
            // InternalSecurityDsl.g:1569:1: ( '}' )
            // InternalSecurityDsl.g:1570:2: '}'
            {
             before(grammarAccess.getUserAccess().getRightCurlyBracketKeyword_7()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__7__Impl"


    // $ANTLR start "rule__User__Group_6__0"
    // InternalSecurityDsl.g:1580:1: rule__User__Group_6__0 : rule__User__Group_6__0__Impl rule__User__Group_6__1 ;
    public final void rule__User__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1584:1: ( rule__User__Group_6__0__Impl rule__User__Group_6__1 )
            // InternalSecurityDsl.g:1585:2: rule__User__Group_6__0__Impl rule__User__Group_6__1
            {
            pushFollow(FOLLOW_13);
            rule__User__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_6__0"


    // $ANTLR start "rule__User__Group_6__0__Impl"
    // InternalSecurityDsl.g:1592:1: rule__User__Group_6__0__Impl : ( 'model_attributes' ) ;
    public final void rule__User__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1596:1: ( ( 'model_attributes' ) )
            // InternalSecurityDsl.g:1597:1: ( 'model_attributes' )
            {
            // InternalSecurityDsl.g:1597:1: ( 'model_attributes' )
            // InternalSecurityDsl.g:1598:2: 'model_attributes'
            {
             before(grammarAccess.getUserAccess().getModel_attributesKeyword_6_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getModel_attributesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_6__0__Impl"


    // $ANTLR start "rule__User__Group_6__1"
    // InternalSecurityDsl.g:1607:1: rule__User__Group_6__1 : rule__User__Group_6__1__Impl rule__User__Group_6__2 ;
    public final void rule__User__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1611:1: ( rule__User__Group_6__1__Impl rule__User__Group_6__2 )
            // InternalSecurityDsl.g:1612:2: rule__User__Group_6__1__Impl rule__User__Group_6__2
            {
            pushFollow(FOLLOW_20);
            rule__User__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_6__1"


    // $ANTLR start "rule__User__Group_6__1__Impl"
    // InternalSecurityDsl.g:1619:1: rule__User__Group_6__1__Impl : ( '{' ) ;
    public final void rule__User__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1623:1: ( ( '{' ) )
            // InternalSecurityDsl.g:1624:1: ( '{' )
            {
            // InternalSecurityDsl.g:1624:1: ( '{' )
            // InternalSecurityDsl.g:1625:2: '{'
            {
             before(grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_6__1__Impl"


    // $ANTLR start "rule__User__Group_6__2"
    // InternalSecurityDsl.g:1634:1: rule__User__Group_6__2 : rule__User__Group_6__2__Impl rule__User__Group_6__3 ;
    public final void rule__User__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1638:1: ( rule__User__Group_6__2__Impl rule__User__Group_6__3 )
            // InternalSecurityDsl.g:1639:2: rule__User__Group_6__2__Impl rule__User__Group_6__3
            {
            pushFollow(FOLLOW_21);
            rule__User__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_6__2"


    // $ANTLR start "rule__User__Group_6__2__Impl"
    // InternalSecurityDsl.g:1646:1: rule__User__Group_6__2__Impl : ( ( rule__User__Model_attributesAssignment_6_2 ) ) ;
    public final void rule__User__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1650:1: ( ( ( rule__User__Model_attributesAssignment_6_2 ) ) )
            // InternalSecurityDsl.g:1651:1: ( ( rule__User__Model_attributesAssignment_6_2 ) )
            {
            // InternalSecurityDsl.g:1651:1: ( ( rule__User__Model_attributesAssignment_6_2 ) )
            // InternalSecurityDsl.g:1652:2: ( rule__User__Model_attributesAssignment_6_2 )
            {
             before(grammarAccess.getUserAccess().getModel_attributesAssignment_6_2()); 
            // InternalSecurityDsl.g:1653:2: ( rule__User__Model_attributesAssignment_6_2 )
            // InternalSecurityDsl.g:1653:3: rule__User__Model_attributesAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__User__Model_attributesAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getModel_attributesAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_6__2__Impl"


    // $ANTLR start "rule__User__Group_6__3"
    // InternalSecurityDsl.g:1661:1: rule__User__Group_6__3 : rule__User__Group_6__3__Impl rule__User__Group_6__4 ;
    public final void rule__User__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1665:1: ( rule__User__Group_6__3__Impl rule__User__Group_6__4 )
            // InternalSecurityDsl.g:1666:2: rule__User__Group_6__3__Impl rule__User__Group_6__4
            {
            pushFollow(FOLLOW_21);
            rule__User__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_6__3"


    // $ANTLR start "rule__User__Group_6__3__Impl"
    // InternalSecurityDsl.g:1673:1: rule__User__Group_6__3__Impl : ( ( rule__User__Group_6_3__0 )* ) ;
    public final void rule__User__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1677:1: ( ( ( rule__User__Group_6_3__0 )* ) )
            // InternalSecurityDsl.g:1678:1: ( ( rule__User__Group_6_3__0 )* )
            {
            // InternalSecurityDsl.g:1678:1: ( ( rule__User__Group_6_3__0 )* )
            // InternalSecurityDsl.g:1679:2: ( rule__User__Group_6_3__0 )*
            {
             before(grammarAccess.getUserAccess().getGroup_6_3()); 
            // InternalSecurityDsl.g:1680:2: ( rule__User__Group_6_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==47) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSecurityDsl.g:1680:3: rule__User__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__User__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getUserAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_6__3__Impl"


    // $ANTLR start "rule__User__Group_6__4"
    // InternalSecurityDsl.g:1688:1: rule__User__Group_6__4 : rule__User__Group_6__4__Impl ;
    public final void rule__User__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1692:1: ( rule__User__Group_6__4__Impl )
            // InternalSecurityDsl.g:1693:2: rule__User__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__User__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_6__4"


    // $ANTLR start "rule__User__Group_6__4__Impl"
    // InternalSecurityDsl.g:1699:1: rule__User__Group_6__4__Impl : ( '}' ) ;
    public final void rule__User__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1703:1: ( ( '}' ) )
            // InternalSecurityDsl.g:1704:1: ( '}' )
            {
            // InternalSecurityDsl.g:1704:1: ( '}' )
            // InternalSecurityDsl.g:1705:2: '}'
            {
             before(grammarAccess.getUserAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_6__4__Impl"


    // $ANTLR start "rule__User__Group_6_3__0"
    // InternalSecurityDsl.g:1715:1: rule__User__Group_6_3__0 : rule__User__Group_6_3__0__Impl rule__User__Group_6_3__1 ;
    public final void rule__User__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1719:1: ( rule__User__Group_6_3__0__Impl rule__User__Group_6_3__1 )
            // InternalSecurityDsl.g:1720:2: rule__User__Group_6_3__0__Impl rule__User__Group_6_3__1
            {
            pushFollow(FOLLOW_20);
            rule__User__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_6_3__0"


    // $ANTLR start "rule__User__Group_6_3__0__Impl"
    // InternalSecurityDsl.g:1727:1: rule__User__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__User__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1731:1: ( ( ',' ) )
            // InternalSecurityDsl.g:1732:1: ( ',' )
            {
            // InternalSecurityDsl.g:1732:1: ( ',' )
            // InternalSecurityDsl.g:1733:2: ','
            {
             before(grammarAccess.getUserAccess().getCommaKeyword_6_3_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_6_3__0__Impl"


    // $ANTLR start "rule__User__Group_6_3__1"
    // InternalSecurityDsl.g:1742:1: rule__User__Group_6_3__1 : rule__User__Group_6_3__1__Impl ;
    public final void rule__User__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1746:1: ( rule__User__Group_6_3__1__Impl )
            // InternalSecurityDsl.g:1747:2: rule__User__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__User__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_6_3__1"


    // $ANTLR start "rule__User__Group_6_3__1__Impl"
    // InternalSecurityDsl.g:1753:1: rule__User__Group_6_3__1__Impl : ( ( rule__User__Model_attributesAssignment_6_3_1 ) ) ;
    public final void rule__User__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1757:1: ( ( ( rule__User__Model_attributesAssignment_6_3_1 ) ) )
            // InternalSecurityDsl.g:1758:1: ( ( rule__User__Model_attributesAssignment_6_3_1 ) )
            {
            // InternalSecurityDsl.g:1758:1: ( ( rule__User__Model_attributesAssignment_6_3_1 ) )
            // InternalSecurityDsl.g:1759:2: ( rule__User__Model_attributesAssignment_6_3_1 )
            {
             before(grammarAccess.getUserAccess().getModel_attributesAssignment_6_3_1()); 
            // InternalSecurityDsl.g:1760:2: ( rule__User__Model_attributesAssignment_6_3_1 )
            // InternalSecurityDsl.g:1760:3: rule__User__Model_attributesAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__User__Model_attributesAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getModel_attributesAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_6_3__1__Impl"


    // $ANTLR start "rule__OtherModel__Group__0"
    // InternalSecurityDsl.g:1769:1: rule__OtherModel__Group__0 : rule__OtherModel__Group__0__Impl rule__OtherModel__Group__1 ;
    public final void rule__OtherModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1773:1: ( rule__OtherModel__Group__0__Impl rule__OtherModel__Group__1 )
            // InternalSecurityDsl.g:1774:2: rule__OtherModel__Group__0__Impl rule__OtherModel__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__OtherModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group__0"


    // $ANTLR start "rule__OtherModel__Group__0__Impl"
    // InternalSecurityDsl.g:1781:1: rule__OtherModel__Group__0__Impl : ( 'OtherModel' ) ;
    public final void rule__OtherModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1785:1: ( ( 'OtherModel' ) )
            // InternalSecurityDsl.g:1786:1: ( 'OtherModel' )
            {
            // InternalSecurityDsl.g:1786:1: ( 'OtherModel' )
            // InternalSecurityDsl.g:1787:2: 'OtherModel'
            {
             before(grammarAccess.getOtherModelAccess().getOtherModelKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getOtherModelAccess().getOtherModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group__0__Impl"


    // $ANTLR start "rule__OtherModel__Group__1"
    // InternalSecurityDsl.g:1796:1: rule__OtherModel__Group__1 : rule__OtherModel__Group__1__Impl rule__OtherModel__Group__2 ;
    public final void rule__OtherModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1800:1: ( rule__OtherModel__Group__1__Impl rule__OtherModel__Group__2 )
            // InternalSecurityDsl.g:1801:2: rule__OtherModel__Group__1__Impl rule__OtherModel__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__OtherModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group__1"


    // $ANTLR start "rule__OtherModel__Group__1__Impl"
    // InternalSecurityDsl.g:1808:1: rule__OtherModel__Group__1__Impl : ( ( rule__OtherModel__NameAssignment_1 ) ) ;
    public final void rule__OtherModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1812:1: ( ( ( rule__OtherModel__NameAssignment_1 ) ) )
            // InternalSecurityDsl.g:1813:1: ( ( rule__OtherModel__NameAssignment_1 ) )
            {
            // InternalSecurityDsl.g:1813:1: ( ( rule__OtherModel__NameAssignment_1 ) )
            // InternalSecurityDsl.g:1814:2: ( rule__OtherModel__NameAssignment_1 )
            {
             before(grammarAccess.getOtherModelAccess().getNameAssignment_1()); 
            // InternalSecurityDsl.g:1815:2: ( rule__OtherModel__NameAssignment_1 )
            // InternalSecurityDsl.g:1815:3: rule__OtherModel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OtherModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOtherModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group__1__Impl"


    // $ANTLR start "rule__OtherModel__Group__2"
    // InternalSecurityDsl.g:1823:1: rule__OtherModel__Group__2 : rule__OtherModel__Group__2__Impl rule__OtherModel__Group__3 ;
    public final void rule__OtherModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1827:1: ( rule__OtherModel__Group__2__Impl rule__OtherModel__Group__3 )
            // InternalSecurityDsl.g:1828:2: rule__OtherModel__Group__2__Impl rule__OtherModel__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__OtherModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group__2"


    // $ANTLR start "rule__OtherModel__Group__2__Impl"
    // InternalSecurityDsl.g:1835:1: rule__OtherModel__Group__2__Impl : ( '{' ) ;
    public final void rule__OtherModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1839:1: ( ( '{' ) )
            // InternalSecurityDsl.g:1840:1: ( '{' )
            {
            // InternalSecurityDsl.g:1840:1: ( '{' )
            // InternalSecurityDsl.g:1841:2: '{'
            {
             before(grammarAccess.getOtherModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getOtherModelAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group__2__Impl"


    // $ANTLR start "rule__OtherModel__Group__3"
    // InternalSecurityDsl.g:1850:1: rule__OtherModel__Group__3 : rule__OtherModel__Group__3__Impl rule__OtherModel__Group__4 ;
    public final void rule__OtherModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1854:1: ( rule__OtherModel__Group__3__Impl rule__OtherModel__Group__4 )
            // InternalSecurityDsl.g:1855:2: rule__OtherModel__Group__3__Impl rule__OtherModel__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__OtherModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group__3"


    // $ANTLR start "rule__OtherModel__Group__3__Impl"
    // InternalSecurityDsl.g:1862:1: rule__OtherModel__Group__3__Impl : ( 'identifierName' ) ;
    public final void rule__OtherModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1866:1: ( ( 'identifierName' ) )
            // InternalSecurityDsl.g:1867:1: ( 'identifierName' )
            {
            // InternalSecurityDsl.g:1867:1: ( 'identifierName' )
            // InternalSecurityDsl.g:1868:2: 'identifierName'
            {
             before(grammarAccess.getOtherModelAccess().getIdentifierNameKeyword_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getOtherModelAccess().getIdentifierNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group__3__Impl"


    // $ANTLR start "rule__OtherModel__Group__4"
    // InternalSecurityDsl.g:1877:1: rule__OtherModel__Group__4 : rule__OtherModel__Group__4__Impl rule__OtherModel__Group__5 ;
    public final void rule__OtherModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1881:1: ( rule__OtherModel__Group__4__Impl rule__OtherModel__Group__5 )
            // InternalSecurityDsl.g:1882:2: rule__OtherModel__Group__4__Impl rule__OtherModel__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__OtherModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group__4"


    // $ANTLR start "rule__OtherModel__Group__4__Impl"
    // InternalSecurityDsl.g:1889:1: rule__OtherModel__Group__4__Impl : ( ( rule__OtherModel__IdentifierNameAssignment_4 ) ) ;
    public final void rule__OtherModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1893:1: ( ( ( rule__OtherModel__IdentifierNameAssignment_4 ) ) )
            // InternalSecurityDsl.g:1894:1: ( ( rule__OtherModel__IdentifierNameAssignment_4 ) )
            {
            // InternalSecurityDsl.g:1894:1: ( ( rule__OtherModel__IdentifierNameAssignment_4 ) )
            // InternalSecurityDsl.g:1895:2: ( rule__OtherModel__IdentifierNameAssignment_4 )
            {
             before(grammarAccess.getOtherModelAccess().getIdentifierNameAssignment_4()); 
            // InternalSecurityDsl.g:1896:2: ( rule__OtherModel__IdentifierNameAssignment_4 )
            // InternalSecurityDsl.g:1896:3: rule__OtherModel__IdentifierNameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__OtherModel__IdentifierNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOtherModelAccess().getIdentifierNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group__4__Impl"


    // $ANTLR start "rule__OtherModel__Group__5"
    // InternalSecurityDsl.g:1904:1: rule__OtherModel__Group__5 : rule__OtherModel__Group__5__Impl rule__OtherModel__Group__6 ;
    public final void rule__OtherModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1908:1: ( rule__OtherModel__Group__5__Impl rule__OtherModel__Group__6 )
            // InternalSecurityDsl.g:1909:2: rule__OtherModel__Group__5__Impl rule__OtherModel__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__OtherModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherModel__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group__5"


    // $ANTLR start "rule__OtherModel__Group__5__Impl"
    // InternalSecurityDsl.g:1916:1: rule__OtherModel__Group__5__Impl : ( 'identifierType' ) ;
    public final void rule__OtherModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1920:1: ( ( 'identifierType' ) )
            // InternalSecurityDsl.g:1921:1: ( 'identifierType' )
            {
            // InternalSecurityDsl.g:1921:1: ( 'identifierType' )
            // InternalSecurityDsl.g:1922:2: 'identifierType'
            {
             before(grammarAccess.getOtherModelAccess().getIdentifierTypeKeyword_5()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getOtherModelAccess().getIdentifierTypeKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group__5__Impl"


    // $ANTLR start "rule__OtherModel__Group__6"
    // InternalSecurityDsl.g:1931:1: rule__OtherModel__Group__6 : rule__OtherModel__Group__6__Impl rule__OtherModel__Group__7 ;
    public final void rule__OtherModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1935:1: ( rule__OtherModel__Group__6__Impl rule__OtherModel__Group__7 )
            // InternalSecurityDsl.g:1936:2: rule__OtherModel__Group__6__Impl rule__OtherModel__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__OtherModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherModel__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group__6"


    // $ANTLR start "rule__OtherModel__Group__6__Impl"
    // InternalSecurityDsl.g:1943:1: rule__OtherModel__Group__6__Impl : ( ( rule__OtherModel__IdentifierTypeAssignment_6 ) ) ;
    public final void rule__OtherModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1947:1: ( ( ( rule__OtherModel__IdentifierTypeAssignment_6 ) ) )
            // InternalSecurityDsl.g:1948:1: ( ( rule__OtherModel__IdentifierTypeAssignment_6 ) )
            {
            // InternalSecurityDsl.g:1948:1: ( ( rule__OtherModel__IdentifierTypeAssignment_6 ) )
            // InternalSecurityDsl.g:1949:2: ( rule__OtherModel__IdentifierTypeAssignment_6 )
            {
             before(grammarAccess.getOtherModelAccess().getIdentifierTypeAssignment_6()); 
            // InternalSecurityDsl.g:1950:2: ( rule__OtherModel__IdentifierTypeAssignment_6 )
            // InternalSecurityDsl.g:1950:3: rule__OtherModel__IdentifierTypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__OtherModel__IdentifierTypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getOtherModelAccess().getIdentifierTypeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group__6__Impl"


    // $ANTLR start "rule__OtherModel__Group__7"
    // InternalSecurityDsl.g:1958:1: rule__OtherModel__Group__7 : rule__OtherModel__Group__7__Impl rule__OtherModel__Group__8 ;
    public final void rule__OtherModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1962:1: ( rule__OtherModel__Group__7__Impl rule__OtherModel__Group__8 )
            // InternalSecurityDsl.g:1963:2: rule__OtherModel__Group__7__Impl rule__OtherModel__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__OtherModel__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherModel__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group__7"


    // $ANTLR start "rule__OtherModel__Group__7__Impl"
    // InternalSecurityDsl.g:1970:1: rule__OtherModel__Group__7__Impl : ( ( rule__OtherModel__Group_7__0 )? ) ;
    public final void rule__OtherModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1974:1: ( ( ( rule__OtherModel__Group_7__0 )? ) )
            // InternalSecurityDsl.g:1975:1: ( ( rule__OtherModel__Group_7__0 )? )
            {
            // InternalSecurityDsl.g:1975:1: ( ( rule__OtherModel__Group_7__0 )? )
            // InternalSecurityDsl.g:1976:2: ( rule__OtherModel__Group_7__0 )?
            {
             before(grammarAccess.getOtherModelAccess().getGroup_7()); 
            // InternalSecurityDsl.g:1977:2: ( rule__OtherModel__Group_7__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==46) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSecurityDsl.g:1977:3: rule__OtherModel__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OtherModel__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOtherModelAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group__7__Impl"


    // $ANTLR start "rule__OtherModel__Group__8"
    // InternalSecurityDsl.g:1985:1: rule__OtherModel__Group__8 : rule__OtherModel__Group__8__Impl ;
    public final void rule__OtherModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1989:1: ( rule__OtherModel__Group__8__Impl )
            // InternalSecurityDsl.g:1990:2: rule__OtherModel__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OtherModel__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group__8"


    // $ANTLR start "rule__OtherModel__Group__8__Impl"
    // InternalSecurityDsl.g:1996:1: rule__OtherModel__Group__8__Impl : ( '}' ) ;
    public final void rule__OtherModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2000:1: ( ( '}' ) )
            // InternalSecurityDsl.g:2001:1: ( '}' )
            {
            // InternalSecurityDsl.g:2001:1: ( '}' )
            // InternalSecurityDsl.g:2002:2: '}'
            {
             before(grammarAccess.getOtherModelAccess().getRightCurlyBracketKeyword_8()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getOtherModelAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group__8__Impl"


    // $ANTLR start "rule__OtherModel__Group_7__0"
    // InternalSecurityDsl.g:2012:1: rule__OtherModel__Group_7__0 : rule__OtherModel__Group_7__0__Impl rule__OtherModel__Group_7__1 ;
    public final void rule__OtherModel__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2016:1: ( rule__OtherModel__Group_7__0__Impl rule__OtherModel__Group_7__1 )
            // InternalSecurityDsl.g:2017:2: rule__OtherModel__Group_7__0__Impl rule__OtherModel__Group_7__1
            {
            pushFollow(FOLLOW_13);
            rule__OtherModel__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherModel__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group_7__0"


    // $ANTLR start "rule__OtherModel__Group_7__0__Impl"
    // InternalSecurityDsl.g:2024:1: rule__OtherModel__Group_7__0__Impl : ( 'model_attributes' ) ;
    public final void rule__OtherModel__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2028:1: ( ( 'model_attributes' ) )
            // InternalSecurityDsl.g:2029:1: ( 'model_attributes' )
            {
            // InternalSecurityDsl.g:2029:1: ( 'model_attributes' )
            // InternalSecurityDsl.g:2030:2: 'model_attributes'
            {
             before(grammarAccess.getOtherModelAccess().getModel_attributesKeyword_7_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getOtherModelAccess().getModel_attributesKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group_7__0__Impl"


    // $ANTLR start "rule__OtherModel__Group_7__1"
    // InternalSecurityDsl.g:2039:1: rule__OtherModel__Group_7__1 : rule__OtherModel__Group_7__1__Impl rule__OtherModel__Group_7__2 ;
    public final void rule__OtherModel__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2043:1: ( rule__OtherModel__Group_7__1__Impl rule__OtherModel__Group_7__2 )
            // InternalSecurityDsl.g:2044:2: rule__OtherModel__Group_7__1__Impl rule__OtherModel__Group_7__2
            {
            pushFollow(FOLLOW_20);
            rule__OtherModel__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherModel__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group_7__1"


    // $ANTLR start "rule__OtherModel__Group_7__1__Impl"
    // InternalSecurityDsl.g:2051:1: rule__OtherModel__Group_7__1__Impl : ( '{' ) ;
    public final void rule__OtherModel__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2055:1: ( ( '{' ) )
            // InternalSecurityDsl.g:2056:1: ( '{' )
            {
            // InternalSecurityDsl.g:2056:1: ( '{' )
            // InternalSecurityDsl.g:2057:2: '{'
            {
             before(grammarAccess.getOtherModelAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getOtherModelAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group_7__1__Impl"


    // $ANTLR start "rule__OtherModel__Group_7__2"
    // InternalSecurityDsl.g:2066:1: rule__OtherModel__Group_7__2 : rule__OtherModel__Group_7__2__Impl rule__OtherModel__Group_7__3 ;
    public final void rule__OtherModel__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2070:1: ( rule__OtherModel__Group_7__2__Impl rule__OtherModel__Group_7__3 )
            // InternalSecurityDsl.g:2071:2: rule__OtherModel__Group_7__2__Impl rule__OtherModel__Group_7__3
            {
            pushFollow(FOLLOW_21);
            rule__OtherModel__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherModel__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group_7__2"


    // $ANTLR start "rule__OtherModel__Group_7__2__Impl"
    // InternalSecurityDsl.g:2078:1: rule__OtherModel__Group_7__2__Impl : ( ( rule__OtherModel__Model_attributesAssignment_7_2 ) ) ;
    public final void rule__OtherModel__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2082:1: ( ( ( rule__OtherModel__Model_attributesAssignment_7_2 ) ) )
            // InternalSecurityDsl.g:2083:1: ( ( rule__OtherModel__Model_attributesAssignment_7_2 ) )
            {
            // InternalSecurityDsl.g:2083:1: ( ( rule__OtherModel__Model_attributesAssignment_7_2 ) )
            // InternalSecurityDsl.g:2084:2: ( rule__OtherModel__Model_attributesAssignment_7_2 )
            {
             before(grammarAccess.getOtherModelAccess().getModel_attributesAssignment_7_2()); 
            // InternalSecurityDsl.g:2085:2: ( rule__OtherModel__Model_attributesAssignment_7_2 )
            // InternalSecurityDsl.g:2085:3: rule__OtherModel__Model_attributesAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__OtherModel__Model_attributesAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getOtherModelAccess().getModel_attributesAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group_7__2__Impl"


    // $ANTLR start "rule__OtherModel__Group_7__3"
    // InternalSecurityDsl.g:2093:1: rule__OtherModel__Group_7__3 : rule__OtherModel__Group_7__3__Impl rule__OtherModel__Group_7__4 ;
    public final void rule__OtherModel__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2097:1: ( rule__OtherModel__Group_7__3__Impl rule__OtherModel__Group_7__4 )
            // InternalSecurityDsl.g:2098:2: rule__OtherModel__Group_7__3__Impl rule__OtherModel__Group_7__4
            {
            pushFollow(FOLLOW_21);
            rule__OtherModel__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherModel__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group_7__3"


    // $ANTLR start "rule__OtherModel__Group_7__3__Impl"
    // InternalSecurityDsl.g:2105:1: rule__OtherModel__Group_7__3__Impl : ( ( rule__OtherModel__Group_7_3__0 )* ) ;
    public final void rule__OtherModel__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2109:1: ( ( ( rule__OtherModel__Group_7_3__0 )* ) )
            // InternalSecurityDsl.g:2110:1: ( ( rule__OtherModel__Group_7_3__0 )* )
            {
            // InternalSecurityDsl.g:2110:1: ( ( rule__OtherModel__Group_7_3__0 )* )
            // InternalSecurityDsl.g:2111:2: ( rule__OtherModel__Group_7_3__0 )*
            {
             before(grammarAccess.getOtherModelAccess().getGroup_7_3()); 
            // InternalSecurityDsl.g:2112:2: ( rule__OtherModel__Group_7_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==47) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSecurityDsl.g:2112:3: rule__OtherModel__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__OtherModel__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getOtherModelAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group_7__3__Impl"


    // $ANTLR start "rule__OtherModel__Group_7__4"
    // InternalSecurityDsl.g:2120:1: rule__OtherModel__Group_7__4 : rule__OtherModel__Group_7__4__Impl ;
    public final void rule__OtherModel__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2124:1: ( rule__OtherModel__Group_7__4__Impl )
            // InternalSecurityDsl.g:2125:2: rule__OtherModel__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OtherModel__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group_7__4"


    // $ANTLR start "rule__OtherModel__Group_7__4__Impl"
    // InternalSecurityDsl.g:2131:1: rule__OtherModel__Group_7__4__Impl : ( '}' ) ;
    public final void rule__OtherModel__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2135:1: ( ( '}' ) )
            // InternalSecurityDsl.g:2136:1: ( '}' )
            {
            // InternalSecurityDsl.g:2136:1: ( '}' )
            // InternalSecurityDsl.g:2137:2: '}'
            {
             before(grammarAccess.getOtherModelAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getOtherModelAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group_7__4__Impl"


    // $ANTLR start "rule__OtherModel__Group_7_3__0"
    // InternalSecurityDsl.g:2147:1: rule__OtherModel__Group_7_3__0 : rule__OtherModel__Group_7_3__0__Impl rule__OtherModel__Group_7_3__1 ;
    public final void rule__OtherModel__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2151:1: ( rule__OtherModel__Group_7_3__0__Impl rule__OtherModel__Group_7_3__1 )
            // InternalSecurityDsl.g:2152:2: rule__OtherModel__Group_7_3__0__Impl rule__OtherModel__Group_7_3__1
            {
            pushFollow(FOLLOW_20);
            rule__OtherModel__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherModel__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group_7_3__0"


    // $ANTLR start "rule__OtherModel__Group_7_3__0__Impl"
    // InternalSecurityDsl.g:2159:1: rule__OtherModel__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__OtherModel__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2163:1: ( ( ',' ) )
            // InternalSecurityDsl.g:2164:1: ( ',' )
            {
            // InternalSecurityDsl.g:2164:1: ( ',' )
            // InternalSecurityDsl.g:2165:2: ','
            {
             before(grammarAccess.getOtherModelAccess().getCommaKeyword_7_3_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getOtherModelAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group_7_3__0__Impl"


    // $ANTLR start "rule__OtherModel__Group_7_3__1"
    // InternalSecurityDsl.g:2174:1: rule__OtherModel__Group_7_3__1 : rule__OtherModel__Group_7_3__1__Impl ;
    public final void rule__OtherModel__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2178:1: ( rule__OtherModel__Group_7_3__1__Impl )
            // InternalSecurityDsl.g:2179:2: rule__OtherModel__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OtherModel__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group_7_3__1"


    // $ANTLR start "rule__OtherModel__Group_7_3__1__Impl"
    // InternalSecurityDsl.g:2185:1: rule__OtherModel__Group_7_3__1__Impl : ( ( rule__OtherModel__Model_attributesAssignment_7_3_1 ) ) ;
    public final void rule__OtherModel__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2189:1: ( ( ( rule__OtherModel__Model_attributesAssignment_7_3_1 ) ) )
            // InternalSecurityDsl.g:2190:1: ( ( rule__OtherModel__Model_attributesAssignment_7_3_1 ) )
            {
            // InternalSecurityDsl.g:2190:1: ( ( rule__OtherModel__Model_attributesAssignment_7_3_1 ) )
            // InternalSecurityDsl.g:2191:2: ( rule__OtherModel__Model_attributesAssignment_7_3_1 )
            {
             before(grammarAccess.getOtherModelAccess().getModel_attributesAssignment_7_3_1()); 
            // InternalSecurityDsl.g:2192:2: ( rule__OtherModel__Model_attributesAssignment_7_3_1 )
            // InternalSecurityDsl.g:2192:3: rule__OtherModel__Model_attributesAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__OtherModel__Model_attributesAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOtherModelAccess().getModel_attributesAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group_7_3__1__Impl"


    // $ANTLR start "rule__Role__Group__0"
    // InternalSecurityDsl.g:2201:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2205:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // InternalSecurityDsl.g:2206:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Role__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__0"


    // $ANTLR start "rule__Role__Group__0__Impl"
    // InternalSecurityDsl.g:2213:1: rule__Role__Group__0__Impl : ( 'Role' ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2217:1: ( ( 'Role' ) )
            // InternalSecurityDsl.g:2218:1: ( 'Role' )
            {
            // InternalSecurityDsl.g:2218:1: ( 'Role' )
            // InternalSecurityDsl.g:2219:2: 'Role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRoleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__0__Impl"


    // $ANTLR start "rule__Role__Group__1"
    // InternalSecurityDsl.g:2228:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2232:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // InternalSecurityDsl.g:2233:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Role__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__1"


    // $ANTLR start "rule__Role__Group__1__Impl"
    // InternalSecurityDsl.g:2240:1: rule__Role__Group__1__Impl : ( '{' ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2244:1: ( ( '{' ) )
            // InternalSecurityDsl.g:2245:1: ( '{' )
            {
            // InternalSecurityDsl.g:2245:1: ( '{' )
            // InternalSecurityDsl.g:2246:2: '{'
            {
             before(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__1__Impl"


    // $ANTLR start "rule__Role__Group__2"
    // InternalSecurityDsl.g:2255:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2259:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // InternalSecurityDsl.g:2260:2: rule__Role__Group__2__Impl rule__Role__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Role__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__2"


    // $ANTLR start "rule__Role__Group__2__Impl"
    // InternalSecurityDsl.g:2267:1: rule__Role__Group__2__Impl : ( 'identifierName' ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2271:1: ( ( 'identifierName' ) )
            // InternalSecurityDsl.g:2272:1: ( 'identifierName' )
            {
            // InternalSecurityDsl.g:2272:1: ( 'identifierName' )
            // InternalSecurityDsl.g:2273:2: 'identifierName'
            {
             before(grammarAccess.getRoleAccess().getIdentifierNameKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getIdentifierNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__2__Impl"


    // $ANTLR start "rule__Role__Group__3"
    // InternalSecurityDsl.g:2282:1: rule__Role__Group__3 : rule__Role__Group__3__Impl rule__Role__Group__4 ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2286:1: ( rule__Role__Group__3__Impl rule__Role__Group__4 )
            // InternalSecurityDsl.g:2287:2: rule__Role__Group__3__Impl rule__Role__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Role__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__3"


    // $ANTLR start "rule__Role__Group__3__Impl"
    // InternalSecurityDsl.g:2294:1: rule__Role__Group__3__Impl : ( ( rule__Role__IdentifierNameAssignment_3 ) ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2298:1: ( ( ( rule__Role__IdentifierNameAssignment_3 ) ) )
            // InternalSecurityDsl.g:2299:1: ( ( rule__Role__IdentifierNameAssignment_3 ) )
            {
            // InternalSecurityDsl.g:2299:1: ( ( rule__Role__IdentifierNameAssignment_3 ) )
            // InternalSecurityDsl.g:2300:2: ( rule__Role__IdentifierNameAssignment_3 )
            {
             before(grammarAccess.getRoleAccess().getIdentifierNameAssignment_3()); 
            // InternalSecurityDsl.g:2301:2: ( rule__Role__IdentifierNameAssignment_3 )
            // InternalSecurityDsl.g:2301:3: rule__Role__IdentifierNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Role__IdentifierNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getIdentifierNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__3__Impl"


    // $ANTLR start "rule__Role__Group__4"
    // InternalSecurityDsl.g:2309:1: rule__Role__Group__4 : rule__Role__Group__4__Impl rule__Role__Group__5 ;
    public final void rule__Role__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2313:1: ( rule__Role__Group__4__Impl rule__Role__Group__5 )
            // InternalSecurityDsl.g:2314:2: rule__Role__Group__4__Impl rule__Role__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Role__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__4"


    // $ANTLR start "rule__Role__Group__4__Impl"
    // InternalSecurityDsl.g:2321:1: rule__Role__Group__4__Impl : ( 'identifierType' ) ;
    public final void rule__Role__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2325:1: ( ( 'identifierType' ) )
            // InternalSecurityDsl.g:2326:1: ( 'identifierType' )
            {
            // InternalSecurityDsl.g:2326:1: ( 'identifierType' )
            // InternalSecurityDsl.g:2327:2: 'identifierType'
            {
             before(grammarAccess.getRoleAccess().getIdentifierTypeKeyword_4()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getIdentifierTypeKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__4__Impl"


    // $ANTLR start "rule__Role__Group__5"
    // InternalSecurityDsl.g:2336:1: rule__Role__Group__5 : rule__Role__Group__5__Impl rule__Role__Group__6 ;
    public final void rule__Role__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2340:1: ( rule__Role__Group__5__Impl rule__Role__Group__6 )
            // InternalSecurityDsl.g:2341:2: rule__Role__Group__5__Impl rule__Role__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Role__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__5"


    // $ANTLR start "rule__Role__Group__5__Impl"
    // InternalSecurityDsl.g:2348:1: rule__Role__Group__5__Impl : ( ( rule__Role__IdentifierTypeAssignment_5 ) ) ;
    public final void rule__Role__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2352:1: ( ( ( rule__Role__IdentifierTypeAssignment_5 ) ) )
            // InternalSecurityDsl.g:2353:1: ( ( rule__Role__IdentifierTypeAssignment_5 ) )
            {
            // InternalSecurityDsl.g:2353:1: ( ( rule__Role__IdentifierTypeAssignment_5 ) )
            // InternalSecurityDsl.g:2354:2: ( rule__Role__IdentifierTypeAssignment_5 )
            {
             before(grammarAccess.getRoleAccess().getIdentifierTypeAssignment_5()); 
            // InternalSecurityDsl.g:2355:2: ( rule__Role__IdentifierTypeAssignment_5 )
            // InternalSecurityDsl.g:2355:3: rule__Role__IdentifierTypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Role__IdentifierTypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getIdentifierTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__5__Impl"


    // $ANTLR start "rule__Role__Group__6"
    // InternalSecurityDsl.g:2363:1: rule__Role__Group__6 : rule__Role__Group__6__Impl rule__Role__Group__7 ;
    public final void rule__Role__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2367:1: ( rule__Role__Group__6__Impl rule__Role__Group__7 )
            // InternalSecurityDsl.g:2368:2: rule__Role__Group__6__Impl rule__Role__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__Role__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__6"


    // $ANTLR start "rule__Role__Group__6__Impl"
    // InternalSecurityDsl.g:2375:1: rule__Role__Group__6__Impl : ( ( rule__Role__Group_6__0 )? ) ;
    public final void rule__Role__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2379:1: ( ( ( rule__Role__Group_6__0 )? ) )
            // InternalSecurityDsl.g:2380:1: ( ( rule__Role__Group_6__0 )? )
            {
            // InternalSecurityDsl.g:2380:1: ( ( rule__Role__Group_6__0 )? )
            // InternalSecurityDsl.g:2381:2: ( rule__Role__Group_6__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_6()); 
            // InternalSecurityDsl.g:2382:2: ( rule__Role__Group_6__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==46) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSecurityDsl.g:2382:3: rule__Role__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Role__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoleAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__6__Impl"


    // $ANTLR start "rule__Role__Group__7"
    // InternalSecurityDsl.g:2390:1: rule__Role__Group__7 : rule__Role__Group__7__Impl ;
    public final void rule__Role__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2394:1: ( rule__Role__Group__7__Impl )
            // InternalSecurityDsl.g:2395:2: rule__Role__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__7"


    // $ANTLR start "rule__Role__Group__7__Impl"
    // InternalSecurityDsl.g:2401:1: rule__Role__Group__7__Impl : ( '}' ) ;
    public final void rule__Role__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2405:1: ( ( '}' ) )
            // InternalSecurityDsl.g:2406:1: ( '}' )
            {
            // InternalSecurityDsl.g:2406:1: ( '}' )
            // InternalSecurityDsl.g:2407:2: '}'
            {
             before(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_7()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__7__Impl"


    // $ANTLR start "rule__Role__Group_6__0"
    // InternalSecurityDsl.g:2417:1: rule__Role__Group_6__0 : rule__Role__Group_6__0__Impl rule__Role__Group_6__1 ;
    public final void rule__Role__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2421:1: ( rule__Role__Group_6__0__Impl rule__Role__Group_6__1 )
            // InternalSecurityDsl.g:2422:2: rule__Role__Group_6__0__Impl rule__Role__Group_6__1
            {
            pushFollow(FOLLOW_13);
            rule__Role__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_6__0"


    // $ANTLR start "rule__Role__Group_6__0__Impl"
    // InternalSecurityDsl.g:2429:1: rule__Role__Group_6__0__Impl : ( 'model_attributes' ) ;
    public final void rule__Role__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2433:1: ( ( 'model_attributes' ) )
            // InternalSecurityDsl.g:2434:1: ( 'model_attributes' )
            {
            // InternalSecurityDsl.g:2434:1: ( 'model_attributes' )
            // InternalSecurityDsl.g:2435:2: 'model_attributes'
            {
             before(grammarAccess.getRoleAccess().getModel_attributesKeyword_6_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getModel_attributesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_6__0__Impl"


    // $ANTLR start "rule__Role__Group_6__1"
    // InternalSecurityDsl.g:2444:1: rule__Role__Group_6__1 : rule__Role__Group_6__1__Impl rule__Role__Group_6__2 ;
    public final void rule__Role__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2448:1: ( rule__Role__Group_6__1__Impl rule__Role__Group_6__2 )
            // InternalSecurityDsl.g:2449:2: rule__Role__Group_6__1__Impl rule__Role__Group_6__2
            {
            pushFollow(FOLLOW_20);
            rule__Role__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_6__1"


    // $ANTLR start "rule__Role__Group_6__1__Impl"
    // InternalSecurityDsl.g:2456:1: rule__Role__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Role__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2460:1: ( ( '{' ) )
            // InternalSecurityDsl.g:2461:1: ( '{' )
            {
            // InternalSecurityDsl.g:2461:1: ( '{' )
            // InternalSecurityDsl.g:2462:2: '{'
            {
             before(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_6__1__Impl"


    // $ANTLR start "rule__Role__Group_6__2"
    // InternalSecurityDsl.g:2471:1: rule__Role__Group_6__2 : rule__Role__Group_6__2__Impl rule__Role__Group_6__3 ;
    public final void rule__Role__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2475:1: ( rule__Role__Group_6__2__Impl rule__Role__Group_6__3 )
            // InternalSecurityDsl.g:2476:2: rule__Role__Group_6__2__Impl rule__Role__Group_6__3
            {
            pushFollow(FOLLOW_21);
            rule__Role__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_6__2"


    // $ANTLR start "rule__Role__Group_6__2__Impl"
    // InternalSecurityDsl.g:2483:1: rule__Role__Group_6__2__Impl : ( ( rule__Role__Model_attributesAssignment_6_2 ) ) ;
    public final void rule__Role__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2487:1: ( ( ( rule__Role__Model_attributesAssignment_6_2 ) ) )
            // InternalSecurityDsl.g:2488:1: ( ( rule__Role__Model_attributesAssignment_6_2 ) )
            {
            // InternalSecurityDsl.g:2488:1: ( ( rule__Role__Model_attributesAssignment_6_2 ) )
            // InternalSecurityDsl.g:2489:2: ( rule__Role__Model_attributesAssignment_6_2 )
            {
             before(grammarAccess.getRoleAccess().getModel_attributesAssignment_6_2()); 
            // InternalSecurityDsl.g:2490:2: ( rule__Role__Model_attributesAssignment_6_2 )
            // InternalSecurityDsl.g:2490:3: rule__Role__Model_attributesAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Role__Model_attributesAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getModel_attributesAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_6__2__Impl"


    // $ANTLR start "rule__Role__Group_6__3"
    // InternalSecurityDsl.g:2498:1: rule__Role__Group_6__3 : rule__Role__Group_6__3__Impl rule__Role__Group_6__4 ;
    public final void rule__Role__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2502:1: ( rule__Role__Group_6__3__Impl rule__Role__Group_6__4 )
            // InternalSecurityDsl.g:2503:2: rule__Role__Group_6__3__Impl rule__Role__Group_6__4
            {
            pushFollow(FOLLOW_21);
            rule__Role__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_6__3"


    // $ANTLR start "rule__Role__Group_6__3__Impl"
    // InternalSecurityDsl.g:2510:1: rule__Role__Group_6__3__Impl : ( ( rule__Role__Group_6_3__0 )* ) ;
    public final void rule__Role__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2514:1: ( ( ( rule__Role__Group_6_3__0 )* ) )
            // InternalSecurityDsl.g:2515:1: ( ( rule__Role__Group_6_3__0 )* )
            {
            // InternalSecurityDsl.g:2515:1: ( ( rule__Role__Group_6_3__0 )* )
            // InternalSecurityDsl.g:2516:2: ( rule__Role__Group_6_3__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_6_3()); 
            // InternalSecurityDsl.g:2517:2: ( rule__Role__Group_6_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==47) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSecurityDsl.g:2517:3: rule__Role__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Role__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getRoleAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_6__3__Impl"


    // $ANTLR start "rule__Role__Group_6__4"
    // InternalSecurityDsl.g:2525:1: rule__Role__Group_6__4 : rule__Role__Group_6__4__Impl ;
    public final void rule__Role__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2529:1: ( rule__Role__Group_6__4__Impl )
            // InternalSecurityDsl.g:2530:2: rule__Role__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_6__4"


    // $ANTLR start "rule__Role__Group_6__4__Impl"
    // InternalSecurityDsl.g:2536:1: rule__Role__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Role__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2540:1: ( ( '}' ) )
            // InternalSecurityDsl.g:2541:1: ( '}' )
            {
            // InternalSecurityDsl.g:2541:1: ( '}' )
            // InternalSecurityDsl.g:2542:2: '}'
            {
             before(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_6__4__Impl"


    // $ANTLR start "rule__Role__Group_6_3__0"
    // InternalSecurityDsl.g:2552:1: rule__Role__Group_6_3__0 : rule__Role__Group_6_3__0__Impl rule__Role__Group_6_3__1 ;
    public final void rule__Role__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2556:1: ( rule__Role__Group_6_3__0__Impl rule__Role__Group_6_3__1 )
            // InternalSecurityDsl.g:2557:2: rule__Role__Group_6_3__0__Impl rule__Role__Group_6_3__1
            {
            pushFollow(FOLLOW_20);
            rule__Role__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_6_3__0"


    // $ANTLR start "rule__Role__Group_6_3__0__Impl"
    // InternalSecurityDsl.g:2564:1: rule__Role__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Role__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2568:1: ( ( ',' ) )
            // InternalSecurityDsl.g:2569:1: ( ',' )
            {
            // InternalSecurityDsl.g:2569:1: ( ',' )
            // InternalSecurityDsl.g:2570:2: ','
            {
             before(grammarAccess.getRoleAccess().getCommaKeyword_6_3_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_6_3__0__Impl"


    // $ANTLR start "rule__Role__Group_6_3__1"
    // InternalSecurityDsl.g:2579:1: rule__Role__Group_6_3__1 : rule__Role__Group_6_3__1__Impl ;
    public final void rule__Role__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2583:1: ( rule__Role__Group_6_3__1__Impl )
            // InternalSecurityDsl.g:2584:2: rule__Role__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_6_3__1"


    // $ANTLR start "rule__Role__Group_6_3__1__Impl"
    // InternalSecurityDsl.g:2590:1: rule__Role__Group_6_3__1__Impl : ( ( rule__Role__Model_attributesAssignment_6_3_1 ) ) ;
    public final void rule__Role__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2594:1: ( ( ( rule__Role__Model_attributesAssignment_6_3_1 ) ) )
            // InternalSecurityDsl.g:2595:1: ( ( rule__Role__Model_attributesAssignment_6_3_1 ) )
            {
            // InternalSecurityDsl.g:2595:1: ( ( rule__Role__Model_attributesAssignment_6_3_1 ) )
            // InternalSecurityDsl.g:2596:2: ( rule__Role__Model_attributesAssignment_6_3_1 )
            {
             before(grammarAccess.getRoleAccess().getModel_attributesAssignment_6_3_1()); 
            // InternalSecurityDsl.g:2597:2: ( rule__Role__Model_attributesAssignment_6_3_1 )
            // InternalSecurityDsl.g:2597:3: rule__Role__Model_attributesAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Role__Model_attributesAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getModel_attributesAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_6_3__1__Impl"


    // $ANTLR start "rule__Endpoint__Group__0"
    // InternalSecurityDsl.g:2606:1: rule__Endpoint__Group__0 : rule__Endpoint__Group__0__Impl rule__Endpoint__Group__1 ;
    public final void rule__Endpoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2610:1: ( rule__Endpoint__Group__0__Impl rule__Endpoint__Group__1 )
            // InternalSecurityDsl.g:2611:2: rule__Endpoint__Group__0__Impl rule__Endpoint__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Endpoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Endpoint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group__0"


    // $ANTLR start "rule__Endpoint__Group__0__Impl"
    // InternalSecurityDsl.g:2618:1: rule__Endpoint__Group__0__Impl : ( 'Endpoint' ) ;
    public final void rule__Endpoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2622:1: ( ( 'Endpoint' ) )
            // InternalSecurityDsl.g:2623:1: ( 'Endpoint' )
            {
            // InternalSecurityDsl.g:2623:1: ( 'Endpoint' )
            // InternalSecurityDsl.g:2624:2: 'Endpoint'
            {
             before(grammarAccess.getEndpointAccess().getEndpointKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getEndpointKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group__0__Impl"


    // $ANTLR start "rule__Endpoint__Group__1"
    // InternalSecurityDsl.g:2633:1: rule__Endpoint__Group__1 : rule__Endpoint__Group__1__Impl rule__Endpoint__Group__2 ;
    public final void rule__Endpoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2637:1: ( rule__Endpoint__Group__1__Impl rule__Endpoint__Group__2 )
            // InternalSecurityDsl.g:2638:2: rule__Endpoint__Group__1__Impl rule__Endpoint__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Endpoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Endpoint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group__1"


    // $ANTLR start "rule__Endpoint__Group__1__Impl"
    // InternalSecurityDsl.g:2645:1: rule__Endpoint__Group__1__Impl : ( '{' ) ;
    public final void rule__Endpoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2649:1: ( ( '{' ) )
            // InternalSecurityDsl.g:2650:1: ( '{' )
            {
            // InternalSecurityDsl.g:2650:1: ( '{' )
            // InternalSecurityDsl.g:2651:2: '{'
            {
             before(grammarAccess.getEndpointAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group__1__Impl"


    // $ANTLR start "rule__Endpoint__Group__2"
    // InternalSecurityDsl.g:2660:1: rule__Endpoint__Group__2 : rule__Endpoint__Group__2__Impl rule__Endpoint__Group__3 ;
    public final void rule__Endpoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2664:1: ( rule__Endpoint__Group__2__Impl rule__Endpoint__Group__3 )
            // InternalSecurityDsl.g:2665:2: rule__Endpoint__Group__2__Impl rule__Endpoint__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Endpoint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Endpoint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group__2"


    // $ANTLR start "rule__Endpoint__Group__2__Impl"
    // InternalSecurityDsl.g:2672:1: rule__Endpoint__Group__2__Impl : ( 'url' ) ;
    public final void rule__Endpoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2676:1: ( ( 'url' ) )
            // InternalSecurityDsl.g:2677:1: ( 'url' )
            {
            // InternalSecurityDsl.g:2677:1: ( 'url' )
            // InternalSecurityDsl.g:2678:2: 'url'
            {
             before(grammarAccess.getEndpointAccess().getUrlKeyword_2()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getUrlKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group__2__Impl"


    // $ANTLR start "rule__Endpoint__Group__3"
    // InternalSecurityDsl.g:2687:1: rule__Endpoint__Group__3 : rule__Endpoint__Group__3__Impl rule__Endpoint__Group__4 ;
    public final void rule__Endpoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2691:1: ( rule__Endpoint__Group__3__Impl rule__Endpoint__Group__4 )
            // InternalSecurityDsl.g:2692:2: rule__Endpoint__Group__3__Impl rule__Endpoint__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Endpoint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Endpoint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group__3"


    // $ANTLR start "rule__Endpoint__Group__3__Impl"
    // InternalSecurityDsl.g:2699:1: rule__Endpoint__Group__3__Impl : ( ( rule__Endpoint__UrlAssignment_3 ) ) ;
    public final void rule__Endpoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2703:1: ( ( ( rule__Endpoint__UrlAssignment_3 ) ) )
            // InternalSecurityDsl.g:2704:1: ( ( rule__Endpoint__UrlAssignment_3 ) )
            {
            // InternalSecurityDsl.g:2704:1: ( ( rule__Endpoint__UrlAssignment_3 ) )
            // InternalSecurityDsl.g:2705:2: ( rule__Endpoint__UrlAssignment_3 )
            {
             before(grammarAccess.getEndpointAccess().getUrlAssignment_3()); 
            // InternalSecurityDsl.g:2706:2: ( rule__Endpoint__UrlAssignment_3 )
            // InternalSecurityDsl.g:2706:3: rule__Endpoint__UrlAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__UrlAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEndpointAccess().getUrlAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group__3__Impl"


    // $ANTLR start "rule__Endpoint__Group__4"
    // InternalSecurityDsl.g:2714:1: rule__Endpoint__Group__4 : rule__Endpoint__Group__4__Impl rule__Endpoint__Group__5 ;
    public final void rule__Endpoint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2718:1: ( rule__Endpoint__Group__4__Impl rule__Endpoint__Group__5 )
            // InternalSecurityDsl.g:2719:2: rule__Endpoint__Group__4__Impl rule__Endpoint__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Endpoint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Endpoint__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group__4"


    // $ANTLR start "rule__Endpoint__Group__4__Impl"
    // InternalSecurityDsl.g:2726:1: rule__Endpoint__Group__4__Impl : ( 'function_name' ) ;
    public final void rule__Endpoint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2730:1: ( ( 'function_name' ) )
            // InternalSecurityDsl.g:2731:1: ( 'function_name' )
            {
            // InternalSecurityDsl.g:2731:1: ( 'function_name' )
            // InternalSecurityDsl.g:2732:2: 'function_name'
            {
             before(grammarAccess.getEndpointAccess().getFunction_nameKeyword_4()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getFunction_nameKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group__4__Impl"


    // $ANTLR start "rule__Endpoint__Group__5"
    // InternalSecurityDsl.g:2741:1: rule__Endpoint__Group__5 : rule__Endpoint__Group__5__Impl rule__Endpoint__Group__6 ;
    public final void rule__Endpoint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2745:1: ( rule__Endpoint__Group__5__Impl rule__Endpoint__Group__6 )
            // InternalSecurityDsl.g:2746:2: rule__Endpoint__Group__5__Impl rule__Endpoint__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__Endpoint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Endpoint__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group__5"


    // $ANTLR start "rule__Endpoint__Group__5__Impl"
    // InternalSecurityDsl.g:2753:1: rule__Endpoint__Group__5__Impl : ( ( rule__Endpoint__Function_nameAssignment_5 ) ) ;
    public final void rule__Endpoint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2757:1: ( ( ( rule__Endpoint__Function_nameAssignment_5 ) ) )
            // InternalSecurityDsl.g:2758:1: ( ( rule__Endpoint__Function_nameAssignment_5 ) )
            {
            // InternalSecurityDsl.g:2758:1: ( ( rule__Endpoint__Function_nameAssignment_5 ) )
            // InternalSecurityDsl.g:2759:2: ( rule__Endpoint__Function_nameAssignment_5 )
            {
             before(grammarAccess.getEndpointAccess().getFunction_nameAssignment_5()); 
            // InternalSecurityDsl.g:2760:2: ( rule__Endpoint__Function_nameAssignment_5 )
            // InternalSecurityDsl.g:2760:3: rule__Endpoint__Function_nameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__Function_nameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEndpointAccess().getFunction_nameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group__5__Impl"


    // $ANTLR start "rule__Endpoint__Group__6"
    // InternalSecurityDsl.g:2768:1: rule__Endpoint__Group__6 : rule__Endpoint__Group__6__Impl rule__Endpoint__Group__7 ;
    public final void rule__Endpoint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2772:1: ( rule__Endpoint__Group__6__Impl rule__Endpoint__Group__7 )
            // InternalSecurityDsl.g:2773:2: rule__Endpoint__Group__6__Impl rule__Endpoint__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__Endpoint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Endpoint__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group__6"


    // $ANTLR start "rule__Endpoint__Group__6__Impl"
    // InternalSecurityDsl.g:2780:1: rule__Endpoint__Group__6__Impl : ( 'method' ) ;
    public final void rule__Endpoint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2784:1: ( ( 'method' ) )
            // InternalSecurityDsl.g:2785:1: ( 'method' )
            {
            // InternalSecurityDsl.g:2785:1: ( 'method' )
            // InternalSecurityDsl.g:2786:2: 'method'
            {
             before(grammarAccess.getEndpointAccess().getMethodKeyword_6()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getMethodKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group__6__Impl"


    // $ANTLR start "rule__Endpoint__Group__7"
    // InternalSecurityDsl.g:2795:1: rule__Endpoint__Group__7 : rule__Endpoint__Group__7__Impl rule__Endpoint__Group__8 ;
    public final void rule__Endpoint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2799:1: ( rule__Endpoint__Group__7__Impl rule__Endpoint__Group__8 )
            // InternalSecurityDsl.g:2800:2: rule__Endpoint__Group__7__Impl rule__Endpoint__Group__8
            {
            pushFollow(FOLLOW_27);
            rule__Endpoint__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Endpoint__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group__7"


    // $ANTLR start "rule__Endpoint__Group__7__Impl"
    // InternalSecurityDsl.g:2807:1: rule__Endpoint__Group__7__Impl : ( ( rule__Endpoint__MethodAssignment_7 ) ) ;
    public final void rule__Endpoint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2811:1: ( ( ( rule__Endpoint__MethodAssignment_7 ) ) )
            // InternalSecurityDsl.g:2812:1: ( ( rule__Endpoint__MethodAssignment_7 ) )
            {
            // InternalSecurityDsl.g:2812:1: ( ( rule__Endpoint__MethodAssignment_7 ) )
            // InternalSecurityDsl.g:2813:2: ( rule__Endpoint__MethodAssignment_7 )
            {
             before(grammarAccess.getEndpointAccess().getMethodAssignment_7()); 
            // InternalSecurityDsl.g:2814:2: ( rule__Endpoint__MethodAssignment_7 )
            // InternalSecurityDsl.g:2814:3: rule__Endpoint__MethodAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__MethodAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getEndpointAccess().getMethodAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group__7__Impl"


    // $ANTLR start "rule__Endpoint__Group__8"
    // InternalSecurityDsl.g:2822:1: rule__Endpoint__Group__8 : rule__Endpoint__Group__8__Impl rule__Endpoint__Group__9 ;
    public final void rule__Endpoint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2826:1: ( rule__Endpoint__Group__8__Impl rule__Endpoint__Group__9 )
            // InternalSecurityDsl.g:2827:2: rule__Endpoint__Group__8__Impl rule__Endpoint__Group__9
            {
            pushFollow(FOLLOW_27);
            rule__Endpoint__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Endpoint__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group__8"


    // $ANTLR start "rule__Endpoint__Group__8__Impl"
    // InternalSecurityDsl.g:2834:1: rule__Endpoint__Group__8__Impl : ( ( rule__Endpoint__Group_8__0 )? ) ;
    public final void rule__Endpoint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2838:1: ( ( ( rule__Endpoint__Group_8__0 )? ) )
            // InternalSecurityDsl.g:2839:1: ( ( rule__Endpoint__Group_8__0 )? )
            {
            // InternalSecurityDsl.g:2839:1: ( ( rule__Endpoint__Group_8__0 )? )
            // InternalSecurityDsl.g:2840:2: ( rule__Endpoint__Group_8__0 )?
            {
             before(grammarAccess.getEndpointAccess().getGroup_8()); 
            // InternalSecurityDsl.g:2841:2: ( rule__Endpoint__Group_8__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==54) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSecurityDsl.g:2841:3: rule__Endpoint__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Endpoint__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEndpointAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group__8__Impl"


    // $ANTLR start "rule__Endpoint__Group__9"
    // InternalSecurityDsl.g:2849:1: rule__Endpoint__Group__9 : rule__Endpoint__Group__9__Impl ;
    public final void rule__Endpoint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2853:1: ( rule__Endpoint__Group__9__Impl )
            // InternalSecurityDsl.g:2854:2: rule__Endpoint__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group__9"


    // $ANTLR start "rule__Endpoint__Group__9__Impl"
    // InternalSecurityDsl.g:2860:1: rule__Endpoint__Group__9__Impl : ( '}' ) ;
    public final void rule__Endpoint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2864:1: ( ( '}' ) )
            // InternalSecurityDsl.g:2865:1: ( '}' )
            {
            // InternalSecurityDsl.g:2865:1: ( '}' )
            // InternalSecurityDsl.g:2866:2: '}'
            {
             before(grammarAccess.getEndpointAccess().getRightCurlyBracketKeyword_9()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group__9__Impl"


    // $ANTLR start "rule__Endpoint__Group_8__0"
    // InternalSecurityDsl.g:2876:1: rule__Endpoint__Group_8__0 : rule__Endpoint__Group_8__0__Impl rule__Endpoint__Group_8__1 ;
    public final void rule__Endpoint__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2880:1: ( rule__Endpoint__Group_8__0__Impl rule__Endpoint__Group_8__1 )
            // InternalSecurityDsl.g:2881:2: rule__Endpoint__Group_8__0__Impl rule__Endpoint__Group_8__1
            {
            pushFollow(FOLLOW_28);
            rule__Endpoint__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Endpoint__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group_8__0"


    // $ANTLR start "rule__Endpoint__Group_8__0__Impl"
    // InternalSecurityDsl.g:2888:1: rule__Endpoint__Group_8__0__Impl : ( 'roles_authority' ) ;
    public final void rule__Endpoint__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2892:1: ( ( 'roles_authority' ) )
            // InternalSecurityDsl.g:2893:1: ( 'roles_authority' )
            {
            // InternalSecurityDsl.g:2893:1: ( 'roles_authority' )
            // InternalSecurityDsl.g:2894:2: 'roles_authority'
            {
             before(grammarAccess.getEndpointAccess().getRoles_authorityKeyword_8_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getRoles_authorityKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group_8__0__Impl"


    // $ANTLR start "rule__Endpoint__Group_8__1"
    // InternalSecurityDsl.g:2903:1: rule__Endpoint__Group_8__1 : rule__Endpoint__Group_8__1__Impl rule__Endpoint__Group_8__2 ;
    public final void rule__Endpoint__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2907:1: ( rule__Endpoint__Group_8__1__Impl rule__Endpoint__Group_8__2 )
            // InternalSecurityDsl.g:2908:2: rule__Endpoint__Group_8__1__Impl rule__Endpoint__Group_8__2
            {
            pushFollow(FOLLOW_5);
            rule__Endpoint__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Endpoint__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group_8__1"


    // $ANTLR start "rule__Endpoint__Group_8__1__Impl"
    // InternalSecurityDsl.g:2915:1: rule__Endpoint__Group_8__1__Impl : ( '(' ) ;
    public final void rule__Endpoint__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2919:1: ( ( '(' ) )
            // InternalSecurityDsl.g:2920:1: ( '(' )
            {
            // InternalSecurityDsl.g:2920:1: ( '(' )
            // InternalSecurityDsl.g:2921:2: '('
            {
             before(grammarAccess.getEndpointAccess().getLeftParenthesisKeyword_8_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getLeftParenthesisKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group_8__1__Impl"


    // $ANTLR start "rule__Endpoint__Group_8__2"
    // InternalSecurityDsl.g:2930:1: rule__Endpoint__Group_8__2 : rule__Endpoint__Group_8__2__Impl rule__Endpoint__Group_8__3 ;
    public final void rule__Endpoint__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2934:1: ( rule__Endpoint__Group_8__2__Impl rule__Endpoint__Group_8__3 )
            // InternalSecurityDsl.g:2935:2: rule__Endpoint__Group_8__2__Impl rule__Endpoint__Group_8__3
            {
            pushFollow(FOLLOW_29);
            rule__Endpoint__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Endpoint__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group_8__2"


    // $ANTLR start "rule__Endpoint__Group_8__2__Impl"
    // InternalSecurityDsl.g:2942:1: rule__Endpoint__Group_8__2__Impl : ( ( rule__Endpoint__Roles_authorityAssignment_8_2 ) ) ;
    public final void rule__Endpoint__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2946:1: ( ( ( rule__Endpoint__Roles_authorityAssignment_8_2 ) ) )
            // InternalSecurityDsl.g:2947:1: ( ( rule__Endpoint__Roles_authorityAssignment_8_2 ) )
            {
            // InternalSecurityDsl.g:2947:1: ( ( rule__Endpoint__Roles_authorityAssignment_8_2 ) )
            // InternalSecurityDsl.g:2948:2: ( rule__Endpoint__Roles_authorityAssignment_8_2 )
            {
             before(grammarAccess.getEndpointAccess().getRoles_authorityAssignment_8_2()); 
            // InternalSecurityDsl.g:2949:2: ( rule__Endpoint__Roles_authorityAssignment_8_2 )
            // InternalSecurityDsl.g:2949:3: rule__Endpoint__Roles_authorityAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__Roles_authorityAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getEndpointAccess().getRoles_authorityAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group_8__2__Impl"


    // $ANTLR start "rule__Endpoint__Group_8__3"
    // InternalSecurityDsl.g:2957:1: rule__Endpoint__Group_8__3 : rule__Endpoint__Group_8__3__Impl rule__Endpoint__Group_8__4 ;
    public final void rule__Endpoint__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2961:1: ( rule__Endpoint__Group_8__3__Impl rule__Endpoint__Group_8__4 )
            // InternalSecurityDsl.g:2962:2: rule__Endpoint__Group_8__3__Impl rule__Endpoint__Group_8__4
            {
            pushFollow(FOLLOW_29);
            rule__Endpoint__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Endpoint__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group_8__3"


    // $ANTLR start "rule__Endpoint__Group_8__3__Impl"
    // InternalSecurityDsl.g:2969:1: rule__Endpoint__Group_8__3__Impl : ( ( rule__Endpoint__Group_8_3__0 )* ) ;
    public final void rule__Endpoint__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2973:1: ( ( ( rule__Endpoint__Group_8_3__0 )* ) )
            // InternalSecurityDsl.g:2974:1: ( ( rule__Endpoint__Group_8_3__0 )* )
            {
            // InternalSecurityDsl.g:2974:1: ( ( rule__Endpoint__Group_8_3__0 )* )
            // InternalSecurityDsl.g:2975:2: ( rule__Endpoint__Group_8_3__0 )*
            {
             before(grammarAccess.getEndpointAccess().getGroup_8_3()); 
            // InternalSecurityDsl.g:2976:2: ( rule__Endpoint__Group_8_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==47) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSecurityDsl.g:2976:3: rule__Endpoint__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Endpoint__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getEndpointAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group_8__3__Impl"


    // $ANTLR start "rule__Endpoint__Group_8__4"
    // InternalSecurityDsl.g:2984:1: rule__Endpoint__Group_8__4 : rule__Endpoint__Group_8__4__Impl ;
    public final void rule__Endpoint__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2988:1: ( rule__Endpoint__Group_8__4__Impl )
            // InternalSecurityDsl.g:2989:2: rule__Endpoint__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__Group_8__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group_8__4"


    // $ANTLR start "rule__Endpoint__Group_8__4__Impl"
    // InternalSecurityDsl.g:2995:1: rule__Endpoint__Group_8__4__Impl : ( ')' ) ;
    public final void rule__Endpoint__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2999:1: ( ( ')' ) )
            // InternalSecurityDsl.g:3000:1: ( ')' )
            {
            // InternalSecurityDsl.g:3000:1: ( ')' )
            // InternalSecurityDsl.g:3001:2: ')'
            {
             before(grammarAccess.getEndpointAccess().getRightParenthesisKeyword_8_4()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getRightParenthesisKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group_8__4__Impl"


    // $ANTLR start "rule__Endpoint__Group_8_3__0"
    // InternalSecurityDsl.g:3011:1: rule__Endpoint__Group_8_3__0 : rule__Endpoint__Group_8_3__0__Impl rule__Endpoint__Group_8_3__1 ;
    public final void rule__Endpoint__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3015:1: ( rule__Endpoint__Group_8_3__0__Impl rule__Endpoint__Group_8_3__1 )
            // InternalSecurityDsl.g:3016:2: rule__Endpoint__Group_8_3__0__Impl rule__Endpoint__Group_8_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Endpoint__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Endpoint__Group_8_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group_8_3__0"


    // $ANTLR start "rule__Endpoint__Group_8_3__0__Impl"
    // InternalSecurityDsl.g:3023:1: rule__Endpoint__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__Endpoint__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3027:1: ( ( ',' ) )
            // InternalSecurityDsl.g:3028:1: ( ',' )
            {
            // InternalSecurityDsl.g:3028:1: ( ',' )
            // InternalSecurityDsl.g:3029:2: ','
            {
             before(grammarAccess.getEndpointAccess().getCommaKeyword_8_3_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group_8_3__0__Impl"


    // $ANTLR start "rule__Endpoint__Group_8_3__1"
    // InternalSecurityDsl.g:3038:1: rule__Endpoint__Group_8_3__1 : rule__Endpoint__Group_8_3__1__Impl ;
    public final void rule__Endpoint__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3042:1: ( rule__Endpoint__Group_8_3__1__Impl )
            // InternalSecurityDsl.g:3043:2: rule__Endpoint__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__Group_8_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group_8_3__1"


    // $ANTLR start "rule__Endpoint__Group_8_3__1__Impl"
    // InternalSecurityDsl.g:3049:1: rule__Endpoint__Group_8_3__1__Impl : ( ( rule__Endpoint__Roles_authorityAssignment_8_3_1 ) ) ;
    public final void rule__Endpoint__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3053:1: ( ( ( rule__Endpoint__Roles_authorityAssignment_8_3_1 ) ) )
            // InternalSecurityDsl.g:3054:1: ( ( rule__Endpoint__Roles_authorityAssignment_8_3_1 ) )
            {
            // InternalSecurityDsl.g:3054:1: ( ( rule__Endpoint__Roles_authorityAssignment_8_3_1 ) )
            // InternalSecurityDsl.g:3055:2: ( rule__Endpoint__Roles_authorityAssignment_8_3_1 )
            {
             before(grammarAccess.getEndpointAccess().getRoles_authorityAssignment_8_3_1()); 
            // InternalSecurityDsl.g:3056:2: ( rule__Endpoint__Roles_authorityAssignment_8_3_1 )
            // InternalSecurityDsl.g:3056:3: rule__Endpoint__Roles_authorityAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__Roles_authorityAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEndpointAccess().getRoles_authorityAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group_8_3__1__Impl"


    // $ANTLR start "rule__Authentication__Group__0"
    // InternalSecurityDsl.g:3065:1: rule__Authentication__Group__0 : rule__Authentication__Group__0__Impl rule__Authentication__Group__1 ;
    public final void rule__Authentication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3069:1: ( rule__Authentication__Group__0__Impl rule__Authentication__Group__1 )
            // InternalSecurityDsl.g:3070:2: rule__Authentication__Group__0__Impl rule__Authentication__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Authentication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Authentication__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group__0"


    // $ANTLR start "rule__Authentication__Group__0__Impl"
    // InternalSecurityDsl.g:3077:1: rule__Authentication__Group__0__Impl : ( 'Authentication' ) ;
    public final void rule__Authentication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3081:1: ( ( 'Authentication' ) )
            // InternalSecurityDsl.g:3082:1: ( 'Authentication' )
            {
            // InternalSecurityDsl.g:3082:1: ( 'Authentication' )
            // InternalSecurityDsl.g:3083:2: 'Authentication'
            {
             before(grammarAccess.getAuthenticationAccess().getAuthenticationKeyword_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getAuthenticationAccess().getAuthenticationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group__0__Impl"


    // $ANTLR start "rule__Authentication__Group__1"
    // InternalSecurityDsl.g:3092:1: rule__Authentication__Group__1 : rule__Authentication__Group__1__Impl rule__Authentication__Group__2 ;
    public final void rule__Authentication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3096:1: ( rule__Authentication__Group__1__Impl rule__Authentication__Group__2 )
            // InternalSecurityDsl.g:3097:2: rule__Authentication__Group__1__Impl rule__Authentication__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Authentication__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Authentication__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group__1"


    // $ANTLR start "rule__Authentication__Group__1__Impl"
    // InternalSecurityDsl.g:3104:1: rule__Authentication__Group__1__Impl : ( ( rule__Authentication__NameAssignment_1 ) ) ;
    public final void rule__Authentication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3108:1: ( ( ( rule__Authentication__NameAssignment_1 ) ) )
            // InternalSecurityDsl.g:3109:1: ( ( rule__Authentication__NameAssignment_1 ) )
            {
            // InternalSecurityDsl.g:3109:1: ( ( rule__Authentication__NameAssignment_1 ) )
            // InternalSecurityDsl.g:3110:2: ( rule__Authentication__NameAssignment_1 )
            {
             before(grammarAccess.getAuthenticationAccess().getNameAssignment_1()); 
            // InternalSecurityDsl.g:3111:2: ( rule__Authentication__NameAssignment_1 )
            // InternalSecurityDsl.g:3111:3: rule__Authentication__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Authentication__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAuthenticationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group__1__Impl"


    // $ANTLR start "rule__Authentication__Group__2"
    // InternalSecurityDsl.g:3119:1: rule__Authentication__Group__2 : rule__Authentication__Group__2__Impl rule__Authentication__Group__3 ;
    public final void rule__Authentication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3123:1: ( rule__Authentication__Group__2__Impl rule__Authentication__Group__3 )
            // InternalSecurityDsl.g:3124:2: rule__Authentication__Group__2__Impl rule__Authentication__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__Authentication__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Authentication__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group__2"


    // $ANTLR start "rule__Authentication__Group__2__Impl"
    // InternalSecurityDsl.g:3131:1: rule__Authentication__Group__2__Impl : ( '{' ) ;
    public final void rule__Authentication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3135:1: ( ( '{' ) )
            // InternalSecurityDsl.g:3136:1: ( '{' )
            {
            // InternalSecurityDsl.g:3136:1: ( '{' )
            // InternalSecurityDsl.g:3137:2: '{'
            {
             before(grammarAccess.getAuthenticationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAuthenticationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group__2__Impl"


    // $ANTLR start "rule__Authentication__Group__3"
    // InternalSecurityDsl.g:3146:1: rule__Authentication__Group__3 : rule__Authentication__Group__3__Impl rule__Authentication__Group__4 ;
    public final void rule__Authentication__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3150:1: ( rule__Authentication__Group__3__Impl rule__Authentication__Group__4 )
            // InternalSecurityDsl.g:3151:2: rule__Authentication__Group__3__Impl rule__Authentication__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Authentication__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Authentication__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group__3"


    // $ANTLR start "rule__Authentication__Group__3__Impl"
    // InternalSecurityDsl.g:3158:1: rule__Authentication__Group__3__Impl : ( 'path' ) ;
    public final void rule__Authentication__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3162:1: ( ( 'path' ) )
            // InternalSecurityDsl.g:3163:1: ( 'path' )
            {
            // InternalSecurityDsl.g:3163:1: ( 'path' )
            // InternalSecurityDsl.g:3164:2: 'path'
            {
             before(grammarAccess.getAuthenticationAccess().getPathKeyword_3()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getAuthenticationAccess().getPathKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group__3__Impl"


    // $ANTLR start "rule__Authentication__Group__4"
    // InternalSecurityDsl.g:3173:1: rule__Authentication__Group__4 : rule__Authentication__Group__4__Impl rule__Authentication__Group__5 ;
    public final void rule__Authentication__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3177:1: ( rule__Authentication__Group__4__Impl rule__Authentication__Group__5 )
            // InternalSecurityDsl.g:3178:2: rule__Authentication__Group__4__Impl rule__Authentication__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__Authentication__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Authentication__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group__4"


    // $ANTLR start "rule__Authentication__Group__4__Impl"
    // InternalSecurityDsl.g:3185:1: rule__Authentication__Group__4__Impl : ( ( rule__Authentication__PathAssignment_4 ) ) ;
    public final void rule__Authentication__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3189:1: ( ( ( rule__Authentication__PathAssignment_4 ) ) )
            // InternalSecurityDsl.g:3190:1: ( ( rule__Authentication__PathAssignment_4 ) )
            {
            // InternalSecurityDsl.g:3190:1: ( ( rule__Authentication__PathAssignment_4 ) )
            // InternalSecurityDsl.g:3191:2: ( rule__Authentication__PathAssignment_4 )
            {
             before(grammarAccess.getAuthenticationAccess().getPathAssignment_4()); 
            // InternalSecurityDsl.g:3192:2: ( rule__Authentication__PathAssignment_4 )
            // InternalSecurityDsl.g:3192:3: rule__Authentication__PathAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Authentication__PathAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAuthenticationAccess().getPathAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group__4__Impl"


    // $ANTLR start "rule__Authentication__Group__5"
    // InternalSecurityDsl.g:3200:1: rule__Authentication__Group__5 : rule__Authentication__Group__5__Impl rule__Authentication__Group__6 ;
    public final void rule__Authentication__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3204:1: ( rule__Authentication__Group__5__Impl rule__Authentication__Group__6 )
            // InternalSecurityDsl.g:3205:2: rule__Authentication__Group__5__Impl rule__Authentication__Group__6
            {
            pushFollow(FOLLOW_31);
            rule__Authentication__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Authentication__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group__5"


    // $ANTLR start "rule__Authentication__Group__5__Impl"
    // InternalSecurityDsl.g:3212:1: rule__Authentication__Group__5__Impl : ( ( rule__Authentication__Group_5__0 )? ) ;
    public final void rule__Authentication__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3216:1: ( ( ( rule__Authentication__Group_5__0 )? ) )
            // InternalSecurityDsl.g:3217:1: ( ( rule__Authentication__Group_5__0 )? )
            {
            // InternalSecurityDsl.g:3217:1: ( ( rule__Authentication__Group_5__0 )? )
            // InternalSecurityDsl.g:3218:2: ( rule__Authentication__Group_5__0 )?
            {
             before(grammarAccess.getAuthenticationAccess().getGroup_5()); 
            // InternalSecurityDsl.g:3219:2: ( rule__Authentication__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==59) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSecurityDsl.g:3219:3: rule__Authentication__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Authentication__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAuthenticationAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group__5__Impl"


    // $ANTLR start "rule__Authentication__Group__6"
    // InternalSecurityDsl.g:3227:1: rule__Authentication__Group__6 : rule__Authentication__Group__6__Impl rule__Authentication__Group__7 ;
    public final void rule__Authentication__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3231:1: ( rule__Authentication__Group__6__Impl rule__Authentication__Group__7 )
            // InternalSecurityDsl.g:3232:2: rule__Authentication__Group__6__Impl rule__Authentication__Group__7
            {
            pushFollow(FOLLOW_31);
            rule__Authentication__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Authentication__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group__6"


    // $ANTLR start "rule__Authentication__Group__6__Impl"
    // InternalSecurityDsl.g:3239:1: rule__Authentication__Group__6__Impl : ( ( rule__Authentication__Group_6__0 )? ) ;
    public final void rule__Authentication__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3243:1: ( ( ( rule__Authentication__Group_6__0 )? ) )
            // InternalSecurityDsl.g:3244:1: ( ( rule__Authentication__Group_6__0 )? )
            {
            // InternalSecurityDsl.g:3244:1: ( ( rule__Authentication__Group_6__0 )? )
            // InternalSecurityDsl.g:3245:2: ( rule__Authentication__Group_6__0 )?
            {
             before(grammarAccess.getAuthenticationAccess().getGroup_6()); 
            // InternalSecurityDsl.g:3246:2: ( rule__Authentication__Group_6__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==60) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSecurityDsl.g:3246:3: rule__Authentication__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Authentication__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAuthenticationAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group__6__Impl"


    // $ANTLR start "rule__Authentication__Group__7"
    // InternalSecurityDsl.g:3254:1: rule__Authentication__Group__7 : rule__Authentication__Group__7__Impl rule__Authentication__Group__8 ;
    public final void rule__Authentication__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3258:1: ( rule__Authentication__Group__7__Impl rule__Authentication__Group__8 )
            // InternalSecurityDsl.g:3259:2: rule__Authentication__Group__7__Impl rule__Authentication__Group__8
            {
            pushFollow(FOLLOW_31);
            rule__Authentication__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Authentication__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group__7"


    // $ANTLR start "rule__Authentication__Group__7__Impl"
    // InternalSecurityDsl.g:3266:1: rule__Authentication__Group__7__Impl : ( ( rule__Authentication__Group_7__0 )? ) ;
    public final void rule__Authentication__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3270:1: ( ( ( rule__Authentication__Group_7__0 )? ) )
            // InternalSecurityDsl.g:3271:1: ( ( rule__Authentication__Group_7__0 )? )
            {
            // InternalSecurityDsl.g:3271:1: ( ( rule__Authentication__Group_7__0 )? )
            // InternalSecurityDsl.g:3272:2: ( rule__Authentication__Group_7__0 )?
            {
             before(grammarAccess.getAuthenticationAccess().getGroup_7()); 
            // InternalSecurityDsl.g:3273:2: ( rule__Authentication__Group_7__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==61) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSecurityDsl.g:3273:3: rule__Authentication__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Authentication__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAuthenticationAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group__7__Impl"


    // $ANTLR start "rule__Authentication__Group__8"
    // InternalSecurityDsl.g:3281:1: rule__Authentication__Group__8 : rule__Authentication__Group__8__Impl rule__Authentication__Group__9 ;
    public final void rule__Authentication__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3285:1: ( rule__Authentication__Group__8__Impl rule__Authentication__Group__9 )
            // InternalSecurityDsl.g:3286:2: rule__Authentication__Group__8__Impl rule__Authentication__Group__9
            {
            pushFollow(FOLLOW_31);
            rule__Authentication__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Authentication__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group__8"


    // $ANTLR start "rule__Authentication__Group__8__Impl"
    // InternalSecurityDsl.g:3293:1: rule__Authentication__Group__8__Impl : ( ( rule__Authentication__Group_8__0 )? ) ;
    public final void rule__Authentication__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3297:1: ( ( ( rule__Authentication__Group_8__0 )? ) )
            // InternalSecurityDsl.g:3298:1: ( ( rule__Authentication__Group_8__0 )? )
            {
            // InternalSecurityDsl.g:3298:1: ( ( rule__Authentication__Group_8__0 )? )
            // InternalSecurityDsl.g:3299:2: ( rule__Authentication__Group_8__0 )?
            {
             before(grammarAccess.getAuthenticationAccess().getGroup_8()); 
            // InternalSecurityDsl.g:3300:2: ( rule__Authentication__Group_8__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==62) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSecurityDsl.g:3300:3: rule__Authentication__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Authentication__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAuthenticationAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group__8__Impl"


    // $ANTLR start "rule__Authentication__Group__9"
    // InternalSecurityDsl.g:3308:1: rule__Authentication__Group__9 : rule__Authentication__Group__9__Impl ;
    public final void rule__Authentication__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3312:1: ( rule__Authentication__Group__9__Impl )
            // InternalSecurityDsl.g:3313:2: rule__Authentication__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Authentication__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group__9"


    // $ANTLR start "rule__Authentication__Group__9__Impl"
    // InternalSecurityDsl.g:3319:1: rule__Authentication__Group__9__Impl : ( '}' ) ;
    public final void rule__Authentication__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3323:1: ( ( '}' ) )
            // InternalSecurityDsl.g:3324:1: ( '}' )
            {
            // InternalSecurityDsl.g:3324:1: ( '}' )
            // InternalSecurityDsl.g:3325:2: '}'
            {
             before(grammarAccess.getAuthenticationAccess().getRightCurlyBracketKeyword_9()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getAuthenticationAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group__9__Impl"


    // $ANTLR start "rule__Authentication__Group_5__0"
    // InternalSecurityDsl.g:3335:1: rule__Authentication__Group_5__0 : rule__Authentication__Group_5__0__Impl rule__Authentication__Group_5__1 ;
    public final void rule__Authentication__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3339:1: ( rule__Authentication__Group_5__0__Impl rule__Authentication__Group_5__1 )
            // InternalSecurityDsl.g:3340:2: rule__Authentication__Group_5__0__Impl rule__Authentication__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__Authentication__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Authentication__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group_5__0"


    // $ANTLR start "rule__Authentication__Group_5__0__Impl"
    // InternalSecurityDsl.g:3347:1: rule__Authentication__Group_5__0__Impl : ( 'controller_endpoints' ) ;
    public final void rule__Authentication__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3351:1: ( ( 'controller_endpoints' ) )
            // InternalSecurityDsl.g:3352:1: ( 'controller_endpoints' )
            {
            // InternalSecurityDsl.g:3352:1: ( 'controller_endpoints' )
            // InternalSecurityDsl.g:3353:2: 'controller_endpoints'
            {
             before(grammarAccess.getAuthenticationAccess().getController_endpointsKeyword_5_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getAuthenticationAccess().getController_endpointsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group_5__0__Impl"


    // $ANTLR start "rule__Authentication__Group_5__1"
    // InternalSecurityDsl.g:3362:1: rule__Authentication__Group_5__1 : rule__Authentication__Group_5__1__Impl rule__Authentication__Group_5__2 ;
    public final void rule__Authentication__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3366:1: ( rule__Authentication__Group_5__1__Impl rule__Authentication__Group_5__2 )
            // InternalSecurityDsl.g:3367:2: rule__Authentication__Group_5__1__Impl rule__Authentication__Group_5__2
            {
            pushFollow(FOLLOW_32);
            rule__Authentication__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Authentication__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group_5__1"


    // $ANTLR start "rule__Authentication__Group_5__1__Impl"
    // InternalSecurityDsl.g:3374:1: rule__Authentication__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Authentication__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3378:1: ( ( '{' ) )
            // InternalSecurityDsl.g:3379:1: ( '{' )
            {
            // InternalSecurityDsl.g:3379:1: ( '{' )
            // InternalSecurityDsl.g:3380:2: '{'
            {
             before(grammarAccess.getAuthenticationAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAuthenticationAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group_5__1__Impl"


    // $ANTLR start "rule__Authentication__Group_5__2"
    // InternalSecurityDsl.g:3389:1: rule__Authentication__Group_5__2 : rule__Authentication__Group_5__2__Impl rule__Authentication__Group_5__3 ;
    public final void rule__Authentication__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3393:1: ( rule__Authentication__Group_5__2__Impl rule__Authentication__Group_5__3 )
            // InternalSecurityDsl.g:3394:2: rule__Authentication__Group_5__2__Impl rule__Authentication__Group_5__3
            {
            pushFollow(FOLLOW_21);
            rule__Authentication__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Authentication__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group_5__2"


    // $ANTLR start "rule__Authentication__Group_5__2__Impl"
    // InternalSecurityDsl.g:3401:1: rule__Authentication__Group_5__2__Impl : ( ( rule__Authentication__Controller_endpointsAssignment_5_2 ) ) ;
    public final void rule__Authentication__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3405:1: ( ( ( rule__Authentication__Controller_endpointsAssignment_5_2 ) ) )
            // InternalSecurityDsl.g:3406:1: ( ( rule__Authentication__Controller_endpointsAssignment_5_2 ) )
            {
            // InternalSecurityDsl.g:3406:1: ( ( rule__Authentication__Controller_endpointsAssignment_5_2 ) )
            // InternalSecurityDsl.g:3407:2: ( rule__Authentication__Controller_endpointsAssignment_5_2 )
            {
             before(grammarAccess.getAuthenticationAccess().getController_endpointsAssignment_5_2()); 
            // InternalSecurityDsl.g:3408:2: ( rule__Authentication__Controller_endpointsAssignment_5_2 )
            // InternalSecurityDsl.g:3408:3: rule__Authentication__Controller_endpointsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Authentication__Controller_endpointsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getAuthenticationAccess().getController_endpointsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group_5__2__Impl"


    // $ANTLR start "rule__Authentication__Group_5__3"
    // InternalSecurityDsl.g:3416:1: rule__Authentication__Group_5__3 : rule__Authentication__Group_5__3__Impl rule__Authentication__Group_5__4 ;
    public final void rule__Authentication__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3420:1: ( rule__Authentication__Group_5__3__Impl rule__Authentication__Group_5__4 )
            // InternalSecurityDsl.g:3421:2: rule__Authentication__Group_5__3__Impl rule__Authentication__Group_5__4
            {
            pushFollow(FOLLOW_21);
            rule__Authentication__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Authentication__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group_5__3"


    // $ANTLR start "rule__Authentication__Group_5__3__Impl"
    // InternalSecurityDsl.g:3428:1: rule__Authentication__Group_5__3__Impl : ( ( rule__Authentication__Group_5_3__0 )* ) ;
    public final void rule__Authentication__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3432:1: ( ( ( rule__Authentication__Group_5_3__0 )* ) )
            // InternalSecurityDsl.g:3433:1: ( ( rule__Authentication__Group_5_3__0 )* )
            {
            // InternalSecurityDsl.g:3433:1: ( ( rule__Authentication__Group_5_3__0 )* )
            // InternalSecurityDsl.g:3434:2: ( rule__Authentication__Group_5_3__0 )*
            {
             before(grammarAccess.getAuthenticationAccess().getGroup_5_3()); 
            // InternalSecurityDsl.g:3435:2: ( rule__Authentication__Group_5_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==47) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSecurityDsl.g:3435:3: rule__Authentication__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Authentication__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getAuthenticationAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group_5__3__Impl"


    // $ANTLR start "rule__Authentication__Group_5__4"
    // InternalSecurityDsl.g:3443:1: rule__Authentication__Group_5__4 : rule__Authentication__Group_5__4__Impl ;
    public final void rule__Authentication__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3447:1: ( rule__Authentication__Group_5__4__Impl )
            // InternalSecurityDsl.g:3448:2: rule__Authentication__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Authentication__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group_5__4"


    // $ANTLR start "rule__Authentication__Group_5__4__Impl"
    // InternalSecurityDsl.g:3454:1: rule__Authentication__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Authentication__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3458:1: ( ( '}' ) )
            // InternalSecurityDsl.g:3459:1: ( '}' )
            {
            // InternalSecurityDsl.g:3459:1: ( '}' )
            // InternalSecurityDsl.g:3460:2: '}'
            {
             before(grammarAccess.getAuthenticationAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getAuthenticationAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group_5__4__Impl"


    // $ANTLR start "rule__Authentication__Group_5_3__0"
    // InternalSecurityDsl.g:3470:1: rule__Authentication__Group_5_3__0 : rule__Authentication__Group_5_3__0__Impl rule__Authentication__Group_5_3__1 ;
    public final void rule__Authentication__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3474:1: ( rule__Authentication__Group_5_3__0__Impl rule__Authentication__Group_5_3__1 )
            // InternalSecurityDsl.g:3475:2: rule__Authentication__Group_5_3__0__Impl rule__Authentication__Group_5_3__1
            {
            pushFollow(FOLLOW_32);
            rule__Authentication__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Authentication__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group_5_3__0"


    // $ANTLR start "rule__Authentication__Group_5_3__0__Impl"
    // InternalSecurityDsl.g:3482:1: rule__Authentication__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Authentication__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3486:1: ( ( ',' ) )
            // InternalSecurityDsl.g:3487:1: ( ',' )
            {
            // InternalSecurityDsl.g:3487:1: ( ',' )
            // InternalSecurityDsl.g:3488:2: ','
            {
             before(grammarAccess.getAuthenticationAccess().getCommaKeyword_5_3_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getAuthenticationAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group_5_3__0__Impl"


    // $ANTLR start "rule__Authentication__Group_5_3__1"
    // InternalSecurityDsl.g:3497:1: rule__Authentication__Group_5_3__1 : rule__Authentication__Group_5_3__1__Impl ;
    public final void rule__Authentication__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3501:1: ( rule__Authentication__Group_5_3__1__Impl )
            // InternalSecurityDsl.g:3502:2: rule__Authentication__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Authentication__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group_5_3__1"


    // $ANTLR start "rule__Authentication__Group_5_3__1__Impl"
    // InternalSecurityDsl.g:3508:1: rule__Authentication__Group_5_3__1__Impl : ( ( rule__Authentication__Controller_endpointsAssignment_5_3_1 ) ) ;
    public final void rule__Authentication__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3512:1: ( ( ( rule__Authentication__Controller_endpointsAssignment_5_3_1 ) ) )
            // InternalSecurityDsl.g:3513:1: ( ( rule__Authentication__Controller_endpointsAssignment_5_3_1 ) )
            {
            // InternalSecurityDsl.g:3513:1: ( ( rule__Authentication__Controller_endpointsAssignment_5_3_1 ) )
            // InternalSecurityDsl.g:3514:2: ( rule__Authentication__Controller_endpointsAssignment_5_3_1 )
            {
             before(grammarAccess.getAuthenticationAccess().getController_endpointsAssignment_5_3_1()); 
            // InternalSecurityDsl.g:3515:2: ( rule__Authentication__Controller_endpointsAssignment_5_3_1 )
            // InternalSecurityDsl.g:3515:3: rule__Authentication__Controller_endpointsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Authentication__Controller_endpointsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAuthenticationAccess().getController_endpointsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group_5_3__1__Impl"


    // $ANTLR start "rule__Authentication__Group_6__0"
    // InternalSecurityDsl.g:3524:1: rule__Authentication__Group_6__0 : rule__Authentication__Group_6__0__Impl rule__Authentication__Group_6__1 ;
    public final void rule__Authentication__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3528:1: ( rule__Authentication__Group_6__0__Impl rule__Authentication__Group_6__1 )
            // InternalSecurityDsl.g:3529:2: rule__Authentication__Group_6__0__Impl rule__Authentication__Group_6__1
            {
            pushFollow(FOLLOW_32);
            rule__Authentication__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Authentication__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group_6__0"


    // $ANTLR start "rule__Authentication__Group_6__0__Impl"
    // InternalSecurityDsl.g:3536:1: rule__Authentication__Group_6__0__Impl : ( 'signup_endpoint' ) ;
    public final void rule__Authentication__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3540:1: ( ( 'signup_endpoint' ) )
            // InternalSecurityDsl.g:3541:1: ( 'signup_endpoint' )
            {
            // InternalSecurityDsl.g:3541:1: ( 'signup_endpoint' )
            // InternalSecurityDsl.g:3542:2: 'signup_endpoint'
            {
             before(grammarAccess.getAuthenticationAccess().getSignup_endpointKeyword_6_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getAuthenticationAccess().getSignup_endpointKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group_6__0__Impl"


    // $ANTLR start "rule__Authentication__Group_6__1"
    // InternalSecurityDsl.g:3551:1: rule__Authentication__Group_6__1 : rule__Authentication__Group_6__1__Impl ;
    public final void rule__Authentication__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3555:1: ( rule__Authentication__Group_6__1__Impl )
            // InternalSecurityDsl.g:3556:2: rule__Authentication__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Authentication__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group_6__1"


    // $ANTLR start "rule__Authentication__Group_6__1__Impl"
    // InternalSecurityDsl.g:3562:1: rule__Authentication__Group_6__1__Impl : ( ( rule__Authentication__Signup_endpointAssignment_6_1 ) ) ;
    public final void rule__Authentication__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3566:1: ( ( ( rule__Authentication__Signup_endpointAssignment_6_1 ) ) )
            // InternalSecurityDsl.g:3567:1: ( ( rule__Authentication__Signup_endpointAssignment_6_1 ) )
            {
            // InternalSecurityDsl.g:3567:1: ( ( rule__Authentication__Signup_endpointAssignment_6_1 ) )
            // InternalSecurityDsl.g:3568:2: ( rule__Authentication__Signup_endpointAssignment_6_1 )
            {
             before(grammarAccess.getAuthenticationAccess().getSignup_endpointAssignment_6_1()); 
            // InternalSecurityDsl.g:3569:2: ( rule__Authentication__Signup_endpointAssignment_6_1 )
            // InternalSecurityDsl.g:3569:3: rule__Authentication__Signup_endpointAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Authentication__Signup_endpointAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getAuthenticationAccess().getSignup_endpointAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group_6__1__Impl"


    // $ANTLR start "rule__Authentication__Group_7__0"
    // InternalSecurityDsl.g:3578:1: rule__Authentication__Group_7__0 : rule__Authentication__Group_7__0__Impl rule__Authentication__Group_7__1 ;
    public final void rule__Authentication__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3582:1: ( rule__Authentication__Group_7__0__Impl rule__Authentication__Group_7__1 )
            // InternalSecurityDsl.g:3583:2: rule__Authentication__Group_7__0__Impl rule__Authentication__Group_7__1
            {
            pushFollow(FOLLOW_32);
            rule__Authentication__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Authentication__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group_7__0"


    // $ANTLR start "rule__Authentication__Group_7__0__Impl"
    // InternalSecurityDsl.g:3590:1: rule__Authentication__Group_7__0__Impl : ( 'login_endpoint' ) ;
    public final void rule__Authentication__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3594:1: ( ( 'login_endpoint' ) )
            // InternalSecurityDsl.g:3595:1: ( 'login_endpoint' )
            {
            // InternalSecurityDsl.g:3595:1: ( 'login_endpoint' )
            // InternalSecurityDsl.g:3596:2: 'login_endpoint'
            {
             before(grammarAccess.getAuthenticationAccess().getLogin_endpointKeyword_7_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getAuthenticationAccess().getLogin_endpointKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group_7__0__Impl"


    // $ANTLR start "rule__Authentication__Group_7__1"
    // InternalSecurityDsl.g:3605:1: rule__Authentication__Group_7__1 : rule__Authentication__Group_7__1__Impl ;
    public final void rule__Authentication__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3609:1: ( rule__Authentication__Group_7__1__Impl )
            // InternalSecurityDsl.g:3610:2: rule__Authentication__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Authentication__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group_7__1"


    // $ANTLR start "rule__Authentication__Group_7__1__Impl"
    // InternalSecurityDsl.g:3616:1: rule__Authentication__Group_7__1__Impl : ( ( rule__Authentication__Login_endpointAssignment_7_1 ) ) ;
    public final void rule__Authentication__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3620:1: ( ( ( rule__Authentication__Login_endpointAssignment_7_1 ) ) )
            // InternalSecurityDsl.g:3621:1: ( ( rule__Authentication__Login_endpointAssignment_7_1 ) )
            {
            // InternalSecurityDsl.g:3621:1: ( ( rule__Authentication__Login_endpointAssignment_7_1 ) )
            // InternalSecurityDsl.g:3622:2: ( rule__Authentication__Login_endpointAssignment_7_1 )
            {
             before(grammarAccess.getAuthenticationAccess().getLogin_endpointAssignment_7_1()); 
            // InternalSecurityDsl.g:3623:2: ( rule__Authentication__Login_endpointAssignment_7_1 )
            // InternalSecurityDsl.g:3623:3: rule__Authentication__Login_endpointAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Authentication__Login_endpointAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getAuthenticationAccess().getLogin_endpointAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group_7__1__Impl"


    // $ANTLR start "rule__Authentication__Group_8__0"
    // InternalSecurityDsl.g:3632:1: rule__Authentication__Group_8__0 : rule__Authentication__Group_8__0__Impl rule__Authentication__Group_8__1 ;
    public final void rule__Authentication__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3636:1: ( rule__Authentication__Group_8__0__Impl rule__Authentication__Group_8__1 )
            // InternalSecurityDsl.g:3637:2: rule__Authentication__Group_8__0__Impl rule__Authentication__Group_8__1
            {
            pushFollow(FOLLOW_32);
            rule__Authentication__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Authentication__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group_8__0"


    // $ANTLR start "rule__Authentication__Group_8__0__Impl"
    // InternalSecurityDsl.g:3644:1: rule__Authentication__Group_8__0__Impl : ( 'logout_endpoint' ) ;
    public final void rule__Authentication__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3648:1: ( ( 'logout_endpoint' ) )
            // InternalSecurityDsl.g:3649:1: ( 'logout_endpoint' )
            {
            // InternalSecurityDsl.g:3649:1: ( 'logout_endpoint' )
            // InternalSecurityDsl.g:3650:2: 'logout_endpoint'
            {
             before(grammarAccess.getAuthenticationAccess().getLogout_endpointKeyword_8_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getAuthenticationAccess().getLogout_endpointKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group_8__0__Impl"


    // $ANTLR start "rule__Authentication__Group_8__1"
    // InternalSecurityDsl.g:3659:1: rule__Authentication__Group_8__1 : rule__Authentication__Group_8__1__Impl ;
    public final void rule__Authentication__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3663:1: ( rule__Authentication__Group_8__1__Impl )
            // InternalSecurityDsl.g:3664:2: rule__Authentication__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Authentication__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group_8__1"


    // $ANTLR start "rule__Authentication__Group_8__1__Impl"
    // InternalSecurityDsl.g:3670:1: rule__Authentication__Group_8__1__Impl : ( ( rule__Authentication__Logout_endpointAssignment_8_1 ) ) ;
    public final void rule__Authentication__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3674:1: ( ( ( rule__Authentication__Logout_endpointAssignment_8_1 ) ) )
            // InternalSecurityDsl.g:3675:1: ( ( rule__Authentication__Logout_endpointAssignment_8_1 ) )
            {
            // InternalSecurityDsl.g:3675:1: ( ( rule__Authentication__Logout_endpointAssignment_8_1 ) )
            // InternalSecurityDsl.g:3676:2: ( rule__Authentication__Logout_endpointAssignment_8_1 )
            {
             before(grammarAccess.getAuthenticationAccess().getLogout_endpointAssignment_8_1()); 
            // InternalSecurityDsl.g:3677:2: ( rule__Authentication__Logout_endpointAssignment_8_1 )
            // InternalSecurityDsl.g:3677:3: rule__Authentication__Logout_endpointAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Authentication__Logout_endpointAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getAuthenticationAccess().getLogout_endpointAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group_8__1__Impl"


    // $ANTLR start "rule__OtherController__Group__0"
    // InternalSecurityDsl.g:3686:1: rule__OtherController__Group__0 : rule__OtherController__Group__0__Impl rule__OtherController__Group__1 ;
    public final void rule__OtherController__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3690:1: ( rule__OtherController__Group__0__Impl rule__OtherController__Group__1 )
            // InternalSecurityDsl.g:3691:2: rule__OtherController__Group__0__Impl rule__OtherController__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__OtherController__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherController__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherController__Group__0"


    // $ANTLR start "rule__OtherController__Group__0__Impl"
    // InternalSecurityDsl.g:3698:1: rule__OtherController__Group__0__Impl : ( 'OtherController' ) ;
    public final void rule__OtherController__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3702:1: ( ( 'OtherController' ) )
            // InternalSecurityDsl.g:3703:1: ( 'OtherController' )
            {
            // InternalSecurityDsl.g:3703:1: ( 'OtherController' )
            // InternalSecurityDsl.g:3704:2: 'OtherController'
            {
             before(grammarAccess.getOtherControllerAccess().getOtherControllerKeyword_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getOtherControllerAccess().getOtherControllerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherController__Group__0__Impl"


    // $ANTLR start "rule__OtherController__Group__1"
    // InternalSecurityDsl.g:3713:1: rule__OtherController__Group__1 : rule__OtherController__Group__1__Impl rule__OtherController__Group__2 ;
    public final void rule__OtherController__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3717:1: ( rule__OtherController__Group__1__Impl rule__OtherController__Group__2 )
            // InternalSecurityDsl.g:3718:2: rule__OtherController__Group__1__Impl rule__OtherController__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__OtherController__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherController__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherController__Group__1"


    // $ANTLR start "rule__OtherController__Group__1__Impl"
    // InternalSecurityDsl.g:3725:1: rule__OtherController__Group__1__Impl : ( ( rule__OtherController__NameAssignment_1 ) ) ;
    public final void rule__OtherController__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3729:1: ( ( ( rule__OtherController__NameAssignment_1 ) ) )
            // InternalSecurityDsl.g:3730:1: ( ( rule__OtherController__NameAssignment_1 ) )
            {
            // InternalSecurityDsl.g:3730:1: ( ( rule__OtherController__NameAssignment_1 ) )
            // InternalSecurityDsl.g:3731:2: ( rule__OtherController__NameAssignment_1 )
            {
             before(grammarAccess.getOtherControllerAccess().getNameAssignment_1()); 
            // InternalSecurityDsl.g:3732:2: ( rule__OtherController__NameAssignment_1 )
            // InternalSecurityDsl.g:3732:3: rule__OtherController__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OtherController__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOtherControllerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherController__Group__1__Impl"


    // $ANTLR start "rule__OtherController__Group__2"
    // InternalSecurityDsl.g:3740:1: rule__OtherController__Group__2 : rule__OtherController__Group__2__Impl rule__OtherController__Group__3 ;
    public final void rule__OtherController__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3744:1: ( rule__OtherController__Group__2__Impl rule__OtherController__Group__3 )
            // InternalSecurityDsl.g:3745:2: rule__OtherController__Group__2__Impl rule__OtherController__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__OtherController__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherController__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherController__Group__2"


    // $ANTLR start "rule__OtherController__Group__2__Impl"
    // InternalSecurityDsl.g:3752:1: rule__OtherController__Group__2__Impl : ( '{' ) ;
    public final void rule__OtherController__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3756:1: ( ( '{' ) )
            // InternalSecurityDsl.g:3757:1: ( '{' )
            {
            // InternalSecurityDsl.g:3757:1: ( '{' )
            // InternalSecurityDsl.g:3758:2: '{'
            {
             before(grammarAccess.getOtherControllerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getOtherControllerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherController__Group__2__Impl"


    // $ANTLR start "rule__OtherController__Group__3"
    // InternalSecurityDsl.g:3767:1: rule__OtherController__Group__3 : rule__OtherController__Group__3__Impl rule__OtherController__Group__4 ;
    public final void rule__OtherController__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3771:1: ( rule__OtherController__Group__3__Impl rule__OtherController__Group__4 )
            // InternalSecurityDsl.g:3772:2: rule__OtherController__Group__3__Impl rule__OtherController__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__OtherController__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherController__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherController__Group__3"


    // $ANTLR start "rule__OtherController__Group__3__Impl"
    // InternalSecurityDsl.g:3779:1: rule__OtherController__Group__3__Impl : ( 'path' ) ;
    public final void rule__OtherController__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3783:1: ( ( 'path' ) )
            // InternalSecurityDsl.g:3784:1: ( 'path' )
            {
            // InternalSecurityDsl.g:3784:1: ( 'path' )
            // InternalSecurityDsl.g:3785:2: 'path'
            {
             before(grammarAccess.getOtherControllerAccess().getPathKeyword_3()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getOtherControllerAccess().getPathKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherController__Group__3__Impl"


    // $ANTLR start "rule__OtherController__Group__4"
    // InternalSecurityDsl.g:3794:1: rule__OtherController__Group__4 : rule__OtherController__Group__4__Impl rule__OtherController__Group__5 ;
    public final void rule__OtherController__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3798:1: ( rule__OtherController__Group__4__Impl rule__OtherController__Group__5 )
            // InternalSecurityDsl.g:3799:2: rule__OtherController__Group__4__Impl rule__OtherController__Group__5
            {
            pushFollow(FOLLOW_33);
            rule__OtherController__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherController__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherController__Group__4"


    // $ANTLR start "rule__OtherController__Group__4__Impl"
    // InternalSecurityDsl.g:3806:1: rule__OtherController__Group__4__Impl : ( ( rule__OtherController__PathAssignment_4 ) ) ;
    public final void rule__OtherController__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3810:1: ( ( ( rule__OtherController__PathAssignment_4 ) ) )
            // InternalSecurityDsl.g:3811:1: ( ( rule__OtherController__PathAssignment_4 ) )
            {
            // InternalSecurityDsl.g:3811:1: ( ( rule__OtherController__PathAssignment_4 ) )
            // InternalSecurityDsl.g:3812:2: ( rule__OtherController__PathAssignment_4 )
            {
             before(grammarAccess.getOtherControllerAccess().getPathAssignment_4()); 
            // InternalSecurityDsl.g:3813:2: ( rule__OtherController__PathAssignment_4 )
            // InternalSecurityDsl.g:3813:3: rule__OtherController__PathAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__OtherController__PathAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOtherControllerAccess().getPathAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherController__Group__4__Impl"


    // $ANTLR start "rule__OtherController__Group__5"
    // InternalSecurityDsl.g:3821:1: rule__OtherController__Group__5 : rule__OtherController__Group__5__Impl rule__OtherController__Group__6 ;
    public final void rule__OtherController__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3825:1: ( rule__OtherController__Group__5__Impl rule__OtherController__Group__6 )
            // InternalSecurityDsl.g:3826:2: rule__OtherController__Group__5__Impl rule__OtherController__Group__6
            {
            pushFollow(FOLLOW_33);
            rule__OtherController__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherController__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherController__Group__5"


    // $ANTLR start "rule__OtherController__Group__5__Impl"
    // InternalSecurityDsl.g:3833:1: rule__OtherController__Group__5__Impl : ( ( rule__OtherController__Group_5__0 )? ) ;
    public final void rule__OtherController__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3837:1: ( ( ( rule__OtherController__Group_5__0 )? ) )
            // InternalSecurityDsl.g:3838:1: ( ( rule__OtherController__Group_5__0 )? )
            {
            // InternalSecurityDsl.g:3838:1: ( ( rule__OtherController__Group_5__0 )? )
            // InternalSecurityDsl.g:3839:2: ( rule__OtherController__Group_5__0 )?
            {
             before(grammarAccess.getOtherControllerAccess().getGroup_5()); 
            // InternalSecurityDsl.g:3840:2: ( rule__OtherController__Group_5__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==59) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSecurityDsl.g:3840:3: rule__OtherController__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OtherController__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOtherControllerAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherController__Group__5__Impl"


    // $ANTLR start "rule__OtherController__Group__6"
    // InternalSecurityDsl.g:3848:1: rule__OtherController__Group__6 : rule__OtherController__Group__6__Impl ;
    public final void rule__OtherController__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3852:1: ( rule__OtherController__Group__6__Impl )
            // InternalSecurityDsl.g:3853:2: rule__OtherController__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OtherController__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherController__Group__6"


    // $ANTLR start "rule__OtherController__Group__6__Impl"
    // InternalSecurityDsl.g:3859:1: rule__OtherController__Group__6__Impl : ( '}' ) ;
    public final void rule__OtherController__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3863:1: ( ( '}' ) )
            // InternalSecurityDsl.g:3864:1: ( '}' )
            {
            // InternalSecurityDsl.g:3864:1: ( '}' )
            // InternalSecurityDsl.g:3865:2: '}'
            {
             before(grammarAccess.getOtherControllerAccess().getRightCurlyBracketKeyword_6()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getOtherControllerAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherController__Group__6__Impl"


    // $ANTLR start "rule__OtherController__Group_5__0"
    // InternalSecurityDsl.g:3875:1: rule__OtherController__Group_5__0 : rule__OtherController__Group_5__0__Impl rule__OtherController__Group_5__1 ;
    public final void rule__OtherController__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3879:1: ( rule__OtherController__Group_5__0__Impl rule__OtherController__Group_5__1 )
            // InternalSecurityDsl.g:3880:2: rule__OtherController__Group_5__0__Impl rule__OtherController__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__OtherController__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherController__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherController__Group_5__0"


    // $ANTLR start "rule__OtherController__Group_5__0__Impl"
    // InternalSecurityDsl.g:3887:1: rule__OtherController__Group_5__0__Impl : ( 'controller_endpoints' ) ;
    public final void rule__OtherController__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3891:1: ( ( 'controller_endpoints' ) )
            // InternalSecurityDsl.g:3892:1: ( 'controller_endpoints' )
            {
            // InternalSecurityDsl.g:3892:1: ( 'controller_endpoints' )
            // InternalSecurityDsl.g:3893:2: 'controller_endpoints'
            {
             before(grammarAccess.getOtherControllerAccess().getController_endpointsKeyword_5_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getOtherControllerAccess().getController_endpointsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherController__Group_5__0__Impl"


    // $ANTLR start "rule__OtherController__Group_5__1"
    // InternalSecurityDsl.g:3902:1: rule__OtherController__Group_5__1 : rule__OtherController__Group_5__1__Impl rule__OtherController__Group_5__2 ;
    public final void rule__OtherController__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3906:1: ( rule__OtherController__Group_5__1__Impl rule__OtherController__Group_5__2 )
            // InternalSecurityDsl.g:3907:2: rule__OtherController__Group_5__1__Impl rule__OtherController__Group_5__2
            {
            pushFollow(FOLLOW_32);
            rule__OtherController__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherController__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherController__Group_5__1"


    // $ANTLR start "rule__OtherController__Group_5__1__Impl"
    // InternalSecurityDsl.g:3914:1: rule__OtherController__Group_5__1__Impl : ( '{' ) ;
    public final void rule__OtherController__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3918:1: ( ( '{' ) )
            // InternalSecurityDsl.g:3919:1: ( '{' )
            {
            // InternalSecurityDsl.g:3919:1: ( '{' )
            // InternalSecurityDsl.g:3920:2: '{'
            {
             before(grammarAccess.getOtherControllerAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getOtherControllerAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherController__Group_5__1__Impl"


    // $ANTLR start "rule__OtherController__Group_5__2"
    // InternalSecurityDsl.g:3929:1: rule__OtherController__Group_5__2 : rule__OtherController__Group_5__2__Impl rule__OtherController__Group_5__3 ;
    public final void rule__OtherController__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3933:1: ( rule__OtherController__Group_5__2__Impl rule__OtherController__Group_5__3 )
            // InternalSecurityDsl.g:3934:2: rule__OtherController__Group_5__2__Impl rule__OtherController__Group_5__3
            {
            pushFollow(FOLLOW_21);
            rule__OtherController__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherController__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherController__Group_5__2"


    // $ANTLR start "rule__OtherController__Group_5__2__Impl"
    // InternalSecurityDsl.g:3941:1: rule__OtherController__Group_5__2__Impl : ( ( rule__OtherController__Controller_endpointsAssignment_5_2 ) ) ;
    public final void rule__OtherController__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3945:1: ( ( ( rule__OtherController__Controller_endpointsAssignment_5_2 ) ) )
            // InternalSecurityDsl.g:3946:1: ( ( rule__OtherController__Controller_endpointsAssignment_5_2 ) )
            {
            // InternalSecurityDsl.g:3946:1: ( ( rule__OtherController__Controller_endpointsAssignment_5_2 ) )
            // InternalSecurityDsl.g:3947:2: ( rule__OtherController__Controller_endpointsAssignment_5_2 )
            {
             before(grammarAccess.getOtherControllerAccess().getController_endpointsAssignment_5_2()); 
            // InternalSecurityDsl.g:3948:2: ( rule__OtherController__Controller_endpointsAssignment_5_2 )
            // InternalSecurityDsl.g:3948:3: rule__OtherController__Controller_endpointsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__OtherController__Controller_endpointsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getOtherControllerAccess().getController_endpointsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherController__Group_5__2__Impl"


    // $ANTLR start "rule__OtherController__Group_5__3"
    // InternalSecurityDsl.g:3956:1: rule__OtherController__Group_5__3 : rule__OtherController__Group_5__3__Impl rule__OtherController__Group_5__4 ;
    public final void rule__OtherController__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3960:1: ( rule__OtherController__Group_5__3__Impl rule__OtherController__Group_5__4 )
            // InternalSecurityDsl.g:3961:2: rule__OtherController__Group_5__3__Impl rule__OtherController__Group_5__4
            {
            pushFollow(FOLLOW_21);
            rule__OtherController__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherController__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherController__Group_5__3"


    // $ANTLR start "rule__OtherController__Group_5__3__Impl"
    // InternalSecurityDsl.g:3968:1: rule__OtherController__Group_5__3__Impl : ( ( rule__OtherController__Group_5_3__0 )* ) ;
    public final void rule__OtherController__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3972:1: ( ( ( rule__OtherController__Group_5_3__0 )* ) )
            // InternalSecurityDsl.g:3973:1: ( ( rule__OtherController__Group_5_3__0 )* )
            {
            // InternalSecurityDsl.g:3973:1: ( ( rule__OtherController__Group_5_3__0 )* )
            // InternalSecurityDsl.g:3974:2: ( rule__OtherController__Group_5_3__0 )*
            {
             before(grammarAccess.getOtherControllerAccess().getGroup_5_3()); 
            // InternalSecurityDsl.g:3975:2: ( rule__OtherController__Group_5_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==47) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSecurityDsl.g:3975:3: rule__OtherController__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__OtherController__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getOtherControllerAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherController__Group_5__3__Impl"


    // $ANTLR start "rule__OtherController__Group_5__4"
    // InternalSecurityDsl.g:3983:1: rule__OtherController__Group_5__4 : rule__OtherController__Group_5__4__Impl ;
    public final void rule__OtherController__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3987:1: ( rule__OtherController__Group_5__4__Impl )
            // InternalSecurityDsl.g:3988:2: rule__OtherController__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OtherController__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherController__Group_5__4"


    // $ANTLR start "rule__OtherController__Group_5__4__Impl"
    // InternalSecurityDsl.g:3994:1: rule__OtherController__Group_5__4__Impl : ( '}' ) ;
    public final void rule__OtherController__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3998:1: ( ( '}' ) )
            // InternalSecurityDsl.g:3999:1: ( '}' )
            {
            // InternalSecurityDsl.g:3999:1: ( '}' )
            // InternalSecurityDsl.g:4000:2: '}'
            {
             before(grammarAccess.getOtherControllerAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getOtherControllerAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherController__Group_5__4__Impl"


    // $ANTLR start "rule__OtherController__Group_5_3__0"
    // InternalSecurityDsl.g:4010:1: rule__OtherController__Group_5_3__0 : rule__OtherController__Group_5_3__0__Impl rule__OtherController__Group_5_3__1 ;
    public final void rule__OtherController__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4014:1: ( rule__OtherController__Group_5_3__0__Impl rule__OtherController__Group_5_3__1 )
            // InternalSecurityDsl.g:4015:2: rule__OtherController__Group_5_3__0__Impl rule__OtherController__Group_5_3__1
            {
            pushFollow(FOLLOW_32);
            rule__OtherController__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherController__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherController__Group_5_3__0"


    // $ANTLR start "rule__OtherController__Group_5_3__0__Impl"
    // InternalSecurityDsl.g:4022:1: rule__OtherController__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__OtherController__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4026:1: ( ( ',' ) )
            // InternalSecurityDsl.g:4027:1: ( ',' )
            {
            // InternalSecurityDsl.g:4027:1: ( ',' )
            // InternalSecurityDsl.g:4028:2: ','
            {
             before(grammarAccess.getOtherControllerAccess().getCommaKeyword_5_3_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getOtherControllerAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherController__Group_5_3__0__Impl"


    // $ANTLR start "rule__OtherController__Group_5_3__1"
    // InternalSecurityDsl.g:4037:1: rule__OtherController__Group_5_3__1 : rule__OtherController__Group_5_3__1__Impl ;
    public final void rule__OtherController__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4041:1: ( rule__OtherController__Group_5_3__1__Impl )
            // InternalSecurityDsl.g:4042:2: rule__OtherController__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OtherController__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherController__Group_5_3__1"


    // $ANTLR start "rule__OtherController__Group_5_3__1__Impl"
    // InternalSecurityDsl.g:4048:1: rule__OtherController__Group_5_3__1__Impl : ( ( rule__OtherController__Controller_endpointsAssignment_5_3_1 ) ) ;
    public final void rule__OtherController__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4052:1: ( ( ( rule__OtherController__Controller_endpointsAssignment_5_3_1 ) ) )
            // InternalSecurityDsl.g:4053:1: ( ( rule__OtherController__Controller_endpointsAssignment_5_3_1 ) )
            {
            // InternalSecurityDsl.g:4053:1: ( ( rule__OtherController__Controller_endpointsAssignment_5_3_1 ) )
            // InternalSecurityDsl.g:4054:2: ( rule__OtherController__Controller_endpointsAssignment_5_3_1 )
            {
             before(grammarAccess.getOtherControllerAccess().getController_endpointsAssignment_5_3_1()); 
            // InternalSecurityDsl.g:4055:2: ( rule__OtherController__Controller_endpointsAssignment_5_3_1 )
            // InternalSecurityDsl.g:4055:3: rule__OtherController__Controller_endpointsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__OtherController__Controller_endpointsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOtherControllerAccess().getController_endpointsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherController__Group_5_3__1__Impl"


    // $ANTLR start "rule__JwtSecurity__Group__0"
    // InternalSecurityDsl.g:4064:1: rule__JwtSecurity__Group__0 : rule__JwtSecurity__Group__0__Impl rule__JwtSecurity__Group__1 ;
    public final void rule__JwtSecurity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4068:1: ( rule__JwtSecurity__Group__0__Impl rule__JwtSecurity__Group__1 )
            // InternalSecurityDsl.g:4069:2: rule__JwtSecurity__Group__0__Impl rule__JwtSecurity__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__JwtSecurity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JwtSecurity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group__0"


    // $ANTLR start "rule__JwtSecurity__Group__0__Impl"
    // InternalSecurityDsl.g:4076:1: rule__JwtSecurity__Group__0__Impl : ( 'mechanism:' ) ;
    public final void rule__JwtSecurity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4080:1: ( ( 'mechanism:' ) )
            // InternalSecurityDsl.g:4081:1: ( 'mechanism:' )
            {
            // InternalSecurityDsl.g:4081:1: ( 'mechanism:' )
            // InternalSecurityDsl.g:4082:2: 'mechanism:'
            {
             before(grammarAccess.getJwtSecurityAccess().getMechanismKeyword_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getJwtSecurityAccess().getMechanismKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group__0__Impl"


    // $ANTLR start "rule__JwtSecurity__Group__1"
    // InternalSecurityDsl.g:4091:1: rule__JwtSecurity__Group__1 : rule__JwtSecurity__Group__1__Impl rule__JwtSecurity__Group__2 ;
    public final void rule__JwtSecurity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4095:1: ( rule__JwtSecurity__Group__1__Impl rule__JwtSecurity__Group__2 )
            // InternalSecurityDsl.g:4096:2: rule__JwtSecurity__Group__1__Impl rule__JwtSecurity__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__JwtSecurity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JwtSecurity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group__1"


    // $ANTLR start "rule__JwtSecurity__Group__1__Impl"
    // InternalSecurityDsl.g:4103:1: rule__JwtSecurity__Group__1__Impl : ( ( rule__JwtSecurity__MechanismAssignment_1 ) ) ;
    public final void rule__JwtSecurity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4107:1: ( ( ( rule__JwtSecurity__MechanismAssignment_1 ) ) )
            // InternalSecurityDsl.g:4108:1: ( ( rule__JwtSecurity__MechanismAssignment_1 ) )
            {
            // InternalSecurityDsl.g:4108:1: ( ( rule__JwtSecurity__MechanismAssignment_1 ) )
            // InternalSecurityDsl.g:4109:2: ( rule__JwtSecurity__MechanismAssignment_1 )
            {
             before(grammarAccess.getJwtSecurityAccess().getMechanismAssignment_1()); 
            // InternalSecurityDsl.g:4110:2: ( rule__JwtSecurity__MechanismAssignment_1 )
            // InternalSecurityDsl.g:4110:3: rule__JwtSecurity__MechanismAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__JwtSecurity__MechanismAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJwtSecurityAccess().getMechanismAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group__1__Impl"


    // $ANTLR start "rule__JwtSecurity__Group__2"
    // InternalSecurityDsl.g:4118:1: rule__JwtSecurity__Group__2 : rule__JwtSecurity__Group__2__Impl rule__JwtSecurity__Group__3 ;
    public final void rule__JwtSecurity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4122:1: ( rule__JwtSecurity__Group__2__Impl rule__JwtSecurity__Group__3 )
            // InternalSecurityDsl.g:4123:2: rule__JwtSecurity__Group__2__Impl rule__JwtSecurity__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__JwtSecurity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JwtSecurity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group__2"


    // $ANTLR start "rule__JwtSecurity__Group__2__Impl"
    // InternalSecurityDsl.g:4130:1: rule__JwtSecurity__Group__2__Impl : ( 'jwt:' ) ;
    public final void rule__JwtSecurity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4134:1: ( ( 'jwt:' ) )
            // InternalSecurityDsl.g:4135:1: ( 'jwt:' )
            {
            // InternalSecurityDsl.g:4135:1: ( 'jwt:' )
            // InternalSecurityDsl.g:4136:2: 'jwt:'
            {
             before(grammarAccess.getJwtSecurityAccess().getJwtKeyword_2()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getJwtSecurityAccess().getJwtKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group__2__Impl"


    // $ANTLR start "rule__JwtSecurity__Group__3"
    // InternalSecurityDsl.g:4145:1: rule__JwtSecurity__Group__3 : rule__JwtSecurity__Group__3__Impl rule__JwtSecurity__Group__4 ;
    public final void rule__JwtSecurity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4149:1: ( rule__JwtSecurity__Group__3__Impl rule__JwtSecurity__Group__4 )
            // InternalSecurityDsl.g:4150:2: rule__JwtSecurity__Group__3__Impl rule__JwtSecurity__Group__4
            {
            pushFollow(FOLLOW_37);
            rule__JwtSecurity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JwtSecurity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group__3"


    // $ANTLR start "rule__JwtSecurity__Group__3__Impl"
    // InternalSecurityDsl.g:4157:1: rule__JwtSecurity__Group__3__Impl : ( 'header:' ) ;
    public final void rule__JwtSecurity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4161:1: ( ( 'header:' ) )
            // InternalSecurityDsl.g:4162:1: ( 'header:' )
            {
            // InternalSecurityDsl.g:4162:1: ( 'header:' )
            // InternalSecurityDsl.g:4163:2: 'header:'
            {
             before(grammarAccess.getJwtSecurityAccess().getHeaderKeyword_3()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getJwtSecurityAccess().getHeaderKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group__3__Impl"


    // $ANTLR start "rule__JwtSecurity__Group__4"
    // InternalSecurityDsl.g:4172:1: rule__JwtSecurity__Group__4 : rule__JwtSecurity__Group__4__Impl rule__JwtSecurity__Group__5 ;
    public final void rule__JwtSecurity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4176:1: ( rule__JwtSecurity__Group__4__Impl rule__JwtSecurity__Group__5 )
            // InternalSecurityDsl.g:4177:2: rule__JwtSecurity__Group__4__Impl rule__JwtSecurity__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__JwtSecurity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JwtSecurity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group__4"


    // $ANTLR start "rule__JwtSecurity__Group__4__Impl"
    // InternalSecurityDsl.g:4184:1: rule__JwtSecurity__Group__4__Impl : ( 'signature-algorithm:' ) ;
    public final void rule__JwtSecurity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4188:1: ( ( 'signature-algorithm:' ) )
            // InternalSecurityDsl.g:4189:1: ( 'signature-algorithm:' )
            {
            // InternalSecurityDsl.g:4189:1: ( 'signature-algorithm:' )
            // InternalSecurityDsl.g:4190:2: 'signature-algorithm:'
            {
             before(grammarAccess.getJwtSecurityAccess().getSignatureAlgorithmKeyword_4()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getJwtSecurityAccess().getSignatureAlgorithmKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group__4__Impl"


    // $ANTLR start "rule__JwtSecurity__Group__5"
    // InternalSecurityDsl.g:4199:1: rule__JwtSecurity__Group__5 : rule__JwtSecurity__Group__5__Impl rule__JwtSecurity__Group__6 ;
    public final void rule__JwtSecurity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4203:1: ( rule__JwtSecurity__Group__5__Impl rule__JwtSecurity__Group__6 )
            // InternalSecurityDsl.g:4204:2: rule__JwtSecurity__Group__5__Impl rule__JwtSecurity__Group__6
            {
            pushFollow(FOLLOW_38);
            rule__JwtSecurity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JwtSecurity__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group__5"


    // $ANTLR start "rule__JwtSecurity__Group__5__Impl"
    // InternalSecurityDsl.g:4211:1: rule__JwtSecurity__Group__5__Impl : ( ( rule__JwtSecurity__SignatureAlgorithmAssignment_5 ) ) ;
    public final void rule__JwtSecurity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4215:1: ( ( ( rule__JwtSecurity__SignatureAlgorithmAssignment_5 ) ) )
            // InternalSecurityDsl.g:4216:1: ( ( rule__JwtSecurity__SignatureAlgorithmAssignment_5 ) )
            {
            // InternalSecurityDsl.g:4216:1: ( ( rule__JwtSecurity__SignatureAlgorithmAssignment_5 ) )
            // InternalSecurityDsl.g:4217:2: ( rule__JwtSecurity__SignatureAlgorithmAssignment_5 )
            {
             before(grammarAccess.getJwtSecurityAccess().getSignatureAlgorithmAssignment_5()); 
            // InternalSecurityDsl.g:4218:2: ( rule__JwtSecurity__SignatureAlgorithmAssignment_5 )
            // InternalSecurityDsl.g:4218:3: rule__JwtSecurity__SignatureAlgorithmAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__JwtSecurity__SignatureAlgorithmAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getJwtSecurityAccess().getSignatureAlgorithmAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group__5__Impl"


    // $ANTLR start "rule__JwtSecurity__Group__6"
    // InternalSecurityDsl.g:4226:1: rule__JwtSecurity__Group__6 : rule__JwtSecurity__Group__6__Impl rule__JwtSecurity__Group__7 ;
    public final void rule__JwtSecurity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4230:1: ( rule__JwtSecurity__Group__6__Impl rule__JwtSecurity__Group__7 )
            // InternalSecurityDsl.g:4231:2: rule__JwtSecurity__Group__6__Impl rule__JwtSecurity__Group__7
            {
            pushFollow(FOLLOW_39);
            rule__JwtSecurity__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JwtSecurity__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group__6"


    // $ANTLR start "rule__JwtSecurity__Group__6__Impl"
    // InternalSecurityDsl.g:4238:1: rule__JwtSecurity__Group__6__Impl : ( 'payload:' ) ;
    public final void rule__JwtSecurity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4242:1: ( ( 'payload:' ) )
            // InternalSecurityDsl.g:4243:1: ( 'payload:' )
            {
            // InternalSecurityDsl.g:4243:1: ( 'payload:' )
            // InternalSecurityDsl.g:4244:2: 'payload:'
            {
             before(grammarAccess.getJwtSecurityAccess().getPayloadKeyword_6()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getJwtSecurityAccess().getPayloadKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group__6__Impl"


    // $ANTLR start "rule__JwtSecurity__Group__7"
    // InternalSecurityDsl.g:4253:1: rule__JwtSecurity__Group__7 : rule__JwtSecurity__Group__7__Impl rule__JwtSecurity__Group__8 ;
    public final void rule__JwtSecurity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4257:1: ( rule__JwtSecurity__Group__7__Impl rule__JwtSecurity__Group__8 )
            // InternalSecurityDsl.g:4258:2: rule__JwtSecurity__Group__7__Impl rule__JwtSecurity__Group__8
            {
            pushFollow(FOLLOW_5);
            rule__JwtSecurity__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JwtSecurity__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group__7"


    // $ANTLR start "rule__JwtSecurity__Group__7__Impl"
    // InternalSecurityDsl.g:4265:1: rule__JwtSecurity__Group__7__Impl : ( 'issuer:' ) ;
    public final void rule__JwtSecurity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4269:1: ( ( 'issuer:' ) )
            // InternalSecurityDsl.g:4270:1: ( 'issuer:' )
            {
            // InternalSecurityDsl.g:4270:1: ( 'issuer:' )
            // InternalSecurityDsl.g:4271:2: 'issuer:'
            {
             before(grammarAccess.getJwtSecurityAccess().getIssuerKeyword_7()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getJwtSecurityAccess().getIssuerKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group__7__Impl"


    // $ANTLR start "rule__JwtSecurity__Group__8"
    // InternalSecurityDsl.g:4280:1: rule__JwtSecurity__Group__8 : rule__JwtSecurity__Group__8__Impl rule__JwtSecurity__Group__9 ;
    public final void rule__JwtSecurity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4284:1: ( rule__JwtSecurity__Group__8__Impl rule__JwtSecurity__Group__9 )
            // InternalSecurityDsl.g:4285:2: rule__JwtSecurity__Group__8__Impl rule__JwtSecurity__Group__9
            {
            pushFollow(FOLLOW_40);
            rule__JwtSecurity__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JwtSecurity__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group__8"


    // $ANTLR start "rule__JwtSecurity__Group__8__Impl"
    // InternalSecurityDsl.g:4292:1: rule__JwtSecurity__Group__8__Impl : ( ( rule__JwtSecurity__IssuerAssignment_8 ) ) ;
    public final void rule__JwtSecurity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4296:1: ( ( ( rule__JwtSecurity__IssuerAssignment_8 ) ) )
            // InternalSecurityDsl.g:4297:1: ( ( rule__JwtSecurity__IssuerAssignment_8 ) )
            {
            // InternalSecurityDsl.g:4297:1: ( ( rule__JwtSecurity__IssuerAssignment_8 ) )
            // InternalSecurityDsl.g:4298:2: ( rule__JwtSecurity__IssuerAssignment_8 )
            {
             before(grammarAccess.getJwtSecurityAccess().getIssuerAssignment_8()); 
            // InternalSecurityDsl.g:4299:2: ( rule__JwtSecurity__IssuerAssignment_8 )
            // InternalSecurityDsl.g:4299:3: rule__JwtSecurity__IssuerAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__JwtSecurity__IssuerAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getJwtSecurityAccess().getIssuerAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group__8__Impl"


    // $ANTLR start "rule__JwtSecurity__Group__9"
    // InternalSecurityDsl.g:4307:1: rule__JwtSecurity__Group__9 : rule__JwtSecurity__Group__9__Impl rule__JwtSecurity__Group__10 ;
    public final void rule__JwtSecurity__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4311:1: ( rule__JwtSecurity__Group__9__Impl rule__JwtSecurity__Group__10 )
            // InternalSecurityDsl.g:4312:2: rule__JwtSecurity__Group__9__Impl rule__JwtSecurity__Group__10
            {
            pushFollow(FOLLOW_41);
            rule__JwtSecurity__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JwtSecurity__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group__9"


    // $ANTLR start "rule__JwtSecurity__Group__9__Impl"
    // InternalSecurityDsl.g:4319:1: rule__JwtSecurity__Group__9__Impl : ( 'expiration-time:' ) ;
    public final void rule__JwtSecurity__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4323:1: ( ( 'expiration-time:' ) )
            // InternalSecurityDsl.g:4324:1: ( 'expiration-time:' )
            {
            // InternalSecurityDsl.g:4324:1: ( 'expiration-time:' )
            // InternalSecurityDsl.g:4325:2: 'expiration-time:'
            {
             before(grammarAccess.getJwtSecurityAccess().getExpirationTimeKeyword_9()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getJwtSecurityAccess().getExpirationTimeKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group__9__Impl"


    // $ANTLR start "rule__JwtSecurity__Group__10"
    // InternalSecurityDsl.g:4334:1: rule__JwtSecurity__Group__10 : rule__JwtSecurity__Group__10__Impl rule__JwtSecurity__Group__11 ;
    public final void rule__JwtSecurity__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4338:1: ( rule__JwtSecurity__Group__10__Impl rule__JwtSecurity__Group__11 )
            // InternalSecurityDsl.g:4339:2: rule__JwtSecurity__Group__10__Impl rule__JwtSecurity__Group__11
            {
            pushFollow(FOLLOW_42);
            rule__JwtSecurity__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JwtSecurity__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group__10"


    // $ANTLR start "rule__JwtSecurity__Group__10__Impl"
    // InternalSecurityDsl.g:4346:1: rule__JwtSecurity__Group__10__Impl : ( ( rule__JwtSecurity__ExpirationTimeAssignment_10 ) ) ;
    public final void rule__JwtSecurity__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4350:1: ( ( ( rule__JwtSecurity__ExpirationTimeAssignment_10 ) ) )
            // InternalSecurityDsl.g:4351:1: ( ( rule__JwtSecurity__ExpirationTimeAssignment_10 ) )
            {
            // InternalSecurityDsl.g:4351:1: ( ( rule__JwtSecurity__ExpirationTimeAssignment_10 ) )
            // InternalSecurityDsl.g:4352:2: ( rule__JwtSecurity__ExpirationTimeAssignment_10 )
            {
             before(grammarAccess.getJwtSecurityAccess().getExpirationTimeAssignment_10()); 
            // InternalSecurityDsl.g:4353:2: ( rule__JwtSecurity__ExpirationTimeAssignment_10 )
            // InternalSecurityDsl.g:4353:3: rule__JwtSecurity__ExpirationTimeAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__JwtSecurity__ExpirationTimeAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getJwtSecurityAccess().getExpirationTimeAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group__10__Impl"


    // $ANTLR start "rule__JwtSecurity__Group__11"
    // InternalSecurityDsl.g:4361:1: rule__JwtSecurity__Group__11 : rule__JwtSecurity__Group__11__Impl rule__JwtSecurity__Group__12 ;
    public final void rule__JwtSecurity__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4365:1: ( rule__JwtSecurity__Group__11__Impl rule__JwtSecurity__Group__12 )
            // InternalSecurityDsl.g:4366:2: rule__JwtSecurity__Group__11__Impl rule__JwtSecurity__Group__12
            {
            pushFollow(FOLLOW_5);
            rule__JwtSecurity__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JwtSecurity__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group__11"


    // $ANTLR start "rule__JwtSecurity__Group__11__Impl"
    // InternalSecurityDsl.g:4373:1: rule__JwtSecurity__Group__11__Impl : ( 'audience:' ) ;
    public final void rule__JwtSecurity__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4377:1: ( ( 'audience:' ) )
            // InternalSecurityDsl.g:4378:1: ( 'audience:' )
            {
            // InternalSecurityDsl.g:4378:1: ( 'audience:' )
            // InternalSecurityDsl.g:4379:2: 'audience:'
            {
             before(grammarAccess.getJwtSecurityAccess().getAudienceKeyword_11()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getJwtSecurityAccess().getAudienceKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group__11__Impl"


    // $ANTLR start "rule__JwtSecurity__Group__12"
    // InternalSecurityDsl.g:4388:1: rule__JwtSecurity__Group__12 : rule__JwtSecurity__Group__12__Impl rule__JwtSecurity__Group__13 ;
    public final void rule__JwtSecurity__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4392:1: ( rule__JwtSecurity__Group__12__Impl rule__JwtSecurity__Group__13 )
            // InternalSecurityDsl.g:4393:2: rule__JwtSecurity__Group__12__Impl rule__JwtSecurity__Group__13
            {
            pushFollow(FOLLOW_43);
            rule__JwtSecurity__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JwtSecurity__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group__12"


    // $ANTLR start "rule__JwtSecurity__Group__12__Impl"
    // InternalSecurityDsl.g:4400:1: rule__JwtSecurity__Group__12__Impl : ( ( rule__JwtSecurity__AudienceAssignment_12 ) ) ;
    public final void rule__JwtSecurity__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4404:1: ( ( ( rule__JwtSecurity__AudienceAssignment_12 ) ) )
            // InternalSecurityDsl.g:4405:1: ( ( rule__JwtSecurity__AudienceAssignment_12 ) )
            {
            // InternalSecurityDsl.g:4405:1: ( ( rule__JwtSecurity__AudienceAssignment_12 ) )
            // InternalSecurityDsl.g:4406:2: ( rule__JwtSecurity__AudienceAssignment_12 )
            {
             before(grammarAccess.getJwtSecurityAccess().getAudienceAssignment_12()); 
            // InternalSecurityDsl.g:4407:2: ( rule__JwtSecurity__AudienceAssignment_12 )
            // InternalSecurityDsl.g:4407:3: rule__JwtSecurity__AudienceAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__JwtSecurity__AudienceAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getJwtSecurityAccess().getAudienceAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group__12__Impl"


    // $ANTLR start "rule__JwtSecurity__Group__13"
    // InternalSecurityDsl.g:4415:1: rule__JwtSecurity__Group__13 : rule__JwtSecurity__Group__13__Impl rule__JwtSecurity__Group__14 ;
    public final void rule__JwtSecurity__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4419:1: ( rule__JwtSecurity__Group__13__Impl rule__JwtSecurity__Group__14 )
            // InternalSecurityDsl.g:4420:2: rule__JwtSecurity__Group__13__Impl rule__JwtSecurity__Group__14
            {
            pushFollow(FOLLOW_43);
            rule__JwtSecurity__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JwtSecurity__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group__13"


    // $ANTLR start "rule__JwtSecurity__Group__13__Impl"
    // InternalSecurityDsl.g:4427:1: rule__JwtSecurity__Group__13__Impl : ( ( rule__JwtSecurity__Group_13__0 )? ) ;
    public final void rule__JwtSecurity__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4431:1: ( ( ( rule__JwtSecurity__Group_13__0 )? ) )
            // InternalSecurityDsl.g:4432:1: ( ( rule__JwtSecurity__Group_13__0 )? )
            {
            // InternalSecurityDsl.g:4432:1: ( ( rule__JwtSecurity__Group_13__0 )? )
            // InternalSecurityDsl.g:4433:2: ( rule__JwtSecurity__Group_13__0 )?
            {
             before(grammarAccess.getJwtSecurityAccess().getGroup_13()); 
            // InternalSecurityDsl.g:4434:2: ( rule__JwtSecurity__Group_13__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==74) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSecurityDsl.g:4434:3: rule__JwtSecurity__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JwtSecurity__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJwtSecurityAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group__13__Impl"


    // $ANTLR start "rule__JwtSecurity__Group__14"
    // InternalSecurityDsl.g:4442:1: rule__JwtSecurity__Group__14 : rule__JwtSecurity__Group__14__Impl rule__JwtSecurity__Group__15 ;
    public final void rule__JwtSecurity__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4446:1: ( rule__JwtSecurity__Group__14__Impl rule__JwtSecurity__Group__15 )
            // InternalSecurityDsl.g:4447:2: rule__JwtSecurity__Group__14__Impl rule__JwtSecurity__Group__15
            {
            pushFollow(FOLLOW_43);
            rule__JwtSecurity__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JwtSecurity__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group__14"


    // $ANTLR start "rule__JwtSecurity__Group__14__Impl"
    // InternalSecurityDsl.g:4454:1: rule__JwtSecurity__Group__14__Impl : ( ( rule__JwtSecurity__Group_14__0 )? ) ;
    public final void rule__JwtSecurity__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4458:1: ( ( ( rule__JwtSecurity__Group_14__0 )? ) )
            // InternalSecurityDsl.g:4459:1: ( ( rule__JwtSecurity__Group_14__0 )? )
            {
            // InternalSecurityDsl.g:4459:1: ( ( rule__JwtSecurity__Group_14__0 )? )
            // InternalSecurityDsl.g:4460:2: ( rule__JwtSecurity__Group_14__0 )?
            {
             before(grammarAccess.getJwtSecurityAccess().getGroup_14()); 
            // InternalSecurityDsl.g:4461:2: ( rule__JwtSecurity__Group_14__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==77) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSecurityDsl.g:4461:3: rule__JwtSecurity__Group_14__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JwtSecurity__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJwtSecurityAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group__14__Impl"


    // $ANTLR start "rule__JwtSecurity__Group__15"
    // InternalSecurityDsl.g:4469:1: rule__JwtSecurity__Group__15 : rule__JwtSecurity__Group__15__Impl rule__JwtSecurity__Group__16 ;
    public final void rule__JwtSecurity__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4473:1: ( rule__JwtSecurity__Group__15__Impl rule__JwtSecurity__Group__16 )
            // InternalSecurityDsl.g:4474:2: rule__JwtSecurity__Group__15__Impl rule__JwtSecurity__Group__16
            {
            pushFollow(FOLLOW_44);
            rule__JwtSecurity__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JwtSecurity__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group__15"


    // $ANTLR start "rule__JwtSecurity__Group__15__Impl"
    // InternalSecurityDsl.g:4481:1: rule__JwtSecurity__Group__15__Impl : ( 'signature:' ) ;
    public final void rule__JwtSecurity__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4485:1: ( ( 'signature:' ) )
            // InternalSecurityDsl.g:4486:1: ( 'signature:' )
            {
            // InternalSecurityDsl.g:4486:1: ( 'signature:' )
            // InternalSecurityDsl.g:4487:2: 'signature:'
            {
             before(grammarAccess.getJwtSecurityAccess().getSignatureKeyword_15()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getJwtSecurityAccess().getSignatureKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group__15__Impl"


    // $ANTLR start "rule__JwtSecurity__Group__16"
    // InternalSecurityDsl.g:4496:1: rule__JwtSecurity__Group__16 : rule__JwtSecurity__Group__16__Impl rule__JwtSecurity__Group__17 ;
    public final void rule__JwtSecurity__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4500:1: ( rule__JwtSecurity__Group__16__Impl rule__JwtSecurity__Group__17 )
            // InternalSecurityDsl.g:4501:2: rule__JwtSecurity__Group__16__Impl rule__JwtSecurity__Group__17
            {
            pushFollow(FOLLOW_5);
            rule__JwtSecurity__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JwtSecurity__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group__16"


    // $ANTLR start "rule__JwtSecurity__Group__16__Impl"
    // InternalSecurityDsl.g:4508:1: rule__JwtSecurity__Group__16__Impl : ( 'secret:' ) ;
    public final void rule__JwtSecurity__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4512:1: ( ( 'secret:' ) )
            // InternalSecurityDsl.g:4513:1: ( 'secret:' )
            {
            // InternalSecurityDsl.g:4513:1: ( 'secret:' )
            // InternalSecurityDsl.g:4514:2: 'secret:'
            {
             before(grammarAccess.getJwtSecurityAccess().getSecretKeyword_16()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getJwtSecurityAccess().getSecretKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group__16__Impl"


    // $ANTLR start "rule__JwtSecurity__Group__17"
    // InternalSecurityDsl.g:4523:1: rule__JwtSecurity__Group__17 : rule__JwtSecurity__Group__17__Impl ;
    public final void rule__JwtSecurity__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4527:1: ( rule__JwtSecurity__Group__17__Impl )
            // InternalSecurityDsl.g:4528:2: rule__JwtSecurity__Group__17__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JwtSecurity__Group__17__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group__17"


    // $ANTLR start "rule__JwtSecurity__Group__17__Impl"
    // InternalSecurityDsl.g:4534:1: rule__JwtSecurity__Group__17__Impl : ( ( rule__JwtSecurity__SecretAssignment_17 ) ) ;
    public final void rule__JwtSecurity__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4538:1: ( ( ( rule__JwtSecurity__SecretAssignment_17 ) ) )
            // InternalSecurityDsl.g:4539:1: ( ( rule__JwtSecurity__SecretAssignment_17 ) )
            {
            // InternalSecurityDsl.g:4539:1: ( ( rule__JwtSecurity__SecretAssignment_17 ) )
            // InternalSecurityDsl.g:4540:2: ( rule__JwtSecurity__SecretAssignment_17 )
            {
             before(grammarAccess.getJwtSecurityAccess().getSecretAssignment_17()); 
            // InternalSecurityDsl.g:4541:2: ( rule__JwtSecurity__SecretAssignment_17 )
            // InternalSecurityDsl.g:4541:3: rule__JwtSecurity__SecretAssignment_17
            {
            pushFollow(FOLLOW_2);
            rule__JwtSecurity__SecretAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getJwtSecurityAccess().getSecretAssignment_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group__17__Impl"


    // $ANTLR start "rule__JwtSecurity__Group_13__0"
    // InternalSecurityDsl.g:4550:1: rule__JwtSecurity__Group_13__0 : rule__JwtSecurity__Group_13__0__Impl rule__JwtSecurity__Group_13__1 ;
    public final void rule__JwtSecurity__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4554:1: ( rule__JwtSecurity__Group_13__0__Impl rule__JwtSecurity__Group_13__1 )
            // InternalSecurityDsl.g:4555:2: rule__JwtSecurity__Group_13__0__Impl rule__JwtSecurity__Group_13__1
            {
            pushFollow(FOLLOW_45);
            rule__JwtSecurity__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JwtSecurity__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group_13__0"


    // $ANTLR start "rule__JwtSecurity__Group_13__0__Impl"
    // InternalSecurityDsl.g:4562:1: rule__JwtSecurity__Group_13__0__Impl : ( 'public_claims:' ) ;
    public final void rule__JwtSecurity__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4566:1: ( ( 'public_claims:' ) )
            // InternalSecurityDsl.g:4567:1: ( 'public_claims:' )
            {
            // InternalSecurityDsl.g:4567:1: ( 'public_claims:' )
            // InternalSecurityDsl.g:4568:2: 'public_claims:'
            {
             before(grammarAccess.getJwtSecurityAccess().getPublic_claimsKeyword_13_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getJwtSecurityAccess().getPublic_claimsKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group_13__0__Impl"


    // $ANTLR start "rule__JwtSecurity__Group_13__1"
    // InternalSecurityDsl.g:4577:1: rule__JwtSecurity__Group_13__1 : rule__JwtSecurity__Group_13__1__Impl rule__JwtSecurity__Group_13__2 ;
    public final void rule__JwtSecurity__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4581:1: ( rule__JwtSecurity__Group_13__1__Impl rule__JwtSecurity__Group_13__2 )
            // InternalSecurityDsl.g:4582:2: rule__JwtSecurity__Group_13__1__Impl rule__JwtSecurity__Group_13__2
            {
            pushFollow(FOLLOW_46);
            rule__JwtSecurity__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JwtSecurity__Group_13__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group_13__1"


    // $ANTLR start "rule__JwtSecurity__Group_13__1__Impl"
    // InternalSecurityDsl.g:4589:1: rule__JwtSecurity__Group_13__1__Impl : ( '[' ) ;
    public final void rule__JwtSecurity__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4593:1: ( ( '[' ) )
            // InternalSecurityDsl.g:4594:1: ( '[' )
            {
            // InternalSecurityDsl.g:4594:1: ( '[' )
            // InternalSecurityDsl.g:4595:2: '['
            {
             before(grammarAccess.getJwtSecurityAccess().getLeftSquareBracketKeyword_13_1()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getJwtSecurityAccess().getLeftSquareBracketKeyword_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group_13__1__Impl"


    // $ANTLR start "rule__JwtSecurity__Group_13__2"
    // InternalSecurityDsl.g:4604:1: rule__JwtSecurity__Group_13__2 : rule__JwtSecurity__Group_13__2__Impl rule__JwtSecurity__Group_13__3 ;
    public final void rule__JwtSecurity__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4608:1: ( rule__JwtSecurity__Group_13__2__Impl rule__JwtSecurity__Group_13__3 )
            // InternalSecurityDsl.g:4609:2: rule__JwtSecurity__Group_13__2__Impl rule__JwtSecurity__Group_13__3
            {
            pushFollow(FOLLOW_47);
            rule__JwtSecurity__Group_13__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JwtSecurity__Group_13__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group_13__2"


    // $ANTLR start "rule__JwtSecurity__Group_13__2__Impl"
    // InternalSecurityDsl.g:4616:1: rule__JwtSecurity__Group_13__2__Impl : ( ( rule__JwtSecurity__Security_claimsAssignment_13_2 ) ) ;
    public final void rule__JwtSecurity__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4620:1: ( ( ( rule__JwtSecurity__Security_claimsAssignment_13_2 ) ) )
            // InternalSecurityDsl.g:4621:1: ( ( rule__JwtSecurity__Security_claimsAssignment_13_2 ) )
            {
            // InternalSecurityDsl.g:4621:1: ( ( rule__JwtSecurity__Security_claimsAssignment_13_2 ) )
            // InternalSecurityDsl.g:4622:2: ( rule__JwtSecurity__Security_claimsAssignment_13_2 )
            {
             before(grammarAccess.getJwtSecurityAccess().getSecurity_claimsAssignment_13_2()); 
            // InternalSecurityDsl.g:4623:2: ( rule__JwtSecurity__Security_claimsAssignment_13_2 )
            // InternalSecurityDsl.g:4623:3: rule__JwtSecurity__Security_claimsAssignment_13_2
            {
            pushFollow(FOLLOW_2);
            rule__JwtSecurity__Security_claimsAssignment_13_2();

            state._fsp--;


            }

             after(grammarAccess.getJwtSecurityAccess().getSecurity_claimsAssignment_13_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group_13__2__Impl"


    // $ANTLR start "rule__JwtSecurity__Group_13__3"
    // InternalSecurityDsl.g:4631:1: rule__JwtSecurity__Group_13__3 : rule__JwtSecurity__Group_13__3__Impl rule__JwtSecurity__Group_13__4 ;
    public final void rule__JwtSecurity__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4635:1: ( rule__JwtSecurity__Group_13__3__Impl rule__JwtSecurity__Group_13__4 )
            // InternalSecurityDsl.g:4636:2: rule__JwtSecurity__Group_13__3__Impl rule__JwtSecurity__Group_13__4
            {
            pushFollow(FOLLOW_47);
            rule__JwtSecurity__Group_13__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JwtSecurity__Group_13__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group_13__3"


    // $ANTLR start "rule__JwtSecurity__Group_13__3__Impl"
    // InternalSecurityDsl.g:4643:1: rule__JwtSecurity__Group_13__3__Impl : ( ( rule__JwtSecurity__Group_13_3__0 )* ) ;
    public final void rule__JwtSecurity__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4647:1: ( ( ( rule__JwtSecurity__Group_13_3__0 )* ) )
            // InternalSecurityDsl.g:4648:1: ( ( rule__JwtSecurity__Group_13_3__0 )* )
            {
            // InternalSecurityDsl.g:4648:1: ( ( rule__JwtSecurity__Group_13_3__0 )* )
            // InternalSecurityDsl.g:4649:2: ( rule__JwtSecurity__Group_13_3__0 )*
            {
             before(grammarAccess.getJwtSecurityAccess().getGroup_13_3()); 
            // InternalSecurityDsl.g:4650:2: ( rule__JwtSecurity__Group_13_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==47) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSecurityDsl.g:4650:3: rule__JwtSecurity__Group_13_3__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__JwtSecurity__Group_13_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getJwtSecurityAccess().getGroup_13_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group_13__3__Impl"


    // $ANTLR start "rule__JwtSecurity__Group_13__4"
    // InternalSecurityDsl.g:4658:1: rule__JwtSecurity__Group_13__4 : rule__JwtSecurity__Group_13__4__Impl ;
    public final void rule__JwtSecurity__Group_13__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4662:1: ( rule__JwtSecurity__Group_13__4__Impl )
            // InternalSecurityDsl.g:4663:2: rule__JwtSecurity__Group_13__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JwtSecurity__Group_13__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group_13__4"


    // $ANTLR start "rule__JwtSecurity__Group_13__4__Impl"
    // InternalSecurityDsl.g:4669:1: rule__JwtSecurity__Group_13__4__Impl : ( ']' ) ;
    public final void rule__JwtSecurity__Group_13__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4673:1: ( ( ']' ) )
            // InternalSecurityDsl.g:4674:1: ( ']' )
            {
            // InternalSecurityDsl.g:4674:1: ( ']' )
            // InternalSecurityDsl.g:4675:2: ']'
            {
             before(grammarAccess.getJwtSecurityAccess().getRightSquareBracketKeyword_13_4()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getJwtSecurityAccess().getRightSquareBracketKeyword_13_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group_13__4__Impl"


    // $ANTLR start "rule__JwtSecurity__Group_13_3__0"
    // InternalSecurityDsl.g:4685:1: rule__JwtSecurity__Group_13_3__0 : rule__JwtSecurity__Group_13_3__0__Impl rule__JwtSecurity__Group_13_3__1 ;
    public final void rule__JwtSecurity__Group_13_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4689:1: ( rule__JwtSecurity__Group_13_3__0__Impl rule__JwtSecurity__Group_13_3__1 )
            // InternalSecurityDsl.g:4690:2: rule__JwtSecurity__Group_13_3__0__Impl rule__JwtSecurity__Group_13_3__1
            {
            pushFollow(FOLLOW_46);
            rule__JwtSecurity__Group_13_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JwtSecurity__Group_13_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group_13_3__0"


    // $ANTLR start "rule__JwtSecurity__Group_13_3__0__Impl"
    // InternalSecurityDsl.g:4697:1: rule__JwtSecurity__Group_13_3__0__Impl : ( ',' ) ;
    public final void rule__JwtSecurity__Group_13_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4701:1: ( ( ',' ) )
            // InternalSecurityDsl.g:4702:1: ( ',' )
            {
            // InternalSecurityDsl.g:4702:1: ( ',' )
            // InternalSecurityDsl.g:4703:2: ','
            {
             before(grammarAccess.getJwtSecurityAccess().getCommaKeyword_13_3_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getJwtSecurityAccess().getCommaKeyword_13_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group_13_3__0__Impl"


    // $ANTLR start "rule__JwtSecurity__Group_13_3__1"
    // InternalSecurityDsl.g:4712:1: rule__JwtSecurity__Group_13_3__1 : rule__JwtSecurity__Group_13_3__1__Impl ;
    public final void rule__JwtSecurity__Group_13_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4716:1: ( rule__JwtSecurity__Group_13_3__1__Impl )
            // InternalSecurityDsl.g:4717:2: rule__JwtSecurity__Group_13_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JwtSecurity__Group_13_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group_13_3__1"


    // $ANTLR start "rule__JwtSecurity__Group_13_3__1__Impl"
    // InternalSecurityDsl.g:4723:1: rule__JwtSecurity__Group_13_3__1__Impl : ( ( rule__JwtSecurity__Security_claimsAssignment_13_3_1 ) ) ;
    public final void rule__JwtSecurity__Group_13_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4727:1: ( ( ( rule__JwtSecurity__Security_claimsAssignment_13_3_1 ) ) )
            // InternalSecurityDsl.g:4728:1: ( ( rule__JwtSecurity__Security_claimsAssignment_13_3_1 ) )
            {
            // InternalSecurityDsl.g:4728:1: ( ( rule__JwtSecurity__Security_claimsAssignment_13_3_1 ) )
            // InternalSecurityDsl.g:4729:2: ( rule__JwtSecurity__Security_claimsAssignment_13_3_1 )
            {
             before(grammarAccess.getJwtSecurityAccess().getSecurity_claimsAssignment_13_3_1()); 
            // InternalSecurityDsl.g:4730:2: ( rule__JwtSecurity__Security_claimsAssignment_13_3_1 )
            // InternalSecurityDsl.g:4730:3: rule__JwtSecurity__Security_claimsAssignment_13_3_1
            {
            pushFollow(FOLLOW_2);
            rule__JwtSecurity__Security_claimsAssignment_13_3_1();

            state._fsp--;


            }

             after(grammarAccess.getJwtSecurityAccess().getSecurity_claimsAssignment_13_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group_13_3__1__Impl"


    // $ANTLR start "rule__JwtSecurity__Group_14__0"
    // InternalSecurityDsl.g:4739:1: rule__JwtSecurity__Group_14__0 : rule__JwtSecurity__Group_14__0__Impl rule__JwtSecurity__Group_14__1 ;
    public final void rule__JwtSecurity__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4743:1: ( rule__JwtSecurity__Group_14__0__Impl rule__JwtSecurity__Group_14__1 )
            // InternalSecurityDsl.g:4744:2: rule__JwtSecurity__Group_14__0__Impl rule__JwtSecurity__Group_14__1
            {
            pushFollow(FOLLOW_45);
            rule__JwtSecurity__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JwtSecurity__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group_14__0"


    // $ANTLR start "rule__JwtSecurity__Group_14__0__Impl"
    // InternalSecurityDsl.g:4751:1: rule__JwtSecurity__Group_14__0__Impl : ( 'private_claims:' ) ;
    public final void rule__JwtSecurity__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4755:1: ( ( 'private_claims:' ) )
            // InternalSecurityDsl.g:4756:1: ( 'private_claims:' )
            {
            // InternalSecurityDsl.g:4756:1: ( 'private_claims:' )
            // InternalSecurityDsl.g:4757:2: 'private_claims:'
            {
             before(grammarAccess.getJwtSecurityAccess().getPrivate_claimsKeyword_14_0()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getJwtSecurityAccess().getPrivate_claimsKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group_14__0__Impl"


    // $ANTLR start "rule__JwtSecurity__Group_14__1"
    // InternalSecurityDsl.g:4766:1: rule__JwtSecurity__Group_14__1 : rule__JwtSecurity__Group_14__1__Impl rule__JwtSecurity__Group_14__2 ;
    public final void rule__JwtSecurity__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4770:1: ( rule__JwtSecurity__Group_14__1__Impl rule__JwtSecurity__Group_14__2 )
            // InternalSecurityDsl.g:4771:2: rule__JwtSecurity__Group_14__1__Impl rule__JwtSecurity__Group_14__2
            {
            pushFollow(FOLLOW_46);
            rule__JwtSecurity__Group_14__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JwtSecurity__Group_14__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group_14__1"


    // $ANTLR start "rule__JwtSecurity__Group_14__1__Impl"
    // InternalSecurityDsl.g:4778:1: rule__JwtSecurity__Group_14__1__Impl : ( '[' ) ;
    public final void rule__JwtSecurity__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4782:1: ( ( '[' ) )
            // InternalSecurityDsl.g:4783:1: ( '[' )
            {
            // InternalSecurityDsl.g:4783:1: ( '[' )
            // InternalSecurityDsl.g:4784:2: '['
            {
             before(grammarAccess.getJwtSecurityAccess().getLeftSquareBracketKeyword_14_1()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getJwtSecurityAccess().getLeftSquareBracketKeyword_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group_14__1__Impl"


    // $ANTLR start "rule__JwtSecurity__Group_14__2"
    // InternalSecurityDsl.g:4793:1: rule__JwtSecurity__Group_14__2 : rule__JwtSecurity__Group_14__2__Impl rule__JwtSecurity__Group_14__3 ;
    public final void rule__JwtSecurity__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4797:1: ( rule__JwtSecurity__Group_14__2__Impl rule__JwtSecurity__Group_14__3 )
            // InternalSecurityDsl.g:4798:2: rule__JwtSecurity__Group_14__2__Impl rule__JwtSecurity__Group_14__3
            {
            pushFollow(FOLLOW_47);
            rule__JwtSecurity__Group_14__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JwtSecurity__Group_14__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group_14__2"


    // $ANTLR start "rule__JwtSecurity__Group_14__2__Impl"
    // InternalSecurityDsl.g:4805:1: rule__JwtSecurity__Group_14__2__Impl : ( ( rule__JwtSecurity__Security_claimsAssignment_14_2 ) ) ;
    public final void rule__JwtSecurity__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4809:1: ( ( ( rule__JwtSecurity__Security_claimsAssignment_14_2 ) ) )
            // InternalSecurityDsl.g:4810:1: ( ( rule__JwtSecurity__Security_claimsAssignment_14_2 ) )
            {
            // InternalSecurityDsl.g:4810:1: ( ( rule__JwtSecurity__Security_claimsAssignment_14_2 ) )
            // InternalSecurityDsl.g:4811:2: ( rule__JwtSecurity__Security_claimsAssignment_14_2 )
            {
             before(grammarAccess.getJwtSecurityAccess().getSecurity_claimsAssignment_14_2()); 
            // InternalSecurityDsl.g:4812:2: ( rule__JwtSecurity__Security_claimsAssignment_14_2 )
            // InternalSecurityDsl.g:4812:3: rule__JwtSecurity__Security_claimsAssignment_14_2
            {
            pushFollow(FOLLOW_2);
            rule__JwtSecurity__Security_claimsAssignment_14_2();

            state._fsp--;


            }

             after(grammarAccess.getJwtSecurityAccess().getSecurity_claimsAssignment_14_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group_14__2__Impl"


    // $ANTLR start "rule__JwtSecurity__Group_14__3"
    // InternalSecurityDsl.g:4820:1: rule__JwtSecurity__Group_14__3 : rule__JwtSecurity__Group_14__3__Impl rule__JwtSecurity__Group_14__4 ;
    public final void rule__JwtSecurity__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4824:1: ( rule__JwtSecurity__Group_14__3__Impl rule__JwtSecurity__Group_14__4 )
            // InternalSecurityDsl.g:4825:2: rule__JwtSecurity__Group_14__3__Impl rule__JwtSecurity__Group_14__4
            {
            pushFollow(FOLLOW_47);
            rule__JwtSecurity__Group_14__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JwtSecurity__Group_14__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group_14__3"


    // $ANTLR start "rule__JwtSecurity__Group_14__3__Impl"
    // InternalSecurityDsl.g:4832:1: rule__JwtSecurity__Group_14__3__Impl : ( ( rule__JwtSecurity__Group_14_3__0 )* ) ;
    public final void rule__JwtSecurity__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4836:1: ( ( ( rule__JwtSecurity__Group_14_3__0 )* ) )
            // InternalSecurityDsl.g:4837:1: ( ( rule__JwtSecurity__Group_14_3__0 )* )
            {
            // InternalSecurityDsl.g:4837:1: ( ( rule__JwtSecurity__Group_14_3__0 )* )
            // InternalSecurityDsl.g:4838:2: ( rule__JwtSecurity__Group_14_3__0 )*
            {
             before(grammarAccess.getJwtSecurityAccess().getGroup_14_3()); 
            // InternalSecurityDsl.g:4839:2: ( rule__JwtSecurity__Group_14_3__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==47) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalSecurityDsl.g:4839:3: rule__JwtSecurity__Group_14_3__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__JwtSecurity__Group_14_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getJwtSecurityAccess().getGroup_14_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group_14__3__Impl"


    // $ANTLR start "rule__JwtSecurity__Group_14__4"
    // InternalSecurityDsl.g:4847:1: rule__JwtSecurity__Group_14__4 : rule__JwtSecurity__Group_14__4__Impl ;
    public final void rule__JwtSecurity__Group_14__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4851:1: ( rule__JwtSecurity__Group_14__4__Impl )
            // InternalSecurityDsl.g:4852:2: rule__JwtSecurity__Group_14__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JwtSecurity__Group_14__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group_14__4"


    // $ANTLR start "rule__JwtSecurity__Group_14__4__Impl"
    // InternalSecurityDsl.g:4858:1: rule__JwtSecurity__Group_14__4__Impl : ( ']' ) ;
    public final void rule__JwtSecurity__Group_14__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4862:1: ( ( ']' ) )
            // InternalSecurityDsl.g:4863:1: ( ']' )
            {
            // InternalSecurityDsl.g:4863:1: ( ']' )
            // InternalSecurityDsl.g:4864:2: ']'
            {
             before(grammarAccess.getJwtSecurityAccess().getRightSquareBracketKeyword_14_4()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getJwtSecurityAccess().getRightSquareBracketKeyword_14_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group_14__4__Impl"


    // $ANTLR start "rule__JwtSecurity__Group_14_3__0"
    // InternalSecurityDsl.g:4874:1: rule__JwtSecurity__Group_14_3__0 : rule__JwtSecurity__Group_14_3__0__Impl rule__JwtSecurity__Group_14_3__1 ;
    public final void rule__JwtSecurity__Group_14_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4878:1: ( rule__JwtSecurity__Group_14_3__0__Impl rule__JwtSecurity__Group_14_3__1 )
            // InternalSecurityDsl.g:4879:2: rule__JwtSecurity__Group_14_3__0__Impl rule__JwtSecurity__Group_14_3__1
            {
            pushFollow(FOLLOW_46);
            rule__JwtSecurity__Group_14_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JwtSecurity__Group_14_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group_14_3__0"


    // $ANTLR start "rule__JwtSecurity__Group_14_3__0__Impl"
    // InternalSecurityDsl.g:4886:1: rule__JwtSecurity__Group_14_3__0__Impl : ( ',' ) ;
    public final void rule__JwtSecurity__Group_14_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4890:1: ( ( ',' ) )
            // InternalSecurityDsl.g:4891:1: ( ',' )
            {
            // InternalSecurityDsl.g:4891:1: ( ',' )
            // InternalSecurityDsl.g:4892:2: ','
            {
             before(grammarAccess.getJwtSecurityAccess().getCommaKeyword_14_3_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getJwtSecurityAccess().getCommaKeyword_14_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group_14_3__0__Impl"


    // $ANTLR start "rule__JwtSecurity__Group_14_3__1"
    // InternalSecurityDsl.g:4901:1: rule__JwtSecurity__Group_14_3__1 : rule__JwtSecurity__Group_14_3__1__Impl ;
    public final void rule__JwtSecurity__Group_14_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4905:1: ( rule__JwtSecurity__Group_14_3__1__Impl )
            // InternalSecurityDsl.g:4906:2: rule__JwtSecurity__Group_14_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JwtSecurity__Group_14_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group_14_3__1"


    // $ANTLR start "rule__JwtSecurity__Group_14_3__1__Impl"
    // InternalSecurityDsl.g:4912:1: rule__JwtSecurity__Group_14_3__1__Impl : ( ( rule__JwtSecurity__Security_claimsAssignment_14_3_1 ) ) ;
    public final void rule__JwtSecurity__Group_14_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4916:1: ( ( ( rule__JwtSecurity__Security_claimsAssignment_14_3_1 ) ) )
            // InternalSecurityDsl.g:4917:1: ( ( rule__JwtSecurity__Security_claimsAssignment_14_3_1 ) )
            {
            // InternalSecurityDsl.g:4917:1: ( ( rule__JwtSecurity__Security_claimsAssignment_14_3_1 ) )
            // InternalSecurityDsl.g:4918:2: ( rule__JwtSecurity__Security_claimsAssignment_14_3_1 )
            {
             before(grammarAccess.getJwtSecurityAccess().getSecurity_claimsAssignment_14_3_1()); 
            // InternalSecurityDsl.g:4919:2: ( rule__JwtSecurity__Security_claimsAssignment_14_3_1 )
            // InternalSecurityDsl.g:4919:3: rule__JwtSecurity__Security_claimsAssignment_14_3_1
            {
            pushFollow(FOLLOW_2);
            rule__JwtSecurity__Security_claimsAssignment_14_3_1();

            state._fsp--;


            }

             after(grammarAccess.getJwtSecurityAccess().getSecurity_claimsAssignment_14_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Group_14_3__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalSecurityDsl.g:4928:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4932:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalSecurityDsl.g:4933:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalSecurityDsl.g:4940:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4944:1: ( ( ( '-' )? ) )
            // InternalSecurityDsl.g:4945:1: ( ( '-' )? )
            {
            // InternalSecurityDsl.g:4945:1: ( ( '-' )? )
            // InternalSecurityDsl.g:4946:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalSecurityDsl.g:4947:2: ( '-' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==78) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSecurityDsl.g:4947:3: '-'
                    {
                    match(input,78,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalSecurityDsl.g:4955:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4959:1: ( rule__EInt__Group__1__Impl )
            // InternalSecurityDsl.g:4960:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalSecurityDsl.g:4966:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4970:1: ( ( RULE_INT ) )
            // InternalSecurityDsl.g:4971:1: ( RULE_INT )
            {
            // InternalSecurityDsl.g:4971:1: ( RULE_INT )
            // InternalSecurityDsl.g:4972:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__PublicClaims__Group__0"
    // InternalSecurityDsl.g:4982:1: rule__PublicClaims__Group__0 : rule__PublicClaims__Group__0__Impl rule__PublicClaims__Group__1 ;
    public final void rule__PublicClaims__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4986:1: ( rule__PublicClaims__Group__0__Impl rule__PublicClaims__Group__1 )
            // InternalSecurityDsl.g:4987:2: rule__PublicClaims__Group__0__Impl rule__PublicClaims__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PublicClaims__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PublicClaims__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicClaims__Group__0"


    // $ANTLR start "rule__PublicClaims__Group__0__Impl"
    // InternalSecurityDsl.g:4994:1: rule__PublicClaims__Group__0__Impl : ( ( rule__PublicClaims__IsPublicAssignment_0 ) ) ;
    public final void rule__PublicClaims__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4998:1: ( ( ( rule__PublicClaims__IsPublicAssignment_0 ) ) )
            // InternalSecurityDsl.g:4999:1: ( ( rule__PublicClaims__IsPublicAssignment_0 ) )
            {
            // InternalSecurityDsl.g:4999:1: ( ( rule__PublicClaims__IsPublicAssignment_0 ) )
            // InternalSecurityDsl.g:5000:2: ( rule__PublicClaims__IsPublicAssignment_0 )
            {
             before(grammarAccess.getPublicClaimsAccess().getIsPublicAssignment_0()); 
            // InternalSecurityDsl.g:5001:2: ( rule__PublicClaims__IsPublicAssignment_0 )
            // InternalSecurityDsl.g:5001:3: rule__PublicClaims__IsPublicAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PublicClaims__IsPublicAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPublicClaimsAccess().getIsPublicAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicClaims__Group__0__Impl"


    // $ANTLR start "rule__PublicClaims__Group__1"
    // InternalSecurityDsl.g:5009:1: rule__PublicClaims__Group__1 : rule__PublicClaims__Group__1__Impl ;
    public final void rule__PublicClaims__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5013:1: ( rule__PublicClaims__Group__1__Impl )
            // InternalSecurityDsl.g:5014:2: rule__PublicClaims__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PublicClaims__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicClaims__Group__1"


    // $ANTLR start "rule__PublicClaims__Group__1__Impl"
    // InternalSecurityDsl.g:5020:1: rule__PublicClaims__Group__1__Impl : ( ( rule__PublicClaims__NameAssignment_1 ) ) ;
    public final void rule__PublicClaims__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5024:1: ( ( ( rule__PublicClaims__NameAssignment_1 ) ) )
            // InternalSecurityDsl.g:5025:1: ( ( rule__PublicClaims__NameAssignment_1 ) )
            {
            // InternalSecurityDsl.g:5025:1: ( ( rule__PublicClaims__NameAssignment_1 ) )
            // InternalSecurityDsl.g:5026:2: ( rule__PublicClaims__NameAssignment_1 )
            {
             before(grammarAccess.getPublicClaimsAccess().getNameAssignment_1()); 
            // InternalSecurityDsl.g:5027:2: ( rule__PublicClaims__NameAssignment_1 )
            // InternalSecurityDsl.g:5027:3: rule__PublicClaims__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PublicClaims__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPublicClaimsAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicClaims__Group__1__Impl"


    // $ANTLR start "rule__PrivateClaims__Group__0"
    // InternalSecurityDsl.g:5036:1: rule__PrivateClaims__Group__0 : rule__PrivateClaims__Group__0__Impl rule__PrivateClaims__Group__1 ;
    public final void rule__PrivateClaims__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5040:1: ( rule__PrivateClaims__Group__0__Impl rule__PrivateClaims__Group__1 )
            // InternalSecurityDsl.g:5041:2: rule__PrivateClaims__Group__0__Impl rule__PrivateClaims__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PrivateClaims__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateClaims__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateClaims__Group__0"


    // $ANTLR start "rule__PrivateClaims__Group__0__Impl"
    // InternalSecurityDsl.g:5048:1: rule__PrivateClaims__Group__0__Impl : ( ( rule__PrivateClaims__IsPublicAssignment_0 ) ) ;
    public final void rule__PrivateClaims__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5052:1: ( ( ( rule__PrivateClaims__IsPublicAssignment_0 ) ) )
            // InternalSecurityDsl.g:5053:1: ( ( rule__PrivateClaims__IsPublicAssignment_0 ) )
            {
            // InternalSecurityDsl.g:5053:1: ( ( rule__PrivateClaims__IsPublicAssignment_0 ) )
            // InternalSecurityDsl.g:5054:2: ( rule__PrivateClaims__IsPublicAssignment_0 )
            {
             before(grammarAccess.getPrivateClaimsAccess().getIsPublicAssignment_0()); 
            // InternalSecurityDsl.g:5055:2: ( rule__PrivateClaims__IsPublicAssignment_0 )
            // InternalSecurityDsl.g:5055:3: rule__PrivateClaims__IsPublicAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PrivateClaims__IsPublicAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPrivateClaimsAccess().getIsPublicAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateClaims__Group__0__Impl"


    // $ANTLR start "rule__PrivateClaims__Group__1"
    // InternalSecurityDsl.g:5063:1: rule__PrivateClaims__Group__1 : rule__PrivateClaims__Group__1__Impl ;
    public final void rule__PrivateClaims__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5067:1: ( rule__PrivateClaims__Group__1__Impl )
            // InternalSecurityDsl.g:5068:2: rule__PrivateClaims__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrivateClaims__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateClaims__Group__1"


    // $ANTLR start "rule__PrivateClaims__Group__1__Impl"
    // InternalSecurityDsl.g:5074:1: rule__PrivateClaims__Group__1__Impl : ( ( rule__PrivateClaims__NameAssignment_1 ) ) ;
    public final void rule__PrivateClaims__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5078:1: ( ( ( rule__PrivateClaims__NameAssignment_1 ) ) )
            // InternalSecurityDsl.g:5079:1: ( ( rule__PrivateClaims__NameAssignment_1 ) )
            {
            // InternalSecurityDsl.g:5079:1: ( ( rule__PrivateClaims__NameAssignment_1 ) )
            // InternalSecurityDsl.g:5080:2: ( rule__PrivateClaims__NameAssignment_1 )
            {
             before(grammarAccess.getPrivateClaimsAccess().getNameAssignment_1()); 
            // InternalSecurityDsl.g:5081:2: ( rule__PrivateClaims__NameAssignment_1 )
            // InternalSecurityDsl.g:5081:3: rule__PrivateClaims__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PrivateClaims__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrivateClaimsAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateClaims__Group__1__Impl"


    // $ANTLR start "rule__Application__NameAssignment_3"
    // InternalSecurityDsl.g:5090:1: rule__Application__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Application__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5094:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5095:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5095:2: ( ruleEString )
            // InternalSecurityDsl.g:5096:3: ruleEString
            {
             before(grammarAccess.getApplicationAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__NameAssignment_3"


    // $ANTLR start "rule__Application__DescriptionAssignment_4_1"
    // InternalSecurityDsl.g:5105:1: rule__Application__DescriptionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Application__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5109:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5110:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5110:2: ( ruleEString )
            // InternalSecurityDsl.g:5111:3: ruleEString
            {
             before(grammarAccess.getApplicationAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getDescriptionEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__DescriptionAssignment_4_1"


    // $ANTLR start "rule__Application__App_databaseAssignment_5_1"
    // InternalSecurityDsl.g:5120:1: rule__Application__App_databaseAssignment_5_1 : ( ruleDatabase ) ;
    public final void rule__Application__App_databaseAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5124:1: ( ( ruleDatabase ) )
            // InternalSecurityDsl.g:5125:2: ( ruleDatabase )
            {
            // InternalSecurityDsl.g:5125:2: ( ruleDatabase )
            // InternalSecurityDsl.g:5126:3: ruleDatabase
            {
             before(grammarAccess.getApplicationAccess().getApp_databaseDatabaseParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDatabase();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getApp_databaseDatabaseParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__App_databaseAssignment_5_1"


    // $ANTLR start "rule__Application__App_securityAssignment_6_1"
    // InternalSecurityDsl.g:5135:1: rule__Application__App_securityAssignment_6_1 : ( ruleSecurity ) ;
    public final void rule__Application__App_securityAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5139:1: ( ( ruleSecurity ) )
            // InternalSecurityDsl.g:5140:2: ( ruleSecurity )
            {
            // InternalSecurityDsl.g:5140:2: ( ruleSecurity )
            // InternalSecurityDsl.g:5141:3: ruleSecurity
            {
             before(grammarAccess.getApplicationAccess().getApp_securitySecurityParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSecurity();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getApp_securitySecurityParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__App_securityAssignment_6_1"


    // $ANTLR start "rule__Database__VendorNameAssignment_1"
    // InternalSecurityDsl.g:5150:1: rule__Database__VendorNameAssignment_1 : ( ruleEDatabaseType ) ;
    public final void rule__Database__VendorNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5154:1: ( ( ruleEDatabaseType ) )
            // InternalSecurityDsl.g:5155:2: ( ruleEDatabaseType )
            {
            // InternalSecurityDsl.g:5155:2: ( ruleEDatabaseType )
            // InternalSecurityDsl.g:5156:3: ruleEDatabaseType
            {
             before(grammarAccess.getDatabaseAccess().getVendorNameEDatabaseTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDatabaseType();

            state._fsp--;

             after(grammarAccess.getDatabaseAccess().getVendorNameEDatabaseTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__VendorNameAssignment_1"


    // $ANTLR start "rule__Database__UrlAssignment_3"
    // InternalSecurityDsl.g:5165:1: rule__Database__UrlAssignment_3 : ( ruleEString ) ;
    public final void rule__Database__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5169:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5170:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5170:2: ( ruleEString )
            // InternalSecurityDsl.g:5171:3: ruleEString
            {
             before(grammarAccess.getDatabaseAccess().getUrlEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDatabaseAccess().getUrlEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__UrlAssignment_3"


    // $ANTLR start "rule__Database__UsernameAssignment_5"
    // InternalSecurityDsl.g:5180:1: rule__Database__UsernameAssignment_5 : ( ruleEString ) ;
    public final void rule__Database__UsernameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5184:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5185:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5185:2: ( ruleEString )
            // InternalSecurityDsl.g:5186:3: ruleEString
            {
             before(grammarAccess.getDatabaseAccess().getUsernameEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDatabaseAccess().getUsernameEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__UsernameAssignment_5"


    // $ANTLR start "rule__Database__PasswordAssignment_7"
    // InternalSecurityDsl.g:5195:1: rule__Database__PasswordAssignment_7 : ( ruleEString ) ;
    public final void rule__Database__PasswordAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5199:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5200:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5200:2: ( ruleEString )
            // InternalSecurityDsl.g:5201:3: ruleEString
            {
             before(grammarAccess.getDatabaseAccess().getPasswordEStringParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDatabaseAccess().getPasswordEStringParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__PasswordAssignment_7"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalSecurityDsl.g:5210:1: rule__Attribute__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5214:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5215:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5215:2: ( ruleEString )
            // InternalSecurityDsl.g:5216:3: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__TypeAssignment_4"
    // InternalSecurityDsl.g:5225:1: rule__Attribute__TypeAssignment_4 : ( ruleEType ) ;
    public final void rule__Attribute__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5229:1: ( ( ruleEType ) )
            // InternalSecurityDsl.g:5230:2: ( ruleEType )
            {
            // InternalSecurityDsl.g:5230:2: ( ruleEType )
            // InternalSecurityDsl.g:5231:3: ruleEType
            {
             before(grammarAccess.getAttributeAccess().getTypeETypeEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeETypeEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_4"


    // $ANTLR start "rule__User__IdentifierNameAssignment_3"
    // InternalSecurityDsl.g:5240:1: rule__User__IdentifierNameAssignment_3 : ( ruleEString ) ;
    public final void rule__User__IdentifierNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5244:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5245:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5245:2: ( ruleEString )
            // InternalSecurityDsl.g:5246:3: ruleEString
            {
             before(grammarAccess.getUserAccess().getIdentifierNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUserAccess().getIdentifierNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__IdentifierNameAssignment_3"


    // $ANTLR start "rule__User__IdentifierTypeAssignment_5"
    // InternalSecurityDsl.g:5255:1: rule__User__IdentifierTypeAssignment_5 : ( ruleEType ) ;
    public final void rule__User__IdentifierTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5259:1: ( ( ruleEType ) )
            // InternalSecurityDsl.g:5260:2: ( ruleEType )
            {
            // InternalSecurityDsl.g:5260:2: ( ruleEType )
            // InternalSecurityDsl.g:5261:3: ruleEType
            {
             before(grammarAccess.getUserAccess().getIdentifierTypeETypeEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEType();

            state._fsp--;

             after(grammarAccess.getUserAccess().getIdentifierTypeETypeEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__IdentifierTypeAssignment_5"


    // $ANTLR start "rule__User__Model_attributesAssignment_6_2"
    // InternalSecurityDsl.g:5270:1: rule__User__Model_attributesAssignment_6_2 : ( ruleAttribute ) ;
    public final void rule__User__Model_attributesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5274:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:5275:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:5275:2: ( ruleAttribute )
            // InternalSecurityDsl.g:5276:3: ruleAttribute
            {
             before(grammarAccess.getUserAccess().getModel_attributesAttributeParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getUserAccess().getModel_attributesAttributeParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Model_attributesAssignment_6_2"


    // $ANTLR start "rule__User__Model_attributesAssignment_6_3_1"
    // InternalSecurityDsl.g:5285:1: rule__User__Model_attributesAssignment_6_3_1 : ( ruleAttribute ) ;
    public final void rule__User__Model_attributesAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5289:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:5290:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:5290:2: ( ruleAttribute )
            // InternalSecurityDsl.g:5291:3: ruleAttribute
            {
             before(grammarAccess.getUserAccess().getModel_attributesAttributeParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getUserAccess().getModel_attributesAttributeParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Model_attributesAssignment_6_3_1"


    // $ANTLR start "rule__OtherModel__NameAssignment_1"
    // InternalSecurityDsl.g:5300:1: rule__OtherModel__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__OtherModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5304:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5305:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5305:2: ( ruleEString )
            // InternalSecurityDsl.g:5306:3: ruleEString
            {
             before(grammarAccess.getOtherModelAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOtherModelAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__NameAssignment_1"


    // $ANTLR start "rule__OtherModel__IdentifierNameAssignment_4"
    // InternalSecurityDsl.g:5315:1: rule__OtherModel__IdentifierNameAssignment_4 : ( ruleEString ) ;
    public final void rule__OtherModel__IdentifierNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5319:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5320:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5320:2: ( ruleEString )
            // InternalSecurityDsl.g:5321:3: ruleEString
            {
             before(grammarAccess.getOtherModelAccess().getIdentifierNameEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOtherModelAccess().getIdentifierNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__IdentifierNameAssignment_4"


    // $ANTLR start "rule__OtherModel__IdentifierTypeAssignment_6"
    // InternalSecurityDsl.g:5330:1: rule__OtherModel__IdentifierTypeAssignment_6 : ( ruleEType ) ;
    public final void rule__OtherModel__IdentifierTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5334:1: ( ( ruleEType ) )
            // InternalSecurityDsl.g:5335:2: ( ruleEType )
            {
            // InternalSecurityDsl.g:5335:2: ( ruleEType )
            // InternalSecurityDsl.g:5336:3: ruleEType
            {
             before(grammarAccess.getOtherModelAccess().getIdentifierTypeETypeEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEType();

            state._fsp--;

             after(grammarAccess.getOtherModelAccess().getIdentifierTypeETypeEnumRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__IdentifierTypeAssignment_6"


    // $ANTLR start "rule__OtherModel__Model_attributesAssignment_7_2"
    // InternalSecurityDsl.g:5345:1: rule__OtherModel__Model_attributesAssignment_7_2 : ( ruleAttribute ) ;
    public final void rule__OtherModel__Model_attributesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5349:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:5350:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:5350:2: ( ruleAttribute )
            // InternalSecurityDsl.g:5351:3: ruleAttribute
            {
             before(grammarAccess.getOtherModelAccess().getModel_attributesAttributeParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getOtherModelAccess().getModel_attributesAttributeParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Model_attributesAssignment_7_2"


    // $ANTLR start "rule__OtherModel__Model_attributesAssignment_7_3_1"
    // InternalSecurityDsl.g:5360:1: rule__OtherModel__Model_attributesAssignment_7_3_1 : ( ruleAttribute ) ;
    public final void rule__OtherModel__Model_attributesAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5364:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:5365:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:5365:2: ( ruleAttribute )
            // InternalSecurityDsl.g:5366:3: ruleAttribute
            {
             before(grammarAccess.getOtherModelAccess().getModel_attributesAttributeParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getOtherModelAccess().getModel_attributesAttributeParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Model_attributesAssignment_7_3_1"


    // $ANTLR start "rule__Role__IdentifierNameAssignment_3"
    // InternalSecurityDsl.g:5375:1: rule__Role__IdentifierNameAssignment_3 : ( ruleEString ) ;
    public final void rule__Role__IdentifierNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5379:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5380:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5380:2: ( ruleEString )
            // InternalSecurityDsl.g:5381:3: ruleEString
            {
             before(grammarAccess.getRoleAccess().getIdentifierNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getIdentifierNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__IdentifierNameAssignment_3"


    // $ANTLR start "rule__Role__IdentifierTypeAssignment_5"
    // InternalSecurityDsl.g:5390:1: rule__Role__IdentifierTypeAssignment_5 : ( ruleEType ) ;
    public final void rule__Role__IdentifierTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5394:1: ( ( ruleEType ) )
            // InternalSecurityDsl.g:5395:2: ( ruleEType )
            {
            // InternalSecurityDsl.g:5395:2: ( ruleEType )
            // InternalSecurityDsl.g:5396:3: ruleEType
            {
             before(grammarAccess.getRoleAccess().getIdentifierTypeETypeEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEType();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getIdentifierTypeETypeEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__IdentifierTypeAssignment_5"


    // $ANTLR start "rule__Role__Model_attributesAssignment_6_2"
    // InternalSecurityDsl.g:5405:1: rule__Role__Model_attributesAssignment_6_2 : ( ruleAttribute ) ;
    public final void rule__Role__Model_attributesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5409:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:5410:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:5410:2: ( ruleAttribute )
            // InternalSecurityDsl.g:5411:3: ruleAttribute
            {
             before(grammarAccess.getRoleAccess().getModel_attributesAttributeParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getModel_attributesAttributeParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Model_attributesAssignment_6_2"


    // $ANTLR start "rule__Role__Model_attributesAssignment_6_3_1"
    // InternalSecurityDsl.g:5420:1: rule__Role__Model_attributesAssignment_6_3_1 : ( ruleAttribute ) ;
    public final void rule__Role__Model_attributesAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5424:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:5425:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:5425:2: ( ruleAttribute )
            // InternalSecurityDsl.g:5426:3: ruleAttribute
            {
             before(grammarAccess.getRoleAccess().getModel_attributesAttributeParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getModel_attributesAttributeParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Model_attributesAssignment_6_3_1"


    // $ANTLR start "rule__Endpoint__UrlAssignment_3"
    // InternalSecurityDsl.g:5435:1: rule__Endpoint__UrlAssignment_3 : ( ruleEString ) ;
    public final void rule__Endpoint__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5439:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5440:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5440:2: ( ruleEString )
            // InternalSecurityDsl.g:5441:3: ruleEString
            {
             before(grammarAccess.getEndpointAccess().getUrlEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEndpointAccess().getUrlEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__UrlAssignment_3"


    // $ANTLR start "rule__Endpoint__Function_nameAssignment_5"
    // InternalSecurityDsl.g:5450:1: rule__Endpoint__Function_nameAssignment_5 : ( ruleEString ) ;
    public final void rule__Endpoint__Function_nameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5454:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5455:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5455:2: ( ruleEString )
            // InternalSecurityDsl.g:5456:3: ruleEString
            {
             before(grammarAccess.getEndpointAccess().getFunction_nameEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEndpointAccess().getFunction_nameEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Function_nameAssignment_5"


    // $ANTLR start "rule__Endpoint__MethodAssignment_7"
    // InternalSecurityDsl.g:5465:1: rule__Endpoint__MethodAssignment_7 : ( ruleEEndpointMethod ) ;
    public final void rule__Endpoint__MethodAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5469:1: ( ( ruleEEndpointMethod ) )
            // InternalSecurityDsl.g:5470:2: ( ruleEEndpointMethod )
            {
            // InternalSecurityDsl.g:5470:2: ( ruleEEndpointMethod )
            // InternalSecurityDsl.g:5471:3: ruleEEndpointMethod
            {
             before(grammarAccess.getEndpointAccess().getMethodEEndpointMethodEnumRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEEndpointMethod();

            state._fsp--;

             after(grammarAccess.getEndpointAccess().getMethodEEndpointMethodEnumRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__MethodAssignment_7"


    // $ANTLR start "rule__Endpoint__Roles_authorityAssignment_8_2"
    // InternalSecurityDsl.g:5480:1: rule__Endpoint__Roles_authorityAssignment_8_2 : ( ( ruleEString ) ) ;
    public final void rule__Endpoint__Roles_authorityAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5484:1: ( ( ( ruleEString ) ) )
            // InternalSecurityDsl.g:5485:2: ( ( ruleEString ) )
            {
            // InternalSecurityDsl.g:5485:2: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5486:3: ( ruleEString )
            {
             before(grammarAccess.getEndpointAccess().getRoles_authorityRoleCrossReference_8_2_0()); 
            // InternalSecurityDsl.g:5487:3: ( ruleEString )
            // InternalSecurityDsl.g:5488:4: ruleEString
            {
             before(grammarAccess.getEndpointAccess().getRoles_authorityRoleEStringParserRuleCall_8_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEndpointAccess().getRoles_authorityRoleEStringParserRuleCall_8_2_0_1()); 

            }

             after(grammarAccess.getEndpointAccess().getRoles_authorityRoleCrossReference_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Roles_authorityAssignment_8_2"


    // $ANTLR start "rule__Endpoint__Roles_authorityAssignment_8_3_1"
    // InternalSecurityDsl.g:5499:1: rule__Endpoint__Roles_authorityAssignment_8_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Endpoint__Roles_authorityAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5503:1: ( ( ( ruleEString ) ) )
            // InternalSecurityDsl.g:5504:2: ( ( ruleEString ) )
            {
            // InternalSecurityDsl.g:5504:2: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5505:3: ( ruleEString )
            {
             before(grammarAccess.getEndpointAccess().getRoles_authorityRoleCrossReference_8_3_1_0()); 
            // InternalSecurityDsl.g:5506:3: ( ruleEString )
            // InternalSecurityDsl.g:5507:4: ruleEString
            {
             before(grammarAccess.getEndpointAccess().getRoles_authorityRoleEStringParserRuleCall_8_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEndpointAccess().getRoles_authorityRoleEStringParserRuleCall_8_3_1_0_1()); 

            }

             after(grammarAccess.getEndpointAccess().getRoles_authorityRoleCrossReference_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Roles_authorityAssignment_8_3_1"


    // $ANTLR start "rule__Authentication__NameAssignment_1"
    // InternalSecurityDsl.g:5518:1: rule__Authentication__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Authentication__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5522:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5523:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5523:2: ( ruleEString )
            // InternalSecurityDsl.g:5524:3: ruleEString
            {
             before(grammarAccess.getAuthenticationAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAuthenticationAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__NameAssignment_1"


    // $ANTLR start "rule__Authentication__PathAssignment_4"
    // InternalSecurityDsl.g:5533:1: rule__Authentication__PathAssignment_4 : ( ruleEString ) ;
    public final void rule__Authentication__PathAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5537:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5538:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5538:2: ( ruleEString )
            // InternalSecurityDsl.g:5539:3: ruleEString
            {
             before(grammarAccess.getAuthenticationAccess().getPathEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAuthenticationAccess().getPathEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__PathAssignment_4"


    // $ANTLR start "rule__Authentication__Controller_endpointsAssignment_5_2"
    // InternalSecurityDsl.g:5548:1: rule__Authentication__Controller_endpointsAssignment_5_2 : ( ruleEndpoint ) ;
    public final void rule__Authentication__Controller_endpointsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5552:1: ( ( ruleEndpoint ) )
            // InternalSecurityDsl.g:5553:2: ( ruleEndpoint )
            {
            // InternalSecurityDsl.g:5553:2: ( ruleEndpoint )
            // InternalSecurityDsl.g:5554:3: ruleEndpoint
            {
             before(grammarAccess.getAuthenticationAccess().getController_endpointsEndpointParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEndpoint();

            state._fsp--;

             after(grammarAccess.getAuthenticationAccess().getController_endpointsEndpointParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Controller_endpointsAssignment_5_2"


    // $ANTLR start "rule__Authentication__Controller_endpointsAssignment_5_3_1"
    // InternalSecurityDsl.g:5563:1: rule__Authentication__Controller_endpointsAssignment_5_3_1 : ( ruleEndpoint ) ;
    public final void rule__Authentication__Controller_endpointsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5567:1: ( ( ruleEndpoint ) )
            // InternalSecurityDsl.g:5568:2: ( ruleEndpoint )
            {
            // InternalSecurityDsl.g:5568:2: ( ruleEndpoint )
            // InternalSecurityDsl.g:5569:3: ruleEndpoint
            {
             before(grammarAccess.getAuthenticationAccess().getController_endpointsEndpointParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEndpoint();

            state._fsp--;

             after(grammarAccess.getAuthenticationAccess().getController_endpointsEndpointParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Controller_endpointsAssignment_5_3_1"


    // $ANTLR start "rule__Authentication__Signup_endpointAssignment_6_1"
    // InternalSecurityDsl.g:5578:1: rule__Authentication__Signup_endpointAssignment_6_1 : ( ruleEndpoint ) ;
    public final void rule__Authentication__Signup_endpointAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5582:1: ( ( ruleEndpoint ) )
            // InternalSecurityDsl.g:5583:2: ( ruleEndpoint )
            {
            // InternalSecurityDsl.g:5583:2: ( ruleEndpoint )
            // InternalSecurityDsl.g:5584:3: ruleEndpoint
            {
             before(grammarAccess.getAuthenticationAccess().getSignup_endpointEndpointParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEndpoint();

            state._fsp--;

             after(grammarAccess.getAuthenticationAccess().getSignup_endpointEndpointParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Signup_endpointAssignment_6_1"


    // $ANTLR start "rule__Authentication__Login_endpointAssignment_7_1"
    // InternalSecurityDsl.g:5593:1: rule__Authentication__Login_endpointAssignment_7_1 : ( ruleEndpoint ) ;
    public final void rule__Authentication__Login_endpointAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5597:1: ( ( ruleEndpoint ) )
            // InternalSecurityDsl.g:5598:2: ( ruleEndpoint )
            {
            // InternalSecurityDsl.g:5598:2: ( ruleEndpoint )
            // InternalSecurityDsl.g:5599:3: ruleEndpoint
            {
             before(grammarAccess.getAuthenticationAccess().getLogin_endpointEndpointParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEndpoint();

            state._fsp--;

             after(grammarAccess.getAuthenticationAccess().getLogin_endpointEndpointParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Login_endpointAssignment_7_1"


    // $ANTLR start "rule__Authentication__Logout_endpointAssignment_8_1"
    // InternalSecurityDsl.g:5608:1: rule__Authentication__Logout_endpointAssignment_8_1 : ( ruleEndpoint ) ;
    public final void rule__Authentication__Logout_endpointAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5612:1: ( ( ruleEndpoint ) )
            // InternalSecurityDsl.g:5613:2: ( ruleEndpoint )
            {
            // InternalSecurityDsl.g:5613:2: ( ruleEndpoint )
            // InternalSecurityDsl.g:5614:3: ruleEndpoint
            {
             before(grammarAccess.getAuthenticationAccess().getLogout_endpointEndpointParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEndpoint();

            state._fsp--;

             after(grammarAccess.getAuthenticationAccess().getLogout_endpointEndpointParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Logout_endpointAssignment_8_1"


    // $ANTLR start "rule__OtherController__NameAssignment_1"
    // InternalSecurityDsl.g:5623:1: rule__OtherController__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__OtherController__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5627:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5628:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5628:2: ( ruleEString )
            // InternalSecurityDsl.g:5629:3: ruleEString
            {
             before(grammarAccess.getOtherControllerAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOtherControllerAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherController__NameAssignment_1"


    // $ANTLR start "rule__OtherController__PathAssignment_4"
    // InternalSecurityDsl.g:5638:1: rule__OtherController__PathAssignment_4 : ( ruleEString ) ;
    public final void rule__OtherController__PathAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5642:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5643:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5643:2: ( ruleEString )
            // InternalSecurityDsl.g:5644:3: ruleEString
            {
             before(grammarAccess.getOtherControllerAccess().getPathEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOtherControllerAccess().getPathEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherController__PathAssignment_4"


    // $ANTLR start "rule__OtherController__Controller_endpointsAssignment_5_2"
    // InternalSecurityDsl.g:5653:1: rule__OtherController__Controller_endpointsAssignment_5_2 : ( ruleEndpoint ) ;
    public final void rule__OtherController__Controller_endpointsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5657:1: ( ( ruleEndpoint ) )
            // InternalSecurityDsl.g:5658:2: ( ruleEndpoint )
            {
            // InternalSecurityDsl.g:5658:2: ( ruleEndpoint )
            // InternalSecurityDsl.g:5659:3: ruleEndpoint
            {
             before(grammarAccess.getOtherControllerAccess().getController_endpointsEndpointParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEndpoint();

            state._fsp--;

             after(grammarAccess.getOtherControllerAccess().getController_endpointsEndpointParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherController__Controller_endpointsAssignment_5_2"


    // $ANTLR start "rule__OtherController__Controller_endpointsAssignment_5_3_1"
    // InternalSecurityDsl.g:5668:1: rule__OtherController__Controller_endpointsAssignment_5_3_1 : ( ruleEndpoint ) ;
    public final void rule__OtherController__Controller_endpointsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5672:1: ( ( ruleEndpoint ) )
            // InternalSecurityDsl.g:5673:2: ( ruleEndpoint )
            {
            // InternalSecurityDsl.g:5673:2: ( ruleEndpoint )
            // InternalSecurityDsl.g:5674:3: ruleEndpoint
            {
             before(grammarAccess.getOtherControllerAccess().getController_endpointsEndpointParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEndpoint();

            state._fsp--;

             after(grammarAccess.getOtherControllerAccess().getController_endpointsEndpointParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherController__Controller_endpointsAssignment_5_3_1"


    // $ANTLR start "rule__JwtSecurity__MechanismAssignment_1"
    // InternalSecurityDsl.g:5683:1: rule__JwtSecurity__MechanismAssignment_1 : ( ruleESecurityMechanism ) ;
    public final void rule__JwtSecurity__MechanismAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5687:1: ( ( ruleESecurityMechanism ) )
            // InternalSecurityDsl.g:5688:2: ( ruleESecurityMechanism )
            {
            // InternalSecurityDsl.g:5688:2: ( ruleESecurityMechanism )
            // InternalSecurityDsl.g:5689:3: ruleESecurityMechanism
            {
             before(grammarAccess.getJwtSecurityAccess().getMechanismESecurityMechanismEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleESecurityMechanism();

            state._fsp--;

             after(grammarAccess.getJwtSecurityAccess().getMechanismESecurityMechanismEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__MechanismAssignment_1"


    // $ANTLR start "rule__JwtSecurity__SignatureAlgorithmAssignment_5"
    // InternalSecurityDsl.g:5698:1: rule__JwtSecurity__SignatureAlgorithmAssignment_5 : ( ruleEString ) ;
    public final void rule__JwtSecurity__SignatureAlgorithmAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5702:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5703:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5703:2: ( ruleEString )
            // InternalSecurityDsl.g:5704:3: ruleEString
            {
             before(grammarAccess.getJwtSecurityAccess().getSignatureAlgorithmEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getJwtSecurityAccess().getSignatureAlgorithmEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__SignatureAlgorithmAssignment_5"


    // $ANTLR start "rule__JwtSecurity__IssuerAssignment_8"
    // InternalSecurityDsl.g:5713:1: rule__JwtSecurity__IssuerAssignment_8 : ( ruleEString ) ;
    public final void rule__JwtSecurity__IssuerAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5717:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5718:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5718:2: ( ruleEString )
            // InternalSecurityDsl.g:5719:3: ruleEString
            {
             before(grammarAccess.getJwtSecurityAccess().getIssuerEStringParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getJwtSecurityAccess().getIssuerEStringParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__IssuerAssignment_8"


    // $ANTLR start "rule__JwtSecurity__ExpirationTimeAssignment_10"
    // InternalSecurityDsl.g:5728:1: rule__JwtSecurity__ExpirationTimeAssignment_10 : ( ruleEInt ) ;
    public final void rule__JwtSecurity__ExpirationTimeAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5732:1: ( ( ruleEInt ) )
            // InternalSecurityDsl.g:5733:2: ( ruleEInt )
            {
            // InternalSecurityDsl.g:5733:2: ( ruleEInt )
            // InternalSecurityDsl.g:5734:3: ruleEInt
            {
             before(grammarAccess.getJwtSecurityAccess().getExpirationTimeEIntParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getJwtSecurityAccess().getExpirationTimeEIntParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__ExpirationTimeAssignment_10"


    // $ANTLR start "rule__JwtSecurity__AudienceAssignment_12"
    // InternalSecurityDsl.g:5743:1: rule__JwtSecurity__AudienceAssignment_12 : ( ruleEString ) ;
    public final void rule__JwtSecurity__AudienceAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5747:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5748:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5748:2: ( ruleEString )
            // InternalSecurityDsl.g:5749:3: ruleEString
            {
             before(grammarAccess.getJwtSecurityAccess().getAudienceEStringParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getJwtSecurityAccess().getAudienceEStringParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__AudienceAssignment_12"


    // $ANTLR start "rule__JwtSecurity__Security_claimsAssignment_13_2"
    // InternalSecurityDsl.g:5758:1: rule__JwtSecurity__Security_claimsAssignment_13_2 : ( rulePublicClaims ) ;
    public final void rule__JwtSecurity__Security_claimsAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5762:1: ( ( rulePublicClaims ) )
            // InternalSecurityDsl.g:5763:2: ( rulePublicClaims )
            {
            // InternalSecurityDsl.g:5763:2: ( rulePublicClaims )
            // InternalSecurityDsl.g:5764:3: rulePublicClaims
            {
             before(grammarAccess.getJwtSecurityAccess().getSecurity_claimsPublicClaimsParserRuleCall_13_2_0()); 
            pushFollow(FOLLOW_2);
            rulePublicClaims();

            state._fsp--;

             after(grammarAccess.getJwtSecurityAccess().getSecurity_claimsPublicClaimsParserRuleCall_13_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Security_claimsAssignment_13_2"


    // $ANTLR start "rule__JwtSecurity__Security_claimsAssignment_13_3_1"
    // InternalSecurityDsl.g:5773:1: rule__JwtSecurity__Security_claimsAssignment_13_3_1 : ( rulePublicClaims ) ;
    public final void rule__JwtSecurity__Security_claimsAssignment_13_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5777:1: ( ( rulePublicClaims ) )
            // InternalSecurityDsl.g:5778:2: ( rulePublicClaims )
            {
            // InternalSecurityDsl.g:5778:2: ( rulePublicClaims )
            // InternalSecurityDsl.g:5779:3: rulePublicClaims
            {
             before(grammarAccess.getJwtSecurityAccess().getSecurity_claimsPublicClaimsParserRuleCall_13_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePublicClaims();

            state._fsp--;

             after(grammarAccess.getJwtSecurityAccess().getSecurity_claimsPublicClaimsParserRuleCall_13_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Security_claimsAssignment_13_3_1"


    // $ANTLR start "rule__JwtSecurity__Security_claimsAssignment_14_2"
    // InternalSecurityDsl.g:5788:1: rule__JwtSecurity__Security_claimsAssignment_14_2 : ( rulePrivateClaims ) ;
    public final void rule__JwtSecurity__Security_claimsAssignment_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5792:1: ( ( rulePrivateClaims ) )
            // InternalSecurityDsl.g:5793:2: ( rulePrivateClaims )
            {
            // InternalSecurityDsl.g:5793:2: ( rulePrivateClaims )
            // InternalSecurityDsl.g:5794:3: rulePrivateClaims
            {
             before(grammarAccess.getJwtSecurityAccess().getSecurity_claimsPrivateClaimsParserRuleCall_14_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrivateClaims();

            state._fsp--;

             after(grammarAccess.getJwtSecurityAccess().getSecurity_claimsPrivateClaimsParserRuleCall_14_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Security_claimsAssignment_14_2"


    // $ANTLR start "rule__JwtSecurity__Security_claimsAssignment_14_3_1"
    // InternalSecurityDsl.g:5803:1: rule__JwtSecurity__Security_claimsAssignment_14_3_1 : ( rulePrivateClaims ) ;
    public final void rule__JwtSecurity__Security_claimsAssignment_14_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5807:1: ( ( rulePrivateClaims ) )
            // InternalSecurityDsl.g:5808:2: ( rulePrivateClaims )
            {
            // InternalSecurityDsl.g:5808:2: ( rulePrivateClaims )
            // InternalSecurityDsl.g:5809:3: rulePrivateClaims
            {
             before(grammarAccess.getJwtSecurityAccess().getSecurity_claimsPrivateClaimsParserRuleCall_14_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrivateClaims();

            state._fsp--;

             after(grammarAccess.getJwtSecurityAccess().getSecurity_claimsPrivateClaimsParserRuleCall_14_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__Security_claimsAssignment_14_3_1"


    // $ANTLR start "rule__JwtSecurity__SecretAssignment_17"
    // InternalSecurityDsl.g:5818:1: rule__JwtSecurity__SecretAssignment_17 : ( ruleEString ) ;
    public final void rule__JwtSecurity__SecretAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5822:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5823:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5823:2: ( ruleEString )
            // InternalSecurityDsl.g:5824:3: ruleEString
            {
             before(grammarAccess.getJwtSecurityAccess().getSecretEStringParserRuleCall_17_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getJwtSecurityAccess().getSecretEStringParserRuleCall_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JwtSecurity__SecretAssignment_17"


    // $ANTLR start "rule__PublicClaims__IsPublicAssignment_0"
    // InternalSecurityDsl.g:5833:1: rule__PublicClaims__IsPublicAssignment_0 : ( ( 'isPublic' ) ) ;
    public final void rule__PublicClaims__IsPublicAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5837:1: ( ( ( 'isPublic' ) ) )
            // InternalSecurityDsl.g:5838:2: ( ( 'isPublic' ) )
            {
            // InternalSecurityDsl.g:5838:2: ( ( 'isPublic' ) )
            // InternalSecurityDsl.g:5839:3: ( 'isPublic' )
            {
             before(grammarAccess.getPublicClaimsAccess().getIsPublicIsPublicKeyword_0_0()); 
            // InternalSecurityDsl.g:5840:3: ( 'isPublic' )
            // InternalSecurityDsl.g:5841:4: 'isPublic'
            {
             before(grammarAccess.getPublicClaimsAccess().getIsPublicIsPublicKeyword_0_0()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getPublicClaimsAccess().getIsPublicIsPublicKeyword_0_0()); 

            }

             after(grammarAccess.getPublicClaimsAccess().getIsPublicIsPublicKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicClaims__IsPublicAssignment_0"


    // $ANTLR start "rule__PublicClaims__NameAssignment_1"
    // InternalSecurityDsl.g:5852:1: rule__PublicClaims__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__PublicClaims__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5856:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5857:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5857:2: ( ruleEString )
            // InternalSecurityDsl.g:5858:3: ruleEString
            {
             before(grammarAccess.getPublicClaimsAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPublicClaimsAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicClaims__NameAssignment_1"


    // $ANTLR start "rule__PrivateClaims__IsPublicAssignment_0"
    // InternalSecurityDsl.g:5867:1: rule__PrivateClaims__IsPublicAssignment_0 : ( ( 'isPublic' ) ) ;
    public final void rule__PrivateClaims__IsPublicAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5871:1: ( ( ( 'isPublic' ) ) )
            // InternalSecurityDsl.g:5872:2: ( ( 'isPublic' ) )
            {
            // InternalSecurityDsl.g:5872:2: ( ( 'isPublic' ) )
            // InternalSecurityDsl.g:5873:3: ( 'isPublic' )
            {
             before(grammarAccess.getPrivateClaimsAccess().getIsPublicIsPublicKeyword_0_0()); 
            // InternalSecurityDsl.g:5874:3: ( 'isPublic' )
            // InternalSecurityDsl.g:5875:4: 'isPublic'
            {
             before(grammarAccess.getPrivateClaimsAccess().getIsPublicIsPublicKeyword_0_0()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getPrivateClaimsAccess().getIsPublicIsPublicKeyword_0_0()); 

            }

             after(grammarAccess.getPrivateClaimsAccess().getIsPublicIsPublicKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateClaims__IsPublicAssignment_0"


    // $ANTLR start "rule__PrivateClaims__NameAssignment_1"
    // InternalSecurityDsl.g:5886:1: rule__PrivateClaims__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__PrivateClaims__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5890:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5891:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5891:2: ( ruleEString )
            // InternalSecurityDsl.g:5892:3: ruleEString
            {
             before(grammarAccess.getPrivateClaimsAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPrivateClaimsAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateClaims__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000007FC000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000840000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0040040000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0100800000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x7800040000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0800040000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000040L,0x0000000000004000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002500L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000800000000000L,0x0000000000001000L});

}