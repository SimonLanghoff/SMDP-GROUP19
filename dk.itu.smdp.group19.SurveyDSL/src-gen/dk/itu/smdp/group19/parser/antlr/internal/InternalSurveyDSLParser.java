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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'start survey'", "'title:'", "'pages:'", "','", "'end survey'", "'add question page'", "'text:'", "'questions:'", "'add description page'", "'add result page'", "'add'", "'optional'", "'freetext question'", "'requires:'", "'answers:'", "'single choice question'", "'multi choice question'", "'('", "'and'", "')'", "'Or'", "'{'", "'lhs'", "'rhs'", "'}'", "'AnswerRef'", "'refers'", "'selected'", "'ChoiceAnswer'", "'text'", "'FreetextAnswer'", "'input'"
    };
    public static final int T__42=42;
    public static final int RULE_ID=5;
    public static final int T__40=40;
    public static final int T__41=41;
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
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:76:1: ruleSurvey returns [EObject current=null] : (otherlv_0= 'start survey' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) otherlv_3= 'pages:' ( (lv_pages_4_0= rulePage ) ) (otherlv_5= ',' ( (lv_pages_6_0= rulePage ) ) )* otherlv_7= 'end survey' ) ;
    public final EObject ruleSurvey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_title_2_0 = null;

        EObject lv_pages_4_0 = null;

        EObject lv_pages_6_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:79:28: ( (otherlv_0= 'start survey' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) otherlv_3= 'pages:' ( (lv_pages_4_0= rulePage ) ) (otherlv_5= ',' ( (lv_pages_6_0= rulePage ) ) )* otherlv_7= 'end survey' ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:80:1: (otherlv_0= 'start survey' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) otherlv_3= 'pages:' ( (lv_pages_4_0= rulePage ) ) (otherlv_5= ',' ( (lv_pages_6_0= rulePage ) ) )* otherlv_7= 'end survey' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:80:1: (otherlv_0= 'start survey' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) otherlv_3= 'pages:' ( (lv_pages_4_0= rulePage ) ) (otherlv_5= ',' ( (lv_pages_6_0= rulePage ) ) )* otherlv_7= 'end survey' )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:80:3: otherlv_0= 'start survey' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) otherlv_3= 'pages:' ( (lv_pages_4_0= rulePage ) ) (otherlv_5= ',' ( (lv_pages_6_0= rulePage ) ) )* otherlv_7= 'end survey'
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

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:128:2: (otherlv_5= ',' ( (lv_pages_6_0= rulePage ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:128:4: otherlv_5= ',' ( (lv_pages_6_0= rulePage ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSurvey201); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSurveyAccess().getCommaKeyword_5_0());
            	        
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:132:1: ( (lv_pages_6_0= rulePage ) )
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:133:1: (lv_pages_6_0= rulePage )
            	    {
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:133:1: (lv_pages_6_0= rulePage )
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:134:3: lv_pages_6_0= rulePage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePage_in_ruleSurvey222);
            	    lv_pages_6_0=rulePage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"pages",
            	            		lv_pages_6_0, 
            	            		"Page");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSurvey236); 

                	newLeafNode(otherlv_7, grammarAccess.getSurveyAccess().getEndSurveyKeyword_6());
                

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:162:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:163:2: (iv_rulePage= rulePage EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:164:2: iv_rulePage= rulePage EOF
            {
             newCompositeNode(grammarAccess.getPageRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePage_in_entryRulePage272);
            iv_rulePage=rulePage();

            state._fsp--;

             current =iv_rulePage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePage282); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:171:1: rulePage returns [EObject current=null] : (this_QuestionPage_0= ruleQuestionPage | this_DescriptionPage_1= ruleDescriptionPage | this_ResultPage_2= ruleResultPage ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        EObject this_QuestionPage_0 = null;

        EObject this_DescriptionPage_1 = null;

        EObject this_ResultPage_2 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:174:28: ( (this_QuestionPage_0= ruleQuestionPage | this_DescriptionPage_1= ruleDescriptionPage | this_ResultPage_2= ruleResultPage ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:175:1: (this_QuestionPage_0= ruleQuestionPage | this_DescriptionPage_1= ruleDescriptionPage | this_ResultPage_2= ruleResultPage )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:175:1: (this_QuestionPage_0= ruleQuestionPage | this_DescriptionPage_1= ruleDescriptionPage | this_ResultPage_2= ruleResultPage )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 16:
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
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:176:5: this_QuestionPage_0= ruleQuestionPage
                    {
                     
                            newCompositeNode(grammarAccess.getPageAccess().getQuestionPageParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleQuestionPage_in_rulePage329);
                    this_QuestionPage_0=ruleQuestionPage();

                    state._fsp--;

                     
                            current = this_QuestionPage_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:186:5: this_DescriptionPage_1= ruleDescriptionPage
                    {
                     
                            newCompositeNode(grammarAccess.getPageAccess().getDescriptionPageParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDescriptionPage_in_rulePage356);
                    this_DescriptionPage_1=ruleDescriptionPage();

                    state._fsp--;

                     
                            current = this_DescriptionPage_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:196:5: this_ResultPage_2= ruleResultPage
                    {
                     
                            newCompositeNode(grammarAccess.getPageAccess().getResultPageParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleResultPage_in_rulePage383);
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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:212:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:213:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:214:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_entryRuleQuestion418);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestion428); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:221:1: ruleQuestion returns [EObject current=null] : (this_FreetextQuestion_0= ruleFreetextQuestion | this_SingleChoiceQuestion_1= ruleSingleChoiceQuestion | this_MultiChoiceQuestion_2= ruleMultiChoiceQuestion ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        EObject this_FreetextQuestion_0 = null;

        EObject this_SingleChoiceQuestion_1 = null;

        EObject this_MultiChoiceQuestion_2 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:224:28: ( (this_FreetextQuestion_0= ruleFreetextQuestion | this_SingleChoiceQuestion_1= ruleSingleChoiceQuestion | this_MultiChoiceQuestion_2= ruleMultiChoiceQuestion ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:225:1: (this_FreetextQuestion_0= ruleFreetextQuestion | this_SingleChoiceQuestion_1= ruleSingleChoiceQuestion | this_MultiChoiceQuestion_2= ruleMultiChoiceQuestion )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:225:1: (this_FreetextQuestion_0= ruleFreetextQuestion | this_SingleChoiceQuestion_1= ruleSingleChoiceQuestion | this_MultiChoiceQuestion_2= ruleMultiChoiceQuestion )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                switch ( input.LA(2) ) {
                case 22:
                    {
                    switch ( input.LA(3) ) {
                    case 27:
                        {
                        alt3=3;
                        }
                        break;
                    case 23:
                        {
                        alt3=1;
                        }
                        break;
                    case 26:
                        {
                        alt3=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                case 26:
                    {
                    alt3=2;
                    }
                    break;
                case 23:
                    {
                    alt3=1;
                    }
                    break;
                case 27:
                    {
                    alt3=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:226:5: this_FreetextQuestion_0= ruleFreetextQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getFreetextQuestionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFreetextQuestion_in_ruleQuestion475);
                    this_FreetextQuestion_0=ruleFreetextQuestion();

                    state._fsp--;

                     
                            current = this_FreetextQuestion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:236:5: this_SingleChoiceQuestion_1= ruleSingleChoiceQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getSingleChoiceQuestionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSingleChoiceQuestion_in_ruleQuestion502);
                    this_SingleChoiceQuestion_1=ruleSingleChoiceQuestion();

                    state._fsp--;

                     
                            current = this_SingleChoiceQuestion_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:246:5: this_MultiChoiceQuestion_2= ruleMultiChoiceQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getMultiChoiceQuestionParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMultiChoiceQuestion_in_ruleQuestion529);
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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:262:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:263:2: (iv_ruleDependency= ruleDependency EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:264:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_entryRuleDependency564);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDependency574); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:271:1: ruleDependency returns [EObject current=null] : (this_And_0= ruleAnd | this_Or_1= ruleOr | this_AnswerRef_2= ruleAnswerRef ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        EObject this_And_0 = null;

        EObject this_Or_1 = null;

        EObject this_AnswerRef_2 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:274:28: ( (this_And_0= ruleAnd | this_Or_1= ruleOr | this_AnswerRef_2= ruleAnswerRef ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:275:1: (this_And_0= ruleAnd | this_Or_1= ruleOr | this_AnswerRef_2= ruleAnswerRef )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:275:1: (this_And_0= ruleAnd | this_Or_1= ruleOr | this_AnswerRef_2= ruleAnswerRef )
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
            case 36:
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
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:276:5: this_And_0= ruleAnd
                    {
                     
                            newCompositeNode(grammarAccess.getDependencyAccess().getAndParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnd_in_ruleDependency621);
                    this_And_0=ruleAnd();

                    state._fsp--;

                     
                            current = this_And_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:286:5: this_Or_1= ruleOr
                    {
                     
                            newCompositeNode(grammarAccess.getDependencyAccess().getOrParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOr_in_ruleDependency648);
                    this_Or_1=ruleOr();

                    state._fsp--;

                     
                            current = this_Or_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:296:5: this_AnswerRef_2= ruleAnswerRef
                    {
                     
                            newCompositeNode(grammarAccess.getDependencyAccess().getAnswerRefParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnswerRef_in_ruleDependency675);
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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:312:1: entryRuleAnswer returns [EObject current=null] : iv_ruleAnswer= ruleAnswer EOF ;
    public final EObject entryRuleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswer = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:313:2: (iv_ruleAnswer= ruleAnswer EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:314:2: iv_ruleAnswer= ruleAnswer EOF
            {
             newCompositeNode(grammarAccess.getAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_entryRuleAnswer710);
            iv_ruleAnswer=ruleAnswer();

            state._fsp--;

             current =iv_ruleAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswer720); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:321:1: ruleAnswer returns [EObject current=null] : (this_ChoiceAnswer_0= ruleChoiceAnswer | this_FreetextAnswer_1= ruleFreetextAnswer ) ;
    public final EObject ruleAnswer() throws RecognitionException {
        EObject current = null;

        EObject this_ChoiceAnswer_0 = null;

        EObject this_FreetextAnswer_1 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:324:28: ( (this_ChoiceAnswer_0= ruleChoiceAnswer | this_FreetextAnswer_1= ruleFreetextAnswer ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:325:1: (this_ChoiceAnswer_0= ruleChoiceAnswer | this_FreetextAnswer_1= ruleFreetextAnswer )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:325:1: (this_ChoiceAnswer_0= ruleChoiceAnswer | this_FreetextAnswer_1= ruleFreetextAnswer )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==38) ) {
                alt5=1;
            }
            else if ( (LA5_0==41) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:326:5: this_ChoiceAnswer_0= ruleChoiceAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getAnswerAccess().getChoiceAnswerParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleChoiceAnswer_in_ruleAnswer767);
                    this_ChoiceAnswer_0=ruleChoiceAnswer();

                    state._fsp--;

                     
                            current = this_ChoiceAnswer_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:336:5: this_FreetextAnswer_1= ruleFreetextAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getAnswerAccess().getFreetextAnswerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFreetextAnswer_in_ruleAnswer794);
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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:352:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:353:2: (iv_ruleEString= ruleEString EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:354:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString830);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString841); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:361:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:364:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:365:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:365:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:365:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString881); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:373:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString907); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:388:1: entryRuleQuestionPage returns [EObject current=null] : iv_ruleQuestionPage= ruleQuestionPage EOF ;
    public final EObject entryRuleQuestionPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionPage = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:389:2: (iv_ruleQuestionPage= ruleQuestionPage EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:390:2: iv_ruleQuestionPage= ruleQuestionPage EOF
            {
             newCompositeNode(grammarAccess.getQuestionPageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestionPage_in_entryRuleQuestionPage952);
            iv_ruleQuestionPage=ruleQuestionPage();

            state._fsp--;

             current =iv_ruleQuestionPage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestionPage962); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:397:1: ruleQuestionPage returns [EObject current=null] : (otherlv_0= 'add question page' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= 'questions:' ( (lv_questions_6_0= ruleQuestion ) ) (otherlv_7= ',' ( (lv_questions_8_0= ruleQuestion ) ) )* ) ;
    public final EObject ruleQuestionPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_title_2_0 = null;

        AntlrDatatypeRuleToken lv_text_4_0 = null;

        EObject lv_questions_6_0 = null;

        EObject lv_questions_8_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:400:28: ( (otherlv_0= 'add question page' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= 'questions:' ( (lv_questions_6_0= ruleQuestion ) ) (otherlv_7= ',' ( (lv_questions_8_0= ruleQuestion ) ) )* ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:401:1: (otherlv_0= 'add question page' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= 'questions:' ( (lv_questions_6_0= ruleQuestion ) ) (otherlv_7= ',' ( (lv_questions_8_0= ruleQuestion ) ) )* )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:401:1: (otherlv_0= 'add question page' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= 'questions:' ( (lv_questions_6_0= ruleQuestion ) ) (otherlv_7= ',' ( (lv_questions_8_0= ruleQuestion ) ) )* )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:401:3: otherlv_0= 'add question page' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )? otherlv_5= 'questions:' ( (lv_questions_6_0= ruleQuestion ) ) (otherlv_7= ',' ( (lv_questions_8_0= ruleQuestion ) ) )*
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleQuestionPage999); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionPageAccess().getAddQuestionPageKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleQuestionPage1011); 

                	newLeafNode(otherlv_1, grammarAccess.getQuestionPageAccess().getTitleKeyword_1());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:409:1: ( (lv_title_2_0= ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:410:1: (lv_title_2_0= ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:410:1: (lv_title_2_0= ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:411:3: lv_title_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getQuestionPageAccess().getTitleEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQuestionPage1032);
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

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:427:2: (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:427:4: otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleQuestionPage1045); 

                        	newLeafNode(otherlv_3, grammarAccess.getQuestionPageAccess().getTextKeyword_3_0());
                        
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:431:1: ( (lv_text_4_0= ruleEString ) )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:432:1: (lv_text_4_0= ruleEString )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:432:1: (lv_text_4_0= ruleEString )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:433:3: lv_text_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getQuestionPageAccess().getTextEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQuestionPage1066);
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

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleQuestionPage1080); 

                	newLeafNode(otherlv_5, grammarAccess.getQuestionPageAccess().getQuestionsKeyword_4());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:453:1: ( (lv_questions_6_0= ruleQuestion ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:454:1: (lv_questions_6_0= ruleQuestion )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:454:1: (lv_questions_6_0= ruleQuestion )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:455:3: lv_questions_6_0= ruleQuestion
            {
             
            	        newCompositeNode(grammarAccess.getQuestionPageAccess().getQuestionsQuestionParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleQuestionPage1101);
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

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:471:2: (otherlv_7= ',' ( (lv_questions_8_0= ruleQuestion ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==21) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:471:4: otherlv_7= ',' ( (lv_questions_8_0= ruleQuestion ) )
            	    {
            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleQuestionPage1114); 

            	        	newLeafNode(otherlv_7, grammarAccess.getQuestionPageAccess().getCommaKeyword_6_0());
            	        
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:475:1: ( (lv_questions_8_0= ruleQuestion ) )
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:476:1: (lv_questions_8_0= ruleQuestion )
            	    {
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:476:1: (lv_questions_8_0= ruleQuestion )
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:477:3: lv_questions_8_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionPageAccess().getQuestionsQuestionParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleQuestionPage1135);
            	    lv_questions_8_0=ruleQuestion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionPageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"questions",
            	            		lv_questions_8_0, 
            	            		"Question");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleQuestionPage"


    // $ANTLR start "entryRuleDescriptionPage"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:501:1: entryRuleDescriptionPage returns [EObject current=null] : iv_ruleDescriptionPage= ruleDescriptionPage EOF ;
    public final EObject entryRuleDescriptionPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescriptionPage = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:502:2: (iv_ruleDescriptionPage= ruleDescriptionPage EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:503:2: iv_ruleDescriptionPage= ruleDescriptionPage EOF
            {
             newCompositeNode(grammarAccess.getDescriptionPageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDescriptionPage_in_entryRuleDescriptionPage1173);
            iv_ruleDescriptionPage=ruleDescriptionPage();

            state._fsp--;

             current =iv_ruleDescriptionPage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDescriptionPage1183); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:510:1: ruleDescriptionPage returns [EObject current=null] : (otherlv_0= 'add description page' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )? ) ;
    public final EObject ruleDescriptionPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_title_2_0 = null;

        AntlrDatatypeRuleToken lv_text_4_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:513:28: ( (otherlv_0= 'add description page' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )? ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:514:1: (otherlv_0= 'add description page' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )? )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:514:1: (otherlv_0= 'add description page' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )? )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:514:3: otherlv_0= 'add description page' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleDescriptionPage1220); 

                	newLeafNode(otherlv_0, grammarAccess.getDescriptionPageAccess().getAddDescriptionPageKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDescriptionPage1232); 

                	newLeafNode(otherlv_1, grammarAccess.getDescriptionPageAccess().getTitleKeyword_1());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:522:1: ( (lv_title_2_0= ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:523:1: (lv_title_2_0= ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:523:1: (lv_title_2_0= ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:524:3: lv_title_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDescriptionPageAccess().getTitleEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDescriptionPage1253);
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

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:540:2: (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:540:4: otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDescriptionPage1266); 

                        	newLeafNode(otherlv_3, grammarAccess.getDescriptionPageAccess().getTextKeyword_3_0());
                        
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:544:1: ( (lv_text_4_0= ruleEString ) )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:545:1: (lv_text_4_0= ruleEString )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:545:1: (lv_text_4_0= ruleEString )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:546:3: lv_text_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getDescriptionPageAccess().getTextEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDescriptionPage1287);
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
            pushFollow(FollowSets000.FOLLOW_ruleResultPage_in_entryRuleResultPage1325);
            iv_ruleResultPage=ruleResultPage();

            state._fsp--;

             current =iv_ruleResultPage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleResultPage1335); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:579:1: ruleResultPage returns [EObject current=null] : (otherlv_0= 'add result page' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )? ) ;
    public final EObject ruleResultPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_title_2_0 = null;

        AntlrDatatypeRuleToken lv_text_4_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:582:28: ( (otherlv_0= 'add result page' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )? ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:583:1: (otherlv_0= 'add result page' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )? )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:583:1: (otherlv_0= 'add result page' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )? )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:583:3: otherlv_0= 'add result page' otherlv_1= 'title:' ( (lv_title_2_0= ruleEString ) ) (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleResultPage1372); 

                	newLeafNode(otherlv_0, grammarAccess.getResultPageAccess().getAddResultPageKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleResultPage1384); 

                	newLeafNode(otherlv_1, grammarAccess.getResultPageAccess().getTitleKeyword_1());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:591:1: ( (lv_title_2_0= ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:592:1: (lv_title_2_0= ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:592:1: (lv_title_2_0= ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:593:3: lv_title_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getResultPageAccess().getTitleEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleResultPage1405);
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

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:609:4: otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleResultPage1418); 

                        	newLeafNode(otherlv_3, grammarAccess.getResultPageAccess().getTextKeyword_3_0());
                        
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:613:1: ( (lv_text_4_0= ruleEString ) )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:614:1: (lv_text_4_0= ruleEString )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:614:1: (lv_text_4_0= ruleEString )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:615:3: lv_text_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getResultPageAccess().getTextEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleResultPage1439);
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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:641:1: entryRuleFreetextQuestion returns [EObject current=null] : iv_ruleFreetextQuestion= ruleFreetextQuestion EOF ;
    public final EObject entryRuleFreetextQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFreetextQuestion = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:642:2: (iv_ruleFreetextQuestion= ruleFreetextQuestion EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:643:2: iv_ruleFreetextQuestion= ruleFreetextQuestion EOF
            {
             newCompositeNode(grammarAccess.getFreetextQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFreetextQuestion_in_entryRuleFreetextQuestion1479);
            iv_ruleFreetextQuestion=ruleFreetextQuestion();

            state._fsp--;

             current =iv_ruleFreetextQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFreetextQuestion1489); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:650:1: ruleFreetextQuestion returns [EObject current=null] : (otherlv_0= 'add' ( (lv_optional_1_0= 'optional' ) )? otherlv_2= 'freetext question' otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) (otherlv_5= 'requires:' ( (lv_requires_6_0= ruleDependency ) ) )? otherlv_7= 'answers:' ( (lv_answers_8_0= ruleFreetextAnswer ) ) ) ;
    public final EObject ruleFreetextQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_optional_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_text_4_0 = null;

        EObject lv_requires_6_0 = null;

        EObject lv_answers_8_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:653:28: ( (otherlv_0= 'add' ( (lv_optional_1_0= 'optional' ) )? otherlv_2= 'freetext question' otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) (otherlv_5= 'requires:' ( (lv_requires_6_0= ruleDependency ) ) )? otherlv_7= 'answers:' ( (lv_answers_8_0= ruleFreetextAnswer ) ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:654:1: (otherlv_0= 'add' ( (lv_optional_1_0= 'optional' ) )? otherlv_2= 'freetext question' otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) (otherlv_5= 'requires:' ( (lv_requires_6_0= ruleDependency ) ) )? otherlv_7= 'answers:' ( (lv_answers_8_0= ruleFreetextAnswer ) ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:654:1: (otherlv_0= 'add' ( (lv_optional_1_0= 'optional' ) )? otherlv_2= 'freetext question' otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) (otherlv_5= 'requires:' ( (lv_requires_6_0= ruleDependency ) ) )? otherlv_7= 'answers:' ( (lv_answers_8_0= ruleFreetextAnswer ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:654:3: otherlv_0= 'add' ( (lv_optional_1_0= 'optional' ) )? otherlv_2= 'freetext question' otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) (otherlv_5= 'requires:' ( (lv_requires_6_0= ruleDependency ) ) )? otherlv_7= 'answers:' ( (lv_answers_8_0= ruleFreetextAnswer ) )
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleFreetextQuestion1526); 

                	newLeafNode(otherlv_0, grammarAccess.getFreetextQuestionAccess().getAddKeyword_0());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:658:1: ( (lv_optional_1_0= 'optional' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:659:1: (lv_optional_1_0= 'optional' )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:659:1: (lv_optional_1_0= 'optional' )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:660:3: lv_optional_1_0= 'optional'
                    {
                    lv_optional_1_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleFreetextQuestion1544); 

                            newLeafNode(lv_optional_1_0, grammarAccess.getFreetextQuestionAccess().getOptionalOptionalKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFreetextQuestionRule());
                    	        }
                           		setWithLastConsumed(current, "optional", true, "optional");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleFreetextQuestion1570); 

                	newLeafNode(otherlv_2, grammarAccess.getFreetextQuestionAccess().getFreetextQuestionKeyword_2());
                
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFreetextQuestion1582); 

                	newLeafNode(otherlv_3, grammarAccess.getFreetextQuestionAccess().getTextKeyword_3());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:681:1: ( (lv_text_4_0= ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:682:1: (lv_text_4_0= ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:682:1: (lv_text_4_0= ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:683:3: lv_text_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFreetextQuestionAccess().getTextEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFreetextQuestion1603);
            lv_text_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFreetextQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"text",
                    		lv_text_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:699:2: (otherlv_5= 'requires:' ( (lv_requires_6_0= ruleDependency ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:699:4: otherlv_5= 'requires:' ( (lv_requires_6_0= ruleDependency ) )
                    {
                    otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleFreetextQuestion1616); 

                        	newLeafNode(otherlv_5, grammarAccess.getFreetextQuestionAccess().getRequiresKeyword_5_0());
                        
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:703:1: ( (lv_requires_6_0= ruleDependency ) )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:704:1: (lv_requires_6_0= ruleDependency )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:704:1: (lv_requires_6_0= ruleDependency )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:705:3: lv_requires_6_0= ruleDependency
                    {
                     
                    	        newCompositeNode(grammarAccess.getFreetextQuestionAccess().getRequiresDependencyParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDependency_in_ruleFreetextQuestion1637);
                    lv_requires_6_0=ruleDependency();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFreetextQuestionRule());
                    	        }
                           		set(
                           			current, 
                           			"requires",
                            		lv_requires_6_0, 
                            		"Dependency");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleFreetextQuestion1651); 

                	newLeafNode(otherlv_7, grammarAccess.getFreetextQuestionAccess().getAnswersKeyword_6());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:725:1: ( (lv_answers_8_0= ruleFreetextAnswer ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:726:1: (lv_answers_8_0= ruleFreetextAnswer )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:726:1: (lv_answers_8_0= ruleFreetextAnswer )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:727:3: lv_answers_8_0= ruleFreetextAnswer
            {
             
            	        newCompositeNode(grammarAccess.getFreetextQuestionAccess().getAnswersFreetextAnswerParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFreetextAnswer_in_ruleFreetextQuestion1672);
            lv_answers_8_0=ruleFreetextAnswer();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFreetextQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"answers",
                    		lv_answers_8_0, 
                    		"FreetextAnswer");
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
    // $ANTLR end "ruleFreetextQuestion"


    // $ANTLR start "entryRuleSingleChoiceQuestion"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:751:1: entryRuleSingleChoiceQuestion returns [EObject current=null] : iv_ruleSingleChoiceQuestion= ruleSingleChoiceQuestion EOF ;
    public final EObject entryRuleSingleChoiceQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleChoiceQuestion = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:752:2: (iv_ruleSingleChoiceQuestion= ruleSingleChoiceQuestion EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:753:2: iv_ruleSingleChoiceQuestion= ruleSingleChoiceQuestion EOF
            {
             newCompositeNode(grammarAccess.getSingleChoiceQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleChoiceQuestion_in_entryRuleSingleChoiceQuestion1708);
            iv_ruleSingleChoiceQuestion=ruleSingleChoiceQuestion();

            state._fsp--;

             current =iv_ruleSingleChoiceQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleChoiceQuestion1718); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:760:1: ruleSingleChoiceQuestion returns [EObject current=null] : (otherlv_0= 'add' ( (lv_optional_1_0= 'optional' ) )? otherlv_2= 'single choice question' otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) (otherlv_5= 'requires:' ( (lv_requires_6_0= ruleDependency ) ) )? otherlv_7= 'answers:' ( (lv_answers_8_0= ruleAnswer ) ) (otherlv_9= ',' ( (lv_answers_10_0= ruleAnswer ) ) )* ) ;
    public final EObject ruleSingleChoiceQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_optional_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_text_4_0 = null;

        EObject lv_requires_6_0 = null;

        EObject lv_answers_8_0 = null;

        EObject lv_answers_10_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:763:28: ( (otherlv_0= 'add' ( (lv_optional_1_0= 'optional' ) )? otherlv_2= 'single choice question' otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) (otherlv_5= 'requires:' ( (lv_requires_6_0= ruleDependency ) ) )? otherlv_7= 'answers:' ( (lv_answers_8_0= ruleAnswer ) ) (otherlv_9= ',' ( (lv_answers_10_0= ruleAnswer ) ) )* ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:764:1: (otherlv_0= 'add' ( (lv_optional_1_0= 'optional' ) )? otherlv_2= 'single choice question' otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) (otherlv_5= 'requires:' ( (lv_requires_6_0= ruleDependency ) ) )? otherlv_7= 'answers:' ( (lv_answers_8_0= ruleAnswer ) ) (otherlv_9= ',' ( (lv_answers_10_0= ruleAnswer ) ) )* )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:764:1: (otherlv_0= 'add' ( (lv_optional_1_0= 'optional' ) )? otherlv_2= 'single choice question' otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) (otherlv_5= 'requires:' ( (lv_requires_6_0= ruleDependency ) ) )? otherlv_7= 'answers:' ( (lv_answers_8_0= ruleAnswer ) ) (otherlv_9= ',' ( (lv_answers_10_0= ruleAnswer ) ) )* )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:764:3: otherlv_0= 'add' ( (lv_optional_1_0= 'optional' ) )? otherlv_2= 'single choice question' otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) (otherlv_5= 'requires:' ( (lv_requires_6_0= ruleDependency ) ) )? otherlv_7= 'answers:' ( (lv_answers_8_0= ruleAnswer ) ) (otherlv_9= ',' ( (lv_answers_10_0= ruleAnswer ) ) )*
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleSingleChoiceQuestion1755); 

                	newLeafNode(otherlv_0, grammarAccess.getSingleChoiceQuestionAccess().getAddKeyword_0());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:768:1: ( (lv_optional_1_0= 'optional' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:769:1: (lv_optional_1_0= 'optional' )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:769:1: (lv_optional_1_0= 'optional' )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:770:3: lv_optional_1_0= 'optional'
                    {
                    lv_optional_1_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSingleChoiceQuestion1773); 

                            newLeafNode(lv_optional_1_0, grammarAccess.getSingleChoiceQuestionAccess().getOptionalOptionalKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSingleChoiceQuestionRule());
                    	        }
                           		setWithLastConsumed(current, "optional", true, "optional");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleSingleChoiceQuestion1799); 

                	newLeafNode(otherlv_2, grammarAccess.getSingleChoiceQuestionAccess().getSingleChoiceQuestionKeyword_2());
                
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSingleChoiceQuestion1811); 

                	newLeafNode(otherlv_3, grammarAccess.getSingleChoiceQuestionAccess().getTextKeyword_3());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:791:1: ( (lv_text_4_0= ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:792:1: (lv_text_4_0= ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:792:1: (lv_text_4_0= ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:793:3: lv_text_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSingleChoiceQuestionAccess().getTextEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingleChoiceQuestion1832);
            lv_text_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSingleChoiceQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"text",
                    		lv_text_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:809:2: (otherlv_5= 'requires:' ( (lv_requires_6_0= ruleDependency ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:809:4: otherlv_5= 'requires:' ( (lv_requires_6_0= ruleDependency ) )
                    {
                    otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSingleChoiceQuestion1845); 

                        	newLeafNode(otherlv_5, grammarAccess.getSingleChoiceQuestionAccess().getRequiresKeyword_5_0());
                        
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:813:1: ( (lv_requires_6_0= ruleDependency ) )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:814:1: (lv_requires_6_0= ruleDependency )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:814:1: (lv_requires_6_0= ruleDependency )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:815:3: lv_requires_6_0= ruleDependency
                    {
                     
                    	        newCompositeNode(grammarAccess.getSingleChoiceQuestionAccess().getRequiresDependencyParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDependency_in_ruleSingleChoiceQuestion1866);
                    lv_requires_6_0=ruleDependency();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSingleChoiceQuestionRule());
                    	        }
                           		set(
                           			current, 
                           			"requires",
                            		lv_requires_6_0, 
                            		"Dependency");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleSingleChoiceQuestion1880); 

                	newLeafNode(otherlv_7, grammarAccess.getSingleChoiceQuestionAccess().getAnswersKeyword_6());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:835:1: ( (lv_answers_8_0= ruleAnswer ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:836:1: (lv_answers_8_0= ruleAnswer )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:836:1: (lv_answers_8_0= ruleAnswer )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:837:3: lv_answers_8_0= ruleAnswer
            {
             
            	        newCompositeNode(grammarAccess.getSingleChoiceQuestionAccess().getAnswersAnswerParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleSingleChoiceQuestion1901);
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

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:853:2: (otherlv_9= ',' ( (lv_answers_10_0= ruleAnswer ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==14) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==38||LA15_2==41) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:853:4: otherlv_9= ',' ( (lv_answers_10_0= ruleAnswer ) )
            	    {
            	    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingleChoiceQuestion1914); 

            	        	newLeafNode(otherlv_9, grammarAccess.getSingleChoiceQuestionAccess().getCommaKeyword_8_0());
            	        
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:857:1: ( (lv_answers_10_0= ruleAnswer ) )
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:858:1: (lv_answers_10_0= ruleAnswer )
            	    {
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:858:1: (lv_answers_10_0= ruleAnswer )
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:859:3: lv_answers_10_0= ruleAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleChoiceQuestionAccess().getAnswersAnswerParserRuleCall_8_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleSingleChoiceQuestion1935);
            	    lv_answers_10_0=ruleAnswer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSingleChoiceQuestionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"answers",
            	            		lv_answers_10_0, 
            	            		"Answer");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
            pushFollow(FollowSets000.FOLLOW_ruleMultiChoiceQuestion_in_entryRuleMultiChoiceQuestion1973);
            iv_ruleMultiChoiceQuestion=ruleMultiChoiceQuestion();

            state._fsp--;

             current =iv_ruleMultiChoiceQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiChoiceQuestion1983); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:892:1: ruleMultiChoiceQuestion returns [EObject current=null] : (otherlv_0= 'add' ( (lv_optional_1_0= 'optional' ) )? otherlv_2= 'multi choice question' otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) (otherlv_5= 'requires:' ( (lv_requires_6_0= ruleDependency ) ) )? otherlv_7= 'answers:' ( (lv_answers_8_0= ruleAnswer ) ) (otherlv_9= ',' ( (lv_answers_10_0= ruleAnswer ) ) )* ) ;
    public final EObject ruleMultiChoiceQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_optional_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_text_4_0 = null;

        EObject lv_requires_6_0 = null;

        EObject lv_answers_8_0 = null;

        EObject lv_answers_10_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:895:28: ( (otherlv_0= 'add' ( (lv_optional_1_0= 'optional' ) )? otherlv_2= 'multi choice question' otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) (otherlv_5= 'requires:' ( (lv_requires_6_0= ruleDependency ) ) )? otherlv_7= 'answers:' ( (lv_answers_8_0= ruleAnswer ) ) (otherlv_9= ',' ( (lv_answers_10_0= ruleAnswer ) ) )* ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:896:1: (otherlv_0= 'add' ( (lv_optional_1_0= 'optional' ) )? otherlv_2= 'multi choice question' otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) (otherlv_5= 'requires:' ( (lv_requires_6_0= ruleDependency ) ) )? otherlv_7= 'answers:' ( (lv_answers_8_0= ruleAnswer ) ) (otherlv_9= ',' ( (lv_answers_10_0= ruleAnswer ) ) )* )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:896:1: (otherlv_0= 'add' ( (lv_optional_1_0= 'optional' ) )? otherlv_2= 'multi choice question' otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) (otherlv_5= 'requires:' ( (lv_requires_6_0= ruleDependency ) ) )? otherlv_7= 'answers:' ( (lv_answers_8_0= ruleAnswer ) ) (otherlv_9= ',' ( (lv_answers_10_0= ruleAnswer ) ) )* )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:896:3: otherlv_0= 'add' ( (lv_optional_1_0= 'optional' ) )? otherlv_2= 'multi choice question' otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) (otherlv_5= 'requires:' ( (lv_requires_6_0= ruleDependency ) ) )? otherlv_7= 'answers:' ( (lv_answers_8_0= ruleAnswer ) ) (otherlv_9= ',' ( (lv_answers_10_0= ruleAnswer ) ) )*
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMultiChoiceQuestion2020); 

                	newLeafNode(otherlv_0, grammarAccess.getMultiChoiceQuestionAccess().getAddKeyword_0());
                
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
                    lv_optional_1_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMultiChoiceQuestion2038); 

                            newLeafNode(lv_optional_1_0, grammarAccess.getMultiChoiceQuestionAccess().getOptionalOptionalKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiChoiceQuestionRule());
                    	        }
                           		setWithLastConsumed(current, "optional", true, "optional");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleMultiChoiceQuestion2064); 

                	newLeafNode(otherlv_2, grammarAccess.getMultiChoiceQuestionAccess().getMultiChoiceQuestionKeyword_2());
                
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMultiChoiceQuestion2076); 

                	newLeafNode(otherlv_3, grammarAccess.getMultiChoiceQuestionAccess().getTextKeyword_3());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:923:1: ( (lv_text_4_0= ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:924:1: (lv_text_4_0= ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:924:1: (lv_text_4_0= ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:925:3: lv_text_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMultiChoiceQuestionAccess().getTextEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiChoiceQuestion2097);
            lv_text_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultiChoiceQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"text",
                    		lv_text_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:941:2: (otherlv_5= 'requires:' ( (lv_requires_6_0= ruleDependency ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:941:4: otherlv_5= 'requires:' ( (lv_requires_6_0= ruleDependency ) )
                    {
                    otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMultiChoiceQuestion2110); 

                        	newLeafNode(otherlv_5, grammarAccess.getMultiChoiceQuestionAccess().getRequiresKeyword_5_0());
                        
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:945:1: ( (lv_requires_6_0= ruleDependency ) )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:946:1: (lv_requires_6_0= ruleDependency )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:946:1: (lv_requires_6_0= ruleDependency )
                    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:947:3: lv_requires_6_0= ruleDependency
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultiChoiceQuestionAccess().getRequiresDependencyParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDependency_in_ruleMultiChoiceQuestion2131);
                    lv_requires_6_0=ruleDependency();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultiChoiceQuestionRule());
                    	        }
                           		set(
                           			current, 
                           			"requires",
                            		lv_requires_6_0, 
                            		"Dependency");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMultiChoiceQuestion2145); 

                	newLeafNode(otherlv_7, grammarAccess.getMultiChoiceQuestionAccess().getAnswersKeyword_6());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:967:1: ( (lv_answers_8_0= ruleAnswer ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:968:1: (lv_answers_8_0= ruleAnswer )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:968:1: (lv_answers_8_0= ruleAnswer )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:969:3: lv_answers_8_0= ruleAnswer
            {
             
            	        newCompositeNode(grammarAccess.getMultiChoiceQuestionAccess().getAnswersAnswerParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleMultiChoiceQuestion2166);
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

            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:985:2: (otherlv_9= ',' ( (lv_answers_10_0= ruleAnswer ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==14) ) {
                    int LA18_2 = input.LA(2);

                    if ( (LA18_2==38||LA18_2==41) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:985:4: otherlv_9= ',' ( (lv_answers_10_0= ruleAnswer ) )
            	    {
            	    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultiChoiceQuestion2179); 

            	        	newLeafNode(otherlv_9, grammarAccess.getMultiChoiceQuestionAccess().getCommaKeyword_8_0());
            	        
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:989:1: ( (lv_answers_10_0= ruleAnswer ) )
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:990:1: (lv_answers_10_0= ruleAnswer )
            	    {
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:990:1: (lv_answers_10_0= ruleAnswer )
            	    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:991:3: lv_answers_10_0= ruleAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiChoiceQuestionAccess().getAnswersAnswerParserRuleCall_8_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleMultiChoiceQuestion2200);
            	    lv_answers_10_0=ruleAnswer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiChoiceQuestionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"answers",
            	            		lv_answers_10_0, 
            	            		"Answer");
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
    // $ANTLR end "ruleMultiChoiceQuestion"


    // $ANTLR start "entryRuleAnd"
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1015:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1016:2: (iv_ruleAnd= ruleAnd EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1017:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnd_in_entryRuleAnd2238);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnd2248); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1024:1: ruleAnd returns [EObject current=null] : (otherlv_0= '(' ( (lv_lhs_1_0= ruleDependency ) ) otherlv_2= 'and' ( (lv_rhs_3_0= ruleDependency ) ) otherlv_4= ')' ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_lhs_1_0 = null;

        EObject lv_rhs_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1027:28: ( (otherlv_0= '(' ( (lv_lhs_1_0= ruleDependency ) ) otherlv_2= 'and' ( (lv_rhs_3_0= ruleDependency ) ) otherlv_4= ')' ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1028:1: (otherlv_0= '(' ( (lv_lhs_1_0= ruleDependency ) ) otherlv_2= 'and' ( (lv_rhs_3_0= ruleDependency ) ) otherlv_4= ')' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1028:1: (otherlv_0= '(' ( (lv_lhs_1_0= ruleDependency ) ) otherlv_2= 'and' ( (lv_rhs_3_0= ruleDependency ) ) otherlv_4= ')' )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1028:3: otherlv_0= '(' ( (lv_lhs_1_0= ruleDependency ) ) otherlv_2= 'and' ( (lv_rhs_3_0= ruleDependency ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAnd2285); 

                	newLeafNode(otherlv_0, grammarAccess.getAndAccess().getLeftParenthesisKeyword_0());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1032:1: ( (lv_lhs_1_0= ruleDependency ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1033:1: (lv_lhs_1_0= ruleDependency )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1033:1: (lv_lhs_1_0= ruleDependency )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1034:3: lv_lhs_1_0= ruleDependency
            {
             
            	        newCompositeNode(grammarAccess.getAndAccess().getLhsDependencyParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_ruleAnd2306);
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

            otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAnd2318); 

                	newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAndKeyword_2());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1054:1: ( (lv_rhs_3_0= ruleDependency ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1055:1: (lv_rhs_3_0= ruleDependency )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1055:1: (lv_rhs_3_0= ruleDependency )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1056:3: lv_rhs_3_0= ruleDependency
            {
             
            	        newCompositeNode(grammarAccess.getAndAccess().getRhsDependencyParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_ruleAnd2339);
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

            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleAnd2351); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1084:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1085:2: (iv_ruleOr= ruleOr EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1086:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOr_in_entryRuleOr2387);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOr2397); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1093:1: ruleOr returns [EObject current=null] : (otherlv_0= 'Or' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleDependency ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleDependency ) ) otherlv_6= '}' ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_lhs_3_0 = null;

        EObject lv_rhs_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1096:28: ( (otherlv_0= 'Or' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleDependency ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleDependency ) ) otherlv_6= '}' ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1097:1: (otherlv_0= 'Or' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleDependency ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleDependency ) ) otherlv_6= '}' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1097:1: (otherlv_0= 'Or' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleDependency ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleDependency ) ) otherlv_6= '}' )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1097:3: otherlv_0= 'Or' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleDependency ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleDependency ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleOr2434); 

                	newLeafNode(otherlv_0, grammarAccess.getOrAccess().getOrKeyword_0());
                
            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleOr2446); 

                	newLeafNode(otherlv_1, grammarAccess.getOrAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleOr2458); 

                	newLeafNode(otherlv_2, grammarAccess.getOrAccess().getLhsKeyword_2());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1109:1: ( (lv_lhs_3_0= ruleDependency ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1110:1: (lv_lhs_3_0= ruleDependency )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1110:1: (lv_lhs_3_0= ruleDependency )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1111:3: lv_lhs_3_0= ruleDependency
            {
             
            	        newCompositeNode(grammarAccess.getOrAccess().getLhsDependencyParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_ruleOr2479);
            lv_lhs_3_0=ruleDependency();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOrRule());
            	        }
                   		set(
                   			current, 
                   			"lhs",
                    		lv_lhs_3_0, 
                    		"Dependency");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleOr2491); 

                	newLeafNode(otherlv_4, grammarAccess.getOrAccess().getRhsKeyword_4());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1131:1: ( (lv_rhs_5_0= ruleDependency ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1132:1: (lv_rhs_5_0= ruleDependency )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1132:1: (lv_rhs_5_0= ruleDependency )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1133:3: lv_rhs_5_0= ruleDependency
            {
             
            	        newCompositeNode(grammarAccess.getOrAccess().getRhsDependencyParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_ruleOr2512);
            lv_rhs_5_0=ruleDependency();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOrRule());
            	        }
                   		set(
                   			current, 
                   			"rhs",
                    		lv_rhs_5_0, 
                    		"Dependency");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleOr2524); 

                	newLeafNode(otherlv_6, grammarAccess.getOrAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1161:1: entryRuleAnswerRef returns [EObject current=null] : iv_ruleAnswerRef= ruleAnswerRef EOF ;
    public final EObject entryRuleAnswerRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswerRef = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1162:2: (iv_ruleAnswerRef= ruleAnswerRef EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1163:2: iv_ruleAnswerRef= ruleAnswerRef EOF
            {
             newCompositeNode(grammarAccess.getAnswerRefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswerRef_in_entryRuleAnswerRef2560);
            iv_ruleAnswerRef=ruleAnswerRef();

            state._fsp--;

             current =iv_ruleAnswerRef; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswerRef2570); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1170:1: ruleAnswerRef returns [EObject current=null] : (otherlv_0= 'AnswerRef' otherlv_1= '{' otherlv_2= 'refers' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleAnswerRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1173:28: ( (otherlv_0= 'AnswerRef' otherlv_1= '{' otherlv_2= 'refers' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1174:1: (otherlv_0= 'AnswerRef' otherlv_1= '{' otherlv_2= 'refers' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1174:1: (otherlv_0= 'AnswerRef' otherlv_1= '{' otherlv_2= 'refers' ( ( ruleEString ) ) otherlv_4= '}' )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1174:3: otherlv_0= 'AnswerRef' otherlv_1= '{' otherlv_2= 'refers' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleAnswerRef2607); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerRefAccess().getAnswerRefKeyword_0());
                
            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleAnswerRef2619); 

                	newLeafNode(otherlv_1, grammarAccess.getAnswerRefAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleAnswerRef2631); 

                	newLeafNode(otherlv_2, grammarAccess.getAnswerRefAccess().getRefersKeyword_2());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1186:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1187:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1187:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1188:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAnswerRefRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAnswerRefAccess().getRefersAnswerCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnswerRef2654);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleAnswerRef2666); 

                	newLeafNode(otherlv_4, grammarAccess.getAnswerRefAccess().getRightCurlyBracketKeyword_4());
                

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
            pushFollow(FollowSets000.FOLLOW_ruleChoiceAnswer_in_entryRuleChoiceAnswer2702);
            iv_ruleChoiceAnswer=ruleChoiceAnswer();

            state._fsp--;

             current =iv_ruleChoiceAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleChoiceAnswer2712); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1222:1: ruleChoiceAnswer returns [EObject current=null] : ( ( (lv_selected_0_0= 'selected' ) ) otherlv_1= 'ChoiceAnswer' otherlv_2= '{' otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleChoiceAnswer() throws RecognitionException {
        EObject current = null;

        Token lv_selected_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_text_4_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1225:28: ( ( ( (lv_selected_0_0= 'selected' ) ) otherlv_1= 'ChoiceAnswer' otherlv_2= '{' otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) otherlv_5= '}' ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1226:1: ( ( (lv_selected_0_0= 'selected' ) ) otherlv_1= 'ChoiceAnswer' otherlv_2= '{' otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) otherlv_5= '}' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1226:1: ( ( (lv_selected_0_0= 'selected' ) ) otherlv_1= 'ChoiceAnswer' otherlv_2= '{' otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) otherlv_5= '}' )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1226:2: ( (lv_selected_0_0= 'selected' ) ) otherlv_1= 'ChoiceAnswer' otherlv_2= '{' otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) otherlv_5= '}'
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1226:2: ( (lv_selected_0_0= 'selected' ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1227:1: (lv_selected_0_0= 'selected' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1227:1: (lv_selected_0_0= 'selected' )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1228:3: lv_selected_0_0= 'selected'
            {
            lv_selected_0_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleChoiceAnswer2755); 

                    newLeafNode(lv_selected_0_0, grammarAccess.getChoiceAnswerAccess().getSelectedSelectedKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChoiceAnswerRule());
            	        }
                   		setWithLastConsumed(current, "selected", true, "selected");
            	    

            }


            }

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleChoiceAnswer2780); 

                	newLeafNode(otherlv_1, grammarAccess.getChoiceAnswerAccess().getChoiceAnswerKeyword_1());
                
            otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleChoiceAnswer2792); 

                	newLeafNode(otherlv_2, grammarAccess.getChoiceAnswerAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleChoiceAnswer2804); 

                	newLeafNode(otherlv_3, grammarAccess.getChoiceAnswerAccess().getTextKeyword_3());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1253:1: ( (lv_text_4_0= ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1254:1: (lv_text_4_0= ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1254:1: (lv_text_4_0= ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1255:3: lv_text_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getChoiceAnswerAccess().getTextEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoiceAnswer2825);
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

            otherlv_5=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleChoiceAnswer2837); 

                	newLeafNode(otherlv_5, grammarAccess.getChoiceAnswerAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1283:1: entryRuleFreetextAnswer returns [EObject current=null] : iv_ruleFreetextAnswer= ruleFreetextAnswer EOF ;
    public final EObject entryRuleFreetextAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFreetextAnswer = null;


        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1284:2: (iv_ruleFreetextAnswer= ruleFreetextAnswer EOF )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1285:2: iv_ruleFreetextAnswer= ruleFreetextAnswer EOF
            {
             newCompositeNode(grammarAccess.getFreetextAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFreetextAnswer_in_entryRuleFreetextAnswer2873);
            iv_ruleFreetextAnswer=ruleFreetextAnswer();

            state._fsp--;

             current =iv_ruleFreetextAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFreetextAnswer2883); 

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
    // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1292:1: ruleFreetextAnswer returns [EObject current=null] : (otherlv_0= 'FreetextAnswer' otherlv_1= '{' otherlv_2= 'text' ( (lv_text_3_0= ruleEString ) ) otherlv_4= 'input' ( (lv_input_5_0= ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleFreetextAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_text_3_0 = null;

        AntlrDatatypeRuleToken lv_input_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1295:28: ( (otherlv_0= 'FreetextAnswer' otherlv_1= '{' otherlv_2= 'text' ( (lv_text_3_0= ruleEString ) ) otherlv_4= 'input' ( (lv_input_5_0= ruleEString ) ) otherlv_6= '}' ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1296:1: (otherlv_0= 'FreetextAnswer' otherlv_1= '{' otherlv_2= 'text' ( (lv_text_3_0= ruleEString ) ) otherlv_4= 'input' ( (lv_input_5_0= ruleEString ) ) otherlv_6= '}' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1296:1: (otherlv_0= 'FreetextAnswer' otherlv_1= '{' otherlv_2= 'text' ( (lv_text_3_0= ruleEString ) ) otherlv_4= 'input' ( (lv_input_5_0= ruleEString ) ) otherlv_6= '}' )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1296:3: otherlv_0= 'FreetextAnswer' otherlv_1= '{' otherlv_2= 'text' ( (lv_text_3_0= ruleEString ) ) otherlv_4= 'input' ( (lv_input_5_0= ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleFreetextAnswer2920); 

                	newLeafNode(otherlv_0, grammarAccess.getFreetextAnswerAccess().getFreetextAnswerKeyword_0());
                
            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleFreetextAnswer2932); 

                	newLeafNode(otherlv_1, grammarAccess.getFreetextAnswerAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleFreetextAnswer2944); 

                	newLeafNode(otherlv_2, grammarAccess.getFreetextAnswerAccess().getTextKeyword_2());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1308:1: ( (lv_text_3_0= ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1309:1: (lv_text_3_0= ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1309:1: (lv_text_3_0= ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1310:3: lv_text_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFreetextAnswerAccess().getTextEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFreetextAnswer2965);
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

            otherlv_4=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleFreetextAnswer2977); 

                	newLeafNode(otherlv_4, grammarAccess.getFreetextAnswerAccess().getInputKeyword_4());
                
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1330:1: ( (lv_input_5_0= ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1331:1: (lv_input_5_0= ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1331:1: (lv_input_5_0= ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL/src-gen/dk/itu/smdp/group19/parser/antlr/internal/InternalSurveyDSL.g:1332:3: lv_input_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFreetextAnswerAccess().getInputEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFreetextAnswer2998);
            lv_input_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFreetextAnswerRule());
            	        }
                   		set(
                   			current, 
                   			"input",
                    		lv_input_5_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleFreetextAnswer3010); 

                	newLeafNode(otherlv_6, grammarAccess.getFreetextAnswerAccess().getRightCurlyBracketKeyword_6());
                

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
        public static final BitSet FOLLOW_13_in_ruleSurvey167 = new BitSet(new long[]{0x0000000000190000L});
        public static final BitSet FOLLOW_rulePage_in_ruleSurvey188 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleSurvey201 = new BitSet(new long[]{0x0000000000190000L});
        public static final BitSet FOLLOW_rulePage_in_ruleSurvey222 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleSurvey236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePage_in_entryRulePage272 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePage282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestionPage_in_rulePage329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDescriptionPage_in_rulePage356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResultPage_in_rulePage383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion418 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestion428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFreetextQuestion_in_ruleQuestion475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleChoiceQuestion_in_ruleQuestion502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiChoiceQuestion_in_ruleQuestion529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency564 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDependency574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnd_in_ruleDependency621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOr_in_ruleDependency648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerRef_in_ruleDependency675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer710 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswer720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoiceAnswer_in_ruleAnswer767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFreetextAnswer_in_ruleAnswer794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString830 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestionPage_in_entryRuleQuestionPage952 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestionPage962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleQuestionPage999 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleQuestionPage1011 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQuestionPage1032 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleQuestionPage1045 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQuestionPage1066 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleQuestionPage1080 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleQuestionPage1101 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_14_in_ruleQuestionPage1114 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleQuestionPage1135 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_ruleDescriptionPage_in_entryRuleDescriptionPage1173 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDescriptionPage1183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleDescriptionPage1220 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDescriptionPage1232 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDescriptionPage1253 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_17_in_ruleDescriptionPage1266 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDescriptionPage1287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResultPage_in_entryRuleResultPage1325 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleResultPage1335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleResultPage1372 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleResultPage1384 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleResultPage1405 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_17_in_ruleResultPage1418 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleResultPage1439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFreetextQuestion_in_entryRuleFreetextQuestion1479 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFreetextQuestion1489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleFreetextQuestion1526 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_22_in_ruleFreetextQuestion1544 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleFreetextQuestion1570 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFreetextQuestion1582 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFreetextQuestion1603 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_24_in_ruleFreetextQuestion1616 = new BitSet(new long[]{0x0000001090000000L});
        public static final BitSet FOLLOW_ruleDependency_in_ruleFreetextQuestion1637 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleFreetextQuestion1651 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_ruleFreetextAnswer_in_ruleFreetextQuestion1672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleChoiceQuestion_in_entryRuleSingleChoiceQuestion1708 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleChoiceQuestion1718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleSingleChoiceQuestion1755 = new BitSet(new long[]{0x0000000004400000L});
        public static final BitSet FOLLOW_22_in_ruleSingleChoiceQuestion1773 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleSingleChoiceQuestion1799 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleSingleChoiceQuestion1811 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingleChoiceQuestion1832 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_24_in_ruleSingleChoiceQuestion1845 = new BitSet(new long[]{0x0000001090000000L});
        public static final BitSet FOLLOW_ruleDependency_in_ruleSingleChoiceQuestion1866 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleSingleChoiceQuestion1880 = new BitSet(new long[]{0x0000024000000000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleSingleChoiceQuestion1901 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_14_in_ruleSingleChoiceQuestion1914 = new BitSet(new long[]{0x0000024000000000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleSingleChoiceQuestion1935 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_ruleMultiChoiceQuestion_in_entryRuleMultiChoiceQuestion1973 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiChoiceQuestion1983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleMultiChoiceQuestion2020 = new BitSet(new long[]{0x0000000008400000L});
        public static final BitSet FOLLOW_22_in_ruleMultiChoiceQuestion2038 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleMultiChoiceQuestion2064 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMultiChoiceQuestion2076 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiChoiceQuestion2097 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_24_in_ruleMultiChoiceQuestion2110 = new BitSet(new long[]{0x0000001090000000L});
        public static final BitSet FOLLOW_ruleDependency_in_ruleMultiChoiceQuestion2131 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleMultiChoiceQuestion2145 = new BitSet(new long[]{0x0000024000000000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleMultiChoiceQuestion2166 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_14_in_ruleMultiChoiceQuestion2179 = new BitSet(new long[]{0x0000024000000000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleMultiChoiceQuestion2200 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd2238 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnd2248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleAnd2285 = new BitSet(new long[]{0x0000001090000000L});
        public static final BitSet FOLLOW_ruleDependency_in_ruleAnd2306 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleAnd2318 = new BitSet(new long[]{0x0000001090000000L});
        public static final BitSet FOLLOW_ruleDependency_in_ruleAnd2339 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleAnd2351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOr_in_entryRuleOr2387 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOr2397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleOr2434 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleOr2446 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleOr2458 = new BitSet(new long[]{0x0000001090000000L});
        public static final BitSet FOLLOW_ruleDependency_in_ruleOr2479 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleOr2491 = new BitSet(new long[]{0x0000001090000000L});
        public static final BitSet FOLLOW_ruleDependency_in_ruleOr2512 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleOr2524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerRef_in_entryRuleAnswerRef2560 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswerRef2570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleAnswerRef2607 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleAnswerRef2619 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleAnswerRef2631 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnswerRef2654 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleAnswerRef2666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoiceAnswer_in_entryRuleChoiceAnswer2702 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleChoiceAnswer2712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleChoiceAnswer2755 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleChoiceAnswer2780 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleChoiceAnswer2792 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleChoiceAnswer2804 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoiceAnswer2825 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleChoiceAnswer2837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFreetextAnswer_in_entryRuleFreetextAnswer2873 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFreetextAnswer2883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleFreetextAnswer2920 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleFreetextAnswer2932 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleFreetextAnswer2944 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFreetextAnswer2965 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleFreetextAnswer2977 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFreetextAnswer2998 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleFreetextAnswer3010 = new BitSet(new long[]{0x0000000000000002L});
    }


}