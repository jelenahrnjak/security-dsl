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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PostgreSQL'", "'Oracle'", "'MySQL'", "'String'", "'Float'", "'Long'", "'Integer'", "'Double'", "'DateTime'", "'Date'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'REGISTRATION'", "'LOGIN'", "'LOGOUT'", "'OTHER'", "'PRIVATE'", "'PUBLIC'", "'REGISTERED'", "'GOOGLE'", "'GITHUB'", "'FACEBOOK'", "'MICROSOFT_AZURE'", "'LINKEDIN'", "'TWITTER'", "'INSTAGRAM'", "'application:'", "'artifact:'", "'group:'", "'name:'", "'packageName:'", "'description:'", "'port:'", "'hostname:'", "'database:'", "'model:'", "'user:'", "'role:'", "'security:'", "'controller:'", "'auth:'", "'vendor:'", "'url:'", "'username:'", "'password:'", "'-'", "'{'", "'type:'", "'}'", "'collumnName:'", "'tableName:'", "'attributes:'", "'['", "']'", "','", "'roles:'", "'methodName:'", "'method:'", "'roleAuthorities:'", "'path:'", "'endpoints:'", "'jwt:'", "'header:'", "'signatureAlgorithm:'", "'payload:'", "'claims:'", "'signature:'", "'secret:'", "':'", "'REGISTERED,'", "'expirationTime:'", "'issuer:'", "'audience:'", "'OAuth2.0:'", "'providers:'", "'clientId:'", "'clientSecret:'", "'redirectUri:'", "'basicAuthentication'", "'identifier'", "'credential'", "'client'"
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


    // $ANTLR start "entryRuleRegisteredClaim"
    // InternalSecurityDsl.g:378:1: entryRuleRegisteredClaim : ruleRegisteredClaim EOF ;
    public final void entryRuleRegisteredClaim() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:379:1: ( ruleRegisteredClaim EOF )
            // InternalSecurityDsl.g:380:1: ruleRegisteredClaim EOF
            {
             before(grammarAccess.getRegisteredClaimRule()); 
            pushFollow(FOLLOW_1);
            ruleRegisteredClaim();

            state._fsp--;

             after(grammarAccess.getRegisteredClaimRule()); 
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
    // $ANTLR end "entryRuleRegisteredClaim"


    // $ANTLR start "ruleRegisteredClaim"
    // InternalSecurityDsl.g:387:1: ruleRegisteredClaim : ( ( rule__RegisteredClaim__Group__0 ) ) ;
    public final void ruleRegisteredClaim() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:391:2: ( ( ( rule__RegisteredClaim__Group__0 ) ) )
            // InternalSecurityDsl.g:392:2: ( ( rule__RegisteredClaim__Group__0 ) )
            {
            // InternalSecurityDsl.g:392:2: ( ( rule__RegisteredClaim__Group__0 ) )
            // InternalSecurityDsl.g:393:3: ( rule__RegisteredClaim__Group__0 )
            {
             before(grammarAccess.getRegisteredClaimAccess().getGroup()); 
            // InternalSecurityDsl.g:394:3: ( rule__RegisteredClaim__Group__0 )
            // InternalSecurityDsl.g:394:4: rule__RegisteredClaim__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RegisteredClaim__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRegisteredClaimAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegisteredClaim"


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
            case 74:
                {
                alt1=1;
                }
                break;
            case 86:
                {
                alt1=2;
                }
                break;
            case 91:
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
    // InternalSecurityDsl.g:673:1: rule__EType__Alternatives : ( ( ( 'String' ) ) | ( ( 'Float' ) ) | ( ( 'Long' ) ) | ( ( 'Integer' ) ) | ( ( 'Double' ) ) | ( ( 'DateTime' ) ) | ( ( 'Date' ) ) );
    public final void rule__EType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:677:1: ( ( ( 'String' ) ) | ( ( 'Float' ) ) | ( ( 'Long' ) ) | ( ( 'Integer' ) ) | ( ( 'Double' ) ) | ( ( 'DateTime' ) ) | ( ( 'Date' ) ) )
            int alt4=7;
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
                    // InternalSecurityDsl.g:702:2: ( ( 'Double' ) )
                    {
                    // InternalSecurityDsl.g:702:2: ( ( 'Double' ) )
                    // InternalSecurityDsl.g:703:3: ( 'Double' )
                    {
                     before(grammarAccess.getETypeAccess().getDoubleEnumLiteralDeclaration_4()); 
                    // InternalSecurityDsl.g:704:3: ( 'Double' )
                    // InternalSecurityDsl.g:704:4: 'Double'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getDoubleEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSecurityDsl.g:708:2: ( ( 'DateTime' ) )
                    {
                    // InternalSecurityDsl.g:708:2: ( ( 'DateTime' ) )
                    // InternalSecurityDsl.g:709:3: ( 'DateTime' )
                    {
                     before(grammarAccess.getETypeAccess().getDateTimeEnumLiteralDeclaration_5()); 
                    // InternalSecurityDsl.g:710:3: ( 'DateTime' )
                    // InternalSecurityDsl.g:710:4: 'DateTime'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getDateTimeEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSecurityDsl.g:714:2: ( ( 'Date' ) )
                    {
                    // InternalSecurityDsl.g:714:2: ( ( 'Date' ) )
                    // InternalSecurityDsl.g:715:3: ( 'Date' )
                    {
                     before(grammarAccess.getETypeAccess().getDateEnumLiteralDeclaration_6()); 
                    // InternalSecurityDsl.g:716:3: ( 'Date' )
                    // InternalSecurityDsl.g:716:4: 'Date'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getDateEnumLiteralDeclaration_6()); 

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
    // InternalSecurityDsl.g:724:1: rule__EEndpointMethod__Alternatives : ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) );
    public final void rule__EEndpointMethod__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:728:1: ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt5=1;
                }
                break;
            case 22:
                {
                alt5=2;
                }
                break;
            case 23:
                {
                alt5=3;
                }
                break;
            case 24:
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
                    // InternalSecurityDsl.g:729:2: ( ( 'GET' ) )
                    {
                    // InternalSecurityDsl.g:729:2: ( ( 'GET' ) )
                    // InternalSecurityDsl.g:730:3: ( 'GET' )
                    {
                     before(grammarAccess.getEEndpointMethodAccess().getGETEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:731:3: ( 'GET' )
                    // InternalSecurityDsl.g:731:4: 'GET'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointMethodAccess().getGETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:735:2: ( ( 'POST' ) )
                    {
                    // InternalSecurityDsl.g:735:2: ( ( 'POST' ) )
                    // InternalSecurityDsl.g:736:3: ( 'POST' )
                    {
                     before(grammarAccess.getEEndpointMethodAccess().getPOSTEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:737:3: ( 'POST' )
                    // InternalSecurityDsl.g:737:4: 'POST'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointMethodAccess().getPOSTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:741:2: ( ( 'PUT' ) )
                    {
                    // InternalSecurityDsl.g:741:2: ( ( 'PUT' ) )
                    // InternalSecurityDsl.g:742:3: ( 'PUT' )
                    {
                     before(grammarAccess.getEEndpointMethodAccess().getPUTEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:743:3: ( 'PUT' )
                    // InternalSecurityDsl.g:743:4: 'PUT'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointMethodAccess().getPUTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:747:2: ( ( 'DELETE' ) )
                    {
                    // InternalSecurityDsl.g:747:2: ( ( 'DELETE' ) )
                    // InternalSecurityDsl.g:748:3: ( 'DELETE' )
                    {
                     before(grammarAccess.getEEndpointMethodAccess().getDELETEEnumLiteralDeclaration_3()); 
                    // InternalSecurityDsl.g:749:3: ( 'DELETE' )
                    // InternalSecurityDsl.g:749:4: 'DELETE'
                    {
                    match(input,24,FOLLOW_2); 

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
    // InternalSecurityDsl.g:757:1: rule__EEndpointType__Alternatives : ( ( ( 'REGISTRATION' ) ) | ( ( 'LOGIN' ) ) | ( ( 'LOGOUT' ) ) | ( ( 'OTHER' ) ) );
    public final void rule__EEndpointType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:761:1: ( ( ( 'REGISTRATION' ) ) | ( ( 'LOGIN' ) ) | ( ( 'LOGOUT' ) ) | ( ( 'OTHER' ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt6=1;
                }
                break;
            case 26:
                {
                alt6=2;
                }
                break;
            case 27:
                {
                alt6=3;
                }
                break;
            case 28:
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
                    // InternalSecurityDsl.g:762:2: ( ( 'REGISTRATION' ) )
                    {
                    // InternalSecurityDsl.g:762:2: ( ( 'REGISTRATION' ) )
                    // InternalSecurityDsl.g:763:3: ( 'REGISTRATION' )
                    {
                     before(grammarAccess.getEEndpointTypeAccess().getREGISTRATIONEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:764:3: ( 'REGISTRATION' )
                    // InternalSecurityDsl.g:764:4: 'REGISTRATION'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointTypeAccess().getREGISTRATIONEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:768:2: ( ( 'LOGIN' ) )
                    {
                    // InternalSecurityDsl.g:768:2: ( ( 'LOGIN' ) )
                    // InternalSecurityDsl.g:769:3: ( 'LOGIN' )
                    {
                     before(grammarAccess.getEEndpointTypeAccess().getLOGINEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:770:3: ( 'LOGIN' )
                    // InternalSecurityDsl.g:770:4: 'LOGIN'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointTypeAccess().getLOGINEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:774:2: ( ( 'LOGOUT' ) )
                    {
                    // InternalSecurityDsl.g:774:2: ( ( 'LOGOUT' ) )
                    // InternalSecurityDsl.g:775:3: ( 'LOGOUT' )
                    {
                     before(grammarAccess.getEEndpointTypeAccess().getLOGOUTEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:776:3: ( 'LOGOUT' )
                    // InternalSecurityDsl.g:776:4: 'LOGOUT'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointTypeAccess().getLOGOUTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:780:2: ( ( 'OTHER' ) )
                    {
                    // InternalSecurityDsl.g:780:2: ( ( 'OTHER' ) )
                    // InternalSecurityDsl.g:781:3: ( 'OTHER' )
                    {
                     before(grammarAccess.getEEndpointTypeAccess().getOTHEREnumLiteralDeclaration_3()); 
                    // InternalSecurityDsl.g:782:3: ( 'OTHER' )
                    // InternalSecurityDsl.g:782:4: 'OTHER'
                    {
                    match(input,28,FOLLOW_2); 

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
    // InternalSecurityDsl.g:790:1: rule__EClaimType__Alternatives : ( ( ( 'PRIVATE' ) ) | ( ( 'PUBLIC' ) ) | ( ( 'REGISTERED' ) ) );
    public final void rule__EClaimType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:794:1: ( ( ( 'PRIVATE' ) ) | ( ( 'PUBLIC' ) ) | ( ( 'REGISTERED' ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt7=1;
                }
                break;
            case 30:
                {
                alt7=2;
                }
                break;
            case 31:
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
                    // InternalSecurityDsl.g:795:2: ( ( 'PRIVATE' ) )
                    {
                    // InternalSecurityDsl.g:795:2: ( ( 'PRIVATE' ) )
                    // InternalSecurityDsl.g:796:3: ( 'PRIVATE' )
                    {
                     before(grammarAccess.getEClaimTypeAccess().getPRIVATEEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:797:3: ( 'PRIVATE' )
                    // InternalSecurityDsl.g:797:4: 'PRIVATE'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getEClaimTypeAccess().getPRIVATEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:801:2: ( ( 'PUBLIC' ) )
                    {
                    // InternalSecurityDsl.g:801:2: ( ( 'PUBLIC' ) )
                    // InternalSecurityDsl.g:802:3: ( 'PUBLIC' )
                    {
                     before(grammarAccess.getEClaimTypeAccess().getPUBLICEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:803:3: ( 'PUBLIC' )
                    // InternalSecurityDsl.g:803:4: 'PUBLIC'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getEClaimTypeAccess().getPUBLICEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:807:2: ( ( 'REGISTERED' ) )
                    {
                    // InternalSecurityDsl.g:807:2: ( ( 'REGISTERED' ) )
                    // InternalSecurityDsl.g:808:3: ( 'REGISTERED' )
                    {
                     before(grammarAccess.getEClaimTypeAccess().getREGISTEREDEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:809:3: ( 'REGISTERED' )
                    // InternalSecurityDsl.g:809:4: 'REGISTERED'
                    {
                    match(input,31,FOLLOW_2); 

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
    // InternalSecurityDsl.g:817:1: rule__EOAuthProvider__Alternatives : ( ( ( 'GOOGLE' ) ) | ( ( 'GITHUB' ) ) | ( ( 'FACEBOOK' ) ) | ( ( 'MICROSOFT_AZURE' ) ) | ( ( 'LINKEDIN' ) ) | ( ( 'TWITTER' ) ) | ( ( 'INSTAGRAM' ) ) );
    public final void rule__EOAuthProvider__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:821:1: ( ( ( 'GOOGLE' ) ) | ( ( 'GITHUB' ) ) | ( ( 'FACEBOOK' ) ) | ( ( 'MICROSOFT_AZURE' ) ) | ( ( 'LINKEDIN' ) ) | ( ( 'TWITTER' ) ) | ( ( 'INSTAGRAM' ) ) )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt8=1;
                }
                break;
            case 33:
                {
                alt8=2;
                }
                break;
            case 34:
                {
                alt8=3;
                }
                break;
            case 35:
                {
                alt8=4;
                }
                break;
            case 36:
                {
                alt8=5;
                }
                break;
            case 37:
                {
                alt8=6;
                }
                break;
            case 38:
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
                    // InternalSecurityDsl.g:822:2: ( ( 'GOOGLE' ) )
                    {
                    // InternalSecurityDsl.g:822:2: ( ( 'GOOGLE' ) )
                    // InternalSecurityDsl.g:823:3: ( 'GOOGLE' )
                    {
                     before(grammarAccess.getEOAuthProviderAccess().getGOOGLEEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:824:3: ( 'GOOGLE' )
                    // InternalSecurityDsl.g:824:4: 'GOOGLE'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getEOAuthProviderAccess().getGOOGLEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:828:2: ( ( 'GITHUB' ) )
                    {
                    // InternalSecurityDsl.g:828:2: ( ( 'GITHUB' ) )
                    // InternalSecurityDsl.g:829:3: ( 'GITHUB' )
                    {
                     before(grammarAccess.getEOAuthProviderAccess().getGITHUBEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:830:3: ( 'GITHUB' )
                    // InternalSecurityDsl.g:830:4: 'GITHUB'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getEOAuthProviderAccess().getGITHUBEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:834:2: ( ( 'FACEBOOK' ) )
                    {
                    // InternalSecurityDsl.g:834:2: ( ( 'FACEBOOK' ) )
                    // InternalSecurityDsl.g:835:3: ( 'FACEBOOK' )
                    {
                     before(grammarAccess.getEOAuthProviderAccess().getFACEBOOKEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:836:3: ( 'FACEBOOK' )
                    // InternalSecurityDsl.g:836:4: 'FACEBOOK'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getEOAuthProviderAccess().getFACEBOOKEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:840:2: ( ( 'MICROSOFT_AZURE' ) )
                    {
                    // InternalSecurityDsl.g:840:2: ( ( 'MICROSOFT_AZURE' ) )
                    // InternalSecurityDsl.g:841:3: ( 'MICROSOFT_AZURE' )
                    {
                     before(grammarAccess.getEOAuthProviderAccess().getAZUREEnumLiteralDeclaration_3()); 
                    // InternalSecurityDsl.g:842:3: ( 'MICROSOFT_AZURE' )
                    // InternalSecurityDsl.g:842:4: 'MICROSOFT_AZURE'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getEOAuthProviderAccess().getAZUREEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSecurityDsl.g:846:2: ( ( 'LINKEDIN' ) )
                    {
                    // InternalSecurityDsl.g:846:2: ( ( 'LINKEDIN' ) )
                    // InternalSecurityDsl.g:847:3: ( 'LINKEDIN' )
                    {
                     before(grammarAccess.getEOAuthProviderAccess().getLINKEDINEnumLiteralDeclaration_4()); 
                    // InternalSecurityDsl.g:848:3: ( 'LINKEDIN' )
                    // InternalSecurityDsl.g:848:4: 'LINKEDIN'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getEOAuthProviderAccess().getLINKEDINEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSecurityDsl.g:852:2: ( ( 'TWITTER' ) )
                    {
                    // InternalSecurityDsl.g:852:2: ( ( 'TWITTER' ) )
                    // InternalSecurityDsl.g:853:3: ( 'TWITTER' )
                    {
                     before(grammarAccess.getEOAuthProviderAccess().getTWITTEREnumLiteralDeclaration_5()); 
                    // InternalSecurityDsl.g:854:3: ( 'TWITTER' )
                    // InternalSecurityDsl.g:854:4: 'TWITTER'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getEOAuthProviderAccess().getTWITTEREnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSecurityDsl.g:858:2: ( ( 'INSTAGRAM' ) )
                    {
                    // InternalSecurityDsl.g:858:2: ( ( 'INSTAGRAM' ) )
                    // InternalSecurityDsl.g:859:3: ( 'INSTAGRAM' )
                    {
                     before(grammarAccess.getEOAuthProviderAccess().getINSTAGRAMEnumLiteralDeclaration_6()); 
                    // InternalSecurityDsl.g:860:3: ( 'INSTAGRAM' )
                    // InternalSecurityDsl.g:860:4: 'INSTAGRAM'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getEOAuthProviderAccess().getINSTAGRAMEnumLiteralDeclaration_6()); 

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
    // InternalSecurityDsl.g:868:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:872:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // InternalSecurityDsl.g:873:2: rule__Application__Group__0__Impl rule__Application__Group__1
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
    // InternalSecurityDsl.g:880:1: rule__Application__Group__0__Impl : ( () ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:884:1: ( ( () ) )
            // InternalSecurityDsl.g:885:1: ( () )
            {
            // InternalSecurityDsl.g:885:1: ( () )
            // InternalSecurityDsl.g:886:2: ()
            {
             before(grammarAccess.getApplicationAccess().getApplicationAction_0()); 
            // InternalSecurityDsl.g:887:2: ()
            // InternalSecurityDsl.g:887:3: 
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
    // InternalSecurityDsl.g:895:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:899:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // InternalSecurityDsl.g:900:2: rule__Application__Group__1__Impl rule__Application__Group__2
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
    // InternalSecurityDsl.g:907:1: rule__Application__Group__1__Impl : ( 'application:' ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:911:1: ( ( 'application:' ) )
            // InternalSecurityDsl.g:912:1: ( 'application:' )
            {
            // InternalSecurityDsl.g:912:1: ( 'application:' )
            // InternalSecurityDsl.g:913:2: 'application:'
            {
             before(grammarAccess.getApplicationAccess().getApplicationKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSecurityDsl.g:922:1: rule__Application__Group__2 : rule__Application__Group__2__Impl rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:926:1: ( rule__Application__Group__2__Impl rule__Application__Group__3 )
            // InternalSecurityDsl.g:927:2: rule__Application__Group__2__Impl rule__Application__Group__3
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
    // InternalSecurityDsl.g:934:1: rule__Application__Group__2__Impl : ( 'artifact:' ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:938:1: ( ( 'artifact:' ) )
            // InternalSecurityDsl.g:939:1: ( 'artifact:' )
            {
            // InternalSecurityDsl.g:939:1: ( 'artifact:' )
            // InternalSecurityDsl.g:940:2: 'artifact:'
            {
             before(grammarAccess.getApplicationAccess().getArtifactKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getArtifactKeyword_2()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:949:1: rule__Application__Group__3 : rule__Application__Group__3__Impl rule__Application__Group__4 ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:953:1: ( rule__Application__Group__3__Impl rule__Application__Group__4 )
            // InternalSecurityDsl.g:954:2: rule__Application__Group__3__Impl rule__Application__Group__4
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
    // InternalSecurityDsl.g:961:1: rule__Application__Group__3__Impl : ( ( rule__Application__ArtifactAssignment_3 ) ) ;
    public final void rule__Application__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:965:1: ( ( ( rule__Application__ArtifactAssignment_3 ) ) )
            // InternalSecurityDsl.g:966:1: ( ( rule__Application__ArtifactAssignment_3 ) )
            {
            // InternalSecurityDsl.g:966:1: ( ( rule__Application__ArtifactAssignment_3 ) )
            // InternalSecurityDsl.g:967:2: ( rule__Application__ArtifactAssignment_3 )
            {
             before(grammarAccess.getApplicationAccess().getArtifactAssignment_3()); 
            // InternalSecurityDsl.g:968:2: ( rule__Application__ArtifactAssignment_3 )
            // InternalSecurityDsl.g:968:3: rule__Application__ArtifactAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Application__ArtifactAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getArtifactAssignment_3()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:976:1: rule__Application__Group__4 : rule__Application__Group__4__Impl rule__Application__Group__5 ;
    public final void rule__Application__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:980:1: ( rule__Application__Group__4__Impl rule__Application__Group__5 )
            // InternalSecurityDsl.g:981:2: rule__Application__Group__4__Impl rule__Application__Group__5
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
    // InternalSecurityDsl.g:988:1: rule__Application__Group__4__Impl : ( ( rule__Application__Group_4__0 )? ) ;
    public final void rule__Application__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:992:1: ( ( ( rule__Application__Group_4__0 )? ) )
            // InternalSecurityDsl.g:993:1: ( ( rule__Application__Group_4__0 )? )
            {
            // InternalSecurityDsl.g:993:1: ( ( rule__Application__Group_4__0 )? )
            // InternalSecurityDsl.g:994:2: ( rule__Application__Group_4__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_4()); 
            // InternalSecurityDsl.g:995:2: ( rule__Application__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==42) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSecurityDsl.g:995:3: rule__Application__Group_4__0
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
    // InternalSecurityDsl.g:1003:1: rule__Application__Group__5 : rule__Application__Group__5__Impl rule__Application__Group__6 ;
    public final void rule__Application__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1007:1: ( rule__Application__Group__5__Impl rule__Application__Group__6 )
            // InternalSecurityDsl.g:1008:2: rule__Application__Group__5__Impl rule__Application__Group__6
            {
            pushFollow(FOLLOW_5);
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
    // InternalSecurityDsl.g:1015:1: rule__Application__Group__5__Impl : ( 'group:' ) ;
    public final void rule__Application__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1019:1: ( ( 'group:' ) )
            // InternalSecurityDsl.g:1020:1: ( 'group:' )
            {
            // InternalSecurityDsl.g:1020:1: ( 'group:' )
            // InternalSecurityDsl.g:1021:2: 'group:'
            {
             before(grammarAccess.getApplicationAccess().getGroupKeyword_5()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getGroupKeyword_5()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:1030:1: rule__Application__Group__6 : rule__Application__Group__6__Impl rule__Application__Group__7 ;
    public final void rule__Application__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1034:1: ( rule__Application__Group__6__Impl rule__Application__Group__7 )
            // InternalSecurityDsl.g:1035:2: rule__Application__Group__6__Impl rule__Application__Group__7
            {
            pushFollow(FOLLOW_7);
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
    // InternalSecurityDsl.g:1042:1: rule__Application__Group__6__Impl : ( ( rule__Application__GroupAssignment_6 ) ) ;
    public final void rule__Application__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1046:1: ( ( ( rule__Application__GroupAssignment_6 ) ) )
            // InternalSecurityDsl.g:1047:1: ( ( rule__Application__GroupAssignment_6 ) )
            {
            // InternalSecurityDsl.g:1047:1: ( ( rule__Application__GroupAssignment_6 ) )
            // InternalSecurityDsl.g:1048:2: ( rule__Application__GroupAssignment_6 )
            {
             before(grammarAccess.getApplicationAccess().getGroupAssignment_6()); 
            // InternalSecurityDsl.g:1049:2: ( rule__Application__GroupAssignment_6 )
            // InternalSecurityDsl.g:1049:3: rule__Application__GroupAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Application__GroupAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getGroupAssignment_6()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:1057:1: rule__Application__Group__7 : rule__Application__Group__7__Impl rule__Application__Group__8 ;
    public final void rule__Application__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1061:1: ( rule__Application__Group__7__Impl rule__Application__Group__8 )
            // InternalSecurityDsl.g:1062:2: rule__Application__Group__7__Impl rule__Application__Group__8
            {
            pushFollow(FOLLOW_7);
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
    // InternalSecurityDsl.g:1069:1: rule__Application__Group__7__Impl : ( ( rule__Application__Group_7__0 )? ) ;
    public final void rule__Application__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1073:1: ( ( ( rule__Application__Group_7__0 )? ) )
            // InternalSecurityDsl.g:1074:1: ( ( rule__Application__Group_7__0 )? )
            {
            // InternalSecurityDsl.g:1074:1: ( ( rule__Application__Group_7__0 )? )
            // InternalSecurityDsl.g:1075:2: ( rule__Application__Group_7__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_7()); 
            // InternalSecurityDsl.g:1076:2: ( rule__Application__Group_7__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==43) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSecurityDsl.g:1076:3: rule__Application__Group_7__0
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
    // InternalSecurityDsl.g:1084:1: rule__Application__Group__8 : rule__Application__Group__8__Impl rule__Application__Group__9 ;
    public final void rule__Application__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1088:1: ( rule__Application__Group__8__Impl rule__Application__Group__9 )
            // InternalSecurityDsl.g:1089:2: rule__Application__Group__8__Impl rule__Application__Group__9
            {
            pushFollow(FOLLOW_7);
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
    // InternalSecurityDsl.g:1096:1: rule__Application__Group__8__Impl : ( ( rule__Application__Group_8__0 )? ) ;
    public final void rule__Application__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1100:1: ( ( ( rule__Application__Group_8__0 )? ) )
            // InternalSecurityDsl.g:1101:1: ( ( rule__Application__Group_8__0 )? )
            {
            // InternalSecurityDsl.g:1101:1: ( ( rule__Application__Group_8__0 )? )
            // InternalSecurityDsl.g:1102:2: ( rule__Application__Group_8__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_8()); 
            // InternalSecurityDsl.g:1103:2: ( rule__Application__Group_8__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==44) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSecurityDsl.g:1103:3: rule__Application__Group_8__0
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
    // InternalSecurityDsl.g:1111:1: rule__Application__Group__9 : rule__Application__Group__9__Impl rule__Application__Group__10 ;
    public final void rule__Application__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1115:1: ( rule__Application__Group__9__Impl rule__Application__Group__10 )
            // InternalSecurityDsl.g:1116:2: rule__Application__Group__9__Impl rule__Application__Group__10
            {
            pushFollow(FOLLOW_7);
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
    // InternalSecurityDsl.g:1123:1: rule__Application__Group__9__Impl : ( ( rule__Application__Group_9__0 )? ) ;
    public final void rule__Application__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1127:1: ( ( ( rule__Application__Group_9__0 )? ) )
            // InternalSecurityDsl.g:1128:1: ( ( rule__Application__Group_9__0 )? )
            {
            // InternalSecurityDsl.g:1128:1: ( ( rule__Application__Group_9__0 )? )
            // InternalSecurityDsl.g:1129:2: ( rule__Application__Group_9__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_9()); 
            // InternalSecurityDsl.g:1130:2: ( rule__Application__Group_9__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==45) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSecurityDsl.g:1130:3: rule__Application__Group_9__0
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
    // InternalSecurityDsl.g:1138:1: rule__Application__Group__10 : rule__Application__Group__10__Impl rule__Application__Group__11 ;
    public final void rule__Application__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1142:1: ( rule__Application__Group__10__Impl rule__Application__Group__11 )
            // InternalSecurityDsl.g:1143:2: rule__Application__Group__10__Impl rule__Application__Group__11
            {
            pushFollow(FOLLOW_7);
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
    // InternalSecurityDsl.g:1150:1: rule__Application__Group__10__Impl : ( ( rule__Application__Group_10__0 )? ) ;
    public final void rule__Application__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1154:1: ( ( ( rule__Application__Group_10__0 )? ) )
            // InternalSecurityDsl.g:1155:1: ( ( rule__Application__Group_10__0 )? )
            {
            // InternalSecurityDsl.g:1155:1: ( ( rule__Application__Group_10__0 )? )
            // InternalSecurityDsl.g:1156:2: ( rule__Application__Group_10__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_10()); 
            // InternalSecurityDsl.g:1157:2: ( rule__Application__Group_10__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==46) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSecurityDsl.g:1157:3: rule__Application__Group_10__0
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
    // InternalSecurityDsl.g:1165:1: rule__Application__Group__11 : rule__Application__Group__11__Impl rule__Application__Group__12 ;
    public final void rule__Application__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1169:1: ( rule__Application__Group__11__Impl rule__Application__Group__12 )
            // InternalSecurityDsl.g:1170:2: rule__Application__Group__11__Impl rule__Application__Group__12
            {
            pushFollow(FOLLOW_7);
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
    // InternalSecurityDsl.g:1177:1: rule__Application__Group__11__Impl : ( ( rule__Application__Group_11__0 )? ) ;
    public final void rule__Application__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1181:1: ( ( ( rule__Application__Group_11__0 )? ) )
            // InternalSecurityDsl.g:1182:1: ( ( rule__Application__Group_11__0 )? )
            {
            // InternalSecurityDsl.g:1182:1: ( ( rule__Application__Group_11__0 )? )
            // InternalSecurityDsl.g:1183:2: ( rule__Application__Group_11__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_11()); 
            // InternalSecurityDsl.g:1184:2: ( rule__Application__Group_11__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==47) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSecurityDsl.g:1184:3: rule__Application__Group_11__0
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
    // InternalSecurityDsl.g:1192:1: rule__Application__Group__12 : rule__Application__Group__12__Impl rule__Application__Group__13 ;
    public final void rule__Application__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1196:1: ( rule__Application__Group__12__Impl rule__Application__Group__13 )
            // InternalSecurityDsl.g:1197:2: rule__Application__Group__12__Impl rule__Application__Group__13
            {
            pushFollow(FOLLOW_7);
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
    // InternalSecurityDsl.g:1204:1: rule__Application__Group__12__Impl : ( ( rule__Application__Group_12__0 )? ) ;
    public final void rule__Application__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1208:1: ( ( ( rule__Application__Group_12__0 )? ) )
            // InternalSecurityDsl.g:1209:1: ( ( rule__Application__Group_12__0 )? )
            {
            // InternalSecurityDsl.g:1209:1: ( ( rule__Application__Group_12__0 )? )
            // InternalSecurityDsl.g:1210:2: ( rule__Application__Group_12__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_12()); 
            // InternalSecurityDsl.g:1211:2: ( rule__Application__Group_12__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==48) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSecurityDsl.g:1211:3: rule__Application__Group_12__0
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
    // InternalSecurityDsl.g:1219:1: rule__Application__Group__13 : rule__Application__Group__13__Impl rule__Application__Group__14 ;
    public final void rule__Application__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1223:1: ( rule__Application__Group__13__Impl rule__Application__Group__14 )
            // InternalSecurityDsl.g:1224:2: rule__Application__Group__13__Impl rule__Application__Group__14
            {
            pushFollow(FOLLOW_7);
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
    // InternalSecurityDsl.g:1231:1: rule__Application__Group__13__Impl : ( ( rule__Application__Group_13__0 )? ) ;
    public final void rule__Application__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1235:1: ( ( ( rule__Application__Group_13__0 )? ) )
            // InternalSecurityDsl.g:1236:1: ( ( rule__Application__Group_13__0 )? )
            {
            // InternalSecurityDsl.g:1236:1: ( ( rule__Application__Group_13__0 )? )
            // InternalSecurityDsl.g:1237:2: ( rule__Application__Group_13__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_13()); 
            // InternalSecurityDsl.g:1238:2: ( rule__Application__Group_13__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==51) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSecurityDsl.g:1238:3: rule__Application__Group_13__0
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
    // InternalSecurityDsl.g:1246:1: rule__Application__Group__14 : rule__Application__Group__14__Impl ;
    public final void rule__Application__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1250:1: ( rule__Application__Group__14__Impl )
            // InternalSecurityDsl.g:1251:2: rule__Application__Group__14__Impl
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
    // InternalSecurityDsl.g:1257:1: rule__Application__Group__14__Impl : ( ( rule__Application__Group_14__0 )? ) ;
    public final void rule__Application__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1261:1: ( ( ( rule__Application__Group_14__0 )? ) )
            // InternalSecurityDsl.g:1262:1: ( ( rule__Application__Group_14__0 )? )
            {
            // InternalSecurityDsl.g:1262:1: ( ( rule__Application__Group_14__0 )? )
            // InternalSecurityDsl.g:1263:2: ( rule__Application__Group_14__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_14()); 
            // InternalSecurityDsl.g:1264:2: ( rule__Application__Group_14__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==52) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSecurityDsl.g:1264:3: rule__Application__Group_14__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Application__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationAccess().getGroup_14()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:1273:1: rule__Application__Group_4__0 : rule__Application__Group_4__0__Impl rule__Application__Group_4__1 ;
    public final void rule__Application__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1277:1: ( rule__Application__Group_4__0__Impl rule__Application__Group_4__1 )
            // InternalSecurityDsl.g:1278:2: rule__Application__Group_4__0__Impl rule__Application__Group_4__1
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
    // InternalSecurityDsl.g:1285:1: rule__Application__Group_4__0__Impl : ( 'name:' ) ;
    public final void rule__Application__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1289:1: ( ( 'name:' ) )
            // InternalSecurityDsl.g:1290:1: ( 'name:' )
            {
            // InternalSecurityDsl.g:1290:1: ( 'name:' )
            // InternalSecurityDsl.g:1291:2: 'name:'
            {
             before(grammarAccess.getApplicationAccess().getNameKeyword_4_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getNameKeyword_4_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:1300:1: rule__Application__Group_4__1 : rule__Application__Group_4__1__Impl ;
    public final void rule__Application__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1304:1: ( rule__Application__Group_4__1__Impl )
            // InternalSecurityDsl.g:1305:2: rule__Application__Group_4__1__Impl
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
    // InternalSecurityDsl.g:1311:1: rule__Application__Group_4__1__Impl : ( ( rule__Application__NameAssignment_4_1 ) ) ;
    public final void rule__Application__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1315:1: ( ( ( rule__Application__NameAssignment_4_1 ) ) )
            // InternalSecurityDsl.g:1316:1: ( ( rule__Application__NameAssignment_4_1 ) )
            {
            // InternalSecurityDsl.g:1316:1: ( ( rule__Application__NameAssignment_4_1 ) )
            // InternalSecurityDsl.g:1317:2: ( rule__Application__NameAssignment_4_1 )
            {
             before(grammarAccess.getApplicationAccess().getNameAssignment_4_1()); 
            // InternalSecurityDsl.g:1318:2: ( rule__Application__NameAssignment_4_1 )
            // InternalSecurityDsl.g:1318:3: rule__Application__NameAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__NameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getNameAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Application__Group_7__0"
    // InternalSecurityDsl.g:1327:1: rule__Application__Group_7__0 : rule__Application__Group_7__0__Impl rule__Application__Group_7__1 ;
    public final void rule__Application__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1331:1: ( rule__Application__Group_7__0__Impl rule__Application__Group_7__1 )
            // InternalSecurityDsl.g:1332:2: rule__Application__Group_7__0__Impl rule__Application__Group_7__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSecurityDsl.g:1339:1: rule__Application__Group_7__0__Impl : ( 'packageName:' ) ;
    public final void rule__Application__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1343:1: ( ( 'packageName:' ) )
            // InternalSecurityDsl.g:1344:1: ( 'packageName:' )
            {
            // InternalSecurityDsl.g:1344:1: ( 'packageName:' )
            // InternalSecurityDsl.g:1345:2: 'packageName:'
            {
             before(grammarAccess.getApplicationAccess().getPackageNameKeyword_7_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSecurityDsl.g:1354:1: rule__Application__Group_7__1 : rule__Application__Group_7__1__Impl ;
    public final void rule__Application__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1358:1: ( rule__Application__Group_7__1__Impl )
            // InternalSecurityDsl.g:1359:2: rule__Application__Group_7__1__Impl
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
    // InternalSecurityDsl.g:1365:1: rule__Application__Group_7__1__Impl : ( ( rule__Application__PackageNameAssignment_7_1 ) ) ;
    public final void rule__Application__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1369:1: ( ( ( rule__Application__PackageNameAssignment_7_1 ) ) )
            // InternalSecurityDsl.g:1370:1: ( ( rule__Application__PackageNameAssignment_7_1 ) )
            {
            // InternalSecurityDsl.g:1370:1: ( ( rule__Application__PackageNameAssignment_7_1 ) )
            // InternalSecurityDsl.g:1371:2: ( rule__Application__PackageNameAssignment_7_1 )
            {
             before(grammarAccess.getApplicationAccess().getPackageNameAssignment_7_1()); 
            // InternalSecurityDsl.g:1372:2: ( rule__Application__PackageNameAssignment_7_1 )
            // InternalSecurityDsl.g:1372:3: rule__Application__PackageNameAssignment_7_1
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
    // InternalSecurityDsl.g:1381:1: rule__Application__Group_8__0 : rule__Application__Group_8__0__Impl rule__Application__Group_8__1 ;
    public final void rule__Application__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1385:1: ( rule__Application__Group_8__0__Impl rule__Application__Group_8__1 )
            // InternalSecurityDsl.g:1386:2: rule__Application__Group_8__0__Impl rule__Application__Group_8__1
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
    // InternalSecurityDsl.g:1393:1: rule__Application__Group_8__0__Impl : ( 'description:' ) ;
    public final void rule__Application__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1397:1: ( ( 'description:' ) )
            // InternalSecurityDsl.g:1398:1: ( 'description:' )
            {
            // InternalSecurityDsl.g:1398:1: ( 'description:' )
            // InternalSecurityDsl.g:1399:2: 'description:'
            {
             before(grammarAccess.getApplicationAccess().getDescriptionKeyword_8_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getDescriptionKeyword_8_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:1408:1: rule__Application__Group_8__1 : rule__Application__Group_8__1__Impl ;
    public final void rule__Application__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1412:1: ( rule__Application__Group_8__1__Impl )
            // InternalSecurityDsl.g:1413:2: rule__Application__Group_8__1__Impl
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
    // InternalSecurityDsl.g:1419:1: rule__Application__Group_8__1__Impl : ( ( rule__Application__DescriptionAssignment_8_1 ) ) ;
    public final void rule__Application__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1423:1: ( ( ( rule__Application__DescriptionAssignment_8_1 ) ) )
            // InternalSecurityDsl.g:1424:1: ( ( rule__Application__DescriptionAssignment_8_1 ) )
            {
            // InternalSecurityDsl.g:1424:1: ( ( rule__Application__DescriptionAssignment_8_1 ) )
            // InternalSecurityDsl.g:1425:2: ( rule__Application__DescriptionAssignment_8_1 )
            {
             before(grammarAccess.getApplicationAccess().getDescriptionAssignment_8_1()); 
            // InternalSecurityDsl.g:1426:2: ( rule__Application__DescriptionAssignment_8_1 )
            // InternalSecurityDsl.g:1426:3: rule__Application__DescriptionAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__DescriptionAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getDescriptionAssignment_8_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:1435:1: rule__Application__Group_9__0 : rule__Application__Group_9__0__Impl rule__Application__Group_9__1 ;
    public final void rule__Application__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1439:1: ( rule__Application__Group_9__0__Impl rule__Application__Group_9__1 )
            // InternalSecurityDsl.g:1440:2: rule__Application__Group_9__0__Impl rule__Application__Group_9__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSecurityDsl.g:1447:1: rule__Application__Group_9__0__Impl : ( 'port:' ) ;
    public final void rule__Application__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1451:1: ( ( 'port:' ) )
            // InternalSecurityDsl.g:1452:1: ( 'port:' )
            {
            // InternalSecurityDsl.g:1452:1: ( 'port:' )
            // InternalSecurityDsl.g:1453:2: 'port:'
            {
             before(grammarAccess.getApplicationAccess().getPortKeyword_9_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getPortKeyword_9_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:1462:1: rule__Application__Group_9__1 : rule__Application__Group_9__1__Impl ;
    public final void rule__Application__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1466:1: ( rule__Application__Group_9__1__Impl )
            // InternalSecurityDsl.g:1467:2: rule__Application__Group_9__1__Impl
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
    // InternalSecurityDsl.g:1473:1: rule__Application__Group_9__1__Impl : ( ( rule__Application__PortAssignment_9_1 ) ) ;
    public final void rule__Application__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1477:1: ( ( ( rule__Application__PortAssignment_9_1 ) ) )
            // InternalSecurityDsl.g:1478:1: ( ( rule__Application__PortAssignment_9_1 ) )
            {
            // InternalSecurityDsl.g:1478:1: ( ( rule__Application__PortAssignment_9_1 ) )
            // InternalSecurityDsl.g:1479:2: ( rule__Application__PortAssignment_9_1 )
            {
             before(grammarAccess.getApplicationAccess().getPortAssignment_9_1()); 
            // InternalSecurityDsl.g:1480:2: ( rule__Application__PortAssignment_9_1 )
            // InternalSecurityDsl.g:1480:3: rule__Application__PortAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__PortAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getPortAssignment_9_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:1489:1: rule__Application__Group_10__0 : rule__Application__Group_10__0__Impl rule__Application__Group_10__1 ;
    public final void rule__Application__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1493:1: ( rule__Application__Group_10__0__Impl rule__Application__Group_10__1 )
            // InternalSecurityDsl.g:1494:2: rule__Application__Group_10__0__Impl rule__Application__Group_10__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSecurityDsl.g:1501:1: rule__Application__Group_10__0__Impl : ( 'hostname:' ) ;
    public final void rule__Application__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1505:1: ( ( 'hostname:' ) )
            // InternalSecurityDsl.g:1506:1: ( 'hostname:' )
            {
            // InternalSecurityDsl.g:1506:1: ( 'hostname:' )
            // InternalSecurityDsl.g:1507:2: 'hostname:'
            {
             before(grammarAccess.getApplicationAccess().getHostnameKeyword_10_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getHostnameKeyword_10_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:1516:1: rule__Application__Group_10__1 : rule__Application__Group_10__1__Impl ;
    public final void rule__Application__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1520:1: ( rule__Application__Group_10__1__Impl )
            // InternalSecurityDsl.g:1521:2: rule__Application__Group_10__1__Impl
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
    // InternalSecurityDsl.g:1527:1: rule__Application__Group_10__1__Impl : ( ( rule__Application__HostnameAssignment_10_1 ) ) ;
    public final void rule__Application__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1531:1: ( ( ( rule__Application__HostnameAssignment_10_1 ) ) )
            // InternalSecurityDsl.g:1532:1: ( ( rule__Application__HostnameAssignment_10_1 ) )
            {
            // InternalSecurityDsl.g:1532:1: ( ( rule__Application__HostnameAssignment_10_1 ) )
            // InternalSecurityDsl.g:1533:2: ( rule__Application__HostnameAssignment_10_1 )
            {
             before(grammarAccess.getApplicationAccess().getHostnameAssignment_10_1()); 
            // InternalSecurityDsl.g:1534:2: ( rule__Application__HostnameAssignment_10_1 )
            // InternalSecurityDsl.g:1534:3: rule__Application__HostnameAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__HostnameAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getHostnameAssignment_10_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:1543:1: rule__Application__Group_11__0 : rule__Application__Group_11__0__Impl rule__Application__Group_11__1 ;
    public final void rule__Application__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1547:1: ( rule__Application__Group_11__0__Impl rule__Application__Group_11__1 )
            // InternalSecurityDsl.g:1548:2: rule__Application__Group_11__0__Impl rule__Application__Group_11__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalSecurityDsl.g:1555:1: rule__Application__Group_11__0__Impl : ( 'database:' ) ;
    public final void rule__Application__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1559:1: ( ( 'database:' ) )
            // InternalSecurityDsl.g:1560:1: ( 'database:' )
            {
            // InternalSecurityDsl.g:1560:1: ( 'database:' )
            // InternalSecurityDsl.g:1561:2: 'database:'
            {
             before(grammarAccess.getApplicationAccess().getDatabaseKeyword_11_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getDatabaseKeyword_11_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:1570:1: rule__Application__Group_11__1 : rule__Application__Group_11__1__Impl ;
    public final void rule__Application__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1574:1: ( rule__Application__Group_11__1__Impl )
            // InternalSecurityDsl.g:1575:2: rule__Application__Group_11__1__Impl
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
    // InternalSecurityDsl.g:1581:1: rule__Application__Group_11__1__Impl : ( ( rule__Application__App_databaseAssignment_11_1 ) ) ;
    public final void rule__Application__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1585:1: ( ( ( rule__Application__App_databaseAssignment_11_1 ) ) )
            // InternalSecurityDsl.g:1586:1: ( ( rule__Application__App_databaseAssignment_11_1 ) )
            {
            // InternalSecurityDsl.g:1586:1: ( ( rule__Application__App_databaseAssignment_11_1 ) )
            // InternalSecurityDsl.g:1587:2: ( rule__Application__App_databaseAssignment_11_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_databaseAssignment_11_1()); 
            // InternalSecurityDsl.g:1588:2: ( rule__Application__App_databaseAssignment_11_1 )
            // InternalSecurityDsl.g:1588:3: rule__Application__App_databaseAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__App_databaseAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getApp_databaseAssignment_11_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:1597:1: rule__Application__Group_12__0 : rule__Application__Group_12__0__Impl rule__Application__Group_12__1 ;
    public final void rule__Application__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1601:1: ( rule__Application__Group_12__0__Impl rule__Application__Group_12__1 )
            // InternalSecurityDsl.g:1602:2: rule__Application__Group_12__0__Impl rule__Application__Group_12__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSecurityDsl.g:1609:1: rule__Application__Group_12__0__Impl : ( 'model:' ) ;
    public final void rule__Application__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1613:1: ( ( 'model:' ) )
            // InternalSecurityDsl.g:1614:1: ( 'model:' )
            {
            // InternalSecurityDsl.g:1614:1: ( 'model:' )
            // InternalSecurityDsl.g:1615:2: 'model:'
            {
             before(grammarAccess.getApplicationAccess().getModelKeyword_12_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getModelKeyword_12_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:1624:1: rule__Application__Group_12__1 : rule__Application__Group_12__1__Impl rule__Application__Group_12__2 ;
    public final void rule__Application__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1628:1: ( rule__Application__Group_12__1__Impl rule__Application__Group_12__2 )
            // InternalSecurityDsl.g:1629:2: rule__Application__Group_12__1__Impl rule__Application__Group_12__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalSecurityDsl.g:1636:1: rule__Application__Group_12__1__Impl : ( ( rule__Application__Group_12_1__0 )? ) ;
    public final void rule__Application__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1640:1: ( ( ( rule__Application__Group_12_1__0 )? ) )
            // InternalSecurityDsl.g:1641:1: ( ( rule__Application__Group_12_1__0 )? )
            {
            // InternalSecurityDsl.g:1641:1: ( ( rule__Application__Group_12_1__0 )? )
            // InternalSecurityDsl.g:1642:2: ( rule__Application__Group_12_1__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_12_1()); 
            // InternalSecurityDsl.g:1643:2: ( rule__Application__Group_12_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==49) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSecurityDsl.g:1643:3: rule__Application__Group_12_1__0
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


    // $ANTLR start "rule__Application__Group_12__2"
    // InternalSecurityDsl.g:1651:1: rule__Application__Group_12__2 : rule__Application__Group_12__2__Impl ;
    public final void rule__Application__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1655:1: ( rule__Application__Group_12__2__Impl )
            // InternalSecurityDsl.g:1656:2: rule__Application__Group_12__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_12__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalSecurityDsl.g:1662:1: rule__Application__Group_12__2__Impl : ( ( rule__Application__Group_12_2__0 )? ) ;
    public final void rule__Application__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1666:1: ( ( ( rule__Application__Group_12_2__0 )? ) )
            // InternalSecurityDsl.g:1667:1: ( ( rule__Application__Group_12_2__0 )? )
            {
            // InternalSecurityDsl.g:1667:1: ( ( rule__Application__Group_12_2__0 )? )
            // InternalSecurityDsl.g:1668:2: ( rule__Application__Group_12_2__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_12_2()); 
            // InternalSecurityDsl.g:1669:2: ( rule__Application__Group_12_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==50) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSecurityDsl.g:1669:3: rule__Application__Group_12_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Application__Group_12_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationAccess().getGroup_12_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Application__Group_12_1__0"
    // InternalSecurityDsl.g:1678:1: rule__Application__Group_12_1__0 : rule__Application__Group_12_1__0__Impl rule__Application__Group_12_1__1 ;
    public final void rule__Application__Group_12_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1682:1: ( rule__Application__Group_12_1__0__Impl rule__Application__Group_12_1__1 )
            // InternalSecurityDsl.g:1683:2: rule__Application__Group_12_1__0__Impl rule__Application__Group_12_1__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSecurityDsl.g:1690:1: rule__Application__Group_12_1__0__Impl : ( 'user:' ) ;
    public final void rule__Application__Group_12_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1694:1: ( ( 'user:' ) )
            // InternalSecurityDsl.g:1695:1: ( 'user:' )
            {
            // InternalSecurityDsl.g:1695:1: ( 'user:' )
            // InternalSecurityDsl.g:1696:2: 'user:'
            {
             before(grammarAccess.getApplicationAccess().getUserKeyword_12_1_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getUserKeyword_12_1_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:1705:1: rule__Application__Group_12_1__1 : rule__Application__Group_12_1__1__Impl ;
    public final void rule__Application__Group_12_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1709:1: ( rule__Application__Group_12_1__1__Impl )
            // InternalSecurityDsl.g:1710:2: rule__Application__Group_12_1__1__Impl
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
    // InternalSecurityDsl.g:1716:1: rule__Application__Group_12_1__1__Impl : ( ( rule__Application__App_entitiesAssignment_12_1_1 ) ) ;
    public final void rule__Application__Group_12_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1720:1: ( ( ( rule__Application__App_entitiesAssignment_12_1_1 ) ) )
            // InternalSecurityDsl.g:1721:1: ( ( rule__Application__App_entitiesAssignment_12_1_1 ) )
            {
            // InternalSecurityDsl.g:1721:1: ( ( rule__Application__App_entitiesAssignment_12_1_1 ) )
            // InternalSecurityDsl.g:1722:2: ( rule__Application__App_entitiesAssignment_12_1_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_entitiesAssignment_12_1_1()); 
            // InternalSecurityDsl.g:1723:2: ( rule__Application__App_entitiesAssignment_12_1_1 )
            // InternalSecurityDsl.g:1723:3: rule__Application__App_entitiesAssignment_12_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__App_entitiesAssignment_12_1_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getApp_entitiesAssignment_12_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Application__Group_12_2__0"
    // InternalSecurityDsl.g:1732:1: rule__Application__Group_12_2__0 : rule__Application__Group_12_2__0__Impl rule__Application__Group_12_2__1 ;
    public final void rule__Application__Group_12_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1736:1: ( rule__Application__Group_12_2__0__Impl rule__Application__Group_12_2__1 )
            // InternalSecurityDsl.g:1737:2: rule__Application__Group_12_2__0__Impl rule__Application__Group_12_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Application__Group_12_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_12_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_12_2__0"


    // $ANTLR start "rule__Application__Group_12_2__0__Impl"
    // InternalSecurityDsl.g:1744:1: rule__Application__Group_12_2__0__Impl : ( 'role:' ) ;
    public final void rule__Application__Group_12_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1748:1: ( ( 'role:' ) )
            // InternalSecurityDsl.g:1749:1: ( 'role:' )
            {
            // InternalSecurityDsl.g:1749:1: ( 'role:' )
            // InternalSecurityDsl.g:1750:2: 'role:'
            {
             before(grammarAccess.getApplicationAccess().getRoleKeyword_12_2_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getRoleKeyword_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_12_2__0__Impl"


    // $ANTLR start "rule__Application__Group_12_2__1"
    // InternalSecurityDsl.g:1759:1: rule__Application__Group_12_2__1 : rule__Application__Group_12_2__1__Impl ;
    public final void rule__Application__Group_12_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1763:1: ( rule__Application__Group_12_2__1__Impl )
            // InternalSecurityDsl.g:1764:2: rule__Application__Group_12_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_12_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_12_2__1"


    // $ANTLR start "rule__Application__Group_12_2__1__Impl"
    // InternalSecurityDsl.g:1770:1: rule__Application__Group_12_2__1__Impl : ( ( rule__Application__App_entitiesAssignment_12_2_1 ) ) ;
    public final void rule__Application__Group_12_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1774:1: ( ( ( rule__Application__App_entitiesAssignment_12_2_1 ) ) )
            // InternalSecurityDsl.g:1775:1: ( ( rule__Application__App_entitiesAssignment_12_2_1 ) )
            {
            // InternalSecurityDsl.g:1775:1: ( ( rule__Application__App_entitiesAssignment_12_2_1 ) )
            // InternalSecurityDsl.g:1776:2: ( rule__Application__App_entitiesAssignment_12_2_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_entitiesAssignment_12_2_1()); 
            // InternalSecurityDsl.g:1777:2: ( rule__Application__App_entitiesAssignment_12_2_1 )
            // InternalSecurityDsl.g:1777:3: rule__Application__App_entitiesAssignment_12_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__App_entitiesAssignment_12_2_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getApp_entitiesAssignment_12_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_12_2__1__Impl"


    // $ANTLR start "rule__Application__Group_13__0"
    // InternalSecurityDsl.g:1786:1: rule__Application__Group_13__0 : rule__Application__Group_13__0__Impl rule__Application__Group_13__1 ;
    public final void rule__Application__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1790:1: ( rule__Application__Group_13__0__Impl rule__Application__Group_13__1 )
            // InternalSecurityDsl.g:1791:2: rule__Application__Group_13__0__Impl rule__Application__Group_13__1
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
    // InternalSecurityDsl.g:1798:1: rule__Application__Group_13__0__Impl : ( 'security:' ) ;
    public final void rule__Application__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1802:1: ( ( 'security:' ) )
            // InternalSecurityDsl.g:1803:1: ( 'security:' )
            {
            // InternalSecurityDsl.g:1803:1: ( 'security:' )
            // InternalSecurityDsl.g:1804:2: 'security:'
            {
             before(grammarAccess.getApplicationAccess().getSecurityKeyword_13_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getSecurityKeyword_13_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:1813:1: rule__Application__Group_13__1 : rule__Application__Group_13__1__Impl ;
    public final void rule__Application__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1817:1: ( rule__Application__Group_13__1__Impl )
            // InternalSecurityDsl.g:1818:2: rule__Application__Group_13__1__Impl
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
    // InternalSecurityDsl.g:1824:1: rule__Application__Group_13__1__Impl : ( ( rule__Application__App_securityAssignment_13_1 ) ) ;
    public final void rule__Application__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1828:1: ( ( ( rule__Application__App_securityAssignment_13_1 ) ) )
            // InternalSecurityDsl.g:1829:1: ( ( rule__Application__App_securityAssignment_13_1 ) )
            {
            // InternalSecurityDsl.g:1829:1: ( ( rule__Application__App_securityAssignment_13_1 ) )
            // InternalSecurityDsl.g:1830:2: ( rule__Application__App_securityAssignment_13_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_securityAssignment_13_1()); 
            // InternalSecurityDsl.g:1831:2: ( rule__Application__App_securityAssignment_13_1 )
            // InternalSecurityDsl.g:1831:3: rule__Application__App_securityAssignment_13_1
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


    // $ANTLR start "rule__Application__Group_14__0"
    // InternalSecurityDsl.g:1840:1: rule__Application__Group_14__0 : rule__Application__Group_14__0__Impl rule__Application__Group_14__1 ;
    public final void rule__Application__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1844:1: ( rule__Application__Group_14__0__Impl rule__Application__Group_14__1 )
            // InternalSecurityDsl.g:1845:2: rule__Application__Group_14__0__Impl rule__Application__Group_14__1
            {
            pushFollow(FOLLOW_14);
            rule__Application__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_14__0"


    // $ANTLR start "rule__Application__Group_14__0__Impl"
    // InternalSecurityDsl.g:1852:1: rule__Application__Group_14__0__Impl : ( 'controller:' ) ;
    public final void rule__Application__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1856:1: ( ( 'controller:' ) )
            // InternalSecurityDsl.g:1857:1: ( 'controller:' )
            {
            // InternalSecurityDsl.g:1857:1: ( 'controller:' )
            // InternalSecurityDsl.g:1858:2: 'controller:'
            {
             before(grammarAccess.getApplicationAccess().getControllerKeyword_14_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getControllerKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_14__0__Impl"


    // $ANTLR start "rule__Application__Group_14__1"
    // InternalSecurityDsl.g:1867:1: rule__Application__Group_14__1 : rule__Application__Group_14__1__Impl ;
    public final void rule__Application__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1871:1: ( rule__Application__Group_14__1__Impl )
            // InternalSecurityDsl.g:1872:2: rule__Application__Group_14__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_14__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_14__1"


    // $ANTLR start "rule__Application__Group_14__1__Impl"
    // InternalSecurityDsl.g:1878:1: rule__Application__Group_14__1__Impl : ( ( rule__Application__Group_14_1__0 )? ) ;
    public final void rule__Application__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1882:1: ( ( ( rule__Application__Group_14_1__0 )? ) )
            // InternalSecurityDsl.g:1883:1: ( ( rule__Application__Group_14_1__0 )? )
            {
            // InternalSecurityDsl.g:1883:1: ( ( rule__Application__Group_14_1__0 )? )
            // InternalSecurityDsl.g:1884:2: ( rule__Application__Group_14_1__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_14_1()); 
            // InternalSecurityDsl.g:1885:2: ( rule__Application__Group_14_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==53) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSecurityDsl.g:1885:3: rule__Application__Group_14_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Application__Group_14_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationAccess().getGroup_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_14__1__Impl"


    // $ANTLR start "rule__Application__Group_14_1__0"
    // InternalSecurityDsl.g:1894:1: rule__Application__Group_14_1__0 : rule__Application__Group_14_1__0__Impl rule__Application__Group_14_1__1 ;
    public final void rule__Application__Group_14_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1898:1: ( rule__Application__Group_14_1__0__Impl rule__Application__Group_14_1__1 )
            // InternalSecurityDsl.g:1899:2: rule__Application__Group_14_1__0__Impl rule__Application__Group_14_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Application__Group_14_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_14_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_14_1__0"


    // $ANTLR start "rule__Application__Group_14_1__0__Impl"
    // InternalSecurityDsl.g:1906:1: rule__Application__Group_14_1__0__Impl : ( 'auth:' ) ;
    public final void rule__Application__Group_14_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1910:1: ( ( 'auth:' ) )
            // InternalSecurityDsl.g:1911:1: ( 'auth:' )
            {
            // InternalSecurityDsl.g:1911:1: ( 'auth:' )
            // InternalSecurityDsl.g:1912:2: 'auth:'
            {
             before(grammarAccess.getApplicationAccess().getAuthKeyword_14_1_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getAuthKeyword_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_14_1__0__Impl"


    // $ANTLR start "rule__Application__Group_14_1__1"
    // InternalSecurityDsl.g:1921:1: rule__Application__Group_14_1__1 : rule__Application__Group_14_1__1__Impl ;
    public final void rule__Application__Group_14_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1925:1: ( rule__Application__Group_14_1__1__Impl )
            // InternalSecurityDsl.g:1926:2: rule__Application__Group_14_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_14_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_14_1__1"


    // $ANTLR start "rule__Application__Group_14_1__1__Impl"
    // InternalSecurityDsl.g:1932:1: rule__Application__Group_14_1__1__Impl : ( ( rule__Application__App_controllersAssignment_14_1_1 ) ) ;
    public final void rule__Application__Group_14_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1936:1: ( ( ( rule__Application__App_controllersAssignment_14_1_1 ) ) )
            // InternalSecurityDsl.g:1937:1: ( ( rule__Application__App_controllersAssignment_14_1_1 ) )
            {
            // InternalSecurityDsl.g:1937:1: ( ( rule__Application__App_controllersAssignment_14_1_1 ) )
            // InternalSecurityDsl.g:1938:2: ( rule__Application__App_controllersAssignment_14_1_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_controllersAssignment_14_1_1()); 
            // InternalSecurityDsl.g:1939:2: ( rule__Application__App_controllersAssignment_14_1_1 )
            // InternalSecurityDsl.g:1939:3: rule__Application__App_controllersAssignment_14_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__App_controllersAssignment_14_1_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getApp_controllersAssignment_14_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_14_1__1__Impl"


    // $ANTLR start "rule__Database__Group__0"
    // InternalSecurityDsl.g:1948:1: rule__Database__Group__0 : rule__Database__Group__0__Impl rule__Database__Group__1 ;
    public final void rule__Database__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1952:1: ( rule__Database__Group__0__Impl rule__Database__Group__1 )
            // InternalSecurityDsl.g:1953:2: rule__Database__Group__0__Impl rule__Database__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSecurityDsl.g:1960:1: rule__Database__Group__0__Impl : ( 'vendor:' ) ;
    public final void rule__Database__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1964:1: ( ( 'vendor:' ) )
            // InternalSecurityDsl.g:1965:1: ( 'vendor:' )
            {
            // InternalSecurityDsl.g:1965:1: ( 'vendor:' )
            // InternalSecurityDsl.g:1966:2: 'vendor:'
            {
             before(grammarAccess.getDatabaseAccess().getVendorKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalSecurityDsl.g:1975:1: rule__Database__Group__1 : rule__Database__Group__1__Impl rule__Database__Group__2 ;
    public final void rule__Database__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1979:1: ( rule__Database__Group__1__Impl rule__Database__Group__2 )
            // InternalSecurityDsl.g:1980:2: rule__Database__Group__1__Impl rule__Database__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalSecurityDsl.g:1987:1: rule__Database__Group__1__Impl : ( ( rule__Database__VendorNameAssignment_1 ) ) ;
    public final void rule__Database__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1991:1: ( ( ( rule__Database__VendorNameAssignment_1 ) ) )
            // InternalSecurityDsl.g:1992:1: ( ( rule__Database__VendorNameAssignment_1 ) )
            {
            // InternalSecurityDsl.g:1992:1: ( ( rule__Database__VendorNameAssignment_1 ) )
            // InternalSecurityDsl.g:1993:2: ( rule__Database__VendorNameAssignment_1 )
            {
             before(grammarAccess.getDatabaseAccess().getVendorNameAssignment_1()); 
            // InternalSecurityDsl.g:1994:2: ( rule__Database__VendorNameAssignment_1 )
            // InternalSecurityDsl.g:1994:3: rule__Database__VendorNameAssignment_1
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
    // InternalSecurityDsl.g:2002:1: rule__Database__Group__2 : rule__Database__Group__2__Impl rule__Database__Group__3 ;
    public final void rule__Database__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2006:1: ( rule__Database__Group__2__Impl rule__Database__Group__3 )
            // InternalSecurityDsl.g:2007:2: rule__Database__Group__2__Impl rule__Database__Group__3
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
    // InternalSecurityDsl.g:2014:1: rule__Database__Group__2__Impl : ( 'url:' ) ;
    public final void rule__Database__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2018:1: ( ( 'url:' ) )
            // InternalSecurityDsl.g:2019:1: ( 'url:' )
            {
            // InternalSecurityDsl.g:2019:1: ( 'url:' )
            // InternalSecurityDsl.g:2020:2: 'url:'
            {
             before(grammarAccess.getDatabaseAccess().getUrlKeyword_2()); 
            match(input,55,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2029:1: rule__Database__Group__3 : rule__Database__Group__3__Impl rule__Database__Group__4 ;
    public final void rule__Database__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2033:1: ( rule__Database__Group__3__Impl rule__Database__Group__4 )
            // InternalSecurityDsl.g:2034:2: rule__Database__Group__3__Impl rule__Database__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalSecurityDsl.g:2041:1: rule__Database__Group__3__Impl : ( ( rule__Database__UrlAssignment_3 ) ) ;
    public final void rule__Database__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2045:1: ( ( ( rule__Database__UrlAssignment_3 ) ) )
            // InternalSecurityDsl.g:2046:1: ( ( rule__Database__UrlAssignment_3 ) )
            {
            // InternalSecurityDsl.g:2046:1: ( ( rule__Database__UrlAssignment_3 ) )
            // InternalSecurityDsl.g:2047:2: ( rule__Database__UrlAssignment_3 )
            {
             before(grammarAccess.getDatabaseAccess().getUrlAssignment_3()); 
            // InternalSecurityDsl.g:2048:2: ( rule__Database__UrlAssignment_3 )
            // InternalSecurityDsl.g:2048:3: rule__Database__UrlAssignment_3
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
    // InternalSecurityDsl.g:2056:1: rule__Database__Group__4 : rule__Database__Group__4__Impl rule__Database__Group__5 ;
    public final void rule__Database__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2060:1: ( rule__Database__Group__4__Impl rule__Database__Group__5 )
            // InternalSecurityDsl.g:2061:2: rule__Database__Group__4__Impl rule__Database__Group__5
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
    // InternalSecurityDsl.g:2068:1: rule__Database__Group__4__Impl : ( 'username:' ) ;
    public final void rule__Database__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2072:1: ( ( 'username:' ) )
            // InternalSecurityDsl.g:2073:1: ( 'username:' )
            {
            // InternalSecurityDsl.g:2073:1: ( 'username:' )
            // InternalSecurityDsl.g:2074:2: 'username:'
            {
             before(grammarAccess.getDatabaseAccess().getUsernameKeyword_4()); 
            match(input,56,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2083:1: rule__Database__Group__5 : rule__Database__Group__5__Impl rule__Database__Group__6 ;
    public final void rule__Database__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2087:1: ( rule__Database__Group__5__Impl rule__Database__Group__6 )
            // InternalSecurityDsl.g:2088:2: rule__Database__Group__5__Impl rule__Database__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalSecurityDsl.g:2095:1: rule__Database__Group__5__Impl : ( ( rule__Database__UsernameAssignment_5 ) ) ;
    public final void rule__Database__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2099:1: ( ( ( rule__Database__UsernameAssignment_5 ) ) )
            // InternalSecurityDsl.g:2100:1: ( ( rule__Database__UsernameAssignment_5 ) )
            {
            // InternalSecurityDsl.g:2100:1: ( ( rule__Database__UsernameAssignment_5 ) )
            // InternalSecurityDsl.g:2101:2: ( rule__Database__UsernameAssignment_5 )
            {
             before(grammarAccess.getDatabaseAccess().getUsernameAssignment_5()); 
            // InternalSecurityDsl.g:2102:2: ( rule__Database__UsernameAssignment_5 )
            // InternalSecurityDsl.g:2102:3: rule__Database__UsernameAssignment_5
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
    // InternalSecurityDsl.g:2110:1: rule__Database__Group__6 : rule__Database__Group__6__Impl rule__Database__Group__7 ;
    public final void rule__Database__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2114:1: ( rule__Database__Group__6__Impl rule__Database__Group__7 )
            // InternalSecurityDsl.g:2115:2: rule__Database__Group__6__Impl rule__Database__Group__7
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
    // InternalSecurityDsl.g:2122:1: rule__Database__Group__6__Impl : ( 'password:' ) ;
    public final void rule__Database__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2126:1: ( ( 'password:' ) )
            // InternalSecurityDsl.g:2127:1: ( 'password:' )
            {
            // InternalSecurityDsl.g:2127:1: ( 'password:' )
            // InternalSecurityDsl.g:2128:2: 'password:'
            {
             before(grammarAccess.getDatabaseAccess().getPasswordKeyword_6()); 
            match(input,57,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2137:1: rule__Database__Group__7 : rule__Database__Group__7__Impl ;
    public final void rule__Database__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2141:1: ( rule__Database__Group__7__Impl )
            // InternalSecurityDsl.g:2142:2: rule__Database__Group__7__Impl
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
    // InternalSecurityDsl.g:2148:1: rule__Database__Group__7__Impl : ( ( rule__Database__PasswordAssignment_7 ) ) ;
    public final void rule__Database__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2152:1: ( ( ( rule__Database__PasswordAssignment_7 ) ) )
            // InternalSecurityDsl.g:2153:1: ( ( rule__Database__PasswordAssignment_7 ) )
            {
            // InternalSecurityDsl.g:2153:1: ( ( rule__Database__PasswordAssignment_7 ) )
            // InternalSecurityDsl.g:2154:2: ( rule__Database__PasswordAssignment_7 )
            {
             before(grammarAccess.getDatabaseAccess().getPasswordAssignment_7()); 
            // InternalSecurityDsl.g:2155:2: ( rule__Database__PasswordAssignment_7 )
            // InternalSecurityDsl.g:2155:3: rule__Database__PasswordAssignment_7
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
    // InternalSecurityDsl.g:2164:1: rule__ELongObject__Group__0 : rule__ELongObject__Group__0__Impl rule__ELongObject__Group__1 ;
    public final void rule__ELongObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2168:1: ( rule__ELongObject__Group__0__Impl rule__ELongObject__Group__1 )
            // InternalSecurityDsl.g:2169:2: rule__ELongObject__Group__0__Impl rule__ELongObject__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSecurityDsl.g:2176:1: rule__ELongObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__ELongObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2180:1: ( ( ( '-' )? ) )
            // InternalSecurityDsl.g:2181:1: ( ( '-' )? )
            {
            // InternalSecurityDsl.g:2181:1: ( ( '-' )? )
            // InternalSecurityDsl.g:2182:2: ( '-' )?
            {
             before(grammarAccess.getELongObjectAccess().getHyphenMinusKeyword_0()); 
            // InternalSecurityDsl.g:2183:2: ( '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==58) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSecurityDsl.g:2183:3: '-'
                    {
                    match(input,58,FOLLOW_2); 

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
    // InternalSecurityDsl.g:2191:1: rule__ELongObject__Group__1 : rule__ELongObject__Group__1__Impl ;
    public final void rule__ELongObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2195:1: ( rule__ELongObject__Group__1__Impl )
            // InternalSecurityDsl.g:2196:2: rule__ELongObject__Group__1__Impl
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
    // InternalSecurityDsl.g:2202:1: rule__ELongObject__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__ELongObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2206:1: ( ( RULE_INT ) )
            // InternalSecurityDsl.g:2207:1: ( RULE_INT )
            {
            // InternalSecurityDsl.g:2207:1: ( RULE_INT )
            // InternalSecurityDsl.g:2208:2: RULE_INT
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
    // InternalSecurityDsl.g:2218:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2222:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalSecurityDsl.g:2223:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalSecurityDsl.g:2230:1: rule__Attribute__Group__0__Impl : ( '{' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2234:1: ( ( '{' ) )
            // InternalSecurityDsl.g:2235:1: ( '{' )
            {
            // InternalSecurityDsl.g:2235:1: ( '{' )
            // InternalSecurityDsl.g:2236:2: '{'
            {
             before(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2245:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2249:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalSecurityDsl.g:2250:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalSecurityDsl.g:2257:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__IdentifierAssignment_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2261:1: ( ( ( rule__Attribute__IdentifierAssignment_1 )? ) )
            // InternalSecurityDsl.g:2262:1: ( ( rule__Attribute__IdentifierAssignment_1 )? )
            {
            // InternalSecurityDsl.g:2262:1: ( ( rule__Attribute__IdentifierAssignment_1 )? )
            // InternalSecurityDsl.g:2263:2: ( rule__Attribute__IdentifierAssignment_1 )?
            {
             before(grammarAccess.getAttributeAccess().getIdentifierAssignment_1()); 
            // InternalSecurityDsl.g:2264:2: ( rule__Attribute__IdentifierAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==92) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSecurityDsl.g:2264:3: rule__Attribute__IdentifierAssignment_1
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
    // InternalSecurityDsl.g:2272:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2276:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalSecurityDsl.g:2277:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalSecurityDsl.g:2284:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__CredentialAssignment_2 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2288:1: ( ( ( rule__Attribute__CredentialAssignment_2 )? ) )
            // InternalSecurityDsl.g:2289:1: ( ( rule__Attribute__CredentialAssignment_2 )? )
            {
            // InternalSecurityDsl.g:2289:1: ( ( rule__Attribute__CredentialAssignment_2 )? )
            // InternalSecurityDsl.g:2290:2: ( rule__Attribute__CredentialAssignment_2 )?
            {
             before(grammarAccess.getAttributeAccess().getCredentialAssignment_2()); 
            // InternalSecurityDsl.g:2291:2: ( rule__Attribute__CredentialAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==93) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSecurityDsl.g:2291:3: rule__Attribute__CredentialAssignment_2
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
    // InternalSecurityDsl.g:2299:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2303:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalSecurityDsl.g:2304:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
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
    // InternalSecurityDsl.g:2311:1: rule__Attribute__Group__3__Impl : ( 'name:' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2315:1: ( ( 'name:' ) )
            // InternalSecurityDsl.g:2316:1: ( 'name:' )
            {
            // InternalSecurityDsl.g:2316:1: ( 'name:' )
            // InternalSecurityDsl.g:2317:2: 'name:'
            {
             before(grammarAccess.getAttributeAccess().getNameKeyword_3()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2326:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2330:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalSecurityDsl.g:2331:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalSecurityDsl.g:2338:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__NameAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2342:1: ( ( ( rule__Attribute__NameAssignment_4 ) ) )
            // InternalSecurityDsl.g:2343:1: ( ( rule__Attribute__NameAssignment_4 ) )
            {
            // InternalSecurityDsl.g:2343:1: ( ( rule__Attribute__NameAssignment_4 ) )
            // InternalSecurityDsl.g:2344:2: ( rule__Attribute__NameAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_4()); 
            // InternalSecurityDsl.g:2345:2: ( rule__Attribute__NameAssignment_4 )
            // InternalSecurityDsl.g:2345:3: rule__Attribute__NameAssignment_4
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
    // InternalSecurityDsl.g:2353:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2357:1: ( rule__Attribute__Group__5__Impl rule__Attribute__Group__6 )
            // InternalSecurityDsl.g:2358:2: rule__Attribute__Group__5__Impl rule__Attribute__Group__6
            {
            pushFollow(FOLLOW_22);
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
    // InternalSecurityDsl.g:2365:1: rule__Attribute__Group__5__Impl : ( 'type:' ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2369:1: ( ( 'type:' ) )
            // InternalSecurityDsl.g:2370:1: ( 'type:' )
            {
            // InternalSecurityDsl.g:2370:1: ( 'type:' )
            // InternalSecurityDsl.g:2371:2: 'type:'
            {
             before(grammarAccess.getAttributeAccess().getTypeKeyword_5()); 
            match(input,60,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2380:1: rule__Attribute__Group__6 : rule__Attribute__Group__6__Impl rule__Attribute__Group__7 ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2384:1: ( rule__Attribute__Group__6__Impl rule__Attribute__Group__7 )
            // InternalSecurityDsl.g:2385:2: rule__Attribute__Group__6__Impl rule__Attribute__Group__7
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
    // InternalSecurityDsl.g:2392:1: rule__Attribute__Group__6__Impl : ( ( rule__Attribute__TypeAssignment_6 ) ) ;
    public final void rule__Attribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2396:1: ( ( ( rule__Attribute__TypeAssignment_6 ) ) )
            // InternalSecurityDsl.g:2397:1: ( ( rule__Attribute__TypeAssignment_6 ) )
            {
            // InternalSecurityDsl.g:2397:1: ( ( rule__Attribute__TypeAssignment_6 ) )
            // InternalSecurityDsl.g:2398:2: ( rule__Attribute__TypeAssignment_6 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_6()); 
            // InternalSecurityDsl.g:2399:2: ( rule__Attribute__TypeAssignment_6 )
            // InternalSecurityDsl.g:2399:3: rule__Attribute__TypeAssignment_6
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
    // InternalSecurityDsl.g:2407:1: rule__Attribute__Group__7 : rule__Attribute__Group__7__Impl rule__Attribute__Group__8 ;
    public final void rule__Attribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2411:1: ( rule__Attribute__Group__7__Impl rule__Attribute__Group__8 )
            // InternalSecurityDsl.g:2412:2: rule__Attribute__Group__7__Impl rule__Attribute__Group__8
            {
            pushFollow(FOLLOW_23);
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
    // InternalSecurityDsl.g:2419:1: rule__Attribute__Group__7__Impl : ( ( rule__Attribute__Group_7__0 )? ) ;
    public final void rule__Attribute__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2423:1: ( ( ( rule__Attribute__Group_7__0 )? ) )
            // InternalSecurityDsl.g:2424:1: ( ( rule__Attribute__Group_7__0 )? )
            {
            // InternalSecurityDsl.g:2424:1: ( ( rule__Attribute__Group_7__0 )? )
            // InternalSecurityDsl.g:2425:2: ( rule__Attribute__Group_7__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_7()); 
            // InternalSecurityDsl.g:2426:2: ( rule__Attribute__Group_7__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==62) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSecurityDsl.g:2426:3: rule__Attribute__Group_7__0
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
    // InternalSecurityDsl.g:2434:1: rule__Attribute__Group__8 : rule__Attribute__Group__8__Impl ;
    public final void rule__Attribute__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2438:1: ( rule__Attribute__Group__8__Impl )
            // InternalSecurityDsl.g:2439:2: rule__Attribute__Group__8__Impl
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
    // InternalSecurityDsl.g:2445:1: rule__Attribute__Group__8__Impl : ( '}' ) ;
    public final void rule__Attribute__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2449:1: ( ( '}' ) )
            // InternalSecurityDsl.g:2450:1: ( '}' )
            {
            // InternalSecurityDsl.g:2450:1: ( '}' )
            // InternalSecurityDsl.g:2451:2: '}'
            {
             before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_8()); 
            match(input,61,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2461:1: rule__Attribute__Group_7__0 : rule__Attribute__Group_7__0__Impl rule__Attribute__Group_7__1 ;
    public final void rule__Attribute__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2465:1: ( rule__Attribute__Group_7__0__Impl rule__Attribute__Group_7__1 )
            // InternalSecurityDsl.g:2466:2: rule__Attribute__Group_7__0__Impl rule__Attribute__Group_7__1
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
    // InternalSecurityDsl.g:2473:1: rule__Attribute__Group_7__0__Impl : ( 'collumnName:' ) ;
    public final void rule__Attribute__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2477:1: ( ( 'collumnName:' ) )
            // InternalSecurityDsl.g:2478:1: ( 'collumnName:' )
            {
            // InternalSecurityDsl.g:2478:1: ( 'collumnName:' )
            // InternalSecurityDsl.g:2479:2: 'collumnName:'
            {
             before(grammarAccess.getAttributeAccess().getCollumnNameKeyword_7_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2488:1: rule__Attribute__Group_7__1 : rule__Attribute__Group_7__1__Impl ;
    public final void rule__Attribute__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2492:1: ( rule__Attribute__Group_7__1__Impl )
            // InternalSecurityDsl.g:2493:2: rule__Attribute__Group_7__1__Impl
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
    // InternalSecurityDsl.g:2499:1: rule__Attribute__Group_7__1__Impl : ( ( rule__Attribute__CollumnNameAssignment_7_1 ) ) ;
    public final void rule__Attribute__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2503:1: ( ( ( rule__Attribute__CollumnNameAssignment_7_1 ) ) )
            // InternalSecurityDsl.g:2504:1: ( ( rule__Attribute__CollumnNameAssignment_7_1 ) )
            {
            // InternalSecurityDsl.g:2504:1: ( ( rule__Attribute__CollumnNameAssignment_7_1 ) )
            // InternalSecurityDsl.g:2505:2: ( rule__Attribute__CollumnNameAssignment_7_1 )
            {
             before(grammarAccess.getAttributeAccess().getCollumnNameAssignment_7_1()); 
            // InternalSecurityDsl.g:2506:2: ( rule__Attribute__CollumnNameAssignment_7_1 )
            // InternalSecurityDsl.g:2506:3: rule__Attribute__CollumnNameAssignment_7_1
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
    // InternalSecurityDsl.g:2515:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2519:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // InternalSecurityDsl.g:2520:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalSecurityDsl.g:2527:1: rule__Role__Group__0__Impl : ( () ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2531:1: ( ( () ) )
            // InternalSecurityDsl.g:2532:1: ( () )
            {
            // InternalSecurityDsl.g:2532:1: ( () )
            // InternalSecurityDsl.g:2533:2: ()
            {
             before(grammarAccess.getRoleAccess().getRoleAction_0()); 
            // InternalSecurityDsl.g:2534:2: ()
            // InternalSecurityDsl.g:2534:3: 
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
    // InternalSecurityDsl.g:2542:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2546:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // InternalSecurityDsl.g:2547:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalSecurityDsl.g:2554:1: rule__Role__Group__1__Impl : ( ( rule__Role__Group_1__0 )? ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2558:1: ( ( ( rule__Role__Group_1__0 )? ) )
            // InternalSecurityDsl.g:2559:1: ( ( rule__Role__Group_1__0 )? )
            {
            // InternalSecurityDsl.g:2559:1: ( ( rule__Role__Group_1__0 )? )
            // InternalSecurityDsl.g:2560:2: ( rule__Role__Group_1__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_1()); 
            // InternalSecurityDsl.g:2561:2: ( rule__Role__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==63) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSecurityDsl.g:2561:3: rule__Role__Group_1__0
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
    // InternalSecurityDsl.g:2569:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2573:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // InternalSecurityDsl.g:2574:2: rule__Role__Group__2__Impl rule__Role__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalSecurityDsl.g:2581:1: rule__Role__Group__2__Impl : ( ( rule__Role__Group_2__0 )? ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2585:1: ( ( ( rule__Role__Group_2__0 )? ) )
            // InternalSecurityDsl.g:2586:1: ( ( rule__Role__Group_2__0 )? )
            {
            // InternalSecurityDsl.g:2586:1: ( ( rule__Role__Group_2__0 )? )
            // InternalSecurityDsl.g:2587:2: ( rule__Role__Group_2__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_2()); 
            // InternalSecurityDsl.g:2588:2: ( rule__Role__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==64) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSecurityDsl.g:2588:3: rule__Role__Group_2__0
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
    // InternalSecurityDsl.g:2596:1: rule__Role__Group__3 : rule__Role__Group__3__Impl ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2600:1: ( rule__Role__Group__3__Impl )
            // InternalSecurityDsl.g:2601:2: rule__Role__Group__3__Impl
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
    // InternalSecurityDsl.g:2607:1: rule__Role__Group__3__Impl : ( ( rule__Role__Group_3__0 )? ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2611:1: ( ( ( rule__Role__Group_3__0 )? ) )
            // InternalSecurityDsl.g:2612:1: ( ( rule__Role__Group_3__0 )? )
            {
            // InternalSecurityDsl.g:2612:1: ( ( rule__Role__Group_3__0 )? )
            // InternalSecurityDsl.g:2613:2: ( rule__Role__Group_3__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_3()); 
            // InternalSecurityDsl.g:2614:2: ( rule__Role__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==68) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSecurityDsl.g:2614:3: rule__Role__Group_3__0
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
    // InternalSecurityDsl.g:2623:1: rule__Role__Group_1__0 : rule__Role__Group_1__0__Impl rule__Role__Group_1__1 ;
    public final void rule__Role__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2627:1: ( rule__Role__Group_1__0__Impl rule__Role__Group_1__1 )
            // InternalSecurityDsl.g:2628:2: rule__Role__Group_1__0__Impl rule__Role__Group_1__1
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
    // InternalSecurityDsl.g:2635:1: rule__Role__Group_1__0__Impl : ( 'tableName:' ) ;
    public final void rule__Role__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2639:1: ( ( 'tableName:' ) )
            // InternalSecurityDsl.g:2640:1: ( 'tableName:' )
            {
            // InternalSecurityDsl.g:2640:1: ( 'tableName:' )
            // InternalSecurityDsl.g:2641:2: 'tableName:'
            {
             before(grammarAccess.getRoleAccess().getTableNameKeyword_1_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2650:1: rule__Role__Group_1__1 : rule__Role__Group_1__1__Impl ;
    public final void rule__Role__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2654:1: ( rule__Role__Group_1__1__Impl )
            // InternalSecurityDsl.g:2655:2: rule__Role__Group_1__1__Impl
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
    // InternalSecurityDsl.g:2661:1: rule__Role__Group_1__1__Impl : ( ( rule__Role__TableNameAssignment_1_1 ) ) ;
    public final void rule__Role__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2665:1: ( ( ( rule__Role__TableNameAssignment_1_1 ) ) )
            // InternalSecurityDsl.g:2666:1: ( ( rule__Role__TableNameAssignment_1_1 ) )
            {
            // InternalSecurityDsl.g:2666:1: ( ( rule__Role__TableNameAssignment_1_1 ) )
            // InternalSecurityDsl.g:2667:2: ( rule__Role__TableNameAssignment_1_1 )
            {
             before(grammarAccess.getRoleAccess().getTableNameAssignment_1_1()); 
            // InternalSecurityDsl.g:2668:2: ( rule__Role__TableNameAssignment_1_1 )
            // InternalSecurityDsl.g:2668:3: rule__Role__TableNameAssignment_1_1
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
    // InternalSecurityDsl.g:2677:1: rule__Role__Group_2__0 : rule__Role__Group_2__0__Impl rule__Role__Group_2__1 ;
    public final void rule__Role__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2681:1: ( rule__Role__Group_2__0__Impl rule__Role__Group_2__1 )
            // InternalSecurityDsl.g:2682:2: rule__Role__Group_2__0__Impl rule__Role__Group_2__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalSecurityDsl.g:2689:1: rule__Role__Group_2__0__Impl : ( 'attributes:' ) ;
    public final void rule__Role__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2693:1: ( ( 'attributes:' ) )
            // InternalSecurityDsl.g:2694:1: ( 'attributes:' )
            {
            // InternalSecurityDsl.g:2694:1: ( 'attributes:' )
            // InternalSecurityDsl.g:2695:2: 'attributes:'
            {
             before(grammarAccess.getRoleAccess().getAttributesKeyword_2_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2704:1: rule__Role__Group_2__1 : rule__Role__Group_2__1__Impl rule__Role__Group_2__2 ;
    public final void rule__Role__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2708:1: ( rule__Role__Group_2__1__Impl rule__Role__Group_2__2 )
            // InternalSecurityDsl.g:2709:2: rule__Role__Group_2__1__Impl rule__Role__Group_2__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalSecurityDsl.g:2716:1: rule__Role__Group_2__1__Impl : ( '[' ) ;
    public final void rule__Role__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2720:1: ( ( '[' ) )
            // InternalSecurityDsl.g:2721:1: ( '[' )
            {
            // InternalSecurityDsl.g:2721:1: ( '[' )
            // InternalSecurityDsl.g:2722:2: '['
            {
             before(grammarAccess.getRoleAccess().getLeftSquareBracketKeyword_2_1()); 
            match(input,65,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2731:1: rule__Role__Group_2__2 : rule__Role__Group_2__2__Impl rule__Role__Group_2__3 ;
    public final void rule__Role__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2735:1: ( rule__Role__Group_2__2__Impl rule__Role__Group_2__3 )
            // InternalSecurityDsl.g:2736:2: rule__Role__Group_2__2__Impl rule__Role__Group_2__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalSecurityDsl.g:2743:1: rule__Role__Group_2__2__Impl : ( ( rule__Role__Entity_attributesAssignment_2_2 ) ) ;
    public final void rule__Role__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2747:1: ( ( ( rule__Role__Entity_attributesAssignment_2_2 ) ) )
            // InternalSecurityDsl.g:2748:1: ( ( rule__Role__Entity_attributesAssignment_2_2 ) )
            {
            // InternalSecurityDsl.g:2748:1: ( ( rule__Role__Entity_attributesAssignment_2_2 ) )
            // InternalSecurityDsl.g:2749:2: ( rule__Role__Entity_attributesAssignment_2_2 )
            {
             before(grammarAccess.getRoleAccess().getEntity_attributesAssignment_2_2()); 
            // InternalSecurityDsl.g:2750:2: ( rule__Role__Entity_attributesAssignment_2_2 )
            // InternalSecurityDsl.g:2750:3: rule__Role__Entity_attributesAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Role__Entity_attributesAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getEntity_attributesAssignment_2_2()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:2758:1: rule__Role__Group_2__3 : rule__Role__Group_2__3__Impl rule__Role__Group_2__4 ;
    public final void rule__Role__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2762:1: ( rule__Role__Group_2__3__Impl rule__Role__Group_2__4 )
            // InternalSecurityDsl.g:2763:2: rule__Role__Group_2__3__Impl rule__Role__Group_2__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalSecurityDsl.g:2770:1: rule__Role__Group_2__3__Impl : ( ( rule__Role__Group_2_3__0 )* ) ;
    public final void rule__Role__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2774:1: ( ( ( rule__Role__Group_2_3__0 )* ) )
            // InternalSecurityDsl.g:2775:1: ( ( rule__Role__Group_2_3__0 )* )
            {
            // InternalSecurityDsl.g:2775:1: ( ( rule__Role__Group_2_3__0 )* )
            // InternalSecurityDsl.g:2776:2: ( rule__Role__Group_2_3__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_2_3()); 
            // InternalSecurityDsl.g:2777:2: ( rule__Role__Group_2_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==67) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalSecurityDsl.g:2777:3: rule__Role__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Role__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalSecurityDsl.g:2785:1: rule__Role__Group_2__4 : rule__Role__Group_2__4__Impl ;
    public final void rule__Role__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2789:1: ( rule__Role__Group_2__4__Impl )
            // InternalSecurityDsl.g:2790:2: rule__Role__Group_2__4__Impl
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
    // InternalSecurityDsl.g:2796:1: rule__Role__Group_2__4__Impl : ( ']' ) ;
    public final void rule__Role__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2800:1: ( ( ']' ) )
            // InternalSecurityDsl.g:2801:1: ( ']' )
            {
            // InternalSecurityDsl.g:2801:1: ( ']' )
            // InternalSecurityDsl.g:2802:2: ']'
            {
             before(grammarAccess.getRoleAccess().getRightSquareBracketKeyword_2_4()); 
            match(input,66,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2812:1: rule__Role__Group_2_3__0 : rule__Role__Group_2_3__0__Impl rule__Role__Group_2_3__1 ;
    public final void rule__Role__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2816:1: ( rule__Role__Group_2_3__0__Impl rule__Role__Group_2_3__1 )
            // InternalSecurityDsl.g:2817:2: rule__Role__Group_2_3__0__Impl rule__Role__Group_2_3__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalSecurityDsl.g:2824:1: rule__Role__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__Role__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2828:1: ( ( ',' ) )
            // InternalSecurityDsl.g:2829:1: ( ',' )
            {
            // InternalSecurityDsl.g:2829:1: ( ',' )
            // InternalSecurityDsl.g:2830:2: ','
            {
             before(grammarAccess.getRoleAccess().getCommaKeyword_2_3_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2839:1: rule__Role__Group_2_3__1 : rule__Role__Group_2_3__1__Impl ;
    public final void rule__Role__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2843:1: ( rule__Role__Group_2_3__1__Impl )
            // InternalSecurityDsl.g:2844:2: rule__Role__Group_2_3__1__Impl
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
    // InternalSecurityDsl.g:2850:1: rule__Role__Group_2_3__1__Impl : ( ( rule__Role__Entity_attributesAssignment_2_3_1 ) ) ;
    public final void rule__Role__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2854:1: ( ( ( rule__Role__Entity_attributesAssignment_2_3_1 ) ) )
            // InternalSecurityDsl.g:2855:1: ( ( rule__Role__Entity_attributesAssignment_2_3_1 ) )
            {
            // InternalSecurityDsl.g:2855:1: ( ( rule__Role__Entity_attributesAssignment_2_3_1 ) )
            // InternalSecurityDsl.g:2856:2: ( rule__Role__Entity_attributesAssignment_2_3_1 )
            {
             before(grammarAccess.getRoleAccess().getEntity_attributesAssignment_2_3_1()); 
            // InternalSecurityDsl.g:2857:2: ( rule__Role__Entity_attributesAssignment_2_3_1 )
            // InternalSecurityDsl.g:2857:3: rule__Role__Entity_attributesAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Role__Entity_attributesAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getEntity_attributesAssignment_2_3_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:2866:1: rule__Role__Group_3__0 : rule__Role__Group_3__0__Impl rule__Role__Group_3__1 ;
    public final void rule__Role__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2870:1: ( rule__Role__Group_3__0__Impl rule__Role__Group_3__1 )
            // InternalSecurityDsl.g:2871:2: rule__Role__Group_3__0__Impl rule__Role__Group_3__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalSecurityDsl.g:2878:1: rule__Role__Group_3__0__Impl : ( 'roles:' ) ;
    public final void rule__Role__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2882:1: ( ( 'roles:' ) )
            // InternalSecurityDsl.g:2883:1: ( 'roles:' )
            {
            // InternalSecurityDsl.g:2883:1: ( 'roles:' )
            // InternalSecurityDsl.g:2884:2: 'roles:'
            {
             before(grammarAccess.getRoleAccess().getRolesKeyword_3_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2893:1: rule__Role__Group_3__1 : rule__Role__Group_3__1__Impl rule__Role__Group_3__2 ;
    public final void rule__Role__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2897:1: ( rule__Role__Group_3__1__Impl rule__Role__Group_3__2 )
            // InternalSecurityDsl.g:2898:2: rule__Role__Group_3__1__Impl rule__Role__Group_3__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalSecurityDsl.g:2905:1: rule__Role__Group_3__1__Impl : ( '[' ) ;
    public final void rule__Role__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2909:1: ( ( '[' ) )
            // InternalSecurityDsl.g:2910:1: ( '[' )
            {
            // InternalSecurityDsl.g:2910:1: ( '[' )
            // InternalSecurityDsl.g:2911:2: '['
            {
             before(grammarAccess.getRoleAccess().getLeftSquareBracketKeyword_3_1()); 
            match(input,65,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2920:1: rule__Role__Group_3__2 : rule__Role__Group_3__2__Impl rule__Role__Group_3__3 ;
    public final void rule__Role__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2924:1: ( rule__Role__Group_3__2__Impl rule__Role__Group_3__3 )
            // InternalSecurityDsl.g:2925:2: rule__Role__Group_3__2__Impl rule__Role__Group_3__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalSecurityDsl.g:2932:1: rule__Role__Group_3__2__Impl : ( ( rule__Role__Role_instancesAssignment_3_2 ) ) ;
    public final void rule__Role__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2936:1: ( ( ( rule__Role__Role_instancesAssignment_3_2 ) ) )
            // InternalSecurityDsl.g:2937:1: ( ( rule__Role__Role_instancesAssignment_3_2 ) )
            {
            // InternalSecurityDsl.g:2937:1: ( ( rule__Role__Role_instancesAssignment_3_2 ) )
            // InternalSecurityDsl.g:2938:2: ( rule__Role__Role_instancesAssignment_3_2 )
            {
             before(grammarAccess.getRoleAccess().getRole_instancesAssignment_3_2()); 
            // InternalSecurityDsl.g:2939:2: ( rule__Role__Role_instancesAssignment_3_2 )
            // InternalSecurityDsl.g:2939:3: rule__Role__Role_instancesAssignment_3_2
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
    // InternalSecurityDsl.g:2947:1: rule__Role__Group_3__3 : rule__Role__Group_3__3__Impl rule__Role__Group_3__4 ;
    public final void rule__Role__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2951:1: ( rule__Role__Group_3__3__Impl rule__Role__Group_3__4 )
            // InternalSecurityDsl.g:2952:2: rule__Role__Group_3__3__Impl rule__Role__Group_3__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalSecurityDsl.g:2959:1: rule__Role__Group_3__3__Impl : ( ( rule__Role__Group_3_3__0 )* ) ;
    public final void rule__Role__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2963:1: ( ( ( rule__Role__Group_3_3__0 )* ) )
            // InternalSecurityDsl.g:2964:1: ( ( rule__Role__Group_3_3__0 )* )
            {
            // InternalSecurityDsl.g:2964:1: ( ( rule__Role__Group_3_3__0 )* )
            // InternalSecurityDsl.g:2965:2: ( rule__Role__Group_3_3__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_3_3()); 
            // InternalSecurityDsl.g:2966:2: ( rule__Role__Group_3_3__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==67) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSecurityDsl.g:2966:3: rule__Role__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Role__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalSecurityDsl.g:2974:1: rule__Role__Group_3__4 : rule__Role__Group_3__4__Impl ;
    public final void rule__Role__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2978:1: ( rule__Role__Group_3__4__Impl )
            // InternalSecurityDsl.g:2979:2: rule__Role__Group_3__4__Impl
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
    // InternalSecurityDsl.g:2985:1: rule__Role__Group_3__4__Impl : ( ']' ) ;
    public final void rule__Role__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2989:1: ( ( ']' ) )
            // InternalSecurityDsl.g:2990:1: ( ']' )
            {
            // InternalSecurityDsl.g:2990:1: ( ']' )
            // InternalSecurityDsl.g:2991:2: ']'
            {
             before(grammarAccess.getRoleAccess().getRightSquareBracketKeyword_3_4()); 
            match(input,66,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3001:1: rule__Role__Group_3_3__0 : rule__Role__Group_3_3__0__Impl rule__Role__Group_3_3__1 ;
    public final void rule__Role__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3005:1: ( rule__Role__Group_3_3__0__Impl rule__Role__Group_3_3__1 )
            // InternalSecurityDsl.g:3006:2: rule__Role__Group_3_3__0__Impl rule__Role__Group_3_3__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalSecurityDsl.g:3013:1: rule__Role__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Role__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3017:1: ( ( ',' ) )
            // InternalSecurityDsl.g:3018:1: ( ',' )
            {
            // InternalSecurityDsl.g:3018:1: ( ',' )
            // InternalSecurityDsl.g:3019:2: ','
            {
             before(grammarAccess.getRoleAccess().getCommaKeyword_3_3_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3028:1: rule__Role__Group_3_3__1 : rule__Role__Group_3_3__1__Impl ;
    public final void rule__Role__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3032:1: ( rule__Role__Group_3_3__1__Impl )
            // InternalSecurityDsl.g:3033:2: rule__Role__Group_3_3__1__Impl
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
    // InternalSecurityDsl.g:3039:1: rule__Role__Group_3_3__1__Impl : ( ( rule__Role__Role_instancesAssignment_3_3_1 ) ) ;
    public final void rule__Role__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3043:1: ( ( ( rule__Role__Role_instancesAssignment_3_3_1 ) ) )
            // InternalSecurityDsl.g:3044:1: ( ( rule__Role__Role_instancesAssignment_3_3_1 ) )
            {
            // InternalSecurityDsl.g:3044:1: ( ( rule__Role__Role_instancesAssignment_3_3_1 ) )
            // InternalSecurityDsl.g:3045:2: ( rule__Role__Role_instancesAssignment_3_3_1 )
            {
             before(grammarAccess.getRoleAccess().getRole_instancesAssignment_3_3_1()); 
            // InternalSecurityDsl.g:3046:2: ( rule__Role__Role_instancesAssignment_3_3_1 )
            // InternalSecurityDsl.g:3046:3: rule__Role__Role_instancesAssignment_3_3_1
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
    // InternalSecurityDsl.g:3055:1: rule__User__Group__0 : rule__User__Group__0__Impl rule__User__Group__1 ;
    public final void rule__User__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3059:1: ( rule__User__Group__0__Impl rule__User__Group__1 )
            // InternalSecurityDsl.g:3060:2: rule__User__Group__0__Impl rule__User__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSecurityDsl.g:3067:1: rule__User__Group__0__Impl : ( () ) ;
    public final void rule__User__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3071:1: ( ( () ) )
            // InternalSecurityDsl.g:3072:1: ( () )
            {
            // InternalSecurityDsl.g:3072:1: ( () )
            // InternalSecurityDsl.g:3073:2: ()
            {
             before(grammarAccess.getUserAccess().getUserAction_0()); 
            // InternalSecurityDsl.g:3074:2: ()
            // InternalSecurityDsl.g:3074:3: 
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
    // InternalSecurityDsl.g:3082:1: rule__User__Group__1 : rule__User__Group__1__Impl rule__User__Group__2 ;
    public final void rule__User__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3086:1: ( rule__User__Group__1__Impl rule__User__Group__2 )
            // InternalSecurityDsl.g:3087:2: rule__User__Group__1__Impl rule__User__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalSecurityDsl.g:3094:1: rule__User__Group__1__Impl : ( ( rule__User__Group_1__0 )? ) ;
    public final void rule__User__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3098:1: ( ( ( rule__User__Group_1__0 )? ) )
            // InternalSecurityDsl.g:3099:1: ( ( rule__User__Group_1__0 )? )
            {
            // InternalSecurityDsl.g:3099:1: ( ( rule__User__Group_1__0 )? )
            // InternalSecurityDsl.g:3100:2: ( rule__User__Group_1__0 )?
            {
             before(grammarAccess.getUserAccess().getGroup_1()); 
            // InternalSecurityDsl.g:3101:2: ( rule__User__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==63) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSecurityDsl.g:3101:3: rule__User__Group_1__0
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
    // InternalSecurityDsl.g:3109:1: rule__User__Group__2 : rule__User__Group__2__Impl ;
    public final void rule__User__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3113:1: ( rule__User__Group__2__Impl )
            // InternalSecurityDsl.g:3114:2: rule__User__Group__2__Impl
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
    // InternalSecurityDsl.g:3120:1: rule__User__Group__2__Impl : ( ( rule__User__Group_2__0 )? ) ;
    public final void rule__User__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3124:1: ( ( ( rule__User__Group_2__0 )? ) )
            // InternalSecurityDsl.g:3125:1: ( ( rule__User__Group_2__0 )? )
            {
            // InternalSecurityDsl.g:3125:1: ( ( rule__User__Group_2__0 )? )
            // InternalSecurityDsl.g:3126:2: ( rule__User__Group_2__0 )?
            {
             before(grammarAccess.getUserAccess().getGroup_2()); 
            // InternalSecurityDsl.g:3127:2: ( rule__User__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==64) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSecurityDsl.g:3127:3: rule__User__Group_2__0
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
    // InternalSecurityDsl.g:3136:1: rule__User__Group_1__0 : rule__User__Group_1__0__Impl rule__User__Group_1__1 ;
    public final void rule__User__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3140:1: ( rule__User__Group_1__0__Impl rule__User__Group_1__1 )
            // InternalSecurityDsl.g:3141:2: rule__User__Group_1__0__Impl rule__User__Group_1__1
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
    // InternalSecurityDsl.g:3148:1: rule__User__Group_1__0__Impl : ( 'tableName:' ) ;
    public final void rule__User__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3152:1: ( ( 'tableName:' ) )
            // InternalSecurityDsl.g:3153:1: ( 'tableName:' )
            {
            // InternalSecurityDsl.g:3153:1: ( 'tableName:' )
            // InternalSecurityDsl.g:3154:2: 'tableName:'
            {
             before(grammarAccess.getUserAccess().getTableNameKeyword_1_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3163:1: rule__User__Group_1__1 : rule__User__Group_1__1__Impl ;
    public final void rule__User__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3167:1: ( rule__User__Group_1__1__Impl )
            // InternalSecurityDsl.g:3168:2: rule__User__Group_1__1__Impl
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
    // InternalSecurityDsl.g:3174:1: rule__User__Group_1__1__Impl : ( ( rule__User__TableNameAssignment_1_1 ) ) ;
    public final void rule__User__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3178:1: ( ( ( rule__User__TableNameAssignment_1_1 ) ) )
            // InternalSecurityDsl.g:3179:1: ( ( rule__User__TableNameAssignment_1_1 ) )
            {
            // InternalSecurityDsl.g:3179:1: ( ( rule__User__TableNameAssignment_1_1 ) )
            // InternalSecurityDsl.g:3180:2: ( rule__User__TableNameAssignment_1_1 )
            {
             before(grammarAccess.getUserAccess().getTableNameAssignment_1_1()); 
            // InternalSecurityDsl.g:3181:2: ( rule__User__TableNameAssignment_1_1 )
            // InternalSecurityDsl.g:3181:3: rule__User__TableNameAssignment_1_1
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
    // InternalSecurityDsl.g:3190:1: rule__User__Group_2__0 : rule__User__Group_2__0__Impl rule__User__Group_2__1 ;
    public final void rule__User__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3194:1: ( rule__User__Group_2__0__Impl rule__User__Group_2__1 )
            // InternalSecurityDsl.g:3195:2: rule__User__Group_2__0__Impl rule__User__Group_2__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalSecurityDsl.g:3202:1: rule__User__Group_2__0__Impl : ( 'attributes:' ) ;
    public final void rule__User__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3206:1: ( ( 'attributes:' ) )
            // InternalSecurityDsl.g:3207:1: ( 'attributes:' )
            {
            // InternalSecurityDsl.g:3207:1: ( 'attributes:' )
            // InternalSecurityDsl.g:3208:2: 'attributes:'
            {
             before(grammarAccess.getUserAccess().getAttributesKeyword_2_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3217:1: rule__User__Group_2__1 : rule__User__Group_2__1__Impl rule__User__Group_2__2 ;
    public final void rule__User__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3221:1: ( rule__User__Group_2__1__Impl rule__User__Group_2__2 )
            // InternalSecurityDsl.g:3222:2: rule__User__Group_2__1__Impl rule__User__Group_2__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalSecurityDsl.g:3229:1: rule__User__Group_2__1__Impl : ( '[' ) ;
    public final void rule__User__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3233:1: ( ( '[' ) )
            // InternalSecurityDsl.g:3234:1: ( '[' )
            {
            // InternalSecurityDsl.g:3234:1: ( '[' )
            // InternalSecurityDsl.g:3235:2: '['
            {
             before(grammarAccess.getUserAccess().getLeftSquareBracketKeyword_2_1()); 
            match(input,65,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3244:1: rule__User__Group_2__2 : rule__User__Group_2__2__Impl rule__User__Group_2__3 ;
    public final void rule__User__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3248:1: ( rule__User__Group_2__2__Impl rule__User__Group_2__3 )
            // InternalSecurityDsl.g:3249:2: rule__User__Group_2__2__Impl rule__User__Group_2__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalSecurityDsl.g:3256:1: rule__User__Group_2__2__Impl : ( ( rule__User__Entity_attributesAssignment_2_2 ) ) ;
    public final void rule__User__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3260:1: ( ( ( rule__User__Entity_attributesAssignment_2_2 ) ) )
            // InternalSecurityDsl.g:3261:1: ( ( rule__User__Entity_attributesAssignment_2_2 ) )
            {
            // InternalSecurityDsl.g:3261:1: ( ( rule__User__Entity_attributesAssignment_2_2 ) )
            // InternalSecurityDsl.g:3262:2: ( rule__User__Entity_attributesAssignment_2_2 )
            {
             before(grammarAccess.getUserAccess().getEntity_attributesAssignment_2_2()); 
            // InternalSecurityDsl.g:3263:2: ( rule__User__Entity_attributesAssignment_2_2 )
            // InternalSecurityDsl.g:3263:3: rule__User__Entity_attributesAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__User__Entity_attributesAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getEntity_attributesAssignment_2_2()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3271:1: rule__User__Group_2__3 : rule__User__Group_2__3__Impl rule__User__Group_2__4 ;
    public final void rule__User__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3275:1: ( rule__User__Group_2__3__Impl rule__User__Group_2__4 )
            // InternalSecurityDsl.g:3276:2: rule__User__Group_2__3__Impl rule__User__Group_2__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalSecurityDsl.g:3283:1: rule__User__Group_2__3__Impl : ( ( rule__User__Group_2_3__0 )* ) ;
    public final void rule__User__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3287:1: ( ( ( rule__User__Group_2_3__0 )* ) )
            // InternalSecurityDsl.g:3288:1: ( ( rule__User__Group_2_3__0 )* )
            {
            // InternalSecurityDsl.g:3288:1: ( ( rule__User__Group_2_3__0 )* )
            // InternalSecurityDsl.g:3289:2: ( rule__User__Group_2_3__0 )*
            {
             before(grammarAccess.getUserAccess().getGroup_2_3()); 
            // InternalSecurityDsl.g:3290:2: ( rule__User__Group_2_3__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==67) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalSecurityDsl.g:3290:3: rule__User__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__User__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalSecurityDsl.g:3298:1: rule__User__Group_2__4 : rule__User__Group_2__4__Impl ;
    public final void rule__User__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3302:1: ( rule__User__Group_2__4__Impl )
            // InternalSecurityDsl.g:3303:2: rule__User__Group_2__4__Impl
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
    // InternalSecurityDsl.g:3309:1: rule__User__Group_2__4__Impl : ( ']' ) ;
    public final void rule__User__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3313:1: ( ( ']' ) )
            // InternalSecurityDsl.g:3314:1: ( ']' )
            {
            // InternalSecurityDsl.g:3314:1: ( ']' )
            // InternalSecurityDsl.g:3315:2: ']'
            {
             before(grammarAccess.getUserAccess().getRightSquareBracketKeyword_2_4()); 
            match(input,66,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3325:1: rule__User__Group_2_3__0 : rule__User__Group_2_3__0__Impl rule__User__Group_2_3__1 ;
    public final void rule__User__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3329:1: ( rule__User__Group_2_3__0__Impl rule__User__Group_2_3__1 )
            // InternalSecurityDsl.g:3330:2: rule__User__Group_2_3__0__Impl rule__User__Group_2_3__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalSecurityDsl.g:3337:1: rule__User__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__User__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3341:1: ( ( ',' ) )
            // InternalSecurityDsl.g:3342:1: ( ',' )
            {
            // InternalSecurityDsl.g:3342:1: ( ',' )
            // InternalSecurityDsl.g:3343:2: ','
            {
             before(grammarAccess.getUserAccess().getCommaKeyword_2_3_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3352:1: rule__User__Group_2_3__1 : rule__User__Group_2_3__1__Impl ;
    public final void rule__User__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3356:1: ( rule__User__Group_2_3__1__Impl )
            // InternalSecurityDsl.g:3357:2: rule__User__Group_2_3__1__Impl
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
    // InternalSecurityDsl.g:3363:1: rule__User__Group_2_3__1__Impl : ( ( rule__User__Entity_attributesAssignment_2_3_1 ) ) ;
    public final void rule__User__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3367:1: ( ( ( rule__User__Entity_attributesAssignment_2_3_1 ) ) )
            // InternalSecurityDsl.g:3368:1: ( ( rule__User__Entity_attributesAssignment_2_3_1 ) )
            {
            // InternalSecurityDsl.g:3368:1: ( ( rule__User__Entity_attributesAssignment_2_3_1 ) )
            // InternalSecurityDsl.g:3369:2: ( rule__User__Entity_attributesAssignment_2_3_1 )
            {
             before(grammarAccess.getUserAccess().getEntity_attributesAssignment_2_3_1()); 
            // InternalSecurityDsl.g:3370:2: ( rule__User__Entity_attributesAssignment_2_3_1 )
            // InternalSecurityDsl.g:3370:3: rule__User__Entity_attributesAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__User__Entity_attributesAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getEntity_attributesAssignment_2_3_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3379:1: rule__RoleInstance__Group__0 : rule__RoleInstance__Group__0__Impl rule__RoleInstance__Group__1 ;
    public final void rule__RoleInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3383:1: ( rule__RoleInstance__Group__0__Impl rule__RoleInstance__Group__1 )
            // InternalSecurityDsl.g:3384:2: rule__RoleInstance__Group__0__Impl rule__RoleInstance__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalSecurityDsl.g:3391:1: rule__RoleInstance__Group__0__Impl : ( () ) ;
    public final void rule__RoleInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3395:1: ( ( () ) )
            // InternalSecurityDsl.g:3396:1: ( () )
            {
            // InternalSecurityDsl.g:3396:1: ( () )
            // InternalSecurityDsl.g:3397:2: ()
            {
             before(grammarAccess.getRoleInstanceAccess().getRoleInstanceAction_0()); 
            // InternalSecurityDsl.g:3398:2: ()
            // InternalSecurityDsl.g:3398:3: 
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
    // InternalSecurityDsl.g:3406:1: rule__RoleInstance__Group__1 : rule__RoleInstance__Group__1__Impl rule__RoleInstance__Group__2 ;
    public final void rule__RoleInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3410:1: ( rule__RoleInstance__Group__1__Impl rule__RoleInstance__Group__2 )
            // InternalSecurityDsl.g:3411:2: rule__RoleInstance__Group__1__Impl rule__RoleInstance__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalSecurityDsl.g:3418:1: rule__RoleInstance__Group__1__Impl : ( ( rule__RoleInstance__ClientAssignment_1 )? ) ;
    public final void rule__RoleInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3422:1: ( ( ( rule__RoleInstance__ClientAssignment_1 )? ) )
            // InternalSecurityDsl.g:3423:1: ( ( rule__RoleInstance__ClientAssignment_1 )? )
            {
            // InternalSecurityDsl.g:3423:1: ( ( rule__RoleInstance__ClientAssignment_1 )? )
            // InternalSecurityDsl.g:3424:2: ( rule__RoleInstance__ClientAssignment_1 )?
            {
             before(grammarAccess.getRoleInstanceAccess().getClientAssignment_1()); 
            // InternalSecurityDsl.g:3425:2: ( rule__RoleInstance__ClientAssignment_1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==94) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSecurityDsl.g:3425:3: rule__RoleInstance__ClientAssignment_1
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
    // InternalSecurityDsl.g:3433:1: rule__RoleInstance__Group__2 : rule__RoleInstance__Group__2__Impl ;
    public final void rule__RoleInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3437:1: ( rule__RoleInstance__Group__2__Impl )
            // InternalSecurityDsl.g:3438:2: rule__RoleInstance__Group__2__Impl
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
    // InternalSecurityDsl.g:3444:1: rule__RoleInstance__Group__2__Impl : ( ( rule__RoleInstance__NameAssignment_2 ) ) ;
    public final void rule__RoleInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3448:1: ( ( ( rule__RoleInstance__NameAssignment_2 ) ) )
            // InternalSecurityDsl.g:3449:1: ( ( rule__RoleInstance__NameAssignment_2 ) )
            {
            // InternalSecurityDsl.g:3449:1: ( ( rule__RoleInstance__NameAssignment_2 ) )
            // InternalSecurityDsl.g:3450:2: ( rule__RoleInstance__NameAssignment_2 )
            {
             before(grammarAccess.getRoleInstanceAccess().getNameAssignment_2()); 
            // InternalSecurityDsl.g:3451:2: ( rule__RoleInstance__NameAssignment_2 )
            // InternalSecurityDsl.g:3451:3: rule__RoleInstance__NameAssignment_2
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
    // InternalSecurityDsl.g:3460:1: rule__Endpoint__Group__0 : rule__Endpoint__Group__0__Impl rule__Endpoint__Group__1 ;
    public final void rule__Endpoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3464:1: ( rule__Endpoint__Group__0__Impl rule__Endpoint__Group__1 )
            // InternalSecurityDsl.g:3465:2: rule__Endpoint__Group__0__Impl rule__Endpoint__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalSecurityDsl.g:3472:1: rule__Endpoint__Group__0__Impl : ( '{' ) ;
    public final void rule__Endpoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3476:1: ( ( '{' ) )
            // InternalSecurityDsl.g:3477:1: ( '{' )
            {
            // InternalSecurityDsl.g:3477:1: ( '{' )
            // InternalSecurityDsl.g:3478:2: '{'
            {
             before(grammarAccess.getEndpointAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3487:1: rule__Endpoint__Group__1 : rule__Endpoint__Group__1__Impl rule__Endpoint__Group__2 ;
    public final void rule__Endpoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3491:1: ( rule__Endpoint__Group__1__Impl rule__Endpoint__Group__2 )
            // InternalSecurityDsl.g:3492:2: rule__Endpoint__Group__1__Impl rule__Endpoint__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalSecurityDsl.g:3499:1: rule__Endpoint__Group__1__Impl : ( 'type:' ) ;
    public final void rule__Endpoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3503:1: ( ( 'type:' ) )
            // InternalSecurityDsl.g:3504:1: ( 'type:' )
            {
            // InternalSecurityDsl.g:3504:1: ( 'type:' )
            // InternalSecurityDsl.g:3505:2: 'type:'
            {
             before(grammarAccess.getEndpointAccess().getTypeKeyword_1()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getTypeKeyword_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3514:1: rule__Endpoint__Group__2 : rule__Endpoint__Group__2__Impl rule__Endpoint__Group__3 ;
    public final void rule__Endpoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3518:1: ( rule__Endpoint__Group__2__Impl rule__Endpoint__Group__3 )
            // InternalSecurityDsl.g:3519:2: rule__Endpoint__Group__2__Impl rule__Endpoint__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalSecurityDsl.g:3526:1: rule__Endpoint__Group__2__Impl : ( ( rule__Endpoint__TypeAssignment_2 ) ) ;
    public final void rule__Endpoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3530:1: ( ( ( rule__Endpoint__TypeAssignment_2 ) ) )
            // InternalSecurityDsl.g:3531:1: ( ( rule__Endpoint__TypeAssignment_2 ) )
            {
            // InternalSecurityDsl.g:3531:1: ( ( rule__Endpoint__TypeAssignment_2 ) )
            // InternalSecurityDsl.g:3532:2: ( rule__Endpoint__TypeAssignment_2 )
            {
             before(grammarAccess.getEndpointAccess().getTypeAssignment_2()); 
            // InternalSecurityDsl.g:3533:2: ( rule__Endpoint__TypeAssignment_2 )
            // InternalSecurityDsl.g:3533:3: rule__Endpoint__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEndpointAccess().getTypeAssignment_2()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3541:1: rule__Endpoint__Group__3 : rule__Endpoint__Group__3__Impl rule__Endpoint__Group__4 ;
    public final void rule__Endpoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3545:1: ( rule__Endpoint__Group__3__Impl rule__Endpoint__Group__4 )
            // InternalSecurityDsl.g:3546:2: rule__Endpoint__Group__3__Impl rule__Endpoint__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalSecurityDsl.g:3553:1: rule__Endpoint__Group__3__Impl : ( 'url:' ) ;
    public final void rule__Endpoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3557:1: ( ( 'url:' ) )
            // InternalSecurityDsl.g:3558:1: ( 'url:' )
            {
            // InternalSecurityDsl.g:3558:1: ( 'url:' )
            // InternalSecurityDsl.g:3559:2: 'url:'
            {
             before(grammarAccess.getEndpointAccess().getUrlKeyword_3()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getUrlKeyword_3()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3568:1: rule__Endpoint__Group__4 : rule__Endpoint__Group__4__Impl rule__Endpoint__Group__5 ;
    public final void rule__Endpoint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3572:1: ( rule__Endpoint__Group__4__Impl rule__Endpoint__Group__5 )
            // InternalSecurityDsl.g:3573:2: rule__Endpoint__Group__4__Impl rule__Endpoint__Group__5
            {
            pushFollow(FOLLOW_30);
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
    // InternalSecurityDsl.g:3580:1: rule__Endpoint__Group__4__Impl : ( ( rule__Endpoint__UrlAssignment_4 ) ) ;
    public final void rule__Endpoint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3584:1: ( ( ( rule__Endpoint__UrlAssignment_4 ) ) )
            // InternalSecurityDsl.g:3585:1: ( ( rule__Endpoint__UrlAssignment_4 ) )
            {
            // InternalSecurityDsl.g:3585:1: ( ( rule__Endpoint__UrlAssignment_4 ) )
            // InternalSecurityDsl.g:3586:2: ( rule__Endpoint__UrlAssignment_4 )
            {
             before(grammarAccess.getEndpointAccess().getUrlAssignment_4()); 
            // InternalSecurityDsl.g:3587:2: ( rule__Endpoint__UrlAssignment_4 )
            // InternalSecurityDsl.g:3587:3: rule__Endpoint__UrlAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__UrlAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEndpointAccess().getUrlAssignment_4()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3595:1: rule__Endpoint__Group__5 : rule__Endpoint__Group__5__Impl rule__Endpoint__Group__6 ;
    public final void rule__Endpoint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3599:1: ( rule__Endpoint__Group__5__Impl rule__Endpoint__Group__6 )
            // InternalSecurityDsl.g:3600:2: rule__Endpoint__Group__5__Impl rule__Endpoint__Group__6
            {
            pushFollow(FOLLOW_30);
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
    // InternalSecurityDsl.g:3607:1: rule__Endpoint__Group__5__Impl : ( ( rule__Endpoint__Group_5__0 )? ) ;
    public final void rule__Endpoint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3611:1: ( ( ( rule__Endpoint__Group_5__0 )? ) )
            // InternalSecurityDsl.g:3612:1: ( ( rule__Endpoint__Group_5__0 )? )
            {
            // InternalSecurityDsl.g:3612:1: ( ( rule__Endpoint__Group_5__0 )? )
            // InternalSecurityDsl.g:3613:2: ( rule__Endpoint__Group_5__0 )?
            {
             before(grammarAccess.getEndpointAccess().getGroup_5()); 
            // InternalSecurityDsl.g:3614:2: ( rule__Endpoint__Group_5__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==69) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSecurityDsl.g:3614:3: rule__Endpoint__Group_5__0
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
    // InternalSecurityDsl.g:3622:1: rule__Endpoint__Group__6 : rule__Endpoint__Group__6__Impl rule__Endpoint__Group__7 ;
    public final void rule__Endpoint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3626:1: ( rule__Endpoint__Group__6__Impl rule__Endpoint__Group__7 )
            // InternalSecurityDsl.g:3627:2: rule__Endpoint__Group__6__Impl rule__Endpoint__Group__7
            {
            pushFollow(FOLLOW_30);
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
    // InternalSecurityDsl.g:3634:1: rule__Endpoint__Group__6__Impl : ( ( rule__Endpoint__Group_6__0 )? ) ;
    public final void rule__Endpoint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3638:1: ( ( ( rule__Endpoint__Group_6__0 )? ) )
            // InternalSecurityDsl.g:3639:1: ( ( rule__Endpoint__Group_6__0 )? )
            {
            // InternalSecurityDsl.g:3639:1: ( ( rule__Endpoint__Group_6__0 )? )
            // InternalSecurityDsl.g:3640:2: ( rule__Endpoint__Group_6__0 )?
            {
             before(grammarAccess.getEndpointAccess().getGroup_6()); 
            // InternalSecurityDsl.g:3641:2: ( rule__Endpoint__Group_6__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==70) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSecurityDsl.g:3641:3: rule__Endpoint__Group_6__0
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
    // InternalSecurityDsl.g:3649:1: rule__Endpoint__Group__7 : rule__Endpoint__Group__7__Impl rule__Endpoint__Group__8 ;
    public final void rule__Endpoint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3653:1: ( rule__Endpoint__Group__7__Impl rule__Endpoint__Group__8 )
            // InternalSecurityDsl.g:3654:2: rule__Endpoint__Group__7__Impl rule__Endpoint__Group__8
            {
            pushFollow(FOLLOW_30);
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
    // InternalSecurityDsl.g:3661:1: rule__Endpoint__Group__7__Impl : ( ( rule__Endpoint__Group_7__0 )? ) ;
    public final void rule__Endpoint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3665:1: ( ( ( rule__Endpoint__Group_7__0 )? ) )
            // InternalSecurityDsl.g:3666:1: ( ( rule__Endpoint__Group_7__0 )? )
            {
            // InternalSecurityDsl.g:3666:1: ( ( rule__Endpoint__Group_7__0 )? )
            // InternalSecurityDsl.g:3667:2: ( rule__Endpoint__Group_7__0 )?
            {
             before(grammarAccess.getEndpointAccess().getGroup_7()); 
            // InternalSecurityDsl.g:3668:2: ( rule__Endpoint__Group_7__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==71) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSecurityDsl.g:3668:3: rule__Endpoint__Group_7__0
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
    // InternalSecurityDsl.g:3676:1: rule__Endpoint__Group__8 : rule__Endpoint__Group__8__Impl ;
    public final void rule__Endpoint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3680:1: ( rule__Endpoint__Group__8__Impl )
            // InternalSecurityDsl.g:3681:2: rule__Endpoint__Group__8__Impl
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
    // InternalSecurityDsl.g:3687:1: rule__Endpoint__Group__8__Impl : ( '}' ) ;
    public final void rule__Endpoint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3691:1: ( ( '}' ) )
            // InternalSecurityDsl.g:3692:1: ( '}' )
            {
            // InternalSecurityDsl.g:3692:1: ( '}' )
            // InternalSecurityDsl.g:3693:2: '}'
            {
             before(grammarAccess.getEndpointAccess().getRightCurlyBracketKeyword_8()); 
            match(input,61,FOLLOW_2); 
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


    // $ANTLR start "rule__Endpoint__Group_5__0"
    // InternalSecurityDsl.g:3703:1: rule__Endpoint__Group_5__0 : rule__Endpoint__Group_5__0__Impl rule__Endpoint__Group_5__1 ;
    public final void rule__Endpoint__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3707:1: ( rule__Endpoint__Group_5__0__Impl rule__Endpoint__Group_5__1 )
            // InternalSecurityDsl.g:3708:2: rule__Endpoint__Group_5__0__Impl rule__Endpoint__Group_5__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSecurityDsl.g:3715:1: rule__Endpoint__Group_5__0__Impl : ( 'methodName:' ) ;
    public final void rule__Endpoint__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3719:1: ( ( 'methodName:' ) )
            // InternalSecurityDsl.g:3720:1: ( 'methodName:' )
            {
            // InternalSecurityDsl.g:3720:1: ( 'methodName:' )
            // InternalSecurityDsl.g:3721:2: 'methodName:'
            {
             before(grammarAccess.getEndpointAccess().getMethodNameKeyword_5_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getMethodNameKeyword_5_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3730:1: rule__Endpoint__Group_5__1 : rule__Endpoint__Group_5__1__Impl ;
    public final void rule__Endpoint__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3734:1: ( rule__Endpoint__Group_5__1__Impl )
            // InternalSecurityDsl.g:3735:2: rule__Endpoint__Group_5__1__Impl
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
    // InternalSecurityDsl.g:3741:1: rule__Endpoint__Group_5__1__Impl : ( ( rule__Endpoint__MethodNameAssignment_5_1 ) ) ;
    public final void rule__Endpoint__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3745:1: ( ( ( rule__Endpoint__MethodNameAssignment_5_1 ) ) )
            // InternalSecurityDsl.g:3746:1: ( ( rule__Endpoint__MethodNameAssignment_5_1 ) )
            {
            // InternalSecurityDsl.g:3746:1: ( ( rule__Endpoint__MethodNameAssignment_5_1 ) )
            // InternalSecurityDsl.g:3747:2: ( rule__Endpoint__MethodNameAssignment_5_1 )
            {
             before(grammarAccess.getEndpointAccess().getMethodNameAssignment_5_1()); 
            // InternalSecurityDsl.g:3748:2: ( rule__Endpoint__MethodNameAssignment_5_1 )
            // InternalSecurityDsl.g:3748:3: rule__Endpoint__MethodNameAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__MethodNameAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEndpointAccess().getMethodNameAssignment_5_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3757:1: rule__Endpoint__Group_6__0 : rule__Endpoint__Group_6__0__Impl rule__Endpoint__Group_6__1 ;
    public final void rule__Endpoint__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3761:1: ( rule__Endpoint__Group_6__0__Impl rule__Endpoint__Group_6__1 )
            // InternalSecurityDsl.g:3762:2: rule__Endpoint__Group_6__0__Impl rule__Endpoint__Group_6__1
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
    // InternalSecurityDsl.g:3769:1: rule__Endpoint__Group_6__0__Impl : ( 'method:' ) ;
    public final void rule__Endpoint__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3773:1: ( ( 'method:' ) )
            // InternalSecurityDsl.g:3774:1: ( 'method:' )
            {
            // InternalSecurityDsl.g:3774:1: ( 'method:' )
            // InternalSecurityDsl.g:3775:2: 'method:'
            {
             before(grammarAccess.getEndpointAccess().getMethodKeyword_6_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getMethodKeyword_6_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3784:1: rule__Endpoint__Group_6__1 : rule__Endpoint__Group_6__1__Impl ;
    public final void rule__Endpoint__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3788:1: ( rule__Endpoint__Group_6__1__Impl )
            // InternalSecurityDsl.g:3789:2: rule__Endpoint__Group_6__1__Impl
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
    // InternalSecurityDsl.g:3795:1: rule__Endpoint__Group_6__1__Impl : ( ( rule__Endpoint__MethodAssignment_6_1 ) ) ;
    public final void rule__Endpoint__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3799:1: ( ( ( rule__Endpoint__MethodAssignment_6_1 ) ) )
            // InternalSecurityDsl.g:3800:1: ( ( rule__Endpoint__MethodAssignment_6_1 ) )
            {
            // InternalSecurityDsl.g:3800:1: ( ( rule__Endpoint__MethodAssignment_6_1 ) )
            // InternalSecurityDsl.g:3801:2: ( rule__Endpoint__MethodAssignment_6_1 )
            {
             before(grammarAccess.getEndpointAccess().getMethodAssignment_6_1()); 
            // InternalSecurityDsl.g:3802:2: ( rule__Endpoint__MethodAssignment_6_1 )
            // InternalSecurityDsl.g:3802:3: rule__Endpoint__MethodAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__MethodAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getEndpointAccess().getMethodAssignment_6_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3811:1: rule__Endpoint__Group_7__0 : rule__Endpoint__Group_7__0__Impl rule__Endpoint__Group_7__1 ;
    public final void rule__Endpoint__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3815:1: ( rule__Endpoint__Group_7__0__Impl rule__Endpoint__Group_7__1 )
            // InternalSecurityDsl.g:3816:2: rule__Endpoint__Group_7__0__Impl rule__Endpoint__Group_7__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalSecurityDsl.g:3823:1: rule__Endpoint__Group_7__0__Impl : ( 'roleAuthorities:' ) ;
    public final void rule__Endpoint__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3827:1: ( ( 'roleAuthorities:' ) )
            // InternalSecurityDsl.g:3828:1: ( 'roleAuthorities:' )
            {
            // InternalSecurityDsl.g:3828:1: ( 'roleAuthorities:' )
            // InternalSecurityDsl.g:3829:2: 'roleAuthorities:'
            {
             before(grammarAccess.getEndpointAccess().getRoleAuthoritiesKeyword_7_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getRoleAuthoritiesKeyword_7_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3838:1: rule__Endpoint__Group_7__1 : rule__Endpoint__Group_7__1__Impl rule__Endpoint__Group_7__2 ;
    public final void rule__Endpoint__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3842:1: ( rule__Endpoint__Group_7__1__Impl rule__Endpoint__Group_7__2 )
            // InternalSecurityDsl.g:3843:2: rule__Endpoint__Group_7__1__Impl rule__Endpoint__Group_7__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSecurityDsl.g:3850:1: rule__Endpoint__Group_7__1__Impl : ( '[' ) ;
    public final void rule__Endpoint__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3854:1: ( ( '[' ) )
            // InternalSecurityDsl.g:3855:1: ( '[' )
            {
            // InternalSecurityDsl.g:3855:1: ( '[' )
            // InternalSecurityDsl.g:3856:2: '['
            {
             before(grammarAccess.getEndpointAccess().getLeftSquareBracketKeyword_7_1()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getLeftSquareBracketKeyword_7_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3865:1: rule__Endpoint__Group_7__2 : rule__Endpoint__Group_7__2__Impl rule__Endpoint__Group_7__3 ;
    public final void rule__Endpoint__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3869:1: ( rule__Endpoint__Group_7__2__Impl rule__Endpoint__Group_7__3 )
            // InternalSecurityDsl.g:3870:2: rule__Endpoint__Group_7__2__Impl rule__Endpoint__Group_7__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalSecurityDsl.g:3877:1: rule__Endpoint__Group_7__2__Impl : ( ( rule__Endpoint__Role_authoritiesAssignment_7_2 ) ) ;
    public final void rule__Endpoint__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3881:1: ( ( ( rule__Endpoint__Role_authoritiesAssignment_7_2 ) ) )
            // InternalSecurityDsl.g:3882:1: ( ( rule__Endpoint__Role_authoritiesAssignment_7_2 ) )
            {
            // InternalSecurityDsl.g:3882:1: ( ( rule__Endpoint__Role_authoritiesAssignment_7_2 ) )
            // InternalSecurityDsl.g:3883:2: ( rule__Endpoint__Role_authoritiesAssignment_7_2 )
            {
             before(grammarAccess.getEndpointAccess().getRole_authoritiesAssignment_7_2()); 
            // InternalSecurityDsl.g:3884:2: ( rule__Endpoint__Role_authoritiesAssignment_7_2 )
            // InternalSecurityDsl.g:3884:3: rule__Endpoint__Role_authoritiesAssignment_7_2
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
    // InternalSecurityDsl.g:3892:1: rule__Endpoint__Group_7__3 : rule__Endpoint__Group_7__3__Impl rule__Endpoint__Group_7__4 ;
    public final void rule__Endpoint__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3896:1: ( rule__Endpoint__Group_7__3__Impl rule__Endpoint__Group_7__4 )
            // InternalSecurityDsl.g:3897:2: rule__Endpoint__Group_7__3__Impl rule__Endpoint__Group_7__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalSecurityDsl.g:3904:1: rule__Endpoint__Group_7__3__Impl : ( ( rule__Endpoint__Group_7_3__0 )* ) ;
    public final void rule__Endpoint__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3908:1: ( ( ( rule__Endpoint__Group_7_3__0 )* ) )
            // InternalSecurityDsl.g:3909:1: ( ( rule__Endpoint__Group_7_3__0 )* )
            {
            // InternalSecurityDsl.g:3909:1: ( ( rule__Endpoint__Group_7_3__0 )* )
            // InternalSecurityDsl.g:3910:2: ( rule__Endpoint__Group_7_3__0 )*
            {
             before(grammarAccess.getEndpointAccess().getGroup_7_3()); 
            // InternalSecurityDsl.g:3911:2: ( rule__Endpoint__Group_7_3__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==67) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalSecurityDsl.g:3911:3: rule__Endpoint__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Endpoint__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalSecurityDsl.g:3919:1: rule__Endpoint__Group_7__4 : rule__Endpoint__Group_7__4__Impl ;
    public final void rule__Endpoint__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3923:1: ( rule__Endpoint__Group_7__4__Impl )
            // InternalSecurityDsl.g:3924:2: rule__Endpoint__Group_7__4__Impl
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
    // InternalSecurityDsl.g:3930:1: rule__Endpoint__Group_7__4__Impl : ( ']' ) ;
    public final void rule__Endpoint__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3934:1: ( ( ']' ) )
            // InternalSecurityDsl.g:3935:1: ( ']' )
            {
            // InternalSecurityDsl.g:3935:1: ( ']' )
            // InternalSecurityDsl.g:3936:2: ']'
            {
             before(grammarAccess.getEndpointAccess().getRightSquareBracketKeyword_7_4()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getRightSquareBracketKeyword_7_4()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3946:1: rule__Endpoint__Group_7_3__0 : rule__Endpoint__Group_7_3__0__Impl rule__Endpoint__Group_7_3__1 ;
    public final void rule__Endpoint__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3950:1: ( rule__Endpoint__Group_7_3__0__Impl rule__Endpoint__Group_7_3__1 )
            // InternalSecurityDsl.g:3951:2: rule__Endpoint__Group_7_3__0__Impl rule__Endpoint__Group_7_3__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSecurityDsl.g:3958:1: rule__Endpoint__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Endpoint__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3962:1: ( ( ',' ) )
            // InternalSecurityDsl.g:3963:1: ( ',' )
            {
            // InternalSecurityDsl.g:3963:1: ( ',' )
            // InternalSecurityDsl.g:3964:2: ','
            {
             before(grammarAccess.getEndpointAccess().getCommaKeyword_7_3_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3973:1: rule__Endpoint__Group_7_3__1 : rule__Endpoint__Group_7_3__1__Impl ;
    public final void rule__Endpoint__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3977:1: ( rule__Endpoint__Group_7_3__1__Impl )
            // InternalSecurityDsl.g:3978:2: rule__Endpoint__Group_7_3__1__Impl
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
    // InternalSecurityDsl.g:3984:1: rule__Endpoint__Group_7_3__1__Impl : ( ( rule__Endpoint__Role_authoritiesAssignment_7_3_1 ) ) ;
    public final void rule__Endpoint__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3988:1: ( ( ( rule__Endpoint__Role_authoritiesAssignment_7_3_1 ) ) )
            // InternalSecurityDsl.g:3989:1: ( ( rule__Endpoint__Role_authoritiesAssignment_7_3_1 ) )
            {
            // InternalSecurityDsl.g:3989:1: ( ( rule__Endpoint__Role_authoritiesAssignment_7_3_1 ) )
            // InternalSecurityDsl.g:3990:2: ( rule__Endpoint__Role_authoritiesAssignment_7_3_1 )
            {
             before(grammarAccess.getEndpointAccess().getRole_authoritiesAssignment_7_3_1()); 
            // InternalSecurityDsl.g:3991:2: ( rule__Endpoint__Role_authoritiesAssignment_7_3_1 )
            // InternalSecurityDsl.g:3991:3: rule__Endpoint__Role_authoritiesAssignment_7_3_1
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
    // InternalSecurityDsl.g:4000:1: rule__Authentication__Group__0 : rule__Authentication__Group__0__Impl rule__Authentication__Group__1 ;
    public final void rule__Authentication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4004:1: ( rule__Authentication__Group__0__Impl rule__Authentication__Group__1 )
            // InternalSecurityDsl.g:4005:2: rule__Authentication__Group__0__Impl rule__Authentication__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSecurityDsl.g:4012:1: rule__Authentication__Group__0__Impl : ( () ) ;
    public final void rule__Authentication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4016:1: ( ( () ) )
            // InternalSecurityDsl.g:4017:1: ( () )
            {
            // InternalSecurityDsl.g:4017:1: ( () )
            // InternalSecurityDsl.g:4018:2: ()
            {
             before(grammarAccess.getAuthenticationAccess().getAuthenticationAction_0()); 
            // InternalSecurityDsl.g:4019:2: ()
            // InternalSecurityDsl.g:4019:3: 
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
    // InternalSecurityDsl.g:4027:1: rule__Authentication__Group__1 : rule__Authentication__Group__1__Impl rule__Authentication__Group__2 ;
    public final void rule__Authentication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4031:1: ( rule__Authentication__Group__1__Impl rule__Authentication__Group__2 )
            // InternalSecurityDsl.g:4032:2: rule__Authentication__Group__1__Impl rule__Authentication__Group__2
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
    // InternalSecurityDsl.g:4039:1: rule__Authentication__Group__1__Impl : ( 'name:' ) ;
    public final void rule__Authentication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4043:1: ( ( 'name:' ) )
            // InternalSecurityDsl.g:4044:1: ( 'name:' )
            {
            // InternalSecurityDsl.g:4044:1: ( 'name:' )
            // InternalSecurityDsl.g:4045:2: 'name:'
            {
             before(grammarAccess.getAuthenticationAccess().getNameKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4054:1: rule__Authentication__Group__2 : rule__Authentication__Group__2__Impl rule__Authentication__Group__3 ;
    public final void rule__Authentication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4058:1: ( rule__Authentication__Group__2__Impl rule__Authentication__Group__3 )
            // InternalSecurityDsl.g:4059:2: rule__Authentication__Group__2__Impl rule__Authentication__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalSecurityDsl.g:4066:1: rule__Authentication__Group__2__Impl : ( ( rule__Authentication__NameAssignment_2 ) ) ;
    public final void rule__Authentication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4070:1: ( ( ( rule__Authentication__NameAssignment_2 ) ) )
            // InternalSecurityDsl.g:4071:1: ( ( rule__Authentication__NameAssignment_2 ) )
            {
            // InternalSecurityDsl.g:4071:1: ( ( rule__Authentication__NameAssignment_2 ) )
            // InternalSecurityDsl.g:4072:2: ( rule__Authentication__NameAssignment_2 )
            {
             before(grammarAccess.getAuthenticationAccess().getNameAssignment_2()); 
            // InternalSecurityDsl.g:4073:2: ( rule__Authentication__NameAssignment_2 )
            // InternalSecurityDsl.g:4073:3: rule__Authentication__NameAssignment_2
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
    // InternalSecurityDsl.g:4081:1: rule__Authentication__Group__3 : rule__Authentication__Group__3__Impl rule__Authentication__Group__4 ;
    public final void rule__Authentication__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4085:1: ( rule__Authentication__Group__3__Impl rule__Authentication__Group__4 )
            // InternalSecurityDsl.g:4086:2: rule__Authentication__Group__3__Impl rule__Authentication__Group__4
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
    // InternalSecurityDsl.g:4093:1: rule__Authentication__Group__3__Impl : ( 'path:' ) ;
    public final void rule__Authentication__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4097:1: ( ( 'path:' ) )
            // InternalSecurityDsl.g:4098:1: ( 'path:' )
            {
            // InternalSecurityDsl.g:4098:1: ( 'path:' )
            // InternalSecurityDsl.g:4099:2: 'path:'
            {
             before(grammarAccess.getAuthenticationAccess().getPathKeyword_3()); 
            match(input,72,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4108:1: rule__Authentication__Group__4 : rule__Authentication__Group__4__Impl rule__Authentication__Group__5 ;
    public final void rule__Authentication__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4112:1: ( rule__Authentication__Group__4__Impl rule__Authentication__Group__5 )
            // InternalSecurityDsl.g:4113:2: rule__Authentication__Group__4__Impl rule__Authentication__Group__5
            {
            pushFollow(FOLLOW_33);
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
    // InternalSecurityDsl.g:4120:1: rule__Authentication__Group__4__Impl : ( ( rule__Authentication__PathAssignment_4 ) ) ;
    public final void rule__Authentication__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4124:1: ( ( ( rule__Authentication__PathAssignment_4 ) ) )
            // InternalSecurityDsl.g:4125:1: ( ( rule__Authentication__PathAssignment_4 ) )
            {
            // InternalSecurityDsl.g:4125:1: ( ( rule__Authentication__PathAssignment_4 ) )
            // InternalSecurityDsl.g:4126:2: ( rule__Authentication__PathAssignment_4 )
            {
             before(grammarAccess.getAuthenticationAccess().getPathAssignment_4()); 
            // InternalSecurityDsl.g:4127:2: ( rule__Authentication__PathAssignment_4 )
            // InternalSecurityDsl.g:4127:3: rule__Authentication__PathAssignment_4
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
    // InternalSecurityDsl.g:4135:1: rule__Authentication__Group__5 : rule__Authentication__Group__5__Impl ;
    public final void rule__Authentication__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4139:1: ( rule__Authentication__Group__5__Impl )
            // InternalSecurityDsl.g:4140:2: rule__Authentication__Group__5__Impl
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
    // InternalSecurityDsl.g:4146:1: rule__Authentication__Group__5__Impl : ( ( rule__Authentication__Group_5__0 )? ) ;
    public final void rule__Authentication__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4150:1: ( ( ( rule__Authentication__Group_5__0 )? ) )
            // InternalSecurityDsl.g:4151:1: ( ( rule__Authentication__Group_5__0 )? )
            {
            // InternalSecurityDsl.g:4151:1: ( ( rule__Authentication__Group_5__0 )? )
            // InternalSecurityDsl.g:4152:2: ( rule__Authentication__Group_5__0 )?
            {
             before(grammarAccess.getAuthenticationAccess().getGroup_5()); 
            // InternalSecurityDsl.g:4153:2: ( rule__Authentication__Group_5__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==73) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSecurityDsl.g:4153:3: rule__Authentication__Group_5__0
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
    // InternalSecurityDsl.g:4162:1: rule__Authentication__Group_5__0 : rule__Authentication__Group_5__0__Impl rule__Authentication__Group_5__1 ;
    public final void rule__Authentication__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4166:1: ( rule__Authentication__Group_5__0__Impl rule__Authentication__Group_5__1 )
            // InternalSecurityDsl.g:4167:2: rule__Authentication__Group_5__0__Impl rule__Authentication__Group_5__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalSecurityDsl.g:4174:1: rule__Authentication__Group_5__0__Impl : ( 'endpoints:' ) ;
    public final void rule__Authentication__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4178:1: ( ( 'endpoints:' ) )
            // InternalSecurityDsl.g:4179:1: ( 'endpoints:' )
            {
            // InternalSecurityDsl.g:4179:1: ( 'endpoints:' )
            // InternalSecurityDsl.g:4180:2: 'endpoints:'
            {
             before(grammarAccess.getAuthenticationAccess().getEndpointsKeyword_5_0()); 
            match(input,73,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4189:1: rule__Authentication__Group_5__1 : rule__Authentication__Group_5__1__Impl rule__Authentication__Group_5__2 ;
    public final void rule__Authentication__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4193:1: ( rule__Authentication__Group_5__1__Impl rule__Authentication__Group_5__2 )
            // InternalSecurityDsl.g:4194:2: rule__Authentication__Group_5__1__Impl rule__Authentication__Group_5__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalSecurityDsl.g:4201:1: rule__Authentication__Group_5__1__Impl : ( '[' ) ;
    public final void rule__Authentication__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4205:1: ( ( '[' ) )
            // InternalSecurityDsl.g:4206:1: ( '[' )
            {
            // InternalSecurityDsl.g:4206:1: ( '[' )
            // InternalSecurityDsl.g:4207:2: '['
            {
             before(grammarAccess.getAuthenticationAccess().getLeftSquareBracketKeyword_5_1()); 
            match(input,65,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4216:1: rule__Authentication__Group_5__2 : rule__Authentication__Group_5__2__Impl rule__Authentication__Group_5__3 ;
    public final void rule__Authentication__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4220:1: ( rule__Authentication__Group_5__2__Impl rule__Authentication__Group_5__3 )
            // InternalSecurityDsl.g:4221:2: rule__Authentication__Group_5__2__Impl rule__Authentication__Group_5__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalSecurityDsl.g:4228:1: rule__Authentication__Group_5__2__Impl : ( ( rule__Authentication__Controller_endpointsAssignment_5_2 ) ) ;
    public final void rule__Authentication__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4232:1: ( ( ( rule__Authentication__Controller_endpointsAssignment_5_2 ) ) )
            // InternalSecurityDsl.g:4233:1: ( ( rule__Authentication__Controller_endpointsAssignment_5_2 ) )
            {
            // InternalSecurityDsl.g:4233:1: ( ( rule__Authentication__Controller_endpointsAssignment_5_2 ) )
            // InternalSecurityDsl.g:4234:2: ( rule__Authentication__Controller_endpointsAssignment_5_2 )
            {
             before(grammarAccess.getAuthenticationAccess().getController_endpointsAssignment_5_2()); 
            // InternalSecurityDsl.g:4235:2: ( rule__Authentication__Controller_endpointsAssignment_5_2 )
            // InternalSecurityDsl.g:4235:3: rule__Authentication__Controller_endpointsAssignment_5_2
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
    // InternalSecurityDsl.g:4243:1: rule__Authentication__Group_5__3 : rule__Authentication__Group_5__3__Impl rule__Authentication__Group_5__4 ;
    public final void rule__Authentication__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4247:1: ( rule__Authentication__Group_5__3__Impl rule__Authentication__Group_5__4 )
            // InternalSecurityDsl.g:4248:2: rule__Authentication__Group_5__3__Impl rule__Authentication__Group_5__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalSecurityDsl.g:4255:1: rule__Authentication__Group_5__3__Impl : ( ( rule__Authentication__Group_5_3__0 )* ) ;
    public final void rule__Authentication__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4259:1: ( ( ( rule__Authentication__Group_5_3__0 )* ) )
            // InternalSecurityDsl.g:4260:1: ( ( rule__Authentication__Group_5_3__0 )* )
            {
            // InternalSecurityDsl.g:4260:1: ( ( rule__Authentication__Group_5_3__0 )* )
            // InternalSecurityDsl.g:4261:2: ( rule__Authentication__Group_5_3__0 )*
            {
             before(grammarAccess.getAuthenticationAccess().getGroup_5_3()); 
            // InternalSecurityDsl.g:4262:2: ( rule__Authentication__Group_5_3__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==67) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalSecurityDsl.g:4262:3: rule__Authentication__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Authentication__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalSecurityDsl.g:4270:1: rule__Authentication__Group_5__4 : rule__Authentication__Group_5__4__Impl ;
    public final void rule__Authentication__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4274:1: ( rule__Authentication__Group_5__4__Impl )
            // InternalSecurityDsl.g:4275:2: rule__Authentication__Group_5__4__Impl
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
    // InternalSecurityDsl.g:4281:1: rule__Authentication__Group_5__4__Impl : ( ']' ) ;
    public final void rule__Authentication__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4285:1: ( ( ']' ) )
            // InternalSecurityDsl.g:4286:1: ( ']' )
            {
            // InternalSecurityDsl.g:4286:1: ( ']' )
            // InternalSecurityDsl.g:4287:2: ']'
            {
             before(grammarAccess.getAuthenticationAccess().getRightSquareBracketKeyword_5_4()); 
            match(input,66,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4297:1: rule__Authentication__Group_5_3__0 : rule__Authentication__Group_5_3__0__Impl rule__Authentication__Group_5_3__1 ;
    public final void rule__Authentication__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4301:1: ( rule__Authentication__Group_5_3__0__Impl rule__Authentication__Group_5_3__1 )
            // InternalSecurityDsl.g:4302:2: rule__Authentication__Group_5_3__0__Impl rule__Authentication__Group_5_3__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalSecurityDsl.g:4309:1: rule__Authentication__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Authentication__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4313:1: ( ( ',' ) )
            // InternalSecurityDsl.g:4314:1: ( ',' )
            {
            // InternalSecurityDsl.g:4314:1: ( ',' )
            // InternalSecurityDsl.g:4315:2: ','
            {
             before(grammarAccess.getAuthenticationAccess().getCommaKeyword_5_3_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4324:1: rule__Authentication__Group_5_3__1 : rule__Authentication__Group_5_3__1__Impl ;
    public final void rule__Authentication__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4328:1: ( rule__Authentication__Group_5_3__1__Impl )
            // InternalSecurityDsl.g:4329:2: rule__Authentication__Group_5_3__1__Impl
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
    // InternalSecurityDsl.g:4335:1: rule__Authentication__Group_5_3__1__Impl : ( ( rule__Authentication__Controller_endpointsAssignment_5_3_1 ) ) ;
    public final void rule__Authentication__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4339:1: ( ( ( rule__Authentication__Controller_endpointsAssignment_5_3_1 ) ) )
            // InternalSecurityDsl.g:4340:1: ( ( rule__Authentication__Controller_endpointsAssignment_5_3_1 ) )
            {
            // InternalSecurityDsl.g:4340:1: ( ( rule__Authentication__Controller_endpointsAssignment_5_3_1 ) )
            // InternalSecurityDsl.g:4341:2: ( rule__Authentication__Controller_endpointsAssignment_5_3_1 )
            {
             before(grammarAccess.getAuthenticationAccess().getController_endpointsAssignment_5_3_1()); 
            // InternalSecurityDsl.g:4342:2: ( rule__Authentication__Controller_endpointsAssignment_5_3_1 )
            // InternalSecurityDsl.g:4342:3: rule__Authentication__Controller_endpointsAssignment_5_3_1
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
    // InternalSecurityDsl.g:4351:1: rule__JWT__Group__0 : rule__JWT__Group__0__Impl rule__JWT__Group__1 ;
    public final void rule__JWT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4355:1: ( rule__JWT__Group__0__Impl rule__JWT__Group__1 )
            // InternalSecurityDsl.g:4356:2: rule__JWT__Group__0__Impl rule__JWT__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalSecurityDsl.g:4363:1: rule__JWT__Group__0__Impl : ( 'jwt:' ) ;
    public final void rule__JWT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4367:1: ( ( 'jwt:' ) )
            // InternalSecurityDsl.g:4368:1: ( 'jwt:' )
            {
            // InternalSecurityDsl.g:4368:1: ( 'jwt:' )
            // InternalSecurityDsl.g:4369:2: 'jwt:'
            {
             before(grammarAccess.getJWTAccess().getJwtKeyword_0()); 
            match(input,74,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4378:1: rule__JWT__Group__1 : rule__JWT__Group__1__Impl rule__JWT__Group__2 ;
    public final void rule__JWT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4382:1: ( rule__JWT__Group__1__Impl rule__JWT__Group__2 )
            // InternalSecurityDsl.g:4383:2: rule__JWT__Group__1__Impl rule__JWT__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalSecurityDsl.g:4390:1: rule__JWT__Group__1__Impl : ( 'header:' ) ;
    public final void rule__JWT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4394:1: ( ( 'header:' ) )
            // InternalSecurityDsl.g:4395:1: ( 'header:' )
            {
            // InternalSecurityDsl.g:4395:1: ( 'header:' )
            // InternalSecurityDsl.g:4396:2: 'header:'
            {
             before(grammarAccess.getJWTAccess().getHeaderKeyword_1()); 
            match(input,75,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4405:1: rule__JWT__Group__2 : rule__JWT__Group__2__Impl rule__JWT__Group__3 ;
    public final void rule__JWT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4409:1: ( rule__JWT__Group__2__Impl rule__JWT__Group__3 )
            // InternalSecurityDsl.g:4410:2: rule__JWT__Group__2__Impl rule__JWT__Group__3
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
    // InternalSecurityDsl.g:4417:1: rule__JWT__Group__2__Impl : ( 'signatureAlgorithm:' ) ;
    public final void rule__JWT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4421:1: ( ( 'signatureAlgorithm:' ) )
            // InternalSecurityDsl.g:4422:1: ( 'signatureAlgorithm:' )
            {
            // InternalSecurityDsl.g:4422:1: ( 'signatureAlgorithm:' )
            // InternalSecurityDsl.g:4423:2: 'signatureAlgorithm:'
            {
             before(grammarAccess.getJWTAccess().getSignatureAlgorithmKeyword_2()); 
            match(input,76,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4432:1: rule__JWT__Group__3 : rule__JWT__Group__3__Impl rule__JWT__Group__4 ;
    public final void rule__JWT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4436:1: ( rule__JWT__Group__3__Impl rule__JWT__Group__4 )
            // InternalSecurityDsl.g:4437:2: rule__JWT__Group__3__Impl rule__JWT__Group__4
            {
            pushFollow(FOLLOW_36);
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
    // InternalSecurityDsl.g:4444:1: rule__JWT__Group__3__Impl : ( ( rule__JWT__SignatureAlgorithmAssignment_3 ) ) ;
    public final void rule__JWT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4448:1: ( ( ( rule__JWT__SignatureAlgorithmAssignment_3 ) ) )
            // InternalSecurityDsl.g:4449:1: ( ( rule__JWT__SignatureAlgorithmAssignment_3 ) )
            {
            // InternalSecurityDsl.g:4449:1: ( ( rule__JWT__SignatureAlgorithmAssignment_3 ) )
            // InternalSecurityDsl.g:4450:2: ( rule__JWT__SignatureAlgorithmAssignment_3 )
            {
             before(grammarAccess.getJWTAccess().getSignatureAlgorithmAssignment_3()); 
            // InternalSecurityDsl.g:4451:2: ( rule__JWT__SignatureAlgorithmAssignment_3 )
            // InternalSecurityDsl.g:4451:3: rule__JWT__SignatureAlgorithmAssignment_3
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
    // InternalSecurityDsl.g:4459:1: rule__JWT__Group__4 : rule__JWT__Group__4__Impl rule__JWT__Group__5 ;
    public final void rule__JWT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4463:1: ( rule__JWT__Group__4__Impl rule__JWT__Group__5 )
            // InternalSecurityDsl.g:4464:2: rule__JWT__Group__4__Impl rule__JWT__Group__5
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
    // InternalSecurityDsl.g:4471:1: rule__JWT__Group__4__Impl : ( 'payload:' ) ;
    public final void rule__JWT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4475:1: ( ( 'payload:' ) )
            // InternalSecurityDsl.g:4476:1: ( 'payload:' )
            {
            // InternalSecurityDsl.g:4476:1: ( 'payload:' )
            // InternalSecurityDsl.g:4477:2: 'payload:'
            {
             before(grammarAccess.getJWTAccess().getPayloadKeyword_4()); 
            match(input,77,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4486:1: rule__JWT__Group__5 : rule__JWT__Group__5__Impl rule__JWT__Group__6 ;
    public final void rule__JWT__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4490:1: ( rule__JWT__Group__5__Impl rule__JWT__Group__6 )
            // InternalSecurityDsl.g:4491:2: rule__JWT__Group__5__Impl rule__JWT__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalSecurityDsl.g:4498:1: rule__JWT__Group__5__Impl : ( 'claims:' ) ;
    public final void rule__JWT__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4502:1: ( ( 'claims:' ) )
            // InternalSecurityDsl.g:4503:1: ( 'claims:' )
            {
            // InternalSecurityDsl.g:4503:1: ( 'claims:' )
            // InternalSecurityDsl.g:4504:2: 'claims:'
            {
             before(grammarAccess.getJWTAccess().getClaimsKeyword_5()); 
            match(input,78,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4513:1: rule__JWT__Group__6 : rule__JWT__Group__6__Impl rule__JWT__Group__7 ;
    public final void rule__JWT__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4517:1: ( rule__JWT__Group__6__Impl rule__JWT__Group__7 )
            // InternalSecurityDsl.g:4518:2: rule__JWT__Group__6__Impl rule__JWT__Group__7
            {
            pushFollow(FOLLOW_25);
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
    // InternalSecurityDsl.g:4525:1: rule__JWT__Group__6__Impl : ( '[' ) ;
    public final void rule__JWT__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4529:1: ( ( '[' ) )
            // InternalSecurityDsl.g:4530:1: ( '[' )
            {
            // InternalSecurityDsl.g:4530:1: ( '[' )
            // InternalSecurityDsl.g:4531:2: '['
            {
             before(grammarAccess.getJWTAccess().getLeftSquareBracketKeyword_6()); 
            match(input,65,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4540:1: rule__JWT__Group__7 : rule__JWT__Group__7__Impl rule__JWT__Group__8 ;
    public final void rule__JWT__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4544:1: ( rule__JWT__Group__7__Impl rule__JWT__Group__8 )
            // InternalSecurityDsl.g:4545:2: rule__JWT__Group__7__Impl rule__JWT__Group__8
            {
            pushFollow(FOLLOW_26);
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
    // InternalSecurityDsl.g:4552:1: rule__JWT__Group__7__Impl : ( ( rule__JWT__Registered_claimsAssignment_7 ) ) ;
    public final void rule__JWT__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4556:1: ( ( ( rule__JWT__Registered_claimsAssignment_7 ) ) )
            // InternalSecurityDsl.g:4557:1: ( ( rule__JWT__Registered_claimsAssignment_7 ) )
            {
            // InternalSecurityDsl.g:4557:1: ( ( rule__JWT__Registered_claimsAssignment_7 ) )
            // InternalSecurityDsl.g:4558:2: ( rule__JWT__Registered_claimsAssignment_7 )
            {
             before(grammarAccess.getJWTAccess().getRegistered_claimsAssignment_7()); 
            // InternalSecurityDsl.g:4559:2: ( rule__JWT__Registered_claimsAssignment_7 )
            // InternalSecurityDsl.g:4559:3: rule__JWT__Registered_claimsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__JWT__Registered_claimsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getJWTAccess().getRegistered_claimsAssignment_7()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:4567:1: rule__JWT__Group__8 : rule__JWT__Group__8__Impl rule__JWT__Group__9 ;
    public final void rule__JWT__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4571:1: ( rule__JWT__Group__8__Impl rule__JWT__Group__9 )
            // InternalSecurityDsl.g:4572:2: rule__JWT__Group__8__Impl rule__JWT__Group__9
            {
            pushFollow(FOLLOW_26);
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
    // InternalSecurityDsl.g:4579:1: rule__JWT__Group__8__Impl : ( ( rule__JWT__Group_8__0 )* ) ;
    public final void rule__JWT__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4583:1: ( ( ( rule__JWT__Group_8__0 )* ) )
            // InternalSecurityDsl.g:4584:1: ( ( rule__JWT__Group_8__0 )* )
            {
            // InternalSecurityDsl.g:4584:1: ( ( rule__JWT__Group_8__0 )* )
            // InternalSecurityDsl.g:4585:2: ( rule__JWT__Group_8__0 )*
            {
             before(grammarAccess.getJWTAccess().getGroup_8()); 
            // InternalSecurityDsl.g:4586:2: ( rule__JWT__Group_8__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==67) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalSecurityDsl.g:4586:3: rule__JWT__Group_8__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__JWT__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalSecurityDsl.g:4594:1: rule__JWT__Group__9 : rule__JWT__Group__9__Impl rule__JWT__Group__10 ;
    public final void rule__JWT__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4598:1: ( rule__JWT__Group__9__Impl rule__JWT__Group__10 )
            // InternalSecurityDsl.g:4599:2: rule__JWT__Group__9__Impl rule__JWT__Group__10
            {
            pushFollow(FOLLOW_38);
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
    // InternalSecurityDsl.g:4606:1: rule__JWT__Group__9__Impl : ( ']' ) ;
    public final void rule__JWT__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4610:1: ( ( ']' ) )
            // InternalSecurityDsl.g:4611:1: ( ']' )
            {
            // InternalSecurityDsl.g:4611:1: ( ']' )
            // InternalSecurityDsl.g:4612:2: ']'
            {
             before(grammarAccess.getJWTAccess().getRightSquareBracketKeyword_9()); 
            match(input,66,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4621:1: rule__JWT__Group__10 : rule__JWT__Group__10__Impl ;
    public final void rule__JWT__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4625:1: ( rule__JWT__Group__10__Impl )
            // InternalSecurityDsl.g:4626:2: rule__JWT__Group__10__Impl
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
    // InternalSecurityDsl.g:4632:1: rule__JWT__Group__10__Impl : ( ( rule__JWT__Group_10__0 )? ) ;
    public final void rule__JWT__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4636:1: ( ( ( rule__JWT__Group_10__0 )? ) )
            // InternalSecurityDsl.g:4637:1: ( ( rule__JWT__Group_10__0 )? )
            {
            // InternalSecurityDsl.g:4637:1: ( ( rule__JWT__Group_10__0 )? )
            // InternalSecurityDsl.g:4638:2: ( rule__JWT__Group_10__0 )?
            {
             before(grammarAccess.getJWTAccess().getGroup_10()); 
            // InternalSecurityDsl.g:4639:2: ( rule__JWT__Group_10__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==79) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSecurityDsl.g:4639:3: rule__JWT__Group_10__0
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
    // InternalSecurityDsl.g:4648:1: rule__JWT__Group_8__0 : rule__JWT__Group_8__0__Impl rule__JWT__Group_8__1 ;
    public final void rule__JWT__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4652:1: ( rule__JWT__Group_8__0__Impl rule__JWT__Group_8__1 )
            // InternalSecurityDsl.g:4653:2: rule__JWT__Group_8__0__Impl rule__JWT__Group_8__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalSecurityDsl.g:4660:1: rule__JWT__Group_8__0__Impl : ( ',' ) ;
    public final void rule__JWT__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4664:1: ( ( ',' ) )
            // InternalSecurityDsl.g:4665:1: ( ',' )
            {
            // InternalSecurityDsl.g:4665:1: ( ',' )
            // InternalSecurityDsl.g:4666:2: ','
            {
             before(grammarAccess.getJWTAccess().getCommaKeyword_8_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4675:1: rule__JWT__Group_8__1 : rule__JWT__Group_8__1__Impl ;
    public final void rule__JWT__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4679:1: ( rule__JWT__Group_8__1__Impl )
            // InternalSecurityDsl.g:4680:2: rule__JWT__Group_8__1__Impl
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
    // InternalSecurityDsl.g:4686:1: rule__JWT__Group_8__1__Impl : ( ( rule__JWT__ClaimsAssignment_8_1 ) ) ;
    public final void rule__JWT__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4690:1: ( ( ( rule__JWT__ClaimsAssignment_8_1 ) ) )
            // InternalSecurityDsl.g:4691:1: ( ( rule__JWT__ClaimsAssignment_8_1 ) )
            {
            // InternalSecurityDsl.g:4691:1: ( ( rule__JWT__ClaimsAssignment_8_1 ) )
            // InternalSecurityDsl.g:4692:2: ( rule__JWT__ClaimsAssignment_8_1 )
            {
             before(grammarAccess.getJWTAccess().getClaimsAssignment_8_1()); 
            // InternalSecurityDsl.g:4693:2: ( rule__JWT__ClaimsAssignment_8_1 )
            // InternalSecurityDsl.g:4693:3: rule__JWT__ClaimsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__JWT__ClaimsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getJWTAccess().getClaimsAssignment_8_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:4702:1: rule__JWT__Group_10__0 : rule__JWT__Group_10__0__Impl rule__JWT__Group_10__1 ;
    public final void rule__JWT__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4706:1: ( rule__JWT__Group_10__0__Impl rule__JWT__Group_10__1 )
            // InternalSecurityDsl.g:4707:2: rule__JWT__Group_10__0__Impl rule__JWT__Group_10__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalSecurityDsl.g:4714:1: rule__JWT__Group_10__0__Impl : ( 'signature:' ) ;
    public final void rule__JWT__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4718:1: ( ( 'signature:' ) )
            // InternalSecurityDsl.g:4719:1: ( 'signature:' )
            {
            // InternalSecurityDsl.g:4719:1: ( 'signature:' )
            // InternalSecurityDsl.g:4720:2: 'signature:'
            {
             before(grammarAccess.getJWTAccess().getSignatureKeyword_10_0()); 
            match(input,79,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4729:1: rule__JWT__Group_10__1 : rule__JWT__Group_10__1__Impl rule__JWT__Group_10__2 ;
    public final void rule__JWT__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4733:1: ( rule__JWT__Group_10__1__Impl rule__JWT__Group_10__2 )
            // InternalSecurityDsl.g:4734:2: rule__JWT__Group_10__1__Impl rule__JWT__Group_10__2
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
    // InternalSecurityDsl.g:4741:1: rule__JWT__Group_10__1__Impl : ( 'secret:' ) ;
    public final void rule__JWT__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4745:1: ( ( 'secret:' ) )
            // InternalSecurityDsl.g:4746:1: ( 'secret:' )
            {
            // InternalSecurityDsl.g:4746:1: ( 'secret:' )
            // InternalSecurityDsl.g:4747:2: 'secret:'
            {
             before(grammarAccess.getJWTAccess().getSecretKeyword_10_1()); 
            match(input,80,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4756:1: rule__JWT__Group_10__2 : rule__JWT__Group_10__2__Impl ;
    public final void rule__JWT__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4760:1: ( rule__JWT__Group_10__2__Impl )
            // InternalSecurityDsl.g:4761:2: rule__JWT__Group_10__2__Impl
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
    // InternalSecurityDsl.g:4767:1: rule__JWT__Group_10__2__Impl : ( ( rule__JWT__SecretAssignment_10_2 ) ) ;
    public final void rule__JWT__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4771:1: ( ( ( rule__JWT__SecretAssignment_10_2 ) ) )
            // InternalSecurityDsl.g:4772:1: ( ( rule__JWT__SecretAssignment_10_2 ) )
            {
            // InternalSecurityDsl.g:4772:1: ( ( rule__JWT__SecretAssignment_10_2 ) )
            // InternalSecurityDsl.g:4773:2: ( rule__JWT__SecretAssignment_10_2 )
            {
             before(grammarAccess.getJWTAccess().getSecretAssignment_10_2()); 
            // InternalSecurityDsl.g:4774:2: ( rule__JWT__SecretAssignment_10_2 )
            // InternalSecurityDsl.g:4774:3: rule__JWT__SecretAssignment_10_2
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
    // InternalSecurityDsl.g:4783:1: rule__Claim__Group__0 : rule__Claim__Group__0__Impl rule__Claim__Group__1 ;
    public final void rule__Claim__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4787:1: ( rule__Claim__Group__0__Impl rule__Claim__Group__1 )
            // InternalSecurityDsl.g:4788:2: rule__Claim__Group__0__Impl rule__Claim__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalSecurityDsl.g:4795:1: rule__Claim__Group__0__Impl : ( '{' ) ;
    public final void rule__Claim__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4799:1: ( ( '{' ) )
            // InternalSecurityDsl.g:4800:1: ( '{' )
            {
            // InternalSecurityDsl.g:4800:1: ( '{' )
            // InternalSecurityDsl.g:4801:2: '{'
            {
             before(grammarAccess.getClaimAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4810:1: rule__Claim__Group__1 : rule__Claim__Group__1__Impl rule__Claim__Group__2 ;
    public final void rule__Claim__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4814:1: ( rule__Claim__Group__1__Impl rule__Claim__Group__2 )
            // InternalSecurityDsl.g:4815:2: rule__Claim__Group__1__Impl rule__Claim__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalSecurityDsl.g:4822:1: rule__Claim__Group__1__Impl : ( ( rule__Claim__Group_1__0 )? ) ;
    public final void rule__Claim__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4826:1: ( ( ( rule__Claim__Group_1__0 )? ) )
            // InternalSecurityDsl.g:4827:1: ( ( rule__Claim__Group_1__0 )? )
            {
            // InternalSecurityDsl.g:4827:1: ( ( rule__Claim__Group_1__0 )? )
            // InternalSecurityDsl.g:4828:2: ( rule__Claim__Group_1__0 )?
            {
             before(grammarAccess.getClaimAccess().getGroup_1()); 
            // InternalSecurityDsl.g:4829:2: ( rule__Claim__Group_1__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=29 && LA42_0<=31)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSecurityDsl.g:4829:3: rule__Claim__Group_1__0
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
    // InternalSecurityDsl.g:4837:1: rule__Claim__Group__2 : rule__Claim__Group__2__Impl rule__Claim__Group__3 ;
    public final void rule__Claim__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4841:1: ( rule__Claim__Group__2__Impl rule__Claim__Group__3 )
            // InternalSecurityDsl.g:4842:2: rule__Claim__Group__2__Impl rule__Claim__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalSecurityDsl.g:4849:1: rule__Claim__Group__2__Impl : ( ( rule__Claim__NameAssignment_2 ) ) ;
    public final void rule__Claim__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4853:1: ( ( ( rule__Claim__NameAssignment_2 ) ) )
            // InternalSecurityDsl.g:4854:1: ( ( rule__Claim__NameAssignment_2 ) )
            {
            // InternalSecurityDsl.g:4854:1: ( ( rule__Claim__NameAssignment_2 ) )
            // InternalSecurityDsl.g:4855:2: ( rule__Claim__NameAssignment_2 )
            {
             before(grammarAccess.getClaimAccess().getNameAssignment_2()); 
            // InternalSecurityDsl.g:4856:2: ( rule__Claim__NameAssignment_2 )
            // InternalSecurityDsl.g:4856:3: rule__Claim__NameAssignment_2
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
    // InternalSecurityDsl.g:4864:1: rule__Claim__Group__3 : rule__Claim__Group__3__Impl rule__Claim__Group__4 ;
    public final void rule__Claim__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4868:1: ( rule__Claim__Group__3__Impl rule__Claim__Group__4 )
            // InternalSecurityDsl.g:4869:2: rule__Claim__Group__3__Impl rule__Claim__Group__4
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
    // InternalSecurityDsl.g:4876:1: rule__Claim__Group__3__Impl : ( ':' ) ;
    public final void rule__Claim__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4880:1: ( ( ':' ) )
            // InternalSecurityDsl.g:4881:1: ( ':' )
            {
            // InternalSecurityDsl.g:4881:1: ( ':' )
            // InternalSecurityDsl.g:4882:2: ':'
            {
             before(grammarAccess.getClaimAccess().getColonKeyword_3()); 
            match(input,81,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4891:1: rule__Claim__Group__4 : rule__Claim__Group__4__Impl rule__Claim__Group__5 ;
    public final void rule__Claim__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4895:1: ( rule__Claim__Group__4__Impl rule__Claim__Group__5 )
            // InternalSecurityDsl.g:4896:2: rule__Claim__Group__4__Impl rule__Claim__Group__5
            {
            pushFollow(FOLLOW_42);
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
    // InternalSecurityDsl.g:4903:1: rule__Claim__Group__4__Impl : ( ( rule__Claim__Claim_attributeAssignment_4 ) ) ;
    public final void rule__Claim__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4907:1: ( ( ( rule__Claim__Claim_attributeAssignment_4 ) ) )
            // InternalSecurityDsl.g:4908:1: ( ( rule__Claim__Claim_attributeAssignment_4 ) )
            {
            // InternalSecurityDsl.g:4908:1: ( ( rule__Claim__Claim_attributeAssignment_4 ) )
            // InternalSecurityDsl.g:4909:2: ( rule__Claim__Claim_attributeAssignment_4 )
            {
             before(grammarAccess.getClaimAccess().getClaim_attributeAssignment_4()); 
            // InternalSecurityDsl.g:4910:2: ( rule__Claim__Claim_attributeAssignment_4 )
            // InternalSecurityDsl.g:4910:3: rule__Claim__Claim_attributeAssignment_4
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
    // InternalSecurityDsl.g:4918:1: rule__Claim__Group__5 : rule__Claim__Group__5__Impl ;
    public final void rule__Claim__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4922:1: ( rule__Claim__Group__5__Impl )
            // InternalSecurityDsl.g:4923:2: rule__Claim__Group__5__Impl
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
    // InternalSecurityDsl.g:4929:1: rule__Claim__Group__5__Impl : ( '}' ) ;
    public final void rule__Claim__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4933:1: ( ( '}' ) )
            // InternalSecurityDsl.g:4934:1: ( '}' )
            {
            // InternalSecurityDsl.g:4934:1: ( '}' )
            // InternalSecurityDsl.g:4935:2: '}'
            {
             before(grammarAccess.getClaimAccess().getRightCurlyBracketKeyword_5()); 
            match(input,61,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4945:1: rule__Claim__Group_1__0 : rule__Claim__Group_1__0__Impl rule__Claim__Group_1__1 ;
    public final void rule__Claim__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4949:1: ( rule__Claim__Group_1__0__Impl rule__Claim__Group_1__1 )
            // InternalSecurityDsl.g:4950:2: rule__Claim__Group_1__0__Impl rule__Claim__Group_1__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalSecurityDsl.g:4957:1: rule__Claim__Group_1__0__Impl : ( ( rule__Claim__TypeAssignment_1_0 ) ) ;
    public final void rule__Claim__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4961:1: ( ( ( rule__Claim__TypeAssignment_1_0 ) ) )
            // InternalSecurityDsl.g:4962:1: ( ( rule__Claim__TypeAssignment_1_0 ) )
            {
            // InternalSecurityDsl.g:4962:1: ( ( rule__Claim__TypeAssignment_1_0 ) )
            // InternalSecurityDsl.g:4963:2: ( rule__Claim__TypeAssignment_1_0 )
            {
             before(grammarAccess.getClaimAccess().getTypeAssignment_1_0()); 
            // InternalSecurityDsl.g:4964:2: ( rule__Claim__TypeAssignment_1_0 )
            // InternalSecurityDsl.g:4964:3: rule__Claim__TypeAssignment_1_0
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
    // InternalSecurityDsl.g:4972:1: rule__Claim__Group_1__1 : rule__Claim__Group_1__1__Impl ;
    public final void rule__Claim__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4976:1: ( rule__Claim__Group_1__1__Impl )
            // InternalSecurityDsl.g:4977:2: rule__Claim__Group_1__1__Impl
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
    // InternalSecurityDsl.g:4983:1: rule__Claim__Group_1__1__Impl : ( ',' ) ;
    public final void rule__Claim__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4987:1: ( ( ',' ) )
            // InternalSecurityDsl.g:4988:1: ( ',' )
            {
            // InternalSecurityDsl.g:4988:1: ( ',' )
            // InternalSecurityDsl.g:4989:2: ','
            {
             before(grammarAccess.getClaimAccess().getCommaKeyword_1_1()); 
            match(input,67,FOLLOW_2); 
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


    // $ANTLR start "rule__RegisteredClaim__Group__0"
    // InternalSecurityDsl.g:4999:1: rule__RegisteredClaim__Group__0 : rule__RegisteredClaim__Group__0__Impl rule__RegisteredClaim__Group__1 ;
    public final void rule__RegisteredClaim__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5003:1: ( rule__RegisteredClaim__Group__0__Impl rule__RegisteredClaim__Group__1 )
            // InternalSecurityDsl.g:5004:2: rule__RegisteredClaim__Group__0__Impl rule__RegisteredClaim__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__RegisteredClaim__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegisteredClaim__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__Group__0"


    // $ANTLR start "rule__RegisteredClaim__Group__0__Impl"
    // InternalSecurityDsl.g:5011:1: rule__RegisteredClaim__Group__0__Impl : ( '{' ) ;
    public final void rule__RegisteredClaim__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5015:1: ( ( '{' ) )
            // InternalSecurityDsl.g:5016:1: ( '{' )
            {
            // InternalSecurityDsl.g:5016:1: ( '{' )
            // InternalSecurityDsl.g:5017:2: '{'
            {
             before(grammarAccess.getRegisteredClaimAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getRegisteredClaimAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__Group__0__Impl"


    // $ANTLR start "rule__RegisteredClaim__Group__1"
    // InternalSecurityDsl.g:5026:1: rule__RegisteredClaim__Group__1 : rule__RegisteredClaim__Group__1__Impl rule__RegisteredClaim__Group__2 ;
    public final void rule__RegisteredClaim__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5030:1: ( rule__RegisteredClaim__Group__1__Impl rule__RegisteredClaim__Group__2 )
            // InternalSecurityDsl.g:5031:2: rule__RegisteredClaim__Group__1__Impl rule__RegisteredClaim__Group__2
            {
            pushFollow(FOLLOW_45);
            rule__RegisteredClaim__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegisteredClaim__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__Group__1"


    // $ANTLR start "rule__RegisteredClaim__Group__1__Impl"
    // InternalSecurityDsl.g:5038:1: rule__RegisteredClaim__Group__1__Impl : ( 'REGISTERED,' ) ;
    public final void rule__RegisteredClaim__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5042:1: ( ( 'REGISTERED,' ) )
            // InternalSecurityDsl.g:5043:1: ( 'REGISTERED,' )
            {
            // InternalSecurityDsl.g:5043:1: ( 'REGISTERED,' )
            // InternalSecurityDsl.g:5044:2: 'REGISTERED,'
            {
             before(grammarAccess.getRegisteredClaimAccess().getREGISTEREDKeyword_1()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getRegisteredClaimAccess().getREGISTEREDKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__Group__1__Impl"


    // $ANTLR start "rule__RegisteredClaim__Group__2"
    // InternalSecurityDsl.g:5053:1: rule__RegisteredClaim__Group__2 : rule__RegisteredClaim__Group__2__Impl rule__RegisteredClaim__Group__3 ;
    public final void rule__RegisteredClaim__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5057:1: ( rule__RegisteredClaim__Group__2__Impl rule__RegisteredClaim__Group__3 )
            // InternalSecurityDsl.g:5058:2: rule__RegisteredClaim__Group__2__Impl rule__RegisteredClaim__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__RegisteredClaim__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegisteredClaim__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__Group__2"


    // $ANTLR start "rule__RegisteredClaim__Group__2__Impl"
    // InternalSecurityDsl.g:5065:1: rule__RegisteredClaim__Group__2__Impl : ( 'expirationTime:' ) ;
    public final void rule__RegisteredClaim__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5069:1: ( ( 'expirationTime:' ) )
            // InternalSecurityDsl.g:5070:1: ( 'expirationTime:' )
            {
            // InternalSecurityDsl.g:5070:1: ( 'expirationTime:' )
            // InternalSecurityDsl.g:5071:2: 'expirationTime:'
            {
             before(grammarAccess.getRegisteredClaimAccess().getExpirationTimeKeyword_2()); 
            match(input,83,FOLLOW_2); 
             after(grammarAccess.getRegisteredClaimAccess().getExpirationTimeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__Group__2__Impl"


    // $ANTLR start "rule__RegisteredClaim__Group__3"
    // InternalSecurityDsl.g:5080:1: rule__RegisteredClaim__Group__3 : rule__RegisteredClaim__Group__3__Impl rule__RegisteredClaim__Group__4 ;
    public final void rule__RegisteredClaim__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5084:1: ( rule__RegisteredClaim__Group__3__Impl rule__RegisteredClaim__Group__4 )
            // InternalSecurityDsl.g:5085:2: rule__RegisteredClaim__Group__3__Impl rule__RegisteredClaim__Group__4
            {
            pushFollow(FOLLOW_42);
            rule__RegisteredClaim__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegisteredClaim__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__Group__3"


    // $ANTLR start "rule__RegisteredClaim__Group__3__Impl"
    // InternalSecurityDsl.g:5092:1: rule__RegisteredClaim__Group__3__Impl : ( ( rule__RegisteredClaim__ExpirationTimeAssignment_3 ) ) ;
    public final void rule__RegisteredClaim__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5096:1: ( ( ( rule__RegisteredClaim__ExpirationTimeAssignment_3 ) ) )
            // InternalSecurityDsl.g:5097:1: ( ( rule__RegisteredClaim__ExpirationTimeAssignment_3 ) )
            {
            // InternalSecurityDsl.g:5097:1: ( ( rule__RegisteredClaim__ExpirationTimeAssignment_3 ) )
            // InternalSecurityDsl.g:5098:2: ( rule__RegisteredClaim__ExpirationTimeAssignment_3 )
            {
             before(grammarAccess.getRegisteredClaimAccess().getExpirationTimeAssignment_3()); 
            // InternalSecurityDsl.g:5099:2: ( rule__RegisteredClaim__ExpirationTimeAssignment_3 )
            // InternalSecurityDsl.g:5099:3: rule__RegisteredClaim__ExpirationTimeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RegisteredClaim__ExpirationTimeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRegisteredClaimAccess().getExpirationTimeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__Group__3__Impl"


    // $ANTLR start "rule__RegisteredClaim__Group__4"
    // InternalSecurityDsl.g:5107:1: rule__RegisteredClaim__Group__4 : rule__RegisteredClaim__Group__4__Impl rule__RegisteredClaim__Group__5 ;
    public final void rule__RegisteredClaim__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5111:1: ( rule__RegisteredClaim__Group__4__Impl rule__RegisteredClaim__Group__5 )
            // InternalSecurityDsl.g:5112:2: rule__RegisteredClaim__Group__4__Impl rule__RegisteredClaim__Group__5
            {
            pushFollow(FOLLOW_43);
            rule__RegisteredClaim__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegisteredClaim__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__Group__4"


    // $ANTLR start "rule__RegisteredClaim__Group__4__Impl"
    // InternalSecurityDsl.g:5119:1: rule__RegisteredClaim__Group__4__Impl : ( '}' ) ;
    public final void rule__RegisteredClaim__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5123:1: ( ( '}' ) )
            // InternalSecurityDsl.g:5124:1: ( '}' )
            {
            // InternalSecurityDsl.g:5124:1: ( '}' )
            // InternalSecurityDsl.g:5125:2: '}'
            {
             before(grammarAccess.getRegisteredClaimAccess().getRightCurlyBracketKeyword_4()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getRegisteredClaimAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__Group__4__Impl"


    // $ANTLR start "rule__RegisteredClaim__Group__5"
    // InternalSecurityDsl.g:5134:1: rule__RegisteredClaim__Group__5 : rule__RegisteredClaim__Group__5__Impl rule__RegisteredClaim__Group__6 ;
    public final void rule__RegisteredClaim__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5138:1: ( rule__RegisteredClaim__Group__5__Impl rule__RegisteredClaim__Group__6 )
            // InternalSecurityDsl.g:5139:2: rule__RegisteredClaim__Group__5__Impl rule__RegisteredClaim__Group__6
            {
            pushFollow(FOLLOW_43);
            rule__RegisteredClaim__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegisteredClaim__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__Group__5"


    // $ANTLR start "rule__RegisteredClaim__Group__5__Impl"
    // InternalSecurityDsl.g:5146:1: rule__RegisteredClaim__Group__5__Impl : ( ( rule__RegisteredClaim__Group_5__0 )? ) ;
    public final void rule__RegisteredClaim__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5150:1: ( ( ( rule__RegisteredClaim__Group_5__0 )? ) )
            // InternalSecurityDsl.g:5151:1: ( ( rule__RegisteredClaim__Group_5__0 )? )
            {
            // InternalSecurityDsl.g:5151:1: ( ( rule__RegisteredClaim__Group_5__0 )? )
            // InternalSecurityDsl.g:5152:2: ( rule__RegisteredClaim__Group_5__0 )?
            {
             before(grammarAccess.getRegisteredClaimAccess().getGroup_5()); 
            // InternalSecurityDsl.g:5153:2: ( rule__RegisteredClaim__Group_5__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==67) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==59) ) {
                    int LA43_3 = input.LA(3);

                    if ( (LA43_3==82) ) {
                        int LA43_4 = input.LA(4);

                        if ( (LA43_4==84) ) {
                            alt43=1;
                        }
                    }
                }
            }
            switch (alt43) {
                case 1 :
                    // InternalSecurityDsl.g:5153:3: rule__RegisteredClaim__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegisteredClaim__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegisteredClaimAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__Group__5__Impl"


    // $ANTLR start "rule__RegisteredClaim__Group__6"
    // InternalSecurityDsl.g:5161:1: rule__RegisteredClaim__Group__6 : rule__RegisteredClaim__Group__6__Impl ;
    public final void rule__RegisteredClaim__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5165:1: ( rule__RegisteredClaim__Group__6__Impl )
            // InternalSecurityDsl.g:5166:2: rule__RegisteredClaim__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegisteredClaim__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__Group__6"


    // $ANTLR start "rule__RegisteredClaim__Group__6__Impl"
    // InternalSecurityDsl.g:5172:1: rule__RegisteredClaim__Group__6__Impl : ( ( rule__RegisteredClaim__Group_6__0 )? ) ;
    public final void rule__RegisteredClaim__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5176:1: ( ( ( rule__RegisteredClaim__Group_6__0 )? ) )
            // InternalSecurityDsl.g:5177:1: ( ( rule__RegisteredClaim__Group_6__0 )? )
            {
            // InternalSecurityDsl.g:5177:1: ( ( rule__RegisteredClaim__Group_6__0 )? )
            // InternalSecurityDsl.g:5178:2: ( rule__RegisteredClaim__Group_6__0 )?
            {
             before(grammarAccess.getRegisteredClaimAccess().getGroup_6()); 
            // InternalSecurityDsl.g:5179:2: ( rule__RegisteredClaim__Group_6__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==67) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==59) ) {
                    int LA44_3 = input.LA(3);

                    if ( (LA44_3==82) ) {
                        alt44=1;
                    }
                }
            }
            switch (alt44) {
                case 1 :
                    // InternalSecurityDsl.g:5179:3: rule__RegisteredClaim__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegisteredClaim__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegisteredClaimAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__Group__6__Impl"


    // $ANTLR start "rule__RegisteredClaim__Group_5__0"
    // InternalSecurityDsl.g:5188:1: rule__RegisteredClaim__Group_5__0 : rule__RegisteredClaim__Group_5__0__Impl rule__RegisteredClaim__Group_5__1 ;
    public final void rule__RegisteredClaim__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5192:1: ( rule__RegisteredClaim__Group_5__0__Impl rule__RegisteredClaim__Group_5__1 )
            // InternalSecurityDsl.g:5193:2: rule__RegisteredClaim__Group_5__0__Impl rule__RegisteredClaim__Group_5__1
            {
            pushFollow(FOLLOW_25);
            rule__RegisteredClaim__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegisteredClaim__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__Group_5__0"


    // $ANTLR start "rule__RegisteredClaim__Group_5__0__Impl"
    // InternalSecurityDsl.g:5200:1: rule__RegisteredClaim__Group_5__0__Impl : ( ',' ) ;
    public final void rule__RegisteredClaim__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5204:1: ( ( ',' ) )
            // InternalSecurityDsl.g:5205:1: ( ',' )
            {
            // InternalSecurityDsl.g:5205:1: ( ',' )
            // InternalSecurityDsl.g:5206:2: ','
            {
             before(grammarAccess.getRegisteredClaimAccess().getCommaKeyword_5_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getRegisteredClaimAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__Group_5__0__Impl"


    // $ANTLR start "rule__RegisteredClaim__Group_5__1"
    // InternalSecurityDsl.g:5215:1: rule__RegisteredClaim__Group_5__1 : rule__RegisteredClaim__Group_5__1__Impl rule__RegisteredClaim__Group_5__2 ;
    public final void rule__RegisteredClaim__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5219:1: ( rule__RegisteredClaim__Group_5__1__Impl rule__RegisteredClaim__Group_5__2 )
            // InternalSecurityDsl.g:5220:2: rule__RegisteredClaim__Group_5__1__Impl rule__RegisteredClaim__Group_5__2
            {
            pushFollow(FOLLOW_44);
            rule__RegisteredClaim__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegisteredClaim__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__Group_5__1"


    // $ANTLR start "rule__RegisteredClaim__Group_5__1__Impl"
    // InternalSecurityDsl.g:5227:1: rule__RegisteredClaim__Group_5__1__Impl : ( '{' ) ;
    public final void rule__RegisteredClaim__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5231:1: ( ( '{' ) )
            // InternalSecurityDsl.g:5232:1: ( '{' )
            {
            // InternalSecurityDsl.g:5232:1: ( '{' )
            // InternalSecurityDsl.g:5233:2: '{'
            {
             before(grammarAccess.getRegisteredClaimAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getRegisteredClaimAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__Group_5__1__Impl"


    // $ANTLR start "rule__RegisteredClaim__Group_5__2"
    // InternalSecurityDsl.g:5242:1: rule__RegisteredClaim__Group_5__2 : rule__RegisteredClaim__Group_5__2__Impl rule__RegisteredClaim__Group_5__3 ;
    public final void rule__RegisteredClaim__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5246:1: ( rule__RegisteredClaim__Group_5__2__Impl rule__RegisteredClaim__Group_5__3 )
            // InternalSecurityDsl.g:5247:2: rule__RegisteredClaim__Group_5__2__Impl rule__RegisteredClaim__Group_5__3
            {
            pushFollow(FOLLOW_46);
            rule__RegisteredClaim__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegisteredClaim__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__Group_5__2"


    // $ANTLR start "rule__RegisteredClaim__Group_5__2__Impl"
    // InternalSecurityDsl.g:5254:1: rule__RegisteredClaim__Group_5__2__Impl : ( 'REGISTERED,' ) ;
    public final void rule__RegisteredClaim__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5258:1: ( ( 'REGISTERED,' ) )
            // InternalSecurityDsl.g:5259:1: ( 'REGISTERED,' )
            {
            // InternalSecurityDsl.g:5259:1: ( 'REGISTERED,' )
            // InternalSecurityDsl.g:5260:2: 'REGISTERED,'
            {
             before(grammarAccess.getRegisteredClaimAccess().getREGISTEREDKeyword_5_2()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getRegisteredClaimAccess().getREGISTEREDKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__Group_5__2__Impl"


    // $ANTLR start "rule__RegisteredClaim__Group_5__3"
    // InternalSecurityDsl.g:5269:1: rule__RegisteredClaim__Group_5__3 : rule__RegisteredClaim__Group_5__3__Impl rule__RegisteredClaim__Group_5__4 ;
    public final void rule__RegisteredClaim__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5273:1: ( rule__RegisteredClaim__Group_5__3__Impl rule__RegisteredClaim__Group_5__4 )
            // InternalSecurityDsl.g:5274:2: rule__RegisteredClaim__Group_5__3__Impl rule__RegisteredClaim__Group_5__4
            {
            pushFollow(FOLLOW_5);
            rule__RegisteredClaim__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegisteredClaim__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__Group_5__3"


    // $ANTLR start "rule__RegisteredClaim__Group_5__3__Impl"
    // InternalSecurityDsl.g:5281:1: rule__RegisteredClaim__Group_5__3__Impl : ( 'issuer:' ) ;
    public final void rule__RegisteredClaim__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5285:1: ( ( 'issuer:' ) )
            // InternalSecurityDsl.g:5286:1: ( 'issuer:' )
            {
            // InternalSecurityDsl.g:5286:1: ( 'issuer:' )
            // InternalSecurityDsl.g:5287:2: 'issuer:'
            {
             before(grammarAccess.getRegisteredClaimAccess().getIssuerKeyword_5_3()); 
            match(input,84,FOLLOW_2); 
             after(grammarAccess.getRegisteredClaimAccess().getIssuerKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__Group_5__3__Impl"


    // $ANTLR start "rule__RegisteredClaim__Group_5__4"
    // InternalSecurityDsl.g:5296:1: rule__RegisteredClaim__Group_5__4 : rule__RegisteredClaim__Group_5__4__Impl rule__RegisteredClaim__Group_5__5 ;
    public final void rule__RegisteredClaim__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5300:1: ( rule__RegisteredClaim__Group_5__4__Impl rule__RegisteredClaim__Group_5__5 )
            // InternalSecurityDsl.g:5301:2: rule__RegisteredClaim__Group_5__4__Impl rule__RegisteredClaim__Group_5__5
            {
            pushFollow(FOLLOW_42);
            rule__RegisteredClaim__Group_5__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegisteredClaim__Group_5__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__Group_5__4"


    // $ANTLR start "rule__RegisteredClaim__Group_5__4__Impl"
    // InternalSecurityDsl.g:5308:1: rule__RegisteredClaim__Group_5__4__Impl : ( ( rule__RegisteredClaim__IssuerAssignment_5_4 ) ) ;
    public final void rule__RegisteredClaim__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5312:1: ( ( ( rule__RegisteredClaim__IssuerAssignment_5_4 ) ) )
            // InternalSecurityDsl.g:5313:1: ( ( rule__RegisteredClaim__IssuerAssignment_5_4 ) )
            {
            // InternalSecurityDsl.g:5313:1: ( ( rule__RegisteredClaim__IssuerAssignment_5_4 ) )
            // InternalSecurityDsl.g:5314:2: ( rule__RegisteredClaim__IssuerAssignment_5_4 )
            {
             before(grammarAccess.getRegisteredClaimAccess().getIssuerAssignment_5_4()); 
            // InternalSecurityDsl.g:5315:2: ( rule__RegisteredClaim__IssuerAssignment_5_4 )
            // InternalSecurityDsl.g:5315:3: rule__RegisteredClaim__IssuerAssignment_5_4
            {
            pushFollow(FOLLOW_2);
            rule__RegisteredClaim__IssuerAssignment_5_4();

            state._fsp--;


            }

             after(grammarAccess.getRegisteredClaimAccess().getIssuerAssignment_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__Group_5__4__Impl"


    // $ANTLR start "rule__RegisteredClaim__Group_5__5"
    // InternalSecurityDsl.g:5323:1: rule__RegisteredClaim__Group_5__5 : rule__RegisteredClaim__Group_5__5__Impl ;
    public final void rule__RegisteredClaim__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5327:1: ( rule__RegisteredClaim__Group_5__5__Impl )
            // InternalSecurityDsl.g:5328:2: rule__RegisteredClaim__Group_5__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegisteredClaim__Group_5__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__Group_5__5"


    // $ANTLR start "rule__RegisteredClaim__Group_5__5__Impl"
    // InternalSecurityDsl.g:5334:1: rule__RegisteredClaim__Group_5__5__Impl : ( '}' ) ;
    public final void rule__RegisteredClaim__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5338:1: ( ( '}' ) )
            // InternalSecurityDsl.g:5339:1: ( '}' )
            {
            // InternalSecurityDsl.g:5339:1: ( '}' )
            // InternalSecurityDsl.g:5340:2: '}'
            {
             before(grammarAccess.getRegisteredClaimAccess().getRightCurlyBracketKeyword_5_5()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getRegisteredClaimAccess().getRightCurlyBracketKeyword_5_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__Group_5__5__Impl"


    // $ANTLR start "rule__RegisteredClaim__Group_6__0"
    // InternalSecurityDsl.g:5350:1: rule__RegisteredClaim__Group_6__0 : rule__RegisteredClaim__Group_6__0__Impl rule__RegisteredClaim__Group_6__1 ;
    public final void rule__RegisteredClaim__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5354:1: ( rule__RegisteredClaim__Group_6__0__Impl rule__RegisteredClaim__Group_6__1 )
            // InternalSecurityDsl.g:5355:2: rule__RegisteredClaim__Group_6__0__Impl rule__RegisteredClaim__Group_6__1
            {
            pushFollow(FOLLOW_25);
            rule__RegisteredClaim__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegisteredClaim__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__Group_6__0"


    // $ANTLR start "rule__RegisteredClaim__Group_6__0__Impl"
    // InternalSecurityDsl.g:5362:1: rule__RegisteredClaim__Group_6__0__Impl : ( ',' ) ;
    public final void rule__RegisteredClaim__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5366:1: ( ( ',' ) )
            // InternalSecurityDsl.g:5367:1: ( ',' )
            {
            // InternalSecurityDsl.g:5367:1: ( ',' )
            // InternalSecurityDsl.g:5368:2: ','
            {
             before(grammarAccess.getRegisteredClaimAccess().getCommaKeyword_6_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getRegisteredClaimAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__Group_6__0__Impl"


    // $ANTLR start "rule__RegisteredClaim__Group_6__1"
    // InternalSecurityDsl.g:5377:1: rule__RegisteredClaim__Group_6__1 : rule__RegisteredClaim__Group_6__1__Impl rule__RegisteredClaim__Group_6__2 ;
    public final void rule__RegisteredClaim__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5381:1: ( rule__RegisteredClaim__Group_6__1__Impl rule__RegisteredClaim__Group_6__2 )
            // InternalSecurityDsl.g:5382:2: rule__RegisteredClaim__Group_6__1__Impl rule__RegisteredClaim__Group_6__2
            {
            pushFollow(FOLLOW_44);
            rule__RegisteredClaim__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegisteredClaim__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__Group_6__1"


    // $ANTLR start "rule__RegisteredClaim__Group_6__1__Impl"
    // InternalSecurityDsl.g:5389:1: rule__RegisteredClaim__Group_6__1__Impl : ( '{' ) ;
    public final void rule__RegisteredClaim__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5393:1: ( ( '{' ) )
            // InternalSecurityDsl.g:5394:1: ( '{' )
            {
            // InternalSecurityDsl.g:5394:1: ( '{' )
            // InternalSecurityDsl.g:5395:2: '{'
            {
             before(grammarAccess.getRegisteredClaimAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getRegisteredClaimAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__Group_6__1__Impl"


    // $ANTLR start "rule__RegisteredClaim__Group_6__2"
    // InternalSecurityDsl.g:5404:1: rule__RegisteredClaim__Group_6__2 : rule__RegisteredClaim__Group_6__2__Impl rule__RegisteredClaim__Group_6__3 ;
    public final void rule__RegisteredClaim__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5408:1: ( rule__RegisteredClaim__Group_6__2__Impl rule__RegisteredClaim__Group_6__3 )
            // InternalSecurityDsl.g:5409:2: rule__RegisteredClaim__Group_6__2__Impl rule__RegisteredClaim__Group_6__3
            {
            pushFollow(FOLLOW_47);
            rule__RegisteredClaim__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegisteredClaim__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__Group_6__2"


    // $ANTLR start "rule__RegisteredClaim__Group_6__2__Impl"
    // InternalSecurityDsl.g:5416:1: rule__RegisteredClaim__Group_6__2__Impl : ( 'REGISTERED,' ) ;
    public final void rule__RegisteredClaim__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5420:1: ( ( 'REGISTERED,' ) )
            // InternalSecurityDsl.g:5421:1: ( 'REGISTERED,' )
            {
            // InternalSecurityDsl.g:5421:1: ( 'REGISTERED,' )
            // InternalSecurityDsl.g:5422:2: 'REGISTERED,'
            {
             before(grammarAccess.getRegisteredClaimAccess().getREGISTEREDKeyword_6_2()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getRegisteredClaimAccess().getREGISTEREDKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__Group_6__2__Impl"


    // $ANTLR start "rule__RegisteredClaim__Group_6__3"
    // InternalSecurityDsl.g:5431:1: rule__RegisteredClaim__Group_6__3 : rule__RegisteredClaim__Group_6__3__Impl rule__RegisteredClaim__Group_6__4 ;
    public final void rule__RegisteredClaim__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5435:1: ( rule__RegisteredClaim__Group_6__3__Impl rule__RegisteredClaim__Group_6__4 )
            // InternalSecurityDsl.g:5436:2: rule__RegisteredClaim__Group_6__3__Impl rule__RegisteredClaim__Group_6__4
            {
            pushFollow(FOLLOW_5);
            rule__RegisteredClaim__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegisteredClaim__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__Group_6__3"


    // $ANTLR start "rule__RegisteredClaim__Group_6__3__Impl"
    // InternalSecurityDsl.g:5443:1: rule__RegisteredClaim__Group_6__3__Impl : ( 'audience:' ) ;
    public final void rule__RegisteredClaim__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5447:1: ( ( 'audience:' ) )
            // InternalSecurityDsl.g:5448:1: ( 'audience:' )
            {
            // InternalSecurityDsl.g:5448:1: ( 'audience:' )
            // InternalSecurityDsl.g:5449:2: 'audience:'
            {
             before(grammarAccess.getRegisteredClaimAccess().getAudienceKeyword_6_3()); 
            match(input,85,FOLLOW_2); 
             after(grammarAccess.getRegisteredClaimAccess().getAudienceKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__Group_6__3__Impl"


    // $ANTLR start "rule__RegisteredClaim__Group_6__4"
    // InternalSecurityDsl.g:5458:1: rule__RegisteredClaim__Group_6__4 : rule__RegisteredClaim__Group_6__4__Impl rule__RegisteredClaim__Group_6__5 ;
    public final void rule__RegisteredClaim__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5462:1: ( rule__RegisteredClaim__Group_6__4__Impl rule__RegisteredClaim__Group_6__5 )
            // InternalSecurityDsl.g:5463:2: rule__RegisteredClaim__Group_6__4__Impl rule__RegisteredClaim__Group_6__5
            {
            pushFollow(FOLLOW_42);
            rule__RegisteredClaim__Group_6__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegisteredClaim__Group_6__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__Group_6__4"


    // $ANTLR start "rule__RegisteredClaim__Group_6__4__Impl"
    // InternalSecurityDsl.g:5470:1: rule__RegisteredClaim__Group_6__4__Impl : ( ( rule__RegisteredClaim__AudienceAssignment_6_4 ) ) ;
    public final void rule__RegisteredClaim__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5474:1: ( ( ( rule__RegisteredClaim__AudienceAssignment_6_4 ) ) )
            // InternalSecurityDsl.g:5475:1: ( ( rule__RegisteredClaim__AudienceAssignment_6_4 ) )
            {
            // InternalSecurityDsl.g:5475:1: ( ( rule__RegisteredClaim__AudienceAssignment_6_4 ) )
            // InternalSecurityDsl.g:5476:2: ( rule__RegisteredClaim__AudienceAssignment_6_4 )
            {
             before(grammarAccess.getRegisteredClaimAccess().getAudienceAssignment_6_4()); 
            // InternalSecurityDsl.g:5477:2: ( rule__RegisteredClaim__AudienceAssignment_6_4 )
            // InternalSecurityDsl.g:5477:3: rule__RegisteredClaim__AudienceAssignment_6_4
            {
            pushFollow(FOLLOW_2);
            rule__RegisteredClaim__AudienceAssignment_6_4();

            state._fsp--;


            }

             after(grammarAccess.getRegisteredClaimAccess().getAudienceAssignment_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__Group_6__4__Impl"


    // $ANTLR start "rule__RegisteredClaim__Group_6__5"
    // InternalSecurityDsl.g:5485:1: rule__RegisteredClaim__Group_6__5 : rule__RegisteredClaim__Group_6__5__Impl ;
    public final void rule__RegisteredClaim__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5489:1: ( rule__RegisteredClaim__Group_6__5__Impl )
            // InternalSecurityDsl.g:5490:2: rule__RegisteredClaim__Group_6__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegisteredClaim__Group_6__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__Group_6__5"


    // $ANTLR start "rule__RegisteredClaim__Group_6__5__Impl"
    // InternalSecurityDsl.g:5496:1: rule__RegisteredClaim__Group_6__5__Impl : ( '}' ) ;
    public final void rule__RegisteredClaim__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5500:1: ( ( '}' ) )
            // InternalSecurityDsl.g:5501:1: ( '}' )
            {
            // InternalSecurityDsl.g:5501:1: ( '}' )
            // InternalSecurityDsl.g:5502:2: '}'
            {
             before(grammarAccess.getRegisteredClaimAccess().getRightCurlyBracketKeyword_6_5()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getRegisteredClaimAccess().getRightCurlyBracketKeyword_6_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__Group_6__5__Impl"


    // $ANTLR start "rule__OAuth2__Group__0"
    // InternalSecurityDsl.g:5512:1: rule__OAuth2__Group__0 : rule__OAuth2__Group__0__Impl rule__OAuth2__Group__1 ;
    public final void rule__OAuth2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5516:1: ( rule__OAuth2__Group__0__Impl rule__OAuth2__Group__1 )
            // InternalSecurityDsl.g:5517:2: rule__OAuth2__Group__0__Impl rule__OAuth2__Group__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalSecurityDsl.g:5524:1: rule__OAuth2__Group__0__Impl : ( 'OAuth2.0:' ) ;
    public final void rule__OAuth2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5528:1: ( ( 'OAuth2.0:' ) )
            // InternalSecurityDsl.g:5529:1: ( 'OAuth2.0:' )
            {
            // InternalSecurityDsl.g:5529:1: ( 'OAuth2.0:' )
            // InternalSecurityDsl.g:5530:2: 'OAuth2.0:'
            {
             before(grammarAccess.getOAuth2Access().getOAuth20Keyword_0()); 
            match(input,86,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5539:1: rule__OAuth2__Group__1 : rule__OAuth2__Group__1__Impl rule__OAuth2__Group__2 ;
    public final void rule__OAuth2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5543:1: ( rule__OAuth2__Group__1__Impl rule__OAuth2__Group__2 )
            // InternalSecurityDsl.g:5544:2: rule__OAuth2__Group__1__Impl rule__OAuth2__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalSecurityDsl.g:5551:1: rule__OAuth2__Group__1__Impl : ( 'providers:' ) ;
    public final void rule__OAuth2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5555:1: ( ( 'providers:' ) )
            // InternalSecurityDsl.g:5556:1: ( 'providers:' )
            {
            // InternalSecurityDsl.g:5556:1: ( 'providers:' )
            // InternalSecurityDsl.g:5557:2: 'providers:'
            {
             before(grammarAccess.getOAuth2Access().getProvidersKeyword_1()); 
            match(input,87,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5566:1: rule__OAuth2__Group__2 : rule__OAuth2__Group__2__Impl rule__OAuth2__Group__3 ;
    public final void rule__OAuth2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5570:1: ( rule__OAuth2__Group__2__Impl rule__OAuth2__Group__3 )
            // InternalSecurityDsl.g:5571:2: rule__OAuth2__Group__2__Impl rule__OAuth2__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalSecurityDsl.g:5578:1: rule__OAuth2__Group__2__Impl : ( '[' ) ;
    public final void rule__OAuth2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5582:1: ( ( '[' ) )
            // InternalSecurityDsl.g:5583:1: ( '[' )
            {
            // InternalSecurityDsl.g:5583:1: ( '[' )
            // InternalSecurityDsl.g:5584:2: '['
            {
             before(grammarAccess.getOAuth2Access().getLeftSquareBracketKeyword_2()); 
            match(input,65,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5593:1: rule__OAuth2__Group__3 : rule__OAuth2__Group__3__Impl rule__OAuth2__Group__4 ;
    public final void rule__OAuth2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5597:1: ( rule__OAuth2__Group__3__Impl rule__OAuth2__Group__4 )
            // InternalSecurityDsl.g:5598:2: rule__OAuth2__Group__3__Impl rule__OAuth2__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalSecurityDsl.g:5605:1: rule__OAuth2__Group__3__Impl : ( ( rule__OAuth2__ProvidersAssignment_3 ) ) ;
    public final void rule__OAuth2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5609:1: ( ( ( rule__OAuth2__ProvidersAssignment_3 ) ) )
            // InternalSecurityDsl.g:5610:1: ( ( rule__OAuth2__ProvidersAssignment_3 ) )
            {
            // InternalSecurityDsl.g:5610:1: ( ( rule__OAuth2__ProvidersAssignment_3 ) )
            // InternalSecurityDsl.g:5611:2: ( rule__OAuth2__ProvidersAssignment_3 )
            {
             before(grammarAccess.getOAuth2Access().getProvidersAssignment_3()); 
            // InternalSecurityDsl.g:5612:2: ( rule__OAuth2__ProvidersAssignment_3 )
            // InternalSecurityDsl.g:5612:3: rule__OAuth2__ProvidersAssignment_3
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
    // InternalSecurityDsl.g:5620:1: rule__OAuth2__Group__4 : rule__OAuth2__Group__4__Impl rule__OAuth2__Group__5 ;
    public final void rule__OAuth2__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5624:1: ( rule__OAuth2__Group__4__Impl rule__OAuth2__Group__5 )
            // InternalSecurityDsl.g:5625:2: rule__OAuth2__Group__4__Impl rule__OAuth2__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalSecurityDsl.g:5632:1: rule__OAuth2__Group__4__Impl : ( ( rule__OAuth2__Group_4__0 )* ) ;
    public final void rule__OAuth2__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5636:1: ( ( ( rule__OAuth2__Group_4__0 )* ) )
            // InternalSecurityDsl.g:5637:1: ( ( rule__OAuth2__Group_4__0 )* )
            {
            // InternalSecurityDsl.g:5637:1: ( ( rule__OAuth2__Group_4__0 )* )
            // InternalSecurityDsl.g:5638:2: ( rule__OAuth2__Group_4__0 )*
            {
             before(grammarAccess.getOAuth2Access().getGroup_4()); 
            // InternalSecurityDsl.g:5639:2: ( rule__OAuth2__Group_4__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==67) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalSecurityDsl.g:5639:3: rule__OAuth2__Group_4__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__OAuth2__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // InternalSecurityDsl.g:5647:1: rule__OAuth2__Group__5 : rule__OAuth2__Group__5__Impl ;
    public final void rule__OAuth2__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5651:1: ( rule__OAuth2__Group__5__Impl )
            // InternalSecurityDsl.g:5652:2: rule__OAuth2__Group__5__Impl
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
    // InternalSecurityDsl.g:5658:1: rule__OAuth2__Group__5__Impl : ( ']' ) ;
    public final void rule__OAuth2__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5662:1: ( ( ']' ) )
            // InternalSecurityDsl.g:5663:1: ( ']' )
            {
            // InternalSecurityDsl.g:5663:1: ( ']' )
            // InternalSecurityDsl.g:5664:2: ']'
            {
             before(grammarAccess.getOAuth2Access().getRightSquareBracketKeyword_5()); 
            match(input,66,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5674:1: rule__OAuth2__Group_4__0 : rule__OAuth2__Group_4__0__Impl rule__OAuth2__Group_4__1 ;
    public final void rule__OAuth2__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5678:1: ( rule__OAuth2__Group_4__0__Impl rule__OAuth2__Group_4__1 )
            // InternalSecurityDsl.g:5679:2: rule__OAuth2__Group_4__0__Impl rule__OAuth2__Group_4__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalSecurityDsl.g:5686:1: rule__OAuth2__Group_4__0__Impl : ( ',' ) ;
    public final void rule__OAuth2__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5690:1: ( ( ',' ) )
            // InternalSecurityDsl.g:5691:1: ( ',' )
            {
            // InternalSecurityDsl.g:5691:1: ( ',' )
            // InternalSecurityDsl.g:5692:2: ','
            {
             before(grammarAccess.getOAuth2Access().getCommaKeyword_4_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5701:1: rule__OAuth2__Group_4__1 : rule__OAuth2__Group_4__1__Impl ;
    public final void rule__OAuth2__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5705:1: ( rule__OAuth2__Group_4__1__Impl )
            // InternalSecurityDsl.g:5706:2: rule__OAuth2__Group_4__1__Impl
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
    // InternalSecurityDsl.g:5712:1: rule__OAuth2__Group_4__1__Impl : ( ( rule__OAuth2__ProvidersAssignment_4_1 ) ) ;
    public final void rule__OAuth2__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5716:1: ( ( ( rule__OAuth2__ProvidersAssignment_4_1 ) ) )
            // InternalSecurityDsl.g:5717:1: ( ( rule__OAuth2__ProvidersAssignment_4_1 ) )
            {
            // InternalSecurityDsl.g:5717:1: ( ( rule__OAuth2__ProvidersAssignment_4_1 ) )
            // InternalSecurityDsl.g:5718:2: ( rule__OAuth2__ProvidersAssignment_4_1 )
            {
             before(grammarAccess.getOAuth2Access().getProvidersAssignment_4_1()); 
            // InternalSecurityDsl.g:5719:2: ( rule__OAuth2__ProvidersAssignment_4_1 )
            // InternalSecurityDsl.g:5719:3: rule__OAuth2__ProvidersAssignment_4_1
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
    // InternalSecurityDsl.g:5728:1: rule__Provider__Group__0 : rule__Provider__Group__0__Impl rule__Provider__Group__1 ;
    public final void rule__Provider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5732:1: ( rule__Provider__Group__0__Impl rule__Provider__Group__1 )
            // InternalSecurityDsl.g:5733:2: rule__Provider__Group__0__Impl rule__Provider__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSecurityDsl.g:5740:1: rule__Provider__Group__0__Impl : ( '{' ) ;
    public final void rule__Provider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5744:1: ( ( '{' ) )
            // InternalSecurityDsl.g:5745:1: ( '{' )
            {
            // InternalSecurityDsl.g:5745:1: ( '{' )
            // InternalSecurityDsl.g:5746:2: '{'
            {
             before(grammarAccess.getProviderAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5755:1: rule__Provider__Group__1 : rule__Provider__Group__1__Impl rule__Provider__Group__2 ;
    public final void rule__Provider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5759:1: ( rule__Provider__Group__1__Impl rule__Provider__Group__2 )
            // InternalSecurityDsl.g:5760:2: rule__Provider__Group__1__Impl rule__Provider__Group__2
            {
            pushFollow(FOLLOW_49);
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
    // InternalSecurityDsl.g:5767:1: rule__Provider__Group__1__Impl : ( 'name:' ) ;
    public final void rule__Provider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5771:1: ( ( 'name:' ) )
            // InternalSecurityDsl.g:5772:1: ( 'name:' )
            {
            // InternalSecurityDsl.g:5772:1: ( 'name:' )
            // InternalSecurityDsl.g:5773:2: 'name:'
            {
             before(grammarAccess.getProviderAccess().getNameKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5782:1: rule__Provider__Group__2 : rule__Provider__Group__2__Impl rule__Provider__Group__3 ;
    public final void rule__Provider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5786:1: ( rule__Provider__Group__2__Impl rule__Provider__Group__3 )
            // InternalSecurityDsl.g:5787:2: rule__Provider__Group__2__Impl rule__Provider__Group__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalSecurityDsl.g:5794:1: rule__Provider__Group__2__Impl : ( ( rule__Provider__NameAssignment_2 ) ) ;
    public final void rule__Provider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5798:1: ( ( ( rule__Provider__NameAssignment_2 ) ) )
            // InternalSecurityDsl.g:5799:1: ( ( rule__Provider__NameAssignment_2 ) )
            {
            // InternalSecurityDsl.g:5799:1: ( ( rule__Provider__NameAssignment_2 ) )
            // InternalSecurityDsl.g:5800:2: ( rule__Provider__NameAssignment_2 )
            {
             before(grammarAccess.getProviderAccess().getNameAssignment_2()); 
            // InternalSecurityDsl.g:5801:2: ( rule__Provider__NameAssignment_2 )
            // InternalSecurityDsl.g:5801:3: rule__Provider__NameAssignment_2
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
    // InternalSecurityDsl.g:5809:1: rule__Provider__Group__3 : rule__Provider__Group__3__Impl rule__Provider__Group__4 ;
    public final void rule__Provider__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5813:1: ( rule__Provider__Group__3__Impl rule__Provider__Group__4 )
            // InternalSecurityDsl.g:5814:2: rule__Provider__Group__3__Impl rule__Provider__Group__4
            {
            pushFollow(FOLLOW_50);
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
    // InternalSecurityDsl.g:5821:1: rule__Provider__Group__3__Impl : ( ',' ) ;
    public final void rule__Provider__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5825:1: ( ( ',' ) )
            // InternalSecurityDsl.g:5826:1: ( ',' )
            {
            // InternalSecurityDsl.g:5826:1: ( ',' )
            // InternalSecurityDsl.g:5827:2: ','
            {
             before(grammarAccess.getProviderAccess().getCommaKeyword_3()); 
            match(input,67,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5836:1: rule__Provider__Group__4 : rule__Provider__Group__4__Impl rule__Provider__Group__5 ;
    public final void rule__Provider__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5840:1: ( rule__Provider__Group__4__Impl rule__Provider__Group__5 )
            // InternalSecurityDsl.g:5841:2: rule__Provider__Group__4__Impl rule__Provider__Group__5
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
    // InternalSecurityDsl.g:5848:1: rule__Provider__Group__4__Impl : ( 'clientId:' ) ;
    public final void rule__Provider__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5852:1: ( ( 'clientId:' ) )
            // InternalSecurityDsl.g:5853:1: ( 'clientId:' )
            {
            // InternalSecurityDsl.g:5853:1: ( 'clientId:' )
            // InternalSecurityDsl.g:5854:2: 'clientId:'
            {
             before(grammarAccess.getProviderAccess().getClientIdKeyword_4()); 
            match(input,88,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5863:1: rule__Provider__Group__5 : rule__Provider__Group__5__Impl rule__Provider__Group__6 ;
    public final void rule__Provider__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5867:1: ( rule__Provider__Group__5__Impl rule__Provider__Group__6 )
            // InternalSecurityDsl.g:5868:2: rule__Provider__Group__5__Impl rule__Provider__Group__6
            {
            pushFollow(FOLLOW_43);
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
    // InternalSecurityDsl.g:5875:1: rule__Provider__Group__5__Impl : ( ( rule__Provider__ClientIdAssignment_5 ) ) ;
    public final void rule__Provider__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5879:1: ( ( ( rule__Provider__ClientIdAssignment_5 ) ) )
            // InternalSecurityDsl.g:5880:1: ( ( rule__Provider__ClientIdAssignment_5 ) )
            {
            // InternalSecurityDsl.g:5880:1: ( ( rule__Provider__ClientIdAssignment_5 ) )
            // InternalSecurityDsl.g:5881:2: ( rule__Provider__ClientIdAssignment_5 )
            {
             before(grammarAccess.getProviderAccess().getClientIdAssignment_5()); 
            // InternalSecurityDsl.g:5882:2: ( rule__Provider__ClientIdAssignment_5 )
            // InternalSecurityDsl.g:5882:3: rule__Provider__ClientIdAssignment_5
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
    // InternalSecurityDsl.g:5890:1: rule__Provider__Group__6 : rule__Provider__Group__6__Impl rule__Provider__Group__7 ;
    public final void rule__Provider__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5894:1: ( rule__Provider__Group__6__Impl rule__Provider__Group__7 )
            // InternalSecurityDsl.g:5895:2: rule__Provider__Group__6__Impl rule__Provider__Group__7
            {
            pushFollow(FOLLOW_51);
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
    // InternalSecurityDsl.g:5902:1: rule__Provider__Group__6__Impl : ( ',' ) ;
    public final void rule__Provider__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5906:1: ( ( ',' ) )
            // InternalSecurityDsl.g:5907:1: ( ',' )
            {
            // InternalSecurityDsl.g:5907:1: ( ',' )
            // InternalSecurityDsl.g:5908:2: ','
            {
             before(grammarAccess.getProviderAccess().getCommaKeyword_6()); 
            match(input,67,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5917:1: rule__Provider__Group__7 : rule__Provider__Group__7__Impl rule__Provider__Group__8 ;
    public final void rule__Provider__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5921:1: ( rule__Provider__Group__7__Impl rule__Provider__Group__8 )
            // InternalSecurityDsl.g:5922:2: rule__Provider__Group__7__Impl rule__Provider__Group__8
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
    // InternalSecurityDsl.g:5929:1: rule__Provider__Group__7__Impl : ( 'clientSecret:' ) ;
    public final void rule__Provider__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5933:1: ( ( 'clientSecret:' ) )
            // InternalSecurityDsl.g:5934:1: ( 'clientSecret:' )
            {
            // InternalSecurityDsl.g:5934:1: ( 'clientSecret:' )
            // InternalSecurityDsl.g:5935:2: 'clientSecret:'
            {
             before(grammarAccess.getProviderAccess().getClientSecretKeyword_7()); 
            match(input,89,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5944:1: rule__Provider__Group__8 : rule__Provider__Group__8__Impl rule__Provider__Group__9 ;
    public final void rule__Provider__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5948:1: ( rule__Provider__Group__8__Impl rule__Provider__Group__9 )
            // InternalSecurityDsl.g:5949:2: rule__Provider__Group__8__Impl rule__Provider__Group__9
            {
            pushFollow(FOLLOW_52);
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
    // InternalSecurityDsl.g:5956:1: rule__Provider__Group__8__Impl : ( ( rule__Provider__ClientSecretAssignment_8 ) ) ;
    public final void rule__Provider__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5960:1: ( ( ( rule__Provider__ClientSecretAssignment_8 ) ) )
            // InternalSecurityDsl.g:5961:1: ( ( rule__Provider__ClientSecretAssignment_8 ) )
            {
            // InternalSecurityDsl.g:5961:1: ( ( rule__Provider__ClientSecretAssignment_8 ) )
            // InternalSecurityDsl.g:5962:2: ( rule__Provider__ClientSecretAssignment_8 )
            {
             before(grammarAccess.getProviderAccess().getClientSecretAssignment_8()); 
            // InternalSecurityDsl.g:5963:2: ( rule__Provider__ClientSecretAssignment_8 )
            // InternalSecurityDsl.g:5963:3: rule__Provider__ClientSecretAssignment_8
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
    // InternalSecurityDsl.g:5971:1: rule__Provider__Group__9 : rule__Provider__Group__9__Impl rule__Provider__Group__10 ;
    public final void rule__Provider__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5975:1: ( rule__Provider__Group__9__Impl rule__Provider__Group__10 )
            // InternalSecurityDsl.g:5976:2: rule__Provider__Group__9__Impl rule__Provider__Group__10
            {
            pushFollow(FOLLOW_52);
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
    // InternalSecurityDsl.g:5983:1: rule__Provider__Group__9__Impl : ( ( rule__Provider__Group_9__0 )? ) ;
    public final void rule__Provider__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5987:1: ( ( ( rule__Provider__Group_9__0 )? ) )
            // InternalSecurityDsl.g:5988:1: ( ( rule__Provider__Group_9__0 )? )
            {
            // InternalSecurityDsl.g:5988:1: ( ( rule__Provider__Group_9__0 )? )
            // InternalSecurityDsl.g:5989:2: ( rule__Provider__Group_9__0 )?
            {
             before(grammarAccess.getProviderAccess().getGroup_9()); 
            // InternalSecurityDsl.g:5990:2: ( rule__Provider__Group_9__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==67) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSecurityDsl.g:5990:3: rule__Provider__Group_9__0
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
    // InternalSecurityDsl.g:5998:1: rule__Provider__Group__10 : rule__Provider__Group__10__Impl ;
    public final void rule__Provider__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6002:1: ( rule__Provider__Group__10__Impl )
            // InternalSecurityDsl.g:6003:2: rule__Provider__Group__10__Impl
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
    // InternalSecurityDsl.g:6009:1: rule__Provider__Group__10__Impl : ( '}' ) ;
    public final void rule__Provider__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6013:1: ( ( '}' ) )
            // InternalSecurityDsl.g:6014:1: ( '}' )
            {
            // InternalSecurityDsl.g:6014:1: ( '}' )
            // InternalSecurityDsl.g:6015:2: '}'
            {
             before(grammarAccess.getProviderAccess().getRightCurlyBracketKeyword_10()); 
            match(input,61,FOLLOW_2); 
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
    // InternalSecurityDsl.g:6025:1: rule__Provider__Group_9__0 : rule__Provider__Group_9__0__Impl rule__Provider__Group_9__1 ;
    public final void rule__Provider__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6029:1: ( rule__Provider__Group_9__0__Impl rule__Provider__Group_9__1 )
            // InternalSecurityDsl.g:6030:2: rule__Provider__Group_9__0__Impl rule__Provider__Group_9__1
            {
            pushFollow(FOLLOW_53);
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
    // InternalSecurityDsl.g:6037:1: rule__Provider__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Provider__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6041:1: ( ( ',' ) )
            // InternalSecurityDsl.g:6042:1: ( ',' )
            {
            // InternalSecurityDsl.g:6042:1: ( ',' )
            // InternalSecurityDsl.g:6043:2: ','
            {
             before(grammarAccess.getProviderAccess().getCommaKeyword_9_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalSecurityDsl.g:6052:1: rule__Provider__Group_9__1 : rule__Provider__Group_9__1__Impl rule__Provider__Group_9__2 ;
    public final void rule__Provider__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6056:1: ( rule__Provider__Group_9__1__Impl rule__Provider__Group_9__2 )
            // InternalSecurityDsl.g:6057:2: rule__Provider__Group_9__1__Impl rule__Provider__Group_9__2
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
    // InternalSecurityDsl.g:6064:1: rule__Provider__Group_9__1__Impl : ( 'redirectUri:' ) ;
    public final void rule__Provider__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6068:1: ( ( 'redirectUri:' ) )
            // InternalSecurityDsl.g:6069:1: ( 'redirectUri:' )
            {
            // InternalSecurityDsl.g:6069:1: ( 'redirectUri:' )
            // InternalSecurityDsl.g:6070:2: 'redirectUri:'
            {
             before(grammarAccess.getProviderAccess().getRedirectUriKeyword_9_1()); 
            match(input,90,FOLLOW_2); 
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
    // InternalSecurityDsl.g:6079:1: rule__Provider__Group_9__2 : rule__Provider__Group_9__2__Impl ;
    public final void rule__Provider__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6083:1: ( rule__Provider__Group_9__2__Impl )
            // InternalSecurityDsl.g:6084:2: rule__Provider__Group_9__2__Impl
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
    // InternalSecurityDsl.g:6090:1: rule__Provider__Group_9__2__Impl : ( ( rule__Provider__RedirectUriAssignment_9_2 ) ) ;
    public final void rule__Provider__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6094:1: ( ( ( rule__Provider__RedirectUriAssignment_9_2 ) ) )
            // InternalSecurityDsl.g:6095:1: ( ( rule__Provider__RedirectUriAssignment_9_2 ) )
            {
            // InternalSecurityDsl.g:6095:1: ( ( rule__Provider__RedirectUriAssignment_9_2 ) )
            // InternalSecurityDsl.g:6096:2: ( rule__Provider__RedirectUriAssignment_9_2 )
            {
             before(grammarAccess.getProviderAccess().getRedirectUriAssignment_9_2()); 
            // InternalSecurityDsl.g:6097:2: ( rule__Provider__RedirectUriAssignment_9_2 )
            // InternalSecurityDsl.g:6097:3: rule__Provider__RedirectUriAssignment_9_2
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
    // InternalSecurityDsl.g:6106:1: rule__BasicAuthentication__Group__0 : rule__BasicAuthentication__Group__0__Impl rule__BasicAuthentication__Group__1 ;
    public final void rule__BasicAuthentication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6110:1: ( rule__BasicAuthentication__Group__0__Impl rule__BasicAuthentication__Group__1 )
            // InternalSecurityDsl.g:6111:2: rule__BasicAuthentication__Group__0__Impl rule__BasicAuthentication__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSecurityDsl.g:6118:1: rule__BasicAuthentication__Group__0__Impl : ( () ) ;
    public final void rule__BasicAuthentication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6122:1: ( ( () ) )
            // InternalSecurityDsl.g:6123:1: ( () )
            {
            // InternalSecurityDsl.g:6123:1: ( () )
            // InternalSecurityDsl.g:6124:2: ()
            {
             before(grammarAccess.getBasicAuthenticationAccess().getBasicAuthenticationAction_0()); 
            // InternalSecurityDsl.g:6125:2: ()
            // InternalSecurityDsl.g:6125:3: 
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
    // InternalSecurityDsl.g:6133:1: rule__BasicAuthentication__Group__1 : rule__BasicAuthentication__Group__1__Impl ;
    public final void rule__BasicAuthentication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6137:1: ( rule__BasicAuthentication__Group__1__Impl )
            // InternalSecurityDsl.g:6138:2: rule__BasicAuthentication__Group__1__Impl
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
    // InternalSecurityDsl.g:6144:1: rule__BasicAuthentication__Group__1__Impl : ( 'basicAuthentication' ) ;
    public final void rule__BasicAuthentication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6148:1: ( ( 'basicAuthentication' ) )
            // InternalSecurityDsl.g:6149:1: ( 'basicAuthentication' )
            {
            // InternalSecurityDsl.g:6149:1: ( 'basicAuthentication' )
            // InternalSecurityDsl.g:6150:2: 'basicAuthentication'
            {
             before(grammarAccess.getBasicAuthenticationAccess().getBasicAuthenticationKeyword_1()); 
            match(input,91,FOLLOW_2); 
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
    // InternalSecurityDsl.g:6160:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6164:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalSecurityDsl.g:6165:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSecurityDsl.g:6172:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6176:1: ( ( ( '-' )? ) )
            // InternalSecurityDsl.g:6177:1: ( ( '-' )? )
            {
            // InternalSecurityDsl.g:6177:1: ( ( '-' )? )
            // InternalSecurityDsl.g:6178:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalSecurityDsl.g:6179:2: ( '-' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==58) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalSecurityDsl.g:6179:3: '-'
                    {
                    match(input,58,FOLLOW_2); 

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
    // InternalSecurityDsl.g:6187:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6191:1: ( rule__EInt__Group__1__Impl )
            // InternalSecurityDsl.g:6192:2: rule__EInt__Group__1__Impl
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
    // InternalSecurityDsl.g:6198:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6202:1: ( ( RULE_INT ) )
            // InternalSecurityDsl.g:6203:1: ( RULE_INT )
            {
            // InternalSecurityDsl.g:6203:1: ( RULE_INT )
            // InternalSecurityDsl.g:6204:2: RULE_INT
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


    // $ANTLR start "rule__Application__ArtifactAssignment_3"
    // InternalSecurityDsl.g:6214:1: rule__Application__ArtifactAssignment_3 : ( ruleEString ) ;
    public final void rule__Application__ArtifactAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6218:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6219:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6219:2: ( ruleEString )
            // InternalSecurityDsl.g:6220:3: ruleEString
            {
             before(grammarAccess.getApplicationAccess().getArtifactEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getArtifactEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__ArtifactAssignment_3"


    // $ANTLR start "rule__Application__NameAssignment_4_1"
    // InternalSecurityDsl.g:6229:1: rule__Application__NameAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Application__NameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6233:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6234:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6234:2: ( ruleEString )
            // InternalSecurityDsl.g:6235:3: ruleEString
            {
             before(grammarAccess.getApplicationAccess().getNameEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getNameEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__NameAssignment_4_1"


    // $ANTLR start "rule__Application__GroupAssignment_6"
    // InternalSecurityDsl.g:6244:1: rule__Application__GroupAssignment_6 : ( ruleEString ) ;
    public final void rule__Application__GroupAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6248:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6249:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6249:2: ( ruleEString )
            // InternalSecurityDsl.g:6250:3: ruleEString
            {
             before(grammarAccess.getApplicationAccess().getGroupEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getGroupEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__GroupAssignment_6"


    // $ANTLR start "rule__Application__PackageNameAssignment_7_1"
    // InternalSecurityDsl.g:6259:1: rule__Application__PackageNameAssignment_7_1 : ( ruleEString ) ;
    public final void rule__Application__PackageNameAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6263:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6264:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6264:2: ( ruleEString )
            // InternalSecurityDsl.g:6265:3: ruleEString
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


    // $ANTLR start "rule__Application__DescriptionAssignment_8_1"
    // InternalSecurityDsl.g:6274:1: rule__Application__DescriptionAssignment_8_1 : ( ruleEString ) ;
    public final void rule__Application__DescriptionAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6278:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6279:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6279:2: ( ruleEString )
            // InternalSecurityDsl.g:6280:3: ruleEString
            {
             before(grammarAccess.getApplicationAccess().getDescriptionEStringParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getDescriptionEStringParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__DescriptionAssignment_8_1"


    // $ANTLR start "rule__Application__PortAssignment_9_1"
    // InternalSecurityDsl.g:6289:1: rule__Application__PortAssignment_9_1 : ( ruleELongObject ) ;
    public final void rule__Application__PortAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6293:1: ( ( ruleELongObject ) )
            // InternalSecurityDsl.g:6294:2: ( ruleELongObject )
            {
            // InternalSecurityDsl.g:6294:2: ( ruleELongObject )
            // InternalSecurityDsl.g:6295:3: ruleELongObject
            {
             before(grammarAccess.getApplicationAccess().getPortELongObjectParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleELongObject();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getPortELongObjectParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__PortAssignment_9_1"


    // $ANTLR start "rule__Application__HostnameAssignment_10_1"
    // InternalSecurityDsl.g:6304:1: rule__Application__HostnameAssignment_10_1 : ( ruleEString ) ;
    public final void rule__Application__HostnameAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6308:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6309:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6309:2: ( ruleEString )
            // InternalSecurityDsl.g:6310:3: ruleEString
            {
             before(grammarAccess.getApplicationAccess().getHostnameEStringParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getHostnameEStringParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__HostnameAssignment_10_1"


    // $ANTLR start "rule__Application__App_databaseAssignment_11_1"
    // InternalSecurityDsl.g:6319:1: rule__Application__App_databaseAssignment_11_1 : ( ruleDatabase ) ;
    public final void rule__Application__App_databaseAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6323:1: ( ( ruleDatabase ) )
            // InternalSecurityDsl.g:6324:2: ( ruleDatabase )
            {
            // InternalSecurityDsl.g:6324:2: ( ruleDatabase )
            // InternalSecurityDsl.g:6325:3: ruleDatabase
            {
             before(grammarAccess.getApplicationAccess().getApp_databaseDatabaseParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDatabase();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getApp_databaseDatabaseParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__App_databaseAssignment_11_1"


    // $ANTLR start "rule__Application__App_entitiesAssignment_12_1_1"
    // InternalSecurityDsl.g:6334:1: rule__Application__App_entitiesAssignment_12_1_1 : ( ruleUser ) ;
    public final void rule__Application__App_entitiesAssignment_12_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6338:1: ( ( ruleUser ) )
            // InternalSecurityDsl.g:6339:2: ( ruleUser )
            {
            // InternalSecurityDsl.g:6339:2: ( ruleUser )
            // InternalSecurityDsl.g:6340:3: ruleUser
            {
             before(grammarAccess.getApplicationAccess().getApp_entitiesUserParserRuleCall_12_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUser();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getApp_entitiesUserParserRuleCall_12_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__App_entitiesAssignment_12_1_1"


    // $ANTLR start "rule__Application__App_entitiesAssignment_12_2_1"
    // InternalSecurityDsl.g:6349:1: rule__Application__App_entitiesAssignment_12_2_1 : ( ruleRole ) ;
    public final void rule__Application__App_entitiesAssignment_12_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6353:1: ( ( ruleRole ) )
            // InternalSecurityDsl.g:6354:2: ( ruleRole )
            {
            // InternalSecurityDsl.g:6354:2: ( ruleRole )
            // InternalSecurityDsl.g:6355:3: ruleRole
            {
             before(grammarAccess.getApplicationAccess().getApp_entitiesRoleParserRuleCall_12_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getApp_entitiesRoleParserRuleCall_12_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__App_entitiesAssignment_12_2_1"


    // $ANTLR start "rule__Application__App_securityAssignment_13_1"
    // InternalSecurityDsl.g:6364:1: rule__Application__App_securityAssignment_13_1 : ( ruleSecurity ) ;
    public final void rule__Application__App_securityAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6368:1: ( ( ruleSecurity ) )
            // InternalSecurityDsl.g:6369:2: ( ruleSecurity )
            {
            // InternalSecurityDsl.g:6369:2: ( ruleSecurity )
            // InternalSecurityDsl.g:6370:3: ruleSecurity
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


    // $ANTLR start "rule__Application__App_controllersAssignment_14_1_1"
    // InternalSecurityDsl.g:6379:1: rule__Application__App_controllersAssignment_14_1_1 : ( ruleAuthentication ) ;
    public final void rule__Application__App_controllersAssignment_14_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6383:1: ( ( ruleAuthentication ) )
            // InternalSecurityDsl.g:6384:2: ( ruleAuthentication )
            {
            // InternalSecurityDsl.g:6384:2: ( ruleAuthentication )
            // InternalSecurityDsl.g:6385:3: ruleAuthentication
            {
             before(grammarAccess.getApplicationAccess().getApp_controllersAuthenticationParserRuleCall_14_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAuthentication();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getApp_controllersAuthenticationParserRuleCall_14_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__App_controllersAssignment_14_1_1"


    // $ANTLR start "rule__Database__VendorNameAssignment_1"
    // InternalSecurityDsl.g:6394:1: rule__Database__VendorNameAssignment_1 : ( ruleEDatabaseType ) ;
    public final void rule__Database__VendorNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6398:1: ( ( ruleEDatabaseType ) )
            // InternalSecurityDsl.g:6399:2: ( ruleEDatabaseType )
            {
            // InternalSecurityDsl.g:6399:2: ( ruleEDatabaseType )
            // InternalSecurityDsl.g:6400:3: ruleEDatabaseType
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
    // InternalSecurityDsl.g:6409:1: rule__Database__UrlAssignment_3 : ( ruleEString ) ;
    public final void rule__Database__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6413:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6414:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6414:2: ( ruleEString )
            // InternalSecurityDsl.g:6415:3: ruleEString
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
    // InternalSecurityDsl.g:6424:1: rule__Database__UsernameAssignment_5 : ( ruleEString ) ;
    public final void rule__Database__UsernameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6428:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6429:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6429:2: ( ruleEString )
            // InternalSecurityDsl.g:6430:3: ruleEString
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
    // InternalSecurityDsl.g:6439:1: rule__Database__PasswordAssignment_7 : ( ruleEString ) ;
    public final void rule__Database__PasswordAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6443:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6444:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6444:2: ( ruleEString )
            // InternalSecurityDsl.g:6445:3: ruleEString
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
    // InternalSecurityDsl.g:6454:1: rule__Attribute__IdentifierAssignment_1 : ( ( 'identifier' ) ) ;
    public final void rule__Attribute__IdentifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6458:1: ( ( ( 'identifier' ) ) )
            // InternalSecurityDsl.g:6459:2: ( ( 'identifier' ) )
            {
            // InternalSecurityDsl.g:6459:2: ( ( 'identifier' ) )
            // InternalSecurityDsl.g:6460:3: ( 'identifier' )
            {
             before(grammarAccess.getAttributeAccess().getIdentifierIdentifierKeyword_1_0()); 
            // InternalSecurityDsl.g:6461:3: ( 'identifier' )
            // InternalSecurityDsl.g:6462:4: 'identifier'
            {
             before(grammarAccess.getAttributeAccess().getIdentifierIdentifierKeyword_1_0()); 
            match(input,92,FOLLOW_2); 
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
    // InternalSecurityDsl.g:6473:1: rule__Attribute__CredentialAssignment_2 : ( ( 'credential' ) ) ;
    public final void rule__Attribute__CredentialAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6477:1: ( ( ( 'credential' ) ) )
            // InternalSecurityDsl.g:6478:2: ( ( 'credential' ) )
            {
            // InternalSecurityDsl.g:6478:2: ( ( 'credential' ) )
            // InternalSecurityDsl.g:6479:3: ( 'credential' )
            {
             before(grammarAccess.getAttributeAccess().getCredentialCredentialKeyword_2_0()); 
            // InternalSecurityDsl.g:6480:3: ( 'credential' )
            // InternalSecurityDsl.g:6481:4: 'credential'
            {
             before(grammarAccess.getAttributeAccess().getCredentialCredentialKeyword_2_0()); 
            match(input,93,FOLLOW_2); 
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
    // InternalSecurityDsl.g:6492:1: rule__Attribute__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6496:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6497:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6497:2: ( ruleEString )
            // InternalSecurityDsl.g:6498:3: ruleEString
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
    // InternalSecurityDsl.g:6507:1: rule__Attribute__TypeAssignment_6 : ( ruleEType ) ;
    public final void rule__Attribute__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6511:1: ( ( ruleEType ) )
            // InternalSecurityDsl.g:6512:2: ( ruleEType )
            {
            // InternalSecurityDsl.g:6512:2: ( ruleEType )
            // InternalSecurityDsl.g:6513:3: ruleEType
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
    // InternalSecurityDsl.g:6522:1: rule__Attribute__CollumnNameAssignment_7_1 : ( ruleEString ) ;
    public final void rule__Attribute__CollumnNameAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6526:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6527:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6527:2: ( ruleEString )
            // InternalSecurityDsl.g:6528:3: ruleEString
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
    // InternalSecurityDsl.g:6537:1: rule__Role__TableNameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__Role__TableNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6541:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6542:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6542:2: ( ruleEString )
            // InternalSecurityDsl.g:6543:3: ruleEString
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


    // $ANTLR start "rule__Role__Entity_attributesAssignment_2_2"
    // InternalSecurityDsl.g:6552:1: rule__Role__Entity_attributesAssignment_2_2 : ( ruleAttribute ) ;
    public final void rule__Role__Entity_attributesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6556:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:6557:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:6557:2: ( ruleAttribute )
            // InternalSecurityDsl.g:6558:3: ruleAttribute
            {
             before(grammarAccess.getRoleAccess().getEntity_attributesAttributeParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getEntity_attributesAttributeParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Entity_attributesAssignment_2_2"


    // $ANTLR start "rule__Role__Entity_attributesAssignment_2_3_1"
    // InternalSecurityDsl.g:6567:1: rule__Role__Entity_attributesAssignment_2_3_1 : ( ruleAttribute ) ;
    public final void rule__Role__Entity_attributesAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6571:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:6572:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:6572:2: ( ruleAttribute )
            // InternalSecurityDsl.g:6573:3: ruleAttribute
            {
             before(grammarAccess.getRoleAccess().getEntity_attributesAttributeParserRuleCall_2_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getEntity_attributesAttributeParserRuleCall_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Entity_attributesAssignment_2_3_1"


    // $ANTLR start "rule__Role__Role_instancesAssignment_3_2"
    // InternalSecurityDsl.g:6582:1: rule__Role__Role_instancesAssignment_3_2 : ( ruleRoleInstance ) ;
    public final void rule__Role__Role_instancesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6586:1: ( ( ruleRoleInstance ) )
            // InternalSecurityDsl.g:6587:2: ( ruleRoleInstance )
            {
            // InternalSecurityDsl.g:6587:2: ( ruleRoleInstance )
            // InternalSecurityDsl.g:6588:3: ruleRoleInstance
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
    // InternalSecurityDsl.g:6597:1: rule__Role__Role_instancesAssignment_3_3_1 : ( ruleRoleInstance ) ;
    public final void rule__Role__Role_instancesAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6601:1: ( ( ruleRoleInstance ) )
            // InternalSecurityDsl.g:6602:2: ( ruleRoleInstance )
            {
            // InternalSecurityDsl.g:6602:2: ( ruleRoleInstance )
            // InternalSecurityDsl.g:6603:3: ruleRoleInstance
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
    // InternalSecurityDsl.g:6612:1: rule__User__TableNameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__User__TableNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6616:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6617:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6617:2: ( ruleEString )
            // InternalSecurityDsl.g:6618:3: ruleEString
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


    // $ANTLR start "rule__User__Entity_attributesAssignment_2_2"
    // InternalSecurityDsl.g:6627:1: rule__User__Entity_attributesAssignment_2_2 : ( ruleAttribute ) ;
    public final void rule__User__Entity_attributesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6631:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:6632:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:6632:2: ( ruleAttribute )
            // InternalSecurityDsl.g:6633:3: ruleAttribute
            {
             before(grammarAccess.getUserAccess().getEntity_attributesAttributeParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getUserAccess().getEntity_attributesAttributeParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Entity_attributesAssignment_2_2"


    // $ANTLR start "rule__User__Entity_attributesAssignment_2_3_1"
    // InternalSecurityDsl.g:6642:1: rule__User__Entity_attributesAssignment_2_3_1 : ( ruleAttribute ) ;
    public final void rule__User__Entity_attributesAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6646:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:6647:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:6647:2: ( ruleAttribute )
            // InternalSecurityDsl.g:6648:3: ruleAttribute
            {
             before(grammarAccess.getUserAccess().getEntity_attributesAttributeParserRuleCall_2_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getUserAccess().getEntity_attributesAttributeParserRuleCall_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Entity_attributesAssignment_2_3_1"


    // $ANTLR start "rule__RoleInstance__ClientAssignment_1"
    // InternalSecurityDsl.g:6657:1: rule__RoleInstance__ClientAssignment_1 : ( ( 'client' ) ) ;
    public final void rule__RoleInstance__ClientAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6661:1: ( ( ( 'client' ) ) )
            // InternalSecurityDsl.g:6662:2: ( ( 'client' ) )
            {
            // InternalSecurityDsl.g:6662:2: ( ( 'client' ) )
            // InternalSecurityDsl.g:6663:3: ( 'client' )
            {
             before(grammarAccess.getRoleInstanceAccess().getClientClientKeyword_1_0()); 
            // InternalSecurityDsl.g:6664:3: ( 'client' )
            // InternalSecurityDsl.g:6665:4: 'client'
            {
             before(grammarAccess.getRoleInstanceAccess().getClientClientKeyword_1_0()); 
            match(input,94,FOLLOW_2); 
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
    // InternalSecurityDsl.g:6676:1: rule__RoleInstance__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RoleInstance__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6680:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6681:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6681:2: ( ruleEString )
            // InternalSecurityDsl.g:6682:3: ruleEString
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


    // $ANTLR start "rule__Endpoint__TypeAssignment_2"
    // InternalSecurityDsl.g:6691:1: rule__Endpoint__TypeAssignment_2 : ( ruleEEndpointType ) ;
    public final void rule__Endpoint__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6695:1: ( ( ruleEEndpointType ) )
            // InternalSecurityDsl.g:6696:2: ( ruleEEndpointType )
            {
            // InternalSecurityDsl.g:6696:2: ( ruleEEndpointType )
            // InternalSecurityDsl.g:6697:3: ruleEEndpointType
            {
             before(grammarAccess.getEndpointAccess().getTypeEEndpointTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEEndpointType();

            state._fsp--;

             after(grammarAccess.getEndpointAccess().getTypeEEndpointTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__TypeAssignment_2"


    // $ANTLR start "rule__Endpoint__UrlAssignment_4"
    // InternalSecurityDsl.g:6706:1: rule__Endpoint__UrlAssignment_4 : ( ruleEString ) ;
    public final void rule__Endpoint__UrlAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6710:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6711:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6711:2: ( ruleEString )
            // InternalSecurityDsl.g:6712:3: ruleEString
            {
             before(grammarAccess.getEndpointAccess().getUrlEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEndpointAccess().getUrlEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__UrlAssignment_4"


    // $ANTLR start "rule__Endpoint__MethodNameAssignment_5_1"
    // InternalSecurityDsl.g:6721:1: rule__Endpoint__MethodNameAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Endpoint__MethodNameAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6725:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6726:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6726:2: ( ruleEString )
            // InternalSecurityDsl.g:6727:3: ruleEString
            {
             before(grammarAccess.getEndpointAccess().getMethodNameEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEndpointAccess().getMethodNameEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__MethodNameAssignment_5_1"


    // $ANTLR start "rule__Endpoint__MethodAssignment_6_1"
    // InternalSecurityDsl.g:6736:1: rule__Endpoint__MethodAssignment_6_1 : ( ruleEEndpointMethod ) ;
    public final void rule__Endpoint__MethodAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6740:1: ( ( ruleEEndpointMethod ) )
            // InternalSecurityDsl.g:6741:2: ( ruleEEndpointMethod )
            {
            // InternalSecurityDsl.g:6741:2: ( ruleEEndpointMethod )
            // InternalSecurityDsl.g:6742:3: ruleEEndpointMethod
            {
             before(grammarAccess.getEndpointAccess().getMethodEEndpointMethodEnumRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEEndpointMethod();

            state._fsp--;

             after(grammarAccess.getEndpointAccess().getMethodEEndpointMethodEnumRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__MethodAssignment_6_1"


    // $ANTLR start "rule__Endpoint__Role_authoritiesAssignment_7_2"
    // InternalSecurityDsl.g:6751:1: rule__Endpoint__Role_authoritiesAssignment_7_2 : ( ( ruleEString ) ) ;
    public final void rule__Endpoint__Role_authoritiesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6755:1: ( ( ( ruleEString ) ) )
            // InternalSecurityDsl.g:6756:2: ( ( ruleEString ) )
            {
            // InternalSecurityDsl.g:6756:2: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6757:3: ( ruleEString )
            {
             before(grammarAccess.getEndpointAccess().getRole_authoritiesRoleInstanceCrossReference_7_2_0()); 
            // InternalSecurityDsl.g:6758:3: ( ruleEString )
            // InternalSecurityDsl.g:6759:4: ruleEString
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
    // InternalSecurityDsl.g:6770:1: rule__Endpoint__Role_authoritiesAssignment_7_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Endpoint__Role_authoritiesAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6774:1: ( ( ( ruleEString ) ) )
            // InternalSecurityDsl.g:6775:2: ( ( ruleEString ) )
            {
            // InternalSecurityDsl.g:6775:2: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6776:3: ( ruleEString )
            {
             before(grammarAccess.getEndpointAccess().getRole_authoritiesRoleInstanceCrossReference_7_3_1_0()); 
            // InternalSecurityDsl.g:6777:3: ( ruleEString )
            // InternalSecurityDsl.g:6778:4: ruleEString
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
    // InternalSecurityDsl.g:6789:1: rule__Authentication__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Authentication__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6793:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6794:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6794:2: ( ruleEString )
            // InternalSecurityDsl.g:6795:3: ruleEString
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
    // InternalSecurityDsl.g:6804:1: rule__Authentication__PathAssignment_4 : ( ruleEString ) ;
    public final void rule__Authentication__PathAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6808:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6809:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6809:2: ( ruleEString )
            // InternalSecurityDsl.g:6810:3: ruleEString
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
    // InternalSecurityDsl.g:6819:1: rule__Authentication__Controller_endpointsAssignment_5_2 : ( ruleEndpoint ) ;
    public final void rule__Authentication__Controller_endpointsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6823:1: ( ( ruleEndpoint ) )
            // InternalSecurityDsl.g:6824:2: ( ruleEndpoint )
            {
            // InternalSecurityDsl.g:6824:2: ( ruleEndpoint )
            // InternalSecurityDsl.g:6825:3: ruleEndpoint
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
    // InternalSecurityDsl.g:6834:1: rule__Authentication__Controller_endpointsAssignment_5_3_1 : ( ruleEndpoint ) ;
    public final void rule__Authentication__Controller_endpointsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6838:1: ( ( ruleEndpoint ) )
            // InternalSecurityDsl.g:6839:2: ( ruleEndpoint )
            {
            // InternalSecurityDsl.g:6839:2: ( ruleEndpoint )
            // InternalSecurityDsl.g:6840:3: ruleEndpoint
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
    // InternalSecurityDsl.g:6849:1: rule__JWT__SignatureAlgorithmAssignment_3 : ( ruleEString ) ;
    public final void rule__JWT__SignatureAlgorithmAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6853:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6854:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6854:2: ( ruleEString )
            // InternalSecurityDsl.g:6855:3: ruleEString
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


    // $ANTLR start "rule__JWT__Registered_claimsAssignment_7"
    // InternalSecurityDsl.g:6864:1: rule__JWT__Registered_claimsAssignment_7 : ( ruleRegisteredClaim ) ;
    public final void rule__JWT__Registered_claimsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6868:1: ( ( ruleRegisteredClaim ) )
            // InternalSecurityDsl.g:6869:2: ( ruleRegisteredClaim )
            {
            // InternalSecurityDsl.g:6869:2: ( ruleRegisteredClaim )
            // InternalSecurityDsl.g:6870:3: ruleRegisteredClaim
            {
             before(grammarAccess.getJWTAccess().getRegistered_claimsRegisteredClaimParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleRegisteredClaim();

            state._fsp--;

             after(grammarAccess.getJWTAccess().getRegistered_claimsRegisteredClaimParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JWT__Registered_claimsAssignment_7"


    // $ANTLR start "rule__JWT__ClaimsAssignment_8_1"
    // InternalSecurityDsl.g:6879:1: rule__JWT__ClaimsAssignment_8_1 : ( ruleClaim ) ;
    public final void rule__JWT__ClaimsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6883:1: ( ( ruleClaim ) )
            // InternalSecurityDsl.g:6884:2: ( ruleClaim )
            {
            // InternalSecurityDsl.g:6884:2: ( ruleClaim )
            // InternalSecurityDsl.g:6885:3: ruleClaim
            {
             before(grammarAccess.getJWTAccess().getClaimsClaimParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClaim();

            state._fsp--;

             after(grammarAccess.getJWTAccess().getClaimsClaimParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JWT__ClaimsAssignment_8_1"


    // $ANTLR start "rule__JWT__SecretAssignment_10_2"
    // InternalSecurityDsl.g:6894:1: rule__JWT__SecretAssignment_10_2 : ( ruleEString ) ;
    public final void rule__JWT__SecretAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6898:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6899:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6899:2: ( ruleEString )
            // InternalSecurityDsl.g:6900:3: ruleEString
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
    // InternalSecurityDsl.g:6909:1: rule__Claim__TypeAssignment_1_0 : ( ruleEClaimType ) ;
    public final void rule__Claim__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6913:1: ( ( ruleEClaimType ) )
            // InternalSecurityDsl.g:6914:2: ( ruleEClaimType )
            {
            // InternalSecurityDsl.g:6914:2: ( ruleEClaimType )
            // InternalSecurityDsl.g:6915:3: ruleEClaimType
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
    // InternalSecurityDsl.g:6924:1: rule__Claim__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Claim__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6928:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6929:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6929:2: ( ruleEString )
            // InternalSecurityDsl.g:6930:3: ruleEString
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
    // InternalSecurityDsl.g:6939:1: rule__Claim__Claim_attributeAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Claim__Claim_attributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6943:1: ( ( ( ruleEString ) ) )
            // InternalSecurityDsl.g:6944:2: ( ( ruleEString ) )
            {
            // InternalSecurityDsl.g:6944:2: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6945:3: ( ruleEString )
            {
             before(grammarAccess.getClaimAccess().getClaim_attributeAttributeCrossReference_4_0()); 
            // InternalSecurityDsl.g:6946:3: ( ruleEString )
            // InternalSecurityDsl.g:6947:4: ruleEString
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


    // $ANTLR start "rule__RegisteredClaim__ExpirationTimeAssignment_3"
    // InternalSecurityDsl.g:6958:1: rule__RegisteredClaim__ExpirationTimeAssignment_3 : ( ruleEInt ) ;
    public final void rule__RegisteredClaim__ExpirationTimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6962:1: ( ( ruleEInt ) )
            // InternalSecurityDsl.g:6963:2: ( ruleEInt )
            {
            // InternalSecurityDsl.g:6963:2: ( ruleEInt )
            // InternalSecurityDsl.g:6964:3: ruleEInt
            {
             before(grammarAccess.getRegisteredClaimAccess().getExpirationTimeEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRegisteredClaimAccess().getExpirationTimeEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__ExpirationTimeAssignment_3"


    // $ANTLR start "rule__RegisteredClaim__IssuerAssignment_5_4"
    // InternalSecurityDsl.g:6973:1: rule__RegisteredClaim__IssuerAssignment_5_4 : ( ruleEString ) ;
    public final void rule__RegisteredClaim__IssuerAssignment_5_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6977:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6978:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6978:2: ( ruleEString )
            // InternalSecurityDsl.g:6979:3: ruleEString
            {
             before(grammarAccess.getRegisteredClaimAccess().getIssuerEStringParserRuleCall_5_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRegisteredClaimAccess().getIssuerEStringParserRuleCall_5_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__IssuerAssignment_5_4"


    // $ANTLR start "rule__RegisteredClaim__AudienceAssignment_6_4"
    // InternalSecurityDsl.g:6988:1: rule__RegisteredClaim__AudienceAssignment_6_4 : ( ruleEString ) ;
    public final void rule__RegisteredClaim__AudienceAssignment_6_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6992:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6993:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6993:2: ( ruleEString )
            // InternalSecurityDsl.g:6994:3: ruleEString
            {
             before(grammarAccess.getRegisteredClaimAccess().getAudienceEStringParserRuleCall_6_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRegisteredClaimAccess().getAudienceEStringParserRuleCall_6_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredClaim__AudienceAssignment_6_4"


    // $ANTLR start "rule__OAuth2__ProvidersAssignment_3"
    // InternalSecurityDsl.g:7003:1: rule__OAuth2__ProvidersAssignment_3 : ( ruleProvider ) ;
    public final void rule__OAuth2__ProvidersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:7007:1: ( ( ruleProvider ) )
            // InternalSecurityDsl.g:7008:2: ( ruleProvider )
            {
            // InternalSecurityDsl.g:7008:2: ( ruleProvider )
            // InternalSecurityDsl.g:7009:3: ruleProvider
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
    // InternalSecurityDsl.g:7018:1: rule__OAuth2__ProvidersAssignment_4_1 : ( ruleProvider ) ;
    public final void rule__OAuth2__ProvidersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:7022:1: ( ( ruleProvider ) )
            // InternalSecurityDsl.g:7023:2: ( ruleProvider )
            {
            // InternalSecurityDsl.g:7023:2: ( ruleProvider )
            // InternalSecurityDsl.g:7024:3: ruleProvider
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
    // InternalSecurityDsl.g:7033:1: rule__Provider__NameAssignment_2 : ( ruleEOAuthProvider ) ;
    public final void rule__Provider__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:7037:1: ( ( ruleEOAuthProvider ) )
            // InternalSecurityDsl.g:7038:2: ( ruleEOAuthProvider )
            {
            // InternalSecurityDsl.g:7038:2: ( ruleEOAuthProvider )
            // InternalSecurityDsl.g:7039:3: ruleEOAuthProvider
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
    // InternalSecurityDsl.g:7048:1: rule__Provider__ClientIdAssignment_5 : ( ruleEString ) ;
    public final void rule__Provider__ClientIdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:7052:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:7053:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:7053:2: ( ruleEString )
            // InternalSecurityDsl.g:7054:3: ruleEString
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
    // InternalSecurityDsl.g:7063:1: rule__Provider__ClientSecretAssignment_8 : ( ruleEString ) ;
    public final void rule__Provider__ClientSecretAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:7067:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:7068:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:7068:2: ( ruleEString )
            // InternalSecurityDsl.g:7069:3: ruleEString
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
    // InternalSecurityDsl.g:7078:1: rule__Provider__RedirectUriAssignment_9_2 : ( ruleEString ) ;
    public final void rule__Provider__RedirectUriAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:7082:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:7083:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:7083:2: ( ruleEString )
            // InternalSecurityDsl.g:7084:3: ruleEString
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0019F80000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0400000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000011L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000008400400L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000040000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000001FC000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000030L,0x0000000040000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x2000000000000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00000000E0000030L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000007F00000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});

}