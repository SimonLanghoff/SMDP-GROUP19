package dk.itu.smdp.group19.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.itu.smdp.group19.services.SurveyDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSurveyDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'start survey'", "'title:'", "'pages:'", "'end survey'", "'add question page'", "'text:'", "'questions:'", "'end page'", "'add description page'", "'add result page'", "'add free text question'", "'optional'", "'requires:'", "'answers:'", "'end question'", "'add single choice question'", "'add multi choice question'", "'and('", "'and'", "')'", "'or('", "'or'", "'answer reference:'", "'add answer choice'", "'name:'", "'add answer text'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalSurveyDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSurveyDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSurveyDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g"; }



     	private SurveyDSLGrammarAccess grammarAccess;
     	
        public InternalSurveyDSLParser(TokenStream input, SurveyDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Survey";	
       	}
       	
       	@Override
       	protected SurveyDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSurvey"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:67:1: entryRuleSurvey returns [EObject current=null] : iv_ruleSurvey= ruleSurvey EOF ;
    public final EObject entryRuleSurvey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurvey = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:68:2: (iv_ruleSurvey= ruleSurvey EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:69:2: iv_ruleSurvey= ruleSurvey EOF
            {
             newCompositeNode(grammarAccess.getSurveyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSurvey_in_entryRuleSurvey75);
            iv_ruleSurvey=ruleSurvey();

            state._fsp--;

             current =iv_ruleSurvey; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSurvey85); 

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
    // $ANTLR end "entryRuleSurvey"


    // $ANTLR start "ruleSurvey"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:76:1: ruleSurvey returns [EObject current=null] : (otherlv_0= 'start survey' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) otherlv_3= 'pages:' ( (lv_pages_4_0= rulePage ) ) ( (lv_pages_5_0= rulePage ) )* otherlv_6= 'end survey' ) ;
    public final EObject ruleSurvey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_title_2_0 = null;

        EObject lv_pages_4_0 = null;

        EObject lv_pages_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:79:28: ( (otherlv_0= 'start survey' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) otherlv_3= 'pages:' ( (lv_pages_4_0= rulePage ) ) ( (lv_pages_5_0= rulePage ) )* otherlv_6= 'end survey' ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:80:1: (otherlv_0= 'start survey' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) otherlv_3= 'pages:' ( (lv_pages_4_0= rulePage ) ) ( (lv_pages_5_0= rulePage ) )* otherlv_6= 'end survey' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:80:1: (otherlv_0= 'start survey' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) otherlv_3= 'pages:' ( (lv_pages_4_0= rulePage ) ) ( (lv_pages_5_0= rulePage ) )* otherlv_6= 'end survey' )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:80:3: otherlv_0= 'start survey' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) otherlv_3= 'pages:' ( (lv_pages_4_0= rulePage ) ) ( (lv_pages_5_0= rulePage ) )* otherlv_6= 'end survey'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleSurvey122); 

                	newLeafNode(otherlv_0, grammarAccess.getSurveyAccess().getStartSurveyKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSurvey134); 

                	newLeafNode(otherlv_1, grammarAccess.getSurveyAccess().getTitleKeyword_1());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:88:1: ( (lv_title_2_0= ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:89:1: (lv_title_2_0= ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:89:1: (lv_title_2_0= ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:90:3: lv_title_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSurveyAccess().getTitleEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSurvey155);
            lv_title_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSurvey167); 

                	newLeafNode(otherlv_3, grammarAccess.getSurveyAccess().getPagesKeyword_3());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:110:1: ( (lv_pages_4_0= rulePage ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:111:1: (lv_pages_4_0= rulePage )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:111:1: (lv_pages_4_0= rulePage )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:112:3: lv_pages_4_0= rulePage
            {
             
            	        newCompositeNode(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePage_in_ruleSurvey188);
            lv_pages_4_0=rulePage();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	        }
                   		add(
                   			current, 
                   			"pages",
                    		lv_pages_4_0, 
                    		"Page");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:128:2: ( (lv_pages_5_0= rulePage ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15||(LA1_0>=19 && LA1_0<=20)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:129:1: (lv_pages_5_0= rulePage )
            	    {
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:129:1: (lv_pages_5_0= rulePage )
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:130:3: lv_pages_5_0= rulePage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePage_in_ruleSurvey209);
            	    lv_pages_5_0=rulePage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"pages",
            	            		lv_pages_5_0, 
            	            		"Page");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSurvey222); 

                	newLeafNode(otherlv_6, grammarAccess.getSurveyAccess().getEndSurveyKeyword_6());
                

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
    // $ANTLR end "ruleSurvey"


    // $ANTLR start "entryRulePage"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:158:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:159:2: (iv_rulePage= rulePage EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:160:2: iv_rulePage= rulePage EOF
            {
             newCompositeNode(grammarAccess.getPageRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePage_in_entryRulePage258);
            iv_rulePage=rulePage();

            state._fsp--;

             current =iv_rulePage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePage268); 

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
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:167:1: rulePage returns [EObject current=null] : (this_QuestionPage_0= ruleQuestionPage | this_DescriptionPage_1= ruleDescriptionPage | this_ResultPage_2= ruleResultPage ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        EObject this_QuestionPage_0 = null;

        EObject this_DescriptionPage_1 = null;

        EObject this_ResultPage_2 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:170:28: ( (this_QuestionPage_0= ruleQuestionPage | this_DescriptionPage_1= ruleDescriptionPage | this_ResultPage_2= ruleResultPage ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:171:1: (this_QuestionPage_0= ruleQuestionPage | this_DescriptionPage_1= ruleDescriptionPage | this_ResultPage_2= ruleResultPage )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:171:1: (this_QuestionPage_0= ruleQuestionPage | this_DescriptionPage_1= ruleDescriptionPage | this_ResultPage_2= ruleResultPage )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:172:5: this_QuestionPage_0= ruleQuestionPage
                    {
                     
                            newCompositeNode(grammarAccess.getPageAccess().getQuestionPageParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleQuestionPage_in_rulePage315);
                    this_QuestionPage_0=ruleQuestionPage();

                    state._fsp--;

                     
                            current = this_QuestionPage_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:182:5: this_DescriptionPage_1= ruleDescriptionPage
                    {
                     
                            newCompositeNode(grammarAccess.getPageAccess().getDescriptionPageParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDescriptionPage_in_rulePage342);
                    this_DescriptionPage_1=ruleDescriptionPage();

                    state._fsp--;

                     
                            current = this_DescriptionPage_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:192:5: this_ResultPage_2= ruleResultPage
                    {
                     
                            newCompositeNode(grammarAccess.getPageAccess().getResultPageParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleResultPage_in_rulePage369);
                    this_ResultPage_2=ruleResultPage();

                    state._fsp--;

                     
                            current = this_ResultPage_2; 
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
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleQuestion"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:208:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:209:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:210:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_entryRuleQuestion404);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestion414); 

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
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:217:1: ruleQuestion returns [EObject current=null] : (this_FreetextQuestion_0= ruleFreetextQuestion | this_SingleChoiceQuestion_1= ruleSingleChoiceQuestion | this_MultiChoiceQuestion_2= ruleMultiChoiceQuestion ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        EObject this_FreetextQuestion_0 = null;

        EObject this_SingleChoiceQuestion_1 = null;

        EObject this_MultiChoiceQuestion_2 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:220:28: ( (this_FreetextQuestion_0= ruleFreetextQuestion | this_SingleChoiceQuestion_1= ruleSingleChoiceQuestion | this_MultiChoiceQuestion_2= ruleMultiChoiceQuestion ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:221:1: (this_FreetextQuestion_0= ruleFreetextQuestion | this_SingleChoiceQuestion_1= ruleSingleChoiceQuestion | this_MultiChoiceQuestion_2= ruleMultiChoiceQuestion )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:221:1: (this_FreetextQuestion_0= ruleFreetextQuestion | this_SingleChoiceQuestion_1= ruleSingleChoiceQuestion | this_MultiChoiceQuestion_2= ruleMultiChoiceQuestion )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt3=1;
                }
                break;
            case 26:
                {
                alt3=2;
                }
                break;
            case 27:
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
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:222:5: this_FreetextQuestion_0= ruleFreetextQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getFreetextQuestionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFreetextQuestion_in_ruleQuestion461);
                    this_FreetextQuestion_0=ruleFreetextQuestion();

                    state._fsp--;

                     
                            current = this_FreetextQuestion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:232:5: this_SingleChoiceQuestion_1= ruleSingleChoiceQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getSingleChoiceQuestionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSingleChoiceQuestion_in_ruleQuestion488);
                    this_SingleChoiceQuestion_1=ruleSingleChoiceQuestion();

                    state._fsp--;

                     
                            current = this_SingleChoiceQuestion_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:242:5: this_MultiChoiceQuestion_2= ruleMultiChoiceQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getMultiChoiceQuestionParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMultiChoiceQuestion_in_ruleQuestion515);
                    this_MultiChoiceQuestion_2=ruleMultiChoiceQuestion();

                    state._fsp--;

                     
                            current = this_MultiChoiceQuestion_2; 
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
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleDependency"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:258:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:259:2: (iv_ruleDependency= ruleDependency EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:260:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_entryRuleDependency550);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDependency560); 

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
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:267:1: ruleDependency returns [EObject current=null] : (this_And_0= ruleAnd | this_Or_1= ruleOr | this_AnswerRef_2= ruleAnswerRef ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        EObject this_And_0 = null;

        EObject this_Or_1 = null;

        EObject this_AnswerRef_2 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:270:28: ( (this_And_0= ruleAnd | this_Or_1= ruleOr | this_AnswerRef_2= ruleAnswerRef ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:271:1: (this_And_0= ruleAnd | this_Or_1= ruleOr | this_AnswerRef_2= ruleAnswerRef )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:271:1: (this_And_0= ruleAnd | this_Or_1= ruleOr | this_AnswerRef_2= ruleAnswerRef )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt4=1;
                }
                break;
            case 31:
                {
                alt4=2;
                }
                break;
            case 33:
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
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:272:5: this_And_0= ruleAnd
                    {
                     
                            newCompositeNode(grammarAccess.getDependencyAccess().getAndParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnd_in_ruleDependency607);
                    this_And_0=ruleAnd();

                    state._fsp--;

                     
                            current = this_And_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:282:5: this_Or_1= ruleOr
                    {
                     
                            newCompositeNode(grammarAccess.getDependencyAccess().getOrParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOr_in_ruleDependency634);
                    this_Or_1=ruleOr();

                    state._fsp--;

                     
                            current = this_Or_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:292:5: this_AnswerRef_2= ruleAnswerRef
                    {
                     
                            newCompositeNode(grammarAccess.getDependencyAccess().getAnswerRefParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnswerRef_in_ruleDependency661);
                    this_AnswerRef_2=ruleAnswerRef();

                    state._fsp--;

                     
                            current = this_AnswerRef_2; 
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
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleAnswer"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:308:1: entryRuleAnswer returns [EObject current=null] : iv_ruleAnswer= ruleAnswer EOF ;
    public final EObject entryRuleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswer = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:309:2: (iv_ruleAnswer= ruleAnswer EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:310:2: iv_ruleAnswer= ruleAnswer EOF
            {
             newCompositeNode(grammarAccess.getAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_entryRuleAnswer696);
            iv_ruleAnswer=ruleAnswer();

            state._fsp--;

             current =iv_ruleAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswer706); 

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
    // $ANTLR end "entryRuleAnswer"


    // $ANTLR start "ruleAnswer"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:317:1: ruleAnswer returns [EObject current=null] : (this_ChoiceAnswer_0= ruleChoiceAnswer | this_FreetextAnswer_1= ruleFreetextAnswer ) ;
    public final EObject ruleAnswer() throws RecognitionException {
        EObject current = null;

        EObject this_ChoiceAnswer_0 = null;

        EObject this_FreetextAnswer_1 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:320:28: ( (this_ChoiceAnswer_0= ruleChoiceAnswer | this_FreetextAnswer_1= ruleFreetextAnswer ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:321:1: (this_ChoiceAnswer_0= ruleChoiceAnswer | this_FreetextAnswer_1= ruleFreetextAnswer )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:321:1: (this_ChoiceAnswer_0= ruleChoiceAnswer | this_FreetextAnswer_1= ruleFreetextAnswer )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==34) ) {
                alt5=1;
            }
            else if ( (LA5_0==36) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:322:5: this_ChoiceAnswer_0= ruleChoiceAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getAnswerAccess().getChoiceAnswerParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleChoiceAnswer_in_ruleAnswer753);
                    this_ChoiceAnswer_0=ruleChoiceAnswer();

                    state._fsp--;

                     
                            current = this_ChoiceAnswer_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:332:5: this_FreetextAnswer_1= ruleFreetextAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getAnswerAccess().getFreetextAnswerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFreetextAnswer_in_ruleAnswer780);
                    this_FreetextAnswer_1=ruleFreetextAnswer();

                    state._fsp--;

                     
                            current = this_FreetextAnswer_1; 
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
    // $ANTLR end "ruleAnswer"


    // $ANTLR start "entryRuleEString"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:348:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:349:2: (iv_ruleEString= ruleEString EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:350:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString816);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString827); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:357:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:360:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:361:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:361:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:361:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString867); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:369:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString893); 

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


    // $ANTLR start "entryRuleQuestionPage"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:384:1: entryRuleQuestionPage returns [EObject current=null] : iv_ruleQuestionPage= ruleQuestionPage EOF ;
    public final EObject entryRuleQuestionPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionPage = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:385:2: (iv_ruleQuestionPage= ruleQuestionPage EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:386:2: iv_ruleQuestionPage= ruleQuestionPage EOF
            {
             newCompositeNode(grammarAccess.getQuestionPageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestionPage_in_entryRuleQuestionPage938);
            iv_ruleQuestionPage=ruleQuestionPage();

            state._fsp--;

             current =iv_ruleQuestionPage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestionPage948); 

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
    // $ANTLR end "entryRuleQuestionPage"


    // $ANTLR start "ruleQuestionPage"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:393:1: ruleQuestionPage returns [EObject current=null] : (otherlv_0= 'add question page' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= 'questions:' ( (lv_questions_6_0= ruleQuestion ) ) ( (lv_questions_7_0= ruleQuestion ) )* otherlv_8= 'end page' ) ;
    public final EObject ruleQuestionPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_title_2_0 = null;

        AntlrDatatypeRuleToken lv_text_4_0 = null;

        EObject lv_questions_6_0 = null;

        EObject lv_questions_7_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:396:28: ( (otherlv_0= 'add question page' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= 'questions:' ( (lv_questions_6_0= ruleQuestion ) ) ( (lv_questions_7_0= ruleQuestion ) )* otherlv_8= 'end page' ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:397:1: (otherlv_0= 'add question page' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= 'questions:' ( (lv_questions_6_0= ruleQuestion ) ) ( (lv_questions_7_0= ruleQuestion ) )* otherlv_8= 'end page' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:397:1: (otherlv_0= 'add question page' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= 'questions:' ( (lv_questions_6_0= ruleQuestion ) ) ( (lv_questions_7_0= ruleQuestion ) )* otherlv_8= 'end page' )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:397:3: otherlv_0= 'add question page' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= 'questions:' ( (lv_questions_6_0= ruleQuestion ) ) ( (lv_questions_7_0= ruleQuestion ) )* otherlv_8= 'end page'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleQuestionPage985); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionPageAccess().getAddQuestionPageKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleQuestionPage997); 

                	newLeafNode(otherlv_1, grammarAccess.getQuestionPageAccess().getTitleKeyword_1());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:405:1: ( (lv_title_2_0= ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:406:1: (lv_title_2_0= ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:406:1: (lv_title_2_0= ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:407:3: lv_title_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getQuestionPageAccess().getTitleEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQuestionPage1018);
            lv_title_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuestionPageRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:423:2: (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:423:4: otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleQuestionPage1031); 

                        	newLeafNode(otherlv_3, grammarAccess.getQuestionPageAccess().getTextKeyword_3_0());
                        
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:427:1: ( (lv_text_4_0= ruleEString ) )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:428:1: (lv_text_4_0= ruleEString )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:428:1: (lv_text_4_0= ruleEString )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:429:3: lv_text_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getQuestionPageAccess().getTextEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQuestionPage1052);
                    lv_text_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getQuestionPageRule());
                    	        }
                           		set(
                           			current, 
                           			"text",
                            		lv_text_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleQuestionPage1066); 

                	newLeafNode(otherlv_5, grammarAccess.getQuestionPageAccess().getQuestionsKeyword_4());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:449:1: ( (lv_questions_6_0= ruleQuestion ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:450:1: (lv_questions_6_0= ruleQuestion )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:450:1: (lv_questions_6_0= ruleQuestion )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:451:3: lv_questions_6_0= ruleQuestion
            {
             
            	        newCompositeNode(grammarAccess.getQuestionPageAccess().getQuestionsQuestionParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleQuestionPage1087);
            lv_questions_6_0=ruleQuestion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuestionPageRule());
            	        }
                   		add(
                   			current, 
                   			"questions",
                    		lv_questions_6_0, 
                    		"Question");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:467:2: ( (lv_questions_7_0= ruleQuestion ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21||(LA8_0>=26 && LA8_0<=27)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:468:1: (lv_questions_7_0= ruleQuestion )
            	    {
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:468:1: (lv_questions_7_0= ruleQuestion )
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:469:3: lv_questions_7_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionPageAccess().getQuestionsQuestionParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleQuestionPage1108);
            	    lv_questions_7_0=ruleQuestion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionPageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"questions",
            	            		lv_questions_7_0, 
            	            		"Question");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleQuestionPage1121); 

                	newLeafNode(otherlv_8, grammarAccess.getQuestionPageAccess().getEndPageKeyword_7());
                

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
    // $ANTLR end "ruleQuestionPage"


    // $ANTLR start "entryRuleDescriptionPage"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:497:1: entryRuleDescriptionPage returns [EObject current=null] : iv_ruleDescriptionPage= ruleDescriptionPage EOF ;
    public final EObject entryRuleDescriptionPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescriptionPage = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:498:2: (iv_ruleDescriptionPage= ruleDescriptionPage EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:499:2: iv_ruleDescriptionPage= ruleDescriptionPage EOF
            {
             newCompositeNode(grammarAccess.getDescriptionPageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDescriptionPage_in_entryRuleDescriptionPage1157);
            iv_ruleDescriptionPage=ruleDescriptionPage();

            state._fsp--;

             current =iv_ruleDescriptionPage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDescriptionPage1167); 

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
    // $ANTLR end "entryRuleDescriptionPage"


    // $ANTLR start "ruleDescriptionPage"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:506:1: ruleDescriptionPage returns [EObject current=null] : (otherlv_0= 'add description page' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= 'end page' ) ;
    public final EObject ruleDescriptionPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_title_2_0 = null;

        AntlrDatatypeRuleToken lv_text_4_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:509:28: ( (otherlv_0= 'add description page' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= 'end page' ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:510:1: (otherlv_0= 'add description page' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= 'end page' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:510:1: (otherlv_0= 'add description page' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= 'end page' )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:510:3: otherlv_0= 'add description page' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= 'end page'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleDescriptionPage1204); 

                	newLeafNode(otherlv_0, grammarAccess.getDescriptionPageAccess().getAddDescriptionPageKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDescriptionPage1216); 

                	newLeafNode(otherlv_1, grammarAccess.getDescriptionPageAccess().getTitleKeyword_1());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:518:1: ( (lv_title_2_0= ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:519:1: (lv_title_2_0= ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:519:1: (lv_title_2_0= ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:520:3: lv_title_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDescriptionPageAccess().getTitleEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDescriptionPage1237);
            lv_title_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDescriptionPageRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:536:2: (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:536:4: otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDescriptionPage1250); 

                        	newLeafNode(otherlv_3, grammarAccess.getDescriptionPageAccess().getTextKeyword_3_0());
                        
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:540:1: ( (lv_text_4_0= ruleEString ) )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:541:1: (lv_text_4_0= ruleEString )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:541:1: (lv_text_4_0= ruleEString )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:542:3: lv_text_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getDescriptionPageAccess().getTextEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDescriptionPage1271);
                    lv_text_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDescriptionPageRule());
                    	        }
                           		set(
                           			current, 
                           			"text",
                            		lv_text_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDescriptionPage1285); 

                	newLeafNode(otherlv_5, grammarAccess.getDescriptionPageAccess().getEndPageKeyword_4());
                

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
    // $ANTLR end "ruleDescriptionPage"


    // $ANTLR start "entryRuleResultPage"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:570:1: entryRuleResultPage returns [EObject current=null] : iv_ruleResultPage= ruleResultPage EOF ;
    public final EObject entryRuleResultPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultPage = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:571:2: (iv_ruleResultPage= ruleResultPage EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:572:2: iv_ruleResultPage= ruleResultPage EOF
            {
             newCompositeNode(grammarAccess.getResultPageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleResultPage_in_entryRuleResultPage1321);
            iv_ruleResultPage=ruleResultPage();

            state._fsp--;

             current =iv_ruleResultPage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleResultPage1331); 

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
    // $ANTLR end "entryRuleResultPage"


    // $ANTLR start "ruleResultPage"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:579:1: ruleResultPage returns [EObject current=null] : (otherlv_0= 'add result page' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= 'end page' ) ;
    public final EObject ruleResultPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_title_2_0 = null;

        AntlrDatatypeRuleToken lv_text_4_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:582:28: ( (otherlv_0= 'add result page' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= 'end page' ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:583:1: (otherlv_0= 'add result page' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= 'end page' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:583:1: (otherlv_0= 'add result page' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= 'end page' )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:583:3: otherlv_0= 'add result page' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= 'end page'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleResultPage1368); 

                	newLeafNode(otherlv_0, grammarAccess.getResultPageAccess().getAddResultPageKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleResultPage1380); 

                	newLeafNode(otherlv_1, grammarAccess.getResultPageAccess().getTitleKeyword_1());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:591:1: ( (lv_title_2_0= ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:592:1: (lv_title_2_0= ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:592:1: (lv_title_2_0= ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:593:3: lv_title_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getResultPageAccess().getTitleEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleResultPage1401);
            lv_title_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getResultPageRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:609:2: (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:609:4: otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleResultPage1414); 

                        	newLeafNode(otherlv_3, grammarAccess.getResultPageAccess().getTextKeyword_3_0());
                        
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:613:1: ( (lv_text_4_0= ruleEString ) )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:614:1: (lv_text_4_0= ruleEString )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:614:1: (lv_text_4_0= ruleEString )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:615:3: lv_text_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getResultPageAccess().getTextEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleResultPage1435);
                    lv_text_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getResultPageRule());
                    	        }
                           		set(
                           			current, 
                           			"text",
                            		lv_text_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleResultPage1449); 

                	newLeafNode(otherlv_5, grammarAccess.getResultPageAccess().getEndPageKeyword_4());
                

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
    // $ANTLR end "ruleResultPage"


    // $ANTLR start "entryRuleFreetextQuestion"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:645:1: entryRuleFreetextQuestion returns [EObject current=null] : iv_ruleFreetextQuestion= ruleFreetextQuestion EOF ;
    public final EObject entryRuleFreetextQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFreetextQuestion = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:646:2: (iv_ruleFreetextQuestion= ruleFreetextQuestion EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:647:2: iv_ruleFreetextQuestion= ruleFreetextQuestion EOF
            {
             newCompositeNode(grammarAccess.getFreetextQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFreetextQuestion_in_entryRuleFreetextQuestion1487);
            iv_ruleFreetextQuestion=ruleFreetextQuestion();

            state._fsp--;

             current =iv_ruleFreetextQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFreetextQuestion1497); 

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
    // $ANTLR end "entryRuleFreetextQuestion"


    // $ANTLR start "ruleFreetextQuestion"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:654:1: ruleFreetextQuestion returns [EObject current=null] : (otherlv_0= 'add free text question' ( (lv_optional_1_0= 'optional' ) )? otherlv_2= 'text:' ( (lv_text_3_0= ruleEString ) ) (otherlv_4= 'requires:' ( (lv_requires_5_0= ruleDependency ) ) )? otherlv_6= 'answers:' ( (lv_answers_7_0= ruleFreetextAnswer ) ) otherlv_8= 'end question' ) ;
    public final EObject ruleFreetextQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_optional_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_text_3_0 = null;

        EObject lv_requires_5_0 = null;

        EObject lv_answers_7_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:657:28: ( (otherlv_0= 'add free text question' ( (lv_optional_1_0= 'optional' ) )? otherlv_2= 'text:' ( (lv_text_3_0= ruleEString ) ) (otherlv_4= 'requires:' ( (lv_requires_5_0= ruleDependency ) ) )? otherlv_6= 'answers:' ( (lv_answers_7_0= ruleFreetextAnswer ) ) otherlv_8= 'end question' ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:658:1: (otherlv_0= 'add free text question' ( (lv_optional_1_0= 'optional' ) )? otherlv_2= 'text:' ( (lv_text_3_0= ruleEString ) ) (otherlv_4= 'requires:' ( (lv_requires_5_0= ruleDependency ) ) )? otherlv_6= 'answers:' ( (lv_answers_7_0= ruleFreetextAnswer ) ) otherlv_8= 'end question' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:658:1: (otherlv_0= 'add free text question' ( (lv_optional_1_0= 'optional' ) )? otherlv_2= 'text:' ( (lv_text_3_0= ruleEString ) ) (otherlv_4= 'requires:' ( (lv_requires_5_0= ruleDependency ) ) )? otherlv_6= 'answers:' ( (lv_answers_7_0= ruleFreetextAnswer ) ) otherlv_8= 'end question' )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:658:3: otherlv_0= 'add free text question' ( (lv_optional_1_0= 'optional' ) )? otherlv_2= 'text:' ( (lv_text_3_0= ruleEString ) ) (otherlv_4= 'requires:' ( (lv_requires_5_0= ruleDependency ) ) )? otherlv_6= 'answers:' ( (lv_answers_7_0= ruleFreetextAnswer ) ) otherlv_8= 'end question'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleFreetextQuestion1534); 

                	newLeafNode(otherlv_0, grammarAccess.getFreetextQuestionAccess().getAddFreeTextQuestionKeyword_0());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:662:1: ( (lv_optional_1_0= 'optional' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:663:1: (lv_optional_1_0= 'optional' )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:663:1: (lv_optional_1_0= 'optional' )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:664:3: lv_optional_1_0= 'optional'
                    {
                    lv_optional_1_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleFreetextQuestion1552); 

                            newLeafNode(lv_optional_1_0, grammarAccess.getFreetextQuestionAccess().getOptionalOptionalKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFreetextQuestionRule());
                    	        }
                           		setWithLastConsumed(current, "optional", true, "optional");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFreetextQuestion1578); 

                	newLeafNode(otherlv_2, grammarAccess.getFreetextQuestionAccess().getTextKeyword_2());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:681:1: ( (lv_text_3_0= ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:682:1: (lv_text_3_0= ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:682:1: (lv_text_3_0= ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:683:3: lv_text_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFreetextQuestionAccess().getTextEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFreetextQuestion1599);
            lv_text_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFreetextQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"text",
                    		lv_text_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:699:2: (otherlv_4= 'requires:' ( (lv_requires_5_0= ruleDependency ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:699:4: otherlv_4= 'requires:' ( (lv_requires_5_0= ruleDependency ) )
                    {
                    otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleFreetextQuestion1612); 

                        	newLeafNode(otherlv_4, grammarAccess.getFreetextQuestionAccess().getRequiresKeyword_4_0());
                        
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:703:1: ( (lv_requires_5_0= ruleDependency ) )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:704:1: (lv_requires_5_0= ruleDependency )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:704:1: (lv_requires_5_0= ruleDependency )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:705:3: lv_requires_5_0= ruleDependency
                    {
                     
                    	        newCompositeNode(grammarAccess.getFreetextQuestionAccess().getRequiresDependencyParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDependency_in_ruleFreetextQuestion1633);
                    lv_requires_5_0=ruleDependency();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFreetextQuestionRule());
                    	        }
                           		set(
                           			current, 
                           			"requires",
                            		lv_requires_5_0, 
                            		"Dependency");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleFreetextQuestion1647); 

                	newLeafNode(otherlv_6, grammarAccess.getFreetextQuestionAccess().getAnswersKeyword_5());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:725:1: ( (lv_answers_7_0= ruleFreetextAnswer ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:726:1: (lv_answers_7_0= ruleFreetextAnswer )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:726:1: (lv_answers_7_0= ruleFreetextAnswer )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:727:3: lv_answers_7_0= ruleFreetextAnswer
            {
             
            	        newCompositeNode(grammarAccess.getFreetextQuestionAccess().getAnswersFreetextAnswerParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFreetextAnswer_in_ruleFreetextQuestion1668);
            lv_answers_7_0=ruleFreetextAnswer();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFreetextQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"answers",
                    		lv_answers_7_0, 
                    		"FreetextAnswer");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleFreetextQuestion1680); 

                	newLeafNode(otherlv_8, grammarAccess.getFreetextQuestionAccess().getEndQuestionKeyword_7());
                

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
    // $ANTLR end "ruleFreetextQuestion"


    // $ANTLR start "entryRuleSingleChoiceQuestion"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:755:1: entryRuleSingleChoiceQuestion returns [EObject current=null] : iv_ruleSingleChoiceQuestion= ruleSingleChoiceQuestion EOF ;
    public final EObject entryRuleSingleChoiceQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleChoiceQuestion = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:756:2: (iv_ruleSingleChoiceQuestion= ruleSingleChoiceQuestion EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:757:2: iv_ruleSingleChoiceQuestion= ruleSingleChoiceQuestion EOF
            {
             newCompositeNode(grammarAccess.getSingleChoiceQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleChoiceQuestion_in_entryRuleSingleChoiceQuestion1716);
            iv_ruleSingleChoiceQuestion=ruleSingleChoiceQuestion();

            state._fsp--;

             current =iv_ruleSingleChoiceQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleChoiceQuestion1726); 

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
    // $ANTLR end "entryRuleSingleChoiceQuestion"


    // $ANTLR start "ruleSingleChoiceQuestion"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:764:1: ruleSingleChoiceQuestion returns [EObject current=null] : (otherlv_0= 'add single choice question' ( (lv_optional_1_0= 'optional' ) )? otherlv_2= 'text:' ( (lv_text_3_0= ruleEString ) ) (otherlv_4= 'requires:' ( (lv_requires_5_0= ruleDependency ) ) )? otherlv_6= 'answers:' ( (lv_answers_7_0= ruleAnswer ) ) ( (lv_answers_8_0= ruleAnswer ) )* otherlv_9= 'end question' ) ;
    public final EObject ruleSingleChoiceQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_optional_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_text_3_0 = null;

        EObject lv_requires_5_0 = null;

        EObject lv_answers_7_0 = null;

        EObject lv_answers_8_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:767:28: ( (otherlv_0= 'add single choice question' ( (lv_optional_1_0= 'optional' ) )? otherlv_2= 'text:' ( (lv_text_3_0= ruleEString ) ) (otherlv_4= 'requires:' ( (lv_requires_5_0= ruleDependency ) ) )? otherlv_6= 'answers:' ( (lv_answers_7_0= ruleAnswer ) ) ( (lv_answers_8_0= ruleAnswer ) )* otherlv_9= 'end question' ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:768:1: (otherlv_0= 'add single choice question' ( (lv_optional_1_0= 'optional' ) )? otherlv_2= 'text:' ( (lv_text_3_0= ruleEString ) ) (otherlv_4= 'requires:' ( (lv_requires_5_0= ruleDependency ) ) )? otherlv_6= 'answers:' ( (lv_answers_7_0= ruleAnswer ) ) ( (lv_answers_8_0= ruleAnswer ) )* otherlv_9= 'end question' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:768:1: (otherlv_0= 'add single choice question' ( (lv_optional_1_0= 'optional' ) )? otherlv_2= 'text:' ( (lv_text_3_0= ruleEString ) ) (otherlv_4= 'requires:' ( (lv_requires_5_0= ruleDependency ) ) )? otherlv_6= 'answers:' ( (lv_answers_7_0= ruleAnswer ) ) ( (lv_answers_8_0= ruleAnswer ) )* otherlv_9= 'end question' )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:768:3: otherlv_0= 'add single choice question' ( (lv_optional_1_0= 'optional' ) )? otherlv_2= 'text:' ( (lv_text_3_0= ruleEString ) ) (otherlv_4= 'requires:' ( (lv_requires_5_0= ruleDependency ) ) )? otherlv_6= 'answers:' ( (lv_answers_7_0= ruleAnswer ) ) ( (lv_answers_8_0= ruleAnswer ) )* otherlv_9= 'end question'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleSingleChoiceQuestion1763); 

                	newLeafNode(otherlv_0, grammarAccess.getSingleChoiceQuestionAccess().getAddSingleChoiceQuestionKeyword_0());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:772:1: ( (lv_optional_1_0= 'optional' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:773:1: (lv_optional_1_0= 'optional' )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:773:1: (lv_optional_1_0= 'optional' )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:774:3: lv_optional_1_0= 'optional'
                    {
                    lv_optional_1_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSingleChoiceQuestion1781); 

                            newLeafNode(lv_optional_1_0, grammarAccess.getSingleChoiceQuestionAccess().getOptionalOptionalKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSingleChoiceQuestionRule());
                    	        }
                           		setWithLastConsumed(current, "optional", true, "optional");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSingleChoiceQuestion1807); 

                	newLeafNode(otherlv_2, grammarAccess.getSingleChoiceQuestionAccess().getTextKeyword_2());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:791:1: ( (lv_text_3_0= ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:792:1: (lv_text_3_0= ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:792:1: (lv_text_3_0= ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:793:3: lv_text_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSingleChoiceQuestionAccess().getTextEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingleChoiceQuestion1828);
            lv_text_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSingleChoiceQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"text",
                    		lv_text_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:809:2: (otherlv_4= 'requires:' ( (lv_requires_5_0= ruleDependency ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:809:4: otherlv_4= 'requires:' ( (lv_requires_5_0= ruleDependency ) )
                    {
                    otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSingleChoiceQuestion1841); 

                        	newLeafNode(otherlv_4, grammarAccess.getSingleChoiceQuestionAccess().getRequiresKeyword_4_0());
                        
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:813:1: ( (lv_requires_5_0= ruleDependency ) )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:814:1: (lv_requires_5_0= ruleDependency )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:814:1: (lv_requires_5_0= ruleDependency )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:815:3: lv_requires_5_0= ruleDependency
                    {
                     
                    	        newCompositeNode(grammarAccess.getSingleChoiceQuestionAccess().getRequiresDependencyParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDependency_in_ruleSingleChoiceQuestion1862);
                    lv_requires_5_0=ruleDependency();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSingleChoiceQuestionRule());
                    	        }
                           		set(
                           			current, 
                           			"requires",
                            		lv_requires_5_0, 
                            		"Dependency");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSingleChoiceQuestion1876); 

                	newLeafNode(otherlv_6, grammarAccess.getSingleChoiceQuestionAccess().getAnswersKeyword_5());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:835:1: ( (lv_answers_7_0= ruleAnswer ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:836:1: (lv_answers_7_0= ruleAnswer )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:836:1: (lv_answers_7_0= ruleAnswer )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:837:3: lv_answers_7_0= ruleAnswer
            {
             
            	        newCompositeNode(grammarAccess.getSingleChoiceQuestionAccess().getAnswersAnswerParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleSingleChoiceQuestion1897);
            lv_answers_7_0=ruleAnswer();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSingleChoiceQuestionRule());
            	        }
                   		add(
                   			current, 
                   			"answers",
                    		lv_answers_7_0, 
                    		"Answer");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:853:2: ( (lv_answers_8_0= ruleAnswer ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==34||LA15_0==36) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:854:1: (lv_answers_8_0= ruleAnswer )
            	    {
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:854:1: (lv_answers_8_0= ruleAnswer )
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:855:3: lv_answers_8_0= ruleAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleChoiceQuestionAccess().getAnswersAnswerParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleSingleChoiceQuestion1918);
            	    lv_answers_8_0=ruleAnswer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSingleChoiceQuestionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"answers",
            	            		lv_answers_8_0, 
            	            		"Answer");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_9=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleSingleChoiceQuestion1931); 

                	newLeafNode(otherlv_9, grammarAccess.getSingleChoiceQuestionAccess().getEndQuestionKeyword_8());
                

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
    // $ANTLR end "ruleSingleChoiceQuestion"


    // $ANTLR start "entryRuleMultiChoiceQuestion"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:883:1: entryRuleMultiChoiceQuestion returns [EObject current=null] : iv_ruleMultiChoiceQuestion= ruleMultiChoiceQuestion EOF ;
    public final EObject entryRuleMultiChoiceQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiChoiceQuestion = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:884:2: (iv_ruleMultiChoiceQuestion= ruleMultiChoiceQuestion EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:885:2: iv_ruleMultiChoiceQuestion= ruleMultiChoiceQuestion EOF
            {
             newCompositeNode(grammarAccess.getMultiChoiceQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiChoiceQuestion_in_entryRuleMultiChoiceQuestion1967);
            iv_ruleMultiChoiceQuestion=ruleMultiChoiceQuestion();

            state._fsp--;

             current =iv_ruleMultiChoiceQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiChoiceQuestion1977); 

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
    // $ANTLR end "entryRuleMultiChoiceQuestion"


    // $ANTLR start "ruleMultiChoiceQuestion"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:892:1: ruleMultiChoiceQuestion returns [EObject current=null] : (otherlv_0= 'add multi choice question' ( (lv_optional_1_0= 'optional' ) )? otherlv_2= 'text:' ( (lv_text_3_0= ruleEString ) ) (otherlv_4= 'requires:' ( (lv_requires_5_0= ruleDependency ) ) )? otherlv_6= 'answers:' ( (lv_answers_7_0= ruleAnswer ) ) ( (lv_answers_8_0= ruleAnswer ) )* otherlv_9= 'end question' ) ;
    public final EObject ruleMultiChoiceQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_optional_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_text_3_0 = null;

        EObject lv_requires_5_0 = null;

        EObject lv_answers_7_0 = null;

        EObject lv_answers_8_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:895:28: ( (otherlv_0= 'add multi choice question' ( (lv_optional_1_0= 'optional' ) )? otherlv_2= 'text:' ( (lv_text_3_0= ruleEString ) ) (otherlv_4= 'requires:' ( (lv_requires_5_0= ruleDependency ) ) )? otherlv_6= 'answers:' ( (lv_answers_7_0= ruleAnswer ) ) ( (lv_answers_8_0= ruleAnswer ) )* otherlv_9= 'end question' ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:896:1: (otherlv_0= 'add multi choice question' ( (lv_optional_1_0= 'optional' ) )? otherlv_2= 'text:' ( (lv_text_3_0= ruleEString ) ) (otherlv_4= 'requires:' ( (lv_requires_5_0= ruleDependency ) ) )? otherlv_6= 'answers:' ( (lv_answers_7_0= ruleAnswer ) ) ( (lv_answers_8_0= ruleAnswer ) )* otherlv_9= 'end question' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:896:1: (otherlv_0= 'add multi choice question' ( (lv_optional_1_0= 'optional' ) )? otherlv_2= 'text:' ( (lv_text_3_0= ruleEString ) ) (otherlv_4= 'requires:' ( (lv_requires_5_0= ruleDependency ) ) )? otherlv_6= 'answers:' ( (lv_answers_7_0= ruleAnswer ) ) ( (lv_answers_8_0= ruleAnswer ) )* otherlv_9= 'end question' )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:896:3: otherlv_0= 'add multi choice question' ( (lv_optional_1_0= 'optional' ) )? otherlv_2= 'text:' ( (lv_text_3_0= ruleEString ) ) (otherlv_4= 'requires:' ( (lv_requires_5_0= ruleDependency ) ) )? otherlv_6= 'answers:' ( (lv_answers_7_0= ruleAnswer ) ) ( (lv_answers_8_0= ruleAnswer ) )* otherlv_9= 'end question'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleMultiChoiceQuestion2014); 

                	newLeafNode(otherlv_0, grammarAccess.getMultiChoiceQuestionAccess().getAddMultiChoiceQuestionKeyword_0());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:900:1: ( (lv_optional_1_0= 'optional' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:901:1: (lv_optional_1_0= 'optional' )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:901:1: (lv_optional_1_0= 'optional' )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:902:3: lv_optional_1_0= 'optional'
                    {
                    lv_optional_1_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMultiChoiceQuestion2032); 

                            newLeafNode(lv_optional_1_0, grammarAccess.getMultiChoiceQuestionAccess().getOptionalOptionalKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiChoiceQuestionRule());
                    	        }
                           		setWithLastConsumed(current, "optional", true, "optional");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMultiChoiceQuestion2058); 

                	newLeafNode(otherlv_2, grammarAccess.getMultiChoiceQuestionAccess().getTextKeyword_2());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:919:1: ( (lv_text_3_0= ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:920:1: (lv_text_3_0= ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:920:1: (lv_text_3_0= ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:921:3: lv_text_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMultiChoiceQuestionAccess().getTextEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiChoiceQuestion2079);
            lv_text_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultiChoiceQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"text",
                    		lv_text_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:937:2: (otherlv_4= 'requires:' ( (lv_requires_5_0= ruleDependency ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:937:4: otherlv_4= 'requires:' ( (lv_requires_5_0= ruleDependency ) )
                    {
                    otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMultiChoiceQuestion2092); 

                        	newLeafNode(otherlv_4, grammarAccess.getMultiChoiceQuestionAccess().getRequiresKeyword_4_0());
                        
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:941:1: ( (lv_requires_5_0= ruleDependency ) )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:942:1: (lv_requires_5_0= ruleDependency )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:942:1: (lv_requires_5_0= ruleDependency )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:943:3: lv_requires_5_0= ruleDependency
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultiChoiceQuestionAccess().getRequiresDependencyParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDependency_in_ruleMultiChoiceQuestion2113);
                    lv_requires_5_0=ruleDependency();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultiChoiceQuestionRule());
                    	        }
                           		set(
                           			current, 
                           			"requires",
                            		lv_requires_5_0, 
                            		"Dependency");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMultiChoiceQuestion2127); 

                	newLeafNode(otherlv_6, grammarAccess.getMultiChoiceQuestionAccess().getAnswersKeyword_5());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:963:1: ( (lv_answers_7_0= ruleAnswer ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:964:1: (lv_answers_7_0= ruleAnswer )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:964:1: (lv_answers_7_0= ruleAnswer )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:965:3: lv_answers_7_0= ruleAnswer
            {
             
            	        newCompositeNode(grammarAccess.getMultiChoiceQuestionAccess().getAnswersAnswerParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleMultiChoiceQuestion2148);
            lv_answers_7_0=ruleAnswer();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultiChoiceQuestionRule());
            	        }
                   		add(
                   			current, 
                   			"answers",
                    		lv_answers_7_0, 
                    		"Answer");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:981:2: ( (lv_answers_8_0= ruleAnswer ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==34||LA18_0==36) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:982:1: (lv_answers_8_0= ruleAnswer )
            	    {
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:982:1: (lv_answers_8_0= ruleAnswer )
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:983:3: lv_answers_8_0= ruleAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiChoiceQuestionAccess().getAnswersAnswerParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleMultiChoiceQuestion2169);
            	    lv_answers_8_0=ruleAnswer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiChoiceQuestionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"answers",
            	            		lv_answers_8_0, 
            	            		"Answer");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_9=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMultiChoiceQuestion2182); 

                	newLeafNode(otherlv_9, grammarAccess.getMultiChoiceQuestionAccess().getEndQuestionKeyword_8());
                

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
    // $ANTLR end "ruleMultiChoiceQuestion"


    // $ANTLR start "entryRuleAnd"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1011:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1012:2: (iv_ruleAnd= ruleAnd EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1013:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnd_in_entryRuleAnd2218);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnd2228); 

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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1020:1: ruleAnd returns [EObject current=null] : (otherlv_0= 'and(' ( (lv_lhs_1_0= ruleDependency ) ) otherlv_2= 'and' ( (lv_rhs_3_0= ruleDependency ) ) otherlv_4= ')' ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_lhs_1_0 = null;

        EObject lv_rhs_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1023:28: ( (otherlv_0= 'and(' ( (lv_lhs_1_0= ruleDependency ) ) otherlv_2= 'and' ( (lv_rhs_3_0= ruleDependency ) ) otherlv_4= ')' ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1024:1: (otherlv_0= 'and(' ( (lv_lhs_1_0= ruleDependency ) ) otherlv_2= 'and' ( (lv_rhs_3_0= ruleDependency ) ) otherlv_4= ')' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1024:1: (otherlv_0= 'and(' ( (lv_lhs_1_0= ruleDependency ) ) otherlv_2= 'and' ( (lv_rhs_3_0= ruleDependency ) ) otherlv_4= ')' )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1024:3: otherlv_0= 'and(' ( (lv_lhs_1_0= ruleDependency ) ) otherlv_2= 'and' ( (lv_rhs_3_0= ruleDependency ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAnd2265); 

                	newLeafNode(otherlv_0, grammarAccess.getAndAccess().getAndKeyword_0());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1028:1: ( (lv_lhs_1_0= ruleDependency ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1029:1: (lv_lhs_1_0= ruleDependency )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1029:1: (lv_lhs_1_0= ruleDependency )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1030:3: lv_lhs_1_0= ruleDependency
            {
             
            	        newCompositeNode(grammarAccess.getAndAccess().getLhsDependencyParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_ruleAnd2286);
            lv_lhs_1_0=ruleDependency();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAndRule());
            	        }
                   		set(
                   			current, 
                   			"lhs",
                    		lv_lhs_1_0, 
                    		"Dependency");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAnd2298); 

                	newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAndKeyword_2());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1050:1: ( (lv_rhs_3_0= ruleDependency ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1051:1: (lv_rhs_3_0= ruleDependency )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1051:1: (lv_rhs_3_0= ruleDependency )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1052:3: lv_rhs_3_0= ruleDependency
            {
             
            	        newCompositeNode(grammarAccess.getAndAccess().getRhsDependencyParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_ruleAnd2319);
            lv_rhs_3_0=ruleDependency();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAndRule());
            	        }
                   		set(
                   			current, 
                   			"rhs",
                    		lv_rhs_3_0, 
                    		"Dependency");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleAnd2331); 

                	newLeafNode(otherlv_4, grammarAccess.getAndAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleOr"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1080:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1081:2: (iv_ruleOr= ruleOr EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1082:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOr_in_entryRuleOr2367);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOr2377); 

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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1089:1: ruleOr returns [EObject current=null] : (otherlv_0= 'or(' ( (lv_lhs_1_0= ruleDependency ) ) otherlv_2= 'or' ( (lv_rhs_3_0= ruleDependency ) ) otherlv_4= ')' ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_lhs_1_0 = null;

        EObject lv_rhs_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1092:28: ( (otherlv_0= 'or(' ( (lv_lhs_1_0= ruleDependency ) ) otherlv_2= 'or' ( (lv_rhs_3_0= ruleDependency ) ) otherlv_4= ')' ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1093:1: (otherlv_0= 'or(' ( (lv_lhs_1_0= ruleDependency ) ) otherlv_2= 'or' ( (lv_rhs_3_0= ruleDependency ) ) otherlv_4= ')' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1093:1: (otherlv_0= 'or(' ( (lv_lhs_1_0= ruleDependency ) ) otherlv_2= 'or' ( (lv_rhs_3_0= ruleDependency ) ) otherlv_4= ')' )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1093:3: otherlv_0= 'or(' ( (lv_lhs_1_0= ruleDependency ) ) otherlv_2= 'or' ( (lv_rhs_3_0= ruleDependency ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleOr2414); 

                	newLeafNode(otherlv_0, grammarAccess.getOrAccess().getOrKeyword_0());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1097:1: ( (lv_lhs_1_0= ruleDependency ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1098:1: (lv_lhs_1_0= ruleDependency )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1098:1: (lv_lhs_1_0= ruleDependency )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1099:3: lv_lhs_1_0= ruleDependency
            {
             
            	        newCompositeNode(grammarAccess.getOrAccess().getLhsDependencyParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_ruleOr2435);
            lv_lhs_1_0=ruleDependency();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOrRule());
            	        }
                   		set(
                   			current, 
                   			"lhs",
                    		lv_lhs_1_0, 
                    		"Dependency");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleOr2447); 

                	newLeafNode(otherlv_2, grammarAccess.getOrAccess().getOrKeyword_2());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1119:1: ( (lv_rhs_3_0= ruleDependency ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1120:1: (lv_rhs_3_0= ruleDependency )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1120:1: (lv_rhs_3_0= ruleDependency )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1121:3: lv_rhs_3_0= ruleDependency
            {
             
            	        newCompositeNode(grammarAccess.getOrAccess().getRhsDependencyParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_ruleOr2468);
            lv_rhs_3_0=ruleDependency();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOrRule());
            	        }
                   		set(
                   			current, 
                   			"rhs",
                    		lv_rhs_3_0, 
                    		"Dependency");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleOr2480); 

                	newLeafNode(otherlv_4, grammarAccess.getOrAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnswerRef"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1149:1: entryRuleAnswerRef returns [EObject current=null] : iv_ruleAnswerRef= ruleAnswerRef EOF ;
    public final EObject entryRuleAnswerRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswerRef = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1150:2: (iv_ruleAnswerRef= ruleAnswerRef EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1151:2: iv_ruleAnswerRef= ruleAnswerRef EOF
            {
             newCompositeNode(grammarAccess.getAnswerRefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswerRef_in_entryRuleAnswerRef2516);
            iv_ruleAnswerRef=ruleAnswerRef();

            state._fsp--;

             current =iv_ruleAnswerRef; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswerRef2526); 

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
    // $ANTLR end "entryRuleAnswerRef"


    // $ANTLR start "ruleAnswerRef"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1158:1: ruleAnswerRef returns [EObject current=null] : (otherlv_0= 'answer reference:' ( ( ruleEString ) ) ) ;
    public final EObject ruleAnswerRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1161:28: ( (otherlv_0= 'answer reference:' ( ( ruleEString ) ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1162:1: (otherlv_0= 'answer reference:' ( ( ruleEString ) ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1162:1: (otherlv_0= 'answer reference:' ( ( ruleEString ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1162:3: otherlv_0= 'answer reference:' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAnswerRef2563); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerRefAccess().getAnswerReferenceKeyword_0());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1166:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1167:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1167:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1168:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAnswerRefRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAnswerRefAccess().getRefersAnswerCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnswerRef2586);
            ruleEString();

            state._fsp--;

             
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
    // $ANTLR end "ruleAnswerRef"


    // $ANTLR start "entryRuleChoiceAnswer"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1189:1: entryRuleChoiceAnswer returns [EObject current=null] : iv_ruleChoiceAnswer= ruleChoiceAnswer EOF ;
    public final EObject entryRuleChoiceAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoiceAnswer = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1190:2: (iv_ruleChoiceAnswer= ruleChoiceAnswer EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1191:2: iv_ruleChoiceAnswer= ruleChoiceAnswer EOF
            {
             newCompositeNode(grammarAccess.getChoiceAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleChoiceAnswer_in_entryRuleChoiceAnswer2622);
            iv_ruleChoiceAnswer=ruleChoiceAnswer();

            state._fsp--;

             current =iv_ruleChoiceAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleChoiceAnswer2632); 

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
    // $ANTLR end "entryRuleChoiceAnswer"


    // $ANTLR start "ruleChoiceAnswer"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1198:1: ruleChoiceAnswer returns [EObject current=null] : (otherlv_0= 'add answer choice' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) ) ;
    public final EObject ruleChoiceAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_text_4_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1201:28: ( (otherlv_0= 'add answer choice' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1202:1: (otherlv_0= 'add answer choice' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1202:1: (otherlv_0= 'add answer choice' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1202:3: otherlv_0= 'add answer choice' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleChoiceAnswer2669); 

                	newLeafNode(otherlv_0, grammarAccess.getChoiceAnswerAccess().getAddAnswerChoiceKeyword_0());
                
            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleChoiceAnswer2681); 

                	newLeafNode(otherlv_1, grammarAccess.getChoiceAnswerAccess().getNameKeyword_1());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1210:1: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1211:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1211:1: (lv_name_2_0= RULE_ID )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1212:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleChoiceAnswer2698); 

            			newLeafNode(lv_name_2_0, grammarAccess.getChoiceAnswerAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChoiceAnswerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleChoiceAnswer2715); 

                	newLeafNode(otherlv_3, grammarAccess.getChoiceAnswerAccess().getTextKeyword_3());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1232:1: ( (lv_text_4_0= ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1233:1: (lv_text_4_0= ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1233:1: (lv_text_4_0= ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1234:3: lv_text_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getChoiceAnswerAccess().getTextEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoiceAnswer2736);
            lv_text_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChoiceAnswerRule());
            	        }
                   		set(
                   			current, 
                   			"text",
                    		lv_text_4_0, 
                    		"EString");
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
    // $ANTLR end "ruleChoiceAnswer"


    // $ANTLR start "entryRuleFreetextAnswer"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1258:1: entryRuleFreetextAnswer returns [EObject current=null] : iv_ruleFreetextAnswer= ruleFreetextAnswer EOF ;
    public final EObject entryRuleFreetextAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFreetextAnswer = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1259:2: (iv_ruleFreetextAnswer= ruleFreetextAnswer EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1260:2: iv_ruleFreetextAnswer= ruleFreetextAnswer EOF
            {
             newCompositeNode(grammarAccess.getFreetextAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFreetextAnswer_in_entryRuleFreetextAnswer2772);
            iv_ruleFreetextAnswer=ruleFreetextAnswer();

            state._fsp--;

             current =iv_ruleFreetextAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFreetextAnswer2782); 

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
    // $ANTLR end "entryRuleFreetextAnswer"


    // $ANTLR start "ruleFreetextAnswer"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1267:1: ruleFreetextAnswer returns [EObject current=null] : (otherlv_0= 'add answer text' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) ) ;
    public final EObject ruleFreetextAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_text_4_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1270:28: ( (otherlv_0= 'add answer text' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1271:1: (otherlv_0= 'add answer text' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1271:1: (otherlv_0= 'add answer text' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1271:3: otherlv_0= 'add answer text' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleFreetextAnswer2819); 

                	newLeafNode(otherlv_0, grammarAccess.getFreetextAnswerAccess().getAddAnswerTextKeyword_0());
                
            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleFreetextAnswer2831); 

                	newLeafNode(otherlv_1, grammarAccess.getFreetextAnswerAccess().getNameKeyword_1());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1279:1: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1280:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1280:1: (lv_name_2_0= RULE_ID )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1281:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFreetextAnswer2848); 

            			newLeafNode(lv_name_2_0, grammarAccess.getFreetextAnswerAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFreetextAnswerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFreetextAnswer2865); 

                	newLeafNode(otherlv_3, grammarAccess.getFreetextAnswerAccess().getTextKeyword_3());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1301:1: ( (lv_text_4_0= ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1302:1: (lv_text_4_0= ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1302:1: (lv_text_4_0= ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1303:3: lv_text_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFreetextAnswerAccess().getTextEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFreetextAnswer2886);
            lv_text_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFreetextAnswerRule());
            	        }
                   		set(
                   			current, 
                   			"text",
                    		lv_text_4_0, 
                    		"EString");
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
    // $ANTLR end "ruleFreetextAnswer"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSurvey_in_entryRuleSurvey75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSurvey85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleSurvey122 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSurvey134 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSurvey155 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSurvey167 = new BitSet(new long[]{0x0000000000188000L});
        public static final BitSet FOLLOW_rulePage_in_ruleSurvey188 = new BitSet(new long[]{0x000000000018C000L});
        public static final BitSet FOLLOW_rulePage_in_ruleSurvey209 = new BitSet(new long[]{0x000000000018C000L});
        public static final BitSet FOLLOW_14_in_ruleSurvey222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePage_in_entryRulePage258 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePage268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestionPage_in_rulePage315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDescriptionPage_in_rulePage342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResultPage_in_rulePage369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion404 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestion414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFreetextQuestion_in_ruleQuestion461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleChoiceQuestion_in_ruleQuestion488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiChoiceQuestion_in_ruleQuestion515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency550 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDependency560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnd_in_ruleDependency607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOr_in_ruleDependency634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerRef_in_ruleDependency661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer696 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswer706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoiceAnswer_in_ruleAnswer753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFreetextAnswer_in_ruleAnswer780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString816 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestionPage_in_entryRuleQuestionPage938 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestionPage948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleQuestionPage985 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleQuestionPage997 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQuestionPage1018 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleQuestionPage1031 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQuestionPage1052 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleQuestionPage1066 = new BitSet(new long[]{0x000000000C200000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleQuestionPage1087 = new BitSet(new long[]{0x000000000C240000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleQuestionPage1108 = new BitSet(new long[]{0x000000000C240000L});
        public static final BitSet FOLLOW_18_in_ruleQuestionPage1121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDescriptionPage_in_entryRuleDescriptionPage1157 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDescriptionPage1167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleDescriptionPage1204 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDescriptionPage1216 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDescriptionPage1237 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_16_in_ruleDescriptionPage1250 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDescriptionPage1271 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleDescriptionPage1285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResultPage_in_entryRuleResultPage1321 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleResultPage1331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleResultPage1368 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleResultPage1380 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleResultPage1401 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_16_in_ruleResultPage1414 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleResultPage1435 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleResultPage1449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFreetextQuestion_in_entryRuleFreetextQuestion1487 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFreetextQuestion1497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleFreetextQuestion1534 = new BitSet(new long[]{0x0000000000410000L});
        public static final BitSet FOLLOW_22_in_ruleFreetextQuestion1552 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleFreetextQuestion1578 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFreetextQuestion1599 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_23_in_ruleFreetextQuestion1612 = new BitSet(new long[]{0x0000000290000000L});
        public static final BitSet FOLLOW_ruleDependency_in_ruleFreetextQuestion1633 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleFreetextQuestion1647 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleFreetextAnswer_in_ruleFreetextQuestion1668 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleFreetextQuestion1680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleChoiceQuestion_in_entryRuleSingleChoiceQuestion1716 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleChoiceQuestion1726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleSingleChoiceQuestion1763 = new BitSet(new long[]{0x0000000000410000L});
        public static final BitSet FOLLOW_22_in_ruleSingleChoiceQuestion1781 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSingleChoiceQuestion1807 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingleChoiceQuestion1828 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_23_in_ruleSingleChoiceQuestion1841 = new BitSet(new long[]{0x0000000290000000L});
        public static final BitSet FOLLOW_ruleDependency_in_ruleSingleChoiceQuestion1862 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleSingleChoiceQuestion1876 = new BitSet(new long[]{0x0000001400000000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleSingleChoiceQuestion1897 = new BitSet(new long[]{0x0000001402000000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleSingleChoiceQuestion1918 = new BitSet(new long[]{0x0000001402000000L});
        public static final BitSet FOLLOW_25_in_ruleSingleChoiceQuestion1931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiChoiceQuestion_in_entryRuleMultiChoiceQuestion1967 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiChoiceQuestion1977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleMultiChoiceQuestion2014 = new BitSet(new long[]{0x0000000000410000L});
        public static final BitSet FOLLOW_22_in_ruleMultiChoiceQuestion2032 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleMultiChoiceQuestion2058 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiChoiceQuestion2079 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_23_in_ruleMultiChoiceQuestion2092 = new BitSet(new long[]{0x0000000290000000L});
        public static final BitSet FOLLOW_ruleDependency_in_ruleMultiChoiceQuestion2113 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleMultiChoiceQuestion2127 = new BitSet(new long[]{0x0000001400000000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleMultiChoiceQuestion2148 = new BitSet(new long[]{0x0000001402000000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleMultiChoiceQuestion2169 = new BitSet(new long[]{0x0000001402000000L});
        public static final BitSet FOLLOW_25_in_ruleMultiChoiceQuestion2182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd2218 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnd2228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleAnd2265 = new BitSet(new long[]{0x0000000290000000L});
        public static final BitSet FOLLOW_ruleDependency_in_ruleAnd2286 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleAnd2298 = new BitSet(new long[]{0x0000000290000000L});
        public static final BitSet FOLLOW_ruleDependency_in_ruleAnd2319 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleAnd2331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOr_in_entryRuleOr2367 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOr2377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleOr2414 = new BitSet(new long[]{0x0000000290000000L});
        public static final BitSet FOLLOW_ruleDependency_in_ruleOr2435 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleOr2447 = new BitSet(new long[]{0x0000000290000000L});
        public static final BitSet FOLLOW_ruleDependency_in_ruleOr2468 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleOr2480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerRef_in_entryRuleAnswerRef2516 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswerRef2526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleAnswerRef2563 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnswerRef2586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoiceAnswer_in_entryRuleChoiceAnswer2622 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleChoiceAnswer2632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleChoiceAnswer2669 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleChoiceAnswer2681 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleChoiceAnswer2698 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleChoiceAnswer2715 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoiceAnswer2736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFreetextAnswer_in_entryRuleFreetextAnswer2772 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFreetextAnswer2782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleFreetextAnswer2819 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleFreetextAnswer2831 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFreetextAnswer2848 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleFreetextAnswer2865 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFreetextAnswer2886 = new BitSet(new long[]{0x0000000000000002L});
    }


}