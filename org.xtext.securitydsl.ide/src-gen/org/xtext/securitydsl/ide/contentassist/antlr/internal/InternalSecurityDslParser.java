package org.xtext.securitydsl.ide.contentassist.antlr.internal;

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
import org.xtext.securitydsl.services.SecurityDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSecurityDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PostgreSQL'", "'Oracle'", "'MySQL'", "'String'", "'Float'", "'Long'", "'Integer'", "'char'", "'Double'", "'DateTime'", "'Date'", "'int'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'REGISTRATION'", "'LOGIN'", "'LOGOUT'", "'OTHER'", "'PRIVATE'", "'PUBLIC'", "'REGISTERED'", "'GOOGLE'", "'GITHUB'", "'FACEBOOK'", "'MICROSOFT_AZURE'", "'LINKEDIN'", "'TWITTER'", "'INSTAGRAM'", "'application:'", "'artifact:'", "'name:'", "'group:'", "'packageName:'", "'description:'", "'port:'", "'hostname:'", "'database:'", "'model:'", "'user:'", "'role:'", "'security:'", "'controller:'", "'auth:'", "'vendor:'", "'url:'", "'username:'", "'password:'", "'-'", "'{'", "'type:'", "'}'", "'collumnName:'", "'tableName:'", "'attributes:'", "'['", "']'", "','", "'roles:'", "'functionName:'", "'method:'", "'roleAuthorities:'", "'path:'", "'endpoints:'", "'jwt:'", "'header:'", "'signatureAlgorithm:'", "'payload:'", "'claims:'", "'signature:'", "'secret:'", "':'", "'REGISTERED,'", "'expirationTime:'", "'issuer:'", "'audience:'", "'OAuth2.0:'", "'providers:'", "'clientId:'", "'clientSecret:'", "'redirectUri:'", "'basicAuthentication'", "'identifier'", "'credential'", "'client'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

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
    // InternalSecurityDsl.g:87:1: ruleSecurity : ( ( rule__Security__Alternatives ) ) ;
    public final void ruleSecurity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:91:2: ( ( ( rule__Security__Alternatives ) ) )
            // InternalSecurityDsl.g:92:2: ( ( rule__Security__Alternatives ) )
            {
            // InternalSecurityDsl.g:92:2: ( ( rule__Security__Alternatives ) )
            // InternalSecurityDsl.g:93:3: ( rule__Security__Alternatives )
            {
             before(grammarAccess.getSecurityAccess().getAlternatives()); 
            // InternalSecurityDsl.g:94:3: ( rule__Security__Alternatives )
            // InternalSecurityDsl.g:94:4: rule__Security__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Security__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSecurityAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleOAuth2"
    // InternalSecurityDsl.g:403:1: entryRuleOAuth2 : ruleOAuth2 EOF ;
    public final void entryRuleOAuth2() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:404:1: ( ruleOAuth2 EOF )
            // InternalSecurityDsl.g:405:1: ruleOAuth2 EOF
            {
             before(grammarAccess.getOAuth2Rule()); 
            pushFollow(FOLLOW_1);
            ruleOAuth2();

            state._fsp--;

             after(grammarAccess.getOAuth2Rule()); 
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
    // $ANTLR end "entryRuleOAuth2"


    // $ANTLR start "ruleOAuth2"
    // InternalSecurityDsl.g:412:1: ruleOAuth2 : ( ( rule__OAuth2__Group__0 ) ) ;
    public final void ruleOAuth2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:416:2: ( ( ( rule__OAuth2__Group__0 ) ) )
            // InternalSecurityDsl.g:417:2: ( ( rule__OAuth2__Group__0 ) )
            {
            // InternalSecurityDsl.g:417:2: ( ( rule__OAuth2__Group__0 ) )
            // InternalSecurityDsl.g:418:3: ( rule__OAuth2__Group__0 )
            {
             before(grammarAccess.getOAuth2Access().getGroup()); 
            // InternalSecurityDsl.g:419:3: ( rule__OAuth2__Group__0 )
            // InternalSecurityDsl.g:419:4: rule__OAuth2__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OAuth2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOAuth2Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOAuth2"


    // $ANTLR start "entryRuleProvider"
    // InternalSecurityDsl.g:428:1: entryRuleProvider : ruleProvider EOF ;
    public final void entryRuleProvider() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:429:1: ( ruleProvider EOF )
            // InternalSecurityDsl.g:430:1: ruleProvider EOF
            {
             before(grammarAccess.getProviderRule()); 
            pushFollow(FOLLOW_1);
            ruleProvider();

            state._fsp--;

             after(grammarAccess.getProviderRule()); 
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
    // $ANTLR end "entryRuleProvider"


    // $ANTLR start "ruleProvider"
    // InternalSecurityDsl.g:437:1: ruleProvider : ( ( rule__Provider__Group__0 ) ) ;
    public final void ruleProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:441:2: ( ( ( rule__Provider__Group__0 ) ) )
            // InternalSecurityDsl.g:442:2: ( ( rule__Provider__Group__0 ) )
            {
            // InternalSecurityDsl.g:442:2: ( ( rule__Provider__Group__0 ) )
            // InternalSecurityDsl.g:443:3: ( rule__Provider__Group__0 )
            {
             before(grammarAccess.getProviderAccess().getGroup()); 
            // InternalSecurityDsl.g:444:3: ( rule__Provider__Group__0 )
            // InternalSecurityDsl.g:444:4: rule__Provider__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Provider__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProviderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProvider"


    // $ANTLR start "entryRuleBasicAuthentication"
    // InternalSecurityDsl.g:453:1: entryRuleBasicAuthentication : ruleBasicAuthentication EOF ;
    public final void entryRuleBasicAuthentication() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:454:1: ( ruleBasicAuthentication EOF )
            // InternalSecurityDsl.g:455:1: ruleBasicAuthentication EOF
            {
             before(grammarAccess.getBasicAuthenticationRule()); 
            pushFollow(FOLLOW_1);
            ruleBasicAuthentication();

            state._fsp--;

             after(grammarAccess.getBasicAuthenticationRule()); 
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
    // $ANTLR end "entryRuleBasicAuthentication"


    // $ANTLR start "ruleBasicAuthentication"
    // InternalSecurityDsl.g:462:1: ruleBasicAuthentication : ( ( rule__BasicAuthentication__Group__0 ) ) ;
    public final void ruleBasicAuthentication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:466:2: ( ( ( rule__BasicAuthentication__Group__0 ) ) )
            // InternalSecurityDsl.g:467:2: ( ( rule__BasicAuthentication__Group__0 ) )
            {
            // InternalSecurityDsl.g:467:2: ( ( rule__BasicAuthentication__Group__0 ) )
            // InternalSecurityDsl.g:468:3: ( rule__BasicAuthentication__Group__0 )
            {
             before(grammarAccess.getBasicAuthenticationAccess().getGroup()); 
            // InternalSecurityDsl.g:469:3: ( rule__BasicAuthentication__Group__0 )
            // InternalSecurityDsl.g:469:4: rule__BasicAuthentication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BasicAuthentication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBasicAuthenticationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicAuthentication"


    // $ANTLR start "entryRuleEInt"
    // InternalSecurityDsl.g:478:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:479:1: ( ruleEInt EOF )
            // InternalSecurityDsl.g:480:1: ruleEInt EOF
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
    // InternalSecurityDsl.g:487:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:491:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalSecurityDsl.g:492:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalSecurityDsl.g:492:2: ( ( rule__EInt__Group__0 ) )
            // InternalSecurityDsl.g:493:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalSecurityDsl.g:494:3: ( rule__EInt__Group__0 )
            // InternalSecurityDsl.g:494:4: rule__EInt__Group__0
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
    // InternalSecurityDsl.g:503:1: ruleEDatabaseType : ( ( rule__EDatabaseType__Alternatives ) ) ;
    public final void ruleEDatabaseType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:507:1: ( ( ( rule__EDatabaseType__Alternatives ) ) )
            // InternalSecurityDsl.g:508:2: ( ( rule__EDatabaseType__Alternatives ) )
            {
            // InternalSecurityDsl.g:508:2: ( ( rule__EDatabaseType__Alternatives ) )
            // InternalSecurityDsl.g:509:3: ( rule__EDatabaseType__Alternatives )
            {
             before(grammarAccess.getEDatabaseTypeAccess().getAlternatives()); 
            // InternalSecurityDsl.g:510:3: ( rule__EDatabaseType__Alternatives )
            // InternalSecurityDsl.g:510:4: rule__EDatabaseType__Alternatives
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
    // InternalSecurityDsl.g:519:1: ruleEType : ( ( rule__EType__Alternatives ) ) ;
    public final void ruleEType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:523:1: ( ( ( rule__EType__Alternatives ) ) )
            // InternalSecurityDsl.g:524:2: ( ( rule__EType__Alternatives ) )
            {
            // InternalSecurityDsl.g:524:2: ( ( rule__EType__Alternatives ) )
            // InternalSecurityDsl.g:525:3: ( rule__EType__Alternatives )
            {
             before(grammarAccess.getETypeAccess().getAlternatives()); 
            // InternalSecurityDsl.g:526:3: ( rule__EType__Alternatives )
            // InternalSecurityDsl.g:526:4: rule__EType__Alternatives
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
    // InternalSecurityDsl.g:535:1: ruleEEndpointMethod : ( ( rule__EEndpointMethod__Alternatives ) ) ;
    public final void ruleEEndpointMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:539:1: ( ( ( rule__EEndpointMethod__Alternatives ) ) )
            // InternalSecurityDsl.g:540:2: ( ( rule__EEndpointMethod__Alternatives ) )
            {
            // InternalSecurityDsl.g:540:2: ( ( rule__EEndpointMethod__Alternatives ) )
            // InternalSecurityDsl.g:541:3: ( rule__EEndpointMethod__Alternatives )
            {
             before(grammarAccess.getEEndpointMethodAccess().getAlternatives()); 
            // InternalSecurityDsl.g:542:3: ( rule__EEndpointMethod__Alternatives )
            // InternalSecurityDsl.g:542:4: rule__EEndpointMethod__Alternatives
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
    // InternalSecurityDsl.g:551:1: ruleEEndpointType : ( ( rule__EEndpointType__Alternatives ) ) ;
    public final void ruleEEndpointType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:555:1: ( ( ( rule__EEndpointType__Alternatives ) ) )
            // InternalSecurityDsl.g:556:2: ( ( rule__EEndpointType__Alternatives ) )
            {
            // InternalSecurityDsl.g:556:2: ( ( rule__EEndpointType__Alternatives ) )
            // InternalSecurityDsl.g:557:3: ( rule__EEndpointType__Alternatives )
            {
             before(grammarAccess.getEEndpointTypeAccess().getAlternatives()); 
            // InternalSecurityDsl.g:558:3: ( rule__EEndpointType__Alternatives )
            // InternalSecurityDsl.g:558:4: rule__EEndpointType__Alternatives
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
    // InternalSecurityDsl.g:567:1: ruleEClaimType : ( ( rule__EClaimType__Alternatives ) ) ;
    public final void ruleEClaimType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:571:1: ( ( ( rule__EClaimType__Alternatives ) ) )
            // InternalSecurityDsl.g:572:2: ( ( rule__EClaimType__Alternatives ) )
            {
            // InternalSecurityDsl.g:572:2: ( ( rule__EClaimType__Alternatives ) )
            // InternalSecurityDsl.g:573:3: ( rule__EClaimType__Alternatives )
            {
             before(grammarAccess.getEClaimTypeAccess().getAlternatives()); 
            // InternalSecurityDsl.g:574:3: ( rule__EClaimType__Alternatives )
            // InternalSecurityDsl.g:574:4: rule__EClaimType__Alternatives
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


    // $ANTLR start "ruleEOAuthProvider"
    // InternalSecurityDsl.g:583:1: ruleEOAuthProvider : ( ( rule__EOAuthProvider__Alternatives ) ) ;
    public final void ruleEOAuthProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:587:1: ( ( ( rule__EOAuthProvider__Alternatives ) ) )
            // InternalSecurityDsl.g:588:2: ( ( rule__EOAuthProvider__Alternatives ) )
            {
            // InternalSecurityDsl.g:588:2: ( ( rule__EOAuthProvider__Alternatives ) )
            // InternalSecurityDsl.g:589:3: ( rule__EOAuthProvider__Alternatives )
            {
             before(grammarAccess.getEOAuthProviderAccess().getAlternatives()); 
            // InternalSecurityDsl.g:590:3: ( rule__EOAuthProvider__Alternatives )
            // InternalSecurityDsl.g:590:4: rule__EOAuthProvider__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EOAuthProvider__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEOAuthProviderAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEOAuthProvider"


    // $ANTLR start "rule__Security__Alternatives"
    // InternalSecurityDsl.g:598:1: rule__Security__Alternatives : ( ( ruleJWT ) | ( ruleOAuth2 ) | ( ruleBasicAuthentication ) );
    public final void rule__Security__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:602:1: ( ( ruleJWT ) | ( ruleOAuth2 ) | ( ruleBasicAuthentication ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt1=1;
                }
                break;
            case 88:
                {
                alt1=2;
                }
                break;
            case 93:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSecurityDsl.g:603:2: ( ruleJWT )
                    {
                    // InternalSecurityDsl.g:603:2: ( ruleJWT )
                    // InternalSecurityDsl.g:604:3: ruleJWT
                    {
                     before(grammarAccess.getSecurityAccess().getJWTParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleJWT();

                    state._fsp--;

                     after(grammarAccess.getSecurityAccess().getJWTParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:609:2: ( ruleOAuth2 )
                    {
                    // InternalSecurityDsl.g:609:2: ( ruleOAuth2 )
                    // InternalSecurityDsl.g:610:3: ruleOAuth2
                    {
                     before(grammarAccess.getSecurityAccess().getOAuth2ParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOAuth2();

                    state._fsp--;

                     after(grammarAccess.getSecurityAccess().getOAuth2ParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:615:2: ( ruleBasicAuthentication )
                    {
                    // InternalSecurityDsl.g:615:2: ( ruleBasicAuthentication )
                    // InternalSecurityDsl.g:616:3: ruleBasicAuthentication
                    {
                     before(grammarAccess.getSecurityAccess().getBasicAuthenticationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBasicAuthentication();

                    state._fsp--;

                     after(grammarAccess.getSecurityAccess().getBasicAuthenticationParserRuleCall_2()); 

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
    // $ANTLR end "rule__Security__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalSecurityDsl.g:625:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:629:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalSecurityDsl.g:630:2: ( RULE_STRING )
                    {
                    // InternalSecurityDsl.g:630:2: ( RULE_STRING )
                    // InternalSecurityDsl.g:631:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:636:2: ( RULE_ID )
                    {
                    // InternalSecurityDsl.g:636:2: ( RULE_ID )
                    // InternalSecurityDsl.g:637:3: RULE_ID
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
    // InternalSecurityDsl.g:646:1: rule__EDatabaseType__Alternatives : ( ( ( 'PostgreSQL' ) ) | ( ( 'Oracle' ) ) | ( ( 'MySQL' ) ) );
    public final void rule__EDatabaseType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:650:1: ( ( ( 'PostgreSQL' ) ) | ( ( 'Oracle' ) ) | ( ( 'MySQL' ) ) )
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
                    // InternalSecurityDsl.g:651:2: ( ( 'PostgreSQL' ) )
                    {
                    // InternalSecurityDsl.g:651:2: ( ( 'PostgreSQL' ) )
                    // InternalSecurityDsl.g:652:3: ( 'PostgreSQL' )
                    {
                     before(grammarAccess.getEDatabaseTypeAccess().getPostgreSQLEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:653:3: ( 'PostgreSQL' )
                    // InternalSecurityDsl.g:653:4: 'PostgreSQL'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getEDatabaseTypeAccess().getPostgreSQLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:657:2: ( ( 'Oracle' ) )
                    {
                    // InternalSecurityDsl.g:657:2: ( ( 'Oracle' ) )
                    // InternalSecurityDsl.g:658:3: ( 'Oracle' )
                    {
                     before(grammarAccess.getEDatabaseTypeAccess().getOracleEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:659:3: ( 'Oracle' )
                    // InternalSecurityDsl.g:659:4: 'Oracle'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getEDatabaseTypeAccess().getOracleEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:663:2: ( ( 'MySQL' ) )
                    {
                    // InternalSecurityDsl.g:663:2: ( ( 'MySQL' ) )
                    // InternalSecurityDsl.g:664:3: ( 'MySQL' )
                    {
                     before(grammarAccess.getEDatabaseTypeAccess().getMySQLEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:665:3: ( 'MySQL' )
                    // InternalSecurityDsl.g:665:4: 'MySQL'
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
    // InternalSecurityDsl.g:673:1: rule__EType__Alternatives : ( ( ( 'String' ) ) | ( ( 'Float' ) ) | ( ( 'Long' ) ) | ( ( 'Integer' ) ) | ( ( 'char' ) ) | ( ( 'Double' ) ) | ( ( 'DateTime' ) ) | ( ( 'Date' ) ) | ( ( 'int' ) ) );
    public final void rule__EType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:677:1: ( ( ( 'String' ) ) | ( ( 'Float' ) ) | ( ( 'Long' ) ) | ( ( 'Integer' ) ) | ( ( 'char' ) ) | ( ( 'Double' ) ) | ( ( 'DateTime' ) ) | ( ( 'Date' ) ) | ( ( 'int' ) ) )
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
                    // InternalSecurityDsl.g:678:2: ( ( 'String' ) )
                    {
                    // InternalSecurityDsl.g:678:2: ( ( 'String' ) )
                    // InternalSecurityDsl.g:679:3: ( 'String' )
                    {
                     before(grammarAccess.getETypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:680:3: ( 'String' )
                    // InternalSecurityDsl.g:680:4: 'String'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:684:2: ( ( 'Float' ) )
                    {
                    // InternalSecurityDsl.g:684:2: ( ( 'Float' ) )
                    // InternalSecurityDsl.g:685:3: ( 'Float' )
                    {
                     before(grammarAccess.getETypeAccess().getFloatEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:686:3: ( 'Float' )
                    // InternalSecurityDsl.g:686:4: 'Float'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getFloatEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:690:2: ( ( 'Long' ) )
                    {
                    // InternalSecurityDsl.g:690:2: ( ( 'Long' ) )
                    // InternalSecurityDsl.g:691:3: ( 'Long' )
                    {
                     before(grammarAccess.getETypeAccess().getLongEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:692:3: ( 'Long' )
                    // InternalSecurityDsl.g:692:4: 'Long'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getLongEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:696:2: ( ( 'Integer' ) )
                    {
                    // InternalSecurityDsl.g:696:2: ( ( 'Integer' ) )
                    // InternalSecurityDsl.g:697:3: ( 'Integer' )
                    {
                     before(grammarAccess.getETypeAccess().getIntegerEnumLiteralDeclaration_3()); 
                    // InternalSecurityDsl.g:698:3: ( 'Integer' )
                    // InternalSecurityDsl.g:698:4: 'Integer'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getIntegerEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSecurityDsl.g:702:2: ( ( 'char' ) )
                    {
                    // InternalSecurityDsl.g:702:2: ( ( 'char' ) )
                    // InternalSecurityDsl.g:703:3: ( 'char' )
                    {
                     before(grammarAccess.getETypeAccess().getCharEnumLiteralDeclaration_4()); 
                    // InternalSecurityDsl.g:704:3: ( 'char' )
                    // InternalSecurityDsl.g:704:4: 'char'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getCharEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSecurityDsl.g:708:2: ( ( 'Double' ) )
                    {
                    // InternalSecurityDsl.g:708:2: ( ( 'Double' ) )
                    // InternalSecurityDsl.g:709:3: ( 'Double' )
                    {
                     before(grammarAccess.getETypeAccess().getDoubleEnumLiteralDeclaration_5()); 
                    // InternalSecurityDsl.g:710:3: ( 'Double' )
                    // InternalSecurityDsl.g:710:4: 'Double'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getDoubleEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSecurityDsl.g:714:2: ( ( 'DateTime' ) )
                    {
                    // InternalSecurityDsl.g:714:2: ( ( 'DateTime' ) )
                    // InternalSecurityDsl.g:715:3: ( 'DateTime' )
                    {
                     before(grammarAccess.getETypeAccess().getDateTimeEnumLiteralDeclaration_6()); 
                    // InternalSecurityDsl.g:716:3: ( 'DateTime' )
                    // InternalSecurityDsl.g:716:4: 'DateTime'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getDateTimeEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSecurityDsl.g:720:2: ( ( 'Date' ) )
                    {
                    // InternalSecurityDsl.g:720:2: ( ( 'Date' ) )
                    // InternalSecurityDsl.g:721:3: ( 'Date' )
                    {
                     before(grammarAccess.getETypeAccess().getDateEnumLiteralDeclaration_7()); 
                    // InternalSecurityDsl.g:722:3: ( 'Date' )
                    // InternalSecurityDsl.g:722:4: 'Date'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getDateEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSecurityDsl.g:726:2: ( ( 'int' ) )
                    {
                    // InternalSecurityDsl.g:726:2: ( ( 'int' ) )
                    // InternalSecurityDsl.g:727:3: ( 'int' )
                    {
                     before(grammarAccess.getETypeAccess().getIntEnumLiteralDeclaration_8()); 
                    // InternalSecurityDsl.g:728:3: ( 'int' )
                    // InternalSecurityDsl.g:728:4: 'int'
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
    // InternalSecurityDsl.g:736:1: rule__EEndpointMethod__Alternatives : ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) );
    public final void rule__EEndpointMethod__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:740:1: ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) )
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
                    // InternalSecurityDsl.g:741:2: ( ( 'GET' ) )
                    {
                    // InternalSecurityDsl.g:741:2: ( ( 'GET' ) )
                    // InternalSecurityDsl.g:742:3: ( 'GET' )
                    {
                     before(grammarAccess.getEEndpointMethodAccess().getGETEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:743:3: ( 'GET' )
                    // InternalSecurityDsl.g:743:4: 'GET'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointMethodAccess().getGETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:747:2: ( ( 'POST' ) )
                    {
                    // InternalSecurityDsl.g:747:2: ( ( 'POST' ) )
                    // InternalSecurityDsl.g:748:3: ( 'POST' )
                    {
                     before(grammarAccess.getEEndpointMethodAccess().getPOSTEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:749:3: ( 'POST' )
                    // InternalSecurityDsl.g:749:4: 'POST'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointMethodAccess().getPOSTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:753:2: ( ( 'PUT' ) )
                    {
                    // InternalSecurityDsl.g:753:2: ( ( 'PUT' ) )
                    // InternalSecurityDsl.g:754:3: ( 'PUT' )
                    {
                     before(grammarAccess.getEEndpointMethodAccess().getPUTEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:755:3: ( 'PUT' )
                    // InternalSecurityDsl.g:755:4: 'PUT'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointMethodAccess().getPUTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:759:2: ( ( 'DELETE' ) )
                    {
                    // InternalSecurityDsl.g:759:2: ( ( 'DELETE' ) )
                    // InternalSecurityDsl.g:760:3: ( 'DELETE' )
                    {
                     before(grammarAccess.getEEndpointMethodAccess().getDELETEEnumLiteralDeclaration_3()); 
                    // InternalSecurityDsl.g:761:3: ( 'DELETE' )
                    // InternalSecurityDsl.g:761:4: 'DELETE'
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
    // InternalSecurityDsl.g:769:1: rule__EEndpointType__Alternatives : ( ( ( 'REGISTRATION' ) ) | ( ( 'LOGIN' ) ) | ( ( 'LOGOUT' ) ) | ( ( 'OTHER' ) ) );
    public final void rule__EEndpointType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:773:1: ( ( ( 'REGISTRATION' ) ) | ( ( 'LOGIN' ) ) | ( ( 'LOGOUT' ) ) | ( ( 'OTHER' ) ) )
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
                    // InternalSecurityDsl.g:774:2: ( ( 'REGISTRATION' ) )
                    {
                    // InternalSecurityDsl.g:774:2: ( ( 'REGISTRATION' ) )
                    // InternalSecurityDsl.g:775:3: ( 'REGISTRATION' )
                    {
                     before(grammarAccess.getEEndpointTypeAccess().getREGISTRATIONEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:776:3: ( 'REGISTRATION' )
                    // InternalSecurityDsl.g:776:4: 'REGISTRATION'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointTypeAccess().getREGISTRATIONEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:780:2: ( ( 'LOGIN' ) )
                    {
                    // InternalSecurityDsl.g:780:2: ( ( 'LOGIN' ) )
                    // InternalSecurityDsl.g:781:3: ( 'LOGIN' )
                    {
                     before(grammarAccess.getEEndpointTypeAccess().getLOGINEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:782:3: ( 'LOGIN' )
                    // InternalSecurityDsl.g:782:4: 'LOGIN'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointTypeAccess().getLOGINEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:786:2: ( ( 'LOGOUT' ) )
                    {
                    // InternalSecurityDsl.g:786:2: ( ( 'LOGOUT' ) )
                    // InternalSecurityDsl.g:787:3: ( 'LOGOUT' )
                    {
                     before(grammarAccess.getEEndpointTypeAccess().getLOGOUTEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:788:3: ( 'LOGOUT' )
                    // InternalSecurityDsl.g:788:4: 'LOGOUT'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointTypeAccess().getLOGOUTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:792:2: ( ( 'OTHER' ) )
                    {
                    // InternalSecurityDsl.g:792:2: ( ( 'OTHER' ) )
                    // InternalSecurityDsl.g:793:3: ( 'OTHER' )
                    {
                     before(grammarAccess.getEEndpointTypeAccess().getOTHEREnumLiteralDeclaration_3()); 
                    // InternalSecurityDsl.g:794:3: ( 'OTHER' )
                    // InternalSecurityDsl.g:794:4: 'OTHER'
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
    // InternalSecurityDsl.g:802:1: rule__EClaimType__Alternatives : ( ( ( 'PRIVATE' ) ) | ( ( 'PUBLIC' ) ) | ( ( 'REGISTERED' ) ) );
    public final void rule__EClaimType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:806:1: ( ( ( 'PRIVATE' ) ) | ( ( 'PUBLIC' ) ) | ( ( 'REGISTERED' ) ) )
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
                    // InternalSecurityDsl.g:807:2: ( ( 'PRIVATE' ) )
                    {
                    // InternalSecurityDsl.g:807:2: ( ( 'PRIVATE' ) )
                    // InternalSecurityDsl.g:808:3: ( 'PRIVATE' )
                    {
                     before(grammarAccess.getEClaimTypeAccess().getPRIVATEEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:809:3: ( 'PRIVATE' )
                    // InternalSecurityDsl.g:809:4: 'PRIVATE'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getEClaimTypeAccess().getPRIVATEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:813:2: ( ( 'PUBLIC' ) )
                    {
                    // InternalSecurityDsl.g:813:2: ( ( 'PUBLIC' ) )
                    // InternalSecurityDsl.g:814:3: ( 'PUBLIC' )
                    {
                     before(grammarAccess.getEClaimTypeAccess().getPUBLICEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:815:3: ( 'PUBLIC' )
                    // InternalSecurityDsl.g:815:4: 'PUBLIC'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getEClaimTypeAccess().getPUBLICEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:819:2: ( ( 'REGISTERED' ) )
                    {
                    // InternalSecurityDsl.g:819:2: ( ( 'REGISTERED' ) )
                    // InternalSecurityDsl.g:820:3: ( 'REGISTERED' )
                    {
                     before(grammarAccess.getEClaimTypeAccess().getREGISTEREDEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:821:3: ( 'REGISTERED' )
                    // InternalSecurityDsl.g:821:4: 'REGISTERED'
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


    // $ANTLR start "rule__EOAuthProvider__Alternatives"
    // InternalSecurityDsl.g:829:1: rule__EOAuthProvider__Alternatives : ( ( ( 'GOOGLE' ) ) | ( ( 'GITHUB' ) ) | ( ( 'FACEBOOK' ) ) | ( ( 'MICROSOFT_AZURE' ) ) | ( ( 'LINKEDIN' ) ) | ( ( 'TWITTER' ) ) | ( ( 'INSTAGRAM' ) ) );
    public final void rule__EOAuthProvider__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:833:1: ( ( ( 'GOOGLE' ) ) | ( ( 'GITHUB' ) ) | ( ( 'FACEBOOK' ) ) | ( ( 'MICROSOFT_AZURE' ) ) | ( ( 'LINKEDIN' ) ) | ( ( 'TWITTER' ) ) | ( ( 'INSTAGRAM' ) ) )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt8=1;
                }
                break;
            case 35:
                {
                alt8=2;
                }
                break;
            case 36:
                {
                alt8=3;
                }
                break;
            case 37:
                {
                alt8=4;
                }
                break;
            case 38:
                {
                alt8=5;
                }
                break;
            case 39:
                {
                alt8=6;
                }
                break;
            case 40:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalSecurityDsl.g:834:2: ( ( 'GOOGLE' ) )
                    {
                    // InternalSecurityDsl.g:834:2: ( ( 'GOOGLE' ) )
                    // InternalSecurityDsl.g:835:3: ( 'GOOGLE' )
                    {
                     before(grammarAccess.getEOAuthProviderAccess().getGoogleEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:836:3: ( 'GOOGLE' )
                    // InternalSecurityDsl.g:836:4: 'GOOGLE'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getEOAuthProviderAccess().getGoogleEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:840:2: ( ( 'GITHUB' ) )
                    {
                    // InternalSecurityDsl.g:840:2: ( ( 'GITHUB' ) )
                    // InternalSecurityDsl.g:841:3: ( 'GITHUB' )
                    {
                     before(grammarAccess.getEOAuthProviderAccess().getGithubEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:842:3: ( 'GITHUB' )
                    // InternalSecurityDsl.g:842:4: 'GITHUB'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getEOAuthProviderAccess().getGithubEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:846:2: ( ( 'FACEBOOK' ) )
                    {
                    // InternalSecurityDsl.g:846:2: ( ( 'FACEBOOK' ) )
                    // InternalSecurityDsl.g:847:3: ( 'FACEBOOK' )
                    {
                     before(grammarAccess.getEOAuthProviderAccess().getFacebookEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:848:3: ( 'FACEBOOK' )
                    // InternalSecurityDsl.g:848:4: 'FACEBOOK'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getEOAuthProviderAccess().getFacebookEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:852:2: ( ( 'MICROSOFT_AZURE' ) )
                    {
                    // InternalSecurityDsl.g:852:2: ( ( 'MICROSOFT_AZURE' ) )
                    // InternalSecurityDsl.g:853:3: ( 'MICROSOFT_AZURE' )
                    {
                     before(grammarAccess.getEOAuthProviderAccess().getAzureEnumLiteralDeclaration_3()); 
                    // InternalSecurityDsl.g:854:3: ( 'MICROSOFT_AZURE' )
                    // InternalSecurityDsl.g:854:4: 'MICROSOFT_AZURE'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getEOAuthProviderAccess().getAzureEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSecurityDsl.g:858:2: ( ( 'LINKEDIN' ) )
                    {
                    // InternalSecurityDsl.g:858:2: ( ( 'LINKEDIN' ) )
                    // InternalSecurityDsl.g:859:3: ( 'LINKEDIN' )
                    {
                     before(grammarAccess.getEOAuthProviderAccess().getLinkedinEnumLiteralDeclaration_4()); 
                    // InternalSecurityDsl.g:860:3: ( 'LINKEDIN' )
                    // InternalSecurityDsl.g:860:4: 'LINKEDIN'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getEOAuthProviderAccess().getLinkedinEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSecurityDsl.g:864:2: ( ( 'TWITTER' ) )
                    {
                    // InternalSecurityDsl.g:864:2: ( ( 'TWITTER' ) )
                    // InternalSecurityDsl.g:865:3: ( 'TWITTER' )
                    {
                     before(grammarAccess.getEOAuthProviderAccess().getTwitterEnumLiteralDeclaration_5()); 
                    // InternalSecurityDsl.g:866:3: ( 'TWITTER' )
                    // InternalSecurityDsl.g:866:4: 'TWITTER'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getEOAuthProviderAccess().getTwitterEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSecurityDsl.g:870:2: ( ( 'INSTAGRAM' ) )
                    {
                    // InternalSecurityDsl.g:870:2: ( ( 'INSTAGRAM' ) )
                    // InternalSecurityDsl.g:871:3: ( 'INSTAGRAM' )
                    {
                     before(grammarAccess.getEOAuthProviderAccess().getInstagramEnumLiteralDeclaration_6()); 
                    // InternalSecurityDsl.g:872:3: ( 'INSTAGRAM' )
                    // InternalSecurityDsl.g:872:4: 'INSTAGRAM'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getEOAuthProviderAccess().getInstagramEnumLiteralDeclaration_6()); 

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
    // $ANTLR end "rule__EOAuthProvider__Alternatives"


    // $ANTLR start "rule__Application__Group__0"
    // InternalSecurityDsl.g:880:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:884:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // InternalSecurityDsl.g:885:2: rule__Application__Group__0__Impl rule__Application__Group__1
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
    // InternalSecurityDsl.g:892:1: rule__Application__Group__0__Impl : ( () ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:896:1: ( ( () ) )
            // InternalSecurityDsl.g:897:1: ( () )
            {
            // InternalSecurityDsl.g:897:1: ( () )
            // InternalSecurityDsl.g:898:2: ()
            {
             before(grammarAccess.getApplicationAccess().getApplicationAction_0()); 
            // InternalSecurityDsl.g:899:2: ()
            // InternalSecurityDsl.g:899:3: 
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
    // InternalSecurityDsl.g:907:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:911:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // InternalSecurityDsl.g:912:2: rule__Application__Group__1__Impl rule__Application__Group__2
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
    // InternalSecurityDsl.g:919:1: rule__Application__Group__1__Impl : ( 'application:' ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:923:1: ( ( 'application:' ) )
            // InternalSecurityDsl.g:924:1: ( 'application:' )
            {
            // InternalSecurityDsl.g:924:1: ( 'application:' )
            // InternalSecurityDsl.g:925:2: 'application:'
            {
             before(grammarAccess.getApplicationAccess().getApplicationKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSecurityDsl.g:934:1: rule__Application__Group__2 : rule__Application__Group__2__Impl rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:938:1: ( rule__Application__Group__2__Impl rule__Application__Group__3 )
            // InternalSecurityDsl.g:939:2: rule__Application__Group__2__Impl rule__Application__Group__3
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
    // InternalSecurityDsl.g:946:1: rule__Application__Group__2__Impl : ( ( rule__Application__Group_2__0 )? ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:950:1: ( ( ( rule__Application__Group_2__0 )? ) )
            // InternalSecurityDsl.g:951:1: ( ( rule__Application__Group_2__0 )? )
            {
            // InternalSecurityDsl.g:951:1: ( ( rule__Application__Group_2__0 )? )
            // InternalSecurityDsl.g:952:2: ( rule__Application__Group_2__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_2()); 
            // InternalSecurityDsl.g:953:2: ( rule__Application__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==42) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSecurityDsl.g:953:3: rule__Application__Group_2__0
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
    // InternalSecurityDsl.g:961:1: rule__Application__Group__3 : rule__Application__Group__3__Impl rule__Application__Group__4 ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:965:1: ( rule__Application__Group__3__Impl rule__Application__Group__4 )
            // InternalSecurityDsl.g:966:2: rule__Application__Group__3__Impl rule__Application__Group__4
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
    // InternalSecurityDsl.g:973:1: rule__Application__Group__3__Impl : ( ( rule__Application__Group_3__0 )? ) ;
    public final void rule__Application__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:977:1: ( ( ( rule__Application__Group_3__0 )? ) )
            // InternalSecurityDsl.g:978:1: ( ( rule__Application__Group_3__0 )? )
            {
            // InternalSecurityDsl.g:978:1: ( ( rule__Application__Group_3__0 )? )
            // InternalSecurityDsl.g:979:2: ( rule__Application__Group_3__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_3()); 
            // InternalSecurityDsl.g:980:2: ( rule__Application__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==43) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSecurityDsl.g:980:3: rule__Application__Group_3__0
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
    // InternalSecurityDsl.g:988:1: rule__Application__Group__4 : rule__Application__Group__4__Impl rule__Application__Group__5 ;
    public final void rule__Application__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:992:1: ( rule__Application__Group__4__Impl rule__Application__Group__5 )
            // InternalSecurityDsl.g:993:2: rule__Application__Group__4__Impl rule__Application__Group__5
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
    // InternalSecurityDsl.g:1000:1: rule__Application__Group__4__Impl : ( ( rule__Application__Group_4__0 )? ) ;
    public final void rule__Application__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1004:1: ( ( ( rule__Application__Group_4__0 )? ) )
            // InternalSecurityDsl.g:1005:1: ( ( rule__Application__Group_4__0 )? )
            {
            // InternalSecurityDsl.g:1005:1: ( ( rule__Application__Group_4__0 )? )
            // InternalSecurityDsl.g:1006:2: ( rule__Application__Group_4__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_4()); 
            // InternalSecurityDsl.g:1007:2: ( rule__Application__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==44) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSecurityDsl.g:1007:3: rule__Application__Group_4__0
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
    // InternalSecurityDsl.g:1015:1: rule__Application__Group__5 : rule__Application__Group__5__Impl rule__Application__Group__6 ;
    public final void rule__Application__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1019:1: ( rule__Application__Group__5__Impl rule__Application__Group__6 )
            // InternalSecurityDsl.g:1020:2: rule__Application__Group__5__Impl rule__Application__Group__6
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
    // InternalSecurityDsl.g:1027:1: rule__Application__Group__5__Impl : ( ( rule__Application__Group_5__0 )? ) ;
    public final void rule__Application__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1031:1: ( ( ( rule__Application__Group_5__0 )? ) )
            // InternalSecurityDsl.g:1032:1: ( ( rule__Application__Group_5__0 )? )
            {
            // InternalSecurityDsl.g:1032:1: ( ( rule__Application__Group_5__0 )? )
            // InternalSecurityDsl.g:1033:2: ( rule__Application__Group_5__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_5()); 
            // InternalSecurityDsl.g:1034:2: ( rule__Application__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==45) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSecurityDsl.g:1034:3: rule__Application__Group_5__0
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
    // InternalSecurityDsl.g:1042:1: rule__Application__Group__6 : rule__Application__Group__6__Impl rule__Application__Group__7 ;
    public final void rule__Application__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1046:1: ( rule__Application__Group__6__Impl rule__Application__Group__7 )
            // InternalSecurityDsl.g:1047:2: rule__Application__Group__6__Impl rule__Application__Group__7
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
    // InternalSecurityDsl.g:1054:1: rule__Application__Group__6__Impl : ( ( rule__Application__Group_6__0 )? ) ;
    public final void rule__Application__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1058:1: ( ( ( rule__Application__Group_6__0 )? ) )
            // InternalSecurityDsl.g:1059:1: ( ( rule__Application__Group_6__0 )? )
            {
            // InternalSecurityDsl.g:1059:1: ( ( rule__Application__Group_6__0 )? )
            // InternalSecurityDsl.g:1060:2: ( rule__Application__Group_6__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_6()); 
            // InternalSecurityDsl.g:1061:2: ( rule__Application__Group_6__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==46) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSecurityDsl.g:1061:3: rule__Application__Group_6__0
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
    // InternalSecurityDsl.g:1069:1: rule__Application__Group__7 : rule__Application__Group__7__Impl rule__Application__Group__8 ;
    public final void rule__Application__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1073:1: ( rule__Application__Group__7__Impl rule__Application__Group__8 )
            // InternalSecurityDsl.g:1074:2: rule__Application__Group__7__Impl rule__Application__Group__8
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
    // InternalSecurityDsl.g:1081:1: rule__Application__Group__7__Impl : ( ( rule__Application__Group_7__0 )? ) ;
    public final void rule__Application__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1085:1: ( ( ( rule__Application__Group_7__0 )? ) )
            // InternalSecurityDsl.g:1086:1: ( ( rule__Application__Group_7__0 )? )
            {
            // InternalSecurityDsl.g:1086:1: ( ( rule__Application__Group_7__0 )? )
            // InternalSecurityDsl.g:1087:2: ( rule__Application__Group_7__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_7()); 
            // InternalSecurityDsl.g:1088:2: ( rule__Application__Group_7__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==47) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSecurityDsl.g:1088:3: rule__Application__Group_7__0
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
    // InternalSecurityDsl.g:1096:1: rule__Application__Group__8 : rule__Application__Group__8__Impl rule__Application__Group__9 ;
    public final void rule__Application__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1100:1: ( rule__Application__Group__8__Impl rule__Application__Group__9 )
            // InternalSecurityDsl.g:1101:2: rule__Application__Group__8__Impl rule__Application__Group__9
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
    // InternalSecurityDsl.g:1108:1: rule__Application__Group__8__Impl : ( ( rule__Application__Group_8__0 )? ) ;
    public final void rule__Application__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1112:1: ( ( ( rule__Application__Group_8__0 )? ) )
            // InternalSecurityDsl.g:1113:1: ( ( rule__Application__Group_8__0 )? )
            {
            // InternalSecurityDsl.g:1113:1: ( ( rule__Application__Group_8__0 )? )
            // InternalSecurityDsl.g:1114:2: ( rule__Application__Group_8__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_8()); 
            // InternalSecurityDsl.g:1115:2: ( rule__Application__Group_8__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==48) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSecurityDsl.g:1115:3: rule__Application__Group_8__0
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
    // InternalSecurityDsl.g:1123:1: rule__Application__Group__9 : rule__Application__Group__9__Impl rule__Application__Group__10 ;
    public final void rule__Application__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1127:1: ( rule__Application__Group__9__Impl rule__Application__Group__10 )
            // InternalSecurityDsl.g:1128:2: rule__Application__Group__9__Impl rule__Application__Group__10
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
    // InternalSecurityDsl.g:1135:1: rule__Application__Group__9__Impl : ( ( rule__Application__Group_9__0 )? ) ;
    public final void rule__Application__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1139:1: ( ( ( rule__Application__Group_9__0 )? ) )
            // InternalSecurityDsl.g:1140:1: ( ( rule__Application__Group_9__0 )? )
            {
            // InternalSecurityDsl.g:1140:1: ( ( rule__Application__Group_9__0 )? )
            // InternalSecurityDsl.g:1141:2: ( rule__Application__Group_9__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_9()); 
            // InternalSecurityDsl.g:1142:2: ( rule__Application__Group_9__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==49) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSecurityDsl.g:1142:3: rule__Application__Group_9__0
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
    // InternalSecurityDsl.g:1150:1: rule__Application__Group__10 : rule__Application__Group__10__Impl rule__Application__Group__11 ;
    public final void rule__Application__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1154:1: ( rule__Application__Group__10__Impl rule__Application__Group__11 )
            // InternalSecurityDsl.g:1155:2: rule__Application__Group__10__Impl rule__Application__Group__11
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
    // InternalSecurityDsl.g:1162:1: rule__Application__Group__10__Impl : ( ( rule__Application__Group_10__0 )? ) ;
    public final void rule__Application__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1166:1: ( ( ( rule__Application__Group_10__0 )? ) )
            // InternalSecurityDsl.g:1167:1: ( ( rule__Application__Group_10__0 )? )
            {
            // InternalSecurityDsl.g:1167:1: ( ( rule__Application__Group_10__0 )? )
            // InternalSecurityDsl.g:1168:2: ( rule__Application__Group_10__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_10()); 
            // InternalSecurityDsl.g:1169:2: ( rule__Application__Group_10__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==50) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSecurityDsl.g:1169:3: rule__Application__Group_10__0
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
    // InternalSecurityDsl.g:1177:1: rule__Application__Group__11 : rule__Application__Group__11__Impl rule__Application__Group__12 ;
    public final void rule__Application__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1181:1: ( rule__Application__Group__11__Impl rule__Application__Group__12 )
            // InternalSecurityDsl.g:1182:2: rule__Application__Group__11__Impl rule__Application__Group__12
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
    // InternalSecurityDsl.g:1189:1: rule__Application__Group__11__Impl : ( ( rule__Application__Group_11__0 )? ) ;
    public final void rule__Application__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1193:1: ( ( ( rule__Application__Group_11__0 )? ) )
            // InternalSecurityDsl.g:1194:1: ( ( rule__Application__Group_11__0 )? )
            {
            // InternalSecurityDsl.g:1194:1: ( ( rule__Application__Group_11__0 )? )
            // InternalSecurityDsl.g:1195:2: ( rule__Application__Group_11__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_11()); 
            // InternalSecurityDsl.g:1196:2: ( rule__Application__Group_11__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==53) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSecurityDsl.g:1196:3: rule__Application__Group_11__0
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
    // InternalSecurityDsl.g:1204:1: rule__Application__Group__12 : rule__Application__Group__12__Impl ;
    public final void rule__Application__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1208:1: ( rule__Application__Group__12__Impl )
            // InternalSecurityDsl.g:1209:2: rule__Application__Group__12__Impl
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
    // InternalSecurityDsl.g:1215:1: rule__Application__Group__12__Impl : ( ( rule__Application__Group_12__0 )? ) ;
    public final void rule__Application__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1219:1: ( ( ( rule__Application__Group_12__0 )? ) )
            // InternalSecurityDsl.g:1220:1: ( ( rule__Application__Group_12__0 )? )
            {
            // InternalSecurityDsl.g:1220:1: ( ( rule__Application__Group_12__0 )? )
            // InternalSecurityDsl.g:1221:2: ( rule__Application__Group_12__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_12()); 
            // InternalSecurityDsl.g:1222:2: ( rule__Application__Group_12__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==54) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSecurityDsl.g:1222:3: rule__Application__Group_12__0
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
    // InternalSecurityDsl.g:1231:1: rule__Application__Group_2__0 : rule__Application__Group_2__0__Impl rule__Application__Group_2__1 ;
    public final void rule__Application__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1235:1: ( rule__Application__Group_2__0__Impl rule__Application__Group_2__1 )
            // InternalSecurityDsl.g:1236:2: rule__Application__Group_2__0__Impl rule__Application__Group_2__1
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
    // InternalSecurityDsl.g:1243:1: rule__Application__Group_2__0__Impl : ( 'artifact:' ) ;
    public final void rule__Application__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1247:1: ( ( 'artifact:' ) )
            // InternalSecurityDsl.g:1248:1: ( 'artifact:' )
            {
            // InternalSecurityDsl.g:1248:1: ( 'artifact:' )
            // InternalSecurityDsl.g:1249:2: 'artifact:'
            {
             before(grammarAccess.getApplicationAccess().getArtifactKeyword_2_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSecurityDsl.g:1258:1: rule__Application__Group_2__1 : rule__Application__Group_2__1__Impl ;
    public final void rule__Application__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1262:1: ( rule__Application__Group_2__1__Impl )
            // InternalSecurityDsl.g:1263:2: rule__Application__Group_2__1__Impl
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
    // InternalSecurityDsl.g:1269:1: rule__Application__Group_2__1__Impl : ( ( rule__Application__ArtifactAssignment_2_1 ) ) ;
    public final void rule__Application__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1273:1: ( ( ( rule__Application__ArtifactAssignment_2_1 ) ) )
            // InternalSecurityDsl.g:1274:1: ( ( rule__Application__ArtifactAssignment_2_1 ) )
            {
            // InternalSecurityDsl.g:1274:1: ( ( rule__Application__ArtifactAssignment_2_1 ) )
            // InternalSecurityDsl.g:1275:2: ( rule__Application__ArtifactAssignment_2_1 )
            {
             before(grammarAccess.getApplicationAccess().getArtifactAssignment_2_1()); 
            // InternalSecurityDsl.g:1276:2: ( rule__Application__ArtifactAssignment_2_1 )
            // InternalSecurityDsl.g:1276:3: rule__Application__ArtifactAssignment_2_1
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
    // InternalSecurityDsl.g:1285:1: rule__Application__Group_3__0 : rule__Application__Group_3__0__Impl rule__Application__Group_3__1 ;
    public final void rule__Application__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1289:1: ( rule__Application__Group_3__0__Impl rule__Application__Group_3__1 )
            // InternalSecurityDsl.g:1290:2: rule__Application__Group_3__0__Impl rule__Application__Group_3__1
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
    // InternalSecurityDsl.g:1297:1: rule__Application__Group_3__0__Impl : ( 'name:' ) ;
    public final void rule__Application__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1301:1: ( ( 'name:' ) )
            // InternalSecurityDsl.g:1302:1: ( 'name:' )
            {
            // InternalSecurityDsl.g:1302:1: ( 'name:' )
            // InternalSecurityDsl.g:1303:2: 'name:'
            {
             before(grammarAccess.getApplicationAccess().getNameKeyword_3_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSecurityDsl.g:1312:1: rule__Application__Group_3__1 : rule__Application__Group_3__1__Impl ;
    public final void rule__Application__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1316:1: ( rule__Application__Group_3__1__Impl )
            // InternalSecurityDsl.g:1317:2: rule__Application__Group_3__1__Impl
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
    // InternalSecurityDsl.g:1323:1: rule__Application__Group_3__1__Impl : ( ( rule__Application__NameAssignment_3_1 ) ) ;
    public final void rule__Application__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1327:1: ( ( ( rule__Application__NameAssignment_3_1 ) ) )
            // InternalSecurityDsl.g:1328:1: ( ( rule__Application__NameAssignment_3_1 ) )
            {
            // InternalSecurityDsl.g:1328:1: ( ( rule__Application__NameAssignment_3_1 ) )
            // InternalSecurityDsl.g:1329:2: ( rule__Application__NameAssignment_3_1 )
            {
             before(grammarAccess.getApplicationAccess().getNameAssignment_3_1()); 
            // InternalSecurityDsl.g:1330:2: ( rule__Application__NameAssignment_3_1 )
            // InternalSecurityDsl.g:1330:3: rule__Application__NameAssignment_3_1
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
    // InternalSecurityDsl.g:1339:1: rule__Application__Group_4__0 : rule__Application__Group_4__0__Impl rule__Application__Group_4__1 ;
    public final void rule__Application__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1343:1: ( rule__Application__Group_4__0__Impl rule__Application__Group_4__1 )
            // InternalSecurityDsl.g:1344:2: rule__Application__Group_4__0__Impl rule__Application__Group_4__1
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
    // InternalSecurityDsl.g:1351:1: rule__Application__Group_4__0__Impl : ( 'group:' ) ;
    public final void rule__Application__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1355:1: ( ( 'group:' ) )
            // InternalSecurityDsl.g:1356:1: ( 'group:' )
            {
            // InternalSecurityDsl.g:1356:1: ( 'group:' )
            // InternalSecurityDsl.g:1357:2: 'group:'
            {
             before(grammarAccess.getApplicationAccess().getGroupKeyword_4_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalSecurityDsl.g:1366:1: rule__Application__Group_4__1 : rule__Application__Group_4__1__Impl ;
    public final void rule__Application__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1370:1: ( rule__Application__Group_4__1__Impl )
            // InternalSecurityDsl.g:1371:2: rule__Application__Group_4__1__Impl
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
    // InternalSecurityDsl.g:1377:1: rule__Application__Group_4__1__Impl : ( ( rule__Application__GroupAssignment_4_1 ) ) ;
    public final void rule__Application__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1381:1: ( ( ( rule__Application__GroupAssignment_4_1 ) ) )
            // InternalSecurityDsl.g:1382:1: ( ( rule__Application__GroupAssignment_4_1 ) )
            {
            // InternalSecurityDsl.g:1382:1: ( ( rule__Application__GroupAssignment_4_1 ) )
            // InternalSecurityDsl.g:1383:2: ( rule__Application__GroupAssignment_4_1 )
            {
             before(grammarAccess.getApplicationAccess().getGroupAssignment_4_1()); 
            // InternalSecurityDsl.g:1384:2: ( rule__Application__GroupAssignment_4_1 )
            // InternalSecurityDsl.g:1384:3: rule__Application__GroupAssignment_4_1
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
    // InternalSecurityDsl.g:1393:1: rule__Application__Group_5__0 : rule__Application__Group_5__0__Impl rule__Application__Group_5__1 ;
    public final void rule__Application__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1397:1: ( rule__Application__Group_5__0__Impl rule__Application__Group_5__1 )
            // InternalSecurityDsl.g:1398:2: rule__Application__Group_5__0__Impl rule__Application__Group_5__1
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
    // InternalSecurityDsl.g:1405:1: rule__Application__Group_5__0__Impl : ( 'packageName:' ) ;
    public final void rule__Application__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1409:1: ( ( 'packageName:' ) )
            // InternalSecurityDsl.g:1410:1: ( 'packageName:' )
            {
            // InternalSecurityDsl.g:1410:1: ( 'packageName:' )
            // InternalSecurityDsl.g:1411:2: 'packageName:'
            {
             before(grammarAccess.getApplicationAccess().getPackageNameKeyword_5_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalSecurityDsl.g:1420:1: rule__Application__Group_5__1 : rule__Application__Group_5__1__Impl ;
    public final void rule__Application__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1424:1: ( rule__Application__Group_5__1__Impl )
            // InternalSecurityDsl.g:1425:2: rule__Application__Group_5__1__Impl
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
    // InternalSecurityDsl.g:1431:1: rule__Application__Group_5__1__Impl : ( ( rule__Application__PackageNameAssignment_5_1 ) ) ;
    public final void rule__Application__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1435:1: ( ( ( rule__Application__PackageNameAssignment_5_1 ) ) )
            // InternalSecurityDsl.g:1436:1: ( ( rule__Application__PackageNameAssignment_5_1 ) )
            {
            // InternalSecurityDsl.g:1436:1: ( ( rule__Application__PackageNameAssignment_5_1 ) )
            // InternalSecurityDsl.g:1437:2: ( rule__Application__PackageNameAssignment_5_1 )
            {
             before(grammarAccess.getApplicationAccess().getPackageNameAssignment_5_1()); 
            // InternalSecurityDsl.g:1438:2: ( rule__Application__PackageNameAssignment_5_1 )
            // InternalSecurityDsl.g:1438:3: rule__Application__PackageNameAssignment_5_1
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
    // InternalSecurityDsl.g:1447:1: rule__Application__Group_6__0 : rule__Application__Group_6__0__Impl rule__Application__Group_6__1 ;
    public final void rule__Application__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1451:1: ( rule__Application__Group_6__0__Impl rule__Application__Group_6__1 )
            // InternalSecurityDsl.g:1452:2: rule__Application__Group_6__0__Impl rule__Application__Group_6__1
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
    // InternalSecurityDsl.g:1459:1: rule__Application__Group_6__0__Impl : ( 'description:' ) ;
    public final void rule__Application__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1463:1: ( ( 'description:' ) )
            // InternalSecurityDsl.g:1464:1: ( 'description:' )
            {
            // InternalSecurityDsl.g:1464:1: ( 'description:' )
            // InternalSecurityDsl.g:1465:2: 'description:'
            {
             before(grammarAccess.getApplicationAccess().getDescriptionKeyword_6_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalSecurityDsl.g:1474:1: rule__Application__Group_6__1 : rule__Application__Group_6__1__Impl ;
    public final void rule__Application__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1478:1: ( rule__Application__Group_6__1__Impl )
            // InternalSecurityDsl.g:1479:2: rule__Application__Group_6__1__Impl
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
    // InternalSecurityDsl.g:1485:1: rule__Application__Group_6__1__Impl : ( ( rule__Application__DescriptionAssignment_6_1 ) ) ;
    public final void rule__Application__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1489:1: ( ( ( rule__Application__DescriptionAssignment_6_1 ) ) )
            // InternalSecurityDsl.g:1490:1: ( ( rule__Application__DescriptionAssignment_6_1 ) )
            {
            // InternalSecurityDsl.g:1490:1: ( ( rule__Application__DescriptionAssignment_6_1 ) )
            // InternalSecurityDsl.g:1491:2: ( rule__Application__DescriptionAssignment_6_1 )
            {
             before(grammarAccess.getApplicationAccess().getDescriptionAssignment_6_1()); 
            // InternalSecurityDsl.g:1492:2: ( rule__Application__DescriptionAssignment_6_1 )
            // InternalSecurityDsl.g:1492:3: rule__Application__DescriptionAssignment_6_1
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
    // InternalSecurityDsl.g:1501:1: rule__Application__Group_7__0 : rule__Application__Group_7__0__Impl rule__Application__Group_7__1 ;
    public final void rule__Application__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1505:1: ( rule__Application__Group_7__0__Impl rule__Application__Group_7__1 )
            // InternalSecurityDsl.g:1506:2: rule__Application__Group_7__0__Impl rule__Application__Group_7__1
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
    // InternalSecurityDsl.g:1513:1: rule__Application__Group_7__0__Impl : ( 'port:' ) ;
    public final void rule__Application__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1517:1: ( ( 'port:' ) )
            // InternalSecurityDsl.g:1518:1: ( 'port:' )
            {
            // InternalSecurityDsl.g:1518:1: ( 'port:' )
            // InternalSecurityDsl.g:1519:2: 'port:'
            {
             before(grammarAccess.getApplicationAccess().getPortKeyword_7_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalSecurityDsl.g:1528:1: rule__Application__Group_7__1 : rule__Application__Group_7__1__Impl ;
    public final void rule__Application__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1532:1: ( rule__Application__Group_7__1__Impl )
            // InternalSecurityDsl.g:1533:2: rule__Application__Group_7__1__Impl
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
    // InternalSecurityDsl.g:1539:1: rule__Application__Group_7__1__Impl : ( ( rule__Application__PortAssignment_7_1 ) ) ;
    public final void rule__Application__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1543:1: ( ( ( rule__Application__PortAssignment_7_1 ) ) )
            // InternalSecurityDsl.g:1544:1: ( ( rule__Application__PortAssignment_7_1 ) )
            {
            // InternalSecurityDsl.g:1544:1: ( ( rule__Application__PortAssignment_7_1 ) )
            // InternalSecurityDsl.g:1545:2: ( rule__Application__PortAssignment_7_1 )
            {
             before(grammarAccess.getApplicationAccess().getPortAssignment_7_1()); 
            // InternalSecurityDsl.g:1546:2: ( rule__Application__PortAssignment_7_1 )
            // InternalSecurityDsl.g:1546:3: rule__Application__PortAssignment_7_1
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
    // InternalSecurityDsl.g:1555:1: rule__Application__Group_8__0 : rule__Application__Group_8__0__Impl rule__Application__Group_8__1 ;
    public final void rule__Application__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1559:1: ( rule__Application__Group_8__0__Impl rule__Application__Group_8__1 )
            // InternalSecurityDsl.g:1560:2: rule__Application__Group_8__0__Impl rule__Application__Group_8__1
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
    // InternalSecurityDsl.g:1567:1: rule__Application__Group_8__0__Impl : ( 'hostname:' ) ;
    public final void rule__Application__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1571:1: ( ( 'hostname:' ) )
            // InternalSecurityDsl.g:1572:1: ( 'hostname:' )
            {
            // InternalSecurityDsl.g:1572:1: ( 'hostname:' )
            // InternalSecurityDsl.g:1573:2: 'hostname:'
            {
             before(grammarAccess.getApplicationAccess().getHostnameKeyword_8_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalSecurityDsl.g:1582:1: rule__Application__Group_8__1 : rule__Application__Group_8__1__Impl ;
    public final void rule__Application__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1586:1: ( rule__Application__Group_8__1__Impl )
            // InternalSecurityDsl.g:1587:2: rule__Application__Group_8__1__Impl
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
    // InternalSecurityDsl.g:1593:1: rule__Application__Group_8__1__Impl : ( ( rule__Application__HostnameAssignment_8_1 ) ) ;
    public final void rule__Application__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1597:1: ( ( ( rule__Application__HostnameAssignment_8_1 ) ) )
            // InternalSecurityDsl.g:1598:1: ( ( rule__Application__HostnameAssignment_8_1 ) )
            {
            // InternalSecurityDsl.g:1598:1: ( ( rule__Application__HostnameAssignment_8_1 ) )
            // InternalSecurityDsl.g:1599:2: ( rule__Application__HostnameAssignment_8_1 )
            {
             before(grammarAccess.getApplicationAccess().getHostnameAssignment_8_1()); 
            // InternalSecurityDsl.g:1600:2: ( rule__Application__HostnameAssignment_8_1 )
            // InternalSecurityDsl.g:1600:3: rule__Application__HostnameAssignment_8_1
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
    // InternalSecurityDsl.g:1609:1: rule__Application__Group_9__0 : rule__Application__Group_9__0__Impl rule__Application__Group_9__1 ;
    public final void rule__Application__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1613:1: ( rule__Application__Group_9__0__Impl rule__Application__Group_9__1 )
            // InternalSecurityDsl.g:1614:2: rule__Application__Group_9__0__Impl rule__Application__Group_9__1
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
    // InternalSecurityDsl.g:1621:1: rule__Application__Group_9__0__Impl : ( 'database:' ) ;
    public final void rule__Application__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1625:1: ( ( 'database:' ) )
            // InternalSecurityDsl.g:1626:1: ( 'database:' )
            {
            // InternalSecurityDsl.g:1626:1: ( 'database:' )
            // InternalSecurityDsl.g:1627:2: 'database:'
            {
             before(grammarAccess.getApplicationAccess().getDatabaseKeyword_9_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalSecurityDsl.g:1636:1: rule__Application__Group_9__1 : rule__Application__Group_9__1__Impl ;
    public final void rule__Application__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1640:1: ( rule__Application__Group_9__1__Impl )
            // InternalSecurityDsl.g:1641:2: rule__Application__Group_9__1__Impl
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
    // InternalSecurityDsl.g:1647:1: rule__Application__Group_9__1__Impl : ( ( rule__Application__App_databaseAssignment_9_1 ) ) ;
    public final void rule__Application__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1651:1: ( ( ( rule__Application__App_databaseAssignment_9_1 ) ) )
            // InternalSecurityDsl.g:1652:1: ( ( rule__Application__App_databaseAssignment_9_1 ) )
            {
            // InternalSecurityDsl.g:1652:1: ( ( rule__Application__App_databaseAssignment_9_1 ) )
            // InternalSecurityDsl.g:1653:2: ( rule__Application__App_databaseAssignment_9_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_databaseAssignment_9_1()); 
            // InternalSecurityDsl.g:1654:2: ( rule__Application__App_databaseAssignment_9_1 )
            // InternalSecurityDsl.g:1654:3: rule__Application__App_databaseAssignment_9_1
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
    // InternalSecurityDsl.g:1663:1: rule__Application__Group_10__0 : rule__Application__Group_10__0__Impl rule__Application__Group_10__1 ;
    public final void rule__Application__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1667:1: ( rule__Application__Group_10__0__Impl rule__Application__Group_10__1 )
            // InternalSecurityDsl.g:1668:2: rule__Application__Group_10__0__Impl rule__Application__Group_10__1
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
    // InternalSecurityDsl.g:1675:1: rule__Application__Group_10__0__Impl : ( 'model:' ) ;
    public final void rule__Application__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1679:1: ( ( 'model:' ) )
            // InternalSecurityDsl.g:1680:1: ( 'model:' )
            {
            // InternalSecurityDsl.g:1680:1: ( 'model:' )
            // InternalSecurityDsl.g:1681:2: 'model:'
            {
             before(grammarAccess.getApplicationAccess().getModelKeyword_10_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalSecurityDsl.g:1690:1: rule__Application__Group_10__1 : rule__Application__Group_10__1__Impl rule__Application__Group_10__2 ;
    public final void rule__Application__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1694:1: ( rule__Application__Group_10__1__Impl rule__Application__Group_10__2 )
            // InternalSecurityDsl.g:1695:2: rule__Application__Group_10__1__Impl rule__Application__Group_10__2
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
    // InternalSecurityDsl.g:1702:1: rule__Application__Group_10__1__Impl : ( ( rule__Application__Group_10_1__0 )? ) ;
    public final void rule__Application__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1706:1: ( ( ( rule__Application__Group_10_1__0 )? ) )
            // InternalSecurityDsl.g:1707:1: ( ( rule__Application__Group_10_1__0 )? )
            {
            // InternalSecurityDsl.g:1707:1: ( ( rule__Application__Group_10_1__0 )? )
            // InternalSecurityDsl.g:1708:2: ( rule__Application__Group_10_1__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_10_1()); 
            // InternalSecurityDsl.g:1709:2: ( rule__Application__Group_10_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==51) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSecurityDsl.g:1709:3: rule__Application__Group_10_1__0
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
    // InternalSecurityDsl.g:1717:1: rule__Application__Group_10__2 : rule__Application__Group_10__2__Impl ;
    public final void rule__Application__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1721:1: ( rule__Application__Group_10__2__Impl )
            // InternalSecurityDsl.g:1722:2: rule__Application__Group_10__2__Impl
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
    // InternalSecurityDsl.g:1728:1: rule__Application__Group_10__2__Impl : ( ( rule__Application__Group_10_2__0 )? ) ;
    public final void rule__Application__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1732:1: ( ( ( rule__Application__Group_10_2__0 )? ) )
            // InternalSecurityDsl.g:1733:1: ( ( rule__Application__Group_10_2__0 )? )
            {
            // InternalSecurityDsl.g:1733:1: ( ( rule__Application__Group_10_2__0 )? )
            // InternalSecurityDsl.g:1734:2: ( rule__Application__Group_10_2__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_10_2()); 
            // InternalSecurityDsl.g:1735:2: ( rule__Application__Group_10_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==52) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSecurityDsl.g:1735:3: rule__Application__Group_10_2__0
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
    // InternalSecurityDsl.g:1744:1: rule__Application__Group_10_1__0 : rule__Application__Group_10_1__0__Impl rule__Application__Group_10_1__1 ;
    public final void rule__Application__Group_10_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1748:1: ( rule__Application__Group_10_1__0__Impl rule__Application__Group_10_1__1 )
            // InternalSecurityDsl.g:1749:2: rule__Application__Group_10_1__0__Impl rule__Application__Group_10_1__1
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
    // InternalSecurityDsl.g:1756:1: rule__Application__Group_10_1__0__Impl : ( 'user:' ) ;
    public final void rule__Application__Group_10_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1760:1: ( ( 'user:' ) )
            // InternalSecurityDsl.g:1761:1: ( 'user:' )
            {
            // InternalSecurityDsl.g:1761:1: ( 'user:' )
            // InternalSecurityDsl.g:1762:2: 'user:'
            {
             before(grammarAccess.getApplicationAccess().getUserKeyword_10_1_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalSecurityDsl.g:1771:1: rule__Application__Group_10_1__1 : rule__Application__Group_10_1__1__Impl ;
    public final void rule__Application__Group_10_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1775:1: ( rule__Application__Group_10_1__1__Impl )
            // InternalSecurityDsl.g:1776:2: rule__Application__Group_10_1__1__Impl
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
    // InternalSecurityDsl.g:1782:1: rule__Application__Group_10_1__1__Impl : ( ( rule__Application__App_modelsAssignment_10_1_1 ) ) ;
    public final void rule__Application__Group_10_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1786:1: ( ( ( rule__Application__App_modelsAssignment_10_1_1 ) ) )
            // InternalSecurityDsl.g:1787:1: ( ( rule__Application__App_modelsAssignment_10_1_1 ) )
            {
            // InternalSecurityDsl.g:1787:1: ( ( rule__Application__App_modelsAssignment_10_1_1 ) )
            // InternalSecurityDsl.g:1788:2: ( rule__Application__App_modelsAssignment_10_1_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_modelsAssignment_10_1_1()); 
            // InternalSecurityDsl.g:1789:2: ( rule__Application__App_modelsAssignment_10_1_1 )
            // InternalSecurityDsl.g:1789:3: rule__Application__App_modelsAssignment_10_1_1
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
    // InternalSecurityDsl.g:1798:1: rule__Application__Group_10_2__0 : rule__Application__Group_10_2__0__Impl rule__Application__Group_10_2__1 ;
    public final void rule__Application__Group_10_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1802:1: ( rule__Application__Group_10_2__0__Impl rule__Application__Group_10_2__1 )
            // InternalSecurityDsl.g:1803:2: rule__Application__Group_10_2__0__Impl rule__Application__Group_10_2__1
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
    // InternalSecurityDsl.g:1810:1: rule__Application__Group_10_2__0__Impl : ( 'role:' ) ;
    public final void rule__Application__Group_10_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1814:1: ( ( 'role:' ) )
            // InternalSecurityDsl.g:1815:1: ( 'role:' )
            {
            // InternalSecurityDsl.g:1815:1: ( 'role:' )
            // InternalSecurityDsl.g:1816:2: 'role:'
            {
             before(grammarAccess.getApplicationAccess().getRoleKeyword_10_2_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalSecurityDsl.g:1825:1: rule__Application__Group_10_2__1 : rule__Application__Group_10_2__1__Impl ;
    public final void rule__Application__Group_10_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1829:1: ( rule__Application__Group_10_2__1__Impl )
            // InternalSecurityDsl.g:1830:2: rule__Application__Group_10_2__1__Impl
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
    // InternalSecurityDsl.g:1836:1: rule__Application__Group_10_2__1__Impl : ( ( rule__Application__App_modelsAssignment_10_2_1 ) ) ;
    public final void rule__Application__Group_10_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1840:1: ( ( ( rule__Application__App_modelsAssignment_10_2_1 ) ) )
            // InternalSecurityDsl.g:1841:1: ( ( rule__Application__App_modelsAssignment_10_2_1 ) )
            {
            // InternalSecurityDsl.g:1841:1: ( ( rule__Application__App_modelsAssignment_10_2_1 ) )
            // InternalSecurityDsl.g:1842:2: ( rule__Application__App_modelsAssignment_10_2_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_modelsAssignment_10_2_1()); 
            // InternalSecurityDsl.g:1843:2: ( rule__Application__App_modelsAssignment_10_2_1 )
            // InternalSecurityDsl.g:1843:3: rule__Application__App_modelsAssignment_10_2_1
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
    // InternalSecurityDsl.g:1852:1: rule__Application__Group_11__0 : rule__Application__Group_11__0__Impl rule__Application__Group_11__1 ;
    public final void rule__Application__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1856:1: ( rule__Application__Group_11__0__Impl rule__Application__Group_11__1 )
            // InternalSecurityDsl.g:1857:2: rule__Application__Group_11__0__Impl rule__Application__Group_11__1
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
    // InternalSecurityDsl.g:1864:1: rule__Application__Group_11__0__Impl : ( 'security:' ) ;
    public final void rule__Application__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1868:1: ( ( 'security:' ) )
            // InternalSecurityDsl.g:1869:1: ( 'security:' )
            {
            // InternalSecurityDsl.g:1869:1: ( 'security:' )
            // InternalSecurityDsl.g:1870:2: 'security:'
            {
             before(grammarAccess.getApplicationAccess().getSecurityKeyword_11_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalSecurityDsl.g:1879:1: rule__Application__Group_11__1 : rule__Application__Group_11__1__Impl ;
    public final void rule__Application__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1883:1: ( rule__Application__Group_11__1__Impl )
            // InternalSecurityDsl.g:1884:2: rule__Application__Group_11__1__Impl
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
    // InternalSecurityDsl.g:1890:1: rule__Application__Group_11__1__Impl : ( ( rule__Application__App_securityAssignment_11_1 ) ) ;
    public final void rule__Application__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1894:1: ( ( ( rule__Application__App_securityAssignment_11_1 ) ) )
            // InternalSecurityDsl.g:1895:1: ( ( rule__Application__App_securityAssignment_11_1 ) )
            {
            // InternalSecurityDsl.g:1895:1: ( ( rule__Application__App_securityAssignment_11_1 ) )
            // InternalSecurityDsl.g:1896:2: ( rule__Application__App_securityAssignment_11_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_securityAssignment_11_1()); 
            // InternalSecurityDsl.g:1897:2: ( rule__Application__App_securityAssignment_11_1 )
            // InternalSecurityDsl.g:1897:3: rule__Application__App_securityAssignment_11_1
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
    // InternalSecurityDsl.g:1906:1: rule__Application__Group_12__0 : rule__Application__Group_12__0__Impl rule__Application__Group_12__1 ;
    public final void rule__Application__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1910:1: ( rule__Application__Group_12__0__Impl rule__Application__Group_12__1 )
            // InternalSecurityDsl.g:1911:2: rule__Application__Group_12__0__Impl rule__Application__Group_12__1
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
    // InternalSecurityDsl.g:1918:1: rule__Application__Group_12__0__Impl : ( 'controller:' ) ;
    public final void rule__Application__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1922:1: ( ( 'controller:' ) )
            // InternalSecurityDsl.g:1923:1: ( 'controller:' )
            {
            // InternalSecurityDsl.g:1923:1: ( 'controller:' )
            // InternalSecurityDsl.g:1924:2: 'controller:'
            {
             before(grammarAccess.getApplicationAccess().getControllerKeyword_12_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalSecurityDsl.g:1933:1: rule__Application__Group_12__1 : rule__Application__Group_12__1__Impl ;
    public final void rule__Application__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1937:1: ( rule__Application__Group_12__1__Impl )
            // InternalSecurityDsl.g:1938:2: rule__Application__Group_12__1__Impl
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
    // InternalSecurityDsl.g:1944:1: rule__Application__Group_12__1__Impl : ( ( rule__Application__Group_12_1__0 )? ) ;
    public final void rule__Application__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1948:1: ( ( ( rule__Application__Group_12_1__0 )? ) )
            // InternalSecurityDsl.g:1949:1: ( ( rule__Application__Group_12_1__0 )? )
            {
            // InternalSecurityDsl.g:1949:1: ( ( rule__Application__Group_12_1__0 )? )
            // InternalSecurityDsl.g:1950:2: ( rule__Application__Group_12_1__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_12_1()); 
            // InternalSecurityDsl.g:1951:2: ( rule__Application__Group_12_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==55) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSecurityDsl.g:1951:3: rule__Application__Group_12_1__0
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
    // InternalSecurityDsl.g:1960:1: rule__Application__Group_12_1__0 : rule__Application__Group_12_1__0__Impl rule__Application__Group_12_1__1 ;
    public final void rule__Application__Group_12_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1964:1: ( rule__Application__Group_12_1__0__Impl rule__Application__Group_12_1__1 )
            // InternalSecurityDsl.g:1965:2: rule__Application__Group_12_1__0__Impl rule__Application__Group_12_1__1
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
    // InternalSecurityDsl.g:1972:1: rule__Application__Group_12_1__0__Impl : ( 'auth:' ) ;
    public final void rule__Application__Group_12_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1976:1: ( ( 'auth:' ) )
            // InternalSecurityDsl.g:1977:1: ( 'auth:' )
            {
            // InternalSecurityDsl.g:1977:1: ( 'auth:' )
            // InternalSecurityDsl.g:1978:2: 'auth:'
            {
             before(grammarAccess.getApplicationAccess().getAuthKeyword_12_1_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalSecurityDsl.g:1987:1: rule__Application__Group_12_1__1 : rule__Application__Group_12_1__1__Impl ;
    public final void rule__Application__Group_12_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1991:1: ( rule__Application__Group_12_1__1__Impl )
            // InternalSecurityDsl.g:1992:2: rule__Application__Group_12_1__1__Impl
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
    // InternalSecurityDsl.g:1998:1: rule__Application__Group_12_1__1__Impl : ( ( rule__Application__App_controllersAssignment_12_1_1 ) ) ;
    public final void rule__Application__Group_12_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2002:1: ( ( ( rule__Application__App_controllersAssignment_12_1_1 ) ) )
            // InternalSecurityDsl.g:2003:1: ( ( rule__Application__App_controllersAssignment_12_1_1 ) )
            {
            // InternalSecurityDsl.g:2003:1: ( ( rule__Application__App_controllersAssignment_12_1_1 ) )
            // InternalSecurityDsl.g:2004:2: ( rule__Application__App_controllersAssignment_12_1_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_controllersAssignment_12_1_1()); 
            // InternalSecurityDsl.g:2005:2: ( rule__Application__App_controllersAssignment_12_1_1 )
            // InternalSecurityDsl.g:2005:3: rule__Application__App_controllersAssignment_12_1_1
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
    // InternalSecurityDsl.g:2014:1: rule__Database__Group__0 : rule__Database__Group__0__Impl rule__Database__Group__1 ;
    public final void rule__Database__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2018:1: ( rule__Database__Group__0__Impl rule__Database__Group__1 )
            // InternalSecurityDsl.g:2019:2: rule__Database__Group__0__Impl rule__Database__Group__1
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
    // InternalSecurityDsl.g:2026:1: rule__Database__Group__0__Impl : ( 'vendor:' ) ;
    public final void rule__Database__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2030:1: ( ( 'vendor:' ) )
            // InternalSecurityDsl.g:2031:1: ( 'vendor:' )
            {
            // InternalSecurityDsl.g:2031:1: ( 'vendor:' )
            // InternalSecurityDsl.g:2032:2: 'vendor:'
            {
             before(grammarAccess.getDatabaseAccess().getVendorKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2041:1: rule__Database__Group__1 : rule__Database__Group__1__Impl rule__Database__Group__2 ;
    public final void rule__Database__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2045:1: ( rule__Database__Group__1__Impl rule__Database__Group__2 )
            // InternalSecurityDsl.g:2046:2: rule__Database__Group__1__Impl rule__Database__Group__2
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
    // InternalSecurityDsl.g:2053:1: rule__Database__Group__1__Impl : ( ( rule__Database__VendorNameAssignment_1 ) ) ;
    public final void rule__Database__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2057:1: ( ( ( rule__Database__VendorNameAssignment_1 ) ) )
            // InternalSecurityDsl.g:2058:1: ( ( rule__Database__VendorNameAssignment_1 ) )
            {
            // InternalSecurityDsl.g:2058:1: ( ( rule__Database__VendorNameAssignment_1 ) )
            // InternalSecurityDsl.g:2059:2: ( rule__Database__VendorNameAssignment_1 )
            {
             before(grammarAccess.getDatabaseAccess().getVendorNameAssignment_1()); 
            // InternalSecurityDsl.g:2060:2: ( rule__Database__VendorNameAssignment_1 )
            // InternalSecurityDsl.g:2060:3: rule__Database__VendorNameAssignment_1
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
    // InternalSecurityDsl.g:2068:1: rule__Database__Group__2 : rule__Database__Group__2__Impl rule__Database__Group__3 ;
    public final void rule__Database__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2072:1: ( rule__Database__Group__2__Impl rule__Database__Group__3 )
            // InternalSecurityDsl.g:2073:2: rule__Database__Group__2__Impl rule__Database__Group__3
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
    // InternalSecurityDsl.g:2080:1: rule__Database__Group__2__Impl : ( 'url:' ) ;
    public final void rule__Database__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2084:1: ( ( 'url:' ) )
            // InternalSecurityDsl.g:2085:1: ( 'url:' )
            {
            // InternalSecurityDsl.g:2085:1: ( 'url:' )
            // InternalSecurityDsl.g:2086:2: 'url:'
            {
             before(grammarAccess.getDatabaseAccess().getUrlKeyword_2()); 
            match(input,57,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2095:1: rule__Database__Group__3 : rule__Database__Group__3__Impl rule__Database__Group__4 ;
    public final void rule__Database__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2099:1: ( rule__Database__Group__3__Impl rule__Database__Group__4 )
            // InternalSecurityDsl.g:2100:2: rule__Database__Group__3__Impl rule__Database__Group__4
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
    // InternalSecurityDsl.g:2107:1: rule__Database__Group__3__Impl : ( ( rule__Database__UrlAssignment_3 ) ) ;
    public final void rule__Database__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2111:1: ( ( ( rule__Database__UrlAssignment_3 ) ) )
            // InternalSecurityDsl.g:2112:1: ( ( rule__Database__UrlAssignment_3 ) )
            {
            // InternalSecurityDsl.g:2112:1: ( ( rule__Database__UrlAssignment_3 ) )
            // InternalSecurityDsl.g:2113:2: ( rule__Database__UrlAssignment_3 )
            {
             before(grammarAccess.getDatabaseAccess().getUrlAssignment_3()); 
            // InternalSecurityDsl.g:2114:2: ( rule__Database__UrlAssignment_3 )
            // InternalSecurityDsl.g:2114:3: rule__Database__UrlAssignment_3
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
    // InternalSecurityDsl.g:2122:1: rule__Database__Group__4 : rule__Database__Group__4__Impl rule__Database__Group__5 ;
    public final void rule__Database__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2126:1: ( rule__Database__Group__4__Impl rule__Database__Group__5 )
            // InternalSecurityDsl.g:2127:2: rule__Database__Group__4__Impl rule__Database__Group__5
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
    // InternalSecurityDsl.g:2134:1: rule__Database__Group__4__Impl : ( 'username:' ) ;
    public final void rule__Database__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2138:1: ( ( 'username:' ) )
            // InternalSecurityDsl.g:2139:1: ( 'username:' )
            {
            // InternalSecurityDsl.g:2139:1: ( 'username:' )
            // InternalSecurityDsl.g:2140:2: 'username:'
            {
             before(grammarAccess.getDatabaseAccess().getUsernameKeyword_4()); 
            match(input,58,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2149:1: rule__Database__Group__5 : rule__Database__Group__5__Impl rule__Database__Group__6 ;
    public final void rule__Database__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2153:1: ( rule__Database__Group__5__Impl rule__Database__Group__6 )
            // InternalSecurityDsl.g:2154:2: rule__Database__Group__5__Impl rule__Database__Group__6
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
    // InternalSecurityDsl.g:2161:1: rule__Database__Group__5__Impl : ( ( rule__Database__UsernameAssignment_5 ) ) ;
    public final void rule__Database__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2165:1: ( ( ( rule__Database__UsernameAssignment_5 ) ) )
            // InternalSecurityDsl.g:2166:1: ( ( rule__Database__UsernameAssignment_5 ) )
            {
            // InternalSecurityDsl.g:2166:1: ( ( rule__Database__UsernameAssignment_5 ) )
            // InternalSecurityDsl.g:2167:2: ( rule__Database__UsernameAssignment_5 )
            {
             before(grammarAccess.getDatabaseAccess().getUsernameAssignment_5()); 
            // InternalSecurityDsl.g:2168:2: ( rule__Database__UsernameAssignment_5 )
            // InternalSecurityDsl.g:2168:3: rule__Database__UsernameAssignment_5
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
    // InternalSecurityDsl.g:2176:1: rule__Database__Group__6 : rule__Database__Group__6__Impl rule__Database__Group__7 ;
    public final void rule__Database__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2180:1: ( rule__Database__Group__6__Impl rule__Database__Group__7 )
            // InternalSecurityDsl.g:2181:2: rule__Database__Group__6__Impl rule__Database__Group__7
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
    // InternalSecurityDsl.g:2188:1: rule__Database__Group__6__Impl : ( 'password:' ) ;
    public final void rule__Database__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2192:1: ( ( 'password:' ) )
            // InternalSecurityDsl.g:2193:1: ( 'password:' )
            {
            // InternalSecurityDsl.g:2193:1: ( 'password:' )
            // InternalSecurityDsl.g:2194:2: 'password:'
            {
             before(grammarAccess.getDatabaseAccess().getPasswordKeyword_6()); 
            match(input,59,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2203:1: rule__Database__Group__7 : rule__Database__Group__7__Impl ;
    public final void rule__Database__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2207:1: ( rule__Database__Group__7__Impl )
            // InternalSecurityDsl.g:2208:2: rule__Database__Group__7__Impl
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
    // InternalSecurityDsl.g:2214:1: rule__Database__Group__7__Impl : ( ( rule__Database__PasswordAssignment_7 ) ) ;
    public final void rule__Database__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2218:1: ( ( ( rule__Database__PasswordAssignment_7 ) ) )
            // InternalSecurityDsl.g:2219:1: ( ( rule__Database__PasswordAssignment_7 ) )
            {
            // InternalSecurityDsl.g:2219:1: ( ( rule__Database__PasswordAssignment_7 ) )
            // InternalSecurityDsl.g:2220:2: ( rule__Database__PasswordAssignment_7 )
            {
             before(grammarAccess.getDatabaseAccess().getPasswordAssignment_7()); 
            // InternalSecurityDsl.g:2221:2: ( rule__Database__PasswordAssignment_7 )
            // InternalSecurityDsl.g:2221:3: rule__Database__PasswordAssignment_7
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
    // InternalSecurityDsl.g:2230:1: rule__ELongObject__Group__0 : rule__ELongObject__Group__0__Impl rule__ELongObject__Group__1 ;
    public final void rule__ELongObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2234:1: ( rule__ELongObject__Group__0__Impl rule__ELongObject__Group__1 )
            // InternalSecurityDsl.g:2235:2: rule__ELongObject__Group__0__Impl rule__ELongObject__Group__1
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
    // InternalSecurityDsl.g:2242:1: rule__ELongObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__ELongObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2246:1: ( ( ( '-' )? ) )
            // InternalSecurityDsl.g:2247:1: ( ( '-' )? )
            {
            // InternalSecurityDsl.g:2247:1: ( ( '-' )? )
            // InternalSecurityDsl.g:2248:2: ( '-' )?
            {
             before(grammarAccess.getELongObjectAccess().getHyphenMinusKeyword_0()); 
            // InternalSecurityDsl.g:2249:2: ( '-' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==60) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSecurityDsl.g:2249:3: '-'
                    {
                    match(input,60,FOLLOW_2); 

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
    // InternalSecurityDsl.g:2257:1: rule__ELongObject__Group__1 : rule__ELongObject__Group__1__Impl ;
    public final void rule__ELongObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2261:1: ( rule__ELongObject__Group__1__Impl )
            // InternalSecurityDsl.g:2262:2: rule__ELongObject__Group__1__Impl
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
    // InternalSecurityDsl.g:2268:1: rule__ELongObject__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__ELongObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2272:1: ( ( RULE_INT ) )
            // InternalSecurityDsl.g:2273:1: ( RULE_INT )
            {
            // InternalSecurityDsl.g:2273:1: ( RULE_INT )
            // InternalSecurityDsl.g:2274:2: RULE_INT
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
    // InternalSecurityDsl.g:2284:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2288:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalSecurityDsl.g:2289:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalSecurityDsl.g:2296:1: rule__Attribute__Group__0__Impl : ( '{' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2300:1: ( ( '{' ) )
            // InternalSecurityDsl.g:2301:1: ( '{' )
            {
            // InternalSecurityDsl.g:2301:1: ( '{' )
            // InternalSecurityDsl.g:2302:2: '{'
            {
             before(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2311:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2315:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalSecurityDsl.g:2316:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalSecurityDsl.g:2323:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__IdentifierAssignment_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2327:1: ( ( ( rule__Attribute__IdentifierAssignment_1 )? ) )
            // InternalSecurityDsl.g:2328:1: ( ( rule__Attribute__IdentifierAssignment_1 )? )
            {
            // InternalSecurityDsl.g:2328:1: ( ( rule__Attribute__IdentifierAssignment_1 )? )
            // InternalSecurityDsl.g:2329:2: ( rule__Attribute__IdentifierAssignment_1 )?
            {
             before(grammarAccess.getAttributeAccess().getIdentifierAssignment_1()); 
            // InternalSecurityDsl.g:2330:2: ( rule__Attribute__IdentifierAssignment_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==94) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSecurityDsl.g:2330:3: rule__Attribute__IdentifierAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__IdentifierAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getIdentifierAssignment_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:2338:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2342:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalSecurityDsl.g:2343:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalSecurityDsl.g:2350:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__CredentialAssignment_2 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2354:1: ( ( ( rule__Attribute__CredentialAssignment_2 )? ) )
            // InternalSecurityDsl.g:2355:1: ( ( rule__Attribute__CredentialAssignment_2 )? )
            {
            // InternalSecurityDsl.g:2355:1: ( ( rule__Attribute__CredentialAssignment_2 )? )
            // InternalSecurityDsl.g:2356:2: ( rule__Attribute__CredentialAssignment_2 )?
            {
             before(grammarAccess.getAttributeAccess().getCredentialAssignment_2()); 
            // InternalSecurityDsl.g:2357:2: ( rule__Attribute__CredentialAssignment_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==95) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSecurityDsl.g:2357:3: rule__Attribute__CredentialAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__CredentialAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getCredentialAssignment_2()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:2365:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2369:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalSecurityDsl.g:2370:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalSecurityDsl.g:2377:1: rule__Attribute__Group__3__Impl : ( 'name:' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2381:1: ( ( 'name:' ) )
            // InternalSecurityDsl.g:2382:1: ( 'name:' )
            {
            // InternalSecurityDsl.g:2382:1: ( 'name:' )
            // InternalSecurityDsl.g:2383:2: 'name:'
            {
             before(grammarAccess.getAttributeAccess().getNameKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameKeyword_3()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:2392:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2396:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalSecurityDsl.g:2397:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalSecurityDsl.g:2404:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__NameAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2408:1: ( ( ( rule__Attribute__NameAssignment_4 ) ) )
            // InternalSecurityDsl.g:2409:1: ( ( rule__Attribute__NameAssignment_4 ) )
            {
            // InternalSecurityDsl.g:2409:1: ( ( rule__Attribute__NameAssignment_4 ) )
            // InternalSecurityDsl.g:2410:2: ( rule__Attribute__NameAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_4()); 
            // InternalSecurityDsl.g:2411:2: ( rule__Attribute__NameAssignment_4 )
            // InternalSecurityDsl.g:2411:3: rule__Attribute__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_4()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:2419:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2423:1: ( rule__Attribute__Group__5__Impl rule__Attribute__Group__6 )
            // InternalSecurityDsl.g:2424:2: rule__Attribute__Group__5__Impl rule__Attribute__Group__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalSecurityDsl.g:2431:1: rule__Attribute__Group__5__Impl : ( 'type:' ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2435:1: ( ( 'type:' ) )
            // InternalSecurityDsl.g:2436:1: ( 'type:' )
            {
            // InternalSecurityDsl.g:2436:1: ( 'type:' )
            // InternalSecurityDsl.g:2437:2: 'type:'
            {
             before(grammarAccess.getAttributeAccess().getTypeKeyword_5()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getTypeKeyword_5()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:2446:1: rule__Attribute__Group__6 : rule__Attribute__Group__6__Impl rule__Attribute__Group__7 ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2450:1: ( rule__Attribute__Group__6__Impl rule__Attribute__Group__7 )
            // InternalSecurityDsl.g:2451:2: rule__Attribute__Group__6__Impl rule__Attribute__Group__7
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
    // InternalSecurityDsl.g:2458:1: rule__Attribute__Group__6__Impl : ( ( rule__Attribute__TypeAssignment_6 ) ) ;
    public final void rule__Attribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2462:1: ( ( ( rule__Attribute__TypeAssignment_6 ) ) )
            // InternalSecurityDsl.g:2463:1: ( ( rule__Attribute__TypeAssignment_6 ) )
            {
            // InternalSecurityDsl.g:2463:1: ( ( rule__Attribute__TypeAssignment_6 ) )
            // InternalSecurityDsl.g:2464:2: ( rule__Attribute__TypeAssignment_6 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_6()); 
            // InternalSecurityDsl.g:2465:2: ( rule__Attribute__TypeAssignment_6 )
            // InternalSecurityDsl.g:2465:3: rule__Attribute__TypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_6()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:2473:1: rule__Attribute__Group__7 : rule__Attribute__Group__7__Impl rule__Attribute__Group__8 ;
    public final void rule__Attribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2477:1: ( rule__Attribute__Group__7__Impl rule__Attribute__Group__8 )
            // InternalSecurityDsl.g:2478:2: rule__Attribute__Group__7__Impl rule__Attribute__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__Attribute__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__8();

            state._fsp--;


            }

        }
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
    // InternalSecurityDsl.g:2485:1: rule__Attribute__Group__7__Impl : ( ( rule__Attribute__Group_7__0 )? ) ;
    public final void rule__Attribute__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2489:1: ( ( ( rule__Attribute__Group_7__0 )? ) )
            // InternalSecurityDsl.g:2490:1: ( ( rule__Attribute__Group_7__0 )? )
            {
            // InternalSecurityDsl.g:2490:1: ( ( rule__Attribute__Group_7__0 )? )
            // InternalSecurityDsl.g:2491:2: ( rule__Attribute__Group_7__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_7()); 
            // InternalSecurityDsl.g:2492:2: ( rule__Attribute__Group_7__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==64) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSecurityDsl.g:2492:3: rule__Attribute__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__Attribute__Group__8"
    // InternalSecurityDsl.g:2500:1: rule__Attribute__Group__8 : rule__Attribute__Group__8__Impl ;
    public final void rule__Attribute__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2504:1: ( rule__Attribute__Group__8__Impl )
            // InternalSecurityDsl.g:2505:2: rule__Attribute__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__8"


    // $ANTLR start "rule__Attribute__Group__8__Impl"
    // InternalSecurityDsl.g:2511:1: rule__Attribute__Group__8__Impl : ( '}' ) ;
    public final void rule__Attribute__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2515:1: ( ( '}' ) )
            // InternalSecurityDsl.g:2516:1: ( '}' )
            {
            // InternalSecurityDsl.g:2516:1: ( '}' )
            // InternalSecurityDsl.g:2517:2: '}'
            {
             before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_8()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__8__Impl"


    // $ANTLR start "rule__Attribute__Group_7__0"
    // InternalSecurityDsl.g:2527:1: rule__Attribute__Group_7__0 : rule__Attribute__Group_7__0__Impl rule__Attribute__Group_7__1 ;
    public final void rule__Attribute__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2531:1: ( rule__Attribute__Group_7__0__Impl rule__Attribute__Group_7__1 )
            // InternalSecurityDsl.g:2532:2: rule__Attribute__Group_7__0__Impl rule__Attribute__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__Attribute__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_7__0"


    // $ANTLR start "rule__Attribute__Group_7__0__Impl"
    // InternalSecurityDsl.g:2539:1: rule__Attribute__Group_7__0__Impl : ( 'collumnName:' ) ;
    public final void rule__Attribute__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2543:1: ( ( 'collumnName:' ) )
            // InternalSecurityDsl.g:2544:1: ( 'collumnName:' )
            {
            // InternalSecurityDsl.g:2544:1: ( 'collumnName:' )
            // InternalSecurityDsl.g:2545:2: 'collumnName:'
            {
             before(grammarAccess.getAttributeAccess().getCollumnNameKeyword_7_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getCollumnNameKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_7__0__Impl"


    // $ANTLR start "rule__Attribute__Group_7__1"
    // InternalSecurityDsl.g:2554:1: rule__Attribute__Group_7__1 : rule__Attribute__Group_7__1__Impl ;
    public final void rule__Attribute__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2558:1: ( rule__Attribute__Group_7__1__Impl )
            // InternalSecurityDsl.g:2559:2: rule__Attribute__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_7__1"


    // $ANTLR start "rule__Attribute__Group_7__1__Impl"
    // InternalSecurityDsl.g:2565:1: rule__Attribute__Group_7__1__Impl : ( ( rule__Attribute__CollumnNameAssignment_7_1 ) ) ;
    public final void rule__Attribute__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2569:1: ( ( ( rule__Attribute__CollumnNameAssignment_7_1 ) ) )
            // InternalSecurityDsl.g:2570:1: ( ( rule__Attribute__CollumnNameAssignment_7_1 ) )
            {
            // InternalSecurityDsl.g:2570:1: ( ( rule__Attribute__CollumnNameAssignment_7_1 ) )
            // InternalSecurityDsl.g:2571:2: ( rule__Attribute__CollumnNameAssignment_7_1 )
            {
             before(grammarAccess.getAttributeAccess().getCollumnNameAssignment_7_1()); 
            // InternalSecurityDsl.g:2572:2: ( rule__Attribute__CollumnNameAssignment_7_1 )
            // InternalSecurityDsl.g:2572:3: rule__Attribute__CollumnNameAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__CollumnNameAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getCollumnNameAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_7__1__Impl"


    // $ANTLR start "rule__Role__Group__0"
    // InternalSecurityDsl.g:2581:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2585:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // InternalSecurityDsl.g:2586:2: rule__Role__Group__0__Impl rule__Role__Group__1
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
    // InternalSecurityDsl.g:2593:1: rule__Role__Group__0__Impl : ( () ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2597:1: ( ( () ) )
            // InternalSecurityDsl.g:2598:1: ( () )
            {
            // InternalSecurityDsl.g:2598:1: ( () )
            // InternalSecurityDsl.g:2599:2: ()
            {
             before(grammarAccess.getRoleAccess().getRoleAction_0()); 
            // InternalSecurityDsl.g:2600:2: ()
            // InternalSecurityDsl.g:2600:3: 
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
    // InternalSecurityDsl.g:2608:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2612:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // InternalSecurityDsl.g:2613:2: rule__Role__Group__1__Impl rule__Role__Group__2
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
    // InternalSecurityDsl.g:2620:1: rule__Role__Group__1__Impl : ( ( rule__Role__Group_1__0 )? ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2624:1: ( ( ( rule__Role__Group_1__0 )? ) )
            // InternalSecurityDsl.g:2625:1: ( ( rule__Role__Group_1__0 )? )
            {
            // InternalSecurityDsl.g:2625:1: ( ( rule__Role__Group_1__0 )? )
            // InternalSecurityDsl.g:2626:2: ( rule__Role__Group_1__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_1()); 
            // InternalSecurityDsl.g:2627:2: ( rule__Role__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==65) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSecurityDsl.g:2627:3: rule__Role__Group_1__0
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
    // InternalSecurityDsl.g:2635:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2639:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // InternalSecurityDsl.g:2640:2: rule__Role__Group__2__Impl rule__Role__Group__3
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
    // InternalSecurityDsl.g:2647:1: rule__Role__Group__2__Impl : ( ( rule__Role__Group_2__0 )? ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2651:1: ( ( ( rule__Role__Group_2__0 )? ) )
            // InternalSecurityDsl.g:2652:1: ( ( rule__Role__Group_2__0 )? )
            {
            // InternalSecurityDsl.g:2652:1: ( ( rule__Role__Group_2__0 )? )
            // InternalSecurityDsl.g:2653:2: ( rule__Role__Group_2__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_2()); 
            // InternalSecurityDsl.g:2654:2: ( rule__Role__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==66) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSecurityDsl.g:2654:3: rule__Role__Group_2__0
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
    // InternalSecurityDsl.g:2662:1: rule__Role__Group__3 : rule__Role__Group__3__Impl ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2666:1: ( rule__Role__Group__3__Impl )
            // InternalSecurityDsl.g:2667:2: rule__Role__Group__3__Impl
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
    // InternalSecurityDsl.g:2673:1: rule__Role__Group__3__Impl : ( ( rule__Role__Group_3__0 )? ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2677:1: ( ( ( rule__Role__Group_3__0 )? ) )
            // InternalSecurityDsl.g:2678:1: ( ( rule__Role__Group_3__0 )? )
            {
            // InternalSecurityDsl.g:2678:1: ( ( rule__Role__Group_3__0 )? )
            // InternalSecurityDsl.g:2679:2: ( rule__Role__Group_3__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_3()); 
            // InternalSecurityDsl.g:2680:2: ( rule__Role__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==70) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSecurityDsl.g:2680:3: rule__Role__Group_3__0
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
    // InternalSecurityDsl.g:2689:1: rule__Role__Group_1__0 : rule__Role__Group_1__0__Impl rule__Role__Group_1__1 ;
    public final void rule__Role__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2693:1: ( rule__Role__Group_1__0__Impl rule__Role__Group_1__1 )
            // InternalSecurityDsl.g:2694:2: rule__Role__Group_1__0__Impl rule__Role__Group_1__1
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
    // InternalSecurityDsl.g:2701:1: rule__Role__Group_1__0__Impl : ( 'tableName:' ) ;
    public final void rule__Role__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2705:1: ( ( 'tableName:' ) )
            // InternalSecurityDsl.g:2706:1: ( 'tableName:' )
            {
            // InternalSecurityDsl.g:2706:1: ( 'tableName:' )
            // InternalSecurityDsl.g:2707:2: 'tableName:'
            {
             before(grammarAccess.getRoleAccess().getTableNameKeyword_1_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2716:1: rule__Role__Group_1__1 : rule__Role__Group_1__1__Impl ;
    public final void rule__Role__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2720:1: ( rule__Role__Group_1__1__Impl )
            // InternalSecurityDsl.g:2721:2: rule__Role__Group_1__1__Impl
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
    // InternalSecurityDsl.g:2727:1: rule__Role__Group_1__1__Impl : ( ( rule__Role__TableNameAssignment_1_1 ) ) ;
    public final void rule__Role__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2731:1: ( ( ( rule__Role__TableNameAssignment_1_1 ) ) )
            // InternalSecurityDsl.g:2732:1: ( ( rule__Role__TableNameAssignment_1_1 ) )
            {
            // InternalSecurityDsl.g:2732:1: ( ( rule__Role__TableNameAssignment_1_1 ) )
            // InternalSecurityDsl.g:2733:2: ( rule__Role__TableNameAssignment_1_1 )
            {
             before(grammarAccess.getRoleAccess().getTableNameAssignment_1_1()); 
            // InternalSecurityDsl.g:2734:2: ( rule__Role__TableNameAssignment_1_1 )
            // InternalSecurityDsl.g:2734:3: rule__Role__TableNameAssignment_1_1
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
    // InternalSecurityDsl.g:2743:1: rule__Role__Group_2__0 : rule__Role__Group_2__0__Impl rule__Role__Group_2__1 ;
    public final void rule__Role__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2747:1: ( rule__Role__Group_2__0__Impl rule__Role__Group_2__1 )
            // InternalSecurityDsl.g:2748:2: rule__Role__Group_2__0__Impl rule__Role__Group_2__1
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
    // InternalSecurityDsl.g:2755:1: rule__Role__Group_2__0__Impl : ( 'attributes:' ) ;
    public final void rule__Role__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2759:1: ( ( 'attributes:' ) )
            // InternalSecurityDsl.g:2760:1: ( 'attributes:' )
            {
            // InternalSecurityDsl.g:2760:1: ( 'attributes:' )
            // InternalSecurityDsl.g:2761:2: 'attributes:'
            {
             before(grammarAccess.getRoleAccess().getAttributesKeyword_2_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2770:1: rule__Role__Group_2__1 : rule__Role__Group_2__1__Impl rule__Role__Group_2__2 ;
    public final void rule__Role__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2774:1: ( rule__Role__Group_2__1__Impl rule__Role__Group_2__2 )
            // InternalSecurityDsl.g:2775:2: rule__Role__Group_2__1__Impl rule__Role__Group_2__2
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
    // InternalSecurityDsl.g:2782:1: rule__Role__Group_2__1__Impl : ( '[' ) ;
    public final void rule__Role__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2786:1: ( ( '[' ) )
            // InternalSecurityDsl.g:2787:1: ( '[' )
            {
            // InternalSecurityDsl.g:2787:1: ( '[' )
            // InternalSecurityDsl.g:2788:2: '['
            {
             before(grammarAccess.getRoleAccess().getLeftSquareBracketKeyword_2_1()); 
            match(input,67,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2797:1: rule__Role__Group_2__2 : rule__Role__Group_2__2__Impl rule__Role__Group_2__3 ;
    public final void rule__Role__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2801:1: ( rule__Role__Group_2__2__Impl rule__Role__Group_2__3 )
            // InternalSecurityDsl.g:2802:2: rule__Role__Group_2__2__Impl rule__Role__Group_2__3
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
    // InternalSecurityDsl.g:2809:1: rule__Role__Group_2__2__Impl : ( ( rule__Role__Model_attributesAssignment_2_2 ) ) ;
    public final void rule__Role__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2813:1: ( ( ( rule__Role__Model_attributesAssignment_2_2 ) ) )
            // InternalSecurityDsl.g:2814:1: ( ( rule__Role__Model_attributesAssignment_2_2 ) )
            {
            // InternalSecurityDsl.g:2814:1: ( ( rule__Role__Model_attributesAssignment_2_2 ) )
            // InternalSecurityDsl.g:2815:2: ( rule__Role__Model_attributesAssignment_2_2 )
            {
             before(grammarAccess.getRoleAccess().getModel_attributesAssignment_2_2()); 
            // InternalSecurityDsl.g:2816:2: ( rule__Role__Model_attributesAssignment_2_2 )
            // InternalSecurityDsl.g:2816:3: rule__Role__Model_attributesAssignment_2_2
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
    // InternalSecurityDsl.g:2824:1: rule__Role__Group_2__3 : rule__Role__Group_2__3__Impl rule__Role__Group_2__4 ;
    public final void rule__Role__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2828:1: ( rule__Role__Group_2__3__Impl rule__Role__Group_2__4 )
            // InternalSecurityDsl.g:2829:2: rule__Role__Group_2__3__Impl rule__Role__Group_2__4
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
    // InternalSecurityDsl.g:2836:1: rule__Role__Group_2__3__Impl : ( ( rule__Role__Group_2_3__0 )* ) ;
    public final void rule__Role__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2840:1: ( ( ( rule__Role__Group_2_3__0 )* ) )
            // InternalSecurityDsl.g:2841:1: ( ( rule__Role__Group_2_3__0 )* )
            {
            // InternalSecurityDsl.g:2841:1: ( ( rule__Role__Group_2_3__0 )* )
            // InternalSecurityDsl.g:2842:2: ( rule__Role__Group_2_3__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_2_3()); 
            // InternalSecurityDsl.g:2843:2: ( rule__Role__Group_2_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==69) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSecurityDsl.g:2843:3: rule__Role__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Role__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalSecurityDsl.g:2851:1: rule__Role__Group_2__4 : rule__Role__Group_2__4__Impl ;
    public final void rule__Role__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2855:1: ( rule__Role__Group_2__4__Impl )
            // InternalSecurityDsl.g:2856:2: rule__Role__Group_2__4__Impl
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
    // InternalSecurityDsl.g:2862:1: rule__Role__Group_2__4__Impl : ( ']' ) ;
    public final void rule__Role__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2866:1: ( ( ']' ) )
            // InternalSecurityDsl.g:2867:1: ( ']' )
            {
            // InternalSecurityDsl.g:2867:1: ( ']' )
            // InternalSecurityDsl.g:2868:2: ']'
            {
             before(grammarAccess.getRoleAccess().getRightSquareBracketKeyword_2_4()); 
            match(input,68,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2878:1: rule__Role__Group_2_3__0 : rule__Role__Group_2_3__0__Impl rule__Role__Group_2_3__1 ;
    public final void rule__Role__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2882:1: ( rule__Role__Group_2_3__0__Impl rule__Role__Group_2_3__1 )
            // InternalSecurityDsl.g:2883:2: rule__Role__Group_2_3__0__Impl rule__Role__Group_2_3__1
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
    // InternalSecurityDsl.g:2890:1: rule__Role__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__Role__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2894:1: ( ( ',' ) )
            // InternalSecurityDsl.g:2895:1: ( ',' )
            {
            // InternalSecurityDsl.g:2895:1: ( ',' )
            // InternalSecurityDsl.g:2896:2: ','
            {
             before(grammarAccess.getRoleAccess().getCommaKeyword_2_3_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2905:1: rule__Role__Group_2_3__1 : rule__Role__Group_2_3__1__Impl ;
    public final void rule__Role__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2909:1: ( rule__Role__Group_2_3__1__Impl )
            // InternalSecurityDsl.g:2910:2: rule__Role__Group_2_3__1__Impl
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
    // InternalSecurityDsl.g:2916:1: rule__Role__Group_2_3__1__Impl : ( ( rule__Role__Model_attributesAssignment_2_3_1 ) ) ;
    public final void rule__Role__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2920:1: ( ( ( rule__Role__Model_attributesAssignment_2_3_1 ) ) )
            // InternalSecurityDsl.g:2921:1: ( ( rule__Role__Model_attributesAssignment_2_3_1 ) )
            {
            // InternalSecurityDsl.g:2921:1: ( ( rule__Role__Model_attributesAssignment_2_3_1 ) )
            // InternalSecurityDsl.g:2922:2: ( rule__Role__Model_attributesAssignment_2_3_1 )
            {
             before(grammarAccess.getRoleAccess().getModel_attributesAssignment_2_3_1()); 
            // InternalSecurityDsl.g:2923:2: ( rule__Role__Model_attributesAssignment_2_3_1 )
            // InternalSecurityDsl.g:2923:3: rule__Role__Model_attributesAssignment_2_3_1
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
    // InternalSecurityDsl.g:2932:1: rule__Role__Group_3__0 : rule__Role__Group_3__0__Impl rule__Role__Group_3__1 ;
    public final void rule__Role__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2936:1: ( rule__Role__Group_3__0__Impl rule__Role__Group_3__1 )
            // InternalSecurityDsl.g:2937:2: rule__Role__Group_3__0__Impl rule__Role__Group_3__1
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
    // InternalSecurityDsl.g:2944:1: rule__Role__Group_3__0__Impl : ( 'roles:' ) ;
    public final void rule__Role__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2948:1: ( ( 'roles:' ) )
            // InternalSecurityDsl.g:2949:1: ( 'roles:' )
            {
            // InternalSecurityDsl.g:2949:1: ( 'roles:' )
            // InternalSecurityDsl.g:2950:2: 'roles:'
            {
             before(grammarAccess.getRoleAccess().getRolesKeyword_3_0()); 
            match(input,70,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2959:1: rule__Role__Group_3__1 : rule__Role__Group_3__1__Impl rule__Role__Group_3__2 ;
    public final void rule__Role__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2963:1: ( rule__Role__Group_3__1__Impl rule__Role__Group_3__2 )
            // InternalSecurityDsl.g:2964:2: rule__Role__Group_3__1__Impl rule__Role__Group_3__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalSecurityDsl.g:2971:1: rule__Role__Group_3__1__Impl : ( '[' ) ;
    public final void rule__Role__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2975:1: ( ( '[' ) )
            // InternalSecurityDsl.g:2976:1: ( '[' )
            {
            // InternalSecurityDsl.g:2976:1: ( '[' )
            // InternalSecurityDsl.g:2977:2: '['
            {
             before(grammarAccess.getRoleAccess().getLeftSquareBracketKeyword_3_1()); 
            match(input,67,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2986:1: rule__Role__Group_3__2 : rule__Role__Group_3__2__Impl rule__Role__Group_3__3 ;
    public final void rule__Role__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2990:1: ( rule__Role__Group_3__2__Impl rule__Role__Group_3__3 )
            // InternalSecurityDsl.g:2991:2: rule__Role__Group_3__2__Impl rule__Role__Group_3__3
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
    // InternalSecurityDsl.g:2998:1: rule__Role__Group_3__2__Impl : ( ( rule__Role__Role_instancesAssignment_3_2 ) ) ;
    public final void rule__Role__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3002:1: ( ( ( rule__Role__Role_instancesAssignment_3_2 ) ) )
            // InternalSecurityDsl.g:3003:1: ( ( rule__Role__Role_instancesAssignment_3_2 ) )
            {
            // InternalSecurityDsl.g:3003:1: ( ( rule__Role__Role_instancesAssignment_3_2 ) )
            // InternalSecurityDsl.g:3004:2: ( rule__Role__Role_instancesAssignment_3_2 )
            {
             before(grammarAccess.getRoleAccess().getRole_instancesAssignment_3_2()); 
            // InternalSecurityDsl.g:3005:2: ( rule__Role__Role_instancesAssignment_3_2 )
            // InternalSecurityDsl.g:3005:3: rule__Role__Role_instancesAssignment_3_2
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
    // InternalSecurityDsl.g:3013:1: rule__Role__Group_3__3 : rule__Role__Group_3__3__Impl rule__Role__Group_3__4 ;
    public final void rule__Role__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3017:1: ( rule__Role__Group_3__3__Impl rule__Role__Group_3__4 )
            // InternalSecurityDsl.g:3018:2: rule__Role__Group_3__3__Impl rule__Role__Group_3__4
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
    // InternalSecurityDsl.g:3025:1: rule__Role__Group_3__3__Impl : ( ( rule__Role__Group_3_3__0 )* ) ;
    public final void rule__Role__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3029:1: ( ( ( rule__Role__Group_3_3__0 )* ) )
            // InternalSecurityDsl.g:3030:1: ( ( rule__Role__Group_3_3__0 )* )
            {
            // InternalSecurityDsl.g:3030:1: ( ( rule__Role__Group_3_3__0 )* )
            // InternalSecurityDsl.g:3031:2: ( rule__Role__Group_3_3__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_3_3()); 
            // InternalSecurityDsl.g:3032:2: ( rule__Role__Group_3_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==69) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalSecurityDsl.g:3032:3: rule__Role__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Role__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalSecurityDsl.g:3040:1: rule__Role__Group_3__4 : rule__Role__Group_3__4__Impl ;
    public final void rule__Role__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3044:1: ( rule__Role__Group_3__4__Impl )
            // InternalSecurityDsl.g:3045:2: rule__Role__Group_3__4__Impl
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
    // InternalSecurityDsl.g:3051:1: rule__Role__Group_3__4__Impl : ( ']' ) ;
    public final void rule__Role__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3055:1: ( ( ']' ) )
            // InternalSecurityDsl.g:3056:1: ( ']' )
            {
            // InternalSecurityDsl.g:3056:1: ( ']' )
            // InternalSecurityDsl.g:3057:2: ']'
            {
             before(grammarAccess.getRoleAccess().getRightSquareBracketKeyword_3_4()); 
            match(input,68,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3067:1: rule__Role__Group_3_3__0 : rule__Role__Group_3_3__0__Impl rule__Role__Group_3_3__1 ;
    public final void rule__Role__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3071:1: ( rule__Role__Group_3_3__0__Impl rule__Role__Group_3_3__1 )
            // InternalSecurityDsl.g:3072:2: rule__Role__Group_3_3__0__Impl rule__Role__Group_3_3__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalSecurityDsl.g:3079:1: rule__Role__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Role__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3083:1: ( ( ',' ) )
            // InternalSecurityDsl.g:3084:1: ( ',' )
            {
            // InternalSecurityDsl.g:3084:1: ( ',' )
            // InternalSecurityDsl.g:3085:2: ','
            {
             before(grammarAccess.getRoleAccess().getCommaKeyword_3_3_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3094:1: rule__Role__Group_3_3__1 : rule__Role__Group_3_3__1__Impl ;
    public final void rule__Role__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3098:1: ( rule__Role__Group_3_3__1__Impl )
            // InternalSecurityDsl.g:3099:2: rule__Role__Group_3_3__1__Impl
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
    // InternalSecurityDsl.g:3105:1: rule__Role__Group_3_3__1__Impl : ( ( rule__Role__Role_instancesAssignment_3_3_1 ) ) ;
    public final void rule__Role__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3109:1: ( ( ( rule__Role__Role_instancesAssignment_3_3_1 ) ) )
            // InternalSecurityDsl.g:3110:1: ( ( rule__Role__Role_instancesAssignment_3_3_1 ) )
            {
            // InternalSecurityDsl.g:3110:1: ( ( rule__Role__Role_instancesAssignment_3_3_1 ) )
            // InternalSecurityDsl.g:3111:2: ( rule__Role__Role_instancesAssignment_3_3_1 )
            {
             before(grammarAccess.getRoleAccess().getRole_instancesAssignment_3_3_1()); 
            // InternalSecurityDsl.g:3112:2: ( rule__Role__Role_instancesAssignment_3_3_1 )
            // InternalSecurityDsl.g:3112:3: rule__Role__Role_instancesAssignment_3_3_1
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
    // InternalSecurityDsl.g:3121:1: rule__User__Group__0 : rule__User__Group__0__Impl rule__User__Group__1 ;
    public final void rule__User__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3125:1: ( rule__User__Group__0__Impl rule__User__Group__1 )
            // InternalSecurityDsl.g:3126:2: rule__User__Group__0__Impl rule__User__Group__1
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
    // InternalSecurityDsl.g:3133:1: rule__User__Group__0__Impl : ( () ) ;
    public final void rule__User__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3137:1: ( ( () ) )
            // InternalSecurityDsl.g:3138:1: ( () )
            {
            // InternalSecurityDsl.g:3138:1: ( () )
            // InternalSecurityDsl.g:3139:2: ()
            {
             before(grammarAccess.getUserAccess().getUserAction_0()); 
            // InternalSecurityDsl.g:3140:2: ()
            // InternalSecurityDsl.g:3140:3: 
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
    // InternalSecurityDsl.g:3148:1: rule__User__Group__1 : rule__User__Group__1__Impl rule__User__Group__2 ;
    public final void rule__User__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3152:1: ( rule__User__Group__1__Impl rule__User__Group__2 )
            // InternalSecurityDsl.g:3153:2: rule__User__Group__1__Impl rule__User__Group__2
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
    // InternalSecurityDsl.g:3160:1: rule__User__Group__1__Impl : ( ( rule__User__Group_1__0 )? ) ;
    public final void rule__User__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3164:1: ( ( ( rule__User__Group_1__0 )? ) )
            // InternalSecurityDsl.g:3165:1: ( ( rule__User__Group_1__0 )? )
            {
            // InternalSecurityDsl.g:3165:1: ( ( rule__User__Group_1__0 )? )
            // InternalSecurityDsl.g:3166:2: ( rule__User__Group_1__0 )?
            {
             before(grammarAccess.getUserAccess().getGroup_1()); 
            // InternalSecurityDsl.g:3167:2: ( rule__User__Group_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==65) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSecurityDsl.g:3167:3: rule__User__Group_1__0
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
    // InternalSecurityDsl.g:3175:1: rule__User__Group__2 : rule__User__Group__2__Impl ;
    public final void rule__User__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3179:1: ( rule__User__Group__2__Impl )
            // InternalSecurityDsl.g:3180:2: rule__User__Group__2__Impl
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
    // InternalSecurityDsl.g:3186:1: rule__User__Group__2__Impl : ( ( rule__User__Group_2__0 )? ) ;
    public final void rule__User__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3190:1: ( ( ( rule__User__Group_2__0 )? ) )
            // InternalSecurityDsl.g:3191:1: ( ( rule__User__Group_2__0 )? )
            {
            // InternalSecurityDsl.g:3191:1: ( ( rule__User__Group_2__0 )? )
            // InternalSecurityDsl.g:3192:2: ( rule__User__Group_2__0 )?
            {
             before(grammarAccess.getUserAccess().getGroup_2()); 
            // InternalSecurityDsl.g:3193:2: ( rule__User__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==66) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSecurityDsl.g:3193:3: rule__User__Group_2__0
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
    // InternalSecurityDsl.g:3202:1: rule__User__Group_1__0 : rule__User__Group_1__0__Impl rule__User__Group_1__1 ;
    public final void rule__User__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3206:1: ( rule__User__Group_1__0__Impl rule__User__Group_1__1 )
            // InternalSecurityDsl.g:3207:2: rule__User__Group_1__0__Impl rule__User__Group_1__1
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
    // InternalSecurityDsl.g:3214:1: rule__User__Group_1__0__Impl : ( 'tableName:' ) ;
    public final void rule__User__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3218:1: ( ( 'tableName:' ) )
            // InternalSecurityDsl.g:3219:1: ( 'tableName:' )
            {
            // InternalSecurityDsl.g:3219:1: ( 'tableName:' )
            // InternalSecurityDsl.g:3220:2: 'tableName:'
            {
             before(grammarAccess.getUserAccess().getTableNameKeyword_1_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3229:1: rule__User__Group_1__1 : rule__User__Group_1__1__Impl ;
    public final void rule__User__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3233:1: ( rule__User__Group_1__1__Impl )
            // InternalSecurityDsl.g:3234:2: rule__User__Group_1__1__Impl
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
    // InternalSecurityDsl.g:3240:1: rule__User__Group_1__1__Impl : ( ( rule__User__TableNameAssignment_1_1 ) ) ;
    public final void rule__User__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3244:1: ( ( ( rule__User__TableNameAssignment_1_1 ) ) )
            // InternalSecurityDsl.g:3245:1: ( ( rule__User__TableNameAssignment_1_1 ) )
            {
            // InternalSecurityDsl.g:3245:1: ( ( rule__User__TableNameAssignment_1_1 ) )
            // InternalSecurityDsl.g:3246:2: ( rule__User__TableNameAssignment_1_1 )
            {
             before(grammarAccess.getUserAccess().getTableNameAssignment_1_1()); 
            // InternalSecurityDsl.g:3247:2: ( rule__User__TableNameAssignment_1_1 )
            // InternalSecurityDsl.g:3247:3: rule__User__TableNameAssignment_1_1
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
    // InternalSecurityDsl.g:3256:1: rule__User__Group_2__0 : rule__User__Group_2__0__Impl rule__User__Group_2__1 ;
    public final void rule__User__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3260:1: ( rule__User__Group_2__0__Impl rule__User__Group_2__1 )
            // InternalSecurityDsl.g:3261:2: rule__User__Group_2__0__Impl rule__User__Group_2__1
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
    // InternalSecurityDsl.g:3268:1: rule__User__Group_2__0__Impl : ( 'attributes:' ) ;
    public final void rule__User__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3272:1: ( ( 'attributes:' ) )
            // InternalSecurityDsl.g:3273:1: ( 'attributes:' )
            {
            // InternalSecurityDsl.g:3273:1: ( 'attributes:' )
            // InternalSecurityDsl.g:3274:2: 'attributes:'
            {
             before(grammarAccess.getUserAccess().getAttributesKeyword_2_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3283:1: rule__User__Group_2__1 : rule__User__Group_2__1__Impl rule__User__Group_2__2 ;
    public final void rule__User__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3287:1: ( rule__User__Group_2__1__Impl rule__User__Group_2__2 )
            // InternalSecurityDsl.g:3288:2: rule__User__Group_2__1__Impl rule__User__Group_2__2
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
    // InternalSecurityDsl.g:3295:1: rule__User__Group_2__1__Impl : ( '[' ) ;
    public final void rule__User__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3299:1: ( ( '[' ) )
            // InternalSecurityDsl.g:3300:1: ( '[' )
            {
            // InternalSecurityDsl.g:3300:1: ( '[' )
            // InternalSecurityDsl.g:3301:2: '['
            {
             before(grammarAccess.getUserAccess().getLeftSquareBracketKeyword_2_1()); 
            match(input,67,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3310:1: rule__User__Group_2__2 : rule__User__Group_2__2__Impl rule__User__Group_2__3 ;
    public final void rule__User__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3314:1: ( rule__User__Group_2__2__Impl rule__User__Group_2__3 )
            // InternalSecurityDsl.g:3315:2: rule__User__Group_2__2__Impl rule__User__Group_2__3
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
    // InternalSecurityDsl.g:3322:1: rule__User__Group_2__2__Impl : ( ( rule__User__Model_attributesAssignment_2_2 ) ) ;
    public final void rule__User__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3326:1: ( ( ( rule__User__Model_attributesAssignment_2_2 ) ) )
            // InternalSecurityDsl.g:3327:1: ( ( rule__User__Model_attributesAssignment_2_2 ) )
            {
            // InternalSecurityDsl.g:3327:1: ( ( rule__User__Model_attributesAssignment_2_2 ) )
            // InternalSecurityDsl.g:3328:2: ( rule__User__Model_attributesAssignment_2_2 )
            {
             before(grammarAccess.getUserAccess().getModel_attributesAssignment_2_2()); 
            // InternalSecurityDsl.g:3329:2: ( rule__User__Model_attributesAssignment_2_2 )
            // InternalSecurityDsl.g:3329:3: rule__User__Model_attributesAssignment_2_2
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
    // InternalSecurityDsl.g:3337:1: rule__User__Group_2__3 : rule__User__Group_2__3__Impl rule__User__Group_2__4 ;
    public final void rule__User__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3341:1: ( rule__User__Group_2__3__Impl rule__User__Group_2__4 )
            // InternalSecurityDsl.g:3342:2: rule__User__Group_2__3__Impl rule__User__Group_2__4
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
    // InternalSecurityDsl.g:3349:1: rule__User__Group_2__3__Impl : ( ( rule__User__Group_2_3__0 )* ) ;
    public final void rule__User__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3353:1: ( ( ( rule__User__Group_2_3__0 )* ) )
            // InternalSecurityDsl.g:3354:1: ( ( rule__User__Group_2_3__0 )* )
            {
            // InternalSecurityDsl.g:3354:1: ( ( rule__User__Group_2_3__0 )* )
            // InternalSecurityDsl.g:3355:2: ( rule__User__Group_2_3__0 )*
            {
             before(grammarAccess.getUserAccess().getGroup_2_3()); 
            // InternalSecurityDsl.g:3356:2: ( rule__User__Group_2_3__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==69) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalSecurityDsl.g:3356:3: rule__User__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__User__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalSecurityDsl.g:3364:1: rule__User__Group_2__4 : rule__User__Group_2__4__Impl ;
    public final void rule__User__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3368:1: ( rule__User__Group_2__4__Impl )
            // InternalSecurityDsl.g:3369:2: rule__User__Group_2__4__Impl
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
    // InternalSecurityDsl.g:3375:1: rule__User__Group_2__4__Impl : ( ']' ) ;
    public final void rule__User__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3379:1: ( ( ']' ) )
            // InternalSecurityDsl.g:3380:1: ( ']' )
            {
            // InternalSecurityDsl.g:3380:1: ( ']' )
            // InternalSecurityDsl.g:3381:2: ']'
            {
             before(grammarAccess.getUserAccess().getRightSquareBracketKeyword_2_4()); 
            match(input,68,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3391:1: rule__User__Group_2_3__0 : rule__User__Group_2_3__0__Impl rule__User__Group_2_3__1 ;
    public final void rule__User__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3395:1: ( rule__User__Group_2_3__0__Impl rule__User__Group_2_3__1 )
            // InternalSecurityDsl.g:3396:2: rule__User__Group_2_3__0__Impl rule__User__Group_2_3__1
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
    // InternalSecurityDsl.g:3403:1: rule__User__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__User__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3407:1: ( ( ',' ) )
            // InternalSecurityDsl.g:3408:1: ( ',' )
            {
            // InternalSecurityDsl.g:3408:1: ( ',' )
            // InternalSecurityDsl.g:3409:2: ','
            {
             before(grammarAccess.getUserAccess().getCommaKeyword_2_3_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3418:1: rule__User__Group_2_3__1 : rule__User__Group_2_3__1__Impl ;
    public final void rule__User__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3422:1: ( rule__User__Group_2_3__1__Impl )
            // InternalSecurityDsl.g:3423:2: rule__User__Group_2_3__1__Impl
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
    // InternalSecurityDsl.g:3429:1: rule__User__Group_2_3__1__Impl : ( ( rule__User__Model_attributesAssignment_2_3_1 ) ) ;
    public final void rule__User__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3433:1: ( ( ( rule__User__Model_attributesAssignment_2_3_1 ) ) )
            // InternalSecurityDsl.g:3434:1: ( ( rule__User__Model_attributesAssignment_2_3_1 ) )
            {
            // InternalSecurityDsl.g:3434:1: ( ( rule__User__Model_attributesAssignment_2_3_1 ) )
            // InternalSecurityDsl.g:3435:2: ( rule__User__Model_attributesAssignment_2_3_1 )
            {
             before(grammarAccess.getUserAccess().getModel_attributesAssignment_2_3_1()); 
            // InternalSecurityDsl.g:3436:2: ( rule__User__Model_attributesAssignment_2_3_1 )
            // InternalSecurityDsl.g:3436:3: rule__User__Model_attributesAssignment_2_3_1
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
    // InternalSecurityDsl.g:3445:1: rule__RoleInstance__Group__0 : rule__RoleInstance__Group__0__Impl rule__RoleInstance__Group__1 ;
    public final void rule__RoleInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3449:1: ( rule__RoleInstance__Group__0__Impl rule__RoleInstance__Group__1 )
            // InternalSecurityDsl.g:3450:2: rule__RoleInstance__Group__0__Impl rule__RoleInstance__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalSecurityDsl.g:3457:1: rule__RoleInstance__Group__0__Impl : ( () ) ;
    public final void rule__RoleInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3461:1: ( ( () ) )
            // InternalSecurityDsl.g:3462:1: ( () )
            {
            // InternalSecurityDsl.g:3462:1: ( () )
            // InternalSecurityDsl.g:3463:2: ()
            {
             before(grammarAccess.getRoleInstanceAccess().getRoleInstanceAction_0()); 
            // InternalSecurityDsl.g:3464:2: ()
            // InternalSecurityDsl.g:3464:3: 
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
    // InternalSecurityDsl.g:3472:1: rule__RoleInstance__Group__1 : rule__RoleInstance__Group__1__Impl rule__RoleInstance__Group__2 ;
    public final void rule__RoleInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3476:1: ( rule__RoleInstance__Group__1__Impl rule__RoleInstance__Group__2 )
            // InternalSecurityDsl.g:3477:2: rule__RoleInstance__Group__1__Impl rule__RoleInstance__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalSecurityDsl.g:3484:1: rule__RoleInstance__Group__1__Impl : ( ( rule__RoleInstance__ClientAssignment_1 )? ) ;
    public final void rule__RoleInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3488:1: ( ( ( rule__RoleInstance__ClientAssignment_1 )? ) )
            // InternalSecurityDsl.g:3489:1: ( ( rule__RoleInstance__ClientAssignment_1 )? )
            {
            // InternalSecurityDsl.g:3489:1: ( ( rule__RoleInstance__ClientAssignment_1 )? )
            // InternalSecurityDsl.g:3490:2: ( rule__RoleInstance__ClientAssignment_1 )?
            {
             before(grammarAccess.getRoleInstanceAccess().getClientAssignment_1()); 
            // InternalSecurityDsl.g:3491:2: ( rule__RoleInstance__ClientAssignment_1 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==96) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSecurityDsl.g:3491:3: rule__RoleInstance__ClientAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RoleInstance__ClientAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoleInstanceAccess().getClientAssignment_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3499:1: rule__RoleInstance__Group__2 : rule__RoleInstance__Group__2__Impl ;
    public final void rule__RoleInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3503:1: ( rule__RoleInstance__Group__2__Impl )
            // InternalSecurityDsl.g:3504:2: rule__RoleInstance__Group__2__Impl
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
    // InternalSecurityDsl.g:3510:1: rule__RoleInstance__Group__2__Impl : ( ( rule__RoleInstance__NameAssignment_2 ) ) ;
    public final void rule__RoleInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3514:1: ( ( ( rule__RoleInstance__NameAssignment_2 ) ) )
            // InternalSecurityDsl.g:3515:1: ( ( rule__RoleInstance__NameAssignment_2 ) )
            {
            // InternalSecurityDsl.g:3515:1: ( ( rule__RoleInstance__NameAssignment_2 ) )
            // InternalSecurityDsl.g:3516:2: ( rule__RoleInstance__NameAssignment_2 )
            {
             before(grammarAccess.getRoleInstanceAccess().getNameAssignment_2()); 
            // InternalSecurityDsl.g:3517:2: ( rule__RoleInstance__NameAssignment_2 )
            // InternalSecurityDsl.g:3517:3: rule__RoleInstance__NameAssignment_2
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
    // InternalSecurityDsl.g:3526:1: rule__Endpoint__Group__0 : rule__Endpoint__Group__0__Impl rule__Endpoint__Group__1 ;
    public final void rule__Endpoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3530:1: ( rule__Endpoint__Group__0__Impl rule__Endpoint__Group__1 )
            // InternalSecurityDsl.g:3531:2: rule__Endpoint__Group__0__Impl rule__Endpoint__Group__1
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
    // InternalSecurityDsl.g:3538:1: rule__Endpoint__Group__0__Impl : ( '{' ) ;
    public final void rule__Endpoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3542:1: ( ( '{' ) )
            // InternalSecurityDsl.g:3543:1: ( '{' )
            {
            // InternalSecurityDsl.g:3543:1: ( '{' )
            // InternalSecurityDsl.g:3544:2: '{'
            {
             before(grammarAccess.getEndpointAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3553:1: rule__Endpoint__Group__1 : rule__Endpoint__Group__1__Impl rule__Endpoint__Group__2 ;
    public final void rule__Endpoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3557:1: ( rule__Endpoint__Group__1__Impl rule__Endpoint__Group__2 )
            // InternalSecurityDsl.g:3558:2: rule__Endpoint__Group__1__Impl rule__Endpoint__Group__2
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
    // InternalSecurityDsl.g:3565:1: rule__Endpoint__Group__1__Impl : ( 'url:' ) ;
    public final void rule__Endpoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3569:1: ( ( 'url:' ) )
            // InternalSecurityDsl.g:3570:1: ( 'url:' )
            {
            // InternalSecurityDsl.g:3570:1: ( 'url:' )
            // InternalSecurityDsl.g:3571:2: 'url:'
            {
             before(grammarAccess.getEndpointAccess().getUrlKeyword_1()); 
            match(input,57,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3580:1: rule__Endpoint__Group__2 : rule__Endpoint__Group__2__Impl rule__Endpoint__Group__3 ;
    public final void rule__Endpoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3584:1: ( rule__Endpoint__Group__2__Impl rule__Endpoint__Group__3 )
            // InternalSecurityDsl.g:3585:2: rule__Endpoint__Group__2__Impl rule__Endpoint__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalSecurityDsl.g:3592:1: rule__Endpoint__Group__2__Impl : ( ( rule__Endpoint__UrlAssignment_2 ) ) ;
    public final void rule__Endpoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3596:1: ( ( ( rule__Endpoint__UrlAssignment_2 ) ) )
            // InternalSecurityDsl.g:3597:1: ( ( rule__Endpoint__UrlAssignment_2 ) )
            {
            // InternalSecurityDsl.g:3597:1: ( ( rule__Endpoint__UrlAssignment_2 ) )
            // InternalSecurityDsl.g:3598:2: ( rule__Endpoint__UrlAssignment_2 )
            {
             before(grammarAccess.getEndpointAccess().getUrlAssignment_2()); 
            // InternalSecurityDsl.g:3599:2: ( rule__Endpoint__UrlAssignment_2 )
            // InternalSecurityDsl.g:3599:3: rule__Endpoint__UrlAssignment_2
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
    // InternalSecurityDsl.g:3607:1: rule__Endpoint__Group__3 : rule__Endpoint__Group__3__Impl rule__Endpoint__Group__4 ;
    public final void rule__Endpoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3611:1: ( rule__Endpoint__Group__3__Impl rule__Endpoint__Group__4 )
            // InternalSecurityDsl.g:3612:2: rule__Endpoint__Group__3__Impl rule__Endpoint__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalSecurityDsl.g:3619:1: rule__Endpoint__Group__3__Impl : ( ( rule__Endpoint__Group_3__0 )? ) ;
    public final void rule__Endpoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3623:1: ( ( ( rule__Endpoint__Group_3__0 )? ) )
            // InternalSecurityDsl.g:3624:1: ( ( rule__Endpoint__Group_3__0 )? )
            {
            // InternalSecurityDsl.g:3624:1: ( ( rule__Endpoint__Group_3__0 )? )
            // InternalSecurityDsl.g:3625:2: ( rule__Endpoint__Group_3__0 )?
            {
             before(grammarAccess.getEndpointAccess().getGroup_3()); 
            // InternalSecurityDsl.g:3626:2: ( rule__Endpoint__Group_3__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==71) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSecurityDsl.g:3626:3: rule__Endpoint__Group_3__0
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
    // InternalSecurityDsl.g:3634:1: rule__Endpoint__Group__4 : rule__Endpoint__Group__4__Impl rule__Endpoint__Group__5 ;
    public final void rule__Endpoint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3638:1: ( rule__Endpoint__Group__4__Impl rule__Endpoint__Group__5 )
            // InternalSecurityDsl.g:3639:2: rule__Endpoint__Group__4__Impl rule__Endpoint__Group__5
            {
            pushFollow(FOLLOW_27);
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
    // InternalSecurityDsl.g:3646:1: rule__Endpoint__Group__4__Impl : ( ( rule__Endpoint__Group_4__0 )? ) ;
    public final void rule__Endpoint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3650:1: ( ( ( rule__Endpoint__Group_4__0 )? ) )
            // InternalSecurityDsl.g:3651:1: ( ( rule__Endpoint__Group_4__0 )? )
            {
            // InternalSecurityDsl.g:3651:1: ( ( rule__Endpoint__Group_4__0 )? )
            // InternalSecurityDsl.g:3652:2: ( rule__Endpoint__Group_4__0 )?
            {
             before(grammarAccess.getEndpointAccess().getGroup_4()); 
            // InternalSecurityDsl.g:3653:2: ( rule__Endpoint__Group_4__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==72) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSecurityDsl.g:3653:3: rule__Endpoint__Group_4__0
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
    // InternalSecurityDsl.g:3661:1: rule__Endpoint__Group__5 : rule__Endpoint__Group__5__Impl rule__Endpoint__Group__6 ;
    public final void rule__Endpoint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3665:1: ( rule__Endpoint__Group__5__Impl rule__Endpoint__Group__6 )
            // InternalSecurityDsl.g:3666:2: rule__Endpoint__Group__5__Impl rule__Endpoint__Group__6
            {
            pushFollow(FOLLOW_27);
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
    // InternalSecurityDsl.g:3673:1: rule__Endpoint__Group__5__Impl : ( ( rule__Endpoint__Group_5__0 )? ) ;
    public final void rule__Endpoint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3677:1: ( ( ( rule__Endpoint__Group_5__0 )? ) )
            // InternalSecurityDsl.g:3678:1: ( ( rule__Endpoint__Group_5__0 )? )
            {
            // InternalSecurityDsl.g:3678:1: ( ( rule__Endpoint__Group_5__0 )? )
            // InternalSecurityDsl.g:3679:2: ( rule__Endpoint__Group_5__0 )?
            {
             before(grammarAccess.getEndpointAccess().getGroup_5()); 
            // InternalSecurityDsl.g:3680:2: ( rule__Endpoint__Group_5__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==62) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSecurityDsl.g:3680:3: rule__Endpoint__Group_5__0
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
    // InternalSecurityDsl.g:3688:1: rule__Endpoint__Group__6 : rule__Endpoint__Group__6__Impl rule__Endpoint__Group__7 ;
    public final void rule__Endpoint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3692:1: ( rule__Endpoint__Group__6__Impl rule__Endpoint__Group__7 )
            // InternalSecurityDsl.g:3693:2: rule__Endpoint__Group__6__Impl rule__Endpoint__Group__7
            {
            pushFollow(FOLLOW_27);
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
    // InternalSecurityDsl.g:3700:1: rule__Endpoint__Group__6__Impl : ( ( rule__Endpoint__Group_6__0 )? ) ;
    public final void rule__Endpoint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3704:1: ( ( ( rule__Endpoint__Group_6__0 )? ) )
            // InternalSecurityDsl.g:3705:1: ( ( rule__Endpoint__Group_6__0 )? )
            {
            // InternalSecurityDsl.g:3705:1: ( ( rule__Endpoint__Group_6__0 )? )
            // InternalSecurityDsl.g:3706:2: ( rule__Endpoint__Group_6__0 )?
            {
             before(grammarAccess.getEndpointAccess().getGroup_6()); 
            // InternalSecurityDsl.g:3707:2: ( rule__Endpoint__Group_6__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==73) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSecurityDsl.g:3707:3: rule__Endpoint__Group_6__0
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
    // InternalSecurityDsl.g:3715:1: rule__Endpoint__Group__7 : rule__Endpoint__Group__7__Impl ;
    public final void rule__Endpoint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3719:1: ( rule__Endpoint__Group__7__Impl )
            // InternalSecurityDsl.g:3720:2: rule__Endpoint__Group__7__Impl
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
    // InternalSecurityDsl.g:3726:1: rule__Endpoint__Group__7__Impl : ( '}' ) ;
    public final void rule__Endpoint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3730:1: ( ( '}' ) )
            // InternalSecurityDsl.g:3731:1: ( '}' )
            {
            // InternalSecurityDsl.g:3731:1: ( '}' )
            // InternalSecurityDsl.g:3732:2: '}'
            {
             before(grammarAccess.getEndpointAccess().getRightCurlyBracketKeyword_7()); 
            match(input,63,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3742:1: rule__Endpoint__Group_3__0 : rule__Endpoint__Group_3__0__Impl rule__Endpoint__Group_3__1 ;
    public final void rule__Endpoint__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3746:1: ( rule__Endpoint__Group_3__0__Impl rule__Endpoint__Group_3__1 )
            // InternalSecurityDsl.g:3747:2: rule__Endpoint__Group_3__0__Impl rule__Endpoint__Group_3__1
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
    // InternalSecurityDsl.g:3754:1: rule__Endpoint__Group_3__0__Impl : ( 'functionName:' ) ;
    public final void rule__Endpoint__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3758:1: ( ( 'functionName:' ) )
            // InternalSecurityDsl.g:3759:1: ( 'functionName:' )
            {
            // InternalSecurityDsl.g:3759:1: ( 'functionName:' )
            // InternalSecurityDsl.g:3760:2: 'functionName:'
            {
             before(grammarAccess.getEndpointAccess().getFunctionNameKeyword_3_0()); 
            match(input,71,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3769:1: rule__Endpoint__Group_3__1 : rule__Endpoint__Group_3__1__Impl ;
    public final void rule__Endpoint__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3773:1: ( rule__Endpoint__Group_3__1__Impl )
            // InternalSecurityDsl.g:3774:2: rule__Endpoint__Group_3__1__Impl
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
    // InternalSecurityDsl.g:3780:1: rule__Endpoint__Group_3__1__Impl : ( ( rule__Endpoint__FunctionNameAssignment_3_1 ) ) ;
    public final void rule__Endpoint__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3784:1: ( ( ( rule__Endpoint__FunctionNameAssignment_3_1 ) ) )
            // InternalSecurityDsl.g:3785:1: ( ( rule__Endpoint__FunctionNameAssignment_3_1 ) )
            {
            // InternalSecurityDsl.g:3785:1: ( ( rule__Endpoint__FunctionNameAssignment_3_1 ) )
            // InternalSecurityDsl.g:3786:2: ( rule__Endpoint__FunctionNameAssignment_3_1 )
            {
             before(grammarAccess.getEndpointAccess().getFunctionNameAssignment_3_1()); 
            // InternalSecurityDsl.g:3787:2: ( rule__Endpoint__FunctionNameAssignment_3_1 )
            // InternalSecurityDsl.g:3787:3: rule__Endpoint__FunctionNameAssignment_3_1
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
    // InternalSecurityDsl.g:3796:1: rule__Endpoint__Group_4__0 : rule__Endpoint__Group_4__0__Impl rule__Endpoint__Group_4__1 ;
    public final void rule__Endpoint__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3800:1: ( rule__Endpoint__Group_4__0__Impl rule__Endpoint__Group_4__1 )
            // InternalSecurityDsl.g:3801:2: rule__Endpoint__Group_4__0__Impl rule__Endpoint__Group_4__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalSecurityDsl.g:3808:1: rule__Endpoint__Group_4__0__Impl : ( 'method:' ) ;
    public final void rule__Endpoint__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3812:1: ( ( 'method:' ) )
            // InternalSecurityDsl.g:3813:1: ( 'method:' )
            {
            // InternalSecurityDsl.g:3813:1: ( 'method:' )
            // InternalSecurityDsl.g:3814:2: 'method:'
            {
             before(grammarAccess.getEndpointAccess().getMethodKeyword_4_0()); 
            match(input,72,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3823:1: rule__Endpoint__Group_4__1 : rule__Endpoint__Group_4__1__Impl ;
    public final void rule__Endpoint__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3827:1: ( rule__Endpoint__Group_4__1__Impl )
            // InternalSecurityDsl.g:3828:2: rule__Endpoint__Group_4__1__Impl
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
    // InternalSecurityDsl.g:3834:1: rule__Endpoint__Group_4__1__Impl : ( ( rule__Endpoint__MethodAssignment_4_1 ) ) ;
    public final void rule__Endpoint__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3838:1: ( ( ( rule__Endpoint__MethodAssignment_4_1 ) ) )
            // InternalSecurityDsl.g:3839:1: ( ( rule__Endpoint__MethodAssignment_4_1 ) )
            {
            // InternalSecurityDsl.g:3839:1: ( ( rule__Endpoint__MethodAssignment_4_1 ) )
            // InternalSecurityDsl.g:3840:2: ( rule__Endpoint__MethodAssignment_4_1 )
            {
             before(grammarAccess.getEndpointAccess().getMethodAssignment_4_1()); 
            // InternalSecurityDsl.g:3841:2: ( rule__Endpoint__MethodAssignment_4_1 )
            // InternalSecurityDsl.g:3841:3: rule__Endpoint__MethodAssignment_4_1
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
    // InternalSecurityDsl.g:3850:1: rule__Endpoint__Group_5__0 : rule__Endpoint__Group_5__0__Impl rule__Endpoint__Group_5__1 ;
    public final void rule__Endpoint__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3854:1: ( rule__Endpoint__Group_5__0__Impl rule__Endpoint__Group_5__1 )
            // InternalSecurityDsl.g:3855:2: rule__Endpoint__Group_5__0__Impl rule__Endpoint__Group_5__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalSecurityDsl.g:3862:1: rule__Endpoint__Group_5__0__Impl : ( 'type:' ) ;
    public final void rule__Endpoint__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3866:1: ( ( 'type:' ) )
            // InternalSecurityDsl.g:3867:1: ( 'type:' )
            {
            // InternalSecurityDsl.g:3867:1: ( 'type:' )
            // InternalSecurityDsl.g:3868:2: 'type:'
            {
             before(grammarAccess.getEndpointAccess().getTypeKeyword_5_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3877:1: rule__Endpoint__Group_5__1 : rule__Endpoint__Group_5__1__Impl ;
    public final void rule__Endpoint__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3881:1: ( rule__Endpoint__Group_5__1__Impl )
            // InternalSecurityDsl.g:3882:2: rule__Endpoint__Group_5__1__Impl
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
    // InternalSecurityDsl.g:3888:1: rule__Endpoint__Group_5__1__Impl : ( ( rule__Endpoint__TypeAssignment_5_1 ) ) ;
    public final void rule__Endpoint__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3892:1: ( ( ( rule__Endpoint__TypeAssignment_5_1 ) ) )
            // InternalSecurityDsl.g:3893:1: ( ( rule__Endpoint__TypeAssignment_5_1 ) )
            {
            // InternalSecurityDsl.g:3893:1: ( ( rule__Endpoint__TypeAssignment_5_1 ) )
            // InternalSecurityDsl.g:3894:2: ( rule__Endpoint__TypeAssignment_5_1 )
            {
             before(grammarAccess.getEndpointAccess().getTypeAssignment_5_1()); 
            // InternalSecurityDsl.g:3895:2: ( rule__Endpoint__TypeAssignment_5_1 )
            // InternalSecurityDsl.g:3895:3: rule__Endpoint__TypeAssignment_5_1
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
    // InternalSecurityDsl.g:3904:1: rule__Endpoint__Group_6__0 : rule__Endpoint__Group_6__0__Impl rule__Endpoint__Group_6__1 ;
    public final void rule__Endpoint__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3908:1: ( rule__Endpoint__Group_6__0__Impl rule__Endpoint__Group_6__1 )
            // InternalSecurityDsl.g:3909:2: rule__Endpoint__Group_6__0__Impl rule__Endpoint__Group_6__1
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
    // InternalSecurityDsl.g:3916:1: rule__Endpoint__Group_6__0__Impl : ( 'roleAuthorities:' ) ;
    public final void rule__Endpoint__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3920:1: ( ( 'roleAuthorities:' ) )
            // InternalSecurityDsl.g:3921:1: ( 'roleAuthorities:' )
            {
            // InternalSecurityDsl.g:3921:1: ( 'roleAuthorities:' )
            // InternalSecurityDsl.g:3922:2: 'roleAuthorities:'
            {
             before(grammarAccess.getEndpointAccess().getRoleAuthoritiesKeyword_6_0()); 
            match(input,73,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3931:1: rule__Endpoint__Group_6__1 : rule__Endpoint__Group_6__1__Impl rule__Endpoint__Group_6__2 ;
    public final void rule__Endpoint__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3935:1: ( rule__Endpoint__Group_6__1__Impl rule__Endpoint__Group_6__2 )
            // InternalSecurityDsl.g:3936:2: rule__Endpoint__Group_6__1__Impl rule__Endpoint__Group_6__2
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
    // InternalSecurityDsl.g:3943:1: rule__Endpoint__Group_6__1__Impl : ( '[' ) ;
    public final void rule__Endpoint__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3947:1: ( ( '[' ) )
            // InternalSecurityDsl.g:3948:1: ( '[' )
            {
            // InternalSecurityDsl.g:3948:1: ( '[' )
            // InternalSecurityDsl.g:3949:2: '['
            {
             before(grammarAccess.getEndpointAccess().getLeftSquareBracketKeyword_6_1()); 
            match(input,67,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3958:1: rule__Endpoint__Group_6__2 : rule__Endpoint__Group_6__2__Impl rule__Endpoint__Group_6__3 ;
    public final void rule__Endpoint__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3962:1: ( rule__Endpoint__Group_6__2__Impl rule__Endpoint__Group_6__3 )
            // InternalSecurityDsl.g:3963:2: rule__Endpoint__Group_6__2__Impl rule__Endpoint__Group_6__3
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
    // InternalSecurityDsl.g:3970:1: rule__Endpoint__Group_6__2__Impl : ( ( rule__Endpoint__Role_authoritiesAssignment_6_2 ) ) ;
    public final void rule__Endpoint__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3974:1: ( ( ( rule__Endpoint__Role_authoritiesAssignment_6_2 ) ) )
            // InternalSecurityDsl.g:3975:1: ( ( rule__Endpoint__Role_authoritiesAssignment_6_2 ) )
            {
            // InternalSecurityDsl.g:3975:1: ( ( rule__Endpoint__Role_authoritiesAssignment_6_2 ) )
            // InternalSecurityDsl.g:3976:2: ( rule__Endpoint__Role_authoritiesAssignment_6_2 )
            {
             before(grammarAccess.getEndpointAccess().getRole_authoritiesAssignment_6_2()); 
            // InternalSecurityDsl.g:3977:2: ( rule__Endpoint__Role_authoritiesAssignment_6_2 )
            // InternalSecurityDsl.g:3977:3: rule__Endpoint__Role_authoritiesAssignment_6_2
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
    // InternalSecurityDsl.g:3985:1: rule__Endpoint__Group_6__3 : rule__Endpoint__Group_6__3__Impl rule__Endpoint__Group_6__4 ;
    public final void rule__Endpoint__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3989:1: ( rule__Endpoint__Group_6__3__Impl rule__Endpoint__Group_6__4 )
            // InternalSecurityDsl.g:3990:2: rule__Endpoint__Group_6__3__Impl rule__Endpoint__Group_6__4
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
    // InternalSecurityDsl.g:3997:1: rule__Endpoint__Group_6__3__Impl : ( ( rule__Endpoint__Group_6_3__0 )* ) ;
    public final void rule__Endpoint__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4001:1: ( ( ( rule__Endpoint__Group_6_3__0 )* ) )
            // InternalSecurityDsl.g:4002:1: ( ( rule__Endpoint__Group_6_3__0 )* )
            {
            // InternalSecurityDsl.g:4002:1: ( ( rule__Endpoint__Group_6_3__0 )* )
            // InternalSecurityDsl.g:4003:2: ( rule__Endpoint__Group_6_3__0 )*
            {
             before(grammarAccess.getEndpointAccess().getGroup_6_3()); 
            // InternalSecurityDsl.g:4004:2: ( rule__Endpoint__Group_6_3__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==69) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalSecurityDsl.g:4004:3: rule__Endpoint__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Endpoint__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalSecurityDsl.g:4012:1: rule__Endpoint__Group_6__4 : rule__Endpoint__Group_6__4__Impl ;
    public final void rule__Endpoint__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4016:1: ( rule__Endpoint__Group_6__4__Impl )
            // InternalSecurityDsl.g:4017:2: rule__Endpoint__Group_6__4__Impl
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
    // InternalSecurityDsl.g:4023:1: rule__Endpoint__Group_6__4__Impl : ( ']' ) ;
    public final void rule__Endpoint__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4027:1: ( ( ']' ) )
            // InternalSecurityDsl.g:4028:1: ( ']' )
            {
            // InternalSecurityDsl.g:4028:1: ( ']' )
            // InternalSecurityDsl.g:4029:2: ']'
            {
             before(grammarAccess.getEndpointAccess().getRightSquareBracketKeyword_6_4()); 
            match(input,68,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4039:1: rule__Endpoint__Group_6_3__0 : rule__Endpoint__Group_6_3__0__Impl rule__Endpoint__Group_6_3__1 ;
    public final void rule__Endpoint__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4043:1: ( rule__Endpoint__Group_6_3__0__Impl rule__Endpoint__Group_6_3__1 )
            // InternalSecurityDsl.g:4044:2: rule__Endpoint__Group_6_3__0__Impl rule__Endpoint__Group_6_3__1
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
    // InternalSecurityDsl.g:4051:1: rule__Endpoint__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Endpoint__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4055:1: ( ( ',' ) )
            // InternalSecurityDsl.g:4056:1: ( ',' )
            {
            // InternalSecurityDsl.g:4056:1: ( ',' )
            // InternalSecurityDsl.g:4057:2: ','
            {
             before(grammarAccess.getEndpointAccess().getCommaKeyword_6_3_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4066:1: rule__Endpoint__Group_6_3__1 : rule__Endpoint__Group_6_3__1__Impl ;
    public final void rule__Endpoint__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4070:1: ( rule__Endpoint__Group_6_3__1__Impl )
            // InternalSecurityDsl.g:4071:2: rule__Endpoint__Group_6_3__1__Impl
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
    // InternalSecurityDsl.g:4077:1: rule__Endpoint__Group_6_3__1__Impl : ( ( rule__Endpoint__Role_authoritiesAssignment_6_3_1 ) ) ;
    public final void rule__Endpoint__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4081:1: ( ( ( rule__Endpoint__Role_authoritiesAssignment_6_3_1 ) ) )
            // InternalSecurityDsl.g:4082:1: ( ( rule__Endpoint__Role_authoritiesAssignment_6_3_1 ) )
            {
            // InternalSecurityDsl.g:4082:1: ( ( rule__Endpoint__Role_authoritiesAssignment_6_3_1 ) )
            // InternalSecurityDsl.g:4083:2: ( rule__Endpoint__Role_authoritiesAssignment_6_3_1 )
            {
             before(grammarAccess.getEndpointAccess().getRole_authoritiesAssignment_6_3_1()); 
            // InternalSecurityDsl.g:4084:2: ( rule__Endpoint__Role_authoritiesAssignment_6_3_1 )
            // InternalSecurityDsl.g:4084:3: rule__Endpoint__Role_authoritiesAssignment_6_3_1
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
    // InternalSecurityDsl.g:4093:1: rule__Authentication__Group__0 : rule__Authentication__Group__0__Impl rule__Authentication__Group__1 ;
    public final void rule__Authentication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4097:1: ( rule__Authentication__Group__0__Impl rule__Authentication__Group__1 )
            // InternalSecurityDsl.g:4098:2: rule__Authentication__Group__0__Impl rule__Authentication__Group__1
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
    // InternalSecurityDsl.g:4105:1: rule__Authentication__Group__0__Impl : ( () ) ;
    public final void rule__Authentication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4109:1: ( ( () ) )
            // InternalSecurityDsl.g:4110:1: ( () )
            {
            // InternalSecurityDsl.g:4110:1: ( () )
            // InternalSecurityDsl.g:4111:2: ()
            {
             before(grammarAccess.getAuthenticationAccess().getAuthenticationAction_0()); 
            // InternalSecurityDsl.g:4112:2: ()
            // InternalSecurityDsl.g:4112:3: 
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
    // InternalSecurityDsl.g:4120:1: rule__Authentication__Group__1 : rule__Authentication__Group__1__Impl rule__Authentication__Group__2 ;
    public final void rule__Authentication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4124:1: ( rule__Authentication__Group__1__Impl rule__Authentication__Group__2 )
            // InternalSecurityDsl.g:4125:2: rule__Authentication__Group__1__Impl rule__Authentication__Group__2
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
    // InternalSecurityDsl.g:4132:1: rule__Authentication__Group__1__Impl : ( 'name:' ) ;
    public final void rule__Authentication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4136:1: ( ( 'name:' ) )
            // InternalSecurityDsl.g:4137:1: ( 'name:' )
            {
            // InternalSecurityDsl.g:4137:1: ( 'name:' )
            // InternalSecurityDsl.g:4138:2: 'name:'
            {
             before(grammarAccess.getAuthenticationAccess().getNameKeyword_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4147:1: rule__Authentication__Group__2 : rule__Authentication__Group__2__Impl rule__Authentication__Group__3 ;
    public final void rule__Authentication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4151:1: ( rule__Authentication__Group__2__Impl rule__Authentication__Group__3 )
            // InternalSecurityDsl.g:4152:2: rule__Authentication__Group__2__Impl rule__Authentication__Group__3
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
    // InternalSecurityDsl.g:4159:1: rule__Authentication__Group__2__Impl : ( ( rule__Authentication__NameAssignment_2 ) ) ;
    public final void rule__Authentication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4163:1: ( ( ( rule__Authentication__NameAssignment_2 ) ) )
            // InternalSecurityDsl.g:4164:1: ( ( rule__Authentication__NameAssignment_2 ) )
            {
            // InternalSecurityDsl.g:4164:1: ( ( rule__Authentication__NameAssignment_2 ) )
            // InternalSecurityDsl.g:4165:2: ( rule__Authentication__NameAssignment_2 )
            {
             before(grammarAccess.getAuthenticationAccess().getNameAssignment_2()); 
            // InternalSecurityDsl.g:4166:2: ( rule__Authentication__NameAssignment_2 )
            // InternalSecurityDsl.g:4166:3: rule__Authentication__NameAssignment_2
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
    // InternalSecurityDsl.g:4174:1: rule__Authentication__Group__3 : rule__Authentication__Group__3__Impl rule__Authentication__Group__4 ;
    public final void rule__Authentication__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4178:1: ( rule__Authentication__Group__3__Impl rule__Authentication__Group__4 )
            // InternalSecurityDsl.g:4179:2: rule__Authentication__Group__3__Impl rule__Authentication__Group__4
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
    // InternalSecurityDsl.g:4186:1: rule__Authentication__Group__3__Impl : ( 'path:' ) ;
    public final void rule__Authentication__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4190:1: ( ( 'path:' ) )
            // InternalSecurityDsl.g:4191:1: ( 'path:' )
            {
            // InternalSecurityDsl.g:4191:1: ( 'path:' )
            // InternalSecurityDsl.g:4192:2: 'path:'
            {
             before(grammarAccess.getAuthenticationAccess().getPathKeyword_3()); 
            match(input,74,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4201:1: rule__Authentication__Group__4 : rule__Authentication__Group__4__Impl rule__Authentication__Group__5 ;
    public final void rule__Authentication__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4205:1: ( rule__Authentication__Group__4__Impl rule__Authentication__Group__5 )
            // InternalSecurityDsl.g:4206:2: rule__Authentication__Group__4__Impl rule__Authentication__Group__5
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
    // InternalSecurityDsl.g:4213:1: rule__Authentication__Group__4__Impl : ( ( rule__Authentication__PathAssignment_4 ) ) ;
    public final void rule__Authentication__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4217:1: ( ( ( rule__Authentication__PathAssignment_4 ) ) )
            // InternalSecurityDsl.g:4218:1: ( ( rule__Authentication__PathAssignment_4 ) )
            {
            // InternalSecurityDsl.g:4218:1: ( ( rule__Authentication__PathAssignment_4 ) )
            // InternalSecurityDsl.g:4219:2: ( rule__Authentication__PathAssignment_4 )
            {
             before(grammarAccess.getAuthenticationAccess().getPathAssignment_4()); 
            // InternalSecurityDsl.g:4220:2: ( rule__Authentication__PathAssignment_4 )
            // InternalSecurityDsl.g:4220:3: rule__Authentication__PathAssignment_4
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
    // InternalSecurityDsl.g:4228:1: rule__Authentication__Group__5 : rule__Authentication__Group__5__Impl ;
    public final void rule__Authentication__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4232:1: ( rule__Authentication__Group__5__Impl )
            // InternalSecurityDsl.g:4233:2: rule__Authentication__Group__5__Impl
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
    // InternalSecurityDsl.g:4239:1: rule__Authentication__Group__5__Impl : ( ( rule__Authentication__Group_5__0 )? ) ;
    public final void rule__Authentication__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4243:1: ( ( ( rule__Authentication__Group_5__0 )? ) )
            // InternalSecurityDsl.g:4244:1: ( ( rule__Authentication__Group_5__0 )? )
            {
            // InternalSecurityDsl.g:4244:1: ( ( rule__Authentication__Group_5__0 )? )
            // InternalSecurityDsl.g:4245:2: ( rule__Authentication__Group_5__0 )?
            {
             before(grammarAccess.getAuthenticationAccess().getGroup_5()); 
            // InternalSecurityDsl.g:4246:2: ( rule__Authentication__Group_5__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==75) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSecurityDsl.g:4246:3: rule__Authentication__Group_5__0
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
    // InternalSecurityDsl.g:4255:1: rule__Authentication__Group_5__0 : rule__Authentication__Group_5__0__Impl rule__Authentication__Group_5__1 ;
    public final void rule__Authentication__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4259:1: ( rule__Authentication__Group_5__0__Impl rule__Authentication__Group_5__1 )
            // InternalSecurityDsl.g:4260:2: rule__Authentication__Group_5__0__Impl rule__Authentication__Group_5__1
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
    // InternalSecurityDsl.g:4267:1: rule__Authentication__Group_5__0__Impl : ( 'endpoints:' ) ;
    public final void rule__Authentication__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4271:1: ( ( 'endpoints:' ) )
            // InternalSecurityDsl.g:4272:1: ( 'endpoints:' )
            {
            // InternalSecurityDsl.g:4272:1: ( 'endpoints:' )
            // InternalSecurityDsl.g:4273:2: 'endpoints:'
            {
             before(grammarAccess.getAuthenticationAccess().getEndpointsKeyword_5_0()); 
            match(input,75,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4282:1: rule__Authentication__Group_5__1 : rule__Authentication__Group_5__1__Impl rule__Authentication__Group_5__2 ;
    public final void rule__Authentication__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4286:1: ( rule__Authentication__Group_5__1__Impl rule__Authentication__Group_5__2 )
            // InternalSecurityDsl.g:4287:2: rule__Authentication__Group_5__1__Impl rule__Authentication__Group_5__2
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
    // InternalSecurityDsl.g:4294:1: rule__Authentication__Group_5__1__Impl : ( '[' ) ;
    public final void rule__Authentication__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4298:1: ( ( '[' ) )
            // InternalSecurityDsl.g:4299:1: ( '[' )
            {
            // InternalSecurityDsl.g:4299:1: ( '[' )
            // InternalSecurityDsl.g:4300:2: '['
            {
             before(grammarAccess.getAuthenticationAccess().getLeftSquareBracketKeyword_5_1()); 
            match(input,67,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4309:1: rule__Authentication__Group_5__2 : rule__Authentication__Group_5__2__Impl rule__Authentication__Group_5__3 ;
    public final void rule__Authentication__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4313:1: ( rule__Authentication__Group_5__2__Impl rule__Authentication__Group_5__3 )
            // InternalSecurityDsl.g:4314:2: rule__Authentication__Group_5__2__Impl rule__Authentication__Group_5__3
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
    // InternalSecurityDsl.g:4321:1: rule__Authentication__Group_5__2__Impl : ( ( rule__Authentication__Controller_endpointsAssignment_5_2 ) ) ;
    public final void rule__Authentication__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4325:1: ( ( ( rule__Authentication__Controller_endpointsAssignment_5_2 ) ) )
            // InternalSecurityDsl.g:4326:1: ( ( rule__Authentication__Controller_endpointsAssignment_5_2 ) )
            {
            // InternalSecurityDsl.g:4326:1: ( ( rule__Authentication__Controller_endpointsAssignment_5_2 ) )
            // InternalSecurityDsl.g:4327:2: ( rule__Authentication__Controller_endpointsAssignment_5_2 )
            {
             before(grammarAccess.getAuthenticationAccess().getController_endpointsAssignment_5_2()); 
            // InternalSecurityDsl.g:4328:2: ( rule__Authentication__Controller_endpointsAssignment_5_2 )
            // InternalSecurityDsl.g:4328:3: rule__Authentication__Controller_endpointsAssignment_5_2
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
    // InternalSecurityDsl.g:4336:1: rule__Authentication__Group_5__3 : rule__Authentication__Group_5__3__Impl rule__Authentication__Group_5__4 ;
    public final void rule__Authentication__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4340:1: ( rule__Authentication__Group_5__3__Impl rule__Authentication__Group_5__4 )
            // InternalSecurityDsl.g:4341:2: rule__Authentication__Group_5__3__Impl rule__Authentication__Group_5__4
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
    // InternalSecurityDsl.g:4348:1: rule__Authentication__Group_5__3__Impl : ( ( rule__Authentication__Group_5_3__0 )* ) ;
    public final void rule__Authentication__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4352:1: ( ( ( rule__Authentication__Group_5_3__0 )* ) )
            // InternalSecurityDsl.g:4353:1: ( ( rule__Authentication__Group_5_3__0 )* )
            {
            // InternalSecurityDsl.g:4353:1: ( ( rule__Authentication__Group_5_3__0 )* )
            // InternalSecurityDsl.g:4354:2: ( rule__Authentication__Group_5_3__0 )*
            {
             before(grammarAccess.getAuthenticationAccess().getGroup_5_3()); 
            // InternalSecurityDsl.g:4355:2: ( rule__Authentication__Group_5_3__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==69) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalSecurityDsl.g:4355:3: rule__Authentication__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Authentication__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalSecurityDsl.g:4363:1: rule__Authentication__Group_5__4 : rule__Authentication__Group_5__4__Impl ;
    public final void rule__Authentication__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4367:1: ( rule__Authentication__Group_5__4__Impl )
            // InternalSecurityDsl.g:4368:2: rule__Authentication__Group_5__4__Impl
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
    // InternalSecurityDsl.g:4374:1: rule__Authentication__Group_5__4__Impl : ( ']' ) ;
    public final void rule__Authentication__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4378:1: ( ( ']' ) )
            // InternalSecurityDsl.g:4379:1: ( ']' )
            {
            // InternalSecurityDsl.g:4379:1: ( ']' )
            // InternalSecurityDsl.g:4380:2: ']'
            {
             before(grammarAccess.getAuthenticationAccess().getRightSquareBracketKeyword_5_4()); 
            match(input,68,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4390:1: rule__Authentication__Group_5_3__0 : rule__Authentication__Group_5_3__0__Impl rule__Authentication__Group_5_3__1 ;
    public final void rule__Authentication__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4394:1: ( rule__Authentication__Group_5_3__0__Impl rule__Authentication__Group_5_3__1 )
            // InternalSecurityDsl.g:4395:2: rule__Authentication__Group_5_3__0__Impl rule__Authentication__Group_5_3__1
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
    // InternalSecurityDsl.g:4402:1: rule__Authentication__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Authentication__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4406:1: ( ( ',' ) )
            // InternalSecurityDsl.g:4407:1: ( ',' )
            {
            // InternalSecurityDsl.g:4407:1: ( ',' )
            // InternalSecurityDsl.g:4408:2: ','
            {
             before(grammarAccess.getAuthenticationAccess().getCommaKeyword_5_3_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4417:1: rule__Authentication__Group_5_3__1 : rule__Authentication__Group_5_3__1__Impl ;
    public final void rule__Authentication__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4421:1: ( rule__Authentication__Group_5_3__1__Impl )
            // InternalSecurityDsl.g:4422:2: rule__Authentication__Group_5_3__1__Impl
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
    // InternalSecurityDsl.g:4428:1: rule__Authentication__Group_5_3__1__Impl : ( ( rule__Authentication__Controller_endpointsAssignment_5_3_1 ) ) ;
    public final void rule__Authentication__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4432:1: ( ( ( rule__Authentication__Controller_endpointsAssignment_5_3_1 ) ) )
            // InternalSecurityDsl.g:4433:1: ( ( rule__Authentication__Controller_endpointsAssignment_5_3_1 ) )
            {
            // InternalSecurityDsl.g:4433:1: ( ( rule__Authentication__Controller_endpointsAssignment_5_3_1 ) )
            // InternalSecurityDsl.g:4434:2: ( rule__Authentication__Controller_endpointsAssignment_5_3_1 )
            {
             before(grammarAccess.getAuthenticationAccess().getController_endpointsAssignment_5_3_1()); 
            // InternalSecurityDsl.g:4435:2: ( rule__Authentication__Controller_endpointsAssignment_5_3_1 )
            // InternalSecurityDsl.g:4435:3: rule__Authentication__Controller_endpointsAssignment_5_3_1
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
    // InternalSecurityDsl.g:4444:1: rule__JWT__Group__0 : rule__JWT__Group__0__Impl rule__JWT__Group__1 ;
    public final void rule__JWT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4448:1: ( rule__JWT__Group__0__Impl rule__JWT__Group__1 )
            // InternalSecurityDsl.g:4449:2: rule__JWT__Group__0__Impl rule__JWT__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalSecurityDsl.g:4456:1: rule__JWT__Group__0__Impl : ( 'jwt:' ) ;
    public final void rule__JWT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4460:1: ( ( 'jwt:' ) )
            // InternalSecurityDsl.g:4461:1: ( 'jwt:' )
            {
            // InternalSecurityDsl.g:4461:1: ( 'jwt:' )
            // InternalSecurityDsl.g:4462:2: 'jwt:'
            {
             before(grammarAccess.getJWTAccess().getJwtKeyword_0()); 
            match(input,76,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4471:1: rule__JWT__Group__1 : rule__JWT__Group__1__Impl rule__JWT__Group__2 ;
    public final void rule__JWT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4475:1: ( rule__JWT__Group__1__Impl rule__JWT__Group__2 )
            // InternalSecurityDsl.g:4476:2: rule__JWT__Group__1__Impl rule__JWT__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalSecurityDsl.g:4483:1: rule__JWT__Group__1__Impl : ( 'header:' ) ;
    public final void rule__JWT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4487:1: ( ( 'header:' ) )
            // InternalSecurityDsl.g:4488:1: ( 'header:' )
            {
            // InternalSecurityDsl.g:4488:1: ( 'header:' )
            // InternalSecurityDsl.g:4489:2: 'header:'
            {
             before(grammarAccess.getJWTAccess().getHeaderKeyword_1()); 
            match(input,77,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4498:1: rule__JWT__Group__2 : rule__JWT__Group__2__Impl rule__JWT__Group__3 ;
    public final void rule__JWT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4502:1: ( rule__JWT__Group__2__Impl rule__JWT__Group__3 )
            // InternalSecurityDsl.g:4503:2: rule__JWT__Group__2__Impl rule__JWT__Group__3
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
    // InternalSecurityDsl.g:4510:1: rule__JWT__Group__2__Impl : ( 'signatureAlgorithm:' ) ;
    public final void rule__JWT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4514:1: ( ( 'signatureAlgorithm:' ) )
            // InternalSecurityDsl.g:4515:1: ( 'signatureAlgorithm:' )
            {
            // InternalSecurityDsl.g:4515:1: ( 'signatureAlgorithm:' )
            // InternalSecurityDsl.g:4516:2: 'signatureAlgorithm:'
            {
             before(grammarAccess.getJWTAccess().getSignatureAlgorithmKeyword_2()); 
            match(input,78,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4525:1: rule__JWT__Group__3 : rule__JWT__Group__3__Impl rule__JWT__Group__4 ;
    public final void rule__JWT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4529:1: ( rule__JWT__Group__3__Impl rule__JWT__Group__4 )
            // InternalSecurityDsl.g:4530:2: rule__JWT__Group__3__Impl rule__JWT__Group__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalSecurityDsl.g:4537:1: rule__JWT__Group__3__Impl : ( ( rule__JWT__SignatureAlgorithmAssignment_3 ) ) ;
    public final void rule__JWT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4541:1: ( ( ( rule__JWT__SignatureAlgorithmAssignment_3 ) ) )
            // InternalSecurityDsl.g:4542:1: ( ( rule__JWT__SignatureAlgorithmAssignment_3 ) )
            {
            // InternalSecurityDsl.g:4542:1: ( ( rule__JWT__SignatureAlgorithmAssignment_3 ) )
            // InternalSecurityDsl.g:4543:2: ( rule__JWT__SignatureAlgorithmAssignment_3 )
            {
             before(grammarAccess.getJWTAccess().getSignatureAlgorithmAssignment_3()); 
            // InternalSecurityDsl.g:4544:2: ( rule__JWT__SignatureAlgorithmAssignment_3 )
            // InternalSecurityDsl.g:4544:3: rule__JWT__SignatureAlgorithmAssignment_3
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
    // InternalSecurityDsl.g:4552:1: rule__JWT__Group__4 : rule__JWT__Group__4__Impl rule__JWT__Group__5 ;
    public final void rule__JWT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4556:1: ( rule__JWT__Group__4__Impl rule__JWT__Group__5 )
            // InternalSecurityDsl.g:4557:2: rule__JWT__Group__4__Impl rule__JWT__Group__5
            {
            pushFollow(FOLLOW_35);
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
    // InternalSecurityDsl.g:4564:1: rule__JWT__Group__4__Impl : ( 'payload:' ) ;
    public final void rule__JWT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4568:1: ( ( 'payload:' ) )
            // InternalSecurityDsl.g:4569:1: ( 'payload:' )
            {
            // InternalSecurityDsl.g:4569:1: ( 'payload:' )
            // InternalSecurityDsl.g:4570:2: 'payload:'
            {
             before(grammarAccess.getJWTAccess().getPayloadKeyword_4()); 
            match(input,79,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4579:1: rule__JWT__Group__5 : rule__JWT__Group__5__Impl rule__JWT__Group__6 ;
    public final void rule__JWT__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4583:1: ( rule__JWT__Group__5__Impl rule__JWT__Group__6 )
            // InternalSecurityDsl.g:4584:2: rule__JWT__Group__5__Impl rule__JWT__Group__6
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
    // InternalSecurityDsl.g:4591:1: rule__JWT__Group__5__Impl : ( 'claims:' ) ;
    public final void rule__JWT__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4595:1: ( ( 'claims:' ) )
            // InternalSecurityDsl.g:4596:1: ( 'claims:' )
            {
            // InternalSecurityDsl.g:4596:1: ( 'claims:' )
            // InternalSecurityDsl.g:4597:2: 'claims:'
            {
             before(grammarAccess.getJWTAccess().getClaimsKeyword_5()); 
            match(input,80,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4606:1: rule__JWT__Group__6 : rule__JWT__Group__6__Impl rule__JWT__Group__7 ;
    public final void rule__JWT__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4610:1: ( rule__JWT__Group__6__Impl rule__JWT__Group__7 )
            // InternalSecurityDsl.g:4611:2: rule__JWT__Group__6__Impl rule__JWT__Group__7
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
    // InternalSecurityDsl.g:4618:1: rule__JWT__Group__6__Impl : ( '[' ) ;
    public final void rule__JWT__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4622:1: ( ( '[' ) )
            // InternalSecurityDsl.g:4623:1: ( '[' )
            {
            // InternalSecurityDsl.g:4623:1: ( '[' )
            // InternalSecurityDsl.g:4624:2: '['
            {
             before(grammarAccess.getJWTAccess().getLeftSquareBracketKeyword_6()); 
            match(input,67,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4633:1: rule__JWT__Group__7 : rule__JWT__Group__7__Impl rule__JWT__Group__8 ;
    public final void rule__JWT__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4637:1: ( rule__JWT__Group__7__Impl rule__JWT__Group__8 )
            // InternalSecurityDsl.g:4638:2: rule__JWT__Group__7__Impl rule__JWT__Group__8
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
    // InternalSecurityDsl.g:4645:1: rule__JWT__Group__7__Impl : ( ( rule__JWT__RegisteredclaimsAssignment_7 ) ) ;
    public final void rule__JWT__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4649:1: ( ( ( rule__JWT__RegisteredclaimsAssignment_7 ) ) )
            // InternalSecurityDsl.g:4650:1: ( ( rule__JWT__RegisteredclaimsAssignment_7 ) )
            {
            // InternalSecurityDsl.g:4650:1: ( ( rule__JWT__RegisteredclaimsAssignment_7 ) )
            // InternalSecurityDsl.g:4651:2: ( rule__JWT__RegisteredclaimsAssignment_7 )
            {
             before(grammarAccess.getJWTAccess().getRegisteredclaimsAssignment_7()); 
            // InternalSecurityDsl.g:4652:2: ( rule__JWT__RegisteredclaimsAssignment_7 )
            // InternalSecurityDsl.g:4652:3: rule__JWT__RegisteredclaimsAssignment_7
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
    // InternalSecurityDsl.g:4660:1: rule__JWT__Group__8 : rule__JWT__Group__8__Impl rule__JWT__Group__9 ;
    public final void rule__JWT__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4664:1: ( rule__JWT__Group__8__Impl rule__JWT__Group__9 )
            // InternalSecurityDsl.g:4665:2: rule__JWT__Group__8__Impl rule__JWT__Group__9
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
    // InternalSecurityDsl.g:4672:1: rule__JWT__Group__8__Impl : ( ( rule__JWT__Group_8__0 )* ) ;
    public final void rule__JWT__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4676:1: ( ( ( rule__JWT__Group_8__0 )* ) )
            // InternalSecurityDsl.g:4677:1: ( ( rule__JWT__Group_8__0 )* )
            {
            // InternalSecurityDsl.g:4677:1: ( ( rule__JWT__Group_8__0 )* )
            // InternalSecurityDsl.g:4678:2: ( rule__JWT__Group_8__0 )*
            {
             before(grammarAccess.getJWTAccess().getGroup_8()); 
            // InternalSecurityDsl.g:4679:2: ( rule__JWT__Group_8__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==69) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalSecurityDsl.g:4679:3: rule__JWT__Group_8__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__JWT__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalSecurityDsl.g:4687:1: rule__JWT__Group__9 : rule__JWT__Group__9__Impl rule__JWT__Group__10 ;
    public final void rule__JWT__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4691:1: ( rule__JWT__Group__9__Impl rule__JWT__Group__10 )
            // InternalSecurityDsl.g:4692:2: rule__JWT__Group__9__Impl rule__JWT__Group__10
            {
            pushFollow(FOLLOW_36);
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
    // InternalSecurityDsl.g:4699:1: rule__JWT__Group__9__Impl : ( ']' ) ;
    public final void rule__JWT__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4703:1: ( ( ']' ) )
            // InternalSecurityDsl.g:4704:1: ( ']' )
            {
            // InternalSecurityDsl.g:4704:1: ( ']' )
            // InternalSecurityDsl.g:4705:2: ']'
            {
             before(grammarAccess.getJWTAccess().getRightSquareBracketKeyword_9()); 
            match(input,68,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4714:1: rule__JWT__Group__10 : rule__JWT__Group__10__Impl ;
    public final void rule__JWT__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4718:1: ( rule__JWT__Group__10__Impl )
            // InternalSecurityDsl.g:4719:2: rule__JWT__Group__10__Impl
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
    // InternalSecurityDsl.g:4725:1: rule__JWT__Group__10__Impl : ( ( rule__JWT__Group_10__0 )? ) ;
    public final void rule__JWT__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4729:1: ( ( ( rule__JWT__Group_10__0 )? ) )
            // InternalSecurityDsl.g:4730:1: ( ( rule__JWT__Group_10__0 )? )
            {
            // InternalSecurityDsl.g:4730:1: ( ( rule__JWT__Group_10__0 )? )
            // InternalSecurityDsl.g:4731:2: ( rule__JWT__Group_10__0 )?
            {
             before(grammarAccess.getJWTAccess().getGroup_10()); 
            // InternalSecurityDsl.g:4732:2: ( rule__JWT__Group_10__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==81) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalSecurityDsl.g:4732:3: rule__JWT__Group_10__0
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
    // InternalSecurityDsl.g:4741:1: rule__JWT__Group_8__0 : rule__JWT__Group_8__0__Impl rule__JWT__Group_8__1 ;
    public final void rule__JWT__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4745:1: ( rule__JWT__Group_8__0__Impl rule__JWT__Group_8__1 )
            // InternalSecurityDsl.g:4746:2: rule__JWT__Group_8__0__Impl rule__JWT__Group_8__1
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
    // InternalSecurityDsl.g:4753:1: rule__JWT__Group_8__0__Impl : ( ',' ) ;
    public final void rule__JWT__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4757:1: ( ( ',' ) )
            // InternalSecurityDsl.g:4758:1: ( ',' )
            {
            // InternalSecurityDsl.g:4758:1: ( ',' )
            // InternalSecurityDsl.g:4759:2: ','
            {
             before(grammarAccess.getJWTAccess().getCommaKeyword_8_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4768:1: rule__JWT__Group_8__1 : rule__JWT__Group_8__1__Impl ;
    public final void rule__JWT__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4772:1: ( rule__JWT__Group_8__1__Impl )
            // InternalSecurityDsl.g:4773:2: rule__JWT__Group_8__1__Impl
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
    // InternalSecurityDsl.g:4779:1: rule__JWT__Group_8__1__Impl : ( ( rule__JWT__Jwt_claimsAssignment_8_1 ) ) ;
    public final void rule__JWT__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4783:1: ( ( ( rule__JWT__Jwt_claimsAssignment_8_1 ) ) )
            // InternalSecurityDsl.g:4784:1: ( ( rule__JWT__Jwt_claimsAssignment_8_1 ) )
            {
            // InternalSecurityDsl.g:4784:1: ( ( rule__JWT__Jwt_claimsAssignment_8_1 ) )
            // InternalSecurityDsl.g:4785:2: ( rule__JWT__Jwt_claimsAssignment_8_1 )
            {
             before(grammarAccess.getJWTAccess().getJwt_claimsAssignment_8_1()); 
            // InternalSecurityDsl.g:4786:2: ( rule__JWT__Jwt_claimsAssignment_8_1 )
            // InternalSecurityDsl.g:4786:3: rule__JWT__Jwt_claimsAssignment_8_1
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
    // InternalSecurityDsl.g:4795:1: rule__JWT__Group_10__0 : rule__JWT__Group_10__0__Impl rule__JWT__Group_10__1 ;
    public final void rule__JWT__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4799:1: ( rule__JWT__Group_10__0__Impl rule__JWT__Group_10__1 )
            // InternalSecurityDsl.g:4800:2: rule__JWT__Group_10__0__Impl rule__JWT__Group_10__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalSecurityDsl.g:4807:1: rule__JWT__Group_10__0__Impl : ( 'signature:' ) ;
    public final void rule__JWT__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4811:1: ( ( 'signature:' ) )
            // InternalSecurityDsl.g:4812:1: ( 'signature:' )
            {
            // InternalSecurityDsl.g:4812:1: ( 'signature:' )
            // InternalSecurityDsl.g:4813:2: 'signature:'
            {
             before(grammarAccess.getJWTAccess().getSignatureKeyword_10_0()); 
            match(input,81,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4822:1: rule__JWT__Group_10__1 : rule__JWT__Group_10__1__Impl rule__JWT__Group_10__2 ;
    public final void rule__JWT__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4826:1: ( rule__JWT__Group_10__1__Impl rule__JWT__Group_10__2 )
            // InternalSecurityDsl.g:4827:2: rule__JWT__Group_10__1__Impl rule__JWT__Group_10__2
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
    // InternalSecurityDsl.g:4834:1: rule__JWT__Group_10__1__Impl : ( 'secret:' ) ;
    public final void rule__JWT__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4838:1: ( ( 'secret:' ) )
            // InternalSecurityDsl.g:4839:1: ( 'secret:' )
            {
            // InternalSecurityDsl.g:4839:1: ( 'secret:' )
            // InternalSecurityDsl.g:4840:2: 'secret:'
            {
             before(grammarAccess.getJWTAccess().getSecretKeyword_10_1()); 
            match(input,82,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4849:1: rule__JWT__Group_10__2 : rule__JWT__Group_10__2__Impl ;
    public final void rule__JWT__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4853:1: ( rule__JWT__Group_10__2__Impl )
            // InternalSecurityDsl.g:4854:2: rule__JWT__Group_10__2__Impl
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
    // InternalSecurityDsl.g:4860:1: rule__JWT__Group_10__2__Impl : ( ( rule__JWT__SecretAssignment_10_2 ) ) ;
    public final void rule__JWT__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4864:1: ( ( ( rule__JWT__SecretAssignment_10_2 ) ) )
            // InternalSecurityDsl.g:4865:1: ( ( rule__JWT__SecretAssignment_10_2 ) )
            {
            // InternalSecurityDsl.g:4865:1: ( ( rule__JWT__SecretAssignment_10_2 ) )
            // InternalSecurityDsl.g:4866:2: ( rule__JWT__SecretAssignment_10_2 )
            {
             before(grammarAccess.getJWTAccess().getSecretAssignment_10_2()); 
            // InternalSecurityDsl.g:4867:2: ( rule__JWT__SecretAssignment_10_2 )
            // InternalSecurityDsl.g:4867:3: rule__JWT__SecretAssignment_10_2
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
    // InternalSecurityDsl.g:4876:1: rule__Claim__Group__0 : rule__Claim__Group__0__Impl rule__Claim__Group__1 ;
    public final void rule__Claim__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4880:1: ( rule__Claim__Group__0__Impl rule__Claim__Group__1 )
            // InternalSecurityDsl.g:4881:2: rule__Claim__Group__0__Impl rule__Claim__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalSecurityDsl.g:4888:1: rule__Claim__Group__0__Impl : ( '{' ) ;
    public final void rule__Claim__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4892:1: ( ( '{' ) )
            // InternalSecurityDsl.g:4893:1: ( '{' )
            {
            // InternalSecurityDsl.g:4893:1: ( '{' )
            // InternalSecurityDsl.g:4894:2: '{'
            {
             before(grammarAccess.getClaimAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4903:1: rule__Claim__Group__1 : rule__Claim__Group__1__Impl rule__Claim__Group__2 ;
    public final void rule__Claim__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4907:1: ( rule__Claim__Group__1__Impl rule__Claim__Group__2 )
            // InternalSecurityDsl.g:4908:2: rule__Claim__Group__1__Impl rule__Claim__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalSecurityDsl.g:4915:1: rule__Claim__Group__1__Impl : ( ( rule__Claim__Group_1__0 )? ) ;
    public final void rule__Claim__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4919:1: ( ( ( rule__Claim__Group_1__0 )? ) )
            // InternalSecurityDsl.g:4920:1: ( ( rule__Claim__Group_1__0 )? )
            {
            // InternalSecurityDsl.g:4920:1: ( ( rule__Claim__Group_1__0 )? )
            // InternalSecurityDsl.g:4921:2: ( rule__Claim__Group_1__0 )?
            {
             before(grammarAccess.getClaimAccess().getGroup_1()); 
            // InternalSecurityDsl.g:4922:2: ( rule__Claim__Group_1__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=31 && LA45_0<=33)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSecurityDsl.g:4922:3: rule__Claim__Group_1__0
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
    // InternalSecurityDsl.g:4930:1: rule__Claim__Group__2 : rule__Claim__Group__2__Impl rule__Claim__Group__3 ;
    public final void rule__Claim__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4934:1: ( rule__Claim__Group__2__Impl rule__Claim__Group__3 )
            // InternalSecurityDsl.g:4935:2: rule__Claim__Group__2__Impl rule__Claim__Group__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalSecurityDsl.g:4942:1: rule__Claim__Group__2__Impl : ( ( rule__Claim__NameAssignment_2 ) ) ;
    public final void rule__Claim__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4946:1: ( ( ( rule__Claim__NameAssignment_2 ) ) )
            // InternalSecurityDsl.g:4947:1: ( ( rule__Claim__NameAssignment_2 ) )
            {
            // InternalSecurityDsl.g:4947:1: ( ( rule__Claim__NameAssignment_2 ) )
            // InternalSecurityDsl.g:4948:2: ( rule__Claim__NameAssignment_2 )
            {
             before(grammarAccess.getClaimAccess().getNameAssignment_2()); 
            // InternalSecurityDsl.g:4949:2: ( rule__Claim__NameAssignment_2 )
            // InternalSecurityDsl.g:4949:3: rule__Claim__NameAssignment_2
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
    // InternalSecurityDsl.g:4957:1: rule__Claim__Group__3 : rule__Claim__Group__3__Impl rule__Claim__Group__4 ;
    public final void rule__Claim__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4961:1: ( rule__Claim__Group__3__Impl rule__Claim__Group__4 )
            // InternalSecurityDsl.g:4962:2: rule__Claim__Group__3__Impl rule__Claim__Group__4
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
    // InternalSecurityDsl.g:4969:1: rule__Claim__Group__3__Impl : ( ':' ) ;
    public final void rule__Claim__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4973:1: ( ( ':' ) )
            // InternalSecurityDsl.g:4974:1: ( ':' )
            {
            // InternalSecurityDsl.g:4974:1: ( ':' )
            // InternalSecurityDsl.g:4975:2: ':'
            {
             before(grammarAccess.getClaimAccess().getColonKeyword_3()); 
            match(input,83,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4984:1: rule__Claim__Group__4 : rule__Claim__Group__4__Impl rule__Claim__Group__5 ;
    public final void rule__Claim__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4988:1: ( rule__Claim__Group__4__Impl rule__Claim__Group__5 )
            // InternalSecurityDsl.g:4989:2: rule__Claim__Group__4__Impl rule__Claim__Group__5
            {
            pushFollow(FOLLOW_40);
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
    // InternalSecurityDsl.g:4996:1: rule__Claim__Group__4__Impl : ( ( rule__Claim__Claim_attributeAssignment_4 ) ) ;
    public final void rule__Claim__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5000:1: ( ( ( rule__Claim__Claim_attributeAssignment_4 ) ) )
            // InternalSecurityDsl.g:5001:1: ( ( rule__Claim__Claim_attributeAssignment_4 ) )
            {
            // InternalSecurityDsl.g:5001:1: ( ( rule__Claim__Claim_attributeAssignment_4 ) )
            // InternalSecurityDsl.g:5002:2: ( rule__Claim__Claim_attributeAssignment_4 )
            {
             before(grammarAccess.getClaimAccess().getClaim_attributeAssignment_4()); 
            // InternalSecurityDsl.g:5003:2: ( rule__Claim__Claim_attributeAssignment_4 )
            // InternalSecurityDsl.g:5003:3: rule__Claim__Claim_attributeAssignment_4
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
    // InternalSecurityDsl.g:5011:1: rule__Claim__Group__5 : rule__Claim__Group__5__Impl ;
    public final void rule__Claim__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5015:1: ( rule__Claim__Group__5__Impl )
            // InternalSecurityDsl.g:5016:2: rule__Claim__Group__5__Impl
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
    // InternalSecurityDsl.g:5022:1: rule__Claim__Group__5__Impl : ( '}' ) ;
    public final void rule__Claim__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5026:1: ( ( '}' ) )
            // InternalSecurityDsl.g:5027:1: ( '}' )
            {
            // InternalSecurityDsl.g:5027:1: ( '}' )
            // InternalSecurityDsl.g:5028:2: '}'
            {
             before(grammarAccess.getClaimAccess().getRightCurlyBracketKeyword_5()); 
            match(input,63,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5038:1: rule__Claim__Group_1__0 : rule__Claim__Group_1__0__Impl rule__Claim__Group_1__1 ;
    public final void rule__Claim__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5042:1: ( rule__Claim__Group_1__0__Impl rule__Claim__Group_1__1 )
            // InternalSecurityDsl.g:5043:2: rule__Claim__Group_1__0__Impl rule__Claim__Group_1__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalSecurityDsl.g:5050:1: rule__Claim__Group_1__0__Impl : ( ( rule__Claim__TypeAssignment_1_0 ) ) ;
    public final void rule__Claim__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5054:1: ( ( ( rule__Claim__TypeAssignment_1_0 ) ) )
            // InternalSecurityDsl.g:5055:1: ( ( rule__Claim__TypeAssignment_1_0 ) )
            {
            // InternalSecurityDsl.g:5055:1: ( ( rule__Claim__TypeAssignment_1_0 ) )
            // InternalSecurityDsl.g:5056:2: ( rule__Claim__TypeAssignment_1_0 )
            {
             before(grammarAccess.getClaimAccess().getTypeAssignment_1_0()); 
            // InternalSecurityDsl.g:5057:2: ( rule__Claim__TypeAssignment_1_0 )
            // InternalSecurityDsl.g:5057:3: rule__Claim__TypeAssignment_1_0
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
    // InternalSecurityDsl.g:5065:1: rule__Claim__Group_1__1 : rule__Claim__Group_1__1__Impl ;
    public final void rule__Claim__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5069:1: ( rule__Claim__Group_1__1__Impl )
            // InternalSecurityDsl.g:5070:2: rule__Claim__Group_1__1__Impl
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
    // InternalSecurityDsl.g:5076:1: rule__Claim__Group_1__1__Impl : ( ',' ) ;
    public final void rule__Claim__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5080:1: ( ( ',' ) )
            // InternalSecurityDsl.g:5081:1: ( ',' )
            {
            // InternalSecurityDsl.g:5081:1: ( ',' )
            // InternalSecurityDsl.g:5082:2: ','
            {
             before(grammarAccess.getClaimAccess().getCommaKeyword_1_1()); 
            match(input,69,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5092:1: rule__RegisteredClaims__Group__0 : rule__RegisteredClaims__Group__0__Impl rule__RegisteredClaims__Group__1 ;
    public final void rule__RegisteredClaims__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5096:1: ( rule__RegisteredClaims__Group__0__Impl rule__RegisteredClaims__Group__1 )
            // InternalSecurityDsl.g:5097:2: rule__RegisteredClaims__Group__0__Impl rule__RegisteredClaims__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalSecurityDsl.g:5104:1: rule__RegisteredClaims__Group__0__Impl : ( '{' ) ;
    public final void rule__RegisteredClaims__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5108:1: ( ( '{' ) )
            // InternalSecurityDsl.g:5109:1: ( '{' )
            {
            // InternalSecurityDsl.g:5109:1: ( '{' )
            // InternalSecurityDsl.g:5110:2: '{'
            {
             before(grammarAccess.getRegisteredClaimsAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5119:1: rule__RegisteredClaims__Group__1 : rule__RegisteredClaims__Group__1__Impl rule__RegisteredClaims__Group__2 ;
    public final void rule__RegisteredClaims__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5123:1: ( rule__RegisteredClaims__Group__1__Impl rule__RegisteredClaims__Group__2 )
            // InternalSecurityDsl.g:5124:2: rule__RegisteredClaims__Group__1__Impl rule__RegisteredClaims__Group__2
            {
            pushFollow(FOLLOW_43);
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
    // InternalSecurityDsl.g:5131:1: rule__RegisteredClaims__Group__1__Impl : ( 'REGISTERED,' ) ;
    public final void rule__RegisteredClaims__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5135:1: ( ( 'REGISTERED,' ) )
            // InternalSecurityDsl.g:5136:1: ( 'REGISTERED,' )
            {
            // InternalSecurityDsl.g:5136:1: ( 'REGISTERED,' )
            // InternalSecurityDsl.g:5137:2: 'REGISTERED,'
            {
             before(grammarAccess.getRegisteredClaimsAccess().getREGISTEREDKeyword_1()); 
            match(input,84,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5146:1: rule__RegisteredClaims__Group__2 : rule__RegisteredClaims__Group__2__Impl rule__RegisteredClaims__Group__3 ;
    public final void rule__RegisteredClaims__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5150:1: ( rule__RegisteredClaims__Group__2__Impl rule__RegisteredClaims__Group__3 )
            // InternalSecurityDsl.g:5151:2: rule__RegisteredClaims__Group__2__Impl rule__RegisteredClaims__Group__3
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
    // InternalSecurityDsl.g:5158:1: rule__RegisteredClaims__Group__2__Impl : ( 'expirationTime:' ) ;
    public final void rule__RegisteredClaims__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5162:1: ( ( 'expirationTime:' ) )
            // InternalSecurityDsl.g:5163:1: ( 'expirationTime:' )
            {
            // InternalSecurityDsl.g:5163:1: ( 'expirationTime:' )
            // InternalSecurityDsl.g:5164:2: 'expirationTime:'
            {
             before(grammarAccess.getRegisteredClaimsAccess().getExpirationTimeKeyword_2()); 
            match(input,85,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5173:1: rule__RegisteredClaims__Group__3 : rule__RegisteredClaims__Group__3__Impl rule__RegisteredClaims__Group__4 ;
    public final void rule__RegisteredClaims__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5177:1: ( rule__RegisteredClaims__Group__3__Impl rule__RegisteredClaims__Group__4 )
            // InternalSecurityDsl.g:5178:2: rule__RegisteredClaims__Group__3__Impl rule__RegisteredClaims__Group__4
            {
            pushFollow(FOLLOW_40);
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
    // InternalSecurityDsl.g:5185:1: rule__RegisteredClaims__Group__3__Impl : ( ( rule__RegisteredClaims__ExpirationTimeAssignment_3 ) ) ;
    public final void rule__RegisteredClaims__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5189:1: ( ( ( rule__RegisteredClaims__ExpirationTimeAssignment_3 ) ) )
            // InternalSecurityDsl.g:5190:1: ( ( rule__RegisteredClaims__ExpirationTimeAssignment_3 ) )
            {
            // InternalSecurityDsl.g:5190:1: ( ( rule__RegisteredClaims__ExpirationTimeAssignment_3 ) )
            // InternalSecurityDsl.g:5191:2: ( rule__RegisteredClaims__ExpirationTimeAssignment_3 )
            {
             before(grammarAccess.getRegisteredClaimsAccess().getExpirationTimeAssignment_3()); 
            // InternalSecurityDsl.g:5192:2: ( rule__RegisteredClaims__ExpirationTimeAssignment_3 )
            // InternalSecurityDsl.g:5192:3: rule__RegisteredClaims__ExpirationTimeAssignment_3
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
    // InternalSecurityDsl.g:5200:1: rule__RegisteredClaims__Group__4 : rule__RegisteredClaims__Group__4__Impl rule__RegisteredClaims__Group__5 ;
    public final void rule__RegisteredClaims__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5204:1: ( rule__RegisteredClaims__Group__4__Impl rule__RegisteredClaims__Group__5 )
            // InternalSecurityDsl.g:5205:2: rule__RegisteredClaims__Group__4__Impl rule__RegisteredClaims__Group__5
            {
            pushFollow(FOLLOW_41);
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
    // InternalSecurityDsl.g:5212:1: rule__RegisteredClaims__Group__4__Impl : ( '}' ) ;
    public final void rule__RegisteredClaims__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5216:1: ( ( '}' ) )
            // InternalSecurityDsl.g:5217:1: ( '}' )
            {
            // InternalSecurityDsl.g:5217:1: ( '}' )
            // InternalSecurityDsl.g:5218:2: '}'
            {
             before(grammarAccess.getRegisteredClaimsAccess().getRightCurlyBracketKeyword_4()); 
            match(input,63,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5227:1: rule__RegisteredClaims__Group__5 : rule__RegisteredClaims__Group__5__Impl rule__RegisteredClaims__Group__6 ;
    public final void rule__RegisteredClaims__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5231:1: ( rule__RegisteredClaims__Group__5__Impl rule__RegisteredClaims__Group__6 )
            // InternalSecurityDsl.g:5232:2: rule__RegisteredClaims__Group__5__Impl rule__RegisteredClaims__Group__6
            {
            pushFollow(FOLLOW_41);
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
    // InternalSecurityDsl.g:5239:1: rule__RegisteredClaims__Group__5__Impl : ( ( rule__RegisteredClaims__Group_5__0 )? ) ;
    public final void rule__RegisteredClaims__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5243:1: ( ( ( rule__RegisteredClaims__Group_5__0 )? ) )
            // InternalSecurityDsl.g:5244:1: ( ( rule__RegisteredClaims__Group_5__0 )? )
            {
            // InternalSecurityDsl.g:5244:1: ( ( rule__RegisteredClaims__Group_5__0 )? )
            // InternalSecurityDsl.g:5245:2: ( rule__RegisteredClaims__Group_5__0 )?
            {
             before(grammarAccess.getRegisteredClaimsAccess().getGroup_5()); 
            // InternalSecurityDsl.g:5246:2: ( rule__RegisteredClaims__Group_5__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==69) ) {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==61) ) {
                    int LA46_3 = input.LA(3);

                    if ( (LA46_3==84) ) {
                        int LA46_4 = input.LA(4);

                        if ( (LA46_4==86) ) {
                            alt46=1;
                        }
                    }
                }
            }
            switch (alt46) {
                case 1 :
                    // InternalSecurityDsl.g:5246:3: rule__RegisteredClaims__Group_5__0
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
    // InternalSecurityDsl.g:5254:1: rule__RegisteredClaims__Group__6 : rule__RegisteredClaims__Group__6__Impl ;
    public final void rule__RegisteredClaims__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5258:1: ( rule__RegisteredClaims__Group__6__Impl )
            // InternalSecurityDsl.g:5259:2: rule__RegisteredClaims__Group__6__Impl
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
    // InternalSecurityDsl.g:5265:1: rule__RegisteredClaims__Group__6__Impl : ( ( rule__RegisteredClaims__Group_6__0 )? ) ;
    public final void rule__RegisteredClaims__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5269:1: ( ( ( rule__RegisteredClaims__Group_6__0 )? ) )
            // InternalSecurityDsl.g:5270:1: ( ( rule__RegisteredClaims__Group_6__0 )? )
            {
            // InternalSecurityDsl.g:5270:1: ( ( rule__RegisteredClaims__Group_6__0 )? )
            // InternalSecurityDsl.g:5271:2: ( rule__RegisteredClaims__Group_6__0 )?
            {
             before(grammarAccess.getRegisteredClaimsAccess().getGroup_6()); 
            // InternalSecurityDsl.g:5272:2: ( rule__RegisteredClaims__Group_6__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==69) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==61) ) {
                    int LA47_3 = input.LA(3);

                    if ( (LA47_3==84) ) {
                        alt47=1;
                    }
                }
            }
            switch (alt47) {
                case 1 :
                    // InternalSecurityDsl.g:5272:3: rule__RegisteredClaims__Group_6__0
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
    // InternalSecurityDsl.g:5281:1: rule__RegisteredClaims__Group_5__0 : rule__RegisteredClaims__Group_5__0__Impl rule__RegisteredClaims__Group_5__1 ;
    public final void rule__RegisteredClaims__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5285:1: ( rule__RegisteredClaims__Group_5__0__Impl rule__RegisteredClaims__Group_5__1 )
            // InternalSecurityDsl.g:5286:2: rule__RegisteredClaims__Group_5__0__Impl rule__RegisteredClaims__Group_5__1
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
    // InternalSecurityDsl.g:5293:1: rule__RegisteredClaims__Group_5__0__Impl : ( ',' ) ;
    public final void rule__RegisteredClaims__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5297:1: ( ( ',' ) )
            // InternalSecurityDsl.g:5298:1: ( ',' )
            {
            // InternalSecurityDsl.g:5298:1: ( ',' )
            // InternalSecurityDsl.g:5299:2: ','
            {
             before(grammarAccess.getRegisteredClaimsAccess().getCommaKeyword_5_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5308:1: rule__RegisteredClaims__Group_5__1 : rule__RegisteredClaims__Group_5__1__Impl rule__RegisteredClaims__Group_5__2 ;
    public final void rule__RegisteredClaims__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5312:1: ( rule__RegisteredClaims__Group_5__1__Impl rule__RegisteredClaims__Group_5__2 )
            // InternalSecurityDsl.g:5313:2: rule__RegisteredClaims__Group_5__1__Impl rule__RegisteredClaims__Group_5__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalSecurityDsl.g:5320:1: rule__RegisteredClaims__Group_5__1__Impl : ( '{' ) ;
    public final void rule__RegisteredClaims__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5324:1: ( ( '{' ) )
            // InternalSecurityDsl.g:5325:1: ( '{' )
            {
            // InternalSecurityDsl.g:5325:1: ( '{' )
            // InternalSecurityDsl.g:5326:2: '{'
            {
             before(grammarAccess.getRegisteredClaimsAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,61,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5335:1: rule__RegisteredClaims__Group_5__2 : rule__RegisteredClaims__Group_5__2__Impl rule__RegisteredClaims__Group_5__3 ;
    public final void rule__RegisteredClaims__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5339:1: ( rule__RegisteredClaims__Group_5__2__Impl rule__RegisteredClaims__Group_5__3 )
            // InternalSecurityDsl.g:5340:2: rule__RegisteredClaims__Group_5__2__Impl rule__RegisteredClaims__Group_5__3
            {
            pushFollow(FOLLOW_44);
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
    // InternalSecurityDsl.g:5347:1: rule__RegisteredClaims__Group_5__2__Impl : ( 'REGISTERED,' ) ;
    public final void rule__RegisteredClaims__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5351:1: ( ( 'REGISTERED,' ) )
            // InternalSecurityDsl.g:5352:1: ( 'REGISTERED,' )
            {
            // InternalSecurityDsl.g:5352:1: ( 'REGISTERED,' )
            // InternalSecurityDsl.g:5353:2: 'REGISTERED,'
            {
             before(grammarAccess.getRegisteredClaimsAccess().getREGISTEREDKeyword_5_2()); 
            match(input,84,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5362:1: rule__RegisteredClaims__Group_5__3 : rule__RegisteredClaims__Group_5__3__Impl rule__RegisteredClaims__Group_5__4 ;
    public final void rule__RegisteredClaims__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5366:1: ( rule__RegisteredClaims__Group_5__3__Impl rule__RegisteredClaims__Group_5__4 )
            // InternalSecurityDsl.g:5367:2: rule__RegisteredClaims__Group_5__3__Impl rule__RegisteredClaims__Group_5__4
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
    // InternalSecurityDsl.g:5374:1: rule__RegisteredClaims__Group_5__3__Impl : ( 'issuer:' ) ;
    public final void rule__RegisteredClaims__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5378:1: ( ( 'issuer:' ) )
            // InternalSecurityDsl.g:5379:1: ( 'issuer:' )
            {
            // InternalSecurityDsl.g:5379:1: ( 'issuer:' )
            // InternalSecurityDsl.g:5380:2: 'issuer:'
            {
             before(grammarAccess.getRegisteredClaimsAccess().getIssuerKeyword_5_3()); 
            match(input,86,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5389:1: rule__RegisteredClaims__Group_5__4 : rule__RegisteredClaims__Group_5__4__Impl rule__RegisteredClaims__Group_5__5 ;
    public final void rule__RegisteredClaims__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5393:1: ( rule__RegisteredClaims__Group_5__4__Impl rule__RegisteredClaims__Group_5__5 )
            // InternalSecurityDsl.g:5394:2: rule__RegisteredClaims__Group_5__4__Impl rule__RegisteredClaims__Group_5__5
            {
            pushFollow(FOLLOW_40);
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
    // InternalSecurityDsl.g:5401:1: rule__RegisteredClaims__Group_5__4__Impl : ( ( rule__RegisteredClaims__IssuerAssignment_5_4 ) ) ;
    public final void rule__RegisteredClaims__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5405:1: ( ( ( rule__RegisteredClaims__IssuerAssignment_5_4 ) ) )
            // InternalSecurityDsl.g:5406:1: ( ( rule__RegisteredClaims__IssuerAssignment_5_4 ) )
            {
            // InternalSecurityDsl.g:5406:1: ( ( rule__RegisteredClaims__IssuerAssignment_5_4 ) )
            // InternalSecurityDsl.g:5407:2: ( rule__RegisteredClaims__IssuerAssignment_5_4 )
            {
             before(grammarAccess.getRegisteredClaimsAccess().getIssuerAssignment_5_4()); 
            // InternalSecurityDsl.g:5408:2: ( rule__RegisteredClaims__IssuerAssignment_5_4 )
            // InternalSecurityDsl.g:5408:3: rule__RegisteredClaims__IssuerAssignment_5_4
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
    // InternalSecurityDsl.g:5416:1: rule__RegisteredClaims__Group_5__5 : rule__RegisteredClaims__Group_5__5__Impl ;
    public final void rule__RegisteredClaims__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5420:1: ( rule__RegisteredClaims__Group_5__5__Impl )
            // InternalSecurityDsl.g:5421:2: rule__RegisteredClaims__Group_5__5__Impl
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
    // InternalSecurityDsl.g:5427:1: rule__RegisteredClaims__Group_5__5__Impl : ( '}' ) ;
    public final void rule__RegisteredClaims__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5431:1: ( ( '}' ) )
            // InternalSecurityDsl.g:5432:1: ( '}' )
            {
            // InternalSecurityDsl.g:5432:1: ( '}' )
            // InternalSecurityDsl.g:5433:2: '}'
            {
             before(grammarAccess.getRegisteredClaimsAccess().getRightCurlyBracketKeyword_5_5()); 
            match(input,63,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5443:1: rule__RegisteredClaims__Group_6__0 : rule__RegisteredClaims__Group_6__0__Impl rule__RegisteredClaims__Group_6__1 ;
    public final void rule__RegisteredClaims__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5447:1: ( rule__RegisteredClaims__Group_6__0__Impl rule__RegisteredClaims__Group_6__1 )
            // InternalSecurityDsl.g:5448:2: rule__RegisteredClaims__Group_6__0__Impl rule__RegisteredClaims__Group_6__1
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
    // InternalSecurityDsl.g:5455:1: rule__RegisteredClaims__Group_6__0__Impl : ( ',' ) ;
    public final void rule__RegisteredClaims__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5459:1: ( ( ',' ) )
            // InternalSecurityDsl.g:5460:1: ( ',' )
            {
            // InternalSecurityDsl.g:5460:1: ( ',' )
            // InternalSecurityDsl.g:5461:2: ','
            {
             before(grammarAccess.getRegisteredClaimsAccess().getCommaKeyword_6_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5470:1: rule__RegisteredClaims__Group_6__1 : rule__RegisteredClaims__Group_6__1__Impl rule__RegisteredClaims__Group_6__2 ;
    public final void rule__RegisteredClaims__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5474:1: ( rule__RegisteredClaims__Group_6__1__Impl rule__RegisteredClaims__Group_6__2 )
            // InternalSecurityDsl.g:5475:2: rule__RegisteredClaims__Group_6__1__Impl rule__RegisteredClaims__Group_6__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalSecurityDsl.g:5482:1: rule__RegisteredClaims__Group_6__1__Impl : ( '{' ) ;
    public final void rule__RegisteredClaims__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5486:1: ( ( '{' ) )
            // InternalSecurityDsl.g:5487:1: ( '{' )
            {
            // InternalSecurityDsl.g:5487:1: ( '{' )
            // InternalSecurityDsl.g:5488:2: '{'
            {
             before(grammarAccess.getRegisteredClaimsAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,61,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5497:1: rule__RegisteredClaims__Group_6__2 : rule__RegisteredClaims__Group_6__2__Impl rule__RegisteredClaims__Group_6__3 ;
    public final void rule__RegisteredClaims__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5501:1: ( rule__RegisteredClaims__Group_6__2__Impl rule__RegisteredClaims__Group_6__3 )
            // InternalSecurityDsl.g:5502:2: rule__RegisteredClaims__Group_6__2__Impl rule__RegisteredClaims__Group_6__3
            {
            pushFollow(FOLLOW_45);
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
    // InternalSecurityDsl.g:5509:1: rule__RegisteredClaims__Group_6__2__Impl : ( 'REGISTERED,' ) ;
    public final void rule__RegisteredClaims__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5513:1: ( ( 'REGISTERED,' ) )
            // InternalSecurityDsl.g:5514:1: ( 'REGISTERED,' )
            {
            // InternalSecurityDsl.g:5514:1: ( 'REGISTERED,' )
            // InternalSecurityDsl.g:5515:2: 'REGISTERED,'
            {
             before(grammarAccess.getRegisteredClaimsAccess().getREGISTEREDKeyword_6_2()); 
            match(input,84,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5524:1: rule__RegisteredClaims__Group_6__3 : rule__RegisteredClaims__Group_6__3__Impl rule__RegisteredClaims__Group_6__4 ;
    public final void rule__RegisteredClaims__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5528:1: ( rule__RegisteredClaims__Group_6__3__Impl rule__RegisteredClaims__Group_6__4 )
            // InternalSecurityDsl.g:5529:2: rule__RegisteredClaims__Group_6__3__Impl rule__RegisteredClaims__Group_6__4
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
    // InternalSecurityDsl.g:5536:1: rule__RegisteredClaims__Group_6__3__Impl : ( 'audience:' ) ;
    public final void rule__RegisteredClaims__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5540:1: ( ( 'audience:' ) )
            // InternalSecurityDsl.g:5541:1: ( 'audience:' )
            {
            // InternalSecurityDsl.g:5541:1: ( 'audience:' )
            // InternalSecurityDsl.g:5542:2: 'audience:'
            {
             before(grammarAccess.getRegisteredClaimsAccess().getAudienceKeyword_6_3()); 
            match(input,87,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5551:1: rule__RegisteredClaims__Group_6__4 : rule__RegisteredClaims__Group_6__4__Impl rule__RegisteredClaims__Group_6__5 ;
    public final void rule__RegisteredClaims__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5555:1: ( rule__RegisteredClaims__Group_6__4__Impl rule__RegisteredClaims__Group_6__5 )
            // InternalSecurityDsl.g:5556:2: rule__RegisteredClaims__Group_6__4__Impl rule__RegisteredClaims__Group_6__5
            {
            pushFollow(FOLLOW_40);
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
    // InternalSecurityDsl.g:5563:1: rule__RegisteredClaims__Group_6__4__Impl : ( ( rule__RegisteredClaims__AudienceAssignment_6_4 ) ) ;
    public final void rule__RegisteredClaims__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5567:1: ( ( ( rule__RegisteredClaims__AudienceAssignment_6_4 ) ) )
            // InternalSecurityDsl.g:5568:1: ( ( rule__RegisteredClaims__AudienceAssignment_6_4 ) )
            {
            // InternalSecurityDsl.g:5568:1: ( ( rule__RegisteredClaims__AudienceAssignment_6_4 ) )
            // InternalSecurityDsl.g:5569:2: ( rule__RegisteredClaims__AudienceAssignment_6_4 )
            {
             before(grammarAccess.getRegisteredClaimsAccess().getAudienceAssignment_6_4()); 
            // InternalSecurityDsl.g:5570:2: ( rule__RegisteredClaims__AudienceAssignment_6_4 )
            // InternalSecurityDsl.g:5570:3: rule__RegisteredClaims__AudienceAssignment_6_4
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
    // InternalSecurityDsl.g:5578:1: rule__RegisteredClaims__Group_6__5 : rule__RegisteredClaims__Group_6__5__Impl ;
    public final void rule__RegisteredClaims__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5582:1: ( rule__RegisteredClaims__Group_6__5__Impl )
            // InternalSecurityDsl.g:5583:2: rule__RegisteredClaims__Group_6__5__Impl
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
    // InternalSecurityDsl.g:5589:1: rule__RegisteredClaims__Group_6__5__Impl : ( '}' ) ;
    public final void rule__RegisteredClaims__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5593:1: ( ( '}' ) )
            // InternalSecurityDsl.g:5594:1: ( '}' )
            {
            // InternalSecurityDsl.g:5594:1: ( '}' )
            // InternalSecurityDsl.g:5595:2: '}'
            {
             before(grammarAccess.getRegisteredClaimsAccess().getRightCurlyBracketKeyword_6_5()); 
            match(input,63,FOLLOW_2); 
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


    // $ANTLR start "rule__OAuth2__Group__0"
    // InternalSecurityDsl.g:5605:1: rule__OAuth2__Group__0 : rule__OAuth2__Group__0__Impl rule__OAuth2__Group__1 ;
    public final void rule__OAuth2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5609:1: ( rule__OAuth2__Group__0__Impl rule__OAuth2__Group__1 )
            // InternalSecurityDsl.g:5610:2: rule__OAuth2__Group__0__Impl rule__OAuth2__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__OAuth2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OAuth2__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OAuth2__Group__0"


    // $ANTLR start "rule__OAuth2__Group__0__Impl"
    // InternalSecurityDsl.g:5617:1: rule__OAuth2__Group__0__Impl : ( 'OAuth2.0:' ) ;
    public final void rule__OAuth2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5621:1: ( ( 'OAuth2.0:' ) )
            // InternalSecurityDsl.g:5622:1: ( 'OAuth2.0:' )
            {
            // InternalSecurityDsl.g:5622:1: ( 'OAuth2.0:' )
            // InternalSecurityDsl.g:5623:2: 'OAuth2.0:'
            {
             before(grammarAccess.getOAuth2Access().getOAuth20Keyword_0()); 
            match(input,88,FOLLOW_2); 
             after(grammarAccess.getOAuth2Access().getOAuth20Keyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OAuth2__Group__0__Impl"


    // $ANTLR start "rule__OAuth2__Group__1"
    // InternalSecurityDsl.g:5632:1: rule__OAuth2__Group__1 : rule__OAuth2__Group__1__Impl rule__OAuth2__Group__2 ;
    public final void rule__OAuth2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5636:1: ( rule__OAuth2__Group__1__Impl rule__OAuth2__Group__2 )
            // InternalSecurityDsl.g:5637:2: rule__OAuth2__Group__1__Impl rule__OAuth2__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__OAuth2__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OAuth2__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OAuth2__Group__1"


    // $ANTLR start "rule__OAuth2__Group__1__Impl"
    // InternalSecurityDsl.g:5644:1: rule__OAuth2__Group__1__Impl : ( 'providers:' ) ;
    public final void rule__OAuth2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5648:1: ( ( 'providers:' ) )
            // InternalSecurityDsl.g:5649:1: ( 'providers:' )
            {
            // InternalSecurityDsl.g:5649:1: ( 'providers:' )
            // InternalSecurityDsl.g:5650:2: 'providers:'
            {
             before(grammarAccess.getOAuth2Access().getProvidersKeyword_1()); 
            match(input,89,FOLLOW_2); 
             after(grammarAccess.getOAuth2Access().getProvidersKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OAuth2__Group__1__Impl"


    // $ANTLR start "rule__OAuth2__Group__2"
    // InternalSecurityDsl.g:5659:1: rule__OAuth2__Group__2 : rule__OAuth2__Group__2__Impl rule__OAuth2__Group__3 ;
    public final void rule__OAuth2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5663:1: ( rule__OAuth2__Group__2__Impl rule__OAuth2__Group__3 )
            // InternalSecurityDsl.g:5664:2: rule__OAuth2__Group__2__Impl rule__OAuth2__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__OAuth2__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OAuth2__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OAuth2__Group__2"


    // $ANTLR start "rule__OAuth2__Group__2__Impl"
    // InternalSecurityDsl.g:5671:1: rule__OAuth2__Group__2__Impl : ( '[' ) ;
    public final void rule__OAuth2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5675:1: ( ( '[' ) )
            // InternalSecurityDsl.g:5676:1: ( '[' )
            {
            // InternalSecurityDsl.g:5676:1: ( '[' )
            // InternalSecurityDsl.g:5677:2: '['
            {
             before(grammarAccess.getOAuth2Access().getLeftSquareBracketKeyword_2()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getOAuth2Access().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OAuth2__Group__2__Impl"


    // $ANTLR start "rule__OAuth2__Group__3"
    // InternalSecurityDsl.g:5686:1: rule__OAuth2__Group__3 : rule__OAuth2__Group__3__Impl rule__OAuth2__Group__4 ;
    public final void rule__OAuth2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5690:1: ( rule__OAuth2__Group__3__Impl rule__OAuth2__Group__4 )
            // InternalSecurityDsl.g:5691:2: rule__OAuth2__Group__3__Impl rule__OAuth2__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__OAuth2__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OAuth2__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OAuth2__Group__3"


    // $ANTLR start "rule__OAuth2__Group__3__Impl"
    // InternalSecurityDsl.g:5698:1: rule__OAuth2__Group__3__Impl : ( ( rule__OAuth2__ProvidersAssignment_3 ) ) ;
    public final void rule__OAuth2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5702:1: ( ( ( rule__OAuth2__ProvidersAssignment_3 ) ) )
            // InternalSecurityDsl.g:5703:1: ( ( rule__OAuth2__ProvidersAssignment_3 ) )
            {
            // InternalSecurityDsl.g:5703:1: ( ( rule__OAuth2__ProvidersAssignment_3 ) )
            // InternalSecurityDsl.g:5704:2: ( rule__OAuth2__ProvidersAssignment_3 )
            {
             before(grammarAccess.getOAuth2Access().getProvidersAssignment_3()); 
            // InternalSecurityDsl.g:5705:2: ( rule__OAuth2__ProvidersAssignment_3 )
            // InternalSecurityDsl.g:5705:3: rule__OAuth2__ProvidersAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__OAuth2__ProvidersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOAuth2Access().getProvidersAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OAuth2__Group__3__Impl"


    // $ANTLR start "rule__OAuth2__Group__4"
    // InternalSecurityDsl.g:5713:1: rule__OAuth2__Group__4 : rule__OAuth2__Group__4__Impl rule__OAuth2__Group__5 ;
    public final void rule__OAuth2__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5717:1: ( rule__OAuth2__Group__4__Impl rule__OAuth2__Group__5 )
            // InternalSecurityDsl.g:5718:2: rule__OAuth2__Group__4__Impl rule__OAuth2__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__OAuth2__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OAuth2__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OAuth2__Group__4"


    // $ANTLR start "rule__OAuth2__Group__4__Impl"
    // InternalSecurityDsl.g:5725:1: rule__OAuth2__Group__4__Impl : ( ( rule__OAuth2__Group_4__0 )* ) ;
    public final void rule__OAuth2__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5729:1: ( ( ( rule__OAuth2__Group_4__0 )* ) )
            // InternalSecurityDsl.g:5730:1: ( ( rule__OAuth2__Group_4__0 )* )
            {
            // InternalSecurityDsl.g:5730:1: ( ( rule__OAuth2__Group_4__0 )* )
            // InternalSecurityDsl.g:5731:2: ( rule__OAuth2__Group_4__0 )*
            {
             before(grammarAccess.getOAuth2Access().getGroup_4()); 
            // InternalSecurityDsl.g:5732:2: ( rule__OAuth2__Group_4__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==69) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalSecurityDsl.g:5732:3: rule__OAuth2__Group_4__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__OAuth2__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getOAuth2Access().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OAuth2__Group__4__Impl"


    // $ANTLR start "rule__OAuth2__Group__5"
    // InternalSecurityDsl.g:5740:1: rule__OAuth2__Group__5 : rule__OAuth2__Group__5__Impl ;
    public final void rule__OAuth2__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5744:1: ( rule__OAuth2__Group__5__Impl )
            // InternalSecurityDsl.g:5745:2: rule__OAuth2__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OAuth2__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OAuth2__Group__5"


    // $ANTLR start "rule__OAuth2__Group__5__Impl"
    // InternalSecurityDsl.g:5751:1: rule__OAuth2__Group__5__Impl : ( ']' ) ;
    public final void rule__OAuth2__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5755:1: ( ( ']' ) )
            // InternalSecurityDsl.g:5756:1: ( ']' )
            {
            // InternalSecurityDsl.g:5756:1: ( ']' )
            // InternalSecurityDsl.g:5757:2: ']'
            {
             before(grammarAccess.getOAuth2Access().getRightSquareBracketKeyword_5()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getOAuth2Access().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OAuth2__Group__5__Impl"


    // $ANTLR start "rule__OAuth2__Group_4__0"
    // InternalSecurityDsl.g:5767:1: rule__OAuth2__Group_4__0 : rule__OAuth2__Group_4__0__Impl rule__OAuth2__Group_4__1 ;
    public final void rule__OAuth2__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5771:1: ( rule__OAuth2__Group_4__0__Impl rule__OAuth2__Group_4__1 )
            // InternalSecurityDsl.g:5772:2: rule__OAuth2__Group_4__0__Impl rule__OAuth2__Group_4__1
            {
            pushFollow(FOLLOW_23);
            rule__OAuth2__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OAuth2__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OAuth2__Group_4__0"


    // $ANTLR start "rule__OAuth2__Group_4__0__Impl"
    // InternalSecurityDsl.g:5779:1: rule__OAuth2__Group_4__0__Impl : ( ',' ) ;
    public final void rule__OAuth2__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5783:1: ( ( ',' ) )
            // InternalSecurityDsl.g:5784:1: ( ',' )
            {
            // InternalSecurityDsl.g:5784:1: ( ',' )
            // InternalSecurityDsl.g:5785:2: ','
            {
             before(grammarAccess.getOAuth2Access().getCommaKeyword_4_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getOAuth2Access().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OAuth2__Group_4__0__Impl"


    // $ANTLR start "rule__OAuth2__Group_4__1"
    // InternalSecurityDsl.g:5794:1: rule__OAuth2__Group_4__1 : rule__OAuth2__Group_4__1__Impl ;
    public final void rule__OAuth2__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5798:1: ( rule__OAuth2__Group_4__1__Impl )
            // InternalSecurityDsl.g:5799:2: rule__OAuth2__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OAuth2__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OAuth2__Group_4__1"


    // $ANTLR start "rule__OAuth2__Group_4__1__Impl"
    // InternalSecurityDsl.g:5805:1: rule__OAuth2__Group_4__1__Impl : ( ( rule__OAuth2__ProvidersAssignment_4_1 ) ) ;
    public final void rule__OAuth2__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5809:1: ( ( ( rule__OAuth2__ProvidersAssignment_4_1 ) ) )
            // InternalSecurityDsl.g:5810:1: ( ( rule__OAuth2__ProvidersAssignment_4_1 ) )
            {
            // InternalSecurityDsl.g:5810:1: ( ( rule__OAuth2__ProvidersAssignment_4_1 ) )
            // InternalSecurityDsl.g:5811:2: ( rule__OAuth2__ProvidersAssignment_4_1 )
            {
             before(grammarAccess.getOAuth2Access().getProvidersAssignment_4_1()); 
            // InternalSecurityDsl.g:5812:2: ( rule__OAuth2__ProvidersAssignment_4_1 )
            // InternalSecurityDsl.g:5812:3: rule__OAuth2__ProvidersAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__OAuth2__ProvidersAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOAuth2Access().getProvidersAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OAuth2__Group_4__1__Impl"


    // $ANTLR start "rule__Provider__Group__0"
    // InternalSecurityDsl.g:5821:1: rule__Provider__Group__0 : rule__Provider__Group__0__Impl rule__Provider__Group__1 ;
    public final void rule__Provider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5825:1: ( rule__Provider__Group__0__Impl rule__Provider__Group__1 )
            // InternalSecurityDsl.g:5826:2: rule__Provider__Group__0__Impl rule__Provider__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Provider__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Provider__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__0"


    // $ANTLR start "rule__Provider__Group__0__Impl"
    // InternalSecurityDsl.g:5833:1: rule__Provider__Group__0__Impl : ( '{' ) ;
    public final void rule__Provider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5837:1: ( ( '{' ) )
            // InternalSecurityDsl.g:5838:1: ( '{' )
            {
            // InternalSecurityDsl.g:5838:1: ( '{' )
            // InternalSecurityDsl.g:5839:2: '{'
            {
             before(grammarAccess.getProviderAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getProviderAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__0__Impl"


    // $ANTLR start "rule__Provider__Group__1"
    // InternalSecurityDsl.g:5848:1: rule__Provider__Group__1 : rule__Provider__Group__1__Impl rule__Provider__Group__2 ;
    public final void rule__Provider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5852:1: ( rule__Provider__Group__1__Impl rule__Provider__Group__2 )
            // InternalSecurityDsl.g:5853:2: rule__Provider__Group__1__Impl rule__Provider__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__Provider__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Provider__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__1"


    // $ANTLR start "rule__Provider__Group__1__Impl"
    // InternalSecurityDsl.g:5860:1: rule__Provider__Group__1__Impl : ( 'name:' ) ;
    public final void rule__Provider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5864:1: ( ( 'name:' ) )
            // InternalSecurityDsl.g:5865:1: ( 'name:' )
            {
            // InternalSecurityDsl.g:5865:1: ( 'name:' )
            // InternalSecurityDsl.g:5866:2: 'name:'
            {
             before(grammarAccess.getProviderAccess().getNameKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getProviderAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__1__Impl"


    // $ANTLR start "rule__Provider__Group__2"
    // InternalSecurityDsl.g:5875:1: rule__Provider__Group__2 : rule__Provider__Group__2__Impl rule__Provider__Group__3 ;
    public final void rule__Provider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5879:1: ( rule__Provider__Group__2__Impl rule__Provider__Group__3 )
            // InternalSecurityDsl.g:5880:2: rule__Provider__Group__2__Impl rule__Provider__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__Provider__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Provider__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__2"


    // $ANTLR start "rule__Provider__Group__2__Impl"
    // InternalSecurityDsl.g:5887:1: rule__Provider__Group__2__Impl : ( ( rule__Provider__NameAssignment_2 ) ) ;
    public final void rule__Provider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5891:1: ( ( ( rule__Provider__NameAssignment_2 ) ) )
            // InternalSecurityDsl.g:5892:1: ( ( rule__Provider__NameAssignment_2 ) )
            {
            // InternalSecurityDsl.g:5892:1: ( ( rule__Provider__NameAssignment_2 ) )
            // InternalSecurityDsl.g:5893:2: ( rule__Provider__NameAssignment_2 )
            {
             before(grammarAccess.getProviderAccess().getNameAssignment_2()); 
            // InternalSecurityDsl.g:5894:2: ( rule__Provider__NameAssignment_2 )
            // InternalSecurityDsl.g:5894:3: rule__Provider__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Provider__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProviderAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__2__Impl"


    // $ANTLR start "rule__Provider__Group__3"
    // InternalSecurityDsl.g:5902:1: rule__Provider__Group__3 : rule__Provider__Group__3__Impl rule__Provider__Group__4 ;
    public final void rule__Provider__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5906:1: ( rule__Provider__Group__3__Impl rule__Provider__Group__4 )
            // InternalSecurityDsl.g:5907:2: rule__Provider__Group__3__Impl rule__Provider__Group__4
            {
            pushFollow(FOLLOW_48);
            rule__Provider__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Provider__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__3"


    // $ANTLR start "rule__Provider__Group__3__Impl"
    // InternalSecurityDsl.g:5914:1: rule__Provider__Group__3__Impl : ( ',' ) ;
    public final void rule__Provider__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5918:1: ( ( ',' ) )
            // InternalSecurityDsl.g:5919:1: ( ',' )
            {
            // InternalSecurityDsl.g:5919:1: ( ',' )
            // InternalSecurityDsl.g:5920:2: ','
            {
             before(grammarAccess.getProviderAccess().getCommaKeyword_3()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getProviderAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__3__Impl"


    // $ANTLR start "rule__Provider__Group__4"
    // InternalSecurityDsl.g:5929:1: rule__Provider__Group__4 : rule__Provider__Group__4__Impl rule__Provider__Group__5 ;
    public final void rule__Provider__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5933:1: ( rule__Provider__Group__4__Impl rule__Provider__Group__5 )
            // InternalSecurityDsl.g:5934:2: rule__Provider__Group__4__Impl rule__Provider__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Provider__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Provider__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__4"


    // $ANTLR start "rule__Provider__Group__4__Impl"
    // InternalSecurityDsl.g:5941:1: rule__Provider__Group__4__Impl : ( 'clientId:' ) ;
    public final void rule__Provider__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5945:1: ( ( 'clientId:' ) )
            // InternalSecurityDsl.g:5946:1: ( 'clientId:' )
            {
            // InternalSecurityDsl.g:5946:1: ( 'clientId:' )
            // InternalSecurityDsl.g:5947:2: 'clientId:'
            {
             before(grammarAccess.getProviderAccess().getClientIdKeyword_4()); 
            match(input,90,FOLLOW_2); 
             after(grammarAccess.getProviderAccess().getClientIdKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__4__Impl"


    // $ANTLR start "rule__Provider__Group__5"
    // InternalSecurityDsl.g:5956:1: rule__Provider__Group__5 : rule__Provider__Group__5__Impl rule__Provider__Group__6 ;
    public final void rule__Provider__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5960:1: ( rule__Provider__Group__5__Impl rule__Provider__Group__6 )
            // InternalSecurityDsl.g:5961:2: rule__Provider__Group__5__Impl rule__Provider__Group__6
            {
            pushFollow(FOLLOW_41);
            rule__Provider__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Provider__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__5"


    // $ANTLR start "rule__Provider__Group__5__Impl"
    // InternalSecurityDsl.g:5968:1: rule__Provider__Group__5__Impl : ( ( rule__Provider__ClientIdAssignment_5 ) ) ;
    public final void rule__Provider__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5972:1: ( ( ( rule__Provider__ClientIdAssignment_5 ) ) )
            // InternalSecurityDsl.g:5973:1: ( ( rule__Provider__ClientIdAssignment_5 ) )
            {
            // InternalSecurityDsl.g:5973:1: ( ( rule__Provider__ClientIdAssignment_5 ) )
            // InternalSecurityDsl.g:5974:2: ( rule__Provider__ClientIdAssignment_5 )
            {
             before(grammarAccess.getProviderAccess().getClientIdAssignment_5()); 
            // InternalSecurityDsl.g:5975:2: ( rule__Provider__ClientIdAssignment_5 )
            // InternalSecurityDsl.g:5975:3: rule__Provider__ClientIdAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Provider__ClientIdAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getProviderAccess().getClientIdAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__5__Impl"


    // $ANTLR start "rule__Provider__Group__6"
    // InternalSecurityDsl.g:5983:1: rule__Provider__Group__6 : rule__Provider__Group__6__Impl rule__Provider__Group__7 ;
    public final void rule__Provider__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5987:1: ( rule__Provider__Group__6__Impl rule__Provider__Group__7 )
            // InternalSecurityDsl.g:5988:2: rule__Provider__Group__6__Impl rule__Provider__Group__7
            {
            pushFollow(FOLLOW_49);
            rule__Provider__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Provider__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__6"


    // $ANTLR start "rule__Provider__Group__6__Impl"
    // InternalSecurityDsl.g:5995:1: rule__Provider__Group__6__Impl : ( ',' ) ;
    public final void rule__Provider__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5999:1: ( ( ',' ) )
            // InternalSecurityDsl.g:6000:1: ( ',' )
            {
            // InternalSecurityDsl.g:6000:1: ( ',' )
            // InternalSecurityDsl.g:6001:2: ','
            {
             before(grammarAccess.getProviderAccess().getCommaKeyword_6()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getProviderAccess().getCommaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__6__Impl"


    // $ANTLR start "rule__Provider__Group__7"
    // InternalSecurityDsl.g:6010:1: rule__Provider__Group__7 : rule__Provider__Group__7__Impl rule__Provider__Group__8 ;
    public final void rule__Provider__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6014:1: ( rule__Provider__Group__7__Impl rule__Provider__Group__8 )
            // InternalSecurityDsl.g:6015:2: rule__Provider__Group__7__Impl rule__Provider__Group__8
            {
            pushFollow(FOLLOW_5);
            rule__Provider__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Provider__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__7"


    // $ANTLR start "rule__Provider__Group__7__Impl"
    // InternalSecurityDsl.g:6022:1: rule__Provider__Group__7__Impl : ( 'clientSecret:' ) ;
    public final void rule__Provider__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6026:1: ( ( 'clientSecret:' ) )
            // InternalSecurityDsl.g:6027:1: ( 'clientSecret:' )
            {
            // InternalSecurityDsl.g:6027:1: ( 'clientSecret:' )
            // InternalSecurityDsl.g:6028:2: 'clientSecret:'
            {
             before(grammarAccess.getProviderAccess().getClientSecretKeyword_7()); 
            match(input,91,FOLLOW_2); 
             after(grammarAccess.getProviderAccess().getClientSecretKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__7__Impl"


    // $ANTLR start "rule__Provider__Group__8"
    // InternalSecurityDsl.g:6037:1: rule__Provider__Group__8 : rule__Provider__Group__8__Impl rule__Provider__Group__9 ;
    public final void rule__Provider__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6041:1: ( rule__Provider__Group__8__Impl rule__Provider__Group__9 )
            // InternalSecurityDsl.g:6042:2: rule__Provider__Group__8__Impl rule__Provider__Group__9
            {
            pushFollow(FOLLOW_50);
            rule__Provider__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Provider__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__8"


    // $ANTLR start "rule__Provider__Group__8__Impl"
    // InternalSecurityDsl.g:6049:1: rule__Provider__Group__8__Impl : ( ( rule__Provider__ClientSecretAssignment_8 ) ) ;
    public final void rule__Provider__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6053:1: ( ( ( rule__Provider__ClientSecretAssignment_8 ) ) )
            // InternalSecurityDsl.g:6054:1: ( ( rule__Provider__ClientSecretAssignment_8 ) )
            {
            // InternalSecurityDsl.g:6054:1: ( ( rule__Provider__ClientSecretAssignment_8 ) )
            // InternalSecurityDsl.g:6055:2: ( rule__Provider__ClientSecretAssignment_8 )
            {
             before(grammarAccess.getProviderAccess().getClientSecretAssignment_8()); 
            // InternalSecurityDsl.g:6056:2: ( rule__Provider__ClientSecretAssignment_8 )
            // InternalSecurityDsl.g:6056:3: rule__Provider__ClientSecretAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Provider__ClientSecretAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getProviderAccess().getClientSecretAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__8__Impl"


    // $ANTLR start "rule__Provider__Group__9"
    // InternalSecurityDsl.g:6064:1: rule__Provider__Group__9 : rule__Provider__Group__9__Impl rule__Provider__Group__10 ;
    public final void rule__Provider__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6068:1: ( rule__Provider__Group__9__Impl rule__Provider__Group__10 )
            // InternalSecurityDsl.g:6069:2: rule__Provider__Group__9__Impl rule__Provider__Group__10
            {
            pushFollow(FOLLOW_50);
            rule__Provider__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Provider__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__9"


    // $ANTLR start "rule__Provider__Group__9__Impl"
    // InternalSecurityDsl.g:6076:1: rule__Provider__Group__9__Impl : ( ( rule__Provider__Group_9__0 )? ) ;
    public final void rule__Provider__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6080:1: ( ( ( rule__Provider__Group_9__0 )? ) )
            // InternalSecurityDsl.g:6081:1: ( ( rule__Provider__Group_9__0 )? )
            {
            // InternalSecurityDsl.g:6081:1: ( ( rule__Provider__Group_9__0 )? )
            // InternalSecurityDsl.g:6082:2: ( rule__Provider__Group_9__0 )?
            {
             before(grammarAccess.getProviderAccess().getGroup_9()); 
            // InternalSecurityDsl.g:6083:2: ( rule__Provider__Group_9__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==69) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalSecurityDsl.g:6083:3: rule__Provider__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Provider__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProviderAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__9__Impl"


    // $ANTLR start "rule__Provider__Group__10"
    // InternalSecurityDsl.g:6091:1: rule__Provider__Group__10 : rule__Provider__Group__10__Impl ;
    public final void rule__Provider__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6095:1: ( rule__Provider__Group__10__Impl )
            // InternalSecurityDsl.g:6096:2: rule__Provider__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Provider__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__10"


    // $ANTLR start "rule__Provider__Group__10__Impl"
    // InternalSecurityDsl.g:6102:1: rule__Provider__Group__10__Impl : ( '}' ) ;
    public final void rule__Provider__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6106:1: ( ( '}' ) )
            // InternalSecurityDsl.g:6107:1: ( '}' )
            {
            // InternalSecurityDsl.g:6107:1: ( '}' )
            // InternalSecurityDsl.g:6108:2: '}'
            {
             before(grammarAccess.getProviderAccess().getRightCurlyBracketKeyword_10()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getProviderAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__10__Impl"


    // $ANTLR start "rule__Provider__Group_9__0"
    // InternalSecurityDsl.g:6118:1: rule__Provider__Group_9__0 : rule__Provider__Group_9__0__Impl rule__Provider__Group_9__1 ;
    public final void rule__Provider__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6122:1: ( rule__Provider__Group_9__0__Impl rule__Provider__Group_9__1 )
            // InternalSecurityDsl.g:6123:2: rule__Provider__Group_9__0__Impl rule__Provider__Group_9__1
            {
            pushFollow(FOLLOW_51);
            rule__Provider__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Provider__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group_9__0"


    // $ANTLR start "rule__Provider__Group_9__0__Impl"
    // InternalSecurityDsl.g:6130:1: rule__Provider__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Provider__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6134:1: ( ( ',' ) )
            // InternalSecurityDsl.g:6135:1: ( ',' )
            {
            // InternalSecurityDsl.g:6135:1: ( ',' )
            // InternalSecurityDsl.g:6136:2: ','
            {
             before(grammarAccess.getProviderAccess().getCommaKeyword_9_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getProviderAccess().getCommaKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group_9__0__Impl"


    // $ANTLR start "rule__Provider__Group_9__1"
    // InternalSecurityDsl.g:6145:1: rule__Provider__Group_9__1 : rule__Provider__Group_9__1__Impl rule__Provider__Group_9__2 ;
    public final void rule__Provider__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6149:1: ( rule__Provider__Group_9__1__Impl rule__Provider__Group_9__2 )
            // InternalSecurityDsl.g:6150:2: rule__Provider__Group_9__1__Impl rule__Provider__Group_9__2
            {
            pushFollow(FOLLOW_5);
            rule__Provider__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Provider__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group_9__1"


    // $ANTLR start "rule__Provider__Group_9__1__Impl"
    // InternalSecurityDsl.g:6157:1: rule__Provider__Group_9__1__Impl : ( 'redirectUri:' ) ;
    public final void rule__Provider__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6161:1: ( ( 'redirectUri:' ) )
            // InternalSecurityDsl.g:6162:1: ( 'redirectUri:' )
            {
            // InternalSecurityDsl.g:6162:1: ( 'redirectUri:' )
            // InternalSecurityDsl.g:6163:2: 'redirectUri:'
            {
             before(grammarAccess.getProviderAccess().getRedirectUriKeyword_9_1()); 
            match(input,92,FOLLOW_2); 
             after(grammarAccess.getProviderAccess().getRedirectUriKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group_9__1__Impl"


    // $ANTLR start "rule__Provider__Group_9__2"
    // InternalSecurityDsl.g:6172:1: rule__Provider__Group_9__2 : rule__Provider__Group_9__2__Impl ;
    public final void rule__Provider__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6176:1: ( rule__Provider__Group_9__2__Impl )
            // InternalSecurityDsl.g:6177:2: rule__Provider__Group_9__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Provider__Group_9__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group_9__2"


    // $ANTLR start "rule__Provider__Group_9__2__Impl"
    // InternalSecurityDsl.g:6183:1: rule__Provider__Group_9__2__Impl : ( ( rule__Provider__RedirectUriAssignment_9_2 ) ) ;
    public final void rule__Provider__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6187:1: ( ( ( rule__Provider__RedirectUriAssignment_9_2 ) ) )
            // InternalSecurityDsl.g:6188:1: ( ( rule__Provider__RedirectUriAssignment_9_2 ) )
            {
            // InternalSecurityDsl.g:6188:1: ( ( rule__Provider__RedirectUriAssignment_9_2 ) )
            // InternalSecurityDsl.g:6189:2: ( rule__Provider__RedirectUriAssignment_9_2 )
            {
             before(grammarAccess.getProviderAccess().getRedirectUriAssignment_9_2()); 
            // InternalSecurityDsl.g:6190:2: ( rule__Provider__RedirectUriAssignment_9_2 )
            // InternalSecurityDsl.g:6190:3: rule__Provider__RedirectUriAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__Provider__RedirectUriAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getProviderAccess().getRedirectUriAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group_9__2__Impl"


    // $ANTLR start "rule__BasicAuthentication__Group__0"
    // InternalSecurityDsl.g:6199:1: rule__BasicAuthentication__Group__0 : rule__BasicAuthentication__Group__0__Impl rule__BasicAuthentication__Group__1 ;
    public final void rule__BasicAuthentication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6203:1: ( rule__BasicAuthentication__Group__0__Impl rule__BasicAuthentication__Group__1 )
            // InternalSecurityDsl.g:6204:2: rule__BasicAuthentication__Group__0__Impl rule__BasicAuthentication__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__BasicAuthentication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicAuthentication__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicAuthentication__Group__0"


    // $ANTLR start "rule__BasicAuthentication__Group__0__Impl"
    // InternalSecurityDsl.g:6211:1: rule__BasicAuthentication__Group__0__Impl : ( () ) ;
    public final void rule__BasicAuthentication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6215:1: ( ( () ) )
            // InternalSecurityDsl.g:6216:1: ( () )
            {
            // InternalSecurityDsl.g:6216:1: ( () )
            // InternalSecurityDsl.g:6217:2: ()
            {
             before(grammarAccess.getBasicAuthenticationAccess().getBasicAuthenticationAction_0()); 
            // InternalSecurityDsl.g:6218:2: ()
            // InternalSecurityDsl.g:6218:3: 
            {
            }

             after(grammarAccess.getBasicAuthenticationAccess().getBasicAuthenticationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicAuthentication__Group__0__Impl"


    // $ANTLR start "rule__BasicAuthentication__Group__1"
    // InternalSecurityDsl.g:6226:1: rule__BasicAuthentication__Group__1 : rule__BasicAuthentication__Group__1__Impl ;
    public final void rule__BasicAuthentication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6230:1: ( rule__BasicAuthentication__Group__1__Impl )
            // InternalSecurityDsl.g:6231:2: rule__BasicAuthentication__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicAuthentication__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicAuthentication__Group__1"


    // $ANTLR start "rule__BasicAuthentication__Group__1__Impl"
    // InternalSecurityDsl.g:6237:1: rule__BasicAuthentication__Group__1__Impl : ( 'basicAuthentication' ) ;
    public final void rule__BasicAuthentication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6241:1: ( ( 'basicAuthentication' ) )
            // InternalSecurityDsl.g:6242:1: ( 'basicAuthentication' )
            {
            // InternalSecurityDsl.g:6242:1: ( 'basicAuthentication' )
            // InternalSecurityDsl.g:6243:2: 'basicAuthentication'
            {
             before(grammarAccess.getBasicAuthenticationAccess().getBasicAuthenticationKeyword_1()); 
            match(input,93,FOLLOW_2); 
             after(grammarAccess.getBasicAuthenticationAccess().getBasicAuthenticationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicAuthentication__Group__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalSecurityDsl.g:6253:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6257:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalSecurityDsl.g:6258:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalSecurityDsl.g:6265:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6269:1: ( ( ( '-' )? ) )
            // InternalSecurityDsl.g:6270:1: ( ( '-' )? )
            {
            // InternalSecurityDsl.g:6270:1: ( ( '-' )? )
            // InternalSecurityDsl.g:6271:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalSecurityDsl.g:6272:2: ( '-' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==60) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalSecurityDsl.g:6272:3: '-'
                    {
                    match(input,60,FOLLOW_2); 

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
    // InternalSecurityDsl.g:6280:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6284:1: ( rule__EInt__Group__1__Impl )
            // InternalSecurityDsl.g:6285:2: rule__EInt__Group__1__Impl
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
    // InternalSecurityDsl.g:6291:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6295:1: ( ( RULE_INT ) )
            // InternalSecurityDsl.g:6296:1: ( RULE_INT )
            {
            // InternalSecurityDsl.g:6296:1: ( RULE_INT )
            // InternalSecurityDsl.g:6297:2: RULE_INT
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
    // InternalSecurityDsl.g:6307:1: rule__Application__ArtifactAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Application__ArtifactAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6311:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6312:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6312:2: ( ruleEString )
            // InternalSecurityDsl.g:6313:3: ruleEString
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
    // InternalSecurityDsl.g:6322:1: rule__Application__NameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Application__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6326:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6327:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6327:2: ( ruleEString )
            // InternalSecurityDsl.g:6328:3: ruleEString
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
    // InternalSecurityDsl.g:6337:1: rule__Application__GroupAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Application__GroupAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6341:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6342:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6342:2: ( ruleEString )
            // InternalSecurityDsl.g:6343:3: ruleEString
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
    // InternalSecurityDsl.g:6352:1: rule__Application__PackageNameAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Application__PackageNameAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6356:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6357:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6357:2: ( ruleEString )
            // InternalSecurityDsl.g:6358:3: ruleEString
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
    // InternalSecurityDsl.g:6367:1: rule__Application__DescriptionAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Application__DescriptionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6371:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6372:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6372:2: ( ruleEString )
            // InternalSecurityDsl.g:6373:3: ruleEString
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
    // InternalSecurityDsl.g:6382:1: rule__Application__PortAssignment_7_1 : ( ruleELongObject ) ;
    public final void rule__Application__PortAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6386:1: ( ( ruleELongObject ) )
            // InternalSecurityDsl.g:6387:2: ( ruleELongObject )
            {
            // InternalSecurityDsl.g:6387:2: ( ruleELongObject )
            // InternalSecurityDsl.g:6388:3: ruleELongObject
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
    // InternalSecurityDsl.g:6397:1: rule__Application__HostnameAssignment_8_1 : ( ruleEString ) ;
    public final void rule__Application__HostnameAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6401:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6402:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6402:2: ( ruleEString )
            // InternalSecurityDsl.g:6403:3: ruleEString
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
    // InternalSecurityDsl.g:6412:1: rule__Application__App_databaseAssignment_9_1 : ( ruleDatabase ) ;
    public final void rule__Application__App_databaseAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6416:1: ( ( ruleDatabase ) )
            // InternalSecurityDsl.g:6417:2: ( ruleDatabase )
            {
            // InternalSecurityDsl.g:6417:2: ( ruleDatabase )
            // InternalSecurityDsl.g:6418:3: ruleDatabase
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
    // InternalSecurityDsl.g:6427:1: rule__Application__App_modelsAssignment_10_1_1 : ( ruleUser ) ;
    public final void rule__Application__App_modelsAssignment_10_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6431:1: ( ( ruleUser ) )
            // InternalSecurityDsl.g:6432:2: ( ruleUser )
            {
            // InternalSecurityDsl.g:6432:2: ( ruleUser )
            // InternalSecurityDsl.g:6433:3: ruleUser
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
    // InternalSecurityDsl.g:6442:1: rule__Application__App_modelsAssignment_10_2_1 : ( ruleRole ) ;
    public final void rule__Application__App_modelsAssignment_10_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6446:1: ( ( ruleRole ) )
            // InternalSecurityDsl.g:6447:2: ( ruleRole )
            {
            // InternalSecurityDsl.g:6447:2: ( ruleRole )
            // InternalSecurityDsl.g:6448:3: ruleRole
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
    // InternalSecurityDsl.g:6457:1: rule__Application__App_securityAssignment_11_1 : ( ruleSecurity ) ;
    public final void rule__Application__App_securityAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6461:1: ( ( ruleSecurity ) )
            // InternalSecurityDsl.g:6462:2: ( ruleSecurity )
            {
            // InternalSecurityDsl.g:6462:2: ( ruleSecurity )
            // InternalSecurityDsl.g:6463:3: ruleSecurity
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
    // InternalSecurityDsl.g:6472:1: rule__Application__App_controllersAssignment_12_1_1 : ( ruleAuthentication ) ;
    public final void rule__Application__App_controllersAssignment_12_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6476:1: ( ( ruleAuthentication ) )
            // InternalSecurityDsl.g:6477:2: ( ruleAuthentication )
            {
            // InternalSecurityDsl.g:6477:2: ( ruleAuthentication )
            // InternalSecurityDsl.g:6478:3: ruleAuthentication
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
    // InternalSecurityDsl.g:6487:1: rule__Database__VendorNameAssignment_1 : ( ruleEDatabaseType ) ;
    public final void rule__Database__VendorNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6491:1: ( ( ruleEDatabaseType ) )
            // InternalSecurityDsl.g:6492:2: ( ruleEDatabaseType )
            {
            // InternalSecurityDsl.g:6492:2: ( ruleEDatabaseType )
            // InternalSecurityDsl.g:6493:3: ruleEDatabaseType
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
    // InternalSecurityDsl.g:6502:1: rule__Database__UrlAssignment_3 : ( ruleEString ) ;
    public final void rule__Database__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6506:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6507:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6507:2: ( ruleEString )
            // InternalSecurityDsl.g:6508:3: ruleEString
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
    // InternalSecurityDsl.g:6517:1: rule__Database__UsernameAssignment_5 : ( ruleEString ) ;
    public final void rule__Database__UsernameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6521:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6522:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6522:2: ( ruleEString )
            // InternalSecurityDsl.g:6523:3: ruleEString
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
    // InternalSecurityDsl.g:6532:1: rule__Database__PasswordAssignment_7 : ( ruleEString ) ;
    public final void rule__Database__PasswordAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6536:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6537:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6537:2: ( ruleEString )
            // InternalSecurityDsl.g:6538:3: ruleEString
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


    // $ANTLR start "rule__Attribute__IdentifierAssignment_1"
    // InternalSecurityDsl.g:6547:1: rule__Attribute__IdentifierAssignment_1 : ( ( 'identifier' ) ) ;
    public final void rule__Attribute__IdentifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6551:1: ( ( ( 'identifier' ) ) )
            // InternalSecurityDsl.g:6552:2: ( ( 'identifier' ) )
            {
            // InternalSecurityDsl.g:6552:2: ( ( 'identifier' ) )
            // InternalSecurityDsl.g:6553:3: ( 'identifier' )
            {
             before(grammarAccess.getAttributeAccess().getIdentifierIdentifierKeyword_1_0()); 
            // InternalSecurityDsl.g:6554:3: ( 'identifier' )
            // InternalSecurityDsl.g:6555:4: 'identifier'
            {
             before(grammarAccess.getAttributeAccess().getIdentifierIdentifierKeyword_1_0()); 
            match(input,94,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getIdentifierIdentifierKeyword_1_0()); 

            }

             after(grammarAccess.getAttributeAccess().getIdentifierIdentifierKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__IdentifierAssignment_1"


    // $ANTLR start "rule__Attribute__CredentialAssignment_2"
    // InternalSecurityDsl.g:6566:1: rule__Attribute__CredentialAssignment_2 : ( ( 'credential' ) ) ;
    public final void rule__Attribute__CredentialAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6570:1: ( ( ( 'credential' ) ) )
            // InternalSecurityDsl.g:6571:2: ( ( 'credential' ) )
            {
            // InternalSecurityDsl.g:6571:2: ( ( 'credential' ) )
            // InternalSecurityDsl.g:6572:3: ( 'credential' )
            {
             before(grammarAccess.getAttributeAccess().getCredentialCredentialKeyword_2_0()); 
            // InternalSecurityDsl.g:6573:3: ( 'credential' )
            // InternalSecurityDsl.g:6574:4: 'credential'
            {
             before(grammarAccess.getAttributeAccess().getCredentialCredentialKeyword_2_0()); 
            match(input,95,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getCredentialCredentialKeyword_2_0()); 

            }

             after(grammarAccess.getAttributeAccess().getCredentialCredentialKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__CredentialAssignment_2"


    // $ANTLR start "rule__Attribute__NameAssignment_4"
    // InternalSecurityDsl.g:6585:1: rule__Attribute__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6589:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6590:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6590:2: ( ruleEString )
            // InternalSecurityDsl.g:6591:3: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_4"


    // $ANTLR start "rule__Attribute__TypeAssignment_6"
    // InternalSecurityDsl.g:6600:1: rule__Attribute__TypeAssignment_6 : ( ruleEType ) ;
    public final void rule__Attribute__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6604:1: ( ( ruleEType ) )
            // InternalSecurityDsl.g:6605:2: ( ruleEType )
            {
            // InternalSecurityDsl.g:6605:2: ( ruleEType )
            // InternalSecurityDsl.g:6606:3: ruleEType
            {
             before(grammarAccess.getAttributeAccess().getTypeETypeEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeETypeEnumRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_6"


    // $ANTLR start "rule__Attribute__CollumnNameAssignment_7_1"
    // InternalSecurityDsl.g:6615:1: rule__Attribute__CollumnNameAssignment_7_1 : ( ruleEString ) ;
    public final void rule__Attribute__CollumnNameAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6619:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6620:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6620:2: ( ruleEString )
            // InternalSecurityDsl.g:6621:3: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getCollumnNameEStringParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getCollumnNameEStringParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__CollumnNameAssignment_7_1"


    // $ANTLR start "rule__Role__TableNameAssignment_1_1"
    // InternalSecurityDsl.g:6630:1: rule__Role__TableNameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__Role__TableNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6634:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6635:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6635:2: ( ruleEString )
            // InternalSecurityDsl.g:6636:3: ruleEString
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
    // InternalSecurityDsl.g:6645:1: rule__Role__Model_attributesAssignment_2_2 : ( ruleAttribute ) ;
    public final void rule__Role__Model_attributesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6649:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:6650:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:6650:2: ( ruleAttribute )
            // InternalSecurityDsl.g:6651:3: ruleAttribute
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
    // InternalSecurityDsl.g:6660:1: rule__Role__Model_attributesAssignment_2_3_1 : ( ruleAttribute ) ;
    public final void rule__Role__Model_attributesAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6664:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:6665:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:6665:2: ( ruleAttribute )
            // InternalSecurityDsl.g:6666:3: ruleAttribute
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
    // InternalSecurityDsl.g:6675:1: rule__Role__Role_instancesAssignment_3_2 : ( ruleRoleInstance ) ;
    public final void rule__Role__Role_instancesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6679:1: ( ( ruleRoleInstance ) )
            // InternalSecurityDsl.g:6680:2: ( ruleRoleInstance )
            {
            // InternalSecurityDsl.g:6680:2: ( ruleRoleInstance )
            // InternalSecurityDsl.g:6681:3: ruleRoleInstance
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
    // InternalSecurityDsl.g:6690:1: rule__Role__Role_instancesAssignment_3_3_1 : ( ruleRoleInstance ) ;
    public final void rule__Role__Role_instancesAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6694:1: ( ( ruleRoleInstance ) )
            // InternalSecurityDsl.g:6695:2: ( ruleRoleInstance )
            {
            // InternalSecurityDsl.g:6695:2: ( ruleRoleInstance )
            // InternalSecurityDsl.g:6696:3: ruleRoleInstance
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
    // InternalSecurityDsl.g:6705:1: rule__User__TableNameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__User__TableNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6709:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6710:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6710:2: ( ruleEString )
            // InternalSecurityDsl.g:6711:3: ruleEString
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
    // InternalSecurityDsl.g:6720:1: rule__User__Model_attributesAssignment_2_2 : ( ruleAttribute ) ;
    public final void rule__User__Model_attributesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6724:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:6725:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:6725:2: ( ruleAttribute )
            // InternalSecurityDsl.g:6726:3: ruleAttribute
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
    // InternalSecurityDsl.g:6735:1: rule__User__Model_attributesAssignment_2_3_1 : ( ruleAttribute ) ;
    public final void rule__User__Model_attributesAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6739:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:6740:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:6740:2: ( ruleAttribute )
            // InternalSecurityDsl.g:6741:3: ruleAttribute
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


    // $ANTLR start "rule__RoleInstance__ClientAssignment_1"
    // InternalSecurityDsl.g:6750:1: rule__RoleInstance__ClientAssignment_1 : ( ( 'client' ) ) ;
    public final void rule__RoleInstance__ClientAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6754:1: ( ( ( 'client' ) ) )
            // InternalSecurityDsl.g:6755:2: ( ( 'client' ) )
            {
            // InternalSecurityDsl.g:6755:2: ( ( 'client' ) )
            // InternalSecurityDsl.g:6756:3: ( 'client' )
            {
             before(grammarAccess.getRoleInstanceAccess().getClientClientKeyword_1_0()); 
            // InternalSecurityDsl.g:6757:3: ( 'client' )
            // InternalSecurityDsl.g:6758:4: 'client'
            {
             before(grammarAccess.getRoleInstanceAccess().getClientClientKeyword_1_0()); 
            match(input,96,FOLLOW_2); 
             after(grammarAccess.getRoleInstanceAccess().getClientClientKeyword_1_0()); 

            }

             after(grammarAccess.getRoleInstanceAccess().getClientClientKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleInstance__ClientAssignment_1"


    // $ANTLR start "rule__RoleInstance__NameAssignment_2"
    // InternalSecurityDsl.g:6769:1: rule__RoleInstance__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RoleInstance__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6773:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6774:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6774:2: ( ruleEString )
            // InternalSecurityDsl.g:6775:3: ruleEString
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


    // $ANTLR start "rule__Endpoint__UrlAssignment_2"
    // InternalSecurityDsl.g:6784:1: rule__Endpoint__UrlAssignment_2 : ( ruleEString ) ;
    public final void rule__Endpoint__UrlAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6788:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6789:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6789:2: ( ruleEString )
            // InternalSecurityDsl.g:6790:3: ruleEString
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
    // InternalSecurityDsl.g:6799:1: rule__Endpoint__FunctionNameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Endpoint__FunctionNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6803:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6804:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6804:2: ( ruleEString )
            // InternalSecurityDsl.g:6805:3: ruleEString
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
    // InternalSecurityDsl.g:6814:1: rule__Endpoint__MethodAssignment_4_1 : ( ruleEEndpointMethod ) ;
    public final void rule__Endpoint__MethodAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6818:1: ( ( ruleEEndpointMethod ) )
            // InternalSecurityDsl.g:6819:2: ( ruleEEndpointMethod )
            {
            // InternalSecurityDsl.g:6819:2: ( ruleEEndpointMethod )
            // InternalSecurityDsl.g:6820:3: ruleEEndpointMethod
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
    // InternalSecurityDsl.g:6829:1: rule__Endpoint__TypeAssignment_5_1 : ( ruleEEndpointType ) ;
    public final void rule__Endpoint__TypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6833:1: ( ( ruleEEndpointType ) )
            // InternalSecurityDsl.g:6834:2: ( ruleEEndpointType )
            {
            // InternalSecurityDsl.g:6834:2: ( ruleEEndpointType )
            // InternalSecurityDsl.g:6835:3: ruleEEndpointType
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
    // InternalSecurityDsl.g:6844:1: rule__Endpoint__Role_authoritiesAssignment_6_2 : ( ( ruleEString ) ) ;
    public final void rule__Endpoint__Role_authoritiesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6848:1: ( ( ( ruleEString ) ) )
            // InternalSecurityDsl.g:6849:2: ( ( ruleEString ) )
            {
            // InternalSecurityDsl.g:6849:2: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6850:3: ( ruleEString )
            {
             before(grammarAccess.getEndpointAccess().getRole_authoritiesRoleInstanceCrossReference_6_2_0()); 
            // InternalSecurityDsl.g:6851:3: ( ruleEString )
            // InternalSecurityDsl.g:6852:4: ruleEString
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
    // InternalSecurityDsl.g:6863:1: rule__Endpoint__Role_authoritiesAssignment_6_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Endpoint__Role_authoritiesAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6867:1: ( ( ( ruleEString ) ) )
            // InternalSecurityDsl.g:6868:2: ( ( ruleEString ) )
            {
            // InternalSecurityDsl.g:6868:2: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6869:3: ( ruleEString )
            {
             before(grammarAccess.getEndpointAccess().getRole_authoritiesRoleInstanceCrossReference_6_3_1_0()); 
            // InternalSecurityDsl.g:6870:3: ( ruleEString )
            // InternalSecurityDsl.g:6871:4: ruleEString
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
    // InternalSecurityDsl.g:6882:1: rule__Authentication__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Authentication__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6886:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6887:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6887:2: ( ruleEString )
            // InternalSecurityDsl.g:6888:3: ruleEString
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
    // InternalSecurityDsl.g:6897:1: rule__Authentication__PathAssignment_4 : ( ruleEString ) ;
    public final void rule__Authentication__PathAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6901:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6902:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6902:2: ( ruleEString )
            // InternalSecurityDsl.g:6903:3: ruleEString
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
    // InternalSecurityDsl.g:6912:1: rule__Authentication__Controller_endpointsAssignment_5_2 : ( ruleEndpoint ) ;
    public final void rule__Authentication__Controller_endpointsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6916:1: ( ( ruleEndpoint ) )
            // InternalSecurityDsl.g:6917:2: ( ruleEndpoint )
            {
            // InternalSecurityDsl.g:6917:2: ( ruleEndpoint )
            // InternalSecurityDsl.g:6918:3: ruleEndpoint
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
    // InternalSecurityDsl.g:6927:1: rule__Authentication__Controller_endpointsAssignment_5_3_1 : ( ruleEndpoint ) ;
    public final void rule__Authentication__Controller_endpointsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6931:1: ( ( ruleEndpoint ) )
            // InternalSecurityDsl.g:6932:2: ( ruleEndpoint )
            {
            // InternalSecurityDsl.g:6932:2: ( ruleEndpoint )
            // InternalSecurityDsl.g:6933:3: ruleEndpoint
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
    // InternalSecurityDsl.g:6942:1: rule__JWT__SignatureAlgorithmAssignment_3 : ( ruleEString ) ;
    public final void rule__JWT__SignatureAlgorithmAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6946:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6947:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6947:2: ( ruleEString )
            // InternalSecurityDsl.g:6948:3: ruleEString
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
    // InternalSecurityDsl.g:6957:1: rule__JWT__RegisteredclaimsAssignment_7 : ( ruleRegisteredClaims ) ;
    public final void rule__JWT__RegisteredclaimsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6961:1: ( ( ruleRegisteredClaims ) )
            // InternalSecurityDsl.g:6962:2: ( ruleRegisteredClaims )
            {
            // InternalSecurityDsl.g:6962:2: ( ruleRegisteredClaims )
            // InternalSecurityDsl.g:6963:3: ruleRegisteredClaims
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
    // InternalSecurityDsl.g:6972:1: rule__JWT__Jwt_claimsAssignment_8_1 : ( ruleClaim ) ;
    public final void rule__JWT__Jwt_claimsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6976:1: ( ( ruleClaim ) )
            // InternalSecurityDsl.g:6977:2: ( ruleClaim )
            {
            // InternalSecurityDsl.g:6977:2: ( ruleClaim )
            // InternalSecurityDsl.g:6978:3: ruleClaim
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
    // InternalSecurityDsl.g:6987:1: rule__JWT__SecretAssignment_10_2 : ( ruleEString ) ;
    public final void rule__JWT__SecretAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6991:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6992:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6992:2: ( ruleEString )
            // InternalSecurityDsl.g:6993:3: ruleEString
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
    // InternalSecurityDsl.g:7002:1: rule__Claim__TypeAssignment_1_0 : ( ruleEClaimType ) ;
    public final void rule__Claim__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:7006:1: ( ( ruleEClaimType ) )
            // InternalSecurityDsl.g:7007:2: ( ruleEClaimType )
            {
            // InternalSecurityDsl.g:7007:2: ( ruleEClaimType )
            // InternalSecurityDsl.g:7008:3: ruleEClaimType
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
    // InternalSecurityDsl.g:7017:1: rule__Claim__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Claim__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:7021:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:7022:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:7022:2: ( ruleEString )
            // InternalSecurityDsl.g:7023:3: ruleEString
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
    // InternalSecurityDsl.g:7032:1: rule__Claim__Claim_attributeAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Claim__Claim_attributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:7036:1: ( ( ( ruleEString ) ) )
            // InternalSecurityDsl.g:7037:2: ( ( ruleEString ) )
            {
            // InternalSecurityDsl.g:7037:2: ( ( ruleEString ) )
            // InternalSecurityDsl.g:7038:3: ( ruleEString )
            {
             before(grammarAccess.getClaimAccess().getClaim_attributeAttributeCrossReference_4_0()); 
            // InternalSecurityDsl.g:7039:3: ( ruleEString )
            // InternalSecurityDsl.g:7040:4: ruleEString
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
    // InternalSecurityDsl.g:7051:1: rule__RegisteredClaims__ExpirationTimeAssignment_3 : ( ruleEInt ) ;
    public final void rule__RegisteredClaims__ExpirationTimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:7055:1: ( ( ruleEInt ) )
            // InternalSecurityDsl.g:7056:2: ( ruleEInt )
            {
            // InternalSecurityDsl.g:7056:2: ( ruleEInt )
            // InternalSecurityDsl.g:7057:3: ruleEInt
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
    // InternalSecurityDsl.g:7066:1: rule__RegisteredClaims__IssuerAssignment_5_4 : ( ruleEString ) ;
    public final void rule__RegisteredClaims__IssuerAssignment_5_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:7070:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:7071:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:7071:2: ( ruleEString )
            // InternalSecurityDsl.g:7072:3: ruleEString
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
    // InternalSecurityDsl.g:7081:1: rule__RegisteredClaims__AudienceAssignment_6_4 : ( ruleEString ) ;
    public final void rule__RegisteredClaims__AudienceAssignment_6_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:7085:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:7086:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:7086:2: ( ruleEString )
            // InternalSecurityDsl.g:7087:3: ruleEString
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


    // $ANTLR start "rule__OAuth2__ProvidersAssignment_3"
    // InternalSecurityDsl.g:7096:1: rule__OAuth2__ProvidersAssignment_3 : ( ruleProvider ) ;
    public final void rule__OAuth2__ProvidersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:7100:1: ( ( ruleProvider ) )
            // InternalSecurityDsl.g:7101:2: ( ruleProvider )
            {
            // InternalSecurityDsl.g:7101:2: ( ruleProvider )
            // InternalSecurityDsl.g:7102:3: ruleProvider
            {
             before(grammarAccess.getOAuth2Access().getProvidersProviderParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProvider();

            state._fsp--;

             after(grammarAccess.getOAuth2Access().getProvidersProviderParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OAuth2__ProvidersAssignment_3"


    // $ANTLR start "rule__OAuth2__ProvidersAssignment_4_1"
    // InternalSecurityDsl.g:7111:1: rule__OAuth2__ProvidersAssignment_4_1 : ( ruleProvider ) ;
    public final void rule__OAuth2__ProvidersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:7115:1: ( ( ruleProvider ) )
            // InternalSecurityDsl.g:7116:2: ( ruleProvider )
            {
            // InternalSecurityDsl.g:7116:2: ( ruleProvider )
            // InternalSecurityDsl.g:7117:3: ruleProvider
            {
             before(grammarAccess.getOAuth2Access().getProvidersProviderParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProvider();

            state._fsp--;

             after(grammarAccess.getOAuth2Access().getProvidersProviderParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OAuth2__ProvidersAssignment_4_1"


    // $ANTLR start "rule__Provider__NameAssignment_2"
    // InternalSecurityDsl.g:7126:1: rule__Provider__NameAssignment_2 : ( ruleEOAuthProvider ) ;
    public final void rule__Provider__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:7130:1: ( ( ruleEOAuthProvider ) )
            // InternalSecurityDsl.g:7131:2: ( ruleEOAuthProvider )
            {
            // InternalSecurityDsl.g:7131:2: ( ruleEOAuthProvider )
            // InternalSecurityDsl.g:7132:3: ruleEOAuthProvider
            {
             before(grammarAccess.getProviderAccess().getNameEOAuthProviderEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEOAuthProvider();

            state._fsp--;

             after(grammarAccess.getProviderAccess().getNameEOAuthProviderEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__NameAssignment_2"


    // $ANTLR start "rule__Provider__ClientIdAssignment_5"
    // InternalSecurityDsl.g:7141:1: rule__Provider__ClientIdAssignment_5 : ( ruleEString ) ;
    public final void rule__Provider__ClientIdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:7145:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:7146:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:7146:2: ( ruleEString )
            // InternalSecurityDsl.g:7147:3: ruleEString
            {
             before(grammarAccess.getProviderAccess().getClientIdEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProviderAccess().getClientIdEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__ClientIdAssignment_5"


    // $ANTLR start "rule__Provider__ClientSecretAssignment_8"
    // InternalSecurityDsl.g:7156:1: rule__Provider__ClientSecretAssignment_8 : ( ruleEString ) ;
    public final void rule__Provider__ClientSecretAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:7160:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:7161:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:7161:2: ( ruleEString )
            // InternalSecurityDsl.g:7162:3: ruleEString
            {
             before(grammarAccess.getProviderAccess().getClientSecretEStringParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProviderAccess().getClientSecretEStringParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__ClientSecretAssignment_8"


    // $ANTLR start "rule__Provider__RedirectUriAssignment_9_2"
    // InternalSecurityDsl.g:7171:1: rule__Provider__RedirectUriAssignment_9_2 : ( ruleEString ) ;
    public final void rule__Provider__RedirectUriAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:7175:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:7176:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:7176:2: ( ruleEString )
            // InternalSecurityDsl.g:7177:3: ruleEString
            {
             before(grammarAccess.getProviderAccess().getRedirectUriEStringParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProviderAccess().getRedirectUriEStringParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__RedirectUriAssignment_9_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0067FC0000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x1000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000046L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000021001000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000080000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000007FC000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000030L,0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0xC000000000000000L,0x0000000000000380L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000380000030L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x000001FC00000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});

}