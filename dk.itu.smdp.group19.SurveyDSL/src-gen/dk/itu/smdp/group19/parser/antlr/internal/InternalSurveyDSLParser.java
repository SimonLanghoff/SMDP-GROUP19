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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'start survey'", "'pages:'", "'end survey'", "'question page'", "':'", "'questions:'", "'end page'", "'description page'", "'result page'", "'optional'", "'free text question'", "'requires:'", "'answers:'", "'end question'", "'single choice question'", "'multi choice question'", "'or'", "'and'", "'not'", "'('", "')'", "'answer choice'", "'answer text'"
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
                switch ( input.LA(2) ) {
                case 26:
                    {
                    alt3=3;
                    }
                    break;
                case 21:
                    {
                    alt3=1;
                    }
                    break;
                case 25:
                    {
                    alt3=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

                }
                break;
            case 21:
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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:263:1: ruleDependency returns [EObject current=null] : this_CheckOr_0= ruleCheckOr ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        EObject this_CheckOr_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:266:28: (this_CheckOr_0= ruleCheckOr )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:268:5: this_CheckOr_0= ruleCheckOr
            {
             
                    newCompositeNode(grammarAccess.getDependencyAccess().getCheckOrParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleCheckOr_in_ruleDependency594);
            this_CheckOr_0=ruleCheckOr();

            state._fsp--;

             
                    current = this_CheckOr_0; 
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
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleAnswer"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:284:1: entryRuleAnswer returns [EObject current=null] : iv_ruleAnswer= ruleAnswer EOF ;
    public final EObject entryRuleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswer = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:285:2: (iv_ruleAnswer= ruleAnswer EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:286:2: iv_ruleAnswer= ruleAnswer EOF
            {
             newCompositeNode(grammarAccess.getAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_entryRuleAnswer628);
            iv_ruleAnswer=ruleAnswer();

            state._fsp--;

             current =iv_ruleAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswer638); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:293:1: ruleAnswer returns [EObject current=null] : (this_ChoiceAnswer_0= ruleChoiceAnswer | this_FreetextAnswer_1= ruleFreetextAnswer ) ;
    public final EObject ruleAnswer() throws RecognitionException {
        EObject current = null;

        EObject this_ChoiceAnswer_0 = null;

        EObject this_FreetextAnswer_1 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:296:28: ( (this_ChoiceAnswer_0= ruleChoiceAnswer | this_FreetextAnswer_1= ruleFreetextAnswer ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:297:1: (this_ChoiceAnswer_0= ruleChoiceAnswer | this_FreetextAnswer_1= ruleFreetextAnswer )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:297:1: (this_ChoiceAnswer_0= ruleChoiceAnswer | this_FreetextAnswer_1= ruleFreetextAnswer )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==32) ) {
                alt4=1;
            }
            else if ( (LA4_0==33) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:298:5: this_ChoiceAnswer_0= ruleChoiceAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getAnswerAccess().getChoiceAnswerParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleChoiceAnswer_in_ruleAnswer685);
                    this_ChoiceAnswer_0=ruleChoiceAnswer();

                    state._fsp--;

                     
                            current = this_ChoiceAnswer_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:308:5: this_FreetextAnswer_1= ruleFreetextAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getAnswerAccess().getFreetextAnswerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFreetextAnswer_in_ruleAnswer712);
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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:324:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:325:2: (iv_ruleEString= ruleEString EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:326:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString748);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString759); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:333:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:336:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:337:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:337:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:337:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString799); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:345:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString825); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:360:1: entryRuleQuestionPage returns [EObject current=null] : iv_ruleQuestionPage= ruleQuestionPage EOF ;
    public final EObject entryRuleQuestionPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionPage = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:361:2: (iv_ruleQuestionPage= ruleQuestionPage EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:362:2: iv_ruleQuestionPage= ruleQuestionPage EOF
            {
             newCompositeNode(grammarAccess.getQuestionPageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestionPage_in_entryRuleQuestionPage870);
            iv_ruleQuestionPage=ruleQuestionPage();

            state._fsp--;

             current =iv_ruleQuestionPage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestionPage880); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:369:1: ruleQuestionPage returns [EObject current=null] : (otherlv_0= 'question page' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )? otherlv_4= 'questions:' ( (lv_questions_5_0= ruleQuestion ) ) ( (lv_questions_6_0= ruleQuestion ) )* otherlv_7= 'end page' ) ;
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
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:372:28: ( (otherlv_0= 'question page' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )? otherlv_4= 'questions:' ( (lv_questions_5_0= ruleQuestion ) ) ( (lv_questions_6_0= ruleQuestion ) )* otherlv_7= 'end page' ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:373:1: (otherlv_0= 'question page' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )? otherlv_4= 'questions:' ( (lv_questions_5_0= ruleQuestion ) ) ( (lv_questions_6_0= ruleQuestion ) )* otherlv_7= 'end page' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:373:1: (otherlv_0= 'question page' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )? otherlv_4= 'questions:' ( (lv_questions_5_0= ruleQuestion ) ) ( (lv_questions_6_0= ruleQuestion ) )* otherlv_7= 'end page' )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:373:3: otherlv_0= 'question page' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )? otherlv_4= 'questions:' ( (lv_questions_5_0= ruleQuestion ) ) ( (lv_questions_6_0= ruleQuestion ) )* otherlv_7= 'end page'
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleQuestionPage917); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionPageAccess().getQuestionPageKeyword_0());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:377:1: ( (lv_title_1_0= ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:378:1: (lv_title_1_0= ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:378:1: (lv_title_1_0= ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:379:3: lv_title_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getQuestionPageAccess().getTitleEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQuestionPage938);
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

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:395:2: (otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:395:4: otherlv_2= ':' ( (lv_text_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleQuestionPage951); 

                        	newLeafNode(otherlv_2, grammarAccess.getQuestionPageAccess().getColonKeyword_2_0());
                        
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:399:1: ( (lv_text_3_0= ruleEString ) )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:400:1: (lv_text_3_0= ruleEString )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:400:1: (lv_text_3_0= ruleEString )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:401:3: lv_text_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getQuestionPageAccess().getTextEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQuestionPage972);
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

            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleQuestionPage986); 

                	newLeafNode(otherlv_4, grammarAccess.getQuestionPageAccess().getQuestionsKeyword_3());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:421:1: ( (lv_questions_5_0= ruleQuestion ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:422:1: (lv_questions_5_0= ruleQuestion )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:422:1: (lv_questions_5_0= ruleQuestion )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:423:3: lv_questions_5_0= ruleQuestion
            {
             
            	        newCompositeNode(grammarAccess.getQuestionPageAccess().getQuestionsQuestionParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleQuestionPage1007);
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

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:439:2: ( (lv_questions_6_0= ruleQuestion ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=20 && LA7_0<=21)||(LA7_0>=25 && LA7_0<=26)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:440:1: (lv_questions_6_0= ruleQuestion )
            	    {
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:440:1: (lv_questions_6_0= ruleQuestion )
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:441:3: lv_questions_6_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionPageAccess().getQuestionsQuestionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleQuestionPage1028);
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
            	    break loop7;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleQuestionPage1041); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:469:1: entryRuleDescriptionPage returns [EObject current=null] : iv_ruleDescriptionPage= ruleDescriptionPage EOF ;
    public final EObject entryRuleDescriptionPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescriptionPage = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:470:2: (iv_ruleDescriptionPage= ruleDescriptionPage EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:471:2: iv_ruleDescriptionPage= ruleDescriptionPage EOF
            {
             newCompositeNode(grammarAccess.getDescriptionPageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDescriptionPage_in_entryRuleDescriptionPage1077);
            iv_ruleDescriptionPage=ruleDescriptionPage();

            state._fsp--;

             current =iv_ruleDescriptionPage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDescriptionPage1087); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:478:1: ruleDescriptionPage returns [EObject current=null] : (otherlv_0= 'description page' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )? otherlv_4= 'end page' ) ;
    public final EObject ruleDescriptionPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_title_1_0 = null;

        AntlrDatatypeRuleToken lv_text_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:481:28: ( (otherlv_0= 'description page' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )? otherlv_4= 'end page' ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:482:1: (otherlv_0= 'description page' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )? otherlv_4= 'end page' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:482:1: (otherlv_0= 'description page' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )? otherlv_4= 'end page' )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:482:3: otherlv_0= 'description page' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )? otherlv_4= 'end page'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDescriptionPage1124); 

                	newLeafNode(otherlv_0, grammarAccess.getDescriptionPageAccess().getDescriptionPageKeyword_0());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:486:1: ( (lv_title_1_0= ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:487:1: (lv_title_1_0= ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:487:1: (lv_title_1_0= ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:488:3: lv_title_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDescriptionPageAccess().getTitleEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDescriptionPage1145);
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

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:504:2: (otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:504:4: otherlv_2= ':' ( (lv_text_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDescriptionPage1158); 

                        	newLeafNode(otherlv_2, grammarAccess.getDescriptionPageAccess().getColonKeyword_2_0());
                        
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:508:1: ( (lv_text_3_0= ruleEString ) )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:509:1: (lv_text_3_0= ruleEString )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:509:1: (lv_text_3_0= ruleEString )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:510:3: lv_text_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getDescriptionPageAccess().getTextEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDescriptionPage1179);
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

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDescriptionPage1193); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:538:1: entryRuleResultPage returns [EObject current=null] : iv_ruleResultPage= ruleResultPage EOF ;
    public final EObject entryRuleResultPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultPage = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:539:2: (iv_ruleResultPage= ruleResultPage EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:540:2: iv_ruleResultPage= ruleResultPage EOF
            {
             newCompositeNode(grammarAccess.getResultPageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleResultPage_in_entryRuleResultPage1229);
            iv_ruleResultPage=ruleResultPage();

            state._fsp--;

             current =iv_ruleResultPage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleResultPage1239); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:547:1: ruleResultPage returns [EObject current=null] : (otherlv_0= 'result page' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )? otherlv_4= 'end page' ) ;
    public final EObject ruleResultPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_title_1_0 = null;

        AntlrDatatypeRuleToken lv_text_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:550:28: ( (otherlv_0= 'result page' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )? otherlv_4= 'end page' ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:551:1: (otherlv_0= 'result page' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )? otherlv_4= 'end page' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:551:1: (otherlv_0= 'result page' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )? otherlv_4= 'end page' )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:551:3: otherlv_0= 'result page' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )? otherlv_4= 'end page'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleResultPage1276); 

                	newLeafNode(otherlv_0, grammarAccess.getResultPageAccess().getResultPageKeyword_0());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:555:1: ( (lv_title_1_0= ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:556:1: (lv_title_1_0= ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:556:1: (lv_title_1_0= ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:557:3: lv_title_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getResultPageAccess().getTitleEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleResultPage1297);
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

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:573:2: (otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:573:4: otherlv_2= ':' ( (lv_text_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleResultPage1310); 

                        	newLeafNode(otherlv_2, grammarAccess.getResultPageAccess().getColonKeyword_2_0());
                        
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:577:1: ( (lv_text_3_0= ruleEString ) )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:578:1: (lv_text_3_0= ruleEString )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:578:1: (lv_text_3_0= ruleEString )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:579:3: lv_text_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getResultPageAccess().getTextEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleResultPage1331);
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

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleResultPage1345); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:609:1: entryRuleFreetextQuestion returns [EObject current=null] : iv_ruleFreetextQuestion= ruleFreetextQuestion EOF ;
    public final EObject entryRuleFreetextQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFreetextQuestion = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:610:2: (iv_ruleFreetextQuestion= ruleFreetextQuestion EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:611:2: iv_ruleFreetextQuestion= ruleFreetextQuestion EOF
            {
             newCompositeNode(grammarAccess.getFreetextQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFreetextQuestion_in_entryRuleFreetextQuestion1383);
            iv_ruleFreetextQuestion=ruleFreetextQuestion();

            state._fsp--;

             current =iv_ruleFreetextQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFreetextQuestion1393); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:618:1: ruleFreetextQuestion returns [EObject current=null] : ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'free text question' ( (lv_text_2_0= ruleEString ) ) (otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) ) )? otherlv_5= 'answers:' ( (lv_answers_6_0= ruleFreetextAnswer ) ) otherlv_7= 'end question' ) ;
    public final EObject ruleFreetextQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_optional_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_text_2_0 = null;

        EObject lv_requires_4_0 = null;

        EObject lv_answers_6_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:621:28: ( ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'free text question' ( (lv_text_2_0= ruleEString ) ) (otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) ) )? otherlv_5= 'answers:' ( (lv_answers_6_0= ruleFreetextAnswer ) ) otherlv_7= 'end question' ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:622:1: ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'free text question' ( (lv_text_2_0= ruleEString ) ) (otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) ) )? otherlv_5= 'answers:' ( (lv_answers_6_0= ruleFreetextAnswer ) ) otherlv_7= 'end question' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:622:1: ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'free text question' ( (lv_text_2_0= ruleEString ) ) (otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) ) )? otherlv_5= 'answers:' ( (lv_answers_6_0= ruleFreetextAnswer ) ) otherlv_7= 'end question' )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:622:2: ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'free text question' ( (lv_text_2_0= ruleEString ) ) (otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) ) )? otherlv_5= 'answers:' ( (lv_answers_6_0= ruleFreetextAnswer ) ) otherlv_7= 'end question'
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:622:2: ( (lv_optional_0_0= 'optional' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:623:1: (lv_optional_0_0= 'optional' )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:623:1: (lv_optional_0_0= 'optional' )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:624:3: lv_optional_0_0= 'optional'
                    {
                    lv_optional_0_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleFreetextQuestion1436); 

                            newLeafNode(lv_optional_0_0, grammarAccess.getFreetextQuestionAccess().getOptionalOptionalKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFreetextQuestionRule());
                    	        }
                           		setWithLastConsumed(current, "optional", true, "optional");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleFreetextQuestion1462); 

                	newLeafNode(otherlv_1, grammarAccess.getFreetextQuestionAccess().getFreeTextQuestionKeyword_1());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:641:1: ( (lv_text_2_0= ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:642:1: (lv_text_2_0= ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:642:1: (lv_text_2_0= ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:643:3: lv_text_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFreetextQuestionAccess().getTextEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFreetextQuestion1483);
            lv_text_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFreetextQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"text",
                    		lv_text_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:659:2: (otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:659:4: otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) )
                    {
                    otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleFreetextQuestion1496); 

                        	newLeafNode(otherlv_3, grammarAccess.getFreetextQuestionAccess().getRequiresKeyword_3_0());
                        
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:663:1: ( (lv_requires_4_0= ruleDependency ) )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:664:1: (lv_requires_4_0= ruleDependency )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:664:1: (lv_requires_4_0= ruleDependency )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:665:3: lv_requires_4_0= ruleDependency
                    {
                     
                    	        newCompositeNode(grammarAccess.getFreetextQuestionAccess().getRequiresDependencyParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDependency_in_ruleFreetextQuestion1517);
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

            otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleFreetextQuestion1531); 

                	newLeafNode(otherlv_5, grammarAccess.getFreetextQuestionAccess().getAnswersKeyword_4());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:685:1: ( (lv_answers_6_0= ruleFreetextAnswer ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:686:1: (lv_answers_6_0= ruleFreetextAnswer )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:686:1: (lv_answers_6_0= ruleFreetextAnswer )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:687:3: lv_answers_6_0= ruleFreetextAnswer
            {
             
            	        newCompositeNode(grammarAccess.getFreetextQuestionAccess().getAnswersFreetextAnswerParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFreetextAnswer_in_ruleFreetextQuestion1552);
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

            otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleFreetextQuestion1564); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:715:1: entryRuleSingleChoiceQuestion returns [EObject current=null] : iv_ruleSingleChoiceQuestion= ruleSingleChoiceQuestion EOF ;
    public final EObject entryRuleSingleChoiceQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleChoiceQuestion = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:716:2: (iv_ruleSingleChoiceQuestion= ruleSingleChoiceQuestion EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:717:2: iv_ruleSingleChoiceQuestion= ruleSingleChoiceQuestion EOF
            {
             newCompositeNode(grammarAccess.getSingleChoiceQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleChoiceQuestion_in_entryRuleSingleChoiceQuestion1600);
            iv_ruleSingleChoiceQuestion=ruleSingleChoiceQuestion();

            state._fsp--;

             current =iv_ruleSingleChoiceQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleChoiceQuestion1610); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:724:1: ruleSingleChoiceQuestion returns [EObject current=null] : ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'single choice question' ( (lv_text_2_0= ruleEString ) ) (otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) ) )? otherlv_5= 'answers:' ( (lv_answers_6_0= ruleAnswer ) ) ( (lv_answers_7_0= ruleAnswer ) )* otherlv_8= 'end question' ) ;
    public final EObject ruleSingleChoiceQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_optional_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_text_2_0 = null;

        EObject lv_requires_4_0 = null;

        EObject lv_answers_6_0 = null;

        EObject lv_answers_7_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:727:28: ( ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'single choice question' ( (lv_text_2_0= ruleEString ) ) (otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) ) )? otherlv_5= 'answers:' ( (lv_answers_6_0= ruleAnswer ) ) ( (lv_answers_7_0= ruleAnswer ) )* otherlv_8= 'end question' ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:728:1: ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'single choice question' ( (lv_text_2_0= ruleEString ) ) (otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) ) )? otherlv_5= 'answers:' ( (lv_answers_6_0= ruleAnswer ) ) ( (lv_answers_7_0= ruleAnswer ) )* otherlv_8= 'end question' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:728:1: ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'single choice question' ( (lv_text_2_0= ruleEString ) ) (otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) ) )? otherlv_5= 'answers:' ( (lv_answers_6_0= ruleAnswer ) ) ( (lv_answers_7_0= ruleAnswer ) )* otherlv_8= 'end question' )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:728:2: ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'single choice question' ( (lv_text_2_0= ruleEString ) ) (otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) ) )? otherlv_5= 'answers:' ( (lv_answers_6_0= ruleAnswer ) ) ( (lv_answers_7_0= ruleAnswer ) )* otherlv_8= 'end question'
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:728:2: ( (lv_optional_0_0= 'optional' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:729:1: (lv_optional_0_0= 'optional' )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:729:1: (lv_optional_0_0= 'optional' )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:730:3: lv_optional_0_0= 'optional'
                    {
                    lv_optional_0_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSingleChoiceQuestion1653); 

                            newLeafNode(lv_optional_0_0, grammarAccess.getSingleChoiceQuestionAccess().getOptionalOptionalKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSingleChoiceQuestionRule());
                    	        }
                           		setWithLastConsumed(current, "optional", true, "optional");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleSingleChoiceQuestion1679); 

                	newLeafNode(otherlv_1, grammarAccess.getSingleChoiceQuestionAccess().getSingleChoiceQuestionKeyword_1());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:747:1: ( (lv_text_2_0= ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:748:1: (lv_text_2_0= ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:748:1: (lv_text_2_0= ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:749:3: lv_text_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSingleChoiceQuestionAccess().getTextEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingleChoiceQuestion1700);
            lv_text_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSingleChoiceQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"text",
                    		lv_text_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:765:2: (otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:765:4: otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) )
                    {
                    otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSingleChoiceQuestion1713); 

                        	newLeafNode(otherlv_3, grammarAccess.getSingleChoiceQuestionAccess().getRequiresKeyword_3_0());
                        
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:769:1: ( (lv_requires_4_0= ruleDependency ) )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:770:1: (lv_requires_4_0= ruleDependency )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:770:1: (lv_requires_4_0= ruleDependency )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:771:3: lv_requires_4_0= ruleDependency
                    {
                     
                    	        newCompositeNode(grammarAccess.getSingleChoiceQuestionAccess().getRequiresDependencyParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDependency_in_ruleSingleChoiceQuestion1734);
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

            otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSingleChoiceQuestion1748); 

                	newLeafNode(otherlv_5, grammarAccess.getSingleChoiceQuestionAccess().getAnswersKeyword_4());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:791:1: ( (lv_answers_6_0= ruleAnswer ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:792:1: (lv_answers_6_0= ruleAnswer )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:792:1: (lv_answers_6_0= ruleAnswer )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:793:3: lv_answers_6_0= ruleAnswer
            {
             
            	        newCompositeNode(grammarAccess.getSingleChoiceQuestionAccess().getAnswersAnswerParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleSingleChoiceQuestion1769);
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

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:809:2: ( (lv_answers_7_0= ruleAnswer ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=32 && LA14_0<=33)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:810:1: (lv_answers_7_0= ruleAnswer )
            	    {
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:810:1: (lv_answers_7_0= ruleAnswer )
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:811:3: lv_answers_7_0= ruleAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleChoiceQuestionAccess().getAnswersAnswerParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleSingleChoiceQuestion1790);
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
            	    break loop14;
                }
            } while (true);

            otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSingleChoiceQuestion1803); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:839:1: entryRuleMultiChoiceQuestion returns [EObject current=null] : iv_ruleMultiChoiceQuestion= ruleMultiChoiceQuestion EOF ;
    public final EObject entryRuleMultiChoiceQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiChoiceQuestion = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:840:2: (iv_ruleMultiChoiceQuestion= ruleMultiChoiceQuestion EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:841:2: iv_ruleMultiChoiceQuestion= ruleMultiChoiceQuestion EOF
            {
             newCompositeNode(grammarAccess.getMultiChoiceQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiChoiceQuestion_in_entryRuleMultiChoiceQuestion1839);
            iv_ruleMultiChoiceQuestion=ruleMultiChoiceQuestion();

            state._fsp--;

             current =iv_ruleMultiChoiceQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiChoiceQuestion1849); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:848:1: ruleMultiChoiceQuestion returns [EObject current=null] : ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'multi choice question' ( (lv_text_2_0= ruleEString ) ) (otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) ) )? otherlv_5= 'answers:' ( (lv_answers_6_0= ruleAnswer ) ) ( (lv_answers_7_0= ruleAnswer ) )* otherlv_8= 'end question' ) ;
    public final EObject ruleMultiChoiceQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_optional_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_text_2_0 = null;

        EObject lv_requires_4_0 = null;

        EObject lv_answers_6_0 = null;

        EObject lv_answers_7_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:851:28: ( ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'multi choice question' ( (lv_text_2_0= ruleEString ) ) (otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) ) )? otherlv_5= 'answers:' ( (lv_answers_6_0= ruleAnswer ) ) ( (lv_answers_7_0= ruleAnswer ) )* otherlv_8= 'end question' ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:852:1: ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'multi choice question' ( (lv_text_2_0= ruleEString ) ) (otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) ) )? otherlv_5= 'answers:' ( (lv_answers_6_0= ruleAnswer ) ) ( (lv_answers_7_0= ruleAnswer ) )* otherlv_8= 'end question' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:852:1: ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'multi choice question' ( (lv_text_2_0= ruleEString ) ) (otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) ) )? otherlv_5= 'answers:' ( (lv_answers_6_0= ruleAnswer ) ) ( (lv_answers_7_0= ruleAnswer ) )* otherlv_8= 'end question' )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:852:2: ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'multi choice question' ( (lv_text_2_0= ruleEString ) ) (otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) ) )? otherlv_5= 'answers:' ( (lv_answers_6_0= ruleAnswer ) ) ( (lv_answers_7_0= ruleAnswer ) )* otherlv_8= 'end question'
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:852:2: ( (lv_optional_0_0= 'optional' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:853:1: (lv_optional_0_0= 'optional' )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:853:1: (lv_optional_0_0= 'optional' )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:854:3: lv_optional_0_0= 'optional'
                    {
                    lv_optional_0_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMultiChoiceQuestion1892); 

                            newLeafNode(lv_optional_0_0, grammarAccess.getMultiChoiceQuestionAccess().getOptionalOptionalKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiChoiceQuestionRule());
                    	        }
                           		setWithLastConsumed(current, "optional", true, "optional");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMultiChoiceQuestion1918); 

                	newLeafNode(otherlv_1, grammarAccess.getMultiChoiceQuestionAccess().getMultiChoiceQuestionKeyword_1());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:871:1: ( (lv_text_2_0= ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:872:1: (lv_text_2_0= ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:872:1: (lv_text_2_0= ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:873:3: lv_text_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMultiChoiceQuestionAccess().getTextEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiChoiceQuestion1939);
            lv_text_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultiChoiceQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"text",
                    		lv_text_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:889:2: (otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:889:4: otherlv_3= 'requires:' ( (lv_requires_4_0= ruleDependency ) )
                    {
                    otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMultiChoiceQuestion1952); 

                        	newLeafNode(otherlv_3, grammarAccess.getMultiChoiceQuestionAccess().getRequiresKeyword_3_0());
                        
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:893:1: ( (lv_requires_4_0= ruleDependency ) )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:894:1: (lv_requires_4_0= ruleDependency )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:894:1: (lv_requires_4_0= ruleDependency )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:895:3: lv_requires_4_0= ruleDependency
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultiChoiceQuestionAccess().getRequiresDependencyParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDependency_in_ruleMultiChoiceQuestion1973);
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

            otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMultiChoiceQuestion1987); 

                	newLeafNode(otherlv_5, grammarAccess.getMultiChoiceQuestionAccess().getAnswersKeyword_4());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:915:1: ( (lv_answers_6_0= ruleAnswer ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:916:1: (lv_answers_6_0= ruleAnswer )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:916:1: (lv_answers_6_0= ruleAnswer )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:917:3: lv_answers_6_0= ruleAnswer
            {
             
            	        newCompositeNode(grammarAccess.getMultiChoiceQuestionAccess().getAnswersAnswerParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleMultiChoiceQuestion2008);
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

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:933:2: ( (lv_answers_7_0= ruleAnswer ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=32 && LA17_0<=33)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:934:1: (lv_answers_7_0= ruleAnswer )
            	    {
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:934:1: (lv_answers_7_0= ruleAnswer )
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:935:3: lv_answers_7_0= ruleAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiChoiceQuestionAccess().getAnswersAnswerParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleMultiChoiceQuestion2029);
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
            	    break loop17;
                }
            } while (true);

            otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMultiChoiceQuestion2042); 

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


    // $ANTLR start "entryRuleCheckOr"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:963:1: entryRuleCheckOr returns [EObject current=null] : iv_ruleCheckOr= ruleCheckOr EOF ;
    public final EObject entryRuleCheckOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckOr = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:964:2: (iv_ruleCheckOr= ruleCheckOr EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:965:2: iv_ruleCheckOr= ruleCheckOr EOF
            {
             newCompositeNode(grammarAccess.getCheckOrRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCheckOr_in_entryRuleCheckOr2078);
            iv_ruleCheckOr=ruleCheckOr();

            state._fsp--;

             current =iv_ruleCheckOr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCheckOr2088); 

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
    // $ANTLR end "entryRuleCheckOr"


    // $ANTLR start "ruleCheckOr"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:972:1: ruleCheckOr returns [EObject current=null] : (this_CheckAnd_0= ruleCheckAnd ( () otherlv_2= 'or' ( (lv_rhs_3_0= ruleCheckAnd ) ) )* ) ;
    public final EObject ruleCheckOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_CheckAnd_0 = null;

        EObject lv_rhs_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:975:28: ( (this_CheckAnd_0= ruleCheckAnd ( () otherlv_2= 'or' ( (lv_rhs_3_0= ruleCheckAnd ) ) )* ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:976:1: (this_CheckAnd_0= ruleCheckAnd ( () otherlv_2= 'or' ( (lv_rhs_3_0= ruleCheckAnd ) ) )* )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:976:1: (this_CheckAnd_0= ruleCheckAnd ( () otherlv_2= 'or' ( (lv_rhs_3_0= ruleCheckAnd ) ) )* )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:977:5: this_CheckAnd_0= ruleCheckAnd ( () otherlv_2= 'or' ( (lv_rhs_3_0= ruleCheckAnd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getCheckOrAccess().getCheckAndParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleCheckAnd_in_ruleCheckOr2135);
            this_CheckAnd_0=ruleCheckAnd();

            state._fsp--;

             
                    current = this_CheckAnd_0; 
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:985:1: ( () otherlv_2= 'or' ( (lv_rhs_3_0= ruleCheckAnd ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==27) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:985:2: () otherlv_2= 'or' ( (lv_rhs_3_0= ruleCheckAnd ) )
            	    {
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:985:2: ()
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:986:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getCheckOrAccess().getOrLhsAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleCheckOr2156); 

            	        	newLeafNode(otherlv_2, grammarAccess.getCheckOrAccess().getOrKeyword_1_1());
            	        
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:995:1: ( (lv_rhs_3_0= ruleCheckAnd ) )
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:996:1: (lv_rhs_3_0= ruleCheckAnd )
            	    {
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:996:1: (lv_rhs_3_0= ruleCheckAnd )
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:997:3: lv_rhs_3_0= ruleCheckAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCheckOrAccess().getRhsCheckAndParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCheckAnd_in_ruleCheckOr2177);
            	    lv_rhs_3_0=ruleCheckAnd();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCheckOrRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rhs",
            	            		lv_rhs_3_0, 
            	            		"CheckAnd");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


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
    // $ANTLR end "ruleCheckOr"


    // $ANTLR start "entryRuleCheckAnd"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1021:1: entryRuleCheckAnd returns [EObject current=null] : iv_ruleCheckAnd= ruleCheckAnd EOF ;
    public final EObject entryRuleCheckAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckAnd = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1022:2: (iv_ruleCheckAnd= ruleCheckAnd EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1023:2: iv_ruleCheckAnd= ruleCheckAnd EOF
            {
             newCompositeNode(grammarAccess.getCheckAndRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCheckAnd_in_entryRuleCheckAnd2215);
            iv_ruleCheckAnd=ruleCheckAnd();

            state._fsp--;

             current =iv_ruleCheckAnd; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCheckAnd2225); 

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
    // $ANTLR end "entryRuleCheckAnd"


    // $ANTLR start "ruleCheckAnd"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1030:1: ruleCheckAnd returns [EObject current=null] : (this_CheckNot_0= ruleCheckNot ( () otherlv_2= 'and' ( (lv_rhs_3_0= ruleCheckNot ) ) )* ) ;
    public final EObject ruleCheckAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_CheckNot_0 = null;

        EObject lv_rhs_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1033:28: ( (this_CheckNot_0= ruleCheckNot ( () otherlv_2= 'and' ( (lv_rhs_3_0= ruleCheckNot ) ) )* ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1034:1: (this_CheckNot_0= ruleCheckNot ( () otherlv_2= 'and' ( (lv_rhs_3_0= ruleCheckNot ) ) )* )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1034:1: (this_CheckNot_0= ruleCheckNot ( () otherlv_2= 'and' ( (lv_rhs_3_0= ruleCheckNot ) ) )* )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1035:5: this_CheckNot_0= ruleCheckNot ( () otherlv_2= 'and' ( (lv_rhs_3_0= ruleCheckNot ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getCheckAndAccess().getCheckNotParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleCheckNot_in_ruleCheckAnd2272);
            this_CheckNot_0=ruleCheckNot();

            state._fsp--;

             
                    current = this_CheckNot_0; 
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1043:1: ( () otherlv_2= 'and' ( (lv_rhs_3_0= ruleCheckNot ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==28) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1043:2: () otherlv_2= 'and' ( (lv_rhs_3_0= ruleCheckNot ) )
            	    {
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1043:2: ()
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1044:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getCheckAndAccess().getAndLhsAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleCheckAnd2293); 

            	        	newLeafNode(otherlv_2, grammarAccess.getCheckAndAccess().getAndKeyword_1_1());
            	        
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1053:1: ( (lv_rhs_3_0= ruleCheckNot ) )
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1054:1: (lv_rhs_3_0= ruleCheckNot )
            	    {
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1054:1: (lv_rhs_3_0= ruleCheckNot )
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1055:3: lv_rhs_3_0= ruleCheckNot
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCheckAndAccess().getRhsCheckNotParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCheckNot_in_ruleCheckAnd2314);
            	    lv_rhs_3_0=ruleCheckNot();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCheckAndRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rhs",
            	            		lv_rhs_3_0, 
            	            		"CheckNot");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


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
    // $ANTLR end "ruleCheckAnd"


    // $ANTLR start "entryRuleCheckNot"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1079:1: entryRuleCheckNot returns [EObject current=null] : iv_ruleCheckNot= ruleCheckNot EOF ;
    public final EObject entryRuleCheckNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckNot = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1080:2: (iv_ruleCheckNot= ruleCheckNot EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1081:2: iv_ruleCheckNot= ruleCheckNot EOF
            {
             newCompositeNode(grammarAccess.getCheckNotRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCheckNot_in_entryRuleCheckNot2352);
            iv_ruleCheckNot=ruleCheckNot();

            state._fsp--;

             current =iv_ruleCheckNot; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCheckNot2362); 

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
    // $ANTLR end "entryRuleCheckNot"


    // $ANTLR start "ruleCheckNot"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1088:1: ruleCheckNot returns [EObject current=null] : ( (otherlv_0= 'not' this_Bottom_1= ruleBottom () ) | this_Bottom_3= ruleBottom ) ;
    public final EObject ruleCheckNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Bottom_1 = null;

        EObject this_Bottom_3 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1091:28: ( ( (otherlv_0= 'not' this_Bottom_1= ruleBottom () ) | this_Bottom_3= ruleBottom ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1092:1: ( (otherlv_0= 'not' this_Bottom_1= ruleBottom () ) | this_Bottom_3= ruleBottom )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1092:1: ( (otherlv_0= 'not' this_Bottom_1= ruleBottom () ) | this_Bottom_3= ruleBottom )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)||LA20_0==30) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1092:2: (otherlv_0= 'not' this_Bottom_1= ruleBottom () )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1092:2: (otherlv_0= 'not' this_Bottom_1= ruleBottom () )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1092:4: otherlv_0= 'not' this_Bottom_1= ruleBottom ()
                    {
                    otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleCheckNot2400); 

                        	newLeafNode(otherlv_0, grammarAccess.getCheckNotAccess().getNotKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getCheckNotAccess().getBottomParserRuleCall_0_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBottom_in_ruleCheckNot2422);
                    this_Bottom_1=ruleBottom();

                    state._fsp--;

                     
                            current = this_Bottom_1; 
                            afterParserOrEnumRuleCall();
                        
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1105:1: ()
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1106:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getCheckNotAccess().getNotDependencyAction_0_2(),
                                current);
                        

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1113:5: this_Bottom_3= ruleBottom
                    {
                     
                            newCompositeNode(grammarAccess.getCheckNotAccess().getBottomParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBottom_in_ruleCheckNot2459);
                    this_Bottom_3=ruleBottom();

                    state._fsp--;

                     
                            current = this_Bottom_3; 
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
    // $ANTLR end "ruleCheckNot"


    // $ANTLR start "entryRuleBottom"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1129:1: entryRuleBottom returns [EObject current=null] : iv_ruleBottom= ruleBottom EOF ;
    public final EObject entryRuleBottom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBottom = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1130:2: (iv_ruleBottom= ruleBottom EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1131:2: iv_ruleBottom= ruleBottom EOF
            {
             newCompositeNode(grammarAccess.getBottomRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBottom_in_entryRuleBottom2494);
            iv_ruleBottom=ruleBottom();

            state._fsp--;

             current =iv_ruleBottom; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBottom2504); 

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
    // $ANTLR end "entryRuleBottom"


    // $ANTLR start "ruleBottom"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1138:1: ruleBottom returns [EObject current=null] : (this_AnswerRef_0= ruleAnswerRef | (otherlv_1= '(' this_Dependency_2= ruleDependency otherlv_3= ')' ) ) ;
    public final EObject ruleBottom() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_AnswerRef_0 = null;

        EObject this_Dependency_2 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1141:28: ( (this_AnswerRef_0= ruleAnswerRef | (otherlv_1= '(' this_Dependency_2= ruleDependency otherlv_3= ')' ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1142:1: (this_AnswerRef_0= ruleAnswerRef | (otherlv_1= '(' this_Dependency_2= ruleDependency otherlv_3= ')' ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1142:1: (this_AnswerRef_0= ruleAnswerRef | (otherlv_1= '(' this_Dependency_2= ruleDependency otherlv_3= ')' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_ID)) ) {
                alt21=1;
            }
            else if ( (LA21_0==30) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1143:5: this_AnswerRef_0= ruleAnswerRef
                    {
                     
                            newCompositeNode(grammarAccess.getBottomAccess().getAnswerRefParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnswerRef_in_ruleBottom2551);
                    this_AnswerRef_0=ruleAnswerRef();

                    state._fsp--;

                     
                            current = this_AnswerRef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1152:6: (otherlv_1= '(' this_Dependency_2= ruleDependency otherlv_3= ')' )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1152:6: (otherlv_1= '(' this_Dependency_2= ruleDependency otherlv_3= ')' )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1152:8: otherlv_1= '(' this_Dependency_2= ruleDependency otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleBottom2569); 

                        	newLeafNode(otherlv_1, grammarAccess.getBottomAccess().getLeftParenthesisKeyword_1_0());
                        
                     
                            newCompositeNode(grammarAccess.getBottomAccess().getDependencyParserRuleCall_1_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDependency_in_ruleBottom2591);
                    this_Dependency_2=ruleDependency();

                    state._fsp--;

                     
                            current = this_Dependency_2; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleBottom2602); 

                        	newLeafNode(otherlv_3, grammarAccess.getBottomAccess().getRightParenthesisKeyword_1_2());
                        

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
    // $ANTLR end "ruleBottom"


    // $ANTLR start "entryRuleAnswerRef"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1177:1: entryRuleAnswerRef returns [EObject current=null] : iv_ruleAnswerRef= ruleAnswerRef EOF ;
    public final EObject entryRuleAnswerRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswerRef = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1178:2: (iv_ruleAnswerRef= ruleAnswerRef EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1179:2: iv_ruleAnswerRef= ruleAnswerRef EOF
            {
             newCompositeNode(grammarAccess.getAnswerRefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswerRef_in_entryRuleAnswerRef2639);
            iv_ruleAnswerRef=ruleAnswerRef();

            state._fsp--;

             current =iv_ruleAnswerRef; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswerRef2649); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1186:1: ruleAnswerRef returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleAnswerRef() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1189:28: ( ( ( ruleEString ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1190:1: ( ( ruleEString ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1190:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1191:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1191:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1192:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAnswerRefRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAnswerRefAccess().getRefersAnswerCrossReference_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnswerRef2696);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1213:1: entryRuleChoiceAnswer returns [EObject current=null] : iv_ruleChoiceAnswer= ruleChoiceAnswer EOF ;
    public final EObject entryRuleChoiceAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoiceAnswer = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1214:2: (iv_ruleChoiceAnswer= ruleChoiceAnswer EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1215:2: iv_ruleChoiceAnswer= ruleChoiceAnswer EOF
            {
             newCompositeNode(grammarAccess.getChoiceAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleChoiceAnswer_in_entryRuleChoiceAnswer2731);
            iv_ruleChoiceAnswer=ruleChoiceAnswer();

            state._fsp--;

             current =iv_ruleChoiceAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleChoiceAnswer2741); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1222:1: ruleChoiceAnswer returns [EObject current=null] : (otherlv_0= 'answer choice' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) ) ;
    public final EObject ruleChoiceAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_text_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1225:28: ( (otherlv_0= 'answer choice' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1226:1: (otherlv_0= 'answer choice' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1226:1: (otherlv_0= 'answer choice' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1226:3: otherlv_0= 'answer choice' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_text_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleChoiceAnswer2778); 

                	newLeafNode(otherlv_0, grammarAccess.getChoiceAnswerAccess().getAnswerChoiceKeyword_0());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1230:1: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1231:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1231:1: (lv_name_1_0= RULE_ID )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1232:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleChoiceAnswer2795); 

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

            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleChoiceAnswer2812); 

                	newLeafNode(otherlv_2, grammarAccess.getChoiceAnswerAccess().getColonKeyword_2());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1252:1: ( (lv_text_3_0= ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1253:1: (lv_text_3_0= ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1253:1: (lv_text_3_0= ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1254:3: lv_text_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getChoiceAnswerAccess().getTextEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoiceAnswer2833);
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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1278:1: entryRuleFreetextAnswer returns [EObject current=null] : iv_ruleFreetextAnswer= ruleFreetextAnswer EOF ;
    public final EObject entryRuleFreetextAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFreetextAnswer = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1279:2: (iv_ruleFreetextAnswer= ruleFreetextAnswer EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1280:2: iv_ruleFreetextAnswer= ruleFreetextAnswer EOF
            {
             newCompositeNode(grammarAccess.getFreetextAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFreetextAnswer_in_entryRuleFreetextAnswer2869);
            iv_ruleFreetextAnswer=ruleFreetextAnswer();

            state._fsp--;

             current =iv_ruleFreetextAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFreetextAnswer2879); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1287:1: ruleFreetextAnswer returns [EObject current=null] : (otherlv_0= 'answer text' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) ) ;
    public final EObject ruleFreetextAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_text_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1290:28: ( (otherlv_0= 'answer text' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1291:1: (otherlv_0= 'answer text' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1291:1: (otherlv_0= 'answer text' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_text_3_0= ruleEString ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1291:3: otherlv_0= 'answer text' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_text_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleFreetextAnswer2916); 

                	newLeafNode(otherlv_0, grammarAccess.getFreetextAnswerAccess().getAnswerTextKeyword_0());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1295:1: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1296:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1296:1: (lv_name_1_0= RULE_ID )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1297:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFreetextAnswer2933); 

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

            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFreetextAnswer2950); 

                	newLeafNode(otherlv_2, grammarAccess.getFreetextAnswerAccess().getColonKeyword_2());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1317:1: ( (lv_text_3_0= ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1318:1: (lv_text_3_0= ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1318:1: (lv_text_3_0= ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1319:3: lv_text_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFreetextAnswerAccess().getTextEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFreetextAnswer2971);
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
        public static final BitSet FOLLOW_ruleCheckOr_in_ruleDependency594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer628 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswer638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoiceAnswer_in_ruleAnswer685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFreetextAnswer_in_ruleAnswer712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString748 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestionPage_in_entryRuleQuestionPage870 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestionPage880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleQuestionPage917 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQuestionPage938 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleQuestionPage951 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQuestionPage972 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleQuestionPage986 = new BitSet(new long[]{0x0000000006300000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleQuestionPage1007 = new BitSet(new long[]{0x0000000006320000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleQuestionPage1028 = new BitSet(new long[]{0x0000000006320000L});
        public static final BitSet FOLLOW_17_in_ruleQuestionPage1041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDescriptionPage_in_entryRuleDescriptionPage1077 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDescriptionPage1087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleDescriptionPage1124 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDescriptionPage1145 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_15_in_ruleDescriptionPage1158 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDescriptionPage1179 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleDescriptionPage1193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResultPage_in_entryRuleResultPage1229 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleResultPage1239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleResultPage1276 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleResultPage1297 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_15_in_ruleResultPage1310 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleResultPage1331 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleResultPage1345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFreetextQuestion_in_entryRuleFreetextQuestion1383 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFreetextQuestion1393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleFreetextQuestion1436 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleFreetextQuestion1462 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFreetextQuestion1483 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_22_in_ruleFreetextQuestion1496 = new BitSet(new long[]{0x0000000060000030L});
        public static final BitSet FOLLOW_ruleDependency_in_ruleFreetextQuestion1517 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleFreetextQuestion1531 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_ruleFreetextAnswer_in_ruleFreetextQuestion1552 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleFreetextQuestion1564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleChoiceQuestion_in_entryRuleSingleChoiceQuestion1600 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleChoiceQuestion1610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleSingleChoiceQuestion1653 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleSingleChoiceQuestion1679 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingleChoiceQuestion1700 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_22_in_ruleSingleChoiceQuestion1713 = new BitSet(new long[]{0x0000000060000030L});
        public static final BitSet FOLLOW_ruleDependency_in_ruleSingleChoiceQuestion1734 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleSingleChoiceQuestion1748 = new BitSet(new long[]{0x0000000300000000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleSingleChoiceQuestion1769 = new BitSet(new long[]{0x0000000301000000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleSingleChoiceQuestion1790 = new BitSet(new long[]{0x0000000301000000L});
        public static final BitSet FOLLOW_24_in_ruleSingleChoiceQuestion1803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiChoiceQuestion_in_entryRuleMultiChoiceQuestion1839 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiChoiceQuestion1849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleMultiChoiceQuestion1892 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleMultiChoiceQuestion1918 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiChoiceQuestion1939 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_22_in_ruleMultiChoiceQuestion1952 = new BitSet(new long[]{0x0000000060000030L});
        public static final BitSet FOLLOW_ruleDependency_in_ruleMultiChoiceQuestion1973 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleMultiChoiceQuestion1987 = new BitSet(new long[]{0x0000000300000000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleMultiChoiceQuestion2008 = new BitSet(new long[]{0x0000000301000000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleMultiChoiceQuestion2029 = new BitSet(new long[]{0x0000000301000000L});
        public static final BitSet FOLLOW_24_in_ruleMultiChoiceQuestion2042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCheckOr_in_entryRuleCheckOr2078 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCheckOr2088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCheckAnd_in_ruleCheckOr2135 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_27_in_ruleCheckOr2156 = new BitSet(new long[]{0x0000000060000030L});
        public static final BitSet FOLLOW_ruleCheckAnd_in_ruleCheckOr2177 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_ruleCheckAnd_in_entryRuleCheckAnd2215 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCheckAnd2225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCheckNot_in_ruleCheckAnd2272 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleCheckAnd2293 = new BitSet(new long[]{0x0000000060000030L});
        public static final BitSet FOLLOW_ruleCheckNot_in_ruleCheckAnd2314 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_ruleCheckNot_in_entryRuleCheckNot2352 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCheckNot2362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleCheckNot2400 = new BitSet(new long[]{0x0000000060000030L});
        public static final BitSet FOLLOW_ruleBottom_in_ruleCheckNot2422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBottom_in_ruleCheckNot2459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBottom_in_entryRuleBottom2494 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBottom2504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerRef_in_ruleBottom2551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleBottom2569 = new BitSet(new long[]{0x0000000060000030L});
        public static final BitSet FOLLOW_ruleDependency_in_ruleBottom2591 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleBottom2602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerRef_in_entryRuleAnswerRef2639 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswerRef2649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnswerRef2696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoiceAnswer_in_entryRuleChoiceAnswer2731 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleChoiceAnswer2741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleChoiceAnswer2778 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleChoiceAnswer2795 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleChoiceAnswer2812 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoiceAnswer2833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFreetextAnswer_in_entryRuleFreetextAnswer2869 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFreetextAnswer2879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleFreetextAnswer2916 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFreetextAnswer2933 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleFreetextAnswer2950 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFreetextAnswer2971 = new BitSet(new long[]{0x0000000000000002L});
    }


}