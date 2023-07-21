package rs.ac.uns.ftn.securitydsl.ide.contentassist.antlr.internal;

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
import rs.ac.uns.ftn.securitydsl.services.SecurityDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSecurityDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PostgreSQL'", "'Oracle'", "'MySQL'", "'String'", "'Float'", "'Long'", "'Integer'", "'char'", "'Double'", "'DateTime'", "'Date'", "'int'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'REGISTRATION'", "'LOGIN'", "'LOGOUT'", "'OTHER'", "'PRIVATE'", "'PUBLIC'", "'REGISTERED'", "'Application'", "'{'", "'}'", "'description'", "'group'", "'artifact'", "'packageName'", "'port'", "'hostname'", "'app_database'", "'app_models'", "','", "'app_controllers'", "'app_security'", "'Database'", "'vendorName'", "'url'", "'username'", "'password'", "'-'", "'Attribute'", "'type'", "'collumnName'", "'Role'", "'tableName'", "'model_attributes'", "'role_instances'", "'User'", "'RoleInstance'", "'Endpoint'", "'functionName'", "'method'", "'role_authorities'", "'('", "')'", "'Authentication'", "'path'", "'controller_endpoints'", "'JWT'", "'signatureAlgorithm'", "'registeredclaims'", "'secret'", "'jwt_claims'", "'Claim'", "'claim_attribute'", "'RegisteredClaims'", "'expirationTime'", "'issuer'", "'audience'", "'isIdentifier'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
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
    public static final int RULE_ML_COMMENT=7;
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
    public static final int RULE_SL_COMMENT=8;
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
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
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


    // $ANTLR start "entryRuleModel"
    // InternalSecurityDsl.g:78:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:79:1: ( ruleModel EOF )
            // InternalSecurityDsl.g:80:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSecurityDsl.g:87:1: ruleModel : ( ( rule__Model__Alternatives ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:91:2: ( ( ( rule__Model__Alternatives ) ) )
            // InternalSecurityDsl.g:92:2: ( ( rule__Model__Alternatives ) )
            {
            // InternalSecurityDsl.g:92:2: ( ( rule__Model__Alternatives ) )
            // InternalSecurityDsl.g:93:3: ( rule__Model__Alternatives )
            {
             before(grammarAccess.getModelAccess().getAlternatives()); 
            // InternalSecurityDsl.g:94:3: ( rule__Model__Alternatives )
            // InternalSecurityDsl.g:94:4: rule__Model__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Model__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getAlternatives()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleController"
    // InternalSecurityDsl.g:103:1: entryRuleController : ruleController EOF ;
    public final void entryRuleController() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:104:1: ( ruleController EOF )
            // InternalSecurityDsl.g:105:1: ruleController EOF
            {
             before(grammarAccess.getControllerRule()); 
            pushFollow(FOLLOW_1);
            ruleController();

            state._fsp--;

             after(grammarAccess.getControllerRule()); 
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
    // $ANTLR end "entryRuleController"


    // $ANTLR start "ruleController"
    // InternalSecurityDsl.g:112:1: ruleController : ( ruleAuthentication ) ;
    public final void ruleController() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:116:2: ( ( ruleAuthentication ) )
            // InternalSecurityDsl.g:117:2: ( ruleAuthentication )
            {
            // InternalSecurityDsl.g:117:2: ( ruleAuthentication )
            // InternalSecurityDsl.g:118:3: ruleAuthentication
            {
             before(grammarAccess.getControllerAccess().getAuthenticationParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleAuthentication();

            state._fsp--;

             after(grammarAccess.getControllerAccess().getAuthenticationParserRuleCall()); 

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
    // $ANTLR end "ruleController"


    // $ANTLR start "entryRuleSecurity"
    // InternalSecurityDsl.g:128:1: entryRuleSecurity : ruleSecurity EOF ;
    public final void entryRuleSecurity() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:129:1: ( ruleSecurity EOF )
            // InternalSecurityDsl.g:130:1: ruleSecurity EOF
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
    // InternalSecurityDsl.g:137:1: ruleSecurity : ( ruleJWT ) ;
    public final void ruleSecurity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:141:2: ( ( ruleJWT ) )
            // InternalSecurityDsl.g:142:2: ( ruleJWT )
            {
            // InternalSecurityDsl.g:142:2: ( ruleJWT )
            // InternalSecurityDsl.g:143:3: ruleJWT
            {
             before(grammarAccess.getSecurityAccess().getJWTParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleJWT();

            state._fsp--;

             after(grammarAccess.getSecurityAccess().getJWTParserRuleCall()); 

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


    // $ANTLR start "entryRuleDatabase"
    // InternalSecurityDsl.g:153:1: entryRuleDatabase : ruleDatabase EOF ;
    public final void entryRuleDatabase() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:154:1: ( ruleDatabase EOF )
            // InternalSecurityDsl.g:155:1: ruleDatabase EOF
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
    // InternalSecurityDsl.g:162:1: ruleDatabase : ( ( rule__Database__Group__0 ) ) ;
    public final void ruleDatabase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:166:2: ( ( ( rule__Database__Group__0 ) ) )
            // InternalSecurityDsl.g:167:2: ( ( rule__Database__Group__0 ) )
            {
            // InternalSecurityDsl.g:167:2: ( ( rule__Database__Group__0 ) )
            // InternalSecurityDsl.g:168:3: ( rule__Database__Group__0 )
            {
             before(grammarAccess.getDatabaseAccess().getGroup()); 
            // InternalSecurityDsl.g:169:3: ( rule__Database__Group__0 )
            // InternalSecurityDsl.g:169:4: rule__Database__Group__0
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


    // $ANTLR start "entryRuleEString"
    // InternalSecurityDsl.g:178:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:179:1: ( ruleEString EOF )
            // InternalSecurityDsl.g:180:1: ruleEString EOF
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
    // InternalSecurityDsl.g:187:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:191:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSecurityDsl.g:192:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSecurityDsl.g:192:2: ( ( rule__EString__Alternatives ) )
            // InternalSecurityDsl.g:193:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSecurityDsl.g:194:3: ( rule__EString__Alternatives )
            // InternalSecurityDsl.g:194:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleELongObject"
    // InternalSecurityDsl.g:203:1: entryRuleELongObject : ruleELongObject EOF ;
    public final void entryRuleELongObject() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:204:1: ( ruleELongObject EOF )
            // InternalSecurityDsl.g:205:1: ruleELongObject EOF
            {
             before(grammarAccess.getELongObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleELongObject();

            state._fsp--;

             after(grammarAccess.getELongObjectRule()); 
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
    // $ANTLR end "entryRuleELongObject"


    // $ANTLR start "ruleELongObject"
    // InternalSecurityDsl.g:212:1: ruleELongObject : ( ( rule__ELongObject__Group__0 ) ) ;
    public final void ruleELongObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:216:2: ( ( ( rule__ELongObject__Group__0 ) ) )
            // InternalSecurityDsl.g:217:2: ( ( rule__ELongObject__Group__0 ) )
            {
            // InternalSecurityDsl.g:217:2: ( ( rule__ELongObject__Group__0 ) )
            // InternalSecurityDsl.g:218:3: ( rule__ELongObject__Group__0 )
            {
             before(grammarAccess.getELongObjectAccess().getGroup()); 
            // InternalSecurityDsl.g:219:3: ( rule__ELongObject__Group__0 )
            // InternalSecurityDsl.g:219:4: rule__ELongObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ELongObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getELongObjectAccess().getGroup()); 

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
    // $ANTLR end "ruleELongObject"


    // $ANTLR start "entryRuleAttribute"
    // InternalSecurityDsl.g:228:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:229:1: ( ruleAttribute EOF )
            // InternalSecurityDsl.g:230:1: ruleAttribute EOF
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
    // InternalSecurityDsl.g:237:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:241:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalSecurityDsl.g:242:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalSecurityDsl.g:242:2: ( ( rule__Attribute__Group__0 ) )
            // InternalSecurityDsl.g:243:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalSecurityDsl.g:244:3: ( rule__Attribute__Group__0 )
            // InternalSecurityDsl.g:244:4: rule__Attribute__Group__0
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


    // $ANTLR start "entryRuleRole"
    // InternalSecurityDsl.g:253:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:254:1: ( ruleRole EOF )
            // InternalSecurityDsl.g:255:1: ruleRole EOF
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
    // InternalSecurityDsl.g:262:1: ruleRole : ( ( rule__Role__Group__0 ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:266:2: ( ( ( rule__Role__Group__0 ) ) )
            // InternalSecurityDsl.g:267:2: ( ( rule__Role__Group__0 ) )
            {
            // InternalSecurityDsl.g:267:2: ( ( rule__Role__Group__0 ) )
            // InternalSecurityDsl.g:268:3: ( rule__Role__Group__0 )
            {
             before(grammarAccess.getRoleAccess().getGroup()); 
            // InternalSecurityDsl.g:269:3: ( rule__Role__Group__0 )
            // InternalSecurityDsl.g:269:4: rule__Role__Group__0
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


    // $ANTLR start "entryRuleUser"
    // InternalSecurityDsl.g:278:1: entryRuleUser : ruleUser EOF ;
    public final void entryRuleUser() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:279:1: ( ruleUser EOF )
            // InternalSecurityDsl.g:280:1: ruleUser EOF
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
    // InternalSecurityDsl.g:287:1: ruleUser : ( ( rule__User__Group__0 ) ) ;
    public final void ruleUser() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:291:2: ( ( ( rule__User__Group__0 ) ) )
            // InternalSecurityDsl.g:292:2: ( ( rule__User__Group__0 ) )
            {
            // InternalSecurityDsl.g:292:2: ( ( rule__User__Group__0 ) )
            // InternalSecurityDsl.g:293:3: ( rule__User__Group__0 )
            {
             before(grammarAccess.getUserAccess().getGroup()); 
            // InternalSecurityDsl.g:294:3: ( rule__User__Group__0 )
            // InternalSecurityDsl.g:294:4: rule__User__Group__0
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


    // $ANTLR start "entryRuleRoleInstance"
    // InternalSecurityDsl.g:303:1: entryRuleRoleInstance : ruleRoleInstance EOF ;
    public final void entryRuleRoleInstance() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:304:1: ( ruleRoleInstance EOF )
            // InternalSecurityDsl.g:305:1: ruleRoleInstance EOF
            {
             before(grammarAccess.getRoleInstanceRule()); 
            pushFollow(FOLLOW_1);
            ruleRoleInstance();

            state._fsp--;

             after(grammarAccess.getRoleInstanceRule()); 
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
    // $ANTLR end "entryRuleRoleInstance"


    // $ANTLR start "ruleRoleInstance"
    // InternalSecurityDsl.g:312:1: ruleRoleInstance : ( ( rule__RoleInstance__Group__0 ) ) ;
    public final void ruleRoleInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:316:2: ( ( ( rule__RoleInstance__Group__0 ) ) )
            // InternalSecurityDsl.g:317:2: ( ( rule__RoleInstance__Group__0 ) )
            {
            // InternalSecurityDsl.g:317:2: ( ( rule__RoleInstance__Group__0 ) )
            // InternalSecurityDsl.g:318:3: ( rule__RoleInstance__Group__0 )
            {
             before(grammarAccess.getRoleInstanceAccess().getGroup()); 
            // InternalSecurityDsl.g:319:3: ( rule__RoleInstance__Group__0 )
            // InternalSecurityDsl.g:319:4: rule__RoleInstance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RoleInstance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoleInstanceAccess().getGroup()); 

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
    // $ANTLR end "ruleRoleInstance"


    // $ANTLR start "entryRuleEndpoint"
    // InternalSecurityDsl.g:328:1: entryRuleEndpoint : ruleEndpoint EOF ;
    public final void entryRuleEndpoint() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:329:1: ( ruleEndpoint EOF )
            // InternalSecurityDsl.g:330:1: ruleEndpoint EOF
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
    // InternalSecurityDsl.g:337:1: ruleEndpoint : ( ( rule__Endpoint__Group__0 ) ) ;
    public final void ruleEndpoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:341:2: ( ( ( rule__Endpoint__Group__0 ) ) )
            // InternalSecurityDsl.g:342:2: ( ( rule__Endpoint__Group__0 ) )
            {
            // InternalSecurityDsl.g:342:2: ( ( rule__Endpoint__Group__0 ) )
            // InternalSecurityDsl.g:343:3: ( rule__Endpoint__Group__0 )
            {
             before(grammarAccess.getEndpointAccess().getGroup()); 
            // InternalSecurityDsl.g:344:3: ( rule__Endpoint__Group__0 )
            // InternalSecurityDsl.g:344:4: rule__Endpoint__Group__0
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
    // InternalSecurityDsl.g:353:1: entryRuleAuthentication : ruleAuthentication EOF ;
    public final void entryRuleAuthentication() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:354:1: ( ruleAuthentication EOF )
            // InternalSecurityDsl.g:355:1: ruleAuthentication EOF
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
    // InternalSecurityDsl.g:362:1: ruleAuthentication : ( ( rule__Authentication__Group__0 ) ) ;
    public final void ruleAuthentication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:366:2: ( ( ( rule__Authentication__Group__0 ) ) )
            // InternalSecurityDsl.g:367:2: ( ( rule__Authentication__Group__0 ) )
            {
            // InternalSecurityDsl.g:367:2: ( ( rule__Authentication__Group__0 ) )
            // InternalSecurityDsl.g:368:3: ( rule__Authentication__Group__0 )
            {
             before(grammarAccess.getAuthenticationAccess().getGroup()); 
            // InternalSecurityDsl.g:369:3: ( rule__Authentication__Group__0 )
            // InternalSecurityDsl.g:369:4: rule__Authentication__Group__0
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


    // $ANTLR start "entryRuleJWT"
    // InternalSecurityDsl.g:378:1: entryRuleJWT : ruleJWT EOF ;
    public final void entryRuleJWT() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:379:1: ( ruleJWT EOF )
            // InternalSecurityDsl.g:380:1: ruleJWT EOF
            {
             before(grammarAccess.getJWTRule()); 
            pushFollow(FOLLOW_1);
            ruleJWT();

            state._fsp--;

             after(grammarAccess.getJWTRule()); 
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
    // $ANTLR end "entryRuleJWT"


    // $ANTLR start "ruleJWT"
    // InternalSecurityDsl.g:387:1: ruleJWT : ( ( rule__JWT__Group__0 ) ) ;
    public final void ruleJWT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:391:2: ( ( ( rule__JWT__Group__0 ) ) )
            // InternalSecurityDsl.g:392:2: ( ( rule__JWT__Group__0 ) )
            {
            // InternalSecurityDsl.g:392:2: ( ( rule__JWT__Group__0 ) )
            // InternalSecurityDsl.g:393:3: ( rule__JWT__Group__0 )
            {
             before(grammarAccess.getJWTAccess().getGroup()); 
            // InternalSecurityDsl.g:394:3: ( rule__JWT__Group__0 )
            // InternalSecurityDsl.g:394:4: rule__JWT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JWT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJWTAccess().getGroup()); 

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
    // $ANTLR end "ruleJWT"


    // $ANTLR start "entryRuleClaim"
    // InternalSecurityDsl.g:403:1: entryRuleClaim : ruleClaim EOF ;
    public final void entryRuleClaim() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:404:1: ( ruleClaim EOF )
            // InternalSecurityDsl.g:405:1: ruleClaim EOF
            {
             before(grammarAccess.getClaimRule()); 
            pushFollow(FOLLOW_1);
            ruleClaim();

            state._fsp--;

             after(grammarAccess.getClaimRule()); 
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
    // $ANTLR end "entryRuleClaim"


    // $ANTLR start "ruleClaim"
    // InternalSecurityDsl.g:412:1: ruleClaim : ( ( rule__Claim__Group__0 ) ) ;
    public final void ruleClaim() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:416:2: ( ( ( rule__Claim__Group__0 ) ) )
            // InternalSecurityDsl.g:417:2: ( ( rule__Claim__Group__0 ) )
            {
            // InternalSecurityDsl.g:417:2: ( ( rule__Claim__Group__0 ) )
            // InternalSecurityDsl.g:418:3: ( rule__Claim__Group__0 )
            {
             before(grammarAccess.getClaimAccess().getGroup()); 
            // InternalSecurityDsl.g:419:3: ( rule__Claim__Group__0 )
            // InternalSecurityDsl.g:419:4: rule__Claim__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Claim__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClaimAccess().getGroup()); 

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
    // $ANTLR end "ruleClaim"


    // $ANTLR start "entryRuleRegisteredClaims"
    // InternalSecurityDsl.g:428:1: entryRuleRegisteredClaims : ruleRegisteredClaims EOF ;
    public final void entryRuleRegisteredClaims() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:429:1: ( ruleRegisteredClaims EOF )
            // InternalSecurityDsl.g:430:1: ruleRegisteredClaims EOF
            {
             before(grammarAccess.getRegisteredClaimsRule()); 
            pushFollow(FOLLOW_1);
            ruleRegisteredClaims();

            state._fsp--;

             after(grammarAccess.getRegisteredClaimsRule()); 
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
    // $ANTLR end "entryRuleRegisteredClaims"


    // $ANTLR start "ruleRegisteredClaims"
    // InternalSecurityDsl.g:437:1: ruleRegisteredClaims : ( ( rule__RegisteredClaims__Group__0 ) ) ;
    public final void ruleRegisteredClaims() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:441:2: ( ( ( rule__RegisteredClaims__Group__0 ) ) )
            // InternalSecurityDsl.g:442:2: ( ( rule__RegisteredClaims__Group__0 ) )
            {
            // InternalSecurityDsl.g:442:2: ( ( rule__RegisteredClaims__Group__0 ) )
            // InternalSecurityDsl.g:443:3: ( rule__RegisteredClaims__Group__0 )
            {
             before(grammarAccess.getRegisteredClaimsAccess().getGroup()); 
            // InternalSecurityDsl.g:444:3: ( rule__RegisteredClaims__Group__0 )
            // InternalSecurityDsl.g:444:4: rule__RegisteredClaims__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RegisteredClaims__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRegisteredClaimsAccess().getGroup()); 

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
    // $ANTLR end "ruleRegisteredClaims"


    // $ANTLR start "entryRuleEInt"
    // InternalSecurityDsl.g:453:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:454:1: ( ruleEInt EOF )
            // InternalSecurityDsl.g:455:1: ruleEInt EOF
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
    // InternalSecurityDsl.g:462:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:466:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalSecurityDsl.g:467:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalSecurityDsl.g:467:2: ( ( rule__EInt__Group__0 ) )
            // InternalSecurityDsl.g:468:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalSecurityDsl.g:469:3: ( rule__EInt__Group__0 )
            // InternalSecurityDsl.g:469:4: rule__EInt__Group__0
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


    // $ANTLR start "ruleEDatabaseType"
    // InternalSecurityDsl.g:478:1: ruleEDatabaseType : ( ( rule__EDatabaseType__Alternatives ) ) ;
    public final void ruleEDatabaseType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:482:1: ( ( ( rule__EDatabaseType__Alternatives ) ) )
            // InternalSecurityDsl.g:483:2: ( ( rule__EDatabaseType__Alternatives ) )
            {
            // InternalSecurityDsl.g:483:2: ( ( rule__EDatabaseType__Alternatives ) )
            // InternalSecurityDsl.g:484:3: ( rule__EDatabaseType__Alternatives )
            {
             before(grammarAccess.getEDatabaseTypeAccess().getAlternatives()); 
            // InternalSecurityDsl.g:485:3: ( rule__EDatabaseType__Alternatives )
            // InternalSecurityDsl.g:485:4: rule__EDatabaseType__Alternatives
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


    // $ANTLR start "ruleEType"
    // InternalSecurityDsl.g:494:1: ruleEType : ( ( rule__EType__Alternatives ) ) ;
    public final void ruleEType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:498:1: ( ( ( rule__EType__Alternatives ) ) )
            // InternalSecurityDsl.g:499:2: ( ( rule__EType__Alternatives ) )
            {
            // InternalSecurityDsl.g:499:2: ( ( rule__EType__Alternatives ) )
            // InternalSecurityDsl.g:500:3: ( rule__EType__Alternatives )
            {
             before(grammarAccess.getETypeAccess().getAlternatives()); 
            // InternalSecurityDsl.g:501:3: ( rule__EType__Alternatives )
            // InternalSecurityDsl.g:501:4: rule__EType__Alternatives
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
    // InternalSecurityDsl.g:510:1: ruleEEndpointMethod : ( ( rule__EEndpointMethod__Alternatives ) ) ;
    public final void ruleEEndpointMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:514:1: ( ( ( rule__EEndpointMethod__Alternatives ) ) )
            // InternalSecurityDsl.g:515:2: ( ( rule__EEndpointMethod__Alternatives ) )
            {
            // InternalSecurityDsl.g:515:2: ( ( rule__EEndpointMethod__Alternatives ) )
            // InternalSecurityDsl.g:516:3: ( rule__EEndpointMethod__Alternatives )
            {
             before(grammarAccess.getEEndpointMethodAccess().getAlternatives()); 
            // InternalSecurityDsl.g:517:3: ( rule__EEndpointMethod__Alternatives )
            // InternalSecurityDsl.g:517:4: rule__EEndpointMethod__Alternatives
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


    // $ANTLR start "ruleEEndpointType"
    // InternalSecurityDsl.g:526:1: ruleEEndpointType : ( ( rule__EEndpointType__Alternatives ) ) ;
    public final void ruleEEndpointType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:530:1: ( ( ( rule__EEndpointType__Alternatives ) ) )
            // InternalSecurityDsl.g:531:2: ( ( rule__EEndpointType__Alternatives ) )
            {
            // InternalSecurityDsl.g:531:2: ( ( rule__EEndpointType__Alternatives ) )
            // InternalSecurityDsl.g:532:3: ( rule__EEndpointType__Alternatives )
            {
             before(grammarAccess.getEEndpointTypeAccess().getAlternatives()); 
            // InternalSecurityDsl.g:533:3: ( rule__EEndpointType__Alternatives )
            // InternalSecurityDsl.g:533:4: rule__EEndpointType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EEndpointType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEEndpointTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEEndpointType"


    // $ANTLR start "ruleEClaimType"
    // InternalSecurityDsl.g:542:1: ruleEClaimType : ( ( rule__EClaimType__Alternatives ) ) ;
    public final void ruleEClaimType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:546:1: ( ( ( rule__EClaimType__Alternatives ) ) )
            // InternalSecurityDsl.g:547:2: ( ( rule__EClaimType__Alternatives ) )
            {
            // InternalSecurityDsl.g:547:2: ( ( rule__EClaimType__Alternatives ) )
            // InternalSecurityDsl.g:548:3: ( rule__EClaimType__Alternatives )
            {
             before(grammarAccess.getEClaimTypeAccess().getAlternatives()); 
            // InternalSecurityDsl.g:549:3: ( rule__EClaimType__Alternatives )
            // InternalSecurityDsl.g:549:4: rule__EClaimType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EClaimType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEClaimTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEClaimType"


    // $ANTLR start "rule__Model__Alternatives"
    // InternalSecurityDsl.g:557:1: rule__Model__Alternatives : ( ( ruleRole ) | ( ruleUser ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:561:1: ( ( ruleRole ) | ( ruleUser ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==57) ) {
                alt1=1;
            }
            else if ( (LA1_0==61) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSecurityDsl.g:562:2: ( ruleRole )
                    {
                    // InternalSecurityDsl.g:562:2: ( ruleRole )
                    // InternalSecurityDsl.g:563:3: ruleRole
                    {
                     before(grammarAccess.getModelAccess().getRoleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRole();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getRoleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:568:2: ( ruleUser )
                    {
                    // InternalSecurityDsl.g:568:2: ( ruleUser )
                    // InternalSecurityDsl.g:569:3: ruleUser
                    {
                     before(grammarAccess.getModelAccess().getUserParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUser();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getUserParserRuleCall_1()); 

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
    // $ANTLR end "rule__Model__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalSecurityDsl.g:578:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:582:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSecurityDsl.g:583:2: ( RULE_STRING )
                    {
                    // InternalSecurityDsl.g:583:2: ( RULE_STRING )
                    // InternalSecurityDsl.g:584:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:589:2: ( RULE_ID )
                    {
                    // InternalSecurityDsl.g:589:2: ( RULE_ID )
                    // InternalSecurityDsl.g:590:3: RULE_ID
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


    // $ANTLR start "rule__EDatabaseType__Alternatives"
    // InternalSecurityDsl.g:599:1: rule__EDatabaseType__Alternatives : ( ( ( 'PostgreSQL' ) ) | ( ( 'Oracle' ) ) | ( ( 'MySQL' ) ) );
    public final void rule__EDatabaseType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:603:1: ( ( ( 'PostgreSQL' ) ) | ( ( 'Oracle' ) ) | ( ( 'MySQL' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSecurityDsl.g:604:2: ( ( 'PostgreSQL' ) )
                    {
                    // InternalSecurityDsl.g:604:2: ( ( 'PostgreSQL' ) )
                    // InternalSecurityDsl.g:605:3: ( 'PostgreSQL' )
                    {
                     before(grammarAccess.getEDatabaseTypeAccess().getPostgreSQLEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:606:3: ( 'PostgreSQL' )
                    // InternalSecurityDsl.g:606:4: 'PostgreSQL'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getEDatabaseTypeAccess().getPostgreSQLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:610:2: ( ( 'Oracle' ) )
                    {
                    // InternalSecurityDsl.g:610:2: ( ( 'Oracle' ) )
                    // InternalSecurityDsl.g:611:3: ( 'Oracle' )
                    {
                     before(grammarAccess.getEDatabaseTypeAccess().getOracleEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:612:3: ( 'Oracle' )
                    // InternalSecurityDsl.g:612:4: 'Oracle'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getEDatabaseTypeAccess().getOracleEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:616:2: ( ( 'MySQL' ) )
                    {
                    // InternalSecurityDsl.g:616:2: ( ( 'MySQL' ) )
                    // InternalSecurityDsl.g:617:3: ( 'MySQL' )
                    {
                     before(grammarAccess.getEDatabaseTypeAccess().getMySQLEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:618:3: ( 'MySQL' )
                    // InternalSecurityDsl.g:618:4: 'MySQL'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getEDatabaseTypeAccess().getMySQLEnumLiteralDeclaration_2()); 

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


    // $ANTLR start "rule__EType__Alternatives"
    // InternalSecurityDsl.g:626:1: rule__EType__Alternatives : ( ( ( 'String' ) ) | ( ( 'Float' ) ) | ( ( 'Long' ) ) | ( ( 'Integer' ) ) | ( ( 'char' ) ) | ( ( 'Double' ) ) | ( ( 'DateTime' ) ) | ( ( 'Date' ) ) | ( ( 'int' ) ) );
    public final void rule__EType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:630:1: ( ( ( 'String' ) ) | ( ( 'Float' ) ) | ( ( 'Long' ) ) | ( ( 'Integer' ) ) | ( ( 'char' ) ) | ( ( 'Double' ) ) | ( ( 'DateTime' ) ) | ( ( 'Date' ) ) | ( ( 'int' ) ) )
            int alt4=9;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            case 17:
                {
                alt4=4;
                }
                break;
            case 18:
                {
                alt4=5;
                }
                break;
            case 19:
                {
                alt4=6;
                }
                break;
            case 20:
                {
                alt4=7;
                }
                break;
            case 21:
                {
                alt4=8;
                }
                break;
            case 22:
                {
                alt4=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSecurityDsl.g:631:2: ( ( 'String' ) )
                    {
                    // InternalSecurityDsl.g:631:2: ( ( 'String' ) )
                    // InternalSecurityDsl.g:632:3: ( 'String' )
                    {
                     before(grammarAccess.getETypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:633:3: ( 'String' )
                    // InternalSecurityDsl.g:633:4: 'String'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:637:2: ( ( 'Float' ) )
                    {
                    // InternalSecurityDsl.g:637:2: ( ( 'Float' ) )
                    // InternalSecurityDsl.g:638:3: ( 'Float' )
                    {
                     before(grammarAccess.getETypeAccess().getFloatEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:639:3: ( 'Float' )
                    // InternalSecurityDsl.g:639:4: 'Float'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getFloatEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:643:2: ( ( 'Long' ) )
                    {
                    // InternalSecurityDsl.g:643:2: ( ( 'Long' ) )
                    // InternalSecurityDsl.g:644:3: ( 'Long' )
                    {
                     before(grammarAccess.getETypeAccess().getLongEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:645:3: ( 'Long' )
                    // InternalSecurityDsl.g:645:4: 'Long'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getLongEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:649:2: ( ( 'Integer' ) )
                    {
                    // InternalSecurityDsl.g:649:2: ( ( 'Integer' ) )
                    // InternalSecurityDsl.g:650:3: ( 'Integer' )
                    {
                     before(grammarAccess.getETypeAccess().getIntegerEnumLiteralDeclaration_3()); 
                    // InternalSecurityDsl.g:651:3: ( 'Integer' )
                    // InternalSecurityDsl.g:651:4: 'Integer'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getIntegerEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSecurityDsl.g:655:2: ( ( 'char' ) )
                    {
                    // InternalSecurityDsl.g:655:2: ( ( 'char' ) )
                    // InternalSecurityDsl.g:656:3: ( 'char' )
                    {
                     before(grammarAccess.getETypeAccess().getCharEnumLiteralDeclaration_4()); 
                    // InternalSecurityDsl.g:657:3: ( 'char' )
                    // InternalSecurityDsl.g:657:4: 'char'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getCharEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSecurityDsl.g:661:2: ( ( 'Double' ) )
                    {
                    // InternalSecurityDsl.g:661:2: ( ( 'Double' ) )
                    // InternalSecurityDsl.g:662:3: ( 'Double' )
                    {
                     before(grammarAccess.getETypeAccess().getDoubleEnumLiteralDeclaration_5()); 
                    // InternalSecurityDsl.g:663:3: ( 'Double' )
                    // InternalSecurityDsl.g:663:4: 'Double'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getDoubleEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSecurityDsl.g:667:2: ( ( 'DateTime' ) )
                    {
                    // InternalSecurityDsl.g:667:2: ( ( 'DateTime' ) )
                    // InternalSecurityDsl.g:668:3: ( 'DateTime' )
                    {
                     before(grammarAccess.getETypeAccess().getDateTimeEnumLiteralDeclaration_6()); 
                    // InternalSecurityDsl.g:669:3: ( 'DateTime' )
                    // InternalSecurityDsl.g:669:4: 'DateTime'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getDateTimeEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSecurityDsl.g:673:2: ( ( 'Date' ) )
                    {
                    // InternalSecurityDsl.g:673:2: ( ( 'Date' ) )
                    // InternalSecurityDsl.g:674:3: ( 'Date' )
                    {
                     before(grammarAccess.getETypeAccess().getDateEnumLiteralDeclaration_7()); 
                    // InternalSecurityDsl.g:675:3: ( 'Date' )
                    // InternalSecurityDsl.g:675:4: 'Date'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getDateEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSecurityDsl.g:679:2: ( ( 'int' ) )
                    {
                    // InternalSecurityDsl.g:679:2: ( ( 'int' ) )
                    // InternalSecurityDsl.g:680:3: ( 'int' )
                    {
                     before(grammarAccess.getETypeAccess().getIntEnumLiteralDeclaration_8()); 
                    // InternalSecurityDsl.g:681:3: ( 'int' )
                    // InternalSecurityDsl.g:681:4: 'int'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getIntEnumLiteralDeclaration_8()); 

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
    // InternalSecurityDsl.g:689:1: rule__EEndpointMethod__Alternatives : ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) );
    public final void rule__EEndpointMethod__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:693:1: ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt5=1;
                }
                break;
            case 24:
                {
                alt5=2;
                }
                break;
            case 25:
                {
                alt5=3;
                }
                break;
            case 26:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSecurityDsl.g:694:2: ( ( 'GET' ) )
                    {
                    // InternalSecurityDsl.g:694:2: ( ( 'GET' ) )
                    // InternalSecurityDsl.g:695:3: ( 'GET' )
                    {
                     before(grammarAccess.getEEndpointMethodAccess().getGETEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:696:3: ( 'GET' )
                    // InternalSecurityDsl.g:696:4: 'GET'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointMethodAccess().getGETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:700:2: ( ( 'POST' ) )
                    {
                    // InternalSecurityDsl.g:700:2: ( ( 'POST' ) )
                    // InternalSecurityDsl.g:701:3: ( 'POST' )
                    {
                     before(grammarAccess.getEEndpointMethodAccess().getPOSTEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:702:3: ( 'POST' )
                    // InternalSecurityDsl.g:702:4: 'POST'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointMethodAccess().getPOSTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:706:2: ( ( 'PUT' ) )
                    {
                    // InternalSecurityDsl.g:706:2: ( ( 'PUT' ) )
                    // InternalSecurityDsl.g:707:3: ( 'PUT' )
                    {
                     before(grammarAccess.getEEndpointMethodAccess().getPUTEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:708:3: ( 'PUT' )
                    // InternalSecurityDsl.g:708:4: 'PUT'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointMethodAccess().getPUTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:712:2: ( ( 'DELETE' ) )
                    {
                    // InternalSecurityDsl.g:712:2: ( ( 'DELETE' ) )
                    // InternalSecurityDsl.g:713:3: ( 'DELETE' )
                    {
                     before(grammarAccess.getEEndpointMethodAccess().getDELETEEnumLiteralDeclaration_3()); 
                    // InternalSecurityDsl.g:714:3: ( 'DELETE' )
                    // InternalSecurityDsl.g:714:4: 'DELETE'
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


    // $ANTLR start "rule__EEndpointType__Alternatives"
    // InternalSecurityDsl.g:722:1: rule__EEndpointType__Alternatives : ( ( ( 'REGISTRATION' ) ) | ( ( 'LOGIN' ) ) | ( ( 'LOGOUT' ) ) | ( ( 'OTHER' ) ) );
    public final void rule__EEndpointType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:726:1: ( ( ( 'REGISTRATION' ) ) | ( ( 'LOGIN' ) ) | ( ( 'LOGOUT' ) ) | ( ( 'OTHER' ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt6=1;
                }
                break;
            case 28:
                {
                alt6=2;
                }
                break;
            case 29:
                {
                alt6=3;
                }
                break;
            case 30:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSecurityDsl.g:727:2: ( ( 'REGISTRATION' ) )
                    {
                    // InternalSecurityDsl.g:727:2: ( ( 'REGISTRATION' ) )
                    // InternalSecurityDsl.g:728:3: ( 'REGISTRATION' )
                    {
                     before(grammarAccess.getEEndpointTypeAccess().getREGISTRATIONEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:729:3: ( 'REGISTRATION' )
                    // InternalSecurityDsl.g:729:4: 'REGISTRATION'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointTypeAccess().getREGISTRATIONEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:733:2: ( ( 'LOGIN' ) )
                    {
                    // InternalSecurityDsl.g:733:2: ( ( 'LOGIN' ) )
                    // InternalSecurityDsl.g:734:3: ( 'LOGIN' )
                    {
                     before(grammarAccess.getEEndpointTypeAccess().getLOGINEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:735:3: ( 'LOGIN' )
                    // InternalSecurityDsl.g:735:4: 'LOGIN'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointTypeAccess().getLOGINEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:739:2: ( ( 'LOGOUT' ) )
                    {
                    // InternalSecurityDsl.g:739:2: ( ( 'LOGOUT' ) )
                    // InternalSecurityDsl.g:740:3: ( 'LOGOUT' )
                    {
                     before(grammarAccess.getEEndpointTypeAccess().getLOGOUTEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:741:3: ( 'LOGOUT' )
                    // InternalSecurityDsl.g:741:4: 'LOGOUT'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointTypeAccess().getLOGOUTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:745:2: ( ( 'OTHER' ) )
                    {
                    // InternalSecurityDsl.g:745:2: ( ( 'OTHER' ) )
                    // InternalSecurityDsl.g:746:3: ( 'OTHER' )
                    {
                     before(grammarAccess.getEEndpointTypeAccess().getOTHEREnumLiteralDeclaration_3()); 
                    // InternalSecurityDsl.g:747:3: ( 'OTHER' )
                    // InternalSecurityDsl.g:747:4: 'OTHER'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointTypeAccess().getOTHEREnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__EEndpointType__Alternatives"


    // $ANTLR start "rule__EClaimType__Alternatives"
    // InternalSecurityDsl.g:755:1: rule__EClaimType__Alternatives : ( ( ( 'PRIVATE' ) ) | ( ( 'PUBLIC' ) ) | ( ( 'REGISTERED' ) ) );
    public final void rule__EClaimType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:759:1: ( ( ( 'PRIVATE' ) ) | ( ( 'PUBLIC' ) ) | ( ( 'REGISTERED' ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt7=1;
                }
                break;
            case 32:
                {
                alt7=2;
                }
                break;
            case 33:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSecurityDsl.g:760:2: ( ( 'PRIVATE' ) )
                    {
                    // InternalSecurityDsl.g:760:2: ( ( 'PRIVATE' ) )
                    // InternalSecurityDsl.g:761:3: ( 'PRIVATE' )
                    {
                     before(grammarAccess.getEClaimTypeAccess().getPRIVATEEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:762:3: ( 'PRIVATE' )
                    // InternalSecurityDsl.g:762:4: 'PRIVATE'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getEClaimTypeAccess().getPRIVATEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:766:2: ( ( 'PUBLIC' ) )
                    {
                    // InternalSecurityDsl.g:766:2: ( ( 'PUBLIC' ) )
                    // InternalSecurityDsl.g:767:3: ( 'PUBLIC' )
                    {
                     before(grammarAccess.getEClaimTypeAccess().getPUBLICEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:768:3: ( 'PUBLIC' )
                    // InternalSecurityDsl.g:768:4: 'PUBLIC'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getEClaimTypeAccess().getPUBLICEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:772:2: ( ( 'REGISTERED' ) )
                    {
                    // InternalSecurityDsl.g:772:2: ( ( 'REGISTERED' ) )
                    // InternalSecurityDsl.g:773:3: ( 'REGISTERED' )
                    {
                     before(grammarAccess.getEClaimTypeAccess().getREGISTEREDEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:774:3: ( 'REGISTERED' )
                    // InternalSecurityDsl.g:774:4: 'REGISTERED'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getEClaimTypeAccess().getREGISTEREDEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__EClaimType__Alternatives"


    // $ANTLR start "rule__Application__Group__0"
    // InternalSecurityDsl.g:782:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:786:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // InternalSecurityDsl.g:787:2: rule__Application__Group__0__Impl rule__Application__Group__1
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
    // InternalSecurityDsl.g:794:1: rule__Application__Group__0__Impl : ( () ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:798:1: ( ( () ) )
            // InternalSecurityDsl.g:799:1: ( () )
            {
            // InternalSecurityDsl.g:799:1: ( () )
            // InternalSecurityDsl.g:800:2: ()
            {
             before(grammarAccess.getApplicationAccess().getApplicationAction_0()); 
            // InternalSecurityDsl.g:801:2: ()
            // InternalSecurityDsl.g:801:3: 
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
    // InternalSecurityDsl.g:809:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:813:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // InternalSecurityDsl.g:814:2: rule__Application__Group__1__Impl rule__Application__Group__2
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
    // InternalSecurityDsl.g:821:1: rule__Application__Group__1__Impl : ( 'Application' ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:825:1: ( ( 'Application' ) )
            // InternalSecurityDsl.g:826:1: ( 'Application' )
            {
            // InternalSecurityDsl.g:826:1: ( 'Application' )
            // InternalSecurityDsl.g:827:2: 'Application'
            {
             before(grammarAccess.getApplicationAccess().getApplicationKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSecurityDsl.g:836:1: rule__Application__Group__2 : rule__Application__Group__2__Impl rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:840:1: ( rule__Application__Group__2__Impl rule__Application__Group__3 )
            // InternalSecurityDsl.g:841:2: rule__Application__Group__2__Impl rule__Application__Group__3
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
    // InternalSecurityDsl.g:848:1: rule__Application__Group__2__Impl : ( ( rule__Application__NameAssignment_2 ) ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:852:1: ( ( ( rule__Application__NameAssignment_2 ) ) )
            // InternalSecurityDsl.g:853:1: ( ( rule__Application__NameAssignment_2 ) )
            {
            // InternalSecurityDsl.g:853:1: ( ( rule__Application__NameAssignment_2 ) )
            // InternalSecurityDsl.g:854:2: ( rule__Application__NameAssignment_2 )
            {
             before(grammarAccess.getApplicationAccess().getNameAssignment_2()); 
            // InternalSecurityDsl.g:855:2: ( rule__Application__NameAssignment_2 )
            // InternalSecurityDsl.g:855:3: rule__Application__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Application__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getNameAssignment_2()); 

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
    // InternalSecurityDsl.g:863:1: rule__Application__Group__3 : rule__Application__Group__3__Impl rule__Application__Group__4 ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:867:1: ( rule__Application__Group__3__Impl rule__Application__Group__4 )
            // InternalSecurityDsl.g:868:2: rule__Application__Group__3__Impl rule__Application__Group__4
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
    // InternalSecurityDsl.g:875:1: rule__Application__Group__3__Impl : ( '{' ) ;
    public final void rule__Application__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:879:1: ( ( '{' ) )
            // InternalSecurityDsl.g:880:1: ( '{' )
            {
            // InternalSecurityDsl.g:880:1: ( '{' )
            // InternalSecurityDsl.g:881:2: '{'
            {
             before(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_3()); 

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
    // InternalSecurityDsl.g:890:1: rule__Application__Group__4 : rule__Application__Group__4__Impl rule__Application__Group__5 ;
    public final void rule__Application__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:894:1: ( rule__Application__Group__4__Impl rule__Application__Group__5 )
            // InternalSecurityDsl.g:895:2: rule__Application__Group__4__Impl rule__Application__Group__5
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
    // InternalSecurityDsl.g:902:1: rule__Application__Group__4__Impl : ( ( rule__Application__Group_4__0 )? ) ;
    public final void rule__Application__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:906:1: ( ( ( rule__Application__Group_4__0 )? ) )
            // InternalSecurityDsl.g:907:1: ( ( rule__Application__Group_4__0 )? )
            {
            // InternalSecurityDsl.g:907:1: ( ( rule__Application__Group_4__0 )? )
            // InternalSecurityDsl.g:908:2: ( rule__Application__Group_4__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_4()); 
            // InternalSecurityDsl.g:909:2: ( rule__Application__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==37) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSecurityDsl.g:909:3: rule__Application__Group_4__0
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
    // InternalSecurityDsl.g:917:1: rule__Application__Group__5 : rule__Application__Group__5__Impl rule__Application__Group__6 ;
    public final void rule__Application__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:921:1: ( rule__Application__Group__5__Impl rule__Application__Group__6 )
            // InternalSecurityDsl.g:922:2: rule__Application__Group__5__Impl rule__Application__Group__6
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
    // InternalSecurityDsl.g:929:1: rule__Application__Group__5__Impl : ( ( rule__Application__Group_5__0 )? ) ;
    public final void rule__Application__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:933:1: ( ( ( rule__Application__Group_5__0 )? ) )
            // InternalSecurityDsl.g:934:1: ( ( rule__Application__Group_5__0 )? )
            {
            // InternalSecurityDsl.g:934:1: ( ( rule__Application__Group_5__0 )? )
            // InternalSecurityDsl.g:935:2: ( rule__Application__Group_5__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_5()); 
            // InternalSecurityDsl.g:936:2: ( rule__Application__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==38) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSecurityDsl.g:936:3: rule__Application__Group_5__0
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
    // InternalSecurityDsl.g:944:1: rule__Application__Group__6 : rule__Application__Group__6__Impl rule__Application__Group__7 ;
    public final void rule__Application__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:948:1: ( rule__Application__Group__6__Impl rule__Application__Group__7 )
            // InternalSecurityDsl.g:949:2: rule__Application__Group__6__Impl rule__Application__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Application__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__7();

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
    // InternalSecurityDsl.g:956:1: rule__Application__Group__6__Impl : ( ( rule__Application__Group_6__0 )? ) ;
    public final void rule__Application__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:960:1: ( ( ( rule__Application__Group_6__0 )? ) )
            // InternalSecurityDsl.g:961:1: ( ( rule__Application__Group_6__0 )? )
            {
            // InternalSecurityDsl.g:961:1: ( ( rule__Application__Group_6__0 )? )
            // InternalSecurityDsl.g:962:2: ( rule__Application__Group_6__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_6()); 
            // InternalSecurityDsl.g:963:2: ( rule__Application__Group_6__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==39) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSecurityDsl.g:963:3: rule__Application__Group_6__0
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


    // $ANTLR start "rule__Application__Group__7"
    // InternalSecurityDsl.g:971:1: rule__Application__Group__7 : rule__Application__Group__7__Impl rule__Application__Group__8 ;
    public final void rule__Application__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:975:1: ( rule__Application__Group__7__Impl rule__Application__Group__8 )
            // InternalSecurityDsl.g:976:2: rule__Application__Group__7__Impl rule__Application__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__Application__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__8();

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
    // $ANTLR end "rule__Application__Group__7"


    // $ANTLR start "rule__Application__Group__7__Impl"
    // InternalSecurityDsl.g:983:1: rule__Application__Group__7__Impl : ( ( rule__Application__Group_7__0 )? ) ;
    public final void rule__Application__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:987:1: ( ( ( rule__Application__Group_7__0 )? ) )
            // InternalSecurityDsl.g:988:1: ( ( rule__Application__Group_7__0 )? )
            {
            // InternalSecurityDsl.g:988:1: ( ( rule__Application__Group_7__0 )? )
            // InternalSecurityDsl.g:989:2: ( rule__Application__Group_7__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_7()); 
            // InternalSecurityDsl.g:990:2: ( rule__Application__Group_7__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==40) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSecurityDsl.g:990:3: rule__Application__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Application__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Application__Group__7__Impl"


    // $ANTLR start "rule__Application__Group__8"
    // InternalSecurityDsl.g:998:1: rule__Application__Group__8 : rule__Application__Group__8__Impl rule__Application__Group__9 ;
    public final void rule__Application__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1002:1: ( rule__Application__Group__8__Impl rule__Application__Group__9 )
            // InternalSecurityDsl.g:1003:2: rule__Application__Group__8__Impl rule__Application__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__Application__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__9();

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
    // $ANTLR end "rule__Application__Group__8"


    // $ANTLR start "rule__Application__Group__8__Impl"
    // InternalSecurityDsl.g:1010:1: rule__Application__Group__8__Impl : ( ( rule__Application__Group_8__0 )? ) ;
    public final void rule__Application__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1014:1: ( ( ( rule__Application__Group_8__0 )? ) )
            // InternalSecurityDsl.g:1015:1: ( ( rule__Application__Group_8__0 )? )
            {
            // InternalSecurityDsl.g:1015:1: ( ( rule__Application__Group_8__0 )? )
            // InternalSecurityDsl.g:1016:2: ( rule__Application__Group_8__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_8()); 
            // InternalSecurityDsl.g:1017:2: ( rule__Application__Group_8__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==41) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSecurityDsl.g:1017:3: rule__Application__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Application__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationAccess().getGroup_8()); 

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
    // $ANTLR end "rule__Application__Group__8__Impl"


    // $ANTLR start "rule__Application__Group__9"
    // InternalSecurityDsl.g:1025:1: rule__Application__Group__9 : rule__Application__Group__9__Impl rule__Application__Group__10 ;
    public final void rule__Application__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1029:1: ( rule__Application__Group__9__Impl rule__Application__Group__10 )
            // InternalSecurityDsl.g:1030:2: rule__Application__Group__9__Impl rule__Application__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__Application__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__10();

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
    // $ANTLR end "rule__Application__Group__9"


    // $ANTLR start "rule__Application__Group__9__Impl"
    // InternalSecurityDsl.g:1037:1: rule__Application__Group__9__Impl : ( ( rule__Application__Group_9__0 )? ) ;
    public final void rule__Application__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1041:1: ( ( ( rule__Application__Group_9__0 )? ) )
            // InternalSecurityDsl.g:1042:1: ( ( rule__Application__Group_9__0 )? )
            {
            // InternalSecurityDsl.g:1042:1: ( ( rule__Application__Group_9__0 )? )
            // InternalSecurityDsl.g:1043:2: ( rule__Application__Group_9__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_9()); 
            // InternalSecurityDsl.g:1044:2: ( rule__Application__Group_9__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==42) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSecurityDsl.g:1044:3: rule__Application__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Application__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Application__Group__9__Impl"


    // $ANTLR start "rule__Application__Group__10"
    // InternalSecurityDsl.g:1052:1: rule__Application__Group__10 : rule__Application__Group__10__Impl rule__Application__Group__11 ;
    public final void rule__Application__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1056:1: ( rule__Application__Group__10__Impl rule__Application__Group__11 )
            // InternalSecurityDsl.g:1057:2: rule__Application__Group__10__Impl rule__Application__Group__11
            {
            pushFollow(FOLLOW_6);
            rule__Application__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__11();

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
    // $ANTLR end "rule__Application__Group__10"


    // $ANTLR start "rule__Application__Group__10__Impl"
    // InternalSecurityDsl.g:1064:1: rule__Application__Group__10__Impl : ( ( rule__Application__Group_10__0 )? ) ;
    public final void rule__Application__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1068:1: ( ( ( rule__Application__Group_10__0 )? ) )
            // InternalSecurityDsl.g:1069:1: ( ( rule__Application__Group_10__0 )? )
            {
            // InternalSecurityDsl.g:1069:1: ( ( rule__Application__Group_10__0 )? )
            // InternalSecurityDsl.g:1070:2: ( rule__Application__Group_10__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_10()); 
            // InternalSecurityDsl.g:1071:2: ( rule__Application__Group_10__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==43) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSecurityDsl.g:1071:3: rule__Application__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Application__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationAccess().getGroup_10()); 

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
    // $ANTLR end "rule__Application__Group__10__Impl"


    // $ANTLR start "rule__Application__Group__11"
    // InternalSecurityDsl.g:1079:1: rule__Application__Group__11 : rule__Application__Group__11__Impl rule__Application__Group__12 ;
    public final void rule__Application__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1083:1: ( rule__Application__Group__11__Impl rule__Application__Group__12 )
            // InternalSecurityDsl.g:1084:2: rule__Application__Group__11__Impl rule__Application__Group__12
            {
            pushFollow(FOLLOW_6);
            rule__Application__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__12();

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
    // $ANTLR end "rule__Application__Group__11"


    // $ANTLR start "rule__Application__Group__11__Impl"
    // InternalSecurityDsl.g:1091:1: rule__Application__Group__11__Impl : ( ( rule__Application__Group_11__0 )? ) ;
    public final void rule__Application__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1095:1: ( ( ( rule__Application__Group_11__0 )? ) )
            // InternalSecurityDsl.g:1096:1: ( ( rule__Application__Group_11__0 )? )
            {
            // InternalSecurityDsl.g:1096:1: ( ( rule__Application__Group_11__0 )? )
            // InternalSecurityDsl.g:1097:2: ( rule__Application__Group_11__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_11()); 
            // InternalSecurityDsl.g:1098:2: ( rule__Application__Group_11__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==44) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSecurityDsl.g:1098:3: rule__Application__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Application__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationAccess().getGroup_11()); 

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
    // $ANTLR end "rule__Application__Group__11__Impl"


    // $ANTLR start "rule__Application__Group__12"
    // InternalSecurityDsl.g:1106:1: rule__Application__Group__12 : rule__Application__Group__12__Impl rule__Application__Group__13 ;
    public final void rule__Application__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1110:1: ( rule__Application__Group__12__Impl rule__Application__Group__13 )
            // InternalSecurityDsl.g:1111:2: rule__Application__Group__12__Impl rule__Application__Group__13
            {
            pushFollow(FOLLOW_6);
            rule__Application__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__13();

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
    // $ANTLR end "rule__Application__Group__12"


    // $ANTLR start "rule__Application__Group__12__Impl"
    // InternalSecurityDsl.g:1118:1: rule__Application__Group__12__Impl : ( ( rule__Application__Group_12__0 )? ) ;
    public final void rule__Application__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1122:1: ( ( ( rule__Application__Group_12__0 )? ) )
            // InternalSecurityDsl.g:1123:1: ( ( rule__Application__Group_12__0 )? )
            {
            // InternalSecurityDsl.g:1123:1: ( ( rule__Application__Group_12__0 )? )
            // InternalSecurityDsl.g:1124:2: ( rule__Application__Group_12__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_12()); 
            // InternalSecurityDsl.g:1125:2: ( rule__Application__Group_12__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==46) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSecurityDsl.g:1125:3: rule__Application__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Application__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationAccess().getGroup_12()); 

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
    // $ANTLR end "rule__Application__Group__12__Impl"


    // $ANTLR start "rule__Application__Group__13"
    // InternalSecurityDsl.g:1133:1: rule__Application__Group__13 : rule__Application__Group__13__Impl rule__Application__Group__14 ;
    public final void rule__Application__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1137:1: ( rule__Application__Group__13__Impl rule__Application__Group__14 )
            // InternalSecurityDsl.g:1138:2: rule__Application__Group__13__Impl rule__Application__Group__14
            {
            pushFollow(FOLLOW_6);
            rule__Application__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__14();

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
    // $ANTLR end "rule__Application__Group__13"


    // $ANTLR start "rule__Application__Group__13__Impl"
    // InternalSecurityDsl.g:1145:1: rule__Application__Group__13__Impl : ( ( rule__Application__Group_13__0 )? ) ;
    public final void rule__Application__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1149:1: ( ( ( rule__Application__Group_13__0 )? ) )
            // InternalSecurityDsl.g:1150:1: ( ( rule__Application__Group_13__0 )? )
            {
            // InternalSecurityDsl.g:1150:1: ( ( rule__Application__Group_13__0 )? )
            // InternalSecurityDsl.g:1151:2: ( rule__Application__Group_13__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_13()); 
            // InternalSecurityDsl.g:1152:2: ( rule__Application__Group_13__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==47) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSecurityDsl.g:1152:3: rule__Application__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Application__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationAccess().getGroup_13()); 

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
    // $ANTLR end "rule__Application__Group__13__Impl"


    // $ANTLR start "rule__Application__Group__14"
    // InternalSecurityDsl.g:1160:1: rule__Application__Group__14 : rule__Application__Group__14__Impl ;
    public final void rule__Application__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1164:1: ( rule__Application__Group__14__Impl )
            // InternalSecurityDsl.g:1165:2: rule__Application__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group__14__Impl();

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
    // $ANTLR end "rule__Application__Group__14"


    // $ANTLR start "rule__Application__Group__14__Impl"
    // InternalSecurityDsl.g:1171:1: rule__Application__Group__14__Impl : ( '}' ) ;
    public final void rule__Application__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1175:1: ( ( '}' ) )
            // InternalSecurityDsl.g:1176:1: ( '}' )
            {
            // InternalSecurityDsl.g:1176:1: ( '}' )
            // InternalSecurityDsl.g:1177:2: '}'
            {
             before(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_14()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_14()); 

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
    // $ANTLR end "rule__Application__Group__14__Impl"


    // $ANTLR start "rule__Application__Group_4__0"
    // InternalSecurityDsl.g:1187:1: rule__Application__Group_4__0 : rule__Application__Group_4__0__Impl rule__Application__Group_4__1 ;
    public final void rule__Application__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1191:1: ( rule__Application__Group_4__0__Impl rule__Application__Group_4__1 )
            // InternalSecurityDsl.g:1192:2: rule__Application__Group_4__0__Impl rule__Application__Group_4__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSecurityDsl.g:1199:1: rule__Application__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__Application__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1203:1: ( ( 'description' ) )
            // InternalSecurityDsl.g:1204:1: ( 'description' )
            {
            // InternalSecurityDsl.g:1204:1: ( 'description' )
            // InternalSecurityDsl.g:1205:2: 'description'
            {
             before(grammarAccess.getApplicationAccess().getDescriptionKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSecurityDsl.g:1214:1: rule__Application__Group_4__1 : rule__Application__Group_4__1__Impl ;
    public final void rule__Application__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1218:1: ( rule__Application__Group_4__1__Impl )
            // InternalSecurityDsl.g:1219:2: rule__Application__Group_4__1__Impl
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
    // InternalSecurityDsl.g:1225:1: rule__Application__Group_4__1__Impl : ( ( rule__Application__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Application__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1229:1: ( ( ( rule__Application__DescriptionAssignment_4_1 ) ) )
            // InternalSecurityDsl.g:1230:1: ( ( rule__Application__DescriptionAssignment_4_1 ) )
            {
            // InternalSecurityDsl.g:1230:1: ( ( rule__Application__DescriptionAssignment_4_1 ) )
            // InternalSecurityDsl.g:1231:2: ( rule__Application__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getApplicationAccess().getDescriptionAssignment_4_1()); 
            // InternalSecurityDsl.g:1232:2: ( rule__Application__DescriptionAssignment_4_1 )
            // InternalSecurityDsl.g:1232:3: rule__Application__DescriptionAssignment_4_1
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
    // InternalSecurityDsl.g:1241:1: rule__Application__Group_5__0 : rule__Application__Group_5__0__Impl rule__Application__Group_5__1 ;
    public final void rule__Application__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1245:1: ( rule__Application__Group_5__0__Impl rule__Application__Group_5__1 )
            // InternalSecurityDsl.g:1246:2: rule__Application__Group_5__0__Impl rule__Application__Group_5__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSecurityDsl.g:1253:1: rule__Application__Group_5__0__Impl : ( 'group' ) ;
    public final void rule__Application__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1257:1: ( ( 'group' ) )
            // InternalSecurityDsl.g:1258:1: ( 'group' )
            {
            // InternalSecurityDsl.g:1258:1: ( 'group' )
            // InternalSecurityDsl.g:1259:2: 'group'
            {
             before(grammarAccess.getApplicationAccess().getGroupKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getGroupKeyword_5_0()); 

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
    // InternalSecurityDsl.g:1268:1: rule__Application__Group_5__1 : rule__Application__Group_5__1__Impl ;
    public final void rule__Application__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1272:1: ( rule__Application__Group_5__1__Impl )
            // InternalSecurityDsl.g:1273:2: rule__Application__Group_5__1__Impl
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
    // InternalSecurityDsl.g:1279:1: rule__Application__Group_5__1__Impl : ( ( rule__Application__GroupAssignment_5_1 ) ) ;
    public final void rule__Application__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1283:1: ( ( ( rule__Application__GroupAssignment_5_1 ) ) )
            // InternalSecurityDsl.g:1284:1: ( ( rule__Application__GroupAssignment_5_1 ) )
            {
            // InternalSecurityDsl.g:1284:1: ( ( rule__Application__GroupAssignment_5_1 ) )
            // InternalSecurityDsl.g:1285:2: ( rule__Application__GroupAssignment_5_1 )
            {
             before(grammarAccess.getApplicationAccess().getGroupAssignment_5_1()); 
            // InternalSecurityDsl.g:1286:2: ( rule__Application__GroupAssignment_5_1 )
            // InternalSecurityDsl.g:1286:3: rule__Application__GroupAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__GroupAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getGroupAssignment_5_1()); 

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
    // InternalSecurityDsl.g:1295:1: rule__Application__Group_6__0 : rule__Application__Group_6__0__Impl rule__Application__Group_6__1 ;
    public final void rule__Application__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1299:1: ( rule__Application__Group_6__0__Impl rule__Application__Group_6__1 )
            // InternalSecurityDsl.g:1300:2: rule__Application__Group_6__0__Impl rule__Application__Group_6__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSecurityDsl.g:1307:1: rule__Application__Group_6__0__Impl : ( 'artifact' ) ;
    public final void rule__Application__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1311:1: ( ( 'artifact' ) )
            // InternalSecurityDsl.g:1312:1: ( 'artifact' )
            {
            // InternalSecurityDsl.g:1312:1: ( 'artifact' )
            // InternalSecurityDsl.g:1313:2: 'artifact'
            {
             before(grammarAccess.getApplicationAccess().getArtifactKeyword_6_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getArtifactKeyword_6_0()); 

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
    // InternalSecurityDsl.g:1322:1: rule__Application__Group_6__1 : rule__Application__Group_6__1__Impl ;
    public final void rule__Application__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1326:1: ( rule__Application__Group_6__1__Impl )
            // InternalSecurityDsl.g:1327:2: rule__Application__Group_6__1__Impl
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
    // InternalSecurityDsl.g:1333:1: rule__Application__Group_6__1__Impl : ( ( rule__Application__ArtifactAssignment_6_1 ) ) ;
    public final void rule__Application__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1337:1: ( ( ( rule__Application__ArtifactAssignment_6_1 ) ) )
            // InternalSecurityDsl.g:1338:1: ( ( rule__Application__ArtifactAssignment_6_1 ) )
            {
            // InternalSecurityDsl.g:1338:1: ( ( rule__Application__ArtifactAssignment_6_1 ) )
            // InternalSecurityDsl.g:1339:2: ( rule__Application__ArtifactAssignment_6_1 )
            {
             before(grammarAccess.getApplicationAccess().getArtifactAssignment_6_1()); 
            // InternalSecurityDsl.g:1340:2: ( rule__Application__ArtifactAssignment_6_1 )
            // InternalSecurityDsl.g:1340:3: rule__Application__ArtifactAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__ArtifactAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getArtifactAssignment_6_1()); 

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


    // $ANTLR start "rule__Application__Group_7__0"
    // InternalSecurityDsl.g:1349:1: rule__Application__Group_7__0 : rule__Application__Group_7__0__Impl rule__Application__Group_7__1 ;
    public final void rule__Application__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1353:1: ( rule__Application__Group_7__0__Impl rule__Application__Group_7__1 )
            // InternalSecurityDsl.g:1354:2: rule__Application__Group_7__0__Impl rule__Application__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__Application__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_7__1();

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
    // $ANTLR end "rule__Application__Group_7__0"


    // $ANTLR start "rule__Application__Group_7__0__Impl"
    // InternalSecurityDsl.g:1361:1: rule__Application__Group_7__0__Impl : ( 'packageName' ) ;
    public final void rule__Application__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1365:1: ( ( 'packageName' ) )
            // InternalSecurityDsl.g:1366:1: ( 'packageName' )
            {
            // InternalSecurityDsl.g:1366:1: ( 'packageName' )
            // InternalSecurityDsl.g:1367:2: 'packageName'
            {
             before(grammarAccess.getApplicationAccess().getPackageNameKeyword_7_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getPackageNameKeyword_7_0()); 

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
    // $ANTLR end "rule__Application__Group_7__0__Impl"


    // $ANTLR start "rule__Application__Group_7__1"
    // InternalSecurityDsl.g:1376:1: rule__Application__Group_7__1 : rule__Application__Group_7__1__Impl ;
    public final void rule__Application__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1380:1: ( rule__Application__Group_7__1__Impl )
            // InternalSecurityDsl.g:1381:2: rule__Application__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_7__1__Impl();

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
    // $ANTLR end "rule__Application__Group_7__1"


    // $ANTLR start "rule__Application__Group_7__1__Impl"
    // InternalSecurityDsl.g:1387:1: rule__Application__Group_7__1__Impl : ( ( rule__Application__PackageNameAssignment_7_1 ) ) ;
    public final void rule__Application__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1391:1: ( ( ( rule__Application__PackageNameAssignment_7_1 ) ) )
            // InternalSecurityDsl.g:1392:1: ( ( rule__Application__PackageNameAssignment_7_1 ) )
            {
            // InternalSecurityDsl.g:1392:1: ( ( rule__Application__PackageNameAssignment_7_1 ) )
            // InternalSecurityDsl.g:1393:2: ( rule__Application__PackageNameAssignment_7_1 )
            {
             before(grammarAccess.getApplicationAccess().getPackageNameAssignment_7_1()); 
            // InternalSecurityDsl.g:1394:2: ( rule__Application__PackageNameAssignment_7_1 )
            // InternalSecurityDsl.g:1394:3: rule__Application__PackageNameAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__PackageNameAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getPackageNameAssignment_7_1()); 

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
    // $ANTLR end "rule__Application__Group_7__1__Impl"


    // $ANTLR start "rule__Application__Group_8__0"
    // InternalSecurityDsl.g:1403:1: rule__Application__Group_8__0 : rule__Application__Group_8__0__Impl rule__Application__Group_8__1 ;
    public final void rule__Application__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1407:1: ( rule__Application__Group_8__0__Impl rule__Application__Group_8__1 )
            // InternalSecurityDsl.g:1408:2: rule__Application__Group_8__0__Impl rule__Application__Group_8__1
            {
            pushFollow(FOLLOW_7);
            rule__Application__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_8__1();

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
    // $ANTLR end "rule__Application__Group_8__0"


    // $ANTLR start "rule__Application__Group_8__0__Impl"
    // InternalSecurityDsl.g:1415:1: rule__Application__Group_8__0__Impl : ( 'port' ) ;
    public final void rule__Application__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1419:1: ( ( 'port' ) )
            // InternalSecurityDsl.g:1420:1: ( 'port' )
            {
            // InternalSecurityDsl.g:1420:1: ( 'port' )
            // InternalSecurityDsl.g:1421:2: 'port'
            {
             before(grammarAccess.getApplicationAccess().getPortKeyword_8_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getPortKeyword_8_0()); 

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
    // $ANTLR end "rule__Application__Group_8__0__Impl"


    // $ANTLR start "rule__Application__Group_8__1"
    // InternalSecurityDsl.g:1430:1: rule__Application__Group_8__1 : rule__Application__Group_8__1__Impl ;
    public final void rule__Application__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1434:1: ( rule__Application__Group_8__1__Impl )
            // InternalSecurityDsl.g:1435:2: rule__Application__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_8__1__Impl();

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
    // $ANTLR end "rule__Application__Group_8__1"


    // $ANTLR start "rule__Application__Group_8__1__Impl"
    // InternalSecurityDsl.g:1441:1: rule__Application__Group_8__1__Impl : ( ( rule__Application__PortAssignment_8_1 ) ) ;
    public final void rule__Application__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1445:1: ( ( ( rule__Application__PortAssignment_8_1 ) ) )
            // InternalSecurityDsl.g:1446:1: ( ( rule__Application__PortAssignment_8_1 ) )
            {
            // InternalSecurityDsl.g:1446:1: ( ( rule__Application__PortAssignment_8_1 ) )
            // InternalSecurityDsl.g:1447:2: ( rule__Application__PortAssignment_8_1 )
            {
             before(grammarAccess.getApplicationAccess().getPortAssignment_8_1()); 
            // InternalSecurityDsl.g:1448:2: ( rule__Application__PortAssignment_8_1 )
            // InternalSecurityDsl.g:1448:3: rule__Application__PortAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__PortAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getPortAssignment_8_1()); 

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
    // $ANTLR end "rule__Application__Group_8__1__Impl"


    // $ANTLR start "rule__Application__Group_9__0"
    // InternalSecurityDsl.g:1457:1: rule__Application__Group_9__0 : rule__Application__Group_9__0__Impl rule__Application__Group_9__1 ;
    public final void rule__Application__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1461:1: ( rule__Application__Group_9__0__Impl rule__Application__Group_9__1 )
            // InternalSecurityDsl.g:1462:2: rule__Application__Group_9__0__Impl rule__Application__Group_9__1
            {
            pushFollow(FOLLOW_4);
            rule__Application__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_9__1();

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
    // $ANTLR end "rule__Application__Group_9__0"


    // $ANTLR start "rule__Application__Group_9__0__Impl"
    // InternalSecurityDsl.g:1469:1: rule__Application__Group_9__0__Impl : ( 'hostname' ) ;
    public final void rule__Application__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1473:1: ( ( 'hostname' ) )
            // InternalSecurityDsl.g:1474:1: ( 'hostname' )
            {
            // InternalSecurityDsl.g:1474:1: ( 'hostname' )
            // InternalSecurityDsl.g:1475:2: 'hostname'
            {
             before(grammarAccess.getApplicationAccess().getHostnameKeyword_9_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getHostnameKeyword_9_0()); 

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
    // $ANTLR end "rule__Application__Group_9__0__Impl"


    // $ANTLR start "rule__Application__Group_9__1"
    // InternalSecurityDsl.g:1484:1: rule__Application__Group_9__1 : rule__Application__Group_9__1__Impl ;
    public final void rule__Application__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1488:1: ( rule__Application__Group_9__1__Impl )
            // InternalSecurityDsl.g:1489:2: rule__Application__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_9__1__Impl();

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
    // $ANTLR end "rule__Application__Group_9__1"


    // $ANTLR start "rule__Application__Group_9__1__Impl"
    // InternalSecurityDsl.g:1495:1: rule__Application__Group_9__1__Impl : ( ( rule__Application__HostnameAssignment_9_1 ) ) ;
    public final void rule__Application__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1499:1: ( ( ( rule__Application__HostnameAssignment_9_1 ) ) )
            // InternalSecurityDsl.g:1500:1: ( ( rule__Application__HostnameAssignment_9_1 ) )
            {
            // InternalSecurityDsl.g:1500:1: ( ( rule__Application__HostnameAssignment_9_1 ) )
            // InternalSecurityDsl.g:1501:2: ( rule__Application__HostnameAssignment_9_1 )
            {
             before(grammarAccess.getApplicationAccess().getHostnameAssignment_9_1()); 
            // InternalSecurityDsl.g:1502:2: ( rule__Application__HostnameAssignment_9_1 )
            // InternalSecurityDsl.g:1502:3: rule__Application__HostnameAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__HostnameAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getHostnameAssignment_9_1()); 

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
    // $ANTLR end "rule__Application__Group_9__1__Impl"


    // $ANTLR start "rule__Application__Group_10__0"
    // InternalSecurityDsl.g:1511:1: rule__Application__Group_10__0 : rule__Application__Group_10__0__Impl rule__Application__Group_10__1 ;
    public final void rule__Application__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1515:1: ( rule__Application__Group_10__0__Impl rule__Application__Group_10__1 )
            // InternalSecurityDsl.g:1516:2: rule__Application__Group_10__0__Impl rule__Application__Group_10__1
            {
            pushFollow(FOLLOW_8);
            rule__Application__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_10__1();

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
    // $ANTLR end "rule__Application__Group_10__0"


    // $ANTLR start "rule__Application__Group_10__0__Impl"
    // InternalSecurityDsl.g:1523:1: rule__Application__Group_10__0__Impl : ( 'app_database' ) ;
    public final void rule__Application__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1527:1: ( ( 'app_database' ) )
            // InternalSecurityDsl.g:1528:1: ( 'app_database' )
            {
            // InternalSecurityDsl.g:1528:1: ( 'app_database' )
            // InternalSecurityDsl.g:1529:2: 'app_database'
            {
             before(grammarAccess.getApplicationAccess().getApp_databaseKeyword_10_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getApp_databaseKeyword_10_0()); 

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
    // $ANTLR end "rule__Application__Group_10__0__Impl"


    // $ANTLR start "rule__Application__Group_10__1"
    // InternalSecurityDsl.g:1538:1: rule__Application__Group_10__1 : rule__Application__Group_10__1__Impl ;
    public final void rule__Application__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1542:1: ( rule__Application__Group_10__1__Impl )
            // InternalSecurityDsl.g:1543:2: rule__Application__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_10__1__Impl();

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
    // $ANTLR end "rule__Application__Group_10__1"


    // $ANTLR start "rule__Application__Group_10__1__Impl"
    // InternalSecurityDsl.g:1549:1: rule__Application__Group_10__1__Impl : ( ( rule__Application__App_databaseAssignment_10_1 ) ) ;
    public final void rule__Application__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1553:1: ( ( ( rule__Application__App_databaseAssignment_10_1 ) ) )
            // InternalSecurityDsl.g:1554:1: ( ( rule__Application__App_databaseAssignment_10_1 ) )
            {
            // InternalSecurityDsl.g:1554:1: ( ( rule__Application__App_databaseAssignment_10_1 ) )
            // InternalSecurityDsl.g:1555:2: ( rule__Application__App_databaseAssignment_10_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_databaseAssignment_10_1()); 
            // InternalSecurityDsl.g:1556:2: ( rule__Application__App_databaseAssignment_10_1 )
            // InternalSecurityDsl.g:1556:3: rule__Application__App_databaseAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__App_databaseAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getApp_databaseAssignment_10_1()); 

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
    // $ANTLR end "rule__Application__Group_10__1__Impl"


    // $ANTLR start "rule__Application__Group_11__0"
    // InternalSecurityDsl.g:1565:1: rule__Application__Group_11__0 : rule__Application__Group_11__0__Impl rule__Application__Group_11__1 ;
    public final void rule__Application__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1569:1: ( rule__Application__Group_11__0__Impl rule__Application__Group_11__1 )
            // InternalSecurityDsl.g:1570:2: rule__Application__Group_11__0__Impl rule__Application__Group_11__1
            {
            pushFollow(FOLLOW_5);
            rule__Application__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_11__1();

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
    // $ANTLR end "rule__Application__Group_11__0"


    // $ANTLR start "rule__Application__Group_11__0__Impl"
    // InternalSecurityDsl.g:1577:1: rule__Application__Group_11__0__Impl : ( 'app_models' ) ;
    public final void rule__Application__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1581:1: ( ( 'app_models' ) )
            // InternalSecurityDsl.g:1582:1: ( 'app_models' )
            {
            // InternalSecurityDsl.g:1582:1: ( 'app_models' )
            // InternalSecurityDsl.g:1583:2: 'app_models'
            {
             before(grammarAccess.getApplicationAccess().getApp_modelsKeyword_11_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getApp_modelsKeyword_11_0()); 

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
    // $ANTLR end "rule__Application__Group_11__0__Impl"


    // $ANTLR start "rule__Application__Group_11__1"
    // InternalSecurityDsl.g:1592:1: rule__Application__Group_11__1 : rule__Application__Group_11__1__Impl rule__Application__Group_11__2 ;
    public final void rule__Application__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1596:1: ( rule__Application__Group_11__1__Impl rule__Application__Group_11__2 )
            // InternalSecurityDsl.g:1597:2: rule__Application__Group_11__1__Impl rule__Application__Group_11__2
            {
            pushFollow(FOLLOW_9);
            rule__Application__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_11__2();

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
    // $ANTLR end "rule__Application__Group_11__1"


    // $ANTLR start "rule__Application__Group_11__1__Impl"
    // InternalSecurityDsl.g:1604:1: rule__Application__Group_11__1__Impl : ( '{' ) ;
    public final void rule__Application__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1608:1: ( ( '{' ) )
            // InternalSecurityDsl.g:1609:1: ( '{' )
            {
            // InternalSecurityDsl.g:1609:1: ( '{' )
            // InternalSecurityDsl.g:1610:2: '{'
            {
             before(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_11_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_11_1()); 

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
    // $ANTLR end "rule__Application__Group_11__1__Impl"


    // $ANTLR start "rule__Application__Group_11__2"
    // InternalSecurityDsl.g:1619:1: rule__Application__Group_11__2 : rule__Application__Group_11__2__Impl rule__Application__Group_11__3 ;
    public final void rule__Application__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1623:1: ( rule__Application__Group_11__2__Impl rule__Application__Group_11__3 )
            // InternalSecurityDsl.g:1624:2: rule__Application__Group_11__2__Impl rule__Application__Group_11__3
            {
            pushFollow(FOLLOW_10);
            rule__Application__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_11__3();

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
    // $ANTLR end "rule__Application__Group_11__2"


    // $ANTLR start "rule__Application__Group_11__2__Impl"
    // InternalSecurityDsl.g:1631:1: rule__Application__Group_11__2__Impl : ( ( rule__Application__App_modelsAssignment_11_2 ) ) ;
    public final void rule__Application__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1635:1: ( ( ( rule__Application__App_modelsAssignment_11_2 ) ) )
            // InternalSecurityDsl.g:1636:1: ( ( rule__Application__App_modelsAssignment_11_2 ) )
            {
            // InternalSecurityDsl.g:1636:1: ( ( rule__Application__App_modelsAssignment_11_2 ) )
            // InternalSecurityDsl.g:1637:2: ( rule__Application__App_modelsAssignment_11_2 )
            {
             before(grammarAccess.getApplicationAccess().getApp_modelsAssignment_11_2()); 
            // InternalSecurityDsl.g:1638:2: ( rule__Application__App_modelsAssignment_11_2 )
            // InternalSecurityDsl.g:1638:3: rule__Application__App_modelsAssignment_11_2
            {
            pushFollow(FOLLOW_2);
            rule__Application__App_modelsAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getApp_modelsAssignment_11_2()); 

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
    // $ANTLR end "rule__Application__Group_11__2__Impl"


    // $ANTLR start "rule__Application__Group_11__3"
    // InternalSecurityDsl.g:1646:1: rule__Application__Group_11__3 : rule__Application__Group_11__3__Impl rule__Application__Group_11__4 ;
    public final void rule__Application__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1650:1: ( rule__Application__Group_11__3__Impl rule__Application__Group_11__4 )
            // InternalSecurityDsl.g:1651:2: rule__Application__Group_11__3__Impl rule__Application__Group_11__4
            {
            pushFollow(FOLLOW_10);
            rule__Application__Group_11__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_11__4();

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
    // $ANTLR end "rule__Application__Group_11__3"


    // $ANTLR start "rule__Application__Group_11__3__Impl"
    // InternalSecurityDsl.g:1658:1: rule__Application__Group_11__3__Impl : ( ( rule__Application__Group_11_3__0 )* ) ;
    public final void rule__Application__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1662:1: ( ( ( rule__Application__Group_11_3__0 )* ) )
            // InternalSecurityDsl.g:1663:1: ( ( rule__Application__Group_11_3__0 )* )
            {
            // InternalSecurityDsl.g:1663:1: ( ( rule__Application__Group_11_3__0 )* )
            // InternalSecurityDsl.g:1664:2: ( rule__Application__Group_11_3__0 )*
            {
             before(grammarAccess.getApplicationAccess().getGroup_11_3()); 
            // InternalSecurityDsl.g:1665:2: ( rule__Application__Group_11_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==45) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSecurityDsl.g:1665:3: rule__Application__Group_11_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Application__Group_11_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getApplicationAccess().getGroup_11_3()); 

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
    // $ANTLR end "rule__Application__Group_11__3__Impl"


    // $ANTLR start "rule__Application__Group_11__4"
    // InternalSecurityDsl.g:1673:1: rule__Application__Group_11__4 : rule__Application__Group_11__4__Impl ;
    public final void rule__Application__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1677:1: ( rule__Application__Group_11__4__Impl )
            // InternalSecurityDsl.g:1678:2: rule__Application__Group_11__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_11__4__Impl();

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
    // $ANTLR end "rule__Application__Group_11__4"


    // $ANTLR start "rule__Application__Group_11__4__Impl"
    // InternalSecurityDsl.g:1684:1: rule__Application__Group_11__4__Impl : ( '}' ) ;
    public final void rule__Application__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1688:1: ( ( '}' ) )
            // InternalSecurityDsl.g:1689:1: ( '}' )
            {
            // InternalSecurityDsl.g:1689:1: ( '}' )
            // InternalSecurityDsl.g:1690:2: '}'
            {
             before(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_11_4()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_11_4()); 

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
    // $ANTLR end "rule__Application__Group_11__4__Impl"


    // $ANTLR start "rule__Application__Group_11_3__0"
    // InternalSecurityDsl.g:1700:1: rule__Application__Group_11_3__0 : rule__Application__Group_11_3__0__Impl rule__Application__Group_11_3__1 ;
    public final void rule__Application__Group_11_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1704:1: ( rule__Application__Group_11_3__0__Impl rule__Application__Group_11_3__1 )
            // InternalSecurityDsl.g:1705:2: rule__Application__Group_11_3__0__Impl rule__Application__Group_11_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Application__Group_11_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_11_3__1();

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
    // $ANTLR end "rule__Application__Group_11_3__0"


    // $ANTLR start "rule__Application__Group_11_3__0__Impl"
    // InternalSecurityDsl.g:1712:1: rule__Application__Group_11_3__0__Impl : ( ',' ) ;
    public final void rule__Application__Group_11_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1716:1: ( ( ',' ) )
            // InternalSecurityDsl.g:1717:1: ( ',' )
            {
            // InternalSecurityDsl.g:1717:1: ( ',' )
            // InternalSecurityDsl.g:1718:2: ','
            {
             before(grammarAccess.getApplicationAccess().getCommaKeyword_11_3_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getCommaKeyword_11_3_0()); 

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
    // $ANTLR end "rule__Application__Group_11_3__0__Impl"


    // $ANTLR start "rule__Application__Group_11_3__1"
    // InternalSecurityDsl.g:1727:1: rule__Application__Group_11_3__1 : rule__Application__Group_11_3__1__Impl ;
    public final void rule__Application__Group_11_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1731:1: ( rule__Application__Group_11_3__1__Impl )
            // InternalSecurityDsl.g:1732:2: rule__Application__Group_11_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_11_3__1__Impl();

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
    // $ANTLR end "rule__Application__Group_11_3__1"


    // $ANTLR start "rule__Application__Group_11_3__1__Impl"
    // InternalSecurityDsl.g:1738:1: rule__Application__Group_11_3__1__Impl : ( ( rule__Application__App_modelsAssignment_11_3_1 ) ) ;
    public final void rule__Application__Group_11_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1742:1: ( ( ( rule__Application__App_modelsAssignment_11_3_1 ) ) )
            // InternalSecurityDsl.g:1743:1: ( ( rule__Application__App_modelsAssignment_11_3_1 ) )
            {
            // InternalSecurityDsl.g:1743:1: ( ( rule__Application__App_modelsAssignment_11_3_1 ) )
            // InternalSecurityDsl.g:1744:2: ( rule__Application__App_modelsAssignment_11_3_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_modelsAssignment_11_3_1()); 
            // InternalSecurityDsl.g:1745:2: ( rule__Application__App_modelsAssignment_11_3_1 )
            // InternalSecurityDsl.g:1745:3: rule__Application__App_modelsAssignment_11_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__App_modelsAssignment_11_3_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getApp_modelsAssignment_11_3_1()); 

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
    // $ANTLR end "rule__Application__Group_11_3__1__Impl"


    // $ANTLR start "rule__Application__Group_12__0"
    // InternalSecurityDsl.g:1754:1: rule__Application__Group_12__0 : rule__Application__Group_12__0__Impl rule__Application__Group_12__1 ;
    public final void rule__Application__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1758:1: ( rule__Application__Group_12__0__Impl rule__Application__Group_12__1 )
            // InternalSecurityDsl.g:1759:2: rule__Application__Group_12__0__Impl rule__Application__Group_12__1
            {
            pushFollow(FOLLOW_5);
            rule__Application__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_12__1();

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
    // $ANTLR end "rule__Application__Group_12__0"


    // $ANTLR start "rule__Application__Group_12__0__Impl"
    // InternalSecurityDsl.g:1766:1: rule__Application__Group_12__0__Impl : ( 'app_controllers' ) ;
    public final void rule__Application__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1770:1: ( ( 'app_controllers' ) )
            // InternalSecurityDsl.g:1771:1: ( 'app_controllers' )
            {
            // InternalSecurityDsl.g:1771:1: ( 'app_controllers' )
            // InternalSecurityDsl.g:1772:2: 'app_controllers'
            {
             before(grammarAccess.getApplicationAccess().getApp_controllersKeyword_12_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getApp_controllersKeyword_12_0()); 

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
    // $ANTLR end "rule__Application__Group_12__0__Impl"


    // $ANTLR start "rule__Application__Group_12__1"
    // InternalSecurityDsl.g:1781:1: rule__Application__Group_12__1 : rule__Application__Group_12__1__Impl rule__Application__Group_12__2 ;
    public final void rule__Application__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1785:1: ( rule__Application__Group_12__1__Impl rule__Application__Group_12__2 )
            // InternalSecurityDsl.g:1786:2: rule__Application__Group_12__1__Impl rule__Application__Group_12__2
            {
            pushFollow(FOLLOW_12);
            rule__Application__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_12__2();

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
    // $ANTLR end "rule__Application__Group_12__1"


    // $ANTLR start "rule__Application__Group_12__1__Impl"
    // InternalSecurityDsl.g:1793:1: rule__Application__Group_12__1__Impl : ( '{' ) ;
    public final void rule__Application__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1797:1: ( ( '{' ) )
            // InternalSecurityDsl.g:1798:1: ( '{' )
            {
            // InternalSecurityDsl.g:1798:1: ( '{' )
            // InternalSecurityDsl.g:1799:2: '{'
            {
             before(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_12_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_12_1()); 

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
    // $ANTLR end "rule__Application__Group_12__1__Impl"


    // $ANTLR start "rule__Application__Group_12__2"
    // InternalSecurityDsl.g:1808:1: rule__Application__Group_12__2 : rule__Application__Group_12__2__Impl rule__Application__Group_12__3 ;
    public final void rule__Application__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1812:1: ( rule__Application__Group_12__2__Impl rule__Application__Group_12__3 )
            // InternalSecurityDsl.g:1813:2: rule__Application__Group_12__2__Impl rule__Application__Group_12__3
            {
            pushFollow(FOLLOW_10);
            rule__Application__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_12__3();

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
    // $ANTLR end "rule__Application__Group_12__2"


    // $ANTLR start "rule__Application__Group_12__2__Impl"
    // InternalSecurityDsl.g:1820:1: rule__Application__Group_12__2__Impl : ( ( rule__Application__App_controllersAssignment_12_2 ) ) ;
    public final void rule__Application__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1824:1: ( ( ( rule__Application__App_controllersAssignment_12_2 ) ) )
            // InternalSecurityDsl.g:1825:1: ( ( rule__Application__App_controllersAssignment_12_2 ) )
            {
            // InternalSecurityDsl.g:1825:1: ( ( rule__Application__App_controllersAssignment_12_2 ) )
            // InternalSecurityDsl.g:1826:2: ( rule__Application__App_controllersAssignment_12_2 )
            {
             before(grammarAccess.getApplicationAccess().getApp_controllersAssignment_12_2()); 
            // InternalSecurityDsl.g:1827:2: ( rule__Application__App_controllersAssignment_12_2 )
            // InternalSecurityDsl.g:1827:3: rule__Application__App_controllersAssignment_12_2
            {
            pushFollow(FOLLOW_2);
            rule__Application__App_controllersAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getApp_controllersAssignment_12_2()); 

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
    // $ANTLR end "rule__Application__Group_12__2__Impl"


    // $ANTLR start "rule__Application__Group_12__3"
    // InternalSecurityDsl.g:1835:1: rule__Application__Group_12__3 : rule__Application__Group_12__3__Impl rule__Application__Group_12__4 ;
    public final void rule__Application__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1839:1: ( rule__Application__Group_12__3__Impl rule__Application__Group_12__4 )
            // InternalSecurityDsl.g:1840:2: rule__Application__Group_12__3__Impl rule__Application__Group_12__4
            {
            pushFollow(FOLLOW_10);
            rule__Application__Group_12__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_12__4();

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
    // $ANTLR end "rule__Application__Group_12__3"


    // $ANTLR start "rule__Application__Group_12__3__Impl"
    // InternalSecurityDsl.g:1847:1: rule__Application__Group_12__3__Impl : ( ( rule__Application__Group_12_3__0 )* ) ;
    public final void rule__Application__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1851:1: ( ( ( rule__Application__Group_12_3__0 )* ) )
            // InternalSecurityDsl.g:1852:1: ( ( rule__Application__Group_12_3__0 )* )
            {
            // InternalSecurityDsl.g:1852:1: ( ( rule__Application__Group_12_3__0 )* )
            // InternalSecurityDsl.g:1853:2: ( rule__Application__Group_12_3__0 )*
            {
             before(grammarAccess.getApplicationAccess().getGroup_12_3()); 
            // InternalSecurityDsl.g:1854:2: ( rule__Application__Group_12_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==45) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSecurityDsl.g:1854:3: rule__Application__Group_12_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Application__Group_12_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getApplicationAccess().getGroup_12_3()); 

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
    // $ANTLR end "rule__Application__Group_12__3__Impl"


    // $ANTLR start "rule__Application__Group_12__4"
    // InternalSecurityDsl.g:1862:1: rule__Application__Group_12__4 : rule__Application__Group_12__4__Impl ;
    public final void rule__Application__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1866:1: ( rule__Application__Group_12__4__Impl )
            // InternalSecurityDsl.g:1867:2: rule__Application__Group_12__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_12__4__Impl();

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
    // $ANTLR end "rule__Application__Group_12__4"


    // $ANTLR start "rule__Application__Group_12__4__Impl"
    // InternalSecurityDsl.g:1873:1: rule__Application__Group_12__4__Impl : ( '}' ) ;
    public final void rule__Application__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1877:1: ( ( '}' ) )
            // InternalSecurityDsl.g:1878:1: ( '}' )
            {
            // InternalSecurityDsl.g:1878:1: ( '}' )
            // InternalSecurityDsl.g:1879:2: '}'
            {
             before(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_12_4()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_12_4()); 

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
    // $ANTLR end "rule__Application__Group_12__4__Impl"


    // $ANTLR start "rule__Application__Group_12_3__0"
    // InternalSecurityDsl.g:1889:1: rule__Application__Group_12_3__0 : rule__Application__Group_12_3__0__Impl rule__Application__Group_12_3__1 ;
    public final void rule__Application__Group_12_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1893:1: ( rule__Application__Group_12_3__0__Impl rule__Application__Group_12_3__1 )
            // InternalSecurityDsl.g:1894:2: rule__Application__Group_12_3__0__Impl rule__Application__Group_12_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Application__Group_12_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_12_3__1();

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
    // $ANTLR end "rule__Application__Group_12_3__0"


    // $ANTLR start "rule__Application__Group_12_3__0__Impl"
    // InternalSecurityDsl.g:1901:1: rule__Application__Group_12_3__0__Impl : ( ',' ) ;
    public final void rule__Application__Group_12_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1905:1: ( ( ',' ) )
            // InternalSecurityDsl.g:1906:1: ( ',' )
            {
            // InternalSecurityDsl.g:1906:1: ( ',' )
            // InternalSecurityDsl.g:1907:2: ','
            {
             before(grammarAccess.getApplicationAccess().getCommaKeyword_12_3_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getCommaKeyword_12_3_0()); 

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
    // $ANTLR end "rule__Application__Group_12_3__0__Impl"


    // $ANTLR start "rule__Application__Group_12_3__1"
    // InternalSecurityDsl.g:1916:1: rule__Application__Group_12_3__1 : rule__Application__Group_12_3__1__Impl ;
    public final void rule__Application__Group_12_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1920:1: ( rule__Application__Group_12_3__1__Impl )
            // InternalSecurityDsl.g:1921:2: rule__Application__Group_12_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_12_3__1__Impl();

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
    // $ANTLR end "rule__Application__Group_12_3__1"


    // $ANTLR start "rule__Application__Group_12_3__1__Impl"
    // InternalSecurityDsl.g:1927:1: rule__Application__Group_12_3__1__Impl : ( ( rule__Application__App_controllersAssignment_12_3_1 ) ) ;
    public final void rule__Application__Group_12_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1931:1: ( ( ( rule__Application__App_controllersAssignment_12_3_1 ) ) )
            // InternalSecurityDsl.g:1932:1: ( ( rule__Application__App_controllersAssignment_12_3_1 ) )
            {
            // InternalSecurityDsl.g:1932:1: ( ( rule__Application__App_controllersAssignment_12_3_1 ) )
            // InternalSecurityDsl.g:1933:2: ( rule__Application__App_controllersAssignment_12_3_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_controllersAssignment_12_3_1()); 
            // InternalSecurityDsl.g:1934:2: ( rule__Application__App_controllersAssignment_12_3_1 )
            // InternalSecurityDsl.g:1934:3: rule__Application__App_controllersAssignment_12_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__App_controllersAssignment_12_3_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getApp_controllersAssignment_12_3_1()); 

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
    // $ANTLR end "rule__Application__Group_12_3__1__Impl"


    // $ANTLR start "rule__Application__Group_13__0"
    // InternalSecurityDsl.g:1943:1: rule__Application__Group_13__0 : rule__Application__Group_13__0__Impl rule__Application__Group_13__1 ;
    public final void rule__Application__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1947:1: ( rule__Application__Group_13__0__Impl rule__Application__Group_13__1 )
            // InternalSecurityDsl.g:1948:2: rule__Application__Group_13__0__Impl rule__Application__Group_13__1
            {
            pushFollow(FOLLOW_13);
            rule__Application__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_13__1();

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
    // $ANTLR end "rule__Application__Group_13__0"


    // $ANTLR start "rule__Application__Group_13__0__Impl"
    // InternalSecurityDsl.g:1955:1: rule__Application__Group_13__0__Impl : ( 'app_security' ) ;
    public final void rule__Application__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1959:1: ( ( 'app_security' ) )
            // InternalSecurityDsl.g:1960:1: ( 'app_security' )
            {
            // InternalSecurityDsl.g:1960:1: ( 'app_security' )
            // InternalSecurityDsl.g:1961:2: 'app_security'
            {
             before(grammarAccess.getApplicationAccess().getApp_securityKeyword_13_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getApp_securityKeyword_13_0()); 

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
    // $ANTLR end "rule__Application__Group_13__0__Impl"


    // $ANTLR start "rule__Application__Group_13__1"
    // InternalSecurityDsl.g:1970:1: rule__Application__Group_13__1 : rule__Application__Group_13__1__Impl ;
    public final void rule__Application__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1974:1: ( rule__Application__Group_13__1__Impl )
            // InternalSecurityDsl.g:1975:2: rule__Application__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_13__1__Impl();

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
    // $ANTLR end "rule__Application__Group_13__1"


    // $ANTLR start "rule__Application__Group_13__1__Impl"
    // InternalSecurityDsl.g:1981:1: rule__Application__Group_13__1__Impl : ( ( rule__Application__App_securityAssignment_13_1 ) ) ;
    public final void rule__Application__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1985:1: ( ( ( rule__Application__App_securityAssignment_13_1 ) ) )
            // InternalSecurityDsl.g:1986:1: ( ( rule__Application__App_securityAssignment_13_1 ) )
            {
            // InternalSecurityDsl.g:1986:1: ( ( rule__Application__App_securityAssignment_13_1 ) )
            // InternalSecurityDsl.g:1987:2: ( rule__Application__App_securityAssignment_13_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_securityAssignment_13_1()); 
            // InternalSecurityDsl.g:1988:2: ( rule__Application__App_securityAssignment_13_1 )
            // InternalSecurityDsl.g:1988:3: rule__Application__App_securityAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__App_securityAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getApp_securityAssignment_13_1()); 

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
    // $ANTLR end "rule__Application__Group_13__1__Impl"


    // $ANTLR start "rule__Database__Group__0"
    // InternalSecurityDsl.g:1997:1: rule__Database__Group__0 : rule__Database__Group__0__Impl rule__Database__Group__1 ;
    public final void rule__Database__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2001:1: ( rule__Database__Group__0__Impl rule__Database__Group__1 )
            // InternalSecurityDsl.g:2002:2: rule__Database__Group__0__Impl rule__Database__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSecurityDsl.g:2009:1: rule__Database__Group__0__Impl : ( 'Database' ) ;
    public final void rule__Database__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2013:1: ( ( 'Database' ) )
            // InternalSecurityDsl.g:2014:1: ( 'Database' )
            {
            // InternalSecurityDsl.g:2014:1: ( 'Database' )
            // InternalSecurityDsl.g:2015:2: 'Database'
            {
             before(grammarAccess.getDatabaseAccess().getDatabaseKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getDatabaseAccess().getDatabaseKeyword_0()); 

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
    // InternalSecurityDsl.g:2024:1: rule__Database__Group__1 : rule__Database__Group__1__Impl rule__Database__Group__2 ;
    public final void rule__Database__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2028:1: ( rule__Database__Group__1__Impl rule__Database__Group__2 )
            // InternalSecurityDsl.g:2029:2: rule__Database__Group__1__Impl rule__Database__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalSecurityDsl.g:2036:1: rule__Database__Group__1__Impl : ( '{' ) ;
    public final void rule__Database__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2040:1: ( ( '{' ) )
            // InternalSecurityDsl.g:2041:1: ( '{' )
            {
            // InternalSecurityDsl.g:2041:1: ( '{' )
            // InternalSecurityDsl.g:2042:2: '{'
            {
             before(grammarAccess.getDatabaseAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDatabaseAccess().getLeftCurlyBracketKeyword_1()); 

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
    // InternalSecurityDsl.g:2051:1: rule__Database__Group__2 : rule__Database__Group__2__Impl rule__Database__Group__3 ;
    public final void rule__Database__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2055:1: ( rule__Database__Group__2__Impl rule__Database__Group__3 )
            // InternalSecurityDsl.g:2056:2: rule__Database__Group__2__Impl rule__Database__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalSecurityDsl.g:2063:1: rule__Database__Group__2__Impl : ( 'vendorName' ) ;
    public final void rule__Database__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2067:1: ( ( 'vendorName' ) )
            // InternalSecurityDsl.g:2068:1: ( 'vendorName' )
            {
            // InternalSecurityDsl.g:2068:1: ( 'vendorName' )
            // InternalSecurityDsl.g:2069:2: 'vendorName'
            {
             before(grammarAccess.getDatabaseAccess().getVendorNameKeyword_2()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getDatabaseAccess().getVendorNameKeyword_2()); 

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
    // InternalSecurityDsl.g:2078:1: rule__Database__Group__3 : rule__Database__Group__3__Impl rule__Database__Group__4 ;
    public final void rule__Database__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2082:1: ( rule__Database__Group__3__Impl rule__Database__Group__4 )
            // InternalSecurityDsl.g:2083:2: rule__Database__Group__3__Impl rule__Database__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalSecurityDsl.g:2090:1: rule__Database__Group__3__Impl : ( ( rule__Database__VendorNameAssignment_3 ) ) ;
    public final void rule__Database__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2094:1: ( ( ( rule__Database__VendorNameAssignment_3 ) ) )
            // InternalSecurityDsl.g:2095:1: ( ( rule__Database__VendorNameAssignment_3 ) )
            {
            // InternalSecurityDsl.g:2095:1: ( ( rule__Database__VendorNameAssignment_3 ) )
            // InternalSecurityDsl.g:2096:2: ( rule__Database__VendorNameAssignment_3 )
            {
             before(grammarAccess.getDatabaseAccess().getVendorNameAssignment_3()); 
            // InternalSecurityDsl.g:2097:2: ( rule__Database__VendorNameAssignment_3 )
            // InternalSecurityDsl.g:2097:3: rule__Database__VendorNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Database__VendorNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getVendorNameAssignment_3()); 

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
    // InternalSecurityDsl.g:2105:1: rule__Database__Group__4 : rule__Database__Group__4__Impl rule__Database__Group__5 ;
    public final void rule__Database__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2109:1: ( rule__Database__Group__4__Impl rule__Database__Group__5 )
            // InternalSecurityDsl.g:2110:2: rule__Database__Group__4__Impl rule__Database__Group__5
            {
            pushFollow(FOLLOW_4);
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
    // InternalSecurityDsl.g:2117:1: rule__Database__Group__4__Impl : ( 'url' ) ;
    public final void rule__Database__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2121:1: ( ( 'url' ) )
            // InternalSecurityDsl.g:2122:1: ( 'url' )
            {
            // InternalSecurityDsl.g:2122:1: ( 'url' )
            // InternalSecurityDsl.g:2123:2: 'url'
            {
             before(grammarAccess.getDatabaseAccess().getUrlKeyword_4()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getDatabaseAccess().getUrlKeyword_4()); 

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
    // InternalSecurityDsl.g:2132:1: rule__Database__Group__5 : rule__Database__Group__5__Impl rule__Database__Group__6 ;
    public final void rule__Database__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2136:1: ( rule__Database__Group__5__Impl rule__Database__Group__6 )
            // InternalSecurityDsl.g:2137:2: rule__Database__Group__5__Impl rule__Database__Group__6
            {
            pushFollow(FOLLOW_17);
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
    // InternalSecurityDsl.g:2144:1: rule__Database__Group__5__Impl : ( ( rule__Database__UrlAssignment_5 ) ) ;
    public final void rule__Database__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2148:1: ( ( ( rule__Database__UrlAssignment_5 ) ) )
            // InternalSecurityDsl.g:2149:1: ( ( rule__Database__UrlAssignment_5 ) )
            {
            // InternalSecurityDsl.g:2149:1: ( ( rule__Database__UrlAssignment_5 ) )
            // InternalSecurityDsl.g:2150:2: ( rule__Database__UrlAssignment_5 )
            {
             before(grammarAccess.getDatabaseAccess().getUrlAssignment_5()); 
            // InternalSecurityDsl.g:2151:2: ( rule__Database__UrlAssignment_5 )
            // InternalSecurityDsl.g:2151:3: rule__Database__UrlAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Database__UrlAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getUrlAssignment_5()); 

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
    // InternalSecurityDsl.g:2159:1: rule__Database__Group__6 : rule__Database__Group__6__Impl rule__Database__Group__7 ;
    public final void rule__Database__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2163:1: ( rule__Database__Group__6__Impl rule__Database__Group__7 )
            // InternalSecurityDsl.g:2164:2: rule__Database__Group__6__Impl rule__Database__Group__7
            {
            pushFollow(FOLLOW_4);
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
    // InternalSecurityDsl.g:2171:1: rule__Database__Group__6__Impl : ( 'username' ) ;
    public final void rule__Database__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2175:1: ( ( 'username' ) )
            // InternalSecurityDsl.g:2176:1: ( 'username' )
            {
            // InternalSecurityDsl.g:2176:1: ( 'username' )
            // InternalSecurityDsl.g:2177:2: 'username'
            {
             before(grammarAccess.getDatabaseAccess().getUsernameKeyword_6()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getDatabaseAccess().getUsernameKeyword_6()); 

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
    // InternalSecurityDsl.g:2186:1: rule__Database__Group__7 : rule__Database__Group__7__Impl rule__Database__Group__8 ;
    public final void rule__Database__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2190:1: ( rule__Database__Group__7__Impl rule__Database__Group__8 )
            // InternalSecurityDsl.g:2191:2: rule__Database__Group__7__Impl rule__Database__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__Database__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Database__Group__8();

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
    // InternalSecurityDsl.g:2198:1: rule__Database__Group__7__Impl : ( ( rule__Database__UsernameAssignment_7 ) ) ;
    public final void rule__Database__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2202:1: ( ( ( rule__Database__UsernameAssignment_7 ) ) )
            // InternalSecurityDsl.g:2203:1: ( ( rule__Database__UsernameAssignment_7 ) )
            {
            // InternalSecurityDsl.g:2203:1: ( ( rule__Database__UsernameAssignment_7 ) )
            // InternalSecurityDsl.g:2204:2: ( rule__Database__UsernameAssignment_7 )
            {
             before(grammarAccess.getDatabaseAccess().getUsernameAssignment_7()); 
            // InternalSecurityDsl.g:2205:2: ( rule__Database__UsernameAssignment_7 )
            // InternalSecurityDsl.g:2205:3: rule__Database__UsernameAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Database__UsernameAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getUsernameAssignment_7()); 

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


    // $ANTLR start "rule__Database__Group__8"
    // InternalSecurityDsl.g:2213:1: rule__Database__Group__8 : rule__Database__Group__8__Impl rule__Database__Group__9 ;
    public final void rule__Database__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2217:1: ( rule__Database__Group__8__Impl rule__Database__Group__9 )
            // InternalSecurityDsl.g:2218:2: rule__Database__Group__8__Impl rule__Database__Group__9
            {
            pushFollow(FOLLOW_4);
            rule__Database__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Database__Group__9();

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
    // $ANTLR end "rule__Database__Group__8"


    // $ANTLR start "rule__Database__Group__8__Impl"
    // InternalSecurityDsl.g:2225:1: rule__Database__Group__8__Impl : ( 'password' ) ;
    public final void rule__Database__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2229:1: ( ( 'password' ) )
            // InternalSecurityDsl.g:2230:1: ( 'password' )
            {
            // InternalSecurityDsl.g:2230:1: ( 'password' )
            // InternalSecurityDsl.g:2231:2: 'password'
            {
             before(grammarAccess.getDatabaseAccess().getPasswordKeyword_8()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getDatabaseAccess().getPasswordKeyword_8()); 

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
    // $ANTLR end "rule__Database__Group__8__Impl"


    // $ANTLR start "rule__Database__Group__9"
    // InternalSecurityDsl.g:2240:1: rule__Database__Group__9 : rule__Database__Group__9__Impl rule__Database__Group__10 ;
    public final void rule__Database__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2244:1: ( rule__Database__Group__9__Impl rule__Database__Group__10 )
            // InternalSecurityDsl.g:2245:2: rule__Database__Group__9__Impl rule__Database__Group__10
            {
            pushFollow(FOLLOW_19);
            rule__Database__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Database__Group__10();

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
    // $ANTLR end "rule__Database__Group__9"


    // $ANTLR start "rule__Database__Group__9__Impl"
    // InternalSecurityDsl.g:2252:1: rule__Database__Group__9__Impl : ( ( rule__Database__PasswordAssignment_9 ) ) ;
    public final void rule__Database__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2256:1: ( ( ( rule__Database__PasswordAssignment_9 ) ) )
            // InternalSecurityDsl.g:2257:1: ( ( rule__Database__PasswordAssignment_9 ) )
            {
            // InternalSecurityDsl.g:2257:1: ( ( rule__Database__PasswordAssignment_9 ) )
            // InternalSecurityDsl.g:2258:2: ( rule__Database__PasswordAssignment_9 )
            {
             before(grammarAccess.getDatabaseAccess().getPasswordAssignment_9()); 
            // InternalSecurityDsl.g:2259:2: ( rule__Database__PasswordAssignment_9 )
            // InternalSecurityDsl.g:2259:3: rule__Database__PasswordAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Database__PasswordAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getPasswordAssignment_9()); 

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
    // $ANTLR end "rule__Database__Group__9__Impl"


    // $ANTLR start "rule__Database__Group__10"
    // InternalSecurityDsl.g:2267:1: rule__Database__Group__10 : rule__Database__Group__10__Impl ;
    public final void rule__Database__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2271:1: ( rule__Database__Group__10__Impl )
            // InternalSecurityDsl.g:2272:2: rule__Database__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Database__Group__10__Impl();

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
    // $ANTLR end "rule__Database__Group__10"


    // $ANTLR start "rule__Database__Group__10__Impl"
    // InternalSecurityDsl.g:2278:1: rule__Database__Group__10__Impl : ( '}' ) ;
    public final void rule__Database__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2282:1: ( ( '}' ) )
            // InternalSecurityDsl.g:2283:1: ( '}' )
            {
            // InternalSecurityDsl.g:2283:1: ( '}' )
            // InternalSecurityDsl.g:2284:2: '}'
            {
             before(grammarAccess.getDatabaseAccess().getRightCurlyBracketKeyword_10()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDatabaseAccess().getRightCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__Database__Group__10__Impl"


    // $ANTLR start "rule__ELongObject__Group__0"
    // InternalSecurityDsl.g:2294:1: rule__ELongObject__Group__0 : rule__ELongObject__Group__0__Impl rule__ELongObject__Group__1 ;
    public final void rule__ELongObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2298:1: ( rule__ELongObject__Group__0__Impl rule__ELongObject__Group__1 )
            // InternalSecurityDsl.g:2299:2: rule__ELongObject__Group__0__Impl rule__ELongObject__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ELongObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ELongObject__Group__1();

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
    // $ANTLR end "rule__ELongObject__Group__0"


    // $ANTLR start "rule__ELongObject__Group__0__Impl"
    // InternalSecurityDsl.g:2306:1: rule__ELongObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__ELongObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2310:1: ( ( ( '-' )? ) )
            // InternalSecurityDsl.g:2311:1: ( ( '-' )? )
            {
            // InternalSecurityDsl.g:2311:1: ( ( '-' )? )
            // InternalSecurityDsl.g:2312:2: ( '-' )?
            {
             before(grammarAccess.getELongObjectAccess().getHyphenMinusKeyword_0()); 
            // InternalSecurityDsl.g:2313:2: ( '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==53) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSecurityDsl.g:2313:3: '-'
                    {
                    match(input,53,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getELongObjectAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__ELongObject__Group__0__Impl"


    // $ANTLR start "rule__ELongObject__Group__1"
    // InternalSecurityDsl.g:2321:1: rule__ELongObject__Group__1 : rule__ELongObject__Group__1__Impl ;
    public final void rule__ELongObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2325:1: ( rule__ELongObject__Group__1__Impl )
            // InternalSecurityDsl.g:2326:2: rule__ELongObject__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ELongObject__Group__1__Impl();

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
    // $ANTLR end "rule__ELongObject__Group__1"


    // $ANTLR start "rule__ELongObject__Group__1__Impl"
    // InternalSecurityDsl.g:2332:1: rule__ELongObject__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__ELongObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2336:1: ( ( RULE_INT ) )
            // InternalSecurityDsl.g:2337:1: ( RULE_INT )
            {
            // InternalSecurityDsl.g:2337:1: ( RULE_INT )
            // InternalSecurityDsl.g:2338:2: RULE_INT
            {
             before(grammarAccess.getELongObjectAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getELongObjectAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__ELongObject__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalSecurityDsl.g:2348:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2352:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalSecurityDsl.g:2353:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalSecurityDsl.g:2360:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__IsIdentifierAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2364:1: ( ( ( rule__Attribute__IsIdentifierAssignment_0 ) ) )
            // InternalSecurityDsl.g:2365:1: ( ( rule__Attribute__IsIdentifierAssignment_0 ) )
            {
            // InternalSecurityDsl.g:2365:1: ( ( rule__Attribute__IsIdentifierAssignment_0 ) )
            // InternalSecurityDsl.g:2366:2: ( rule__Attribute__IsIdentifierAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getIsIdentifierAssignment_0()); 
            // InternalSecurityDsl.g:2367:2: ( rule__Attribute__IsIdentifierAssignment_0 )
            // InternalSecurityDsl.g:2367:3: rule__Attribute__IsIdentifierAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__IsIdentifierAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getIsIdentifierAssignment_0()); 

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
    // InternalSecurityDsl.g:2375:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2379:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalSecurityDsl.g:2380:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalSecurityDsl.g:2387:1: rule__Attribute__Group__1__Impl : ( 'Attribute' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2391:1: ( ( 'Attribute' ) )
            // InternalSecurityDsl.g:2392:1: ( 'Attribute' )
            {
            // InternalSecurityDsl.g:2392:1: ( 'Attribute' )
            // InternalSecurityDsl.g:2393:2: 'Attribute'
            {
             before(grammarAccess.getAttributeAccess().getAttributeKeyword_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAttributeKeyword_1()); 

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
    // InternalSecurityDsl.g:2402:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2406:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalSecurityDsl.g:2407:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalSecurityDsl.g:2414:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__NameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2418:1: ( ( ( rule__Attribute__NameAssignment_2 ) ) )
            // InternalSecurityDsl.g:2419:1: ( ( rule__Attribute__NameAssignment_2 ) )
            {
            // InternalSecurityDsl.g:2419:1: ( ( rule__Attribute__NameAssignment_2 ) )
            // InternalSecurityDsl.g:2420:2: ( rule__Attribute__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_2()); 
            // InternalSecurityDsl.g:2421:2: ( rule__Attribute__NameAssignment_2 )
            // InternalSecurityDsl.g:2421:3: rule__Attribute__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_2()); 

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
    // InternalSecurityDsl.g:2429:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2433:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalSecurityDsl.g:2434:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalSecurityDsl.g:2441:1: rule__Attribute__Group__3__Impl : ( '{' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2445:1: ( ( '{' ) )
            // InternalSecurityDsl.g:2446:1: ( '{' )
            {
            // InternalSecurityDsl.g:2446:1: ( '{' )
            // InternalSecurityDsl.g:2447:2: '{'
            {
             before(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_3()); 

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
    // InternalSecurityDsl.g:2456:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2460:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalSecurityDsl.g:2461:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalSecurityDsl.g:2468:1: rule__Attribute__Group__4__Impl : ( 'type' ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2472:1: ( ( 'type' ) )
            // InternalSecurityDsl.g:2473:1: ( 'type' )
            {
            // InternalSecurityDsl.g:2473:1: ( 'type' )
            // InternalSecurityDsl.g:2474:2: 'type'
            {
             before(grammarAccess.getAttributeAccess().getTypeKeyword_4()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getTypeKeyword_4()); 

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
    // InternalSecurityDsl.g:2483:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2487:1: ( rule__Attribute__Group__5__Impl rule__Attribute__Group__6 )
            // InternalSecurityDsl.g:2488:2: rule__Attribute__Group__5__Impl rule__Attribute__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Attribute__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__6();

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
    // InternalSecurityDsl.g:2495:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__TypeAssignment_5 ) ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2499:1: ( ( ( rule__Attribute__TypeAssignment_5 ) ) )
            // InternalSecurityDsl.g:2500:1: ( ( rule__Attribute__TypeAssignment_5 ) )
            {
            // InternalSecurityDsl.g:2500:1: ( ( rule__Attribute__TypeAssignment_5 ) )
            // InternalSecurityDsl.g:2501:2: ( rule__Attribute__TypeAssignment_5 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_5()); 
            // InternalSecurityDsl.g:2502:2: ( rule__Attribute__TypeAssignment_5 )
            // InternalSecurityDsl.g:2502:3: rule__Attribute__TypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_5()); 

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


    // $ANTLR start "rule__Attribute__Group__6"
    // InternalSecurityDsl.g:2510:1: rule__Attribute__Group__6 : rule__Attribute__Group__6__Impl rule__Attribute__Group__7 ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2514:1: ( rule__Attribute__Group__6__Impl rule__Attribute__Group__7 )
            // InternalSecurityDsl.g:2515:2: rule__Attribute__Group__6__Impl rule__Attribute__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__Attribute__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__7();

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
    // $ANTLR end "rule__Attribute__Group__6"


    // $ANTLR start "rule__Attribute__Group__6__Impl"
    // InternalSecurityDsl.g:2522:1: rule__Attribute__Group__6__Impl : ( ( rule__Attribute__Group_6__0 )? ) ;
    public final void rule__Attribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2526:1: ( ( ( rule__Attribute__Group_6__0 )? ) )
            // InternalSecurityDsl.g:2527:1: ( ( rule__Attribute__Group_6__0 )? )
            {
            // InternalSecurityDsl.g:2527:1: ( ( rule__Attribute__Group_6__0 )? )
            // InternalSecurityDsl.g:2528:2: ( rule__Attribute__Group_6__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_6()); 
            // InternalSecurityDsl.g:2529:2: ( rule__Attribute__Group_6__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==56) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSecurityDsl.g:2529:3: rule__Attribute__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Attribute__Group__6__Impl"


    // $ANTLR start "rule__Attribute__Group__7"
    // InternalSecurityDsl.g:2537:1: rule__Attribute__Group__7 : rule__Attribute__Group__7__Impl ;
    public final void rule__Attribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2541:1: ( rule__Attribute__Group__7__Impl )
            // InternalSecurityDsl.g:2542:2: rule__Attribute__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__7__Impl();

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
    // $ANTLR end "rule__Attribute__Group__7"


    // $ANTLR start "rule__Attribute__Group__7__Impl"
    // InternalSecurityDsl.g:2548:1: rule__Attribute__Group__7__Impl : ( '}' ) ;
    public final void rule__Attribute__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2552:1: ( ( '}' ) )
            // InternalSecurityDsl.g:2553:1: ( '}' )
            {
            // InternalSecurityDsl.g:2553:1: ( '}' )
            // InternalSecurityDsl.g:2554:2: '}'
            {
             before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Attribute__Group__7__Impl"


    // $ANTLR start "rule__Attribute__Group_6__0"
    // InternalSecurityDsl.g:2564:1: rule__Attribute__Group_6__0 : rule__Attribute__Group_6__0__Impl rule__Attribute__Group_6__1 ;
    public final void rule__Attribute__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2568:1: ( rule__Attribute__Group_6__0__Impl rule__Attribute__Group_6__1 )
            // InternalSecurityDsl.g:2569:2: rule__Attribute__Group_6__0__Impl rule__Attribute__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Attribute__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_6__1();

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
    // $ANTLR end "rule__Attribute__Group_6__0"


    // $ANTLR start "rule__Attribute__Group_6__0__Impl"
    // InternalSecurityDsl.g:2576:1: rule__Attribute__Group_6__0__Impl : ( 'collumnName' ) ;
    public final void rule__Attribute__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2580:1: ( ( 'collumnName' ) )
            // InternalSecurityDsl.g:2581:1: ( 'collumnName' )
            {
            // InternalSecurityDsl.g:2581:1: ( 'collumnName' )
            // InternalSecurityDsl.g:2582:2: 'collumnName'
            {
             before(grammarAccess.getAttributeAccess().getCollumnNameKeyword_6_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getCollumnNameKeyword_6_0()); 

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
    // $ANTLR end "rule__Attribute__Group_6__0__Impl"


    // $ANTLR start "rule__Attribute__Group_6__1"
    // InternalSecurityDsl.g:2591:1: rule__Attribute__Group_6__1 : rule__Attribute__Group_6__1__Impl ;
    public final void rule__Attribute__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2595:1: ( rule__Attribute__Group_6__1__Impl )
            // InternalSecurityDsl.g:2596:2: rule__Attribute__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_6__1__Impl();

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
    // $ANTLR end "rule__Attribute__Group_6__1"


    // $ANTLR start "rule__Attribute__Group_6__1__Impl"
    // InternalSecurityDsl.g:2602:1: rule__Attribute__Group_6__1__Impl : ( ( rule__Attribute__CollumnNameAssignment_6_1 ) ) ;
    public final void rule__Attribute__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2606:1: ( ( ( rule__Attribute__CollumnNameAssignment_6_1 ) ) )
            // InternalSecurityDsl.g:2607:1: ( ( rule__Attribute__CollumnNameAssignment_6_1 ) )
            {
            // InternalSecurityDsl.g:2607:1: ( ( rule__Attribute__CollumnNameAssignment_6_1 ) )
            // InternalSecurityDsl.g:2608:2: ( rule__Attribute__CollumnNameAssignment_6_1 )
            {
             before(grammarAccess.getAttributeAccess().getCollumnNameAssignment_6_1()); 
            // InternalSecurityDsl.g:2609:2: ( rule__Attribute__CollumnNameAssignment_6_1 )
            // InternalSecurityDsl.g:2609:3: rule__Attribute__CollumnNameAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__CollumnNameAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getCollumnNameAssignment_6_1()); 

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
    // $ANTLR end "rule__Attribute__Group_6__1__Impl"


    // $ANTLR start "rule__Role__Group__0"
    // InternalSecurityDsl.g:2618:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2622:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // InternalSecurityDsl.g:2623:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalSecurityDsl.g:2630:1: rule__Role__Group__0__Impl : ( () ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2634:1: ( ( () ) )
            // InternalSecurityDsl.g:2635:1: ( () )
            {
            // InternalSecurityDsl.g:2635:1: ( () )
            // InternalSecurityDsl.g:2636:2: ()
            {
             before(grammarAccess.getRoleAccess().getRoleAction_0()); 
            // InternalSecurityDsl.g:2637:2: ()
            // InternalSecurityDsl.g:2637:3: 
            {
            }

             after(grammarAccess.getRoleAccess().getRoleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__0__Impl"


    // $ANTLR start "rule__Role__Group__1"
    // InternalSecurityDsl.g:2645:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2649:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // InternalSecurityDsl.g:2650:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSecurityDsl.g:2657:1: rule__Role__Group__1__Impl : ( 'Role' ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2661:1: ( ( 'Role' ) )
            // InternalSecurityDsl.g:2662:1: ( 'Role' )
            {
            // InternalSecurityDsl.g:2662:1: ( 'Role' )
            // InternalSecurityDsl.g:2663:2: 'Role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_1()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRoleKeyword_1()); 

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
    // InternalSecurityDsl.g:2672:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2676:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // InternalSecurityDsl.g:2677:2: rule__Role__Group__2__Impl rule__Role__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalSecurityDsl.g:2684:1: rule__Role__Group__2__Impl : ( '{' ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2688:1: ( ( '{' ) )
            // InternalSecurityDsl.g:2689:1: ( '{' )
            {
            // InternalSecurityDsl.g:2689:1: ( '{' )
            // InternalSecurityDsl.g:2690:2: '{'
            {
             before(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2()); 

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
    // InternalSecurityDsl.g:2699:1: rule__Role__Group__3 : rule__Role__Group__3__Impl rule__Role__Group__4 ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2703:1: ( rule__Role__Group__3__Impl rule__Role__Group__4 )
            // InternalSecurityDsl.g:2704:2: rule__Role__Group__3__Impl rule__Role__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalSecurityDsl.g:2711:1: rule__Role__Group__3__Impl : ( ( rule__Role__Group_3__0 )? ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2715:1: ( ( ( rule__Role__Group_3__0 )? ) )
            // InternalSecurityDsl.g:2716:1: ( ( rule__Role__Group_3__0 )? )
            {
            // InternalSecurityDsl.g:2716:1: ( ( rule__Role__Group_3__0 )? )
            // InternalSecurityDsl.g:2717:2: ( rule__Role__Group_3__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_3()); 
            // InternalSecurityDsl.g:2718:2: ( rule__Role__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==58) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSecurityDsl.g:2718:3: rule__Role__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Role__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoleAccess().getGroup_3()); 

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
    // InternalSecurityDsl.g:2726:1: rule__Role__Group__4 : rule__Role__Group__4__Impl rule__Role__Group__5 ;
    public final void rule__Role__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2730:1: ( rule__Role__Group__4__Impl rule__Role__Group__5 )
            // InternalSecurityDsl.g:2731:2: rule__Role__Group__4__Impl rule__Role__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalSecurityDsl.g:2738:1: rule__Role__Group__4__Impl : ( ( rule__Role__Group_4__0 )? ) ;
    public final void rule__Role__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2742:1: ( ( ( rule__Role__Group_4__0 )? ) )
            // InternalSecurityDsl.g:2743:1: ( ( rule__Role__Group_4__0 )? )
            {
            // InternalSecurityDsl.g:2743:1: ( ( rule__Role__Group_4__0 )? )
            // InternalSecurityDsl.g:2744:2: ( rule__Role__Group_4__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_4()); 
            // InternalSecurityDsl.g:2745:2: ( rule__Role__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==59) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSecurityDsl.g:2745:3: rule__Role__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Role__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoleAccess().getGroup_4()); 

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
    // InternalSecurityDsl.g:2753:1: rule__Role__Group__5 : rule__Role__Group__5__Impl rule__Role__Group__6 ;
    public final void rule__Role__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2757:1: ( rule__Role__Group__5__Impl rule__Role__Group__6 )
            // InternalSecurityDsl.g:2758:2: rule__Role__Group__5__Impl rule__Role__Group__6
            {
            pushFollow(FOLLOW_25);
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
    // InternalSecurityDsl.g:2765:1: rule__Role__Group__5__Impl : ( ( rule__Role__Group_5__0 )? ) ;
    public final void rule__Role__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2769:1: ( ( ( rule__Role__Group_5__0 )? ) )
            // InternalSecurityDsl.g:2770:1: ( ( rule__Role__Group_5__0 )? )
            {
            // InternalSecurityDsl.g:2770:1: ( ( rule__Role__Group_5__0 )? )
            // InternalSecurityDsl.g:2771:2: ( rule__Role__Group_5__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_5()); 
            // InternalSecurityDsl.g:2772:2: ( rule__Role__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==60) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSecurityDsl.g:2772:3: rule__Role__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Role__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoleAccess().getGroup_5()); 

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
    // InternalSecurityDsl.g:2780:1: rule__Role__Group__6 : rule__Role__Group__6__Impl ;
    public final void rule__Role__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2784:1: ( rule__Role__Group__6__Impl )
            // InternalSecurityDsl.g:2785:2: rule__Role__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group__6__Impl();

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
    // InternalSecurityDsl.g:2791:1: rule__Role__Group__6__Impl : ( '}' ) ;
    public final void rule__Role__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2795:1: ( ( '}' ) )
            // InternalSecurityDsl.g:2796:1: ( '}' )
            {
            // InternalSecurityDsl.g:2796:1: ( '}' )
            // InternalSecurityDsl.g:2797:2: '}'
            {
             before(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_6()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_6()); 

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


    // $ANTLR start "rule__Role__Group_3__0"
    // InternalSecurityDsl.g:2807:1: rule__Role__Group_3__0 : rule__Role__Group_3__0__Impl rule__Role__Group_3__1 ;
    public final void rule__Role__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2811:1: ( rule__Role__Group_3__0__Impl rule__Role__Group_3__1 )
            // InternalSecurityDsl.g:2812:2: rule__Role__Group_3__0__Impl rule__Role__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Role__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_3__1();

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
    // $ANTLR end "rule__Role__Group_3__0"


    // $ANTLR start "rule__Role__Group_3__0__Impl"
    // InternalSecurityDsl.g:2819:1: rule__Role__Group_3__0__Impl : ( 'tableName' ) ;
    public final void rule__Role__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2823:1: ( ( 'tableName' ) )
            // InternalSecurityDsl.g:2824:1: ( 'tableName' )
            {
            // InternalSecurityDsl.g:2824:1: ( 'tableName' )
            // InternalSecurityDsl.g:2825:2: 'tableName'
            {
             before(grammarAccess.getRoleAccess().getTableNameKeyword_3_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getTableNameKeyword_3_0()); 

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
    // $ANTLR end "rule__Role__Group_3__0__Impl"


    // $ANTLR start "rule__Role__Group_3__1"
    // InternalSecurityDsl.g:2834:1: rule__Role__Group_3__1 : rule__Role__Group_3__1__Impl ;
    public final void rule__Role__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2838:1: ( rule__Role__Group_3__1__Impl )
            // InternalSecurityDsl.g:2839:2: rule__Role__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group_3__1__Impl();

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
    // $ANTLR end "rule__Role__Group_3__1"


    // $ANTLR start "rule__Role__Group_3__1__Impl"
    // InternalSecurityDsl.g:2845:1: rule__Role__Group_3__1__Impl : ( ( rule__Role__TableNameAssignment_3_1 ) ) ;
    public final void rule__Role__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2849:1: ( ( ( rule__Role__TableNameAssignment_3_1 ) ) )
            // InternalSecurityDsl.g:2850:1: ( ( rule__Role__TableNameAssignment_3_1 ) )
            {
            // InternalSecurityDsl.g:2850:1: ( ( rule__Role__TableNameAssignment_3_1 ) )
            // InternalSecurityDsl.g:2851:2: ( rule__Role__TableNameAssignment_3_1 )
            {
             before(grammarAccess.getRoleAccess().getTableNameAssignment_3_1()); 
            // InternalSecurityDsl.g:2852:2: ( rule__Role__TableNameAssignment_3_1 )
            // InternalSecurityDsl.g:2852:3: rule__Role__TableNameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Role__TableNameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getTableNameAssignment_3_1()); 

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
    // $ANTLR end "rule__Role__Group_3__1__Impl"


    // $ANTLR start "rule__Role__Group_4__0"
    // InternalSecurityDsl.g:2861:1: rule__Role__Group_4__0 : rule__Role__Group_4__0__Impl rule__Role__Group_4__1 ;
    public final void rule__Role__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2865:1: ( rule__Role__Group_4__0__Impl rule__Role__Group_4__1 )
            // InternalSecurityDsl.g:2866:2: rule__Role__Group_4__0__Impl rule__Role__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Role__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_4__1();

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
    // $ANTLR end "rule__Role__Group_4__0"


    // $ANTLR start "rule__Role__Group_4__0__Impl"
    // InternalSecurityDsl.g:2873:1: rule__Role__Group_4__0__Impl : ( 'model_attributes' ) ;
    public final void rule__Role__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2877:1: ( ( 'model_attributes' ) )
            // InternalSecurityDsl.g:2878:1: ( 'model_attributes' )
            {
            // InternalSecurityDsl.g:2878:1: ( 'model_attributes' )
            // InternalSecurityDsl.g:2879:2: 'model_attributes'
            {
             before(grammarAccess.getRoleAccess().getModel_attributesKeyword_4_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getModel_attributesKeyword_4_0()); 

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
    // $ANTLR end "rule__Role__Group_4__0__Impl"


    // $ANTLR start "rule__Role__Group_4__1"
    // InternalSecurityDsl.g:2888:1: rule__Role__Group_4__1 : rule__Role__Group_4__1__Impl rule__Role__Group_4__2 ;
    public final void rule__Role__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2892:1: ( rule__Role__Group_4__1__Impl rule__Role__Group_4__2 )
            // InternalSecurityDsl.g:2893:2: rule__Role__Group_4__1__Impl rule__Role__Group_4__2
            {
            pushFollow(FOLLOW_26);
            rule__Role__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_4__2();

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
    // $ANTLR end "rule__Role__Group_4__1"


    // $ANTLR start "rule__Role__Group_4__1__Impl"
    // InternalSecurityDsl.g:2900:1: rule__Role__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Role__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2904:1: ( ( '{' ) )
            // InternalSecurityDsl.g:2905:1: ( '{' )
            {
            // InternalSecurityDsl.g:2905:1: ( '{' )
            // InternalSecurityDsl.g:2906:2: '{'
            {
             before(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__Role__Group_4__1__Impl"


    // $ANTLR start "rule__Role__Group_4__2"
    // InternalSecurityDsl.g:2915:1: rule__Role__Group_4__2 : rule__Role__Group_4__2__Impl rule__Role__Group_4__3 ;
    public final void rule__Role__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2919:1: ( rule__Role__Group_4__2__Impl rule__Role__Group_4__3 )
            // InternalSecurityDsl.g:2920:2: rule__Role__Group_4__2__Impl rule__Role__Group_4__3
            {
            pushFollow(FOLLOW_10);
            rule__Role__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_4__3();

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
    // $ANTLR end "rule__Role__Group_4__2"


    // $ANTLR start "rule__Role__Group_4__2__Impl"
    // InternalSecurityDsl.g:2927:1: rule__Role__Group_4__2__Impl : ( ( rule__Role__Model_attributesAssignment_4_2 ) ) ;
    public final void rule__Role__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2931:1: ( ( ( rule__Role__Model_attributesAssignment_4_2 ) ) )
            // InternalSecurityDsl.g:2932:1: ( ( rule__Role__Model_attributesAssignment_4_2 ) )
            {
            // InternalSecurityDsl.g:2932:1: ( ( rule__Role__Model_attributesAssignment_4_2 ) )
            // InternalSecurityDsl.g:2933:2: ( rule__Role__Model_attributesAssignment_4_2 )
            {
             before(grammarAccess.getRoleAccess().getModel_attributesAssignment_4_2()); 
            // InternalSecurityDsl.g:2934:2: ( rule__Role__Model_attributesAssignment_4_2 )
            // InternalSecurityDsl.g:2934:3: rule__Role__Model_attributesAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Role__Model_attributesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getModel_attributesAssignment_4_2()); 

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
    // $ANTLR end "rule__Role__Group_4__2__Impl"


    // $ANTLR start "rule__Role__Group_4__3"
    // InternalSecurityDsl.g:2942:1: rule__Role__Group_4__3 : rule__Role__Group_4__3__Impl rule__Role__Group_4__4 ;
    public final void rule__Role__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2946:1: ( rule__Role__Group_4__3__Impl rule__Role__Group_4__4 )
            // InternalSecurityDsl.g:2947:2: rule__Role__Group_4__3__Impl rule__Role__Group_4__4
            {
            pushFollow(FOLLOW_10);
            rule__Role__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_4__4();

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
    // $ANTLR end "rule__Role__Group_4__3"


    // $ANTLR start "rule__Role__Group_4__3__Impl"
    // InternalSecurityDsl.g:2954:1: rule__Role__Group_4__3__Impl : ( ( rule__Role__Group_4_3__0 )* ) ;
    public final void rule__Role__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2958:1: ( ( ( rule__Role__Group_4_3__0 )* ) )
            // InternalSecurityDsl.g:2959:1: ( ( rule__Role__Group_4_3__0 )* )
            {
            // InternalSecurityDsl.g:2959:1: ( ( rule__Role__Group_4_3__0 )* )
            // InternalSecurityDsl.g:2960:2: ( rule__Role__Group_4_3__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_4_3()); 
            // InternalSecurityDsl.g:2961:2: ( rule__Role__Group_4_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==45) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSecurityDsl.g:2961:3: rule__Role__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Role__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getRoleAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Role__Group_4__3__Impl"


    // $ANTLR start "rule__Role__Group_4__4"
    // InternalSecurityDsl.g:2969:1: rule__Role__Group_4__4 : rule__Role__Group_4__4__Impl ;
    public final void rule__Role__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2973:1: ( rule__Role__Group_4__4__Impl )
            // InternalSecurityDsl.g:2974:2: rule__Role__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group_4__4__Impl();

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
    // $ANTLR end "rule__Role__Group_4__4"


    // $ANTLR start "rule__Role__Group_4__4__Impl"
    // InternalSecurityDsl.g:2980:1: rule__Role__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Role__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2984:1: ( ( '}' ) )
            // InternalSecurityDsl.g:2985:1: ( '}' )
            {
            // InternalSecurityDsl.g:2985:1: ( '}' )
            // InternalSecurityDsl.g:2986:2: '}'
            {
             before(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__Role__Group_4__4__Impl"


    // $ANTLR start "rule__Role__Group_4_3__0"
    // InternalSecurityDsl.g:2996:1: rule__Role__Group_4_3__0 : rule__Role__Group_4_3__0__Impl rule__Role__Group_4_3__1 ;
    public final void rule__Role__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3000:1: ( rule__Role__Group_4_3__0__Impl rule__Role__Group_4_3__1 )
            // InternalSecurityDsl.g:3001:2: rule__Role__Group_4_3__0__Impl rule__Role__Group_4_3__1
            {
            pushFollow(FOLLOW_26);
            rule__Role__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_4_3__1();

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
    // $ANTLR end "rule__Role__Group_4_3__0"


    // $ANTLR start "rule__Role__Group_4_3__0__Impl"
    // InternalSecurityDsl.g:3008:1: rule__Role__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Role__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3012:1: ( ( ',' ) )
            // InternalSecurityDsl.g:3013:1: ( ',' )
            {
            // InternalSecurityDsl.g:3013:1: ( ',' )
            // InternalSecurityDsl.g:3014:2: ','
            {
             before(grammarAccess.getRoleAccess().getCommaKeyword_4_3_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Role__Group_4_3__0__Impl"


    // $ANTLR start "rule__Role__Group_4_3__1"
    // InternalSecurityDsl.g:3023:1: rule__Role__Group_4_3__1 : rule__Role__Group_4_3__1__Impl ;
    public final void rule__Role__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3027:1: ( rule__Role__Group_4_3__1__Impl )
            // InternalSecurityDsl.g:3028:2: rule__Role__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Role__Group_4_3__1"


    // $ANTLR start "rule__Role__Group_4_3__1__Impl"
    // InternalSecurityDsl.g:3034:1: rule__Role__Group_4_3__1__Impl : ( ( rule__Role__Model_attributesAssignment_4_3_1 ) ) ;
    public final void rule__Role__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3038:1: ( ( ( rule__Role__Model_attributesAssignment_4_3_1 ) ) )
            // InternalSecurityDsl.g:3039:1: ( ( rule__Role__Model_attributesAssignment_4_3_1 ) )
            {
            // InternalSecurityDsl.g:3039:1: ( ( rule__Role__Model_attributesAssignment_4_3_1 ) )
            // InternalSecurityDsl.g:3040:2: ( rule__Role__Model_attributesAssignment_4_3_1 )
            {
             before(grammarAccess.getRoleAccess().getModel_attributesAssignment_4_3_1()); 
            // InternalSecurityDsl.g:3041:2: ( rule__Role__Model_attributesAssignment_4_3_1 )
            // InternalSecurityDsl.g:3041:3: rule__Role__Model_attributesAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Role__Model_attributesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getModel_attributesAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Role__Group_4_3__1__Impl"


    // $ANTLR start "rule__Role__Group_5__0"
    // InternalSecurityDsl.g:3050:1: rule__Role__Group_5__0 : rule__Role__Group_5__0__Impl rule__Role__Group_5__1 ;
    public final void rule__Role__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3054:1: ( rule__Role__Group_5__0__Impl rule__Role__Group_5__1 )
            // InternalSecurityDsl.g:3055:2: rule__Role__Group_5__0__Impl rule__Role__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Role__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_5__1();

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
    // $ANTLR end "rule__Role__Group_5__0"


    // $ANTLR start "rule__Role__Group_5__0__Impl"
    // InternalSecurityDsl.g:3062:1: rule__Role__Group_5__0__Impl : ( 'role_instances' ) ;
    public final void rule__Role__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3066:1: ( ( 'role_instances' ) )
            // InternalSecurityDsl.g:3067:1: ( 'role_instances' )
            {
            // InternalSecurityDsl.g:3067:1: ( 'role_instances' )
            // InternalSecurityDsl.g:3068:2: 'role_instances'
            {
             before(grammarAccess.getRoleAccess().getRole_instancesKeyword_5_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRole_instancesKeyword_5_0()); 

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
    // $ANTLR end "rule__Role__Group_5__0__Impl"


    // $ANTLR start "rule__Role__Group_5__1"
    // InternalSecurityDsl.g:3077:1: rule__Role__Group_5__1 : rule__Role__Group_5__1__Impl rule__Role__Group_5__2 ;
    public final void rule__Role__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3081:1: ( rule__Role__Group_5__1__Impl rule__Role__Group_5__2 )
            // InternalSecurityDsl.g:3082:2: rule__Role__Group_5__1__Impl rule__Role__Group_5__2
            {
            pushFollow(FOLLOW_27);
            rule__Role__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_5__2();

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
    // $ANTLR end "rule__Role__Group_5__1"


    // $ANTLR start "rule__Role__Group_5__1__Impl"
    // InternalSecurityDsl.g:3089:1: rule__Role__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Role__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3093:1: ( ( '{' ) )
            // InternalSecurityDsl.g:3094:1: ( '{' )
            {
            // InternalSecurityDsl.g:3094:1: ( '{' )
            // InternalSecurityDsl.g:3095:2: '{'
            {
             before(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__Role__Group_5__1__Impl"


    // $ANTLR start "rule__Role__Group_5__2"
    // InternalSecurityDsl.g:3104:1: rule__Role__Group_5__2 : rule__Role__Group_5__2__Impl rule__Role__Group_5__3 ;
    public final void rule__Role__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3108:1: ( rule__Role__Group_5__2__Impl rule__Role__Group_5__3 )
            // InternalSecurityDsl.g:3109:2: rule__Role__Group_5__2__Impl rule__Role__Group_5__3
            {
            pushFollow(FOLLOW_10);
            rule__Role__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_5__3();

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
    // $ANTLR end "rule__Role__Group_5__2"


    // $ANTLR start "rule__Role__Group_5__2__Impl"
    // InternalSecurityDsl.g:3116:1: rule__Role__Group_5__2__Impl : ( ( rule__Role__Role_instancesAssignment_5_2 ) ) ;
    public final void rule__Role__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3120:1: ( ( ( rule__Role__Role_instancesAssignment_5_2 ) ) )
            // InternalSecurityDsl.g:3121:1: ( ( rule__Role__Role_instancesAssignment_5_2 ) )
            {
            // InternalSecurityDsl.g:3121:1: ( ( rule__Role__Role_instancesAssignment_5_2 ) )
            // InternalSecurityDsl.g:3122:2: ( rule__Role__Role_instancesAssignment_5_2 )
            {
             before(grammarAccess.getRoleAccess().getRole_instancesAssignment_5_2()); 
            // InternalSecurityDsl.g:3123:2: ( rule__Role__Role_instancesAssignment_5_2 )
            // InternalSecurityDsl.g:3123:3: rule__Role__Role_instancesAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Role__Role_instancesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getRole_instancesAssignment_5_2()); 

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
    // $ANTLR end "rule__Role__Group_5__2__Impl"


    // $ANTLR start "rule__Role__Group_5__3"
    // InternalSecurityDsl.g:3131:1: rule__Role__Group_5__3 : rule__Role__Group_5__3__Impl rule__Role__Group_5__4 ;
    public final void rule__Role__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3135:1: ( rule__Role__Group_5__3__Impl rule__Role__Group_5__4 )
            // InternalSecurityDsl.g:3136:2: rule__Role__Group_5__3__Impl rule__Role__Group_5__4
            {
            pushFollow(FOLLOW_10);
            rule__Role__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_5__4();

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
    // $ANTLR end "rule__Role__Group_5__3"


    // $ANTLR start "rule__Role__Group_5__3__Impl"
    // InternalSecurityDsl.g:3143:1: rule__Role__Group_5__3__Impl : ( ( rule__Role__Group_5_3__0 )* ) ;
    public final void rule__Role__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3147:1: ( ( ( rule__Role__Group_5_3__0 )* ) )
            // InternalSecurityDsl.g:3148:1: ( ( rule__Role__Group_5_3__0 )* )
            {
            // InternalSecurityDsl.g:3148:1: ( ( rule__Role__Group_5_3__0 )* )
            // InternalSecurityDsl.g:3149:2: ( rule__Role__Group_5_3__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_5_3()); 
            // InternalSecurityDsl.g:3150:2: ( rule__Role__Group_5_3__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==45) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalSecurityDsl.g:3150:3: rule__Role__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Role__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getRoleAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__Role__Group_5__3__Impl"


    // $ANTLR start "rule__Role__Group_5__4"
    // InternalSecurityDsl.g:3158:1: rule__Role__Group_5__4 : rule__Role__Group_5__4__Impl ;
    public final void rule__Role__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3162:1: ( rule__Role__Group_5__4__Impl )
            // InternalSecurityDsl.g:3163:2: rule__Role__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group_5__4__Impl();

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
    // $ANTLR end "rule__Role__Group_5__4"


    // $ANTLR start "rule__Role__Group_5__4__Impl"
    // InternalSecurityDsl.g:3169:1: rule__Role__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Role__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3173:1: ( ( '}' ) )
            // InternalSecurityDsl.g:3174:1: ( '}' )
            {
            // InternalSecurityDsl.g:3174:1: ( '}' )
            // InternalSecurityDsl.g:3175:2: '}'
            {
             before(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__Role__Group_5__4__Impl"


    // $ANTLR start "rule__Role__Group_5_3__0"
    // InternalSecurityDsl.g:3185:1: rule__Role__Group_5_3__0 : rule__Role__Group_5_3__0__Impl rule__Role__Group_5_3__1 ;
    public final void rule__Role__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3189:1: ( rule__Role__Group_5_3__0__Impl rule__Role__Group_5_3__1 )
            // InternalSecurityDsl.g:3190:2: rule__Role__Group_5_3__0__Impl rule__Role__Group_5_3__1
            {
            pushFollow(FOLLOW_27);
            rule__Role__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_5_3__1();

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
    // $ANTLR end "rule__Role__Group_5_3__0"


    // $ANTLR start "rule__Role__Group_5_3__0__Impl"
    // InternalSecurityDsl.g:3197:1: rule__Role__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Role__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3201:1: ( ( ',' ) )
            // InternalSecurityDsl.g:3202:1: ( ',' )
            {
            // InternalSecurityDsl.g:3202:1: ( ',' )
            // InternalSecurityDsl.g:3203:2: ','
            {
             before(grammarAccess.getRoleAccess().getCommaKeyword_5_3_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__Role__Group_5_3__0__Impl"


    // $ANTLR start "rule__Role__Group_5_3__1"
    // InternalSecurityDsl.g:3212:1: rule__Role__Group_5_3__1 : rule__Role__Group_5_3__1__Impl ;
    public final void rule__Role__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3216:1: ( rule__Role__Group_5_3__1__Impl )
            // InternalSecurityDsl.g:3217:2: rule__Role__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Role__Group_5_3__1"


    // $ANTLR start "rule__Role__Group_5_3__1__Impl"
    // InternalSecurityDsl.g:3223:1: rule__Role__Group_5_3__1__Impl : ( ( rule__Role__Role_instancesAssignment_5_3_1 ) ) ;
    public final void rule__Role__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3227:1: ( ( ( rule__Role__Role_instancesAssignment_5_3_1 ) ) )
            // InternalSecurityDsl.g:3228:1: ( ( rule__Role__Role_instancesAssignment_5_3_1 ) )
            {
            // InternalSecurityDsl.g:3228:1: ( ( rule__Role__Role_instancesAssignment_5_3_1 ) )
            // InternalSecurityDsl.g:3229:2: ( rule__Role__Role_instancesAssignment_5_3_1 )
            {
             before(grammarAccess.getRoleAccess().getRole_instancesAssignment_5_3_1()); 
            // InternalSecurityDsl.g:3230:2: ( rule__Role__Role_instancesAssignment_5_3_1 )
            // InternalSecurityDsl.g:3230:3: rule__Role__Role_instancesAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Role__Role_instancesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getRole_instancesAssignment_5_3_1()); 

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
    // $ANTLR end "rule__Role__Group_5_3__1__Impl"


    // $ANTLR start "rule__User__Group__0"
    // InternalSecurityDsl.g:3239:1: rule__User__Group__0 : rule__User__Group__0__Impl rule__User__Group__1 ;
    public final void rule__User__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3243:1: ( rule__User__Group__0__Impl rule__User__Group__1 )
            // InternalSecurityDsl.g:3244:2: rule__User__Group__0__Impl rule__User__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalSecurityDsl.g:3251:1: rule__User__Group__0__Impl : ( () ) ;
    public final void rule__User__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3255:1: ( ( () ) )
            // InternalSecurityDsl.g:3256:1: ( () )
            {
            // InternalSecurityDsl.g:3256:1: ( () )
            // InternalSecurityDsl.g:3257:2: ()
            {
             before(grammarAccess.getUserAccess().getUserAction_0()); 
            // InternalSecurityDsl.g:3258:2: ()
            // InternalSecurityDsl.g:3258:3: 
            {
            }

             after(grammarAccess.getUserAccess().getUserAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__0__Impl"


    // $ANTLR start "rule__User__Group__1"
    // InternalSecurityDsl.g:3266:1: rule__User__Group__1 : rule__User__Group__1__Impl rule__User__Group__2 ;
    public final void rule__User__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3270:1: ( rule__User__Group__1__Impl rule__User__Group__2 )
            // InternalSecurityDsl.g:3271:2: rule__User__Group__1__Impl rule__User__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSecurityDsl.g:3278:1: rule__User__Group__1__Impl : ( 'User' ) ;
    public final void rule__User__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3282:1: ( ( 'User' ) )
            // InternalSecurityDsl.g:3283:1: ( 'User' )
            {
            // InternalSecurityDsl.g:3283:1: ( 'User' )
            // InternalSecurityDsl.g:3284:2: 'User'
            {
             before(grammarAccess.getUserAccess().getUserKeyword_1()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getUserKeyword_1()); 

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
    // InternalSecurityDsl.g:3293:1: rule__User__Group__2 : rule__User__Group__2__Impl rule__User__Group__3 ;
    public final void rule__User__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3297:1: ( rule__User__Group__2__Impl rule__User__Group__3 )
            // InternalSecurityDsl.g:3298:2: rule__User__Group__2__Impl rule__User__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalSecurityDsl.g:3305:1: rule__User__Group__2__Impl : ( '{' ) ;
    public final void rule__User__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3309:1: ( ( '{' ) )
            // InternalSecurityDsl.g:3310:1: ( '{' )
            {
            // InternalSecurityDsl.g:3310:1: ( '{' )
            // InternalSecurityDsl.g:3311:2: '{'
            {
             before(grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_2()); 

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
    // InternalSecurityDsl.g:3320:1: rule__User__Group__3 : rule__User__Group__3__Impl rule__User__Group__4 ;
    public final void rule__User__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3324:1: ( rule__User__Group__3__Impl rule__User__Group__4 )
            // InternalSecurityDsl.g:3325:2: rule__User__Group__3__Impl rule__User__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalSecurityDsl.g:3332:1: rule__User__Group__3__Impl : ( ( rule__User__Group_3__0 )? ) ;
    public final void rule__User__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3336:1: ( ( ( rule__User__Group_3__0 )? ) )
            // InternalSecurityDsl.g:3337:1: ( ( rule__User__Group_3__0 )? )
            {
            // InternalSecurityDsl.g:3337:1: ( ( rule__User__Group_3__0 )? )
            // InternalSecurityDsl.g:3338:2: ( rule__User__Group_3__0 )?
            {
             before(grammarAccess.getUserAccess().getGroup_3()); 
            // InternalSecurityDsl.g:3339:2: ( rule__User__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==58) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSecurityDsl.g:3339:3: rule__User__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__User__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUserAccess().getGroup_3()); 

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
    // InternalSecurityDsl.g:3347:1: rule__User__Group__4 : rule__User__Group__4__Impl rule__User__Group__5 ;
    public final void rule__User__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3351:1: ( rule__User__Group__4__Impl rule__User__Group__5 )
            // InternalSecurityDsl.g:3352:2: rule__User__Group__4__Impl rule__User__Group__5
            {
            pushFollow(FOLLOW_28);
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
    // InternalSecurityDsl.g:3359:1: rule__User__Group__4__Impl : ( ( rule__User__Group_4__0 )? ) ;
    public final void rule__User__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3363:1: ( ( ( rule__User__Group_4__0 )? ) )
            // InternalSecurityDsl.g:3364:1: ( ( rule__User__Group_4__0 )? )
            {
            // InternalSecurityDsl.g:3364:1: ( ( rule__User__Group_4__0 )? )
            // InternalSecurityDsl.g:3365:2: ( rule__User__Group_4__0 )?
            {
             before(grammarAccess.getUserAccess().getGroup_4()); 
            // InternalSecurityDsl.g:3366:2: ( rule__User__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==59) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSecurityDsl.g:3366:3: rule__User__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__User__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUserAccess().getGroup_4()); 

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
    // InternalSecurityDsl.g:3374:1: rule__User__Group__5 : rule__User__Group__5__Impl ;
    public final void rule__User__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3378:1: ( rule__User__Group__5__Impl )
            // InternalSecurityDsl.g:3379:2: rule__User__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__User__Group__5__Impl();

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
    // InternalSecurityDsl.g:3385:1: rule__User__Group__5__Impl : ( '}' ) ;
    public final void rule__User__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3389:1: ( ( '}' ) )
            // InternalSecurityDsl.g:3390:1: ( '}' )
            {
            // InternalSecurityDsl.g:3390:1: ( '}' )
            // InternalSecurityDsl.g:3391:2: '}'
            {
             before(grammarAccess.getUserAccess().getRightCurlyBracketKeyword_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getRightCurlyBracketKeyword_5()); 

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


    // $ANTLR start "rule__User__Group_3__0"
    // InternalSecurityDsl.g:3401:1: rule__User__Group_3__0 : rule__User__Group_3__0__Impl rule__User__Group_3__1 ;
    public final void rule__User__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3405:1: ( rule__User__Group_3__0__Impl rule__User__Group_3__1 )
            // InternalSecurityDsl.g:3406:2: rule__User__Group_3__0__Impl rule__User__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__User__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group_3__1();

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
    // $ANTLR end "rule__User__Group_3__0"


    // $ANTLR start "rule__User__Group_3__0__Impl"
    // InternalSecurityDsl.g:3413:1: rule__User__Group_3__0__Impl : ( 'tableName' ) ;
    public final void rule__User__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3417:1: ( ( 'tableName' ) )
            // InternalSecurityDsl.g:3418:1: ( 'tableName' )
            {
            // InternalSecurityDsl.g:3418:1: ( 'tableName' )
            // InternalSecurityDsl.g:3419:2: 'tableName'
            {
             before(grammarAccess.getUserAccess().getTableNameKeyword_3_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getTableNameKeyword_3_0()); 

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
    // $ANTLR end "rule__User__Group_3__0__Impl"


    // $ANTLR start "rule__User__Group_3__1"
    // InternalSecurityDsl.g:3428:1: rule__User__Group_3__1 : rule__User__Group_3__1__Impl ;
    public final void rule__User__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3432:1: ( rule__User__Group_3__1__Impl )
            // InternalSecurityDsl.g:3433:2: rule__User__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__User__Group_3__1__Impl();

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
    // $ANTLR end "rule__User__Group_3__1"


    // $ANTLR start "rule__User__Group_3__1__Impl"
    // InternalSecurityDsl.g:3439:1: rule__User__Group_3__1__Impl : ( ( rule__User__TableNameAssignment_3_1 ) ) ;
    public final void rule__User__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3443:1: ( ( ( rule__User__TableNameAssignment_3_1 ) ) )
            // InternalSecurityDsl.g:3444:1: ( ( rule__User__TableNameAssignment_3_1 ) )
            {
            // InternalSecurityDsl.g:3444:1: ( ( rule__User__TableNameAssignment_3_1 ) )
            // InternalSecurityDsl.g:3445:2: ( rule__User__TableNameAssignment_3_1 )
            {
             before(grammarAccess.getUserAccess().getTableNameAssignment_3_1()); 
            // InternalSecurityDsl.g:3446:2: ( rule__User__TableNameAssignment_3_1 )
            // InternalSecurityDsl.g:3446:3: rule__User__TableNameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__User__TableNameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getTableNameAssignment_3_1()); 

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
    // $ANTLR end "rule__User__Group_3__1__Impl"


    // $ANTLR start "rule__User__Group_4__0"
    // InternalSecurityDsl.g:3455:1: rule__User__Group_4__0 : rule__User__Group_4__0__Impl rule__User__Group_4__1 ;
    public final void rule__User__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3459:1: ( rule__User__Group_4__0__Impl rule__User__Group_4__1 )
            // InternalSecurityDsl.g:3460:2: rule__User__Group_4__0__Impl rule__User__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__User__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group_4__1();

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
    // $ANTLR end "rule__User__Group_4__0"


    // $ANTLR start "rule__User__Group_4__0__Impl"
    // InternalSecurityDsl.g:3467:1: rule__User__Group_4__0__Impl : ( 'model_attributes' ) ;
    public final void rule__User__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3471:1: ( ( 'model_attributes' ) )
            // InternalSecurityDsl.g:3472:1: ( 'model_attributes' )
            {
            // InternalSecurityDsl.g:3472:1: ( 'model_attributes' )
            // InternalSecurityDsl.g:3473:2: 'model_attributes'
            {
             before(grammarAccess.getUserAccess().getModel_attributesKeyword_4_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getModel_attributesKeyword_4_0()); 

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
    // $ANTLR end "rule__User__Group_4__0__Impl"


    // $ANTLR start "rule__User__Group_4__1"
    // InternalSecurityDsl.g:3482:1: rule__User__Group_4__1 : rule__User__Group_4__1__Impl rule__User__Group_4__2 ;
    public final void rule__User__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3486:1: ( rule__User__Group_4__1__Impl rule__User__Group_4__2 )
            // InternalSecurityDsl.g:3487:2: rule__User__Group_4__1__Impl rule__User__Group_4__2
            {
            pushFollow(FOLLOW_26);
            rule__User__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group_4__2();

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
    // $ANTLR end "rule__User__Group_4__1"


    // $ANTLR start "rule__User__Group_4__1__Impl"
    // InternalSecurityDsl.g:3494:1: rule__User__Group_4__1__Impl : ( '{' ) ;
    public final void rule__User__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3498:1: ( ( '{' ) )
            // InternalSecurityDsl.g:3499:1: ( '{' )
            {
            // InternalSecurityDsl.g:3499:1: ( '{' )
            // InternalSecurityDsl.g:3500:2: '{'
            {
             before(grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__User__Group_4__1__Impl"


    // $ANTLR start "rule__User__Group_4__2"
    // InternalSecurityDsl.g:3509:1: rule__User__Group_4__2 : rule__User__Group_4__2__Impl rule__User__Group_4__3 ;
    public final void rule__User__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3513:1: ( rule__User__Group_4__2__Impl rule__User__Group_4__3 )
            // InternalSecurityDsl.g:3514:2: rule__User__Group_4__2__Impl rule__User__Group_4__3
            {
            pushFollow(FOLLOW_10);
            rule__User__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group_4__3();

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
    // $ANTLR end "rule__User__Group_4__2"


    // $ANTLR start "rule__User__Group_4__2__Impl"
    // InternalSecurityDsl.g:3521:1: rule__User__Group_4__2__Impl : ( ( rule__User__Model_attributesAssignment_4_2 ) ) ;
    public final void rule__User__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3525:1: ( ( ( rule__User__Model_attributesAssignment_4_2 ) ) )
            // InternalSecurityDsl.g:3526:1: ( ( rule__User__Model_attributesAssignment_4_2 ) )
            {
            // InternalSecurityDsl.g:3526:1: ( ( rule__User__Model_attributesAssignment_4_2 ) )
            // InternalSecurityDsl.g:3527:2: ( rule__User__Model_attributesAssignment_4_2 )
            {
             before(grammarAccess.getUserAccess().getModel_attributesAssignment_4_2()); 
            // InternalSecurityDsl.g:3528:2: ( rule__User__Model_attributesAssignment_4_2 )
            // InternalSecurityDsl.g:3528:3: rule__User__Model_attributesAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__User__Model_attributesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getModel_attributesAssignment_4_2()); 

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
    // $ANTLR end "rule__User__Group_4__2__Impl"


    // $ANTLR start "rule__User__Group_4__3"
    // InternalSecurityDsl.g:3536:1: rule__User__Group_4__3 : rule__User__Group_4__3__Impl rule__User__Group_4__4 ;
    public final void rule__User__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3540:1: ( rule__User__Group_4__3__Impl rule__User__Group_4__4 )
            // InternalSecurityDsl.g:3541:2: rule__User__Group_4__3__Impl rule__User__Group_4__4
            {
            pushFollow(FOLLOW_10);
            rule__User__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group_4__4();

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
    // $ANTLR end "rule__User__Group_4__3"


    // $ANTLR start "rule__User__Group_4__3__Impl"
    // InternalSecurityDsl.g:3548:1: rule__User__Group_4__3__Impl : ( ( rule__User__Group_4_3__0 )* ) ;
    public final void rule__User__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3552:1: ( ( ( rule__User__Group_4_3__0 )* ) )
            // InternalSecurityDsl.g:3553:1: ( ( rule__User__Group_4_3__0 )* )
            {
            // InternalSecurityDsl.g:3553:1: ( ( rule__User__Group_4_3__0 )* )
            // InternalSecurityDsl.g:3554:2: ( rule__User__Group_4_3__0 )*
            {
             before(grammarAccess.getUserAccess().getGroup_4_3()); 
            // InternalSecurityDsl.g:3555:2: ( rule__User__Group_4_3__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==45) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSecurityDsl.g:3555:3: rule__User__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__User__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getUserAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__User__Group_4__3__Impl"


    // $ANTLR start "rule__User__Group_4__4"
    // InternalSecurityDsl.g:3563:1: rule__User__Group_4__4 : rule__User__Group_4__4__Impl ;
    public final void rule__User__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3567:1: ( rule__User__Group_4__4__Impl )
            // InternalSecurityDsl.g:3568:2: rule__User__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__User__Group_4__4__Impl();

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
    // $ANTLR end "rule__User__Group_4__4"


    // $ANTLR start "rule__User__Group_4__4__Impl"
    // InternalSecurityDsl.g:3574:1: rule__User__Group_4__4__Impl : ( '}' ) ;
    public final void rule__User__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3578:1: ( ( '}' ) )
            // InternalSecurityDsl.g:3579:1: ( '}' )
            {
            // InternalSecurityDsl.g:3579:1: ( '}' )
            // InternalSecurityDsl.g:3580:2: '}'
            {
             before(grammarAccess.getUserAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__User__Group_4__4__Impl"


    // $ANTLR start "rule__User__Group_4_3__0"
    // InternalSecurityDsl.g:3590:1: rule__User__Group_4_3__0 : rule__User__Group_4_3__0__Impl rule__User__Group_4_3__1 ;
    public final void rule__User__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3594:1: ( rule__User__Group_4_3__0__Impl rule__User__Group_4_3__1 )
            // InternalSecurityDsl.g:3595:2: rule__User__Group_4_3__0__Impl rule__User__Group_4_3__1
            {
            pushFollow(FOLLOW_26);
            rule__User__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group_4_3__1();

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
    // $ANTLR end "rule__User__Group_4_3__0"


    // $ANTLR start "rule__User__Group_4_3__0__Impl"
    // InternalSecurityDsl.g:3602:1: rule__User__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__User__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3606:1: ( ( ',' ) )
            // InternalSecurityDsl.g:3607:1: ( ',' )
            {
            // InternalSecurityDsl.g:3607:1: ( ',' )
            // InternalSecurityDsl.g:3608:2: ','
            {
             before(grammarAccess.getUserAccess().getCommaKeyword_4_3_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__User__Group_4_3__0__Impl"


    // $ANTLR start "rule__User__Group_4_3__1"
    // InternalSecurityDsl.g:3617:1: rule__User__Group_4_3__1 : rule__User__Group_4_3__1__Impl ;
    public final void rule__User__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3621:1: ( rule__User__Group_4_3__1__Impl )
            // InternalSecurityDsl.g:3622:2: rule__User__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__User__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__User__Group_4_3__1"


    // $ANTLR start "rule__User__Group_4_3__1__Impl"
    // InternalSecurityDsl.g:3628:1: rule__User__Group_4_3__1__Impl : ( ( rule__User__Model_attributesAssignment_4_3_1 ) ) ;
    public final void rule__User__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3632:1: ( ( ( rule__User__Model_attributesAssignment_4_3_1 ) ) )
            // InternalSecurityDsl.g:3633:1: ( ( rule__User__Model_attributesAssignment_4_3_1 ) )
            {
            // InternalSecurityDsl.g:3633:1: ( ( rule__User__Model_attributesAssignment_4_3_1 ) )
            // InternalSecurityDsl.g:3634:2: ( rule__User__Model_attributesAssignment_4_3_1 )
            {
             before(grammarAccess.getUserAccess().getModel_attributesAssignment_4_3_1()); 
            // InternalSecurityDsl.g:3635:2: ( rule__User__Model_attributesAssignment_4_3_1 )
            // InternalSecurityDsl.g:3635:3: rule__User__Model_attributesAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__User__Model_attributesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getModel_attributesAssignment_4_3_1()); 

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
    // $ANTLR end "rule__User__Group_4_3__1__Impl"


    // $ANTLR start "rule__RoleInstance__Group__0"
    // InternalSecurityDsl.g:3644:1: rule__RoleInstance__Group__0 : rule__RoleInstance__Group__0__Impl rule__RoleInstance__Group__1 ;
    public final void rule__RoleInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3648:1: ( rule__RoleInstance__Group__0__Impl rule__RoleInstance__Group__1 )
            // InternalSecurityDsl.g:3649:2: rule__RoleInstance__Group__0__Impl rule__RoleInstance__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__RoleInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoleInstance__Group__1();

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
    // $ANTLR end "rule__RoleInstance__Group__0"


    // $ANTLR start "rule__RoleInstance__Group__0__Impl"
    // InternalSecurityDsl.g:3656:1: rule__RoleInstance__Group__0__Impl : ( () ) ;
    public final void rule__RoleInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3660:1: ( ( () ) )
            // InternalSecurityDsl.g:3661:1: ( () )
            {
            // InternalSecurityDsl.g:3661:1: ( () )
            // InternalSecurityDsl.g:3662:2: ()
            {
             before(grammarAccess.getRoleInstanceAccess().getRoleInstanceAction_0()); 
            // InternalSecurityDsl.g:3663:2: ()
            // InternalSecurityDsl.g:3663:3: 
            {
            }

             after(grammarAccess.getRoleInstanceAccess().getRoleInstanceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleInstance__Group__0__Impl"


    // $ANTLR start "rule__RoleInstance__Group__1"
    // InternalSecurityDsl.g:3671:1: rule__RoleInstance__Group__1 : rule__RoleInstance__Group__1__Impl rule__RoleInstance__Group__2 ;
    public final void rule__RoleInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3675:1: ( rule__RoleInstance__Group__1__Impl rule__RoleInstance__Group__2 )
            // InternalSecurityDsl.g:3676:2: rule__RoleInstance__Group__1__Impl rule__RoleInstance__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RoleInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoleInstance__Group__2();

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
    // $ANTLR end "rule__RoleInstance__Group__1"


    // $ANTLR start "rule__RoleInstance__Group__1__Impl"
    // InternalSecurityDsl.g:3683:1: rule__RoleInstance__Group__1__Impl : ( 'RoleInstance' ) ;
    public final void rule__RoleInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3687:1: ( ( 'RoleInstance' ) )
            // InternalSecurityDsl.g:3688:1: ( 'RoleInstance' )
            {
            // InternalSecurityDsl.g:3688:1: ( 'RoleInstance' )
            // InternalSecurityDsl.g:3689:2: 'RoleInstance'
            {
             before(grammarAccess.getRoleInstanceAccess().getRoleInstanceKeyword_1()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getRoleInstanceAccess().getRoleInstanceKeyword_1()); 

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
    // $ANTLR end "rule__RoleInstance__Group__1__Impl"


    // $ANTLR start "rule__RoleInstance__Group__2"
    // InternalSecurityDsl.g:3698:1: rule__RoleInstance__Group__2 : rule__RoleInstance__Group__2__Impl ;
    public final void rule__RoleInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3702:1: ( rule__RoleInstance__Group__2__Impl )
            // InternalSecurityDsl.g:3703:2: rule__RoleInstance__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoleInstance__Group__2__Impl();

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
    // $ANTLR end "rule__RoleInstance__Group__2"


    // $ANTLR start "rule__RoleInstance__Group__2__Impl"
    // InternalSecurityDsl.g:3709:1: rule__RoleInstance__Group__2__Impl : ( ( rule__RoleInstance__NameAssignment_2 ) ) ;
    public final void rule__RoleInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3713:1: ( ( ( rule__RoleInstance__NameAssignment_2 ) ) )
            // InternalSecurityDsl.g:3714:1: ( ( rule__RoleInstance__NameAssignment_2 ) )
            {
            // InternalSecurityDsl.g:3714:1: ( ( rule__RoleInstance__NameAssignment_2 ) )
            // InternalSecurityDsl.g:3715:2: ( rule__RoleInstance__NameAssignment_2 )
            {
             before(grammarAccess.getRoleInstanceAccess().getNameAssignment_2()); 
            // InternalSecurityDsl.g:3716:2: ( rule__RoleInstance__NameAssignment_2 )
            // InternalSecurityDsl.g:3716:3: rule__RoleInstance__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RoleInstance__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRoleInstanceAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__RoleInstance__Group__2__Impl"


    // $ANTLR start "rule__Endpoint__Group__0"
    // InternalSecurityDsl.g:3725:1: rule__Endpoint__Group__0 : rule__Endpoint__Group__0__Impl rule__Endpoint__Group__1 ;
    public final void rule__Endpoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3729:1: ( rule__Endpoint__Group__0__Impl rule__Endpoint__Group__1 )
            // InternalSecurityDsl.g:3730:2: rule__Endpoint__Group__0__Impl rule__Endpoint__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSecurityDsl.g:3737:1: rule__Endpoint__Group__0__Impl : ( 'Endpoint' ) ;
    public final void rule__Endpoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3741:1: ( ( 'Endpoint' ) )
            // InternalSecurityDsl.g:3742:1: ( 'Endpoint' )
            {
            // InternalSecurityDsl.g:3742:1: ( 'Endpoint' )
            // InternalSecurityDsl.g:3743:2: 'Endpoint'
            {
             before(grammarAccess.getEndpointAccess().getEndpointKeyword_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3752:1: rule__Endpoint__Group__1 : rule__Endpoint__Group__1__Impl rule__Endpoint__Group__2 ;
    public final void rule__Endpoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3756:1: ( rule__Endpoint__Group__1__Impl rule__Endpoint__Group__2 )
            // InternalSecurityDsl.g:3757:2: rule__Endpoint__Group__1__Impl rule__Endpoint__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalSecurityDsl.g:3764:1: rule__Endpoint__Group__1__Impl : ( '{' ) ;
    public final void rule__Endpoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3768:1: ( ( '{' ) )
            // InternalSecurityDsl.g:3769:1: ( '{' )
            {
            // InternalSecurityDsl.g:3769:1: ( '{' )
            // InternalSecurityDsl.g:3770:2: '{'
            {
             before(grammarAccess.getEndpointAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3779:1: rule__Endpoint__Group__2 : rule__Endpoint__Group__2__Impl rule__Endpoint__Group__3 ;
    public final void rule__Endpoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3783:1: ( rule__Endpoint__Group__2__Impl rule__Endpoint__Group__3 )
            // InternalSecurityDsl.g:3784:2: rule__Endpoint__Group__2__Impl rule__Endpoint__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalSecurityDsl.g:3791:1: rule__Endpoint__Group__2__Impl : ( 'url' ) ;
    public final void rule__Endpoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3795:1: ( ( 'url' ) )
            // InternalSecurityDsl.g:3796:1: ( 'url' )
            {
            // InternalSecurityDsl.g:3796:1: ( 'url' )
            // InternalSecurityDsl.g:3797:2: 'url'
            {
             before(grammarAccess.getEndpointAccess().getUrlKeyword_2()); 
            match(input,50,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3806:1: rule__Endpoint__Group__3 : rule__Endpoint__Group__3__Impl rule__Endpoint__Group__4 ;
    public final void rule__Endpoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3810:1: ( rule__Endpoint__Group__3__Impl rule__Endpoint__Group__4 )
            // InternalSecurityDsl.g:3811:2: rule__Endpoint__Group__3__Impl rule__Endpoint__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalSecurityDsl.g:3818:1: rule__Endpoint__Group__3__Impl : ( ( rule__Endpoint__UrlAssignment_3 ) ) ;
    public final void rule__Endpoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3822:1: ( ( ( rule__Endpoint__UrlAssignment_3 ) ) )
            // InternalSecurityDsl.g:3823:1: ( ( rule__Endpoint__UrlAssignment_3 ) )
            {
            // InternalSecurityDsl.g:3823:1: ( ( rule__Endpoint__UrlAssignment_3 ) )
            // InternalSecurityDsl.g:3824:2: ( rule__Endpoint__UrlAssignment_3 )
            {
             before(grammarAccess.getEndpointAccess().getUrlAssignment_3()); 
            // InternalSecurityDsl.g:3825:2: ( rule__Endpoint__UrlAssignment_3 )
            // InternalSecurityDsl.g:3825:3: rule__Endpoint__UrlAssignment_3
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
    // InternalSecurityDsl.g:3833:1: rule__Endpoint__Group__4 : rule__Endpoint__Group__4__Impl rule__Endpoint__Group__5 ;
    public final void rule__Endpoint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3837:1: ( rule__Endpoint__Group__4__Impl rule__Endpoint__Group__5 )
            // InternalSecurityDsl.g:3838:2: rule__Endpoint__Group__4__Impl rule__Endpoint__Group__5
            {
            pushFollow(FOLLOW_29);
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
    // InternalSecurityDsl.g:3845:1: rule__Endpoint__Group__4__Impl : ( ( rule__Endpoint__Group_4__0 )? ) ;
    public final void rule__Endpoint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3849:1: ( ( ( rule__Endpoint__Group_4__0 )? ) )
            // InternalSecurityDsl.g:3850:1: ( ( rule__Endpoint__Group_4__0 )? )
            {
            // InternalSecurityDsl.g:3850:1: ( ( rule__Endpoint__Group_4__0 )? )
            // InternalSecurityDsl.g:3851:2: ( rule__Endpoint__Group_4__0 )?
            {
             before(grammarAccess.getEndpointAccess().getGroup_4()); 
            // InternalSecurityDsl.g:3852:2: ( rule__Endpoint__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==64) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSecurityDsl.g:3852:3: rule__Endpoint__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Endpoint__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEndpointAccess().getGroup_4()); 

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
    // InternalSecurityDsl.g:3860:1: rule__Endpoint__Group__5 : rule__Endpoint__Group__5__Impl rule__Endpoint__Group__6 ;
    public final void rule__Endpoint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3864:1: ( rule__Endpoint__Group__5__Impl rule__Endpoint__Group__6 )
            // InternalSecurityDsl.g:3865:2: rule__Endpoint__Group__5__Impl rule__Endpoint__Group__6
            {
            pushFollow(FOLLOW_29);
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
    // InternalSecurityDsl.g:3872:1: rule__Endpoint__Group__5__Impl : ( ( rule__Endpoint__Group_5__0 )? ) ;
    public final void rule__Endpoint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3876:1: ( ( ( rule__Endpoint__Group_5__0 )? ) )
            // InternalSecurityDsl.g:3877:1: ( ( rule__Endpoint__Group_5__0 )? )
            {
            // InternalSecurityDsl.g:3877:1: ( ( rule__Endpoint__Group_5__0 )? )
            // InternalSecurityDsl.g:3878:2: ( rule__Endpoint__Group_5__0 )?
            {
             before(grammarAccess.getEndpointAccess().getGroup_5()); 
            // InternalSecurityDsl.g:3879:2: ( rule__Endpoint__Group_5__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==65) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSecurityDsl.g:3879:3: rule__Endpoint__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Endpoint__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEndpointAccess().getGroup_5()); 

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
    // InternalSecurityDsl.g:3887:1: rule__Endpoint__Group__6 : rule__Endpoint__Group__6__Impl rule__Endpoint__Group__7 ;
    public final void rule__Endpoint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3891:1: ( rule__Endpoint__Group__6__Impl rule__Endpoint__Group__7 )
            // InternalSecurityDsl.g:3892:2: rule__Endpoint__Group__6__Impl rule__Endpoint__Group__7
            {
            pushFollow(FOLLOW_29);
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
    // InternalSecurityDsl.g:3899:1: rule__Endpoint__Group__6__Impl : ( ( rule__Endpoint__Group_6__0 )? ) ;
    public final void rule__Endpoint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3903:1: ( ( ( rule__Endpoint__Group_6__0 )? ) )
            // InternalSecurityDsl.g:3904:1: ( ( rule__Endpoint__Group_6__0 )? )
            {
            // InternalSecurityDsl.g:3904:1: ( ( rule__Endpoint__Group_6__0 )? )
            // InternalSecurityDsl.g:3905:2: ( rule__Endpoint__Group_6__0 )?
            {
             before(grammarAccess.getEndpointAccess().getGroup_6()); 
            // InternalSecurityDsl.g:3906:2: ( rule__Endpoint__Group_6__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==55) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSecurityDsl.g:3906:3: rule__Endpoint__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Endpoint__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEndpointAccess().getGroup_6()); 

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
    // InternalSecurityDsl.g:3914:1: rule__Endpoint__Group__7 : rule__Endpoint__Group__7__Impl rule__Endpoint__Group__8 ;
    public final void rule__Endpoint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3918:1: ( rule__Endpoint__Group__7__Impl rule__Endpoint__Group__8 )
            // InternalSecurityDsl.g:3919:2: rule__Endpoint__Group__7__Impl rule__Endpoint__Group__8
            {
            pushFollow(FOLLOW_29);
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
    // InternalSecurityDsl.g:3926:1: rule__Endpoint__Group__7__Impl : ( ( rule__Endpoint__Group_7__0 )? ) ;
    public final void rule__Endpoint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3930:1: ( ( ( rule__Endpoint__Group_7__0 )? ) )
            // InternalSecurityDsl.g:3931:1: ( ( rule__Endpoint__Group_7__0 )? )
            {
            // InternalSecurityDsl.g:3931:1: ( ( rule__Endpoint__Group_7__0 )? )
            // InternalSecurityDsl.g:3932:2: ( rule__Endpoint__Group_7__0 )?
            {
             before(grammarAccess.getEndpointAccess().getGroup_7()); 
            // InternalSecurityDsl.g:3933:2: ( rule__Endpoint__Group_7__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==66) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSecurityDsl.g:3933:3: rule__Endpoint__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Endpoint__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEndpointAccess().getGroup_7()); 

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
    // InternalSecurityDsl.g:3941:1: rule__Endpoint__Group__8 : rule__Endpoint__Group__8__Impl ;
    public final void rule__Endpoint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3945:1: ( rule__Endpoint__Group__8__Impl )
            // InternalSecurityDsl.g:3946:2: rule__Endpoint__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__Group__8__Impl();

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
    // InternalSecurityDsl.g:3952:1: rule__Endpoint__Group__8__Impl : ( '}' ) ;
    public final void rule__Endpoint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3956:1: ( ( '}' ) )
            // InternalSecurityDsl.g:3957:1: ( '}' )
            {
            // InternalSecurityDsl.g:3957:1: ( '}' )
            // InternalSecurityDsl.g:3958:2: '}'
            {
             before(grammarAccess.getEndpointAccess().getRightCurlyBracketKeyword_8()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getRightCurlyBracketKeyword_8()); 

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


    // $ANTLR start "rule__Endpoint__Group_4__0"
    // InternalSecurityDsl.g:3968:1: rule__Endpoint__Group_4__0 : rule__Endpoint__Group_4__0__Impl rule__Endpoint__Group_4__1 ;
    public final void rule__Endpoint__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3972:1: ( rule__Endpoint__Group_4__0__Impl rule__Endpoint__Group_4__1 )
            // InternalSecurityDsl.g:3973:2: rule__Endpoint__Group_4__0__Impl rule__Endpoint__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Endpoint__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Endpoint__Group_4__1();

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
    // $ANTLR end "rule__Endpoint__Group_4__0"


    // $ANTLR start "rule__Endpoint__Group_4__0__Impl"
    // InternalSecurityDsl.g:3980:1: rule__Endpoint__Group_4__0__Impl : ( 'functionName' ) ;
    public final void rule__Endpoint__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3984:1: ( ( 'functionName' ) )
            // InternalSecurityDsl.g:3985:1: ( 'functionName' )
            {
            // InternalSecurityDsl.g:3985:1: ( 'functionName' )
            // InternalSecurityDsl.g:3986:2: 'functionName'
            {
             before(grammarAccess.getEndpointAccess().getFunctionNameKeyword_4_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getFunctionNameKeyword_4_0()); 

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
    // $ANTLR end "rule__Endpoint__Group_4__0__Impl"


    // $ANTLR start "rule__Endpoint__Group_4__1"
    // InternalSecurityDsl.g:3995:1: rule__Endpoint__Group_4__1 : rule__Endpoint__Group_4__1__Impl ;
    public final void rule__Endpoint__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3999:1: ( rule__Endpoint__Group_4__1__Impl )
            // InternalSecurityDsl.g:4000:2: rule__Endpoint__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__Group_4__1__Impl();

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
    // $ANTLR end "rule__Endpoint__Group_4__1"


    // $ANTLR start "rule__Endpoint__Group_4__1__Impl"
    // InternalSecurityDsl.g:4006:1: rule__Endpoint__Group_4__1__Impl : ( ( rule__Endpoint__FunctionNameAssignment_4_1 ) ) ;
    public final void rule__Endpoint__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4010:1: ( ( ( rule__Endpoint__FunctionNameAssignment_4_1 ) ) )
            // InternalSecurityDsl.g:4011:1: ( ( rule__Endpoint__FunctionNameAssignment_4_1 ) )
            {
            // InternalSecurityDsl.g:4011:1: ( ( rule__Endpoint__FunctionNameAssignment_4_1 ) )
            // InternalSecurityDsl.g:4012:2: ( rule__Endpoint__FunctionNameAssignment_4_1 )
            {
             before(grammarAccess.getEndpointAccess().getFunctionNameAssignment_4_1()); 
            // InternalSecurityDsl.g:4013:2: ( rule__Endpoint__FunctionNameAssignment_4_1 )
            // InternalSecurityDsl.g:4013:3: rule__Endpoint__FunctionNameAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__FunctionNameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEndpointAccess().getFunctionNameAssignment_4_1()); 

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
    // $ANTLR end "rule__Endpoint__Group_4__1__Impl"


    // $ANTLR start "rule__Endpoint__Group_5__0"
    // InternalSecurityDsl.g:4022:1: rule__Endpoint__Group_5__0 : rule__Endpoint__Group_5__0__Impl rule__Endpoint__Group_5__1 ;
    public final void rule__Endpoint__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4026:1: ( rule__Endpoint__Group_5__0__Impl rule__Endpoint__Group_5__1 )
            // InternalSecurityDsl.g:4027:2: rule__Endpoint__Group_5__0__Impl rule__Endpoint__Group_5__1
            {
            pushFollow(FOLLOW_30);
            rule__Endpoint__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Endpoint__Group_5__1();

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
    // $ANTLR end "rule__Endpoint__Group_5__0"


    // $ANTLR start "rule__Endpoint__Group_5__0__Impl"
    // InternalSecurityDsl.g:4034:1: rule__Endpoint__Group_5__0__Impl : ( 'method' ) ;
    public final void rule__Endpoint__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4038:1: ( ( 'method' ) )
            // InternalSecurityDsl.g:4039:1: ( 'method' )
            {
            // InternalSecurityDsl.g:4039:1: ( 'method' )
            // InternalSecurityDsl.g:4040:2: 'method'
            {
             before(grammarAccess.getEndpointAccess().getMethodKeyword_5_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getMethodKeyword_5_0()); 

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
    // $ANTLR end "rule__Endpoint__Group_5__0__Impl"


    // $ANTLR start "rule__Endpoint__Group_5__1"
    // InternalSecurityDsl.g:4049:1: rule__Endpoint__Group_5__1 : rule__Endpoint__Group_5__1__Impl ;
    public final void rule__Endpoint__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4053:1: ( rule__Endpoint__Group_5__1__Impl )
            // InternalSecurityDsl.g:4054:2: rule__Endpoint__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__Group_5__1__Impl();

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
    // $ANTLR end "rule__Endpoint__Group_5__1"


    // $ANTLR start "rule__Endpoint__Group_5__1__Impl"
    // InternalSecurityDsl.g:4060:1: rule__Endpoint__Group_5__1__Impl : ( ( rule__Endpoint__MethodAssignment_5_1 ) ) ;
    public final void rule__Endpoint__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4064:1: ( ( ( rule__Endpoint__MethodAssignment_5_1 ) ) )
            // InternalSecurityDsl.g:4065:1: ( ( rule__Endpoint__MethodAssignment_5_1 ) )
            {
            // InternalSecurityDsl.g:4065:1: ( ( rule__Endpoint__MethodAssignment_5_1 ) )
            // InternalSecurityDsl.g:4066:2: ( rule__Endpoint__MethodAssignment_5_1 )
            {
             before(grammarAccess.getEndpointAccess().getMethodAssignment_5_1()); 
            // InternalSecurityDsl.g:4067:2: ( rule__Endpoint__MethodAssignment_5_1 )
            // InternalSecurityDsl.g:4067:3: rule__Endpoint__MethodAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__MethodAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEndpointAccess().getMethodAssignment_5_1()); 

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
    // $ANTLR end "rule__Endpoint__Group_5__1__Impl"


    // $ANTLR start "rule__Endpoint__Group_6__0"
    // InternalSecurityDsl.g:4076:1: rule__Endpoint__Group_6__0 : rule__Endpoint__Group_6__0__Impl rule__Endpoint__Group_6__1 ;
    public final void rule__Endpoint__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4080:1: ( rule__Endpoint__Group_6__0__Impl rule__Endpoint__Group_6__1 )
            // InternalSecurityDsl.g:4081:2: rule__Endpoint__Group_6__0__Impl rule__Endpoint__Group_6__1
            {
            pushFollow(FOLLOW_31);
            rule__Endpoint__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Endpoint__Group_6__1();

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
    // $ANTLR end "rule__Endpoint__Group_6__0"


    // $ANTLR start "rule__Endpoint__Group_6__0__Impl"
    // InternalSecurityDsl.g:4088:1: rule__Endpoint__Group_6__0__Impl : ( 'type' ) ;
    public final void rule__Endpoint__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4092:1: ( ( 'type' ) )
            // InternalSecurityDsl.g:4093:1: ( 'type' )
            {
            // InternalSecurityDsl.g:4093:1: ( 'type' )
            // InternalSecurityDsl.g:4094:2: 'type'
            {
             before(grammarAccess.getEndpointAccess().getTypeKeyword_6_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getTypeKeyword_6_0()); 

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
    // $ANTLR end "rule__Endpoint__Group_6__0__Impl"


    // $ANTLR start "rule__Endpoint__Group_6__1"
    // InternalSecurityDsl.g:4103:1: rule__Endpoint__Group_6__1 : rule__Endpoint__Group_6__1__Impl ;
    public final void rule__Endpoint__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4107:1: ( rule__Endpoint__Group_6__1__Impl )
            // InternalSecurityDsl.g:4108:2: rule__Endpoint__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__Group_6__1__Impl();

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
    // $ANTLR end "rule__Endpoint__Group_6__1"


    // $ANTLR start "rule__Endpoint__Group_6__1__Impl"
    // InternalSecurityDsl.g:4114:1: rule__Endpoint__Group_6__1__Impl : ( ( rule__Endpoint__TypeAssignment_6_1 ) ) ;
    public final void rule__Endpoint__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4118:1: ( ( ( rule__Endpoint__TypeAssignment_6_1 ) ) )
            // InternalSecurityDsl.g:4119:1: ( ( rule__Endpoint__TypeAssignment_6_1 ) )
            {
            // InternalSecurityDsl.g:4119:1: ( ( rule__Endpoint__TypeAssignment_6_1 ) )
            // InternalSecurityDsl.g:4120:2: ( rule__Endpoint__TypeAssignment_6_1 )
            {
             before(grammarAccess.getEndpointAccess().getTypeAssignment_6_1()); 
            // InternalSecurityDsl.g:4121:2: ( rule__Endpoint__TypeAssignment_6_1 )
            // InternalSecurityDsl.g:4121:3: rule__Endpoint__TypeAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__TypeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getEndpointAccess().getTypeAssignment_6_1()); 

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
    // $ANTLR end "rule__Endpoint__Group_6__1__Impl"


    // $ANTLR start "rule__Endpoint__Group_7__0"
    // InternalSecurityDsl.g:4130:1: rule__Endpoint__Group_7__0 : rule__Endpoint__Group_7__0__Impl rule__Endpoint__Group_7__1 ;
    public final void rule__Endpoint__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4134:1: ( rule__Endpoint__Group_7__0__Impl rule__Endpoint__Group_7__1 )
            // InternalSecurityDsl.g:4135:2: rule__Endpoint__Group_7__0__Impl rule__Endpoint__Group_7__1
            {
            pushFollow(FOLLOW_32);
            rule__Endpoint__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Endpoint__Group_7__1();

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
    // $ANTLR end "rule__Endpoint__Group_7__0"


    // $ANTLR start "rule__Endpoint__Group_7__0__Impl"
    // InternalSecurityDsl.g:4142:1: rule__Endpoint__Group_7__0__Impl : ( 'role_authorities' ) ;
    public final void rule__Endpoint__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4146:1: ( ( 'role_authorities' ) )
            // InternalSecurityDsl.g:4147:1: ( 'role_authorities' )
            {
            // InternalSecurityDsl.g:4147:1: ( 'role_authorities' )
            // InternalSecurityDsl.g:4148:2: 'role_authorities'
            {
             before(grammarAccess.getEndpointAccess().getRole_authoritiesKeyword_7_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getRole_authoritiesKeyword_7_0()); 

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
    // $ANTLR end "rule__Endpoint__Group_7__0__Impl"


    // $ANTLR start "rule__Endpoint__Group_7__1"
    // InternalSecurityDsl.g:4157:1: rule__Endpoint__Group_7__1 : rule__Endpoint__Group_7__1__Impl rule__Endpoint__Group_7__2 ;
    public final void rule__Endpoint__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4161:1: ( rule__Endpoint__Group_7__1__Impl rule__Endpoint__Group_7__2 )
            // InternalSecurityDsl.g:4162:2: rule__Endpoint__Group_7__1__Impl rule__Endpoint__Group_7__2
            {
            pushFollow(FOLLOW_4);
            rule__Endpoint__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Endpoint__Group_7__2();

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
    // $ANTLR end "rule__Endpoint__Group_7__1"


    // $ANTLR start "rule__Endpoint__Group_7__1__Impl"
    // InternalSecurityDsl.g:4169:1: rule__Endpoint__Group_7__1__Impl : ( '(' ) ;
    public final void rule__Endpoint__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4173:1: ( ( '(' ) )
            // InternalSecurityDsl.g:4174:1: ( '(' )
            {
            // InternalSecurityDsl.g:4174:1: ( '(' )
            // InternalSecurityDsl.g:4175:2: '('
            {
             before(grammarAccess.getEndpointAccess().getLeftParenthesisKeyword_7_1()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getLeftParenthesisKeyword_7_1()); 

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
    // $ANTLR end "rule__Endpoint__Group_7__1__Impl"


    // $ANTLR start "rule__Endpoint__Group_7__2"
    // InternalSecurityDsl.g:4184:1: rule__Endpoint__Group_7__2 : rule__Endpoint__Group_7__2__Impl rule__Endpoint__Group_7__3 ;
    public final void rule__Endpoint__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4188:1: ( rule__Endpoint__Group_7__2__Impl rule__Endpoint__Group_7__3 )
            // InternalSecurityDsl.g:4189:2: rule__Endpoint__Group_7__2__Impl rule__Endpoint__Group_7__3
            {
            pushFollow(FOLLOW_33);
            rule__Endpoint__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Endpoint__Group_7__3();

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
    // $ANTLR end "rule__Endpoint__Group_7__2"


    // $ANTLR start "rule__Endpoint__Group_7__2__Impl"
    // InternalSecurityDsl.g:4196:1: rule__Endpoint__Group_7__2__Impl : ( ( rule__Endpoint__Role_authoritiesAssignment_7_2 ) ) ;
    public final void rule__Endpoint__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4200:1: ( ( ( rule__Endpoint__Role_authoritiesAssignment_7_2 ) ) )
            // InternalSecurityDsl.g:4201:1: ( ( rule__Endpoint__Role_authoritiesAssignment_7_2 ) )
            {
            // InternalSecurityDsl.g:4201:1: ( ( rule__Endpoint__Role_authoritiesAssignment_7_2 ) )
            // InternalSecurityDsl.g:4202:2: ( rule__Endpoint__Role_authoritiesAssignment_7_2 )
            {
             before(grammarAccess.getEndpointAccess().getRole_authoritiesAssignment_7_2()); 
            // InternalSecurityDsl.g:4203:2: ( rule__Endpoint__Role_authoritiesAssignment_7_2 )
            // InternalSecurityDsl.g:4203:3: rule__Endpoint__Role_authoritiesAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__Role_authoritiesAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getEndpointAccess().getRole_authoritiesAssignment_7_2()); 

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
    // $ANTLR end "rule__Endpoint__Group_7__2__Impl"


    // $ANTLR start "rule__Endpoint__Group_7__3"
    // InternalSecurityDsl.g:4211:1: rule__Endpoint__Group_7__3 : rule__Endpoint__Group_7__3__Impl rule__Endpoint__Group_7__4 ;
    public final void rule__Endpoint__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4215:1: ( rule__Endpoint__Group_7__3__Impl rule__Endpoint__Group_7__4 )
            // InternalSecurityDsl.g:4216:2: rule__Endpoint__Group_7__3__Impl rule__Endpoint__Group_7__4
            {
            pushFollow(FOLLOW_33);
            rule__Endpoint__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Endpoint__Group_7__4();

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
    // $ANTLR end "rule__Endpoint__Group_7__3"


    // $ANTLR start "rule__Endpoint__Group_7__3__Impl"
    // InternalSecurityDsl.g:4223:1: rule__Endpoint__Group_7__3__Impl : ( ( rule__Endpoint__Group_7_3__0 )* ) ;
    public final void rule__Endpoint__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4227:1: ( ( ( rule__Endpoint__Group_7_3__0 )* ) )
            // InternalSecurityDsl.g:4228:1: ( ( rule__Endpoint__Group_7_3__0 )* )
            {
            // InternalSecurityDsl.g:4228:1: ( ( rule__Endpoint__Group_7_3__0 )* )
            // InternalSecurityDsl.g:4229:2: ( rule__Endpoint__Group_7_3__0 )*
            {
             before(grammarAccess.getEndpointAccess().getGroup_7_3()); 
            // InternalSecurityDsl.g:4230:2: ( rule__Endpoint__Group_7_3__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==45) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalSecurityDsl.g:4230:3: rule__Endpoint__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Endpoint__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getEndpointAccess().getGroup_7_3()); 

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
    // $ANTLR end "rule__Endpoint__Group_7__3__Impl"


    // $ANTLR start "rule__Endpoint__Group_7__4"
    // InternalSecurityDsl.g:4238:1: rule__Endpoint__Group_7__4 : rule__Endpoint__Group_7__4__Impl ;
    public final void rule__Endpoint__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4242:1: ( rule__Endpoint__Group_7__4__Impl )
            // InternalSecurityDsl.g:4243:2: rule__Endpoint__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__Group_7__4__Impl();

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
    // $ANTLR end "rule__Endpoint__Group_7__4"


    // $ANTLR start "rule__Endpoint__Group_7__4__Impl"
    // InternalSecurityDsl.g:4249:1: rule__Endpoint__Group_7__4__Impl : ( ')' ) ;
    public final void rule__Endpoint__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4253:1: ( ( ')' ) )
            // InternalSecurityDsl.g:4254:1: ( ')' )
            {
            // InternalSecurityDsl.g:4254:1: ( ')' )
            // InternalSecurityDsl.g:4255:2: ')'
            {
             before(grammarAccess.getEndpointAccess().getRightParenthesisKeyword_7_4()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getRightParenthesisKeyword_7_4()); 

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
    // $ANTLR end "rule__Endpoint__Group_7__4__Impl"


    // $ANTLR start "rule__Endpoint__Group_7_3__0"
    // InternalSecurityDsl.g:4265:1: rule__Endpoint__Group_7_3__0 : rule__Endpoint__Group_7_3__0__Impl rule__Endpoint__Group_7_3__1 ;
    public final void rule__Endpoint__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4269:1: ( rule__Endpoint__Group_7_3__0__Impl rule__Endpoint__Group_7_3__1 )
            // InternalSecurityDsl.g:4270:2: rule__Endpoint__Group_7_3__0__Impl rule__Endpoint__Group_7_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Endpoint__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Endpoint__Group_7_3__1();

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
    // $ANTLR end "rule__Endpoint__Group_7_3__0"


    // $ANTLR start "rule__Endpoint__Group_7_3__0__Impl"
    // InternalSecurityDsl.g:4277:1: rule__Endpoint__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Endpoint__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4281:1: ( ( ',' ) )
            // InternalSecurityDsl.g:4282:1: ( ',' )
            {
            // InternalSecurityDsl.g:4282:1: ( ',' )
            // InternalSecurityDsl.g:4283:2: ','
            {
             before(grammarAccess.getEndpointAccess().getCommaKeyword_7_3_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getCommaKeyword_7_3_0()); 

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
    // $ANTLR end "rule__Endpoint__Group_7_3__0__Impl"


    // $ANTLR start "rule__Endpoint__Group_7_3__1"
    // InternalSecurityDsl.g:4292:1: rule__Endpoint__Group_7_3__1 : rule__Endpoint__Group_7_3__1__Impl ;
    public final void rule__Endpoint__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4296:1: ( rule__Endpoint__Group_7_3__1__Impl )
            // InternalSecurityDsl.g:4297:2: rule__Endpoint__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__Group_7_3__1__Impl();

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
    // $ANTLR end "rule__Endpoint__Group_7_3__1"


    // $ANTLR start "rule__Endpoint__Group_7_3__1__Impl"
    // InternalSecurityDsl.g:4303:1: rule__Endpoint__Group_7_3__1__Impl : ( ( rule__Endpoint__Role_authoritiesAssignment_7_3_1 ) ) ;
    public final void rule__Endpoint__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4307:1: ( ( ( rule__Endpoint__Role_authoritiesAssignment_7_3_1 ) ) )
            // InternalSecurityDsl.g:4308:1: ( ( rule__Endpoint__Role_authoritiesAssignment_7_3_1 ) )
            {
            // InternalSecurityDsl.g:4308:1: ( ( rule__Endpoint__Role_authoritiesAssignment_7_3_1 ) )
            // InternalSecurityDsl.g:4309:2: ( rule__Endpoint__Role_authoritiesAssignment_7_3_1 )
            {
             before(grammarAccess.getEndpointAccess().getRole_authoritiesAssignment_7_3_1()); 
            // InternalSecurityDsl.g:4310:2: ( rule__Endpoint__Role_authoritiesAssignment_7_3_1 )
            // InternalSecurityDsl.g:4310:3: rule__Endpoint__Role_authoritiesAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__Role_authoritiesAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEndpointAccess().getRole_authoritiesAssignment_7_3_1()); 

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
    // $ANTLR end "rule__Endpoint__Group_7_3__1__Impl"


    // $ANTLR start "rule__Authentication__Group__0"
    // InternalSecurityDsl.g:4319:1: rule__Authentication__Group__0 : rule__Authentication__Group__0__Impl rule__Authentication__Group__1 ;
    public final void rule__Authentication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4323:1: ( rule__Authentication__Group__0__Impl rule__Authentication__Group__1 )
            // InternalSecurityDsl.g:4324:2: rule__Authentication__Group__0__Impl rule__Authentication__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalSecurityDsl.g:4331:1: rule__Authentication__Group__0__Impl : ( () ) ;
    public final void rule__Authentication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4335:1: ( ( () ) )
            // InternalSecurityDsl.g:4336:1: ( () )
            {
            // InternalSecurityDsl.g:4336:1: ( () )
            // InternalSecurityDsl.g:4337:2: ()
            {
             before(grammarAccess.getAuthenticationAccess().getAuthenticationAction_0()); 
            // InternalSecurityDsl.g:4338:2: ()
            // InternalSecurityDsl.g:4338:3: 
            {
            }

             after(grammarAccess.getAuthenticationAccess().getAuthenticationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group__0__Impl"


    // $ANTLR start "rule__Authentication__Group__1"
    // InternalSecurityDsl.g:4346:1: rule__Authentication__Group__1 : rule__Authentication__Group__1__Impl rule__Authentication__Group__2 ;
    public final void rule__Authentication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4350:1: ( rule__Authentication__Group__1__Impl rule__Authentication__Group__2 )
            // InternalSecurityDsl.g:4351:2: rule__Authentication__Group__1__Impl rule__Authentication__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalSecurityDsl.g:4358:1: rule__Authentication__Group__1__Impl : ( 'Authentication' ) ;
    public final void rule__Authentication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4362:1: ( ( 'Authentication' ) )
            // InternalSecurityDsl.g:4363:1: ( 'Authentication' )
            {
            // InternalSecurityDsl.g:4363:1: ( 'Authentication' )
            // InternalSecurityDsl.g:4364:2: 'Authentication'
            {
             before(grammarAccess.getAuthenticationAccess().getAuthenticationKeyword_1()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getAuthenticationAccess().getAuthenticationKeyword_1()); 

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
    // InternalSecurityDsl.g:4373:1: rule__Authentication__Group__2 : rule__Authentication__Group__2__Impl rule__Authentication__Group__3 ;
    public final void rule__Authentication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4377:1: ( rule__Authentication__Group__2__Impl rule__Authentication__Group__3 )
            // InternalSecurityDsl.g:4378:2: rule__Authentication__Group__2__Impl rule__Authentication__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalSecurityDsl.g:4385:1: rule__Authentication__Group__2__Impl : ( ( rule__Authentication__NameAssignment_2 ) ) ;
    public final void rule__Authentication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4389:1: ( ( ( rule__Authentication__NameAssignment_2 ) ) )
            // InternalSecurityDsl.g:4390:1: ( ( rule__Authentication__NameAssignment_2 ) )
            {
            // InternalSecurityDsl.g:4390:1: ( ( rule__Authentication__NameAssignment_2 ) )
            // InternalSecurityDsl.g:4391:2: ( rule__Authentication__NameAssignment_2 )
            {
             before(grammarAccess.getAuthenticationAccess().getNameAssignment_2()); 
            // InternalSecurityDsl.g:4392:2: ( rule__Authentication__NameAssignment_2 )
            // InternalSecurityDsl.g:4392:3: rule__Authentication__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Authentication__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAuthenticationAccess().getNameAssignment_2()); 

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
    // InternalSecurityDsl.g:4400:1: rule__Authentication__Group__3 : rule__Authentication__Group__3__Impl rule__Authentication__Group__4 ;
    public final void rule__Authentication__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4404:1: ( rule__Authentication__Group__3__Impl rule__Authentication__Group__4 )
            // InternalSecurityDsl.g:4405:2: rule__Authentication__Group__3__Impl rule__Authentication__Group__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalSecurityDsl.g:4412:1: rule__Authentication__Group__3__Impl : ( '{' ) ;
    public final void rule__Authentication__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4416:1: ( ( '{' ) )
            // InternalSecurityDsl.g:4417:1: ( '{' )
            {
            // InternalSecurityDsl.g:4417:1: ( '{' )
            // InternalSecurityDsl.g:4418:2: '{'
            {
             before(grammarAccess.getAuthenticationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAuthenticationAccess().getLeftCurlyBracketKeyword_3()); 

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
    // InternalSecurityDsl.g:4427:1: rule__Authentication__Group__4 : rule__Authentication__Group__4__Impl rule__Authentication__Group__5 ;
    public final void rule__Authentication__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4431:1: ( rule__Authentication__Group__4__Impl rule__Authentication__Group__5 )
            // InternalSecurityDsl.g:4432:2: rule__Authentication__Group__4__Impl rule__Authentication__Group__5
            {
            pushFollow(FOLLOW_34);
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
    // InternalSecurityDsl.g:4439:1: rule__Authentication__Group__4__Impl : ( ( rule__Authentication__Group_4__0 )? ) ;
    public final void rule__Authentication__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4443:1: ( ( ( rule__Authentication__Group_4__0 )? ) )
            // InternalSecurityDsl.g:4444:1: ( ( rule__Authentication__Group_4__0 )? )
            {
            // InternalSecurityDsl.g:4444:1: ( ( rule__Authentication__Group_4__0 )? )
            // InternalSecurityDsl.g:4445:2: ( rule__Authentication__Group_4__0 )?
            {
             before(grammarAccess.getAuthenticationAccess().getGroup_4()); 
            // InternalSecurityDsl.g:4446:2: ( rule__Authentication__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==70) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSecurityDsl.g:4446:3: rule__Authentication__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Authentication__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAuthenticationAccess().getGroup_4()); 

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
    // InternalSecurityDsl.g:4454:1: rule__Authentication__Group__5 : rule__Authentication__Group__5__Impl rule__Authentication__Group__6 ;
    public final void rule__Authentication__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4458:1: ( rule__Authentication__Group__5__Impl rule__Authentication__Group__6 )
            // InternalSecurityDsl.g:4459:2: rule__Authentication__Group__5__Impl rule__Authentication__Group__6
            {
            pushFollow(FOLLOW_34);
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
    // InternalSecurityDsl.g:4466:1: rule__Authentication__Group__5__Impl : ( ( rule__Authentication__Group_5__0 )? ) ;
    public final void rule__Authentication__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4470:1: ( ( ( rule__Authentication__Group_5__0 )? ) )
            // InternalSecurityDsl.g:4471:1: ( ( rule__Authentication__Group_5__0 )? )
            {
            // InternalSecurityDsl.g:4471:1: ( ( rule__Authentication__Group_5__0 )? )
            // InternalSecurityDsl.g:4472:2: ( rule__Authentication__Group_5__0 )?
            {
             before(grammarAccess.getAuthenticationAccess().getGroup_5()); 
            // InternalSecurityDsl.g:4473:2: ( rule__Authentication__Group_5__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==71) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSecurityDsl.g:4473:3: rule__Authentication__Group_5__0
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
    // InternalSecurityDsl.g:4481:1: rule__Authentication__Group__6 : rule__Authentication__Group__6__Impl ;
    public final void rule__Authentication__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4485:1: ( rule__Authentication__Group__6__Impl )
            // InternalSecurityDsl.g:4486:2: rule__Authentication__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Authentication__Group__6__Impl();

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
    // InternalSecurityDsl.g:4492:1: rule__Authentication__Group__6__Impl : ( '}' ) ;
    public final void rule__Authentication__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4496:1: ( ( '}' ) )
            // InternalSecurityDsl.g:4497:1: ( '}' )
            {
            // InternalSecurityDsl.g:4497:1: ( '}' )
            // InternalSecurityDsl.g:4498:2: '}'
            {
             before(grammarAccess.getAuthenticationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAuthenticationAccess().getRightCurlyBracketKeyword_6()); 

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


    // $ANTLR start "rule__Authentication__Group_4__0"
    // InternalSecurityDsl.g:4508:1: rule__Authentication__Group_4__0 : rule__Authentication__Group_4__0__Impl rule__Authentication__Group_4__1 ;
    public final void rule__Authentication__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4512:1: ( rule__Authentication__Group_4__0__Impl rule__Authentication__Group_4__1 )
            // InternalSecurityDsl.g:4513:2: rule__Authentication__Group_4__0__Impl rule__Authentication__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Authentication__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Authentication__Group_4__1();

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
    // $ANTLR end "rule__Authentication__Group_4__0"


    // $ANTLR start "rule__Authentication__Group_4__0__Impl"
    // InternalSecurityDsl.g:4520:1: rule__Authentication__Group_4__0__Impl : ( 'path' ) ;
    public final void rule__Authentication__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4524:1: ( ( 'path' ) )
            // InternalSecurityDsl.g:4525:1: ( 'path' )
            {
            // InternalSecurityDsl.g:4525:1: ( 'path' )
            // InternalSecurityDsl.g:4526:2: 'path'
            {
             before(grammarAccess.getAuthenticationAccess().getPathKeyword_4_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getAuthenticationAccess().getPathKeyword_4_0()); 

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
    // $ANTLR end "rule__Authentication__Group_4__0__Impl"


    // $ANTLR start "rule__Authentication__Group_4__1"
    // InternalSecurityDsl.g:4535:1: rule__Authentication__Group_4__1 : rule__Authentication__Group_4__1__Impl ;
    public final void rule__Authentication__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4539:1: ( rule__Authentication__Group_4__1__Impl )
            // InternalSecurityDsl.g:4540:2: rule__Authentication__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Authentication__Group_4__1__Impl();

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
    // $ANTLR end "rule__Authentication__Group_4__1"


    // $ANTLR start "rule__Authentication__Group_4__1__Impl"
    // InternalSecurityDsl.g:4546:1: rule__Authentication__Group_4__1__Impl : ( ( rule__Authentication__PathAssignment_4_1 ) ) ;
    public final void rule__Authentication__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4550:1: ( ( ( rule__Authentication__PathAssignment_4_1 ) ) )
            // InternalSecurityDsl.g:4551:1: ( ( rule__Authentication__PathAssignment_4_1 ) )
            {
            // InternalSecurityDsl.g:4551:1: ( ( rule__Authentication__PathAssignment_4_1 ) )
            // InternalSecurityDsl.g:4552:2: ( rule__Authentication__PathAssignment_4_1 )
            {
             before(grammarAccess.getAuthenticationAccess().getPathAssignment_4_1()); 
            // InternalSecurityDsl.g:4553:2: ( rule__Authentication__PathAssignment_4_1 )
            // InternalSecurityDsl.g:4553:3: rule__Authentication__PathAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Authentication__PathAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAuthenticationAccess().getPathAssignment_4_1()); 

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
    // $ANTLR end "rule__Authentication__Group_4__1__Impl"


    // $ANTLR start "rule__Authentication__Group_5__0"
    // InternalSecurityDsl.g:4562:1: rule__Authentication__Group_5__0 : rule__Authentication__Group_5__0__Impl rule__Authentication__Group_5__1 ;
    public final void rule__Authentication__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4566:1: ( rule__Authentication__Group_5__0__Impl rule__Authentication__Group_5__1 )
            // InternalSecurityDsl.g:4567:2: rule__Authentication__Group_5__0__Impl rule__Authentication__Group_5__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSecurityDsl.g:4574:1: rule__Authentication__Group_5__0__Impl : ( 'controller_endpoints' ) ;
    public final void rule__Authentication__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4578:1: ( ( 'controller_endpoints' ) )
            // InternalSecurityDsl.g:4579:1: ( 'controller_endpoints' )
            {
            // InternalSecurityDsl.g:4579:1: ( 'controller_endpoints' )
            // InternalSecurityDsl.g:4580:2: 'controller_endpoints'
            {
             before(grammarAccess.getAuthenticationAccess().getController_endpointsKeyword_5_0()); 
            match(input,71,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4589:1: rule__Authentication__Group_5__1 : rule__Authentication__Group_5__1__Impl rule__Authentication__Group_5__2 ;
    public final void rule__Authentication__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4593:1: ( rule__Authentication__Group_5__1__Impl rule__Authentication__Group_5__2 )
            // InternalSecurityDsl.g:4594:2: rule__Authentication__Group_5__1__Impl rule__Authentication__Group_5__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalSecurityDsl.g:4601:1: rule__Authentication__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Authentication__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4605:1: ( ( '{' ) )
            // InternalSecurityDsl.g:4606:1: ( '{' )
            {
            // InternalSecurityDsl.g:4606:1: ( '{' )
            // InternalSecurityDsl.g:4607:2: '{'
            {
             before(grammarAccess.getAuthenticationAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4616:1: rule__Authentication__Group_5__2 : rule__Authentication__Group_5__2__Impl rule__Authentication__Group_5__3 ;
    public final void rule__Authentication__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4620:1: ( rule__Authentication__Group_5__2__Impl rule__Authentication__Group_5__3 )
            // InternalSecurityDsl.g:4621:2: rule__Authentication__Group_5__2__Impl rule__Authentication__Group_5__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalSecurityDsl.g:4628:1: rule__Authentication__Group_5__2__Impl : ( ( rule__Authentication__Controller_endpointsAssignment_5_2 ) ) ;
    public final void rule__Authentication__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4632:1: ( ( ( rule__Authentication__Controller_endpointsAssignment_5_2 ) ) )
            // InternalSecurityDsl.g:4633:1: ( ( rule__Authentication__Controller_endpointsAssignment_5_2 ) )
            {
            // InternalSecurityDsl.g:4633:1: ( ( rule__Authentication__Controller_endpointsAssignment_5_2 ) )
            // InternalSecurityDsl.g:4634:2: ( rule__Authentication__Controller_endpointsAssignment_5_2 )
            {
             before(grammarAccess.getAuthenticationAccess().getController_endpointsAssignment_5_2()); 
            // InternalSecurityDsl.g:4635:2: ( rule__Authentication__Controller_endpointsAssignment_5_2 )
            // InternalSecurityDsl.g:4635:3: rule__Authentication__Controller_endpointsAssignment_5_2
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
    // InternalSecurityDsl.g:4643:1: rule__Authentication__Group_5__3 : rule__Authentication__Group_5__3__Impl rule__Authentication__Group_5__4 ;
    public final void rule__Authentication__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4647:1: ( rule__Authentication__Group_5__3__Impl rule__Authentication__Group_5__4 )
            // InternalSecurityDsl.g:4648:2: rule__Authentication__Group_5__3__Impl rule__Authentication__Group_5__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalSecurityDsl.g:4655:1: rule__Authentication__Group_5__3__Impl : ( ( rule__Authentication__Group_5_3__0 )* ) ;
    public final void rule__Authentication__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4659:1: ( ( ( rule__Authentication__Group_5_3__0 )* ) )
            // InternalSecurityDsl.g:4660:1: ( ( rule__Authentication__Group_5_3__0 )* )
            {
            // InternalSecurityDsl.g:4660:1: ( ( rule__Authentication__Group_5_3__0 )* )
            // InternalSecurityDsl.g:4661:2: ( rule__Authentication__Group_5_3__0 )*
            {
             before(grammarAccess.getAuthenticationAccess().getGroup_5_3()); 
            // InternalSecurityDsl.g:4662:2: ( rule__Authentication__Group_5_3__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==45) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalSecurityDsl.g:4662:3: rule__Authentication__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Authentication__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalSecurityDsl.g:4670:1: rule__Authentication__Group_5__4 : rule__Authentication__Group_5__4__Impl ;
    public final void rule__Authentication__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4674:1: ( rule__Authentication__Group_5__4__Impl )
            // InternalSecurityDsl.g:4675:2: rule__Authentication__Group_5__4__Impl
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
    // InternalSecurityDsl.g:4681:1: rule__Authentication__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Authentication__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4685:1: ( ( '}' ) )
            // InternalSecurityDsl.g:4686:1: ( '}' )
            {
            // InternalSecurityDsl.g:4686:1: ( '}' )
            // InternalSecurityDsl.g:4687:2: '}'
            {
             before(grammarAccess.getAuthenticationAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4697:1: rule__Authentication__Group_5_3__0 : rule__Authentication__Group_5_3__0__Impl rule__Authentication__Group_5_3__1 ;
    public final void rule__Authentication__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4701:1: ( rule__Authentication__Group_5_3__0__Impl rule__Authentication__Group_5_3__1 )
            // InternalSecurityDsl.g:4702:2: rule__Authentication__Group_5_3__0__Impl rule__Authentication__Group_5_3__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalSecurityDsl.g:4709:1: rule__Authentication__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Authentication__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4713:1: ( ( ',' ) )
            // InternalSecurityDsl.g:4714:1: ( ',' )
            {
            // InternalSecurityDsl.g:4714:1: ( ',' )
            // InternalSecurityDsl.g:4715:2: ','
            {
             before(grammarAccess.getAuthenticationAccess().getCommaKeyword_5_3_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4724:1: rule__Authentication__Group_5_3__1 : rule__Authentication__Group_5_3__1__Impl ;
    public final void rule__Authentication__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4728:1: ( rule__Authentication__Group_5_3__1__Impl )
            // InternalSecurityDsl.g:4729:2: rule__Authentication__Group_5_3__1__Impl
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
    // InternalSecurityDsl.g:4735:1: rule__Authentication__Group_5_3__1__Impl : ( ( rule__Authentication__Controller_endpointsAssignment_5_3_1 ) ) ;
    public final void rule__Authentication__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4739:1: ( ( ( rule__Authentication__Controller_endpointsAssignment_5_3_1 ) ) )
            // InternalSecurityDsl.g:4740:1: ( ( rule__Authentication__Controller_endpointsAssignment_5_3_1 ) )
            {
            // InternalSecurityDsl.g:4740:1: ( ( rule__Authentication__Controller_endpointsAssignment_5_3_1 ) )
            // InternalSecurityDsl.g:4741:2: ( rule__Authentication__Controller_endpointsAssignment_5_3_1 )
            {
             before(grammarAccess.getAuthenticationAccess().getController_endpointsAssignment_5_3_1()); 
            // InternalSecurityDsl.g:4742:2: ( rule__Authentication__Controller_endpointsAssignment_5_3_1 )
            // InternalSecurityDsl.g:4742:3: rule__Authentication__Controller_endpointsAssignment_5_3_1
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


    // $ANTLR start "rule__JWT__Group__0"
    // InternalSecurityDsl.g:4751:1: rule__JWT__Group__0 : rule__JWT__Group__0__Impl rule__JWT__Group__1 ;
    public final void rule__JWT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4755:1: ( rule__JWT__Group__0__Impl rule__JWT__Group__1 )
            // InternalSecurityDsl.g:4756:2: rule__JWT__Group__0__Impl rule__JWT__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__JWT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JWT__Group__1();

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
    // $ANTLR end "rule__JWT__Group__0"


    // $ANTLR start "rule__JWT__Group__0__Impl"
    // InternalSecurityDsl.g:4763:1: rule__JWT__Group__0__Impl : ( 'JWT' ) ;
    public final void rule__JWT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4767:1: ( ( 'JWT' ) )
            // InternalSecurityDsl.g:4768:1: ( 'JWT' )
            {
            // InternalSecurityDsl.g:4768:1: ( 'JWT' )
            // InternalSecurityDsl.g:4769:2: 'JWT'
            {
             before(grammarAccess.getJWTAccess().getJWTKeyword_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getJWTAccess().getJWTKeyword_0()); 

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
    // $ANTLR end "rule__JWT__Group__0__Impl"


    // $ANTLR start "rule__JWT__Group__1"
    // InternalSecurityDsl.g:4778:1: rule__JWT__Group__1 : rule__JWT__Group__1__Impl rule__JWT__Group__2 ;
    public final void rule__JWT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4782:1: ( rule__JWT__Group__1__Impl rule__JWT__Group__2 )
            // InternalSecurityDsl.g:4783:2: rule__JWT__Group__1__Impl rule__JWT__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__JWT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JWT__Group__2();

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
    // $ANTLR end "rule__JWT__Group__1"


    // $ANTLR start "rule__JWT__Group__1__Impl"
    // InternalSecurityDsl.g:4790:1: rule__JWT__Group__1__Impl : ( '{' ) ;
    public final void rule__JWT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4794:1: ( ( '{' ) )
            // InternalSecurityDsl.g:4795:1: ( '{' )
            {
            // InternalSecurityDsl.g:4795:1: ( '{' )
            // InternalSecurityDsl.g:4796:2: '{'
            {
             before(grammarAccess.getJWTAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getJWTAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__JWT__Group__1__Impl"


    // $ANTLR start "rule__JWT__Group__2"
    // InternalSecurityDsl.g:4805:1: rule__JWT__Group__2 : rule__JWT__Group__2__Impl rule__JWT__Group__3 ;
    public final void rule__JWT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4809:1: ( rule__JWT__Group__2__Impl rule__JWT__Group__3 )
            // InternalSecurityDsl.g:4810:2: rule__JWT__Group__2__Impl rule__JWT__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__JWT__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JWT__Group__3();

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
    // $ANTLR end "rule__JWT__Group__2"


    // $ANTLR start "rule__JWT__Group__2__Impl"
    // InternalSecurityDsl.g:4817:1: rule__JWT__Group__2__Impl : ( 'signatureAlgorithm' ) ;
    public final void rule__JWT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4821:1: ( ( 'signatureAlgorithm' ) )
            // InternalSecurityDsl.g:4822:1: ( 'signatureAlgorithm' )
            {
            // InternalSecurityDsl.g:4822:1: ( 'signatureAlgorithm' )
            // InternalSecurityDsl.g:4823:2: 'signatureAlgorithm'
            {
             before(grammarAccess.getJWTAccess().getSignatureAlgorithmKeyword_2()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getJWTAccess().getSignatureAlgorithmKeyword_2()); 

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
    // $ANTLR end "rule__JWT__Group__2__Impl"


    // $ANTLR start "rule__JWT__Group__3"
    // InternalSecurityDsl.g:4832:1: rule__JWT__Group__3 : rule__JWT__Group__3__Impl rule__JWT__Group__4 ;
    public final void rule__JWT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4836:1: ( rule__JWT__Group__3__Impl rule__JWT__Group__4 )
            // InternalSecurityDsl.g:4837:2: rule__JWT__Group__3__Impl rule__JWT__Group__4
            {
            pushFollow(FOLLOW_37);
            rule__JWT__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JWT__Group__4();

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
    // $ANTLR end "rule__JWT__Group__3"


    // $ANTLR start "rule__JWT__Group__3__Impl"
    // InternalSecurityDsl.g:4844:1: rule__JWT__Group__3__Impl : ( ( rule__JWT__SignatureAlgorithmAssignment_3 ) ) ;
    public final void rule__JWT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4848:1: ( ( ( rule__JWT__SignatureAlgorithmAssignment_3 ) ) )
            // InternalSecurityDsl.g:4849:1: ( ( rule__JWT__SignatureAlgorithmAssignment_3 ) )
            {
            // InternalSecurityDsl.g:4849:1: ( ( rule__JWT__SignatureAlgorithmAssignment_3 ) )
            // InternalSecurityDsl.g:4850:2: ( rule__JWT__SignatureAlgorithmAssignment_3 )
            {
             before(grammarAccess.getJWTAccess().getSignatureAlgorithmAssignment_3()); 
            // InternalSecurityDsl.g:4851:2: ( rule__JWT__SignatureAlgorithmAssignment_3 )
            // InternalSecurityDsl.g:4851:3: rule__JWT__SignatureAlgorithmAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__JWT__SignatureAlgorithmAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getJWTAccess().getSignatureAlgorithmAssignment_3()); 

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
    // $ANTLR end "rule__JWT__Group__3__Impl"


    // $ANTLR start "rule__JWT__Group__4"
    // InternalSecurityDsl.g:4859:1: rule__JWT__Group__4 : rule__JWT__Group__4__Impl rule__JWT__Group__5 ;
    public final void rule__JWT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4863:1: ( rule__JWT__Group__4__Impl rule__JWT__Group__5 )
            // InternalSecurityDsl.g:4864:2: rule__JWT__Group__4__Impl rule__JWT__Group__5
            {
            pushFollow(FOLLOW_37);
            rule__JWT__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JWT__Group__5();

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
    // $ANTLR end "rule__JWT__Group__4"


    // $ANTLR start "rule__JWT__Group__4__Impl"
    // InternalSecurityDsl.g:4871:1: rule__JWT__Group__4__Impl : ( ( rule__JWT__Group_4__0 )? ) ;
    public final void rule__JWT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4875:1: ( ( ( rule__JWT__Group_4__0 )? ) )
            // InternalSecurityDsl.g:4876:1: ( ( rule__JWT__Group_4__0 )? )
            {
            // InternalSecurityDsl.g:4876:1: ( ( rule__JWT__Group_4__0 )? )
            // InternalSecurityDsl.g:4877:2: ( rule__JWT__Group_4__0 )?
            {
             before(grammarAccess.getJWTAccess().getGroup_4()); 
            // InternalSecurityDsl.g:4878:2: ( rule__JWT__Group_4__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==75) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSecurityDsl.g:4878:3: rule__JWT__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JWT__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJWTAccess().getGroup_4()); 

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
    // $ANTLR end "rule__JWT__Group__4__Impl"


    // $ANTLR start "rule__JWT__Group__5"
    // InternalSecurityDsl.g:4886:1: rule__JWT__Group__5 : rule__JWT__Group__5__Impl rule__JWT__Group__6 ;
    public final void rule__JWT__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4890:1: ( rule__JWT__Group__5__Impl rule__JWT__Group__6 )
            // InternalSecurityDsl.g:4891:2: rule__JWT__Group__5__Impl rule__JWT__Group__6
            {
            pushFollow(FOLLOW_37);
            rule__JWT__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JWT__Group__6();

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
    // $ANTLR end "rule__JWT__Group__5"


    // $ANTLR start "rule__JWT__Group__5__Impl"
    // InternalSecurityDsl.g:4898:1: rule__JWT__Group__5__Impl : ( ( rule__JWT__Group_5__0 )? ) ;
    public final void rule__JWT__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4902:1: ( ( ( rule__JWT__Group_5__0 )? ) )
            // InternalSecurityDsl.g:4903:1: ( ( rule__JWT__Group_5__0 )? )
            {
            // InternalSecurityDsl.g:4903:1: ( ( rule__JWT__Group_5__0 )? )
            // InternalSecurityDsl.g:4904:2: ( rule__JWT__Group_5__0 )?
            {
             before(grammarAccess.getJWTAccess().getGroup_5()); 
            // InternalSecurityDsl.g:4905:2: ( rule__JWT__Group_5__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==76) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSecurityDsl.g:4905:3: rule__JWT__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JWT__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJWTAccess().getGroup_5()); 

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
    // $ANTLR end "rule__JWT__Group__5__Impl"


    // $ANTLR start "rule__JWT__Group__6"
    // InternalSecurityDsl.g:4913:1: rule__JWT__Group__6 : rule__JWT__Group__6__Impl rule__JWT__Group__7 ;
    public final void rule__JWT__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4917:1: ( rule__JWT__Group__6__Impl rule__JWT__Group__7 )
            // InternalSecurityDsl.g:4918:2: rule__JWT__Group__6__Impl rule__JWT__Group__7
            {
            pushFollow(FOLLOW_38);
            rule__JWT__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JWT__Group__7();

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
    // $ANTLR end "rule__JWT__Group__6"


    // $ANTLR start "rule__JWT__Group__6__Impl"
    // InternalSecurityDsl.g:4925:1: rule__JWT__Group__6__Impl : ( 'registeredclaims' ) ;
    public final void rule__JWT__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4929:1: ( ( 'registeredclaims' ) )
            // InternalSecurityDsl.g:4930:1: ( 'registeredclaims' )
            {
            // InternalSecurityDsl.g:4930:1: ( 'registeredclaims' )
            // InternalSecurityDsl.g:4931:2: 'registeredclaims'
            {
             before(grammarAccess.getJWTAccess().getRegisteredclaimsKeyword_6()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getJWTAccess().getRegisteredclaimsKeyword_6()); 

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
    // $ANTLR end "rule__JWT__Group__6__Impl"


    // $ANTLR start "rule__JWT__Group__7"
    // InternalSecurityDsl.g:4940:1: rule__JWT__Group__7 : rule__JWT__Group__7__Impl rule__JWT__Group__8 ;
    public final void rule__JWT__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4944:1: ( rule__JWT__Group__7__Impl rule__JWT__Group__8 )
            // InternalSecurityDsl.g:4945:2: rule__JWT__Group__7__Impl rule__JWT__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__JWT__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JWT__Group__8();

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
    // $ANTLR end "rule__JWT__Group__7"


    // $ANTLR start "rule__JWT__Group__7__Impl"
    // InternalSecurityDsl.g:4952:1: rule__JWT__Group__7__Impl : ( ( rule__JWT__RegisteredclaimsAssignment_7 ) ) ;
    public final void rule__JWT__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4956:1: ( ( ( rule__JWT__RegisteredclaimsAssignment_7 ) ) )
            // InternalSecurityDsl.g:4957:1: ( ( rule__JWT__RegisteredclaimsAssignment_7 ) )
            {
            // InternalSecurityDsl.g:4957:1: ( ( rule__JWT__RegisteredclaimsAssignment_7 ) )
            // InternalSecurityDsl.g:4958:2: ( rule__JWT__RegisteredclaimsAssignment_7 )
            {
             before(grammarAccess.getJWTAccess().getRegisteredclaimsAssignment_7()); 
            // InternalSecurityDsl.g:4959:2: ( rule__JWT__RegisteredclaimsAssignment_7 )
            // InternalSecurityDsl.g:4959:3: rule__JWT__RegisteredclaimsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__JWT__RegisteredclaimsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getJWTAccess().getRegisteredclaimsAssignment_7()); 

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
    // $ANTLR end "rule__JWT__Group__7__Impl"


    // $ANTLR start "rule__JWT__Group__8"
    // InternalSecurityDsl.g:4967:1: rule__JWT__Group__8 : rule__JWT__Group__8__Impl ;
    public final void rule__JWT__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4971:1: ( rule__JWT__Group__8__Impl )
            // InternalSecurityDsl.g:4972:2: rule__JWT__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JWT__Group__8__Impl();

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
    // $ANTLR end "rule__JWT__Group__8"


    // $ANTLR start "rule__JWT__Group__8__Impl"
    // InternalSecurityDsl.g:4978:1: rule__JWT__Group__8__Impl : ( '}' ) ;
    public final void rule__JWT__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4982:1: ( ( '}' ) )
            // InternalSecurityDsl.g:4983:1: ( '}' )
            {
            // InternalSecurityDsl.g:4983:1: ( '}' )
            // InternalSecurityDsl.g:4984:2: '}'
            {
             before(grammarAccess.getJWTAccess().getRightCurlyBracketKeyword_8()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getJWTAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__JWT__Group__8__Impl"


    // $ANTLR start "rule__JWT__Group_4__0"
    // InternalSecurityDsl.g:4994:1: rule__JWT__Group_4__0 : rule__JWT__Group_4__0__Impl rule__JWT__Group_4__1 ;
    public final void rule__JWT__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4998:1: ( rule__JWT__Group_4__0__Impl rule__JWT__Group_4__1 )
            // InternalSecurityDsl.g:4999:2: rule__JWT__Group_4__0__Impl rule__JWT__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__JWT__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JWT__Group_4__1();

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
    // $ANTLR end "rule__JWT__Group_4__0"


    // $ANTLR start "rule__JWT__Group_4__0__Impl"
    // InternalSecurityDsl.g:5006:1: rule__JWT__Group_4__0__Impl : ( 'secret' ) ;
    public final void rule__JWT__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5010:1: ( ( 'secret' ) )
            // InternalSecurityDsl.g:5011:1: ( 'secret' )
            {
            // InternalSecurityDsl.g:5011:1: ( 'secret' )
            // InternalSecurityDsl.g:5012:2: 'secret'
            {
             before(grammarAccess.getJWTAccess().getSecretKeyword_4_0()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getJWTAccess().getSecretKeyword_4_0()); 

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
    // $ANTLR end "rule__JWT__Group_4__0__Impl"


    // $ANTLR start "rule__JWT__Group_4__1"
    // InternalSecurityDsl.g:5021:1: rule__JWT__Group_4__1 : rule__JWT__Group_4__1__Impl ;
    public final void rule__JWT__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5025:1: ( rule__JWT__Group_4__1__Impl )
            // InternalSecurityDsl.g:5026:2: rule__JWT__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JWT__Group_4__1__Impl();

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
    // $ANTLR end "rule__JWT__Group_4__1"


    // $ANTLR start "rule__JWT__Group_4__1__Impl"
    // InternalSecurityDsl.g:5032:1: rule__JWT__Group_4__1__Impl : ( ( rule__JWT__SecretAssignment_4_1 ) ) ;
    public final void rule__JWT__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5036:1: ( ( ( rule__JWT__SecretAssignment_4_1 ) ) )
            // InternalSecurityDsl.g:5037:1: ( ( rule__JWT__SecretAssignment_4_1 ) )
            {
            // InternalSecurityDsl.g:5037:1: ( ( rule__JWT__SecretAssignment_4_1 ) )
            // InternalSecurityDsl.g:5038:2: ( rule__JWT__SecretAssignment_4_1 )
            {
             before(grammarAccess.getJWTAccess().getSecretAssignment_4_1()); 
            // InternalSecurityDsl.g:5039:2: ( rule__JWT__SecretAssignment_4_1 )
            // InternalSecurityDsl.g:5039:3: rule__JWT__SecretAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__JWT__SecretAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getJWTAccess().getSecretAssignment_4_1()); 

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
    // $ANTLR end "rule__JWT__Group_4__1__Impl"


    // $ANTLR start "rule__JWT__Group_5__0"
    // InternalSecurityDsl.g:5048:1: rule__JWT__Group_5__0 : rule__JWT__Group_5__0__Impl rule__JWT__Group_5__1 ;
    public final void rule__JWT__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5052:1: ( rule__JWT__Group_5__0__Impl rule__JWT__Group_5__1 )
            // InternalSecurityDsl.g:5053:2: rule__JWT__Group_5__0__Impl rule__JWT__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__JWT__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JWT__Group_5__1();

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
    // $ANTLR end "rule__JWT__Group_5__0"


    // $ANTLR start "rule__JWT__Group_5__0__Impl"
    // InternalSecurityDsl.g:5060:1: rule__JWT__Group_5__0__Impl : ( 'jwt_claims' ) ;
    public final void rule__JWT__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5064:1: ( ( 'jwt_claims' ) )
            // InternalSecurityDsl.g:5065:1: ( 'jwt_claims' )
            {
            // InternalSecurityDsl.g:5065:1: ( 'jwt_claims' )
            // InternalSecurityDsl.g:5066:2: 'jwt_claims'
            {
             before(grammarAccess.getJWTAccess().getJwt_claimsKeyword_5_0()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getJWTAccess().getJwt_claimsKeyword_5_0()); 

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
    // $ANTLR end "rule__JWT__Group_5__0__Impl"


    // $ANTLR start "rule__JWT__Group_5__1"
    // InternalSecurityDsl.g:5075:1: rule__JWT__Group_5__1 : rule__JWT__Group_5__1__Impl rule__JWT__Group_5__2 ;
    public final void rule__JWT__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5079:1: ( rule__JWT__Group_5__1__Impl rule__JWT__Group_5__2 )
            // InternalSecurityDsl.g:5080:2: rule__JWT__Group_5__1__Impl rule__JWT__Group_5__2
            {
            pushFollow(FOLLOW_39);
            rule__JWT__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JWT__Group_5__2();

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
    // $ANTLR end "rule__JWT__Group_5__1"


    // $ANTLR start "rule__JWT__Group_5__1__Impl"
    // InternalSecurityDsl.g:5087:1: rule__JWT__Group_5__1__Impl : ( '{' ) ;
    public final void rule__JWT__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5091:1: ( ( '{' ) )
            // InternalSecurityDsl.g:5092:1: ( '{' )
            {
            // InternalSecurityDsl.g:5092:1: ( '{' )
            // InternalSecurityDsl.g:5093:2: '{'
            {
             before(grammarAccess.getJWTAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getJWTAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__JWT__Group_5__1__Impl"


    // $ANTLR start "rule__JWT__Group_5__2"
    // InternalSecurityDsl.g:5102:1: rule__JWT__Group_5__2 : rule__JWT__Group_5__2__Impl rule__JWT__Group_5__3 ;
    public final void rule__JWT__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5106:1: ( rule__JWT__Group_5__2__Impl rule__JWT__Group_5__3 )
            // InternalSecurityDsl.g:5107:2: rule__JWT__Group_5__2__Impl rule__JWT__Group_5__3
            {
            pushFollow(FOLLOW_10);
            rule__JWT__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JWT__Group_5__3();

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
    // $ANTLR end "rule__JWT__Group_5__2"


    // $ANTLR start "rule__JWT__Group_5__2__Impl"
    // InternalSecurityDsl.g:5114:1: rule__JWT__Group_5__2__Impl : ( ( rule__JWT__Jwt_claimsAssignment_5_2 ) ) ;
    public final void rule__JWT__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5118:1: ( ( ( rule__JWT__Jwt_claimsAssignment_5_2 ) ) )
            // InternalSecurityDsl.g:5119:1: ( ( rule__JWT__Jwt_claimsAssignment_5_2 ) )
            {
            // InternalSecurityDsl.g:5119:1: ( ( rule__JWT__Jwt_claimsAssignment_5_2 ) )
            // InternalSecurityDsl.g:5120:2: ( rule__JWT__Jwt_claimsAssignment_5_2 )
            {
             before(grammarAccess.getJWTAccess().getJwt_claimsAssignment_5_2()); 
            // InternalSecurityDsl.g:5121:2: ( rule__JWT__Jwt_claimsAssignment_5_2 )
            // InternalSecurityDsl.g:5121:3: rule__JWT__Jwt_claimsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__JWT__Jwt_claimsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getJWTAccess().getJwt_claimsAssignment_5_2()); 

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
    // $ANTLR end "rule__JWT__Group_5__2__Impl"


    // $ANTLR start "rule__JWT__Group_5__3"
    // InternalSecurityDsl.g:5129:1: rule__JWT__Group_5__3 : rule__JWT__Group_5__3__Impl rule__JWT__Group_5__4 ;
    public final void rule__JWT__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5133:1: ( rule__JWT__Group_5__3__Impl rule__JWT__Group_5__4 )
            // InternalSecurityDsl.g:5134:2: rule__JWT__Group_5__3__Impl rule__JWT__Group_5__4
            {
            pushFollow(FOLLOW_10);
            rule__JWT__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JWT__Group_5__4();

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
    // $ANTLR end "rule__JWT__Group_5__3"


    // $ANTLR start "rule__JWT__Group_5__3__Impl"
    // InternalSecurityDsl.g:5141:1: rule__JWT__Group_5__3__Impl : ( ( rule__JWT__Group_5_3__0 )* ) ;
    public final void rule__JWT__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5145:1: ( ( ( rule__JWT__Group_5_3__0 )* ) )
            // InternalSecurityDsl.g:5146:1: ( ( rule__JWT__Group_5_3__0 )* )
            {
            // InternalSecurityDsl.g:5146:1: ( ( rule__JWT__Group_5_3__0 )* )
            // InternalSecurityDsl.g:5147:2: ( rule__JWT__Group_5_3__0 )*
            {
             before(grammarAccess.getJWTAccess().getGroup_5_3()); 
            // InternalSecurityDsl.g:5148:2: ( rule__JWT__Group_5_3__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==45) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalSecurityDsl.g:5148:3: rule__JWT__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__JWT__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getJWTAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__JWT__Group_5__3__Impl"


    // $ANTLR start "rule__JWT__Group_5__4"
    // InternalSecurityDsl.g:5156:1: rule__JWT__Group_5__4 : rule__JWT__Group_5__4__Impl ;
    public final void rule__JWT__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5160:1: ( rule__JWT__Group_5__4__Impl )
            // InternalSecurityDsl.g:5161:2: rule__JWT__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JWT__Group_5__4__Impl();

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
    // $ANTLR end "rule__JWT__Group_5__4"


    // $ANTLR start "rule__JWT__Group_5__4__Impl"
    // InternalSecurityDsl.g:5167:1: rule__JWT__Group_5__4__Impl : ( '}' ) ;
    public final void rule__JWT__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5171:1: ( ( '}' ) )
            // InternalSecurityDsl.g:5172:1: ( '}' )
            {
            // InternalSecurityDsl.g:5172:1: ( '}' )
            // InternalSecurityDsl.g:5173:2: '}'
            {
             before(grammarAccess.getJWTAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getJWTAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__JWT__Group_5__4__Impl"


    // $ANTLR start "rule__JWT__Group_5_3__0"
    // InternalSecurityDsl.g:5183:1: rule__JWT__Group_5_3__0 : rule__JWT__Group_5_3__0__Impl rule__JWT__Group_5_3__1 ;
    public final void rule__JWT__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5187:1: ( rule__JWT__Group_5_3__0__Impl rule__JWT__Group_5_3__1 )
            // InternalSecurityDsl.g:5188:2: rule__JWT__Group_5_3__0__Impl rule__JWT__Group_5_3__1
            {
            pushFollow(FOLLOW_39);
            rule__JWT__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JWT__Group_5_3__1();

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
    // $ANTLR end "rule__JWT__Group_5_3__0"


    // $ANTLR start "rule__JWT__Group_5_3__0__Impl"
    // InternalSecurityDsl.g:5195:1: rule__JWT__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__JWT__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5199:1: ( ( ',' ) )
            // InternalSecurityDsl.g:5200:1: ( ',' )
            {
            // InternalSecurityDsl.g:5200:1: ( ',' )
            // InternalSecurityDsl.g:5201:2: ','
            {
             before(grammarAccess.getJWTAccess().getCommaKeyword_5_3_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getJWTAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__JWT__Group_5_3__0__Impl"


    // $ANTLR start "rule__JWT__Group_5_3__1"
    // InternalSecurityDsl.g:5210:1: rule__JWT__Group_5_3__1 : rule__JWT__Group_5_3__1__Impl ;
    public final void rule__JWT__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5214:1: ( rule__JWT__Group_5_3__1__Impl )
            // InternalSecurityDsl.g:5215:2: rule__JWT__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JWT__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__JWT__Group_5_3__1"


    // $ANTLR start "rule__JWT__Group_5_3__1__Impl"
    // InternalSecurityDsl.g:5221:1: rule__JWT__Group_5_3__1__Impl : ( ( rule__JWT__Jwt_claimsAssignment_5_3_1 ) ) ;
    public final void rule__JWT__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5225:1: ( ( ( rule__JWT__Jwt_claimsAssignment_5_3_1 ) ) )
            // InternalSecurityDsl.g:5226:1: ( ( rule__JWT__Jwt_claimsAssignment_5_3_1 ) )
            {
            // InternalSecurityDsl.g:5226:1: ( ( rule__JWT__Jwt_claimsAssignment_5_3_1 ) )
            // InternalSecurityDsl.g:5227:2: ( rule__JWT__Jwt_claimsAssignment_5_3_1 )
            {
             before(grammarAccess.getJWTAccess().getJwt_claimsAssignment_5_3_1()); 
            // InternalSecurityDsl.g:5228:2: ( rule__JWT__Jwt_claimsAssignment_5_3_1 )
            // InternalSecurityDsl.g:5228:3: rule__JWT__Jwt_claimsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__JWT__Jwt_claimsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getJWTAccess().getJwt_claimsAssignment_5_3_1()); 

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
    // $ANTLR end "rule__JWT__Group_5_3__1__Impl"


    // $ANTLR start "rule__Claim__Group__0"
    // InternalSecurityDsl.g:5237:1: rule__Claim__Group__0 : rule__Claim__Group__0__Impl rule__Claim__Group__1 ;
    public final void rule__Claim__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5241:1: ( rule__Claim__Group__0__Impl rule__Claim__Group__1 )
            // InternalSecurityDsl.g:5242:2: rule__Claim__Group__0__Impl rule__Claim__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Claim__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Claim__Group__1();

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
    // $ANTLR end "rule__Claim__Group__0"


    // $ANTLR start "rule__Claim__Group__0__Impl"
    // InternalSecurityDsl.g:5249:1: rule__Claim__Group__0__Impl : ( 'Claim' ) ;
    public final void rule__Claim__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5253:1: ( ( 'Claim' ) )
            // InternalSecurityDsl.g:5254:1: ( 'Claim' )
            {
            // InternalSecurityDsl.g:5254:1: ( 'Claim' )
            // InternalSecurityDsl.g:5255:2: 'Claim'
            {
             before(grammarAccess.getClaimAccess().getClaimKeyword_0()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getClaimAccess().getClaimKeyword_0()); 

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
    // $ANTLR end "rule__Claim__Group__0__Impl"


    // $ANTLR start "rule__Claim__Group__1"
    // InternalSecurityDsl.g:5264:1: rule__Claim__Group__1 : rule__Claim__Group__1__Impl rule__Claim__Group__2 ;
    public final void rule__Claim__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5268:1: ( rule__Claim__Group__1__Impl rule__Claim__Group__2 )
            // InternalSecurityDsl.g:5269:2: rule__Claim__Group__1__Impl rule__Claim__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Claim__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Claim__Group__2();

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
    // $ANTLR end "rule__Claim__Group__1"


    // $ANTLR start "rule__Claim__Group__1__Impl"
    // InternalSecurityDsl.g:5276:1: rule__Claim__Group__1__Impl : ( ( rule__Claim__NameAssignment_1 ) ) ;
    public final void rule__Claim__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5280:1: ( ( ( rule__Claim__NameAssignment_1 ) ) )
            // InternalSecurityDsl.g:5281:1: ( ( rule__Claim__NameAssignment_1 ) )
            {
            // InternalSecurityDsl.g:5281:1: ( ( rule__Claim__NameAssignment_1 ) )
            // InternalSecurityDsl.g:5282:2: ( rule__Claim__NameAssignment_1 )
            {
             before(grammarAccess.getClaimAccess().getNameAssignment_1()); 
            // InternalSecurityDsl.g:5283:2: ( rule__Claim__NameAssignment_1 )
            // InternalSecurityDsl.g:5283:3: rule__Claim__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Claim__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClaimAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Claim__Group__1__Impl"


    // $ANTLR start "rule__Claim__Group__2"
    // InternalSecurityDsl.g:5291:1: rule__Claim__Group__2 : rule__Claim__Group__2__Impl rule__Claim__Group__3 ;
    public final void rule__Claim__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5295:1: ( rule__Claim__Group__2__Impl rule__Claim__Group__3 )
            // InternalSecurityDsl.g:5296:2: rule__Claim__Group__2__Impl rule__Claim__Group__3
            {
            pushFollow(FOLLOW_40);
            rule__Claim__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Claim__Group__3();

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
    // $ANTLR end "rule__Claim__Group__2"


    // $ANTLR start "rule__Claim__Group__2__Impl"
    // InternalSecurityDsl.g:5303:1: rule__Claim__Group__2__Impl : ( '{' ) ;
    public final void rule__Claim__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5307:1: ( ( '{' ) )
            // InternalSecurityDsl.g:5308:1: ( '{' )
            {
            // InternalSecurityDsl.g:5308:1: ( '{' )
            // InternalSecurityDsl.g:5309:2: '{'
            {
             before(grammarAccess.getClaimAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getClaimAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Claim__Group__2__Impl"


    // $ANTLR start "rule__Claim__Group__3"
    // InternalSecurityDsl.g:5318:1: rule__Claim__Group__3 : rule__Claim__Group__3__Impl rule__Claim__Group__4 ;
    public final void rule__Claim__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5322:1: ( rule__Claim__Group__3__Impl rule__Claim__Group__4 )
            // InternalSecurityDsl.g:5323:2: rule__Claim__Group__3__Impl rule__Claim__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__Claim__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Claim__Group__4();

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
    // $ANTLR end "rule__Claim__Group__3"


    // $ANTLR start "rule__Claim__Group__3__Impl"
    // InternalSecurityDsl.g:5330:1: rule__Claim__Group__3__Impl : ( ( rule__Claim__Group_3__0 )? ) ;
    public final void rule__Claim__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5334:1: ( ( ( rule__Claim__Group_3__0 )? ) )
            // InternalSecurityDsl.g:5335:1: ( ( rule__Claim__Group_3__0 )? )
            {
            // InternalSecurityDsl.g:5335:1: ( ( rule__Claim__Group_3__0 )? )
            // InternalSecurityDsl.g:5336:2: ( rule__Claim__Group_3__0 )?
            {
             before(grammarAccess.getClaimAccess().getGroup_3()); 
            // InternalSecurityDsl.g:5337:2: ( rule__Claim__Group_3__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==55) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSecurityDsl.g:5337:3: rule__Claim__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Claim__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClaimAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Claim__Group__3__Impl"


    // $ANTLR start "rule__Claim__Group__4"
    // InternalSecurityDsl.g:5345:1: rule__Claim__Group__4 : rule__Claim__Group__4__Impl rule__Claim__Group__5 ;
    public final void rule__Claim__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5349:1: ( rule__Claim__Group__4__Impl rule__Claim__Group__5 )
            // InternalSecurityDsl.g:5350:2: rule__Claim__Group__4__Impl rule__Claim__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Claim__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Claim__Group__5();

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
    // $ANTLR end "rule__Claim__Group__4"


    // $ANTLR start "rule__Claim__Group__4__Impl"
    // InternalSecurityDsl.g:5357:1: rule__Claim__Group__4__Impl : ( 'claim_attribute' ) ;
    public final void rule__Claim__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5361:1: ( ( 'claim_attribute' ) )
            // InternalSecurityDsl.g:5362:1: ( 'claim_attribute' )
            {
            // InternalSecurityDsl.g:5362:1: ( 'claim_attribute' )
            // InternalSecurityDsl.g:5363:2: 'claim_attribute'
            {
             before(grammarAccess.getClaimAccess().getClaim_attributeKeyword_4()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getClaimAccess().getClaim_attributeKeyword_4()); 

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
    // $ANTLR end "rule__Claim__Group__4__Impl"


    // $ANTLR start "rule__Claim__Group__5"
    // InternalSecurityDsl.g:5372:1: rule__Claim__Group__5 : rule__Claim__Group__5__Impl rule__Claim__Group__6 ;
    public final void rule__Claim__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5376:1: ( rule__Claim__Group__5__Impl rule__Claim__Group__6 )
            // InternalSecurityDsl.g:5377:2: rule__Claim__Group__5__Impl rule__Claim__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Claim__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Claim__Group__6();

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
    // $ANTLR end "rule__Claim__Group__5"


    // $ANTLR start "rule__Claim__Group__5__Impl"
    // InternalSecurityDsl.g:5384:1: rule__Claim__Group__5__Impl : ( ( rule__Claim__Claim_attributeAssignment_5 ) ) ;
    public final void rule__Claim__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5388:1: ( ( ( rule__Claim__Claim_attributeAssignment_5 ) ) )
            // InternalSecurityDsl.g:5389:1: ( ( rule__Claim__Claim_attributeAssignment_5 ) )
            {
            // InternalSecurityDsl.g:5389:1: ( ( rule__Claim__Claim_attributeAssignment_5 ) )
            // InternalSecurityDsl.g:5390:2: ( rule__Claim__Claim_attributeAssignment_5 )
            {
             before(grammarAccess.getClaimAccess().getClaim_attributeAssignment_5()); 
            // InternalSecurityDsl.g:5391:2: ( rule__Claim__Claim_attributeAssignment_5 )
            // InternalSecurityDsl.g:5391:3: rule__Claim__Claim_attributeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Claim__Claim_attributeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getClaimAccess().getClaim_attributeAssignment_5()); 

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
    // $ANTLR end "rule__Claim__Group__5__Impl"


    // $ANTLR start "rule__Claim__Group__6"
    // InternalSecurityDsl.g:5399:1: rule__Claim__Group__6 : rule__Claim__Group__6__Impl ;
    public final void rule__Claim__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5403:1: ( rule__Claim__Group__6__Impl )
            // InternalSecurityDsl.g:5404:2: rule__Claim__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Claim__Group__6__Impl();

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
    // $ANTLR end "rule__Claim__Group__6"


    // $ANTLR start "rule__Claim__Group__6__Impl"
    // InternalSecurityDsl.g:5410:1: rule__Claim__Group__6__Impl : ( '}' ) ;
    public final void rule__Claim__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5414:1: ( ( '}' ) )
            // InternalSecurityDsl.g:5415:1: ( '}' )
            {
            // InternalSecurityDsl.g:5415:1: ( '}' )
            // InternalSecurityDsl.g:5416:2: '}'
            {
             before(grammarAccess.getClaimAccess().getRightCurlyBracketKeyword_6()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getClaimAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Claim__Group__6__Impl"


    // $ANTLR start "rule__Claim__Group_3__0"
    // InternalSecurityDsl.g:5426:1: rule__Claim__Group_3__0 : rule__Claim__Group_3__0__Impl rule__Claim__Group_3__1 ;
    public final void rule__Claim__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5430:1: ( rule__Claim__Group_3__0__Impl rule__Claim__Group_3__1 )
            // InternalSecurityDsl.g:5431:2: rule__Claim__Group_3__0__Impl rule__Claim__Group_3__1
            {
            pushFollow(FOLLOW_41);
            rule__Claim__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Claim__Group_3__1();

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
    // $ANTLR end "rule__Claim__Group_3__0"


    // $ANTLR start "rule__Claim__Group_3__0__Impl"
    // InternalSecurityDsl.g:5438:1: rule__Claim__Group_3__0__Impl : ( 'type' ) ;
    public final void rule__Claim__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5442:1: ( ( 'type' ) )
            // InternalSecurityDsl.g:5443:1: ( 'type' )
            {
            // InternalSecurityDsl.g:5443:1: ( 'type' )
            // InternalSecurityDsl.g:5444:2: 'type'
            {
             before(grammarAccess.getClaimAccess().getTypeKeyword_3_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getClaimAccess().getTypeKeyword_3_0()); 

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
    // $ANTLR end "rule__Claim__Group_3__0__Impl"


    // $ANTLR start "rule__Claim__Group_3__1"
    // InternalSecurityDsl.g:5453:1: rule__Claim__Group_3__1 : rule__Claim__Group_3__1__Impl ;
    public final void rule__Claim__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5457:1: ( rule__Claim__Group_3__1__Impl )
            // InternalSecurityDsl.g:5458:2: rule__Claim__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Claim__Group_3__1__Impl();

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
    // $ANTLR end "rule__Claim__Group_3__1"


    // $ANTLR start "rule__Claim__Group_3__1__Impl"
    // InternalSecurityDsl.g:5464:1: rule__Claim__Group_3__1__Impl : ( ( rule__Claim__TypeAssignment_3_1 ) ) ;
    public final void rule__Claim__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5468:1: ( ( ( rule__Claim__TypeAssignment_3_1 ) ) )
            // InternalSecurityDsl.g:5469:1: ( ( rule__Claim__TypeAssignment_3_1 ) )
            {
            // InternalSecurityDsl.g:5469:1: ( ( rule__Claim__TypeAssignment_3_1 ) )
            // InternalSecurityDsl.g:5470:2: ( rule__Claim__TypeAssignment_3_1 )
            {
             before(grammarAccess.getClaimAccess().getTypeAssignment_3_1()); 
            // InternalSecurityDsl.g:5471:2: ( rule__Claim__TypeAssignment_3_1 )
            // InternalSecurityDsl.g:5471:3: rule__Claim__TypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Claim__TypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClaimAccess().getTypeAssignment_3_1()); 

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
    // $ANTLR end "rule__Claim__Group_3__1__Impl"


    // $ANTLR start "rule__RegisteredClaims__Group__0"
    // InternalSecurityDsl.g:5480:1: rule__RegisteredClaims__Group__0 : rule__RegisteredClaims__Group__0__Impl rule__RegisteredClaims__Group__1 ;
    public final void rule__RegisteredClaims__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5484:1: ( rule__RegisteredClaims__Group__0__Impl rule__RegisteredClaims__Group__1 )
            // InternalSecurityDsl.g:5485:2: rule__RegisteredClaims__Group__0__Impl rule__RegisteredClaims__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__RegisteredClaims__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegisteredClaims__Group__1();

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
    // $ANTLR end "rule__RegisteredClaims__Group__0"


    // $ANTLR start "rule__RegisteredClaims__Group__0__Impl"
    // InternalSecurityDsl.g:5492:1: rule__RegisteredClaims__Group__0__Impl : ( 'RegisteredClaims' ) ;
    public final void rule__RegisteredClaims__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5496:1: ( ( 'RegisteredClaims' ) )
            // InternalSecurityDsl.g:5497:1: ( 'RegisteredClaims' )
            {
            // InternalSecurityDsl.g:5497:1: ( 'RegisteredClaims' )
            // InternalSecurityDsl.g:5498:2: 'RegisteredClaims'
            {
             before(grammarAccess.getRegisteredClaimsAccess().getRegisteredClaimsKeyword_0()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getRegisteredClaimsAccess().getRegisteredClaimsKeyword_0()); 

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
    // $ANTLR end "rule__RegisteredClaims__Group__0__Impl"


    // $ANTLR start "rule__RegisteredClaims__Group__1"
    // InternalSecurityDsl.g:5507:1: rule__RegisteredClaims__Group__1 : rule__RegisteredClaims__Group__1__Impl rule__RegisteredClaims__Group__2 ;
    public final void rule__RegisteredClaims__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5511:1: ( rule__RegisteredClaims__Group__1__Impl rule__RegisteredClaims__Group__2 )
            // InternalSecurityDsl.g:5512:2: rule__RegisteredClaims__Group__1__Impl rule__RegisteredClaims__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__RegisteredClaims__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegisteredClaims__Group__2();

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
    // $ANTLR end "rule__RegisteredClaims__Group__1"


    // $ANTLR start "rule__RegisteredClaims__Group__1__Impl"
    // InternalSecurityDsl.g:5519:1: rule__RegisteredClaims__Group__1__Impl : ( '{' ) ;
    public final void rule__RegisteredClaims__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5523:1: ( ( '{' ) )
            // InternalSecurityDsl.g:5524:1: ( '{' )
            {
            // InternalSecurityDsl.g:5524:1: ( '{' )
            // InternalSecurityDsl.g:5525:2: '{'
            {
             before(grammarAccess.getRegisteredClaimsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRegisteredClaimsAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__RegisteredClaims__Group__1__Impl"


    // $ANTLR start "rule__RegisteredClaims__Group__2"
    // InternalSecurityDsl.g:5534:1: rule__RegisteredClaims__Group__2 : rule__RegisteredClaims__Group__2__Impl rule__RegisteredClaims__Group__3 ;
    public final void rule__RegisteredClaims__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5538:1: ( rule__RegisteredClaims__Group__2__Impl rule__RegisteredClaims__Group__3 )
            // InternalSecurityDsl.g:5539:2: rule__RegisteredClaims__Group__2__Impl rule__RegisteredClaims__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__RegisteredClaims__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegisteredClaims__Group__3();

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
    // $ANTLR end "rule__RegisteredClaims__Group__2"


    // $ANTLR start "rule__RegisteredClaims__Group__2__Impl"
    // InternalSecurityDsl.g:5546:1: rule__RegisteredClaims__Group__2__Impl : ( 'expirationTime' ) ;
    public final void rule__RegisteredClaims__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5550:1: ( ( 'expirationTime' ) )
            // InternalSecurityDsl.g:5551:1: ( 'expirationTime' )
            {
            // InternalSecurityDsl.g:5551:1: ( 'expirationTime' )
            // InternalSecurityDsl.g:5552:2: 'expirationTime'
            {
             before(grammarAccess.getRegisteredClaimsAccess().getExpirationTimeKeyword_2()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getRegisteredClaimsAccess().getExpirationTimeKeyword_2()); 

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
    // $ANTLR end "rule__RegisteredClaims__Group__2__Impl"


    // $ANTLR start "rule__RegisteredClaims__Group__3"
    // InternalSecurityDsl.g:5561:1: rule__RegisteredClaims__Group__3 : rule__RegisteredClaims__Group__3__Impl rule__RegisteredClaims__Group__4 ;
    public final void rule__RegisteredClaims__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5565:1: ( rule__RegisteredClaims__Group__3__Impl rule__RegisteredClaims__Group__4 )
            // InternalSecurityDsl.g:5566:2: rule__RegisteredClaims__Group__3__Impl rule__RegisteredClaims__Group__4
            {
            pushFollow(FOLLOW_43);
            rule__RegisteredClaims__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegisteredClaims__Group__4();

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
    // $ANTLR end "rule__RegisteredClaims__Group__3"


    // $ANTLR start "rule__RegisteredClaims__Group__3__Impl"
    // InternalSecurityDsl.g:5573:1: rule__RegisteredClaims__Group__3__Impl : ( ( rule__RegisteredClaims__ExpirationTimeAssignment_3 ) ) ;
    public final void rule__RegisteredClaims__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5577:1: ( ( ( rule__RegisteredClaims__ExpirationTimeAssignment_3 ) ) )
            // InternalSecurityDsl.g:5578:1: ( ( rule__RegisteredClaims__ExpirationTimeAssignment_3 ) )
            {
            // InternalSecurityDsl.g:5578:1: ( ( rule__RegisteredClaims__ExpirationTimeAssignment_3 ) )
            // InternalSecurityDsl.g:5579:2: ( rule__RegisteredClaims__ExpirationTimeAssignment_3 )
            {
             before(grammarAccess.getRegisteredClaimsAccess().getExpirationTimeAssignment_3()); 
            // InternalSecurityDsl.g:5580:2: ( rule__RegisteredClaims__ExpirationTimeAssignment_3 )
            // InternalSecurityDsl.g:5580:3: rule__RegisteredClaims__ExpirationTimeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RegisteredClaims__ExpirationTimeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRegisteredClaimsAccess().getExpirationTimeAssignment_3()); 

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
    // $ANTLR end "rule__RegisteredClaims__Group__3__Impl"


    // $ANTLR start "rule__RegisteredClaims__Group__4"
    // InternalSecurityDsl.g:5588:1: rule__RegisteredClaims__Group__4 : rule__RegisteredClaims__Group__4__Impl rule__RegisteredClaims__Group__5 ;
    public final void rule__RegisteredClaims__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5592:1: ( rule__RegisteredClaims__Group__4__Impl rule__RegisteredClaims__Group__5 )
            // InternalSecurityDsl.g:5593:2: rule__RegisteredClaims__Group__4__Impl rule__RegisteredClaims__Group__5
            {
            pushFollow(FOLLOW_43);
            rule__RegisteredClaims__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegisteredClaims__Group__5();

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
    // $ANTLR end "rule__RegisteredClaims__Group__4"


    // $ANTLR start "rule__RegisteredClaims__Group__4__Impl"
    // InternalSecurityDsl.g:5600:1: rule__RegisteredClaims__Group__4__Impl : ( ( rule__RegisteredClaims__Group_4__0 )? ) ;
    public final void rule__RegisteredClaims__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5604:1: ( ( ( rule__RegisteredClaims__Group_4__0 )? ) )
            // InternalSecurityDsl.g:5605:1: ( ( rule__RegisteredClaims__Group_4__0 )? )
            {
            // InternalSecurityDsl.g:5605:1: ( ( rule__RegisteredClaims__Group_4__0 )? )
            // InternalSecurityDsl.g:5606:2: ( rule__RegisteredClaims__Group_4__0 )?
            {
             before(grammarAccess.getRegisteredClaimsAccess().getGroup_4()); 
            // InternalSecurityDsl.g:5607:2: ( rule__RegisteredClaims__Group_4__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==81) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSecurityDsl.g:5607:3: rule__RegisteredClaims__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegisteredClaims__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegisteredClaimsAccess().getGroup_4()); 

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
    // $ANTLR end "rule__RegisteredClaims__Group__4__Impl"


    // $ANTLR start "rule__RegisteredClaims__Group__5"
    // InternalSecurityDsl.g:5615:1: rule__RegisteredClaims__Group__5 : rule__RegisteredClaims__Group__5__Impl rule__RegisteredClaims__Group__6 ;
    public final void rule__RegisteredClaims__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5619:1: ( rule__RegisteredClaims__Group__5__Impl rule__RegisteredClaims__Group__6 )
            // InternalSecurityDsl.g:5620:2: rule__RegisteredClaims__Group__5__Impl rule__RegisteredClaims__Group__6
            {
            pushFollow(FOLLOW_43);
            rule__RegisteredClaims__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegisteredClaims__Group__6();

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
    // $ANTLR end "rule__RegisteredClaims__Group__5"


    // $ANTLR start "rule__RegisteredClaims__Group__5__Impl"
    // InternalSecurityDsl.g:5627:1: rule__RegisteredClaims__Group__5__Impl : ( ( rule__RegisteredClaims__Group_5__0 )? ) ;
    public final void rule__RegisteredClaims__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5631:1: ( ( ( rule__RegisteredClaims__Group_5__0 )? ) )
            // InternalSecurityDsl.g:5632:1: ( ( rule__RegisteredClaims__Group_5__0 )? )
            {
            // InternalSecurityDsl.g:5632:1: ( ( rule__RegisteredClaims__Group_5__0 )? )
            // InternalSecurityDsl.g:5633:2: ( rule__RegisteredClaims__Group_5__0 )?
            {
             before(grammarAccess.getRegisteredClaimsAccess().getGroup_5()); 
            // InternalSecurityDsl.g:5634:2: ( rule__RegisteredClaims__Group_5__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==82) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSecurityDsl.g:5634:3: rule__RegisteredClaims__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegisteredClaims__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegisteredClaimsAccess().getGroup_5()); 

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
    // $ANTLR end "rule__RegisteredClaims__Group__5__Impl"


    // $ANTLR start "rule__RegisteredClaims__Group__6"
    // InternalSecurityDsl.g:5642:1: rule__RegisteredClaims__Group__6 : rule__RegisteredClaims__Group__6__Impl ;
    public final void rule__RegisteredClaims__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5646:1: ( rule__RegisteredClaims__Group__6__Impl )
            // InternalSecurityDsl.g:5647:2: rule__RegisteredClaims__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegisteredClaims__Group__6__Impl();

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
    // $ANTLR end "rule__RegisteredClaims__Group__6"


    // $ANTLR start "rule__RegisteredClaims__Group__6__Impl"
    // InternalSecurityDsl.g:5653:1: rule__RegisteredClaims__Group__6__Impl : ( '}' ) ;
    public final void rule__RegisteredClaims__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5657:1: ( ( '}' ) )
            // InternalSecurityDsl.g:5658:1: ( '}' )
            {
            // InternalSecurityDsl.g:5658:1: ( '}' )
            // InternalSecurityDsl.g:5659:2: '}'
            {
             before(grammarAccess.getRegisteredClaimsAccess().getRightCurlyBracketKeyword_6()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRegisteredClaimsAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__RegisteredClaims__Group__6__Impl"


    // $ANTLR start "rule__RegisteredClaims__Group_4__0"
    // InternalSecurityDsl.g:5669:1: rule__RegisteredClaims__Group_4__0 : rule__RegisteredClaims__Group_4__0__Impl rule__RegisteredClaims__Group_4__1 ;
    public final void rule__RegisteredClaims__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5673:1: ( rule__RegisteredClaims__Group_4__0__Impl rule__RegisteredClaims__Group_4__1 )
            // InternalSecurityDsl.g:5674:2: rule__RegisteredClaims__Group_4__0__Impl rule__RegisteredClaims__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__RegisteredClaims__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegisteredClaims__Group_4__1();

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
    // $ANTLR end "rule__RegisteredClaims__Group_4__0"


    // $ANTLR start "rule__RegisteredClaims__Group_4__0__Impl"
    // InternalSecurityDsl.g:5681:1: rule__RegisteredClaims__Group_4__0__Impl : ( 'issuer' ) ;
    public final void rule__RegisteredClaims__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5685:1: ( ( 'issuer' ) )
            // InternalSecurityDsl.g:5686:1: ( 'issuer' )
            {
            // InternalSecurityDsl.g:5686:1: ( 'issuer' )
            // InternalSecurityDsl.g:5687:2: 'issuer'
            {
             before(grammarAccess.getRegisteredClaimsAccess().getIssuerKeyword_4_0()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getRegisteredClaimsAccess().getIssuerKeyword_4_0()); 

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
    // $ANTLR end "rule__RegisteredClaims__Group_4__0__Impl"


    // $ANTLR start "rule__RegisteredClaims__Group_4__1"
    // InternalSecurityDsl.g:5696:1: rule__RegisteredClaims__Group_4__1 : rule__RegisteredClaims__Group_4__1__Impl ;
    public final void rule__RegisteredClaims__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5700:1: ( rule__RegisteredClaims__Group_4__1__Impl )
            // InternalSecurityDsl.g:5701:2: rule__RegisteredClaims__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegisteredClaims__Group_4__1__Impl();

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
    // $ANTLR end "rule__RegisteredClaims__Group_4__1"


    // $ANTLR start "rule__RegisteredClaims__Group_4__1__Impl"
    // InternalSecurityDsl.g:5707:1: rule__RegisteredClaims__Group_4__1__Impl : ( ( rule__RegisteredClaims__IssuerAssignment_4_1 ) ) ;
    public final void rule__RegisteredClaims__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5711:1: ( ( ( rule__RegisteredClaims__IssuerAssignment_4_1 ) ) )
            // InternalSecurityDsl.g:5712:1: ( ( rule__RegisteredClaims__IssuerAssignment_4_1 ) )
            {
            // InternalSecurityDsl.g:5712:1: ( ( rule__RegisteredClaims__IssuerAssignment_4_1 ) )
            // InternalSecurityDsl.g:5713:2: ( rule__RegisteredClaims__IssuerAssignment_4_1 )
            {
             before(grammarAccess.getRegisteredClaimsAccess().getIssuerAssignment_4_1()); 
            // InternalSecurityDsl.g:5714:2: ( rule__RegisteredClaims__IssuerAssignment_4_1 )
            // InternalSecurityDsl.g:5714:3: rule__RegisteredClaims__IssuerAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RegisteredClaims__IssuerAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRegisteredClaimsAccess().getIssuerAssignment_4_1()); 

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
    // $ANTLR end "rule__RegisteredClaims__Group_4__1__Impl"


    // $ANTLR start "rule__RegisteredClaims__Group_5__0"
    // InternalSecurityDsl.g:5723:1: rule__RegisteredClaims__Group_5__0 : rule__RegisteredClaims__Group_5__0__Impl rule__RegisteredClaims__Group_5__1 ;
    public final void rule__RegisteredClaims__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5727:1: ( rule__RegisteredClaims__Group_5__0__Impl rule__RegisteredClaims__Group_5__1 )
            // InternalSecurityDsl.g:5728:2: rule__RegisteredClaims__Group_5__0__Impl rule__RegisteredClaims__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__RegisteredClaims__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegisteredClaims__Group_5__1();

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
    // $ANTLR end "rule__RegisteredClaims__Group_5__0"


    // $ANTLR start "rule__RegisteredClaims__Group_5__0__Impl"
    // InternalSecurityDsl.g:5735:1: rule__RegisteredClaims__Group_5__0__Impl : ( 'audience' ) ;
    public final void rule__RegisteredClaims__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5739:1: ( ( 'audience' ) )
            // InternalSecurityDsl.g:5740:1: ( 'audience' )
            {
            // InternalSecurityDsl.g:5740:1: ( 'audience' )
            // InternalSecurityDsl.g:5741:2: 'audience'
            {
             before(grammarAccess.getRegisteredClaimsAccess().getAudienceKeyword_5_0()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getRegisteredClaimsAccess().getAudienceKeyword_5_0()); 

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
    // $ANTLR end "rule__RegisteredClaims__Group_5__0__Impl"


    // $ANTLR start "rule__RegisteredClaims__Group_5__1"
    // InternalSecurityDsl.g:5750:1: rule__RegisteredClaims__Group_5__1 : rule__RegisteredClaims__Group_5__1__Impl ;
    public final void rule__RegisteredClaims__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5754:1: ( rule__RegisteredClaims__Group_5__1__Impl )
            // InternalSecurityDsl.g:5755:2: rule__RegisteredClaims__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegisteredClaims__Group_5__1__Impl();

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
    // $ANTLR end "rule__RegisteredClaims__Group_5__1"


    // $ANTLR start "rule__RegisteredClaims__Group_5__1__Impl"
    // InternalSecurityDsl.g:5761:1: rule__RegisteredClaims__Group_5__1__Impl : ( ( rule__RegisteredClaims__AudienceAssignment_5_1 ) ) ;
    public final void rule__RegisteredClaims__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5765:1: ( ( ( rule__RegisteredClaims__AudienceAssignment_5_1 ) ) )
            // InternalSecurityDsl.g:5766:1: ( ( rule__RegisteredClaims__AudienceAssignment_5_1 ) )
            {
            // InternalSecurityDsl.g:5766:1: ( ( rule__RegisteredClaims__AudienceAssignment_5_1 ) )
            // InternalSecurityDsl.g:5767:2: ( rule__RegisteredClaims__AudienceAssignment_5_1 )
            {
             before(grammarAccess.getRegisteredClaimsAccess().getAudienceAssignment_5_1()); 
            // InternalSecurityDsl.g:5768:2: ( rule__RegisteredClaims__AudienceAssignment_5_1 )
            // InternalSecurityDsl.g:5768:3: rule__RegisteredClaims__AudienceAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__RegisteredClaims__AudienceAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRegisteredClaimsAccess().getAudienceAssignment_5_1()); 

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
    // $ANTLR end "rule__RegisteredClaims__Group_5__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalSecurityDsl.g:5777:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5781:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalSecurityDsl.g:5782:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalSecurityDsl.g:5789:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5793:1: ( ( ( '-' )? ) )
            // InternalSecurityDsl.g:5794:1: ( ( '-' )? )
            {
            // InternalSecurityDsl.g:5794:1: ( ( '-' )? )
            // InternalSecurityDsl.g:5795:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalSecurityDsl.g:5796:2: ( '-' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==53) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalSecurityDsl.g:5796:3: '-'
                    {
                    match(input,53,FOLLOW_2); 

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
    // InternalSecurityDsl.g:5804:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5808:1: ( rule__EInt__Group__1__Impl )
            // InternalSecurityDsl.g:5809:2: rule__EInt__Group__1__Impl
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
    // InternalSecurityDsl.g:5815:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5819:1: ( ( RULE_INT ) )
            // InternalSecurityDsl.g:5820:1: ( RULE_INT )
            {
            // InternalSecurityDsl.g:5820:1: ( RULE_INT )
            // InternalSecurityDsl.g:5821:2: RULE_INT
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


    // $ANTLR start "rule__Application__NameAssignment_2"
    // InternalSecurityDsl.g:5831:1: rule__Application__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Application__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5835:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5836:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5836:2: ( ruleEString )
            // InternalSecurityDsl.g:5837:3: ruleEString
            {
             before(grammarAccess.getApplicationAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Application__NameAssignment_2"


    // $ANTLR start "rule__Application__DescriptionAssignment_4_1"
    // InternalSecurityDsl.g:5846:1: rule__Application__DescriptionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Application__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5850:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5851:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5851:2: ( ruleEString )
            // InternalSecurityDsl.g:5852:3: ruleEString
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


    // $ANTLR start "rule__Application__GroupAssignment_5_1"
    // InternalSecurityDsl.g:5861:1: rule__Application__GroupAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Application__GroupAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5865:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5866:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5866:2: ( ruleEString )
            // InternalSecurityDsl.g:5867:3: ruleEString
            {
             before(grammarAccess.getApplicationAccess().getGroupEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getGroupEStringParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Application__GroupAssignment_5_1"


    // $ANTLR start "rule__Application__ArtifactAssignment_6_1"
    // InternalSecurityDsl.g:5876:1: rule__Application__ArtifactAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Application__ArtifactAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5880:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5881:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5881:2: ( ruleEString )
            // InternalSecurityDsl.g:5882:3: ruleEString
            {
             before(grammarAccess.getApplicationAccess().getArtifactEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getArtifactEStringParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Application__ArtifactAssignment_6_1"


    // $ANTLR start "rule__Application__PackageNameAssignment_7_1"
    // InternalSecurityDsl.g:5891:1: rule__Application__PackageNameAssignment_7_1 : ( ruleEString ) ;
    public final void rule__Application__PackageNameAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5895:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5896:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5896:2: ( ruleEString )
            // InternalSecurityDsl.g:5897:3: ruleEString
            {
             before(grammarAccess.getApplicationAccess().getPackageNameEStringParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getPackageNameEStringParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Application__PackageNameAssignment_7_1"


    // $ANTLR start "rule__Application__PortAssignment_8_1"
    // InternalSecurityDsl.g:5906:1: rule__Application__PortAssignment_8_1 : ( ruleELongObject ) ;
    public final void rule__Application__PortAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5910:1: ( ( ruleELongObject ) )
            // InternalSecurityDsl.g:5911:2: ( ruleELongObject )
            {
            // InternalSecurityDsl.g:5911:2: ( ruleELongObject )
            // InternalSecurityDsl.g:5912:3: ruleELongObject
            {
             before(grammarAccess.getApplicationAccess().getPortELongObjectParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleELongObject();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getPortELongObjectParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__Application__PortAssignment_8_1"


    // $ANTLR start "rule__Application__HostnameAssignment_9_1"
    // InternalSecurityDsl.g:5921:1: rule__Application__HostnameAssignment_9_1 : ( ruleEString ) ;
    public final void rule__Application__HostnameAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5925:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5926:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5926:2: ( ruleEString )
            // InternalSecurityDsl.g:5927:3: ruleEString
            {
             before(grammarAccess.getApplicationAccess().getHostnameEStringParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getHostnameEStringParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__Application__HostnameAssignment_9_1"


    // $ANTLR start "rule__Application__App_databaseAssignment_10_1"
    // InternalSecurityDsl.g:5936:1: rule__Application__App_databaseAssignment_10_1 : ( ruleDatabase ) ;
    public final void rule__Application__App_databaseAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5940:1: ( ( ruleDatabase ) )
            // InternalSecurityDsl.g:5941:2: ( ruleDatabase )
            {
            // InternalSecurityDsl.g:5941:2: ( ruleDatabase )
            // InternalSecurityDsl.g:5942:3: ruleDatabase
            {
             before(grammarAccess.getApplicationAccess().getApp_databaseDatabaseParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDatabase();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getApp_databaseDatabaseParserRuleCall_10_1_0()); 

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
    // $ANTLR end "rule__Application__App_databaseAssignment_10_1"


    // $ANTLR start "rule__Application__App_modelsAssignment_11_2"
    // InternalSecurityDsl.g:5951:1: rule__Application__App_modelsAssignment_11_2 : ( ruleModel ) ;
    public final void rule__Application__App_modelsAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5955:1: ( ( ruleModel ) )
            // InternalSecurityDsl.g:5956:2: ( ruleModel )
            {
            // InternalSecurityDsl.g:5956:2: ( ruleModel )
            // InternalSecurityDsl.g:5957:3: ruleModel
            {
             before(grammarAccess.getApplicationAccess().getApp_modelsModelParserRuleCall_11_2_0()); 
            pushFollow(FOLLOW_2);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getApp_modelsModelParserRuleCall_11_2_0()); 

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
    // $ANTLR end "rule__Application__App_modelsAssignment_11_2"


    // $ANTLR start "rule__Application__App_modelsAssignment_11_3_1"
    // InternalSecurityDsl.g:5966:1: rule__Application__App_modelsAssignment_11_3_1 : ( ruleModel ) ;
    public final void rule__Application__App_modelsAssignment_11_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5970:1: ( ( ruleModel ) )
            // InternalSecurityDsl.g:5971:2: ( ruleModel )
            {
            // InternalSecurityDsl.g:5971:2: ( ruleModel )
            // InternalSecurityDsl.g:5972:3: ruleModel
            {
             before(grammarAccess.getApplicationAccess().getApp_modelsModelParserRuleCall_11_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getApp_modelsModelParserRuleCall_11_3_1_0()); 

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
    // $ANTLR end "rule__Application__App_modelsAssignment_11_3_1"


    // $ANTLR start "rule__Application__App_controllersAssignment_12_2"
    // InternalSecurityDsl.g:5981:1: rule__Application__App_controllersAssignment_12_2 : ( ruleController ) ;
    public final void rule__Application__App_controllersAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5985:1: ( ( ruleController ) )
            // InternalSecurityDsl.g:5986:2: ( ruleController )
            {
            // InternalSecurityDsl.g:5986:2: ( ruleController )
            // InternalSecurityDsl.g:5987:3: ruleController
            {
             before(grammarAccess.getApplicationAccess().getApp_controllersControllerParserRuleCall_12_2_0()); 
            pushFollow(FOLLOW_2);
            ruleController();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getApp_controllersControllerParserRuleCall_12_2_0()); 

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
    // $ANTLR end "rule__Application__App_controllersAssignment_12_2"


    // $ANTLR start "rule__Application__App_controllersAssignment_12_3_1"
    // InternalSecurityDsl.g:5996:1: rule__Application__App_controllersAssignment_12_3_1 : ( ruleController ) ;
    public final void rule__Application__App_controllersAssignment_12_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6000:1: ( ( ruleController ) )
            // InternalSecurityDsl.g:6001:2: ( ruleController )
            {
            // InternalSecurityDsl.g:6001:2: ( ruleController )
            // InternalSecurityDsl.g:6002:3: ruleController
            {
             before(grammarAccess.getApplicationAccess().getApp_controllersControllerParserRuleCall_12_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleController();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getApp_controllersControllerParserRuleCall_12_3_1_0()); 

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
    // $ANTLR end "rule__Application__App_controllersAssignment_12_3_1"


    // $ANTLR start "rule__Application__App_securityAssignment_13_1"
    // InternalSecurityDsl.g:6011:1: rule__Application__App_securityAssignment_13_1 : ( ruleSecurity ) ;
    public final void rule__Application__App_securityAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6015:1: ( ( ruleSecurity ) )
            // InternalSecurityDsl.g:6016:2: ( ruleSecurity )
            {
            // InternalSecurityDsl.g:6016:2: ( ruleSecurity )
            // InternalSecurityDsl.g:6017:3: ruleSecurity
            {
             before(grammarAccess.getApplicationAccess().getApp_securitySecurityParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSecurity();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getApp_securitySecurityParserRuleCall_13_1_0()); 

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
    // $ANTLR end "rule__Application__App_securityAssignment_13_1"


    // $ANTLR start "rule__Database__VendorNameAssignment_3"
    // InternalSecurityDsl.g:6026:1: rule__Database__VendorNameAssignment_3 : ( ruleEDatabaseType ) ;
    public final void rule__Database__VendorNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6030:1: ( ( ruleEDatabaseType ) )
            // InternalSecurityDsl.g:6031:2: ( ruleEDatabaseType )
            {
            // InternalSecurityDsl.g:6031:2: ( ruleEDatabaseType )
            // InternalSecurityDsl.g:6032:3: ruleEDatabaseType
            {
             before(grammarAccess.getDatabaseAccess().getVendorNameEDatabaseTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEDatabaseType();

            state._fsp--;

             after(grammarAccess.getDatabaseAccess().getVendorNameEDatabaseTypeEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__Database__VendorNameAssignment_3"


    // $ANTLR start "rule__Database__UrlAssignment_5"
    // InternalSecurityDsl.g:6041:1: rule__Database__UrlAssignment_5 : ( ruleEString ) ;
    public final void rule__Database__UrlAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6045:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6046:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6046:2: ( ruleEString )
            // InternalSecurityDsl.g:6047:3: ruleEString
            {
             before(grammarAccess.getDatabaseAccess().getUrlEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDatabaseAccess().getUrlEStringParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Database__UrlAssignment_5"


    // $ANTLR start "rule__Database__UsernameAssignment_7"
    // InternalSecurityDsl.g:6056:1: rule__Database__UsernameAssignment_7 : ( ruleEString ) ;
    public final void rule__Database__UsernameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6060:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6061:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6061:2: ( ruleEString )
            // InternalSecurityDsl.g:6062:3: ruleEString
            {
             before(grammarAccess.getDatabaseAccess().getUsernameEStringParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDatabaseAccess().getUsernameEStringParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Database__UsernameAssignment_7"


    // $ANTLR start "rule__Database__PasswordAssignment_9"
    // InternalSecurityDsl.g:6071:1: rule__Database__PasswordAssignment_9 : ( ruleEString ) ;
    public final void rule__Database__PasswordAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6075:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6076:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6076:2: ( ruleEString )
            // InternalSecurityDsl.g:6077:3: ruleEString
            {
             before(grammarAccess.getDatabaseAccess().getPasswordEStringParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDatabaseAccess().getPasswordEStringParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Database__PasswordAssignment_9"


    // $ANTLR start "rule__Attribute__IsIdentifierAssignment_0"
    // InternalSecurityDsl.g:6086:1: rule__Attribute__IsIdentifierAssignment_0 : ( ( 'isIdentifier' ) ) ;
    public final void rule__Attribute__IsIdentifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6090:1: ( ( ( 'isIdentifier' ) ) )
            // InternalSecurityDsl.g:6091:2: ( ( 'isIdentifier' ) )
            {
            // InternalSecurityDsl.g:6091:2: ( ( 'isIdentifier' ) )
            // InternalSecurityDsl.g:6092:3: ( 'isIdentifier' )
            {
             before(grammarAccess.getAttributeAccess().getIsIdentifierIsIdentifierKeyword_0_0()); 
            // InternalSecurityDsl.g:6093:3: ( 'isIdentifier' )
            // InternalSecurityDsl.g:6094:4: 'isIdentifier'
            {
             before(grammarAccess.getAttributeAccess().getIsIdentifierIsIdentifierKeyword_0_0()); 
            match(input,83,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getIsIdentifierIsIdentifierKeyword_0_0()); 

            }

             after(grammarAccess.getAttributeAccess().getIsIdentifierIsIdentifierKeyword_0_0()); 

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
    // $ANTLR end "rule__Attribute__IsIdentifierAssignment_0"


    // $ANTLR start "rule__Attribute__NameAssignment_2"
    // InternalSecurityDsl.g:6105:1: rule__Attribute__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6109:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6110:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6110:2: ( ruleEString )
            // InternalSecurityDsl.g:6111:3: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Attribute__NameAssignment_2"


    // $ANTLR start "rule__Attribute__TypeAssignment_5"
    // InternalSecurityDsl.g:6120:1: rule__Attribute__TypeAssignment_5 : ( ruleEType ) ;
    public final void rule__Attribute__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6124:1: ( ( ruleEType ) )
            // InternalSecurityDsl.g:6125:2: ( ruleEType )
            {
            // InternalSecurityDsl.g:6125:2: ( ruleEType )
            // InternalSecurityDsl.g:6126:3: ruleEType
            {
             before(grammarAccess.getAttributeAccess().getTypeETypeEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeETypeEnumRuleCall_5_0()); 

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
    // $ANTLR end "rule__Attribute__TypeAssignment_5"


    // $ANTLR start "rule__Attribute__CollumnNameAssignment_6_1"
    // InternalSecurityDsl.g:6135:1: rule__Attribute__CollumnNameAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Attribute__CollumnNameAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6139:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6140:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6140:2: ( ruleEString )
            // InternalSecurityDsl.g:6141:3: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getCollumnNameEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getCollumnNameEStringParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Attribute__CollumnNameAssignment_6_1"


    // $ANTLR start "rule__Role__TableNameAssignment_3_1"
    // InternalSecurityDsl.g:6150:1: rule__Role__TableNameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Role__TableNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6154:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6155:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6155:2: ( ruleEString )
            // InternalSecurityDsl.g:6156:3: ruleEString
            {
             before(grammarAccess.getRoleAccess().getTableNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getTableNameEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Role__TableNameAssignment_3_1"


    // $ANTLR start "rule__Role__Model_attributesAssignment_4_2"
    // InternalSecurityDsl.g:6165:1: rule__Role__Model_attributesAssignment_4_2 : ( ruleAttribute ) ;
    public final void rule__Role__Model_attributesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6169:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:6170:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:6170:2: ( ruleAttribute )
            // InternalSecurityDsl.g:6171:3: ruleAttribute
            {
             before(grammarAccess.getRoleAccess().getModel_attributesAttributeParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getModel_attributesAttributeParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Role__Model_attributesAssignment_4_2"


    // $ANTLR start "rule__Role__Model_attributesAssignment_4_3_1"
    // InternalSecurityDsl.g:6180:1: rule__Role__Model_attributesAssignment_4_3_1 : ( ruleAttribute ) ;
    public final void rule__Role__Model_attributesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6184:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:6185:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:6185:2: ( ruleAttribute )
            // InternalSecurityDsl.g:6186:3: ruleAttribute
            {
             before(grammarAccess.getRoleAccess().getModel_attributesAttributeParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getModel_attributesAttributeParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Role__Model_attributesAssignment_4_3_1"


    // $ANTLR start "rule__Role__Role_instancesAssignment_5_2"
    // InternalSecurityDsl.g:6195:1: rule__Role__Role_instancesAssignment_5_2 : ( ruleRoleInstance ) ;
    public final void rule__Role__Role_instancesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6199:1: ( ( ruleRoleInstance ) )
            // InternalSecurityDsl.g:6200:2: ( ruleRoleInstance )
            {
            // InternalSecurityDsl.g:6200:2: ( ruleRoleInstance )
            // InternalSecurityDsl.g:6201:3: ruleRoleInstance
            {
             before(grammarAccess.getRoleAccess().getRole_instancesRoleInstanceParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRoleInstance();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getRole_instancesRoleInstanceParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Role__Role_instancesAssignment_5_2"


    // $ANTLR start "rule__Role__Role_instancesAssignment_5_3_1"
    // InternalSecurityDsl.g:6210:1: rule__Role__Role_instancesAssignment_5_3_1 : ( ruleRoleInstance ) ;
    public final void rule__Role__Role_instancesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6214:1: ( ( ruleRoleInstance ) )
            // InternalSecurityDsl.g:6215:2: ( ruleRoleInstance )
            {
            // InternalSecurityDsl.g:6215:2: ( ruleRoleInstance )
            // InternalSecurityDsl.g:6216:3: ruleRoleInstance
            {
             before(grammarAccess.getRoleAccess().getRole_instancesRoleInstanceParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRoleInstance();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getRole_instancesRoleInstanceParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__Role__Role_instancesAssignment_5_3_1"


    // $ANTLR start "rule__User__TableNameAssignment_3_1"
    // InternalSecurityDsl.g:6225:1: rule__User__TableNameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__User__TableNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6229:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6230:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6230:2: ( ruleEString )
            // InternalSecurityDsl.g:6231:3: ruleEString
            {
             before(grammarAccess.getUserAccess().getTableNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUserAccess().getTableNameEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__User__TableNameAssignment_3_1"


    // $ANTLR start "rule__User__Model_attributesAssignment_4_2"
    // InternalSecurityDsl.g:6240:1: rule__User__Model_attributesAssignment_4_2 : ( ruleAttribute ) ;
    public final void rule__User__Model_attributesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6244:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:6245:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:6245:2: ( ruleAttribute )
            // InternalSecurityDsl.g:6246:3: ruleAttribute
            {
             before(grammarAccess.getUserAccess().getModel_attributesAttributeParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getUserAccess().getModel_attributesAttributeParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__User__Model_attributesAssignment_4_2"


    // $ANTLR start "rule__User__Model_attributesAssignment_4_3_1"
    // InternalSecurityDsl.g:6255:1: rule__User__Model_attributesAssignment_4_3_1 : ( ruleAttribute ) ;
    public final void rule__User__Model_attributesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6259:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:6260:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:6260:2: ( ruleAttribute )
            // InternalSecurityDsl.g:6261:3: ruleAttribute
            {
             before(grammarAccess.getUserAccess().getModel_attributesAttributeParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getUserAccess().getModel_attributesAttributeParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__User__Model_attributesAssignment_4_3_1"


    // $ANTLR start "rule__RoleInstance__NameAssignment_2"
    // InternalSecurityDsl.g:6270:1: rule__RoleInstance__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RoleInstance__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6274:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6275:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6275:2: ( ruleEString )
            // InternalSecurityDsl.g:6276:3: ruleEString
            {
             before(grammarAccess.getRoleInstanceAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoleInstanceAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__RoleInstance__NameAssignment_2"


    // $ANTLR start "rule__Endpoint__UrlAssignment_3"
    // InternalSecurityDsl.g:6285:1: rule__Endpoint__UrlAssignment_3 : ( ruleEString ) ;
    public final void rule__Endpoint__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6289:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6290:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6290:2: ( ruleEString )
            // InternalSecurityDsl.g:6291:3: ruleEString
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


    // $ANTLR start "rule__Endpoint__FunctionNameAssignment_4_1"
    // InternalSecurityDsl.g:6300:1: rule__Endpoint__FunctionNameAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Endpoint__FunctionNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6304:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6305:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6305:2: ( ruleEString )
            // InternalSecurityDsl.g:6306:3: ruleEString
            {
             before(grammarAccess.getEndpointAccess().getFunctionNameEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEndpointAccess().getFunctionNameEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Endpoint__FunctionNameAssignment_4_1"


    // $ANTLR start "rule__Endpoint__MethodAssignment_5_1"
    // InternalSecurityDsl.g:6315:1: rule__Endpoint__MethodAssignment_5_1 : ( ruleEEndpointMethod ) ;
    public final void rule__Endpoint__MethodAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6319:1: ( ( ruleEEndpointMethod ) )
            // InternalSecurityDsl.g:6320:2: ( ruleEEndpointMethod )
            {
            // InternalSecurityDsl.g:6320:2: ( ruleEEndpointMethod )
            // InternalSecurityDsl.g:6321:3: ruleEEndpointMethod
            {
             before(grammarAccess.getEndpointAccess().getMethodEEndpointMethodEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEEndpointMethod();

            state._fsp--;

             after(grammarAccess.getEndpointAccess().getMethodEEndpointMethodEnumRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Endpoint__MethodAssignment_5_1"


    // $ANTLR start "rule__Endpoint__TypeAssignment_6_1"
    // InternalSecurityDsl.g:6330:1: rule__Endpoint__TypeAssignment_6_1 : ( ruleEEndpointType ) ;
    public final void rule__Endpoint__TypeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6334:1: ( ( ruleEEndpointType ) )
            // InternalSecurityDsl.g:6335:2: ( ruleEEndpointType )
            {
            // InternalSecurityDsl.g:6335:2: ( ruleEEndpointType )
            // InternalSecurityDsl.g:6336:3: ruleEEndpointType
            {
             before(grammarAccess.getEndpointAccess().getTypeEEndpointTypeEnumRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEEndpointType();

            state._fsp--;

             after(grammarAccess.getEndpointAccess().getTypeEEndpointTypeEnumRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Endpoint__TypeAssignment_6_1"


    // $ANTLR start "rule__Endpoint__Role_authoritiesAssignment_7_2"
    // InternalSecurityDsl.g:6345:1: rule__Endpoint__Role_authoritiesAssignment_7_2 : ( ( ruleEString ) ) ;
    public final void rule__Endpoint__Role_authoritiesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6349:1: ( ( ( ruleEString ) ) )
            // InternalSecurityDsl.g:6350:2: ( ( ruleEString ) )
            {
            // InternalSecurityDsl.g:6350:2: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6351:3: ( ruleEString )
            {
             before(grammarAccess.getEndpointAccess().getRole_authoritiesRoleInstanceCrossReference_7_2_0()); 
            // InternalSecurityDsl.g:6352:3: ( ruleEString )
            // InternalSecurityDsl.g:6353:4: ruleEString
            {
             before(grammarAccess.getEndpointAccess().getRole_authoritiesRoleInstanceEStringParserRuleCall_7_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEndpointAccess().getRole_authoritiesRoleInstanceEStringParserRuleCall_7_2_0_1()); 

            }

             after(grammarAccess.getEndpointAccess().getRole_authoritiesRoleInstanceCrossReference_7_2_0()); 

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
    // $ANTLR end "rule__Endpoint__Role_authoritiesAssignment_7_2"


    // $ANTLR start "rule__Endpoint__Role_authoritiesAssignment_7_3_1"
    // InternalSecurityDsl.g:6364:1: rule__Endpoint__Role_authoritiesAssignment_7_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Endpoint__Role_authoritiesAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6368:1: ( ( ( ruleEString ) ) )
            // InternalSecurityDsl.g:6369:2: ( ( ruleEString ) )
            {
            // InternalSecurityDsl.g:6369:2: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6370:3: ( ruleEString )
            {
             before(grammarAccess.getEndpointAccess().getRole_authoritiesRoleInstanceCrossReference_7_3_1_0()); 
            // InternalSecurityDsl.g:6371:3: ( ruleEString )
            // InternalSecurityDsl.g:6372:4: ruleEString
            {
             before(grammarAccess.getEndpointAccess().getRole_authoritiesRoleInstanceEStringParserRuleCall_7_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEndpointAccess().getRole_authoritiesRoleInstanceEStringParserRuleCall_7_3_1_0_1()); 

            }

             after(grammarAccess.getEndpointAccess().getRole_authoritiesRoleInstanceCrossReference_7_3_1_0()); 

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
    // $ANTLR end "rule__Endpoint__Role_authoritiesAssignment_7_3_1"


    // $ANTLR start "rule__Authentication__NameAssignment_2"
    // InternalSecurityDsl.g:6383:1: rule__Authentication__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Authentication__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6387:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6388:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6388:2: ( ruleEString )
            // InternalSecurityDsl.g:6389:3: ruleEString
            {
             before(grammarAccess.getAuthenticationAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAuthenticationAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Authentication__NameAssignment_2"


    // $ANTLR start "rule__Authentication__PathAssignment_4_1"
    // InternalSecurityDsl.g:6398:1: rule__Authentication__PathAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Authentication__PathAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6402:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6403:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6403:2: ( ruleEString )
            // InternalSecurityDsl.g:6404:3: ruleEString
            {
             before(grammarAccess.getAuthenticationAccess().getPathEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAuthenticationAccess().getPathEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Authentication__PathAssignment_4_1"


    // $ANTLR start "rule__Authentication__Controller_endpointsAssignment_5_2"
    // InternalSecurityDsl.g:6413:1: rule__Authentication__Controller_endpointsAssignment_5_2 : ( ruleEndpoint ) ;
    public final void rule__Authentication__Controller_endpointsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6417:1: ( ( ruleEndpoint ) )
            // InternalSecurityDsl.g:6418:2: ( ruleEndpoint )
            {
            // InternalSecurityDsl.g:6418:2: ( ruleEndpoint )
            // InternalSecurityDsl.g:6419:3: ruleEndpoint
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
    // InternalSecurityDsl.g:6428:1: rule__Authentication__Controller_endpointsAssignment_5_3_1 : ( ruleEndpoint ) ;
    public final void rule__Authentication__Controller_endpointsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6432:1: ( ( ruleEndpoint ) )
            // InternalSecurityDsl.g:6433:2: ( ruleEndpoint )
            {
            // InternalSecurityDsl.g:6433:2: ( ruleEndpoint )
            // InternalSecurityDsl.g:6434:3: ruleEndpoint
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


    // $ANTLR start "rule__JWT__SignatureAlgorithmAssignment_3"
    // InternalSecurityDsl.g:6443:1: rule__JWT__SignatureAlgorithmAssignment_3 : ( ruleEString ) ;
    public final void rule__JWT__SignatureAlgorithmAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6447:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6448:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6448:2: ( ruleEString )
            // InternalSecurityDsl.g:6449:3: ruleEString
            {
             before(grammarAccess.getJWTAccess().getSignatureAlgorithmEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getJWTAccess().getSignatureAlgorithmEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__JWT__SignatureAlgorithmAssignment_3"


    // $ANTLR start "rule__JWT__SecretAssignment_4_1"
    // InternalSecurityDsl.g:6458:1: rule__JWT__SecretAssignment_4_1 : ( ruleEString ) ;
    public final void rule__JWT__SecretAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6462:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6463:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6463:2: ( ruleEString )
            // InternalSecurityDsl.g:6464:3: ruleEString
            {
             before(grammarAccess.getJWTAccess().getSecretEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getJWTAccess().getSecretEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__JWT__SecretAssignment_4_1"


    // $ANTLR start "rule__JWT__Jwt_claimsAssignment_5_2"
    // InternalSecurityDsl.g:6473:1: rule__JWT__Jwt_claimsAssignment_5_2 : ( ruleClaim ) ;
    public final void rule__JWT__Jwt_claimsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6477:1: ( ( ruleClaim ) )
            // InternalSecurityDsl.g:6478:2: ( ruleClaim )
            {
            // InternalSecurityDsl.g:6478:2: ( ruleClaim )
            // InternalSecurityDsl.g:6479:3: ruleClaim
            {
             before(grammarAccess.getJWTAccess().getJwt_claimsClaimParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleClaim();

            state._fsp--;

             after(grammarAccess.getJWTAccess().getJwt_claimsClaimParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__JWT__Jwt_claimsAssignment_5_2"


    // $ANTLR start "rule__JWT__Jwt_claimsAssignment_5_3_1"
    // InternalSecurityDsl.g:6488:1: rule__JWT__Jwt_claimsAssignment_5_3_1 : ( ruleClaim ) ;
    public final void rule__JWT__Jwt_claimsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6492:1: ( ( ruleClaim ) )
            // InternalSecurityDsl.g:6493:2: ( ruleClaim )
            {
            // InternalSecurityDsl.g:6493:2: ( ruleClaim )
            // InternalSecurityDsl.g:6494:3: ruleClaim
            {
             before(grammarAccess.getJWTAccess().getJwt_claimsClaimParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClaim();

            state._fsp--;

             after(grammarAccess.getJWTAccess().getJwt_claimsClaimParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__JWT__Jwt_claimsAssignment_5_3_1"


    // $ANTLR start "rule__JWT__RegisteredclaimsAssignment_7"
    // InternalSecurityDsl.g:6503:1: rule__JWT__RegisteredclaimsAssignment_7 : ( ruleRegisteredClaims ) ;
    public final void rule__JWT__RegisteredclaimsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6507:1: ( ( ruleRegisteredClaims ) )
            // InternalSecurityDsl.g:6508:2: ( ruleRegisteredClaims )
            {
            // InternalSecurityDsl.g:6508:2: ( ruleRegisteredClaims )
            // InternalSecurityDsl.g:6509:3: ruleRegisteredClaims
            {
             before(grammarAccess.getJWTAccess().getRegisteredclaimsRegisteredClaimsParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleRegisteredClaims();

            state._fsp--;

             after(grammarAccess.getJWTAccess().getRegisteredclaimsRegisteredClaimsParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__JWT__RegisteredclaimsAssignment_7"


    // $ANTLR start "rule__Claim__NameAssignment_1"
    // InternalSecurityDsl.g:6518:1: rule__Claim__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Claim__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6522:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6523:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6523:2: ( ruleEString )
            // InternalSecurityDsl.g:6524:3: ruleEString
            {
             before(grammarAccess.getClaimAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClaimAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Claim__NameAssignment_1"


    // $ANTLR start "rule__Claim__TypeAssignment_3_1"
    // InternalSecurityDsl.g:6533:1: rule__Claim__TypeAssignment_3_1 : ( ruleEClaimType ) ;
    public final void rule__Claim__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6537:1: ( ( ruleEClaimType ) )
            // InternalSecurityDsl.g:6538:2: ( ruleEClaimType )
            {
            // InternalSecurityDsl.g:6538:2: ( ruleEClaimType )
            // InternalSecurityDsl.g:6539:3: ruleEClaimType
            {
             before(grammarAccess.getClaimAccess().getTypeEClaimTypeEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEClaimType();

            state._fsp--;

             after(grammarAccess.getClaimAccess().getTypeEClaimTypeEnumRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Claim__TypeAssignment_3_1"


    // $ANTLR start "rule__Claim__Claim_attributeAssignment_5"
    // InternalSecurityDsl.g:6548:1: rule__Claim__Claim_attributeAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Claim__Claim_attributeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6552:1: ( ( ( ruleEString ) ) )
            // InternalSecurityDsl.g:6553:2: ( ( ruleEString ) )
            {
            // InternalSecurityDsl.g:6553:2: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6554:3: ( ruleEString )
            {
             before(grammarAccess.getClaimAccess().getClaim_attributeAttributeCrossReference_5_0()); 
            // InternalSecurityDsl.g:6555:3: ( ruleEString )
            // InternalSecurityDsl.g:6556:4: ruleEString
            {
             before(grammarAccess.getClaimAccess().getClaim_attributeAttributeEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClaimAccess().getClaim_attributeAttributeEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getClaimAccess().getClaim_attributeAttributeCrossReference_5_0()); 

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
    // $ANTLR end "rule__Claim__Claim_attributeAssignment_5"


    // $ANTLR start "rule__RegisteredClaims__ExpirationTimeAssignment_3"
    // InternalSecurityDsl.g:6567:1: rule__RegisteredClaims__ExpirationTimeAssignment_3 : ( ruleEInt ) ;
    public final void rule__RegisteredClaims__ExpirationTimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6571:1: ( ( ruleEInt ) )
            // InternalSecurityDsl.g:6572:2: ( ruleEInt )
            {
            // InternalSecurityDsl.g:6572:2: ( ruleEInt )
            // InternalSecurityDsl.g:6573:3: ruleEInt
            {
             before(grammarAccess.getRegisteredClaimsAccess().getExpirationTimeEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRegisteredClaimsAccess().getExpirationTimeEIntParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__RegisteredClaims__ExpirationTimeAssignment_3"


    // $ANTLR start "rule__RegisteredClaims__IssuerAssignment_4_1"
    // InternalSecurityDsl.g:6582:1: rule__RegisteredClaims__IssuerAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RegisteredClaims__IssuerAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6586:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6587:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6587:2: ( ruleEString )
            // InternalSecurityDsl.g:6588:3: ruleEString
            {
             before(grammarAccess.getRegisteredClaimsAccess().getIssuerEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRegisteredClaimsAccess().getIssuerEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__RegisteredClaims__IssuerAssignment_4_1"


    // $ANTLR start "rule__RegisteredClaims__AudienceAssignment_5_1"
    // InternalSecurityDsl.g:6597:1: rule__RegisteredClaims__AudienceAssignment_5_1 : ( ruleEString ) ;
    public final void rule__RegisteredClaims__AudienceAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6601:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6602:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6602:2: ( ruleEString )
            // InternalSecurityDsl.g:6603:3: ruleEString
            {
             before(grammarAccess.getRegisteredClaimsAccess().getAudienceEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRegisteredClaimsAccess().getAudienceEStringParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__RegisteredClaims__AudienceAssignment_5_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000DFF000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0020000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x2200000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000201000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000007FC000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0100001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x1C00001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0C00001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0080001000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001C00L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0080000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000001000000000L,0x0000000000060000L});

}