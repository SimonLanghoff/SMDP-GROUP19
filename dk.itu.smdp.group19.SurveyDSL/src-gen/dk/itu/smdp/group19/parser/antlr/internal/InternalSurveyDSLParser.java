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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'start survey'", "'pages:'", "'end survey'", "'question page'", "':'", "'questions:'", "'end page'", "'description page'", "'result page'", "'free text question'", "'optional'", "'requires:'", "'answers:'", "'end question'", "'single choice question'", "'multi choice question'", "'and('", "'and'", "')'", "'or('", "'or'", "'answer reference:'", "'answer choice'", "'answer text'"
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
    public static final int T__18=18;
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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:76:1: ruleSurvey returns [EObject current=null] : (otherlv_0= 'start survey' ( (lv_title_1_0= ruleEString ) ) otherlv_2= 'pages:' ( (lv_pages_3_0= rulePage ) ) ( (lv_pages_4_0= rulePage ) )* otherlv_5= 'end survey' ) ;
    public final EObject ruleSurvey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_title_1_0 = null;

        EObject lv_pages_3_0 = null;

        EObject lv_pages_4_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:79:28: ( (otherlv_0= 'start survey' ( (lv_title_1_0= ruleEString ) ) otherlv_2= 'pages:' ( (lv_pages_3_0= rulePage ) ) ( (lv_pages_4_0= rulePage ) )* otherlv_5= 'end survey' ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:80:1: (otherlv_0= 'start survey' ( (lv_title_1_0= ruleEString ) ) otherlv_2= 'pages:' ( (lv_pages_3_0= rulePage ) ) ( (lv_pages_4_0= rulePage ) )* otherlv_5= 'end survey' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:80:1: (otherlv_0= 'start survey' ( (lv_title_1_0= ruleEString ) ) otherlv_2= 'pages:' ( (lv_pages_3_0= rulePage ) ) ( (lv_pages_4_0= rulePage ) )* otherlv_5= 'end survey' )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:80:3: otherlv_0= 'start survey' ( (lv_title_1_0= ruleEString ) ) otherlv_2= 'pages:' ( (lv_pages_3_0= rulePage ) ) ( (lv_pages_4_0= rulePage ) )* otherlv_5= 'end survey'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleSurvey122); 

                	newLeafNode(otherlv_0, grammarAccess.getSurveyAccess().getStartSurveyKeyword_0());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:84:1: ( (lv_title_1_0= ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:85:1: (lv_title_1_0= ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:85:1: (lv_title_1_0= ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:86:3: lv_title_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSurveyAccess().getTitleEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSurvey143);
            lv_title_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSurvey155); 

                	newLeafNode(otherlv_2, grammarAccess.getSurveyAccess().getPagesKeyword_2());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:106:1: ( (lv_pages_3_0= rulePage ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:107:1: (lv_pages_3_0= rulePage )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:107:1: (lv_pages_3_0= rulePage )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:108:3: lv_pages_3_0= rulePage
            {
             
            	        newCompositeNode(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePage_in_ruleSurvey176);
            lv_pages_3_0=rulePage();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	        }
                   		add(
                   			current, 
                   			"pages",
                    		lv_pages_3_0, 
                    		"Page");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:124:2: ( (lv_pages_4_0= rulePage ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||(LA1_0>=18 && LA1_0<=19)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:125:1: (lv_pages_4_0= rulePage )
            	    {
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:125:1: (lv_pages_4_0= rulePage )
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:126:3: lv_pages_4_0= rulePage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePage_in_ruleSurvey197);
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
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSurvey210); 

                	newLeafNode(otherlv_5, grammarAccess.getSurveyAccess().getEndSurveyKeyword_5());
                

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:154:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:155:2: (iv_rulePage= rulePage EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:156:2: iv_rulePage= rulePage EOF
            {
             newCompositeNode(grammarAccess.getPageRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePage_in_entryRulePage246);
            iv_rulePage=rulePage();

            state._fsp--;

             current =iv_rulePage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePage256); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:163:1: rulePage returns [EObject current=null] : (this_QuestionPage_0= ruleQuestionPage | this_DescriptionPage_1= ruleDescriptionPage | this_ResultPage_2= ruleResultPage ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        EObject this_QuestionPage_0 = null;

        EObject this_DescriptionPage_1 = null;

        EObject this_ResultPage_2 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:166:28: ( (this_QuestionPage_0= ruleQuestionPage | this_DescriptionPage_1= ruleDescriptionPage | this_ResultPage_2= ruleResultPage ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:167:1: (this_QuestionPage_0= ruleQuestionPage | this_DescriptionPage_1= ruleDescriptionPage | this_ResultPage_2= ruleResultPage )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:167:1: (this_QuestionPage_0= ruleQuestionPage | this_DescriptionPage_1= ruleDescriptionPage | this_ResultPage_2= ruleResultPage )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 19:
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
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:168:5: this_QuestionPage_0= ruleQuestionPage
                    {
                     
                            newCompositeNode(grammarAccess.getPageAccess().getQuestionPageParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleQuestionPage_in_rulePage303);
                    this_QuestionPage_0=ruleQuestionPage();

                    state._fsp--;

                     
                            current = this_QuestionPage_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:178:5: this_DescriptionPage_1= ruleDescriptionPage
                    {
                     
                            newCompositeNode(grammarAccess.getPageAccess().getDescriptionPageParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDescriptionPage_in_rulePage330);
                    this_DescriptionPage_1=ruleDescriptionPage();

                    state._fsp--;

                     
                            current = this_DescriptionPage_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:188:5: this_ResultPage_2= ruleResultPage
                    {
                     
                            newCompositeNode(grammarAccess.getPageAccess().getResultPageParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleResultPage_in_rulePage357);
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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:204:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:205:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:206:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_entryRuleQuestion392);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestion402); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:213:1: ruleQuestion returns [EObject current=null] : (this_FreetextQuestion_0= ruleFreetextQuestion | this_SingleChoiceQuestion_1= ruleSingleChoiceQuestion | this_MultiChoiceQuestion_2= ruleMultiChoiceQuestion ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        EObject this_FreetextQuestion_0 = null;

        EObject this_SingleChoiceQuestion_1 = null;

        EObject this_MultiChoiceQuestion_2 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:216:28: ( (this_FreetextQuestion_0= ruleFreetextQuestion | this_SingleChoiceQuestion_1= ruleSingleChoiceQuestion | this_MultiChoiceQuestion_2= ruleMultiChoiceQuestion ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:217:1: (this_FreetextQuestion_0= ruleFreetextQuestion | this_SingleChoiceQuestion_1= ruleSingleChoiceQuestion | this_MultiChoiceQuestion_2= ruleMultiChoiceQuestion )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:217:1: (this_FreetextQuestion_0= ruleFreetextQuestion | this_SingleChoiceQuestion_1= ruleSingleChoiceQuestion | this_MultiChoiceQuestion_2= ruleMultiChoiceQuestion )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt3=1;
                }
                break;
            case 25:
                {
                alt3=2;
                }
                break;
            case 26:
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
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:218:5: this_FreetextQuestion_0= ruleFreetextQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getFreetextQuestionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFreetextQuestion_in_ruleQuestion449);
                    this_FreetextQuestion_0=ruleFreetextQuestion();

                    state._fsp--;

                     
                            current = this_FreetextQuestion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:228:5: this_SingleChoiceQuestion_1= ruleSingleChoiceQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getSingleChoiceQuestionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSingleChoiceQuestion_in_ruleQuestion476);
                    this_SingleChoiceQuestion_1=ruleSingleChoiceQuestion();

                    state._fsp--;

                     
                            current = this_SingleChoiceQuestion_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:238:5: this_MultiChoiceQuestion_2= ruleMultiChoiceQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getMultiChoiceQuestionParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMultiChoiceQuestion_in_ruleQuestion503);
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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:254:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:255:2: (iv_ruleDependency= ruleDependency EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:256:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_entryRuleDependency538);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDependency548); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:263:1: ruleDependency returns [EObject current=null] : (this_And_0= ruleAnd | this_Or_1= ruleOr | this_AnswerRef_2= ruleAnswerRef ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        EObject this_And_0 = null;

        EObject this_Or_1 = null;

        EObject this_AnswerRef_2 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:266:28: ( (this_And_0= ruleAnd | this_Or_1= ruleOr | this_AnswerRef_2= ruleAnswerRef ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:267:1: (this_And_0= ruleAnd | this_Or_1= ruleOr | this_AnswerRef_2= ruleAnswerRef )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:267:1: (this_And_0= ruleAnd | this_Or_1= ruleOr | this_AnswerRef_2= ruleAnswerRef )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt4=1;
                }
                break;
            case 30:
                {
                alt4=2;
                }
                break;
            case 32:
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
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:268:5: this_And_0= ruleAnd
                    {
                     
                            newCompositeNode(grammarAccess.getDependencyAccess().getAndParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnd_in_ruleDependency595);
                    this_And_0=ruleAnd();

                    state._fsp--;

                     
                            current = this_And_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:278:5: this_Or_1= ruleOr
                    {
                     
                            newCompositeNode(grammarAccess.getDependencyAccess().getOrParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOr_in_ruleDependency622);
                    this_Or_1=ruleOr();

                    state._fsp--;

                     
                            current = this_Or_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:288:5: this_AnswerRef_2= ruleAnswerRef
                    {
                     
                            newCompositeNode(grammarAccess.getDependencyAccess().getAnswerRefParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnswerRef_in_ruleDependency649);
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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:304:1: entryRuleAnswer returns [EObject current=null] : iv_ruleAnswer= ruleAnswer EOF ;
    public final EObject entryRuleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswer = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:305:2: (iv_ruleAnswer= ruleAnswer EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:306:2: iv_ruleAnswer= ruleAnswer EOF
            {
             newCompositeNode(grammarAccess.getAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_entryRuleAnswer684);
            iv_ruleAnswer=ruleAnswer();

            state._fsp--;

             current =iv_ruleAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswer694); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:313:1: ruleAnswer returns [EObject current=null] : (this_ChoiceAnswer_0= ruleChoiceAnswer | this_FreetextAnswer_1= ruleFreetextAnswer ) ;
    public final EObject ruleAnswer() throws RecognitionException {
        EObject current = null;

        EObject this_ChoiceAnswer_0 = null;

        EObject this_FreetextAnswer_1 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:316:28: ( (this_ChoiceAnswer_0= ruleChoiceAnswer | this_FreetextAnswer_1= ruleFreetextAnswer ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:317:1: (this_ChoiceAnswer_0= ruleChoiceAnswer | this_FreetextAnswer_1= ruleFreetextAnswer )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:317:1: (this_ChoiceAnswer_0= ruleChoiceAnswer | this_FreetextAnswer_1= ruleFreetextAnswer )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==33) ) {
                alt5=1;
            }
            else if ( (LA5_0==34) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:318:5: this_ChoiceAnswer_0= ruleChoiceAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getAnswerAccess().getChoiceAnswerParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleChoiceAnswer_in_ruleAnswer741);
                    this_ChoiceAnswer_0=ruleChoiceAnswer();

                    state._fsp--;

                     
                            current = this_ChoiceAnswer_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:328:5: this_FreetextAnswer_1= ruleFreetextAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getAnswerAccess().getFreetextAnswerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFreetextAnswer_in_ruleAnswer768);
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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:344:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:345:2: (iv_ruleEString= ruleEString EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:346:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString804);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString815); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:353:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:356:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:357:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:357:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:357:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString855); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:365:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString881); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:380:1: entryRuleQuestionPage returns [EObject current=null] : iv_ruleQuestionPage= ruleQuestionPage EOF ;
    public final EObject entryRuleQuestionPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionPage = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:381:2: (iv_ruleQuestionPage= ruleQuestionPage EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:382:2: iv_ruleQuestionPage= ruleQuestionPage EOF
            {
             newCompositeNode(grammarAccess.getQuestionPageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestionPage_in_entryRuleQuestionPage926);
            iv_ruleQuestionPage=ruleQuestionPage();

            state._fsp--;

             current =iv_ruleQuestionPage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestionPage936); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:389:1: ruleQuestionPage returns [EObject current=null] : (otherlv_0= 'question page' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )? otherlv_4= 'questions:' ( (lv_questions_5_0= ruleQuestion ) ) ( (lv_questions_6_0= ruleQuestion ) )* otherlv_7= 'end page' ) ;
    public final EObject ruleQuestionPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_title_1_0 = null;

        AntlrDatatypeRuleToken lv_text_3_0 = null;

        EObject lv_questions_5_0 = null;

        EObject lv_questions_6_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:392:28: ( (otherlv_0= 'question page' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )? otherlv_4= 'questions:' ( (lv_questions_5_0= ruleQuestion ) ) ( (lv_questions_6_0= ruleQuestion ) )* otherlv_7= 'end page' ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:393:1: (otherlv_0= 'question page' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )? otherlv_4= 'questions:' ( (lv_questions_5_0= ruleQuestion ) ) ( (lv_questions_6_0= ruleQuestion ) )* otherlv_7= 'end page' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:393:1: (otherlv_0= 'question page' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )? otherlv_4= 'questions:' ( (lv_questions_5_0= ruleQuestion ) ) ( (lv_questions_6_0= ruleQuestion ) )* otherlv_7= 'end page' )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:393:3: otherlv_0= 'question page' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )? otherlv_4= 'questions:' ( (lv_questions_5_0= ruleQuestion ) ) ( (lv_questions_6_0= ruleQuestion ) )* otherlv_7= 'end page'
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleQuestionPage973); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionPageAccess().getQuestionPageKeyword_0());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:397:1: ( (lv_title_1_0= ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:398:1: (lv_title_1_0= ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:398:1: (lv_title_1_0= ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:399:3: lv_title_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getQuestionPageAccess().getTitleEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQuestionPage994);
            lv_title_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuestionPageRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:415:2: (otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:415:4: otherlv_2= ':' ( (lv_text_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleQuestionPage1007); 

                        	newLeafNode(otherlv_2, grammarAccess.getQuestionPageAccess().getColonKeyword_2_0());
                        
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:419:1: ( (lv_text_3_0= ruleEString ) )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:420:1: (lv_text_3_0= ruleEString )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:420:1: (lv_text_3_0= ruleEString )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:421:3: lv_text_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getQuestionPageAccess().getTextEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQuestionPage1028);
                    lv_text_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getQuestionPageRule());
                    	        }
                           		set(
                           			current, 
                           			"text",
                            		lv_text_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleQuestionPage1042); 

                	newLeafNode(otherlv_4, grammarAccess.getQuestionPageAccess().getQuestionsKeyword_3());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:441:1: ( (lv_questions_5_0= ruleQuestion ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:442:1: (lv_questions_5_0= ruleQuestion )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:442:1: (lv_questions_5_0= ruleQuestion )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:443:3: lv_questions_5_0= ruleQuestion
            {
             
            	        newCompositeNode(grammarAccess.getQuestionPageAccess().getQuestionsQuestionParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleQuestionPage1063);
            lv_questions_5_0=ruleQuestion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuestionPageRule());
            	        }
                   		add(
                   			current, 
                   			"questions",
                    		lv_questions_5_0, 
                    		"Question");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:459:2: ( (lv_questions_6_0= ruleQuestion ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20||(LA8_0>=25 && LA8_0<=26)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:460:1: (lv_questions_6_0= ruleQuestion )
            	    {
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:460:1: (lv_questions_6_0= ruleQuestion )
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:461:3: lv_questions_6_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionPageAccess().getQuestionsQuestionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleQuestionPage1084);
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
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleQuestionPage1097); 

                	newLeafNode(otherlv_7, grammarAccess.getQuestionPageAccess().getEndPageKeyword_6());
                

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:489:1: entryRuleDescriptionPage returns [EObject current=null] : iv_ruleDescriptionPage= ruleDescriptionPage EOF ;
    public final EObject entryRuleDescriptionPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescriptionPage = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:490:2: (iv_ruleDescriptionPage= ruleDescriptionPage EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:491:2: iv_ruleDescriptionPage= ruleDescriptionPage EOF
            {
             newCompositeNode(grammarAccess.getDescriptionPageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDescriptionPage_in_entryRuleDescriptionPage1133);
            iv_ruleDescriptionPage=ruleDescriptionPage();

            state._fsp--;

             current =iv_ruleDescriptionPage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDescriptionPage1143); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:498:1: ruleDescriptionPage returns [EObject current=null] : (otherlv_0= 'description page' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )? otherlv_4= 'end page' ) ;
    public final EObject ruleDescriptionPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_title_1_0 = null;

        AntlrDatatypeRuleToken lv_text_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:501:28: ( (otherlv_0= 'description page' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )? otherlv_4= 'end page' ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:502:1: (otherlv_0= 'description page' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )? otherlv_4= 'end page' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:502:1: (otherlv_0= 'description page' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )? otherlv_4= 'end page' )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:502:3: otherlv_0= 'description page' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )? otherlv_4= 'end page'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDescriptionPage1180); 

                	newLeafNode(otherlv_0, grammarAccess.getDescriptionPageAccess().getDescriptionPageKeyword_0());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:506:1: ( (lv_title_1_0= ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:507:1: (lv_title_1_0= ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:507:1: (lv_title_1_0= ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:508:3: lv_title_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDescriptionPageAccess().getTitleEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDescriptionPage1201);
            lv_title_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDescriptionPageRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:524:2: (otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:524:4: otherlv_2= ':' ( (lv_text_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDescriptionPage1214); 

                        	newLeafNode(otherlv_2, grammarAccess.getDescriptionPageAccess().getColonKeyword_2_0());
                        
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:528:1: ( (lv_text_3_0= ruleEString ) )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:529:1: (lv_text_3_0= ruleEString )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:529:1: (lv_text_3_0= ruleEString )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:530:3: lv_text_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getDescriptionPageAccess().getTextEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDescriptionPage1235);
                    lv_text_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDescriptionPageRule());
                    	        }
                           		set(
                           			current, 
                           			"text",
                            		lv_text_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDescriptionPage1249); 

                	newLeafNode(otherlv_4, grammarAccess.getDescriptionPageAccess().getEndPageKeyword_3());
                

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:558:1: entryRuleResultPage returns [EObject current=null] : iv_ruleResultPage= ruleResultPage EOF ;
    public final EObject entryRuleResultPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultPage = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:559:2: (iv_ruleResultPage= ruleResultPage EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:560:2: iv_ruleResultPage= ruleResultPage EOF
            {
             newCompositeNode(grammarAccess.getResultPageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleResultPage_in_entryRuleResultPage1285);
            iv_ruleResultPage=ruleResultPage();

            state._fsp--;

             current =iv_ruleResultPage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleResultPage1295); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:567:1: ruleResultPage returns [EObject current=null] : (otherlv_0= 'result page' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )? otherlv_4= 'end page' ) ;
    public final EObject ruleResultPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_title_1_0 = null;

        AntlrDatatypeRuleToken lv_text_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:570:28: ( (otherlv_0= 'result page' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )? otherlv_4= 'end page' ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:571:1: (otherlv_0= 'result page' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )? otherlv_4= 'end page' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:571:1: (otherlv_0= 'result page' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )? otherlv_4= 'end page' )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:571:3: otherlv_0= 'result page' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )? otherlv_4= 'end page'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleResultPage1332); 

                	newLeafNode(otherlv_0, grammarAccess.getResultPageAccess().getResultPageKeyword_0());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:575:1: ( (lv_title_1_0= ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:576:1: (lv_title_1_0= ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:576:1: (lv_title_1_0= ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:577:3: lv_title_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getResultPageAccess().getTitleEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleResultPage1353);
            lv_title_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getResultPageRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:593:2: (otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:593:4: otherlv_2= ':' ( (lv_text_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleResultPage1366); 

                        	newLeafNode(otherlv_2, grammarAccess.getResultPageAccess().getColonKeyword_2_0());
                        
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:597:1: ( (lv_text_3_0= ruleEString ) )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:598:1: (lv_text_3_0= ruleEString )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:598:1: (lv_text_3_0= ruleEString )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:599:3: lv_text_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getResultPageAccess().getTextEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleResultPage1387);
                    lv_text_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getResultPageRule());
                    	        }
                           		set(
                           			current, 
                           			"text",
                            		lv_text_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleResultPage1401); 

                	newLeafNode(otherlv_4, grammarAccess.getResultPageAccess().getEndPageKeyword_3());
                

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:629:1: entryRuleFreetextQuestion returns [EObject current=null] : iv_ruleFreetextQuestion= ruleFreetextQuestion EOF ;
    public final EObject entryRuleFreetextQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFreetextQuestion = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:630:2: (iv_ruleFreetextQuestion= ruleFreetextQuestion EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:631:2: iv_ruleFreetextQuestion= ruleFreetextQuestion EOF
            {
             newCompositeNode(grammarAccess.getFreetextQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFreetextQuestion_in_entryRuleFreetextQuestion1439);
            iv_ruleFreetextQuestion=ruleFreetextQuestion();

            state._fsp--;

             current =iv_ruleFreetextQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFreetextQuestion1449); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:638:1: ruleFreetextQuestion returns [EObject current=null] : (otherlv_0= 'free text question' ( (lv_text_1_0= ruleEString ) ) ( (lv_optional_2_0= 'optional' ) )? (otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) ) )? otherlv_5= 'answers:' ( (lv_answers_6_0= ruleFreetextAnswer ) ) otherlv_7= 'end question' ) ;
    public final EObject ruleFreetextQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_optional_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_text_1_0 = null;

        EObject lv_requires_4_0 = null;

        EObject lv_answers_6_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:641:28: ( (otherlv_0= 'free text question' ( (lv_text_1_0= ruleEString ) ) ( (lv_optional_2_0= 'optional' ) )? (otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) ) )? otherlv_5= 'answers:' ( (lv_answers_6_0= ruleFreetextAnswer ) ) otherlv_7= 'end question' ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:642:1: (otherlv_0= 'free text question' ( (lv_text_1_0= ruleEString ) ) ( (lv_optional_2_0= 'optional' ) )? (otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) ) )? otherlv_5= 'answers:' ( (lv_answers_6_0= ruleFreetextAnswer ) ) otherlv_7= 'end question' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:642:1: (otherlv_0= 'free text question' ( (lv_text_1_0= ruleEString ) ) ( (lv_optional_2_0= 'optional' ) )? (otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) ) )? otherlv_5= 'answers:' ( (lv_answers_6_0= ruleFreetextAnswer ) ) otherlv_7= 'end question' )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:642:3: otherlv_0= 'free text question' ( (lv_text_1_0= ruleEString ) ) ( (lv_optional_2_0= 'optional' ) )? (otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) ) )? otherlv_5= 'answers:' ( (lv_answers_6_0= ruleFreetextAnswer ) ) otherlv_7= 'end question'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleFreetextQuestion1486); 

                	newLeafNode(otherlv_0, grammarAccess.getFreetextQuestionAccess().getFreeTextQuestionKeyword_0());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:646:1: ( (lv_text_1_0= ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:647:1: (lv_text_1_0= ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:647:1: (lv_text_1_0= ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:648:3: lv_text_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFreetextQuestionAccess().getTextEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFreetextQuestion1507);
            lv_text_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFreetextQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"text",
                    		lv_text_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:664:2: ( (lv_optional_2_0= 'optional' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:665:1: (lv_optional_2_0= 'optional' )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:665:1: (lv_optional_2_0= 'optional' )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:666:3: lv_optional_2_0= 'optional'
                    {
                    lv_optional_2_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleFreetextQuestion1525); 

                            newLeafNode(lv_optional_2_0, grammarAccess.getFreetextQuestionAccess().getOptionalOptionalKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFreetextQuestionRule());
                    	        }
                           		setWithLastConsumed(current, "optional", true, "optional");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:679:3: (otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:679:5: otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) )
                    {
                    otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleFreetextQuestion1552); 

                        	newLeafNode(otherlv_3, grammarAccess.getFreetextQuestionAccess().getRequiresKeyword_3_0());
                        
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:683:1: ( (lv_requires_4_0= ruleDependency ) )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:684:1: (lv_requires_4_0= ruleDependency )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:684:1: (lv_requires_4_0= ruleDependency )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:685:3: lv_requires_4_0= ruleDependency
                    {
                     
                    	        newCompositeNode(grammarAccess.getFreetextQuestionAccess().getRequiresDependencyParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDependency_in_ruleFreetextQuestion1573);
                    lv_requires_4_0=ruleDependency();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFreetextQuestionRule());
                    	        }
                           		set(
                           			current, 
                           			"requires",
                            		lv_requires_4_0, 
                            		"Dependency");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleFreetextQuestion1587); 

                	newLeafNode(otherlv_5, grammarAccess.getFreetextQuestionAccess().getAnswersKeyword_4());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:705:1: ( (lv_answers_6_0= ruleFreetextAnswer ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:706:1: (lv_answers_6_0= ruleFreetextAnswer )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:706:1: (lv_answers_6_0= ruleFreetextAnswer )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:707:3: lv_answers_6_0= ruleFreetextAnswer
            {
             
            	        newCompositeNode(grammarAccess.getFreetextQuestionAccess().getAnswersFreetextAnswerParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFreetextAnswer_in_ruleFreetextQuestion1608);
            lv_answers_6_0=ruleFreetextAnswer();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFreetextQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"answers",
                    		lv_answers_6_0, 
                    		"FreetextAnswer");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleFreetextQuestion1620); 

                	newLeafNode(otherlv_7, grammarAccess.getFreetextQuestionAccess().getEndQuestionKeyword_6());
                

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:735:1: entryRuleSingleChoiceQuestion returns [EObject current=null] : iv_ruleSingleChoiceQuestion= ruleSingleChoiceQuestion EOF ;
    public final EObject entryRuleSingleChoiceQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleChoiceQuestion = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:736:2: (iv_ruleSingleChoiceQuestion= ruleSingleChoiceQuestion EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:737:2: iv_ruleSingleChoiceQuestion= ruleSingleChoiceQuestion EOF
            {
             newCompositeNode(grammarAccess.getSingleChoiceQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleChoiceQuestion_in_entryRuleSingleChoiceQuestion1656);
            iv_ruleSingleChoiceQuestion=ruleSingleChoiceQuestion();

            state._fsp--;

             current =iv_ruleSingleChoiceQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleChoiceQuestion1666); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:744:1: ruleSingleChoiceQuestion returns [EObject current=null] : (otherlv_0= 'single choice question' ( (lv_text_1_0= ruleEString ) ) ( (lv_optional_2_0= 'optional' ) )? (otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) ) )? otherlv_5= 'answers:' ( (lv_answers_6_0= ruleAnswer ) ) ( (lv_answers_7_0= ruleAnswer ) )* otherlv_8= 'end question' ) ;
    public final EObject ruleSingleChoiceQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_optional_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_text_1_0 = null;

        EObject lv_requires_4_0 = null;

        EObject lv_answers_6_0 = null;

        EObject lv_answers_7_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:747:28: ( (otherlv_0= 'single choice question' ( (lv_text_1_0= ruleEString ) ) ( (lv_optional_2_0= 'optional' ) )? (otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) ) )? otherlv_5= 'answers:' ( (lv_answers_6_0= ruleAnswer ) ) ( (lv_answers_7_0= ruleAnswer ) )* otherlv_8= 'end question' ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:748:1: (otherlv_0= 'single choice question' ( (lv_text_1_0= ruleEString ) ) ( (lv_optional_2_0= 'optional' ) )? (otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) ) )? otherlv_5= 'answers:' ( (lv_answers_6_0= ruleAnswer ) ) ( (lv_answers_7_0= ruleAnswer ) )* otherlv_8= 'end question' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:748:1: (otherlv_0= 'single choice question' ( (lv_text_1_0= ruleEString ) ) ( (lv_optional_2_0= 'optional' ) )? (otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) ) )? otherlv_5= 'answers:' ( (lv_answers_6_0= ruleAnswer ) ) ( (lv_answers_7_0= ruleAnswer ) )* otherlv_8= 'end question' )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:748:3: otherlv_0= 'single choice question' ( (lv_text_1_0= ruleEString ) ) ( (lv_optional_2_0= 'optional' ) )? (otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) ) )? otherlv_5= 'answers:' ( (lv_answers_6_0= ruleAnswer ) ) ( (lv_answers_7_0= ruleAnswer ) )* otherlv_8= 'end question'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleSingleChoiceQuestion1703); 

                	newLeafNode(otherlv_0, grammarAccess.getSingleChoiceQuestionAccess().getSingleChoiceQuestionKeyword_0());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:752:1: ( (lv_text_1_0= ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:753:1: (lv_text_1_0= ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:753:1: (lv_text_1_0= ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:754:3: lv_text_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSingleChoiceQuestionAccess().getTextEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingleChoiceQuestion1724);
            lv_text_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSingleChoiceQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"text",
                    		lv_text_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:770:2: ( (lv_optional_2_0= 'optional' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:771:1: (lv_optional_2_0= 'optional' )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:771:1: (lv_optional_2_0= 'optional' )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:772:3: lv_optional_2_0= 'optional'
                    {
                    lv_optional_2_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleSingleChoiceQuestion1742); 

                            newLeafNode(lv_optional_2_0, grammarAccess.getSingleChoiceQuestionAccess().getOptionalOptionalKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSingleChoiceQuestionRule());
                    	        }
                           		setWithLastConsumed(current, "optional", true, "optional");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:785:3: (otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:785:5: otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) )
                    {
                    otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSingleChoiceQuestion1769); 

                        	newLeafNode(otherlv_3, grammarAccess.getSingleChoiceQuestionAccess().getRequiresKeyword_3_0());
                        
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:789:1: ( (lv_requires_4_0= ruleDependency ) )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:790:1: (lv_requires_4_0= ruleDependency )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:790:1: (lv_requires_4_0= ruleDependency )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:791:3: lv_requires_4_0= ruleDependency
                    {
                     
                    	        newCompositeNode(grammarAccess.getSingleChoiceQuestionAccess().getRequiresDependencyParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDependency_in_ruleSingleChoiceQuestion1790);
                    lv_requires_4_0=ruleDependency();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSingleChoiceQuestionRule());
                    	        }
                           		set(
                           			current, 
                           			"requires",
                            		lv_requires_4_0, 
                            		"Dependency");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSingleChoiceQuestion1804); 

                	newLeafNode(otherlv_5, grammarAccess.getSingleChoiceQuestionAccess().getAnswersKeyword_4());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:811:1: ( (lv_answers_6_0= ruleAnswer ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:812:1: (lv_answers_6_0= ruleAnswer )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:812:1: (lv_answers_6_0= ruleAnswer )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:813:3: lv_answers_6_0= ruleAnswer
            {
             
            	        newCompositeNode(grammarAccess.getSingleChoiceQuestionAccess().getAnswersAnswerParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleSingleChoiceQuestion1825);
            lv_answers_6_0=ruleAnswer();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSingleChoiceQuestionRule());
            	        }
                   		add(
                   			current, 
                   			"answers",
                    		lv_answers_6_0, 
                    		"Answer");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:829:2: ( (lv_answers_7_0= ruleAnswer ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=33 && LA15_0<=34)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:830:1: (lv_answers_7_0= ruleAnswer )
            	    {
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:830:1: (lv_answers_7_0= ruleAnswer )
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:831:3: lv_answers_7_0= ruleAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleChoiceQuestionAccess().getAnswersAnswerParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleSingleChoiceQuestion1846);
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
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSingleChoiceQuestion1859); 

                	newLeafNode(otherlv_8, grammarAccess.getSingleChoiceQuestionAccess().getEndQuestionKeyword_7());
                

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:859:1: entryRuleMultiChoiceQuestion returns [EObject current=null] : iv_ruleMultiChoiceQuestion= ruleMultiChoiceQuestion EOF ;
    public final EObject entryRuleMultiChoiceQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiChoiceQuestion = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:860:2: (iv_ruleMultiChoiceQuestion= ruleMultiChoiceQuestion EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:861:2: iv_ruleMultiChoiceQuestion= ruleMultiChoiceQuestion EOF
            {
             newCompositeNode(grammarAccess.getMultiChoiceQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiChoiceQuestion_in_entryRuleMultiChoiceQuestion1895);
            iv_ruleMultiChoiceQuestion=ruleMultiChoiceQuestion();

            state._fsp--;

             current =iv_ruleMultiChoiceQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiChoiceQuestion1905); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:868:1: ruleMultiChoiceQuestion returns [EObject current=null] : (otherlv_0= 'multi choice question' ( (lv_text_1_0= ruleEString ) ) ( (lv_optional_2_0= 'optional' ) )? (otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) ) )? otherlv_5= 'answers:' ( (lv_answers_6_0= ruleAnswer ) ) ( (lv_answers_7_0= ruleAnswer ) )* otherlv_8= 'end question' ) ;
    public final EObject ruleMultiChoiceQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_optional_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_text_1_0 = null;

        EObject lv_requires_4_0 = null;

        EObject lv_answers_6_0 = null;

        EObject lv_answers_7_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:871:28: ( (otherlv_0= 'multi choice question' ( (lv_text_1_0= ruleEString ) ) ( (lv_optional_2_0= 'optional' ) )? (otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) ) )? otherlv_5= 'answers:' ( (lv_answers_6_0= ruleAnswer ) ) ( (lv_answers_7_0= ruleAnswer ) )* otherlv_8= 'end question' ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:872:1: (otherlv_0= 'multi choice question' ( (lv_text_1_0= ruleEString ) ) ( (lv_optional_2_0= 'optional' ) )? (otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) ) )? otherlv_5= 'answers:' ( (lv_answers_6_0= ruleAnswer ) ) ( (lv_answers_7_0= ruleAnswer ) )* otherlv_8= 'end question' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:872:1: (otherlv_0= 'multi choice question' ( (lv_text_1_0= ruleEString ) ) ( (lv_optional_2_0= 'optional' ) )? (otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) ) )? otherlv_5= 'answers:' ( (lv_answers_6_0= ruleAnswer ) ) ( (lv_answers_7_0= ruleAnswer ) )* otherlv_8= 'end question' )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:872:3: otherlv_0= 'multi choice question' ( (lv_text_1_0= ruleEString ) ) ( (lv_optional_2_0= 'optional' ) )? (otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) ) )? otherlv_5= 'answers:' ( (lv_answers_6_0= ruleAnswer ) ) ( (lv_answers_7_0= ruleAnswer ) )* otherlv_8= 'end question'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMultiChoiceQuestion1942); 

                	newLeafNode(otherlv_0, grammarAccess.getMultiChoiceQuestionAccess().getMultiChoiceQuestionKeyword_0());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:876:1: ( (lv_text_1_0= ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:877:1: (lv_text_1_0= ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:877:1: (lv_text_1_0= ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:878:3: lv_text_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMultiChoiceQuestionAccess().getTextEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiChoiceQuestion1963);
            lv_text_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultiChoiceQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"text",
                    		lv_text_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:894:2: ( (lv_optional_2_0= 'optional' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:895:1: (lv_optional_2_0= 'optional' )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:895:1: (lv_optional_2_0= 'optional' )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:896:3: lv_optional_2_0= 'optional'
                    {
                    lv_optional_2_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMultiChoiceQuestion1981); 

                            newLeafNode(lv_optional_2_0, grammarAccess.getMultiChoiceQuestionAccess().getOptionalOptionalKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiChoiceQuestionRule());
                    	        }
                           		setWithLastConsumed(current, "optional", true, "optional");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:909:3: (otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:909:5: otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) )
                    {
                    otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMultiChoiceQuestion2008); 

                        	newLeafNode(otherlv_3, grammarAccess.getMultiChoiceQuestionAccess().getRequiresKeyword_3_0());
                        
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:913:1: ( (lv_requires_4_0= ruleDependency ) )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:914:1: (lv_requires_4_0= ruleDependency )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:914:1: (lv_requires_4_0= ruleDependency )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:915:3: lv_requires_4_0= ruleDependency
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultiChoiceQuestionAccess().getRequiresDependencyParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDependency_in_ruleMultiChoiceQuestion2029);
                    lv_requires_4_0=ruleDependency();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultiChoiceQuestionRule());
                    	        }
                           		set(
                           			current, 
                           			"requires",
                            		lv_requires_4_0, 
                            		"Dependency");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMultiChoiceQuestion2043); 

                	newLeafNode(otherlv_5, grammarAccess.getMultiChoiceQuestionAccess().getAnswersKeyword_4());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:935:1: ( (lv_answers_6_0= ruleAnswer ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:936:1: (lv_answers_6_0= ruleAnswer )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:936:1: (lv_answers_6_0= ruleAnswer )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:937:3: lv_answers_6_0= ruleAnswer
            {
             
            	        newCompositeNode(grammarAccess.getMultiChoiceQuestionAccess().getAnswersAnswerParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleMultiChoiceQuestion2064);
            lv_answers_6_0=ruleAnswer();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultiChoiceQuestionRule());
            	        }
                   		add(
                   			current, 
                   			"answers",
                    		lv_answers_6_0, 
                    		"Answer");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:953:2: ( (lv_answers_7_0= ruleAnswer ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=33 && LA18_0<=34)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:954:1: (lv_answers_7_0= ruleAnswer )
            	    {
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:954:1: (lv_answers_7_0= ruleAnswer )
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:955:3: lv_answers_7_0= ruleAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiChoiceQuestionAccess().getAnswersAnswerParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleMultiChoiceQuestion2085);
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
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMultiChoiceQuestion2098); 

                	newLeafNode(otherlv_8, grammarAccess.getMultiChoiceQuestionAccess().getEndQuestionKeyword_7());
                

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:983:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:984:2: (iv_ruleAnd= ruleAnd EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:985:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnd_in_entryRuleAnd2134);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnd2144); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:992:1: ruleAnd returns [EObject current=null] : (otherlv_0= 'and(' ( (lv_lhs_1_0= ruleDependency ) ) otherlv_2= 'and' ( (lv_rhs_3_0= ruleDependency ) ) otherlv_4= ')' ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_lhs_1_0 = null;

        EObject lv_rhs_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:995:28: ( (otherlv_0= 'and(' ( (lv_lhs_1_0= ruleDependency ) ) otherlv_2= 'and' ( (lv_rhs_3_0= ruleDependency ) ) otherlv_4= ')' ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:996:1: (otherlv_0= 'and(' ( (lv_lhs_1_0= ruleDependency ) ) otherlv_2= 'and' ( (lv_rhs_3_0= ruleDependency ) ) otherlv_4= ')' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:996:1: (otherlv_0= 'and(' ( (lv_lhs_1_0= ruleDependency ) ) otherlv_2= 'and' ( (lv_rhs_3_0= ruleDependency ) ) otherlv_4= ')' )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:996:3: otherlv_0= 'and(' ( (lv_lhs_1_0= ruleDependency ) ) otherlv_2= 'and' ( (lv_rhs_3_0= ruleDependency ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleAnd2181); 

                	newLeafNode(otherlv_0, grammarAccess.getAndAccess().getAndKeyword_0());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1000:1: ( (lv_lhs_1_0= ruleDependency ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1001:1: (lv_lhs_1_0= ruleDependency )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1001:1: (lv_lhs_1_0= ruleDependency )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1002:3: lv_lhs_1_0= ruleDependency
            {
             
            	        newCompositeNode(grammarAccess.getAndAccess().getLhsDependencyParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_ruleAnd2202);
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

            otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAnd2214); 

                	newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAndKeyword_2());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1022:1: ( (lv_rhs_3_0= ruleDependency ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1023:1: (lv_rhs_3_0= ruleDependency )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1023:1: (lv_rhs_3_0= ruleDependency )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1024:3: lv_rhs_3_0= ruleDependency
            {
             
            	        newCompositeNode(grammarAccess.getAndAccess().getRhsDependencyParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_ruleAnd2235);
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

            otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAnd2247); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1052:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1053:2: (iv_ruleOr= ruleOr EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1054:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOr_in_entryRuleOr2283);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOr2293); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1061:1: ruleOr returns [EObject current=null] : (otherlv_0= 'or(' ( (lv_lhs_1_0= ruleDependency ) ) otherlv_2= 'or' ( (lv_rhs_3_0= ruleDependency ) ) otherlv_4= ')' ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_lhs_1_0 = null;

        EObject lv_rhs_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1064:28: ( (otherlv_0= 'or(' ( (lv_lhs_1_0= ruleDependency ) ) otherlv_2= 'or' ( (lv_rhs_3_0= ruleDependency ) ) otherlv_4= ')' ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1065:1: (otherlv_0= 'or(' ( (lv_lhs_1_0= ruleDependency ) ) otherlv_2= 'or' ( (lv_rhs_3_0= ruleDependency ) ) otherlv_4= ')' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1065:1: (otherlv_0= 'or(' ( (lv_lhs_1_0= ruleDependency ) ) otherlv_2= 'or' ( (lv_rhs_3_0= ruleDependency ) ) otherlv_4= ')' )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1065:3: otherlv_0= 'or(' ( (lv_lhs_1_0= ruleDependency ) ) otherlv_2= 'or' ( (lv_rhs_3_0= ruleDependency ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleOr2330); 

                	newLeafNode(otherlv_0, grammarAccess.getOrAccess().getOrKeyword_0());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1069:1: ( (lv_lhs_1_0= ruleDependency ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1070:1: (lv_lhs_1_0= ruleDependency )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1070:1: (lv_lhs_1_0= ruleDependency )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1071:3: lv_lhs_1_0= ruleDependency
            {
             
            	        newCompositeNode(grammarAccess.getOrAccess().getLhsDependencyParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_ruleOr2351);
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

            otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleOr2363); 

                	newLeafNode(otherlv_2, grammarAccess.getOrAccess().getOrKeyword_2());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1091:1: ( (lv_rhs_3_0= ruleDependency ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1092:1: (lv_rhs_3_0= ruleDependency )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1092:1: (lv_rhs_3_0= ruleDependency )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1093:3: lv_rhs_3_0= ruleDependency
            {
             
            	        newCompositeNode(grammarAccess.getOrAccess().getRhsDependencyParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_ruleOr2384);
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

            otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleOr2396); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1123:1: entryRuleAnswerRef returns [EObject current=null] : iv_ruleAnswerRef= ruleAnswerRef EOF ;
    public final EObject entryRuleAnswerRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswerRef = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1124:2: (iv_ruleAnswerRef= ruleAnswerRef EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1125:2: iv_ruleAnswerRef= ruleAnswerRef EOF
            {
             newCompositeNode(grammarAccess.getAnswerRefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswerRef_in_entryRuleAnswerRef2434);
            iv_ruleAnswerRef=ruleAnswerRef();

            state._fsp--;

             current =iv_ruleAnswerRef; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswerRef2444); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1132:1: ruleAnswerRef returns [EObject current=null] : (otherlv_0= 'answer reference:' ( ( ruleEString ) ) ) ;
    public final EObject ruleAnswerRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1135:28: ( (otherlv_0= 'answer reference:' ( ( ruleEString ) ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1136:1: (otherlv_0= 'answer reference:' ( ( ruleEString ) ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1136:1: (otherlv_0= 'answer reference:' ( ( ruleEString ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1136:3: otherlv_0= 'answer reference:' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleAnswerRef2481); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerRefAccess().getAnswerReferenceKeyword_0());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1140:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1141:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1141:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1142:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAnswerRefRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAnswerRefAccess().getRefersAnswerCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnswerRef2504);
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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1163:1: entryRuleChoiceAnswer returns [EObject current=null] : iv_ruleChoiceAnswer= ruleChoiceAnswer EOF ;
    public final EObject entryRuleChoiceAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoiceAnswer = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1164:2: (iv_ruleChoiceAnswer= ruleChoiceAnswer EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1165:2: iv_ruleChoiceAnswer= ruleChoiceAnswer EOF
            {
             newCompositeNode(grammarAccess.getChoiceAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleChoiceAnswer_in_entryRuleChoiceAnswer2540);
            iv_ruleChoiceAnswer=ruleChoiceAnswer();

            state._fsp--;

             current =iv_ruleChoiceAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleChoiceAnswer2550); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1172:1: ruleChoiceAnswer returns [EObject current=null] : (otherlv_0= 'answer choice' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) ) ;
    public final EObject ruleChoiceAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_text_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1175:28: ( (otherlv_0= 'answer choice' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1176:1: (otherlv_0= 'answer choice' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1176:1: (otherlv_0= 'answer choice' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1176:3: otherlv_0= 'answer choice' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_text_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleChoiceAnswer2587); 

                	newLeafNode(otherlv_0, grammarAccess.getChoiceAnswerAccess().getAnswerChoiceKeyword_0());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1180:1: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1181:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1181:1: (lv_name_1_0= RULE_ID )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1182:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleChoiceAnswer2604); 

            			newLeafNode(lv_name_1_0, grammarAccess.getChoiceAnswerAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChoiceAnswerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleChoiceAnswer2621); 

                	newLeafNode(otherlv_2, grammarAccess.getChoiceAnswerAccess().getColonKeyword_2());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1202:1: ( (lv_text_3_0= ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1203:1: (lv_text_3_0= ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1203:1: (lv_text_3_0= ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1204:3: lv_text_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getChoiceAnswerAccess().getTextEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoiceAnswer2642);
            lv_text_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChoiceAnswerRule());
            	        }
                   		set(
                   			current, 
                   			"text",
                    		lv_text_3_0, 
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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1228:1: entryRuleFreetextAnswer returns [EObject current=null] : iv_ruleFreetextAnswer= ruleFreetextAnswer EOF ;
    public final EObject entryRuleFreetextAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFreetextAnswer = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1229:2: (iv_ruleFreetextAnswer= ruleFreetextAnswer EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1230:2: iv_ruleFreetextAnswer= ruleFreetextAnswer EOF
            {
             newCompositeNode(grammarAccess.getFreetextAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFreetextAnswer_in_entryRuleFreetextAnswer2678);
            iv_ruleFreetextAnswer=ruleFreetextAnswer();

            state._fsp--;

             current =iv_ruleFreetextAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFreetextAnswer2688); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1237:1: ruleFreetextAnswer returns [EObject current=null] : (otherlv_0= 'answer text' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) ) ;
    public final EObject ruleFreetextAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_text_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1240:28: ( (otherlv_0= 'answer text' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1241:1: (otherlv_0= 'answer text' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1241:1: (otherlv_0= 'answer text' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1241:3: otherlv_0= 'answer text' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_text_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleFreetextAnswer2725); 

                	newLeafNode(otherlv_0, grammarAccess.getFreetextAnswerAccess().getAnswerTextKeyword_0());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1245:1: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1246:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1246:1: (lv_name_1_0= RULE_ID )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1247:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFreetextAnswer2742); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFreetextAnswerAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFreetextAnswerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFreetextAnswer2759); 

                	newLeafNode(otherlv_2, grammarAccess.getFreetextAnswerAccess().getColonKeyword_2());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1267:1: ( (lv_text_3_0= ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1268:1: (lv_text_3_0= ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1268:1: (lv_text_3_0= ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1269:3: lv_text_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFreetextAnswerAccess().getTextEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFreetextAnswer2780);
            lv_text_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFreetextAnswerRule());
            	        }
                   		set(
                   			current, 
                   			"text",
                    		lv_text_3_0, 
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
        public static final BitSet FOLLOW_11_in_ruleSurvey122 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSurvey143 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSurvey155 = new BitSet(new long[]{0x00000000000C4000L});
        public static final BitSet FOLLOW_rulePage_in_ruleSurvey176 = new BitSet(new long[]{0x00000000000C6000L});
        public static final BitSet FOLLOW_rulePage_in_ruleSurvey197 = new BitSet(new long[]{0x00000000000C6000L});
        public static final BitSet FOLLOW_13_in_ruleSurvey210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePage_in_entryRulePage246 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePage256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestionPage_in_rulePage303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDescriptionPage_in_rulePage330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResultPage_in_rulePage357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion392 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestion402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFreetextQuestion_in_ruleQuestion449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleChoiceQuestion_in_ruleQuestion476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiChoiceQuestion_in_ruleQuestion503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency538 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDependency548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnd_in_ruleDependency595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOr_in_ruleDependency622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerRef_in_ruleDependency649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer684 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswer694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoiceAnswer_in_ruleAnswer741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFreetextAnswer_in_ruleAnswer768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString804 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestionPage_in_entryRuleQuestionPage926 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestionPage936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleQuestionPage973 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQuestionPage994 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleQuestionPage1007 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQuestionPage1028 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleQuestionPage1042 = new BitSet(new long[]{0x0000000006100000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleQuestionPage1063 = new BitSet(new long[]{0x0000000006120000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleQuestionPage1084 = new BitSet(new long[]{0x0000000006120000L});
        public static final BitSet FOLLOW_17_in_ruleQuestionPage1097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDescriptionPage_in_entryRuleDescriptionPage1133 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDescriptionPage1143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleDescriptionPage1180 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDescriptionPage1201 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_15_in_ruleDescriptionPage1214 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDescriptionPage1235 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleDescriptionPage1249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResultPage_in_entryRuleResultPage1285 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleResultPage1295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleResultPage1332 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleResultPage1353 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_15_in_ruleResultPage1366 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleResultPage1387 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleResultPage1401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFreetextQuestion_in_entryRuleFreetextQuestion1439 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFreetextQuestion1449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleFreetextQuestion1486 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFreetextQuestion1507 = new BitSet(new long[]{0x0000000000E00000L});
        public static final BitSet FOLLOW_21_in_ruleFreetextQuestion1525 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_22_in_ruleFreetextQuestion1552 = new BitSet(new long[]{0x0000000148000000L});
        public static final BitSet FOLLOW_ruleDependency_in_ruleFreetextQuestion1573 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleFreetextQuestion1587 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleFreetextAnswer_in_ruleFreetextQuestion1608 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleFreetextQuestion1620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleChoiceQuestion_in_entryRuleSingleChoiceQuestion1656 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleChoiceQuestion1666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleSingleChoiceQuestion1703 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingleChoiceQuestion1724 = new BitSet(new long[]{0x0000000000E00000L});
        public static final BitSet FOLLOW_21_in_ruleSingleChoiceQuestion1742 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_22_in_ruleSingleChoiceQuestion1769 = new BitSet(new long[]{0x0000000148000000L});
        public static final BitSet FOLLOW_ruleDependency_in_ruleSingleChoiceQuestion1790 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleSingleChoiceQuestion1804 = new BitSet(new long[]{0x0000000600000000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleSingleChoiceQuestion1825 = new BitSet(new long[]{0x0000000601000000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleSingleChoiceQuestion1846 = new BitSet(new long[]{0x0000000601000000L});
        public static final BitSet FOLLOW_24_in_ruleSingleChoiceQuestion1859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiChoiceQuestion_in_entryRuleMultiChoiceQuestion1895 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiChoiceQuestion1905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleMultiChoiceQuestion1942 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiChoiceQuestion1963 = new BitSet(new long[]{0x0000000000E00000L});
        public static final BitSet FOLLOW_21_in_ruleMultiChoiceQuestion1981 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_22_in_ruleMultiChoiceQuestion2008 = new BitSet(new long[]{0x0000000148000000L});
        public static final BitSet FOLLOW_ruleDependency_in_ruleMultiChoiceQuestion2029 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleMultiChoiceQuestion2043 = new BitSet(new long[]{0x0000000600000000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleMultiChoiceQuestion2064 = new BitSet(new long[]{0x0000000601000000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleMultiChoiceQuestion2085 = new BitSet(new long[]{0x0000000601000000L});
        public static final BitSet FOLLOW_24_in_ruleMultiChoiceQuestion2098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd2134 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnd2144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleAnd2181 = new BitSet(new long[]{0x0000000148000000L});
        public static final BitSet FOLLOW_ruleDependency_in_ruleAnd2202 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleAnd2214 = new BitSet(new long[]{0x0000000148000000L});
        public static final BitSet FOLLOW_ruleDependency_in_ruleAnd2235 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleAnd2247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOr_in_entryRuleOr2283 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOr2293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleOr2330 = new BitSet(new long[]{0x0000000148000000L});
        public static final BitSet FOLLOW_ruleDependency_in_ruleOr2351 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleOr2363 = new BitSet(new long[]{0x0000000148000000L});
        public static final BitSet FOLLOW_ruleDependency_in_ruleOr2384 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleOr2396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerRef_in_entryRuleAnswerRef2434 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswerRef2444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleAnswerRef2481 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnswerRef2504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoiceAnswer_in_entryRuleChoiceAnswer2540 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleChoiceAnswer2550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleChoiceAnswer2587 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleChoiceAnswer2604 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleChoiceAnswer2621 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoiceAnswer2642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFreetextAnswer_in_entryRuleFreetextAnswer2678 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFreetextAnswer2688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleFreetextAnswer2725 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFreetextAnswer2742 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleFreetextAnswer2759 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFreetextAnswer2780 = new BitSet(new long[]{0x0000000000000002L});
    }


}