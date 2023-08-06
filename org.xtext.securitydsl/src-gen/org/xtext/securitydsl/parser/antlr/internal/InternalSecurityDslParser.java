package org.xtext.securitydsl.parser.antlr.internal;

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
import org.xtext.securitydsl.services.SecurityDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSecurityDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'application:'", "'artifact:'", "'name:'", "'group:'", "'packageName:'", "'description:'", "'port:'", "'hostname:'", "'database:'", "'model:'", "'user:'", "'role:'", "'security:'", "'controller:'", "'auth:'", "'vendor:'", "'url:'", "'username:'", "'password:'", "'-'", "'{'", "'identifier'", "'credential'", "'type:'", "'collumnName:'", "'}'", "'tableName:'", "'attributes:'", "'['", "','", "']'", "'roles:'", "'client'", "'methodName:'", "'method:'", "'roleAuthorities:'", "'path:'", "'endpoints:'", "'jwt:'", "'header:'", "'signatureAlgorithm:'", "'payload:'", "'claims:'", "'signature:'", "'secret:'", "':'", "'REGISTERED,'", "'expirationTime:'", "'issuer:'", "'audience:'", "'OAuth2.0:'", "'providers:'", "'clientId:'", "'clientSecret:'", "'redirectUri:'", "'basicAuthentication'", "'PostgreSQL'", "'Oracle'", "'MySQL'", "'String'", "'Float'", "'Long'", "'Integer'", "'Double'", "'DateTime'", "'Date'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'REGISTRATION'", "'LOGIN'", "'LOGOUT'", "'OTHER'", "'PRIVATE'", "'PUBLIC'", "'REGISTERED'", "'GOOGLE'", "'GITHUB'", "'FACEBOOK'", "'MICROSOFT_AZURE'", "'LINKEDIN'", "'TWITTER'", "'INSTAGRAM'"
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
    // InternalSecurityDsl.g:72:1: ruleApplication returns [EObject current=null] : ( () otherlv_1= 'application:' otherlv_2= 'artifact:' ( (lv_artifact_3_0= ruleEString ) ) (otherlv_4= 'name:' ( (lv_name_5_0= ruleEString ) ) )? otherlv_6= 'group:' ( (lv_group_7_0= ruleEString ) ) (otherlv_8= 'packageName:' ( (lv_packageName_9_0= ruleEString ) ) )? (otherlv_10= 'description:' ( (lv_description_11_0= ruleEString ) ) )? (otherlv_12= 'port:' ( (lv_port_13_0= ruleELongObject ) ) )? (otherlv_14= 'hostname:' ( (lv_hostname_15_0= ruleEString ) ) )? (otherlv_16= 'database:' ( (lv_app_database_17_0= ruleDatabase ) ) )? (otherlv_18= 'model:' (otherlv_19= 'user:' ( (lv_app_entities_20_0= ruleUser ) ) )? (otherlv_21= 'role:' ( (lv_app_entities_22_0= ruleRole ) ) )? )? (otherlv_23= 'security:' ( (lv_app_security_24_0= ruleSecurity ) ) )? (otherlv_25= 'controller:' (otherlv_26= 'auth:' ( (lv_app_controllers_27_0= ruleAuthentication ) ) )? )? ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_artifact_3_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        AntlrDatatypeRuleToken lv_group_7_0 = null;

        AntlrDatatypeRuleToken lv_packageName_9_0 = null;

        AntlrDatatypeRuleToken lv_description_11_0 = null;

        AntlrDatatypeRuleToken lv_port_13_0 = null;

        AntlrDatatypeRuleToken lv_hostname_15_0 = null;

        EObject lv_app_database_17_0 = null;

        EObject lv_app_entities_20_0 = null;

        EObject lv_app_entities_22_0 = null;

        EObject lv_app_security_24_0 = null;

        EObject lv_app_controllers_27_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:78:2: ( ( () otherlv_1= 'application:' otherlv_2= 'artifact:' ( (lv_artifact_3_0= ruleEString ) ) (otherlv_4= 'name:' ( (lv_name_5_0= ruleEString ) ) )? otherlv_6= 'group:' ( (lv_group_7_0= ruleEString ) ) (otherlv_8= 'packageName:' ( (lv_packageName_9_0= ruleEString ) ) )? (otherlv_10= 'description:' ( (lv_description_11_0= ruleEString ) ) )? (otherlv_12= 'port:' ( (lv_port_13_0= ruleELongObject ) ) )? (otherlv_14= 'hostname:' ( (lv_hostname_15_0= ruleEString ) ) )? (otherlv_16= 'database:' ( (lv_app_database_17_0= ruleDatabase ) ) )? (otherlv_18= 'model:' (otherlv_19= 'user:' ( (lv_app_entities_20_0= ruleUser ) ) )? (otherlv_21= 'role:' ( (lv_app_entities_22_0= ruleRole ) ) )? )? (otherlv_23= 'security:' ( (lv_app_security_24_0= ruleSecurity ) ) )? (otherlv_25= 'controller:' (otherlv_26= 'auth:' ( (lv_app_controllers_27_0= ruleAuthentication ) ) )? )? ) )
            // InternalSecurityDsl.g:79:2: ( () otherlv_1= 'application:' otherlv_2= 'artifact:' ( (lv_artifact_3_0= ruleEString ) ) (otherlv_4= 'name:' ( (lv_name_5_0= ruleEString ) ) )? otherlv_6= 'group:' ( (lv_group_7_0= ruleEString ) ) (otherlv_8= 'packageName:' ( (lv_packageName_9_0= ruleEString ) ) )? (otherlv_10= 'description:' ( (lv_description_11_0= ruleEString ) ) )? (otherlv_12= 'port:' ( (lv_port_13_0= ruleELongObject ) ) )? (otherlv_14= 'hostname:' ( (lv_hostname_15_0= ruleEString ) ) )? (otherlv_16= 'database:' ( (lv_app_database_17_0= ruleDatabase ) ) )? (otherlv_18= 'model:' (otherlv_19= 'user:' ( (lv_app_entities_20_0= ruleUser ) ) )? (otherlv_21= 'role:' ( (lv_app_entities_22_0= ruleRole ) ) )? )? (otherlv_23= 'security:' ( (lv_app_security_24_0= ruleSecurity ) ) )? (otherlv_25= 'controller:' (otherlv_26= 'auth:' ( (lv_app_controllers_27_0= ruleAuthentication ) ) )? )? )
            {
            // InternalSecurityDsl.g:79:2: ( () otherlv_1= 'application:' otherlv_2= 'artifact:' ( (lv_artifact_3_0= ruleEString ) ) (otherlv_4= 'name:' ( (lv_name_5_0= ruleEString ) ) )? otherlv_6= 'group:' ( (lv_group_7_0= ruleEString ) ) (otherlv_8= 'packageName:' ( (lv_packageName_9_0= ruleEString ) ) )? (otherlv_10= 'description:' ( (lv_description_11_0= ruleEString ) ) )? (otherlv_12= 'port:' ( (lv_port_13_0= ruleELongObject ) ) )? (otherlv_14= 'hostname:' ( (lv_hostname_15_0= ruleEString ) ) )? (otherlv_16= 'database:' ( (lv_app_database_17_0= ruleDatabase ) ) )? (otherlv_18= 'model:' (otherlv_19= 'user:' ( (lv_app_entities_20_0= ruleUser ) ) )? (otherlv_21= 'role:' ( (lv_app_entities_22_0= ruleRole ) ) )? )? (otherlv_23= 'security:' ( (lv_app_security_24_0= ruleSecurity ) ) )? (otherlv_25= 'controller:' (otherlv_26= 'auth:' ( (lv_app_controllers_27_0= ruleAuthentication ) ) )? )? )
            // InternalSecurityDsl.g:80:3: () otherlv_1= 'application:' otherlv_2= 'artifact:' ( (lv_artifact_3_0= ruleEString ) ) (otherlv_4= 'name:' ( (lv_name_5_0= ruleEString ) ) )? otherlv_6= 'group:' ( (lv_group_7_0= ruleEString ) ) (otherlv_8= 'packageName:' ( (lv_packageName_9_0= ruleEString ) ) )? (otherlv_10= 'description:' ( (lv_description_11_0= ruleEString ) ) )? (otherlv_12= 'port:' ( (lv_port_13_0= ruleELongObject ) ) )? (otherlv_14= 'hostname:' ( (lv_hostname_15_0= ruleEString ) ) )? (otherlv_16= 'database:' ( (lv_app_database_17_0= ruleDatabase ) ) )? (otherlv_18= 'model:' (otherlv_19= 'user:' ( (lv_app_entities_20_0= ruleUser ) ) )? (otherlv_21= 'role:' ( (lv_app_entities_22_0= ruleRole ) ) )? )? (otherlv_23= 'security:' ( (lv_app_security_24_0= ruleSecurity ) ) )? (otherlv_25= 'controller:' (otherlv_26= 'auth:' ( (lv_app_controllers_27_0= ruleAuthentication ) ) )? )?
            {
            // InternalSecurityDsl.g:80:3: ()
            // InternalSecurityDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getApplicationAccess().getApplicationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getApplicationAccess().getApplicationKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getApplicationAccess().getArtifactKeyword_2());
            		
            // InternalSecurityDsl.g:95:3: ( (lv_artifact_3_0= ruleEString ) )
            // InternalSecurityDsl.g:96:4: (lv_artifact_3_0= ruleEString )
            {
            // InternalSecurityDsl.g:96:4: (lv_artifact_3_0= ruleEString )
            // InternalSecurityDsl.g:97:5: lv_artifact_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getApplicationAccess().getArtifactEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_artifact_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplicationRule());
            					}
            					set(
            						current,
            						"artifact",
            						lv_artifact_3_0,
            						"org.xtext.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecurityDsl.g:114:3: (otherlv_4= 'name:' ( (lv_name_5_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSecurityDsl.g:115:4: otherlv_4= 'name:' ( (lv_name_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getApplicationAccess().getNameKeyword_4_0());
                    			
                    // InternalSecurityDsl.g:119:4: ( (lv_name_5_0= ruleEString ) )
                    // InternalSecurityDsl.g:120:5: (lv_name_5_0= ruleEString )
                    {
                    // InternalSecurityDsl.g:120:5: (lv_name_5_0= ruleEString )
                    // InternalSecurityDsl.g:121:6: lv_name_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getApplicationAccess().getNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_name_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getApplicationRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_5_0,
                    							"org.xtext.securitydsl.SecurityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getApplicationAccess().getGroupKeyword_5());
            		
            // InternalSecurityDsl.g:143:3: ( (lv_group_7_0= ruleEString ) )
            // InternalSecurityDsl.g:144:4: (lv_group_7_0= ruleEString )
            {
            // InternalSecurityDsl.g:144:4: (lv_group_7_0= ruleEString )
            // InternalSecurityDsl.g:145:5: lv_group_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getApplicationAccess().getGroupEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_group_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplicationRule());
            					}
            					set(
            						current,
            						"group",
            						lv_group_7_0,
            						"org.xtext.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecurityDsl.g:162:3: (otherlv_8= 'packageName:' ( (lv_packageName_9_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSecurityDsl.g:163:4: otherlv_8= 'packageName:' ( (lv_packageName_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getApplicationAccess().getPackageNameKeyword_7_0());
                    			
                    // InternalSecurityDsl.g:167:4: ( (lv_packageName_9_0= ruleEString ) )
                    // InternalSecurityDsl.g:168:5: (lv_packageName_9_0= ruleEString )
                    {
                    // InternalSecurityDsl.g:168:5: (lv_packageName_9_0= ruleEString )
                    // InternalSecurityDsl.g:169:6: lv_packageName_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getApplicationAccess().getPackageNameEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_packageName_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getApplicationRule());
                    						}
                    						set(
                    							current,
                    							"packageName",
                    							lv_packageName_9_0,
                    							"org.xtext.securitydsl.SecurityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:187:3: (otherlv_10= 'description:' ( (lv_description_11_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSecurityDsl.g:188:4: otherlv_10= 'description:' ( (lv_description_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getApplicationAccess().getDescriptionKeyword_8_0());
                    			
                    // InternalSecurityDsl.g:192:4: ( (lv_description_11_0= ruleEString ) )
                    // InternalSecurityDsl.g:193:5: (lv_description_11_0= ruleEString )
                    {
                    // InternalSecurityDsl.g:193:5: (lv_description_11_0= ruleEString )
                    // InternalSecurityDsl.g:194:6: lv_description_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getApplicationAccess().getDescriptionEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_description_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getApplicationRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_11_0,
                    							"org.xtext.securitydsl.SecurityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:212:3: (otherlv_12= 'port:' ( (lv_port_13_0= ruleELongObject ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSecurityDsl.g:213:4: otherlv_12= 'port:' ( (lv_port_13_0= ruleELongObject ) )
                    {
                    otherlv_12=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getApplicationAccess().getPortKeyword_9_0());
                    			
                    // InternalSecurityDsl.g:217:4: ( (lv_port_13_0= ruleELongObject ) )
                    // InternalSecurityDsl.g:218:5: (lv_port_13_0= ruleELongObject )
                    {
                    // InternalSecurityDsl.g:218:5: (lv_port_13_0= ruleELongObject )
                    // InternalSecurityDsl.g:219:6: lv_port_13_0= ruleELongObject
                    {

                    						newCompositeNode(grammarAccess.getApplicationAccess().getPortELongObjectParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_port_13_0=ruleELongObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getApplicationRule());
                    						}
                    						set(
                    							current,
                    							"port",
                    							lv_port_13_0,
                    							"org.xtext.securitydsl.SecurityDsl.ELongObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:237:3: (otherlv_14= 'hostname:' ( (lv_hostname_15_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSecurityDsl.g:238:4: otherlv_14= 'hostname:' ( (lv_hostname_15_0= ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getApplicationAccess().getHostnameKeyword_10_0());
                    			
                    // InternalSecurityDsl.g:242:4: ( (lv_hostname_15_0= ruleEString ) )
                    // InternalSecurityDsl.g:243:5: (lv_hostname_15_0= ruleEString )
                    {
                    // InternalSecurityDsl.g:243:5: (lv_hostname_15_0= ruleEString )
                    // InternalSecurityDsl.g:244:6: lv_hostname_15_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getApplicationAccess().getHostnameEStringParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_hostname_15_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getApplicationRule());
                    						}
                    						set(
                    							current,
                    							"hostname",
                    							lv_hostname_15_0,
                    							"org.xtext.securitydsl.SecurityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:262:3: (otherlv_16= 'database:' ( (lv_app_database_17_0= ruleDatabase ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSecurityDsl.g:263:4: otherlv_16= 'database:' ( (lv_app_database_17_0= ruleDatabase ) )
                    {
                    otherlv_16=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_16, grammarAccess.getApplicationAccess().getDatabaseKeyword_11_0());
                    			
                    // InternalSecurityDsl.g:267:4: ( (lv_app_database_17_0= ruleDatabase ) )
                    // InternalSecurityDsl.g:268:5: (lv_app_database_17_0= ruleDatabase )
                    {
                    // InternalSecurityDsl.g:268:5: (lv_app_database_17_0= ruleDatabase )
                    // InternalSecurityDsl.g:269:6: lv_app_database_17_0= ruleDatabase
                    {

                    						newCompositeNode(grammarAccess.getApplicationAccess().getApp_databaseDatabaseParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_app_database_17_0=ruleDatabase();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getApplicationRule());
                    						}
                    						set(
                    							current,
                    							"app_database",
                    							lv_app_database_17_0,
                    							"org.xtext.securitydsl.SecurityDsl.Database");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:287:3: (otherlv_18= 'model:' (otherlv_19= 'user:' ( (lv_app_entities_20_0= ruleUser ) ) )? (otherlv_21= 'role:' ( (lv_app_entities_22_0= ruleRole ) ) )? )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSecurityDsl.g:288:4: otherlv_18= 'model:' (otherlv_19= 'user:' ( (lv_app_entities_20_0= ruleUser ) ) )? (otherlv_21= 'role:' ( (lv_app_entities_22_0= ruleRole ) ) )?
                    {
                    otherlv_18=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_18, grammarAccess.getApplicationAccess().getModelKeyword_12_0());
                    			
                    // InternalSecurityDsl.g:292:4: (otherlv_19= 'user:' ( (lv_app_entities_20_0= ruleUser ) ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==21) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalSecurityDsl.g:293:5: otherlv_19= 'user:' ( (lv_app_entities_20_0= ruleUser ) )
                            {
                            otherlv_19=(Token)match(input,21,FOLLOW_16); 

                            					newLeafNode(otherlv_19, grammarAccess.getApplicationAccess().getUserKeyword_12_1_0());
                            				
                            // InternalSecurityDsl.g:297:5: ( (lv_app_entities_20_0= ruleUser ) )
                            // InternalSecurityDsl.g:298:6: (lv_app_entities_20_0= ruleUser )
                            {
                            // InternalSecurityDsl.g:298:6: (lv_app_entities_20_0= ruleUser )
                            // InternalSecurityDsl.g:299:7: lv_app_entities_20_0= ruleUser
                            {

                            							newCompositeNode(grammarAccess.getApplicationAccess().getApp_entitiesUserParserRuleCall_12_1_1_0());
                            						
                            pushFollow(FOLLOW_17);
                            lv_app_entities_20_0=ruleUser();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getApplicationRule());
                            							}
                            							add(
                            								current,
                            								"app_entities",
                            								lv_app_entities_20_0,
                            								"org.xtext.securitydsl.SecurityDsl.User");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalSecurityDsl.g:317:4: (otherlv_21= 'role:' ( (lv_app_entities_22_0= ruleRole ) ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==22) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalSecurityDsl.g:318:5: otherlv_21= 'role:' ( (lv_app_entities_22_0= ruleRole ) )
                            {
                            otherlv_21=(Token)match(input,22,FOLLOW_18); 

                            					newLeafNode(otherlv_21, grammarAccess.getApplicationAccess().getRoleKeyword_12_2_0());
                            				
                            // InternalSecurityDsl.g:322:5: ( (lv_app_entities_22_0= ruleRole ) )
                            // InternalSecurityDsl.g:323:6: (lv_app_entities_22_0= ruleRole )
                            {
                            // InternalSecurityDsl.g:323:6: (lv_app_entities_22_0= ruleRole )
                            // InternalSecurityDsl.g:324:7: lv_app_entities_22_0= ruleRole
                            {

                            							newCompositeNode(grammarAccess.getApplicationAccess().getApp_entitiesRoleParserRuleCall_12_2_1_0());
                            						
                            pushFollow(FOLLOW_19);
                            lv_app_entities_22_0=ruleRole();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getApplicationRule());
                            							}
                            							add(
                            								current,
                            								"app_entities",
                            								lv_app_entities_22_0,
                            								"org.xtext.securitydsl.SecurityDsl.Role");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:343:3: (otherlv_23= 'security:' ( (lv_app_security_24_0= ruleSecurity ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSecurityDsl.g:344:4: otherlv_23= 'security:' ( (lv_app_security_24_0= ruleSecurity ) )
                    {
                    otherlv_23=(Token)match(input,23,FOLLOW_20); 

                    				newLeafNode(otherlv_23, grammarAccess.getApplicationAccess().getSecurityKeyword_13_0());
                    			
                    // InternalSecurityDsl.g:348:4: ( (lv_app_security_24_0= ruleSecurity ) )
                    // InternalSecurityDsl.g:349:5: (lv_app_security_24_0= ruleSecurity )
                    {
                    // InternalSecurityDsl.g:349:5: (lv_app_security_24_0= ruleSecurity )
                    // InternalSecurityDsl.g:350:6: lv_app_security_24_0= ruleSecurity
                    {

                    						newCompositeNode(grammarAccess.getApplicationAccess().getApp_securitySecurityParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_app_security_24_0=ruleSecurity();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getApplicationRule());
                    						}
                    						set(
                    							current,
                    							"app_security",
                    							lv_app_security_24_0,
                    							"org.xtext.securitydsl.SecurityDsl.Security");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:368:3: (otherlv_25= 'controller:' (otherlv_26= 'auth:' ( (lv_app_controllers_27_0= ruleAuthentication ) ) )? )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSecurityDsl.g:369:4: otherlv_25= 'controller:' (otherlv_26= 'auth:' ( (lv_app_controllers_27_0= ruleAuthentication ) ) )?
                    {
                    otherlv_25=(Token)match(input,24,FOLLOW_22); 

                    				newLeafNode(otherlv_25, grammarAccess.getApplicationAccess().getControllerKeyword_14_0());
                    			
                    // InternalSecurityDsl.g:373:4: (otherlv_26= 'auth:' ( (lv_app_controllers_27_0= ruleAuthentication ) ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==25) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalSecurityDsl.g:374:5: otherlv_26= 'auth:' ( (lv_app_controllers_27_0= ruleAuthentication ) )
                            {
                            otherlv_26=(Token)match(input,25,FOLLOW_23); 

                            					newLeafNode(otherlv_26, grammarAccess.getApplicationAccess().getAuthKeyword_14_1_0());
                            				
                            // InternalSecurityDsl.g:378:5: ( (lv_app_controllers_27_0= ruleAuthentication ) )
                            // InternalSecurityDsl.g:379:6: (lv_app_controllers_27_0= ruleAuthentication )
                            {
                            // InternalSecurityDsl.g:379:6: (lv_app_controllers_27_0= ruleAuthentication )
                            // InternalSecurityDsl.g:380:7: lv_app_controllers_27_0= ruleAuthentication
                            {

                            							newCompositeNode(grammarAccess.getApplicationAccess().getApp_controllersAuthenticationParserRuleCall_14_1_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_app_controllers_27_0=ruleAuthentication();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getApplicationRule());
                            							}
                            							add(
                            								current,
                            								"app_controllers",
                            								lv_app_controllers_27_0,
                            								"org.xtext.securitydsl.SecurityDsl.Authentication");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


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
    // InternalSecurityDsl.g:403:1: entryRuleSecurity returns [EObject current=null] : iv_ruleSecurity= ruleSecurity EOF ;
    public final EObject entryRuleSecurity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecurity = null;


        try {
            // InternalSecurityDsl.g:403:49: (iv_ruleSecurity= ruleSecurity EOF )
            // InternalSecurityDsl.g:404:2: iv_ruleSecurity= ruleSecurity EOF
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
    // InternalSecurityDsl.g:410:1: ruleSecurity returns [EObject current=null] : (this_JWT_0= ruleJWT | this_OAuth2_1= ruleOAuth2 | this_BasicAuthentication_2= ruleBasicAuthentication ) ;
    public final EObject ruleSecurity() throws RecognitionException {
        EObject current = null;

        EObject this_JWT_0 = null;

        EObject this_OAuth2_1 = null;

        EObject this_BasicAuthentication_2 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:416:2: ( (this_JWT_0= ruleJWT | this_OAuth2_1= ruleOAuth2 | this_BasicAuthentication_2= ruleBasicAuthentication ) )
            // InternalSecurityDsl.g:417:2: (this_JWT_0= ruleJWT | this_OAuth2_1= ruleOAuth2 | this_BasicAuthentication_2= ruleBasicAuthentication )
            {
            // InternalSecurityDsl.g:417:2: (this_JWT_0= ruleJWT | this_OAuth2_1= ruleOAuth2 | this_BasicAuthentication_2= ruleBasicAuthentication )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt13=1;
                }
                break;
            case 61:
                {
                alt13=2;
                }
                break;
            case 66:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalSecurityDsl.g:418:3: this_JWT_0= ruleJWT
                    {

                    			newCompositeNode(grammarAccess.getSecurityAccess().getJWTParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_JWT_0=ruleJWT();

                    state._fsp--;


                    			current = this_JWT_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:427:3: this_OAuth2_1= ruleOAuth2
                    {

                    			newCompositeNode(grammarAccess.getSecurityAccess().getOAuth2ParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OAuth2_1=ruleOAuth2();

                    state._fsp--;


                    			current = this_OAuth2_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:436:3: this_BasicAuthentication_2= ruleBasicAuthentication
                    {

                    			newCompositeNode(grammarAccess.getSecurityAccess().getBasicAuthenticationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BasicAuthentication_2=ruleBasicAuthentication();

                    state._fsp--;


                    			current = this_BasicAuthentication_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleSecurity"


    // $ANTLR start "entryRuleDatabase"
    // InternalSecurityDsl.g:448:1: entryRuleDatabase returns [EObject current=null] : iv_ruleDatabase= ruleDatabase EOF ;
    public final EObject entryRuleDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabase = null;


        try {
            // InternalSecurityDsl.g:448:49: (iv_ruleDatabase= ruleDatabase EOF )
            // InternalSecurityDsl.g:449:2: iv_ruleDatabase= ruleDatabase EOF
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
    // InternalSecurityDsl.g:455:1: ruleDatabase returns [EObject current=null] : (otherlv_0= 'vendor:' ( (lv_vendorName_1_0= ruleEDatabaseType ) ) otherlv_2= 'url:' ( (lv_url_3_0= ruleEString ) ) otherlv_4= 'username:' ( (lv_username_5_0= ruleEString ) ) otherlv_6= 'password:' ( (lv_password_7_0= ruleEString ) ) ) ;
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
            // InternalSecurityDsl.g:461:2: ( (otherlv_0= 'vendor:' ( (lv_vendorName_1_0= ruleEDatabaseType ) ) otherlv_2= 'url:' ( (lv_url_3_0= ruleEString ) ) otherlv_4= 'username:' ( (lv_username_5_0= ruleEString ) ) otherlv_6= 'password:' ( (lv_password_7_0= ruleEString ) ) ) )
            // InternalSecurityDsl.g:462:2: (otherlv_0= 'vendor:' ( (lv_vendorName_1_0= ruleEDatabaseType ) ) otherlv_2= 'url:' ( (lv_url_3_0= ruleEString ) ) otherlv_4= 'username:' ( (lv_username_5_0= ruleEString ) ) otherlv_6= 'password:' ( (lv_password_7_0= ruleEString ) ) )
            {
            // InternalSecurityDsl.g:462:2: (otherlv_0= 'vendor:' ( (lv_vendorName_1_0= ruleEDatabaseType ) ) otherlv_2= 'url:' ( (lv_url_3_0= ruleEString ) ) otherlv_4= 'username:' ( (lv_username_5_0= ruleEString ) ) otherlv_6= 'password:' ( (lv_password_7_0= ruleEString ) ) )
            // InternalSecurityDsl.g:463:3: otherlv_0= 'vendor:' ( (lv_vendorName_1_0= ruleEDatabaseType ) ) otherlv_2= 'url:' ( (lv_url_3_0= ruleEString ) ) otherlv_4= 'username:' ( (lv_username_5_0= ruleEString ) ) otherlv_6= 'password:' ( (lv_password_7_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getDatabaseAccess().getVendorKeyword_0());
            		
            // InternalSecurityDsl.g:467:3: ( (lv_vendorName_1_0= ruleEDatabaseType ) )
            // InternalSecurityDsl.g:468:4: (lv_vendorName_1_0= ruleEDatabaseType )
            {
            // InternalSecurityDsl.g:468:4: (lv_vendorName_1_0= ruleEDatabaseType )
            // InternalSecurityDsl.g:469:5: lv_vendorName_1_0= ruleEDatabaseType
            {

            					newCompositeNode(grammarAccess.getDatabaseAccess().getVendorNameEDatabaseTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
            lv_vendorName_1_0=ruleEDatabaseType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatabaseRule());
            					}
            					set(
            						current,
            						"vendorName",
            						lv_vendorName_1_0,
            						"org.xtext.securitydsl.SecurityDsl.EDatabaseType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getDatabaseAccess().getUrlKeyword_2());
            		
            // InternalSecurityDsl.g:490:3: ( (lv_url_3_0= ruleEString ) )
            // InternalSecurityDsl.g:491:4: (lv_url_3_0= ruleEString )
            {
            // InternalSecurityDsl.g:491:4: (lv_url_3_0= ruleEString )
            // InternalSecurityDsl.g:492:5: lv_url_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDatabaseAccess().getUrlEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_26);
            lv_url_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatabaseRule());
            					}
            					set(
            						current,
            						"url",
            						lv_url_3_0,
            						"org.xtext.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getDatabaseAccess().getUsernameKeyword_4());
            		
            // InternalSecurityDsl.g:513:3: ( (lv_username_5_0= ruleEString ) )
            // InternalSecurityDsl.g:514:4: (lv_username_5_0= ruleEString )
            {
            // InternalSecurityDsl.g:514:4: (lv_username_5_0= ruleEString )
            // InternalSecurityDsl.g:515:5: lv_username_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDatabaseAccess().getUsernameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_27);
            lv_username_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatabaseRule());
            					}
            					set(
            						current,
            						"username",
            						lv_username_5_0,
            						"org.xtext.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getDatabaseAccess().getPasswordKeyword_6());
            		
            // InternalSecurityDsl.g:536:3: ( (lv_password_7_0= ruleEString ) )
            // InternalSecurityDsl.g:537:4: (lv_password_7_0= ruleEString )
            {
            // InternalSecurityDsl.g:537:4: (lv_password_7_0= ruleEString )
            // InternalSecurityDsl.g:538:5: lv_password_7_0= ruleEString
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
            						"org.xtext.securitydsl.SecurityDsl.EString");
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


    // $ANTLR start "entryRuleEString"
    // InternalSecurityDsl.g:559:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSecurityDsl.g:559:47: (iv_ruleEString= ruleEString EOF )
            // InternalSecurityDsl.g:560:2: iv_ruleEString= ruleEString EOF
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
    // InternalSecurityDsl.g:566:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSecurityDsl.g:572:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSecurityDsl.g:573:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSecurityDsl.g:573:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalSecurityDsl.g:574:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:582:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleELongObject"
    // InternalSecurityDsl.g:593:1: entryRuleELongObject returns [String current=null] : iv_ruleELongObject= ruleELongObject EOF ;
    public final String entryRuleELongObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleELongObject = null;


        try {
            // InternalSecurityDsl.g:593:51: (iv_ruleELongObject= ruleELongObject EOF )
            // InternalSecurityDsl.g:594:2: iv_ruleELongObject= ruleELongObject EOF
            {
             newCompositeNode(grammarAccess.getELongObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleELongObject=ruleELongObject();

            state._fsp--;

             current =iv_ruleELongObject.getText(); 
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
    // $ANTLR end "entryRuleELongObject"


    // $ANTLR start "ruleELongObject"
    // InternalSecurityDsl.g:600:1: ruleELongObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleELongObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSecurityDsl.g:606:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSecurityDsl.g:607:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSecurityDsl.g:607:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSecurityDsl.g:608:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSecurityDsl.g:608:3: (kw= '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSecurityDsl.g:609:4: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_28); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getELongObjectAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getELongObjectAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleELongObject"


    // $ANTLR start "entryRuleAttribute"
    // InternalSecurityDsl.g:626:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalSecurityDsl.g:626:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalSecurityDsl.g:627:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalSecurityDsl.g:633:1: ruleAttribute returns [EObject current=null] : (otherlv_0= '{' ( (lv_identifier_1_0= 'identifier' ) )? ( (lv_credential_2_0= 'credential' ) )? otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'type:' ( (lv_type_6_0= ruleEType ) ) (otherlv_7= 'collumnName:' ( (lv_collumnName_8_0= ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_identifier_1_0=null;
        Token lv_credential_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        Enumerator lv_type_6_0 = null;

        AntlrDatatypeRuleToken lv_collumnName_8_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:639:2: ( (otherlv_0= '{' ( (lv_identifier_1_0= 'identifier' ) )? ( (lv_credential_2_0= 'credential' ) )? otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'type:' ( (lv_type_6_0= ruleEType ) ) (otherlv_7= 'collumnName:' ( (lv_collumnName_8_0= ruleEString ) ) )? otherlv_9= '}' ) )
            // InternalSecurityDsl.g:640:2: (otherlv_0= '{' ( (lv_identifier_1_0= 'identifier' ) )? ( (lv_credential_2_0= 'credential' ) )? otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'type:' ( (lv_type_6_0= ruleEType ) ) (otherlv_7= 'collumnName:' ( (lv_collumnName_8_0= ruleEString ) ) )? otherlv_9= '}' )
            {
            // InternalSecurityDsl.g:640:2: (otherlv_0= '{' ( (lv_identifier_1_0= 'identifier' ) )? ( (lv_credential_2_0= 'credential' ) )? otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'type:' ( (lv_type_6_0= ruleEType ) ) (otherlv_7= 'collumnName:' ( (lv_collumnName_8_0= ruleEString ) ) )? otherlv_9= '}' )
            // InternalSecurityDsl.g:641:3: otherlv_0= '{' ( (lv_identifier_1_0= 'identifier' ) )? ( (lv_credential_2_0= 'credential' ) )? otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'type:' ( (lv_type_6_0= ruleEType ) ) (otherlv_7= 'collumnName:' ( (lv_collumnName_8_0= ruleEString ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalSecurityDsl.g:645:3: ( (lv_identifier_1_0= 'identifier' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSecurityDsl.g:646:4: (lv_identifier_1_0= 'identifier' )
                    {
                    // InternalSecurityDsl.g:646:4: (lv_identifier_1_0= 'identifier' )
                    // InternalSecurityDsl.g:647:5: lv_identifier_1_0= 'identifier'
                    {
                    lv_identifier_1_0=(Token)match(input,32,FOLLOW_30); 

                    					newLeafNode(lv_identifier_1_0, grammarAccess.getAttributeAccess().getIdentifierIdentifierKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "identifier", lv_identifier_1_0 != null, "identifier");
                    				

                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:659:3: ( (lv_credential_2_0= 'credential' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSecurityDsl.g:660:4: (lv_credential_2_0= 'credential' )
                    {
                    // InternalSecurityDsl.g:660:4: (lv_credential_2_0= 'credential' )
                    // InternalSecurityDsl.g:661:5: lv_credential_2_0= 'credential'
                    {
                    lv_credential_2_0=(Token)match(input,33,FOLLOW_23); 

                    					newLeafNode(lv_credential_2_0, grammarAccess.getAttributeAccess().getCredentialCredentialKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "credential", lv_credential_2_0 != null, "credential");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getNameKeyword_3());
            		
            // InternalSecurityDsl.g:677:3: ( (lv_name_4_0= ruleEString ) )
            // InternalSecurityDsl.g:678:4: (lv_name_4_0= ruleEString )
            {
            // InternalSecurityDsl.g:678:4: (lv_name_4_0= ruleEString )
            // InternalSecurityDsl.g:679:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_31);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.xtext.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,34,FOLLOW_32); 

            			newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getTypeKeyword_5());
            		
            // InternalSecurityDsl.g:700:3: ( (lv_type_6_0= ruleEType ) )
            // InternalSecurityDsl.g:701:4: (lv_type_6_0= ruleEType )
            {
            // InternalSecurityDsl.g:701:4: (lv_type_6_0= ruleEType )
            // InternalSecurityDsl.g:702:5: lv_type_6_0= ruleEType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeETypeEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_33);
            lv_type_6_0=ruleEType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_6_0,
            						"org.xtext.securitydsl.SecurityDsl.EType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecurityDsl.g:719:3: (otherlv_7= 'collumnName:' ( (lv_collumnName_8_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSecurityDsl.g:720:4: otherlv_7= 'collumnName:' ( (lv_collumnName_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,35,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getCollumnNameKeyword_7_0());
                    			
                    // InternalSecurityDsl.g:724:4: ( (lv_collumnName_8_0= ruleEString ) )
                    // InternalSecurityDsl.g:725:5: (lv_collumnName_8_0= ruleEString )
                    {
                    // InternalSecurityDsl.g:725:5: (lv_collumnName_8_0= ruleEString )
                    // InternalSecurityDsl.g:726:6: lv_collumnName_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getCollumnNameEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_collumnName_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"collumnName",
                    							lv_collumnName_8_0,
                    							"org.xtext.securitydsl.SecurityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_8());
            		

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


    // $ANTLR start "entryRuleRole"
    // InternalSecurityDsl.g:752:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalSecurityDsl.g:752:45: (iv_ruleRole= ruleRole EOF )
            // InternalSecurityDsl.g:753:2: iv_ruleRole= ruleRole EOF
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
    // InternalSecurityDsl.g:759:1: ruleRole returns [EObject current=null] : ( () (otherlv_1= 'tableName:' ( (lv_tableName_2_0= ruleEString ) ) )? (otherlv_3= 'attributes:' otherlv_4= '[' ( (lv_entity_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_entity_attributes_7_0= ruleAttribute ) ) )* otherlv_8= ']' )? (otherlv_9= 'roles:' otherlv_10= '[' ( (lv_role_instances_11_0= ruleRoleInstance ) ) (otherlv_12= ',' ( (lv_role_instances_13_0= ruleRoleInstance ) ) )* otherlv_14= ']' )? ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_tableName_2_0 = null;

        EObject lv_entity_attributes_5_0 = null;

        EObject lv_entity_attributes_7_0 = null;

        EObject lv_role_instances_11_0 = null;

        EObject lv_role_instances_13_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:765:2: ( ( () (otherlv_1= 'tableName:' ( (lv_tableName_2_0= ruleEString ) ) )? (otherlv_3= 'attributes:' otherlv_4= '[' ( (lv_entity_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_entity_attributes_7_0= ruleAttribute ) ) )* otherlv_8= ']' )? (otherlv_9= 'roles:' otherlv_10= '[' ( (lv_role_instances_11_0= ruleRoleInstance ) ) (otherlv_12= ',' ( (lv_role_instances_13_0= ruleRoleInstance ) ) )* otherlv_14= ']' )? ) )
            // InternalSecurityDsl.g:766:2: ( () (otherlv_1= 'tableName:' ( (lv_tableName_2_0= ruleEString ) ) )? (otherlv_3= 'attributes:' otherlv_4= '[' ( (lv_entity_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_entity_attributes_7_0= ruleAttribute ) ) )* otherlv_8= ']' )? (otherlv_9= 'roles:' otherlv_10= '[' ( (lv_role_instances_11_0= ruleRoleInstance ) ) (otherlv_12= ',' ( (lv_role_instances_13_0= ruleRoleInstance ) ) )* otherlv_14= ']' )? )
            {
            // InternalSecurityDsl.g:766:2: ( () (otherlv_1= 'tableName:' ( (lv_tableName_2_0= ruleEString ) ) )? (otherlv_3= 'attributes:' otherlv_4= '[' ( (lv_entity_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_entity_attributes_7_0= ruleAttribute ) ) )* otherlv_8= ']' )? (otherlv_9= 'roles:' otherlv_10= '[' ( (lv_role_instances_11_0= ruleRoleInstance ) ) (otherlv_12= ',' ( (lv_role_instances_13_0= ruleRoleInstance ) ) )* otherlv_14= ']' )? )
            // InternalSecurityDsl.g:767:3: () (otherlv_1= 'tableName:' ( (lv_tableName_2_0= ruleEString ) ) )? (otherlv_3= 'attributes:' otherlv_4= '[' ( (lv_entity_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_entity_attributes_7_0= ruleAttribute ) ) )* otherlv_8= ']' )? (otherlv_9= 'roles:' otherlv_10= '[' ( (lv_role_instances_11_0= ruleRoleInstance ) ) (otherlv_12= ',' ( (lv_role_instances_13_0= ruleRoleInstance ) ) )* otherlv_14= ']' )?
            {
            // InternalSecurityDsl.g:767:3: ()
            // InternalSecurityDsl.g:768:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoleAccess().getRoleAction_0(),
            					current);
            			

            }

            // InternalSecurityDsl.g:774:3: (otherlv_1= 'tableName:' ( (lv_tableName_2_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSecurityDsl.g:775:4: otherlv_1= 'tableName:' ( (lv_tableName_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getRoleAccess().getTableNameKeyword_1_0());
                    			
                    // InternalSecurityDsl.g:779:4: ( (lv_tableName_2_0= ruleEString ) )
                    // InternalSecurityDsl.g:780:5: (lv_tableName_2_0= ruleEString )
                    {
                    // InternalSecurityDsl.g:780:5: (lv_tableName_2_0= ruleEString )
                    // InternalSecurityDsl.g:781:6: lv_tableName_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRoleAccess().getTableNameEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_tableName_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoleRule());
                    						}
                    						set(
                    							current,
                    							"tableName",
                    							lv_tableName_2_0,
                    							"org.xtext.securitydsl.SecurityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:799:3: (otherlv_3= 'attributes:' otherlv_4= '[' ( (lv_entity_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_entity_attributes_7_0= ruleAttribute ) ) )* otherlv_8= ']' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSecurityDsl.g:800:4: otherlv_3= 'attributes:' otherlv_4= '[' ( (lv_entity_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_entity_attributes_7_0= ruleAttribute ) ) )* otherlv_8= ']'
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_36); 

                    				newLeafNode(otherlv_3, grammarAccess.getRoleAccess().getAttributesKeyword_2_0());
                    			
                    otherlv_4=(Token)match(input,39,FOLLOW_37); 

                    				newLeafNode(otherlv_4, grammarAccess.getRoleAccess().getLeftSquareBracketKeyword_2_1());
                    			
                    // InternalSecurityDsl.g:808:4: ( (lv_entity_attributes_5_0= ruleAttribute ) )
                    // InternalSecurityDsl.g:809:5: (lv_entity_attributes_5_0= ruleAttribute )
                    {
                    // InternalSecurityDsl.g:809:5: (lv_entity_attributes_5_0= ruleAttribute )
                    // InternalSecurityDsl.g:810:6: lv_entity_attributes_5_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getRoleAccess().getEntity_attributesAttributeParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_entity_attributes_5_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoleRule());
                    						}
                    						add(
                    							current,
                    							"entity_attributes",
                    							lv_entity_attributes_5_0,
                    							"org.xtext.securitydsl.SecurityDsl.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSecurityDsl.g:827:4: (otherlv_6= ',' ( (lv_entity_attributes_7_0= ruleAttribute ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==40) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalSecurityDsl.g:828:5: otherlv_6= ',' ( (lv_entity_attributes_7_0= ruleAttribute ) )
                    	    {
                    	    otherlv_6=(Token)match(input,40,FOLLOW_37); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRoleAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalSecurityDsl.g:832:5: ( (lv_entity_attributes_7_0= ruleAttribute ) )
                    	    // InternalSecurityDsl.g:833:6: (lv_entity_attributes_7_0= ruleAttribute )
                    	    {
                    	    // InternalSecurityDsl.g:833:6: (lv_entity_attributes_7_0= ruleAttribute )
                    	    // InternalSecurityDsl.g:834:7: lv_entity_attributes_7_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getRoleAccess().getEntity_attributesAttributeParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_38);
                    	    lv_entity_attributes_7_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRoleRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"entity_attributes",
                    	    								lv_entity_attributes_7_0,
                    	    								"org.xtext.securitydsl.SecurityDsl.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,41,FOLLOW_39); 

                    				newLeafNode(otherlv_8, grammarAccess.getRoleAccess().getRightSquareBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalSecurityDsl.g:857:3: (otherlv_9= 'roles:' otherlv_10= '[' ( (lv_role_instances_11_0= ruleRoleInstance ) ) (otherlv_12= ',' ( (lv_role_instances_13_0= ruleRoleInstance ) ) )* otherlv_14= ']' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSecurityDsl.g:858:4: otherlv_9= 'roles:' otherlv_10= '[' ( (lv_role_instances_11_0= ruleRoleInstance ) ) (otherlv_12= ',' ( (lv_role_instances_13_0= ruleRoleInstance ) ) )* otherlv_14= ']'
                    {
                    otherlv_9=(Token)match(input,42,FOLLOW_36); 

                    				newLeafNode(otherlv_9, grammarAccess.getRoleAccess().getRolesKeyword_3_0());
                    			
                    otherlv_10=(Token)match(input,39,FOLLOW_40); 

                    				newLeafNode(otherlv_10, grammarAccess.getRoleAccess().getLeftSquareBracketKeyword_3_1());
                    			
                    // InternalSecurityDsl.g:866:4: ( (lv_role_instances_11_0= ruleRoleInstance ) )
                    // InternalSecurityDsl.g:867:5: (lv_role_instances_11_0= ruleRoleInstance )
                    {
                    // InternalSecurityDsl.g:867:5: (lv_role_instances_11_0= ruleRoleInstance )
                    // InternalSecurityDsl.g:868:6: lv_role_instances_11_0= ruleRoleInstance
                    {

                    						newCompositeNode(grammarAccess.getRoleAccess().getRole_instancesRoleInstanceParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_role_instances_11_0=ruleRoleInstance();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoleRule());
                    						}
                    						add(
                    							current,
                    							"role_instances",
                    							lv_role_instances_11_0,
                    							"org.xtext.securitydsl.SecurityDsl.RoleInstance");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSecurityDsl.g:885:4: (otherlv_12= ',' ( (lv_role_instances_13_0= ruleRoleInstance ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==40) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalSecurityDsl.g:886:5: otherlv_12= ',' ( (lv_role_instances_13_0= ruleRoleInstance ) )
                    	    {
                    	    otherlv_12=(Token)match(input,40,FOLLOW_40); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getRoleAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalSecurityDsl.g:890:5: ( (lv_role_instances_13_0= ruleRoleInstance ) )
                    	    // InternalSecurityDsl.g:891:6: (lv_role_instances_13_0= ruleRoleInstance )
                    	    {
                    	    // InternalSecurityDsl.g:891:6: (lv_role_instances_13_0= ruleRoleInstance )
                    	    // InternalSecurityDsl.g:892:7: lv_role_instances_13_0= ruleRoleInstance
                    	    {

                    	    							newCompositeNode(grammarAccess.getRoleAccess().getRole_instancesRoleInstanceParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_38);
                    	    lv_role_instances_13_0=ruleRoleInstance();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRoleRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"role_instances",
                    	    								lv_role_instances_13_0,
                    	    								"org.xtext.securitydsl.SecurityDsl.RoleInstance");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,41,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getRoleAccess().getRightSquareBracketKeyword_3_4());
                    			

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


    // $ANTLR start "entryRuleUser"
    // InternalSecurityDsl.g:919:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // InternalSecurityDsl.g:919:45: (iv_ruleUser= ruleUser EOF )
            // InternalSecurityDsl.g:920:2: iv_ruleUser= ruleUser EOF
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
    // InternalSecurityDsl.g:926:1: ruleUser returns [EObject current=null] : ( () (otherlv_1= 'tableName:' ( (lv_tableName_2_0= ruleEString ) ) )? (otherlv_3= 'attributes:' otherlv_4= '[' ( (lv_entity_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_entity_attributes_7_0= ruleAttribute ) ) )* otherlv_8= ']' )? ) ;
    public final EObject ruleUser() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_tableName_2_0 = null;

        EObject lv_entity_attributes_5_0 = null;

        EObject lv_entity_attributes_7_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:932:2: ( ( () (otherlv_1= 'tableName:' ( (lv_tableName_2_0= ruleEString ) ) )? (otherlv_3= 'attributes:' otherlv_4= '[' ( (lv_entity_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_entity_attributes_7_0= ruleAttribute ) ) )* otherlv_8= ']' )? ) )
            // InternalSecurityDsl.g:933:2: ( () (otherlv_1= 'tableName:' ( (lv_tableName_2_0= ruleEString ) ) )? (otherlv_3= 'attributes:' otherlv_4= '[' ( (lv_entity_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_entity_attributes_7_0= ruleAttribute ) ) )* otherlv_8= ']' )? )
            {
            // InternalSecurityDsl.g:933:2: ( () (otherlv_1= 'tableName:' ( (lv_tableName_2_0= ruleEString ) ) )? (otherlv_3= 'attributes:' otherlv_4= '[' ( (lv_entity_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_entity_attributes_7_0= ruleAttribute ) ) )* otherlv_8= ']' )? )
            // InternalSecurityDsl.g:934:3: () (otherlv_1= 'tableName:' ( (lv_tableName_2_0= ruleEString ) ) )? (otherlv_3= 'attributes:' otherlv_4= '[' ( (lv_entity_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_entity_attributes_7_0= ruleAttribute ) ) )* otherlv_8= ']' )?
            {
            // InternalSecurityDsl.g:934:3: ()
            // InternalSecurityDsl.g:935:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUserAccess().getUserAction_0(),
            					current);
            			

            }

            // InternalSecurityDsl.g:941:3: (otherlv_1= 'tableName:' ( (lv_tableName_2_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==37) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSecurityDsl.g:942:4: otherlv_1= 'tableName:' ( (lv_tableName_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getUserAccess().getTableNameKeyword_1_0());
                    			
                    // InternalSecurityDsl.g:946:4: ( (lv_tableName_2_0= ruleEString ) )
                    // InternalSecurityDsl.g:947:5: (lv_tableName_2_0= ruleEString )
                    {
                    // InternalSecurityDsl.g:947:5: (lv_tableName_2_0= ruleEString )
                    // InternalSecurityDsl.g:948:6: lv_tableName_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getUserAccess().getTableNameEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_tableName_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUserRule());
                    						}
                    						set(
                    							current,
                    							"tableName",
                    							lv_tableName_2_0,
                    							"org.xtext.securitydsl.SecurityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:966:3: (otherlv_3= 'attributes:' otherlv_4= '[' ( (lv_entity_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_entity_attributes_7_0= ruleAttribute ) ) )* otherlv_8= ']' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSecurityDsl.g:967:4: otherlv_3= 'attributes:' otherlv_4= '[' ( (lv_entity_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_entity_attributes_7_0= ruleAttribute ) ) )* otherlv_8= ']'
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_36); 

                    				newLeafNode(otherlv_3, grammarAccess.getUserAccess().getAttributesKeyword_2_0());
                    			
                    otherlv_4=(Token)match(input,39,FOLLOW_37); 

                    				newLeafNode(otherlv_4, grammarAccess.getUserAccess().getLeftSquareBracketKeyword_2_1());
                    			
                    // InternalSecurityDsl.g:975:4: ( (lv_entity_attributes_5_0= ruleAttribute ) )
                    // InternalSecurityDsl.g:976:5: (lv_entity_attributes_5_0= ruleAttribute )
                    {
                    // InternalSecurityDsl.g:976:5: (lv_entity_attributes_5_0= ruleAttribute )
                    // InternalSecurityDsl.g:977:6: lv_entity_attributes_5_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getUserAccess().getEntity_attributesAttributeParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_entity_attributes_5_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUserRule());
                    						}
                    						add(
                    							current,
                    							"entity_attributes",
                    							lv_entity_attributes_5_0,
                    							"org.xtext.securitydsl.SecurityDsl.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSecurityDsl.g:994:4: (otherlv_6= ',' ( (lv_entity_attributes_7_0= ruleAttribute ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==40) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalSecurityDsl.g:995:5: otherlv_6= ',' ( (lv_entity_attributes_7_0= ruleAttribute ) )
                    	    {
                    	    otherlv_6=(Token)match(input,40,FOLLOW_37); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getUserAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalSecurityDsl.g:999:5: ( (lv_entity_attributes_7_0= ruleAttribute ) )
                    	    // InternalSecurityDsl.g:1000:6: (lv_entity_attributes_7_0= ruleAttribute )
                    	    {
                    	    // InternalSecurityDsl.g:1000:6: (lv_entity_attributes_7_0= ruleAttribute )
                    	    // InternalSecurityDsl.g:1001:7: lv_entity_attributes_7_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getUserAccess().getEntity_attributesAttributeParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_38);
                    	    lv_entity_attributes_7_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUserRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"entity_attributes",
                    	    								lv_entity_attributes_7_0,
                    	    								"org.xtext.securitydsl.SecurityDsl.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,41,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getUserAccess().getRightSquareBracketKeyword_2_4());
                    			

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


    // $ANTLR start "entryRuleRoleInstance"
    // InternalSecurityDsl.g:1028:1: entryRuleRoleInstance returns [EObject current=null] : iv_ruleRoleInstance= ruleRoleInstance EOF ;
    public final EObject entryRuleRoleInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleInstance = null;


        try {
            // InternalSecurityDsl.g:1028:53: (iv_ruleRoleInstance= ruleRoleInstance EOF )
            // InternalSecurityDsl.g:1029:2: iv_ruleRoleInstance= ruleRoleInstance EOF
            {
             newCompositeNode(grammarAccess.getRoleInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoleInstance=ruleRoleInstance();

            state._fsp--;

             current =iv_ruleRoleInstance; 
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
    // $ANTLR end "entryRuleRoleInstance"


    // $ANTLR start "ruleRoleInstance"
    // InternalSecurityDsl.g:1035:1: ruleRoleInstance returns [EObject current=null] : ( () ( (lv_client_1_0= 'client' ) )? ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleRoleInstance() throws RecognitionException {
        EObject current = null;

        Token lv_client_1_0=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:1041:2: ( ( () ( (lv_client_1_0= 'client' ) )? ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalSecurityDsl.g:1042:2: ( () ( (lv_client_1_0= 'client' ) )? ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalSecurityDsl.g:1042:2: ( () ( (lv_client_1_0= 'client' ) )? ( (lv_name_2_0= ruleEString ) ) )
            // InternalSecurityDsl.g:1043:3: () ( (lv_client_1_0= 'client' ) )? ( (lv_name_2_0= ruleEString ) )
            {
            // InternalSecurityDsl.g:1043:3: ()
            // InternalSecurityDsl.g:1044:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoleInstanceAccess().getRoleInstanceAction_0(),
            					current);
            			

            }

            // InternalSecurityDsl.g:1050:3: ( (lv_client_1_0= 'client' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==43) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSecurityDsl.g:1051:4: (lv_client_1_0= 'client' )
                    {
                    // InternalSecurityDsl.g:1051:4: (lv_client_1_0= 'client' )
                    // InternalSecurityDsl.g:1052:5: lv_client_1_0= 'client'
                    {
                    lv_client_1_0=(Token)match(input,43,FOLLOW_4); 

                    					newLeafNode(lv_client_1_0, grammarAccess.getRoleInstanceAccess().getClientClientKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRoleInstanceRule());
                    					}
                    					setWithLastConsumed(current, "client", lv_client_1_0 != null, "client");
                    				

                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:1064:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSecurityDsl.g:1065:4: (lv_name_2_0= ruleEString )
            {
            // InternalSecurityDsl.g:1065:4: (lv_name_2_0= ruleEString )
            // InternalSecurityDsl.g:1066:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRoleInstanceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoleInstanceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.securitydsl.SecurityDsl.EString");
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
    // $ANTLR end "ruleRoleInstance"


    // $ANTLR start "entryRuleEndpoint"
    // InternalSecurityDsl.g:1087:1: entryRuleEndpoint returns [EObject current=null] : iv_ruleEndpoint= ruleEndpoint EOF ;
    public final EObject entryRuleEndpoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndpoint = null;


        try {
            // InternalSecurityDsl.g:1087:49: (iv_ruleEndpoint= ruleEndpoint EOF )
            // InternalSecurityDsl.g:1088:2: iv_ruleEndpoint= ruleEndpoint EOF
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
    // InternalSecurityDsl.g:1094:1: ruleEndpoint returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'type:' ( (lv_type_2_0= ruleEEndpointType ) ) otherlv_3= 'url:' ( (lv_url_4_0= ruleEString ) ) (otherlv_5= 'methodName:' ( (lv_methodName_6_0= ruleEString ) ) )? (otherlv_7= 'method:' ( (lv_method_8_0= ruleEEndpointMethod ) ) )? (otherlv_9= 'roleAuthorities:' otherlv_10= '[' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ']' )? otherlv_15= '}' ) ;
    public final EObject ruleEndpoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Enumerator lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_url_4_0 = null;

        AntlrDatatypeRuleToken lv_methodName_6_0 = null;

        Enumerator lv_method_8_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:1100:2: ( (otherlv_0= '{' otherlv_1= 'type:' ( (lv_type_2_0= ruleEEndpointType ) ) otherlv_3= 'url:' ( (lv_url_4_0= ruleEString ) ) (otherlv_5= 'methodName:' ( (lv_methodName_6_0= ruleEString ) ) )? (otherlv_7= 'method:' ( (lv_method_8_0= ruleEEndpointMethod ) ) )? (otherlv_9= 'roleAuthorities:' otherlv_10= '[' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ']' )? otherlv_15= '}' ) )
            // InternalSecurityDsl.g:1101:2: (otherlv_0= '{' otherlv_1= 'type:' ( (lv_type_2_0= ruleEEndpointType ) ) otherlv_3= 'url:' ( (lv_url_4_0= ruleEString ) ) (otherlv_5= 'methodName:' ( (lv_methodName_6_0= ruleEString ) ) )? (otherlv_7= 'method:' ( (lv_method_8_0= ruleEEndpointMethod ) ) )? (otherlv_9= 'roleAuthorities:' otherlv_10= '[' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ']' )? otherlv_15= '}' )
            {
            // InternalSecurityDsl.g:1101:2: (otherlv_0= '{' otherlv_1= 'type:' ( (lv_type_2_0= ruleEEndpointType ) ) otherlv_3= 'url:' ( (lv_url_4_0= ruleEString ) ) (otherlv_5= 'methodName:' ( (lv_methodName_6_0= ruleEString ) ) )? (otherlv_7= 'method:' ( (lv_method_8_0= ruleEEndpointMethod ) ) )? (otherlv_9= 'roleAuthorities:' otherlv_10= '[' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ']' )? otherlv_15= '}' )
            // InternalSecurityDsl.g:1102:3: otherlv_0= '{' otherlv_1= 'type:' ( (lv_type_2_0= ruleEEndpointType ) ) otherlv_3= 'url:' ( (lv_url_4_0= ruleEString ) ) (otherlv_5= 'methodName:' ( (lv_methodName_6_0= ruleEString ) ) )? (otherlv_7= 'method:' ( (lv_method_8_0= ruleEEndpointMethod ) ) )? (otherlv_9= 'roleAuthorities:' otherlv_10= '[' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ']' )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getEndpointAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,34,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getEndpointAccess().getTypeKeyword_1());
            		
            // InternalSecurityDsl.g:1110:3: ( (lv_type_2_0= ruleEEndpointType ) )
            // InternalSecurityDsl.g:1111:4: (lv_type_2_0= ruleEEndpointType )
            {
            // InternalSecurityDsl.g:1111:4: (lv_type_2_0= ruleEEndpointType )
            // InternalSecurityDsl.g:1112:5: lv_type_2_0= ruleEEndpointType
            {

            					newCompositeNode(grammarAccess.getEndpointAccess().getTypeEEndpointTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
            lv_type_2_0=ruleEEndpointType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEndpointRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.securitydsl.SecurityDsl.EEndpointType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getEndpointAccess().getUrlKeyword_3());
            		
            // InternalSecurityDsl.g:1133:3: ( (lv_url_4_0= ruleEString ) )
            // InternalSecurityDsl.g:1134:4: (lv_url_4_0= ruleEString )
            {
            // InternalSecurityDsl.g:1134:4: (lv_url_4_0= ruleEString )
            // InternalSecurityDsl.g:1135:5: lv_url_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEndpointAccess().getUrlEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_43);
            lv_url_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEndpointRule());
            					}
            					set(
            						current,
            						"url",
            						lv_url_4_0,
            						"org.xtext.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecurityDsl.g:1152:3: (otherlv_5= 'methodName:' ( (lv_methodName_6_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==44) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSecurityDsl.g:1153:4: otherlv_5= 'methodName:' ( (lv_methodName_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,44,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getEndpointAccess().getMethodNameKeyword_5_0());
                    			
                    // InternalSecurityDsl.g:1157:4: ( (lv_methodName_6_0= ruleEString ) )
                    // InternalSecurityDsl.g:1158:5: (lv_methodName_6_0= ruleEString )
                    {
                    // InternalSecurityDsl.g:1158:5: (lv_methodName_6_0= ruleEString )
                    // InternalSecurityDsl.g:1159:6: lv_methodName_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEndpointAccess().getMethodNameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_methodName_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEndpointRule());
                    						}
                    						set(
                    							current,
                    							"methodName",
                    							lv_methodName_6_0,
                    							"org.xtext.securitydsl.SecurityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:1177:3: (otherlv_7= 'method:' ( (lv_method_8_0= ruleEEndpointMethod ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==45) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSecurityDsl.g:1178:4: otherlv_7= 'method:' ( (lv_method_8_0= ruleEEndpointMethod ) )
                    {
                    otherlv_7=(Token)match(input,45,FOLLOW_45); 

                    				newLeafNode(otherlv_7, grammarAccess.getEndpointAccess().getMethodKeyword_6_0());
                    			
                    // InternalSecurityDsl.g:1182:4: ( (lv_method_8_0= ruleEEndpointMethod ) )
                    // InternalSecurityDsl.g:1183:5: (lv_method_8_0= ruleEEndpointMethod )
                    {
                    // InternalSecurityDsl.g:1183:5: (lv_method_8_0= ruleEEndpointMethod )
                    // InternalSecurityDsl.g:1184:6: lv_method_8_0= ruleEEndpointMethod
                    {

                    						newCompositeNode(grammarAccess.getEndpointAccess().getMethodEEndpointMethodEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_method_8_0=ruleEEndpointMethod();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEndpointRule());
                    						}
                    						set(
                    							current,
                    							"method",
                    							lv_method_8_0,
                    							"org.xtext.securitydsl.SecurityDsl.EEndpointMethod");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:1202:3: (otherlv_9= 'roleAuthorities:' otherlv_10= '[' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ']' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==46) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSecurityDsl.g:1203:4: otherlv_9= 'roleAuthorities:' otherlv_10= '[' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ']'
                    {
                    otherlv_9=(Token)match(input,46,FOLLOW_36); 

                    				newLeafNode(otherlv_9, grammarAccess.getEndpointAccess().getRoleAuthoritiesKeyword_7_0());
                    			
                    otherlv_10=(Token)match(input,39,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getEndpointAccess().getLeftSquareBracketKeyword_7_1());
                    			
                    // InternalSecurityDsl.g:1211:4: ( ( ruleEString ) )
                    // InternalSecurityDsl.g:1212:5: ( ruleEString )
                    {
                    // InternalSecurityDsl.g:1212:5: ( ruleEString )
                    // InternalSecurityDsl.g:1213:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEndpointRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEndpointAccess().getRole_authoritiesRoleInstanceCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_38);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSecurityDsl.g:1227:4: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==40) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalSecurityDsl.g:1228:5: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,40,FOLLOW_4); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getEndpointAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalSecurityDsl.g:1232:5: ( ( ruleEString ) )
                    	    // InternalSecurityDsl.g:1233:6: ( ruleEString )
                    	    {
                    	    // InternalSecurityDsl.g:1233:6: ( ruleEString )
                    	    // InternalSecurityDsl.g:1234:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEndpointRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEndpointAccess().getRole_authoritiesRoleInstanceCrossReference_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_38);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,41,FOLLOW_34); 

                    				newLeafNode(otherlv_14, grammarAccess.getEndpointAccess().getRightSquareBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getEndpointAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalSecurityDsl.g:1262:1: entryRuleAuthentication returns [EObject current=null] : iv_ruleAuthentication= ruleAuthentication EOF ;
    public final EObject entryRuleAuthentication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthentication = null;


        try {
            // InternalSecurityDsl.g:1262:55: (iv_ruleAuthentication= ruleAuthentication EOF )
            // InternalSecurityDsl.g:1263:2: iv_ruleAuthentication= ruleAuthentication EOF
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
    // InternalSecurityDsl.g:1269:1: ruleAuthentication returns [EObject current=null] : ( () otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'path:' ( (lv_path_4_0= ruleEString ) ) (otherlv_5= 'endpoints:' otherlv_6= '[' ( (lv_controller_endpoints_7_0= ruleEndpoint ) ) (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )* otherlv_10= ']' )? ) ;
    public final EObject ruleAuthentication() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_path_4_0 = null;

        EObject lv_controller_endpoints_7_0 = null;

        EObject lv_controller_endpoints_9_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:1275:2: ( ( () otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'path:' ( (lv_path_4_0= ruleEString ) ) (otherlv_5= 'endpoints:' otherlv_6= '[' ( (lv_controller_endpoints_7_0= ruleEndpoint ) ) (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )* otherlv_10= ']' )? ) )
            // InternalSecurityDsl.g:1276:2: ( () otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'path:' ( (lv_path_4_0= ruleEString ) ) (otherlv_5= 'endpoints:' otherlv_6= '[' ( (lv_controller_endpoints_7_0= ruleEndpoint ) ) (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )* otherlv_10= ']' )? )
            {
            // InternalSecurityDsl.g:1276:2: ( () otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'path:' ( (lv_path_4_0= ruleEString ) ) (otherlv_5= 'endpoints:' otherlv_6= '[' ( (lv_controller_endpoints_7_0= ruleEndpoint ) ) (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )* otherlv_10= ']' )? )
            // InternalSecurityDsl.g:1277:3: () otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'path:' ( (lv_path_4_0= ruleEString ) ) (otherlv_5= 'endpoints:' otherlv_6= '[' ( (lv_controller_endpoints_7_0= ruleEndpoint ) ) (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )* otherlv_10= ']' )?
            {
            // InternalSecurityDsl.g:1277:3: ()
            // InternalSecurityDsl.g:1278:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAuthenticationAccess().getAuthenticationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAuthenticationAccess().getNameKeyword_1());
            		
            // InternalSecurityDsl.g:1288:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSecurityDsl.g:1289:4: (lv_name_2_0= ruleEString )
            {
            // InternalSecurityDsl.g:1289:4: (lv_name_2_0= ruleEString )
            // InternalSecurityDsl.g:1290:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAuthenticationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_47);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAuthenticationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,47,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getAuthenticationAccess().getPathKeyword_3());
            		
            // InternalSecurityDsl.g:1311:3: ( (lv_path_4_0= ruleEString ) )
            // InternalSecurityDsl.g:1312:4: (lv_path_4_0= ruleEString )
            {
            // InternalSecurityDsl.g:1312:4: (lv_path_4_0= ruleEString )
            // InternalSecurityDsl.g:1313:5: lv_path_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAuthenticationAccess().getPathEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_48);
            lv_path_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAuthenticationRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_4_0,
            						"org.xtext.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecurityDsl.g:1330:3: (otherlv_5= 'endpoints:' otherlv_6= '[' ( (lv_controller_endpoints_7_0= ruleEndpoint ) ) (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )* otherlv_10= ']' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==48) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSecurityDsl.g:1331:4: otherlv_5= 'endpoints:' otherlv_6= '[' ( (lv_controller_endpoints_7_0= ruleEndpoint ) ) (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )* otherlv_10= ']'
                    {
                    otherlv_5=(Token)match(input,48,FOLLOW_36); 

                    				newLeafNode(otherlv_5, grammarAccess.getAuthenticationAccess().getEndpointsKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,39,FOLLOW_37); 

                    				newLeafNode(otherlv_6, grammarAccess.getAuthenticationAccess().getLeftSquareBracketKeyword_5_1());
                    			
                    // InternalSecurityDsl.g:1339:4: ( (lv_controller_endpoints_7_0= ruleEndpoint ) )
                    // InternalSecurityDsl.g:1340:5: (lv_controller_endpoints_7_0= ruleEndpoint )
                    {
                    // InternalSecurityDsl.g:1340:5: (lv_controller_endpoints_7_0= ruleEndpoint )
                    // InternalSecurityDsl.g:1341:6: lv_controller_endpoints_7_0= ruleEndpoint
                    {

                    						newCompositeNode(grammarAccess.getAuthenticationAccess().getController_endpointsEndpointParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_controller_endpoints_7_0=ruleEndpoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAuthenticationRule());
                    						}
                    						add(
                    							current,
                    							"controller_endpoints",
                    							lv_controller_endpoints_7_0,
                    							"org.xtext.securitydsl.SecurityDsl.Endpoint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSecurityDsl.g:1358:4: (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==40) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalSecurityDsl.g:1359:5: otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) )
                    	    {
                    	    otherlv_8=(Token)match(input,40,FOLLOW_37); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getAuthenticationAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSecurityDsl.g:1363:5: ( (lv_controller_endpoints_9_0= ruleEndpoint ) )
                    	    // InternalSecurityDsl.g:1364:6: (lv_controller_endpoints_9_0= ruleEndpoint )
                    	    {
                    	    // InternalSecurityDsl.g:1364:6: (lv_controller_endpoints_9_0= ruleEndpoint )
                    	    // InternalSecurityDsl.g:1365:7: lv_controller_endpoints_9_0= ruleEndpoint
                    	    {

                    	    							newCompositeNode(grammarAccess.getAuthenticationAccess().getController_endpointsEndpointParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_38);
                    	    lv_controller_endpoints_9_0=ruleEndpoint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAuthenticationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"controller_endpoints",
                    	    								lv_controller_endpoints_9_0,
                    	    								"org.xtext.securitydsl.SecurityDsl.Endpoint");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,41,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getAuthenticationAccess().getRightSquareBracketKeyword_5_4());
                    			

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


    // $ANTLR start "entryRuleJWT"
    // InternalSecurityDsl.g:1392:1: entryRuleJWT returns [EObject current=null] : iv_ruleJWT= ruleJWT EOF ;
    public final EObject entryRuleJWT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJWT = null;


        try {
            // InternalSecurityDsl.g:1392:44: (iv_ruleJWT= ruleJWT EOF )
            // InternalSecurityDsl.g:1393:2: iv_ruleJWT= ruleJWT EOF
            {
             newCompositeNode(grammarAccess.getJWTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJWT=ruleJWT();

            state._fsp--;

             current =iv_ruleJWT; 
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
    // $ANTLR end "entryRuleJWT"


    // $ANTLR start "ruleJWT"
    // InternalSecurityDsl.g:1399:1: ruleJWT returns [EObject current=null] : (otherlv_0= 'jwt:' otherlv_1= 'header:' otherlv_2= 'signatureAlgorithm:' ( (lv_signatureAlgorithm_3_0= ruleEString ) ) otherlv_4= 'payload:' otherlv_5= 'claims:' otherlv_6= '[' ( (lv_registered_claims_7_0= ruleRegisteredClaim ) ) (otherlv_8= ',' ( (lv_claims_9_0= ruleClaim ) ) )* otherlv_10= ']' (otherlv_11= 'signature:' otherlv_12= 'secret:' ( (lv_secret_13_0= ruleEString ) ) )? ) ;
    public final EObject ruleJWT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_signatureAlgorithm_3_0 = null;

        EObject lv_registered_claims_7_0 = null;

        EObject lv_claims_9_0 = null;

        AntlrDatatypeRuleToken lv_secret_13_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:1405:2: ( (otherlv_0= 'jwt:' otherlv_1= 'header:' otherlv_2= 'signatureAlgorithm:' ( (lv_signatureAlgorithm_3_0= ruleEString ) ) otherlv_4= 'payload:' otherlv_5= 'claims:' otherlv_6= '[' ( (lv_registered_claims_7_0= ruleRegisteredClaim ) ) (otherlv_8= ',' ( (lv_claims_9_0= ruleClaim ) ) )* otherlv_10= ']' (otherlv_11= 'signature:' otherlv_12= 'secret:' ( (lv_secret_13_0= ruleEString ) ) )? ) )
            // InternalSecurityDsl.g:1406:2: (otherlv_0= 'jwt:' otherlv_1= 'header:' otherlv_2= 'signatureAlgorithm:' ( (lv_signatureAlgorithm_3_0= ruleEString ) ) otherlv_4= 'payload:' otherlv_5= 'claims:' otherlv_6= '[' ( (lv_registered_claims_7_0= ruleRegisteredClaim ) ) (otherlv_8= ',' ( (lv_claims_9_0= ruleClaim ) ) )* otherlv_10= ']' (otherlv_11= 'signature:' otherlv_12= 'secret:' ( (lv_secret_13_0= ruleEString ) ) )? )
            {
            // InternalSecurityDsl.g:1406:2: (otherlv_0= 'jwt:' otherlv_1= 'header:' otherlv_2= 'signatureAlgorithm:' ( (lv_signatureAlgorithm_3_0= ruleEString ) ) otherlv_4= 'payload:' otherlv_5= 'claims:' otherlv_6= '[' ( (lv_registered_claims_7_0= ruleRegisteredClaim ) ) (otherlv_8= ',' ( (lv_claims_9_0= ruleClaim ) ) )* otherlv_10= ']' (otherlv_11= 'signature:' otherlv_12= 'secret:' ( (lv_secret_13_0= ruleEString ) ) )? )
            // InternalSecurityDsl.g:1407:3: otherlv_0= 'jwt:' otherlv_1= 'header:' otherlv_2= 'signatureAlgorithm:' ( (lv_signatureAlgorithm_3_0= ruleEString ) ) otherlv_4= 'payload:' otherlv_5= 'claims:' otherlv_6= '[' ( (lv_registered_claims_7_0= ruleRegisteredClaim ) ) (otherlv_8= ',' ( (lv_claims_9_0= ruleClaim ) ) )* otherlv_10= ']' (otherlv_11= 'signature:' otherlv_12= 'secret:' ( (lv_secret_13_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49); 

            			newLeafNode(otherlv_0, grammarAccess.getJWTAccess().getJwtKeyword_0());
            		
            otherlv_1=(Token)match(input,50,FOLLOW_50); 

            			newLeafNode(otherlv_1, grammarAccess.getJWTAccess().getHeaderKeyword_1());
            		
            otherlv_2=(Token)match(input,51,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getJWTAccess().getSignatureAlgorithmKeyword_2());
            		
            // InternalSecurityDsl.g:1419:3: ( (lv_signatureAlgorithm_3_0= ruleEString ) )
            // InternalSecurityDsl.g:1420:4: (lv_signatureAlgorithm_3_0= ruleEString )
            {
            // InternalSecurityDsl.g:1420:4: (lv_signatureAlgorithm_3_0= ruleEString )
            // InternalSecurityDsl.g:1421:5: lv_signatureAlgorithm_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getJWTAccess().getSignatureAlgorithmEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_51);
            lv_signatureAlgorithm_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJWTRule());
            					}
            					set(
            						current,
            						"signatureAlgorithm",
            						lv_signatureAlgorithm_3_0,
            						"org.xtext.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,52,FOLLOW_52); 

            			newLeafNode(otherlv_4, grammarAccess.getJWTAccess().getPayloadKeyword_4());
            		
            otherlv_5=(Token)match(input,53,FOLLOW_36); 

            			newLeafNode(otherlv_5, grammarAccess.getJWTAccess().getClaimsKeyword_5());
            		
            otherlv_6=(Token)match(input,39,FOLLOW_37); 

            			newLeafNode(otherlv_6, grammarAccess.getJWTAccess().getLeftSquareBracketKeyword_6());
            		
            // InternalSecurityDsl.g:1450:3: ( (lv_registered_claims_7_0= ruleRegisteredClaim ) )
            // InternalSecurityDsl.g:1451:4: (lv_registered_claims_7_0= ruleRegisteredClaim )
            {
            // InternalSecurityDsl.g:1451:4: (lv_registered_claims_7_0= ruleRegisteredClaim )
            // InternalSecurityDsl.g:1452:5: lv_registered_claims_7_0= ruleRegisteredClaim
            {

            					newCompositeNode(grammarAccess.getJWTAccess().getRegistered_claimsRegisteredClaimParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_38);
            lv_registered_claims_7_0=ruleRegisteredClaim();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJWTRule());
            					}
            					set(
            						current,
            						"registered_claims",
            						lv_registered_claims_7_0,
            						"org.xtext.securitydsl.SecurityDsl.RegisteredClaim");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecurityDsl.g:1469:3: (otherlv_8= ',' ( (lv_claims_9_0= ruleClaim ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==40) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalSecurityDsl.g:1470:4: otherlv_8= ',' ( (lv_claims_9_0= ruleClaim ) )
            	    {
            	    otherlv_8=(Token)match(input,40,FOLLOW_37); 

            	    				newLeafNode(otherlv_8, grammarAccess.getJWTAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalSecurityDsl.g:1474:4: ( (lv_claims_9_0= ruleClaim ) )
            	    // InternalSecurityDsl.g:1475:5: (lv_claims_9_0= ruleClaim )
            	    {
            	    // InternalSecurityDsl.g:1475:5: (lv_claims_9_0= ruleClaim )
            	    // InternalSecurityDsl.g:1476:6: lv_claims_9_0= ruleClaim
            	    {

            	    						newCompositeNode(grammarAccess.getJWTAccess().getClaimsClaimParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_38);
            	    lv_claims_9_0=ruleClaim();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getJWTRule());
            	    						}
            	    						add(
            	    							current,
            	    							"claims",
            	    							lv_claims_9_0,
            	    							"org.xtext.securitydsl.SecurityDsl.Claim");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_10=(Token)match(input,41,FOLLOW_53); 

            			newLeafNode(otherlv_10, grammarAccess.getJWTAccess().getRightSquareBracketKeyword_9());
            		
            // InternalSecurityDsl.g:1498:3: (otherlv_11= 'signature:' otherlv_12= 'secret:' ( (lv_secret_13_0= ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==54) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSecurityDsl.g:1499:4: otherlv_11= 'signature:' otherlv_12= 'secret:' ( (lv_secret_13_0= ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,54,FOLLOW_54); 

                    				newLeafNode(otherlv_11, grammarAccess.getJWTAccess().getSignatureKeyword_10_0());
                    			
                    otherlv_12=(Token)match(input,55,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getJWTAccess().getSecretKeyword_10_1());
                    			
                    // InternalSecurityDsl.g:1507:4: ( (lv_secret_13_0= ruleEString ) )
                    // InternalSecurityDsl.g:1508:5: (lv_secret_13_0= ruleEString )
                    {
                    // InternalSecurityDsl.g:1508:5: (lv_secret_13_0= ruleEString )
                    // InternalSecurityDsl.g:1509:6: lv_secret_13_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getJWTAccess().getSecretEStringParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_secret_13_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJWTRule());
                    						}
                    						set(
                    							current,
                    							"secret",
                    							lv_secret_13_0,
                    							"org.xtext.securitydsl.SecurityDsl.EString");
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
    // $ANTLR end "ruleJWT"


    // $ANTLR start "entryRuleClaim"
    // InternalSecurityDsl.g:1531:1: entryRuleClaim returns [EObject current=null] : iv_ruleClaim= ruleClaim EOF ;
    public final EObject entryRuleClaim() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClaim = null;


        try {
            // InternalSecurityDsl.g:1531:46: (iv_ruleClaim= ruleClaim EOF )
            // InternalSecurityDsl.g:1532:2: iv_ruleClaim= ruleClaim EOF
            {
             newCompositeNode(grammarAccess.getClaimRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClaim=ruleClaim();

            state._fsp--;

             current =iv_ruleClaim; 
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
    // $ANTLR end "entryRuleClaim"


    // $ANTLR start "ruleClaim"
    // InternalSecurityDsl.g:1538:1: ruleClaim returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_type_1_0= ruleEClaimType ) ) otherlv_2= ',' )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleClaim() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:1544:2: ( (otherlv_0= '{' ( ( (lv_type_1_0= ruleEClaimType ) ) otherlv_2= ',' )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalSecurityDsl.g:1545:2: (otherlv_0= '{' ( ( (lv_type_1_0= ruleEClaimType ) ) otherlv_2= ',' )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalSecurityDsl.g:1545:2: (otherlv_0= '{' ( ( (lv_type_1_0= ruleEClaimType ) ) otherlv_2= ',' )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalSecurityDsl.g:1546:3: otherlv_0= '{' ( ( (lv_type_1_0= ruleEClaimType ) ) otherlv_2= ',' )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_55); 

            			newLeafNode(otherlv_0, grammarAccess.getClaimAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalSecurityDsl.g:1550:3: ( ( (lv_type_1_0= ruleEClaimType ) ) otherlv_2= ',' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=85 && LA36_0<=87)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSecurityDsl.g:1551:4: ( (lv_type_1_0= ruleEClaimType ) ) otherlv_2= ','
                    {
                    // InternalSecurityDsl.g:1551:4: ( (lv_type_1_0= ruleEClaimType ) )
                    // InternalSecurityDsl.g:1552:5: (lv_type_1_0= ruleEClaimType )
                    {
                    // InternalSecurityDsl.g:1552:5: (lv_type_1_0= ruleEClaimType )
                    // InternalSecurityDsl.g:1553:6: lv_type_1_0= ruleEClaimType
                    {

                    						newCompositeNode(grammarAccess.getClaimAccess().getTypeEClaimTypeEnumRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_56);
                    lv_type_1_0=ruleEClaimType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClaimRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_1_0,
                    							"org.xtext.securitydsl.SecurityDsl.EClaimType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,40,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getClaimAccess().getCommaKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalSecurityDsl.g:1575:3: ( (lv_name_3_0= ruleEString ) )
            // InternalSecurityDsl.g:1576:4: (lv_name_3_0= ruleEString )
            {
            // InternalSecurityDsl.g:1576:4: (lv_name_3_0= ruleEString )
            // InternalSecurityDsl.g:1577:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClaimAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_57);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClaimRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,56,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getClaimAccess().getColonKeyword_3());
            		
            // InternalSecurityDsl.g:1598:3: ( ( ruleEString ) )
            // InternalSecurityDsl.g:1599:4: ( ruleEString )
            {
            // InternalSecurityDsl.g:1599:4: ( ruleEString )
            // InternalSecurityDsl.g:1600:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClaimRule());
            					}
            				

            					newCompositeNode(grammarAccess.getClaimAccess().getClaim_attributeAttributeCrossReference_4_0());
            				
            pushFollow(FOLLOW_34);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getClaimAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleClaim"


    // $ANTLR start "entryRuleRegisteredClaim"
    // InternalSecurityDsl.g:1622:1: entryRuleRegisteredClaim returns [EObject current=null] : iv_ruleRegisteredClaim= ruleRegisteredClaim EOF ;
    public final EObject entryRuleRegisteredClaim() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegisteredClaim = null;


        try {
            // InternalSecurityDsl.g:1622:56: (iv_ruleRegisteredClaim= ruleRegisteredClaim EOF )
            // InternalSecurityDsl.g:1623:2: iv_ruleRegisteredClaim= ruleRegisteredClaim EOF
            {
             newCompositeNode(grammarAccess.getRegisteredClaimRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegisteredClaim=ruleRegisteredClaim();

            state._fsp--;

             current =iv_ruleRegisteredClaim; 
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
    // $ANTLR end "entryRuleRegisteredClaim"


    // $ANTLR start "ruleRegisteredClaim"
    // InternalSecurityDsl.g:1629:1: ruleRegisteredClaim returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'REGISTERED,' otherlv_2= 'expirationTime:' ( (lv_expirationTime_3_0= ruleEInt ) ) otherlv_4= '}' (otherlv_5= ',' otherlv_6= '{' otherlv_7= 'REGISTERED,' otherlv_8= 'issuer:' ( (lv_issuer_9_0= ruleEString ) ) otherlv_10= '}' )? (otherlv_11= ',' otherlv_12= '{' otherlv_13= 'REGISTERED,' otherlv_14= 'audience:' ( (lv_audience_15_0= ruleEString ) ) otherlv_16= '}' )? ) ;
    public final EObject ruleRegisteredClaim() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_expirationTime_3_0 = null;

        AntlrDatatypeRuleToken lv_issuer_9_0 = null;

        AntlrDatatypeRuleToken lv_audience_15_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:1635:2: ( (otherlv_0= '{' otherlv_1= 'REGISTERED,' otherlv_2= 'expirationTime:' ( (lv_expirationTime_3_0= ruleEInt ) ) otherlv_4= '}' (otherlv_5= ',' otherlv_6= '{' otherlv_7= 'REGISTERED,' otherlv_8= 'issuer:' ( (lv_issuer_9_0= ruleEString ) ) otherlv_10= '}' )? (otherlv_11= ',' otherlv_12= '{' otherlv_13= 'REGISTERED,' otherlv_14= 'audience:' ( (lv_audience_15_0= ruleEString ) ) otherlv_16= '}' )? ) )
            // InternalSecurityDsl.g:1636:2: (otherlv_0= '{' otherlv_1= 'REGISTERED,' otherlv_2= 'expirationTime:' ( (lv_expirationTime_3_0= ruleEInt ) ) otherlv_4= '}' (otherlv_5= ',' otherlv_6= '{' otherlv_7= 'REGISTERED,' otherlv_8= 'issuer:' ( (lv_issuer_9_0= ruleEString ) ) otherlv_10= '}' )? (otherlv_11= ',' otherlv_12= '{' otherlv_13= 'REGISTERED,' otherlv_14= 'audience:' ( (lv_audience_15_0= ruleEString ) ) otherlv_16= '}' )? )
            {
            // InternalSecurityDsl.g:1636:2: (otherlv_0= '{' otherlv_1= 'REGISTERED,' otherlv_2= 'expirationTime:' ( (lv_expirationTime_3_0= ruleEInt ) ) otherlv_4= '}' (otherlv_5= ',' otherlv_6= '{' otherlv_7= 'REGISTERED,' otherlv_8= 'issuer:' ( (lv_issuer_9_0= ruleEString ) ) otherlv_10= '}' )? (otherlv_11= ',' otherlv_12= '{' otherlv_13= 'REGISTERED,' otherlv_14= 'audience:' ( (lv_audience_15_0= ruleEString ) ) otherlv_16= '}' )? )
            // InternalSecurityDsl.g:1637:3: otherlv_0= '{' otherlv_1= 'REGISTERED,' otherlv_2= 'expirationTime:' ( (lv_expirationTime_3_0= ruleEInt ) ) otherlv_4= '}' (otherlv_5= ',' otherlv_6= '{' otherlv_7= 'REGISTERED,' otherlv_8= 'issuer:' ( (lv_issuer_9_0= ruleEString ) ) otherlv_10= '}' )? (otherlv_11= ',' otherlv_12= '{' otherlv_13= 'REGISTERED,' otherlv_14= 'audience:' ( (lv_audience_15_0= ruleEString ) ) otherlv_16= '}' )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_58); 

            			newLeafNode(otherlv_0, grammarAccess.getRegisteredClaimAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,57,FOLLOW_59); 

            			newLeafNode(otherlv_1, grammarAccess.getRegisteredClaimAccess().getREGISTEREDKeyword_1());
            		
            otherlv_2=(Token)match(input,58,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getRegisteredClaimAccess().getExpirationTimeKeyword_2());
            		
            // InternalSecurityDsl.g:1649:3: ( (lv_expirationTime_3_0= ruleEInt ) )
            // InternalSecurityDsl.g:1650:4: (lv_expirationTime_3_0= ruleEInt )
            {
            // InternalSecurityDsl.g:1650:4: (lv_expirationTime_3_0= ruleEInt )
            // InternalSecurityDsl.g:1651:5: lv_expirationTime_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRegisteredClaimAccess().getExpirationTimeEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_34);
            lv_expirationTime_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRegisteredClaimRule());
            					}
            					set(
            						current,
            						"expirationTime",
            						lv_expirationTime_3_0,
            						"org.xtext.securitydsl.SecurityDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,36,FOLLOW_60); 

            			newLeafNode(otherlv_4, grammarAccess.getRegisteredClaimAccess().getRightCurlyBracketKeyword_4());
            		
            // InternalSecurityDsl.g:1672:3: (otherlv_5= ',' otherlv_6= '{' otherlv_7= 'REGISTERED,' otherlv_8= 'issuer:' ( (lv_issuer_9_0= ruleEString ) ) otherlv_10= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==40) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==31) ) {
                    int LA37_3 = input.LA(3);

                    if ( (LA37_3==57) ) {
                        int LA37_4 = input.LA(4);

                        if ( (LA37_4==59) ) {
                            alt37=1;
                        }
                    }
                }
            }
            switch (alt37) {
                case 1 :
                    // InternalSecurityDsl.g:1673:4: otherlv_5= ',' otherlv_6= '{' otherlv_7= 'REGISTERED,' otherlv_8= 'issuer:' ( (lv_issuer_9_0= ruleEString ) ) otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,40,FOLLOW_37); 

                    				newLeafNode(otherlv_5, grammarAccess.getRegisteredClaimAccess().getCommaKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,31,FOLLOW_58); 

                    				newLeafNode(otherlv_6, grammarAccess.getRegisteredClaimAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    otherlv_7=(Token)match(input,57,FOLLOW_61); 

                    				newLeafNode(otherlv_7, grammarAccess.getRegisteredClaimAccess().getREGISTEREDKeyword_5_2());
                    			
                    otherlv_8=(Token)match(input,59,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getRegisteredClaimAccess().getIssuerKeyword_5_3());
                    			
                    // InternalSecurityDsl.g:1689:4: ( (lv_issuer_9_0= ruleEString ) )
                    // InternalSecurityDsl.g:1690:5: (lv_issuer_9_0= ruleEString )
                    {
                    // InternalSecurityDsl.g:1690:5: (lv_issuer_9_0= ruleEString )
                    // InternalSecurityDsl.g:1691:6: lv_issuer_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRegisteredClaimAccess().getIssuerEStringParserRuleCall_5_4_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_issuer_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRegisteredClaimRule());
                    						}
                    						set(
                    							current,
                    							"issuer",
                    							lv_issuer_9_0,
                    							"org.xtext.securitydsl.SecurityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,36,FOLLOW_60); 

                    				newLeafNode(otherlv_10, grammarAccess.getRegisteredClaimAccess().getRightCurlyBracketKeyword_5_5());
                    			

                    }
                    break;

            }

            // InternalSecurityDsl.g:1713:3: (otherlv_11= ',' otherlv_12= '{' otherlv_13= 'REGISTERED,' otherlv_14= 'audience:' ( (lv_audience_15_0= ruleEString ) ) otherlv_16= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==40) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==31) ) {
                    int LA38_3 = input.LA(3);

                    if ( (LA38_3==57) ) {
                        alt38=1;
                    }
                }
            }
            switch (alt38) {
                case 1 :
                    // InternalSecurityDsl.g:1714:4: otherlv_11= ',' otherlv_12= '{' otherlv_13= 'REGISTERED,' otherlv_14= 'audience:' ( (lv_audience_15_0= ruleEString ) ) otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,40,FOLLOW_37); 

                    				newLeafNode(otherlv_11, grammarAccess.getRegisteredClaimAccess().getCommaKeyword_6_0());
                    			
                    otherlv_12=(Token)match(input,31,FOLLOW_58); 

                    				newLeafNode(otherlv_12, grammarAccess.getRegisteredClaimAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    otherlv_13=(Token)match(input,57,FOLLOW_62); 

                    				newLeafNode(otherlv_13, grammarAccess.getRegisteredClaimAccess().getREGISTEREDKeyword_6_2());
                    			
                    otherlv_14=(Token)match(input,60,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getRegisteredClaimAccess().getAudienceKeyword_6_3());
                    			
                    // InternalSecurityDsl.g:1730:4: ( (lv_audience_15_0= ruleEString ) )
                    // InternalSecurityDsl.g:1731:5: (lv_audience_15_0= ruleEString )
                    {
                    // InternalSecurityDsl.g:1731:5: (lv_audience_15_0= ruleEString )
                    // InternalSecurityDsl.g:1732:6: lv_audience_15_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRegisteredClaimAccess().getAudienceEStringParserRuleCall_6_4_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_audience_15_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRegisteredClaimRule());
                    						}
                    						set(
                    							current,
                    							"audience",
                    							lv_audience_15_0,
                    							"org.xtext.securitydsl.SecurityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_16, grammarAccess.getRegisteredClaimAccess().getRightCurlyBracketKeyword_6_5());
                    			

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
    // $ANTLR end "ruleRegisteredClaim"


    // $ANTLR start "entryRuleOAuth2"
    // InternalSecurityDsl.g:1758:1: entryRuleOAuth2 returns [EObject current=null] : iv_ruleOAuth2= ruleOAuth2 EOF ;
    public final EObject entryRuleOAuth2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOAuth2 = null;


        try {
            // InternalSecurityDsl.g:1758:47: (iv_ruleOAuth2= ruleOAuth2 EOF )
            // InternalSecurityDsl.g:1759:2: iv_ruleOAuth2= ruleOAuth2 EOF
            {
             newCompositeNode(grammarAccess.getOAuth2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOAuth2=ruleOAuth2();

            state._fsp--;

             current =iv_ruleOAuth2; 
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
    // $ANTLR end "entryRuleOAuth2"


    // $ANTLR start "ruleOAuth2"
    // InternalSecurityDsl.g:1765:1: ruleOAuth2 returns [EObject current=null] : (otherlv_0= 'OAuth2.0:' otherlv_1= 'providers:' otherlv_2= '[' ( (lv_providers_3_0= ruleProvider ) ) (otherlv_4= ',' ( (lv_providers_5_0= ruleProvider ) ) )* otherlv_6= ']' ) ;
    public final EObject ruleOAuth2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_providers_3_0 = null;

        EObject lv_providers_5_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:1771:2: ( (otherlv_0= 'OAuth2.0:' otherlv_1= 'providers:' otherlv_2= '[' ( (lv_providers_3_0= ruleProvider ) ) (otherlv_4= ',' ( (lv_providers_5_0= ruleProvider ) ) )* otherlv_6= ']' ) )
            // InternalSecurityDsl.g:1772:2: (otherlv_0= 'OAuth2.0:' otherlv_1= 'providers:' otherlv_2= '[' ( (lv_providers_3_0= ruleProvider ) ) (otherlv_4= ',' ( (lv_providers_5_0= ruleProvider ) ) )* otherlv_6= ']' )
            {
            // InternalSecurityDsl.g:1772:2: (otherlv_0= 'OAuth2.0:' otherlv_1= 'providers:' otherlv_2= '[' ( (lv_providers_3_0= ruleProvider ) ) (otherlv_4= ',' ( (lv_providers_5_0= ruleProvider ) ) )* otherlv_6= ']' )
            // InternalSecurityDsl.g:1773:3: otherlv_0= 'OAuth2.0:' otherlv_1= 'providers:' otherlv_2= '[' ( (lv_providers_3_0= ruleProvider ) ) (otherlv_4= ',' ( (lv_providers_5_0= ruleProvider ) ) )* otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_63); 

            			newLeafNode(otherlv_0, grammarAccess.getOAuth2Access().getOAuth20Keyword_0());
            		
            otherlv_1=(Token)match(input,62,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getOAuth2Access().getProvidersKeyword_1());
            		
            otherlv_2=(Token)match(input,39,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getOAuth2Access().getLeftSquareBracketKeyword_2());
            		
            // InternalSecurityDsl.g:1785:3: ( (lv_providers_3_0= ruleProvider ) )
            // InternalSecurityDsl.g:1786:4: (lv_providers_3_0= ruleProvider )
            {
            // InternalSecurityDsl.g:1786:4: (lv_providers_3_0= ruleProvider )
            // InternalSecurityDsl.g:1787:5: lv_providers_3_0= ruleProvider
            {

            					newCompositeNode(grammarAccess.getOAuth2Access().getProvidersProviderParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_38);
            lv_providers_3_0=ruleProvider();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOAuth2Rule());
            					}
            					add(
            						current,
            						"providers",
            						lv_providers_3_0,
            						"org.xtext.securitydsl.SecurityDsl.Provider");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecurityDsl.g:1804:3: (otherlv_4= ',' ( (lv_providers_5_0= ruleProvider ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==40) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalSecurityDsl.g:1805:4: otherlv_4= ',' ( (lv_providers_5_0= ruleProvider ) )
            	    {
            	    otherlv_4=(Token)match(input,40,FOLLOW_37); 

            	    				newLeafNode(otherlv_4, grammarAccess.getOAuth2Access().getCommaKeyword_4_0());
            	    			
            	    // InternalSecurityDsl.g:1809:4: ( (lv_providers_5_0= ruleProvider ) )
            	    // InternalSecurityDsl.g:1810:5: (lv_providers_5_0= ruleProvider )
            	    {
            	    // InternalSecurityDsl.g:1810:5: (lv_providers_5_0= ruleProvider )
            	    // InternalSecurityDsl.g:1811:6: lv_providers_5_0= ruleProvider
            	    {

            	    						newCompositeNode(grammarAccess.getOAuth2Access().getProvidersProviderParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_38);
            	    lv_providers_5_0=ruleProvider();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOAuth2Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"providers",
            	    							lv_providers_5_0,
            	    							"org.xtext.securitydsl.SecurityDsl.Provider");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            otherlv_6=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getOAuth2Access().getRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleOAuth2"


    // $ANTLR start "entryRuleProvider"
    // InternalSecurityDsl.g:1837:1: entryRuleProvider returns [EObject current=null] : iv_ruleProvider= ruleProvider EOF ;
    public final EObject entryRuleProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvider = null;


        try {
            // InternalSecurityDsl.g:1837:49: (iv_ruleProvider= ruleProvider EOF )
            // InternalSecurityDsl.g:1838:2: iv_ruleProvider= ruleProvider EOF
            {
             newCompositeNode(grammarAccess.getProviderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProvider=ruleProvider();

            state._fsp--;

             current =iv_ruleProvider; 
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
    // $ANTLR end "entryRuleProvider"


    // $ANTLR start "ruleProvider"
    // InternalSecurityDsl.g:1844:1: ruleProvider returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'name:' ( (lv_name_2_0= ruleEOAuthProvider ) ) otherlv_3= ',' otherlv_4= 'clientId:' ( (lv_clientId_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'clientSecret:' ( (lv_clientSecret_8_0= ruleEString ) ) (otherlv_9= ',' otherlv_10= 'redirectUri:' ( (lv_redirectUri_11_0= ruleEString ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleProvider() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Enumerator lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_clientId_5_0 = null;

        AntlrDatatypeRuleToken lv_clientSecret_8_0 = null;

        AntlrDatatypeRuleToken lv_redirectUri_11_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:1850:2: ( (otherlv_0= '{' otherlv_1= 'name:' ( (lv_name_2_0= ruleEOAuthProvider ) ) otherlv_3= ',' otherlv_4= 'clientId:' ( (lv_clientId_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'clientSecret:' ( (lv_clientSecret_8_0= ruleEString ) ) (otherlv_9= ',' otherlv_10= 'redirectUri:' ( (lv_redirectUri_11_0= ruleEString ) ) )? otherlv_12= '}' ) )
            // InternalSecurityDsl.g:1851:2: (otherlv_0= '{' otherlv_1= 'name:' ( (lv_name_2_0= ruleEOAuthProvider ) ) otherlv_3= ',' otherlv_4= 'clientId:' ( (lv_clientId_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'clientSecret:' ( (lv_clientSecret_8_0= ruleEString ) ) (otherlv_9= ',' otherlv_10= 'redirectUri:' ( (lv_redirectUri_11_0= ruleEString ) ) )? otherlv_12= '}' )
            {
            // InternalSecurityDsl.g:1851:2: (otherlv_0= '{' otherlv_1= 'name:' ( (lv_name_2_0= ruleEOAuthProvider ) ) otherlv_3= ',' otherlv_4= 'clientId:' ( (lv_clientId_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'clientSecret:' ( (lv_clientSecret_8_0= ruleEString ) ) (otherlv_9= ',' otherlv_10= 'redirectUri:' ( (lv_redirectUri_11_0= ruleEString ) ) )? otherlv_12= '}' )
            // InternalSecurityDsl.g:1852:3: otherlv_0= '{' otherlv_1= 'name:' ( (lv_name_2_0= ruleEOAuthProvider ) ) otherlv_3= ',' otherlv_4= 'clientId:' ( (lv_clientId_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'clientSecret:' ( (lv_clientSecret_8_0= ruleEString ) ) (otherlv_9= ',' otherlv_10= 'redirectUri:' ( (lv_redirectUri_11_0= ruleEString ) ) )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getProviderAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_64); 

            			newLeafNode(otherlv_1, grammarAccess.getProviderAccess().getNameKeyword_1());
            		
            // InternalSecurityDsl.g:1860:3: ( (lv_name_2_0= ruleEOAuthProvider ) )
            // InternalSecurityDsl.g:1861:4: (lv_name_2_0= ruleEOAuthProvider )
            {
            // InternalSecurityDsl.g:1861:4: (lv_name_2_0= ruleEOAuthProvider )
            // InternalSecurityDsl.g:1862:5: lv_name_2_0= ruleEOAuthProvider
            {

            					newCompositeNode(grammarAccess.getProviderAccess().getNameEOAuthProviderEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_56);
            lv_name_2_0=ruleEOAuthProvider();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProviderRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.securitydsl.SecurityDsl.EOAuthProvider");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,40,FOLLOW_65); 

            			newLeafNode(otherlv_3, grammarAccess.getProviderAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,63,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getProviderAccess().getClientIdKeyword_4());
            		
            // InternalSecurityDsl.g:1887:3: ( (lv_clientId_5_0= ruleEString ) )
            // InternalSecurityDsl.g:1888:4: (lv_clientId_5_0= ruleEString )
            {
            // InternalSecurityDsl.g:1888:4: (lv_clientId_5_0= ruleEString )
            // InternalSecurityDsl.g:1889:5: lv_clientId_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProviderAccess().getClientIdEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_56);
            lv_clientId_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProviderRule());
            					}
            					set(
            						current,
            						"clientId",
            						lv_clientId_5_0,
            						"org.xtext.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,40,FOLLOW_66); 

            			newLeafNode(otherlv_6, grammarAccess.getProviderAccess().getCommaKeyword_6());
            		
            otherlv_7=(Token)match(input,64,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getProviderAccess().getClientSecretKeyword_7());
            		
            // InternalSecurityDsl.g:1914:3: ( (lv_clientSecret_8_0= ruleEString ) )
            // InternalSecurityDsl.g:1915:4: (lv_clientSecret_8_0= ruleEString )
            {
            // InternalSecurityDsl.g:1915:4: (lv_clientSecret_8_0= ruleEString )
            // InternalSecurityDsl.g:1916:5: lv_clientSecret_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProviderAccess().getClientSecretEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_67);
            lv_clientSecret_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProviderRule());
            					}
            					set(
            						current,
            						"clientSecret",
            						lv_clientSecret_8_0,
            						"org.xtext.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecurityDsl.g:1933:3: (otherlv_9= ',' otherlv_10= 'redirectUri:' ( (lv_redirectUri_11_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==40) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSecurityDsl.g:1934:4: otherlv_9= ',' otherlv_10= 'redirectUri:' ( (lv_redirectUri_11_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,40,FOLLOW_68); 

                    				newLeafNode(otherlv_9, grammarAccess.getProviderAccess().getCommaKeyword_9_0());
                    			
                    otherlv_10=(Token)match(input,65,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getProviderAccess().getRedirectUriKeyword_9_1());
                    			
                    // InternalSecurityDsl.g:1942:4: ( (lv_redirectUri_11_0= ruleEString ) )
                    // InternalSecurityDsl.g:1943:5: (lv_redirectUri_11_0= ruleEString )
                    {
                    // InternalSecurityDsl.g:1943:5: (lv_redirectUri_11_0= ruleEString )
                    // InternalSecurityDsl.g:1944:6: lv_redirectUri_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getProviderAccess().getRedirectUriEStringParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_redirectUri_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProviderRule());
                    						}
                    						set(
                    							current,
                    							"redirectUri",
                    							lv_redirectUri_11_0,
                    							"org.xtext.securitydsl.SecurityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getProviderAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleProvider"


    // $ANTLR start "entryRuleBasicAuthentication"
    // InternalSecurityDsl.g:1970:1: entryRuleBasicAuthentication returns [EObject current=null] : iv_ruleBasicAuthentication= ruleBasicAuthentication EOF ;
    public final EObject entryRuleBasicAuthentication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicAuthentication = null;


        try {
            // InternalSecurityDsl.g:1970:60: (iv_ruleBasicAuthentication= ruleBasicAuthentication EOF )
            // InternalSecurityDsl.g:1971:2: iv_ruleBasicAuthentication= ruleBasicAuthentication EOF
            {
             newCompositeNode(grammarAccess.getBasicAuthenticationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicAuthentication=ruleBasicAuthentication();

            state._fsp--;

             current =iv_ruleBasicAuthentication; 
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
    // $ANTLR end "entryRuleBasicAuthentication"


    // $ANTLR start "ruleBasicAuthentication"
    // InternalSecurityDsl.g:1977:1: ruleBasicAuthentication returns [EObject current=null] : ( () otherlv_1= 'basicAuthentication' ) ;
    public final EObject ruleBasicAuthentication() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSecurityDsl.g:1983:2: ( ( () otherlv_1= 'basicAuthentication' ) )
            // InternalSecurityDsl.g:1984:2: ( () otherlv_1= 'basicAuthentication' )
            {
            // InternalSecurityDsl.g:1984:2: ( () otherlv_1= 'basicAuthentication' )
            // InternalSecurityDsl.g:1985:3: () otherlv_1= 'basicAuthentication'
            {
            // InternalSecurityDsl.g:1985:3: ()
            // InternalSecurityDsl.g:1986:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBasicAuthenticationAccess().getBasicAuthenticationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,66,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBasicAuthenticationAccess().getBasicAuthenticationKeyword_1());
            		

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
    // $ANTLR end "ruleBasicAuthentication"


    // $ANTLR start "entryRuleEInt"
    // InternalSecurityDsl.g:2000:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSecurityDsl.g:2000:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSecurityDsl.g:2001:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalSecurityDsl.g:2007:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSecurityDsl.g:2013:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSecurityDsl.g:2014:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSecurityDsl.g:2014:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSecurityDsl.g:2015:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSecurityDsl.g:2015:3: (kw= '-' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==30) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSecurityDsl.g:2016:4: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_28); 

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


    // $ANTLR start "ruleEDatabaseType"
    // InternalSecurityDsl.g:2033:1: ruleEDatabaseType returns [Enumerator current=null] : ( (enumLiteral_0= 'PostgreSQL' ) | (enumLiteral_1= 'Oracle' ) | (enumLiteral_2= 'MySQL' ) ) ;
    public final Enumerator ruleEDatabaseType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSecurityDsl.g:2039:2: ( ( (enumLiteral_0= 'PostgreSQL' ) | (enumLiteral_1= 'Oracle' ) | (enumLiteral_2= 'MySQL' ) ) )
            // InternalSecurityDsl.g:2040:2: ( (enumLiteral_0= 'PostgreSQL' ) | (enumLiteral_1= 'Oracle' ) | (enumLiteral_2= 'MySQL' ) )
            {
            // InternalSecurityDsl.g:2040:2: ( (enumLiteral_0= 'PostgreSQL' ) | (enumLiteral_1= 'Oracle' ) | (enumLiteral_2= 'MySQL' ) )
            int alt42=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt42=1;
                }
                break;
            case 68:
                {
                alt42=2;
                }
                break;
            case 69:
                {
                alt42=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalSecurityDsl.g:2041:3: (enumLiteral_0= 'PostgreSQL' )
                    {
                    // InternalSecurityDsl.g:2041:3: (enumLiteral_0= 'PostgreSQL' )
                    // InternalSecurityDsl.g:2042:4: enumLiteral_0= 'PostgreSQL'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getEDatabaseTypeAccess().getPostgreSQLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEDatabaseTypeAccess().getPostgreSQLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:2049:3: (enumLiteral_1= 'Oracle' )
                    {
                    // InternalSecurityDsl.g:2049:3: (enumLiteral_1= 'Oracle' )
                    // InternalSecurityDsl.g:2050:4: enumLiteral_1= 'Oracle'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getEDatabaseTypeAccess().getOracleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEDatabaseTypeAccess().getOracleEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:2057:3: (enumLiteral_2= 'MySQL' )
                    {
                    // InternalSecurityDsl.g:2057:3: (enumLiteral_2= 'MySQL' )
                    // InternalSecurityDsl.g:2058:4: enumLiteral_2= 'MySQL'
                    {
                    enumLiteral_2=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getEDatabaseTypeAccess().getMySQLEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEDatabaseTypeAccess().getMySQLEnumLiteralDeclaration_2());
                    			

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


    // $ANTLR start "ruleEType"
    // InternalSecurityDsl.g:2068:1: ruleEType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Float' ) | (enumLiteral_2= 'Long' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'Double' ) | (enumLiteral_5= 'DateTime' ) | (enumLiteral_6= 'Date' ) ) ;
    public final Enumerator ruleEType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalSecurityDsl.g:2074:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Float' ) | (enumLiteral_2= 'Long' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'Double' ) | (enumLiteral_5= 'DateTime' ) | (enumLiteral_6= 'Date' ) ) )
            // InternalSecurityDsl.g:2075:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Float' ) | (enumLiteral_2= 'Long' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'Double' ) | (enumLiteral_5= 'DateTime' ) | (enumLiteral_6= 'Date' ) )
            {
            // InternalSecurityDsl.g:2075:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Float' ) | (enumLiteral_2= 'Long' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'Double' ) | (enumLiteral_5= 'DateTime' ) | (enumLiteral_6= 'Date' ) )
            int alt43=7;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt43=1;
                }
                break;
            case 71:
                {
                alt43=2;
                }
                break;
            case 72:
                {
                alt43=3;
                }
                break;
            case 73:
                {
                alt43=4;
                }
                break;
            case 74:
                {
                alt43=5;
                }
                break;
            case 75:
                {
                alt43=6;
                }
                break;
            case 76:
                {
                alt43=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalSecurityDsl.g:2076:3: (enumLiteral_0= 'String' )
                    {
                    // InternalSecurityDsl.g:2076:3: (enumLiteral_0= 'String' )
                    // InternalSecurityDsl.g:2077:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getETypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:2084:3: (enumLiteral_1= 'Float' )
                    {
                    // InternalSecurityDsl.g:2084:3: (enumLiteral_1= 'Float' )
                    // InternalSecurityDsl.g:2085:4: enumLiteral_1= 'Float'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getFloatEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getETypeAccess().getFloatEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:2092:3: (enumLiteral_2= 'Long' )
                    {
                    // InternalSecurityDsl.g:2092:3: (enumLiteral_2= 'Long' )
                    // InternalSecurityDsl.g:2093:4: enumLiteral_2= 'Long'
                    {
                    enumLiteral_2=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getLongEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getETypeAccess().getLongEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:2100:3: (enumLiteral_3= 'Integer' )
                    {
                    // InternalSecurityDsl.g:2100:3: (enumLiteral_3= 'Integer' )
                    // InternalSecurityDsl.g:2101:4: enumLiteral_3= 'Integer'
                    {
                    enumLiteral_3=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getIntegerEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getETypeAccess().getIntegerEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSecurityDsl.g:2108:3: (enumLiteral_4= 'Double' )
                    {
                    // InternalSecurityDsl.g:2108:3: (enumLiteral_4= 'Double' )
                    // InternalSecurityDsl.g:2109:4: enumLiteral_4= 'Double'
                    {
                    enumLiteral_4=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getDoubleEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getETypeAccess().getDoubleEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSecurityDsl.g:2116:3: (enumLiteral_5= 'DateTime' )
                    {
                    // InternalSecurityDsl.g:2116:3: (enumLiteral_5= 'DateTime' )
                    // InternalSecurityDsl.g:2117:4: enumLiteral_5= 'DateTime'
                    {
                    enumLiteral_5=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getDateTimeEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getETypeAccess().getDateTimeEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSecurityDsl.g:2124:3: (enumLiteral_6= 'Date' )
                    {
                    // InternalSecurityDsl.g:2124:3: (enumLiteral_6= 'Date' )
                    // InternalSecurityDsl.g:2125:4: enumLiteral_6= 'Date'
                    {
                    enumLiteral_6=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getDateEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getETypeAccess().getDateEnumLiteralDeclaration_6());
                    			

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
    // InternalSecurityDsl.g:2135:1: ruleEEndpointMethod returns [Enumerator current=null] : ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) ;
    public final Enumerator ruleEEndpointMethod() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSecurityDsl.g:2141:2: ( ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) )
            // InternalSecurityDsl.g:2142:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            {
            // InternalSecurityDsl.g:2142:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            int alt44=4;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt44=1;
                }
                break;
            case 78:
                {
                alt44=2;
                }
                break;
            case 79:
                {
                alt44=3;
                }
                break;
            case 80:
                {
                alt44=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalSecurityDsl.g:2143:3: (enumLiteral_0= 'GET' )
                    {
                    // InternalSecurityDsl.g:2143:3: (enumLiteral_0= 'GET' )
                    // InternalSecurityDsl.g:2144:4: enumLiteral_0= 'GET'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getEEndpointMethodAccess().getGETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEEndpointMethodAccess().getGETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:2151:3: (enumLiteral_1= 'POST' )
                    {
                    // InternalSecurityDsl.g:2151:3: (enumLiteral_1= 'POST' )
                    // InternalSecurityDsl.g:2152:4: enumLiteral_1= 'POST'
                    {
                    enumLiteral_1=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getEEndpointMethodAccess().getPOSTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEEndpointMethodAccess().getPOSTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:2159:3: (enumLiteral_2= 'PUT' )
                    {
                    // InternalSecurityDsl.g:2159:3: (enumLiteral_2= 'PUT' )
                    // InternalSecurityDsl.g:2160:4: enumLiteral_2= 'PUT'
                    {
                    enumLiteral_2=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getEEndpointMethodAccess().getPUTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEEndpointMethodAccess().getPUTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:2167:3: (enumLiteral_3= 'DELETE' )
                    {
                    // InternalSecurityDsl.g:2167:3: (enumLiteral_3= 'DELETE' )
                    // InternalSecurityDsl.g:2168:4: enumLiteral_3= 'DELETE'
                    {
                    enumLiteral_3=(Token)match(input,80,FOLLOW_2); 

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


    // $ANTLR start "ruleEEndpointType"
    // InternalSecurityDsl.g:2178:1: ruleEEndpointType returns [Enumerator current=null] : ( (enumLiteral_0= 'REGISTRATION' ) | (enumLiteral_1= 'LOGIN' ) | (enumLiteral_2= 'LOGOUT' ) | (enumLiteral_3= 'OTHER' ) ) ;
    public final Enumerator ruleEEndpointType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSecurityDsl.g:2184:2: ( ( (enumLiteral_0= 'REGISTRATION' ) | (enumLiteral_1= 'LOGIN' ) | (enumLiteral_2= 'LOGOUT' ) | (enumLiteral_3= 'OTHER' ) ) )
            // InternalSecurityDsl.g:2185:2: ( (enumLiteral_0= 'REGISTRATION' ) | (enumLiteral_1= 'LOGIN' ) | (enumLiteral_2= 'LOGOUT' ) | (enumLiteral_3= 'OTHER' ) )
            {
            // InternalSecurityDsl.g:2185:2: ( (enumLiteral_0= 'REGISTRATION' ) | (enumLiteral_1= 'LOGIN' ) | (enumLiteral_2= 'LOGOUT' ) | (enumLiteral_3= 'OTHER' ) )
            int alt45=4;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt45=1;
                }
                break;
            case 82:
                {
                alt45=2;
                }
                break;
            case 83:
                {
                alt45=3;
                }
                break;
            case 84:
                {
                alt45=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalSecurityDsl.g:2186:3: (enumLiteral_0= 'REGISTRATION' )
                    {
                    // InternalSecurityDsl.g:2186:3: (enumLiteral_0= 'REGISTRATION' )
                    // InternalSecurityDsl.g:2187:4: enumLiteral_0= 'REGISTRATION'
                    {
                    enumLiteral_0=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getEEndpointTypeAccess().getREGISTRATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEEndpointTypeAccess().getREGISTRATIONEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:2194:3: (enumLiteral_1= 'LOGIN' )
                    {
                    // InternalSecurityDsl.g:2194:3: (enumLiteral_1= 'LOGIN' )
                    // InternalSecurityDsl.g:2195:4: enumLiteral_1= 'LOGIN'
                    {
                    enumLiteral_1=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getEEndpointTypeAccess().getLOGINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEEndpointTypeAccess().getLOGINEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:2202:3: (enumLiteral_2= 'LOGOUT' )
                    {
                    // InternalSecurityDsl.g:2202:3: (enumLiteral_2= 'LOGOUT' )
                    // InternalSecurityDsl.g:2203:4: enumLiteral_2= 'LOGOUT'
                    {
                    enumLiteral_2=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getEEndpointTypeAccess().getLOGOUTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEEndpointTypeAccess().getLOGOUTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:2210:3: (enumLiteral_3= 'OTHER' )
                    {
                    // InternalSecurityDsl.g:2210:3: (enumLiteral_3= 'OTHER' )
                    // InternalSecurityDsl.g:2211:4: enumLiteral_3= 'OTHER'
                    {
                    enumLiteral_3=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getEEndpointTypeAccess().getOTHEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEEndpointTypeAccess().getOTHEREnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleEEndpointType"


    // $ANTLR start "ruleEClaimType"
    // InternalSecurityDsl.g:2221:1: ruleEClaimType returns [Enumerator current=null] : ( (enumLiteral_0= 'PRIVATE' ) | (enumLiteral_1= 'PUBLIC' ) | (enumLiteral_2= 'REGISTERED' ) ) ;
    public final Enumerator ruleEClaimType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSecurityDsl.g:2227:2: ( ( (enumLiteral_0= 'PRIVATE' ) | (enumLiteral_1= 'PUBLIC' ) | (enumLiteral_2= 'REGISTERED' ) ) )
            // InternalSecurityDsl.g:2228:2: ( (enumLiteral_0= 'PRIVATE' ) | (enumLiteral_1= 'PUBLIC' ) | (enumLiteral_2= 'REGISTERED' ) )
            {
            // InternalSecurityDsl.g:2228:2: ( (enumLiteral_0= 'PRIVATE' ) | (enumLiteral_1= 'PUBLIC' ) | (enumLiteral_2= 'REGISTERED' ) )
            int alt46=3;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt46=1;
                }
                break;
            case 86:
                {
                alt46=2;
                }
                break;
            case 87:
                {
                alt46=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalSecurityDsl.g:2229:3: (enumLiteral_0= 'PRIVATE' )
                    {
                    // InternalSecurityDsl.g:2229:3: (enumLiteral_0= 'PRIVATE' )
                    // InternalSecurityDsl.g:2230:4: enumLiteral_0= 'PRIVATE'
                    {
                    enumLiteral_0=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getEClaimTypeAccess().getPRIVATEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEClaimTypeAccess().getPRIVATEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:2237:3: (enumLiteral_1= 'PUBLIC' )
                    {
                    // InternalSecurityDsl.g:2237:3: (enumLiteral_1= 'PUBLIC' )
                    // InternalSecurityDsl.g:2238:4: enumLiteral_1= 'PUBLIC'
                    {
                    enumLiteral_1=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getEClaimTypeAccess().getPUBLICEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEClaimTypeAccess().getPUBLICEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:2245:3: (enumLiteral_2= 'REGISTERED' )
                    {
                    // InternalSecurityDsl.g:2245:3: (enumLiteral_2= 'REGISTERED' )
                    // InternalSecurityDsl.g:2246:4: enumLiteral_2= 'REGISTERED'
                    {
                    enumLiteral_2=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getEClaimTypeAccess().getREGISTEREDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEClaimTypeAccess().getREGISTEREDEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleEClaimType"


    // $ANTLR start "ruleEOAuthProvider"
    // InternalSecurityDsl.g:2256:1: ruleEOAuthProvider returns [Enumerator current=null] : ( (enumLiteral_0= 'GOOGLE' ) | (enumLiteral_1= 'GITHUB' ) | (enumLiteral_2= 'FACEBOOK' ) | (enumLiteral_3= 'MICROSOFT_AZURE' ) | (enumLiteral_4= 'LINKEDIN' ) | (enumLiteral_5= 'TWITTER' ) | (enumLiteral_6= 'INSTAGRAM' ) ) ;
    public final Enumerator ruleEOAuthProvider() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalSecurityDsl.g:2262:2: ( ( (enumLiteral_0= 'GOOGLE' ) | (enumLiteral_1= 'GITHUB' ) | (enumLiteral_2= 'FACEBOOK' ) | (enumLiteral_3= 'MICROSOFT_AZURE' ) | (enumLiteral_4= 'LINKEDIN' ) | (enumLiteral_5= 'TWITTER' ) | (enumLiteral_6= 'INSTAGRAM' ) ) )
            // InternalSecurityDsl.g:2263:2: ( (enumLiteral_0= 'GOOGLE' ) | (enumLiteral_1= 'GITHUB' ) | (enumLiteral_2= 'FACEBOOK' ) | (enumLiteral_3= 'MICROSOFT_AZURE' ) | (enumLiteral_4= 'LINKEDIN' ) | (enumLiteral_5= 'TWITTER' ) | (enumLiteral_6= 'INSTAGRAM' ) )
            {
            // InternalSecurityDsl.g:2263:2: ( (enumLiteral_0= 'GOOGLE' ) | (enumLiteral_1= 'GITHUB' ) | (enumLiteral_2= 'FACEBOOK' ) | (enumLiteral_3= 'MICROSOFT_AZURE' ) | (enumLiteral_4= 'LINKEDIN' ) | (enumLiteral_5= 'TWITTER' ) | (enumLiteral_6= 'INSTAGRAM' ) )
            int alt47=7;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt47=1;
                }
                break;
            case 89:
                {
                alt47=2;
                }
                break;
            case 90:
                {
                alt47=3;
                }
                break;
            case 91:
                {
                alt47=4;
                }
                break;
            case 92:
                {
                alt47=5;
                }
                break;
            case 93:
                {
                alt47=6;
                }
                break;
            case 94:
                {
                alt47=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalSecurityDsl.g:2264:3: (enumLiteral_0= 'GOOGLE' )
                    {
                    // InternalSecurityDsl.g:2264:3: (enumLiteral_0= 'GOOGLE' )
                    // InternalSecurityDsl.g:2265:4: enumLiteral_0= 'GOOGLE'
                    {
                    enumLiteral_0=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getEOAuthProviderAccess().getGOOGLEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEOAuthProviderAccess().getGOOGLEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:2272:3: (enumLiteral_1= 'GITHUB' )
                    {
                    // InternalSecurityDsl.g:2272:3: (enumLiteral_1= 'GITHUB' )
                    // InternalSecurityDsl.g:2273:4: enumLiteral_1= 'GITHUB'
                    {
                    enumLiteral_1=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getEOAuthProviderAccess().getGITHUBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEOAuthProviderAccess().getGITHUBEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:2280:3: (enumLiteral_2= 'FACEBOOK' )
                    {
                    // InternalSecurityDsl.g:2280:3: (enumLiteral_2= 'FACEBOOK' )
                    // InternalSecurityDsl.g:2281:4: enumLiteral_2= 'FACEBOOK'
                    {
                    enumLiteral_2=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getEOAuthProviderAccess().getFACEBOOKEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEOAuthProviderAccess().getFACEBOOKEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:2288:3: (enumLiteral_3= 'MICROSOFT_AZURE' )
                    {
                    // InternalSecurityDsl.g:2288:3: (enumLiteral_3= 'MICROSOFT_AZURE' )
                    // InternalSecurityDsl.g:2289:4: enumLiteral_3= 'MICROSOFT_AZURE'
                    {
                    enumLiteral_3=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getEOAuthProviderAccess().getAZUREEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEOAuthProviderAccess().getAZUREEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSecurityDsl.g:2296:3: (enumLiteral_4= 'LINKEDIN' )
                    {
                    // InternalSecurityDsl.g:2296:3: (enumLiteral_4= 'LINKEDIN' )
                    // InternalSecurityDsl.g:2297:4: enumLiteral_4= 'LINKEDIN'
                    {
                    enumLiteral_4=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getEOAuthProviderAccess().getLINKEDINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getEOAuthProviderAccess().getLINKEDINEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSecurityDsl.g:2304:3: (enumLiteral_5= 'TWITTER' )
                    {
                    // InternalSecurityDsl.g:2304:3: (enumLiteral_5= 'TWITTER' )
                    // InternalSecurityDsl.g:2305:4: enumLiteral_5= 'TWITTER'
                    {
                    enumLiteral_5=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getEOAuthProviderAccess().getTWITTEREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getEOAuthProviderAccess().getTWITTEREnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSecurityDsl.g:2312:3: (enumLiteral_6= 'INSTAGRAM' )
                    {
                    // InternalSecurityDsl.g:2312:3: (enumLiteral_6= 'INSTAGRAM' )
                    // InternalSecurityDsl.g:2313:4: enumLiteral_6= 'INSTAGRAM'
                    {
                    enumLiteral_6=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getEOAuthProviderAccess().getINSTAGRAMEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getEOAuthProviderAccess().getINSTAGRAMEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleEOAuthProvider"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000019F8002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000019F0002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000019E0002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000019C0002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001980002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001900002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001E00002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000006001C00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000046001800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x2002000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000300002000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001FC0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000044000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000030L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x00000000001E0000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000701000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000601000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x000000000001E000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000401000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000030L,0x0000000000E00000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x000000007F000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000011000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});

}