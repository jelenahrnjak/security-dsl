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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PostgreSQL'", "'Oracle'", "'MySQL'", "'String'", "'Float'", "'Long'", "'Integer'", "'Double'", "'DateTime'", "'Date'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'REGISTRATION'", "'LOGIN'", "'LOGOUT'", "'OTHER'", "'PRIVATE'", "'PUBLIC'", "'REGISTERED'", "'GOOGLE'", "'GITHUB'", "'FACEBOOK'", "'MICROSOFT_AZURE'", "'LINKEDIN'", "'TWITTER'", "'INSTAGRAM'", "'application:'", "'artifact:'", "'group:'", "'name:'", "'packageName:'", "'description:'", "'port:'", "'hostname:'", "'database:'", "'model:'", "'user:'", "'role:'", "'security:'", "'controller:'", "'auth:'", "'vendor:'", "'url:'", "'username:'", "'password:'", "'-'", "'{'", "'type:'", "'}'", "'collumnName:'", "'tableName:'", "'attributes:'", "'['", "']'", "','", "'roles:'", "'methodName:'", "'method:'", "'roleAuthorities:'", "'path:'", "'endpoints:'", "'jwt:'", "'header:'", "'signatureAlgorithm:'", "'payload:'", "'claims:'", "'signature:'", "'secret:'", "':'", "'attribute'", "'OAuth2.0:'", "'providers:'", "'clientId:'", "'clientSecret:'", "'redirectUri:'", "'basicAuthentication'", "'identifier'", "'credential'", "'client'"
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


    // $ANTLR start "entryRuleOAuth2"
    // InternalSecurityDsl.g:378:1: entryRuleOAuth2 : ruleOAuth2 EOF ;
    public final void entryRuleOAuth2() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:379:1: ( ruleOAuth2 EOF )
            // InternalSecurityDsl.g:380:1: ruleOAuth2 EOF
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
    // InternalSecurityDsl.g:387:1: ruleOAuth2 : ( ( rule__OAuth2__Group__0 ) ) ;
    public final void ruleOAuth2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:391:2: ( ( ( rule__OAuth2__Group__0 ) ) )
            // InternalSecurityDsl.g:392:2: ( ( rule__OAuth2__Group__0 ) )
            {
            // InternalSecurityDsl.g:392:2: ( ( rule__OAuth2__Group__0 ) )
            // InternalSecurityDsl.g:393:3: ( rule__OAuth2__Group__0 )
            {
             before(grammarAccess.getOAuth2Access().getGroup()); 
            // InternalSecurityDsl.g:394:3: ( rule__OAuth2__Group__0 )
            // InternalSecurityDsl.g:394:4: rule__OAuth2__Group__0
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
    // InternalSecurityDsl.g:403:1: entryRuleProvider : ruleProvider EOF ;
    public final void entryRuleProvider() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:404:1: ( ruleProvider EOF )
            // InternalSecurityDsl.g:405:1: ruleProvider EOF
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
    // InternalSecurityDsl.g:412:1: ruleProvider : ( ( rule__Provider__Group__0 ) ) ;
    public final void ruleProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:416:2: ( ( ( rule__Provider__Group__0 ) ) )
            // InternalSecurityDsl.g:417:2: ( ( rule__Provider__Group__0 ) )
            {
            // InternalSecurityDsl.g:417:2: ( ( rule__Provider__Group__0 ) )
            // InternalSecurityDsl.g:418:3: ( rule__Provider__Group__0 )
            {
             before(grammarAccess.getProviderAccess().getGroup()); 
            // InternalSecurityDsl.g:419:3: ( rule__Provider__Group__0 )
            // InternalSecurityDsl.g:419:4: rule__Provider__Group__0
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
    // InternalSecurityDsl.g:428:1: entryRuleBasicAuthentication : ruleBasicAuthentication EOF ;
    public final void entryRuleBasicAuthentication() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:429:1: ( ruleBasicAuthentication EOF )
            // InternalSecurityDsl.g:430:1: ruleBasicAuthentication EOF
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
    // InternalSecurityDsl.g:437:1: ruleBasicAuthentication : ( ( rule__BasicAuthentication__Group__0 ) ) ;
    public final void ruleBasicAuthentication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:441:2: ( ( ( rule__BasicAuthentication__Group__0 ) ) )
            // InternalSecurityDsl.g:442:2: ( ( rule__BasicAuthentication__Group__0 ) )
            {
            // InternalSecurityDsl.g:442:2: ( ( rule__BasicAuthentication__Group__0 ) )
            // InternalSecurityDsl.g:443:3: ( rule__BasicAuthentication__Group__0 )
            {
             before(grammarAccess.getBasicAuthenticationAccess().getGroup()); 
            // InternalSecurityDsl.g:444:3: ( rule__BasicAuthentication__Group__0 )
            // InternalSecurityDsl.g:444:4: rule__BasicAuthentication__Group__0
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


    // $ANTLR start "ruleEDatabaseType"
    // InternalSecurityDsl.g:453:1: ruleEDatabaseType : ( ( rule__EDatabaseType__Alternatives ) ) ;
    public final void ruleEDatabaseType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:457:1: ( ( ( rule__EDatabaseType__Alternatives ) ) )
            // InternalSecurityDsl.g:458:2: ( ( rule__EDatabaseType__Alternatives ) )
            {
            // InternalSecurityDsl.g:458:2: ( ( rule__EDatabaseType__Alternatives ) )
            // InternalSecurityDsl.g:459:3: ( rule__EDatabaseType__Alternatives )
            {
             before(grammarAccess.getEDatabaseTypeAccess().getAlternatives()); 
            // InternalSecurityDsl.g:460:3: ( rule__EDatabaseType__Alternatives )
            // InternalSecurityDsl.g:460:4: rule__EDatabaseType__Alternatives
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
    // InternalSecurityDsl.g:469:1: ruleEType : ( ( rule__EType__Alternatives ) ) ;
    public final void ruleEType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:473:1: ( ( ( rule__EType__Alternatives ) ) )
            // InternalSecurityDsl.g:474:2: ( ( rule__EType__Alternatives ) )
            {
            // InternalSecurityDsl.g:474:2: ( ( rule__EType__Alternatives ) )
            // InternalSecurityDsl.g:475:3: ( rule__EType__Alternatives )
            {
             before(grammarAccess.getETypeAccess().getAlternatives()); 
            // InternalSecurityDsl.g:476:3: ( rule__EType__Alternatives )
            // InternalSecurityDsl.g:476:4: rule__EType__Alternatives
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
    // InternalSecurityDsl.g:485:1: ruleEEndpointMethod : ( ( rule__EEndpointMethod__Alternatives ) ) ;
    public final void ruleEEndpointMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:489:1: ( ( ( rule__EEndpointMethod__Alternatives ) ) )
            // InternalSecurityDsl.g:490:2: ( ( rule__EEndpointMethod__Alternatives ) )
            {
            // InternalSecurityDsl.g:490:2: ( ( rule__EEndpointMethod__Alternatives ) )
            // InternalSecurityDsl.g:491:3: ( rule__EEndpointMethod__Alternatives )
            {
             before(grammarAccess.getEEndpointMethodAccess().getAlternatives()); 
            // InternalSecurityDsl.g:492:3: ( rule__EEndpointMethod__Alternatives )
            // InternalSecurityDsl.g:492:4: rule__EEndpointMethod__Alternatives
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
    // InternalSecurityDsl.g:501:1: ruleEEndpointType : ( ( rule__EEndpointType__Alternatives ) ) ;
    public final void ruleEEndpointType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:505:1: ( ( ( rule__EEndpointType__Alternatives ) ) )
            // InternalSecurityDsl.g:506:2: ( ( rule__EEndpointType__Alternatives ) )
            {
            // InternalSecurityDsl.g:506:2: ( ( rule__EEndpointType__Alternatives ) )
            // InternalSecurityDsl.g:507:3: ( rule__EEndpointType__Alternatives )
            {
             before(grammarAccess.getEEndpointTypeAccess().getAlternatives()); 
            // InternalSecurityDsl.g:508:3: ( rule__EEndpointType__Alternatives )
            // InternalSecurityDsl.g:508:4: rule__EEndpointType__Alternatives
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
    // InternalSecurityDsl.g:517:1: ruleEClaimType : ( ( rule__EClaimType__Alternatives ) ) ;
    public final void ruleEClaimType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:521:1: ( ( ( rule__EClaimType__Alternatives ) ) )
            // InternalSecurityDsl.g:522:2: ( ( rule__EClaimType__Alternatives ) )
            {
            // InternalSecurityDsl.g:522:2: ( ( rule__EClaimType__Alternatives ) )
            // InternalSecurityDsl.g:523:3: ( rule__EClaimType__Alternatives )
            {
             before(grammarAccess.getEClaimTypeAccess().getAlternatives()); 
            // InternalSecurityDsl.g:524:3: ( rule__EClaimType__Alternatives )
            // InternalSecurityDsl.g:524:4: rule__EClaimType__Alternatives
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
    // InternalSecurityDsl.g:533:1: ruleEOAuthProvider : ( ( rule__EOAuthProvider__Alternatives ) ) ;
    public final void ruleEOAuthProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:537:1: ( ( ( rule__EOAuthProvider__Alternatives ) ) )
            // InternalSecurityDsl.g:538:2: ( ( rule__EOAuthProvider__Alternatives ) )
            {
            // InternalSecurityDsl.g:538:2: ( ( rule__EOAuthProvider__Alternatives ) )
            // InternalSecurityDsl.g:539:3: ( rule__EOAuthProvider__Alternatives )
            {
             before(grammarAccess.getEOAuthProviderAccess().getAlternatives()); 
            // InternalSecurityDsl.g:540:3: ( rule__EOAuthProvider__Alternatives )
            // InternalSecurityDsl.g:540:4: rule__EOAuthProvider__Alternatives
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
    // InternalSecurityDsl.g:548:1: rule__Security__Alternatives : ( ( ruleJWT ) | ( ruleOAuth2 ) | ( ruleBasicAuthentication ) );
    public final void rule__Security__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:552:1: ( ( ruleJWT ) | ( ruleOAuth2 ) | ( ruleBasicAuthentication ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt1=1;
                }
                break;
            case 83:
                {
                alt1=2;
                }
                break;
            case 88:
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
                    // InternalSecurityDsl.g:553:2: ( ruleJWT )
                    {
                    // InternalSecurityDsl.g:553:2: ( ruleJWT )
                    // InternalSecurityDsl.g:554:3: ruleJWT
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
                    // InternalSecurityDsl.g:559:2: ( ruleOAuth2 )
                    {
                    // InternalSecurityDsl.g:559:2: ( ruleOAuth2 )
                    // InternalSecurityDsl.g:560:3: ruleOAuth2
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
                    // InternalSecurityDsl.g:565:2: ( ruleBasicAuthentication )
                    {
                    // InternalSecurityDsl.g:565:2: ( ruleBasicAuthentication )
                    // InternalSecurityDsl.g:566:3: ruleBasicAuthentication
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
    // InternalSecurityDsl.g:575:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:579:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalSecurityDsl.g:580:2: ( RULE_STRING )
                    {
                    // InternalSecurityDsl.g:580:2: ( RULE_STRING )
                    // InternalSecurityDsl.g:581:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:586:2: ( RULE_ID )
                    {
                    // InternalSecurityDsl.g:586:2: ( RULE_ID )
                    // InternalSecurityDsl.g:587:3: RULE_ID
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
    // InternalSecurityDsl.g:596:1: rule__EDatabaseType__Alternatives : ( ( ( 'PostgreSQL' ) ) | ( ( 'Oracle' ) ) | ( ( 'MySQL' ) ) );
    public final void rule__EDatabaseType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:600:1: ( ( ( 'PostgreSQL' ) ) | ( ( 'Oracle' ) ) | ( ( 'MySQL' ) ) )
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
                    // InternalSecurityDsl.g:601:2: ( ( 'PostgreSQL' ) )
                    {
                    // InternalSecurityDsl.g:601:2: ( ( 'PostgreSQL' ) )
                    // InternalSecurityDsl.g:602:3: ( 'PostgreSQL' )
                    {
                     before(grammarAccess.getEDatabaseTypeAccess().getPostgreSQLEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:603:3: ( 'PostgreSQL' )
                    // InternalSecurityDsl.g:603:4: 'PostgreSQL'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getEDatabaseTypeAccess().getPostgreSQLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:607:2: ( ( 'Oracle' ) )
                    {
                    // InternalSecurityDsl.g:607:2: ( ( 'Oracle' ) )
                    // InternalSecurityDsl.g:608:3: ( 'Oracle' )
                    {
                     before(grammarAccess.getEDatabaseTypeAccess().getOracleEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:609:3: ( 'Oracle' )
                    // InternalSecurityDsl.g:609:4: 'Oracle'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getEDatabaseTypeAccess().getOracleEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:613:2: ( ( 'MySQL' ) )
                    {
                    // InternalSecurityDsl.g:613:2: ( ( 'MySQL' ) )
                    // InternalSecurityDsl.g:614:3: ( 'MySQL' )
                    {
                     before(grammarAccess.getEDatabaseTypeAccess().getMySQLEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:615:3: ( 'MySQL' )
                    // InternalSecurityDsl.g:615:4: 'MySQL'
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
    // InternalSecurityDsl.g:623:1: rule__EType__Alternatives : ( ( ( 'String' ) ) | ( ( 'Float' ) ) | ( ( 'Long' ) ) | ( ( 'Integer' ) ) | ( ( 'Double' ) ) | ( ( 'DateTime' ) ) | ( ( 'Date' ) ) );
    public final void rule__EType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:627:1: ( ( ( 'String' ) ) | ( ( 'Float' ) ) | ( ( 'Long' ) ) | ( ( 'Integer' ) ) | ( ( 'Double' ) ) | ( ( 'DateTime' ) ) | ( ( 'Date' ) ) )
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
                    // InternalSecurityDsl.g:628:2: ( ( 'String' ) )
                    {
                    // InternalSecurityDsl.g:628:2: ( ( 'String' ) )
                    // InternalSecurityDsl.g:629:3: ( 'String' )
                    {
                     before(grammarAccess.getETypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:630:3: ( 'String' )
                    // InternalSecurityDsl.g:630:4: 'String'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:634:2: ( ( 'Float' ) )
                    {
                    // InternalSecurityDsl.g:634:2: ( ( 'Float' ) )
                    // InternalSecurityDsl.g:635:3: ( 'Float' )
                    {
                     before(grammarAccess.getETypeAccess().getFloatEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:636:3: ( 'Float' )
                    // InternalSecurityDsl.g:636:4: 'Float'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getFloatEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:640:2: ( ( 'Long' ) )
                    {
                    // InternalSecurityDsl.g:640:2: ( ( 'Long' ) )
                    // InternalSecurityDsl.g:641:3: ( 'Long' )
                    {
                     before(grammarAccess.getETypeAccess().getLongEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:642:3: ( 'Long' )
                    // InternalSecurityDsl.g:642:4: 'Long'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getLongEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:646:2: ( ( 'Integer' ) )
                    {
                    // InternalSecurityDsl.g:646:2: ( ( 'Integer' ) )
                    // InternalSecurityDsl.g:647:3: ( 'Integer' )
                    {
                     before(grammarAccess.getETypeAccess().getIntegerEnumLiteralDeclaration_3()); 
                    // InternalSecurityDsl.g:648:3: ( 'Integer' )
                    // InternalSecurityDsl.g:648:4: 'Integer'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getIntegerEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSecurityDsl.g:652:2: ( ( 'Double' ) )
                    {
                    // InternalSecurityDsl.g:652:2: ( ( 'Double' ) )
                    // InternalSecurityDsl.g:653:3: ( 'Double' )
                    {
                     before(grammarAccess.getETypeAccess().getDoubleEnumLiteralDeclaration_4()); 
                    // InternalSecurityDsl.g:654:3: ( 'Double' )
                    // InternalSecurityDsl.g:654:4: 'Double'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getDoubleEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSecurityDsl.g:658:2: ( ( 'DateTime' ) )
                    {
                    // InternalSecurityDsl.g:658:2: ( ( 'DateTime' ) )
                    // InternalSecurityDsl.g:659:3: ( 'DateTime' )
                    {
                     before(grammarAccess.getETypeAccess().getDateTimeEnumLiteralDeclaration_5()); 
                    // InternalSecurityDsl.g:660:3: ( 'DateTime' )
                    // InternalSecurityDsl.g:660:4: 'DateTime'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getDateTimeEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSecurityDsl.g:664:2: ( ( 'Date' ) )
                    {
                    // InternalSecurityDsl.g:664:2: ( ( 'Date' ) )
                    // InternalSecurityDsl.g:665:3: ( 'Date' )
                    {
                     before(grammarAccess.getETypeAccess().getDateEnumLiteralDeclaration_6()); 
                    // InternalSecurityDsl.g:666:3: ( 'Date' )
                    // InternalSecurityDsl.g:666:4: 'Date'
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
    // InternalSecurityDsl.g:674:1: rule__EEndpointMethod__Alternatives : ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) );
    public final void rule__EEndpointMethod__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:678:1: ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) )
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
                    // InternalSecurityDsl.g:679:2: ( ( 'GET' ) )
                    {
                    // InternalSecurityDsl.g:679:2: ( ( 'GET' ) )
                    // InternalSecurityDsl.g:680:3: ( 'GET' )
                    {
                     before(grammarAccess.getEEndpointMethodAccess().getGETEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:681:3: ( 'GET' )
                    // InternalSecurityDsl.g:681:4: 'GET'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointMethodAccess().getGETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:685:2: ( ( 'POST' ) )
                    {
                    // InternalSecurityDsl.g:685:2: ( ( 'POST' ) )
                    // InternalSecurityDsl.g:686:3: ( 'POST' )
                    {
                     before(grammarAccess.getEEndpointMethodAccess().getPOSTEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:687:3: ( 'POST' )
                    // InternalSecurityDsl.g:687:4: 'POST'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointMethodAccess().getPOSTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:691:2: ( ( 'PUT' ) )
                    {
                    // InternalSecurityDsl.g:691:2: ( ( 'PUT' ) )
                    // InternalSecurityDsl.g:692:3: ( 'PUT' )
                    {
                     before(grammarAccess.getEEndpointMethodAccess().getPUTEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:693:3: ( 'PUT' )
                    // InternalSecurityDsl.g:693:4: 'PUT'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointMethodAccess().getPUTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:697:2: ( ( 'DELETE' ) )
                    {
                    // InternalSecurityDsl.g:697:2: ( ( 'DELETE' ) )
                    // InternalSecurityDsl.g:698:3: ( 'DELETE' )
                    {
                     before(grammarAccess.getEEndpointMethodAccess().getDELETEEnumLiteralDeclaration_3()); 
                    // InternalSecurityDsl.g:699:3: ( 'DELETE' )
                    // InternalSecurityDsl.g:699:4: 'DELETE'
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
    // InternalSecurityDsl.g:707:1: rule__EEndpointType__Alternatives : ( ( ( 'REGISTRATION' ) ) | ( ( 'LOGIN' ) ) | ( ( 'LOGOUT' ) ) | ( ( 'OTHER' ) ) );
    public final void rule__EEndpointType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:711:1: ( ( ( 'REGISTRATION' ) ) | ( ( 'LOGIN' ) ) | ( ( 'LOGOUT' ) ) | ( ( 'OTHER' ) ) )
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
                    // InternalSecurityDsl.g:712:2: ( ( 'REGISTRATION' ) )
                    {
                    // InternalSecurityDsl.g:712:2: ( ( 'REGISTRATION' ) )
                    // InternalSecurityDsl.g:713:3: ( 'REGISTRATION' )
                    {
                     before(grammarAccess.getEEndpointTypeAccess().getREGISTRATIONEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:714:3: ( 'REGISTRATION' )
                    // InternalSecurityDsl.g:714:4: 'REGISTRATION'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointTypeAccess().getREGISTRATIONEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:718:2: ( ( 'LOGIN' ) )
                    {
                    // InternalSecurityDsl.g:718:2: ( ( 'LOGIN' ) )
                    // InternalSecurityDsl.g:719:3: ( 'LOGIN' )
                    {
                     before(grammarAccess.getEEndpointTypeAccess().getLOGINEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:720:3: ( 'LOGIN' )
                    // InternalSecurityDsl.g:720:4: 'LOGIN'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointTypeAccess().getLOGINEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:724:2: ( ( 'LOGOUT' ) )
                    {
                    // InternalSecurityDsl.g:724:2: ( ( 'LOGOUT' ) )
                    // InternalSecurityDsl.g:725:3: ( 'LOGOUT' )
                    {
                     before(grammarAccess.getEEndpointTypeAccess().getLOGOUTEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:726:3: ( 'LOGOUT' )
                    // InternalSecurityDsl.g:726:4: 'LOGOUT'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointTypeAccess().getLOGOUTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:730:2: ( ( 'OTHER' ) )
                    {
                    // InternalSecurityDsl.g:730:2: ( ( 'OTHER' ) )
                    // InternalSecurityDsl.g:731:3: ( 'OTHER' )
                    {
                     before(grammarAccess.getEEndpointTypeAccess().getOTHEREnumLiteralDeclaration_3()); 
                    // InternalSecurityDsl.g:732:3: ( 'OTHER' )
                    // InternalSecurityDsl.g:732:4: 'OTHER'
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
    // InternalSecurityDsl.g:740:1: rule__EClaimType__Alternatives : ( ( ( 'PRIVATE' ) ) | ( ( 'PUBLIC' ) ) | ( ( 'REGISTERED' ) ) );
    public final void rule__EClaimType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:744:1: ( ( ( 'PRIVATE' ) ) | ( ( 'PUBLIC' ) ) | ( ( 'REGISTERED' ) ) )
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
                    // InternalSecurityDsl.g:745:2: ( ( 'PRIVATE' ) )
                    {
                    // InternalSecurityDsl.g:745:2: ( ( 'PRIVATE' ) )
                    // InternalSecurityDsl.g:746:3: ( 'PRIVATE' )
                    {
                     before(grammarAccess.getEClaimTypeAccess().getPRIVATEEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:747:3: ( 'PRIVATE' )
                    // InternalSecurityDsl.g:747:4: 'PRIVATE'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getEClaimTypeAccess().getPRIVATEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:751:2: ( ( 'PUBLIC' ) )
                    {
                    // InternalSecurityDsl.g:751:2: ( ( 'PUBLIC' ) )
                    // InternalSecurityDsl.g:752:3: ( 'PUBLIC' )
                    {
                     before(grammarAccess.getEClaimTypeAccess().getPUBLICEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:753:3: ( 'PUBLIC' )
                    // InternalSecurityDsl.g:753:4: 'PUBLIC'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getEClaimTypeAccess().getPUBLICEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:757:2: ( ( 'REGISTERED' ) )
                    {
                    // InternalSecurityDsl.g:757:2: ( ( 'REGISTERED' ) )
                    // InternalSecurityDsl.g:758:3: ( 'REGISTERED' )
                    {
                     before(grammarAccess.getEClaimTypeAccess().getREGISTEREDEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:759:3: ( 'REGISTERED' )
                    // InternalSecurityDsl.g:759:4: 'REGISTERED'
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
    // InternalSecurityDsl.g:767:1: rule__EOAuthProvider__Alternatives : ( ( ( 'GOOGLE' ) ) | ( ( 'GITHUB' ) ) | ( ( 'FACEBOOK' ) ) | ( ( 'MICROSOFT_AZURE' ) ) | ( ( 'LINKEDIN' ) ) | ( ( 'TWITTER' ) ) | ( ( 'INSTAGRAM' ) ) );
    public final void rule__EOAuthProvider__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:771:1: ( ( ( 'GOOGLE' ) ) | ( ( 'GITHUB' ) ) | ( ( 'FACEBOOK' ) ) | ( ( 'MICROSOFT_AZURE' ) ) | ( ( 'LINKEDIN' ) ) | ( ( 'TWITTER' ) ) | ( ( 'INSTAGRAM' ) ) )
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
                    // InternalSecurityDsl.g:772:2: ( ( 'GOOGLE' ) )
                    {
                    // InternalSecurityDsl.g:772:2: ( ( 'GOOGLE' ) )
                    // InternalSecurityDsl.g:773:3: ( 'GOOGLE' )
                    {
                     before(grammarAccess.getEOAuthProviderAccess().getGOOGLEEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:774:3: ( 'GOOGLE' )
                    // InternalSecurityDsl.g:774:4: 'GOOGLE'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getEOAuthProviderAccess().getGOOGLEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:778:2: ( ( 'GITHUB' ) )
                    {
                    // InternalSecurityDsl.g:778:2: ( ( 'GITHUB' ) )
                    // InternalSecurityDsl.g:779:3: ( 'GITHUB' )
                    {
                     before(grammarAccess.getEOAuthProviderAccess().getGITHUBEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:780:3: ( 'GITHUB' )
                    // InternalSecurityDsl.g:780:4: 'GITHUB'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getEOAuthProviderAccess().getGITHUBEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:784:2: ( ( 'FACEBOOK' ) )
                    {
                    // InternalSecurityDsl.g:784:2: ( ( 'FACEBOOK' ) )
                    // InternalSecurityDsl.g:785:3: ( 'FACEBOOK' )
                    {
                     before(grammarAccess.getEOAuthProviderAccess().getFACEBOOKEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:786:3: ( 'FACEBOOK' )
                    // InternalSecurityDsl.g:786:4: 'FACEBOOK'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getEOAuthProviderAccess().getFACEBOOKEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:790:2: ( ( 'MICROSOFT_AZURE' ) )
                    {
                    // InternalSecurityDsl.g:790:2: ( ( 'MICROSOFT_AZURE' ) )
                    // InternalSecurityDsl.g:791:3: ( 'MICROSOFT_AZURE' )
                    {
                     before(grammarAccess.getEOAuthProviderAccess().getAZUREEnumLiteralDeclaration_3()); 
                    // InternalSecurityDsl.g:792:3: ( 'MICROSOFT_AZURE' )
                    // InternalSecurityDsl.g:792:4: 'MICROSOFT_AZURE'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getEOAuthProviderAccess().getAZUREEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSecurityDsl.g:796:2: ( ( 'LINKEDIN' ) )
                    {
                    // InternalSecurityDsl.g:796:2: ( ( 'LINKEDIN' ) )
                    // InternalSecurityDsl.g:797:3: ( 'LINKEDIN' )
                    {
                     before(grammarAccess.getEOAuthProviderAccess().getLINKEDINEnumLiteralDeclaration_4()); 
                    // InternalSecurityDsl.g:798:3: ( 'LINKEDIN' )
                    // InternalSecurityDsl.g:798:4: 'LINKEDIN'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getEOAuthProviderAccess().getLINKEDINEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSecurityDsl.g:802:2: ( ( 'TWITTER' ) )
                    {
                    // InternalSecurityDsl.g:802:2: ( ( 'TWITTER' ) )
                    // InternalSecurityDsl.g:803:3: ( 'TWITTER' )
                    {
                     before(grammarAccess.getEOAuthProviderAccess().getTWITTEREnumLiteralDeclaration_5()); 
                    // InternalSecurityDsl.g:804:3: ( 'TWITTER' )
                    // InternalSecurityDsl.g:804:4: 'TWITTER'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getEOAuthProviderAccess().getTWITTEREnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSecurityDsl.g:808:2: ( ( 'INSTAGRAM' ) )
                    {
                    // InternalSecurityDsl.g:808:2: ( ( 'INSTAGRAM' ) )
                    // InternalSecurityDsl.g:809:3: ( 'INSTAGRAM' )
                    {
                     before(grammarAccess.getEOAuthProviderAccess().getINSTAGRAMEnumLiteralDeclaration_6()); 
                    // InternalSecurityDsl.g:810:3: ( 'INSTAGRAM' )
                    // InternalSecurityDsl.g:810:4: 'INSTAGRAM'
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
    // InternalSecurityDsl.g:818:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:822:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // InternalSecurityDsl.g:823:2: rule__Application__Group__0__Impl rule__Application__Group__1
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
    // InternalSecurityDsl.g:830:1: rule__Application__Group__0__Impl : ( () ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:834:1: ( ( () ) )
            // InternalSecurityDsl.g:835:1: ( () )
            {
            // InternalSecurityDsl.g:835:1: ( () )
            // InternalSecurityDsl.g:836:2: ()
            {
             before(grammarAccess.getApplicationAccess().getApplicationAction_0()); 
            // InternalSecurityDsl.g:837:2: ()
            // InternalSecurityDsl.g:837:3: 
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
    // InternalSecurityDsl.g:845:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:849:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // InternalSecurityDsl.g:850:2: rule__Application__Group__1__Impl rule__Application__Group__2
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
    // InternalSecurityDsl.g:857:1: rule__Application__Group__1__Impl : ( 'application:' ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:861:1: ( ( 'application:' ) )
            // InternalSecurityDsl.g:862:1: ( 'application:' )
            {
            // InternalSecurityDsl.g:862:1: ( 'application:' )
            // InternalSecurityDsl.g:863:2: 'application:'
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
    // InternalSecurityDsl.g:872:1: rule__Application__Group__2 : rule__Application__Group__2__Impl rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:876:1: ( rule__Application__Group__2__Impl rule__Application__Group__3 )
            // InternalSecurityDsl.g:877:2: rule__Application__Group__2__Impl rule__Application__Group__3
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
    // InternalSecurityDsl.g:884:1: rule__Application__Group__2__Impl : ( 'artifact:' ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:888:1: ( ( 'artifact:' ) )
            // InternalSecurityDsl.g:889:1: ( 'artifact:' )
            {
            // InternalSecurityDsl.g:889:1: ( 'artifact:' )
            // InternalSecurityDsl.g:890:2: 'artifact:'
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
    // InternalSecurityDsl.g:899:1: rule__Application__Group__3 : rule__Application__Group__3__Impl rule__Application__Group__4 ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:903:1: ( rule__Application__Group__3__Impl rule__Application__Group__4 )
            // InternalSecurityDsl.g:904:2: rule__Application__Group__3__Impl rule__Application__Group__4
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
    // InternalSecurityDsl.g:911:1: rule__Application__Group__3__Impl : ( ( rule__Application__ArtifactAssignment_3 ) ) ;
    public final void rule__Application__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:915:1: ( ( ( rule__Application__ArtifactAssignment_3 ) ) )
            // InternalSecurityDsl.g:916:1: ( ( rule__Application__ArtifactAssignment_3 ) )
            {
            // InternalSecurityDsl.g:916:1: ( ( rule__Application__ArtifactAssignment_3 ) )
            // InternalSecurityDsl.g:917:2: ( rule__Application__ArtifactAssignment_3 )
            {
             before(grammarAccess.getApplicationAccess().getArtifactAssignment_3()); 
            // InternalSecurityDsl.g:918:2: ( rule__Application__ArtifactAssignment_3 )
            // InternalSecurityDsl.g:918:3: rule__Application__ArtifactAssignment_3
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
    // InternalSecurityDsl.g:926:1: rule__Application__Group__4 : rule__Application__Group__4__Impl rule__Application__Group__5 ;
    public final void rule__Application__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:930:1: ( rule__Application__Group__4__Impl rule__Application__Group__5 )
            // InternalSecurityDsl.g:931:2: rule__Application__Group__4__Impl rule__Application__Group__5
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
    // InternalSecurityDsl.g:938:1: rule__Application__Group__4__Impl : ( ( rule__Application__Group_4__0 )? ) ;
    public final void rule__Application__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:942:1: ( ( ( rule__Application__Group_4__0 )? ) )
            // InternalSecurityDsl.g:943:1: ( ( rule__Application__Group_4__0 )? )
            {
            // InternalSecurityDsl.g:943:1: ( ( rule__Application__Group_4__0 )? )
            // InternalSecurityDsl.g:944:2: ( rule__Application__Group_4__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_4()); 
            // InternalSecurityDsl.g:945:2: ( rule__Application__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==42) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSecurityDsl.g:945:3: rule__Application__Group_4__0
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
    // InternalSecurityDsl.g:953:1: rule__Application__Group__5 : rule__Application__Group__5__Impl rule__Application__Group__6 ;
    public final void rule__Application__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:957:1: ( rule__Application__Group__5__Impl rule__Application__Group__6 )
            // InternalSecurityDsl.g:958:2: rule__Application__Group__5__Impl rule__Application__Group__6
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
    // InternalSecurityDsl.g:965:1: rule__Application__Group__5__Impl : ( 'group:' ) ;
    public final void rule__Application__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:969:1: ( ( 'group:' ) )
            // InternalSecurityDsl.g:970:1: ( 'group:' )
            {
            // InternalSecurityDsl.g:970:1: ( 'group:' )
            // InternalSecurityDsl.g:971:2: 'group:'
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
    // InternalSecurityDsl.g:980:1: rule__Application__Group__6 : rule__Application__Group__6__Impl rule__Application__Group__7 ;
    public final void rule__Application__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:984:1: ( rule__Application__Group__6__Impl rule__Application__Group__7 )
            // InternalSecurityDsl.g:985:2: rule__Application__Group__6__Impl rule__Application__Group__7
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
    // InternalSecurityDsl.g:992:1: rule__Application__Group__6__Impl : ( ( rule__Application__GroupAssignment_6 ) ) ;
    public final void rule__Application__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:996:1: ( ( ( rule__Application__GroupAssignment_6 ) ) )
            // InternalSecurityDsl.g:997:1: ( ( rule__Application__GroupAssignment_6 ) )
            {
            // InternalSecurityDsl.g:997:1: ( ( rule__Application__GroupAssignment_6 ) )
            // InternalSecurityDsl.g:998:2: ( rule__Application__GroupAssignment_6 )
            {
             before(grammarAccess.getApplicationAccess().getGroupAssignment_6()); 
            // InternalSecurityDsl.g:999:2: ( rule__Application__GroupAssignment_6 )
            // InternalSecurityDsl.g:999:3: rule__Application__GroupAssignment_6
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
    // InternalSecurityDsl.g:1007:1: rule__Application__Group__7 : rule__Application__Group__7__Impl rule__Application__Group__8 ;
    public final void rule__Application__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1011:1: ( rule__Application__Group__7__Impl rule__Application__Group__8 )
            // InternalSecurityDsl.g:1012:2: rule__Application__Group__7__Impl rule__Application__Group__8
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
    // InternalSecurityDsl.g:1019:1: rule__Application__Group__7__Impl : ( ( rule__Application__Group_7__0 )? ) ;
    public final void rule__Application__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1023:1: ( ( ( rule__Application__Group_7__0 )? ) )
            // InternalSecurityDsl.g:1024:1: ( ( rule__Application__Group_7__0 )? )
            {
            // InternalSecurityDsl.g:1024:1: ( ( rule__Application__Group_7__0 )? )
            // InternalSecurityDsl.g:1025:2: ( rule__Application__Group_7__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_7()); 
            // InternalSecurityDsl.g:1026:2: ( rule__Application__Group_7__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==43) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSecurityDsl.g:1026:3: rule__Application__Group_7__0
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
    // InternalSecurityDsl.g:1034:1: rule__Application__Group__8 : rule__Application__Group__8__Impl rule__Application__Group__9 ;
    public final void rule__Application__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1038:1: ( rule__Application__Group__8__Impl rule__Application__Group__9 )
            // InternalSecurityDsl.g:1039:2: rule__Application__Group__8__Impl rule__Application__Group__9
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
    // InternalSecurityDsl.g:1046:1: rule__Application__Group__8__Impl : ( ( rule__Application__Group_8__0 )? ) ;
    public final void rule__Application__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1050:1: ( ( ( rule__Application__Group_8__0 )? ) )
            // InternalSecurityDsl.g:1051:1: ( ( rule__Application__Group_8__0 )? )
            {
            // InternalSecurityDsl.g:1051:1: ( ( rule__Application__Group_8__0 )? )
            // InternalSecurityDsl.g:1052:2: ( rule__Application__Group_8__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_8()); 
            // InternalSecurityDsl.g:1053:2: ( rule__Application__Group_8__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==44) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSecurityDsl.g:1053:3: rule__Application__Group_8__0
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
    // InternalSecurityDsl.g:1061:1: rule__Application__Group__9 : rule__Application__Group__9__Impl rule__Application__Group__10 ;
    public final void rule__Application__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1065:1: ( rule__Application__Group__9__Impl rule__Application__Group__10 )
            // InternalSecurityDsl.g:1066:2: rule__Application__Group__9__Impl rule__Application__Group__10
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
    // InternalSecurityDsl.g:1073:1: rule__Application__Group__9__Impl : ( ( rule__Application__Group_9__0 )? ) ;
    public final void rule__Application__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1077:1: ( ( ( rule__Application__Group_9__0 )? ) )
            // InternalSecurityDsl.g:1078:1: ( ( rule__Application__Group_9__0 )? )
            {
            // InternalSecurityDsl.g:1078:1: ( ( rule__Application__Group_9__0 )? )
            // InternalSecurityDsl.g:1079:2: ( rule__Application__Group_9__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_9()); 
            // InternalSecurityDsl.g:1080:2: ( rule__Application__Group_9__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==45) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSecurityDsl.g:1080:3: rule__Application__Group_9__0
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
    // InternalSecurityDsl.g:1088:1: rule__Application__Group__10 : rule__Application__Group__10__Impl rule__Application__Group__11 ;
    public final void rule__Application__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1092:1: ( rule__Application__Group__10__Impl rule__Application__Group__11 )
            // InternalSecurityDsl.g:1093:2: rule__Application__Group__10__Impl rule__Application__Group__11
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
    // InternalSecurityDsl.g:1100:1: rule__Application__Group__10__Impl : ( ( rule__Application__Group_10__0 )? ) ;
    public final void rule__Application__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1104:1: ( ( ( rule__Application__Group_10__0 )? ) )
            // InternalSecurityDsl.g:1105:1: ( ( rule__Application__Group_10__0 )? )
            {
            // InternalSecurityDsl.g:1105:1: ( ( rule__Application__Group_10__0 )? )
            // InternalSecurityDsl.g:1106:2: ( rule__Application__Group_10__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_10()); 
            // InternalSecurityDsl.g:1107:2: ( rule__Application__Group_10__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==46) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSecurityDsl.g:1107:3: rule__Application__Group_10__0
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
    // InternalSecurityDsl.g:1115:1: rule__Application__Group__11 : rule__Application__Group__11__Impl rule__Application__Group__12 ;
    public final void rule__Application__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1119:1: ( rule__Application__Group__11__Impl rule__Application__Group__12 )
            // InternalSecurityDsl.g:1120:2: rule__Application__Group__11__Impl rule__Application__Group__12
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
    // InternalSecurityDsl.g:1127:1: rule__Application__Group__11__Impl : ( ( rule__Application__Group_11__0 )? ) ;
    public final void rule__Application__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1131:1: ( ( ( rule__Application__Group_11__0 )? ) )
            // InternalSecurityDsl.g:1132:1: ( ( rule__Application__Group_11__0 )? )
            {
            // InternalSecurityDsl.g:1132:1: ( ( rule__Application__Group_11__0 )? )
            // InternalSecurityDsl.g:1133:2: ( rule__Application__Group_11__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_11()); 
            // InternalSecurityDsl.g:1134:2: ( rule__Application__Group_11__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==47) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSecurityDsl.g:1134:3: rule__Application__Group_11__0
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
    // InternalSecurityDsl.g:1142:1: rule__Application__Group__12 : rule__Application__Group__12__Impl rule__Application__Group__13 ;
    public final void rule__Application__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1146:1: ( rule__Application__Group__12__Impl rule__Application__Group__13 )
            // InternalSecurityDsl.g:1147:2: rule__Application__Group__12__Impl rule__Application__Group__13
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
    // InternalSecurityDsl.g:1154:1: rule__Application__Group__12__Impl : ( ( rule__Application__Group_12__0 )? ) ;
    public final void rule__Application__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1158:1: ( ( ( rule__Application__Group_12__0 )? ) )
            // InternalSecurityDsl.g:1159:1: ( ( rule__Application__Group_12__0 )? )
            {
            // InternalSecurityDsl.g:1159:1: ( ( rule__Application__Group_12__0 )? )
            // InternalSecurityDsl.g:1160:2: ( rule__Application__Group_12__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_12()); 
            // InternalSecurityDsl.g:1161:2: ( rule__Application__Group_12__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==48) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSecurityDsl.g:1161:3: rule__Application__Group_12__0
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
    // InternalSecurityDsl.g:1169:1: rule__Application__Group__13 : rule__Application__Group__13__Impl rule__Application__Group__14 ;
    public final void rule__Application__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1173:1: ( rule__Application__Group__13__Impl rule__Application__Group__14 )
            // InternalSecurityDsl.g:1174:2: rule__Application__Group__13__Impl rule__Application__Group__14
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
    // InternalSecurityDsl.g:1181:1: rule__Application__Group__13__Impl : ( ( rule__Application__Group_13__0 )? ) ;
    public final void rule__Application__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1185:1: ( ( ( rule__Application__Group_13__0 )? ) )
            // InternalSecurityDsl.g:1186:1: ( ( rule__Application__Group_13__0 )? )
            {
            // InternalSecurityDsl.g:1186:1: ( ( rule__Application__Group_13__0 )? )
            // InternalSecurityDsl.g:1187:2: ( rule__Application__Group_13__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_13()); 
            // InternalSecurityDsl.g:1188:2: ( rule__Application__Group_13__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==51) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSecurityDsl.g:1188:3: rule__Application__Group_13__0
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
    // InternalSecurityDsl.g:1196:1: rule__Application__Group__14 : rule__Application__Group__14__Impl ;
    public final void rule__Application__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1200:1: ( rule__Application__Group__14__Impl )
            // InternalSecurityDsl.g:1201:2: rule__Application__Group__14__Impl
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
    // InternalSecurityDsl.g:1207:1: rule__Application__Group__14__Impl : ( ( rule__Application__Group_14__0 )? ) ;
    public final void rule__Application__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1211:1: ( ( ( rule__Application__Group_14__0 )? ) )
            // InternalSecurityDsl.g:1212:1: ( ( rule__Application__Group_14__0 )? )
            {
            // InternalSecurityDsl.g:1212:1: ( ( rule__Application__Group_14__0 )? )
            // InternalSecurityDsl.g:1213:2: ( rule__Application__Group_14__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_14()); 
            // InternalSecurityDsl.g:1214:2: ( rule__Application__Group_14__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==52) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSecurityDsl.g:1214:3: rule__Application__Group_14__0
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
    // InternalSecurityDsl.g:1223:1: rule__Application__Group_4__0 : rule__Application__Group_4__0__Impl rule__Application__Group_4__1 ;
    public final void rule__Application__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1227:1: ( rule__Application__Group_4__0__Impl rule__Application__Group_4__1 )
            // InternalSecurityDsl.g:1228:2: rule__Application__Group_4__0__Impl rule__Application__Group_4__1
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
    // InternalSecurityDsl.g:1235:1: rule__Application__Group_4__0__Impl : ( 'name:' ) ;
    public final void rule__Application__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1239:1: ( ( 'name:' ) )
            // InternalSecurityDsl.g:1240:1: ( 'name:' )
            {
            // InternalSecurityDsl.g:1240:1: ( 'name:' )
            // InternalSecurityDsl.g:1241:2: 'name:'
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
    // InternalSecurityDsl.g:1250:1: rule__Application__Group_4__1 : rule__Application__Group_4__1__Impl ;
    public final void rule__Application__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1254:1: ( rule__Application__Group_4__1__Impl )
            // InternalSecurityDsl.g:1255:2: rule__Application__Group_4__1__Impl
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
    // InternalSecurityDsl.g:1261:1: rule__Application__Group_4__1__Impl : ( ( rule__Application__NameAssignment_4_1 ) ) ;
    public final void rule__Application__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1265:1: ( ( ( rule__Application__NameAssignment_4_1 ) ) )
            // InternalSecurityDsl.g:1266:1: ( ( rule__Application__NameAssignment_4_1 ) )
            {
            // InternalSecurityDsl.g:1266:1: ( ( rule__Application__NameAssignment_4_1 ) )
            // InternalSecurityDsl.g:1267:2: ( rule__Application__NameAssignment_4_1 )
            {
             before(grammarAccess.getApplicationAccess().getNameAssignment_4_1()); 
            // InternalSecurityDsl.g:1268:2: ( rule__Application__NameAssignment_4_1 )
            // InternalSecurityDsl.g:1268:3: rule__Application__NameAssignment_4_1
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
    // InternalSecurityDsl.g:1277:1: rule__Application__Group_7__0 : rule__Application__Group_7__0__Impl rule__Application__Group_7__1 ;
    public final void rule__Application__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1281:1: ( rule__Application__Group_7__0__Impl rule__Application__Group_7__1 )
            // InternalSecurityDsl.g:1282:2: rule__Application__Group_7__0__Impl rule__Application__Group_7__1
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
    // InternalSecurityDsl.g:1289:1: rule__Application__Group_7__0__Impl : ( 'packageName:' ) ;
    public final void rule__Application__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1293:1: ( ( 'packageName:' ) )
            // InternalSecurityDsl.g:1294:1: ( 'packageName:' )
            {
            // InternalSecurityDsl.g:1294:1: ( 'packageName:' )
            // InternalSecurityDsl.g:1295:2: 'packageName:'
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
    // InternalSecurityDsl.g:1304:1: rule__Application__Group_7__1 : rule__Application__Group_7__1__Impl ;
    public final void rule__Application__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1308:1: ( rule__Application__Group_7__1__Impl )
            // InternalSecurityDsl.g:1309:2: rule__Application__Group_7__1__Impl
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
    // InternalSecurityDsl.g:1315:1: rule__Application__Group_7__1__Impl : ( ( rule__Application__PackageNameAssignment_7_1 ) ) ;
    public final void rule__Application__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1319:1: ( ( ( rule__Application__PackageNameAssignment_7_1 ) ) )
            // InternalSecurityDsl.g:1320:1: ( ( rule__Application__PackageNameAssignment_7_1 ) )
            {
            // InternalSecurityDsl.g:1320:1: ( ( rule__Application__PackageNameAssignment_7_1 ) )
            // InternalSecurityDsl.g:1321:2: ( rule__Application__PackageNameAssignment_7_1 )
            {
             before(grammarAccess.getApplicationAccess().getPackageNameAssignment_7_1()); 
            // InternalSecurityDsl.g:1322:2: ( rule__Application__PackageNameAssignment_7_1 )
            // InternalSecurityDsl.g:1322:3: rule__Application__PackageNameAssignment_7_1
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
    // InternalSecurityDsl.g:1331:1: rule__Application__Group_8__0 : rule__Application__Group_8__0__Impl rule__Application__Group_8__1 ;
    public final void rule__Application__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1335:1: ( rule__Application__Group_8__0__Impl rule__Application__Group_8__1 )
            // InternalSecurityDsl.g:1336:2: rule__Application__Group_8__0__Impl rule__Application__Group_8__1
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
    // InternalSecurityDsl.g:1343:1: rule__Application__Group_8__0__Impl : ( 'description:' ) ;
    public final void rule__Application__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1347:1: ( ( 'description:' ) )
            // InternalSecurityDsl.g:1348:1: ( 'description:' )
            {
            // InternalSecurityDsl.g:1348:1: ( 'description:' )
            // InternalSecurityDsl.g:1349:2: 'description:'
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
    // InternalSecurityDsl.g:1358:1: rule__Application__Group_8__1 : rule__Application__Group_8__1__Impl ;
    public final void rule__Application__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1362:1: ( rule__Application__Group_8__1__Impl )
            // InternalSecurityDsl.g:1363:2: rule__Application__Group_8__1__Impl
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
    // InternalSecurityDsl.g:1369:1: rule__Application__Group_8__1__Impl : ( ( rule__Application__DescriptionAssignment_8_1 ) ) ;
    public final void rule__Application__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1373:1: ( ( ( rule__Application__DescriptionAssignment_8_1 ) ) )
            // InternalSecurityDsl.g:1374:1: ( ( rule__Application__DescriptionAssignment_8_1 ) )
            {
            // InternalSecurityDsl.g:1374:1: ( ( rule__Application__DescriptionAssignment_8_1 ) )
            // InternalSecurityDsl.g:1375:2: ( rule__Application__DescriptionAssignment_8_1 )
            {
             before(grammarAccess.getApplicationAccess().getDescriptionAssignment_8_1()); 
            // InternalSecurityDsl.g:1376:2: ( rule__Application__DescriptionAssignment_8_1 )
            // InternalSecurityDsl.g:1376:3: rule__Application__DescriptionAssignment_8_1
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
    // InternalSecurityDsl.g:1385:1: rule__Application__Group_9__0 : rule__Application__Group_9__0__Impl rule__Application__Group_9__1 ;
    public final void rule__Application__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1389:1: ( rule__Application__Group_9__0__Impl rule__Application__Group_9__1 )
            // InternalSecurityDsl.g:1390:2: rule__Application__Group_9__0__Impl rule__Application__Group_9__1
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
    // InternalSecurityDsl.g:1397:1: rule__Application__Group_9__0__Impl : ( 'port:' ) ;
    public final void rule__Application__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1401:1: ( ( 'port:' ) )
            // InternalSecurityDsl.g:1402:1: ( 'port:' )
            {
            // InternalSecurityDsl.g:1402:1: ( 'port:' )
            // InternalSecurityDsl.g:1403:2: 'port:'
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
    // InternalSecurityDsl.g:1412:1: rule__Application__Group_9__1 : rule__Application__Group_9__1__Impl ;
    public final void rule__Application__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1416:1: ( rule__Application__Group_9__1__Impl )
            // InternalSecurityDsl.g:1417:2: rule__Application__Group_9__1__Impl
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
    // InternalSecurityDsl.g:1423:1: rule__Application__Group_9__1__Impl : ( ( rule__Application__PortAssignment_9_1 ) ) ;
    public final void rule__Application__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1427:1: ( ( ( rule__Application__PortAssignment_9_1 ) ) )
            // InternalSecurityDsl.g:1428:1: ( ( rule__Application__PortAssignment_9_1 ) )
            {
            // InternalSecurityDsl.g:1428:1: ( ( rule__Application__PortAssignment_9_1 ) )
            // InternalSecurityDsl.g:1429:2: ( rule__Application__PortAssignment_9_1 )
            {
             before(grammarAccess.getApplicationAccess().getPortAssignment_9_1()); 
            // InternalSecurityDsl.g:1430:2: ( rule__Application__PortAssignment_9_1 )
            // InternalSecurityDsl.g:1430:3: rule__Application__PortAssignment_9_1
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
    // InternalSecurityDsl.g:1439:1: rule__Application__Group_10__0 : rule__Application__Group_10__0__Impl rule__Application__Group_10__1 ;
    public final void rule__Application__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1443:1: ( rule__Application__Group_10__0__Impl rule__Application__Group_10__1 )
            // InternalSecurityDsl.g:1444:2: rule__Application__Group_10__0__Impl rule__Application__Group_10__1
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
    // InternalSecurityDsl.g:1451:1: rule__Application__Group_10__0__Impl : ( 'hostname:' ) ;
    public final void rule__Application__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1455:1: ( ( 'hostname:' ) )
            // InternalSecurityDsl.g:1456:1: ( 'hostname:' )
            {
            // InternalSecurityDsl.g:1456:1: ( 'hostname:' )
            // InternalSecurityDsl.g:1457:2: 'hostname:'
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
    // InternalSecurityDsl.g:1466:1: rule__Application__Group_10__1 : rule__Application__Group_10__1__Impl ;
    public final void rule__Application__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1470:1: ( rule__Application__Group_10__1__Impl )
            // InternalSecurityDsl.g:1471:2: rule__Application__Group_10__1__Impl
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
    // InternalSecurityDsl.g:1477:1: rule__Application__Group_10__1__Impl : ( ( rule__Application__HostnameAssignment_10_1 ) ) ;
    public final void rule__Application__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1481:1: ( ( ( rule__Application__HostnameAssignment_10_1 ) ) )
            // InternalSecurityDsl.g:1482:1: ( ( rule__Application__HostnameAssignment_10_1 ) )
            {
            // InternalSecurityDsl.g:1482:1: ( ( rule__Application__HostnameAssignment_10_1 ) )
            // InternalSecurityDsl.g:1483:2: ( rule__Application__HostnameAssignment_10_1 )
            {
             before(grammarAccess.getApplicationAccess().getHostnameAssignment_10_1()); 
            // InternalSecurityDsl.g:1484:2: ( rule__Application__HostnameAssignment_10_1 )
            // InternalSecurityDsl.g:1484:3: rule__Application__HostnameAssignment_10_1
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
    // InternalSecurityDsl.g:1493:1: rule__Application__Group_11__0 : rule__Application__Group_11__0__Impl rule__Application__Group_11__1 ;
    public final void rule__Application__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1497:1: ( rule__Application__Group_11__0__Impl rule__Application__Group_11__1 )
            // InternalSecurityDsl.g:1498:2: rule__Application__Group_11__0__Impl rule__Application__Group_11__1
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
    // InternalSecurityDsl.g:1505:1: rule__Application__Group_11__0__Impl : ( 'database:' ) ;
    public final void rule__Application__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1509:1: ( ( 'database:' ) )
            // InternalSecurityDsl.g:1510:1: ( 'database:' )
            {
            // InternalSecurityDsl.g:1510:1: ( 'database:' )
            // InternalSecurityDsl.g:1511:2: 'database:'
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
    // InternalSecurityDsl.g:1520:1: rule__Application__Group_11__1 : rule__Application__Group_11__1__Impl ;
    public final void rule__Application__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1524:1: ( rule__Application__Group_11__1__Impl )
            // InternalSecurityDsl.g:1525:2: rule__Application__Group_11__1__Impl
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
    // InternalSecurityDsl.g:1531:1: rule__Application__Group_11__1__Impl : ( ( rule__Application__App_databaseAssignment_11_1 ) ) ;
    public final void rule__Application__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1535:1: ( ( ( rule__Application__App_databaseAssignment_11_1 ) ) )
            // InternalSecurityDsl.g:1536:1: ( ( rule__Application__App_databaseAssignment_11_1 ) )
            {
            // InternalSecurityDsl.g:1536:1: ( ( rule__Application__App_databaseAssignment_11_1 ) )
            // InternalSecurityDsl.g:1537:2: ( rule__Application__App_databaseAssignment_11_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_databaseAssignment_11_1()); 
            // InternalSecurityDsl.g:1538:2: ( rule__Application__App_databaseAssignment_11_1 )
            // InternalSecurityDsl.g:1538:3: rule__Application__App_databaseAssignment_11_1
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
    // InternalSecurityDsl.g:1547:1: rule__Application__Group_12__0 : rule__Application__Group_12__0__Impl rule__Application__Group_12__1 ;
    public final void rule__Application__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1551:1: ( rule__Application__Group_12__0__Impl rule__Application__Group_12__1 )
            // InternalSecurityDsl.g:1552:2: rule__Application__Group_12__0__Impl rule__Application__Group_12__1
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
    // InternalSecurityDsl.g:1559:1: rule__Application__Group_12__0__Impl : ( 'model:' ) ;
    public final void rule__Application__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1563:1: ( ( 'model:' ) )
            // InternalSecurityDsl.g:1564:1: ( 'model:' )
            {
            // InternalSecurityDsl.g:1564:1: ( 'model:' )
            // InternalSecurityDsl.g:1565:2: 'model:'
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
    // InternalSecurityDsl.g:1574:1: rule__Application__Group_12__1 : rule__Application__Group_12__1__Impl rule__Application__Group_12__2 ;
    public final void rule__Application__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1578:1: ( rule__Application__Group_12__1__Impl rule__Application__Group_12__2 )
            // InternalSecurityDsl.g:1579:2: rule__Application__Group_12__1__Impl rule__Application__Group_12__2
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
    // InternalSecurityDsl.g:1586:1: rule__Application__Group_12__1__Impl : ( ( rule__Application__Group_12_1__0 )? ) ;
    public final void rule__Application__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1590:1: ( ( ( rule__Application__Group_12_1__0 )? ) )
            // InternalSecurityDsl.g:1591:1: ( ( rule__Application__Group_12_1__0 )? )
            {
            // InternalSecurityDsl.g:1591:1: ( ( rule__Application__Group_12_1__0 )? )
            // InternalSecurityDsl.g:1592:2: ( rule__Application__Group_12_1__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_12_1()); 
            // InternalSecurityDsl.g:1593:2: ( rule__Application__Group_12_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==49) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSecurityDsl.g:1593:3: rule__Application__Group_12_1__0
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
    // InternalSecurityDsl.g:1601:1: rule__Application__Group_12__2 : rule__Application__Group_12__2__Impl ;
    public final void rule__Application__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1605:1: ( rule__Application__Group_12__2__Impl )
            // InternalSecurityDsl.g:1606:2: rule__Application__Group_12__2__Impl
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
    // InternalSecurityDsl.g:1612:1: rule__Application__Group_12__2__Impl : ( ( rule__Application__Group_12_2__0 )? ) ;
    public final void rule__Application__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1616:1: ( ( ( rule__Application__Group_12_2__0 )? ) )
            // InternalSecurityDsl.g:1617:1: ( ( rule__Application__Group_12_2__0 )? )
            {
            // InternalSecurityDsl.g:1617:1: ( ( rule__Application__Group_12_2__0 )? )
            // InternalSecurityDsl.g:1618:2: ( rule__Application__Group_12_2__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_12_2()); 
            // InternalSecurityDsl.g:1619:2: ( rule__Application__Group_12_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==50) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSecurityDsl.g:1619:3: rule__Application__Group_12_2__0
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
    // InternalSecurityDsl.g:1628:1: rule__Application__Group_12_1__0 : rule__Application__Group_12_1__0__Impl rule__Application__Group_12_1__1 ;
    public final void rule__Application__Group_12_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1632:1: ( rule__Application__Group_12_1__0__Impl rule__Application__Group_12_1__1 )
            // InternalSecurityDsl.g:1633:2: rule__Application__Group_12_1__0__Impl rule__Application__Group_12_1__1
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
    // InternalSecurityDsl.g:1640:1: rule__Application__Group_12_1__0__Impl : ( 'user:' ) ;
    public final void rule__Application__Group_12_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1644:1: ( ( 'user:' ) )
            // InternalSecurityDsl.g:1645:1: ( 'user:' )
            {
            // InternalSecurityDsl.g:1645:1: ( 'user:' )
            // InternalSecurityDsl.g:1646:2: 'user:'
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
    // InternalSecurityDsl.g:1655:1: rule__Application__Group_12_1__1 : rule__Application__Group_12_1__1__Impl ;
    public final void rule__Application__Group_12_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1659:1: ( rule__Application__Group_12_1__1__Impl )
            // InternalSecurityDsl.g:1660:2: rule__Application__Group_12_1__1__Impl
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
    // InternalSecurityDsl.g:1666:1: rule__Application__Group_12_1__1__Impl : ( ( rule__Application__App_entitiesAssignment_12_1_1 ) ) ;
    public final void rule__Application__Group_12_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1670:1: ( ( ( rule__Application__App_entitiesAssignment_12_1_1 ) ) )
            // InternalSecurityDsl.g:1671:1: ( ( rule__Application__App_entitiesAssignment_12_1_1 ) )
            {
            // InternalSecurityDsl.g:1671:1: ( ( rule__Application__App_entitiesAssignment_12_1_1 ) )
            // InternalSecurityDsl.g:1672:2: ( rule__Application__App_entitiesAssignment_12_1_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_entitiesAssignment_12_1_1()); 
            // InternalSecurityDsl.g:1673:2: ( rule__Application__App_entitiesAssignment_12_1_1 )
            // InternalSecurityDsl.g:1673:3: rule__Application__App_entitiesAssignment_12_1_1
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
    // InternalSecurityDsl.g:1682:1: rule__Application__Group_12_2__0 : rule__Application__Group_12_2__0__Impl rule__Application__Group_12_2__1 ;
    public final void rule__Application__Group_12_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1686:1: ( rule__Application__Group_12_2__0__Impl rule__Application__Group_12_2__1 )
            // InternalSecurityDsl.g:1687:2: rule__Application__Group_12_2__0__Impl rule__Application__Group_12_2__1
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
    // InternalSecurityDsl.g:1694:1: rule__Application__Group_12_2__0__Impl : ( 'role:' ) ;
    public final void rule__Application__Group_12_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1698:1: ( ( 'role:' ) )
            // InternalSecurityDsl.g:1699:1: ( 'role:' )
            {
            // InternalSecurityDsl.g:1699:1: ( 'role:' )
            // InternalSecurityDsl.g:1700:2: 'role:'
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
    // InternalSecurityDsl.g:1709:1: rule__Application__Group_12_2__1 : rule__Application__Group_12_2__1__Impl ;
    public final void rule__Application__Group_12_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1713:1: ( rule__Application__Group_12_2__1__Impl )
            // InternalSecurityDsl.g:1714:2: rule__Application__Group_12_2__1__Impl
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
    // InternalSecurityDsl.g:1720:1: rule__Application__Group_12_2__1__Impl : ( ( rule__Application__App_entitiesAssignment_12_2_1 ) ) ;
    public final void rule__Application__Group_12_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1724:1: ( ( ( rule__Application__App_entitiesAssignment_12_2_1 ) ) )
            // InternalSecurityDsl.g:1725:1: ( ( rule__Application__App_entitiesAssignment_12_2_1 ) )
            {
            // InternalSecurityDsl.g:1725:1: ( ( rule__Application__App_entitiesAssignment_12_2_1 ) )
            // InternalSecurityDsl.g:1726:2: ( rule__Application__App_entitiesAssignment_12_2_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_entitiesAssignment_12_2_1()); 
            // InternalSecurityDsl.g:1727:2: ( rule__Application__App_entitiesAssignment_12_2_1 )
            // InternalSecurityDsl.g:1727:3: rule__Application__App_entitiesAssignment_12_2_1
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
    // InternalSecurityDsl.g:1736:1: rule__Application__Group_13__0 : rule__Application__Group_13__0__Impl rule__Application__Group_13__1 ;
    public final void rule__Application__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1740:1: ( rule__Application__Group_13__0__Impl rule__Application__Group_13__1 )
            // InternalSecurityDsl.g:1741:2: rule__Application__Group_13__0__Impl rule__Application__Group_13__1
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
    // InternalSecurityDsl.g:1748:1: rule__Application__Group_13__0__Impl : ( 'security:' ) ;
    public final void rule__Application__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1752:1: ( ( 'security:' ) )
            // InternalSecurityDsl.g:1753:1: ( 'security:' )
            {
            // InternalSecurityDsl.g:1753:1: ( 'security:' )
            // InternalSecurityDsl.g:1754:2: 'security:'
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
    // InternalSecurityDsl.g:1763:1: rule__Application__Group_13__1 : rule__Application__Group_13__1__Impl ;
    public final void rule__Application__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1767:1: ( rule__Application__Group_13__1__Impl )
            // InternalSecurityDsl.g:1768:2: rule__Application__Group_13__1__Impl
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
    // InternalSecurityDsl.g:1774:1: rule__Application__Group_13__1__Impl : ( ( rule__Application__App_securityAssignment_13_1 ) ) ;
    public final void rule__Application__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1778:1: ( ( ( rule__Application__App_securityAssignment_13_1 ) ) )
            // InternalSecurityDsl.g:1779:1: ( ( rule__Application__App_securityAssignment_13_1 ) )
            {
            // InternalSecurityDsl.g:1779:1: ( ( rule__Application__App_securityAssignment_13_1 ) )
            // InternalSecurityDsl.g:1780:2: ( rule__Application__App_securityAssignment_13_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_securityAssignment_13_1()); 
            // InternalSecurityDsl.g:1781:2: ( rule__Application__App_securityAssignment_13_1 )
            // InternalSecurityDsl.g:1781:3: rule__Application__App_securityAssignment_13_1
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
    // InternalSecurityDsl.g:1790:1: rule__Application__Group_14__0 : rule__Application__Group_14__0__Impl rule__Application__Group_14__1 ;
    public final void rule__Application__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1794:1: ( rule__Application__Group_14__0__Impl rule__Application__Group_14__1 )
            // InternalSecurityDsl.g:1795:2: rule__Application__Group_14__0__Impl rule__Application__Group_14__1
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
    // InternalSecurityDsl.g:1802:1: rule__Application__Group_14__0__Impl : ( 'controller:' ) ;
    public final void rule__Application__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1806:1: ( ( 'controller:' ) )
            // InternalSecurityDsl.g:1807:1: ( 'controller:' )
            {
            // InternalSecurityDsl.g:1807:1: ( 'controller:' )
            // InternalSecurityDsl.g:1808:2: 'controller:'
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
    // InternalSecurityDsl.g:1817:1: rule__Application__Group_14__1 : rule__Application__Group_14__1__Impl ;
    public final void rule__Application__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1821:1: ( rule__Application__Group_14__1__Impl )
            // InternalSecurityDsl.g:1822:2: rule__Application__Group_14__1__Impl
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
    // InternalSecurityDsl.g:1828:1: rule__Application__Group_14__1__Impl : ( ( rule__Application__Group_14_1__0 )? ) ;
    public final void rule__Application__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1832:1: ( ( ( rule__Application__Group_14_1__0 )? ) )
            // InternalSecurityDsl.g:1833:1: ( ( rule__Application__Group_14_1__0 )? )
            {
            // InternalSecurityDsl.g:1833:1: ( ( rule__Application__Group_14_1__0 )? )
            // InternalSecurityDsl.g:1834:2: ( rule__Application__Group_14_1__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_14_1()); 
            // InternalSecurityDsl.g:1835:2: ( rule__Application__Group_14_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==53) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSecurityDsl.g:1835:3: rule__Application__Group_14_1__0
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
    // InternalSecurityDsl.g:1844:1: rule__Application__Group_14_1__0 : rule__Application__Group_14_1__0__Impl rule__Application__Group_14_1__1 ;
    public final void rule__Application__Group_14_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1848:1: ( rule__Application__Group_14_1__0__Impl rule__Application__Group_14_1__1 )
            // InternalSecurityDsl.g:1849:2: rule__Application__Group_14_1__0__Impl rule__Application__Group_14_1__1
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
    // InternalSecurityDsl.g:1856:1: rule__Application__Group_14_1__0__Impl : ( 'auth:' ) ;
    public final void rule__Application__Group_14_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1860:1: ( ( 'auth:' ) )
            // InternalSecurityDsl.g:1861:1: ( 'auth:' )
            {
            // InternalSecurityDsl.g:1861:1: ( 'auth:' )
            // InternalSecurityDsl.g:1862:2: 'auth:'
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
    // InternalSecurityDsl.g:1871:1: rule__Application__Group_14_1__1 : rule__Application__Group_14_1__1__Impl ;
    public final void rule__Application__Group_14_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1875:1: ( rule__Application__Group_14_1__1__Impl )
            // InternalSecurityDsl.g:1876:2: rule__Application__Group_14_1__1__Impl
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
    // InternalSecurityDsl.g:1882:1: rule__Application__Group_14_1__1__Impl : ( ( rule__Application__App_controllersAssignment_14_1_1 ) ) ;
    public final void rule__Application__Group_14_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1886:1: ( ( ( rule__Application__App_controllersAssignment_14_1_1 ) ) )
            // InternalSecurityDsl.g:1887:1: ( ( rule__Application__App_controllersAssignment_14_1_1 ) )
            {
            // InternalSecurityDsl.g:1887:1: ( ( rule__Application__App_controllersAssignment_14_1_1 ) )
            // InternalSecurityDsl.g:1888:2: ( rule__Application__App_controllersAssignment_14_1_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_controllersAssignment_14_1_1()); 
            // InternalSecurityDsl.g:1889:2: ( rule__Application__App_controllersAssignment_14_1_1 )
            // InternalSecurityDsl.g:1889:3: rule__Application__App_controllersAssignment_14_1_1
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
    // InternalSecurityDsl.g:1898:1: rule__Database__Group__0 : rule__Database__Group__0__Impl rule__Database__Group__1 ;
    public final void rule__Database__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1902:1: ( rule__Database__Group__0__Impl rule__Database__Group__1 )
            // InternalSecurityDsl.g:1903:2: rule__Database__Group__0__Impl rule__Database__Group__1
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
    // InternalSecurityDsl.g:1910:1: rule__Database__Group__0__Impl : ( 'vendor:' ) ;
    public final void rule__Database__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1914:1: ( ( 'vendor:' ) )
            // InternalSecurityDsl.g:1915:1: ( 'vendor:' )
            {
            // InternalSecurityDsl.g:1915:1: ( 'vendor:' )
            // InternalSecurityDsl.g:1916:2: 'vendor:'
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
    // InternalSecurityDsl.g:1925:1: rule__Database__Group__1 : rule__Database__Group__1__Impl rule__Database__Group__2 ;
    public final void rule__Database__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1929:1: ( rule__Database__Group__1__Impl rule__Database__Group__2 )
            // InternalSecurityDsl.g:1930:2: rule__Database__Group__1__Impl rule__Database__Group__2
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
    // InternalSecurityDsl.g:1937:1: rule__Database__Group__1__Impl : ( ( rule__Database__VendorNameAssignment_1 ) ) ;
    public final void rule__Database__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1941:1: ( ( ( rule__Database__VendorNameAssignment_1 ) ) )
            // InternalSecurityDsl.g:1942:1: ( ( rule__Database__VendorNameAssignment_1 ) )
            {
            // InternalSecurityDsl.g:1942:1: ( ( rule__Database__VendorNameAssignment_1 ) )
            // InternalSecurityDsl.g:1943:2: ( rule__Database__VendorNameAssignment_1 )
            {
             before(grammarAccess.getDatabaseAccess().getVendorNameAssignment_1()); 
            // InternalSecurityDsl.g:1944:2: ( rule__Database__VendorNameAssignment_1 )
            // InternalSecurityDsl.g:1944:3: rule__Database__VendorNameAssignment_1
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
    // InternalSecurityDsl.g:1952:1: rule__Database__Group__2 : rule__Database__Group__2__Impl rule__Database__Group__3 ;
    public final void rule__Database__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1956:1: ( rule__Database__Group__2__Impl rule__Database__Group__3 )
            // InternalSecurityDsl.g:1957:2: rule__Database__Group__2__Impl rule__Database__Group__3
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
    // InternalSecurityDsl.g:1964:1: rule__Database__Group__2__Impl : ( 'url:' ) ;
    public final void rule__Database__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1968:1: ( ( 'url:' ) )
            // InternalSecurityDsl.g:1969:1: ( 'url:' )
            {
            // InternalSecurityDsl.g:1969:1: ( 'url:' )
            // InternalSecurityDsl.g:1970:2: 'url:'
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
    // InternalSecurityDsl.g:1979:1: rule__Database__Group__3 : rule__Database__Group__3__Impl rule__Database__Group__4 ;
    public final void rule__Database__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1983:1: ( rule__Database__Group__3__Impl rule__Database__Group__4 )
            // InternalSecurityDsl.g:1984:2: rule__Database__Group__3__Impl rule__Database__Group__4
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
    // InternalSecurityDsl.g:1991:1: rule__Database__Group__3__Impl : ( ( rule__Database__UrlAssignment_3 ) ) ;
    public final void rule__Database__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1995:1: ( ( ( rule__Database__UrlAssignment_3 ) ) )
            // InternalSecurityDsl.g:1996:1: ( ( rule__Database__UrlAssignment_3 ) )
            {
            // InternalSecurityDsl.g:1996:1: ( ( rule__Database__UrlAssignment_3 ) )
            // InternalSecurityDsl.g:1997:2: ( rule__Database__UrlAssignment_3 )
            {
             before(grammarAccess.getDatabaseAccess().getUrlAssignment_3()); 
            // InternalSecurityDsl.g:1998:2: ( rule__Database__UrlAssignment_3 )
            // InternalSecurityDsl.g:1998:3: rule__Database__UrlAssignment_3
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
    // InternalSecurityDsl.g:2006:1: rule__Database__Group__4 : rule__Database__Group__4__Impl rule__Database__Group__5 ;
    public final void rule__Database__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2010:1: ( rule__Database__Group__4__Impl rule__Database__Group__5 )
            // InternalSecurityDsl.g:2011:2: rule__Database__Group__4__Impl rule__Database__Group__5
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
    // InternalSecurityDsl.g:2018:1: rule__Database__Group__4__Impl : ( 'username:' ) ;
    public final void rule__Database__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2022:1: ( ( 'username:' ) )
            // InternalSecurityDsl.g:2023:1: ( 'username:' )
            {
            // InternalSecurityDsl.g:2023:1: ( 'username:' )
            // InternalSecurityDsl.g:2024:2: 'username:'
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
    // InternalSecurityDsl.g:2033:1: rule__Database__Group__5 : rule__Database__Group__5__Impl rule__Database__Group__6 ;
    public final void rule__Database__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2037:1: ( rule__Database__Group__5__Impl rule__Database__Group__6 )
            // InternalSecurityDsl.g:2038:2: rule__Database__Group__5__Impl rule__Database__Group__6
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
    // InternalSecurityDsl.g:2045:1: rule__Database__Group__5__Impl : ( ( rule__Database__UsernameAssignment_5 ) ) ;
    public final void rule__Database__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2049:1: ( ( ( rule__Database__UsernameAssignment_5 ) ) )
            // InternalSecurityDsl.g:2050:1: ( ( rule__Database__UsernameAssignment_5 ) )
            {
            // InternalSecurityDsl.g:2050:1: ( ( rule__Database__UsernameAssignment_5 ) )
            // InternalSecurityDsl.g:2051:2: ( rule__Database__UsernameAssignment_5 )
            {
             before(grammarAccess.getDatabaseAccess().getUsernameAssignment_5()); 
            // InternalSecurityDsl.g:2052:2: ( rule__Database__UsernameAssignment_5 )
            // InternalSecurityDsl.g:2052:3: rule__Database__UsernameAssignment_5
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
    // InternalSecurityDsl.g:2060:1: rule__Database__Group__6 : rule__Database__Group__6__Impl rule__Database__Group__7 ;
    public final void rule__Database__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2064:1: ( rule__Database__Group__6__Impl rule__Database__Group__7 )
            // InternalSecurityDsl.g:2065:2: rule__Database__Group__6__Impl rule__Database__Group__7
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
    // InternalSecurityDsl.g:2072:1: rule__Database__Group__6__Impl : ( 'password:' ) ;
    public final void rule__Database__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2076:1: ( ( 'password:' ) )
            // InternalSecurityDsl.g:2077:1: ( 'password:' )
            {
            // InternalSecurityDsl.g:2077:1: ( 'password:' )
            // InternalSecurityDsl.g:2078:2: 'password:'
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
    // InternalSecurityDsl.g:2087:1: rule__Database__Group__7 : rule__Database__Group__7__Impl ;
    public final void rule__Database__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2091:1: ( rule__Database__Group__7__Impl )
            // InternalSecurityDsl.g:2092:2: rule__Database__Group__7__Impl
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
    // InternalSecurityDsl.g:2098:1: rule__Database__Group__7__Impl : ( ( rule__Database__PasswordAssignment_7 ) ) ;
    public final void rule__Database__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2102:1: ( ( ( rule__Database__PasswordAssignment_7 ) ) )
            // InternalSecurityDsl.g:2103:1: ( ( rule__Database__PasswordAssignment_7 ) )
            {
            // InternalSecurityDsl.g:2103:1: ( ( rule__Database__PasswordAssignment_7 ) )
            // InternalSecurityDsl.g:2104:2: ( rule__Database__PasswordAssignment_7 )
            {
             before(grammarAccess.getDatabaseAccess().getPasswordAssignment_7()); 
            // InternalSecurityDsl.g:2105:2: ( rule__Database__PasswordAssignment_7 )
            // InternalSecurityDsl.g:2105:3: rule__Database__PasswordAssignment_7
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
    // InternalSecurityDsl.g:2114:1: rule__ELongObject__Group__0 : rule__ELongObject__Group__0__Impl rule__ELongObject__Group__1 ;
    public final void rule__ELongObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2118:1: ( rule__ELongObject__Group__0__Impl rule__ELongObject__Group__1 )
            // InternalSecurityDsl.g:2119:2: rule__ELongObject__Group__0__Impl rule__ELongObject__Group__1
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
    // InternalSecurityDsl.g:2126:1: rule__ELongObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__ELongObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2130:1: ( ( ( '-' )? ) )
            // InternalSecurityDsl.g:2131:1: ( ( '-' )? )
            {
            // InternalSecurityDsl.g:2131:1: ( ( '-' )? )
            // InternalSecurityDsl.g:2132:2: ( '-' )?
            {
             before(grammarAccess.getELongObjectAccess().getHyphenMinusKeyword_0()); 
            // InternalSecurityDsl.g:2133:2: ( '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==58) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSecurityDsl.g:2133:3: '-'
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
    // InternalSecurityDsl.g:2141:1: rule__ELongObject__Group__1 : rule__ELongObject__Group__1__Impl ;
    public final void rule__ELongObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2145:1: ( rule__ELongObject__Group__1__Impl )
            // InternalSecurityDsl.g:2146:2: rule__ELongObject__Group__1__Impl
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
    // InternalSecurityDsl.g:2152:1: rule__ELongObject__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__ELongObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2156:1: ( ( RULE_INT ) )
            // InternalSecurityDsl.g:2157:1: ( RULE_INT )
            {
            // InternalSecurityDsl.g:2157:1: ( RULE_INT )
            // InternalSecurityDsl.g:2158:2: RULE_INT
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
    // InternalSecurityDsl.g:2168:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2172:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalSecurityDsl.g:2173:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalSecurityDsl.g:2180:1: rule__Attribute__Group__0__Impl : ( '{' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2184:1: ( ( '{' ) )
            // InternalSecurityDsl.g:2185:1: ( '{' )
            {
            // InternalSecurityDsl.g:2185:1: ( '{' )
            // InternalSecurityDsl.g:2186:2: '{'
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
    // InternalSecurityDsl.g:2195:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2199:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalSecurityDsl.g:2200:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalSecurityDsl.g:2207:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__IdentifierAssignment_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2211:1: ( ( ( rule__Attribute__IdentifierAssignment_1 )? ) )
            // InternalSecurityDsl.g:2212:1: ( ( rule__Attribute__IdentifierAssignment_1 )? )
            {
            // InternalSecurityDsl.g:2212:1: ( ( rule__Attribute__IdentifierAssignment_1 )? )
            // InternalSecurityDsl.g:2213:2: ( rule__Attribute__IdentifierAssignment_1 )?
            {
             before(grammarAccess.getAttributeAccess().getIdentifierAssignment_1()); 
            // InternalSecurityDsl.g:2214:2: ( rule__Attribute__IdentifierAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==89) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSecurityDsl.g:2214:3: rule__Attribute__IdentifierAssignment_1
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
    // InternalSecurityDsl.g:2222:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2226:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalSecurityDsl.g:2227:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
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
    // InternalSecurityDsl.g:2234:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__CredentialAssignment_2 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2238:1: ( ( ( rule__Attribute__CredentialAssignment_2 )? ) )
            // InternalSecurityDsl.g:2239:1: ( ( rule__Attribute__CredentialAssignment_2 )? )
            {
            // InternalSecurityDsl.g:2239:1: ( ( rule__Attribute__CredentialAssignment_2 )? )
            // InternalSecurityDsl.g:2240:2: ( rule__Attribute__CredentialAssignment_2 )?
            {
             before(grammarAccess.getAttributeAccess().getCredentialAssignment_2()); 
            // InternalSecurityDsl.g:2241:2: ( rule__Attribute__CredentialAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==90) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSecurityDsl.g:2241:3: rule__Attribute__CredentialAssignment_2
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
    // InternalSecurityDsl.g:2249:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2253:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalSecurityDsl.g:2254:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
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
    // InternalSecurityDsl.g:2261:1: rule__Attribute__Group__3__Impl : ( 'name:' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2265:1: ( ( 'name:' ) )
            // InternalSecurityDsl.g:2266:1: ( 'name:' )
            {
            // InternalSecurityDsl.g:2266:1: ( 'name:' )
            // InternalSecurityDsl.g:2267:2: 'name:'
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
    // InternalSecurityDsl.g:2276:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2280:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalSecurityDsl.g:2281:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
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
    // InternalSecurityDsl.g:2288:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__NameAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2292:1: ( ( ( rule__Attribute__NameAssignment_4 ) ) )
            // InternalSecurityDsl.g:2293:1: ( ( rule__Attribute__NameAssignment_4 ) )
            {
            // InternalSecurityDsl.g:2293:1: ( ( rule__Attribute__NameAssignment_4 ) )
            // InternalSecurityDsl.g:2294:2: ( rule__Attribute__NameAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_4()); 
            // InternalSecurityDsl.g:2295:2: ( rule__Attribute__NameAssignment_4 )
            // InternalSecurityDsl.g:2295:3: rule__Attribute__NameAssignment_4
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
    // InternalSecurityDsl.g:2303:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2307:1: ( rule__Attribute__Group__5__Impl rule__Attribute__Group__6 )
            // InternalSecurityDsl.g:2308:2: rule__Attribute__Group__5__Impl rule__Attribute__Group__6
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
    // InternalSecurityDsl.g:2315:1: rule__Attribute__Group__5__Impl : ( 'type:' ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2319:1: ( ( 'type:' ) )
            // InternalSecurityDsl.g:2320:1: ( 'type:' )
            {
            // InternalSecurityDsl.g:2320:1: ( 'type:' )
            // InternalSecurityDsl.g:2321:2: 'type:'
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
    // InternalSecurityDsl.g:2330:1: rule__Attribute__Group__6 : rule__Attribute__Group__6__Impl rule__Attribute__Group__7 ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2334:1: ( rule__Attribute__Group__6__Impl rule__Attribute__Group__7 )
            // InternalSecurityDsl.g:2335:2: rule__Attribute__Group__6__Impl rule__Attribute__Group__7
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
    // InternalSecurityDsl.g:2342:1: rule__Attribute__Group__6__Impl : ( ( rule__Attribute__TypeAssignment_6 ) ) ;
    public final void rule__Attribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2346:1: ( ( ( rule__Attribute__TypeAssignment_6 ) ) )
            // InternalSecurityDsl.g:2347:1: ( ( rule__Attribute__TypeAssignment_6 ) )
            {
            // InternalSecurityDsl.g:2347:1: ( ( rule__Attribute__TypeAssignment_6 ) )
            // InternalSecurityDsl.g:2348:2: ( rule__Attribute__TypeAssignment_6 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_6()); 
            // InternalSecurityDsl.g:2349:2: ( rule__Attribute__TypeAssignment_6 )
            // InternalSecurityDsl.g:2349:3: rule__Attribute__TypeAssignment_6
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
    // InternalSecurityDsl.g:2357:1: rule__Attribute__Group__7 : rule__Attribute__Group__7__Impl rule__Attribute__Group__8 ;
    public final void rule__Attribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2361:1: ( rule__Attribute__Group__7__Impl rule__Attribute__Group__8 )
            // InternalSecurityDsl.g:2362:2: rule__Attribute__Group__7__Impl rule__Attribute__Group__8
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
    // InternalSecurityDsl.g:2369:1: rule__Attribute__Group__7__Impl : ( ( rule__Attribute__Group_7__0 )? ) ;
    public final void rule__Attribute__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2373:1: ( ( ( rule__Attribute__Group_7__0 )? ) )
            // InternalSecurityDsl.g:2374:1: ( ( rule__Attribute__Group_7__0 )? )
            {
            // InternalSecurityDsl.g:2374:1: ( ( rule__Attribute__Group_7__0 )? )
            // InternalSecurityDsl.g:2375:2: ( rule__Attribute__Group_7__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_7()); 
            // InternalSecurityDsl.g:2376:2: ( rule__Attribute__Group_7__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==62) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSecurityDsl.g:2376:3: rule__Attribute__Group_7__0
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
    // InternalSecurityDsl.g:2384:1: rule__Attribute__Group__8 : rule__Attribute__Group__8__Impl ;
    public final void rule__Attribute__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2388:1: ( rule__Attribute__Group__8__Impl )
            // InternalSecurityDsl.g:2389:2: rule__Attribute__Group__8__Impl
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
    // InternalSecurityDsl.g:2395:1: rule__Attribute__Group__8__Impl : ( '}' ) ;
    public final void rule__Attribute__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2399:1: ( ( '}' ) )
            // InternalSecurityDsl.g:2400:1: ( '}' )
            {
            // InternalSecurityDsl.g:2400:1: ( '}' )
            // InternalSecurityDsl.g:2401:2: '}'
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
    // InternalSecurityDsl.g:2411:1: rule__Attribute__Group_7__0 : rule__Attribute__Group_7__0__Impl rule__Attribute__Group_7__1 ;
    public final void rule__Attribute__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2415:1: ( rule__Attribute__Group_7__0__Impl rule__Attribute__Group_7__1 )
            // InternalSecurityDsl.g:2416:2: rule__Attribute__Group_7__0__Impl rule__Attribute__Group_7__1
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
    // InternalSecurityDsl.g:2423:1: rule__Attribute__Group_7__0__Impl : ( 'collumnName:' ) ;
    public final void rule__Attribute__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2427:1: ( ( 'collumnName:' ) )
            // InternalSecurityDsl.g:2428:1: ( 'collumnName:' )
            {
            // InternalSecurityDsl.g:2428:1: ( 'collumnName:' )
            // InternalSecurityDsl.g:2429:2: 'collumnName:'
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
    // InternalSecurityDsl.g:2438:1: rule__Attribute__Group_7__1 : rule__Attribute__Group_7__1__Impl ;
    public final void rule__Attribute__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2442:1: ( rule__Attribute__Group_7__1__Impl )
            // InternalSecurityDsl.g:2443:2: rule__Attribute__Group_7__1__Impl
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
    // InternalSecurityDsl.g:2449:1: rule__Attribute__Group_7__1__Impl : ( ( rule__Attribute__CollumnNameAssignment_7_1 ) ) ;
    public final void rule__Attribute__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2453:1: ( ( ( rule__Attribute__CollumnNameAssignment_7_1 ) ) )
            // InternalSecurityDsl.g:2454:1: ( ( rule__Attribute__CollumnNameAssignment_7_1 ) )
            {
            // InternalSecurityDsl.g:2454:1: ( ( rule__Attribute__CollumnNameAssignment_7_1 ) )
            // InternalSecurityDsl.g:2455:2: ( rule__Attribute__CollumnNameAssignment_7_1 )
            {
             before(grammarAccess.getAttributeAccess().getCollumnNameAssignment_7_1()); 
            // InternalSecurityDsl.g:2456:2: ( rule__Attribute__CollumnNameAssignment_7_1 )
            // InternalSecurityDsl.g:2456:3: rule__Attribute__CollumnNameAssignment_7_1
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
    // InternalSecurityDsl.g:2465:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2469:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // InternalSecurityDsl.g:2470:2: rule__Role__Group__0__Impl rule__Role__Group__1
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
    // InternalSecurityDsl.g:2477:1: rule__Role__Group__0__Impl : ( () ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2481:1: ( ( () ) )
            // InternalSecurityDsl.g:2482:1: ( () )
            {
            // InternalSecurityDsl.g:2482:1: ( () )
            // InternalSecurityDsl.g:2483:2: ()
            {
             before(grammarAccess.getRoleAccess().getRoleAction_0()); 
            // InternalSecurityDsl.g:2484:2: ()
            // InternalSecurityDsl.g:2484:3: 
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
    // InternalSecurityDsl.g:2492:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2496:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // InternalSecurityDsl.g:2497:2: rule__Role__Group__1__Impl rule__Role__Group__2
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
    // InternalSecurityDsl.g:2504:1: rule__Role__Group__1__Impl : ( ( rule__Role__Group_1__0 )? ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2508:1: ( ( ( rule__Role__Group_1__0 )? ) )
            // InternalSecurityDsl.g:2509:1: ( ( rule__Role__Group_1__0 )? )
            {
            // InternalSecurityDsl.g:2509:1: ( ( rule__Role__Group_1__0 )? )
            // InternalSecurityDsl.g:2510:2: ( rule__Role__Group_1__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_1()); 
            // InternalSecurityDsl.g:2511:2: ( rule__Role__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==63) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSecurityDsl.g:2511:3: rule__Role__Group_1__0
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
    // InternalSecurityDsl.g:2519:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2523:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // InternalSecurityDsl.g:2524:2: rule__Role__Group__2__Impl rule__Role__Group__3
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
    // InternalSecurityDsl.g:2531:1: rule__Role__Group__2__Impl : ( ( rule__Role__Group_2__0 )? ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2535:1: ( ( ( rule__Role__Group_2__0 )? ) )
            // InternalSecurityDsl.g:2536:1: ( ( rule__Role__Group_2__0 )? )
            {
            // InternalSecurityDsl.g:2536:1: ( ( rule__Role__Group_2__0 )? )
            // InternalSecurityDsl.g:2537:2: ( rule__Role__Group_2__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_2()); 
            // InternalSecurityDsl.g:2538:2: ( rule__Role__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==64) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSecurityDsl.g:2538:3: rule__Role__Group_2__0
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
    // InternalSecurityDsl.g:2546:1: rule__Role__Group__3 : rule__Role__Group__3__Impl ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2550:1: ( rule__Role__Group__3__Impl )
            // InternalSecurityDsl.g:2551:2: rule__Role__Group__3__Impl
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
    // InternalSecurityDsl.g:2557:1: rule__Role__Group__3__Impl : ( ( rule__Role__Group_3__0 )? ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2561:1: ( ( ( rule__Role__Group_3__0 )? ) )
            // InternalSecurityDsl.g:2562:1: ( ( rule__Role__Group_3__0 )? )
            {
            // InternalSecurityDsl.g:2562:1: ( ( rule__Role__Group_3__0 )? )
            // InternalSecurityDsl.g:2563:2: ( rule__Role__Group_3__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_3()); 
            // InternalSecurityDsl.g:2564:2: ( rule__Role__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==68) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSecurityDsl.g:2564:3: rule__Role__Group_3__0
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
    // InternalSecurityDsl.g:2573:1: rule__Role__Group_1__0 : rule__Role__Group_1__0__Impl rule__Role__Group_1__1 ;
    public final void rule__Role__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2577:1: ( rule__Role__Group_1__0__Impl rule__Role__Group_1__1 )
            // InternalSecurityDsl.g:2578:2: rule__Role__Group_1__0__Impl rule__Role__Group_1__1
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
    // InternalSecurityDsl.g:2585:1: rule__Role__Group_1__0__Impl : ( 'tableName:' ) ;
    public final void rule__Role__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2589:1: ( ( 'tableName:' ) )
            // InternalSecurityDsl.g:2590:1: ( 'tableName:' )
            {
            // InternalSecurityDsl.g:2590:1: ( 'tableName:' )
            // InternalSecurityDsl.g:2591:2: 'tableName:'
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
    // InternalSecurityDsl.g:2600:1: rule__Role__Group_1__1 : rule__Role__Group_1__1__Impl ;
    public final void rule__Role__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2604:1: ( rule__Role__Group_1__1__Impl )
            // InternalSecurityDsl.g:2605:2: rule__Role__Group_1__1__Impl
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
    // InternalSecurityDsl.g:2611:1: rule__Role__Group_1__1__Impl : ( ( rule__Role__TableNameAssignment_1_1 ) ) ;
    public final void rule__Role__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2615:1: ( ( ( rule__Role__TableNameAssignment_1_1 ) ) )
            // InternalSecurityDsl.g:2616:1: ( ( rule__Role__TableNameAssignment_1_1 ) )
            {
            // InternalSecurityDsl.g:2616:1: ( ( rule__Role__TableNameAssignment_1_1 ) )
            // InternalSecurityDsl.g:2617:2: ( rule__Role__TableNameAssignment_1_1 )
            {
             before(grammarAccess.getRoleAccess().getTableNameAssignment_1_1()); 
            // InternalSecurityDsl.g:2618:2: ( rule__Role__TableNameAssignment_1_1 )
            // InternalSecurityDsl.g:2618:3: rule__Role__TableNameAssignment_1_1
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
    // InternalSecurityDsl.g:2627:1: rule__Role__Group_2__0 : rule__Role__Group_2__0__Impl rule__Role__Group_2__1 ;
    public final void rule__Role__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2631:1: ( rule__Role__Group_2__0__Impl rule__Role__Group_2__1 )
            // InternalSecurityDsl.g:2632:2: rule__Role__Group_2__0__Impl rule__Role__Group_2__1
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
    // InternalSecurityDsl.g:2639:1: rule__Role__Group_2__0__Impl : ( 'attributes:' ) ;
    public final void rule__Role__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2643:1: ( ( 'attributes:' ) )
            // InternalSecurityDsl.g:2644:1: ( 'attributes:' )
            {
            // InternalSecurityDsl.g:2644:1: ( 'attributes:' )
            // InternalSecurityDsl.g:2645:2: 'attributes:'
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
    // InternalSecurityDsl.g:2654:1: rule__Role__Group_2__1 : rule__Role__Group_2__1__Impl rule__Role__Group_2__2 ;
    public final void rule__Role__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2658:1: ( rule__Role__Group_2__1__Impl rule__Role__Group_2__2 )
            // InternalSecurityDsl.g:2659:2: rule__Role__Group_2__1__Impl rule__Role__Group_2__2
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
    // InternalSecurityDsl.g:2666:1: rule__Role__Group_2__1__Impl : ( '[' ) ;
    public final void rule__Role__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2670:1: ( ( '[' ) )
            // InternalSecurityDsl.g:2671:1: ( '[' )
            {
            // InternalSecurityDsl.g:2671:1: ( '[' )
            // InternalSecurityDsl.g:2672:2: '['
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
    // InternalSecurityDsl.g:2681:1: rule__Role__Group_2__2 : rule__Role__Group_2__2__Impl rule__Role__Group_2__3 ;
    public final void rule__Role__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2685:1: ( rule__Role__Group_2__2__Impl rule__Role__Group_2__3 )
            // InternalSecurityDsl.g:2686:2: rule__Role__Group_2__2__Impl rule__Role__Group_2__3
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
    // InternalSecurityDsl.g:2693:1: rule__Role__Group_2__2__Impl : ( ( rule__Role__Entity_attributesAssignment_2_2 ) ) ;
    public final void rule__Role__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2697:1: ( ( ( rule__Role__Entity_attributesAssignment_2_2 ) ) )
            // InternalSecurityDsl.g:2698:1: ( ( rule__Role__Entity_attributesAssignment_2_2 ) )
            {
            // InternalSecurityDsl.g:2698:1: ( ( rule__Role__Entity_attributesAssignment_2_2 ) )
            // InternalSecurityDsl.g:2699:2: ( rule__Role__Entity_attributesAssignment_2_2 )
            {
             before(grammarAccess.getRoleAccess().getEntity_attributesAssignment_2_2()); 
            // InternalSecurityDsl.g:2700:2: ( rule__Role__Entity_attributesAssignment_2_2 )
            // InternalSecurityDsl.g:2700:3: rule__Role__Entity_attributesAssignment_2_2
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
    // InternalSecurityDsl.g:2708:1: rule__Role__Group_2__3 : rule__Role__Group_2__3__Impl rule__Role__Group_2__4 ;
    public final void rule__Role__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2712:1: ( rule__Role__Group_2__3__Impl rule__Role__Group_2__4 )
            // InternalSecurityDsl.g:2713:2: rule__Role__Group_2__3__Impl rule__Role__Group_2__4
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
    // InternalSecurityDsl.g:2720:1: rule__Role__Group_2__3__Impl : ( ( rule__Role__Group_2_3__0 )* ) ;
    public final void rule__Role__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2724:1: ( ( ( rule__Role__Group_2_3__0 )* ) )
            // InternalSecurityDsl.g:2725:1: ( ( rule__Role__Group_2_3__0 )* )
            {
            // InternalSecurityDsl.g:2725:1: ( ( rule__Role__Group_2_3__0 )* )
            // InternalSecurityDsl.g:2726:2: ( rule__Role__Group_2_3__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_2_3()); 
            // InternalSecurityDsl.g:2727:2: ( rule__Role__Group_2_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==67) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalSecurityDsl.g:2727:3: rule__Role__Group_2_3__0
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
    // InternalSecurityDsl.g:2735:1: rule__Role__Group_2__4 : rule__Role__Group_2__4__Impl ;
    public final void rule__Role__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2739:1: ( rule__Role__Group_2__4__Impl )
            // InternalSecurityDsl.g:2740:2: rule__Role__Group_2__4__Impl
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
    // InternalSecurityDsl.g:2746:1: rule__Role__Group_2__4__Impl : ( ']' ) ;
    public final void rule__Role__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2750:1: ( ( ']' ) )
            // InternalSecurityDsl.g:2751:1: ( ']' )
            {
            // InternalSecurityDsl.g:2751:1: ( ']' )
            // InternalSecurityDsl.g:2752:2: ']'
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
    // InternalSecurityDsl.g:2762:1: rule__Role__Group_2_3__0 : rule__Role__Group_2_3__0__Impl rule__Role__Group_2_3__1 ;
    public final void rule__Role__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2766:1: ( rule__Role__Group_2_3__0__Impl rule__Role__Group_2_3__1 )
            // InternalSecurityDsl.g:2767:2: rule__Role__Group_2_3__0__Impl rule__Role__Group_2_3__1
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
    // InternalSecurityDsl.g:2774:1: rule__Role__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__Role__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2778:1: ( ( ',' ) )
            // InternalSecurityDsl.g:2779:1: ( ',' )
            {
            // InternalSecurityDsl.g:2779:1: ( ',' )
            // InternalSecurityDsl.g:2780:2: ','
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
    // InternalSecurityDsl.g:2789:1: rule__Role__Group_2_3__1 : rule__Role__Group_2_3__1__Impl ;
    public final void rule__Role__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2793:1: ( rule__Role__Group_2_3__1__Impl )
            // InternalSecurityDsl.g:2794:2: rule__Role__Group_2_3__1__Impl
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
    // InternalSecurityDsl.g:2800:1: rule__Role__Group_2_3__1__Impl : ( ( rule__Role__Entity_attributesAssignment_2_3_1 ) ) ;
    public final void rule__Role__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2804:1: ( ( ( rule__Role__Entity_attributesAssignment_2_3_1 ) ) )
            // InternalSecurityDsl.g:2805:1: ( ( rule__Role__Entity_attributesAssignment_2_3_1 ) )
            {
            // InternalSecurityDsl.g:2805:1: ( ( rule__Role__Entity_attributesAssignment_2_3_1 ) )
            // InternalSecurityDsl.g:2806:2: ( rule__Role__Entity_attributesAssignment_2_3_1 )
            {
             before(grammarAccess.getRoleAccess().getEntity_attributesAssignment_2_3_1()); 
            // InternalSecurityDsl.g:2807:2: ( rule__Role__Entity_attributesAssignment_2_3_1 )
            // InternalSecurityDsl.g:2807:3: rule__Role__Entity_attributesAssignment_2_3_1
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
    // InternalSecurityDsl.g:2816:1: rule__Role__Group_3__0 : rule__Role__Group_3__0__Impl rule__Role__Group_3__1 ;
    public final void rule__Role__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2820:1: ( rule__Role__Group_3__0__Impl rule__Role__Group_3__1 )
            // InternalSecurityDsl.g:2821:2: rule__Role__Group_3__0__Impl rule__Role__Group_3__1
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
    // InternalSecurityDsl.g:2828:1: rule__Role__Group_3__0__Impl : ( 'roles:' ) ;
    public final void rule__Role__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2832:1: ( ( 'roles:' ) )
            // InternalSecurityDsl.g:2833:1: ( 'roles:' )
            {
            // InternalSecurityDsl.g:2833:1: ( 'roles:' )
            // InternalSecurityDsl.g:2834:2: 'roles:'
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
    // InternalSecurityDsl.g:2843:1: rule__Role__Group_3__1 : rule__Role__Group_3__1__Impl rule__Role__Group_3__2 ;
    public final void rule__Role__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2847:1: ( rule__Role__Group_3__1__Impl rule__Role__Group_3__2 )
            // InternalSecurityDsl.g:2848:2: rule__Role__Group_3__1__Impl rule__Role__Group_3__2
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
    // InternalSecurityDsl.g:2855:1: rule__Role__Group_3__1__Impl : ( '[' ) ;
    public final void rule__Role__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2859:1: ( ( '[' ) )
            // InternalSecurityDsl.g:2860:1: ( '[' )
            {
            // InternalSecurityDsl.g:2860:1: ( '[' )
            // InternalSecurityDsl.g:2861:2: '['
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
    // InternalSecurityDsl.g:2870:1: rule__Role__Group_3__2 : rule__Role__Group_3__2__Impl rule__Role__Group_3__3 ;
    public final void rule__Role__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2874:1: ( rule__Role__Group_3__2__Impl rule__Role__Group_3__3 )
            // InternalSecurityDsl.g:2875:2: rule__Role__Group_3__2__Impl rule__Role__Group_3__3
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
    // InternalSecurityDsl.g:2882:1: rule__Role__Group_3__2__Impl : ( ( rule__Role__Role_instancesAssignment_3_2 ) ) ;
    public final void rule__Role__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2886:1: ( ( ( rule__Role__Role_instancesAssignment_3_2 ) ) )
            // InternalSecurityDsl.g:2887:1: ( ( rule__Role__Role_instancesAssignment_3_2 ) )
            {
            // InternalSecurityDsl.g:2887:1: ( ( rule__Role__Role_instancesAssignment_3_2 ) )
            // InternalSecurityDsl.g:2888:2: ( rule__Role__Role_instancesAssignment_3_2 )
            {
             before(grammarAccess.getRoleAccess().getRole_instancesAssignment_3_2()); 
            // InternalSecurityDsl.g:2889:2: ( rule__Role__Role_instancesAssignment_3_2 )
            // InternalSecurityDsl.g:2889:3: rule__Role__Role_instancesAssignment_3_2
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
    // InternalSecurityDsl.g:2897:1: rule__Role__Group_3__3 : rule__Role__Group_3__3__Impl rule__Role__Group_3__4 ;
    public final void rule__Role__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2901:1: ( rule__Role__Group_3__3__Impl rule__Role__Group_3__4 )
            // InternalSecurityDsl.g:2902:2: rule__Role__Group_3__3__Impl rule__Role__Group_3__4
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
    // InternalSecurityDsl.g:2909:1: rule__Role__Group_3__3__Impl : ( ( rule__Role__Group_3_3__0 )* ) ;
    public final void rule__Role__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2913:1: ( ( ( rule__Role__Group_3_3__0 )* ) )
            // InternalSecurityDsl.g:2914:1: ( ( rule__Role__Group_3_3__0 )* )
            {
            // InternalSecurityDsl.g:2914:1: ( ( rule__Role__Group_3_3__0 )* )
            // InternalSecurityDsl.g:2915:2: ( rule__Role__Group_3_3__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_3_3()); 
            // InternalSecurityDsl.g:2916:2: ( rule__Role__Group_3_3__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==67) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSecurityDsl.g:2916:3: rule__Role__Group_3_3__0
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
    // InternalSecurityDsl.g:2924:1: rule__Role__Group_3__4 : rule__Role__Group_3__4__Impl ;
    public final void rule__Role__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2928:1: ( rule__Role__Group_3__4__Impl )
            // InternalSecurityDsl.g:2929:2: rule__Role__Group_3__4__Impl
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
    // InternalSecurityDsl.g:2935:1: rule__Role__Group_3__4__Impl : ( ']' ) ;
    public final void rule__Role__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2939:1: ( ( ']' ) )
            // InternalSecurityDsl.g:2940:1: ( ']' )
            {
            // InternalSecurityDsl.g:2940:1: ( ']' )
            // InternalSecurityDsl.g:2941:2: ']'
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
    // InternalSecurityDsl.g:2951:1: rule__Role__Group_3_3__0 : rule__Role__Group_3_3__0__Impl rule__Role__Group_3_3__1 ;
    public final void rule__Role__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2955:1: ( rule__Role__Group_3_3__0__Impl rule__Role__Group_3_3__1 )
            // InternalSecurityDsl.g:2956:2: rule__Role__Group_3_3__0__Impl rule__Role__Group_3_3__1
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
    // InternalSecurityDsl.g:2963:1: rule__Role__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Role__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2967:1: ( ( ',' ) )
            // InternalSecurityDsl.g:2968:1: ( ',' )
            {
            // InternalSecurityDsl.g:2968:1: ( ',' )
            // InternalSecurityDsl.g:2969:2: ','
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
    // InternalSecurityDsl.g:2978:1: rule__Role__Group_3_3__1 : rule__Role__Group_3_3__1__Impl ;
    public final void rule__Role__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2982:1: ( rule__Role__Group_3_3__1__Impl )
            // InternalSecurityDsl.g:2983:2: rule__Role__Group_3_3__1__Impl
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
    // InternalSecurityDsl.g:2989:1: rule__Role__Group_3_3__1__Impl : ( ( rule__Role__Role_instancesAssignment_3_3_1 ) ) ;
    public final void rule__Role__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2993:1: ( ( ( rule__Role__Role_instancesAssignment_3_3_1 ) ) )
            // InternalSecurityDsl.g:2994:1: ( ( rule__Role__Role_instancesAssignment_3_3_1 ) )
            {
            // InternalSecurityDsl.g:2994:1: ( ( rule__Role__Role_instancesAssignment_3_3_1 ) )
            // InternalSecurityDsl.g:2995:2: ( rule__Role__Role_instancesAssignment_3_3_1 )
            {
             before(grammarAccess.getRoleAccess().getRole_instancesAssignment_3_3_1()); 
            // InternalSecurityDsl.g:2996:2: ( rule__Role__Role_instancesAssignment_3_3_1 )
            // InternalSecurityDsl.g:2996:3: rule__Role__Role_instancesAssignment_3_3_1
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
    // InternalSecurityDsl.g:3005:1: rule__User__Group__0 : rule__User__Group__0__Impl rule__User__Group__1 ;
    public final void rule__User__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3009:1: ( rule__User__Group__0__Impl rule__User__Group__1 )
            // InternalSecurityDsl.g:3010:2: rule__User__Group__0__Impl rule__User__Group__1
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
    // InternalSecurityDsl.g:3017:1: rule__User__Group__0__Impl : ( () ) ;
    public final void rule__User__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3021:1: ( ( () ) )
            // InternalSecurityDsl.g:3022:1: ( () )
            {
            // InternalSecurityDsl.g:3022:1: ( () )
            // InternalSecurityDsl.g:3023:2: ()
            {
             before(grammarAccess.getUserAccess().getUserAction_0()); 
            // InternalSecurityDsl.g:3024:2: ()
            // InternalSecurityDsl.g:3024:3: 
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
    // InternalSecurityDsl.g:3032:1: rule__User__Group__1 : rule__User__Group__1__Impl rule__User__Group__2 ;
    public final void rule__User__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3036:1: ( rule__User__Group__1__Impl rule__User__Group__2 )
            // InternalSecurityDsl.g:3037:2: rule__User__Group__1__Impl rule__User__Group__2
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
    // InternalSecurityDsl.g:3044:1: rule__User__Group__1__Impl : ( ( rule__User__Group_1__0 )? ) ;
    public final void rule__User__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3048:1: ( ( ( rule__User__Group_1__0 )? ) )
            // InternalSecurityDsl.g:3049:1: ( ( rule__User__Group_1__0 )? )
            {
            // InternalSecurityDsl.g:3049:1: ( ( rule__User__Group_1__0 )? )
            // InternalSecurityDsl.g:3050:2: ( rule__User__Group_1__0 )?
            {
             before(grammarAccess.getUserAccess().getGroup_1()); 
            // InternalSecurityDsl.g:3051:2: ( rule__User__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==63) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSecurityDsl.g:3051:3: rule__User__Group_1__0
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
    // InternalSecurityDsl.g:3059:1: rule__User__Group__2 : rule__User__Group__2__Impl ;
    public final void rule__User__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3063:1: ( rule__User__Group__2__Impl )
            // InternalSecurityDsl.g:3064:2: rule__User__Group__2__Impl
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
    // InternalSecurityDsl.g:3070:1: rule__User__Group__2__Impl : ( ( rule__User__Group_2__0 )? ) ;
    public final void rule__User__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3074:1: ( ( ( rule__User__Group_2__0 )? ) )
            // InternalSecurityDsl.g:3075:1: ( ( rule__User__Group_2__0 )? )
            {
            // InternalSecurityDsl.g:3075:1: ( ( rule__User__Group_2__0 )? )
            // InternalSecurityDsl.g:3076:2: ( rule__User__Group_2__0 )?
            {
             before(grammarAccess.getUserAccess().getGroup_2()); 
            // InternalSecurityDsl.g:3077:2: ( rule__User__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==64) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSecurityDsl.g:3077:3: rule__User__Group_2__0
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
    // InternalSecurityDsl.g:3086:1: rule__User__Group_1__0 : rule__User__Group_1__0__Impl rule__User__Group_1__1 ;
    public final void rule__User__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3090:1: ( rule__User__Group_1__0__Impl rule__User__Group_1__1 )
            // InternalSecurityDsl.g:3091:2: rule__User__Group_1__0__Impl rule__User__Group_1__1
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
    // InternalSecurityDsl.g:3098:1: rule__User__Group_1__0__Impl : ( 'tableName:' ) ;
    public final void rule__User__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3102:1: ( ( 'tableName:' ) )
            // InternalSecurityDsl.g:3103:1: ( 'tableName:' )
            {
            // InternalSecurityDsl.g:3103:1: ( 'tableName:' )
            // InternalSecurityDsl.g:3104:2: 'tableName:'
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
    // InternalSecurityDsl.g:3113:1: rule__User__Group_1__1 : rule__User__Group_1__1__Impl ;
    public final void rule__User__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3117:1: ( rule__User__Group_1__1__Impl )
            // InternalSecurityDsl.g:3118:2: rule__User__Group_1__1__Impl
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
    // InternalSecurityDsl.g:3124:1: rule__User__Group_1__1__Impl : ( ( rule__User__TableNameAssignment_1_1 ) ) ;
    public final void rule__User__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3128:1: ( ( ( rule__User__TableNameAssignment_1_1 ) ) )
            // InternalSecurityDsl.g:3129:1: ( ( rule__User__TableNameAssignment_1_1 ) )
            {
            // InternalSecurityDsl.g:3129:1: ( ( rule__User__TableNameAssignment_1_1 ) )
            // InternalSecurityDsl.g:3130:2: ( rule__User__TableNameAssignment_1_1 )
            {
             before(grammarAccess.getUserAccess().getTableNameAssignment_1_1()); 
            // InternalSecurityDsl.g:3131:2: ( rule__User__TableNameAssignment_1_1 )
            // InternalSecurityDsl.g:3131:3: rule__User__TableNameAssignment_1_1
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
    // InternalSecurityDsl.g:3140:1: rule__User__Group_2__0 : rule__User__Group_2__0__Impl rule__User__Group_2__1 ;
    public final void rule__User__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3144:1: ( rule__User__Group_2__0__Impl rule__User__Group_2__1 )
            // InternalSecurityDsl.g:3145:2: rule__User__Group_2__0__Impl rule__User__Group_2__1
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
    // InternalSecurityDsl.g:3152:1: rule__User__Group_2__0__Impl : ( 'attributes:' ) ;
    public final void rule__User__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3156:1: ( ( 'attributes:' ) )
            // InternalSecurityDsl.g:3157:1: ( 'attributes:' )
            {
            // InternalSecurityDsl.g:3157:1: ( 'attributes:' )
            // InternalSecurityDsl.g:3158:2: 'attributes:'
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
    // InternalSecurityDsl.g:3167:1: rule__User__Group_2__1 : rule__User__Group_2__1__Impl rule__User__Group_2__2 ;
    public final void rule__User__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3171:1: ( rule__User__Group_2__1__Impl rule__User__Group_2__2 )
            // InternalSecurityDsl.g:3172:2: rule__User__Group_2__1__Impl rule__User__Group_2__2
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
    // InternalSecurityDsl.g:3179:1: rule__User__Group_2__1__Impl : ( '[' ) ;
    public final void rule__User__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3183:1: ( ( '[' ) )
            // InternalSecurityDsl.g:3184:1: ( '[' )
            {
            // InternalSecurityDsl.g:3184:1: ( '[' )
            // InternalSecurityDsl.g:3185:2: '['
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
    // InternalSecurityDsl.g:3194:1: rule__User__Group_2__2 : rule__User__Group_2__2__Impl rule__User__Group_2__3 ;
    public final void rule__User__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3198:1: ( rule__User__Group_2__2__Impl rule__User__Group_2__3 )
            // InternalSecurityDsl.g:3199:2: rule__User__Group_2__2__Impl rule__User__Group_2__3
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
    // InternalSecurityDsl.g:3206:1: rule__User__Group_2__2__Impl : ( ( rule__User__Entity_attributesAssignment_2_2 ) ) ;
    public final void rule__User__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3210:1: ( ( ( rule__User__Entity_attributesAssignment_2_2 ) ) )
            // InternalSecurityDsl.g:3211:1: ( ( rule__User__Entity_attributesAssignment_2_2 ) )
            {
            // InternalSecurityDsl.g:3211:1: ( ( rule__User__Entity_attributesAssignment_2_2 ) )
            // InternalSecurityDsl.g:3212:2: ( rule__User__Entity_attributesAssignment_2_2 )
            {
             before(grammarAccess.getUserAccess().getEntity_attributesAssignment_2_2()); 
            // InternalSecurityDsl.g:3213:2: ( rule__User__Entity_attributesAssignment_2_2 )
            // InternalSecurityDsl.g:3213:3: rule__User__Entity_attributesAssignment_2_2
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
    // InternalSecurityDsl.g:3221:1: rule__User__Group_2__3 : rule__User__Group_2__3__Impl rule__User__Group_2__4 ;
    public final void rule__User__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3225:1: ( rule__User__Group_2__3__Impl rule__User__Group_2__4 )
            // InternalSecurityDsl.g:3226:2: rule__User__Group_2__3__Impl rule__User__Group_2__4
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
    // InternalSecurityDsl.g:3233:1: rule__User__Group_2__3__Impl : ( ( rule__User__Group_2_3__0 )* ) ;
    public final void rule__User__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3237:1: ( ( ( rule__User__Group_2_3__0 )* ) )
            // InternalSecurityDsl.g:3238:1: ( ( rule__User__Group_2_3__0 )* )
            {
            // InternalSecurityDsl.g:3238:1: ( ( rule__User__Group_2_3__0 )* )
            // InternalSecurityDsl.g:3239:2: ( rule__User__Group_2_3__0 )*
            {
             before(grammarAccess.getUserAccess().getGroup_2_3()); 
            // InternalSecurityDsl.g:3240:2: ( rule__User__Group_2_3__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==67) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalSecurityDsl.g:3240:3: rule__User__Group_2_3__0
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
    // InternalSecurityDsl.g:3248:1: rule__User__Group_2__4 : rule__User__Group_2__4__Impl ;
    public final void rule__User__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3252:1: ( rule__User__Group_2__4__Impl )
            // InternalSecurityDsl.g:3253:2: rule__User__Group_2__4__Impl
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
    // InternalSecurityDsl.g:3259:1: rule__User__Group_2__4__Impl : ( ']' ) ;
    public final void rule__User__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3263:1: ( ( ']' ) )
            // InternalSecurityDsl.g:3264:1: ( ']' )
            {
            // InternalSecurityDsl.g:3264:1: ( ']' )
            // InternalSecurityDsl.g:3265:2: ']'
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
    // InternalSecurityDsl.g:3275:1: rule__User__Group_2_3__0 : rule__User__Group_2_3__0__Impl rule__User__Group_2_3__1 ;
    public final void rule__User__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3279:1: ( rule__User__Group_2_3__0__Impl rule__User__Group_2_3__1 )
            // InternalSecurityDsl.g:3280:2: rule__User__Group_2_3__0__Impl rule__User__Group_2_3__1
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
    // InternalSecurityDsl.g:3287:1: rule__User__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__User__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3291:1: ( ( ',' ) )
            // InternalSecurityDsl.g:3292:1: ( ',' )
            {
            // InternalSecurityDsl.g:3292:1: ( ',' )
            // InternalSecurityDsl.g:3293:2: ','
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
    // InternalSecurityDsl.g:3302:1: rule__User__Group_2_3__1 : rule__User__Group_2_3__1__Impl ;
    public final void rule__User__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3306:1: ( rule__User__Group_2_3__1__Impl )
            // InternalSecurityDsl.g:3307:2: rule__User__Group_2_3__1__Impl
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
    // InternalSecurityDsl.g:3313:1: rule__User__Group_2_3__1__Impl : ( ( rule__User__Entity_attributesAssignment_2_3_1 ) ) ;
    public final void rule__User__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3317:1: ( ( ( rule__User__Entity_attributesAssignment_2_3_1 ) ) )
            // InternalSecurityDsl.g:3318:1: ( ( rule__User__Entity_attributesAssignment_2_3_1 ) )
            {
            // InternalSecurityDsl.g:3318:1: ( ( rule__User__Entity_attributesAssignment_2_3_1 ) )
            // InternalSecurityDsl.g:3319:2: ( rule__User__Entity_attributesAssignment_2_3_1 )
            {
             before(grammarAccess.getUserAccess().getEntity_attributesAssignment_2_3_1()); 
            // InternalSecurityDsl.g:3320:2: ( rule__User__Entity_attributesAssignment_2_3_1 )
            // InternalSecurityDsl.g:3320:3: rule__User__Entity_attributesAssignment_2_3_1
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
    // InternalSecurityDsl.g:3329:1: rule__RoleInstance__Group__0 : rule__RoleInstance__Group__0__Impl rule__RoleInstance__Group__1 ;
    public final void rule__RoleInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3333:1: ( rule__RoleInstance__Group__0__Impl rule__RoleInstance__Group__1 )
            // InternalSecurityDsl.g:3334:2: rule__RoleInstance__Group__0__Impl rule__RoleInstance__Group__1
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
    // InternalSecurityDsl.g:3341:1: rule__RoleInstance__Group__0__Impl : ( () ) ;
    public final void rule__RoleInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3345:1: ( ( () ) )
            // InternalSecurityDsl.g:3346:1: ( () )
            {
            // InternalSecurityDsl.g:3346:1: ( () )
            // InternalSecurityDsl.g:3347:2: ()
            {
             before(grammarAccess.getRoleInstanceAccess().getRoleInstanceAction_0()); 
            // InternalSecurityDsl.g:3348:2: ()
            // InternalSecurityDsl.g:3348:3: 
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
    // InternalSecurityDsl.g:3356:1: rule__RoleInstance__Group__1 : rule__RoleInstance__Group__1__Impl rule__RoleInstance__Group__2 ;
    public final void rule__RoleInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3360:1: ( rule__RoleInstance__Group__1__Impl rule__RoleInstance__Group__2 )
            // InternalSecurityDsl.g:3361:2: rule__RoleInstance__Group__1__Impl rule__RoleInstance__Group__2
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
    // InternalSecurityDsl.g:3368:1: rule__RoleInstance__Group__1__Impl : ( ( rule__RoleInstance__ClientAssignment_1 )? ) ;
    public final void rule__RoleInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3372:1: ( ( ( rule__RoleInstance__ClientAssignment_1 )? ) )
            // InternalSecurityDsl.g:3373:1: ( ( rule__RoleInstance__ClientAssignment_1 )? )
            {
            // InternalSecurityDsl.g:3373:1: ( ( rule__RoleInstance__ClientAssignment_1 )? )
            // InternalSecurityDsl.g:3374:2: ( rule__RoleInstance__ClientAssignment_1 )?
            {
             before(grammarAccess.getRoleInstanceAccess().getClientAssignment_1()); 
            // InternalSecurityDsl.g:3375:2: ( rule__RoleInstance__ClientAssignment_1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==91) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSecurityDsl.g:3375:3: rule__RoleInstance__ClientAssignment_1
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
    // InternalSecurityDsl.g:3383:1: rule__RoleInstance__Group__2 : rule__RoleInstance__Group__2__Impl ;
    public final void rule__RoleInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3387:1: ( rule__RoleInstance__Group__2__Impl )
            // InternalSecurityDsl.g:3388:2: rule__RoleInstance__Group__2__Impl
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
    // InternalSecurityDsl.g:3394:1: rule__RoleInstance__Group__2__Impl : ( ( rule__RoleInstance__NameAssignment_2 ) ) ;
    public final void rule__RoleInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3398:1: ( ( ( rule__RoleInstance__NameAssignment_2 ) ) )
            // InternalSecurityDsl.g:3399:1: ( ( rule__RoleInstance__NameAssignment_2 ) )
            {
            // InternalSecurityDsl.g:3399:1: ( ( rule__RoleInstance__NameAssignment_2 ) )
            // InternalSecurityDsl.g:3400:2: ( rule__RoleInstance__NameAssignment_2 )
            {
             before(grammarAccess.getRoleInstanceAccess().getNameAssignment_2()); 
            // InternalSecurityDsl.g:3401:2: ( rule__RoleInstance__NameAssignment_2 )
            // InternalSecurityDsl.g:3401:3: rule__RoleInstance__NameAssignment_2
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
    // InternalSecurityDsl.g:3410:1: rule__Endpoint__Group__0 : rule__Endpoint__Group__0__Impl rule__Endpoint__Group__1 ;
    public final void rule__Endpoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3414:1: ( rule__Endpoint__Group__0__Impl rule__Endpoint__Group__1 )
            // InternalSecurityDsl.g:3415:2: rule__Endpoint__Group__0__Impl rule__Endpoint__Group__1
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
    // InternalSecurityDsl.g:3422:1: rule__Endpoint__Group__0__Impl : ( '{' ) ;
    public final void rule__Endpoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3426:1: ( ( '{' ) )
            // InternalSecurityDsl.g:3427:1: ( '{' )
            {
            // InternalSecurityDsl.g:3427:1: ( '{' )
            // InternalSecurityDsl.g:3428:2: '{'
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
    // InternalSecurityDsl.g:3437:1: rule__Endpoint__Group__1 : rule__Endpoint__Group__1__Impl rule__Endpoint__Group__2 ;
    public final void rule__Endpoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3441:1: ( rule__Endpoint__Group__1__Impl rule__Endpoint__Group__2 )
            // InternalSecurityDsl.g:3442:2: rule__Endpoint__Group__1__Impl rule__Endpoint__Group__2
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
    // InternalSecurityDsl.g:3449:1: rule__Endpoint__Group__1__Impl : ( 'type:' ) ;
    public final void rule__Endpoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3453:1: ( ( 'type:' ) )
            // InternalSecurityDsl.g:3454:1: ( 'type:' )
            {
            // InternalSecurityDsl.g:3454:1: ( 'type:' )
            // InternalSecurityDsl.g:3455:2: 'type:'
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
    // InternalSecurityDsl.g:3464:1: rule__Endpoint__Group__2 : rule__Endpoint__Group__2__Impl rule__Endpoint__Group__3 ;
    public final void rule__Endpoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3468:1: ( rule__Endpoint__Group__2__Impl rule__Endpoint__Group__3 )
            // InternalSecurityDsl.g:3469:2: rule__Endpoint__Group__2__Impl rule__Endpoint__Group__3
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
    // InternalSecurityDsl.g:3476:1: rule__Endpoint__Group__2__Impl : ( ( rule__Endpoint__TypeAssignment_2 ) ) ;
    public final void rule__Endpoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3480:1: ( ( ( rule__Endpoint__TypeAssignment_2 ) ) )
            // InternalSecurityDsl.g:3481:1: ( ( rule__Endpoint__TypeAssignment_2 ) )
            {
            // InternalSecurityDsl.g:3481:1: ( ( rule__Endpoint__TypeAssignment_2 ) )
            // InternalSecurityDsl.g:3482:2: ( rule__Endpoint__TypeAssignment_2 )
            {
             before(grammarAccess.getEndpointAccess().getTypeAssignment_2()); 
            // InternalSecurityDsl.g:3483:2: ( rule__Endpoint__TypeAssignment_2 )
            // InternalSecurityDsl.g:3483:3: rule__Endpoint__TypeAssignment_2
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
    // InternalSecurityDsl.g:3491:1: rule__Endpoint__Group__3 : rule__Endpoint__Group__3__Impl rule__Endpoint__Group__4 ;
    public final void rule__Endpoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3495:1: ( rule__Endpoint__Group__3__Impl rule__Endpoint__Group__4 )
            // InternalSecurityDsl.g:3496:2: rule__Endpoint__Group__3__Impl rule__Endpoint__Group__4
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
    // InternalSecurityDsl.g:3503:1: rule__Endpoint__Group__3__Impl : ( 'url:' ) ;
    public final void rule__Endpoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3507:1: ( ( 'url:' ) )
            // InternalSecurityDsl.g:3508:1: ( 'url:' )
            {
            // InternalSecurityDsl.g:3508:1: ( 'url:' )
            // InternalSecurityDsl.g:3509:2: 'url:'
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
    // InternalSecurityDsl.g:3518:1: rule__Endpoint__Group__4 : rule__Endpoint__Group__4__Impl rule__Endpoint__Group__5 ;
    public final void rule__Endpoint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3522:1: ( rule__Endpoint__Group__4__Impl rule__Endpoint__Group__5 )
            // InternalSecurityDsl.g:3523:2: rule__Endpoint__Group__4__Impl rule__Endpoint__Group__5
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
    // InternalSecurityDsl.g:3530:1: rule__Endpoint__Group__4__Impl : ( ( rule__Endpoint__UrlAssignment_4 ) ) ;
    public final void rule__Endpoint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3534:1: ( ( ( rule__Endpoint__UrlAssignment_4 ) ) )
            // InternalSecurityDsl.g:3535:1: ( ( rule__Endpoint__UrlAssignment_4 ) )
            {
            // InternalSecurityDsl.g:3535:1: ( ( rule__Endpoint__UrlAssignment_4 ) )
            // InternalSecurityDsl.g:3536:2: ( rule__Endpoint__UrlAssignment_4 )
            {
             before(grammarAccess.getEndpointAccess().getUrlAssignment_4()); 
            // InternalSecurityDsl.g:3537:2: ( rule__Endpoint__UrlAssignment_4 )
            // InternalSecurityDsl.g:3537:3: rule__Endpoint__UrlAssignment_4
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
    // InternalSecurityDsl.g:3545:1: rule__Endpoint__Group__5 : rule__Endpoint__Group__5__Impl rule__Endpoint__Group__6 ;
    public final void rule__Endpoint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3549:1: ( rule__Endpoint__Group__5__Impl rule__Endpoint__Group__6 )
            // InternalSecurityDsl.g:3550:2: rule__Endpoint__Group__5__Impl rule__Endpoint__Group__6
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
    // InternalSecurityDsl.g:3557:1: rule__Endpoint__Group__5__Impl : ( ( rule__Endpoint__Group_5__0 )? ) ;
    public final void rule__Endpoint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3561:1: ( ( ( rule__Endpoint__Group_5__0 )? ) )
            // InternalSecurityDsl.g:3562:1: ( ( rule__Endpoint__Group_5__0 )? )
            {
            // InternalSecurityDsl.g:3562:1: ( ( rule__Endpoint__Group_5__0 )? )
            // InternalSecurityDsl.g:3563:2: ( rule__Endpoint__Group_5__0 )?
            {
             before(grammarAccess.getEndpointAccess().getGroup_5()); 
            // InternalSecurityDsl.g:3564:2: ( rule__Endpoint__Group_5__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==69) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSecurityDsl.g:3564:3: rule__Endpoint__Group_5__0
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
    // InternalSecurityDsl.g:3572:1: rule__Endpoint__Group__6 : rule__Endpoint__Group__6__Impl rule__Endpoint__Group__7 ;
    public final void rule__Endpoint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3576:1: ( rule__Endpoint__Group__6__Impl rule__Endpoint__Group__7 )
            // InternalSecurityDsl.g:3577:2: rule__Endpoint__Group__6__Impl rule__Endpoint__Group__7
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
    // InternalSecurityDsl.g:3584:1: rule__Endpoint__Group__6__Impl : ( ( rule__Endpoint__Group_6__0 )? ) ;
    public final void rule__Endpoint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3588:1: ( ( ( rule__Endpoint__Group_6__0 )? ) )
            // InternalSecurityDsl.g:3589:1: ( ( rule__Endpoint__Group_6__0 )? )
            {
            // InternalSecurityDsl.g:3589:1: ( ( rule__Endpoint__Group_6__0 )? )
            // InternalSecurityDsl.g:3590:2: ( rule__Endpoint__Group_6__0 )?
            {
             before(grammarAccess.getEndpointAccess().getGroup_6()); 
            // InternalSecurityDsl.g:3591:2: ( rule__Endpoint__Group_6__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==70) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSecurityDsl.g:3591:3: rule__Endpoint__Group_6__0
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
    // InternalSecurityDsl.g:3599:1: rule__Endpoint__Group__7 : rule__Endpoint__Group__7__Impl rule__Endpoint__Group__8 ;
    public final void rule__Endpoint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3603:1: ( rule__Endpoint__Group__7__Impl rule__Endpoint__Group__8 )
            // InternalSecurityDsl.g:3604:2: rule__Endpoint__Group__7__Impl rule__Endpoint__Group__8
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
    // InternalSecurityDsl.g:3611:1: rule__Endpoint__Group__7__Impl : ( ( rule__Endpoint__Group_7__0 )? ) ;
    public final void rule__Endpoint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3615:1: ( ( ( rule__Endpoint__Group_7__0 )? ) )
            // InternalSecurityDsl.g:3616:1: ( ( rule__Endpoint__Group_7__0 )? )
            {
            // InternalSecurityDsl.g:3616:1: ( ( rule__Endpoint__Group_7__0 )? )
            // InternalSecurityDsl.g:3617:2: ( rule__Endpoint__Group_7__0 )?
            {
             before(grammarAccess.getEndpointAccess().getGroup_7()); 
            // InternalSecurityDsl.g:3618:2: ( rule__Endpoint__Group_7__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==71) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSecurityDsl.g:3618:3: rule__Endpoint__Group_7__0
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
    // InternalSecurityDsl.g:3626:1: rule__Endpoint__Group__8 : rule__Endpoint__Group__8__Impl ;
    public final void rule__Endpoint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3630:1: ( rule__Endpoint__Group__8__Impl )
            // InternalSecurityDsl.g:3631:2: rule__Endpoint__Group__8__Impl
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
    // InternalSecurityDsl.g:3637:1: rule__Endpoint__Group__8__Impl : ( '}' ) ;
    public final void rule__Endpoint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3641:1: ( ( '}' ) )
            // InternalSecurityDsl.g:3642:1: ( '}' )
            {
            // InternalSecurityDsl.g:3642:1: ( '}' )
            // InternalSecurityDsl.g:3643:2: '}'
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
    // InternalSecurityDsl.g:3653:1: rule__Endpoint__Group_5__0 : rule__Endpoint__Group_5__0__Impl rule__Endpoint__Group_5__1 ;
    public final void rule__Endpoint__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3657:1: ( rule__Endpoint__Group_5__0__Impl rule__Endpoint__Group_5__1 )
            // InternalSecurityDsl.g:3658:2: rule__Endpoint__Group_5__0__Impl rule__Endpoint__Group_5__1
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
    // InternalSecurityDsl.g:3665:1: rule__Endpoint__Group_5__0__Impl : ( 'methodName:' ) ;
    public final void rule__Endpoint__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3669:1: ( ( 'methodName:' ) )
            // InternalSecurityDsl.g:3670:1: ( 'methodName:' )
            {
            // InternalSecurityDsl.g:3670:1: ( 'methodName:' )
            // InternalSecurityDsl.g:3671:2: 'methodName:'
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
    // InternalSecurityDsl.g:3680:1: rule__Endpoint__Group_5__1 : rule__Endpoint__Group_5__1__Impl ;
    public final void rule__Endpoint__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3684:1: ( rule__Endpoint__Group_5__1__Impl )
            // InternalSecurityDsl.g:3685:2: rule__Endpoint__Group_5__1__Impl
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
    // InternalSecurityDsl.g:3691:1: rule__Endpoint__Group_5__1__Impl : ( ( rule__Endpoint__MethodNameAssignment_5_1 ) ) ;
    public final void rule__Endpoint__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3695:1: ( ( ( rule__Endpoint__MethodNameAssignment_5_1 ) ) )
            // InternalSecurityDsl.g:3696:1: ( ( rule__Endpoint__MethodNameAssignment_5_1 ) )
            {
            // InternalSecurityDsl.g:3696:1: ( ( rule__Endpoint__MethodNameAssignment_5_1 ) )
            // InternalSecurityDsl.g:3697:2: ( rule__Endpoint__MethodNameAssignment_5_1 )
            {
             before(grammarAccess.getEndpointAccess().getMethodNameAssignment_5_1()); 
            // InternalSecurityDsl.g:3698:2: ( rule__Endpoint__MethodNameAssignment_5_1 )
            // InternalSecurityDsl.g:3698:3: rule__Endpoint__MethodNameAssignment_5_1
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
    // InternalSecurityDsl.g:3707:1: rule__Endpoint__Group_6__0 : rule__Endpoint__Group_6__0__Impl rule__Endpoint__Group_6__1 ;
    public final void rule__Endpoint__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3711:1: ( rule__Endpoint__Group_6__0__Impl rule__Endpoint__Group_6__1 )
            // InternalSecurityDsl.g:3712:2: rule__Endpoint__Group_6__0__Impl rule__Endpoint__Group_6__1
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
    // InternalSecurityDsl.g:3719:1: rule__Endpoint__Group_6__0__Impl : ( 'method:' ) ;
    public final void rule__Endpoint__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3723:1: ( ( 'method:' ) )
            // InternalSecurityDsl.g:3724:1: ( 'method:' )
            {
            // InternalSecurityDsl.g:3724:1: ( 'method:' )
            // InternalSecurityDsl.g:3725:2: 'method:'
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
    // InternalSecurityDsl.g:3734:1: rule__Endpoint__Group_6__1 : rule__Endpoint__Group_6__1__Impl ;
    public final void rule__Endpoint__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3738:1: ( rule__Endpoint__Group_6__1__Impl )
            // InternalSecurityDsl.g:3739:2: rule__Endpoint__Group_6__1__Impl
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
    // InternalSecurityDsl.g:3745:1: rule__Endpoint__Group_6__1__Impl : ( ( rule__Endpoint__MethodAssignment_6_1 ) ) ;
    public final void rule__Endpoint__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3749:1: ( ( ( rule__Endpoint__MethodAssignment_6_1 ) ) )
            // InternalSecurityDsl.g:3750:1: ( ( rule__Endpoint__MethodAssignment_6_1 ) )
            {
            // InternalSecurityDsl.g:3750:1: ( ( rule__Endpoint__MethodAssignment_6_1 ) )
            // InternalSecurityDsl.g:3751:2: ( rule__Endpoint__MethodAssignment_6_1 )
            {
             before(grammarAccess.getEndpointAccess().getMethodAssignment_6_1()); 
            // InternalSecurityDsl.g:3752:2: ( rule__Endpoint__MethodAssignment_6_1 )
            // InternalSecurityDsl.g:3752:3: rule__Endpoint__MethodAssignment_6_1
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
    // InternalSecurityDsl.g:3761:1: rule__Endpoint__Group_7__0 : rule__Endpoint__Group_7__0__Impl rule__Endpoint__Group_7__1 ;
    public final void rule__Endpoint__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3765:1: ( rule__Endpoint__Group_7__0__Impl rule__Endpoint__Group_7__1 )
            // InternalSecurityDsl.g:3766:2: rule__Endpoint__Group_7__0__Impl rule__Endpoint__Group_7__1
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
    // InternalSecurityDsl.g:3773:1: rule__Endpoint__Group_7__0__Impl : ( 'roleAuthorities:' ) ;
    public final void rule__Endpoint__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3777:1: ( ( 'roleAuthorities:' ) )
            // InternalSecurityDsl.g:3778:1: ( 'roleAuthorities:' )
            {
            // InternalSecurityDsl.g:3778:1: ( 'roleAuthorities:' )
            // InternalSecurityDsl.g:3779:2: 'roleAuthorities:'
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
    // InternalSecurityDsl.g:3788:1: rule__Endpoint__Group_7__1 : rule__Endpoint__Group_7__1__Impl rule__Endpoint__Group_7__2 ;
    public final void rule__Endpoint__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3792:1: ( rule__Endpoint__Group_7__1__Impl rule__Endpoint__Group_7__2 )
            // InternalSecurityDsl.g:3793:2: rule__Endpoint__Group_7__1__Impl rule__Endpoint__Group_7__2
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
    // InternalSecurityDsl.g:3800:1: rule__Endpoint__Group_7__1__Impl : ( '[' ) ;
    public final void rule__Endpoint__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3804:1: ( ( '[' ) )
            // InternalSecurityDsl.g:3805:1: ( '[' )
            {
            // InternalSecurityDsl.g:3805:1: ( '[' )
            // InternalSecurityDsl.g:3806:2: '['
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
    // InternalSecurityDsl.g:3815:1: rule__Endpoint__Group_7__2 : rule__Endpoint__Group_7__2__Impl rule__Endpoint__Group_7__3 ;
    public final void rule__Endpoint__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3819:1: ( rule__Endpoint__Group_7__2__Impl rule__Endpoint__Group_7__3 )
            // InternalSecurityDsl.g:3820:2: rule__Endpoint__Group_7__2__Impl rule__Endpoint__Group_7__3
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
    // InternalSecurityDsl.g:3827:1: rule__Endpoint__Group_7__2__Impl : ( ( rule__Endpoint__Role_authoritiesAssignment_7_2 ) ) ;
    public final void rule__Endpoint__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3831:1: ( ( ( rule__Endpoint__Role_authoritiesAssignment_7_2 ) ) )
            // InternalSecurityDsl.g:3832:1: ( ( rule__Endpoint__Role_authoritiesAssignment_7_2 ) )
            {
            // InternalSecurityDsl.g:3832:1: ( ( rule__Endpoint__Role_authoritiesAssignment_7_2 ) )
            // InternalSecurityDsl.g:3833:2: ( rule__Endpoint__Role_authoritiesAssignment_7_2 )
            {
             before(grammarAccess.getEndpointAccess().getRole_authoritiesAssignment_7_2()); 
            // InternalSecurityDsl.g:3834:2: ( rule__Endpoint__Role_authoritiesAssignment_7_2 )
            // InternalSecurityDsl.g:3834:3: rule__Endpoint__Role_authoritiesAssignment_7_2
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
    // InternalSecurityDsl.g:3842:1: rule__Endpoint__Group_7__3 : rule__Endpoint__Group_7__3__Impl rule__Endpoint__Group_7__4 ;
    public final void rule__Endpoint__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3846:1: ( rule__Endpoint__Group_7__3__Impl rule__Endpoint__Group_7__4 )
            // InternalSecurityDsl.g:3847:2: rule__Endpoint__Group_7__3__Impl rule__Endpoint__Group_7__4
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
    // InternalSecurityDsl.g:3854:1: rule__Endpoint__Group_7__3__Impl : ( ( rule__Endpoint__Group_7_3__0 )* ) ;
    public final void rule__Endpoint__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3858:1: ( ( ( rule__Endpoint__Group_7_3__0 )* ) )
            // InternalSecurityDsl.g:3859:1: ( ( rule__Endpoint__Group_7_3__0 )* )
            {
            // InternalSecurityDsl.g:3859:1: ( ( rule__Endpoint__Group_7_3__0 )* )
            // InternalSecurityDsl.g:3860:2: ( rule__Endpoint__Group_7_3__0 )*
            {
             before(grammarAccess.getEndpointAccess().getGroup_7_3()); 
            // InternalSecurityDsl.g:3861:2: ( rule__Endpoint__Group_7_3__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==67) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalSecurityDsl.g:3861:3: rule__Endpoint__Group_7_3__0
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
    // InternalSecurityDsl.g:3869:1: rule__Endpoint__Group_7__4 : rule__Endpoint__Group_7__4__Impl ;
    public final void rule__Endpoint__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3873:1: ( rule__Endpoint__Group_7__4__Impl )
            // InternalSecurityDsl.g:3874:2: rule__Endpoint__Group_7__4__Impl
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
    // InternalSecurityDsl.g:3880:1: rule__Endpoint__Group_7__4__Impl : ( ']' ) ;
    public final void rule__Endpoint__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3884:1: ( ( ']' ) )
            // InternalSecurityDsl.g:3885:1: ( ']' )
            {
            // InternalSecurityDsl.g:3885:1: ( ']' )
            // InternalSecurityDsl.g:3886:2: ']'
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
    // InternalSecurityDsl.g:3896:1: rule__Endpoint__Group_7_3__0 : rule__Endpoint__Group_7_3__0__Impl rule__Endpoint__Group_7_3__1 ;
    public final void rule__Endpoint__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3900:1: ( rule__Endpoint__Group_7_3__0__Impl rule__Endpoint__Group_7_3__1 )
            // InternalSecurityDsl.g:3901:2: rule__Endpoint__Group_7_3__0__Impl rule__Endpoint__Group_7_3__1
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
    // InternalSecurityDsl.g:3908:1: rule__Endpoint__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Endpoint__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3912:1: ( ( ',' ) )
            // InternalSecurityDsl.g:3913:1: ( ',' )
            {
            // InternalSecurityDsl.g:3913:1: ( ',' )
            // InternalSecurityDsl.g:3914:2: ','
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
    // InternalSecurityDsl.g:3923:1: rule__Endpoint__Group_7_3__1 : rule__Endpoint__Group_7_3__1__Impl ;
    public final void rule__Endpoint__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3927:1: ( rule__Endpoint__Group_7_3__1__Impl )
            // InternalSecurityDsl.g:3928:2: rule__Endpoint__Group_7_3__1__Impl
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
    // InternalSecurityDsl.g:3934:1: rule__Endpoint__Group_7_3__1__Impl : ( ( rule__Endpoint__Role_authoritiesAssignment_7_3_1 ) ) ;
    public final void rule__Endpoint__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3938:1: ( ( ( rule__Endpoint__Role_authoritiesAssignment_7_3_1 ) ) )
            // InternalSecurityDsl.g:3939:1: ( ( rule__Endpoint__Role_authoritiesAssignment_7_3_1 ) )
            {
            // InternalSecurityDsl.g:3939:1: ( ( rule__Endpoint__Role_authoritiesAssignment_7_3_1 ) )
            // InternalSecurityDsl.g:3940:2: ( rule__Endpoint__Role_authoritiesAssignment_7_3_1 )
            {
             before(grammarAccess.getEndpointAccess().getRole_authoritiesAssignment_7_3_1()); 
            // InternalSecurityDsl.g:3941:2: ( rule__Endpoint__Role_authoritiesAssignment_7_3_1 )
            // InternalSecurityDsl.g:3941:3: rule__Endpoint__Role_authoritiesAssignment_7_3_1
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
    // InternalSecurityDsl.g:3950:1: rule__Authentication__Group__0 : rule__Authentication__Group__0__Impl rule__Authentication__Group__1 ;
    public final void rule__Authentication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3954:1: ( rule__Authentication__Group__0__Impl rule__Authentication__Group__1 )
            // InternalSecurityDsl.g:3955:2: rule__Authentication__Group__0__Impl rule__Authentication__Group__1
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
    // InternalSecurityDsl.g:3962:1: rule__Authentication__Group__0__Impl : ( () ) ;
    public final void rule__Authentication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3966:1: ( ( () ) )
            // InternalSecurityDsl.g:3967:1: ( () )
            {
            // InternalSecurityDsl.g:3967:1: ( () )
            // InternalSecurityDsl.g:3968:2: ()
            {
             before(grammarAccess.getAuthenticationAccess().getAuthenticationAction_0()); 
            // InternalSecurityDsl.g:3969:2: ()
            // InternalSecurityDsl.g:3969:3: 
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
    // InternalSecurityDsl.g:3977:1: rule__Authentication__Group__1 : rule__Authentication__Group__1__Impl rule__Authentication__Group__2 ;
    public final void rule__Authentication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3981:1: ( rule__Authentication__Group__1__Impl rule__Authentication__Group__2 )
            // InternalSecurityDsl.g:3982:2: rule__Authentication__Group__1__Impl rule__Authentication__Group__2
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
    // InternalSecurityDsl.g:3989:1: rule__Authentication__Group__1__Impl : ( 'name:' ) ;
    public final void rule__Authentication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3993:1: ( ( 'name:' ) )
            // InternalSecurityDsl.g:3994:1: ( 'name:' )
            {
            // InternalSecurityDsl.g:3994:1: ( 'name:' )
            // InternalSecurityDsl.g:3995:2: 'name:'
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
    // InternalSecurityDsl.g:4004:1: rule__Authentication__Group__2 : rule__Authentication__Group__2__Impl rule__Authentication__Group__3 ;
    public final void rule__Authentication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4008:1: ( rule__Authentication__Group__2__Impl rule__Authentication__Group__3 )
            // InternalSecurityDsl.g:4009:2: rule__Authentication__Group__2__Impl rule__Authentication__Group__3
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
    // InternalSecurityDsl.g:4016:1: rule__Authentication__Group__2__Impl : ( ( rule__Authentication__NameAssignment_2 ) ) ;
    public final void rule__Authentication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4020:1: ( ( ( rule__Authentication__NameAssignment_2 ) ) )
            // InternalSecurityDsl.g:4021:1: ( ( rule__Authentication__NameAssignment_2 ) )
            {
            // InternalSecurityDsl.g:4021:1: ( ( rule__Authentication__NameAssignment_2 ) )
            // InternalSecurityDsl.g:4022:2: ( rule__Authentication__NameAssignment_2 )
            {
             before(grammarAccess.getAuthenticationAccess().getNameAssignment_2()); 
            // InternalSecurityDsl.g:4023:2: ( rule__Authentication__NameAssignment_2 )
            // InternalSecurityDsl.g:4023:3: rule__Authentication__NameAssignment_2
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
    // InternalSecurityDsl.g:4031:1: rule__Authentication__Group__3 : rule__Authentication__Group__3__Impl rule__Authentication__Group__4 ;
    public final void rule__Authentication__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4035:1: ( rule__Authentication__Group__3__Impl rule__Authentication__Group__4 )
            // InternalSecurityDsl.g:4036:2: rule__Authentication__Group__3__Impl rule__Authentication__Group__4
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
    // InternalSecurityDsl.g:4043:1: rule__Authentication__Group__3__Impl : ( 'path:' ) ;
    public final void rule__Authentication__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4047:1: ( ( 'path:' ) )
            // InternalSecurityDsl.g:4048:1: ( 'path:' )
            {
            // InternalSecurityDsl.g:4048:1: ( 'path:' )
            // InternalSecurityDsl.g:4049:2: 'path:'
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
    // InternalSecurityDsl.g:4058:1: rule__Authentication__Group__4 : rule__Authentication__Group__4__Impl rule__Authentication__Group__5 ;
    public final void rule__Authentication__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4062:1: ( rule__Authentication__Group__4__Impl rule__Authentication__Group__5 )
            // InternalSecurityDsl.g:4063:2: rule__Authentication__Group__4__Impl rule__Authentication__Group__5
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
    // InternalSecurityDsl.g:4070:1: rule__Authentication__Group__4__Impl : ( ( rule__Authentication__PathAssignment_4 ) ) ;
    public final void rule__Authentication__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4074:1: ( ( ( rule__Authentication__PathAssignment_4 ) ) )
            // InternalSecurityDsl.g:4075:1: ( ( rule__Authentication__PathAssignment_4 ) )
            {
            // InternalSecurityDsl.g:4075:1: ( ( rule__Authentication__PathAssignment_4 ) )
            // InternalSecurityDsl.g:4076:2: ( rule__Authentication__PathAssignment_4 )
            {
             before(grammarAccess.getAuthenticationAccess().getPathAssignment_4()); 
            // InternalSecurityDsl.g:4077:2: ( rule__Authentication__PathAssignment_4 )
            // InternalSecurityDsl.g:4077:3: rule__Authentication__PathAssignment_4
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
    // InternalSecurityDsl.g:4085:1: rule__Authentication__Group__5 : rule__Authentication__Group__5__Impl ;
    public final void rule__Authentication__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4089:1: ( rule__Authentication__Group__5__Impl )
            // InternalSecurityDsl.g:4090:2: rule__Authentication__Group__5__Impl
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
    // InternalSecurityDsl.g:4096:1: rule__Authentication__Group__5__Impl : ( ( rule__Authentication__Group_5__0 )? ) ;
    public final void rule__Authentication__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4100:1: ( ( ( rule__Authentication__Group_5__0 )? ) )
            // InternalSecurityDsl.g:4101:1: ( ( rule__Authentication__Group_5__0 )? )
            {
            // InternalSecurityDsl.g:4101:1: ( ( rule__Authentication__Group_5__0 )? )
            // InternalSecurityDsl.g:4102:2: ( rule__Authentication__Group_5__0 )?
            {
             before(grammarAccess.getAuthenticationAccess().getGroup_5()); 
            // InternalSecurityDsl.g:4103:2: ( rule__Authentication__Group_5__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==73) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSecurityDsl.g:4103:3: rule__Authentication__Group_5__0
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
    // InternalSecurityDsl.g:4112:1: rule__Authentication__Group_5__0 : rule__Authentication__Group_5__0__Impl rule__Authentication__Group_5__1 ;
    public final void rule__Authentication__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4116:1: ( rule__Authentication__Group_5__0__Impl rule__Authentication__Group_5__1 )
            // InternalSecurityDsl.g:4117:2: rule__Authentication__Group_5__0__Impl rule__Authentication__Group_5__1
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
    // InternalSecurityDsl.g:4124:1: rule__Authentication__Group_5__0__Impl : ( 'endpoints:' ) ;
    public final void rule__Authentication__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4128:1: ( ( 'endpoints:' ) )
            // InternalSecurityDsl.g:4129:1: ( 'endpoints:' )
            {
            // InternalSecurityDsl.g:4129:1: ( 'endpoints:' )
            // InternalSecurityDsl.g:4130:2: 'endpoints:'
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
    // InternalSecurityDsl.g:4139:1: rule__Authentication__Group_5__1 : rule__Authentication__Group_5__1__Impl rule__Authentication__Group_5__2 ;
    public final void rule__Authentication__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4143:1: ( rule__Authentication__Group_5__1__Impl rule__Authentication__Group_5__2 )
            // InternalSecurityDsl.g:4144:2: rule__Authentication__Group_5__1__Impl rule__Authentication__Group_5__2
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
    // InternalSecurityDsl.g:4151:1: rule__Authentication__Group_5__1__Impl : ( '[' ) ;
    public final void rule__Authentication__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4155:1: ( ( '[' ) )
            // InternalSecurityDsl.g:4156:1: ( '[' )
            {
            // InternalSecurityDsl.g:4156:1: ( '[' )
            // InternalSecurityDsl.g:4157:2: '['
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
    // InternalSecurityDsl.g:4166:1: rule__Authentication__Group_5__2 : rule__Authentication__Group_5__2__Impl rule__Authentication__Group_5__3 ;
    public final void rule__Authentication__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4170:1: ( rule__Authentication__Group_5__2__Impl rule__Authentication__Group_5__3 )
            // InternalSecurityDsl.g:4171:2: rule__Authentication__Group_5__2__Impl rule__Authentication__Group_5__3
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
    // InternalSecurityDsl.g:4178:1: rule__Authentication__Group_5__2__Impl : ( ( rule__Authentication__Controller_endpointsAssignment_5_2 ) ) ;
    public final void rule__Authentication__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4182:1: ( ( ( rule__Authentication__Controller_endpointsAssignment_5_2 ) ) )
            // InternalSecurityDsl.g:4183:1: ( ( rule__Authentication__Controller_endpointsAssignment_5_2 ) )
            {
            // InternalSecurityDsl.g:4183:1: ( ( rule__Authentication__Controller_endpointsAssignment_5_2 ) )
            // InternalSecurityDsl.g:4184:2: ( rule__Authentication__Controller_endpointsAssignment_5_2 )
            {
             before(grammarAccess.getAuthenticationAccess().getController_endpointsAssignment_5_2()); 
            // InternalSecurityDsl.g:4185:2: ( rule__Authentication__Controller_endpointsAssignment_5_2 )
            // InternalSecurityDsl.g:4185:3: rule__Authentication__Controller_endpointsAssignment_5_2
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
    // InternalSecurityDsl.g:4193:1: rule__Authentication__Group_5__3 : rule__Authentication__Group_5__3__Impl rule__Authentication__Group_5__4 ;
    public final void rule__Authentication__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4197:1: ( rule__Authentication__Group_5__3__Impl rule__Authentication__Group_5__4 )
            // InternalSecurityDsl.g:4198:2: rule__Authentication__Group_5__3__Impl rule__Authentication__Group_5__4
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
    // InternalSecurityDsl.g:4205:1: rule__Authentication__Group_5__3__Impl : ( ( rule__Authentication__Group_5_3__0 )* ) ;
    public final void rule__Authentication__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4209:1: ( ( ( rule__Authentication__Group_5_3__0 )* ) )
            // InternalSecurityDsl.g:4210:1: ( ( rule__Authentication__Group_5_3__0 )* )
            {
            // InternalSecurityDsl.g:4210:1: ( ( rule__Authentication__Group_5_3__0 )* )
            // InternalSecurityDsl.g:4211:2: ( rule__Authentication__Group_5_3__0 )*
            {
             before(grammarAccess.getAuthenticationAccess().getGroup_5_3()); 
            // InternalSecurityDsl.g:4212:2: ( rule__Authentication__Group_5_3__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==67) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalSecurityDsl.g:4212:3: rule__Authentication__Group_5_3__0
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
    // InternalSecurityDsl.g:4220:1: rule__Authentication__Group_5__4 : rule__Authentication__Group_5__4__Impl ;
    public final void rule__Authentication__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4224:1: ( rule__Authentication__Group_5__4__Impl )
            // InternalSecurityDsl.g:4225:2: rule__Authentication__Group_5__4__Impl
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
    // InternalSecurityDsl.g:4231:1: rule__Authentication__Group_5__4__Impl : ( ']' ) ;
    public final void rule__Authentication__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4235:1: ( ( ']' ) )
            // InternalSecurityDsl.g:4236:1: ( ']' )
            {
            // InternalSecurityDsl.g:4236:1: ( ']' )
            // InternalSecurityDsl.g:4237:2: ']'
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
    // InternalSecurityDsl.g:4247:1: rule__Authentication__Group_5_3__0 : rule__Authentication__Group_5_3__0__Impl rule__Authentication__Group_5_3__1 ;
    public final void rule__Authentication__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4251:1: ( rule__Authentication__Group_5_3__0__Impl rule__Authentication__Group_5_3__1 )
            // InternalSecurityDsl.g:4252:2: rule__Authentication__Group_5_3__0__Impl rule__Authentication__Group_5_3__1
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
    // InternalSecurityDsl.g:4259:1: rule__Authentication__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Authentication__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4263:1: ( ( ',' ) )
            // InternalSecurityDsl.g:4264:1: ( ',' )
            {
            // InternalSecurityDsl.g:4264:1: ( ',' )
            // InternalSecurityDsl.g:4265:2: ','
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
    // InternalSecurityDsl.g:4274:1: rule__Authentication__Group_5_3__1 : rule__Authentication__Group_5_3__1__Impl ;
    public final void rule__Authentication__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4278:1: ( rule__Authentication__Group_5_3__1__Impl )
            // InternalSecurityDsl.g:4279:2: rule__Authentication__Group_5_3__1__Impl
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
    // InternalSecurityDsl.g:4285:1: rule__Authentication__Group_5_3__1__Impl : ( ( rule__Authentication__Controller_endpointsAssignment_5_3_1 ) ) ;
    public final void rule__Authentication__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4289:1: ( ( ( rule__Authentication__Controller_endpointsAssignment_5_3_1 ) ) )
            // InternalSecurityDsl.g:4290:1: ( ( rule__Authentication__Controller_endpointsAssignment_5_3_1 ) )
            {
            // InternalSecurityDsl.g:4290:1: ( ( rule__Authentication__Controller_endpointsAssignment_5_3_1 ) )
            // InternalSecurityDsl.g:4291:2: ( rule__Authentication__Controller_endpointsAssignment_5_3_1 )
            {
             before(grammarAccess.getAuthenticationAccess().getController_endpointsAssignment_5_3_1()); 
            // InternalSecurityDsl.g:4292:2: ( rule__Authentication__Controller_endpointsAssignment_5_3_1 )
            // InternalSecurityDsl.g:4292:3: rule__Authentication__Controller_endpointsAssignment_5_3_1
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
    // InternalSecurityDsl.g:4301:1: rule__JWT__Group__0 : rule__JWT__Group__0__Impl rule__JWT__Group__1 ;
    public final void rule__JWT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4305:1: ( rule__JWT__Group__0__Impl rule__JWT__Group__1 )
            // InternalSecurityDsl.g:4306:2: rule__JWT__Group__0__Impl rule__JWT__Group__1
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
    // InternalSecurityDsl.g:4313:1: rule__JWT__Group__0__Impl : ( 'jwt:' ) ;
    public final void rule__JWT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4317:1: ( ( 'jwt:' ) )
            // InternalSecurityDsl.g:4318:1: ( 'jwt:' )
            {
            // InternalSecurityDsl.g:4318:1: ( 'jwt:' )
            // InternalSecurityDsl.g:4319:2: 'jwt:'
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
    // InternalSecurityDsl.g:4328:1: rule__JWT__Group__1 : rule__JWT__Group__1__Impl rule__JWT__Group__2 ;
    public final void rule__JWT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4332:1: ( rule__JWT__Group__1__Impl rule__JWT__Group__2 )
            // InternalSecurityDsl.g:4333:2: rule__JWT__Group__1__Impl rule__JWT__Group__2
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
    // InternalSecurityDsl.g:4340:1: rule__JWT__Group__1__Impl : ( 'header:' ) ;
    public final void rule__JWT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4344:1: ( ( 'header:' ) )
            // InternalSecurityDsl.g:4345:1: ( 'header:' )
            {
            // InternalSecurityDsl.g:4345:1: ( 'header:' )
            // InternalSecurityDsl.g:4346:2: 'header:'
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
    // InternalSecurityDsl.g:4355:1: rule__JWT__Group__2 : rule__JWT__Group__2__Impl rule__JWT__Group__3 ;
    public final void rule__JWT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4359:1: ( rule__JWT__Group__2__Impl rule__JWT__Group__3 )
            // InternalSecurityDsl.g:4360:2: rule__JWT__Group__2__Impl rule__JWT__Group__3
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
    // InternalSecurityDsl.g:4367:1: rule__JWT__Group__2__Impl : ( 'signatureAlgorithm:' ) ;
    public final void rule__JWT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4371:1: ( ( 'signatureAlgorithm:' ) )
            // InternalSecurityDsl.g:4372:1: ( 'signatureAlgorithm:' )
            {
            // InternalSecurityDsl.g:4372:1: ( 'signatureAlgorithm:' )
            // InternalSecurityDsl.g:4373:2: 'signatureAlgorithm:'
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
    // InternalSecurityDsl.g:4382:1: rule__JWT__Group__3 : rule__JWT__Group__3__Impl rule__JWT__Group__4 ;
    public final void rule__JWT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4386:1: ( rule__JWT__Group__3__Impl rule__JWT__Group__4 )
            // InternalSecurityDsl.g:4387:2: rule__JWT__Group__3__Impl rule__JWT__Group__4
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
    // InternalSecurityDsl.g:4394:1: rule__JWT__Group__3__Impl : ( ( rule__JWT__SignatureAlgorithmAssignment_3 ) ) ;
    public final void rule__JWT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4398:1: ( ( ( rule__JWT__SignatureAlgorithmAssignment_3 ) ) )
            // InternalSecurityDsl.g:4399:1: ( ( rule__JWT__SignatureAlgorithmAssignment_3 ) )
            {
            // InternalSecurityDsl.g:4399:1: ( ( rule__JWT__SignatureAlgorithmAssignment_3 ) )
            // InternalSecurityDsl.g:4400:2: ( rule__JWT__SignatureAlgorithmAssignment_3 )
            {
             before(grammarAccess.getJWTAccess().getSignatureAlgorithmAssignment_3()); 
            // InternalSecurityDsl.g:4401:2: ( rule__JWT__SignatureAlgorithmAssignment_3 )
            // InternalSecurityDsl.g:4401:3: rule__JWT__SignatureAlgorithmAssignment_3
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
    // InternalSecurityDsl.g:4409:1: rule__JWT__Group__4 : rule__JWT__Group__4__Impl rule__JWT__Group__5 ;
    public final void rule__JWT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4413:1: ( rule__JWT__Group__4__Impl rule__JWT__Group__5 )
            // InternalSecurityDsl.g:4414:2: rule__JWT__Group__4__Impl rule__JWT__Group__5
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
    // InternalSecurityDsl.g:4421:1: rule__JWT__Group__4__Impl : ( 'payload:' ) ;
    public final void rule__JWT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4425:1: ( ( 'payload:' ) )
            // InternalSecurityDsl.g:4426:1: ( 'payload:' )
            {
            // InternalSecurityDsl.g:4426:1: ( 'payload:' )
            // InternalSecurityDsl.g:4427:2: 'payload:'
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
    // InternalSecurityDsl.g:4436:1: rule__JWT__Group__5 : rule__JWT__Group__5__Impl rule__JWT__Group__6 ;
    public final void rule__JWT__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4440:1: ( rule__JWT__Group__5__Impl rule__JWT__Group__6 )
            // InternalSecurityDsl.g:4441:2: rule__JWT__Group__5__Impl rule__JWT__Group__6
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
    // InternalSecurityDsl.g:4448:1: rule__JWT__Group__5__Impl : ( 'claims:' ) ;
    public final void rule__JWT__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4452:1: ( ( 'claims:' ) )
            // InternalSecurityDsl.g:4453:1: ( 'claims:' )
            {
            // InternalSecurityDsl.g:4453:1: ( 'claims:' )
            // InternalSecurityDsl.g:4454:2: 'claims:'
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
    // InternalSecurityDsl.g:4463:1: rule__JWT__Group__6 : rule__JWT__Group__6__Impl rule__JWT__Group__7 ;
    public final void rule__JWT__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4467:1: ( rule__JWT__Group__6__Impl rule__JWT__Group__7 )
            // InternalSecurityDsl.g:4468:2: rule__JWT__Group__6__Impl rule__JWT__Group__7
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
    // InternalSecurityDsl.g:4475:1: rule__JWT__Group__6__Impl : ( '[' ) ;
    public final void rule__JWT__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4479:1: ( ( '[' ) )
            // InternalSecurityDsl.g:4480:1: ( '[' )
            {
            // InternalSecurityDsl.g:4480:1: ( '[' )
            // InternalSecurityDsl.g:4481:2: '['
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
    // InternalSecurityDsl.g:4490:1: rule__JWT__Group__7 : rule__JWT__Group__7__Impl rule__JWT__Group__8 ;
    public final void rule__JWT__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4494:1: ( rule__JWT__Group__7__Impl rule__JWT__Group__8 )
            // InternalSecurityDsl.g:4495:2: rule__JWT__Group__7__Impl rule__JWT__Group__8
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
    // InternalSecurityDsl.g:4502:1: rule__JWT__Group__7__Impl : ( ( rule__JWT__ClaimsAssignment_7 ) ) ;
    public final void rule__JWT__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4506:1: ( ( ( rule__JWT__ClaimsAssignment_7 ) ) )
            // InternalSecurityDsl.g:4507:1: ( ( rule__JWT__ClaimsAssignment_7 ) )
            {
            // InternalSecurityDsl.g:4507:1: ( ( rule__JWT__ClaimsAssignment_7 ) )
            // InternalSecurityDsl.g:4508:2: ( rule__JWT__ClaimsAssignment_7 )
            {
             before(grammarAccess.getJWTAccess().getClaimsAssignment_7()); 
            // InternalSecurityDsl.g:4509:2: ( rule__JWT__ClaimsAssignment_7 )
            // InternalSecurityDsl.g:4509:3: rule__JWT__ClaimsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__JWT__ClaimsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getJWTAccess().getClaimsAssignment_7()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:4517:1: rule__JWT__Group__8 : rule__JWT__Group__8__Impl rule__JWT__Group__9 ;
    public final void rule__JWT__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4521:1: ( rule__JWT__Group__8__Impl rule__JWT__Group__9 )
            // InternalSecurityDsl.g:4522:2: rule__JWT__Group__8__Impl rule__JWT__Group__9
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
    // InternalSecurityDsl.g:4529:1: rule__JWT__Group__8__Impl : ( ( rule__JWT__Group_8__0 )* ) ;
    public final void rule__JWT__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4533:1: ( ( ( rule__JWT__Group_8__0 )* ) )
            // InternalSecurityDsl.g:4534:1: ( ( rule__JWT__Group_8__0 )* )
            {
            // InternalSecurityDsl.g:4534:1: ( ( rule__JWT__Group_8__0 )* )
            // InternalSecurityDsl.g:4535:2: ( rule__JWT__Group_8__0 )*
            {
             before(grammarAccess.getJWTAccess().getGroup_8()); 
            // InternalSecurityDsl.g:4536:2: ( rule__JWT__Group_8__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==67) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalSecurityDsl.g:4536:3: rule__JWT__Group_8__0
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
    // InternalSecurityDsl.g:4544:1: rule__JWT__Group__9 : rule__JWT__Group__9__Impl rule__JWT__Group__10 ;
    public final void rule__JWT__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4548:1: ( rule__JWT__Group__9__Impl rule__JWT__Group__10 )
            // InternalSecurityDsl.g:4549:2: rule__JWT__Group__9__Impl rule__JWT__Group__10
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
    // InternalSecurityDsl.g:4556:1: rule__JWT__Group__9__Impl : ( ']' ) ;
    public final void rule__JWT__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4560:1: ( ( ']' ) )
            // InternalSecurityDsl.g:4561:1: ( ']' )
            {
            // InternalSecurityDsl.g:4561:1: ( ']' )
            // InternalSecurityDsl.g:4562:2: ']'
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
    // InternalSecurityDsl.g:4571:1: rule__JWT__Group__10 : rule__JWT__Group__10__Impl ;
    public final void rule__JWT__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4575:1: ( rule__JWT__Group__10__Impl )
            // InternalSecurityDsl.g:4576:2: rule__JWT__Group__10__Impl
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
    // InternalSecurityDsl.g:4582:1: rule__JWT__Group__10__Impl : ( ( rule__JWT__Group_10__0 )? ) ;
    public final void rule__JWT__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4586:1: ( ( ( rule__JWT__Group_10__0 )? ) )
            // InternalSecurityDsl.g:4587:1: ( ( rule__JWT__Group_10__0 )? )
            {
            // InternalSecurityDsl.g:4587:1: ( ( rule__JWT__Group_10__0 )? )
            // InternalSecurityDsl.g:4588:2: ( rule__JWT__Group_10__0 )?
            {
             before(grammarAccess.getJWTAccess().getGroup_10()); 
            // InternalSecurityDsl.g:4589:2: ( rule__JWT__Group_10__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==79) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSecurityDsl.g:4589:3: rule__JWT__Group_10__0
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
    // InternalSecurityDsl.g:4598:1: rule__JWT__Group_8__0 : rule__JWT__Group_8__0__Impl rule__JWT__Group_8__1 ;
    public final void rule__JWT__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4602:1: ( rule__JWT__Group_8__0__Impl rule__JWT__Group_8__1 )
            // InternalSecurityDsl.g:4603:2: rule__JWT__Group_8__0__Impl rule__JWT__Group_8__1
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
    // InternalSecurityDsl.g:4610:1: rule__JWT__Group_8__0__Impl : ( ',' ) ;
    public final void rule__JWT__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4614:1: ( ( ',' ) )
            // InternalSecurityDsl.g:4615:1: ( ',' )
            {
            // InternalSecurityDsl.g:4615:1: ( ',' )
            // InternalSecurityDsl.g:4616:2: ','
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
    // InternalSecurityDsl.g:4625:1: rule__JWT__Group_8__1 : rule__JWT__Group_8__1__Impl ;
    public final void rule__JWT__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4629:1: ( rule__JWT__Group_8__1__Impl )
            // InternalSecurityDsl.g:4630:2: rule__JWT__Group_8__1__Impl
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
    // InternalSecurityDsl.g:4636:1: rule__JWT__Group_8__1__Impl : ( ( rule__JWT__ClaimsAssignment_8_1 ) ) ;
    public final void rule__JWT__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4640:1: ( ( ( rule__JWT__ClaimsAssignment_8_1 ) ) )
            // InternalSecurityDsl.g:4641:1: ( ( rule__JWT__ClaimsAssignment_8_1 ) )
            {
            // InternalSecurityDsl.g:4641:1: ( ( rule__JWT__ClaimsAssignment_8_1 ) )
            // InternalSecurityDsl.g:4642:2: ( rule__JWT__ClaimsAssignment_8_1 )
            {
             before(grammarAccess.getJWTAccess().getClaimsAssignment_8_1()); 
            // InternalSecurityDsl.g:4643:2: ( rule__JWT__ClaimsAssignment_8_1 )
            // InternalSecurityDsl.g:4643:3: rule__JWT__ClaimsAssignment_8_1
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
    // InternalSecurityDsl.g:4652:1: rule__JWT__Group_10__0 : rule__JWT__Group_10__0__Impl rule__JWT__Group_10__1 ;
    public final void rule__JWT__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4656:1: ( rule__JWT__Group_10__0__Impl rule__JWT__Group_10__1 )
            // InternalSecurityDsl.g:4657:2: rule__JWT__Group_10__0__Impl rule__JWT__Group_10__1
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
    // InternalSecurityDsl.g:4664:1: rule__JWT__Group_10__0__Impl : ( 'signature:' ) ;
    public final void rule__JWT__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4668:1: ( ( 'signature:' ) )
            // InternalSecurityDsl.g:4669:1: ( 'signature:' )
            {
            // InternalSecurityDsl.g:4669:1: ( 'signature:' )
            // InternalSecurityDsl.g:4670:2: 'signature:'
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
    // InternalSecurityDsl.g:4679:1: rule__JWT__Group_10__1 : rule__JWT__Group_10__1__Impl rule__JWT__Group_10__2 ;
    public final void rule__JWT__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4683:1: ( rule__JWT__Group_10__1__Impl rule__JWT__Group_10__2 )
            // InternalSecurityDsl.g:4684:2: rule__JWT__Group_10__1__Impl rule__JWT__Group_10__2
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
    // InternalSecurityDsl.g:4691:1: rule__JWT__Group_10__1__Impl : ( 'secret:' ) ;
    public final void rule__JWT__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4695:1: ( ( 'secret:' ) )
            // InternalSecurityDsl.g:4696:1: ( 'secret:' )
            {
            // InternalSecurityDsl.g:4696:1: ( 'secret:' )
            // InternalSecurityDsl.g:4697:2: 'secret:'
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
    // InternalSecurityDsl.g:4706:1: rule__JWT__Group_10__2 : rule__JWT__Group_10__2__Impl ;
    public final void rule__JWT__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4710:1: ( rule__JWT__Group_10__2__Impl )
            // InternalSecurityDsl.g:4711:2: rule__JWT__Group_10__2__Impl
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
    // InternalSecurityDsl.g:4717:1: rule__JWT__Group_10__2__Impl : ( ( rule__JWT__SecretAssignment_10_2 ) ) ;
    public final void rule__JWT__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4721:1: ( ( ( rule__JWT__SecretAssignment_10_2 ) ) )
            // InternalSecurityDsl.g:4722:1: ( ( rule__JWT__SecretAssignment_10_2 ) )
            {
            // InternalSecurityDsl.g:4722:1: ( ( rule__JWT__SecretAssignment_10_2 ) )
            // InternalSecurityDsl.g:4723:2: ( rule__JWT__SecretAssignment_10_2 )
            {
             before(grammarAccess.getJWTAccess().getSecretAssignment_10_2()); 
            // InternalSecurityDsl.g:4724:2: ( rule__JWT__SecretAssignment_10_2 )
            // InternalSecurityDsl.g:4724:3: rule__JWT__SecretAssignment_10_2
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
    // InternalSecurityDsl.g:4733:1: rule__Claim__Group__0 : rule__Claim__Group__0__Impl rule__Claim__Group__1 ;
    public final void rule__Claim__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4737:1: ( rule__Claim__Group__0__Impl rule__Claim__Group__1 )
            // InternalSecurityDsl.g:4738:2: rule__Claim__Group__0__Impl rule__Claim__Group__1
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
    // InternalSecurityDsl.g:4745:1: rule__Claim__Group__0__Impl : ( '{' ) ;
    public final void rule__Claim__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4749:1: ( ( '{' ) )
            // InternalSecurityDsl.g:4750:1: ( '{' )
            {
            // InternalSecurityDsl.g:4750:1: ( '{' )
            // InternalSecurityDsl.g:4751:2: '{'
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
    // InternalSecurityDsl.g:4760:1: rule__Claim__Group__1 : rule__Claim__Group__1__Impl rule__Claim__Group__2 ;
    public final void rule__Claim__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4764:1: ( rule__Claim__Group__1__Impl rule__Claim__Group__2 )
            // InternalSecurityDsl.g:4765:2: rule__Claim__Group__1__Impl rule__Claim__Group__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalSecurityDsl.g:4772:1: rule__Claim__Group__1__Impl : ( ( rule__Claim__TypeAssignment_1 ) ) ;
    public final void rule__Claim__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4776:1: ( ( ( rule__Claim__TypeAssignment_1 ) ) )
            // InternalSecurityDsl.g:4777:1: ( ( rule__Claim__TypeAssignment_1 ) )
            {
            // InternalSecurityDsl.g:4777:1: ( ( rule__Claim__TypeAssignment_1 ) )
            // InternalSecurityDsl.g:4778:2: ( rule__Claim__TypeAssignment_1 )
            {
             before(grammarAccess.getClaimAccess().getTypeAssignment_1()); 
            // InternalSecurityDsl.g:4779:2: ( rule__Claim__TypeAssignment_1 )
            // InternalSecurityDsl.g:4779:3: rule__Claim__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Claim__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClaimAccess().getTypeAssignment_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:4787:1: rule__Claim__Group__2 : rule__Claim__Group__2__Impl rule__Claim__Group__3 ;
    public final void rule__Claim__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4791:1: ( rule__Claim__Group__2__Impl rule__Claim__Group__3 )
            // InternalSecurityDsl.g:4792:2: rule__Claim__Group__2__Impl rule__Claim__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalSecurityDsl.g:4799:1: rule__Claim__Group__2__Impl : ( ',' ) ;
    public final void rule__Claim__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4803:1: ( ( ',' ) )
            // InternalSecurityDsl.g:4804:1: ( ',' )
            {
            // InternalSecurityDsl.g:4804:1: ( ',' )
            // InternalSecurityDsl.g:4805:2: ','
            {
             before(grammarAccess.getClaimAccess().getCommaKeyword_2()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getClaimAccess().getCommaKeyword_2()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:4814:1: rule__Claim__Group__3 : rule__Claim__Group__3__Impl rule__Claim__Group__4 ;
    public final void rule__Claim__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4818:1: ( rule__Claim__Group__3__Impl rule__Claim__Group__4 )
            // InternalSecurityDsl.g:4819:2: rule__Claim__Group__3__Impl rule__Claim__Group__4
            {
            pushFollow(FOLLOW_42);
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
    // InternalSecurityDsl.g:4826:1: rule__Claim__Group__3__Impl : ( ( rule__Claim__NameAssignment_3 ) ) ;
    public final void rule__Claim__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4830:1: ( ( ( rule__Claim__NameAssignment_3 ) ) )
            // InternalSecurityDsl.g:4831:1: ( ( rule__Claim__NameAssignment_3 ) )
            {
            // InternalSecurityDsl.g:4831:1: ( ( rule__Claim__NameAssignment_3 ) )
            // InternalSecurityDsl.g:4832:2: ( rule__Claim__NameAssignment_3 )
            {
             before(grammarAccess.getClaimAccess().getNameAssignment_3()); 
            // InternalSecurityDsl.g:4833:2: ( rule__Claim__NameAssignment_3 )
            // InternalSecurityDsl.g:4833:3: rule__Claim__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Claim__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getClaimAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:4841:1: rule__Claim__Group__4 : rule__Claim__Group__4__Impl rule__Claim__Group__5 ;
    public final void rule__Claim__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4845:1: ( rule__Claim__Group__4__Impl rule__Claim__Group__5 )
            // InternalSecurityDsl.g:4846:2: rule__Claim__Group__4__Impl rule__Claim__Group__5
            {
            pushFollow(FOLLOW_43);
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
    // InternalSecurityDsl.g:4853:1: rule__Claim__Group__4__Impl : ( ':' ) ;
    public final void rule__Claim__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4857:1: ( ( ':' ) )
            // InternalSecurityDsl.g:4858:1: ( ':' )
            {
            // InternalSecurityDsl.g:4858:1: ( ':' )
            // InternalSecurityDsl.g:4859:2: ':'
            {
             before(grammarAccess.getClaimAccess().getColonKeyword_4()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getClaimAccess().getColonKeyword_4()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:4868:1: rule__Claim__Group__5 : rule__Claim__Group__5__Impl rule__Claim__Group__6 ;
    public final void rule__Claim__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4872:1: ( rule__Claim__Group__5__Impl rule__Claim__Group__6 )
            // InternalSecurityDsl.g:4873:2: rule__Claim__Group__5__Impl rule__Claim__Group__6
            {
            pushFollow(FOLLOW_43);
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
    // InternalSecurityDsl.g:4880:1: rule__Claim__Group__5__Impl : ( ( rule__Claim__ValueAssignment_5 )? ) ;
    public final void rule__Claim__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4884:1: ( ( ( rule__Claim__ValueAssignment_5 )? ) )
            // InternalSecurityDsl.g:4885:1: ( ( rule__Claim__ValueAssignment_5 )? )
            {
            // InternalSecurityDsl.g:4885:1: ( ( rule__Claim__ValueAssignment_5 )? )
            // InternalSecurityDsl.g:4886:2: ( rule__Claim__ValueAssignment_5 )?
            {
             before(grammarAccess.getClaimAccess().getValueAssignment_5()); 
            // InternalSecurityDsl.g:4887:2: ( rule__Claim__ValueAssignment_5 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_STRING && LA42_0<=RULE_ID)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSecurityDsl.g:4887:3: rule__Claim__ValueAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Claim__ValueAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClaimAccess().getValueAssignment_5()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:4895:1: rule__Claim__Group__6 : rule__Claim__Group__6__Impl rule__Claim__Group__7 ;
    public final void rule__Claim__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4899:1: ( rule__Claim__Group__6__Impl rule__Claim__Group__7 )
            // InternalSecurityDsl.g:4900:2: rule__Claim__Group__6__Impl rule__Claim__Group__7
            {
            pushFollow(FOLLOW_43);
            rule__Claim__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Claim__Group__7();

            state._fsp--;


            }

        }
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
    // InternalSecurityDsl.g:4907:1: rule__Claim__Group__6__Impl : ( ( rule__Claim__Group_6__0 )? ) ;
    public final void rule__Claim__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4911:1: ( ( ( rule__Claim__Group_6__0 )? ) )
            // InternalSecurityDsl.g:4912:1: ( ( rule__Claim__Group_6__0 )? )
            {
            // InternalSecurityDsl.g:4912:1: ( ( rule__Claim__Group_6__0 )? )
            // InternalSecurityDsl.g:4913:2: ( rule__Claim__Group_6__0 )?
            {
             before(grammarAccess.getClaimAccess().getGroup_6()); 
            // InternalSecurityDsl.g:4914:2: ( rule__Claim__Group_6__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==82) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSecurityDsl.g:4914:3: rule__Claim__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Claim__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClaimAccess().getGroup_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Claim__Group__7"
    // InternalSecurityDsl.g:4922:1: rule__Claim__Group__7 : rule__Claim__Group__7__Impl ;
    public final void rule__Claim__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4926:1: ( rule__Claim__Group__7__Impl )
            // InternalSecurityDsl.g:4927:2: rule__Claim__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Claim__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Claim__Group__7"


    // $ANTLR start "rule__Claim__Group__7__Impl"
    // InternalSecurityDsl.g:4933:1: rule__Claim__Group__7__Impl : ( '}' ) ;
    public final void rule__Claim__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4937:1: ( ( '}' ) )
            // InternalSecurityDsl.g:4938:1: ( '}' )
            {
            // InternalSecurityDsl.g:4938:1: ( '}' )
            // InternalSecurityDsl.g:4939:2: '}'
            {
             before(grammarAccess.getClaimAccess().getRightCurlyBracketKeyword_7()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getClaimAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Claim__Group__7__Impl"


    // $ANTLR start "rule__Claim__Group_6__0"
    // InternalSecurityDsl.g:4949:1: rule__Claim__Group_6__0 : rule__Claim__Group_6__0__Impl rule__Claim__Group_6__1 ;
    public final void rule__Claim__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4953:1: ( rule__Claim__Group_6__0__Impl rule__Claim__Group_6__1 )
            // InternalSecurityDsl.g:4954:2: rule__Claim__Group_6__0__Impl rule__Claim__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__Claim__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Claim__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Claim__Group_6__0"


    // $ANTLR start "rule__Claim__Group_6__0__Impl"
    // InternalSecurityDsl.g:4961:1: rule__Claim__Group_6__0__Impl : ( 'attribute' ) ;
    public final void rule__Claim__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4965:1: ( ( 'attribute' ) )
            // InternalSecurityDsl.g:4966:1: ( 'attribute' )
            {
            // InternalSecurityDsl.g:4966:1: ( 'attribute' )
            // InternalSecurityDsl.g:4967:2: 'attribute'
            {
             before(grammarAccess.getClaimAccess().getAttributeKeyword_6_0()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getClaimAccess().getAttributeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Claim__Group_6__0__Impl"


    // $ANTLR start "rule__Claim__Group_6__1"
    // InternalSecurityDsl.g:4976:1: rule__Claim__Group_6__1 : rule__Claim__Group_6__1__Impl ;
    public final void rule__Claim__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4980:1: ( rule__Claim__Group_6__1__Impl )
            // InternalSecurityDsl.g:4981:2: rule__Claim__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Claim__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Claim__Group_6__1"


    // $ANTLR start "rule__Claim__Group_6__1__Impl"
    // InternalSecurityDsl.g:4987:1: rule__Claim__Group_6__1__Impl : ( ( rule__Claim__Claim_attributeAssignment_6_1 ) ) ;
    public final void rule__Claim__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4991:1: ( ( ( rule__Claim__Claim_attributeAssignment_6_1 ) ) )
            // InternalSecurityDsl.g:4992:1: ( ( rule__Claim__Claim_attributeAssignment_6_1 ) )
            {
            // InternalSecurityDsl.g:4992:1: ( ( rule__Claim__Claim_attributeAssignment_6_1 ) )
            // InternalSecurityDsl.g:4993:2: ( rule__Claim__Claim_attributeAssignment_6_1 )
            {
             before(grammarAccess.getClaimAccess().getClaim_attributeAssignment_6_1()); 
            // InternalSecurityDsl.g:4994:2: ( rule__Claim__Claim_attributeAssignment_6_1 )
            // InternalSecurityDsl.g:4994:3: rule__Claim__Claim_attributeAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Claim__Claim_attributeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getClaimAccess().getClaim_attributeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Claim__Group_6__1__Impl"


    // $ANTLR start "rule__OAuth2__Group__0"
    // InternalSecurityDsl.g:5003:1: rule__OAuth2__Group__0 : rule__OAuth2__Group__0__Impl rule__OAuth2__Group__1 ;
    public final void rule__OAuth2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5007:1: ( rule__OAuth2__Group__0__Impl rule__OAuth2__Group__1 )
            // InternalSecurityDsl.g:5008:2: rule__OAuth2__Group__0__Impl rule__OAuth2__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalSecurityDsl.g:5015:1: rule__OAuth2__Group__0__Impl : ( 'OAuth2.0:' ) ;
    public final void rule__OAuth2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5019:1: ( ( 'OAuth2.0:' ) )
            // InternalSecurityDsl.g:5020:1: ( 'OAuth2.0:' )
            {
            // InternalSecurityDsl.g:5020:1: ( 'OAuth2.0:' )
            // InternalSecurityDsl.g:5021:2: 'OAuth2.0:'
            {
             before(grammarAccess.getOAuth2Access().getOAuth20Keyword_0()); 
            match(input,83,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5030:1: rule__OAuth2__Group__1 : rule__OAuth2__Group__1__Impl rule__OAuth2__Group__2 ;
    public final void rule__OAuth2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5034:1: ( rule__OAuth2__Group__1__Impl rule__OAuth2__Group__2 )
            // InternalSecurityDsl.g:5035:2: rule__OAuth2__Group__1__Impl rule__OAuth2__Group__2
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
    // InternalSecurityDsl.g:5042:1: rule__OAuth2__Group__1__Impl : ( 'providers:' ) ;
    public final void rule__OAuth2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5046:1: ( ( 'providers:' ) )
            // InternalSecurityDsl.g:5047:1: ( 'providers:' )
            {
            // InternalSecurityDsl.g:5047:1: ( 'providers:' )
            // InternalSecurityDsl.g:5048:2: 'providers:'
            {
             before(grammarAccess.getOAuth2Access().getProvidersKeyword_1()); 
            match(input,84,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5057:1: rule__OAuth2__Group__2 : rule__OAuth2__Group__2__Impl rule__OAuth2__Group__3 ;
    public final void rule__OAuth2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5061:1: ( rule__OAuth2__Group__2__Impl rule__OAuth2__Group__3 )
            // InternalSecurityDsl.g:5062:2: rule__OAuth2__Group__2__Impl rule__OAuth2__Group__3
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
    // InternalSecurityDsl.g:5069:1: rule__OAuth2__Group__2__Impl : ( '[' ) ;
    public final void rule__OAuth2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5073:1: ( ( '[' ) )
            // InternalSecurityDsl.g:5074:1: ( '[' )
            {
            // InternalSecurityDsl.g:5074:1: ( '[' )
            // InternalSecurityDsl.g:5075:2: '['
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
    // InternalSecurityDsl.g:5084:1: rule__OAuth2__Group__3 : rule__OAuth2__Group__3__Impl rule__OAuth2__Group__4 ;
    public final void rule__OAuth2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5088:1: ( rule__OAuth2__Group__3__Impl rule__OAuth2__Group__4 )
            // InternalSecurityDsl.g:5089:2: rule__OAuth2__Group__3__Impl rule__OAuth2__Group__4
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
    // InternalSecurityDsl.g:5096:1: rule__OAuth2__Group__3__Impl : ( ( rule__OAuth2__ProvidersAssignment_3 ) ) ;
    public final void rule__OAuth2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5100:1: ( ( ( rule__OAuth2__ProvidersAssignment_3 ) ) )
            // InternalSecurityDsl.g:5101:1: ( ( rule__OAuth2__ProvidersAssignment_3 ) )
            {
            // InternalSecurityDsl.g:5101:1: ( ( rule__OAuth2__ProvidersAssignment_3 ) )
            // InternalSecurityDsl.g:5102:2: ( rule__OAuth2__ProvidersAssignment_3 )
            {
             before(grammarAccess.getOAuth2Access().getProvidersAssignment_3()); 
            // InternalSecurityDsl.g:5103:2: ( rule__OAuth2__ProvidersAssignment_3 )
            // InternalSecurityDsl.g:5103:3: rule__OAuth2__ProvidersAssignment_3
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
    // InternalSecurityDsl.g:5111:1: rule__OAuth2__Group__4 : rule__OAuth2__Group__4__Impl rule__OAuth2__Group__5 ;
    public final void rule__OAuth2__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5115:1: ( rule__OAuth2__Group__4__Impl rule__OAuth2__Group__5 )
            // InternalSecurityDsl.g:5116:2: rule__OAuth2__Group__4__Impl rule__OAuth2__Group__5
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
    // InternalSecurityDsl.g:5123:1: rule__OAuth2__Group__4__Impl : ( ( rule__OAuth2__Group_4__0 )* ) ;
    public final void rule__OAuth2__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5127:1: ( ( ( rule__OAuth2__Group_4__0 )* ) )
            // InternalSecurityDsl.g:5128:1: ( ( rule__OAuth2__Group_4__0 )* )
            {
            // InternalSecurityDsl.g:5128:1: ( ( rule__OAuth2__Group_4__0 )* )
            // InternalSecurityDsl.g:5129:2: ( rule__OAuth2__Group_4__0 )*
            {
             before(grammarAccess.getOAuth2Access().getGroup_4()); 
            // InternalSecurityDsl.g:5130:2: ( rule__OAuth2__Group_4__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==67) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalSecurityDsl.g:5130:3: rule__OAuth2__Group_4__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__OAuth2__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
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
    // InternalSecurityDsl.g:5138:1: rule__OAuth2__Group__5 : rule__OAuth2__Group__5__Impl ;
    public final void rule__OAuth2__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5142:1: ( rule__OAuth2__Group__5__Impl )
            // InternalSecurityDsl.g:5143:2: rule__OAuth2__Group__5__Impl
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
    // InternalSecurityDsl.g:5149:1: rule__OAuth2__Group__5__Impl : ( ']' ) ;
    public final void rule__OAuth2__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5153:1: ( ( ']' ) )
            // InternalSecurityDsl.g:5154:1: ( ']' )
            {
            // InternalSecurityDsl.g:5154:1: ( ']' )
            // InternalSecurityDsl.g:5155:2: ']'
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
    // InternalSecurityDsl.g:5165:1: rule__OAuth2__Group_4__0 : rule__OAuth2__Group_4__0__Impl rule__OAuth2__Group_4__1 ;
    public final void rule__OAuth2__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5169:1: ( rule__OAuth2__Group_4__0__Impl rule__OAuth2__Group_4__1 )
            // InternalSecurityDsl.g:5170:2: rule__OAuth2__Group_4__0__Impl rule__OAuth2__Group_4__1
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
    // InternalSecurityDsl.g:5177:1: rule__OAuth2__Group_4__0__Impl : ( ',' ) ;
    public final void rule__OAuth2__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5181:1: ( ( ',' ) )
            // InternalSecurityDsl.g:5182:1: ( ',' )
            {
            // InternalSecurityDsl.g:5182:1: ( ',' )
            // InternalSecurityDsl.g:5183:2: ','
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
    // InternalSecurityDsl.g:5192:1: rule__OAuth2__Group_4__1 : rule__OAuth2__Group_4__1__Impl ;
    public final void rule__OAuth2__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5196:1: ( rule__OAuth2__Group_4__1__Impl )
            // InternalSecurityDsl.g:5197:2: rule__OAuth2__Group_4__1__Impl
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
    // InternalSecurityDsl.g:5203:1: rule__OAuth2__Group_4__1__Impl : ( ( rule__OAuth2__ProvidersAssignment_4_1 ) ) ;
    public final void rule__OAuth2__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5207:1: ( ( ( rule__OAuth2__ProvidersAssignment_4_1 ) ) )
            // InternalSecurityDsl.g:5208:1: ( ( rule__OAuth2__ProvidersAssignment_4_1 ) )
            {
            // InternalSecurityDsl.g:5208:1: ( ( rule__OAuth2__ProvidersAssignment_4_1 ) )
            // InternalSecurityDsl.g:5209:2: ( rule__OAuth2__ProvidersAssignment_4_1 )
            {
             before(grammarAccess.getOAuth2Access().getProvidersAssignment_4_1()); 
            // InternalSecurityDsl.g:5210:2: ( rule__OAuth2__ProvidersAssignment_4_1 )
            // InternalSecurityDsl.g:5210:3: rule__OAuth2__ProvidersAssignment_4_1
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
    // InternalSecurityDsl.g:5219:1: rule__Provider__Group__0 : rule__Provider__Group__0__Impl rule__Provider__Group__1 ;
    public final void rule__Provider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5223:1: ( rule__Provider__Group__0__Impl rule__Provider__Group__1 )
            // InternalSecurityDsl.g:5224:2: rule__Provider__Group__0__Impl rule__Provider__Group__1
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
    // InternalSecurityDsl.g:5231:1: rule__Provider__Group__0__Impl : ( '{' ) ;
    public final void rule__Provider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5235:1: ( ( '{' ) )
            // InternalSecurityDsl.g:5236:1: ( '{' )
            {
            // InternalSecurityDsl.g:5236:1: ( '{' )
            // InternalSecurityDsl.g:5237:2: '{'
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
    // InternalSecurityDsl.g:5246:1: rule__Provider__Group__1 : rule__Provider__Group__1__Impl rule__Provider__Group__2 ;
    public final void rule__Provider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5250:1: ( rule__Provider__Group__1__Impl rule__Provider__Group__2 )
            // InternalSecurityDsl.g:5251:2: rule__Provider__Group__1__Impl rule__Provider__Group__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalSecurityDsl.g:5258:1: rule__Provider__Group__1__Impl : ( 'name:' ) ;
    public final void rule__Provider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5262:1: ( ( 'name:' ) )
            // InternalSecurityDsl.g:5263:1: ( 'name:' )
            {
            // InternalSecurityDsl.g:5263:1: ( 'name:' )
            // InternalSecurityDsl.g:5264:2: 'name:'
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
    // InternalSecurityDsl.g:5273:1: rule__Provider__Group__2 : rule__Provider__Group__2__Impl rule__Provider__Group__3 ;
    public final void rule__Provider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5277:1: ( rule__Provider__Group__2__Impl rule__Provider__Group__3 )
            // InternalSecurityDsl.g:5278:2: rule__Provider__Group__2__Impl rule__Provider__Group__3
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
    // InternalSecurityDsl.g:5285:1: rule__Provider__Group__2__Impl : ( ( rule__Provider__NameAssignment_2 ) ) ;
    public final void rule__Provider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5289:1: ( ( ( rule__Provider__NameAssignment_2 ) ) )
            // InternalSecurityDsl.g:5290:1: ( ( rule__Provider__NameAssignment_2 ) )
            {
            // InternalSecurityDsl.g:5290:1: ( ( rule__Provider__NameAssignment_2 ) )
            // InternalSecurityDsl.g:5291:2: ( rule__Provider__NameAssignment_2 )
            {
             before(grammarAccess.getProviderAccess().getNameAssignment_2()); 
            // InternalSecurityDsl.g:5292:2: ( rule__Provider__NameAssignment_2 )
            // InternalSecurityDsl.g:5292:3: rule__Provider__NameAssignment_2
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
    // InternalSecurityDsl.g:5300:1: rule__Provider__Group__3 : rule__Provider__Group__3__Impl rule__Provider__Group__4 ;
    public final void rule__Provider__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5304:1: ( rule__Provider__Group__3__Impl rule__Provider__Group__4 )
            // InternalSecurityDsl.g:5305:2: rule__Provider__Group__3__Impl rule__Provider__Group__4
            {
            pushFollow(FOLLOW_46);
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
    // InternalSecurityDsl.g:5312:1: rule__Provider__Group__3__Impl : ( ',' ) ;
    public final void rule__Provider__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5316:1: ( ( ',' ) )
            // InternalSecurityDsl.g:5317:1: ( ',' )
            {
            // InternalSecurityDsl.g:5317:1: ( ',' )
            // InternalSecurityDsl.g:5318:2: ','
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
    // InternalSecurityDsl.g:5327:1: rule__Provider__Group__4 : rule__Provider__Group__4__Impl rule__Provider__Group__5 ;
    public final void rule__Provider__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5331:1: ( rule__Provider__Group__4__Impl rule__Provider__Group__5 )
            // InternalSecurityDsl.g:5332:2: rule__Provider__Group__4__Impl rule__Provider__Group__5
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
    // InternalSecurityDsl.g:5339:1: rule__Provider__Group__4__Impl : ( 'clientId:' ) ;
    public final void rule__Provider__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5343:1: ( ( 'clientId:' ) )
            // InternalSecurityDsl.g:5344:1: ( 'clientId:' )
            {
            // InternalSecurityDsl.g:5344:1: ( 'clientId:' )
            // InternalSecurityDsl.g:5345:2: 'clientId:'
            {
             before(grammarAccess.getProviderAccess().getClientIdKeyword_4()); 
            match(input,85,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5354:1: rule__Provider__Group__5 : rule__Provider__Group__5__Impl rule__Provider__Group__6 ;
    public final void rule__Provider__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5358:1: ( rule__Provider__Group__5__Impl rule__Provider__Group__6 )
            // InternalSecurityDsl.g:5359:2: rule__Provider__Group__5__Impl rule__Provider__Group__6
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
    // InternalSecurityDsl.g:5366:1: rule__Provider__Group__5__Impl : ( ( rule__Provider__ClientIdAssignment_5 ) ) ;
    public final void rule__Provider__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5370:1: ( ( ( rule__Provider__ClientIdAssignment_5 ) ) )
            // InternalSecurityDsl.g:5371:1: ( ( rule__Provider__ClientIdAssignment_5 ) )
            {
            // InternalSecurityDsl.g:5371:1: ( ( rule__Provider__ClientIdAssignment_5 ) )
            // InternalSecurityDsl.g:5372:2: ( rule__Provider__ClientIdAssignment_5 )
            {
             before(grammarAccess.getProviderAccess().getClientIdAssignment_5()); 
            // InternalSecurityDsl.g:5373:2: ( rule__Provider__ClientIdAssignment_5 )
            // InternalSecurityDsl.g:5373:3: rule__Provider__ClientIdAssignment_5
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
    // InternalSecurityDsl.g:5381:1: rule__Provider__Group__6 : rule__Provider__Group__6__Impl rule__Provider__Group__7 ;
    public final void rule__Provider__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5385:1: ( rule__Provider__Group__6__Impl rule__Provider__Group__7 )
            // InternalSecurityDsl.g:5386:2: rule__Provider__Group__6__Impl rule__Provider__Group__7
            {
            pushFollow(FOLLOW_47);
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
    // InternalSecurityDsl.g:5393:1: rule__Provider__Group__6__Impl : ( ',' ) ;
    public final void rule__Provider__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5397:1: ( ( ',' ) )
            // InternalSecurityDsl.g:5398:1: ( ',' )
            {
            // InternalSecurityDsl.g:5398:1: ( ',' )
            // InternalSecurityDsl.g:5399:2: ','
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
    // InternalSecurityDsl.g:5408:1: rule__Provider__Group__7 : rule__Provider__Group__7__Impl rule__Provider__Group__8 ;
    public final void rule__Provider__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5412:1: ( rule__Provider__Group__7__Impl rule__Provider__Group__8 )
            // InternalSecurityDsl.g:5413:2: rule__Provider__Group__7__Impl rule__Provider__Group__8
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
    // InternalSecurityDsl.g:5420:1: rule__Provider__Group__7__Impl : ( 'clientSecret:' ) ;
    public final void rule__Provider__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5424:1: ( ( 'clientSecret:' ) )
            // InternalSecurityDsl.g:5425:1: ( 'clientSecret:' )
            {
            // InternalSecurityDsl.g:5425:1: ( 'clientSecret:' )
            // InternalSecurityDsl.g:5426:2: 'clientSecret:'
            {
             before(grammarAccess.getProviderAccess().getClientSecretKeyword_7()); 
            match(input,86,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5435:1: rule__Provider__Group__8 : rule__Provider__Group__8__Impl rule__Provider__Group__9 ;
    public final void rule__Provider__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5439:1: ( rule__Provider__Group__8__Impl rule__Provider__Group__9 )
            // InternalSecurityDsl.g:5440:2: rule__Provider__Group__8__Impl rule__Provider__Group__9
            {
            pushFollow(FOLLOW_48);
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
    // InternalSecurityDsl.g:5447:1: rule__Provider__Group__8__Impl : ( ( rule__Provider__ClientSecretAssignment_8 ) ) ;
    public final void rule__Provider__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5451:1: ( ( ( rule__Provider__ClientSecretAssignment_8 ) ) )
            // InternalSecurityDsl.g:5452:1: ( ( rule__Provider__ClientSecretAssignment_8 ) )
            {
            // InternalSecurityDsl.g:5452:1: ( ( rule__Provider__ClientSecretAssignment_8 ) )
            // InternalSecurityDsl.g:5453:2: ( rule__Provider__ClientSecretAssignment_8 )
            {
             before(grammarAccess.getProviderAccess().getClientSecretAssignment_8()); 
            // InternalSecurityDsl.g:5454:2: ( rule__Provider__ClientSecretAssignment_8 )
            // InternalSecurityDsl.g:5454:3: rule__Provider__ClientSecretAssignment_8
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
    // InternalSecurityDsl.g:5462:1: rule__Provider__Group__9 : rule__Provider__Group__9__Impl rule__Provider__Group__10 ;
    public final void rule__Provider__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5466:1: ( rule__Provider__Group__9__Impl rule__Provider__Group__10 )
            // InternalSecurityDsl.g:5467:2: rule__Provider__Group__9__Impl rule__Provider__Group__10
            {
            pushFollow(FOLLOW_48);
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
    // InternalSecurityDsl.g:5474:1: rule__Provider__Group__9__Impl : ( ( rule__Provider__Group_9__0 )? ) ;
    public final void rule__Provider__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5478:1: ( ( ( rule__Provider__Group_9__0 )? ) )
            // InternalSecurityDsl.g:5479:1: ( ( rule__Provider__Group_9__0 )? )
            {
            // InternalSecurityDsl.g:5479:1: ( ( rule__Provider__Group_9__0 )? )
            // InternalSecurityDsl.g:5480:2: ( rule__Provider__Group_9__0 )?
            {
             before(grammarAccess.getProviderAccess().getGroup_9()); 
            // InternalSecurityDsl.g:5481:2: ( rule__Provider__Group_9__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==67) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSecurityDsl.g:5481:3: rule__Provider__Group_9__0
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
    // InternalSecurityDsl.g:5489:1: rule__Provider__Group__10 : rule__Provider__Group__10__Impl ;
    public final void rule__Provider__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5493:1: ( rule__Provider__Group__10__Impl )
            // InternalSecurityDsl.g:5494:2: rule__Provider__Group__10__Impl
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
    // InternalSecurityDsl.g:5500:1: rule__Provider__Group__10__Impl : ( '}' ) ;
    public final void rule__Provider__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5504:1: ( ( '}' ) )
            // InternalSecurityDsl.g:5505:1: ( '}' )
            {
            // InternalSecurityDsl.g:5505:1: ( '}' )
            // InternalSecurityDsl.g:5506:2: '}'
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
    // InternalSecurityDsl.g:5516:1: rule__Provider__Group_9__0 : rule__Provider__Group_9__0__Impl rule__Provider__Group_9__1 ;
    public final void rule__Provider__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5520:1: ( rule__Provider__Group_9__0__Impl rule__Provider__Group_9__1 )
            // InternalSecurityDsl.g:5521:2: rule__Provider__Group_9__0__Impl rule__Provider__Group_9__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalSecurityDsl.g:5528:1: rule__Provider__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Provider__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5532:1: ( ( ',' ) )
            // InternalSecurityDsl.g:5533:1: ( ',' )
            {
            // InternalSecurityDsl.g:5533:1: ( ',' )
            // InternalSecurityDsl.g:5534:2: ','
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
    // InternalSecurityDsl.g:5543:1: rule__Provider__Group_9__1 : rule__Provider__Group_9__1__Impl rule__Provider__Group_9__2 ;
    public final void rule__Provider__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5547:1: ( rule__Provider__Group_9__1__Impl rule__Provider__Group_9__2 )
            // InternalSecurityDsl.g:5548:2: rule__Provider__Group_9__1__Impl rule__Provider__Group_9__2
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
    // InternalSecurityDsl.g:5555:1: rule__Provider__Group_9__1__Impl : ( 'redirectUri:' ) ;
    public final void rule__Provider__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5559:1: ( ( 'redirectUri:' ) )
            // InternalSecurityDsl.g:5560:1: ( 'redirectUri:' )
            {
            // InternalSecurityDsl.g:5560:1: ( 'redirectUri:' )
            // InternalSecurityDsl.g:5561:2: 'redirectUri:'
            {
             before(grammarAccess.getProviderAccess().getRedirectUriKeyword_9_1()); 
            match(input,87,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5570:1: rule__Provider__Group_9__2 : rule__Provider__Group_9__2__Impl ;
    public final void rule__Provider__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5574:1: ( rule__Provider__Group_9__2__Impl )
            // InternalSecurityDsl.g:5575:2: rule__Provider__Group_9__2__Impl
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
    // InternalSecurityDsl.g:5581:1: rule__Provider__Group_9__2__Impl : ( ( rule__Provider__RedirectUriAssignment_9_2 ) ) ;
    public final void rule__Provider__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5585:1: ( ( ( rule__Provider__RedirectUriAssignment_9_2 ) ) )
            // InternalSecurityDsl.g:5586:1: ( ( rule__Provider__RedirectUriAssignment_9_2 ) )
            {
            // InternalSecurityDsl.g:5586:1: ( ( rule__Provider__RedirectUriAssignment_9_2 ) )
            // InternalSecurityDsl.g:5587:2: ( rule__Provider__RedirectUriAssignment_9_2 )
            {
             before(grammarAccess.getProviderAccess().getRedirectUriAssignment_9_2()); 
            // InternalSecurityDsl.g:5588:2: ( rule__Provider__RedirectUriAssignment_9_2 )
            // InternalSecurityDsl.g:5588:3: rule__Provider__RedirectUriAssignment_9_2
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
    // InternalSecurityDsl.g:5597:1: rule__BasicAuthentication__Group__0 : rule__BasicAuthentication__Group__0__Impl rule__BasicAuthentication__Group__1 ;
    public final void rule__BasicAuthentication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5601:1: ( rule__BasicAuthentication__Group__0__Impl rule__BasicAuthentication__Group__1 )
            // InternalSecurityDsl.g:5602:2: rule__BasicAuthentication__Group__0__Impl rule__BasicAuthentication__Group__1
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
    // InternalSecurityDsl.g:5609:1: rule__BasicAuthentication__Group__0__Impl : ( () ) ;
    public final void rule__BasicAuthentication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5613:1: ( ( () ) )
            // InternalSecurityDsl.g:5614:1: ( () )
            {
            // InternalSecurityDsl.g:5614:1: ( () )
            // InternalSecurityDsl.g:5615:2: ()
            {
             before(grammarAccess.getBasicAuthenticationAccess().getBasicAuthenticationAction_0()); 
            // InternalSecurityDsl.g:5616:2: ()
            // InternalSecurityDsl.g:5616:3: 
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
    // InternalSecurityDsl.g:5624:1: rule__BasicAuthentication__Group__1 : rule__BasicAuthentication__Group__1__Impl ;
    public final void rule__BasicAuthentication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5628:1: ( rule__BasicAuthentication__Group__1__Impl )
            // InternalSecurityDsl.g:5629:2: rule__BasicAuthentication__Group__1__Impl
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
    // InternalSecurityDsl.g:5635:1: rule__BasicAuthentication__Group__1__Impl : ( 'basicAuthentication' ) ;
    public final void rule__BasicAuthentication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5639:1: ( ( 'basicAuthentication' ) )
            // InternalSecurityDsl.g:5640:1: ( 'basicAuthentication' )
            {
            // InternalSecurityDsl.g:5640:1: ( 'basicAuthentication' )
            // InternalSecurityDsl.g:5641:2: 'basicAuthentication'
            {
             before(grammarAccess.getBasicAuthenticationAccess().getBasicAuthenticationKeyword_1()); 
            match(input,88,FOLLOW_2); 
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


    // $ANTLR start "rule__Application__ArtifactAssignment_3"
    // InternalSecurityDsl.g:5651:1: rule__Application__ArtifactAssignment_3 : ( ruleEString ) ;
    public final void rule__Application__ArtifactAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5655:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5656:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5656:2: ( ruleEString )
            // InternalSecurityDsl.g:5657:3: ruleEString
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
    // InternalSecurityDsl.g:5666:1: rule__Application__NameAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Application__NameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5670:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5671:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5671:2: ( ruleEString )
            // InternalSecurityDsl.g:5672:3: ruleEString
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
    // InternalSecurityDsl.g:5681:1: rule__Application__GroupAssignment_6 : ( ruleEString ) ;
    public final void rule__Application__GroupAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5685:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5686:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5686:2: ( ruleEString )
            // InternalSecurityDsl.g:5687:3: ruleEString
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
    // InternalSecurityDsl.g:5696:1: rule__Application__PackageNameAssignment_7_1 : ( ruleEString ) ;
    public final void rule__Application__PackageNameAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5700:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5701:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5701:2: ( ruleEString )
            // InternalSecurityDsl.g:5702:3: ruleEString
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
    // InternalSecurityDsl.g:5711:1: rule__Application__DescriptionAssignment_8_1 : ( ruleEString ) ;
    public final void rule__Application__DescriptionAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5715:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5716:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5716:2: ( ruleEString )
            // InternalSecurityDsl.g:5717:3: ruleEString
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
    // InternalSecurityDsl.g:5726:1: rule__Application__PortAssignment_9_1 : ( ruleELongObject ) ;
    public final void rule__Application__PortAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5730:1: ( ( ruleELongObject ) )
            // InternalSecurityDsl.g:5731:2: ( ruleELongObject )
            {
            // InternalSecurityDsl.g:5731:2: ( ruleELongObject )
            // InternalSecurityDsl.g:5732:3: ruleELongObject
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
    // InternalSecurityDsl.g:5741:1: rule__Application__HostnameAssignment_10_1 : ( ruleEString ) ;
    public final void rule__Application__HostnameAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5745:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5746:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5746:2: ( ruleEString )
            // InternalSecurityDsl.g:5747:3: ruleEString
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
    // InternalSecurityDsl.g:5756:1: rule__Application__App_databaseAssignment_11_1 : ( ruleDatabase ) ;
    public final void rule__Application__App_databaseAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5760:1: ( ( ruleDatabase ) )
            // InternalSecurityDsl.g:5761:2: ( ruleDatabase )
            {
            // InternalSecurityDsl.g:5761:2: ( ruleDatabase )
            // InternalSecurityDsl.g:5762:3: ruleDatabase
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
    // InternalSecurityDsl.g:5771:1: rule__Application__App_entitiesAssignment_12_1_1 : ( ruleUser ) ;
    public final void rule__Application__App_entitiesAssignment_12_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5775:1: ( ( ruleUser ) )
            // InternalSecurityDsl.g:5776:2: ( ruleUser )
            {
            // InternalSecurityDsl.g:5776:2: ( ruleUser )
            // InternalSecurityDsl.g:5777:3: ruleUser
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
    // InternalSecurityDsl.g:5786:1: rule__Application__App_entitiesAssignment_12_2_1 : ( ruleRole ) ;
    public final void rule__Application__App_entitiesAssignment_12_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5790:1: ( ( ruleRole ) )
            // InternalSecurityDsl.g:5791:2: ( ruleRole )
            {
            // InternalSecurityDsl.g:5791:2: ( ruleRole )
            // InternalSecurityDsl.g:5792:3: ruleRole
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
    // InternalSecurityDsl.g:5801:1: rule__Application__App_securityAssignment_13_1 : ( ruleSecurity ) ;
    public final void rule__Application__App_securityAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5805:1: ( ( ruleSecurity ) )
            // InternalSecurityDsl.g:5806:2: ( ruleSecurity )
            {
            // InternalSecurityDsl.g:5806:2: ( ruleSecurity )
            // InternalSecurityDsl.g:5807:3: ruleSecurity
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
    // InternalSecurityDsl.g:5816:1: rule__Application__App_controllersAssignment_14_1_1 : ( ruleAuthentication ) ;
    public final void rule__Application__App_controllersAssignment_14_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5820:1: ( ( ruleAuthentication ) )
            // InternalSecurityDsl.g:5821:2: ( ruleAuthentication )
            {
            // InternalSecurityDsl.g:5821:2: ( ruleAuthentication )
            // InternalSecurityDsl.g:5822:3: ruleAuthentication
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
    // InternalSecurityDsl.g:5831:1: rule__Database__VendorNameAssignment_1 : ( ruleEDatabaseType ) ;
    public final void rule__Database__VendorNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5835:1: ( ( ruleEDatabaseType ) )
            // InternalSecurityDsl.g:5836:2: ( ruleEDatabaseType )
            {
            // InternalSecurityDsl.g:5836:2: ( ruleEDatabaseType )
            // InternalSecurityDsl.g:5837:3: ruleEDatabaseType
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
    // InternalSecurityDsl.g:5846:1: rule__Database__UrlAssignment_3 : ( ruleEString ) ;
    public final void rule__Database__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5850:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5851:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5851:2: ( ruleEString )
            // InternalSecurityDsl.g:5852:3: ruleEString
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
    // InternalSecurityDsl.g:5861:1: rule__Database__UsernameAssignment_5 : ( ruleEString ) ;
    public final void rule__Database__UsernameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5865:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5866:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5866:2: ( ruleEString )
            // InternalSecurityDsl.g:5867:3: ruleEString
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
    // InternalSecurityDsl.g:5876:1: rule__Database__PasswordAssignment_7 : ( ruleEString ) ;
    public final void rule__Database__PasswordAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5880:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5881:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5881:2: ( ruleEString )
            // InternalSecurityDsl.g:5882:3: ruleEString
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
    // InternalSecurityDsl.g:5891:1: rule__Attribute__IdentifierAssignment_1 : ( ( 'identifier' ) ) ;
    public final void rule__Attribute__IdentifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5895:1: ( ( ( 'identifier' ) ) )
            // InternalSecurityDsl.g:5896:2: ( ( 'identifier' ) )
            {
            // InternalSecurityDsl.g:5896:2: ( ( 'identifier' ) )
            // InternalSecurityDsl.g:5897:3: ( 'identifier' )
            {
             before(grammarAccess.getAttributeAccess().getIdentifierIdentifierKeyword_1_0()); 
            // InternalSecurityDsl.g:5898:3: ( 'identifier' )
            // InternalSecurityDsl.g:5899:4: 'identifier'
            {
             before(grammarAccess.getAttributeAccess().getIdentifierIdentifierKeyword_1_0()); 
            match(input,89,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5910:1: rule__Attribute__CredentialAssignment_2 : ( ( 'credential' ) ) ;
    public final void rule__Attribute__CredentialAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5914:1: ( ( ( 'credential' ) ) )
            // InternalSecurityDsl.g:5915:2: ( ( 'credential' ) )
            {
            // InternalSecurityDsl.g:5915:2: ( ( 'credential' ) )
            // InternalSecurityDsl.g:5916:3: ( 'credential' )
            {
             before(grammarAccess.getAttributeAccess().getCredentialCredentialKeyword_2_0()); 
            // InternalSecurityDsl.g:5917:3: ( 'credential' )
            // InternalSecurityDsl.g:5918:4: 'credential'
            {
             before(grammarAccess.getAttributeAccess().getCredentialCredentialKeyword_2_0()); 
            match(input,90,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5929:1: rule__Attribute__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5933:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5934:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5934:2: ( ruleEString )
            // InternalSecurityDsl.g:5935:3: ruleEString
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
    // InternalSecurityDsl.g:5944:1: rule__Attribute__TypeAssignment_6 : ( ruleEType ) ;
    public final void rule__Attribute__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5948:1: ( ( ruleEType ) )
            // InternalSecurityDsl.g:5949:2: ( ruleEType )
            {
            // InternalSecurityDsl.g:5949:2: ( ruleEType )
            // InternalSecurityDsl.g:5950:3: ruleEType
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
    // InternalSecurityDsl.g:5959:1: rule__Attribute__CollumnNameAssignment_7_1 : ( ruleEString ) ;
    public final void rule__Attribute__CollumnNameAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5963:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5964:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5964:2: ( ruleEString )
            // InternalSecurityDsl.g:5965:3: ruleEString
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
    // InternalSecurityDsl.g:5974:1: rule__Role__TableNameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__Role__TableNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5978:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5979:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5979:2: ( ruleEString )
            // InternalSecurityDsl.g:5980:3: ruleEString
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
    // InternalSecurityDsl.g:5989:1: rule__Role__Entity_attributesAssignment_2_2 : ( ruleAttribute ) ;
    public final void rule__Role__Entity_attributesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5993:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:5994:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:5994:2: ( ruleAttribute )
            // InternalSecurityDsl.g:5995:3: ruleAttribute
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
    // InternalSecurityDsl.g:6004:1: rule__Role__Entity_attributesAssignment_2_3_1 : ( ruleAttribute ) ;
    public final void rule__Role__Entity_attributesAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6008:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:6009:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:6009:2: ( ruleAttribute )
            // InternalSecurityDsl.g:6010:3: ruleAttribute
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
    // InternalSecurityDsl.g:6019:1: rule__Role__Role_instancesAssignment_3_2 : ( ruleRoleInstance ) ;
    public final void rule__Role__Role_instancesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6023:1: ( ( ruleRoleInstance ) )
            // InternalSecurityDsl.g:6024:2: ( ruleRoleInstance )
            {
            // InternalSecurityDsl.g:6024:2: ( ruleRoleInstance )
            // InternalSecurityDsl.g:6025:3: ruleRoleInstance
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
    // InternalSecurityDsl.g:6034:1: rule__Role__Role_instancesAssignment_3_3_1 : ( ruleRoleInstance ) ;
    public final void rule__Role__Role_instancesAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6038:1: ( ( ruleRoleInstance ) )
            // InternalSecurityDsl.g:6039:2: ( ruleRoleInstance )
            {
            // InternalSecurityDsl.g:6039:2: ( ruleRoleInstance )
            // InternalSecurityDsl.g:6040:3: ruleRoleInstance
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
    // InternalSecurityDsl.g:6049:1: rule__User__TableNameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__User__TableNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6053:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6054:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6054:2: ( ruleEString )
            // InternalSecurityDsl.g:6055:3: ruleEString
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
    // InternalSecurityDsl.g:6064:1: rule__User__Entity_attributesAssignment_2_2 : ( ruleAttribute ) ;
    public final void rule__User__Entity_attributesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6068:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:6069:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:6069:2: ( ruleAttribute )
            // InternalSecurityDsl.g:6070:3: ruleAttribute
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
    // InternalSecurityDsl.g:6079:1: rule__User__Entity_attributesAssignment_2_3_1 : ( ruleAttribute ) ;
    public final void rule__User__Entity_attributesAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6083:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:6084:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:6084:2: ( ruleAttribute )
            // InternalSecurityDsl.g:6085:3: ruleAttribute
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
    // InternalSecurityDsl.g:6094:1: rule__RoleInstance__ClientAssignment_1 : ( ( 'client' ) ) ;
    public final void rule__RoleInstance__ClientAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6098:1: ( ( ( 'client' ) ) )
            // InternalSecurityDsl.g:6099:2: ( ( 'client' ) )
            {
            // InternalSecurityDsl.g:6099:2: ( ( 'client' ) )
            // InternalSecurityDsl.g:6100:3: ( 'client' )
            {
             before(grammarAccess.getRoleInstanceAccess().getClientClientKeyword_1_0()); 
            // InternalSecurityDsl.g:6101:3: ( 'client' )
            // InternalSecurityDsl.g:6102:4: 'client'
            {
             before(grammarAccess.getRoleInstanceAccess().getClientClientKeyword_1_0()); 
            match(input,91,FOLLOW_2); 
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
    // InternalSecurityDsl.g:6113:1: rule__RoleInstance__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RoleInstance__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6117:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6118:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6118:2: ( ruleEString )
            // InternalSecurityDsl.g:6119:3: ruleEString
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
    // InternalSecurityDsl.g:6128:1: rule__Endpoint__TypeAssignment_2 : ( ruleEEndpointType ) ;
    public final void rule__Endpoint__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6132:1: ( ( ruleEEndpointType ) )
            // InternalSecurityDsl.g:6133:2: ( ruleEEndpointType )
            {
            // InternalSecurityDsl.g:6133:2: ( ruleEEndpointType )
            // InternalSecurityDsl.g:6134:3: ruleEEndpointType
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
    // InternalSecurityDsl.g:6143:1: rule__Endpoint__UrlAssignment_4 : ( ruleEString ) ;
    public final void rule__Endpoint__UrlAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6147:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6148:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6148:2: ( ruleEString )
            // InternalSecurityDsl.g:6149:3: ruleEString
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
    // InternalSecurityDsl.g:6158:1: rule__Endpoint__MethodNameAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Endpoint__MethodNameAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6162:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6163:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6163:2: ( ruleEString )
            // InternalSecurityDsl.g:6164:3: ruleEString
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
    // InternalSecurityDsl.g:6173:1: rule__Endpoint__MethodAssignment_6_1 : ( ruleEEndpointMethod ) ;
    public final void rule__Endpoint__MethodAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6177:1: ( ( ruleEEndpointMethod ) )
            // InternalSecurityDsl.g:6178:2: ( ruleEEndpointMethod )
            {
            // InternalSecurityDsl.g:6178:2: ( ruleEEndpointMethod )
            // InternalSecurityDsl.g:6179:3: ruleEEndpointMethod
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
    // InternalSecurityDsl.g:6188:1: rule__Endpoint__Role_authoritiesAssignment_7_2 : ( ( ruleEString ) ) ;
    public final void rule__Endpoint__Role_authoritiesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6192:1: ( ( ( ruleEString ) ) )
            // InternalSecurityDsl.g:6193:2: ( ( ruleEString ) )
            {
            // InternalSecurityDsl.g:6193:2: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6194:3: ( ruleEString )
            {
             before(grammarAccess.getEndpointAccess().getRole_authoritiesRoleInstanceCrossReference_7_2_0()); 
            // InternalSecurityDsl.g:6195:3: ( ruleEString )
            // InternalSecurityDsl.g:6196:4: ruleEString
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
    // InternalSecurityDsl.g:6207:1: rule__Endpoint__Role_authoritiesAssignment_7_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Endpoint__Role_authoritiesAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6211:1: ( ( ( ruleEString ) ) )
            // InternalSecurityDsl.g:6212:2: ( ( ruleEString ) )
            {
            // InternalSecurityDsl.g:6212:2: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6213:3: ( ruleEString )
            {
             before(grammarAccess.getEndpointAccess().getRole_authoritiesRoleInstanceCrossReference_7_3_1_0()); 
            // InternalSecurityDsl.g:6214:3: ( ruleEString )
            // InternalSecurityDsl.g:6215:4: ruleEString
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
    // InternalSecurityDsl.g:6226:1: rule__Authentication__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Authentication__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6230:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6231:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6231:2: ( ruleEString )
            // InternalSecurityDsl.g:6232:3: ruleEString
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
    // InternalSecurityDsl.g:6241:1: rule__Authentication__PathAssignment_4 : ( ruleEString ) ;
    public final void rule__Authentication__PathAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6245:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6246:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6246:2: ( ruleEString )
            // InternalSecurityDsl.g:6247:3: ruleEString
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
    // InternalSecurityDsl.g:6256:1: rule__Authentication__Controller_endpointsAssignment_5_2 : ( ruleEndpoint ) ;
    public final void rule__Authentication__Controller_endpointsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6260:1: ( ( ruleEndpoint ) )
            // InternalSecurityDsl.g:6261:2: ( ruleEndpoint )
            {
            // InternalSecurityDsl.g:6261:2: ( ruleEndpoint )
            // InternalSecurityDsl.g:6262:3: ruleEndpoint
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
    // InternalSecurityDsl.g:6271:1: rule__Authentication__Controller_endpointsAssignment_5_3_1 : ( ruleEndpoint ) ;
    public final void rule__Authentication__Controller_endpointsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6275:1: ( ( ruleEndpoint ) )
            // InternalSecurityDsl.g:6276:2: ( ruleEndpoint )
            {
            // InternalSecurityDsl.g:6276:2: ( ruleEndpoint )
            // InternalSecurityDsl.g:6277:3: ruleEndpoint
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
    // InternalSecurityDsl.g:6286:1: rule__JWT__SignatureAlgorithmAssignment_3 : ( ruleEString ) ;
    public final void rule__JWT__SignatureAlgorithmAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6290:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6291:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6291:2: ( ruleEString )
            // InternalSecurityDsl.g:6292:3: ruleEString
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


    // $ANTLR start "rule__JWT__ClaimsAssignment_7"
    // InternalSecurityDsl.g:6301:1: rule__JWT__ClaimsAssignment_7 : ( ruleClaim ) ;
    public final void rule__JWT__ClaimsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6305:1: ( ( ruleClaim ) )
            // InternalSecurityDsl.g:6306:2: ( ruleClaim )
            {
            // InternalSecurityDsl.g:6306:2: ( ruleClaim )
            // InternalSecurityDsl.g:6307:3: ruleClaim
            {
             before(grammarAccess.getJWTAccess().getClaimsClaimParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleClaim();

            state._fsp--;

             after(grammarAccess.getJWTAccess().getClaimsClaimParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JWT__ClaimsAssignment_7"


    // $ANTLR start "rule__JWT__ClaimsAssignment_8_1"
    // InternalSecurityDsl.g:6316:1: rule__JWT__ClaimsAssignment_8_1 : ( ruleClaim ) ;
    public final void rule__JWT__ClaimsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6320:1: ( ( ruleClaim ) )
            // InternalSecurityDsl.g:6321:2: ( ruleClaim )
            {
            // InternalSecurityDsl.g:6321:2: ( ruleClaim )
            // InternalSecurityDsl.g:6322:3: ruleClaim
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
    // InternalSecurityDsl.g:6331:1: rule__JWT__SecretAssignment_10_2 : ( ruleEString ) ;
    public final void rule__JWT__SecretAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6335:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6336:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6336:2: ( ruleEString )
            // InternalSecurityDsl.g:6337:3: ruleEString
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


    // $ANTLR start "rule__Claim__TypeAssignment_1"
    // InternalSecurityDsl.g:6346:1: rule__Claim__TypeAssignment_1 : ( ruleEClaimType ) ;
    public final void rule__Claim__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6350:1: ( ( ruleEClaimType ) )
            // InternalSecurityDsl.g:6351:2: ( ruleEClaimType )
            {
            // InternalSecurityDsl.g:6351:2: ( ruleEClaimType )
            // InternalSecurityDsl.g:6352:3: ruleEClaimType
            {
             before(grammarAccess.getClaimAccess().getTypeEClaimTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEClaimType();

            state._fsp--;

             after(grammarAccess.getClaimAccess().getTypeEClaimTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Claim__TypeAssignment_1"


    // $ANTLR start "rule__Claim__NameAssignment_3"
    // InternalSecurityDsl.g:6361:1: rule__Claim__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Claim__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6365:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6366:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6366:2: ( ruleEString )
            // InternalSecurityDsl.g:6367:3: ruleEString
            {
             before(grammarAccess.getClaimAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClaimAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Claim__NameAssignment_3"


    // $ANTLR start "rule__Claim__ValueAssignment_5"
    // InternalSecurityDsl.g:6376:1: rule__Claim__ValueAssignment_5 : ( ruleEString ) ;
    public final void rule__Claim__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6380:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6381:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6381:2: ( ruleEString )
            // InternalSecurityDsl.g:6382:3: ruleEString
            {
             before(grammarAccess.getClaimAccess().getValueEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClaimAccess().getValueEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Claim__ValueAssignment_5"


    // $ANTLR start "rule__Claim__Claim_attributeAssignment_6_1"
    // InternalSecurityDsl.g:6391:1: rule__Claim__Claim_attributeAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Claim__Claim_attributeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6395:1: ( ( ( ruleEString ) ) )
            // InternalSecurityDsl.g:6396:2: ( ( ruleEString ) )
            {
            // InternalSecurityDsl.g:6396:2: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6397:3: ( ruleEString )
            {
             before(grammarAccess.getClaimAccess().getClaim_attributeAttributeCrossReference_6_1_0()); 
            // InternalSecurityDsl.g:6398:3: ( ruleEString )
            // InternalSecurityDsl.g:6399:4: ruleEString
            {
             before(grammarAccess.getClaimAccess().getClaim_attributeAttributeEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClaimAccess().getClaim_attributeAttributeEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getClaimAccess().getClaim_attributeAttributeCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Claim__Claim_attributeAssignment_6_1"


    // $ANTLR start "rule__OAuth2__ProvidersAssignment_3"
    // InternalSecurityDsl.g:6410:1: rule__OAuth2__ProvidersAssignment_3 : ( ruleProvider ) ;
    public final void rule__OAuth2__ProvidersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6414:1: ( ( ruleProvider ) )
            // InternalSecurityDsl.g:6415:2: ( ruleProvider )
            {
            // InternalSecurityDsl.g:6415:2: ( ruleProvider )
            // InternalSecurityDsl.g:6416:3: ruleProvider
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
    // InternalSecurityDsl.g:6425:1: rule__OAuth2__ProvidersAssignment_4_1 : ( ruleProvider ) ;
    public final void rule__OAuth2__ProvidersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6429:1: ( ( ruleProvider ) )
            // InternalSecurityDsl.g:6430:2: ( ruleProvider )
            {
            // InternalSecurityDsl.g:6430:2: ( ruleProvider )
            // InternalSecurityDsl.g:6431:3: ruleProvider
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
    // InternalSecurityDsl.g:6440:1: rule__Provider__NameAssignment_2 : ( ruleEOAuthProvider ) ;
    public final void rule__Provider__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6444:1: ( ( ruleEOAuthProvider ) )
            // InternalSecurityDsl.g:6445:2: ( ruleEOAuthProvider )
            {
            // InternalSecurityDsl.g:6445:2: ( ruleEOAuthProvider )
            // InternalSecurityDsl.g:6446:3: ruleEOAuthProvider
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
    // InternalSecurityDsl.g:6455:1: rule__Provider__ClientIdAssignment_5 : ( ruleEString ) ;
    public final void rule__Provider__ClientIdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6459:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6460:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6460:2: ( ruleEString )
            // InternalSecurityDsl.g:6461:3: ruleEString
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
    // InternalSecurityDsl.g:6470:1: rule__Provider__ClientSecretAssignment_8 : ( ruleEString ) ;
    public final void rule__Provider__ClientSecretAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6474:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6475:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6475:2: ( ruleEString )
            // InternalSecurityDsl.g:6476:3: ruleEString
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
    // InternalSecurityDsl.g:6485:1: rule__Provider__RedirectUriAssignment_9_2 : ( ruleEString ) ;
    public final void rule__Provider__RedirectUriAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6489:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6490:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6490:2: ( ruleEString )
            // InternalSecurityDsl.g:6491:3: ruleEString
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
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000001080400L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000040000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000001FC000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000030L,0x0000000008000000L});
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
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x2000000000000030L,0x0000000000040000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000007F00000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});

}