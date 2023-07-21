package rs.ac.uns.ftn.securitydsl.parser.antlr.internal;

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
import rs.ac.uns.ftn.securitydsl.services.SecurityDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSecurityDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Application'", "'{'", "'description'", "'group'", "'artifact'", "'packageName'", "'port'", "'hostname'", "'app_database'", "'app_models'", "','", "'}'", "'app_controllers'", "'app_security'", "'Database'", "'vendorName'", "'url'", "'username'", "'password'", "'-'", "'isIdentifier'", "'Attribute'", "'type'", "'collumnName'", "'Role'", "'tableName'", "'model_attributes'", "'role_instances'", "'User'", "'RoleInstance'", "'Endpoint'", "'functionName'", "'method'", "'role_authorities'", "'('", "')'", "'Authentication'", "'path'", "'controller_endpoints'", "'JWT'", "'signatureAlgorithm'", "'secret'", "'jwt_claims'", "'registeredclaims'", "'Claim'", "'claim_attribute'", "'RegisteredClaims'", "'expirationTime'", "'issuer'", "'audience'", "'PostgreSQL'", "'Oracle'", "'MySQL'", "'String'", "'Float'", "'Long'", "'Integer'", "'char'", "'Double'", "'DateTime'", "'Date'", "'int'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'REGISTRATION'", "'LOGIN'", "'LOGOUT'", "'OTHER'", "'PRIVATE'", "'PUBLIC'", "'REGISTERED'"
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
    // InternalSecurityDsl.g:72:1: ruleApplication returns [EObject current=null] : ( () otherlv_1= 'Application' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'group' ( (lv_group_7_0= ruleEString ) ) )? (otherlv_8= 'artifact' ( (lv_artifact_9_0= ruleEString ) ) )? (otherlv_10= 'packageName' ( (lv_packageName_11_0= ruleEString ) ) )? (otherlv_12= 'port' ( (lv_port_13_0= ruleELongObject ) ) )? (otherlv_14= 'hostname' ( (lv_hostname_15_0= ruleEString ) ) )? (otherlv_16= 'app_database' ( (lv_app_database_17_0= ruleDatabase ) ) )? (otherlv_18= 'app_models' otherlv_19= '{' ( (lv_app_models_20_0= ruleModel ) ) (otherlv_21= ',' ( (lv_app_models_22_0= ruleModel ) ) )* otherlv_23= '}' )? (otherlv_24= 'app_controllers' otherlv_25= '{' ( (lv_app_controllers_26_0= ruleController ) ) (otherlv_27= ',' ( (lv_app_controllers_28_0= ruleController ) ) )* otherlv_29= '}' )? (otherlv_30= 'app_security' ( (lv_app_security_31_0= ruleSecurity ) ) )? otherlv_32= '}' ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
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
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        AntlrDatatypeRuleToken lv_group_7_0 = null;

        AntlrDatatypeRuleToken lv_artifact_9_0 = null;

        AntlrDatatypeRuleToken lv_packageName_11_0 = null;

        AntlrDatatypeRuleToken lv_port_13_0 = null;

        AntlrDatatypeRuleToken lv_hostname_15_0 = null;

        EObject lv_app_database_17_0 = null;

        EObject lv_app_models_20_0 = null;

        EObject lv_app_models_22_0 = null;

        EObject lv_app_controllers_26_0 = null;

        EObject lv_app_controllers_28_0 = null;

        EObject lv_app_security_31_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:78:2: ( ( () otherlv_1= 'Application' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'group' ( (lv_group_7_0= ruleEString ) ) )? (otherlv_8= 'artifact' ( (lv_artifact_9_0= ruleEString ) ) )? (otherlv_10= 'packageName' ( (lv_packageName_11_0= ruleEString ) ) )? (otherlv_12= 'port' ( (lv_port_13_0= ruleELongObject ) ) )? (otherlv_14= 'hostname' ( (lv_hostname_15_0= ruleEString ) ) )? (otherlv_16= 'app_database' ( (lv_app_database_17_0= ruleDatabase ) ) )? (otherlv_18= 'app_models' otherlv_19= '{' ( (lv_app_models_20_0= ruleModel ) ) (otherlv_21= ',' ( (lv_app_models_22_0= ruleModel ) ) )* otherlv_23= '}' )? (otherlv_24= 'app_controllers' otherlv_25= '{' ( (lv_app_controllers_26_0= ruleController ) ) (otherlv_27= ',' ( (lv_app_controllers_28_0= ruleController ) ) )* otherlv_29= '}' )? (otherlv_30= 'app_security' ( (lv_app_security_31_0= ruleSecurity ) ) )? otherlv_32= '}' ) )
            // InternalSecurityDsl.g:79:2: ( () otherlv_1= 'Application' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'group' ( (lv_group_7_0= ruleEString ) ) )? (otherlv_8= 'artifact' ( (lv_artifact_9_0= ruleEString ) ) )? (otherlv_10= 'packageName' ( (lv_packageName_11_0= ruleEString ) ) )? (otherlv_12= 'port' ( (lv_port_13_0= ruleELongObject ) ) )? (otherlv_14= 'hostname' ( (lv_hostname_15_0= ruleEString ) ) )? (otherlv_16= 'app_database' ( (lv_app_database_17_0= ruleDatabase ) ) )? (otherlv_18= 'app_models' otherlv_19= '{' ( (lv_app_models_20_0= ruleModel ) ) (otherlv_21= ',' ( (lv_app_models_22_0= ruleModel ) ) )* otherlv_23= '}' )? (otherlv_24= 'app_controllers' otherlv_25= '{' ( (lv_app_controllers_26_0= ruleController ) ) (otherlv_27= ',' ( (lv_app_controllers_28_0= ruleController ) ) )* otherlv_29= '}' )? (otherlv_30= 'app_security' ( (lv_app_security_31_0= ruleSecurity ) ) )? otherlv_32= '}' )
            {
            // InternalSecurityDsl.g:79:2: ( () otherlv_1= 'Application' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'group' ( (lv_group_7_0= ruleEString ) ) )? (otherlv_8= 'artifact' ( (lv_artifact_9_0= ruleEString ) ) )? (otherlv_10= 'packageName' ( (lv_packageName_11_0= ruleEString ) ) )? (otherlv_12= 'port' ( (lv_port_13_0= ruleELongObject ) ) )? (otherlv_14= 'hostname' ( (lv_hostname_15_0= ruleEString ) ) )? (otherlv_16= 'app_database' ( (lv_app_database_17_0= ruleDatabase ) ) )? (otherlv_18= 'app_models' otherlv_19= '{' ( (lv_app_models_20_0= ruleModel ) ) (otherlv_21= ',' ( (lv_app_models_22_0= ruleModel ) ) )* otherlv_23= '}' )? (otherlv_24= 'app_controllers' otherlv_25= '{' ( (lv_app_controllers_26_0= ruleController ) ) (otherlv_27= ',' ( (lv_app_controllers_28_0= ruleController ) ) )* otherlv_29= '}' )? (otherlv_30= 'app_security' ( (lv_app_security_31_0= ruleSecurity ) ) )? otherlv_32= '}' )
            // InternalSecurityDsl.g:80:3: () otherlv_1= 'Application' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'group' ( (lv_group_7_0= ruleEString ) ) )? (otherlv_8= 'artifact' ( (lv_artifact_9_0= ruleEString ) ) )? (otherlv_10= 'packageName' ( (lv_packageName_11_0= ruleEString ) ) )? (otherlv_12= 'port' ( (lv_port_13_0= ruleELongObject ) ) )? (otherlv_14= 'hostname' ( (lv_hostname_15_0= ruleEString ) ) )? (otherlv_16= 'app_database' ( (lv_app_database_17_0= ruleDatabase ) ) )? (otherlv_18= 'app_models' otherlv_19= '{' ( (lv_app_models_20_0= ruleModel ) ) (otherlv_21= ',' ( (lv_app_models_22_0= ruleModel ) ) )* otherlv_23= '}' )? (otherlv_24= 'app_controllers' otherlv_25= '{' ( (lv_app_controllers_26_0= ruleController ) ) (otherlv_27= ',' ( (lv_app_controllers_28_0= ruleController ) ) )* otherlv_29= '}' )? (otherlv_30= 'app_security' ( (lv_app_security_31_0= ruleSecurity ) ) )? otherlv_32= '}'
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
            		
            // InternalSecurityDsl.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSecurityDsl.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalSecurityDsl.g:92:4: (lv_name_2_0= ruleEString )
            // InternalSecurityDsl.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getApplicationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplicationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSecurityDsl.g:114:3: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSecurityDsl.g:115:4: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

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
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:139:3: (otherlv_6= 'group' ( (lv_group_7_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSecurityDsl.g:140:4: otherlv_6= 'group' ( (lv_group_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getApplicationAccess().getGroupKeyword_5_0());
                    			
                    // InternalSecurityDsl.g:144:4: ( (lv_group_7_0= ruleEString ) )
                    // InternalSecurityDsl.g:145:5: (lv_group_7_0= ruleEString )
                    {
                    // InternalSecurityDsl.g:145:5: (lv_group_7_0= ruleEString )
                    // InternalSecurityDsl.g:146:6: lv_group_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getApplicationAccess().getGroupEStringParserRuleCall_5_1_0());
                    					
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
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:164:3: (otherlv_8= 'artifact' ( (lv_artifact_9_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSecurityDsl.g:165:4: otherlv_8= 'artifact' ( (lv_artifact_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getApplicationAccess().getArtifactKeyword_6_0());
                    			
                    // InternalSecurityDsl.g:169:4: ( (lv_artifact_9_0= ruleEString ) )
                    // InternalSecurityDsl.g:170:5: (lv_artifact_9_0= ruleEString )
                    {
                    // InternalSecurityDsl.g:170:5: (lv_artifact_9_0= ruleEString )
                    // InternalSecurityDsl.g:171:6: lv_artifact_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getApplicationAccess().getArtifactEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_artifact_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getApplicationRule());
                    						}
                    						set(
                    							current,
                    							"artifact",
                    							lv_artifact_9_0,
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:189:3: (otherlv_10= 'packageName' ( (lv_packageName_11_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSecurityDsl.g:190:4: otherlv_10= 'packageName' ( (lv_packageName_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getApplicationAccess().getPackageNameKeyword_7_0());
                    			
                    // InternalSecurityDsl.g:194:4: ( (lv_packageName_11_0= ruleEString ) )
                    // InternalSecurityDsl.g:195:5: (lv_packageName_11_0= ruleEString )
                    {
                    // InternalSecurityDsl.g:195:5: (lv_packageName_11_0= ruleEString )
                    // InternalSecurityDsl.g:196:6: lv_packageName_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getApplicationAccess().getPackageNameEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_packageName_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getApplicationRule());
                    						}
                    						set(
                    							current,
                    							"packageName",
                    							lv_packageName_11_0,
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:214:3: (otherlv_12= 'port' ( (lv_port_13_0= ruleELongObject ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSecurityDsl.g:215:4: otherlv_12= 'port' ( (lv_port_13_0= ruleELongObject ) )
                    {
                    otherlv_12=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getApplicationAccess().getPortKeyword_8_0());
                    			
                    // InternalSecurityDsl.g:219:4: ( (lv_port_13_0= ruleELongObject ) )
                    // InternalSecurityDsl.g:220:5: (lv_port_13_0= ruleELongObject )
                    {
                    // InternalSecurityDsl.g:220:5: (lv_port_13_0= ruleELongObject )
                    // InternalSecurityDsl.g:221:6: lv_port_13_0= ruleELongObject
                    {

                    						newCompositeNode(grammarAccess.getApplicationAccess().getPortELongObjectParserRuleCall_8_1_0());
                    					
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
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.ELongObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:239:3: (otherlv_14= 'hostname' ( (lv_hostname_15_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSecurityDsl.g:240:4: otherlv_14= 'hostname' ( (lv_hostname_15_0= ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getApplicationAccess().getHostnameKeyword_9_0());
                    			
                    // InternalSecurityDsl.g:244:4: ( (lv_hostname_15_0= ruleEString ) )
                    // InternalSecurityDsl.g:245:5: (lv_hostname_15_0= ruleEString )
                    {
                    // InternalSecurityDsl.g:245:5: (lv_hostname_15_0= ruleEString )
                    // InternalSecurityDsl.g:246:6: lv_hostname_15_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getApplicationAccess().getHostnameEStringParserRuleCall_9_1_0());
                    					
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
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:264:3: (otherlv_16= 'app_database' ( (lv_app_database_17_0= ruleDatabase ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSecurityDsl.g:265:4: otherlv_16= 'app_database' ( (lv_app_database_17_0= ruleDatabase ) )
                    {
                    otherlv_16=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_16, grammarAccess.getApplicationAccess().getApp_databaseKeyword_10_0());
                    			
                    // InternalSecurityDsl.g:269:4: ( (lv_app_database_17_0= ruleDatabase ) )
                    // InternalSecurityDsl.g:270:5: (lv_app_database_17_0= ruleDatabase )
                    {
                    // InternalSecurityDsl.g:270:5: (lv_app_database_17_0= ruleDatabase )
                    // InternalSecurityDsl.g:271:6: lv_app_database_17_0= ruleDatabase
                    {

                    						newCompositeNode(grammarAccess.getApplicationAccess().getApp_databaseDatabaseParserRuleCall_10_1_0());
                    					
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
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.Database");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:289:3: (otherlv_18= 'app_models' otherlv_19= '{' ( (lv_app_models_20_0= ruleModel ) ) (otherlv_21= ',' ( (lv_app_models_22_0= ruleModel ) ) )* otherlv_23= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSecurityDsl.g:290:4: otherlv_18= 'app_models' otherlv_19= '{' ( (lv_app_models_20_0= ruleModel ) ) (otherlv_21= ',' ( (lv_app_models_22_0= ruleModel ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getApplicationAccess().getApp_modelsKeyword_11_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_19, grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalSecurityDsl.g:298:4: ( (lv_app_models_20_0= ruleModel ) )
                    // InternalSecurityDsl.g:299:5: (lv_app_models_20_0= ruleModel )
                    {
                    // InternalSecurityDsl.g:299:5: (lv_app_models_20_0= ruleModel )
                    // InternalSecurityDsl.g:300:6: lv_app_models_20_0= ruleModel
                    {

                    						newCompositeNode(grammarAccess.getApplicationAccess().getApp_modelsModelParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_app_models_20_0=ruleModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getApplicationRule());
                    						}
                    						add(
                    							current,
                    							"app_models",
                    							lv_app_models_20_0,
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.Model");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSecurityDsl.g:317:4: (otherlv_21= ',' ( (lv_app_models_22_0= ruleModel ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==21) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalSecurityDsl.g:318:5: otherlv_21= ',' ( (lv_app_models_22_0= ruleModel ) )
                    	    {
                    	    otherlv_21=(Token)match(input,21,FOLLOW_15); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getApplicationAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalSecurityDsl.g:322:5: ( (lv_app_models_22_0= ruleModel ) )
                    	    // InternalSecurityDsl.g:323:6: (lv_app_models_22_0= ruleModel )
                    	    {
                    	    // InternalSecurityDsl.g:323:6: (lv_app_models_22_0= ruleModel )
                    	    // InternalSecurityDsl.g:324:7: lv_app_models_22_0= ruleModel
                    	    {

                    	    							newCompositeNode(grammarAccess.getApplicationAccess().getApp_modelsModelParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_app_models_22_0=ruleModel();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getApplicationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"app_models",
                    	    								lv_app_models_22_0,
                    	    								"rs.ac.uns.ftn.securitydsl.SecurityDsl.Model");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_23, grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            // InternalSecurityDsl.g:347:3: (otherlv_24= 'app_controllers' otherlv_25= '{' ( (lv_app_controllers_26_0= ruleController ) ) (otherlv_27= ',' ( (lv_app_controllers_28_0= ruleController ) ) )* otherlv_29= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSecurityDsl.g:348:4: otherlv_24= 'app_controllers' otherlv_25= '{' ( (lv_app_controllers_26_0= ruleController ) ) (otherlv_27= ',' ( (lv_app_controllers_28_0= ruleController ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_24, grammarAccess.getApplicationAccess().getApp_controllersKeyword_12_0());
                    			
                    otherlv_25=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_25, grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalSecurityDsl.g:356:4: ( (lv_app_controllers_26_0= ruleController ) )
                    // InternalSecurityDsl.g:357:5: (lv_app_controllers_26_0= ruleController )
                    {
                    // InternalSecurityDsl.g:357:5: (lv_app_controllers_26_0= ruleController )
                    // InternalSecurityDsl.g:358:6: lv_app_controllers_26_0= ruleController
                    {

                    						newCompositeNode(grammarAccess.getApplicationAccess().getApp_controllersControllerParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_app_controllers_26_0=ruleController();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getApplicationRule());
                    						}
                    						add(
                    							current,
                    							"app_controllers",
                    							lv_app_controllers_26_0,
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.Controller");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSecurityDsl.g:375:4: (otherlv_27= ',' ( (lv_app_controllers_28_0= ruleController ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==21) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalSecurityDsl.g:376:5: otherlv_27= ',' ( (lv_app_controllers_28_0= ruleController ) )
                    	    {
                    	    otherlv_27=(Token)match(input,21,FOLLOW_18); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getApplicationAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalSecurityDsl.g:380:5: ( (lv_app_controllers_28_0= ruleController ) )
                    	    // InternalSecurityDsl.g:381:6: (lv_app_controllers_28_0= ruleController )
                    	    {
                    	    // InternalSecurityDsl.g:381:6: (lv_app_controllers_28_0= ruleController )
                    	    // InternalSecurityDsl.g:382:7: lv_app_controllers_28_0= ruleController
                    	    {

                    	    							newCompositeNode(grammarAccess.getApplicationAccess().getApp_controllersControllerParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_app_controllers_28_0=ruleController();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getApplicationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"app_controllers",
                    	    								lv_app_controllers_28_0,
                    	    								"rs.ac.uns.ftn.securitydsl.SecurityDsl.Controller");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,22,FOLLOW_19); 

                    				newLeafNode(otherlv_29, grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalSecurityDsl.g:405:3: (otherlv_30= 'app_security' ( (lv_app_security_31_0= ruleSecurity ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSecurityDsl.g:406:4: otherlv_30= 'app_security' ( (lv_app_security_31_0= ruleSecurity ) )
                    {
                    otherlv_30=(Token)match(input,24,FOLLOW_20); 

                    				newLeafNode(otherlv_30, grammarAccess.getApplicationAccess().getApp_securityKeyword_13_0());
                    			
                    // InternalSecurityDsl.g:410:4: ( (lv_app_security_31_0= ruleSecurity ) )
                    // InternalSecurityDsl.g:411:5: (lv_app_security_31_0= ruleSecurity )
                    {
                    // InternalSecurityDsl.g:411:5: (lv_app_security_31_0= ruleSecurity )
                    // InternalSecurityDsl.g:412:6: lv_app_security_31_0= ruleSecurity
                    {

                    						newCompositeNode(grammarAccess.getApplicationAccess().getApp_securitySecurityParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_app_security_31_0=ruleSecurity();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getApplicationRule());
                    						}
                    						set(
                    							current,
                    							"app_security",
                    							lv_app_security_31_0,
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.Security");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_32=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_32, grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_14());
            		

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


    // $ANTLR start "entryRuleModel"
    // InternalSecurityDsl.g:438:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSecurityDsl.g:438:46: (iv_ruleModel= ruleModel EOF )
            // InternalSecurityDsl.g:439:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSecurityDsl.g:445:1: ruleModel returns [EObject current=null] : (this_Role_0= ruleRole | this_User_1= ruleUser ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_Role_0 = null;

        EObject this_User_1 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:451:2: ( (this_Role_0= ruleRole | this_User_1= ruleUser ) )
            // InternalSecurityDsl.g:452:2: (this_Role_0= ruleRole | this_User_1= ruleUser )
            {
            // InternalSecurityDsl.g:452:2: (this_Role_0= ruleRole | this_User_1= ruleUser )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            else if ( (LA13_0==39) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSecurityDsl.g:453:3: this_Role_0= ruleRole
                    {

                    			newCompositeNode(grammarAccess.getModelAccess().getRoleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Role_0=ruleRole();

                    state._fsp--;


                    			current = this_Role_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:462:3: this_User_1= ruleUser
                    {

                    			newCompositeNode(grammarAccess.getModelAccess().getUserParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_User_1=ruleUser();

                    state._fsp--;


                    			current = this_User_1;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleController"
    // InternalSecurityDsl.g:474:1: entryRuleController returns [EObject current=null] : iv_ruleController= ruleController EOF ;
    public final EObject entryRuleController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleController = null;


        try {
            // InternalSecurityDsl.g:474:51: (iv_ruleController= ruleController EOF )
            // InternalSecurityDsl.g:475:2: iv_ruleController= ruleController EOF
            {
             newCompositeNode(grammarAccess.getControllerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleController=ruleController();

            state._fsp--;

             current =iv_ruleController; 
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
    // $ANTLR end "entryRuleController"


    // $ANTLR start "ruleController"
    // InternalSecurityDsl.g:481:1: ruleController returns [EObject current=null] : this_Authentication_0= ruleAuthentication ;
    public final EObject ruleController() throws RecognitionException {
        EObject current = null;

        EObject this_Authentication_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:487:2: (this_Authentication_0= ruleAuthentication )
            // InternalSecurityDsl.g:488:2: this_Authentication_0= ruleAuthentication
            {

            		newCompositeNode(grammarAccess.getControllerAccess().getAuthenticationParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Authentication_0=ruleAuthentication();

            state._fsp--;


            		current = this_Authentication_0;
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
    // $ANTLR end "ruleController"


    // $ANTLR start "entryRuleSecurity"
    // InternalSecurityDsl.g:499:1: entryRuleSecurity returns [EObject current=null] : iv_ruleSecurity= ruleSecurity EOF ;
    public final EObject entryRuleSecurity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecurity = null;


        try {
            // InternalSecurityDsl.g:499:49: (iv_ruleSecurity= ruleSecurity EOF )
            // InternalSecurityDsl.g:500:2: iv_ruleSecurity= ruleSecurity EOF
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
    // InternalSecurityDsl.g:506:1: ruleSecurity returns [EObject current=null] : this_JWT_0= ruleJWT ;
    public final EObject ruleSecurity() throws RecognitionException {
        EObject current = null;

        EObject this_JWT_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:512:2: (this_JWT_0= ruleJWT )
            // InternalSecurityDsl.g:513:2: this_JWT_0= ruleJWT
            {

            		newCompositeNode(grammarAccess.getSecurityAccess().getJWTParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_JWT_0=ruleJWT();

            state._fsp--;


            		current = this_JWT_0;
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


    // $ANTLR start "entryRuleDatabase"
    // InternalSecurityDsl.g:524:1: entryRuleDatabase returns [EObject current=null] : iv_ruleDatabase= ruleDatabase EOF ;
    public final EObject entryRuleDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabase = null;


        try {
            // InternalSecurityDsl.g:524:49: (iv_ruleDatabase= ruleDatabase EOF )
            // InternalSecurityDsl.g:525:2: iv_ruleDatabase= ruleDatabase EOF
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
    // InternalSecurityDsl.g:531:1: ruleDatabase returns [EObject current=null] : (otherlv_0= 'Database' otherlv_1= '{' otherlv_2= 'vendorName' ( (lv_vendorName_3_0= ruleEDatabaseType ) ) otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) otherlv_6= 'username' ( (lv_username_7_0= ruleEString ) ) otherlv_8= 'password' ( (lv_password_9_0= ruleEString ) ) otherlv_10= '}' ) ;
    public final EObject ruleDatabase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_vendorName_3_0 = null;

        AntlrDatatypeRuleToken lv_url_5_0 = null;

        AntlrDatatypeRuleToken lv_username_7_0 = null;

        AntlrDatatypeRuleToken lv_password_9_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:537:2: ( (otherlv_0= 'Database' otherlv_1= '{' otherlv_2= 'vendorName' ( (lv_vendorName_3_0= ruleEDatabaseType ) ) otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) otherlv_6= 'username' ( (lv_username_7_0= ruleEString ) ) otherlv_8= 'password' ( (lv_password_9_0= ruleEString ) ) otherlv_10= '}' ) )
            // InternalSecurityDsl.g:538:2: (otherlv_0= 'Database' otherlv_1= '{' otherlv_2= 'vendorName' ( (lv_vendorName_3_0= ruleEDatabaseType ) ) otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) otherlv_6= 'username' ( (lv_username_7_0= ruleEString ) ) otherlv_8= 'password' ( (lv_password_9_0= ruleEString ) ) otherlv_10= '}' )
            {
            // InternalSecurityDsl.g:538:2: (otherlv_0= 'Database' otherlv_1= '{' otherlv_2= 'vendorName' ( (lv_vendorName_3_0= ruleEDatabaseType ) ) otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) otherlv_6= 'username' ( (lv_username_7_0= ruleEString ) ) otherlv_8= 'password' ( (lv_password_9_0= ruleEString ) ) otherlv_10= '}' )
            // InternalSecurityDsl.g:539:3: otherlv_0= 'Database' otherlv_1= '{' otherlv_2= 'vendorName' ( (lv_vendorName_3_0= ruleEDatabaseType ) ) otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) otherlv_6= 'username' ( (lv_username_7_0= ruleEString ) ) otherlv_8= 'password' ( (lv_password_9_0= ruleEString ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDatabaseAccess().getDatabaseKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getDatabaseAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getDatabaseAccess().getVendorNameKeyword_2());
            		
            // InternalSecurityDsl.g:551:3: ( (lv_vendorName_3_0= ruleEDatabaseType ) )
            // InternalSecurityDsl.g:552:4: (lv_vendorName_3_0= ruleEDatabaseType )
            {
            // InternalSecurityDsl.g:552:4: (lv_vendorName_3_0= ruleEDatabaseType )
            // InternalSecurityDsl.g:553:5: lv_vendorName_3_0= ruleEDatabaseType
            {

            					newCompositeNode(grammarAccess.getDatabaseAccess().getVendorNameEDatabaseTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
            lv_vendorName_3_0=ruleEDatabaseType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatabaseRule());
            					}
            					set(
            						current,
            						"vendorName",
            						lv_vendorName_3_0,
            						"rs.ac.uns.ftn.securitydsl.SecurityDsl.EDatabaseType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getDatabaseAccess().getUrlKeyword_4());
            		
            // InternalSecurityDsl.g:574:3: ( (lv_url_5_0= ruleEString ) )
            // InternalSecurityDsl.g:575:4: (lv_url_5_0= ruleEString )
            {
            // InternalSecurityDsl.g:575:4: (lv_url_5_0= ruleEString )
            // InternalSecurityDsl.g:576:5: lv_url_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDatabaseAccess().getUrlEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_25);
            lv_url_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatabaseRule());
            					}
            					set(
            						current,
            						"url",
            						lv_url_5_0,
            						"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getDatabaseAccess().getUsernameKeyword_6());
            		
            // InternalSecurityDsl.g:597:3: ( (lv_username_7_0= ruleEString ) )
            // InternalSecurityDsl.g:598:4: (lv_username_7_0= ruleEString )
            {
            // InternalSecurityDsl.g:598:4: (lv_username_7_0= ruleEString )
            // InternalSecurityDsl.g:599:5: lv_username_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDatabaseAccess().getUsernameEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_26);
            lv_username_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatabaseRule());
            					}
            					set(
            						current,
            						"username",
            						lv_username_7_0,
            						"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getDatabaseAccess().getPasswordKeyword_8());
            		
            // InternalSecurityDsl.g:620:3: ( (lv_password_9_0= ruleEString ) )
            // InternalSecurityDsl.g:621:4: (lv_password_9_0= ruleEString )
            {
            // InternalSecurityDsl.g:621:4: (lv_password_9_0= ruleEString )
            // InternalSecurityDsl.g:622:5: lv_password_9_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDatabaseAccess().getPasswordEStringParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_21);
            lv_password_9_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatabaseRule());
            					}
            					set(
            						current,
            						"password",
            						lv_password_9_0,
            						"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getDatabaseAccess().getRightCurlyBracketKeyword_10());
            		

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
    // InternalSecurityDsl.g:647:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSecurityDsl.g:647:47: (iv_ruleEString= ruleEString EOF )
            // InternalSecurityDsl.g:648:2: iv_ruleEString= ruleEString EOF
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
    // InternalSecurityDsl.g:654:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSecurityDsl.g:660:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSecurityDsl.g:661:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSecurityDsl.g:661:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalSecurityDsl.g:662:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:670:3: this_ID_1= RULE_ID
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
    // InternalSecurityDsl.g:681:1: entryRuleELongObject returns [String current=null] : iv_ruleELongObject= ruleELongObject EOF ;
    public final String entryRuleELongObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleELongObject = null;


        try {
            // InternalSecurityDsl.g:681:51: (iv_ruleELongObject= ruleELongObject EOF )
            // InternalSecurityDsl.g:682:2: iv_ruleELongObject= ruleELongObject EOF
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
    // InternalSecurityDsl.g:688:1: ruleELongObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleELongObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSecurityDsl.g:694:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSecurityDsl.g:695:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSecurityDsl.g:695:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSecurityDsl.g:696:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSecurityDsl.g:696:3: (kw= '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSecurityDsl.g:697:4: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_27); 

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
    // InternalSecurityDsl.g:714:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalSecurityDsl.g:714:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalSecurityDsl.g:715:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalSecurityDsl.g:721:1: ruleAttribute returns [EObject current=null] : ( ( (lv_isIdentifier_0_0= 'isIdentifier' ) ) otherlv_1= 'Attribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'type' ( (lv_type_5_0= ruleEType ) ) (otherlv_6= 'collumnName' ( (lv_collumnName_7_0= ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_isIdentifier_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_collumnName_7_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:727:2: ( ( ( (lv_isIdentifier_0_0= 'isIdentifier' ) ) otherlv_1= 'Attribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'type' ( (lv_type_5_0= ruleEType ) ) (otherlv_6= 'collumnName' ( (lv_collumnName_7_0= ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalSecurityDsl.g:728:2: ( ( (lv_isIdentifier_0_0= 'isIdentifier' ) ) otherlv_1= 'Attribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'type' ( (lv_type_5_0= ruleEType ) ) (otherlv_6= 'collumnName' ( (lv_collumnName_7_0= ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalSecurityDsl.g:728:2: ( ( (lv_isIdentifier_0_0= 'isIdentifier' ) ) otherlv_1= 'Attribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'type' ( (lv_type_5_0= ruleEType ) ) (otherlv_6= 'collumnName' ( (lv_collumnName_7_0= ruleEString ) ) )? otherlv_8= '}' )
            // InternalSecurityDsl.g:729:3: ( (lv_isIdentifier_0_0= 'isIdentifier' ) ) otherlv_1= 'Attribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'type' ( (lv_type_5_0= ruleEType ) ) (otherlv_6= 'collumnName' ( (lv_collumnName_7_0= ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalSecurityDsl.g:729:3: ( (lv_isIdentifier_0_0= 'isIdentifier' ) )
            // InternalSecurityDsl.g:730:4: (lv_isIdentifier_0_0= 'isIdentifier' )
            {
            // InternalSecurityDsl.g:730:4: (lv_isIdentifier_0_0= 'isIdentifier' )
            // InternalSecurityDsl.g:731:5: lv_isIdentifier_0_0= 'isIdentifier'
            {
            lv_isIdentifier_0_0=(Token)match(input,31,FOLLOW_28); 

            					newLeafNode(lv_isIdentifier_0_0, grammarAccess.getAttributeAccess().getIsIdentifierIsIdentifierKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(current, "isIdentifier", lv_isIdentifier_0_0 != null, "isIdentifier");
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getAttributeKeyword_1());
            		
            // InternalSecurityDsl.g:747:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSecurityDsl.g:748:4: (lv_name_2_0= ruleEString )
            {
            // InternalSecurityDsl.g:748:4: (lv_name_2_0= ruleEString )
            // InternalSecurityDsl.g:749:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,33,FOLLOW_30); 

            			newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getTypeKeyword_4());
            		
            // InternalSecurityDsl.g:774:3: ( (lv_type_5_0= ruleEType ) )
            // InternalSecurityDsl.g:775:4: (lv_type_5_0= ruleEType )
            {
            // InternalSecurityDsl.g:775:4: (lv_type_5_0= ruleEType )
            // InternalSecurityDsl.g:776:5: lv_type_5_0= ruleEType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeETypeEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_31);
            lv_type_5_0=ruleEType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_5_0,
            						"rs.ac.uns.ftn.securitydsl.SecurityDsl.EType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecurityDsl.g:793:3: (otherlv_6= 'collumnName' ( (lv_collumnName_7_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSecurityDsl.g:794:4: otherlv_6= 'collumnName' ( (lv_collumnName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getCollumnNameKeyword_6_0());
                    			
                    // InternalSecurityDsl.g:798:4: ( (lv_collumnName_7_0= ruleEString ) )
                    // InternalSecurityDsl.g:799:5: (lv_collumnName_7_0= ruleEString )
                    {
                    // InternalSecurityDsl.g:799:5: (lv_collumnName_7_0= ruleEString )
                    // InternalSecurityDsl.g:800:6: lv_collumnName_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getCollumnNameEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_collumnName_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"collumnName",
                    							lv_collumnName_7_0,
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalSecurityDsl.g:826:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalSecurityDsl.g:826:45: (iv_ruleRole= ruleRole EOF )
            // InternalSecurityDsl.g:827:2: iv_ruleRole= ruleRole EOF
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
    // InternalSecurityDsl.g:833:1: ruleRole returns [EObject current=null] : ( () otherlv_1= 'Role' otherlv_2= '{' (otherlv_3= 'tableName' ( (lv_tableName_4_0= ruleEString ) ) )? (otherlv_5= 'model_attributes' otherlv_6= '{' ( (lv_model_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_model_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )? (otherlv_11= 'role_instances' otherlv_12= '{' ( (lv_role_instances_13_0= ruleRoleInstance ) ) (otherlv_14= ',' ( (lv_role_instances_15_0= ruleRoleInstance ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_tableName_4_0 = null;

        EObject lv_model_attributes_7_0 = null;

        EObject lv_model_attributes_9_0 = null;

        EObject lv_role_instances_13_0 = null;

        EObject lv_role_instances_15_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:839:2: ( ( () otherlv_1= 'Role' otherlv_2= '{' (otherlv_3= 'tableName' ( (lv_tableName_4_0= ruleEString ) ) )? (otherlv_5= 'model_attributes' otherlv_6= '{' ( (lv_model_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_model_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )? (otherlv_11= 'role_instances' otherlv_12= '{' ( (lv_role_instances_13_0= ruleRoleInstance ) ) (otherlv_14= ',' ( (lv_role_instances_15_0= ruleRoleInstance ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) )
            // InternalSecurityDsl.g:840:2: ( () otherlv_1= 'Role' otherlv_2= '{' (otherlv_3= 'tableName' ( (lv_tableName_4_0= ruleEString ) ) )? (otherlv_5= 'model_attributes' otherlv_6= '{' ( (lv_model_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_model_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )? (otherlv_11= 'role_instances' otherlv_12= '{' ( (lv_role_instances_13_0= ruleRoleInstance ) ) (otherlv_14= ',' ( (lv_role_instances_15_0= ruleRoleInstance ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            {
            // InternalSecurityDsl.g:840:2: ( () otherlv_1= 'Role' otherlv_2= '{' (otherlv_3= 'tableName' ( (lv_tableName_4_0= ruleEString ) ) )? (otherlv_5= 'model_attributes' otherlv_6= '{' ( (lv_model_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_model_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )? (otherlv_11= 'role_instances' otherlv_12= '{' ( (lv_role_instances_13_0= ruleRoleInstance ) ) (otherlv_14= ',' ( (lv_role_instances_15_0= ruleRoleInstance ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            // InternalSecurityDsl.g:841:3: () otherlv_1= 'Role' otherlv_2= '{' (otherlv_3= 'tableName' ( (lv_tableName_4_0= ruleEString ) ) )? (otherlv_5= 'model_attributes' otherlv_6= '{' ( (lv_model_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_model_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )? (otherlv_11= 'role_instances' otherlv_12= '{' ( (lv_role_instances_13_0= ruleRoleInstance ) ) (otherlv_14= ',' ( (lv_role_instances_15_0= ruleRoleInstance ) ) )* otherlv_16= '}' )? otherlv_17= '}'
            {
            // InternalSecurityDsl.g:841:3: ()
            // InternalSecurityDsl.g:842:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoleAccess().getRoleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRoleAccess().getRoleKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSecurityDsl.g:856:3: (otherlv_3= 'tableName' ( (lv_tableName_4_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSecurityDsl.g:857:4: otherlv_3= 'tableName' ( (lv_tableName_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRoleAccess().getTableNameKeyword_3_0());
                    			
                    // InternalSecurityDsl.g:861:4: ( (lv_tableName_4_0= ruleEString ) )
                    // InternalSecurityDsl.g:862:5: (lv_tableName_4_0= ruleEString )
                    {
                    // InternalSecurityDsl.g:862:5: (lv_tableName_4_0= ruleEString )
                    // InternalSecurityDsl.g:863:6: lv_tableName_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRoleAccess().getTableNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_tableName_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoleRule());
                    						}
                    						set(
                    							current,
                    							"tableName",
                    							lv_tableName_4_0,
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:881:3: (otherlv_5= 'model_attributes' otherlv_6= '{' ( (lv_model_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_model_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSecurityDsl.g:882:4: otherlv_5= 'model_attributes' otherlv_6= '{' ( (lv_model_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_model_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getRoleAccess().getModel_attributesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_34); 

                    				newLeafNode(otherlv_6, grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSecurityDsl.g:890:4: ( (lv_model_attributes_7_0= ruleAttribute ) )
                    // InternalSecurityDsl.g:891:5: (lv_model_attributes_7_0= ruleAttribute )
                    {
                    // InternalSecurityDsl.g:891:5: (lv_model_attributes_7_0= ruleAttribute )
                    // InternalSecurityDsl.g:892:6: lv_model_attributes_7_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getRoleAccess().getModel_attributesAttributeParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_model_attributes_7_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoleRule());
                    						}
                    						add(
                    							current,
                    							"model_attributes",
                    							lv_model_attributes_7_0,
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSecurityDsl.g:909:4: (otherlv_8= ',' ( (lv_model_attributes_9_0= ruleAttribute ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==21) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalSecurityDsl.g:910:5: otherlv_8= ',' ( (lv_model_attributes_9_0= ruleAttribute ) )
                    	    {
                    	    otherlv_8=(Token)match(input,21,FOLLOW_34); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getRoleAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSecurityDsl.g:914:5: ( (lv_model_attributes_9_0= ruleAttribute ) )
                    	    // InternalSecurityDsl.g:915:6: (lv_model_attributes_9_0= ruleAttribute )
                    	    {
                    	    // InternalSecurityDsl.g:915:6: (lv_model_attributes_9_0= ruleAttribute )
                    	    // InternalSecurityDsl.g:916:7: lv_model_attributes_9_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getRoleAccess().getModel_attributesAttributeParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_model_attributes_9_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRoleRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"model_attributes",
                    	    								lv_model_attributes_9_0,
                    	    								"rs.ac.uns.ftn.securitydsl.SecurityDsl.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,22,FOLLOW_35); 

                    				newLeafNode(otherlv_10, grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalSecurityDsl.g:939:3: (otherlv_11= 'role_instances' otherlv_12= '{' ( (lv_role_instances_13_0= ruleRoleInstance ) ) (otherlv_14= ',' ( (lv_role_instances_15_0= ruleRoleInstance ) ) )* otherlv_16= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSecurityDsl.g:940:4: otherlv_11= 'role_instances' otherlv_12= '{' ( (lv_role_instances_13_0= ruleRoleInstance ) ) (otherlv_14= ',' ( (lv_role_instances_15_0= ruleRoleInstance ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,38,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getRoleAccess().getRole_instancesKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_36); 

                    				newLeafNode(otherlv_12, grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalSecurityDsl.g:948:4: ( (lv_role_instances_13_0= ruleRoleInstance ) )
                    // InternalSecurityDsl.g:949:5: (lv_role_instances_13_0= ruleRoleInstance )
                    {
                    // InternalSecurityDsl.g:949:5: (lv_role_instances_13_0= ruleRoleInstance )
                    // InternalSecurityDsl.g:950:6: lv_role_instances_13_0= ruleRoleInstance
                    {

                    						newCompositeNode(grammarAccess.getRoleAccess().getRole_instancesRoleInstanceParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_role_instances_13_0=ruleRoleInstance();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoleRule());
                    						}
                    						add(
                    							current,
                    							"role_instances",
                    							lv_role_instances_13_0,
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.RoleInstance");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSecurityDsl.g:967:4: (otherlv_14= ',' ( (lv_role_instances_15_0= ruleRoleInstance ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==21) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalSecurityDsl.g:968:5: otherlv_14= ',' ( (lv_role_instances_15_0= ruleRoleInstance ) )
                    	    {
                    	    otherlv_14=(Token)match(input,21,FOLLOW_36); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getRoleAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSecurityDsl.g:972:5: ( (lv_role_instances_15_0= ruleRoleInstance ) )
                    	    // InternalSecurityDsl.g:973:6: (lv_role_instances_15_0= ruleRoleInstance )
                    	    {
                    	    // InternalSecurityDsl.g:973:6: (lv_role_instances_15_0= ruleRoleInstance )
                    	    // InternalSecurityDsl.g:974:7: lv_role_instances_15_0= ruleRoleInstance
                    	    {

                    	    							newCompositeNode(grammarAccess.getRoleAccess().getRole_instancesRoleInstanceParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_role_instances_15_0=ruleRoleInstance();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRoleRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"role_instances",
                    	    								lv_role_instances_15_0,
                    	    								"rs.ac.uns.ftn.securitydsl.SecurityDsl.RoleInstance");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,22,FOLLOW_21); 

                    				newLeafNode(otherlv_16, grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalSecurityDsl.g:1005:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // InternalSecurityDsl.g:1005:45: (iv_ruleUser= ruleUser EOF )
            // InternalSecurityDsl.g:1006:2: iv_ruleUser= ruleUser EOF
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
    // InternalSecurityDsl.g:1012:1: ruleUser returns [EObject current=null] : ( () otherlv_1= 'User' otherlv_2= '{' (otherlv_3= 'tableName' ( (lv_tableName_4_0= ruleEString ) ) )? (otherlv_5= 'model_attributes' otherlv_6= '{' ( (lv_model_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_model_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleUser() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_tableName_4_0 = null;

        EObject lv_model_attributes_7_0 = null;

        EObject lv_model_attributes_9_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:1018:2: ( ( () otherlv_1= 'User' otherlv_2= '{' (otherlv_3= 'tableName' ( (lv_tableName_4_0= ruleEString ) ) )? (otherlv_5= 'model_attributes' otherlv_6= '{' ( (lv_model_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_model_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalSecurityDsl.g:1019:2: ( () otherlv_1= 'User' otherlv_2= '{' (otherlv_3= 'tableName' ( (lv_tableName_4_0= ruleEString ) ) )? (otherlv_5= 'model_attributes' otherlv_6= '{' ( (lv_model_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_model_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalSecurityDsl.g:1019:2: ( () otherlv_1= 'User' otherlv_2= '{' (otherlv_3= 'tableName' ( (lv_tableName_4_0= ruleEString ) ) )? (otherlv_5= 'model_attributes' otherlv_6= '{' ( (lv_model_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_model_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalSecurityDsl.g:1020:3: () otherlv_1= 'User' otherlv_2= '{' (otherlv_3= 'tableName' ( (lv_tableName_4_0= ruleEString ) ) )? (otherlv_5= 'model_attributes' otherlv_6= '{' ( (lv_model_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_model_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalSecurityDsl.g:1020:3: ()
            // InternalSecurityDsl.g:1021:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUserAccess().getUserAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getUserAccess().getUserKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSecurityDsl.g:1035:3: (otherlv_3= 'tableName' ( (lv_tableName_4_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSecurityDsl.g:1036:4: otherlv_3= 'tableName' ( (lv_tableName_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getUserAccess().getTableNameKeyword_3_0());
                    			
                    // InternalSecurityDsl.g:1040:4: ( (lv_tableName_4_0= ruleEString ) )
                    // InternalSecurityDsl.g:1041:5: (lv_tableName_4_0= ruleEString )
                    {
                    // InternalSecurityDsl.g:1041:5: (lv_tableName_4_0= ruleEString )
                    // InternalSecurityDsl.g:1042:6: lv_tableName_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getUserAccess().getTableNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_tableName_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUserRule());
                    						}
                    						set(
                    							current,
                    							"tableName",
                    							lv_tableName_4_0,
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:1060:3: (otherlv_5= 'model_attributes' otherlv_6= '{' ( (lv_model_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_model_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==37) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSecurityDsl.g:1061:4: otherlv_5= 'model_attributes' otherlv_6= '{' ( (lv_model_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_model_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getUserAccess().getModel_attributesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_34); 

                    				newLeafNode(otherlv_6, grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSecurityDsl.g:1069:4: ( (lv_model_attributes_7_0= ruleAttribute ) )
                    // InternalSecurityDsl.g:1070:5: (lv_model_attributes_7_0= ruleAttribute )
                    {
                    // InternalSecurityDsl.g:1070:5: (lv_model_attributes_7_0= ruleAttribute )
                    // InternalSecurityDsl.g:1071:6: lv_model_attributes_7_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getUserAccess().getModel_attributesAttributeParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_model_attributes_7_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUserRule());
                    						}
                    						add(
                    							current,
                    							"model_attributes",
                    							lv_model_attributes_7_0,
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSecurityDsl.g:1088:4: (otherlv_8= ',' ( (lv_model_attributes_9_0= ruleAttribute ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==21) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalSecurityDsl.g:1089:5: otherlv_8= ',' ( (lv_model_attributes_9_0= ruleAttribute ) )
                    	    {
                    	    otherlv_8=(Token)match(input,21,FOLLOW_34); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getUserAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSecurityDsl.g:1093:5: ( (lv_model_attributes_9_0= ruleAttribute ) )
                    	    // InternalSecurityDsl.g:1094:6: (lv_model_attributes_9_0= ruleAttribute )
                    	    {
                    	    // InternalSecurityDsl.g:1094:6: (lv_model_attributes_9_0= ruleAttribute )
                    	    // InternalSecurityDsl.g:1095:7: lv_model_attributes_9_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getUserAccess().getModel_attributesAttributeParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_model_attributes_9_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUserRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"model_attributes",
                    	    								lv_model_attributes_9_0,
                    	    								"rs.ac.uns.ftn.securitydsl.SecurityDsl.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,22,FOLLOW_21); 

                    				newLeafNode(otherlv_10, grammarAccess.getUserAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getUserAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalSecurityDsl.g:1126:1: entryRuleRoleInstance returns [EObject current=null] : iv_ruleRoleInstance= ruleRoleInstance EOF ;
    public final EObject entryRuleRoleInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleInstance = null;


        try {
            // InternalSecurityDsl.g:1126:53: (iv_ruleRoleInstance= ruleRoleInstance EOF )
            // InternalSecurityDsl.g:1127:2: iv_ruleRoleInstance= ruleRoleInstance EOF
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
    // InternalSecurityDsl.g:1133:1: ruleRoleInstance returns [EObject current=null] : ( () otherlv_1= 'RoleInstance' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleRoleInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:1139:2: ( ( () otherlv_1= 'RoleInstance' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalSecurityDsl.g:1140:2: ( () otherlv_1= 'RoleInstance' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalSecurityDsl.g:1140:2: ( () otherlv_1= 'RoleInstance' ( (lv_name_2_0= ruleEString ) ) )
            // InternalSecurityDsl.g:1141:3: () otherlv_1= 'RoleInstance' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalSecurityDsl.g:1141:3: ()
            // InternalSecurityDsl.g:1142:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoleInstanceAccess().getRoleInstanceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRoleInstanceAccess().getRoleInstanceKeyword_1());
            		
            // InternalSecurityDsl.g:1152:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSecurityDsl.g:1153:4: (lv_name_2_0= ruleEString )
            {
            // InternalSecurityDsl.g:1153:4: (lv_name_2_0= ruleEString )
            // InternalSecurityDsl.g:1154:5: lv_name_2_0= ruleEString
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
            						"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
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
    // InternalSecurityDsl.g:1175:1: entryRuleEndpoint returns [EObject current=null] : iv_ruleEndpoint= ruleEndpoint EOF ;
    public final EObject entryRuleEndpoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndpoint = null;


        try {
            // InternalSecurityDsl.g:1175:49: (iv_ruleEndpoint= ruleEndpoint EOF )
            // InternalSecurityDsl.g:1176:2: iv_ruleEndpoint= ruleEndpoint EOF
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
    // InternalSecurityDsl.g:1182:1: ruleEndpoint returns [EObject current=null] : (otherlv_0= 'Endpoint' otherlv_1= '{' otherlv_2= 'url' ( (lv_url_3_0= ruleEString ) ) (otherlv_4= 'functionName' ( (lv_functionName_5_0= ruleEString ) ) )? (otherlv_6= 'method' ( (lv_method_7_0= ruleEEndpointMethod ) ) )? (otherlv_8= 'type' ( (lv_type_9_0= ruleEEndpointType ) ) )? (otherlv_10= 'role_authorities' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
    public final EObject ruleEndpoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
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
        AntlrDatatypeRuleToken lv_url_3_0 = null;

        AntlrDatatypeRuleToken lv_functionName_5_0 = null;

        Enumerator lv_method_7_0 = null;

        Enumerator lv_type_9_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:1188:2: ( (otherlv_0= 'Endpoint' otherlv_1= '{' otherlv_2= 'url' ( (lv_url_3_0= ruleEString ) ) (otherlv_4= 'functionName' ( (lv_functionName_5_0= ruleEString ) ) )? (otherlv_6= 'method' ( (lv_method_7_0= ruleEEndpointMethod ) ) )? (otherlv_8= 'type' ( (lv_type_9_0= ruleEEndpointType ) ) )? (otherlv_10= 'role_authorities' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalSecurityDsl.g:1189:2: (otherlv_0= 'Endpoint' otherlv_1= '{' otherlv_2= 'url' ( (lv_url_3_0= ruleEString ) ) (otherlv_4= 'functionName' ( (lv_functionName_5_0= ruleEString ) ) )? (otherlv_6= 'method' ( (lv_method_7_0= ruleEEndpointMethod ) ) )? (otherlv_8= 'type' ( (lv_type_9_0= ruleEEndpointType ) ) )? (otherlv_10= 'role_authorities' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalSecurityDsl.g:1189:2: (otherlv_0= 'Endpoint' otherlv_1= '{' otherlv_2= 'url' ( (lv_url_3_0= ruleEString ) ) (otherlv_4= 'functionName' ( (lv_functionName_5_0= ruleEString ) ) )? (otherlv_6= 'method' ( (lv_method_7_0= ruleEEndpointMethod ) ) )? (otherlv_8= 'type' ( (lv_type_9_0= ruleEEndpointType ) ) )? (otherlv_10= 'role_authorities' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // InternalSecurityDsl.g:1190:3: otherlv_0= 'Endpoint' otherlv_1= '{' otherlv_2= 'url' ( (lv_url_3_0= ruleEString ) ) (otherlv_4= 'functionName' ( (lv_functionName_5_0= ruleEString ) ) )? (otherlv_6= 'method' ( (lv_method_7_0= ruleEEndpointMethod ) ) )? (otherlv_8= 'type' ( (lv_type_9_0= ruleEEndpointType ) ) )? (otherlv_10= 'role_authorities' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEndpointAccess().getEndpointKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getEndpointAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getEndpointAccess().getUrlKeyword_2());
            		
            // InternalSecurityDsl.g:1202:3: ( (lv_url_3_0= ruleEString ) )
            // InternalSecurityDsl.g:1203:4: (lv_url_3_0= ruleEString )
            {
            // InternalSecurityDsl.g:1203:4: (lv_url_3_0= ruleEString )
            // InternalSecurityDsl.g:1204:5: lv_url_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEndpointAccess().getUrlEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_39);
            lv_url_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEndpointRule());
            					}
            					set(
            						current,
            						"url",
            						lv_url_3_0,
            						"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecurityDsl.g:1221:3: (otherlv_4= 'functionName' ( (lv_functionName_5_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==42) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSecurityDsl.g:1222:4: otherlv_4= 'functionName' ( (lv_functionName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,42,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEndpointAccess().getFunctionNameKeyword_4_0());
                    			
                    // InternalSecurityDsl.g:1226:4: ( (lv_functionName_5_0= ruleEString ) )
                    // InternalSecurityDsl.g:1227:5: (lv_functionName_5_0= ruleEString )
                    {
                    // InternalSecurityDsl.g:1227:5: (lv_functionName_5_0= ruleEString )
                    // InternalSecurityDsl.g:1228:6: lv_functionName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEndpointAccess().getFunctionNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_functionName_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEndpointRule());
                    						}
                    						set(
                    							current,
                    							"functionName",
                    							lv_functionName_5_0,
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:1246:3: (otherlv_6= 'method' ( (lv_method_7_0= ruleEEndpointMethod ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==43) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSecurityDsl.g:1247:4: otherlv_6= 'method' ( (lv_method_7_0= ruleEEndpointMethod ) )
                    {
                    otherlv_6=(Token)match(input,43,FOLLOW_41); 

                    				newLeafNode(otherlv_6, grammarAccess.getEndpointAccess().getMethodKeyword_5_0());
                    			
                    // InternalSecurityDsl.g:1251:4: ( (lv_method_7_0= ruleEEndpointMethod ) )
                    // InternalSecurityDsl.g:1252:5: (lv_method_7_0= ruleEEndpointMethod )
                    {
                    // InternalSecurityDsl.g:1252:5: (lv_method_7_0= ruleEEndpointMethod )
                    // InternalSecurityDsl.g:1253:6: lv_method_7_0= ruleEEndpointMethod
                    {

                    						newCompositeNode(grammarAccess.getEndpointAccess().getMethodEEndpointMethodEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_method_7_0=ruleEEndpointMethod();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEndpointRule());
                    						}
                    						set(
                    							current,
                    							"method",
                    							lv_method_7_0,
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.EEndpointMethod");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:1271:3: (otherlv_8= 'type' ( (lv_type_9_0= ruleEEndpointType ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSecurityDsl.g:1272:4: otherlv_8= 'type' ( (lv_type_9_0= ruleEEndpointType ) )
                    {
                    otherlv_8=(Token)match(input,33,FOLLOW_43); 

                    				newLeafNode(otherlv_8, grammarAccess.getEndpointAccess().getTypeKeyword_6_0());
                    			
                    // InternalSecurityDsl.g:1276:4: ( (lv_type_9_0= ruleEEndpointType ) )
                    // InternalSecurityDsl.g:1277:5: (lv_type_9_0= ruleEEndpointType )
                    {
                    // InternalSecurityDsl.g:1277:5: (lv_type_9_0= ruleEEndpointType )
                    // InternalSecurityDsl.g:1278:6: lv_type_9_0= ruleEEndpointType
                    {

                    						newCompositeNode(grammarAccess.getEndpointAccess().getTypeEEndpointTypeEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_type_9_0=ruleEEndpointType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEndpointRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_9_0,
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.EEndpointType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:1296:3: (otherlv_10= 'role_authorities' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==44) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSecurityDsl.g:1297:4: otherlv_10= 'role_authorities' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,44,FOLLOW_45); 

                    				newLeafNode(otherlv_10, grammarAccess.getEndpointAccess().getRole_authoritiesKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getEndpointAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalSecurityDsl.g:1305:4: ( ( ruleEString ) )
                    // InternalSecurityDsl.g:1306:5: ( ruleEString )
                    {
                    // InternalSecurityDsl.g:1306:5: ( ruleEString )
                    // InternalSecurityDsl.g:1307:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEndpointRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEndpointAccess().getRole_authoritiesRoleInstanceCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_46);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSecurityDsl.g:1321:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==21) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalSecurityDsl.g:1322:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEndpointAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalSecurityDsl.g:1326:5: ( ( ruleEString ) )
                    	    // InternalSecurityDsl.g:1327:6: ( ruleEString )
                    	    {
                    	    // InternalSecurityDsl.g:1327:6: ( ruleEString )
                    	    // InternalSecurityDsl.g:1328:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEndpointRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEndpointAccess().getRole_authoritiesRoleInstanceCrossReference_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_46);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,46,FOLLOW_21); 

                    				newLeafNode(otherlv_15, grammarAccess.getEndpointAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getEndpointAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalSecurityDsl.g:1356:1: entryRuleAuthentication returns [EObject current=null] : iv_ruleAuthentication= ruleAuthentication EOF ;
    public final EObject entryRuleAuthentication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthentication = null;


        try {
            // InternalSecurityDsl.g:1356:55: (iv_ruleAuthentication= ruleAuthentication EOF )
            // InternalSecurityDsl.g:1357:2: iv_ruleAuthentication= ruleAuthentication EOF
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
    // InternalSecurityDsl.g:1363:1: ruleAuthentication returns [EObject current=null] : ( () otherlv_1= 'Authentication' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'path' ( (lv_path_5_0= ruleEString ) ) )? (otherlv_6= 'controller_endpoints' otherlv_7= '{' ( (lv_controller_endpoints_8_0= ruleEndpoint ) ) (otherlv_9= ',' ( (lv_controller_endpoints_10_0= ruleEndpoint ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleAuthentication() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_path_5_0 = null;

        EObject lv_controller_endpoints_8_0 = null;

        EObject lv_controller_endpoints_10_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:1369:2: ( ( () otherlv_1= 'Authentication' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'path' ( (lv_path_5_0= ruleEString ) ) )? (otherlv_6= 'controller_endpoints' otherlv_7= '{' ( (lv_controller_endpoints_8_0= ruleEndpoint ) ) (otherlv_9= ',' ( (lv_controller_endpoints_10_0= ruleEndpoint ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalSecurityDsl.g:1370:2: ( () otherlv_1= 'Authentication' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'path' ( (lv_path_5_0= ruleEString ) ) )? (otherlv_6= 'controller_endpoints' otherlv_7= '{' ( (lv_controller_endpoints_8_0= ruleEndpoint ) ) (otherlv_9= ',' ( (lv_controller_endpoints_10_0= ruleEndpoint ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalSecurityDsl.g:1370:2: ( () otherlv_1= 'Authentication' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'path' ( (lv_path_5_0= ruleEString ) ) )? (otherlv_6= 'controller_endpoints' otherlv_7= '{' ( (lv_controller_endpoints_8_0= ruleEndpoint ) ) (otherlv_9= ',' ( (lv_controller_endpoints_10_0= ruleEndpoint ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalSecurityDsl.g:1371:3: () otherlv_1= 'Authentication' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'path' ( (lv_path_5_0= ruleEString ) ) )? (otherlv_6= 'controller_endpoints' otherlv_7= '{' ( (lv_controller_endpoints_8_0= ruleEndpoint ) ) (otherlv_9= ',' ( (lv_controller_endpoints_10_0= ruleEndpoint ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalSecurityDsl.g:1371:3: ()
            // InternalSecurityDsl.g:1372:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAuthenticationAccess().getAuthenticationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAuthenticationAccess().getAuthenticationKeyword_1());
            		
            // InternalSecurityDsl.g:1382:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSecurityDsl.g:1383:4: (lv_name_2_0= ruleEString )
            {
            // InternalSecurityDsl.g:1383:4: (lv_name_2_0= ruleEString )
            // InternalSecurityDsl.g:1384:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAuthenticationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAuthenticationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_47); 

            			newLeafNode(otherlv_3, grammarAccess.getAuthenticationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSecurityDsl.g:1405:3: (otherlv_4= 'path' ( (lv_path_5_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==48) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSecurityDsl.g:1406:4: otherlv_4= 'path' ( (lv_path_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,48,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getAuthenticationAccess().getPathKeyword_4_0());
                    			
                    // InternalSecurityDsl.g:1410:4: ( (lv_path_5_0= ruleEString ) )
                    // InternalSecurityDsl.g:1411:5: (lv_path_5_0= ruleEString )
                    {
                    // InternalSecurityDsl.g:1411:5: (lv_path_5_0= ruleEString )
                    // InternalSecurityDsl.g:1412:6: lv_path_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAuthenticationAccess().getPathEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_path_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAuthenticationRule());
                    						}
                    						set(
                    							current,
                    							"path",
                    							lv_path_5_0,
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:1430:3: (otherlv_6= 'controller_endpoints' otherlv_7= '{' ( (lv_controller_endpoints_8_0= ruleEndpoint ) ) (otherlv_9= ',' ( (lv_controller_endpoints_10_0= ruleEndpoint ) ) )* otherlv_11= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==49) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSecurityDsl.g:1431:4: otherlv_6= 'controller_endpoints' otherlv_7= '{' ( (lv_controller_endpoints_8_0= ruleEndpoint ) ) (otherlv_9= ',' ( (lv_controller_endpoints_10_0= ruleEndpoint ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,49,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getAuthenticationAccess().getController_endpointsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_49); 

                    				newLeafNode(otherlv_7, grammarAccess.getAuthenticationAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalSecurityDsl.g:1439:4: ( (lv_controller_endpoints_8_0= ruleEndpoint ) )
                    // InternalSecurityDsl.g:1440:5: (lv_controller_endpoints_8_0= ruleEndpoint )
                    {
                    // InternalSecurityDsl.g:1440:5: (lv_controller_endpoints_8_0= ruleEndpoint )
                    // InternalSecurityDsl.g:1441:6: lv_controller_endpoints_8_0= ruleEndpoint
                    {

                    						newCompositeNode(grammarAccess.getAuthenticationAccess().getController_endpointsEndpointParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_controller_endpoints_8_0=ruleEndpoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAuthenticationRule());
                    						}
                    						add(
                    							current,
                    							"controller_endpoints",
                    							lv_controller_endpoints_8_0,
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.Endpoint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSecurityDsl.g:1458:4: (otherlv_9= ',' ( (lv_controller_endpoints_10_0= ruleEndpoint ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==21) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalSecurityDsl.g:1459:5: otherlv_9= ',' ( (lv_controller_endpoints_10_0= ruleEndpoint ) )
                    	    {
                    	    otherlv_9=(Token)match(input,21,FOLLOW_49); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getAuthenticationAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSecurityDsl.g:1463:5: ( (lv_controller_endpoints_10_0= ruleEndpoint ) )
                    	    // InternalSecurityDsl.g:1464:6: (lv_controller_endpoints_10_0= ruleEndpoint )
                    	    {
                    	    // InternalSecurityDsl.g:1464:6: (lv_controller_endpoints_10_0= ruleEndpoint )
                    	    // InternalSecurityDsl.g:1465:7: lv_controller_endpoints_10_0= ruleEndpoint
                    	    {

                    	    							newCompositeNode(grammarAccess.getAuthenticationAccess().getController_endpointsEndpointParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_controller_endpoints_10_0=ruleEndpoint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAuthenticationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"controller_endpoints",
                    	    								lv_controller_endpoints_10_0,
                    	    								"rs.ac.uns.ftn.securitydsl.SecurityDsl.Endpoint");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,22,FOLLOW_21); 

                    				newLeafNode(otherlv_11, grammarAccess.getAuthenticationAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getAuthenticationAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalSecurityDsl.g:1496:1: entryRuleJWT returns [EObject current=null] : iv_ruleJWT= ruleJWT EOF ;
    public final EObject entryRuleJWT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJWT = null;


        try {
            // InternalSecurityDsl.g:1496:44: (iv_ruleJWT= ruleJWT EOF )
            // InternalSecurityDsl.g:1497:2: iv_ruleJWT= ruleJWT EOF
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
    // InternalSecurityDsl.g:1503:1: ruleJWT returns [EObject current=null] : (otherlv_0= 'JWT' otherlv_1= '{' otherlv_2= 'signatureAlgorithm' ( (lv_signatureAlgorithm_3_0= ruleEString ) ) (otherlv_4= 'secret' ( (lv_secret_5_0= ruleEString ) ) )? (otherlv_6= 'jwt_claims' otherlv_7= '{' ( (lv_jwt_claims_8_0= ruleClaim ) ) (otherlv_9= ',' ( (lv_jwt_claims_10_0= ruleClaim ) ) )* otherlv_11= '}' )? otherlv_12= 'registeredclaims' ( (lv_registeredclaims_13_0= ruleRegisteredClaims ) ) otherlv_14= '}' ) ;
    public final EObject ruleJWT() throws RecognitionException {
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
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_signatureAlgorithm_3_0 = null;

        AntlrDatatypeRuleToken lv_secret_5_0 = null;

        EObject lv_jwt_claims_8_0 = null;

        EObject lv_jwt_claims_10_0 = null;

        EObject lv_registeredclaims_13_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:1509:2: ( (otherlv_0= 'JWT' otherlv_1= '{' otherlv_2= 'signatureAlgorithm' ( (lv_signatureAlgorithm_3_0= ruleEString ) ) (otherlv_4= 'secret' ( (lv_secret_5_0= ruleEString ) ) )? (otherlv_6= 'jwt_claims' otherlv_7= '{' ( (lv_jwt_claims_8_0= ruleClaim ) ) (otherlv_9= ',' ( (lv_jwt_claims_10_0= ruleClaim ) ) )* otherlv_11= '}' )? otherlv_12= 'registeredclaims' ( (lv_registeredclaims_13_0= ruleRegisteredClaims ) ) otherlv_14= '}' ) )
            // InternalSecurityDsl.g:1510:2: (otherlv_0= 'JWT' otherlv_1= '{' otherlv_2= 'signatureAlgorithm' ( (lv_signatureAlgorithm_3_0= ruleEString ) ) (otherlv_4= 'secret' ( (lv_secret_5_0= ruleEString ) ) )? (otherlv_6= 'jwt_claims' otherlv_7= '{' ( (lv_jwt_claims_8_0= ruleClaim ) ) (otherlv_9= ',' ( (lv_jwt_claims_10_0= ruleClaim ) ) )* otherlv_11= '}' )? otherlv_12= 'registeredclaims' ( (lv_registeredclaims_13_0= ruleRegisteredClaims ) ) otherlv_14= '}' )
            {
            // InternalSecurityDsl.g:1510:2: (otherlv_0= 'JWT' otherlv_1= '{' otherlv_2= 'signatureAlgorithm' ( (lv_signatureAlgorithm_3_0= ruleEString ) ) (otherlv_4= 'secret' ( (lv_secret_5_0= ruleEString ) ) )? (otherlv_6= 'jwt_claims' otherlv_7= '{' ( (lv_jwt_claims_8_0= ruleClaim ) ) (otherlv_9= ',' ( (lv_jwt_claims_10_0= ruleClaim ) ) )* otherlv_11= '}' )? otherlv_12= 'registeredclaims' ( (lv_registeredclaims_13_0= ruleRegisteredClaims ) ) otherlv_14= '}' )
            // InternalSecurityDsl.g:1511:3: otherlv_0= 'JWT' otherlv_1= '{' otherlv_2= 'signatureAlgorithm' ( (lv_signatureAlgorithm_3_0= ruleEString ) ) (otherlv_4= 'secret' ( (lv_secret_5_0= ruleEString ) ) )? (otherlv_6= 'jwt_claims' otherlv_7= '{' ( (lv_jwt_claims_8_0= ruleClaim ) ) (otherlv_9= ',' ( (lv_jwt_claims_10_0= ruleClaim ) ) )* otherlv_11= '}' )? otherlv_12= 'registeredclaims' ( (lv_registeredclaims_13_0= ruleRegisteredClaims ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getJWTAccess().getJWTKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_50); 

            			newLeafNode(otherlv_1, grammarAccess.getJWTAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,51,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getJWTAccess().getSignatureAlgorithmKeyword_2());
            		
            // InternalSecurityDsl.g:1523:3: ( (lv_signatureAlgorithm_3_0= ruleEString ) )
            // InternalSecurityDsl.g:1524:4: (lv_signatureAlgorithm_3_0= ruleEString )
            {
            // InternalSecurityDsl.g:1524:4: (lv_signatureAlgorithm_3_0= ruleEString )
            // InternalSecurityDsl.g:1525:5: lv_signatureAlgorithm_3_0= ruleEString
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
            						"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecurityDsl.g:1542:3: (otherlv_4= 'secret' ( (lv_secret_5_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==52) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSecurityDsl.g:1543:4: otherlv_4= 'secret' ( (lv_secret_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,52,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getJWTAccess().getSecretKeyword_4_0());
                    			
                    // InternalSecurityDsl.g:1547:4: ( (lv_secret_5_0= ruleEString ) )
                    // InternalSecurityDsl.g:1548:5: (lv_secret_5_0= ruleEString )
                    {
                    // InternalSecurityDsl.g:1548:5: (lv_secret_5_0= ruleEString )
                    // InternalSecurityDsl.g:1549:6: lv_secret_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getJWTAccess().getSecretEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_secret_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJWTRule());
                    						}
                    						set(
                    							current,
                    							"secret",
                    							lv_secret_5_0,
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:1567:3: (otherlv_6= 'jwt_claims' otherlv_7= '{' ( (lv_jwt_claims_8_0= ruleClaim ) ) (otherlv_9= ',' ( (lv_jwt_claims_10_0= ruleClaim ) ) )* otherlv_11= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==53) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSecurityDsl.g:1568:4: otherlv_6= 'jwt_claims' otherlv_7= '{' ( (lv_jwt_claims_8_0= ruleClaim ) ) (otherlv_9= ',' ( (lv_jwt_claims_10_0= ruleClaim ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,53,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getJWTAccess().getJwt_claimsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_53); 

                    				newLeafNode(otherlv_7, grammarAccess.getJWTAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalSecurityDsl.g:1576:4: ( (lv_jwt_claims_8_0= ruleClaim ) )
                    // InternalSecurityDsl.g:1577:5: (lv_jwt_claims_8_0= ruleClaim )
                    {
                    // InternalSecurityDsl.g:1577:5: (lv_jwt_claims_8_0= ruleClaim )
                    // InternalSecurityDsl.g:1578:6: lv_jwt_claims_8_0= ruleClaim
                    {

                    						newCompositeNode(grammarAccess.getJWTAccess().getJwt_claimsClaimParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_jwt_claims_8_0=ruleClaim();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJWTRule());
                    						}
                    						add(
                    							current,
                    							"jwt_claims",
                    							lv_jwt_claims_8_0,
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.Claim");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSecurityDsl.g:1595:4: (otherlv_9= ',' ( (lv_jwt_claims_10_0= ruleClaim ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==21) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalSecurityDsl.g:1596:5: otherlv_9= ',' ( (lv_jwt_claims_10_0= ruleClaim ) )
                    	    {
                    	    otherlv_9=(Token)match(input,21,FOLLOW_53); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getJWTAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSecurityDsl.g:1600:5: ( (lv_jwt_claims_10_0= ruleClaim ) )
                    	    // InternalSecurityDsl.g:1601:6: (lv_jwt_claims_10_0= ruleClaim )
                    	    {
                    	    // InternalSecurityDsl.g:1601:6: (lv_jwt_claims_10_0= ruleClaim )
                    	    // InternalSecurityDsl.g:1602:7: lv_jwt_claims_10_0= ruleClaim
                    	    {

                    	    							newCompositeNode(grammarAccess.getJWTAccess().getJwt_claimsClaimParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_jwt_claims_10_0=ruleClaim();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getJWTRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"jwt_claims",
                    	    								lv_jwt_claims_10_0,
                    	    								"rs.ac.uns.ftn.securitydsl.SecurityDsl.Claim");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,22,FOLLOW_54); 

                    				newLeafNode(otherlv_11, grammarAccess.getJWTAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,54,FOLLOW_55); 

            			newLeafNode(otherlv_12, grammarAccess.getJWTAccess().getRegisteredclaimsKeyword_6());
            		
            // InternalSecurityDsl.g:1629:3: ( (lv_registeredclaims_13_0= ruleRegisteredClaims ) )
            // InternalSecurityDsl.g:1630:4: (lv_registeredclaims_13_0= ruleRegisteredClaims )
            {
            // InternalSecurityDsl.g:1630:4: (lv_registeredclaims_13_0= ruleRegisteredClaims )
            // InternalSecurityDsl.g:1631:5: lv_registeredclaims_13_0= ruleRegisteredClaims
            {

            					newCompositeNode(grammarAccess.getJWTAccess().getRegisteredclaimsRegisteredClaimsParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_21);
            lv_registeredclaims_13_0=ruleRegisteredClaims();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJWTRule());
            					}
            					set(
            						current,
            						"registeredclaims",
            						lv_registeredclaims_13_0,
            						"rs.ac.uns.ftn.securitydsl.SecurityDsl.RegisteredClaims");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getJWTAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalSecurityDsl.g:1656:1: entryRuleClaim returns [EObject current=null] : iv_ruleClaim= ruleClaim EOF ;
    public final EObject entryRuleClaim() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClaim = null;


        try {
            // InternalSecurityDsl.g:1656:46: (iv_ruleClaim= ruleClaim EOF )
            // InternalSecurityDsl.g:1657:2: iv_ruleClaim= ruleClaim EOF
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
    // InternalSecurityDsl.g:1663:1: ruleClaim returns [EObject current=null] : (otherlv_0= 'Claim' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEClaimType ) ) )? otherlv_5= 'claim_attribute' ( ( ruleEString ) ) otherlv_7= '}' ) ;
    public final EObject ruleClaim() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:1669:2: ( (otherlv_0= 'Claim' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEClaimType ) ) )? otherlv_5= 'claim_attribute' ( ( ruleEString ) ) otherlv_7= '}' ) )
            // InternalSecurityDsl.g:1670:2: (otherlv_0= 'Claim' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEClaimType ) ) )? otherlv_5= 'claim_attribute' ( ( ruleEString ) ) otherlv_7= '}' )
            {
            // InternalSecurityDsl.g:1670:2: (otherlv_0= 'Claim' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEClaimType ) ) )? otherlv_5= 'claim_attribute' ( ( ruleEString ) ) otherlv_7= '}' )
            // InternalSecurityDsl.g:1671:3: otherlv_0= 'Claim' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEClaimType ) ) )? otherlv_5= 'claim_attribute' ( ( ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getClaimAccess().getClaimKeyword_0());
            		
            // InternalSecurityDsl.g:1675:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSecurityDsl.g:1676:4: (lv_name_1_0= ruleEString )
            {
            // InternalSecurityDsl.g:1676:4: (lv_name_1_0= ruleEString )
            // InternalSecurityDsl.g:1677:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClaimAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClaimRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_56); 

            			newLeafNode(otherlv_2, grammarAccess.getClaimAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSecurityDsl.g:1698:3: (otherlv_3= 'type' ( (lv_type_4_0= ruleEClaimType ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==33) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSecurityDsl.g:1699:4: otherlv_3= 'type' ( (lv_type_4_0= ruleEClaimType ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_57); 

                    				newLeafNode(otherlv_3, grammarAccess.getClaimAccess().getTypeKeyword_3_0());
                    			
                    // InternalSecurityDsl.g:1703:4: ( (lv_type_4_0= ruleEClaimType ) )
                    // InternalSecurityDsl.g:1704:5: (lv_type_4_0= ruleEClaimType )
                    {
                    // InternalSecurityDsl.g:1704:5: (lv_type_4_0= ruleEClaimType )
                    // InternalSecurityDsl.g:1705:6: lv_type_4_0= ruleEClaimType
                    {

                    						newCompositeNode(grammarAccess.getClaimAccess().getTypeEClaimTypeEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_58);
                    lv_type_4_0=ruleEClaimType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClaimRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.EClaimType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getClaimAccess().getClaim_attributeKeyword_4());
            		
            // InternalSecurityDsl.g:1727:3: ( ( ruleEString ) )
            // InternalSecurityDsl.g:1728:4: ( ruleEString )
            {
            // InternalSecurityDsl.g:1728:4: ( ruleEString )
            // InternalSecurityDsl.g:1729:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClaimRule());
            					}
            				

            					newCompositeNode(grammarAccess.getClaimAccess().getClaim_attributeAttributeCrossReference_5_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getClaimAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "entryRuleRegisteredClaims"
    // InternalSecurityDsl.g:1751:1: entryRuleRegisteredClaims returns [EObject current=null] : iv_ruleRegisteredClaims= ruleRegisteredClaims EOF ;
    public final EObject entryRuleRegisteredClaims() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegisteredClaims = null;


        try {
            // InternalSecurityDsl.g:1751:57: (iv_ruleRegisteredClaims= ruleRegisteredClaims EOF )
            // InternalSecurityDsl.g:1752:2: iv_ruleRegisteredClaims= ruleRegisteredClaims EOF
            {
             newCompositeNode(grammarAccess.getRegisteredClaimsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegisteredClaims=ruleRegisteredClaims();

            state._fsp--;

             current =iv_ruleRegisteredClaims; 
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
    // $ANTLR end "entryRuleRegisteredClaims"


    // $ANTLR start "ruleRegisteredClaims"
    // InternalSecurityDsl.g:1758:1: ruleRegisteredClaims returns [EObject current=null] : (otherlv_0= 'RegisteredClaims' otherlv_1= '{' otherlv_2= 'expirationTime' ( (lv_expirationTime_3_0= ruleEInt ) ) (otherlv_4= 'issuer' ( (lv_issuer_5_0= ruleEString ) ) )? (otherlv_6= 'audience' ( (lv_audience_7_0= ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleRegisteredClaims() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_expirationTime_3_0 = null;

        AntlrDatatypeRuleToken lv_issuer_5_0 = null;

        AntlrDatatypeRuleToken lv_audience_7_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:1764:2: ( (otherlv_0= 'RegisteredClaims' otherlv_1= '{' otherlv_2= 'expirationTime' ( (lv_expirationTime_3_0= ruleEInt ) ) (otherlv_4= 'issuer' ( (lv_issuer_5_0= ruleEString ) ) )? (otherlv_6= 'audience' ( (lv_audience_7_0= ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalSecurityDsl.g:1765:2: (otherlv_0= 'RegisteredClaims' otherlv_1= '{' otherlv_2= 'expirationTime' ( (lv_expirationTime_3_0= ruleEInt ) ) (otherlv_4= 'issuer' ( (lv_issuer_5_0= ruleEString ) ) )? (otherlv_6= 'audience' ( (lv_audience_7_0= ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalSecurityDsl.g:1765:2: (otherlv_0= 'RegisteredClaims' otherlv_1= '{' otherlv_2= 'expirationTime' ( (lv_expirationTime_3_0= ruleEInt ) ) (otherlv_4= 'issuer' ( (lv_issuer_5_0= ruleEString ) ) )? (otherlv_6= 'audience' ( (lv_audience_7_0= ruleEString ) ) )? otherlv_8= '}' )
            // InternalSecurityDsl.g:1766:3: otherlv_0= 'RegisteredClaims' otherlv_1= '{' otherlv_2= 'expirationTime' ( (lv_expirationTime_3_0= ruleEInt ) ) (otherlv_4= 'issuer' ( (lv_issuer_5_0= ruleEString ) ) )? (otherlv_6= 'audience' ( (lv_audience_7_0= ruleEString ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRegisteredClaimsAccess().getRegisteredClaimsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_59); 

            			newLeafNode(otherlv_1, grammarAccess.getRegisteredClaimsAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,58,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getRegisteredClaimsAccess().getExpirationTimeKeyword_2());
            		
            // InternalSecurityDsl.g:1778:3: ( (lv_expirationTime_3_0= ruleEInt ) )
            // InternalSecurityDsl.g:1779:4: (lv_expirationTime_3_0= ruleEInt )
            {
            // InternalSecurityDsl.g:1779:4: (lv_expirationTime_3_0= ruleEInt )
            // InternalSecurityDsl.g:1780:5: lv_expirationTime_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRegisteredClaimsAccess().getExpirationTimeEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_60);
            lv_expirationTime_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRegisteredClaimsRule());
            					}
            					set(
            						current,
            						"expirationTime",
            						lv_expirationTime_3_0,
            						"rs.ac.uns.ftn.securitydsl.SecurityDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecurityDsl.g:1797:3: (otherlv_4= 'issuer' ( (lv_issuer_5_0= ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==59) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSecurityDsl.g:1798:4: otherlv_4= 'issuer' ( (lv_issuer_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,59,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getRegisteredClaimsAccess().getIssuerKeyword_4_0());
                    			
                    // InternalSecurityDsl.g:1802:4: ( (lv_issuer_5_0= ruleEString ) )
                    // InternalSecurityDsl.g:1803:5: (lv_issuer_5_0= ruleEString )
                    {
                    // InternalSecurityDsl.g:1803:5: (lv_issuer_5_0= ruleEString )
                    // InternalSecurityDsl.g:1804:6: lv_issuer_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRegisteredClaimsAccess().getIssuerEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_61);
                    lv_issuer_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRegisteredClaimsRule());
                    						}
                    						set(
                    							current,
                    							"issuer",
                    							lv_issuer_5_0,
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:1822:3: (otherlv_6= 'audience' ( (lv_audience_7_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==60) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSecurityDsl.g:1823:4: otherlv_6= 'audience' ( (lv_audience_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,60,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getRegisteredClaimsAccess().getAudienceKeyword_5_0());
                    			
                    // InternalSecurityDsl.g:1827:4: ( (lv_audience_7_0= ruleEString ) )
                    // InternalSecurityDsl.g:1828:5: (lv_audience_7_0= ruleEString )
                    {
                    // InternalSecurityDsl.g:1828:5: (lv_audience_7_0= ruleEString )
                    // InternalSecurityDsl.g:1829:6: lv_audience_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRegisteredClaimsAccess().getAudienceEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_audience_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRegisteredClaimsRule());
                    						}
                    						set(
                    							current,
                    							"audience",
                    							lv_audience_7_0,
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRegisteredClaimsAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleRegisteredClaims"


    // $ANTLR start "entryRuleEInt"
    // InternalSecurityDsl.g:1855:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSecurityDsl.g:1855:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSecurityDsl.g:1856:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalSecurityDsl.g:1862:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSecurityDsl.g:1868:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSecurityDsl.g:1869:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSecurityDsl.g:1869:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSecurityDsl.g:1870:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSecurityDsl.g:1870:3: (kw= '-' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==30) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSecurityDsl.g:1871:4: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_27); 

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
    // InternalSecurityDsl.g:1888:1: ruleEDatabaseType returns [Enumerator current=null] : ( (enumLiteral_0= 'PostgreSQL' ) | (enumLiteral_1= 'Oracle' ) | (enumLiteral_2= 'MySQL' ) ) ;
    public final Enumerator ruleEDatabaseType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSecurityDsl.g:1894:2: ( ( (enumLiteral_0= 'PostgreSQL' ) | (enumLiteral_1= 'Oracle' ) | (enumLiteral_2= 'MySQL' ) ) )
            // InternalSecurityDsl.g:1895:2: ( (enumLiteral_0= 'PostgreSQL' ) | (enumLiteral_1= 'Oracle' ) | (enumLiteral_2= 'MySQL' ) )
            {
            // InternalSecurityDsl.g:1895:2: ( (enumLiteral_0= 'PostgreSQL' ) | (enumLiteral_1= 'Oracle' ) | (enumLiteral_2= 'MySQL' ) )
            int alt40=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt40=1;
                }
                break;
            case 62:
                {
                alt40=2;
                }
                break;
            case 63:
                {
                alt40=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalSecurityDsl.g:1896:3: (enumLiteral_0= 'PostgreSQL' )
                    {
                    // InternalSecurityDsl.g:1896:3: (enumLiteral_0= 'PostgreSQL' )
                    // InternalSecurityDsl.g:1897:4: enumLiteral_0= 'PostgreSQL'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getEDatabaseTypeAccess().getPostgreSQLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEDatabaseTypeAccess().getPostgreSQLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:1904:3: (enumLiteral_1= 'Oracle' )
                    {
                    // InternalSecurityDsl.g:1904:3: (enumLiteral_1= 'Oracle' )
                    // InternalSecurityDsl.g:1905:4: enumLiteral_1= 'Oracle'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getEDatabaseTypeAccess().getOracleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEDatabaseTypeAccess().getOracleEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:1912:3: (enumLiteral_2= 'MySQL' )
                    {
                    // InternalSecurityDsl.g:1912:3: (enumLiteral_2= 'MySQL' )
                    // InternalSecurityDsl.g:1913:4: enumLiteral_2= 'MySQL'
                    {
                    enumLiteral_2=(Token)match(input,63,FOLLOW_2); 

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
    // InternalSecurityDsl.g:1923:1: ruleEType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Float' ) | (enumLiteral_2= 'Long' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'char' ) | (enumLiteral_5= 'Double' ) | (enumLiteral_6= 'DateTime' ) | (enumLiteral_7= 'Date' ) | (enumLiteral_8= 'int' ) ) ;
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
            // InternalSecurityDsl.g:1929:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Float' ) | (enumLiteral_2= 'Long' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'char' ) | (enumLiteral_5= 'Double' ) | (enumLiteral_6= 'DateTime' ) | (enumLiteral_7= 'Date' ) | (enumLiteral_8= 'int' ) ) )
            // InternalSecurityDsl.g:1930:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Float' ) | (enumLiteral_2= 'Long' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'char' ) | (enumLiteral_5= 'Double' ) | (enumLiteral_6= 'DateTime' ) | (enumLiteral_7= 'Date' ) | (enumLiteral_8= 'int' ) )
            {
            // InternalSecurityDsl.g:1930:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Float' ) | (enumLiteral_2= 'Long' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'char' ) | (enumLiteral_5= 'Double' ) | (enumLiteral_6= 'DateTime' ) | (enumLiteral_7= 'Date' ) | (enumLiteral_8= 'int' ) )
            int alt41=9;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt41=1;
                }
                break;
            case 65:
                {
                alt41=2;
                }
                break;
            case 66:
                {
                alt41=3;
                }
                break;
            case 67:
                {
                alt41=4;
                }
                break;
            case 68:
                {
                alt41=5;
                }
                break;
            case 69:
                {
                alt41=6;
                }
                break;
            case 70:
                {
                alt41=7;
                }
                break;
            case 71:
                {
                alt41=8;
                }
                break;
            case 72:
                {
                alt41=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalSecurityDsl.g:1931:3: (enumLiteral_0= 'String' )
                    {
                    // InternalSecurityDsl.g:1931:3: (enumLiteral_0= 'String' )
                    // InternalSecurityDsl.g:1932:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getETypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:1939:3: (enumLiteral_1= 'Float' )
                    {
                    // InternalSecurityDsl.g:1939:3: (enumLiteral_1= 'Float' )
                    // InternalSecurityDsl.g:1940:4: enumLiteral_1= 'Float'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getFloatEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getETypeAccess().getFloatEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:1947:3: (enumLiteral_2= 'Long' )
                    {
                    // InternalSecurityDsl.g:1947:3: (enumLiteral_2= 'Long' )
                    // InternalSecurityDsl.g:1948:4: enumLiteral_2= 'Long'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getLongEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getETypeAccess().getLongEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:1955:3: (enumLiteral_3= 'Integer' )
                    {
                    // InternalSecurityDsl.g:1955:3: (enumLiteral_3= 'Integer' )
                    // InternalSecurityDsl.g:1956:4: enumLiteral_3= 'Integer'
                    {
                    enumLiteral_3=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getIntegerEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getETypeAccess().getIntegerEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSecurityDsl.g:1963:3: (enumLiteral_4= 'char' )
                    {
                    // InternalSecurityDsl.g:1963:3: (enumLiteral_4= 'char' )
                    // InternalSecurityDsl.g:1964:4: enumLiteral_4= 'char'
                    {
                    enumLiteral_4=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getCharEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getETypeAccess().getCharEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSecurityDsl.g:1971:3: (enumLiteral_5= 'Double' )
                    {
                    // InternalSecurityDsl.g:1971:3: (enumLiteral_5= 'Double' )
                    // InternalSecurityDsl.g:1972:4: enumLiteral_5= 'Double'
                    {
                    enumLiteral_5=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getDoubleEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getETypeAccess().getDoubleEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSecurityDsl.g:1979:3: (enumLiteral_6= 'DateTime' )
                    {
                    // InternalSecurityDsl.g:1979:3: (enumLiteral_6= 'DateTime' )
                    // InternalSecurityDsl.g:1980:4: enumLiteral_6= 'DateTime'
                    {
                    enumLiteral_6=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getDateTimeEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getETypeAccess().getDateTimeEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSecurityDsl.g:1987:3: (enumLiteral_7= 'Date' )
                    {
                    // InternalSecurityDsl.g:1987:3: (enumLiteral_7= 'Date' )
                    // InternalSecurityDsl.g:1988:4: enumLiteral_7= 'Date'
                    {
                    enumLiteral_7=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getDateEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getETypeAccess().getDateEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalSecurityDsl.g:1995:3: (enumLiteral_8= 'int' )
                    {
                    // InternalSecurityDsl.g:1995:3: (enumLiteral_8= 'int' )
                    // InternalSecurityDsl.g:1996:4: enumLiteral_8= 'int'
                    {
                    enumLiteral_8=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getIntEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getETypeAccess().getIntEnumLiteralDeclaration_8());
                    			

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
    // InternalSecurityDsl.g:2006:1: ruleEEndpointMethod returns [Enumerator current=null] : ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) ;
    public final Enumerator ruleEEndpointMethod() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSecurityDsl.g:2012:2: ( ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) )
            // InternalSecurityDsl.g:2013:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            {
            // InternalSecurityDsl.g:2013:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            int alt42=4;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt42=1;
                }
                break;
            case 74:
                {
                alt42=2;
                }
                break;
            case 75:
                {
                alt42=3;
                }
                break;
            case 76:
                {
                alt42=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalSecurityDsl.g:2014:3: (enumLiteral_0= 'GET' )
                    {
                    // InternalSecurityDsl.g:2014:3: (enumLiteral_0= 'GET' )
                    // InternalSecurityDsl.g:2015:4: enumLiteral_0= 'GET'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getEEndpointMethodAccess().getGETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEEndpointMethodAccess().getGETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:2022:3: (enumLiteral_1= 'POST' )
                    {
                    // InternalSecurityDsl.g:2022:3: (enumLiteral_1= 'POST' )
                    // InternalSecurityDsl.g:2023:4: enumLiteral_1= 'POST'
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getEEndpointMethodAccess().getPOSTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEEndpointMethodAccess().getPOSTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:2030:3: (enumLiteral_2= 'PUT' )
                    {
                    // InternalSecurityDsl.g:2030:3: (enumLiteral_2= 'PUT' )
                    // InternalSecurityDsl.g:2031:4: enumLiteral_2= 'PUT'
                    {
                    enumLiteral_2=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getEEndpointMethodAccess().getPUTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEEndpointMethodAccess().getPUTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:2038:3: (enumLiteral_3= 'DELETE' )
                    {
                    // InternalSecurityDsl.g:2038:3: (enumLiteral_3= 'DELETE' )
                    // InternalSecurityDsl.g:2039:4: enumLiteral_3= 'DELETE'
                    {
                    enumLiteral_3=(Token)match(input,76,FOLLOW_2); 

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
    // InternalSecurityDsl.g:2049:1: ruleEEndpointType returns [Enumerator current=null] : ( (enumLiteral_0= 'REGISTRATION' ) | (enumLiteral_1= 'LOGIN' ) | (enumLiteral_2= 'LOGOUT' ) | (enumLiteral_3= 'OTHER' ) ) ;
    public final Enumerator ruleEEndpointType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSecurityDsl.g:2055:2: ( ( (enumLiteral_0= 'REGISTRATION' ) | (enumLiteral_1= 'LOGIN' ) | (enumLiteral_2= 'LOGOUT' ) | (enumLiteral_3= 'OTHER' ) ) )
            // InternalSecurityDsl.g:2056:2: ( (enumLiteral_0= 'REGISTRATION' ) | (enumLiteral_1= 'LOGIN' ) | (enumLiteral_2= 'LOGOUT' ) | (enumLiteral_3= 'OTHER' ) )
            {
            // InternalSecurityDsl.g:2056:2: ( (enumLiteral_0= 'REGISTRATION' ) | (enumLiteral_1= 'LOGIN' ) | (enumLiteral_2= 'LOGOUT' ) | (enumLiteral_3= 'OTHER' ) )
            int alt43=4;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt43=1;
                }
                break;
            case 78:
                {
                alt43=2;
                }
                break;
            case 79:
                {
                alt43=3;
                }
                break;
            case 80:
                {
                alt43=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalSecurityDsl.g:2057:3: (enumLiteral_0= 'REGISTRATION' )
                    {
                    // InternalSecurityDsl.g:2057:3: (enumLiteral_0= 'REGISTRATION' )
                    // InternalSecurityDsl.g:2058:4: enumLiteral_0= 'REGISTRATION'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getEEndpointTypeAccess().getREGISTRATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEEndpointTypeAccess().getREGISTRATIONEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:2065:3: (enumLiteral_1= 'LOGIN' )
                    {
                    // InternalSecurityDsl.g:2065:3: (enumLiteral_1= 'LOGIN' )
                    // InternalSecurityDsl.g:2066:4: enumLiteral_1= 'LOGIN'
                    {
                    enumLiteral_1=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getEEndpointTypeAccess().getLOGINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEEndpointTypeAccess().getLOGINEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:2073:3: (enumLiteral_2= 'LOGOUT' )
                    {
                    // InternalSecurityDsl.g:2073:3: (enumLiteral_2= 'LOGOUT' )
                    // InternalSecurityDsl.g:2074:4: enumLiteral_2= 'LOGOUT'
                    {
                    enumLiteral_2=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getEEndpointTypeAccess().getLOGOUTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEEndpointTypeAccess().getLOGOUTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:2081:3: (enumLiteral_3= 'OTHER' )
                    {
                    // InternalSecurityDsl.g:2081:3: (enumLiteral_3= 'OTHER' )
                    // InternalSecurityDsl.g:2082:4: enumLiteral_3= 'OTHER'
                    {
                    enumLiteral_3=(Token)match(input,80,FOLLOW_2); 

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
    // InternalSecurityDsl.g:2092:1: ruleEClaimType returns [Enumerator current=null] : ( (enumLiteral_0= 'PRIVATE' ) | (enumLiteral_1= 'PUBLIC' ) | (enumLiteral_2= 'REGISTERED' ) ) ;
    public final Enumerator ruleEClaimType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSecurityDsl.g:2098:2: ( ( (enumLiteral_0= 'PRIVATE' ) | (enumLiteral_1= 'PUBLIC' ) | (enumLiteral_2= 'REGISTERED' ) ) )
            // InternalSecurityDsl.g:2099:2: ( (enumLiteral_0= 'PRIVATE' ) | (enumLiteral_1= 'PUBLIC' ) | (enumLiteral_2= 'REGISTERED' ) )
            {
            // InternalSecurityDsl.g:2099:2: ( (enumLiteral_0= 'PRIVATE' ) | (enumLiteral_1= 'PUBLIC' ) | (enumLiteral_2= 'REGISTERED' ) )
            int alt44=3;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt44=1;
                }
                break;
            case 82:
                {
                alt44=2;
                }
                break;
            case 83:
                {
                alt44=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalSecurityDsl.g:2100:3: (enumLiteral_0= 'PRIVATE' )
                    {
                    // InternalSecurityDsl.g:2100:3: (enumLiteral_0= 'PRIVATE' )
                    // InternalSecurityDsl.g:2101:4: enumLiteral_0= 'PRIVATE'
                    {
                    enumLiteral_0=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getEClaimTypeAccess().getPRIVATEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEClaimTypeAccess().getPRIVATEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:2108:3: (enumLiteral_1= 'PUBLIC' )
                    {
                    // InternalSecurityDsl.g:2108:3: (enumLiteral_1= 'PUBLIC' )
                    // InternalSecurityDsl.g:2109:4: enumLiteral_1= 'PUBLIC'
                    {
                    enumLiteral_1=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getEClaimTypeAccess().getPUBLICEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEClaimTypeAccess().getPUBLICEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:2116:3: (enumLiteral_2= 'REGISTERED' )
                    {
                    // InternalSecurityDsl.g:2116:3: (enumLiteral_2= 'REGISTERED' )
                    // InternalSecurityDsl.g:2117:4: enumLiteral_2= 'REGISTERED'
                    {
                    enumLiteral_2=(Token)match(input,83,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001DFE000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001DFC000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001DF8000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001DF0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001DE0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001DC0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001D80000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001D00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000008800000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0xE000000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001FFL});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400400000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000007000400000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000006000400000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000400000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000003000400000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00001C0200400000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000180200400000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001E00L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000100200400000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x000000000001E000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000100000400000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000400000200000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0003000000400000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0002000000400000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0070000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0100000200000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x00000000000E0000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x1800000000400000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x1000000000400000L});

}