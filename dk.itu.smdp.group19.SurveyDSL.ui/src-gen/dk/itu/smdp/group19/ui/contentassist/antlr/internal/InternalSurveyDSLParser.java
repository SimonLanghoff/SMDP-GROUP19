package dk.itu.smdp.group19.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import dk.itu.smdp.group19.services.SurveyDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSurveyDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'start survey'", "'pages:'", "'end survey'", "'question page'", "'questions:'", "'end page'", "':'", "'description page'", "'result page'", "'free text question'", "'answers:'", "'end question'", "'requires:'", "'single choice question'", "'multi choice question'", "'or'", "'and'", "'not'", "'('", "')'", "'answer choice'", "'answer text'", "'optional'"
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
    public String getGrammarFileName() { return "../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g"; }


     
     	private SurveyDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SurveyDSLGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleSurvey"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:60:1: entryRuleSurvey : ruleSurvey EOF ;
    public final void entryRuleSurvey() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:61:1: ( ruleSurvey EOF )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:62:1: ruleSurvey EOF
            {
             before(grammarAccess.getSurveyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSurvey_in_entryRuleSurvey61);
            ruleSurvey();

            state._fsp--;

             after(grammarAccess.getSurveyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSurvey68); 

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
    // $ANTLR end "entryRuleSurvey"


    // $ANTLR start "ruleSurvey"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:69:1: ruleSurvey : ( ( rule__Survey__Group__0 ) ) ;
    public final void ruleSurvey() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:73:2: ( ( ( rule__Survey__Group__0 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:74:1: ( ( rule__Survey__Group__0 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:74:1: ( ( rule__Survey__Group__0 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:75:1: ( rule__Survey__Group__0 )
            {
             before(grammarAccess.getSurveyAccess().getGroup()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:76:1: ( rule__Survey__Group__0 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:76:2: rule__Survey__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__0_in_ruleSurvey94);
            rule__Survey__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSurvey"


    // $ANTLR start "entryRulePage"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:88:1: entryRulePage : rulePage EOF ;
    public final void entryRulePage() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:89:1: ( rulePage EOF )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:90:1: rulePage EOF
            {
             before(grammarAccess.getPageRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePage_in_entryRulePage121);
            rulePage();

            state._fsp--;

             after(grammarAccess.getPageRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePage128); 

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
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:97:1: rulePage : ( ( rule__Page__Alternatives ) ) ;
    public final void rulePage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:101:2: ( ( ( rule__Page__Alternatives ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:102:1: ( ( rule__Page__Alternatives ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:102:1: ( ( rule__Page__Alternatives ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:103:1: ( rule__Page__Alternatives )
            {
             before(grammarAccess.getPageAccess().getAlternatives()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:104:1: ( rule__Page__Alternatives )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:104:2: rule__Page__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Alternatives_in_rulePage154);
            rule__Page__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleQuestion"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:116:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:117:1: ( ruleQuestion EOF )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:118:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_entryRuleQuestion181);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestion188); 

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
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:125:1: ruleQuestion : ( ( rule__Question__Alternatives ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:129:2: ( ( ( rule__Question__Alternatives ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:130:1: ( ( rule__Question__Alternatives ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:130:1: ( ( rule__Question__Alternatives ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:131:1: ( rule__Question__Alternatives )
            {
             before(grammarAccess.getQuestionAccess().getAlternatives()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:132:1: ( rule__Question__Alternatives )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:132:2: rule__Question__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Alternatives_in_ruleQuestion214);
            rule__Question__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleDependency"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:144:1: entryRuleDependency : ruleDependency EOF ;
    public final void entryRuleDependency() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:145:1: ( ruleDependency EOF )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:146:1: ruleDependency EOF
            {
             before(grammarAccess.getDependencyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_entryRuleDependency241);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getDependencyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDependency248); 

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
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:153:1: ruleDependency : ( ruleCheckOr ) ;
    public final void ruleDependency() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:157:2: ( ( ruleCheckOr ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:158:1: ( ruleCheckOr )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:158:1: ( ruleCheckOr )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:159:1: ruleCheckOr
            {
             before(grammarAccess.getDependencyAccess().getCheckOrParserRuleCall()); 
            pushFollow(FollowSets000.FOLLOW_ruleCheckOr_in_ruleDependency274);
            ruleCheckOr();

            state._fsp--;

             after(grammarAccess.getDependencyAccess().getCheckOrParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleAnswer"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:172:1: entryRuleAnswer : ruleAnswer EOF ;
    public final void entryRuleAnswer() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:173:1: ( ruleAnswer EOF )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:174:1: ruleAnswer EOF
            {
             before(grammarAccess.getAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_entryRuleAnswer300);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswer307); 

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
    // $ANTLR end "entryRuleAnswer"


    // $ANTLR start "ruleAnswer"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:181:1: ruleAnswer : ( ( rule__Answer__Alternatives ) ) ;
    public final void ruleAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:185:2: ( ( ( rule__Answer__Alternatives ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:186:1: ( ( rule__Answer__Alternatives ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:186:1: ( ( rule__Answer__Alternatives ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:187:1: ( rule__Answer__Alternatives )
            {
             before(grammarAccess.getAnswerAccess().getAlternatives()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:188:1: ( rule__Answer__Alternatives )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:188:2: rule__Answer__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Alternatives_in_ruleAnswer333);
            rule__Answer__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAnswerAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnswer"


    // $ANTLR start "entryRuleEString"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:200:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:201:1: ( ruleEString EOF )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:202:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString360);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString367); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:209:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:213:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:214:1: ( ( rule__EString__Alternatives ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:214:1: ( ( rule__EString__Alternatives ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:215:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:216:1: ( rule__EString__Alternatives )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:216:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString393);
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


    // $ANTLR start "entryRuleQuestionPage"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:228:1: entryRuleQuestionPage : ruleQuestionPage EOF ;
    public final void entryRuleQuestionPage() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:229:1: ( ruleQuestionPage EOF )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:230:1: ruleQuestionPage EOF
            {
             before(grammarAccess.getQuestionPageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestionPage_in_entryRuleQuestionPage420);
            ruleQuestionPage();

            state._fsp--;

             after(grammarAccess.getQuestionPageRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestionPage427); 

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
    // $ANTLR end "entryRuleQuestionPage"


    // $ANTLR start "ruleQuestionPage"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:237:1: ruleQuestionPage : ( ( rule__QuestionPage__Group__0 ) ) ;
    public final void ruleQuestionPage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:241:2: ( ( ( rule__QuestionPage__Group__0 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:242:1: ( ( rule__QuestionPage__Group__0 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:242:1: ( ( rule__QuestionPage__Group__0 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:243:1: ( rule__QuestionPage__Group__0 )
            {
             before(grammarAccess.getQuestionPageAccess().getGroup()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:244:1: ( rule__QuestionPage__Group__0 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:244:2: rule__QuestionPage__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__0_in_ruleQuestionPage453);
            rule__QuestionPage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionPageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestionPage"


    // $ANTLR start "entryRuleDescriptionPage"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:256:1: entryRuleDescriptionPage : ruleDescriptionPage EOF ;
    public final void entryRuleDescriptionPage() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:257:1: ( ruleDescriptionPage EOF )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:258:1: ruleDescriptionPage EOF
            {
             before(grammarAccess.getDescriptionPageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDescriptionPage_in_entryRuleDescriptionPage480);
            ruleDescriptionPage();

            state._fsp--;

             after(grammarAccess.getDescriptionPageRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDescriptionPage487); 

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
    // $ANTLR end "entryRuleDescriptionPage"


    // $ANTLR start "ruleDescriptionPage"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:265:1: ruleDescriptionPage : ( ( rule__DescriptionPage__Group__0 ) ) ;
    public final void ruleDescriptionPage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:269:2: ( ( ( rule__DescriptionPage__Group__0 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:270:1: ( ( rule__DescriptionPage__Group__0 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:270:1: ( ( rule__DescriptionPage__Group__0 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:271:1: ( rule__DescriptionPage__Group__0 )
            {
             before(grammarAccess.getDescriptionPageAccess().getGroup()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:272:1: ( rule__DescriptionPage__Group__0 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:272:2: rule__DescriptionPage__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group__0_in_ruleDescriptionPage513);
            rule__DescriptionPage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionPageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDescriptionPage"


    // $ANTLR start "entryRuleResultPage"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:284:1: entryRuleResultPage : ruleResultPage EOF ;
    public final void entryRuleResultPage() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:285:1: ( ruleResultPage EOF )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:286:1: ruleResultPage EOF
            {
             before(grammarAccess.getResultPageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleResultPage_in_entryRuleResultPage540);
            ruleResultPage();

            state._fsp--;

             after(grammarAccess.getResultPageRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleResultPage547); 

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
    // $ANTLR end "entryRuleResultPage"


    // $ANTLR start "ruleResultPage"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:293:1: ruleResultPage : ( ( rule__ResultPage__Group__0 ) ) ;
    public final void ruleResultPage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:297:2: ( ( ( rule__ResultPage__Group__0 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:298:1: ( ( rule__ResultPage__Group__0 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:298:1: ( ( rule__ResultPage__Group__0 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:299:1: ( rule__ResultPage__Group__0 )
            {
             before(grammarAccess.getResultPageAccess().getGroup()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:300:1: ( rule__ResultPage__Group__0 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:300:2: rule__ResultPage__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group__0_in_ruleResultPage573);
            rule__ResultPage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResultPageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResultPage"


    // $ANTLR start "entryRuleFreetextQuestion"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:314:1: entryRuleFreetextQuestion : ruleFreetextQuestion EOF ;
    public final void entryRuleFreetextQuestion() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:315:1: ( ruleFreetextQuestion EOF )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:316:1: ruleFreetextQuestion EOF
            {
             before(grammarAccess.getFreetextQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFreetextQuestion_in_entryRuleFreetextQuestion602);
            ruleFreetextQuestion();

            state._fsp--;

             after(grammarAccess.getFreetextQuestionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFreetextQuestion609); 

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
    // $ANTLR end "entryRuleFreetextQuestion"


    // $ANTLR start "ruleFreetextQuestion"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:323:1: ruleFreetextQuestion : ( ( rule__FreetextQuestion__Group__0 ) ) ;
    public final void ruleFreetextQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:327:2: ( ( ( rule__FreetextQuestion__Group__0 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:328:1: ( ( rule__FreetextQuestion__Group__0 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:328:1: ( ( rule__FreetextQuestion__Group__0 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:329:1: ( rule__FreetextQuestion__Group__0 )
            {
             before(grammarAccess.getFreetextQuestionAccess().getGroup()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:330:1: ( rule__FreetextQuestion__Group__0 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:330:2: rule__FreetextQuestion__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__0_in_ruleFreetextQuestion635);
            rule__FreetextQuestion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFreetextQuestionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFreetextQuestion"


    // $ANTLR start "entryRuleSingleChoiceQuestion"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:342:1: entryRuleSingleChoiceQuestion : ruleSingleChoiceQuestion EOF ;
    public final void entryRuleSingleChoiceQuestion() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:343:1: ( ruleSingleChoiceQuestion EOF )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:344:1: ruleSingleChoiceQuestion EOF
            {
             before(grammarAccess.getSingleChoiceQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleChoiceQuestion_in_entryRuleSingleChoiceQuestion662);
            ruleSingleChoiceQuestion();

            state._fsp--;

             after(grammarAccess.getSingleChoiceQuestionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleChoiceQuestion669); 

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
    // $ANTLR end "entryRuleSingleChoiceQuestion"


    // $ANTLR start "ruleSingleChoiceQuestion"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:351:1: ruleSingleChoiceQuestion : ( ( rule__SingleChoiceQuestion__Group__0 ) ) ;
    public final void ruleSingleChoiceQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:355:2: ( ( ( rule__SingleChoiceQuestion__Group__0 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:356:1: ( ( rule__SingleChoiceQuestion__Group__0 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:356:1: ( ( rule__SingleChoiceQuestion__Group__0 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:357:1: ( rule__SingleChoiceQuestion__Group__0 )
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getGroup()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:358:1: ( rule__SingleChoiceQuestion__Group__0 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:358:2: rule__SingleChoiceQuestion__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__0_in_ruleSingleChoiceQuestion695);
            rule__SingleChoiceQuestion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleChoiceQuestionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingleChoiceQuestion"


    // $ANTLR start "entryRuleMultiChoiceQuestion"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:370:1: entryRuleMultiChoiceQuestion : ruleMultiChoiceQuestion EOF ;
    public final void entryRuleMultiChoiceQuestion() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:371:1: ( ruleMultiChoiceQuestion EOF )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:372:1: ruleMultiChoiceQuestion EOF
            {
             before(grammarAccess.getMultiChoiceQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiChoiceQuestion_in_entryRuleMultiChoiceQuestion722);
            ruleMultiChoiceQuestion();

            state._fsp--;

             after(grammarAccess.getMultiChoiceQuestionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiChoiceQuestion729); 

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
    // $ANTLR end "entryRuleMultiChoiceQuestion"


    // $ANTLR start "ruleMultiChoiceQuestion"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:379:1: ruleMultiChoiceQuestion : ( ( rule__MultiChoiceQuestion__Group__0 ) ) ;
    public final void ruleMultiChoiceQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:383:2: ( ( ( rule__MultiChoiceQuestion__Group__0 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:384:1: ( ( rule__MultiChoiceQuestion__Group__0 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:384:1: ( ( rule__MultiChoiceQuestion__Group__0 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:385:1: ( rule__MultiChoiceQuestion__Group__0 )
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getGroup()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:386:1: ( rule__MultiChoiceQuestion__Group__0 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:386:2: rule__MultiChoiceQuestion__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__0_in_ruleMultiChoiceQuestion755);
            rule__MultiChoiceQuestion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceQuestionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiChoiceQuestion"


    // $ANTLR start "entryRuleCheckOr"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:398:1: entryRuleCheckOr : ruleCheckOr EOF ;
    public final void entryRuleCheckOr() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:399:1: ( ruleCheckOr EOF )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:400:1: ruleCheckOr EOF
            {
             before(grammarAccess.getCheckOrRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCheckOr_in_entryRuleCheckOr782);
            ruleCheckOr();

            state._fsp--;

             after(grammarAccess.getCheckOrRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCheckOr789); 

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
    // $ANTLR end "entryRuleCheckOr"


    // $ANTLR start "ruleCheckOr"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:407:1: ruleCheckOr : ( ( rule__CheckOr__Group__0 ) ) ;
    public final void ruleCheckOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:411:2: ( ( ( rule__CheckOr__Group__0 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:412:1: ( ( rule__CheckOr__Group__0 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:412:1: ( ( rule__CheckOr__Group__0 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:413:1: ( rule__CheckOr__Group__0 )
            {
             before(grammarAccess.getCheckOrAccess().getGroup()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:414:1: ( rule__CheckOr__Group__0 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:414:2: rule__CheckOr__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckOr__Group__0_in_ruleCheckOr815);
            rule__CheckOr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckOrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCheckOr"


    // $ANTLR start "entryRuleCheckAnd"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:426:1: entryRuleCheckAnd : ruleCheckAnd EOF ;
    public final void entryRuleCheckAnd() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:427:1: ( ruleCheckAnd EOF )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:428:1: ruleCheckAnd EOF
            {
             before(grammarAccess.getCheckAndRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCheckAnd_in_entryRuleCheckAnd842);
            ruleCheckAnd();

            state._fsp--;

             after(grammarAccess.getCheckAndRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCheckAnd849); 

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
    // $ANTLR end "entryRuleCheckAnd"


    // $ANTLR start "ruleCheckAnd"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:435:1: ruleCheckAnd : ( ( rule__CheckAnd__Group__0 ) ) ;
    public final void ruleCheckAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:439:2: ( ( ( rule__CheckAnd__Group__0 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:440:1: ( ( rule__CheckAnd__Group__0 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:440:1: ( ( rule__CheckAnd__Group__0 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:441:1: ( rule__CheckAnd__Group__0 )
            {
             before(grammarAccess.getCheckAndAccess().getGroup()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:442:1: ( rule__CheckAnd__Group__0 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:442:2: rule__CheckAnd__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckAnd__Group__0_in_ruleCheckAnd875);
            rule__CheckAnd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckAndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCheckAnd"


    // $ANTLR start "entryRuleCheckNot"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:454:1: entryRuleCheckNot : ruleCheckNot EOF ;
    public final void entryRuleCheckNot() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:455:1: ( ruleCheckNot EOF )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:456:1: ruleCheckNot EOF
            {
             before(grammarAccess.getCheckNotRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCheckNot_in_entryRuleCheckNot902);
            ruleCheckNot();

            state._fsp--;

             after(grammarAccess.getCheckNotRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCheckNot909); 

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
    // $ANTLR end "entryRuleCheckNot"


    // $ANTLR start "ruleCheckNot"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:463:1: ruleCheckNot : ( ( rule__CheckNot__Alternatives ) ) ;
    public final void ruleCheckNot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:467:2: ( ( ( rule__CheckNot__Alternatives ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:468:1: ( ( rule__CheckNot__Alternatives ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:468:1: ( ( rule__CheckNot__Alternatives ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:469:1: ( rule__CheckNot__Alternatives )
            {
             before(grammarAccess.getCheckNotAccess().getAlternatives()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:470:1: ( rule__CheckNot__Alternatives )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:470:2: rule__CheckNot__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckNot__Alternatives_in_ruleCheckNot935);
            rule__CheckNot__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCheckNotAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCheckNot"


    // $ANTLR start "entryRuleBottom"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:482:1: entryRuleBottom : ruleBottom EOF ;
    public final void entryRuleBottom() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:483:1: ( ruleBottom EOF )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:484:1: ruleBottom EOF
            {
             before(grammarAccess.getBottomRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBottom_in_entryRuleBottom962);
            ruleBottom();

            state._fsp--;

             after(grammarAccess.getBottomRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBottom969); 

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
    // $ANTLR end "entryRuleBottom"


    // $ANTLR start "ruleBottom"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:491:1: ruleBottom : ( ( rule__Bottom__Alternatives ) ) ;
    public final void ruleBottom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:495:2: ( ( ( rule__Bottom__Alternatives ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:496:1: ( ( rule__Bottom__Alternatives ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:496:1: ( ( rule__Bottom__Alternatives ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:497:1: ( rule__Bottom__Alternatives )
            {
             before(grammarAccess.getBottomAccess().getAlternatives()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:498:1: ( rule__Bottom__Alternatives )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:498:2: rule__Bottom__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Bottom__Alternatives_in_ruleBottom995);
            rule__Bottom__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBottomAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBottom"


    // $ANTLR start "entryRuleAnswerRef"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:510:1: entryRuleAnswerRef : ruleAnswerRef EOF ;
    public final void entryRuleAnswerRef() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:511:1: ( ruleAnswerRef EOF )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:512:1: ruleAnswerRef EOF
            {
             before(grammarAccess.getAnswerRefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswerRef_in_entryRuleAnswerRef1022);
            ruleAnswerRef();

            state._fsp--;

             after(grammarAccess.getAnswerRefRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswerRef1029); 

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
    // $ANTLR end "entryRuleAnswerRef"


    // $ANTLR start "ruleAnswerRef"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:519:1: ruleAnswerRef : ( ( rule__AnswerRef__RefersAssignment ) ) ;
    public final void ruleAnswerRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:523:2: ( ( ( rule__AnswerRef__RefersAssignment ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:524:1: ( ( rule__AnswerRef__RefersAssignment ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:524:1: ( ( rule__AnswerRef__RefersAssignment ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:525:1: ( rule__AnswerRef__RefersAssignment )
            {
             before(grammarAccess.getAnswerRefAccess().getRefersAssignment()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:526:1: ( rule__AnswerRef__RefersAssignment )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:526:2: rule__AnswerRef__RefersAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnswerRef__RefersAssignment_in_ruleAnswerRef1055);
            rule__AnswerRef__RefersAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAnswerRefAccess().getRefersAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnswerRef"


    // $ANTLR start "entryRuleChoiceAnswer"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:538:1: entryRuleChoiceAnswer : ruleChoiceAnswer EOF ;
    public final void entryRuleChoiceAnswer() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:539:1: ( ruleChoiceAnswer EOF )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:540:1: ruleChoiceAnswer EOF
            {
             before(grammarAccess.getChoiceAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleChoiceAnswer_in_entryRuleChoiceAnswer1082);
            ruleChoiceAnswer();

            state._fsp--;

             after(grammarAccess.getChoiceAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleChoiceAnswer1089); 

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
    // $ANTLR end "entryRuleChoiceAnswer"


    // $ANTLR start "ruleChoiceAnswer"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:547:1: ruleChoiceAnswer : ( ( rule__ChoiceAnswer__Group__0 ) ) ;
    public final void ruleChoiceAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:551:2: ( ( ( rule__ChoiceAnswer__Group__0 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:552:1: ( ( rule__ChoiceAnswer__Group__0 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:552:1: ( ( rule__ChoiceAnswer__Group__0 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:553:1: ( rule__ChoiceAnswer__Group__0 )
            {
             before(grammarAccess.getChoiceAnswerAccess().getGroup()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:554:1: ( rule__ChoiceAnswer__Group__0 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:554:2: rule__ChoiceAnswer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__Group__0_in_ruleChoiceAnswer1115);
            rule__ChoiceAnswer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAnswerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChoiceAnswer"


    // $ANTLR start "entryRuleFreetextAnswer"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:566:1: entryRuleFreetextAnswer : ruleFreetextAnswer EOF ;
    public final void entryRuleFreetextAnswer() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:567:1: ( ruleFreetextAnswer EOF )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:568:1: ruleFreetextAnswer EOF
            {
             before(grammarAccess.getFreetextAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFreetextAnswer_in_entryRuleFreetextAnswer1142);
            ruleFreetextAnswer();

            state._fsp--;

             after(grammarAccess.getFreetextAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFreetextAnswer1149); 

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
    // $ANTLR end "entryRuleFreetextAnswer"


    // $ANTLR start "ruleFreetextAnswer"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:575:1: ruleFreetextAnswer : ( ( rule__FreetextAnswer__Group__0 ) ) ;
    public final void ruleFreetextAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:579:2: ( ( ( rule__FreetextAnswer__Group__0 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:580:1: ( ( rule__FreetextAnswer__Group__0 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:580:1: ( ( rule__FreetextAnswer__Group__0 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:581:1: ( rule__FreetextAnswer__Group__0 )
            {
             before(grammarAccess.getFreetextAnswerAccess().getGroup()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:582:1: ( rule__FreetextAnswer__Group__0 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:582:2: rule__FreetextAnswer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__0_in_ruleFreetextAnswer1175);
            rule__FreetextAnswer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFreetextAnswerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFreetextAnswer"


    // $ANTLR start "rule__Page__Alternatives"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:594:1: rule__Page__Alternatives : ( ( ruleQuestionPage ) | ( ruleDescriptionPage ) | ( ruleResultPage ) );
    public final void rule__Page__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:598:1: ( ( ruleQuestionPage ) | ( ruleDescriptionPage ) | ( ruleResultPage ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt1=1;
                }
                break;
            case 18:
                {
                alt1=2;
                }
                break;
            case 19:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:599:1: ( ruleQuestionPage )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:599:1: ( ruleQuestionPage )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:600:1: ruleQuestionPage
                    {
                     before(grammarAccess.getPageAccess().getQuestionPageParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleQuestionPage_in_rule__Page__Alternatives1211);
                    ruleQuestionPage();

                    state._fsp--;

                     after(grammarAccess.getPageAccess().getQuestionPageParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:605:6: ( ruleDescriptionPage )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:605:6: ( ruleDescriptionPage )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:606:1: ruleDescriptionPage
                    {
                     before(grammarAccess.getPageAccess().getDescriptionPageParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleDescriptionPage_in_rule__Page__Alternatives1228);
                    ruleDescriptionPage();

                    state._fsp--;

                     after(grammarAccess.getPageAccess().getDescriptionPageParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:611:6: ( ruleResultPage )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:611:6: ( ruleResultPage )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:612:1: ruleResultPage
                    {
                     before(grammarAccess.getPageAccess().getResultPageParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleResultPage_in_rule__Page__Alternatives1245);
                    ruleResultPage();

                    state._fsp--;

                     after(grammarAccess.getPageAccess().getResultPageParserRuleCall_2()); 

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
    // $ANTLR end "rule__Page__Alternatives"


    // $ANTLR start "rule__Question__Alternatives"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:622:1: rule__Question__Alternatives : ( ( ruleFreetextQuestion ) | ( ruleSingleChoiceQuestion ) | ( ruleMultiChoiceQuestion ) );
    public final void rule__Question__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:626:1: ( ( ruleFreetextQuestion ) | ( ruleSingleChoiceQuestion ) | ( ruleMultiChoiceQuestion ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                switch ( input.LA(2) ) {
                case 24:
                    {
                    alt2=2;
                    }
                    break;
                case 20:
                    {
                    alt2=1;
                    }
                    break;
                case 25:
                    {
                    alt2=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

                }
                break;
            case 20:
                {
                alt2=1;
                }
                break;
            case 24:
                {
                alt2=2;
                }
                break;
            case 25:
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
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:627:1: ( ruleFreetextQuestion )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:627:1: ( ruleFreetextQuestion )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:628:1: ruleFreetextQuestion
                    {
                     before(grammarAccess.getQuestionAccess().getFreetextQuestionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleFreetextQuestion_in_rule__Question__Alternatives1277);
                    ruleFreetextQuestion();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getFreetextQuestionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:633:6: ( ruleSingleChoiceQuestion )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:633:6: ( ruleSingleChoiceQuestion )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:634:1: ruleSingleChoiceQuestion
                    {
                     before(grammarAccess.getQuestionAccess().getSingleChoiceQuestionParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSingleChoiceQuestion_in_rule__Question__Alternatives1294);
                    ruleSingleChoiceQuestion();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getSingleChoiceQuestionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:639:6: ( ruleMultiChoiceQuestion )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:639:6: ( ruleMultiChoiceQuestion )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:640:1: ruleMultiChoiceQuestion
                    {
                     before(grammarAccess.getQuestionAccess().getMultiChoiceQuestionParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMultiChoiceQuestion_in_rule__Question__Alternatives1311);
                    ruleMultiChoiceQuestion();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getMultiChoiceQuestionParserRuleCall_2()); 

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
    // $ANTLR end "rule__Question__Alternatives"


    // $ANTLR start "rule__Answer__Alternatives"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:650:1: rule__Answer__Alternatives : ( ( ruleChoiceAnswer ) | ( ruleFreetextAnswer ) );
    public final void rule__Answer__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:654:1: ( ( ruleChoiceAnswer ) | ( ruleFreetextAnswer ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==31) ) {
                alt3=1;
            }
            else if ( (LA3_0==32) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:655:1: ( ruleChoiceAnswer )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:655:1: ( ruleChoiceAnswer )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:656:1: ruleChoiceAnswer
                    {
                     before(grammarAccess.getAnswerAccess().getChoiceAnswerParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleChoiceAnswer_in_rule__Answer__Alternatives1343);
                    ruleChoiceAnswer();

                    state._fsp--;

                     after(grammarAccess.getAnswerAccess().getChoiceAnswerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:661:6: ( ruleFreetextAnswer )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:661:6: ( ruleFreetextAnswer )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:662:1: ruleFreetextAnswer
                    {
                     before(grammarAccess.getAnswerAccess().getFreetextAnswerParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleFreetextAnswer_in_rule__Answer__Alternatives1360);
                    ruleFreetextAnswer();

                    state._fsp--;

                     after(grammarAccess.getAnswerAccess().getFreetextAnswerParserRuleCall_1()); 

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
    // $ANTLR end "rule__Answer__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:672:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:676:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:677:1: ( RULE_STRING )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:677:1: ( RULE_STRING )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:678:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1392); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:683:6: ( RULE_ID )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:683:6: ( RULE_ID )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:684:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1409); 
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


    // $ANTLR start "rule__CheckNot__Alternatives"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:695:1: rule__CheckNot__Alternatives : ( ( ( rule__CheckNot__Group_0__0 ) ) | ( ruleBottom ) );
    public final void rule__CheckNot__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:699:1: ( ( ( rule__CheckNot__Group_0__0 ) ) | ( ruleBottom ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)||LA5_0==29) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:700:1: ( ( rule__CheckNot__Group_0__0 ) )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:700:1: ( ( rule__CheckNot__Group_0__0 ) )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:701:1: ( rule__CheckNot__Group_0__0 )
                    {
                     before(grammarAccess.getCheckNotAccess().getGroup_0()); 
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:702:1: ( rule__CheckNot__Group_0__0 )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:702:2: rule__CheckNot__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CheckNot__Group_0__0_in_rule__CheckNot__Alternatives1442);
                    rule__CheckNot__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCheckNotAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:706:6: ( ruleBottom )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:706:6: ( ruleBottom )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:707:1: ruleBottom
                    {
                     before(grammarAccess.getCheckNotAccess().getBottomParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBottom_in_rule__CheckNot__Alternatives1460);
                    ruleBottom();

                    state._fsp--;

                     after(grammarAccess.getCheckNotAccess().getBottomParserRuleCall_1()); 

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
    // $ANTLR end "rule__CheckNot__Alternatives"


    // $ANTLR start "rule__Bottom__Alternatives"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:717:1: rule__Bottom__Alternatives : ( ( ruleAnswerRef ) | ( ( rule__Bottom__Group_1__0 ) ) );
    public final void rule__Bottom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:721:1: ( ( ruleAnswerRef ) | ( ( rule__Bottom__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                alt6=1;
            }
            else if ( (LA6_0==29) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:722:1: ( ruleAnswerRef )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:722:1: ( ruleAnswerRef )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:723:1: ruleAnswerRef
                    {
                     before(grammarAccess.getBottomAccess().getAnswerRefParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAnswerRef_in_rule__Bottom__Alternatives1492);
                    ruleAnswerRef();

                    state._fsp--;

                     after(grammarAccess.getBottomAccess().getAnswerRefParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:728:6: ( ( rule__Bottom__Group_1__0 ) )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:728:6: ( ( rule__Bottom__Group_1__0 ) )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:729:1: ( rule__Bottom__Group_1__0 )
                    {
                     before(grammarAccess.getBottomAccess().getGroup_1()); 
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:730:1: ( rule__Bottom__Group_1__0 )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:730:2: rule__Bottom__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Bottom__Group_1__0_in_rule__Bottom__Alternatives1509);
                    rule__Bottom__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBottomAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Bottom__Alternatives"


    // $ANTLR start "rule__Survey__Group__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:741:1: rule__Survey__Group__0 : rule__Survey__Group__0__Impl rule__Survey__Group__1 ;
    public final void rule__Survey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:745:1: ( rule__Survey__Group__0__Impl rule__Survey__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:746:2: rule__Survey__Group__0__Impl rule__Survey__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__0__Impl_in_rule__Survey__Group__01540);
            rule__Survey__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__1_in_rule__Survey__Group__01543);
            rule__Survey__Group__1();

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
    // $ANTLR end "rule__Survey__Group__0"


    // $ANTLR start "rule__Survey__Group__0__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:753:1: rule__Survey__Group__0__Impl : ( 'start survey' ) ;
    public final void rule__Survey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:757:1: ( ( 'start survey' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:758:1: ( 'start survey' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:758:1: ( 'start survey' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:759:1: 'start survey'
            {
             before(grammarAccess.getSurveyAccess().getStartSurveyKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Survey__Group__0__Impl1571); 
             after(grammarAccess.getSurveyAccess().getStartSurveyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__0__Impl"


    // $ANTLR start "rule__Survey__Group__1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:772:1: rule__Survey__Group__1 : rule__Survey__Group__1__Impl rule__Survey__Group__2 ;
    public final void rule__Survey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:776:1: ( rule__Survey__Group__1__Impl rule__Survey__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:777:2: rule__Survey__Group__1__Impl rule__Survey__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__1__Impl_in_rule__Survey__Group__11602);
            rule__Survey__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__2_in_rule__Survey__Group__11605);
            rule__Survey__Group__2();

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
    // $ANTLR end "rule__Survey__Group__1"


    // $ANTLR start "rule__Survey__Group__1__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:784:1: rule__Survey__Group__1__Impl : ( ( rule__Survey__TitleAssignment_1 ) ) ;
    public final void rule__Survey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:788:1: ( ( ( rule__Survey__TitleAssignment_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:789:1: ( ( rule__Survey__TitleAssignment_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:789:1: ( ( rule__Survey__TitleAssignment_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:790:1: ( rule__Survey__TitleAssignment_1 )
            {
             before(grammarAccess.getSurveyAccess().getTitleAssignment_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:791:1: ( rule__Survey__TitleAssignment_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:791:2: rule__Survey__TitleAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__TitleAssignment_1_in_rule__Survey__Group__1__Impl1632);
            rule__Survey__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getTitleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__1__Impl"


    // $ANTLR start "rule__Survey__Group__2"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:801:1: rule__Survey__Group__2 : rule__Survey__Group__2__Impl rule__Survey__Group__3 ;
    public final void rule__Survey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:805:1: ( rule__Survey__Group__2__Impl rule__Survey__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:806:2: rule__Survey__Group__2__Impl rule__Survey__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__2__Impl_in_rule__Survey__Group__21662);
            rule__Survey__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__3_in_rule__Survey__Group__21665);
            rule__Survey__Group__3();

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
    // $ANTLR end "rule__Survey__Group__2"


    // $ANTLR start "rule__Survey__Group__2__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:813:1: rule__Survey__Group__2__Impl : ( 'pages:' ) ;
    public final void rule__Survey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:817:1: ( ( 'pages:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:818:1: ( 'pages:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:818:1: ( 'pages:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:819:1: 'pages:'
            {
             before(grammarAccess.getSurveyAccess().getPagesKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Survey__Group__2__Impl1693); 
             after(grammarAccess.getSurveyAccess().getPagesKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__2__Impl"


    // $ANTLR start "rule__Survey__Group__3"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:832:1: rule__Survey__Group__3 : rule__Survey__Group__3__Impl rule__Survey__Group__4 ;
    public final void rule__Survey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:836:1: ( rule__Survey__Group__3__Impl rule__Survey__Group__4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:837:2: rule__Survey__Group__3__Impl rule__Survey__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__3__Impl_in_rule__Survey__Group__31724);
            rule__Survey__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__4_in_rule__Survey__Group__31727);
            rule__Survey__Group__4();

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
    // $ANTLR end "rule__Survey__Group__3"


    // $ANTLR start "rule__Survey__Group__3__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:844:1: rule__Survey__Group__3__Impl : ( ( rule__Survey__PagesAssignment_3 ) ) ;
    public final void rule__Survey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:848:1: ( ( ( rule__Survey__PagesAssignment_3 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:849:1: ( ( rule__Survey__PagesAssignment_3 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:849:1: ( ( rule__Survey__PagesAssignment_3 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:850:1: ( rule__Survey__PagesAssignment_3 )
            {
             before(grammarAccess.getSurveyAccess().getPagesAssignment_3()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:851:1: ( rule__Survey__PagesAssignment_3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:851:2: rule__Survey__PagesAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__PagesAssignment_3_in_rule__Survey__Group__3__Impl1754);
            rule__Survey__PagesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getPagesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__3__Impl"


    // $ANTLR start "rule__Survey__Group__4"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:861:1: rule__Survey__Group__4 : rule__Survey__Group__4__Impl rule__Survey__Group__5 ;
    public final void rule__Survey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:865:1: ( rule__Survey__Group__4__Impl rule__Survey__Group__5 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:866:2: rule__Survey__Group__4__Impl rule__Survey__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__4__Impl_in_rule__Survey__Group__41784);
            rule__Survey__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__5_in_rule__Survey__Group__41787);
            rule__Survey__Group__5();

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
    // $ANTLR end "rule__Survey__Group__4"


    // $ANTLR start "rule__Survey__Group__4__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:873:1: rule__Survey__Group__4__Impl : ( ( rule__Survey__PagesAssignment_4 )* ) ;
    public final void rule__Survey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:877:1: ( ( ( rule__Survey__PagesAssignment_4 )* ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:878:1: ( ( rule__Survey__PagesAssignment_4 )* )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:878:1: ( ( rule__Survey__PagesAssignment_4 )* )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:879:1: ( rule__Survey__PagesAssignment_4 )*
            {
             before(grammarAccess.getSurveyAccess().getPagesAssignment_4()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:880:1: ( rule__Survey__PagesAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14||(LA7_0>=18 && LA7_0<=19)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:880:2: rule__Survey__PagesAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Survey__PagesAssignment_4_in_rule__Survey__Group__4__Impl1814);
            	    rule__Survey__PagesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSurveyAccess().getPagesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__4__Impl"


    // $ANTLR start "rule__Survey__Group__5"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:890:1: rule__Survey__Group__5 : rule__Survey__Group__5__Impl ;
    public final void rule__Survey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:894:1: ( rule__Survey__Group__5__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:895:2: rule__Survey__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__5__Impl_in_rule__Survey__Group__51845);
            rule__Survey__Group__5__Impl();

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
    // $ANTLR end "rule__Survey__Group__5"


    // $ANTLR start "rule__Survey__Group__5__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:901:1: rule__Survey__Group__5__Impl : ( 'end survey' ) ;
    public final void rule__Survey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:905:1: ( ( 'end survey' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:906:1: ( 'end survey' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:906:1: ( 'end survey' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:907:1: 'end survey'
            {
             before(grammarAccess.getSurveyAccess().getEndSurveyKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Survey__Group__5__Impl1873); 
             after(grammarAccess.getSurveyAccess().getEndSurveyKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__5__Impl"


    // $ANTLR start "rule__QuestionPage__Group__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:932:1: rule__QuestionPage__Group__0 : rule__QuestionPage__Group__0__Impl rule__QuestionPage__Group__1 ;
    public final void rule__QuestionPage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:936:1: ( rule__QuestionPage__Group__0__Impl rule__QuestionPage__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:937:2: rule__QuestionPage__Group__0__Impl rule__QuestionPage__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__0__Impl_in_rule__QuestionPage__Group__01916);
            rule__QuestionPage__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__1_in_rule__QuestionPage__Group__01919);
            rule__QuestionPage__Group__1();

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
    // $ANTLR end "rule__QuestionPage__Group__0"


    // $ANTLR start "rule__QuestionPage__Group__0__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:944:1: rule__QuestionPage__Group__0__Impl : ( 'question page' ) ;
    public final void rule__QuestionPage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:948:1: ( ( 'question page' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:949:1: ( 'question page' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:949:1: ( 'question page' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:950:1: 'question page'
            {
             before(grammarAccess.getQuestionPageAccess().getQuestionPageKeyword_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__QuestionPage__Group__0__Impl1947); 
             after(grammarAccess.getQuestionPageAccess().getQuestionPageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionPage__Group__0__Impl"


    // $ANTLR start "rule__QuestionPage__Group__1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:963:1: rule__QuestionPage__Group__1 : rule__QuestionPage__Group__1__Impl rule__QuestionPage__Group__2 ;
    public final void rule__QuestionPage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:967:1: ( rule__QuestionPage__Group__1__Impl rule__QuestionPage__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:968:2: rule__QuestionPage__Group__1__Impl rule__QuestionPage__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__1__Impl_in_rule__QuestionPage__Group__11978);
            rule__QuestionPage__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__2_in_rule__QuestionPage__Group__11981);
            rule__QuestionPage__Group__2();

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
    // $ANTLR end "rule__QuestionPage__Group__1"


    // $ANTLR start "rule__QuestionPage__Group__1__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:975:1: rule__QuestionPage__Group__1__Impl : ( ( rule__QuestionPage__TitleAssignment_1 ) ) ;
    public final void rule__QuestionPage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:979:1: ( ( ( rule__QuestionPage__TitleAssignment_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:980:1: ( ( rule__QuestionPage__TitleAssignment_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:980:1: ( ( rule__QuestionPage__TitleAssignment_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:981:1: ( rule__QuestionPage__TitleAssignment_1 )
            {
             before(grammarAccess.getQuestionPageAccess().getTitleAssignment_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:982:1: ( rule__QuestionPage__TitleAssignment_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:982:2: rule__QuestionPage__TitleAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__TitleAssignment_1_in_rule__QuestionPage__Group__1__Impl2008);
            rule__QuestionPage__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionPageAccess().getTitleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionPage__Group__1__Impl"


    // $ANTLR start "rule__QuestionPage__Group__2"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:992:1: rule__QuestionPage__Group__2 : rule__QuestionPage__Group__2__Impl rule__QuestionPage__Group__3 ;
    public final void rule__QuestionPage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:996:1: ( rule__QuestionPage__Group__2__Impl rule__QuestionPage__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:997:2: rule__QuestionPage__Group__2__Impl rule__QuestionPage__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__2__Impl_in_rule__QuestionPage__Group__22038);
            rule__QuestionPage__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__3_in_rule__QuestionPage__Group__22041);
            rule__QuestionPage__Group__3();

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
    // $ANTLR end "rule__QuestionPage__Group__2"


    // $ANTLR start "rule__QuestionPage__Group__2__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1004:1: rule__QuestionPage__Group__2__Impl : ( ( rule__QuestionPage__Group_2__0 )? ) ;
    public final void rule__QuestionPage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1008:1: ( ( ( rule__QuestionPage__Group_2__0 )? ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1009:1: ( ( rule__QuestionPage__Group_2__0 )? )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1009:1: ( ( rule__QuestionPage__Group_2__0 )? )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1010:1: ( rule__QuestionPage__Group_2__0 )?
            {
             before(grammarAccess.getQuestionPageAccess().getGroup_2()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1011:1: ( rule__QuestionPage__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1011:2: rule__QuestionPage__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group_2__0_in_rule__QuestionPage__Group__2__Impl2068);
                    rule__QuestionPage__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionPageAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionPage__Group__2__Impl"


    // $ANTLR start "rule__QuestionPage__Group__3"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1021:1: rule__QuestionPage__Group__3 : rule__QuestionPage__Group__3__Impl rule__QuestionPage__Group__4 ;
    public final void rule__QuestionPage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1025:1: ( rule__QuestionPage__Group__3__Impl rule__QuestionPage__Group__4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1026:2: rule__QuestionPage__Group__3__Impl rule__QuestionPage__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__3__Impl_in_rule__QuestionPage__Group__32099);
            rule__QuestionPage__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__4_in_rule__QuestionPage__Group__32102);
            rule__QuestionPage__Group__4();

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
    // $ANTLR end "rule__QuestionPage__Group__3"


    // $ANTLR start "rule__QuestionPage__Group__3__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1033:1: rule__QuestionPage__Group__3__Impl : ( 'questions:' ) ;
    public final void rule__QuestionPage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1037:1: ( ( 'questions:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1038:1: ( 'questions:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1038:1: ( 'questions:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1039:1: 'questions:'
            {
             before(grammarAccess.getQuestionPageAccess().getQuestionsKeyword_3()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__QuestionPage__Group__3__Impl2130); 
             after(grammarAccess.getQuestionPageAccess().getQuestionsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionPage__Group__3__Impl"


    // $ANTLR start "rule__QuestionPage__Group__4"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1052:1: rule__QuestionPage__Group__4 : rule__QuestionPage__Group__4__Impl rule__QuestionPage__Group__5 ;
    public final void rule__QuestionPage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1056:1: ( rule__QuestionPage__Group__4__Impl rule__QuestionPage__Group__5 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1057:2: rule__QuestionPage__Group__4__Impl rule__QuestionPage__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__4__Impl_in_rule__QuestionPage__Group__42161);
            rule__QuestionPage__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__5_in_rule__QuestionPage__Group__42164);
            rule__QuestionPage__Group__5();

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
    // $ANTLR end "rule__QuestionPage__Group__4"


    // $ANTLR start "rule__QuestionPage__Group__4__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1064:1: rule__QuestionPage__Group__4__Impl : ( ( rule__QuestionPage__QuestionsAssignment_4 ) ) ;
    public final void rule__QuestionPage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1068:1: ( ( ( rule__QuestionPage__QuestionsAssignment_4 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1069:1: ( ( rule__QuestionPage__QuestionsAssignment_4 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1069:1: ( ( rule__QuestionPage__QuestionsAssignment_4 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1070:1: ( rule__QuestionPage__QuestionsAssignment_4 )
            {
             before(grammarAccess.getQuestionPageAccess().getQuestionsAssignment_4()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1071:1: ( rule__QuestionPage__QuestionsAssignment_4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1071:2: rule__QuestionPage__QuestionsAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__QuestionsAssignment_4_in_rule__QuestionPage__Group__4__Impl2191);
            rule__QuestionPage__QuestionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getQuestionPageAccess().getQuestionsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionPage__Group__4__Impl"


    // $ANTLR start "rule__QuestionPage__Group__5"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1081:1: rule__QuestionPage__Group__5 : rule__QuestionPage__Group__5__Impl rule__QuestionPage__Group__6 ;
    public final void rule__QuestionPage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1085:1: ( rule__QuestionPage__Group__5__Impl rule__QuestionPage__Group__6 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1086:2: rule__QuestionPage__Group__5__Impl rule__QuestionPage__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__5__Impl_in_rule__QuestionPage__Group__52221);
            rule__QuestionPage__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__6_in_rule__QuestionPage__Group__52224);
            rule__QuestionPage__Group__6();

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
    // $ANTLR end "rule__QuestionPage__Group__5"


    // $ANTLR start "rule__QuestionPage__Group__5__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1093:1: rule__QuestionPage__Group__5__Impl : ( ( rule__QuestionPage__QuestionsAssignment_5 )* ) ;
    public final void rule__QuestionPage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1097:1: ( ( ( rule__QuestionPage__QuestionsAssignment_5 )* ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1098:1: ( ( rule__QuestionPage__QuestionsAssignment_5 )* )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1098:1: ( ( rule__QuestionPage__QuestionsAssignment_5 )* )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1099:1: ( rule__QuestionPage__QuestionsAssignment_5 )*
            {
             before(grammarAccess.getQuestionPageAccess().getQuestionsAssignment_5()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1100:1: ( rule__QuestionPage__QuestionsAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20||(LA9_0>=24 && LA9_0<=25)||LA9_0==33) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1100:2: rule__QuestionPage__QuestionsAssignment_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__QuestionsAssignment_5_in_rule__QuestionPage__Group__5__Impl2251);
            	    rule__QuestionPage__QuestionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getQuestionPageAccess().getQuestionsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionPage__Group__5__Impl"


    // $ANTLR start "rule__QuestionPage__Group__6"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1110:1: rule__QuestionPage__Group__6 : rule__QuestionPage__Group__6__Impl ;
    public final void rule__QuestionPage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1114:1: ( rule__QuestionPage__Group__6__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1115:2: rule__QuestionPage__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__6__Impl_in_rule__QuestionPage__Group__62282);
            rule__QuestionPage__Group__6__Impl();

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
    // $ANTLR end "rule__QuestionPage__Group__6"


    // $ANTLR start "rule__QuestionPage__Group__6__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1121:1: rule__QuestionPage__Group__6__Impl : ( 'end page' ) ;
    public final void rule__QuestionPage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1125:1: ( ( 'end page' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1126:1: ( 'end page' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1126:1: ( 'end page' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1127:1: 'end page'
            {
             before(grammarAccess.getQuestionPageAccess().getEndPageKeyword_6()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__QuestionPage__Group__6__Impl2310); 
             after(grammarAccess.getQuestionPageAccess().getEndPageKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionPage__Group__6__Impl"


    // $ANTLR start "rule__QuestionPage__Group_2__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1154:1: rule__QuestionPage__Group_2__0 : rule__QuestionPage__Group_2__0__Impl rule__QuestionPage__Group_2__1 ;
    public final void rule__QuestionPage__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1158:1: ( rule__QuestionPage__Group_2__0__Impl rule__QuestionPage__Group_2__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1159:2: rule__QuestionPage__Group_2__0__Impl rule__QuestionPage__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group_2__0__Impl_in_rule__QuestionPage__Group_2__02355);
            rule__QuestionPage__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group_2__1_in_rule__QuestionPage__Group_2__02358);
            rule__QuestionPage__Group_2__1();

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
    // $ANTLR end "rule__QuestionPage__Group_2__0"


    // $ANTLR start "rule__QuestionPage__Group_2__0__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1166:1: rule__QuestionPage__Group_2__0__Impl : ( ':' ) ;
    public final void rule__QuestionPage__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1170:1: ( ( ':' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1171:1: ( ':' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1171:1: ( ':' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1172:1: ':'
            {
             before(grammarAccess.getQuestionPageAccess().getColonKeyword_2_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__QuestionPage__Group_2__0__Impl2386); 
             after(grammarAccess.getQuestionPageAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionPage__Group_2__0__Impl"


    // $ANTLR start "rule__QuestionPage__Group_2__1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1185:1: rule__QuestionPage__Group_2__1 : rule__QuestionPage__Group_2__1__Impl ;
    public final void rule__QuestionPage__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1189:1: ( rule__QuestionPage__Group_2__1__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1190:2: rule__QuestionPage__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group_2__1__Impl_in_rule__QuestionPage__Group_2__12417);
            rule__QuestionPage__Group_2__1__Impl();

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
    // $ANTLR end "rule__QuestionPage__Group_2__1"


    // $ANTLR start "rule__QuestionPage__Group_2__1__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1196:1: rule__QuestionPage__Group_2__1__Impl : ( ( rule__QuestionPage__TextAssignment_2_1 ) ) ;
    public final void rule__QuestionPage__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1200:1: ( ( ( rule__QuestionPage__TextAssignment_2_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1201:1: ( ( rule__QuestionPage__TextAssignment_2_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1201:1: ( ( rule__QuestionPage__TextAssignment_2_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1202:1: ( rule__QuestionPage__TextAssignment_2_1 )
            {
             before(grammarAccess.getQuestionPageAccess().getTextAssignment_2_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1203:1: ( rule__QuestionPage__TextAssignment_2_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1203:2: rule__QuestionPage__TextAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__TextAssignment_2_1_in_rule__QuestionPage__Group_2__1__Impl2444);
            rule__QuestionPage__TextAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionPageAccess().getTextAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionPage__Group_2__1__Impl"


    // $ANTLR start "rule__DescriptionPage__Group__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1217:1: rule__DescriptionPage__Group__0 : rule__DescriptionPage__Group__0__Impl rule__DescriptionPage__Group__1 ;
    public final void rule__DescriptionPage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1221:1: ( rule__DescriptionPage__Group__0__Impl rule__DescriptionPage__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1222:2: rule__DescriptionPage__Group__0__Impl rule__DescriptionPage__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group__0__Impl_in_rule__DescriptionPage__Group__02478);
            rule__DescriptionPage__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group__1_in_rule__DescriptionPage__Group__02481);
            rule__DescriptionPage__Group__1();

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
    // $ANTLR end "rule__DescriptionPage__Group__0"


    // $ANTLR start "rule__DescriptionPage__Group__0__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1229:1: rule__DescriptionPage__Group__0__Impl : ( 'description page' ) ;
    public final void rule__DescriptionPage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1233:1: ( ( 'description page' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1234:1: ( 'description page' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1234:1: ( 'description page' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1235:1: 'description page'
            {
             before(grammarAccess.getDescriptionPageAccess().getDescriptionPageKeyword_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__DescriptionPage__Group__0__Impl2509); 
             after(grammarAccess.getDescriptionPageAccess().getDescriptionPageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionPage__Group__0__Impl"


    // $ANTLR start "rule__DescriptionPage__Group__1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1248:1: rule__DescriptionPage__Group__1 : rule__DescriptionPage__Group__1__Impl rule__DescriptionPage__Group__2 ;
    public final void rule__DescriptionPage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1252:1: ( rule__DescriptionPage__Group__1__Impl rule__DescriptionPage__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1253:2: rule__DescriptionPage__Group__1__Impl rule__DescriptionPage__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group__1__Impl_in_rule__DescriptionPage__Group__12540);
            rule__DescriptionPage__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group__2_in_rule__DescriptionPage__Group__12543);
            rule__DescriptionPage__Group__2();

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
    // $ANTLR end "rule__DescriptionPage__Group__1"


    // $ANTLR start "rule__DescriptionPage__Group__1__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1260:1: rule__DescriptionPage__Group__1__Impl : ( ( rule__DescriptionPage__TitleAssignment_1 ) ) ;
    public final void rule__DescriptionPage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1264:1: ( ( ( rule__DescriptionPage__TitleAssignment_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1265:1: ( ( rule__DescriptionPage__TitleAssignment_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1265:1: ( ( rule__DescriptionPage__TitleAssignment_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1266:1: ( rule__DescriptionPage__TitleAssignment_1 )
            {
             before(grammarAccess.getDescriptionPageAccess().getTitleAssignment_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1267:1: ( rule__DescriptionPage__TitleAssignment_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1267:2: rule__DescriptionPage__TitleAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__TitleAssignment_1_in_rule__DescriptionPage__Group__1__Impl2570);
            rule__DescriptionPage__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionPageAccess().getTitleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionPage__Group__1__Impl"


    // $ANTLR start "rule__DescriptionPage__Group__2"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1277:1: rule__DescriptionPage__Group__2 : rule__DescriptionPage__Group__2__Impl rule__DescriptionPage__Group__3 ;
    public final void rule__DescriptionPage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1281:1: ( rule__DescriptionPage__Group__2__Impl rule__DescriptionPage__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1282:2: rule__DescriptionPage__Group__2__Impl rule__DescriptionPage__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group__2__Impl_in_rule__DescriptionPage__Group__22600);
            rule__DescriptionPage__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group__3_in_rule__DescriptionPage__Group__22603);
            rule__DescriptionPage__Group__3();

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
    // $ANTLR end "rule__DescriptionPage__Group__2"


    // $ANTLR start "rule__DescriptionPage__Group__2__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1289:1: rule__DescriptionPage__Group__2__Impl : ( ( rule__DescriptionPage__Group_2__0 )? ) ;
    public final void rule__DescriptionPage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1293:1: ( ( ( rule__DescriptionPage__Group_2__0 )? ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1294:1: ( ( rule__DescriptionPage__Group_2__0 )? )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1294:1: ( ( rule__DescriptionPage__Group_2__0 )? )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1295:1: ( rule__DescriptionPage__Group_2__0 )?
            {
             before(grammarAccess.getDescriptionPageAccess().getGroup_2()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1296:1: ( rule__DescriptionPage__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1296:2: rule__DescriptionPage__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group_2__0_in_rule__DescriptionPage__Group__2__Impl2630);
                    rule__DescriptionPage__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDescriptionPageAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionPage__Group__2__Impl"


    // $ANTLR start "rule__DescriptionPage__Group__3"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1306:1: rule__DescriptionPage__Group__3 : rule__DescriptionPage__Group__3__Impl ;
    public final void rule__DescriptionPage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1310:1: ( rule__DescriptionPage__Group__3__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1311:2: rule__DescriptionPage__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group__3__Impl_in_rule__DescriptionPage__Group__32661);
            rule__DescriptionPage__Group__3__Impl();

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
    // $ANTLR end "rule__DescriptionPage__Group__3"


    // $ANTLR start "rule__DescriptionPage__Group__3__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1317:1: rule__DescriptionPage__Group__3__Impl : ( 'end page' ) ;
    public final void rule__DescriptionPage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1321:1: ( ( 'end page' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1322:1: ( 'end page' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1322:1: ( 'end page' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1323:1: 'end page'
            {
             before(grammarAccess.getDescriptionPageAccess().getEndPageKeyword_3()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__DescriptionPage__Group__3__Impl2689); 
             after(grammarAccess.getDescriptionPageAccess().getEndPageKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionPage__Group__3__Impl"


    // $ANTLR start "rule__DescriptionPage__Group_2__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1344:1: rule__DescriptionPage__Group_2__0 : rule__DescriptionPage__Group_2__0__Impl rule__DescriptionPage__Group_2__1 ;
    public final void rule__DescriptionPage__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1348:1: ( rule__DescriptionPage__Group_2__0__Impl rule__DescriptionPage__Group_2__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1349:2: rule__DescriptionPage__Group_2__0__Impl rule__DescriptionPage__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group_2__0__Impl_in_rule__DescriptionPage__Group_2__02728);
            rule__DescriptionPage__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group_2__1_in_rule__DescriptionPage__Group_2__02731);
            rule__DescriptionPage__Group_2__1();

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
    // $ANTLR end "rule__DescriptionPage__Group_2__0"


    // $ANTLR start "rule__DescriptionPage__Group_2__0__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1356:1: rule__DescriptionPage__Group_2__0__Impl : ( ':' ) ;
    public final void rule__DescriptionPage__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1360:1: ( ( ':' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1361:1: ( ':' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1361:1: ( ':' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1362:1: ':'
            {
             before(grammarAccess.getDescriptionPageAccess().getColonKeyword_2_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__DescriptionPage__Group_2__0__Impl2759); 
             after(grammarAccess.getDescriptionPageAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionPage__Group_2__0__Impl"


    // $ANTLR start "rule__DescriptionPage__Group_2__1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1375:1: rule__DescriptionPage__Group_2__1 : rule__DescriptionPage__Group_2__1__Impl ;
    public final void rule__DescriptionPage__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1379:1: ( rule__DescriptionPage__Group_2__1__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1380:2: rule__DescriptionPage__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group_2__1__Impl_in_rule__DescriptionPage__Group_2__12790);
            rule__DescriptionPage__Group_2__1__Impl();

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
    // $ANTLR end "rule__DescriptionPage__Group_2__1"


    // $ANTLR start "rule__DescriptionPage__Group_2__1__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1386:1: rule__DescriptionPage__Group_2__1__Impl : ( ( rule__DescriptionPage__TextAssignment_2_1 ) ) ;
    public final void rule__DescriptionPage__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1390:1: ( ( ( rule__DescriptionPage__TextAssignment_2_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1391:1: ( ( rule__DescriptionPage__TextAssignment_2_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1391:1: ( ( rule__DescriptionPage__TextAssignment_2_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1392:1: ( rule__DescriptionPage__TextAssignment_2_1 )
            {
             before(grammarAccess.getDescriptionPageAccess().getTextAssignment_2_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1393:1: ( rule__DescriptionPage__TextAssignment_2_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1393:2: rule__DescriptionPage__TextAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__TextAssignment_2_1_in_rule__DescriptionPage__Group_2__1__Impl2817);
            rule__DescriptionPage__TextAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionPageAccess().getTextAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionPage__Group_2__1__Impl"


    // $ANTLR start "rule__ResultPage__Group__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1407:1: rule__ResultPage__Group__0 : rule__ResultPage__Group__0__Impl rule__ResultPage__Group__1 ;
    public final void rule__ResultPage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1411:1: ( rule__ResultPage__Group__0__Impl rule__ResultPage__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1412:2: rule__ResultPage__Group__0__Impl rule__ResultPage__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group__0__Impl_in_rule__ResultPage__Group__02851);
            rule__ResultPage__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group__1_in_rule__ResultPage__Group__02854);
            rule__ResultPage__Group__1();

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
    // $ANTLR end "rule__ResultPage__Group__0"


    // $ANTLR start "rule__ResultPage__Group__0__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1419:1: rule__ResultPage__Group__0__Impl : ( 'result page' ) ;
    public final void rule__ResultPage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1423:1: ( ( 'result page' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1424:1: ( 'result page' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1424:1: ( 'result page' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1425:1: 'result page'
            {
             before(grammarAccess.getResultPageAccess().getResultPageKeyword_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__ResultPage__Group__0__Impl2882); 
             after(grammarAccess.getResultPageAccess().getResultPageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultPage__Group__0__Impl"


    // $ANTLR start "rule__ResultPage__Group__1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1438:1: rule__ResultPage__Group__1 : rule__ResultPage__Group__1__Impl rule__ResultPage__Group__2 ;
    public final void rule__ResultPage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1442:1: ( rule__ResultPage__Group__1__Impl rule__ResultPage__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1443:2: rule__ResultPage__Group__1__Impl rule__ResultPage__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group__1__Impl_in_rule__ResultPage__Group__12913);
            rule__ResultPage__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group__2_in_rule__ResultPage__Group__12916);
            rule__ResultPage__Group__2();

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
    // $ANTLR end "rule__ResultPage__Group__1"


    // $ANTLR start "rule__ResultPage__Group__1__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1450:1: rule__ResultPage__Group__1__Impl : ( ( rule__ResultPage__TitleAssignment_1 ) ) ;
    public final void rule__ResultPage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1454:1: ( ( ( rule__ResultPage__TitleAssignment_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1455:1: ( ( rule__ResultPage__TitleAssignment_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1455:1: ( ( rule__ResultPage__TitleAssignment_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1456:1: ( rule__ResultPage__TitleAssignment_1 )
            {
             before(grammarAccess.getResultPageAccess().getTitleAssignment_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1457:1: ( rule__ResultPage__TitleAssignment_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1457:2: rule__ResultPage__TitleAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__TitleAssignment_1_in_rule__ResultPage__Group__1__Impl2943);
            rule__ResultPage__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResultPageAccess().getTitleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultPage__Group__1__Impl"


    // $ANTLR start "rule__ResultPage__Group__2"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1467:1: rule__ResultPage__Group__2 : rule__ResultPage__Group__2__Impl rule__ResultPage__Group__3 ;
    public final void rule__ResultPage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1471:1: ( rule__ResultPage__Group__2__Impl rule__ResultPage__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1472:2: rule__ResultPage__Group__2__Impl rule__ResultPage__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group__2__Impl_in_rule__ResultPage__Group__22973);
            rule__ResultPage__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group__3_in_rule__ResultPage__Group__22976);
            rule__ResultPage__Group__3();

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
    // $ANTLR end "rule__ResultPage__Group__2"


    // $ANTLR start "rule__ResultPage__Group__2__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1479:1: rule__ResultPage__Group__2__Impl : ( ( rule__ResultPage__Group_2__0 )? ) ;
    public final void rule__ResultPage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1483:1: ( ( ( rule__ResultPage__Group_2__0 )? ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1484:1: ( ( rule__ResultPage__Group_2__0 )? )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1484:1: ( ( rule__ResultPage__Group_2__0 )? )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1485:1: ( rule__ResultPage__Group_2__0 )?
            {
             before(grammarAccess.getResultPageAccess().getGroup_2()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1486:1: ( rule__ResultPage__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1486:2: rule__ResultPage__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group_2__0_in_rule__ResultPage__Group__2__Impl3003);
                    rule__ResultPage__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResultPageAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultPage__Group__2__Impl"


    // $ANTLR start "rule__ResultPage__Group__3"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1496:1: rule__ResultPage__Group__3 : rule__ResultPage__Group__3__Impl ;
    public final void rule__ResultPage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1500:1: ( rule__ResultPage__Group__3__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1501:2: rule__ResultPage__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group__3__Impl_in_rule__ResultPage__Group__33034);
            rule__ResultPage__Group__3__Impl();

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
    // $ANTLR end "rule__ResultPage__Group__3"


    // $ANTLR start "rule__ResultPage__Group__3__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1507:1: rule__ResultPage__Group__3__Impl : ( 'end page' ) ;
    public final void rule__ResultPage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1511:1: ( ( 'end page' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1512:1: ( 'end page' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1512:1: ( 'end page' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1513:1: 'end page'
            {
             before(grammarAccess.getResultPageAccess().getEndPageKeyword_3()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__ResultPage__Group__3__Impl3062); 
             after(grammarAccess.getResultPageAccess().getEndPageKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultPage__Group__3__Impl"


    // $ANTLR start "rule__ResultPage__Group_2__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1534:1: rule__ResultPage__Group_2__0 : rule__ResultPage__Group_2__0__Impl rule__ResultPage__Group_2__1 ;
    public final void rule__ResultPage__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1538:1: ( rule__ResultPage__Group_2__0__Impl rule__ResultPage__Group_2__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1539:2: rule__ResultPage__Group_2__0__Impl rule__ResultPage__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group_2__0__Impl_in_rule__ResultPage__Group_2__03101);
            rule__ResultPage__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group_2__1_in_rule__ResultPage__Group_2__03104);
            rule__ResultPage__Group_2__1();

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
    // $ANTLR end "rule__ResultPage__Group_2__0"


    // $ANTLR start "rule__ResultPage__Group_2__0__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1546:1: rule__ResultPage__Group_2__0__Impl : ( ':' ) ;
    public final void rule__ResultPage__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1550:1: ( ( ':' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1551:1: ( ':' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1551:1: ( ':' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1552:1: ':'
            {
             before(grammarAccess.getResultPageAccess().getColonKeyword_2_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__ResultPage__Group_2__0__Impl3132); 
             after(grammarAccess.getResultPageAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultPage__Group_2__0__Impl"


    // $ANTLR start "rule__ResultPage__Group_2__1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1565:1: rule__ResultPage__Group_2__1 : rule__ResultPage__Group_2__1__Impl ;
    public final void rule__ResultPage__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1569:1: ( rule__ResultPage__Group_2__1__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1570:2: rule__ResultPage__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group_2__1__Impl_in_rule__ResultPage__Group_2__13163);
            rule__ResultPage__Group_2__1__Impl();

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
    // $ANTLR end "rule__ResultPage__Group_2__1"


    // $ANTLR start "rule__ResultPage__Group_2__1__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1576:1: rule__ResultPage__Group_2__1__Impl : ( ( rule__ResultPage__TextAssignment_2_1 ) ) ;
    public final void rule__ResultPage__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1580:1: ( ( ( rule__ResultPage__TextAssignment_2_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1581:1: ( ( rule__ResultPage__TextAssignment_2_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1581:1: ( ( rule__ResultPage__TextAssignment_2_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1582:1: ( rule__ResultPage__TextAssignment_2_1 )
            {
             before(grammarAccess.getResultPageAccess().getTextAssignment_2_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1583:1: ( rule__ResultPage__TextAssignment_2_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1583:2: rule__ResultPage__TextAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__TextAssignment_2_1_in_rule__ResultPage__Group_2__1__Impl3190);
            rule__ResultPage__TextAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getResultPageAccess().getTextAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultPage__Group_2__1__Impl"


    // $ANTLR start "rule__FreetextQuestion__Group__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1597:1: rule__FreetextQuestion__Group__0 : rule__FreetextQuestion__Group__0__Impl rule__FreetextQuestion__Group__1 ;
    public final void rule__FreetextQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1601:1: ( rule__FreetextQuestion__Group__0__Impl rule__FreetextQuestion__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1602:2: rule__FreetextQuestion__Group__0__Impl rule__FreetextQuestion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__0__Impl_in_rule__FreetextQuestion__Group__03224);
            rule__FreetextQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__1_in_rule__FreetextQuestion__Group__03227);
            rule__FreetextQuestion__Group__1();

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
    // $ANTLR end "rule__FreetextQuestion__Group__0"


    // $ANTLR start "rule__FreetextQuestion__Group__0__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1609:1: rule__FreetextQuestion__Group__0__Impl : ( ( rule__FreetextQuestion__OptionalAssignment_0 )? ) ;
    public final void rule__FreetextQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1613:1: ( ( ( rule__FreetextQuestion__OptionalAssignment_0 )? ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1614:1: ( ( rule__FreetextQuestion__OptionalAssignment_0 )? )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1614:1: ( ( rule__FreetextQuestion__OptionalAssignment_0 )? )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1615:1: ( rule__FreetextQuestion__OptionalAssignment_0 )?
            {
             before(grammarAccess.getFreetextQuestionAccess().getOptionalAssignment_0()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1616:1: ( rule__FreetextQuestion__OptionalAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1616:2: rule__FreetextQuestion__OptionalAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__OptionalAssignment_0_in_rule__FreetextQuestion__Group__0__Impl3254);
                    rule__FreetextQuestion__OptionalAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFreetextQuestionAccess().getOptionalAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreetextQuestion__Group__0__Impl"


    // $ANTLR start "rule__FreetextQuestion__Group__1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1626:1: rule__FreetextQuestion__Group__1 : rule__FreetextQuestion__Group__1__Impl rule__FreetextQuestion__Group__2 ;
    public final void rule__FreetextQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1630:1: ( rule__FreetextQuestion__Group__1__Impl rule__FreetextQuestion__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1631:2: rule__FreetextQuestion__Group__1__Impl rule__FreetextQuestion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__1__Impl_in_rule__FreetextQuestion__Group__13285);
            rule__FreetextQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__2_in_rule__FreetextQuestion__Group__13288);
            rule__FreetextQuestion__Group__2();

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
    // $ANTLR end "rule__FreetextQuestion__Group__1"


    // $ANTLR start "rule__FreetextQuestion__Group__1__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1638:1: rule__FreetextQuestion__Group__1__Impl : ( 'free text question' ) ;
    public final void rule__FreetextQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1642:1: ( ( 'free text question' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1643:1: ( 'free text question' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1643:1: ( 'free text question' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1644:1: 'free text question'
            {
             before(grammarAccess.getFreetextQuestionAccess().getFreeTextQuestionKeyword_1()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__FreetextQuestion__Group__1__Impl3316); 
             after(grammarAccess.getFreetextQuestionAccess().getFreeTextQuestionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreetextQuestion__Group__1__Impl"


    // $ANTLR start "rule__FreetextQuestion__Group__2"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1657:1: rule__FreetextQuestion__Group__2 : rule__FreetextQuestion__Group__2__Impl rule__FreetextQuestion__Group__3 ;
    public final void rule__FreetextQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1661:1: ( rule__FreetextQuestion__Group__2__Impl rule__FreetextQuestion__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1662:2: rule__FreetextQuestion__Group__2__Impl rule__FreetextQuestion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__2__Impl_in_rule__FreetextQuestion__Group__23347);
            rule__FreetextQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__3_in_rule__FreetextQuestion__Group__23350);
            rule__FreetextQuestion__Group__3();

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
    // $ANTLR end "rule__FreetextQuestion__Group__2"


    // $ANTLR start "rule__FreetextQuestion__Group__2__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1669:1: rule__FreetextQuestion__Group__2__Impl : ( ( rule__FreetextQuestion__TextAssignment_2 ) ) ;
    public final void rule__FreetextQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1673:1: ( ( ( rule__FreetextQuestion__TextAssignment_2 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1674:1: ( ( rule__FreetextQuestion__TextAssignment_2 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1674:1: ( ( rule__FreetextQuestion__TextAssignment_2 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1675:1: ( rule__FreetextQuestion__TextAssignment_2 )
            {
             before(grammarAccess.getFreetextQuestionAccess().getTextAssignment_2()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1676:1: ( rule__FreetextQuestion__TextAssignment_2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1676:2: rule__FreetextQuestion__TextAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__TextAssignment_2_in_rule__FreetextQuestion__Group__2__Impl3377);
            rule__FreetextQuestion__TextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFreetextQuestionAccess().getTextAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreetextQuestion__Group__2__Impl"


    // $ANTLR start "rule__FreetextQuestion__Group__3"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1686:1: rule__FreetextQuestion__Group__3 : rule__FreetextQuestion__Group__3__Impl rule__FreetextQuestion__Group__4 ;
    public final void rule__FreetextQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1690:1: ( rule__FreetextQuestion__Group__3__Impl rule__FreetextQuestion__Group__4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1691:2: rule__FreetextQuestion__Group__3__Impl rule__FreetextQuestion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__3__Impl_in_rule__FreetextQuestion__Group__33407);
            rule__FreetextQuestion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__4_in_rule__FreetextQuestion__Group__33410);
            rule__FreetextQuestion__Group__4();

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
    // $ANTLR end "rule__FreetextQuestion__Group__3"


    // $ANTLR start "rule__FreetextQuestion__Group__3__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1698:1: rule__FreetextQuestion__Group__3__Impl : ( ( rule__FreetextQuestion__Group_3__0 )? ) ;
    public final void rule__FreetextQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1702:1: ( ( ( rule__FreetextQuestion__Group_3__0 )? ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1703:1: ( ( rule__FreetextQuestion__Group_3__0 )? )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1703:1: ( ( rule__FreetextQuestion__Group_3__0 )? )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1704:1: ( rule__FreetextQuestion__Group_3__0 )?
            {
             before(grammarAccess.getFreetextQuestionAccess().getGroup_3()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1705:1: ( rule__FreetextQuestion__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1705:2: rule__FreetextQuestion__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group_3__0_in_rule__FreetextQuestion__Group__3__Impl3437);
                    rule__FreetextQuestion__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFreetextQuestionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreetextQuestion__Group__3__Impl"


    // $ANTLR start "rule__FreetextQuestion__Group__4"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1715:1: rule__FreetextQuestion__Group__4 : rule__FreetextQuestion__Group__4__Impl rule__FreetextQuestion__Group__5 ;
    public final void rule__FreetextQuestion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1719:1: ( rule__FreetextQuestion__Group__4__Impl rule__FreetextQuestion__Group__5 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1720:2: rule__FreetextQuestion__Group__4__Impl rule__FreetextQuestion__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__4__Impl_in_rule__FreetextQuestion__Group__43468);
            rule__FreetextQuestion__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__5_in_rule__FreetextQuestion__Group__43471);
            rule__FreetextQuestion__Group__5();

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
    // $ANTLR end "rule__FreetextQuestion__Group__4"


    // $ANTLR start "rule__FreetextQuestion__Group__4__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1727:1: rule__FreetextQuestion__Group__4__Impl : ( 'answers:' ) ;
    public final void rule__FreetextQuestion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1731:1: ( ( 'answers:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1732:1: ( 'answers:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1732:1: ( 'answers:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1733:1: 'answers:'
            {
             before(grammarAccess.getFreetextQuestionAccess().getAnswersKeyword_4()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__FreetextQuestion__Group__4__Impl3499); 
             after(grammarAccess.getFreetextQuestionAccess().getAnswersKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreetextQuestion__Group__4__Impl"


    // $ANTLR start "rule__FreetextQuestion__Group__5"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1746:1: rule__FreetextQuestion__Group__5 : rule__FreetextQuestion__Group__5__Impl rule__FreetextQuestion__Group__6 ;
    public final void rule__FreetextQuestion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1750:1: ( rule__FreetextQuestion__Group__5__Impl rule__FreetextQuestion__Group__6 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1751:2: rule__FreetextQuestion__Group__5__Impl rule__FreetextQuestion__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__5__Impl_in_rule__FreetextQuestion__Group__53530);
            rule__FreetextQuestion__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__6_in_rule__FreetextQuestion__Group__53533);
            rule__FreetextQuestion__Group__6();

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
    // $ANTLR end "rule__FreetextQuestion__Group__5"


    // $ANTLR start "rule__FreetextQuestion__Group__5__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1758:1: rule__FreetextQuestion__Group__5__Impl : ( ( rule__FreetextQuestion__AnswersAssignment_5 ) ) ;
    public final void rule__FreetextQuestion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1762:1: ( ( ( rule__FreetextQuestion__AnswersAssignment_5 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1763:1: ( ( rule__FreetextQuestion__AnswersAssignment_5 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1763:1: ( ( rule__FreetextQuestion__AnswersAssignment_5 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1764:1: ( rule__FreetextQuestion__AnswersAssignment_5 )
            {
             before(grammarAccess.getFreetextQuestionAccess().getAnswersAssignment_5()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1765:1: ( rule__FreetextQuestion__AnswersAssignment_5 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1765:2: rule__FreetextQuestion__AnswersAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__AnswersAssignment_5_in_rule__FreetextQuestion__Group__5__Impl3560);
            rule__FreetextQuestion__AnswersAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFreetextQuestionAccess().getAnswersAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreetextQuestion__Group__5__Impl"


    // $ANTLR start "rule__FreetextQuestion__Group__6"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1775:1: rule__FreetextQuestion__Group__6 : rule__FreetextQuestion__Group__6__Impl ;
    public final void rule__FreetextQuestion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1779:1: ( rule__FreetextQuestion__Group__6__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1780:2: rule__FreetextQuestion__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__6__Impl_in_rule__FreetextQuestion__Group__63590);
            rule__FreetextQuestion__Group__6__Impl();

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
    // $ANTLR end "rule__FreetextQuestion__Group__6"


    // $ANTLR start "rule__FreetextQuestion__Group__6__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1786:1: rule__FreetextQuestion__Group__6__Impl : ( 'end question' ) ;
    public final void rule__FreetextQuestion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1790:1: ( ( 'end question' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1791:1: ( 'end question' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1791:1: ( 'end question' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1792:1: 'end question'
            {
             before(grammarAccess.getFreetextQuestionAccess().getEndQuestionKeyword_6()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__FreetextQuestion__Group__6__Impl3618); 
             after(grammarAccess.getFreetextQuestionAccess().getEndQuestionKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreetextQuestion__Group__6__Impl"


    // $ANTLR start "rule__FreetextQuestion__Group_3__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1819:1: rule__FreetextQuestion__Group_3__0 : rule__FreetextQuestion__Group_3__0__Impl rule__FreetextQuestion__Group_3__1 ;
    public final void rule__FreetextQuestion__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1823:1: ( rule__FreetextQuestion__Group_3__0__Impl rule__FreetextQuestion__Group_3__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1824:2: rule__FreetextQuestion__Group_3__0__Impl rule__FreetextQuestion__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group_3__0__Impl_in_rule__FreetextQuestion__Group_3__03663);
            rule__FreetextQuestion__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group_3__1_in_rule__FreetextQuestion__Group_3__03666);
            rule__FreetextQuestion__Group_3__1();

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
    // $ANTLR end "rule__FreetextQuestion__Group_3__0"


    // $ANTLR start "rule__FreetextQuestion__Group_3__0__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1831:1: rule__FreetextQuestion__Group_3__0__Impl : ( 'requires:' ) ;
    public final void rule__FreetextQuestion__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1835:1: ( ( 'requires:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1836:1: ( 'requires:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1836:1: ( 'requires:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1837:1: 'requires:'
            {
             before(grammarAccess.getFreetextQuestionAccess().getRequiresKeyword_3_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__FreetextQuestion__Group_3__0__Impl3694); 
             after(grammarAccess.getFreetextQuestionAccess().getRequiresKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreetextQuestion__Group_3__0__Impl"


    // $ANTLR start "rule__FreetextQuestion__Group_3__1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1850:1: rule__FreetextQuestion__Group_3__1 : rule__FreetextQuestion__Group_3__1__Impl ;
    public final void rule__FreetextQuestion__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1854:1: ( rule__FreetextQuestion__Group_3__1__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1855:2: rule__FreetextQuestion__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group_3__1__Impl_in_rule__FreetextQuestion__Group_3__13725);
            rule__FreetextQuestion__Group_3__1__Impl();

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
    // $ANTLR end "rule__FreetextQuestion__Group_3__1"


    // $ANTLR start "rule__FreetextQuestion__Group_3__1__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1861:1: rule__FreetextQuestion__Group_3__1__Impl : ( ( rule__FreetextQuestion__RequiresAssignment_3_1 ) ) ;
    public final void rule__FreetextQuestion__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1865:1: ( ( ( rule__FreetextQuestion__RequiresAssignment_3_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1866:1: ( ( rule__FreetextQuestion__RequiresAssignment_3_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1866:1: ( ( rule__FreetextQuestion__RequiresAssignment_3_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1867:1: ( rule__FreetextQuestion__RequiresAssignment_3_1 )
            {
             before(grammarAccess.getFreetextQuestionAccess().getRequiresAssignment_3_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1868:1: ( rule__FreetextQuestion__RequiresAssignment_3_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1868:2: rule__FreetextQuestion__RequiresAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__RequiresAssignment_3_1_in_rule__FreetextQuestion__Group_3__1__Impl3752);
            rule__FreetextQuestion__RequiresAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFreetextQuestionAccess().getRequiresAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreetextQuestion__Group_3__1__Impl"


    // $ANTLR start "rule__SingleChoiceQuestion__Group__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1882:1: rule__SingleChoiceQuestion__Group__0 : rule__SingleChoiceQuestion__Group__0__Impl rule__SingleChoiceQuestion__Group__1 ;
    public final void rule__SingleChoiceQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1886:1: ( rule__SingleChoiceQuestion__Group__0__Impl rule__SingleChoiceQuestion__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1887:2: rule__SingleChoiceQuestion__Group__0__Impl rule__SingleChoiceQuestion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__0__Impl_in_rule__SingleChoiceQuestion__Group__03786);
            rule__SingleChoiceQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__1_in_rule__SingleChoiceQuestion__Group__03789);
            rule__SingleChoiceQuestion__Group__1();

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
    // $ANTLR end "rule__SingleChoiceQuestion__Group__0"


    // $ANTLR start "rule__SingleChoiceQuestion__Group__0__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1894:1: rule__SingleChoiceQuestion__Group__0__Impl : ( ( rule__SingleChoiceQuestion__OptionalAssignment_0 )? ) ;
    public final void rule__SingleChoiceQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1898:1: ( ( ( rule__SingleChoiceQuestion__OptionalAssignment_0 )? ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1899:1: ( ( rule__SingleChoiceQuestion__OptionalAssignment_0 )? )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1899:1: ( ( rule__SingleChoiceQuestion__OptionalAssignment_0 )? )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1900:1: ( rule__SingleChoiceQuestion__OptionalAssignment_0 )?
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getOptionalAssignment_0()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1901:1: ( rule__SingleChoiceQuestion__OptionalAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1901:2: rule__SingleChoiceQuestion__OptionalAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__OptionalAssignment_0_in_rule__SingleChoiceQuestion__Group__0__Impl3816);
                    rule__SingleChoiceQuestion__OptionalAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleChoiceQuestionAccess().getOptionalAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoiceQuestion__Group__0__Impl"


    // $ANTLR start "rule__SingleChoiceQuestion__Group__1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1911:1: rule__SingleChoiceQuestion__Group__1 : rule__SingleChoiceQuestion__Group__1__Impl rule__SingleChoiceQuestion__Group__2 ;
    public final void rule__SingleChoiceQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1915:1: ( rule__SingleChoiceQuestion__Group__1__Impl rule__SingleChoiceQuestion__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1916:2: rule__SingleChoiceQuestion__Group__1__Impl rule__SingleChoiceQuestion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__1__Impl_in_rule__SingleChoiceQuestion__Group__13847);
            rule__SingleChoiceQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__2_in_rule__SingleChoiceQuestion__Group__13850);
            rule__SingleChoiceQuestion__Group__2();

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
    // $ANTLR end "rule__SingleChoiceQuestion__Group__1"


    // $ANTLR start "rule__SingleChoiceQuestion__Group__1__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1923:1: rule__SingleChoiceQuestion__Group__1__Impl : ( 'single choice question' ) ;
    public final void rule__SingleChoiceQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1927:1: ( ( 'single choice question' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1928:1: ( 'single choice question' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1928:1: ( 'single choice question' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1929:1: 'single choice question'
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getSingleChoiceQuestionKeyword_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__SingleChoiceQuestion__Group__1__Impl3878); 
             after(grammarAccess.getSingleChoiceQuestionAccess().getSingleChoiceQuestionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoiceQuestion__Group__1__Impl"


    // $ANTLR start "rule__SingleChoiceQuestion__Group__2"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1942:1: rule__SingleChoiceQuestion__Group__2 : rule__SingleChoiceQuestion__Group__2__Impl rule__SingleChoiceQuestion__Group__3 ;
    public final void rule__SingleChoiceQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1946:1: ( rule__SingleChoiceQuestion__Group__2__Impl rule__SingleChoiceQuestion__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1947:2: rule__SingleChoiceQuestion__Group__2__Impl rule__SingleChoiceQuestion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__2__Impl_in_rule__SingleChoiceQuestion__Group__23909);
            rule__SingleChoiceQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__3_in_rule__SingleChoiceQuestion__Group__23912);
            rule__SingleChoiceQuestion__Group__3();

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
    // $ANTLR end "rule__SingleChoiceQuestion__Group__2"


    // $ANTLR start "rule__SingleChoiceQuestion__Group__2__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1954:1: rule__SingleChoiceQuestion__Group__2__Impl : ( ( rule__SingleChoiceQuestion__TextAssignment_2 ) ) ;
    public final void rule__SingleChoiceQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1958:1: ( ( ( rule__SingleChoiceQuestion__TextAssignment_2 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1959:1: ( ( rule__SingleChoiceQuestion__TextAssignment_2 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1959:1: ( ( rule__SingleChoiceQuestion__TextAssignment_2 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1960:1: ( rule__SingleChoiceQuestion__TextAssignment_2 )
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getTextAssignment_2()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1961:1: ( rule__SingleChoiceQuestion__TextAssignment_2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1961:2: rule__SingleChoiceQuestion__TextAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__TextAssignment_2_in_rule__SingleChoiceQuestion__Group__2__Impl3939);
            rule__SingleChoiceQuestion__TextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSingleChoiceQuestionAccess().getTextAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoiceQuestion__Group__2__Impl"


    // $ANTLR start "rule__SingleChoiceQuestion__Group__3"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1971:1: rule__SingleChoiceQuestion__Group__3 : rule__SingleChoiceQuestion__Group__3__Impl rule__SingleChoiceQuestion__Group__4 ;
    public final void rule__SingleChoiceQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1975:1: ( rule__SingleChoiceQuestion__Group__3__Impl rule__SingleChoiceQuestion__Group__4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1976:2: rule__SingleChoiceQuestion__Group__3__Impl rule__SingleChoiceQuestion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__3__Impl_in_rule__SingleChoiceQuestion__Group__33969);
            rule__SingleChoiceQuestion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__4_in_rule__SingleChoiceQuestion__Group__33972);
            rule__SingleChoiceQuestion__Group__4();

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
    // $ANTLR end "rule__SingleChoiceQuestion__Group__3"


    // $ANTLR start "rule__SingleChoiceQuestion__Group__3__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1983:1: rule__SingleChoiceQuestion__Group__3__Impl : ( ( rule__SingleChoiceQuestion__Group_3__0 )? ) ;
    public final void rule__SingleChoiceQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1987:1: ( ( ( rule__SingleChoiceQuestion__Group_3__0 )? ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1988:1: ( ( rule__SingleChoiceQuestion__Group_3__0 )? )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1988:1: ( ( rule__SingleChoiceQuestion__Group_3__0 )? )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1989:1: ( rule__SingleChoiceQuestion__Group_3__0 )?
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getGroup_3()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1990:1: ( rule__SingleChoiceQuestion__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1990:2: rule__SingleChoiceQuestion__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group_3__0_in_rule__SingleChoiceQuestion__Group__3__Impl3999);
                    rule__SingleChoiceQuestion__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleChoiceQuestionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoiceQuestion__Group__3__Impl"


    // $ANTLR start "rule__SingleChoiceQuestion__Group__4"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2000:1: rule__SingleChoiceQuestion__Group__4 : rule__SingleChoiceQuestion__Group__4__Impl rule__SingleChoiceQuestion__Group__5 ;
    public final void rule__SingleChoiceQuestion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2004:1: ( rule__SingleChoiceQuestion__Group__4__Impl rule__SingleChoiceQuestion__Group__5 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2005:2: rule__SingleChoiceQuestion__Group__4__Impl rule__SingleChoiceQuestion__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__4__Impl_in_rule__SingleChoiceQuestion__Group__44030);
            rule__SingleChoiceQuestion__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__5_in_rule__SingleChoiceQuestion__Group__44033);
            rule__SingleChoiceQuestion__Group__5();

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
    // $ANTLR end "rule__SingleChoiceQuestion__Group__4"


    // $ANTLR start "rule__SingleChoiceQuestion__Group__4__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2012:1: rule__SingleChoiceQuestion__Group__4__Impl : ( 'answers:' ) ;
    public final void rule__SingleChoiceQuestion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2016:1: ( ( 'answers:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2017:1: ( 'answers:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2017:1: ( 'answers:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2018:1: 'answers:'
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getAnswersKeyword_4()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__SingleChoiceQuestion__Group__4__Impl4061); 
             after(grammarAccess.getSingleChoiceQuestionAccess().getAnswersKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoiceQuestion__Group__4__Impl"


    // $ANTLR start "rule__SingleChoiceQuestion__Group__5"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2031:1: rule__SingleChoiceQuestion__Group__5 : rule__SingleChoiceQuestion__Group__5__Impl rule__SingleChoiceQuestion__Group__6 ;
    public final void rule__SingleChoiceQuestion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2035:1: ( rule__SingleChoiceQuestion__Group__5__Impl rule__SingleChoiceQuestion__Group__6 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2036:2: rule__SingleChoiceQuestion__Group__5__Impl rule__SingleChoiceQuestion__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__5__Impl_in_rule__SingleChoiceQuestion__Group__54092);
            rule__SingleChoiceQuestion__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__6_in_rule__SingleChoiceQuestion__Group__54095);
            rule__SingleChoiceQuestion__Group__6();

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
    // $ANTLR end "rule__SingleChoiceQuestion__Group__5"


    // $ANTLR start "rule__SingleChoiceQuestion__Group__5__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2043:1: rule__SingleChoiceQuestion__Group__5__Impl : ( ( rule__SingleChoiceQuestion__AnswersAssignment_5 ) ) ;
    public final void rule__SingleChoiceQuestion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2047:1: ( ( ( rule__SingleChoiceQuestion__AnswersAssignment_5 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2048:1: ( ( rule__SingleChoiceQuestion__AnswersAssignment_5 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2048:1: ( ( rule__SingleChoiceQuestion__AnswersAssignment_5 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2049:1: ( rule__SingleChoiceQuestion__AnswersAssignment_5 )
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getAnswersAssignment_5()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2050:1: ( rule__SingleChoiceQuestion__AnswersAssignment_5 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2050:2: rule__SingleChoiceQuestion__AnswersAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__AnswersAssignment_5_in_rule__SingleChoiceQuestion__Group__5__Impl4122);
            rule__SingleChoiceQuestion__AnswersAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSingleChoiceQuestionAccess().getAnswersAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoiceQuestion__Group__5__Impl"


    // $ANTLR start "rule__SingleChoiceQuestion__Group__6"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2060:1: rule__SingleChoiceQuestion__Group__6 : rule__SingleChoiceQuestion__Group__6__Impl rule__SingleChoiceQuestion__Group__7 ;
    public final void rule__SingleChoiceQuestion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2064:1: ( rule__SingleChoiceQuestion__Group__6__Impl rule__SingleChoiceQuestion__Group__7 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2065:2: rule__SingleChoiceQuestion__Group__6__Impl rule__SingleChoiceQuestion__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__6__Impl_in_rule__SingleChoiceQuestion__Group__64152);
            rule__SingleChoiceQuestion__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__7_in_rule__SingleChoiceQuestion__Group__64155);
            rule__SingleChoiceQuestion__Group__7();

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
    // $ANTLR end "rule__SingleChoiceQuestion__Group__6"


    // $ANTLR start "rule__SingleChoiceQuestion__Group__6__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2072:1: rule__SingleChoiceQuestion__Group__6__Impl : ( ( rule__SingleChoiceQuestion__AnswersAssignment_6 )* ) ;
    public final void rule__SingleChoiceQuestion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2076:1: ( ( ( rule__SingleChoiceQuestion__AnswersAssignment_6 )* ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2077:1: ( ( rule__SingleChoiceQuestion__AnswersAssignment_6 )* )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2077:1: ( ( rule__SingleChoiceQuestion__AnswersAssignment_6 )* )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2078:1: ( rule__SingleChoiceQuestion__AnswersAssignment_6 )*
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getAnswersAssignment_6()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2079:1: ( rule__SingleChoiceQuestion__AnswersAssignment_6 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=31 && LA16_0<=32)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2079:2: rule__SingleChoiceQuestion__AnswersAssignment_6
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__AnswersAssignment_6_in_rule__SingleChoiceQuestion__Group__6__Impl4182);
            	    rule__SingleChoiceQuestion__AnswersAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getSingleChoiceQuestionAccess().getAnswersAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoiceQuestion__Group__6__Impl"


    // $ANTLR start "rule__SingleChoiceQuestion__Group__7"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2089:1: rule__SingleChoiceQuestion__Group__7 : rule__SingleChoiceQuestion__Group__7__Impl ;
    public final void rule__SingleChoiceQuestion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2093:1: ( rule__SingleChoiceQuestion__Group__7__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2094:2: rule__SingleChoiceQuestion__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__7__Impl_in_rule__SingleChoiceQuestion__Group__74213);
            rule__SingleChoiceQuestion__Group__7__Impl();

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
    // $ANTLR end "rule__SingleChoiceQuestion__Group__7"


    // $ANTLR start "rule__SingleChoiceQuestion__Group__7__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2100:1: rule__SingleChoiceQuestion__Group__7__Impl : ( 'end question' ) ;
    public final void rule__SingleChoiceQuestion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2104:1: ( ( 'end question' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2105:1: ( 'end question' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2105:1: ( 'end question' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2106:1: 'end question'
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getEndQuestionKeyword_7()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__SingleChoiceQuestion__Group__7__Impl4241); 
             after(grammarAccess.getSingleChoiceQuestionAccess().getEndQuestionKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoiceQuestion__Group__7__Impl"


    // $ANTLR start "rule__SingleChoiceQuestion__Group_3__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2135:1: rule__SingleChoiceQuestion__Group_3__0 : rule__SingleChoiceQuestion__Group_3__0__Impl rule__SingleChoiceQuestion__Group_3__1 ;
    public final void rule__SingleChoiceQuestion__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2139:1: ( rule__SingleChoiceQuestion__Group_3__0__Impl rule__SingleChoiceQuestion__Group_3__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2140:2: rule__SingleChoiceQuestion__Group_3__0__Impl rule__SingleChoiceQuestion__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group_3__0__Impl_in_rule__SingleChoiceQuestion__Group_3__04288);
            rule__SingleChoiceQuestion__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group_3__1_in_rule__SingleChoiceQuestion__Group_3__04291);
            rule__SingleChoiceQuestion__Group_3__1();

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
    // $ANTLR end "rule__SingleChoiceQuestion__Group_3__0"


    // $ANTLR start "rule__SingleChoiceQuestion__Group_3__0__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2147:1: rule__SingleChoiceQuestion__Group_3__0__Impl : ( 'requires:' ) ;
    public final void rule__SingleChoiceQuestion__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2151:1: ( ( 'requires:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2152:1: ( 'requires:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2152:1: ( 'requires:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2153:1: 'requires:'
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getRequiresKeyword_3_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__SingleChoiceQuestion__Group_3__0__Impl4319); 
             after(grammarAccess.getSingleChoiceQuestionAccess().getRequiresKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoiceQuestion__Group_3__0__Impl"


    // $ANTLR start "rule__SingleChoiceQuestion__Group_3__1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2166:1: rule__SingleChoiceQuestion__Group_3__1 : rule__SingleChoiceQuestion__Group_3__1__Impl ;
    public final void rule__SingleChoiceQuestion__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2170:1: ( rule__SingleChoiceQuestion__Group_3__1__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2171:2: rule__SingleChoiceQuestion__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group_3__1__Impl_in_rule__SingleChoiceQuestion__Group_3__14350);
            rule__SingleChoiceQuestion__Group_3__1__Impl();

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
    // $ANTLR end "rule__SingleChoiceQuestion__Group_3__1"


    // $ANTLR start "rule__SingleChoiceQuestion__Group_3__1__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2177:1: rule__SingleChoiceQuestion__Group_3__1__Impl : ( ( rule__SingleChoiceQuestion__RequiresAssignment_3_1 ) ) ;
    public final void rule__SingleChoiceQuestion__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2181:1: ( ( ( rule__SingleChoiceQuestion__RequiresAssignment_3_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2182:1: ( ( rule__SingleChoiceQuestion__RequiresAssignment_3_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2182:1: ( ( rule__SingleChoiceQuestion__RequiresAssignment_3_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2183:1: ( rule__SingleChoiceQuestion__RequiresAssignment_3_1 )
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getRequiresAssignment_3_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2184:1: ( rule__SingleChoiceQuestion__RequiresAssignment_3_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2184:2: rule__SingleChoiceQuestion__RequiresAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__RequiresAssignment_3_1_in_rule__SingleChoiceQuestion__Group_3__1__Impl4377);
            rule__SingleChoiceQuestion__RequiresAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleChoiceQuestionAccess().getRequiresAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoiceQuestion__Group_3__1__Impl"


    // $ANTLR start "rule__MultiChoiceQuestion__Group__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2198:1: rule__MultiChoiceQuestion__Group__0 : rule__MultiChoiceQuestion__Group__0__Impl rule__MultiChoiceQuestion__Group__1 ;
    public final void rule__MultiChoiceQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2202:1: ( rule__MultiChoiceQuestion__Group__0__Impl rule__MultiChoiceQuestion__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2203:2: rule__MultiChoiceQuestion__Group__0__Impl rule__MultiChoiceQuestion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__0__Impl_in_rule__MultiChoiceQuestion__Group__04411);
            rule__MultiChoiceQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__1_in_rule__MultiChoiceQuestion__Group__04414);
            rule__MultiChoiceQuestion__Group__1();

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
    // $ANTLR end "rule__MultiChoiceQuestion__Group__0"


    // $ANTLR start "rule__MultiChoiceQuestion__Group__0__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2210:1: rule__MultiChoiceQuestion__Group__0__Impl : ( ( rule__MultiChoiceQuestion__OptionalAssignment_0 )? ) ;
    public final void rule__MultiChoiceQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2214:1: ( ( ( rule__MultiChoiceQuestion__OptionalAssignment_0 )? ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2215:1: ( ( rule__MultiChoiceQuestion__OptionalAssignment_0 )? )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2215:1: ( ( rule__MultiChoiceQuestion__OptionalAssignment_0 )? )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2216:1: ( rule__MultiChoiceQuestion__OptionalAssignment_0 )?
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getOptionalAssignment_0()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2217:1: ( rule__MultiChoiceQuestion__OptionalAssignment_0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2217:2: rule__MultiChoiceQuestion__OptionalAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__OptionalAssignment_0_in_rule__MultiChoiceQuestion__Group__0__Impl4441);
                    rule__MultiChoiceQuestion__OptionalAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultiChoiceQuestionAccess().getOptionalAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceQuestion__Group__0__Impl"


    // $ANTLR start "rule__MultiChoiceQuestion__Group__1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2227:1: rule__MultiChoiceQuestion__Group__1 : rule__MultiChoiceQuestion__Group__1__Impl rule__MultiChoiceQuestion__Group__2 ;
    public final void rule__MultiChoiceQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2231:1: ( rule__MultiChoiceQuestion__Group__1__Impl rule__MultiChoiceQuestion__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2232:2: rule__MultiChoiceQuestion__Group__1__Impl rule__MultiChoiceQuestion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__1__Impl_in_rule__MultiChoiceQuestion__Group__14472);
            rule__MultiChoiceQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__2_in_rule__MultiChoiceQuestion__Group__14475);
            rule__MultiChoiceQuestion__Group__2();

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
    // $ANTLR end "rule__MultiChoiceQuestion__Group__1"


    // $ANTLR start "rule__MultiChoiceQuestion__Group__1__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2239:1: rule__MultiChoiceQuestion__Group__1__Impl : ( 'multi choice question' ) ;
    public final void rule__MultiChoiceQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2243:1: ( ( 'multi choice question' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2244:1: ( 'multi choice question' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2244:1: ( 'multi choice question' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2245:1: 'multi choice question'
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getMultiChoiceQuestionKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__MultiChoiceQuestion__Group__1__Impl4503); 
             after(grammarAccess.getMultiChoiceQuestionAccess().getMultiChoiceQuestionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceQuestion__Group__1__Impl"


    // $ANTLR start "rule__MultiChoiceQuestion__Group__2"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2258:1: rule__MultiChoiceQuestion__Group__2 : rule__MultiChoiceQuestion__Group__2__Impl rule__MultiChoiceQuestion__Group__3 ;
    public final void rule__MultiChoiceQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2262:1: ( rule__MultiChoiceQuestion__Group__2__Impl rule__MultiChoiceQuestion__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2263:2: rule__MultiChoiceQuestion__Group__2__Impl rule__MultiChoiceQuestion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__2__Impl_in_rule__MultiChoiceQuestion__Group__24534);
            rule__MultiChoiceQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__3_in_rule__MultiChoiceQuestion__Group__24537);
            rule__MultiChoiceQuestion__Group__3();

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
    // $ANTLR end "rule__MultiChoiceQuestion__Group__2"


    // $ANTLR start "rule__MultiChoiceQuestion__Group__2__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2270:1: rule__MultiChoiceQuestion__Group__2__Impl : ( ( rule__MultiChoiceQuestion__TextAssignment_2 ) ) ;
    public final void rule__MultiChoiceQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2274:1: ( ( ( rule__MultiChoiceQuestion__TextAssignment_2 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2275:1: ( ( rule__MultiChoiceQuestion__TextAssignment_2 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2275:1: ( ( rule__MultiChoiceQuestion__TextAssignment_2 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2276:1: ( rule__MultiChoiceQuestion__TextAssignment_2 )
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getTextAssignment_2()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2277:1: ( rule__MultiChoiceQuestion__TextAssignment_2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2277:2: rule__MultiChoiceQuestion__TextAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__TextAssignment_2_in_rule__MultiChoiceQuestion__Group__2__Impl4564);
            rule__MultiChoiceQuestion__TextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceQuestionAccess().getTextAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceQuestion__Group__2__Impl"


    // $ANTLR start "rule__MultiChoiceQuestion__Group__3"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2287:1: rule__MultiChoiceQuestion__Group__3 : rule__MultiChoiceQuestion__Group__3__Impl rule__MultiChoiceQuestion__Group__4 ;
    public final void rule__MultiChoiceQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2291:1: ( rule__MultiChoiceQuestion__Group__3__Impl rule__MultiChoiceQuestion__Group__4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2292:2: rule__MultiChoiceQuestion__Group__3__Impl rule__MultiChoiceQuestion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__3__Impl_in_rule__MultiChoiceQuestion__Group__34594);
            rule__MultiChoiceQuestion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__4_in_rule__MultiChoiceQuestion__Group__34597);
            rule__MultiChoiceQuestion__Group__4();

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
    // $ANTLR end "rule__MultiChoiceQuestion__Group__3"


    // $ANTLR start "rule__MultiChoiceQuestion__Group__3__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2299:1: rule__MultiChoiceQuestion__Group__3__Impl : ( ( rule__MultiChoiceQuestion__Group_3__0 )? ) ;
    public final void rule__MultiChoiceQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2303:1: ( ( ( rule__MultiChoiceQuestion__Group_3__0 )? ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2304:1: ( ( rule__MultiChoiceQuestion__Group_3__0 )? )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2304:1: ( ( rule__MultiChoiceQuestion__Group_3__0 )? )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2305:1: ( rule__MultiChoiceQuestion__Group_3__0 )?
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getGroup_3()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2306:1: ( rule__MultiChoiceQuestion__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2306:2: rule__MultiChoiceQuestion__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group_3__0_in_rule__MultiChoiceQuestion__Group__3__Impl4624);
                    rule__MultiChoiceQuestion__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultiChoiceQuestionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceQuestion__Group__3__Impl"


    // $ANTLR start "rule__MultiChoiceQuestion__Group__4"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2316:1: rule__MultiChoiceQuestion__Group__4 : rule__MultiChoiceQuestion__Group__4__Impl rule__MultiChoiceQuestion__Group__5 ;
    public final void rule__MultiChoiceQuestion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2320:1: ( rule__MultiChoiceQuestion__Group__4__Impl rule__MultiChoiceQuestion__Group__5 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2321:2: rule__MultiChoiceQuestion__Group__4__Impl rule__MultiChoiceQuestion__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__4__Impl_in_rule__MultiChoiceQuestion__Group__44655);
            rule__MultiChoiceQuestion__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__5_in_rule__MultiChoiceQuestion__Group__44658);
            rule__MultiChoiceQuestion__Group__5();

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
    // $ANTLR end "rule__MultiChoiceQuestion__Group__4"


    // $ANTLR start "rule__MultiChoiceQuestion__Group__4__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2328:1: rule__MultiChoiceQuestion__Group__4__Impl : ( 'answers:' ) ;
    public final void rule__MultiChoiceQuestion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2332:1: ( ( 'answers:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2333:1: ( 'answers:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2333:1: ( 'answers:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2334:1: 'answers:'
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getAnswersKeyword_4()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__MultiChoiceQuestion__Group__4__Impl4686); 
             after(grammarAccess.getMultiChoiceQuestionAccess().getAnswersKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceQuestion__Group__4__Impl"


    // $ANTLR start "rule__MultiChoiceQuestion__Group__5"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2347:1: rule__MultiChoiceQuestion__Group__5 : rule__MultiChoiceQuestion__Group__5__Impl rule__MultiChoiceQuestion__Group__6 ;
    public final void rule__MultiChoiceQuestion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2351:1: ( rule__MultiChoiceQuestion__Group__5__Impl rule__MultiChoiceQuestion__Group__6 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2352:2: rule__MultiChoiceQuestion__Group__5__Impl rule__MultiChoiceQuestion__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__5__Impl_in_rule__MultiChoiceQuestion__Group__54717);
            rule__MultiChoiceQuestion__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__6_in_rule__MultiChoiceQuestion__Group__54720);
            rule__MultiChoiceQuestion__Group__6();

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
    // $ANTLR end "rule__MultiChoiceQuestion__Group__5"


    // $ANTLR start "rule__MultiChoiceQuestion__Group__5__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2359:1: rule__MultiChoiceQuestion__Group__5__Impl : ( ( rule__MultiChoiceQuestion__AnswersAssignment_5 ) ) ;
    public final void rule__MultiChoiceQuestion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2363:1: ( ( ( rule__MultiChoiceQuestion__AnswersAssignment_5 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2364:1: ( ( rule__MultiChoiceQuestion__AnswersAssignment_5 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2364:1: ( ( rule__MultiChoiceQuestion__AnswersAssignment_5 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2365:1: ( rule__MultiChoiceQuestion__AnswersAssignment_5 )
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getAnswersAssignment_5()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2366:1: ( rule__MultiChoiceQuestion__AnswersAssignment_5 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2366:2: rule__MultiChoiceQuestion__AnswersAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__AnswersAssignment_5_in_rule__MultiChoiceQuestion__Group__5__Impl4747);
            rule__MultiChoiceQuestion__AnswersAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceQuestionAccess().getAnswersAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceQuestion__Group__5__Impl"


    // $ANTLR start "rule__MultiChoiceQuestion__Group__6"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2376:1: rule__MultiChoiceQuestion__Group__6 : rule__MultiChoiceQuestion__Group__6__Impl rule__MultiChoiceQuestion__Group__7 ;
    public final void rule__MultiChoiceQuestion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2380:1: ( rule__MultiChoiceQuestion__Group__6__Impl rule__MultiChoiceQuestion__Group__7 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2381:2: rule__MultiChoiceQuestion__Group__6__Impl rule__MultiChoiceQuestion__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__6__Impl_in_rule__MultiChoiceQuestion__Group__64777);
            rule__MultiChoiceQuestion__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__7_in_rule__MultiChoiceQuestion__Group__64780);
            rule__MultiChoiceQuestion__Group__7();

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
    // $ANTLR end "rule__MultiChoiceQuestion__Group__6"


    // $ANTLR start "rule__MultiChoiceQuestion__Group__6__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2388:1: rule__MultiChoiceQuestion__Group__6__Impl : ( ( rule__MultiChoiceQuestion__AnswersAssignment_6 )* ) ;
    public final void rule__MultiChoiceQuestion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2392:1: ( ( ( rule__MultiChoiceQuestion__AnswersAssignment_6 )* ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2393:1: ( ( rule__MultiChoiceQuestion__AnswersAssignment_6 )* )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2393:1: ( ( rule__MultiChoiceQuestion__AnswersAssignment_6 )* )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2394:1: ( rule__MultiChoiceQuestion__AnswersAssignment_6 )*
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getAnswersAssignment_6()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2395:1: ( rule__MultiChoiceQuestion__AnswersAssignment_6 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=31 && LA19_0<=32)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2395:2: rule__MultiChoiceQuestion__AnswersAssignment_6
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__AnswersAssignment_6_in_rule__MultiChoiceQuestion__Group__6__Impl4807);
            	    rule__MultiChoiceQuestion__AnswersAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getMultiChoiceQuestionAccess().getAnswersAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceQuestion__Group__6__Impl"


    // $ANTLR start "rule__MultiChoiceQuestion__Group__7"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2405:1: rule__MultiChoiceQuestion__Group__7 : rule__MultiChoiceQuestion__Group__7__Impl ;
    public final void rule__MultiChoiceQuestion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2409:1: ( rule__MultiChoiceQuestion__Group__7__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2410:2: rule__MultiChoiceQuestion__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__7__Impl_in_rule__MultiChoiceQuestion__Group__74838);
            rule__MultiChoiceQuestion__Group__7__Impl();

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
    // $ANTLR end "rule__MultiChoiceQuestion__Group__7"


    // $ANTLR start "rule__MultiChoiceQuestion__Group__7__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2416:1: rule__MultiChoiceQuestion__Group__7__Impl : ( 'end question' ) ;
    public final void rule__MultiChoiceQuestion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2420:1: ( ( 'end question' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2421:1: ( 'end question' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2421:1: ( 'end question' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2422:1: 'end question'
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getEndQuestionKeyword_7()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__MultiChoiceQuestion__Group__7__Impl4866); 
             after(grammarAccess.getMultiChoiceQuestionAccess().getEndQuestionKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceQuestion__Group__7__Impl"


    // $ANTLR start "rule__MultiChoiceQuestion__Group_3__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2451:1: rule__MultiChoiceQuestion__Group_3__0 : rule__MultiChoiceQuestion__Group_3__0__Impl rule__MultiChoiceQuestion__Group_3__1 ;
    public final void rule__MultiChoiceQuestion__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2455:1: ( rule__MultiChoiceQuestion__Group_3__0__Impl rule__MultiChoiceQuestion__Group_3__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2456:2: rule__MultiChoiceQuestion__Group_3__0__Impl rule__MultiChoiceQuestion__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group_3__0__Impl_in_rule__MultiChoiceQuestion__Group_3__04913);
            rule__MultiChoiceQuestion__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group_3__1_in_rule__MultiChoiceQuestion__Group_3__04916);
            rule__MultiChoiceQuestion__Group_3__1();

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
    // $ANTLR end "rule__MultiChoiceQuestion__Group_3__0"


    // $ANTLR start "rule__MultiChoiceQuestion__Group_3__0__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2463:1: rule__MultiChoiceQuestion__Group_3__0__Impl : ( 'requires:' ) ;
    public final void rule__MultiChoiceQuestion__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2467:1: ( ( 'requires:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2468:1: ( 'requires:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2468:1: ( 'requires:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2469:1: 'requires:'
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getRequiresKeyword_3_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__MultiChoiceQuestion__Group_3__0__Impl4944); 
             after(grammarAccess.getMultiChoiceQuestionAccess().getRequiresKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceQuestion__Group_3__0__Impl"


    // $ANTLR start "rule__MultiChoiceQuestion__Group_3__1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2482:1: rule__MultiChoiceQuestion__Group_3__1 : rule__MultiChoiceQuestion__Group_3__1__Impl ;
    public final void rule__MultiChoiceQuestion__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2486:1: ( rule__MultiChoiceQuestion__Group_3__1__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2487:2: rule__MultiChoiceQuestion__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group_3__1__Impl_in_rule__MultiChoiceQuestion__Group_3__14975);
            rule__MultiChoiceQuestion__Group_3__1__Impl();

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
    // $ANTLR end "rule__MultiChoiceQuestion__Group_3__1"


    // $ANTLR start "rule__MultiChoiceQuestion__Group_3__1__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2493:1: rule__MultiChoiceQuestion__Group_3__1__Impl : ( ( rule__MultiChoiceQuestion__RequiresAssignment_3_1 ) ) ;
    public final void rule__MultiChoiceQuestion__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2497:1: ( ( ( rule__MultiChoiceQuestion__RequiresAssignment_3_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2498:1: ( ( rule__MultiChoiceQuestion__RequiresAssignment_3_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2498:1: ( ( rule__MultiChoiceQuestion__RequiresAssignment_3_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2499:1: ( rule__MultiChoiceQuestion__RequiresAssignment_3_1 )
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getRequiresAssignment_3_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2500:1: ( rule__MultiChoiceQuestion__RequiresAssignment_3_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2500:2: rule__MultiChoiceQuestion__RequiresAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__RequiresAssignment_3_1_in_rule__MultiChoiceQuestion__Group_3__1__Impl5002);
            rule__MultiChoiceQuestion__RequiresAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceQuestionAccess().getRequiresAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceQuestion__Group_3__1__Impl"


    // $ANTLR start "rule__CheckOr__Group__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2514:1: rule__CheckOr__Group__0 : rule__CheckOr__Group__0__Impl rule__CheckOr__Group__1 ;
    public final void rule__CheckOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2518:1: ( rule__CheckOr__Group__0__Impl rule__CheckOr__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2519:2: rule__CheckOr__Group__0__Impl rule__CheckOr__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckOr__Group__0__Impl_in_rule__CheckOr__Group__05036);
            rule__CheckOr__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CheckOr__Group__1_in_rule__CheckOr__Group__05039);
            rule__CheckOr__Group__1();

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
    // $ANTLR end "rule__CheckOr__Group__0"


    // $ANTLR start "rule__CheckOr__Group__0__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2526:1: rule__CheckOr__Group__0__Impl : ( ruleCheckAnd ) ;
    public final void rule__CheckOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2530:1: ( ( ruleCheckAnd ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2531:1: ( ruleCheckAnd )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2531:1: ( ruleCheckAnd )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2532:1: ruleCheckAnd
            {
             before(grammarAccess.getCheckOrAccess().getCheckAndParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCheckAnd_in_rule__CheckOr__Group__0__Impl5066);
            ruleCheckAnd();

            state._fsp--;

             after(grammarAccess.getCheckOrAccess().getCheckAndParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckOr__Group__0__Impl"


    // $ANTLR start "rule__CheckOr__Group__1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2543:1: rule__CheckOr__Group__1 : rule__CheckOr__Group__1__Impl ;
    public final void rule__CheckOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2547:1: ( rule__CheckOr__Group__1__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2548:2: rule__CheckOr__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckOr__Group__1__Impl_in_rule__CheckOr__Group__15095);
            rule__CheckOr__Group__1__Impl();

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
    // $ANTLR end "rule__CheckOr__Group__1"


    // $ANTLR start "rule__CheckOr__Group__1__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2554:1: rule__CheckOr__Group__1__Impl : ( ( rule__CheckOr__Group_1__0 )* ) ;
    public final void rule__CheckOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2558:1: ( ( ( rule__CheckOr__Group_1__0 )* ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2559:1: ( ( rule__CheckOr__Group_1__0 )* )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2559:1: ( ( rule__CheckOr__Group_1__0 )* )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2560:1: ( rule__CheckOr__Group_1__0 )*
            {
             before(grammarAccess.getCheckOrAccess().getGroup_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2561:1: ( rule__CheckOr__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==26) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2561:2: rule__CheckOr__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__CheckOr__Group_1__0_in_rule__CheckOr__Group__1__Impl5122);
            	    rule__CheckOr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getCheckOrAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckOr__Group__1__Impl"


    // $ANTLR start "rule__CheckOr__Group_1__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2575:1: rule__CheckOr__Group_1__0 : rule__CheckOr__Group_1__0__Impl rule__CheckOr__Group_1__1 ;
    public final void rule__CheckOr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2579:1: ( rule__CheckOr__Group_1__0__Impl rule__CheckOr__Group_1__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2580:2: rule__CheckOr__Group_1__0__Impl rule__CheckOr__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckOr__Group_1__0__Impl_in_rule__CheckOr__Group_1__05157);
            rule__CheckOr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CheckOr__Group_1__1_in_rule__CheckOr__Group_1__05160);
            rule__CheckOr__Group_1__1();

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
    // $ANTLR end "rule__CheckOr__Group_1__0"


    // $ANTLR start "rule__CheckOr__Group_1__0__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2587:1: rule__CheckOr__Group_1__0__Impl : ( () ) ;
    public final void rule__CheckOr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2591:1: ( ( () ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2592:1: ( () )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2592:1: ( () )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2593:1: ()
            {
             before(grammarAccess.getCheckOrAccess().getOrLhsAction_1_0()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2594:1: ()
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2596:1: 
            {
            }

             after(grammarAccess.getCheckOrAccess().getOrLhsAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckOr__Group_1__0__Impl"


    // $ANTLR start "rule__CheckOr__Group_1__1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2606:1: rule__CheckOr__Group_1__1 : rule__CheckOr__Group_1__1__Impl rule__CheckOr__Group_1__2 ;
    public final void rule__CheckOr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2610:1: ( rule__CheckOr__Group_1__1__Impl rule__CheckOr__Group_1__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2611:2: rule__CheckOr__Group_1__1__Impl rule__CheckOr__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckOr__Group_1__1__Impl_in_rule__CheckOr__Group_1__15218);
            rule__CheckOr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CheckOr__Group_1__2_in_rule__CheckOr__Group_1__15221);
            rule__CheckOr__Group_1__2();

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
    // $ANTLR end "rule__CheckOr__Group_1__1"


    // $ANTLR start "rule__CheckOr__Group_1__1__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2618:1: rule__CheckOr__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__CheckOr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2622:1: ( ( 'or' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2623:1: ( 'or' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2623:1: ( 'or' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2624:1: 'or'
            {
             before(grammarAccess.getCheckOrAccess().getOrKeyword_1_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__CheckOr__Group_1__1__Impl5249); 
             after(grammarAccess.getCheckOrAccess().getOrKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckOr__Group_1__1__Impl"


    // $ANTLR start "rule__CheckOr__Group_1__2"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2637:1: rule__CheckOr__Group_1__2 : rule__CheckOr__Group_1__2__Impl ;
    public final void rule__CheckOr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2641:1: ( rule__CheckOr__Group_1__2__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2642:2: rule__CheckOr__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckOr__Group_1__2__Impl_in_rule__CheckOr__Group_1__25280);
            rule__CheckOr__Group_1__2__Impl();

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
    // $ANTLR end "rule__CheckOr__Group_1__2"


    // $ANTLR start "rule__CheckOr__Group_1__2__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2648:1: rule__CheckOr__Group_1__2__Impl : ( ( rule__CheckOr__RhsAssignment_1_2 ) ) ;
    public final void rule__CheckOr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2652:1: ( ( ( rule__CheckOr__RhsAssignment_1_2 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2653:1: ( ( rule__CheckOr__RhsAssignment_1_2 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2653:1: ( ( rule__CheckOr__RhsAssignment_1_2 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2654:1: ( rule__CheckOr__RhsAssignment_1_2 )
            {
             before(grammarAccess.getCheckOrAccess().getRhsAssignment_1_2()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2655:1: ( rule__CheckOr__RhsAssignment_1_2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2655:2: rule__CheckOr__RhsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckOr__RhsAssignment_1_2_in_rule__CheckOr__Group_1__2__Impl5307);
            rule__CheckOr__RhsAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getCheckOrAccess().getRhsAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckOr__Group_1__2__Impl"


    // $ANTLR start "rule__CheckAnd__Group__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2671:1: rule__CheckAnd__Group__0 : rule__CheckAnd__Group__0__Impl rule__CheckAnd__Group__1 ;
    public final void rule__CheckAnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2675:1: ( rule__CheckAnd__Group__0__Impl rule__CheckAnd__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2676:2: rule__CheckAnd__Group__0__Impl rule__CheckAnd__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckAnd__Group__0__Impl_in_rule__CheckAnd__Group__05343);
            rule__CheckAnd__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CheckAnd__Group__1_in_rule__CheckAnd__Group__05346);
            rule__CheckAnd__Group__1();

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
    // $ANTLR end "rule__CheckAnd__Group__0"


    // $ANTLR start "rule__CheckAnd__Group__0__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2683:1: rule__CheckAnd__Group__0__Impl : ( ruleCheckNot ) ;
    public final void rule__CheckAnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2687:1: ( ( ruleCheckNot ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2688:1: ( ruleCheckNot )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2688:1: ( ruleCheckNot )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2689:1: ruleCheckNot
            {
             before(grammarAccess.getCheckAndAccess().getCheckNotParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCheckNot_in_rule__CheckAnd__Group__0__Impl5373);
            ruleCheckNot();

            state._fsp--;

             after(grammarAccess.getCheckAndAccess().getCheckNotParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckAnd__Group__0__Impl"


    // $ANTLR start "rule__CheckAnd__Group__1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2700:1: rule__CheckAnd__Group__1 : rule__CheckAnd__Group__1__Impl ;
    public final void rule__CheckAnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2704:1: ( rule__CheckAnd__Group__1__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2705:2: rule__CheckAnd__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckAnd__Group__1__Impl_in_rule__CheckAnd__Group__15402);
            rule__CheckAnd__Group__1__Impl();

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
    // $ANTLR end "rule__CheckAnd__Group__1"


    // $ANTLR start "rule__CheckAnd__Group__1__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2711:1: rule__CheckAnd__Group__1__Impl : ( ( rule__CheckAnd__Group_1__0 )* ) ;
    public final void rule__CheckAnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2715:1: ( ( ( rule__CheckAnd__Group_1__0 )* ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2716:1: ( ( rule__CheckAnd__Group_1__0 )* )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2716:1: ( ( rule__CheckAnd__Group_1__0 )* )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2717:1: ( rule__CheckAnd__Group_1__0 )*
            {
             before(grammarAccess.getCheckAndAccess().getGroup_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2718:1: ( rule__CheckAnd__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==27) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2718:2: rule__CheckAnd__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__CheckAnd__Group_1__0_in_rule__CheckAnd__Group__1__Impl5429);
            	    rule__CheckAnd__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getCheckAndAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckAnd__Group__1__Impl"


    // $ANTLR start "rule__CheckAnd__Group_1__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2732:1: rule__CheckAnd__Group_1__0 : rule__CheckAnd__Group_1__0__Impl rule__CheckAnd__Group_1__1 ;
    public final void rule__CheckAnd__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2736:1: ( rule__CheckAnd__Group_1__0__Impl rule__CheckAnd__Group_1__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2737:2: rule__CheckAnd__Group_1__0__Impl rule__CheckAnd__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckAnd__Group_1__0__Impl_in_rule__CheckAnd__Group_1__05464);
            rule__CheckAnd__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CheckAnd__Group_1__1_in_rule__CheckAnd__Group_1__05467);
            rule__CheckAnd__Group_1__1();

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
    // $ANTLR end "rule__CheckAnd__Group_1__0"


    // $ANTLR start "rule__CheckAnd__Group_1__0__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2744:1: rule__CheckAnd__Group_1__0__Impl : ( () ) ;
    public final void rule__CheckAnd__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2748:1: ( ( () ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2749:1: ( () )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2749:1: ( () )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2750:1: ()
            {
             before(grammarAccess.getCheckAndAccess().getAndLhsAction_1_0()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2751:1: ()
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2753:1: 
            {
            }

             after(grammarAccess.getCheckAndAccess().getAndLhsAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckAnd__Group_1__0__Impl"


    // $ANTLR start "rule__CheckAnd__Group_1__1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2763:1: rule__CheckAnd__Group_1__1 : rule__CheckAnd__Group_1__1__Impl rule__CheckAnd__Group_1__2 ;
    public final void rule__CheckAnd__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2767:1: ( rule__CheckAnd__Group_1__1__Impl rule__CheckAnd__Group_1__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2768:2: rule__CheckAnd__Group_1__1__Impl rule__CheckAnd__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckAnd__Group_1__1__Impl_in_rule__CheckAnd__Group_1__15525);
            rule__CheckAnd__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CheckAnd__Group_1__2_in_rule__CheckAnd__Group_1__15528);
            rule__CheckAnd__Group_1__2();

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
    // $ANTLR end "rule__CheckAnd__Group_1__1"


    // $ANTLR start "rule__CheckAnd__Group_1__1__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2775:1: rule__CheckAnd__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__CheckAnd__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2779:1: ( ( 'and' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2780:1: ( 'and' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2780:1: ( 'and' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2781:1: 'and'
            {
             before(grammarAccess.getCheckAndAccess().getAndKeyword_1_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__CheckAnd__Group_1__1__Impl5556); 
             after(grammarAccess.getCheckAndAccess().getAndKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckAnd__Group_1__1__Impl"


    // $ANTLR start "rule__CheckAnd__Group_1__2"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2794:1: rule__CheckAnd__Group_1__2 : rule__CheckAnd__Group_1__2__Impl ;
    public final void rule__CheckAnd__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2798:1: ( rule__CheckAnd__Group_1__2__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2799:2: rule__CheckAnd__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckAnd__Group_1__2__Impl_in_rule__CheckAnd__Group_1__25587);
            rule__CheckAnd__Group_1__2__Impl();

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
    // $ANTLR end "rule__CheckAnd__Group_1__2"


    // $ANTLR start "rule__CheckAnd__Group_1__2__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2805:1: rule__CheckAnd__Group_1__2__Impl : ( ( rule__CheckAnd__RhsAssignment_1_2 ) ) ;
    public final void rule__CheckAnd__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2809:1: ( ( ( rule__CheckAnd__RhsAssignment_1_2 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2810:1: ( ( rule__CheckAnd__RhsAssignment_1_2 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2810:1: ( ( rule__CheckAnd__RhsAssignment_1_2 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2811:1: ( rule__CheckAnd__RhsAssignment_1_2 )
            {
             before(grammarAccess.getCheckAndAccess().getRhsAssignment_1_2()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2812:1: ( rule__CheckAnd__RhsAssignment_1_2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2812:2: rule__CheckAnd__RhsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckAnd__RhsAssignment_1_2_in_rule__CheckAnd__Group_1__2__Impl5614);
            rule__CheckAnd__RhsAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getCheckAndAccess().getRhsAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckAnd__Group_1__2__Impl"


    // $ANTLR start "rule__CheckNot__Group_0__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2828:1: rule__CheckNot__Group_0__0 : rule__CheckNot__Group_0__0__Impl rule__CheckNot__Group_0__1 ;
    public final void rule__CheckNot__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2832:1: ( rule__CheckNot__Group_0__0__Impl rule__CheckNot__Group_0__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2833:2: rule__CheckNot__Group_0__0__Impl rule__CheckNot__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckNot__Group_0__0__Impl_in_rule__CheckNot__Group_0__05650);
            rule__CheckNot__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CheckNot__Group_0__1_in_rule__CheckNot__Group_0__05653);
            rule__CheckNot__Group_0__1();

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
    // $ANTLR end "rule__CheckNot__Group_0__0"


    // $ANTLR start "rule__CheckNot__Group_0__0__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2840:1: rule__CheckNot__Group_0__0__Impl : ( 'not' ) ;
    public final void rule__CheckNot__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2844:1: ( ( 'not' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2845:1: ( 'not' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2845:1: ( 'not' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2846:1: 'not'
            {
             before(grammarAccess.getCheckNotAccess().getNotKeyword_0_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__CheckNot__Group_0__0__Impl5681); 
             after(grammarAccess.getCheckNotAccess().getNotKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckNot__Group_0__0__Impl"


    // $ANTLR start "rule__CheckNot__Group_0__1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2859:1: rule__CheckNot__Group_0__1 : rule__CheckNot__Group_0__1__Impl rule__CheckNot__Group_0__2 ;
    public final void rule__CheckNot__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2863:1: ( rule__CheckNot__Group_0__1__Impl rule__CheckNot__Group_0__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2864:2: rule__CheckNot__Group_0__1__Impl rule__CheckNot__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckNot__Group_0__1__Impl_in_rule__CheckNot__Group_0__15712);
            rule__CheckNot__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CheckNot__Group_0__2_in_rule__CheckNot__Group_0__15715);
            rule__CheckNot__Group_0__2();

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
    // $ANTLR end "rule__CheckNot__Group_0__1"


    // $ANTLR start "rule__CheckNot__Group_0__1__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2871:1: rule__CheckNot__Group_0__1__Impl : ( ruleBottom ) ;
    public final void rule__CheckNot__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2875:1: ( ( ruleBottom ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2876:1: ( ruleBottom )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2876:1: ( ruleBottom )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2877:1: ruleBottom
            {
             before(grammarAccess.getCheckNotAccess().getBottomParserRuleCall_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleBottom_in_rule__CheckNot__Group_0__1__Impl5742);
            ruleBottom();

            state._fsp--;

             after(grammarAccess.getCheckNotAccess().getBottomParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckNot__Group_0__1__Impl"


    // $ANTLR start "rule__CheckNot__Group_0__2"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2888:1: rule__CheckNot__Group_0__2 : rule__CheckNot__Group_0__2__Impl ;
    public final void rule__CheckNot__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2892:1: ( rule__CheckNot__Group_0__2__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2893:2: rule__CheckNot__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckNot__Group_0__2__Impl_in_rule__CheckNot__Group_0__25771);
            rule__CheckNot__Group_0__2__Impl();

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
    // $ANTLR end "rule__CheckNot__Group_0__2"


    // $ANTLR start "rule__CheckNot__Group_0__2__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2899:1: rule__CheckNot__Group_0__2__Impl : ( () ) ;
    public final void rule__CheckNot__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2903:1: ( ( () ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2904:1: ( () )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2904:1: ( () )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2905:1: ()
            {
             before(grammarAccess.getCheckNotAccess().getNotDependencyAction_0_2()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2906:1: ()
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2908:1: 
            {
            }

             after(grammarAccess.getCheckNotAccess().getNotDependencyAction_0_2()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckNot__Group_0__2__Impl"


    // $ANTLR start "rule__Bottom__Group_1__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2924:1: rule__Bottom__Group_1__0 : rule__Bottom__Group_1__0__Impl rule__Bottom__Group_1__1 ;
    public final void rule__Bottom__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2928:1: ( rule__Bottom__Group_1__0__Impl rule__Bottom__Group_1__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2929:2: rule__Bottom__Group_1__0__Impl rule__Bottom__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Bottom__Group_1__0__Impl_in_rule__Bottom__Group_1__05835);
            rule__Bottom__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Bottom__Group_1__1_in_rule__Bottom__Group_1__05838);
            rule__Bottom__Group_1__1();

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
    // $ANTLR end "rule__Bottom__Group_1__0"


    // $ANTLR start "rule__Bottom__Group_1__0__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2936:1: rule__Bottom__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Bottom__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2940:1: ( ( '(' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2941:1: ( '(' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2941:1: ( '(' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2942:1: '('
            {
             before(grammarAccess.getBottomAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Bottom__Group_1__0__Impl5866); 
             after(grammarAccess.getBottomAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bottom__Group_1__0__Impl"


    // $ANTLR start "rule__Bottom__Group_1__1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2955:1: rule__Bottom__Group_1__1 : rule__Bottom__Group_1__1__Impl rule__Bottom__Group_1__2 ;
    public final void rule__Bottom__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2959:1: ( rule__Bottom__Group_1__1__Impl rule__Bottom__Group_1__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2960:2: rule__Bottom__Group_1__1__Impl rule__Bottom__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Bottom__Group_1__1__Impl_in_rule__Bottom__Group_1__15897);
            rule__Bottom__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Bottom__Group_1__2_in_rule__Bottom__Group_1__15900);
            rule__Bottom__Group_1__2();

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
    // $ANTLR end "rule__Bottom__Group_1__1"


    // $ANTLR start "rule__Bottom__Group_1__1__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2967:1: rule__Bottom__Group_1__1__Impl : ( ruleDependency ) ;
    public final void rule__Bottom__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2971:1: ( ( ruleDependency ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2972:1: ( ruleDependency )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2972:1: ( ruleDependency )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2973:1: ruleDependency
            {
             before(grammarAccess.getBottomAccess().getDependencyParserRuleCall_1_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_rule__Bottom__Group_1__1__Impl5927);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getBottomAccess().getDependencyParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bottom__Group_1__1__Impl"


    // $ANTLR start "rule__Bottom__Group_1__2"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2984:1: rule__Bottom__Group_1__2 : rule__Bottom__Group_1__2__Impl ;
    public final void rule__Bottom__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2988:1: ( rule__Bottom__Group_1__2__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2989:2: rule__Bottom__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Bottom__Group_1__2__Impl_in_rule__Bottom__Group_1__25956);
            rule__Bottom__Group_1__2__Impl();

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
    // $ANTLR end "rule__Bottom__Group_1__2"


    // $ANTLR start "rule__Bottom__Group_1__2__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2995:1: rule__Bottom__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Bottom__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2999:1: ( ( ')' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3000:1: ( ')' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3000:1: ( ')' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3001:1: ')'
            {
             before(grammarAccess.getBottomAccess().getRightParenthesisKeyword_1_2()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Bottom__Group_1__2__Impl5984); 
             after(grammarAccess.getBottomAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bottom__Group_1__2__Impl"


    // $ANTLR start "rule__ChoiceAnswer__Group__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3020:1: rule__ChoiceAnswer__Group__0 : rule__ChoiceAnswer__Group__0__Impl rule__ChoiceAnswer__Group__1 ;
    public final void rule__ChoiceAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3024:1: ( rule__ChoiceAnswer__Group__0__Impl rule__ChoiceAnswer__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3025:2: rule__ChoiceAnswer__Group__0__Impl rule__ChoiceAnswer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__Group__0__Impl_in_rule__ChoiceAnswer__Group__06021);
            rule__ChoiceAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__Group__1_in_rule__ChoiceAnswer__Group__06024);
            rule__ChoiceAnswer__Group__1();

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
    // $ANTLR end "rule__ChoiceAnswer__Group__0"


    // $ANTLR start "rule__ChoiceAnswer__Group__0__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3032:1: rule__ChoiceAnswer__Group__0__Impl : ( 'answer choice' ) ;
    public final void rule__ChoiceAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3036:1: ( ( 'answer choice' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3037:1: ( 'answer choice' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3037:1: ( 'answer choice' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3038:1: 'answer choice'
            {
             before(grammarAccess.getChoiceAnswerAccess().getAnswerChoiceKeyword_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__ChoiceAnswer__Group__0__Impl6052); 
             after(grammarAccess.getChoiceAnswerAccess().getAnswerChoiceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceAnswer__Group__0__Impl"


    // $ANTLR start "rule__ChoiceAnswer__Group__1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3051:1: rule__ChoiceAnswer__Group__1 : rule__ChoiceAnswer__Group__1__Impl rule__ChoiceAnswer__Group__2 ;
    public final void rule__ChoiceAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3055:1: ( rule__ChoiceAnswer__Group__1__Impl rule__ChoiceAnswer__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3056:2: rule__ChoiceAnswer__Group__1__Impl rule__ChoiceAnswer__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__Group__1__Impl_in_rule__ChoiceAnswer__Group__16083);
            rule__ChoiceAnswer__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__Group__2_in_rule__ChoiceAnswer__Group__16086);
            rule__ChoiceAnswer__Group__2();

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
    // $ANTLR end "rule__ChoiceAnswer__Group__1"


    // $ANTLR start "rule__ChoiceAnswer__Group__1__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3063:1: rule__ChoiceAnswer__Group__1__Impl : ( ( rule__ChoiceAnswer__NameAssignment_1 ) ) ;
    public final void rule__ChoiceAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3067:1: ( ( ( rule__ChoiceAnswer__NameAssignment_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3068:1: ( ( rule__ChoiceAnswer__NameAssignment_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3068:1: ( ( rule__ChoiceAnswer__NameAssignment_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3069:1: ( rule__ChoiceAnswer__NameAssignment_1 )
            {
             before(grammarAccess.getChoiceAnswerAccess().getNameAssignment_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3070:1: ( rule__ChoiceAnswer__NameAssignment_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3070:2: rule__ChoiceAnswer__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__NameAssignment_1_in_rule__ChoiceAnswer__Group__1__Impl6113);
            rule__ChoiceAnswer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAnswerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceAnswer__Group__1__Impl"


    // $ANTLR start "rule__ChoiceAnswer__Group__2"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3080:1: rule__ChoiceAnswer__Group__2 : rule__ChoiceAnswer__Group__2__Impl rule__ChoiceAnswer__Group__3 ;
    public final void rule__ChoiceAnswer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3084:1: ( rule__ChoiceAnswer__Group__2__Impl rule__ChoiceAnswer__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3085:2: rule__ChoiceAnswer__Group__2__Impl rule__ChoiceAnswer__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__Group__2__Impl_in_rule__ChoiceAnswer__Group__26143);
            rule__ChoiceAnswer__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__Group__3_in_rule__ChoiceAnswer__Group__26146);
            rule__ChoiceAnswer__Group__3();

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
    // $ANTLR end "rule__ChoiceAnswer__Group__2"


    // $ANTLR start "rule__ChoiceAnswer__Group__2__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3092:1: rule__ChoiceAnswer__Group__2__Impl : ( ':' ) ;
    public final void rule__ChoiceAnswer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3096:1: ( ( ':' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3097:1: ( ':' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3097:1: ( ':' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3098:1: ':'
            {
             before(grammarAccess.getChoiceAnswerAccess().getColonKeyword_2()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__ChoiceAnswer__Group__2__Impl6174); 
             after(grammarAccess.getChoiceAnswerAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceAnswer__Group__2__Impl"


    // $ANTLR start "rule__ChoiceAnswer__Group__3"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3111:1: rule__ChoiceAnswer__Group__3 : rule__ChoiceAnswer__Group__3__Impl ;
    public final void rule__ChoiceAnswer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3115:1: ( rule__ChoiceAnswer__Group__3__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3116:2: rule__ChoiceAnswer__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__Group__3__Impl_in_rule__ChoiceAnswer__Group__36205);
            rule__ChoiceAnswer__Group__3__Impl();

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
    // $ANTLR end "rule__ChoiceAnswer__Group__3"


    // $ANTLR start "rule__ChoiceAnswer__Group__3__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3122:1: rule__ChoiceAnswer__Group__3__Impl : ( ( rule__ChoiceAnswer__TextAssignment_3 ) ) ;
    public final void rule__ChoiceAnswer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3126:1: ( ( ( rule__ChoiceAnswer__TextAssignment_3 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3127:1: ( ( rule__ChoiceAnswer__TextAssignment_3 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3127:1: ( ( rule__ChoiceAnswer__TextAssignment_3 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3128:1: ( rule__ChoiceAnswer__TextAssignment_3 )
            {
             before(grammarAccess.getChoiceAnswerAccess().getTextAssignment_3()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3129:1: ( rule__ChoiceAnswer__TextAssignment_3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3129:2: rule__ChoiceAnswer__TextAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__TextAssignment_3_in_rule__ChoiceAnswer__Group__3__Impl6232);
            rule__ChoiceAnswer__TextAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAnswerAccess().getTextAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceAnswer__Group__3__Impl"


    // $ANTLR start "rule__FreetextAnswer__Group__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3147:1: rule__FreetextAnswer__Group__0 : rule__FreetextAnswer__Group__0__Impl rule__FreetextAnswer__Group__1 ;
    public final void rule__FreetextAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3151:1: ( rule__FreetextAnswer__Group__0__Impl rule__FreetextAnswer__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3152:2: rule__FreetextAnswer__Group__0__Impl rule__FreetextAnswer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__0__Impl_in_rule__FreetextAnswer__Group__06270);
            rule__FreetextAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__1_in_rule__FreetextAnswer__Group__06273);
            rule__FreetextAnswer__Group__1();

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
    // $ANTLR end "rule__FreetextAnswer__Group__0"


    // $ANTLR start "rule__FreetextAnswer__Group__0__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3159:1: rule__FreetextAnswer__Group__0__Impl : ( 'answer text' ) ;
    public final void rule__FreetextAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3163:1: ( ( 'answer text' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3164:1: ( 'answer text' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3164:1: ( 'answer text' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3165:1: 'answer text'
            {
             before(grammarAccess.getFreetextAnswerAccess().getAnswerTextKeyword_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__FreetextAnswer__Group__0__Impl6301); 
             after(grammarAccess.getFreetextAnswerAccess().getAnswerTextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreetextAnswer__Group__0__Impl"


    // $ANTLR start "rule__FreetextAnswer__Group__1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3178:1: rule__FreetextAnswer__Group__1 : rule__FreetextAnswer__Group__1__Impl rule__FreetextAnswer__Group__2 ;
    public final void rule__FreetextAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3182:1: ( rule__FreetextAnswer__Group__1__Impl rule__FreetextAnswer__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3183:2: rule__FreetextAnswer__Group__1__Impl rule__FreetextAnswer__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__1__Impl_in_rule__FreetextAnswer__Group__16332);
            rule__FreetextAnswer__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__2_in_rule__FreetextAnswer__Group__16335);
            rule__FreetextAnswer__Group__2();

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
    // $ANTLR end "rule__FreetextAnswer__Group__1"


    // $ANTLR start "rule__FreetextAnswer__Group__1__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3190:1: rule__FreetextAnswer__Group__1__Impl : ( ( rule__FreetextAnswer__NameAssignment_1 ) ) ;
    public final void rule__FreetextAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3194:1: ( ( ( rule__FreetextAnswer__NameAssignment_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3195:1: ( ( rule__FreetextAnswer__NameAssignment_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3195:1: ( ( rule__FreetextAnswer__NameAssignment_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3196:1: ( rule__FreetextAnswer__NameAssignment_1 )
            {
             before(grammarAccess.getFreetextAnswerAccess().getNameAssignment_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3197:1: ( rule__FreetextAnswer__NameAssignment_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3197:2: rule__FreetextAnswer__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__NameAssignment_1_in_rule__FreetextAnswer__Group__1__Impl6362);
            rule__FreetextAnswer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFreetextAnswerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreetextAnswer__Group__1__Impl"


    // $ANTLR start "rule__FreetextAnswer__Group__2"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3207:1: rule__FreetextAnswer__Group__2 : rule__FreetextAnswer__Group__2__Impl rule__FreetextAnswer__Group__3 ;
    public final void rule__FreetextAnswer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3211:1: ( rule__FreetextAnswer__Group__2__Impl rule__FreetextAnswer__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3212:2: rule__FreetextAnswer__Group__2__Impl rule__FreetextAnswer__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__2__Impl_in_rule__FreetextAnswer__Group__26392);
            rule__FreetextAnswer__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__3_in_rule__FreetextAnswer__Group__26395);
            rule__FreetextAnswer__Group__3();

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
    // $ANTLR end "rule__FreetextAnswer__Group__2"


    // $ANTLR start "rule__FreetextAnswer__Group__2__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3219:1: rule__FreetextAnswer__Group__2__Impl : ( ':' ) ;
    public final void rule__FreetextAnswer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3223:1: ( ( ':' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3224:1: ( ':' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3224:1: ( ':' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3225:1: ':'
            {
             before(grammarAccess.getFreetextAnswerAccess().getColonKeyword_2()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__FreetextAnswer__Group__2__Impl6423); 
             after(grammarAccess.getFreetextAnswerAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreetextAnswer__Group__2__Impl"


    // $ANTLR start "rule__FreetextAnswer__Group__3"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3238:1: rule__FreetextAnswer__Group__3 : rule__FreetextAnswer__Group__3__Impl ;
    public final void rule__FreetextAnswer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3242:1: ( rule__FreetextAnswer__Group__3__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3243:2: rule__FreetextAnswer__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__3__Impl_in_rule__FreetextAnswer__Group__36454);
            rule__FreetextAnswer__Group__3__Impl();

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
    // $ANTLR end "rule__FreetextAnswer__Group__3"


    // $ANTLR start "rule__FreetextAnswer__Group__3__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3249:1: rule__FreetextAnswer__Group__3__Impl : ( ( rule__FreetextAnswer__TextAssignment_3 ) ) ;
    public final void rule__FreetextAnswer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3253:1: ( ( ( rule__FreetextAnswer__TextAssignment_3 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3254:1: ( ( rule__FreetextAnswer__TextAssignment_3 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3254:1: ( ( rule__FreetextAnswer__TextAssignment_3 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3255:1: ( rule__FreetextAnswer__TextAssignment_3 )
            {
             before(grammarAccess.getFreetextAnswerAccess().getTextAssignment_3()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3256:1: ( rule__FreetextAnswer__TextAssignment_3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3256:2: rule__FreetextAnswer__TextAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__TextAssignment_3_in_rule__FreetextAnswer__Group__3__Impl6481);
            rule__FreetextAnswer__TextAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFreetextAnswerAccess().getTextAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreetextAnswer__Group__3__Impl"


    // $ANTLR start "rule__Survey__TitleAssignment_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3275:1: rule__Survey__TitleAssignment_1 : ( ruleEString ) ;
    public final void rule__Survey__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3279:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3280:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3280:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3281:1: ruleEString
            {
             before(grammarAccess.getSurveyAccess().getTitleEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Survey__TitleAssignment_16524);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getTitleEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__TitleAssignment_1"


    // $ANTLR start "rule__Survey__PagesAssignment_3"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3290:1: rule__Survey__PagesAssignment_3 : ( rulePage ) ;
    public final void rule__Survey__PagesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3294:1: ( ( rulePage ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3295:1: ( rulePage )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3295:1: ( rulePage )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3296:1: rulePage
            {
             before(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePage_in_rule__Survey__PagesAssignment_36555);
            rulePage();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__PagesAssignment_3"


    // $ANTLR start "rule__Survey__PagesAssignment_4"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3305:1: rule__Survey__PagesAssignment_4 : ( rulePage ) ;
    public final void rule__Survey__PagesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3309:1: ( ( rulePage ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3310:1: ( rulePage )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3310:1: ( rulePage )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3311:1: rulePage
            {
             before(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePage_in_rule__Survey__PagesAssignment_46586);
            rulePage();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__PagesAssignment_4"


    // $ANTLR start "rule__QuestionPage__TitleAssignment_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3320:1: rule__QuestionPage__TitleAssignment_1 : ( ruleEString ) ;
    public final void rule__QuestionPage__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3324:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3325:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3325:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3326:1: ruleEString
            {
             before(grammarAccess.getQuestionPageAccess().getTitleEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__QuestionPage__TitleAssignment_16617);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionPageAccess().getTitleEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionPage__TitleAssignment_1"


    // $ANTLR start "rule__QuestionPage__TextAssignment_2_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3335:1: rule__QuestionPage__TextAssignment_2_1 : ( ruleEString ) ;
    public final void rule__QuestionPage__TextAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3339:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3340:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3340:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3341:1: ruleEString
            {
             before(grammarAccess.getQuestionPageAccess().getTextEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__QuestionPage__TextAssignment_2_16648);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionPageAccess().getTextEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionPage__TextAssignment_2_1"


    // $ANTLR start "rule__QuestionPage__QuestionsAssignment_4"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3350:1: rule__QuestionPage__QuestionsAssignment_4 : ( ruleQuestion ) ;
    public final void rule__QuestionPage__QuestionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3354:1: ( ( ruleQuestion ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3355:1: ( ruleQuestion )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3355:1: ( ruleQuestion )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3356:1: ruleQuestion
            {
             before(grammarAccess.getQuestionPageAccess().getQuestionsQuestionParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__QuestionPage__QuestionsAssignment_46679);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionPageAccess().getQuestionsQuestionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionPage__QuestionsAssignment_4"


    // $ANTLR start "rule__QuestionPage__QuestionsAssignment_5"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3365:1: rule__QuestionPage__QuestionsAssignment_5 : ( ruleQuestion ) ;
    public final void rule__QuestionPage__QuestionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3369:1: ( ( ruleQuestion ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3370:1: ( ruleQuestion )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3370:1: ( ruleQuestion )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3371:1: ruleQuestion
            {
             before(grammarAccess.getQuestionPageAccess().getQuestionsQuestionParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__QuestionPage__QuestionsAssignment_56710);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionPageAccess().getQuestionsQuestionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionPage__QuestionsAssignment_5"


    // $ANTLR start "rule__DescriptionPage__TitleAssignment_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3380:1: rule__DescriptionPage__TitleAssignment_1 : ( ruleEString ) ;
    public final void rule__DescriptionPage__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3384:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3385:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3385:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3386:1: ruleEString
            {
             before(grammarAccess.getDescriptionPageAccess().getTitleEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__DescriptionPage__TitleAssignment_16741);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDescriptionPageAccess().getTitleEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionPage__TitleAssignment_1"


    // $ANTLR start "rule__DescriptionPage__TextAssignment_2_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3395:1: rule__DescriptionPage__TextAssignment_2_1 : ( ruleEString ) ;
    public final void rule__DescriptionPage__TextAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3399:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3400:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3400:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3401:1: ruleEString
            {
             before(grammarAccess.getDescriptionPageAccess().getTextEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__DescriptionPage__TextAssignment_2_16772);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDescriptionPageAccess().getTextEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionPage__TextAssignment_2_1"


    // $ANTLR start "rule__ResultPage__TitleAssignment_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3410:1: rule__ResultPage__TitleAssignment_1 : ( ruleEString ) ;
    public final void rule__ResultPage__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3414:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3415:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3415:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3416:1: ruleEString
            {
             before(grammarAccess.getResultPageAccess().getTitleEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ResultPage__TitleAssignment_16803);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getResultPageAccess().getTitleEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultPage__TitleAssignment_1"


    // $ANTLR start "rule__ResultPage__TextAssignment_2_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3425:1: rule__ResultPage__TextAssignment_2_1 : ( ruleEString ) ;
    public final void rule__ResultPage__TextAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3429:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3430:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3430:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3431:1: ruleEString
            {
             before(grammarAccess.getResultPageAccess().getTextEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ResultPage__TextAssignment_2_16834);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getResultPageAccess().getTextEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultPage__TextAssignment_2_1"


    // $ANTLR start "rule__FreetextQuestion__OptionalAssignment_0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3440:1: rule__FreetextQuestion__OptionalAssignment_0 : ( ( 'optional' ) ) ;
    public final void rule__FreetextQuestion__OptionalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3444:1: ( ( ( 'optional' ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3445:1: ( ( 'optional' ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3445:1: ( ( 'optional' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3446:1: ( 'optional' )
            {
             before(grammarAccess.getFreetextQuestionAccess().getOptionalOptionalKeyword_0_0()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3447:1: ( 'optional' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3448:1: 'optional'
            {
             before(grammarAccess.getFreetextQuestionAccess().getOptionalOptionalKeyword_0_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__FreetextQuestion__OptionalAssignment_06870); 
             after(grammarAccess.getFreetextQuestionAccess().getOptionalOptionalKeyword_0_0()); 

            }

             after(grammarAccess.getFreetextQuestionAccess().getOptionalOptionalKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreetextQuestion__OptionalAssignment_0"


    // $ANTLR start "rule__FreetextQuestion__TextAssignment_2"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3463:1: rule__FreetextQuestion__TextAssignment_2 : ( ruleEString ) ;
    public final void rule__FreetextQuestion__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3467:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3468:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3468:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3469:1: ruleEString
            {
             before(grammarAccess.getFreetextQuestionAccess().getTextEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__FreetextQuestion__TextAssignment_26909);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFreetextQuestionAccess().getTextEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreetextQuestion__TextAssignment_2"


    // $ANTLR start "rule__FreetextQuestion__RequiresAssignment_3_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3478:1: rule__FreetextQuestion__RequiresAssignment_3_1 : ( ruleDependency ) ;
    public final void rule__FreetextQuestion__RequiresAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3482:1: ( ( ruleDependency ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3483:1: ( ruleDependency )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3483:1: ( ruleDependency )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3484:1: ruleDependency
            {
             before(grammarAccess.getFreetextQuestionAccess().getRequiresDependencyParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_rule__FreetextQuestion__RequiresAssignment_3_16940);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getFreetextQuestionAccess().getRequiresDependencyParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreetextQuestion__RequiresAssignment_3_1"


    // $ANTLR start "rule__FreetextQuestion__AnswersAssignment_5"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3493:1: rule__FreetextQuestion__AnswersAssignment_5 : ( ruleFreetextAnswer ) ;
    public final void rule__FreetextQuestion__AnswersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3497:1: ( ( ruleFreetextAnswer ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3498:1: ( ruleFreetextAnswer )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3498:1: ( ruleFreetextAnswer )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3499:1: ruleFreetextAnswer
            {
             before(grammarAccess.getFreetextQuestionAccess().getAnswersFreetextAnswerParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFreetextAnswer_in_rule__FreetextQuestion__AnswersAssignment_56971);
            ruleFreetextAnswer();

            state._fsp--;

             after(grammarAccess.getFreetextQuestionAccess().getAnswersFreetextAnswerParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreetextQuestion__AnswersAssignment_5"


    // $ANTLR start "rule__SingleChoiceQuestion__OptionalAssignment_0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3508:1: rule__SingleChoiceQuestion__OptionalAssignment_0 : ( ( 'optional' ) ) ;
    public final void rule__SingleChoiceQuestion__OptionalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3512:1: ( ( ( 'optional' ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3513:1: ( ( 'optional' ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3513:1: ( ( 'optional' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3514:1: ( 'optional' )
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getOptionalOptionalKeyword_0_0()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3515:1: ( 'optional' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3516:1: 'optional'
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getOptionalOptionalKeyword_0_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__SingleChoiceQuestion__OptionalAssignment_07007); 
             after(grammarAccess.getSingleChoiceQuestionAccess().getOptionalOptionalKeyword_0_0()); 

            }

             after(grammarAccess.getSingleChoiceQuestionAccess().getOptionalOptionalKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoiceQuestion__OptionalAssignment_0"


    // $ANTLR start "rule__SingleChoiceQuestion__TextAssignment_2"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3531:1: rule__SingleChoiceQuestion__TextAssignment_2 : ( ruleEString ) ;
    public final void rule__SingleChoiceQuestion__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3535:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3536:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3536:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3537:1: ruleEString
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getTextEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SingleChoiceQuestion__TextAssignment_27046);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSingleChoiceQuestionAccess().getTextEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoiceQuestion__TextAssignment_2"


    // $ANTLR start "rule__SingleChoiceQuestion__RequiresAssignment_3_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3546:1: rule__SingleChoiceQuestion__RequiresAssignment_3_1 : ( ruleDependency ) ;
    public final void rule__SingleChoiceQuestion__RequiresAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3550:1: ( ( ruleDependency ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3551:1: ( ruleDependency )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3551:1: ( ruleDependency )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3552:1: ruleDependency
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getRequiresDependencyParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_rule__SingleChoiceQuestion__RequiresAssignment_3_17077);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getSingleChoiceQuestionAccess().getRequiresDependencyParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoiceQuestion__RequiresAssignment_3_1"


    // $ANTLR start "rule__SingleChoiceQuestion__AnswersAssignment_5"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3561:1: rule__SingleChoiceQuestion__AnswersAssignment_5 : ( ruleAnswer ) ;
    public final void rule__SingleChoiceQuestion__AnswersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3565:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3566:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3566:1: ( ruleAnswer )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3567:1: ruleAnswer
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getAnswersAnswerParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__SingleChoiceQuestion__AnswersAssignment_57108);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getSingleChoiceQuestionAccess().getAnswersAnswerParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoiceQuestion__AnswersAssignment_5"


    // $ANTLR start "rule__SingleChoiceQuestion__AnswersAssignment_6"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3576:1: rule__SingleChoiceQuestion__AnswersAssignment_6 : ( ruleAnswer ) ;
    public final void rule__SingleChoiceQuestion__AnswersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3580:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3581:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3581:1: ( ruleAnswer )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3582:1: ruleAnswer
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getAnswersAnswerParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__SingleChoiceQuestion__AnswersAssignment_67139);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getSingleChoiceQuestionAccess().getAnswersAnswerParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoiceQuestion__AnswersAssignment_6"


    // $ANTLR start "rule__MultiChoiceQuestion__OptionalAssignment_0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3591:1: rule__MultiChoiceQuestion__OptionalAssignment_0 : ( ( 'optional' ) ) ;
    public final void rule__MultiChoiceQuestion__OptionalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3595:1: ( ( ( 'optional' ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3596:1: ( ( 'optional' ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3596:1: ( ( 'optional' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3597:1: ( 'optional' )
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getOptionalOptionalKeyword_0_0()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3598:1: ( 'optional' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3599:1: 'optional'
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getOptionalOptionalKeyword_0_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__MultiChoiceQuestion__OptionalAssignment_07175); 
             after(grammarAccess.getMultiChoiceQuestionAccess().getOptionalOptionalKeyword_0_0()); 

            }

             after(grammarAccess.getMultiChoiceQuestionAccess().getOptionalOptionalKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceQuestion__OptionalAssignment_0"


    // $ANTLR start "rule__MultiChoiceQuestion__TextAssignment_2"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3614:1: rule__MultiChoiceQuestion__TextAssignment_2 : ( ruleEString ) ;
    public final void rule__MultiChoiceQuestion__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3618:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3619:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3619:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3620:1: ruleEString
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getTextEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MultiChoiceQuestion__TextAssignment_27214);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMultiChoiceQuestionAccess().getTextEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceQuestion__TextAssignment_2"


    // $ANTLR start "rule__MultiChoiceQuestion__RequiresAssignment_3_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3629:1: rule__MultiChoiceQuestion__RequiresAssignment_3_1 : ( ruleDependency ) ;
    public final void rule__MultiChoiceQuestion__RequiresAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3633:1: ( ( ruleDependency ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3634:1: ( ruleDependency )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3634:1: ( ruleDependency )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3635:1: ruleDependency
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getRequiresDependencyParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_rule__MultiChoiceQuestion__RequiresAssignment_3_17245);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getMultiChoiceQuestionAccess().getRequiresDependencyParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceQuestion__RequiresAssignment_3_1"


    // $ANTLR start "rule__MultiChoiceQuestion__AnswersAssignment_5"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3644:1: rule__MultiChoiceQuestion__AnswersAssignment_5 : ( ruleAnswer ) ;
    public final void rule__MultiChoiceQuestion__AnswersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3648:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3649:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3649:1: ( ruleAnswer )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3650:1: ruleAnswer
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getAnswersAnswerParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__MultiChoiceQuestion__AnswersAssignment_57276);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getMultiChoiceQuestionAccess().getAnswersAnswerParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceQuestion__AnswersAssignment_5"


    // $ANTLR start "rule__MultiChoiceQuestion__AnswersAssignment_6"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3659:1: rule__MultiChoiceQuestion__AnswersAssignment_6 : ( ruleAnswer ) ;
    public final void rule__MultiChoiceQuestion__AnswersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3663:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3664:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3664:1: ( ruleAnswer )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3665:1: ruleAnswer
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getAnswersAnswerParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__MultiChoiceQuestion__AnswersAssignment_67307);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getMultiChoiceQuestionAccess().getAnswersAnswerParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceQuestion__AnswersAssignment_6"


    // $ANTLR start "rule__CheckOr__RhsAssignment_1_2"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3674:1: rule__CheckOr__RhsAssignment_1_2 : ( ruleCheckAnd ) ;
    public final void rule__CheckOr__RhsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3678:1: ( ( ruleCheckAnd ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3679:1: ( ruleCheckAnd )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3679:1: ( ruleCheckAnd )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3680:1: ruleCheckAnd
            {
             before(grammarAccess.getCheckOrAccess().getRhsCheckAndParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCheckAnd_in_rule__CheckOr__RhsAssignment_1_27338);
            ruleCheckAnd();

            state._fsp--;

             after(grammarAccess.getCheckOrAccess().getRhsCheckAndParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckOr__RhsAssignment_1_2"


    // $ANTLR start "rule__CheckAnd__RhsAssignment_1_2"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3689:1: rule__CheckAnd__RhsAssignment_1_2 : ( ruleCheckNot ) ;
    public final void rule__CheckAnd__RhsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3693:1: ( ( ruleCheckNot ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3694:1: ( ruleCheckNot )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3694:1: ( ruleCheckNot )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3695:1: ruleCheckNot
            {
             before(grammarAccess.getCheckAndAccess().getRhsCheckNotParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCheckNot_in_rule__CheckAnd__RhsAssignment_1_27369);
            ruleCheckNot();

            state._fsp--;

             after(grammarAccess.getCheckAndAccess().getRhsCheckNotParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckAnd__RhsAssignment_1_2"


    // $ANTLR start "rule__AnswerRef__RefersAssignment"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3704:1: rule__AnswerRef__RefersAssignment : ( ( ruleEString ) ) ;
    public final void rule__AnswerRef__RefersAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3708:1: ( ( ( ruleEString ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3709:1: ( ( ruleEString ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3709:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3710:1: ( ruleEString )
            {
             before(grammarAccess.getAnswerRefAccess().getRefersAnswerCrossReference_0()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3711:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3712:1: ruleEString
            {
             before(grammarAccess.getAnswerRefAccess().getRefersAnswerEStringParserRuleCall_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__AnswerRef__RefersAssignment7404);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAnswerRefAccess().getRefersAnswerEStringParserRuleCall_0_1()); 

            }

             after(grammarAccess.getAnswerRefAccess().getRefersAnswerCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnswerRef__RefersAssignment"


    // $ANTLR start "rule__ChoiceAnswer__NameAssignment_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3723:1: rule__ChoiceAnswer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ChoiceAnswer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3727:1: ( ( RULE_ID ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3728:1: ( RULE_ID )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3728:1: ( RULE_ID )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3729:1: RULE_ID
            {
             before(grammarAccess.getChoiceAnswerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ChoiceAnswer__NameAssignment_17439); 
             after(grammarAccess.getChoiceAnswerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceAnswer__NameAssignment_1"


    // $ANTLR start "rule__ChoiceAnswer__TextAssignment_3"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3738:1: rule__ChoiceAnswer__TextAssignment_3 : ( ruleEString ) ;
    public final void rule__ChoiceAnswer__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3742:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3743:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3743:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3744:1: ruleEString
            {
             before(grammarAccess.getChoiceAnswerAccess().getTextEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ChoiceAnswer__TextAssignment_37470);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getChoiceAnswerAccess().getTextEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceAnswer__TextAssignment_3"


    // $ANTLR start "rule__FreetextAnswer__NameAssignment_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3753:1: rule__FreetextAnswer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FreetextAnswer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3757:1: ( ( RULE_ID ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3758:1: ( RULE_ID )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3758:1: ( RULE_ID )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3759:1: RULE_ID
            {
             before(grammarAccess.getFreetextAnswerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__FreetextAnswer__NameAssignment_17501); 
             after(grammarAccess.getFreetextAnswerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreetextAnswer__NameAssignment_1"


    // $ANTLR start "rule__FreetextAnswer__TextAssignment_3"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3768:1: rule__FreetextAnswer__TextAssignment_3 : ( ruleEString ) ;
    public final void rule__FreetextAnswer__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3772:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3773:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3773:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3774:1: ruleEString
            {
             before(grammarAccess.getFreetextAnswerAccess().getTextEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__FreetextAnswer__TextAssignment_37532);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFreetextAnswerAccess().getTextEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreetextAnswer__TextAssignment_3"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSurvey_in_entryRuleSurvey61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSurvey68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__0_in_ruleSurvey94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePage_in_entryRulePage121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePage128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Alternatives_in_rulePage154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestion188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Alternatives_in_ruleQuestion214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDependency248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCheckOr_in_ruleDependency274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer300 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswer307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Alternatives_in_ruleAnswer333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString360 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestionPage_in_entryRuleQuestionPage420 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestionPage427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__0_in_ruleQuestionPage453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDescriptionPage_in_entryRuleDescriptionPage480 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDescriptionPage487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group__0_in_ruleDescriptionPage513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResultPage_in_entryRuleResultPage540 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleResultPage547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__Group__0_in_ruleResultPage573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFreetextQuestion_in_entryRuleFreetextQuestion602 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFreetextQuestion609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__0_in_ruleFreetextQuestion635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleChoiceQuestion_in_entryRuleSingleChoiceQuestion662 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleChoiceQuestion669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__0_in_ruleSingleChoiceQuestion695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiChoiceQuestion_in_entryRuleMultiChoiceQuestion722 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiChoiceQuestion729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__0_in_ruleMultiChoiceQuestion755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCheckOr_in_entryRuleCheckOr782 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCheckOr789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckOr__Group__0_in_ruleCheckOr815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCheckAnd_in_entryRuleCheckAnd842 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCheckAnd849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckAnd__Group__0_in_ruleCheckAnd875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCheckNot_in_entryRuleCheckNot902 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCheckNot909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckNot__Alternatives_in_ruleCheckNot935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBottom_in_entryRuleBottom962 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBottom969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Bottom__Alternatives_in_ruleBottom995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerRef_in_entryRuleAnswerRef1022 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswerRef1029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnswerRef__RefersAssignment_in_ruleAnswerRef1055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoiceAnswer_in_entryRuleChoiceAnswer1082 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleChoiceAnswer1089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__Group__0_in_ruleChoiceAnswer1115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFreetextAnswer_in_entryRuleFreetextAnswer1142 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFreetextAnswer1149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__0_in_ruleFreetextAnswer1175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestionPage_in_rule__Page__Alternatives1211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDescriptionPage_in_rule__Page__Alternatives1228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResultPage_in_rule__Page__Alternatives1245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFreetextQuestion_in_rule__Question__Alternatives1277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleChoiceQuestion_in_rule__Question__Alternatives1294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiChoiceQuestion_in_rule__Question__Alternatives1311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoiceAnswer_in_rule__Answer__Alternatives1343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFreetextAnswer_in_rule__Answer__Alternatives1360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckNot__Group_0__0_in_rule__CheckNot__Alternatives1442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBottom_in_rule__CheckNot__Alternatives1460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerRef_in_rule__Bottom__Alternatives1492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Bottom__Group_1__0_in_rule__Bottom__Alternatives1509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__0__Impl_in_rule__Survey__Group__01540 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Survey__Group__1_in_rule__Survey__Group__01543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Survey__Group__0__Impl1571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__1__Impl_in_rule__Survey__Group__11602 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Survey__Group__2_in_rule__Survey__Group__11605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__TitleAssignment_1_in_rule__Survey__Group__1__Impl1632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__2__Impl_in_rule__Survey__Group__21662 = new BitSet(new long[]{0x00000000000C4000L});
        public static final BitSet FOLLOW_rule__Survey__Group__3_in_rule__Survey__Group__21665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Survey__Group__2__Impl1693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__3__Impl_in_rule__Survey__Group__31724 = new BitSet(new long[]{0x00000000000C6000L});
        public static final BitSet FOLLOW_rule__Survey__Group__4_in_rule__Survey__Group__31727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__PagesAssignment_3_in_rule__Survey__Group__3__Impl1754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__4__Impl_in_rule__Survey__Group__41784 = new BitSet(new long[]{0x00000000000C6000L});
        public static final BitSet FOLLOW_rule__Survey__Group__5_in_rule__Survey__Group__41787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__PagesAssignment_4_in_rule__Survey__Group__4__Impl1814 = new BitSet(new long[]{0x00000000000C4002L});
        public static final BitSet FOLLOW_rule__Survey__Group__5__Impl_in_rule__Survey__Group__51845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Survey__Group__5__Impl1873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__0__Impl_in_rule__QuestionPage__Group__01916 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__1_in_rule__QuestionPage__Group__01919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__QuestionPage__Group__0__Impl1947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__1__Impl_in_rule__QuestionPage__Group__11978 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__2_in_rule__QuestionPage__Group__11981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__TitleAssignment_1_in_rule__QuestionPage__Group__1__Impl2008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__2__Impl_in_rule__QuestionPage__Group__22038 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__3_in_rule__QuestionPage__Group__22041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group_2__0_in_rule__QuestionPage__Group__2__Impl2068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__3__Impl_in_rule__QuestionPage__Group__32099 = new BitSet(new long[]{0x0000000203100000L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__4_in_rule__QuestionPage__Group__32102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__QuestionPage__Group__3__Impl2130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__4__Impl_in_rule__QuestionPage__Group__42161 = new BitSet(new long[]{0x0000000203110000L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__5_in_rule__QuestionPage__Group__42164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__QuestionsAssignment_4_in_rule__QuestionPage__Group__4__Impl2191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__5__Impl_in_rule__QuestionPage__Group__52221 = new BitSet(new long[]{0x0000000203110000L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__6_in_rule__QuestionPage__Group__52224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__QuestionsAssignment_5_in_rule__QuestionPage__Group__5__Impl2251 = new BitSet(new long[]{0x0000000203100002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__6__Impl_in_rule__QuestionPage__Group__62282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__QuestionPage__Group__6__Impl2310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group_2__0__Impl_in_rule__QuestionPage__Group_2__02355 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group_2__1_in_rule__QuestionPage__Group_2__02358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__QuestionPage__Group_2__0__Impl2386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group_2__1__Impl_in_rule__QuestionPage__Group_2__12417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__TextAssignment_2_1_in_rule__QuestionPage__Group_2__1__Impl2444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group__0__Impl_in_rule__DescriptionPage__Group__02478 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group__1_in_rule__DescriptionPage__Group__02481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__DescriptionPage__Group__0__Impl2509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group__1__Impl_in_rule__DescriptionPage__Group__12540 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group__2_in_rule__DescriptionPage__Group__12543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__TitleAssignment_1_in_rule__DescriptionPage__Group__1__Impl2570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group__2__Impl_in_rule__DescriptionPage__Group__22600 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group__3_in_rule__DescriptionPage__Group__22603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group_2__0_in_rule__DescriptionPage__Group__2__Impl2630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group__3__Impl_in_rule__DescriptionPage__Group__32661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__DescriptionPage__Group__3__Impl2689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group_2__0__Impl_in_rule__DescriptionPage__Group_2__02728 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group_2__1_in_rule__DescriptionPage__Group_2__02731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__DescriptionPage__Group_2__0__Impl2759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group_2__1__Impl_in_rule__DescriptionPage__Group_2__12790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__TextAssignment_2_1_in_rule__DescriptionPage__Group_2__1__Impl2817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__Group__0__Impl_in_rule__ResultPage__Group__02851 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ResultPage__Group__1_in_rule__ResultPage__Group__02854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__ResultPage__Group__0__Impl2882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__Group__1__Impl_in_rule__ResultPage__Group__12913 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__ResultPage__Group__2_in_rule__ResultPage__Group__12916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__TitleAssignment_1_in_rule__ResultPage__Group__1__Impl2943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__Group__2__Impl_in_rule__ResultPage__Group__22973 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__ResultPage__Group__3_in_rule__ResultPage__Group__22976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__Group_2__0_in_rule__ResultPage__Group__2__Impl3003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__Group__3__Impl_in_rule__ResultPage__Group__33034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__ResultPage__Group__3__Impl3062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__Group_2__0__Impl_in_rule__ResultPage__Group_2__03101 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ResultPage__Group_2__1_in_rule__ResultPage__Group_2__03104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__ResultPage__Group_2__0__Impl3132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__Group_2__1__Impl_in_rule__ResultPage__Group_2__13163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__TextAssignment_2_1_in_rule__ResultPage__Group_2__1__Impl3190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__0__Impl_in_rule__FreetextQuestion__Group__03224 = new BitSet(new long[]{0x0000000200100000L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__1_in_rule__FreetextQuestion__Group__03227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__OptionalAssignment_0_in_rule__FreetextQuestion__Group__0__Impl3254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__1__Impl_in_rule__FreetextQuestion__Group__13285 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__2_in_rule__FreetextQuestion__Group__13288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__FreetextQuestion__Group__1__Impl3316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__2__Impl_in_rule__FreetextQuestion__Group__23347 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__3_in_rule__FreetextQuestion__Group__23350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__TextAssignment_2_in_rule__FreetextQuestion__Group__2__Impl3377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__3__Impl_in_rule__FreetextQuestion__Group__33407 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__4_in_rule__FreetextQuestion__Group__33410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group_3__0_in_rule__FreetextQuestion__Group__3__Impl3437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__4__Impl_in_rule__FreetextQuestion__Group__43468 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__5_in_rule__FreetextQuestion__Group__43471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__FreetextQuestion__Group__4__Impl3499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__5__Impl_in_rule__FreetextQuestion__Group__53530 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__6_in_rule__FreetextQuestion__Group__53533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__AnswersAssignment_5_in_rule__FreetextQuestion__Group__5__Impl3560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__6__Impl_in_rule__FreetextQuestion__Group__63590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__FreetextQuestion__Group__6__Impl3618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group_3__0__Impl_in_rule__FreetextQuestion__Group_3__03663 = new BitSet(new long[]{0x0000000030000030L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group_3__1_in_rule__FreetextQuestion__Group_3__03666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__FreetextQuestion__Group_3__0__Impl3694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group_3__1__Impl_in_rule__FreetextQuestion__Group_3__13725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__RequiresAssignment_3_1_in_rule__FreetextQuestion__Group_3__1__Impl3752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__0__Impl_in_rule__SingleChoiceQuestion__Group__03786 = new BitSet(new long[]{0x0000000201000000L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__1_in_rule__SingleChoiceQuestion__Group__03789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__OptionalAssignment_0_in_rule__SingleChoiceQuestion__Group__0__Impl3816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__1__Impl_in_rule__SingleChoiceQuestion__Group__13847 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__2_in_rule__SingleChoiceQuestion__Group__13850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__SingleChoiceQuestion__Group__1__Impl3878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__2__Impl_in_rule__SingleChoiceQuestion__Group__23909 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__3_in_rule__SingleChoiceQuestion__Group__23912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__TextAssignment_2_in_rule__SingleChoiceQuestion__Group__2__Impl3939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__3__Impl_in_rule__SingleChoiceQuestion__Group__33969 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__4_in_rule__SingleChoiceQuestion__Group__33972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group_3__0_in_rule__SingleChoiceQuestion__Group__3__Impl3999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__4__Impl_in_rule__SingleChoiceQuestion__Group__44030 = new BitSet(new long[]{0x0000000180000000L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__5_in_rule__SingleChoiceQuestion__Group__44033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__SingleChoiceQuestion__Group__4__Impl4061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__5__Impl_in_rule__SingleChoiceQuestion__Group__54092 = new BitSet(new long[]{0x0000000180400000L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__6_in_rule__SingleChoiceQuestion__Group__54095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__AnswersAssignment_5_in_rule__SingleChoiceQuestion__Group__5__Impl4122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__6__Impl_in_rule__SingleChoiceQuestion__Group__64152 = new BitSet(new long[]{0x0000000180400000L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__7_in_rule__SingleChoiceQuestion__Group__64155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__AnswersAssignment_6_in_rule__SingleChoiceQuestion__Group__6__Impl4182 = new BitSet(new long[]{0x0000000180000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__7__Impl_in_rule__SingleChoiceQuestion__Group__74213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__SingleChoiceQuestion__Group__7__Impl4241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group_3__0__Impl_in_rule__SingleChoiceQuestion__Group_3__04288 = new BitSet(new long[]{0x0000000030000030L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group_3__1_in_rule__SingleChoiceQuestion__Group_3__04291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__SingleChoiceQuestion__Group_3__0__Impl4319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group_3__1__Impl_in_rule__SingleChoiceQuestion__Group_3__14350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__RequiresAssignment_3_1_in_rule__SingleChoiceQuestion__Group_3__1__Impl4377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__0__Impl_in_rule__MultiChoiceQuestion__Group__04411 = new BitSet(new long[]{0x0000000203100000L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__1_in_rule__MultiChoiceQuestion__Group__04414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__OptionalAssignment_0_in_rule__MultiChoiceQuestion__Group__0__Impl4441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__1__Impl_in_rule__MultiChoiceQuestion__Group__14472 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__2_in_rule__MultiChoiceQuestion__Group__14475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__MultiChoiceQuestion__Group__1__Impl4503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__2__Impl_in_rule__MultiChoiceQuestion__Group__24534 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__3_in_rule__MultiChoiceQuestion__Group__24537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__TextAssignment_2_in_rule__MultiChoiceQuestion__Group__2__Impl4564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__3__Impl_in_rule__MultiChoiceQuestion__Group__34594 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__4_in_rule__MultiChoiceQuestion__Group__34597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group_3__0_in_rule__MultiChoiceQuestion__Group__3__Impl4624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__4__Impl_in_rule__MultiChoiceQuestion__Group__44655 = new BitSet(new long[]{0x0000000180000000L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__5_in_rule__MultiChoiceQuestion__Group__44658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__MultiChoiceQuestion__Group__4__Impl4686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__5__Impl_in_rule__MultiChoiceQuestion__Group__54717 = new BitSet(new long[]{0x0000000180400000L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__6_in_rule__MultiChoiceQuestion__Group__54720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__AnswersAssignment_5_in_rule__MultiChoiceQuestion__Group__5__Impl4747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__6__Impl_in_rule__MultiChoiceQuestion__Group__64777 = new BitSet(new long[]{0x0000000180400000L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__7_in_rule__MultiChoiceQuestion__Group__64780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__AnswersAssignment_6_in_rule__MultiChoiceQuestion__Group__6__Impl4807 = new BitSet(new long[]{0x0000000180000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__7__Impl_in_rule__MultiChoiceQuestion__Group__74838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__MultiChoiceQuestion__Group__7__Impl4866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group_3__0__Impl_in_rule__MultiChoiceQuestion__Group_3__04913 = new BitSet(new long[]{0x0000000030000030L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group_3__1_in_rule__MultiChoiceQuestion__Group_3__04916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__MultiChoiceQuestion__Group_3__0__Impl4944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group_3__1__Impl_in_rule__MultiChoiceQuestion__Group_3__14975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__RequiresAssignment_3_1_in_rule__MultiChoiceQuestion__Group_3__1__Impl5002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckOr__Group__0__Impl_in_rule__CheckOr__Group__05036 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__CheckOr__Group__1_in_rule__CheckOr__Group__05039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCheckAnd_in_rule__CheckOr__Group__0__Impl5066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckOr__Group__1__Impl_in_rule__CheckOr__Group__15095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckOr__Group_1__0_in_rule__CheckOr__Group__1__Impl5122 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__CheckOr__Group_1__0__Impl_in_rule__CheckOr__Group_1__05157 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__CheckOr__Group_1__1_in_rule__CheckOr__Group_1__05160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckOr__Group_1__1__Impl_in_rule__CheckOr__Group_1__15218 = new BitSet(new long[]{0x0000000030000030L});
        public static final BitSet FOLLOW_rule__CheckOr__Group_1__2_in_rule__CheckOr__Group_1__15221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__CheckOr__Group_1__1__Impl5249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckOr__Group_1__2__Impl_in_rule__CheckOr__Group_1__25280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckOr__RhsAssignment_1_2_in_rule__CheckOr__Group_1__2__Impl5307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckAnd__Group__0__Impl_in_rule__CheckAnd__Group__05343 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__CheckAnd__Group__1_in_rule__CheckAnd__Group__05346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCheckNot_in_rule__CheckAnd__Group__0__Impl5373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckAnd__Group__1__Impl_in_rule__CheckAnd__Group__15402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckAnd__Group_1__0_in_rule__CheckAnd__Group__1__Impl5429 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__CheckAnd__Group_1__0__Impl_in_rule__CheckAnd__Group_1__05464 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__CheckAnd__Group_1__1_in_rule__CheckAnd__Group_1__05467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckAnd__Group_1__1__Impl_in_rule__CheckAnd__Group_1__15525 = new BitSet(new long[]{0x0000000030000030L});
        public static final BitSet FOLLOW_rule__CheckAnd__Group_1__2_in_rule__CheckAnd__Group_1__15528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__CheckAnd__Group_1__1__Impl5556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckAnd__Group_1__2__Impl_in_rule__CheckAnd__Group_1__25587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckAnd__RhsAssignment_1_2_in_rule__CheckAnd__Group_1__2__Impl5614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckNot__Group_0__0__Impl_in_rule__CheckNot__Group_0__05650 = new BitSet(new long[]{0x0000000030000030L});
        public static final BitSet FOLLOW_rule__CheckNot__Group_0__1_in_rule__CheckNot__Group_0__05653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__CheckNot__Group_0__0__Impl5681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckNot__Group_0__1__Impl_in_rule__CheckNot__Group_0__15712 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_rule__CheckNot__Group_0__2_in_rule__CheckNot__Group_0__15715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBottom_in_rule__CheckNot__Group_0__1__Impl5742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckNot__Group_0__2__Impl_in_rule__CheckNot__Group_0__25771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Bottom__Group_1__0__Impl_in_rule__Bottom__Group_1__05835 = new BitSet(new long[]{0x0000000030000030L});
        public static final BitSet FOLLOW_rule__Bottom__Group_1__1_in_rule__Bottom__Group_1__05838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Bottom__Group_1__0__Impl5866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Bottom__Group_1__1__Impl_in_rule__Bottom__Group_1__15897 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Bottom__Group_1__2_in_rule__Bottom__Group_1__15900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_rule__Bottom__Group_1__1__Impl5927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Bottom__Group_1__2__Impl_in_rule__Bottom__Group_1__25956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Bottom__Group_1__2__Impl5984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__Group__0__Impl_in_rule__ChoiceAnswer__Group__06021 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__Group__1_in_rule__ChoiceAnswer__Group__06024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__ChoiceAnswer__Group__0__Impl6052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__Group__1__Impl_in_rule__ChoiceAnswer__Group__16083 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__Group__2_in_rule__ChoiceAnswer__Group__16086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__NameAssignment_1_in_rule__ChoiceAnswer__Group__1__Impl6113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__Group__2__Impl_in_rule__ChoiceAnswer__Group__26143 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__Group__3_in_rule__ChoiceAnswer__Group__26146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__ChoiceAnswer__Group__2__Impl6174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__Group__3__Impl_in_rule__ChoiceAnswer__Group__36205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__TextAssignment_3_in_rule__ChoiceAnswer__Group__3__Impl6232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__0__Impl_in_rule__FreetextAnswer__Group__06270 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__1_in_rule__FreetextAnswer__Group__06273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__FreetextAnswer__Group__0__Impl6301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__1__Impl_in_rule__FreetextAnswer__Group__16332 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__2_in_rule__FreetextAnswer__Group__16335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__NameAssignment_1_in_rule__FreetextAnswer__Group__1__Impl6362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__2__Impl_in_rule__FreetextAnswer__Group__26392 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__3_in_rule__FreetextAnswer__Group__26395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__FreetextAnswer__Group__2__Impl6423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__3__Impl_in_rule__FreetextAnswer__Group__36454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__TextAssignment_3_in_rule__FreetextAnswer__Group__3__Impl6481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Survey__TitleAssignment_16524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePage_in_rule__Survey__PagesAssignment_36555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePage_in_rule__Survey__PagesAssignment_46586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__QuestionPage__TitleAssignment_16617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__QuestionPage__TextAssignment_2_16648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__QuestionPage__QuestionsAssignment_46679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__QuestionPage__QuestionsAssignment_56710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__DescriptionPage__TitleAssignment_16741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__DescriptionPage__TextAssignment_2_16772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ResultPage__TitleAssignment_16803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ResultPage__TextAssignment_2_16834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__FreetextQuestion__OptionalAssignment_06870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__FreetextQuestion__TextAssignment_26909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_rule__FreetextQuestion__RequiresAssignment_3_16940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFreetextAnswer_in_rule__FreetextQuestion__AnswersAssignment_56971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__SingleChoiceQuestion__OptionalAssignment_07007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SingleChoiceQuestion__TextAssignment_27046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_rule__SingleChoiceQuestion__RequiresAssignment_3_17077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__SingleChoiceQuestion__AnswersAssignment_57108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__SingleChoiceQuestion__AnswersAssignment_67139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__MultiChoiceQuestion__OptionalAssignment_07175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MultiChoiceQuestion__TextAssignment_27214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_rule__MultiChoiceQuestion__RequiresAssignment_3_17245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__MultiChoiceQuestion__AnswersAssignment_57276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__MultiChoiceQuestion__AnswersAssignment_67307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCheckAnd_in_rule__CheckOr__RhsAssignment_1_27338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCheckNot_in_rule__CheckAnd__RhsAssignment_1_27369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__AnswerRef__RefersAssignment7404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ChoiceAnswer__NameAssignment_17439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ChoiceAnswer__TextAssignment_37470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__FreetextAnswer__NameAssignment_17501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__FreetextAnswer__TextAssignment_37532 = new BitSet(new long[]{0x0000000000000002L});
    }


}