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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'application:'", "'artifact:'", "'name:'", "'group:'", "'packageName:'", "'description:'", "'port:'", "'hostname:'", "'database:'", "'model:'", "'user:'", "'role:'", "'security:'", "'controller:'", "'auth:'", "'vendor:'", "'url:'", "'username:'", "'password:'", "'-'", "'{'", "'identifier'", "'type:'", "'collumnName:'", "'}'", "'tableName:'", "'attributes:'", "'['", "','", "']'", "'roles:'", "'functionName:'", "'method:'", "'roleAuthorities:'", "'path:'", "'endpoints:'", "'jwt:'", "'header:'", "'signatureAlgorithm:'", "'payload:'", "'claims:'", "'signature:'", "'secret:'", "':'", "'REGISTERED,'", "'expirationTime:'", "'issuer:'", "'audience:'", "'PostgreSQL'", "'Oracle'", "'MySQL'", "'String'", "'Float'", "'Long'", "'Integer'", "'char'", "'Double'", "'DateTime'", "'Date'", "'int'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'REGISTRATION'", "'LOGIN'", "'LOGOUT'", "'OTHER'", "'PRIVATE'", "'PUBLIC'", "'REGISTERED'"
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
    // InternalSecurityDsl.g:72:1: ruleApplication returns [EObject current=null] : ( () otherlv_1= 'application:' (otherlv_2= 'artifact:' ( (lv_artifact_3_0= ruleEString ) ) )? (otherlv_4= 'name:' ( (lv_name_5_0= ruleEString ) ) )? (otherlv_6= 'group:' ( (lv_group_7_0= ruleEString ) ) )? (otherlv_8= 'packageName:' ( (lv_packageName_9_0= ruleEString ) ) )? (otherlv_10= 'description:' ( (lv_description_11_0= ruleEString ) ) )? (otherlv_12= 'port:' ( (lv_port_13_0= ruleELongObject ) ) )? (otherlv_14= 'hostname:' ( (lv_hostname_15_0= ruleEString ) ) )? (otherlv_16= 'database:' ( (lv_app_database_17_0= ruleDatabase ) ) )? (otherlv_18= 'model:' (otherlv_19= 'user:' ( (lv_app_models_20_0= ruleUser ) ) )? (otherlv_21= 'role:' ( (lv_app_models_22_0= ruleRole ) ) )? )? (otherlv_23= 'security:' ( (lv_app_security_24_0= ruleSecurity ) ) )? (otherlv_25= 'controller:' (otherlv_26= 'auth:' ( (lv_app_controllers_27_0= ruleAuthentication ) ) )? )? ) ;
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

        EObject lv_app_models_20_0 = null;

        EObject lv_app_models_22_0 = null;

        EObject lv_app_security_24_0 = null;

        EObject lv_app_controllers_27_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:78:2: ( ( () otherlv_1= 'application:' (otherlv_2= 'artifact:' ( (lv_artifact_3_0= ruleEString ) ) )? (otherlv_4= 'name:' ( (lv_name_5_0= ruleEString ) ) )? (otherlv_6= 'group:' ( (lv_group_7_0= ruleEString ) ) )? (otherlv_8= 'packageName:' ( (lv_packageName_9_0= ruleEString ) ) )? (otherlv_10= 'description:' ( (lv_description_11_0= ruleEString ) ) )? (otherlv_12= 'port:' ( (lv_port_13_0= ruleELongObject ) ) )? (otherlv_14= 'hostname:' ( (lv_hostname_15_0= ruleEString ) ) )? (otherlv_16= 'database:' ( (lv_app_database_17_0= ruleDatabase ) ) )? (otherlv_18= 'model:' (otherlv_19= 'user:' ( (lv_app_models_20_0= ruleUser ) ) )? (otherlv_21= 'role:' ( (lv_app_models_22_0= ruleRole ) ) )? )? (otherlv_23= 'security:' ( (lv_app_security_24_0= ruleSecurity ) ) )? (otherlv_25= 'controller:' (otherlv_26= 'auth:' ( (lv_app_controllers_27_0= ruleAuthentication ) ) )? )? ) )
            // InternalSecurityDsl.g:79:2: ( () otherlv_1= 'application:' (otherlv_2= 'artifact:' ( (lv_artifact_3_0= ruleEString ) ) )? (otherlv_4= 'name:' ( (lv_name_5_0= ruleEString ) ) )? (otherlv_6= 'group:' ( (lv_group_7_0= ruleEString ) ) )? (otherlv_8= 'packageName:' ( (lv_packageName_9_0= ruleEString ) ) )? (otherlv_10= 'description:' ( (lv_description_11_0= ruleEString ) ) )? (otherlv_12= 'port:' ( (lv_port_13_0= ruleELongObject ) ) )? (otherlv_14= 'hostname:' ( (lv_hostname_15_0= ruleEString ) ) )? (otherlv_16= 'database:' ( (lv_app_database_17_0= ruleDatabase ) ) )? (otherlv_18= 'model:' (otherlv_19= 'user:' ( (lv_app_models_20_0= ruleUser ) ) )? (otherlv_21= 'role:' ( (lv_app_models_22_0= ruleRole ) ) )? )? (otherlv_23= 'security:' ( (lv_app_security_24_0= ruleSecurity ) ) )? (otherlv_25= 'controller:' (otherlv_26= 'auth:' ( (lv_app_controllers_27_0= ruleAuthentication ) ) )? )? )
            {
            // InternalSecurityDsl.g:79:2: ( () otherlv_1= 'application:' (otherlv_2= 'artifact:' ( (lv_artifact_3_0= ruleEString ) ) )? (otherlv_4= 'name:' ( (lv_name_5_0= ruleEString ) ) )? (otherlv_6= 'group:' ( (lv_group_7_0= ruleEString ) ) )? (otherlv_8= 'packageName:' ( (lv_packageName_9_0= ruleEString ) ) )? (otherlv_10= 'description:' ( (lv_description_11_0= ruleEString ) ) )? (otherlv_12= 'port:' ( (lv_port_13_0= ruleELongObject ) ) )? (otherlv_14= 'hostname:' ( (lv_hostname_15_0= ruleEString ) ) )? (otherlv_16= 'database:' ( (lv_app_database_17_0= ruleDatabase ) ) )? (otherlv_18= 'model:' (otherlv_19= 'user:' ( (lv_app_models_20_0= ruleUser ) ) )? (otherlv_21= 'role:' ( (lv_app_models_22_0= ruleRole ) ) )? )? (otherlv_23= 'security:' ( (lv_app_security_24_0= ruleSecurity ) ) )? (otherlv_25= 'controller:' (otherlv_26= 'auth:' ( (lv_app_controllers_27_0= ruleAuthentication ) ) )? )? )
            // InternalSecurityDsl.g:80:3: () otherlv_1= 'application:' (otherlv_2= 'artifact:' ( (lv_artifact_3_0= ruleEString ) ) )? (otherlv_4= 'name:' ( (lv_name_5_0= ruleEString ) ) )? (otherlv_6= 'group:' ( (lv_group_7_0= ruleEString ) ) )? (otherlv_8= 'packageName:' ( (lv_packageName_9_0= ruleEString ) ) )? (otherlv_10= 'description:' ( (lv_description_11_0= ruleEString ) ) )? (otherlv_12= 'port:' ( (lv_port_13_0= ruleELongObject ) ) )? (otherlv_14= 'hostname:' ( (lv_hostname_15_0= ruleEString ) ) )? (otherlv_16= 'database:' ( (lv_app_database_17_0= ruleDatabase ) ) )? (otherlv_18= 'model:' (otherlv_19= 'user:' ( (lv_app_models_20_0= ruleUser ) ) )? (otherlv_21= 'role:' ( (lv_app_models_22_0= ruleRole ) ) )? )? (otherlv_23= 'security:' ( (lv_app_security_24_0= ruleSecurity ) ) )? (otherlv_25= 'controller:' (otherlv_26= 'auth:' ( (lv_app_controllers_27_0= ruleAuthentication ) ) )? )?
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
            		
            // InternalSecurityDsl.g:91:3: (otherlv_2= 'artifact:' ( (lv_artifact_3_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSecurityDsl.g:92:4: otherlv_2= 'artifact:' ( (lv_artifact_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getApplicationAccess().getArtifactKeyword_2_0());
                    			
                    // InternalSecurityDsl.g:96:4: ( (lv_artifact_3_0= ruleEString ) )
                    // InternalSecurityDsl.g:97:5: (lv_artifact_3_0= ruleEString )
                    {
                    // InternalSecurityDsl.g:97:5: (lv_artifact_3_0= ruleEString )
                    // InternalSecurityDsl.g:98:6: lv_artifact_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getApplicationAccess().getArtifactEStringParserRuleCall_2_1_0());
                    					
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
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:116:3: (otherlv_4= 'name:' ( (lv_name_5_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSecurityDsl.g:117:4: otherlv_4= 'name:' ( (lv_name_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getApplicationAccess().getNameKeyword_3_0());
                    			
                    // InternalSecurityDsl.g:121:4: ( (lv_name_5_0= ruleEString ) )
                    // InternalSecurityDsl.g:122:5: (lv_name_5_0= ruleEString )
                    {
                    // InternalSecurityDsl.g:122:5: (lv_name_5_0= ruleEString )
                    // InternalSecurityDsl.g:123:6: lv_name_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getApplicationAccess().getNameEStringParserRuleCall_3_1_0());
                    					
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
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:141:3: (otherlv_6= 'group:' ( (lv_group_7_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSecurityDsl.g:142:4: otherlv_6= 'group:' ( (lv_group_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getApplicationAccess().getGroupKeyword_4_0());
                    			
                    // InternalSecurityDsl.g:146:4: ( (lv_group_7_0= ruleEString ) )
                    // InternalSecurityDsl.g:147:5: (lv_group_7_0= ruleEString )
                    {
                    // InternalSecurityDsl.g:147:5: (lv_group_7_0= ruleEString )
                    // InternalSecurityDsl.g:148:6: lv_group_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getApplicationAccess().getGroupEStringParserRuleCall_4_1_0());
                    					
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

            // InternalSecurityDsl.g:166:3: (otherlv_8= 'packageName:' ( (lv_packageName_9_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSecurityDsl.g:167:4: otherlv_8= 'packageName:' ( (lv_packageName_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getApplicationAccess().getPackageNameKeyword_5_0());
                    			
                    // InternalSecurityDsl.g:171:4: ( (lv_packageName_9_0= ruleEString ) )
                    // InternalSecurityDsl.g:172:5: (lv_packageName_9_0= ruleEString )
                    {
                    // InternalSecurityDsl.g:172:5: (lv_packageName_9_0= ruleEString )
                    // InternalSecurityDsl.g:173:6: lv_packageName_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getApplicationAccess().getPackageNameEStringParserRuleCall_5_1_0());
                    					
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
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:191:3: (otherlv_10= 'description:' ( (lv_description_11_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSecurityDsl.g:192:4: otherlv_10= 'description:' ( (lv_description_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getApplicationAccess().getDescriptionKeyword_6_0());
                    			
                    // InternalSecurityDsl.g:196:4: ( (lv_description_11_0= ruleEString ) )
                    // InternalSecurityDsl.g:197:5: (lv_description_11_0= ruleEString )
                    {
                    // InternalSecurityDsl.g:197:5: (lv_description_11_0= ruleEString )
                    // InternalSecurityDsl.g:198:6: lv_description_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getApplicationAccess().getDescriptionEStringParserRuleCall_6_1_0());
                    					
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
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:216:3: (otherlv_12= 'port:' ( (lv_port_13_0= ruleELongObject ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSecurityDsl.g:217:4: otherlv_12= 'port:' ( (lv_port_13_0= ruleELongObject ) )
                    {
                    otherlv_12=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getApplicationAccess().getPortKeyword_7_0());
                    			
                    // InternalSecurityDsl.g:221:4: ( (lv_port_13_0= ruleELongObject ) )
                    // InternalSecurityDsl.g:222:5: (lv_port_13_0= ruleELongObject )
                    {
                    // InternalSecurityDsl.g:222:5: (lv_port_13_0= ruleELongObject )
                    // InternalSecurityDsl.g:223:6: lv_port_13_0= ruleELongObject
                    {

                    						newCompositeNode(grammarAccess.getApplicationAccess().getPortELongObjectParserRuleCall_7_1_0());
                    					
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

            // InternalSecurityDsl.g:241:3: (otherlv_14= 'hostname:' ( (lv_hostname_15_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSecurityDsl.g:242:4: otherlv_14= 'hostname:' ( (lv_hostname_15_0= ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getApplicationAccess().getHostnameKeyword_8_0());
                    			
                    // InternalSecurityDsl.g:246:4: ( (lv_hostname_15_0= ruleEString ) )
                    // InternalSecurityDsl.g:247:5: (lv_hostname_15_0= ruleEString )
                    {
                    // InternalSecurityDsl.g:247:5: (lv_hostname_15_0= ruleEString )
                    // InternalSecurityDsl.g:248:6: lv_hostname_15_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getApplicationAccess().getHostnameEStringParserRuleCall_8_1_0());
                    					
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

            // InternalSecurityDsl.g:266:3: (otherlv_16= 'database:' ( (lv_app_database_17_0= ruleDatabase ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSecurityDsl.g:267:4: otherlv_16= 'database:' ( (lv_app_database_17_0= ruleDatabase ) )
                    {
                    otherlv_16=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_16, grammarAccess.getApplicationAccess().getDatabaseKeyword_9_0());
                    			
                    // InternalSecurityDsl.g:271:4: ( (lv_app_database_17_0= ruleDatabase ) )
                    // InternalSecurityDsl.g:272:5: (lv_app_database_17_0= ruleDatabase )
                    {
                    // InternalSecurityDsl.g:272:5: (lv_app_database_17_0= ruleDatabase )
                    // InternalSecurityDsl.g:273:6: lv_app_database_17_0= ruleDatabase
                    {

                    						newCompositeNode(grammarAccess.getApplicationAccess().getApp_databaseDatabaseParserRuleCall_9_1_0());
                    					
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

            // InternalSecurityDsl.g:291:3: (otherlv_18= 'model:' (otherlv_19= 'user:' ( (lv_app_models_20_0= ruleUser ) ) )? (otherlv_21= 'role:' ( (lv_app_models_22_0= ruleRole ) ) )? )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSecurityDsl.g:292:4: otherlv_18= 'model:' (otherlv_19= 'user:' ( (lv_app_models_20_0= ruleUser ) ) )? (otherlv_21= 'role:' ( (lv_app_models_22_0= ruleRole ) ) )?
                    {
                    otherlv_18=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_18, grammarAccess.getApplicationAccess().getModelKeyword_10_0());
                    			
                    // InternalSecurityDsl.g:296:4: (otherlv_19= 'user:' ( (lv_app_models_20_0= ruleUser ) ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==21) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalSecurityDsl.g:297:5: otherlv_19= 'user:' ( (lv_app_models_20_0= ruleUser ) )
                            {
                            otherlv_19=(Token)match(input,21,FOLLOW_16); 

                            					newLeafNode(otherlv_19, grammarAccess.getApplicationAccess().getUserKeyword_10_1_0());
                            				
                            // InternalSecurityDsl.g:301:5: ( (lv_app_models_20_0= ruleUser ) )
                            // InternalSecurityDsl.g:302:6: (lv_app_models_20_0= ruleUser )
                            {
                            // InternalSecurityDsl.g:302:6: (lv_app_models_20_0= ruleUser )
                            // InternalSecurityDsl.g:303:7: lv_app_models_20_0= ruleUser
                            {

                            							newCompositeNode(grammarAccess.getApplicationAccess().getApp_modelsUserParserRuleCall_10_1_1_0());
                            						
                            pushFollow(FOLLOW_17);
                            lv_app_models_20_0=ruleUser();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getApplicationRule());
                            							}
                            							add(
                            								current,
                            								"app_models",
                            								lv_app_models_20_0,
                            								"rs.ac.uns.ftn.securitydsl.SecurityDsl.User");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalSecurityDsl.g:321:4: (otherlv_21= 'role:' ( (lv_app_models_22_0= ruleRole ) ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==22) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalSecurityDsl.g:322:5: otherlv_21= 'role:' ( (lv_app_models_22_0= ruleRole ) )
                            {
                            otherlv_21=(Token)match(input,22,FOLLOW_18); 

                            					newLeafNode(otherlv_21, grammarAccess.getApplicationAccess().getRoleKeyword_10_2_0());
                            				
                            // InternalSecurityDsl.g:326:5: ( (lv_app_models_22_0= ruleRole ) )
                            // InternalSecurityDsl.g:327:6: (lv_app_models_22_0= ruleRole )
                            {
                            // InternalSecurityDsl.g:327:6: (lv_app_models_22_0= ruleRole )
                            // InternalSecurityDsl.g:328:7: lv_app_models_22_0= ruleRole
                            {

                            							newCompositeNode(grammarAccess.getApplicationAccess().getApp_modelsRoleParserRuleCall_10_2_1_0());
                            						
                            pushFollow(FOLLOW_19);
                            lv_app_models_22_0=ruleRole();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getApplicationRule());
                            							}
                            							add(
                            								current,
                            								"app_models",
                            								lv_app_models_22_0,
                            								"rs.ac.uns.ftn.securitydsl.SecurityDsl.Role");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:347:3: (otherlv_23= 'security:' ( (lv_app_security_24_0= ruleSecurity ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSecurityDsl.g:348:4: otherlv_23= 'security:' ( (lv_app_security_24_0= ruleSecurity ) )
                    {
                    otherlv_23=(Token)match(input,23,FOLLOW_20); 

                    				newLeafNode(otherlv_23, grammarAccess.getApplicationAccess().getSecurityKeyword_11_0());
                    			
                    // InternalSecurityDsl.g:352:4: ( (lv_app_security_24_0= ruleSecurity ) )
                    // InternalSecurityDsl.g:353:5: (lv_app_security_24_0= ruleSecurity )
                    {
                    // InternalSecurityDsl.g:353:5: (lv_app_security_24_0= ruleSecurity )
                    // InternalSecurityDsl.g:354:6: lv_app_security_24_0= ruleSecurity
                    {

                    						newCompositeNode(grammarAccess.getApplicationAccess().getApp_securitySecurityParserRuleCall_11_1_0());
                    					
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
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.Security");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:372:3: (otherlv_25= 'controller:' (otherlv_26= 'auth:' ( (lv_app_controllers_27_0= ruleAuthentication ) ) )? )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSecurityDsl.g:373:4: otherlv_25= 'controller:' (otherlv_26= 'auth:' ( (lv_app_controllers_27_0= ruleAuthentication ) ) )?
                    {
                    otherlv_25=(Token)match(input,24,FOLLOW_22); 

                    				newLeafNode(otherlv_25, grammarAccess.getApplicationAccess().getControllerKeyword_12_0());
                    			
                    // InternalSecurityDsl.g:377:4: (otherlv_26= 'auth:' ( (lv_app_controllers_27_0= ruleAuthentication ) ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==25) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalSecurityDsl.g:378:5: otherlv_26= 'auth:' ( (lv_app_controllers_27_0= ruleAuthentication ) )
                            {
                            otherlv_26=(Token)match(input,25,FOLLOW_23); 

                            					newLeafNode(otherlv_26, grammarAccess.getApplicationAccess().getAuthKeyword_12_1_0());
                            				
                            // InternalSecurityDsl.g:382:5: ( (lv_app_controllers_27_0= ruleAuthentication ) )
                            // InternalSecurityDsl.g:383:6: (lv_app_controllers_27_0= ruleAuthentication )
                            {
                            // InternalSecurityDsl.g:383:6: (lv_app_controllers_27_0= ruleAuthentication )
                            // InternalSecurityDsl.g:384:7: lv_app_controllers_27_0= ruleAuthentication
                            {

                            							newCompositeNode(grammarAccess.getApplicationAccess().getApp_controllersAuthenticationParserRuleCall_12_1_1_0());
                            						
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
                            								"rs.ac.uns.ftn.securitydsl.SecurityDsl.Authentication");
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
    // InternalSecurityDsl.g:407:1: entryRuleSecurity returns [EObject current=null] : iv_ruleSecurity= ruleSecurity EOF ;
    public final EObject entryRuleSecurity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecurity = null;


        try {
            // InternalSecurityDsl.g:407:49: (iv_ruleSecurity= ruleSecurity EOF )
            // InternalSecurityDsl.g:408:2: iv_ruleSecurity= ruleSecurity EOF
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
    // InternalSecurityDsl.g:414:1: ruleSecurity returns [EObject current=null] : this_JWT_0= ruleJWT ;
    public final EObject ruleSecurity() throws RecognitionException {
        EObject current = null;

        EObject this_JWT_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:420:2: (this_JWT_0= ruleJWT )
            // InternalSecurityDsl.g:421:2: this_JWT_0= ruleJWT
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
    // InternalSecurityDsl.g:432:1: entryRuleDatabase returns [EObject current=null] : iv_ruleDatabase= ruleDatabase EOF ;
    public final EObject entryRuleDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabase = null;


        try {
            // InternalSecurityDsl.g:432:49: (iv_ruleDatabase= ruleDatabase EOF )
            // InternalSecurityDsl.g:433:2: iv_ruleDatabase= ruleDatabase EOF
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
    // InternalSecurityDsl.g:439:1: ruleDatabase returns [EObject current=null] : (otherlv_0= 'vendor:' ( (lv_vendorName_1_0= ruleEDatabaseType ) ) otherlv_2= 'url:' ( (lv_url_3_0= ruleEString ) ) otherlv_4= 'username:' ( (lv_username_5_0= ruleEString ) ) otherlv_6= 'password:' ( (lv_password_7_0= ruleEString ) ) ) ;
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
            // InternalSecurityDsl.g:445:2: ( (otherlv_0= 'vendor:' ( (lv_vendorName_1_0= ruleEDatabaseType ) ) otherlv_2= 'url:' ( (lv_url_3_0= ruleEString ) ) otherlv_4= 'username:' ( (lv_username_5_0= ruleEString ) ) otherlv_6= 'password:' ( (lv_password_7_0= ruleEString ) ) ) )
            // InternalSecurityDsl.g:446:2: (otherlv_0= 'vendor:' ( (lv_vendorName_1_0= ruleEDatabaseType ) ) otherlv_2= 'url:' ( (lv_url_3_0= ruleEString ) ) otherlv_4= 'username:' ( (lv_username_5_0= ruleEString ) ) otherlv_6= 'password:' ( (lv_password_7_0= ruleEString ) ) )
            {
            // InternalSecurityDsl.g:446:2: (otherlv_0= 'vendor:' ( (lv_vendorName_1_0= ruleEDatabaseType ) ) otherlv_2= 'url:' ( (lv_url_3_0= ruleEString ) ) otherlv_4= 'username:' ( (lv_username_5_0= ruleEString ) ) otherlv_6= 'password:' ( (lv_password_7_0= ruleEString ) ) )
            // InternalSecurityDsl.g:447:3: otherlv_0= 'vendor:' ( (lv_vendorName_1_0= ruleEDatabaseType ) ) otherlv_2= 'url:' ( (lv_url_3_0= ruleEString ) ) otherlv_4= 'username:' ( (lv_username_5_0= ruleEString ) ) otherlv_6= 'password:' ( (lv_password_7_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getDatabaseAccess().getVendorKeyword_0());
            		
            // InternalSecurityDsl.g:451:3: ( (lv_vendorName_1_0= ruleEDatabaseType ) )
            // InternalSecurityDsl.g:452:4: (lv_vendorName_1_0= ruleEDatabaseType )
            {
            // InternalSecurityDsl.g:452:4: (lv_vendorName_1_0= ruleEDatabaseType )
            // InternalSecurityDsl.g:453:5: lv_vendorName_1_0= ruleEDatabaseType
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
            						"rs.ac.uns.ftn.securitydsl.SecurityDsl.EDatabaseType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getDatabaseAccess().getUrlKeyword_2());
            		
            // InternalSecurityDsl.g:474:3: ( (lv_url_3_0= ruleEString ) )
            // InternalSecurityDsl.g:475:4: (lv_url_3_0= ruleEString )
            {
            // InternalSecurityDsl.g:475:4: (lv_url_3_0= ruleEString )
            // InternalSecurityDsl.g:476:5: lv_url_3_0= ruleEString
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
            						"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getDatabaseAccess().getUsernameKeyword_4());
            		
            // InternalSecurityDsl.g:497:3: ( (lv_username_5_0= ruleEString ) )
            // InternalSecurityDsl.g:498:4: (lv_username_5_0= ruleEString )
            {
            // InternalSecurityDsl.g:498:4: (lv_username_5_0= ruleEString )
            // InternalSecurityDsl.g:499:5: lv_username_5_0= ruleEString
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
            						"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getDatabaseAccess().getPasswordKeyword_6());
            		
            // InternalSecurityDsl.g:520:3: ( (lv_password_7_0= ruleEString ) )
            // InternalSecurityDsl.g:521:4: (lv_password_7_0= ruleEString )
            {
            // InternalSecurityDsl.g:521:4: (lv_password_7_0= ruleEString )
            // InternalSecurityDsl.g:522:5: lv_password_7_0= ruleEString
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
    // $ANTLR end "ruleDatabase"


    // $ANTLR start "entryRuleEString"
    // InternalSecurityDsl.g:543:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSecurityDsl.g:543:47: (iv_ruleEString= ruleEString EOF )
            // InternalSecurityDsl.g:544:2: iv_ruleEString= ruleEString EOF
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
    // InternalSecurityDsl.g:550:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSecurityDsl.g:556:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSecurityDsl.g:557:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSecurityDsl.g:557:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalSecurityDsl.g:558:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:566:3: this_ID_1= RULE_ID
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
    // InternalSecurityDsl.g:577:1: entryRuleELongObject returns [String current=null] : iv_ruleELongObject= ruleELongObject EOF ;
    public final String entryRuleELongObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleELongObject = null;


        try {
            // InternalSecurityDsl.g:577:51: (iv_ruleELongObject= ruleELongObject EOF )
            // InternalSecurityDsl.g:578:2: iv_ruleELongObject= ruleELongObject EOF
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
    // InternalSecurityDsl.g:584:1: ruleELongObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleELongObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSecurityDsl.g:590:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSecurityDsl.g:591:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSecurityDsl.g:591:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSecurityDsl.g:592:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSecurityDsl.g:592:3: (kw= '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSecurityDsl.g:593:4: kw= '-'
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
    // InternalSecurityDsl.g:610:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalSecurityDsl.g:610:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalSecurityDsl.g:611:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalSecurityDsl.g:617:1: ruleAttribute returns [EObject current=null] : (otherlv_0= '{' ( (lv_isIdentifier_1_0= 'identifier' ) )? otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'type:' ( (lv_type_5_0= ruleEType ) ) (otherlv_6= 'collumnName:' ( (lv_collumnName_7_0= ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isIdentifier_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        Enumerator lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_collumnName_7_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:623:2: ( (otherlv_0= '{' ( (lv_isIdentifier_1_0= 'identifier' ) )? otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'type:' ( (lv_type_5_0= ruleEType ) ) (otherlv_6= 'collumnName:' ( (lv_collumnName_7_0= ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalSecurityDsl.g:624:2: (otherlv_0= '{' ( (lv_isIdentifier_1_0= 'identifier' ) )? otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'type:' ( (lv_type_5_0= ruleEType ) ) (otherlv_6= 'collumnName:' ( (lv_collumnName_7_0= ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalSecurityDsl.g:624:2: (otherlv_0= '{' ( (lv_isIdentifier_1_0= 'identifier' ) )? otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'type:' ( (lv_type_5_0= ruleEType ) ) (otherlv_6= 'collumnName:' ( (lv_collumnName_7_0= ruleEString ) ) )? otherlv_8= '}' )
            // InternalSecurityDsl.g:625:3: otherlv_0= '{' ( (lv_isIdentifier_1_0= 'identifier' ) )? otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'type:' ( (lv_type_5_0= ruleEType ) ) (otherlv_6= 'collumnName:' ( (lv_collumnName_7_0= ruleEString ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalSecurityDsl.g:629:3: ( (lv_isIdentifier_1_0= 'identifier' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSecurityDsl.g:630:4: (lv_isIdentifier_1_0= 'identifier' )
                    {
                    // InternalSecurityDsl.g:630:4: (lv_isIdentifier_1_0= 'identifier' )
                    // InternalSecurityDsl.g:631:5: lv_isIdentifier_1_0= 'identifier'
                    {
                    lv_isIdentifier_1_0=(Token)match(input,32,FOLLOW_23); 

                    					newLeafNode(lv_isIdentifier_1_0, grammarAccess.getAttributeAccess().getIsIdentifierIdentifierKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "isIdentifier", lv_isIdentifier_1_0 != null, "identifier");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getNameKeyword_2());
            		
            // InternalSecurityDsl.g:647:3: ( (lv_name_3_0= ruleEString ) )
            // InternalSecurityDsl.g:648:4: (lv_name_3_0= ruleEString )
            {
            // InternalSecurityDsl.g:648:4: (lv_name_3_0= ruleEString )
            // InternalSecurityDsl.g:649:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_30);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_31); 

            			newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getTypeKeyword_4());
            		
            // InternalSecurityDsl.g:670:3: ( (lv_type_5_0= ruleEType ) )
            // InternalSecurityDsl.g:671:4: (lv_type_5_0= ruleEType )
            {
            // InternalSecurityDsl.g:671:4: (lv_type_5_0= ruleEType )
            // InternalSecurityDsl.g:672:5: lv_type_5_0= ruleEType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeETypeEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_32);
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

            // InternalSecurityDsl.g:689:3: (otherlv_6= 'collumnName:' ( (lv_collumnName_7_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSecurityDsl.g:690:4: otherlv_6= 'collumnName:' ( (lv_collumnName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getCollumnNameKeyword_6_0());
                    			
                    // InternalSecurityDsl.g:694:4: ( (lv_collumnName_7_0= ruleEString ) )
                    // InternalSecurityDsl.g:695:5: (lv_collumnName_7_0= ruleEString )
                    {
                    // InternalSecurityDsl.g:695:5: (lv_collumnName_7_0= ruleEString )
                    // InternalSecurityDsl.g:696:6: lv_collumnName_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getCollumnNameEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_33);
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

            otherlv_8=(Token)match(input,35,FOLLOW_2); 

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
    // InternalSecurityDsl.g:722:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalSecurityDsl.g:722:45: (iv_ruleRole= ruleRole EOF )
            // InternalSecurityDsl.g:723:2: iv_ruleRole= ruleRole EOF
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
    // InternalSecurityDsl.g:729:1: ruleRole returns [EObject current=null] : ( () (otherlv_1= 'tableName:' ( (lv_tableName_2_0= ruleEString ) ) )? (otherlv_3= 'attributes:' otherlv_4= '[' ( (lv_model_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_model_attributes_7_0= ruleAttribute ) ) )* otherlv_8= ']' )? (otherlv_9= 'roles:' otherlv_10= '[' ( (lv_role_instances_11_0= ruleRoleInstance ) ) (otherlv_12= ',' ( (lv_role_instances_13_0= ruleRoleInstance ) ) )* otherlv_14= ']' )? ) ;
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

        EObject lv_model_attributes_5_0 = null;

        EObject lv_model_attributes_7_0 = null;

        EObject lv_role_instances_11_0 = null;

        EObject lv_role_instances_13_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:735:2: ( ( () (otherlv_1= 'tableName:' ( (lv_tableName_2_0= ruleEString ) ) )? (otherlv_3= 'attributes:' otherlv_4= '[' ( (lv_model_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_model_attributes_7_0= ruleAttribute ) ) )* otherlv_8= ']' )? (otherlv_9= 'roles:' otherlv_10= '[' ( (lv_role_instances_11_0= ruleRoleInstance ) ) (otherlv_12= ',' ( (lv_role_instances_13_0= ruleRoleInstance ) ) )* otherlv_14= ']' )? ) )
            // InternalSecurityDsl.g:736:2: ( () (otherlv_1= 'tableName:' ( (lv_tableName_2_0= ruleEString ) ) )? (otherlv_3= 'attributes:' otherlv_4= '[' ( (lv_model_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_model_attributes_7_0= ruleAttribute ) ) )* otherlv_8= ']' )? (otherlv_9= 'roles:' otherlv_10= '[' ( (lv_role_instances_11_0= ruleRoleInstance ) ) (otherlv_12= ',' ( (lv_role_instances_13_0= ruleRoleInstance ) ) )* otherlv_14= ']' )? )
            {
            // InternalSecurityDsl.g:736:2: ( () (otherlv_1= 'tableName:' ( (lv_tableName_2_0= ruleEString ) ) )? (otherlv_3= 'attributes:' otherlv_4= '[' ( (lv_model_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_model_attributes_7_0= ruleAttribute ) ) )* otherlv_8= ']' )? (otherlv_9= 'roles:' otherlv_10= '[' ( (lv_role_instances_11_0= ruleRoleInstance ) ) (otherlv_12= ',' ( (lv_role_instances_13_0= ruleRoleInstance ) ) )* otherlv_14= ']' )? )
            // InternalSecurityDsl.g:737:3: () (otherlv_1= 'tableName:' ( (lv_tableName_2_0= ruleEString ) ) )? (otherlv_3= 'attributes:' otherlv_4= '[' ( (lv_model_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_model_attributes_7_0= ruleAttribute ) ) )* otherlv_8= ']' )? (otherlv_9= 'roles:' otherlv_10= '[' ( (lv_role_instances_11_0= ruleRoleInstance ) ) (otherlv_12= ',' ( (lv_role_instances_13_0= ruleRoleInstance ) ) )* otherlv_14= ']' )?
            {
            // InternalSecurityDsl.g:737:3: ()
            // InternalSecurityDsl.g:738:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoleAccess().getRoleAction_0(),
            					current);
            			

            }

            // InternalSecurityDsl.g:744:3: (otherlv_1= 'tableName:' ( (lv_tableName_2_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSecurityDsl.g:745:4: otherlv_1= 'tableName:' ( (lv_tableName_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getRoleAccess().getTableNameKeyword_1_0());
                    			
                    // InternalSecurityDsl.g:749:4: ( (lv_tableName_2_0= ruleEString ) )
                    // InternalSecurityDsl.g:750:5: (lv_tableName_2_0= ruleEString )
                    {
                    // InternalSecurityDsl.g:750:5: (lv_tableName_2_0= ruleEString )
                    // InternalSecurityDsl.g:751:6: lv_tableName_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRoleAccess().getTableNameEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_tableName_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoleRule());
                    						}
                    						set(
                    							current,
                    							"tableName",
                    							lv_tableName_2_0,
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:769:3: (otherlv_3= 'attributes:' otherlv_4= '[' ( (lv_model_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_model_attributes_7_0= ruleAttribute ) ) )* otherlv_8= ']' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSecurityDsl.g:770:4: otherlv_3= 'attributes:' otherlv_4= '[' ( (lv_model_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_model_attributes_7_0= ruleAttribute ) ) )* otherlv_8= ']'
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_35); 

                    				newLeafNode(otherlv_3, grammarAccess.getRoleAccess().getAttributesKeyword_2_0());
                    			
                    otherlv_4=(Token)match(input,38,FOLLOW_36); 

                    				newLeafNode(otherlv_4, grammarAccess.getRoleAccess().getLeftSquareBracketKeyword_2_1());
                    			
                    // InternalSecurityDsl.g:778:4: ( (lv_model_attributes_5_0= ruleAttribute ) )
                    // InternalSecurityDsl.g:779:5: (lv_model_attributes_5_0= ruleAttribute )
                    {
                    // InternalSecurityDsl.g:779:5: (lv_model_attributes_5_0= ruleAttribute )
                    // InternalSecurityDsl.g:780:6: lv_model_attributes_5_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getRoleAccess().getModel_attributesAttributeParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_model_attributes_5_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoleRule());
                    						}
                    						add(
                    							current,
                    							"model_attributes",
                    							lv_model_attributes_5_0,
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSecurityDsl.g:797:4: (otherlv_6= ',' ( (lv_model_attributes_7_0= ruleAttribute ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==39) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalSecurityDsl.g:798:5: otherlv_6= ',' ( (lv_model_attributes_7_0= ruleAttribute ) )
                    	    {
                    	    otherlv_6=(Token)match(input,39,FOLLOW_36); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRoleAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalSecurityDsl.g:802:5: ( (lv_model_attributes_7_0= ruleAttribute ) )
                    	    // InternalSecurityDsl.g:803:6: (lv_model_attributes_7_0= ruleAttribute )
                    	    {
                    	    // InternalSecurityDsl.g:803:6: (lv_model_attributes_7_0= ruleAttribute )
                    	    // InternalSecurityDsl.g:804:7: lv_model_attributes_7_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getRoleAccess().getModel_attributesAttributeParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_37);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,40,FOLLOW_38); 

                    				newLeafNode(otherlv_8, grammarAccess.getRoleAccess().getRightSquareBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalSecurityDsl.g:827:3: (otherlv_9= 'roles:' otherlv_10= '[' ( (lv_role_instances_11_0= ruleRoleInstance ) ) (otherlv_12= ',' ( (lv_role_instances_13_0= ruleRoleInstance ) ) )* otherlv_14= ']' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==41) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSecurityDsl.g:828:4: otherlv_9= 'roles:' otherlv_10= '[' ( (lv_role_instances_11_0= ruleRoleInstance ) ) (otherlv_12= ',' ( (lv_role_instances_13_0= ruleRoleInstance ) ) )* otherlv_14= ']'
                    {
                    otherlv_9=(Token)match(input,41,FOLLOW_35); 

                    				newLeafNode(otherlv_9, grammarAccess.getRoleAccess().getRolesKeyword_3_0());
                    			
                    otherlv_10=(Token)match(input,38,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getRoleAccess().getLeftSquareBracketKeyword_3_1());
                    			
                    // InternalSecurityDsl.g:836:4: ( (lv_role_instances_11_0= ruleRoleInstance ) )
                    // InternalSecurityDsl.g:837:5: (lv_role_instances_11_0= ruleRoleInstance )
                    {
                    // InternalSecurityDsl.g:837:5: (lv_role_instances_11_0= ruleRoleInstance )
                    // InternalSecurityDsl.g:838:6: lv_role_instances_11_0= ruleRoleInstance
                    {

                    						newCompositeNode(grammarAccess.getRoleAccess().getRole_instancesRoleInstanceParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_role_instances_11_0=ruleRoleInstance();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoleRule());
                    						}
                    						add(
                    							current,
                    							"role_instances",
                    							lv_role_instances_11_0,
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.RoleInstance");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSecurityDsl.g:855:4: (otherlv_12= ',' ( (lv_role_instances_13_0= ruleRoleInstance ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==39) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalSecurityDsl.g:856:5: otherlv_12= ',' ( (lv_role_instances_13_0= ruleRoleInstance ) )
                    	    {
                    	    otherlv_12=(Token)match(input,39,FOLLOW_4); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getRoleAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalSecurityDsl.g:860:5: ( (lv_role_instances_13_0= ruleRoleInstance ) )
                    	    // InternalSecurityDsl.g:861:6: (lv_role_instances_13_0= ruleRoleInstance )
                    	    {
                    	    // InternalSecurityDsl.g:861:6: (lv_role_instances_13_0= ruleRoleInstance )
                    	    // InternalSecurityDsl.g:862:7: lv_role_instances_13_0= ruleRoleInstance
                    	    {

                    	    							newCompositeNode(grammarAccess.getRoleAccess().getRole_instancesRoleInstanceParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_37);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,40,FOLLOW_2); 

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
    // InternalSecurityDsl.g:889:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // InternalSecurityDsl.g:889:45: (iv_ruleUser= ruleUser EOF )
            // InternalSecurityDsl.g:890:2: iv_ruleUser= ruleUser EOF
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
    // InternalSecurityDsl.g:896:1: ruleUser returns [EObject current=null] : ( () (otherlv_1= 'tableName:' ( (lv_tableName_2_0= ruleEString ) ) )? (otherlv_3= 'attributes:' otherlv_4= '[' ( (lv_model_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_model_attributes_7_0= ruleAttribute ) ) )* otherlv_8= ']' )? ) ;
    public final EObject ruleUser() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_tableName_2_0 = null;

        EObject lv_model_attributes_5_0 = null;

        EObject lv_model_attributes_7_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:902:2: ( ( () (otherlv_1= 'tableName:' ( (lv_tableName_2_0= ruleEString ) ) )? (otherlv_3= 'attributes:' otherlv_4= '[' ( (lv_model_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_model_attributes_7_0= ruleAttribute ) ) )* otherlv_8= ']' )? ) )
            // InternalSecurityDsl.g:903:2: ( () (otherlv_1= 'tableName:' ( (lv_tableName_2_0= ruleEString ) ) )? (otherlv_3= 'attributes:' otherlv_4= '[' ( (lv_model_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_model_attributes_7_0= ruleAttribute ) ) )* otherlv_8= ']' )? )
            {
            // InternalSecurityDsl.g:903:2: ( () (otherlv_1= 'tableName:' ( (lv_tableName_2_0= ruleEString ) ) )? (otherlv_3= 'attributes:' otherlv_4= '[' ( (lv_model_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_model_attributes_7_0= ruleAttribute ) ) )* otherlv_8= ']' )? )
            // InternalSecurityDsl.g:904:3: () (otherlv_1= 'tableName:' ( (lv_tableName_2_0= ruleEString ) ) )? (otherlv_3= 'attributes:' otherlv_4= '[' ( (lv_model_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_model_attributes_7_0= ruleAttribute ) ) )* otherlv_8= ']' )?
            {
            // InternalSecurityDsl.g:904:3: ()
            // InternalSecurityDsl.g:905:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUserAccess().getUserAction_0(),
            					current);
            			

            }

            // InternalSecurityDsl.g:911:3: (otherlv_1= 'tableName:' ( (lv_tableName_2_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==36) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSecurityDsl.g:912:4: otherlv_1= 'tableName:' ( (lv_tableName_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getUserAccess().getTableNameKeyword_1_0());
                    			
                    // InternalSecurityDsl.g:916:4: ( (lv_tableName_2_0= ruleEString ) )
                    // InternalSecurityDsl.g:917:5: (lv_tableName_2_0= ruleEString )
                    {
                    // InternalSecurityDsl.g:917:5: (lv_tableName_2_0= ruleEString )
                    // InternalSecurityDsl.g:918:6: lv_tableName_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getUserAccess().getTableNameEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_tableName_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUserRule());
                    						}
                    						set(
                    							current,
                    							"tableName",
                    							lv_tableName_2_0,
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:936:3: (otherlv_3= 'attributes:' otherlv_4= '[' ( (lv_model_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_model_attributes_7_0= ruleAttribute ) ) )* otherlv_8= ']' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==37) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSecurityDsl.g:937:4: otherlv_3= 'attributes:' otherlv_4= '[' ( (lv_model_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_model_attributes_7_0= ruleAttribute ) ) )* otherlv_8= ']'
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_35); 

                    				newLeafNode(otherlv_3, grammarAccess.getUserAccess().getAttributesKeyword_2_0());
                    			
                    otherlv_4=(Token)match(input,38,FOLLOW_36); 

                    				newLeafNode(otherlv_4, grammarAccess.getUserAccess().getLeftSquareBracketKeyword_2_1());
                    			
                    // InternalSecurityDsl.g:945:4: ( (lv_model_attributes_5_0= ruleAttribute ) )
                    // InternalSecurityDsl.g:946:5: (lv_model_attributes_5_0= ruleAttribute )
                    {
                    // InternalSecurityDsl.g:946:5: (lv_model_attributes_5_0= ruleAttribute )
                    // InternalSecurityDsl.g:947:6: lv_model_attributes_5_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getUserAccess().getModel_attributesAttributeParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_model_attributes_5_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUserRule());
                    						}
                    						add(
                    							current,
                    							"model_attributes",
                    							lv_model_attributes_5_0,
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSecurityDsl.g:964:4: (otherlv_6= ',' ( (lv_model_attributes_7_0= ruleAttribute ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==39) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalSecurityDsl.g:965:5: otherlv_6= ',' ( (lv_model_attributes_7_0= ruleAttribute ) )
                    	    {
                    	    otherlv_6=(Token)match(input,39,FOLLOW_36); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getUserAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalSecurityDsl.g:969:5: ( (lv_model_attributes_7_0= ruleAttribute ) )
                    	    // InternalSecurityDsl.g:970:6: (lv_model_attributes_7_0= ruleAttribute )
                    	    {
                    	    // InternalSecurityDsl.g:970:6: (lv_model_attributes_7_0= ruleAttribute )
                    	    // InternalSecurityDsl.g:971:7: lv_model_attributes_7_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getUserAccess().getModel_attributesAttributeParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_37);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,40,FOLLOW_2); 

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
    // InternalSecurityDsl.g:998:1: entryRuleRoleInstance returns [EObject current=null] : iv_ruleRoleInstance= ruleRoleInstance EOF ;
    public final EObject entryRuleRoleInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleInstance = null;


        try {
            // InternalSecurityDsl.g:998:53: (iv_ruleRoleInstance= ruleRoleInstance EOF )
            // InternalSecurityDsl.g:999:2: iv_ruleRoleInstance= ruleRoleInstance EOF
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
    // InternalSecurityDsl.g:1005:1: ruleRoleInstance returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleRoleInstance() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:1011:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalSecurityDsl.g:1012:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalSecurityDsl.g:1012:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalSecurityDsl.g:1013:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalSecurityDsl.g:1013:3: ()
            // InternalSecurityDsl.g:1014:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoleInstanceAccess().getRoleInstanceAction_0(),
            					current);
            			

            }

            // InternalSecurityDsl.g:1020:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSecurityDsl.g:1021:4: (lv_name_1_0= ruleEString )
            {
            // InternalSecurityDsl.g:1021:4: (lv_name_1_0= ruleEString )
            // InternalSecurityDsl.g:1022:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRoleInstanceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoleInstanceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
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
    // InternalSecurityDsl.g:1043:1: entryRuleEndpoint returns [EObject current=null] : iv_ruleEndpoint= ruleEndpoint EOF ;
    public final EObject entryRuleEndpoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndpoint = null;


        try {
            // InternalSecurityDsl.g:1043:49: (iv_ruleEndpoint= ruleEndpoint EOF )
            // InternalSecurityDsl.g:1044:2: iv_ruleEndpoint= ruleEndpoint EOF
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
    // InternalSecurityDsl.g:1050:1: ruleEndpoint returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'url:' ( (lv_url_2_0= ruleEString ) ) (otherlv_3= 'functionName:' ( (lv_functionName_4_0= ruleEString ) ) )? (otherlv_5= 'method:' ( (lv_method_6_0= ruleEEndpointMethod ) ) )? (otherlv_7= 'type:' ( (lv_type_8_0= ruleEEndpointType ) ) )? (otherlv_9= 'roleAuthorities:' otherlv_10= '[' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ']' )? otherlv_15= '}' ) ;
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
        AntlrDatatypeRuleToken lv_url_2_0 = null;

        AntlrDatatypeRuleToken lv_functionName_4_0 = null;

        Enumerator lv_method_6_0 = null;

        Enumerator lv_type_8_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:1056:2: ( (otherlv_0= '{' otherlv_1= 'url:' ( (lv_url_2_0= ruleEString ) ) (otherlv_3= 'functionName:' ( (lv_functionName_4_0= ruleEString ) ) )? (otherlv_5= 'method:' ( (lv_method_6_0= ruleEEndpointMethod ) ) )? (otherlv_7= 'type:' ( (lv_type_8_0= ruleEEndpointType ) ) )? (otherlv_9= 'roleAuthorities:' otherlv_10= '[' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ']' )? otherlv_15= '}' ) )
            // InternalSecurityDsl.g:1057:2: (otherlv_0= '{' otherlv_1= 'url:' ( (lv_url_2_0= ruleEString ) ) (otherlv_3= 'functionName:' ( (lv_functionName_4_0= ruleEString ) ) )? (otherlv_5= 'method:' ( (lv_method_6_0= ruleEEndpointMethod ) ) )? (otherlv_7= 'type:' ( (lv_type_8_0= ruleEEndpointType ) ) )? (otherlv_9= 'roleAuthorities:' otherlv_10= '[' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ']' )? otherlv_15= '}' )
            {
            // InternalSecurityDsl.g:1057:2: (otherlv_0= '{' otherlv_1= 'url:' ( (lv_url_2_0= ruleEString ) ) (otherlv_3= 'functionName:' ( (lv_functionName_4_0= ruleEString ) ) )? (otherlv_5= 'method:' ( (lv_method_6_0= ruleEEndpointMethod ) ) )? (otherlv_7= 'type:' ( (lv_type_8_0= ruleEEndpointType ) ) )? (otherlv_9= 'roleAuthorities:' otherlv_10= '[' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ']' )? otherlv_15= '}' )
            // InternalSecurityDsl.g:1058:3: otherlv_0= '{' otherlv_1= 'url:' ( (lv_url_2_0= ruleEString ) ) (otherlv_3= 'functionName:' ( (lv_functionName_4_0= ruleEString ) ) )? (otherlv_5= 'method:' ( (lv_method_6_0= ruleEEndpointMethod ) ) )? (otherlv_7= 'type:' ( (lv_type_8_0= ruleEEndpointType ) ) )? (otherlv_9= 'roleAuthorities:' otherlv_10= '[' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ']' )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getEndpointAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEndpointAccess().getUrlKeyword_1());
            		
            // InternalSecurityDsl.g:1066:3: ( (lv_url_2_0= ruleEString ) )
            // InternalSecurityDsl.g:1067:4: (lv_url_2_0= ruleEString )
            {
            // InternalSecurityDsl.g:1067:4: (lv_url_2_0= ruleEString )
            // InternalSecurityDsl.g:1068:5: lv_url_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEndpointAccess().getUrlEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_40);
            lv_url_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEndpointRule());
            					}
            					set(
            						current,
            						"url",
            						lv_url_2_0,
            						"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecurityDsl.g:1085:3: (otherlv_3= 'functionName:' ( (lv_functionName_4_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==42) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSecurityDsl.g:1086:4: otherlv_3= 'functionName:' ( (lv_functionName_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getEndpointAccess().getFunctionNameKeyword_3_0());
                    			
                    // InternalSecurityDsl.g:1090:4: ( (lv_functionName_4_0= ruleEString ) )
                    // InternalSecurityDsl.g:1091:5: (lv_functionName_4_0= ruleEString )
                    {
                    // InternalSecurityDsl.g:1091:5: (lv_functionName_4_0= ruleEString )
                    // InternalSecurityDsl.g:1092:6: lv_functionName_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEndpointAccess().getFunctionNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_functionName_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEndpointRule());
                    						}
                    						set(
                    							current,
                    							"functionName",
                    							lv_functionName_4_0,
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:1110:3: (otherlv_5= 'method:' ( (lv_method_6_0= ruleEEndpointMethod ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==43) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSecurityDsl.g:1111:4: otherlv_5= 'method:' ( (lv_method_6_0= ruleEEndpointMethod ) )
                    {
                    otherlv_5=(Token)match(input,43,FOLLOW_42); 

                    				newLeafNode(otherlv_5, grammarAccess.getEndpointAccess().getMethodKeyword_4_0());
                    			
                    // InternalSecurityDsl.g:1115:4: ( (lv_method_6_0= ruleEEndpointMethod ) )
                    // InternalSecurityDsl.g:1116:5: (lv_method_6_0= ruleEEndpointMethod )
                    {
                    // InternalSecurityDsl.g:1116:5: (lv_method_6_0= ruleEEndpointMethod )
                    // InternalSecurityDsl.g:1117:6: lv_method_6_0= ruleEEndpointMethod
                    {

                    						newCompositeNode(grammarAccess.getEndpointAccess().getMethodEEndpointMethodEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_method_6_0=ruleEEndpointMethod();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEndpointRule());
                    						}
                    						set(
                    							current,
                    							"method",
                    							lv_method_6_0,
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.EEndpointMethod");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:1135:3: (otherlv_7= 'type:' ( (lv_type_8_0= ruleEEndpointType ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==33) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSecurityDsl.g:1136:4: otherlv_7= 'type:' ( (lv_type_8_0= ruleEEndpointType ) )
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_44); 

                    				newLeafNode(otherlv_7, grammarAccess.getEndpointAccess().getTypeKeyword_5_0());
                    			
                    // InternalSecurityDsl.g:1140:4: ( (lv_type_8_0= ruleEEndpointType ) )
                    // InternalSecurityDsl.g:1141:5: (lv_type_8_0= ruleEEndpointType )
                    {
                    // InternalSecurityDsl.g:1141:5: (lv_type_8_0= ruleEEndpointType )
                    // InternalSecurityDsl.g:1142:6: lv_type_8_0= ruleEEndpointType
                    {

                    						newCompositeNode(grammarAccess.getEndpointAccess().getTypeEEndpointTypeEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_45);
                    lv_type_8_0=ruleEEndpointType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEndpointRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_8_0,
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.EEndpointType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecurityDsl.g:1160:3: (otherlv_9= 'roleAuthorities:' otherlv_10= '[' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ']' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==44) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSecurityDsl.g:1161:4: otherlv_9= 'roleAuthorities:' otherlv_10= '[' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ']'
                    {
                    otherlv_9=(Token)match(input,44,FOLLOW_35); 

                    				newLeafNode(otherlv_9, grammarAccess.getEndpointAccess().getRoleAuthoritiesKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,38,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getEndpointAccess().getLeftSquareBracketKeyword_6_1());
                    			
                    // InternalSecurityDsl.g:1169:4: ( ( ruleEString ) )
                    // InternalSecurityDsl.g:1170:5: ( ruleEString )
                    {
                    // InternalSecurityDsl.g:1170:5: ( ruleEString )
                    // InternalSecurityDsl.g:1171:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEndpointRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEndpointAccess().getRole_authoritiesRoleInstanceCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_37);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSecurityDsl.g:1185:4: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==39) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalSecurityDsl.g:1186:5: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,39,FOLLOW_4); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getEndpointAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalSecurityDsl.g:1190:5: ( ( ruleEString ) )
                    	    // InternalSecurityDsl.g:1191:6: ( ruleEString )
                    	    {
                    	    // InternalSecurityDsl.g:1191:6: ( ruleEString )
                    	    // InternalSecurityDsl.g:1192:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEndpointRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEndpointAccess().getRole_authoritiesRoleInstanceCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_37);
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

                    otherlv_14=(Token)match(input,40,FOLLOW_33); 

                    				newLeafNode(otherlv_14, grammarAccess.getEndpointAccess().getRightSquareBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getEndpointAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalSecurityDsl.g:1220:1: entryRuleAuthentication returns [EObject current=null] : iv_ruleAuthentication= ruleAuthentication EOF ;
    public final EObject entryRuleAuthentication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthentication = null;


        try {
            // InternalSecurityDsl.g:1220:55: (iv_ruleAuthentication= ruleAuthentication EOF )
            // InternalSecurityDsl.g:1221:2: iv_ruleAuthentication= ruleAuthentication EOF
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
    // InternalSecurityDsl.g:1227:1: ruleAuthentication returns [EObject current=null] : ( () otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'path:' ( (lv_path_4_0= ruleEString ) ) (otherlv_5= 'endpoints:' otherlv_6= '[' ( (lv_controller_endpoints_7_0= ruleEndpoint ) ) (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )* otherlv_10= ']' )? ) ;
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
            // InternalSecurityDsl.g:1233:2: ( ( () otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'path:' ( (lv_path_4_0= ruleEString ) ) (otherlv_5= 'endpoints:' otherlv_6= '[' ( (lv_controller_endpoints_7_0= ruleEndpoint ) ) (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )* otherlv_10= ']' )? ) )
            // InternalSecurityDsl.g:1234:2: ( () otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'path:' ( (lv_path_4_0= ruleEString ) ) (otherlv_5= 'endpoints:' otherlv_6= '[' ( (lv_controller_endpoints_7_0= ruleEndpoint ) ) (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )* otherlv_10= ']' )? )
            {
            // InternalSecurityDsl.g:1234:2: ( () otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'path:' ( (lv_path_4_0= ruleEString ) ) (otherlv_5= 'endpoints:' otherlv_6= '[' ( (lv_controller_endpoints_7_0= ruleEndpoint ) ) (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )* otherlv_10= ']' )? )
            // InternalSecurityDsl.g:1235:3: () otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'path:' ( (lv_path_4_0= ruleEString ) ) (otherlv_5= 'endpoints:' otherlv_6= '[' ( (lv_controller_endpoints_7_0= ruleEndpoint ) ) (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )* otherlv_10= ']' )?
            {
            // InternalSecurityDsl.g:1235:3: ()
            // InternalSecurityDsl.g:1236:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAuthenticationAccess().getAuthenticationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAuthenticationAccess().getNameKeyword_1());
            		
            // InternalSecurityDsl.g:1246:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSecurityDsl.g:1247:4: (lv_name_2_0= ruleEString )
            {
            // InternalSecurityDsl.g:1247:4: (lv_name_2_0= ruleEString )
            // InternalSecurityDsl.g:1248:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAuthenticationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_46);
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

            otherlv_3=(Token)match(input,45,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getAuthenticationAccess().getPathKeyword_3());
            		
            // InternalSecurityDsl.g:1269:3: ( (lv_path_4_0= ruleEString ) )
            // InternalSecurityDsl.g:1270:4: (lv_path_4_0= ruleEString )
            {
            // InternalSecurityDsl.g:1270:4: (lv_path_4_0= ruleEString )
            // InternalSecurityDsl.g:1271:5: lv_path_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAuthenticationAccess().getPathEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_47);
            lv_path_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAuthenticationRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_4_0,
            						"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecurityDsl.g:1288:3: (otherlv_5= 'endpoints:' otherlv_6= '[' ( (lv_controller_endpoints_7_0= ruleEndpoint ) ) (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )* otherlv_10= ']' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==46) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSecurityDsl.g:1289:4: otherlv_5= 'endpoints:' otherlv_6= '[' ( (lv_controller_endpoints_7_0= ruleEndpoint ) ) (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )* otherlv_10= ']'
                    {
                    otherlv_5=(Token)match(input,46,FOLLOW_35); 

                    				newLeafNode(otherlv_5, grammarAccess.getAuthenticationAccess().getEndpointsKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,38,FOLLOW_36); 

                    				newLeafNode(otherlv_6, grammarAccess.getAuthenticationAccess().getLeftSquareBracketKeyword_5_1());
                    			
                    // InternalSecurityDsl.g:1297:4: ( (lv_controller_endpoints_7_0= ruleEndpoint ) )
                    // InternalSecurityDsl.g:1298:5: (lv_controller_endpoints_7_0= ruleEndpoint )
                    {
                    // InternalSecurityDsl.g:1298:5: (lv_controller_endpoints_7_0= ruleEndpoint )
                    // InternalSecurityDsl.g:1299:6: lv_controller_endpoints_7_0= ruleEndpoint
                    {

                    						newCompositeNode(grammarAccess.getAuthenticationAccess().getController_endpointsEndpointParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_controller_endpoints_7_0=ruleEndpoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAuthenticationRule());
                    						}
                    						add(
                    							current,
                    							"controller_endpoints",
                    							lv_controller_endpoints_7_0,
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.Endpoint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSecurityDsl.g:1316:4: (otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==39) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalSecurityDsl.g:1317:5: otherlv_8= ',' ( (lv_controller_endpoints_9_0= ruleEndpoint ) )
                    	    {
                    	    otherlv_8=(Token)match(input,39,FOLLOW_36); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getAuthenticationAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSecurityDsl.g:1321:5: ( (lv_controller_endpoints_9_0= ruleEndpoint ) )
                    	    // InternalSecurityDsl.g:1322:6: (lv_controller_endpoints_9_0= ruleEndpoint )
                    	    {
                    	    // InternalSecurityDsl.g:1322:6: (lv_controller_endpoints_9_0= ruleEndpoint )
                    	    // InternalSecurityDsl.g:1323:7: lv_controller_endpoints_9_0= ruleEndpoint
                    	    {

                    	    							newCompositeNode(grammarAccess.getAuthenticationAccess().getController_endpointsEndpointParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_37);
                    	    lv_controller_endpoints_9_0=ruleEndpoint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAuthenticationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"controller_endpoints",
                    	    								lv_controller_endpoints_9_0,
                    	    								"rs.ac.uns.ftn.securitydsl.SecurityDsl.Endpoint");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,40,FOLLOW_2); 

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
    // InternalSecurityDsl.g:1350:1: entryRuleJWT returns [EObject current=null] : iv_ruleJWT= ruleJWT EOF ;
    public final EObject entryRuleJWT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJWT = null;


        try {
            // InternalSecurityDsl.g:1350:44: (iv_ruleJWT= ruleJWT EOF )
            // InternalSecurityDsl.g:1351:2: iv_ruleJWT= ruleJWT EOF
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
    // InternalSecurityDsl.g:1357:1: ruleJWT returns [EObject current=null] : (otherlv_0= 'jwt:' otherlv_1= 'header:' otherlv_2= 'signatureAlgorithm:' ( (lv_signatureAlgorithm_3_0= ruleEString ) ) otherlv_4= 'payload:' otherlv_5= 'claims:' otherlv_6= '[' ( (lv_registeredclaims_7_0= ruleRegisteredClaims ) ) (otherlv_8= ',' ( (lv_jwt_claims_9_0= ruleClaim ) ) )* otherlv_10= ']' (otherlv_11= 'signature:' otherlv_12= 'secret:' ( (lv_secret_13_0= ruleEString ) ) )? ) ;
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

        EObject lv_registeredclaims_7_0 = null;

        EObject lv_jwt_claims_9_0 = null;

        AntlrDatatypeRuleToken lv_secret_13_0 = null;



        	enterRule();

        try {
            // InternalSecurityDsl.g:1363:2: ( (otherlv_0= 'jwt:' otherlv_1= 'header:' otherlv_2= 'signatureAlgorithm:' ( (lv_signatureAlgorithm_3_0= ruleEString ) ) otherlv_4= 'payload:' otherlv_5= 'claims:' otherlv_6= '[' ( (lv_registeredclaims_7_0= ruleRegisteredClaims ) ) (otherlv_8= ',' ( (lv_jwt_claims_9_0= ruleClaim ) ) )* otherlv_10= ']' (otherlv_11= 'signature:' otherlv_12= 'secret:' ( (lv_secret_13_0= ruleEString ) ) )? ) )
            // InternalSecurityDsl.g:1364:2: (otherlv_0= 'jwt:' otherlv_1= 'header:' otherlv_2= 'signatureAlgorithm:' ( (lv_signatureAlgorithm_3_0= ruleEString ) ) otherlv_4= 'payload:' otherlv_5= 'claims:' otherlv_6= '[' ( (lv_registeredclaims_7_0= ruleRegisteredClaims ) ) (otherlv_8= ',' ( (lv_jwt_claims_9_0= ruleClaim ) ) )* otherlv_10= ']' (otherlv_11= 'signature:' otherlv_12= 'secret:' ( (lv_secret_13_0= ruleEString ) ) )? )
            {
            // InternalSecurityDsl.g:1364:2: (otherlv_0= 'jwt:' otherlv_1= 'header:' otherlv_2= 'signatureAlgorithm:' ( (lv_signatureAlgorithm_3_0= ruleEString ) ) otherlv_4= 'payload:' otherlv_5= 'claims:' otherlv_6= '[' ( (lv_registeredclaims_7_0= ruleRegisteredClaims ) ) (otherlv_8= ',' ( (lv_jwt_claims_9_0= ruleClaim ) ) )* otherlv_10= ']' (otherlv_11= 'signature:' otherlv_12= 'secret:' ( (lv_secret_13_0= ruleEString ) ) )? )
            // InternalSecurityDsl.g:1365:3: otherlv_0= 'jwt:' otherlv_1= 'header:' otherlv_2= 'signatureAlgorithm:' ( (lv_signatureAlgorithm_3_0= ruleEString ) ) otherlv_4= 'payload:' otherlv_5= 'claims:' otherlv_6= '[' ( (lv_registeredclaims_7_0= ruleRegisteredClaims ) ) (otherlv_8= ',' ( (lv_jwt_claims_9_0= ruleClaim ) ) )* otherlv_10= ']' (otherlv_11= 'signature:' otherlv_12= 'secret:' ( (lv_secret_13_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,47,FOLLOW_48); 

            			newLeafNode(otherlv_0, grammarAccess.getJWTAccess().getJwtKeyword_0());
            		
            otherlv_1=(Token)match(input,48,FOLLOW_49); 

            			newLeafNode(otherlv_1, grammarAccess.getJWTAccess().getHeaderKeyword_1());
            		
            otherlv_2=(Token)match(input,49,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getJWTAccess().getSignatureAlgorithmKeyword_2());
            		
            // InternalSecurityDsl.g:1377:3: ( (lv_signatureAlgorithm_3_0= ruleEString ) )
            // InternalSecurityDsl.g:1378:4: (lv_signatureAlgorithm_3_0= ruleEString )
            {
            // InternalSecurityDsl.g:1378:4: (lv_signatureAlgorithm_3_0= ruleEString )
            // InternalSecurityDsl.g:1379:5: lv_signatureAlgorithm_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getJWTAccess().getSignatureAlgorithmEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_50);
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

            otherlv_4=(Token)match(input,50,FOLLOW_51); 

            			newLeafNode(otherlv_4, grammarAccess.getJWTAccess().getPayloadKeyword_4());
            		
            otherlv_5=(Token)match(input,51,FOLLOW_35); 

            			newLeafNode(otherlv_5, grammarAccess.getJWTAccess().getClaimsKeyword_5());
            		
            otherlv_6=(Token)match(input,38,FOLLOW_36); 

            			newLeafNode(otherlv_6, grammarAccess.getJWTAccess().getLeftSquareBracketKeyword_6());
            		
            // InternalSecurityDsl.g:1408:3: ( (lv_registeredclaims_7_0= ruleRegisteredClaims ) )
            // InternalSecurityDsl.g:1409:4: (lv_registeredclaims_7_0= ruleRegisteredClaims )
            {
            // InternalSecurityDsl.g:1409:4: (lv_registeredclaims_7_0= ruleRegisteredClaims )
            // InternalSecurityDsl.g:1410:5: lv_registeredclaims_7_0= ruleRegisteredClaims
            {

            					newCompositeNode(grammarAccess.getJWTAccess().getRegisteredclaimsRegisteredClaimsParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_37);
            lv_registeredclaims_7_0=ruleRegisteredClaims();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJWTRule());
            					}
            					set(
            						current,
            						"registeredclaims",
            						lv_registeredclaims_7_0,
            						"rs.ac.uns.ftn.securitydsl.SecurityDsl.RegisteredClaims");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecurityDsl.g:1427:3: (otherlv_8= ',' ( (lv_jwt_claims_9_0= ruleClaim ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==39) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalSecurityDsl.g:1428:4: otherlv_8= ',' ( (lv_jwt_claims_9_0= ruleClaim ) )
            	    {
            	    otherlv_8=(Token)match(input,39,FOLLOW_36); 

            	    				newLeafNode(otherlv_8, grammarAccess.getJWTAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalSecurityDsl.g:1432:4: ( (lv_jwt_claims_9_0= ruleClaim ) )
            	    // InternalSecurityDsl.g:1433:5: (lv_jwt_claims_9_0= ruleClaim )
            	    {
            	    // InternalSecurityDsl.g:1433:5: (lv_jwt_claims_9_0= ruleClaim )
            	    // InternalSecurityDsl.g:1434:6: lv_jwt_claims_9_0= ruleClaim
            	    {

            	    						newCompositeNode(grammarAccess.getJWTAccess().getJwt_claimsClaimParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_37);
            	    lv_jwt_claims_9_0=ruleClaim();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getJWTRule());
            	    						}
            	    						add(
            	    							current,
            	    							"jwt_claims",
            	    							lv_jwt_claims_9_0,
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

            otherlv_10=(Token)match(input,40,FOLLOW_52); 

            			newLeafNode(otherlv_10, grammarAccess.getJWTAccess().getRightSquareBracketKeyword_9());
            		
            // InternalSecurityDsl.g:1456:3: (otherlv_11= 'signature:' otherlv_12= 'secret:' ( (lv_secret_13_0= ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==52) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSecurityDsl.g:1457:4: otherlv_11= 'signature:' otherlv_12= 'secret:' ( (lv_secret_13_0= ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,52,FOLLOW_53); 

                    				newLeafNode(otherlv_11, grammarAccess.getJWTAccess().getSignatureKeyword_10_0());
                    			
                    otherlv_12=(Token)match(input,53,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getJWTAccess().getSecretKeyword_10_1());
                    			
                    // InternalSecurityDsl.g:1465:4: ( (lv_secret_13_0= ruleEString ) )
                    // InternalSecurityDsl.g:1466:5: (lv_secret_13_0= ruleEString )
                    {
                    // InternalSecurityDsl.g:1466:5: (lv_secret_13_0= ruleEString )
                    // InternalSecurityDsl.g:1467:6: lv_secret_13_0= ruleEString
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
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
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
    // InternalSecurityDsl.g:1489:1: entryRuleClaim returns [EObject current=null] : iv_ruleClaim= ruleClaim EOF ;
    public final EObject entryRuleClaim() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClaim = null;


        try {
            // InternalSecurityDsl.g:1489:46: (iv_ruleClaim= ruleClaim EOF )
            // InternalSecurityDsl.g:1490:2: iv_ruleClaim= ruleClaim EOF
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
    // InternalSecurityDsl.g:1496:1: ruleClaim returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_type_1_0= ruleEClaimType ) ) otherlv_2= ',' )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) otherlv_6= '}' ) ;
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
            // InternalSecurityDsl.g:1502:2: ( (otherlv_0= '{' ( ( (lv_type_1_0= ruleEClaimType ) ) otherlv_2= ',' )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalSecurityDsl.g:1503:2: (otherlv_0= '{' ( ( (lv_type_1_0= ruleEClaimType ) ) otherlv_2= ',' )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalSecurityDsl.g:1503:2: (otherlv_0= '{' ( ( (lv_type_1_0= ruleEClaimType ) ) otherlv_2= ',' )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalSecurityDsl.g:1504:3: otherlv_0= '{' ( ( (lv_type_1_0= ruleEClaimType ) ) otherlv_2= ',' )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_54); 

            			newLeafNode(otherlv_0, grammarAccess.getClaimAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalSecurityDsl.g:1508:3: ( ( (lv_type_1_0= ruleEClaimType ) ) otherlv_2= ',' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=79 && LA36_0<=81)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSecurityDsl.g:1509:4: ( (lv_type_1_0= ruleEClaimType ) ) otherlv_2= ','
                    {
                    // InternalSecurityDsl.g:1509:4: ( (lv_type_1_0= ruleEClaimType ) )
                    // InternalSecurityDsl.g:1510:5: (lv_type_1_0= ruleEClaimType )
                    {
                    // InternalSecurityDsl.g:1510:5: (lv_type_1_0= ruleEClaimType )
                    // InternalSecurityDsl.g:1511:6: lv_type_1_0= ruleEClaimType
                    {

                    						newCompositeNode(grammarAccess.getClaimAccess().getTypeEClaimTypeEnumRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_55);
                    lv_type_1_0=ruleEClaimType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClaimRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_1_0,
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.EClaimType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,39,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getClaimAccess().getCommaKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalSecurityDsl.g:1533:3: ( (lv_name_3_0= ruleEString ) )
            // InternalSecurityDsl.g:1534:4: (lv_name_3_0= ruleEString )
            {
            // InternalSecurityDsl.g:1534:4: (lv_name_3_0= ruleEString )
            // InternalSecurityDsl.g:1535:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClaimAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_56);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClaimRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,54,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getClaimAccess().getColonKeyword_3());
            		
            // InternalSecurityDsl.g:1556:3: ( ( ruleEString ) )
            // InternalSecurityDsl.g:1557:4: ( ruleEString )
            {
            // InternalSecurityDsl.g:1557:4: ( ruleEString )
            // InternalSecurityDsl.g:1558:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClaimRule());
            					}
            				

            					newCompositeNode(grammarAccess.getClaimAccess().getClaim_attributeAttributeCrossReference_4_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,35,FOLLOW_2); 

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


    // $ANTLR start "entryRuleRegisteredClaims"
    // InternalSecurityDsl.g:1580:1: entryRuleRegisteredClaims returns [EObject current=null] : iv_ruleRegisteredClaims= ruleRegisteredClaims EOF ;
    public final EObject entryRuleRegisteredClaims() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegisteredClaims = null;


        try {
            // InternalSecurityDsl.g:1580:57: (iv_ruleRegisteredClaims= ruleRegisteredClaims EOF )
            // InternalSecurityDsl.g:1581:2: iv_ruleRegisteredClaims= ruleRegisteredClaims EOF
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
    // InternalSecurityDsl.g:1587:1: ruleRegisteredClaims returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'REGISTERED,' otherlv_2= 'expirationTime:' ( (lv_expirationTime_3_0= ruleEInt ) ) otherlv_4= '}' (otherlv_5= ',' otherlv_6= '{' otherlv_7= 'REGISTERED,' otherlv_8= 'issuer:' ( (lv_issuer_9_0= ruleEString ) ) otherlv_10= '}' )? (otherlv_11= ',' otherlv_12= '{' otherlv_13= 'REGISTERED,' otherlv_14= 'audience:' ( (lv_audience_15_0= ruleEString ) ) otherlv_16= '}' )? ) ;
    public final EObject ruleRegisteredClaims() throws RecognitionException {
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
            // InternalSecurityDsl.g:1593:2: ( (otherlv_0= '{' otherlv_1= 'REGISTERED,' otherlv_2= 'expirationTime:' ( (lv_expirationTime_3_0= ruleEInt ) ) otherlv_4= '}' (otherlv_5= ',' otherlv_6= '{' otherlv_7= 'REGISTERED,' otherlv_8= 'issuer:' ( (lv_issuer_9_0= ruleEString ) ) otherlv_10= '}' )? (otherlv_11= ',' otherlv_12= '{' otherlv_13= 'REGISTERED,' otherlv_14= 'audience:' ( (lv_audience_15_0= ruleEString ) ) otherlv_16= '}' )? ) )
            // InternalSecurityDsl.g:1594:2: (otherlv_0= '{' otherlv_1= 'REGISTERED,' otherlv_2= 'expirationTime:' ( (lv_expirationTime_3_0= ruleEInt ) ) otherlv_4= '}' (otherlv_5= ',' otherlv_6= '{' otherlv_7= 'REGISTERED,' otherlv_8= 'issuer:' ( (lv_issuer_9_0= ruleEString ) ) otherlv_10= '}' )? (otherlv_11= ',' otherlv_12= '{' otherlv_13= 'REGISTERED,' otherlv_14= 'audience:' ( (lv_audience_15_0= ruleEString ) ) otherlv_16= '}' )? )
            {
            // InternalSecurityDsl.g:1594:2: (otherlv_0= '{' otherlv_1= 'REGISTERED,' otherlv_2= 'expirationTime:' ( (lv_expirationTime_3_0= ruleEInt ) ) otherlv_4= '}' (otherlv_5= ',' otherlv_6= '{' otherlv_7= 'REGISTERED,' otherlv_8= 'issuer:' ( (lv_issuer_9_0= ruleEString ) ) otherlv_10= '}' )? (otherlv_11= ',' otherlv_12= '{' otherlv_13= 'REGISTERED,' otherlv_14= 'audience:' ( (lv_audience_15_0= ruleEString ) ) otherlv_16= '}' )? )
            // InternalSecurityDsl.g:1595:3: otherlv_0= '{' otherlv_1= 'REGISTERED,' otherlv_2= 'expirationTime:' ( (lv_expirationTime_3_0= ruleEInt ) ) otherlv_4= '}' (otherlv_5= ',' otherlv_6= '{' otherlv_7= 'REGISTERED,' otherlv_8= 'issuer:' ( (lv_issuer_9_0= ruleEString ) ) otherlv_10= '}' )? (otherlv_11= ',' otherlv_12= '{' otherlv_13= 'REGISTERED,' otherlv_14= 'audience:' ( (lv_audience_15_0= ruleEString ) ) otherlv_16= '}' )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_57); 

            			newLeafNode(otherlv_0, grammarAccess.getRegisteredClaimsAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,55,FOLLOW_58); 

            			newLeafNode(otherlv_1, grammarAccess.getRegisteredClaimsAccess().getREGISTEREDKeyword_1());
            		
            otherlv_2=(Token)match(input,56,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getRegisteredClaimsAccess().getExpirationTimeKeyword_2());
            		
            // InternalSecurityDsl.g:1607:3: ( (lv_expirationTime_3_0= ruleEInt ) )
            // InternalSecurityDsl.g:1608:4: (lv_expirationTime_3_0= ruleEInt )
            {
            // InternalSecurityDsl.g:1608:4: (lv_expirationTime_3_0= ruleEInt )
            // InternalSecurityDsl.g:1609:5: lv_expirationTime_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRegisteredClaimsAccess().getExpirationTimeEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_33);
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

            otherlv_4=(Token)match(input,35,FOLLOW_59); 

            			newLeafNode(otherlv_4, grammarAccess.getRegisteredClaimsAccess().getRightCurlyBracketKeyword_4());
            		
            // InternalSecurityDsl.g:1630:3: (otherlv_5= ',' otherlv_6= '{' otherlv_7= 'REGISTERED,' otherlv_8= 'issuer:' ( (lv_issuer_9_0= ruleEString ) ) otherlv_10= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==39) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==31) ) {
                    int LA37_3 = input.LA(3);

                    if ( (LA37_3==55) ) {
                        int LA37_4 = input.LA(4);

                        if ( (LA37_4==57) ) {
                            alt37=1;
                        }
                    }
                }
            }
            switch (alt37) {
                case 1 :
                    // InternalSecurityDsl.g:1631:4: otherlv_5= ',' otherlv_6= '{' otherlv_7= 'REGISTERED,' otherlv_8= 'issuer:' ( (lv_issuer_9_0= ruleEString ) ) otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,39,FOLLOW_36); 

                    				newLeafNode(otherlv_5, grammarAccess.getRegisteredClaimsAccess().getCommaKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,31,FOLLOW_57); 

                    				newLeafNode(otherlv_6, grammarAccess.getRegisteredClaimsAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    otherlv_7=(Token)match(input,55,FOLLOW_60); 

                    				newLeafNode(otherlv_7, grammarAccess.getRegisteredClaimsAccess().getREGISTEREDKeyword_5_2());
                    			
                    otherlv_8=(Token)match(input,57,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getRegisteredClaimsAccess().getIssuerKeyword_5_3());
                    			
                    // InternalSecurityDsl.g:1647:4: ( (lv_issuer_9_0= ruleEString ) )
                    // InternalSecurityDsl.g:1648:5: (lv_issuer_9_0= ruleEString )
                    {
                    // InternalSecurityDsl.g:1648:5: (lv_issuer_9_0= ruleEString )
                    // InternalSecurityDsl.g:1649:6: lv_issuer_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRegisteredClaimsAccess().getIssuerEStringParserRuleCall_5_4_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_issuer_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRegisteredClaimsRule());
                    						}
                    						set(
                    							current,
                    							"issuer",
                    							lv_issuer_9_0,
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,35,FOLLOW_59); 

                    				newLeafNode(otherlv_10, grammarAccess.getRegisteredClaimsAccess().getRightCurlyBracketKeyword_5_5());
                    			

                    }
                    break;

            }

            // InternalSecurityDsl.g:1671:3: (otherlv_11= ',' otherlv_12= '{' otherlv_13= 'REGISTERED,' otherlv_14= 'audience:' ( (lv_audience_15_0= ruleEString ) ) otherlv_16= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==39) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==31) ) {
                    int LA38_3 = input.LA(3);

                    if ( (LA38_3==55) ) {
                        alt38=1;
                    }
                }
            }
            switch (alt38) {
                case 1 :
                    // InternalSecurityDsl.g:1672:4: otherlv_11= ',' otherlv_12= '{' otherlv_13= 'REGISTERED,' otherlv_14= 'audience:' ( (lv_audience_15_0= ruleEString ) ) otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,39,FOLLOW_36); 

                    				newLeafNode(otherlv_11, grammarAccess.getRegisteredClaimsAccess().getCommaKeyword_6_0());
                    			
                    otherlv_12=(Token)match(input,31,FOLLOW_57); 

                    				newLeafNode(otherlv_12, grammarAccess.getRegisteredClaimsAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    otherlv_13=(Token)match(input,55,FOLLOW_61); 

                    				newLeafNode(otherlv_13, grammarAccess.getRegisteredClaimsAccess().getREGISTEREDKeyword_6_2());
                    			
                    otherlv_14=(Token)match(input,58,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getRegisteredClaimsAccess().getAudienceKeyword_6_3());
                    			
                    // InternalSecurityDsl.g:1688:4: ( (lv_audience_15_0= ruleEString ) )
                    // InternalSecurityDsl.g:1689:5: (lv_audience_15_0= ruleEString )
                    {
                    // InternalSecurityDsl.g:1689:5: (lv_audience_15_0= ruleEString )
                    // InternalSecurityDsl.g:1690:6: lv_audience_15_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRegisteredClaimsAccess().getAudienceEStringParserRuleCall_6_4_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_audience_15_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRegisteredClaimsRule());
                    						}
                    						set(
                    							current,
                    							"audience",
                    							lv_audience_15_0,
                    							"rs.ac.uns.ftn.securitydsl.SecurityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,35,FOLLOW_2); 

                    				newLeafNode(otherlv_16, grammarAccess.getRegisteredClaimsAccess().getRightCurlyBracketKeyword_6_5());
                    			

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
    // $ANTLR end "ruleRegisteredClaims"


    // $ANTLR start "entryRuleEInt"
    // InternalSecurityDsl.g:1716:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSecurityDsl.g:1716:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSecurityDsl.g:1717:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalSecurityDsl.g:1723:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSecurityDsl.g:1729:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSecurityDsl.g:1730:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSecurityDsl.g:1730:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSecurityDsl.g:1731:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSecurityDsl.g:1731:3: (kw= '-' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==30) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSecurityDsl.g:1732:4: kw= '-'
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
    // InternalSecurityDsl.g:1749:1: ruleEDatabaseType returns [Enumerator current=null] : ( (enumLiteral_0= 'PostgreSQL' ) | (enumLiteral_1= 'Oracle' ) | (enumLiteral_2= 'MySQL' ) ) ;
    public final Enumerator ruleEDatabaseType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSecurityDsl.g:1755:2: ( ( (enumLiteral_0= 'PostgreSQL' ) | (enumLiteral_1= 'Oracle' ) | (enumLiteral_2= 'MySQL' ) ) )
            // InternalSecurityDsl.g:1756:2: ( (enumLiteral_0= 'PostgreSQL' ) | (enumLiteral_1= 'Oracle' ) | (enumLiteral_2= 'MySQL' ) )
            {
            // InternalSecurityDsl.g:1756:2: ( (enumLiteral_0= 'PostgreSQL' ) | (enumLiteral_1= 'Oracle' ) | (enumLiteral_2= 'MySQL' ) )
            int alt40=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt40=1;
                }
                break;
            case 60:
                {
                alt40=2;
                }
                break;
            case 61:
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
                    // InternalSecurityDsl.g:1757:3: (enumLiteral_0= 'PostgreSQL' )
                    {
                    // InternalSecurityDsl.g:1757:3: (enumLiteral_0= 'PostgreSQL' )
                    // InternalSecurityDsl.g:1758:4: enumLiteral_0= 'PostgreSQL'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getEDatabaseTypeAccess().getPostgreSQLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEDatabaseTypeAccess().getPostgreSQLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:1765:3: (enumLiteral_1= 'Oracle' )
                    {
                    // InternalSecurityDsl.g:1765:3: (enumLiteral_1= 'Oracle' )
                    // InternalSecurityDsl.g:1766:4: enumLiteral_1= 'Oracle'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getEDatabaseTypeAccess().getOracleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEDatabaseTypeAccess().getOracleEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:1773:3: (enumLiteral_2= 'MySQL' )
                    {
                    // InternalSecurityDsl.g:1773:3: (enumLiteral_2= 'MySQL' )
                    // InternalSecurityDsl.g:1774:4: enumLiteral_2= 'MySQL'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_2); 

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
    // InternalSecurityDsl.g:1784:1: ruleEType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Float' ) | (enumLiteral_2= 'Long' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'char' ) | (enumLiteral_5= 'Double' ) | (enumLiteral_6= 'DateTime' ) | (enumLiteral_7= 'Date' ) | (enumLiteral_8= 'int' ) ) ;
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
            // InternalSecurityDsl.g:1790:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Float' ) | (enumLiteral_2= 'Long' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'char' ) | (enumLiteral_5= 'Double' ) | (enumLiteral_6= 'DateTime' ) | (enumLiteral_7= 'Date' ) | (enumLiteral_8= 'int' ) ) )
            // InternalSecurityDsl.g:1791:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Float' ) | (enumLiteral_2= 'Long' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'char' ) | (enumLiteral_5= 'Double' ) | (enumLiteral_6= 'DateTime' ) | (enumLiteral_7= 'Date' ) | (enumLiteral_8= 'int' ) )
            {
            // InternalSecurityDsl.g:1791:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Float' ) | (enumLiteral_2= 'Long' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'char' ) | (enumLiteral_5= 'Double' ) | (enumLiteral_6= 'DateTime' ) | (enumLiteral_7= 'Date' ) | (enumLiteral_8= 'int' ) )
            int alt41=9;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt41=1;
                }
                break;
            case 63:
                {
                alt41=2;
                }
                break;
            case 64:
                {
                alt41=3;
                }
                break;
            case 65:
                {
                alt41=4;
                }
                break;
            case 66:
                {
                alt41=5;
                }
                break;
            case 67:
                {
                alt41=6;
                }
                break;
            case 68:
                {
                alt41=7;
                }
                break;
            case 69:
                {
                alt41=8;
                }
                break;
            case 70:
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
                    // InternalSecurityDsl.g:1792:3: (enumLiteral_0= 'String' )
                    {
                    // InternalSecurityDsl.g:1792:3: (enumLiteral_0= 'String' )
                    // InternalSecurityDsl.g:1793:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getETypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:1800:3: (enumLiteral_1= 'Float' )
                    {
                    // InternalSecurityDsl.g:1800:3: (enumLiteral_1= 'Float' )
                    // InternalSecurityDsl.g:1801:4: enumLiteral_1= 'Float'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getFloatEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getETypeAccess().getFloatEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:1808:3: (enumLiteral_2= 'Long' )
                    {
                    // InternalSecurityDsl.g:1808:3: (enumLiteral_2= 'Long' )
                    // InternalSecurityDsl.g:1809:4: enumLiteral_2= 'Long'
                    {
                    enumLiteral_2=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getLongEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getETypeAccess().getLongEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:1816:3: (enumLiteral_3= 'Integer' )
                    {
                    // InternalSecurityDsl.g:1816:3: (enumLiteral_3= 'Integer' )
                    // InternalSecurityDsl.g:1817:4: enumLiteral_3= 'Integer'
                    {
                    enumLiteral_3=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getIntegerEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getETypeAccess().getIntegerEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSecurityDsl.g:1824:3: (enumLiteral_4= 'char' )
                    {
                    // InternalSecurityDsl.g:1824:3: (enumLiteral_4= 'char' )
                    // InternalSecurityDsl.g:1825:4: enumLiteral_4= 'char'
                    {
                    enumLiteral_4=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getCharEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getETypeAccess().getCharEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSecurityDsl.g:1832:3: (enumLiteral_5= 'Double' )
                    {
                    // InternalSecurityDsl.g:1832:3: (enumLiteral_5= 'Double' )
                    // InternalSecurityDsl.g:1833:4: enumLiteral_5= 'Double'
                    {
                    enumLiteral_5=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getDoubleEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getETypeAccess().getDoubleEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSecurityDsl.g:1840:3: (enumLiteral_6= 'DateTime' )
                    {
                    // InternalSecurityDsl.g:1840:3: (enumLiteral_6= 'DateTime' )
                    // InternalSecurityDsl.g:1841:4: enumLiteral_6= 'DateTime'
                    {
                    enumLiteral_6=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getDateTimeEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getETypeAccess().getDateTimeEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSecurityDsl.g:1848:3: (enumLiteral_7= 'Date' )
                    {
                    // InternalSecurityDsl.g:1848:3: (enumLiteral_7= 'Date' )
                    // InternalSecurityDsl.g:1849:4: enumLiteral_7= 'Date'
                    {
                    enumLiteral_7=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getETypeAccess().getDateEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getETypeAccess().getDateEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalSecurityDsl.g:1856:3: (enumLiteral_8= 'int' )
                    {
                    // InternalSecurityDsl.g:1856:3: (enumLiteral_8= 'int' )
                    // InternalSecurityDsl.g:1857:4: enumLiteral_8= 'int'
                    {
                    enumLiteral_8=(Token)match(input,70,FOLLOW_2); 

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
    // InternalSecurityDsl.g:1867:1: ruleEEndpointMethod returns [Enumerator current=null] : ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) ;
    public final Enumerator ruleEEndpointMethod() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSecurityDsl.g:1873:2: ( ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) )
            // InternalSecurityDsl.g:1874:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            {
            // InternalSecurityDsl.g:1874:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            int alt42=4;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt42=1;
                }
                break;
            case 72:
                {
                alt42=2;
                }
                break;
            case 73:
                {
                alt42=3;
                }
                break;
            case 74:
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
                    // InternalSecurityDsl.g:1875:3: (enumLiteral_0= 'GET' )
                    {
                    // InternalSecurityDsl.g:1875:3: (enumLiteral_0= 'GET' )
                    // InternalSecurityDsl.g:1876:4: enumLiteral_0= 'GET'
                    {
                    enumLiteral_0=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getEEndpointMethodAccess().getGETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEEndpointMethodAccess().getGETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:1883:3: (enumLiteral_1= 'POST' )
                    {
                    // InternalSecurityDsl.g:1883:3: (enumLiteral_1= 'POST' )
                    // InternalSecurityDsl.g:1884:4: enumLiteral_1= 'POST'
                    {
                    enumLiteral_1=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getEEndpointMethodAccess().getPOSTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEEndpointMethodAccess().getPOSTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:1891:3: (enumLiteral_2= 'PUT' )
                    {
                    // InternalSecurityDsl.g:1891:3: (enumLiteral_2= 'PUT' )
                    // InternalSecurityDsl.g:1892:4: enumLiteral_2= 'PUT'
                    {
                    enumLiteral_2=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getEEndpointMethodAccess().getPUTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEEndpointMethodAccess().getPUTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:1899:3: (enumLiteral_3= 'DELETE' )
                    {
                    // InternalSecurityDsl.g:1899:3: (enumLiteral_3= 'DELETE' )
                    // InternalSecurityDsl.g:1900:4: enumLiteral_3= 'DELETE'
                    {
                    enumLiteral_3=(Token)match(input,74,FOLLOW_2); 

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
    // InternalSecurityDsl.g:1910:1: ruleEEndpointType returns [Enumerator current=null] : ( (enumLiteral_0= 'REGISTRATION' ) | (enumLiteral_1= 'LOGIN' ) | (enumLiteral_2= 'LOGOUT' ) | (enumLiteral_3= 'OTHER' ) ) ;
    public final Enumerator ruleEEndpointType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSecurityDsl.g:1916:2: ( ( (enumLiteral_0= 'REGISTRATION' ) | (enumLiteral_1= 'LOGIN' ) | (enumLiteral_2= 'LOGOUT' ) | (enumLiteral_3= 'OTHER' ) ) )
            // InternalSecurityDsl.g:1917:2: ( (enumLiteral_0= 'REGISTRATION' ) | (enumLiteral_1= 'LOGIN' ) | (enumLiteral_2= 'LOGOUT' ) | (enumLiteral_3= 'OTHER' ) )
            {
            // InternalSecurityDsl.g:1917:2: ( (enumLiteral_0= 'REGISTRATION' ) | (enumLiteral_1= 'LOGIN' ) | (enumLiteral_2= 'LOGOUT' ) | (enumLiteral_3= 'OTHER' ) )
            int alt43=4;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt43=1;
                }
                break;
            case 76:
                {
                alt43=2;
                }
                break;
            case 77:
                {
                alt43=3;
                }
                break;
            case 78:
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
                    // InternalSecurityDsl.g:1918:3: (enumLiteral_0= 'REGISTRATION' )
                    {
                    // InternalSecurityDsl.g:1918:3: (enumLiteral_0= 'REGISTRATION' )
                    // InternalSecurityDsl.g:1919:4: enumLiteral_0= 'REGISTRATION'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getEEndpointTypeAccess().getREGISTRATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEEndpointTypeAccess().getREGISTRATIONEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:1926:3: (enumLiteral_1= 'LOGIN' )
                    {
                    // InternalSecurityDsl.g:1926:3: (enumLiteral_1= 'LOGIN' )
                    // InternalSecurityDsl.g:1927:4: enumLiteral_1= 'LOGIN'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getEEndpointTypeAccess().getLOGINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEEndpointTypeAccess().getLOGINEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:1934:3: (enumLiteral_2= 'LOGOUT' )
                    {
                    // InternalSecurityDsl.g:1934:3: (enumLiteral_2= 'LOGOUT' )
                    // InternalSecurityDsl.g:1935:4: enumLiteral_2= 'LOGOUT'
                    {
                    enumLiteral_2=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getEEndpointTypeAccess().getLOGOUTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEEndpointTypeAccess().getLOGOUTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityDsl.g:1942:3: (enumLiteral_3= 'OTHER' )
                    {
                    // InternalSecurityDsl.g:1942:3: (enumLiteral_3= 'OTHER' )
                    // InternalSecurityDsl.g:1943:4: enumLiteral_3= 'OTHER'
                    {
                    enumLiteral_3=(Token)match(input,78,FOLLOW_2); 

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
    // InternalSecurityDsl.g:1953:1: ruleEClaimType returns [Enumerator current=null] : ( (enumLiteral_0= 'PRIVATE' ) | (enumLiteral_1= 'PUBLIC' ) | (enumLiteral_2= 'REGISTERED' ) ) ;
    public final Enumerator ruleEClaimType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSecurityDsl.g:1959:2: ( ( (enumLiteral_0= 'PRIVATE' ) | (enumLiteral_1= 'PUBLIC' ) | (enumLiteral_2= 'REGISTERED' ) ) )
            // InternalSecurityDsl.g:1960:2: ( (enumLiteral_0= 'PRIVATE' ) | (enumLiteral_1= 'PUBLIC' ) | (enumLiteral_2= 'REGISTERED' ) )
            {
            // InternalSecurityDsl.g:1960:2: ( (enumLiteral_0= 'PRIVATE' ) | (enumLiteral_1= 'PUBLIC' ) | (enumLiteral_2= 'REGISTERED' ) )
            int alt44=3;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt44=1;
                }
                break;
            case 80:
                {
                alt44=2;
                }
                break;
            case 81:
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
                    // InternalSecurityDsl.g:1961:3: (enumLiteral_0= 'PRIVATE' )
                    {
                    // InternalSecurityDsl.g:1961:3: (enumLiteral_0= 'PRIVATE' )
                    // InternalSecurityDsl.g:1962:4: enumLiteral_0= 'PRIVATE'
                    {
                    enumLiteral_0=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getEClaimTypeAccess().getPRIVATEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEClaimTypeAccess().getPRIVATEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityDsl.g:1969:3: (enumLiteral_1= 'PUBLIC' )
                    {
                    // InternalSecurityDsl.g:1969:3: (enumLiteral_1= 'PUBLIC' )
                    // InternalSecurityDsl.g:1970:4: enumLiteral_1= 'PUBLIC'
                    {
                    enumLiteral_1=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getEClaimTypeAccess().getPUBLICEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEClaimTypeAccess().getPUBLICEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityDsl.g:1977:3: (enumLiteral_2= 'REGISTERED' )
                    {
                    // InternalSecurityDsl.g:1977:3: (enumLiteral_2= 'REGISTERED' )
                    // InternalSecurityDsl.g:1978:4: enumLiteral_2= 'REGISTERED'
                    {
                    enumLiteral_2=(Token)match(input,81,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000019FF002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000019FE002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000019FC002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000019F8002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000019F0002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000019E0002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000019C0002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001980002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001900002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001E00002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000003001C00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000023001800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x3800000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100002000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0xC000000000000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000022000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00001C0A00000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000180A00000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000780L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000100A00000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007800L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000100800000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000030L,0x0000000000038000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0400000000000000L});

}