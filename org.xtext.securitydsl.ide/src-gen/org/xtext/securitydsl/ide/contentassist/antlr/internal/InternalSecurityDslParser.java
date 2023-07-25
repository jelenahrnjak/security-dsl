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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PostgreSQL'", "'Oracle'", "'MySQL'", "'String'", "'Float'", "'Long'", "'Integer'", "'char'", "'Double'", "'DateTime'", "'Date'", "'int'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'REGISTRATION'", "'LOGIN'", "'LOGOUT'", "'OTHER'", "'PRIVATE'", "'PUBLIC'", "'REGISTERED'", "'application:'", "'artifact:'", "'name:'", "'group:'", "'packageName:'", "'description:'", "'port:'", "'hostname:'", "'database:'", "'model:'", "'user:'", "'role:'", "'security:'", "'controller:'", "'auth:'", "'vendor:'", "'url:'", "'username:'", "'password:'", "'-'", "'{'", "'type:'", "'}'", "'collumnName:'", "'tableName:'", "'attributes:'", "'['", "']'", "','", "'roles:'", "'functionName:'", "'method:'", "'roleAuthorities:'", "'path:'", "'endpoints:'", "'jwt:'", "'header:'", "'signatureAlgorithm:'", "'payload:'", "'claims:'", "'signature:'", "'secret:'", "':'", "'REGISTERED,'", "'expirationTime:'", "'issuer:'", "'audience:'", "'OAuth2.0'", "'basicAuthentication'", "'identifier'", "'credential'"
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
    public static final int T__84=84;
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


    // $ANTLR start "rule__Security__Alternatives"
    // InternalSecurityDsl.g:557:1: rule__Security__Alternatives : ( ( ruleJWT ) | ( ruleOAuth2 ) | ( ruleBasicAuthentication ) );
    public final void rule__Security__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:561:1: ( ( ruleJWT ) | ( ruleOAuth2 ) | ( ruleBasicAuthentication ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt1=1;
                }
                break;
            case 81:
                {
                alt1=2;
                }
                break;
            case 82:
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
                    // InternalSecurityDsl.g:562:2: ( ruleJWT )
                    {
                    // InternalSecurityDsl.g:562:2: ( ruleJWT )
                    // InternalSecurityDsl.g:563:3: ruleJWT
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
                    // InternalSecurityDsl.g:568:2: ( ruleOAuth2 )
                    {
                    // InternalSecurityDsl.g:568:2: ( ruleOAuth2 )
                    // InternalSecurityDsl.g:569:3: ruleOAuth2
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
                    // InternalSecurityDsl.g:574:2: ( ruleBasicAuthentication )
                    {
                    // InternalSecurityDsl.g:574:2: ( ruleBasicAuthentication )
                    // InternalSecurityDsl.g:575:3: ruleBasicAuthentication
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
    // InternalSecurityDsl.g:584:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:588:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalSecurityDsl.g:589:2: ( RULE_STRING )
                    {
                    // InternalSecurityDsl.g:589:2: ( RULE_STRING )
                    // InternalSecurityDsl.g:590:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:595:2: ( RULE_ID )
                    {
                    // InternalSecurityDsl.g:595:2: ( RULE_ID )
                    // InternalSecurityDsl.g:596:3: RULE_ID
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
    // InternalSecurityDsl.g:605:1: rule__EDatabaseType__Alternatives : ( ( ( 'PostgreSQL' ) ) | ( ( 'Oracle' ) ) | ( ( 'MySQL' ) ) );
    public final void rule__EDatabaseType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:609:1: ( ( ( 'PostgreSQL' ) ) | ( ( 'Oracle' ) ) | ( ( 'MySQL' ) ) )
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
                    // InternalSecurityDsl.g:610:2: ( ( 'PostgreSQL' ) )
                    {
                    // InternalSecurityDsl.g:610:2: ( ( 'PostgreSQL' ) )
                    // InternalSecurityDsl.g:611:3: ( 'PostgreSQL' )
                    {
                     before(grammarAccess.getEDatabaseTypeAccess().getPostgreSQLEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:612:3: ( 'PostgreSQL' )
                    // InternalSecurityDsl.g:612:4: 'PostgreSQL'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getEDatabaseTypeAccess().getPostgreSQLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:616:2: ( ( 'Oracle' ) )
                    {
                    // InternalSecurityDsl.g:616:2: ( ( 'Oracle' ) )
                    // InternalSecurityDsl.g:617:3: ( 'Oracle' )
                    {
                     before(grammarAccess.getEDatabaseTypeAccess().getOracleEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:618:3: ( 'Oracle' )
                    // InternalSecurityDsl.g:618:4: 'Oracle'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getEDatabaseTypeAccess().getOracleEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:622:2: ( ( 'MySQL' ) )
                    {
                    // InternalSecurityDsl.g:622:2: ( ( 'MySQL' ) )
                    // InternalSecurityDsl.g:623:3: ( 'MySQL' )
                    {
                     before(grammarAccess.getEDatabaseTypeAccess().getMySQLEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:624:3: ( 'MySQL' )
                    // InternalSecurityDsl.g:624:4: 'MySQL'
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
    // InternalSecurityDsl.g:632:1: rule__EType__Alternatives : ( ( ( 'String' ) ) | ( ( 'Float' ) ) | ( ( 'Long' ) ) | ( ( 'Integer' ) ) | ( ( 'char' ) ) | ( ( 'Double' ) ) | ( ( 'DateTime' ) ) | ( ( 'Date' ) ) | ( ( 'int' ) ) );
    public final void rule__EType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:636:1: ( ( ( 'String' ) ) | ( ( 'Float' ) ) | ( ( 'Long' ) ) | ( ( 'Integer' ) ) | ( ( 'char' ) ) | ( ( 'Double' ) ) | ( ( 'DateTime' ) ) | ( ( 'Date' ) ) | ( ( 'int' ) ) )
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
                    // InternalSecurityDsl.g:637:2: ( ( 'String' ) )
                    {
                    // InternalSecurityDsl.g:637:2: ( ( 'String' ) )
                    // InternalSecurityDsl.g:638:3: ( 'String' )
                    {
                     before(grammarAccess.getETypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:639:3: ( 'String' )
                    // InternalSecurityDsl.g:639:4: 'String'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:643:2: ( ( 'Float' ) )
                    {
                    // InternalSecurityDsl.g:643:2: ( ( 'Float' ) )
                    // InternalSecurityDsl.g:644:3: ( 'Float' )
                    {
                     before(grammarAccess.getETypeAccess().getFloatEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:645:3: ( 'Float' )
                    // InternalSecurityDsl.g:645:4: 'Float'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getFloatEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:649:2: ( ( 'Long' ) )
                    {
                    // InternalSecurityDsl.g:649:2: ( ( 'Long' ) )
                    // InternalSecurityDsl.g:650:3: ( 'Long' )
                    {
                     before(grammarAccess.getETypeAccess().getLongEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:651:3: ( 'Long' )
                    // InternalSecurityDsl.g:651:4: 'Long'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getLongEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:655:2: ( ( 'Integer' ) )
                    {
                    // InternalSecurityDsl.g:655:2: ( ( 'Integer' ) )
                    // InternalSecurityDsl.g:656:3: ( 'Integer' )
                    {
                     before(grammarAccess.getETypeAccess().getIntegerEnumLiteralDeclaration_3()); 
                    // InternalSecurityDsl.g:657:3: ( 'Integer' )
                    // InternalSecurityDsl.g:657:4: 'Integer'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getIntegerEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSecurityDsl.g:661:2: ( ( 'char' ) )
                    {
                    // InternalSecurityDsl.g:661:2: ( ( 'char' ) )
                    // InternalSecurityDsl.g:662:3: ( 'char' )
                    {
                     before(grammarAccess.getETypeAccess().getCharEnumLiteralDeclaration_4()); 
                    // InternalSecurityDsl.g:663:3: ( 'char' )
                    // InternalSecurityDsl.g:663:4: 'char'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getCharEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSecurityDsl.g:667:2: ( ( 'Double' ) )
                    {
                    // InternalSecurityDsl.g:667:2: ( ( 'Double' ) )
                    // InternalSecurityDsl.g:668:3: ( 'Double' )
                    {
                     before(grammarAccess.getETypeAccess().getDoubleEnumLiteralDeclaration_5()); 
                    // InternalSecurityDsl.g:669:3: ( 'Double' )
                    // InternalSecurityDsl.g:669:4: 'Double'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getDoubleEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSecurityDsl.g:673:2: ( ( 'DateTime' ) )
                    {
                    // InternalSecurityDsl.g:673:2: ( ( 'DateTime' ) )
                    // InternalSecurityDsl.g:674:3: ( 'DateTime' )
                    {
                     before(grammarAccess.getETypeAccess().getDateTimeEnumLiteralDeclaration_6()); 
                    // InternalSecurityDsl.g:675:3: ( 'DateTime' )
                    // InternalSecurityDsl.g:675:4: 'DateTime'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getDateTimeEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSecurityDsl.g:679:2: ( ( 'Date' ) )
                    {
                    // InternalSecurityDsl.g:679:2: ( ( 'Date' ) )
                    // InternalSecurityDsl.g:680:3: ( 'Date' )
                    {
                     before(grammarAccess.getETypeAccess().getDateEnumLiteralDeclaration_7()); 
                    // InternalSecurityDsl.g:681:3: ( 'Date' )
                    // InternalSecurityDsl.g:681:4: 'Date'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getDateEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSecurityDsl.g:685:2: ( ( 'int' ) )
                    {
                    // InternalSecurityDsl.g:685:2: ( ( 'int' ) )
                    // InternalSecurityDsl.g:686:3: ( 'int' )
                    {
                     before(grammarAccess.getETypeAccess().getIntEnumLiteralDeclaration_8()); 
                    // InternalSecurityDsl.g:687:3: ( 'int' )
                    // InternalSecurityDsl.g:687:4: 'int'
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
    // InternalSecurityDsl.g:695:1: rule__EEndpointMethod__Alternatives : ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) );
    public final void rule__EEndpointMethod__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:699:1: ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) )
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
                    // InternalSecurityDsl.g:700:2: ( ( 'GET' ) )
                    {
                    // InternalSecurityDsl.g:700:2: ( ( 'GET' ) )
                    // InternalSecurityDsl.g:701:3: ( 'GET' )
                    {
                     before(grammarAccess.getEEndpointMethodAccess().getGETEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:702:3: ( 'GET' )
                    // InternalSecurityDsl.g:702:4: 'GET'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointMethodAccess().getGETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:706:2: ( ( 'POST' ) )
                    {
                    // InternalSecurityDsl.g:706:2: ( ( 'POST' ) )
                    // InternalSecurityDsl.g:707:3: ( 'POST' )
                    {
                     before(grammarAccess.getEEndpointMethodAccess().getPOSTEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:708:3: ( 'POST' )
                    // InternalSecurityDsl.g:708:4: 'POST'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointMethodAccess().getPOSTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:712:2: ( ( 'PUT' ) )
                    {
                    // InternalSecurityDsl.g:712:2: ( ( 'PUT' ) )
                    // InternalSecurityDsl.g:713:3: ( 'PUT' )
                    {
                     before(grammarAccess.getEEndpointMethodAccess().getPUTEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:714:3: ( 'PUT' )
                    // InternalSecurityDsl.g:714:4: 'PUT'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointMethodAccess().getPUTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:718:2: ( ( 'DELETE' ) )
                    {
                    // InternalSecurityDsl.g:718:2: ( ( 'DELETE' ) )
                    // InternalSecurityDsl.g:719:3: ( 'DELETE' )
                    {
                     before(grammarAccess.getEEndpointMethodAccess().getDELETEEnumLiteralDeclaration_3()); 
                    // InternalSecurityDsl.g:720:3: ( 'DELETE' )
                    // InternalSecurityDsl.g:720:4: 'DELETE'
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
    // InternalSecurityDsl.g:728:1: rule__EEndpointType__Alternatives : ( ( ( 'REGISTRATION' ) ) | ( ( 'LOGIN' ) ) | ( ( 'LOGOUT' ) ) | ( ( 'OTHER' ) ) );
    public final void rule__EEndpointType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:732:1: ( ( ( 'REGISTRATION' ) ) | ( ( 'LOGIN' ) ) | ( ( 'LOGOUT' ) ) | ( ( 'OTHER' ) ) )
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
                    // InternalSecurityDsl.g:733:2: ( ( 'REGISTRATION' ) )
                    {
                    // InternalSecurityDsl.g:733:2: ( ( 'REGISTRATION' ) )
                    // InternalSecurityDsl.g:734:3: ( 'REGISTRATION' )
                    {
                     before(grammarAccess.getEEndpointTypeAccess().getREGISTRATIONEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:735:3: ( 'REGISTRATION' )
                    // InternalSecurityDsl.g:735:4: 'REGISTRATION'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointTypeAccess().getREGISTRATIONEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:739:2: ( ( 'LOGIN' ) )
                    {
                    // InternalSecurityDsl.g:739:2: ( ( 'LOGIN' ) )
                    // InternalSecurityDsl.g:740:3: ( 'LOGIN' )
                    {
                     before(grammarAccess.getEEndpointTypeAccess().getLOGINEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:741:3: ( 'LOGIN' )
                    // InternalSecurityDsl.g:741:4: 'LOGIN'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointTypeAccess().getLOGINEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:745:2: ( ( 'LOGOUT' ) )
                    {
                    // InternalSecurityDsl.g:745:2: ( ( 'LOGOUT' ) )
                    // InternalSecurityDsl.g:746:3: ( 'LOGOUT' )
                    {
                     before(grammarAccess.getEEndpointTypeAccess().getLOGOUTEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:747:3: ( 'LOGOUT' )
                    // InternalSecurityDsl.g:747:4: 'LOGOUT'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointTypeAccess().getLOGOUTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:751:2: ( ( 'OTHER' ) )
                    {
                    // InternalSecurityDsl.g:751:2: ( ( 'OTHER' ) )
                    // InternalSecurityDsl.g:752:3: ( 'OTHER' )
                    {
                     before(grammarAccess.getEEndpointTypeAccess().getOTHEREnumLiteralDeclaration_3()); 
                    // InternalSecurityDsl.g:753:3: ( 'OTHER' )
                    // InternalSecurityDsl.g:753:4: 'OTHER'
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
    // InternalSecurityDsl.g:761:1: rule__EClaimType__Alternatives : ( ( ( 'PRIVATE' ) ) | ( ( 'PUBLIC' ) ) | ( ( 'REGISTERED' ) ) );
    public final void rule__EClaimType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:765:1: ( ( ( 'PRIVATE' ) ) | ( ( 'PUBLIC' ) ) | ( ( 'REGISTERED' ) ) )
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
                    // InternalSecurityDsl.g:766:2: ( ( 'PRIVATE' ) )
                    {
                    // InternalSecurityDsl.g:766:2: ( ( 'PRIVATE' ) )
                    // InternalSecurityDsl.g:767:3: ( 'PRIVATE' )
                    {
                     before(grammarAccess.getEClaimTypeAccess().getPRIVATEEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:768:3: ( 'PRIVATE' )
                    // InternalSecurityDsl.g:768:4: 'PRIVATE'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getEClaimTypeAccess().getPRIVATEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:772:2: ( ( 'PUBLIC' ) )
                    {
                    // InternalSecurityDsl.g:772:2: ( ( 'PUBLIC' ) )
                    // InternalSecurityDsl.g:773:3: ( 'PUBLIC' )
                    {
                     before(grammarAccess.getEClaimTypeAccess().getPUBLICEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:774:3: ( 'PUBLIC' )
                    // InternalSecurityDsl.g:774:4: 'PUBLIC'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getEClaimTypeAccess().getPUBLICEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:778:2: ( ( 'REGISTERED' ) )
                    {
                    // InternalSecurityDsl.g:778:2: ( ( 'REGISTERED' ) )
                    // InternalSecurityDsl.g:779:3: ( 'REGISTERED' )
                    {
                     before(grammarAccess.getEClaimTypeAccess().getREGISTEREDEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:780:3: ( 'REGISTERED' )
                    // InternalSecurityDsl.g:780:4: 'REGISTERED'
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
    // InternalSecurityDsl.g:788:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:792:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // InternalSecurityDsl.g:793:2: rule__Application__Group__0__Impl rule__Application__Group__1
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
    // InternalSecurityDsl.g:800:1: rule__Application__Group__0__Impl : ( () ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:804:1: ( ( () ) )
            // InternalSecurityDsl.g:805:1: ( () )
            {
            // InternalSecurityDsl.g:805:1: ( () )
            // InternalSecurityDsl.g:806:2: ()
            {
             before(grammarAccess.getApplicationAccess().getApplicationAction_0()); 
            // InternalSecurityDsl.g:807:2: ()
            // InternalSecurityDsl.g:807:3: 
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
    // InternalSecurityDsl.g:815:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:819:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // InternalSecurityDsl.g:820:2: rule__Application__Group__1__Impl rule__Application__Group__2
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
    // InternalSecurityDsl.g:827:1: rule__Application__Group__1__Impl : ( 'application:' ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:831:1: ( ( 'application:' ) )
            // InternalSecurityDsl.g:832:1: ( 'application:' )
            {
            // InternalSecurityDsl.g:832:1: ( 'application:' )
            // InternalSecurityDsl.g:833:2: 'application:'
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
    // InternalSecurityDsl.g:842:1: rule__Application__Group__2 : rule__Application__Group__2__Impl rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:846:1: ( rule__Application__Group__2__Impl rule__Application__Group__3 )
            // InternalSecurityDsl.g:847:2: rule__Application__Group__2__Impl rule__Application__Group__3
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
    // InternalSecurityDsl.g:854:1: rule__Application__Group__2__Impl : ( ( rule__Application__Group_2__0 )? ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:858:1: ( ( ( rule__Application__Group_2__0 )? ) )
            // InternalSecurityDsl.g:859:1: ( ( rule__Application__Group_2__0 )? )
            {
            // InternalSecurityDsl.g:859:1: ( ( rule__Application__Group_2__0 )? )
            // InternalSecurityDsl.g:860:2: ( rule__Application__Group_2__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_2()); 
            // InternalSecurityDsl.g:861:2: ( rule__Application__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==35) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSecurityDsl.g:861:3: rule__Application__Group_2__0
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
    // InternalSecurityDsl.g:869:1: rule__Application__Group__3 : rule__Application__Group__3__Impl rule__Application__Group__4 ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:873:1: ( rule__Application__Group__3__Impl rule__Application__Group__4 )
            // InternalSecurityDsl.g:874:2: rule__Application__Group__3__Impl rule__Application__Group__4
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
    // InternalSecurityDsl.g:881:1: rule__Application__Group__3__Impl : ( ( rule__Application__Group_3__0 )? ) ;
    public final void rule__Application__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:885:1: ( ( ( rule__Application__Group_3__0 )? ) )
            // InternalSecurityDsl.g:886:1: ( ( rule__Application__Group_3__0 )? )
            {
            // InternalSecurityDsl.g:886:1: ( ( rule__Application__Group_3__0 )? )
            // InternalSecurityDsl.g:887:2: ( rule__Application__Group_3__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_3()); 
            // InternalSecurityDsl.g:888:2: ( rule__Application__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==36) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSecurityDsl.g:888:3: rule__Application__Group_3__0
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
    // InternalSecurityDsl.g:896:1: rule__Application__Group__4 : rule__Application__Group__4__Impl rule__Application__Group__5 ;
    public final void rule__Application__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:900:1: ( rule__Application__Group__4__Impl rule__Application__Group__5 )
            // InternalSecurityDsl.g:901:2: rule__Application__Group__4__Impl rule__Application__Group__5
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
    // InternalSecurityDsl.g:908:1: rule__Application__Group__4__Impl : ( ( rule__Application__Group_4__0 )? ) ;
    public final void rule__Application__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:912:1: ( ( ( rule__Application__Group_4__0 )? ) )
            // InternalSecurityDsl.g:913:1: ( ( rule__Application__Group_4__0 )? )
            {
            // InternalSecurityDsl.g:913:1: ( ( rule__Application__Group_4__0 )? )
            // InternalSecurityDsl.g:914:2: ( rule__Application__Group_4__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_4()); 
            // InternalSecurityDsl.g:915:2: ( rule__Application__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==37) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSecurityDsl.g:915:3: rule__Application__Group_4__0
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
    // InternalSecurityDsl.g:923:1: rule__Application__Group__5 : rule__Application__Group__5__Impl rule__Application__Group__6 ;
    public final void rule__Application__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:927:1: ( rule__Application__Group__5__Impl rule__Application__Group__6 )
            // InternalSecurityDsl.g:928:2: rule__Application__Group__5__Impl rule__Application__Group__6
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
    // InternalSecurityDsl.g:935:1: rule__Application__Group__5__Impl : ( ( rule__Application__Group_5__0 )? ) ;
    public final void rule__Application__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:939:1: ( ( ( rule__Application__Group_5__0 )? ) )
            // InternalSecurityDsl.g:940:1: ( ( rule__Application__Group_5__0 )? )
            {
            // InternalSecurityDsl.g:940:1: ( ( rule__Application__Group_5__0 )? )
            // InternalSecurityDsl.g:941:2: ( rule__Application__Group_5__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_5()); 
            // InternalSecurityDsl.g:942:2: ( rule__Application__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==38) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSecurityDsl.g:942:3: rule__Application__Group_5__0
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
    // InternalSecurityDsl.g:950:1: rule__Application__Group__6 : rule__Application__Group__6__Impl rule__Application__Group__7 ;
    public final void rule__Application__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:954:1: ( rule__Application__Group__6__Impl rule__Application__Group__7 )
            // InternalSecurityDsl.g:955:2: rule__Application__Group__6__Impl rule__Application__Group__7
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
    // InternalSecurityDsl.g:962:1: rule__Application__Group__6__Impl : ( ( rule__Application__Group_6__0 )? ) ;
    public final void rule__Application__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:966:1: ( ( ( rule__Application__Group_6__0 )? ) )
            // InternalSecurityDsl.g:967:1: ( ( rule__Application__Group_6__0 )? )
            {
            // InternalSecurityDsl.g:967:1: ( ( rule__Application__Group_6__0 )? )
            // InternalSecurityDsl.g:968:2: ( rule__Application__Group_6__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_6()); 
            // InternalSecurityDsl.g:969:2: ( rule__Application__Group_6__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==39) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSecurityDsl.g:969:3: rule__Application__Group_6__0
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
    // InternalSecurityDsl.g:977:1: rule__Application__Group__7 : rule__Application__Group__7__Impl rule__Application__Group__8 ;
    public final void rule__Application__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:981:1: ( rule__Application__Group__7__Impl rule__Application__Group__8 )
            // InternalSecurityDsl.g:982:2: rule__Application__Group__7__Impl rule__Application__Group__8
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
    // InternalSecurityDsl.g:989:1: rule__Application__Group__7__Impl : ( ( rule__Application__Group_7__0 )? ) ;
    public final void rule__Application__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:993:1: ( ( ( rule__Application__Group_7__0 )? ) )
            // InternalSecurityDsl.g:994:1: ( ( rule__Application__Group_7__0 )? )
            {
            // InternalSecurityDsl.g:994:1: ( ( rule__Application__Group_7__0 )? )
            // InternalSecurityDsl.g:995:2: ( rule__Application__Group_7__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_7()); 
            // InternalSecurityDsl.g:996:2: ( rule__Application__Group_7__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==40) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSecurityDsl.g:996:3: rule__Application__Group_7__0
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
    // InternalSecurityDsl.g:1004:1: rule__Application__Group__8 : rule__Application__Group__8__Impl rule__Application__Group__9 ;
    public final void rule__Application__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1008:1: ( rule__Application__Group__8__Impl rule__Application__Group__9 )
            // InternalSecurityDsl.g:1009:2: rule__Application__Group__8__Impl rule__Application__Group__9
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
    // InternalSecurityDsl.g:1016:1: rule__Application__Group__8__Impl : ( ( rule__Application__Group_8__0 )? ) ;
    public final void rule__Application__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1020:1: ( ( ( rule__Application__Group_8__0 )? ) )
            // InternalSecurityDsl.g:1021:1: ( ( rule__Application__Group_8__0 )? )
            {
            // InternalSecurityDsl.g:1021:1: ( ( rule__Application__Group_8__0 )? )
            // InternalSecurityDsl.g:1022:2: ( rule__Application__Group_8__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_8()); 
            // InternalSecurityDsl.g:1023:2: ( rule__Application__Group_8__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==41) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSecurityDsl.g:1023:3: rule__Application__Group_8__0
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
    // InternalSecurityDsl.g:1031:1: rule__Application__Group__9 : rule__Application__Group__9__Impl rule__Application__Group__10 ;
    public final void rule__Application__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1035:1: ( rule__Application__Group__9__Impl rule__Application__Group__10 )
            // InternalSecurityDsl.g:1036:2: rule__Application__Group__9__Impl rule__Application__Group__10
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
    // InternalSecurityDsl.g:1043:1: rule__Application__Group__9__Impl : ( ( rule__Application__Group_9__0 )? ) ;
    public final void rule__Application__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1047:1: ( ( ( rule__Application__Group_9__0 )? ) )
            // InternalSecurityDsl.g:1048:1: ( ( rule__Application__Group_9__0 )? )
            {
            // InternalSecurityDsl.g:1048:1: ( ( rule__Application__Group_9__0 )? )
            // InternalSecurityDsl.g:1049:2: ( rule__Application__Group_9__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_9()); 
            // InternalSecurityDsl.g:1050:2: ( rule__Application__Group_9__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==42) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSecurityDsl.g:1050:3: rule__Application__Group_9__0
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
    // InternalSecurityDsl.g:1058:1: rule__Application__Group__10 : rule__Application__Group__10__Impl rule__Application__Group__11 ;
    public final void rule__Application__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1062:1: ( rule__Application__Group__10__Impl rule__Application__Group__11 )
            // InternalSecurityDsl.g:1063:2: rule__Application__Group__10__Impl rule__Application__Group__11
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
    // InternalSecurityDsl.g:1070:1: rule__Application__Group__10__Impl : ( ( rule__Application__Group_10__0 )? ) ;
    public final void rule__Application__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1074:1: ( ( ( rule__Application__Group_10__0 )? ) )
            // InternalSecurityDsl.g:1075:1: ( ( rule__Application__Group_10__0 )? )
            {
            // InternalSecurityDsl.g:1075:1: ( ( rule__Application__Group_10__0 )? )
            // InternalSecurityDsl.g:1076:2: ( rule__Application__Group_10__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_10()); 
            // InternalSecurityDsl.g:1077:2: ( rule__Application__Group_10__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==43) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSecurityDsl.g:1077:3: rule__Application__Group_10__0
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
    // InternalSecurityDsl.g:1085:1: rule__Application__Group__11 : rule__Application__Group__11__Impl rule__Application__Group__12 ;
    public final void rule__Application__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1089:1: ( rule__Application__Group__11__Impl rule__Application__Group__12 )
            // InternalSecurityDsl.g:1090:2: rule__Application__Group__11__Impl rule__Application__Group__12
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
    // InternalSecurityDsl.g:1097:1: rule__Application__Group__11__Impl : ( ( rule__Application__Group_11__0 )? ) ;
    public final void rule__Application__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1101:1: ( ( ( rule__Application__Group_11__0 )? ) )
            // InternalSecurityDsl.g:1102:1: ( ( rule__Application__Group_11__0 )? )
            {
            // InternalSecurityDsl.g:1102:1: ( ( rule__Application__Group_11__0 )? )
            // InternalSecurityDsl.g:1103:2: ( rule__Application__Group_11__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_11()); 
            // InternalSecurityDsl.g:1104:2: ( rule__Application__Group_11__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==46) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSecurityDsl.g:1104:3: rule__Application__Group_11__0
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
    // InternalSecurityDsl.g:1112:1: rule__Application__Group__12 : rule__Application__Group__12__Impl ;
    public final void rule__Application__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1116:1: ( rule__Application__Group__12__Impl )
            // InternalSecurityDsl.g:1117:2: rule__Application__Group__12__Impl
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
    // InternalSecurityDsl.g:1123:1: rule__Application__Group__12__Impl : ( ( rule__Application__Group_12__0 )? ) ;
    public final void rule__Application__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1127:1: ( ( ( rule__Application__Group_12__0 )? ) )
            // InternalSecurityDsl.g:1128:1: ( ( rule__Application__Group_12__0 )? )
            {
            // InternalSecurityDsl.g:1128:1: ( ( rule__Application__Group_12__0 )? )
            // InternalSecurityDsl.g:1129:2: ( rule__Application__Group_12__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_12()); 
            // InternalSecurityDsl.g:1130:2: ( rule__Application__Group_12__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==47) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSecurityDsl.g:1130:3: rule__Application__Group_12__0
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
    // InternalSecurityDsl.g:1139:1: rule__Application__Group_2__0 : rule__Application__Group_2__0__Impl rule__Application__Group_2__1 ;
    public final void rule__Application__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1143:1: ( rule__Application__Group_2__0__Impl rule__Application__Group_2__1 )
            // InternalSecurityDsl.g:1144:2: rule__Application__Group_2__0__Impl rule__Application__Group_2__1
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
    // InternalSecurityDsl.g:1151:1: rule__Application__Group_2__0__Impl : ( 'artifact:' ) ;
    public final void rule__Application__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1155:1: ( ( 'artifact:' ) )
            // InternalSecurityDsl.g:1156:1: ( 'artifact:' )
            {
            // InternalSecurityDsl.g:1156:1: ( 'artifact:' )
            // InternalSecurityDsl.g:1157:2: 'artifact:'
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
    // InternalSecurityDsl.g:1166:1: rule__Application__Group_2__1 : rule__Application__Group_2__1__Impl ;
    public final void rule__Application__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1170:1: ( rule__Application__Group_2__1__Impl )
            // InternalSecurityDsl.g:1171:2: rule__Application__Group_2__1__Impl
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
    // InternalSecurityDsl.g:1177:1: rule__Application__Group_2__1__Impl : ( ( rule__Application__ArtifactAssignment_2_1 ) ) ;
    public final void rule__Application__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1181:1: ( ( ( rule__Application__ArtifactAssignment_2_1 ) ) )
            // InternalSecurityDsl.g:1182:1: ( ( rule__Application__ArtifactAssignment_2_1 ) )
            {
            // InternalSecurityDsl.g:1182:1: ( ( rule__Application__ArtifactAssignment_2_1 ) )
            // InternalSecurityDsl.g:1183:2: ( rule__Application__ArtifactAssignment_2_1 )
            {
             before(grammarAccess.getApplicationAccess().getArtifactAssignment_2_1()); 
            // InternalSecurityDsl.g:1184:2: ( rule__Application__ArtifactAssignment_2_1 )
            // InternalSecurityDsl.g:1184:3: rule__Application__ArtifactAssignment_2_1
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
    // InternalSecurityDsl.g:1193:1: rule__Application__Group_3__0 : rule__Application__Group_3__0__Impl rule__Application__Group_3__1 ;
    public final void rule__Application__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1197:1: ( rule__Application__Group_3__0__Impl rule__Application__Group_3__1 )
            // InternalSecurityDsl.g:1198:2: rule__Application__Group_3__0__Impl rule__Application__Group_3__1
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
    // InternalSecurityDsl.g:1205:1: rule__Application__Group_3__0__Impl : ( 'name:' ) ;
    public final void rule__Application__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1209:1: ( ( 'name:' ) )
            // InternalSecurityDsl.g:1210:1: ( 'name:' )
            {
            // InternalSecurityDsl.g:1210:1: ( 'name:' )
            // InternalSecurityDsl.g:1211:2: 'name:'
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
    // InternalSecurityDsl.g:1220:1: rule__Application__Group_3__1 : rule__Application__Group_3__1__Impl ;
    public final void rule__Application__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1224:1: ( rule__Application__Group_3__1__Impl )
            // InternalSecurityDsl.g:1225:2: rule__Application__Group_3__1__Impl
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
    // InternalSecurityDsl.g:1231:1: rule__Application__Group_3__1__Impl : ( ( rule__Application__NameAssignment_3_1 ) ) ;
    public final void rule__Application__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1235:1: ( ( ( rule__Application__NameAssignment_3_1 ) ) )
            // InternalSecurityDsl.g:1236:1: ( ( rule__Application__NameAssignment_3_1 ) )
            {
            // InternalSecurityDsl.g:1236:1: ( ( rule__Application__NameAssignment_3_1 ) )
            // InternalSecurityDsl.g:1237:2: ( rule__Application__NameAssignment_3_1 )
            {
             before(grammarAccess.getApplicationAccess().getNameAssignment_3_1()); 
            // InternalSecurityDsl.g:1238:2: ( rule__Application__NameAssignment_3_1 )
            // InternalSecurityDsl.g:1238:3: rule__Application__NameAssignment_3_1
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
    // InternalSecurityDsl.g:1247:1: rule__Application__Group_4__0 : rule__Application__Group_4__0__Impl rule__Application__Group_4__1 ;
    public final void rule__Application__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1251:1: ( rule__Application__Group_4__0__Impl rule__Application__Group_4__1 )
            // InternalSecurityDsl.g:1252:2: rule__Application__Group_4__0__Impl rule__Application__Group_4__1
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
    // InternalSecurityDsl.g:1259:1: rule__Application__Group_4__0__Impl : ( 'group:' ) ;
    public final void rule__Application__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1263:1: ( ( 'group:' ) )
            // InternalSecurityDsl.g:1264:1: ( 'group:' )
            {
            // InternalSecurityDsl.g:1264:1: ( 'group:' )
            // InternalSecurityDsl.g:1265:2: 'group:'
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
    // InternalSecurityDsl.g:1274:1: rule__Application__Group_4__1 : rule__Application__Group_4__1__Impl ;
    public final void rule__Application__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1278:1: ( rule__Application__Group_4__1__Impl )
            // InternalSecurityDsl.g:1279:2: rule__Application__Group_4__1__Impl
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
    // InternalSecurityDsl.g:1285:1: rule__Application__Group_4__1__Impl : ( ( rule__Application__GroupAssignment_4_1 ) ) ;
    public final void rule__Application__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1289:1: ( ( ( rule__Application__GroupAssignment_4_1 ) ) )
            // InternalSecurityDsl.g:1290:1: ( ( rule__Application__GroupAssignment_4_1 ) )
            {
            // InternalSecurityDsl.g:1290:1: ( ( rule__Application__GroupAssignment_4_1 ) )
            // InternalSecurityDsl.g:1291:2: ( rule__Application__GroupAssignment_4_1 )
            {
             before(grammarAccess.getApplicationAccess().getGroupAssignment_4_1()); 
            // InternalSecurityDsl.g:1292:2: ( rule__Application__GroupAssignment_4_1 )
            // InternalSecurityDsl.g:1292:3: rule__Application__GroupAssignment_4_1
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
    // InternalSecurityDsl.g:1301:1: rule__Application__Group_5__0 : rule__Application__Group_5__0__Impl rule__Application__Group_5__1 ;
    public final void rule__Application__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1305:1: ( rule__Application__Group_5__0__Impl rule__Application__Group_5__1 )
            // InternalSecurityDsl.g:1306:2: rule__Application__Group_5__0__Impl rule__Application__Group_5__1
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
    // InternalSecurityDsl.g:1313:1: rule__Application__Group_5__0__Impl : ( 'packageName:' ) ;
    public final void rule__Application__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1317:1: ( ( 'packageName:' ) )
            // InternalSecurityDsl.g:1318:1: ( 'packageName:' )
            {
            // InternalSecurityDsl.g:1318:1: ( 'packageName:' )
            // InternalSecurityDsl.g:1319:2: 'packageName:'
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
    // InternalSecurityDsl.g:1328:1: rule__Application__Group_5__1 : rule__Application__Group_5__1__Impl ;
    public final void rule__Application__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1332:1: ( rule__Application__Group_5__1__Impl )
            // InternalSecurityDsl.g:1333:2: rule__Application__Group_5__1__Impl
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
    // InternalSecurityDsl.g:1339:1: rule__Application__Group_5__1__Impl : ( ( rule__Application__PackageNameAssignment_5_1 ) ) ;
    public final void rule__Application__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1343:1: ( ( ( rule__Application__PackageNameAssignment_5_1 ) ) )
            // InternalSecurityDsl.g:1344:1: ( ( rule__Application__PackageNameAssignment_5_1 ) )
            {
            // InternalSecurityDsl.g:1344:1: ( ( rule__Application__PackageNameAssignment_5_1 ) )
            // InternalSecurityDsl.g:1345:2: ( rule__Application__PackageNameAssignment_5_1 )
            {
             before(grammarAccess.getApplicationAccess().getPackageNameAssignment_5_1()); 
            // InternalSecurityDsl.g:1346:2: ( rule__Application__PackageNameAssignment_5_1 )
            // InternalSecurityDsl.g:1346:3: rule__Application__PackageNameAssignment_5_1
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
    // InternalSecurityDsl.g:1355:1: rule__Application__Group_6__0 : rule__Application__Group_6__0__Impl rule__Application__Group_6__1 ;
    public final void rule__Application__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1359:1: ( rule__Application__Group_6__0__Impl rule__Application__Group_6__1 )
            // InternalSecurityDsl.g:1360:2: rule__Application__Group_6__0__Impl rule__Application__Group_6__1
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
    // InternalSecurityDsl.g:1367:1: rule__Application__Group_6__0__Impl : ( 'description:' ) ;
    public final void rule__Application__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1371:1: ( ( 'description:' ) )
            // InternalSecurityDsl.g:1372:1: ( 'description:' )
            {
            // InternalSecurityDsl.g:1372:1: ( 'description:' )
            // InternalSecurityDsl.g:1373:2: 'description:'
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
    // InternalSecurityDsl.g:1382:1: rule__Application__Group_6__1 : rule__Application__Group_6__1__Impl ;
    public final void rule__Application__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1386:1: ( rule__Application__Group_6__1__Impl )
            // InternalSecurityDsl.g:1387:2: rule__Application__Group_6__1__Impl
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
    // InternalSecurityDsl.g:1393:1: rule__Application__Group_6__1__Impl : ( ( rule__Application__DescriptionAssignment_6_1 ) ) ;
    public final void rule__Application__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1397:1: ( ( ( rule__Application__DescriptionAssignment_6_1 ) ) )
            // InternalSecurityDsl.g:1398:1: ( ( rule__Application__DescriptionAssignment_6_1 ) )
            {
            // InternalSecurityDsl.g:1398:1: ( ( rule__Application__DescriptionAssignment_6_1 ) )
            // InternalSecurityDsl.g:1399:2: ( rule__Application__DescriptionAssignment_6_1 )
            {
             before(grammarAccess.getApplicationAccess().getDescriptionAssignment_6_1()); 
            // InternalSecurityDsl.g:1400:2: ( rule__Application__DescriptionAssignment_6_1 )
            // InternalSecurityDsl.g:1400:3: rule__Application__DescriptionAssignment_6_1
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
    // InternalSecurityDsl.g:1409:1: rule__Application__Group_7__0 : rule__Application__Group_7__0__Impl rule__Application__Group_7__1 ;
    public final void rule__Application__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1413:1: ( rule__Application__Group_7__0__Impl rule__Application__Group_7__1 )
            // InternalSecurityDsl.g:1414:2: rule__Application__Group_7__0__Impl rule__Application__Group_7__1
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
    // InternalSecurityDsl.g:1421:1: rule__Application__Group_7__0__Impl : ( 'port:' ) ;
    public final void rule__Application__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1425:1: ( ( 'port:' ) )
            // InternalSecurityDsl.g:1426:1: ( 'port:' )
            {
            // InternalSecurityDsl.g:1426:1: ( 'port:' )
            // InternalSecurityDsl.g:1427:2: 'port:'
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
    // InternalSecurityDsl.g:1436:1: rule__Application__Group_7__1 : rule__Application__Group_7__1__Impl ;
    public final void rule__Application__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1440:1: ( rule__Application__Group_7__1__Impl )
            // InternalSecurityDsl.g:1441:2: rule__Application__Group_7__1__Impl
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
    // InternalSecurityDsl.g:1447:1: rule__Application__Group_7__1__Impl : ( ( rule__Application__PortAssignment_7_1 ) ) ;
    public final void rule__Application__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1451:1: ( ( ( rule__Application__PortAssignment_7_1 ) ) )
            // InternalSecurityDsl.g:1452:1: ( ( rule__Application__PortAssignment_7_1 ) )
            {
            // InternalSecurityDsl.g:1452:1: ( ( rule__Application__PortAssignment_7_1 ) )
            // InternalSecurityDsl.g:1453:2: ( rule__Application__PortAssignment_7_1 )
            {
             before(grammarAccess.getApplicationAccess().getPortAssignment_7_1()); 
            // InternalSecurityDsl.g:1454:2: ( rule__Application__PortAssignment_7_1 )
            // InternalSecurityDsl.g:1454:3: rule__Application__PortAssignment_7_1
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
    // InternalSecurityDsl.g:1463:1: rule__Application__Group_8__0 : rule__Application__Group_8__0__Impl rule__Application__Group_8__1 ;
    public final void rule__Application__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1467:1: ( rule__Application__Group_8__0__Impl rule__Application__Group_8__1 )
            // InternalSecurityDsl.g:1468:2: rule__Application__Group_8__0__Impl rule__Application__Group_8__1
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
    // InternalSecurityDsl.g:1475:1: rule__Application__Group_8__0__Impl : ( 'hostname:' ) ;
    public final void rule__Application__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1479:1: ( ( 'hostname:' ) )
            // InternalSecurityDsl.g:1480:1: ( 'hostname:' )
            {
            // InternalSecurityDsl.g:1480:1: ( 'hostname:' )
            // InternalSecurityDsl.g:1481:2: 'hostname:'
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
    // InternalSecurityDsl.g:1490:1: rule__Application__Group_8__1 : rule__Application__Group_8__1__Impl ;
    public final void rule__Application__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1494:1: ( rule__Application__Group_8__1__Impl )
            // InternalSecurityDsl.g:1495:2: rule__Application__Group_8__1__Impl
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
    // InternalSecurityDsl.g:1501:1: rule__Application__Group_8__1__Impl : ( ( rule__Application__HostnameAssignment_8_1 ) ) ;
    public final void rule__Application__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1505:1: ( ( ( rule__Application__HostnameAssignment_8_1 ) ) )
            // InternalSecurityDsl.g:1506:1: ( ( rule__Application__HostnameAssignment_8_1 ) )
            {
            // InternalSecurityDsl.g:1506:1: ( ( rule__Application__HostnameAssignment_8_1 ) )
            // InternalSecurityDsl.g:1507:2: ( rule__Application__HostnameAssignment_8_1 )
            {
             before(grammarAccess.getApplicationAccess().getHostnameAssignment_8_1()); 
            // InternalSecurityDsl.g:1508:2: ( rule__Application__HostnameAssignment_8_1 )
            // InternalSecurityDsl.g:1508:3: rule__Application__HostnameAssignment_8_1
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
    // InternalSecurityDsl.g:1517:1: rule__Application__Group_9__0 : rule__Application__Group_9__0__Impl rule__Application__Group_9__1 ;
    public final void rule__Application__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1521:1: ( rule__Application__Group_9__0__Impl rule__Application__Group_9__1 )
            // InternalSecurityDsl.g:1522:2: rule__Application__Group_9__0__Impl rule__Application__Group_9__1
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
    // InternalSecurityDsl.g:1529:1: rule__Application__Group_9__0__Impl : ( 'database:' ) ;
    public final void rule__Application__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1533:1: ( ( 'database:' ) )
            // InternalSecurityDsl.g:1534:1: ( 'database:' )
            {
            // InternalSecurityDsl.g:1534:1: ( 'database:' )
            // InternalSecurityDsl.g:1535:2: 'database:'
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
    // InternalSecurityDsl.g:1544:1: rule__Application__Group_9__1 : rule__Application__Group_9__1__Impl ;
    public final void rule__Application__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1548:1: ( rule__Application__Group_9__1__Impl )
            // InternalSecurityDsl.g:1549:2: rule__Application__Group_9__1__Impl
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
    // InternalSecurityDsl.g:1555:1: rule__Application__Group_9__1__Impl : ( ( rule__Application__App_databaseAssignment_9_1 ) ) ;
    public final void rule__Application__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1559:1: ( ( ( rule__Application__App_databaseAssignment_9_1 ) ) )
            // InternalSecurityDsl.g:1560:1: ( ( rule__Application__App_databaseAssignment_9_1 ) )
            {
            // InternalSecurityDsl.g:1560:1: ( ( rule__Application__App_databaseAssignment_9_1 ) )
            // InternalSecurityDsl.g:1561:2: ( rule__Application__App_databaseAssignment_9_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_databaseAssignment_9_1()); 
            // InternalSecurityDsl.g:1562:2: ( rule__Application__App_databaseAssignment_9_1 )
            // InternalSecurityDsl.g:1562:3: rule__Application__App_databaseAssignment_9_1
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
    // InternalSecurityDsl.g:1571:1: rule__Application__Group_10__0 : rule__Application__Group_10__0__Impl rule__Application__Group_10__1 ;
    public final void rule__Application__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1575:1: ( rule__Application__Group_10__0__Impl rule__Application__Group_10__1 )
            // InternalSecurityDsl.g:1576:2: rule__Application__Group_10__0__Impl rule__Application__Group_10__1
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
    // InternalSecurityDsl.g:1583:1: rule__Application__Group_10__0__Impl : ( 'model:' ) ;
    public final void rule__Application__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1587:1: ( ( 'model:' ) )
            // InternalSecurityDsl.g:1588:1: ( 'model:' )
            {
            // InternalSecurityDsl.g:1588:1: ( 'model:' )
            // InternalSecurityDsl.g:1589:2: 'model:'
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
    // InternalSecurityDsl.g:1598:1: rule__Application__Group_10__1 : rule__Application__Group_10__1__Impl rule__Application__Group_10__2 ;
    public final void rule__Application__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1602:1: ( rule__Application__Group_10__1__Impl rule__Application__Group_10__2 )
            // InternalSecurityDsl.g:1603:2: rule__Application__Group_10__1__Impl rule__Application__Group_10__2
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
    // InternalSecurityDsl.g:1610:1: rule__Application__Group_10__1__Impl : ( ( rule__Application__Group_10_1__0 )? ) ;
    public final void rule__Application__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1614:1: ( ( ( rule__Application__Group_10_1__0 )? ) )
            // InternalSecurityDsl.g:1615:1: ( ( rule__Application__Group_10_1__0 )? )
            {
            // InternalSecurityDsl.g:1615:1: ( ( rule__Application__Group_10_1__0 )? )
            // InternalSecurityDsl.g:1616:2: ( rule__Application__Group_10_1__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_10_1()); 
            // InternalSecurityDsl.g:1617:2: ( rule__Application__Group_10_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==44) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSecurityDsl.g:1617:3: rule__Application__Group_10_1__0
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
    // InternalSecurityDsl.g:1625:1: rule__Application__Group_10__2 : rule__Application__Group_10__2__Impl ;
    public final void rule__Application__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1629:1: ( rule__Application__Group_10__2__Impl )
            // InternalSecurityDsl.g:1630:2: rule__Application__Group_10__2__Impl
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
    // InternalSecurityDsl.g:1636:1: rule__Application__Group_10__2__Impl : ( ( rule__Application__Group_10_2__0 )? ) ;
    public final void rule__Application__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1640:1: ( ( ( rule__Application__Group_10_2__0 )? ) )
            // InternalSecurityDsl.g:1641:1: ( ( rule__Application__Group_10_2__0 )? )
            {
            // InternalSecurityDsl.g:1641:1: ( ( rule__Application__Group_10_2__0 )? )
            // InternalSecurityDsl.g:1642:2: ( rule__Application__Group_10_2__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_10_2()); 
            // InternalSecurityDsl.g:1643:2: ( rule__Application__Group_10_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==45) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSecurityDsl.g:1643:3: rule__Application__Group_10_2__0
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
    // InternalSecurityDsl.g:1652:1: rule__Application__Group_10_1__0 : rule__Application__Group_10_1__0__Impl rule__Application__Group_10_1__1 ;
    public final void rule__Application__Group_10_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1656:1: ( rule__Application__Group_10_1__0__Impl rule__Application__Group_10_1__1 )
            // InternalSecurityDsl.g:1657:2: rule__Application__Group_10_1__0__Impl rule__Application__Group_10_1__1
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
    // InternalSecurityDsl.g:1664:1: rule__Application__Group_10_1__0__Impl : ( 'user:' ) ;
    public final void rule__Application__Group_10_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1668:1: ( ( 'user:' ) )
            // InternalSecurityDsl.g:1669:1: ( 'user:' )
            {
            // InternalSecurityDsl.g:1669:1: ( 'user:' )
            // InternalSecurityDsl.g:1670:2: 'user:'
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
    // InternalSecurityDsl.g:1679:1: rule__Application__Group_10_1__1 : rule__Application__Group_10_1__1__Impl ;
    public final void rule__Application__Group_10_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1683:1: ( rule__Application__Group_10_1__1__Impl )
            // InternalSecurityDsl.g:1684:2: rule__Application__Group_10_1__1__Impl
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
    // InternalSecurityDsl.g:1690:1: rule__Application__Group_10_1__1__Impl : ( ( rule__Application__App_modelsAssignment_10_1_1 ) ) ;
    public final void rule__Application__Group_10_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1694:1: ( ( ( rule__Application__App_modelsAssignment_10_1_1 ) ) )
            // InternalSecurityDsl.g:1695:1: ( ( rule__Application__App_modelsAssignment_10_1_1 ) )
            {
            // InternalSecurityDsl.g:1695:1: ( ( rule__Application__App_modelsAssignment_10_1_1 ) )
            // InternalSecurityDsl.g:1696:2: ( rule__Application__App_modelsAssignment_10_1_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_modelsAssignment_10_1_1()); 
            // InternalSecurityDsl.g:1697:2: ( rule__Application__App_modelsAssignment_10_1_1 )
            // InternalSecurityDsl.g:1697:3: rule__Application__App_modelsAssignment_10_1_1
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
    // InternalSecurityDsl.g:1706:1: rule__Application__Group_10_2__0 : rule__Application__Group_10_2__0__Impl rule__Application__Group_10_2__1 ;
    public final void rule__Application__Group_10_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1710:1: ( rule__Application__Group_10_2__0__Impl rule__Application__Group_10_2__1 )
            // InternalSecurityDsl.g:1711:2: rule__Application__Group_10_2__0__Impl rule__Application__Group_10_2__1
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
    // InternalSecurityDsl.g:1718:1: rule__Application__Group_10_2__0__Impl : ( 'role:' ) ;
    public final void rule__Application__Group_10_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1722:1: ( ( 'role:' ) )
            // InternalSecurityDsl.g:1723:1: ( 'role:' )
            {
            // InternalSecurityDsl.g:1723:1: ( 'role:' )
            // InternalSecurityDsl.g:1724:2: 'role:'
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
    // InternalSecurityDsl.g:1733:1: rule__Application__Group_10_2__1 : rule__Application__Group_10_2__1__Impl ;
    public final void rule__Application__Group_10_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1737:1: ( rule__Application__Group_10_2__1__Impl )
            // InternalSecurityDsl.g:1738:2: rule__Application__Group_10_2__1__Impl
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
    // InternalSecurityDsl.g:1744:1: rule__Application__Group_10_2__1__Impl : ( ( rule__Application__App_modelsAssignment_10_2_1 ) ) ;
    public final void rule__Application__Group_10_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1748:1: ( ( ( rule__Application__App_modelsAssignment_10_2_1 ) ) )
            // InternalSecurityDsl.g:1749:1: ( ( rule__Application__App_modelsAssignment_10_2_1 ) )
            {
            // InternalSecurityDsl.g:1749:1: ( ( rule__Application__App_modelsAssignment_10_2_1 ) )
            // InternalSecurityDsl.g:1750:2: ( rule__Application__App_modelsAssignment_10_2_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_modelsAssignment_10_2_1()); 
            // InternalSecurityDsl.g:1751:2: ( rule__Application__App_modelsAssignment_10_2_1 )
            // InternalSecurityDsl.g:1751:3: rule__Application__App_modelsAssignment_10_2_1
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
    // InternalSecurityDsl.g:1760:1: rule__Application__Group_11__0 : rule__Application__Group_11__0__Impl rule__Application__Group_11__1 ;
    public final void rule__Application__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1764:1: ( rule__Application__Group_11__0__Impl rule__Application__Group_11__1 )
            // InternalSecurityDsl.g:1765:2: rule__Application__Group_11__0__Impl rule__Application__Group_11__1
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
    // InternalSecurityDsl.g:1772:1: rule__Application__Group_11__0__Impl : ( 'security:' ) ;
    public final void rule__Application__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1776:1: ( ( 'security:' ) )
            // InternalSecurityDsl.g:1777:1: ( 'security:' )
            {
            // InternalSecurityDsl.g:1777:1: ( 'security:' )
            // InternalSecurityDsl.g:1778:2: 'security:'
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
    // InternalSecurityDsl.g:1787:1: rule__Application__Group_11__1 : rule__Application__Group_11__1__Impl ;
    public final void rule__Application__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1791:1: ( rule__Application__Group_11__1__Impl )
            // InternalSecurityDsl.g:1792:2: rule__Application__Group_11__1__Impl
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
    // InternalSecurityDsl.g:1798:1: rule__Application__Group_11__1__Impl : ( ( rule__Application__App_securityAssignment_11_1 ) ) ;
    public final void rule__Application__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1802:1: ( ( ( rule__Application__App_securityAssignment_11_1 ) ) )
            // InternalSecurityDsl.g:1803:1: ( ( rule__Application__App_securityAssignment_11_1 ) )
            {
            // InternalSecurityDsl.g:1803:1: ( ( rule__Application__App_securityAssignment_11_1 ) )
            // InternalSecurityDsl.g:1804:2: ( rule__Application__App_securityAssignment_11_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_securityAssignment_11_1()); 
            // InternalSecurityDsl.g:1805:2: ( rule__Application__App_securityAssignment_11_1 )
            // InternalSecurityDsl.g:1805:3: rule__Application__App_securityAssignment_11_1
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
    // InternalSecurityDsl.g:1814:1: rule__Application__Group_12__0 : rule__Application__Group_12__0__Impl rule__Application__Group_12__1 ;
    public final void rule__Application__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1818:1: ( rule__Application__Group_12__0__Impl rule__Application__Group_12__1 )
            // InternalSecurityDsl.g:1819:2: rule__Application__Group_12__0__Impl rule__Application__Group_12__1
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
    // InternalSecurityDsl.g:1826:1: rule__Application__Group_12__0__Impl : ( 'controller:' ) ;
    public final void rule__Application__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1830:1: ( ( 'controller:' ) )
            // InternalSecurityDsl.g:1831:1: ( 'controller:' )
            {
            // InternalSecurityDsl.g:1831:1: ( 'controller:' )
            // InternalSecurityDsl.g:1832:2: 'controller:'
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
    // InternalSecurityDsl.g:1841:1: rule__Application__Group_12__1 : rule__Application__Group_12__1__Impl ;
    public final void rule__Application__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1845:1: ( rule__Application__Group_12__1__Impl )
            // InternalSecurityDsl.g:1846:2: rule__Application__Group_12__1__Impl
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
    // InternalSecurityDsl.g:1852:1: rule__Application__Group_12__1__Impl : ( ( rule__Application__Group_12_1__0 )? ) ;
    public final void rule__Application__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1856:1: ( ( ( rule__Application__Group_12_1__0 )? ) )
            // InternalSecurityDsl.g:1857:1: ( ( rule__Application__Group_12_1__0 )? )
            {
            // InternalSecurityDsl.g:1857:1: ( ( rule__Application__Group_12_1__0 )? )
            // InternalSecurityDsl.g:1858:2: ( rule__Application__Group_12_1__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_12_1()); 
            // InternalSecurityDsl.g:1859:2: ( rule__Application__Group_12_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==48) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSecurityDsl.g:1859:3: rule__Application__Group_12_1__0
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
    // InternalSecurityDsl.g:1868:1: rule__Application__Group_12_1__0 : rule__Application__Group_12_1__0__Impl rule__Application__Group_12_1__1 ;
    public final void rule__Application__Group_12_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1872:1: ( rule__Application__Group_12_1__0__Impl rule__Application__Group_12_1__1 )
            // InternalSecurityDsl.g:1873:2: rule__Application__Group_12_1__0__Impl rule__Application__Group_12_1__1
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
    // InternalSecurityDsl.g:1880:1: rule__Application__Group_12_1__0__Impl : ( 'auth:' ) ;
    public final void rule__Application__Group_12_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1884:1: ( ( 'auth:' ) )
            // InternalSecurityDsl.g:1885:1: ( 'auth:' )
            {
            // InternalSecurityDsl.g:1885:1: ( 'auth:' )
            // InternalSecurityDsl.g:1886:2: 'auth:'
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
    // InternalSecurityDsl.g:1895:1: rule__Application__Group_12_1__1 : rule__Application__Group_12_1__1__Impl ;
    public final void rule__Application__Group_12_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1899:1: ( rule__Application__Group_12_1__1__Impl )
            // InternalSecurityDsl.g:1900:2: rule__Application__Group_12_1__1__Impl
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
    // InternalSecurityDsl.g:1906:1: rule__Application__Group_12_1__1__Impl : ( ( rule__Application__App_controllersAssignment_12_1_1 ) ) ;
    public final void rule__Application__Group_12_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1910:1: ( ( ( rule__Application__App_controllersAssignment_12_1_1 ) ) )
            // InternalSecurityDsl.g:1911:1: ( ( rule__Application__App_controllersAssignment_12_1_1 ) )
            {
            // InternalSecurityDsl.g:1911:1: ( ( rule__Application__App_controllersAssignment_12_1_1 ) )
            // InternalSecurityDsl.g:1912:2: ( rule__Application__App_controllersAssignment_12_1_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_controllersAssignment_12_1_1()); 
            // InternalSecurityDsl.g:1913:2: ( rule__Application__App_controllersAssignment_12_1_1 )
            // InternalSecurityDsl.g:1913:3: rule__Application__App_controllersAssignment_12_1_1
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
    // InternalSecurityDsl.g:1922:1: rule__Database__Group__0 : rule__Database__Group__0__Impl rule__Database__Group__1 ;
    public final void rule__Database__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1926:1: ( rule__Database__Group__0__Impl rule__Database__Group__1 )
            // InternalSecurityDsl.g:1927:2: rule__Database__Group__0__Impl rule__Database__Group__1
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
    // InternalSecurityDsl.g:1934:1: rule__Database__Group__0__Impl : ( 'vendor:' ) ;
    public final void rule__Database__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1938:1: ( ( 'vendor:' ) )
            // InternalSecurityDsl.g:1939:1: ( 'vendor:' )
            {
            // InternalSecurityDsl.g:1939:1: ( 'vendor:' )
            // InternalSecurityDsl.g:1940:2: 'vendor:'
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
    // InternalSecurityDsl.g:1949:1: rule__Database__Group__1 : rule__Database__Group__1__Impl rule__Database__Group__2 ;
    public final void rule__Database__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1953:1: ( rule__Database__Group__1__Impl rule__Database__Group__2 )
            // InternalSecurityDsl.g:1954:2: rule__Database__Group__1__Impl rule__Database__Group__2
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
    // InternalSecurityDsl.g:1961:1: rule__Database__Group__1__Impl : ( ( rule__Database__VendorNameAssignment_1 ) ) ;
    public final void rule__Database__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1965:1: ( ( ( rule__Database__VendorNameAssignment_1 ) ) )
            // InternalSecurityDsl.g:1966:1: ( ( rule__Database__VendorNameAssignment_1 ) )
            {
            // InternalSecurityDsl.g:1966:1: ( ( rule__Database__VendorNameAssignment_1 ) )
            // InternalSecurityDsl.g:1967:2: ( rule__Database__VendorNameAssignment_1 )
            {
             before(grammarAccess.getDatabaseAccess().getVendorNameAssignment_1()); 
            // InternalSecurityDsl.g:1968:2: ( rule__Database__VendorNameAssignment_1 )
            // InternalSecurityDsl.g:1968:3: rule__Database__VendorNameAssignment_1
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
    // InternalSecurityDsl.g:1976:1: rule__Database__Group__2 : rule__Database__Group__2__Impl rule__Database__Group__3 ;
    public final void rule__Database__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1980:1: ( rule__Database__Group__2__Impl rule__Database__Group__3 )
            // InternalSecurityDsl.g:1981:2: rule__Database__Group__2__Impl rule__Database__Group__3
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
    // InternalSecurityDsl.g:1988:1: rule__Database__Group__2__Impl : ( 'url:' ) ;
    public final void rule__Database__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1992:1: ( ( 'url:' ) )
            // InternalSecurityDsl.g:1993:1: ( 'url:' )
            {
            // InternalSecurityDsl.g:1993:1: ( 'url:' )
            // InternalSecurityDsl.g:1994:2: 'url:'
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
    // InternalSecurityDsl.g:2003:1: rule__Database__Group__3 : rule__Database__Group__3__Impl rule__Database__Group__4 ;
    public final void rule__Database__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2007:1: ( rule__Database__Group__3__Impl rule__Database__Group__4 )
            // InternalSecurityDsl.g:2008:2: rule__Database__Group__3__Impl rule__Database__Group__4
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
    // InternalSecurityDsl.g:2015:1: rule__Database__Group__3__Impl : ( ( rule__Database__UrlAssignment_3 ) ) ;
    public final void rule__Database__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2019:1: ( ( ( rule__Database__UrlAssignment_3 ) ) )
            // InternalSecurityDsl.g:2020:1: ( ( rule__Database__UrlAssignment_3 ) )
            {
            // InternalSecurityDsl.g:2020:1: ( ( rule__Database__UrlAssignment_3 ) )
            // InternalSecurityDsl.g:2021:2: ( rule__Database__UrlAssignment_3 )
            {
             before(grammarAccess.getDatabaseAccess().getUrlAssignment_3()); 
            // InternalSecurityDsl.g:2022:2: ( rule__Database__UrlAssignment_3 )
            // InternalSecurityDsl.g:2022:3: rule__Database__UrlAssignment_3
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
    // InternalSecurityDsl.g:2030:1: rule__Database__Group__4 : rule__Database__Group__4__Impl rule__Database__Group__5 ;
    public final void rule__Database__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2034:1: ( rule__Database__Group__4__Impl rule__Database__Group__5 )
            // InternalSecurityDsl.g:2035:2: rule__Database__Group__4__Impl rule__Database__Group__5
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
    // InternalSecurityDsl.g:2042:1: rule__Database__Group__4__Impl : ( 'username:' ) ;
    public final void rule__Database__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2046:1: ( ( 'username:' ) )
            // InternalSecurityDsl.g:2047:1: ( 'username:' )
            {
            // InternalSecurityDsl.g:2047:1: ( 'username:' )
            // InternalSecurityDsl.g:2048:2: 'username:'
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
    // InternalSecurityDsl.g:2057:1: rule__Database__Group__5 : rule__Database__Group__5__Impl rule__Database__Group__6 ;
    public final void rule__Database__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2061:1: ( rule__Database__Group__5__Impl rule__Database__Group__6 )
            // InternalSecurityDsl.g:2062:2: rule__Database__Group__5__Impl rule__Database__Group__6
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
    // InternalSecurityDsl.g:2069:1: rule__Database__Group__5__Impl : ( ( rule__Database__UsernameAssignment_5 ) ) ;
    public final void rule__Database__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2073:1: ( ( ( rule__Database__UsernameAssignment_5 ) ) )
            // InternalSecurityDsl.g:2074:1: ( ( rule__Database__UsernameAssignment_5 ) )
            {
            // InternalSecurityDsl.g:2074:1: ( ( rule__Database__UsernameAssignment_5 ) )
            // InternalSecurityDsl.g:2075:2: ( rule__Database__UsernameAssignment_5 )
            {
             before(grammarAccess.getDatabaseAccess().getUsernameAssignment_5()); 
            // InternalSecurityDsl.g:2076:2: ( rule__Database__UsernameAssignment_5 )
            // InternalSecurityDsl.g:2076:3: rule__Database__UsernameAssignment_5
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
    // InternalSecurityDsl.g:2084:1: rule__Database__Group__6 : rule__Database__Group__6__Impl rule__Database__Group__7 ;
    public final void rule__Database__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2088:1: ( rule__Database__Group__6__Impl rule__Database__Group__7 )
            // InternalSecurityDsl.g:2089:2: rule__Database__Group__6__Impl rule__Database__Group__7
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
    // InternalSecurityDsl.g:2096:1: rule__Database__Group__6__Impl : ( 'password:' ) ;
    public final void rule__Database__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2100:1: ( ( 'password:' ) )
            // InternalSecurityDsl.g:2101:1: ( 'password:' )
            {
            // InternalSecurityDsl.g:2101:1: ( 'password:' )
            // InternalSecurityDsl.g:2102:2: 'password:'
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
    // InternalSecurityDsl.g:2111:1: rule__Database__Group__7 : rule__Database__Group__7__Impl ;
    public final void rule__Database__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2115:1: ( rule__Database__Group__7__Impl )
            // InternalSecurityDsl.g:2116:2: rule__Database__Group__7__Impl
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
    // InternalSecurityDsl.g:2122:1: rule__Database__Group__7__Impl : ( ( rule__Database__PasswordAssignment_7 ) ) ;
    public final void rule__Database__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2126:1: ( ( ( rule__Database__PasswordAssignment_7 ) ) )
            // InternalSecurityDsl.g:2127:1: ( ( rule__Database__PasswordAssignment_7 ) )
            {
            // InternalSecurityDsl.g:2127:1: ( ( rule__Database__PasswordAssignment_7 ) )
            // InternalSecurityDsl.g:2128:2: ( rule__Database__PasswordAssignment_7 )
            {
             before(grammarAccess.getDatabaseAccess().getPasswordAssignment_7()); 
            // InternalSecurityDsl.g:2129:2: ( rule__Database__PasswordAssignment_7 )
            // InternalSecurityDsl.g:2129:3: rule__Database__PasswordAssignment_7
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
    // InternalSecurityDsl.g:2138:1: rule__ELongObject__Group__0 : rule__ELongObject__Group__0__Impl rule__ELongObject__Group__1 ;
    public final void rule__ELongObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2142:1: ( rule__ELongObject__Group__0__Impl rule__ELongObject__Group__1 )
            // InternalSecurityDsl.g:2143:2: rule__ELongObject__Group__0__Impl rule__ELongObject__Group__1
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
    // InternalSecurityDsl.g:2150:1: rule__ELongObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__ELongObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2154:1: ( ( ( '-' )? ) )
            // InternalSecurityDsl.g:2155:1: ( ( '-' )? )
            {
            // InternalSecurityDsl.g:2155:1: ( ( '-' )? )
            // InternalSecurityDsl.g:2156:2: ( '-' )?
            {
             before(grammarAccess.getELongObjectAccess().getHyphenMinusKeyword_0()); 
            // InternalSecurityDsl.g:2157:2: ( '-' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==53) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSecurityDsl.g:2157:3: '-'
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
    // InternalSecurityDsl.g:2165:1: rule__ELongObject__Group__1 : rule__ELongObject__Group__1__Impl ;
    public final void rule__ELongObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2169:1: ( rule__ELongObject__Group__1__Impl )
            // InternalSecurityDsl.g:2170:2: rule__ELongObject__Group__1__Impl
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
    // InternalSecurityDsl.g:2176:1: rule__ELongObject__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__ELongObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2180:1: ( ( RULE_INT ) )
            // InternalSecurityDsl.g:2181:1: ( RULE_INT )
            {
            // InternalSecurityDsl.g:2181:1: ( RULE_INT )
            // InternalSecurityDsl.g:2182:2: RULE_INT
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
    // InternalSecurityDsl.g:2192:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2196:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalSecurityDsl.g:2197:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalSecurityDsl.g:2204:1: rule__Attribute__Group__0__Impl : ( '{' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2208:1: ( ( '{' ) )
            // InternalSecurityDsl.g:2209:1: ( '{' )
            {
            // InternalSecurityDsl.g:2209:1: ( '{' )
            // InternalSecurityDsl.g:2210:2: '{'
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
    // InternalSecurityDsl.g:2219:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2223:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalSecurityDsl.g:2224:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalSecurityDsl.g:2231:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__IdentifierAssignment_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2235:1: ( ( ( rule__Attribute__IdentifierAssignment_1 )? ) )
            // InternalSecurityDsl.g:2236:1: ( ( rule__Attribute__IdentifierAssignment_1 )? )
            {
            // InternalSecurityDsl.g:2236:1: ( ( rule__Attribute__IdentifierAssignment_1 )? )
            // InternalSecurityDsl.g:2237:2: ( rule__Attribute__IdentifierAssignment_1 )?
            {
             before(grammarAccess.getAttributeAccess().getIdentifierAssignment_1()); 
            // InternalSecurityDsl.g:2238:2: ( rule__Attribute__IdentifierAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==83) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSecurityDsl.g:2238:3: rule__Attribute__IdentifierAssignment_1
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
    // InternalSecurityDsl.g:2246:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2250:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalSecurityDsl.g:2251:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
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
    // InternalSecurityDsl.g:2258:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__CredentialAssignment_2 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2262:1: ( ( ( rule__Attribute__CredentialAssignment_2 )? ) )
            // InternalSecurityDsl.g:2263:1: ( ( rule__Attribute__CredentialAssignment_2 )? )
            {
            // InternalSecurityDsl.g:2263:1: ( ( rule__Attribute__CredentialAssignment_2 )? )
            // InternalSecurityDsl.g:2264:2: ( rule__Attribute__CredentialAssignment_2 )?
            {
             before(grammarAccess.getAttributeAccess().getCredentialAssignment_2()); 
            // InternalSecurityDsl.g:2265:2: ( rule__Attribute__CredentialAssignment_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==84) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSecurityDsl.g:2265:3: rule__Attribute__CredentialAssignment_2
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
    // InternalSecurityDsl.g:2273:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2277:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalSecurityDsl.g:2278:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
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
    // InternalSecurityDsl.g:2285:1: rule__Attribute__Group__3__Impl : ( 'name:' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2289:1: ( ( 'name:' ) )
            // InternalSecurityDsl.g:2290:1: ( 'name:' )
            {
            // InternalSecurityDsl.g:2290:1: ( 'name:' )
            // InternalSecurityDsl.g:2291:2: 'name:'
            {
             before(grammarAccess.getAttributeAccess().getNameKeyword_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2300:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2304:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalSecurityDsl.g:2305:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
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
    // InternalSecurityDsl.g:2312:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__NameAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2316:1: ( ( ( rule__Attribute__NameAssignment_4 ) ) )
            // InternalSecurityDsl.g:2317:1: ( ( rule__Attribute__NameAssignment_4 ) )
            {
            // InternalSecurityDsl.g:2317:1: ( ( rule__Attribute__NameAssignment_4 ) )
            // InternalSecurityDsl.g:2318:2: ( rule__Attribute__NameAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_4()); 
            // InternalSecurityDsl.g:2319:2: ( rule__Attribute__NameAssignment_4 )
            // InternalSecurityDsl.g:2319:3: rule__Attribute__NameAssignment_4
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
    // InternalSecurityDsl.g:2327:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2331:1: ( rule__Attribute__Group__5__Impl rule__Attribute__Group__6 )
            // InternalSecurityDsl.g:2332:2: rule__Attribute__Group__5__Impl rule__Attribute__Group__6
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
    // InternalSecurityDsl.g:2339:1: rule__Attribute__Group__5__Impl : ( 'type:' ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2343:1: ( ( 'type:' ) )
            // InternalSecurityDsl.g:2344:1: ( 'type:' )
            {
            // InternalSecurityDsl.g:2344:1: ( 'type:' )
            // InternalSecurityDsl.g:2345:2: 'type:'
            {
             before(grammarAccess.getAttributeAccess().getTypeKeyword_5()); 
            match(input,55,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2354:1: rule__Attribute__Group__6 : rule__Attribute__Group__6__Impl rule__Attribute__Group__7 ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2358:1: ( rule__Attribute__Group__6__Impl rule__Attribute__Group__7 )
            // InternalSecurityDsl.g:2359:2: rule__Attribute__Group__6__Impl rule__Attribute__Group__7
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
    // InternalSecurityDsl.g:2366:1: rule__Attribute__Group__6__Impl : ( ( rule__Attribute__TypeAssignment_6 ) ) ;
    public final void rule__Attribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2370:1: ( ( ( rule__Attribute__TypeAssignment_6 ) ) )
            // InternalSecurityDsl.g:2371:1: ( ( rule__Attribute__TypeAssignment_6 ) )
            {
            // InternalSecurityDsl.g:2371:1: ( ( rule__Attribute__TypeAssignment_6 ) )
            // InternalSecurityDsl.g:2372:2: ( rule__Attribute__TypeAssignment_6 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_6()); 
            // InternalSecurityDsl.g:2373:2: ( rule__Attribute__TypeAssignment_6 )
            // InternalSecurityDsl.g:2373:3: rule__Attribute__TypeAssignment_6
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
    // InternalSecurityDsl.g:2381:1: rule__Attribute__Group__7 : rule__Attribute__Group__7__Impl rule__Attribute__Group__8 ;
    public final void rule__Attribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2385:1: ( rule__Attribute__Group__7__Impl rule__Attribute__Group__8 )
            // InternalSecurityDsl.g:2386:2: rule__Attribute__Group__7__Impl rule__Attribute__Group__8
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
    // InternalSecurityDsl.g:2393:1: rule__Attribute__Group__7__Impl : ( ( rule__Attribute__Group_7__0 )? ) ;
    public final void rule__Attribute__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2397:1: ( ( ( rule__Attribute__Group_7__0 )? ) )
            // InternalSecurityDsl.g:2398:1: ( ( rule__Attribute__Group_7__0 )? )
            {
            // InternalSecurityDsl.g:2398:1: ( ( rule__Attribute__Group_7__0 )? )
            // InternalSecurityDsl.g:2399:2: ( rule__Attribute__Group_7__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_7()); 
            // InternalSecurityDsl.g:2400:2: ( rule__Attribute__Group_7__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==57) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSecurityDsl.g:2400:3: rule__Attribute__Group_7__0
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
    // InternalSecurityDsl.g:2408:1: rule__Attribute__Group__8 : rule__Attribute__Group__8__Impl ;
    public final void rule__Attribute__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2412:1: ( rule__Attribute__Group__8__Impl )
            // InternalSecurityDsl.g:2413:2: rule__Attribute__Group__8__Impl
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
    // InternalSecurityDsl.g:2419:1: rule__Attribute__Group__8__Impl : ( '}' ) ;
    public final void rule__Attribute__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2423:1: ( ( '}' ) )
            // InternalSecurityDsl.g:2424:1: ( '}' )
            {
            // InternalSecurityDsl.g:2424:1: ( '}' )
            // InternalSecurityDsl.g:2425:2: '}'
            {
             before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_8()); 
            match(input,56,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2435:1: rule__Attribute__Group_7__0 : rule__Attribute__Group_7__0__Impl rule__Attribute__Group_7__1 ;
    public final void rule__Attribute__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2439:1: ( rule__Attribute__Group_7__0__Impl rule__Attribute__Group_7__1 )
            // InternalSecurityDsl.g:2440:2: rule__Attribute__Group_7__0__Impl rule__Attribute__Group_7__1
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
    // InternalSecurityDsl.g:2447:1: rule__Attribute__Group_7__0__Impl : ( 'collumnName:' ) ;
    public final void rule__Attribute__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2451:1: ( ( 'collumnName:' ) )
            // InternalSecurityDsl.g:2452:1: ( 'collumnName:' )
            {
            // InternalSecurityDsl.g:2452:1: ( 'collumnName:' )
            // InternalSecurityDsl.g:2453:2: 'collumnName:'
            {
             before(grammarAccess.getAttributeAccess().getCollumnNameKeyword_7_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2462:1: rule__Attribute__Group_7__1 : rule__Attribute__Group_7__1__Impl ;
    public final void rule__Attribute__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2466:1: ( rule__Attribute__Group_7__1__Impl )
            // InternalSecurityDsl.g:2467:2: rule__Attribute__Group_7__1__Impl
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
    // InternalSecurityDsl.g:2473:1: rule__Attribute__Group_7__1__Impl : ( ( rule__Attribute__CollumnNameAssignment_7_1 ) ) ;
    public final void rule__Attribute__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2477:1: ( ( ( rule__Attribute__CollumnNameAssignment_7_1 ) ) )
            // InternalSecurityDsl.g:2478:1: ( ( rule__Attribute__CollumnNameAssignment_7_1 ) )
            {
            // InternalSecurityDsl.g:2478:1: ( ( rule__Attribute__CollumnNameAssignment_7_1 ) )
            // InternalSecurityDsl.g:2479:2: ( rule__Attribute__CollumnNameAssignment_7_1 )
            {
             before(grammarAccess.getAttributeAccess().getCollumnNameAssignment_7_1()); 
            // InternalSecurityDsl.g:2480:2: ( rule__Attribute__CollumnNameAssignment_7_1 )
            // InternalSecurityDsl.g:2480:3: rule__Attribute__CollumnNameAssignment_7_1
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
    // InternalSecurityDsl.g:2489:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2493:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // InternalSecurityDsl.g:2494:2: rule__Role__Group__0__Impl rule__Role__Group__1
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
    // InternalSecurityDsl.g:2501:1: rule__Role__Group__0__Impl : ( () ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2505:1: ( ( () ) )
            // InternalSecurityDsl.g:2506:1: ( () )
            {
            // InternalSecurityDsl.g:2506:1: ( () )
            // InternalSecurityDsl.g:2507:2: ()
            {
             before(grammarAccess.getRoleAccess().getRoleAction_0()); 
            // InternalSecurityDsl.g:2508:2: ()
            // InternalSecurityDsl.g:2508:3: 
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
    // InternalSecurityDsl.g:2516:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2520:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // InternalSecurityDsl.g:2521:2: rule__Role__Group__1__Impl rule__Role__Group__2
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
    // InternalSecurityDsl.g:2528:1: rule__Role__Group__1__Impl : ( ( rule__Role__Group_1__0 )? ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2532:1: ( ( ( rule__Role__Group_1__0 )? ) )
            // InternalSecurityDsl.g:2533:1: ( ( rule__Role__Group_1__0 )? )
            {
            // InternalSecurityDsl.g:2533:1: ( ( rule__Role__Group_1__0 )? )
            // InternalSecurityDsl.g:2534:2: ( rule__Role__Group_1__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_1()); 
            // InternalSecurityDsl.g:2535:2: ( rule__Role__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==58) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSecurityDsl.g:2535:3: rule__Role__Group_1__0
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
    // InternalSecurityDsl.g:2543:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2547:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // InternalSecurityDsl.g:2548:2: rule__Role__Group__2__Impl rule__Role__Group__3
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
    // InternalSecurityDsl.g:2555:1: rule__Role__Group__2__Impl : ( ( rule__Role__Group_2__0 )? ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2559:1: ( ( ( rule__Role__Group_2__0 )? ) )
            // InternalSecurityDsl.g:2560:1: ( ( rule__Role__Group_2__0 )? )
            {
            // InternalSecurityDsl.g:2560:1: ( ( rule__Role__Group_2__0 )? )
            // InternalSecurityDsl.g:2561:2: ( rule__Role__Group_2__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_2()); 
            // InternalSecurityDsl.g:2562:2: ( rule__Role__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==59) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSecurityDsl.g:2562:3: rule__Role__Group_2__0
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
    // InternalSecurityDsl.g:2570:1: rule__Role__Group__3 : rule__Role__Group__3__Impl ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2574:1: ( rule__Role__Group__3__Impl )
            // InternalSecurityDsl.g:2575:2: rule__Role__Group__3__Impl
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
    // InternalSecurityDsl.g:2581:1: rule__Role__Group__3__Impl : ( ( rule__Role__Group_3__0 )? ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2585:1: ( ( ( rule__Role__Group_3__0 )? ) )
            // InternalSecurityDsl.g:2586:1: ( ( rule__Role__Group_3__0 )? )
            {
            // InternalSecurityDsl.g:2586:1: ( ( rule__Role__Group_3__0 )? )
            // InternalSecurityDsl.g:2587:2: ( rule__Role__Group_3__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_3()); 
            // InternalSecurityDsl.g:2588:2: ( rule__Role__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==63) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSecurityDsl.g:2588:3: rule__Role__Group_3__0
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
    // InternalSecurityDsl.g:2597:1: rule__Role__Group_1__0 : rule__Role__Group_1__0__Impl rule__Role__Group_1__1 ;
    public final void rule__Role__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2601:1: ( rule__Role__Group_1__0__Impl rule__Role__Group_1__1 )
            // InternalSecurityDsl.g:2602:2: rule__Role__Group_1__0__Impl rule__Role__Group_1__1
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
    // InternalSecurityDsl.g:2609:1: rule__Role__Group_1__0__Impl : ( 'tableName:' ) ;
    public final void rule__Role__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2613:1: ( ( 'tableName:' ) )
            // InternalSecurityDsl.g:2614:1: ( 'tableName:' )
            {
            // InternalSecurityDsl.g:2614:1: ( 'tableName:' )
            // InternalSecurityDsl.g:2615:2: 'tableName:'
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
    // InternalSecurityDsl.g:2624:1: rule__Role__Group_1__1 : rule__Role__Group_1__1__Impl ;
    public final void rule__Role__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2628:1: ( rule__Role__Group_1__1__Impl )
            // InternalSecurityDsl.g:2629:2: rule__Role__Group_1__1__Impl
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
    // InternalSecurityDsl.g:2635:1: rule__Role__Group_1__1__Impl : ( ( rule__Role__TableNameAssignment_1_1 ) ) ;
    public final void rule__Role__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2639:1: ( ( ( rule__Role__TableNameAssignment_1_1 ) ) )
            // InternalSecurityDsl.g:2640:1: ( ( rule__Role__TableNameAssignment_1_1 ) )
            {
            // InternalSecurityDsl.g:2640:1: ( ( rule__Role__TableNameAssignment_1_1 ) )
            // InternalSecurityDsl.g:2641:2: ( rule__Role__TableNameAssignment_1_1 )
            {
             before(grammarAccess.getRoleAccess().getTableNameAssignment_1_1()); 
            // InternalSecurityDsl.g:2642:2: ( rule__Role__TableNameAssignment_1_1 )
            // InternalSecurityDsl.g:2642:3: rule__Role__TableNameAssignment_1_1
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
    // InternalSecurityDsl.g:2651:1: rule__Role__Group_2__0 : rule__Role__Group_2__0__Impl rule__Role__Group_2__1 ;
    public final void rule__Role__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2655:1: ( rule__Role__Group_2__0__Impl rule__Role__Group_2__1 )
            // InternalSecurityDsl.g:2656:2: rule__Role__Group_2__0__Impl rule__Role__Group_2__1
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
    // InternalSecurityDsl.g:2663:1: rule__Role__Group_2__0__Impl : ( 'attributes:' ) ;
    public final void rule__Role__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2667:1: ( ( 'attributes:' ) )
            // InternalSecurityDsl.g:2668:1: ( 'attributes:' )
            {
            // InternalSecurityDsl.g:2668:1: ( 'attributes:' )
            // InternalSecurityDsl.g:2669:2: 'attributes:'
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
    // InternalSecurityDsl.g:2678:1: rule__Role__Group_2__1 : rule__Role__Group_2__1__Impl rule__Role__Group_2__2 ;
    public final void rule__Role__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2682:1: ( rule__Role__Group_2__1__Impl rule__Role__Group_2__2 )
            // InternalSecurityDsl.g:2683:2: rule__Role__Group_2__1__Impl rule__Role__Group_2__2
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
    // InternalSecurityDsl.g:2690:1: rule__Role__Group_2__1__Impl : ( '[' ) ;
    public final void rule__Role__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2694:1: ( ( '[' ) )
            // InternalSecurityDsl.g:2695:1: ( '[' )
            {
            // InternalSecurityDsl.g:2695:1: ( '[' )
            // InternalSecurityDsl.g:2696:2: '['
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
    // InternalSecurityDsl.g:2705:1: rule__Role__Group_2__2 : rule__Role__Group_2__2__Impl rule__Role__Group_2__3 ;
    public final void rule__Role__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2709:1: ( rule__Role__Group_2__2__Impl rule__Role__Group_2__3 )
            // InternalSecurityDsl.g:2710:2: rule__Role__Group_2__2__Impl rule__Role__Group_2__3
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
    // InternalSecurityDsl.g:2717:1: rule__Role__Group_2__2__Impl : ( ( rule__Role__Model_attributesAssignment_2_2 ) ) ;
    public final void rule__Role__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2721:1: ( ( ( rule__Role__Model_attributesAssignment_2_2 ) ) )
            // InternalSecurityDsl.g:2722:1: ( ( rule__Role__Model_attributesAssignment_2_2 ) )
            {
            // InternalSecurityDsl.g:2722:1: ( ( rule__Role__Model_attributesAssignment_2_2 ) )
            // InternalSecurityDsl.g:2723:2: ( rule__Role__Model_attributesAssignment_2_2 )
            {
             before(grammarAccess.getRoleAccess().getModel_attributesAssignment_2_2()); 
            // InternalSecurityDsl.g:2724:2: ( rule__Role__Model_attributesAssignment_2_2 )
            // InternalSecurityDsl.g:2724:3: rule__Role__Model_attributesAssignment_2_2
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
    // InternalSecurityDsl.g:2732:1: rule__Role__Group_2__3 : rule__Role__Group_2__3__Impl rule__Role__Group_2__4 ;
    public final void rule__Role__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2736:1: ( rule__Role__Group_2__3__Impl rule__Role__Group_2__4 )
            // InternalSecurityDsl.g:2737:2: rule__Role__Group_2__3__Impl rule__Role__Group_2__4
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
    // InternalSecurityDsl.g:2744:1: rule__Role__Group_2__3__Impl : ( ( rule__Role__Group_2_3__0 )* ) ;
    public final void rule__Role__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2748:1: ( ( ( rule__Role__Group_2_3__0 )* ) )
            // InternalSecurityDsl.g:2749:1: ( ( rule__Role__Group_2_3__0 )* )
            {
            // InternalSecurityDsl.g:2749:1: ( ( rule__Role__Group_2_3__0 )* )
            // InternalSecurityDsl.g:2750:2: ( rule__Role__Group_2_3__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_2_3()); 
            // InternalSecurityDsl.g:2751:2: ( rule__Role__Group_2_3__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==62) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSecurityDsl.g:2751:3: rule__Role__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Role__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalSecurityDsl.g:2759:1: rule__Role__Group_2__4 : rule__Role__Group_2__4__Impl ;
    public final void rule__Role__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2763:1: ( rule__Role__Group_2__4__Impl )
            // InternalSecurityDsl.g:2764:2: rule__Role__Group_2__4__Impl
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
    // InternalSecurityDsl.g:2770:1: rule__Role__Group_2__4__Impl : ( ']' ) ;
    public final void rule__Role__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2774:1: ( ( ']' ) )
            // InternalSecurityDsl.g:2775:1: ( ']' )
            {
            // InternalSecurityDsl.g:2775:1: ( ']' )
            // InternalSecurityDsl.g:2776:2: ']'
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
    // InternalSecurityDsl.g:2786:1: rule__Role__Group_2_3__0 : rule__Role__Group_2_3__0__Impl rule__Role__Group_2_3__1 ;
    public final void rule__Role__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2790:1: ( rule__Role__Group_2_3__0__Impl rule__Role__Group_2_3__1 )
            // InternalSecurityDsl.g:2791:2: rule__Role__Group_2_3__0__Impl rule__Role__Group_2_3__1
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
    // InternalSecurityDsl.g:2798:1: rule__Role__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__Role__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2802:1: ( ( ',' ) )
            // InternalSecurityDsl.g:2803:1: ( ',' )
            {
            // InternalSecurityDsl.g:2803:1: ( ',' )
            // InternalSecurityDsl.g:2804:2: ','
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
    // InternalSecurityDsl.g:2813:1: rule__Role__Group_2_3__1 : rule__Role__Group_2_3__1__Impl ;
    public final void rule__Role__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2817:1: ( rule__Role__Group_2_3__1__Impl )
            // InternalSecurityDsl.g:2818:2: rule__Role__Group_2_3__1__Impl
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
    // InternalSecurityDsl.g:2824:1: rule__Role__Group_2_3__1__Impl : ( ( rule__Role__Model_attributesAssignment_2_3_1 ) ) ;
    public final void rule__Role__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2828:1: ( ( ( rule__Role__Model_attributesAssignment_2_3_1 ) ) )
            // InternalSecurityDsl.g:2829:1: ( ( rule__Role__Model_attributesAssignment_2_3_1 ) )
            {
            // InternalSecurityDsl.g:2829:1: ( ( rule__Role__Model_attributesAssignment_2_3_1 ) )
            // InternalSecurityDsl.g:2830:2: ( rule__Role__Model_attributesAssignment_2_3_1 )
            {
             before(grammarAccess.getRoleAccess().getModel_attributesAssignment_2_3_1()); 
            // InternalSecurityDsl.g:2831:2: ( rule__Role__Model_attributesAssignment_2_3_1 )
            // InternalSecurityDsl.g:2831:3: rule__Role__Model_attributesAssignment_2_3_1
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
    // InternalSecurityDsl.g:2840:1: rule__Role__Group_3__0 : rule__Role__Group_3__0__Impl rule__Role__Group_3__1 ;
    public final void rule__Role__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2844:1: ( rule__Role__Group_3__0__Impl rule__Role__Group_3__1 )
            // InternalSecurityDsl.g:2845:2: rule__Role__Group_3__0__Impl rule__Role__Group_3__1
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
    // InternalSecurityDsl.g:2852:1: rule__Role__Group_3__0__Impl : ( 'roles:' ) ;
    public final void rule__Role__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2856:1: ( ( 'roles:' ) )
            // InternalSecurityDsl.g:2857:1: ( 'roles:' )
            {
            // InternalSecurityDsl.g:2857:1: ( 'roles:' )
            // InternalSecurityDsl.g:2858:2: 'roles:'
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
    // InternalSecurityDsl.g:2867:1: rule__Role__Group_3__1 : rule__Role__Group_3__1__Impl rule__Role__Group_3__2 ;
    public final void rule__Role__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2871:1: ( rule__Role__Group_3__1__Impl rule__Role__Group_3__2 )
            // InternalSecurityDsl.g:2872:2: rule__Role__Group_3__1__Impl rule__Role__Group_3__2
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
    // InternalSecurityDsl.g:2879:1: rule__Role__Group_3__1__Impl : ( '[' ) ;
    public final void rule__Role__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2883:1: ( ( '[' ) )
            // InternalSecurityDsl.g:2884:1: ( '[' )
            {
            // InternalSecurityDsl.g:2884:1: ( '[' )
            // InternalSecurityDsl.g:2885:2: '['
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
    // InternalSecurityDsl.g:2894:1: rule__Role__Group_3__2 : rule__Role__Group_3__2__Impl rule__Role__Group_3__3 ;
    public final void rule__Role__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2898:1: ( rule__Role__Group_3__2__Impl rule__Role__Group_3__3 )
            // InternalSecurityDsl.g:2899:2: rule__Role__Group_3__2__Impl rule__Role__Group_3__3
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
    // InternalSecurityDsl.g:2906:1: rule__Role__Group_3__2__Impl : ( ( rule__Role__Role_instancesAssignment_3_2 ) ) ;
    public final void rule__Role__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2910:1: ( ( ( rule__Role__Role_instancesAssignment_3_2 ) ) )
            // InternalSecurityDsl.g:2911:1: ( ( rule__Role__Role_instancesAssignment_3_2 ) )
            {
            // InternalSecurityDsl.g:2911:1: ( ( rule__Role__Role_instancesAssignment_3_2 ) )
            // InternalSecurityDsl.g:2912:2: ( rule__Role__Role_instancesAssignment_3_2 )
            {
             before(grammarAccess.getRoleAccess().getRole_instancesAssignment_3_2()); 
            // InternalSecurityDsl.g:2913:2: ( rule__Role__Role_instancesAssignment_3_2 )
            // InternalSecurityDsl.g:2913:3: rule__Role__Role_instancesAssignment_3_2
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
    // InternalSecurityDsl.g:2921:1: rule__Role__Group_3__3 : rule__Role__Group_3__3__Impl rule__Role__Group_3__4 ;
    public final void rule__Role__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2925:1: ( rule__Role__Group_3__3__Impl rule__Role__Group_3__4 )
            // InternalSecurityDsl.g:2926:2: rule__Role__Group_3__3__Impl rule__Role__Group_3__4
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
    // InternalSecurityDsl.g:2933:1: rule__Role__Group_3__3__Impl : ( ( rule__Role__Group_3_3__0 )* ) ;
    public final void rule__Role__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2937:1: ( ( ( rule__Role__Group_3_3__0 )* ) )
            // InternalSecurityDsl.g:2938:1: ( ( rule__Role__Group_3_3__0 )* )
            {
            // InternalSecurityDsl.g:2938:1: ( ( rule__Role__Group_3_3__0 )* )
            // InternalSecurityDsl.g:2939:2: ( rule__Role__Group_3_3__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_3_3()); 
            // InternalSecurityDsl.g:2940:2: ( rule__Role__Group_3_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==62) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSecurityDsl.g:2940:3: rule__Role__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Role__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalSecurityDsl.g:2948:1: rule__Role__Group_3__4 : rule__Role__Group_3__4__Impl ;
    public final void rule__Role__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2952:1: ( rule__Role__Group_3__4__Impl )
            // InternalSecurityDsl.g:2953:2: rule__Role__Group_3__4__Impl
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
    // InternalSecurityDsl.g:2959:1: rule__Role__Group_3__4__Impl : ( ']' ) ;
    public final void rule__Role__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2963:1: ( ( ']' ) )
            // InternalSecurityDsl.g:2964:1: ( ']' )
            {
            // InternalSecurityDsl.g:2964:1: ( ']' )
            // InternalSecurityDsl.g:2965:2: ']'
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
    // InternalSecurityDsl.g:2975:1: rule__Role__Group_3_3__0 : rule__Role__Group_3_3__0__Impl rule__Role__Group_3_3__1 ;
    public final void rule__Role__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2979:1: ( rule__Role__Group_3_3__0__Impl rule__Role__Group_3_3__1 )
            // InternalSecurityDsl.g:2980:2: rule__Role__Group_3_3__0__Impl rule__Role__Group_3_3__1
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
    // InternalSecurityDsl.g:2987:1: rule__Role__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Role__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2991:1: ( ( ',' ) )
            // InternalSecurityDsl.g:2992:1: ( ',' )
            {
            // InternalSecurityDsl.g:2992:1: ( ',' )
            // InternalSecurityDsl.g:2993:2: ','
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
    // InternalSecurityDsl.g:3002:1: rule__Role__Group_3_3__1 : rule__Role__Group_3_3__1__Impl ;
    public final void rule__Role__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3006:1: ( rule__Role__Group_3_3__1__Impl )
            // InternalSecurityDsl.g:3007:2: rule__Role__Group_3_3__1__Impl
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
    // InternalSecurityDsl.g:3013:1: rule__Role__Group_3_3__1__Impl : ( ( rule__Role__Role_instancesAssignment_3_3_1 ) ) ;
    public final void rule__Role__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3017:1: ( ( ( rule__Role__Role_instancesAssignment_3_3_1 ) ) )
            // InternalSecurityDsl.g:3018:1: ( ( rule__Role__Role_instancesAssignment_3_3_1 ) )
            {
            // InternalSecurityDsl.g:3018:1: ( ( rule__Role__Role_instancesAssignment_3_3_1 ) )
            // InternalSecurityDsl.g:3019:2: ( rule__Role__Role_instancesAssignment_3_3_1 )
            {
             before(grammarAccess.getRoleAccess().getRole_instancesAssignment_3_3_1()); 
            // InternalSecurityDsl.g:3020:2: ( rule__Role__Role_instancesAssignment_3_3_1 )
            // InternalSecurityDsl.g:3020:3: rule__Role__Role_instancesAssignment_3_3_1
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
    // InternalSecurityDsl.g:3029:1: rule__User__Group__0 : rule__User__Group__0__Impl rule__User__Group__1 ;
    public final void rule__User__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3033:1: ( rule__User__Group__0__Impl rule__User__Group__1 )
            // InternalSecurityDsl.g:3034:2: rule__User__Group__0__Impl rule__User__Group__1
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
    // InternalSecurityDsl.g:3041:1: rule__User__Group__0__Impl : ( () ) ;
    public final void rule__User__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3045:1: ( ( () ) )
            // InternalSecurityDsl.g:3046:1: ( () )
            {
            // InternalSecurityDsl.g:3046:1: ( () )
            // InternalSecurityDsl.g:3047:2: ()
            {
             before(grammarAccess.getUserAccess().getUserAction_0()); 
            // InternalSecurityDsl.g:3048:2: ()
            // InternalSecurityDsl.g:3048:3: 
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
    // InternalSecurityDsl.g:3056:1: rule__User__Group__1 : rule__User__Group__1__Impl rule__User__Group__2 ;
    public final void rule__User__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3060:1: ( rule__User__Group__1__Impl rule__User__Group__2 )
            // InternalSecurityDsl.g:3061:2: rule__User__Group__1__Impl rule__User__Group__2
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
    // InternalSecurityDsl.g:3068:1: rule__User__Group__1__Impl : ( ( rule__User__Group_1__0 )? ) ;
    public final void rule__User__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3072:1: ( ( ( rule__User__Group_1__0 )? ) )
            // InternalSecurityDsl.g:3073:1: ( ( rule__User__Group_1__0 )? )
            {
            // InternalSecurityDsl.g:3073:1: ( ( rule__User__Group_1__0 )? )
            // InternalSecurityDsl.g:3074:2: ( rule__User__Group_1__0 )?
            {
             before(grammarAccess.getUserAccess().getGroup_1()); 
            // InternalSecurityDsl.g:3075:2: ( rule__User__Group_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==58) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSecurityDsl.g:3075:3: rule__User__Group_1__0
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
    // InternalSecurityDsl.g:3083:1: rule__User__Group__2 : rule__User__Group__2__Impl ;
    public final void rule__User__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3087:1: ( rule__User__Group__2__Impl )
            // InternalSecurityDsl.g:3088:2: rule__User__Group__2__Impl
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
    // InternalSecurityDsl.g:3094:1: rule__User__Group__2__Impl : ( ( rule__User__Group_2__0 )? ) ;
    public final void rule__User__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3098:1: ( ( ( rule__User__Group_2__0 )? ) )
            // InternalSecurityDsl.g:3099:1: ( ( rule__User__Group_2__0 )? )
            {
            // InternalSecurityDsl.g:3099:1: ( ( rule__User__Group_2__0 )? )
            // InternalSecurityDsl.g:3100:2: ( rule__User__Group_2__0 )?
            {
             before(grammarAccess.getUserAccess().getGroup_2()); 
            // InternalSecurityDsl.g:3101:2: ( rule__User__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==59) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSecurityDsl.g:3101:3: rule__User__Group_2__0
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
    // InternalSecurityDsl.g:3110:1: rule__User__Group_1__0 : rule__User__Group_1__0__Impl rule__User__Group_1__1 ;
    public final void rule__User__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3114:1: ( rule__User__Group_1__0__Impl rule__User__Group_1__1 )
            // InternalSecurityDsl.g:3115:2: rule__User__Group_1__0__Impl rule__User__Group_1__1
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
    // InternalSecurityDsl.g:3122:1: rule__User__Group_1__0__Impl : ( 'tableName:' ) ;
    public final void rule__User__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3126:1: ( ( 'tableName:' ) )
            // InternalSecurityDsl.g:3127:1: ( 'tableName:' )
            {
            // InternalSecurityDsl.g:3127:1: ( 'tableName:' )
            // InternalSecurityDsl.g:3128:2: 'tableName:'
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
    // InternalSecurityDsl.g:3137:1: rule__User__Group_1__1 : rule__User__Group_1__1__Impl ;
    public final void rule__User__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3141:1: ( rule__User__Group_1__1__Impl )
            // InternalSecurityDsl.g:3142:2: rule__User__Group_1__1__Impl
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
    // InternalSecurityDsl.g:3148:1: rule__User__Group_1__1__Impl : ( ( rule__User__TableNameAssignment_1_1 ) ) ;
    public final void rule__User__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3152:1: ( ( ( rule__User__TableNameAssignment_1_1 ) ) )
            // InternalSecurityDsl.g:3153:1: ( ( rule__User__TableNameAssignment_1_1 ) )
            {
            // InternalSecurityDsl.g:3153:1: ( ( rule__User__TableNameAssignment_1_1 ) )
            // InternalSecurityDsl.g:3154:2: ( rule__User__TableNameAssignment_1_1 )
            {
             before(grammarAccess.getUserAccess().getTableNameAssignment_1_1()); 
            // InternalSecurityDsl.g:3155:2: ( rule__User__TableNameAssignment_1_1 )
            // InternalSecurityDsl.g:3155:3: rule__User__TableNameAssignment_1_1
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
    // InternalSecurityDsl.g:3164:1: rule__User__Group_2__0 : rule__User__Group_2__0__Impl rule__User__Group_2__1 ;
    public final void rule__User__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3168:1: ( rule__User__Group_2__0__Impl rule__User__Group_2__1 )
            // InternalSecurityDsl.g:3169:2: rule__User__Group_2__0__Impl rule__User__Group_2__1
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
    // InternalSecurityDsl.g:3176:1: rule__User__Group_2__0__Impl : ( 'attributes:' ) ;
    public final void rule__User__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3180:1: ( ( 'attributes:' ) )
            // InternalSecurityDsl.g:3181:1: ( 'attributes:' )
            {
            // InternalSecurityDsl.g:3181:1: ( 'attributes:' )
            // InternalSecurityDsl.g:3182:2: 'attributes:'
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
    // InternalSecurityDsl.g:3191:1: rule__User__Group_2__1 : rule__User__Group_2__1__Impl rule__User__Group_2__2 ;
    public final void rule__User__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3195:1: ( rule__User__Group_2__1__Impl rule__User__Group_2__2 )
            // InternalSecurityDsl.g:3196:2: rule__User__Group_2__1__Impl rule__User__Group_2__2
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
    // InternalSecurityDsl.g:3203:1: rule__User__Group_2__1__Impl : ( '[' ) ;
    public final void rule__User__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3207:1: ( ( '[' ) )
            // InternalSecurityDsl.g:3208:1: ( '[' )
            {
            // InternalSecurityDsl.g:3208:1: ( '[' )
            // InternalSecurityDsl.g:3209:2: '['
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
    // InternalSecurityDsl.g:3218:1: rule__User__Group_2__2 : rule__User__Group_2__2__Impl rule__User__Group_2__3 ;
    public final void rule__User__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3222:1: ( rule__User__Group_2__2__Impl rule__User__Group_2__3 )
            // InternalSecurityDsl.g:3223:2: rule__User__Group_2__2__Impl rule__User__Group_2__3
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
    // InternalSecurityDsl.g:3230:1: rule__User__Group_2__2__Impl : ( ( rule__User__Model_attributesAssignment_2_2 ) ) ;
    public final void rule__User__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3234:1: ( ( ( rule__User__Model_attributesAssignment_2_2 ) ) )
            // InternalSecurityDsl.g:3235:1: ( ( rule__User__Model_attributesAssignment_2_2 ) )
            {
            // InternalSecurityDsl.g:3235:1: ( ( rule__User__Model_attributesAssignment_2_2 ) )
            // InternalSecurityDsl.g:3236:2: ( rule__User__Model_attributesAssignment_2_2 )
            {
             before(grammarAccess.getUserAccess().getModel_attributesAssignment_2_2()); 
            // InternalSecurityDsl.g:3237:2: ( rule__User__Model_attributesAssignment_2_2 )
            // InternalSecurityDsl.g:3237:3: rule__User__Model_attributesAssignment_2_2
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
    // InternalSecurityDsl.g:3245:1: rule__User__Group_2__3 : rule__User__Group_2__3__Impl rule__User__Group_2__4 ;
    public final void rule__User__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3249:1: ( rule__User__Group_2__3__Impl rule__User__Group_2__4 )
            // InternalSecurityDsl.g:3250:2: rule__User__Group_2__3__Impl rule__User__Group_2__4
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
    // InternalSecurityDsl.g:3257:1: rule__User__Group_2__3__Impl : ( ( rule__User__Group_2_3__0 )* ) ;
    public final void rule__User__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3261:1: ( ( ( rule__User__Group_2_3__0 )* ) )
            // InternalSecurityDsl.g:3262:1: ( ( rule__User__Group_2_3__0 )* )
            {
            // InternalSecurityDsl.g:3262:1: ( ( rule__User__Group_2_3__0 )* )
            // InternalSecurityDsl.g:3263:2: ( rule__User__Group_2_3__0 )*
            {
             before(grammarAccess.getUserAccess().getGroup_2_3()); 
            // InternalSecurityDsl.g:3264:2: ( rule__User__Group_2_3__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==62) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalSecurityDsl.g:3264:3: rule__User__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__User__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalSecurityDsl.g:3272:1: rule__User__Group_2__4 : rule__User__Group_2__4__Impl ;
    public final void rule__User__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3276:1: ( rule__User__Group_2__4__Impl )
            // InternalSecurityDsl.g:3277:2: rule__User__Group_2__4__Impl
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
    // InternalSecurityDsl.g:3283:1: rule__User__Group_2__4__Impl : ( ']' ) ;
    public final void rule__User__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3287:1: ( ( ']' ) )
            // InternalSecurityDsl.g:3288:1: ( ']' )
            {
            // InternalSecurityDsl.g:3288:1: ( ']' )
            // InternalSecurityDsl.g:3289:2: ']'
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
    // InternalSecurityDsl.g:3299:1: rule__User__Group_2_3__0 : rule__User__Group_2_3__0__Impl rule__User__Group_2_3__1 ;
    public final void rule__User__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3303:1: ( rule__User__Group_2_3__0__Impl rule__User__Group_2_3__1 )
            // InternalSecurityDsl.g:3304:2: rule__User__Group_2_3__0__Impl rule__User__Group_2_3__1
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
    // InternalSecurityDsl.g:3311:1: rule__User__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__User__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3315:1: ( ( ',' ) )
            // InternalSecurityDsl.g:3316:1: ( ',' )
            {
            // InternalSecurityDsl.g:3316:1: ( ',' )
            // InternalSecurityDsl.g:3317:2: ','
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
    // InternalSecurityDsl.g:3326:1: rule__User__Group_2_3__1 : rule__User__Group_2_3__1__Impl ;
    public final void rule__User__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3330:1: ( rule__User__Group_2_3__1__Impl )
            // InternalSecurityDsl.g:3331:2: rule__User__Group_2_3__1__Impl
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
    // InternalSecurityDsl.g:3337:1: rule__User__Group_2_3__1__Impl : ( ( rule__User__Model_attributesAssignment_2_3_1 ) ) ;
    public final void rule__User__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3341:1: ( ( ( rule__User__Model_attributesAssignment_2_3_1 ) ) )
            // InternalSecurityDsl.g:3342:1: ( ( rule__User__Model_attributesAssignment_2_3_1 ) )
            {
            // InternalSecurityDsl.g:3342:1: ( ( rule__User__Model_attributesAssignment_2_3_1 ) )
            // InternalSecurityDsl.g:3343:2: ( rule__User__Model_attributesAssignment_2_3_1 )
            {
             before(grammarAccess.getUserAccess().getModel_attributesAssignment_2_3_1()); 
            // InternalSecurityDsl.g:3344:2: ( rule__User__Model_attributesAssignment_2_3_1 )
            // InternalSecurityDsl.g:3344:3: rule__User__Model_attributesAssignment_2_3_1
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
    // InternalSecurityDsl.g:3353:1: rule__RoleInstance__Group__0 : rule__RoleInstance__Group__0__Impl rule__RoleInstance__Group__1 ;
    public final void rule__RoleInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3357:1: ( rule__RoleInstance__Group__0__Impl rule__RoleInstance__Group__1 )
            // InternalSecurityDsl.g:3358:2: rule__RoleInstance__Group__0__Impl rule__RoleInstance__Group__1
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
    // InternalSecurityDsl.g:3365:1: rule__RoleInstance__Group__0__Impl : ( () ) ;
    public final void rule__RoleInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3369:1: ( ( () ) )
            // InternalSecurityDsl.g:3370:1: ( () )
            {
            // InternalSecurityDsl.g:3370:1: ( () )
            // InternalSecurityDsl.g:3371:2: ()
            {
             before(grammarAccess.getRoleInstanceAccess().getRoleInstanceAction_0()); 
            // InternalSecurityDsl.g:3372:2: ()
            // InternalSecurityDsl.g:3372:3: 
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
    // InternalSecurityDsl.g:3380:1: rule__RoleInstance__Group__1 : rule__RoleInstance__Group__1__Impl ;
    public final void rule__RoleInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3384:1: ( rule__RoleInstance__Group__1__Impl )
            // InternalSecurityDsl.g:3385:2: rule__RoleInstance__Group__1__Impl
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
    // InternalSecurityDsl.g:3391:1: rule__RoleInstance__Group__1__Impl : ( ( rule__RoleInstance__NameAssignment_1 ) ) ;
    public final void rule__RoleInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3395:1: ( ( ( rule__RoleInstance__NameAssignment_1 ) ) )
            // InternalSecurityDsl.g:3396:1: ( ( rule__RoleInstance__NameAssignment_1 ) )
            {
            // InternalSecurityDsl.g:3396:1: ( ( rule__RoleInstance__NameAssignment_1 ) )
            // InternalSecurityDsl.g:3397:2: ( rule__RoleInstance__NameAssignment_1 )
            {
             before(grammarAccess.getRoleInstanceAccess().getNameAssignment_1()); 
            // InternalSecurityDsl.g:3398:2: ( rule__RoleInstance__NameAssignment_1 )
            // InternalSecurityDsl.g:3398:3: rule__RoleInstance__NameAssignment_1
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
    // InternalSecurityDsl.g:3407:1: rule__Endpoint__Group__0 : rule__Endpoint__Group__0__Impl rule__Endpoint__Group__1 ;
    public final void rule__Endpoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3411:1: ( rule__Endpoint__Group__0__Impl rule__Endpoint__Group__1 )
            // InternalSecurityDsl.g:3412:2: rule__Endpoint__Group__0__Impl rule__Endpoint__Group__1
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
    // InternalSecurityDsl.g:3419:1: rule__Endpoint__Group__0__Impl : ( '{' ) ;
    public final void rule__Endpoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3423:1: ( ( '{' ) )
            // InternalSecurityDsl.g:3424:1: ( '{' )
            {
            // InternalSecurityDsl.g:3424:1: ( '{' )
            // InternalSecurityDsl.g:3425:2: '{'
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
    // InternalSecurityDsl.g:3434:1: rule__Endpoint__Group__1 : rule__Endpoint__Group__1__Impl rule__Endpoint__Group__2 ;
    public final void rule__Endpoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3438:1: ( rule__Endpoint__Group__1__Impl rule__Endpoint__Group__2 )
            // InternalSecurityDsl.g:3439:2: rule__Endpoint__Group__1__Impl rule__Endpoint__Group__2
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
    // InternalSecurityDsl.g:3446:1: rule__Endpoint__Group__1__Impl : ( 'url:' ) ;
    public final void rule__Endpoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3450:1: ( ( 'url:' ) )
            // InternalSecurityDsl.g:3451:1: ( 'url:' )
            {
            // InternalSecurityDsl.g:3451:1: ( 'url:' )
            // InternalSecurityDsl.g:3452:2: 'url:'
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
    // InternalSecurityDsl.g:3461:1: rule__Endpoint__Group__2 : rule__Endpoint__Group__2__Impl rule__Endpoint__Group__3 ;
    public final void rule__Endpoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3465:1: ( rule__Endpoint__Group__2__Impl rule__Endpoint__Group__3 )
            // InternalSecurityDsl.g:3466:2: rule__Endpoint__Group__2__Impl rule__Endpoint__Group__3
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
    // InternalSecurityDsl.g:3473:1: rule__Endpoint__Group__2__Impl : ( ( rule__Endpoint__UrlAssignment_2 ) ) ;
    public final void rule__Endpoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3477:1: ( ( ( rule__Endpoint__UrlAssignment_2 ) ) )
            // InternalSecurityDsl.g:3478:1: ( ( rule__Endpoint__UrlAssignment_2 ) )
            {
            // InternalSecurityDsl.g:3478:1: ( ( rule__Endpoint__UrlAssignment_2 ) )
            // InternalSecurityDsl.g:3479:2: ( rule__Endpoint__UrlAssignment_2 )
            {
             before(grammarAccess.getEndpointAccess().getUrlAssignment_2()); 
            // InternalSecurityDsl.g:3480:2: ( rule__Endpoint__UrlAssignment_2 )
            // InternalSecurityDsl.g:3480:3: rule__Endpoint__UrlAssignment_2
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
    // InternalSecurityDsl.g:3488:1: rule__Endpoint__Group__3 : rule__Endpoint__Group__3__Impl rule__Endpoint__Group__4 ;
    public final void rule__Endpoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3492:1: ( rule__Endpoint__Group__3__Impl rule__Endpoint__Group__4 )
            // InternalSecurityDsl.g:3493:2: rule__Endpoint__Group__3__Impl rule__Endpoint__Group__4
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
    // InternalSecurityDsl.g:3500:1: rule__Endpoint__Group__3__Impl : ( ( rule__Endpoint__Group_3__0 )? ) ;
    public final void rule__Endpoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3504:1: ( ( ( rule__Endpoint__Group_3__0 )? ) )
            // InternalSecurityDsl.g:3505:1: ( ( rule__Endpoint__Group_3__0 )? )
            {
            // InternalSecurityDsl.g:3505:1: ( ( rule__Endpoint__Group_3__0 )? )
            // InternalSecurityDsl.g:3506:2: ( rule__Endpoint__Group_3__0 )?
            {
             before(grammarAccess.getEndpointAccess().getGroup_3()); 
            // InternalSecurityDsl.g:3507:2: ( rule__Endpoint__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==64) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSecurityDsl.g:3507:3: rule__Endpoint__Group_3__0
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
    // InternalSecurityDsl.g:3515:1: rule__Endpoint__Group__4 : rule__Endpoint__Group__4__Impl rule__Endpoint__Group__5 ;
    public final void rule__Endpoint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3519:1: ( rule__Endpoint__Group__4__Impl rule__Endpoint__Group__5 )
            // InternalSecurityDsl.g:3520:2: rule__Endpoint__Group__4__Impl rule__Endpoint__Group__5
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
    // InternalSecurityDsl.g:3527:1: rule__Endpoint__Group__4__Impl : ( ( rule__Endpoint__Group_4__0 )? ) ;
    public final void rule__Endpoint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3531:1: ( ( ( rule__Endpoint__Group_4__0 )? ) )
            // InternalSecurityDsl.g:3532:1: ( ( rule__Endpoint__Group_4__0 )? )
            {
            // InternalSecurityDsl.g:3532:1: ( ( rule__Endpoint__Group_4__0 )? )
            // InternalSecurityDsl.g:3533:2: ( rule__Endpoint__Group_4__0 )?
            {
             before(grammarAccess.getEndpointAccess().getGroup_4()); 
            // InternalSecurityDsl.g:3534:2: ( rule__Endpoint__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==65) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSecurityDsl.g:3534:3: rule__Endpoint__Group_4__0
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
    // InternalSecurityDsl.g:3542:1: rule__Endpoint__Group__5 : rule__Endpoint__Group__5__Impl rule__Endpoint__Group__6 ;
    public final void rule__Endpoint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3546:1: ( rule__Endpoint__Group__5__Impl rule__Endpoint__Group__6 )
            // InternalSecurityDsl.g:3547:2: rule__Endpoint__Group__5__Impl rule__Endpoint__Group__6
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
    // InternalSecurityDsl.g:3554:1: rule__Endpoint__Group__5__Impl : ( ( rule__Endpoint__Group_5__0 )? ) ;
    public final void rule__Endpoint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3558:1: ( ( ( rule__Endpoint__Group_5__0 )? ) )
            // InternalSecurityDsl.g:3559:1: ( ( rule__Endpoint__Group_5__0 )? )
            {
            // InternalSecurityDsl.g:3559:1: ( ( rule__Endpoint__Group_5__0 )? )
            // InternalSecurityDsl.g:3560:2: ( rule__Endpoint__Group_5__0 )?
            {
             before(grammarAccess.getEndpointAccess().getGroup_5()); 
            // InternalSecurityDsl.g:3561:2: ( rule__Endpoint__Group_5__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==55) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSecurityDsl.g:3561:3: rule__Endpoint__Group_5__0
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
    // InternalSecurityDsl.g:3569:1: rule__Endpoint__Group__6 : rule__Endpoint__Group__6__Impl rule__Endpoint__Group__7 ;
    public final void rule__Endpoint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3573:1: ( rule__Endpoint__Group__6__Impl rule__Endpoint__Group__7 )
            // InternalSecurityDsl.g:3574:2: rule__Endpoint__Group__6__Impl rule__Endpoint__Group__7
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
    // InternalSecurityDsl.g:3581:1: rule__Endpoint__Group__6__Impl : ( ( rule__Endpoint__Group_6__0 )? ) ;
    public final void rule__Endpoint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3585:1: ( ( ( rule__Endpoint__Group_6__0 )? ) )
            // InternalSecurityDsl.g:3586:1: ( ( rule__Endpoint__Group_6__0 )? )
            {
            // InternalSecurityDsl.g:3586:1: ( ( rule__Endpoint__Group_6__0 )? )
            // InternalSecurityDsl.g:3587:2: ( rule__Endpoint__Group_6__0 )?
            {
             before(grammarAccess.getEndpointAccess().getGroup_6()); 
            // InternalSecurityDsl.g:3588:2: ( rule__Endpoint__Group_6__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==66) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSecurityDsl.g:3588:3: rule__Endpoint__Group_6__0
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
    // InternalSecurityDsl.g:3596:1: rule__Endpoint__Group__7 : rule__Endpoint__Group__7__Impl ;
    public final void rule__Endpoint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3600:1: ( rule__Endpoint__Group__7__Impl )
            // InternalSecurityDsl.g:3601:2: rule__Endpoint__Group__7__Impl
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
    // InternalSecurityDsl.g:3607:1: rule__Endpoint__Group__7__Impl : ( '}' ) ;
    public final void rule__Endpoint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3611:1: ( ( '}' ) )
            // InternalSecurityDsl.g:3612:1: ( '}' )
            {
            // InternalSecurityDsl.g:3612:1: ( '}' )
            // InternalSecurityDsl.g:3613:2: '}'
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
    // InternalSecurityDsl.g:3623:1: rule__Endpoint__Group_3__0 : rule__Endpoint__Group_3__0__Impl rule__Endpoint__Group_3__1 ;
    public final void rule__Endpoint__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3627:1: ( rule__Endpoint__Group_3__0__Impl rule__Endpoint__Group_3__1 )
            // InternalSecurityDsl.g:3628:2: rule__Endpoint__Group_3__0__Impl rule__Endpoint__Group_3__1
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
    // InternalSecurityDsl.g:3635:1: rule__Endpoint__Group_3__0__Impl : ( 'functionName:' ) ;
    public final void rule__Endpoint__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3639:1: ( ( 'functionName:' ) )
            // InternalSecurityDsl.g:3640:1: ( 'functionName:' )
            {
            // InternalSecurityDsl.g:3640:1: ( 'functionName:' )
            // InternalSecurityDsl.g:3641:2: 'functionName:'
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
    // InternalSecurityDsl.g:3650:1: rule__Endpoint__Group_3__1 : rule__Endpoint__Group_3__1__Impl ;
    public final void rule__Endpoint__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3654:1: ( rule__Endpoint__Group_3__1__Impl )
            // InternalSecurityDsl.g:3655:2: rule__Endpoint__Group_3__1__Impl
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
    // InternalSecurityDsl.g:3661:1: rule__Endpoint__Group_3__1__Impl : ( ( rule__Endpoint__FunctionNameAssignment_3_1 ) ) ;
    public final void rule__Endpoint__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3665:1: ( ( ( rule__Endpoint__FunctionNameAssignment_3_1 ) ) )
            // InternalSecurityDsl.g:3666:1: ( ( rule__Endpoint__FunctionNameAssignment_3_1 ) )
            {
            // InternalSecurityDsl.g:3666:1: ( ( rule__Endpoint__FunctionNameAssignment_3_1 ) )
            // InternalSecurityDsl.g:3667:2: ( rule__Endpoint__FunctionNameAssignment_3_1 )
            {
             before(grammarAccess.getEndpointAccess().getFunctionNameAssignment_3_1()); 
            // InternalSecurityDsl.g:3668:2: ( rule__Endpoint__FunctionNameAssignment_3_1 )
            // InternalSecurityDsl.g:3668:3: rule__Endpoint__FunctionNameAssignment_3_1
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
    // InternalSecurityDsl.g:3677:1: rule__Endpoint__Group_4__0 : rule__Endpoint__Group_4__0__Impl rule__Endpoint__Group_4__1 ;
    public final void rule__Endpoint__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3681:1: ( rule__Endpoint__Group_4__0__Impl rule__Endpoint__Group_4__1 )
            // InternalSecurityDsl.g:3682:2: rule__Endpoint__Group_4__0__Impl rule__Endpoint__Group_4__1
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
    // InternalSecurityDsl.g:3689:1: rule__Endpoint__Group_4__0__Impl : ( 'method:' ) ;
    public final void rule__Endpoint__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3693:1: ( ( 'method:' ) )
            // InternalSecurityDsl.g:3694:1: ( 'method:' )
            {
            // InternalSecurityDsl.g:3694:1: ( 'method:' )
            // InternalSecurityDsl.g:3695:2: 'method:'
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
    // InternalSecurityDsl.g:3704:1: rule__Endpoint__Group_4__1 : rule__Endpoint__Group_4__1__Impl ;
    public final void rule__Endpoint__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3708:1: ( rule__Endpoint__Group_4__1__Impl )
            // InternalSecurityDsl.g:3709:2: rule__Endpoint__Group_4__1__Impl
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
    // InternalSecurityDsl.g:3715:1: rule__Endpoint__Group_4__1__Impl : ( ( rule__Endpoint__MethodAssignment_4_1 ) ) ;
    public final void rule__Endpoint__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3719:1: ( ( ( rule__Endpoint__MethodAssignment_4_1 ) ) )
            // InternalSecurityDsl.g:3720:1: ( ( rule__Endpoint__MethodAssignment_4_1 ) )
            {
            // InternalSecurityDsl.g:3720:1: ( ( rule__Endpoint__MethodAssignment_4_1 ) )
            // InternalSecurityDsl.g:3721:2: ( rule__Endpoint__MethodAssignment_4_1 )
            {
             before(grammarAccess.getEndpointAccess().getMethodAssignment_4_1()); 
            // InternalSecurityDsl.g:3722:2: ( rule__Endpoint__MethodAssignment_4_1 )
            // InternalSecurityDsl.g:3722:3: rule__Endpoint__MethodAssignment_4_1
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
    // InternalSecurityDsl.g:3731:1: rule__Endpoint__Group_5__0 : rule__Endpoint__Group_5__0__Impl rule__Endpoint__Group_5__1 ;
    public final void rule__Endpoint__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3735:1: ( rule__Endpoint__Group_5__0__Impl rule__Endpoint__Group_5__1 )
            // InternalSecurityDsl.g:3736:2: rule__Endpoint__Group_5__0__Impl rule__Endpoint__Group_5__1
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
    // InternalSecurityDsl.g:3743:1: rule__Endpoint__Group_5__0__Impl : ( 'type:' ) ;
    public final void rule__Endpoint__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3747:1: ( ( 'type:' ) )
            // InternalSecurityDsl.g:3748:1: ( 'type:' )
            {
            // InternalSecurityDsl.g:3748:1: ( 'type:' )
            // InternalSecurityDsl.g:3749:2: 'type:'
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
    // InternalSecurityDsl.g:3758:1: rule__Endpoint__Group_5__1 : rule__Endpoint__Group_5__1__Impl ;
    public final void rule__Endpoint__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3762:1: ( rule__Endpoint__Group_5__1__Impl )
            // InternalSecurityDsl.g:3763:2: rule__Endpoint__Group_5__1__Impl
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
    // InternalSecurityDsl.g:3769:1: rule__Endpoint__Group_5__1__Impl : ( ( rule__Endpoint__TypeAssignment_5_1 ) ) ;
    public final void rule__Endpoint__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3773:1: ( ( ( rule__Endpoint__TypeAssignment_5_1 ) ) )
            // InternalSecurityDsl.g:3774:1: ( ( rule__Endpoint__TypeAssignment_5_1 ) )
            {
            // InternalSecurityDsl.g:3774:1: ( ( rule__Endpoint__TypeAssignment_5_1 ) )
            // InternalSecurityDsl.g:3775:2: ( rule__Endpoint__TypeAssignment_5_1 )
            {
             before(grammarAccess.getEndpointAccess().getTypeAssignment_5_1()); 
            // InternalSecurityDsl.g:3776:2: ( rule__Endpoint__TypeAssignment_5_1 )
            // InternalSecurityDsl.g:3776:3: rule__Endpoint__TypeAssignment_5_1
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
    // InternalSecurityDsl.g:3785:1: rule__Endpoint__Group_6__0 : rule__Endpoint__Group_6__0__Impl rule__Endpoint__Group_6__1 ;
    public final void rule__Endpoint__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3789:1: ( rule__Endpoint__Group_6__0__Impl rule__Endpoint__Group_6__1 )
            // InternalSecurityDsl.g:3790:2: rule__Endpoint__Group_6__0__Impl rule__Endpoint__Group_6__1
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
    // InternalSecurityDsl.g:3797:1: rule__Endpoint__Group_6__0__Impl : ( 'roleAuthorities:' ) ;
    public final void rule__Endpoint__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3801:1: ( ( 'roleAuthorities:' ) )
            // InternalSecurityDsl.g:3802:1: ( 'roleAuthorities:' )
            {
            // InternalSecurityDsl.g:3802:1: ( 'roleAuthorities:' )
            // InternalSecurityDsl.g:3803:2: 'roleAuthorities:'
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
    // InternalSecurityDsl.g:3812:1: rule__Endpoint__Group_6__1 : rule__Endpoint__Group_6__1__Impl rule__Endpoint__Group_6__2 ;
    public final void rule__Endpoint__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3816:1: ( rule__Endpoint__Group_6__1__Impl rule__Endpoint__Group_6__2 )
            // InternalSecurityDsl.g:3817:2: rule__Endpoint__Group_6__1__Impl rule__Endpoint__Group_6__2
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
    // InternalSecurityDsl.g:3824:1: rule__Endpoint__Group_6__1__Impl : ( '[' ) ;
    public final void rule__Endpoint__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3828:1: ( ( '[' ) )
            // InternalSecurityDsl.g:3829:1: ( '[' )
            {
            // InternalSecurityDsl.g:3829:1: ( '[' )
            // InternalSecurityDsl.g:3830:2: '['
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
    // InternalSecurityDsl.g:3839:1: rule__Endpoint__Group_6__2 : rule__Endpoint__Group_6__2__Impl rule__Endpoint__Group_6__3 ;
    public final void rule__Endpoint__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3843:1: ( rule__Endpoint__Group_6__2__Impl rule__Endpoint__Group_6__3 )
            // InternalSecurityDsl.g:3844:2: rule__Endpoint__Group_6__2__Impl rule__Endpoint__Group_6__3
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
    // InternalSecurityDsl.g:3851:1: rule__Endpoint__Group_6__2__Impl : ( ( rule__Endpoint__Role_authoritiesAssignment_6_2 ) ) ;
    public final void rule__Endpoint__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3855:1: ( ( ( rule__Endpoint__Role_authoritiesAssignment_6_2 ) ) )
            // InternalSecurityDsl.g:3856:1: ( ( rule__Endpoint__Role_authoritiesAssignment_6_2 ) )
            {
            // InternalSecurityDsl.g:3856:1: ( ( rule__Endpoint__Role_authoritiesAssignment_6_2 ) )
            // InternalSecurityDsl.g:3857:2: ( rule__Endpoint__Role_authoritiesAssignment_6_2 )
            {
             before(grammarAccess.getEndpointAccess().getRole_authoritiesAssignment_6_2()); 
            // InternalSecurityDsl.g:3858:2: ( rule__Endpoint__Role_authoritiesAssignment_6_2 )
            // InternalSecurityDsl.g:3858:3: rule__Endpoint__Role_authoritiesAssignment_6_2
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
    // InternalSecurityDsl.g:3866:1: rule__Endpoint__Group_6__3 : rule__Endpoint__Group_6__3__Impl rule__Endpoint__Group_6__4 ;
    public final void rule__Endpoint__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3870:1: ( rule__Endpoint__Group_6__3__Impl rule__Endpoint__Group_6__4 )
            // InternalSecurityDsl.g:3871:2: rule__Endpoint__Group_6__3__Impl rule__Endpoint__Group_6__4
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
    // InternalSecurityDsl.g:3878:1: rule__Endpoint__Group_6__3__Impl : ( ( rule__Endpoint__Group_6_3__0 )* ) ;
    public final void rule__Endpoint__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3882:1: ( ( ( rule__Endpoint__Group_6_3__0 )* ) )
            // InternalSecurityDsl.g:3883:1: ( ( rule__Endpoint__Group_6_3__0 )* )
            {
            // InternalSecurityDsl.g:3883:1: ( ( rule__Endpoint__Group_6_3__0 )* )
            // InternalSecurityDsl.g:3884:2: ( rule__Endpoint__Group_6_3__0 )*
            {
             before(grammarAccess.getEndpointAccess().getGroup_6_3()); 
            // InternalSecurityDsl.g:3885:2: ( rule__Endpoint__Group_6_3__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==62) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalSecurityDsl.g:3885:3: rule__Endpoint__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Endpoint__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalSecurityDsl.g:3893:1: rule__Endpoint__Group_6__4 : rule__Endpoint__Group_6__4__Impl ;
    public final void rule__Endpoint__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3897:1: ( rule__Endpoint__Group_6__4__Impl )
            // InternalSecurityDsl.g:3898:2: rule__Endpoint__Group_6__4__Impl
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
    // InternalSecurityDsl.g:3904:1: rule__Endpoint__Group_6__4__Impl : ( ']' ) ;
    public final void rule__Endpoint__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3908:1: ( ( ']' ) )
            // InternalSecurityDsl.g:3909:1: ( ']' )
            {
            // InternalSecurityDsl.g:3909:1: ( ']' )
            // InternalSecurityDsl.g:3910:2: ']'
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
    // InternalSecurityDsl.g:3920:1: rule__Endpoint__Group_6_3__0 : rule__Endpoint__Group_6_3__0__Impl rule__Endpoint__Group_6_3__1 ;
    public final void rule__Endpoint__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3924:1: ( rule__Endpoint__Group_6_3__0__Impl rule__Endpoint__Group_6_3__1 )
            // InternalSecurityDsl.g:3925:2: rule__Endpoint__Group_6_3__0__Impl rule__Endpoint__Group_6_3__1
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
    // InternalSecurityDsl.g:3932:1: rule__Endpoint__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Endpoint__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3936:1: ( ( ',' ) )
            // InternalSecurityDsl.g:3937:1: ( ',' )
            {
            // InternalSecurityDsl.g:3937:1: ( ',' )
            // InternalSecurityDsl.g:3938:2: ','
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
    // InternalSecurityDsl.g:3947:1: rule__Endpoint__Group_6_3__1 : rule__Endpoint__Group_6_3__1__Impl ;
    public final void rule__Endpoint__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3951:1: ( rule__Endpoint__Group_6_3__1__Impl )
            // InternalSecurityDsl.g:3952:2: rule__Endpoint__Group_6_3__1__Impl
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
    // InternalSecurityDsl.g:3958:1: rule__Endpoint__Group_6_3__1__Impl : ( ( rule__Endpoint__Role_authoritiesAssignment_6_3_1 ) ) ;
    public final void rule__Endpoint__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3962:1: ( ( ( rule__Endpoint__Role_authoritiesAssignment_6_3_1 ) ) )
            // InternalSecurityDsl.g:3963:1: ( ( rule__Endpoint__Role_authoritiesAssignment_6_3_1 ) )
            {
            // InternalSecurityDsl.g:3963:1: ( ( rule__Endpoint__Role_authoritiesAssignment_6_3_1 ) )
            // InternalSecurityDsl.g:3964:2: ( rule__Endpoint__Role_authoritiesAssignment_6_3_1 )
            {
             before(grammarAccess.getEndpointAccess().getRole_authoritiesAssignment_6_3_1()); 
            // InternalSecurityDsl.g:3965:2: ( rule__Endpoint__Role_authoritiesAssignment_6_3_1 )
            // InternalSecurityDsl.g:3965:3: rule__Endpoint__Role_authoritiesAssignment_6_3_1
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
    // InternalSecurityDsl.g:3974:1: rule__Authentication__Group__0 : rule__Authentication__Group__0__Impl rule__Authentication__Group__1 ;
    public final void rule__Authentication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3978:1: ( rule__Authentication__Group__0__Impl rule__Authentication__Group__1 )
            // InternalSecurityDsl.g:3979:2: rule__Authentication__Group__0__Impl rule__Authentication__Group__1
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
    // InternalSecurityDsl.g:3986:1: rule__Authentication__Group__0__Impl : ( () ) ;
    public final void rule__Authentication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3990:1: ( ( () ) )
            // InternalSecurityDsl.g:3991:1: ( () )
            {
            // InternalSecurityDsl.g:3991:1: ( () )
            // InternalSecurityDsl.g:3992:2: ()
            {
             before(grammarAccess.getAuthenticationAccess().getAuthenticationAction_0()); 
            // InternalSecurityDsl.g:3993:2: ()
            // InternalSecurityDsl.g:3993:3: 
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
    // InternalSecurityDsl.g:4001:1: rule__Authentication__Group__1 : rule__Authentication__Group__1__Impl rule__Authentication__Group__2 ;
    public final void rule__Authentication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4005:1: ( rule__Authentication__Group__1__Impl rule__Authentication__Group__2 )
            // InternalSecurityDsl.g:4006:2: rule__Authentication__Group__1__Impl rule__Authentication__Group__2
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
    // InternalSecurityDsl.g:4013:1: rule__Authentication__Group__1__Impl : ( 'name:' ) ;
    public final void rule__Authentication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4017:1: ( ( 'name:' ) )
            // InternalSecurityDsl.g:4018:1: ( 'name:' )
            {
            // InternalSecurityDsl.g:4018:1: ( 'name:' )
            // InternalSecurityDsl.g:4019:2: 'name:'
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
    // InternalSecurityDsl.g:4028:1: rule__Authentication__Group__2 : rule__Authentication__Group__2__Impl rule__Authentication__Group__3 ;
    public final void rule__Authentication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4032:1: ( rule__Authentication__Group__2__Impl rule__Authentication__Group__3 )
            // InternalSecurityDsl.g:4033:2: rule__Authentication__Group__2__Impl rule__Authentication__Group__3
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
    // InternalSecurityDsl.g:4040:1: rule__Authentication__Group__2__Impl : ( ( rule__Authentication__NameAssignment_2 ) ) ;
    public final void rule__Authentication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4044:1: ( ( ( rule__Authentication__NameAssignment_2 ) ) )
            // InternalSecurityDsl.g:4045:1: ( ( rule__Authentication__NameAssignment_2 ) )
            {
            // InternalSecurityDsl.g:4045:1: ( ( rule__Authentication__NameAssignment_2 ) )
            // InternalSecurityDsl.g:4046:2: ( rule__Authentication__NameAssignment_2 )
            {
             before(grammarAccess.getAuthenticationAccess().getNameAssignment_2()); 
            // InternalSecurityDsl.g:4047:2: ( rule__Authentication__NameAssignment_2 )
            // InternalSecurityDsl.g:4047:3: rule__Authentication__NameAssignment_2
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
    // InternalSecurityDsl.g:4055:1: rule__Authentication__Group__3 : rule__Authentication__Group__3__Impl rule__Authentication__Group__4 ;
    public final void rule__Authentication__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4059:1: ( rule__Authentication__Group__3__Impl rule__Authentication__Group__4 )
            // InternalSecurityDsl.g:4060:2: rule__Authentication__Group__3__Impl rule__Authentication__Group__4
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
    // InternalSecurityDsl.g:4067:1: rule__Authentication__Group__3__Impl : ( 'path:' ) ;
    public final void rule__Authentication__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4071:1: ( ( 'path:' ) )
            // InternalSecurityDsl.g:4072:1: ( 'path:' )
            {
            // InternalSecurityDsl.g:4072:1: ( 'path:' )
            // InternalSecurityDsl.g:4073:2: 'path:'
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
    // InternalSecurityDsl.g:4082:1: rule__Authentication__Group__4 : rule__Authentication__Group__4__Impl rule__Authentication__Group__5 ;
    public final void rule__Authentication__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4086:1: ( rule__Authentication__Group__4__Impl rule__Authentication__Group__5 )
            // InternalSecurityDsl.g:4087:2: rule__Authentication__Group__4__Impl rule__Authentication__Group__5
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
    // InternalSecurityDsl.g:4094:1: rule__Authentication__Group__4__Impl : ( ( rule__Authentication__PathAssignment_4 ) ) ;
    public final void rule__Authentication__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4098:1: ( ( ( rule__Authentication__PathAssignment_4 ) ) )
            // InternalSecurityDsl.g:4099:1: ( ( rule__Authentication__PathAssignment_4 ) )
            {
            // InternalSecurityDsl.g:4099:1: ( ( rule__Authentication__PathAssignment_4 ) )
            // InternalSecurityDsl.g:4100:2: ( rule__Authentication__PathAssignment_4 )
            {
             before(grammarAccess.getAuthenticationAccess().getPathAssignment_4()); 
            // InternalSecurityDsl.g:4101:2: ( rule__Authentication__PathAssignment_4 )
            // InternalSecurityDsl.g:4101:3: rule__Authentication__PathAssignment_4
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
    // InternalSecurityDsl.g:4109:1: rule__Authentication__Group__5 : rule__Authentication__Group__5__Impl ;
    public final void rule__Authentication__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4113:1: ( rule__Authentication__Group__5__Impl )
            // InternalSecurityDsl.g:4114:2: rule__Authentication__Group__5__Impl
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
    // InternalSecurityDsl.g:4120:1: rule__Authentication__Group__5__Impl : ( ( rule__Authentication__Group_5__0 )? ) ;
    public final void rule__Authentication__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4124:1: ( ( ( rule__Authentication__Group_5__0 )? ) )
            // InternalSecurityDsl.g:4125:1: ( ( rule__Authentication__Group_5__0 )? )
            {
            // InternalSecurityDsl.g:4125:1: ( ( rule__Authentication__Group_5__0 )? )
            // InternalSecurityDsl.g:4126:2: ( rule__Authentication__Group_5__0 )?
            {
             before(grammarAccess.getAuthenticationAccess().getGroup_5()); 
            // InternalSecurityDsl.g:4127:2: ( rule__Authentication__Group_5__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==68) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSecurityDsl.g:4127:3: rule__Authentication__Group_5__0
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
    // InternalSecurityDsl.g:4136:1: rule__Authentication__Group_5__0 : rule__Authentication__Group_5__0__Impl rule__Authentication__Group_5__1 ;
    public final void rule__Authentication__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4140:1: ( rule__Authentication__Group_5__0__Impl rule__Authentication__Group_5__1 )
            // InternalSecurityDsl.g:4141:2: rule__Authentication__Group_5__0__Impl rule__Authentication__Group_5__1
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
    // InternalSecurityDsl.g:4148:1: rule__Authentication__Group_5__0__Impl : ( 'endpoints:' ) ;
    public final void rule__Authentication__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4152:1: ( ( 'endpoints:' ) )
            // InternalSecurityDsl.g:4153:1: ( 'endpoints:' )
            {
            // InternalSecurityDsl.g:4153:1: ( 'endpoints:' )
            // InternalSecurityDsl.g:4154:2: 'endpoints:'
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
    // InternalSecurityDsl.g:4163:1: rule__Authentication__Group_5__1 : rule__Authentication__Group_5__1__Impl rule__Authentication__Group_5__2 ;
    public final void rule__Authentication__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4167:1: ( rule__Authentication__Group_5__1__Impl rule__Authentication__Group_5__2 )
            // InternalSecurityDsl.g:4168:2: rule__Authentication__Group_5__1__Impl rule__Authentication__Group_5__2
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
    // InternalSecurityDsl.g:4175:1: rule__Authentication__Group_5__1__Impl : ( '[' ) ;
    public final void rule__Authentication__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4179:1: ( ( '[' ) )
            // InternalSecurityDsl.g:4180:1: ( '[' )
            {
            // InternalSecurityDsl.g:4180:1: ( '[' )
            // InternalSecurityDsl.g:4181:2: '['
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
    // InternalSecurityDsl.g:4190:1: rule__Authentication__Group_5__2 : rule__Authentication__Group_5__2__Impl rule__Authentication__Group_5__3 ;
    public final void rule__Authentication__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4194:1: ( rule__Authentication__Group_5__2__Impl rule__Authentication__Group_5__3 )
            // InternalSecurityDsl.g:4195:2: rule__Authentication__Group_5__2__Impl rule__Authentication__Group_5__3
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
    // InternalSecurityDsl.g:4202:1: rule__Authentication__Group_5__2__Impl : ( ( rule__Authentication__Controller_endpointsAssignment_5_2 ) ) ;
    public final void rule__Authentication__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4206:1: ( ( ( rule__Authentication__Controller_endpointsAssignment_5_2 ) ) )
            // InternalSecurityDsl.g:4207:1: ( ( rule__Authentication__Controller_endpointsAssignment_5_2 ) )
            {
            // InternalSecurityDsl.g:4207:1: ( ( rule__Authentication__Controller_endpointsAssignment_5_2 ) )
            // InternalSecurityDsl.g:4208:2: ( rule__Authentication__Controller_endpointsAssignment_5_2 )
            {
             before(grammarAccess.getAuthenticationAccess().getController_endpointsAssignment_5_2()); 
            // InternalSecurityDsl.g:4209:2: ( rule__Authentication__Controller_endpointsAssignment_5_2 )
            // InternalSecurityDsl.g:4209:3: rule__Authentication__Controller_endpointsAssignment_5_2
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
    // InternalSecurityDsl.g:4217:1: rule__Authentication__Group_5__3 : rule__Authentication__Group_5__3__Impl rule__Authentication__Group_5__4 ;
    public final void rule__Authentication__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4221:1: ( rule__Authentication__Group_5__3__Impl rule__Authentication__Group_5__4 )
            // InternalSecurityDsl.g:4222:2: rule__Authentication__Group_5__3__Impl rule__Authentication__Group_5__4
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
    // InternalSecurityDsl.g:4229:1: rule__Authentication__Group_5__3__Impl : ( ( rule__Authentication__Group_5_3__0 )* ) ;
    public final void rule__Authentication__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4233:1: ( ( ( rule__Authentication__Group_5_3__0 )* ) )
            // InternalSecurityDsl.g:4234:1: ( ( rule__Authentication__Group_5_3__0 )* )
            {
            // InternalSecurityDsl.g:4234:1: ( ( rule__Authentication__Group_5_3__0 )* )
            // InternalSecurityDsl.g:4235:2: ( rule__Authentication__Group_5_3__0 )*
            {
             before(grammarAccess.getAuthenticationAccess().getGroup_5_3()); 
            // InternalSecurityDsl.g:4236:2: ( rule__Authentication__Group_5_3__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==62) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalSecurityDsl.g:4236:3: rule__Authentication__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Authentication__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalSecurityDsl.g:4244:1: rule__Authentication__Group_5__4 : rule__Authentication__Group_5__4__Impl ;
    public final void rule__Authentication__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4248:1: ( rule__Authentication__Group_5__4__Impl )
            // InternalSecurityDsl.g:4249:2: rule__Authentication__Group_5__4__Impl
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
    // InternalSecurityDsl.g:4255:1: rule__Authentication__Group_5__4__Impl : ( ']' ) ;
    public final void rule__Authentication__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4259:1: ( ( ']' ) )
            // InternalSecurityDsl.g:4260:1: ( ']' )
            {
            // InternalSecurityDsl.g:4260:1: ( ']' )
            // InternalSecurityDsl.g:4261:2: ']'
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
    // InternalSecurityDsl.g:4271:1: rule__Authentication__Group_5_3__0 : rule__Authentication__Group_5_3__0__Impl rule__Authentication__Group_5_3__1 ;
    public final void rule__Authentication__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4275:1: ( rule__Authentication__Group_5_3__0__Impl rule__Authentication__Group_5_3__1 )
            // InternalSecurityDsl.g:4276:2: rule__Authentication__Group_5_3__0__Impl rule__Authentication__Group_5_3__1
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
    // InternalSecurityDsl.g:4283:1: rule__Authentication__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Authentication__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4287:1: ( ( ',' ) )
            // InternalSecurityDsl.g:4288:1: ( ',' )
            {
            // InternalSecurityDsl.g:4288:1: ( ',' )
            // InternalSecurityDsl.g:4289:2: ','
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
    // InternalSecurityDsl.g:4298:1: rule__Authentication__Group_5_3__1 : rule__Authentication__Group_5_3__1__Impl ;
    public final void rule__Authentication__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4302:1: ( rule__Authentication__Group_5_3__1__Impl )
            // InternalSecurityDsl.g:4303:2: rule__Authentication__Group_5_3__1__Impl
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
    // InternalSecurityDsl.g:4309:1: rule__Authentication__Group_5_3__1__Impl : ( ( rule__Authentication__Controller_endpointsAssignment_5_3_1 ) ) ;
    public final void rule__Authentication__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4313:1: ( ( ( rule__Authentication__Controller_endpointsAssignment_5_3_1 ) ) )
            // InternalSecurityDsl.g:4314:1: ( ( rule__Authentication__Controller_endpointsAssignment_5_3_1 ) )
            {
            // InternalSecurityDsl.g:4314:1: ( ( rule__Authentication__Controller_endpointsAssignment_5_3_1 ) )
            // InternalSecurityDsl.g:4315:2: ( rule__Authentication__Controller_endpointsAssignment_5_3_1 )
            {
             before(grammarAccess.getAuthenticationAccess().getController_endpointsAssignment_5_3_1()); 
            // InternalSecurityDsl.g:4316:2: ( rule__Authentication__Controller_endpointsAssignment_5_3_1 )
            // InternalSecurityDsl.g:4316:3: rule__Authentication__Controller_endpointsAssignment_5_3_1
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
    // InternalSecurityDsl.g:4325:1: rule__JWT__Group__0 : rule__JWT__Group__0__Impl rule__JWT__Group__1 ;
    public final void rule__JWT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4329:1: ( rule__JWT__Group__0__Impl rule__JWT__Group__1 )
            // InternalSecurityDsl.g:4330:2: rule__JWT__Group__0__Impl rule__JWT__Group__1
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
    // InternalSecurityDsl.g:4337:1: rule__JWT__Group__0__Impl : ( 'jwt:' ) ;
    public final void rule__JWT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4341:1: ( ( 'jwt:' ) )
            // InternalSecurityDsl.g:4342:1: ( 'jwt:' )
            {
            // InternalSecurityDsl.g:4342:1: ( 'jwt:' )
            // InternalSecurityDsl.g:4343:2: 'jwt:'
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
    // InternalSecurityDsl.g:4352:1: rule__JWT__Group__1 : rule__JWT__Group__1__Impl rule__JWT__Group__2 ;
    public final void rule__JWT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4356:1: ( rule__JWT__Group__1__Impl rule__JWT__Group__2 )
            // InternalSecurityDsl.g:4357:2: rule__JWT__Group__1__Impl rule__JWT__Group__2
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
    // InternalSecurityDsl.g:4364:1: rule__JWT__Group__1__Impl : ( 'header:' ) ;
    public final void rule__JWT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4368:1: ( ( 'header:' ) )
            // InternalSecurityDsl.g:4369:1: ( 'header:' )
            {
            // InternalSecurityDsl.g:4369:1: ( 'header:' )
            // InternalSecurityDsl.g:4370:2: 'header:'
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
    // InternalSecurityDsl.g:4379:1: rule__JWT__Group__2 : rule__JWT__Group__2__Impl rule__JWT__Group__3 ;
    public final void rule__JWT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4383:1: ( rule__JWT__Group__2__Impl rule__JWT__Group__3 )
            // InternalSecurityDsl.g:4384:2: rule__JWT__Group__2__Impl rule__JWT__Group__3
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
    // InternalSecurityDsl.g:4391:1: rule__JWT__Group__2__Impl : ( 'signatureAlgorithm:' ) ;
    public final void rule__JWT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4395:1: ( ( 'signatureAlgorithm:' ) )
            // InternalSecurityDsl.g:4396:1: ( 'signatureAlgorithm:' )
            {
            // InternalSecurityDsl.g:4396:1: ( 'signatureAlgorithm:' )
            // InternalSecurityDsl.g:4397:2: 'signatureAlgorithm:'
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
    // InternalSecurityDsl.g:4406:1: rule__JWT__Group__3 : rule__JWT__Group__3__Impl rule__JWT__Group__4 ;
    public final void rule__JWT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4410:1: ( rule__JWT__Group__3__Impl rule__JWT__Group__4 )
            // InternalSecurityDsl.g:4411:2: rule__JWT__Group__3__Impl rule__JWT__Group__4
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
    // InternalSecurityDsl.g:4418:1: rule__JWT__Group__3__Impl : ( ( rule__JWT__SignatureAlgorithmAssignment_3 ) ) ;
    public final void rule__JWT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4422:1: ( ( ( rule__JWT__SignatureAlgorithmAssignment_3 ) ) )
            // InternalSecurityDsl.g:4423:1: ( ( rule__JWT__SignatureAlgorithmAssignment_3 ) )
            {
            // InternalSecurityDsl.g:4423:1: ( ( rule__JWT__SignatureAlgorithmAssignment_3 ) )
            // InternalSecurityDsl.g:4424:2: ( rule__JWT__SignatureAlgorithmAssignment_3 )
            {
             before(grammarAccess.getJWTAccess().getSignatureAlgorithmAssignment_3()); 
            // InternalSecurityDsl.g:4425:2: ( rule__JWT__SignatureAlgorithmAssignment_3 )
            // InternalSecurityDsl.g:4425:3: rule__JWT__SignatureAlgorithmAssignment_3
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
    // InternalSecurityDsl.g:4433:1: rule__JWT__Group__4 : rule__JWT__Group__4__Impl rule__JWT__Group__5 ;
    public final void rule__JWT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4437:1: ( rule__JWT__Group__4__Impl rule__JWT__Group__5 )
            // InternalSecurityDsl.g:4438:2: rule__JWT__Group__4__Impl rule__JWT__Group__5
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
    // InternalSecurityDsl.g:4445:1: rule__JWT__Group__4__Impl : ( 'payload:' ) ;
    public final void rule__JWT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4449:1: ( ( 'payload:' ) )
            // InternalSecurityDsl.g:4450:1: ( 'payload:' )
            {
            // InternalSecurityDsl.g:4450:1: ( 'payload:' )
            // InternalSecurityDsl.g:4451:2: 'payload:'
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
    // InternalSecurityDsl.g:4460:1: rule__JWT__Group__5 : rule__JWT__Group__5__Impl rule__JWT__Group__6 ;
    public final void rule__JWT__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4464:1: ( rule__JWT__Group__5__Impl rule__JWT__Group__6 )
            // InternalSecurityDsl.g:4465:2: rule__JWT__Group__5__Impl rule__JWT__Group__6
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
    // InternalSecurityDsl.g:4472:1: rule__JWT__Group__5__Impl : ( 'claims:' ) ;
    public final void rule__JWT__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4476:1: ( ( 'claims:' ) )
            // InternalSecurityDsl.g:4477:1: ( 'claims:' )
            {
            // InternalSecurityDsl.g:4477:1: ( 'claims:' )
            // InternalSecurityDsl.g:4478:2: 'claims:'
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
    // InternalSecurityDsl.g:4487:1: rule__JWT__Group__6 : rule__JWT__Group__6__Impl rule__JWT__Group__7 ;
    public final void rule__JWT__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4491:1: ( rule__JWT__Group__6__Impl rule__JWT__Group__7 )
            // InternalSecurityDsl.g:4492:2: rule__JWT__Group__6__Impl rule__JWT__Group__7
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
    // InternalSecurityDsl.g:4499:1: rule__JWT__Group__6__Impl : ( '[' ) ;
    public final void rule__JWT__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4503:1: ( ( '[' ) )
            // InternalSecurityDsl.g:4504:1: ( '[' )
            {
            // InternalSecurityDsl.g:4504:1: ( '[' )
            // InternalSecurityDsl.g:4505:2: '['
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
    // InternalSecurityDsl.g:4514:1: rule__JWT__Group__7 : rule__JWT__Group__7__Impl rule__JWT__Group__8 ;
    public final void rule__JWT__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4518:1: ( rule__JWT__Group__7__Impl rule__JWT__Group__8 )
            // InternalSecurityDsl.g:4519:2: rule__JWT__Group__7__Impl rule__JWT__Group__8
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
    // InternalSecurityDsl.g:4526:1: rule__JWT__Group__7__Impl : ( ( rule__JWT__RegisteredclaimsAssignment_7 ) ) ;
    public final void rule__JWT__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4530:1: ( ( ( rule__JWT__RegisteredclaimsAssignment_7 ) ) )
            // InternalSecurityDsl.g:4531:1: ( ( rule__JWT__RegisteredclaimsAssignment_7 ) )
            {
            // InternalSecurityDsl.g:4531:1: ( ( rule__JWT__RegisteredclaimsAssignment_7 ) )
            // InternalSecurityDsl.g:4532:2: ( rule__JWT__RegisteredclaimsAssignment_7 )
            {
             before(grammarAccess.getJWTAccess().getRegisteredclaimsAssignment_7()); 
            // InternalSecurityDsl.g:4533:2: ( rule__JWT__RegisteredclaimsAssignment_7 )
            // InternalSecurityDsl.g:4533:3: rule__JWT__RegisteredclaimsAssignment_7
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
    // InternalSecurityDsl.g:4541:1: rule__JWT__Group__8 : rule__JWT__Group__8__Impl rule__JWT__Group__9 ;
    public final void rule__JWT__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4545:1: ( rule__JWT__Group__8__Impl rule__JWT__Group__9 )
            // InternalSecurityDsl.g:4546:2: rule__JWT__Group__8__Impl rule__JWT__Group__9
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
    // InternalSecurityDsl.g:4553:1: rule__JWT__Group__8__Impl : ( ( rule__JWT__Group_8__0 )* ) ;
    public final void rule__JWT__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4557:1: ( ( ( rule__JWT__Group_8__0 )* ) )
            // InternalSecurityDsl.g:4558:1: ( ( rule__JWT__Group_8__0 )* )
            {
            // InternalSecurityDsl.g:4558:1: ( ( rule__JWT__Group_8__0 )* )
            // InternalSecurityDsl.g:4559:2: ( rule__JWT__Group_8__0 )*
            {
             before(grammarAccess.getJWTAccess().getGroup_8()); 
            // InternalSecurityDsl.g:4560:2: ( rule__JWT__Group_8__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==62) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalSecurityDsl.g:4560:3: rule__JWT__Group_8__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__JWT__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalSecurityDsl.g:4568:1: rule__JWT__Group__9 : rule__JWT__Group__9__Impl rule__JWT__Group__10 ;
    public final void rule__JWT__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4572:1: ( rule__JWT__Group__9__Impl rule__JWT__Group__10 )
            // InternalSecurityDsl.g:4573:2: rule__JWT__Group__9__Impl rule__JWT__Group__10
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
    // InternalSecurityDsl.g:4580:1: rule__JWT__Group__9__Impl : ( ']' ) ;
    public final void rule__JWT__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4584:1: ( ( ']' ) )
            // InternalSecurityDsl.g:4585:1: ( ']' )
            {
            // InternalSecurityDsl.g:4585:1: ( ']' )
            // InternalSecurityDsl.g:4586:2: ']'
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
    // InternalSecurityDsl.g:4595:1: rule__JWT__Group__10 : rule__JWT__Group__10__Impl ;
    public final void rule__JWT__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4599:1: ( rule__JWT__Group__10__Impl )
            // InternalSecurityDsl.g:4600:2: rule__JWT__Group__10__Impl
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
    // InternalSecurityDsl.g:4606:1: rule__JWT__Group__10__Impl : ( ( rule__JWT__Group_10__0 )? ) ;
    public final void rule__JWT__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4610:1: ( ( ( rule__JWT__Group_10__0 )? ) )
            // InternalSecurityDsl.g:4611:1: ( ( rule__JWT__Group_10__0 )? )
            {
            // InternalSecurityDsl.g:4611:1: ( ( rule__JWT__Group_10__0 )? )
            // InternalSecurityDsl.g:4612:2: ( rule__JWT__Group_10__0 )?
            {
             before(grammarAccess.getJWTAccess().getGroup_10()); 
            // InternalSecurityDsl.g:4613:2: ( rule__JWT__Group_10__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==74) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSecurityDsl.g:4613:3: rule__JWT__Group_10__0
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
    // InternalSecurityDsl.g:4622:1: rule__JWT__Group_8__0 : rule__JWT__Group_8__0__Impl rule__JWT__Group_8__1 ;
    public final void rule__JWT__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4626:1: ( rule__JWT__Group_8__0__Impl rule__JWT__Group_8__1 )
            // InternalSecurityDsl.g:4627:2: rule__JWT__Group_8__0__Impl rule__JWT__Group_8__1
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
    // InternalSecurityDsl.g:4634:1: rule__JWT__Group_8__0__Impl : ( ',' ) ;
    public final void rule__JWT__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4638:1: ( ( ',' ) )
            // InternalSecurityDsl.g:4639:1: ( ',' )
            {
            // InternalSecurityDsl.g:4639:1: ( ',' )
            // InternalSecurityDsl.g:4640:2: ','
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
    // InternalSecurityDsl.g:4649:1: rule__JWT__Group_8__1 : rule__JWT__Group_8__1__Impl ;
    public final void rule__JWT__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4653:1: ( rule__JWT__Group_8__1__Impl )
            // InternalSecurityDsl.g:4654:2: rule__JWT__Group_8__1__Impl
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
    // InternalSecurityDsl.g:4660:1: rule__JWT__Group_8__1__Impl : ( ( rule__JWT__Jwt_claimsAssignment_8_1 ) ) ;
    public final void rule__JWT__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4664:1: ( ( ( rule__JWT__Jwt_claimsAssignment_8_1 ) ) )
            // InternalSecurityDsl.g:4665:1: ( ( rule__JWT__Jwt_claimsAssignment_8_1 ) )
            {
            // InternalSecurityDsl.g:4665:1: ( ( rule__JWT__Jwt_claimsAssignment_8_1 ) )
            // InternalSecurityDsl.g:4666:2: ( rule__JWT__Jwt_claimsAssignment_8_1 )
            {
             before(grammarAccess.getJWTAccess().getJwt_claimsAssignment_8_1()); 
            // InternalSecurityDsl.g:4667:2: ( rule__JWT__Jwt_claimsAssignment_8_1 )
            // InternalSecurityDsl.g:4667:3: rule__JWT__Jwt_claimsAssignment_8_1
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
    // InternalSecurityDsl.g:4676:1: rule__JWT__Group_10__0 : rule__JWT__Group_10__0__Impl rule__JWT__Group_10__1 ;
    public final void rule__JWT__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4680:1: ( rule__JWT__Group_10__0__Impl rule__JWT__Group_10__1 )
            // InternalSecurityDsl.g:4681:2: rule__JWT__Group_10__0__Impl rule__JWT__Group_10__1
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
    // InternalSecurityDsl.g:4688:1: rule__JWT__Group_10__0__Impl : ( 'signature:' ) ;
    public final void rule__JWT__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4692:1: ( ( 'signature:' ) )
            // InternalSecurityDsl.g:4693:1: ( 'signature:' )
            {
            // InternalSecurityDsl.g:4693:1: ( 'signature:' )
            // InternalSecurityDsl.g:4694:2: 'signature:'
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
    // InternalSecurityDsl.g:4703:1: rule__JWT__Group_10__1 : rule__JWT__Group_10__1__Impl rule__JWT__Group_10__2 ;
    public final void rule__JWT__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4707:1: ( rule__JWT__Group_10__1__Impl rule__JWT__Group_10__2 )
            // InternalSecurityDsl.g:4708:2: rule__JWT__Group_10__1__Impl rule__JWT__Group_10__2
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
    // InternalSecurityDsl.g:4715:1: rule__JWT__Group_10__1__Impl : ( 'secret:' ) ;
    public final void rule__JWT__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4719:1: ( ( 'secret:' ) )
            // InternalSecurityDsl.g:4720:1: ( 'secret:' )
            {
            // InternalSecurityDsl.g:4720:1: ( 'secret:' )
            // InternalSecurityDsl.g:4721:2: 'secret:'
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
    // InternalSecurityDsl.g:4730:1: rule__JWT__Group_10__2 : rule__JWT__Group_10__2__Impl ;
    public final void rule__JWT__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4734:1: ( rule__JWT__Group_10__2__Impl )
            // InternalSecurityDsl.g:4735:2: rule__JWT__Group_10__2__Impl
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
    // InternalSecurityDsl.g:4741:1: rule__JWT__Group_10__2__Impl : ( ( rule__JWT__SecretAssignment_10_2 ) ) ;
    public final void rule__JWT__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4745:1: ( ( ( rule__JWT__SecretAssignment_10_2 ) ) )
            // InternalSecurityDsl.g:4746:1: ( ( rule__JWT__SecretAssignment_10_2 ) )
            {
            // InternalSecurityDsl.g:4746:1: ( ( rule__JWT__SecretAssignment_10_2 ) )
            // InternalSecurityDsl.g:4747:2: ( rule__JWT__SecretAssignment_10_2 )
            {
             before(grammarAccess.getJWTAccess().getSecretAssignment_10_2()); 
            // InternalSecurityDsl.g:4748:2: ( rule__JWT__SecretAssignment_10_2 )
            // InternalSecurityDsl.g:4748:3: rule__JWT__SecretAssignment_10_2
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
    // InternalSecurityDsl.g:4757:1: rule__Claim__Group__0 : rule__Claim__Group__0__Impl rule__Claim__Group__1 ;
    public final void rule__Claim__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4761:1: ( rule__Claim__Group__0__Impl rule__Claim__Group__1 )
            // InternalSecurityDsl.g:4762:2: rule__Claim__Group__0__Impl rule__Claim__Group__1
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
    // InternalSecurityDsl.g:4769:1: rule__Claim__Group__0__Impl : ( '{' ) ;
    public final void rule__Claim__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4773:1: ( ( '{' ) )
            // InternalSecurityDsl.g:4774:1: ( '{' )
            {
            // InternalSecurityDsl.g:4774:1: ( '{' )
            // InternalSecurityDsl.g:4775:2: '{'
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
    // InternalSecurityDsl.g:4784:1: rule__Claim__Group__1 : rule__Claim__Group__1__Impl rule__Claim__Group__2 ;
    public final void rule__Claim__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4788:1: ( rule__Claim__Group__1__Impl rule__Claim__Group__2 )
            // InternalSecurityDsl.g:4789:2: rule__Claim__Group__1__Impl rule__Claim__Group__2
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
    // InternalSecurityDsl.g:4796:1: rule__Claim__Group__1__Impl : ( ( rule__Claim__Group_1__0 )? ) ;
    public final void rule__Claim__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4800:1: ( ( ( rule__Claim__Group_1__0 )? ) )
            // InternalSecurityDsl.g:4801:1: ( ( rule__Claim__Group_1__0 )? )
            {
            // InternalSecurityDsl.g:4801:1: ( ( rule__Claim__Group_1__0 )? )
            // InternalSecurityDsl.g:4802:2: ( rule__Claim__Group_1__0 )?
            {
             before(grammarAccess.getClaimAccess().getGroup_1()); 
            // InternalSecurityDsl.g:4803:2: ( rule__Claim__Group_1__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=31 && LA43_0<=33)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSecurityDsl.g:4803:3: rule__Claim__Group_1__0
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
    // InternalSecurityDsl.g:4811:1: rule__Claim__Group__2 : rule__Claim__Group__2__Impl rule__Claim__Group__3 ;
    public final void rule__Claim__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4815:1: ( rule__Claim__Group__2__Impl rule__Claim__Group__3 )
            // InternalSecurityDsl.g:4816:2: rule__Claim__Group__2__Impl rule__Claim__Group__3
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
    // InternalSecurityDsl.g:4823:1: rule__Claim__Group__2__Impl : ( ( rule__Claim__NameAssignment_2 ) ) ;
    public final void rule__Claim__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4827:1: ( ( ( rule__Claim__NameAssignment_2 ) ) )
            // InternalSecurityDsl.g:4828:1: ( ( rule__Claim__NameAssignment_2 ) )
            {
            // InternalSecurityDsl.g:4828:1: ( ( rule__Claim__NameAssignment_2 ) )
            // InternalSecurityDsl.g:4829:2: ( rule__Claim__NameAssignment_2 )
            {
             before(grammarAccess.getClaimAccess().getNameAssignment_2()); 
            // InternalSecurityDsl.g:4830:2: ( rule__Claim__NameAssignment_2 )
            // InternalSecurityDsl.g:4830:3: rule__Claim__NameAssignment_2
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
    // InternalSecurityDsl.g:4838:1: rule__Claim__Group__3 : rule__Claim__Group__3__Impl rule__Claim__Group__4 ;
    public final void rule__Claim__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4842:1: ( rule__Claim__Group__3__Impl rule__Claim__Group__4 )
            // InternalSecurityDsl.g:4843:2: rule__Claim__Group__3__Impl rule__Claim__Group__4
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
    // InternalSecurityDsl.g:4850:1: rule__Claim__Group__3__Impl : ( ':' ) ;
    public final void rule__Claim__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4854:1: ( ( ':' ) )
            // InternalSecurityDsl.g:4855:1: ( ':' )
            {
            // InternalSecurityDsl.g:4855:1: ( ':' )
            // InternalSecurityDsl.g:4856:2: ':'
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
    // InternalSecurityDsl.g:4865:1: rule__Claim__Group__4 : rule__Claim__Group__4__Impl rule__Claim__Group__5 ;
    public final void rule__Claim__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4869:1: ( rule__Claim__Group__4__Impl rule__Claim__Group__5 )
            // InternalSecurityDsl.g:4870:2: rule__Claim__Group__4__Impl rule__Claim__Group__5
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
    // InternalSecurityDsl.g:4877:1: rule__Claim__Group__4__Impl : ( ( rule__Claim__Claim_attributeAssignment_4 ) ) ;
    public final void rule__Claim__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4881:1: ( ( ( rule__Claim__Claim_attributeAssignment_4 ) ) )
            // InternalSecurityDsl.g:4882:1: ( ( rule__Claim__Claim_attributeAssignment_4 ) )
            {
            // InternalSecurityDsl.g:4882:1: ( ( rule__Claim__Claim_attributeAssignment_4 ) )
            // InternalSecurityDsl.g:4883:2: ( rule__Claim__Claim_attributeAssignment_4 )
            {
             before(grammarAccess.getClaimAccess().getClaim_attributeAssignment_4()); 
            // InternalSecurityDsl.g:4884:2: ( rule__Claim__Claim_attributeAssignment_4 )
            // InternalSecurityDsl.g:4884:3: rule__Claim__Claim_attributeAssignment_4
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
    // InternalSecurityDsl.g:4892:1: rule__Claim__Group__5 : rule__Claim__Group__5__Impl ;
    public final void rule__Claim__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4896:1: ( rule__Claim__Group__5__Impl )
            // InternalSecurityDsl.g:4897:2: rule__Claim__Group__5__Impl
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
    // InternalSecurityDsl.g:4903:1: rule__Claim__Group__5__Impl : ( '}' ) ;
    public final void rule__Claim__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4907:1: ( ( '}' ) )
            // InternalSecurityDsl.g:4908:1: ( '}' )
            {
            // InternalSecurityDsl.g:4908:1: ( '}' )
            // InternalSecurityDsl.g:4909:2: '}'
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
    // InternalSecurityDsl.g:4919:1: rule__Claim__Group_1__0 : rule__Claim__Group_1__0__Impl rule__Claim__Group_1__1 ;
    public final void rule__Claim__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4923:1: ( rule__Claim__Group_1__0__Impl rule__Claim__Group_1__1 )
            // InternalSecurityDsl.g:4924:2: rule__Claim__Group_1__0__Impl rule__Claim__Group_1__1
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
    // InternalSecurityDsl.g:4931:1: rule__Claim__Group_1__0__Impl : ( ( rule__Claim__TypeAssignment_1_0 ) ) ;
    public final void rule__Claim__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4935:1: ( ( ( rule__Claim__TypeAssignment_1_0 ) ) )
            // InternalSecurityDsl.g:4936:1: ( ( rule__Claim__TypeAssignment_1_0 ) )
            {
            // InternalSecurityDsl.g:4936:1: ( ( rule__Claim__TypeAssignment_1_0 ) )
            // InternalSecurityDsl.g:4937:2: ( rule__Claim__TypeAssignment_1_0 )
            {
             before(grammarAccess.getClaimAccess().getTypeAssignment_1_0()); 
            // InternalSecurityDsl.g:4938:2: ( rule__Claim__TypeAssignment_1_0 )
            // InternalSecurityDsl.g:4938:3: rule__Claim__TypeAssignment_1_0
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
    // InternalSecurityDsl.g:4946:1: rule__Claim__Group_1__1 : rule__Claim__Group_1__1__Impl ;
    public final void rule__Claim__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4950:1: ( rule__Claim__Group_1__1__Impl )
            // InternalSecurityDsl.g:4951:2: rule__Claim__Group_1__1__Impl
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
    // InternalSecurityDsl.g:4957:1: rule__Claim__Group_1__1__Impl : ( ',' ) ;
    public final void rule__Claim__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4961:1: ( ( ',' ) )
            // InternalSecurityDsl.g:4962:1: ( ',' )
            {
            // InternalSecurityDsl.g:4962:1: ( ',' )
            // InternalSecurityDsl.g:4963:2: ','
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
    // InternalSecurityDsl.g:4973:1: rule__RegisteredClaims__Group__0 : rule__RegisteredClaims__Group__0__Impl rule__RegisteredClaims__Group__1 ;
    public final void rule__RegisteredClaims__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4977:1: ( rule__RegisteredClaims__Group__0__Impl rule__RegisteredClaims__Group__1 )
            // InternalSecurityDsl.g:4978:2: rule__RegisteredClaims__Group__0__Impl rule__RegisteredClaims__Group__1
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
    // InternalSecurityDsl.g:4985:1: rule__RegisteredClaims__Group__0__Impl : ( '{' ) ;
    public final void rule__RegisteredClaims__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4989:1: ( ( '{' ) )
            // InternalSecurityDsl.g:4990:1: ( '{' )
            {
            // InternalSecurityDsl.g:4990:1: ( '{' )
            // InternalSecurityDsl.g:4991:2: '{'
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
    // InternalSecurityDsl.g:5000:1: rule__RegisteredClaims__Group__1 : rule__RegisteredClaims__Group__1__Impl rule__RegisteredClaims__Group__2 ;
    public final void rule__RegisteredClaims__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5004:1: ( rule__RegisteredClaims__Group__1__Impl rule__RegisteredClaims__Group__2 )
            // InternalSecurityDsl.g:5005:2: rule__RegisteredClaims__Group__1__Impl rule__RegisteredClaims__Group__2
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
    // InternalSecurityDsl.g:5012:1: rule__RegisteredClaims__Group__1__Impl : ( 'REGISTERED,' ) ;
    public final void rule__RegisteredClaims__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5016:1: ( ( 'REGISTERED,' ) )
            // InternalSecurityDsl.g:5017:1: ( 'REGISTERED,' )
            {
            // InternalSecurityDsl.g:5017:1: ( 'REGISTERED,' )
            // InternalSecurityDsl.g:5018:2: 'REGISTERED,'
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
    // InternalSecurityDsl.g:5027:1: rule__RegisteredClaims__Group__2 : rule__RegisteredClaims__Group__2__Impl rule__RegisteredClaims__Group__3 ;
    public final void rule__RegisteredClaims__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5031:1: ( rule__RegisteredClaims__Group__2__Impl rule__RegisteredClaims__Group__3 )
            // InternalSecurityDsl.g:5032:2: rule__RegisteredClaims__Group__2__Impl rule__RegisteredClaims__Group__3
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
    // InternalSecurityDsl.g:5039:1: rule__RegisteredClaims__Group__2__Impl : ( 'expirationTime:' ) ;
    public final void rule__RegisteredClaims__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5043:1: ( ( 'expirationTime:' ) )
            // InternalSecurityDsl.g:5044:1: ( 'expirationTime:' )
            {
            // InternalSecurityDsl.g:5044:1: ( 'expirationTime:' )
            // InternalSecurityDsl.g:5045:2: 'expirationTime:'
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
    // InternalSecurityDsl.g:5054:1: rule__RegisteredClaims__Group__3 : rule__RegisteredClaims__Group__3__Impl rule__RegisteredClaims__Group__4 ;
    public final void rule__RegisteredClaims__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5058:1: ( rule__RegisteredClaims__Group__3__Impl rule__RegisteredClaims__Group__4 )
            // InternalSecurityDsl.g:5059:2: rule__RegisteredClaims__Group__3__Impl rule__RegisteredClaims__Group__4
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
    // InternalSecurityDsl.g:5066:1: rule__RegisteredClaims__Group__3__Impl : ( ( rule__RegisteredClaims__ExpirationTimeAssignment_3 ) ) ;
    public final void rule__RegisteredClaims__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5070:1: ( ( ( rule__RegisteredClaims__ExpirationTimeAssignment_3 ) ) )
            // InternalSecurityDsl.g:5071:1: ( ( rule__RegisteredClaims__ExpirationTimeAssignment_3 ) )
            {
            // InternalSecurityDsl.g:5071:1: ( ( rule__RegisteredClaims__ExpirationTimeAssignment_3 ) )
            // InternalSecurityDsl.g:5072:2: ( rule__RegisteredClaims__ExpirationTimeAssignment_3 )
            {
             before(grammarAccess.getRegisteredClaimsAccess().getExpirationTimeAssignment_3()); 
            // InternalSecurityDsl.g:5073:2: ( rule__RegisteredClaims__ExpirationTimeAssignment_3 )
            // InternalSecurityDsl.g:5073:3: rule__RegisteredClaims__ExpirationTimeAssignment_3
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
    // InternalSecurityDsl.g:5081:1: rule__RegisteredClaims__Group__4 : rule__RegisteredClaims__Group__4__Impl rule__RegisteredClaims__Group__5 ;
    public final void rule__RegisteredClaims__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5085:1: ( rule__RegisteredClaims__Group__4__Impl rule__RegisteredClaims__Group__5 )
            // InternalSecurityDsl.g:5086:2: rule__RegisteredClaims__Group__4__Impl rule__RegisteredClaims__Group__5
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
    // InternalSecurityDsl.g:5093:1: rule__RegisteredClaims__Group__4__Impl : ( '}' ) ;
    public final void rule__RegisteredClaims__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5097:1: ( ( '}' ) )
            // InternalSecurityDsl.g:5098:1: ( '}' )
            {
            // InternalSecurityDsl.g:5098:1: ( '}' )
            // InternalSecurityDsl.g:5099:2: '}'
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
    // InternalSecurityDsl.g:5108:1: rule__RegisteredClaims__Group__5 : rule__RegisteredClaims__Group__5__Impl rule__RegisteredClaims__Group__6 ;
    public final void rule__RegisteredClaims__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5112:1: ( rule__RegisteredClaims__Group__5__Impl rule__RegisteredClaims__Group__6 )
            // InternalSecurityDsl.g:5113:2: rule__RegisteredClaims__Group__5__Impl rule__RegisteredClaims__Group__6
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
    // InternalSecurityDsl.g:5120:1: rule__RegisteredClaims__Group__5__Impl : ( ( rule__RegisteredClaims__Group_5__0 )? ) ;
    public final void rule__RegisteredClaims__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5124:1: ( ( ( rule__RegisteredClaims__Group_5__0 )? ) )
            // InternalSecurityDsl.g:5125:1: ( ( rule__RegisteredClaims__Group_5__0 )? )
            {
            // InternalSecurityDsl.g:5125:1: ( ( rule__RegisteredClaims__Group_5__0 )? )
            // InternalSecurityDsl.g:5126:2: ( rule__RegisteredClaims__Group_5__0 )?
            {
             before(grammarAccess.getRegisteredClaimsAccess().getGroup_5()); 
            // InternalSecurityDsl.g:5127:2: ( rule__RegisteredClaims__Group_5__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==62) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==54) ) {
                    int LA44_3 = input.LA(3);

                    if ( (LA44_3==77) ) {
                        int LA44_4 = input.LA(4);

                        if ( (LA44_4==79) ) {
                            alt44=1;
                        }
                    }
                }
            }
            switch (alt44) {
                case 1 :
                    // InternalSecurityDsl.g:5127:3: rule__RegisteredClaims__Group_5__0
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
    // InternalSecurityDsl.g:5135:1: rule__RegisteredClaims__Group__6 : rule__RegisteredClaims__Group__6__Impl ;
    public final void rule__RegisteredClaims__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5139:1: ( rule__RegisteredClaims__Group__6__Impl )
            // InternalSecurityDsl.g:5140:2: rule__RegisteredClaims__Group__6__Impl
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
    // InternalSecurityDsl.g:5146:1: rule__RegisteredClaims__Group__6__Impl : ( ( rule__RegisteredClaims__Group_6__0 )? ) ;
    public final void rule__RegisteredClaims__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5150:1: ( ( ( rule__RegisteredClaims__Group_6__0 )? ) )
            // InternalSecurityDsl.g:5151:1: ( ( rule__RegisteredClaims__Group_6__0 )? )
            {
            // InternalSecurityDsl.g:5151:1: ( ( rule__RegisteredClaims__Group_6__0 )? )
            // InternalSecurityDsl.g:5152:2: ( rule__RegisteredClaims__Group_6__0 )?
            {
             before(grammarAccess.getRegisteredClaimsAccess().getGroup_6()); 
            // InternalSecurityDsl.g:5153:2: ( rule__RegisteredClaims__Group_6__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==62) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==54) ) {
                    int LA45_3 = input.LA(3);

                    if ( (LA45_3==77) ) {
                        alt45=1;
                    }
                }
            }
            switch (alt45) {
                case 1 :
                    // InternalSecurityDsl.g:5153:3: rule__RegisteredClaims__Group_6__0
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
    // InternalSecurityDsl.g:5162:1: rule__RegisteredClaims__Group_5__0 : rule__RegisteredClaims__Group_5__0__Impl rule__RegisteredClaims__Group_5__1 ;
    public final void rule__RegisteredClaims__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5166:1: ( rule__RegisteredClaims__Group_5__0__Impl rule__RegisteredClaims__Group_5__1 )
            // InternalSecurityDsl.g:5167:2: rule__RegisteredClaims__Group_5__0__Impl rule__RegisteredClaims__Group_5__1
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
    // InternalSecurityDsl.g:5174:1: rule__RegisteredClaims__Group_5__0__Impl : ( ',' ) ;
    public final void rule__RegisteredClaims__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5178:1: ( ( ',' ) )
            // InternalSecurityDsl.g:5179:1: ( ',' )
            {
            // InternalSecurityDsl.g:5179:1: ( ',' )
            // InternalSecurityDsl.g:5180:2: ','
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
    // InternalSecurityDsl.g:5189:1: rule__RegisteredClaims__Group_5__1 : rule__RegisteredClaims__Group_5__1__Impl rule__RegisteredClaims__Group_5__2 ;
    public final void rule__RegisteredClaims__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5193:1: ( rule__RegisteredClaims__Group_5__1__Impl rule__RegisteredClaims__Group_5__2 )
            // InternalSecurityDsl.g:5194:2: rule__RegisteredClaims__Group_5__1__Impl rule__RegisteredClaims__Group_5__2
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
    // InternalSecurityDsl.g:5201:1: rule__RegisteredClaims__Group_5__1__Impl : ( '{' ) ;
    public final void rule__RegisteredClaims__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5205:1: ( ( '{' ) )
            // InternalSecurityDsl.g:5206:1: ( '{' )
            {
            // InternalSecurityDsl.g:5206:1: ( '{' )
            // InternalSecurityDsl.g:5207:2: '{'
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
    // InternalSecurityDsl.g:5216:1: rule__RegisteredClaims__Group_5__2 : rule__RegisteredClaims__Group_5__2__Impl rule__RegisteredClaims__Group_5__3 ;
    public final void rule__RegisteredClaims__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5220:1: ( rule__RegisteredClaims__Group_5__2__Impl rule__RegisteredClaims__Group_5__3 )
            // InternalSecurityDsl.g:5221:2: rule__RegisteredClaims__Group_5__2__Impl rule__RegisteredClaims__Group_5__3
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
    // InternalSecurityDsl.g:5228:1: rule__RegisteredClaims__Group_5__2__Impl : ( 'REGISTERED,' ) ;
    public final void rule__RegisteredClaims__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5232:1: ( ( 'REGISTERED,' ) )
            // InternalSecurityDsl.g:5233:1: ( 'REGISTERED,' )
            {
            // InternalSecurityDsl.g:5233:1: ( 'REGISTERED,' )
            // InternalSecurityDsl.g:5234:2: 'REGISTERED,'
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
    // InternalSecurityDsl.g:5243:1: rule__RegisteredClaims__Group_5__3 : rule__RegisteredClaims__Group_5__3__Impl rule__RegisteredClaims__Group_5__4 ;
    public final void rule__RegisteredClaims__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5247:1: ( rule__RegisteredClaims__Group_5__3__Impl rule__RegisteredClaims__Group_5__4 )
            // InternalSecurityDsl.g:5248:2: rule__RegisteredClaims__Group_5__3__Impl rule__RegisteredClaims__Group_5__4
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
    // InternalSecurityDsl.g:5255:1: rule__RegisteredClaims__Group_5__3__Impl : ( 'issuer:' ) ;
    public final void rule__RegisteredClaims__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5259:1: ( ( 'issuer:' ) )
            // InternalSecurityDsl.g:5260:1: ( 'issuer:' )
            {
            // InternalSecurityDsl.g:5260:1: ( 'issuer:' )
            // InternalSecurityDsl.g:5261:2: 'issuer:'
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
    // InternalSecurityDsl.g:5270:1: rule__RegisteredClaims__Group_5__4 : rule__RegisteredClaims__Group_5__4__Impl rule__RegisteredClaims__Group_5__5 ;
    public final void rule__RegisteredClaims__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5274:1: ( rule__RegisteredClaims__Group_5__4__Impl rule__RegisteredClaims__Group_5__5 )
            // InternalSecurityDsl.g:5275:2: rule__RegisteredClaims__Group_5__4__Impl rule__RegisteredClaims__Group_5__5
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
    // InternalSecurityDsl.g:5282:1: rule__RegisteredClaims__Group_5__4__Impl : ( ( rule__RegisteredClaims__IssuerAssignment_5_4 ) ) ;
    public final void rule__RegisteredClaims__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5286:1: ( ( ( rule__RegisteredClaims__IssuerAssignment_5_4 ) ) )
            // InternalSecurityDsl.g:5287:1: ( ( rule__RegisteredClaims__IssuerAssignment_5_4 ) )
            {
            // InternalSecurityDsl.g:5287:1: ( ( rule__RegisteredClaims__IssuerAssignment_5_4 ) )
            // InternalSecurityDsl.g:5288:2: ( rule__RegisteredClaims__IssuerAssignment_5_4 )
            {
             before(grammarAccess.getRegisteredClaimsAccess().getIssuerAssignment_5_4()); 
            // InternalSecurityDsl.g:5289:2: ( rule__RegisteredClaims__IssuerAssignment_5_4 )
            // InternalSecurityDsl.g:5289:3: rule__RegisteredClaims__IssuerAssignment_5_4
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
    // InternalSecurityDsl.g:5297:1: rule__RegisteredClaims__Group_5__5 : rule__RegisteredClaims__Group_5__5__Impl ;
    public final void rule__RegisteredClaims__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5301:1: ( rule__RegisteredClaims__Group_5__5__Impl )
            // InternalSecurityDsl.g:5302:2: rule__RegisteredClaims__Group_5__5__Impl
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
    // InternalSecurityDsl.g:5308:1: rule__RegisteredClaims__Group_5__5__Impl : ( '}' ) ;
    public final void rule__RegisteredClaims__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5312:1: ( ( '}' ) )
            // InternalSecurityDsl.g:5313:1: ( '}' )
            {
            // InternalSecurityDsl.g:5313:1: ( '}' )
            // InternalSecurityDsl.g:5314:2: '}'
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
    // InternalSecurityDsl.g:5324:1: rule__RegisteredClaims__Group_6__0 : rule__RegisteredClaims__Group_6__0__Impl rule__RegisteredClaims__Group_6__1 ;
    public final void rule__RegisteredClaims__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5328:1: ( rule__RegisteredClaims__Group_6__0__Impl rule__RegisteredClaims__Group_6__1 )
            // InternalSecurityDsl.g:5329:2: rule__RegisteredClaims__Group_6__0__Impl rule__RegisteredClaims__Group_6__1
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
    // InternalSecurityDsl.g:5336:1: rule__RegisteredClaims__Group_6__0__Impl : ( ',' ) ;
    public final void rule__RegisteredClaims__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5340:1: ( ( ',' ) )
            // InternalSecurityDsl.g:5341:1: ( ',' )
            {
            // InternalSecurityDsl.g:5341:1: ( ',' )
            // InternalSecurityDsl.g:5342:2: ','
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
    // InternalSecurityDsl.g:5351:1: rule__RegisteredClaims__Group_6__1 : rule__RegisteredClaims__Group_6__1__Impl rule__RegisteredClaims__Group_6__2 ;
    public final void rule__RegisteredClaims__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5355:1: ( rule__RegisteredClaims__Group_6__1__Impl rule__RegisteredClaims__Group_6__2 )
            // InternalSecurityDsl.g:5356:2: rule__RegisteredClaims__Group_6__1__Impl rule__RegisteredClaims__Group_6__2
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
    // InternalSecurityDsl.g:5363:1: rule__RegisteredClaims__Group_6__1__Impl : ( '{' ) ;
    public final void rule__RegisteredClaims__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5367:1: ( ( '{' ) )
            // InternalSecurityDsl.g:5368:1: ( '{' )
            {
            // InternalSecurityDsl.g:5368:1: ( '{' )
            // InternalSecurityDsl.g:5369:2: '{'
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
    // InternalSecurityDsl.g:5378:1: rule__RegisteredClaims__Group_6__2 : rule__RegisteredClaims__Group_6__2__Impl rule__RegisteredClaims__Group_6__3 ;
    public final void rule__RegisteredClaims__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5382:1: ( rule__RegisteredClaims__Group_6__2__Impl rule__RegisteredClaims__Group_6__3 )
            // InternalSecurityDsl.g:5383:2: rule__RegisteredClaims__Group_6__2__Impl rule__RegisteredClaims__Group_6__3
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
    // InternalSecurityDsl.g:5390:1: rule__RegisteredClaims__Group_6__2__Impl : ( 'REGISTERED,' ) ;
    public final void rule__RegisteredClaims__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5394:1: ( ( 'REGISTERED,' ) )
            // InternalSecurityDsl.g:5395:1: ( 'REGISTERED,' )
            {
            // InternalSecurityDsl.g:5395:1: ( 'REGISTERED,' )
            // InternalSecurityDsl.g:5396:2: 'REGISTERED,'
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
    // InternalSecurityDsl.g:5405:1: rule__RegisteredClaims__Group_6__3 : rule__RegisteredClaims__Group_6__3__Impl rule__RegisteredClaims__Group_6__4 ;
    public final void rule__RegisteredClaims__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5409:1: ( rule__RegisteredClaims__Group_6__3__Impl rule__RegisteredClaims__Group_6__4 )
            // InternalSecurityDsl.g:5410:2: rule__RegisteredClaims__Group_6__3__Impl rule__RegisteredClaims__Group_6__4
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
    // InternalSecurityDsl.g:5417:1: rule__RegisteredClaims__Group_6__3__Impl : ( 'audience:' ) ;
    public final void rule__RegisteredClaims__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5421:1: ( ( 'audience:' ) )
            // InternalSecurityDsl.g:5422:1: ( 'audience:' )
            {
            // InternalSecurityDsl.g:5422:1: ( 'audience:' )
            // InternalSecurityDsl.g:5423:2: 'audience:'
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
    // InternalSecurityDsl.g:5432:1: rule__RegisteredClaims__Group_6__4 : rule__RegisteredClaims__Group_6__4__Impl rule__RegisteredClaims__Group_6__5 ;
    public final void rule__RegisteredClaims__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5436:1: ( rule__RegisteredClaims__Group_6__4__Impl rule__RegisteredClaims__Group_6__5 )
            // InternalSecurityDsl.g:5437:2: rule__RegisteredClaims__Group_6__4__Impl rule__RegisteredClaims__Group_6__5
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
    // InternalSecurityDsl.g:5444:1: rule__RegisteredClaims__Group_6__4__Impl : ( ( rule__RegisteredClaims__AudienceAssignment_6_4 ) ) ;
    public final void rule__RegisteredClaims__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5448:1: ( ( ( rule__RegisteredClaims__AudienceAssignment_6_4 ) ) )
            // InternalSecurityDsl.g:5449:1: ( ( rule__RegisteredClaims__AudienceAssignment_6_4 ) )
            {
            // InternalSecurityDsl.g:5449:1: ( ( rule__RegisteredClaims__AudienceAssignment_6_4 ) )
            // InternalSecurityDsl.g:5450:2: ( rule__RegisteredClaims__AudienceAssignment_6_4 )
            {
             before(grammarAccess.getRegisteredClaimsAccess().getAudienceAssignment_6_4()); 
            // InternalSecurityDsl.g:5451:2: ( rule__RegisteredClaims__AudienceAssignment_6_4 )
            // InternalSecurityDsl.g:5451:3: rule__RegisteredClaims__AudienceAssignment_6_4
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
    // InternalSecurityDsl.g:5459:1: rule__RegisteredClaims__Group_6__5 : rule__RegisteredClaims__Group_6__5__Impl ;
    public final void rule__RegisteredClaims__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5463:1: ( rule__RegisteredClaims__Group_6__5__Impl )
            // InternalSecurityDsl.g:5464:2: rule__RegisteredClaims__Group_6__5__Impl
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
    // InternalSecurityDsl.g:5470:1: rule__RegisteredClaims__Group_6__5__Impl : ( '}' ) ;
    public final void rule__RegisteredClaims__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5474:1: ( ( '}' ) )
            // InternalSecurityDsl.g:5475:1: ( '}' )
            {
            // InternalSecurityDsl.g:5475:1: ( '}' )
            // InternalSecurityDsl.g:5476:2: '}'
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


    // $ANTLR start "rule__OAuth2__Group__0"
    // InternalSecurityDsl.g:5486:1: rule__OAuth2__Group__0 : rule__OAuth2__Group__0__Impl rule__OAuth2__Group__1 ;
    public final void rule__OAuth2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5490:1: ( rule__OAuth2__Group__0__Impl rule__OAuth2__Group__1 )
            // InternalSecurityDsl.g:5491:2: rule__OAuth2__Group__0__Impl rule__OAuth2__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalSecurityDsl.g:5498:1: rule__OAuth2__Group__0__Impl : ( () ) ;
    public final void rule__OAuth2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5502:1: ( ( () ) )
            // InternalSecurityDsl.g:5503:1: ( () )
            {
            // InternalSecurityDsl.g:5503:1: ( () )
            // InternalSecurityDsl.g:5504:2: ()
            {
             before(grammarAccess.getOAuth2Access().getOAuth2Action_0()); 
            // InternalSecurityDsl.g:5505:2: ()
            // InternalSecurityDsl.g:5505:3: 
            {
            }

             after(grammarAccess.getOAuth2Access().getOAuth2Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OAuth2__Group__0__Impl"


    // $ANTLR start "rule__OAuth2__Group__1"
    // InternalSecurityDsl.g:5513:1: rule__OAuth2__Group__1 : rule__OAuth2__Group__1__Impl ;
    public final void rule__OAuth2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5517:1: ( rule__OAuth2__Group__1__Impl )
            // InternalSecurityDsl.g:5518:2: rule__OAuth2__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OAuth2__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalSecurityDsl.g:5524:1: rule__OAuth2__Group__1__Impl : ( 'OAuth2.0' ) ;
    public final void rule__OAuth2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5528:1: ( ( 'OAuth2.0' ) )
            // InternalSecurityDsl.g:5529:1: ( 'OAuth2.0' )
            {
            // InternalSecurityDsl.g:5529:1: ( 'OAuth2.0' )
            // InternalSecurityDsl.g:5530:2: 'OAuth2.0'
            {
             before(grammarAccess.getOAuth2Access().getOAuth20Keyword_1()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getOAuth2Access().getOAuth20Keyword_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__BasicAuthentication__Group__0"
    // InternalSecurityDsl.g:5540:1: rule__BasicAuthentication__Group__0 : rule__BasicAuthentication__Group__0__Impl rule__BasicAuthentication__Group__1 ;
    public final void rule__BasicAuthentication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5544:1: ( rule__BasicAuthentication__Group__0__Impl rule__BasicAuthentication__Group__1 )
            // InternalSecurityDsl.g:5545:2: rule__BasicAuthentication__Group__0__Impl rule__BasicAuthentication__Group__1
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
    // InternalSecurityDsl.g:5552:1: rule__BasicAuthentication__Group__0__Impl : ( () ) ;
    public final void rule__BasicAuthentication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5556:1: ( ( () ) )
            // InternalSecurityDsl.g:5557:1: ( () )
            {
            // InternalSecurityDsl.g:5557:1: ( () )
            // InternalSecurityDsl.g:5558:2: ()
            {
             before(grammarAccess.getBasicAuthenticationAccess().getBasicAuthenticationAction_0()); 
            // InternalSecurityDsl.g:5559:2: ()
            // InternalSecurityDsl.g:5559:3: 
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
    // InternalSecurityDsl.g:5567:1: rule__BasicAuthentication__Group__1 : rule__BasicAuthentication__Group__1__Impl ;
    public final void rule__BasicAuthentication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5571:1: ( rule__BasicAuthentication__Group__1__Impl )
            // InternalSecurityDsl.g:5572:2: rule__BasicAuthentication__Group__1__Impl
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
    // InternalSecurityDsl.g:5578:1: rule__BasicAuthentication__Group__1__Impl : ( 'basicAuthentication' ) ;
    public final void rule__BasicAuthentication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5582:1: ( ( 'basicAuthentication' ) )
            // InternalSecurityDsl.g:5583:1: ( 'basicAuthentication' )
            {
            // InternalSecurityDsl.g:5583:1: ( 'basicAuthentication' )
            // InternalSecurityDsl.g:5584:2: 'basicAuthentication'
            {
             before(grammarAccess.getBasicAuthenticationAccess().getBasicAuthenticationKeyword_1()); 
            match(input,82,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5594:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5598:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalSecurityDsl.g:5599:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalSecurityDsl.g:5606:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5610:1: ( ( ( '-' )? ) )
            // InternalSecurityDsl.g:5611:1: ( ( '-' )? )
            {
            // InternalSecurityDsl.g:5611:1: ( ( '-' )? )
            // InternalSecurityDsl.g:5612:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalSecurityDsl.g:5613:2: ( '-' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==53) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSecurityDsl.g:5613:3: '-'
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
    // InternalSecurityDsl.g:5621:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5625:1: ( rule__EInt__Group__1__Impl )
            // InternalSecurityDsl.g:5626:2: rule__EInt__Group__1__Impl
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
    // InternalSecurityDsl.g:5632:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5636:1: ( ( RULE_INT ) )
            // InternalSecurityDsl.g:5637:1: ( RULE_INT )
            {
            // InternalSecurityDsl.g:5637:1: ( RULE_INT )
            // InternalSecurityDsl.g:5638:2: RULE_INT
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
    // InternalSecurityDsl.g:5648:1: rule__Application__ArtifactAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Application__ArtifactAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5652:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5653:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5653:2: ( ruleEString )
            // InternalSecurityDsl.g:5654:3: ruleEString
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
    // InternalSecurityDsl.g:5663:1: rule__Application__NameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Application__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5667:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5668:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5668:2: ( ruleEString )
            // InternalSecurityDsl.g:5669:3: ruleEString
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
    // InternalSecurityDsl.g:5678:1: rule__Application__GroupAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Application__GroupAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5682:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5683:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5683:2: ( ruleEString )
            // InternalSecurityDsl.g:5684:3: ruleEString
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
    // InternalSecurityDsl.g:5693:1: rule__Application__PackageNameAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Application__PackageNameAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5697:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5698:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5698:2: ( ruleEString )
            // InternalSecurityDsl.g:5699:3: ruleEString
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
    // InternalSecurityDsl.g:5708:1: rule__Application__DescriptionAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Application__DescriptionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5712:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5713:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5713:2: ( ruleEString )
            // InternalSecurityDsl.g:5714:3: ruleEString
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
    // InternalSecurityDsl.g:5723:1: rule__Application__PortAssignment_7_1 : ( ruleELongObject ) ;
    public final void rule__Application__PortAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5727:1: ( ( ruleELongObject ) )
            // InternalSecurityDsl.g:5728:2: ( ruleELongObject )
            {
            // InternalSecurityDsl.g:5728:2: ( ruleELongObject )
            // InternalSecurityDsl.g:5729:3: ruleELongObject
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
    // InternalSecurityDsl.g:5738:1: rule__Application__HostnameAssignment_8_1 : ( ruleEString ) ;
    public final void rule__Application__HostnameAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5742:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5743:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5743:2: ( ruleEString )
            // InternalSecurityDsl.g:5744:3: ruleEString
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
    // InternalSecurityDsl.g:5753:1: rule__Application__App_databaseAssignment_9_1 : ( ruleDatabase ) ;
    public final void rule__Application__App_databaseAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5757:1: ( ( ruleDatabase ) )
            // InternalSecurityDsl.g:5758:2: ( ruleDatabase )
            {
            // InternalSecurityDsl.g:5758:2: ( ruleDatabase )
            // InternalSecurityDsl.g:5759:3: ruleDatabase
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
    // InternalSecurityDsl.g:5768:1: rule__Application__App_modelsAssignment_10_1_1 : ( ruleUser ) ;
    public final void rule__Application__App_modelsAssignment_10_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5772:1: ( ( ruleUser ) )
            // InternalSecurityDsl.g:5773:2: ( ruleUser )
            {
            // InternalSecurityDsl.g:5773:2: ( ruleUser )
            // InternalSecurityDsl.g:5774:3: ruleUser
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
    // InternalSecurityDsl.g:5783:1: rule__Application__App_modelsAssignment_10_2_1 : ( ruleRole ) ;
    public final void rule__Application__App_modelsAssignment_10_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5787:1: ( ( ruleRole ) )
            // InternalSecurityDsl.g:5788:2: ( ruleRole )
            {
            // InternalSecurityDsl.g:5788:2: ( ruleRole )
            // InternalSecurityDsl.g:5789:3: ruleRole
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
    // InternalSecurityDsl.g:5798:1: rule__Application__App_securityAssignment_11_1 : ( ruleSecurity ) ;
    public final void rule__Application__App_securityAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5802:1: ( ( ruleSecurity ) )
            // InternalSecurityDsl.g:5803:2: ( ruleSecurity )
            {
            // InternalSecurityDsl.g:5803:2: ( ruleSecurity )
            // InternalSecurityDsl.g:5804:3: ruleSecurity
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
    // InternalSecurityDsl.g:5813:1: rule__Application__App_controllersAssignment_12_1_1 : ( ruleAuthentication ) ;
    public final void rule__Application__App_controllersAssignment_12_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5817:1: ( ( ruleAuthentication ) )
            // InternalSecurityDsl.g:5818:2: ( ruleAuthentication )
            {
            // InternalSecurityDsl.g:5818:2: ( ruleAuthentication )
            // InternalSecurityDsl.g:5819:3: ruleAuthentication
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
    // InternalSecurityDsl.g:5828:1: rule__Database__VendorNameAssignment_1 : ( ruleEDatabaseType ) ;
    public final void rule__Database__VendorNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5832:1: ( ( ruleEDatabaseType ) )
            // InternalSecurityDsl.g:5833:2: ( ruleEDatabaseType )
            {
            // InternalSecurityDsl.g:5833:2: ( ruleEDatabaseType )
            // InternalSecurityDsl.g:5834:3: ruleEDatabaseType
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
    // InternalSecurityDsl.g:5843:1: rule__Database__UrlAssignment_3 : ( ruleEString ) ;
    public final void rule__Database__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5847:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5848:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5848:2: ( ruleEString )
            // InternalSecurityDsl.g:5849:3: ruleEString
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
    // InternalSecurityDsl.g:5858:1: rule__Database__UsernameAssignment_5 : ( ruleEString ) ;
    public final void rule__Database__UsernameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5862:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5863:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5863:2: ( ruleEString )
            // InternalSecurityDsl.g:5864:3: ruleEString
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
    // InternalSecurityDsl.g:5873:1: rule__Database__PasswordAssignment_7 : ( ruleEString ) ;
    public final void rule__Database__PasswordAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5877:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5878:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5878:2: ( ruleEString )
            // InternalSecurityDsl.g:5879:3: ruleEString
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
    // InternalSecurityDsl.g:5888:1: rule__Attribute__IdentifierAssignment_1 : ( ( 'identifier' ) ) ;
    public final void rule__Attribute__IdentifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5892:1: ( ( ( 'identifier' ) ) )
            // InternalSecurityDsl.g:5893:2: ( ( 'identifier' ) )
            {
            // InternalSecurityDsl.g:5893:2: ( ( 'identifier' ) )
            // InternalSecurityDsl.g:5894:3: ( 'identifier' )
            {
             before(grammarAccess.getAttributeAccess().getIdentifierIdentifierKeyword_1_0()); 
            // InternalSecurityDsl.g:5895:3: ( 'identifier' )
            // InternalSecurityDsl.g:5896:4: 'identifier'
            {
             before(grammarAccess.getAttributeAccess().getIdentifierIdentifierKeyword_1_0()); 
            match(input,83,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5907:1: rule__Attribute__CredentialAssignment_2 : ( ( 'credential' ) ) ;
    public final void rule__Attribute__CredentialAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5911:1: ( ( ( 'credential' ) ) )
            // InternalSecurityDsl.g:5912:2: ( ( 'credential' ) )
            {
            // InternalSecurityDsl.g:5912:2: ( ( 'credential' ) )
            // InternalSecurityDsl.g:5913:3: ( 'credential' )
            {
             before(grammarAccess.getAttributeAccess().getCredentialCredentialKeyword_2_0()); 
            // InternalSecurityDsl.g:5914:3: ( 'credential' )
            // InternalSecurityDsl.g:5915:4: 'credential'
            {
             before(grammarAccess.getAttributeAccess().getCredentialCredentialKeyword_2_0()); 
            match(input,84,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5926:1: rule__Attribute__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5930:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5931:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5931:2: ( ruleEString )
            // InternalSecurityDsl.g:5932:3: ruleEString
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
    // InternalSecurityDsl.g:5941:1: rule__Attribute__TypeAssignment_6 : ( ruleEType ) ;
    public final void rule__Attribute__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5945:1: ( ( ruleEType ) )
            // InternalSecurityDsl.g:5946:2: ( ruleEType )
            {
            // InternalSecurityDsl.g:5946:2: ( ruleEType )
            // InternalSecurityDsl.g:5947:3: ruleEType
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
    // InternalSecurityDsl.g:5956:1: rule__Attribute__CollumnNameAssignment_7_1 : ( ruleEString ) ;
    public final void rule__Attribute__CollumnNameAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5960:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5961:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5961:2: ( ruleEString )
            // InternalSecurityDsl.g:5962:3: ruleEString
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
    // InternalSecurityDsl.g:5971:1: rule__Role__TableNameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__Role__TableNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5975:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5976:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5976:2: ( ruleEString )
            // InternalSecurityDsl.g:5977:3: ruleEString
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
    // InternalSecurityDsl.g:5986:1: rule__Role__Model_attributesAssignment_2_2 : ( ruleAttribute ) ;
    public final void rule__Role__Model_attributesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5990:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:5991:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:5991:2: ( ruleAttribute )
            // InternalSecurityDsl.g:5992:3: ruleAttribute
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
    // InternalSecurityDsl.g:6001:1: rule__Role__Model_attributesAssignment_2_3_1 : ( ruleAttribute ) ;
    public final void rule__Role__Model_attributesAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6005:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:6006:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:6006:2: ( ruleAttribute )
            // InternalSecurityDsl.g:6007:3: ruleAttribute
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
    // InternalSecurityDsl.g:6016:1: rule__Role__Role_instancesAssignment_3_2 : ( ruleRoleInstance ) ;
    public final void rule__Role__Role_instancesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6020:1: ( ( ruleRoleInstance ) )
            // InternalSecurityDsl.g:6021:2: ( ruleRoleInstance )
            {
            // InternalSecurityDsl.g:6021:2: ( ruleRoleInstance )
            // InternalSecurityDsl.g:6022:3: ruleRoleInstance
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
    // InternalSecurityDsl.g:6031:1: rule__Role__Role_instancesAssignment_3_3_1 : ( ruleRoleInstance ) ;
    public final void rule__Role__Role_instancesAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6035:1: ( ( ruleRoleInstance ) )
            // InternalSecurityDsl.g:6036:2: ( ruleRoleInstance )
            {
            // InternalSecurityDsl.g:6036:2: ( ruleRoleInstance )
            // InternalSecurityDsl.g:6037:3: ruleRoleInstance
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
    // InternalSecurityDsl.g:6046:1: rule__User__TableNameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__User__TableNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6050:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6051:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6051:2: ( ruleEString )
            // InternalSecurityDsl.g:6052:3: ruleEString
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
    // InternalSecurityDsl.g:6061:1: rule__User__Model_attributesAssignment_2_2 : ( ruleAttribute ) ;
    public final void rule__User__Model_attributesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6065:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:6066:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:6066:2: ( ruleAttribute )
            // InternalSecurityDsl.g:6067:3: ruleAttribute
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
    // InternalSecurityDsl.g:6076:1: rule__User__Model_attributesAssignment_2_3_1 : ( ruleAttribute ) ;
    public final void rule__User__Model_attributesAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6080:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:6081:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:6081:2: ( ruleAttribute )
            // InternalSecurityDsl.g:6082:3: ruleAttribute
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
    // InternalSecurityDsl.g:6091:1: rule__RoleInstance__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__RoleInstance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6095:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6096:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6096:2: ( ruleEString )
            // InternalSecurityDsl.g:6097:3: ruleEString
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
    // InternalSecurityDsl.g:6106:1: rule__Endpoint__UrlAssignment_2 : ( ruleEString ) ;
    public final void rule__Endpoint__UrlAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6110:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6111:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6111:2: ( ruleEString )
            // InternalSecurityDsl.g:6112:3: ruleEString
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
    // InternalSecurityDsl.g:6121:1: rule__Endpoint__FunctionNameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Endpoint__FunctionNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6125:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6126:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6126:2: ( ruleEString )
            // InternalSecurityDsl.g:6127:3: ruleEString
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
    // InternalSecurityDsl.g:6136:1: rule__Endpoint__MethodAssignment_4_1 : ( ruleEEndpointMethod ) ;
    public final void rule__Endpoint__MethodAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6140:1: ( ( ruleEEndpointMethod ) )
            // InternalSecurityDsl.g:6141:2: ( ruleEEndpointMethod )
            {
            // InternalSecurityDsl.g:6141:2: ( ruleEEndpointMethod )
            // InternalSecurityDsl.g:6142:3: ruleEEndpointMethod
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
    // InternalSecurityDsl.g:6151:1: rule__Endpoint__TypeAssignment_5_1 : ( ruleEEndpointType ) ;
    public final void rule__Endpoint__TypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6155:1: ( ( ruleEEndpointType ) )
            // InternalSecurityDsl.g:6156:2: ( ruleEEndpointType )
            {
            // InternalSecurityDsl.g:6156:2: ( ruleEEndpointType )
            // InternalSecurityDsl.g:6157:3: ruleEEndpointType
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
    // InternalSecurityDsl.g:6166:1: rule__Endpoint__Role_authoritiesAssignment_6_2 : ( ( ruleEString ) ) ;
    public final void rule__Endpoint__Role_authoritiesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6170:1: ( ( ( ruleEString ) ) )
            // InternalSecurityDsl.g:6171:2: ( ( ruleEString ) )
            {
            // InternalSecurityDsl.g:6171:2: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6172:3: ( ruleEString )
            {
             before(grammarAccess.getEndpointAccess().getRole_authoritiesRoleInstanceCrossReference_6_2_0()); 
            // InternalSecurityDsl.g:6173:3: ( ruleEString )
            // InternalSecurityDsl.g:6174:4: ruleEString
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
    // InternalSecurityDsl.g:6185:1: rule__Endpoint__Role_authoritiesAssignment_6_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Endpoint__Role_authoritiesAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6189:1: ( ( ( ruleEString ) ) )
            // InternalSecurityDsl.g:6190:2: ( ( ruleEString ) )
            {
            // InternalSecurityDsl.g:6190:2: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6191:3: ( ruleEString )
            {
             before(grammarAccess.getEndpointAccess().getRole_authoritiesRoleInstanceCrossReference_6_3_1_0()); 
            // InternalSecurityDsl.g:6192:3: ( ruleEString )
            // InternalSecurityDsl.g:6193:4: ruleEString
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
    // InternalSecurityDsl.g:6204:1: rule__Authentication__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Authentication__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6208:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6209:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6209:2: ( ruleEString )
            // InternalSecurityDsl.g:6210:3: ruleEString
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
    // InternalSecurityDsl.g:6219:1: rule__Authentication__PathAssignment_4 : ( ruleEString ) ;
    public final void rule__Authentication__PathAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6223:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6224:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6224:2: ( ruleEString )
            // InternalSecurityDsl.g:6225:3: ruleEString
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
    // InternalSecurityDsl.g:6234:1: rule__Authentication__Controller_endpointsAssignment_5_2 : ( ruleEndpoint ) ;
    public final void rule__Authentication__Controller_endpointsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6238:1: ( ( ruleEndpoint ) )
            // InternalSecurityDsl.g:6239:2: ( ruleEndpoint )
            {
            // InternalSecurityDsl.g:6239:2: ( ruleEndpoint )
            // InternalSecurityDsl.g:6240:3: ruleEndpoint
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
    // InternalSecurityDsl.g:6249:1: rule__Authentication__Controller_endpointsAssignment_5_3_1 : ( ruleEndpoint ) ;
    public final void rule__Authentication__Controller_endpointsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6253:1: ( ( ruleEndpoint ) )
            // InternalSecurityDsl.g:6254:2: ( ruleEndpoint )
            {
            // InternalSecurityDsl.g:6254:2: ( ruleEndpoint )
            // InternalSecurityDsl.g:6255:3: ruleEndpoint
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
    // InternalSecurityDsl.g:6264:1: rule__JWT__SignatureAlgorithmAssignment_3 : ( ruleEString ) ;
    public final void rule__JWT__SignatureAlgorithmAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6268:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6269:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6269:2: ( ruleEString )
            // InternalSecurityDsl.g:6270:3: ruleEString
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
    // InternalSecurityDsl.g:6279:1: rule__JWT__RegisteredclaimsAssignment_7 : ( ruleRegisteredClaims ) ;
    public final void rule__JWT__RegisteredclaimsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6283:1: ( ( ruleRegisteredClaims ) )
            // InternalSecurityDsl.g:6284:2: ( ruleRegisteredClaims )
            {
            // InternalSecurityDsl.g:6284:2: ( ruleRegisteredClaims )
            // InternalSecurityDsl.g:6285:3: ruleRegisteredClaims
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
    // InternalSecurityDsl.g:6294:1: rule__JWT__Jwt_claimsAssignment_8_1 : ( ruleClaim ) ;
    public final void rule__JWT__Jwt_claimsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6298:1: ( ( ruleClaim ) )
            // InternalSecurityDsl.g:6299:2: ( ruleClaim )
            {
            // InternalSecurityDsl.g:6299:2: ( ruleClaim )
            // InternalSecurityDsl.g:6300:3: ruleClaim
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
    // InternalSecurityDsl.g:6309:1: rule__JWT__SecretAssignment_10_2 : ( ruleEString ) ;
    public final void rule__JWT__SecretAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6313:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6314:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6314:2: ( ruleEString )
            // InternalSecurityDsl.g:6315:3: ruleEString
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
    // InternalSecurityDsl.g:6324:1: rule__Claim__TypeAssignment_1_0 : ( ruleEClaimType ) ;
    public final void rule__Claim__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6328:1: ( ( ruleEClaimType ) )
            // InternalSecurityDsl.g:6329:2: ( ruleEClaimType )
            {
            // InternalSecurityDsl.g:6329:2: ( ruleEClaimType )
            // InternalSecurityDsl.g:6330:3: ruleEClaimType
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
    // InternalSecurityDsl.g:6339:1: rule__Claim__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Claim__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6343:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6344:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6344:2: ( ruleEString )
            // InternalSecurityDsl.g:6345:3: ruleEString
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
    // InternalSecurityDsl.g:6354:1: rule__Claim__Claim_attributeAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Claim__Claim_attributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6358:1: ( ( ( ruleEString ) ) )
            // InternalSecurityDsl.g:6359:2: ( ( ruleEString ) )
            {
            // InternalSecurityDsl.g:6359:2: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6360:3: ( ruleEString )
            {
             before(grammarAccess.getClaimAccess().getClaim_attributeAttributeCrossReference_4_0()); 
            // InternalSecurityDsl.g:6361:3: ( ruleEString )
            // InternalSecurityDsl.g:6362:4: ruleEString
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
    // InternalSecurityDsl.g:6373:1: rule__RegisteredClaims__ExpirationTimeAssignment_3 : ( ruleEInt ) ;
    public final void rule__RegisteredClaims__ExpirationTimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6377:1: ( ( ruleEInt ) )
            // InternalSecurityDsl.g:6378:2: ( ruleEInt )
            {
            // InternalSecurityDsl.g:6378:2: ( ruleEInt )
            // InternalSecurityDsl.g:6379:3: ruleEInt
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
    // InternalSecurityDsl.g:6388:1: rule__RegisteredClaims__IssuerAssignment_5_4 : ( ruleEString ) ;
    public final void rule__RegisteredClaims__IssuerAssignment_5_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6392:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6393:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6393:2: ( ruleEString )
            // InternalSecurityDsl.g:6394:3: ruleEString
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
    // InternalSecurityDsl.g:6403:1: rule__RegisteredClaims__AudienceAssignment_6_4 : ( ruleEString ) ;
    public final void rule__RegisteredClaims__AudienceAssignment_6_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6407:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6408:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6408:2: ( ruleEString )
            // InternalSecurityDsl.g:6409:3: ruleEString
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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000060020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000000000L,0x0000000000180000L});
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
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});

}