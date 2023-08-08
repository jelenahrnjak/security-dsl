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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PostgreSQL'", "'Oracle'", "'MySQL'", "'String'", "'Float'", "'Long'", "'Integer'", "'Double'", "'DateTime'", "'Date'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'REGISTRATION'", "'LOGIN'", "'LOGOUT'", "'OTHER'", "'PRIVATE'", "'PUBLIC'", "'REGISTERED'", "'application:'", "'artifact:'", "'group:'", "'name:'", "'packageName:'", "'description:'", "'port:'", "'hostname:'", "'database:'", "'model:'", "'user:'", "'role:'", "'security:'", "'controller:'", "'auth:'", "'vendor:'", "'url:'", "'username:'", "'password:'", "'-'", "'{'", "'type:'", "'}'", "'collumnName:'", "'tableName:'", "'attributes:'", "'['", "']'", "','", "'roles:'", "'methodName:'", "'method:'", "'roleAuthorities:'", "'path:'", "'endpoints:'", "'jwt:'", "'signatureAlgorithm:'", "'secret:'", "'claims:'", "':'", "'attribute'", "'OAuth2.0:'", "'providers:'", "'clientId:'", "'clientSecret:'", "'redirectUri:'", "'basicAuthentication'", "'identifier'", "'credential'", "'client'"
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


    // $ANTLR start "rule__Security__Alternatives"
    // InternalSecurityDsl.g:532:1: rule__Security__Alternatives : ( ( ruleJWT ) | ( ruleOAuth2 ) | ( ruleBasicAuthentication ) );
    public final void rule__Security__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:536:1: ( ( ruleJWT ) | ( ruleOAuth2 ) | ( ruleBasicAuthentication ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt1=1;
                }
                break;
            case 73:
                {
                alt1=2;
                }
                break;
            case 78:
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
                    // InternalSecurityDsl.g:537:2: ( ruleJWT )
                    {
                    // InternalSecurityDsl.g:537:2: ( ruleJWT )
                    // InternalSecurityDsl.g:538:3: ruleJWT
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
                    // InternalSecurityDsl.g:543:2: ( ruleOAuth2 )
                    {
                    // InternalSecurityDsl.g:543:2: ( ruleOAuth2 )
                    // InternalSecurityDsl.g:544:3: ruleOAuth2
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
                    // InternalSecurityDsl.g:549:2: ( ruleBasicAuthentication )
                    {
                    // InternalSecurityDsl.g:549:2: ( ruleBasicAuthentication )
                    // InternalSecurityDsl.g:550:3: ruleBasicAuthentication
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
    // InternalSecurityDsl.g:559:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:563:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalSecurityDsl.g:564:2: ( RULE_STRING )
                    {
                    // InternalSecurityDsl.g:564:2: ( RULE_STRING )
                    // InternalSecurityDsl.g:565:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:570:2: ( RULE_ID )
                    {
                    // InternalSecurityDsl.g:570:2: ( RULE_ID )
                    // InternalSecurityDsl.g:571:3: RULE_ID
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
    // InternalSecurityDsl.g:580:1: rule__EDatabaseType__Alternatives : ( ( ( 'PostgreSQL' ) ) | ( ( 'Oracle' ) ) | ( ( 'MySQL' ) ) );
    public final void rule__EDatabaseType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:584:1: ( ( ( 'PostgreSQL' ) ) | ( ( 'Oracle' ) ) | ( ( 'MySQL' ) ) )
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
                    // InternalSecurityDsl.g:585:2: ( ( 'PostgreSQL' ) )
                    {
                    // InternalSecurityDsl.g:585:2: ( ( 'PostgreSQL' ) )
                    // InternalSecurityDsl.g:586:3: ( 'PostgreSQL' )
                    {
                     before(grammarAccess.getEDatabaseTypeAccess().getPostgreSQLEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:587:3: ( 'PostgreSQL' )
                    // InternalSecurityDsl.g:587:4: 'PostgreSQL'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getEDatabaseTypeAccess().getPostgreSQLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:591:2: ( ( 'Oracle' ) )
                    {
                    // InternalSecurityDsl.g:591:2: ( ( 'Oracle' ) )
                    // InternalSecurityDsl.g:592:3: ( 'Oracle' )
                    {
                     before(grammarAccess.getEDatabaseTypeAccess().getOracleEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:593:3: ( 'Oracle' )
                    // InternalSecurityDsl.g:593:4: 'Oracle'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getEDatabaseTypeAccess().getOracleEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:597:2: ( ( 'MySQL' ) )
                    {
                    // InternalSecurityDsl.g:597:2: ( ( 'MySQL' ) )
                    // InternalSecurityDsl.g:598:3: ( 'MySQL' )
                    {
                     before(grammarAccess.getEDatabaseTypeAccess().getMySQLEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:599:3: ( 'MySQL' )
                    // InternalSecurityDsl.g:599:4: 'MySQL'
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
    // InternalSecurityDsl.g:607:1: rule__EType__Alternatives : ( ( ( 'String' ) ) | ( ( 'Float' ) ) | ( ( 'Long' ) ) | ( ( 'Integer' ) ) | ( ( 'Double' ) ) | ( ( 'DateTime' ) ) | ( ( 'Date' ) ) );
    public final void rule__EType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:611:1: ( ( ( 'String' ) ) | ( ( 'Float' ) ) | ( ( 'Long' ) ) | ( ( 'Integer' ) ) | ( ( 'Double' ) ) | ( ( 'DateTime' ) ) | ( ( 'Date' ) ) )
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
                    // InternalSecurityDsl.g:612:2: ( ( 'String' ) )
                    {
                    // InternalSecurityDsl.g:612:2: ( ( 'String' ) )
                    // InternalSecurityDsl.g:613:3: ( 'String' )
                    {
                     before(grammarAccess.getETypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:614:3: ( 'String' )
                    // InternalSecurityDsl.g:614:4: 'String'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:618:2: ( ( 'Float' ) )
                    {
                    // InternalSecurityDsl.g:618:2: ( ( 'Float' ) )
                    // InternalSecurityDsl.g:619:3: ( 'Float' )
                    {
                     before(grammarAccess.getETypeAccess().getFloatEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:620:3: ( 'Float' )
                    // InternalSecurityDsl.g:620:4: 'Float'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getFloatEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:624:2: ( ( 'Long' ) )
                    {
                    // InternalSecurityDsl.g:624:2: ( ( 'Long' ) )
                    // InternalSecurityDsl.g:625:3: ( 'Long' )
                    {
                     before(grammarAccess.getETypeAccess().getLongEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:626:3: ( 'Long' )
                    // InternalSecurityDsl.g:626:4: 'Long'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getLongEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:630:2: ( ( 'Integer' ) )
                    {
                    // InternalSecurityDsl.g:630:2: ( ( 'Integer' ) )
                    // InternalSecurityDsl.g:631:3: ( 'Integer' )
                    {
                     before(grammarAccess.getETypeAccess().getIntegerEnumLiteralDeclaration_3()); 
                    // InternalSecurityDsl.g:632:3: ( 'Integer' )
                    // InternalSecurityDsl.g:632:4: 'Integer'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getIntegerEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSecurityDsl.g:636:2: ( ( 'Double' ) )
                    {
                    // InternalSecurityDsl.g:636:2: ( ( 'Double' ) )
                    // InternalSecurityDsl.g:637:3: ( 'Double' )
                    {
                     before(grammarAccess.getETypeAccess().getDoubleEnumLiteralDeclaration_4()); 
                    // InternalSecurityDsl.g:638:3: ( 'Double' )
                    // InternalSecurityDsl.g:638:4: 'Double'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getDoubleEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSecurityDsl.g:642:2: ( ( 'DateTime' ) )
                    {
                    // InternalSecurityDsl.g:642:2: ( ( 'DateTime' ) )
                    // InternalSecurityDsl.g:643:3: ( 'DateTime' )
                    {
                     before(grammarAccess.getETypeAccess().getDateTimeEnumLiteralDeclaration_5()); 
                    // InternalSecurityDsl.g:644:3: ( 'DateTime' )
                    // InternalSecurityDsl.g:644:4: 'DateTime'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getDateTimeEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSecurityDsl.g:648:2: ( ( 'Date' ) )
                    {
                    // InternalSecurityDsl.g:648:2: ( ( 'Date' ) )
                    // InternalSecurityDsl.g:649:3: ( 'Date' )
                    {
                     before(grammarAccess.getETypeAccess().getDateEnumLiteralDeclaration_6()); 
                    // InternalSecurityDsl.g:650:3: ( 'Date' )
                    // InternalSecurityDsl.g:650:4: 'Date'
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
    // InternalSecurityDsl.g:658:1: rule__EEndpointMethod__Alternatives : ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) );
    public final void rule__EEndpointMethod__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:662:1: ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) )
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
                    // InternalSecurityDsl.g:663:2: ( ( 'GET' ) )
                    {
                    // InternalSecurityDsl.g:663:2: ( ( 'GET' ) )
                    // InternalSecurityDsl.g:664:3: ( 'GET' )
                    {
                     before(grammarAccess.getEEndpointMethodAccess().getGETEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:665:3: ( 'GET' )
                    // InternalSecurityDsl.g:665:4: 'GET'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointMethodAccess().getGETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:669:2: ( ( 'POST' ) )
                    {
                    // InternalSecurityDsl.g:669:2: ( ( 'POST' ) )
                    // InternalSecurityDsl.g:670:3: ( 'POST' )
                    {
                     before(grammarAccess.getEEndpointMethodAccess().getPOSTEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:671:3: ( 'POST' )
                    // InternalSecurityDsl.g:671:4: 'POST'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointMethodAccess().getPOSTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:675:2: ( ( 'PUT' ) )
                    {
                    // InternalSecurityDsl.g:675:2: ( ( 'PUT' ) )
                    // InternalSecurityDsl.g:676:3: ( 'PUT' )
                    {
                     before(grammarAccess.getEEndpointMethodAccess().getPUTEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:677:3: ( 'PUT' )
                    // InternalSecurityDsl.g:677:4: 'PUT'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointMethodAccess().getPUTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:681:2: ( ( 'DELETE' ) )
                    {
                    // InternalSecurityDsl.g:681:2: ( ( 'DELETE' ) )
                    // InternalSecurityDsl.g:682:3: ( 'DELETE' )
                    {
                     before(grammarAccess.getEEndpointMethodAccess().getDELETEEnumLiteralDeclaration_3()); 
                    // InternalSecurityDsl.g:683:3: ( 'DELETE' )
                    // InternalSecurityDsl.g:683:4: 'DELETE'
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
    // InternalSecurityDsl.g:691:1: rule__EEndpointType__Alternatives : ( ( ( 'REGISTRATION' ) ) | ( ( 'LOGIN' ) ) | ( ( 'LOGOUT' ) ) | ( ( 'OTHER' ) ) );
    public final void rule__EEndpointType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:695:1: ( ( ( 'REGISTRATION' ) ) | ( ( 'LOGIN' ) ) | ( ( 'LOGOUT' ) ) | ( ( 'OTHER' ) ) )
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
                    // InternalSecurityDsl.g:696:2: ( ( 'REGISTRATION' ) )
                    {
                    // InternalSecurityDsl.g:696:2: ( ( 'REGISTRATION' ) )
                    // InternalSecurityDsl.g:697:3: ( 'REGISTRATION' )
                    {
                     before(grammarAccess.getEEndpointTypeAccess().getREGISTRATIONEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:698:3: ( 'REGISTRATION' )
                    // InternalSecurityDsl.g:698:4: 'REGISTRATION'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointTypeAccess().getREGISTRATIONEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:702:2: ( ( 'LOGIN' ) )
                    {
                    // InternalSecurityDsl.g:702:2: ( ( 'LOGIN' ) )
                    // InternalSecurityDsl.g:703:3: ( 'LOGIN' )
                    {
                     before(grammarAccess.getEEndpointTypeAccess().getLOGINEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:704:3: ( 'LOGIN' )
                    // InternalSecurityDsl.g:704:4: 'LOGIN'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointTypeAccess().getLOGINEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:708:2: ( ( 'LOGOUT' ) )
                    {
                    // InternalSecurityDsl.g:708:2: ( ( 'LOGOUT' ) )
                    // InternalSecurityDsl.g:709:3: ( 'LOGOUT' )
                    {
                     before(grammarAccess.getEEndpointTypeAccess().getLOGOUTEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:710:3: ( 'LOGOUT' )
                    // InternalSecurityDsl.g:710:4: 'LOGOUT'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointTypeAccess().getLOGOUTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:714:2: ( ( 'OTHER' ) )
                    {
                    // InternalSecurityDsl.g:714:2: ( ( 'OTHER' ) )
                    // InternalSecurityDsl.g:715:3: ( 'OTHER' )
                    {
                     before(grammarAccess.getEEndpointTypeAccess().getOTHEREnumLiteralDeclaration_3()); 
                    // InternalSecurityDsl.g:716:3: ( 'OTHER' )
                    // InternalSecurityDsl.g:716:4: 'OTHER'
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
    // InternalSecurityDsl.g:724:1: rule__EClaimType__Alternatives : ( ( ( 'PRIVATE' ) ) | ( ( 'PUBLIC' ) ) | ( ( 'REGISTERED' ) ) );
    public final void rule__EClaimType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:728:1: ( ( ( 'PRIVATE' ) ) | ( ( 'PUBLIC' ) ) | ( ( 'REGISTERED' ) ) )
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
                    // InternalSecurityDsl.g:729:2: ( ( 'PRIVATE' ) )
                    {
                    // InternalSecurityDsl.g:729:2: ( ( 'PRIVATE' ) )
                    // InternalSecurityDsl.g:730:3: ( 'PRIVATE' )
                    {
                     before(grammarAccess.getEClaimTypeAccess().getPRIVATEEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:731:3: ( 'PRIVATE' )
                    // InternalSecurityDsl.g:731:4: 'PRIVATE'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getEClaimTypeAccess().getPRIVATEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:735:2: ( ( 'PUBLIC' ) )
                    {
                    // InternalSecurityDsl.g:735:2: ( ( 'PUBLIC' ) )
                    // InternalSecurityDsl.g:736:3: ( 'PUBLIC' )
                    {
                     before(grammarAccess.getEClaimTypeAccess().getPUBLICEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:737:3: ( 'PUBLIC' )
                    // InternalSecurityDsl.g:737:4: 'PUBLIC'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getEClaimTypeAccess().getPUBLICEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:741:2: ( ( 'REGISTERED' ) )
                    {
                    // InternalSecurityDsl.g:741:2: ( ( 'REGISTERED' ) )
                    // InternalSecurityDsl.g:742:3: ( 'REGISTERED' )
                    {
                     before(grammarAccess.getEClaimTypeAccess().getREGISTEREDEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:743:3: ( 'REGISTERED' )
                    // InternalSecurityDsl.g:743:4: 'REGISTERED'
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


    // $ANTLR start "rule__Application__Group__0"
    // InternalSecurityDsl.g:751:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:755:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // InternalSecurityDsl.g:756:2: rule__Application__Group__0__Impl rule__Application__Group__1
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
    // InternalSecurityDsl.g:763:1: rule__Application__Group__0__Impl : ( () ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:767:1: ( ( () ) )
            // InternalSecurityDsl.g:768:1: ( () )
            {
            // InternalSecurityDsl.g:768:1: ( () )
            // InternalSecurityDsl.g:769:2: ()
            {
             before(grammarAccess.getApplicationAccess().getApplicationAction_0()); 
            // InternalSecurityDsl.g:770:2: ()
            // InternalSecurityDsl.g:770:3: 
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
    // InternalSecurityDsl.g:778:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:782:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // InternalSecurityDsl.g:783:2: rule__Application__Group__1__Impl rule__Application__Group__2
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
    // InternalSecurityDsl.g:790:1: rule__Application__Group__1__Impl : ( 'application:' ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:794:1: ( ( 'application:' ) )
            // InternalSecurityDsl.g:795:1: ( 'application:' )
            {
            // InternalSecurityDsl.g:795:1: ( 'application:' )
            // InternalSecurityDsl.g:796:2: 'application:'
            {
             before(grammarAccess.getApplicationAccess().getApplicationKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSecurityDsl.g:805:1: rule__Application__Group__2 : rule__Application__Group__2__Impl rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:809:1: ( rule__Application__Group__2__Impl rule__Application__Group__3 )
            // InternalSecurityDsl.g:810:2: rule__Application__Group__2__Impl rule__Application__Group__3
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
    // InternalSecurityDsl.g:817:1: rule__Application__Group__2__Impl : ( 'artifact:' ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:821:1: ( ( 'artifact:' ) )
            // InternalSecurityDsl.g:822:1: ( 'artifact:' )
            {
            // InternalSecurityDsl.g:822:1: ( 'artifact:' )
            // InternalSecurityDsl.g:823:2: 'artifact:'
            {
             before(grammarAccess.getApplicationAccess().getArtifactKeyword_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSecurityDsl.g:832:1: rule__Application__Group__3 : rule__Application__Group__3__Impl rule__Application__Group__4 ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:836:1: ( rule__Application__Group__3__Impl rule__Application__Group__4 )
            // InternalSecurityDsl.g:837:2: rule__Application__Group__3__Impl rule__Application__Group__4
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
    // InternalSecurityDsl.g:844:1: rule__Application__Group__3__Impl : ( ( rule__Application__ArtifactAssignment_3 ) ) ;
    public final void rule__Application__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:848:1: ( ( ( rule__Application__ArtifactAssignment_3 ) ) )
            // InternalSecurityDsl.g:849:1: ( ( rule__Application__ArtifactAssignment_3 ) )
            {
            // InternalSecurityDsl.g:849:1: ( ( rule__Application__ArtifactAssignment_3 ) )
            // InternalSecurityDsl.g:850:2: ( rule__Application__ArtifactAssignment_3 )
            {
             before(grammarAccess.getApplicationAccess().getArtifactAssignment_3()); 
            // InternalSecurityDsl.g:851:2: ( rule__Application__ArtifactAssignment_3 )
            // InternalSecurityDsl.g:851:3: rule__Application__ArtifactAssignment_3
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
    // InternalSecurityDsl.g:859:1: rule__Application__Group__4 : rule__Application__Group__4__Impl rule__Application__Group__5 ;
    public final void rule__Application__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:863:1: ( rule__Application__Group__4__Impl rule__Application__Group__5 )
            // InternalSecurityDsl.g:864:2: rule__Application__Group__4__Impl rule__Application__Group__5
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
    // InternalSecurityDsl.g:871:1: rule__Application__Group__4__Impl : ( ( rule__Application__Group_4__0 )? ) ;
    public final void rule__Application__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:875:1: ( ( ( rule__Application__Group_4__0 )? ) )
            // InternalSecurityDsl.g:876:1: ( ( rule__Application__Group_4__0 )? )
            {
            // InternalSecurityDsl.g:876:1: ( ( rule__Application__Group_4__0 )? )
            // InternalSecurityDsl.g:877:2: ( rule__Application__Group_4__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_4()); 
            // InternalSecurityDsl.g:878:2: ( rule__Application__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==35) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSecurityDsl.g:878:3: rule__Application__Group_4__0
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
    // InternalSecurityDsl.g:886:1: rule__Application__Group__5 : rule__Application__Group__5__Impl rule__Application__Group__6 ;
    public final void rule__Application__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:890:1: ( rule__Application__Group__5__Impl rule__Application__Group__6 )
            // InternalSecurityDsl.g:891:2: rule__Application__Group__5__Impl rule__Application__Group__6
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
    // InternalSecurityDsl.g:898:1: rule__Application__Group__5__Impl : ( 'group:' ) ;
    public final void rule__Application__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:902:1: ( ( 'group:' ) )
            // InternalSecurityDsl.g:903:1: ( 'group:' )
            {
            // InternalSecurityDsl.g:903:1: ( 'group:' )
            // InternalSecurityDsl.g:904:2: 'group:'
            {
             before(grammarAccess.getApplicationAccess().getGroupKeyword_5()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSecurityDsl.g:913:1: rule__Application__Group__6 : rule__Application__Group__6__Impl rule__Application__Group__7 ;
    public final void rule__Application__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:917:1: ( rule__Application__Group__6__Impl rule__Application__Group__7 )
            // InternalSecurityDsl.g:918:2: rule__Application__Group__6__Impl rule__Application__Group__7
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
    // InternalSecurityDsl.g:925:1: rule__Application__Group__6__Impl : ( ( rule__Application__GroupAssignment_6 ) ) ;
    public final void rule__Application__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:929:1: ( ( ( rule__Application__GroupAssignment_6 ) ) )
            // InternalSecurityDsl.g:930:1: ( ( rule__Application__GroupAssignment_6 ) )
            {
            // InternalSecurityDsl.g:930:1: ( ( rule__Application__GroupAssignment_6 ) )
            // InternalSecurityDsl.g:931:2: ( rule__Application__GroupAssignment_6 )
            {
             before(grammarAccess.getApplicationAccess().getGroupAssignment_6()); 
            // InternalSecurityDsl.g:932:2: ( rule__Application__GroupAssignment_6 )
            // InternalSecurityDsl.g:932:3: rule__Application__GroupAssignment_6
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
    // InternalSecurityDsl.g:940:1: rule__Application__Group__7 : rule__Application__Group__7__Impl rule__Application__Group__8 ;
    public final void rule__Application__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:944:1: ( rule__Application__Group__7__Impl rule__Application__Group__8 )
            // InternalSecurityDsl.g:945:2: rule__Application__Group__7__Impl rule__Application__Group__8
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
    // InternalSecurityDsl.g:952:1: rule__Application__Group__7__Impl : ( ( rule__Application__Group_7__0 )? ) ;
    public final void rule__Application__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:956:1: ( ( ( rule__Application__Group_7__0 )? ) )
            // InternalSecurityDsl.g:957:1: ( ( rule__Application__Group_7__0 )? )
            {
            // InternalSecurityDsl.g:957:1: ( ( rule__Application__Group_7__0 )? )
            // InternalSecurityDsl.g:958:2: ( rule__Application__Group_7__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_7()); 
            // InternalSecurityDsl.g:959:2: ( rule__Application__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==36) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSecurityDsl.g:959:3: rule__Application__Group_7__0
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
    // InternalSecurityDsl.g:967:1: rule__Application__Group__8 : rule__Application__Group__8__Impl rule__Application__Group__9 ;
    public final void rule__Application__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:971:1: ( rule__Application__Group__8__Impl rule__Application__Group__9 )
            // InternalSecurityDsl.g:972:2: rule__Application__Group__8__Impl rule__Application__Group__9
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
    // InternalSecurityDsl.g:979:1: rule__Application__Group__8__Impl : ( ( rule__Application__Group_8__0 )? ) ;
    public final void rule__Application__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:983:1: ( ( ( rule__Application__Group_8__0 )? ) )
            // InternalSecurityDsl.g:984:1: ( ( rule__Application__Group_8__0 )? )
            {
            // InternalSecurityDsl.g:984:1: ( ( rule__Application__Group_8__0 )? )
            // InternalSecurityDsl.g:985:2: ( rule__Application__Group_8__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_8()); 
            // InternalSecurityDsl.g:986:2: ( rule__Application__Group_8__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==37) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSecurityDsl.g:986:3: rule__Application__Group_8__0
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
    // InternalSecurityDsl.g:994:1: rule__Application__Group__9 : rule__Application__Group__9__Impl rule__Application__Group__10 ;
    public final void rule__Application__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:998:1: ( rule__Application__Group__9__Impl rule__Application__Group__10 )
            // InternalSecurityDsl.g:999:2: rule__Application__Group__9__Impl rule__Application__Group__10
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
    // InternalSecurityDsl.g:1006:1: rule__Application__Group__9__Impl : ( ( rule__Application__Group_9__0 )? ) ;
    public final void rule__Application__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1010:1: ( ( ( rule__Application__Group_9__0 )? ) )
            // InternalSecurityDsl.g:1011:1: ( ( rule__Application__Group_9__0 )? )
            {
            // InternalSecurityDsl.g:1011:1: ( ( rule__Application__Group_9__0 )? )
            // InternalSecurityDsl.g:1012:2: ( rule__Application__Group_9__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_9()); 
            // InternalSecurityDsl.g:1013:2: ( rule__Application__Group_9__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==38) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSecurityDsl.g:1013:3: rule__Application__Group_9__0
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
    // InternalSecurityDsl.g:1021:1: rule__Application__Group__10 : rule__Application__Group__10__Impl rule__Application__Group__11 ;
    public final void rule__Application__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1025:1: ( rule__Application__Group__10__Impl rule__Application__Group__11 )
            // InternalSecurityDsl.g:1026:2: rule__Application__Group__10__Impl rule__Application__Group__11
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
    // InternalSecurityDsl.g:1033:1: rule__Application__Group__10__Impl : ( ( rule__Application__Group_10__0 )? ) ;
    public final void rule__Application__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1037:1: ( ( ( rule__Application__Group_10__0 )? ) )
            // InternalSecurityDsl.g:1038:1: ( ( rule__Application__Group_10__0 )? )
            {
            // InternalSecurityDsl.g:1038:1: ( ( rule__Application__Group_10__0 )? )
            // InternalSecurityDsl.g:1039:2: ( rule__Application__Group_10__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_10()); 
            // InternalSecurityDsl.g:1040:2: ( rule__Application__Group_10__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==39) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSecurityDsl.g:1040:3: rule__Application__Group_10__0
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
    // InternalSecurityDsl.g:1048:1: rule__Application__Group__11 : rule__Application__Group__11__Impl rule__Application__Group__12 ;
    public final void rule__Application__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1052:1: ( rule__Application__Group__11__Impl rule__Application__Group__12 )
            // InternalSecurityDsl.g:1053:2: rule__Application__Group__11__Impl rule__Application__Group__12
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
    // InternalSecurityDsl.g:1060:1: rule__Application__Group__11__Impl : ( ( rule__Application__Group_11__0 )? ) ;
    public final void rule__Application__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1064:1: ( ( ( rule__Application__Group_11__0 )? ) )
            // InternalSecurityDsl.g:1065:1: ( ( rule__Application__Group_11__0 )? )
            {
            // InternalSecurityDsl.g:1065:1: ( ( rule__Application__Group_11__0 )? )
            // InternalSecurityDsl.g:1066:2: ( rule__Application__Group_11__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_11()); 
            // InternalSecurityDsl.g:1067:2: ( rule__Application__Group_11__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==40) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSecurityDsl.g:1067:3: rule__Application__Group_11__0
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
    // InternalSecurityDsl.g:1075:1: rule__Application__Group__12 : rule__Application__Group__12__Impl rule__Application__Group__13 ;
    public final void rule__Application__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1079:1: ( rule__Application__Group__12__Impl rule__Application__Group__13 )
            // InternalSecurityDsl.g:1080:2: rule__Application__Group__12__Impl rule__Application__Group__13
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
    // InternalSecurityDsl.g:1087:1: rule__Application__Group__12__Impl : ( ( rule__Application__Group_12__0 )? ) ;
    public final void rule__Application__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1091:1: ( ( ( rule__Application__Group_12__0 )? ) )
            // InternalSecurityDsl.g:1092:1: ( ( rule__Application__Group_12__0 )? )
            {
            // InternalSecurityDsl.g:1092:1: ( ( rule__Application__Group_12__0 )? )
            // InternalSecurityDsl.g:1093:2: ( rule__Application__Group_12__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_12()); 
            // InternalSecurityDsl.g:1094:2: ( rule__Application__Group_12__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==41) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSecurityDsl.g:1094:3: rule__Application__Group_12__0
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
    // InternalSecurityDsl.g:1102:1: rule__Application__Group__13 : rule__Application__Group__13__Impl rule__Application__Group__14 ;
    public final void rule__Application__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1106:1: ( rule__Application__Group__13__Impl rule__Application__Group__14 )
            // InternalSecurityDsl.g:1107:2: rule__Application__Group__13__Impl rule__Application__Group__14
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
    // InternalSecurityDsl.g:1114:1: rule__Application__Group__13__Impl : ( ( rule__Application__Group_13__0 )? ) ;
    public final void rule__Application__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1118:1: ( ( ( rule__Application__Group_13__0 )? ) )
            // InternalSecurityDsl.g:1119:1: ( ( rule__Application__Group_13__0 )? )
            {
            // InternalSecurityDsl.g:1119:1: ( ( rule__Application__Group_13__0 )? )
            // InternalSecurityDsl.g:1120:2: ( rule__Application__Group_13__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_13()); 
            // InternalSecurityDsl.g:1121:2: ( rule__Application__Group_13__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==44) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSecurityDsl.g:1121:3: rule__Application__Group_13__0
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
    // InternalSecurityDsl.g:1129:1: rule__Application__Group__14 : rule__Application__Group__14__Impl ;
    public final void rule__Application__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1133:1: ( rule__Application__Group__14__Impl )
            // InternalSecurityDsl.g:1134:2: rule__Application__Group__14__Impl
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
    // InternalSecurityDsl.g:1140:1: rule__Application__Group__14__Impl : ( ( rule__Application__Group_14__0 )? ) ;
    public final void rule__Application__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1144:1: ( ( ( rule__Application__Group_14__0 )? ) )
            // InternalSecurityDsl.g:1145:1: ( ( rule__Application__Group_14__0 )? )
            {
            // InternalSecurityDsl.g:1145:1: ( ( rule__Application__Group_14__0 )? )
            // InternalSecurityDsl.g:1146:2: ( rule__Application__Group_14__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_14()); 
            // InternalSecurityDsl.g:1147:2: ( rule__Application__Group_14__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==45) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSecurityDsl.g:1147:3: rule__Application__Group_14__0
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
    // InternalSecurityDsl.g:1156:1: rule__Application__Group_4__0 : rule__Application__Group_4__0__Impl rule__Application__Group_4__1 ;
    public final void rule__Application__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1160:1: ( rule__Application__Group_4__0__Impl rule__Application__Group_4__1 )
            // InternalSecurityDsl.g:1161:2: rule__Application__Group_4__0__Impl rule__Application__Group_4__1
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
    // InternalSecurityDsl.g:1168:1: rule__Application__Group_4__0__Impl : ( 'name:' ) ;
    public final void rule__Application__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1172:1: ( ( 'name:' ) )
            // InternalSecurityDsl.g:1173:1: ( 'name:' )
            {
            // InternalSecurityDsl.g:1173:1: ( 'name:' )
            // InternalSecurityDsl.g:1174:2: 'name:'
            {
             before(grammarAccess.getApplicationAccess().getNameKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSecurityDsl.g:1183:1: rule__Application__Group_4__1 : rule__Application__Group_4__1__Impl ;
    public final void rule__Application__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1187:1: ( rule__Application__Group_4__1__Impl )
            // InternalSecurityDsl.g:1188:2: rule__Application__Group_4__1__Impl
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
    // InternalSecurityDsl.g:1194:1: rule__Application__Group_4__1__Impl : ( ( rule__Application__NameAssignment_4_1 ) ) ;
    public final void rule__Application__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1198:1: ( ( ( rule__Application__NameAssignment_4_1 ) ) )
            // InternalSecurityDsl.g:1199:1: ( ( rule__Application__NameAssignment_4_1 ) )
            {
            // InternalSecurityDsl.g:1199:1: ( ( rule__Application__NameAssignment_4_1 ) )
            // InternalSecurityDsl.g:1200:2: ( rule__Application__NameAssignment_4_1 )
            {
             before(grammarAccess.getApplicationAccess().getNameAssignment_4_1()); 
            // InternalSecurityDsl.g:1201:2: ( rule__Application__NameAssignment_4_1 )
            // InternalSecurityDsl.g:1201:3: rule__Application__NameAssignment_4_1
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
    // InternalSecurityDsl.g:1210:1: rule__Application__Group_7__0 : rule__Application__Group_7__0__Impl rule__Application__Group_7__1 ;
    public final void rule__Application__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1214:1: ( rule__Application__Group_7__0__Impl rule__Application__Group_7__1 )
            // InternalSecurityDsl.g:1215:2: rule__Application__Group_7__0__Impl rule__Application__Group_7__1
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
    // InternalSecurityDsl.g:1222:1: rule__Application__Group_7__0__Impl : ( 'packageName:' ) ;
    public final void rule__Application__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1226:1: ( ( 'packageName:' ) )
            // InternalSecurityDsl.g:1227:1: ( 'packageName:' )
            {
            // InternalSecurityDsl.g:1227:1: ( 'packageName:' )
            // InternalSecurityDsl.g:1228:2: 'packageName:'
            {
             before(grammarAccess.getApplicationAccess().getPackageNameKeyword_7_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSecurityDsl.g:1237:1: rule__Application__Group_7__1 : rule__Application__Group_7__1__Impl ;
    public final void rule__Application__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1241:1: ( rule__Application__Group_7__1__Impl )
            // InternalSecurityDsl.g:1242:2: rule__Application__Group_7__1__Impl
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
    // InternalSecurityDsl.g:1248:1: rule__Application__Group_7__1__Impl : ( ( rule__Application__PackageNameAssignment_7_1 ) ) ;
    public final void rule__Application__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1252:1: ( ( ( rule__Application__PackageNameAssignment_7_1 ) ) )
            // InternalSecurityDsl.g:1253:1: ( ( rule__Application__PackageNameAssignment_7_1 ) )
            {
            // InternalSecurityDsl.g:1253:1: ( ( rule__Application__PackageNameAssignment_7_1 ) )
            // InternalSecurityDsl.g:1254:2: ( rule__Application__PackageNameAssignment_7_1 )
            {
             before(grammarAccess.getApplicationAccess().getPackageNameAssignment_7_1()); 
            // InternalSecurityDsl.g:1255:2: ( rule__Application__PackageNameAssignment_7_1 )
            // InternalSecurityDsl.g:1255:3: rule__Application__PackageNameAssignment_7_1
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
    // InternalSecurityDsl.g:1264:1: rule__Application__Group_8__0 : rule__Application__Group_8__0__Impl rule__Application__Group_8__1 ;
    public final void rule__Application__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1268:1: ( rule__Application__Group_8__0__Impl rule__Application__Group_8__1 )
            // InternalSecurityDsl.g:1269:2: rule__Application__Group_8__0__Impl rule__Application__Group_8__1
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
    // InternalSecurityDsl.g:1276:1: rule__Application__Group_8__0__Impl : ( 'description:' ) ;
    public final void rule__Application__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1280:1: ( ( 'description:' ) )
            // InternalSecurityDsl.g:1281:1: ( 'description:' )
            {
            // InternalSecurityDsl.g:1281:1: ( 'description:' )
            // InternalSecurityDsl.g:1282:2: 'description:'
            {
             before(grammarAccess.getApplicationAccess().getDescriptionKeyword_8_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSecurityDsl.g:1291:1: rule__Application__Group_8__1 : rule__Application__Group_8__1__Impl ;
    public final void rule__Application__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1295:1: ( rule__Application__Group_8__1__Impl )
            // InternalSecurityDsl.g:1296:2: rule__Application__Group_8__1__Impl
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
    // InternalSecurityDsl.g:1302:1: rule__Application__Group_8__1__Impl : ( ( rule__Application__DescriptionAssignment_8_1 ) ) ;
    public final void rule__Application__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1306:1: ( ( ( rule__Application__DescriptionAssignment_8_1 ) ) )
            // InternalSecurityDsl.g:1307:1: ( ( rule__Application__DescriptionAssignment_8_1 ) )
            {
            // InternalSecurityDsl.g:1307:1: ( ( rule__Application__DescriptionAssignment_8_1 ) )
            // InternalSecurityDsl.g:1308:2: ( rule__Application__DescriptionAssignment_8_1 )
            {
             before(grammarAccess.getApplicationAccess().getDescriptionAssignment_8_1()); 
            // InternalSecurityDsl.g:1309:2: ( rule__Application__DescriptionAssignment_8_1 )
            // InternalSecurityDsl.g:1309:3: rule__Application__DescriptionAssignment_8_1
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
    // InternalSecurityDsl.g:1318:1: rule__Application__Group_9__0 : rule__Application__Group_9__0__Impl rule__Application__Group_9__1 ;
    public final void rule__Application__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1322:1: ( rule__Application__Group_9__0__Impl rule__Application__Group_9__1 )
            // InternalSecurityDsl.g:1323:2: rule__Application__Group_9__0__Impl rule__Application__Group_9__1
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
    // InternalSecurityDsl.g:1330:1: rule__Application__Group_9__0__Impl : ( 'port:' ) ;
    public final void rule__Application__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1334:1: ( ( 'port:' ) )
            // InternalSecurityDsl.g:1335:1: ( 'port:' )
            {
            // InternalSecurityDsl.g:1335:1: ( 'port:' )
            // InternalSecurityDsl.g:1336:2: 'port:'
            {
             before(grammarAccess.getApplicationAccess().getPortKeyword_9_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSecurityDsl.g:1345:1: rule__Application__Group_9__1 : rule__Application__Group_9__1__Impl ;
    public final void rule__Application__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1349:1: ( rule__Application__Group_9__1__Impl )
            // InternalSecurityDsl.g:1350:2: rule__Application__Group_9__1__Impl
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
    // InternalSecurityDsl.g:1356:1: rule__Application__Group_9__1__Impl : ( ( rule__Application__PortAssignment_9_1 ) ) ;
    public final void rule__Application__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1360:1: ( ( ( rule__Application__PortAssignment_9_1 ) ) )
            // InternalSecurityDsl.g:1361:1: ( ( rule__Application__PortAssignment_9_1 ) )
            {
            // InternalSecurityDsl.g:1361:1: ( ( rule__Application__PortAssignment_9_1 ) )
            // InternalSecurityDsl.g:1362:2: ( rule__Application__PortAssignment_9_1 )
            {
             before(grammarAccess.getApplicationAccess().getPortAssignment_9_1()); 
            // InternalSecurityDsl.g:1363:2: ( rule__Application__PortAssignment_9_1 )
            // InternalSecurityDsl.g:1363:3: rule__Application__PortAssignment_9_1
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
    // InternalSecurityDsl.g:1372:1: rule__Application__Group_10__0 : rule__Application__Group_10__0__Impl rule__Application__Group_10__1 ;
    public final void rule__Application__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1376:1: ( rule__Application__Group_10__0__Impl rule__Application__Group_10__1 )
            // InternalSecurityDsl.g:1377:2: rule__Application__Group_10__0__Impl rule__Application__Group_10__1
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
    // InternalSecurityDsl.g:1384:1: rule__Application__Group_10__0__Impl : ( 'hostname:' ) ;
    public final void rule__Application__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1388:1: ( ( 'hostname:' ) )
            // InternalSecurityDsl.g:1389:1: ( 'hostname:' )
            {
            // InternalSecurityDsl.g:1389:1: ( 'hostname:' )
            // InternalSecurityDsl.g:1390:2: 'hostname:'
            {
             before(grammarAccess.getApplicationAccess().getHostnameKeyword_10_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSecurityDsl.g:1399:1: rule__Application__Group_10__1 : rule__Application__Group_10__1__Impl ;
    public final void rule__Application__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1403:1: ( rule__Application__Group_10__1__Impl )
            // InternalSecurityDsl.g:1404:2: rule__Application__Group_10__1__Impl
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
    // InternalSecurityDsl.g:1410:1: rule__Application__Group_10__1__Impl : ( ( rule__Application__HostnameAssignment_10_1 ) ) ;
    public final void rule__Application__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1414:1: ( ( ( rule__Application__HostnameAssignment_10_1 ) ) )
            // InternalSecurityDsl.g:1415:1: ( ( rule__Application__HostnameAssignment_10_1 ) )
            {
            // InternalSecurityDsl.g:1415:1: ( ( rule__Application__HostnameAssignment_10_1 ) )
            // InternalSecurityDsl.g:1416:2: ( rule__Application__HostnameAssignment_10_1 )
            {
             before(grammarAccess.getApplicationAccess().getHostnameAssignment_10_1()); 
            // InternalSecurityDsl.g:1417:2: ( rule__Application__HostnameAssignment_10_1 )
            // InternalSecurityDsl.g:1417:3: rule__Application__HostnameAssignment_10_1
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
    // InternalSecurityDsl.g:1426:1: rule__Application__Group_11__0 : rule__Application__Group_11__0__Impl rule__Application__Group_11__1 ;
    public final void rule__Application__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1430:1: ( rule__Application__Group_11__0__Impl rule__Application__Group_11__1 )
            // InternalSecurityDsl.g:1431:2: rule__Application__Group_11__0__Impl rule__Application__Group_11__1
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
    // InternalSecurityDsl.g:1438:1: rule__Application__Group_11__0__Impl : ( 'database:' ) ;
    public final void rule__Application__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1442:1: ( ( 'database:' ) )
            // InternalSecurityDsl.g:1443:1: ( 'database:' )
            {
            // InternalSecurityDsl.g:1443:1: ( 'database:' )
            // InternalSecurityDsl.g:1444:2: 'database:'
            {
             before(grammarAccess.getApplicationAccess().getDatabaseKeyword_11_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSecurityDsl.g:1453:1: rule__Application__Group_11__1 : rule__Application__Group_11__1__Impl ;
    public final void rule__Application__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1457:1: ( rule__Application__Group_11__1__Impl )
            // InternalSecurityDsl.g:1458:2: rule__Application__Group_11__1__Impl
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
    // InternalSecurityDsl.g:1464:1: rule__Application__Group_11__1__Impl : ( ( rule__Application__App_databaseAssignment_11_1 ) ) ;
    public final void rule__Application__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1468:1: ( ( ( rule__Application__App_databaseAssignment_11_1 ) ) )
            // InternalSecurityDsl.g:1469:1: ( ( rule__Application__App_databaseAssignment_11_1 ) )
            {
            // InternalSecurityDsl.g:1469:1: ( ( rule__Application__App_databaseAssignment_11_1 ) )
            // InternalSecurityDsl.g:1470:2: ( rule__Application__App_databaseAssignment_11_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_databaseAssignment_11_1()); 
            // InternalSecurityDsl.g:1471:2: ( rule__Application__App_databaseAssignment_11_1 )
            // InternalSecurityDsl.g:1471:3: rule__Application__App_databaseAssignment_11_1
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
    // InternalSecurityDsl.g:1480:1: rule__Application__Group_12__0 : rule__Application__Group_12__0__Impl rule__Application__Group_12__1 ;
    public final void rule__Application__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1484:1: ( rule__Application__Group_12__0__Impl rule__Application__Group_12__1 )
            // InternalSecurityDsl.g:1485:2: rule__Application__Group_12__0__Impl rule__Application__Group_12__1
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
    // InternalSecurityDsl.g:1492:1: rule__Application__Group_12__0__Impl : ( 'model:' ) ;
    public final void rule__Application__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1496:1: ( ( 'model:' ) )
            // InternalSecurityDsl.g:1497:1: ( 'model:' )
            {
            // InternalSecurityDsl.g:1497:1: ( 'model:' )
            // InternalSecurityDsl.g:1498:2: 'model:'
            {
             before(grammarAccess.getApplicationAccess().getModelKeyword_12_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSecurityDsl.g:1507:1: rule__Application__Group_12__1 : rule__Application__Group_12__1__Impl rule__Application__Group_12__2 ;
    public final void rule__Application__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1511:1: ( rule__Application__Group_12__1__Impl rule__Application__Group_12__2 )
            // InternalSecurityDsl.g:1512:2: rule__Application__Group_12__1__Impl rule__Application__Group_12__2
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
    // InternalSecurityDsl.g:1519:1: rule__Application__Group_12__1__Impl : ( ( rule__Application__Group_12_1__0 )? ) ;
    public final void rule__Application__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1523:1: ( ( ( rule__Application__Group_12_1__0 )? ) )
            // InternalSecurityDsl.g:1524:1: ( ( rule__Application__Group_12_1__0 )? )
            {
            // InternalSecurityDsl.g:1524:1: ( ( rule__Application__Group_12_1__0 )? )
            // InternalSecurityDsl.g:1525:2: ( rule__Application__Group_12_1__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_12_1()); 
            // InternalSecurityDsl.g:1526:2: ( rule__Application__Group_12_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==42) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSecurityDsl.g:1526:3: rule__Application__Group_12_1__0
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
    // InternalSecurityDsl.g:1534:1: rule__Application__Group_12__2 : rule__Application__Group_12__2__Impl ;
    public final void rule__Application__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1538:1: ( rule__Application__Group_12__2__Impl )
            // InternalSecurityDsl.g:1539:2: rule__Application__Group_12__2__Impl
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
    // InternalSecurityDsl.g:1545:1: rule__Application__Group_12__2__Impl : ( ( rule__Application__Group_12_2__0 )? ) ;
    public final void rule__Application__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1549:1: ( ( ( rule__Application__Group_12_2__0 )? ) )
            // InternalSecurityDsl.g:1550:1: ( ( rule__Application__Group_12_2__0 )? )
            {
            // InternalSecurityDsl.g:1550:1: ( ( rule__Application__Group_12_2__0 )? )
            // InternalSecurityDsl.g:1551:2: ( rule__Application__Group_12_2__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_12_2()); 
            // InternalSecurityDsl.g:1552:2: ( rule__Application__Group_12_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==43) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSecurityDsl.g:1552:3: rule__Application__Group_12_2__0
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
    // InternalSecurityDsl.g:1561:1: rule__Application__Group_12_1__0 : rule__Application__Group_12_1__0__Impl rule__Application__Group_12_1__1 ;
    public final void rule__Application__Group_12_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1565:1: ( rule__Application__Group_12_1__0__Impl rule__Application__Group_12_1__1 )
            // InternalSecurityDsl.g:1566:2: rule__Application__Group_12_1__0__Impl rule__Application__Group_12_1__1
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
    // InternalSecurityDsl.g:1573:1: rule__Application__Group_12_1__0__Impl : ( 'user:' ) ;
    public final void rule__Application__Group_12_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1577:1: ( ( 'user:' ) )
            // InternalSecurityDsl.g:1578:1: ( 'user:' )
            {
            // InternalSecurityDsl.g:1578:1: ( 'user:' )
            // InternalSecurityDsl.g:1579:2: 'user:'
            {
             before(grammarAccess.getApplicationAccess().getUserKeyword_12_1_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSecurityDsl.g:1588:1: rule__Application__Group_12_1__1 : rule__Application__Group_12_1__1__Impl ;
    public final void rule__Application__Group_12_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1592:1: ( rule__Application__Group_12_1__1__Impl )
            // InternalSecurityDsl.g:1593:2: rule__Application__Group_12_1__1__Impl
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
    // InternalSecurityDsl.g:1599:1: rule__Application__Group_12_1__1__Impl : ( ( rule__Application__App_entitiesAssignment_12_1_1 ) ) ;
    public final void rule__Application__Group_12_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1603:1: ( ( ( rule__Application__App_entitiesAssignment_12_1_1 ) ) )
            // InternalSecurityDsl.g:1604:1: ( ( rule__Application__App_entitiesAssignment_12_1_1 ) )
            {
            // InternalSecurityDsl.g:1604:1: ( ( rule__Application__App_entitiesAssignment_12_1_1 ) )
            // InternalSecurityDsl.g:1605:2: ( rule__Application__App_entitiesAssignment_12_1_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_entitiesAssignment_12_1_1()); 
            // InternalSecurityDsl.g:1606:2: ( rule__Application__App_entitiesAssignment_12_1_1 )
            // InternalSecurityDsl.g:1606:3: rule__Application__App_entitiesAssignment_12_1_1
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
    // InternalSecurityDsl.g:1615:1: rule__Application__Group_12_2__0 : rule__Application__Group_12_2__0__Impl rule__Application__Group_12_2__1 ;
    public final void rule__Application__Group_12_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1619:1: ( rule__Application__Group_12_2__0__Impl rule__Application__Group_12_2__1 )
            // InternalSecurityDsl.g:1620:2: rule__Application__Group_12_2__0__Impl rule__Application__Group_12_2__1
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
    // InternalSecurityDsl.g:1627:1: rule__Application__Group_12_2__0__Impl : ( 'role:' ) ;
    public final void rule__Application__Group_12_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1631:1: ( ( 'role:' ) )
            // InternalSecurityDsl.g:1632:1: ( 'role:' )
            {
            // InternalSecurityDsl.g:1632:1: ( 'role:' )
            // InternalSecurityDsl.g:1633:2: 'role:'
            {
             before(grammarAccess.getApplicationAccess().getRoleKeyword_12_2_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSecurityDsl.g:1642:1: rule__Application__Group_12_2__1 : rule__Application__Group_12_2__1__Impl ;
    public final void rule__Application__Group_12_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1646:1: ( rule__Application__Group_12_2__1__Impl )
            // InternalSecurityDsl.g:1647:2: rule__Application__Group_12_2__1__Impl
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
    // InternalSecurityDsl.g:1653:1: rule__Application__Group_12_2__1__Impl : ( ( rule__Application__App_entitiesAssignment_12_2_1 ) ) ;
    public final void rule__Application__Group_12_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1657:1: ( ( ( rule__Application__App_entitiesAssignment_12_2_1 ) ) )
            // InternalSecurityDsl.g:1658:1: ( ( rule__Application__App_entitiesAssignment_12_2_1 ) )
            {
            // InternalSecurityDsl.g:1658:1: ( ( rule__Application__App_entitiesAssignment_12_2_1 ) )
            // InternalSecurityDsl.g:1659:2: ( rule__Application__App_entitiesAssignment_12_2_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_entitiesAssignment_12_2_1()); 
            // InternalSecurityDsl.g:1660:2: ( rule__Application__App_entitiesAssignment_12_2_1 )
            // InternalSecurityDsl.g:1660:3: rule__Application__App_entitiesAssignment_12_2_1
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
    // InternalSecurityDsl.g:1669:1: rule__Application__Group_13__0 : rule__Application__Group_13__0__Impl rule__Application__Group_13__1 ;
    public final void rule__Application__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1673:1: ( rule__Application__Group_13__0__Impl rule__Application__Group_13__1 )
            // InternalSecurityDsl.g:1674:2: rule__Application__Group_13__0__Impl rule__Application__Group_13__1
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
    // InternalSecurityDsl.g:1681:1: rule__Application__Group_13__0__Impl : ( 'security:' ) ;
    public final void rule__Application__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1685:1: ( ( 'security:' ) )
            // InternalSecurityDsl.g:1686:1: ( 'security:' )
            {
            // InternalSecurityDsl.g:1686:1: ( 'security:' )
            // InternalSecurityDsl.g:1687:2: 'security:'
            {
             before(grammarAccess.getApplicationAccess().getSecurityKeyword_13_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalSecurityDsl.g:1696:1: rule__Application__Group_13__1 : rule__Application__Group_13__1__Impl ;
    public final void rule__Application__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1700:1: ( rule__Application__Group_13__1__Impl )
            // InternalSecurityDsl.g:1701:2: rule__Application__Group_13__1__Impl
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
    // InternalSecurityDsl.g:1707:1: rule__Application__Group_13__1__Impl : ( ( rule__Application__App_securityAssignment_13_1 ) ) ;
    public final void rule__Application__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1711:1: ( ( ( rule__Application__App_securityAssignment_13_1 ) ) )
            // InternalSecurityDsl.g:1712:1: ( ( rule__Application__App_securityAssignment_13_1 ) )
            {
            // InternalSecurityDsl.g:1712:1: ( ( rule__Application__App_securityAssignment_13_1 ) )
            // InternalSecurityDsl.g:1713:2: ( rule__Application__App_securityAssignment_13_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_securityAssignment_13_1()); 
            // InternalSecurityDsl.g:1714:2: ( rule__Application__App_securityAssignment_13_1 )
            // InternalSecurityDsl.g:1714:3: rule__Application__App_securityAssignment_13_1
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
    // InternalSecurityDsl.g:1723:1: rule__Application__Group_14__0 : rule__Application__Group_14__0__Impl rule__Application__Group_14__1 ;
    public final void rule__Application__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1727:1: ( rule__Application__Group_14__0__Impl rule__Application__Group_14__1 )
            // InternalSecurityDsl.g:1728:2: rule__Application__Group_14__0__Impl rule__Application__Group_14__1
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
    // InternalSecurityDsl.g:1735:1: rule__Application__Group_14__0__Impl : ( 'controller:' ) ;
    public final void rule__Application__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1739:1: ( ( 'controller:' ) )
            // InternalSecurityDsl.g:1740:1: ( 'controller:' )
            {
            // InternalSecurityDsl.g:1740:1: ( 'controller:' )
            // InternalSecurityDsl.g:1741:2: 'controller:'
            {
             before(grammarAccess.getApplicationAccess().getControllerKeyword_14_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalSecurityDsl.g:1750:1: rule__Application__Group_14__1 : rule__Application__Group_14__1__Impl ;
    public final void rule__Application__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1754:1: ( rule__Application__Group_14__1__Impl )
            // InternalSecurityDsl.g:1755:2: rule__Application__Group_14__1__Impl
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
    // InternalSecurityDsl.g:1761:1: rule__Application__Group_14__1__Impl : ( ( rule__Application__Group_14_1__0 )? ) ;
    public final void rule__Application__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1765:1: ( ( ( rule__Application__Group_14_1__0 )? ) )
            // InternalSecurityDsl.g:1766:1: ( ( rule__Application__Group_14_1__0 )? )
            {
            // InternalSecurityDsl.g:1766:1: ( ( rule__Application__Group_14_1__0 )? )
            // InternalSecurityDsl.g:1767:2: ( rule__Application__Group_14_1__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_14_1()); 
            // InternalSecurityDsl.g:1768:2: ( rule__Application__Group_14_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==46) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSecurityDsl.g:1768:3: rule__Application__Group_14_1__0
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
    // InternalSecurityDsl.g:1777:1: rule__Application__Group_14_1__0 : rule__Application__Group_14_1__0__Impl rule__Application__Group_14_1__1 ;
    public final void rule__Application__Group_14_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1781:1: ( rule__Application__Group_14_1__0__Impl rule__Application__Group_14_1__1 )
            // InternalSecurityDsl.g:1782:2: rule__Application__Group_14_1__0__Impl rule__Application__Group_14_1__1
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
    // InternalSecurityDsl.g:1789:1: rule__Application__Group_14_1__0__Impl : ( 'auth:' ) ;
    public final void rule__Application__Group_14_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1793:1: ( ( 'auth:' ) )
            // InternalSecurityDsl.g:1794:1: ( 'auth:' )
            {
            // InternalSecurityDsl.g:1794:1: ( 'auth:' )
            // InternalSecurityDsl.g:1795:2: 'auth:'
            {
             before(grammarAccess.getApplicationAccess().getAuthKeyword_14_1_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalSecurityDsl.g:1804:1: rule__Application__Group_14_1__1 : rule__Application__Group_14_1__1__Impl ;
    public final void rule__Application__Group_14_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1808:1: ( rule__Application__Group_14_1__1__Impl )
            // InternalSecurityDsl.g:1809:2: rule__Application__Group_14_1__1__Impl
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
    // InternalSecurityDsl.g:1815:1: rule__Application__Group_14_1__1__Impl : ( ( rule__Application__App_controllersAssignment_14_1_1 ) ) ;
    public final void rule__Application__Group_14_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1819:1: ( ( ( rule__Application__App_controllersAssignment_14_1_1 ) ) )
            // InternalSecurityDsl.g:1820:1: ( ( rule__Application__App_controllersAssignment_14_1_1 ) )
            {
            // InternalSecurityDsl.g:1820:1: ( ( rule__Application__App_controllersAssignment_14_1_1 ) )
            // InternalSecurityDsl.g:1821:2: ( rule__Application__App_controllersAssignment_14_1_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_controllersAssignment_14_1_1()); 
            // InternalSecurityDsl.g:1822:2: ( rule__Application__App_controllersAssignment_14_1_1 )
            // InternalSecurityDsl.g:1822:3: rule__Application__App_controllersAssignment_14_1_1
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
    // InternalSecurityDsl.g:1831:1: rule__Database__Group__0 : rule__Database__Group__0__Impl rule__Database__Group__1 ;
    public final void rule__Database__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1835:1: ( rule__Database__Group__0__Impl rule__Database__Group__1 )
            // InternalSecurityDsl.g:1836:2: rule__Database__Group__0__Impl rule__Database__Group__1
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
    // InternalSecurityDsl.g:1843:1: rule__Database__Group__0__Impl : ( 'vendor:' ) ;
    public final void rule__Database__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1847:1: ( ( 'vendor:' ) )
            // InternalSecurityDsl.g:1848:1: ( 'vendor:' )
            {
            // InternalSecurityDsl.g:1848:1: ( 'vendor:' )
            // InternalSecurityDsl.g:1849:2: 'vendor:'
            {
             before(grammarAccess.getDatabaseAccess().getVendorKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalSecurityDsl.g:1858:1: rule__Database__Group__1 : rule__Database__Group__1__Impl rule__Database__Group__2 ;
    public final void rule__Database__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1862:1: ( rule__Database__Group__1__Impl rule__Database__Group__2 )
            // InternalSecurityDsl.g:1863:2: rule__Database__Group__1__Impl rule__Database__Group__2
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
    // InternalSecurityDsl.g:1870:1: rule__Database__Group__1__Impl : ( ( rule__Database__VendorNameAssignment_1 ) ) ;
    public final void rule__Database__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1874:1: ( ( ( rule__Database__VendorNameAssignment_1 ) ) )
            // InternalSecurityDsl.g:1875:1: ( ( rule__Database__VendorNameAssignment_1 ) )
            {
            // InternalSecurityDsl.g:1875:1: ( ( rule__Database__VendorNameAssignment_1 ) )
            // InternalSecurityDsl.g:1876:2: ( rule__Database__VendorNameAssignment_1 )
            {
             before(grammarAccess.getDatabaseAccess().getVendorNameAssignment_1()); 
            // InternalSecurityDsl.g:1877:2: ( rule__Database__VendorNameAssignment_1 )
            // InternalSecurityDsl.g:1877:3: rule__Database__VendorNameAssignment_1
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
    // InternalSecurityDsl.g:1885:1: rule__Database__Group__2 : rule__Database__Group__2__Impl rule__Database__Group__3 ;
    public final void rule__Database__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1889:1: ( rule__Database__Group__2__Impl rule__Database__Group__3 )
            // InternalSecurityDsl.g:1890:2: rule__Database__Group__2__Impl rule__Database__Group__3
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
    // InternalSecurityDsl.g:1897:1: rule__Database__Group__2__Impl : ( 'url:' ) ;
    public final void rule__Database__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1901:1: ( ( 'url:' ) )
            // InternalSecurityDsl.g:1902:1: ( 'url:' )
            {
            // InternalSecurityDsl.g:1902:1: ( 'url:' )
            // InternalSecurityDsl.g:1903:2: 'url:'
            {
             before(grammarAccess.getDatabaseAccess().getUrlKeyword_2()); 
            match(input,48,FOLLOW_2); 
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
    // InternalSecurityDsl.g:1912:1: rule__Database__Group__3 : rule__Database__Group__3__Impl rule__Database__Group__4 ;
    public final void rule__Database__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1916:1: ( rule__Database__Group__3__Impl rule__Database__Group__4 )
            // InternalSecurityDsl.g:1917:2: rule__Database__Group__3__Impl rule__Database__Group__4
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
    // InternalSecurityDsl.g:1924:1: rule__Database__Group__3__Impl : ( ( rule__Database__UrlAssignment_3 ) ) ;
    public final void rule__Database__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1928:1: ( ( ( rule__Database__UrlAssignment_3 ) ) )
            // InternalSecurityDsl.g:1929:1: ( ( rule__Database__UrlAssignment_3 ) )
            {
            // InternalSecurityDsl.g:1929:1: ( ( rule__Database__UrlAssignment_3 ) )
            // InternalSecurityDsl.g:1930:2: ( rule__Database__UrlAssignment_3 )
            {
             before(grammarAccess.getDatabaseAccess().getUrlAssignment_3()); 
            // InternalSecurityDsl.g:1931:2: ( rule__Database__UrlAssignment_3 )
            // InternalSecurityDsl.g:1931:3: rule__Database__UrlAssignment_3
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
    // InternalSecurityDsl.g:1939:1: rule__Database__Group__4 : rule__Database__Group__4__Impl rule__Database__Group__5 ;
    public final void rule__Database__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1943:1: ( rule__Database__Group__4__Impl rule__Database__Group__5 )
            // InternalSecurityDsl.g:1944:2: rule__Database__Group__4__Impl rule__Database__Group__5
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
    // InternalSecurityDsl.g:1951:1: rule__Database__Group__4__Impl : ( 'username:' ) ;
    public final void rule__Database__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1955:1: ( ( 'username:' ) )
            // InternalSecurityDsl.g:1956:1: ( 'username:' )
            {
            // InternalSecurityDsl.g:1956:1: ( 'username:' )
            // InternalSecurityDsl.g:1957:2: 'username:'
            {
             before(grammarAccess.getDatabaseAccess().getUsernameKeyword_4()); 
            match(input,49,FOLLOW_2); 
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
    // InternalSecurityDsl.g:1966:1: rule__Database__Group__5 : rule__Database__Group__5__Impl rule__Database__Group__6 ;
    public final void rule__Database__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1970:1: ( rule__Database__Group__5__Impl rule__Database__Group__6 )
            // InternalSecurityDsl.g:1971:2: rule__Database__Group__5__Impl rule__Database__Group__6
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
    // InternalSecurityDsl.g:1978:1: rule__Database__Group__5__Impl : ( ( rule__Database__UsernameAssignment_5 ) ) ;
    public final void rule__Database__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1982:1: ( ( ( rule__Database__UsernameAssignment_5 ) ) )
            // InternalSecurityDsl.g:1983:1: ( ( rule__Database__UsernameAssignment_5 ) )
            {
            // InternalSecurityDsl.g:1983:1: ( ( rule__Database__UsernameAssignment_5 ) )
            // InternalSecurityDsl.g:1984:2: ( rule__Database__UsernameAssignment_5 )
            {
             before(grammarAccess.getDatabaseAccess().getUsernameAssignment_5()); 
            // InternalSecurityDsl.g:1985:2: ( rule__Database__UsernameAssignment_5 )
            // InternalSecurityDsl.g:1985:3: rule__Database__UsernameAssignment_5
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
    // InternalSecurityDsl.g:1993:1: rule__Database__Group__6 : rule__Database__Group__6__Impl rule__Database__Group__7 ;
    public final void rule__Database__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1997:1: ( rule__Database__Group__6__Impl rule__Database__Group__7 )
            // InternalSecurityDsl.g:1998:2: rule__Database__Group__6__Impl rule__Database__Group__7
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
    // InternalSecurityDsl.g:2005:1: rule__Database__Group__6__Impl : ( 'password:' ) ;
    public final void rule__Database__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2009:1: ( ( 'password:' ) )
            // InternalSecurityDsl.g:2010:1: ( 'password:' )
            {
            // InternalSecurityDsl.g:2010:1: ( 'password:' )
            // InternalSecurityDsl.g:2011:2: 'password:'
            {
             before(grammarAccess.getDatabaseAccess().getPasswordKeyword_6()); 
            match(input,50,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2020:1: rule__Database__Group__7 : rule__Database__Group__7__Impl ;
    public final void rule__Database__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2024:1: ( rule__Database__Group__7__Impl )
            // InternalSecurityDsl.g:2025:2: rule__Database__Group__7__Impl
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
    // InternalSecurityDsl.g:2031:1: rule__Database__Group__7__Impl : ( ( rule__Database__PasswordAssignment_7 ) ) ;
    public final void rule__Database__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2035:1: ( ( ( rule__Database__PasswordAssignment_7 ) ) )
            // InternalSecurityDsl.g:2036:1: ( ( rule__Database__PasswordAssignment_7 ) )
            {
            // InternalSecurityDsl.g:2036:1: ( ( rule__Database__PasswordAssignment_7 ) )
            // InternalSecurityDsl.g:2037:2: ( rule__Database__PasswordAssignment_7 )
            {
             before(grammarAccess.getDatabaseAccess().getPasswordAssignment_7()); 
            // InternalSecurityDsl.g:2038:2: ( rule__Database__PasswordAssignment_7 )
            // InternalSecurityDsl.g:2038:3: rule__Database__PasswordAssignment_7
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
    // InternalSecurityDsl.g:2047:1: rule__ELongObject__Group__0 : rule__ELongObject__Group__0__Impl rule__ELongObject__Group__1 ;
    public final void rule__ELongObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2051:1: ( rule__ELongObject__Group__0__Impl rule__ELongObject__Group__1 )
            // InternalSecurityDsl.g:2052:2: rule__ELongObject__Group__0__Impl rule__ELongObject__Group__1
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
    // InternalSecurityDsl.g:2059:1: rule__ELongObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__ELongObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2063:1: ( ( ( '-' )? ) )
            // InternalSecurityDsl.g:2064:1: ( ( '-' )? )
            {
            // InternalSecurityDsl.g:2064:1: ( ( '-' )? )
            // InternalSecurityDsl.g:2065:2: ( '-' )?
            {
             before(grammarAccess.getELongObjectAccess().getHyphenMinusKeyword_0()); 
            // InternalSecurityDsl.g:2066:2: ( '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==51) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSecurityDsl.g:2066:3: '-'
                    {
                    match(input,51,FOLLOW_2); 

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
    // InternalSecurityDsl.g:2074:1: rule__ELongObject__Group__1 : rule__ELongObject__Group__1__Impl ;
    public final void rule__ELongObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2078:1: ( rule__ELongObject__Group__1__Impl )
            // InternalSecurityDsl.g:2079:2: rule__ELongObject__Group__1__Impl
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
    // InternalSecurityDsl.g:2085:1: rule__ELongObject__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__ELongObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2089:1: ( ( RULE_INT ) )
            // InternalSecurityDsl.g:2090:1: ( RULE_INT )
            {
            // InternalSecurityDsl.g:2090:1: ( RULE_INT )
            // InternalSecurityDsl.g:2091:2: RULE_INT
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
    // InternalSecurityDsl.g:2101:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2105:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalSecurityDsl.g:2106:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalSecurityDsl.g:2113:1: rule__Attribute__Group__0__Impl : ( '{' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2117:1: ( ( '{' ) )
            // InternalSecurityDsl.g:2118:1: ( '{' )
            {
            // InternalSecurityDsl.g:2118:1: ( '{' )
            // InternalSecurityDsl.g:2119:2: '{'
            {
             before(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2128:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2132:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalSecurityDsl.g:2133:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalSecurityDsl.g:2140:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__IdentifierAssignment_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2144:1: ( ( ( rule__Attribute__IdentifierAssignment_1 )? ) )
            // InternalSecurityDsl.g:2145:1: ( ( rule__Attribute__IdentifierAssignment_1 )? )
            {
            // InternalSecurityDsl.g:2145:1: ( ( rule__Attribute__IdentifierAssignment_1 )? )
            // InternalSecurityDsl.g:2146:2: ( rule__Attribute__IdentifierAssignment_1 )?
            {
             before(grammarAccess.getAttributeAccess().getIdentifierAssignment_1()); 
            // InternalSecurityDsl.g:2147:2: ( rule__Attribute__IdentifierAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==79) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSecurityDsl.g:2147:3: rule__Attribute__IdentifierAssignment_1
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
    // InternalSecurityDsl.g:2155:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2159:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalSecurityDsl.g:2160:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
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
    // InternalSecurityDsl.g:2167:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__CredentialAssignment_2 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2171:1: ( ( ( rule__Attribute__CredentialAssignment_2 )? ) )
            // InternalSecurityDsl.g:2172:1: ( ( rule__Attribute__CredentialAssignment_2 )? )
            {
            // InternalSecurityDsl.g:2172:1: ( ( rule__Attribute__CredentialAssignment_2 )? )
            // InternalSecurityDsl.g:2173:2: ( rule__Attribute__CredentialAssignment_2 )?
            {
             before(grammarAccess.getAttributeAccess().getCredentialAssignment_2()); 
            // InternalSecurityDsl.g:2174:2: ( rule__Attribute__CredentialAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==80) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSecurityDsl.g:2174:3: rule__Attribute__CredentialAssignment_2
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
    // InternalSecurityDsl.g:2182:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2186:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalSecurityDsl.g:2187:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
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
    // InternalSecurityDsl.g:2194:1: rule__Attribute__Group__3__Impl : ( 'name:' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2198:1: ( ( 'name:' ) )
            // InternalSecurityDsl.g:2199:1: ( 'name:' )
            {
            // InternalSecurityDsl.g:2199:1: ( 'name:' )
            // InternalSecurityDsl.g:2200:2: 'name:'
            {
             before(grammarAccess.getAttributeAccess().getNameKeyword_3()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2209:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2213:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalSecurityDsl.g:2214:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
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
    // InternalSecurityDsl.g:2221:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__NameAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2225:1: ( ( ( rule__Attribute__NameAssignment_4 ) ) )
            // InternalSecurityDsl.g:2226:1: ( ( rule__Attribute__NameAssignment_4 ) )
            {
            // InternalSecurityDsl.g:2226:1: ( ( rule__Attribute__NameAssignment_4 ) )
            // InternalSecurityDsl.g:2227:2: ( rule__Attribute__NameAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_4()); 
            // InternalSecurityDsl.g:2228:2: ( rule__Attribute__NameAssignment_4 )
            // InternalSecurityDsl.g:2228:3: rule__Attribute__NameAssignment_4
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
    // InternalSecurityDsl.g:2236:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2240:1: ( rule__Attribute__Group__5__Impl rule__Attribute__Group__6 )
            // InternalSecurityDsl.g:2241:2: rule__Attribute__Group__5__Impl rule__Attribute__Group__6
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
    // InternalSecurityDsl.g:2248:1: rule__Attribute__Group__5__Impl : ( 'type:' ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2252:1: ( ( 'type:' ) )
            // InternalSecurityDsl.g:2253:1: ( 'type:' )
            {
            // InternalSecurityDsl.g:2253:1: ( 'type:' )
            // InternalSecurityDsl.g:2254:2: 'type:'
            {
             before(grammarAccess.getAttributeAccess().getTypeKeyword_5()); 
            match(input,53,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2263:1: rule__Attribute__Group__6 : rule__Attribute__Group__6__Impl rule__Attribute__Group__7 ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2267:1: ( rule__Attribute__Group__6__Impl rule__Attribute__Group__7 )
            // InternalSecurityDsl.g:2268:2: rule__Attribute__Group__6__Impl rule__Attribute__Group__7
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
    // InternalSecurityDsl.g:2275:1: rule__Attribute__Group__6__Impl : ( ( rule__Attribute__TypeAssignment_6 ) ) ;
    public final void rule__Attribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2279:1: ( ( ( rule__Attribute__TypeAssignment_6 ) ) )
            // InternalSecurityDsl.g:2280:1: ( ( rule__Attribute__TypeAssignment_6 ) )
            {
            // InternalSecurityDsl.g:2280:1: ( ( rule__Attribute__TypeAssignment_6 ) )
            // InternalSecurityDsl.g:2281:2: ( rule__Attribute__TypeAssignment_6 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_6()); 
            // InternalSecurityDsl.g:2282:2: ( rule__Attribute__TypeAssignment_6 )
            // InternalSecurityDsl.g:2282:3: rule__Attribute__TypeAssignment_6
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
    // InternalSecurityDsl.g:2290:1: rule__Attribute__Group__7 : rule__Attribute__Group__7__Impl rule__Attribute__Group__8 ;
    public final void rule__Attribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2294:1: ( rule__Attribute__Group__7__Impl rule__Attribute__Group__8 )
            // InternalSecurityDsl.g:2295:2: rule__Attribute__Group__7__Impl rule__Attribute__Group__8
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
    // InternalSecurityDsl.g:2302:1: rule__Attribute__Group__7__Impl : ( ( rule__Attribute__Group_7__0 )? ) ;
    public final void rule__Attribute__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2306:1: ( ( ( rule__Attribute__Group_7__0 )? ) )
            // InternalSecurityDsl.g:2307:1: ( ( rule__Attribute__Group_7__0 )? )
            {
            // InternalSecurityDsl.g:2307:1: ( ( rule__Attribute__Group_7__0 )? )
            // InternalSecurityDsl.g:2308:2: ( rule__Attribute__Group_7__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_7()); 
            // InternalSecurityDsl.g:2309:2: ( rule__Attribute__Group_7__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==55) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSecurityDsl.g:2309:3: rule__Attribute__Group_7__0
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
    // InternalSecurityDsl.g:2317:1: rule__Attribute__Group__8 : rule__Attribute__Group__8__Impl ;
    public final void rule__Attribute__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2321:1: ( rule__Attribute__Group__8__Impl )
            // InternalSecurityDsl.g:2322:2: rule__Attribute__Group__8__Impl
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
    // InternalSecurityDsl.g:2328:1: rule__Attribute__Group__8__Impl : ( '}' ) ;
    public final void rule__Attribute__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2332:1: ( ( '}' ) )
            // InternalSecurityDsl.g:2333:1: ( '}' )
            {
            // InternalSecurityDsl.g:2333:1: ( '}' )
            // InternalSecurityDsl.g:2334:2: '}'
            {
             before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_8()); 
            match(input,54,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2344:1: rule__Attribute__Group_7__0 : rule__Attribute__Group_7__0__Impl rule__Attribute__Group_7__1 ;
    public final void rule__Attribute__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2348:1: ( rule__Attribute__Group_7__0__Impl rule__Attribute__Group_7__1 )
            // InternalSecurityDsl.g:2349:2: rule__Attribute__Group_7__0__Impl rule__Attribute__Group_7__1
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
    // InternalSecurityDsl.g:2356:1: rule__Attribute__Group_7__0__Impl : ( 'collumnName:' ) ;
    public final void rule__Attribute__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2360:1: ( ( 'collumnName:' ) )
            // InternalSecurityDsl.g:2361:1: ( 'collumnName:' )
            {
            // InternalSecurityDsl.g:2361:1: ( 'collumnName:' )
            // InternalSecurityDsl.g:2362:2: 'collumnName:'
            {
             before(grammarAccess.getAttributeAccess().getCollumnNameKeyword_7_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2371:1: rule__Attribute__Group_7__1 : rule__Attribute__Group_7__1__Impl ;
    public final void rule__Attribute__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2375:1: ( rule__Attribute__Group_7__1__Impl )
            // InternalSecurityDsl.g:2376:2: rule__Attribute__Group_7__1__Impl
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
    // InternalSecurityDsl.g:2382:1: rule__Attribute__Group_7__1__Impl : ( ( rule__Attribute__CollumnNameAssignment_7_1 ) ) ;
    public final void rule__Attribute__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2386:1: ( ( ( rule__Attribute__CollumnNameAssignment_7_1 ) ) )
            // InternalSecurityDsl.g:2387:1: ( ( rule__Attribute__CollumnNameAssignment_7_1 ) )
            {
            // InternalSecurityDsl.g:2387:1: ( ( rule__Attribute__CollumnNameAssignment_7_1 ) )
            // InternalSecurityDsl.g:2388:2: ( rule__Attribute__CollumnNameAssignment_7_1 )
            {
             before(grammarAccess.getAttributeAccess().getCollumnNameAssignment_7_1()); 
            // InternalSecurityDsl.g:2389:2: ( rule__Attribute__CollumnNameAssignment_7_1 )
            // InternalSecurityDsl.g:2389:3: rule__Attribute__CollumnNameAssignment_7_1
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
    // InternalSecurityDsl.g:2398:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2402:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // InternalSecurityDsl.g:2403:2: rule__Role__Group__0__Impl rule__Role__Group__1
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
    // InternalSecurityDsl.g:2410:1: rule__Role__Group__0__Impl : ( () ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2414:1: ( ( () ) )
            // InternalSecurityDsl.g:2415:1: ( () )
            {
            // InternalSecurityDsl.g:2415:1: ( () )
            // InternalSecurityDsl.g:2416:2: ()
            {
             before(grammarAccess.getRoleAccess().getRoleAction_0()); 
            // InternalSecurityDsl.g:2417:2: ()
            // InternalSecurityDsl.g:2417:3: 
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
    // InternalSecurityDsl.g:2425:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2429:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // InternalSecurityDsl.g:2430:2: rule__Role__Group__1__Impl rule__Role__Group__2
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
    // InternalSecurityDsl.g:2437:1: rule__Role__Group__1__Impl : ( ( rule__Role__Group_1__0 )? ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2441:1: ( ( ( rule__Role__Group_1__0 )? ) )
            // InternalSecurityDsl.g:2442:1: ( ( rule__Role__Group_1__0 )? )
            {
            // InternalSecurityDsl.g:2442:1: ( ( rule__Role__Group_1__0 )? )
            // InternalSecurityDsl.g:2443:2: ( rule__Role__Group_1__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_1()); 
            // InternalSecurityDsl.g:2444:2: ( rule__Role__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==56) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSecurityDsl.g:2444:3: rule__Role__Group_1__0
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
    // InternalSecurityDsl.g:2452:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2456:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // InternalSecurityDsl.g:2457:2: rule__Role__Group__2__Impl rule__Role__Group__3
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
    // InternalSecurityDsl.g:2464:1: rule__Role__Group__2__Impl : ( ( rule__Role__Group_2__0 )? ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2468:1: ( ( ( rule__Role__Group_2__0 )? ) )
            // InternalSecurityDsl.g:2469:1: ( ( rule__Role__Group_2__0 )? )
            {
            // InternalSecurityDsl.g:2469:1: ( ( rule__Role__Group_2__0 )? )
            // InternalSecurityDsl.g:2470:2: ( rule__Role__Group_2__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_2()); 
            // InternalSecurityDsl.g:2471:2: ( rule__Role__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==57) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSecurityDsl.g:2471:3: rule__Role__Group_2__0
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
    // InternalSecurityDsl.g:2479:1: rule__Role__Group__3 : rule__Role__Group__3__Impl ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2483:1: ( rule__Role__Group__3__Impl )
            // InternalSecurityDsl.g:2484:2: rule__Role__Group__3__Impl
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
    // InternalSecurityDsl.g:2490:1: rule__Role__Group__3__Impl : ( ( rule__Role__Group_3__0 )? ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2494:1: ( ( ( rule__Role__Group_3__0 )? ) )
            // InternalSecurityDsl.g:2495:1: ( ( rule__Role__Group_3__0 )? )
            {
            // InternalSecurityDsl.g:2495:1: ( ( rule__Role__Group_3__0 )? )
            // InternalSecurityDsl.g:2496:2: ( rule__Role__Group_3__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_3()); 
            // InternalSecurityDsl.g:2497:2: ( rule__Role__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==61) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSecurityDsl.g:2497:3: rule__Role__Group_3__0
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
    // InternalSecurityDsl.g:2506:1: rule__Role__Group_1__0 : rule__Role__Group_1__0__Impl rule__Role__Group_1__1 ;
    public final void rule__Role__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2510:1: ( rule__Role__Group_1__0__Impl rule__Role__Group_1__1 )
            // InternalSecurityDsl.g:2511:2: rule__Role__Group_1__0__Impl rule__Role__Group_1__1
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
    // InternalSecurityDsl.g:2518:1: rule__Role__Group_1__0__Impl : ( 'tableName:' ) ;
    public final void rule__Role__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2522:1: ( ( 'tableName:' ) )
            // InternalSecurityDsl.g:2523:1: ( 'tableName:' )
            {
            // InternalSecurityDsl.g:2523:1: ( 'tableName:' )
            // InternalSecurityDsl.g:2524:2: 'tableName:'
            {
             before(grammarAccess.getRoleAccess().getTableNameKeyword_1_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2533:1: rule__Role__Group_1__1 : rule__Role__Group_1__1__Impl ;
    public final void rule__Role__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2537:1: ( rule__Role__Group_1__1__Impl )
            // InternalSecurityDsl.g:2538:2: rule__Role__Group_1__1__Impl
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
    // InternalSecurityDsl.g:2544:1: rule__Role__Group_1__1__Impl : ( ( rule__Role__TableNameAssignment_1_1 ) ) ;
    public final void rule__Role__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2548:1: ( ( ( rule__Role__TableNameAssignment_1_1 ) ) )
            // InternalSecurityDsl.g:2549:1: ( ( rule__Role__TableNameAssignment_1_1 ) )
            {
            // InternalSecurityDsl.g:2549:1: ( ( rule__Role__TableNameAssignment_1_1 ) )
            // InternalSecurityDsl.g:2550:2: ( rule__Role__TableNameAssignment_1_1 )
            {
             before(grammarAccess.getRoleAccess().getTableNameAssignment_1_1()); 
            // InternalSecurityDsl.g:2551:2: ( rule__Role__TableNameAssignment_1_1 )
            // InternalSecurityDsl.g:2551:3: rule__Role__TableNameAssignment_1_1
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
    // InternalSecurityDsl.g:2560:1: rule__Role__Group_2__0 : rule__Role__Group_2__0__Impl rule__Role__Group_2__1 ;
    public final void rule__Role__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2564:1: ( rule__Role__Group_2__0__Impl rule__Role__Group_2__1 )
            // InternalSecurityDsl.g:2565:2: rule__Role__Group_2__0__Impl rule__Role__Group_2__1
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
    // InternalSecurityDsl.g:2572:1: rule__Role__Group_2__0__Impl : ( 'attributes:' ) ;
    public final void rule__Role__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2576:1: ( ( 'attributes:' ) )
            // InternalSecurityDsl.g:2577:1: ( 'attributes:' )
            {
            // InternalSecurityDsl.g:2577:1: ( 'attributes:' )
            // InternalSecurityDsl.g:2578:2: 'attributes:'
            {
             before(grammarAccess.getRoleAccess().getAttributesKeyword_2_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2587:1: rule__Role__Group_2__1 : rule__Role__Group_2__1__Impl rule__Role__Group_2__2 ;
    public final void rule__Role__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2591:1: ( rule__Role__Group_2__1__Impl rule__Role__Group_2__2 )
            // InternalSecurityDsl.g:2592:2: rule__Role__Group_2__1__Impl rule__Role__Group_2__2
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
    // InternalSecurityDsl.g:2599:1: rule__Role__Group_2__1__Impl : ( '[' ) ;
    public final void rule__Role__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2603:1: ( ( '[' ) )
            // InternalSecurityDsl.g:2604:1: ( '[' )
            {
            // InternalSecurityDsl.g:2604:1: ( '[' )
            // InternalSecurityDsl.g:2605:2: '['
            {
             before(grammarAccess.getRoleAccess().getLeftSquareBracketKeyword_2_1()); 
            match(input,58,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2614:1: rule__Role__Group_2__2 : rule__Role__Group_2__2__Impl rule__Role__Group_2__3 ;
    public final void rule__Role__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2618:1: ( rule__Role__Group_2__2__Impl rule__Role__Group_2__3 )
            // InternalSecurityDsl.g:2619:2: rule__Role__Group_2__2__Impl rule__Role__Group_2__3
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
    // InternalSecurityDsl.g:2626:1: rule__Role__Group_2__2__Impl : ( ( rule__Role__Entity_attributesAssignment_2_2 ) ) ;
    public final void rule__Role__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2630:1: ( ( ( rule__Role__Entity_attributesAssignment_2_2 ) ) )
            // InternalSecurityDsl.g:2631:1: ( ( rule__Role__Entity_attributesAssignment_2_2 ) )
            {
            // InternalSecurityDsl.g:2631:1: ( ( rule__Role__Entity_attributesAssignment_2_2 ) )
            // InternalSecurityDsl.g:2632:2: ( rule__Role__Entity_attributesAssignment_2_2 )
            {
             before(grammarAccess.getRoleAccess().getEntity_attributesAssignment_2_2()); 
            // InternalSecurityDsl.g:2633:2: ( rule__Role__Entity_attributesAssignment_2_2 )
            // InternalSecurityDsl.g:2633:3: rule__Role__Entity_attributesAssignment_2_2
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
    // InternalSecurityDsl.g:2641:1: rule__Role__Group_2__3 : rule__Role__Group_2__3__Impl rule__Role__Group_2__4 ;
    public final void rule__Role__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2645:1: ( rule__Role__Group_2__3__Impl rule__Role__Group_2__4 )
            // InternalSecurityDsl.g:2646:2: rule__Role__Group_2__3__Impl rule__Role__Group_2__4
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
    // InternalSecurityDsl.g:2653:1: rule__Role__Group_2__3__Impl : ( ( rule__Role__Group_2_3__0 )* ) ;
    public final void rule__Role__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2657:1: ( ( ( rule__Role__Group_2_3__0 )* ) )
            // InternalSecurityDsl.g:2658:1: ( ( rule__Role__Group_2_3__0 )* )
            {
            // InternalSecurityDsl.g:2658:1: ( ( rule__Role__Group_2_3__0 )* )
            // InternalSecurityDsl.g:2659:2: ( rule__Role__Group_2_3__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_2_3()); 
            // InternalSecurityDsl.g:2660:2: ( rule__Role__Group_2_3__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==60) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalSecurityDsl.g:2660:3: rule__Role__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_27);
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
    // InternalSecurityDsl.g:2668:1: rule__Role__Group_2__4 : rule__Role__Group_2__4__Impl ;
    public final void rule__Role__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2672:1: ( rule__Role__Group_2__4__Impl )
            // InternalSecurityDsl.g:2673:2: rule__Role__Group_2__4__Impl
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
    // InternalSecurityDsl.g:2679:1: rule__Role__Group_2__4__Impl : ( ']' ) ;
    public final void rule__Role__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2683:1: ( ( ']' ) )
            // InternalSecurityDsl.g:2684:1: ( ']' )
            {
            // InternalSecurityDsl.g:2684:1: ( ']' )
            // InternalSecurityDsl.g:2685:2: ']'
            {
             before(grammarAccess.getRoleAccess().getRightSquareBracketKeyword_2_4()); 
            match(input,59,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2695:1: rule__Role__Group_2_3__0 : rule__Role__Group_2_3__0__Impl rule__Role__Group_2_3__1 ;
    public final void rule__Role__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2699:1: ( rule__Role__Group_2_3__0__Impl rule__Role__Group_2_3__1 )
            // InternalSecurityDsl.g:2700:2: rule__Role__Group_2_3__0__Impl rule__Role__Group_2_3__1
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
    // InternalSecurityDsl.g:2707:1: rule__Role__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__Role__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2711:1: ( ( ',' ) )
            // InternalSecurityDsl.g:2712:1: ( ',' )
            {
            // InternalSecurityDsl.g:2712:1: ( ',' )
            // InternalSecurityDsl.g:2713:2: ','
            {
             before(grammarAccess.getRoleAccess().getCommaKeyword_2_3_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2722:1: rule__Role__Group_2_3__1 : rule__Role__Group_2_3__1__Impl ;
    public final void rule__Role__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2726:1: ( rule__Role__Group_2_3__1__Impl )
            // InternalSecurityDsl.g:2727:2: rule__Role__Group_2_3__1__Impl
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
    // InternalSecurityDsl.g:2733:1: rule__Role__Group_2_3__1__Impl : ( ( rule__Role__Entity_attributesAssignment_2_3_1 ) ) ;
    public final void rule__Role__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2737:1: ( ( ( rule__Role__Entity_attributesAssignment_2_3_1 ) ) )
            // InternalSecurityDsl.g:2738:1: ( ( rule__Role__Entity_attributesAssignment_2_3_1 ) )
            {
            // InternalSecurityDsl.g:2738:1: ( ( rule__Role__Entity_attributesAssignment_2_3_1 ) )
            // InternalSecurityDsl.g:2739:2: ( rule__Role__Entity_attributesAssignment_2_3_1 )
            {
             before(grammarAccess.getRoleAccess().getEntity_attributesAssignment_2_3_1()); 
            // InternalSecurityDsl.g:2740:2: ( rule__Role__Entity_attributesAssignment_2_3_1 )
            // InternalSecurityDsl.g:2740:3: rule__Role__Entity_attributesAssignment_2_3_1
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
    // InternalSecurityDsl.g:2749:1: rule__Role__Group_3__0 : rule__Role__Group_3__0__Impl rule__Role__Group_3__1 ;
    public final void rule__Role__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2753:1: ( rule__Role__Group_3__0__Impl rule__Role__Group_3__1 )
            // InternalSecurityDsl.g:2754:2: rule__Role__Group_3__0__Impl rule__Role__Group_3__1
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
    // InternalSecurityDsl.g:2761:1: rule__Role__Group_3__0__Impl : ( 'roles:' ) ;
    public final void rule__Role__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2765:1: ( ( 'roles:' ) )
            // InternalSecurityDsl.g:2766:1: ( 'roles:' )
            {
            // InternalSecurityDsl.g:2766:1: ( 'roles:' )
            // InternalSecurityDsl.g:2767:2: 'roles:'
            {
             before(grammarAccess.getRoleAccess().getRolesKeyword_3_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2776:1: rule__Role__Group_3__1 : rule__Role__Group_3__1__Impl rule__Role__Group_3__2 ;
    public final void rule__Role__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2780:1: ( rule__Role__Group_3__1__Impl rule__Role__Group_3__2 )
            // InternalSecurityDsl.g:2781:2: rule__Role__Group_3__1__Impl rule__Role__Group_3__2
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
    // InternalSecurityDsl.g:2788:1: rule__Role__Group_3__1__Impl : ( '[' ) ;
    public final void rule__Role__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2792:1: ( ( '[' ) )
            // InternalSecurityDsl.g:2793:1: ( '[' )
            {
            // InternalSecurityDsl.g:2793:1: ( '[' )
            // InternalSecurityDsl.g:2794:2: '['
            {
             before(grammarAccess.getRoleAccess().getLeftSquareBracketKeyword_3_1()); 
            match(input,58,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2803:1: rule__Role__Group_3__2 : rule__Role__Group_3__2__Impl rule__Role__Group_3__3 ;
    public final void rule__Role__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2807:1: ( rule__Role__Group_3__2__Impl rule__Role__Group_3__3 )
            // InternalSecurityDsl.g:2808:2: rule__Role__Group_3__2__Impl rule__Role__Group_3__3
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
    // InternalSecurityDsl.g:2815:1: rule__Role__Group_3__2__Impl : ( ( rule__Role__Role_instancesAssignment_3_2 ) ) ;
    public final void rule__Role__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2819:1: ( ( ( rule__Role__Role_instancesAssignment_3_2 ) ) )
            // InternalSecurityDsl.g:2820:1: ( ( rule__Role__Role_instancesAssignment_3_2 ) )
            {
            // InternalSecurityDsl.g:2820:1: ( ( rule__Role__Role_instancesAssignment_3_2 ) )
            // InternalSecurityDsl.g:2821:2: ( rule__Role__Role_instancesAssignment_3_2 )
            {
             before(grammarAccess.getRoleAccess().getRole_instancesAssignment_3_2()); 
            // InternalSecurityDsl.g:2822:2: ( rule__Role__Role_instancesAssignment_3_2 )
            // InternalSecurityDsl.g:2822:3: rule__Role__Role_instancesAssignment_3_2
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
    // InternalSecurityDsl.g:2830:1: rule__Role__Group_3__3 : rule__Role__Group_3__3__Impl rule__Role__Group_3__4 ;
    public final void rule__Role__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2834:1: ( rule__Role__Group_3__3__Impl rule__Role__Group_3__4 )
            // InternalSecurityDsl.g:2835:2: rule__Role__Group_3__3__Impl rule__Role__Group_3__4
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
    // InternalSecurityDsl.g:2842:1: rule__Role__Group_3__3__Impl : ( ( rule__Role__Group_3_3__0 )* ) ;
    public final void rule__Role__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2846:1: ( ( ( rule__Role__Group_3_3__0 )* ) )
            // InternalSecurityDsl.g:2847:1: ( ( rule__Role__Group_3_3__0 )* )
            {
            // InternalSecurityDsl.g:2847:1: ( ( rule__Role__Group_3_3__0 )* )
            // InternalSecurityDsl.g:2848:2: ( rule__Role__Group_3_3__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_3_3()); 
            // InternalSecurityDsl.g:2849:2: ( rule__Role__Group_3_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==60) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalSecurityDsl.g:2849:3: rule__Role__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_27);
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
    // InternalSecurityDsl.g:2857:1: rule__Role__Group_3__4 : rule__Role__Group_3__4__Impl ;
    public final void rule__Role__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2861:1: ( rule__Role__Group_3__4__Impl )
            // InternalSecurityDsl.g:2862:2: rule__Role__Group_3__4__Impl
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
    // InternalSecurityDsl.g:2868:1: rule__Role__Group_3__4__Impl : ( ']' ) ;
    public final void rule__Role__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2872:1: ( ( ']' ) )
            // InternalSecurityDsl.g:2873:1: ( ']' )
            {
            // InternalSecurityDsl.g:2873:1: ( ']' )
            // InternalSecurityDsl.g:2874:2: ']'
            {
             before(grammarAccess.getRoleAccess().getRightSquareBracketKeyword_3_4()); 
            match(input,59,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2884:1: rule__Role__Group_3_3__0 : rule__Role__Group_3_3__0__Impl rule__Role__Group_3_3__1 ;
    public final void rule__Role__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2888:1: ( rule__Role__Group_3_3__0__Impl rule__Role__Group_3_3__1 )
            // InternalSecurityDsl.g:2889:2: rule__Role__Group_3_3__0__Impl rule__Role__Group_3_3__1
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
    // InternalSecurityDsl.g:2896:1: rule__Role__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Role__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2900:1: ( ( ',' ) )
            // InternalSecurityDsl.g:2901:1: ( ',' )
            {
            // InternalSecurityDsl.g:2901:1: ( ',' )
            // InternalSecurityDsl.g:2902:2: ','
            {
             before(grammarAccess.getRoleAccess().getCommaKeyword_3_3_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2911:1: rule__Role__Group_3_3__1 : rule__Role__Group_3_3__1__Impl ;
    public final void rule__Role__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2915:1: ( rule__Role__Group_3_3__1__Impl )
            // InternalSecurityDsl.g:2916:2: rule__Role__Group_3_3__1__Impl
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
    // InternalSecurityDsl.g:2922:1: rule__Role__Group_3_3__1__Impl : ( ( rule__Role__Role_instancesAssignment_3_3_1 ) ) ;
    public final void rule__Role__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2926:1: ( ( ( rule__Role__Role_instancesAssignment_3_3_1 ) ) )
            // InternalSecurityDsl.g:2927:1: ( ( rule__Role__Role_instancesAssignment_3_3_1 ) )
            {
            // InternalSecurityDsl.g:2927:1: ( ( rule__Role__Role_instancesAssignment_3_3_1 ) )
            // InternalSecurityDsl.g:2928:2: ( rule__Role__Role_instancesAssignment_3_3_1 )
            {
             before(grammarAccess.getRoleAccess().getRole_instancesAssignment_3_3_1()); 
            // InternalSecurityDsl.g:2929:2: ( rule__Role__Role_instancesAssignment_3_3_1 )
            // InternalSecurityDsl.g:2929:3: rule__Role__Role_instancesAssignment_3_3_1
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
    // InternalSecurityDsl.g:2938:1: rule__User__Group__0 : rule__User__Group__0__Impl rule__User__Group__1 ;
    public final void rule__User__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2942:1: ( rule__User__Group__0__Impl rule__User__Group__1 )
            // InternalSecurityDsl.g:2943:2: rule__User__Group__0__Impl rule__User__Group__1
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
    // InternalSecurityDsl.g:2950:1: rule__User__Group__0__Impl : ( () ) ;
    public final void rule__User__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2954:1: ( ( () ) )
            // InternalSecurityDsl.g:2955:1: ( () )
            {
            // InternalSecurityDsl.g:2955:1: ( () )
            // InternalSecurityDsl.g:2956:2: ()
            {
             before(grammarAccess.getUserAccess().getUserAction_0()); 
            // InternalSecurityDsl.g:2957:2: ()
            // InternalSecurityDsl.g:2957:3: 
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
    // InternalSecurityDsl.g:2965:1: rule__User__Group__1 : rule__User__Group__1__Impl rule__User__Group__2 ;
    public final void rule__User__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2969:1: ( rule__User__Group__1__Impl rule__User__Group__2 )
            // InternalSecurityDsl.g:2970:2: rule__User__Group__1__Impl rule__User__Group__2
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
    // InternalSecurityDsl.g:2977:1: rule__User__Group__1__Impl : ( ( rule__User__Group_1__0 )? ) ;
    public final void rule__User__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2981:1: ( ( ( rule__User__Group_1__0 )? ) )
            // InternalSecurityDsl.g:2982:1: ( ( rule__User__Group_1__0 )? )
            {
            // InternalSecurityDsl.g:2982:1: ( ( rule__User__Group_1__0 )? )
            // InternalSecurityDsl.g:2983:2: ( rule__User__Group_1__0 )?
            {
             before(grammarAccess.getUserAccess().getGroup_1()); 
            // InternalSecurityDsl.g:2984:2: ( rule__User__Group_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==56) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSecurityDsl.g:2984:3: rule__User__Group_1__0
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
    // InternalSecurityDsl.g:2992:1: rule__User__Group__2 : rule__User__Group__2__Impl ;
    public final void rule__User__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2996:1: ( rule__User__Group__2__Impl )
            // InternalSecurityDsl.g:2997:2: rule__User__Group__2__Impl
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
    // InternalSecurityDsl.g:3003:1: rule__User__Group__2__Impl : ( ( rule__User__Group_2__0 )? ) ;
    public final void rule__User__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3007:1: ( ( ( rule__User__Group_2__0 )? ) )
            // InternalSecurityDsl.g:3008:1: ( ( rule__User__Group_2__0 )? )
            {
            // InternalSecurityDsl.g:3008:1: ( ( rule__User__Group_2__0 )? )
            // InternalSecurityDsl.g:3009:2: ( rule__User__Group_2__0 )?
            {
             before(grammarAccess.getUserAccess().getGroup_2()); 
            // InternalSecurityDsl.g:3010:2: ( rule__User__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==57) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSecurityDsl.g:3010:3: rule__User__Group_2__0
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
    // InternalSecurityDsl.g:3019:1: rule__User__Group_1__0 : rule__User__Group_1__0__Impl rule__User__Group_1__1 ;
    public final void rule__User__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3023:1: ( rule__User__Group_1__0__Impl rule__User__Group_1__1 )
            // InternalSecurityDsl.g:3024:2: rule__User__Group_1__0__Impl rule__User__Group_1__1
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
    // InternalSecurityDsl.g:3031:1: rule__User__Group_1__0__Impl : ( 'tableName:' ) ;
    public final void rule__User__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3035:1: ( ( 'tableName:' ) )
            // InternalSecurityDsl.g:3036:1: ( 'tableName:' )
            {
            // InternalSecurityDsl.g:3036:1: ( 'tableName:' )
            // InternalSecurityDsl.g:3037:2: 'tableName:'
            {
             before(grammarAccess.getUserAccess().getTableNameKeyword_1_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3046:1: rule__User__Group_1__1 : rule__User__Group_1__1__Impl ;
    public final void rule__User__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3050:1: ( rule__User__Group_1__1__Impl )
            // InternalSecurityDsl.g:3051:2: rule__User__Group_1__1__Impl
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
    // InternalSecurityDsl.g:3057:1: rule__User__Group_1__1__Impl : ( ( rule__User__TableNameAssignment_1_1 ) ) ;
    public final void rule__User__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3061:1: ( ( ( rule__User__TableNameAssignment_1_1 ) ) )
            // InternalSecurityDsl.g:3062:1: ( ( rule__User__TableNameAssignment_1_1 ) )
            {
            // InternalSecurityDsl.g:3062:1: ( ( rule__User__TableNameAssignment_1_1 ) )
            // InternalSecurityDsl.g:3063:2: ( rule__User__TableNameAssignment_1_1 )
            {
             before(grammarAccess.getUserAccess().getTableNameAssignment_1_1()); 
            // InternalSecurityDsl.g:3064:2: ( rule__User__TableNameAssignment_1_1 )
            // InternalSecurityDsl.g:3064:3: rule__User__TableNameAssignment_1_1
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
    // InternalSecurityDsl.g:3073:1: rule__User__Group_2__0 : rule__User__Group_2__0__Impl rule__User__Group_2__1 ;
    public final void rule__User__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3077:1: ( rule__User__Group_2__0__Impl rule__User__Group_2__1 )
            // InternalSecurityDsl.g:3078:2: rule__User__Group_2__0__Impl rule__User__Group_2__1
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
    // InternalSecurityDsl.g:3085:1: rule__User__Group_2__0__Impl : ( 'attributes:' ) ;
    public final void rule__User__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3089:1: ( ( 'attributes:' ) )
            // InternalSecurityDsl.g:3090:1: ( 'attributes:' )
            {
            // InternalSecurityDsl.g:3090:1: ( 'attributes:' )
            // InternalSecurityDsl.g:3091:2: 'attributes:'
            {
             before(grammarAccess.getUserAccess().getAttributesKeyword_2_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3100:1: rule__User__Group_2__1 : rule__User__Group_2__1__Impl rule__User__Group_2__2 ;
    public final void rule__User__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3104:1: ( rule__User__Group_2__1__Impl rule__User__Group_2__2 )
            // InternalSecurityDsl.g:3105:2: rule__User__Group_2__1__Impl rule__User__Group_2__2
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
    // InternalSecurityDsl.g:3112:1: rule__User__Group_2__1__Impl : ( '[' ) ;
    public final void rule__User__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3116:1: ( ( '[' ) )
            // InternalSecurityDsl.g:3117:1: ( '[' )
            {
            // InternalSecurityDsl.g:3117:1: ( '[' )
            // InternalSecurityDsl.g:3118:2: '['
            {
             before(grammarAccess.getUserAccess().getLeftSquareBracketKeyword_2_1()); 
            match(input,58,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3127:1: rule__User__Group_2__2 : rule__User__Group_2__2__Impl rule__User__Group_2__3 ;
    public final void rule__User__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3131:1: ( rule__User__Group_2__2__Impl rule__User__Group_2__3 )
            // InternalSecurityDsl.g:3132:2: rule__User__Group_2__2__Impl rule__User__Group_2__3
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
    // InternalSecurityDsl.g:3139:1: rule__User__Group_2__2__Impl : ( ( rule__User__Entity_attributesAssignment_2_2 ) ) ;
    public final void rule__User__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3143:1: ( ( ( rule__User__Entity_attributesAssignment_2_2 ) ) )
            // InternalSecurityDsl.g:3144:1: ( ( rule__User__Entity_attributesAssignment_2_2 ) )
            {
            // InternalSecurityDsl.g:3144:1: ( ( rule__User__Entity_attributesAssignment_2_2 ) )
            // InternalSecurityDsl.g:3145:2: ( rule__User__Entity_attributesAssignment_2_2 )
            {
             before(grammarAccess.getUserAccess().getEntity_attributesAssignment_2_2()); 
            // InternalSecurityDsl.g:3146:2: ( rule__User__Entity_attributesAssignment_2_2 )
            // InternalSecurityDsl.g:3146:3: rule__User__Entity_attributesAssignment_2_2
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
    // InternalSecurityDsl.g:3154:1: rule__User__Group_2__3 : rule__User__Group_2__3__Impl rule__User__Group_2__4 ;
    public final void rule__User__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3158:1: ( rule__User__Group_2__3__Impl rule__User__Group_2__4 )
            // InternalSecurityDsl.g:3159:2: rule__User__Group_2__3__Impl rule__User__Group_2__4
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
    // InternalSecurityDsl.g:3166:1: rule__User__Group_2__3__Impl : ( ( rule__User__Group_2_3__0 )* ) ;
    public final void rule__User__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3170:1: ( ( ( rule__User__Group_2_3__0 )* ) )
            // InternalSecurityDsl.g:3171:1: ( ( rule__User__Group_2_3__0 )* )
            {
            // InternalSecurityDsl.g:3171:1: ( ( rule__User__Group_2_3__0 )* )
            // InternalSecurityDsl.g:3172:2: ( rule__User__Group_2_3__0 )*
            {
             before(grammarAccess.getUserAccess().getGroup_2_3()); 
            // InternalSecurityDsl.g:3173:2: ( rule__User__Group_2_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==60) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalSecurityDsl.g:3173:3: rule__User__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_27);
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
    // InternalSecurityDsl.g:3181:1: rule__User__Group_2__4 : rule__User__Group_2__4__Impl ;
    public final void rule__User__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3185:1: ( rule__User__Group_2__4__Impl )
            // InternalSecurityDsl.g:3186:2: rule__User__Group_2__4__Impl
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
    // InternalSecurityDsl.g:3192:1: rule__User__Group_2__4__Impl : ( ']' ) ;
    public final void rule__User__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3196:1: ( ( ']' ) )
            // InternalSecurityDsl.g:3197:1: ( ']' )
            {
            // InternalSecurityDsl.g:3197:1: ( ']' )
            // InternalSecurityDsl.g:3198:2: ']'
            {
             before(grammarAccess.getUserAccess().getRightSquareBracketKeyword_2_4()); 
            match(input,59,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3208:1: rule__User__Group_2_3__0 : rule__User__Group_2_3__0__Impl rule__User__Group_2_3__1 ;
    public final void rule__User__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3212:1: ( rule__User__Group_2_3__0__Impl rule__User__Group_2_3__1 )
            // InternalSecurityDsl.g:3213:2: rule__User__Group_2_3__0__Impl rule__User__Group_2_3__1
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
    // InternalSecurityDsl.g:3220:1: rule__User__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__User__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3224:1: ( ( ',' ) )
            // InternalSecurityDsl.g:3225:1: ( ',' )
            {
            // InternalSecurityDsl.g:3225:1: ( ',' )
            // InternalSecurityDsl.g:3226:2: ','
            {
             before(grammarAccess.getUserAccess().getCommaKeyword_2_3_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3235:1: rule__User__Group_2_3__1 : rule__User__Group_2_3__1__Impl ;
    public final void rule__User__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3239:1: ( rule__User__Group_2_3__1__Impl )
            // InternalSecurityDsl.g:3240:2: rule__User__Group_2_3__1__Impl
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
    // InternalSecurityDsl.g:3246:1: rule__User__Group_2_3__1__Impl : ( ( rule__User__Entity_attributesAssignment_2_3_1 ) ) ;
    public final void rule__User__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3250:1: ( ( ( rule__User__Entity_attributesAssignment_2_3_1 ) ) )
            // InternalSecurityDsl.g:3251:1: ( ( rule__User__Entity_attributesAssignment_2_3_1 ) )
            {
            // InternalSecurityDsl.g:3251:1: ( ( rule__User__Entity_attributesAssignment_2_3_1 ) )
            // InternalSecurityDsl.g:3252:2: ( rule__User__Entity_attributesAssignment_2_3_1 )
            {
             before(grammarAccess.getUserAccess().getEntity_attributesAssignment_2_3_1()); 
            // InternalSecurityDsl.g:3253:2: ( rule__User__Entity_attributesAssignment_2_3_1 )
            // InternalSecurityDsl.g:3253:3: rule__User__Entity_attributesAssignment_2_3_1
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
    // InternalSecurityDsl.g:3262:1: rule__RoleInstance__Group__0 : rule__RoleInstance__Group__0__Impl rule__RoleInstance__Group__1 ;
    public final void rule__RoleInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3266:1: ( rule__RoleInstance__Group__0__Impl rule__RoleInstance__Group__1 )
            // InternalSecurityDsl.g:3267:2: rule__RoleInstance__Group__0__Impl rule__RoleInstance__Group__1
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
    // InternalSecurityDsl.g:3274:1: rule__RoleInstance__Group__0__Impl : ( () ) ;
    public final void rule__RoleInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3278:1: ( ( () ) )
            // InternalSecurityDsl.g:3279:1: ( () )
            {
            // InternalSecurityDsl.g:3279:1: ( () )
            // InternalSecurityDsl.g:3280:2: ()
            {
             before(grammarAccess.getRoleInstanceAccess().getRoleInstanceAction_0()); 
            // InternalSecurityDsl.g:3281:2: ()
            // InternalSecurityDsl.g:3281:3: 
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
    // InternalSecurityDsl.g:3289:1: rule__RoleInstance__Group__1 : rule__RoleInstance__Group__1__Impl rule__RoleInstance__Group__2 ;
    public final void rule__RoleInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3293:1: ( rule__RoleInstance__Group__1__Impl rule__RoleInstance__Group__2 )
            // InternalSecurityDsl.g:3294:2: rule__RoleInstance__Group__1__Impl rule__RoleInstance__Group__2
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
    // InternalSecurityDsl.g:3301:1: rule__RoleInstance__Group__1__Impl : ( ( rule__RoleInstance__ClientAssignment_1 )? ) ;
    public final void rule__RoleInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3305:1: ( ( ( rule__RoleInstance__ClientAssignment_1 )? ) )
            // InternalSecurityDsl.g:3306:1: ( ( rule__RoleInstance__ClientAssignment_1 )? )
            {
            // InternalSecurityDsl.g:3306:1: ( ( rule__RoleInstance__ClientAssignment_1 )? )
            // InternalSecurityDsl.g:3307:2: ( rule__RoleInstance__ClientAssignment_1 )?
            {
             before(grammarAccess.getRoleInstanceAccess().getClientAssignment_1()); 
            // InternalSecurityDsl.g:3308:2: ( rule__RoleInstance__ClientAssignment_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==81) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSecurityDsl.g:3308:3: rule__RoleInstance__ClientAssignment_1
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
    // InternalSecurityDsl.g:3316:1: rule__RoleInstance__Group__2 : rule__RoleInstance__Group__2__Impl ;
    public final void rule__RoleInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3320:1: ( rule__RoleInstance__Group__2__Impl )
            // InternalSecurityDsl.g:3321:2: rule__RoleInstance__Group__2__Impl
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
    // InternalSecurityDsl.g:3327:1: rule__RoleInstance__Group__2__Impl : ( ( rule__RoleInstance__NameAssignment_2 ) ) ;
    public final void rule__RoleInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3331:1: ( ( ( rule__RoleInstance__NameAssignment_2 ) ) )
            // InternalSecurityDsl.g:3332:1: ( ( rule__RoleInstance__NameAssignment_2 ) )
            {
            // InternalSecurityDsl.g:3332:1: ( ( rule__RoleInstance__NameAssignment_2 ) )
            // InternalSecurityDsl.g:3333:2: ( rule__RoleInstance__NameAssignment_2 )
            {
             before(grammarAccess.getRoleInstanceAccess().getNameAssignment_2()); 
            // InternalSecurityDsl.g:3334:2: ( rule__RoleInstance__NameAssignment_2 )
            // InternalSecurityDsl.g:3334:3: rule__RoleInstance__NameAssignment_2
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
    // InternalSecurityDsl.g:3343:1: rule__Endpoint__Group__0 : rule__Endpoint__Group__0__Impl rule__Endpoint__Group__1 ;
    public final void rule__Endpoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3347:1: ( rule__Endpoint__Group__0__Impl rule__Endpoint__Group__1 )
            // InternalSecurityDsl.g:3348:2: rule__Endpoint__Group__0__Impl rule__Endpoint__Group__1
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
    // InternalSecurityDsl.g:3355:1: rule__Endpoint__Group__0__Impl : ( '{' ) ;
    public final void rule__Endpoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3359:1: ( ( '{' ) )
            // InternalSecurityDsl.g:3360:1: ( '{' )
            {
            // InternalSecurityDsl.g:3360:1: ( '{' )
            // InternalSecurityDsl.g:3361:2: '{'
            {
             before(grammarAccess.getEndpointAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3370:1: rule__Endpoint__Group__1 : rule__Endpoint__Group__1__Impl rule__Endpoint__Group__2 ;
    public final void rule__Endpoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3374:1: ( rule__Endpoint__Group__1__Impl rule__Endpoint__Group__2 )
            // InternalSecurityDsl.g:3375:2: rule__Endpoint__Group__1__Impl rule__Endpoint__Group__2
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
    // InternalSecurityDsl.g:3382:1: rule__Endpoint__Group__1__Impl : ( 'type:' ) ;
    public final void rule__Endpoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3386:1: ( ( 'type:' ) )
            // InternalSecurityDsl.g:3387:1: ( 'type:' )
            {
            // InternalSecurityDsl.g:3387:1: ( 'type:' )
            // InternalSecurityDsl.g:3388:2: 'type:'
            {
             before(grammarAccess.getEndpointAccess().getTypeKeyword_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3397:1: rule__Endpoint__Group__2 : rule__Endpoint__Group__2__Impl rule__Endpoint__Group__3 ;
    public final void rule__Endpoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3401:1: ( rule__Endpoint__Group__2__Impl rule__Endpoint__Group__3 )
            // InternalSecurityDsl.g:3402:2: rule__Endpoint__Group__2__Impl rule__Endpoint__Group__3
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
    // InternalSecurityDsl.g:3409:1: rule__Endpoint__Group__2__Impl : ( ( rule__Endpoint__TypeAssignment_2 ) ) ;
    public final void rule__Endpoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3413:1: ( ( ( rule__Endpoint__TypeAssignment_2 ) ) )
            // InternalSecurityDsl.g:3414:1: ( ( rule__Endpoint__TypeAssignment_2 ) )
            {
            // InternalSecurityDsl.g:3414:1: ( ( rule__Endpoint__TypeAssignment_2 ) )
            // InternalSecurityDsl.g:3415:2: ( rule__Endpoint__TypeAssignment_2 )
            {
             before(grammarAccess.getEndpointAccess().getTypeAssignment_2()); 
            // InternalSecurityDsl.g:3416:2: ( rule__Endpoint__TypeAssignment_2 )
            // InternalSecurityDsl.g:3416:3: rule__Endpoint__TypeAssignment_2
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
    // InternalSecurityDsl.g:3424:1: rule__Endpoint__Group__3 : rule__Endpoint__Group__3__Impl rule__Endpoint__Group__4 ;
    public final void rule__Endpoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3428:1: ( rule__Endpoint__Group__3__Impl rule__Endpoint__Group__4 )
            // InternalSecurityDsl.g:3429:2: rule__Endpoint__Group__3__Impl rule__Endpoint__Group__4
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
    // InternalSecurityDsl.g:3436:1: rule__Endpoint__Group__3__Impl : ( 'url:' ) ;
    public final void rule__Endpoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3440:1: ( ( 'url:' ) )
            // InternalSecurityDsl.g:3441:1: ( 'url:' )
            {
            // InternalSecurityDsl.g:3441:1: ( 'url:' )
            // InternalSecurityDsl.g:3442:2: 'url:'
            {
             before(grammarAccess.getEndpointAccess().getUrlKeyword_3()); 
            match(input,48,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3451:1: rule__Endpoint__Group__4 : rule__Endpoint__Group__4__Impl rule__Endpoint__Group__5 ;
    public final void rule__Endpoint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3455:1: ( rule__Endpoint__Group__4__Impl rule__Endpoint__Group__5 )
            // InternalSecurityDsl.g:3456:2: rule__Endpoint__Group__4__Impl rule__Endpoint__Group__5
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
    // InternalSecurityDsl.g:3463:1: rule__Endpoint__Group__4__Impl : ( ( rule__Endpoint__UrlAssignment_4 ) ) ;
    public final void rule__Endpoint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3467:1: ( ( ( rule__Endpoint__UrlAssignment_4 ) ) )
            // InternalSecurityDsl.g:3468:1: ( ( rule__Endpoint__UrlAssignment_4 ) )
            {
            // InternalSecurityDsl.g:3468:1: ( ( rule__Endpoint__UrlAssignment_4 ) )
            // InternalSecurityDsl.g:3469:2: ( rule__Endpoint__UrlAssignment_4 )
            {
             before(grammarAccess.getEndpointAccess().getUrlAssignment_4()); 
            // InternalSecurityDsl.g:3470:2: ( rule__Endpoint__UrlAssignment_4 )
            // InternalSecurityDsl.g:3470:3: rule__Endpoint__UrlAssignment_4
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
    // InternalSecurityDsl.g:3478:1: rule__Endpoint__Group__5 : rule__Endpoint__Group__5__Impl rule__Endpoint__Group__6 ;
    public final void rule__Endpoint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3482:1: ( rule__Endpoint__Group__5__Impl rule__Endpoint__Group__6 )
            // InternalSecurityDsl.g:3483:2: rule__Endpoint__Group__5__Impl rule__Endpoint__Group__6
            {
            pushFollow(FOLLOW_5);
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
    // InternalSecurityDsl.g:3490:1: rule__Endpoint__Group__5__Impl : ( 'methodName:' ) ;
    public final void rule__Endpoint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3494:1: ( ( 'methodName:' ) )
            // InternalSecurityDsl.g:3495:1: ( 'methodName:' )
            {
            // InternalSecurityDsl.g:3495:1: ( 'methodName:' )
            // InternalSecurityDsl.g:3496:2: 'methodName:'
            {
             before(grammarAccess.getEndpointAccess().getMethodNameKeyword_5()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getMethodNameKeyword_5()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3505:1: rule__Endpoint__Group__6 : rule__Endpoint__Group__6__Impl rule__Endpoint__Group__7 ;
    public final void rule__Endpoint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3509:1: ( rule__Endpoint__Group__6__Impl rule__Endpoint__Group__7 )
            // InternalSecurityDsl.g:3510:2: rule__Endpoint__Group__6__Impl rule__Endpoint__Group__7
            {
            pushFollow(FOLLOW_31);
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
    // InternalSecurityDsl.g:3517:1: rule__Endpoint__Group__6__Impl : ( ( rule__Endpoint__MethodNameAssignment_6 ) ) ;
    public final void rule__Endpoint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3521:1: ( ( ( rule__Endpoint__MethodNameAssignment_6 ) ) )
            // InternalSecurityDsl.g:3522:1: ( ( rule__Endpoint__MethodNameAssignment_6 ) )
            {
            // InternalSecurityDsl.g:3522:1: ( ( rule__Endpoint__MethodNameAssignment_6 ) )
            // InternalSecurityDsl.g:3523:2: ( rule__Endpoint__MethodNameAssignment_6 )
            {
             before(grammarAccess.getEndpointAccess().getMethodNameAssignment_6()); 
            // InternalSecurityDsl.g:3524:2: ( rule__Endpoint__MethodNameAssignment_6 )
            // InternalSecurityDsl.g:3524:3: rule__Endpoint__MethodNameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__MethodNameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getEndpointAccess().getMethodNameAssignment_6()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3532:1: rule__Endpoint__Group__7 : rule__Endpoint__Group__7__Impl rule__Endpoint__Group__8 ;
    public final void rule__Endpoint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3536:1: ( rule__Endpoint__Group__7__Impl rule__Endpoint__Group__8 )
            // InternalSecurityDsl.g:3537:2: rule__Endpoint__Group__7__Impl rule__Endpoint__Group__8
            {
            pushFollow(FOLLOW_31);
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
    // InternalSecurityDsl.g:3544:1: rule__Endpoint__Group__7__Impl : ( ( rule__Endpoint__Group_7__0 )? ) ;
    public final void rule__Endpoint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3548:1: ( ( ( rule__Endpoint__Group_7__0 )? ) )
            // InternalSecurityDsl.g:3549:1: ( ( rule__Endpoint__Group_7__0 )? )
            {
            // InternalSecurityDsl.g:3549:1: ( ( rule__Endpoint__Group_7__0 )? )
            // InternalSecurityDsl.g:3550:2: ( rule__Endpoint__Group_7__0 )?
            {
             before(grammarAccess.getEndpointAccess().getGroup_7()); 
            // InternalSecurityDsl.g:3551:2: ( rule__Endpoint__Group_7__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==63) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSecurityDsl.g:3551:3: rule__Endpoint__Group_7__0
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
    // InternalSecurityDsl.g:3559:1: rule__Endpoint__Group__8 : rule__Endpoint__Group__8__Impl rule__Endpoint__Group__9 ;
    public final void rule__Endpoint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3563:1: ( rule__Endpoint__Group__8__Impl rule__Endpoint__Group__9 )
            // InternalSecurityDsl.g:3564:2: rule__Endpoint__Group__8__Impl rule__Endpoint__Group__9
            {
            pushFollow(FOLLOW_31);
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
    // InternalSecurityDsl.g:3571:1: rule__Endpoint__Group__8__Impl : ( ( rule__Endpoint__Group_8__0 )? ) ;
    public final void rule__Endpoint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3575:1: ( ( ( rule__Endpoint__Group_8__0 )? ) )
            // InternalSecurityDsl.g:3576:1: ( ( rule__Endpoint__Group_8__0 )? )
            {
            // InternalSecurityDsl.g:3576:1: ( ( rule__Endpoint__Group_8__0 )? )
            // InternalSecurityDsl.g:3577:2: ( rule__Endpoint__Group_8__0 )?
            {
             before(grammarAccess.getEndpointAccess().getGroup_8()); 
            // InternalSecurityDsl.g:3578:2: ( rule__Endpoint__Group_8__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==64) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSecurityDsl.g:3578:3: rule__Endpoint__Group_8__0
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
    // InternalSecurityDsl.g:3586:1: rule__Endpoint__Group__9 : rule__Endpoint__Group__9__Impl ;
    public final void rule__Endpoint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3590:1: ( rule__Endpoint__Group__9__Impl )
            // InternalSecurityDsl.g:3591:2: rule__Endpoint__Group__9__Impl
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
    // InternalSecurityDsl.g:3597:1: rule__Endpoint__Group__9__Impl : ( '}' ) ;
    public final void rule__Endpoint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3601:1: ( ( '}' ) )
            // InternalSecurityDsl.g:3602:1: ( '}' )
            {
            // InternalSecurityDsl.g:3602:1: ( '}' )
            // InternalSecurityDsl.g:3603:2: '}'
            {
             before(grammarAccess.getEndpointAccess().getRightCurlyBracketKeyword_9()); 
            match(input,54,FOLLOW_2); 
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


    // $ANTLR start "rule__Endpoint__Group_7__0"
    // InternalSecurityDsl.g:3613:1: rule__Endpoint__Group_7__0 : rule__Endpoint__Group_7__0__Impl rule__Endpoint__Group_7__1 ;
    public final void rule__Endpoint__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3617:1: ( rule__Endpoint__Group_7__0__Impl rule__Endpoint__Group_7__1 )
            // InternalSecurityDsl.g:3618:2: rule__Endpoint__Group_7__0__Impl rule__Endpoint__Group_7__1
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
    // InternalSecurityDsl.g:3625:1: rule__Endpoint__Group_7__0__Impl : ( 'method:' ) ;
    public final void rule__Endpoint__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3629:1: ( ( 'method:' ) )
            // InternalSecurityDsl.g:3630:1: ( 'method:' )
            {
            // InternalSecurityDsl.g:3630:1: ( 'method:' )
            // InternalSecurityDsl.g:3631:2: 'method:'
            {
             before(grammarAccess.getEndpointAccess().getMethodKeyword_7_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getMethodKeyword_7_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3640:1: rule__Endpoint__Group_7__1 : rule__Endpoint__Group_7__1__Impl ;
    public final void rule__Endpoint__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3644:1: ( rule__Endpoint__Group_7__1__Impl )
            // InternalSecurityDsl.g:3645:2: rule__Endpoint__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__Group_7__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalSecurityDsl.g:3651:1: rule__Endpoint__Group_7__1__Impl : ( ( rule__Endpoint__MethodAssignment_7_1 ) ) ;
    public final void rule__Endpoint__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3655:1: ( ( ( rule__Endpoint__MethodAssignment_7_1 ) ) )
            // InternalSecurityDsl.g:3656:1: ( ( rule__Endpoint__MethodAssignment_7_1 ) )
            {
            // InternalSecurityDsl.g:3656:1: ( ( rule__Endpoint__MethodAssignment_7_1 ) )
            // InternalSecurityDsl.g:3657:2: ( rule__Endpoint__MethodAssignment_7_1 )
            {
             before(grammarAccess.getEndpointAccess().getMethodAssignment_7_1()); 
            // InternalSecurityDsl.g:3658:2: ( rule__Endpoint__MethodAssignment_7_1 )
            // InternalSecurityDsl.g:3658:3: rule__Endpoint__MethodAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__MethodAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getEndpointAccess().getMethodAssignment_7_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Endpoint__Group_8__0"
    // InternalSecurityDsl.g:3667:1: rule__Endpoint__Group_8__0 : rule__Endpoint__Group_8__0__Impl rule__Endpoint__Group_8__1 ;
    public final void rule__Endpoint__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3671:1: ( rule__Endpoint__Group_8__0__Impl rule__Endpoint__Group_8__1 )
            // InternalSecurityDsl.g:3672:2: rule__Endpoint__Group_8__0__Impl rule__Endpoint__Group_8__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalSecurityDsl.g:3679:1: rule__Endpoint__Group_8__0__Impl : ( 'roleAuthorities:' ) ;
    public final void rule__Endpoint__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3683:1: ( ( 'roleAuthorities:' ) )
            // InternalSecurityDsl.g:3684:1: ( 'roleAuthorities:' )
            {
            // InternalSecurityDsl.g:3684:1: ( 'roleAuthorities:' )
            // InternalSecurityDsl.g:3685:2: 'roleAuthorities:'
            {
             before(grammarAccess.getEndpointAccess().getRoleAuthoritiesKeyword_8_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getRoleAuthoritiesKeyword_8_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3694:1: rule__Endpoint__Group_8__1 : rule__Endpoint__Group_8__1__Impl rule__Endpoint__Group_8__2 ;
    public final void rule__Endpoint__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3698:1: ( rule__Endpoint__Group_8__1__Impl rule__Endpoint__Group_8__2 )
            // InternalSecurityDsl.g:3699:2: rule__Endpoint__Group_8__1__Impl rule__Endpoint__Group_8__2
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
    // InternalSecurityDsl.g:3706:1: rule__Endpoint__Group_8__1__Impl : ( '[' ) ;
    public final void rule__Endpoint__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3710:1: ( ( '[' ) )
            // InternalSecurityDsl.g:3711:1: ( '[' )
            {
            // InternalSecurityDsl.g:3711:1: ( '[' )
            // InternalSecurityDsl.g:3712:2: '['
            {
             before(grammarAccess.getEndpointAccess().getLeftSquareBracketKeyword_8_1()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getLeftSquareBracketKeyword_8_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3721:1: rule__Endpoint__Group_8__2 : rule__Endpoint__Group_8__2__Impl rule__Endpoint__Group_8__3 ;
    public final void rule__Endpoint__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3725:1: ( rule__Endpoint__Group_8__2__Impl rule__Endpoint__Group_8__3 )
            // InternalSecurityDsl.g:3726:2: rule__Endpoint__Group_8__2__Impl rule__Endpoint__Group_8__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalSecurityDsl.g:3733:1: rule__Endpoint__Group_8__2__Impl : ( ( rule__Endpoint__Role_authoritiesAssignment_8_2 ) ) ;
    public final void rule__Endpoint__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3737:1: ( ( ( rule__Endpoint__Role_authoritiesAssignment_8_2 ) ) )
            // InternalSecurityDsl.g:3738:1: ( ( rule__Endpoint__Role_authoritiesAssignment_8_2 ) )
            {
            // InternalSecurityDsl.g:3738:1: ( ( rule__Endpoint__Role_authoritiesAssignment_8_2 ) )
            // InternalSecurityDsl.g:3739:2: ( rule__Endpoint__Role_authoritiesAssignment_8_2 )
            {
             before(grammarAccess.getEndpointAccess().getRole_authoritiesAssignment_8_2()); 
            // InternalSecurityDsl.g:3740:2: ( rule__Endpoint__Role_authoritiesAssignment_8_2 )
            // InternalSecurityDsl.g:3740:3: rule__Endpoint__Role_authoritiesAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__Role_authoritiesAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getEndpointAccess().getRole_authoritiesAssignment_8_2()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3748:1: rule__Endpoint__Group_8__3 : rule__Endpoint__Group_8__3__Impl rule__Endpoint__Group_8__4 ;
    public final void rule__Endpoint__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3752:1: ( rule__Endpoint__Group_8__3__Impl rule__Endpoint__Group_8__4 )
            // InternalSecurityDsl.g:3753:2: rule__Endpoint__Group_8__3__Impl rule__Endpoint__Group_8__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalSecurityDsl.g:3760:1: rule__Endpoint__Group_8__3__Impl : ( ( rule__Endpoint__Group_8_3__0 )* ) ;
    public final void rule__Endpoint__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3764:1: ( ( ( rule__Endpoint__Group_8_3__0 )* ) )
            // InternalSecurityDsl.g:3765:1: ( ( rule__Endpoint__Group_8_3__0 )* )
            {
            // InternalSecurityDsl.g:3765:1: ( ( rule__Endpoint__Group_8_3__0 )* )
            // InternalSecurityDsl.g:3766:2: ( rule__Endpoint__Group_8_3__0 )*
            {
             before(grammarAccess.getEndpointAccess().getGroup_8_3()); 
            // InternalSecurityDsl.g:3767:2: ( rule__Endpoint__Group_8_3__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==60) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalSecurityDsl.g:3767:3: rule__Endpoint__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Endpoint__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalSecurityDsl.g:3775:1: rule__Endpoint__Group_8__4 : rule__Endpoint__Group_8__4__Impl ;
    public final void rule__Endpoint__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3779:1: ( rule__Endpoint__Group_8__4__Impl )
            // InternalSecurityDsl.g:3780:2: rule__Endpoint__Group_8__4__Impl
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
    // InternalSecurityDsl.g:3786:1: rule__Endpoint__Group_8__4__Impl : ( ']' ) ;
    public final void rule__Endpoint__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3790:1: ( ( ']' ) )
            // InternalSecurityDsl.g:3791:1: ( ']' )
            {
            // InternalSecurityDsl.g:3791:1: ( ']' )
            // InternalSecurityDsl.g:3792:2: ']'
            {
             before(grammarAccess.getEndpointAccess().getRightSquareBracketKeyword_8_4()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getRightSquareBracketKeyword_8_4()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3802:1: rule__Endpoint__Group_8_3__0 : rule__Endpoint__Group_8_3__0__Impl rule__Endpoint__Group_8_3__1 ;
    public final void rule__Endpoint__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3806:1: ( rule__Endpoint__Group_8_3__0__Impl rule__Endpoint__Group_8_3__1 )
            // InternalSecurityDsl.g:3807:2: rule__Endpoint__Group_8_3__0__Impl rule__Endpoint__Group_8_3__1
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
    // InternalSecurityDsl.g:3814:1: rule__Endpoint__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__Endpoint__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3818:1: ( ( ',' ) )
            // InternalSecurityDsl.g:3819:1: ( ',' )
            {
            // InternalSecurityDsl.g:3819:1: ( ',' )
            // InternalSecurityDsl.g:3820:2: ','
            {
             before(grammarAccess.getEndpointAccess().getCommaKeyword_8_3_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3829:1: rule__Endpoint__Group_8_3__1 : rule__Endpoint__Group_8_3__1__Impl ;
    public final void rule__Endpoint__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3833:1: ( rule__Endpoint__Group_8_3__1__Impl )
            // InternalSecurityDsl.g:3834:2: rule__Endpoint__Group_8_3__1__Impl
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
    // InternalSecurityDsl.g:3840:1: rule__Endpoint__Group_8_3__1__Impl : ( ( rule__Endpoint__Role_authoritiesAssignment_8_3_1 ) ) ;
    public final void rule__Endpoint__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3844:1: ( ( ( rule__Endpoint__Role_authoritiesAssignment_8_3_1 ) ) )
            // InternalSecurityDsl.g:3845:1: ( ( rule__Endpoint__Role_authoritiesAssignment_8_3_1 ) )
            {
            // InternalSecurityDsl.g:3845:1: ( ( rule__Endpoint__Role_authoritiesAssignment_8_3_1 ) )
            // InternalSecurityDsl.g:3846:2: ( rule__Endpoint__Role_authoritiesAssignment_8_3_1 )
            {
             before(grammarAccess.getEndpointAccess().getRole_authoritiesAssignment_8_3_1()); 
            // InternalSecurityDsl.g:3847:2: ( rule__Endpoint__Role_authoritiesAssignment_8_3_1 )
            // InternalSecurityDsl.g:3847:3: rule__Endpoint__Role_authoritiesAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__Role_authoritiesAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEndpointAccess().getRole_authoritiesAssignment_8_3_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3856:1: rule__Authentication__Group__0 : rule__Authentication__Group__0__Impl rule__Authentication__Group__1 ;
    public final void rule__Authentication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3860:1: ( rule__Authentication__Group__0__Impl rule__Authentication__Group__1 )
            // InternalSecurityDsl.g:3861:2: rule__Authentication__Group__0__Impl rule__Authentication__Group__1
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
    // InternalSecurityDsl.g:3868:1: rule__Authentication__Group__0__Impl : ( () ) ;
    public final void rule__Authentication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3872:1: ( ( () ) )
            // InternalSecurityDsl.g:3873:1: ( () )
            {
            // InternalSecurityDsl.g:3873:1: ( () )
            // InternalSecurityDsl.g:3874:2: ()
            {
             before(grammarAccess.getAuthenticationAccess().getAuthenticationAction_0()); 
            // InternalSecurityDsl.g:3875:2: ()
            // InternalSecurityDsl.g:3875:3: 
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
    // InternalSecurityDsl.g:3883:1: rule__Authentication__Group__1 : rule__Authentication__Group__1__Impl rule__Authentication__Group__2 ;
    public final void rule__Authentication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3887:1: ( rule__Authentication__Group__1__Impl rule__Authentication__Group__2 )
            // InternalSecurityDsl.g:3888:2: rule__Authentication__Group__1__Impl rule__Authentication__Group__2
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
    // InternalSecurityDsl.g:3895:1: rule__Authentication__Group__1__Impl : ( 'name:' ) ;
    public final void rule__Authentication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3899:1: ( ( 'name:' ) )
            // InternalSecurityDsl.g:3900:1: ( 'name:' )
            {
            // InternalSecurityDsl.g:3900:1: ( 'name:' )
            // InternalSecurityDsl.g:3901:2: 'name:'
            {
             before(grammarAccess.getAuthenticationAccess().getNameKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3910:1: rule__Authentication__Group__2 : rule__Authentication__Group__2__Impl rule__Authentication__Group__3 ;
    public final void rule__Authentication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3914:1: ( rule__Authentication__Group__2__Impl rule__Authentication__Group__3 )
            // InternalSecurityDsl.g:3915:2: rule__Authentication__Group__2__Impl rule__Authentication__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalSecurityDsl.g:3922:1: rule__Authentication__Group__2__Impl : ( ( rule__Authentication__NameAssignment_2 ) ) ;
    public final void rule__Authentication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3926:1: ( ( ( rule__Authentication__NameAssignment_2 ) ) )
            // InternalSecurityDsl.g:3927:1: ( ( rule__Authentication__NameAssignment_2 ) )
            {
            // InternalSecurityDsl.g:3927:1: ( ( rule__Authentication__NameAssignment_2 ) )
            // InternalSecurityDsl.g:3928:2: ( rule__Authentication__NameAssignment_2 )
            {
             before(grammarAccess.getAuthenticationAccess().getNameAssignment_2()); 
            // InternalSecurityDsl.g:3929:2: ( rule__Authentication__NameAssignment_2 )
            // InternalSecurityDsl.g:3929:3: rule__Authentication__NameAssignment_2
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
    // InternalSecurityDsl.g:3937:1: rule__Authentication__Group__3 : rule__Authentication__Group__3__Impl rule__Authentication__Group__4 ;
    public final void rule__Authentication__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3941:1: ( rule__Authentication__Group__3__Impl rule__Authentication__Group__4 )
            // InternalSecurityDsl.g:3942:2: rule__Authentication__Group__3__Impl rule__Authentication__Group__4
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
    // InternalSecurityDsl.g:3949:1: rule__Authentication__Group__3__Impl : ( 'path:' ) ;
    public final void rule__Authentication__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3953:1: ( ( 'path:' ) )
            // InternalSecurityDsl.g:3954:1: ( 'path:' )
            {
            // InternalSecurityDsl.g:3954:1: ( 'path:' )
            // InternalSecurityDsl.g:3955:2: 'path:'
            {
             before(grammarAccess.getAuthenticationAccess().getPathKeyword_3()); 
            match(input,65,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3964:1: rule__Authentication__Group__4 : rule__Authentication__Group__4__Impl rule__Authentication__Group__5 ;
    public final void rule__Authentication__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3968:1: ( rule__Authentication__Group__4__Impl rule__Authentication__Group__5 )
            // InternalSecurityDsl.g:3969:2: rule__Authentication__Group__4__Impl rule__Authentication__Group__5
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
    // InternalSecurityDsl.g:3976:1: rule__Authentication__Group__4__Impl : ( ( rule__Authentication__PathAssignment_4 ) ) ;
    public final void rule__Authentication__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3980:1: ( ( ( rule__Authentication__PathAssignment_4 ) ) )
            // InternalSecurityDsl.g:3981:1: ( ( rule__Authentication__PathAssignment_4 ) )
            {
            // InternalSecurityDsl.g:3981:1: ( ( rule__Authentication__PathAssignment_4 ) )
            // InternalSecurityDsl.g:3982:2: ( rule__Authentication__PathAssignment_4 )
            {
             before(grammarAccess.getAuthenticationAccess().getPathAssignment_4()); 
            // InternalSecurityDsl.g:3983:2: ( rule__Authentication__PathAssignment_4 )
            // InternalSecurityDsl.g:3983:3: rule__Authentication__PathAssignment_4
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
    // InternalSecurityDsl.g:3991:1: rule__Authentication__Group__5 : rule__Authentication__Group__5__Impl ;
    public final void rule__Authentication__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3995:1: ( rule__Authentication__Group__5__Impl )
            // InternalSecurityDsl.g:3996:2: rule__Authentication__Group__5__Impl
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
    // InternalSecurityDsl.g:4002:1: rule__Authentication__Group__5__Impl : ( ( rule__Authentication__Group_5__0 )? ) ;
    public final void rule__Authentication__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4006:1: ( ( ( rule__Authentication__Group_5__0 )? ) )
            // InternalSecurityDsl.g:4007:1: ( ( rule__Authentication__Group_5__0 )? )
            {
            // InternalSecurityDsl.g:4007:1: ( ( rule__Authentication__Group_5__0 )? )
            // InternalSecurityDsl.g:4008:2: ( rule__Authentication__Group_5__0 )?
            {
             before(grammarAccess.getAuthenticationAccess().getGroup_5()); 
            // InternalSecurityDsl.g:4009:2: ( rule__Authentication__Group_5__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==66) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSecurityDsl.g:4009:3: rule__Authentication__Group_5__0
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
    // InternalSecurityDsl.g:4018:1: rule__Authentication__Group_5__0 : rule__Authentication__Group_5__0__Impl rule__Authentication__Group_5__1 ;
    public final void rule__Authentication__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4022:1: ( rule__Authentication__Group_5__0__Impl rule__Authentication__Group_5__1 )
            // InternalSecurityDsl.g:4023:2: rule__Authentication__Group_5__0__Impl rule__Authentication__Group_5__1
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
    // InternalSecurityDsl.g:4030:1: rule__Authentication__Group_5__0__Impl : ( 'endpoints:' ) ;
    public final void rule__Authentication__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4034:1: ( ( 'endpoints:' ) )
            // InternalSecurityDsl.g:4035:1: ( 'endpoints:' )
            {
            // InternalSecurityDsl.g:4035:1: ( 'endpoints:' )
            // InternalSecurityDsl.g:4036:2: 'endpoints:'
            {
             before(grammarAccess.getAuthenticationAccess().getEndpointsKeyword_5_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4045:1: rule__Authentication__Group_5__1 : rule__Authentication__Group_5__1__Impl rule__Authentication__Group_5__2 ;
    public final void rule__Authentication__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4049:1: ( rule__Authentication__Group_5__1__Impl rule__Authentication__Group_5__2 )
            // InternalSecurityDsl.g:4050:2: rule__Authentication__Group_5__1__Impl rule__Authentication__Group_5__2
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
    // InternalSecurityDsl.g:4057:1: rule__Authentication__Group_5__1__Impl : ( '[' ) ;
    public final void rule__Authentication__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4061:1: ( ( '[' ) )
            // InternalSecurityDsl.g:4062:1: ( '[' )
            {
            // InternalSecurityDsl.g:4062:1: ( '[' )
            // InternalSecurityDsl.g:4063:2: '['
            {
             before(grammarAccess.getAuthenticationAccess().getLeftSquareBracketKeyword_5_1()); 
            match(input,58,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4072:1: rule__Authentication__Group_5__2 : rule__Authentication__Group_5__2__Impl rule__Authentication__Group_5__3 ;
    public final void rule__Authentication__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4076:1: ( rule__Authentication__Group_5__2__Impl rule__Authentication__Group_5__3 )
            // InternalSecurityDsl.g:4077:2: rule__Authentication__Group_5__2__Impl rule__Authentication__Group_5__3
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
    // InternalSecurityDsl.g:4084:1: rule__Authentication__Group_5__2__Impl : ( ( rule__Authentication__Controller_endpointsAssignment_5_2 ) ) ;
    public final void rule__Authentication__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4088:1: ( ( ( rule__Authentication__Controller_endpointsAssignment_5_2 ) ) )
            // InternalSecurityDsl.g:4089:1: ( ( rule__Authentication__Controller_endpointsAssignment_5_2 ) )
            {
            // InternalSecurityDsl.g:4089:1: ( ( rule__Authentication__Controller_endpointsAssignment_5_2 ) )
            // InternalSecurityDsl.g:4090:2: ( rule__Authentication__Controller_endpointsAssignment_5_2 )
            {
             before(grammarAccess.getAuthenticationAccess().getController_endpointsAssignment_5_2()); 
            // InternalSecurityDsl.g:4091:2: ( rule__Authentication__Controller_endpointsAssignment_5_2 )
            // InternalSecurityDsl.g:4091:3: rule__Authentication__Controller_endpointsAssignment_5_2
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
    // InternalSecurityDsl.g:4099:1: rule__Authentication__Group_5__3 : rule__Authentication__Group_5__3__Impl rule__Authentication__Group_5__4 ;
    public final void rule__Authentication__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4103:1: ( rule__Authentication__Group_5__3__Impl rule__Authentication__Group_5__4 )
            // InternalSecurityDsl.g:4104:2: rule__Authentication__Group_5__3__Impl rule__Authentication__Group_5__4
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
    // InternalSecurityDsl.g:4111:1: rule__Authentication__Group_5__3__Impl : ( ( rule__Authentication__Group_5_3__0 )* ) ;
    public final void rule__Authentication__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4115:1: ( ( ( rule__Authentication__Group_5_3__0 )* ) )
            // InternalSecurityDsl.g:4116:1: ( ( rule__Authentication__Group_5_3__0 )* )
            {
            // InternalSecurityDsl.g:4116:1: ( ( rule__Authentication__Group_5_3__0 )* )
            // InternalSecurityDsl.g:4117:2: ( rule__Authentication__Group_5_3__0 )*
            {
             before(grammarAccess.getAuthenticationAccess().getGroup_5_3()); 
            // InternalSecurityDsl.g:4118:2: ( rule__Authentication__Group_5_3__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==60) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalSecurityDsl.g:4118:3: rule__Authentication__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_27);
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
    // InternalSecurityDsl.g:4126:1: rule__Authentication__Group_5__4 : rule__Authentication__Group_5__4__Impl ;
    public final void rule__Authentication__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4130:1: ( rule__Authentication__Group_5__4__Impl )
            // InternalSecurityDsl.g:4131:2: rule__Authentication__Group_5__4__Impl
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
    // InternalSecurityDsl.g:4137:1: rule__Authentication__Group_5__4__Impl : ( ']' ) ;
    public final void rule__Authentication__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4141:1: ( ( ']' ) )
            // InternalSecurityDsl.g:4142:1: ( ']' )
            {
            // InternalSecurityDsl.g:4142:1: ( ']' )
            // InternalSecurityDsl.g:4143:2: ']'
            {
             before(grammarAccess.getAuthenticationAccess().getRightSquareBracketKeyword_5_4()); 
            match(input,59,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4153:1: rule__Authentication__Group_5_3__0 : rule__Authentication__Group_5_3__0__Impl rule__Authentication__Group_5_3__1 ;
    public final void rule__Authentication__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4157:1: ( rule__Authentication__Group_5_3__0__Impl rule__Authentication__Group_5_3__1 )
            // InternalSecurityDsl.g:4158:2: rule__Authentication__Group_5_3__0__Impl rule__Authentication__Group_5_3__1
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
    // InternalSecurityDsl.g:4165:1: rule__Authentication__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Authentication__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4169:1: ( ( ',' ) )
            // InternalSecurityDsl.g:4170:1: ( ',' )
            {
            // InternalSecurityDsl.g:4170:1: ( ',' )
            // InternalSecurityDsl.g:4171:2: ','
            {
             before(grammarAccess.getAuthenticationAccess().getCommaKeyword_5_3_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4180:1: rule__Authentication__Group_5_3__1 : rule__Authentication__Group_5_3__1__Impl ;
    public final void rule__Authentication__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4184:1: ( rule__Authentication__Group_5_3__1__Impl )
            // InternalSecurityDsl.g:4185:2: rule__Authentication__Group_5_3__1__Impl
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
    // InternalSecurityDsl.g:4191:1: rule__Authentication__Group_5_3__1__Impl : ( ( rule__Authentication__Controller_endpointsAssignment_5_3_1 ) ) ;
    public final void rule__Authentication__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4195:1: ( ( ( rule__Authentication__Controller_endpointsAssignment_5_3_1 ) ) )
            // InternalSecurityDsl.g:4196:1: ( ( rule__Authentication__Controller_endpointsAssignment_5_3_1 ) )
            {
            // InternalSecurityDsl.g:4196:1: ( ( rule__Authentication__Controller_endpointsAssignment_5_3_1 ) )
            // InternalSecurityDsl.g:4197:2: ( rule__Authentication__Controller_endpointsAssignment_5_3_1 )
            {
             before(grammarAccess.getAuthenticationAccess().getController_endpointsAssignment_5_3_1()); 
            // InternalSecurityDsl.g:4198:2: ( rule__Authentication__Controller_endpointsAssignment_5_3_1 )
            // InternalSecurityDsl.g:4198:3: rule__Authentication__Controller_endpointsAssignment_5_3_1
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
    // InternalSecurityDsl.g:4207:1: rule__JWT__Group__0 : rule__JWT__Group__0__Impl rule__JWT__Group__1 ;
    public final void rule__JWT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4211:1: ( rule__JWT__Group__0__Impl rule__JWT__Group__1 )
            // InternalSecurityDsl.g:4212:2: rule__JWT__Group__0__Impl rule__JWT__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalSecurityDsl.g:4219:1: rule__JWT__Group__0__Impl : ( 'jwt:' ) ;
    public final void rule__JWT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4223:1: ( ( 'jwt:' ) )
            // InternalSecurityDsl.g:4224:1: ( 'jwt:' )
            {
            // InternalSecurityDsl.g:4224:1: ( 'jwt:' )
            // InternalSecurityDsl.g:4225:2: 'jwt:'
            {
             before(grammarAccess.getJWTAccess().getJwtKeyword_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4234:1: rule__JWT__Group__1 : rule__JWT__Group__1__Impl rule__JWT__Group__2 ;
    public final void rule__JWT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4238:1: ( rule__JWT__Group__1__Impl rule__JWT__Group__2 )
            // InternalSecurityDsl.g:4239:2: rule__JWT__Group__1__Impl rule__JWT__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSecurityDsl.g:4246:1: rule__JWT__Group__1__Impl : ( 'signatureAlgorithm:' ) ;
    public final void rule__JWT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4250:1: ( ( 'signatureAlgorithm:' ) )
            // InternalSecurityDsl.g:4251:1: ( 'signatureAlgorithm:' )
            {
            // InternalSecurityDsl.g:4251:1: ( 'signatureAlgorithm:' )
            // InternalSecurityDsl.g:4252:2: 'signatureAlgorithm:'
            {
             before(grammarAccess.getJWTAccess().getSignatureAlgorithmKeyword_1()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getJWTAccess().getSignatureAlgorithmKeyword_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:4261:1: rule__JWT__Group__2 : rule__JWT__Group__2__Impl rule__JWT__Group__3 ;
    public final void rule__JWT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4265:1: ( rule__JWT__Group__2__Impl rule__JWT__Group__3 )
            // InternalSecurityDsl.g:4266:2: rule__JWT__Group__2__Impl rule__JWT__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalSecurityDsl.g:4273:1: rule__JWT__Group__2__Impl : ( ( rule__JWT__SignatureAlgorithmAssignment_2 ) ) ;
    public final void rule__JWT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4277:1: ( ( ( rule__JWT__SignatureAlgorithmAssignment_2 ) ) )
            // InternalSecurityDsl.g:4278:1: ( ( rule__JWT__SignatureAlgorithmAssignment_2 ) )
            {
            // InternalSecurityDsl.g:4278:1: ( ( rule__JWT__SignatureAlgorithmAssignment_2 ) )
            // InternalSecurityDsl.g:4279:2: ( rule__JWT__SignatureAlgorithmAssignment_2 )
            {
             before(grammarAccess.getJWTAccess().getSignatureAlgorithmAssignment_2()); 
            // InternalSecurityDsl.g:4280:2: ( rule__JWT__SignatureAlgorithmAssignment_2 )
            // InternalSecurityDsl.g:4280:3: rule__JWT__SignatureAlgorithmAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__JWT__SignatureAlgorithmAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getJWTAccess().getSignatureAlgorithmAssignment_2()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:4288:1: rule__JWT__Group__3 : rule__JWT__Group__3__Impl rule__JWT__Group__4 ;
    public final void rule__JWT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4292:1: ( rule__JWT__Group__3__Impl rule__JWT__Group__4 )
            // InternalSecurityDsl.g:4293:2: rule__JWT__Group__3__Impl rule__JWT__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalSecurityDsl.g:4300:1: rule__JWT__Group__3__Impl : ( 'secret:' ) ;
    public final void rule__JWT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4304:1: ( ( 'secret:' ) )
            // InternalSecurityDsl.g:4305:1: ( 'secret:' )
            {
            // InternalSecurityDsl.g:4305:1: ( 'secret:' )
            // InternalSecurityDsl.g:4306:2: 'secret:'
            {
             before(grammarAccess.getJWTAccess().getSecretKeyword_3()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getJWTAccess().getSecretKeyword_3()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:4315:1: rule__JWT__Group__4 : rule__JWT__Group__4__Impl rule__JWT__Group__5 ;
    public final void rule__JWT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4319:1: ( rule__JWT__Group__4__Impl rule__JWT__Group__5 )
            // InternalSecurityDsl.g:4320:2: rule__JWT__Group__4__Impl rule__JWT__Group__5
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
    // InternalSecurityDsl.g:4327:1: rule__JWT__Group__4__Impl : ( ( rule__JWT__SecretAssignment_4 ) ) ;
    public final void rule__JWT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4331:1: ( ( ( rule__JWT__SecretAssignment_4 ) ) )
            // InternalSecurityDsl.g:4332:1: ( ( rule__JWT__SecretAssignment_4 ) )
            {
            // InternalSecurityDsl.g:4332:1: ( ( rule__JWT__SecretAssignment_4 ) )
            // InternalSecurityDsl.g:4333:2: ( rule__JWT__SecretAssignment_4 )
            {
             before(grammarAccess.getJWTAccess().getSecretAssignment_4()); 
            // InternalSecurityDsl.g:4334:2: ( rule__JWT__SecretAssignment_4 )
            // InternalSecurityDsl.g:4334:3: rule__JWT__SecretAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__JWT__SecretAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getJWTAccess().getSecretAssignment_4()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:4342:1: rule__JWT__Group__5 : rule__JWT__Group__5__Impl rule__JWT__Group__6 ;
    public final void rule__JWT__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4346:1: ( rule__JWT__Group__5__Impl rule__JWT__Group__6 )
            // InternalSecurityDsl.g:4347:2: rule__JWT__Group__5__Impl rule__JWT__Group__6
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
    // InternalSecurityDsl.g:4354:1: rule__JWT__Group__5__Impl : ( 'claims:' ) ;
    public final void rule__JWT__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4358:1: ( ( 'claims:' ) )
            // InternalSecurityDsl.g:4359:1: ( 'claims:' )
            {
            // InternalSecurityDsl.g:4359:1: ( 'claims:' )
            // InternalSecurityDsl.g:4360:2: 'claims:'
            {
             before(grammarAccess.getJWTAccess().getClaimsKeyword_5()); 
            match(input,70,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4369:1: rule__JWT__Group__6 : rule__JWT__Group__6__Impl rule__JWT__Group__7 ;
    public final void rule__JWT__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4373:1: ( rule__JWT__Group__6__Impl rule__JWT__Group__7 )
            // InternalSecurityDsl.g:4374:2: rule__JWT__Group__6__Impl rule__JWT__Group__7
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
    // InternalSecurityDsl.g:4381:1: rule__JWT__Group__6__Impl : ( '[' ) ;
    public final void rule__JWT__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4385:1: ( ( '[' ) )
            // InternalSecurityDsl.g:4386:1: ( '[' )
            {
            // InternalSecurityDsl.g:4386:1: ( '[' )
            // InternalSecurityDsl.g:4387:2: '['
            {
             before(grammarAccess.getJWTAccess().getLeftSquareBracketKeyword_6()); 
            match(input,58,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4396:1: rule__JWT__Group__7 : rule__JWT__Group__7__Impl rule__JWT__Group__8 ;
    public final void rule__JWT__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4400:1: ( rule__JWT__Group__7__Impl rule__JWT__Group__8 )
            // InternalSecurityDsl.g:4401:2: rule__JWT__Group__7__Impl rule__JWT__Group__8
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
    // InternalSecurityDsl.g:4408:1: rule__JWT__Group__7__Impl : ( ( rule__JWT__ClaimsAssignment_7 ) ) ;
    public final void rule__JWT__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4412:1: ( ( ( rule__JWT__ClaimsAssignment_7 ) ) )
            // InternalSecurityDsl.g:4413:1: ( ( rule__JWT__ClaimsAssignment_7 ) )
            {
            // InternalSecurityDsl.g:4413:1: ( ( rule__JWT__ClaimsAssignment_7 ) )
            // InternalSecurityDsl.g:4414:2: ( rule__JWT__ClaimsAssignment_7 )
            {
             before(grammarAccess.getJWTAccess().getClaimsAssignment_7()); 
            // InternalSecurityDsl.g:4415:2: ( rule__JWT__ClaimsAssignment_7 )
            // InternalSecurityDsl.g:4415:3: rule__JWT__ClaimsAssignment_7
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
    // InternalSecurityDsl.g:4423:1: rule__JWT__Group__8 : rule__JWT__Group__8__Impl rule__JWT__Group__9 ;
    public final void rule__JWT__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4427:1: ( rule__JWT__Group__8__Impl rule__JWT__Group__9 )
            // InternalSecurityDsl.g:4428:2: rule__JWT__Group__8__Impl rule__JWT__Group__9
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
    // InternalSecurityDsl.g:4435:1: rule__JWT__Group__8__Impl : ( ( rule__JWT__Group_8__0 )* ) ;
    public final void rule__JWT__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4439:1: ( ( ( rule__JWT__Group_8__0 )* ) )
            // InternalSecurityDsl.g:4440:1: ( ( rule__JWT__Group_8__0 )* )
            {
            // InternalSecurityDsl.g:4440:1: ( ( rule__JWT__Group_8__0 )* )
            // InternalSecurityDsl.g:4441:2: ( rule__JWT__Group_8__0 )*
            {
             before(grammarAccess.getJWTAccess().getGroup_8()); 
            // InternalSecurityDsl.g:4442:2: ( rule__JWT__Group_8__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==60) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalSecurityDsl.g:4442:3: rule__JWT__Group_8__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__JWT__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalSecurityDsl.g:4450:1: rule__JWT__Group__9 : rule__JWT__Group__9__Impl ;
    public final void rule__JWT__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4454:1: ( rule__JWT__Group__9__Impl )
            // InternalSecurityDsl.g:4455:2: rule__JWT__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JWT__Group__9__Impl();

            state._fsp--;


            }

        }
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
    // InternalSecurityDsl.g:4461:1: rule__JWT__Group__9__Impl : ( ']' ) ;
    public final void rule__JWT__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4465:1: ( ( ']' ) )
            // InternalSecurityDsl.g:4466:1: ( ']' )
            {
            // InternalSecurityDsl.g:4466:1: ( ']' )
            // InternalSecurityDsl.g:4467:2: ']'
            {
             before(grammarAccess.getJWTAccess().getRightSquareBracketKeyword_9()); 
            match(input,59,FOLLOW_2); 
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


    // $ANTLR start "rule__JWT__Group_8__0"
    // InternalSecurityDsl.g:4477:1: rule__JWT__Group_8__0 : rule__JWT__Group_8__0__Impl rule__JWT__Group_8__1 ;
    public final void rule__JWT__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4481:1: ( rule__JWT__Group_8__0__Impl rule__JWT__Group_8__1 )
            // InternalSecurityDsl.g:4482:2: rule__JWT__Group_8__0__Impl rule__JWT__Group_8__1
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
    // InternalSecurityDsl.g:4489:1: rule__JWT__Group_8__0__Impl : ( ',' ) ;
    public final void rule__JWT__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4493:1: ( ( ',' ) )
            // InternalSecurityDsl.g:4494:1: ( ',' )
            {
            // InternalSecurityDsl.g:4494:1: ( ',' )
            // InternalSecurityDsl.g:4495:2: ','
            {
             before(grammarAccess.getJWTAccess().getCommaKeyword_8_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4504:1: rule__JWT__Group_8__1 : rule__JWT__Group_8__1__Impl ;
    public final void rule__JWT__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4508:1: ( rule__JWT__Group_8__1__Impl )
            // InternalSecurityDsl.g:4509:2: rule__JWT__Group_8__1__Impl
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
    // InternalSecurityDsl.g:4515:1: rule__JWT__Group_8__1__Impl : ( ( rule__JWT__ClaimsAssignment_8_1 ) ) ;
    public final void rule__JWT__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4519:1: ( ( ( rule__JWT__ClaimsAssignment_8_1 ) ) )
            // InternalSecurityDsl.g:4520:1: ( ( rule__JWT__ClaimsAssignment_8_1 ) )
            {
            // InternalSecurityDsl.g:4520:1: ( ( rule__JWT__ClaimsAssignment_8_1 ) )
            // InternalSecurityDsl.g:4521:2: ( rule__JWT__ClaimsAssignment_8_1 )
            {
             before(grammarAccess.getJWTAccess().getClaimsAssignment_8_1()); 
            // InternalSecurityDsl.g:4522:2: ( rule__JWT__ClaimsAssignment_8_1 )
            // InternalSecurityDsl.g:4522:3: rule__JWT__ClaimsAssignment_8_1
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


    // $ANTLR start "rule__Claim__Group__0"
    // InternalSecurityDsl.g:4531:1: rule__Claim__Group__0 : rule__Claim__Group__0__Impl rule__Claim__Group__1 ;
    public final void rule__Claim__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4535:1: ( rule__Claim__Group__0__Impl rule__Claim__Group__1 )
            // InternalSecurityDsl.g:4536:2: rule__Claim__Group__0__Impl rule__Claim__Group__1
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
    // InternalSecurityDsl.g:4543:1: rule__Claim__Group__0__Impl : ( '{' ) ;
    public final void rule__Claim__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4547:1: ( ( '{' ) )
            // InternalSecurityDsl.g:4548:1: ( '{' )
            {
            // InternalSecurityDsl.g:4548:1: ( '{' )
            // InternalSecurityDsl.g:4549:2: '{'
            {
             before(grammarAccess.getClaimAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4558:1: rule__Claim__Group__1 : rule__Claim__Group__1__Impl rule__Claim__Group__2 ;
    public final void rule__Claim__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4562:1: ( rule__Claim__Group__1__Impl rule__Claim__Group__2 )
            // InternalSecurityDsl.g:4563:2: rule__Claim__Group__1__Impl rule__Claim__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalSecurityDsl.g:4570:1: rule__Claim__Group__1__Impl : ( ( rule__Claim__TypeAssignment_1 ) ) ;
    public final void rule__Claim__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4574:1: ( ( ( rule__Claim__TypeAssignment_1 ) ) )
            // InternalSecurityDsl.g:4575:1: ( ( rule__Claim__TypeAssignment_1 ) )
            {
            // InternalSecurityDsl.g:4575:1: ( ( rule__Claim__TypeAssignment_1 ) )
            // InternalSecurityDsl.g:4576:2: ( rule__Claim__TypeAssignment_1 )
            {
             before(grammarAccess.getClaimAccess().getTypeAssignment_1()); 
            // InternalSecurityDsl.g:4577:2: ( rule__Claim__TypeAssignment_1 )
            // InternalSecurityDsl.g:4577:3: rule__Claim__TypeAssignment_1
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
    // InternalSecurityDsl.g:4585:1: rule__Claim__Group__2 : rule__Claim__Group__2__Impl rule__Claim__Group__3 ;
    public final void rule__Claim__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4589:1: ( rule__Claim__Group__2__Impl rule__Claim__Group__3 )
            // InternalSecurityDsl.g:4590:2: rule__Claim__Group__2__Impl rule__Claim__Group__3
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
    // InternalSecurityDsl.g:4597:1: rule__Claim__Group__2__Impl : ( ',' ) ;
    public final void rule__Claim__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4601:1: ( ( ',' ) )
            // InternalSecurityDsl.g:4602:1: ( ',' )
            {
            // InternalSecurityDsl.g:4602:1: ( ',' )
            // InternalSecurityDsl.g:4603:2: ','
            {
             before(grammarAccess.getClaimAccess().getCommaKeyword_2()); 
            match(input,60,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4612:1: rule__Claim__Group__3 : rule__Claim__Group__3__Impl rule__Claim__Group__4 ;
    public final void rule__Claim__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4616:1: ( rule__Claim__Group__3__Impl rule__Claim__Group__4 )
            // InternalSecurityDsl.g:4617:2: rule__Claim__Group__3__Impl rule__Claim__Group__4
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
    // InternalSecurityDsl.g:4624:1: rule__Claim__Group__3__Impl : ( ( rule__Claim__NameAssignment_3 ) ) ;
    public final void rule__Claim__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4628:1: ( ( ( rule__Claim__NameAssignment_3 ) ) )
            // InternalSecurityDsl.g:4629:1: ( ( rule__Claim__NameAssignment_3 ) )
            {
            // InternalSecurityDsl.g:4629:1: ( ( rule__Claim__NameAssignment_3 ) )
            // InternalSecurityDsl.g:4630:2: ( rule__Claim__NameAssignment_3 )
            {
             before(grammarAccess.getClaimAccess().getNameAssignment_3()); 
            // InternalSecurityDsl.g:4631:2: ( rule__Claim__NameAssignment_3 )
            // InternalSecurityDsl.g:4631:3: rule__Claim__NameAssignment_3
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
    // InternalSecurityDsl.g:4639:1: rule__Claim__Group__4 : rule__Claim__Group__4__Impl rule__Claim__Group__5 ;
    public final void rule__Claim__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4643:1: ( rule__Claim__Group__4__Impl rule__Claim__Group__5 )
            // InternalSecurityDsl.g:4644:2: rule__Claim__Group__4__Impl rule__Claim__Group__5
            {
            pushFollow(FOLLOW_41);
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
    // InternalSecurityDsl.g:4651:1: rule__Claim__Group__4__Impl : ( ':' ) ;
    public final void rule__Claim__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4655:1: ( ( ':' ) )
            // InternalSecurityDsl.g:4656:1: ( ':' )
            {
            // InternalSecurityDsl.g:4656:1: ( ':' )
            // InternalSecurityDsl.g:4657:2: ':'
            {
             before(grammarAccess.getClaimAccess().getColonKeyword_4()); 
            match(input,71,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4666:1: rule__Claim__Group__5 : rule__Claim__Group__5__Impl rule__Claim__Group__6 ;
    public final void rule__Claim__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4670:1: ( rule__Claim__Group__5__Impl rule__Claim__Group__6 )
            // InternalSecurityDsl.g:4671:2: rule__Claim__Group__5__Impl rule__Claim__Group__6
            {
            pushFollow(FOLLOW_41);
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
    // InternalSecurityDsl.g:4678:1: rule__Claim__Group__5__Impl : ( ( rule__Claim__ValueAssignment_5 )? ) ;
    public final void rule__Claim__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4682:1: ( ( ( rule__Claim__ValueAssignment_5 )? ) )
            // InternalSecurityDsl.g:4683:1: ( ( rule__Claim__ValueAssignment_5 )? )
            {
            // InternalSecurityDsl.g:4683:1: ( ( rule__Claim__ValueAssignment_5 )? )
            // InternalSecurityDsl.g:4684:2: ( rule__Claim__ValueAssignment_5 )?
            {
             before(grammarAccess.getClaimAccess().getValueAssignment_5()); 
            // InternalSecurityDsl.g:4685:2: ( rule__Claim__ValueAssignment_5 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_STRING && LA39_0<=RULE_ID)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSecurityDsl.g:4685:3: rule__Claim__ValueAssignment_5
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
    // InternalSecurityDsl.g:4693:1: rule__Claim__Group__6 : rule__Claim__Group__6__Impl rule__Claim__Group__7 ;
    public final void rule__Claim__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4697:1: ( rule__Claim__Group__6__Impl rule__Claim__Group__7 )
            // InternalSecurityDsl.g:4698:2: rule__Claim__Group__6__Impl rule__Claim__Group__7
            {
            pushFollow(FOLLOW_41);
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
    // InternalSecurityDsl.g:4705:1: rule__Claim__Group__6__Impl : ( ( rule__Claim__Group_6__0 )? ) ;
    public final void rule__Claim__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4709:1: ( ( ( rule__Claim__Group_6__0 )? ) )
            // InternalSecurityDsl.g:4710:1: ( ( rule__Claim__Group_6__0 )? )
            {
            // InternalSecurityDsl.g:4710:1: ( ( rule__Claim__Group_6__0 )? )
            // InternalSecurityDsl.g:4711:2: ( rule__Claim__Group_6__0 )?
            {
             before(grammarAccess.getClaimAccess().getGroup_6()); 
            // InternalSecurityDsl.g:4712:2: ( rule__Claim__Group_6__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==72) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSecurityDsl.g:4712:3: rule__Claim__Group_6__0
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
    // InternalSecurityDsl.g:4720:1: rule__Claim__Group__7 : rule__Claim__Group__7__Impl ;
    public final void rule__Claim__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4724:1: ( rule__Claim__Group__7__Impl )
            // InternalSecurityDsl.g:4725:2: rule__Claim__Group__7__Impl
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
    // InternalSecurityDsl.g:4731:1: rule__Claim__Group__7__Impl : ( '}' ) ;
    public final void rule__Claim__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4735:1: ( ( '}' ) )
            // InternalSecurityDsl.g:4736:1: ( '}' )
            {
            // InternalSecurityDsl.g:4736:1: ( '}' )
            // InternalSecurityDsl.g:4737:2: '}'
            {
             before(grammarAccess.getClaimAccess().getRightCurlyBracketKeyword_7()); 
            match(input,54,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4747:1: rule__Claim__Group_6__0 : rule__Claim__Group_6__0__Impl rule__Claim__Group_6__1 ;
    public final void rule__Claim__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4751:1: ( rule__Claim__Group_6__0__Impl rule__Claim__Group_6__1 )
            // InternalSecurityDsl.g:4752:2: rule__Claim__Group_6__0__Impl rule__Claim__Group_6__1
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
    // InternalSecurityDsl.g:4759:1: rule__Claim__Group_6__0__Impl : ( 'attribute' ) ;
    public final void rule__Claim__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4763:1: ( ( 'attribute' ) )
            // InternalSecurityDsl.g:4764:1: ( 'attribute' )
            {
            // InternalSecurityDsl.g:4764:1: ( 'attribute' )
            // InternalSecurityDsl.g:4765:2: 'attribute'
            {
             before(grammarAccess.getClaimAccess().getAttributeKeyword_6_0()); 
            match(input,72,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4774:1: rule__Claim__Group_6__1 : rule__Claim__Group_6__1__Impl ;
    public final void rule__Claim__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4778:1: ( rule__Claim__Group_6__1__Impl )
            // InternalSecurityDsl.g:4779:2: rule__Claim__Group_6__1__Impl
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
    // InternalSecurityDsl.g:4785:1: rule__Claim__Group_6__1__Impl : ( ( rule__Claim__Claim_attributeAssignment_6_1 ) ) ;
    public final void rule__Claim__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4789:1: ( ( ( rule__Claim__Claim_attributeAssignment_6_1 ) ) )
            // InternalSecurityDsl.g:4790:1: ( ( rule__Claim__Claim_attributeAssignment_6_1 ) )
            {
            // InternalSecurityDsl.g:4790:1: ( ( rule__Claim__Claim_attributeAssignment_6_1 ) )
            // InternalSecurityDsl.g:4791:2: ( rule__Claim__Claim_attributeAssignment_6_1 )
            {
             before(grammarAccess.getClaimAccess().getClaim_attributeAssignment_6_1()); 
            // InternalSecurityDsl.g:4792:2: ( rule__Claim__Claim_attributeAssignment_6_1 )
            // InternalSecurityDsl.g:4792:3: rule__Claim__Claim_attributeAssignment_6_1
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
    // InternalSecurityDsl.g:4801:1: rule__OAuth2__Group__0 : rule__OAuth2__Group__0__Impl rule__OAuth2__Group__1 ;
    public final void rule__OAuth2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4805:1: ( rule__OAuth2__Group__0__Impl rule__OAuth2__Group__1 )
            // InternalSecurityDsl.g:4806:2: rule__OAuth2__Group__0__Impl rule__OAuth2__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalSecurityDsl.g:4813:1: rule__OAuth2__Group__0__Impl : ( 'OAuth2.0:' ) ;
    public final void rule__OAuth2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4817:1: ( ( 'OAuth2.0:' ) )
            // InternalSecurityDsl.g:4818:1: ( 'OAuth2.0:' )
            {
            // InternalSecurityDsl.g:4818:1: ( 'OAuth2.0:' )
            // InternalSecurityDsl.g:4819:2: 'OAuth2.0:'
            {
             before(grammarAccess.getOAuth2Access().getOAuth20Keyword_0()); 
            match(input,73,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4828:1: rule__OAuth2__Group__1 : rule__OAuth2__Group__1__Impl rule__OAuth2__Group__2 ;
    public final void rule__OAuth2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4832:1: ( rule__OAuth2__Group__1__Impl rule__OAuth2__Group__2 )
            // InternalSecurityDsl.g:4833:2: rule__OAuth2__Group__1__Impl rule__OAuth2__Group__2
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
    // InternalSecurityDsl.g:4840:1: rule__OAuth2__Group__1__Impl : ( 'providers:' ) ;
    public final void rule__OAuth2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4844:1: ( ( 'providers:' ) )
            // InternalSecurityDsl.g:4845:1: ( 'providers:' )
            {
            // InternalSecurityDsl.g:4845:1: ( 'providers:' )
            // InternalSecurityDsl.g:4846:2: 'providers:'
            {
             before(grammarAccess.getOAuth2Access().getProvidersKeyword_1()); 
            match(input,74,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4855:1: rule__OAuth2__Group__2 : rule__OAuth2__Group__2__Impl rule__OAuth2__Group__3 ;
    public final void rule__OAuth2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4859:1: ( rule__OAuth2__Group__2__Impl rule__OAuth2__Group__3 )
            // InternalSecurityDsl.g:4860:2: rule__OAuth2__Group__2__Impl rule__OAuth2__Group__3
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
    // InternalSecurityDsl.g:4867:1: rule__OAuth2__Group__2__Impl : ( '[' ) ;
    public final void rule__OAuth2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4871:1: ( ( '[' ) )
            // InternalSecurityDsl.g:4872:1: ( '[' )
            {
            // InternalSecurityDsl.g:4872:1: ( '[' )
            // InternalSecurityDsl.g:4873:2: '['
            {
             before(grammarAccess.getOAuth2Access().getLeftSquareBracketKeyword_2()); 
            match(input,58,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4882:1: rule__OAuth2__Group__3 : rule__OAuth2__Group__3__Impl rule__OAuth2__Group__4 ;
    public final void rule__OAuth2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4886:1: ( rule__OAuth2__Group__3__Impl rule__OAuth2__Group__4 )
            // InternalSecurityDsl.g:4887:2: rule__OAuth2__Group__3__Impl rule__OAuth2__Group__4
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
    // InternalSecurityDsl.g:4894:1: rule__OAuth2__Group__3__Impl : ( ( rule__OAuth2__ProvidersAssignment_3 ) ) ;
    public final void rule__OAuth2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4898:1: ( ( ( rule__OAuth2__ProvidersAssignment_3 ) ) )
            // InternalSecurityDsl.g:4899:1: ( ( rule__OAuth2__ProvidersAssignment_3 ) )
            {
            // InternalSecurityDsl.g:4899:1: ( ( rule__OAuth2__ProvidersAssignment_3 ) )
            // InternalSecurityDsl.g:4900:2: ( rule__OAuth2__ProvidersAssignment_3 )
            {
             before(grammarAccess.getOAuth2Access().getProvidersAssignment_3()); 
            // InternalSecurityDsl.g:4901:2: ( rule__OAuth2__ProvidersAssignment_3 )
            // InternalSecurityDsl.g:4901:3: rule__OAuth2__ProvidersAssignment_3
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
    // InternalSecurityDsl.g:4909:1: rule__OAuth2__Group__4 : rule__OAuth2__Group__4__Impl rule__OAuth2__Group__5 ;
    public final void rule__OAuth2__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4913:1: ( rule__OAuth2__Group__4__Impl rule__OAuth2__Group__5 )
            // InternalSecurityDsl.g:4914:2: rule__OAuth2__Group__4__Impl rule__OAuth2__Group__5
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
    // InternalSecurityDsl.g:4921:1: rule__OAuth2__Group__4__Impl : ( ( rule__OAuth2__Group_4__0 )* ) ;
    public final void rule__OAuth2__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4925:1: ( ( ( rule__OAuth2__Group_4__0 )* ) )
            // InternalSecurityDsl.g:4926:1: ( ( rule__OAuth2__Group_4__0 )* )
            {
            // InternalSecurityDsl.g:4926:1: ( ( rule__OAuth2__Group_4__0 )* )
            // InternalSecurityDsl.g:4927:2: ( rule__OAuth2__Group_4__0 )*
            {
             before(grammarAccess.getOAuth2Access().getGroup_4()); 
            // InternalSecurityDsl.g:4928:2: ( rule__OAuth2__Group_4__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==60) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalSecurityDsl.g:4928:3: rule__OAuth2__Group_4__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__OAuth2__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalSecurityDsl.g:4936:1: rule__OAuth2__Group__5 : rule__OAuth2__Group__5__Impl ;
    public final void rule__OAuth2__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4940:1: ( rule__OAuth2__Group__5__Impl )
            // InternalSecurityDsl.g:4941:2: rule__OAuth2__Group__5__Impl
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
    // InternalSecurityDsl.g:4947:1: rule__OAuth2__Group__5__Impl : ( ']' ) ;
    public final void rule__OAuth2__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4951:1: ( ( ']' ) )
            // InternalSecurityDsl.g:4952:1: ( ']' )
            {
            // InternalSecurityDsl.g:4952:1: ( ']' )
            // InternalSecurityDsl.g:4953:2: ']'
            {
             before(grammarAccess.getOAuth2Access().getRightSquareBracketKeyword_5()); 
            match(input,59,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4963:1: rule__OAuth2__Group_4__0 : rule__OAuth2__Group_4__0__Impl rule__OAuth2__Group_4__1 ;
    public final void rule__OAuth2__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4967:1: ( rule__OAuth2__Group_4__0__Impl rule__OAuth2__Group_4__1 )
            // InternalSecurityDsl.g:4968:2: rule__OAuth2__Group_4__0__Impl rule__OAuth2__Group_4__1
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
    // InternalSecurityDsl.g:4975:1: rule__OAuth2__Group_4__0__Impl : ( ',' ) ;
    public final void rule__OAuth2__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4979:1: ( ( ',' ) )
            // InternalSecurityDsl.g:4980:1: ( ',' )
            {
            // InternalSecurityDsl.g:4980:1: ( ',' )
            // InternalSecurityDsl.g:4981:2: ','
            {
             before(grammarAccess.getOAuth2Access().getCommaKeyword_4_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4990:1: rule__OAuth2__Group_4__1 : rule__OAuth2__Group_4__1__Impl ;
    public final void rule__OAuth2__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4994:1: ( rule__OAuth2__Group_4__1__Impl )
            // InternalSecurityDsl.g:4995:2: rule__OAuth2__Group_4__1__Impl
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
    // InternalSecurityDsl.g:5001:1: rule__OAuth2__Group_4__1__Impl : ( ( rule__OAuth2__ProvidersAssignment_4_1 ) ) ;
    public final void rule__OAuth2__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5005:1: ( ( ( rule__OAuth2__ProvidersAssignment_4_1 ) ) )
            // InternalSecurityDsl.g:5006:1: ( ( rule__OAuth2__ProvidersAssignment_4_1 ) )
            {
            // InternalSecurityDsl.g:5006:1: ( ( rule__OAuth2__ProvidersAssignment_4_1 ) )
            // InternalSecurityDsl.g:5007:2: ( rule__OAuth2__ProvidersAssignment_4_1 )
            {
             before(grammarAccess.getOAuth2Access().getProvidersAssignment_4_1()); 
            // InternalSecurityDsl.g:5008:2: ( rule__OAuth2__ProvidersAssignment_4_1 )
            // InternalSecurityDsl.g:5008:3: rule__OAuth2__ProvidersAssignment_4_1
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
    // InternalSecurityDsl.g:5017:1: rule__Provider__Group__0 : rule__Provider__Group__0__Impl rule__Provider__Group__1 ;
    public final void rule__Provider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5021:1: ( rule__Provider__Group__0__Impl rule__Provider__Group__1 )
            // InternalSecurityDsl.g:5022:2: rule__Provider__Group__0__Impl rule__Provider__Group__1
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
    // InternalSecurityDsl.g:5029:1: rule__Provider__Group__0__Impl : ( '{' ) ;
    public final void rule__Provider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5033:1: ( ( '{' ) )
            // InternalSecurityDsl.g:5034:1: ( '{' )
            {
            // InternalSecurityDsl.g:5034:1: ( '{' )
            // InternalSecurityDsl.g:5035:2: '{'
            {
             before(grammarAccess.getProviderAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5044:1: rule__Provider__Group__1 : rule__Provider__Group__1__Impl rule__Provider__Group__2 ;
    public final void rule__Provider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5048:1: ( rule__Provider__Group__1__Impl rule__Provider__Group__2 )
            // InternalSecurityDsl.g:5049:2: rule__Provider__Group__1__Impl rule__Provider__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSecurityDsl.g:5056:1: rule__Provider__Group__1__Impl : ( 'name:' ) ;
    public final void rule__Provider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5060:1: ( ( 'name:' ) )
            // InternalSecurityDsl.g:5061:1: ( 'name:' )
            {
            // InternalSecurityDsl.g:5061:1: ( 'name:' )
            // InternalSecurityDsl.g:5062:2: 'name:'
            {
             before(grammarAccess.getProviderAccess().getNameKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5071:1: rule__Provider__Group__2 : rule__Provider__Group__2__Impl rule__Provider__Group__3 ;
    public final void rule__Provider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5075:1: ( rule__Provider__Group__2__Impl rule__Provider__Group__3 )
            // InternalSecurityDsl.g:5076:2: rule__Provider__Group__2__Impl rule__Provider__Group__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalSecurityDsl.g:5083:1: rule__Provider__Group__2__Impl : ( ( rule__Provider__NameAssignment_2 ) ) ;
    public final void rule__Provider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5087:1: ( ( ( rule__Provider__NameAssignment_2 ) ) )
            // InternalSecurityDsl.g:5088:1: ( ( rule__Provider__NameAssignment_2 ) )
            {
            // InternalSecurityDsl.g:5088:1: ( ( rule__Provider__NameAssignment_2 ) )
            // InternalSecurityDsl.g:5089:2: ( rule__Provider__NameAssignment_2 )
            {
             before(grammarAccess.getProviderAccess().getNameAssignment_2()); 
            // InternalSecurityDsl.g:5090:2: ( rule__Provider__NameAssignment_2 )
            // InternalSecurityDsl.g:5090:3: rule__Provider__NameAssignment_2
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
    // InternalSecurityDsl.g:5098:1: rule__Provider__Group__3 : rule__Provider__Group__3__Impl rule__Provider__Group__4 ;
    public final void rule__Provider__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5102:1: ( rule__Provider__Group__3__Impl rule__Provider__Group__4 )
            // InternalSecurityDsl.g:5103:2: rule__Provider__Group__3__Impl rule__Provider__Group__4
            {
            pushFollow(FOLLOW_43);
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
    // InternalSecurityDsl.g:5110:1: rule__Provider__Group__3__Impl : ( ',' ) ;
    public final void rule__Provider__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5114:1: ( ( ',' ) )
            // InternalSecurityDsl.g:5115:1: ( ',' )
            {
            // InternalSecurityDsl.g:5115:1: ( ',' )
            // InternalSecurityDsl.g:5116:2: ','
            {
             before(grammarAccess.getProviderAccess().getCommaKeyword_3()); 
            match(input,60,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5125:1: rule__Provider__Group__4 : rule__Provider__Group__4__Impl rule__Provider__Group__5 ;
    public final void rule__Provider__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5129:1: ( rule__Provider__Group__4__Impl rule__Provider__Group__5 )
            // InternalSecurityDsl.g:5130:2: rule__Provider__Group__4__Impl rule__Provider__Group__5
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
    // InternalSecurityDsl.g:5137:1: rule__Provider__Group__4__Impl : ( 'clientId:' ) ;
    public final void rule__Provider__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5141:1: ( ( 'clientId:' ) )
            // InternalSecurityDsl.g:5142:1: ( 'clientId:' )
            {
            // InternalSecurityDsl.g:5142:1: ( 'clientId:' )
            // InternalSecurityDsl.g:5143:2: 'clientId:'
            {
             before(grammarAccess.getProviderAccess().getClientIdKeyword_4()); 
            match(input,75,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5152:1: rule__Provider__Group__5 : rule__Provider__Group__5__Impl rule__Provider__Group__6 ;
    public final void rule__Provider__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5156:1: ( rule__Provider__Group__5__Impl rule__Provider__Group__6 )
            // InternalSecurityDsl.g:5157:2: rule__Provider__Group__5__Impl rule__Provider__Group__6
            {
            pushFollow(FOLLOW_39);
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
    // InternalSecurityDsl.g:5164:1: rule__Provider__Group__5__Impl : ( ( rule__Provider__ClientIdAssignment_5 ) ) ;
    public final void rule__Provider__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5168:1: ( ( ( rule__Provider__ClientIdAssignment_5 ) ) )
            // InternalSecurityDsl.g:5169:1: ( ( rule__Provider__ClientIdAssignment_5 ) )
            {
            // InternalSecurityDsl.g:5169:1: ( ( rule__Provider__ClientIdAssignment_5 ) )
            // InternalSecurityDsl.g:5170:2: ( rule__Provider__ClientIdAssignment_5 )
            {
             before(grammarAccess.getProviderAccess().getClientIdAssignment_5()); 
            // InternalSecurityDsl.g:5171:2: ( rule__Provider__ClientIdAssignment_5 )
            // InternalSecurityDsl.g:5171:3: rule__Provider__ClientIdAssignment_5
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
    // InternalSecurityDsl.g:5179:1: rule__Provider__Group__6 : rule__Provider__Group__6__Impl rule__Provider__Group__7 ;
    public final void rule__Provider__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5183:1: ( rule__Provider__Group__6__Impl rule__Provider__Group__7 )
            // InternalSecurityDsl.g:5184:2: rule__Provider__Group__6__Impl rule__Provider__Group__7
            {
            pushFollow(FOLLOW_44);
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
    // InternalSecurityDsl.g:5191:1: rule__Provider__Group__6__Impl : ( ',' ) ;
    public final void rule__Provider__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5195:1: ( ( ',' ) )
            // InternalSecurityDsl.g:5196:1: ( ',' )
            {
            // InternalSecurityDsl.g:5196:1: ( ',' )
            // InternalSecurityDsl.g:5197:2: ','
            {
             before(grammarAccess.getProviderAccess().getCommaKeyword_6()); 
            match(input,60,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5206:1: rule__Provider__Group__7 : rule__Provider__Group__7__Impl rule__Provider__Group__8 ;
    public final void rule__Provider__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5210:1: ( rule__Provider__Group__7__Impl rule__Provider__Group__8 )
            // InternalSecurityDsl.g:5211:2: rule__Provider__Group__7__Impl rule__Provider__Group__8
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
    // InternalSecurityDsl.g:5218:1: rule__Provider__Group__7__Impl : ( 'clientSecret:' ) ;
    public final void rule__Provider__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5222:1: ( ( 'clientSecret:' ) )
            // InternalSecurityDsl.g:5223:1: ( 'clientSecret:' )
            {
            // InternalSecurityDsl.g:5223:1: ( 'clientSecret:' )
            // InternalSecurityDsl.g:5224:2: 'clientSecret:'
            {
             before(grammarAccess.getProviderAccess().getClientSecretKeyword_7()); 
            match(input,76,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5233:1: rule__Provider__Group__8 : rule__Provider__Group__8__Impl rule__Provider__Group__9 ;
    public final void rule__Provider__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5237:1: ( rule__Provider__Group__8__Impl rule__Provider__Group__9 )
            // InternalSecurityDsl.g:5238:2: rule__Provider__Group__8__Impl rule__Provider__Group__9
            {
            pushFollow(FOLLOW_45);
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
    // InternalSecurityDsl.g:5245:1: rule__Provider__Group__8__Impl : ( ( rule__Provider__ClientSecretAssignment_8 ) ) ;
    public final void rule__Provider__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5249:1: ( ( ( rule__Provider__ClientSecretAssignment_8 ) ) )
            // InternalSecurityDsl.g:5250:1: ( ( rule__Provider__ClientSecretAssignment_8 ) )
            {
            // InternalSecurityDsl.g:5250:1: ( ( rule__Provider__ClientSecretAssignment_8 ) )
            // InternalSecurityDsl.g:5251:2: ( rule__Provider__ClientSecretAssignment_8 )
            {
             before(grammarAccess.getProviderAccess().getClientSecretAssignment_8()); 
            // InternalSecurityDsl.g:5252:2: ( rule__Provider__ClientSecretAssignment_8 )
            // InternalSecurityDsl.g:5252:3: rule__Provider__ClientSecretAssignment_8
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
    // InternalSecurityDsl.g:5260:1: rule__Provider__Group__9 : rule__Provider__Group__9__Impl rule__Provider__Group__10 ;
    public final void rule__Provider__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5264:1: ( rule__Provider__Group__9__Impl rule__Provider__Group__10 )
            // InternalSecurityDsl.g:5265:2: rule__Provider__Group__9__Impl rule__Provider__Group__10
            {
            pushFollow(FOLLOW_45);
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
    // InternalSecurityDsl.g:5272:1: rule__Provider__Group__9__Impl : ( ( rule__Provider__Group_9__0 )? ) ;
    public final void rule__Provider__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5276:1: ( ( ( rule__Provider__Group_9__0 )? ) )
            // InternalSecurityDsl.g:5277:1: ( ( rule__Provider__Group_9__0 )? )
            {
            // InternalSecurityDsl.g:5277:1: ( ( rule__Provider__Group_9__0 )? )
            // InternalSecurityDsl.g:5278:2: ( rule__Provider__Group_9__0 )?
            {
             before(grammarAccess.getProviderAccess().getGroup_9()); 
            // InternalSecurityDsl.g:5279:2: ( rule__Provider__Group_9__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==60) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSecurityDsl.g:5279:3: rule__Provider__Group_9__0
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
    // InternalSecurityDsl.g:5287:1: rule__Provider__Group__10 : rule__Provider__Group__10__Impl ;
    public final void rule__Provider__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5291:1: ( rule__Provider__Group__10__Impl )
            // InternalSecurityDsl.g:5292:2: rule__Provider__Group__10__Impl
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
    // InternalSecurityDsl.g:5298:1: rule__Provider__Group__10__Impl : ( '}' ) ;
    public final void rule__Provider__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5302:1: ( ( '}' ) )
            // InternalSecurityDsl.g:5303:1: ( '}' )
            {
            // InternalSecurityDsl.g:5303:1: ( '}' )
            // InternalSecurityDsl.g:5304:2: '}'
            {
             before(grammarAccess.getProviderAccess().getRightCurlyBracketKeyword_10()); 
            match(input,54,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5314:1: rule__Provider__Group_9__0 : rule__Provider__Group_9__0__Impl rule__Provider__Group_9__1 ;
    public final void rule__Provider__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5318:1: ( rule__Provider__Group_9__0__Impl rule__Provider__Group_9__1 )
            // InternalSecurityDsl.g:5319:2: rule__Provider__Group_9__0__Impl rule__Provider__Group_9__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalSecurityDsl.g:5326:1: rule__Provider__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Provider__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5330:1: ( ( ',' ) )
            // InternalSecurityDsl.g:5331:1: ( ',' )
            {
            // InternalSecurityDsl.g:5331:1: ( ',' )
            // InternalSecurityDsl.g:5332:2: ','
            {
             before(grammarAccess.getProviderAccess().getCommaKeyword_9_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5341:1: rule__Provider__Group_9__1 : rule__Provider__Group_9__1__Impl rule__Provider__Group_9__2 ;
    public final void rule__Provider__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5345:1: ( rule__Provider__Group_9__1__Impl rule__Provider__Group_9__2 )
            // InternalSecurityDsl.g:5346:2: rule__Provider__Group_9__1__Impl rule__Provider__Group_9__2
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
    // InternalSecurityDsl.g:5353:1: rule__Provider__Group_9__1__Impl : ( 'redirectUri:' ) ;
    public final void rule__Provider__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5357:1: ( ( 'redirectUri:' ) )
            // InternalSecurityDsl.g:5358:1: ( 'redirectUri:' )
            {
            // InternalSecurityDsl.g:5358:1: ( 'redirectUri:' )
            // InternalSecurityDsl.g:5359:2: 'redirectUri:'
            {
             before(grammarAccess.getProviderAccess().getRedirectUriKeyword_9_1()); 
            match(input,77,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5368:1: rule__Provider__Group_9__2 : rule__Provider__Group_9__2__Impl ;
    public final void rule__Provider__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5372:1: ( rule__Provider__Group_9__2__Impl )
            // InternalSecurityDsl.g:5373:2: rule__Provider__Group_9__2__Impl
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
    // InternalSecurityDsl.g:5379:1: rule__Provider__Group_9__2__Impl : ( ( rule__Provider__RedirectUriAssignment_9_2 ) ) ;
    public final void rule__Provider__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5383:1: ( ( ( rule__Provider__RedirectUriAssignment_9_2 ) ) )
            // InternalSecurityDsl.g:5384:1: ( ( rule__Provider__RedirectUriAssignment_9_2 ) )
            {
            // InternalSecurityDsl.g:5384:1: ( ( rule__Provider__RedirectUriAssignment_9_2 ) )
            // InternalSecurityDsl.g:5385:2: ( rule__Provider__RedirectUriAssignment_9_2 )
            {
             before(grammarAccess.getProviderAccess().getRedirectUriAssignment_9_2()); 
            // InternalSecurityDsl.g:5386:2: ( rule__Provider__RedirectUriAssignment_9_2 )
            // InternalSecurityDsl.g:5386:3: rule__Provider__RedirectUriAssignment_9_2
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
    // InternalSecurityDsl.g:5395:1: rule__BasicAuthentication__Group__0 : rule__BasicAuthentication__Group__0__Impl rule__BasicAuthentication__Group__1 ;
    public final void rule__BasicAuthentication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5399:1: ( rule__BasicAuthentication__Group__0__Impl rule__BasicAuthentication__Group__1 )
            // InternalSecurityDsl.g:5400:2: rule__BasicAuthentication__Group__0__Impl rule__BasicAuthentication__Group__1
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
    // InternalSecurityDsl.g:5407:1: rule__BasicAuthentication__Group__0__Impl : ( () ) ;
    public final void rule__BasicAuthentication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5411:1: ( ( () ) )
            // InternalSecurityDsl.g:5412:1: ( () )
            {
            // InternalSecurityDsl.g:5412:1: ( () )
            // InternalSecurityDsl.g:5413:2: ()
            {
             before(grammarAccess.getBasicAuthenticationAccess().getBasicAuthenticationAction_0()); 
            // InternalSecurityDsl.g:5414:2: ()
            // InternalSecurityDsl.g:5414:3: 
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
    // InternalSecurityDsl.g:5422:1: rule__BasicAuthentication__Group__1 : rule__BasicAuthentication__Group__1__Impl ;
    public final void rule__BasicAuthentication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5426:1: ( rule__BasicAuthentication__Group__1__Impl )
            // InternalSecurityDsl.g:5427:2: rule__BasicAuthentication__Group__1__Impl
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
    // InternalSecurityDsl.g:5433:1: rule__BasicAuthentication__Group__1__Impl : ( 'basicAuthentication' ) ;
    public final void rule__BasicAuthentication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5437:1: ( ( 'basicAuthentication' ) )
            // InternalSecurityDsl.g:5438:1: ( 'basicAuthentication' )
            {
            // InternalSecurityDsl.g:5438:1: ( 'basicAuthentication' )
            // InternalSecurityDsl.g:5439:2: 'basicAuthentication'
            {
             before(grammarAccess.getBasicAuthenticationAccess().getBasicAuthenticationKeyword_1()); 
            match(input,78,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5449:1: rule__Application__ArtifactAssignment_3 : ( ruleEString ) ;
    public final void rule__Application__ArtifactAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5453:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5454:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5454:2: ( ruleEString )
            // InternalSecurityDsl.g:5455:3: ruleEString
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
    // InternalSecurityDsl.g:5464:1: rule__Application__NameAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Application__NameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5468:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5469:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5469:2: ( ruleEString )
            // InternalSecurityDsl.g:5470:3: ruleEString
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
    // InternalSecurityDsl.g:5479:1: rule__Application__GroupAssignment_6 : ( ruleEString ) ;
    public final void rule__Application__GroupAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5483:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5484:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5484:2: ( ruleEString )
            // InternalSecurityDsl.g:5485:3: ruleEString
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
    // InternalSecurityDsl.g:5494:1: rule__Application__PackageNameAssignment_7_1 : ( ruleEString ) ;
    public final void rule__Application__PackageNameAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5498:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5499:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5499:2: ( ruleEString )
            // InternalSecurityDsl.g:5500:3: ruleEString
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
    // InternalSecurityDsl.g:5509:1: rule__Application__DescriptionAssignment_8_1 : ( ruleEString ) ;
    public final void rule__Application__DescriptionAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5513:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5514:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5514:2: ( ruleEString )
            // InternalSecurityDsl.g:5515:3: ruleEString
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
    // InternalSecurityDsl.g:5524:1: rule__Application__PortAssignment_9_1 : ( ruleELongObject ) ;
    public final void rule__Application__PortAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5528:1: ( ( ruleELongObject ) )
            // InternalSecurityDsl.g:5529:2: ( ruleELongObject )
            {
            // InternalSecurityDsl.g:5529:2: ( ruleELongObject )
            // InternalSecurityDsl.g:5530:3: ruleELongObject
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
    // InternalSecurityDsl.g:5539:1: rule__Application__HostnameAssignment_10_1 : ( ruleEString ) ;
    public final void rule__Application__HostnameAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5543:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5544:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5544:2: ( ruleEString )
            // InternalSecurityDsl.g:5545:3: ruleEString
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
    // InternalSecurityDsl.g:5554:1: rule__Application__App_databaseAssignment_11_1 : ( ruleDatabase ) ;
    public final void rule__Application__App_databaseAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5558:1: ( ( ruleDatabase ) )
            // InternalSecurityDsl.g:5559:2: ( ruleDatabase )
            {
            // InternalSecurityDsl.g:5559:2: ( ruleDatabase )
            // InternalSecurityDsl.g:5560:3: ruleDatabase
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
    // InternalSecurityDsl.g:5569:1: rule__Application__App_entitiesAssignment_12_1_1 : ( ruleUser ) ;
    public final void rule__Application__App_entitiesAssignment_12_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5573:1: ( ( ruleUser ) )
            // InternalSecurityDsl.g:5574:2: ( ruleUser )
            {
            // InternalSecurityDsl.g:5574:2: ( ruleUser )
            // InternalSecurityDsl.g:5575:3: ruleUser
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
    // InternalSecurityDsl.g:5584:1: rule__Application__App_entitiesAssignment_12_2_1 : ( ruleRole ) ;
    public final void rule__Application__App_entitiesAssignment_12_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5588:1: ( ( ruleRole ) )
            // InternalSecurityDsl.g:5589:2: ( ruleRole )
            {
            // InternalSecurityDsl.g:5589:2: ( ruleRole )
            // InternalSecurityDsl.g:5590:3: ruleRole
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
    // InternalSecurityDsl.g:5599:1: rule__Application__App_securityAssignment_13_1 : ( ruleSecurity ) ;
    public final void rule__Application__App_securityAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5603:1: ( ( ruleSecurity ) )
            // InternalSecurityDsl.g:5604:2: ( ruleSecurity )
            {
            // InternalSecurityDsl.g:5604:2: ( ruleSecurity )
            // InternalSecurityDsl.g:5605:3: ruleSecurity
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
    // InternalSecurityDsl.g:5614:1: rule__Application__App_controllersAssignment_14_1_1 : ( ruleAuthentication ) ;
    public final void rule__Application__App_controllersAssignment_14_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5618:1: ( ( ruleAuthentication ) )
            // InternalSecurityDsl.g:5619:2: ( ruleAuthentication )
            {
            // InternalSecurityDsl.g:5619:2: ( ruleAuthentication )
            // InternalSecurityDsl.g:5620:3: ruleAuthentication
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
    // InternalSecurityDsl.g:5629:1: rule__Database__VendorNameAssignment_1 : ( ruleEDatabaseType ) ;
    public final void rule__Database__VendorNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5633:1: ( ( ruleEDatabaseType ) )
            // InternalSecurityDsl.g:5634:2: ( ruleEDatabaseType )
            {
            // InternalSecurityDsl.g:5634:2: ( ruleEDatabaseType )
            // InternalSecurityDsl.g:5635:3: ruleEDatabaseType
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
    // InternalSecurityDsl.g:5644:1: rule__Database__UrlAssignment_3 : ( ruleEString ) ;
    public final void rule__Database__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5648:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5649:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5649:2: ( ruleEString )
            // InternalSecurityDsl.g:5650:3: ruleEString
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
    // InternalSecurityDsl.g:5659:1: rule__Database__UsernameAssignment_5 : ( ruleEString ) ;
    public final void rule__Database__UsernameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5663:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5664:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5664:2: ( ruleEString )
            // InternalSecurityDsl.g:5665:3: ruleEString
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
    // InternalSecurityDsl.g:5674:1: rule__Database__PasswordAssignment_7 : ( ruleEString ) ;
    public final void rule__Database__PasswordAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5678:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5679:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5679:2: ( ruleEString )
            // InternalSecurityDsl.g:5680:3: ruleEString
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
    // InternalSecurityDsl.g:5689:1: rule__Attribute__IdentifierAssignment_1 : ( ( 'identifier' ) ) ;
    public final void rule__Attribute__IdentifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5693:1: ( ( ( 'identifier' ) ) )
            // InternalSecurityDsl.g:5694:2: ( ( 'identifier' ) )
            {
            // InternalSecurityDsl.g:5694:2: ( ( 'identifier' ) )
            // InternalSecurityDsl.g:5695:3: ( 'identifier' )
            {
             before(grammarAccess.getAttributeAccess().getIdentifierIdentifierKeyword_1_0()); 
            // InternalSecurityDsl.g:5696:3: ( 'identifier' )
            // InternalSecurityDsl.g:5697:4: 'identifier'
            {
             before(grammarAccess.getAttributeAccess().getIdentifierIdentifierKeyword_1_0()); 
            match(input,79,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5708:1: rule__Attribute__CredentialAssignment_2 : ( ( 'credential' ) ) ;
    public final void rule__Attribute__CredentialAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5712:1: ( ( ( 'credential' ) ) )
            // InternalSecurityDsl.g:5713:2: ( ( 'credential' ) )
            {
            // InternalSecurityDsl.g:5713:2: ( ( 'credential' ) )
            // InternalSecurityDsl.g:5714:3: ( 'credential' )
            {
             before(grammarAccess.getAttributeAccess().getCredentialCredentialKeyword_2_0()); 
            // InternalSecurityDsl.g:5715:3: ( 'credential' )
            // InternalSecurityDsl.g:5716:4: 'credential'
            {
             before(grammarAccess.getAttributeAccess().getCredentialCredentialKeyword_2_0()); 
            match(input,80,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5727:1: rule__Attribute__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5731:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5732:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5732:2: ( ruleEString )
            // InternalSecurityDsl.g:5733:3: ruleEString
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
    // InternalSecurityDsl.g:5742:1: rule__Attribute__TypeAssignment_6 : ( ruleEType ) ;
    public final void rule__Attribute__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5746:1: ( ( ruleEType ) )
            // InternalSecurityDsl.g:5747:2: ( ruleEType )
            {
            // InternalSecurityDsl.g:5747:2: ( ruleEType )
            // InternalSecurityDsl.g:5748:3: ruleEType
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
    // InternalSecurityDsl.g:5757:1: rule__Attribute__CollumnNameAssignment_7_1 : ( ruleEString ) ;
    public final void rule__Attribute__CollumnNameAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5761:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5762:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5762:2: ( ruleEString )
            // InternalSecurityDsl.g:5763:3: ruleEString
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
    // InternalSecurityDsl.g:5772:1: rule__Role__TableNameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__Role__TableNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5776:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5777:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5777:2: ( ruleEString )
            // InternalSecurityDsl.g:5778:3: ruleEString
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
    // InternalSecurityDsl.g:5787:1: rule__Role__Entity_attributesAssignment_2_2 : ( ruleAttribute ) ;
    public final void rule__Role__Entity_attributesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5791:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:5792:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:5792:2: ( ruleAttribute )
            // InternalSecurityDsl.g:5793:3: ruleAttribute
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
    // InternalSecurityDsl.g:5802:1: rule__Role__Entity_attributesAssignment_2_3_1 : ( ruleAttribute ) ;
    public final void rule__Role__Entity_attributesAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5806:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:5807:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:5807:2: ( ruleAttribute )
            // InternalSecurityDsl.g:5808:3: ruleAttribute
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
    // InternalSecurityDsl.g:5817:1: rule__Role__Role_instancesAssignment_3_2 : ( ruleRoleInstance ) ;
    public final void rule__Role__Role_instancesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5821:1: ( ( ruleRoleInstance ) )
            // InternalSecurityDsl.g:5822:2: ( ruleRoleInstance )
            {
            // InternalSecurityDsl.g:5822:2: ( ruleRoleInstance )
            // InternalSecurityDsl.g:5823:3: ruleRoleInstance
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
    // InternalSecurityDsl.g:5832:1: rule__Role__Role_instancesAssignment_3_3_1 : ( ruleRoleInstance ) ;
    public final void rule__Role__Role_instancesAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5836:1: ( ( ruleRoleInstance ) )
            // InternalSecurityDsl.g:5837:2: ( ruleRoleInstance )
            {
            // InternalSecurityDsl.g:5837:2: ( ruleRoleInstance )
            // InternalSecurityDsl.g:5838:3: ruleRoleInstance
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
    // InternalSecurityDsl.g:5847:1: rule__User__TableNameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__User__TableNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5851:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5852:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5852:2: ( ruleEString )
            // InternalSecurityDsl.g:5853:3: ruleEString
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
    // InternalSecurityDsl.g:5862:1: rule__User__Entity_attributesAssignment_2_2 : ( ruleAttribute ) ;
    public final void rule__User__Entity_attributesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5866:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:5867:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:5867:2: ( ruleAttribute )
            // InternalSecurityDsl.g:5868:3: ruleAttribute
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
    // InternalSecurityDsl.g:5877:1: rule__User__Entity_attributesAssignment_2_3_1 : ( ruleAttribute ) ;
    public final void rule__User__Entity_attributesAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5881:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:5882:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:5882:2: ( ruleAttribute )
            // InternalSecurityDsl.g:5883:3: ruleAttribute
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
    // InternalSecurityDsl.g:5892:1: rule__RoleInstance__ClientAssignment_1 : ( ( 'client' ) ) ;
    public final void rule__RoleInstance__ClientAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5896:1: ( ( ( 'client' ) ) )
            // InternalSecurityDsl.g:5897:2: ( ( 'client' ) )
            {
            // InternalSecurityDsl.g:5897:2: ( ( 'client' ) )
            // InternalSecurityDsl.g:5898:3: ( 'client' )
            {
             before(grammarAccess.getRoleInstanceAccess().getClientClientKeyword_1_0()); 
            // InternalSecurityDsl.g:5899:3: ( 'client' )
            // InternalSecurityDsl.g:5900:4: 'client'
            {
             before(grammarAccess.getRoleInstanceAccess().getClientClientKeyword_1_0()); 
            match(input,81,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5911:1: rule__RoleInstance__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RoleInstance__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5915:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5916:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5916:2: ( ruleEString )
            // InternalSecurityDsl.g:5917:3: ruleEString
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
    // InternalSecurityDsl.g:5926:1: rule__Endpoint__TypeAssignment_2 : ( ruleEEndpointType ) ;
    public final void rule__Endpoint__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5930:1: ( ( ruleEEndpointType ) )
            // InternalSecurityDsl.g:5931:2: ( ruleEEndpointType )
            {
            // InternalSecurityDsl.g:5931:2: ( ruleEEndpointType )
            // InternalSecurityDsl.g:5932:3: ruleEEndpointType
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
    // InternalSecurityDsl.g:5941:1: rule__Endpoint__UrlAssignment_4 : ( ruleEString ) ;
    public final void rule__Endpoint__UrlAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5945:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5946:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5946:2: ( ruleEString )
            // InternalSecurityDsl.g:5947:3: ruleEString
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


    // $ANTLR start "rule__Endpoint__MethodNameAssignment_6"
    // InternalSecurityDsl.g:5956:1: rule__Endpoint__MethodNameAssignment_6 : ( ruleEString ) ;
    public final void rule__Endpoint__MethodNameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5960:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5961:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5961:2: ( ruleEString )
            // InternalSecurityDsl.g:5962:3: ruleEString
            {
             before(grammarAccess.getEndpointAccess().getMethodNameEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEndpointAccess().getMethodNameEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__MethodNameAssignment_6"


    // $ANTLR start "rule__Endpoint__MethodAssignment_7_1"
    // InternalSecurityDsl.g:5971:1: rule__Endpoint__MethodAssignment_7_1 : ( ruleEEndpointMethod ) ;
    public final void rule__Endpoint__MethodAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5975:1: ( ( ruleEEndpointMethod ) )
            // InternalSecurityDsl.g:5976:2: ( ruleEEndpointMethod )
            {
            // InternalSecurityDsl.g:5976:2: ( ruleEEndpointMethod )
            // InternalSecurityDsl.g:5977:3: ruleEEndpointMethod
            {
             before(grammarAccess.getEndpointAccess().getMethodEEndpointMethodEnumRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEEndpointMethod();

            state._fsp--;

             after(grammarAccess.getEndpointAccess().getMethodEEndpointMethodEnumRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__MethodAssignment_7_1"


    // $ANTLR start "rule__Endpoint__Role_authoritiesAssignment_8_2"
    // InternalSecurityDsl.g:5986:1: rule__Endpoint__Role_authoritiesAssignment_8_2 : ( ( ruleEString ) ) ;
    public final void rule__Endpoint__Role_authoritiesAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5990:1: ( ( ( ruleEString ) ) )
            // InternalSecurityDsl.g:5991:2: ( ( ruleEString ) )
            {
            // InternalSecurityDsl.g:5991:2: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5992:3: ( ruleEString )
            {
             before(grammarAccess.getEndpointAccess().getRole_authoritiesRoleInstanceCrossReference_8_2_0()); 
            // InternalSecurityDsl.g:5993:3: ( ruleEString )
            // InternalSecurityDsl.g:5994:4: ruleEString
            {
             before(grammarAccess.getEndpointAccess().getRole_authoritiesRoleInstanceEStringParserRuleCall_8_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEndpointAccess().getRole_authoritiesRoleInstanceEStringParserRuleCall_8_2_0_1()); 

            }

             after(grammarAccess.getEndpointAccess().getRole_authoritiesRoleInstanceCrossReference_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Role_authoritiesAssignment_8_2"


    // $ANTLR start "rule__Endpoint__Role_authoritiesAssignment_8_3_1"
    // InternalSecurityDsl.g:6005:1: rule__Endpoint__Role_authoritiesAssignment_8_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Endpoint__Role_authoritiesAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6009:1: ( ( ( ruleEString ) ) )
            // InternalSecurityDsl.g:6010:2: ( ( ruleEString ) )
            {
            // InternalSecurityDsl.g:6010:2: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6011:3: ( ruleEString )
            {
             before(grammarAccess.getEndpointAccess().getRole_authoritiesRoleInstanceCrossReference_8_3_1_0()); 
            // InternalSecurityDsl.g:6012:3: ( ruleEString )
            // InternalSecurityDsl.g:6013:4: ruleEString
            {
             before(grammarAccess.getEndpointAccess().getRole_authoritiesRoleInstanceEStringParserRuleCall_8_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEndpointAccess().getRole_authoritiesRoleInstanceEStringParserRuleCall_8_3_1_0_1()); 

            }

             after(grammarAccess.getEndpointAccess().getRole_authoritiesRoleInstanceCrossReference_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Role_authoritiesAssignment_8_3_1"


    // $ANTLR start "rule__Authentication__NameAssignment_2"
    // InternalSecurityDsl.g:6024:1: rule__Authentication__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Authentication__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6028:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6029:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6029:2: ( ruleEString )
            // InternalSecurityDsl.g:6030:3: ruleEString
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
    // InternalSecurityDsl.g:6039:1: rule__Authentication__PathAssignment_4 : ( ruleEString ) ;
    public final void rule__Authentication__PathAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6043:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6044:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6044:2: ( ruleEString )
            // InternalSecurityDsl.g:6045:3: ruleEString
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
    // InternalSecurityDsl.g:6054:1: rule__Authentication__Controller_endpointsAssignment_5_2 : ( ruleEndpoint ) ;
    public final void rule__Authentication__Controller_endpointsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6058:1: ( ( ruleEndpoint ) )
            // InternalSecurityDsl.g:6059:2: ( ruleEndpoint )
            {
            // InternalSecurityDsl.g:6059:2: ( ruleEndpoint )
            // InternalSecurityDsl.g:6060:3: ruleEndpoint
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
    // InternalSecurityDsl.g:6069:1: rule__Authentication__Controller_endpointsAssignment_5_3_1 : ( ruleEndpoint ) ;
    public final void rule__Authentication__Controller_endpointsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6073:1: ( ( ruleEndpoint ) )
            // InternalSecurityDsl.g:6074:2: ( ruleEndpoint )
            {
            // InternalSecurityDsl.g:6074:2: ( ruleEndpoint )
            // InternalSecurityDsl.g:6075:3: ruleEndpoint
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


    // $ANTLR start "rule__JWT__SignatureAlgorithmAssignment_2"
    // InternalSecurityDsl.g:6084:1: rule__JWT__SignatureAlgorithmAssignment_2 : ( ruleEString ) ;
    public final void rule__JWT__SignatureAlgorithmAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6088:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6089:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6089:2: ( ruleEString )
            // InternalSecurityDsl.g:6090:3: ruleEString
            {
             before(grammarAccess.getJWTAccess().getSignatureAlgorithmEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getJWTAccess().getSignatureAlgorithmEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JWT__SignatureAlgorithmAssignment_2"


    // $ANTLR start "rule__JWT__SecretAssignment_4"
    // InternalSecurityDsl.g:6099:1: rule__JWT__SecretAssignment_4 : ( ruleEString ) ;
    public final void rule__JWT__SecretAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6103:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6104:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6104:2: ( ruleEString )
            // InternalSecurityDsl.g:6105:3: ruleEString
            {
             before(grammarAccess.getJWTAccess().getSecretEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getJWTAccess().getSecretEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JWT__SecretAssignment_4"


    // $ANTLR start "rule__JWT__ClaimsAssignment_7"
    // InternalSecurityDsl.g:6114:1: rule__JWT__ClaimsAssignment_7 : ( ruleClaim ) ;
    public final void rule__JWT__ClaimsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6118:1: ( ( ruleClaim ) )
            // InternalSecurityDsl.g:6119:2: ( ruleClaim )
            {
            // InternalSecurityDsl.g:6119:2: ( ruleClaim )
            // InternalSecurityDsl.g:6120:3: ruleClaim
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
    // InternalSecurityDsl.g:6129:1: rule__JWT__ClaimsAssignment_8_1 : ( ruleClaim ) ;
    public final void rule__JWT__ClaimsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6133:1: ( ( ruleClaim ) )
            // InternalSecurityDsl.g:6134:2: ( ruleClaim )
            {
            // InternalSecurityDsl.g:6134:2: ( ruleClaim )
            // InternalSecurityDsl.g:6135:3: ruleClaim
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


    // $ANTLR start "rule__Claim__TypeAssignment_1"
    // InternalSecurityDsl.g:6144:1: rule__Claim__TypeAssignment_1 : ( ruleEClaimType ) ;
    public final void rule__Claim__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6148:1: ( ( ruleEClaimType ) )
            // InternalSecurityDsl.g:6149:2: ( ruleEClaimType )
            {
            // InternalSecurityDsl.g:6149:2: ( ruleEClaimType )
            // InternalSecurityDsl.g:6150:3: ruleEClaimType
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
    // InternalSecurityDsl.g:6159:1: rule__Claim__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Claim__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6163:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6164:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6164:2: ( ruleEString )
            // InternalSecurityDsl.g:6165:3: ruleEString
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
    // InternalSecurityDsl.g:6174:1: rule__Claim__ValueAssignment_5 : ( ruleEString ) ;
    public final void rule__Claim__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6178:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6179:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6179:2: ( ruleEString )
            // InternalSecurityDsl.g:6180:3: ruleEString
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
    // InternalSecurityDsl.g:6189:1: rule__Claim__Claim_attributeAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Claim__Claim_attributeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6193:1: ( ( ( ruleEString ) ) )
            // InternalSecurityDsl.g:6194:2: ( ( ruleEString ) )
            {
            // InternalSecurityDsl.g:6194:2: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6195:3: ( ruleEString )
            {
             before(grammarAccess.getClaimAccess().getClaim_attributeAttributeCrossReference_6_1_0()); 
            // InternalSecurityDsl.g:6196:3: ( ruleEString )
            // InternalSecurityDsl.g:6197:4: ruleEString
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
    // InternalSecurityDsl.g:6208:1: rule__OAuth2__ProvidersAssignment_3 : ( ruleProvider ) ;
    public final void rule__OAuth2__ProvidersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6212:1: ( ( ruleProvider ) )
            // InternalSecurityDsl.g:6213:2: ( ruleProvider )
            {
            // InternalSecurityDsl.g:6213:2: ( ruleProvider )
            // InternalSecurityDsl.g:6214:3: ruleProvider
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
    // InternalSecurityDsl.g:6223:1: rule__OAuth2__ProvidersAssignment_4_1 : ( ruleProvider ) ;
    public final void rule__OAuth2__ProvidersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6227:1: ( ( ruleProvider ) )
            // InternalSecurityDsl.g:6228:2: ( ruleProvider )
            {
            // InternalSecurityDsl.g:6228:2: ( ruleProvider )
            // InternalSecurityDsl.g:6229:3: ruleProvider
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
    // InternalSecurityDsl.g:6238:1: rule__Provider__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Provider__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6242:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6243:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6243:2: ( ruleEString )
            // InternalSecurityDsl.g:6244:3: ruleEString
            {
             before(grammarAccess.getProviderAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProviderAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:6253:1: rule__Provider__ClientIdAssignment_5 : ( ruleEString ) ;
    public final void rule__Provider__ClientIdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6257:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6258:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6258:2: ( ruleEString )
            // InternalSecurityDsl.g:6259:3: ruleEString
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
    // InternalSecurityDsl.g:6268:1: rule__Provider__ClientSecretAssignment_8 : ( ruleEString ) ;
    public final void rule__Provider__ClientSecretAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6272:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6273:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6273:2: ( ruleEString )
            // InternalSecurityDsl.g:6274:3: ruleEString
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
    // InternalSecurityDsl.g:6283:1: rule__Provider__RedirectUriAssignment_9_2 : ( ruleEString ) ;
    public final void rule__Provider__RedirectUriAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6287:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6288:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6288:2: ( ruleEString )
            // InternalSecurityDsl.g:6289:3: ruleEString
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000033F000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0008000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x2300000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004208L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000001FC000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000030L,0x0000000000020000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x8040000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0040000000000030L,0x0000000000000100L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x1040000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});

}