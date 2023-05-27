package org.ftn.domij.securitydsl.ide.contentassist.antlr.internal;

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
import org.ftn.domij.securitydsl.services.SecurityDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSecurityDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_NL", "RULE_TAB", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'JWT'", "'INT'", "'STRING'", "'FLOAT'", "'LONG'", "'CHAR'", "'BOOLEAN'", "'DOUBLE'", "'BYTE'", "'SHORT'", "'GET'", "'PUT'", "'POST'", "'DELETE'", "'POSTGRES'", "'ORACLE'", "'MYSQL'", "'application:'", "'name:'", "'description:'", "'database:'", "'security:'", "'model:'", "'user:'", "'role:'", "'other:'", "'['", "']'", "','", "'controllers:'", "'auth:'", "'vendorName:'", "'url:'", "'username:'", "'password:'", "'{'", "'type:'", "'}'", "'identifier:'", "'other-fields:'", "'method-name:'", "'method:'", "'path:'", "'signup-url:'", "'login-url:'", "'logout-url:'", "'endpoints:'", "'mechanism:'", "'jwt:'", "'header:'", "'signature-algorithm:'", "'payload:'", "'issuer:'", "'expiration-time:'", "'audience:'", "'signature:'", "'secret:'", "'public-claims:'", "'private-claims:'", "'-'"
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
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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


    // $ANTLR start "entryRuleAuthEndpoint"
    // InternalSecurityDsl.g:278:1: entryRuleAuthEndpoint : ruleAuthEndpoint EOF ;
    public final void entryRuleAuthEndpoint() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:279:1: ( ruleAuthEndpoint EOF )
            // InternalSecurityDsl.g:280:1: ruleAuthEndpoint EOF
            {
             before(grammarAccess.getAuthEndpointRule()); 
            pushFollow(FOLLOW_1);
            ruleAuthEndpoint();

            state._fsp--;

             after(grammarAccess.getAuthEndpointRule()); 
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
    // $ANTLR end "entryRuleAuthEndpoint"


    // $ANTLR start "ruleAuthEndpoint"
    // InternalSecurityDsl.g:287:1: ruleAuthEndpoint : ( ( rule__AuthEndpoint__Group__0 ) ) ;
    public final void ruleAuthEndpoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:291:2: ( ( ( rule__AuthEndpoint__Group__0 ) ) )
            // InternalSecurityDsl.g:292:2: ( ( rule__AuthEndpoint__Group__0 ) )
            {
            // InternalSecurityDsl.g:292:2: ( ( rule__AuthEndpoint__Group__0 ) )
            // InternalSecurityDsl.g:293:3: ( rule__AuthEndpoint__Group__0 )
            {
             before(grammarAccess.getAuthEndpointAccess().getGroup()); 
            // InternalSecurityDsl.g:294:3: ( rule__AuthEndpoint__Group__0 )
            // InternalSecurityDsl.g:294:4: rule__AuthEndpoint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AuthEndpoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAuthEndpointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAuthEndpoint"


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


    // $ANTLR start "entryRuleOtherController"
    // InternalSecurityDsl.g:328:1: entryRuleOtherController : ruleOtherController EOF ;
    public final void entryRuleOtherController() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:329:1: ( ruleOtherController EOF )
            // InternalSecurityDsl.g:330:1: ruleOtherController EOF
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
    // InternalSecurityDsl.g:337:1: ruleOtherController : ( ( rule__OtherController__Group__0 ) ) ;
    public final void ruleOtherController() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:341:2: ( ( ( rule__OtherController__Group__0 ) ) )
            // InternalSecurityDsl.g:342:2: ( ( rule__OtherController__Group__0 ) )
            {
            // InternalSecurityDsl.g:342:2: ( ( rule__OtherController__Group__0 ) )
            // InternalSecurityDsl.g:343:3: ( rule__OtherController__Group__0 )
            {
             before(grammarAccess.getOtherControllerAccess().getGroup()); 
            // InternalSecurityDsl.g:344:3: ( rule__OtherController__Group__0 )
            // InternalSecurityDsl.g:344:4: rule__OtherController__Group__0
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
    // InternalSecurityDsl.g:353:1: entryRuleJwtSecurity : ruleJwtSecurity EOF ;
    public final void entryRuleJwtSecurity() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:354:1: ( ruleJwtSecurity EOF )
            // InternalSecurityDsl.g:355:1: ruleJwtSecurity EOF
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
    // InternalSecurityDsl.g:362:1: ruleJwtSecurity : ( ( rule__JwtSecurity__Group__0 ) ) ;
    public final void ruleJwtSecurity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:366:2: ( ( ( rule__JwtSecurity__Group__0 ) ) )
            // InternalSecurityDsl.g:367:2: ( ( rule__JwtSecurity__Group__0 ) )
            {
            // InternalSecurityDsl.g:367:2: ( ( rule__JwtSecurity__Group__0 ) )
            // InternalSecurityDsl.g:368:3: ( rule__JwtSecurity__Group__0 )
            {
             before(grammarAccess.getJwtSecurityAccess().getGroup()); 
            // InternalSecurityDsl.g:369:3: ( rule__JwtSecurity__Group__0 )
            // InternalSecurityDsl.g:369:4: rule__JwtSecurity__Group__0
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
    // InternalSecurityDsl.g:378:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:379:1: ( ruleEInt EOF )
            // InternalSecurityDsl.g:380:1: ruleEInt EOF
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
    // InternalSecurityDsl.g:387:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:391:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalSecurityDsl.g:392:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalSecurityDsl.g:392:2: ( ( rule__EInt__Group__0 ) )
            // InternalSecurityDsl.g:393:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalSecurityDsl.g:394:3: ( rule__EInt__Group__0 )
            // InternalSecurityDsl.g:394:4: rule__EInt__Group__0
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


    // $ANTLR start "entryRulePublic"
    // InternalSecurityDsl.g:403:1: entryRulePublic : rulePublic EOF ;
    public final void entryRulePublic() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:404:1: ( rulePublic EOF )
            // InternalSecurityDsl.g:405:1: rulePublic EOF
            {
             before(grammarAccess.getPublicRule()); 
            pushFollow(FOLLOW_1);
            rulePublic();

            state._fsp--;

             after(grammarAccess.getPublicRule()); 
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
    // $ANTLR end "entryRulePublic"


    // $ANTLR start "rulePublic"
    // InternalSecurityDsl.g:412:1: rulePublic : ( ( rule__Public__Group__0 ) ) ;
    public final void rulePublic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:416:2: ( ( ( rule__Public__Group__0 ) ) )
            // InternalSecurityDsl.g:417:2: ( ( rule__Public__Group__0 ) )
            {
            // InternalSecurityDsl.g:417:2: ( ( rule__Public__Group__0 ) )
            // InternalSecurityDsl.g:418:3: ( rule__Public__Group__0 )
            {
             before(grammarAccess.getPublicAccess().getGroup()); 
            // InternalSecurityDsl.g:419:3: ( rule__Public__Group__0 )
            // InternalSecurityDsl.g:419:4: rule__Public__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Public__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPublicAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePublic"


    // $ANTLR start "entryRulePrivate"
    // InternalSecurityDsl.g:428:1: entryRulePrivate : rulePrivate EOF ;
    public final void entryRulePrivate() throws RecognitionException {
        try {
            // InternalSecurityDsl.g:429:1: ( rulePrivate EOF )
            // InternalSecurityDsl.g:430:1: rulePrivate EOF
            {
             before(grammarAccess.getPrivateRule()); 
            pushFollow(FOLLOW_1);
            rulePrivate();

            state._fsp--;

             after(grammarAccess.getPrivateRule()); 
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
    // $ANTLR end "entryRulePrivate"


    // $ANTLR start "rulePrivate"
    // InternalSecurityDsl.g:437:1: rulePrivate : ( ( rule__Private__Group__0 ) ) ;
    public final void rulePrivate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:441:2: ( ( ( rule__Private__Group__0 ) ) )
            // InternalSecurityDsl.g:442:2: ( ( rule__Private__Group__0 ) )
            {
            // InternalSecurityDsl.g:442:2: ( ( rule__Private__Group__0 ) )
            // InternalSecurityDsl.g:443:3: ( rule__Private__Group__0 )
            {
             before(grammarAccess.getPrivateAccess().getGroup()); 
            // InternalSecurityDsl.g:444:3: ( rule__Private__Group__0 )
            // InternalSecurityDsl.g:444:4: rule__Private__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Private__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrivateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrivate"


    // $ANTLR start "ruleEType"
    // InternalSecurityDsl.g:453:1: ruleEType : ( ( rule__EType__Alternatives ) ) ;
    public final void ruleEType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:457:1: ( ( ( rule__EType__Alternatives ) ) )
            // InternalSecurityDsl.g:458:2: ( ( rule__EType__Alternatives ) )
            {
            // InternalSecurityDsl.g:458:2: ( ( rule__EType__Alternatives ) )
            // InternalSecurityDsl.g:459:3: ( rule__EType__Alternatives )
            {
             before(grammarAccess.getETypeAccess().getAlternatives()); 
            // InternalSecurityDsl.g:460:3: ( rule__EType__Alternatives )
            // InternalSecurityDsl.g:460:4: rule__EType__Alternatives
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
    // InternalSecurityDsl.g:469:1: ruleEEndpointMethod : ( ( rule__EEndpointMethod__Alternatives ) ) ;
    public final void ruleEEndpointMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:473:1: ( ( ( rule__EEndpointMethod__Alternatives ) ) )
            // InternalSecurityDsl.g:474:2: ( ( rule__EEndpointMethod__Alternatives ) )
            {
            // InternalSecurityDsl.g:474:2: ( ( rule__EEndpointMethod__Alternatives ) )
            // InternalSecurityDsl.g:475:3: ( rule__EEndpointMethod__Alternatives )
            {
             before(grammarAccess.getEEndpointMethodAccess().getAlternatives()); 
            // InternalSecurityDsl.g:476:3: ( rule__EEndpointMethod__Alternatives )
            // InternalSecurityDsl.g:476:4: rule__EEndpointMethod__Alternatives
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
    // InternalSecurityDsl.g:485:1: ruleESecurityMechanism : ( ( 'JWT' ) ) ;
    public final void ruleESecurityMechanism() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:489:1: ( ( ( 'JWT' ) ) )
            // InternalSecurityDsl.g:490:2: ( ( 'JWT' ) )
            {
            // InternalSecurityDsl.g:490:2: ( ( 'JWT' ) )
            // InternalSecurityDsl.g:491:3: ( 'JWT' )
            {
             before(grammarAccess.getESecurityMechanismAccess().getJWTEnumLiteralDeclaration()); 
            // InternalSecurityDsl.g:492:3: ( 'JWT' )
            // InternalSecurityDsl.g:492:4: 'JWT'
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
    // InternalSecurityDsl.g:501:1: ruleEDatabaseType : ( ( rule__EDatabaseType__Alternatives ) ) ;
    public final void ruleEDatabaseType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:505:1: ( ( ( rule__EDatabaseType__Alternatives ) ) )
            // InternalSecurityDsl.g:506:2: ( ( rule__EDatabaseType__Alternatives ) )
            {
            // InternalSecurityDsl.g:506:2: ( ( rule__EDatabaseType__Alternatives ) )
            // InternalSecurityDsl.g:507:3: ( rule__EDatabaseType__Alternatives )
            {
             before(grammarAccess.getEDatabaseTypeAccess().getAlternatives()); 
            // InternalSecurityDsl.g:508:3: ( rule__EDatabaseType__Alternatives )
            // InternalSecurityDsl.g:508:4: rule__EDatabaseType__Alternatives
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
    // InternalSecurityDsl.g:516:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:520:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalSecurityDsl.g:521:2: ( RULE_STRING )
                    {
                    // InternalSecurityDsl.g:521:2: ( RULE_STRING )
                    // InternalSecurityDsl.g:522:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:527:2: ( RULE_ID )
                    {
                    // InternalSecurityDsl.g:527:2: ( RULE_ID )
                    // InternalSecurityDsl.g:528:3: RULE_ID
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
    // InternalSecurityDsl.g:537:1: rule__EType__Alternatives : ( ( ( 'INT' ) ) | ( ( 'STRING' ) ) | ( ( 'FLOAT' ) ) | ( ( 'LONG' ) ) | ( ( 'CHAR' ) ) | ( ( 'BOOLEAN' ) ) | ( ( 'DOUBLE' ) ) | ( ( 'BYTE' ) ) | ( ( 'SHORT' ) ) );
    public final void rule__EType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:541:1: ( ( ( 'INT' ) ) | ( ( 'STRING' ) ) | ( ( 'FLOAT' ) ) | ( ( 'LONG' ) ) | ( ( 'CHAR' ) ) | ( ( 'BOOLEAN' ) ) | ( ( 'DOUBLE' ) ) | ( ( 'BYTE' ) ) | ( ( 'SHORT' ) ) )
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
                    // InternalSecurityDsl.g:542:2: ( ( 'INT' ) )
                    {
                    // InternalSecurityDsl.g:542:2: ( ( 'INT' ) )
                    // InternalSecurityDsl.g:543:3: ( 'INT' )
                    {
                     before(grammarAccess.getETypeAccess().getINTEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:544:3: ( 'INT' )
                    // InternalSecurityDsl.g:544:4: 'INT'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getINTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:548:2: ( ( 'STRING' ) )
                    {
                    // InternalSecurityDsl.g:548:2: ( ( 'STRING' ) )
                    // InternalSecurityDsl.g:549:3: ( 'STRING' )
                    {
                     before(grammarAccess.getETypeAccess().getSTRINGEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:550:3: ( 'STRING' )
                    // InternalSecurityDsl.g:550:4: 'STRING'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getSTRINGEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:554:2: ( ( 'FLOAT' ) )
                    {
                    // InternalSecurityDsl.g:554:2: ( ( 'FLOAT' ) )
                    // InternalSecurityDsl.g:555:3: ( 'FLOAT' )
                    {
                     before(grammarAccess.getETypeAccess().getFLOATEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:556:3: ( 'FLOAT' )
                    // InternalSecurityDsl.g:556:4: 'FLOAT'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getFLOATEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:560:2: ( ( 'LONG' ) )
                    {
                    // InternalSecurityDsl.g:560:2: ( ( 'LONG' ) )
                    // InternalSecurityDsl.g:561:3: ( 'LONG' )
                    {
                     before(grammarAccess.getETypeAccess().getLONGEnumLiteralDeclaration_3()); 
                    // InternalSecurityDsl.g:562:3: ( 'LONG' )
                    // InternalSecurityDsl.g:562:4: 'LONG'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getLONGEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSecurityDsl.g:566:2: ( ( 'CHAR' ) )
                    {
                    // InternalSecurityDsl.g:566:2: ( ( 'CHAR' ) )
                    // InternalSecurityDsl.g:567:3: ( 'CHAR' )
                    {
                     before(grammarAccess.getETypeAccess().getCHAREnumLiteralDeclaration_4()); 
                    // InternalSecurityDsl.g:568:3: ( 'CHAR' )
                    // InternalSecurityDsl.g:568:4: 'CHAR'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getCHAREnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSecurityDsl.g:572:2: ( ( 'BOOLEAN' ) )
                    {
                    // InternalSecurityDsl.g:572:2: ( ( 'BOOLEAN' ) )
                    // InternalSecurityDsl.g:573:3: ( 'BOOLEAN' )
                    {
                     before(grammarAccess.getETypeAccess().getBOOLEANEnumLiteralDeclaration_5()); 
                    // InternalSecurityDsl.g:574:3: ( 'BOOLEAN' )
                    // InternalSecurityDsl.g:574:4: 'BOOLEAN'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getBOOLEANEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSecurityDsl.g:578:2: ( ( 'DOUBLE' ) )
                    {
                    // InternalSecurityDsl.g:578:2: ( ( 'DOUBLE' ) )
                    // InternalSecurityDsl.g:579:3: ( 'DOUBLE' )
                    {
                     before(grammarAccess.getETypeAccess().getDOUBLEEnumLiteralDeclaration_6()); 
                    // InternalSecurityDsl.g:580:3: ( 'DOUBLE' )
                    // InternalSecurityDsl.g:580:4: 'DOUBLE'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getDOUBLEEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSecurityDsl.g:584:2: ( ( 'BYTE' ) )
                    {
                    // InternalSecurityDsl.g:584:2: ( ( 'BYTE' ) )
                    // InternalSecurityDsl.g:585:3: ( 'BYTE' )
                    {
                     before(grammarAccess.getETypeAccess().getBYTEEnumLiteralDeclaration_7()); 
                    // InternalSecurityDsl.g:586:3: ( 'BYTE' )
                    // InternalSecurityDsl.g:586:4: 'BYTE'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getETypeAccess().getBYTEEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSecurityDsl.g:590:2: ( ( 'SHORT' ) )
                    {
                    // InternalSecurityDsl.g:590:2: ( ( 'SHORT' ) )
                    // InternalSecurityDsl.g:591:3: ( 'SHORT' )
                    {
                     before(grammarAccess.getETypeAccess().getSHORTEnumLiteralDeclaration_8()); 
                    // InternalSecurityDsl.g:592:3: ( 'SHORT' )
                    // InternalSecurityDsl.g:592:4: 'SHORT'
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
    // InternalSecurityDsl.g:600:1: rule__EEndpointMethod__Alternatives : ( ( ( 'GET' ) ) | ( ( 'PUT' ) ) | ( ( 'POST' ) ) | ( ( 'DELETE' ) ) );
    public final void rule__EEndpointMethod__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:604:1: ( ( ( 'GET' ) ) | ( ( 'PUT' ) ) | ( ( 'POST' ) ) | ( ( 'DELETE' ) ) )
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
                    // InternalSecurityDsl.g:605:2: ( ( 'GET' ) )
                    {
                    // InternalSecurityDsl.g:605:2: ( ( 'GET' ) )
                    // InternalSecurityDsl.g:606:3: ( 'GET' )
                    {
                     before(grammarAccess.getEEndpointMethodAccess().getGETEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:607:3: ( 'GET' )
                    // InternalSecurityDsl.g:607:4: 'GET'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointMethodAccess().getGETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:611:2: ( ( 'PUT' ) )
                    {
                    // InternalSecurityDsl.g:611:2: ( ( 'PUT' ) )
                    // InternalSecurityDsl.g:612:3: ( 'PUT' )
                    {
                     before(grammarAccess.getEEndpointMethodAccess().getPUTEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:613:3: ( 'PUT' )
                    // InternalSecurityDsl.g:613:4: 'PUT'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointMethodAccess().getPUTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:617:2: ( ( 'POST' ) )
                    {
                    // InternalSecurityDsl.g:617:2: ( ( 'POST' ) )
                    // InternalSecurityDsl.g:618:3: ( 'POST' )
                    {
                     before(grammarAccess.getEEndpointMethodAccess().getPOSTEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:619:3: ( 'POST' )
                    // InternalSecurityDsl.g:619:4: 'POST'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getEEndpointMethodAccess().getPOSTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:623:2: ( ( 'DELETE' ) )
                    {
                    // InternalSecurityDsl.g:623:2: ( ( 'DELETE' ) )
                    // InternalSecurityDsl.g:624:3: ( 'DELETE' )
                    {
                     before(grammarAccess.getEEndpointMethodAccess().getDELETEEnumLiteralDeclaration_3()); 
                    // InternalSecurityDsl.g:625:3: ( 'DELETE' )
                    // InternalSecurityDsl.g:625:4: 'DELETE'
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
    // InternalSecurityDsl.g:633:1: rule__EDatabaseType__Alternatives : ( ( ( 'POSTGRES' ) ) | ( ( 'ORACLE' ) ) | ( ( 'MYSQL' ) ) );
    public final void rule__EDatabaseType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:637:1: ( ( ( 'POSTGRES' ) ) | ( ( 'ORACLE' ) ) | ( ( 'MYSQL' ) ) )
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
                    // InternalSecurityDsl.g:638:2: ( ( 'POSTGRES' ) )
                    {
                    // InternalSecurityDsl.g:638:2: ( ( 'POSTGRES' ) )
                    // InternalSecurityDsl.g:639:3: ( 'POSTGRES' )
                    {
                     before(grammarAccess.getEDatabaseTypeAccess().getPOSTGRESEnumLiteralDeclaration_0()); 
                    // InternalSecurityDsl.g:640:3: ( 'POSTGRES' )
                    // InternalSecurityDsl.g:640:4: 'POSTGRES'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getEDatabaseTypeAccess().getPOSTGRESEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:644:2: ( ( 'ORACLE' ) )
                    {
                    // InternalSecurityDsl.g:644:2: ( ( 'ORACLE' ) )
                    // InternalSecurityDsl.g:645:3: ( 'ORACLE' )
                    {
                     before(grammarAccess.getEDatabaseTypeAccess().getORACLEEnumLiteralDeclaration_1()); 
                    // InternalSecurityDsl.g:646:3: ( 'ORACLE' )
                    // InternalSecurityDsl.g:646:4: 'ORACLE'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getEDatabaseTypeAccess().getORACLEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:650:2: ( ( 'MYSQL' ) )
                    {
                    // InternalSecurityDsl.g:650:2: ( ( 'MYSQL' ) )
                    // InternalSecurityDsl.g:651:3: ( 'MYSQL' )
                    {
                     before(grammarAccess.getEDatabaseTypeAccess().getMYSQLEnumLiteralDeclaration_2()); 
                    // InternalSecurityDsl.g:652:3: ( 'MYSQL' )
                    // InternalSecurityDsl.g:652:4: 'MYSQL'
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
    // InternalSecurityDsl.g:660:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:664:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // InternalSecurityDsl.g:665:2: rule__Application__Group__0__Impl rule__Application__Group__1
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
    // InternalSecurityDsl.g:672:1: rule__Application__Group__0__Impl : ( () ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:676:1: ( ( () ) )
            // InternalSecurityDsl.g:677:1: ( () )
            {
            // InternalSecurityDsl.g:677:1: ( () )
            // InternalSecurityDsl.g:678:2: ()
            {
             before(grammarAccess.getApplicationAccess().getApplicationAction_0()); 
            // InternalSecurityDsl.g:679:2: ()
            // InternalSecurityDsl.g:679:3: 
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
    // InternalSecurityDsl.g:687:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:691:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // InternalSecurityDsl.g:692:2: rule__Application__Group__1__Impl rule__Application__Group__2
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
    // InternalSecurityDsl.g:699:1: rule__Application__Group__1__Impl : ( 'application:' ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:703:1: ( ( 'application:' ) )
            // InternalSecurityDsl.g:704:1: ( 'application:' )
            {
            // InternalSecurityDsl.g:704:1: ( 'application:' )
            // InternalSecurityDsl.g:705:2: 'application:'
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
    // InternalSecurityDsl.g:714:1: rule__Application__Group__2 : rule__Application__Group__2__Impl rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:718:1: ( rule__Application__Group__2__Impl rule__Application__Group__3 )
            // InternalSecurityDsl.g:719:2: rule__Application__Group__2__Impl rule__Application__Group__3
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
    // InternalSecurityDsl.g:726:1: rule__Application__Group__2__Impl : ( 'name:' ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:730:1: ( ( 'name:' ) )
            // InternalSecurityDsl.g:731:1: ( 'name:' )
            {
            // InternalSecurityDsl.g:731:1: ( 'name:' )
            // InternalSecurityDsl.g:732:2: 'name:'
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
    // InternalSecurityDsl.g:741:1: rule__Application__Group__3 : rule__Application__Group__3__Impl rule__Application__Group__4 ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:745:1: ( rule__Application__Group__3__Impl rule__Application__Group__4 )
            // InternalSecurityDsl.g:746:2: rule__Application__Group__3__Impl rule__Application__Group__4
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
    // InternalSecurityDsl.g:753:1: rule__Application__Group__3__Impl : ( ( rule__Application__NameAssignment_3 ) ) ;
    public final void rule__Application__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:757:1: ( ( ( rule__Application__NameAssignment_3 ) ) )
            // InternalSecurityDsl.g:758:1: ( ( rule__Application__NameAssignment_3 ) )
            {
            // InternalSecurityDsl.g:758:1: ( ( rule__Application__NameAssignment_3 ) )
            // InternalSecurityDsl.g:759:2: ( rule__Application__NameAssignment_3 )
            {
             before(grammarAccess.getApplicationAccess().getNameAssignment_3()); 
            // InternalSecurityDsl.g:760:2: ( rule__Application__NameAssignment_3 )
            // InternalSecurityDsl.g:760:3: rule__Application__NameAssignment_3
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
    // InternalSecurityDsl.g:768:1: rule__Application__Group__4 : rule__Application__Group__4__Impl rule__Application__Group__5 ;
    public final void rule__Application__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:772:1: ( rule__Application__Group__4__Impl rule__Application__Group__5 )
            // InternalSecurityDsl.g:773:2: rule__Application__Group__4__Impl rule__Application__Group__5
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
    // InternalSecurityDsl.g:780:1: rule__Application__Group__4__Impl : ( ( rule__Application__Group_4__0 )? ) ;
    public final void rule__Application__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:784:1: ( ( ( rule__Application__Group_4__0 )? ) )
            // InternalSecurityDsl.g:785:1: ( ( rule__Application__Group_4__0 )? )
            {
            // InternalSecurityDsl.g:785:1: ( ( rule__Application__Group_4__0 )? )
            // InternalSecurityDsl.g:786:2: ( rule__Application__Group_4__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_4()); 
            // InternalSecurityDsl.g:787:2: ( rule__Application__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==32) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSecurityDsl.g:787:3: rule__Application__Group_4__0
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
    // InternalSecurityDsl.g:795:1: rule__Application__Group__5 : rule__Application__Group__5__Impl rule__Application__Group__6 ;
    public final void rule__Application__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:799:1: ( rule__Application__Group__5__Impl rule__Application__Group__6 )
            // InternalSecurityDsl.g:800:2: rule__Application__Group__5__Impl rule__Application__Group__6
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
    // InternalSecurityDsl.g:807:1: rule__Application__Group__5__Impl : ( ( rule__Application__Group_5__0 )? ) ;
    public final void rule__Application__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:811:1: ( ( ( rule__Application__Group_5__0 )? ) )
            // InternalSecurityDsl.g:812:1: ( ( rule__Application__Group_5__0 )? )
            {
            // InternalSecurityDsl.g:812:1: ( ( rule__Application__Group_5__0 )? )
            // InternalSecurityDsl.g:813:2: ( rule__Application__Group_5__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_5()); 
            // InternalSecurityDsl.g:814:2: ( rule__Application__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==33) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSecurityDsl.g:814:3: rule__Application__Group_5__0
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
    // InternalSecurityDsl.g:822:1: rule__Application__Group__6 : rule__Application__Group__6__Impl rule__Application__Group__7 ;
    public final void rule__Application__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:826:1: ( rule__Application__Group__6__Impl rule__Application__Group__7 )
            // InternalSecurityDsl.g:827:2: rule__Application__Group__6__Impl rule__Application__Group__7
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
    // InternalSecurityDsl.g:834:1: rule__Application__Group__6__Impl : ( ( rule__Application__Group_6__0 )? ) ;
    public final void rule__Application__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:838:1: ( ( ( rule__Application__Group_6__0 )? ) )
            // InternalSecurityDsl.g:839:1: ( ( rule__Application__Group_6__0 )? )
            {
            // InternalSecurityDsl.g:839:1: ( ( rule__Application__Group_6__0 )? )
            // InternalSecurityDsl.g:840:2: ( rule__Application__Group_6__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_6()); 
            // InternalSecurityDsl.g:841:2: ( rule__Application__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==34) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSecurityDsl.g:841:3: rule__Application__Group_6__0
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
    // InternalSecurityDsl.g:849:1: rule__Application__Group__7 : rule__Application__Group__7__Impl rule__Application__Group__8 ;
    public final void rule__Application__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:853:1: ( rule__Application__Group__7__Impl rule__Application__Group__8 )
            // InternalSecurityDsl.g:854:2: rule__Application__Group__7__Impl rule__Application__Group__8
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
    // InternalSecurityDsl.g:861:1: rule__Application__Group__7__Impl : ( ( rule__Application__Group_7__0 )? ) ;
    public final void rule__Application__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:865:1: ( ( ( rule__Application__Group_7__0 )? ) )
            // InternalSecurityDsl.g:866:1: ( ( rule__Application__Group_7__0 )? )
            {
            // InternalSecurityDsl.g:866:1: ( ( rule__Application__Group_7__0 )? )
            // InternalSecurityDsl.g:867:2: ( rule__Application__Group_7__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_7()); 
            // InternalSecurityDsl.g:868:2: ( rule__Application__Group_7__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==35) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSecurityDsl.g:868:3: rule__Application__Group_7__0
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
    // InternalSecurityDsl.g:876:1: rule__Application__Group__8 : rule__Application__Group__8__Impl ;
    public final void rule__Application__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:880:1: ( rule__Application__Group__8__Impl )
            // InternalSecurityDsl.g:881:2: rule__Application__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group__8__Impl();

            state._fsp--;


            }

        }
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
    // InternalSecurityDsl.g:887:1: rule__Application__Group__8__Impl : ( ( rule__Application__Group_8__0 )? ) ;
    public final void rule__Application__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:891:1: ( ( ( rule__Application__Group_8__0 )? ) )
            // InternalSecurityDsl.g:892:1: ( ( rule__Application__Group_8__0 )? )
            {
            // InternalSecurityDsl.g:892:1: ( ( rule__Application__Group_8__0 )? )
            // InternalSecurityDsl.g:893:2: ( rule__Application__Group_8__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_8()); 
            // InternalSecurityDsl.g:894:2: ( rule__Application__Group_8__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==42) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSecurityDsl.g:894:3: rule__Application__Group_8__0
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


    // $ANTLR start "rule__Application__Group_4__0"
    // InternalSecurityDsl.g:903:1: rule__Application__Group_4__0 : rule__Application__Group_4__0__Impl rule__Application__Group_4__1 ;
    public final void rule__Application__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:907:1: ( rule__Application__Group_4__0__Impl rule__Application__Group_4__1 )
            // InternalSecurityDsl.g:908:2: rule__Application__Group_4__0__Impl rule__Application__Group_4__1
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
    // InternalSecurityDsl.g:915:1: rule__Application__Group_4__0__Impl : ( 'description:' ) ;
    public final void rule__Application__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:919:1: ( ( 'description:' ) )
            // InternalSecurityDsl.g:920:1: ( 'description:' )
            {
            // InternalSecurityDsl.g:920:1: ( 'description:' )
            // InternalSecurityDsl.g:921:2: 'description:'
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
    // InternalSecurityDsl.g:930:1: rule__Application__Group_4__1 : rule__Application__Group_4__1__Impl ;
    public final void rule__Application__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:934:1: ( rule__Application__Group_4__1__Impl )
            // InternalSecurityDsl.g:935:2: rule__Application__Group_4__1__Impl
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
    // InternalSecurityDsl.g:941:1: rule__Application__Group_4__1__Impl : ( ( rule__Application__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Application__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:945:1: ( ( ( rule__Application__DescriptionAssignment_4_1 ) ) )
            // InternalSecurityDsl.g:946:1: ( ( rule__Application__DescriptionAssignment_4_1 ) )
            {
            // InternalSecurityDsl.g:946:1: ( ( rule__Application__DescriptionAssignment_4_1 ) )
            // InternalSecurityDsl.g:947:2: ( rule__Application__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getApplicationAccess().getDescriptionAssignment_4_1()); 
            // InternalSecurityDsl.g:948:2: ( rule__Application__DescriptionAssignment_4_1 )
            // InternalSecurityDsl.g:948:3: rule__Application__DescriptionAssignment_4_1
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
    // InternalSecurityDsl.g:957:1: rule__Application__Group_5__0 : rule__Application__Group_5__0__Impl rule__Application__Group_5__1 ;
    public final void rule__Application__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:961:1: ( rule__Application__Group_5__0__Impl rule__Application__Group_5__1 )
            // InternalSecurityDsl.g:962:2: rule__Application__Group_5__0__Impl rule__Application__Group_5__1
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
    // InternalSecurityDsl.g:969:1: rule__Application__Group_5__0__Impl : ( 'database:' ) ;
    public final void rule__Application__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:973:1: ( ( 'database:' ) )
            // InternalSecurityDsl.g:974:1: ( 'database:' )
            {
            // InternalSecurityDsl.g:974:1: ( 'database:' )
            // InternalSecurityDsl.g:975:2: 'database:'
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
    // InternalSecurityDsl.g:984:1: rule__Application__Group_5__1 : rule__Application__Group_5__1__Impl ;
    public final void rule__Application__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:988:1: ( rule__Application__Group_5__1__Impl )
            // InternalSecurityDsl.g:989:2: rule__Application__Group_5__1__Impl
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
    // InternalSecurityDsl.g:995:1: rule__Application__Group_5__1__Impl : ( ( rule__Application__App_databaseAssignment_5_1 ) ) ;
    public final void rule__Application__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:999:1: ( ( ( rule__Application__App_databaseAssignment_5_1 ) ) )
            // InternalSecurityDsl.g:1000:1: ( ( rule__Application__App_databaseAssignment_5_1 ) )
            {
            // InternalSecurityDsl.g:1000:1: ( ( rule__Application__App_databaseAssignment_5_1 ) )
            // InternalSecurityDsl.g:1001:2: ( rule__Application__App_databaseAssignment_5_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_databaseAssignment_5_1()); 
            // InternalSecurityDsl.g:1002:2: ( rule__Application__App_databaseAssignment_5_1 )
            // InternalSecurityDsl.g:1002:3: rule__Application__App_databaseAssignment_5_1
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
    // InternalSecurityDsl.g:1011:1: rule__Application__Group_6__0 : rule__Application__Group_6__0__Impl rule__Application__Group_6__1 ;
    public final void rule__Application__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1015:1: ( rule__Application__Group_6__0__Impl rule__Application__Group_6__1 )
            // InternalSecurityDsl.g:1016:2: rule__Application__Group_6__0__Impl rule__Application__Group_6__1
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
    // InternalSecurityDsl.g:1023:1: rule__Application__Group_6__0__Impl : ( 'security:' ) ;
    public final void rule__Application__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1027:1: ( ( 'security:' ) )
            // InternalSecurityDsl.g:1028:1: ( 'security:' )
            {
            // InternalSecurityDsl.g:1028:1: ( 'security:' )
            // InternalSecurityDsl.g:1029:2: 'security:'
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
    // InternalSecurityDsl.g:1038:1: rule__Application__Group_6__1 : rule__Application__Group_6__1__Impl ;
    public final void rule__Application__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1042:1: ( rule__Application__Group_6__1__Impl )
            // InternalSecurityDsl.g:1043:2: rule__Application__Group_6__1__Impl
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
    // InternalSecurityDsl.g:1049:1: rule__Application__Group_6__1__Impl : ( ( rule__Application__App_securityAssignment_6_1 ) ) ;
    public final void rule__Application__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1053:1: ( ( ( rule__Application__App_securityAssignment_6_1 ) ) )
            // InternalSecurityDsl.g:1054:1: ( ( rule__Application__App_securityAssignment_6_1 ) )
            {
            // InternalSecurityDsl.g:1054:1: ( ( rule__Application__App_securityAssignment_6_1 ) )
            // InternalSecurityDsl.g:1055:2: ( rule__Application__App_securityAssignment_6_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_securityAssignment_6_1()); 
            // InternalSecurityDsl.g:1056:2: ( rule__Application__App_securityAssignment_6_1 )
            // InternalSecurityDsl.g:1056:3: rule__Application__App_securityAssignment_6_1
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


    // $ANTLR start "rule__Application__Group_7__0"
    // InternalSecurityDsl.g:1065:1: rule__Application__Group_7__0 : rule__Application__Group_7__0__Impl rule__Application__Group_7__1 ;
    public final void rule__Application__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1069:1: ( rule__Application__Group_7__0__Impl rule__Application__Group_7__1 )
            // InternalSecurityDsl.g:1070:2: rule__Application__Group_7__0__Impl rule__Application__Group_7__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalSecurityDsl.g:1077:1: rule__Application__Group_7__0__Impl : ( 'model:' ) ;
    public final void rule__Application__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1081:1: ( ( 'model:' ) )
            // InternalSecurityDsl.g:1082:1: ( 'model:' )
            {
            // InternalSecurityDsl.g:1082:1: ( 'model:' )
            // InternalSecurityDsl.g:1083:2: 'model:'
            {
             before(grammarAccess.getApplicationAccess().getModelKeyword_7_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getModelKeyword_7_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:1092:1: rule__Application__Group_7__1 : rule__Application__Group_7__1__Impl rule__Application__Group_7__2 ;
    public final void rule__Application__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1096:1: ( rule__Application__Group_7__1__Impl rule__Application__Group_7__2 )
            // InternalSecurityDsl.g:1097:2: rule__Application__Group_7__1__Impl rule__Application__Group_7__2
            {
            pushFollow(FOLLOW_9);
            rule__Application__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_7__2();

            state._fsp--;


            }

        }
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
    // InternalSecurityDsl.g:1104:1: rule__Application__Group_7__1__Impl : ( ( rule__Application__Group_7_1__0 )? ) ;
    public final void rule__Application__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1108:1: ( ( ( rule__Application__Group_7_1__0 )? ) )
            // InternalSecurityDsl.g:1109:1: ( ( rule__Application__Group_7_1__0 )? )
            {
            // InternalSecurityDsl.g:1109:1: ( ( rule__Application__Group_7_1__0 )? )
            // InternalSecurityDsl.g:1110:2: ( rule__Application__Group_7_1__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_7_1()); 
            // InternalSecurityDsl.g:1111:2: ( rule__Application__Group_7_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==36) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSecurityDsl.g:1111:3: rule__Application__Group_7_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Application__Group_7_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationAccess().getGroup_7_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Application__Group_7__2"
    // InternalSecurityDsl.g:1119:1: rule__Application__Group_7__2 : rule__Application__Group_7__2__Impl rule__Application__Group_7__3 ;
    public final void rule__Application__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1123:1: ( rule__Application__Group_7__2__Impl rule__Application__Group_7__3 )
            // InternalSecurityDsl.g:1124:2: rule__Application__Group_7__2__Impl rule__Application__Group_7__3
            {
            pushFollow(FOLLOW_9);
            rule__Application__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_7__2"


    // $ANTLR start "rule__Application__Group_7__2__Impl"
    // InternalSecurityDsl.g:1131:1: rule__Application__Group_7__2__Impl : ( ( rule__Application__Group_7_2__0 )? ) ;
    public final void rule__Application__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1135:1: ( ( ( rule__Application__Group_7_2__0 )? ) )
            // InternalSecurityDsl.g:1136:1: ( ( rule__Application__Group_7_2__0 )? )
            {
            // InternalSecurityDsl.g:1136:1: ( ( rule__Application__Group_7_2__0 )? )
            // InternalSecurityDsl.g:1137:2: ( rule__Application__Group_7_2__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_7_2()); 
            // InternalSecurityDsl.g:1138:2: ( rule__Application__Group_7_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==37) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSecurityDsl.g:1138:3: rule__Application__Group_7_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Application__Group_7_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationAccess().getGroup_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_7__2__Impl"


    // $ANTLR start "rule__Application__Group_7__3"
    // InternalSecurityDsl.g:1146:1: rule__Application__Group_7__3 : rule__Application__Group_7__3__Impl ;
    public final void rule__Application__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1150:1: ( rule__Application__Group_7__3__Impl )
            // InternalSecurityDsl.g:1151:2: rule__Application__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_7__3"


    // $ANTLR start "rule__Application__Group_7__3__Impl"
    // InternalSecurityDsl.g:1157:1: rule__Application__Group_7__3__Impl : ( ( rule__Application__Group_7_3__0 )? ) ;
    public final void rule__Application__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1161:1: ( ( ( rule__Application__Group_7_3__0 )? ) )
            // InternalSecurityDsl.g:1162:1: ( ( rule__Application__Group_7_3__0 )? )
            {
            // InternalSecurityDsl.g:1162:1: ( ( rule__Application__Group_7_3__0 )? )
            // InternalSecurityDsl.g:1163:2: ( rule__Application__Group_7_3__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_7_3()); 
            // InternalSecurityDsl.g:1164:2: ( rule__Application__Group_7_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==38) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSecurityDsl.g:1164:3: rule__Application__Group_7_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Application__Group_7_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_7__3__Impl"


    // $ANTLR start "rule__Application__Group_7_1__0"
    // InternalSecurityDsl.g:1173:1: rule__Application__Group_7_1__0 : rule__Application__Group_7_1__0__Impl rule__Application__Group_7_1__1 ;
    public final void rule__Application__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1177:1: ( rule__Application__Group_7_1__0__Impl rule__Application__Group_7_1__1 )
            // InternalSecurityDsl.g:1178:2: rule__Application__Group_7_1__0__Impl rule__Application__Group_7_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Application__Group_7_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_7_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_7_1__0"


    // $ANTLR start "rule__Application__Group_7_1__0__Impl"
    // InternalSecurityDsl.g:1185:1: rule__Application__Group_7_1__0__Impl : ( 'user:' ) ;
    public final void rule__Application__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1189:1: ( ( 'user:' ) )
            // InternalSecurityDsl.g:1190:1: ( 'user:' )
            {
            // InternalSecurityDsl.g:1190:1: ( 'user:' )
            // InternalSecurityDsl.g:1191:2: 'user:'
            {
             before(grammarAccess.getApplicationAccess().getUserKeyword_7_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getUserKeyword_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_7_1__0__Impl"


    // $ANTLR start "rule__Application__Group_7_1__1"
    // InternalSecurityDsl.g:1200:1: rule__Application__Group_7_1__1 : rule__Application__Group_7_1__1__Impl ;
    public final void rule__Application__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1204:1: ( rule__Application__Group_7_1__1__Impl )
            // InternalSecurityDsl.g:1205:2: rule__Application__Group_7_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_7_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_7_1__1"


    // $ANTLR start "rule__Application__Group_7_1__1__Impl"
    // InternalSecurityDsl.g:1211:1: rule__Application__Group_7_1__1__Impl : ( ( rule__Application__App_modelsAssignment_7_1_1 ) ) ;
    public final void rule__Application__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1215:1: ( ( ( rule__Application__App_modelsAssignment_7_1_1 ) ) )
            // InternalSecurityDsl.g:1216:1: ( ( rule__Application__App_modelsAssignment_7_1_1 ) )
            {
            // InternalSecurityDsl.g:1216:1: ( ( rule__Application__App_modelsAssignment_7_1_1 ) )
            // InternalSecurityDsl.g:1217:2: ( rule__Application__App_modelsAssignment_7_1_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_modelsAssignment_7_1_1()); 
            // InternalSecurityDsl.g:1218:2: ( rule__Application__App_modelsAssignment_7_1_1 )
            // InternalSecurityDsl.g:1218:3: rule__Application__App_modelsAssignment_7_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__App_modelsAssignment_7_1_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getApp_modelsAssignment_7_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_7_1__1__Impl"


    // $ANTLR start "rule__Application__Group_7_2__0"
    // InternalSecurityDsl.g:1227:1: rule__Application__Group_7_2__0 : rule__Application__Group_7_2__0__Impl rule__Application__Group_7_2__1 ;
    public final void rule__Application__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1231:1: ( rule__Application__Group_7_2__0__Impl rule__Application__Group_7_2__1 )
            // InternalSecurityDsl.g:1232:2: rule__Application__Group_7_2__0__Impl rule__Application__Group_7_2__1
            {
            pushFollow(FOLLOW_10);
            rule__Application__Group_7_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_7_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_7_2__0"


    // $ANTLR start "rule__Application__Group_7_2__0__Impl"
    // InternalSecurityDsl.g:1239:1: rule__Application__Group_7_2__0__Impl : ( 'role:' ) ;
    public final void rule__Application__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1243:1: ( ( 'role:' ) )
            // InternalSecurityDsl.g:1244:1: ( 'role:' )
            {
            // InternalSecurityDsl.g:1244:1: ( 'role:' )
            // InternalSecurityDsl.g:1245:2: 'role:'
            {
             before(grammarAccess.getApplicationAccess().getRoleKeyword_7_2_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getRoleKeyword_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_7_2__0__Impl"


    // $ANTLR start "rule__Application__Group_7_2__1"
    // InternalSecurityDsl.g:1254:1: rule__Application__Group_7_2__1 : rule__Application__Group_7_2__1__Impl ;
    public final void rule__Application__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1258:1: ( rule__Application__Group_7_2__1__Impl )
            // InternalSecurityDsl.g:1259:2: rule__Application__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_7_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_7_2__1"


    // $ANTLR start "rule__Application__Group_7_2__1__Impl"
    // InternalSecurityDsl.g:1265:1: rule__Application__Group_7_2__1__Impl : ( ( rule__Application__App_modelsAssignment_7_2_1 ) ) ;
    public final void rule__Application__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1269:1: ( ( ( rule__Application__App_modelsAssignment_7_2_1 ) ) )
            // InternalSecurityDsl.g:1270:1: ( ( rule__Application__App_modelsAssignment_7_2_1 ) )
            {
            // InternalSecurityDsl.g:1270:1: ( ( rule__Application__App_modelsAssignment_7_2_1 ) )
            // InternalSecurityDsl.g:1271:2: ( rule__Application__App_modelsAssignment_7_2_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_modelsAssignment_7_2_1()); 
            // InternalSecurityDsl.g:1272:2: ( rule__Application__App_modelsAssignment_7_2_1 )
            // InternalSecurityDsl.g:1272:3: rule__Application__App_modelsAssignment_7_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__App_modelsAssignment_7_2_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getApp_modelsAssignment_7_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_7_2__1__Impl"


    // $ANTLR start "rule__Application__Group_7_3__0"
    // InternalSecurityDsl.g:1281:1: rule__Application__Group_7_3__0 : rule__Application__Group_7_3__0__Impl rule__Application__Group_7_3__1 ;
    public final void rule__Application__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1285:1: ( rule__Application__Group_7_3__0__Impl rule__Application__Group_7_3__1 )
            // InternalSecurityDsl.g:1286:2: rule__Application__Group_7_3__0__Impl rule__Application__Group_7_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Application__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_7_3__0"


    // $ANTLR start "rule__Application__Group_7_3__0__Impl"
    // InternalSecurityDsl.g:1293:1: rule__Application__Group_7_3__0__Impl : ( 'other:' ) ;
    public final void rule__Application__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1297:1: ( ( 'other:' ) )
            // InternalSecurityDsl.g:1298:1: ( 'other:' )
            {
            // InternalSecurityDsl.g:1298:1: ( 'other:' )
            // InternalSecurityDsl.g:1299:2: 'other:'
            {
             before(grammarAccess.getApplicationAccess().getOtherKeyword_7_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getOtherKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_7_3__0__Impl"


    // $ANTLR start "rule__Application__Group_7_3__1"
    // InternalSecurityDsl.g:1308:1: rule__Application__Group_7_3__1 : rule__Application__Group_7_3__1__Impl rule__Application__Group_7_3__2 ;
    public final void rule__Application__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1312:1: ( rule__Application__Group_7_3__1__Impl rule__Application__Group_7_3__2 )
            // InternalSecurityDsl.g:1313:2: rule__Application__Group_7_3__1__Impl rule__Application__Group_7_3__2
            {
            pushFollow(FOLLOW_12);
            rule__Application__Group_7_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_7_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_7_3__1"


    // $ANTLR start "rule__Application__Group_7_3__1__Impl"
    // InternalSecurityDsl.g:1320:1: rule__Application__Group_7_3__1__Impl : ( '[' ) ;
    public final void rule__Application__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1324:1: ( ( '[' ) )
            // InternalSecurityDsl.g:1325:1: ( '[' )
            {
            // InternalSecurityDsl.g:1325:1: ( '[' )
            // InternalSecurityDsl.g:1326:2: '['
            {
             before(grammarAccess.getApplicationAccess().getLeftSquareBracketKeyword_7_3_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getLeftSquareBracketKeyword_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_7_3__1__Impl"


    // $ANTLR start "rule__Application__Group_7_3__2"
    // InternalSecurityDsl.g:1335:1: rule__Application__Group_7_3__2 : rule__Application__Group_7_3__2__Impl rule__Application__Group_7_3__3 ;
    public final void rule__Application__Group_7_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1339:1: ( rule__Application__Group_7_3__2__Impl rule__Application__Group_7_3__3 )
            // InternalSecurityDsl.g:1340:2: rule__Application__Group_7_3__2__Impl rule__Application__Group_7_3__3
            {
            pushFollow(FOLLOW_13);
            rule__Application__Group_7_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_7_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_7_3__2"


    // $ANTLR start "rule__Application__Group_7_3__2__Impl"
    // InternalSecurityDsl.g:1347:1: rule__Application__Group_7_3__2__Impl : ( ( rule__Application__App_modelsAssignment_7_3_2 ) ) ;
    public final void rule__Application__Group_7_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1351:1: ( ( ( rule__Application__App_modelsAssignment_7_3_2 ) ) )
            // InternalSecurityDsl.g:1352:1: ( ( rule__Application__App_modelsAssignment_7_3_2 ) )
            {
            // InternalSecurityDsl.g:1352:1: ( ( rule__Application__App_modelsAssignment_7_3_2 ) )
            // InternalSecurityDsl.g:1353:2: ( rule__Application__App_modelsAssignment_7_3_2 )
            {
             before(grammarAccess.getApplicationAccess().getApp_modelsAssignment_7_3_2()); 
            // InternalSecurityDsl.g:1354:2: ( rule__Application__App_modelsAssignment_7_3_2 )
            // InternalSecurityDsl.g:1354:3: rule__Application__App_modelsAssignment_7_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Application__App_modelsAssignment_7_3_2();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getApp_modelsAssignment_7_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_7_3__2__Impl"


    // $ANTLR start "rule__Application__Group_7_3__3"
    // InternalSecurityDsl.g:1362:1: rule__Application__Group_7_3__3 : rule__Application__Group_7_3__3__Impl rule__Application__Group_7_3__4 ;
    public final void rule__Application__Group_7_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1366:1: ( rule__Application__Group_7_3__3__Impl rule__Application__Group_7_3__4 )
            // InternalSecurityDsl.g:1367:2: rule__Application__Group_7_3__3__Impl rule__Application__Group_7_3__4
            {
            pushFollow(FOLLOW_13);
            rule__Application__Group_7_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_7_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_7_3__3"


    // $ANTLR start "rule__Application__Group_7_3__3__Impl"
    // InternalSecurityDsl.g:1374:1: rule__Application__Group_7_3__3__Impl : ( ( rule__Application__Group_7_3_3__0 )* ) ;
    public final void rule__Application__Group_7_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1378:1: ( ( ( rule__Application__Group_7_3_3__0 )* ) )
            // InternalSecurityDsl.g:1379:1: ( ( rule__Application__Group_7_3_3__0 )* )
            {
            // InternalSecurityDsl.g:1379:1: ( ( rule__Application__Group_7_3_3__0 )* )
            // InternalSecurityDsl.g:1380:2: ( rule__Application__Group_7_3_3__0 )*
            {
             before(grammarAccess.getApplicationAccess().getGroup_7_3_3()); 
            // InternalSecurityDsl.g:1381:2: ( rule__Application__Group_7_3_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==41) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSecurityDsl.g:1381:3: rule__Application__Group_7_3_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Application__Group_7_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getApplicationAccess().getGroup_7_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_7_3__3__Impl"


    // $ANTLR start "rule__Application__Group_7_3__4"
    // InternalSecurityDsl.g:1389:1: rule__Application__Group_7_3__4 : rule__Application__Group_7_3__4__Impl ;
    public final void rule__Application__Group_7_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1393:1: ( rule__Application__Group_7_3__4__Impl )
            // InternalSecurityDsl.g:1394:2: rule__Application__Group_7_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_7_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_7_3__4"


    // $ANTLR start "rule__Application__Group_7_3__4__Impl"
    // InternalSecurityDsl.g:1400:1: rule__Application__Group_7_3__4__Impl : ( ']' ) ;
    public final void rule__Application__Group_7_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1404:1: ( ( ']' ) )
            // InternalSecurityDsl.g:1405:1: ( ']' )
            {
            // InternalSecurityDsl.g:1405:1: ( ']' )
            // InternalSecurityDsl.g:1406:2: ']'
            {
             before(grammarAccess.getApplicationAccess().getRightSquareBracketKeyword_7_3_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getRightSquareBracketKeyword_7_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_7_3__4__Impl"


    // $ANTLR start "rule__Application__Group_7_3_3__0"
    // InternalSecurityDsl.g:1416:1: rule__Application__Group_7_3_3__0 : rule__Application__Group_7_3_3__0__Impl rule__Application__Group_7_3_3__1 ;
    public final void rule__Application__Group_7_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1420:1: ( rule__Application__Group_7_3_3__0__Impl rule__Application__Group_7_3_3__1 )
            // InternalSecurityDsl.g:1421:2: rule__Application__Group_7_3_3__0__Impl rule__Application__Group_7_3_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Application__Group_7_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_7_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_7_3_3__0"


    // $ANTLR start "rule__Application__Group_7_3_3__0__Impl"
    // InternalSecurityDsl.g:1428:1: rule__Application__Group_7_3_3__0__Impl : ( ',' ) ;
    public final void rule__Application__Group_7_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1432:1: ( ( ',' ) )
            // InternalSecurityDsl.g:1433:1: ( ',' )
            {
            // InternalSecurityDsl.g:1433:1: ( ',' )
            // InternalSecurityDsl.g:1434:2: ','
            {
             before(grammarAccess.getApplicationAccess().getCommaKeyword_7_3_3_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getCommaKeyword_7_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_7_3_3__0__Impl"


    // $ANTLR start "rule__Application__Group_7_3_3__1"
    // InternalSecurityDsl.g:1443:1: rule__Application__Group_7_3_3__1 : rule__Application__Group_7_3_3__1__Impl ;
    public final void rule__Application__Group_7_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1447:1: ( rule__Application__Group_7_3_3__1__Impl )
            // InternalSecurityDsl.g:1448:2: rule__Application__Group_7_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_7_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_7_3_3__1"


    // $ANTLR start "rule__Application__Group_7_3_3__1__Impl"
    // InternalSecurityDsl.g:1454:1: rule__Application__Group_7_3_3__1__Impl : ( ( rule__Application__App_modelsAssignment_7_3_3_1 ) ) ;
    public final void rule__Application__Group_7_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1458:1: ( ( ( rule__Application__App_modelsAssignment_7_3_3_1 ) ) )
            // InternalSecurityDsl.g:1459:1: ( ( rule__Application__App_modelsAssignment_7_3_3_1 ) )
            {
            // InternalSecurityDsl.g:1459:1: ( ( rule__Application__App_modelsAssignment_7_3_3_1 ) )
            // InternalSecurityDsl.g:1460:2: ( rule__Application__App_modelsAssignment_7_3_3_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_modelsAssignment_7_3_3_1()); 
            // InternalSecurityDsl.g:1461:2: ( rule__Application__App_modelsAssignment_7_3_3_1 )
            // InternalSecurityDsl.g:1461:3: rule__Application__App_modelsAssignment_7_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__App_modelsAssignment_7_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getApp_modelsAssignment_7_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_7_3_3__1__Impl"


    // $ANTLR start "rule__Application__Group_8__0"
    // InternalSecurityDsl.g:1470:1: rule__Application__Group_8__0 : rule__Application__Group_8__0__Impl rule__Application__Group_8__1 ;
    public final void rule__Application__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1474:1: ( rule__Application__Group_8__0__Impl rule__Application__Group_8__1 )
            // InternalSecurityDsl.g:1475:2: rule__Application__Group_8__0__Impl rule__Application__Group_8__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSecurityDsl.g:1482:1: rule__Application__Group_8__0__Impl : ( 'controllers:' ) ;
    public final void rule__Application__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1486:1: ( ( 'controllers:' ) )
            // InternalSecurityDsl.g:1487:1: ( 'controllers:' )
            {
            // InternalSecurityDsl.g:1487:1: ( 'controllers:' )
            // InternalSecurityDsl.g:1488:2: 'controllers:'
            {
             before(grammarAccess.getApplicationAccess().getControllersKeyword_8_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getControllersKeyword_8_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:1497:1: rule__Application__Group_8__1 : rule__Application__Group_8__1__Impl rule__Application__Group_8__2 ;
    public final void rule__Application__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1501:1: ( rule__Application__Group_8__1__Impl rule__Application__Group_8__2 )
            // InternalSecurityDsl.g:1502:2: rule__Application__Group_8__1__Impl rule__Application__Group_8__2
            {
            pushFollow(FOLLOW_15);
            rule__Application__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_8__2();

            state._fsp--;


            }

        }
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
    // InternalSecurityDsl.g:1509:1: rule__Application__Group_8__1__Impl : ( ( rule__Application__Group_8_1__0 )? ) ;
    public final void rule__Application__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1513:1: ( ( ( rule__Application__Group_8_1__0 )? ) )
            // InternalSecurityDsl.g:1514:1: ( ( rule__Application__Group_8_1__0 )? )
            {
            // InternalSecurityDsl.g:1514:1: ( ( rule__Application__Group_8_1__0 )? )
            // InternalSecurityDsl.g:1515:2: ( rule__Application__Group_8_1__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_8_1()); 
            // InternalSecurityDsl.g:1516:2: ( rule__Application__Group_8_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==43) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSecurityDsl.g:1516:3: rule__Application__Group_8_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Application__Group_8_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationAccess().getGroup_8_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Application__Group_8__2"
    // InternalSecurityDsl.g:1524:1: rule__Application__Group_8__2 : rule__Application__Group_8__2__Impl ;
    public final void rule__Application__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1528:1: ( rule__Application__Group_8__2__Impl )
            // InternalSecurityDsl.g:1529:2: rule__Application__Group_8__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_8__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_8__2"


    // $ANTLR start "rule__Application__Group_8__2__Impl"
    // InternalSecurityDsl.g:1535:1: rule__Application__Group_8__2__Impl : ( ( rule__Application__Group_8_2__0 )? ) ;
    public final void rule__Application__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1539:1: ( ( ( rule__Application__Group_8_2__0 )? ) )
            // InternalSecurityDsl.g:1540:1: ( ( rule__Application__Group_8_2__0 )? )
            {
            // InternalSecurityDsl.g:1540:1: ( ( rule__Application__Group_8_2__0 )? )
            // InternalSecurityDsl.g:1541:2: ( rule__Application__Group_8_2__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_8_2()); 
            // InternalSecurityDsl.g:1542:2: ( rule__Application__Group_8_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==38) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSecurityDsl.g:1542:3: rule__Application__Group_8_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Application__Group_8_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationAccess().getGroup_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_8__2__Impl"


    // $ANTLR start "rule__Application__Group_8_1__0"
    // InternalSecurityDsl.g:1551:1: rule__Application__Group_8_1__0 : rule__Application__Group_8_1__0__Impl rule__Application__Group_8_1__1 ;
    public final void rule__Application__Group_8_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1555:1: ( rule__Application__Group_8_1__0__Impl rule__Application__Group_8_1__1 )
            // InternalSecurityDsl.g:1556:2: rule__Application__Group_8_1__0__Impl rule__Application__Group_8_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Application__Group_8_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_8_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_8_1__0"


    // $ANTLR start "rule__Application__Group_8_1__0__Impl"
    // InternalSecurityDsl.g:1563:1: rule__Application__Group_8_1__0__Impl : ( 'auth:' ) ;
    public final void rule__Application__Group_8_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1567:1: ( ( 'auth:' ) )
            // InternalSecurityDsl.g:1568:1: ( 'auth:' )
            {
            // InternalSecurityDsl.g:1568:1: ( 'auth:' )
            // InternalSecurityDsl.g:1569:2: 'auth:'
            {
             before(grammarAccess.getApplicationAccess().getAuthKeyword_8_1_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getAuthKeyword_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_8_1__0__Impl"


    // $ANTLR start "rule__Application__Group_8_1__1"
    // InternalSecurityDsl.g:1578:1: rule__Application__Group_8_1__1 : rule__Application__Group_8_1__1__Impl ;
    public final void rule__Application__Group_8_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1582:1: ( rule__Application__Group_8_1__1__Impl )
            // InternalSecurityDsl.g:1583:2: rule__Application__Group_8_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_8_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_8_1__1"


    // $ANTLR start "rule__Application__Group_8_1__1__Impl"
    // InternalSecurityDsl.g:1589:1: rule__Application__Group_8_1__1__Impl : ( ( rule__Application__App_controllersAssignment_8_1_1 ) ) ;
    public final void rule__Application__Group_8_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1593:1: ( ( ( rule__Application__App_controllersAssignment_8_1_1 ) ) )
            // InternalSecurityDsl.g:1594:1: ( ( rule__Application__App_controllersAssignment_8_1_1 ) )
            {
            // InternalSecurityDsl.g:1594:1: ( ( rule__Application__App_controllersAssignment_8_1_1 ) )
            // InternalSecurityDsl.g:1595:2: ( rule__Application__App_controllersAssignment_8_1_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_controllersAssignment_8_1_1()); 
            // InternalSecurityDsl.g:1596:2: ( rule__Application__App_controllersAssignment_8_1_1 )
            // InternalSecurityDsl.g:1596:3: rule__Application__App_controllersAssignment_8_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__App_controllersAssignment_8_1_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getApp_controllersAssignment_8_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_8_1__1__Impl"


    // $ANTLR start "rule__Application__Group_8_2__0"
    // InternalSecurityDsl.g:1605:1: rule__Application__Group_8_2__0 : rule__Application__Group_8_2__0__Impl rule__Application__Group_8_2__1 ;
    public final void rule__Application__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1609:1: ( rule__Application__Group_8_2__0__Impl rule__Application__Group_8_2__1 )
            // InternalSecurityDsl.g:1610:2: rule__Application__Group_8_2__0__Impl rule__Application__Group_8_2__1
            {
            pushFollow(FOLLOW_11);
            rule__Application__Group_8_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_8_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_8_2__0"


    // $ANTLR start "rule__Application__Group_8_2__0__Impl"
    // InternalSecurityDsl.g:1617:1: rule__Application__Group_8_2__0__Impl : ( 'other:' ) ;
    public final void rule__Application__Group_8_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1621:1: ( ( 'other:' ) )
            // InternalSecurityDsl.g:1622:1: ( 'other:' )
            {
            // InternalSecurityDsl.g:1622:1: ( 'other:' )
            // InternalSecurityDsl.g:1623:2: 'other:'
            {
             before(grammarAccess.getApplicationAccess().getOtherKeyword_8_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getOtherKeyword_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_8_2__0__Impl"


    // $ANTLR start "rule__Application__Group_8_2__1"
    // InternalSecurityDsl.g:1632:1: rule__Application__Group_8_2__1 : rule__Application__Group_8_2__1__Impl rule__Application__Group_8_2__2 ;
    public final void rule__Application__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1636:1: ( rule__Application__Group_8_2__1__Impl rule__Application__Group_8_2__2 )
            // InternalSecurityDsl.g:1637:2: rule__Application__Group_8_2__1__Impl rule__Application__Group_8_2__2
            {
            pushFollow(FOLLOW_12);
            rule__Application__Group_8_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_8_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_8_2__1"


    // $ANTLR start "rule__Application__Group_8_2__1__Impl"
    // InternalSecurityDsl.g:1644:1: rule__Application__Group_8_2__1__Impl : ( '[' ) ;
    public final void rule__Application__Group_8_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1648:1: ( ( '[' ) )
            // InternalSecurityDsl.g:1649:1: ( '[' )
            {
            // InternalSecurityDsl.g:1649:1: ( '[' )
            // InternalSecurityDsl.g:1650:2: '['
            {
             before(grammarAccess.getApplicationAccess().getLeftSquareBracketKeyword_8_2_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getLeftSquareBracketKeyword_8_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_8_2__1__Impl"


    // $ANTLR start "rule__Application__Group_8_2__2"
    // InternalSecurityDsl.g:1659:1: rule__Application__Group_8_2__2 : rule__Application__Group_8_2__2__Impl rule__Application__Group_8_2__3 ;
    public final void rule__Application__Group_8_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1663:1: ( rule__Application__Group_8_2__2__Impl rule__Application__Group_8_2__3 )
            // InternalSecurityDsl.g:1664:2: rule__Application__Group_8_2__2__Impl rule__Application__Group_8_2__3
            {
            pushFollow(FOLLOW_13);
            rule__Application__Group_8_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_8_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_8_2__2"


    // $ANTLR start "rule__Application__Group_8_2__2__Impl"
    // InternalSecurityDsl.g:1671:1: rule__Application__Group_8_2__2__Impl : ( ( rule__Application__App_controllersAssignment_8_2_2 ) ) ;
    public final void rule__Application__Group_8_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1675:1: ( ( ( rule__Application__App_controllersAssignment_8_2_2 ) ) )
            // InternalSecurityDsl.g:1676:1: ( ( rule__Application__App_controllersAssignment_8_2_2 ) )
            {
            // InternalSecurityDsl.g:1676:1: ( ( rule__Application__App_controllersAssignment_8_2_2 ) )
            // InternalSecurityDsl.g:1677:2: ( rule__Application__App_controllersAssignment_8_2_2 )
            {
             before(grammarAccess.getApplicationAccess().getApp_controllersAssignment_8_2_2()); 
            // InternalSecurityDsl.g:1678:2: ( rule__Application__App_controllersAssignment_8_2_2 )
            // InternalSecurityDsl.g:1678:3: rule__Application__App_controllersAssignment_8_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Application__App_controllersAssignment_8_2_2();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getApp_controllersAssignment_8_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_8_2__2__Impl"


    // $ANTLR start "rule__Application__Group_8_2__3"
    // InternalSecurityDsl.g:1686:1: rule__Application__Group_8_2__3 : rule__Application__Group_8_2__3__Impl rule__Application__Group_8_2__4 ;
    public final void rule__Application__Group_8_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1690:1: ( rule__Application__Group_8_2__3__Impl rule__Application__Group_8_2__4 )
            // InternalSecurityDsl.g:1691:2: rule__Application__Group_8_2__3__Impl rule__Application__Group_8_2__4
            {
            pushFollow(FOLLOW_13);
            rule__Application__Group_8_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_8_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_8_2__3"


    // $ANTLR start "rule__Application__Group_8_2__3__Impl"
    // InternalSecurityDsl.g:1698:1: rule__Application__Group_8_2__3__Impl : ( ( rule__Application__Group_8_2_3__0 )* ) ;
    public final void rule__Application__Group_8_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1702:1: ( ( ( rule__Application__Group_8_2_3__0 )* ) )
            // InternalSecurityDsl.g:1703:1: ( ( rule__Application__Group_8_2_3__0 )* )
            {
            // InternalSecurityDsl.g:1703:1: ( ( rule__Application__Group_8_2_3__0 )* )
            // InternalSecurityDsl.g:1704:2: ( rule__Application__Group_8_2_3__0 )*
            {
             before(grammarAccess.getApplicationAccess().getGroup_8_2_3()); 
            // InternalSecurityDsl.g:1705:2: ( rule__Application__Group_8_2_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==41) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSecurityDsl.g:1705:3: rule__Application__Group_8_2_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Application__Group_8_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getApplicationAccess().getGroup_8_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_8_2__3__Impl"


    // $ANTLR start "rule__Application__Group_8_2__4"
    // InternalSecurityDsl.g:1713:1: rule__Application__Group_8_2__4 : rule__Application__Group_8_2__4__Impl ;
    public final void rule__Application__Group_8_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1717:1: ( rule__Application__Group_8_2__4__Impl )
            // InternalSecurityDsl.g:1718:2: rule__Application__Group_8_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_8_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_8_2__4"


    // $ANTLR start "rule__Application__Group_8_2__4__Impl"
    // InternalSecurityDsl.g:1724:1: rule__Application__Group_8_2__4__Impl : ( ']' ) ;
    public final void rule__Application__Group_8_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1728:1: ( ( ']' ) )
            // InternalSecurityDsl.g:1729:1: ( ']' )
            {
            // InternalSecurityDsl.g:1729:1: ( ']' )
            // InternalSecurityDsl.g:1730:2: ']'
            {
             before(grammarAccess.getApplicationAccess().getRightSquareBracketKeyword_8_2_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getRightSquareBracketKeyword_8_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_8_2__4__Impl"


    // $ANTLR start "rule__Application__Group_8_2_3__0"
    // InternalSecurityDsl.g:1740:1: rule__Application__Group_8_2_3__0 : rule__Application__Group_8_2_3__0__Impl rule__Application__Group_8_2_3__1 ;
    public final void rule__Application__Group_8_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1744:1: ( rule__Application__Group_8_2_3__0__Impl rule__Application__Group_8_2_3__1 )
            // InternalSecurityDsl.g:1745:2: rule__Application__Group_8_2_3__0__Impl rule__Application__Group_8_2_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Application__Group_8_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_8_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_8_2_3__0"


    // $ANTLR start "rule__Application__Group_8_2_3__0__Impl"
    // InternalSecurityDsl.g:1752:1: rule__Application__Group_8_2_3__0__Impl : ( ',' ) ;
    public final void rule__Application__Group_8_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1756:1: ( ( ',' ) )
            // InternalSecurityDsl.g:1757:1: ( ',' )
            {
            // InternalSecurityDsl.g:1757:1: ( ',' )
            // InternalSecurityDsl.g:1758:2: ','
            {
             before(grammarAccess.getApplicationAccess().getCommaKeyword_8_2_3_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getCommaKeyword_8_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_8_2_3__0__Impl"


    // $ANTLR start "rule__Application__Group_8_2_3__1"
    // InternalSecurityDsl.g:1767:1: rule__Application__Group_8_2_3__1 : rule__Application__Group_8_2_3__1__Impl ;
    public final void rule__Application__Group_8_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1771:1: ( rule__Application__Group_8_2_3__1__Impl )
            // InternalSecurityDsl.g:1772:2: rule__Application__Group_8_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_8_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_8_2_3__1"


    // $ANTLR start "rule__Application__Group_8_2_3__1__Impl"
    // InternalSecurityDsl.g:1778:1: rule__Application__Group_8_2_3__1__Impl : ( ( rule__Application__App_controllersAssignment_8_2_3_1 ) ) ;
    public final void rule__Application__Group_8_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1782:1: ( ( ( rule__Application__App_controllersAssignment_8_2_3_1 ) ) )
            // InternalSecurityDsl.g:1783:1: ( ( rule__Application__App_controllersAssignment_8_2_3_1 ) )
            {
            // InternalSecurityDsl.g:1783:1: ( ( rule__Application__App_controllersAssignment_8_2_3_1 ) )
            // InternalSecurityDsl.g:1784:2: ( rule__Application__App_controllersAssignment_8_2_3_1 )
            {
             before(grammarAccess.getApplicationAccess().getApp_controllersAssignment_8_2_3_1()); 
            // InternalSecurityDsl.g:1785:2: ( rule__Application__App_controllersAssignment_8_2_3_1 )
            // InternalSecurityDsl.g:1785:3: rule__Application__App_controllersAssignment_8_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__App_controllersAssignment_8_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getApp_controllersAssignment_8_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_8_2_3__1__Impl"


    // $ANTLR start "rule__Database__Group__0"
    // InternalSecurityDsl.g:1794:1: rule__Database__Group__0 : rule__Database__Group__0__Impl rule__Database__Group__1 ;
    public final void rule__Database__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1798:1: ( rule__Database__Group__0__Impl rule__Database__Group__1 )
            // InternalSecurityDsl.g:1799:2: rule__Database__Group__0__Impl rule__Database__Group__1
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
    // InternalSecurityDsl.g:1806:1: rule__Database__Group__0__Impl : ( 'vendorName:' ) ;
    public final void rule__Database__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1810:1: ( ( 'vendorName:' ) )
            // InternalSecurityDsl.g:1811:1: ( 'vendorName:' )
            {
            // InternalSecurityDsl.g:1811:1: ( 'vendorName:' )
            // InternalSecurityDsl.g:1812:2: 'vendorName:'
            {
             before(grammarAccess.getDatabaseAccess().getVendorNameKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalSecurityDsl.g:1821:1: rule__Database__Group__1 : rule__Database__Group__1__Impl rule__Database__Group__2 ;
    public final void rule__Database__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1825:1: ( rule__Database__Group__1__Impl rule__Database__Group__2 )
            // InternalSecurityDsl.g:1826:2: rule__Database__Group__1__Impl rule__Database__Group__2
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
    // InternalSecurityDsl.g:1833:1: rule__Database__Group__1__Impl : ( ( rule__Database__VendorNameAssignment_1 ) ) ;
    public final void rule__Database__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1837:1: ( ( ( rule__Database__VendorNameAssignment_1 ) ) )
            // InternalSecurityDsl.g:1838:1: ( ( rule__Database__VendorNameAssignment_1 ) )
            {
            // InternalSecurityDsl.g:1838:1: ( ( rule__Database__VendorNameAssignment_1 ) )
            // InternalSecurityDsl.g:1839:2: ( rule__Database__VendorNameAssignment_1 )
            {
             before(grammarAccess.getDatabaseAccess().getVendorNameAssignment_1()); 
            // InternalSecurityDsl.g:1840:2: ( rule__Database__VendorNameAssignment_1 )
            // InternalSecurityDsl.g:1840:3: rule__Database__VendorNameAssignment_1
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
    // InternalSecurityDsl.g:1848:1: rule__Database__Group__2 : rule__Database__Group__2__Impl rule__Database__Group__3 ;
    public final void rule__Database__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1852:1: ( rule__Database__Group__2__Impl rule__Database__Group__3 )
            // InternalSecurityDsl.g:1853:2: rule__Database__Group__2__Impl rule__Database__Group__3
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
    // InternalSecurityDsl.g:1860:1: rule__Database__Group__2__Impl : ( 'url:' ) ;
    public final void rule__Database__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1864:1: ( ( 'url:' ) )
            // InternalSecurityDsl.g:1865:1: ( 'url:' )
            {
            // InternalSecurityDsl.g:1865:1: ( 'url:' )
            // InternalSecurityDsl.g:1866:2: 'url:'
            {
             before(grammarAccess.getDatabaseAccess().getUrlKeyword_2()); 
            match(input,45,FOLLOW_2); 
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
    // InternalSecurityDsl.g:1875:1: rule__Database__Group__3 : rule__Database__Group__3__Impl rule__Database__Group__4 ;
    public final void rule__Database__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1879:1: ( rule__Database__Group__3__Impl rule__Database__Group__4 )
            // InternalSecurityDsl.g:1880:2: rule__Database__Group__3__Impl rule__Database__Group__4
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
    // InternalSecurityDsl.g:1887:1: rule__Database__Group__3__Impl : ( ( rule__Database__UrlAssignment_3 ) ) ;
    public final void rule__Database__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1891:1: ( ( ( rule__Database__UrlAssignment_3 ) ) )
            // InternalSecurityDsl.g:1892:1: ( ( rule__Database__UrlAssignment_3 ) )
            {
            // InternalSecurityDsl.g:1892:1: ( ( rule__Database__UrlAssignment_3 ) )
            // InternalSecurityDsl.g:1893:2: ( rule__Database__UrlAssignment_3 )
            {
             before(grammarAccess.getDatabaseAccess().getUrlAssignment_3()); 
            // InternalSecurityDsl.g:1894:2: ( rule__Database__UrlAssignment_3 )
            // InternalSecurityDsl.g:1894:3: rule__Database__UrlAssignment_3
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
    // InternalSecurityDsl.g:1902:1: rule__Database__Group__4 : rule__Database__Group__4__Impl rule__Database__Group__5 ;
    public final void rule__Database__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1906:1: ( rule__Database__Group__4__Impl rule__Database__Group__5 )
            // InternalSecurityDsl.g:1907:2: rule__Database__Group__4__Impl rule__Database__Group__5
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
    // InternalSecurityDsl.g:1914:1: rule__Database__Group__4__Impl : ( 'username:' ) ;
    public final void rule__Database__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1918:1: ( ( 'username:' ) )
            // InternalSecurityDsl.g:1919:1: ( 'username:' )
            {
            // InternalSecurityDsl.g:1919:1: ( 'username:' )
            // InternalSecurityDsl.g:1920:2: 'username:'
            {
             before(grammarAccess.getDatabaseAccess().getUsernameKeyword_4()); 
            match(input,46,FOLLOW_2); 
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
    // InternalSecurityDsl.g:1929:1: rule__Database__Group__5 : rule__Database__Group__5__Impl rule__Database__Group__6 ;
    public final void rule__Database__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1933:1: ( rule__Database__Group__5__Impl rule__Database__Group__6 )
            // InternalSecurityDsl.g:1934:2: rule__Database__Group__5__Impl rule__Database__Group__6
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
    // InternalSecurityDsl.g:1941:1: rule__Database__Group__5__Impl : ( ( rule__Database__UsernameAssignment_5 ) ) ;
    public final void rule__Database__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1945:1: ( ( ( rule__Database__UsernameAssignment_5 ) ) )
            // InternalSecurityDsl.g:1946:1: ( ( rule__Database__UsernameAssignment_5 ) )
            {
            // InternalSecurityDsl.g:1946:1: ( ( rule__Database__UsernameAssignment_5 ) )
            // InternalSecurityDsl.g:1947:2: ( rule__Database__UsernameAssignment_5 )
            {
             before(grammarAccess.getDatabaseAccess().getUsernameAssignment_5()); 
            // InternalSecurityDsl.g:1948:2: ( rule__Database__UsernameAssignment_5 )
            // InternalSecurityDsl.g:1948:3: rule__Database__UsernameAssignment_5
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
    // InternalSecurityDsl.g:1956:1: rule__Database__Group__6 : rule__Database__Group__6__Impl rule__Database__Group__7 ;
    public final void rule__Database__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1960:1: ( rule__Database__Group__6__Impl rule__Database__Group__7 )
            // InternalSecurityDsl.g:1961:2: rule__Database__Group__6__Impl rule__Database__Group__7
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
    // InternalSecurityDsl.g:1968:1: rule__Database__Group__6__Impl : ( 'password:' ) ;
    public final void rule__Database__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1972:1: ( ( 'password:' ) )
            // InternalSecurityDsl.g:1973:1: ( 'password:' )
            {
            // InternalSecurityDsl.g:1973:1: ( 'password:' )
            // InternalSecurityDsl.g:1974:2: 'password:'
            {
             before(grammarAccess.getDatabaseAccess().getPasswordKeyword_6()); 
            match(input,47,FOLLOW_2); 
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
    // InternalSecurityDsl.g:1983:1: rule__Database__Group__7 : rule__Database__Group__7__Impl ;
    public final void rule__Database__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1987:1: ( rule__Database__Group__7__Impl )
            // InternalSecurityDsl.g:1988:2: rule__Database__Group__7__Impl
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
    // InternalSecurityDsl.g:1994:1: rule__Database__Group__7__Impl : ( ( rule__Database__PasswordAssignment_7 ) ) ;
    public final void rule__Database__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:1998:1: ( ( ( rule__Database__PasswordAssignment_7 ) ) )
            // InternalSecurityDsl.g:1999:1: ( ( rule__Database__PasswordAssignment_7 ) )
            {
            // InternalSecurityDsl.g:1999:1: ( ( rule__Database__PasswordAssignment_7 ) )
            // InternalSecurityDsl.g:2000:2: ( rule__Database__PasswordAssignment_7 )
            {
             before(grammarAccess.getDatabaseAccess().getPasswordAssignment_7()); 
            // InternalSecurityDsl.g:2001:2: ( rule__Database__PasswordAssignment_7 )
            // InternalSecurityDsl.g:2001:3: rule__Database__PasswordAssignment_7
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
    // InternalSecurityDsl.g:2010:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2014:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalSecurityDsl.g:2015:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSecurityDsl.g:2022:1: rule__Attribute__Group__0__Impl : ( '{' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2026:1: ( ( '{' ) )
            // InternalSecurityDsl.g:2027:1: ( '{' )
            {
            // InternalSecurityDsl.g:2027:1: ( '{' )
            // InternalSecurityDsl.g:2028:2: '{'
            {
             before(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2037:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2041:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalSecurityDsl.g:2042:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSecurityDsl.g:2049:1: rule__Attribute__Group__1__Impl : ( 'name:' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2053:1: ( ( 'name:' ) )
            // InternalSecurityDsl.g:2054:1: ( 'name:' )
            {
            // InternalSecurityDsl.g:2054:1: ( 'name:' )
            // InternalSecurityDsl.g:2055:2: 'name:'
            {
             before(grammarAccess.getAttributeAccess().getNameKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameKeyword_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:2064:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2068:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalSecurityDsl.g:2069:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
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
    // InternalSecurityDsl.g:2076:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__NameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2080:1: ( ( ( rule__Attribute__NameAssignment_2 ) ) )
            // InternalSecurityDsl.g:2081:1: ( ( rule__Attribute__NameAssignment_2 ) )
            {
            // InternalSecurityDsl.g:2081:1: ( ( rule__Attribute__NameAssignment_2 ) )
            // InternalSecurityDsl.g:2082:2: ( rule__Attribute__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_2()); 
            // InternalSecurityDsl.g:2083:2: ( rule__Attribute__NameAssignment_2 )
            // InternalSecurityDsl.g:2083:3: rule__Attribute__NameAssignment_2
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
    // InternalSecurityDsl.g:2091:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2095:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalSecurityDsl.g:2096:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
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
    // InternalSecurityDsl.g:2103:1: rule__Attribute__Group__3__Impl : ( 'type:' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2107:1: ( ( 'type:' ) )
            // InternalSecurityDsl.g:2108:1: ( 'type:' )
            {
            // InternalSecurityDsl.g:2108:1: ( 'type:' )
            // InternalSecurityDsl.g:2109:2: 'type:'
            {
             before(grammarAccess.getAttributeAccess().getTypeKeyword_3()); 
            match(input,49,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2118:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2122:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalSecurityDsl.g:2123:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
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
    // InternalSecurityDsl.g:2130:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__TypeAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2134:1: ( ( ( rule__Attribute__TypeAssignment_4 ) ) )
            // InternalSecurityDsl.g:2135:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            {
            // InternalSecurityDsl.g:2135:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            // InternalSecurityDsl.g:2136:2: ( rule__Attribute__TypeAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_4()); 
            // InternalSecurityDsl.g:2137:2: ( rule__Attribute__TypeAssignment_4 )
            // InternalSecurityDsl.g:2137:3: rule__Attribute__TypeAssignment_4
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
    // InternalSecurityDsl.g:2145:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2149:1: ( rule__Attribute__Group__5__Impl )
            // InternalSecurityDsl.g:2150:2: rule__Attribute__Group__5__Impl
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
    // InternalSecurityDsl.g:2156:1: rule__Attribute__Group__5__Impl : ( '}' ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2160:1: ( ( '}' ) )
            // InternalSecurityDsl.g:2161:1: ( '}' )
            {
            // InternalSecurityDsl.g:2161:1: ( '}' )
            // InternalSecurityDsl.g:2162:2: '}'
            {
             before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,50,FOLLOW_2); 
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
    // InternalSecurityDsl.g:2172:1: rule__User__Group__0 : rule__User__Group__0__Impl rule__User__Group__1 ;
    public final void rule__User__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2176:1: ( rule__User__Group__0__Impl rule__User__Group__1 )
            // InternalSecurityDsl.g:2177:2: rule__User__Group__0__Impl rule__User__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSecurityDsl.g:2184:1: rule__User__Group__0__Impl : ( 'identifier:' ) ;
    public final void rule__User__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2188:1: ( ( 'identifier:' ) )
            // InternalSecurityDsl.g:2189:1: ( 'identifier:' )
            {
            // InternalSecurityDsl.g:2189:1: ( 'identifier:' )
            // InternalSecurityDsl.g:2190:2: 'identifier:'
            {
             before(grammarAccess.getUserAccess().getIdentifierKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getIdentifierKeyword_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:2199:1: rule__User__Group__1 : rule__User__Group__1__Impl rule__User__Group__2 ;
    public final void rule__User__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2203:1: ( rule__User__Group__1__Impl rule__User__Group__2 )
            // InternalSecurityDsl.g:2204:2: rule__User__Group__1__Impl rule__User__Group__2
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
    // InternalSecurityDsl.g:2211:1: rule__User__Group__1__Impl : ( 'name:' ) ;
    public final void rule__User__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2215:1: ( ( 'name:' ) )
            // InternalSecurityDsl.g:2216:1: ( 'name:' )
            {
            // InternalSecurityDsl.g:2216:1: ( 'name:' )
            // InternalSecurityDsl.g:2217:2: 'name:'
            {
             before(grammarAccess.getUserAccess().getNameKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getNameKeyword_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:2226:1: rule__User__Group__2 : rule__User__Group__2__Impl rule__User__Group__3 ;
    public final void rule__User__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2230:1: ( rule__User__Group__2__Impl rule__User__Group__3 )
            // InternalSecurityDsl.g:2231:2: rule__User__Group__2__Impl rule__User__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalSecurityDsl.g:2238:1: rule__User__Group__2__Impl : ( ( rule__User__IdentifierNameAssignment_2 ) ) ;
    public final void rule__User__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2242:1: ( ( ( rule__User__IdentifierNameAssignment_2 ) ) )
            // InternalSecurityDsl.g:2243:1: ( ( rule__User__IdentifierNameAssignment_2 ) )
            {
            // InternalSecurityDsl.g:2243:1: ( ( rule__User__IdentifierNameAssignment_2 ) )
            // InternalSecurityDsl.g:2244:2: ( rule__User__IdentifierNameAssignment_2 )
            {
             before(grammarAccess.getUserAccess().getIdentifierNameAssignment_2()); 
            // InternalSecurityDsl.g:2245:2: ( rule__User__IdentifierNameAssignment_2 )
            // InternalSecurityDsl.g:2245:3: rule__User__IdentifierNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__User__IdentifierNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getIdentifierNameAssignment_2()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:2253:1: rule__User__Group__3 : rule__User__Group__3__Impl rule__User__Group__4 ;
    public final void rule__User__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2257:1: ( rule__User__Group__3__Impl rule__User__Group__4 )
            // InternalSecurityDsl.g:2258:2: rule__User__Group__3__Impl rule__User__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalSecurityDsl.g:2265:1: rule__User__Group__3__Impl : ( 'type:' ) ;
    public final void rule__User__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2269:1: ( ( 'type:' ) )
            // InternalSecurityDsl.g:2270:1: ( 'type:' )
            {
            // InternalSecurityDsl.g:2270:1: ( 'type:' )
            // InternalSecurityDsl.g:2271:2: 'type:'
            {
             before(grammarAccess.getUserAccess().getTypeKeyword_3()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getTypeKeyword_3()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:2280:1: rule__User__Group__4 : rule__User__Group__4__Impl rule__User__Group__5 ;
    public final void rule__User__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2284:1: ( rule__User__Group__4__Impl rule__User__Group__5 )
            // InternalSecurityDsl.g:2285:2: rule__User__Group__4__Impl rule__User__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalSecurityDsl.g:2292:1: rule__User__Group__4__Impl : ( ( rule__User__IdentifierTypeAssignment_4 ) ) ;
    public final void rule__User__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2296:1: ( ( ( rule__User__IdentifierTypeAssignment_4 ) ) )
            // InternalSecurityDsl.g:2297:1: ( ( rule__User__IdentifierTypeAssignment_4 ) )
            {
            // InternalSecurityDsl.g:2297:1: ( ( rule__User__IdentifierTypeAssignment_4 ) )
            // InternalSecurityDsl.g:2298:2: ( rule__User__IdentifierTypeAssignment_4 )
            {
             before(grammarAccess.getUserAccess().getIdentifierTypeAssignment_4()); 
            // InternalSecurityDsl.g:2299:2: ( rule__User__IdentifierTypeAssignment_4 )
            // InternalSecurityDsl.g:2299:3: rule__User__IdentifierTypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__User__IdentifierTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getIdentifierTypeAssignment_4()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:2307:1: rule__User__Group__5 : rule__User__Group__5__Impl ;
    public final void rule__User__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2311:1: ( rule__User__Group__5__Impl )
            // InternalSecurityDsl.g:2312:2: rule__User__Group__5__Impl
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
    // InternalSecurityDsl.g:2318:1: rule__User__Group__5__Impl : ( ( rule__User__Group_5__0 )? ) ;
    public final void rule__User__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2322:1: ( ( ( rule__User__Group_5__0 )? ) )
            // InternalSecurityDsl.g:2323:1: ( ( rule__User__Group_5__0 )? )
            {
            // InternalSecurityDsl.g:2323:1: ( ( rule__User__Group_5__0 )? )
            // InternalSecurityDsl.g:2324:2: ( rule__User__Group_5__0 )?
            {
             before(grammarAccess.getUserAccess().getGroup_5()); 
            // InternalSecurityDsl.g:2325:2: ( rule__User__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==52) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSecurityDsl.g:2325:3: rule__User__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__User__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUserAccess().getGroup_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__User__Group_5__0"
    // InternalSecurityDsl.g:2334:1: rule__User__Group_5__0 : rule__User__Group_5__0__Impl rule__User__Group_5__1 ;
    public final void rule__User__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2338:1: ( rule__User__Group_5__0__Impl rule__User__Group_5__1 )
            // InternalSecurityDsl.g:2339:2: rule__User__Group_5__0__Impl rule__User__Group_5__1
            {
            pushFollow(FOLLOW_11);
            rule__User__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_5__0"


    // $ANTLR start "rule__User__Group_5__0__Impl"
    // InternalSecurityDsl.g:2346:1: rule__User__Group_5__0__Impl : ( 'other-fields:' ) ;
    public final void rule__User__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2350:1: ( ( 'other-fields:' ) )
            // InternalSecurityDsl.g:2351:1: ( 'other-fields:' )
            {
            // InternalSecurityDsl.g:2351:1: ( 'other-fields:' )
            // InternalSecurityDsl.g:2352:2: 'other-fields:'
            {
             before(grammarAccess.getUserAccess().getOtherFieldsKeyword_5_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getOtherFieldsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_5__0__Impl"


    // $ANTLR start "rule__User__Group_5__1"
    // InternalSecurityDsl.g:2361:1: rule__User__Group_5__1 : rule__User__Group_5__1__Impl rule__User__Group_5__2 ;
    public final void rule__User__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2365:1: ( rule__User__Group_5__1__Impl rule__User__Group_5__2 )
            // InternalSecurityDsl.g:2366:2: rule__User__Group_5__1__Impl rule__User__Group_5__2
            {
            pushFollow(FOLLOW_12);
            rule__User__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_5__1"


    // $ANTLR start "rule__User__Group_5__1__Impl"
    // InternalSecurityDsl.g:2373:1: rule__User__Group_5__1__Impl : ( '[' ) ;
    public final void rule__User__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2377:1: ( ( '[' ) )
            // InternalSecurityDsl.g:2378:1: ( '[' )
            {
            // InternalSecurityDsl.g:2378:1: ( '[' )
            // InternalSecurityDsl.g:2379:2: '['
            {
             before(grammarAccess.getUserAccess().getLeftSquareBracketKeyword_5_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getLeftSquareBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_5__1__Impl"


    // $ANTLR start "rule__User__Group_5__2"
    // InternalSecurityDsl.g:2388:1: rule__User__Group_5__2 : rule__User__Group_5__2__Impl rule__User__Group_5__3 ;
    public final void rule__User__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2392:1: ( rule__User__Group_5__2__Impl rule__User__Group_5__3 )
            // InternalSecurityDsl.g:2393:2: rule__User__Group_5__2__Impl rule__User__Group_5__3
            {
            pushFollow(FOLLOW_13);
            rule__User__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_5__2"


    // $ANTLR start "rule__User__Group_5__2__Impl"
    // InternalSecurityDsl.g:2400:1: rule__User__Group_5__2__Impl : ( ( rule__User__Model_attributesAssignment_5_2 ) ) ;
    public final void rule__User__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2404:1: ( ( ( rule__User__Model_attributesAssignment_5_2 ) ) )
            // InternalSecurityDsl.g:2405:1: ( ( rule__User__Model_attributesAssignment_5_2 ) )
            {
            // InternalSecurityDsl.g:2405:1: ( ( rule__User__Model_attributesAssignment_5_2 ) )
            // InternalSecurityDsl.g:2406:2: ( rule__User__Model_attributesAssignment_5_2 )
            {
             before(grammarAccess.getUserAccess().getModel_attributesAssignment_5_2()); 
            // InternalSecurityDsl.g:2407:2: ( rule__User__Model_attributesAssignment_5_2 )
            // InternalSecurityDsl.g:2407:3: rule__User__Model_attributesAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__User__Model_attributesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getModel_attributesAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_5__2__Impl"


    // $ANTLR start "rule__User__Group_5__3"
    // InternalSecurityDsl.g:2415:1: rule__User__Group_5__3 : rule__User__Group_5__3__Impl rule__User__Group_5__4 ;
    public final void rule__User__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2419:1: ( rule__User__Group_5__3__Impl rule__User__Group_5__4 )
            // InternalSecurityDsl.g:2420:2: rule__User__Group_5__3__Impl rule__User__Group_5__4
            {
            pushFollow(FOLLOW_13);
            rule__User__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_5__3"


    // $ANTLR start "rule__User__Group_5__3__Impl"
    // InternalSecurityDsl.g:2427:1: rule__User__Group_5__3__Impl : ( ( rule__User__Group_5_3__0 )* ) ;
    public final void rule__User__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2431:1: ( ( ( rule__User__Group_5_3__0 )* ) )
            // InternalSecurityDsl.g:2432:1: ( ( rule__User__Group_5_3__0 )* )
            {
            // InternalSecurityDsl.g:2432:1: ( ( rule__User__Group_5_3__0 )* )
            // InternalSecurityDsl.g:2433:2: ( rule__User__Group_5_3__0 )*
            {
             before(grammarAccess.getUserAccess().getGroup_5_3()); 
            // InternalSecurityDsl.g:2434:2: ( rule__User__Group_5_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==41) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSecurityDsl.g:2434:3: rule__User__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__User__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getUserAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_5__3__Impl"


    // $ANTLR start "rule__User__Group_5__4"
    // InternalSecurityDsl.g:2442:1: rule__User__Group_5__4 : rule__User__Group_5__4__Impl ;
    public final void rule__User__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2446:1: ( rule__User__Group_5__4__Impl )
            // InternalSecurityDsl.g:2447:2: rule__User__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__User__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_5__4"


    // $ANTLR start "rule__User__Group_5__4__Impl"
    // InternalSecurityDsl.g:2453:1: rule__User__Group_5__4__Impl : ( ']' ) ;
    public final void rule__User__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2457:1: ( ( ']' ) )
            // InternalSecurityDsl.g:2458:1: ( ']' )
            {
            // InternalSecurityDsl.g:2458:1: ( ']' )
            // InternalSecurityDsl.g:2459:2: ']'
            {
             before(grammarAccess.getUserAccess().getRightSquareBracketKeyword_5_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getRightSquareBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_5__4__Impl"


    // $ANTLR start "rule__User__Group_5_3__0"
    // InternalSecurityDsl.g:2469:1: rule__User__Group_5_3__0 : rule__User__Group_5_3__0__Impl rule__User__Group_5_3__1 ;
    public final void rule__User__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2473:1: ( rule__User__Group_5_3__0__Impl rule__User__Group_5_3__1 )
            // InternalSecurityDsl.g:2474:2: rule__User__Group_5_3__0__Impl rule__User__Group_5_3__1
            {
            pushFollow(FOLLOW_12);
            rule__User__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_5_3__0"


    // $ANTLR start "rule__User__Group_5_3__0__Impl"
    // InternalSecurityDsl.g:2481:1: rule__User__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__User__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2485:1: ( ( ',' ) )
            // InternalSecurityDsl.g:2486:1: ( ',' )
            {
            // InternalSecurityDsl.g:2486:1: ( ',' )
            // InternalSecurityDsl.g:2487:2: ','
            {
             before(grammarAccess.getUserAccess().getCommaKeyword_5_3_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_5_3__0__Impl"


    // $ANTLR start "rule__User__Group_5_3__1"
    // InternalSecurityDsl.g:2496:1: rule__User__Group_5_3__1 : rule__User__Group_5_3__1__Impl ;
    public final void rule__User__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2500:1: ( rule__User__Group_5_3__1__Impl )
            // InternalSecurityDsl.g:2501:2: rule__User__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__User__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_5_3__1"


    // $ANTLR start "rule__User__Group_5_3__1__Impl"
    // InternalSecurityDsl.g:2507:1: rule__User__Group_5_3__1__Impl : ( ( rule__User__Model_attributesAssignment_5_3_1 ) ) ;
    public final void rule__User__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2511:1: ( ( ( rule__User__Model_attributesAssignment_5_3_1 ) ) )
            // InternalSecurityDsl.g:2512:1: ( ( rule__User__Model_attributesAssignment_5_3_1 ) )
            {
            // InternalSecurityDsl.g:2512:1: ( ( rule__User__Model_attributesAssignment_5_3_1 ) )
            // InternalSecurityDsl.g:2513:2: ( rule__User__Model_attributesAssignment_5_3_1 )
            {
             before(grammarAccess.getUserAccess().getModel_attributesAssignment_5_3_1()); 
            // InternalSecurityDsl.g:2514:2: ( rule__User__Model_attributesAssignment_5_3_1 )
            // InternalSecurityDsl.g:2514:3: rule__User__Model_attributesAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__User__Model_attributesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getModel_attributesAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_5_3__1__Impl"


    // $ANTLR start "rule__OtherModel__Group__0"
    // InternalSecurityDsl.g:2523:1: rule__OtherModel__Group__0 : rule__OtherModel__Group__0__Impl rule__OtherModel__Group__1 ;
    public final void rule__OtherModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2527:1: ( rule__OtherModel__Group__0__Impl rule__OtherModel__Group__1 )
            // InternalSecurityDsl.g:2528:2: rule__OtherModel__Group__0__Impl rule__OtherModel__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSecurityDsl.g:2535:1: rule__OtherModel__Group__0__Impl : ( '{' ) ;
    public final void rule__OtherModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2539:1: ( ( '{' ) )
            // InternalSecurityDsl.g:2540:1: ( '{' )
            {
            // InternalSecurityDsl.g:2540:1: ( '{' )
            // InternalSecurityDsl.g:2541:2: '{'
            {
             before(grammarAccess.getOtherModelAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getOtherModelAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:2550:1: rule__OtherModel__Group__1 : rule__OtherModel__Group__1__Impl rule__OtherModel__Group__2 ;
    public final void rule__OtherModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2554:1: ( rule__OtherModel__Group__1__Impl rule__OtherModel__Group__2 )
            // InternalSecurityDsl.g:2555:2: rule__OtherModel__Group__1__Impl rule__OtherModel__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSecurityDsl.g:2562:1: rule__OtherModel__Group__1__Impl : ( 'name:' ) ;
    public final void rule__OtherModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2566:1: ( ( 'name:' ) )
            // InternalSecurityDsl.g:2567:1: ( 'name:' )
            {
            // InternalSecurityDsl.g:2567:1: ( 'name:' )
            // InternalSecurityDsl.g:2568:2: 'name:'
            {
             before(grammarAccess.getOtherModelAccess().getNameKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getOtherModelAccess().getNameKeyword_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:2577:1: rule__OtherModel__Group__2 : rule__OtherModel__Group__2__Impl rule__OtherModel__Group__3 ;
    public final void rule__OtherModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2581:1: ( rule__OtherModel__Group__2__Impl rule__OtherModel__Group__3 )
            // InternalSecurityDsl.g:2582:2: rule__OtherModel__Group__2__Impl rule__OtherModel__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalSecurityDsl.g:2589:1: rule__OtherModel__Group__2__Impl : ( ( rule__OtherModel__NameAssignment_2 ) ) ;
    public final void rule__OtherModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2593:1: ( ( ( rule__OtherModel__NameAssignment_2 ) ) )
            // InternalSecurityDsl.g:2594:1: ( ( rule__OtherModel__NameAssignment_2 ) )
            {
            // InternalSecurityDsl.g:2594:1: ( ( rule__OtherModel__NameAssignment_2 ) )
            // InternalSecurityDsl.g:2595:2: ( rule__OtherModel__NameAssignment_2 )
            {
             before(grammarAccess.getOtherModelAccess().getNameAssignment_2()); 
            // InternalSecurityDsl.g:2596:2: ( rule__OtherModel__NameAssignment_2 )
            // InternalSecurityDsl.g:2596:3: rule__OtherModel__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OtherModel__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOtherModelAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:2604:1: rule__OtherModel__Group__3 : rule__OtherModel__Group__3__Impl rule__OtherModel__Group__4 ;
    public final void rule__OtherModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2608:1: ( rule__OtherModel__Group__3__Impl rule__OtherModel__Group__4 )
            // InternalSecurityDsl.g:2609:2: rule__OtherModel__Group__3__Impl rule__OtherModel__Group__4
            {
            pushFollow(FOLLOW_4);
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
    // InternalSecurityDsl.g:2616:1: rule__OtherModel__Group__3__Impl : ( 'identifier:' ) ;
    public final void rule__OtherModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2620:1: ( ( 'identifier:' ) )
            // InternalSecurityDsl.g:2621:1: ( 'identifier:' )
            {
            // InternalSecurityDsl.g:2621:1: ( 'identifier:' )
            // InternalSecurityDsl.g:2622:2: 'identifier:'
            {
             before(grammarAccess.getOtherModelAccess().getIdentifierKeyword_3()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getOtherModelAccess().getIdentifierKeyword_3()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:2631:1: rule__OtherModel__Group__4 : rule__OtherModel__Group__4__Impl rule__OtherModel__Group__5 ;
    public final void rule__OtherModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2635:1: ( rule__OtherModel__Group__4__Impl rule__OtherModel__Group__5 )
            // InternalSecurityDsl.g:2636:2: rule__OtherModel__Group__4__Impl rule__OtherModel__Group__5
            {
            pushFollow(FOLLOW_5);
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
    // InternalSecurityDsl.g:2643:1: rule__OtherModel__Group__4__Impl : ( 'name:' ) ;
    public final void rule__OtherModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2647:1: ( ( 'name:' ) )
            // InternalSecurityDsl.g:2648:1: ( 'name:' )
            {
            // InternalSecurityDsl.g:2648:1: ( 'name:' )
            // InternalSecurityDsl.g:2649:2: 'name:'
            {
             before(grammarAccess.getOtherModelAccess().getNameKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getOtherModelAccess().getNameKeyword_4()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:2658:1: rule__OtherModel__Group__5 : rule__OtherModel__Group__5__Impl rule__OtherModel__Group__6 ;
    public final void rule__OtherModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2662:1: ( rule__OtherModel__Group__5__Impl rule__OtherModel__Group__6 )
            // InternalSecurityDsl.g:2663:2: rule__OtherModel__Group__5__Impl rule__OtherModel__Group__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalSecurityDsl.g:2670:1: rule__OtherModel__Group__5__Impl : ( ( rule__OtherModel__IdentifierNameAssignment_5 ) ) ;
    public final void rule__OtherModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2674:1: ( ( ( rule__OtherModel__IdentifierNameAssignment_5 ) ) )
            // InternalSecurityDsl.g:2675:1: ( ( rule__OtherModel__IdentifierNameAssignment_5 ) )
            {
            // InternalSecurityDsl.g:2675:1: ( ( rule__OtherModel__IdentifierNameAssignment_5 ) )
            // InternalSecurityDsl.g:2676:2: ( rule__OtherModel__IdentifierNameAssignment_5 )
            {
             before(grammarAccess.getOtherModelAccess().getIdentifierNameAssignment_5()); 
            // InternalSecurityDsl.g:2677:2: ( rule__OtherModel__IdentifierNameAssignment_5 )
            // InternalSecurityDsl.g:2677:3: rule__OtherModel__IdentifierNameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__OtherModel__IdentifierNameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getOtherModelAccess().getIdentifierNameAssignment_5()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:2685:1: rule__OtherModel__Group__6 : rule__OtherModel__Group__6__Impl rule__OtherModel__Group__7 ;
    public final void rule__OtherModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2689:1: ( rule__OtherModel__Group__6__Impl rule__OtherModel__Group__7 )
            // InternalSecurityDsl.g:2690:2: rule__OtherModel__Group__6__Impl rule__OtherModel__Group__7
            {
            pushFollow(FOLLOW_21);
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
    // InternalSecurityDsl.g:2697:1: rule__OtherModel__Group__6__Impl : ( 'type:' ) ;
    public final void rule__OtherModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2701:1: ( ( 'type:' ) )
            // InternalSecurityDsl.g:2702:1: ( 'type:' )
            {
            // InternalSecurityDsl.g:2702:1: ( 'type:' )
            // InternalSecurityDsl.g:2703:2: 'type:'
            {
             before(grammarAccess.getOtherModelAccess().getTypeKeyword_6()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getOtherModelAccess().getTypeKeyword_6()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:2712:1: rule__OtherModel__Group__7 : rule__OtherModel__Group__7__Impl rule__OtherModel__Group__8 ;
    public final void rule__OtherModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2716:1: ( rule__OtherModel__Group__7__Impl rule__OtherModel__Group__8 )
            // InternalSecurityDsl.g:2717:2: rule__OtherModel__Group__7__Impl rule__OtherModel__Group__8
            {
            pushFollow(FOLLOW_24);
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
    // InternalSecurityDsl.g:2724:1: rule__OtherModel__Group__7__Impl : ( ( rule__OtherModel__IdentifierTypeAssignment_7 ) ) ;
    public final void rule__OtherModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2728:1: ( ( ( rule__OtherModel__IdentifierTypeAssignment_7 ) ) )
            // InternalSecurityDsl.g:2729:1: ( ( rule__OtherModel__IdentifierTypeAssignment_7 ) )
            {
            // InternalSecurityDsl.g:2729:1: ( ( rule__OtherModel__IdentifierTypeAssignment_7 ) )
            // InternalSecurityDsl.g:2730:2: ( rule__OtherModel__IdentifierTypeAssignment_7 )
            {
             before(grammarAccess.getOtherModelAccess().getIdentifierTypeAssignment_7()); 
            // InternalSecurityDsl.g:2731:2: ( rule__OtherModel__IdentifierTypeAssignment_7 )
            // InternalSecurityDsl.g:2731:3: rule__OtherModel__IdentifierTypeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__OtherModel__IdentifierTypeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getOtherModelAccess().getIdentifierTypeAssignment_7()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:2739:1: rule__OtherModel__Group__8 : rule__OtherModel__Group__8__Impl rule__OtherModel__Group__9 ;
    public final void rule__OtherModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2743:1: ( rule__OtherModel__Group__8__Impl rule__OtherModel__Group__9 )
            // InternalSecurityDsl.g:2744:2: rule__OtherModel__Group__8__Impl rule__OtherModel__Group__9
            {
            pushFollow(FOLLOW_24);
            rule__OtherModel__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherModel__Group__9();

            state._fsp--;


            }

        }
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
    // InternalSecurityDsl.g:2751:1: rule__OtherModel__Group__8__Impl : ( ( rule__OtherModel__Group_8__0 )? ) ;
    public final void rule__OtherModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2755:1: ( ( ( rule__OtherModel__Group_8__0 )? ) )
            // InternalSecurityDsl.g:2756:1: ( ( rule__OtherModel__Group_8__0 )? )
            {
            // InternalSecurityDsl.g:2756:1: ( ( rule__OtherModel__Group_8__0 )? )
            // InternalSecurityDsl.g:2757:2: ( rule__OtherModel__Group_8__0 )?
            {
             before(grammarAccess.getOtherModelAccess().getGroup_8()); 
            // InternalSecurityDsl.g:2758:2: ( rule__OtherModel__Group_8__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==52) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSecurityDsl.g:2758:3: rule__OtherModel__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OtherModel__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOtherModelAccess().getGroup_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__OtherModel__Group__9"
    // InternalSecurityDsl.g:2766:1: rule__OtherModel__Group__9 : rule__OtherModel__Group__9__Impl ;
    public final void rule__OtherModel__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2770:1: ( rule__OtherModel__Group__9__Impl )
            // InternalSecurityDsl.g:2771:2: rule__OtherModel__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OtherModel__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group__9"


    // $ANTLR start "rule__OtherModel__Group__9__Impl"
    // InternalSecurityDsl.g:2777:1: rule__OtherModel__Group__9__Impl : ( '}' ) ;
    public final void rule__OtherModel__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2781:1: ( ( '}' ) )
            // InternalSecurityDsl.g:2782:1: ( '}' )
            {
            // InternalSecurityDsl.g:2782:1: ( '}' )
            // InternalSecurityDsl.g:2783:2: '}'
            {
             before(grammarAccess.getOtherModelAccess().getRightCurlyBracketKeyword_9()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getOtherModelAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group__9__Impl"


    // $ANTLR start "rule__OtherModel__Group_8__0"
    // InternalSecurityDsl.g:2793:1: rule__OtherModel__Group_8__0 : rule__OtherModel__Group_8__0__Impl rule__OtherModel__Group_8__1 ;
    public final void rule__OtherModel__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2797:1: ( rule__OtherModel__Group_8__0__Impl rule__OtherModel__Group_8__1 )
            // InternalSecurityDsl.g:2798:2: rule__OtherModel__Group_8__0__Impl rule__OtherModel__Group_8__1
            {
            pushFollow(FOLLOW_11);
            rule__OtherModel__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherModel__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group_8__0"


    // $ANTLR start "rule__OtherModel__Group_8__0__Impl"
    // InternalSecurityDsl.g:2805:1: rule__OtherModel__Group_8__0__Impl : ( 'other-fields:' ) ;
    public final void rule__OtherModel__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2809:1: ( ( 'other-fields:' ) )
            // InternalSecurityDsl.g:2810:1: ( 'other-fields:' )
            {
            // InternalSecurityDsl.g:2810:1: ( 'other-fields:' )
            // InternalSecurityDsl.g:2811:2: 'other-fields:'
            {
             before(grammarAccess.getOtherModelAccess().getOtherFieldsKeyword_8_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getOtherModelAccess().getOtherFieldsKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group_8__0__Impl"


    // $ANTLR start "rule__OtherModel__Group_8__1"
    // InternalSecurityDsl.g:2820:1: rule__OtherModel__Group_8__1 : rule__OtherModel__Group_8__1__Impl rule__OtherModel__Group_8__2 ;
    public final void rule__OtherModel__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2824:1: ( rule__OtherModel__Group_8__1__Impl rule__OtherModel__Group_8__2 )
            // InternalSecurityDsl.g:2825:2: rule__OtherModel__Group_8__1__Impl rule__OtherModel__Group_8__2
            {
            pushFollow(FOLLOW_12);
            rule__OtherModel__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherModel__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group_8__1"


    // $ANTLR start "rule__OtherModel__Group_8__1__Impl"
    // InternalSecurityDsl.g:2832:1: rule__OtherModel__Group_8__1__Impl : ( '[' ) ;
    public final void rule__OtherModel__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2836:1: ( ( '[' ) )
            // InternalSecurityDsl.g:2837:1: ( '[' )
            {
            // InternalSecurityDsl.g:2837:1: ( '[' )
            // InternalSecurityDsl.g:2838:2: '['
            {
             before(grammarAccess.getOtherModelAccess().getLeftSquareBracketKeyword_8_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getOtherModelAccess().getLeftSquareBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group_8__1__Impl"


    // $ANTLR start "rule__OtherModel__Group_8__2"
    // InternalSecurityDsl.g:2847:1: rule__OtherModel__Group_8__2 : rule__OtherModel__Group_8__2__Impl rule__OtherModel__Group_8__3 ;
    public final void rule__OtherModel__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2851:1: ( rule__OtherModel__Group_8__2__Impl rule__OtherModel__Group_8__3 )
            // InternalSecurityDsl.g:2852:2: rule__OtherModel__Group_8__2__Impl rule__OtherModel__Group_8__3
            {
            pushFollow(FOLLOW_13);
            rule__OtherModel__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherModel__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group_8__2"


    // $ANTLR start "rule__OtherModel__Group_8__2__Impl"
    // InternalSecurityDsl.g:2859:1: rule__OtherModel__Group_8__2__Impl : ( ( rule__OtherModel__Model_attributesAssignment_8_2 ) ) ;
    public final void rule__OtherModel__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2863:1: ( ( ( rule__OtherModel__Model_attributesAssignment_8_2 ) ) )
            // InternalSecurityDsl.g:2864:1: ( ( rule__OtherModel__Model_attributesAssignment_8_2 ) )
            {
            // InternalSecurityDsl.g:2864:1: ( ( rule__OtherModel__Model_attributesAssignment_8_2 ) )
            // InternalSecurityDsl.g:2865:2: ( rule__OtherModel__Model_attributesAssignment_8_2 )
            {
             before(grammarAccess.getOtherModelAccess().getModel_attributesAssignment_8_2()); 
            // InternalSecurityDsl.g:2866:2: ( rule__OtherModel__Model_attributesAssignment_8_2 )
            // InternalSecurityDsl.g:2866:3: rule__OtherModel__Model_attributesAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__OtherModel__Model_attributesAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getOtherModelAccess().getModel_attributesAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group_8__2__Impl"


    // $ANTLR start "rule__OtherModel__Group_8__3"
    // InternalSecurityDsl.g:2874:1: rule__OtherModel__Group_8__3 : rule__OtherModel__Group_8__3__Impl rule__OtherModel__Group_8__4 ;
    public final void rule__OtherModel__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2878:1: ( rule__OtherModel__Group_8__3__Impl rule__OtherModel__Group_8__4 )
            // InternalSecurityDsl.g:2879:2: rule__OtherModel__Group_8__3__Impl rule__OtherModel__Group_8__4
            {
            pushFollow(FOLLOW_13);
            rule__OtherModel__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherModel__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group_8__3"


    // $ANTLR start "rule__OtherModel__Group_8__3__Impl"
    // InternalSecurityDsl.g:2886:1: rule__OtherModel__Group_8__3__Impl : ( ( rule__OtherModel__Group_8_3__0 )* ) ;
    public final void rule__OtherModel__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2890:1: ( ( ( rule__OtherModel__Group_8_3__0 )* ) )
            // InternalSecurityDsl.g:2891:1: ( ( rule__OtherModel__Group_8_3__0 )* )
            {
            // InternalSecurityDsl.g:2891:1: ( ( rule__OtherModel__Group_8_3__0 )* )
            // InternalSecurityDsl.g:2892:2: ( rule__OtherModel__Group_8_3__0 )*
            {
             before(grammarAccess.getOtherModelAccess().getGroup_8_3()); 
            // InternalSecurityDsl.g:2893:2: ( rule__OtherModel__Group_8_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==41) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSecurityDsl.g:2893:3: rule__OtherModel__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__OtherModel__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getOtherModelAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group_8__3__Impl"


    // $ANTLR start "rule__OtherModel__Group_8__4"
    // InternalSecurityDsl.g:2901:1: rule__OtherModel__Group_8__4 : rule__OtherModel__Group_8__4__Impl ;
    public final void rule__OtherModel__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2905:1: ( rule__OtherModel__Group_8__4__Impl )
            // InternalSecurityDsl.g:2906:2: rule__OtherModel__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OtherModel__Group_8__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group_8__4"


    // $ANTLR start "rule__OtherModel__Group_8__4__Impl"
    // InternalSecurityDsl.g:2912:1: rule__OtherModel__Group_8__4__Impl : ( ']' ) ;
    public final void rule__OtherModel__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2916:1: ( ( ']' ) )
            // InternalSecurityDsl.g:2917:1: ( ']' )
            {
            // InternalSecurityDsl.g:2917:1: ( ']' )
            // InternalSecurityDsl.g:2918:2: ']'
            {
             before(grammarAccess.getOtherModelAccess().getRightSquareBracketKeyword_8_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getOtherModelAccess().getRightSquareBracketKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group_8__4__Impl"


    // $ANTLR start "rule__OtherModel__Group_8_3__0"
    // InternalSecurityDsl.g:2928:1: rule__OtherModel__Group_8_3__0 : rule__OtherModel__Group_8_3__0__Impl rule__OtherModel__Group_8_3__1 ;
    public final void rule__OtherModel__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2932:1: ( rule__OtherModel__Group_8_3__0__Impl rule__OtherModel__Group_8_3__1 )
            // InternalSecurityDsl.g:2933:2: rule__OtherModel__Group_8_3__0__Impl rule__OtherModel__Group_8_3__1
            {
            pushFollow(FOLLOW_12);
            rule__OtherModel__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherModel__Group_8_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group_8_3__0"


    // $ANTLR start "rule__OtherModel__Group_8_3__0__Impl"
    // InternalSecurityDsl.g:2940:1: rule__OtherModel__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__OtherModel__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2944:1: ( ( ',' ) )
            // InternalSecurityDsl.g:2945:1: ( ',' )
            {
            // InternalSecurityDsl.g:2945:1: ( ',' )
            // InternalSecurityDsl.g:2946:2: ','
            {
             before(grammarAccess.getOtherModelAccess().getCommaKeyword_8_3_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getOtherModelAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group_8_3__0__Impl"


    // $ANTLR start "rule__OtherModel__Group_8_3__1"
    // InternalSecurityDsl.g:2955:1: rule__OtherModel__Group_8_3__1 : rule__OtherModel__Group_8_3__1__Impl ;
    public final void rule__OtherModel__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2959:1: ( rule__OtherModel__Group_8_3__1__Impl )
            // InternalSecurityDsl.g:2960:2: rule__OtherModel__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OtherModel__Group_8_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group_8_3__1"


    // $ANTLR start "rule__OtherModel__Group_8_3__1__Impl"
    // InternalSecurityDsl.g:2966:1: rule__OtherModel__Group_8_3__1__Impl : ( ( rule__OtherModel__Model_attributesAssignment_8_3_1 ) ) ;
    public final void rule__OtherModel__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2970:1: ( ( ( rule__OtherModel__Model_attributesAssignment_8_3_1 ) ) )
            // InternalSecurityDsl.g:2971:1: ( ( rule__OtherModel__Model_attributesAssignment_8_3_1 ) )
            {
            // InternalSecurityDsl.g:2971:1: ( ( rule__OtherModel__Model_attributesAssignment_8_3_1 ) )
            // InternalSecurityDsl.g:2972:2: ( rule__OtherModel__Model_attributesAssignment_8_3_1 )
            {
             before(grammarAccess.getOtherModelAccess().getModel_attributesAssignment_8_3_1()); 
            // InternalSecurityDsl.g:2973:2: ( rule__OtherModel__Model_attributesAssignment_8_3_1 )
            // InternalSecurityDsl.g:2973:3: rule__OtherModel__Model_attributesAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__OtherModel__Model_attributesAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOtherModelAccess().getModel_attributesAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Group_8_3__1__Impl"


    // $ANTLR start "rule__Role__Group__0"
    // InternalSecurityDsl.g:2982:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2986:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // InternalSecurityDsl.g:2987:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSecurityDsl.g:2994:1: rule__Role__Group__0__Impl : ( 'identifier:' ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:2998:1: ( ( 'identifier:' ) )
            // InternalSecurityDsl.g:2999:1: ( 'identifier:' )
            {
            // InternalSecurityDsl.g:2999:1: ( 'identifier:' )
            // InternalSecurityDsl.g:3000:2: 'identifier:'
            {
             before(grammarAccess.getRoleAccess().getIdentifierKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getIdentifierKeyword_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3009:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3013:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // InternalSecurityDsl.g:3014:2: rule__Role__Group__1__Impl rule__Role__Group__2
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
    // InternalSecurityDsl.g:3021:1: rule__Role__Group__1__Impl : ( 'name:' ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3025:1: ( ( 'name:' ) )
            // InternalSecurityDsl.g:3026:1: ( 'name:' )
            {
            // InternalSecurityDsl.g:3026:1: ( 'name:' )
            // InternalSecurityDsl.g:3027:2: 'name:'
            {
             before(grammarAccess.getRoleAccess().getNameKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getNameKeyword_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3036:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3040:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // InternalSecurityDsl.g:3041:2: rule__Role__Group__2__Impl rule__Role__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalSecurityDsl.g:3048:1: rule__Role__Group__2__Impl : ( ( rule__Role__IdentifierNameAssignment_2 ) ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3052:1: ( ( ( rule__Role__IdentifierNameAssignment_2 ) ) )
            // InternalSecurityDsl.g:3053:1: ( ( rule__Role__IdentifierNameAssignment_2 ) )
            {
            // InternalSecurityDsl.g:3053:1: ( ( rule__Role__IdentifierNameAssignment_2 ) )
            // InternalSecurityDsl.g:3054:2: ( rule__Role__IdentifierNameAssignment_2 )
            {
             before(grammarAccess.getRoleAccess().getIdentifierNameAssignment_2()); 
            // InternalSecurityDsl.g:3055:2: ( rule__Role__IdentifierNameAssignment_2 )
            // InternalSecurityDsl.g:3055:3: rule__Role__IdentifierNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Role__IdentifierNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getIdentifierNameAssignment_2()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3063:1: rule__Role__Group__3 : rule__Role__Group__3__Impl rule__Role__Group__4 ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3067:1: ( rule__Role__Group__3__Impl rule__Role__Group__4 )
            // InternalSecurityDsl.g:3068:2: rule__Role__Group__3__Impl rule__Role__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalSecurityDsl.g:3075:1: rule__Role__Group__3__Impl : ( 'type:' ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3079:1: ( ( 'type:' ) )
            // InternalSecurityDsl.g:3080:1: ( 'type:' )
            {
            // InternalSecurityDsl.g:3080:1: ( 'type:' )
            // InternalSecurityDsl.g:3081:2: 'type:'
            {
             before(grammarAccess.getRoleAccess().getTypeKeyword_3()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getTypeKeyword_3()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3090:1: rule__Role__Group__4 : rule__Role__Group__4__Impl rule__Role__Group__5 ;
    public final void rule__Role__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3094:1: ( rule__Role__Group__4__Impl rule__Role__Group__5 )
            // InternalSecurityDsl.g:3095:2: rule__Role__Group__4__Impl rule__Role__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalSecurityDsl.g:3102:1: rule__Role__Group__4__Impl : ( ( rule__Role__IdentifierTypeAssignment_4 ) ) ;
    public final void rule__Role__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3106:1: ( ( ( rule__Role__IdentifierTypeAssignment_4 ) ) )
            // InternalSecurityDsl.g:3107:1: ( ( rule__Role__IdentifierTypeAssignment_4 ) )
            {
            // InternalSecurityDsl.g:3107:1: ( ( rule__Role__IdentifierTypeAssignment_4 ) )
            // InternalSecurityDsl.g:3108:2: ( rule__Role__IdentifierTypeAssignment_4 )
            {
             before(grammarAccess.getRoleAccess().getIdentifierTypeAssignment_4()); 
            // InternalSecurityDsl.g:3109:2: ( rule__Role__IdentifierTypeAssignment_4 )
            // InternalSecurityDsl.g:3109:3: rule__Role__IdentifierTypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Role__IdentifierTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getIdentifierTypeAssignment_4()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3117:1: rule__Role__Group__5 : rule__Role__Group__5__Impl ;
    public final void rule__Role__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3121:1: ( rule__Role__Group__5__Impl )
            // InternalSecurityDsl.g:3122:2: rule__Role__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalSecurityDsl.g:3128:1: rule__Role__Group__5__Impl : ( ( rule__Role__Group_5__0 )? ) ;
    public final void rule__Role__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3132:1: ( ( ( rule__Role__Group_5__0 )? ) )
            // InternalSecurityDsl.g:3133:1: ( ( rule__Role__Group_5__0 )? )
            {
            // InternalSecurityDsl.g:3133:1: ( ( rule__Role__Group_5__0 )? )
            // InternalSecurityDsl.g:3134:2: ( rule__Role__Group_5__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_5()); 
            // InternalSecurityDsl.g:3135:2: ( rule__Role__Group_5__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==52) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSecurityDsl.g:3135:3: rule__Role__Group_5__0
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


    // $ANTLR start "rule__Role__Group_5__0"
    // InternalSecurityDsl.g:3144:1: rule__Role__Group_5__0 : rule__Role__Group_5__0__Impl rule__Role__Group_5__1 ;
    public final void rule__Role__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3148:1: ( rule__Role__Group_5__0__Impl rule__Role__Group_5__1 )
            // InternalSecurityDsl.g:3149:2: rule__Role__Group_5__0__Impl rule__Role__Group_5__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSecurityDsl.g:3156:1: rule__Role__Group_5__0__Impl : ( 'other-fields:' ) ;
    public final void rule__Role__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3160:1: ( ( 'other-fields:' ) )
            // InternalSecurityDsl.g:3161:1: ( 'other-fields:' )
            {
            // InternalSecurityDsl.g:3161:1: ( 'other-fields:' )
            // InternalSecurityDsl.g:3162:2: 'other-fields:'
            {
             before(grammarAccess.getRoleAccess().getOtherFieldsKeyword_5_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getOtherFieldsKeyword_5_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3171:1: rule__Role__Group_5__1 : rule__Role__Group_5__1__Impl rule__Role__Group_5__2 ;
    public final void rule__Role__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3175:1: ( rule__Role__Group_5__1__Impl rule__Role__Group_5__2 )
            // InternalSecurityDsl.g:3176:2: rule__Role__Group_5__1__Impl rule__Role__Group_5__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalSecurityDsl.g:3183:1: rule__Role__Group_5__1__Impl : ( '[' ) ;
    public final void rule__Role__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3187:1: ( ( '[' ) )
            // InternalSecurityDsl.g:3188:1: ( '[' )
            {
            // InternalSecurityDsl.g:3188:1: ( '[' )
            // InternalSecurityDsl.g:3189:2: '['
            {
             before(grammarAccess.getRoleAccess().getLeftSquareBracketKeyword_5_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getLeftSquareBracketKeyword_5_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3198:1: rule__Role__Group_5__2 : rule__Role__Group_5__2__Impl rule__Role__Group_5__3 ;
    public final void rule__Role__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3202:1: ( rule__Role__Group_5__2__Impl rule__Role__Group_5__3 )
            // InternalSecurityDsl.g:3203:2: rule__Role__Group_5__2__Impl rule__Role__Group_5__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalSecurityDsl.g:3210:1: rule__Role__Group_5__2__Impl : ( ( rule__Role__Model_attributesAssignment_5_2 ) ) ;
    public final void rule__Role__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3214:1: ( ( ( rule__Role__Model_attributesAssignment_5_2 ) ) )
            // InternalSecurityDsl.g:3215:1: ( ( rule__Role__Model_attributesAssignment_5_2 ) )
            {
            // InternalSecurityDsl.g:3215:1: ( ( rule__Role__Model_attributesAssignment_5_2 ) )
            // InternalSecurityDsl.g:3216:2: ( rule__Role__Model_attributesAssignment_5_2 )
            {
             before(grammarAccess.getRoleAccess().getModel_attributesAssignment_5_2()); 
            // InternalSecurityDsl.g:3217:2: ( rule__Role__Model_attributesAssignment_5_2 )
            // InternalSecurityDsl.g:3217:3: rule__Role__Model_attributesAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Role__Model_attributesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getModel_attributesAssignment_5_2()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3225:1: rule__Role__Group_5__3 : rule__Role__Group_5__3__Impl rule__Role__Group_5__4 ;
    public final void rule__Role__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3229:1: ( rule__Role__Group_5__3__Impl rule__Role__Group_5__4 )
            // InternalSecurityDsl.g:3230:2: rule__Role__Group_5__3__Impl rule__Role__Group_5__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalSecurityDsl.g:3237:1: rule__Role__Group_5__3__Impl : ( ( rule__Role__Group_5_3__0 )* ) ;
    public final void rule__Role__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3241:1: ( ( ( rule__Role__Group_5_3__0 )* ) )
            // InternalSecurityDsl.g:3242:1: ( ( rule__Role__Group_5_3__0 )* )
            {
            // InternalSecurityDsl.g:3242:1: ( ( rule__Role__Group_5_3__0 )* )
            // InternalSecurityDsl.g:3243:2: ( rule__Role__Group_5_3__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_5_3()); 
            // InternalSecurityDsl.g:3244:2: ( rule__Role__Group_5_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==41) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSecurityDsl.g:3244:3: rule__Role__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Role__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalSecurityDsl.g:3252:1: rule__Role__Group_5__4 : rule__Role__Group_5__4__Impl ;
    public final void rule__Role__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3256:1: ( rule__Role__Group_5__4__Impl )
            // InternalSecurityDsl.g:3257:2: rule__Role__Group_5__4__Impl
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
    // InternalSecurityDsl.g:3263:1: rule__Role__Group_5__4__Impl : ( ']' ) ;
    public final void rule__Role__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3267:1: ( ( ']' ) )
            // InternalSecurityDsl.g:3268:1: ( ']' )
            {
            // InternalSecurityDsl.g:3268:1: ( ']' )
            // InternalSecurityDsl.g:3269:2: ']'
            {
             before(grammarAccess.getRoleAccess().getRightSquareBracketKeyword_5_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRightSquareBracketKeyword_5_4()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3279:1: rule__Role__Group_5_3__0 : rule__Role__Group_5_3__0__Impl rule__Role__Group_5_3__1 ;
    public final void rule__Role__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3283:1: ( rule__Role__Group_5_3__0__Impl rule__Role__Group_5_3__1 )
            // InternalSecurityDsl.g:3284:2: rule__Role__Group_5_3__0__Impl rule__Role__Group_5_3__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalSecurityDsl.g:3291:1: rule__Role__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Role__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3295:1: ( ( ',' ) )
            // InternalSecurityDsl.g:3296:1: ( ',' )
            {
            // InternalSecurityDsl.g:3296:1: ( ',' )
            // InternalSecurityDsl.g:3297:2: ','
            {
             before(grammarAccess.getRoleAccess().getCommaKeyword_5_3_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3306:1: rule__Role__Group_5_3__1 : rule__Role__Group_5_3__1__Impl ;
    public final void rule__Role__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3310:1: ( rule__Role__Group_5_3__1__Impl )
            // InternalSecurityDsl.g:3311:2: rule__Role__Group_5_3__1__Impl
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
    // InternalSecurityDsl.g:3317:1: rule__Role__Group_5_3__1__Impl : ( ( rule__Role__Model_attributesAssignment_5_3_1 ) ) ;
    public final void rule__Role__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3321:1: ( ( ( rule__Role__Model_attributesAssignment_5_3_1 ) ) )
            // InternalSecurityDsl.g:3322:1: ( ( rule__Role__Model_attributesAssignment_5_3_1 ) )
            {
            // InternalSecurityDsl.g:3322:1: ( ( rule__Role__Model_attributesAssignment_5_3_1 ) )
            // InternalSecurityDsl.g:3323:2: ( rule__Role__Model_attributesAssignment_5_3_1 )
            {
             before(grammarAccess.getRoleAccess().getModel_attributesAssignment_5_3_1()); 
            // InternalSecurityDsl.g:3324:2: ( rule__Role__Model_attributesAssignment_5_3_1 )
            // InternalSecurityDsl.g:3324:3: rule__Role__Model_attributesAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Role__Model_attributesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getModel_attributesAssignment_5_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Endpoint__Group__0"
    // InternalSecurityDsl.g:3333:1: rule__Endpoint__Group__0 : rule__Endpoint__Group__0__Impl rule__Endpoint__Group__1 ;
    public final void rule__Endpoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3337:1: ( rule__Endpoint__Group__0__Impl rule__Endpoint__Group__1 )
            // InternalSecurityDsl.g:3338:2: rule__Endpoint__Group__0__Impl rule__Endpoint__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalSecurityDsl.g:3345:1: rule__Endpoint__Group__0__Impl : ( '{' ) ;
    public final void rule__Endpoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3349:1: ( ( '{' ) )
            // InternalSecurityDsl.g:3350:1: ( '{' )
            {
            // InternalSecurityDsl.g:3350:1: ( '{' )
            // InternalSecurityDsl.g:3351:2: '{'
            {
             before(grammarAccess.getEndpointAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3360:1: rule__Endpoint__Group__1 : rule__Endpoint__Group__1__Impl rule__Endpoint__Group__2 ;
    public final void rule__Endpoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3364:1: ( rule__Endpoint__Group__1__Impl rule__Endpoint__Group__2 )
            // InternalSecurityDsl.g:3365:2: rule__Endpoint__Group__1__Impl rule__Endpoint__Group__2
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
    // InternalSecurityDsl.g:3372:1: rule__Endpoint__Group__1__Impl : ( 'url:' ) ;
    public final void rule__Endpoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3376:1: ( ( 'url:' ) )
            // InternalSecurityDsl.g:3377:1: ( 'url:' )
            {
            // InternalSecurityDsl.g:3377:1: ( 'url:' )
            // InternalSecurityDsl.g:3378:2: 'url:'
            {
             before(grammarAccess.getEndpointAccess().getUrlKeyword_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalSecurityDsl.g:3387:1: rule__Endpoint__Group__2 : rule__Endpoint__Group__2__Impl rule__Endpoint__Group__3 ;
    public final void rule__Endpoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3391:1: ( rule__Endpoint__Group__2__Impl rule__Endpoint__Group__3 )
            // InternalSecurityDsl.g:3392:2: rule__Endpoint__Group__2__Impl rule__Endpoint__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalSecurityDsl.g:3399:1: rule__Endpoint__Group__2__Impl : ( ( rule__Endpoint__UrlAssignment_2 ) ) ;
    public final void rule__Endpoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3403:1: ( ( ( rule__Endpoint__UrlAssignment_2 ) ) )
            // InternalSecurityDsl.g:3404:1: ( ( rule__Endpoint__UrlAssignment_2 ) )
            {
            // InternalSecurityDsl.g:3404:1: ( ( rule__Endpoint__UrlAssignment_2 ) )
            // InternalSecurityDsl.g:3405:2: ( rule__Endpoint__UrlAssignment_2 )
            {
             before(grammarAccess.getEndpointAccess().getUrlAssignment_2()); 
            // InternalSecurityDsl.g:3406:2: ( rule__Endpoint__UrlAssignment_2 )
            // InternalSecurityDsl.g:3406:3: rule__Endpoint__UrlAssignment_2
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
    // InternalSecurityDsl.g:3414:1: rule__Endpoint__Group__3 : rule__Endpoint__Group__3__Impl rule__Endpoint__Group__4 ;
    public final void rule__Endpoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3418:1: ( rule__Endpoint__Group__3__Impl rule__Endpoint__Group__4 )
            // InternalSecurityDsl.g:3419:2: rule__Endpoint__Group__3__Impl rule__Endpoint__Group__4
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
    // InternalSecurityDsl.g:3426:1: rule__Endpoint__Group__3__Impl : ( 'method-name:' ) ;
    public final void rule__Endpoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3430:1: ( ( 'method-name:' ) )
            // InternalSecurityDsl.g:3431:1: ( 'method-name:' )
            {
            // InternalSecurityDsl.g:3431:1: ( 'method-name:' )
            // InternalSecurityDsl.g:3432:2: 'method-name:'
            {
             before(grammarAccess.getEndpointAccess().getMethodNameKeyword_3()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getMethodNameKeyword_3()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3441:1: rule__Endpoint__Group__4 : rule__Endpoint__Group__4__Impl rule__Endpoint__Group__5 ;
    public final void rule__Endpoint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3445:1: ( rule__Endpoint__Group__4__Impl rule__Endpoint__Group__5 )
            // InternalSecurityDsl.g:3446:2: rule__Endpoint__Group__4__Impl rule__Endpoint__Group__5
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
    // InternalSecurityDsl.g:3453:1: rule__Endpoint__Group__4__Impl : ( ( rule__Endpoint__Function_nameAssignment_4 ) ) ;
    public final void rule__Endpoint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3457:1: ( ( ( rule__Endpoint__Function_nameAssignment_4 ) ) )
            // InternalSecurityDsl.g:3458:1: ( ( rule__Endpoint__Function_nameAssignment_4 ) )
            {
            // InternalSecurityDsl.g:3458:1: ( ( rule__Endpoint__Function_nameAssignment_4 ) )
            // InternalSecurityDsl.g:3459:2: ( rule__Endpoint__Function_nameAssignment_4 )
            {
             before(grammarAccess.getEndpointAccess().getFunction_nameAssignment_4()); 
            // InternalSecurityDsl.g:3460:2: ( rule__Endpoint__Function_nameAssignment_4 )
            // InternalSecurityDsl.g:3460:3: rule__Endpoint__Function_nameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__Function_nameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEndpointAccess().getFunction_nameAssignment_4()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3468:1: rule__Endpoint__Group__5 : rule__Endpoint__Group__5__Impl rule__Endpoint__Group__6 ;
    public final void rule__Endpoint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3472:1: ( rule__Endpoint__Group__5__Impl rule__Endpoint__Group__6 )
            // InternalSecurityDsl.g:3473:2: rule__Endpoint__Group__5__Impl rule__Endpoint__Group__6
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
    // InternalSecurityDsl.g:3480:1: rule__Endpoint__Group__5__Impl : ( 'method:' ) ;
    public final void rule__Endpoint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3484:1: ( ( 'method:' ) )
            // InternalSecurityDsl.g:3485:1: ( 'method:' )
            {
            // InternalSecurityDsl.g:3485:1: ( 'method:' )
            // InternalSecurityDsl.g:3486:2: 'method:'
            {
             before(grammarAccess.getEndpointAccess().getMethodKeyword_5()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getMethodKeyword_5()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3495:1: rule__Endpoint__Group__6 : rule__Endpoint__Group__6__Impl rule__Endpoint__Group__7 ;
    public final void rule__Endpoint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3499:1: ( rule__Endpoint__Group__6__Impl rule__Endpoint__Group__7 )
            // InternalSecurityDsl.g:3500:2: rule__Endpoint__Group__6__Impl rule__Endpoint__Group__7
            {
            pushFollow(FOLLOW_22);
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
    // InternalSecurityDsl.g:3507:1: rule__Endpoint__Group__6__Impl : ( ( rule__Endpoint__MethodAssignment_6 ) ) ;
    public final void rule__Endpoint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3511:1: ( ( ( rule__Endpoint__MethodAssignment_6 ) ) )
            // InternalSecurityDsl.g:3512:1: ( ( rule__Endpoint__MethodAssignment_6 ) )
            {
            // InternalSecurityDsl.g:3512:1: ( ( rule__Endpoint__MethodAssignment_6 ) )
            // InternalSecurityDsl.g:3513:2: ( rule__Endpoint__MethodAssignment_6 )
            {
             before(grammarAccess.getEndpointAccess().getMethodAssignment_6()); 
            // InternalSecurityDsl.g:3514:2: ( rule__Endpoint__MethodAssignment_6 )
            // InternalSecurityDsl.g:3514:3: rule__Endpoint__MethodAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__MethodAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getEndpointAccess().getMethodAssignment_6()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3522:1: rule__Endpoint__Group__7 : rule__Endpoint__Group__7__Impl ;
    public final void rule__Endpoint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3526:1: ( rule__Endpoint__Group__7__Impl )
            // InternalSecurityDsl.g:3527:2: rule__Endpoint__Group__7__Impl
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
    // InternalSecurityDsl.g:3533:1: rule__Endpoint__Group__7__Impl : ( '}' ) ;
    public final void rule__Endpoint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3537:1: ( ( '}' ) )
            // InternalSecurityDsl.g:3538:1: ( '}' )
            {
            // InternalSecurityDsl.g:3538:1: ( '}' )
            // InternalSecurityDsl.g:3539:2: '}'
            {
             before(grammarAccess.getEndpointAccess().getRightCurlyBracketKeyword_7()); 
            match(input,50,FOLLOW_2); 
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


    // $ANTLR start "rule__AuthEndpoint__Group__0"
    // InternalSecurityDsl.g:3549:1: rule__AuthEndpoint__Group__0 : rule__AuthEndpoint__Group__0__Impl rule__AuthEndpoint__Group__1 ;
    public final void rule__AuthEndpoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3553:1: ( rule__AuthEndpoint__Group__0__Impl rule__AuthEndpoint__Group__1 )
            // InternalSecurityDsl.g:3554:2: rule__AuthEndpoint__Group__0__Impl rule__AuthEndpoint__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__AuthEndpoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AuthEndpoint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthEndpoint__Group__0"


    // $ANTLR start "rule__AuthEndpoint__Group__0__Impl"
    // InternalSecurityDsl.g:3561:1: rule__AuthEndpoint__Group__0__Impl : ( 'url:' ) ;
    public final void rule__AuthEndpoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3565:1: ( ( 'url:' ) )
            // InternalSecurityDsl.g:3566:1: ( 'url:' )
            {
            // InternalSecurityDsl.g:3566:1: ( 'url:' )
            // InternalSecurityDsl.g:3567:2: 'url:'
            {
             before(grammarAccess.getAuthEndpointAccess().getUrlKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getAuthEndpointAccess().getUrlKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthEndpoint__Group__0__Impl"


    // $ANTLR start "rule__AuthEndpoint__Group__1"
    // InternalSecurityDsl.g:3576:1: rule__AuthEndpoint__Group__1 : rule__AuthEndpoint__Group__1__Impl rule__AuthEndpoint__Group__2 ;
    public final void rule__AuthEndpoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3580:1: ( rule__AuthEndpoint__Group__1__Impl rule__AuthEndpoint__Group__2 )
            // InternalSecurityDsl.g:3581:2: rule__AuthEndpoint__Group__1__Impl rule__AuthEndpoint__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__AuthEndpoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AuthEndpoint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthEndpoint__Group__1"


    // $ANTLR start "rule__AuthEndpoint__Group__1__Impl"
    // InternalSecurityDsl.g:3588:1: rule__AuthEndpoint__Group__1__Impl : ( ( rule__AuthEndpoint__UrlAssignment_1 ) ) ;
    public final void rule__AuthEndpoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3592:1: ( ( ( rule__AuthEndpoint__UrlAssignment_1 ) ) )
            // InternalSecurityDsl.g:3593:1: ( ( rule__AuthEndpoint__UrlAssignment_1 ) )
            {
            // InternalSecurityDsl.g:3593:1: ( ( rule__AuthEndpoint__UrlAssignment_1 ) )
            // InternalSecurityDsl.g:3594:2: ( rule__AuthEndpoint__UrlAssignment_1 )
            {
             before(grammarAccess.getAuthEndpointAccess().getUrlAssignment_1()); 
            // InternalSecurityDsl.g:3595:2: ( rule__AuthEndpoint__UrlAssignment_1 )
            // InternalSecurityDsl.g:3595:3: rule__AuthEndpoint__UrlAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AuthEndpoint__UrlAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAuthEndpointAccess().getUrlAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthEndpoint__Group__1__Impl"


    // $ANTLR start "rule__AuthEndpoint__Group__2"
    // InternalSecurityDsl.g:3603:1: rule__AuthEndpoint__Group__2 : rule__AuthEndpoint__Group__2__Impl rule__AuthEndpoint__Group__3 ;
    public final void rule__AuthEndpoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3607:1: ( rule__AuthEndpoint__Group__2__Impl rule__AuthEndpoint__Group__3 )
            // InternalSecurityDsl.g:3608:2: rule__AuthEndpoint__Group__2__Impl rule__AuthEndpoint__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__AuthEndpoint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AuthEndpoint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthEndpoint__Group__2"


    // $ANTLR start "rule__AuthEndpoint__Group__2__Impl"
    // InternalSecurityDsl.g:3615:1: rule__AuthEndpoint__Group__2__Impl : ( 'method-name:' ) ;
    public final void rule__AuthEndpoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3619:1: ( ( 'method-name:' ) )
            // InternalSecurityDsl.g:3620:1: ( 'method-name:' )
            {
            // InternalSecurityDsl.g:3620:1: ( 'method-name:' )
            // InternalSecurityDsl.g:3621:2: 'method-name:'
            {
             before(grammarAccess.getAuthEndpointAccess().getMethodNameKeyword_2()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getAuthEndpointAccess().getMethodNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthEndpoint__Group__2__Impl"


    // $ANTLR start "rule__AuthEndpoint__Group__3"
    // InternalSecurityDsl.g:3630:1: rule__AuthEndpoint__Group__3 : rule__AuthEndpoint__Group__3__Impl rule__AuthEndpoint__Group__4 ;
    public final void rule__AuthEndpoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3634:1: ( rule__AuthEndpoint__Group__3__Impl rule__AuthEndpoint__Group__4 )
            // InternalSecurityDsl.g:3635:2: rule__AuthEndpoint__Group__3__Impl rule__AuthEndpoint__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__AuthEndpoint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AuthEndpoint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthEndpoint__Group__3"


    // $ANTLR start "rule__AuthEndpoint__Group__3__Impl"
    // InternalSecurityDsl.g:3642:1: rule__AuthEndpoint__Group__3__Impl : ( ( rule__AuthEndpoint__Function_nameAssignment_3 ) ) ;
    public final void rule__AuthEndpoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3646:1: ( ( ( rule__AuthEndpoint__Function_nameAssignment_3 ) ) )
            // InternalSecurityDsl.g:3647:1: ( ( rule__AuthEndpoint__Function_nameAssignment_3 ) )
            {
            // InternalSecurityDsl.g:3647:1: ( ( rule__AuthEndpoint__Function_nameAssignment_3 ) )
            // InternalSecurityDsl.g:3648:2: ( rule__AuthEndpoint__Function_nameAssignment_3 )
            {
             before(grammarAccess.getAuthEndpointAccess().getFunction_nameAssignment_3()); 
            // InternalSecurityDsl.g:3649:2: ( rule__AuthEndpoint__Function_nameAssignment_3 )
            // InternalSecurityDsl.g:3649:3: rule__AuthEndpoint__Function_nameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AuthEndpoint__Function_nameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAuthEndpointAccess().getFunction_nameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthEndpoint__Group__3__Impl"


    // $ANTLR start "rule__AuthEndpoint__Group__4"
    // InternalSecurityDsl.g:3657:1: rule__AuthEndpoint__Group__4 : rule__AuthEndpoint__Group__4__Impl rule__AuthEndpoint__Group__5 ;
    public final void rule__AuthEndpoint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3661:1: ( rule__AuthEndpoint__Group__4__Impl rule__AuthEndpoint__Group__5 )
            // InternalSecurityDsl.g:3662:2: rule__AuthEndpoint__Group__4__Impl rule__AuthEndpoint__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__AuthEndpoint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AuthEndpoint__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthEndpoint__Group__4"


    // $ANTLR start "rule__AuthEndpoint__Group__4__Impl"
    // InternalSecurityDsl.g:3669:1: rule__AuthEndpoint__Group__4__Impl : ( 'method:' ) ;
    public final void rule__AuthEndpoint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3673:1: ( ( 'method:' ) )
            // InternalSecurityDsl.g:3674:1: ( 'method:' )
            {
            // InternalSecurityDsl.g:3674:1: ( 'method:' )
            // InternalSecurityDsl.g:3675:2: 'method:'
            {
             before(grammarAccess.getAuthEndpointAccess().getMethodKeyword_4()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getAuthEndpointAccess().getMethodKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthEndpoint__Group__4__Impl"


    // $ANTLR start "rule__AuthEndpoint__Group__5"
    // InternalSecurityDsl.g:3684:1: rule__AuthEndpoint__Group__5 : rule__AuthEndpoint__Group__5__Impl ;
    public final void rule__AuthEndpoint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3688:1: ( rule__AuthEndpoint__Group__5__Impl )
            // InternalSecurityDsl.g:3689:2: rule__AuthEndpoint__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AuthEndpoint__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthEndpoint__Group__5"


    // $ANTLR start "rule__AuthEndpoint__Group__5__Impl"
    // InternalSecurityDsl.g:3695:1: rule__AuthEndpoint__Group__5__Impl : ( ( rule__AuthEndpoint__MethodAssignment_5 ) ) ;
    public final void rule__AuthEndpoint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3699:1: ( ( ( rule__AuthEndpoint__MethodAssignment_5 ) ) )
            // InternalSecurityDsl.g:3700:1: ( ( rule__AuthEndpoint__MethodAssignment_5 ) )
            {
            // InternalSecurityDsl.g:3700:1: ( ( rule__AuthEndpoint__MethodAssignment_5 ) )
            // InternalSecurityDsl.g:3701:2: ( rule__AuthEndpoint__MethodAssignment_5 )
            {
             before(grammarAccess.getAuthEndpointAccess().getMethodAssignment_5()); 
            // InternalSecurityDsl.g:3702:2: ( rule__AuthEndpoint__MethodAssignment_5 )
            // InternalSecurityDsl.g:3702:3: rule__AuthEndpoint__MethodAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__AuthEndpoint__MethodAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAuthEndpointAccess().getMethodAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthEndpoint__Group__5__Impl"


    // $ANTLR start "rule__Authentication__Group__0"
    // InternalSecurityDsl.g:3711:1: rule__Authentication__Group__0 : rule__Authentication__Group__0__Impl rule__Authentication__Group__1 ;
    public final void rule__Authentication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3715:1: ( rule__Authentication__Group__0__Impl rule__Authentication__Group__1 )
            // InternalSecurityDsl.g:3716:2: rule__Authentication__Group__0__Impl rule__Authentication__Group__1
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
    // InternalSecurityDsl.g:3723:1: rule__Authentication__Group__0__Impl : ( 'name:' ) ;
    public final void rule__Authentication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3727:1: ( ( 'name:' ) )
            // InternalSecurityDsl.g:3728:1: ( 'name:' )
            {
            // InternalSecurityDsl.g:3728:1: ( 'name:' )
            // InternalSecurityDsl.g:3729:2: 'name:'
            {
             before(grammarAccess.getAuthenticationAccess().getNameKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAuthenticationAccess().getNameKeyword_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3738:1: rule__Authentication__Group__1 : rule__Authentication__Group__1__Impl rule__Authentication__Group__2 ;
    public final void rule__Authentication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3742:1: ( rule__Authentication__Group__1__Impl rule__Authentication__Group__2 )
            // InternalSecurityDsl.g:3743:2: rule__Authentication__Group__1__Impl rule__Authentication__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalSecurityDsl.g:3750:1: rule__Authentication__Group__1__Impl : ( ( rule__Authentication__NameAssignment_1 ) ) ;
    public final void rule__Authentication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3754:1: ( ( ( rule__Authentication__NameAssignment_1 ) ) )
            // InternalSecurityDsl.g:3755:1: ( ( rule__Authentication__NameAssignment_1 ) )
            {
            // InternalSecurityDsl.g:3755:1: ( ( rule__Authentication__NameAssignment_1 ) )
            // InternalSecurityDsl.g:3756:2: ( rule__Authentication__NameAssignment_1 )
            {
             before(grammarAccess.getAuthenticationAccess().getNameAssignment_1()); 
            // InternalSecurityDsl.g:3757:2: ( rule__Authentication__NameAssignment_1 )
            // InternalSecurityDsl.g:3757:3: rule__Authentication__NameAssignment_1
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
    // InternalSecurityDsl.g:3765:1: rule__Authentication__Group__2 : rule__Authentication__Group__2__Impl rule__Authentication__Group__3 ;
    public final void rule__Authentication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3769:1: ( rule__Authentication__Group__2__Impl rule__Authentication__Group__3 )
            // InternalSecurityDsl.g:3770:2: rule__Authentication__Group__2__Impl rule__Authentication__Group__3
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
    // InternalSecurityDsl.g:3777:1: rule__Authentication__Group__2__Impl : ( 'path:' ) ;
    public final void rule__Authentication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3781:1: ( ( 'path:' ) )
            // InternalSecurityDsl.g:3782:1: ( 'path:' )
            {
            // InternalSecurityDsl.g:3782:1: ( 'path:' )
            // InternalSecurityDsl.g:3783:2: 'path:'
            {
             before(grammarAccess.getAuthenticationAccess().getPathKeyword_2()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getAuthenticationAccess().getPathKeyword_2()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3792:1: rule__Authentication__Group__3 : rule__Authentication__Group__3__Impl rule__Authentication__Group__4 ;
    public final void rule__Authentication__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3796:1: ( rule__Authentication__Group__3__Impl rule__Authentication__Group__4 )
            // InternalSecurityDsl.g:3797:2: rule__Authentication__Group__3__Impl rule__Authentication__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalSecurityDsl.g:3804:1: rule__Authentication__Group__3__Impl : ( ( rule__Authentication__PathAssignment_3 ) ) ;
    public final void rule__Authentication__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3808:1: ( ( ( rule__Authentication__PathAssignment_3 ) ) )
            // InternalSecurityDsl.g:3809:1: ( ( rule__Authentication__PathAssignment_3 ) )
            {
            // InternalSecurityDsl.g:3809:1: ( ( rule__Authentication__PathAssignment_3 ) )
            // InternalSecurityDsl.g:3810:2: ( rule__Authentication__PathAssignment_3 )
            {
             before(grammarAccess.getAuthenticationAccess().getPathAssignment_3()); 
            // InternalSecurityDsl.g:3811:2: ( rule__Authentication__PathAssignment_3 )
            // InternalSecurityDsl.g:3811:3: rule__Authentication__PathAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Authentication__PathAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAuthenticationAccess().getPathAssignment_3()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3819:1: rule__Authentication__Group__4 : rule__Authentication__Group__4__Impl rule__Authentication__Group__5 ;
    public final void rule__Authentication__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3823:1: ( rule__Authentication__Group__4__Impl rule__Authentication__Group__5 )
            // InternalSecurityDsl.g:3824:2: rule__Authentication__Group__4__Impl rule__Authentication__Group__5
            {
            pushFollow(FOLLOW_29);
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
    // InternalSecurityDsl.g:3831:1: rule__Authentication__Group__4__Impl : ( ( rule__Authentication__Group_4__0 )? ) ;
    public final void rule__Authentication__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3835:1: ( ( ( rule__Authentication__Group_4__0 )? ) )
            // InternalSecurityDsl.g:3836:1: ( ( rule__Authentication__Group_4__0 )? )
            {
            // InternalSecurityDsl.g:3836:1: ( ( rule__Authentication__Group_4__0 )? )
            // InternalSecurityDsl.g:3837:2: ( rule__Authentication__Group_4__0 )?
            {
             before(grammarAccess.getAuthenticationAccess().getGroup_4()); 
            // InternalSecurityDsl.g:3838:2: ( rule__Authentication__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==56) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSecurityDsl.g:3838:3: rule__Authentication__Group_4__0
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
    // InternalSecurityDsl.g:3846:1: rule__Authentication__Group__5 : rule__Authentication__Group__5__Impl rule__Authentication__Group__6 ;
    public final void rule__Authentication__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3850:1: ( rule__Authentication__Group__5__Impl rule__Authentication__Group__6 )
            // InternalSecurityDsl.g:3851:2: rule__Authentication__Group__5__Impl rule__Authentication__Group__6
            {
            pushFollow(FOLLOW_29);
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
    // InternalSecurityDsl.g:3858:1: rule__Authentication__Group__5__Impl : ( ( rule__Authentication__Group_5__0 )? ) ;
    public final void rule__Authentication__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3862:1: ( ( ( rule__Authentication__Group_5__0 )? ) )
            // InternalSecurityDsl.g:3863:1: ( ( rule__Authentication__Group_5__0 )? )
            {
            // InternalSecurityDsl.g:3863:1: ( ( rule__Authentication__Group_5__0 )? )
            // InternalSecurityDsl.g:3864:2: ( rule__Authentication__Group_5__0 )?
            {
             before(grammarAccess.getAuthenticationAccess().getGroup_5()); 
            // InternalSecurityDsl.g:3865:2: ( rule__Authentication__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==57) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSecurityDsl.g:3865:3: rule__Authentication__Group_5__0
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
    // InternalSecurityDsl.g:3873:1: rule__Authentication__Group__6 : rule__Authentication__Group__6__Impl rule__Authentication__Group__7 ;
    public final void rule__Authentication__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3877:1: ( rule__Authentication__Group__6__Impl rule__Authentication__Group__7 )
            // InternalSecurityDsl.g:3878:2: rule__Authentication__Group__6__Impl rule__Authentication__Group__7
            {
            pushFollow(FOLLOW_29);
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
    // InternalSecurityDsl.g:3885:1: rule__Authentication__Group__6__Impl : ( ( rule__Authentication__Group_6__0 )? ) ;
    public final void rule__Authentication__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3889:1: ( ( ( rule__Authentication__Group_6__0 )? ) )
            // InternalSecurityDsl.g:3890:1: ( ( rule__Authentication__Group_6__0 )? )
            {
            // InternalSecurityDsl.g:3890:1: ( ( rule__Authentication__Group_6__0 )? )
            // InternalSecurityDsl.g:3891:2: ( rule__Authentication__Group_6__0 )?
            {
             before(grammarAccess.getAuthenticationAccess().getGroup_6()); 
            // InternalSecurityDsl.g:3892:2: ( rule__Authentication__Group_6__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==58) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSecurityDsl.g:3892:3: rule__Authentication__Group_6__0
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
    // InternalSecurityDsl.g:3900:1: rule__Authentication__Group__7 : rule__Authentication__Group__7__Impl ;
    public final void rule__Authentication__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3904:1: ( rule__Authentication__Group__7__Impl )
            // InternalSecurityDsl.g:3905:2: rule__Authentication__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Authentication__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // InternalSecurityDsl.g:3911:1: rule__Authentication__Group__7__Impl : ( ( rule__Authentication__Group_7__0 )? ) ;
    public final void rule__Authentication__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3915:1: ( ( ( rule__Authentication__Group_7__0 )? ) )
            // InternalSecurityDsl.g:3916:1: ( ( rule__Authentication__Group_7__0 )? )
            {
            // InternalSecurityDsl.g:3916:1: ( ( rule__Authentication__Group_7__0 )? )
            // InternalSecurityDsl.g:3917:2: ( rule__Authentication__Group_7__0 )?
            {
             before(grammarAccess.getAuthenticationAccess().getGroup_7()); 
            // InternalSecurityDsl.g:3918:2: ( rule__Authentication__Group_7__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==59) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSecurityDsl.g:3918:3: rule__Authentication__Group_7__0
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


    // $ANTLR start "rule__Authentication__Group_4__0"
    // InternalSecurityDsl.g:3927:1: rule__Authentication__Group_4__0 : rule__Authentication__Group_4__0__Impl rule__Authentication__Group_4__1 ;
    public final void rule__Authentication__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3931:1: ( rule__Authentication__Group_4__0__Impl rule__Authentication__Group_4__1 )
            // InternalSecurityDsl.g:3932:2: rule__Authentication__Group_4__0__Impl rule__Authentication__Group_4__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalSecurityDsl.g:3939:1: rule__Authentication__Group_4__0__Impl : ( 'signup-url:' ) ;
    public final void rule__Authentication__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3943:1: ( ( 'signup-url:' ) )
            // InternalSecurityDsl.g:3944:1: ( 'signup-url:' )
            {
            // InternalSecurityDsl.g:3944:1: ( 'signup-url:' )
            // InternalSecurityDsl.g:3945:2: 'signup-url:'
            {
             before(grammarAccess.getAuthenticationAccess().getSignupUrlKeyword_4_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getAuthenticationAccess().getSignupUrlKeyword_4_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3954:1: rule__Authentication__Group_4__1 : rule__Authentication__Group_4__1__Impl ;
    public final void rule__Authentication__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3958:1: ( rule__Authentication__Group_4__1__Impl )
            // InternalSecurityDsl.g:3959:2: rule__Authentication__Group_4__1__Impl
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
    // InternalSecurityDsl.g:3965:1: rule__Authentication__Group_4__1__Impl : ( ( rule__Authentication__Signup_endpointAssignment_4_1 ) ) ;
    public final void rule__Authentication__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3969:1: ( ( ( rule__Authentication__Signup_endpointAssignment_4_1 ) ) )
            // InternalSecurityDsl.g:3970:1: ( ( rule__Authentication__Signup_endpointAssignment_4_1 ) )
            {
            // InternalSecurityDsl.g:3970:1: ( ( rule__Authentication__Signup_endpointAssignment_4_1 ) )
            // InternalSecurityDsl.g:3971:2: ( rule__Authentication__Signup_endpointAssignment_4_1 )
            {
             before(grammarAccess.getAuthenticationAccess().getSignup_endpointAssignment_4_1()); 
            // InternalSecurityDsl.g:3972:2: ( rule__Authentication__Signup_endpointAssignment_4_1 )
            // InternalSecurityDsl.g:3972:3: rule__Authentication__Signup_endpointAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Authentication__Signup_endpointAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAuthenticationAccess().getSignup_endpointAssignment_4_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:3981:1: rule__Authentication__Group_5__0 : rule__Authentication__Group_5__0__Impl rule__Authentication__Group_5__1 ;
    public final void rule__Authentication__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3985:1: ( rule__Authentication__Group_5__0__Impl rule__Authentication__Group_5__1 )
            // InternalSecurityDsl.g:3986:2: rule__Authentication__Group_5__0__Impl rule__Authentication__Group_5__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalSecurityDsl.g:3993:1: rule__Authentication__Group_5__0__Impl : ( 'login-url:' ) ;
    public final void rule__Authentication__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:3997:1: ( ( 'login-url:' ) )
            // InternalSecurityDsl.g:3998:1: ( 'login-url:' )
            {
            // InternalSecurityDsl.g:3998:1: ( 'login-url:' )
            // InternalSecurityDsl.g:3999:2: 'login-url:'
            {
             before(grammarAccess.getAuthenticationAccess().getLoginUrlKeyword_5_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getAuthenticationAccess().getLoginUrlKeyword_5_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:4008:1: rule__Authentication__Group_5__1 : rule__Authentication__Group_5__1__Impl ;
    public final void rule__Authentication__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4012:1: ( rule__Authentication__Group_5__1__Impl )
            // InternalSecurityDsl.g:4013:2: rule__Authentication__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Authentication__Group_5__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalSecurityDsl.g:4019:1: rule__Authentication__Group_5__1__Impl : ( ( rule__Authentication__Login_endpointAssignment_5_1 ) ) ;
    public final void rule__Authentication__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4023:1: ( ( ( rule__Authentication__Login_endpointAssignment_5_1 ) ) )
            // InternalSecurityDsl.g:4024:1: ( ( rule__Authentication__Login_endpointAssignment_5_1 ) )
            {
            // InternalSecurityDsl.g:4024:1: ( ( rule__Authentication__Login_endpointAssignment_5_1 ) )
            // InternalSecurityDsl.g:4025:2: ( rule__Authentication__Login_endpointAssignment_5_1 )
            {
             before(grammarAccess.getAuthenticationAccess().getLogin_endpointAssignment_5_1()); 
            // InternalSecurityDsl.g:4026:2: ( rule__Authentication__Login_endpointAssignment_5_1 )
            // InternalSecurityDsl.g:4026:3: rule__Authentication__Login_endpointAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Authentication__Login_endpointAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAuthenticationAccess().getLogin_endpointAssignment_5_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Authentication__Group_6__0"
    // InternalSecurityDsl.g:4035:1: rule__Authentication__Group_6__0 : rule__Authentication__Group_6__0__Impl rule__Authentication__Group_6__1 ;
    public final void rule__Authentication__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4039:1: ( rule__Authentication__Group_6__0__Impl rule__Authentication__Group_6__1 )
            // InternalSecurityDsl.g:4040:2: rule__Authentication__Group_6__0__Impl rule__Authentication__Group_6__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalSecurityDsl.g:4047:1: rule__Authentication__Group_6__0__Impl : ( 'logout-url:' ) ;
    public final void rule__Authentication__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4051:1: ( ( 'logout-url:' ) )
            // InternalSecurityDsl.g:4052:1: ( 'logout-url:' )
            {
            // InternalSecurityDsl.g:4052:1: ( 'logout-url:' )
            // InternalSecurityDsl.g:4053:2: 'logout-url:'
            {
             before(grammarAccess.getAuthenticationAccess().getLogoutUrlKeyword_6_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getAuthenticationAccess().getLogoutUrlKeyword_6_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:4062:1: rule__Authentication__Group_6__1 : rule__Authentication__Group_6__1__Impl ;
    public final void rule__Authentication__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4066:1: ( rule__Authentication__Group_6__1__Impl )
            // InternalSecurityDsl.g:4067:2: rule__Authentication__Group_6__1__Impl
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
    // InternalSecurityDsl.g:4073:1: rule__Authentication__Group_6__1__Impl : ( ( rule__Authentication__Logout_endpointAssignment_6_1 ) ) ;
    public final void rule__Authentication__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4077:1: ( ( ( rule__Authentication__Logout_endpointAssignment_6_1 ) ) )
            // InternalSecurityDsl.g:4078:1: ( ( rule__Authentication__Logout_endpointAssignment_6_1 ) )
            {
            // InternalSecurityDsl.g:4078:1: ( ( rule__Authentication__Logout_endpointAssignment_6_1 ) )
            // InternalSecurityDsl.g:4079:2: ( rule__Authentication__Logout_endpointAssignment_6_1 )
            {
             before(grammarAccess.getAuthenticationAccess().getLogout_endpointAssignment_6_1()); 
            // InternalSecurityDsl.g:4080:2: ( rule__Authentication__Logout_endpointAssignment_6_1 )
            // InternalSecurityDsl.g:4080:3: rule__Authentication__Logout_endpointAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Authentication__Logout_endpointAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getAuthenticationAccess().getLogout_endpointAssignment_6_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:4089:1: rule__Authentication__Group_7__0 : rule__Authentication__Group_7__0__Impl rule__Authentication__Group_7__1 ;
    public final void rule__Authentication__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4093:1: ( rule__Authentication__Group_7__0__Impl rule__Authentication__Group_7__1 )
            // InternalSecurityDsl.g:4094:2: rule__Authentication__Group_7__0__Impl rule__Authentication__Group_7__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSecurityDsl.g:4101:1: rule__Authentication__Group_7__0__Impl : ( 'endpoints:' ) ;
    public final void rule__Authentication__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4105:1: ( ( 'endpoints:' ) )
            // InternalSecurityDsl.g:4106:1: ( 'endpoints:' )
            {
            // InternalSecurityDsl.g:4106:1: ( 'endpoints:' )
            // InternalSecurityDsl.g:4107:2: 'endpoints:'
            {
             before(grammarAccess.getAuthenticationAccess().getEndpointsKeyword_7_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getAuthenticationAccess().getEndpointsKeyword_7_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:4116:1: rule__Authentication__Group_7__1 : rule__Authentication__Group_7__1__Impl rule__Authentication__Group_7__2 ;
    public final void rule__Authentication__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4120:1: ( rule__Authentication__Group_7__1__Impl rule__Authentication__Group_7__2 )
            // InternalSecurityDsl.g:4121:2: rule__Authentication__Group_7__1__Impl rule__Authentication__Group_7__2
            {
            pushFollow(FOLLOW_12);
            rule__Authentication__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Authentication__Group_7__2();

            state._fsp--;


            }

        }
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
    // InternalSecurityDsl.g:4128:1: rule__Authentication__Group_7__1__Impl : ( '[' ) ;
    public final void rule__Authentication__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4132:1: ( ( '[' ) )
            // InternalSecurityDsl.g:4133:1: ( '[' )
            {
            // InternalSecurityDsl.g:4133:1: ( '[' )
            // InternalSecurityDsl.g:4134:2: '['
            {
             before(grammarAccess.getAuthenticationAccess().getLeftSquareBracketKeyword_7_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAuthenticationAccess().getLeftSquareBracketKeyword_7_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Authentication__Group_7__2"
    // InternalSecurityDsl.g:4143:1: rule__Authentication__Group_7__2 : rule__Authentication__Group_7__2__Impl rule__Authentication__Group_7__3 ;
    public final void rule__Authentication__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4147:1: ( rule__Authentication__Group_7__2__Impl rule__Authentication__Group_7__3 )
            // InternalSecurityDsl.g:4148:2: rule__Authentication__Group_7__2__Impl rule__Authentication__Group_7__3
            {
            pushFollow(FOLLOW_13);
            rule__Authentication__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Authentication__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group_7__2"


    // $ANTLR start "rule__Authentication__Group_7__2__Impl"
    // InternalSecurityDsl.g:4155:1: rule__Authentication__Group_7__2__Impl : ( ( rule__Authentication__Controller_endpointsAssignment_7_2 ) ) ;
    public final void rule__Authentication__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4159:1: ( ( ( rule__Authentication__Controller_endpointsAssignment_7_2 ) ) )
            // InternalSecurityDsl.g:4160:1: ( ( rule__Authentication__Controller_endpointsAssignment_7_2 ) )
            {
            // InternalSecurityDsl.g:4160:1: ( ( rule__Authentication__Controller_endpointsAssignment_7_2 ) )
            // InternalSecurityDsl.g:4161:2: ( rule__Authentication__Controller_endpointsAssignment_7_2 )
            {
             before(grammarAccess.getAuthenticationAccess().getController_endpointsAssignment_7_2()); 
            // InternalSecurityDsl.g:4162:2: ( rule__Authentication__Controller_endpointsAssignment_7_2 )
            // InternalSecurityDsl.g:4162:3: rule__Authentication__Controller_endpointsAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Authentication__Controller_endpointsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getAuthenticationAccess().getController_endpointsAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group_7__2__Impl"


    // $ANTLR start "rule__Authentication__Group_7__3"
    // InternalSecurityDsl.g:4170:1: rule__Authentication__Group_7__3 : rule__Authentication__Group_7__3__Impl rule__Authentication__Group_7__4 ;
    public final void rule__Authentication__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4174:1: ( rule__Authentication__Group_7__3__Impl rule__Authentication__Group_7__4 )
            // InternalSecurityDsl.g:4175:2: rule__Authentication__Group_7__3__Impl rule__Authentication__Group_7__4
            {
            pushFollow(FOLLOW_13);
            rule__Authentication__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Authentication__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group_7__3"


    // $ANTLR start "rule__Authentication__Group_7__3__Impl"
    // InternalSecurityDsl.g:4182:1: rule__Authentication__Group_7__3__Impl : ( ( rule__Authentication__Group_7_3__0 )* ) ;
    public final void rule__Authentication__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4186:1: ( ( ( rule__Authentication__Group_7_3__0 )* ) )
            // InternalSecurityDsl.g:4187:1: ( ( rule__Authentication__Group_7_3__0 )* )
            {
            // InternalSecurityDsl.g:4187:1: ( ( rule__Authentication__Group_7_3__0 )* )
            // InternalSecurityDsl.g:4188:2: ( rule__Authentication__Group_7_3__0 )*
            {
             before(grammarAccess.getAuthenticationAccess().getGroup_7_3()); 
            // InternalSecurityDsl.g:4189:2: ( rule__Authentication__Group_7_3__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==41) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalSecurityDsl.g:4189:3: rule__Authentication__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Authentication__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getAuthenticationAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group_7__3__Impl"


    // $ANTLR start "rule__Authentication__Group_7__4"
    // InternalSecurityDsl.g:4197:1: rule__Authentication__Group_7__4 : rule__Authentication__Group_7__4__Impl ;
    public final void rule__Authentication__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4201:1: ( rule__Authentication__Group_7__4__Impl )
            // InternalSecurityDsl.g:4202:2: rule__Authentication__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Authentication__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group_7__4"


    // $ANTLR start "rule__Authentication__Group_7__4__Impl"
    // InternalSecurityDsl.g:4208:1: rule__Authentication__Group_7__4__Impl : ( ']' ) ;
    public final void rule__Authentication__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4212:1: ( ( ']' ) )
            // InternalSecurityDsl.g:4213:1: ( ']' )
            {
            // InternalSecurityDsl.g:4213:1: ( ']' )
            // InternalSecurityDsl.g:4214:2: ']'
            {
             before(grammarAccess.getAuthenticationAccess().getRightSquareBracketKeyword_7_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAuthenticationAccess().getRightSquareBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group_7__4__Impl"


    // $ANTLR start "rule__Authentication__Group_7_3__0"
    // InternalSecurityDsl.g:4224:1: rule__Authentication__Group_7_3__0 : rule__Authentication__Group_7_3__0__Impl rule__Authentication__Group_7_3__1 ;
    public final void rule__Authentication__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4228:1: ( rule__Authentication__Group_7_3__0__Impl rule__Authentication__Group_7_3__1 )
            // InternalSecurityDsl.g:4229:2: rule__Authentication__Group_7_3__0__Impl rule__Authentication__Group_7_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Authentication__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Authentication__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group_7_3__0"


    // $ANTLR start "rule__Authentication__Group_7_3__0__Impl"
    // InternalSecurityDsl.g:4236:1: rule__Authentication__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Authentication__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4240:1: ( ( ',' ) )
            // InternalSecurityDsl.g:4241:1: ( ',' )
            {
            // InternalSecurityDsl.g:4241:1: ( ',' )
            // InternalSecurityDsl.g:4242:2: ','
            {
             before(grammarAccess.getAuthenticationAccess().getCommaKeyword_7_3_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAuthenticationAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group_7_3__0__Impl"


    // $ANTLR start "rule__Authentication__Group_7_3__1"
    // InternalSecurityDsl.g:4251:1: rule__Authentication__Group_7_3__1 : rule__Authentication__Group_7_3__1__Impl ;
    public final void rule__Authentication__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4255:1: ( rule__Authentication__Group_7_3__1__Impl )
            // InternalSecurityDsl.g:4256:2: rule__Authentication__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Authentication__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group_7_3__1"


    // $ANTLR start "rule__Authentication__Group_7_3__1__Impl"
    // InternalSecurityDsl.g:4262:1: rule__Authentication__Group_7_3__1__Impl : ( ( rule__Authentication__Controller_endpointsAssignment_7_3_1 ) ) ;
    public final void rule__Authentication__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4266:1: ( ( ( rule__Authentication__Controller_endpointsAssignment_7_3_1 ) ) )
            // InternalSecurityDsl.g:4267:1: ( ( rule__Authentication__Controller_endpointsAssignment_7_3_1 ) )
            {
            // InternalSecurityDsl.g:4267:1: ( ( rule__Authentication__Controller_endpointsAssignment_7_3_1 ) )
            // InternalSecurityDsl.g:4268:2: ( rule__Authentication__Controller_endpointsAssignment_7_3_1 )
            {
             before(grammarAccess.getAuthenticationAccess().getController_endpointsAssignment_7_3_1()); 
            // InternalSecurityDsl.g:4269:2: ( rule__Authentication__Controller_endpointsAssignment_7_3_1 )
            // InternalSecurityDsl.g:4269:3: rule__Authentication__Controller_endpointsAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Authentication__Controller_endpointsAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAuthenticationAccess().getController_endpointsAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Group_7_3__1__Impl"


    // $ANTLR start "rule__OtherController__Group__0"
    // InternalSecurityDsl.g:4278:1: rule__OtherController__Group__0 : rule__OtherController__Group__0__Impl rule__OtherController__Group__1 ;
    public final void rule__OtherController__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4282:1: ( rule__OtherController__Group__0__Impl rule__OtherController__Group__1 )
            // InternalSecurityDsl.g:4283:2: rule__OtherController__Group__0__Impl rule__OtherController__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSecurityDsl.g:4290:1: rule__OtherController__Group__0__Impl : ( '{' ) ;
    public final void rule__OtherController__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4294:1: ( ( '{' ) )
            // InternalSecurityDsl.g:4295:1: ( '{' )
            {
            // InternalSecurityDsl.g:4295:1: ( '{' )
            // InternalSecurityDsl.g:4296:2: '{'
            {
             before(grammarAccess.getOtherControllerAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getOtherControllerAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:4305:1: rule__OtherController__Group__1 : rule__OtherController__Group__1__Impl rule__OtherController__Group__2 ;
    public final void rule__OtherController__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4309:1: ( rule__OtherController__Group__1__Impl rule__OtherController__Group__2 )
            // InternalSecurityDsl.g:4310:2: rule__OtherController__Group__1__Impl rule__OtherController__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSecurityDsl.g:4317:1: rule__OtherController__Group__1__Impl : ( 'name:' ) ;
    public final void rule__OtherController__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4321:1: ( ( 'name:' ) )
            // InternalSecurityDsl.g:4322:1: ( 'name:' )
            {
            // InternalSecurityDsl.g:4322:1: ( 'name:' )
            // InternalSecurityDsl.g:4323:2: 'name:'
            {
             before(grammarAccess.getOtherControllerAccess().getNameKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getOtherControllerAccess().getNameKeyword_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:4332:1: rule__OtherController__Group__2 : rule__OtherController__Group__2__Impl rule__OtherController__Group__3 ;
    public final void rule__OtherController__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4336:1: ( rule__OtherController__Group__2__Impl rule__OtherController__Group__3 )
            // InternalSecurityDsl.g:4337:2: rule__OtherController__Group__2__Impl rule__OtherController__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalSecurityDsl.g:4344:1: rule__OtherController__Group__2__Impl : ( ( rule__OtherController__NameAssignment_2 ) ) ;
    public final void rule__OtherController__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4348:1: ( ( ( rule__OtherController__NameAssignment_2 ) ) )
            // InternalSecurityDsl.g:4349:1: ( ( rule__OtherController__NameAssignment_2 ) )
            {
            // InternalSecurityDsl.g:4349:1: ( ( rule__OtherController__NameAssignment_2 ) )
            // InternalSecurityDsl.g:4350:2: ( rule__OtherController__NameAssignment_2 )
            {
             before(grammarAccess.getOtherControllerAccess().getNameAssignment_2()); 
            // InternalSecurityDsl.g:4351:2: ( rule__OtherController__NameAssignment_2 )
            // InternalSecurityDsl.g:4351:3: rule__OtherController__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OtherController__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOtherControllerAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:4359:1: rule__OtherController__Group__3 : rule__OtherController__Group__3__Impl rule__OtherController__Group__4 ;
    public final void rule__OtherController__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4363:1: ( rule__OtherController__Group__3__Impl rule__OtherController__Group__4 )
            // InternalSecurityDsl.g:4364:2: rule__OtherController__Group__3__Impl rule__OtherController__Group__4
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
    // InternalSecurityDsl.g:4371:1: rule__OtherController__Group__3__Impl : ( 'path:' ) ;
    public final void rule__OtherController__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4375:1: ( ( 'path:' ) )
            // InternalSecurityDsl.g:4376:1: ( 'path:' )
            {
            // InternalSecurityDsl.g:4376:1: ( 'path:' )
            // InternalSecurityDsl.g:4377:2: 'path:'
            {
             before(grammarAccess.getOtherControllerAccess().getPathKeyword_3()); 
            match(input,55,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4386:1: rule__OtherController__Group__4 : rule__OtherController__Group__4__Impl rule__OtherController__Group__5 ;
    public final void rule__OtherController__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4390:1: ( rule__OtherController__Group__4__Impl rule__OtherController__Group__5 )
            // InternalSecurityDsl.g:4391:2: rule__OtherController__Group__4__Impl rule__OtherController__Group__5
            {
            pushFollow(FOLLOW_30);
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
    // InternalSecurityDsl.g:4398:1: rule__OtherController__Group__4__Impl : ( ( rule__OtherController__PathAssignment_4 ) ) ;
    public final void rule__OtherController__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4402:1: ( ( ( rule__OtherController__PathAssignment_4 ) ) )
            // InternalSecurityDsl.g:4403:1: ( ( rule__OtherController__PathAssignment_4 ) )
            {
            // InternalSecurityDsl.g:4403:1: ( ( rule__OtherController__PathAssignment_4 ) )
            // InternalSecurityDsl.g:4404:2: ( rule__OtherController__PathAssignment_4 )
            {
             before(grammarAccess.getOtherControllerAccess().getPathAssignment_4()); 
            // InternalSecurityDsl.g:4405:2: ( rule__OtherController__PathAssignment_4 )
            // InternalSecurityDsl.g:4405:3: rule__OtherController__PathAssignment_4
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
    // InternalSecurityDsl.g:4413:1: rule__OtherController__Group__5 : rule__OtherController__Group__5__Impl rule__OtherController__Group__6 ;
    public final void rule__OtherController__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4417:1: ( rule__OtherController__Group__5__Impl rule__OtherController__Group__6 )
            // InternalSecurityDsl.g:4418:2: rule__OtherController__Group__5__Impl rule__OtherController__Group__6
            {
            pushFollow(FOLLOW_30);
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
    // InternalSecurityDsl.g:4425:1: rule__OtherController__Group__5__Impl : ( ( rule__OtherController__Group_5__0 )? ) ;
    public final void rule__OtherController__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4429:1: ( ( ( rule__OtherController__Group_5__0 )? ) )
            // InternalSecurityDsl.g:4430:1: ( ( rule__OtherController__Group_5__0 )? )
            {
            // InternalSecurityDsl.g:4430:1: ( ( rule__OtherController__Group_5__0 )? )
            // InternalSecurityDsl.g:4431:2: ( rule__OtherController__Group_5__0 )?
            {
             before(grammarAccess.getOtherControllerAccess().getGroup_5()); 
            // InternalSecurityDsl.g:4432:2: ( rule__OtherController__Group_5__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==59) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSecurityDsl.g:4432:3: rule__OtherController__Group_5__0
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
    // InternalSecurityDsl.g:4440:1: rule__OtherController__Group__6 : rule__OtherController__Group__6__Impl ;
    public final void rule__OtherController__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4444:1: ( rule__OtherController__Group__6__Impl )
            // InternalSecurityDsl.g:4445:2: rule__OtherController__Group__6__Impl
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
    // InternalSecurityDsl.g:4451:1: rule__OtherController__Group__6__Impl : ( '}' ) ;
    public final void rule__OtherController__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4455:1: ( ( '}' ) )
            // InternalSecurityDsl.g:4456:1: ( '}' )
            {
            // InternalSecurityDsl.g:4456:1: ( '}' )
            // InternalSecurityDsl.g:4457:2: '}'
            {
             before(grammarAccess.getOtherControllerAccess().getRightCurlyBracketKeyword_6()); 
            match(input,50,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4467:1: rule__OtherController__Group_5__0 : rule__OtherController__Group_5__0__Impl rule__OtherController__Group_5__1 ;
    public final void rule__OtherController__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4471:1: ( rule__OtherController__Group_5__0__Impl rule__OtherController__Group_5__1 )
            // InternalSecurityDsl.g:4472:2: rule__OtherController__Group_5__0__Impl rule__OtherController__Group_5__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSecurityDsl.g:4479:1: rule__OtherController__Group_5__0__Impl : ( 'endpoints:' ) ;
    public final void rule__OtherController__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4483:1: ( ( 'endpoints:' ) )
            // InternalSecurityDsl.g:4484:1: ( 'endpoints:' )
            {
            // InternalSecurityDsl.g:4484:1: ( 'endpoints:' )
            // InternalSecurityDsl.g:4485:2: 'endpoints:'
            {
             before(grammarAccess.getOtherControllerAccess().getEndpointsKeyword_5_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getOtherControllerAccess().getEndpointsKeyword_5_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:4494:1: rule__OtherController__Group_5__1 : rule__OtherController__Group_5__1__Impl rule__OtherController__Group_5__2 ;
    public final void rule__OtherController__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4498:1: ( rule__OtherController__Group_5__1__Impl rule__OtherController__Group_5__2 )
            // InternalSecurityDsl.g:4499:2: rule__OtherController__Group_5__1__Impl rule__OtherController__Group_5__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalSecurityDsl.g:4506:1: rule__OtherController__Group_5__1__Impl : ( '[' ) ;
    public final void rule__OtherController__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4510:1: ( ( '[' ) )
            // InternalSecurityDsl.g:4511:1: ( '[' )
            {
            // InternalSecurityDsl.g:4511:1: ( '[' )
            // InternalSecurityDsl.g:4512:2: '['
            {
             before(grammarAccess.getOtherControllerAccess().getLeftSquareBracketKeyword_5_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getOtherControllerAccess().getLeftSquareBracketKeyword_5_1()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:4521:1: rule__OtherController__Group_5__2 : rule__OtherController__Group_5__2__Impl rule__OtherController__Group_5__3 ;
    public final void rule__OtherController__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4525:1: ( rule__OtherController__Group_5__2__Impl rule__OtherController__Group_5__3 )
            // InternalSecurityDsl.g:4526:2: rule__OtherController__Group_5__2__Impl rule__OtherController__Group_5__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalSecurityDsl.g:4533:1: rule__OtherController__Group_5__2__Impl : ( ( rule__OtherController__Controller_endpointsAssignment_5_2 ) ) ;
    public final void rule__OtherController__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4537:1: ( ( ( rule__OtherController__Controller_endpointsAssignment_5_2 ) ) )
            // InternalSecurityDsl.g:4538:1: ( ( rule__OtherController__Controller_endpointsAssignment_5_2 ) )
            {
            // InternalSecurityDsl.g:4538:1: ( ( rule__OtherController__Controller_endpointsAssignment_5_2 ) )
            // InternalSecurityDsl.g:4539:2: ( rule__OtherController__Controller_endpointsAssignment_5_2 )
            {
             before(grammarAccess.getOtherControllerAccess().getController_endpointsAssignment_5_2()); 
            // InternalSecurityDsl.g:4540:2: ( rule__OtherController__Controller_endpointsAssignment_5_2 )
            // InternalSecurityDsl.g:4540:3: rule__OtherController__Controller_endpointsAssignment_5_2
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
    // InternalSecurityDsl.g:4548:1: rule__OtherController__Group_5__3 : rule__OtherController__Group_5__3__Impl rule__OtherController__Group_5__4 ;
    public final void rule__OtherController__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4552:1: ( rule__OtherController__Group_5__3__Impl rule__OtherController__Group_5__4 )
            // InternalSecurityDsl.g:4553:2: rule__OtherController__Group_5__3__Impl rule__OtherController__Group_5__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalSecurityDsl.g:4560:1: rule__OtherController__Group_5__3__Impl : ( ( rule__OtherController__Group_5_3__0 )* ) ;
    public final void rule__OtherController__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4564:1: ( ( ( rule__OtherController__Group_5_3__0 )* ) )
            // InternalSecurityDsl.g:4565:1: ( ( rule__OtherController__Group_5_3__0 )* )
            {
            // InternalSecurityDsl.g:4565:1: ( ( rule__OtherController__Group_5_3__0 )* )
            // InternalSecurityDsl.g:4566:2: ( rule__OtherController__Group_5_3__0 )*
            {
             before(grammarAccess.getOtherControllerAccess().getGroup_5_3()); 
            // InternalSecurityDsl.g:4567:2: ( rule__OtherController__Group_5_3__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==41) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSecurityDsl.g:4567:3: rule__OtherController__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__OtherController__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalSecurityDsl.g:4575:1: rule__OtherController__Group_5__4 : rule__OtherController__Group_5__4__Impl ;
    public final void rule__OtherController__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4579:1: ( rule__OtherController__Group_5__4__Impl )
            // InternalSecurityDsl.g:4580:2: rule__OtherController__Group_5__4__Impl
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
    // InternalSecurityDsl.g:4586:1: rule__OtherController__Group_5__4__Impl : ( ']' ) ;
    public final void rule__OtherController__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4590:1: ( ( ']' ) )
            // InternalSecurityDsl.g:4591:1: ( ']' )
            {
            // InternalSecurityDsl.g:4591:1: ( ']' )
            // InternalSecurityDsl.g:4592:2: ']'
            {
             before(grammarAccess.getOtherControllerAccess().getRightSquareBracketKeyword_5_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getOtherControllerAccess().getRightSquareBracketKeyword_5_4()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:4602:1: rule__OtherController__Group_5_3__0 : rule__OtherController__Group_5_3__0__Impl rule__OtherController__Group_5_3__1 ;
    public final void rule__OtherController__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4606:1: ( rule__OtherController__Group_5_3__0__Impl rule__OtherController__Group_5_3__1 )
            // InternalSecurityDsl.g:4607:2: rule__OtherController__Group_5_3__0__Impl rule__OtherController__Group_5_3__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalSecurityDsl.g:4614:1: rule__OtherController__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__OtherController__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4618:1: ( ( ',' ) )
            // InternalSecurityDsl.g:4619:1: ( ',' )
            {
            // InternalSecurityDsl.g:4619:1: ( ',' )
            // InternalSecurityDsl.g:4620:2: ','
            {
             before(grammarAccess.getOtherControllerAccess().getCommaKeyword_5_3_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4629:1: rule__OtherController__Group_5_3__1 : rule__OtherController__Group_5_3__1__Impl ;
    public final void rule__OtherController__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4633:1: ( rule__OtherController__Group_5_3__1__Impl )
            // InternalSecurityDsl.g:4634:2: rule__OtherController__Group_5_3__1__Impl
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
    // InternalSecurityDsl.g:4640:1: rule__OtherController__Group_5_3__1__Impl : ( ( rule__OtherController__Controller_endpointsAssignment_5_3_1 ) ) ;
    public final void rule__OtherController__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4644:1: ( ( ( rule__OtherController__Controller_endpointsAssignment_5_3_1 ) ) )
            // InternalSecurityDsl.g:4645:1: ( ( rule__OtherController__Controller_endpointsAssignment_5_3_1 ) )
            {
            // InternalSecurityDsl.g:4645:1: ( ( rule__OtherController__Controller_endpointsAssignment_5_3_1 ) )
            // InternalSecurityDsl.g:4646:2: ( rule__OtherController__Controller_endpointsAssignment_5_3_1 )
            {
             before(grammarAccess.getOtherControllerAccess().getController_endpointsAssignment_5_3_1()); 
            // InternalSecurityDsl.g:4647:2: ( rule__OtherController__Controller_endpointsAssignment_5_3_1 )
            // InternalSecurityDsl.g:4647:3: rule__OtherController__Controller_endpointsAssignment_5_3_1
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
    // InternalSecurityDsl.g:4656:1: rule__JwtSecurity__Group__0 : rule__JwtSecurity__Group__0__Impl rule__JwtSecurity__Group__1 ;
    public final void rule__JwtSecurity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4660:1: ( rule__JwtSecurity__Group__0__Impl rule__JwtSecurity__Group__1 )
            // InternalSecurityDsl.g:4661:2: rule__JwtSecurity__Group__0__Impl rule__JwtSecurity__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalSecurityDsl.g:4668:1: rule__JwtSecurity__Group__0__Impl : ( 'mechanism:' ) ;
    public final void rule__JwtSecurity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4672:1: ( ( 'mechanism:' ) )
            // InternalSecurityDsl.g:4673:1: ( 'mechanism:' )
            {
            // InternalSecurityDsl.g:4673:1: ( 'mechanism:' )
            // InternalSecurityDsl.g:4674:2: 'mechanism:'
            {
             before(grammarAccess.getJwtSecurityAccess().getMechanismKeyword_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4683:1: rule__JwtSecurity__Group__1 : rule__JwtSecurity__Group__1__Impl rule__JwtSecurity__Group__2 ;
    public final void rule__JwtSecurity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4687:1: ( rule__JwtSecurity__Group__1__Impl rule__JwtSecurity__Group__2 )
            // InternalSecurityDsl.g:4688:2: rule__JwtSecurity__Group__1__Impl rule__JwtSecurity__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalSecurityDsl.g:4695:1: rule__JwtSecurity__Group__1__Impl : ( ( rule__JwtSecurity__MechanismAssignment_1 ) ) ;
    public final void rule__JwtSecurity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4699:1: ( ( ( rule__JwtSecurity__MechanismAssignment_1 ) ) )
            // InternalSecurityDsl.g:4700:1: ( ( rule__JwtSecurity__MechanismAssignment_1 ) )
            {
            // InternalSecurityDsl.g:4700:1: ( ( rule__JwtSecurity__MechanismAssignment_1 ) )
            // InternalSecurityDsl.g:4701:2: ( rule__JwtSecurity__MechanismAssignment_1 )
            {
             before(grammarAccess.getJwtSecurityAccess().getMechanismAssignment_1()); 
            // InternalSecurityDsl.g:4702:2: ( rule__JwtSecurity__MechanismAssignment_1 )
            // InternalSecurityDsl.g:4702:3: rule__JwtSecurity__MechanismAssignment_1
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
    // InternalSecurityDsl.g:4710:1: rule__JwtSecurity__Group__2 : rule__JwtSecurity__Group__2__Impl rule__JwtSecurity__Group__3 ;
    public final void rule__JwtSecurity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4714:1: ( rule__JwtSecurity__Group__2__Impl rule__JwtSecurity__Group__3 )
            // InternalSecurityDsl.g:4715:2: rule__JwtSecurity__Group__2__Impl rule__JwtSecurity__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalSecurityDsl.g:4722:1: rule__JwtSecurity__Group__2__Impl : ( 'jwt:' ) ;
    public final void rule__JwtSecurity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4726:1: ( ( 'jwt:' ) )
            // InternalSecurityDsl.g:4727:1: ( 'jwt:' )
            {
            // InternalSecurityDsl.g:4727:1: ( 'jwt:' )
            // InternalSecurityDsl.g:4728:2: 'jwt:'
            {
             before(grammarAccess.getJwtSecurityAccess().getJwtKeyword_2()); 
            match(input,61,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4737:1: rule__JwtSecurity__Group__3 : rule__JwtSecurity__Group__3__Impl rule__JwtSecurity__Group__4 ;
    public final void rule__JwtSecurity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4741:1: ( rule__JwtSecurity__Group__3__Impl rule__JwtSecurity__Group__4 )
            // InternalSecurityDsl.g:4742:2: rule__JwtSecurity__Group__3__Impl rule__JwtSecurity__Group__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalSecurityDsl.g:4749:1: rule__JwtSecurity__Group__3__Impl : ( 'header:' ) ;
    public final void rule__JwtSecurity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4753:1: ( ( 'header:' ) )
            // InternalSecurityDsl.g:4754:1: ( 'header:' )
            {
            // InternalSecurityDsl.g:4754:1: ( 'header:' )
            // InternalSecurityDsl.g:4755:2: 'header:'
            {
             before(grammarAccess.getJwtSecurityAccess().getHeaderKeyword_3()); 
            match(input,62,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4764:1: rule__JwtSecurity__Group__4 : rule__JwtSecurity__Group__4__Impl rule__JwtSecurity__Group__5 ;
    public final void rule__JwtSecurity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4768:1: ( rule__JwtSecurity__Group__4__Impl rule__JwtSecurity__Group__5 )
            // InternalSecurityDsl.g:4769:2: rule__JwtSecurity__Group__4__Impl rule__JwtSecurity__Group__5
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
    // InternalSecurityDsl.g:4776:1: rule__JwtSecurity__Group__4__Impl : ( 'signature-algorithm:' ) ;
    public final void rule__JwtSecurity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4780:1: ( ( 'signature-algorithm:' ) )
            // InternalSecurityDsl.g:4781:1: ( 'signature-algorithm:' )
            {
            // InternalSecurityDsl.g:4781:1: ( 'signature-algorithm:' )
            // InternalSecurityDsl.g:4782:2: 'signature-algorithm:'
            {
             before(grammarAccess.getJwtSecurityAccess().getSignatureAlgorithmKeyword_4()); 
            match(input,63,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4791:1: rule__JwtSecurity__Group__5 : rule__JwtSecurity__Group__5__Impl rule__JwtSecurity__Group__6 ;
    public final void rule__JwtSecurity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4795:1: ( rule__JwtSecurity__Group__5__Impl rule__JwtSecurity__Group__6 )
            // InternalSecurityDsl.g:4796:2: rule__JwtSecurity__Group__5__Impl rule__JwtSecurity__Group__6
            {
            pushFollow(FOLLOW_35);
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
    // InternalSecurityDsl.g:4803:1: rule__JwtSecurity__Group__5__Impl : ( ( rule__JwtSecurity__SignatureAlgorithmAssignment_5 ) ) ;
    public final void rule__JwtSecurity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4807:1: ( ( ( rule__JwtSecurity__SignatureAlgorithmAssignment_5 ) ) )
            // InternalSecurityDsl.g:4808:1: ( ( rule__JwtSecurity__SignatureAlgorithmAssignment_5 ) )
            {
            // InternalSecurityDsl.g:4808:1: ( ( rule__JwtSecurity__SignatureAlgorithmAssignment_5 ) )
            // InternalSecurityDsl.g:4809:2: ( rule__JwtSecurity__SignatureAlgorithmAssignment_5 )
            {
             before(grammarAccess.getJwtSecurityAccess().getSignatureAlgorithmAssignment_5()); 
            // InternalSecurityDsl.g:4810:2: ( rule__JwtSecurity__SignatureAlgorithmAssignment_5 )
            // InternalSecurityDsl.g:4810:3: rule__JwtSecurity__SignatureAlgorithmAssignment_5
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
    // InternalSecurityDsl.g:4818:1: rule__JwtSecurity__Group__6 : rule__JwtSecurity__Group__6__Impl rule__JwtSecurity__Group__7 ;
    public final void rule__JwtSecurity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4822:1: ( rule__JwtSecurity__Group__6__Impl rule__JwtSecurity__Group__7 )
            // InternalSecurityDsl.g:4823:2: rule__JwtSecurity__Group__6__Impl rule__JwtSecurity__Group__7
            {
            pushFollow(FOLLOW_36);
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
    // InternalSecurityDsl.g:4830:1: rule__JwtSecurity__Group__6__Impl : ( 'payload:' ) ;
    public final void rule__JwtSecurity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4834:1: ( ( 'payload:' ) )
            // InternalSecurityDsl.g:4835:1: ( 'payload:' )
            {
            // InternalSecurityDsl.g:4835:1: ( 'payload:' )
            // InternalSecurityDsl.g:4836:2: 'payload:'
            {
             before(grammarAccess.getJwtSecurityAccess().getPayloadKeyword_6()); 
            match(input,64,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4845:1: rule__JwtSecurity__Group__7 : rule__JwtSecurity__Group__7__Impl rule__JwtSecurity__Group__8 ;
    public final void rule__JwtSecurity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4849:1: ( rule__JwtSecurity__Group__7__Impl rule__JwtSecurity__Group__8 )
            // InternalSecurityDsl.g:4850:2: rule__JwtSecurity__Group__7__Impl rule__JwtSecurity__Group__8
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
    // InternalSecurityDsl.g:4857:1: rule__JwtSecurity__Group__7__Impl : ( 'issuer:' ) ;
    public final void rule__JwtSecurity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4861:1: ( ( 'issuer:' ) )
            // InternalSecurityDsl.g:4862:1: ( 'issuer:' )
            {
            // InternalSecurityDsl.g:4862:1: ( 'issuer:' )
            // InternalSecurityDsl.g:4863:2: 'issuer:'
            {
             before(grammarAccess.getJwtSecurityAccess().getIssuerKeyword_7()); 
            match(input,65,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4872:1: rule__JwtSecurity__Group__8 : rule__JwtSecurity__Group__8__Impl rule__JwtSecurity__Group__9 ;
    public final void rule__JwtSecurity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4876:1: ( rule__JwtSecurity__Group__8__Impl rule__JwtSecurity__Group__9 )
            // InternalSecurityDsl.g:4877:2: rule__JwtSecurity__Group__8__Impl rule__JwtSecurity__Group__9
            {
            pushFollow(FOLLOW_37);
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
    // InternalSecurityDsl.g:4884:1: rule__JwtSecurity__Group__8__Impl : ( ( rule__JwtSecurity__IssuerAssignment_8 ) ) ;
    public final void rule__JwtSecurity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4888:1: ( ( ( rule__JwtSecurity__IssuerAssignment_8 ) ) )
            // InternalSecurityDsl.g:4889:1: ( ( rule__JwtSecurity__IssuerAssignment_8 ) )
            {
            // InternalSecurityDsl.g:4889:1: ( ( rule__JwtSecurity__IssuerAssignment_8 ) )
            // InternalSecurityDsl.g:4890:2: ( rule__JwtSecurity__IssuerAssignment_8 )
            {
             before(grammarAccess.getJwtSecurityAccess().getIssuerAssignment_8()); 
            // InternalSecurityDsl.g:4891:2: ( rule__JwtSecurity__IssuerAssignment_8 )
            // InternalSecurityDsl.g:4891:3: rule__JwtSecurity__IssuerAssignment_8
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
    // InternalSecurityDsl.g:4899:1: rule__JwtSecurity__Group__9 : rule__JwtSecurity__Group__9__Impl rule__JwtSecurity__Group__10 ;
    public final void rule__JwtSecurity__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4903:1: ( rule__JwtSecurity__Group__9__Impl rule__JwtSecurity__Group__10 )
            // InternalSecurityDsl.g:4904:2: rule__JwtSecurity__Group__9__Impl rule__JwtSecurity__Group__10
            {
            pushFollow(FOLLOW_38);
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
    // InternalSecurityDsl.g:4911:1: rule__JwtSecurity__Group__9__Impl : ( 'expiration-time:' ) ;
    public final void rule__JwtSecurity__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4915:1: ( ( 'expiration-time:' ) )
            // InternalSecurityDsl.g:4916:1: ( 'expiration-time:' )
            {
            // InternalSecurityDsl.g:4916:1: ( 'expiration-time:' )
            // InternalSecurityDsl.g:4917:2: 'expiration-time:'
            {
             before(grammarAccess.getJwtSecurityAccess().getExpirationTimeKeyword_9()); 
            match(input,66,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4926:1: rule__JwtSecurity__Group__10 : rule__JwtSecurity__Group__10__Impl rule__JwtSecurity__Group__11 ;
    public final void rule__JwtSecurity__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4930:1: ( rule__JwtSecurity__Group__10__Impl rule__JwtSecurity__Group__11 )
            // InternalSecurityDsl.g:4931:2: rule__JwtSecurity__Group__10__Impl rule__JwtSecurity__Group__11
            {
            pushFollow(FOLLOW_39);
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
    // InternalSecurityDsl.g:4938:1: rule__JwtSecurity__Group__10__Impl : ( ( rule__JwtSecurity__ExpirationTimeAssignment_10 ) ) ;
    public final void rule__JwtSecurity__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4942:1: ( ( ( rule__JwtSecurity__ExpirationTimeAssignment_10 ) ) )
            // InternalSecurityDsl.g:4943:1: ( ( rule__JwtSecurity__ExpirationTimeAssignment_10 ) )
            {
            // InternalSecurityDsl.g:4943:1: ( ( rule__JwtSecurity__ExpirationTimeAssignment_10 ) )
            // InternalSecurityDsl.g:4944:2: ( rule__JwtSecurity__ExpirationTimeAssignment_10 )
            {
             before(grammarAccess.getJwtSecurityAccess().getExpirationTimeAssignment_10()); 
            // InternalSecurityDsl.g:4945:2: ( rule__JwtSecurity__ExpirationTimeAssignment_10 )
            // InternalSecurityDsl.g:4945:3: rule__JwtSecurity__ExpirationTimeAssignment_10
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
    // InternalSecurityDsl.g:4953:1: rule__JwtSecurity__Group__11 : rule__JwtSecurity__Group__11__Impl rule__JwtSecurity__Group__12 ;
    public final void rule__JwtSecurity__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4957:1: ( rule__JwtSecurity__Group__11__Impl rule__JwtSecurity__Group__12 )
            // InternalSecurityDsl.g:4958:2: rule__JwtSecurity__Group__11__Impl rule__JwtSecurity__Group__12
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
    // InternalSecurityDsl.g:4965:1: rule__JwtSecurity__Group__11__Impl : ( 'audience:' ) ;
    public final void rule__JwtSecurity__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4969:1: ( ( 'audience:' ) )
            // InternalSecurityDsl.g:4970:1: ( 'audience:' )
            {
            // InternalSecurityDsl.g:4970:1: ( 'audience:' )
            // InternalSecurityDsl.g:4971:2: 'audience:'
            {
             before(grammarAccess.getJwtSecurityAccess().getAudienceKeyword_11()); 
            match(input,67,FOLLOW_2); 
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
    // InternalSecurityDsl.g:4980:1: rule__JwtSecurity__Group__12 : rule__JwtSecurity__Group__12__Impl rule__JwtSecurity__Group__13 ;
    public final void rule__JwtSecurity__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4984:1: ( rule__JwtSecurity__Group__12__Impl rule__JwtSecurity__Group__13 )
            // InternalSecurityDsl.g:4985:2: rule__JwtSecurity__Group__12__Impl rule__JwtSecurity__Group__13
            {
            pushFollow(FOLLOW_40);
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
    // InternalSecurityDsl.g:4992:1: rule__JwtSecurity__Group__12__Impl : ( ( rule__JwtSecurity__AudienceAssignment_12 ) ) ;
    public final void rule__JwtSecurity__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:4996:1: ( ( ( rule__JwtSecurity__AudienceAssignment_12 ) ) )
            // InternalSecurityDsl.g:4997:1: ( ( rule__JwtSecurity__AudienceAssignment_12 ) )
            {
            // InternalSecurityDsl.g:4997:1: ( ( rule__JwtSecurity__AudienceAssignment_12 ) )
            // InternalSecurityDsl.g:4998:2: ( rule__JwtSecurity__AudienceAssignment_12 )
            {
             before(grammarAccess.getJwtSecurityAccess().getAudienceAssignment_12()); 
            // InternalSecurityDsl.g:4999:2: ( rule__JwtSecurity__AudienceAssignment_12 )
            // InternalSecurityDsl.g:4999:3: rule__JwtSecurity__AudienceAssignment_12
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
    // InternalSecurityDsl.g:5007:1: rule__JwtSecurity__Group__13 : rule__JwtSecurity__Group__13__Impl rule__JwtSecurity__Group__14 ;
    public final void rule__JwtSecurity__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5011:1: ( rule__JwtSecurity__Group__13__Impl rule__JwtSecurity__Group__14 )
            // InternalSecurityDsl.g:5012:2: rule__JwtSecurity__Group__13__Impl rule__JwtSecurity__Group__14
            {
            pushFollow(FOLLOW_40);
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
    // InternalSecurityDsl.g:5019:1: rule__JwtSecurity__Group__13__Impl : ( ( rule__JwtSecurity__Group_13__0 )? ) ;
    public final void rule__JwtSecurity__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5023:1: ( ( ( rule__JwtSecurity__Group_13__0 )? ) )
            // InternalSecurityDsl.g:5024:1: ( ( rule__JwtSecurity__Group_13__0 )? )
            {
            // InternalSecurityDsl.g:5024:1: ( ( rule__JwtSecurity__Group_13__0 )? )
            // InternalSecurityDsl.g:5025:2: ( rule__JwtSecurity__Group_13__0 )?
            {
             before(grammarAccess.getJwtSecurityAccess().getGroup_13()); 
            // InternalSecurityDsl.g:5026:2: ( rule__JwtSecurity__Group_13__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==70) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSecurityDsl.g:5026:3: rule__JwtSecurity__Group_13__0
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
    // InternalSecurityDsl.g:5034:1: rule__JwtSecurity__Group__14 : rule__JwtSecurity__Group__14__Impl rule__JwtSecurity__Group__15 ;
    public final void rule__JwtSecurity__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5038:1: ( rule__JwtSecurity__Group__14__Impl rule__JwtSecurity__Group__15 )
            // InternalSecurityDsl.g:5039:2: rule__JwtSecurity__Group__14__Impl rule__JwtSecurity__Group__15
            {
            pushFollow(FOLLOW_40);
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
    // InternalSecurityDsl.g:5046:1: rule__JwtSecurity__Group__14__Impl : ( ( rule__JwtSecurity__Group_14__0 )? ) ;
    public final void rule__JwtSecurity__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5050:1: ( ( ( rule__JwtSecurity__Group_14__0 )? ) )
            // InternalSecurityDsl.g:5051:1: ( ( rule__JwtSecurity__Group_14__0 )? )
            {
            // InternalSecurityDsl.g:5051:1: ( ( rule__JwtSecurity__Group_14__0 )? )
            // InternalSecurityDsl.g:5052:2: ( rule__JwtSecurity__Group_14__0 )?
            {
             before(grammarAccess.getJwtSecurityAccess().getGroup_14()); 
            // InternalSecurityDsl.g:5053:2: ( rule__JwtSecurity__Group_14__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==71) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSecurityDsl.g:5053:3: rule__JwtSecurity__Group_14__0
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
    // InternalSecurityDsl.g:5061:1: rule__JwtSecurity__Group__15 : rule__JwtSecurity__Group__15__Impl rule__JwtSecurity__Group__16 ;
    public final void rule__JwtSecurity__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5065:1: ( rule__JwtSecurity__Group__15__Impl rule__JwtSecurity__Group__16 )
            // InternalSecurityDsl.g:5066:2: rule__JwtSecurity__Group__15__Impl rule__JwtSecurity__Group__16
            {
            pushFollow(FOLLOW_41);
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
    // InternalSecurityDsl.g:5073:1: rule__JwtSecurity__Group__15__Impl : ( 'signature:' ) ;
    public final void rule__JwtSecurity__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5077:1: ( ( 'signature:' ) )
            // InternalSecurityDsl.g:5078:1: ( 'signature:' )
            {
            // InternalSecurityDsl.g:5078:1: ( 'signature:' )
            // InternalSecurityDsl.g:5079:2: 'signature:'
            {
             before(grammarAccess.getJwtSecurityAccess().getSignatureKeyword_15()); 
            match(input,68,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5088:1: rule__JwtSecurity__Group__16 : rule__JwtSecurity__Group__16__Impl rule__JwtSecurity__Group__17 ;
    public final void rule__JwtSecurity__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5092:1: ( rule__JwtSecurity__Group__16__Impl rule__JwtSecurity__Group__17 )
            // InternalSecurityDsl.g:5093:2: rule__JwtSecurity__Group__16__Impl rule__JwtSecurity__Group__17
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
    // InternalSecurityDsl.g:5100:1: rule__JwtSecurity__Group__16__Impl : ( 'secret:' ) ;
    public final void rule__JwtSecurity__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5104:1: ( ( 'secret:' ) )
            // InternalSecurityDsl.g:5105:1: ( 'secret:' )
            {
            // InternalSecurityDsl.g:5105:1: ( 'secret:' )
            // InternalSecurityDsl.g:5106:2: 'secret:'
            {
             before(grammarAccess.getJwtSecurityAccess().getSecretKeyword_16()); 
            match(input,69,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5115:1: rule__JwtSecurity__Group__17 : rule__JwtSecurity__Group__17__Impl ;
    public final void rule__JwtSecurity__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5119:1: ( rule__JwtSecurity__Group__17__Impl )
            // InternalSecurityDsl.g:5120:2: rule__JwtSecurity__Group__17__Impl
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
    // InternalSecurityDsl.g:5126:1: rule__JwtSecurity__Group__17__Impl : ( ( rule__JwtSecurity__SecretAssignment_17 ) ) ;
    public final void rule__JwtSecurity__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5130:1: ( ( ( rule__JwtSecurity__SecretAssignment_17 ) ) )
            // InternalSecurityDsl.g:5131:1: ( ( rule__JwtSecurity__SecretAssignment_17 ) )
            {
            // InternalSecurityDsl.g:5131:1: ( ( rule__JwtSecurity__SecretAssignment_17 ) )
            // InternalSecurityDsl.g:5132:2: ( rule__JwtSecurity__SecretAssignment_17 )
            {
             before(grammarAccess.getJwtSecurityAccess().getSecretAssignment_17()); 
            // InternalSecurityDsl.g:5133:2: ( rule__JwtSecurity__SecretAssignment_17 )
            // InternalSecurityDsl.g:5133:3: rule__JwtSecurity__SecretAssignment_17
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
    // InternalSecurityDsl.g:5142:1: rule__JwtSecurity__Group_13__0 : rule__JwtSecurity__Group_13__0__Impl rule__JwtSecurity__Group_13__1 ;
    public final void rule__JwtSecurity__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5146:1: ( rule__JwtSecurity__Group_13__0__Impl rule__JwtSecurity__Group_13__1 )
            // InternalSecurityDsl.g:5147:2: rule__JwtSecurity__Group_13__0__Impl rule__JwtSecurity__Group_13__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSecurityDsl.g:5154:1: rule__JwtSecurity__Group_13__0__Impl : ( 'public-claims:' ) ;
    public final void rule__JwtSecurity__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5158:1: ( ( 'public-claims:' ) )
            // InternalSecurityDsl.g:5159:1: ( 'public-claims:' )
            {
            // InternalSecurityDsl.g:5159:1: ( 'public-claims:' )
            // InternalSecurityDsl.g:5160:2: 'public-claims:'
            {
             before(grammarAccess.getJwtSecurityAccess().getPublicClaimsKeyword_13_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getJwtSecurityAccess().getPublicClaimsKeyword_13_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:5169:1: rule__JwtSecurity__Group_13__1 : rule__JwtSecurity__Group_13__1__Impl rule__JwtSecurity__Group_13__2 ;
    public final void rule__JwtSecurity__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5173:1: ( rule__JwtSecurity__Group_13__1__Impl rule__JwtSecurity__Group_13__2 )
            // InternalSecurityDsl.g:5174:2: rule__JwtSecurity__Group_13__1__Impl rule__JwtSecurity__Group_13__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalSecurityDsl.g:5181:1: rule__JwtSecurity__Group_13__1__Impl : ( '[' ) ;
    public final void rule__JwtSecurity__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5185:1: ( ( '[' ) )
            // InternalSecurityDsl.g:5186:1: ( '[' )
            {
            // InternalSecurityDsl.g:5186:1: ( '[' )
            // InternalSecurityDsl.g:5187:2: '['
            {
             before(grammarAccess.getJwtSecurityAccess().getLeftSquareBracketKeyword_13_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5196:1: rule__JwtSecurity__Group_13__2 : rule__JwtSecurity__Group_13__2__Impl rule__JwtSecurity__Group_13__3 ;
    public final void rule__JwtSecurity__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5200:1: ( rule__JwtSecurity__Group_13__2__Impl rule__JwtSecurity__Group_13__3 )
            // InternalSecurityDsl.g:5201:2: rule__JwtSecurity__Group_13__2__Impl rule__JwtSecurity__Group_13__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalSecurityDsl.g:5208:1: rule__JwtSecurity__Group_13__2__Impl : ( ( rule__JwtSecurity__Security_claimsAssignment_13_2 )? ) ;
    public final void rule__JwtSecurity__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5212:1: ( ( ( rule__JwtSecurity__Security_claimsAssignment_13_2 )? ) )
            // InternalSecurityDsl.g:5213:1: ( ( rule__JwtSecurity__Security_claimsAssignment_13_2 )? )
            {
            // InternalSecurityDsl.g:5213:1: ( ( rule__JwtSecurity__Security_claimsAssignment_13_2 )? )
            // InternalSecurityDsl.g:5214:2: ( rule__JwtSecurity__Security_claimsAssignment_13_2 )?
            {
             before(grammarAccess.getJwtSecurityAccess().getSecurity_claimsAssignment_13_2()); 
            // InternalSecurityDsl.g:5215:2: ( rule__JwtSecurity__Security_claimsAssignment_13_2 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_STRING && LA32_0<=RULE_ID)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSecurityDsl.g:5215:3: rule__JwtSecurity__Security_claimsAssignment_13_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__JwtSecurity__Security_claimsAssignment_13_2();

                    state._fsp--;


                    }
                    break;

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
    // InternalSecurityDsl.g:5223:1: rule__JwtSecurity__Group_13__3 : rule__JwtSecurity__Group_13__3__Impl rule__JwtSecurity__Group_13__4 ;
    public final void rule__JwtSecurity__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5227:1: ( rule__JwtSecurity__Group_13__3__Impl rule__JwtSecurity__Group_13__4 )
            // InternalSecurityDsl.g:5228:2: rule__JwtSecurity__Group_13__3__Impl rule__JwtSecurity__Group_13__4
            {
            pushFollow(FOLLOW_42);
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
    // InternalSecurityDsl.g:5235:1: rule__JwtSecurity__Group_13__3__Impl : ( ( rule__JwtSecurity__Group_13_3__0 )* ) ;
    public final void rule__JwtSecurity__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5239:1: ( ( ( rule__JwtSecurity__Group_13_3__0 )* ) )
            // InternalSecurityDsl.g:5240:1: ( ( rule__JwtSecurity__Group_13_3__0 )* )
            {
            // InternalSecurityDsl.g:5240:1: ( ( rule__JwtSecurity__Group_13_3__0 )* )
            // InternalSecurityDsl.g:5241:2: ( rule__JwtSecurity__Group_13_3__0 )*
            {
             before(grammarAccess.getJwtSecurityAccess().getGroup_13_3()); 
            // InternalSecurityDsl.g:5242:2: ( rule__JwtSecurity__Group_13_3__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==41) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalSecurityDsl.g:5242:3: rule__JwtSecurity__Group_13_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__JwtSecurity__Group_13_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalSecurityDsl.g:5250:1: rule__JwtSecurity__Group_13__4 : rule__JwtSecurity__Group_13__4__Impl ;
    public final void rule__JwtSecurity__Group_13__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5254:1: ( rule__JwtSecurity__Group_13__4__Impl )
            // InternalSecurityDsl.g:5255:2: rule__JwtSecurity__Group_13__4__Impl
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
    // InternalSecurityDsl.g:5261:1: rule__JwtSecurity__Group_13__4__Impl : ( ']' ) ;
    public final void rule__JwtSecurity__Group_13__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5265:1: ( ( ']' ) )
            // InternalSecurityDsl.g:5266:1: ( ']' )
            {
            // InternalSecurityDsl.g:5266:1: ( ']' )
            // InternalSecurityDsl.g:5267:2: ']'
            {
             before(grammarAccess.getJwtSecurityAccess().getRightSquareBracketKeyword_13_4()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5277:1: rule__JwtSecurity__Group_13_3__0 : rule__JwtSecurity__Group_13_3__0__Impl rule__JwtSecurity__Group_13_3__1 ;
    public final void rule__JwtSecurity__Group_13_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5281:1: ( rule__JwtSecurity__Group_13_3__0__Impl rule__JwtSecurity__Group_13_3__1 )
            // InternalSecurityDsl.g:5282:2: rule__JwtSecurity__Group_13_3__0__Impl rule__JwtSecurity__Group_13_3__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSecurityDsl.g:5289:1: rule__JwtSecurity__Group_13_3__0__Impl : ( ',' ) ;
    public final void rule__JwtSecurity__Group_13_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5293:1: ( ( ',' ) )
            // InternalSecurityDsl.g:5294:1: ( ',' )
            {
            // InternalSecurityDsl.g:5294:1: ( ',' )
            // InternalSecurityDsl.g:5295:2: ','
            {
             before(grammarAccess.getJwtSecurityAccess().getCommaKeyword_13_3_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5304:1: rule__JwtSecurity__Group_13_3__1 : rule__JwtSecurity__Group_13_3__1__Impl ;
    public final void rule__JwtSecurity__Group_13_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5308:1: ( rule__JwtSecurity__Group_13_3__1__Impl )
            // InternalSecurityDsl.g:5309:2: rule__JwtSecurity__Group_13_3__1__Impl
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
    // InternalSecurityDsl.g:5315:1: rule__JwtSecurity__Group_13_3__1__Impl : ( ( rule__JwtSecurity__Security_claimsAssignment_13_3_1 ) ) ;
    public final void rule__JwtSecurity__Group_13_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5319:1: ( ( ( rule__JwtSecurity__Security_claimsAssignment_13_3_1 ) ) )
            // InternalSecurityDsl.g:5320:1: ( ( rule__JwtSecurity__Security_claimsAssignment_13_3_1 ) )
            {
            // InternalSecurityDsl.g:5320:1: ( ( rule__JwtSecurity__Security_claimsAssignment_13_3_1 ) )
            // InternalSecurityDsl.g:5321:2: ( rule__JwtSecurity__Security_claimsAssignment_13_3_1 )
            {
             before(grammarAccess.getJwtSecurityAccess().getSecurity_claimsAssignment_13_3_1()); 
            // InternalSecurityDsl.g:5322:2: ( rule__JwtSecurity__Security_claimsAssignment_13_3_1 )
            // InternalSecurityDsl.g:5322:3: rule__JwtSecurity__Security_claimsAssignment_13_3_1
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
    // InternalSecurityDsl.g:5331:1: rule__JwtSecurity__Group_14__0 : rule__JwtSecurity__Group_14__0__Impl rule__JwtSecurity__Group_14__1 ;
    public final void rule__JwtSecurity__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5335:1: ( rule__JwtSecurity__Group_14__0__Impl rule__JwtSecurity__Group_14__1 )
            // InternalSecurityDsl.g:5336:2: rule__JwtSecurity__Group_14__0__Impl rule__JwtSecurity__Group_14__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSecurityDsl.g:5343:1: rule__JwtSecurity__Group_14__0__Impl : ( 'private-claims:' ) ;
    public final void rule__JwtSecurity__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5347:1: ( ( 'private-claims:' ) )
            // InternalSecurityDsl.g:5348:1: ( 'private-claims:' )
            {
            // InternalSecurityDsl.g:5348:1: ( 'private-claims:' )
            // InternalSecurityDsl.g:5349:2: 'private-claims:'
            {
             before(grammarAccess.getJwtSecurityAccess().getPrivateClaimsKeyword_14_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getJwtSecurityAccess().getPrivateClaimsKeyword_14_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:5358:1: rule__JwtSecurity__Group_14__1 : rule__JwtSecurity__Group_14__1__Impl rule__JwtSecurity__Group_14__2 ;
    public final void rule__JwtSecurity__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5362:1: ( rule__JwtSecurity__Group_14__1__Impl rule__JwtSecurity__Group_14__2 )
            // InternalSecurityDsl.g:5363:2: rule__JwtSecurity__Group_14__1__Impl rule__JwtSecurity__Group_14__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalSecurityDsl.g:5370:1: rule__JwtSecurity__Group_14__1__Impl : ( '[' ) ;
    public final void rule__JwtSecurity__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5374:1: ( ( '[' ) )
            // InternalSecurityDsl.g:5375:1: ( '[' )
            {
            // InternalSecurityDsl.g:5375:1: ( '[' )
            // InternalSecurityDsl.g:5376:2: '['
            {
             before(grammarAccess.getJwtSecurityAccess().getLeftSquareBracketKeyword_14_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5385:1: rule__JwtSecurity__Group_14__2 : rule__JwtSecurity__Group_14__2__Impl rule__JwtSecurity__Group_14__3 ;
    public final void rule__JwtSecurity__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5389:1: ( rule__JwtSecurity__Group_14__2__Impl rule__JwtSecurity__Group_14__3 )
            // InternalSecurityDsl.g:5390:2: rule__JwtSecurity__Group_14__2__Impl rule__JwtSecurity__Group_14__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalSecurityDsl.g:5397:1: rule__JwtSecurity__Group_14__2__Impl : ( ( rule__JwtSecurity__Security_claimsAssignment_14_2 )? ) ;
    public final void rule__JwtSecurity__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5401:1: ( ( ( rule__JwtSecurity__Security_claimsAssignment_14_2 )? ) )
            // InternalSecurityDsl.g:5402:1: ( ( rule__JwtSecurity__Security_claimsAssignment_14_2 )? )
            {
            // InternalSecurityDsl.g:5402:1: ( ( rule__JwtSecurity__Security_claimsAssignment_14_2 )? )
            // InternalSecurityDsl.g:5403:2: ( rule__JwtSecurity__Security_claimsAssignment_14_2 )?
            {
             before(grammarAccess.getJwtSecurityAccess().getSecurity_claimsAssignment_14_2()); 
            // InternalSecurityDsl.g:5404:2: ( rule__JwtSecurity__Security_claimsAssignment_14_2 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_STRING && LA34_0<=RULE_ID)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSecurityDsl.g:5404:3: rule__JwtSecurity__Security_claimsAssignment_14_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__JwtSecurity__Security_claimsAssignment_14_2();

                    state._fsp--;


                    }
                    break;

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
    // InternalSecurityDsl.g:5412:1: rule__JwtSecurity__Group_14__3 : rule__JwtSecurity__Group_14__3__Impl rule__JwtSecurity__Group_14__4 ;
    public final void rule__JwtSecurity__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5416:1: ( rule__JwtSecurity__Group_14__3__Impl rule__JwtSecurity__Group_14__4 )
            // InternalSecurityDsl.g:5417:2: rule__JwtSecurity__Group_14__3__Impl rule__JwtSecurity__Group_14__4
            {
            pushFollow(FOLLOW_42);
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
    // InternalSecurityDsl.g:5424:1: rule__JwtSecurity__Group_14__3__Impl : ( ( rule__JwtSecurity__Group_14_3__0 )* ) ;
    public final void rule__JwtSecurity__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5428:1: ( ( ( rule__JwtSecurity__Group_14_3__0 )* ) )
            // InternalSecurityDsl.g:5429:1: ( ( rule__JwtSecurity__Group_14_3__0 )* )
            {
            // InternalSecurityDsl.g:5429:1: ( ( rule__JwtSecurity__Group_14_3__0 )* )
            // InternalSecurityDsl.g:5430:2: ( rule__JwtSecurity__Group_14_3__0 )*
            {
             before(grammarAccess.getJwtSecurityAccess().getGroup_14_3()); 
            // InternalSecurityDsl.g:5431:2: ( rule__JwtSecurity__Group_14_3__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==41) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalSecurityDsl.g:5431:3: rule__JwtSecurity__Group_14_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__JwtSecurity__Group_14_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalSecurityDsl.g:5439:1: rule__JwtSecurity__Group_14__4 : rule__JwtSecurity__Group_14__4__Impl ;
    public final void rule__JwtSecurity__Group_14__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5443:1: ( rule__JwtSecurity__Group_14__4__Impl )
            // InternalSecurityDsl.g:5444:2: rule__JwtSecurity__Group_14__4__Impl
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
    // InternalSecurityDsl.g:5450:1: rule__JwtSecurity__Group_14__4__Impl : ( ']' ) ;
    public final void rule__JwtSecurity__Group_14__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5454:1: ( ( ']' ) )
            // InternalSecurityDsl.g:5455:1: ( ']' )
            {
            // InternalSecurityDsl.g:5455:1: ( ']' )
            // InternalSecurityDsl.g:5456:2: ']'
            {
             before(grammarAccess.getJwtSecurityAccess().getRightSquareBracketKeyword_14_4()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5466:1: rule__JwtSecurity__Group_14_3__0 : rule__JwtSecurity__Group_14_3__0__Impl rule__JwtSecurity__Group_14_3__1 ;
    public final void rule__JwtSecurity__Group_14_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5470:1: ( rule__JwtSecurity__Group_14_3__0__Impl rule__JwtSecurity__Group_14_3__1 )
            // InternalSecurityDsl.g:5471:2: rule__JwtSecurity__Group_14_3__0__Impl rule__JwtSecurity__Group_14_3__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSecurityDsl.g:5478:1: rule__JwtSecurity__Group_14_3__0__Impl : ( ',' ) ;
    public final void rule__JwtSecurity__Group_14_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5482:1: ( ( ',' ) )
            // InternalSecurityDsl.g:5483:1: ( ',' )
            {
            // InternalSecurityDsl.g:5483:1: ( ',' )
            // InternalSecurityDsl.g:5484:2: ','
            {
             before(grammarAccess.getJwtSecurityAccess().getCommaKeyword_14_3_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSecurityDsl.g:5493:1: rule__JwtSecurity__Group_14_3__1 : rule__JwtSecurity__Group_14_3__1__Impl ;
    public final void rule__JwtSecurity__Group_14_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5497:1: ( rule__JwtSecurity__Group_14_3__1__Impl )
            // InternalSecurityDsl.g:5498:2: rule__JwtSecurity__Group_14_3__1__Impl
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
    // InternalSecurityDsl.g:5504:1: rule__JwtSecurity__Group_14_3__1__Impl : ( ( rule__JwtSecurity__Security_claimsAssignment_14_3_1 ) ) ;
    public final void rule__JwtSecurity__Group_14_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5508:1: ( ( ( rule__JwtSecurity__Security_claimsAssignment_14_3_1 ) ) )
            // InternalSecurityDsl.g:5509:1: ( ( rule__JwtSecurity__Security_claimsAssignment_14_3_1 ) )
            {
            // InternalSecurityDsl.g:5509:1: ( ( rule__JwtSecurity__Security_claimsAssignment_14_3_1 ) )
            // InternalSecurityDsl.g:5510:2: ( rule__JwtSecurity__Security_claimsAssignment_14_3_1 )
            {
             before(grammarAccess.getJwtSecurityAccess().getSecurity_claimsAssignment_14_3_1()); 
            // InternalSecurityDsl.g:5511:2: ( rule__JwtSecurity__Security_claimsAssignment_14_3_1 )
            // InternalSecurityDsl.g:5511:3: rule__JwtSecurity__Security_claimsAssignment_14_3_1
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
    // InternalSecurityDsl.g:5520:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5524:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalSecurityDsl.g:5525:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalSecurityDsl.g:5532:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5536:1: ( ( ( '-' )? ) )
            // InternalSecurityDsl.g:5537:1: ( ( '-' )? )
            {
            // InternalSecurityDsl.g:5537:1: ( ( '-' )? )
            // InternalSecurityDsl.g:5538:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalSecurityDsl.g:5539:2: ( '-' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==72) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSecurityDsl.g:5539:3: '-'
                    {
                    match(input,72,FOLLOW_2); 

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
    // InternalSecurityDsl.g:5547:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5551:1: ( rule__EInt__Group__1__Impl )
            // InternalSecurityDsl.g:5552:2: rule__EInt__Group__1__Impl
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
    // InternalSecurityDsl.g:5558:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5562:1: ( ( RULE_INT ) )
            // InternalSecurityDsl.g:5563:1: ( RULE_INT )
            {
            // InternalSecurityDsl.g:5563:1: ( RULE_INT )
            // InternalSecurityDsl.g:5564:2: RULE_INT
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


    // $ANTLR start "rule__Public__Group__0"
    // InternalSecurityDsl.g:5574:1: rule__Public__Group__0 : rule__Public__Group__0__Impl rule__Public__Group__1 ;
    public final void rule__Public__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5578:1: ( rule__Public__Group__0__Impl rule__Public__Group__1 )
            // InternalSecurityDsl.g:5579:2: rule__Public__Group__0__Impl rule__Public__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Public__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Public__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Public__Group__0"


    // $ANTLR start "rule__Public__Group__0__Impl"
    // InternalSecurityDsl.g:5586:1: rule__Public__Group__0__Impl : ( () ) ;
    public final void rule__Public__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5590:1: ( ( () ) )
            // InternalSecurityDsl.g:5591:1: ( () )
            {
            // InternalSecurityDsl.g:5591:1: ( () )
            // InternalSecurityDsl.g:5592:2: ()
            {
             before(grammarAccess.getPublicAccess().getPublicAction_0()); 
            // InternalSecurityDsl.g:5593:2: ()
            // InternalSecurityDsl.g:5593:3: 
            {
            }

             after(grammarAccess.getPublicAccess().getPublicAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Public__Group__0__Impl"


    // $ANTLR start "rule__Public__Group__1"
    // InternalSecurityDsl.g:5601:1: rule__Public__Group__1 : rule__Public__Group__1__Impl ;
    public final void rule__Public__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5605:1: ( rule__Public__Group__1__Impl )
            // InternalSecurityDsl.g:5606:2: rule__Public__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Public__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Public__Group__1"


    // $ANTLR start "rule__Public__Group__1__Impl"
    // InternalSecurityDsl.g:5612:1: rule__Public__Group__1__Impl : ( ( rule__Public__NameAssignment_1 ) ) ;
    public final void rule__Public__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5616:1: ( ( ( rule__Public__NameAssignment_1 ) ) )
            // InternalSecurityDsl.g:5617:1: ( ( rule__Public__NameAssignment_1 ) )
            {
            // InternalSecurityDsl.g:5617:1: ( ( rule__Public__NameAssignment_1 ) )
            // InternalSecurityDsl.g:5618:2: ( rule__Public__NameAssignment_1 )
            {
             before(grammarAccess.getPublicAccess().getNameAssignment_1()); 
            // InternalSecurityDsl.g:5619:2: ( rule__Public__NameAssignment_1 )
            // InternalSecurityDsl.g:5619:3: rule__Public__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Public__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPublicAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Public__Group__1__Impl"


    // $ANTLR start "rule__Private__Group__0"
    // InternalSecurityDsl.g:5628:1: rule__Private__Group__0 : rule__Private__Group__0__Impl rule__Private__Group__1 ;
    public final void rule__Private__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5632:1: ( rule__Private__Group__0__Impl rule__Private__Group__1 )
            // InternalSecurityDsl.g:5633:2: rule__Private__Group__0__Impl rule__Private__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Private__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Private__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Private__Group__0"


    // $ANTLR start "rule__Private__Group__0__Impl"
    // InternalSecurityDsl.g:5640:1: rule__Private__Group__0__Impl : ( () ) ;
    public final void rule__Private__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5644:1: ( ( () ) )
            // InternalSecurityDsl.g:5645:1: ( () )
            {
            // InternalSecurityDsl.g:5645:1: ( () )
            // InternalSecurityDsl.g:5646:2: ()
            {
             before(grammarAccess.getPrivateAccess().getPrivateAction_0()); 
            // InternalSecurityDsl.g:5647:2: ()
            // InternalSecurityDsl.g:5647:3: 
            {
            }

             after(grammarAccess.getPrivateAccess().getPrivateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Private__Group__0__Impl"


    // $ANTLR start "rule__Private__Group__1"
    // InternalSecurityDsl.g:5655:1: rule__Private__Group__1 : rule__Private__Group__1__Impl ;
    public final void rule__Private__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5659:1: ( rule__Private__Group__1__Impl )
            // InternalSecurityDsl.g:5660:2: rule__Private__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Private__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Private__Group__1"


    // $ANTLR start "rule__Private__Group__1__Impl"
    // InternalSecurityDsl.g:5666:1: rule__Private__Group__1__Impl : ( ( rule__Private__NameAssignment_1 ) ) ;
    public final void rule__Private__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5670:1: ( ( ( rule__Private__NameAssignment_1 ) ) )
            // InternalSecurityDsl.g:5671:1: ( ( rule__Private__NameAssignment_1 ) )
            {
            // InternalSecurityDsl.g:5671:1: ( ( rule__Private__NameAssignment_1 ) )
            // InternalSecurityDsl.g:5672:2: ( rule__Private__NameAssignment_1 )
            {
             before(grammarAccess.getPrivateAccess().getNameAssignment_1()); 
            // InternalSecurityDsl.g:5673:2: ( rule__Private__NameAssignment_1 )
            // InternalSecurityDsl.g:5673:3: rule__Private__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Private__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrivateAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Private__Group__1__Impl"


    // $ANTLR start "rule__Application__NameAssignment_3"
    // InternalSecurityDsl.g:5682:1: rule__Application__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Application__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5686:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5687:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5687:2: ( ruleEString )
            // InternalSecurityDsl.g:5688:3: ruleEString
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
    // InternalSecurityDsl.g:5697:1: rule__Application__DescriptionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Application__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5701:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5702:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5702:2: ( ruleEString )
            // InternalSecurityDsl.g:5703:3: ruleEString
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
    // InternalSecurityDsl.g:5712:1: rule__Application__App_databaseAssignment_5_1 : ( ruleDatabase ) ;
    public final void rule__Application__App_databaseAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5716:1: ( ( ruleDatabase ) )
            // InternalSecurityDsl.g:5717:2: ( ruleDatabase )
            {
            // InternalSecurityDsl.g:5717:2: ( ruleDatabase )
            // InternalSecurityDsl.g:5718:3: ruleDatabase
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
    // InternalSecurityDsl.g:5727:1: rule__Application__App_securityAssignment_6_1 : ( ruleSecurity ) ;
    public final void rule__Application__App_securityAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5731:1: ( ( ruleSecurity ) )
            // InternalSecurityDsl.g:5732:2: ( ruleSecurity )
            {
            // InternalSecurityDsl.g:5732:2: ( ruleSecurity )
            // InternalSecurityDsl.g:5733:3: ruleSecurity
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


    // $ANTLR start "rule__Application__App_modelsAssignment_7_1_1"
    // InternalSecurityDsl.g:5742:1: rule__Application__App_modelsAssignment_7_1_1 : ( ruleUser ) ;
    public final void rule__Application__App_modelsAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5746:1: ( ( ruleUser ) )
            // InternalSecurityDsl.g:5747:2: ( ruleUser )
            {
            // InternalSecurityDsl.g:5747:2: ( ruleUser )
            // InternalSecurityDsl.g:5748:3: ruleUser
            {
             before(grammarAccess.getApplicationAccess().getApp_modelsUserParserRuleCall_7_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUser();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getApp_modelsUserParserRuleCall_7_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__App_modelsAssignment_7_1_1"


    // $ANTLR start "rule__Application__App_modelsAssignment_7_2_1"
    // InternalSecurityDsl.g:5757:1: rule__Application__App_modelsAssignment_7_2_1 : ( ruleRole ) ;
    public final void rule__Application__App_modelsAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5761:1: ( ( ruleRole ) )
            // InternalSecurityDsl.g:5762:2: ( ruleRole )
            {
            // InternalSecurityDsl.g:5762:2: ( ruleRole )
            // InternalSecurityDsl.g:5763:3: ruleRole
            {
             before(grammarAccess.getApplicationAccess().getApp_modelsRoleParserRuleCall_7_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getApp_modelsRoleParserRuleCall_7_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__App_modelsAssignment_7_2_1"


    // $ANTLR start "rule__Application__App_modelsAssignment_7_3_2"
    // InternalSecurityDsl.g:5772:1: rule__Application__App_modelsAssignment_7_3_2 : ( ruleOtherModel ) ;
    public final void rule__Application__App_modelsAssignment_7_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5776:1: ( ( ruleOtherModel ) )
            // InternalSecurityDsl.g:5777:2: ( ruleOtherModel )
            {
            // InternalSecurityDsl.g:5777:2: ( ruleOtherModel )
            // InternalSecurityDsl.g:5778:3: ruleOtherModel
            {
             before(grammarAccess.getApplicationAccess().getApp_modelsOtherModelParserRuleCall_7_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOtherModel();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getApp_modelsOtherModelParserRuleCall_7_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__App_modelsAssignment_7_3_2"


    // $ANTLR start "rule__Application__App_modelsAssignment_7_3_3_1"
    // InternalSecurityDsl.g:5787:1: rule__Application__App_modelsAssignment_7_3_3_1 : ( ruleOtherModel ) ;
    public final void rule__Application__App_modelsAssignment_7_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5791:1: ( ( ruleOtherModel ) )
            // InternalSecurityDsl.g:5792:2: ( ruleOtherModel )
            {
            // InternalSecurityDsl.g:5792:2: ( ruleOtherModel )
            // InternalSecurityDsl.g:5793:3: ruleOtherModel
            {
             before(grammarAccess.getApplicationAccess().getApp_modelsOtherModelParserRuleCall_7_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOtherModel();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getApp_modelsOtherModelParserRuleCall_7_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__App_modelsAssignment_7_3_3_1"


    // $ANTLR start "rule__Application__App_controllersAssignment_8_1_1"
    // InternalSecurityDsl.g:5802:1: rule__Application__App_controllersAssignment_8_1_1 : ( ruleAuthentication ) ;
    public final void rule__Application__App_controllersAssignment_8_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5806:1: ( ( ruleAuthentication ) )
            // InternalSecurityDsl.g:5807:2: ( ruleAuthentication )
            {
            // InternalSecurityDsl.g:5807:2: ( ruleAuthentication )
            // InternalSecurityDsl.g:5808:3: ruleAuthentication
            {
             before(grammarAccess.getApplicationAccess().getApp_controllersAuthenticationParserRuleCall_8_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAuthentication();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getApp_controllersAuthenticationParserRuleCall_8_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__App_controllersAssignment_8_1_1"


    // $ANTLR start "rule__Application__App_controllersAssignment_8_2_2"
    // InternalSecurityDsl.g:5817:1: rule__Application__App_controllersAssignment_8_2_2 : ( ruleOtherController ) ;
    public final void rule__Application__App_controllersAssignment_8_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5821:1: ( ( ruleOtherController ) )
            // InternalSecurityDsl.g:5822:2: ( ruleOtherController )
            {
            // InternalSecurityDsl.g:5822:2: ( ruleOtherController )
            // InternalSecurityDsl.g:5823:3: ruleOtherController
            {
             before(grammarAccess.getApplicationAccess().getApp_controllersOtherControllerParserRuleCall_8_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOtherController();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getApp_controllersOtherControllerParserRuleCall_8_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__App_controllersAssignment_8_2_2"


    // $ANTLR start "rule__Application__App_controllersAssignment_8_2_3_1"
    // InternalSecurityDsl.g:5832:1: rule__Application__App_controllersAssignment_8_2_3_1 : ( ruleOtherController ) ;
    public final void rule__Application__App_controllersAssignment_8_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5836:1: ( ( ruleOtherController ) )
            // InternalSecurityDsl.g:5837:2: ( ruleOtherController )
            {
            // InternalSecurityDsl.g:5837:2: ( ruleOtherController )
            // InternalSecurityDsl.g:5838:3: ruleOtherController
            {
             before(grammarAccess.getApplicationAccess().getApp_controllersOtherControllerParserRuleCall_8_2_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOtherController();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getApp_controllersOtherControllerParserRuleCall_8_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__App_controllersAssignment_8_2_3_1"


    // $ANTLR start "rule__Database__VendorNameAssignment_1"
    // InternalSecurityDsl.g:5847:1: rule__Database__VendorNameAssignment_1 : ( ruleEDatabaseType ) ;
    public final void rule__Database__VendorNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5851:1: ( ( ruleEDatabaseType ) )
            // InternalSecurityDsl.g:5852:2: ( ruleEDatabaseType )
            {
            // InternalSecurityDsl.g:5852:2: ( ruleEDatabaseType )
            // InternalSecurityDsl.g:5853:3: ruleEDatabaseType
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
    // InternalSecurityDsl.g:5862:1: rule__Database__UrlAssignment_3 : ( ruleEString ) ;
    public final void rule__Database__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5866:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5867:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5867:2: ( ruleEString )
            // InternalSecurityDsl.g:5868:3: ruleEString
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
    // InternalSecurityDsl.g:5877:1: rule__Database__UsernameAssignment_5 : ( ruleEString ) ;
    public final void rule__Database__UsernameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5881:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5882:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5882:2: ( ruleEString )
            // InternalSecurityDsl.g:5883:3: ruleEString
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
    // InternalSecurityDsl.g:5892:1: rule__Database__PasswordAssignment_7 : ( ruleEString ) ;
    public final void rule__Database__PasswordAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5896:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5897:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5897:2: ( ruleEString )
            // InternalSecurityDsl.g:5898:3: ruleEString
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


    // $ANTLR start "rule__Attribute__NameAssignment_2"
    // InternalSecurityDsl.g:5907:1: rule__Attribute__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5911:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5912:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5912:2: ( ruleEString )
            // InternalSecurityDsl.g:5913:3: ruleEString
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


    // $ANTLR start "rule__Attribute__TypeAssignment_4"
    // InternalSecurityDsl.g:5922:1: rule__Attribute__TypeAssignment_4 : ( ruleEType ) ;
    public final void rule__Attribute__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5926:1: ( ( ruleEType ) )
            // InternalSecurityDsl.g:5927:2: ( ruleEType )
            {
            // InternalSecurityDsl.g:5927:2: ( ruleEType )
            // InternalSecurityDsl.g:5928:3: ruleEType
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


    // $ANTLR start "rule__User__IdentifierNameAssignment_2"
    // InternalSecurityDsl.g:5937:1: rule__User__IdentifierNameAssignment_2 : ( ruleEString ) ;
    public final void rule__User__IdentifierNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5941:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:5942:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:5942:2: ( ruleEString )
            // InternalSecurityDsl.g:5943:3: ruleEString
            {
             before(grammarAccess.getUserAccess().getIdentifierNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUserAccess().getIdentifierNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__IdentifierNameAssignment_2"


    // $ANTLR start "rule__User__IdentifierTypeAssignment_4"
    // InternalSecurityDsl.g:5952:1: rule__User__IdentifierTypeAssignment_4 : ( ruleEType ) ;
    public final void rule__User__IdentifierTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5956:1: ( ( ruleEType ) )
            // InternalSecurityDsl.g:5957:2: ( ruleEType )
            {
            // InternalSecurityDsl.g:5957:2: ( ruleEType )
            // InternalSecurityDsl.g:5958:3: ruleEType
            {
             before(grammarAccess.getUserAccess().getIdentifierTypeETypeEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEType();

            state._fsp--;

             after(grammarAccess.getUserAccess().getIdentifierTypeETypeEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__IdentifierTypeAssignment_4"


    // $ANTLR start "rule__User__Model_attributesAssignment_5_2"
    // InternalSecurityDsl.g:5967:1: rule__User__Model_attributesAssignment_5_2 : ( ruleAttribute ) ;
    public final void rule__User__Model_attributesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5971:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:5972:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:5972:2: ( ruleAttribute )
            // InternalSecurityDsl.g:5973:3: ruleAttribute
            {
             before(grammarAccess.getUserAccess().getModel_attributesAttributeParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getUserAccess().getModel_attributesAttributeParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Model_attributesAssignment_5_2"


    // $ANTLR start "rule__User__Model_attributesAssignment_5_3_1"
    // InternalSecurityDsl.g:5982:1: rule__User__Model_attributesAssignment_5_3_1 : ( ruleAttribute ) ;
    public final void rule__User__Model_attributesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:5986:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:5987:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:5987:2: ( ruleAttribute )
            // InternalSecurityDsl.g:5988:3: ruleAttribute
            {
             before(grammarAccess.getUserAccess().getModel_attributesAttributeParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getUserAccess().getModel_attributesAttributeParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Model_attributesAssignment_5_3_1"


    // $ANTLR start "rule__OtherModel__NameAssignment_2"
    // InternalSecurityDsl.g:5997:1: rule__OtherModel__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__OtherModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6001:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6002:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6002:2: ( ruleEString )
            // InternalSecurityDsl.g:6003:3: ruleEString
            {
             before(grammarAccess.getOtherModelAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOtherModelAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__NameAssignment_2"


    // $ANTLR start "rule__OtherModel__IdentifierNameAssignment_5"
    // InternalSecurityDsl.g:6012:1: rule__OtherModel__IdentifierNameAssignment_5 : ( ruleEString ) ;
    public final void rule__OtherModel__IdentifierNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6016:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6017:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6017:2: ( ruleEString )
            // InternalSecurityDsl.g:6018:3: ruleEString
            {
             before(grammarAccess.getOtherModelAccess().getIdentifierNameEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOtherModelAccess().getIdentifierNameEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__IdentifierNameAssignment_5"


    // $ANTLR start "rule__OtherModel__IdentifierTypeAssignment_7"
    // InternalSecurityDsl.g:6027:1: rule__OtherModel__IdentifierTypeAssignment_7 : ( ruleEType ) ;
    public final void rule__OtherModel__IdentifierTypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6031:1: ( ( ruleEType ) )
            // InternalSecurityDsl.g:6032:2: ( ruleEType )
            {
            // InternalSecurityDsl.g:6032:2: ( ruleEType )
            // InternalSecurityDsl.g:6033:3: ruleEType
            {
             before(grammarAccess.getOtherModelAccess().getIdentifierTypeETypeEnumRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEType();

            state._fsp--;

             after(grammarAccess.getOtherModelAccess().getIdentifierTypeETypeEnumRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__IdentifierTypeAssignment_7"


    // $ANTLR start "rule__OtherModel__Model_attributesAssignment_8_2"
    // InternalSecurityDsl.g:6042:1: rule__OtherModel__Model_attributesAssignment_8_2 : ( ruleAttribute ) ;
    public final void rule__OtherModel__Model_attributesAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6046:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:6047:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:6047:2: ( ruleAttribute )
            // InternalSecurityDsl.g:6048:3: ruleAttribute
            {
             before(grammarAccess.getOtherModelAccess().getModel_attributesAttributeParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getOtherModelAccess().getModel_attributesAttributeParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Model_attributesAssignment_8_2"


    // $ANTLR start "rule__OtherModel__Model_attributesAssignment_8_3_1"
    // InternalSecurityDsl.g:6057:1: rule__OtherModel__Model_attributesAssignment_8_3_1 : ( ruleAttribute ) ;
    public final void rule__OtherModel__Model_attributesAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6061:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:6062:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:6062:2: ( ruleAttribute )
            // InternalSecurityDsl.g:6063:3: ruleAttribute
            {
             before(grammarAccess.getOtherModelAccess().getModel_attributesAttributeParserRuleCall_8_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getOtherModelAccess().getModel_attributesAttributeParserRuleCall_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherModel__Model_attributesAssignment_8_3_1"


    // $ANTLR start "rule__Role__IdentifierNameAssignment_2"
    // InternalSecurityDsl.g:6072:1: rule__Role__IdentifierNameAssignment_2 : ( ruleEString ) ;
    public final void rule__Role__IdentifierNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6076:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6077:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6077:2: ( ruleEString )
            // InternalSecurityDsl.g:6078:3: ruleEString
            {
             before(grammarAccess.getRoleAccess().getIdentifierNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getIdentifierNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__IdentifierNameAssignment_2"


    // $ANTLR start "rule__Role__IdentifierTypeAssignment_4"
    // InternalSecurityDsl.g:6087:1: rule__Role__IdentifierTypeAssignment_4 : ( ruleEType ) ;
    public final void rule__Role__IdentifierTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6091:1: ( ( ruleEType ) )
            // InternalSecurityDsl.g:6092:2: ( ruleEType )
            {
            // InternalSecurityDsl.g:6092:2: ( ruleEType )
            // InternalSecurityDsl.g:6093:3: ruleEType
            {
             before(grammarAccess.getRoleAccess().getIdentifierTypeETypeEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEType();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getIdentifierTypeETypeEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__IdentifierTypeAssignment_4"


    // $ANTLR start "rule__Role__Model_attributesAssignment_5_2"
    // InternalSecurityDsl.g:6102:1: rule__Role__Model_attributesAssignment_5_2 : ( ruleAttribute ) ;
    public final void rule__Role__Model_attributesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6106:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:6107:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:6107:2: ( ruleAttribute )
            // InternalSecurityDsl.g:6108:3: ruleAttribute
            {
             before(grammarAccess.getRoleAccess().getModel_attributesAttributeParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getModel_attributesAttributeParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Model_attributesAssignment_5_2"


    // $ANTLR start "rule__Role__Model_attributesAssignment_5_3_1"
    // InternalSecurityDsl.g:6117:1: rule__Role__Model_attributesAssignment_5_3_1 : ( ruleAttribute ) ;
    public final void rule__Role__Model_attributesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6121:1: ( ( ruleAttribute ) )
            // InternalSecurityDsl.g:6122:2: ( ruleAttribute )
            {
            // InternalSecurityDsl.g:6122:2: ( ruleAttribute )
            // InternalSecurityDsl.g:6123:3: ruleAttribute
            {
             before(grammarAccess.getRoleAccess().getModel_attributesAttributeParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getModel_attributesAttributeParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Model_attributesAssignment_5_3_1"


    // $ANTLR start "rule__Endpoint__UrlAssignment_2"
    // InternalSecurityDsl.g:6132:1: rule__Endpoint__UrlAssignment_2 : ( ruleEString ) ;
    public final void rule__Endpoint__UrlAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6136:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6137:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6137:2: ( ruleEString )
            // InternalSecurityDsl.g:6138:3: ruleEString
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


    // $ANTLR start "rule__Endpoint__Function_nameAssignment_4"
    // InternalSecurityDsl.g:6147:1: rule__Endpoint__Function_nameAssignment_4 : ( ruleEString ) ;
    public final void rule__Endpoint__Function_nameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6151:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6152:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6152:2: ( ruleEString )
            // InternalSecurityDsl.g:6153:3: ruleEString
            {
             before(grammarAccess.getEndpointAccess().getFunction_nameEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEndpointAccess().getFunction_nameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__Function_nameAssignment_4"


    // $ANTLR start "rule__Endpoint__MethodAssignment_6"
    // InternalSecurityDsl.g:6162:1: rule__Endpoint__MethodAssignment_6 : ( ruleEEndpointMethod ) ;
    public final void rule__Endpoint__MethodAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6166:1: ( ( ruleEEndpointMethod ) )
            // InternalSecurityDsl.g:6167:2: ( ruleEEndpointMethod )
            {
            // InternalSecurityDsl.g:6167:2: ( ruleEEndpointMethod )
            // InternalSecurityDsl.g:6168:3: ruleEEndpointMethod
            {
             before(grammarAccess.getEndpointAccess().getMethodEEndpointMethodEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEEndpointMethod();

            state._fsp--;

             after(grammarAccess.getEndpointAccess().getMethodEEndpointMethodEnumRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endpoint__MethodAssignment_6"


    // $ANTLR start "rule__AuthEndpoint__UrlAssignment_1"
    // InternalSecurityDsl.g:6177:1: rule__AuthEndpoint__UrlAssignment_1 : ( ruleEString ) ;
    public final void rule__AuthEndpoint__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6181:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6182:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6182:2: ( ruleEString )
            // InternalSecurityDsl.g:6183:3: ruleEString
            {
             before(grammarAccess.getAuthEndpointAccess().getUrlEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAuthEndpointAccess().getUrlEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthEndpoint__UrlAssignment_1"


    // $ANTLR start "rule__AuthEndpoint__Function_nameAssignment_3"
    // InternalSecurityDsl.g:6192:1: rule__AuthEndpoint__Function_nameAssignment_3 : ( ruleEString ) ;
    public final void rule__AuthEndpoint__Function_nameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6196:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6197:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6197:2: ( ruleEString )
            // InternalSecurityDsl.g:6198:3: ruleEString
            {
             before(grammarAccess.getAuthEndpointAccess().getFunction_nameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAuthEndpointAccess().getFunction_nameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthEndpoint__Function_nameAssignment_3"


    // $ANTLR start "rule__AuthEndpoint__MethodAssignment_5"
    // InternalSecurityDsl.g:6207:1: rule__AuthEndpoint__MethodAssignment_5 : ( ruleEEndpointMethod ) ;
    public final void rule__AuthEndpoint__MethodAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6211:1: ( ( ruleEEndpointMethod ) )
            // InternalSecurityDsl.g:6212:2: ( ruleEEndpointMethod )
            {
            // InternalSecurityDsl.g:6212:2: ( ruleEEndpointMethod )
            // InternalSecurityDsl.g:6213:3: ruleEEndpointMethod
            {
             before(grammarAccess.getAuthEndpointAccess().getMethodEEndpointMethodEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEEndpointMethod();

            state._fsp--;

             after(grammarAccess.getAuthEndpointAccess().getMethodEEndpointMethodEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthEndpoint__MethodAssignment_5"


    // $ANTLR start "rule__Authentication__NameAssignment_1"
    // InternalSecurityDsl.g:6222:1: rule__Authentication__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Authentication__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6226:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6227:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6227:2: ( ruleEString )
            // InternalSecurityDsl.g:6228:3: ruleEString
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


    // $ANTLR start "rule__Authentication__PathAssignment_3"
    // InternalSecurityDsl.g:6237:1: rule__Authentication__PathAssignment_3 : ( ruleEString ) ;
    public final void rule__Authentication__PathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6241:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6242:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6242:2: ( ruleEString )
            // InternalSecurityDsl.g:6243:3: ruleEString
            {
             before(grammarAccess.getAuthenticationAccess().getPathEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAuthenticationAccess().getPathEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__PathAssignment_3"


    // $ANTLR start "rule__Authentication__Signup_endpointAssignment_4_1"
    // InternalSecurityDsl.g:6252:1: rule__Authentication__Signup_endpointAssignment_4_1 : ( ruleAuthEndpoint ) ;
    public final void rule__Authentication__Signup_endpointAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6256:1: ( ( ruleAuthEndpoint ) )
            // InternalSecurityDsl.g:6257:2: ( ruleAuthEndpoint )
            {
            // InternalSecurityDsl.g:6257:2: ( ruleAuthEndpoint )
            // InternalSecurityDsl.g:6258:3: ruleAuthEndpoint
            {
             before(grammarAccess.getAuthenticationAccess().getSignup_endpointAuthEndpointParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAuthEndpoint();

            state._fsp--;

             after(grammarAccess.getAuthenticationAccess().getSignup_endpointAuthEndpointParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Signup_endpointAssignment_4_1"


    // $ANTLR start "rule__Authentication__Login_endpointAssignment_5_1"
    // InternalSecurityDsl.g:6267:1: rule__Authentication__Login_endpointAssignment_5_1 : ( ruleAuthEndpoint ) ;
    public final void rule__Authentication__Login_endpointAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6271:1: ( ( ruleAuthEndpoint ) )
            // InternalSecurityDsl.g:6272:2: ( ruleAuthEndpoint )
            {
            // InternalSecurityDsl.g:6272:2: ( ruleAuthEndpoint )
            // InternalSecurityDsl.g:6273:3: ruleAuthEndpoint
            {
             before(grammarAccess.getAuthenticationAccess().getLogin_endpointAuthEndpointParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAuthEndpoint();

            state._fsp--;

             after(grammarAccess.getAuthenticationAccess().getLogin_endpointAuthEndpointParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Login_endpointAssignment_5_1"


    // $ANTLR start "rule__Authentication__Logout_endpointAssignment_6_1"
    // InternalSecurityDsl.g:6282:1: rule__Authentication__Logout_endpointAssignment_6_1 : ( ruleAuthEndpoint ) ;
    public final void rule__Authentication__Logout_endpointAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6286:1: ( ( ruleAuthEndpoint ) )
            // InternalSecurityDsl.g:6287:2: ( ruleAuthEndpoint )
            {
            // InternalSecurityDsl.g:6287:2: ( ruleAuthEndpoint )
            // InternalSecurityDsl.g:6288:3: ruleAuthEndpoint
            {
             before(grammarAccess.getAuthenticationAccess().getLogout_endpointAuthEndpointParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAuthEndpoint();

            state._fsp--;

             after(grammarAccess.getAuthenticationAccess().getLogout_endpointAuthEndpointParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Logout_endpointAssignment_6_1"


    // $ANTLR start "rule__Authentication__Controller_endpointsAssignment_7_2"
    // InternalSecurityDsl.g:6297:1: rule__Authentication__Controller_endpointsAssignment_7_2 : ( ruleEndpoint ) ;
    public final void rule__Authentication__Controller_endpointsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6301:1: ( ( ruleEndpoint ) )
            // InternalSecurityDsl.g:6302:2: ( ruleEndpoint )
            {
            // InternalSecurityDsl.g:6302:2: ( ruleEndpoint )
            // InternalSecurityDsl.g:6303:3: ruleEndpoint
            {
             before(grammarAccess.getAuthenticationAccess().getController_endpointsEndpointParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEndpoint();

            state._fsp--;

             after(grammarAccess.getAuthenticationAccess().getController_endpointsEndpointParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Controller_endpointsAssignment_7_2"


    // $ANTLR start "rule__Authentication__Controller_endpointsAssignment_7_3_1"
    // InternalSecurityDsl.g:6312:1: rule__Authentication__Controller_endpointsAssignment_7_3_1 : ( ruleEndpoint ) ;
    public final void rule__Authentication__Controller_endpointsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6316:1: ( ( ruleEndpoint ) )
            // InternalSecurityDsl.g:6317:2: ( ruleEndpoint )
            {
            // InternalSecurityDsl.g:6317:2: ( ruleEndpoint )
            // InternalSecurityDsl.g:6318:3: ruleEndpoint
            {
             before(grammarAccess.getAuthenticationAccess().getController_endpointsEndpointParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEndpoint();

            state._fsp--;

             after(grammarAccess.getAuthenticationAccess().getController_endpointsEndpointParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authentication__Controller_endpointsAssignment_7_3_1"


    // $ANTLR start "rule__OtherController__NameAssignment_2"
    // InternalSecurityDsl.g:6327:1: rule__OtherController__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__OtherController__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6331:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6332:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6332:2: ( ruleEString )
            // InternalSecurityDsl.g:6333:3: ruleEString
            {
             before(grammarAccess.getOtherControllerAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOtherControllerAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherController__NameAssignment_2"


    // $ANTLR start "rule__OtherController__PathAssignment_4"
    // InternalSecurityDsl.g:6342:1: rule__OtherController__PathAssignment_4 : ( ruleEString ) ;
    public final void rule__OtherController__PathAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6346:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6347:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6347:2: ( ruleEString )
            // InternalSecurityDsl.g:6348:3: ruleEString
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
    // InternalSecurityDsl.g:6357:1: rule__OtherController__Controller_endpointsAssignment_5_2 : ( ruleEndpoint ) ;
    public final void rule__OtherController__Controller_endpointsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6361:1: ( ( ruleEndpoint ) )
            // InternalSecurityDsl.g:6362:2: ( ruleEndpoint )
            {
            // InternalSecurityDsl.g:6362:2: ( ruleEndpoint )
            // InternalSecurityDsl.g:6363:3: ruleEndpoint
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
    // InternalSecurityDsl.g:6372:1: rule__OtherController__Controller_endpointsAssignment_5_3_1 : ( ruleEndpoint ) ;
    public final void rule__OtherController__Controller_endpointsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6376:1: ( ( ruleEndpoint ) )
            // InternalSecurityDsl.g:6377:2: ( ruleEndpoint )
            {
            // InternalSecurityDsl.g:6377:2: ( ruleEndpoint )
            // InternalSecurityDsl.g:6378:3: ruleEndpoint
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
    // InternalSecurityDsl.g:6387:1: rule__JwtSecurity__MechanismAssignment_1 : ( ruleESecurityMechanism ) ;
    public final void rule__JwtSecurity__MechanismAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6391:1: ( ( ruleESecurityMechanism ) )
            // InternalSecurityDsl.g:6392:2: ( ruleESecurityMechanism )
            {
            // InternalSecurityDsl.g:6392:2: ( ruleESecurityMechanism )
            // InternalSecurityDsl.g:6393:3: ruleESecurityMechanism
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
    // InternalSecurityDsl.g:6402:1: rule__JwtSecurity__SignatureAlgorithmAssignment_5 : ( ruleEString ) ;
    public final void rule__JwtSecurity__SignatureAlgorithmAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6406:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6407:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6407:2: ( ruleEString )
            // InternalSecurityDsl.g:6408:3: ruleEString
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
    // InternalSecurityDsl.g:6417:1: rule__JwtSecurity__IssuerAssignment_8 : ( ruleEString ) ;
    public final void rule__JwtSecurity__IssuerAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6421:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6422:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6422:2: ( ruleEString )
            // InternalSecurityDsl.g:6423:3: ruleEString
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
    // InternalSecurityDsl.g:6432:1: rule__JwtSecurity__ExpirationTimeAssignment_10 : ( ruleEInt ) ;
    public final void rule__JwtSecurity__ExpirationTimeAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6436:1: ( ( ruleEInt ) )
            // InternalSecurityDsl.g:6437:2: ( ruleEInt )
            {
            // InternalSecurityDsl.g:6437:2: ( ruleEInt )
            // InternalSecurityDsl.g:6438:3: ruleEInt
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
    // InternalSecurityDsl.g:6447:1: rule__JwtSecurity__AudienceAssignment_12 : ( ruleEString ) ;
    public final void rule__JwtSecurity__AudienceAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6451:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6452:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6452:2: ( ruleEString )
            // InternalSecurityDsl.g:6453:3: ruleEString
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
    // InternalSecurityDsl.g:6462:1: rule__JwtSecurity__Security_claimsAssignment_13_2 : ( rulePublic ) ;
    public final void rule__JwtSecurity__Security_claimsAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6466:1: ( ( rulePublic ) )
            // InternalSecurityDsl.g:6467:2: ( rulePublic )
            {
            // InternalSecurityDsl.g:6467:2: ( rulePublic )
            // InternalSecurityDsl.g:6468:3: rulePublic
            {
             before(grammarAccess.getJwtSecurityAccess().getSecurity_claimsPublicParserRuleCall_13_2_0()); 
            pushFollow(FOLLOW_2);
            rulePublic();

            state._fsp--;

             after(grammarAccess.getJwtSecurityAccess().getSecurity_claimsPublicParserRuleCall_13_2_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:6477:1: rule__JwtSecurity__Security_claimsAssignment_13_3_1 : ( rulePublic ) ;
    public final void rule__JwtSecurity__Security_claimsAssignment_13_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6481:1: ( ( rulePublic ) )
            // InternalSecurityDsl.g:6482:2: ( rulePublic )
            {
            // InternalSecurityDsl.g:6482:2: ( rulePublic )
            // InternalSecurityDsl.g:6483:3: rulePublic
            {
             before(grammarAccess.getJwtSecurityAccess().getSecurity_claimsPublicParserRuleCall_13_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePublic();

            state._fsp--;

             after(grammarAccess.getJwtSecurityAccess().getSecurity_claimsPublicParserRuleCall_13_3_1_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:6492:1: rule__JwtSecurity__Security_claimsAssignment_14_2 : ( rulePrivate ) ;
    public final void rule__JwtSecurity__Security_claimsAssignment_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6496:1: ( ( rulePrivate ) )
            // InternalSecurityDsl.g:6497:2: ( rulePrivate )
            {
            // InternalSecurityDsl.g:6497:2: ( rulePrivate )
            // InternalSecurityDsl.g:6498:3: rulePrivate
            {
             before(grammarAccess.getJwtSecurityAccess().getSecurity_claimsPrivateParserRuleCall_14_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrivate();

            state._fsp--;

             after(grammarAccess.getJwtSecurityAccess().getSecurity_claimsPrivateParserRuleCall_14_2_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:6507:1: rule__JwtSecurity__Security_claimsAssignment_14_3_1 : ( rulePrivate ) ;
    public final void rule__JwtSecurity__Security_claimsAssignment_14_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6511:1: ( ( rulePrivate ) )
            // InternalSecurityDsl.g:6512:2: ( rulePrivate )
            {
            // InternalSecurityDsl.g:6512:2: ( rulePrivate )
            // InternalSecurityDsl.g:6513:3: rulePrivate
            {
             before(grammarAccess.getJwtSecurityAccess().getSecurity_claimsPrivateParserRuleCall_14_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrivate();

            state._fsp--;

             after(grammarAccess.getJwtSecurityAccess().getSecurity_claimsPrivateParserRuleCall_14_3_1_0()); 

            }


            }

        }
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
    // InternalSecurityDsl.g:6522:1: rule__JwtSecurity__SecretAssignment_17 : ( ruleEString ) ;
    public final void rule__JwtSecurity__SecretAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6526:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6527:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6527:2: ( ruleEString )
            // InternalSecurityDsl.g:6528:3: ruleEString
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


    // $ANTLR start "rule__Public__NameAssignment_1"
    // InternalSecurityDsl.g:6537:1: rule__Public__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Public__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6541:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6542:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6542:2: ( ruleEString )
            // InternalSecurityDsl.g:6543:3: ruleEString
            {
             before(grammarAccess.getPublicAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPublicAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Public__NameAssignment_1"


    // $ANTLR start "rule__Private__NameAssignment_1"
    // InternalSecurityDsl.g:6552:1: rule__Private__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Private__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityDsl.g:6556:1: ( ( ruleEString ) )
            // InternalSecurityDsl.g:6557:2: ( ruleEString )
            {
            // InternalSecurityDsl.g:6557:2: ( ruleEString )
            // InternalSecurityDsl.g:6558:3: ruleEString
            {
             before(grammarAccess.getPrivateAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPrivateAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Private__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000040F00000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000084000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000007FC000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0014000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0F00000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0804000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000D0L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000030000000030L});

}