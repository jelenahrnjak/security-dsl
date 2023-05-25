package org.ftn.domi.securitydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.ftn.domi.securitydsl.services.SecurityDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSecurityDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_NL", "RULE_TAB", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'application:'", "'name:'", "'description:'", "'database:'", "'security:'", "'vendorName:'", "'url:'", "'username:'", "'password:'", "'Attribute'", "'{'", "'type'", "'}'", "'User'", "'identifierName'", "'identifierType'", "'model_attributes'", "','", "'OtherModel'", "'Role'", "'Endpoint'", "'url'", "'function_name'", "'method'", "'roles_authority'", "'('", "')'", "'Authentication'", "'path'", "'controller_endpoints'", "'signup_endpoint'", "'login_endpoint'", "'logout_endpoint'", "'OtherController'", "'mechanism:'", "'jwt:'", "'header:'", "'signature-algorithm:'", "'payload:'", "'issuer:'", "'expiration-time:'", "'audience:'", "'public_claims:'", "'['", "']'", "'private_claims:'", "'signature:'", "'secret:'", "'-'", "'isPublic'", "'INT'", "'STRING'", "'FLOAT'", "'LONG'", "'CHAR'", "'BOOLEAN'", "'DOUBLE'", "'BYTE'", "'SHORT'", "'GET'", "'PUT'", "'POST'", "'DELETE'", "'JWT'", "'POSTGRES'", "'ORACLE'", "'MYSQL'"
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

        public InternalSecurityDslParser(TokenStream input, SecurityDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Application";
       	}

       	@Override
       	protected SecurityDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleApplication"
    // InternalSecurityDsl.g:65:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // InternalSecurityDsl.g:65:52: (iv_ruleApplication= ruleApplication EOF )
            // InternalSecurityDsl.g:66:2: iv_ruleApplication= ruleApplication EOF
            {
             newCompositeNode(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplication=ruleApplication();

            state._fsp--;

             current =iv_ruleApplication; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // InternalSecurityDsl.g:72:1: ruleApplication returns [EObject current=null] : ( () otherlv_1= 'application:' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'database:' ( (lv_app_database_7_0= ruleDatabase ) ) )? (otherlv_8= 'security:' ( (lv_app_security_9_0= ruleSecurity ) ) )? ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        EObject lv_app_database_7_0 = null;

        EObject lv_app_security_9_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:78:2: ( ( () otherlv_1= 'application:' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'database:' ( (lv_app_database_7_0= ruleDatabase ) ) )? (otherlv_8= 'security:' ( (lv_app_security_9_0= ruleSecurity ) ) )? ) )
            // InternalSecurityDsl.g:79:2: ( () otherlv_1= 'application:' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'database:' ( (lv_app_database_7_0= ruleDatabase ) ) )? (otherlv_8= 'security:' ( (lv_app_security_9_0= ruleSecurity ) ) )? )
            {
            // InternalSecurityDsl.g:79:2: ( () otherlv_1= 'application:' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'database:' ( (lv_app_database_7_0= ruleDatabase ) ) )? (otherlv_8= 'security:' ( (lv_app_security_9_0= ruleSecurity ) ) )? )
            // InternalSecurityDsl.g:80:3: () otherlv_1= 'application:' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'database:' ( (lv_app_database_7_0= ruleDatabase ) ) )? (otherlv_8= 'security:' ( (lv_app_security_9_0= ruleSecurity ) ) )?
            {
            // InternalSecurityDsl.g:80:3: ()
            // InternalSecurityDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getApplicationAccess().getApplicationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getApplicationAccess().getApplicationKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getApplicationAccess().getNameKeyword_2());
            		
            // InternalSecurityDsl.g:95:3: ( (lv_name_3_0= ruleEString ) )
            // InternalSecurityDsl.g:96:4: (lv_name_3_0= ruleEString )
            {
            // InternalSecurityDsl.g:96:4: (lv_name_3_0= ruleEString )
            // InternalSecurityDsl.g:97:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getApplicationAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplicationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.ftn.domi.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecurityDsl.g:114:3: (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSecurityDsl.g:115:4: otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getApplicationAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalSecurityDsl.g:119:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalSecurityDsl.g:120:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalSecurityDsl.g:120:5: (lv_description_5_0= ruleEString )
                    // InternalSecurityDsl.g:121:6: lv_description_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getApplicationAccess().getDescriptionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getApplicationRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"org.ftn.domi.securitydsl.SecurityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:139:3: (otherlv_6= 'database:' ( (lv_app_database_7_0= ruleDatabase ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSecurityDsl.g:140:4: otherlv_6= 'database:' ( (lv_app_database_7_0= ruleDatabase ) )
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getApplicationAccess().getDatabaseKeyword_5_0());
                    			
                    // InternalSecurityDsl.g:144:4: ( (lv_app_database_7_0= ruleDatabase ) )
                    // InternalSecurityDsl.g:145:5: (lv_app_database_7_0= ruleDatabase )
                    {
                    // InternalSecurityDsl.g:145:5: (lv_app_database_7_0= ruleDatabase )
                    // InternalSecurityDsl.g:146:6: lv_app_database_7_0= ruleDatabase
                    {

                    						newCompositeNode(grammarAccess.getApplicationAccess().getApp_databaseDatabaseParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_app_database_7_0=ruleDatabase();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getApplicationRule());
                    						}
                    						set(
                    							current,
                    							"app_database",
                    							lv_app_database_7_0,
                    							"org.ftn.domi.securitydsl.SecurityDsl.Database");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:164:3: (otherlv_8= 'security:' ( (lv_app_security_9_0= ruleSecurity ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSecurityDsl.g:165:4: otherlv_8= 'security:' ( (lv_app_security_9_0= ruleSecurity ) )
                    {
                    otherlv_8=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getApplicationAccess().getSecurityKeyword_6_0());
                    			
                    // InternalSecurityDsl.g:169:4: ( (lv_app_security_9_0= ruleSecurity ) )
                    // InternalSecurityDsl.g:170:5: (lv_app_security_9_0= ruleSecurity )
                    {
                    // InternalSecurityDsl.g:170:5: (lv_app_security_9_0= ruleSecurity )
                    // InternalSecurityDsl.g:171:6: lv_app_security_9_0= ruleSecurity
                    {

                    						newCompositeNode(grammarAccess.getApplicationAccess().getApp_securitySecurityParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_app_security_9_0=ruleSecurity();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getApplicationRule());
                    						}
                    						set(
                    							current,
                    							"app_security",
                    							lv_app_security_9_0,
                    							"org.ftn.domi.securitydsl.SecurityDsl.Security");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleSecurity"
    // InternalSecurityDsl.g:193:1: entryRuleSecurity returns [EObject current=null] : iv_ruleSecurity= ruleSecurity EOF ;
    public final EObject entryRuleSecurity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecurity = null;


        try {
            // InternalSecurityDsl.g:193:49: (iv_ruleSecurity= ruleSecurity EOF )
            // InternalSecurityDsl.g:194:2: iv_ruleSecurity= ruleSecurity EOF
            {
             newCompositeNode(grammarAccess.getSecurityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSecurity=ruleSecurity();

            state._fsp--;

             current =iv_ruleSecurity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSecurity"


    // $ANTLR start "ruleSecurity"
    // InternalSecurityDsl.g:200:1: ruleSecurity returns [EObject current=null] : this_JwtSecurity_0= ruleJwtSecurity ;
    public final EObject ruleSecurity() throws RecognitionException {
        EObject current = null;

        EObject this_JwtSecurity_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:206:2: (this_JwtSecurity_0= ruleJwtSecurity )
            // InternalSecurityDsl.g:207:2: this_JwtSecurity_0= ruleJwtSecurity
            {

            		newCompositeNode(grammarAccess.getSecurityAccess().getJwtSecurityParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_JwtSecurity_0=ruleJwtSecurity();

            state._fsp--;


            		current = this_JwtSecurity_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSecurity"


    // $ANTLR start "entryRuleEString"
    // InternalSecurityDsl.g:218:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSecurityDsl.g:218:47: (iv_ruleEString= ruleEString EOF )
            // InternalSecurityDsl.g:219:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSecurityDsl.g:225:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSecurityDsl.g:231:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSecurityDsl.g:232:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSecurityDsl.g:232:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSecurityDsl.g:233:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:241:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleDatabase"
    // InternalSecurityDsl.g:252:1: entryRuleDatabase returns [EObject current=null] : iv_ruleDatabase= ruleDatabase EOF ;
    public final EObject entryRuleDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabase = null;


        try {
            // InternalSecurityDsl.g:252:49: (iv_ruleDatabase= ruleDatabase EOF )
            // InternalSecurityDsl.g:253:2: iv_ruleDatabase= ruleDatabase EOF
            {
             newCompositeNode(grammarAccess.getDatabaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatabase=ruleDatabase();

            state._fsp--;

             current =iv_ruleDatabase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatabase"


    // $ANTLR start "ruleDatabase"
    // InternalSecurityDsl.g:259:1: ruleDatabase returns [EObject current=null] : (otherlv_0= 'vendorName:' ( (lv_vendorName_1_0= ruleEDatabaseType ) ) otherlv_2= 'url:' ( (lv_url_3_0= ruleEString ) ) otherlv_4= 'username:' ( (lv_username_5_0= ruleEString ) ) otherlv_6= 'password:' ( (lv_password_7_0= ruleEString ) ) ) ;
    public final EObject ruleDatabase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_vendorName_1_0 = null;

        AntlrDatatypeRuleToken lv_url_3_0 = null;

        AntlrDatatypeRuleToken lv_username_5_0 = null;

        AntlrDatatypeRuleToken lv_password_7_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:265:2: ( (otherlv_0= 'vendorName:' ( (lv_vendorName_1_0= ruleEDatabaseType ) ) otherlv_2= 'url:' ( (lv_url_3_0= ruleEString ) ) otherlv_4= 'username:' ( (lv_username_5_0= ruleEString ) ) otherlv_6= 'password:' ( (lv_password_7_0= ruleEString ) ) ) )
            // InternalSecurityDsl.g:266:2: (otherlv_0= 'vendorName:' ( (lv_vendorName_1_0= ruleEDatabaseType ) ) otherlv_2= 'url:' ( (lv_url_3_0= ruleEString ) ) otherlv_4= 'username:' ( (lv_username_5_0= ruleEString ) ) otherlv_6= 'password:' ( (lv_password_7_0= ruleEString ) ) )
            {
            // InternalSecurityDsl.g:266:2: (otherlv_0= 'vendorName:' ( (lv_vendorName_1_0= ruleEDatabaseType ) ) otherlv_2= 'url:' ( (lv_url_3_0= ruleEString ) ) otherlv_4= 'username:' ( (lv_username_5_0= ruleEString ) ) otherlv_6= 'password:' ( (lv_password_7_0= ruleEString ) ) )
            // InternalSecurityDsl.g:267:3: otherlv_0= 'vendorName:' ( (lv_vendorName_1_0= ruleEDatabaseType ) ) otherlv_2= 'url:' ( (lv_url_3_0= ruleEString ) ) otherlv_4= 'username:' ( (lv_username_5_0= ruleEString ) ) otherlv_6= 'password:' ( (lv_password_7_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDatabaseAccess().getVendorNameKeyword_0());
            		
            // InternalSecurityDsl.g:271:3: ( (lv_vendorName_1_0= ruleEDatabaseType ) )
            // InternalSecurityDsl.g:272:4: (lv_vendorName_1_0= ruleEDatabaseType )
            {
            // InternalSecurityDsl.g:272:4: (lv_vendorName_1_0= ruleEDatabaseType )
            // InternalSecurityDsl.g:273:5: lv_vendorName_1_0= ruleEDatabaseType
            {

            					newCompositeNode(grammarAccess.getDatabaseAccess().getVendorNameEDatabaseTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_vendorName_1_0=ruleEDatabaseType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatabaseRule());
            					}
            					set(
            						current,
            						"vendorName",
            						lv_vendorName_1_0,
            						"org.ftn.domi.securitydsl.SecurityDsl.EDatabaseType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getDatabaseAccess().getUrlKeyword_2());
            		
            // InternalSecurityDsl.g:294:3: ( (lv_url_3_0= ruleEString ) )
            // InternalSecurityDsl.g:295:4: (lv_url_3_0= ruleEString )
            {
            // InternalSecurityDsl.g:295:4: (lv_url_3_0= ruleEString )
            // InternalSecurityDsl.g:296:5: lv_url_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDatabaseAccess().getUrlEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_url_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatabaseRule());
            					}
            					set(
            						current,
            						"url",
            						lv_url_3_0,
            						"org.ftn.domi.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getDatabaseAccess().getUsernameKeyword_4());
            		
            // InternalSecurityDsl.g:317:3: ( (lv_username_5_0= ruleEString ) )
            // InternalSecurityDsl.g:318:4: (lv_username_5_0= ruleEString )
            {
            // InternalSecurityDsl.g:318:4: (lv_username_5_0= ruleEString )
            // InternalSecurityDsl.g:319:5: lv_username_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDatabaseAccess().getUsernameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_13);
            lv_username_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatabaseRule());
            					}
            					set(
            						current,
            						"username",
            						lv_username_5_0,
            						"org.ftn.domi.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getDatabaseAccess().getPasswordKeyword_6());
            		
            // InternalSecurityDsl.g:340:3: ( (lv_password_7_0= ruleEString ) )
            // InternalSecurityDsl.g:341:4: (lv_password_7_0= ruleEString )
            {
            // InternalSecurityDsl.g:341:4: (lv_password_7_0= ruleEString )
            // InternalSecurityDsl.g:342:5: lv_password_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDatabaseAccess().getPasswordEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_password_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatabaseRule());
            					}
            					set(
            						current,
            						"password",
            						lv_password_7_0,
            						"org.ftn.domi.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatabase"


    // $ANTLR start "entryRuleAttribute"
    // InternalSecurityDsl.g:363:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalSecurityDsl.g:363:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalSecurityDsl.g:364:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalSecurityDsl.g:370:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleEType ) ) otherlv_5= '}' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:376:2: ( (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleEType ) ) otherlv_5= '}' ) )
            // InternalSecurityDsl.g:377:2: (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleEType ) ) otherlv_5= '}' )
            {
            // InternalSecurityDsl.g:377:2: (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleEType ) ) otherlv_5= '}' )
            // InternalSecurityDsl.g:378:3: otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleEType ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalSecurityDsl.g:382:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSecurityDsl.g:383:4: (lv_name_1_0= ruleEString )
            {
            // InternalSecurityDsl.g:383:4: (lv_name_1_0= ruleEString )
            // InternalSecurityDsl.g:384:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.ftn.domi.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getTypeKeyword_3());
            		
            // InternalSecurityDsl.g:409:3: ( (lv_type_4_0= ruleEType ) )
            // InternalSecurityDsl.g:410:4: (lv_type_4_0= ruleEType )
            {
            // InternalSecurityDsl.g:410:4: (lv_type_4_0= ruleEType )
            // InternalSecurityDsl.g:411:5: lv_type_4_0= ruleEType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeETypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_type_4_0=ruleEType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"org.ftn.domi.securitydsl.SecurityDsl.EType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleUser"
    // InternalSecurityDsl.g:436:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // InternalSecurityDsl.g:436:45: (iv_ruleUser= ruleUser EOF )
            // InternalSecurityDsl.g:437:2: iv_ruleUser= ruleUser EOF
            {
             newCompositeNode(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUser=ruleUser();

            state._fsp--;

             current =iv_ruleUser; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // InternalSecurityDsl.g:443:1: ruleUser returns [EObject current=null] : (otherlv_0= 'User' otherlv_1= '{' otherlv_2= 'identifierName' ( (lv_identifierName_3_0= ruleEString ) ) otherlv_4= 'identifierType' ( (lv_identifierType_5_0= ruleEType ) ) (otherlv_6= 'model_attributes' otherlv_7= '{' ( (lv_model_attributes_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_model_attributes_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleUser() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_identifierName_3_0 = null;

        Enumerator lv_identifierType_5_0 = null;

        EObject lv_model_attributes_8_0 = null;

        EObject lv_model_attributes_10_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:449:2: ( (otherlv_0= 'User' otherlv_1= '{' otherlv_2= 'identifierName' ( (lv_identifierName_3_0= ruleEString ) ) otherlv_4= 'identifierType' ( (lv_identifierType_5_0= ruleEType ) ) (otherlv_6= 'model_attributes' otherlv_7= '{' ( (lv_model_attributes_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_model_attributes_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalSecurityDsl.g:450:2: (otherlv_0= 'User' otherlv_1= '{' otherlv_2= 'identifierName' ( (lv_identifierName_3_0= ruleEString ) ) otherlv_4= 'identifierType' ( (lv_identifierType_5_0= ruleEType ) ) (otherlv_6= 'model_attributes' otherlv_7= '{' ( (lv_model_attributes_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_model_attributes_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalSecurityDsl.g:450:2: (otherlv_0= 'User' otherlv_1= '{' otherlv_2= 'identifierName' ( (lv_identifierName_3_0= ruleEString ) ) otherlv_4= 'identifierType' ( (lv_identifierType_5_0= ruleEType ) ) (otherlv_6= 'model_attributes' otherlv_7= '{' ( (lv_model_attributes_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_model_attributes_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalSecurityDsl.g:451:3: otherlv_0= 'User' otherlv_1= '{' otherlv_2= 'identifierName' ( (lv_identifierName_3_0= ruleEString ) ) otherlv_4= 'identifierType' ( (lv_identifierType_5_0= ruleEType ) ) (otherlv_6= 'model_attributes' otherlv_7= '{' ( (lv_model_attributes_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_model_attributes_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getUserAccess().getUserKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getUserAccess().getIdentifierNameKeyword_2());
            		
            // InternalSecurityDsl.g:463:3: ( (lv_identifierName_3_0= ruleEString ) )
            // InternalSecurityDsl.g:464:4: (lv_identifierName_3_0= ruleEString )
            {
            // InternalSecurityDsl.g:464:4: (lv_identifierName_3_0= ruleEString )
            // InternalSecurityDsl.g:465:5: lv_identifierName_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUserAccess().getIdentifierNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_identifierName_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUserRule());
            					}
            					set(
            						current,
            						"identifierName",
            						lv_identifierName_3_0,
            						"org.ftn.domi.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getUserAccess().getIdentifierTypeKeyword_4());
            		
            // InternalSecurityDsl.g:486:3: ( (lv_identifierType_5_0= ruleEType ) )
            // InternalSecurityDsl.g:487:4: (lv_identifierType_5_0= ruleEType )
            {
            // InternalSecurityDsl.g:487:4: (lv_identifierType_5_0= ruleEType )
            // InternalSecurityDsl.g:488:5: lv_identifierType_5_0= ruleEType
            {

            					newCompositeNode(grammarAccess.getUserAccess().getIdentifierTypeETypeEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_20);
            lv_identifierType_5_0=ruleEType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUserRule());
            					}
            					set(
            						current,
            						"identifierType",
            						lv_identifierType_5_0,
            						"org.ftn.domi.securitydsl.SecurityDsl.EType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecurityDsl.g:505:3: (otherlv_6= 'model_attributes' otherlv_7= '{' ( (lv_model_attributes_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_model_attributes_10_0= ruleAttribute ) ) )* otherlv_11= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSecurityDsl.g:506:4: otherlv_6= 'model_attributes' otherlv_7= '{' ( (lv_model_attributes_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_model_attributes_10_0= ruleAttribute ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getUserAccess().getModel_attributesKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,23,FOLLOW_21); 

                    				newLeafNode(otherlv_7, grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalSecurityDsl.g:514:4: ( (lv_model_attributes_8_0= ruleAttribute ) )
                    // InternalSecurityDsl.g:515:5: (lv_model_attributes_8_0= ruleAttribute )
                    {
                    // InternalSecurityDsl.g:515:5: (lv_model_attributes_8_0= ruleAttribute )
                    // InternalSecurityDsl.g:516:6: lv_model_attributes_8_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getUserAccess().getModel_attributesAttributeParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_model_attributes_8_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUserRule());
                    						}
                    						add(
                    							current,
                    							"model_attributes",
                    							lv_model_attributes_8_0,
                    							"org.ftn.domi.securitydsl.SecurityDsl.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSecurityDsl.g:533:4: (otherlv_9= ',' ( (lv_model_attributes_10_0= ruleAttribute ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==30) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalSecurityDsl.g:534:5: otherlv_9= ',' ( (lv_model_attributes_10_0= ruleAttribute ) )
                    	    {
                    	    otherlv_9=(Token)match(input,30,FOLLOW_21); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getUserAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalSecurityDsl.g:538:5: ( (lv_model_attributes_10_0= ruleAttribute ) )
                    	    // InternalSecurityDsl.g:539:6: (lv_model_attributes_10_0= ruleAttribute )
                    	    {
                    	    // InternalSecurityDsl.g:539:6: (lv_model_attributes_10_0= ruleAttribute )
                    	    // InternalSecurityDsl.g:540:7: lv_model_attributes_10_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getUserAccess().getModel_attributesAttributeParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    lv_model_attributes_10_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUserRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"model_attributes",
                    	    								lv_model_attributes_10_0,
                    	    								"org.ftn.domi.securitydsl.SecurityDsl.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_11, grammarAccess.getUserAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getUserAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUser"


    // $ANTLR start "entryRuleOtherModel"
    // InternalSecurityDsl.g:571:1: entryRuleOtherModel returns [EObject current=null] : iv_ruleOtherModel= ruleOtherModel EOF ;
    public final EObject entryRuleOtherModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherModel = null;


        try {
            // InternalSecurityDsl.g:571:51: (iv_ruleOtherModel= ruleOtherModel EOF )
            // InternalSecurityDsl.g:572:2: iv_ruleOtherModel= ruleOtherModel EOF
            {
             newCompositeNode(grammarAccess.getOtherModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOtherModel=ruleOtherModel();

            state._fsp--;

             current =iv_ruleOtherModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOtherModel"


    // $ANTLR start "ruleOtherModel"
    // InternalSecurityDsl.g:578:1: ruleOtherModel returns [EObject current=null] : (otherlv_0= 'OtherModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'identifierName' ( (lv_identifierName_4_0= ruleEString ) ) otherlv_5= 'identifierType' ( (lv_identifierType_6_0= ruleEType ) ) (otherlv_7= 'model_attributes' otherlv_8= '{' ( (lv_model_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_model_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleOtherModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_identifierName_4_0 = null;

        Enumerator lv_identifierType_6_0 = null;

        EObject lv_model_attributes_9_0 = null;

        EObject lv_model_attributes_11_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:584:2: ( (otherlv_0= 'OtherModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'identifierName' ( (lv_identifierName_4_0= ruleEString ) ) otherlv_5= 'identifierType' ( (lv_identifierType_6_0= ruleEType ) ) (otherlv_7= 'model_attributes' otherlv_8= '{' ( (lv_model_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_model_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // InternalSecurityDsl.g:585:2: (otherlv_0= 'OtherModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'identifierName' ( (lv_identifierName_4_0= ruleEString ) ) otherlv_5= 'identifierType' ( (lv_identifierType_6_0= ruleEType ) ) (otherlv_7= 'model_attributes' otherlv_8= '{' ( (lv_model_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_model_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // InternalSecurityDsl.g:585:2: (otherlv_0= 'OtherModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'identifierName' ( (lv_identifierName_4_0= ruleEString ) ) otherlv_5= 'identifierType' ( (lv_identifierType_6_0= ruleEType ) ) (otherlv_7= 'model_attributes' otherlv_8= '{' ( (lv_model_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_model_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // InternalSecurityDsl.g:586:3: otherlv_0= 'OtherModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'identifierName' ( (lv_identifierName_4_0= ruleEString ) ) otherlv_5= 'identifierType' ( (lv_identifierType_6_0= ruleEType ) ) (otherlv_7= 'model_attributes' otherlv_8= '{' ( (lv_model_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_model_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOtherModelAccess().getOtherModelKeyword_0());
            		
            // InternalSecurityDsl.g:590:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSecurityDsl.g:591:4: (lv_name_1_0= ruleEString )
            {
            // InternalSecurityDsl.g:591:4: (lv_name_1_0= ruleEString )
            // InternalSecurityDsl.g:592:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOtherModelAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOtherModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.ftn.domi.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getOtherModelAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getOtherModelAccess().getIdentifierNameKeyword_3());
            		
            // InternalSecurityDsl.g:617:3: ( (lv_identifierName_4_0= ruleEString ) )
            // InternalSecurityDsl.g:618:4: (lv_identifierName_4_0= ruleEString )
            {
            // InternalSecurityDsl.g:618:4: (lv_identifierName_4_0= ruleEString )
            // InternalSecurityDsl.g:619:5: lv_identifierName_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOtherModelAccess().getIdentifierNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_19);
            lv_identifierName_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOtherModelRule());
            					}
            					set(
            						current,
            						"identifierName",
            						lv_identifierName_4_0,
            						"org.ftn.domi.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getOtherModelAccess().getIdentifierTypeKeyword_5());
            		
            // InternalSecurityDsl.g:640:3: ( (lv_identifierType_6_0= ruleEType ) )
            // InternalSecurityDsl.g:641:4: (lv_identifierType_6_0= ruleEType )
            {
            // InternalSecurityDsl.g:641:4: (lv_identifierType_6_0= ruleEType )
            // InternalSecurityDsl.g:642:5: lv_identifierType_6_0= ruleEType
            {

            					newCompositeNode(grammarAccess.getOtherModelAccess().getIdentifierTypeETypeEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_20);
            lv_identifierType_6_0=ruleEType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOtherModelRule());
            					}
            					set(
            						current,
            						"identifierType",
            						lv_identifierType_6_0,
            						"org.ftn.domi.securitydsl.SecurityDsl.EType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecurityDsl.g:659:3: (otherlv_7= 'model_attributes' otherlv_8= '{' ( (lv_model_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_model_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSecurityDsl.g:660:4: otherlv_7= 'model_attributes' otherlv_8= '{' ( (lv_model_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_model_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,29,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getOtherModelAccess().getModel_attributesKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,23,FOLLOW_21); 

                    				newLeafNode(otherlv_8, grammarAccess.getOtherModelAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalSecurityDsl.g:668:4: ( (lv_model_attributes_9_0= ruleAttribute ) )
                    // InternalSecurityDsl.g:669:5: (lv_model_attributes_9_0= ruleAttribute )
                    {
                    // InternalSecurityDsl.g:669:5: (lv_model_attributes_9_0= ruleAttribute )
                    // InternalSecurityDsl.g:670:6: lv_model_attributes_9_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getOtherModelAccess().getModel_attributesAttributeParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_model_attributes_9_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOtherModelRule());
                    						}
                    						add(
                    							current,
                    							"model_attributes",
                    							lv_model_attributes_9_0,
                    							"org.ftn.domi.securitydsl.SecurityDsl.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSecurityDsl.g:687:4: (otherlv_10= ',' ( (lv_model_attributes_11_0= ruleAttribute ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==30) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalSecurityDsl.g:688:5: otherlv_10= ',' ( (lv_model_attributes_11_0= ruleAttribute ) )
                    	    {
                    	    otherlv_10=(Token)match(input,30,FOLLOW_21); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getOtherModelAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalSecurityDsl.g:692:5: ( (lv_model_attributes_11_0= ruleAttribute ) )
                    	    // InternalSecurityDsl.g:693:6: (lv_model_attributes_11_0= ruleAttribute )
                    	    {
                    	    // InternalSecurityDsl.g:693:6: (lv_model_attributes_11_0= ruleAttribute )
                    	    // InternalSecurityDsl.g:694:7: lv_model_attributes_11_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getOtherModelAccess().getModel_attributesAttributeParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    lv_model_attributes_11_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOtherModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"model_attributes",
                    	    								lv_model_attributes_11_0,
                    	    								"org.ftn.domi.securitydsl.SecurityDsl.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_12, grammarAccess.getOtherModelAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getOtherModelAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOtherModel"


    // $ANTLR start "entryRuleRole"
    // InternalSecurityDsl.g:725:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalSecurityDsl.g:725:45: (iv_ruleRole= ruleRole EOF )
            // InternalSecurityDsl.g:726:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalSecurityDsl.g:732:1: ruleRole returns [EObject current=null] : (otherlv_0= 'Role' otherlv_1= '{' otherlv_2= 'identifierName' ( (lv_identifierName_3_0= ruleEString ) ) otherlv_4= 'identifierType' ( (lv_identifierType_5_0= ruleEType ) ) (otherlv_6= 'model_attributes' otherlv_7= '{' ( (lv_model_attributes_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_model_attributes_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_identifierName_3_0 = null;

        Enumerator lv_identifierType_5_0 = null;

        EObject lv_model_attributes_8_0 = null;

        EObject lv_model_attributes_10_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:738:2: ( (otherlv_0= 'Role' otherlv_1= '{' otherlv_2= 'identifierName' ( (lv_identifierName_3_0= ruleEString ) ) otherlv_4= 'identifierType' ( (lv_identifierType_5_0= ruleEType ) ) (otherlv_6= 'model_attributes' otherlv_7= '{' ( (lv_model_attributes_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_model_attributes_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalSecurityDsl.g:739:2: (otherlv_0= 'Role' otherlv_1= '{' otherlv_2= 'identifierName' ( (lv_identifierName_3_0= ruleEString ) ) otherlv_4= 'identifierType' ( (lv_identifierType_5_0= ruleEType ) ) (otherlv_6= 'model_attributes' otherlv_7= '{' ( (lv_model_attributes_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_model_attributes_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalSecurityDsl.g:739:2: (otherlv_0= 'Role' otherlv_1= '{' otherlv_2= 'identifierName' ( (lv_identifierName_3_0= ruleEString ) ) otherlv_4= 'identifierType' ( (lv_identifierType_5_0= ruleEType ) ) (otherlv_6= 'model_attributes' otherlv_7= '{' ( (lv_model_attributes_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_model_attributes_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalSecurityDsl.g:740:3: otherlv_0= 'Role' otherlv_1= '{' otherlv_2= 'identifierName' ( (lv_identifierName_3_0= ruleEString ) ) otherlv_4= 'identifierType' ( (lv_identifierType_5_0= ruleEType ) ) (otherlv_6= 'model_attributes' otherlv_7= '{' ( (lv_model_attributes_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_model_attributes_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getRoleKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRoleAccess().getIdentifierNameKeyword_2());
            		
            // InternalSecurityDsl.g:752:3: ( (lv_identifierName_3_0= ruleEString ) )
            // InternalSecurityDsl.g:753:4: (lv_identifierName_3_0= ruleEString )
            {
            // InternalSecurityDsl.g:753:4: (lv_identifierName_3_0= ruleEString )
            // InternalSecurityDsl.g:754:5: lv_identifierName_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRoleAccess().getIdentifierNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_identifierName_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoleRule());
            					}
            					set(
            						current,
            						"identifierName",
            						lv_identifierName_3_0,
            						"org.ftn.domi.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getRoleAccess().getIdentifierTypeKeyword_4());
            		
            // InternalSecurityDsl.g:775:3: ( (lv_identifierType_5_0= ruleEType ) )
            // InternalSecurityDsl.g:776:4: (lv_identifierType_5_0= ruleEType )
            {
            // InternalSecurityDsl.g:776:4: (lv_identifierType_5_0= ruleEType )
            // InternalSecurityDsl.g:777:5: lv_identifierType_5_0= ruleEType
            {

            					newCompositeNode(grammarAccess.getRoleAccess().getIdentifierTypeETypeEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_20);
            lv_identifierType_5_0=ruleEType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoleRule());
            					}
            					set(
            						current,
            						"identifierType",
            						lv_identifierType_5_0,
            						"org.ftn.domi.securitydsl.SecurityDsl.EType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecurityDsl.g:794:3: (otherlv_6= 'model_attributes' otherlv_7= '{' ( (lv_model_attributes_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_model_attributes_10_0= ruleAttribute ) ) )* otherlv_11= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSecurityDsl.g:795:4: otherlv_6= 'model_attributes' otherlv_7= '{' ( (lv_model_attributes_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_model_attributes_10_0= ruleAttribute ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getRoleAccess().getModel_attributesKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,23,FOLLOW_21); 

                    				newLeafNode(otherlv_7, grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalSecurityDsl.g:803:4: ( (lv_model_attributes_8_0= ruleAttribute ) )
                    // InternalSecurityDsl.g:804:5: (lv_model_attributes_8_0= ruleAttribute )
                    {
                    // InternalSecurityDsl.g:804:5: (lv_model_attributes_8_0= ruleAttribute )
                    // InternalSecurityDsl.g:805:6: lv_model_attributes_8_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getRoleAccess().getModel_attributesAttributeParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_model_attributes_8_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoleRule());
                    						}
                    						add(
                    							current,
                    							"model_attributes",
                    							lv_model_attributes_8_0,
                    							"org.ftn.domi.securitydsl.SecurityDsl.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSecurityDsl.g:822:4: (otherlv_9= ',' ( (lv_model_attributes_10_0= ruleAttribute ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==30) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalSecurityDsl.g:823:5: otherlv_9= ',' ( (lv_model_attributes_10_0= ruleAttribute ) )
                    	    {
                    	    otherlv_9=(Token)match(input,30,FOLLOW_21); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getRoleAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalSecurityDsl.g:827:5: ( (lv_model_attributes_10_0= ruleAttribute ) )
                    	    // InternalSecurityDsl.g:828:6: (lv_model_attributes_10_0= ruleAttribute )
                    	    {
                    	    // InternalSecurityDsl.g:828:6: (lv_model_attributes_10_0= ruleAttribute )
                    	    // InternalSecurityDsl.g:829:7: lv_model_attributes_10_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getRoleAccess().getModel_attributesAttributeParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    lv_model_attributes_10_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRoleRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"model_attributes",
                    	    								lv_model_attributes_10_0,
                    	    								"org.ftn.domi.securitydsl.SecurityDsl.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_11, grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleEndpoint"
    // InternalSecurityDsl.g:860:1: entryRuleEndpoint returns [EObject current=null] : iv_ruleEndpoint= ruleEndpoint EOF ;
    public final EObject entryRuleEndpoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndpoint = null;


        try {
            // InternalSecurityDsl.g:860:49: (iv_ruleEndpoint= ruleEndpoint EOF )
            // InternalSecurityDsl.g:861:2: iv_ruleEndpoint= ruleEndpoint EOF
            {
             newCompositeNode(grammarAccess.getEndpointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndpoint=ruleEndpoint();

            state._fsp--;

             current =iv_ruleEndpoint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEndpoint"


    // $ANTLR start "ruleEndpoint"
    // InternalSecurityDsl.g:867:1: ruleEndpoint returns [EObject current=null] : (otherlv_0= 'Endpoint' otherlv_1= '{' otherlv_2= 'url' ( (lv_url_3_0= ruleEString ) ) otherlv_4= 'function_name' ( (lv_function_name_5_0= ruleEString ) ) otherlv_6= 'method' ( (lv_method_7_0= ruleEEndpointMethod ) ) (otherlv_8= 'roles_authority' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= '}' ) ;
    public final EObject ruleEndpoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_url_3_0 = null;

        AntlrDatatypeRuleToken lv_function_name_5_0 = null;

        Enumerator lv_method_7_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:873:2: ( (otherlv_0= 'Endpoint' otherlv_1= '{' otherlv_2= 'url' ( (lv_url_3_0= ruleEString ) ) otherlv_4= 'function_name' ( (lv_function_name_5_0= ruleEString ) ) otherlv_6= 'method' ( (lv_method_7_0= ruleEEndpointMethod ) ) (otherlv_8= 'roles_authority' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= '}' ) )
            // InternalSecurityDsl.g:874:2: (otherlv_0= 'Endpoint' otherlv_1= '{' otherlv_2= 'url' ( (lv_url_3_0= ruleEString ) ) otherlv_4= 'function_name' ( (lv_function_name_5_0= ruleEString ) ) otherlv_6= 'method' ( (lv_method_7_0= ruleEEndpointMethod ) ) (otherlv_8= 'roles_authority' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= '}' )
            {
            // InternalSecurityDsl.g:874:2: (otherlv_0= 'Endpoint' otherlv_1= '{' otherlv_2= 'url' ( (lv_url_3_0= ruleEString ) ) otherlv_4= 'function_name' ( (lv_function_name_5_0= ruleEString ) ) otherlv_6= 'method' ( (lv_method_7_0= ruleEEndpointMethod ) ) (otherlv_8= 'roles_authority' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= '}' )
            // InternalSecurityDsl.g:875:3: otherlv_0= 'Endpoint' otherlv_1= '{' otherlv_2= 'url' ( (lv_url_3_0= ruleEString ) ) otherlv_4= 'function_name' ( (lv_function_name_5_0= ruleEString ) ) otherlv_6= 'method' ( (lv_method_7_0= ruleEEndpointMethod ) ) (otherlv_8= 'roles_authority' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getEndpointAccess().getEndpointKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getEndpointAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getEndpointAccess().getUrlKeyword_2());
            		
            // InternalSecurityDsl.g:887:3: ( (lv_url_3_0= ruleEString ) )
            // InternalSecurityDsl.g:888:4: (lv_url_3_0= ruleEString )
            {
            // InternalSecurityDsl.g:888:4: (lv_url_3_0= ruleEString )
            // InternalSecurityDsl.g:889:5: lv_url_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEndpointAccess().getUrlEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
            lv_url_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEndpointRule());
            					}
            					set(
            						current,
            						"url",
            						lv_url_3_0,
            						"org.ftn.domi.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getEndpointAccess().getFunction_nameKeyword_4());
            		
            // InternalSecurityDsl.g:910:3: ( (lv_function_name_5_0= ruleEString ) )
            // InternalSecurityDsl.g:911:4: (lv_function_name_5_0= ruleEString )
            {
            // InternalSecurityDsl.g:911:4: (lv_function_name_5_0= ruleEString )
            // InternalSecurityDsl.g:912:5: lv_function_name_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEndpointAccess().getFunction_nameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_25);
            lv_function_name_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEndpointRule());
            					}
            					set(
            						current,
            						"function_name",
            						lv_function_name_5_0,
            						"org.ftn.domi.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,36,FOLLOW_26); 

            			newLeafNode(otherlv_6, grammarAccess.getEndpointAccess().getMethodKeyword_6());
            		
            // InternalSecurityDsl.g:933:3: ( (lv_method_7_0= ruleEEndpointMethod ) )
            // InternalSecurityDsl.g:934:4: (lv_method_7_0= ruleEEndpointMethod )
            {
            // InternalSecurityDsl.g:934:4: (lv_method_7_0= ruleEEndpointMethod )
            // InternalSecurityDsl.g:935:5: lv_method_7_0= ruleEEndpointMethod
            {

            					newCompositeNode(grammarAccess.getEndpointAccess().getMethodEEndpointMethodEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_27);
            lv_method_7_0=ruleEEndpointMethod();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEndpointRule());
            					}
            					set(
            						current,
            						"method",
            						lv_method_7_0,
            						"org.ftn.domi.securitydsl.SecurityDsl.EEndpointMethod");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecurityDsl.g:952:3: (otherlv_8= 'roles_authority' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==37) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSecurityDsl.g:953:4: otherlv_8= 'roles_authority' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')'
                    {
                    otherlv_8=(Token)match(input,37,FOLLOW_28); 

                    				newLeafNode(otherlv_8, grammarAccess.getEndpointAccess().getRoles_authorityKeyword_8_0());
                    			
                    otherlv_9=(Token)match(input,38,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getEndpointAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalSecurityDsl.g:961:4: ( ( ruleEString ) )
                    // InternalSecurityDsl.g:962:5: ( ruleEString )
                    {
                    // InternalSecurityDsl.g:962:5: ( ruleEString )
                    // InternalSecurityDsl.g:963:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEndpointRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEndpointAccess().getRoles_authorityRoleCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_29);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSecurityDsl.g:977:4: (otherlv_11= ',' ( ( ruleEString ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==30) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSecurityDsl.g:978:5: otherlv_11= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_11=(Token)match(input,30,FOLLOW_4); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getEndpointAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalSecurityDsl.g:982:5: ( ( ruleEString ) )
                    	    // InternalSecurityDsl.g:983:6: ( ruleEString )
                    	    {
                    	    // InternalSecurityDsl.g:983:6: ( ruleEString )
                    	    // InternalSecurityDsl.g:984:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEndpointRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEndpointAccess().getRoles_authorityRoleCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,39,FOLLOW_17); 

                    				newLeafNode(otherlv_13, grammarAccess.getEndpointAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getEndpointAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEndpoint"


    // $ANTLR start "entryRuleAuthentication"
    // InternalSecurityDsl.g:1012:1: entryRuleAuthentication returns [EObject current=null] : iv_ruleAuthentication= ruleAuthentication EOF ;
    public final EObject entryRuleAuthentication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthentication = null;


        try {
            // InternalSecurityDsl.g:1012:55: (iv_ruleAuthentication= ruleAuthentication EOF )
            // InternalSecurityDsl.g:1013:2: iv_ruleAuthentication= ruleAuthentication EOF
            {
             newCompositeNode(grammarAccess.getAuthenticationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAuthentication=ruleAuthentication();

            state._fsp--;

             current =iv_ruleAuthentication; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAuthentication"


    // $ANTLR start "ruleAuthentication"
    // InternalSecurityDsl.g:1019:1: ruleAuthentication returns [EObject current=null] : (otherlv_0= 'Authentication' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'path' ( (lv_path_4_0= ruleEString ) ) (otherlv_5= 'controller_endpoints' otherlv_6= '{' ( (lv_controller_endpoints_7_0= ruleEndpoint ) ) (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )* otherlv_10= '}' )? (otherlv_11= 'signup_endpoint' ( (lv_signup_endpoint_12_0= ruleEndpoint ) ) )? (otherlv_13= 'login_endpoint' ( (lv_login_endpoint_14_0= ruleEndpoint ) ) )? (otherlv_15= 'logout_endpoint' ( (lv_logout_endpoint_16_0= ruleEndpoint ) ) )? otherlv_17= '}' ) ;
    public final EObject ruleAuthentication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_path_4_0 = null;

        EObject lv_controller_endpoints_7_0 = null;

        EObject lv_controller_endpoints_9_0 = null;

        EObject lv_signup_endpoint_12_0 = null;

        EObject lv_login_endpoint_14_0 = null;

        EObject lv_logout_endpoint_16_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:1025:2: ( (otherlv_0= 'Authentication' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'path' ( (lv_path_4_0= ruleEString ) ) (otherlv_5= 'controller_endpoints' otherlv_6= '{' ( (lv_controller_endpoints_7_0= ruleEndpoint ) ) (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )* otherlv_10= '}' )? (otherlv_11= 'signup_endpoint' ( (lv_signup_endpoint_12_0= ruleEndpoint ) ) )? (otherlv_13= 'login_endpoint' ( (lv_login_endpoint_14_0= ruleEndpoint ) ) )? (otherlv_15= 'logout_endpoint' ( (lv_logout_endpoint_16_0= ruleEndpoint ) ) )? otherlv_17= '}' ) )
            // InternalSecurityDsl.g:1026:2: (otherlv_0= 'Authentication' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'path' ( (lv_path_4_0= ruleEString ) ) (otherlv_5= 'controller_endpoints' otherlv_6= '{' ( (lv_controller_endpoints_7_0= ruleEndpoint ) ) (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )* otherlv_10= '}' )? (otherlv_11= 'signup_endpoint' ( (lv_signup_endpoint_12_0= ruleEndpoint ) ) )? (otherlv_13= 'login_endpoint' ( (lv_login_endpoint_14_0= ruleEndpoint ) ) )? (otherlv_15= 'logout_endpoint' ( (lv_logout_endpoint_16_0= ruleEndpoint ) ) )? otherlv_17= '}' )
            {
            // InternalSecurityDsl.g:1026:2: (otherlv_0= 'Authentication' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'path' ( (lv_path_4_0= ruleEString ) ) (otherlv_5= 'controller_endpoints' otherlv_6= '{' ( (lv_controller_endpoints_7_0= ruleEndpoint ) ) (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )* otherlv_10= '}' )? (otherlv_11= 'signup_endpoint' ( (lv_signup_endpoint_12_0= ruleEndpoint ) ) )? (otherlv_13= 'login_endpoint' ( (lv_login_endpoint_14_0= ruleEndpoint ) ) )? (otherlv_15= 'logout_endpoint' ( (lv_logout_endpoint_16_0= ruleEndpoint ) ) )? otherlv_17= '}' )
            // InternalSecurityDsl.g:1027:3: otherlv_0= 'Authentication' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'path' ( (lv_path_4_0= ruleEString ) ) (otherlv_5= 'controller_endpoints' otherlv_6= '{' ( (lv_controller_endpoints_7_0= ruleEndpoint ) ) (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )* otherlv_10= '}' )? (otherlv_11= 'signup_endpoint' ( (lv_signup_endpoint_12_0= ruleEndpoint ) ) )? (otherlv_13= 'login_endpoint' ( (lv_login_endpoint_14_0= ruleEndpoint ) ) )? (otherlv_15= 'logout_endpoint' ( (lv_logout_endpoint_16_0= ruleEndpoint ) ) )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAuthenticationAccess().getAuthenticationKeyword_0());
            		
            // InternalSecurityDsl.g:1031:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSecurityDsl.g:1032:4: (lv_name_1_0= ruleEString )
            {
            // InternalSecurityDsl.g:1032:4: (lv_name_1_0= ruleEString )
            // InternalSecurityDsl.g:1033:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAuthenticationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAuthenticationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.ftn.domi.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getAuthenticationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getAuthenticationAccess().getPathKeyword_3());
            		
            // InternalSecurityDsl.g:1058:3: ( (lv_path_4_0= ruleEString ) )
            // InternalSecurityDsl.g:1059:4: (lv_path_4_0= ruleEString )
            {
            // InternalSecurityDsl.g:1059:4: (lv_path_4_0= ruleEString )
            // InternalSecurityDsl.g:1060:5: lv_path_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAuthenticationAccess().getPathEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_31);
            lv_path_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAuthenticationRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_4_0,
            						"org.ftn.domi.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecurityDsl.g:1077:3: (otherlv_5= 'controller_endpoints' otherlv_6= '{' ( (lv_controller_endpoints_7_0= ruleEndpoint ) ) (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )* otherlv_10= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==42) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSecurityDsl.g:1078:4: otherlv_5= 'controller_endpoints' otherlv_6= '{' ( (lv_controller_endpoints_7_0= ruleEndpoint ) ) (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,42,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getAuthenticationAccess().getController_endpointsKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,23,FOLLOW_32); 

                    				newLeafNode(otherlv_6, grammarAccess.getAuthenticationAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalSecurityDsl.g:1086:4: ( (lv_controller_endpoints_7_0= ruleEndpoint ) )
                    // InternalSecurityDsl.g:1087:5: (lv_controller_endpoints_7_0= ruleEndpoint )
                    {
                    // InternalSecurityDsl.g:1087:5: (lv_controller_endpoints_7_0= ruleEndpoint )
                    // InternalSecurityDsl.g:1088:6: lv_controller_endpoints_7_0= ruleEndpoint
                    {

                    						newCompositeNode(grammarAccess.getAuthenticationAccess().getController_endpointsEndpointParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_controller_endpoints_7_0=ruleEndpoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAuthenticationRule());
                    						}
                    						add(
                    							current,
                    							"controller_endpoints",
                    							lv_controller_endpoints_7_0,
                    							"org.ftn.domi.securitydsl.SecurityDsl.Endpoint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSecurityDsl.g:1105:4: (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==30) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalSecurityDsl.g:1106:5: otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) )
                    	    {
                    	    otherlv_8=(Token)match(input,30,FOLLOW_32); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getAuthenticationAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSecurityDsl.g:1110:5: ( (lv_controller_endpoints_9_0= ruleEndpoint ) )
                    	    // InternalSecurityDsl.g:1111:6: (lv_controller_endpoints_9_0= ruleEndpoint )
                    	    {
                    	    // InternalSecurityDsl.g:1111:6: (lv_controller_endpoints_9_0= ruleEndpoint )
                    	    // InternalSecurityDsl.g:1112:7: lv_controller_endpoints_9_0= ruleEndpoint
                    	    {

                    	    							newCompositeNode(grammarAccess.getAuthenticationAccess().getController_endpointsEndpointParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    lv_controller_endpoints_9_0=ruleEndpoint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAuthenticationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"controller_endpoints",
                    	    								lv_controller_endpoints_9_0,
                    	    								"org.ftn.domi.securitydsl.SecurityDsl.Endpoint");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,25,FOLLOW_33); 

                    				newLeafNode(otherlv_10, grammarAccess.getAuthenticationAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalSecurityDsl.g:1135:3: (otherlv_11= 'signup_endpoint' ( (lv_signup_endpoint_12_0= ruleEndpoint ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==43) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSecurityDsl.g:1136:4: otherlv_11= 'signup_endpoint' ( (lv_signup_endpoint_12_0= ruleEndpoint ) )
                    {
                    otherlv_11=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_11, grammarAccess.getAuthenticationAccess().getSignup_endpointKeyword_6_0());
                    			
                    // InternalSecurityDsl.g:1140:4: ( (lv_signup_endpoint_12_0= ruleEndpoint ) )
                    // InternalSecurityDsl.g:1141:5: (lv_signup_endpoint_12_0= ruleEndpoint )
                    {
                    // InternalSecurityDsl.g:1141:5: (lv_signup_endpoint_12_0= ruleEndpoint )
                    // InternalSecurityDsl.g:1142:6: lv_signup_endpoint_12_0= ruleEndpoint
                    {

                    						newCompositeNode(grammarAccess.getAuthenticationAccess().getSignup_endpointEndpointParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_signup_endpoint_12_0=ruleEndpoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAuthenticationRule());
                    						}
                    						set(
                    							current,
                    							"signup_endpoint",
                    							lv_signup_endpoint_12_0,
                    							"org.ftn.domi.securitydsl.SecurityDsl.Endpoint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:1160:3: (otherlv_13= 'login_endpoint' ( (lv_login_endpoint_14_0= ruleEndpoint ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==44) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSecurityDsl.g:1161:4: otherlv_13= 'login_endpoint' ( (lv_login_endpoint_14_0= ruleEndpoint ) )
                    {
                    otherlv_13=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_13, grammarAccess.getAuthenticationAccess().getLogin_endpointKeyword_7_0());
                    			
                    // InternalSecurityDsl.g:1165:4: ( (lv_login_endpoint_14_0= ruleEndpoint ) )
                    // InternalSecurityDsl.g:1166:5: (lv_login_endpoint_14_0= ruleEndpoint )
                    {
                    // InternalSecurityDsl.g:1166:5: (lv_login_endpoint_14_0= ruleEndpoint )
                    // InternalSecurityDsl.g:1167:6: lv_login_endpoint_14_0= ruleEndpoint
                    {

                    						newCompositeNode(grammarAccess.getAuthenticationAccess().getLogin_endpointEndpointParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_login_endpoint_14_0=ruleEndpoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAuthenticationRule());
                    						}
                    						set(
                    							current,
                    							"login_endpoint",
                    							lv_login_endpoint_14_0,
                    							"org.ftn.domi.securitydsl.SecurityDsl.Endpoint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:1185:3: (otherlv_15= 'logout_endpoint' ( (lv_logout_endpoint_16_0= ruleEndpoint ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==45) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSecurityDsl.g:1186:4: otherlv_15= 'logout_endpoint' ( (lv_logout_endpoint_16_0= ruleEndpoint ) )
                    {
                    otherlv_15=(Token)match(input,45,FOLLOW_32); 

                    				newLeafNode(otherlv_15, grammarAccess.getAuthenticationAccess().getLogout_endpointKeyword_8_0());
                    			
                    // InternalSecurityDsl.g:1190:4: ( (lv_logout_endpoint_16_0= ruleEndpoint ) )
                    // InternalSecurityDsl.g:1191:5: (lv_logout_endpoint_16_0= ruleEndpoint )
                    {
                    // InternalSecurityDsl.g:1191:5: (lv_logout_endpoint_16_0= ruleEndpoint )
                    // InternalSecurityDsl.g:1192:6: lv_logout_endpoint_16_0= ruleEndpoint
                    {

                    						newCompositeNode(grammarAccess.getAuthenticationAccess().getLogout_endpointEndpointParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_logout_endpoint_16_0=ruleEndpoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAuthenticationRule());
                    						}
                    						set(
                    							current,
                    							"logout_endpoint",
                    							lv_logout_endpoint_16_0,
                    							"org.ftn.domi.securitydsl.SecurityDsl.Endpoint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getAuthenticationAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAuthentication"


    // $ANTLR start "entryRuleOtherController"
    // InternalSecurityDsl.g:1218:1: entryRuleOtherController returns [EObject current=null] : iv_ruleOtherController= ruleOtherController EOF ;
    public final EObject entryRuleOtherController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherController = null;


        try {
            // InternalSecurityDsl.g:1218:56: (iv_ruleOtherController= ruleOtherController EOF )
            // InternalSecurityDsl.g:1219:2: iv_ruleOtherController= ruleOtherController EOF
            {
             newCompositeNode(grammarAccess.getOtherControllerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOtherController=ruleOtherController();

            state._fsp--;

             current =iv_ruleOtherController; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOtherController"


    // $ANTLR start "ruleOtherController"
    // InternalSecurityDsl.g:1225:1: ruleOtherController returns [EObject current=null] : (otherlv_0= 'OtherController' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'path' ( (lv_path_4_0= ruleEString ) ) (otherlv_5= 'controller_endpoints' otherlv_6= '{' ( (lv_controller_endpoints_7_0= ruleEndpoint ) ) (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleOtherController() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_path_4_0 = null;

        EObject lv_controller_endpoints_7_0 = null;

        EObject lv_controller_endpoints_9_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:1231:2: ( (otherlv_0= 'OtherController' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'path' ( (lv_path_4_0= ruleEString ) ) (otherlv_5= 'controller_endpoints' otherlv_6= '{' ( (lv_controller_endpoints_7_0= ruleEndpoint ) ) (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalSecurityDsl.g:1232:2: (otherlv_0= 'OtherController' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'path' ( (lv_path_4_0= ruleEString ) ) (otherlv_5= 'controller_endpoints' otherlv_6= '{' ( (lv_controller_endpoints_7_0= ruleEndpoint ) ) (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalSecurityDsl.g:1232:2: (otherlv_0= 'OtherController' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'path' ( (lv_path_4_0= ruleEString ) ) (otherlv_5= 'controller_endpoints' otherlv_6= '{' ( (lv_controller_endpoints_7_0= ruleEndpoint ) ) (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalSecurityDsl.g:1233:3: otherlv_0= 'OtherController' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'path' ( (lv_path_4_0= ruleEString ) ) (otherlv_5= 'controller_endpoints' otherlv_6= '{' ( (lv_controller_endpoints_7_0= ruleEndpoint ) ) (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOtherControllerAccess().getOtherControllerKeyword_0());
            		
            // InternalSecurityDsl.g:1237:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSecurityDsl.g:1238:4: (lv_name_1_0= ruleEString )
            {
            // InternalSecurityDsl.g:1238:4: (lv_name_1_0= ruleEString )
            // InternalSecurityDsl.g:1239:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOtherControllerAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOtherControllerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.ftn.domi.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getOtherControllerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getOtherControllerAccess().getPathKeyword_3());
            		
            // InternalSecurityDsl.g:1264:3: ( (lv_path_4_0= ruleEString ) )
            // InternalSecurityDsl.g:1265:4: (lv_path_4_0= ruleEString )
            {
            // InternalSecurityDsl.g:1265:4: (lv_path_4_0= ruleEString )
            // InternalSecurityDsl.g:1266:5: lv_path_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOtherControllerAccess().getPathEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_36);
            lv_path_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOtherControllerRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_4_0,
            						"org.ftn.domi.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecurityDsl.g:1283:3: (otherlv_5= 'controller_endpoints' otherlv_6= '{' ( (lv_controller_endpoints_7_0= ruleEndpoint ) ) (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )* otherlv_10= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==42) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSecurityDsl.g:1284:4: otherlv_5= 'controller_endpoints' otherlv_6= '{' ( (lv_controller_endpoints_7_0= ruleEndpoint ) ) (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,42,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getOtherControllerAccess().getController_endpointsKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,23,FOLLOW_32); 

                    				newLeafNode(otherlv_6, grammarAccess.getOtherControllerAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalSecurityDsl.g:1292:4: ( (lv_controller_endpoints_7_0= ruleEndpoint ) )
                    // InternalSecurityDsl.g:1293:5: (lv_controller_endpoints_7_0= ruleEndpoint )
                    {
                    // InternalSecurityDsl.g:1293:5: (lv_controller_endpoints_7_0= ruleEndpoint )
                    // InternalSecurityDsl.g:1294:6: lv_controller_endpoints_7_0= ruleEndpoint
                    {

                    						newCompositeNode(grammarAccess.getOtherControllerAccess().getController_endpointsEndpointParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_controller_endpoints_7_0=ruleEndpoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOtherControllerRule());
                    						}
                    						add(
                    							current,
                    							"controller_endpoints",
                    							lv_controller_endpoints_7_0,
                    							"org.ftn.domi.securitydsl.SecurityDsl.Endpoint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSecurityDsl.g:1311:4: (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==30) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalSecurityDsl.g:1312:5: otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) )
                    	    {
                    	    otherlv_8=(Token)match(input,30,FOLLOW_32); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getOtherControllerAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSecurityDsl.g:1316:5: ( (lv_controller_endpoints_9_0= ruleEndpoint ) )
                    	    // InternalSecurityDsl.g:1317:6: (lv_controller_endpoints_9_0= ruleEndpoint )
                    	    {
                    	    // InternalSecurityDsl.g:1317:6: (lv_controller_endpoints_9_0= ruleEndpoint )
                    	    // InternalSecurityDsl.g:1318:7: lv_controller_endpoints_9_0= ruleEndpoint
                    	    {

                    	    							newCompositeNode(grammarAccess.getOtherControllerAccess().getController_endpointsEndpointParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    lv_controller_endpoints_9_0=ruleEndpoint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOtherControllerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"controller_endpoints",
                    	    								lv_controller_endpoints_9_0,
                    	    								"org.ftn.domi.securitydsl.SecurityDsl.Endpoint");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_10, grammarAccess.getOtherControllerAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getOtherControllerAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOtherController"


    // $ANTLR start "entryRuleJwtSecurity"
    // InternalSecurityDsl.g:1349:1: entryRuleJwtSecurity returns [EObject current=null] : iv_ruleJwtSecurity= ruleJwtSecurity EOF ;
    public final EObject entryRuleJwtSecurity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJwtSecurity = null;


        try {
            // InternalSecurityDsl.g:1349:52: (iv_ruleJwtSecurity= ruleJwtSecurity EOF )
            // InternalSecurityDsl.g:1350:2: iv_ruleJwtSecurity= ruleJwtSecurity EOF
            {
             newCompositeNode(grammarAccess.getJwtSecurityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJwtSecurity=ruleJwtSecurity();

            state._fsp--;

             current =iv_ruleJwtSecurity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJwtSecurity"


    // $ANTLR start "ruleJwtSecurity"
    // InternalSecurityDsl.g:1356:1: ruleJwtSecurity returns [EObject current=null] : (otherlv_0= 'mechanism:' ( (lv_mechanism_1_0= ruleESecurityMechanism ) ) otherlv_2= 'jwt:' otherlv_3= 'header:' otherlv_4= 'signature-algorithm:' ( (lv_signatureAlgorithm_5_0= ruleEString ) ) otherlv_6= 'payload:' otherlv_7= 'issuer:' ( (lv_issuer_8_0= ruleEString ) ) otherlv_9= 'expiration-time:' ( (lv_expirationTime_10_0= ruleEInt ) ) otherlv_11= 'audience:' ( (lv_audience_12_0= ruleEString ) ) (otherlv_13= 'public_claims:' otherlv_14= '[' ( (lv_security_claims_15_0= rulePublicClaims ) ) (otherlv_16= ',' ( (lv_security_claims_17_0= rulePublicClaims ) ) )* otherlv_18= ']' )? (otherlv_19= 'private_claims:' otherlv_20= '[' ( (lv_security_claims_21_0= rulePrivateClaims ) ) (otherlv_22= ',' ( (lv_security_claims_23_0= rulePrivateClaims ) ) )* otherlv_24= ']' )? otherlv_25= 'signature:' otherlv_26= 'secret:' ( (lv_secret_27_0= ruleEString ) ) ) ;
    public final EObject ruleJwtSecurity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Enumerator lv_mechanism_1_0 = null;

        AntlrDatatypeRuleToken lv_signatureAlgorithm_5_0 = null;

        AntlrDatatypeRuleToken lv_issuer_8_0 = null;

        AntlrDatatypeRuleToken lv_expirationTime_10_0 = null;

        AntlrDatatypeRuleToken lv_audience_12_0 = null;

        EObject lv_security_claims_15_0 = null;

        EObject lv_security_claims_17_0 = null;

        EObject lv_security_claims_21_0 = null;

        EObject lv_security_claims_23_0 = null;

        AntlrDatatypeRuleToken lv_secret_27_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:1362:2: ( (otherlv_0= 'mechanism:' ( (lv_mechanism_1_0= ruleESecurityMechanism ) ) otherlv_2= 'jwt:' otherlv_3= 'header:' otherlv_4= 'signature-algorithm:' ( (lv_signatureAlgorithm_5_0= ruleEString ) ) otherlv_6= 'payload:' otherlv_7= 'issuer:' ( (lv_issuer_8_0= ruleEString ) ) otherlv_9= 'expiration-time:' ( (lv_expirationTime_10_0= ruleEInt ) ) otherlv_11= 'audience:' ( (lv_audience_12_0= ruleEString ) ) (otherlv_13= 'public_claims:' otherlv_14= '[' ( (lv_security_claims_15_0= rulePublicClaims ) ) (otherlv_16= ',' ( (lv_security_claims_17_0= rulePublicClaims ) ) )* otherlv_18= ']' )? (otherlv_19= 'private_claims:' otherlv_20= '[' ( (lv_security_claims_21_0= rulePrivateClaims ) ) (otherlv_22= ',' ( (lv_security_claims_23_0= rulePrivateClaims ) ) )* otherlv_24= ']' )? otherlv_25= 'signature:' otherlv_26= 'secret:' ( (lv_secret_27_0= ruleEString ) ) ) )
            // InternalSecurityDsl.g:1363:2: (otherlv_0= 'mechanism:' ( (lv_mechanism_1_0= ruleESecurityMechanism ) ) otherlv_2= 'jwt:' otherlv_3= 'header:' otherlv_4= 'signature-algorithm:' ( (lv_signatureAlgorithm_5_0= ruleEString ) ) otherlv_6= 'payload:' otherlv_7= 'issuer:' ( (lv_issuer_8_0= ruleEString ) ) otherlv_9= 'expiration-time:' ( (lv_expirationTime_10_0= ruleEInt ) ) otherlv_11= 'audience:' ( (lv_audience_12_0= ruleEString ) ) (otherlv_13= 'public_claims:' otherlv_14= '[' ( (lv_security_claims_15_0= rulePublicClaims ) ) (otherlv_16= ',' ( (lv_security_claims_17_0= rulePublicClaims ) ) )* otherlv_18= ']' )? (otherlv_19= 'private_claims:' otherlv_20= '[' ( (lv_security_claims_21_0= rulePrivateClaims ) ) (otherlv_22= ',' ( (lv_security_claims_23_0= rulePrivateClaims ) ) )* otherlv_24= ']' )? otherlv_25= 'signature:' otherlv_26= 'secret:' ( (lv_secret_27_0= ruleEString ) ) )
            {
            // InternalSecurityDsl.g:1363:2: (otherlv_0= 'mechanism:' ( (lv_mechanism_1_0= ruleESecurityMechanism ) ) otherlv_2= 'jwt:' otherlv_3= 'header:' otherlv_4= 'signature-algorithm:' ( (lv_signatureAlgorithm_5_0= ruleEString ) ) otherlv_6= 'payload:' otherlv_7= 'issuer:' ( (lv_issuer_8_0= ruleEString ) ) otherlv_9= 'expiration-time:' ( (lv_expirationTime_10_0= ruleEInt ) ) otherlv_11= 'audience:' ( (lv_audience_12_0= ruleEString ) ) (otherlv_13= 'public_claims:' otherlv_14= '[' ( (lv_security_claims_15_0= rulePublicClaims ) ) (otherlv_16= ',' ( (lv_security_claims_17_0= rulePublicClaims ) ) )* otherlv_18= ']' )? (otherlv_19= 'private_claims:' otherlv_20= '[' ( (lv_security_claims_21_0= rulePrivateClaims ) ) (otherlv_22= ',' ( (lv_security_claims_23_0= rulePrivateClaims ) ) )* otherlv_24= ']' )? otherlv_25= 'signature:' otherlv_26= 'secret:' ( (lv_secret_27_0= ruleEString ) ) )
            // InternalSecurityDsl.g:1364:3: otherlv_0= 'mechanism:' ( (lv_mechanism_1_0= ruleESecurityMechanism ) ) otherlv_2= 'jwt:' otherlv_3= 'header:' otherlv_4= 'signature-algorithm:' ( (lv_signatureAlgorithm_5_0= ruleEString ) ) otherlv_6= 'payload:' otherlv_7= 'issuer:' ( (lv_issuer_8_0= ruleEString ) ) otherlv_9= 'expiration-time:' ( (lv_expirationTime_10_0= ruleEInt ) ) otherlv_11= 'audience:' ( (lv_audience_12_0= ruleEString ) ) (otherlv_13= 'public_claims:' otherlv_14= '[' ( (lv_security_claims_15_0= rulePublicClaims ) ) (otherlv_16= ',' ( (lv_security_claims_17_0= rulePublicClaims ) ) )* otherlv_18= ']' )? (otherlv_19= 'private_claims:' otherlv_20= '[' ( (lv_security_claims_21_0= rulePrivateClaims ) ) (otherlv_22= ',' ( (lv_security_claims_23_0= rulePrivateClaims ) ) )* otherlv_24= ']' )? otherlv_25= 'signature:' otherlv_26= 'secret:' ( (lv_secret_27_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getJwtSecurityAccess().getMechanismKeyword_0());
            		
            // InternalSecurityDsl.g:1368:3: ( (lv_mechanism_1_0= ruleESecurityMechanism ) )
            // InternalSecurityDsl.g:1369:4: (lv_mechanism_1_0= ruleESecurityMechanism )
            {
            // InternalSecurityDsl.g:1369:4: (lv_mechanism_1_0= ruleESecurityMechanism )
            // InternalSecurityDsl.g:1370:5: lv_mechanism_1_0= ruleESecurityMechanism
            {

            					newCompositeNode(grammarAccess.getJwtSecurityAccess().getMechanismESecurityMechanismEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_38);
            lv_mechanism_1_0=ruleESecurityMechanism();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJwtSecurityRule());
            					}
            					set(
            						current,
            						"mechanism",
            						lv_mechanism_1_0,
            						"org.ftn.domi.securitydsl.SecurityDsl.ESecurityMechanism");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,48,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getJwtSecurityAccess().getJwtKeyword_2());
            		
            otherlv_3=(Token)match(input,49,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getJwtSecurityAccess().getHeaderKeyword_3());
            		
            otherlv_4=(Token)match(input,50,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getJwtSecurityAccess().getSignatureAlgorithmKeyword_4());
            		
            // InternalSecurityDsl.g:1399:3: ( (lv_signatureAlgorithm_5_0= ruleEString ) )
            // InternalSecurityDsl.g:1400:4: (lv_signatureAlgorithm_5_0= ruleEString )
            {
            // InternalSecurityDsl.g:1400:4: (lv_signatureAlgorithm_5_0= ruleEString )
            // InternalSecurityDsl.g:1401:5: lv_signatureAlgorithm_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getJwtSecurityAccess().getSignatureAlgorithmEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_41);
            lv_signatureAlgorithm_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJwtSecurityRule());
            					}
            					set(
            						current,
            						"signatureAlgorithm",
            						lv_signatureAlgorithm_5_0,
            						"org.ftn.domi.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,51,FOLLOW_42); 

            			newLeafNode(otherlv_6, grammarAccess.getJwtSecurityAccess().getPayloadKeyword_6());
            		
            otherlv_7=(Token)match(input,52,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getJwtSecurityAccess().getIssuerKeyword_7());
            		
            // InternalSecurityDsl.g:1426:3: ( (lv_issuer_8_0= ruleEString ) )
            // InternalSecurityDsl.g:1427:4: (lv_issuer_8_0= ruleEString )
            {
            // InternalSecurityDsl.g:1427:4: (lv_issuer_8_0= ruleEString )
            // InternalSecurityDsl.g:1428:5: lv_issuer_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getJwtSecurityAccess().getIssuerEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_43);
            lv_issuer_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJwtSecurityRule());
            					}
            					set(
            						current,
            						"issuer",
            						lv_issuer_8_0,
            						"org.ftn.domi.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,53,FOLLOW_44); 

            			newLeafNode(otherlv_9, grammarAccess.getJwtSecurityAccess().getExpirationTimeKeyword_9());
            		
            // InternalSecurityDsl.g:1449:3: ( (lv_expirationTime_10_0= ruleEInt ) )
            // InternalSecurityDsl.g:1450:4: (lv_expirationTime_10_0= ruleEInt )
            {
            // InternalSecurityDsl.g:1450:4: (lv_expirationTime_10_0= ruleEInt )
            // InternalSecurityDsl.g:1451:5: lv_expirationTime_10_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getJwtSecurityAccess().getExpirationTimeEIntParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_45);
            lv_expirationTime_10_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJwtSecurityRule());
            					}
            					set(
            						current,
            						"expirationTime",
            						lv_expirationTime_10_0,
            						"org.ftn.domi.securitydsl.SecurityDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,54,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getJwtSecurityAccess().getAudienceKeyword_11());
            		
            // InternalSecurityDsl.g:1472:3: ( (lv_audience_12_0= ruleEString ) )
            // InternalSecurityDsl.g:1473:4: (lv_audience_12_0= ruleEString )
            {
            // InternalSecurityDsl.g:1473:4: (lv_audience_12_0= ruleEString )
            // InternalSecurityDsl.g:1474:5: lv_audience_12_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getJwtSecurityAccess().getAudienceEStringParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_46);
            lv_audience_12_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJwtSecurityRule());
            					}
            					set(
            						current,
            						"audience",
            						lv_audience_12_0,
            						"org.ftn.domi.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecurityDsl.g:1491:3: (otherlv_13= 'public_claims:' otherlv_14= '[' ( (lv_security_claims_15_0= rulePublicClaims ) ) (otherlv_16= ',' ( (lv_security_claims_17_0= rulePublicClaims ) ) )* otherlv_18= ']' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==55) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSecurityDsl.g:1492:4: otherlv_13= 'public_claims:' otherlv_14= '[' ( (lv_security_claims_15_0= rulePublicClaims ) ) (otherlv_16= ',' ( (lv_security_claims_17_0= rulePublicClaims ) ) )* otherlv_18= ']'
                    {
                    otherlv_13=(Token)match(input,55,FOLLOW_47); 

                    				newLeafNode(otherlv_13, grammarAccess.getJwtSecurityAccess().getPublic_claimsKeyword_13_0());
                    			
                    otherlv_14=(Token)match(input,56,FOLLOW_48); 

                    				newLeafNode(otherlv_14, grammarAccess.getJwtSecurityAccess().getLeftSquareBracketKeyword_13_1());
                    			
                    // InternalSecurityDsl.g:1500:4: ( (lv_security_claims_15_0= rulePublicClaims ) )
                    // InternalSecurityDsl.g:1501:5: (lv_security_claims_15_0= rulePublicClaims )
                    {
                    // InternalSecurityDsl.g:1501:5: (lv_security_claims_15_0= rulePublicClaims )
                    // InternalSecurityDsl.g:1502:6: lv_security_claims_15_0= rulePublicClaims
                    {

                    						newCompositeNode(grammarAccess.getJwtSecurityAccess().getSecurity_claimsPublicClaimsParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_security_claims_15_0=rulePublicClaims();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJwtSecurityRule());
                    						}
                    						add(
                    							current,
                    							"security_claims",
                    							lv_security_claims_15_0,
                    							"org.ftn.domi.securitydsl.SecurityDsl.PublicClaims");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSecurityDsl.g:1519:4: (otherlv_16= ',' ( (lv_security_claims_17_0= rulePublicClaims ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==30) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalSecurityDsl.g:1520:5: otherlv_16= ',' ( (lv_security_claims_17_0= rulePublicClaims ) )
                    	    {
                    	    otherlv_16=(Token)match(input,30,FOLLOW_48); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getJwtSecurityAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalSecurityDsl.g:1524:5: ( (lv_security_claims_17_0= rulePublicClaims ) )
                    	    // InternalSecurityDsl.g:1525:6: (lv_security_claims_17_0= rulePublicClaims )
                    	    {
                    	    // InternalSecurityDsl.g:1525:6: (lv_security_claims_17_0= rulePublicClaims )
                    	    // InternalSecurityDsl.g:1526:7: lv_security_claims_17_0= rulePublicClaims
                    	    {

                    	    							newCompositeNode(grammarAccess.getJwtSecurityAccess().getSecurity_claimsPublicClaimsParserRuleCall_13_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_49);
                    	    lv_security_claims_17_0=rulePublicClaims();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getJwtSecurityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"security_claims",
                    	    								lv_security_claims_17_0,
                    	    								"org.ftn.domi.securitydsl.SecurityDsl.PublicClaims");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,57,FOLLOW_50); 

                    				newLeafNode(otherlv_18, grammarAccess.getJwtSecurityAccess().getRightSquareBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            // InternalSecurityDsl.g:1549:3: (otherlv_19= 'private_claims:' otherlv_20= '[' ( (lv_security_claims_21_0= rulePrivateClaims ) ) (otherlv_22= ',' ( (lv_security_claims_23_0= rulePrivateClaims ) ) )* otherlv_24= ']' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==58) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSecurityDsl.g:1550:4: otherlv_19= 'private_claims:' otherlv_20= '[' ( (lv_security_claims_21_0= rulePrivateClaims ) ) (otherlv_22= ',' ( (lv_security_claims_23_0= rulePrivateClaims ) ) )* otherlv_24= ']'
                    {
                    otherlv_19=(Token)match(input,58,FOLLOW_47); 

                    				newLeafNode(otherlv_19, grammarAccess.getJwtSecurityAccess().getPrivate_claimsKeyword_14_0());
                    			
                    otherlv_20=(Token)match(input,56,FOLLOW_48); 

                    				newLeafNode(otherlv_20, grammarAccess.getJwtSecurityAccess().getLeftSquareBracketKeyword_14_1());
                    			
                    // InternalSecurityDsl.g:1558:4: ( (lv_security_claims_21_0= rulePrivateClaims ) )
                    // InternalSecurityDsl.g:1559:5: (lv_security_claims_21_0= rulePrivateClaims )
                    {
                    // InternalSecurityDsl.g:1559:5: (lv_security_claims_21_0= rulePrivateClaims )
                    // InternalSecurityDsl.g:1560:6: lv_security_claims_21_0= rulePrivateClaims
                    {

                    						newCompositeNode(grammarAccess.getJwtSecurityAccess().getSecurity_claimsPrivateClaimsParserRuleCall_14_2_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_security_claims_21_0=rulePrivateClaims();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJwtSecurityRule());
                    						}
                    						add(
                    							current,
                    							"security_claims",
                    							lv_security_claims_21_0,
                    							"org.ftn.domi.securitydsl.SecurityDsl.PrivateClaims");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSecurityDsl.g:1577:4: (otherlv_22= ',' ( (lv_security_claims_23_0= rulePrivateClaims ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==30) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalSecurityDsl.g:1578:5: otherlv_22= ',' ( (lv_security_claims_23_0= rulePrivateClaims ) )
                    	    {
                    	    otherlv_22=(Token)match(input,30,FOLLOW_48); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getJwtSecurityAccess().getCommaKeyword_14_3_0());
                    	    				
                    	    // InternalSecurityDsl.g:1582:5: ( (lv_security_claims_23_0= rulePrivateClaims ) )
                    	    // InternalSecurityDsl.g:1583:6: (lv_security_claims_23_0= rulePrivateClaims )
                    	    {
                    	    // InternalSecurityDsl.g:1583:6: (lv_security_claims_23_0= rulePrivateClaims )
                    	    // InternalSecurityDsl.g:1584:7: lv_security_claims_23_0= rulePrivateClaims
                    	    {

                    	    							newCompositeNode(grammarAccess.getJwtSecurityAccess().getSecurity_claimsPrivateClaimsParserRuleCall_14_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_49);
                    	    lv_security_claims_23_0=rulePrivateClaims();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getJwtSecurityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"security_claims",
                    	    								lv_security_claims_23_0,
                    	    								"org.ftn.domi.securitydsl.SecurityDsl.PrivateClaims");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,57,FOLLOW_51); 

                    				newLeafNode(otherlv_24, grammarAccess.getJwtSecurityAccess().getRightSquareBracketKeyword_14_4());
                    			

                    }
                    break;

            }

            otherlv_25=(Token)match(input,59,FOLLOW_52); 

            			newLeafNode(otherlv_25, grammarAccess.getJwtSecurityAccess().getSignatureKeyword_15());
            		
            otherlv_26=(Token)match(input,60,FOLLOW_4); 

            			newLeafNode(otherlv_26, grammarAccess.getJwtSecurityAccess().getSecretKeyword_16());
            		
            // InternalSecurityDsl.g:1615:3: ( (lv_secret_27_0= ruleEString ) )
            // InternalSecurityDsl.g:1616:4: (lv_secret_27_0= ruleEString )
            {
            // InternalSecurityDsl.g:1616:4: (lv_secret_27_0= ruleEString )
            // InternalSecurityDsl.g:1617:5: lv_secret_27_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getJwtSecurityAccess().getSecretEStringParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_2);
            lv_secret_27_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJwtSecurityRule());
            					}
            					set(
            						current,
            						"secret",
            						lv_secret_27_0,
            						"org.ftn.domi.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJwtSecurity"


    // $ANTLR start "entryRuleEInt"
    // InternalSecurityDsl.g:1638:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSecurityDsl.g:1638:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSecurityDsl.g:1639:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalSecurityDsl.g:1645:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSecurityDsl.g:1651:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSecurityDsl.g:1652:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSecurityDsl.g:1652:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSecurityDsl.g:1653:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSecurityDsl.g:1653:3: (kw= '-' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==61) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSecurityDsl.g:1654:4: kw= '-'
                    {
                    kw=(Token)match(input,61,FOLLOW_53); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRulePublicClaims"
    // InternalSecurityDsl.g:1671:1: entryRulePublicClaims returns [EObject current=null] : iv_rulePublicClaims= rulePublicClaims EOF ;
    public final EObject entryRulePublicClaims() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePublicClaims = null;


        try {
            // InternalSecurityDsl.g:1671:53: (iv_rulePublicClaims= rulePublicClaims EOF )
            // InternalSecurityDsl.g:1672:2: iv_rulePublicClaims= rulePublicClaims EOF
            {
             newCompositeNode(grammarAccess.getPublicClaimsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePublicClaims=rulePublicClaims();

            state._fsp--;

             current =iv_rulePublicClaims; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePublicClaims"


    // $ANTLR start "rulePublicClaims"
    // InternalSecurityDsl.g:1678:1: rulePublicClaims returns [EObject current=null] : ( ( (lv_isPublic_0_0= 'isPublic' ) ) ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject rulePublicClaims() throws RecognitionException {
        EObject current = null;

        Token lv_isPublic_0_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:1684:2: ( ( ( (lv_isPublic_0_0= 'isPublic' ) ) ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalSecurityDsl.g:1685:2: ( ( (lv_isPublic_0_0= 'isPublic' ) ) ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalSecurityDsl.g:1685:2: ( ( (lv_isPublic_0_0= 'isPublic' ) ) ( (lv_name_1_0= ruleEString ) ) )
            // InternalSecurityDsl.g:1686:3: ( (lv_isPublic_0_0= 'isPublic' ) ) ( (lv_name_1_0= ruleEString ) )
            {
            // InternalSecurityDsl.g:1686:3: ( (lv_isPublic_0_0= 'isPublic' ) )
            // InternalSecurityDsl.g:1687:4: (lv_isPublic_0_0= 'isPublic' )
            {
            // InternalSecurityDsl.g:1687:4: (lv_isPublic_0_0= 'isPublic' )
            // InternalSecurityDsl.g:1688:5: lv_isPublic_0_0= 'isPublic'
            {
            lv_isPublic_0_0=(Token)match(input,62,FOLLOW_4); 

            					newLeafNode(lv_isPublic_0_0, grammarAccess.getPublicClaimsAccess().getIsPublicIsPublicKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPublicClaimsRule());
            					}
            					setWithLastConsumed(current, "isPublic", lv_isPublic_0_0 != null, "isPublic");
            				

            }


            }

            // InternalSecurityDsl.g:1700:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSecurityDsl.g:1701:4: (lv_name_1_0= ruleEString )
            {
            // InternalSecurityDsl.g:1701:4: (lv_name_1_0= ruleEString )
            // InternalSecurityDsl.g:1702:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPublicClaimsAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPublicClaimsRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.ftn.domi.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePublicClaims"


    // $ANTLR start "entryRulePrivateClaims"
    // InternalSecurityDsl.g:1723:1: entryRulePrivateClaims returns [EObject current=null] : iv_rulePrivateClaims= rulePrivateClaims EOF ;
    public final EObject entryRulePrivateClaims() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrivateClaims = null;


        try {
            // InternalSecurityDsl.g:1723:54: (iv_rulePrivateClaims= rulePrivateClaims EOF )
            // InternalSecurityDsl.g:1724:2: iv_rulePrivateClaims= rulePrivateClaims EOF
            {
             newCompositeNode(grammarAccess.getPrivateClaimsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrivateClaims=rulePrivateClaims();

            state._fsp--;

             current =iv_rulePrivateClaims; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrivateClaims"


    // $ANTLR start "rulePrivateClaims"
    // InternalSecurityDsl.g:1730:1: rulePrivateClaims returns [EObject current=null] : ( ( (lv_isPublic_0_0= 'isPublic' ) ) ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject rulePrivateClaims() throws RecognitionException {
        EObject current = null;

        Token lv_isPublic_0_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:1736:2: ( ( ( (lv_isPublic_0_0= 'isPublic' ) ) ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalSecurityDsl.g:1737:2: ( ( (lv_isPublic_0_0= 'isPublic' ) ) ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalSecurityDsl.g:1737:2: ( ( (lv_isPublic_0_0= 'isPublic' ) ) ( (lv_name_1_0= ruleEString ) ) )
            // InternalSecurityDsl.g:1738:3: ( (lv_isPublic_0_0= 'isPublic' ) ) ( (lv_name_1_0= ruleEString ) )
            {
            // InternalSecurityDsl.g:1738:3: ( (lv_isPublic_0_0= 'isPublic' ) )
            // InternalSecurityDsl.g:1739:4: (lv_isPublic_0_0= 'isPublic' )
            {
            // InternalSecurityDsl.g:1739:4: (lv_isPublic_0_0= 'isPublic' )
            // InternalSecurityDsl.g:1740:5: lv_isPublic_0_0= 'isPublic'
            {
            lv_isPublic_0_0=(Token)match(input,62,FOLLOW_4); 

            					newLeafNode(lv_isPublic_0_0, grammarAccess.getPrivateClaimsAccess().getIsPublicIsPublicKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrivateClaimsRule());
            					}
            					setWithLastConsumed(current, "isPublic", lv_isPublic_0_0 != null, "isPublic");
            				

            }


            }

            // InternalSecurityDsl.g:1752:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSecurityDsl.g:1753:4: (lv_name_1_0= ruleEString )
            {
            // InternalSecurityDsl.g:1753:4: (lv_name_1_0= ruleEString )
            // InternalSecurityDsl.g:1754:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPrivateClaimsAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrivateClaimsRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.ftn.domi.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrivateClaims"


    // $ANTLR start "ruleEType"
    // InternalSecurityDsl.g:1775:1: ruleEType returns [Enumerator current=null] : ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'FLOAT' ) | (enumLiteral_3= 'LONG' ) | (enumLiteral_4= 'CHAR' ) | (enumLiteral_5= 'BOOLEAN' ) | (enumLiteral_6= 'DOUBLE' ) | (enumLiteral_7= 'BYTE' ) | (enumLiteral_8= 'SHORT' ) ) ;
    public final Enumerator ruleEType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;


        	enterRule();

        try {
            // InternalSecurityDsl.g:1781:2: ( ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'FLOAT' ) | (enumLiteral_3= 'LONG' ) | (enumLiteral_4= 'CHAR' ) | (enumLiteral_5= 'BOOLEAN' ) | (enumLiteral_6= 'DOUBLE' ) | (enumLiteral_7= 'BYTE' ) | (enumLiteral_8= 'SHORT' ) ) )
            // InternalSecurityDsl.g:1782:2: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'FLOAT' ) | (enumLiteral_3= 'LONG' ) | (enumLiteral_4= 'CHAR' ) | (enumLiteral_5= 'BOOLEAN' ) | (enumLiteral_6= 'DOUBLE' ) | (enumLiteral_7= 'BYTE' ) | (enumLiteral_8= 'SHORT' ) )
            {
            // InternalSecurityDsl.g:1782:2: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'FLOAT' ) | (enumLiteral_3= 'LONG' ) | (enumLiteral_4= 'CHAR' ) | (enumLiteral_5= 'BOOLEAN' ) | (enumLiteral_6= 'DOUBLE' ) | (enumLiteral_7= 'BYTE' ) | (enumLiteral_8= 'SHORT' ) )
            int alt25=9;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt25=1;
                }
                break;
            case 64:
                {
                alt25=2;
                }
                break;
            case 65:
                {
                alt25=3;
                }
                break;
            case 66:
                {
                alt25=4;
                }
                break;
            case 67:
                {
                alt25=5;
                }
                break;
            case 68:
                {
                alt25=6;
                }
                break;
            case 69:
                {
                alt25=7;
                }
                break;
            case 70:
                {
                alt25=8;
                }
                break;
            case 71:
                {
                alt25=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalSecurityDsl.g:1783:3: (enumLiteral_0= 'INT' )
                    {
                    // InternalSecurityDsl.g:1783:3: (enumLiteral_0= 'INT' )
                    // InternalSecurityDsl.g:1784:4: enumLiteral_0= 'INT'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getETypeAccess().getINTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:1791:3: (enumLiteral_1= 'STRING' )
                    {
                    // InternalSecurityDsl.g:1791:3: (enumLiteral_1= 'STRING' )
                    // InternalSecurityDsl.g:1792:4: enumLiteral_1= 'STRING'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getSTRINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getETypeAccess().getSTRINGEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:1799:3: (enumLiteral_2= 'FLOAT' )
                    {
                    // InternalSecurityDsl.g:1799:3: (enumLiteral_2= 'FLOAT' )
                    // InternalSecurityDsl.g:1800:4: enumLiteral_2= 'FLOAT'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getFLOATEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getETypeAccess().getFLOATEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:1807:3: (enumLiteral_3= 'LONG' )
                    {
                    // InternalSecurityDsl.g:1807:3: (enumLiteral_3= 'LONG' )
                    // InternalSecurityDsl.g:1808:4: enumLiteral_3= 'LONG'
                    {
                    enumLiteral_3=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getLONGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getETypeAccess().getLONGEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSecurityDsl.g:1815:3: (enumLiteral_4= 'CHAR' )
                    {
                    // InternalSecurityDsl.g:1815:3: (enumLiteral_4= 'CHAR' )
                    // InternalSecurityDsl.g:1816:4: enumLiteral_4= 'CHAR'
                    {
                    enumLiteral_4=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getCHAREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getETypeAccess().getCHAREnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSecurityDsl.g:1823:3: (enumLiteral_5= 'BOOLEAN' )
                    {
                    // InternalSecurityDsl.g:1823:3: (enumLiteral_5= 'BOOLEAN' )
                    // InternalSecurityDsl.g:1824:4: enumLiteral_5= 'BOOLEAN'
                    {
                    enumLiteral_5=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getBOOLEANEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getETypeAccess().getBOOLEANEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSecurityDsl.g:1831:3: (enumLiteral_6= 'DOUBLE' )
                    {
                    // InternalSecurityDsl.g:1831:3: (enumLiteral_6= 'DOUBLE' )
                    // InternalSecurityDsl.g:1832:4: enumLiteral_6= 'DOUBLE'
                    {
                    enumLiteral_6=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getDOUBLEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getETypeAccess().getDOUBLEEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSecurityDsl.g:1839:3: (enumLiteral_7= 'BYTE' )
                    {
                    // InternalSecurityDsl.g:1839:3: (enumLiteral_7= 'BYTE' )
                    // InternalSecurityDsl.g:1840:4: enumLiteral_7= 'BYTE'
                    {
                    enumLiteral_7=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getBYTEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getETypeAccess().getBYTEEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalSecurityDsl.g:1847:3: (enumLiteral_8= 'SHORT' )
                    {
                    // InternalSecurityDsl.g:1847:3: (enumLiteral_8= 'SHORT' )
                    // InternalSecurityDsl.g:1848:4: enumLiteral_8= 'SHORT'
                    {
                    enumLiteral_8=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getSHORTEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getETypeAccess().getSHORTEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEType"


    // $ANTLR start "ruleEEndpointMethod"
    // InternalSecurityDsl.g:1858:1: ruleEEndpointMethod returns [Enumerator current=null] : ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'PUT' ) | (enumLiteral_2= 'POST' ) | (enumLiteral_3= 'DELETE' ) ) ;
    public final Enumerator ruleEEndpointMethod() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSecurityDsl.g:1864:2: ( ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'PUT' ) | (enumLiteral_2= 'POST' ) | (enumLiteral_3= 'DELETE' ) ) )
            // InternalSecurityDsl.g:1865:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'PUT' ) | (enumLiteral_2= 'POST' ) | (enumLiteral_3= 'DELETE' ) )
            {
            // InternalSecurityDsl.g:1865:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'PUT' ) | (enumLiteral_2= 'POST' ) | (enumLiteral_3= 'DELETE' ) )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt26=1;
                }
                break;
            case 73:
                {
                alt26=2;
                }
                break;
            case 74:
                {
                alt26=3;
                }
                break;
            case 75:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalSecurityDsl.g:1866:3: (enumLiteral_0= 'GET' )
                    {
                    // InternalSecurityDsl.g:1866:3: (enumLiteral_0= 'GET' )
                    // InternalSecurityDsl.g:1867:4: enumLiteral_0= 'GET'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getEEndpointMethodAccess().getGETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEEndpointMethodAccess().getGETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:1874:3: (enumLiteral_1= 'PUT' )
                    {
                    // InternalSecurityDsl.g:1874:3: (enumLiteral_1= 'PUT' )
                    // InternalSecurityDsl.g:1875:4: enumLiteral_1= 'PUT'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getEEndpointMethodAccess().getPUTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEEndpointMethodAccess().getPUTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:1882:3: (enumLiteral_2= 'POST' )
                    {
                    // InternalSecurityDsl.g:1882:3: (enumLiteral_2= 'POST' )
                    // InternalSecurityDsl.g:1883:4: enumLiteral_2= 'POST'
                    {
                    enumLiteral_2=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getEEndpointMethodAccess().getPOSTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEEndpointMethodAccess().getPOSTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:1890:3: (enumLiteral_3= 'DELETE' )
                    {
                    // InternalSecurityDsl.g:1890:3: (enumLiteral_3= 'DELETE' )
                    // InternalSecurityDsl.g:1891:4: enumLiteral_3= 'DELETE'
                    {
                    enumLiteral_3=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getEEndpointMethodAccess().getDELETEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEEndpointMethodAccess().getDELETEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEEndpointMethod"


    // $ANTLR start "ruleESecurityMechanism"
    // InternalSecurityDsl.g:1901:1: ruleESecurityMechanism returns [Enumerator current=null] : (enumLiteral_0= 'JWT' ) ;
    public final Enumerator ruleESecurityMechanism() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalSecurityDsl.g:1907:2: ( (enumLiteral_0= 'JWT' ) )
            // InternalSecurityDsl.g:1908:2: (enumLiteral_0= 'JWT' )
            {
            // InternalSecurityDsl.g:1908:2: (enumLiteral_0= 'JWT' )
            // InternalSecurityDsl.g:1909:3: enumLiteral_0= 'JWT'
            {
            enumLiteral_0=(Token)match(input,76,FOLLOW_2); 

            			current = grammarAccess.getESecurityMechanismAccess().getJWTEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getESecurityMechanismAccess().getJWTEnumLiteralDeclaration());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleESecurityMechanism"


    // $ANTLR start "ruleEDatabaseType"
    // InternalSecurityDsl.g:1918:1: ruleEDatabaseType returns [Enumerator current=null] : ( (enumLiteral_0= 'POSTGRES' ) | (enumLiteral_1= 'ORACLE' ) | (enumLiteral_2= 'MYSQL' ) ) ;
    public final Enumerator ruleEDatabaseType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSecurityDsl.g:1924:2: ( ( (enumLiteral_0= 'POSTGRES' ) | (enumLiteral_1= 'ORACLE' ) | (enumLiteral_2= 'MYSQL' ) ) )
            // InternalSecurityDsl.g:1925:2: ( (enumLiteral_0= 'POSTGRES' ) | (enumLiteral_1= 'ORACLE' ) | (enumLiteral_2= 'MYSQL' ) )
            {
            // InternalSecurityDsl.g:1925:2: ( (enumLiteral_0= 'POSTGRES' ) | (enumLiteral_1= 'ORACLE' ) | (enumLiteral_2= 'MYSQL' ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt27=1;
                }
                break;
            case 78:
                {
                alt27=2;
                }
                break;
            case 79:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalSecurityDsl.g:1926:3: (enumLiteral_0= 'POSTGRES' )
                    {
                    // InternalSecurityDsl.g:1926:3: (enumLiteral_0= 'POSTGRES' )
                    // InternalSecurityDsl.g:1927:4: enumLiteral_0= 'POSTGRES'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getEDatabaseTypeAccess().getPOSTGRESEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEDatabaseTypeAccess().getPOSTGRESEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:1934:3: (enumLiteral_1= 'ORACLE' )
                    {
                    // InternalSecurityDsl.g:1934:3: (enumLiteral_1= 'ORACLE' )
                    // InternalSecurityDsl.g:1935:4: enumLiteral_1= 'ORACLE'
                    {
                    enumLiteral_1=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getEDatabaseTypeAccess().getORACLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEDatabaseTypeAccess().getORACLEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:1942:3: (enumLiteral_2= 'MYSQL' )
                    {
                    // InternalSecurityDsl.g:1942:3: (enumLiteral_2= 'MYSQL' )
                    // InternalSecurityDsl.g:1943:4: enumLiteral_2= 'MYSQL'
                    {
                    enumLiteral_2=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getEDatabaseTypeAccess().getMYSQLEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEDatabaseTypeAccess().getMYSQLEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDatabaseType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x000000000000E000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x8000000000000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000022000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002002000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00003C0002000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000380002000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000300002000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000200002000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040002000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x2000000000000040L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0C80000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0200000040000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000040L});

}