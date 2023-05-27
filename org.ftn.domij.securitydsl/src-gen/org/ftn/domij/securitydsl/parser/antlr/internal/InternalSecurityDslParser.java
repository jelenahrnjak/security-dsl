package org.ftn.domij.securitydsl.parser.antlr.internal;

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
import org.ftn.domij.securitydsl.services.SecurityDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSecurityDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_NL", "RULE_TAB", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'application:'", "'name:'", "'description:'", "'database:'", "'security:'", "'model:'", "'user:'", "'role:'", "'other:'", "'['", "','", "']'", "'controllers:'", "'auth:'", "'vendorName:'", "'url:'", "'username:'", "'password:'", "'{'", "'type:'", "'}'", "'identifier:'", "'other-fields:'", "'method-name:'", "'method:'", "'path:'", "'signup-url:'", "'login-url:'", "'logout-url:'", "'endpoints:'", "'mechanism:'", "'jwt:'", "'header:'", "'signature-algorithm:'", "'payload:'", "'issuer:'", "'expiration-time:'", "'audience:'", "'public-claims:'", "'private-claims:'", "'signature:'", "'secret:'", "'-'", "'INT'", "'STRING'", "'FLOAT'", "'LONG'", "'CHAR'", "'BOOLEAN'", "'DOUBLE'", "'BYTE'", "'SHORT'", "'GET'", "'PUT'", "'POST'", "'DELETE'", "'JWT'", "'POSTGRES'", "'ORACLE'", "'MYSQL'"
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
    // InternalSecurityDsl.g:72:1: ruleApplication returns [EObject current=null] : ( () otherlv_1= 'application:' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'database:' ( (lv_app_database_7_0= ruleDatabase ) ) )? (otherlv_8= 'security:' ( (lv_app_security_9_0= ruleSecurity ) ) )? (otherlv_10= 'model:' (otherlv_11= 'user:' ( (lv_app_models_12_0= ruleUser ) ) )? (otherlv_13= 'role:' ( (lv_app_models_14_0= ruleRole ) ) )? (otherlv_15= 'other:' otherlv_16= '[' ( (lv_app_models_17_0= ruleOtherModel ) ) (otherlv_18= ',' ( (lv_app_models_19_0= ruleOtherModel ) ) )* otherlv_20= ']' )? )? (otherlv_21= 'controllers:' (otherlv_22= 'auth:' ( (lv_app_controllers_23_0= ruleAuthentication ) ) )? (otherlv_24= 'other:' otherlv_25= '[' ( (lv_app_controllers_26_0= ruleOtherController ) ) (otherlv_27= ',' ( (lv_app_controllers_28_0= ruleOtherController ) ) )* otherlv_29= ']' )? )? ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        EObject lv_app_database_7_0 = null;

        EObject lv_app_security_9_0 = null;

        EObject lv_app_models_12_0 = null;

        EObject lv_app_models_14_0 = null;

        EObject lv_app_models_17_0 = null;

        EObject lv_app_models_19_0 = null;

        EObject lv_app_controllers_23_0 = null;

        EObject lv_app_controllers_26_0 = null;

        EObject lv_app_controllers_28_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:78:2: ( ( () otherlv_1= 'application:' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'database:' ( (lv_app_database_7_0= ruleDatabase ) ) )? (otherlv_8= 'security:' ( (lv_app_security_9_0= ruleSecurity ) ) )? (otherlv_10= 'model:' (otherlv_11= 'user:' ( (lv_app_models_12_0= ruleUser ) ) )? (otherlv_13= 'role:' ( (lv_app_models_14_0= ruleRole ) ) )? (otherlv_15= 'other:' otherlv_16= '[' ( (lv_app_models_17_0= ruleOtherModel ) ) (otherlv_18= ',' ( (lv_app_models_19_0= ruleOtherModel ) ) )* otherlv_20= ']' )? )? (otherlv_21= 'controllers:' (otherlv_22= 'auth:' ( (lv_app_controllers_23_0= ruleAuthentication ) ) )? (otherlv_24= 'other:' otherlv_25= '[' ( (lv_app_controllers_26_0= ruleOtherController ) ) (otherlv_27= ',' ( (lv_app_controllers_28_0= ruleOtherController ) ) )* otherlv_29= ']' )? )? ) )
            // InternalSecurityDsl.g:79:2: ( () otherlv_1= 'application:' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'database:' ( (lv_app_database_7_0= ruleDatabase ) ) )? (otherlv_8= 'security:' ( (lv_app_security_9_0= ruleSecurity ) ) )? (otherlv_10= 'model:' (otherlv_11= 'user:' ( (lv_app_models_12_0= ruleUser ) ) )? (otherlv_13= 'role:' ( (lv_app_models_14_0= ruleRole ) ) )? (otherlv_15= 'other:' otherlv_16= '[' ( (lv_app_models_17_0= ruleOtherModel ) ) (otherlv_18= ',' ( (lv_app_models_19_0= ruleOtherModel ) ) )* otherlv_20= ']' )? )? (otherlv_21= 'controllers:' (otherlv_22= 'auth:' ( (lv_app_controllers_23_0= ruleAuthentication ) ) )? (otherlv_24= 'other:' otherlv_25= '[' ( (lv_app_controllers_26_0= ruleOtherController ) ) (otherlv_27= ',' ( (lv_app_controllers_28_0= ruleOtherController ) ) )* otherlv_29= ']' )? )? )
            {
            // InternalSecurityDsl.g:79:2: ( () otherlv_1= 'application:' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'database:' ( (lv_app_database_7_0= ruleDatabase ) ) )? (otherlv_8= 'security:' ( (lv_app_security_9_0= ruleSecurity ) ) )? (otherlv_10= 'model:' (otherlv_11= 'user:' ( (lv_app_models_12_0= ruleUser ) ) )? (otherlv_13= 'role:' ( (lv_app_models_14_0= ruleRole ) ) )? (otherlv_15= 'other:' otherlv_16= '[' ( (lv_app_models_17_0= ruleOtherModel ) ) (otherlv_18= ',' ( (lv_app_models_19_0= ruleOtherModel ) ) )* otherlv_20= ']' )? )? (otherlv_21= 'controllers:' (otherlv_22= 'auth:' ( (lv_app_controllers_23_0= ruleAuthentication ) ) )? (otherlv_24= 'other:' otherlv_25= '[' ( (lv_app_controllers_26_0= ruleOtherController ) ) (otherlv_27= ',' ( (lv_app_controllers_28_0= ruleOtherController ) ) )* otherlv_29= ']' )? )? )
            // InternalSecurityDsl.g:80:3: () otherlv_1= 'application:' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'description:' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'database:' ( (lv_app_database_7_0= ruleDatabase ) ) )? (otherlv_8= 'security:' ( (lv_app_security_9_0= ruleSecurity ) ) )? (otherlv_10= 'model:' (otherlv_11= 'user:' ( (lv_app_models_12_0= ruleUser ) ) )? (otherlv_13= 'role:' ( (lv_app_models_14_0= ruleRole ) ) )? (otherlv_15= 'other:' otherlv_16= '[' ( (lv_app_models_17_0= ruleOtherModel ) ) (otherlv_18= ',' ( (lv_app_models_19_0= ruleOtherModel ) ) )* otherlv_20= ']' )? )? (otherlv_21= 'controllers:' (otherlv_22= 'auth:' ( (lv_app_controllers_23_0= ruleAuthentication ) ) )? (otherlv_24= 'other:' otherlv_25= '[' ( (lv_app_controllers_26_0= ruleOtherController ) ) (otherlv_27= ',' ( (lv_app_controllers_28_0= ruleOtherController ) ) )* otherlv_29= ']' )? )?
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
            						"org.ftn.domij.securitydsl.SecurityDsl.EString");
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
                    							"org.ftn.domij.securitydsl.SecurityDsl.EString");
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
                    							"org.ftn.domij.securitydsl.SecurityDsl.Database");
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
                    					
                    pushFollow(FOLLOW_10);
                    lv_app_security_9_0=ruleSecurity();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getApplicationRule());
                    						}
                    						set(
                    							current,
                    							"app_security",
                    							lv_app_security_9_0,
                    							"org.ftn.domij.securitydsl.SecurityDsl.Security");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:189:3: (otherlv_10= 'model:' (otherlv_11= 'user:' ( (lv_app_models_12_0= ruleUser ) ) )? (otherlv_13= 'role:' ( (lv_app_models_14_0= ruleRole ) ) )? (otherlv_15= 'other:' otherlv_16= '[' ( (lv_app_models_17_0= ruleOtherModel ) ) (otherlv_18= ',' ( (lv_app_models_19_0= ruleOtherModel ) ) )* otherlv_20= ']' )? )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSecurityDsl.g:190:4: otherlv_10= 'model:' (otherlv_11= 'user:' ( (lv_app_models_12_0= ruleUser ) ) )? (otherlv_13= 'role:' ( (lv_app_models_14_0= ruleRole ) ) )? (otherlv_15= 'other:' otherlv_16= '[' ( (lv_app_models_17_0= ruleOtherModel ) ) (otherlv_18= ',' ( (lv_app_models_19_0= ruleOtherModel ) ) )* otherlv_20= ']' )?
                    {
                    otherlv_10=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_10, grammarAccess.getApplicationAccess().getModelKeyword_7_0());
                    			
                    // InternalSecurityDsl.g:194:4: (otherlv_11= 'user:' ( (lv_app_models_12_0= ruleUser ) ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==19) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalSecurityDsl.g:195:5: otherlv_11= 'user:' ( (lv_app_models_12_0= ruleUser ) )
                            {
                            otherlv_11=(Token)match(input,19,FOLLOW_12); 

                            					newLeafNode(otherlv_11, grammarAccess.getApplicationAccess().getUserKeyword_7_1_0());
                            				
                            // InternalSecurityDsl.g:199:5: ( (lv_app_models_12_0= ruleUser ) )
                            // InternalSecurityDsl.g:200:6: (lv_app_models_12_0= ruleUser )
                            {
                            // InternalSecurityDsl.g:200:6: (lv_app_models_12_0= ruleUser )
                            // InternalSecurityDsl.g:201:7: lv_app_models_12_0= ruleUser
                            {

                            							newCompositeNode(grammarAccess.getApplicationAccess().getApp_modelsUserParserRuleCall_7_1_1_0());
                            						
                            pushFollow(FOLLOW_13);
                            lv_app_models_12_0=ruleUser();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getApplicationRule());
                            							}
                            							add(
                            								current,
                            								"app_models",
                            								lv_app_models_12_0,
                            								"org.ftn.domij.securitydsl.SecurityDsl.User");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalSecurityDsl.g:219:4: (otherlv_13= 'role:' ( (lv_app_models_14_0= ruleRole ) ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==20) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalSecurityDsl.g:220:5: otherlv_13= 'role:' ( (lv_app_models_14_0= ruleRole ) )
                            {
                            otherlv_13=(Token)match(input,20,FOLLOW_12); 

                            					newLeafNode(otherlv_13, grammarAccess.getApplicationAccess().getRoleKeyword_7_2_0());
                            				
                            // InternalSecurityDsl.g:224:5: ( (lv_app_models_14_0= ruleRole ) )
                            // InternalSecurityDsl.g:225:6: (lv_app_models_14_0= ruleRole )
                            {
                            // InternalSecurityDsl.g:225:6: (lv_app_models_14_0= ruleRole )
                            // InternalSecurityDsl.g:226:7: lv_app_models_14_0= ruleRole
                            {

                            							newCompositeNode(grammarAccess.getApplicationAccess().getApp_modelsRoleParserRuleCall_7_2_1_0());
                            						
                            pushFollow(FOLLOW_14);
                            lv_app_models_14_0=ruleRole();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getApplicationRule());
                            							}
                            							add(
                            								current,
                            								"app_models",
                            								lv_app_models_14_0,
                            								"org.ftn.domij.securitydsl.SecurityDsl.Role");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalSecurityDsl.g:244:4: (otherlv_15= 'other:' otherlv_16= '[' ( (lv_app_models_17_0= ruleOtherModel ) ) (otherlv_18= ',' ( (lv_app_models_19_0= ruleOtherModel ) ) )* otherlv_20= ']' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==21) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalSecurityDsl.g:245:5: otherlv_15= 'other:' otherlv_16= '[' ( (lv_app_models_17_0= ruleOtherModel ) ) (otherlv_18= ',' ( (lv_app_models_19_0= ruleOtherModel ) ) )* otherlv_20= ']'
                            {
                            otherlv_15=(Token)match(input,21,FOLLOW_15); 

                            					newLeafNode(otherlv_15, grammarAccess.getApplicationAccess().getOtherKeyword_7_3_0());
                            				
                            otherlv_16=(Token)match(input,22,FOLLOW_16); 

                            					newLeafNode(otherlv_16, grammarAccess.getApplicationAccess().getLeftSquareBracketKeyword_7_3_1());
                            				
                            // InternalSecurityDsl.g:253:5: ( (lv_app_models_17_0= ruleOtherModel ) )
                            // InternalSecurityDsl.g:254:6: (lv_app_models_17_0= ruleOtherModel )
                            {
                            // InternalSecurityDsl.g:254:6: (lv_app_models_17_0= ruleOtherModel )
                            // InternalSecurityDsl.g:255:7: lv_app_models_17_0= ruleOtherModel
                            {

                            							newCompositeNode(grammarAccess.getApplicationAccess().getApp_modelsOtherModelParserRuleCall_7_3_2_0());
                            						
                            pushFollow(FOLLOW_17);
                            lv_app_models_17_0=ruleOtherModel();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getApplicationRule());
                            							}
                            							add(
                            								current,
                            								"app_models",
                            								lv_app_models_17_0,
                            								"org.ftn.domij.securitydsl.SecurityDsl.OtherModel");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalSecurityDsl.g:272:5: (otherlv_18= ',' ( (lv_app_models_19_0= ruleOtherModel ) ) )*
                            loop6:
                            do {
                                int alt6=2;
                                int LA6_0 = input.LA(1);

                                if ( (LA6_0==23) ) {
                                    alt6=1;
                                }


                                switch (alt6) {
                            	case 1 :
                            	    // InternalSecurityDsl.g:273:6: otherlv_18= ',' ( (lv_app_models_19_0= ruleOtherModel ) )
                            	    {
                            	    otherlv_18=(Token)match(input,23,FOLLOW_16); 

                            	    						newLeafNode(otherlv_18, grammarAccess.getApplicationAccess().getCommaKeyword_7_3_3_0());
                            	    					
                            	    // InternalSecurityDsl.g:277:6: ( (lv_app_models_19_0= ruleOtherModel ) )
                            	    // InternalSecurityDsl.g:278:7: (lv_app_models_19_0= ruleOtherModel )
                            	    {
                            	    // InternalSecurityDsl.g:278:7: (lv_app_models_19_0= ruleOtherModel )
                            	    // InternalSecurityDsl.g:279:8: lv_app_models_19_0= ruleOtherModel
                            	    {

                            	    								newCompositeNode(grammarAccess.getApplicationAccess().getApp_modelsOtherModelParserRuleCall_7_3_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_17);
                            	    lv_app_models_19_0=ruleOtherModel();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getApplicationRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"app_models",
                            	    									lv_app_models_19_0,
                            	    									"org.ftn.domij.securitydsl.SecurityDsl.OtherModel");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop6;
                                }
                            } while (true);

                            otherlv_20=(Token)match(input,24,FOLLOW_18); 

                            					newLeafNode(otherlv_20, grammarAccess.getApplicationAccess().getRightSquareBracketKeyword_7_3_4());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:303:3: (otherlv_21= 'controllers:' (otherlv_22= 'auth:' ( (lv_app_controllers_23_0= ruleAuthentication ) ) )? (otherlv_24= 'other:' otherlv_25= '[' ( (lv_app_controllers_26_0= ruleOtherController ) ) (otherlv_27= ',' ( (lv_app_controllers_28_0= ruleOtherController ) ) )* otherlv_29= ']' )? )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSecurityDsl.g:304:4: otherlv_21= 'controllers:' (otherlv_22= 'auth:' ( (lv_app_controllers_23_0= ruleAuthentication ) ) )? (otherlv_24= 'other:' otherlv_25= '[' ( (lv_app_controllers_26_0= ruleOtherController ) ) (otherlv_27= ',' ( (lv_app_controllers_28_0= ruleOtherController ) ) )* otherlv_29= ']' )?
                    {
                    otherlv_21=(Token)match(input,25,FOLLOW_19); 

                    				newLeafNode(otherlv_21, grammarAccess.getApplicationAccess().getControllersKeyword_8_0());
                    			
                    // InternalSecurityDsl.g:308:4: (otherlv_22= 'auth:' ( (lv_app_controllers_23_0= ruleAuthentication ) ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==26) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalSecurityDsl.g:309:5: otherlv_22= 'auth:' ( (lv_app_controllers_23_0= ruleAuthentication ) )
                            {
                            otherlv_22=(Token)match(input,26,FOLLOW_3); 

                            					newLeafNode(otherlv_22, grammarAccess.getApplicationAccess().getAuthKeyword_8_1_0());
                            				
                            // InternalSecurityDsl.g:313:5: ( (lv_app_controllers_23_0= ruleAuthentication ) )
                            // InternalSecurityDsl.g:314:6: (lv_app_controllers_23_0= ruleAuthentication )
                            {
                            // InternalSecurityDsl.g:314:6: (lv_app_controllers_23_0= ruleAuthentication )
                            // InternalSecurityDsl.g:315:7: lv_app_controllers_23_0= ruleAuthentication
                            {

                            							newCompositeNode(grammarAccess.getApplicationAccess().getApp_controllersAuthenticationParserRuleCall_8_1_1_0());
                            						
                            pushFollow(FOLLOW_20);
                            lv_app_controllers_23_0=ruleAuthentication();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getApplicationRule());
                            							}
                            							add(
                            								current,
                            								"app_controllers",
                            								lv_app_controllers_23_0,
                            								"org.ftn.domij.securitydsl.SecurityDsl.Authentication");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalSecurityDsl.g:333:4: (otherlv_24= 'other:' otherlv_25= '[' ( (lv_app_controllers_26_0= ruleOtherController ) ) (otherlv_27= ',' ( (lv_app_controllers_28_0= ruleOtherController ) ) )* otherlv_29= ']' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==21) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalSecurityDsl.g:334:5: otherlv_24= 'other:' otherlv_25= '[' ( (lv_app_controllers_26_0= ruleOtherController ) ) (otherlv_27= ',' ( (lv_app_controllers_28_0= ruleOtherController ) ) )* otherlv_29= ']'
                            {
                            otherlv_24=(Token)match(input,21,FOLLOW_15); 

                            					newLeafNode(otherlv_24, grammarAccess.getApplicationAccess().getOtherKeyword_8_2_0());
                            				
                            otherlv_25=(Token)match(input,22,FOLLOW_16); 

                            					newLeafNode(otherlv_25, grammarAccess.getApplicationAccess().getLeftSquareBracketKeyword_8_2_1());
                            				
                            // InternalSecurityDsl.g:342:5: ( (lv_app_controllers_26_0= ruleOtherController ) )
                            // InternalSecurityDsl.g:343:6: (lv_app_controllers_26_0= ruleOtherController )
                            {
                            // InternalSecurityDsl.g:343:6: (lv_app_controllers_26_0= ruleOtherController )
                            // InternalSecurityDsl.g:344:7: lv_app_controllers_26_0= ruleOtherController
                            {

                            							newCompositeNode(grammarAccess.getApplicationAccess().getApp_controllersOtherControllerParserRuleCall_8_2_2_0());
                            						
                            pushFollow(FOLLOW_17);
                            lv_app_controllers_26_0=ruleOtherController();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getApplicationRule());
                            							}
                            							add(
                            								current,
                            								"app_controllers",
                            								lv_app_controllers_26_0,
                            								"org.ftn.domij.securitydsl.SecurityDsl.OtherController");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalSecurityDsl.g:361:5: (otherlv_27= ',' ( (lv_app_controllers_28_0= ruleOtherController ) ) )*
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( (LA10_0==23) ) {
                                    alt10=1;
                                }


                                switch (alt10) {
                            	case 1 :
                            	    // InternalSecurityDsl.g:362:6: otherlv_27= ',' ( (lv_app_controllers_28_0= ruleOtherController ) )
                            	    {
                            	    otherlv_27=(Token)match(input,23,FOLLOW_16); 

                            	    						newLeafNode(otherlv_27, grammarAccess.getApplicationAccess().getCommaKeyword_8_2_3_0());
                            	    					
                            	    // InternalSecurityDsl.g:366:6: ( (lv_app_controllers_28_0= ruleOtherController ) )
                            	    // InternalSecurityDsl.g:367:7: (lv_app_controllers_28_0= ruleOtherController )
                            	    {
                            	    // InternalSecurityDsl.g:367:7: (lv_app_controllers_28_0= ruleOtherController )
                            	    // InternalSecurityDsl.g:368:8: lv_app_controllers_28_0= ruleOtherController
                            	    {

                            	    								newCompositeNode(grammarAccess.getApplicationAccess().getApp_controllersOtherControllerParserRuleCall_8_2_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_17);
                            	    lv_app_controllers_28_0=ruleOtherController();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getApplicationRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"app_controllers",
                            	    									lv_app_controllers_28_0,
                            	    									"org.ftn.domij.securitydsl.SecurityDsl.OtherController");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop10;
                                }
                            } while (true);

                            otherlv_29=(Token)match(input,24,FOLLOW_2); 

                            					newLeafNode(otherlv_29, grammarAccess.getApplicationAccess().getRightSquareBracketKeyword_8_2_4());
                            				

                            }
                            break;

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
    // InternalSecurityDsl.g:396:1: entryRuleSecurity returns [EObject current=null] : iv_ruleSecurity= ruleSecurity EOF ;
    public final EObject entryRuleSecurity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecurity = null;


        try {
            // InternalSecurityDsl.g:396:49: (iv_ruleSecurity= ruleSecurity EOF )
            // InternalSecurityDsl.g:397:2: iv_ruleSecurity= ruleSecurity EOF
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
    // InternalSecurityDsl.g:403:1: ruleSecurity returns [EObject current=null] : this_JwtSecurity_0= ruleJwtSecurity ;
    public final EObject ruleSecurity() throws RecognitionException {
        EObject current = null;

        EObject this_JwtSecurity_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:409:2: (this_JwtSecurity_0= ruleJwtSecurity )
            // InternalSecurityDsl.g:410:2: this_JwtSecurity_0= ruleJwtSecurity
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
    // InternalSecurityDsl.g:421:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSecurityDsl.g:421:47: (iv_ruleEString= ruleEString EOF )
            // InternalSecurityDsl.g:422:2: iv_ruleEString= ruleEString EOF
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
    // InternalSecurityDsl.g:428:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSecurityDsl.g:434:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSecurityDsl.g:435:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSecurityDsl.g:435:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSecurityDsl.g:436:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:444:3: this_ID_1= RULE_ID
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
    // InternalSecurityDsl.g:455:1: entryRuleDatabase returns [EObject current=null] : iv_ruleDatabase= ruleDatabase EOF ;
    public final EObject entryRuleDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabase = null;


        try {
            // InternalSecurityDsl.g:455:49: (iv_ruleDatabase= ruleDatabase EOF )
            // InternalSecurityDsl.g:456:2: iv_ruleDatabase= ruleDatabase EOF
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
    // InternalSecurityDsl.g:462:1: ruleDatabase returns [EObject current=null] : (otherlv_0= 'vendorName:' ( (lv_vendorName_1_0= ruleEDatabaseType ) ) otherlv_2= 'url:' ( (lv_url_3_0= ruleEString ) ) otherlv_4= 'username:' ( (lv_username_5_0= ruleEString ) ) otherlv_6= 'password:' ( (lv_password_7_0= ruleEString ) ) ) ;
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
            // InternalSecurityDsl.g:468:2: ( (otherlv_0= 'vendorName:' ( (lv_vendorName_1_0= ruleEDatabaseType ) ) otherlv_2= 'url:' ( (lv_url_3_0= ruleEString ) ) otherlv_4= 'username:' ( (lv_username_5_0= ruleEString ) ) otherlv_6= 'password:' ( (lv_password_7_0= ruleEString ) ) ) )
            // InternalSecurityDsl.g:469:2: (otherlv_0= 'vendorName:' ( (lv_vendorName_1_0= ruleEDatabaseType ) ) otherlv_2= 'url:' ( (lv_url_3_0= ruleEString ) ) otherlv_4= 'username:' ( (lv_username_5_0= ruleEString ) ) otherlv_6= 'password:' ( (lv_password_7_0= ruleEString ) ) )
            {
            // InternalSecurityDsl.g:469:2: (otherlv_0= 'vendorName:' ( (lv_vendorName_1_0= ruleEDatabaseType ) ) otherlv_2= 'url:' ( (lv_url_3_0= ruleEString ) ) otherlv_4= 'username:' ( (lv_username_5_0= ruleEString ) ) otherlv_6= 'password:' ( (lv_password_7_0= ruleEString ) ) )
            // InternalSecurityDsl.g:470:3: otherlv_0= 'vendorName:' ( (lv_vendorName_1_0= ruleEDatabaseType ) ) otherlv_2= 'url:' ( (lv_url_3_0= ruleEString ) ) otherlv_4= 'username:' ( (lv_username_5_0= ruleEString ) ) otherlv_6= 'password:' ( (lv_password_7_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getDatabaseAccess().getVendorNameKeyword_0());
            		
            // InternalSecurityDsl.g:474:3: ( (lv_vendorName_1_0= ruleEDatabaseType ) )
            // InternalSecurityDsl.g:475:4: (lv_vendorName_1_0= ruleEDatabaseType )
            {
            // InternalSecurityDsl.g:475:4: (lv_vendorName_1_0= ruleEDatabaseType )
            // InternalSecurityDsl.g:476:5: lv_vendorName_1_0= ruleEDatabaseType
            {

            					newCompositeNode(grammarAccess.getDatabaseAccess().getVendorNameEDatabaseTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_vendorName_1_0=ruleEDatabaseType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatabaseRule());
            					}
            					set(
            						current,
            						"vendorName",
            						lv_vendorName_1_0,
            						"org.ftn.domij.securitydsl.SecurityDsl.EDatabaseType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getDatabaseAccess().getUrlKeyword_2());
            		
            // InternalSecurityDsl.g:497:3: ( (lv_url_3_0= ruleEString ) )
            // InternalSecurityDsl.g:498:4: (lv_url_3_0= ruleEString )
            {
            // InternalSecurityDsl.g:498:4: (lv_url_3_0= ruleEString )
            // InternalSecurityDsl.g:499:5: lv_url_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDatabaseAccess().getUrlEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
            lv_url_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatabaseRule());
            					}
            					set(
            						current,
            						"url",
            						lv_url_3_0,
            						"org.ftn.domij.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getDatabaseAccess().getUsernameKeyword_4());
            		
            // InternalSecurityDsl.g:520:3: ( (lv_username_5_0= ruleEString ) )
            // InternalSecurityDsl.g:521:4: (lv_username_5_0= ruleEString )
            {
            // InternalSecurityDsl.g:521:4: (lv_username_5_0= ruleEString )
            // InternalSecurityDsl.g:522:5: lv_username_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDatabaseAccess().getUsernameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_24);
            lv_username_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatabaseRule());
            					}
            					set(
            						current,
            						"username",
            						lv_username_5_0,
            						"org.ftn.domij.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getDatabaseAccess().getPasswordKeyword_6());
            		
            // InternalSecurityDsl.g:543:3: ( (lv_password_7_0= ruleEString ) )
            // InternalSecurityDsl.g:544:4: (lv_password_7_0= ruleEString )
            {
            // InternalSecurityDsl.g:544:4: (lv_password_7_0= ruleEString )
            // InternalSecurityDsl.g:545:5: lv_password_7_0= ruleEString
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
            						"org.ftn.domij.securitydsl.SecurityDsl.EString");
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
    // InternalSecurityDsl.g:566:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalSecurityDsl.g:566:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalSecurityDsl.g:567:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalSecurityDsl.g:573:1: ruleAttribute returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'type:' ( (lv_type_4_0= ruleEType ) ) otherlv_5= '}' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:579:2: ( (otherlv_0= '{' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'type:' ( (lv_type_4_0= ruleEType ) ) otherlv_5= '}' ) )
            // InternalSecurityDsl.g:580:2: (otherlv_0= '{' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'type:' ( (lv_type_4_0= ruleEType ) ) otherlv_5= '}' )
            {
            // InternalSecurityDsl.g:580:2: (otherlv_0= '{' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'type:' ( (lv_type_4_0= ruleEType ) ) otherlv_5= '}' )
            // InternalSecurityDsl.g:581:3: otherlv_0= '{' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'type:' ( (lv_type_4_0= ruleEType ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getNameKeyword_1());
            		
            // InternalSecurityDsl.g:589:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSecurityDsl.g:590:4: (lv_name_2_0= ruleEString )
            {
            // InternalSecurityDsl.g:590:4: (lv_name_2_0= ruleEString )
            // InternalSecurityDsl.g:591:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.ftn.domij.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getTypeKeyword_3());
            		
            // InternalSecurityDsl.g:612:3: ( (lv_type_4_0= ruleEType ) )
            // InternalSecurityDsl.g:613:4: (lv_type_4_0= ruleEType )
            {
            // InternalSecurityDsl.g:613:4: (lv_type_4_0= ruleEType )
            // InternalSecurityDsl.g:614:5: lv_type_4_0= ruleEType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeETypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_27);
            lv_type_4_0=ruleEType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"org.ftn.domij.securitydsl.SecurityDsl.EType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_2); 

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
    // InternalSecurityDsl.g:639:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // InternalSecurityDsl.g:639:45: (iv_ruleUser= ruleUser EOF )
            // InternalSecurityDsl.g:640:2: iv_ruleUser= ruleUser EOF
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
    // InternalSecurityDsl.g:646:1: ruleUser returns [EObject current=null] : (otherlv_0= 'identifier:' otherlv_1= 'name:' ( (lv_identifierName_2_0= ruleEString ) ) otherlv_3= 'type:' ( (lv_identifierType_4_0= ruleEType ) ) (otherlv_5= 'other-fields:' otherlv_6= '[' ( (lv_model_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_model_attributes_9_0= ruleAttribute ) ) )* otherlv_10= ']' )? ) ;
    public final EObject ruleUser() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_identifierName_2_0 = null;

        Enumerator lv_identifierType_4_0 = null;

        EObject lv_model_attributes_7_0 = null;

        EObject lv_model_attributes_9_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:652:2: ( (otherlv_0= 'identifier:' otherlv_1= 'name:' ( (lv_identifierName_2_0= ruleEString ) ) otherlv_3= 'type:' ( (lv_identifierType_4_0= ruleEType ) ) (otherlv_5= 'other-fields:' otherlv_6= '[' ( (lv_model_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_model_attributes_9_0= ruleAttribute ) ) )* otherlv_10= ']' )? ) )
            // InternalSecurityDsl.g:653:2: (otherlv_0= 'identifier:' otherlv_1= 'name:' ( (lv_identifierName_2_0= ruleEString ) ) otherlv_3= 'type:' ( (lv_identifierType_4_0= ruleEType ) ) (otherlv_5= 'other-fields:' otherlv_6= '[' ( (lv_model_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_model_attributes_9_0= ruleAttribute ) ) )* otherlv_10= ']' )? )
            {
            // InternalSecurityDsl.g:653:2: (otherlv_0= 'identifier:' otherlv_1= 'name:' ( (lv_identifierName_2_0= ruleEString ) ) otherlv_3= 'type:' ( (lv_identifierType_4_0= ruleEType ) ) (otherlv_5= 'other-fields:' otherlv_6= '[' ( (lv_model_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_model_attributes_9_0= ruleAttribute ) ) )* otherlv_10= ']' )? )
            // InternalSecurityDsl.g:654:3: otherlv_0= 'identifier:' otherlv_1= 'name:' ( (lv_identifierName_2_0= ruleEString ) ) otherlv_3= 'type:' ( (lv_identifierType_4_0= ruleEType ) ) (otherlv_5= 'other-fields:' otherlv_6= '[' ( (lv_model_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_model_attributes_9_0= ruleAttribute ) ) )* otherlv_10= ']' )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUserAccess().getIdentifierKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getUserAccess().getNameKeyword_1());
            		
            // InternalSecurityDsl.g:662:3: ( (lv_identifierName_2_0= ruleEString ) )
            // InternalSecurityDsl.g:663:4: (lv_identifierName_2_0= ruleEString )
            {
            // InternalSecurityDsl.g:663:4: (lv_identifierName_2_0= ruleEString )
            // InternalSecurityDsl.g:664:5: lv_identifierName_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUserAccess().getIdentifierNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
            lv_identifierName_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUserRule());
            					}
            					set(
            						current,
            						"identifierName",
            						lv_identifierName_2_0,
            						"org.ftn.domij.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getUserAccess().getTypeKeyword_3());
            		
            // InternalSecurityDsl.g:685:3: ( (lv_identifierType_4_0= ruleEType ) )
            // InternalSecurityDsl.g:686:4: (lv_identifierType_4_0= ruleEType )
            {
            // InternalSecurityDsl.g:686:4: (lv_identifierType_4_0= ruleEType )
            // InternalSecurityDsl.g:687:5: lv_identifierType_4_0= ruleEType
            {

            					newCompositeNode(grammarAccess.getUserAccess().getIdentifierTypeETypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_28);
            lv_identifierType_4_0=ruleEType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUserRule());
            					}
            					set(
            						current,
            						"identifierType",
            						lv_identifierType_4_0,
            						"org.ftn.domij.securitydsl.SecurityDsl.EType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecurityDsl.g:704:3: (otherlv_5= 'other-fields:' otherlv_6= '[' ( (lv_model_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_model_attributes_9_0= ruleAttribute ) ) )* otherlv_10= ']' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSecurityDsl.g:705:4: otherlv_5= 'other-fields:' otherlv_6= '[' ( (lv_model_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_model_attributes_9_0= ruleAttribute ) ) )* otherlv_10= ']'
                    {
                    otherlv_5=(Token)match(input,35,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getUserAccess().getOtherFieldsKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getUserAccess().getLeftSquareBracketKeyword_5_1());
                    			
                    // InternalSecurityDsl.g:713:4: ( (lv_model_attributes_7_0= ruleAttribute ) )
                    // InternalSecurityDsl.g:714:5: (lv_model_attributes_7_0= ruleAttribute )
                    {
                    // InternalSecurityDsl.g:714:5: (lv_model_attributes_7_0= ruleAttribute )
                    // InternalSecurityDsl.g:715:6: lv_model_attributes_7_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getUserAccess().getModel_attributesAttributeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_model_attributes_7_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUserRule());
                    						}
                    						add(
                    							current,
                    							"model_attributes",
                    							lv_model_attributes_7_0,
                    							"org.ftn.domij.securitydsl.SecurityDsl.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSecurityDsl.g:732:4: (otherlv_8= ',' ( (lv_model_attributes_9_0= ruleAttribute ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==23) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalSecurityDsl.g:733:5: otherlv_8= ',' ( (lv_model_attributes_9_0= ruleAttribute ) )
                    	    {
                    	    otherlv_8=(Token)match(input,23,FOLLOW_16); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getUserAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSecurityDsl.g:737:5: ( (lv_model_attributes_9_0= ruleAttribute ) )
                    	    // InternalSecurityDsl.g:738:6: (lv_model_attributes_9_0= ruleAttribute )
                    	    {
                    	    // InternalSecurityDsl.g:738:6: (lv_model_attributes_9_0= ruleAttribute )
                    	    // InternalSecurityDsl.g:739:7: lv_model_attributes_9_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getUserAccess().getModel_attributesAttributeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_model_attributes_9_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUserRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"model_attributes",
                    	    								lv_model_attributes_9_0,
                    	    								"org.ftn.domij.securitydsl.SecurityDsl.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getUserAccess().getRightSquareBracketKeyword_5_4());
                    			

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
    // $ANTLR end "ruleUser"


    // $ANTLR start "entryRuleOtherModel"
    // InternalSecurityDsl.g:766:1: entryRuleOtherModel returns [EObject current=null] : iv_ruleOtherModel= ruleOtherModel EOF ;
    public final EObject entryRuleOtherModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherModel = null;


        try {
            // InternalSecurityDsl.g:766:51: (iv_ruleOtherModel= ruleOtherModel EOF )
            // InternalSecurityDsl.g:767:2: iv_ruleOtherModel= ruleOtherModel EOF
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
    // InternalSecurityDsl.g:773:1: ruleOtherModel returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'identifier:' otherlv_4= 'name:' ( (lv_identifierName_5_0= ruleEString ) ) otherlv_6= 'type:' ( (lv_identifierType_7_0= ruleEType ) ) (otherlv_8= 'other-fields:' otherlv_9= '[' ( (lv_model_attributes_10_0= ruleAttribute ) ) (otherlv_11= ',' ( (lv_model_attributes_12_0= ruleAttribute ) ) )* otherlv_13= ']' )? otherlv_14= '}' ) ;
    public final EObject ruleOtherModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_identifierName_5_0 = null;

        Enumerator lv_identifierType_7_0 = null;

        EObject lv_model_attributes_10_0 = null;

        EObject lv_model_attributes_12_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:779:2: ( (otherlv_0= '{' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'identifier:' otherlv_4= 'name:' ( (lv_identifierName_5_0= ruleEString ) ) otherlv_6= 'type:' ( (lv_identifierType_7_0= ruleEType ) ) (otherlv_8= 'other-fields:' otherlv_9= '[' ( (lv_model_attributes_10_0= ruleAttribute ) ) (otherlv_11= ',' ( (lv_model_attributes_12_0= ruleAttribute ) ) )* otherlv_13= ']' )? otherlv_14= '}' ) )
            // InternalSecurityDsl.g:780:2: (otherlv_0= '{' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'identifier:' otherlv_4= 'name:' ( (lv_identifierName_5_0= ruleEString ) ) otherlv_6= 'type:' ( (lv_identifierType_7_0= ruleEType ) ) (otherlv_8= 'other-fields:' otherlv_9= '[' ( (lv_model_attributes_10_0= ruleAttribute ) ) (otherlv_11= ',' ( (lv_model_attributes_12_0= ruleAttribute ) ) )* otherlv_13= ']' )? otherlv_14= '}' )
            {
            // InternalSecurityDsl.g:780:2: (otherlv_0= '{' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'identifier:' otherlv_4= 'name:' ( (lv_identifierName_5_0= ruleEString ) ) otherlv_6= 'type:' ( (lv_identifierType_7_0= ruleEType ) ) (otherlv_8= 'other-fields:' otherlv_9= '[' ( (lv_model_attributes_10_0= ruleAttribute ) ) (otherlv_11= ',' ( (lv_model_attributes_12_0= ruleAttribute ) ) )* otherlv_13= ']' )? otherlv_14= '}' )
            // InternalSecurityDsl.g:781:3: otherlv_0= '{' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'identifier:' otherlv_4= 'name:' ( (lv_identifierName_5_0= ruleEString ) ) otherlv_6= 'type:' ( (lv_identifierType_7_0= ruleEType ) ) (otherlv_8= 'other-fields:' otherlv_9= '[' ( (lv_model_attributes_10_0= ruleAttribute ) ) (otherlv_11= ',' ( (lv_model_attributes_12_0= ruleAttribute ) ) )* otherlv_13= ']' )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOtherModelAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getOtherModelAccess().getNameKeyword_1());
            		
            // InternalSecurityDsl.g:789:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSecurityDsl.g:790:4: (lv_name_2_0= ruleEString )
            {
            // InternalSecurityDsl.g:790:4: (lv_name_2_0= ruleEString )
            // InternalSecurityDsl.g:791:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOtherModelAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOtherModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.ftn.domij.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getOtherModelAccess().getIdentifierKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getOtherModelAccess().getNameKeyword_4());
            		
            // InternalSecurityDsl.g:816:3: ( (lv_identifierName_5_0= ruleEString ) )
            // InternalSecurityDsl.g:817:4: (lv_identifierName_5_0= ruleEString )
            {
            // InternalSecurityDsl.g:817:4: (lv_identifierName_5_0= ruleEString )
            // InternalSecurityDsl.g:818:5: lv_identifierName_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOtherModelAccess().getIdentifierNameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_25);
            lv_identifierName_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOtherModelRule());
            					}
            					set(
            						current,
            						"identifierName",
            						lv_identifierName_5_0,
            						"org.ftn.domij.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,32,FOLLOW_26); 

            			newLeafNode(otherlv_6, grammarAccess.getOtherModelAccess().getTypeKeyword_6());
            		
            // InternalSecurityDsl.g:839:3: ( (lv_identifierType_7_0= ruleEType ) )
            // InternalSecurityDsl.g:840:4: (lv_identifierType_7_0= ruleEType )
            {
            // InternalSecurityDsl.g:840:4: (lv_identifierType_7_0= ruleEType )
            // InternalSecurityDsl.g:841:5: lv_identifierType_7_0= ruleEType
            {

            					newCompositeNode(grammarAccess.getOtherModelAccess().getIdentifierTypeETypeEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_29);
            lv_identifierType_7_0=ruleEType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOtherModelRule());
            					}
            					set(
            						current,
            						"identifierType",
            						lv_identifierType_7_0,
            						"org.ftn.domij.securitydsl.SecurityDsl.EType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecurityDsl.g:858:3: (otherlv_8= 'other-fields:' otherlv_9= '[' ( (lv_model_attributes_10_0= ruleAttribute ) ) (otherlv_11= ',' ( (lv_model_attributes_12_0= ruleAttribute ) ) )* otherlv_13= ']' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSecurityDsl.g:859:4: otherlv_8= 'other-fields:' otherlv_9= '[' ( (lv_model_attributes_10_0= ruleAttribute ) ) (otherlv_11= ',' ( (lv_model_attributes_12_0= ruleAttribute ) ) )* otherlv_13= ']'
                    {
                    otherlv_8=(Token)match(input,35,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getOtherModelAccess().getOtherFieldsKeyword_8_0());
                    			
                    otherlv_9=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_9, grammarAccess.getOtherModelAccess().getLeftSquareBracketKeyword_8_1());
                    			
                    // InternalSecurityDsl.g:867:4: ( (lv_model_attributes_10_0= ruleAttribute ) )
                    // InternalSecurityDsl.g:868:5: (lv_model_attributes_10_0= ruleAttribute )
                    {
                    // InternalSecurityDsl.g:868:5: (lv_model_attributes_10_0= ruleAttribute )
                    // InternalSecurityDsl.g:869:6: lv_model_attributes_10_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getOtherModelAccess().getModel_attributesAttributeParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_model_attributes_10_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOtherModelRule());
                    						}
                    						add(
                    							current,
                    							"model_attributes",
                    							lv_model_attributes_10_0,
                    							"org.ftn.domij.securitydsl.SecurityDsl.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSecurityDsl.g:886:4: (otherlv_11= ',' ( (lv_model_attributes_12_0= ruleAttribute ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==23) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalSecurityDsl.g:887:5: otherlv_11= ',' ( (lv_model_attributes_12_0= ruleAttribute ) )
                    	    {
                    	    otherlv_11=(Token)match(input,23,FOLLOW_16); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getOtherModelAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalSecurityDsl.g:891:5: ( (lv_model_attributes_12_0= ruleAttribute ) )
                    	    // InternalSecurityDsl.g:892:6: (lv_model_attributes_12_0= ruleAttribute )
                    	    {
                    	    // InternalSecurityDsl.g:892:6: (lv_model_attributes_12_0= ruleAttribute )
                    	    // InternalSecurityDsl.g:893:7: lv_model_attributes_12_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getOtherModelAccess().getModel_attributesAttributeParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_model_attributes_12_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOtherModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"model_attributes",
                    	    								lv_model_attributes_12_0,
                    	    								"org.ftn.domij.securitydsl.SecurityDsl.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,24,FOLLOW_27); 

                    				newLeafNode(otherlv_13, grammarAccess.getOtherModelAccess().getRightSquareBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getOtherModelAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalSecurityDsl.g:924:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalSecurityDsl.g:924:45: (iv_ruleRole= ruleRole EOF )
            // InternalSecurityDsl.g:925:2: iv_ruleRole= ruleRole EOF
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
    // InternalSecurityDsl.g:931:1: ruleRole returns [EObject current=null] : (otherlv_0= 'identifier:' otherlv_1= 'name:' ( (lv_identifierName_2_0= ruleEString ) ) otherlv_3= 'type:' ( (lv_identifierType_4_0= ruleEType ) ) (otherlv_5= 'other-fields:' otherlv_6= '[' ( (lv_model_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_model_attributes_9_0= ruleAttribute ) ) )* otherlv_10= ']' )? ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_identifierName_2_0 = null;

        Enumerator lv_identifierType_4_0 = null;

        EObject lv_model_attributes_7_0 = null;

        EObject lv_model_attributes_9_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:937:2: ( (otherlv_0= 'identifier:' otherlv_1= 'name:' ( (lv_identifierName_2_0= ruleEString ) ) otherlv_3= 'type:' ( (lv_identifierType_4_0= ruleEType ) ) (otherlv_5= 'other-fields:' otherlv_6= '[' ( (lv_model_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_model_attributes_9_0= ruleAttribute ) ) )* otherlv_10= ']' )? ) )
            // InternalSecurityDsl.g:938:2: (otherlv_0= 'identifier:' otherlv_1= 'name:' ( (lv_identifierName_2_0= ruleEString ) ) otherlv_3= 'type:' ( (lv_identifierType_4_0= ruleEType ) ) (otherlv_5= 'other-fields:' otherlv_6= '[' ( (lv_model_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_model_attributes_9_0= ruleAttribute ) ) )* otherlv_10= ']' )? )
            {
            // InternalSecurityDsl.g:938:2: (otherlv_0= 'identifier:' otherlv_1= 'name:' ( (lv_identifierName_2_0= ruleEString ) ) otherlv_3= 'type:' ( (lv_identifierType_4_0= ruleEType ) ) (otherlv_5= 'other-fields:' otherlv_6= '[' ( (lv_model_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_model_attributes_9_0= ruleAttribute ) ) )* otherlv_10= ']' )? )
            // InternalSecurityDsl.g:939:3: otherlv_0= 'identifier:' otherlv_1= 'name:' ( (lv_identifierName_2_0= ruleEString ) ) otherlv_3= 'type:' ( (lv_identifierType_4_0= ruleEType ) ) (otherlv_5= 'other-fields:' otherlv_6= '[' ( (lv_model_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_model_attributes_9_0= ruleAttribute ) ) )* otherlv_10= ']' )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getIdentifierKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRoleAccess().getNameKeyword_1());
            		
            // InternalSecurityDsl.g:947:3: ( (lv_identifierName_2_0= ruleEString ) )
            // InternalSecurityDsl.g:948:4: (lv_identifierName_2_0= ruleEString )
            {
            // InternalSecurityDsl.g:948:4: (lv_identifierName_2_0= ruleEString )
            // InternalSecurityDsl.g:949:5: lv_identifierName_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRoleAccess().getIdentifierNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
            lv_identifierName_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoleRule());
            					}
            					set(
            						current,
            						"identifierName",
            						lv_identifierName_2_0,
            						"org.ftn.domij.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getRoleAccess().getTypeKeyword_3());
            		
            // InternalSecurityDsl.g:970:3: ( (lv_identifierType_4_0= ruleEType ) )
            // InternalSecurityDsl.g:971:4: (lv_identifierType_4_0= ruleEType )
            {
            // InternalSecurityDsl.g:971:4: (lv_identifierType_4_0= ruleEType )
            // InternalSecurityDsl.g:972:5: lv_identifierType_4_0= ruleEType
            {

            					newCompositeNode(grammarAccess.getRoleAccess().getIdentifierTypeETypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_28);
            lv_identifierType_4_0=ruleEType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoleRule());
            					}
            					set(
            						current,
            						"identifierType",
            						lv_identifierType_4_0,
            						"org.ftn.domij.securitydsl.SecurityDsl.EType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecurityDsl.g:989:3: (otherlv_5= 'other-fields:' otherlv_6= '[' ( (lv_model_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_model_attributes_9_0= ruleAttribute ) ) )* otherlv_10= ']' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSecurityDsl.g:990:4: otherlv_5= 'other-fields:' otherlv_6= '[' ( (lv_model_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_model_attributes_9_0= ruleAttribute ) ) )* otherlv_10= ']'
                    {
                    otherlv_5=(Token)match(input,35,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getRoleAccess().getOtherFieldsKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getRoleAccess().getLeftSquareBracketKeyword_5_1());
                    			
                    // InternalSecurityDsl.g:998:4: ( (lv_model_attributes_7_0= ruleAttribute ) )
                    // InternalSecurityDsl.g:999:5: (lv_model_attributes_7_0= ruleAttribute )
                    {
                    // InternalSecurityDsl.g:999:5: (lv_model_attributes_7_0= ruleAttribute )
                    // InternalSecurityDsl.g:1000:6: lv_model_attributes_7_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getRoleAccess().getModel_attributesAttributeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_model_attributes_7_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoleRule());
                    						}
                    						add(
                    							current,
                    							"model_attributes",
                    							lv_model_attributes_7_0,
                    							"org.ftn.domij.securitydsl.SecurityDsl.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSecurityDsl.g:1017:4: (otherlv_8= ',' ( (lv_model_attributes_9_0= ruleAttribute ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==23) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalSecurityDsl.g:1018:5: otherlv_8= ',' ( (lv_model_attributes_9_0= ruleAttribute ) )
                    	    {
                    	    otherlv_8=(Token)match(input,23,FOLLOW_16); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getRoleAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSecurityDsl.g:1022:5: ( (lv_model_attributes_9_0= ruleAttribute ) )
                    	    // InternalSecurityDsl.g:1023:6: (lv_model_attributes_9_0= ruleAttribute )
                    	    {
                    	    // InternalSecurityDsl.g:1023:6: (lv_model_attributes_9_0= ruleAttribute )
                    	    // InternalSecurityDsl.g:1024:7: lv_model_attributes_9_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getRoleAccess().getModel_attributesAttributeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_model_attributes_9_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRoleRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"model_attributes",
                    	    								lv_model_attributes_9_0,
                    	    								"org.ftn.domij.securitydsl.SecurityDsl.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getRoleAccess().getRightSquareBracketKeyword_5_4());
                    			

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
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleEndpoint"
    // InternalSecurityDsl.g:1051:1: entryRuleEndpoint returns [EObject current=null] : iv_ruleEndpoint= ruleEndpoint EOF ;
    public final EObject entryRuleEndpoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndpoint = null;


        try {
            // InternalSecurityDsl.g:1051:49: (iv_ruleEndpoint= ruleEndpoint EOF )
            // InternalSecurityDsl.g:1052:2: iv_ruleEndpoint= ruleEndpoint EOF
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
    // InternalSecurityDsl.g:1058:1: ruleEndpoint returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'url:' ( (lv_url_2_0= ruleEString ) ) otherlv_3= 'method-name:' ( (lv_function_name_4_0= ruleEString ) ) otherlv_5= 'method:' ( (lv_method_6_0= ruleEEndpointMethod ) ) otherlv_7= '}' ) ;
    public final EObject ruleEndpoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_url_2_0 = null;

        AntlrDatatypeRuleToken lv_function_name_4_0 = null;

        Enumerator lv_method_6_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:1064:2: ( (otherlv_0= '{' otherlv_1= 'url:' ( (lv_url_2_0= ruleEString ) ) otherlv_3= 'method-name:' ( (lv_function_name_4_0= ruleEString ) ) otherlv_5= 'method:' ( (lv_method_6_0= ruleEEndpointMethod ) ) otherlv_7= '}' ) )
            // InternalSecurityDsl.g:1065:2: (otherlv_0= '{' otherlv_1= 'url:' ( (lv_url_2_0= ruleEString ) ) otherlv_3= 'method-name:' ( (lv_function_name_4_0= ruleEString ) ) otherlv_5= 'method:' ( (lv_method_6_0= ruleEEndpointMethod ) ) otherlv_7= '}' )
            {
            // InternalSecurityDsl.g:1065:2: (otherlv_0= '{' otherlv_1= 'url:' ( (lv_url_2_0= ruleEString ) ) otherlv_3= 'method-name:' ( (lv_function_name_4_0= ruleEString ) ) otherlv_5= 'method:' ( (lv_method_6_0= ruleEEndpointMethod ) ) otherlv_7= '}' )
            // InternalSecurityDsl.g:1066:3: otherlv_0= '{' otherlv_1= 'url:' ( (lv_url_2_0= ruleEString ) ) otherlv_3= 'method-name:' ( (lv_function_name_4_0= ruleEString ) ) otherlv_5= 'method:' ( (lv_method_6_0= ruleEEndpointMethod ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getEndpointAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEndpointAccess().getUrlKeyword_1());
            		
            // InternalSecurityDsl.g:1074:3: ( (lv_url_2_0= ruleEString ) )
            // InternalSecurityDsl.g:1075:4: (lv_url_2_0= ruleEString )
            {
            // InternalSecurityDsl.g:1075:4: (lv_url_2_0= ruleEString )
            // InternalSecurityDsl.g:1076:5: lv_url_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEndpointAccess().getUrlEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
            lv_url_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEndpointRule());
            					}
            					set(
            						current,
            						"url",
            						lv_url_2_0,
            						"org.ftn.domij.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getEndpointAccess().getMethodNameKeyword_3());
            		
            // InternalSecurityDsl.g:1097:3: ( (lv_function_name_4_0= ruleEString ) )
            // InternalSecurityDsl.g:1098:4: (lv_function_name_4_0= ruleEString )
            {
            // InternalSecurityDsl.g:1098:4: (lv_function_name_4_0= ruleEString )
            // InternalSecurityDsl.g:1099:5: lv_function_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEndpointAccess().getFunction_nameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_31);
            lv_function_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEndpointRule());
            					}
            					set(
            						current,
            						"function_name",
            						lv_function_name_4_0,
            						"org.ftn.domij.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,37,FOLLOW_32); 

            			newLeafNode(otherlv_5, grammarAccess.getEndpointAccess().getMethodKeyword_5());
            		
            // InternalSecurityDsl.g:1120:3: ( (lv_method_6_0= ruleEEndpointMethod ) )
            // InternalSecurityDsl.g:1121:4: (lv_method_6_0= ruleEEndpointMethod )
            {
            // InternalSecurityDsl.g:1121:4: (lv_method_6_0= ruleEEndpointMethod )
            // InternalSecurityDsl.g:1122:5: lv_method_6_0= ruleEEndpointMethod
            {

            					newCompositeNode(grammarAccess.getEndpointAccess().getMethodEEndpointMethodEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_27);
            lv_method_6_0=ruleEEndpointMethod();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEndpointRule());
            					}
            					set(
            						current,
            						"method",
            						lv_method_6_0,
            						"org.ftn.domij.securitydsl.SecurityDsl.EEndpointMethod");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getEndpointAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleAuthEndpoint"
    // InternalSecurityDsl.g:1147:1: entryRuleAuthEndpoint returns [EObject current=null] : iv_ruleAuthEndpoint= ruleAuthEndpoint EOF ;
    public final EObject entryRuleAuthEndpoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthEndpoint = null;


        try {
            // InternalSecurityDsl.g:1147:53: (iv_ruleAuthEndpoint= ruleAuthEndpoint EOF )
            // InternalSecurityDsl.g:1148:2: iv_ruleAuthEndpoint= ruleAuthEndpoint EOF
            {
             newCompositeNode(grammarAccess.getAuthEndpointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAuthEndpoint=ruleAuthEndpoint();

            state._fsp--;

             current =iv_ruleAuthEndpoint; 
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
    // $ANTLR end "entryRuleAuthEndpoint"


    // $ANTLR start "ruleAuthEndpoint"
    // InternalSecurityDsl.g:1154:1: ruleAuthEndpoint returns [EObject current=null] : (otherlv_0= 'url:' ( (lv_url_1_0= ruleEString ) ) otherlv_2= 'method-name:' ( (lv_function_name_3_0= ruleEString ) ) otherlv_4= 'method:' ( (lv_method_5_0= ruleEEndpointMethod ) ) ) ;
    public final EObject ruleAuthEndpoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_url_1_0 = null;

        AntlrDatatypeRuleToken lv_function_name_3_0 = null;

        Enumerator lv_method_5_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:1160:2: ( (otherlv_0= 'url:' ( (lv_url_1_0= ruleEString ) ) otherlv_2= 'method-name:' ( (lv_function_name_3_0= ruleEString ) ) otherlv_4= 'method:' ( (lv_method_5_0= ruleEEndpointMethod ) ) ) )
            // InternalSecurityDsl.g:1161:2: (otherlv_0= 'url:' ( (lv_url_1_0= ruleEString ) ) otherlv_2= 'method-name:' ( (lv_function_name_3_0= ruleEString ) ) otherlv_4= 'method:' ( (lv_method_5_0= ruleEEndpointMethod ) ) )
            {
            // InternalSecurityDsl.g:1161:2: (otherlv_0= 'url:' ( (lv_url_1_0= ruleEString ) ) otherlv_2= 'method-name:' ( (lv_function_name_3_0= ruleEString ) ) otherlv_4= 'method:' ( (lv_method_5_0= ruleEEndpointMethod ) ) )
            // InternalSecurityDsl.g:1162:3: otherlv_0= 'url:' ( (lv_url_1_0= ruleEString ) ) otherlv_2= 'method-name:' ( (lv_function_name_3_0= ruleEString ) ) otherlv_4= 'method:' ( (lv_method_5_0= ruleEEndpointMethod ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAuthEndpointAccess().getUrlKeyword_0());
            		
            // InternalSecurityDsl.g:1166:3: ( (lv_url_1_0= ruleEString ) )
            // InternalSecurityDsl.g:1167:4: (lv_url_1_0= ruleEString )
            {
            // InternalSecurityDsl.g:1167:4: (lv_url_1_0= ruleEString )
            // InternalSecurityDsl.g:1168:5: lv_url_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAuthEndpointAccess().getUrlEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
            lv_url_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAuthEndpointRule());
            					}
            					set(
            						current,
            						"url",
            						lv_url_1_0,
            						"org.ftn.domij.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getAuthEndpointAccess().getMethodNameKeyword_2());
            		
            // InternalSecurityDsl.g:1189:3: ( (lv_function_name_3_0= ruleEString ) )
            // InternalSecurityDsl.g:1190:4: (lv_function_name_3_0= ruleEString )
            {
            // InternalSecurityDsl.g:1190:4: (lv_function_name_3_0= ruleEString )
            // InternalSecurityDsl.g:1191:5: lv_function_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAuthEndpointAccess().getFunction_nameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_31);
            lv_function_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAuthEndpointRule());
            					}
            					set(
            						current,
            						"function_name",
            						lv_function_name_3_0,
            						"org.ftn.domij.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,37,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getAuthEndpointAccess().getMethodKeyword_4());
            		
            // InternalSecurityDsl.g:1212:3: ( (lv_method_5_0= ruleEEndpointMethod ) )
            // InternalSecurityDsl.g:1213:4: (lv_method_5_0= ruleEEndpointMethod )
            {
            // InternalSecurityDsl.g:1213:4: (lv_method_5_0= ruleEEndpointMethod )
            // InternalSecurityDsl.g:1214:5: lv_method_5_0= ruleEEndpointMethod
            {

            					newCompositeNode(grammarAccess.getAuthEndpointAccess().getMethodEEndpointMethodEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_method_5_0=ruleEEndpointMethod();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAuthEndpointRule());
            					}
            					set(
            						current,
            						"method",
            						lv_method_5_0,
            						"org.ftn.domij.securitydsl.SecurityDsl.EEndpointMethod");
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
    // $ANTLR end "ruleAuthEndpoint"


    // $ANTLR start "entryRuleAuthentication"
    // InternalSecurityDsl.g:1235:1: entryRuleAuthentication returns [EObject current=null] : iv_ruleAuthentication= ruleAuthentication EOF ;
    public final EObject entryRuleAuthentication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthentication = null;


        try {
            // InternalSecurityDsl.g:1235:55: (iv_ruleAuthentication= ruleAuthentication EOF )
            // InternalSecurityDsl.g:1236:2: iv_ruleAuthentication= ruleAuthentication EOF
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
    // InternalSecurityDsl.g:1242:1: ruleAuthentication returns [EObject current=null] : (otherlv_0= 'name:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'path:' ( (lv_path_3_0= ruleEString ) ) (otherlv_4= 'signup-url:' ( (lv_signup_endpoint_5_0= ruleAuthEndpoint ) ) )? (otherlv_6= 'login-url:' ( (lv_login_endpoint_7_0= ruleAuthEndpoint ) ) )? (otherlv_8= 'logout-url:' ( (lv_logout_endpoint_9_0= ruleAuthEndpoint ) ) )? (otherlv_10= 'endpoints:' otherlv_11= '[' ( (lv_controller_endpoints_12_0= ruleEndpoint ) ) (otherlv_13= ',' ( (lv_controller_endpoints_14_0= ruleEndpoint ) ) )* otherlv_15= ']' )? ) ;
    public final EObject ruleAuthentication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_path_3_0 = null;

        EObject lv_signup_endpoint_5_0 = null;

        EObject lv_login_endpoint_7_0 = null;

        EObject lv_logout_endpoint_9_0 = null;

        EObject lv_controller_endpoints_12_0 = null;

        EObject lv_controller_endpoints_14_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:1248:2: ( (otherlv_0= 'name:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'path:' ( (lv_path_3_0= ruleEString ) ) (otherlv_4= 'signup-url:' ( (lv_signup_endpoint_5_0= ruleAuthEndpoint ) ) )? (otherlv_6= 'login-url:' ( (lv_login_endpoint_7_0= ruleAuthEndpoint ) ) )? (otherlv_8= 'logout-url:' ( (lv_logout_endpoint_9_0= ruleAuthEndpoint ) ) )? (otherlv_10= 'endpoints:' otherlv_11= '[' ( (lv_controller_endpoints_12_0= ruleEndpoint ) ) (otherlv_13= ',' ( (lv_controller_endpoints_14_0= ruleEndpoint ) ) )* otherlv_15= ']' )? ) )
            // InternalSecurityDsl.g:1249:2: (otherlv_0= 'name:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'path:' ( (lv_path_3_0= ruleEString ) ) (otherlv_4= 'signup-url:' ( (lv_signup_endpoint_5_0= ruleAuthEndpoint ) ) )? (otherlv_6= 'login-url:' ( (lv_login_endpoint_7_0= ruleAuthEndpoint ) ) )? (otherlv_8= 'logout-url:' ( (lv_logout_endpoint_9_0= ruleAuthEndpoint ) ) )? (otherlv_10= 'endpoints:' otherlv_11= '[' ( (lv_controller_endpoints_12_0= ruleEndpoint ) ) (otherlv_13= ',' ( (lv_controller_endpoints_14_0= ruleEndpoint ) ) )* otherlv_15= ']' )? )
            {
            // InternalSecurityDsl.g:1249:2: (otherlv_0= 'name:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'path:' ( (lv_path_3_0= ruleEString ) ) (otherlv_4= 'signup-url:' ( (lv_signup_endpoint_5_0= ruleAuthEndpoint ) ) )? (otherlv_6= 'login-url:' ( (lv_login_endpoint_7_0= ruleAuthEndpoint ) ) )? (otherlv_8= 'logout-url:' ( (lv_logout_endpoint_9_0= ruleAuthEndpoint ) ) )? (otherlv_10= 'endpoints:' otherlv_11= '[' ( (lv_controller_endpoints_12_0= ruleEndpoint ) ) (otherlv_13= ',' ( (lv_controller_endpoints_14_0= ruleEndpoint ) ) )* otherlv_15= ']' )? )
            // InternalSecurityDsl.g:1250:3: otherlv_0= 'name:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'path:' ( (lv_path_3_0= ruleEString ) ) (otherlv_4= 'signup-url:' ( (lv_signup_endpoint_5_0= ruleAuthEndpoint ) ) )? (otherlv_6= 'login-url:' ( (lv_login_endpoint_7_0= ruleAuthEndpoint ) ) )? (otherlv_8= 'logout-url:' ( (lv_logout_endpoint_9_0= ruleAuthEndpoint ) ) )? (otherlv_10= 'endpoints:' otherlv_11= '[' ( (lv_controller_endpoints_12_0= ruleEndpoint ) ) (otherlv_13= ',' ( (lv_controller_endpoints_14_0= ruleEndpoint ) ) )* otherlv_15= ']' )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAuthenticationAccess().getNameKeyword_0());
            		
            // InternalSecurityDsl.g:1254:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSecurityDsl.g:1255:4: (lv_name_1_0= ruleEString )
            {
            // InternalSecurityDsl.g:1255:4: (lv_name_1_0= ruleEString )
            // InternalSecurityDsl.g:1256:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAuthenticationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAuthenticationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.ftn.domij.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getAuthenticationAccess().getPathKeyword_2());
            		
            // InternalSecurityDsl.g:1277:3: ( (lv_path_3_0= ruleEString ) )
            // InternalSecurityDsl.g:1278:4: (lv_path_3_0= ruleEString )
            {
            // InternalSecurityDsl.g:1278:4: (lv_path_3_0= ruleEString )
            // InternalSecurityDsl.g:1279:5: lv_path_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAuthenticationAccess().getPathEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_34);
            lv_path_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAuthenticationRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_3_0,
            						"org.ftn.domij.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecurityDsl.g:1296:3: (otherlv_4= 'signup-url:' ( (lv_signup_endpoint_5_0= ruleAuthEndpoint ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSecurityDsl.g:1297:4: otherlv_4= 'signup-url:' ( (lv_signup_endpoint_5_0= ruleAuthEndpoint ) )
                    {
                    otherlv_4=(Token)match(input,39,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getAuthenticationAccess().getSignupUrlKeyword_4_0());
                    			
                    // InternalSecurityDsl.g:1301:4: ( (lv_signup_endpoint_5_0= ruleAuthEndpoint ) )
                    // InternalSecurityDsl.g:1302:5: (lv_signup_endpoint_5_0= ruleAuthEndpoint )
                    {
                    // InternalSecurityDsl.g:1302:5: (lv_signup_endpoint_5_0= ruleAuthEndpoint )
                    // InternalSecurityDsl.g:1303:6: lv_signup_endpoint_5_0= ruleAuthEndpoint
                    {

                    						newCompositeNode(grammarAccess.getAuthenticationAccess().getSignup_endpointAuthEndpointParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_signup_endpoint_5_0=ruleAuthEndpoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAuthenticationRule());
                    						}
                    						set(
                    							current,
                    							"signup_endpoint",
                    							lv_signup_endpoint_5_0,
                    							"org.ftn.domij.securitydsl.SecurityDsl.AuthEndpoint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:1321:3: (otherlv_6= 'login-url:' ( (lv_login_endpoint_7_0= ruleAuthEndpoint ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==40) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSecurityDsl.g:1322:4: otherlv_6= 'login-url:' ( (lv_login_endpoint_7_0= ruleAuthEndpoint ) )
                    {
                    otherlv_6=(Token)match(input,40,FOLLOW_22); 

                    				newLeafNode(otherlv_6, grammarAccess.getAuthenticationAccess().getLoginUrlKeyword_5_0());
                    			
                    // InternalSecurityDsl.g:1326:4: ( (lv_login_endpoint_7_0= ruleAuthEndpoint ) )
                    // InternalSecurityDsl.g:1327:5: (lv_login_endpoint_7_0= ruleAuthEndpoint )
                    {
                    // InternalSecurityDsl.g:1327:5: (lv_login_endpoint_7_0= ruleAuthEndpoint )
                    // InternalSecurityDsl.g:1328:6: lv_login_endpoint_7_0= ruleAuthEndpoint
                    {

                    						newCompositeNode(grammarAccess.getAuthenticationAccess().getLogin_endpointAuthEndpointParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_login_endpoint_7_0=ruleAuthEndpoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAuthenticationRule());
                    						}
                    						set(
                    							current,
                    							"login_endpoint",
                    							lv_login_endpoint_7_0,
                    							"org.ftn.domij.securitydsl.SecurityDsl.AuthEndpoint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:1346:3: (otherlv_8= 'logout-url:' ( (lv_logout_endpoint_9_0= ruleAuthEndpoint ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==41) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSecurityDsl.g:1347:4: otherlv_8= 'logout-url:' ( (lv_logout_endpoint_9_0= ruleAuthEndpoint ) )
                    {
                    otherlv_8=(Token)match(input,41,FOLLOW_22); 

                    				newLeafNode(otherlv_8, grammarAccess.getAuthenticationAccess().getLogoutUrlKeyword_6_0());
                    			
                    // InternalSecurityDsl.g:1351:4: ( (lv_logout_endpoint_9_0= ruleAuthEndpoint ) )
                    // InternalSecurityDsl.g:1352:5: (lv_logout_endpoint_9_0= ruleAuthEndpoint )
                    {
                    // InternalSecurityDsl.g:1352:5: (lv_logout_endpoint_9_0= ruleAuthEndpoint )
                    // InternalSecurityDsl.g:1353:6: lv_logout_endpoint_9_0= ruleAuthEndpoint
                    {

                    						newCompositeNode(grammarAccess.getAuthenticationAccess().getLogout_endpointAuthEndpointParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_logout_endpoint_9_0=ruleAuthEndpoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAuthenticationRule());
                    						}
                    						set(
                    							current,
                    							"logout_endpoint",
                    							lv_logout_endpoint_9_0,
                    							"org.ftn.domij.securitydsl.SecurityDsl.AuthEndpoint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:1371:3: (otherlv_10= 'endpoints:' otherlv_11= '[' ( (lv_controller_endpoints_12_0= ruleEndpoint ) ) (otherlv_13= ',' ( (lv_controller_endpoints_14_0= ruleEndpoint ) ) )* otherlv_15= ']' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==42) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSecurityDsl.g:1372:4: otherlv_10= 'endpoints:' otherlv_11= '[' ( (lv_controller_endpoints_12_0= ruleEndpoint ) ) (otherlv_13= ',' ( (lv_controller_endpoints_14_0= ruleEndpoint ) ) )* otherlv_15= ']'
                    {
                    otherlv_10=(Token)match(input,42,FOLLOW_15); 

                    				newLeafNode(otherlv_10, grammarAccess.getAuthenticationAccess().getEndpointsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_11, grammarAccess.getAuthenticationAccess().getLeftSquareBracketKeyword_7_1());
                    			
                    // InternalSecurityDsl.g:1380:4: ( (lv_controller_endpoints_12_0= ruleEndpoint ) )
                    // InternalSecurityDsl.g:1381:5: (lv_controller_endpoints_12_0= ruleEndpoint )
                    {
                    // InternalSecurityDsl.g:1381:5: (lv_controller_endpoints_12_0= ruleEndpoint )
                    // InternalSecurityDsl.g:1382:6: lv_controller_endpoints_12_0= ruleEndpoint
                    {

                    						newCompositeNode(grammarAccess.getAuthenticationAccess().getController_endpointsEndpointParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_controller_endpoints_12_0=ruleEndpoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAuthenticationRule());
                    						}
                    						add(
                    							current,
                    							"controller_endpoints",
                    							lv_controller_endpoints_12_0,
                    							"org.ftn.domij.securitydsl.SecurityDsl.Endpoint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSecurityDsl.g:1399:4: (otherlv_13= ',' ( (lv_controller_endpoints_14_0= ruleEndpoint ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==23) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalSecurityDsl.g:1400:5: otherlv_13= ',' ( (lv_controller_endpoints_14_0= ruleEndpoint ) )
                    	    {
                    	    otherlv_13=(Token)match(input,23,FOLLOW_16); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getAuthenticationAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalSecurityDsl.g:1404:5: ( (lv_controller_endpoints_14_0= ruleEndpoint ) )
                    	    // InternalSecurityDsl.g:1405:6: (lv_controller_endpoints_14_0= ruleEndpoint )
                    	    {
                    	    // InternalSecurityDsl.g:1405:6: (lv_controller_endpoints_14_0= ruleEndpoint )
                    	    // InternalSecurityDsl.g:1406:7: lv_controller_endpoints_14_0= ruleEndpoint
                    	    {

                    	    							newCompositeNode(grammarAccess.getAuthenticationAccess().getController_endpointsEndpointParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_controller_endpoints_14_0=ruleEndpoint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAuthenticationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"controller_endpoints",
                    	    								lv_controller_endpoints_14_0,
                    	    								"org.ftn.domij.securitydsl.SecurityDsl.Endpoint");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getAuthenticationAccess().getRightSquareBracketKeyword_7_4());
                    			

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
    // $ANTLR end "ruleAuthentication"


    // $ANTLR start "entryRuleOtherController"
    // InternalSecurityDsl.g:1433:1: entryRuleOtherController returns [EObject current=null] : iv_ruleOtherController= ruleOtherController EOF ;
    public final EObject entryRuleOtherController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherController = null;


        try {
            // InternalSecurityDsl.g:1433:56: (iv_ruleOtherController= ruleOtherController EOF )
            // InternalSecurityDsl.g:1434:2: iv_ruleOtherController= ruleOtherController EOF
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
    // InternalSecurityDsl.g:1440:1: ruleOtherController returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'path:' ( (lv_path_4_0= ruleEString ) ) (otherlv_5= 'endpoints:' otherlv_6= '[' ( (lv_controller_endpoints_7_0= ruleEndpoint ) ) (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )* otherlv_10= ']' )? otherlv_11= '}' ) ;
    public final EObject ruleOtherController() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_path_4_0 = null;

        EObject lv_controller_endpoints_7_0 = null;

        EObject lv_controller_endpoints_9_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:1446:2: ( (otherlv_0= '{' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'path:' ( (lv_path_4_0= ruleEString ) ) (otherlv_5= 'endpoints:' otherlv_6= '[' ( (lv_controller_endpoints_7_0= ruleEndpoint ) ) (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )* otherlv_10= ']' )? otherlv_11= '}' ) )
            // InternalSecurityDsl.g:1447:2: (otherlv_0= '{' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'path:' ( (lv_path_4_0= ruleEString ) ) (otherlv_5= 'endpoints:' otherlv_6= '[' ( (lv_controller_endpoints_7_0= ruleEndpoint ) ) (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )* otherlv_10= ']' )? otherlv_11= '}' )
            {
            // InternalSecurityDsl.g:1447:2: (otherlv_0= '{' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'path:' ( (lv_path_4_0= ruleEString ) ) (otherlv_5= 'endpoints:' otherlv_6= '[' ( (lv_controller_endpoints_7_0= ruleEndpoint ) ) (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )* otherlv_10= ']' )? otherlv_11= '}' )
            // InternalSecurityDsl.g:1448:3: otherlv_0= '{' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'path:' ( (lv_path_4_0= ruleEString ) ) (otherlv_5= 'endpoints:' otherlv_6= '[' ( (lv_controller_endpoints_7_0= ruleEndpoint ) ) (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )* otherlv_10= ']' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOtherControllerAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getOtherControllerAccess().getNameKeyword_1());
            		
            // InternalSecurityDsl.g:1456:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSecurityDsl.g:1457:4: (lv_name_2_0= ruleEString )
            {
            // InternalSecurityDsl.g:1457:4: (lv_name_2_0= ruleEString )
            // InternalSecurityDsl.g:1458:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOtherControllerAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_33);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOtherControllerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.ftn.domij.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getOtherControllerAccess().getPathKeyword_3());
            		
            // InternalSecurityDsl.g:1479:3: ( (lv_path_4_0= ruleEString ) )
            // InternalSecurityDsl.g:1480:4: (lv_path_4_0= ruleEString )
            {
            // InternalSecurityDsl.g:1480:4: (lv_path_4_0= ruleEString )
            // InternalSecurityDsl.g:1481:5: lv_path_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOtherControllerAccess().getPathEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_38);
            lv_path_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOtherControllerRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_4_0,
            						"org.ftn.domij.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecurityDsl.g:1498:3: (otherlv_5= 'endpoints:' otherlv_6= '[' ( (lv_controller_endpoints_7_0= ruleEndpoint ) ) (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )* otherlv_10= ']' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==42) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSecurityDsl.g:1499:4: otherlv_5= 'endpoints:' otherlv_6= '[' ( (lv_controller_endpoints_7_0= ruleEndpoint ) ) (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )* otherlv_10= ']'
                    {
                    otherlv_5=(Token)match(input,42,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getOtherControllerAccess().getEndpointsKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getOtherControllerAccess().getLeftSquareBracketKeyword_5_1());
                    			
                    // InternalSecurityDsl.g:1507:4: ( (lv_controller_endpoints_7_0= ruleEndpoint ) )
                    // InternalSecurityDsl.g:1508:5: (lv_controller_endpoints_7_0= ruleEndpoint )
                    {
                    // InternalSecurityDsl.g:1508:5: (lv_controller_endpoints_7_0= ruleEndpoint )
                    // InternalSecurityDsl.g:1509:6: lv_controller_endpoints_7_0= ruleEndpoint
                    {

                    						newCompositeNode(grammarAccess.getOtherControllerAccess().getController_endpointsEndpointParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_controller_endpoints_7_0=ruleEndpoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOtherControllerRule());
                    						}
                    						add(
                    							current,
                    							"controller_endpoints",
                    							lv_controller_endpoints_7_0,
                    							"org.ftn.domij.securitydsl.SecurityDsl.Endpoint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSecurityDsl.g:1526:4: (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==23) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalSecurityDsl.g:1527:5: otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) )
                    	    {
                    	    otherlv_8=(Token)match(input,23,FOLLOW_16); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getOtherControllerAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSecurityDsl.g:1531:5: ( (lv_controller_endpoints_9_0= ruleEndpoint ) )
                    	    // InternalSecurityDsl.g:1532:6: (lv_controller_endpoints_9_0= ruleEndpoint )
                    	    {
                    	    // InternalSecurityDsl.g:1532:6: (lv_controller_endpoints_9_0= ruleEndpoint )
                    	    // InternalSecurityDsl.g:1533:7: lv_controller_endpoints_9_0= ruleEndpoint
                    	    {

                    	    							newCompositeNode(grammarAccess.getOtherControllerAccess().getController_endpointsEndpointParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_controller_endpoints_9_0=ruleEndpoint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOtherControllerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"controller_endpoints",
                    	    								lv_controller_endpoints_9_0,
                    	    								"org.ftn.domij.securitydsl.SecurityDsl.Endpoint");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,24,FOLLOW_27); 

                    				newLeafNode(otherlv_10, grammarAccess.getOtherControllerAccess().getRightSquareBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,33,FOLLOW_2); 

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
    // InternalSecurityDsl.g:1564:1: entryRuleJwtSecurity returns [EObject current=null] : iv_ruleJwtSecurity= ruleJwtSecurity EOF ;
    public final EObject entryRuleJwtSecurity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJwtSecurity = null;


        try {
            // InternalSecurityDsl.g:1564:52: (iv_ruleJwtSecurity= ruleJwtSecurity EOF )
            // InternalSecurityDsl.g:1565:2: iv_ruleJwtSecurity= ruleJwtSecurity EOF
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
    // InternalSecurityDsl.g:1571:1: ruleJwtSecurity returns [EObject current=null] : (otherlv_0= 'mechanism:' ( (lv_mechanism_1_0= ruleESecurityMechanism ) ) otherlv_2= 'jwt:' otherlv_3= 'header:' otherlv_4= 'signature-algorithm:' ( (lv_signatureAlgorithm_5_0= ruleEString ) ) otherlv_6= 'payload:' otherlv_7= 'issuer:' ( (lv_issuer_8_0= ruleEString ) ) otherlv_9= 'expiration-time:' ( (lv_expirationTime_10_0= ruleEInt ) ) otherlv_11= 'audience:' ( (lv_audience_12_0= ruleEString ) ) (otherlv_13= 'public-claims:' otherlv_14= '[' ( (lv_security_claims_15_0= rulePublic ) )? (otherlv_16= ',' ( (lv_security_claims_17_0= rulePublic ) ) )* otherlv_18= ']' )? (otherlv_19= 'private-claims:' otherlv_20= '[' ( (lv_security_claims_21_0= rulePrivate ) )? (otherlv_22= ',' ( (lv_security_claims_23_0= rulePrivate ) ) )* otherlv_24= ']' )? otherlv_25= 'signature:' otherlv_26= 'secret:' ( (lv_secret_27_0= ruleEString ) ) ) ;
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
            // InternalSecurityDsl.g:1577:2: ( (otherlv_0= 'mechanism:' ( (lv_mechanism_1_0= ruleESecurityMechanism ) ) otherlv_2= 'jwt:' otherlv_3= 'header:' otherlv_4= 'signature-algorithm:' ( (lv_signatureAlgorithm_5_0= ruleEString ) ) otherlv_6= 'payload:' otherlv_7= 'issuer:' ( (lv_issuer_8_0= ruleEString ) ) otherlv_9= 'expiration-time:' ( (lv_expirationTime_10_0= ruleEInt ) ) otherlv_11= 'audience:' ( (lv_audience_12_0= ruleEString ) ) (otherlv_13= 'public-claims:' otherlv_14= '[' ( (lv_security_claims_15_0= rulePublic ) )? (otherlv_16= ',' ( (lv_security_claims_17_0= rulePublic ) ) )* otherlv_18= ']' )? (otherlv_19= 'private-claims:' otherlv_20= '[' ( (lv_security_claims_21_0= rulePrivate ) )? (otherlv_22= ',' ( (lv_security_claims_23_0= rulePrivate ) ) )* otherlv_24= ']' )? otherlv_25= 'signature:' otherlv_26= 'secret:' ( (lv_secret_27_0= ruleEString ) ) ) )
            // InternalSecurityDsl.g:1578:2: (otherlv_0= 'mechanism:' ( (lv_mechanism_1_0= ruleESecurityMechanism ) ) otherlv_2= 'jwt:' otherlv_3= 'header:' otherlv_4= 'signature-algorithm:' ( (lv_signatureAlgorithm_5_0= ruleEString ) ) otherlv_6= 'payload:' otherlv_7= 'issuer:' ( (lv_issuer_8_0= ruleEString ) ) otherlv_9= 'expiration-time:' ( (lv_expirationTime_10_0= ruleEInt ) ) otherlv_11= 'audience:' ( (lv_audience_12_0= ruleEString ) ) (otherlv_13= 'public-claims:' otherlv_14= '[' ( (lv_security_claims_15_0= rulePublic ) )? (otherlv_16= ',' ( (lv_security_claims_17_0= rulePublic ) ) )* otherlv_18= ']' )? (otherlv_19= 'private-claims:' otherlv_20= '[' ( (lv_security_claims_21_0= rulePrivate ) )? (otherlv_22= ',' ( (lv_security_claims_23_0= rulePrivate ) ) )* otherlv_24= ']' )? otherlv_25= 'signature:' otherlv_26= 'secret:' ( (lv_secret_27_0= ruleEString ) ) )
            {
            // InternalSecurityDsl.g:1578:2: (otherlv_0= 'mechanism:' ( (lv_mechanism_1_0= ruleESecurityMechanism ) ) otherlv_2= 'jwt:' otherlv_3= 'header:' otherlv_4= 'signature-algorithm:' ( (lv_signatureAlgorithm_5_0= ruleEString ) ) otherlv_6= 'payload:' otherlv_7= 'issuer:' ( (lv_issuer_8_0= ruleEString ) ) otherlv_9= 'expiration-time:' ( (lv_expirationTime_10_0= ruleEInt ) ) otherlv_11= 'audience:' ( (lv_audience_12_0= ruleEString ) ) (otherlv_13= 'public-claims:' otherlv_14= '[' ( (lv_security_claims_15_0= rulePublic ) )? (otherlv_16= ',' ( (lv_security_claims_17_0= rulePublic ) ) )* otherlv_18= ']' )? (otherlv_19= 'private-claims:' otherlv_20= '[' ( (lv_security_claims_21_0= rulePrivate ) )? (otherlv_22= ',' ( (lv_security_claims_23_0= rulePrivate ) ) )* otherlv_24= ']' )? otherlv_25= 'signature:' otherlv_26= 'secret:' ( (lv_secret_27_0= ruleEString ) ) )
            // InternalSecurityDsl.g:1579:3: otherlv_0= 'mechanism:' ( (lv_mechanism_1_0= ruleESecurityMechanism ) ) otherlv_2= 'jwt:' otherlv_3= 'header:' otherlv_4= 'signature-algorithm:' ( (lv_signatureAlgorithm_5_0= ruleEString ) ) otherlv_6= 'payload:' otherlv_7= 'issuer:' ( (lv_issuer_8_0= ruleEString ) ) otherlv_9= 'expiration-time:' ( (lv_expirationTime_10_0= ruleEInt ) ) otherlv_11= 'audience:' ( (lv_audience_12_0= ruleEString ) ) (otherlv_13= 'public-claims:' otherlv_14= '[' ( (lv_security_claims_15_0= rulePublic ) )? (otherlv_16= ',' ( (lv_security_claims_17_0= rulePublic ) ) )* otherlv_18= ']' )? (otherlv_19= 'private-claims:' otherlv_20= '[' ( (lv_security_claims_21_0= rulePrivate ) )? (otherlv_22= ',' ( (lv_security_claims_23_0= rulePrivate ) ) )* otherlv_24= ']' )? otherlv_25= 'signature:' otherlv_26= 'secret:' ( (lv_secret_27_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_39); 

            			newLeafNode(otherlv_0, grammarAccess.getJwtSecurityAccess().getMechanismKeyword_0());
            		
            // InternalSecurityDsl.g:1583:3: ( (lv_mechanism_1_0= ruleESecurityMechanism ) )
            // InternalSecurityDsl.g:1584:4: (lv_mechanism_1_0= ruleESecurityMechanism )
            {
            // InternalSecurityDsl.g:1584:4: (lv_mechanism_1_0= ruleESecurityMechanism )
            // InternalSecurityDsl.g:1585:5: lv_mechanism_1_0= ruleESecurityMechanism
            {

            					newCompositeNode(grammarAccess.getJwtSecurityAccess().getMechanismESecurityMechanismEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_40);
            lv_mechanism_1_0=ruleESecurityMechanism();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJwtSecurityRule());
            					}
            					set(
            						current,
            						"mechanism",
            						lv_mechanism_1_0,
            						"org.ftn.domij.securitydsl.SecurityDsl.ESecurityMechanism");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getJwtSecurityAccess().getJwtKeyword_2());
            		
            otherlv_3=(Token)match(input,45,FOLLOW_42); 

            			newLeafNode(otherlv_3, grammarAccess.getJwtSecurityAccess().getHeaderKeyword_3());
            		
            otherlv_4=(Token)match(input,46,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getJwtSecurityAccess().getSignatureAlgorithmKeyword_4());
            		
            // InternalSecurityDsl.g:1614:3: ( (lv_signatureAlgorithm_5_0= ruleEString ) )
            // InternalSecurityDsl.g:1615:4: (lv_signatureAlgorithm_5_0= ruleEString )
            {
            // InternalSecurityDsl.g:1615:4: (lv_signatureAlgorithm_5_0= ruleEString )
            // InternalSecurityDsl.g:1616:5: lv_signatureAlgorithm_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getJwtSecurityAccess().getSignatureAlgorithmEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_43);
            lv_signatureAlgorithm_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJwtSecurityRule());
            					}
            					set(
            						current,
            						"signatureAlgorithm",
            						lv_signatureAlgorithm_5_0,
            						"org.ftn.domij.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,47,FOLLOW_44); 

            			newLeafNode(otherlv_6, grammarAccess.getJwtSecurityAccess().getPayloadKeyword_6());
            		
            otherlv_7=(Token)match(input,48,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getJwtSecurityAccess().getIssuerKeyword_7());
            		
            // InternalSecurityDsl.g:1641:3: ( (lv_issuer_8_0= ruleEString ) )
            // InternalSecurityDsl.g:1642:4: (lv_issuer_8_0= ruleEString )
            {
            // InternalSecurityDsl.g:1642:4: (lv_issuer_8_0= ruleEString )
            // InternalSecurityDsl.g:1643:5: lv_issuer_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getJwtSecurityAccess().getIssuerEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_45);
            lv_issuer_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJwtSecurityRule());
            					}
            					set(
            						current,
            						"issuer",
            						lv_issuer_8_0,
            						"org.ftn.domij.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,49,FOLLOW_46); 

            			newLeafNode(otherlv_9, grammarAccess.getJwtSecurityAccess().getExpirationTimeKeyword_9());
            		
            // InternalSecurityDsl.g:1664:3: ( (lv_expirationTime_10_0= ruleEInt ) )
            // InternalSecurityDsl.g:1665:4: (lv_expirationTime_10_0= ruleEInt )
            {
            // InternalSecurityDsl.g:1665:4: (lv_expirationTime_10_0= ruleEInt )
            // InternalSecurityDsl.g:1666:5: lv_expirationTime_10_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getJwtSecurityAccess().getExpirationTimeEIntParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_47);
            lv_expirationTime_10_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJwtSecurityRule());
            					}
            					set(
            						current,
            						"expirationTime",
            						lv_expirationTime_10_0,
            						"org.ftn.domij.securitydsl.SecurityDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,50,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getJwtSecurityAccess().getAudienceKeyword_11());
            		
            // InternalSecurityDsl.g:1687:3: ( (lv_audience_12_0= ruleEString ) )
            // InternalSecurityDsl.g:1688:4: (lv_audience_12_0= ruleEString )
            {
            // InternalSecurityDsl.g:1688:4: (lv_audience_12_0= ruleEString )
            // InternalSecurityDsl.g:1689:5: lv_audience_12_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getJwtSecurityAccess().getAudienceEStringParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_48);
            lv_audience_12_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJwtSecurityRule());
            					}
            					set(
            						current,
            						"audience",
            						lv_audience_12_0,
            						"org.ftn.domij.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecurityDsl.g:1706:3: (otherlv_13= 'public-claims:' otherlv_14= '[' ( (lv_security_claims_15_0= rulePublic ) )? (otherlv_16= ',' ( (lv_security_claims_17_0= rulePublic ) ) )* otherlv_18= ']' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==51) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSecurityDsl.g:1707:4: otherlv_13= 'public-claims:' otherlv_14= '[' ( (lv_security_claims_15_0= rulePublic ) )? (otherlv_16= ',' ( (lv_security_claims_17_0= rulePublic ) ) )* otherlv_18= ']'
                    {
                    otherlv_13=(Token)match(input,51,FOLLOW_15); 

                    				newLeafNode(otherlv_13, grammarAccess.getJwtSecurityAccess().getPublicClaimsKeyword_13_0());
                    			
                    otherlv_14=(Token)match(input,22,FOLLOW_49); 

                    				newLeafNode(otherlv_14, grammarAccess.getJwtSecurityAccess().getLeftSquareBracketKeyword_13_1());
                    			
                    // InternalSecurityDsl.g:1715:4: ( (lv_security_claims_15_0= rulePublic ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_ID)) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalSecurityDsl.g:1716:5: (lv_security_claims_15_0= rulePublic )
                            {
                            // InternalSecurityDsl.g:1716:5: (lv_security_claims_15_0= rulePublic )
                            // InternalSecurityDsl.g:1717:6: lv_security_claims_15_0= rulePublic
                            {

                            						newCompositeNode(grammarAccess.getJwtSecurityAccess().getSecurity_claimsPublicParserRuleCall_13_2_0());
                            					
                            pushFollow(FOLLOW_17);
                            lv_security_claims_15_0=rulePublic();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getJwtSecurityRule());
                            						}
                            						add(
                            							current,
                            							"security_claims",
                            							lv_security_claims_15_0,
                            							"org.ftn.domij.securitydsl.SecurityDsl.Public");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalSecurityDsl.g:1734:4: (otherlv_16= ',' ( (lv_security_claims_17_0= rulePublic ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==23) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalSecurityDsl.g:1735:5: otherlv_16= ',' ( (lv_security_claims_17_0= rulePublic ) )
                    	    {
                    	    otherlv_16=(Token)match(input,23,FOLLOW_4); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getJwtSecurityAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalSecurityDsl.g:1739:5: ( (lv_security_claims_17_0= rulePublic ) )
                    	    // InternalSecurityDsl.g:1740:6: (lv_security_claims_17_0= rulePublic )
                    	    {
                    	    // InternalSecurityDsl.g:1740:6: (lv_security_claims_17_0= rulePublic )
                    	    // InternalSecurityDsl.g:1741:7: lv_security_claims_17_0= rulePublic
                    	    {

                    	    							newCompositeNode(grammarAccess.getJwtSecurityAccess().getSecurity_claimsPublicParserRuleCall_13_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_security_claims_17_0=rulePublic();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getJwtSecurityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"security_claims",
                    	    								lv_security_claims_17_0,
                    	    								"org.ftn.domij.securitydsl.SecurityDsl.Public");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,24,FOLLOW_50); 

                    				newLeafNode(otherlv_18, grammarAccess.getJwtSecurityAccess().getRightSquareBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            // InternalSecurityDsl.g:1764:3: (otherlv_19= 'private-claims:' otherlv_20= '[' ( (lv_security_claims_21_0= rulePrivate ) )? (otherlv_22= ',' ( (lv_security_claims_23_0= rulePrivate ) ) )* otherlv_24= ']' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==52) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSecurityDsl.g:1765:4: otherlv_19= 'private-claims:' otherlv_20= '[' ( (lv_security_claims_21_0= rulePrivate ) )? (otherlv_22= ',' ( (lv_security_claims_23_0= rulePrivate ) ) )* otherlv_24= ']'
                    {
                    otherlv_19=(Token)match(input,52,FOLLOW_15); 

                    				newLeafNode(otherlv_19, grammarAccess.getJwtSecurityAccess().getPrivateClaimsKeyword_14_0());
                    			
                    otherlv_20=(Token)match(input,22,FOLLOW_49); 

                    				newLeafNode(otherlv_20, grammarAccess.getJwtSecurityAccess().getLeftSquareBracketKeyword_14_1());
                    			
                    // InternalSecurityDsl.g:1773:4: ( (lv_security_claims_21_0= rulePrivate ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_ID)) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalSecurityDsl.g:1774:5: (lv_security_claims_21_0= rulePrivate )
                            {
                            // InternalSecurityDsl.g:1774:5: (lv_security_claims_21_0= rulePrivate )
                            // InternalSecurityDsl.g:1775:6: lv_security_claims_21_0= rulePrivate
                            {

                            						newCompositeNode(grammarAccess.getJwtSecurityAccess().getSecurity_claimsPrivateParserRuleCall_14_2_0());
                            					
                            pushFollow(FOLLOW_17);
                            lv_security_claims_21_0=rulePrivate();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getJwtSecurityRule());
                            						}
                            						add(
                            							current,
                            							"security_claims",
                            							lv_security_claims_21_0,
                            							"org.ftn.domij.securitydsl.SecurityDsl.Private");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalSecurityDsl.g:1792:4: (otherlv_22= ',' ( (lv_security_claims_23_0= rulePrivate ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==23) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalSecurityDsl.g:1793:5: otherlv_22= ',' ( (lv_security_claims_23_0= rulePrivate ) )
                    	    {
                    	    otherlv_22=(Token)match(input,23,FOLLOW_4); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getJwtSecurityAccess().getCommaKeyword_14_3_0());
                    	    				
                    	    // InternalSecurityDsl.g:1797:5: ( (lv_security_claims_23_0= rulePrivate ) )
                    	    // InternalSecurityDsl.g:1798:6: (lv_security_claims_23_0= rulePrivate )
                    	    {
                    	    // InternalSecurityDsl.g:1798:6: (lv_security_claims_23_0= rulePrivate )
                    	    // InternalSecurityDsl.g:1799:7: lv_security_claims_23_0= rulePrivate
                    	    {

                    	    							newCompositeNode(grammarAccess.getJwtSecurityAccess().getSecurity_claimsPrivateParserRuleCall_14_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_security_claims_23_0=rulePrivate();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getJwtSecurityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"security_claims",
                    	    								lv_security_claims_23_0,
                    	    								"org.ftn.domij.securitydsl.SecurityDsl.Private");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,24,FOLLOW_51); 

                    				newLeafNode(otherlv_24, grammarAccess.getJwtSecurityAccess().getRightSquareBracketKeyword_14_4());
                    			

                    }
                    break;

            }

            otherlv_25=(Token)match(input,53,FOLLOW_52); 

            			newLeafNode(otherlv_25, grammarAccess.getJwtSecurityAccess().getSignatureKeyword_15());
            		
            otherlv_26=(Token)match(input,54,FOLLOW_4); 

            			newLeafNode(otherlv_26, grammarAccess.getJwtSecurityAccess().getSecretKeyword_16());
            		
            // InternalSecurityDsl.g:1830:3: ( (lv_secret_27_0= ruleEString ) )
            // InternalSecurityDsl.g:1831:4: (lv_secret_27_0= ruleEString )
            {
            // InternalSecurityDsl.g:1831:4: (lv_secret_27_0= ruleEString )
            // InternalSecurityDsl.g:1832:5: lv_secret_27_0= ruleEString
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
            						"org.ftn.domij.securitydsl.SecurityDsl.EString");
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
    // InternalSecurityDsl.g:1853:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSecurityDsl.g:1853:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSecurityDsl.g:1854:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalSecurityDsl.g:1860:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSecurityDsl.g:1866:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSecurityDsl.g:1867:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSecurityDsl.g:1867:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSecurityDsl.g:1868:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSecurityDsl.g:1868:3: (kw= '-' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==55) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSecurityDsl.g:1869:4: kw= '-'
                    {
                    kw=(Token)match(input,55,FOLLOW_53); 

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


    // $ANTLR start "entryRulePublic"
    // InternalSecurityDsl.g:1886:1: entryRulePublic returns [EObject current=null] : iv_rulePublic= rulePublic EOF ;
    public final EObject entryRulePublic() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePublic = null;


        try {
            // InternalSecurityDsl.g:1886:47: (iv_rulePublic= rulePublic EOF )
            // InternalSecurityDsl.g:1887:2: iv_rulePublic= rulePublic EOF
            {
             newCompositeNode(grammarAccess.getPublicRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePublic=rulePublic();

            state._fsp--;

             current =iv_rulePublic; 
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
    // $ANTLR end "entryRulePublic"


    // $ANTLR start "rulePublic"
    // InternalSecurityDsl.g:1893:1: rulePublic returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject rulePublic() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:1899:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalSecurityDsl.g:1900:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalSecurityDsl.g:1900:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalSecurityDsl.g:1901:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalSecurityDsl.g:1901:3: ()
            // InternalSecurityDsl.g:1902:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPublicAccess().getPublicAction_0(),
            					current);
            			

            }

            // InternalSecurityDsl.g:1908:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSecurityDsl.g:1909:4: (lv_name_1_0= ruleEString )
            {
            // InternalSecurityDsl.g:1909:4: (lv_name_1_0= ruleEString )
            // InternalSecurityDsl.g:1910:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPublicAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPublicRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.ftn.domij.securitydsl.SecurityDsl.EString");
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
    // $ANTLR end "rulePublic"


    // $ANTLR start "entryRulePrivate"
    // InternalSecurityDsl.g:1931:1: entryRulePrivate returns [EObject current=null] : iv_rulePrivate= rulePrivate EOF ;
    public final EObject entryRulePrivate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrivate = null;


        try {
            // InternalSecurityDsl.g:1931:48: (iv_rulePrivate= rulePrivate EOF )
            // InternalSecurityDsl.g:1932:2: iv_rulePrivate= rulePrivate EOF
            {
             newCompositeNode(grammarAccess.getPrivateRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrivate=rulePrivate();

            state._fsp--;

             current =iv_rulePrivate; 
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
    // $ANTLR end "entryRulePrivate"


    // $ANTLR start "rulePrivate"
    // InternalSecurityDsl.g:1938:1: rulePrivate returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject rulePrivate() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:1944:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalSecurityDsl.g:1945:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalSecurityDsl.g:1945:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalSecurityDsl.g:1946:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalSecurityDsl.g:1946:3: ()
            // InternalSecurityDsl.g:1947:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrivateAccess().getPrivateAction_0(),
            					current);
            			

            }

            // InternalSecurityDsl.g:1953:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSecurityDsl.g:1954:4: (lv_name_1_0= ruleEString )
            {
            // InternalSecurityDsl.g:1954:4: (lv_name_1_0= ruleEString )
            // InternalSecurityDsl.g:1955:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPrivateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrivateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.ftn.domij.securitydsl.SecurityDsl.EString");
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
    // $ANTLR end "rulePrivate"


    // $ANTLR start "ruleEType"
    // InternalSecurityDsl.g:1976:1: ruleEType returns [Enumerator current=null] : ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'FLOAT' ) | (enumLiteral_3= 'LONG' ) | (enumLiteral_4= 'CHAR' ) | (enumLiteral_5= 'BOOLEAN' ) | (enumLiteral_6= 'DOUBLE' ) | (enumLiteral_7= 'BYTE' ) | (enumLiteral_8= 'SHORT' ) ) ;
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
            // InternalSecurityDsl.g:1982:2: ( ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'FLOAT' ) | (enumLiteral_3= 'LONG' ) | (enumLiteral_4= 'CHAR' ) | (enumLiteral_5= 'BOOLEAN' ) | (enumLiteral_6= 'DOUBLE' ) | (enumLiteral_7= 'BYTE' ) | (enumLiteral_8= 'SHORT' ) ) )
            // InternalSecurityDsl.g:1983:2: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'FLOAT' ) | (enumLiteral_3= 'LONG' ) | (enumLiteral_4= 'CHAR' ) | (enumLiteral_5= 'BOOLEAN' ) | (enumLiteral_6= 'DOUBLE' ) | (enumLiteral_7= 'BYTE' ) | (enumLiteral_8= 'SHORT' ) )
            {
            // InternalSecurityDsl.g:1983:2: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'FLOAT' ) | (enumLiteral_3= 'LONG' ) | (enumLiteral_4= 'CHAR' ) | (enumLiteral_5= 'BOOLEAN' ) | (enumLiteral_6= 'DOUBLE' ) | (enumLiteral_7= 'BYTE' ) | (enumLiteral_8= 'SHORT' ) )
            int alt34=9;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt34=1;
                }
                break;
            case 57:
                {
                alt34=2;
                }
                break;
            case 58:
                {
                alt34=3;
                }
                break;
            case 59:
                {
                alt34=4;
                }
                break;
            case 60:
                {
                alt34=5;
                }
                break;
            case 61:
                {
                alt34=6;
                }
                break;
            case 62:
                {
                alt34=7;
                }
                break;
            case 63:
                {
                alt34=8;
                }
                break;
            case 64:
                {
                alt34=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalSecurityDsl.g:1984:3: (enumLiteral_0= 'INT' )
                    {
                    // InternalSecurityDsl.g:1984:3: (enumLiteral_0= 'INT' )
                    // InternalSecurityDsl.g:1985:4: enumLiteral_0= 'INT'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getETypeAccess().getINTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:1992:3: (enumLiteral_1= 'STRING' )
                    {
                    // InternalSecurityDsl.g:1992:3: (enumLiteral_1= 'STRING' )
                    // InternalSecurityDsl.g:1993:4: enumLiteral_1= 'STRING'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getSTRINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getETypeAccess().getSTRINGEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:2000:3: (enumLiteral_2= 'FLOAT' )
                    {
                    // InternalSecurityDsl.g:2000:3: (enumLiteral_2= 'FLOAT' )
                    // InternalSecurityDsl.g:2001:4: enumLiteral_2= 'FLOAT'
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getFLOATEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getETypeAccess().getFLOATEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:2008:3: (enumLiteral_3= 'LONG' )
                    {
                    // InternalSecurityDsl.g:2008:3: (enumLiteral_3= 'LONG' )
                    // InternalSecurityDsl.g:2009:4: enumLiteral_3= 'LONG'
                    {
                    enumLiteral_3=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getLONGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getETypeAccess().getLONGEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSecurityDsl.g:2016:3: (enumLiteral_4= 'CHAR' )
                    {
                    // InternalSecurityDsl.g:2016:3: (enumLiteral_4= 'CHAR' )
                    // InternalSecurityDsl.g:2017:4: enumLiteral_4= 'CHAR'
                    {
                    enumLiteral_4=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getCHAREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getETypeAccess().getCHAREnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSecurityDsl.g:2024:3: (enumLiteral_5= 'BOOLEAN' )
                    {
                    // InternalSecurityDsl.g:2024:3: (enumLiteral_5= 'BOOLEAN' )
                    // InternalSecurityDsl.g:2025:4: enumLiteral_5= 'BOOLEAN'
                    {
                    enumLiteral_5=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getBOOLEANEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getETypeAccess().getBOOLEANEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSecurityDsl.g:2032:3: (enumLiteral_6= 'DOUBLE' )
                    {
                    // InternalSecurityDsl.g:2032:3: (enumLiteral_6= 'DOUBLE' )
                    // InternalSecurityDsl.g:2033:4: enumLiteral_6= 'DOUBLE'
                    {
                    enumLiteral_6=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getDOUBLEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getETypeAccess().getDOUBLEEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSecurityDsl.g:2040:3: (enumLiteral_7= 'BYTE' )
                    {
                    // InternalSecurityDsl.g:2040:3: (enumLiteral_7= 'BYTE' )
                    // InternalSecurityDsl.g:2041:4: enumLiteral_7= 'BYTE'
                    {
                    enumLiteral_7=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getBYTEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getETypeAccess().getBYTEEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalSecurityDsl.g:2048:3: (enumLiteral_8= 'SHORT' )
                    {
                    // InternalSecurityDsl.g:2048:3: (enumLiteral_8= 'SHORT' )
                    // InternalSecurityDsl.g:2049:4: enumLiteral_8= 'SHORT'
                    {
                    enumLiteral_8=(Token)match(input,64,FOLLOW_2); 

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
    // InternalSecurityDsl.g:2059:1: ruleEEndpointMethod returns [Enumerator current=null] : ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'PUT' ) | (enumLiteral_2= 'POST' ) | (enumLiteral_3= 'DELETE' ) ) ;
    public final Enumerator ruleEEndpointMethod() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSecurityDsl.g:2065:2: ( ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'PUT' ) | (enumLiteral_2= 'POST' ) | (enumLiteral_3= 'DELETE' ) ) )
            // InternalSecurityDsl.g:2066:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'PUT' ) | (enumLiteral_2= 'POST' ) | (enumLiteral_3= 'DELETE' ) )
            {
            // InternalSecurityDsl.g:2066:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'PUT' ) | (enumLiteral_2= 'POST' ) | (enumLiteral_3= 'DELETE' ) )
            int alt35=4;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt35=1;
                }
                break;
            case 66:
                {
                alt35=2;
                }
                break;
            case 67:
                {
                alt35=3;
                }
                break;
            case 68:
                {
                alt35=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalSecurityDsl.g:2067:3: (enumLiteral_0= 'GET' )
                    {
                    // InternalSecurityDsl.g:2067:3: (enumLiteral_0= 'GET' )
                    // InternalSecurityDsl.g:2068:4: enumLiteral_0= 'GET'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getEEndpointMethodAccess().getGETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEEndpointMethodAccess().getGETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:2075:3: (enumLiteral_1= 'PUT' )
                    {
                    // InternalSecurityDsl.g:2075:3: (enumLiteral_1= 'PUT' )
                    // InternalSecurityDsl.g:2076:4: enumLiteral_1= 'PUT'
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getEEndpointMethodAccess().getPUTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEEndpointMethodAccess().getPUTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:2083:3: (enumLiteral_2= 'POST' )
                    {
                    // InternalSecurityDsl.g:2083:3: (enumLiteral_2= 'POST' )
                    // InternalSecurityDsl.g:2084:4: enumLiteral_2= 'POST'
                    {
                    enumLiteral_2=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getEEndpointMethodAccess().getPOSTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEEndpointMethodAccess().getPOSTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:2091:3: (enumLiteral_3= 'DELETE' )
                    {
                    // InternalSecurityDsl.g:2091:3: (enumLiteral_3= 'DELETE' )
                    // InternalSecurityDsl.g:2092:4: enumLiteral_3= 'DELETE'
                    {
                    enumLiteral_3=(Token)match(input,68,FOLLOW_2); 

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
    // InternalSecurityDsl.g:2102:1: ruleESecurityMechanism returns [Enumerator current=null] : (enumLiteral_0= 'JWT' ) ;
    public final Enumerator ruleESecurityMechanism() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalSecurityDsl.g:2108:2: ( (enumLiteral_0= 'JWT' ) )
            // InternalSecurityDsl.g:2109:2: (enumLiteral_0= 'JWT' )
            {
            // InternalSecurityDsl.g:2109:2: (enumLiteral_0= 'JWT' )
            // InternalSecurityDsl.g:2110:3: enumLiteral_0= 'JWT'
            {
            enumLiteral_0=(Token)match(input,69,FOLLOW_2); 

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
    // InternalSecurityDsl.g:2119:1: ruleEDatabaseType returns [Enumerator current=null] : ( (enumLiteral_0= 'POSTGRES' ) | (enumLiteral_1= 'ORACLE' ) | (enumLiteral_2= 'MYSQL' ) ) ;
    public final Enumerator ruleEDatabaseType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSecurityDsl.g:2125:2: ( ( (enumLiteral_0= 'POSTGRES' ) | (enumLiteral_1= 'ORACLE' ) | (enumLiteral_2= 'MYSQL' ) ) )
            // InternalSecurityDsl.g:2126:2: ( (enumLiteral_0= 'POSTGRES' ) | (enumLiteral_1= 'ORACLE' ) | (enumLiteral_2= 'MYSQL' ) )
            {
            // InternalSecurityDsl.g:2126:2: ( (enumLiteral_0= 'POSTGRES' ) | (enumLiteral_1= 'ORACLE' ) | (enumLiteral_2= 'MYSQL' ) )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt36=1;
                }
                break;
            case 71:
                {
                alt36=2;
                }
                break;
            case 72:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalSecurityDsl.g:2127:3: (enumLiteral_0= 'POSTGRES' )
                    {
                    // InternalSecurityDsl.g:2127:3: (enumLiteral_0= 'POSTGRES' )
                    // InternalSecurityDsl.g:2128:4: enumLiteral_0= 'POSTGRES'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getEDatabaseTypeAccess().getPOSTGRESEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEDatabaseTypeAccess().getPOSTGRESEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:2135:3: (enumLiteral_1= 'ORACLE' )
                    {
                    // InternalSecurityDsl.g:2135:3: (enumLiteral_1= 'ORACLE' )
                    // InternalSecurityDsl.g:2136:4: enumLiteral_1= 'ORACLE'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getEDatabaseTypeAccess().getORACLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEDatabaseTypeAccess().getORACLEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:2143:3: (enumLiteral_2= 'MYSQL' )
                    {
                    // InternalSecurityDsl.g:2143:3: (enumLiteral_2= 'MYSQL' )
                    // InternalSecurityDsl.g:2144:4: enumLiteral_2= 'MYSQL'
                    {
                    enumLiteral_2=(Token)match(input,72,FOLLOW_2); 

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002078002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002070002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002060002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002040002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002380002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002300002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002200002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004200002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0xFF00000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000078000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000070000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040200000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0080000000000040L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0038000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000001800030L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000040L});

}