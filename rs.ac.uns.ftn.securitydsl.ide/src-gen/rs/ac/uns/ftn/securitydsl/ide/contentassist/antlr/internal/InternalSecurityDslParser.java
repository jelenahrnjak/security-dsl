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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PostgreSQL'", "'Oracle'", "'MySQL'", "'String'", "'Float'", "'Long'", "'Integer'", "'char'", "'Double'", "'DateTime'", "'Date'", "'int'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'REGISTRATION'", "'LOGIN'", "'LOGOUT'", "'OTHER'", "'PRIVATE'", "'PUBLIC'", "'REGISTERED'", "'application:'", "'artifact:'", "'name:'", "'group:'", "'packageName:'", "'description:'", "'port:'", "'hostname:'", "'database:'", "'model:'", "'user:'", "'role:'", "'security:'", "'controller:'", "'auth:'", "'vendor:'", "'url:'", "'username:'", "'password:'", "'-'", "'{'", "'type:'", "'}'", "'collumnName:'", "'tableName:'", "'attributes:'", "'['", "']'", "','", "'roles:'", "'functionName:'", "'method:'", "'roleAuthorities:'", "'path:'", "'endpoints:'", "'jwt:'", "'header:'", "'signatureAlgorithm:'", "'payload:'", "'claims:'", "'signature:'", "'secret:'", "':'", "'REGISTERED,'", "'expirationTime:'", "'issuer:'", "'audience:'", "'identifier'"
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
    // InternalSecurityDsl.g:87:1: ruleSecurity : ( ruleJWT ) ;
    public final void ruleSecurity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:91:2: ( ( ruleJWT ) )
            // InternalSecurityDsl.g:92:2: ( ruleJWT )
            {
            // InternalSecurityDsl.g:92:2: ( ruleJWT )
            // InternalSecurityDsl.g:93:3: ruleJWT
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
    // InternalSecurityDsl.g:103:1: entryRuleDatabase : ruleDatabase EOF ;
    public final void entryRuleDatabase() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:104:1: ( ruleDatabase EOF )
            // InternalSecurityDsl.g:105:1: ruleDatabase EOF
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
    // InternalSecurityDsl.g:112:1: ruleDatabase : ( ( rule__Database__Group__0 ) ) ;
    public final void ruleDatabase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:116:2: ( ( ( rule__Database__Group__0 ) ) )
            // InternalSecurityDsl.g:117:2: ( ( rule__Database__Group__0 ) )
            {
            // InternalSecurityDsl.g:117:2: ( ( rule__Database__Group__0 ) )
            // InternalSecurityDsl.g:118:3: ( rule__Database__Group__0 )
            {
             before(grammarAccess.getDatabaseAccess().getGroup()); 
            // InternalSecurityDsl.g:119:3: ( rule__Database__Group__0 )
            // InternalSecurityDsl.g:119:4: rule__Database__Group__0
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
    // InternalSecurityDsl.g:128:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:129:1: ( ruleEString EOF )
            // InternalSecurityDsl.g:130:1: ruleEString EOF
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
    // InternalSecurityDsl.g:137:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:141:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSecurityDsl.g:142:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSecurityDsl.g:142:2: ( ( rule__EString__Alternatives ) )
            // InternalSecurityDsl.g:143:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSecurityDsl.g:144:3: ( rule__EString__Alternatives )
            // InternalSecurityDsl.g:144:4: rule__EString__Alternatives
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
    // InternalSecurityDsl.g:153:1: entryRuleELongObject : ruleELongObject EOF ;
    public final void entryRuleELongObject() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:154:1: ( ruleELongObject EOF )
            // InternalSecurityDsl.g:155:1: ruleELongObject EOF
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
    // InternalSecurityDsl.g:162:1: ruleELongObject : ( ( rule__ELongObject__Group__0 ) ) ;
    public final void ruleELongObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:166:2: ( ( ( rule__ELongObject__Group__0 ) ) )
            // InternalSecurityDsl.g:167:2: ( ( rule__ELongObject__Group__0 ) )
            {
            // InternalSecurityDsl.g:167:2: ( ( rule__ELongObject__Group__0 ) )
            // InternalSecurityDsl.g:168:3: ( rule__ELongObject__Group__0 )
            {
             before(grammarAccess.getELongObjectAccess().getGroup()); 
            // InternalSecurityDsl.g:169:3: ( rule__ELongObject__Group__0 )
            // InternalSecurityDsl.g:169:4: rule__ELongObject__Group__0
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
    // InternalSecurityDsl.g:178:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:179:1: ( ruleAttribute EOF )
            // InternalSecurityDsl.g:180:1: ruleAttribute EOF
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
    // InternalSecurityDsl.g:187:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:191:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalSecurityDsl.g:192:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalSecurityDsl.g:192:2: ( ( rule__Attribute__Group__0 ) )
            // InternalSecurityDsl.g:193:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalSecurityDsl.g:194:3: ( rule__Attribute__Group__0 )
            // InternalSecurityDsl.g:194:4: rule__Attribute__Group__0
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
    // InternalSecurityDsl.g:203:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:204:1: ( ruleRole EOF )
            // InternalSecurityDsl.g:205:1: ruleRole EOF
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
    // InternalSecurityDsl.g:212:1: ruleRole : ( ( rule__Role__Group__0 ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:216:2: ( ( ( rule__Role__Group__0 ) ) )
            // InternalSecurityDsl.g:217:2: ( ( rule__Role__Group__0 ) )
            {
            // InternalSecurityDsl.g:217:2: ( ( rule__Role__Group__0 ) )
            // InternalSecurityDsl.g:218:3: ( rule__Role__Group__0 )
            {
             before(grammarAccess.getRoleAccess().getGroup()); 
            // InternalSecurityDsl.g:219:3: ( rule__Role__Group__0 )
            // InternalSecurityDsl.g:219:4: rule__Role__Group__0
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
    // InternalSecurityDsl.g:228:1: entryRuleUser : ruleUser EOF ;
    public final void entryRuleUser() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:229:1: ( ruleUser EOF )
            // InternalSecurityDsl.g:230:1: ruleUser EOF
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
    // InternalSecurityDsl.g:237:1: ruleUser : ( ( rule__User__Group__0 ) ) ;
    public final void ruleUser() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:241:2: ( ( ( rule__User__Group__0 ) ) )
            // InternalSecurityDsl.g:242:2: ( ( rule__User__Group__0 ) )
            {
            // InternalSecurityDsl.g:242:2: ( ( rule__User__Group__0 ) )
            // InternalSecurityDsl.g:243:3: ( rule__User__Group__0 )
            {
             before(grammarAccess.getUserAccess().getGroup()); 
            // InternalSecurityDsl.g:244:3: ( rule__User__Group__0 )
            // InternalSecurityDsl.g:244:4: rule__User__Group__0
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
    // InternalSecurityDsl.g:253:1: entryRuleRoleInstance : ruleRoleInstance EOF ;
    public final void entryRuleRoleInstance() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:254:1: ( ruleRoleInstance EOF )
            // InternalSecurityDsl.g:255:1: ruleRoleInstance EOF
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
    // InternalSecurityDsl.g:262:1: ruleRoleInstance : ( ( rule__RoleInstance__Group__0 ) ) ;
    public final void ruleRoleInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:266:2: ( ( ( rule__RoleInstance__Group__0 ) ) )
            // InternalSecurityDsl.g:267:2: ( ( rule__RoleInstance__Group__0 ) )
            {
            // InternalSecurityDsl.g:267:2: ( ( rule__RoleInstance__Group__0 ) )
            // InternalSecurityDsl.g:268:3: ( rule__RoleInstance__Group__0 )
            {
             before(grammarAccess.getRoleInstanceAccess().getGroup()); 
            // InternalSecurityDsl.g:269:3: ( rule__RoleInstance__Group__0 )
            // InternalSecurityDsl.g:269:4: rule__RoleInstance__Group__0
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
    // InternalSecurityDsl.g:278:1: entryRuleEndpoint : ruleEndpoint EOF ;
    public final void entryRuleEndpoint() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:279:1: ( ruleEndpoint EOF )
            // InternalSecurityDsl.g:280:1: ruleEndpoint EOF
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
    // InternalSecurityDsl.g:287:1: ruleEndpoint : ( ( rule__Endpoint__Group__0 ) ) ;
    public final void ruleEndpoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:291:2: ( ( ( rule__Endpoint__Group__0 ) ) )
            // InternalSecurityDsl.g:292:2: ( ( rule__Endpoint__Group__0 ) )
            {
            // InternalSecurityDsl.g:292:2: ( ( rule__Endpoint__Group__0 ) )
            // InternalSecurityDsl.g:293:3: ( rule__Endpoint__Group__0 )
            {
             before(grammarAccess.getEndpointAccess().getGroup()); 
            // InternalSecurityDsl.g:294:3: ( rule__Endpoint__Group__0 )
            // InternalSecurityDsl.g:294:4: rule__Endpoint__Group__0
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
    // InternalSecurityDsl.g:303:1: entryRuleAuthentication : ruleAuthentication EOF ;
    public final void entryRuleAuthentication() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:304:1: ( ruleAuthentication EOF )
            // InternalSecurityDsl.g:305:1: ruleAuthentication EOF
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
    // InternalSecurityDsl.g:312:1: ruleAuthentication : ( ( rule__Authentication__Group__0 ) ) ;
    public final void ruleAuthentication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:316:2: ( ( ( rule__Authentication__Group__0 ) ) )
            // InternalSecurityDsl.g:317:2: ( ( rule__Authentication__Group__0 ) )
            {
            // InternalSecurityDsl.g:317:2: ( ( rule__Authentication__Group__0 ) )
            // InternalSecurityDsl.g:318:3: ( rule__Authentication__Group__0 )
            {
             before(grammarAccess.getAuthenticationAccess().getGroup()); 
            // InternalSecurityDsl.g:319:3: ( rule__Authentication__Group__0 )
            // InternalSecurityDsl.g:319:4: rule__Authentication__Group__0
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
    // InternalSecurityDsl.g:328:1: entryRuleJWT : ruleJWT EOF ;
    public final void entryRuleJWT() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:329:1: ( ruleJWT EOF )
            // InternalSecurityDsl.g:330:1: ruleJWT EOF
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
    // InternalSecurityDsl.g:337:1: ruleJWT : ( ( rule__JWT__Group__0 ) ) ;
    public final void ruleJWT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:341:2: ( ( ( rule__JWT__Group__0 ) ) )
            // InternalSecurityDsl.g:342:2: ( ( rule__JWT__Group__0 ) )
            {
            // InternalSecurityDsl.g:342:2: ( ( rule__JWT__Group__0 ) )
            // InternalSecurityDsl.g:343:3: ( rule__JWT__Group__0 )
            {
             before(grammarAccess.getJWTAccess().getGroup()); 
            // InternalSecurityDsl.g:344:3: ( rule__JWT__Group__0 )
            // InternalSecurityDsl.g:344:4: rule__JWT__Group__0
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
    // InternalSecurityDsl.g:353:1: entryRuleClaim : ruleClaim EOF ;
    public final void entryRuleClaim() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:354:1: ( ruleClaim EOF )
            // InternalSecurityDsl.g:355:1: ruleClaim EOF
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
    // InternalSecurityDsl.g:362:1: ruleClaim : ( ( rule__Claim__Group__0 ) ) ;
    public final void ruleClaim() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:366:2: ( ( ( rule__Claim__Group__0 ) ) )
            // InternalSecurityDsl.g:367:2: ( ( rule__Claim__Group__0 ) )
            {
            // InternalSecurityDsl.g:367:2: ( ( rule__Claim__Group__0 ) )
            // InternalSecurityDsl.g:368:3: ( rule__Claim__Group__0 )
            {
             before(grammarAccess.getClaimAccess().getGroup()); 
            // InternalSecurityDsl.g:369:3: ( rule__Claim__Group__0 )
            // InternalSecurityDsl.g:369:4: rule__Claim__Group__0
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
    // InternalSecurityDsl.g:378:1: entryRuleRegisteredClaims : ruleRegisteredClaims EOF ;
    public final void entryRuleRegisteredClaims() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:379:1: ( ruleRegisteredClaims EOF )
            // InternalSecurityDsl.g:380:1: ruleRegisteredClaims EOF
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
    // InternalSecurityDsl.g:387:1: ruleRegisteredClaims : ( ( rule__RegisteredClaims__Group__0 ) ) ;
    public final void ruleRegisteredClaims() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:391:2: ( ( ( rule__RegisteredClaims__Group__0 ) ) )
            // InternalSecurityDsl.g:392:2: ( ( rule__RegisteredClaims__Group__0 ) )
            {
            // InternalSecurityDsl.g:392:2: ( ( rule__RegisteredClaims__Group__0 ) )
            // InternalSecurityDsl.g:393:3: ( rule__RegisteredClaims__Group__0 )
            {
             before(grammarAccess.getRegisteredClaimsAccess().getGroup()); 
            // InternalSecurityDsl.g:394:3: ( rule__RegisteredClaims__Group__0 )
            // InternalSecurityDsl.g:394:4: rule__RegisteredClaims__Group__0
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
    // InternalSecurityDsl.g:403:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:404:1: ( ruleEInt EOF )
            // InternalSecurityDsl.g:405:1: ruleEInt EOF
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
    // InternalSecurityDsl.g:412:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:416:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalSecurityDsl.g:417:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalSecurityDsl.g:417:2: ( ( rule__EInt__Group__0 ) )
            // InternalSecurityDsl.g:418:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalSecurityDsl.g:419:3: ( rule__EInt__Group__0 )
            // InternalSecurityDsl.g:419:4: rule__EInt__Group__0
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
    // InternalSecurityDsl.g:428:1: ruleEDatabaseType : ( ( rule__EDatabaseType__Alternatives ) ) ;
    public final void ruleEDatabaseType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:432:1: ( ( ( rule__EDatabaseType__Alternatives ) ) )
            // InternalSecurityDsl.g:433:2: ( ( rule__EDatabaseType__Alternatives ) )
            {
            // InternalSecurityDsl.g:433:2: ( ( rule__EDatabaseType__Alternatives ) )
            // InternalSecurityDsl.g:434:3: ( rule__EDatabaseType__Alternatives )
            {
             before(grammarAccess.getEDatabaseTypeAccess().getAlternatives()); 
            // InternalSecurityDsl.g:435:3: ( rule__EDatabaseType__Alternatives )
            // InternalSecurityDsl.g:435:4: rule__EDatabaseType__Alternatives
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
    // InternalSecurityDsl.g:444:1: ruleEType : ( ( rule__EType__Alternatives ) ) ;
    public final void ruleEType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:448:1: ( ( ( rule__EType__Alternatives ) ) )
            // InternalSecurityDsl.g:449:2: ( ( rule__EType__Alternatives ) )
            {
            // InternalSecurityDsl.g:449:2: ( ( rule__EType__Alternatives ) )
            // InternalSecurityDsl.g:450:3: ( rule__EType__Alternatives )
            {
             before(grammarAccess.getETypeAccess().getAlternatives()); 
            // InternalSecurityDsl.g:451:3: ( rule__EType__Alternatives )
            // InternalSecurityDsl.g:451:4: rule__EType__Alternatives
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
    // InternalSecurityDsl.g:460:1: ruleEEndpointMethod : ( ( rule__EEndpointMethod__Alternatives ) ) ;
    public final void ruleEEndpointMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:464:1: ( ( ( rule__EEndpointMethod__Alternatives ) ) )
            // InternalSecurityDsl.g:465:2: ( ( rule__EEndpointMethod__Alternatives ) )
            {
            // InternalSecurityDsl.g:465:2: ( ( rule__EEndpointMethod__Alternatives ) )
            // InternalSecurityDsl.g:466:3: ( rule__EEndpointMethod__Alternatives )
            {
             before(grammarAccess.getEEndpointMethodAccess().getAlternatives()); 
            // InternalSecurityDsl.g:467:3: ( rule__EEndpointMethod__Alternatives )
            // InternalSecurityDsl.g:467:4: rule__EEndpointMethod__Alternatives
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
    // InternalSecurityDsl.g:476:1: ruleEEndpointType : ( ( rule__EEndpointType__Alternatives ) ) ;
    public final void ruleEEndpointType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:480:1: ( ( ( rule__EEndpointType__Alternatives ) ) )
            // InternalSecurityDsl.g:481:2: ( ( rule__EEndpointType__Alternatives ) )
            {
            // InternalSecurityDsl.g:481:2: ( ( rule__EEndpointType__Alternatives ) )
            // InternalSecurityDsl.g:482:3: ( rule__EEndpointType__Alternatives )
            {
             before(grammarAccess.getEEndpointTypeAccess().getAlternatives()); 
            // InternalSecurityDsl.g:483:3: ( rule__EEndpointType__Alternatives )
            // InternalSecurityDsl.g:483:4: rule__EEndpointType__Alternatives
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
    // InternalSecurityDsl.g:492:1: ruleEClaimType : ( ( rule__EClaimType__Alternatives ) ) ;
    public final void ruleEClaimType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:496:1: ( ( ( rule__EClaimType__Alternatives ) ) )
            // InternalSecurityDsl.g:497:2: ( ( rule__EClaimType__Alternatives ) )
            {
            // InternalSecurityDsl.g:497:2: ( ( rule__EClaimType__Alternatives ) )
            // InternalSecurityDsl.g:498:3: ( rule__EClaimType__Alternatives )
            {
             before(grammarAccess.getEClaimTypeAccess().getAlternatives()); 
            // InternalSecurityDsl.g:499:3: ( rule__EClaimType__Alternatives )
            // InternalSecurityDsl.g:499:4: rule__EClaimType__Alternatives
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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalSecurityDsl.g:507:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:511:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalSecurityDsl.g:512:2: ( RULE_STRING )
                    {
                    // InternalSecurityDsl.g:512:2: ( RULE_STRING )
                    // InternalSecurityDsl.g:513:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:518:2: ( RULE_ID )
                    {
                    // InternalSecurityDsl.g:518:2: ( RULE_ID )
                    // InternalSecurityDsl.g:519:3: RULE_ID
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
    // InternalSecurityDsl.g:528:1: rule__EDatabaseType__Alternatives : ( ( ( 'PostgreSQL' ) ) | ( ( 'Oracle' ) ) | ( ( 'MySQL' ) ) );
    public final void rule__EDatabaseType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:532:1: ( ( ( 'PostgreSQL' ) ) | ( ( 'Oracle' ) ) | ( ( 'MySQL' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSecurityDsl.g:533:2: ( ( 'PostgreSQL' ) )
                    {
                    // InternalSecurityDsl.g:533:2: ( ( 'PostgreSQL' ) )
                    // InternalSecurityDsl.g:534:3: ( 'PostgreSQL' )
                    {
                     before(grammarAccess.getEDatabaseTypeAccess().getPostgreSQLEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:535:3: ( 'PostgreSQL' )
                    // InternalSecurityDsl.g:535:4: 'PostgreSQL'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getEDatabaseTypeAccess().getPostgreSQLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:539:2: ( ( 'Oracle' ) )
                    {
                    // InternalSecurityDsl.g:539:2: ( ( 'Oracle' ) )
                    // InternalSecurityDsl.g:540:3: ( 'Oracle' )
                    {
                     before(grammarAccess.getEDatabaseTypeAccess().getOracleEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:541:3: ( 'Oracle' )
                    // InternalSecurityDsl.g:541:4: 'Oracle'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getEDatabaseTypeAccess().getOracleEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:545:2: ( ( 'MySQL' ) )
                    {
                    // InternalSecurityDsl.g:545:2: ( ( 'MySQL' ) )
                    // InternalSecurityDsl.g:546:3: ( 'MySQL' )
                    {
                     before(grammarAccess.getEDatabaseTypeAccess().getMySQLEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:547:3: ( 'MySQL' )
                    // InternalSecurityDsl.g:547:4: 'MySQL'
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
    // InternalSecurityDsl.g:555:1: rule__EType__Alternatives : ( ( ( 'String' ) ) | ( ( 'Float' ) ) | ( ( 'Long' ) ) | ( ( 'Integer' ) ) | ( ( 'char' ) ) | ( ( 'Double' ) ) | ( ( 'DateTime' ) ) | ( ( 'Date' ) ) | ( ( 'int' ) ) );
    public final void rule__EType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:559:1: ( ( ( 'String' ) ) | ( ( 'Float' ) ) | ( ( 'Long' ) ) | ( ( 'Integer' ) ) | ( ( 'char' ) ) | ( ( 'Double' ) ) | ( ( 'DateTime' ) ) | ( ( 'Date' ) ) | ( ( 'int' ) ) )
            int alt3=9;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            case 17:
                {
                alt3=4;
                }
                break;
            case 18:
                {
                alt3=5;
                }
                break;
            case 19:
                {
                alt3=6;
                }
                break;
            case 20:
                {
                alt3=7;
                }
                break;
            case 21:
                {
                alt3=8;
                }
                break;
            case 22:
                {
                alt3=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSecurityDsl.g:560:2: ( ( 'String' ) )
                    {
                    // InternalSecurityDsl.g:560:2: ( ( 'String' ) )
                    // InternalSecurityDsl.g:561:3: ( 'String' )
                    {
                     before(grammarAccess.getETypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:562:3: ( 'String' )
                    // InternalSecurityDsl.g:562:4: 'String'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:566:2: ( ( 'Float' ) )
                    {
                    // InternalSecurityDsl.g:566:2: ( ( 'Float' ) )
                    // InternalSecurityDsl.g:567:3: ( 'Float' )
                    {
                     before(grammarAccess.getETypeAccess().getFloatEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:568:3: ( 'Float' )
                    // InternalSecurityDsl.g:568:4: 'Float'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getFloatEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:572:2: ( ( 'Long' ) )
                    {
                    // InternalSecurityDsl.g:572:2: ( ( 'Long' ) )
                    // InternalSecurityDsl.g:573:3: ( 'Long' )
                    {
                     before(grammarAccess.getETypeAccess().getLongEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:574:3: ( 'Long' )
                    // InternalSecurityDsl.g:574:4: 'Long'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getLongEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:578:2: ( ( 'Integer' ) )
                    {
                    // InternalSecurityDsl.g:578:2: ( ( 'Integer' ) )
                    // InternalSecurityDsl.g:579:3: ( 'Integer' )
                    {
                     before(grammarAccess.getETypeAccess().getIntegerEnumLiteralDeclaration_3()); 
                    // InternalSecurityDsl.g:580:3: ( 'Integer' )
                    // InternalSecurityDsl.g:580:4: 'Integer'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getIntegerEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSecurityDsl.g:584:2: ( ( 'char' ) )
                    {
                    // InternalSecurityDsl.g:584:2: ( ( 'char' ) )
                    // InternalSecurityDsl.g:585:3: ( 'char' )
                    {
                     before(grammarAccess.getETypeAccess().getCharEnumLiteralDeclaration_4()); 
                    // InternalSecurityDsl.g:586:3: ( 'char' )
                    // InternalSecurityDsl.g:586:4: 'char'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getCharEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSecurityDsl.g:590:2: ( ( 'Double' ) )
                    {
                    // InternalSecurityDsl.g:590:2: ( ( 'Double' ) )
                    // InternalSecurityDsl.g:591:3: ( 'Double' )
                    {
                     before(grammarAccess.getETypeAccess().getDoubleEnumLiteralDeclaration_5()); 
                    // InternalSecurityDsl.g:592:3: ( 'Double' )
                    // InternalSecurityDsl.g:592:4: 'Double'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getDoubleEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSecurityDsl.g:596:2: ( ( 'DateTime' ) )
                    {
                    // InternalSecurityDsl.g:596:2: ( ( 'DateTime' ) )
                    // InternalSecurityDsl.g:597:3: ( 'DateTime' )
                    {
                     before(grammarAccess.getETypeAccess().getDateTimeEnumLiteralDeclaration_6()); 
                    // InternalSecurityDsl.g:598:3: ( 'DateTime' )
                    // InternalSecurityDsl.g:598:4: 'DateTime'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getDateTimeEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSecurityDsl.g:602:2: ( ( 'Date' ) )
                    {
                    // InternalSecurityDsl.g:602:2: ( ( 'Date' ) )
                    // InternalSecurityDsl.g:603:3: ( 'Date' )
                    {
                     before(grammarAccess.getETypeAccess().getDateEnumLiteralDeclaration_7()); 
                    // InternalSecurityDsl.g:604:3: ( 'Date' )
                    // InternalSecurityDsl.g:604:4: 'Date'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getDateEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSecurityDsl.g:608:2: ( ( 'int' ) )
                    {
                    // InternalSecurityDsl.g:608:2: ( ( 'int' ) )
                    // InternalSecurityDsl.g:609:3: ( 'int' )
                    {
                     before(grammarAccess.getETypeAccess().getIntEnumLiteralDeclaration_8()); 
                    // InternalSecurityDsl.g:610:3: ( 'int' )
                    // InternalSecurityDsl.g:610:4: 'int'
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
    // InternalSecurityDsl.g:618:1: rule__EEndpointMethod__Alternatives : ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) );
    public final void rule__EEndpointMethod__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:622:1: ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt4=1;
                }
                break;
            case 24:
                {
                alt4=2;
                }
                break;
            case 25:
                {
                alt4=3;
                }
                break;
            case 26:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSecurityDsl.g:623:2: ( ( 'GET' ) )
                    {
                    // InternalSecurityDsl.g:623:2: ( ( 'GET' ) )
                    // InternalSecurityDsl.g:624:3: ( 'GET' )
                    {
                     before(grammarAccess.getEEndpointMethodAccess().getGETEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:625:3: ( 'GET' )
                    // InternalSecurityDsl.g:625:4: 'GET'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointMethodAccess().getGETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:629:2: ( ( 'POST' ) )
                    {
                    // InternalSecurityDsl.g:629:2: ( ( 'POST' ) )
                    // InternalSecurityDsl.g:630:3: ( 'POST' )
                    {
                     before(grammarAccess.getEEndpointMethodAccess().getPOSTEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:631:3: ( 'POST' )
                    // InternalSecurityDsl.g:631:4: 'POST'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointMethodAccess().getPOSTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:635:2: ( ( 'PUT' ) )
                    {
                    // InternalSecurityDsl.g:635:2: ( ( 'PUT' ) )
                    // InternalSecurityDsl.g:636:3: ( 'PUT' )
                    {
                     before(grammarAccess.getEEndpointMethodAccess().getPUTEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:637:3: ( 'PUT' )
                    // InternalSecurityDsl.g:637:4: 'PUT'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointMethodAccess().getPUTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:641:2: ( ( 'DELETE' ) )
                    {
                    // InternalSecurityDsl.g:641:2: ( ( 'DELETE' ) )
                    // InternalSecurityDsl.g:642:3: ( 'DELETE' )
                    {
                     before(grammarAccess.getEEndpointMethodAccess().getDELETEEnumLiteralDeclaration_3()); 
                    // InternalSecurityDsl.g:643:3: ( 'DELETE' )
                    // InternalSecurityDsl.g:643:4: 'DELETE'
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
    // InternalSecurityDsl.g:651:1: rule__EEndpointType__Alternatives : ( ( ( 'REGISTRATION' ) ) | ( ( 'LOGIN' ) ) | ( ( 'LOGOUT' ) ) | ( ( 'OTHER' ) ) );
    public final void rule__EEndpointType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:655:1: ( ( ( 'REGISTRATION' ) ) | ( ( 'LOGIN' ) ) | ( ( 'LOGOUT' ) ) | ( ( 'OTHER' ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt5=1;
                }
                break;
            case 28:
                {
                alt5=2;
                }
                break;
            case 29:
                {
                alt5=3;
                }
                break;
            case 30:
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
                    // InternalSecurityDsl.g:656:2: ( ( 'REGISTRATION' ) )
                    {
                    // InternalSecurityDsl.g:656:2: ( ( 'REGISTRATION' ) )
                    // InternalSecurityDsl.g:657:3: ( 'REGISTRATION' )
                    {
                     before(grammarAccess.getEEndpointTypeAccess().getREGISTRATIONEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:658:3: ( 'REGISTRATION' )
                    // InternalSecurityDsl.g:658:4: 'REGISTRATION'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointTypeAccess().getREGISTRATIONEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:662:2: ( ( 'LOGIN' ) )
                    {
                    // InternalSecurityDsl.g:662:2: ( ( 'LOGIN' ) )
                    // InternalSecurityDsl.g:663:3: ( 'LOGIN' )
                    {
                     before(grammarAccess.getEEndpointTypeAccess().getLOGINEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:664:3: ( 'LOGIN' )
                    // InternalSecurityDsl.g:664:4: 'LOGIN'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointTypeAccess().getLOGINEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:668:2: ( ( 'LOGOUT' ) )
                    {
                    // InternalSecurityDsl.g:668:2: ( ( 'LOGOUT' ) )
                    // InternalSecurityDsl.g:669:3: ( 'LOGOUT' )
                    {
                     before(grammarAccess.getEEndpointTypeAccess().getLOGOUTEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:670:3: ( 'LOGOUT' )
                    // InternalSecurityDsl.g:670:4: 'LOGOUT'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointTypeAccess().getLOGOUTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:674:2: ( ( 'OTHER' ) )
                    {
                    // InternalSecurityDsl.g:674:2: ( ( 'OTHER' ) )
                    // InternalSecurityDsl.g:675:3: ( 'OTHER' )
                    {
                     before(grammarAccess.getEEndpointTypeAccess().getOTHEREnumLiteralDeclaration_3()); 
                    // InternalSecurityDsl.g:676:3: ( 'OTHER' )
                    // InternalSecurityDsl.g:676:4: 'OTHER'
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
    // InternalSecurityDsl.g:684:1: rule__EClaimType__Alternatives : ( ( ( 'PRIVATE' ) ) | ( ( 'PUBLIC' ) ) | ( ( 'REGISTERED' ) ) );
    public final void rule__EClaimType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:688:1: ( ( ( 'PRIVATE' ) ) | ( ( 'PUBLIC' ) ) | ( ( 'REGISTERED' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt6=1;
                }
                break;
            case 32:
                {
                alt6=2;
                }
                break;
            case 33:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSecurityDsl.g:689:2: ( ( 'PRIVATE' ) )
                    {
                    // InternalSecurityDsl.g:689:2: ( ( 'PRIVATE' ) )
                    // InternalSecurityDsl.g:690:3: ( 'PRIVATE' )
                    {
                     before(grammarAccess.getEClaimTypeAccess().getPRIVATEEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:691:3: ( 'PRIVATE' )
                    // InternalSecurityDsl.g:691:4: 'PRIVATE'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getEClaimTypeAccess().getPRIVATEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:695:2: ( ( 'PUBLIC' ) )
                    {
                    // InternalSecurityDsl.g:695:2: ( ( 'PUBLIC' ) )
                    // InternalSecurityDsl.g:696:3: ( 'PUBLIC' )
                    {
                     before(grammarAccess.getEClaimTypeAccess().getPUBLICEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:697:3: ( 'PUBLIC' )
                    // InternalSecurityDsl.g:697:4: 'PUBLIC'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getEClaimTypeAccess().getPUBLICEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:701:2: ( ( 'REGISTERED' ) )
                    {
                    // InternalSecurityDsl.g:701:2: ( ( 'REGISTERED' ) )
                    // InternalSecurityDsl.g:702:3: ( 'REGISTERED' )
                    {
                     before(grammarAccess.getEClaimTypeAccess().getREGISTEREDEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:703:3: ( 'REGISTERED' )
                    // InternalSecurityDsl.g:703:4: 'REGISTERED'
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
    // InternalSecurityDsl.g:711:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:715:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // InternalSecurityDsl.g:716:2: rule__Application__Group__0__Impl rule__Application__Group__1
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
    // InternalSecurityDsl.g:723:1: rule__Application__Group__0__Impl : ( () ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:727:1: ( ( () ) )
            // InternalSecurityDsl.g:728:1: ( () )
            {
            // InternalSecurityDsl.g:728:1: ( () )
            // InternalSecurityDsl.g:729:2: ()
            {
             before(grammarAccess.getApplicationAccess().getApplicationAction_0()); 
            // InternalSecurityDsl.g:730:2: ()
            // InternalSecurityDsl.g:730:3: 
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
    // InternalSecurityDsl.g:738:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:742:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // InternalSecurityDsl.g:743:2: rule__Application__Group__1__Impl rule__Application__Group__2
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
    // InternalSecurityDsl.g:750:1: rule__Application__Group__1__Impl : ( 'application:' ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:754:1: ( ( 'application:' ) )
            // InternalSecurityDsl.g:755:1: ( 'application:' )
            {
            // InternalSecurityDsl.g:755:1: ( 'application:' )
            // InternalSecurityDsl.g:756:2: 'application:'
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
    // InternalSecurityDsl.g:765:1: rule__Application__Group__2 : rule__Application__Group__2__Impl rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:769:1: ( rule__Application__Group__2__Impl rule__Application__Group__3 )
            // InternalSecurityDsl.g:770:2: rule__Application__Group__2__Impl rule__Application__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalSecurityDsl.g:777:1: rule__Application__Group__2__Impl : ( ( rule__Application__Group_2__0 )? ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:781:1: ( ( ( rule__Application__Group_2__0 )? ) )
            // InternalSecurityDsl.g:782:1: ( ( rule__Application__Group_2__0 )? )
            {
            // InternalSecurityDsl.g:782:1: ( ( rule__Application__Group_2__0 )? )
            // InternalSecurityDsl.g:783:2: ( rule__Application__Group_2__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_2()); 
            // InternalSecurityDsl.g:784:2: ( rule__Application__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==35) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSecurityDsl.g:784:3: rule__Application__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Application__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:792:1: rule__Application__Group__3 : rule__Application__Group__3__Impl rule__Application__Group__4 ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:796:1: ( rule__Application__Group__3__Impl rule__Application__Group__4 )
            // InternalSecurityDsl.g:797:2: rule__Application__Group__3__Impl rule__Application__Group__4
            {
            pushFollow(FOLLOW_4);
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
    // InternalSecurityDsl.g:804:1: rule__Application__Group__3__Impl : ( ( rule__Application__Group_3__0 )? ) ;
    public final void rule__Application__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:808:1: ( ( ( rule__Application__Group_3__0 )? ) )
            // InternalSecurityDsl.g:809:1: ( ( rule__Application__Group_3__0 )? )
            {
            // InternalSecurityDsl.g:809:1: ( ( rule__Application__Group_3__0 )? )
            // InternalSecurityDsl.g:810:2: ( rule__Application__Group_3__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_3()); 
            // InternalSecurityDsl.g:811:2: ( rule__Application__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==36) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSecurityDsl.g:811:3: rule__Application__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Application__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:819:1: rule__Application__Group__4 : rule__Application__Group__4__Impl rule__Application__Group__5 ;
    public final void rule__Application__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:823:1: ( rule__Application__Group__4__Impl rule__Application__Group__5 )
            // InternalSecurityDsl.g:824:2: rule__Application__Group__4__Impl rule__Application__Group__5
            {
            pushFollow(FOLLOW_4);
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
    // InternalSecurityDsl.g:831:1: rule__Application__Group__4__Impl : ( ( rule__Application__Group_4__0 )? ) ;
    public final void rule__Application__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:835:1: ( ( ( rule__Application__Group_4__0 )? ) )
            // InternalSecurityDsl.g:836:1: ( ( rule__Application__Group_4__0 )? )
            {
            // InternalSecurityDsl.g:836:1: ( ( rule__Application__Group_4__0 )? )
            // InternalSecurityDsl.g:837:2: ( rule__Application__Group_4__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_4()); 
            // InternalSecurityDsl.g:838:2: ( rule__Application__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==37) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSecurityDsl.g:838:3: rule__Application__Group_4__0
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
    // InternalSecurityDsl.g:846:1: rule__Application__Group__5 : rule__Application__Group__5__Impl rule__Application__Group__6 ;
    public final void rule__Application__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:850:1: ( rule__Application__Group__5__Impl rule__Application__Group__6 )
            // InternalSecurityDsl.g:851:2: rule__Application__Group__5__Impl rule__Application__Group__6
            {
            pushFollow(FOLLOW_4);
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
    // InternalSecurityDsl.g:858:1: rule__Application__Group__5__Impl : ( ( rule__Application__Group_5__0 )? ) ;
    public final void rule__Application__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:862:1: ( ( ( rule__Application__Group_5__0 )? ) )
            // InternalSecurityDsl.g:863:1: ( ( rule__Application__Group_5__0 )? )
            {
            // InternalSecurityDsl.g:863:1: ( ( rule__Application__Group_5__0 )? )
            // InternalSecurityDsl.g:864:2: ( rule__Application__Group_5__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_5()); 
            // InternalSecurityDsl.g:865:2: ( rule__Application__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==38) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSecurityDsl.g:865:3: rule__Application__Group_5__0
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
    // InternalSecurityDsl.g:873:1: rule__Application__Group__6 : rule__Application__Group__6__Impl rule__Application__Group__7 ;
    public final void rule__Application__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:877:1: ( rule__Application__Group__6__Impl rule__Application__Group__7 )
            // InternalSecurityDsl.g:878:2: rule__Application__Group__6__Impl rule__Application__Group__7
            {
            pushFollow(FOLLOW_4);
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
    // InternalSecurityDsl.g:885:1: rule__Application__Group__6__Impl : ( ( rule__Application__Group_6__0 )? ) ;
    public final void rule__Application__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:889:1: ( ( ( rule__Application__Group_6__0 )? ) )
            // InternalSecurityDsl.g:890:1: ( ( rule__Application__Group_6__0 )? )
            {
            // InternalSecurityDsl.g:890:1: ( ( rule__Application__Group_6__0 )? )
            // InternalSecurityDsl.g:891:2: ( rule__Application__Group_6__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_6()); 
            // InternalSecurityDsl.g:892:2: ( rule__Application__Group_6__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==39) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSecurityDsl.g:892:3: rule__Application__Group_6__0
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
    // InternalSecurityDsl.g:900:1: rule__Application__Group__7 : rule__Application__Group__7__Impl rule__Application__Group__8 ;
    public final void rule__Application__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:904:1: ( rule__Application__Group__7__Impl rule__Application__Group__8 )
            // InternalSecurityDsl.g:905:2: rule__Application__Group__7__Impl rule__Application__Group__8
            {
            pushFollow(FOLLOW_4);
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
    // InternalSecurityDsl.g:912:1: rule__Application__Group__7__Impl : ( ( rule__Application__Group_7__0 )? ) ;
    public final void rule__Application__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:916:1: ( ( ( rule__Application__Group_7__0 )? ) )
            // InternalSecurityDsl.g:917:1: ( ( rule__Application__Group_7__0 )? )
            {
            // InternalSecurityDsl.g:917:1: ( ( rule__Application__Group_7__0 )? )
            // InternalSecurityDsl.g:918:2: ( rule__Application__Group_7__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_7()); 
            // InternalSecurityDsl.g:919:2: ( rule__Application__Group_7__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==40) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSecurityDsl.g:919:3: rule__Application__Group_7__0
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
    // InternalSecurityDsl.g:927:1: rule__Application__Group__8 : rule__Application__Group__8__Impl rule__Application__Group__9 ;
    public final void rule__Application__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:931:1: ( rule__Application__Group__8__Impl rule__Application__Group__9 )
            // InternalSecurityDsl.g:932:2: rule__Application__Group__8__Impl rule__Application__Group__9
            {
            pushFollow(FOLLOW_4);
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
    // InternalSecurityDsl.g:939:1: rule__Application__Group__8__Impl : ( ( rule__Application__Group_8__0 )? ) ;
    public final void rule__Application__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:943:1: ( ( ( rule__Application__Group_8__0 )? ) )
            // InternalSecurityDsl.g:944:1: ( ( rule__Application__Group_8__0 )? )
            {
            // InternalSecurityDsl.g:944:1: ( ( rule__Application__Group_8__0 )? )
            // InternalSecurityDsl.g:945:2: ( rule__Application__Group_8__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_8()); 
            // InternalSecurityDsl.g:946:2: ( rule__Application__Group_8__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==41) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSecurityDsl.g:946:3: rule__Application__Group_8__0
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
    // InternalSecurityDsl.g:954:1: rule__Application__Group__9 : rule__Application__Group__9__Impl rule__Application__Group__10 ;
    public final void rule__Application__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:958:1: ( rule__Application__Group__9__Impl rule__Application__Group__10 )
            // InternalSecurityDsl.g:959:2: rule__Application__Group__9__Impl rule__Application__Group__10
            {
            pushFollow(FOLLOW_4);
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
    // InternalSecurityDsl.g:966:1: rule__Application__Group__9__Impl : ( ( rule__Application__Group_9__0 )? ) ;
    public final void rule__Application__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:970:1: ( ( ( rule__Application__Group_9__0 )? ) )
            // InternalSecurityDsl.g:971:1: ( ( rule__Application__Group_9__0 )? )
            {
            // InternalSecurityDsl.g:971:1: ( ( rule__Application__Group_9__0 )? )
            // InternalSecurityDsl.g:972:2: ( rule__Application__Group_9__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_9()); 
            // InternalSecurityDsl.g:973:2: ( rule__Application__Group_9__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==42) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSecurityDsl.g:973:3: rule__Application__Group_9__0
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
    // InternalSecurityDsl.g:981:1: rule__Application__Group__10 : rule__Application__Group__10__Impl rule__Application__Group__11 ;
    public final void rule__Application__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:985:1: ( rule__Application__Group__10__Impl rule__Application__Group__11 )
            // InternalSecurityDsl.g:986:2: rule__Application__Group__10__Impl rule__Application__Group__11
            {
            pushFollow(FOLLOW_4);
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
    // InternalSecurityDsl.g:993:1: rule__Application__Group__10__Impl : ( ( rule__Application__Group_10__0 )? ) ;
    public final void rule__Application__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:997:1: ( ( ( rule__Application__Group_10__0 )? ) )
            // InternalSecurityDsl.g:998:1: ( ( rule__Application__Group_10__0 )? )
            {
            // InternalSecurityDsl.g:998:1: ( ( rule__Application__Group_10__0 )? )
            // InternalSecurityDsl.g:999:2: ( rule__Application__Group_10__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_10()); 
            // InternalSecurityDsl.g:1000:2: ( rule__Application__Group_10__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==43) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSecurityDsl.g:1000:3: rule__Application__Group_10__0
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
    // InternalSecurityDsl.g:1008:1: rule__Application__Group__11 : rule__Application__Group__11__Impl rule__Application__Group__12 ;
    public final void rule__Application__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1012:1: ( rule__Application__Group__11__Impl rule__Application__Group__12 )
            // InternalSecurityDsl.g:1013:2: rule__Application__Group__11__Impl rule__Application__Group__12
            {
            pushFollow(FOLLOW_4);
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
    // InternalSecurityDsl.g:1020:1: rule__Application__Group__11__Impl : ( ( rule__Application__Group_11__0 )? ) ;
    public final void rule__Application__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1024:1: ( ( ( rule__Application__Group_11__0 )? ) )
            // InternalSecurityDsl.g:1025:1: ( ( rule__Application__Group_11__0 )? )
            {
            // InternalSecurityDsl.g:1025:1: ( ( rule__Application__Group_11__0 )? )
            // InternalSecurityDsl.g:1026:2: ( rule__Application__Group_11__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_11()); 
            // InternalSecurityDsl.g:1027:2: ( rule__Application__Group_11__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==46) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSecurityDsl.g:1027:3: rule__Application__Group_11__0
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
    // InternalSecurityDsl.g:1035:1: rule__Application__Group__12 : rule__Application__Group__12__Impl ;
    public final void rule__Application__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1039:1: ( rule__Application__Group__12__Impl )
            // InternalSecurityDsl.g:1040:2: rule__Application__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group__12__Impl();

            state._fsp--;


            }

        }
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
    // InternalSecurityDsl.g:1046:1: rule__Application__Group__12__Impl : ( ( rule__Application__Group_12__0 )? ) ;
    public final void rule__Application__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1050:1: ( ( ( rule__Application__Group_12__0 )? ) )
            // InternalSecurityDsl.g:1051:1: ( ( rule__Application__Group_12__0 )? )
            {
            // InternalSecurityDsl.g:1051:1: ( ( rule__Application__Group_12__0 )? )
            // InternalSecurityDsl.g:1052:2: ( rule__Application__Group_12__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_12()); 
            // InternalSecurityDsl.g:1053:2: ( rule__Application__Group_12__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==47) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSecurityDsl.g:1053:3: rule__Application__Group_12__0
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


    // $ANTLR start "rule__Application__Group_2__0"
    // InternalSecurityDsl.g:1062:1: rule__Application__Group_2__0 : rule__Application__Group_2__0__Impl rule__Application__Group_2__1 ;
    public final void rule__Application__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1066:1: ( rule__Application__Group_2__0__Impl rule__Application__Group_2__1 )
            // InternalSecurityDsl.g:1067:2: rule__Application__Group_2__0__Impl rule__Application__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Application__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_2__0"


    // $ANTLR start "rule__Application__Group_2__0__Impl"
    // InternalSecurityDsl.g:1074:1: rule__Application__Group_2__0__Impl : ( 'artifact:' ) ;
    public final void rule__Application__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1078:1: ( ( 'artifact:' ) )
            // InternalSecurityDsl.g:1079:1: ( 'artifact:' )
            {
            // InternalSecurityDsl.g:1079:1: ( 'artifact:' )
            // InternalSecurityDsl.g:1080:2: 'artifact:'
            {
             before(grammarAccess.getApplicationAccess().getArtifactKeyword_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getArtifactKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_2__0__Impl"


    // $ANTLR start "rule__Application__Group_2__1"
    // InternalSecurityDsl.g:1089:1: rule__Application__Group_2__1 : rule__Application__Group_2__1__Impl ;
    public final void rule__Application__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1093:1: ( rule__Application__Group_2__1__Impl )
            // InternalSecurityDsl.g:1094:2: rule__Application__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_2__1"


    // $ANTLR start "rule__Application__Group_2__1__Impl"
    // InternalSecurityDsl.g:1100:1: rule__Application__Group_2__1__Impl : ( ( rule__Application__ArtifactAssignment_2_1 ) ) ;
    public final void rule__Application__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1104:1: ( ( ( rule__Application__ArtifactAssignment_2_1 ) ) )
            // InternalSecurityDsl.g:1105:1: ( ( rule__Application__ArtifactAssignment_2_1 ) )
            {
            // InternalSecurityDsl.g:1105:1: ( ( rule__Application__ArtifactAssignment_2_1 ) )
            // InternalSecurityDsl.g:1106:2: ( rule__Application__ArtifactAssignment_2_1 )
            {
             before(grammarAccess.getApplicationAccess().getArtifactAssignment_2_1()); 
            // InternalSecurityDsl.g:1107:2: ( rule__Application__ArtifactAssignment_2_1 )
            // InternalSecurityDsl.g:1107:3: rule__Application__ArtifactAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__ArtifactAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getArtifactAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_2__1__Impl"


    // $ANTLR start "rule__Application__Group_3__0"
    // InternalSecurityDsl.g:1116:1: rule__Application__Group_3__0 : rule__Application__Group_3__0__Impl rule__Application__Group_3__1 ;
    public final void rule__Application__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1120:1: ( rule__Application__Group_3__0__Impl rule__Application__Group_3__1 )
            // InternalSecurityDsl.g:1121:2: rule__Application__Group_3__0__Impl rule__Application__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Application__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_3__0"


    // $ANTLR start "rule__Application__Group_3__0__Impl"
    // InternalSecurityDsl.g:1128:1: rule__Application__Group_3__0__Impl : ( 'name:' ) ;
    public final void rule__Application__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1132:1: ( ( 'name:' ) )
            // InternalSecurityDsl.g:1133:1: ( 'name:' )
            {
            // InternalSecurityDsl.g:1133:1: ( 'name:' )
            // InternalSecurityDsl.g:1134:2: 'name:'
            {
             before(grammarAccess.getApplicationAccess().getNameKeyword_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_3__0__Impl"


    // $ANTLR start "rule__Application__Group_3__1"
    // InternalSecurityDsl.g:1143:1: rule__Application__Group_3__1 : rule__Application__Group_3__1__Impl ;
    public final void rule__Application__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1147:1: ( rule__Application__Group_3__1__Impl )
            // InternalSecurityDsl.g:1148:2: rule__Application__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_3__1"


    // $ANTLR start "rule__Application__Group_3__1__Impl"
    // InternalSecurityDsl.g:1154:1: rule__Application__Group_3__1__Impl : ( ( rule__Application__NameAssignment_3_1 ) ) ;
    public final void rule__Application__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1158:1: ( ( ( rule__Application__NameAssignment_3_1 ) ) )
            // InternalSecurityDsl.g:1159:1: ( ( rule__Application__NameAssignment_3_1 ) )
            {
            // InternalSecurityDsl.g:1159:1: ( ( rule__Application__NameAssignment_3_1 ) )
            // InternalSecurityDsl.g:1160:2: ( rule__Application__NameAssignment_3_1 )
            {
             before(grammarAccess.getApplicationAccess().getNameAssignment_3_1()); 
            // InternalSecurityDsl.g:1161:2: ( rule__Application__NameAssignment_3_1 )
            // InternalSecurityDsl.g:1161:3: rule__Application__NameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_3__1__Impl"


    // $ANTLR start "rule__Application__Group_4__0"
    // InternalSecurityDsl.g:1170:1: rule__Application__Group_4__0 : rule__Application__Group_4__0__Impl rule__Application__Group_4__1 ;
    public final void rule__Application__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1174:1: ( rule__Application__Group_4__0__Impl rule__Application__Group_4__1 )
            // InternalSecurityDsl.g:1175:2: rule__Application__Group_4__0__Impl rule__Application__Group_4__1
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
    // InternalSecurityDsl.g:1182:1: rule__Application__Group_4__0__Impl : ( 'group:' ) ;
    public final void rule__Application__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1186:1: ( ( 'group:' ) )
            // InternalSecurityDsl.g:1187:1: ( 'group:' )
            {
            // InternalSecurityDsl.g:1187:1: ( 'group:' )
            // InternalSecurityDsl.g:1188:2: 'group:'
            {
             before(grammarAccess.getApplicationAccess().getGroupKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getGroupKeyword_4_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:1197:1: rule__Application__Group_4__1 : rule__Application__Group_4__1__Impl ;
    public final void rule__Application__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1201:1: ( rule__Application__Group_4__1__Impl )
            // InternalSecurityDsl.g:1202:2: rule__Application__Group_4__1__Impl
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
    // InternalSecurityDsl.g:1208:1: rule__Application__Group_4__1__Impl : ( ( rule__Application__GroupAssignment_4_1 ) ) ;
    public final void rule__Application__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1212:1: ( ( ( rule__Application__GroupAssignment_4_1 ) ) )
            // InternalSecurityDsl.g:1213:1: ( ( rule__Application__GroupAssignment_4_1 ) )
            {
            // InternalSecurityDsl.g:1213:1: ( ( rule__Application__GroupAssignment_4_1 ) )
            // InternalSecurityDsl.g:1214:2: ( rule__Application__GroupAssignment_4_1 )
            {
             before(grammarAccess.getApplicationAccess().getGroupAssignment_4_1()); 
            // InternalSecurityDsl.g:1215:2: ( rule__Application__GroupAssignment_4_1 )
            // InternalSecurityDsl.g:1215:3: rule__Application__GroupAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__GroupAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getGroupAssignment_4_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:1224:1: rule__Application__Group_5__0 : rule__Application__Group_5__0__Impl rule__Application__Group_5__1 ;
    public final void rule__Application__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1228:1: ( rule__Application__Group_5__0__Impl rule__Application__Group_5__1 )
            // InternalSecurityDsl.g:1229:2: rule__Application__Group_5__0__Impl rule__Application__Group_5__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSecurityDsl.g:1236:1: rule__Application__Group_5__0__Impl : ( 'packageName:' ) ;
    public final void rule__Application__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1240:1: ( ( 'packageName:' ) )
            // InternalSecurityDsl.g:1241:1: ( 'packageName:' )
            {
            // InternalSecurityDsl.g:1241:1: ( 'packageName:' )
            // InternalSecurityDsl.g:1242:2: 'packageName:'
            {
             before(grammarAccess.getApplicationAccess().getPackageNameKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getPackageNameKeyword_5_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:1251:1: rule__Application__Group_5__1 : rule__Application__Group_5__1__Impl ;
    public final void rule__Application__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1255:1: ( rule__Application__Group_5__1__Impl )
            // InternalSecurityDsl.g:1256:2: rule__Application__Group_5__1__Impl
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
    // InternalSecurityDsl.g:1262:1: rule__Application__Group_5__1__Impl : ( ( rule__Application__PackageNameAssignment_5_1 ) ) ;
    public final void rule__Application__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1266:1: ( ( ( rule__Application__PackageNameAssignment_5_1 ) ) )
            // InternalSecurityDsl.g:1267:1: ( ( rule__Application__PackageNameAssignment_5_1 ) )
            {
            // InternalSecurityDsl.g:1267:1: ( ( rule__Application__PackageNameAssignment_5_1 ) )
            // InternalSecurityDsl.g:1268:2: ( rule__Application__PackageNameAssignment_5_1 )
            {
             before(grammarAccess.getApplicationAccess().getPackageNameAssignment_5_1()); 
            // InternalSecurityDsl.g:1269:2: ( rule__Application__PackageNameAssignment_5_1 )
            // InternalSecurityDsl.g:1269:3: rule__Application__PackageNameAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__PackageNameAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getPackageNameAssignment_5_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:1278:1: rule__Application__Group_6__0 : rule__Application__Group_6__0__Impl rule__Application__Group_6__1 ;
    public final void rule__Application__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1282:1: ( rule__Application__Group_6__0__Impl rule__Application__Group_6__1 )
            // InternalSecurityDsl.g:1283:2: rule__Application__Group_6__0__Impl rule__Application__Group_6__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSecurityDsl.g:1290:1: rule__Application__Group_6__0__Impl : ( 'description:' ) ;
    public final void rule__Application__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1294:1: ( ( 'description:' ) )
            // InternalSecurityDsl.g:1295:1: ( 'description:' )
            {
            // InternalSecurityDsl.g:1295:1: ( 'description:' )
            // InternalSecurityDsl.g:1296:2: 'description:'
            {
             before(grammarAccess.getApplicationAccess().getDescriptionKeyword_6_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getDescriptionKeyword_6_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:1305:1: rule__Application__Group_6__1 : rule__Application__Group_6__1__Impl ;
    public final void rule__Application__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1309:1: ( rule__Application__Group_6__1__Impl )
            // InternalSecurityDsl.g:1310:2: rule__Application__Group_6__1__Impl
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
    // InternalSecurityDsl.g:1316:1: rule__Application__Group_6__1__Impl : ( ( rule__Application__DescriptionAssignment_6_1 ) ) ;
    public final void rule__Application__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1320:1: ( ( ( rule__Application__DescriptionAssignment_6_1 ) ) )
            // InternalSecurityDsl.g:1321:1: ( ( rule__Application__DescriptionAssignment_6_1 ) )
            {
            // InternalSecurityDsl.g:1321:1: ( ( rule__Application__DescriptionAssignment_6_1 ) )
            // InternalSecurityDsl.g:1322:2: ( rule__Application__DescriptionAssignment_6_1 )
            {
             before(grammarAccess.getApplicationAccess().getDescriptionAssignment_6_1()); 
            // InternalSecurityDsl.g:1323:2: ( rule__Application__DescriptionAssignment_6_1 )
            // InternalSecurityDsl.g:1323:3: rule__Application__DescriptionAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__DescriptionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getDescriptionAssignment_6_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:1332:1: rule__Application__Group_7__0 : rule__Application__Group_7__0__Impl rule__Application__Group_7__1 ;
    public final void rule__Application__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1336:1: ( rule__Application__Group_7__0__Impl rule__Application__Group_7__1 )
            // InternalSecurityDsl.g:1337:2: rule__Application__Group_7__0__Impl rule__Application__Group_7__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSecurityDsl.g:1344:1: rule__Application__Group_7__0__Impl : ( 'port:' ) ;
    public final void rule__Application__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1348:1: ( ( 'port:' ) )
            // InternalSecurityDsl.g:1349:1: ( 'port:' )
            {
            // InternalSecurityDsl.g:1349:1: ( 'port:' )
            // InternalSecurityDsl.g:1350:2: 'port:'
            {
             before(grammarAccess.getApplicationAccess().getPortKeyword_7_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getPortKeyword_7_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:1359:1: rule__Application__Group_7__1 : rule__Application__Group_7__1__Impl ;
    public final void rule__Application__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1363:1: ( rule__Application__Group_7__1__Impl )
            // InternalSecurityDsl.g:1364:2: rule__Application__Group_7__1__Impl
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
    // InternalSecurityDsl.g:1370:1: rule__Application__Group_7__1__Impl : ( ( rule__Application__PortAssignment_7_1 ) ) ;
    public final void rule__Application__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1374:1: ( ( ( rule__Application__PortAssignment_7_1 ) ) )
            // InternalSecurityDsl.g:1375:1: ( ( rule__Application__PortAssignment_7_1 ) )
            {
            // InternalSecurityDsl.g:1375:1: ( ( rule__Application__PortAssignment_7_1 ) )
            // InternalSecurityDsl.g:1376:2: ( rule__Application__PortAssignment_7_1 )
            {
             before(grammarAccess.getApplicationAccess().getPortAssignment_7_1()); 
            // InternalSecurityDsl.g:1377:2: ( rule__Application__PortAssignment_7_1 )
            // InternalSecurityDsl.g:1377:3: rule__Application__PortAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__PortAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getPortAssignment_7_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:1386:1: rule__Application__Group_8__0 : rule__Application__Group_8__0__Impl rule__Application__Group_8__1 ;
    public final void rule__Application__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1390:1: ( rule__Application__Group_8__0__Impl rule__Application__Group_8__1 )
            // InternalSecurityDsl.g:1391:2: rule__Application__Group_8__0__Impl rule__Application__Group_8__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSecurityDsl.g:1398:1: rule__Application__Group_8__0__Impl : ( 'hostname:' ) ;
    public final void rule__Application__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1402:1: ( ( 'hostname:' ) )
            // InternalSecurityDsl.g:1403:1: ( 'hostname:' )
            {
            // InternalSecurityDsl.g:1403:1: ( 'hostname:' )
            // InternalSecurityDsl.g:1404:2: 'hostname:'
            {
             before(grammarAccess.getApplicationAccess().getHostnameKeyword_8_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getHostnameKeyword_8_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:1413:1: rule__Application__Group_8__1 : rule__Application__Group_8__1__Impl ;
    public final void rule__Application__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1417:1: ( rule__Application__Group_8__1__Impl )
            // InternalSecurityDsl.g:1418:2: rule__Application__Group_8__1__Impl
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
    // InternalSecurityDsl.g:1424:1: rule__Application__Group_8__1__Impl : ( ( rule__Application__HostnameAssignment_8_1 ) ) ;
    public final void rule__Application__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1428:1: ( ( ( rule__Application__HostnameAssignment_8_1 ) ) )
            // InternalSecurityDsl.g:1429:1: ( ( rule__Application__HostnameAssignment_8_1 ) )
            {
            // InternalSecurityDsl.g:1429:1: ( ( rule__Application__HostnameAssignment_8_1 ) )
            // InternalSecurityDsl.g:1430:2: ( rule__Application__HostnameAssignment_8_1 )
            {
             before(grammarAccess.getApplicationAccess().getHostnameAssignment_8_1()); 
            // InternalSecurityDsl.g:1431:2: ( rule__Application__HostnameAssignment_8_1 )
            // InternalSecurityDsl.g:1431:3: rule__Application__HostnameAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__HostnameAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getHostnameAssignment_8_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:1440:1: rule__Application__Group_9__0 : rule__Application__Group_9__0__Impl rule__Application__Group_9__1 ;
    public final void rule__Application__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1444:1: ( rule__Application__Group_9__0__Impl rule__Application__Group_9__1 )
            // InternalSecurityDsl.g:1445:2: rule__Application__Group_9__0__Impl rule__Application__Group_9__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalSecurityDsl.g:1452:1: rule__Application__Group_9__0__Impl : ( 'database:' ) ;
    public final void rule__Application__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1456:1: ( ( 'database:' ) )
            // InternalSecurityDsl.g:1457:1: ( 'database:' )
            {
            // InternalSecurityDsl.g:1457:1: ( 'database:' )
            // InternalSecurityDsl.g:1458:2: 'database:'
            {
             before(grammarAccess.getApplicationAccess().getDatabaseKeyword_9_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getDatabaseKeyword_9_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:1467:1: rule__Application__Group_9__1 : rule__Application__Group_9__1__Impl ;
    public final void rule__Application__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1471:1: ( rule__Application__Group_9__1__Impl )
            // InternalSecurityDsl.g:1472:2: rule__Application__Group_9__1__Impl
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
    // InternalSecurityDsl.g:1478:1: rule__Application__Group_9__1__Impl : ( ( rule__Application__App_databaseAssignment_9_1 ) ) ;
    public final void rule__Application__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1482:1: ( ( ( rule__Application__App_databaseAssignment_9_1 ) ) )
            // InternalSecurityDsl.g:1483:1: ( ( rule__Application__App_databaseAssignment_9_1 ) )
            {
            // InternalSecurityDsl.g:1483:1: ( ( rule__Application__App_databaseAssignment_9_1 ) )
            // InternalSecurityDsl.g:1484:2: ( rule__Application__App_databaseAssignment_9_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_databaseAssignment_9_1()); 
            // InternalSecurityDsl.g:1485:2: ( rule__Application__App_databaseAssignment_9_1 )
            // InternalSecurityDsl.g:1485:3: rule__Application__App_databaseAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__App_databaseAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getApp_databaseAssignment_9_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:1494:1: rule__Application__Group_10__0 : rule__Application__Group_10__0__Impl rule__Application__Group_10__1 ;
    public final void rule__Application__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1498:1: ( rule__Application__Group_10__0__Impl rule__Application__Group_10__1 )
            // InternalSecurityDsl.g:1499:2: rule__Application__Group_10__0__Impl rule__Application__Group_10__1
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
    // InternalSecurityDsl.g:1506:1: rule__Application__Group_10__0__Impl : ( 'model:' ) ;
    public final void rule__Application__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1510:1: ( ( 'model:' ) )
            // InternalSecurityDsl.g:1511:1: ( 'model:' )
            {
            // InternalSecurityDsl.g:1511:1: ( 'model:' )
            // InternalSecurityDsl.g:1512:2: 'model:'
            {
             before(grammarAccess.getApplicationAccess().getModelKeyword_10_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getModelKeyword_10_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:1521:1: rule__Application__Group_10__1 : rule__Application__Group_10__1__Impl rule__Application__Group_10__2 ;
    public final void rule__Application__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1525:1: ( rule__Application__Group_10__1__Impl rule__Application__Group_10__2 )
            // InternalSecurityDsl.g:1526:2: rule__Application__Group_10__1__Impl rule__Application__Group_10__2
            {
            pushFollow(FOLLOW_8);
            rule__Application__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_10__2();

            state._fsp--;


            }

        }
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
    // InternalSecurityDsl.g:1533:1: rule__Application__Group_10__1__Impl : ( ( rule__Application__Group_10_1__0 )? ) ;
    public final void rule__Application__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1537:1: ( ( ( rule__Application__Group_10_1__0 )? ) )
            // InternalSecurityDsl.g:1538:1: ( ( rule__Application__Group_10_1__0 )? )
            {
            // InternalSecurityDsl.g:1538:1: ( ( rule__Application__Group_10_1__0 )? )
            // InternalSecurityDsl.g:1539:2: ( rule__Application__Group_10_1__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_10_1()); 
            // InternalSecurityDsl.g:1540:2: ( rule__Application__Group_10_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==44) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSecurityDsl.g:1540:3: rule__Application__Group_10_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Application__Group_10_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationAccess().getGroup_10_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Application__Group_10__2"
    // InternalSecurityDsl.g:1548:1: rule__Application__Group_10__2 : rule__Application__Group_10__2__Impl ;
    public final void rule__Application__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1552:1: ( rule__Application__Group_10__2__Impl )
            // InternalSecurityDsl.g:1553:2: rule__Application__Group_10__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_10__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_10__2"


    // $ANTLR start "rule__Application__Group_10__2__Impl"
    // InternalSecurityDsl.g:1559:1: rule__Application__Group_10__2__Impl : ( ( rule__Application__Group_10_2__0 )? ) ;
    public final void rule__Application__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1563:1: ( ( ( rule__Application__Group_10_2__0 )? ) )
            // InternalSecurityDsl.g:1564:1: ( ( rule__Application__Group_10_2__0 )? )
            {
            // InternalSecurityDsl.g:1564:1: ( ( rule__Application__Group_10_2__0 )? )
            // InternalSecurityDsl.g:1565:2: ( rule__Application__Group_10_2__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_10_2()); 
            // InternalSecurityDsl.g:1566:2: ( rule__Application__Group_10_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==45) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSecurityDsl.g:1566:3: rule__Application__Group_10_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Application__Group_10_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationAccess().getGroup_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_10__2__Impl"


    // $ANTLR start "rule__Application__Group_10_1__0"
    // InternalSecurityDsl.g:1575:1: rule__Application__Group_10_1__0 : rule__Application__Group_10_1__0__Impl rule__Application__Group_10_1__1 ;
    public final void rule__Application__Group_10_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1579:1: ( rule__Application__Group_10_1__0__Impl rule__Application__Group_10_1__1 )
            // InternalSecurityDsl.g:1580:2: rule__Application__Group_10_1__0__Impl rule__Application__Group_10_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Application__Group_10_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_10_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_10_1__0"


    // $ANTLR start "rule__Application__Group_10_1__0__Impl"
    // InternalSecurityDsl.g:1587:1: rule__Application__Group_10_1__0__Impl : ( 'user:' ) ;
    public final void rule__Application__Group_10_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1591:1: ( ( 'user:' ) )
            // InternalSecurityDsl.g:1592:1: ( 'user:' )
            {
            // InternalSecurityDsl.g:1592:1: ( 'user:' )
            // InternalSecurityDsl.g:1593:2: 'user:'
            {
             before(grammarAccess.getApplicationAccess().getUserKeyword_10_1_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getUserKeyword_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_10_1__0__Impl"


    // $ANTLR start "rule__Application__Group_10_1__1"
    // InternalSecurityDsl.g:1602:1: rule__Application__Group_10_1__1 : rule__Application__Group_10_1__1__Impl ;
    public final void rule__Application__Group_10_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1606:1: ( rule__Application__Group_10_1__1__Impl )
            // InternalSecurityDsl.g:1607:2: rule__Application__Group_10_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_10_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_10_1__1"


    // $ANTLR start "rule__Application__Group_10_1__1__Impl"
    // InternalSecurityDsl.g:1613:1: rule__Application__Group_10_1__1__Impl : ( ( rule__Application__App_modelsAssignment_10_1_1 ) ) ;
    public final void rule__Application__Group_10_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1617:1: ( ( ( rule__Application__App_modelsAssignment_10_1_1 ) ) )
            // InternalSecurityDsl.g:1618:1: ( ( rule__Application__App_modelsAssignment_10_1_1 ) )
            {
            // InternalSecurityDsl.g:1618:1: ( ( rule__Application__App_modelsAssignment_10_1_1 ) )
            // InternalSecurityDsl.g:1619:2: ( rule__Application__App_modelsAssignment_10_1_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_modelsAssignment_10_1_1()); 
            // InternalSecurityDsl.g:1620:2: ( rule__Application__App_modelsAssignment_10_1_1 )
            // InternalSecurityDsl.g:1620:3: rule__Application__App_modelsAssignment_10_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__App_modelsAssignment_10_1_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getApp_modelsAssignment_10_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_10_1__1__Impl"


    // $ANTLR start "rule__Application__Group_10_2__0"
    // InternalSecurityDsl.g:1629:1: rule__Application__Group_10_2__0 : rule__Application__Group_10_2__0__Impl rule__Application__Group_10_2__1 ;
    public final void rule__Application__Group_10_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1633:1: ( rule__Application__Group_10_2__0__Impl rule__Application__Group_10_2__1 )
            // InternalSecurityDsl.g:1634:2: rule__Application__Group_10_2__0__Impl rule__Application__Group_10_2__1
            {
            pushFollow(FOLLOW_10);
            rule__Application__Group_10_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_10_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_10_2__0"


    // $ANTLR start "rule__Application__Group_10_2__0__Impl"
    // InternalSecurityDsl.g:1641:1: rule__Application__Group_10_2__0__Impl : ( 'role:' ) ;
    public final void rule__Application__Group_10_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1645:1: ( ( 'role:' ) )
            // InternalSecurityDsl.g:1646:1: ( 'role:' )
            {
            // InternalSecurityDsl.g:1646:1: ( 'role:' )
            // InternalSecurityDsl.g:1647:2: 'role:'
            {
             before(grammarAccess.getApplicationAccess().getRoleKeyword_10_2_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getRoleKeyword_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_10_2__0__Impl"


    // $ANTLR start "rule__Application__Group_10_2__1"
    // InternalSecurityDsl.g:1656:1: rule__Application__Group_10_2__1 : rule__Application__Group_10_2__1__Impl ;
    public final void rule__Application__Group_10_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1660:1: ( rule__Application__Group_10_2__1__Impl )
            // InternalSecurityDsl.g:1661:2: rule__Application__Group_10_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_10_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_10_2__1"


    // $ANTLR start "rule__Application__Group_10_2__1__Impl"
    // InternalSecurityDsl.g:1667:1: rule__Application__Group_10_2__1__Impl : ( ( rule__Application__App_modelsAssignment_10_2_1 ) ) ;
    public final void rule__Application__Group_10_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1671:1: ( ( ( rule__Application__App_modelsAssignment_10_2_1 ) ) )
            // InternalSecurityDsl.g:1672:1: ( ( rule__Application__App_modelsAssignment_10_2_1 ) )
            {
            // InternalSecurityDsl.g:1672:1: ( ( rule__Application__App_modelsAssignment_10_2_1 ) )
            // InternalSecurityDsl.g:1673:2: ( rule__Application__App_modelsAssignment_10_2_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_modelsAssignment_10_2_1()); 
            // InternalSecurityDsl.g:1674:2: ( rule__Application__App_modelsAssignment_10_2_1 )
            // InternalSecurityDsl.g:1674:3: rule__Application__App_modelsAssignment_10_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__App_modelsAssignment_10_2_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getApp_modelsAssignment_10_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_10_2__1__Impl"


    // $ANTLR start "rule__Application__Group_11__0"
    // InternalSecurityDsl.g:1683:1: rule__Application__Group_11__0 : rule__Application__Group_11__0__Impl rule__Application__Group_11__1 ;
    public final void rule__Application__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1687:1: ( rule__Application__Group_11__0__Impl rule__Application__Group_11__1 )
            // InternalSecurityDsl.g:1688:2: rule__Application__Group_11__0__Impl rule__Application__Group_11__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSecurityDsl.g:1695:1: rule__Application__Group_11__0__Impl : ( 'security:' ) ;
    public final void rule__Application__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1699:1: ( ( 'security:' ) )
            // InternalSecurityDsl.g:1700:1: ( 'security:' )
            {
            // InternalSecurityDsl.g:1700:1: ( 'security:' )
            // InternalSecurityDsl.g:1701:2: 'security:'
            {
             before(grammarAccess.getApplicationAccess().getSecurityKeyword_11_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getSecurityKeyword_11_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:1710:1: rule__Application__Group_11__1 : rule__Application__Group_11__1__Impl ;
    public final void rule__Application__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1714:1: ( rule__Application__Group_11__1__Impl )
            // InternalSecurityDsl.g:1715:2: rule__Application__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_11__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalSecurityDsl.g:1721:1: rule__Application__Group_11__1__Impl : ( ( rule__Application__App_securityAssignment_11_1 ) ) ;
    public final void rule__Application__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1725:1: ( ( ( rule__Application__App_securityAssignment_11_1 ) ) )
            // InternalSecurityDsl.g:1726:1: ( ( rule__Application__App_securityAssignment_11_1 ) )
            {
            // InternalSecurityDsl.g:1726:1: ( ( rule__Application__App_securityAssignment_11_1 ) )
            // InternalSecurityDsl.g:1727:2: ( rule__Application__App_securityAssignment_11_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_securityAssignment_11_1()); 
            // InternalSecurityDsl.g:1728:2: ( rule__Application__App_securityAssignment_11_1 )
            // InternalSecurityDsl.g:1728:3: rule__Application__App_securityAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__App_securityAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getApp_securityAssignment_11_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Application__Group_12__0"
    // InternalSecurityDsl.g:1737:1: rule__Application__Group_12__0 : rule__Application__Group_12__0__Impl rule__Application__Group_12__1 ;
    public final void rule__Application__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1741:1: ( rule__Application__Group_12__0__Impl rule__Application__Group_12__1 )
            // InternalSecurityDsl.g:1742:2: rule__Application__Group_12__0__Impl rule__Application__Group_12__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalSecurityDsl.g:1749:1: rule__Application__Group_12__0__Impl : ( 'controller:' ) ;
    public final void rule__Application__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1753:1: ( ( 'controller:' ) )
            // InternalSecurityDsl.g:1754:1: ( 'controller:' )
            {
            // InternalSecurityDsl.g:1754:1: ( 'controller:' )
            // InternalSecurityDsl.g:1755:2: 'controller:'
            {
             before(grammarAccess.getApplicationAccess().getControllerKeyword_12_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getControllerKeyword_12_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:1764:1: rule__Application__Group_12__1 : rule__Application__Group_12__1__Impl ;
    public final void rule__Application__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1768:1: ( rule__Application__Group_12__1__Impl )
            // InternalSecurityDsl.g:1769:2: rule__Application__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_12__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalSecurityDsl.g:1775:1: rule__Application__Group_12__1__Impl : ( ( rule__Application__Group_12_1__0 )? ) ;
    public final void rule__Application__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1779:1: ( ( ( rule__Application__Group_12_1__0 )? ) )
            // InternalSecurityDsl.g:1780:1: ( ( rule__Application__Group_12_1__0 )? )
            {
            // InternalSecurityDsl.g:1780:1: ( ( rule__Application__Group_12_1__0 )? )
            // InternalSecurityDsl.g:1781:2: ( rule__Application__Group_12_1__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_12_1()); 
            // InternalSecurityDsl.g:1782:2: ( rule__Application__Group_12_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==48) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSecurityDsl.g:1782:3: rule__Application__Group_12_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Application__Group_12_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationAccess().getGroup_12_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Application__Group_12_1__0"
    // InternalSecurityDsl.g:1791:1: rule__Application__Group_12_1__0 : rule__Application__Group_12_1__0__Impl rule__Application__Group_12_1__1 ;
    public final void rule__Application__Group_12_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1795:1: ( rule__Application__Group_12_1__0__Impl rule__Application__Group_12_1__1 )
            // InternalSecurityDsl.g:1796:2: rule__Application__Group_12_1__0__Impl rule__Application__Group_12_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Application__Group_12_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_12_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_12_1__0"


    // $ANTLR start "rule__Application__Group_12_1__0__Impl"
    // InternalSecurityDsl.g:1803:1: rule__Application__Group_12_1__0__Impl : ( 'auth:' ) ;
    public final void rule__Application__Group_12_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1807:1: ( ( 'auth:' ) )
            // InternalSecurityDsl.g:1808:1: ( 'auth:' )
            {
            // InternalSecurityDsl.g:1808:1: ( 'auth:' )
            // InternalSecurityDsl.g:1809:2: 'auth:'
            {
             before(grammarAccess.getApplicationAccess().getAuthKeyword_12_1_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getAuthKeyword_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_12_1__0__Impl"


    // $ANTLR start "rule__Application__Group_12_1__1"
    // InternalSecurityDsl.g:1818:1: rule__Application__Group_12_1__1 : rule__Application__Group_12_1__1__Impl ;
    public final void rule__Application__Group_12_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1822:1: ( rule__Application__Group_12_1__1__Impl )
            // InternalSecurityDsl.g:1823:2: rule__Application__Group_12_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_12_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_12_1__1"


    // $ANTLR start "rule__Application__Group_12_1__1__Impl"
    // InternalSecurityDsl.g:1829:1: rule__Application__Group_12_1__1__Impl : ( ( rule__Application__App_controllersAssignment_12_1_1 ) ) ;
    public final void rule__Application__Group_12_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1833:1: ( ( ( rule__Application__App_controllersAssignment_12_1_1 ) ) )
            // InternalSecurityDsl.g:1834:1: ( ( rule__Application__App_controllersAssignment_12_1_1 ) )
            {
            // InternalSecurityDsl.g:1834:1: ( ( rule__Application__App_controllersAssignment_12_1_1 ) )
            // InternalSecurityDsl.g:1835:2: ( rule__Application__App_controllersAssignment_12_1_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_controllersAssignment_12_1_1()); 
            // InternalSecurityDsl.g:1836:2: ( rule__Application__App_controllersAssignment_12_1_1 )
            // InternalSecurityDsl.g:1836:3: rule__Application__App_controllersAssignment_12_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__App_controllersAssignment_12_1_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getApp_controllersAssignment_12_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_12_1__1__Impl"


    // $ANTLR start "rule__Database__Group__0"
    // InternalSecurityDsl.g:1845:1: rule__Database__Group__0 : rule__Database__Group__0__Impl rule__Database__Group__1 ;
    public final void rule__Database__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1849:1: ( rule__Database__Group__0__Impl rule__Database__Group__1 )
            // InternalSecurityDsl.g:1850:2: rule__Database__Group__0__Impl rule__Database__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalSecurityDsl.g:1857:1: rule__Database__Group__0__Impl : ( 'vendor:' ) ;
    public final void rule__Database__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1861:1: ( ( 'vendor:' ) )
            // InternalSecurityDsl.g:1862:1: ( 'vendor:' )
            {
            // InternalSecurityDsl.g:1862:1: ( 'vendor:' )
            // InternalSecurityDsl.g:1863:2: 'vendor:'
            {
             before(grammarAccess.getDatabaseAccess().getVendorKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getDatabaseAccess().getVendorKeyword_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:1872:1: rule__Database__Group__1 : rule__Database__Group__1__Impl rule__Database__Group__2 ;
    public final void rule__Database__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1876:1: ( rule__Database__Group__1__Impl rule__Database__Group__2 )
            // InternalSecurityDsl.g:1877:2: rule__Database__Group__1__Impl rule__Database__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalSecurityDsl.g:1884:1: rule__Database__Group__1__Impl : ( ( rule__Database__VendorNameAssignment_1 ) ) ;
    public final void rule__Database__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1888:1: ( ( ( rule__Database__VendorNameAssignment_1 ) ) )
            // InternalSecurityDsl.g:1889:1: ( ( rule__Database__VendorNameAssignment_1 ) )
            {
            // InternalSecurityDsl.g:1889:1: ( ( rule__Database__VendorNameAssignment_1 ) )
            // InternalSecurityDsl.g:1890:2: ( rule__Database__VendorNameAssignment_1 )
            {
             before(grammarAccess.getDatabaseAccess().getVendorNameAssignment_1()); 
            // InternalSecurityDsl.g:1891:2: ( rule__Database__VendorNameAssignment_1 )
            // InternalSecurityDsl.g:1891:3: rule__Database__VendorNameAssignment_1
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
    // InternalSecurityDsl.g:1899:1: rule__Database__Group__2 : rule__Database__Group__2__Impl rule__Database__Group__3 ;
    public final void rule__Database__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1903:1: ( rule__Database__Group__2__Impl rule__Database__Group__3 )
            // InternalSecurityDsl.g:1904:2: rule__Database__Group__2__Impl rule__Database__Group__3
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
    // InternalSecurityDsl.g:1911:1: rule__Database__Group__2__Impl : ( 'url:' ) ;
    public final void rule__Database__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1915:1: ( ( 'url:' ) )
            // InternalSecurityDsl.g:1916:1: ( 'url:' )
            {
            // InternalSecurityDsl.g:1916:1: ( 'url:' )
            // InternalSecurityDsl.g:1917:2: 'url:'
            {
             before(grammarAccess.getDatabaseAccess().getUrlKeyword_2()); 
            match(input,50,FOLLOW_2); 
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
    // InternalSecurityDsl.g:1926:1: rule__Database__Group__3 : rule__Database__Group__3__Impl rule__Database__Group__4 ;
    public final void rule__Database__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1930:1: ( rule__Database__Group__3__Impl rule__Database__Group__4 )
            // InternalSecurityDsl.g:1931:2: rule__Database__Group__3__Impl rule__Database__Group__4
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
    // InternalSecurityDsl.g:1938:1: rule__Database__Group__3__Impl : ( ( rule__Database__UrlAssignment_3 ) ) ;
    public final void rule__Database__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1942:1: ( ( ( rule__Database__UrlAssignment_3 ) ) )
            // InternalSecurityDsl.g:1943:1: ( ( rule__Database__UrlAssignment_3 ) )
            {
            // InternalSecurityDsl.g:1943:1: ( ( rule__Database__UrlAssignment_3 ) )
            // InternalSecurityDsl.g:1944:2: ( rule__Database__UrlAssignment_3 )
            {
             before(grammarAccess.getDatabaseAccess().getUrlAssignment_3()); 
            // InternalSecurityDsl.g:1945:2: ( rule__Database__UrlAssignment_3 )
            // InternalSecurityDsl.g:1945:3: rule__Database__UrlAssignment_3
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
    // InternalSecurityDsl.g:1953:1: rule__Database__Group__4 : rule__Database__Group__4__Impl rule__Database__Group__5 ;
    public final void rule__Database__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1957:1: ( rule__Database__Group__4__Impl rule__Database__Group__5 )
            // InternalSecurityDsl.g:1958:2: rule__Database__Group__4__Impl rule__Database__Group__5
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
    // InternalSecurityDsl.g:1965:1: rule__Database__Group__4__Impl : ( 'username:' ) ;
    public final void rule__Database__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1969:1: ( ( 'username:' ) )
            // InternalSecurityDsl.g:1970:1: ( 'username:' )
            {
            // InternalSecurityDsl.g:1970:1: ( 'username:' )
            // InternalSecurityDsl.g:1971:2: 'username:'
            {
             before(grammarAccess.getDatabaseAccess().getUsernameKeyword_4()); 
            match(input,51,FOLLOW_2); 
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
    // InternalSecurityDsl.g:1980:1: rule__Database__Group__5 : rule__Database__Group__5__Impl rule__Database__Group__6 ;
    public final void rule__Database__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1984:1: ( rule__Database__Group__5__Impl rule__Database__Group__6 )
            // InternalSecurityDsl.g:1985:2: rule__Database__Group__5__Impl rule__Database__Group__6
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
    // InternalSecurityDsl.g:1992:1: rule__Database__Group__5__Impl : ( ( rule__Database__UsernameAssignment_5 ) ) ;
    public final void rule__Database__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1996:1: ( ( ( rule__Database__UsernameAssignment_5 ) ) )
            // InternalSecurityDsl.g:1997:1: ( ( rule__Database__UsernameAssignment_5 ) )
            {
            // InternalSecurityDsl.g:1997:1: ( ( rule__Database__UsernameAssignment_5 ) )
            // InternalSecurityDsl.g:1998:2: ( rule__Database__UsernameAssignment_5 )
            {
             before(grammarAccess.getDatabaseAccess().getUsernameAssignment_5()); 
            // InternalSecurityDsl.g:1999:2: ( rule__Database__UsernameAssignment_5 )
            // InternalSecurityDsl.g:1999:3: rule__Database__UsernameAssignment_5
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
    // InternalSecurityDsl.g:2007:1: rule__Database__Group__6 : rule__Database__Group__6__Impl rule__Database__Group__7 ;
    public final void rule__Database__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2011:1: ( rule__Database__Group__6__Impl rule__Database__Group__7 )
            // InternalSecurityDsl.g:2012:2: rule__Database__Group__6__Impl rule__Database__Group__7
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
    // InternalSecurityDsl.g:2019:1: rule__Database__Group__6__Impl : ( 'password:' ) ;
    public final void rule__Database__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2023:1: ( ( 'password:' ) )
            // InternalSecurityDsl.g:2024:1: ( 'password:' )
            {
            // InternalSecurityDsl.g:2024:1: ( 'password:' )
            // InternalSecurityDsl.g:2025:2: 'password:'
            {
             before(grammarAccess.getDatabaseAccess().getPasswordKeyword_6()); 
            match(input,52,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2034:1: rule__Database__Group__7 : rule__Database__Group__7__Impl ;
    public final void rule__Database__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2038:1: ( rule__Database__Group__7__Impl )
            // InternalSecurityDsl.g:2039:2: rule__Database__Group__7__Impl
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
    // InternalSecurityDsl.g:2045:1: rule__Database__Group__7__Impl : ( ( rule__Database__PasswordAssignment_7 ) ) ;
    public final void rule__Database__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2049:1: ( ( ( rule__Database__PasswordAssignment_7 ) ) )
            // InternalSecurityDsl.g:2050:1: ( ( rule__Database__PasswordAssignment_7 ) )
            {
            // InternalSecurityDsl.g:2050:1: ( ( rule__Database__PasswordAssignment_7 ) )
            // InternalSecurityDsl.g:2051:2: ( rule__Database__PasswordAssignment_7 )
            {
             before(grammarAccess.getDatabaseAccess().getPasswordAssignment_7()); 
            // InternalSecurityDsl.g:2052:2: ( rule__Database__PasswordAssignment_7 )
            // InternalSecurityDsl.g:2052:3: rule__Database__PasswordAssignment_7
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


    // $ANTLR start "rule__ELongObject__Group__0"
    // InternalSecurityDsl.g:2061:1: rule__ELongObject__Group__0 : rule__ELongObject__Group__0__Impl rule__ELongObject__Group__1 ;
    public final void rule__ELongObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2065:1: ( rule__ELongObject__Group__0__Impl rule__ELongObject__Group__1 )
            // InternalSecurityDsl.g:2066:2: rule__ELongObject__Group__0__Impl rule__ELongObject__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSecurityDsl.g:2073:1: rule__ELongObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__ELongObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2077:1: ( ( ( '-' )? ) )
            // InternalSecurityDsl.g:2078:1: ( ( '-' )? )
            {
            // InternalSecurityDsl.g:2078:1: ( ( '-' )? )
            // InternalSecurityDsl.g:2079:2: ( '-' )?
            {
             before(grammarAccess.getELongObjectAccess().getHyphenMinusKeyword_0()); 
            // InternalSecurityDsl.g:2080:2: ( '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==53) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSecurityDsl.g:2080:3: '-'
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
    // InternalSecurityDsl.g:2088:1: rule__ELongObject__Group__1 : rule__ELongObject__Group__1__Impl ;
    public final void rule__ELongObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2092:1: ( rule__ELongObject__Group__1__Impl )
            // InternalSecurityDsl.g:2093:2: rule__ELongObject__Group__1__Impl
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
    // InternalSecurityDsl.g:2099:1: rule__ELongObject__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__ELongObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2103:1: ( ( RULE_INT ) )
            // InternalSecurityDsl.g:2104:1: ( RULE_INT )
            {
            // InternalSecurityDsl.g:2104:1: ( RULE_INT )
            // InternalSecurityDsl.g:2105:2: RULE_INT
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
    // InternalSecurityDsl.g:2115:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2119:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalSecurityDsl.g:2120:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalSecurityDsl.g:2127:1: rule__Attribute__Group__0__Impl : ( '{' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2131:1: ( ( '{' ) )
            // InternalSecurityDsl.g:2132:1: ( '{' )
            {
            // InternalSecurityDsl.g:2132:1: ( '{' )
            // InternalSecurityDsl.g:2133:2: '{'
            {
             before(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:2142:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2146:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalSecurityDsl.g:2147:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalSecurityDsl.g:2154:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__IsIdentifierAssignment_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2158:1: ( ( ( rule__Attribute__IsIdentifierAssignment_1 )? ) )
            // InternalSecurityDsl.g:2159:1: ( ( rule__Attribute__IsIdentifierAssignment_1 )? )
            {
            // InternalSecurityDsl.g:2159:1: ( ( rule__Attribute__IsIdentifierAssignment_1 )? )
            // InternalSecurityDsl.g:2160:2: ( rule__Attribute__IsIdentifierAssignment_1 )?
            {
             before(grammarAccess.getAttributeAccess().getIsIdentifierAssignment_1()); 
            // InternalSecurityDsl.g:2161:2: ( rule__Attribute__IsIdentifierAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==81) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSecurityDsl.g:2161:3: rule__Attribute__IsIdentifierAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__IsIdentifierAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getIsIdentifierAssignment_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:2169:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2173:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalSecurityDsl.g:2174:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
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
    // InternalSecurityDsl.g:2181:1: rule__Attribute__Group__2__Impl : ( 'name:' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2185:1: ( ( 'name:' ) )
            // InternalSecurityDsl.g:2186:1: ( 'name:' )
            {
            // InternalSecurityDsl.g:2186:1: ( 'name:' )
            // InternalSecurityDsl.g:2187:2: 'name:'
            {
             before(grammarAccess.getAttributeAccess().getNameKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameKeyword_2()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:2196:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2200:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalSecurityDsl.g:2201:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalSecurityDsl.g:2208:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__NameAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2212:1: ( ( ( rule__Attribute__NameAssignment_3 ) ) )
            // InternalSecurityDsl.g:2213:1: ( ( rule__Attribute__NameAssignment_3 ) )
            {
            // InternalSecurityDsl.g:2213:1: ( ( rule__Attribute__NameAssignment_3 ) )
            // InternalSecurityDsl.g:2214:2: ( rule__Attribute__NameAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_3()); 
            // InternalSecurityDsl.g:2215:2: ( rule__Attribute__NameAssignment_3 )
            // InternalSecurityDsl.g:2215:3: rule__Attribute__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:2223:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2227:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalSecurityDsl.g:2228:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalSecurityDsl.g:2235:1: rule__Attribute__Group__4__Impl : ( 'type:' ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2239:1: ( ( 'type:' ) )
            // InternalSecurityDsl.g:2240:1: ( 'type:' )
            {
            // InternalSecurityDsl.g:2240:1: ( 'type:' )
            // InternalSecurityDsl.g:2241:2: 'type:'
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
    // InternalSecurityDsl.g:2250:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2254:1: ( rule__Attribute__Group__5__Impl rule__Attribute__Group__6 )
            // InternalSecurityDsl.g:2255:2: rule__Attribute__Group__5__Impl rule__Attribute__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalSecurityDsl.g:2262:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__TypeAssignment_5 ) ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2266:1: ( ( ( rule__Attribute__TypeAssignment_5 ) ) )
            // InternalSecurityDsl.g:2267:1: ( ( rule__Attribute__TypeAssignment_5 ) )
            {
            // InternalSecurityDsl.g:2267:1: ( ( rule__Attribute__TypeAssignment_5 ) )
            // InternalSecurityDsl.g:2268:2: ( rule__Attribute__TypeAssignment_5 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_5()); 
            // InternalSecurityDsl.g:2269:2: ( rule__Attribute__TypeAssignment_5 )
            // InternalSecurityDsl.g:2269:3: rule__Attribute__TypeAssignment_5
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
    // InternalSecurityDsl.g:2277:1: rule__Attribute__Group__6 : rule__Attribute__Group__6__Impl rule__Attribute__Group__7 ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2281:1: ( rule__Attribute__Group__6__Impl rule__Attribute__Group__7 )
            // InternalSecurityDsl.g:2282:2: rule__Attribute__Group__6__Impl rule__Attribute__Group__7
            {
            pushFollow(FOLLOW_21);
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
    // InternalSecurityDsl.g:2289:1: rule__Attribute__Group__6__Impl : ( ( rule__Attribute__Group_6__0 )? ) ;
    public final void rule__Attribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2293:1: ( ( ( rule__Attribute__Group_6__0 )? ) )
            // InternalSecurityDsl.g:2294:1: ( ( rule__Attribute__Group_6__0 )? )
            {
            // InternalSecurityDsl.g:2294:1: ( ( rule__Attribute__Group_6__0 )? )
            // InternalSecurityDsl.g:2295:2: ( rule__Attribute__Group_6__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_6()); 
            // InternalSecurityDsl.g:2296:2: ( rule__Attribute__Group_6__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==57) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSecurityDsl.g:2296:3: rule__Attribute__Group_6__0
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
    // InternalSecurityDsl.g:2304:1: rule__Attribute__Group__7 : rule__Attribute__Group__7__Impl ;
    public final void rule__Attribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2308:1: ( rule__Attribute__Group__7__Impl )
            // InternalSecurityDsl.g:2309:2: rule__Attribute__Group__7__Impl
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
    // InternalSecurityDsl.g:2315:1: rule__Attribute__Group__7__Impl : ( '}' ) ;
    public final void rule__Attribute__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2319:1: ( ( '}' ) )
            // InternalSecurityDsl.g:2320:1: ( '}' )
            {
            // InternalSecurityDsl.g:2320:1: ( '}' )
            // InternalSecurityDsl.g:2321:2: '}'
            {
             before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,56,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2331:1: rule__Attribute__Group_6__0 : rule__Attribute__Group_6__0__Impl rule__Attribute__Group_6__1 ;
    public final void rule__Attribute__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2335:1: ( rule__Attribute__Group_6__0__Impl rule__Attribute__Group_6__1 )
            // InternalSecurityDsl.g:2336:2: rule__Attribute__Group_6__0__Impl rule__Attribute__Group_6__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSecurityDsl.g:2343:1: rule__Attribute__Group_6__0__Impl : ( 'collumnName:' ) ;
    public final void rule__Attribute__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2347:1: ( ( 'collumnName:' ) )
            // InternalSecurityDsl.g:2348:1: ( 'collumnName:' )
            {
            // InternalSecurityDsl.g:2348:1: ( 'collumnName:' )
            // InternalSecurityDsl.g:2349:2: 'collumnName:'
            {
             before(grammarAccess.getAttributeAccess().getCollumnNameKeyword_6_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2358:1: rule__Attribute__Group_6__1 : rule__Attribute__Group_6__1__Impl ;
    public final void rule__Attribute__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2362:1: ( rule__Attribute__Group_6__1__Impl )
            // InternalSecurityDsl.g:2363:2: rule__Attribute__Group_6__1__Impl
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
    // InternalSecurityDsl.g:2369:1: rule__Attribute__Group_6__1__Impl : ( ( rule__Attribute__CollumnNameAssignment_6_1 ) ) ;
    public final void rule__Attribute__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2373:1: ( ( ( rule__Attribute__CollumnNameAssignment_6_1 ) ) )
            // InternalSecurityDsl.g:2374:1: ( ( rule__Attribute__CollumnNameAssignment_6_1 ) )
            {
            // InternalSecurityDsl.g:2374:1: ( ( rule__Attribute__CollumnNameAssignment_6_1 ) )
            // InternalSecurityDsl.g:2375:2: ( rule__Attribute__CollumnNameAssignment_6_1 )
            {
             before(grammarAccess.getAttributeAccess().getCollumnNameAssignment_6_1()); 
            // InternalSecurityDsl.g:2376:2: ( rule__Attribute__CollumnNameAssignment_6_1 )
            // InternalSecurityDsl.g:2376:3: rule__Attribute__CollumnNameAssignment_6_1
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
    // InternalSecurityDsl.g:2385:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2389:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // InternalSecurityDsl.g:2390:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSecurityDsl.g:2397:1: rule__Role__Group__0__Impl : ( () ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2401:1: ( ( () ) )
            // InternalSecurityDsl.g:2402:1: ( () )
            {
            // InternalSecurityDsl.g:2402:1: ( () )
            // InternalSecurityDsl.g:2403:2: ()
            {
             before(grammarAccess.getRoleAccess().getRoleAction_0()); 
            // InternalSecurityDsl.g:2404:2: ()
            // InternalSecurityDsl.g:2404:3: 
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
    // InternalSecurityDsl.g:2412:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2416:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // InternalSecurityDsl.g:2417:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalSecurityDsl.g:2424:1: rule__Role__Group__1__Impl : ( ( rule__Role__Group_1__0 )? ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2428:1: ( ( ( rule__Role__Group_1__0 )? ) )
            // InternalSecurityDsl.g:2429:1: ( ( rule__Role__Group_1__0 )? )
            {
            // InternalSecurityDsl.g:2429:1: ( ( rule__Role__Group_1__0 )? )
            // InternalSecurityDsl.g:2430:2: ( rule__Role__Group_1__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_1()); 
            // InternalSecurityDsl.g:2431:2: ( rule__Role__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==58) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSecurityDsl.g:2431:3: rule__Role__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Role__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoleAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:2439:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2443:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // InternalSecurityDsl.g:2444:2: rule__Role__Group__2__Impl rule__Role__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalSecurityDsl.g:2451:1: rule__Role__Group__2__Impl : ( ( rule__Role__Group_2__0 )? ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2455:1: ( ( ( rule__Role__Group_2__0 )? ) )
            // InternalSecurityDsl.g:2456:1: ( ( rule__Role__Group_2__0 )? )
            {
            // InternalSecurityDsl.g:2456:1: ( ( rule__Role__Group_2__0 )? )
            // InternalSecurityDsl.g:2457:2: ( rule__Role__Group_2__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_2()); 
            // InternalSecurityDsl.g:2458:2: ( rule__Role__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==59) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSecurityDsl.g:2458:3: rule__Role__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Role__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoleAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:2466:1: rule__Role__Group__3 : rule__Role__Group__3__Impl ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2470:1: ( rule__Role__Group__3__Impl )
            // InternalSecurityDsl.g:2471:2: rule__Role__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalSecurityDsl.g:2477:1: rule__Role__Group__3__Impl : ( ( rule__Role__Group_3__0 )? ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2481:1: ( ( ( rule__Role__Group_3__0 )? ) )
            // InternalSecurityDsl.g:2482:1: ( ( rule__Role__Group_3__0 )? )
            {
            // InternalSecurityDsl.g:2482:1: ( ( rule__Role__Group_3__0 )? )
            // InternalSecurityDsl.g:2483:2: ( rule__Role__Group_3__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_3()); 
            // InternalSecurityDsl.g:2484:2: ( rule__Role__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==63) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSecurityDsl.g:2484:3: rule__Role__Group_3__0
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


    // $ANTLR start "rule__Role__Group_1__0"
    // InternalSecurityDsl.g:2493:1: rule__Role__Group_1__0 : rule__Role__Group_1__0__Impl rule__Role__Group_1__1 ;
    public final void rule__Role__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2497:1: ( rule__Role__Group_1__0__Impl rule__Role__Group_1__1 )
            // InternalSecurityDsl.g:2498:2: rule__Role__Group_1__0__Impl rule__Role__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Role__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_1__0"


    // $ANTLR start "rule__Role__Group_1__0__Impl"
    // InternalSecurityDsl.g:2505:1: rule__Role__Group_1__0__Impl : ( 'tableName:' ) ;
    public final void rule__Role__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2509:1: ( ( 'tableName:' ) )
            // InternalSecurityDsl.g:2510:1: ( 'tableName:' )
            {
            // InternalSecurityDsl.g:2510:1: ( 'tableName:' )
            // InternalSecurityDsl.g:2511:2: 'tableName:'
            {
             before(grammarAccess.getRoleAccess().getTableNameKeyword_1_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getTableNameKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_1__0__Impl"


    // $ANTLR start "rule__Role__Group_1__1"
    // InternalSecurityDsl.g:2520:1: rule__Role__Group_1__1 : rule__Role__Group_1__1__Impl ;
    public final void rule__Role__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2524:1: ( rule__Role__Group_1__1__Impl )
            // InternalSecurityDsl.g:2525:2: rule__Role__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_1__1"


    // $ANTLR start "rule__Role__Group_1__1__Impl"
    // InternalSecurityDsl.g:2531:1: rule__Role__Group_1__1__Impl : ( ( rule__Role__TableNameAssignment_1_1 ) ) ;
    public final void rule__Role__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2535:1: ( ( ( rule__Role__TableNameAssignment_1_1 ) ) )
            // InternalSecurityDsl.g:2536:1: ( ( rule__Role__TableNameAssignment_1_1 ) )
            {
            // InternalSecurityDsl.g:2536:1: ( ( rule__Role__TableNameAssignment_1_1 ) )
            // InternalSecurityDsl.g:2537:2: ( rule__Role__TableNameAssignment_1_1 )
            {
             before(grammarAccess.getRoleAccess().getTableNameAssignment_1_1()); 
            // InternalSecurityDsl.g:2538:2: ( rule__Role__TableNameAssignment_1_1 )
            // InternalSecurityDsl.g:2538:3: rule__Role__TableNameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Role__TableNameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getTableNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_1__1__Impl"


    // $ANTLR start "rule__Role__Group_2__0"
    // InternalSecurityDsl.g:2547:1: rule__Role__Group_2__0 : rule__Role__Group_2__0__Impl rule__Role__Group_2__1 ;
    public final void rule__Role__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2551:1: ( rule__Role__Group_2__0__Impl rule__Role__Group_2__1 )
            // InternalSecurityDsl.g:2552:2: rule__Role__Group_2__0__Impl rule__Role__Group_2__1
            {
            pushFollow(FOLLOW_22);
            rule__Role__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_2__0"


    // $ANTLR start "rule__Role__Group_2__0__Impl"
    // InternalSecurityDsl.g:2559:1: rule__Role__Group_2__0__Impl : ( 'attributes:' ) ;
    public final void rule__Role__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2563:1: ( ( 'attributes:' ) )
            // InternalSecurityDsl.g:2564:1: ( 'attributes:' )
            {
            // InternalSecurityDsl.g:2564:1: ( 'attributes:' )
            // InternalSecurityDsl.g:2565:2: 'attributes:'
            {
             before(grammarAccess.getRoleAccess().getAttributesKeyword_2_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getAttributesKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_2__0__Impl"


    // $ANTLR start "rule__Role__Group_2__1"
    // InternalSecurityDsl.g:2574:1: rule__Role__Group_2__1 : rule__Role__Group_2__1__Impl rule__Role__Group_2__2 ;
    public final void rule__Role__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2578:1: ( rule__Role__Group_2__1__Impl rule__Role__Group_2__2 )
            // InternalSecurityDsl.g:2579:2: rule__Role__Group_2__1__Impl rule__Role__Group_2__2
            {
            pushFollow(FOLLOW_23);
            rule__Role__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_2__1"


    // $ANTLR start "rule__Role__Group_2__1__Impl"
    // InternalSecurityDsl.g:2586:1: rule__Role__Group_2__1__Impl : ( '[' ) ;
    public final void rule__Role__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2590:1: ( ( '[' ) )
            // InternalSecurityDsl.g:2591:1: ( '[' )
            {
            // InternalSecurityDsl.g:2591:1: ( '[' )
            // InternalSecurityDsl.g:2592:2: '['
            {
             before(grammarAccess.getRoleAccess().getLeftSquareBracketKeyword_2_1()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getLeftSquareBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_2__1__Impl"


    // $ANTLR start "rule__Role__Group_2__2"
    // InternalSecurityDsl.g:2601:1: rule__Role__Group_2__2 : rule__Role__Group_2__2__Impl rule__Role__Group_2__3 ;
    public final void rule__Role__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2605:1: ( rule__Role__Group_2__2__Impl rule__Role__Group_2__3 )
            // InternalSecurityDsl.g:2606:2: rule__Role__Group_2__2__Impl rule__Role__Group_2__3
            {
            pushFollow(FOLLOW_24);
            rule__Role__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_2__2"


    // $ANTLR start "rule__Role__Group_2__2__Impl"
    // InternalSecurityDsl.g:2613:1: rule__Role__Group_2__2__Impl : ( ( rule__Role__Model_attributesAssignment_2_2 ) ) ;
    public final void rule__Role__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2617:1: ( ( ( rule__Role__Model_attributesAssignment_2_2 ) ) )
            // InternalSecurityDsl.g:2618:1: ( ( rule__Role__Model_attributesAssignment_2_2 ) )
            {
            // InternalSecurityDsl.g:2618:1: ( ( rule__Role__Model_attributesAssignment_2_2 ) )
            // InternalSecurityDsl.g:2619:2: ( rule__Role__Model_attributesAssignment_2_2 )
            {
             before(grammarAccess.getRoleAccess().getModel_attributesAssignment_2_2()); 
            // InternalSecurityDsl.g:2620:2: ( rule__Role__Model_attributesAssignment_2_2 )
            // InternalSecurityDsl.g:2620:3: rule__Role__Model_attributesAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Role__Model_attributesAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getModel_attributesAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_2__2__Impl"


    // $ANTLR start "rule__Role__Group_2__3"
    // InternalSecurityDsl.g:2628:1: rule__Role__Group_2__3 : rule__Role__Group_2__3__Impl rule__Role__Group_2__4 ;
    public final void rule__Role__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2632:1: ( rule__Role__Group_2__3__Impl rule__Role__Group_2__4 )
            // InternalSecurityDsl.g:2633:2: rule__Role__Group_2__3__Impl rule__Role__Group_2__4
            {
            pushFollow(FOLLOW_24);
            rule__Role__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_2__3"


    // $ANTLR start "rule__Role__Group_2__3__Impl"
    // InternalSecurityDsl.g:2640:1: rule__Role__Group_2__3__Impl : ( ( rule__Role__Group_2_3__0 )* ) ;
    public final void rule__Role__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2644:1: ( ( ( rule__Role__Group_2_3__0 )* ) )
            // InternalSecurityDsl.g:2645:1: ( ( rule__Role__Group_2_3__0 )* )
            {
            // InternalSecurityDsl.g:2645:1: ( ( rule__Role__Group_2_3__0 )* )
            // InternalSecurityDsl.g:2646:2: ( rule__Role__Group_2_3__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_2_3()); 
            // InternalSecurityDsl.g:2647:2: ( rule__Role__Group_2_3__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==62) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalSecurityDsl.g:2647:3: rule__Role__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Role__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getRoleAccess().getGroup_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_2__3__Impl"


    // $ANTLR start "rule__Role__Group_2__4"
    // InternalSecurityDsl.g:2655:1: rule__Role__Group_2__4 : rule__Role__Group_2__4__Impl ;
    public final void rule__Role__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2659:1: ( rule__Role__Group_2__4__Impl )
            // InternalSecurityDsl.g:2660:2: rule__Role__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_2__4"


    // $ANTLR start "rule__Role__Group_2__4__Impl"
    // InternalSecurityDsl.g:2666:1: rule__Role__Group_2__4__Impl : ( ']' ) ;
    public final void rule__Role__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2670:1: ( ( ']' ) )
            // InternalSecurityDsl.g:2671:1: ( ']' )
            {
            // InternalSecurityDsl.g:2671:1: ( ']' )
            // InternalSecurityDsl.g:2672:2: ']'
            {
             before(grammarAccess.getRoleAccess().getRightSquareBracketKeyword_2_4()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRightSquareBracketKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_2__4__Impl"


    // $ANTLR start "rule__Role__Group_2_3__0"
    // InternalSecurityDsl.g:2682:1: rule__Role__Group_2_3__0 : rule__Role__Group_2_3__0__Impl rule__Role__Group_2_3__1 ;
    public final void rule__Role__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2686:1: ( rule__Role__Group_2_3__0__Impl rule__Role__Group_2_3__1 )
            // InternalSecurityDsl.g:2687:2: rule__Role__Group_2_3__0__Impl rule__Role__Group_2_3__1
            {
            pushFollow(FOLLOW_23);
            rule__Role__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_2_3__0"


    // $ANTLR start "rule__Role__Group_2_3__0__Impl"
    // InternalSecurityDsl.g:2694:1: rule__Role__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__Role__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2698:1: ( ( ',' ) )
            // InternalSecurityDsl.g:2699:1: ( ',' )
            {
            // InternalSecurityDsl.g:2699:1: ( ',' )
            // InternalSecurityDsl.g:2700:2: ','
            {
             before(grammarAccess.getRoleAccess().getCommaKeyword_2_3_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getCommaKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_2_3__0__Impl"


    // $ANTLR start "rule__Role__Group_2_3__1"
    // InternalSecurityDsl.g:2709:1: rule__Role__Group_2_3__1 : rule__Role__Group_2_3__1__Impl ;
    public final void rule__Role__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2713:1: ( rule__Role__Group_2_3__1__Impl )
            // InternalSecurityDsl.g:2714:2: rule__Role__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_2_3__1"


    // $ANTLR start "rule__Role__Group_2_3__1__Impl"
    // InternalSecurityDsl.g:2720:1: rule__Role__Group_2_3__1__Impl : ( ( rule__Role__Model_attributesAssignment_2_3_1 ) ) ;
    public final void rule__Role__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2724:1: ( ( ( rule__Role__Model_attributesAssignment_2_3_1 ) ) )
            // InternalSecurityDsl.g:2725:1: ( ( rule__Role__Model_attributesAssignment_2_3_1 ) )
            {
            // InternalSecurityDsl.g:2725:1: ( ( rule__Role__Model_attributesAssignment_2_3_1 ) )
            // InternalSecurityDsl.g:2726:2: ( rule__Role__Model_attributesAssignment_2_3_1 )
            {
             before(grammarAccess.getRoleAccess().getModel_attributesAssignment_2_3_1()); 
            // InternalSecurityDsl.g:2727:2: ( rule__Role__Model_attributesAssignment_2_3_1 )
            // InternalSecurityDsl.g:2727:3: rule__Role__Model_attributesAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Role__Model_attributesAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getModel_attributesAssignment_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_2_3__1__Impl"


    // $ANTLR start "rule__Role__Group_3__0"
    // InternalSecurityDsl.g:2736:1: rule__Role__Group_3__0 : rule__Role__Group_3__0__Impl rule__Role__Group_3__1 ;
    public final void rule__Role__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2740:1: ( rule__Role__Group_3__0__Impl rule__Role__Group_3__1 )
            // InternalSecurityDsl.g:2741:2: rule__Role__Group_3__0__Impl rule__Role__Group_3__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalSecurityDsl.g:2748:1: rule__Role__Group_3__0__Impl : ( 'roles:' ) ;
    public final void rule__Role__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2752:1: ( ( 'roles:' ) )
            // InternalSecurityDsl.g:2753:1: ( 'roles:' )
            {
            // InternalSecurityDsl.g:2753:1: ( 'roles:' )
            // InternalSecurityDsl.g:2754:2: 'roles:'
            {
             before(grammarAccess.getRoleAccess().getRolesKeyword_3_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRolesKeyword_3_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:2763:1: rule__Role__Group_3__1 : rule__Role__Group_3__1__Impl rule__Role__Group_3__2 ;
    public final void rule__Role__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2767:1: ( rule__Role__Group_3__1__Impl rule__Role__Group_3__2 )
            // InternalSecurityDsl.g:2768:2: rule__Role__Group_3__1__Impl rule__Role__Group_3__2
            {
            pushFollow(FOLLOW_5);
            rule__Role__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_3__2();

            state._fsp--;


            }

        }
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
    // InternalSecurityDsl.g:2775:1: rule__Role__Group_3__1__Impl : ( '[' ) ;
    public final void rule__Role__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2779:1: ( ( '[' ) )
            // InternalSecurityDsl.g:2780:1: ( '[' )
            {
            // InternalSecurityDsl.g:2780:1: ( '[' )
            // InternalSecurityDsl.g:2781:2: '['
            {
             before(grammarAccess.getRoleAccess().getLeftSquareBracketKeyword_3_1()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getLeftSquareBracketKeyword_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Role__Group_3__2"
    // InternalSecurityDsl.g:2790:1: rule__Role__Group_3__2 : rule__Role__Group_3__2__Impl rule__Role__Group_3__3 ;
    public final void rule__Role__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2794:1: ( rule__Role__Group_3__2__Impl rule__Role__Group_3__3 )
            // InternalSecurityDsl.g:2795:2: rule__Role__Group_3__2__Impl rule__Role__Group_3__3
            {
            pushFollow(FOLLOW_24);
            rule__Role__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_3__2"


    // $ANTLR start "rule__Role__Group_3__2__Impl"
    // InternalSecurityDsl.g:2802:1: rule__Role__Group_3__2__Impl : ( ( rule__Role__Role_instancesAssignment_3_2 ) ) ;
    public final void rule__Role__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2806:1: ( ( ( rule__Role__Role_instancesAssignment_3_2 ) ) )
            // InternalSecurityDsl.g:2807:1: ( ( rule__Role__Role_instancesAssignment_3_2 ) )
            {
            // InternalSecurityDsl.g:2807:1: ( ( rule__Role__Role_instancesAssignment_3_2 ) )
            // InternalSecurityDsl.g:2808:2: ( rule__Role__Role_instancesAssignment_3_2 )
            {
             before(grammarAccess.getRoleAccess().getRole_instancesAssignment_3_2()); 
            // InternalSecurityDsl.g:2809:2: ( rule__Role__Role_instancesAssignment_3_2 )
            // InternalSecurityDsl.g:2809:3: rule__Role__Role_instancesAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Role__Role_instancesAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getRole_instancesAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_3__2__Impl"


    // $ANTLR start "rule__Role__Group_3__3"
    // InternalSecurityDsl.g:2817:1: rule__Role__Group_3__3 : rule__Role__Group_3__3__Impl rule__Role__Group_3__4 ;
    public final void rule__Role__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2821:1: ( rule__Role__Group_3__3__Impl rule__Role__Group_3__4 )
            // InternalSecurityDsl.g:2822:2: rule__Role__Group_3__3__Impl rule__Role__Group_3__4
            {
            pushFollow(FOLLOW_24);
            rule__Role__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_3__3"


    // $ANTLR start "rule__Role__Group_3__3__Impl"
    // InternalSecurityDsl.g:2829:1: rule__Role__Group_3__3__Impl : ( ( rule__Role__Group_3_3__0 )* ) ;
    public final void rule__Role__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2833:1: ( ( ( rule__Role__Group_3_3__0 )* ) )
            // InternalSecurityDsl.g:2834:1: ( ( rule__Role__Group_3_3__0 )* )
            {
            // InternalSecurityDsl.g:2834:1: ( ( rule__Role__Group_3_3__0 )* )
            // InternalSecurityDsl.g:2835:2: ( rule__Role__Group_3_3__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_3_3()); 
            // InternalSecurityDsl.g:2836:2: ( rule__Role__Group_3_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==62) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalSecurityDsl.g:2836:3: rule__Role__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Role__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getRoleAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_3__3__Impl"


    // $ANTLR start "rule__Role__Group_3__4"
    // InternalSecurityDsl.g:2844:1: rule__Role__Group_3__4 : rule__Role__Group_3__4__Impl ;
    public final void rule__Role__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2848:1: ( rule__Role__Group_3__4__Impl )
            // InternalSecurityDsl.g:2849:2: rule__Role__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_3__4"


    // $ANTLR start "rule__Role__Group_3__4__Impl"
    // InternalSecurityDsl.g:2855:1: rule__Role__Group_3__4__Impl : ( ']' ) ;
    public final void rule__Role__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2859:1: ( ( ']' ) )
            // InternalSecurityDsl.g:2860:1: ( ']' )
            {
            // InternalSecurityDsl.g:2860:1: ( ']' )
            // InternalSecurityDsl.g:2861:2: ']'
            {
             before(grammarAccess.getRoleAccess().getRightSquareBracketKeyword_3_4()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRightSquareBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_3__4__Impl"


    // $ANTLR start "rule__Role__Group_3_3__0"
    // InternalSecurityDsl.g:2871:1: rule__Role__Group_3_3__0 : rule__Role__Group_3_3__0__Impl rule__Role__Group_3_3__1 ;
    public final void rule__Role__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2875:1: ( rule__Role__Group_3_3__0__Impl rule__Role__Group_3_3__1 )
            // InternalSecurityDsl.g:2876:2: rule__Role__Group_3_3__0__Impl rule__Role__Group_3_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Role__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_3_3__0"


    // $ANTLR start "rule__Role__Group_3_3__0__Impl"
    // InternalSecurityDsl.g:2883:1: rule__Role__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Role__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2887:1: ( ( ',' ) )
            // InternalSecurityDsl.g:2888:1: ( ',' )
            {
            // InternalSecurityDsl.g:2888:1: ( ',' )
            // InternalSecurityDsl.g:2889:2: ','
            {
             before(grammarAccess.getRoleAccess().getCommaKeyword_3_3_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_3_3__0__Impl"


    // $ANTLR start "rule__Role__Group_3_3__1"
    // InternalSecurityDsl.g:2898:1: rule__Role__Group_3_3__1 : rule__Role__Group_3_3__1__Impl ;
    public final void rule__Role__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2902:1: ( rule__Role__Group_3_3__1__Impl )
            // InternalSecurityDsl.g:2903:2: rule__Role__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_3_3__1"


    // $ANTLR start "rule__Role__Group_3_3__1__Impl"
    // InternalSecurityDsl.g:2909:1: rule__Role__Group_3_3__1__Impl : ( ( rule__Role__Role_instancesAssignment_3_3_1 ) ) ;
    public final void rule__Role__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2913:1: ( ( ( rule__Role__Role_instancesAssignment_3_3_1 ) ) )
            // InternalSecurityDsl.g:2914:1: ( ( rule__Role__Role_instancesAssignment_3_3_1 ) )
            {
            // InternalSecurityDsl.g:2914:1: ( ( rule__Role__Role_instancesAssignment_3_3_1 ) )
            // InternalSecurityDsl.g:2915:2: ( rule__Role__Role_instancesAssignment_3_3_1 )
            {
             before(grammarAccess.getRoleAccess().getRole_instancesAssignment_3_3_1()); 
            // InternalSecurityDsl.g:2916:2: ( rule__Role__Role_instancesAssignment_3_3_1 )
            // InternalSecurityDsl.g:2916:3: rule__Role__Role_instancesAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Role__Role_instancesAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getRole_instancesAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_3_3__1__Impl"


    // $ANTLR start "rule__User__Group__0"
    // InternalSecurityDsl.g:2925:1: rule__User__Group__0 : rule__User__Group__0__Impl rule__User__Group__1 ;
    public final void rule__User__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2929:1: ( rule__User__Group__0__Impl rule__User__Group__1 )
            // InternalSecurityDsl.g:2930:2: rule__User__Group__0__Impl rule__User__Group__1
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
    // InternalSecurityDsl.g:2937:1: rule__User__Group__0__Impl : ( () ) ;
    public final void rule__User__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2941:1: ( ( () ) )
            // InternalSecurityDsl.g:2942:1: ( () )
            {
            // InternalSecurityDsl.g:2942:1: ( () )
            // InternalSecurityDsl.g:2943:2: ()
            {
             before(grammarAccess.getUserAccess().getUserAction_0()); 
            // InternalSecurityDsl.g:2944:2: ()
            // InternalSecurityDsl.g:2944:3: 
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
    // InternalSecurityDsl.g:2952:1: rule__User__Group__1 : rule__User__Group__1__Impl rule__User__Group__2 ;
    public final void rule__User__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2956:1: ( rule__User__Group__1__Impl rule__User__Group__2 )
            // InternalSecurityDsl.g:2957:2: rule__User__Group__1__Impl rule__User__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalSecurityDsl.g:2964:1: rule__User__Group__1__Impl : ( ( rule__User__Group_1__0 )? ) ;
    public final void rule__User__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2968:1: ( ( ( rule__User__Group_1__0 )? ) )
            // InternalSecurityDsl.g:2969:1: ( ( rule__User__Group_1__0 )? )
            {
            // InternalSecurityDsl.g:2969:1: ( ( rule__User__Group_1__0 )? )
            // InternalSecurityDsl.g:2970:2: ( rule__User__Group_1__0 )?
            {
             before(grammarAccess.getUserAccess().getGroup_1()); 
            // InternalSecurityDsl.g:2971:2: ( rule__User__Group_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==58) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSecurityDsl.g:2971:3: rule__User__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__User__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUserAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:2979:1: rule__User__Group__2 : rule__User__Group__2__Impl ;
    public final void rule__User__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2983:1: ( rule__User__Group__2__Impl )
            // InternalSecurityDsl.g:2984:2: rule__User__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__User__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalSecurityDsl.g:2990:1: rule__User__Group__2__Impl : ( ( rule__User__Group_2__0 )? ) ;
    public final void rule__User__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2994:1: ( ( ( rule__User__Group_2__0 )? ) )
            // InternalSecurityDsl.g:2995:1: ( ( rule__User__Group_2__0 )? )
            {
            // InternalSecurityDsl.g:2995:1: ( ( rule__User__Group_2__0 )? )
            // InternalSecurityDsl.g:2996:2: ( rule__User__Group_2__0 )?
            {
             before(grammarAccess.getUserAccess().getGroup_2()); 
            // InternalSecurityDsl.g:2997:2: ( rule__User__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==59) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSecurityDsl.g:2997:3: rule__User__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__User__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUserAccess().getGroup_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__User__Group_1__0"
    // InternalSecurityDsl.g:3006:1: rule__User__Group_1__0 : rule__User__Group_1__0__Impl rule__User__Group_1__1 ;
    public final void rule__User__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3010:1: ( rule__User__Group_1__0__Impl rule__User__Group_1__1 )
            // InternalSecurityDsl.g:3011:2: rule__User__Group_1__0__Impl rule__User__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__User__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_1__0"


    // $ANTLR start "rule__User__Group_1__0__Impl"
    // InternalSecurityDsl.g:3018:1: rule__User__Group_1__0__Impl : ( 'tableName:' ) ;
    public final void rule__User__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3022:1: ( ( 'tableName:' ) )
            // InternalSecurityDsl.g:3023:1: ( 'tableName:' )
            {
            // InternalSecurityDsl.g:3023:1: ( 'tableName:' )
            // InternalSecurityDsl.g:3024:2: 'tableName:'
            {
             before(grammarAccess.getUserAccess().getTableNameKeyword_1_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getTableNameKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_1__0__Impl"


    // $ANTLR start "rule__User__Group_1__1"
    // InternalSecurityDsl.g:3033:1: rule__User__Group_1__1 : rule__User__Group_1__1__Impl ;
    public final void rule__User__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3037:1: ( rule__User__Group_1__1__Impl )
            // InternalSecurityDsl.g:3038:2: rule__User__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__User__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_1__1"


    // $ANTLR start "rule__User__Group_1__1__Impl"
    // InternalSecurityDsl.g:3044:1: rule__User__Group_1__1__Impl : ( ( rule__User__TableNameAssignment_1_1 ) ) ;
    public final void rule__User__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3048:1: ( ( ( rule__User__TableNameAssignment_1_1 ) ) )
            // InternalSecurityDsl.g:3049:1: ( ( rule__User__TableNameAssignment_1_1 ) )
            {
            // InternalSecurityDsl.g:3049:1: ( ( rule__User__TableNameAssignment_1_1 ) )
            // InternalSecurityDsl.g:3050:2: ( rule__User__TableNameAssignment_1_1 )
            {
             before(grammarAccess.getUserAccess().getTableNameAssignment_1_1()); 
            // InternalSecurityDsl.g:3051:2: ( rule__User__TableNameAssignment_1_1 )
            // InternalSecurityDsl.g:3051:3: rule__User__TableNameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__User__TableNameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getTableNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_1__1__Impl"


    // $ANTLR start "rule__User__Group_2__0"
    // InternalSecurityDsl.g:3060:1: rule__User__Group_2__0 : rule__User__Group_2__0__Impl rule__User__Group_2__1 ;
    public final void rule__User__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3064:1: ( rule__User__Group_2__0__Impl rule__User__Group_2__1 )
            // InternalSecurityDsl.g:3065:2: rule__User__Group_2__0__Impl rule__User__Group_2__1
            {
            pushFollow(FOLLOW_22);
            rule__User__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_2__0"


    // $ANTLR start "rule__User__Group_2__0__Impl"
    // InternalSecurityDsl.g:3072:1: rule__User__Group_2__0__Impl : ( 'attributes:' ) ;
    public final void rule__User__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3076:1: ( ( 'attributes:' ) )
            // InternalSecurityDsl.g:3077:1: ( 'attributes:' )
            {
            // InternalSecurityDsl.g:3077:1: ( 'attributes:' )
            // InternalSecurityDsl.g:3078:2: 'attributes:'
            {
             before(grammarAccess.getUserAccess().getAttributesKeyword_2_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getAttributesKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_2__0__Impl"


    // $ANTLR start "rule__User__Group_2__1"
    // InternalSecurityDsl.g:3087:1: rule__User__Group_2__1 : rule__User__Group_2__1__Impl rule__User__Group_2__2 ;
    public final void rule__User__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3091:1: ( rule__User__Group_2__1__Impl rule__User__Group_2__2 )
            // InternalSecurityDsl.g:3092:2: rule__User__Group_2__1__Impl rule__User__Group_2__2
            {
            pushFollow(FOLLOW_23);
            rule__User__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_2__1"


    // $ANTLR start "rule__User__Group_2__1__Impl"
    // InternalSecurityDsl.g:3099:1: rule__User__Group_2__1__Impl : ( '[' ) ;
    public final void rule__User__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3103:1: ( ( '[' ) )
            // InternalSecurityDsl.g:3104:1: ( '[' )
            {
            // InternalSecurityDsl.g:3104:1: ( '[' )
            // InternalSecurityDsl.g:3105:2: '['
            {
             before(grammarAccess.getUserAccess().getLeftSquareBracketKeyword_2_1()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getLeftSquareBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_2__1__Impl"


    // $ANTLR start "rule__User__Group_2__2"
    // InternalSecurityDsl.g:3114:1: rule__User__Group_2__2 : rule__User__Group_2__2__Impl rule__User__Group_2__3 ;
    public final void rule__User__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3118:1: ( rule__User__Group_2__2__Impl rule__User__Group_2__3 )
            // InternalSecurityDsl.g:3119:2: rule__User__Group_2__2__Impl rule__User__Group_2__3
            {
            pushFollow(FOLLOW_24);
            rule__User__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_2__2"


    // $ANTLR start "rule__User__Group_2__2__Impl"
    // InternalSecurityDsl.g:3126:1: rule__User__Group_2__2__Impl : ( ( rule__User__Model_attributesAssignment_2_2 ) ) ;
    public final void rule__User__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3130:1: ( ( ( rule__User__Model_attributesAssignment_2_2 ) ) )
            // InternalSecurityDsl.g:3131:1: ( ( rule__User__Model_attributesAssignment_2_2 ) )
            {
            // InternalSecurityDsl.g:3131:1: ( ( rule__User__Model_attributesAssignment_2_2 ) )
            // InternalSecurityDsl.g:3132:2: ( rule__User__Model_attributesAssignment_2_2 )
            {
             before(grammarAccess.getUserAccess().getModel_attributesAssignment_2_2()); 
            // InternalSecurityDsl.g:3133:2: ( rule__User__Model_attributesAssignment_2_2 )
            // InternalSecurityDsl.g:3133:3: rule__User__Model_attributesAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__User__Model_attributesAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getModel_attributesAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_2__2__Impl"


    // $ANTLR start "rule__User__Group_2__3"
    // InternalSecurityDsl.g:3141:1: rule__User__Group_2__3 : rule__User__Group_2__3__Impl rule__User__Group_2__4 ;
    public final void rule__User__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3145:1: ( rule__User__Group_2__3__Impl rule__User__Group_2__4 )
            // InternalSecurityDsl.g:3146:2: rule__User__Group_2__3__Impl rule__User__Group_2__4
            {
            pushFollow(FOLLOW_24);
            rule__User__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_2__3"


    // $ANTLR start "rule__User__Group_2__3__Impl"
    // InternalSecurityDsl.g:3153:1: rule__User__Group_2__3__Impl : ( ( rule__User__Group_2_3__0 )* ) ;
    public final void rule__User__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3157:1: ( ( ( rule__User__Group_2_3__0 )* ) )
            // InternalSecurityDsl.g:3158:1: ( ( rule__User__Group_2_3__0 )* )
            {
            // InternalSecurityDsl.g:3158:1: ( ( rule__User__Group_2_3__0 )* )
            // InternalSecurityDsl.g:3159:2: ( rule__User__Group_2_3__0 )*
            {
             before(grammarAccess.getUserAccess().getGroup_2_3()); 
            // InternalSecurityDsl.g:3160:2: ( rule__User__Group_2_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==62) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalSecurityDsl.g:3160:3: rule__User__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__User__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getUserAccess().getGroup_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_2__3__Impl"


    // $ANTLR start "rule__User__Group_2__4"
    // InternalSecurityDsl.g:3168:1: rule__User__Group_2__4 : rule__User__Group_2__4__Impl ;
    public final void rule__User__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3172:1: ( rule__User__Group_2__4__Impl )
            // InternalSecurityDsl.g:3173:2: rule__User__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__User__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_2__4"


    // $ANTLR start "rule__User__Group_2__4__Impl"
    // InternalSecurityDsl.g:3179:1: rule__User__Group_2__4__Impl : ( ']' ) ;
    public final void rule__User__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3183:1: ( ( ']' ) )
            // InternalSecurityDsl.g:3184:1: ( ']' )
            {
            // InternalSecurityDsl.g:3184:1: ( ']' )
            // InternalSecurityDsl.g:3185:2: ']'
            {
             before(grammarAccess.getUserAccess().getRightSquareBracketKeyword_2_4()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getRightSquareBracketKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_2__4__Impl"


    // $ANTLR start "rule__User__Group_2_3__0"
    // InternalSecurityDsl.g:3195:1: rule__User__Group_2_3__0 : rule__User__Group_2_3__0__Impl rule__User__Group_2_3__1 ;
    public final void rule__User__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3199:1: ( rule__User__Group_2_3__0__Impl rule__User__Group_2_3__1 )
            // InternalSecurityDsl.g:3200:2: rule__User__Group_2_3__0__Impl rule__User__Group_2_3__1
            {
            pushFollow(FOLLOW_23);
            rule__User__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_2_3__0"


    // $ANTLR start "rule__User__Group_2_3__0__Impl"
    // InternalSecurityDsl.g:3207:1: rule__User__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__User__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3211:1: ( ( ',' ) )
            // InternalSecurityDsl.g:3212:1: ( ',' )
            {
            // InternalSecurityDsl.g:3212:1: ( ',' )
            // InternalSecurityDsl.g:3213:2: ','
            {
             before(grammarAccess.getUserAccess().getCommaKeyword_2_3_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getCommaKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_2_3__0__Impl"


    // $ANTLR start "rule__User__Group_2_3__1"
    // InternalSecurityDsl.g:3222:1: rule__User__Group_2_3__1 : rule__User__Group_2_3__1__Impl ;
    public final void rule__User__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3226:1: ( rule__User__Group_2_3__1__Impl )
            // InternalSecurityDsl.g:3227:2: rule__User__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__User__Group_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_2_3__1"


    // $ANTLR start "rule__User__Group_2_3__1__Impl"
    // InternalSecurityDsl.g:3233:1: rule__User__Group_2_3__1__Impl : ( ( rule__User__Model_attributesAssignment_2_3_1 ) ) ;
    public final void rule__User__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3237:1: ( ( ( rule__User__Model_attributesAssignment_2_3_1 ) ) )
            // InternalSecurityDsl.g:3238:1: ( ( rule__User__Model_attributesAssignment_2_3_1 ) )
            {
            // InternalSecurityDsl.g:3238:1: ( ( rule__User__Model_attributesAssignment_2_3_1 ) )
            // InternalSecurityDsl.g:3239:2: ( rule__User__Model_attributesAssignment_2_3_1 )
            {
             before(grammarAccess.getUserAccess().getModel_attributesAssignment_2_3_1()); 
            // InternalSecurityDsl.g:3240:2: ( rule__User__Model_attributesAssignment_2_3_1 )
            // InternalSecurityDsl.g:3240:3: rule__User__Model_attributesAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__User__Model_attributesAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getModel_attributesAssignment_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_2_3__1__Impl"


    // $ANTLR start "rule__RoleInstance__Group__0"
    // InternalSecurityDsl.g:3249:1: rule__RoleInstance__Group__0 : rule__RoleInstance__Group__0__Impl rule__RoleInstance__Group__1 ;
    public final void rule__RoleInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3253:1: ( rule__RoleInstance__Group__0__Impl rule__RoleInstance__Group__1 )
            // InternalSecurityDsl.g:3254:2: rule__RoleInstance__Group__0__Impl rule__RoleInstance__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSecurityDsl.g:3261:1: rule__RoleInstance__Group__0__Impl : ( () ) ;
    public final void rule__RoleInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3265:1: ( ( () ) )
            // InternalSecurityDsl.g:3266:1: ( () )
            {
            // InternalSecurityDsl.g:3266:1: ( () )
            // InternalSecurityDsl.g:3267:2: ()
            {
             before(grammarAccess.getRoleInstanceAccess().getRoleInstanceAction_0()); 
            // InternalSecurityDsl.g:3268:2: ()
            // InternalSecurityDsl.g:3268:3: 
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
    // InternalSecurityDsl.g:3276:1: rule__RoleInstance__Group__1 : rule__RoleInstance__Group__1__Impl ;
    public final void rule__RoleInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3280:1: ( rule__RoleInstance__Group__1__Impl )
            // InternalSecurityDsl.g:3281:2: rule__RoleInstance__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoleInstance__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalSecurityDsl.g:3287:1: rule__RoleInstance__Group__1__Impl : ( ( rule__RoleInstance__NameAssignment_1 ) ) ;
    public final void rule__RoleInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3291:1: ( ( ( rule__RoleInstance__NameAssignment_1 ) ) )
            // InternalSecurityDsl.g:3292:1: ( ( rule__RoleInstance__NameAssignment_1 ) )
            {
            // InternalSecurityDsl.g:3292:1: ( ( rule__RoleInstance__NameAssignment_1 ) )
            // InternalSecurityDsl.g:3293:2: ( rule__RoleInstance__NameAssignment_1 )
            {
             before(grammarAccess.getRoleInstanceAccess().getNameAssignment_1()); 
            // InternalSecurityDsl.g:3294:2: ( rule__RoleInstance__NameAssignment_1 )
            // InternalSecurityDsl.g:3294:3: rule__RoleInstance__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RoleInstance__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleInstanceAccess().getNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Endpoint__Group__0"
    // InternalSecurityDsl.g:3303:1: rule__Endpoint__Group__0 : rule__Endpoint__Group__0__Impl rule__Endpoint__Group__1 ;
    public final void rule__Endpoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3307:1: ( rule__Endpoint__Group__0__Impl rule__Endpoint__Group__1 )
            // InternalSecurityDsl.g:3308:2: rule__Endpoint__Group__0__Impl rule__Endpoint__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSecurityDsl.g:3315:1: rule__Endpoint__Group__0__Impl : ( '{' ) ;
    public final void rule__Endpoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3319:1: ( ( '{' ) )
            // InternalSecurityDsl.g:3320:1: ( '{' )
            {
            // InternalSecurityDsl.g:3320:1: ( '{' )
            // InternalSecurityDsl.g:3321:2: '{'
            {
             before(grammarAccess.getEndpointAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3330:1: rule__Endpoint__Group__1 : rule__Endpoint__Group__1__Impl rule__Endpoint__Group__2 ;
    public final void rule__Endpoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3334:1: ( rule__Endpoint__Group__1__Impl rule__Endpoint__Group__2 )
            // InternalSecurityDsl.g:3335:2: rule__Endpoint__Group__1__Impl rule__Endpoint__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSecurityDsl.g:3342:1: rule__Endpoint__Group__1__Impl : ( 'url:' ) ;
    public final void rule__Endpoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3346:1: ( ( 'url:' ) )
            // InternalSecurityDsl.g:3347:1: ( 'url:' )
            {
            // InternalSecurityDsl.g:3347:1: ( 'url:' )
            // InternalSecurityDsl.g:3348:2: 'url:'
            {
             before(grammarAccess.getEndpointAccess().getUrlKeyword_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getUrlKeyword_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3357:1: rule__Endpoint__Group__2 : rule__Endpoint__Group__2__Impl rule__Endpoint__Group__3 ;
    public final void rule__Endpoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3361:1: ( rule__Endpoint__Group__2__Impl rule__Endpoint__Group__3 )
            // InternalSecurityDsl.g:3362:2: rule__Endpoint__Group__2__Impl rule__Endpoint__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalSecurityDsl.g:3369:1: rule__Endpoint__Group__2__Impl : ( ( rule__Endpoint__UrlAssignment_2 ) ) ;
    public final void rule__Endpoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3373:1: ( ( ( rule__Endpoint__UrlAssignment_2 ) ) )
            // InternalSecurityDsl.g:3374:1: ( ( rule__Endpoint__UrlAssignment_2 ) )
            {
            // InternalSecurityDsl.g:3374:1: ( ( rule__Endpoint__UrlAssignment_2 ) )
            // InternalSecurityDsl.g:3375:2: ( rule__Endpoint__UrlAssignment_2 )
            {
             before(grammarAccess.getEndpointAccess().getUrlAssignment_2()); 
            // InternalSecurityDsl.g:3376:2: ( rule__Endpoint__UrlAssignment_2 )
            // InternalSecurityDsl.g:3376:3: rule__Endpoint__UrlAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__UrlAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEndpointAccess().getUrlAssignment_2()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3384:1: rule__Endpoint__Group__3 : rule__Endpoint__Group__3__Impl rule__Endpoint__Group__4 ;
    public final void rule__Endpoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3388:1: ( rule__Endpoint__Group__3__Impl rule__Endpoint__Group__4 )
            // InternalSecurityDsl.g:3389:2: rule__Endpoint__Group__3__Impl rule__Endpoint__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalSecurityDsl.g:3396:1: rule__Endpoint__Group__3__Impl : ( ( rule__Endpoint__Group_3__0 )? ) ;
    public final void rule__Endpoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3400:1: ( ( ( rule__Endpoint__Group_3__0 )? ) )
            // InternalSecurityDsl.g:3401:1: ( ( rule__Endpoint__Group_3__0 )? )
            {
            // InternalSecurityDsl.g:3401:1: ( ( rule__Endpoint__Group_3__0 )? )
            // InternalSecurityDsl.g:3402:2: ( rule__Endpoint__Group_3__0 )?
            {
             before(grammarAccess.getEndpointAccess().getGroup_3()); 
            // InternalSecurityDsl.g:3403:2: ( rule__Endpoint__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==64) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSecurityDsl.g:3403:3: rule__Endpoint__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Endpoint__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEndpointAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3411:1: rule__Endpoint__Group__4 : rule__Endpoint__Group__4__Impl rule__Endpoint__Group__5 ;
    public final void rule__Endpoint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3415:1: ( rule__Endpoint__Group__4__Impl rule__Endpoint__Group__5 )
            // InternalSecurityDsl.g:3416:2: rule__Endpoint__Group__4__Impl rule__Endpoint__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalSecurityDsl.g:3423:1: rule__Endpoint__Group__4__Impl : ( ( rule__Endpoint__Group_4__0 )? ) ;
    public final void rule__Endpoint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3427:1: ( ( ( rule__Endpoint__Group_4__0 )? ) )
            // InternalSecurityDsl.g:3428:1: ( ( rule__Endpoint__Group_4__0 )? )
            {
            // InternalSecurityDsl.g:3428:1: ( ( rule__Endpoint__Group_4__0 )? )
            // InternalSecurityDsl.g:3429:2: ( rule__Endpoint__Group_4__0 )?
            {
             before(grammarAccess.getEndpointAccess().getGroup_4()); 
            // InternalSecurityDsl.g:3430:2: ( rule__Endpoint__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==65) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSecurityDsl.g:3430:3: rule__Endpoint__Group_4__0
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
    // InternalSecurityDsl.g:3438:1: rule__Endpoint__Group__5 : rule__Endpoint__Group__5__Impl rule__Endpoint__Group__6 ;
    public final void rule__Endpoint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3442:1: ( rule__Endpoint__Group__5__Impl rule__Endpoint__Group__6 )
            // InternalSecurityDsl.g:3443:2: rule__Endpoint__Group__5__Impl rule__Endpoint__Group__6
            {
            pushFollow(FOLLOW_26);
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
    // InternalSecurityDsl.g:3450:1: rule__Endpoint__Group__5__Impl : ( ( rule__Endpoint__Group_5__0 )? ) ;
    public final void rule__Endpoint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3454:1: ( ( ( rule__Endpoint__Group_5__0 )? ) )
            // InternalSecurityDsl.g:3455:1: ( ( rule__Endpoint__Group_5__0 )? )
            {
            // InternalSecurityDsl.g:3455:1: ( ( rule__Endpoint__Group_5__0 )? )
            // InternalSecurityDsl.g:3456:2: ( rule__Endpoint__Group_5__0 )?
            {
             before(grammarAccess.getEndpointAccess().getGroup_5()); 
            // InternalSecurityDsl.g:3457:2: ( rule__Endpoint__Group_5__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==55) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSecurityDsl.g:3457:3: rule__Endpoint__Group_5__0
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
    // InternalSecurityDsl.g:3465:1: rule__Endpoint__Group__6 : rule__Endpoint__Group__6__Impl rule__Endpoint__Group__7 ;
    public final void rule__Endpoint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3469:1: ( rule__Endpoint__Group__6__Impl rule__Endpoint__Group__7 )
            // InternalSecurityDsl.g:3470:2: rule__Endpoint__Group__6__Impl rule__Endpoint__Group__7
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
    // InternalSecurityDsl.g:3477:1: rule__Endpoint__Group__6__Impl : ( ( rule__Endpoint__Group_6__0 )? ) ;
    public final void rule__Endpoint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3481:1: ( ( ( rule__Endpoint__Group_6__0 )? ) )
            // InternalSecurityDsl.g:3482:1: ( ( rule__Endpoint__Group_6__0 )? )
            {
            // InternalSecurityDsl.g:3482:1: ( ( rule__Endpoint__Group_6__0 )? )
            // InternalSecurityDsl.g:3483:2: ( rule__Endpoint__Group_6__0 )?
            {
             before(grammarAccess.getEndpointAccess().getGroup_6()); 
            // InternalSecurityDsl.g:3484:2: ( rule__Endpoint__Group_6__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==66) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSecurityDsl.g:3484:3: rule__Endpoint__Group_6__0
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
    // InternalSecurityDsl.g:3492:1: rule__Endpoint__Group__7 : rule__Endpoint__Group__7__Impl ;
    public final void rule__Endpoint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3496:1: ( rule__Endpoint__Group__7__Impl )
            // InternalSecurityDsl.g:3497:2: rule__Endpoint__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // InternalSecurityDsl.g:3503:1: rule__Endpoint__Group__7__Impl : ( '}' ) ;
    public final void rule__Endpoint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3507:1: ( ( '}' ) )
            // InternalSecurityDsl.g:3508:1: ( '}' )
            {
            // InternalSecurityDsl.g:3508:1: ( '}' )
            // InternalSecurityDsl.g:3509:2: '}'
            {
             before(grammarAccess.getEndpointAccess().getRightCurlyBracketKeyword_7()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__Endpoint__Group_3__0"
    // InternalSecurityDsl.g:3519:1: rule__Endpoint__Group_3__0 : rule__Endpoint__Group_3__0__Impl rule__Endpoint__Group_3__1 ;
    public final void rule__Endpoint__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3523:1: ( rule__Endpoint__Group_3__0__Impl rule__Endpoint__Group_3__1 )
            // InternalSecurityDsl.g:3524:2: rule__Endpoint__Group_3__0__Impl rule__Endpoint__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Endpoint__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Endpoint__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group_3__0"


    // $ANTLR start "rule__Endpoint__Group_3__0__Impl"
    // InternalSecurityDsl.g:3531:1: rule__Endpoint__Group_3__0__Impl : ( 'functionName:' ) ;
    public final void rule__Endpoint__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3535:1: ( ( 'functionName:' ) )
            // InternalSecurityDsl.g:3536:1: ( 'functionName:' )
            {
            // InternalSecurityDsl.g:3536:1: ( 'functionName:' )
            // InternalSecurityDsl.g:3537:2: 'functionName:'
            {
             before(grammarAccess.getEndpointAccess().getFunctionNameKeyword_3_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getFunctionNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group_3__0__Impl"


    // $ANTLR start "rule__Endpoint__Group_3__1"
    // InternalSecurityDsl.g:3546:1: rule__Endpoint__Group_3__1 : rule__Endpoint__Group_3__1__Impl ;
    public final void rule__Endpoint__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3550:1: ( rule__Endpoint__Group_3__1__Impl )
            // InternalSecurityDsl.g:3551:2: rule__Endpoint__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group_3__1"


    // $ANTLR start "rule__Endpoint__Group_3__1__Impl"
    // InternalSecurityDsl.g:3557:1: rule__Endpoint__Group_3__1__Impl : ( ( rule__Endpoint__FunctionNameAssignment_3_1 ) ) ;
    public final void rule__Endpoint__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3561:1: ( ( ( rule__Endpoint__FunctionNameAssignment_3_1 ) ) )
            // InternalSecurityDsl.g:3562:1: ( ( rule__Endpoint__FunctionNameAssignment_3_1 ) )
            {
            // InternalSecurityDsl.g:3562:1: ( ( rule__Endpoint__FunctionNameAssignment_3_1 ) )
            // InternalSecurityDsl.g:3563:2: ( rule__Endpoint__FunctionNameAssignment_3_1 )
            {
             before(grammarAccess.getEndpointAccess().getFunctionNameAssignment_3_1()); 
            // InternalSecurityDsl.g:3564:2: ( rule__Endpoint__FunctionNameAssignment_3_1 )
            // InternalSecurityDsl.g:3564:3: rule__Endpoint__FunctionNameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__FunctionNameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEndpointAccess().getFunctionNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group_3__1__Impl"


    // $ANTLR start "rule__Endpoint__Group_4__0"
    // InternalSecurityDsl.g:3573:1: rule__Endpoint__Group_4__0 : rule__Endpoint__Group_4__0__Impl rule__Endpoint__Group_4__1 ;
    public final void rule__Endpoint__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3577:1: ( rule__Endpoint__Group_4__0__Impl rule__Endpoint__Group_4__1 )
            // InternalSecurityDsl.g:3578:2: rule__Endpoint__Group_4__0__Impl rule__Endpoint__Group_4__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalSecurityDsl.g:3585:1: rule__Endpoint__Group_4__0__Impl : ( 'method:' ) ;
    public final void rule__Endpoint__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3589:1: ( ( 'method:' ) )
            // InternalSecurityDsl.g:3590:1: ( 'method:' )
            {
            // InternalSecurityDsl.g:3590:1: ( 'method:' )
            // InternalSecurityDsl.g:3591:2: 'method:'
            {
             before(grammarAccess.getEndpointAccess().getMethodKeyword_4_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getMethodKeyword_4_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3600:1: rule__Endpoint__Group_4__1 : rule__Endpoint__Group_4__1__Impl ;
    public final void rule__Endpoint__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3604:1: ( rule__Endpoint__Group_4__1__Impl )
            // InternalSecurityDsl.g:3605:2: rule__Endpoint__Group_4__1__Impl
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
    // InternalSecurityDsl.g:3611:1: rule__Endpoint__Group_4__1__Impl : ( ( rule__Endpoint__MethodAssignment_4_1 ) ) ;
    public final void rule__Endpoint__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3615:1: ( ( ( rule__Endpoint__MethodAssignment_4_1 ) ) )
            // InternalSecurityDsl.g:3616:1: ( ( rule__Endpoint__MethodAssignment_4_1 ) )
            {
            // InternalSecurityDsl.g:3616:1: ( ( rule__Endpoint__MethodAssignment_4_1 ) )
            // InternalSecurityDsl.g:3617:2: ( rule__Endpoint__MethodAssignment_4_1 )
            {
             before(grammarAccess.getEndpointAccess().getMethodAssignment_4_1()); 
            // InternalSecurityDsl.g:3618:2: ( rule__Endpoint__MethodAssignment_4_1 )
            // InternalSecurityDsl.g:3618:3: rule__Endpoint__MethodAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__MethodAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEndpointAccess().getMethodAssignment_4_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3627:1: rule__Endpoint__Group_5__0 : rule__Endpoint__Group_5__0__Impl rule__Endpoint__Group_5__1 ;
    public final void rule__Endpoint__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3631:1: ( rule__Endpoint__Group_5__0__Impl rule__Endpoint__Group_5__1 )
            // InternalSecurityDsl.g:3632:2: rule__Endpoint__Group_5__0__Impl rule__Endpoint__Group_5__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalSecurityDsl.g:3639:1: rule__Endpoint__Group_5__0__Impl : ( 'type:' ) ;
    public final void rule__Endpoint__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3643:1: ( ( 'type:' ) )
            // InternalSecurityDsl.g:3644:1: ( 'type:' )
            {
            // InternalSecurityDsl.g:3644:1: ( 'type:' )
            // InternalSecurityDsl.g:3645:2: 'type:'
            {
             before(grammarAccess.getEndpointAccess().getTypeKeyword_5_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getTypeKeyword_5_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3654:1: rule__Endpoint__Group_5__1 : rule__Endpoint__Group_5__1__Impl ;
    public final void rule__Endpoint__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3658:1: ( rule__Endpoint__Group_5__1__Impl )
            // InternalSecurityDsl.g:3659:2: rule__Endpoint__Group_5__1__Impl
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
    // InternalSecurityDsl.g:3665:1: rule__Endpoint__Group_5__1__Impl : ( ( rule__Endpoint__TypeAssignment_5_1 ) ) ;
    public final void rule__Endpoint__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3669:1: ( ( ( rule__Endpoint__TypeAssignment_5_1 ) ) )
            // InternalSecurityDsl.g:3670:1: ( ( rule__Endpoint__TypeAssignment_5_1 ) )
            {
            // InternalSecurityDsl.g:3670:1: ( ( rule__Endpoint__TypeAssignment_5_1 ) )
            // InternalSecurityDsl.g:3671:2: ( rule__Endpoint__TypeAssignment_5_1 )
            {
             before(grammarAccess.getEndpointAccess().getTypeAssignment_5_1()); 
            // InternalSecurityDsl.g:3672:2: ( rule__Endpoint__TypeAssignment_5_1 )
            // InternalSecurityDsl.g:3672:3: rule__Endpoint__TypeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__TypeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEndpointAccess().getTypeAssignment_5_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3681:1: rule__Endpoint__Group_6__0 : rule__Endpoint__Group_6__0__Impl rule__Endpoint__Group_6__1 ;
    public final void rule__Endpoint__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3685:1: ( rule__Endpoint__Group_6__0__Impl rule__Endpoint__Group_6__1 )
            // InternalSecurityDsl.g:3686:2: rule__Endpoint__Group_6__0__Impl rule__Endpoint__Group_6__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalSecurityDsl.g:3693:1: rule__Endpoint__Group_6__0__Impl : ( 'roleAuthorities:' ) ;
    public final void rule__Endpoint__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3697:1: ( ( 'roleAuthorities:' ) )
            // InternalSecurityDsl.g:3698:1: ( 'roleAuthorities:' )
            {
            // InternalSecurityDsl.g:3698:1: ( 'roleAuthorities:' )
            // InternalSecurityDsl.g:3699:2: 'roleAuthorities:'
            {
             before(grammarAccess.getEndpointAccess().getRoleAuthoritiesKeyword_6_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getRoleAuthoritiesKeyword_6_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3708:1: rule__Endpoint__Group_6__1 : rule__Endpoint__Group_6__1__Impl rule__Endpoint__Group_6__2 ;
    public final void rule__Endpoint__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3712:1: ( rule__Endpoint__Group_6__1__Impl rule__Endpoint__Group_6__2 )
            // InternalSecurityDsl.g:3713:2: rule__Endpoint__Group_6__1__Impl rule__Endpoint__Group_6__2
            {
            pushFollow(FOLLOW_5);
            rule__Endpoint__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Endpoint__Group_6__2();

            state._fsp--;


            }

        }
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
    // InternalSecurityDsl.g:3720:1: rule__Endpoint__Group_6__1__Impl : ( '[' ) ;
    public final void rule__Endpoint__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3724:1: ( ( '[' ) )
            // InternalSecurityDsl.g:3725:1: ( '[' )
            {
            // InternalSecurityDsl.g:3725:1: ( '[' )
            // InternalSecurityDsl.g:3726:2: '['
            {
             before(grammarAccess.getEndpointAccess().getLeftSquareBracketKeyword_6_1()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getLeftSquareBracketKeyword_6_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Endpoint__Group_6__2"
    // InternalSecurityDsl.g:3735:1: rule__Endpoint__Group_6__2 : rule__Endpoint__Group_6__2__Impl rule__Endpoint__Group_6__3 ;
    public final void rule__Endpoint__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3739:1: ( rule__Endpoint__Group_6__2__Impl rule__Endpoint__Group_6__3 )
            // InternalSecurityDsl.g:3740:2: rule__Endpoint__Group_6__2__Impl rule__Endpoint__Group_6__3
            {
            pushFollow(FOLLOW_24);
            rule__Endpoint__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Endpoint__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group_6__2"


    // $ANTLR start "rule__Endpoint__Group_6__2__Impl"
    // InternalSecurityDsl.g:3747:1: rule__Endpoint__Group_6__2__Impl : ( ( rule__Endpoint__Role_authoritiesAssignment_6_2 ) ) ;
    public final void rule__Endpoint__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3751:1: ( ( ( rule__Endpoint__Role_authoritiesAssignment_6_2 ) ) )
            // InternalSecurityDsl.g:3752:1: ( ( rule__Endpoint__Role_authoritiesAssignment_6_2 ) )
            {
            // InternalSecurityDsl.g:3752:1: ( ( rule__Endpoint__Role_authoritiesAssignment_6_2 ) )
            // InternalSecurityDsl.g:3753:2: ( rule__Endpoint__Role_authoritiesAssignment_6_2 )
            {
             before(grammarAccess.getEndpointAccess().getRole_authoritiesAssignment_6_2()); 
            // InternalSecurityDsl.g:3754:2: ( rule__Endpoint__Role_authoritiesAssignment_6_2 )
            // InternalSecurityDsl.g:3754:3: rule__Endpoint__Role_authoritiesAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__Role_authoritiesAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getEndpointAccess().getRole_authoritiesAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group_6__2__Impl"


    // $ANTLR start "rule__Endpoint__Group_6__3"
    // InternalSecurityDsl.g:3762:1: rule__Endpoint__Group_6__3 : rule__Endpoint__Group_6__3__Impl rule__Endpoint__Group_6__4 ;
    public final void rule__Endpoint__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3766:1: ( rule__Endpoint__Group_6__3__Impl rule__Endpoint__Group_6__4 )
            // InternalSecurityDsl.g:3767:2: rule__Endpoint__Group_6__3__Impl rule__Endpoint__Group_6__4
            {
            pushFollow(FOLLOW_24);
            rule__Endpoint__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Endpoint__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group_6__3"


    // $ANTLR start "rule__Endpoint__Group_6__3__Impl"
    // InternalSecurityDsl.g:3774:1: rule__Endpoint__Group_6__3__Impl : ( ( rule__Endpoint__Group_6_3__0 )* ) ;
    public final void rule__Endpoint__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3778:1: ( ( ( rule__Endpoint__Group_6_3__0 )* ) )
            // InternalSecurityDsl.g:3779:1: ( ( rule__Endpoint__Group_6_3__0 )* )
            {
            // InternalSecurityDsl.g:3779:1: ( ( rule__Endpoint__Group_6_3__0 )* )
            // InternalSecurityDsl.g:3780:2: ( rule__Endpoint__Group_6_3__0 )*
            {
             before(grammarAccess.getEndpointAccess().getGroup_6_3()); 
            // InternalSecurityDsl.g:3781:2: ( rule__Endpoint__Group_6_3__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==62) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalSecurityDsl.g:3781:3: rule__Endpoint__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Endpoint__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getEndpointAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group_6__3__Impl"


    // $ANTLR start "rule__Endpoint__Group_6__4"
    // InternalSecurityDsl.g:3789:1: rule__Endpoint__Group_6__4 : rule__Endpoint__Group_6__4__Impl ;
    public final void rule__Endpoint__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3793:1: ( rule__Endpoint__Group_6__4__Impl )
            // InternalSecurityDsl.g:3794:2: rule__Endpoint__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group_6__4"


    // $ANTLR start "rule__Endpoint__Group_6__4__Impl"
    // InternalSecurityDsl.g:3800:1: rule__Endpoint__Group_6__4__Impl : ( ']' ) ;
    public final void rule__Endpoint__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3804:1: ( ( ']' ) )
            // InternalSecurityDsl.g:3805:1: ( ']' )
            {
            // InternalSecurityDsl.g:3805:1: ( ']' )
            // InternalSecurityDsl.g:3806:2: ']'
            {
             before(grammarAccess.getEndpointAccess().getRightSquareBracketKeyword_6_4()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getRightSquareBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group_6__4__Impl"


    // $ANTLR start "rule__Endpoint__Group_6_3__0"
    // InternalSecurityDsl.g:3816:1: rule__Endpoint__Group_6_3__0 : rule__Endpoint__Group_6_3__0__Impl rule__Endpoint__Group_6_3__1 ;
    public final void rule__Endpoint__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3820:1: ( rule__Endpoint__Group_6_3__0__Impl rule__Endpoint__Group_6_3__1 )
            // InternalSecurityDsl.g:3821:2: rule__Endpoint__Group_6_3__0__Impl rule__Endpoint__Group_6_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Endpoint__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Endpoint__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group_6_3__0"


    // $ANTLR start "rule__Endpoint__Group_6_3__0__Impl"
    // InternalSecurityDsl.g:3828:1: rule__Endpoint__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Endpoint__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3832:1: ( ( ',' ) )
            // InternalSecurityDsl.g:3833:1: ( ',' )
            {
            // InternalSecurityDsl.g:3833:1: ( ',' )
            // InternalSecurityDsl.g:3834:2: ','
            {
             before(grammarAccess.getEndpointAccess().getCommaKeyword_6_3_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group_6_3__0__Impl"


    // $ANTLR start "rule__Endpoint__Group_6_3__1"
    // InternalSecurityDsl.g:3843:1: rule__Endpoint__Group_6_3__1 : rule__Endpoint__Group_6_3__1__Impl ;
    public final void rule__Endpoint__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3847:1: ( rule__Endpoint__Group_6_3__1__Impl )
            // InternalSecurityDsl.g:3848:2: rule__Endpoint__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group_6_3__1"


    // $ANTLR start "rule__Endpoint__Group_6_3__1__Impl"
    // InternalSecurityDsl.g:3854:1: rule__Endpoint__Group_6_3__1__Impl : ( ( rule__Endpoint__Role_authoritiesAssignment_6_3_1 ) ) ;
    public final void rule__Endpoint__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3858:1: ( ( ( rule__Endpoint__Role_authoritiesAssignment_6_3_1 ) ) )
            // InternalSecurityDsl.g:3859:1: ( ( rule__Endpoint__Role_authoritiesAssignment_6_3_1 ) )
            {
            // InternalSecurityDsl.g:3859:1: ( ( rule__Endpoint__Role_authoritiesAssignment_6_3_1 ) )
            // InternalSecurityDsl.g:3860:2: ( rule__Endpoint__Role_authoritiesAssignment_6_3_1 )
            {
             before(grammarAccess.getEndpointAccess().getRole_authoritiesAssignment_6_3_1()); 
            // InternalSecurityDsl.g:3861:2: ( rule__Endpoint__Role_authoritiesAssignment_6_3_1 )
            // InternalSecurityDsl.g:3861:3: rule__Endpoint__Role_authoritiesAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__Role_authoritiesAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEndpointAccess().getRole_authoritiesAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Group_6_3__1__Impl"


    // $ANTLR start "rule__Authentication__Group__0"
    // InternalSecurityDsl.g:3870:1: rule__Authentication__Group__0 : rule__Authentication__Group__0__Impl rule__Authentication__Group__1 ;
    public final void rule__Authentication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3874:1: ( rule__Authentication__Group__0__Impl rule__Authentication__Group__1 )
            // InternalSecurityDsl.g:3875:2: rule__Authentication__Group__0__Impl rule__Authentication__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSecurityDsl.g:3882:1: rule__Authentication__Group__0__Impl : ( () ) ;
    public final void rule__Authentication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3886:1: ( ( () ) )
            // InternalSecurityDsl.g:3887:1: ( () )
            {
            // InternalSecurityDsl.g:3887:1: ( () )
            // InternalSecurityDsl.g:3888:2: ()
            {
             before(grammarAccess.getAuthenticationAccess().getAuthenticationAction_0()); 
            // InternalSecurityDsl.g:3889:2: ()
            // InternalSecurityDsl.g:3889:3: 
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
    // InternalSecurityDsl.g:3897:1: rule__Authentication__Group__1 : rule__Authentication__Group__1__Impl rule__Authentication__Group__2 ;
    public final void rule__Authentication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3901:1: ( rule__Authentication__Group__1__Impl rule__Authentication__Group__2 )
            // InternalSecurityDsl.g:3902:2: rule__Authentication__Group__1__Impl rule__Authentication__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSecurityDsl.g:3909:1: rule__Authentication__Group__1__Impl : ( 'name:' ) ;
    public final void rule__Authentication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3913:1: ( ( 'name:' ) )
            // InternalSecurityDsl.g:3914:1: ( 'name:' )
            {
            // InternalSecurityDsl.g:3914:1: ( 'name:' )
            // InternalSecurityDsl.g:3915:2: 'name:'
            {
             before(grammarAccess.getAuthenticationAccess().getNameKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAuthenticationAccess().getNameKeyword_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3924:1: rule__Authentication__Group__2 : rule__Authentication__Group__2__Impl rule__Authentication__Group__3 ;
    public final void rule__Authentication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3928:1: ( rule__Authentication__Group__2__Impl rule__Authentication__Group__3 )
            // InternalSecurityDsl.g:3929:2: rule__Authentication__Group__2__Impl rule__Authentication__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalSecurityDsl.g:3936:1: rule__Authentication__Group__2__Impl : ( ( rule__Authentication__NameAssignment_2 ) ) ;
    public final void rule__Authentication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3940:1: ( ( ( rule__Authentication__NameAssignment_2 ) ) )
            // InternalSecurityDsl.g:3941:1: ( ( rule__Authentication__NameAssignment_2 ) )
            {
            // InternalSecurityDsl.g:3941:1: ( ( rule__Authentication__NameAssignment_2 ) )
            // InternalSecurityDsl.g:3942:2: ( rule__Authentication__NameAssignment_2 )
            {
             before(grammarAccess.getAuthenticationAccess().getNameAssignment_2()); 
            // InternalSecurityDsl.g:3943:2: ( rule__Authentication__NameAssignment_2 )
            // InternalSecurityDsl.g:3943:3: rule__Authentication__NameAssignment_2
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
    // InternalSecurityDsl.g:3951:1: rule__Authentication__Group__3 : rule__Authentication__Group__3__Impl rule__Authentication__Group__4 ;
    public final void rule__Authentication__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3955:1: ( rule__Authentication__Group__3__Impl rule__Authentication__Group__4 )
            // InternalSecurityDsl.g:3956:2: rule__Authentication__Group__3__Impl rule__Authentication__Group__4
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
    // InternalSecurityDsl.g:3963:1: rule__Authentication__Group__3__Impl : ( 'path:' ) ;
    public final void rule__Authentication__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3967:1: ( ( 'path:' ) )
            // InternalSecurityDsl.g:3968:1: ( 'path:' )
            {
            // InternalSecurityDsl.g:3968:1: ( 'path:' )
            // InternalSecurityDsl.g:3969:2: 'path:'
            {
             before(grammarAccess.getAuthenticationAccess().getPathKeyword_3()); 
            match(input,67,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3978:1: rule__Authentication__Group__4 : rule__Authentication__Group__4__Impl rule__Authentication__Group__5 ;
    public final void rule__Authentication__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3982:1: ( rule__Authentication__Group__4__Impl rule__Authentication__Group__5 )
            // InternalSecurityDsl.g:3983:2: rule__Authentication__Group__4__Impl rule__Authentication__Group__5
            {
            pushFollow(FOLLOW_30);
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
    // InternalSecurityDsl.g:3990:1: rule__Authentication__Group__4__Impl : ( ( rule__Authentication__PathAssignment_4 ) ) ;
    public final void rule__Authentication__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3994:1: ( ( ( rule__Authentication__PathAssignment_4 ) ) )
            // InternalSecurityDsl.g:3995:1: ( ( rule__Authentication__PathAssignment_4 ) )
            {
            // InternalSecurityDsl.g:3995:1: ( ( rule__Authentication__PathAssignment_4 ) )
            // InternalSecurityDsl.g:3996:2: ( rule__Authentication__PathAssignment_4 )
            {
             before(grammarAccess.getAuthenticationAccess().getPathAssignment_4()); 
            // InternalSecurityDsl.g:3997:2: ( rule__Authentication__PathAssignment_4 )
            // InternalSecurityDsl.g:3997:3: rule__Authentication__PathAssignment_4
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
    // InternalSecurityDsl.g:4005:1: rule__Authentication__Group__5 : rule__Authentication__Group__5__Impl ;
    public final void rule__Authentication__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4009:1: ( rule__Authentication__Group__5__Impl )
            // InternalSecurityDsl.g:4010:2: rule__Authentication__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Authentication__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalSecurityDsl.g:4016:1: rule__Authentication__Group__5__Impl : ( ( rule__Authentication__Group_5__0 )? ) ;
    public final void rule__Authentication__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4020:1: ( ( ( rule__Authentication__Group_5__0 )? ) )
            // InternalSecurityDsl.g:4021:1: ( ( rule__Authentication__Group_5__0 )? )
            {
            // InternalSecurityDsl.g:4021:1: ( ( rule__Authentication__Group_5__0 )? )
            // InternalSecurityDsl.g:4022:2: ( rule__Authentication__Group_5__0 )?
            {
             before(grammarAccess.getAuthenticationAccess().getGroup_5()); 
            // InternalSecurityDsl.g:4023:2: ( rule__Authentication__Group_5__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==68) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSecurityDsl.g:4023:3: rule__Authentication__Group_5__0
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


    // $ANTLR start "rule__Authentication__Group_5__0"
    // InternalSecurityDsl.g:4032:1: rule__Authentication__Group_5__0 : rule__Authentication__Group_5__0__Impl rule__Authentication__Group_5__1 ;
    public final void rule__Authentication__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4036:1: ( rule__Authentication__Group_5__0__Impl rule__Authentication__Group_5__1 )
            // InternalSecurityDsl.g:4037:2: rule__Authentication__Group_5__0__Impl rule__Authentication__Group_5__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalSecurityDsl.g:4044:1: rule__Authentication__Group_5__0__Impl : ( 'endpoints:' ) ;
    public final void rule__Authentication__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4048:1: ( ( 'endpoints:' ) )
            // InternalSecurityDsl.g:4049:1: ( 'endpoints:' )
            {
            // InternalSecurityDsl.g:4049:1: ( 'endpoints:' )
            // InternalSecurityDsl.g:4050:2: 'endpoints:'
            {
             before(grammarAccess.getAuthenticationAccess().getEndpointsKeyword_5_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getAuthenticationAccess().getEndpointsKeyword_5_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:4059:1: rule__Authentication__Group_5__1 : rule__Authentication__Group_5__1__Impl rule__Authentication__Group_5__2 ;
    public final void rule__Authentication__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4063:1: ( rule__Authentication__Group_5__1__Impl rule__Authentication__Group_5__2 )
            // InternalSecurityDsl.g:4064:2: rule__Authentication__Group_5__1__Impl rule__Authentication__Group_5__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalSecurityDsl.g:4071:1: rule__Authentication__Group_5__1__Impl : ( '[' ) ;
    public final void rule__Authentication__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4075:1: ( ( '[' ) )
            // InternalSecurityDsl.g:4076:1: ( '[' )
            {
            // InternalSecurityDsl.g:4076:1: ( '[' )
            // InternalSecurityDsl.g:4077:2: '['
            {
             before(grammarAccess.getAuthenticationAccess().getLeftSquareBracketKeyword_5_1()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getAuthenticationAccess().getLeftSquareBracketKeyword_5_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:4086:1: rule__Authentication__Group_5__2 : rule__Authentication__Group_5__2__Impl rule__Authentication__Group_5__3 ;
    public final void rule__Authentication__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4090:1: ( rule__Authentication__Group_5__2__Impl rule__Authentication__Group_5__3 )
            // InternalSecurityDsl.g:4091:2: rule__Authentication__Group_5__2__Impl rule__Authentication__Group_5__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalSecurityDsl.g:4098:1: rule__Authentication__Group_5__2__Impl : ( ( rule__Authentication__Controller_endpointsAssignment_5_2 ) ) ;
    public final void rule__Authentication__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4102:1: ( ( ( rule__Authentication__Controller_endpointsAssignment_5_2 ) ) )
            // InternalSecurityDsl.g:4103:1: ( ( rule__Authentication__Controller_endpointsAssignment_5_2 ) )
            {
            // InternalSecurityDsl.g:4103:1: ( ( rule__Authentication__Controller_endpointsAssignment_5_2 ) )
            // InternalSecurityDsl.g:4104:2: ( rule__Authentication__Controller_endpointsAssignment_5_2 )
            {
             before(grammarAccess.getAuthenticationAccess().getController_endpointsAssignment_5_2()); 
            // InternalSecurityDsl.g:4105:2: ( rule__Authentication__Controller_endpointsAssignment_5_2 )
            // InternalSecurityDsl.g:4105:3: rule__Authentication__Controller_endpointsAssignment_5_2
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
    // InternalSecurityDsl.g:4113:1: rule__Authentication__Group_5__3 : rule__Authentication__Group_5__3__Impl rule__Authentication__Group_5__4 ;
    public final void rule__Authentication__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4117:1: ( rule__Authentication__Group_5__3__Impl rule__Authentication__Group_5__4 )
            // InternalSecurityDsl.g:4118:2: rule__Authentication__Group_5__3__Impl rule__Authentication__Group_5__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalSecurityDsl.g:4125:1: rule__Authentication__Group_5__3__Impl : ( ( rule__Authentication__Group_5_3__0 )* ) ;
    public final void rule__Authentication__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4129:1: ( ( ( rule__Authentication__Group_5_3__0 )* ) )
            // InternalSecurityDsl.g:4130:1: ( ( rule__Authentication__Group_5_3__0 )* )
            {
            // InternalSecurityDsl.g:4130:1: ( ( rule__Authentication__Group_5_3__0 )* )
            // InternalSecurityDsl.g:4131:2: ( rule__Authentication__Group_5_3__0 )*
            {
             before(grammarAccess.getAuthenticationAccess().getGroup_5_3()); 
            // InternalSecurityDsl.g:4132:2: ( rule__Authentication__Group_5_3__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==62) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalSecurityDsl.g:4132:3: rule__Authentication__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Authentication__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalSecurityDsl.g:4140:1: rule__Authentication__Group_5__4 : rule__Authentication__Group_5__4__Impl ;
    public final void rule__Authentication__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4144:1: ( rule__Authentication__Group_5__4__Impl )
            // InternalSecurityDsl.g:4145:2: rule__Authentication__Group_5__4__Impl
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
    // InternalSecurityDsl.g:4151:1: rule__Authentication__Group_5__4__Impl : ( ']' ) ;
    public final void rule__Authentication__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4155:1: ( ( ']' ) )
            // InternalSecurityDsl.g:4156:1: ( ']' )
            {
            // InternalSecurityDsl.g:4156:1: ( ']' )
            // InternalSecurityDsl.g:4157:2: ']'
            {
             before(grammarAccess.getAuthenticationAccess().getRightSquareBracketKeyword_5_4()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getAuthenticationAccess().getRightSquareBracketKeyword_5_4()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:4167:1: rule__Authentication__Group_5_3__0 : rule__Authentication__Group_5_3__0__Impl rule__Authentication__Group_5_3__1 ;
    public final void rule__Authentication__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4171:1: ( rule__Authentication__Group_5_3__0__Impl rule__Authentication__Group_5_3__1 )
            // InternalSecurityDsl.g:4172:2: rule__Authentication__Group_5_3__0__Impl rule__Authentication__Group_5_3__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalSecurityDsl.g:4179:1: rule__Authentication__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Authentication__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4183:1: ( ( ',' ) )
            // InternalSecurityDsl.g:4184:1: ( ',' )
            {
            // InternalSecurityDsl.g:4184:1: ( ',' )
            // InternalSecurityDsl.g:4185:2: ','
            {
             before(grammarAccess.getAuthenticationAccess().getCommaKeyword_5_3_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4194:1: rule__Authentication__Group_5_3__1 : rule__Authentication__Group_5_3__1__Impl ;
    public final void rule__Authentication__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4198:1: ( rule__Authentication__Group_5_3__1__Impl )
            // InternalSecurityDsl.g:4199:2: rule__Authentication__Group_5_3__1__Impl
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
    // InternalSecurityDsl.g:4205:1: rule__Authentication__Group_5_3__1__Impl : ( ( rule__Authentication__Controller_endpointsAssignment_5_3_1 ) ) ;
    public final void rule__Authentication__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4209:1: ( ( ( rule__Authentication__Controller_endpointsAssignment_5_3_1 ) ) )
            // InternalSecurityDsl.g:4210:1: ( ( rule__Authentication__Controller_endpointsAssignment_5_3_1 ) )
            {
            // InternalSecurityDsl.g:4210:1: ( ( rule__Authentication__Controller_endpointsAssignment_5_3_1 ) )
            // InternalSecurityDsl.g:4211:2: ( rule__Authentication__Controller_endpointsAssignment_5_3_1 )
            {
             before(grammarAccess.getAuthenticationAccess().getController_endpointsAssignment_5_3_1()); 
            // InternalSecurityDsl.g:4212:2: ( rule__Authentication__Controller_endpointsAssignment_5_3_1 )
            // InternalSecurityDsl.g:4212:3: rule__Authentication__Controller_endpointsAssignment_5_3_1
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
    // InternalSecurityDsl.g:4221:1: rule__JWT__Group__0 : rule__JWT__Group__0__Impl rule__JWT__Group__1 ;
    public final void rule__JWT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4225:1: ( rule__JWT__Group__0__Impl rule__JWT__Group__1 )
            // InternalSecurityDsl.g:4226:2: rule__JWT__Group__0__Impl rule__JWT__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalSecurityDsl.g:4233:1: rule__JWT__Group__0__Impl : ( 'jwt:' ) ;
    public final void rule__JWT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4237:1: ( ( 'jwt:' ) )
            // InternalSecurityDsl.g:4238:1: ( 'jwt:' )
            {
            // InternalSecurityDsl.g:4238:1: ( 'jwt:' )
            // InternalSecurityDsl.g:4239:2: 'jwt:'
            {
             before(grammarAccess.getJWTAccess().getJwtKeyword_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getJWTAccess().getJwtKeyword_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:4248:1: rule__JWT__Group__1 : rule__JWT__Group__1__Impl rule__JWT__Group__2 ;
    public final void rule__JWT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4252:1: ( rule__JWT__Group__1__Impl rule__JWT__Group__2 )
            // InternalSecurityDsl.g:4253:2: rule__JWT__Group__1__Impl rule__JWT__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalSecurityDsl.g:4260:1: rule__JWT__Group__1__Impl : ( 'header:' ) ;
    public final void rule__JWT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4264:1: ( ( 'header:' ) )
            // InternalSecurityDsl.g:4265:1: ( 'header:' )
            {
            // InternalSecurityDsl.g:4265:1: ( 'header:' )
            // InternalSecurityDsl.g:4266:2: 'header:'
            {
             before(grammarAccess.getJWTAccess().getHeaderKeyword_1()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getJWTAccess().getHeaderKeyword_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:4275:1: rule__JWT__Group__2 : rule__JWT__Group__2__Impl rule__JWT__Group__3 ;
    public final void rule__JWT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4279:1: ( rule__JWT__Group__2__Impl rule__JWT__Group__3 )
            // InternalSecurityDsl.g:4280:2: rule__JWT__Group__2__Impl rule__JWT__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalSecurityDsl.g:4287:1: rule__JWT__Group__2__Impl : ( 'signatureAlgorithm:' ) ;
    public final void rule__JWT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4291:1: ( ( 'signatureAlgorithm:' ) )
            // InternalSecurityDsl.g:4292:1: ( 'signatureAlgorithm:' )
            {
            // InternalSecurityDsl.g:4292:1: ( 'signatureAlgorithm:' )
            // InternalSecurityDsl.g:4293:2: 'signatureAlgorithm:'
            {
             before(grammarAccess.getJWTAccess().getSignatureAlgorithmKeyword_2()); 
            match(input,71,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4302:1: rule__JWT__Group__3 : rule__JWT__Group__3__Impl rule__JWT__Group__4 ;
    public final void rule__JWT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4306:1: ( rule__JWT__Group__3__Impl rule__JWT__Group__4 )
            // InternalSecurityDsl.g:4307:2: rule__JWT__Group__3__Impl rule__JWT__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalSecurityDsl.g:4314:1: rule__JWT__Group__3__Impl : ( ( rule__JWT__SignatureAlgorithmAssignment_3 ) ) ;
    public final void rule__JWT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4318:1: ( ( ( rule__JWT__SignatureAlgorithmAssignment_3 ) ) )
            // InternalSecurityDsl.g:4319:1: ( ( rule__JWT__SignatureAlgorithmAssignment_3 ) )
            {
            // InternalSecurityDsl.g:4319:1: ( ( rule__JWT__SignatureAlgorithmAssignment_3 ) )
            // InternalSecurityDsl.g:4320:2: ( rule__JWT__SignatureAlgorithmAssignment_3 )
            {
             before(grammarAccess.getJWTAccess().getSignatureAlgorithmAssignment_3()); 
            // InternalSecurityDsl.g:4321:2: ( rule__JWT__SignatureAlgorithmAssignment_3 )
            // InternalSecurityDsl.g:4321:3: rule__JWT__SignatureAlgorithmAssignment_3
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
    // InternalSecurityDsl.g:4329:1: rule__JWT__Group__4 : rule__JWT__Group__4__Impl rule__JWT__Group__5 ;
    public final void rule__JWT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4333:1: ( rule__JWT__Group__4__Impl rule__JWT__Group__5 )
            // InternalSecurityDsl.g:4334:2: rule__JWT__Group__4__Impl rule__JWT__Group__5
            {
            pushFollow(FOLLOW_34);
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
    // InternalSecurityDsl.g:4341:1: rule__JWT__Group__4__Impl : ( 'payload:' ) ;
    public final void rule__JWT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4345:1: ( ( 'payload:' ) )
            // InternalSecurityDsl.g:4346:1: ( 'payload:' )
            {
            // InternalSecurityDsl.g:4346:1: ( 'payload:' )
            // InternalSecurityDsl.g:4347:2: 'payload:'
            {
             before(grammarAccess.getJWTAccess().getPayloadKeyword_4()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getJWTAccess().getPayloadKeyword_4()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:4356:1: rule__JWT__Group__5 : rule__JWT__Group__5__Impl rule__JWT__Group__6 ;
    public final void rule__JWT__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4360:1: ( rule__JWT__Group__5__Impl rule__JWT__Group__6 )
            // InternalSecurityDsl.g:4361:2: rule__JWT__Group__5__Impl rule__JWT__Group__6
            {
            pushFollow(FOLLOW_22);
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
    // InternalSecurityDsl.g:4368:1: rule__JWT__Group__5__Impl : ( 'claims:' ) ;
    public final void rule__JWT__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4372:1: ( ( 'claims:' ) )
            // InternalSecurityDsl.g:4373:1: ( 'claims:' )
            {
            // InternalSecurityDsl.g:4373:1: ( 'claims:' )
            // InternalSecurityDsl.g:4374:2: 'claims:'
            {
             before(grammarAccess.getJWTAccess().getClaimsKeyword_5()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getJWTAccess().getClaimsKeyword_5()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:4383:1: rule__JWT__Group__6 : rule__JWT__Group__6__Impl rule__JWT__Group__7 ;
    public final void rule__JWT__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4387:1: ( rule__JWT__Group__6__Impl rule__JWT__Group__7 )
            // InternalSecurityDsl.g:4388:2: rule__JWT__Group__6__Impl rule__JWT__Group__7
            {
            pushFollow(FOLLOW_23);
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
    // InternalSecurityDsl.g:4395:1: rule__JWT__Group__6__Impl : ( '[' ) ;
    public final void rule__JWT__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4399:1: ( ( '[' ) )
            // InternalSecurityDsl.g:4400:1: ( '[' )
            {
            // InternalSecurityDsl.g:4400:1: ( '[' )
            // InternalSecurityDsl.g:4401:2: '['
            {
             before(grammarAccess.getJWTAccess().getLeftSquareBracketKeyword_6()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getJWTAccess().getLeftSquareBracketKeyword_6()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:4410:1: rule__JWT__Group__7 : rule__JWT__Group__7__Impl rule__JWT__Group__8 ;
    public final void rule__JWT__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4414:1: ( rule__JWT__Group__7__Impl rule__JWT__Group__8 )
            // InternalSecurityDsl.g:4415:2: rule__JWT__Group__7__Impl rule__JWT__Group__8
            {
            pushFollow(FOLLOW_24);
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
    // InternalSecurityDsl.g:4422:1: rule__JWT__Group__7__Impl : ( ( rule__JWT__RegisteredclaimsAssignment_7 ) ) ;
    public final void rule__JWT__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4426:1: ( ( ( rule__JWT__RegisteredclaimsAssignment_7 ) ) )
            // InternalSecurityDsl.g:4427:1: ( ( rule__JWT__RegisteredclaimsAssignment_7 ) )
            {
            // InternalSecurityDsl.g:4427:1: ( ( rule__JWT__RegisteredclaimsAssignment_7 ) )
            // InternalSecurityDsl.g:4428:2: ( rule__JWT__RegisteredclaimsAssignment_7 )
            {
             before(grammarAccess.getJWTAccess().getRegisteredclaimsAssignment_7()); 
            // InternalSecurityDsl.g:4429:2: ( rule__JWT__RegisteredclaimsAssignment_7 )
            // InternalSecurityDsl.g:4429:3: rule__JWT__RegisteredclaimsAssignment_7
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
    // InternalSecurityDsl.g:4437:1: rule__JWT__Group__8 : rule__JWT__Group__8__Impl rule__JWT__Group__9 ;
    public final void rule__JWT__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4441:1: ( rule__JWT__Group__8__Impl rule__JWT__Group__9 )
            // InternalSecurityDsl.g:4442:2: rule__JWT__Group__8__Impl rule__JWT__Group__9
            {
            pushFollow(FOLLOW_24);
            rule__JWT__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JWT__Group__9();

            state._fsp--;


            }

        }
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
    // InternalSecurityDsl.g:4449:1: rule__JWT__Group__8__Impl : ( ( rule__JWT__Group_8__0 )* ) ;
    public final void rule__JWT__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4453:1: ( ( ( rule__JWT__Group_8__0 )* ) )
            // InternalSecurityDsl.g:4454:1: ( ( rule__JWT__Group_8__0 )* )
            {
            // InternalSecurityDsl.g:4454:1: ( ( rule__JWT__Group_8__0 )* )
            // InternalSecurityDsl.g:4455:2: ( rule__JWT__Group_8__0 )*
            {
             before(grammarAccess.getJWTAccess().getGroup_8()); 
            // InternalSecurityDsl.g:4456:2: ( rule__JWT__Group_8__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==62) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalSecurityDsl.g:4456:3: rule__JWT__Group_8__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__JWT__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getJWTAccess().getGroup_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__JWT__Group__9"
    // InternalSecurityDsl.g:4464:1: rule__JWT__Group__9 : rule__JWT__Group__9__Impl rule__JWT__Group__10 ;
    public final void rule__JWT__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4468:1: ( rule__JWT__Group__9__Impl rule__JWT__Group__10 )
            // InternalSecurityDsl.g:4469:2: rule__JWT__Group__9__Impl rule__JWT__Group__10
            {
            pushFollow(FOLLOW_35);
            rule__JWT__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JWT__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JWT__Group__9"


    // $ANTLR start "rule__JWT__Group__9__Impl"
    // InternalSecurityDsl.g:4476:1: rule__JWT__Group__9__Impl : ( ']' ) ;
    public final void rule__JWT__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4480:1: ( ( ']' ) )
            // InternalSecurityDsl.g:4481:1: ( ']' )
            {
            // InternalSecurityDsl.g:4481:1: ( ']' )
            // InternalSecurityDsl.g:4482:2: ']'
            {
             before(grammarAccess.getJWTAccess().getRightSquareBracketKeyword_9()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getJWTAccess().getRightSquareBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JWT__Group__9__Impl"


    // $ANTLR start "rule__JWT__Group__10"
    // InternalSecurityDsl.g:4491:1: rule__JWT__Group__10 : rule__JWT__Group__10__Impl ;
    public final void rule__JWT__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4495:1: ( rule__JWT__Group__10__Impl )
            // InternalSecurityDsl.g:4496:2: rule__JWT__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JWT__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JWT__Group__10"


    // $ANTLR start "rule__JWT__Group__10__Impl"
    // InternalSecurityDsl.g:4502:1: rule__JWT__Group__10__Impl : ( ( rule__JWT__Group_10__0 )? ) ;
    public final void rule__JWT__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4506:1: ( ( ( rule__JWT__Group_10__0 )? ) )
            // InternalSecurityDsl.g:4507:1: ( ( rule__JWT__Group_10__0 )? )
            {
            // InternalSecurityDsl.g:4507:1: ( ( rule__JWT__Group_10__0 )? )
            // InternalSecurityDsl.g:4508:2: ( rule__JWT__Group_10__0 )?
            {
             before(grammarAccess.getJWTAccess().getGroup_10()); 
            // InternalSecurityDsl.g:4509:2: ( rule__JWT__Group_10__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==74) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSecurityDsl.g:4509:3: rule__JWT__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JWT__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJWTAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JWT__Group__10__Impl"


    // $ANTLR start "rule__JWT__Group_8__0"
    // InternalSecurityDsl.g:4518:1: rule__JWT__Group_8__0 : rule__JWT__Group_8__0__Impl rule__JWT__Group_8__1 ;
    public final void rule__JWT__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4522:1: ( rule__JWT__Group_8__0__Impl rule__JWT__Group_8__1 )
            // InternalSecurityDsl.g:4523:2: rule__JWT__Group_8__0__Impl rule__JWT__Group_8__1
            {
            pushFollow(FOLLOW_23);
            rule__JWT__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JWT__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JWT__Group_8__0"


    // $ANTLR start "rule__JWT__Group_8__0__Impl"
    // InternalSecurityDsl.g:4530:1: rule__JWT__Group_8__0__Impl : ( ',' ) ;
    public final void rule__JWT__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4534:1: ( ( ',' ) )
            // InternalSecurityDsl.g:4535:1: ( ',' )
            {
            // InternalSecurityDsl.g:4535:1: ( ',' )
            // InternalSecurityDsl.g:4536:2: ','
            {
             before(grammarAccess.getJWTAccess().getCommaKeyword_8_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getJWTAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JWT__Group_8__0__Impl"


    // $ANTLR start "rule__JWT__Group_8__1"
    // InternalSecurityDsl.g:4545:1: rule__JWT__Group_8__1 : rule__JWT__Group_8__1__Impl ;
    public final void rule__JWT__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4549:1: ( rule__JWT__Group_8__1__Impl )
            // InternalSecurityDsl.g:4550:2: rule__JWT__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JWT__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JWT__Group_8__1"


    // $ANTLR start "rule__JWT__Group_8__1__Impl"
    // InternalSecurityDsl.g:4556:1: rule__JWT__Group_8__1__Impl : ( ( rule__JWT__Jwt_claimsAssignment_8_1 ) ) ;
    public final void rule__JWT__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4560:1: ( ( ( rule__JWT__Jwt_claimsAssignment_8_1 ) ) )
            // InternalSecurityDsl.g:4561:1: ( ( rule__JWT__Jwt_claimsAssignment_8_1 ) )
            {
            // InternalSecurityDsl.g:4561:1: ( ( rule__JWT__Jwt_claimsAssignment_8_1 ) )
            // InternalSecurityDsl.g:4562:2: ( rule__JWT__Jwt_claimsAssignment_8_1 )
            {
             before(grammarAccess.getJWTAccess().getJwt_claimsAssignment_8_1()); 
            // InternalSecurityDsl.g:4563:2: ( rule__JWT__Jwt_claimsAssignment_8_1 )
            // InternalSecurityDsl.g:4563:3: rule__JWT__Jwt_claimsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__JWT__Jwt_claimsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getJWTAccess().getJwt_claimsAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JWT__Group_8__1__Impl"


    // $ANTLR start "rule__JWT__Group_10__0"
    // InternalSecurityDsl.g:4572:1: rule__JWT__Group_10__0 : rule__JWT__Group_10__0__Impl rule__JWT__Group_10__1 ;
    public final void rule__JWT__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4576:1: ( rule__JWT__Group_10__0__Impl rule__JWT__Group_10__1 )
            // InternalSecurityDsl.g:4577:2: rule__JWT__Group_10__0__Impl rule__JWT__Group_10__1
            {
            pushFollow(FOLLOW_36);
            rule__JWT__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JWT__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JWT__Group_10__0"


    // $ANTLR start "rule__JWT__Group_10__0__Impl"
    // InternalSecurityDsl.g:4584:1: rule__JWT__Group_10__0__Impl : ( 'signature:' ) ;
    public final void rule__JWT__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4588:1: ( ( 'signature:' ) )
            // InternalSecurityDsl.g:4589:1: ( 'signature:' )
            {
            // InternalSecurityDsl.g:4589:1: ( 'signature:' )
            // InternalSecurityDsl.g:4590:2: 'signature:'
            {
             before(grammarAccess.getJWTAccess().getSignatureKeyword_10_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getJWTAccess().getSignatureKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JWT__Group_10__0__Impl"


    // $ANTLR start "rule__JWT__Group_10__1"
    // InternalSecurityDsl.g:4599:1: rule__JWT__Group_10__1 : rule__JWT__Group_10__1__Impl rule__JWT__Group_10__2 ;
    public final void rule__JWT__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4603:1: ( rule__JWT__Group_10__1__Impl rule__JWT__Group_10__2 )
            // InternalSecurityDsl.g:4604:2: rule__JWT__Group_10__1__Impl rule__JWT__Group_10__2
            {
            pushFollow(FOLLOW_5);
            rule__JWT__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JWT__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JWT__Group_10__1"


    // $ANTLR start "rule__JWT__Group_10__1__Impl"
    // InternalSecurityDsl.g:4611:1: rule__JWT__Group_10__1__Impl : ( 'secret:' ) ;
    public final void rule__JWT__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4615:1: ( ( 'secret:' ) )
            // InternalSecurityDsl.g:4616:1: ( 'secret:' )
            {
            // InternalSecurityDsl.g:4616:1: ( 'secret:' )
            // InternalSecurityDsl.g:4617:2: 'secret:'
            {
             before(grammarAccess.getJWTAccess().getSecretKeyword_10_1()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getJWTAccess().getSecretKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JWT__Group_10__1__Impl"


    // $ANTLR start "rule__JWT__Group_10__2"
    // InternalSecurityDsl.g:4626:1: rule__JWT__Group_10__2 : rule__JWT__Group_10__2__Impl ;
    public final void rule__JWT__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4630:1: ( rule__JWT__Group_10__2__Impl )
            // InternalSecurityDsl.g:4631:2: rule__JWT__Group_10__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JWT__Group_10__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JWT__Group_10__2"


    // $ANTLR start "rule__JWT__Group_10__2__Impl"
    // InternalSecurityDsl.g:4637:1: rule__JWT__Group_10__2__Impl : ( ( rule__JWT__SecretAssignment_10_2 ) ) ;
    public final void rule__JWT__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4641:1: ( ( ( rule__JWT__SecretAssignment_10_2 ) ) )
            // InternalSecurityDsl.g:4642:1: ( ( rule__JWT__SecretAssignment_10_2 ) )
            {
            // InternalSecurityDsl.g:4642:1: ( ( rule__JWT__SecretAssignment_10_2 ) )
            // InternalSecurityDsl.g:4643:2: ( rule__JWT__SecretAssignment_10_2 )
            {
             before(grammarAccess.getJWTAccess().getSecretAssignment_10_2()); 
            // InternalSecurityDsl.g:4644:2: ( rule__JWT__SecretAssignment_10_2 )
            // InternalSecurityDsl.g:4644:3: rule__JWT__SecretAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__JWT__SecretAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getJWTAccess().getSecretAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JWT__Group_10__2__Impl"


    // $ANTLR start "rule__Claim__Group__0"
    // InternalSecurityDsl.g:4653:1: rule__Claim__Group__0 : rule__Claim__Group__0__Impl rule__Claim__Group__1 ;
    public final void rule__Claim__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4657:1: ( rule__Claim__Group__0__Impl rule__Claim__Group__1 )
            // InternalSecurityDsl.g:4658:2: rule__Claim__Group__0__Impl rule__Claim__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalSecurityDsl.g:4665:1: rule__Claim__Group__0__Impl : ( '{' ) ;
    public final void rule__Claim__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4669:1: ( ( '{' ) )
            // InternalSecurityDsl.g:4670:1: ( '{' )
            {
            // InternalSecurityDsl.g:4670:1: ( '{' )
            // InternalSecurityDsl.g:4671:2: '{'
            {
             before(grammarAccess.getClaimAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getClaimAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:4680:1: rule__Claim__Group__1 : rule__Claim__Group__1__Impl rule__Claim__Group__2 ;
    public final void rule__Claim__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4684:1: ( rule__Claim__Group__1__Impl rule__Claim__Group__2 )
            // InternalSecurityDsl.g:4685:2: rule__Claim__Group__1__Impl rule__Claim__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalSecurityDsl.g:4692:1: rule__Claim__Group__1__Impl : ( ( rule__Claim__Group_1__0 )? ) ;
    public final void rule__Claim__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4696:1: ( ( ( rule__Claim__Group_1__0 )? ) )
            // InternalSecurityDsl.g:4697:1: ( ( rule__Claim__Group_1__0 )? )
            {
            // InternalSecurityDsl.g:4697:1: ( ( rule__Claim__Group_1__0 )? )
            // InternalSecurityDsl.g:4698:2: ( rule__Claim__Group_1__0 )?
            {
             before(grammarAccess.getClaimAccess().getGroup_1()); 
            // InternalSecurityDsl.g:4699:2: ( rule__Claim__Group_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=31 && LA41_0<=33)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSecurityDsl.g:4699:3: rule__Claim__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Claim__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClaimAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:4707:1: rule__Claim__Group__2 : rule__Claim__Group__2__Impl rule__Claim__Group__3 ;
    public final void rule__Claim__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4711:1: ( rule__Claim__Group__2__Impl rule__Claim__Group__3 )
            // InternalSecurityDsl.g:4712:2: rule__Claim__Group__2__Impl rule__Claim__Group__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalSecurityDsl.g:4719:1: rule__Claim__Group__2__Impl : ( ( rule__Claim__NameAssignment_2 ) ) ;
    public final void rule__Claim__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4723:1: ( ( ( rule__Claim__NameAssignment_2 ) ) )
            // InternalSecurityDsl.g:4724:1: ( ( rule__Claim__NameAssignment_2 ) )
            {
            // InternalSecurityDsl.g:4724:1: ( ( rule__Claim__NameAssignment_2 ) )
            // InternalSecurityDsl.g:4725:2: ( rule__Claim__NameAssignment_2 )
            {
             before(grammarAccess.getClaimAccess().getNameAssignment_2()); 
            // InternalSecurityDsl.g:4726:2: ( rule__Claim__NameAssignment_2 )
            // InternalSecurityDsl.g:4726:3: rule__Claim__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Claim__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClaimAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:4734:1: rule__Claim__Group__3 : rule__Claim__Group__3__Impl rule__Claim__Group__4 ;
    public final void rule__Claim__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4738:1: ( rule__Claim__Group__3__Impl rule__Claim__Group__4 )
            // InternalSecurityDsl.g:4739:2: rule__Claim__Group__3__Impl rule__Claim__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalSecurityDsl.g:4746:1: rule__Claim__Group__3__Impl : ( ':' ) ;
    public final void rule__Claim__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4750:1: ( ( ':' ) )
            // InternalSecurityDsl.g:4751:1: ( ':' )
            {
            // InternalSecurityDsl.g:4751:1: ( ':' )
            // InternalSecurityDsl.g:4752:2: ':'
            {
             before(grammarAccess.getClaimAccess().getColonKeyword_3()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getClaimAccess().getColonKeyword_3()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:4761:1: rule__Claim__Group__4 : rule__Claim__Group__4__Impl rule__Claim__Group__5 ;
    public final void rule__Claim__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4765:1: ( rule__Claim__Group__4__Impl rule__Claim__Group__5 )
            // InternalSecurityDsl.g:4766:2: rule__Claim__Group__4__Impl rule__Claim__Group__5
            {
            pushFollow(FOLLOW_39);
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
    // InternalSecurityDsl.g:4773:1: rule__Claim__Group__4__Impl : ( ( rule__Claim__Claim_attributeAssignment_4 ) ) ;
    public final void rule__Claim__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4777:1: ( ( ( rule__Claim__Claim_attributeAssignment_4 ) ) )
            // InternalSecurityDsl.g:4778:1: ( ( rule__Claim__Claim_attributeAssignment_4 ) )
            {
            // InternalSecurityDsl.g:4778:1: ( ( rule__Claim__Claim_attributeAssignment_4 ) )
            // InternalSecurityDsl.g:4779:2: ( rule__Claim__Claim_attributeAssignment_4 )
            {
             before(grammarAccess.getClaimAccess().getClaim_attributeAssignment_4()); 
            // InternalSecurityDsl.g:4780:2: ( rule__Claim__Claim_attributeAssignment_4 )
            // InternalSecurityDsl.g:4780:3: rule__Claim__Claim_attributeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Claim__Claim_attributeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getClaimAccess().getClaim_attributeAssignment_4()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:4788:1: rule__Claim__Group__5 : rule__Claim__Group__5__Impl ;
    public final void rule__Claim__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4792:1: ( rule__Claim__Group__5__Impl )
            // InternalSecurityDsl.g:4793:2: rule__Claim__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Claim__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalSecurityDsl.g:4799:1: rule__Claim__Group__5__Impl : ( '}' ) ;
    public final void rule__Claim__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4803:1: ( ( '}' ) )
            // InternalSecurityDsl.g:4804:1: ( '}' )
            {
            // InternalSecurityDsl.g:4804:1: ( '}' )
            // InternalSecurityDsl.g:4805:2: '}'
            {
             before(grammarAccess.getClaimAccess().getRightCurlyBracketKeyword_5()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getClaimAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Claim__Group_1__0"
    // InternalSecurityDsl.g:4815:1: rule__Claim__Group_1__0 : rule__Claim__Group_1__0__Impl rule__Claim__Group_1__1 ;
    public final void rule__Claim__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4819:1: ( rule__Claim__Group_1__0__Impl rule__Claim__Group_1__1 )
            // InternalSecurityDsl.g:4820:2: rule__Claim__Group_1__0__Impl rule__Claim__Group_1__1
            {
            pushFollow(FOLLOW_40);
            rule__Claim__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Claim__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Claim__Group_1__0"


    // $ANTLR start "rule__Claim__Group_1__0__Impl"
    // InternalSecurityDsl.g:4827:1: rule__Claim__Group_1__0__Impl : ( ( rule__Claim__TypeAssignment_1_0 ) ) ;
    public final void rule__Claim__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4831:1: ( ( ( rule__Claim__TypeAssignment_1_0 ) ) )
            // InternalSecurityDsl.g:4832:1: ( ( rule__Claim__TypeAssignment_1_0 ) )
            {
            // InternalSecurityDsl.g:4832:1: ( ( rule__Claim__TypeAssignment_1_0 ) )
            // InternalSecurityDsl.g:4833:2: ( rule__Claim__TypeAssignment_1_0 )
            {
             before(grammarAccess.getClaimAccess().getTypeAssignment_1_0()); 
            // InternalSecurityDsl.g:4834:2: ( rule__Claim__TypeAssignment_1_0 )
            // InternalSecurityDsl.g:4834:3: rule__Claim__TypeAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Claim__TypeAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getClaimAccess().getTypeAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Claim__Group_1__0__Impl"


    // $ANTLR start "rule__Claim__Group_1__1"
    // InternalSecurityDsl.g:4842:1: rule__Claim__Group_1__1 : rule__Claim__Group_1__1__Impl ;
    public final void rule__Claim__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4846:1: ( rule__Claim__Group_1__1__Impl )
            // InternalSecurityDsl.g:4847:2: rule__Claim__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Claim__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Claim__Group_1__1"


    // $ANTLR start "rule__Claim__Group_1__1__Impl"
    // InternalSecurityDsl.g:4853:1: rule__Claim__Group_1__1__Impl : ( ',' ) ;
    public final void rule__Claim__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4857:1: ( ( ',' ) )
            // InternalSecurityDsl.g:4858:1: ( ',' )
            {
            // InternalSecurityDsl.g:4858:1: ( ',' )
            // InternalSecurityDsl.g:4859:2: ','
            {
             before(grammarAccess.getClaimAccess().getCommaKeyword_1_1()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getClaimAccess().getCommaKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Claim__Group_1__1__Impl"


    // $ANTLR start "rule__RegisteredClaims__Group__0"
    // InternalSecurityDsl.g:4869:1: rule__RegisteredClaims__Group__0 : rule__RegisteredClaims__Group__0__Impl rule__RegisteredClaims__Group__1 ;
    public final void rule__RegisteredClaims__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4873:1: ( rule__RegisteredClaims__Group__0__Impl rule__RegisteredClaims__Group__1 )
            // InternalSecurityDsl.g:4874:2: rule__RegisteredClaims__Group__0__Impl rule__RegisteredClaims__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalSecurityDsl.g:4881:1: rule__RegisteredClaims__Group__0__Impl : ( '{' ) ;
    public final void rule__RegisteredClaims__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4885:1: ( ( '{' ) )
            // InternalSecurityDsl.g:4886:1: ( '{' )
            {
            // InternalSecurityDsl.g:4886:1: ( '{' )
            // InternalSecurityDsl.g:4887:2: '{'
            {
             before(grammarAccess.getRegisteredClaimsAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getRegisteredClaimsAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:4896:1: rule__RegisteredClaims__Group__1 : rule__RegisteredClaims__Group__1__Impl rule__RegisteredClaims__Group__2 ;
    public final void rule__RegisteredClaims__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4900:1: ( rule__RegisteredClaims__Group__1__Impl rule__RegisteredClaims__Group__2 )
            // InternalSecurityDsl.g:4901:2: rule__RegisteredClaims__Group__1__Impl rule__RegisteredClaims__Group__2
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
    // InternalSecurityDsl.g:4908:1: rule__RegisteredClaims__Group__1__Impl : ( 'REGISTERED,' ) ;
    public final void rule__RegisteredClaims__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4912:1: ( ( 'REGISTERED,' ) )
            // InternalSecurityDsl.g:4913:1: ( 'REGISTERED,' )
            {
            // InternalSecurityDsl.g:4913:1: ( 'REGISTERED,' )
            // InternalSecurityDsl.g:4914:2: 'REGISTERED,'
            {
             before(grammarAccess.getRegisteredClaimsAccess().getREGISTEREDKeyword_1()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getRegisteredClaimsAccess().getREGISTEREDKeyword_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:4923:1: rule__RegisteredClaims__Group__2 : rule__RegisteredClaims__Group__2__Impl rule__RegisteredClaims__Group__3 ;
    public final void rule__RegisteredClaims__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4927:1: ( rule__RegisteredClaims__Group__2__Impl rule__RegisteredClaims__Group__3 )
            // InternalSecurityDsl.g:4928:2: rule__RegisteredClaims__Group__2__Impl rule__RegisteredClaims__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalSecurityDsl.g:4935:1: rule__RegisteredClaims__Group__2__Impl : ( 'expirationTime:' ) ;
    public final void rule__RegisteredClaims__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4939:1: ( ( 'expirationTime:' ) )
            // InternalSecurityDsl.g:4940:1: ( 'expirationTime:' )
            {
            // InternalSecurityDsl.g:4940:1: ( 'expirationTime:' )
            // InternalSecurityDsl.g:4941:2: 'expirationTime:'
            {
             before(grammarAccess.getRegisteredClaimsAccess().getExpirationTimeKeyword_2()); 
            match(input,78,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4950:1: rule__RegisteredClaims__Group__3 : rule__RegisteredClaims__Group__3__Impl rule__RegisteredClaims__Group__4 ;
    public final void rule__RegisteredClaims__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4954:1: ( rule__RegisteredClaims__Group__3__Impl rule__RegisteredClaims__Group__4 )
            // InternalSecurityDsl.g:4955:2: rule__RegisteredClaims__Group__3__Impl rule__RegisteredClaims__Group__4
            {
            pushFollow(FOLLOW_39);
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
    // InternalSecurityDsl.g:4962:1: rule__RegisteredClaims__Group__3__Impl : ( ( rule__RegisteredClaims__ExpirationTimeAssignment_3 ) ) ;
    public final void rule__RegisteredClaims__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4966:1: ( ( ( rule__RegisteredClaims__ExpirationTimeAssignment_3 ) ) )
            // InternalSecurityDsl.g:4967:1: ( ( rule__RegisteredClaims__ExpirationTimeAssignment_3 ) )
            {
            // InternalSecurityDsl.g:4967:1: ( ( rule__RegisteredClaims__ExpirationTimeAssignment_3 ) )
            // InternalSecurityDsl.g:4968:2: ( rule__RegisteredClaims__ExpirationTimeAssignment_3 )
            {
             before(grammarAccess.getRegisteredClaimsAccess().getExpirationTimeAssignment_3()); 
            // InternalSecurityDsl.g:4969:2: ( rule__RegisteredClaims__ExpirationTimeAssignment_3 )
            // InternalSecurityDsl.g:4969:3: rule__RegisteredClaims__ExpirationTimeAssignment_3
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
    // InternalSecurityDsl.g:4977:1: rule__RegisteredClaims__Group__4 : rule__RegisteredClaims__Group__4__Impl rule__RegisteredClaims__Group__5 ;
    public final void rule__RegisteredClaims__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4981:1: ( rule__RegisteredClaims__Group__4__Impl rule__RegisteredClaims__Group__5 )
            // InternalSecurityDsl.g:4982:2: rule__RegisteredClaims__Group__4__Impl rule__RegisteredClaims__Group__5
            {
            pushFollow(FOLLOW_40);
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
    // InternalSecurityDsl.g:4989:1: rule__RegisteredClaims__Group__4__Impl : ( '}' ) ;
    public final void rule__RegisteredClaims__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4993:1: ( ( '}' ) )
            // InternalSecurityDsl.g:4994:1: ( '}' )
            {
            // InternalSecurityDsl.g:4994:1: ( '}' )
            // InternalSecurityDsl.g:4995:2: '}'
            {
             before(grammarAccess.getRegisteredClaimsAccess().getRightCurlyBracketKeyword_4()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getRegisteredClaimsAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:5004:1: rule__RegisteredClaims__Group__5 : rule__RegisteredClaims__Group__5__Impl rule__RegisteredClaims__Group__6 ;
    public final void rule__RegisteredClaims__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5008:1: ( rule__RegisteredClaims__Group__5__Impl rule__RegisteredClaims__Group__6 )
            // InternalSecurityDsl.g:5009:2: rule__RegisteredClaims__Group__5__Impl rule__RegisteredClaims__Group__6
            {
            pushFollow(FOLLOW_40);
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
    // InternalSecurityDsl.g:5016:1: rule__RegisteredClaims__Group__5__Impl : ( ( rule__RegisteredClaims__Group_5__0 )? ) ;
    public final void rule__RegisteredClaims__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5020:1: ( ( ( rule__RegisteredClaims__Group_5__0 )? ) )
            // InternalSecurityDsl.g:5021:1: ( ( rule__RegisteredClaims__Group_5__0 )? )
            {
            // InternalSecurityDsl.g:5021:1: ( ( rule__RegisteredClaims__Group_5__0 )? )
            // InternalSecurityDsl.g:5022:2: ( rule__RegisteredClaims__Group_5__0 )?
            {
             before(grammarAccess.getRegisteredClaimsAccess().getGroup_5()); 
            // InternalSecurityDsl.g:5023:2: ( rule__RegisteredClaims__Group_5__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==62) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==54) ) {
                    int LA42_3 = input.LA(3);

                    if ( (LA42_3==77) ) {
                        int LA42_4 = input.LA(4);

                        if ( (LA42_4==79) ) {
                            alt42=1;
                        }
                    }
                }
            }
            switch (alt42) {
                case 1 :
                    // InternalSecurityDsl.g:5023:3: rule__RegisteredClaims__Group_5__0
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
    // InternalSecurityDsl.g:5031:1: rule__RegisteredClaims__Group__6 : rule__RegisteredClaims__Group__6__Impl ;
    public final void rule__RegisteredClaims__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5035:1: ( rule__RegisteredClaims__Group__6__Impl )
            // InternalSecurityDsl.g:5036:2: rule__RegisteredClaims__Group__6__Impl
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
    // InternalSecurityDsl.g:5042:1: rule__RegisteredClaims__Group__6__Impl : ( ( rule__RegisteredClaims__Group_6__0 )? ) ;
    public final void rule__RegisteredClaims__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5046:1: ( ( ( rule__RegisteredClaims__Group_6__0 )? ) )
            // InternalSecurityDsl.g:5047:1: ( ( rule__RegisteredClaims__Group_6__0 )? )
            {
            // InternalSecurityDsl.g:5047:1: ( ( rule__RegisteredClaims__Group_6__0 )? )
            // InternalSecurityDsl.g:5048:2: ( rule__RegisteredClaims__Group_6__0 )?
            {
             before(grammarAccess.getRegisteredClaimsAccess().getGroup_6()); 
            // InternalSecurityDsl.g:5049:2: ( rule__RegisteredClaims__Group_6__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==62) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==54) ) {
                    int LA43_3 = input.LA(3);

                    if ( (LA43_3==77) ) {
                        alt43=1;
                    }
                }
            }
            switch (alt43) {
                case 1 :
                    // InternalSecurityDsl.g:5049:3: rule__RegisteredClaims__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegisteredClaims__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegisteredClaimsAccess().getGroup_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__RegisteredClaims__Group_5__0"
    // InternalSecurityDsl.g:5058:1: rule__RegisteredClaims__Group_5__0 : rule__RegisteredClaims__Group_5__0__Impl rule__RegisteredClaims__Group_5__1 ;
    public final void rule__RegisteredClaims__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5062:1: ( rule__RegisteredClaims__Group_5__0__Impl rule__RegisteredClaims__Group_5__1 )
            // InternalSecurityDsl.g:5063:2: rule__RegisteredClaims__Group_5__0__Impl rule__RegisteredClaims__Group_5__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalSecurityDsl.g:5070:1: rule__RegisteredClaims__Group_5__0__Impl : ( ',' ) ;
    public final void rule__RegisteredClaims__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5074:1: ( ( ',' ) )
            // InternalSecurityDsl.g:5075:1: ( ',' )
            {
            // InternalSecurityDsl.g:5075:1: ( ',' )
            // InternalSecurityDsl.g:5076:2: ','
            {
             before(grammarAccess.getRegisteredClaimsAccess().getCommaKeyword_5_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getRegisteredClaimsAccess().getCommaKeyword_5_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:5085:1: rule__RegisteredClaims__Group_5__1 : rule__RegisteredClaims__Group_5__1__Impl rule__RegisteredClaims__Group_5__2 ;
    public final void rule__RegisteredClaims__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5089:1: ( rule__RegisteredClaims__Group_5__1__Impl rule__RegisteredClaims__Group_5__2 )
            // InternalSecurityDsl.g:5090:2: rule__RegisteredClaims__Group_5__1__Impl rule__RegisteredClaims__Group_5__2
            {
            pushFollow(FOLLOW_41);
            rule__RegisteredClaims__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegisteredClaims__Group_5__2();

            state._fsp--;


            }

        }
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
    // InternalSecurityDsl.g:5097:1: rule__RegisteredClaims__Group_5__1__Impl : ( '{' ) ;
    public final void rule__RegisteredClaims__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5101:1: ( ( '{' ) )
            // InternalSecurityDsl.g:5102:1: ( '{' )
            {
            // InternalSecurityDsl.g:5102:1: ( '{' )
            // InternalSecurityDsl.g:5103:2: '{'
            {
             before(grammarAccess.getRegisteredClaimsAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getRegisteredClaimsAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__RegisteredClaims__Group_5__2"
    // InternalSecurityDsl.g:5112:1: rule__RegisteredClaims__Group_5__2 : rule__RegisteredClaims__Group_5__2__Impl rule__RegisteredClaims__Group_5__3 ;
    public final void rule__RegisteredClaims__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5116:1: ( rule__RegisteredClaims__Group_5__2__Impl rule__RegisteredClaims__Group_5__3 )
            // InternalSecurityDsl.g:5117:2: rule__RegisteredClaims__Group_5__2__Impl rule__RegisteredClaims__Group_5__3
            {
            pushFollow(FOLLOW_43);
            rule__RegisteredClaims__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegisteredClaims__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaims__Group_5__2"


    // $ANTLR start "rule__RegisteredClaims__Group_5__2__Impl"
    // InternalSecurityDsl.g:5124:1: rule__RegisteredClaims__Group_5__2__Impl : ( 'REGISTERED,' ) ;
    public final void rule__RegisteredClaims__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5128:1: ( ( 'REGISTERED,' ) )
            // InternalSecurityDsl.g:5129:1: ( 'REGISTERED,' )
            {
            // InternalSecurityDsl.g:5129:1: ( 'REGISTERED,' )
            // InternalSecurityDsl.g:5130:2: 'REGISTERED,'
            {
             before(grammarAccess.getRegisteredClaimsAccess().getREGISTEREDKeyword_5_2()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getRegisteredClaimsAccess().getREGISTEREDKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaims__Group_5__2__Impl"


    // $ANTLR start "rule__RegisteredClaims__Group_5__3"
    // InternalSecurityDsl.g:5139:1: rule__RegisteredClaims__Group_5__3 : rule__RegisteredClaims__Group_5__3__Impl rule__RegisteredClaims__Group_5__4 ;
    public final void rule__RegisteredClaims__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5143:1: ( rule__RegisteredClaims__Group_5__3__Impl rule__RegisteredClaims__Group_5__4 )
            // InternalSecurityDsl.g:5144:2: rule__RegisteredClaims__Group_5__3__Impl rule__RegisteredClaims__Group_5__4
            {
            pushFollow(FOLLOW_5);
            rule__RegisteredClaims__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegisteredClaims__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaims__Group_5__3"


    // $ANTLR start "rule__RegisteredClaims__Group_5__3__Impl"
    // InternalSecurityDsl.g:5151:1: rule__RegisteredClaims__Group_5__3__Impl : ( 'issuer:' ) ;
    public final void rule__RegisteredClaims__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5155:1: ( ( 'issuer:' ) )
            // InternalSecurityDsl.g:5156:1: ( 'issuer:' )
            {
            // InternalSecurityDsl.g:5156:1: ( 'issuer:' )
            // InternalSecurityDsl.g:5157:2: 'issuer:'
            {
             before(grammarAccess.getRegisteredClaimsAccess().getIssuerKeyword_5_3()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getRegisteredClaimsAccess().getIssuerKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaims__Group_5__3__Impl"


    // $ANTLR start "rule__RegisteredClaims__Group_5__4"
    // InternalSecurityDsl.g:5166:1: rule__RegisteredClaims__Group_5__4 : rule__RegisteredClaims__Group_5__4__Impl rule__RegisteredClaims__Group_5__5 ;
    public final void rule__RegisteredClaims__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5170:1: ( rule__RegisteredClaims__Group_5__4__Impl rule__RegisteredClaims__Group_5__5 )
            // InternalSecurityDsl.g:5171:2: rule__RegisteredClaims__Group_5__4__Impl rule__RegisteredClaims__Group_5__5
            {
            pushFollow(FOLLOW_39);
            rule__RegisteredClaims__Group_5__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegisteredClaims__Group_5__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaims__Group_5__4"


    // $ANTLR start "rule__RegisteredClaims__Group_5__4__Impl"
    // InternalSecurityDsl.g:5178:1: rule__RegisteredClaims__Group_5__4__Impl : ( ( rule__RegisteredClaims__IssuerAssignment_5_4 ) ) ;
    public final void rule__RegisteredClaims__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5182:1: ( ( ( rule__RegisteredClaims__IssuerAssignment_5_4 ) ) )
            // InternalSecurityDsl.g:5183:1: ( ( rule__RegisteredClaims__IssuerAssignment_5_4 ) )
            {
            // InternalSecurityDsl.g:5183:1: ( ( rule__RegisteredClaims__IssuerAssignment_5_4 ) )
            // InternalSecurityDsl.g:5184:2: ( rule__RegisteredClaims__IssuerAssignment_5_4 )
            {
             before(grammarAccess.getRegisteredClaimsAccess().getIssuerAssignment_5_4()); 
            // InternalSecurityDsl.g:5185:2: ( rule__RegisteredClaims__IssuerAssignment_5_4 )
            // InternalSecurityDsl.g:5185:3: rule__RegisteredClaims__IssuerAssignment_5_4
            {
            pushFollow(FOLLOW_2);
            rule__RegisteredClaims__IssuerAssignment_5_4();

            state._fsp--;


            }

             after(grammarAccess.getRegisteredClaimsAccess().getIssuerAssignment_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaims__Group_5__4__Impl"


    // $ANTLR start "rule__RegisteredClaims__Group_5__5"
    // InternalSecurityDsl.g:5193:1: rule__RegisteredClaims__Group_5__5 : rule__RegisteredClaims__Group_5__5__Impl ;
    public final void rule__RegisteredClaims__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5197:1: ( rule__RegisteredClaims__Group_5__5__Impl )
            // InternalSecurityDsl.g:5198:2: rule__RegisteredClaims__Group_5__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegisteredClaims__Group_5__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaims__Group_5__5"


    // $ANTLR start "rule__RegisteredClaims__Group_5__5__Impl"
    // InternalSecurityDsl.g:5204:1: rule__RegisteredClaims__Group_5__5__Impl : ( '}' ) ;
    public final void rule__RegisteredClaims__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5208:1: ( ( '}' ) )
            // InternalSecurityDsl.g:5209:1: ( '}' )
            {
            // InternalSecurityDsl.g:5209:1: ( '}' )
            // InternalSecurityDsl.g:5210:2: '}'
            {
             before(grammarAccess.getRegisteredClaimsAccess().getRightCurlyBracketKeyword_5_5()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getRegisteredClaimsAccess().getRightCurlyBracketKeyword_5_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaims__Group_5__5__Impl"


    // $ANTLR start "rule__RegisteredClaims__Group_6__0"
    // InternalSecurityDsl.g:5220:1: rule__RegisteredClaims__Group_6__0 : rule__RegisteredClaims__Group_6__0__Impl rule__RegisteredClaims__Group_6__1 ;
    public final void rule__RegisteredClaims__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5224:1: ( rule__RegisteredClaims__Group_6__0__Impl rule__RegisteredClaims__Group_6__1 )
            // InternalSecurityDsl.g:5225:2: rule__RegisteredClaims__Group_6__0__Impl rule__RegisteredClaims__Group_6__1
            {
            pushFollow(FOLLOW_23);
            rule__RegisteredClaims__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegisteredClaims__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaims__Group_6__0"


    // $ANTLR start "rule__RegisteredClaims__Group_6__0__Impl"
    // InternalSecurityDsl.g:5232:1: rule__RegisteredClaims__Group_6__0__Impl : ( ',' ) ;
    public final void rule__RegisteredClaims__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5236:1: ( ( ',' ) )
            // InternalSecurityDsl.g:5237:1: ( ',' )
            {
            // InternalSecurityDsl.g:5237:1: ( ',' )
            // InternalSecurityDsl.g:5238:2: ','
            {
             before(grammarAccess.getRegisteredClaimsAccess().getCommaKeyword_6_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getRegisteredClaimsAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaims__Group_6__0__Impl"


    // $ANTLR start "rule__RegisteredClaims__Group_6__1"
    // InternalSecurityDsl.g:5247:1: rule__RegisteredClaims__Group_6__1 : rule__RegisteredClaims__Group_6__1__Impl rule__RegisteredClaims__Group_6__2 ;
    public final void rule__RegisteredClaims__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5251:1: ( rule__RegisteredClaims__Group_6__1__Impl rule__RegisteredClaims__Group_6__2 )
            // InternalSecurityDsl.g:5252:2: rule__RegisteredClaims__Group_6__1__Impl rule__RegisteredClaims__Group_6__2
            {
            pushFollow(FOLLOW_41);
            rule__RegisteredClaims__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegisteredClaims__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaims__Group_6__1"


    // $ANTLR start "rule__RegisteredClaims__Group_6__1__Impl"
    // InternalSecurityDsl.g:5259:1: rule__RegisteredClaims__Group_6__1__Impl : ( '{' ) ;
    public final void rule__RegisteredClaims__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5263:1: ( ( '{' ) )
            // InternalSecurityDsl.g:5264:1: ( '{' )
            {
            // InternalSecurityDsl.g:5264:1: ( '{' )
            // InternalSecurityDsl.g:5265:2: '{'
            {
             before(grammarAccess.getRegisteredClaimsAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getRegisteredClaimsAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaims__Group_6__1__Impl"


    // $ANTLR start "rule__RegisteredClaims__Group_6__2"
    // InternalSecurityDsl.g:5274:1: rule__RegisteredClaims__Group_6__2 : rule__RegisteredClaims__Group_6__2__Impl rule__RegisteredClaims__Group_6__3 ;
    public final void rule__RegisteredClaims__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5278:1: ( rule__RegisteredClaims__Group_6__2__Impl rule__RegisteredClaims__Group_6__3 )
            // InternalSecurityDsl.g:5279:2: rule__RegisteredClaims__Group_6__2__Impl rule__RegisteredClaims__Group_6__3
            {
            pushFollow(FOLLOW_44);
            rule__RegisteredClaims__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegisteredClaims__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaims__Group_6__2"


    // $ANTLR start "rule__RegisteredClaims__Group_6__2__Impl"
    // InternalSecurityDsl.g:5286:1: rule__RegisteredClaims__Group_6__2__Impl : ( 'REGISTERED,' ) ;
    public final void rule__RegisteredClaims__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5290:1: ( ( 'REGISTERED,' ) )
            // InternalSecurityDsl.g:5291:1: ( 'REGISTERED,' )
            {
            // InternalSecurityDsl.g:5291:1: ( 'REGISTERED,' )
            // InternalSecurityDsl.g:5292:2: 'REGISTERED,'
            {
             before(grammarAccess.getRegisteredClaimsAccess().getREGISTEREDKeyword_6_2()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getRegisteredClaimsAccess().getREGISTEREDKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaims__Group_6__2__Impl"


    // $ANTLR start "rule__RegisteredClaims__Group_6__3"
    // InternalSecurityDsl.g:5301:1: rule__RegisteredClaims__Group_6__3 : rule__RegisteredClaims__Group_6__3__Impl rule__RegisteredClaims__Group_6__4 ;
    public final void rule__RegisteredClaims__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5305:1: ( rule__RegisteredClaims__Group_6__3__Impl rule__RegisteredClaims__Group_6__4 )
            // InternalSecurityDsl.g:5306:2: rule__RegisteredClaims__Group_6__3__Impl rule__RegisteredClaims__Group_6__4
            {
            pushFollow(FOLLOW_5);
            rule__RegisteredClaims__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegisteredClaims__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaims__Group_6__3"


    // $ANTLR start "rule__RegisteredClaims__Group_6__3__Impl"
    // InternalSecurityDsl.g:5313:1: rule__RegisteredClaims__Group_6__3__Impl : ( 'audience:' ) ;
    public final void rule__RegisteredClaims__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5317:1: ( ( 'audience:' ) )
            // InternalSecurityDsl.g:5318:1: ( 'audience:' )
            {
            // InternalSecurityDsl.g:5318:1: ( 'audience:' )
            // InternalSecurityDsl.g:5319:2: 'audience:'
            {
             before(grammarAccess.getRegisteredClaimsAccess().getAudienceKeyword_6_3()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getRegisteredClaimsAccess().getAudienceKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaims__Group_6__3__Impl"


    // $ANTLR start "rule__RegisteredClaims__Group_6__4"
    // InternalSecurityDsl.g:5328:1: rule__RegisteredClaims__Group_6__4 : rule__RegisteredClaims__Group_6__4__Impl rule__RegisteredClaims__Group_6__5 ;
    public final void rule__RegisteredClaims__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5332:1: ( rule__RegisteredClaims__Group_6__4__Impl rule__RegisteredClaims__Group_6__5 )
            // InternalSecurityDsl.g:5333:2: rule__RegisteredClaims__Group_6__4__Impl rule__RegisteredClaims__Group_6__5
            {
            pushFollow(FOLLOW_39);
            rule__RegisteredClaims__Group_6__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegisteredClaims__Group_6__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaims__Group_6__4"


    // $ANTLR start "rule__RegisteredClaims__Group_6__4__Impl"
    // InternalSecurityDsl.g:5340:1: rule__RegisteredClaims__Group_6__4__Impl : ( ( rule__RegisteredClaims__AudienceAssignment_6_4 ) ) ;
    public final void rule__RegisteredClaims__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5344:1: ( ( ( rule__RegisteredClaims__AudienceAssignment_6_4 ) ) )
            // InternalSecurityDsl.g:5345:1: ( ( rule__RegisteredClaims__AudienceAssignment_6_4 ) )
            {
            // InternalSecurityDsl.g:5345:1: ( ( rule__RegisteredClaims__AudienceAssignment_6_4 ) )
            // InternalSecurityDsl.g:5346:2: ( rule__RegisteredClaims__AudienceAssignment_6_4 )
            {
             before(grammarAccess.getRegisteredClaimsAccess().getAudienceAssignment_6_4()); 
            // InternalSecurityDsl.g:5347:2: ( rule__RegisteredClaims__AudienceAssignment_6_4 )
            // InternalSecurityDsl.g:5347:3: rule__RegisteredClaims__AudienceAssignment_6_4
            {
            pushFollow(FOLLOW_2);
            rule__RegisteredClaims__AudienceAssignment_6_4();

            state._fsp--;


            }

             after(grammarAccess.getRegisteredClaimsAccess().getAudienceAssignment_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaims__Group_6__4__Impl"


    // $ANTLR start "rule__RegisteredClaims__Group_6__5"
    // InternalSecurityDsl.g:5355:1: rule__RegisteredClaims__Group_6__5 : rule__RegisteredClaims__Group_6__5__Impl ;
    public final void rule__RegisteredClaims__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5359:1: ( rule__RegisteredClaims__Group_6__5__Impl )
            // InternalSecurityDsl.g:5360:2: rule__RegisteredClaims__Group_6__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegisteredClaims__Group_6__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaims__Group_6__5"


    // $ANTLR start "rule__RegisteredClaims__Group_6__5__Impl"
    // InternalSecurityDsl.g:5366:1: rule__RegisteredClaims__Group_6__5__Impl : ( '}' ) ;
    public final void rule__RegisteredClaims__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5370:1: ( ( '}' ) )
            // InternalSecurityDsl.g:5371:1: ( '}' )
            {
            // InternalSecurityDsl.g:5371:1: ( '}' )
            // InternalSecurityDsl.g:5372:2: '}'
            {
             before(grammarAccess.getRegisteredClaimsAccess().getRightCurlyBracketKeyword_6_5()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getRegisteredClaimsAccess().getRightCurlyBracketKeyword_6_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaims__Group_6__5__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalSecurityDsl.g:5382:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5386:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalSecurityDsl.g:5387:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSecurityDsl.g:5394:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5398:1: ( ( ( '-' )? ) )
            // InternalSecurityDsl.g:5399:1: ( ( '-' )? )
            {
            // InternalSecurityDsl.g:5399:1: ( ( '-' )? )
            // InternalSecurityDsl.g:5400:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalSecurityDsl.g:5401:2: ( '-' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==53) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalSecurityDsl.g:5401:3: '-'
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
    // InternalSecurityDsl.g:5409:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5413:1: ( rule__EInt__Group__1__Impl )
            // InternalSecurityDsl.g:5414:2: rule__EInt__Group__1__Impl
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
    // InternalSecurityDsl.g:5420:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5424:1: ( ( RULE_INT ) )
            // InternalSecurityDsl.g:5425:1: ( RULE_INT )
            {
            // InternalSecurityDsl.g:5425:1: ( RULE_INT )
            // InternalSecurityDsl.g:5426:2: RULE_INT
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


    // $ANTLR start "rule__Application__ArtifactAssignment_2_1"
    // InternalSecurityDsl.g:5436:1: rule__Application__ArtifactAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Application__ArtifactAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5440:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5441:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5441:2: ( ruleEString )
            // InternalSecurityDsl.g:5442:3: ruleEString
            {
             before(grammarAccess.getApplicationAccess().getArtifactEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getArtifactEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__ArtifactAssignment_2_1"


    // $ANTLR start "rule__Application__NameAssignment_3_1"
    // InternalSecurityDsl.g:5451:1: rule__Application__NameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Application__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5455:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5456:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5456:2: ( ruleEString )
            // InternalSecurityDsl.g:5457:3: ruleEString
            {
             before(grammarAccess.getApplicationAccess().getNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getNameEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__NameAssignment_3_1"


    // $ANTLR start "rule__Application__GroupAssignment_4_1"
    // InternalSecurityDsl.g:5466:1: rule__Application__GroupAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Application__GroupAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5470:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5471:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5471:2: ( ruleEString )
            // InternalSecurityDsl.g:5472:3: ruleEString
            {
             before(grammarAccess.getApplicationAccess().getGroupEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getGroupEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__GroupAssignment_4_1"


    // $ANTLR start "rule__Application__PackageNameAssignment_5_1"
    // InternalSecurityDsl.g:5481:1: rule__Application__PackageNameAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Application__PackageNameAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5485:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5486:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5486:2: ( ruleEString )
            // InternalSecurityDsl.g:5487:3: ruleEString
            {
             before(grammarAccess.getApplicationAccess().getPackageNameEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getPackageNameEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__PackageNameAssignment_5_1"


    // $ANTLR start "rule__Application__DescriptionAssignment_6_1"
    // InternalSecurityDsl.g:5496:1: rule__Application__DescriptionAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Application__DescriptionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5500:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5501:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5501:2: ( ruleEString )
            // InternalSecurityDsl.g:5502:3: ruleEString
            {
             before(grammarAccess.getApplicationAccess().getDescriptionEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getDescriptionEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__DescriptionAssignment_6_1"


    // $ANTLR start "rule__Application__PortAssignment_7_1"
    // InternalSecurityDsl.g:5511:1: rule__Application__PortAssignment_7_1 : ( ruleELongObject ) ;
    public final void rule__Application__PortAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5515:1: ( ( ruleELongObject ) )
            // InternalSecurityDsl.g:5516:2: ( ruleELongObject )
            {
            // InternalSecurityDsl.g:5516:2: ( ruleELongObject )
            // InternalSecurityDsl.g:5517:3: ruleELongObject
            {
             before(grammarAccess.getApplicationAccess().getPortELongObjectParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleELongObject();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getPortELongObjectParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__PortAssignment_7_1"


    // $ANTLR start "rule__Application__HostnameAssignment_8_1"
    // InternalSecurityDsl.g:5526:1: rule__Application__HostnameAssignment_8_1 : ( ruleEString ) ;
    public final void rule__Application__HostnameAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5530:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5531:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5531:2: ( ruleEString )
            // InternalSecurityDsl.g:5532:3: ruleEString
            {
             before(grammarAccess.getApplicationAccess().getHostnameEStringParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getHostnameEStringParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__HostnameAssignment_8_1"


    // $ANTLR start "rule__Application__App_databaseAssignment_9_1"
    // InternalSecurityDsl.g:5541:1: rule__Application__App_databaseAssignment_9_1 : ( ruleDatabase ) ;
    public final void rule__Application__App_databaseAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5545:1: ( ( ruleDatabase ) )
            // InternalSecurityDsl.g:5546:2: ( ruleDatabase )
            {
            // InternalSecurityDsl.g:5546:2: ( ruleDatabase )
            // InternalSecurityDsl.g:5547:3: ruleDatabase
            {
             before(grammarAccess.getApplicationAccess().getApp_databaseDatabaseParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDatabase();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getApp_databaseDatabaseParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__App_databaseAssignment_9_1"


    // $ANTLR start "rule__Application__App_modelsAssignment_10_1_1"
    // InternalSecurityDsl.g:5556:1: rule__Application__App_modelsAssignment_10_1_1 : ( ruleUser ) ;
    public final void rule__Application__App_modelsAssignment_10_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5560:1: ( ( ruleUser ) )
            // InternalSecurityDsl.g:5561:2: ( ruleUser )
            {
            // InternalSecurityDsl.g:5561:2: ( ruleUser )
            // InternalSecurityDsl.g:5562:3: ruleUser
            {
             before(grammarAccess.getApplicationAccess().getApp_modelsUserParserRuleCall_10_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUser();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getApp_modelsUserParserRuleCall_10_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__App_modelsAssignment_10_1_1"


    // $ANTLR start "rule__Application__App_modelsAssignment_10_2_1"
    // InternalSecurityDsl.g:5571:1: rule__Application__App_modelsAssignment_10_2_1 : ( ruleRole ) ;
    public final void rule__Application__App_modelsAssignment_10_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5575:1: ( ( ruleRole ) )
            // InternalSecurityDsl.g:5576:2: ( ruleRole )
            {
            // InternalSecurityDsl.g:5576:2: ( ruleRole )
            // InternalSecurityDsl.g:5577:3: ruleRole
            {
             before(grammarAccess.getApplicationAccess().getApp_modelsRoleParserRuleCall_10_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getApp_modelsRoleParserRuleCall_10_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__App_modelsAssignment_10_2_1"


    // $ANTLR start "rule__Application__App_securityAssignment_11_1"
    // InternalSecurityDsl.g:5586:1: rule__Application__App_securityAssignment_11_1 : ( ruleSecurity ) ;
    public final void rule__Application__App_securityAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5590:1: ( ( ruleSecurity ) )
            // InternalSecurityDsl.g:5591:2: ( ruleSecurity )
            {
            // InternalSecurityDsl.g:5591:2: ( ruleSecurity )
            // InternalSecurityDsl.g:5592:3: ruleSecurity
            {
             before(grammarAccess.getApplicationAccess().getApp_securitySecurityParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSecurity();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getApp_securitySecurityParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__App_securityAssignment_11_1"


    // $ANTLR start "rule__Application__App_controllersAssignment_12_1_1"
    // InternalSecurityDsl.g:5601:1: rule__Application__App_controllersAssignment_12_1_1 : ( ruleAuthentication ) ;
    public final void rule__Application__App_controllersAssignment_12_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5605:1: ( ( ruleAuthentication ) )
            // InternalSecurityDsl.g:5606:2: ( ruleAuthentication )
            {
            // InternalSecurityDsl.g:5606:2: ( ruleAuthentication )
            // InternalSecurityDsl.g:5607:3: ruleAuthentication
            {
             before(grammarAccess.getApplicationAccess().getApp_controllersAuthenticationParserRuleCall_12_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAuthentication();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getApp_controllersAuthenticationParserRuleCall_12_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__App_controllersAssignment_12_1_1"


    // $ANTLR start "rule__Database__VendorNameAssignment_1"
    // InternalSecurityDsl.g:5616:1: rule__Database__VendorNameAssignment_1 : ( ruleEDatabaseType ) ;
    public final void rule__Database__VendorNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5620:1: ( ( ruleEDatabaseType ) )
            // InternalSecurityDsl.g:5621:2: ( ruleEDatabaseType )
            {
            // InternalSecurityDsl.g:5621:2: ( ruleEDatabaseType )
            // InternalSecurityDsl.g:5622:3: ruleEDatabaseType
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
    // InternalSecurityDsl.g:5631:1: rule__Database__UrlAssignment_3 : ( ruleEString ) ;
    public final void rule__Database__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5635:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5636:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5636:2: ( ruleEString )
            // InternalSecurityDsl.g:5637:3: ruleEString
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
    // InternalSecurityDsl.g:5646:1: rule__Database__UsernameAssignment_5 : ( ruleEString ) ;
    public final void rule__Database__UsernameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5650:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5651:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5651:2: ( ruleEString )
            // InternalSecurityDsl.g:5652:3: ruleEString
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
    // InternalSecurityDsl.g:5661:1: rule__Database__PasswordAssignment_7 : ( ruleEString ) ;
    public final void rule__Database__PasswordAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5665:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5666:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5666:2: ( ruleEString )
            // InternalSecurityDsl.g:5667:3: ruleEString
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


    // $ANTLR start "rule__Attribute__IsIdentifierAssignment_1"
    // InternalSecurityDsl.g:5676:1: rule__Attribute__IsIdentifierAssignment_1 : ( ( 'identifier' ) ) ;
    public final void rule__Attribute__IsIdentifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5680:1: ( ( ( 'identifier' ) ) )
            // InternalSecurityDsl.g:5681:2: ( ( 'identifier' ) )
            {
            // InternalSecurityDsl.g:5681:2: ( ( 'identifier' ) )
            // InternalSecurityDsl.g:5682:3: ( 'identifier' )
            {
             before(grammarAccess.getAttributeAccess().getIsIdentifierIdentifierKeyword_1_0()); 
            // InternalSecurityDsl.g:5683:3: ( 'identifier' )
            // InternalSecurityDsl.g:5684:4: 'identifier'
            {
             before(grammarAccess.getAttributeAccess().getIsIdentifierIdentifierKeyword_1_0()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getIsIdentifierIdentifierKeyword_1_0()); 

            }

             after(grammarAccess.getAttributeAccess().getIsIdentifierIdentifierKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__IsIdentifierAssignment_1"


    // $ANTLR start "rule__Attribute__NameAssignment_3"
    // InternalSecurityDsl.g:5695:1: rule__Attribute__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5699:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5700:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5700:2: ( ruleEString )
            // InternalSecurityDsl.g:5701:3: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_3"


    // $ANTLR start "rule__Attribute__TypeAssignment_5"
    // InternalSecurityDsl.g:5710:1: rule__Attribute__TypeAssignment_5 : ( ruleEType ) ;
    public final void rule__Attribute__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5714:1: ( ( ruleEType ) )
            // InternalSecurityDsl.g:5715:2: ( ruleEType )
            {
            // InternalSecurityDsl.g:5715:2: ( ruleEType )
            // InternalSecurityDsl.g:5716:3: ruleEType
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
    // InternalSecurityDsl.g:5725:1: rule__Attribute__CollumnNameAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Attribute__CollumnNameAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5729:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5730:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5730:2: ( ruleEString )
            // InternalSecurityDsl.g:5731:3: ruleEString
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


    // $ANTLR start "rule__Role__TableNameAssignment_1_1"
    // InternalSecurityDsl.g:5740:1: rule__Role__TableNameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__Role__TableNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5744:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5745:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5745:2: ( ruleEString )
            // InternalSecurityDsl.g:5746:3: ruleEString
            {
             before(grammarAccess.getRoleAccess().getTableNameEStringParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getTableNameEStringParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__TableNameAssignment_1_1"


    // $ANTLR start "rule__Role__Model_attributesAssignment_2_2"
    // InternalSecurityDsl.g:5755:1: rule__Role__Model_attributesAssignment_2_2 : ( ruleAttribute ) ;
    public final void rule__Role__Model_attributesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5759:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:5760:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:5760:2: ( ruleAttribute )
            // InternalSecurityDsl.g:5761:3: ruleAttribute
            {
             before(grammarAccess.getRoleAccess().getModel_attributesAttributeParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getModel_attributesAttributeParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Model_attributesAssignment_2_2"


    // $ANTLR start "rule__Role__Model_attributesAssignment_2_3_1"
    // InternalSecurityDsl.g:5770:1: rule__Role__Model_attributesAssignment_2_3_1 : ( ruleAttribute ) ;
    public final void rule__Role__Model_attributesAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5774:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:5775:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:5775:2: ( ruleAttribute )
            // InternalSecurityDsl.g:5776:3: ruleAttribute
            {
             before(grammarAccess.getRoleAccess().getModel_attributesAttributeParserRuleCall_2_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getModel_attributesAttributeParserRuleCall_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Model_attributesAssignment_2_3_1"


    // $ANTLR start "rule__Role__Role_instancesAssignment_3_2"
    // InternalSecurityDsl.g:5785:1: rule__Role__Role_instancesAssignment_3_2 : ( ruleRoleInstance ) ;
    public final void rule__Role__Role_instancesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5789:1: ( ( ruleRoleInstance ) )
            // InternalSecurityDsl.g:5790:2: ( ruleRoleInstance )
            {
            // InternalSecurityDsl.g:5790:2: ( ruleRoleInstance )
            // InternalSecurityDsl.g:5791:3: ruleRoleInstance
            {
             before(grammarAccess.getRoleAccess().getRole_instancesRoleInstanceParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRoleInstance();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getRole_instancesRoleInstanceParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Role_instancesAssignment_3_2"


    // $ANTLR start "rule__Role__Role_instancesAssignment_3_3_1"
    // InternalSecurityDsl.g:5800:1: rule__Role__Role_instancesAssignment_3_3_1 : ( ruleRoleInstance ) ;
    public final void rule__Role__Role_instancesAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5804:1: ( ( ruleRoleInstance ) )
            // InternalSecurityDsl.g:5805:2: ( ruleRoleInstance )
            {
            // InternalSecurityDsl.g:5805:2: ( ruleRoleInstance )
            // InternalSecurityDsl.g:5806:3: ruleRoleInstance
            {
             before(grammarAccess.getRoleAccess().getRole_instancesRoleInstanceParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRoleInstance();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getRole_instancesRoleInstanceParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Role_instancesAssignment_3_3_1"


    // $ANTLR start "rule__User__TableNameAssignment_1_1"
    // InternalSecurityDsl.g:5815:1: rule__User__TableNameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__User__TableNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5819:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5820:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5820:2: ( ruleEString )
            // InternalSecurityDsl.g:5821:3: ruleEString
            {
             before(grammarAccess.getUserAccess().getTableNameEStringParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUserAccess().getTableNameEStringParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__TableNameAssignment_1_1"


    // $ANTLR start "rule__User__Model_attributesAssignment_2_2"
    // InternalSecurityDsl.g:5830:1: rule__User__Model_attributesAssignment_2_2 : ( ruleAttribute ) ;
    public final void rule__User__Model_attributesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5834:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:5835:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:5835:2: ( ruleAttribute )
            // InternalSecurityDsl.g:5836:3: ruleAttribute
            {
             before(grammarAccess.getUserAccess().getModel_attributesAttributeParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getUserAccess().getModel_attributesAttributeParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Model_attributesAssignment_2_2"


    // $ANTLR start "rule__User__Model_attributesAssignment_2_3_1"
    // InternalSecurityDsl.g:5845:1: rule__User__Model_attributesAssignment_2_3_1 : ( ruleAttribute ) ;
    public final void rule__User__Model_attributesAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5849:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:5850:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:5850:2: ( ruleAttribute )
            // InternalSecurityDsl.g:5851:3: ruleAttribute
            {
             before(grammarAccess.getUserAccess().getModel_attributesAttributeParserRuleCall_2_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getUserAccess().getModel_attributesAttributeParserRuleCall_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Model_attributesAssignment_2_3_1"


    // $ANTLR start "rule__RoleInstance__NameAssignment_1"
    // InternalSecurityDsl.g:5860:1: rule__RoleInstance__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__RoleInstance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5864:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5865:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5865:2: ( ruleEString )
            // InternalSecurityDsl.g:5866:3: ruleEString
            {
             before(grammarAccess.getRoleInstanceAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoleInstanceAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleInstance__NameAssignment_1"


    // $ANTLR start "rule__Endpoint__UrlAssignment_2"
    // InternalSecurityDsl.g:5875:1: rule__Endpoint__UrlAssignment_2 : ( ruleEString ) ;
    public final void rule__Endpoint__UrlAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5879:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5880:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5880:2: ( ruleEString )
            // InternalSecurityDsl.g:5881:3: ruleEString
            {
             before(grammarAccess.getEndpointAccess().getUrlEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEndpointAccess().getUrlEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__UrlAssignment_2"


    // $ANTLR start "rule__Endpoint__FunctionNameAssignment_3_1"
    // InternalSecurityDsl.g:5890:1: rule__Endpoint__FunctionNameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Endpoint__FunctionNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5894:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5895:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5895:2: ( ruleEString )
            // InternalSecurityDsl.g:5896:3: ruleEString
            {
             before(grammarAccess.getEndpointAccess().getFunctionNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEndpointAccess().getFunctionNameEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__FunctionNameAssignment_3_1"


    // $ANTLR start "rule__Endpoint__MethodAssignment_4_1"
    // InternalSecurityDsl.g:5905:1: rule__Endpoint__MethodAssignment_4_1 : ( ruleEEndpointMethod ) ;
    public final void rule__Endpoint__MethodAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5909:1: ( ( ruleEEndpointMethod ) )
            // InternalSecurityDsl.g:5910:2: ( ruleEEndpointMethod )
            {
            // InternalSecurityDsl.g:5910:2: ( ruleEEndpointMethod )
            // InternalSecurityDsl.g:5911:3: ruleEEndpointMethod
            {
             before(grammarAccess.getEndpointAccess().getMethodEEndpointMethodEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEEndpointMethod();

            state._fsp--;

             after(grammarAccess.getEndpointAccess().getMethodEEndpointMethodEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__MethodAssignment_4_1"


    // $ANTLR start "rule__Endpoint__TypeAssignment_5_1"
    // InternalSecurityDsl.g:5920:1: rule__Endpoint__TypeAssignment_5_1 : ( ruleEEndpointType ) ;
    public final void rule__Endpoint__TypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5924:1: ( ( ruleEEndpointType ) )
            // InternalSecurityDsl.g:5925:2: ( ruleEEndpointType )
            {
            // InternalSecurityDsl.g:5925:2: ( ruleEEndpointType )
            // InternalSecurityDsl.g:5926:3: ruleEEndpointType
            {
             before(grammarAccess.getEndpointAccess().getTypeEEndpointTypeEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEEndpointType();

            state._fsp--;

             after(grammarAccess.getEndpointAccess().getTypeEEndpointTypeEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__TypeAssignment_5_1"


    // $ANTLR start "rule__Endpoint__Role_authoritiesAssignment_6_2"
    // InternalSecurityDsl.g:5935:1: rule__Endpoint__Role_authoritiesAssignment_6_2 : ( ( ruleEString ) ) ;
    public final void rule__Endpoint__Role_authoritiesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5939:1: ( ( ( ruleEString ) ) )
            // InternalSecurityDsl.g:5940:2: ( ( ruleEString ) )
            {
            // InternalSecurityDsl.g:5940:2: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5941:3: ( ruleEString )
            {
             before(grammarAccess.getEndpointAccess().getRole_authoritiesRoleInstanceCrossReference_6_2_0()); 
            // InternalSecurityDsl.g:5942:3: ( ruleEString )
            // InternalSecurityDsl.g:5943:4: ruleEString
            {
             before(grammarAccess.getEndpointAccess().getRole_authoritiesRoleInstanceEStringParserRuleCall_6_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEndpointAccess().getRole_authoritiesRoleInstanceEStringParserRuleCall_6_2_0_1()); 

            }

             after(grammarAccess.getEndpointAccess().getRole_authoritiesRoleInstanceCrossReference_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Role_authoritiesAssignment_6_2"


    // $ANTLR start "rule__Endpoint__Role_authoritiesAssignment_6_3_1"
    // InternalSecurityDsl.g:5954:1: rule__Endpoint__Role_authoritiesAssignment_6_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Endpoint__Role_authoritiesAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5958:1: ( ( ( ruleEString ) ) )
            // InternalSecurityDsl.g:5959:2: ( ( ruleEString ) )
            {
            // InternalSecurityDsl.g:5959:2: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5960:3: ( ruleEString )
            {
             before(grammarAccess.getEndpointAccess().getRole_authoritiesRoleInstanceCrossReference_6_3_1_0()); 
            // InternalSecurityDsl.g:5961:3: ( ruleEString )
            // InternalSecurityDsl.g:5962:4: ruleEString
            {
             before(grammarAccess.getEndpointAccess().getRole_authoritiesRoleInstanceEStringParserRuleCall_6_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEndpointAccess().getRole_authoritiesRoleInstanceEStringParserRuleCall_6_3_1_0_1()); 

            }

             after(grammarAccess.getEndpointAccess().getRole_authoritiesRoleInstanceCrossReference_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Role_authoritiesAssignment_6_3_1"


    // $ANTLR start "rule__Authentication__NameAssignment_2"
    // InternalSecurityDsl.g:5973:1: rule__Authentication__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Authentication__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5977:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5978:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5978:2: ( ruleEString )
            // InternalSecurityDsl.g:5979:3: ruleEString
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


    // $ANTLR start "rule__Authentication__PathAssignment_4"
    // InternalSecurityDsl.g:5988:1: rule__Authentication__PathAssignment_4 : ( ruleEString ) ;
    public final void rule__Authentication__PathAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5992:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5993:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5993:2: ( ruleEString )
            // InternalSecurityDsl.g:5994:3: ruleEString
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
    // InternalSecurityDsl.g:6003:1: rule__Authentication__Controller_endpointsAssignment_5_2 : ( ruleEndpoint ) ;
    public final void rule__Authentication__Controller_endpointsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6007:1: ( ( ruleEndpoint ) )
            // InternalSecurityDsl.g:6008:2: ( ruleEndpoint )
            {
            // InternalSecurityDsl.g:6008:2: ( ruleEndpoint )
            // InternalSecurityDsl.g:6009:3: ruleEndpoint
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
    // InternalSecurityDsl.g:6018:1: rule__Authentication__Controller_endpointsAssignment_5_3_1 : ( ruleEndpoint ) ;
    public final void rule__Authentication__Controller_endpointsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6022:1: ( ( ruleEndpoint ) )
            // InternalSecurityDsl.g:6023:2: ( ruleEndpoint )
            {
            // InternalSecurityDsl.g:6023:2: ( ruleEndpoint )
            // InternalSecurityDsl.g:6024:3: ruleEndpoint
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
    // InternalSecurityDsl.g:6033:1: rule__JWT__SignatureAlgorithmAssignment_3 : ( ruleEString ) ;
    public final void rule__JWT__SignatureAlgorithmAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6037:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6038:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6038:2: ( ruleEString )
            // InternalSecurityDsl.g:6039:3: ruleEString
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


    // $ANTLR start "rule__JWT__RegisteredclaimsAssignment_7"
    // InternalSecurityDsl.g:6048:1: rule__JWT__RegisteredclaimsAssignment_7 : ( ruleRegisteredClaims ) ;
    public final void rule__JWT__RegisteredclaimsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6052:1: ( ( ruleRegisteredClaims ) )
            // InternalSecurityDsl.g:6053:2: ( ruleRegisteredClaims )
            {
            // InternalSecurityDsl.g:6053:2: ( ruleRegisteredClaims )
            // InternalSecurityDsl.g:6054:3: ruleRegisteredClaims
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


    // $ANTLR start "rule__JWT__Jwt_claimsAssignment_8_1"
    // InternalSecurityDsl.g:6063:1: rule__JWT__Jwt_claimsAssignment_8_1 : ( ruleClaim ) ;
    public final void rule__JWT__Jwt_claimsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6067:1: ( ( ruleClaim ) )
            // InternalSecurityDsl.g:6068:2: ( ruleClaim )
            {
            // InternalSecurityDsl.g:6068:2: ( ruleClaim )
            // InternalSecurityDsl.g:6069:3: ruleClaim
            {
             before(grammarAccess.getJWTAccess().getJwt_claimsClaimParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClaim();

            state._fsp--;

             after(grammarAccess.getJWTAccess().getJwt_claimsClaimParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JWT__Jwt_claimsAssignment_8_1"


    // $ANTLR start "rule__JWT__SecretAssignment_10_2"
    // InternalSecurityDsl.g:6078:1: rule__JWT__SecretAssignment_10_2 : ( ruleEString ) ;
    public final void rule__JWT__SecretAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6082:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6083:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6083:2: ( ruleEString )
            // InternalSecurityDsl.g:6084:3: ruleEString
            {
             before(grammarAccess.getJWTAccess().getSecretEStringParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getJWTAccess().getSecretEStringParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JWT__SecretAssignment_10_2"


    // $ANTLR start "rule__Claim__TypeAssignment_1_0"
    // InternalSecurityDsl.g:6093:1: rule__Claim__TypeAssignment_1_0 : ( ruleEClaimType ) ;
    public final void rule__Claim__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6097:1: ( ( ruleEClaimType ) )
            // InternalSecurityDsl.g:6098:2: ( ruleEClaimType )
            {
            // InternalSecurityDsl.g:6098:2: ( ruleEClaimType )
            // InternalSecurityDsl.g:6099:3: ruleEClaimType
            {
             before(grammarAccess.getClaimAccess().getTypeEClaimTypeEnumRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEClaimType();

            state._fsp--;

             after(grammarAccess.getClaimAccess().getTypeEClaimTypeEnumRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Claim__TypeAssignment_1_0"


    // $ANTLR start "rule__Claim__NameAssignment_2"
    // InternalSecurityDsl.g:6108:1: rule__Claim__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Claim__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6112:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6113:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6113:2: ( ruleEString )
            // InternalSecurityDsl.g:6114:3: ruleEString
            {
             before(grammarAccess.getClaimAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClaimAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Claim__NameAssignment_2"


    // $ANTLR start "rule__Claim__Claim_attributeAssignment_4"
    // InternalSecurityDsl.g:6123:1: rule__Claim__Claim_attributeAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Claim__Claim_attributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6127:1: ( ( ( ruleEString ) ) )
            // InternalSecurityDsl.g:6128:2: ( ( ruleEString ) )
            {
            // InternalSecurityDsl.g:6128:2: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6129:3: ( ruleEString )
            {
             before(grammarAccess.getClaimAccess().getClaim_attributeAttributeCrossReference_4_0()); 
            // InternalSecurityDsl.g:6130:3: ( ruleEString )
            // InternalSecurityDsl.g:6131:4: ruleEString
            {
             before(grammarAccess.getClaimAccess().getClaim_attributeAttributeEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClaimAccess().getClaim_attributeAttributeEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getClaimAccess().getClaim_attributeAttributeCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Claim__Claim_attributeAssignment_4"


    // $ANTLR start "rule__RegisteredClaims__ExpirationTimeAssignment_3"
    // InternalSecurityDsl.g:6142:1: rule__RegisteredClaims__ExpirationTimeAssignment_3 : ( ruleEInt ) ;
    public final void rule__RegisteredClaims__ExpirationTimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6146:1: ( ( ruleEInt ) )
            // InternalSecurityDsl.g:6147:2: ( ruleEInt )
            {
            // InternalSecurityDsl.g:6147:2: ( ruleEInt )
            // InternalSecurityDsl.g:6148:3: ruleEInt
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


    // $ANTLR start "rule__RegisteredClaims__IssuerAssignment_5_4"
    // InternalSecurityDsl.g:6157:1: rule__RegisteredClaims__IssuerAssignment_5_4 : ( ruleEString ) ;
    public final void rule__RegisteredClaims__IssuerAssignment_5_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6161:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6162:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6162:2: ( ruleEString )
            // InternalSecurityDsl.g:6163:3: ruleEString
            {
             before(grammarAccess.getRegisteredClaimsAccess().getIssuerEStringParserRuleCall_5_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRegisteredClaimsAccess().getIssuerEStringParserRuleCall_5_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaims__IssuerAssignment_5_4"


    // $ANTLR start "rule__RegisteredClaims__AudienceAssignment_6_4"
    // InternalSecurityDsl.g:6172:1: rule__RegisteredClaims__AudienceAssignment_6_4 : ( ruleEString ) ;
    public final void rule__RegisteredClaims__AudienceAssignment_6_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6176:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6177:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6177:2: ( ruleEString )
            // InternalSecurityDsl.g:6178:3: ruleEString
            {
             before(grammarAccess.getRegisteredClaimsAccess().getAudienceEStringParserRuleCall_6_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRegisteredClaimsAccess().getAudienceEStringParserRuleCall_6_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaims__AudienceAssignment_6_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000CFF800000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0020000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x8C00000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000007FC000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0180000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000380000030L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});

}